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
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("hi!", "hi!");
        java.lang.String str3 = textNode2.getWholeText();
        org.jsoup.nodes.Attributes attributes4 = textNode2.attributes();
        org.jsoup.nodes.Node node5 = textNode2.nextSibling();
        org.jsoup.nodes.Node node8 = textNode2.attr("i!", "hi!");
        java.lang.String str9 = node8.baseUri();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node11 = node8.wrap("h");
    }

    @Test
    public void test502() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test502");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("", "hi!");
        org.jsoup.nodes.Node node3 = textNode2.clone();
        org.jsoup.nodes.Node node4 = textNode2.nextSibling();
        java.lang.String str5 = textNode2.baseUri();
        org.jsoup.nodes.TextNode textNode7 = textNode2.text("");
        java.util.List<org.jsoup.nodes.Node> nodeList8 = textNode7.childNodes();
        boolean boolean9 = textNode7.isBlank();
        org.jsoup.nodes.TextNode textNode11 = textNode7.text("hi!");
        java.lang.String str12 = textNode7.nodeName();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node14 = textNode7.wrap("i!");
    }

    @Test
    public void test503() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test503");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("", "hi!");
        boolean boolean4 = textNode2.hasAttr("");
        textNode2.setBaseUri("#text");
        org.jsoup.nodes.TextNode textNode8 = textNode2.text("");
        org.jsoup.nodes.TextNode textNode10 = textNode8.text("#text");
        java.lang.String str11 = textNode8.text();
        java.lang.String str12 = textNode8.outerHtml();
        java.util.List<org.jsoup.nodes.Node> nodeList13 = textNode8.childNodes();
        org.jsoup.nodes.Node node14 = textNode8.previousSibling();
        java.lang.String str16 = textNode8.attr("i!");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node18 = textNode8.wrap("h");
    }

    @Test
    public void test504() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test504");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("", "");
        org.jsoup.nodes.Document document3 = textNode2.ownerDocument();
        org.jsoup.nodes.Node node6 = textNode2.attr("#text", "");
        java.util.List<org.jsoup.nodes.Node> nodeList7 = textNode2.siblingNodes();
        java.lang.String str9 = textNode2.attr("hi!");
        java.lang.String str10 = textNode2.outerHtml();
        java.util.List<org.jsoup.nodes.Node> nodeList11 = textNode2.siblingNodes();
        boolean boolean12 = textNode2.isBlank();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node14 = textNode2.wrap("hi!");
    }

    @Test
    public void test505() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test505");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("", "hi!");
        java.lang.String str4 = textNode2.absUrl("#text");
        org.jsoup.nodes.Node node6 = textNode2.removeAttr("#text");
        org.jsoup.nodes.Node node7 = node6.nextSibling();
        org.jsoup.nodes.Node node8 = node6.clone();
        java.util.List<org.jsoup.nodes.Node> nodeList9 = node8.childNodes();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node11 = node8.wrap("hi!");
    }

    @Test
    public void test506() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test506");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("hi!", "hi!");
        java.lang.String str3 = textNode2.getWholeText();
        org.jsoup.nodes.Attributes attributes4 = textNode2.attributes();
        boolean boolean5 = textNode2.isBlank();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node7 = textNode2.wrap("#text");
    }

    @Test
    public void test507() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test507");
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
        java.util.List<org.jsoup.nodes.Node> nodeList35 = textNode2.childNodes();
        java.lang.String str37 = textNode2.absUrl("hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList38 = textNode2.siblingNodes();
        org.jsoup.nodes.Node node41 = textNode2.attr("hi!", "i!");
        org.jsoup.nodes.Node node42 = node41.nextSibling();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node44 = node41.wrap("text");
    }

    @Test
    public void test508() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test508");
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
        java.lang.String str35 = textNode2.text();
        org.jsoup.nodes.Node node36 = textNode2.previousSibling();
        boolean boolean38 = textNode2.hasAttr("hi!");
        org.jsoup.nodes.Node node39 = textNode2.previousSibling();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node41 = textNode2.wrap("i!");
    }

    @Test
    public void test509() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test509");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("", "hi!");
        boolean boolean4 = textNode2.hasAttr("");
        textNode2.setBaseUri("#text");
        org.jsoup.nodes.TextNode textNode8 = textNode2.text("");
        org.jsoup.nodes.TextNode textNode10 = textNode8.text("#text");
        java.lang.String str11 = textNode8.text();
        java.lang.String str12 = textNode8.outerHtml();
        java.util.List<org.jsoup.nodes.Node> nodeList13 = textNode8.childNodes();
        java.lang.String str14 = textNode8.toString();
        java.lang.String str15 = textNode8.nodeName();
        org.jsoup.nodes.Document document16 = textNode8.ownerDocument();
        org.jsoup.nodes.Node node18 = textNode8.removeAttr("hi!");
        org.jsoup.nodes.Node node19 = textNode8.nextSibling();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node21 = textNode8.wrap("#");
    }

    @Test
    public void test510() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test510");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("", "hi!");
        java.lang.String str3 = textNode2.text();
        java.lang.String str4 = textNode2.nodeName();
        boolean boolean6 = textNode2.hasAttr("#text");
        org.jsoup.nodes.Document document7 = textNode2.ownerDocument();
        java.lang.String str8 = textNode2.getWholeText();
        java.lang.String str9 = textNode2.text();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node11 = textNode2.wrap("#");
    }

    @Test
    public void test511() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test511");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("", "");
        java.lang.String str3 = textNode2.outerHtml();
        java.lang.String str5 = textNode2.absUrl("hi!");
        boolean boolean7 = textNode2.hasAttr("");
        java.lang.String str8 = textNode2.outerHtml();
        int int9 = textNode2.siblingIndex();
        java.lang.String str10 = textNode2.toString();
        java.lang.String str12 = textNode2.absUrl("hi!");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node14 = textNode2.wrap("hi!");
    }

    @Test
    public void test512() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test512");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("", "hi!");
        org.jsoup.nodes.Node node3 = textNode2.nextSibling();
        boolean boolean4 = textNode2.isBlank();
        boolean boolean6 = textNode2.hasAttr("hi!");
        boolean boolean8 = textNode2.hasAttr("");
        java.lang.String str9 = textNode2.nodeName();
        java.util.List<org.jsoup.nodes.Node> nodeList10 = textNode2.siblingNodes();
        org.jsoup.nodes.TextNode textNode13 = new org.jsoup.nodes.TextNode("", "hi!");
        boolean boolean15 = textNode13.hasAttr("");
        java.util.List<org.jsoup.nodes.Node> nodeList16 = textNode13.childNodes();
        org.jsoup.nodes.Document document17 = textNode13.ownerDocument();
        java.lang.String str18 = textNode13.baseUri();
        java.lang.String str19 = textNode13.baseUri();
        boolean boolean20 = textNode2.equals((java.lang.Object) textNode13);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node22 = textNode2.wrap("i!");
    }

    @Test
    public void test513() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test513");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("", "hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList3 = textNode2.siblingNodes();
        java.lang.String str4 = textNode2.outerHtml();
        java.lang.String str5 = textNode2.getWholeText();
        java.util.List<org.jsoup.nodes.Node> nodeList6 = textNode2.siblingNodes();
        java.util.List<org.jsoup.nodes.Node> nodeList7 = textNode2.siblingNodes();
        java.util.List<org.jsoup.nodes.Node> nodeList8 = textNode2.siblingNodes();
        org.jsoup.nodes.Node node9 = textNode2.previousSibling();
        java.lang.String str10 = textNode2.nodeName();
        org.jsoup.nodes.Node node12 = textNode2.removeAttr("i!");
        boolean boolean13 = textNode2.isBlank();
        java.util.List<org.jsoup.nodes.Node> nodeList14 = textNode2.siblingNodes();
        boolean boolean16 = textNode2.hasAttr("");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node18 = textNode2.wrap("#");
    }

    @Test
    public void test514() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test514");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("", "hi!");
        boolean boolean4 = textNode2.hasAttr("");
        textNode2.setBaseUri("#text");
        org.jsoup.nodes.TextNode textNode8 = textNode2.text("");
        org.jsoup.nodes.TextNode textNode10 = textNode8.text("#text");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node12 = textNode8.wrap("i!");
    }

    @Test
    public void test515() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test515");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("", "hi!");
        boolean boolean4 = textNode2.hasAttr("");
        org.jsoup.nodes.TextNode textNode6 = textNode2.text("");
        textNode2.setBaseUri("hi!");
        org.jsoup.nodes.TextNode textNode11 = new org.jsoup.nodes.TextNode("#text", "");
        org.jsoup.nodes.Document document12 = textNode11.ownerDocument();
        java.util.List<org.jsoup.nodes.Node> nodeList13 = textNode11.childNodes();
        boolean boolean14 = textNode2.equals((java.lang.Object) textNode11);
        java.util.List<org.jsoup.nodes.Node> nodeList15 = textNode11.siblingNodes();
        java.lang.String str16 = textNode11.text();
        org.jsoup.nodes.TextNode textNode18 = textNode11.text("i!");
        java.lang.String str20 = textNode18.absUrl("hi!");
        java.lang.String str21 = textNode18.getWholeText();
        org.jsoup.nodes.Node node22 = textNode18.clone();
        java.lang.String str23 = node22.outerHtml();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node25 = node22.wrap("text");
    }

    @Test
    public void test516() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test516");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("hi!", "hi!");
        java.lang.String str3 = textNode2.nodeName();
        textNode2.setBaseUri("");
        java.lang.String str7 = textNode2.absUrl("hi!");
        java.lang.String str8 = textNode2.getWholeText();
        int int9 = textNode2.siblingIndex();
        java.lang.String str10 = textNode2.baseUri();
        textNode2.setBaseUri("");
        org.jsoup.nodes.Node node13 = textNode2.clone();
        java.util.List<org.jsoup.nodes.Node> nodeList14 = textNode2.siblingNodes();
        java.lang.String str15 = textNode2.nodeName();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node17 = textNode2.wrap("hi!");
    }

    @Test
    public void test517() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test517");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("", "hi!");
        org.jsoup.nodes.Node node3 = textNode2.clone();
        org.jsoup.nodes.Node node4 = textNode2.nextSibling();
        java.lang.String str5 = textNode2.baseUri();
        boolean boolean7 = textNode2.hasAttr("hi!");
        org.jsoup.nodes.Attributes attributes8 = textNode2.attributes();
        java.lang.String str9 = textNode2.baseUri();
        java.util.List<org.jsoup.nodes.Node> nodeList10 = textNode2.siblingNodes();
        textNode2.setBaseUri("hi!");
        org.jsoup.nodes.TextNode textNode14 = textNode2.text("");
        java.lang.String str15 = textNode2.baseUri();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node17 = textNode2.wrap("#text");
    }

    @Test
    public void test518() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test518");
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
        java.lang.String str28 = textNode2.attr("#text");
        org.jsoup.nodes.Node node30 = textNode2.removeAttr("hi!");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node32 = textNode2.wrap("h");
    }

    @Test
    public void test519() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test519");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("", "hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList3 = textNode2.siblingNodes();
        org.jsoup.nodes.Node node4 = textNode2.clone();
        org.jsoup.nodes.TextNode textNode6 = textNode2.text("");
        java.lang.String str7 = textNode2.getWholeText();
        int int8 = textNode2.siblingIndex();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node10 = textNode2.wrap("hi!");
    }

    @Test
    public void test520() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test520");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("", "hi!");
        org.jsoup.nodes.Node node3 = textNode2.clone();
        org.jsoup.nodes.Node node4 = textNode2.nextSibling();
        java.lang.String str5 = textNode2.baseUri();
        org.jsoup.nodes.TextNode textNode7 = textNode2.text("");
        boolean boolean9 = textNode7.hasAttr("#text");
        java.lang.String str10 = textNode7.text();
        textNode7.setBaseUri("");
        java.lang.String str13 = textNode7.nodeName();
        textNode7.setBaseUri("#text");
        java.lang.String str16 = textNode7.text();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node18 = textNode7.wrap("hi!");
    }

    @Test
    public void test521() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test521");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("", "hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList3 = textNode2.siblingNodes();
        org.jsoup.nodes.Node node4 = textNode2.clone();
        java.lang.String str6 = textNode2.attr("hi!");
        org.jsoup.nodes.TextNode textNode8 = textNode2.text("hi!");
        java.lang.String str9 = textNode8.baseUri();
        java.lang.String str10 = textNode8.getWholeText();
        org.jsoup.nodes.Node node11 = textNode8.clone();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node13 = node11.wrap("#");
    }

    @Test
    public void test522() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test522");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("", "hi!");
        org.jsoup.nodes.Node node4 = textNode2.removeAttr("hi!");
        java.lang.String str6 = textNode2.attr("hi!");
        java.lang.String str8 = textNode2.attr("#text");
        java.lang.String str10 = textNode2.attr("#text");
        java.lang.String str11 = textNode2.nodeName();
        org.jsoup.nodes.Node node13 = textNode2.removeAttr("hi!");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node15 = textNode2.wrap("i!");
    }

    @Test
    public void test523() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test523");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("", "hi!");
        org.jsoup.nodes.Node node3 = textNode2.parent();
        java.lang.String str4 = textNode2.toString();
        boolean boolean6 = textNode2.hasAttr("#text");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node8 = textNode2.wrap("text");
    }

    @Test
    public void test524() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test524");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("", "hi!");
        java.lang.String str3 = textNode2.text();
        java.util.List<org.jsoup.nodes.Node> nodeList4 = textNode2.childNodes();
        java.lang.String str5 = textNode2.toString();
        java.util.List<org.jsoup.nodes.Node> nodeList6 = textNode2.siblingNodes();
        org.jsoup.nodes.Node node9 = textNode2.attr("#text", "h");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node11 = textNode2.wrap("h");
    }

    @Test
    public void test525() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test525");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("", "hi!");
        boolean boolean4 = textNode2.hasAttr("");
        org.jsoup.nodes.TextNode textNode6 = textNode2.text("");
        textNode2.setBaseUri("hi!");
        org.jsoup.nodes.Node node11 = textNode2.attr("#text", "hi!");
        int int12 = textNode2.siblingIndex();
        org.jsoup.nodes.Node node15 = textNode2.attr("hi!", "hi!");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node17 = node15.wrap("text");
    }

    @Test
    public void test526() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test526");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("hi!", "");
        java.lang.String str3 = textNode2.toString();
        org.jsoup.nodes.Node node6 = textNode2.attr("#text", "hi!");
        org.jsoup.nodes.Node node8 = textNode2.removeAttr("hi!");
        org.jsoup.nodes.TextNode textNode10 = textNode2.splitText((int) (byte) 0);
        org.jsoup.nodes.Attributes attributes11 = textNode2.attributes();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node13 = textNode2.wrap("#text");
    }

    @Test
    public void test527() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test527");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("", "hi!");
        org.jsoup.nodes.Node node3 = textNode2.nextSibling();
        java.lang.String str5 = textNode2.absUrl("hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList6 = textNode2.siblingNodes();
        java.lang.String str7 = textNode2.toString();
        boolean boolean8 = textNode2.isBlank();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node10 = textNode2.wrap("h");
    }

    @Test
    public void test528() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test528");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("", "hi!");
        java.lang.String str4 = textNode2.absUrl("#text");
        org.jsoup.nodes.Node node5 = textNode2.clone();
        int int6 = textNode2.siblingIndex();
        org.jsoup.nodes.Node node9 = textNode2.attr("hi!", "hi!");
        java.lang.String str10 = textNode2.text();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node12 = textNode2.wrap("#text");
    }

    @Test
    public void test529() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test529");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("", "hi!");
        java.lang.String str3 = textNode2.text();
        java.util.List<org.jsoup.nodes.Node> nodeList4 = textNode2.childNodes();
        java.lang.String str5 = textNode2.toString();
        boolean boolean7 = textNode2.hasAttr("hi!");
        java.lang.String str8 = textNode2.toString();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node10 = textNode2.wrap("#text");
    }

    @Test
    public void test530() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test530");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("", "hi!");
        java.lang.String str3 = textNode2.text();
        java.lang.String str4 = textNode2.nodeName();
        int int5 = textNode2.siblingIndex();
        java.util.List<org.jsoup.nodes.Node> nodeList6 = textNode2.siblingNodes();
        java.lang.String str7 = textNode2.toString();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node9 = textNode2.wrap("hi!");
    }

    @Test
    public void test531() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test531");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("hi!", "");
        java.lang.String str3 = textNode2.toString();
        org.jsoup.nodes.Node node6 = textNode2.attr("#text", "hi!");
        org.jsoup.nodes.Node node7 = textNode2.parent();
        java.lang.String str9 = textNode2.absUrl("#text");
        org.jsoup.nodes.TextNode textNode11 = textNode2.text("i!");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node13 = textNode11.wrap("text");
    }

    @Test
    public void test532() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test532");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("#text", "");
        java.lang.String str3 = textNode2.outerHtml();
        java.lang.String str4 = textNode2.getWholeText();
        org.jsoup.nodes.Attributes attributes5 = textNode2.attributes();
        java.lang.String str7 = textNode2.absUrl("h");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node9 = textNode2.wrap("h");
    }

    @Test
    public void test533() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test533");
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
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node24 = textNode2.wrap("text");
    }

    @Test
    public void test534() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test534");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("", "hi!");
        org.jsoup.nodes.Node node3 = textNode2.clone();
        org.jsoup.nodes.Node node4 = textNode2.nextSibling();
        java.lang.String str5 = textNode2.baseUri();
        org.jsoup.nodes.TextNode textNode7 = textNode2.text("");
        boolean boolean9 = textNode2.hasAttr("#text");
        java.lang.String str11 = textNode2.attr("");
        java.lang.String str13 = textNode2.absUrl("hi!");
        java.lang.String str14 = textNode2.baseUri();
        java.lang.String str15 = textNode2.text();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node17 = textNode2.wrap("#");
    }

    @Test
    public void test535() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test535");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("", "hi!");
        org.jsoup.nodes.Node node3 = textNode2.clone();
        node3.setBaseUri("#text");
        int int6 = node3.siblingIndex();
        int int7 = node3.siblingIndex();
        org.jsoup.nodes.Node node8 = node3.parent();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node10 = node3.wrap("text");
    }

    @Test
    public void test536() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test536");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("", "hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList3 = textNode2.siblingNodes();
        org.jsoup.nodes.Node node4 = textNode2.clone();
        boolean boolean6 = textNode2.hasAttr("hi!");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node8 = textNode2.wrap("hi!");
    }

    @Test
    public void test537() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test537");
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
        java.lang.String str21 = textNode5.attr("hi!");
        java.lang.String str23 = textNode5.absUrl("hi!");
        org.jsoup.nodes.Node node25 = textNode5.removeAttr("#text");
        java.lang.String str27 = textNode5.absUrl("h");
        java.lang.String str28 = textNode5.toString();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node30 = textNode5.wrap("text");
    }

    @Test
    public void test538() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test538");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("", "");
        org.jsoup.nodes.TextNode textNode4 = textNode2.text("");
        java.lang.String str5 = textNode2.toString();
        textNode2.setBaseUri("#text");
        java.lang.String str8 = textNode2.outerHtml();
        org.jsoup.nodes.Node node9 = textNode2.clone();
        org.jsoup.nodes.Node node11 = textNode2.removeAttr("i!");
        java.lang.String str12 = textNode2.outerHtml();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node14 = textNode2.wrap("i!");
    }

    @Test
    public void test539() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test539");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("#text", "#text");
        java.lang.String str3 = textNode2.baseUri();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node5 = textNode2.wrap("h");
    }

    @Test
    public void test540() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test540");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("", "hi!");
        org.jsoup.nodes.Node node4 = textNode2.removeAttr("hi!");
        java.lang.String str6 = textNode2.attr("hi!");
        java.lang.String str8 = textNode2.attr("#text");
        int int9 = textNode2.siblingIndex();
        java.lang.String str10 = textNode2.toString();
        java.lang.String str11 = textNode2.toString();
        java.lang.String str13 = textNode2.attr("");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node15 = textNode2.wrap("#");
    }

    @Test
    public void test541() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test541");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("", "hi!");
        org.jsoup.nodes.Node node3 = textNode2.clone();
        org.jsoup.nodes.Node node4 = textNode2.nextSibling();
        textNode2.setBaseUri("");
        int int7 = textNode2.siblingIndex();
        boolean boolean9 = textNode2.equals((java.lang.Object) true);
        org.jsoup.nodes.TextNode textNode11 = textNode2.text("hi!");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node13 = textNode2.wrap("#");
    }

    @Test
    public void test542() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test542");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("", "hi!");
        org.jsoup.nodes.Node node3 = textNode2.nextSibling();
        java.lang.String str5 = textNode2.absUrl("hi!");
        int int6 = textNode2.siblingIndex();
        org.jsoup.nodes.Node node7 = textNode2.clone();
        org.jsoup.nodes.Node node8 = textNode2.clone();
        java.lang.String str9 = textNode2.nodeName();
        java.lang.String str10 = textNode2.nodeName();
        java.lang.String str11 = textNode2.text();
        java.lang.String str12 = textNode2.toString();
        org.jsoup.nodes.Node node13 = textNode2.parent();
        java.lang.String str14 = textNode2.text();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node16 = textNode2.wrap("#");
    }

    @Test
    public void test543() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test543");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("", "#text");
        java.util.List<org.jsoup.nodes.Node> nodeList3 = textNode2.childNodes();
        java.lang.String str4 = textNode2.outerHtml();
        org.jsoup.nodes.Node node5 = textNode2.nextSibling();
        int int6 = textNode2.siblingIndex();
        java.lang.String str8 = textNode2.attr("h");
        org.jsoup.nodes.Document document9 = textNode2.ownerDocument();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node11 = textNode2.wrap("h");
    }

    @Test
    public void test544() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test544");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("hi!", "");
        java.lang.String str3 = textNode2.toString();
        org.jsoup.nodes.Node node6 = textNode2.attr("#text", "hi!");
        org.jsoup.nodes.Node node7 = textNode2.parent();
        java.lang.String str9 = textNode2.attr("hi!");
        java.lang.String str11 = textNode2.attr("");
        org.jsoup.nodes.TextNode textNode13 = textNode2.text("h");
        boolean boolean14 = textNode2.isBlank();
        org.jsoup.nodes.Node node15 = textNode2.clone();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node17 = textNode2.wrap("i!");
    }

    @Test
    public void test545() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test545");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("hi!", "");
        java.lang.String str3 = textNode2.toString();
        org.jsoup.nodes.Node node6 = textNode2.attr("#text", "hi!");
        textNode2.setBaseUri("");
        org.jsoup.nodes.Node node9 = textNode2.nextSibling();
        org.jsoup.nodes.Node node10 = textNode2.clone();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node12 = node10.wrap("i!");
    }

    @Test
    public void test546() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test546");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("", "hi!");
        java.lang.String str3 = textNode2.text();
        java.lang.String str4 = textNode2.getWholeText();
        java.lang.String str5 = textNode2.toString();
        int int6 = textNode2.siblingIndex();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node8 = textNode2.wrap("#text");
    }

    @Test
    public void test547() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test547");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("#text", "h");
        org.jsoup.nodes.Node node3 = textNode2.clone();
        java.lang.String str4 = textNode2.toString();
        org.jsoup.nodes.TextNode textNode6 = textNode2.text("i!");
        java.lang.String str8 = textNode2.absUrl("h");
        org.jsoup.nodes.TextNode textNode11 = new org.jsoup.nodes.TextNode("", "hi!");
        boolean boolean13 = textNode11.hasAttr("");
        java.util.List<org.jsoup.nodes.Node> nodeList14 = textNode11.childNodes();
        org.jsoup.nodes.Attributes attributes15 = textNode11.attributes();
        org.jsoup.nodes.Node node18 = textNode11.attr("i!", "hi!");
        boolean boolean19 = textNode2.equals((java.lang.Object) "hi!");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node21 = textNode2.wrap("#");
    }

    @Test
    public void test548() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test548");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("", "hi!");
        org.jsoup.nodes.Node node3 = textNode2.clone();
        org.jsoup.nodes.Node node4 = textNode2.nextSibling();
        java.lang.String str5 = textNode2.baseUri();
        boolean boolean7 = textNode2.hasAttr("hi!");
        org.jsoup.nodes.Attributes attributes8 = textNode2.attributes();
        java.lang.String str9 = textNode2.baseUri();
        java.util.List<org.jsoup.nodes.Node> nodeList10 = textNode2.siblingNodes();
        textNode2.setBaseUri("hi!");
        java.lang.String str14 = textNode2.absUrl("i!");
        java.lang.String str15 = textNode2.text();
        org.jsoup.nodes.Node node16 = textNode2.previousSibling();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node18 = textNode2.wrap("i!");
    }

    @Test
    public void test549() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test549");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("hi!", "hi!");
        java.lang.String str3 = textNode2.nodeName();
        textNode2.setBaseUri("");
        java.lang.String str7 = textNode2.absUrl("hi!");
        java.lang.String str8 = textNode2.text();
        boolean boolean10 = textNode2.hasAttr("");
        org.jsoup.nodes.Node node12 = textNode2.removeAttr("hi!");
        int int13 = textNode2.siblingIndex();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node15 = textNode2.wrap("i!");
    }

    @Test
    public void test550() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test550");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("hi!", "hi!");
        java.lang.String str3 = textNode2.nodeName();
        java.lang.String str4 = textNode2.toString();
        java.util.List<org.jsoup.nodes.Node> nodeList5 = textNode2.siblingNodes();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node7 = textNode2.wrap("i!");
    }

    @Test
    public void test551() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test551");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("", "hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList3 = textNode2.siblingNodes();
        java.lang.String str4 = textNode2.outerHtml();
        java.lang.String str5 = textNode2.getWholeText();
        java.util.List<org.jsoup.nodes.Node> nodeList6 = textNode2.siblingNodes();
        java.util.List<org.jsoup.nodes.Node> nodeList7 = textNode2.siblingNodes();
        java.util.List<org.jsoup.nodes.Node> nodeList8 = textNode2.siblingNodes();
        org.jsoup.nodes.Node node9 = textNode2.previousSibling();
        java.lang.String str10 = textNode2.nodeName();
        org.jsoup.nodes.Node node13 = textNode2.attr("hi!", "hi!");
        java.lang.String str14 = textNode2.nodeName();
        java.lang.String str16 = textNode2.absUrl("i!");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node18 = textNode2.wrap("hi!");
    }

    @Test
    public void test552() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test552");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("", "hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList3 = textNode2.siblingNodes();
        java.lang.String str4 = textNode2.outerHtml();
        java.lang.String str5 = textNode2.getWholeText();
        java.lang.String str6 = textNode2.toString();
        java.lang.String str7 = textNode2.text();
        java.lang.String str9 = textNode2.absUrl("#text");
        org.jsoup.nodes.TextNode textNode11 = textNode2.text("");
        org.jsoup.nodes.TextNode textNode14 = new org.jsoup.nodes.TextNode("", "hi!");
        boolean boolean16 = textNode14.hasAttr("");
        org.jsoup.nodes.Node node17 = textNode14.clone();
        java.lang.String str18 = node17.outerHtml();
        boolean boolean19 = textNode11.equals((java.lang.Object) node17);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node21 = textNode11.wrap("i!");
    }

    @Test
    public void test553() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test553");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("", "hi!");
        boolean boolean4 = textNode2.hasAttr("");
        org.jsoup.nodes.Node node5 = textNode2.clone();
        java.lang.String str6 = textNode2.toString();
        java.util.List<org.jsoup.nodes.Node> nodeList7 = textNode2.childNodes();
        java.lang.String str8 = textNode2.text();
        org.jsoup.nodes.Node node9 = textNode2.previousSibling();
        boolean boolean10 = textNode2.isBlank();
        int int11 = textNode2.siblingIndex();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node13 = textNode2.wrap("text");
    }

    @Test
    public void test554() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test554");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("", "hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList3 = textNode2.siblingNodes();
        java.lang.String str4 = textNode2.outerHtml();
        java.lang.String str5 = textNode2.getWholeText();
        java.lang.String str7 = textNode2.attr("hi!");
        org.jsoup.nodes.Node node9 = textNode2.removeAttr("#text");
        java.lang.String str10 = textNode2.nodeName();
        org.jsoup.nodes.Node node13 = textNode2.attr("#text", "#text");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node15 = textNode2.wrap("#");
    }

    @Test
    public void test555() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test555");
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
        org.jsoup.nodes.Node node26 = textNode2.clone();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node28 = textNode2.wrap("hi!");
    }

    @Test
    public void test556() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test556");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("#text", "");
        org.jsoup.nodes.Node node3 = textNode2.parent();
        java.lang.String str4 = textNode2.toString();
        boolean boolean5 = textNode2.isBlank();
        java.lang.String str6 = textNode2.toString();
        java.lang.String str7 = textNode2.text();
        org.jsoup.nodes.Node node8 = textNode2.clone();
        textNode2.setBaseUri("");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node12 = textNode2.wrap("h");
    }

    @Test
    public void test557() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test557");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("", "hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList3 = textNode2.siblingNodes();
        org.jsoup.nodes.Node node4 = textNode2.clone();
        org.jsoup.nodes.Attributes attributes5 = textNode2.attributes();
        textNode2.setBaseUri("");
        java.lang.String str9 = textNode2.absUrl("hi!");
        java.lang.String str10 = textNode2.baseUri();
        java.lang.String str11 = textNode2.getWholeText();
        java.lang.String str12 = textNode2.getWholeText();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node14 = textNode2.wrap("hi!");
    }

    @Test
    public void test558() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test558");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("", "hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList3 = textNode2.siblingNodes();
        org.jsoup.nodes.Node node4 = textNode2.clone();
        org.jsoup.nodes.TextNode textNode6 = textNode2.text("");
        org.jsoup.nodes.Document document7 = textNode6.ownerDocument();
        java.lang.String str9 = textNode6.absUrl("hi!");
        org.jsoup.nodes.Attributes attributes10 = textNode6.attributes();
        org.jsoup.nodes.TextNode textNode13 = new org.jsoup.nodes.TextNode("", "hi!");
        org.jsoup.nodes.Node node14 = textNode13.clone();
        org.jsoup.nodes.Node node15 = textNode13.nextSibling();
        boolean boolean17 = textNode13.hasAttr("");
        java.lang.String str18 = textNode13.nodeName();
        java.lang.String str19 = textNode13.getWholeText();
        boolean boolean20 = textNode6.equals((java.lang.Object) str19);
        org.jsoup.nodes.TextNode textNode22 = textNode6.text("h");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node24 = textNode6.wrap("#");
    }

    @Test
    public void test559() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test559");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("#text", "");
        boolean boolean4 = textNode2.hasAttr("#text");
        org.jsoup.nodes.Node node7 = textNode2.attr("hi!", "");
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
        org.jsoup.nodes.Document.OutputSettings outputSettings27 = outputSettings25.clone();
        boolean boolean28 = node7.equals((java.lang.Object) outputSettings27);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node30 = node7.wrap("i!");
    }

    @Test
    public void test560() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test560");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("hi!", "hi!");
        java.lang.String str3 = textNode2.nodeName();
        textNode2.setBaseUri("");
        java.lang.String str7 = textNode2.absUrl("hi!");
        java.lang.String str8 = textNode2.getWholeText();
        java.lang.String str9 = textNode2.outerHtml();
        org.jsoup.nodes.Node node10 = textNode2.clone();
        org.jsoup.nodes.Node node12 = textNode2.removeAttr("i!");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node14 = node12.wrap("h");
    }

    @Test
    public void test561() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test561");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("#text", "");
        java.lang.String str3 = textNode2.outerHtml();
        java.lang.String str4 = textNode2.toString();
        org.jsoup.nodes.Node node5 = textNode2.clone();
        org.jsoup.nodes.Document.OutputSettings outputSettings6 = new org.jsoup.nodes.Document.OutputSettings();
        boolean boolean7 = outputSettings6.prettyPrint();
        int int8 = outputSettings6.indentAmount();
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
        int int29 = outputSettings28.indentAmount();
        java.nio.charset.Charset charset30 = outputSettings28.charset();
        java.nio.charset.Charset charset31 = outputSettings28.charset();
        org.jsoup.nodes.Document.OutputSettings outputSettings32 = outputSettings6.charset(charset31);
        org.jsoup.nodes.Document.OutputSettings outputSettings34 = outputSettings6.forceAllElementAsBlock(false);
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
        java.nio.charset.Charset charset49 = outputSettings48.charset();
        org.jsoup.nodes.Document.OutputSettings outputSettings50 = outputSettings6.charset(charset49);
        boolean boolean51 = textNode2.equals((java.lang.Object) outputSettings6);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node53 = textNode2.wrap("#");
    }

    @Test
    public void test562() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test562");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("", "hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList3 = textNode2.siblingNodes();
        org.jsoup.nodes.Node node4 = textNode2.clone();
        java.lang.String str5 = textNode2.baseUri();
        org.jsoup.nodes.Node node6 = textNode2.clone();
        java.lang.String str7 = textNode2.outerHtml();
        org.jsoup.nodes.Document document8 = textNode2.ownerDocument();
        org.jsoup.nodes.Node node10 = textNode2.removeAttr("#text");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node12 = textNode2.wrap("h");
    }

    @Test
    public void test563() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test563");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("", "hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList3 = textNode2.siblingNodes();
        java.lang.String str4 = textNode2.outerHtml();
        java.lang.String str5 = textNode2.getWholeText();
        java.util.List<org.jsoup.nodes.Node> nodeList6 = textNode2.siblingNodes();
        java.util.List<org.jsoup.nodes.Node> nodeList7 = textNode2.siblingNodes();
        int int8 = textNode2.siblingIndex();
        java.util.List<org.jsoup.nodes.Node> nodeList9 = textNode2.siblingNodes();
        org.jsoup.nodes.TextNode textNode11 = textNode2.text("h");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node13 = textNode2.wrap("#text");
    }

    @Test
    public void test564() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test564");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("", "hi!");
        org.jsoup.nodes.Node node3 = textNode2.clone();
        org.jsoup.nodes.Node node4 = textNode2.nextSibling();
        java.lang.String str5 = textNode2.nodeName();
        org.jsoup.nodes.Node node6 = textNode2.parent();
        org.jsoup.nodes.TextNode textNode9 = new org.jsoup.nodes.TextNode("", "hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList10 = textNode9.siblingNodes();
        org.jsoup.nodes.Node node11 = textNode9.clone();
        java.lang.String str13 = textNode9.attr("hi!");
        org.jsoup.nodes.TextNode textNode15 = textNode9.text("hi!");
        org.jsoup.nodes.Node node16 = textNode9.parent();
        boolean boolean17 = textNode2.equals((java.lang.Object) textNode9);
        org.jsoup.nodes.Document document18 = textNode2.ownerDocument();
        org.jsoup.nodes.Node node20 = textNode2.removeAttr("h");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node22 = node20.wrap("#");
    }

    @Test
    public void test565() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test565");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("", "hi!");
        boolean boolean4 = textNode2.hasAttr("");
        textNode2.setBaseUri("#text");
        org.jsoup.nodes.TextNode textNode8 = textNode2.text("");
        org.jsoup.nodes.TextNode textNode10 = textNode8.text("#text");
        boolean boolean11 = textNode10.isBlank();
        org.jsoup.nodes.Attributes attributes12 = textNode10.attributes();
        java.lang.String str13 = textNode10.getWholeText();
        java.lang.String str14 = textNode10.getWholeText();
        java.lang.String str15 = textNode10.getWholeText();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node17 = textNode10.wrap("text");
    }

    @Test
    public void test566() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test566");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("", "hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList3 = textNode2.siblingNodes();
        java.lang.String str4 = textNode2.outerHtml();
        java.lang.String str5 = textNode2.getWholeText();
        java.lang.String str7 = textNode2.attr("hi!");
        java.lang.String str8 = textNode2.nodeName();
        java.lang.String str9 = textNode2.toString();
        java.lang.String str10 = textNode2.nodeName();
        java.lang.String str11 = textNode2.baseUri();
        org.jsoup.nodes.Node node14 = textNode2.attr("text", "");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node16 = node14.wrap("#text");
    }

    @Test
    public void test567() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test567");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("", "hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList3 = textNode2.siblingNodes();
        org.jsoup.nodes.Node node4 = textNode2.clone();
        java.lang.String str6 = textNode2.attr("hi!");
        org.jsoup.nodes.TextNode textNode8 = textNode2.text("hi!");
        java.lang.String str9 = textNode8.baseUri();
        java.lang.String str10 = textNode8.getWholeText();
        org.jsoup.nodes.TextNode textNode12 = textNode8.splitText((int) (short) 1);
        org.jsoup.nodes.TextNode textNode14 = textNode12.splitText((int) (byte) 0);
        java.lang.String str16 = textNode14.attr("");
        org.jsoup.nodes.TextNode textNode18 = textNode14.text("");
        java.util.List<org.jsoup.nodes.Node> nodeList19 = textNode14.childNodes();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node21 = textNode14.wrap("text");
    }

    @Test
    public void test568() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test568");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("#text", "");
        org.jsoup.nodes.Node node3 = textNode2.parent();
        java.lang.String str4 = textNode2.baseUri();
        java.lang.String str6 = textNode2.attr("#text");
        org.jsoup.nodes.Node node8 = textNode2.removeAttr("hi!");
        org.jsoup.nodes.TextNode textNode10 = textNode2.text("i!");
        java.lang.String str11 = textNode2.baseUri();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node13 = textNode2.wrap("i!");
    }

    @Test
    public void test569() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test569");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("", "hi!");
        org.jsoup.nodes.Node node3 = textNode2.clone();
        org.jsoup.nodes.Node node4 = textNode2.nextSibling();
        java.lang.String str5 = textNode2.nodeName();
        org.jsoup.nodes.Node node6 = textNode2.parent();
        org.jsoup.nodes.TextNode textNode9 = new org.jsoup.nodes.TextNode("", "hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList10 = textNode9.siblingNodes();
        org.jsoup.nodes.Node node11 = textNode9.clone();
        java.lang.String str13 = textNode9.attr("hi!");
        org.jsoup.nodes.TextNode textNode15 = textNode9.text("hi!");
        org.jsoup.nodes.Node node16 = textNode9.parent();
        boolean boolean17 = textNode2.equals((java.lang.Object) textNode9);
        org.jsoup.nodes.Node node20 = textNode2.attr("i!", "#text");
        org.jsoup.nodes.Document document21 = node20.ownerDocument();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node23 = node20.wrap("i!");
    }

    @Test
    public void test570() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test570");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("", "hi!");
        org.jsoup.nodes.Node node3 = textNode2.clone();
        java.lang.String str4 = textNode2.outerHtml();
        java.lang.String str5 = textNode2.nodeName();
        java.lang.String str6 = textNode2.baseUri();
        java.lang.String str8 = textNode2.attr("h");
        java.lang.String str9 = textNode2.getWholeText();
        org.jsoup.nodes.Node node11 = textNode2.removeAttr("i!");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node13 = textNode2.wrap("i!");
    }

    @Test
    public void test571() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test571");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("", "hi!");
        boolean boolean4 = textNode2.hasAttr("");
        org.jsoup.nodes.TextNode textNode6 = textNode2.text("");
        org.jsoup.nodes.Node node7 = textNode2.clone();
        java.util.List<org.jsoup.nodes.Node> nodeList8 = textNode2.childNodes();
        java.lang.String str10 = textNode2.absUrl("#text");
        org.jsoup.nodes.Attributes attributes11 = textNode2.attributes();
        org.jsoup.nodes.Node node12 = textNode2.clone();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node14 = node12.wrap("h");
    }

    @Test
    public void test572() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test572");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("#text", "hi!");
        org.jsoup.nodes.Document document3 = textNode2.ownerDocument();
        boolean boolean5 = textNode2.hasAttr("");
        textNode2.setBaseUri("");
        org.jsoup.nodes.Node node10 = textNode2.attr("hi!", "i!");
        java.lang.String str12 = textNode2.absUrl("i!");
        org.jsoup.nodes.Node node13 = textNode2.clone();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node15 = node13.wrap("#");
    }

    @Test
    public void test573() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test573");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("#text", "");
        boolean boolean4 = textNode2.hasAttr("#text");
        java.lang.String str5 = textNode2.text();
        java.lang.String str7 = textNode2.attr("");
        java.lang.String str8 = textNode2.getWholeText();
        int int9 = textNode2.siblingIndex();
        org.jsoup.nodes.Node node10 = textNode2.clone();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node12 = node10.wrap("hi!");
    }

    @Test
    public void test574() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test574");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("", "hi!");
        boolean boolean4 = textNode2.hasAttr("");
        org.jsoup.nodes.TextNode textNode6 = textNode2.text("");
        org.jsoup.nodes.Node node7 = textNode2.clone();
        java.util.List<org.jsoup.nodes.Node> nodeList8 = textNode2.childNodes();
        java.lang.String str10 = textNode2.absUrl("#text");
        java.lang.String str12 = textNode2.attr("hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList13 = textNode2.childNodes();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node15 = textNode2.wrap("h");
    }

    @Test
    public void test575() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test575");
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
        int int20 = textNode2.siblingIndex();
        textNode2.setBaseUri("hi!");
        org.jsoup.nodes.Node node23 = textNode2.parent();
        org.jsoup.nodes.Node node26 = textNode2.attr("i!", "hi!");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node28 = node26.wrap("h");
    }

    @Test
    public void test576() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test576");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("", "hi!");
        boolean boolean4 = textNode2.hasAttr("");
        org.jsoup.nodes.TextNode textNode6 = textNode2.text("");
        org.jsoup.nodes.Node node7 = textNode2.clone();
        java.util.List<org.jsoup.nodes.Node> nodeList8 = node7.childNodes();
        org.jsoup.nodes.Node node9 = node7.nextSibling();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node11 = node7.wrap("hi!");
    }

    @Test
    public void test577() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test577");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("", "hi!");
        java.lang.String str3 = textNode2.text();
        java.lang.String str4 = textNode2.nodeName();
        int int5 = textNode2.siblingIndex();
        boolean boolean7 = textNode2.hasAttr("#text");
        java.util.List<org.jsoup.nodes.Node> nodeList8 = textNode2.siblingNodes();
        textNode2.setBaseUri("h");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node12 = textNode2.wrap("#");
    }

    @Test
    public void test578() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test578");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("#text", "#text");
        java.lang.String str4 = textNode2.absUrl("#text");
        org.jsoup.nodes.TextNode textNode6 = textNode2.text("");
        java.lang.String str7 = textNode6.baseUri();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node9 = textNode6.wrap("#text");
    }

    @Test
    public void test579() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test579");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("", "hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList3 = textNode2.siblingNodes();
        org.jsoup.nodes.Node node4 = textNode2.clone();
        java.lang.String str6 = textNode2.attr("hi!");
        org.jsoup.nodes.TextNode textNode8 = textNode2.text("hi!");
        org.jsoup.nodes.Document document9 = textNode8.ownerDocument();
        boolean boolean11 = textNode8.hasAttr("#text");
        java.lang.String str12 = textNode8.getWholeText();
        org.jsoup.nodes.Document document13 = textNode8.ownerDocument();
        org.jsoup.nodes.Attributes attributes14 = textNode8.attributes();
        org.jsoup.nodes.TextNode textNode16 = textNode8.text("#");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node18 = textNode16.wrap("#");
    }

    @Test
    public void test580() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test580");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("", "hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList3 = textNode2.siblingNodes();
        org.jsoup.nodes.Node node4 = textNode2.clone();
        java.lang.String str5 = textNode2.baseUri();
        java.util.List<org.jsoup.nodes.Node> nodeList6 = textNode2.siblingNodes();
        org.jsoup.nodes.Node node7 = textNode2.nextSibling();
        org.jsoup.nodes.Node node8 = textNode2.clone();
        org.jsoup.nodes.Node node9 = node8.parent();
        org.jsoup.nodes.Node node10 = node8.previousSibling();
        org.jsoup.nodes.Document document11 = node8.ownerDocument();
        java.util.List<org.jsoup.nodes.Node> nodeList12 = node8.childNodes();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node14 = node8.wrap("i!");
    }

    @Test
    public void test581() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test581");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("#", "#text");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node4 = textNode2.wrap("#");
    }
}

