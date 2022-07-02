import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class ErrorTest0 {

    public static boolean debug = false;

    @Test
    public void test1() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test1");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("Def", "Blah \000");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node4 = textNode2.wrap("one");
    }

    @Test
    public void test2() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test2");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode(" $ 712 ", "\u767e\u5ea6\u4e00\u4e0b\uff0c\u4f60\u5c31\u77e5\u9053      ");
        java.util.List<org.jsoup.nodes.Node> nodeList3 = textNode2.childNodes();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node5 = textNode2.wrap("< > & \" ' \327");
    }
}

