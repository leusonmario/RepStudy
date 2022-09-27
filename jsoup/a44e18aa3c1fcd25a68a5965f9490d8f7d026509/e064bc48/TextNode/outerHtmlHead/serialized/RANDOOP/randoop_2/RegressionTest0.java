import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest0 {

    public static boolean debug = false;

    @Test
    public void test001() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test001");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("", "hi!");
    }

    @Test
    public void test002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test002");
        org.jsoup.nodes.SerializedObjectSupporter serializedObjectSupporter0 = new org.jsoup.nodes.SerializedObjectSupporter();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Document document1 = serializedObjectSupporter0.deserializeObjectDocument50();
// flaky:             org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: org.jsoup.nodes.Document$OutputSettings cannot be cast to org.jsoup.nodes.Document");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
    }

    @Test
    public void test003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test003");
        org.jsoup.nodes.SerializedObjectSupporter serializedObjectSupporter0 = new org.jsoup.nodes.SerializedObjectSupporter();
        java.lang.String str1 = serializedObjectSupporter0.deserializeObjectString93();
        java.lang.StringBuilder stringBuilder2 = serializedObjectSupporter0.deserializeObjectStringBuilder215();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Document document3 = serializedObjectSupporter0.deserializeObjectDocument179();
// flaky:             org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: org.jsoup.nodes.Document$OutputSettings cannot be cast to org.jsoup.nodes.Document");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "More" + "'", str1, "More");
        org.junit.Assert.assertNotNull(stringBuilder2);
        org.junit.Assert.assertEquals(stringBuilder2.toString(), "<div id=\"1\">");
    }

    @Test
    public void test004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test004");
        org.jsoup.nodes.SerializedObjectSupporter serializedObjectSupporter0 = new org.jsoup.nodes.SerializedObjectSupporter();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Document document1 = serializedObjectSupporter0.deserializeObjectDocument140();
// flaky:             org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: org.jsoup.nodes.Document$OutputSettings cannot be cast to org.jsoup.nodes.Document");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
    }

    @Test
    public void test005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test005");
        org.jsoup.nodes.SerializedObjectSupporter serializedObjectSupporter0 = new org.jsoup.nodes.SerializedObjectSupporter();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Document document1 = serializedObjectSupporter0.deserializeObjectDocument369();
// flaky:             org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: org.jsoup.nodes.Document$OutputSettings cannot be cast to org.jsoup.nodes.Document");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
    }

    @Test
    public void test006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test006");
        org.jsoup.nodes.SerializedObjectSupporter serializedObjectSupporter0 = new org.jsoup.nodes.SerializedObjectSupporter();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Document document1 = serializedObjectSupporter0.deserializeObjectDocument220();
// flaky:             org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: org.jsoup.nodes.Document$OutputSettings cannot be cast to org.jsoup.nodes.Document");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
    }

    @Test
    public void test007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test007");
        org.jsoup.nodes.SerializedObjectSupporter serializedObjectSupporter0 = new org.jsoup.nodes.SerializedObjectSupporter();
        java.lang.String str1 = serializedObjectSupporter0.deserializeObjectString93();
        org.jsoup.nodes.TextNode textNode2 = serializedObjectSupporter0.deserializeObjectTextNode214();
        java.lang.StringBuilder stringBuilder3 = serializedObjectSupporter0.deserializeObjectStringBuilder143();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Document document4 = serializedObjectSupporter0.deserializeObjectDocument157();
// flaky:             org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: org.jsoup.nodes.Document$OutputSettings cannot be cast to org.jsoup.nodes.Document");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "More" + "'", str1, "More");
// flaky:         org.junit.Assert.assertNotNull(textNode2);
        org.junit.Assert.assertNotNull(stringBuilder3);
        org.junit.Assert.assertEquals(stringBuilder3.toString(), "<div id=\"1\"></div>\n<div id=\"2\">\n Text \n <p>One</p>");
    }

    @Test
    public void test008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test008");
        org.jsoup.nodes.SerializedObjectSupporter serializedObjectSupporter0 = new org.jsoup.nodes.SerializedObjectSupporter();
        java.lang.String str1 = serializedObjectSupporter0.deserializeObjectString93();
        org.jsoup.nodes.TextNode textNode2 = serializedObjectSupporter0.deserializeObjectTextNode214();
        java.lang.StringBuilder stringBuilder3 = serializedObjectSupporter0.deserializeObjectStringBuilder143();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Document document4 = serializedObjectSupporter0.deserializeObjectDocument150();
// flaky:             org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: org.jsoup.nodes.Document$OutputSettings cannot be cast to org.jsoup.nodes.Document");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "More" + "'", str1, "More");
// flaky:         org.junit.Assert.assertNotNull(textNode2);
        org.junit.Assert.assertNotNull(stringBuilder3);
        org.junit.Assert.assertEquals(stringBuilder3.toString(), "<div id=\"1\"></div>\n<div id=\"2\">\n Text \n <p>One</p>");
    }

    @Test
    public void test009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test009");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("hi!", "hi!");
        textNode2.text = "";
        java.lang.String str5 = textNode2.outerHtml();
        java.lang.String str6 = textNode2.nodeName();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "#text" + "'", str6, "#text");
    }

    @Test
    public void test010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test010");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("hi!", "hi!");
        textNode2.text = "";
        org.jsoup.nodes.Node node7 = textNode2.attr("#text", "There ");
        org.junit.Assert.assertNotNull(node7);
    }

    @Test
    public void test011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test011");
        org.jsoup.nodes.SerializedObjectSupporter serializedObjectSupporter0 = new org.jsoup.nodes.SerializedObjectSupporter();
        org.jsoup.nodes.TextNode textNode1 = serializedObjectSupporter0.deserializeObjectTextNode401();
        java.lang.StringBuilder stringBuilder2 = serializedObjectSupporter0.deserializeObjectStringBuilder60();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Document document3 = serializedObjectSupporter0.deserializeObjectDocument140();
// flaky:             org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: org.jsoup.nodes.Document$OutputSettings cannot be cast to org.jsoup.nodes.Document");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
// flaky:         org.junit.Assert.assertNotNull(textNode1);
        org.junit.Assert.assertNotNull(stringBuilder2);
        org.junit.Assert.assertEquals(stringBuilder2.toString(), "<html>\n <head>\n  <script>one</script>\n  <noscript></noscript>\n </head>\n <body>\n  <p>");
    }

    @Test
    public void test012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test012");
        org.jsoup.nodes.SerializedObjectSupporter serializedObjectSupporter0 = new org.jsoup.nodes.SerializedObjectSupporter();
        org.jsoup.nodes.TextNode textNode1 = serializedObjectSupporter0.deserializeObjectTextNode401();
        java.lang.StringBuilder stringBuilder2 = serializedObjectSupporter0.deserializeObjectStringBuilder60();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Document document3 = serializedObjectSupporter0.deserializeObjectDocument186();
// flaky:             org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: org.jsoup.nodes.Document$OutputSettings cannot be cast to org.jsoup.nodes.Document");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
// flaky:         org.junit.Assert.assertNotNull(textNode1);
        org.junit.Assert.assertNotNull(stringBuilder2);
        org.junit.Assert.assertEquals(stringBuilder2.toString(), "<html>\n <head>\n  <script>one</script>\n  <noscript></noscript>\n </head>\n <body>\n  <p>");
    }

    @Test
    public void test013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test013");
        org.jsoup.nodes.SerializedObjectSupporter serializedObjectSupporter0 = new org.jsoup.nodes.SerializedObjectSupporter();
        java.lang.String str1 = serializedObjectSupporter0.deserializeObjectString93();
        org.jsoup.nodes.TextNode textNode2 = serializedObjectSupporter0.deserializeObjectTextNode214();
        java.lang.StringBuilder stringBuilder3 = serializedObjectSupporter0.deserializeObjectStringBuilder143();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Document document4 = serializedObjectSupporter0.deserializeObjectDocument391();
// flaky:             org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: org.jsoup.nodes.Document$OutputSettings cannot be cast to org.jsoup.nodes.Document");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "More" + "'", str1, "More");
// flaky:         org.junit.Assert.assertNotNull(textNode2);
        org.junit.Assert.assertNotNull(stringBuilder3);
        org.junit.Assert.assertEquals(stringBuilder3.toString(), "<div id=\"1\"></div>\n<div id=\"2\">\n Text \n <p>One</p>");
    }

    @Test
    public void test014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test014");
        org.jsoup.nodes.SerializedObjectSupporter serializedObjectSupporter0 = new org.jsoup.nodes.SerializedObjectSupporter();
        java.lang.String str1 = serializedObjectSupporter0.deserializeObjectString93();
        org.jsoup.nodes.TextNode textNode2 = serializedObjectSupporter0.deserializeObjectTextNode214();
        java.lang.StringBuilder stringBuilder3 = serializedObjectSupporter0.deserializeObjectStringBuilder143();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Document document4 = serializedObjectSupporter0.deserializeObjectDocument353();
// flaky:             org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: org.jsoup.nodes.Document$OutputSettings cannot be cast to org.jsoup.nodes.Document");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "More" + "'", str1, "More");
// flaky:         org.junit.Assert.assertNotNull(textNode2);
        org.junit.Assert.assertNotNull(stringBuilder3);
        org.junit.Assert.assertEquals(stringBuilder3.toString(), "<div id=\"1\"></div>\n<div id=\"2\">\n Text \n <p>One</p>");
    }

    @Test
    public void test015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test015");
        org.jsoup.nodes.SerializedObjectSupporter serializedObjectSupporter0 = new org.jsoup.nodes.SerializedObjectSupporter();
        java.lang.String str1 = serializedObjectSupporter0.deserializeObjectString93();
        java.lang.StringBuilder stringBuilder2 = serializedObjectSupporter0.deserializeObjectStringBuilder267();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Document document3 = serializedObjectSupporter0.deserializeObjectDocument49();
// flaky:             org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: org.jsoup.nodes.Document$OutputSettings cannot be cast to org.jsoup.nodes.Document");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "More" + "'", str1, "More");
        org.junit.Assert.assertNotNull(stringBuilder2);
        org.junit.Assert.assertEquals(stringBuilder2.toString(), "<doc>\n <val>");
    }

    @Test
    public void test016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test016");
        org.jsoup.nodes.SerializedObjectSupporter serializedObjectSupporter0 = new org.jsoup.nodes.SerializedObjectSupporter();
        java.lang.String str1 = serializedObjectSupporter0.deserializeObjectString93();
        org.jsoup.nodes.TextNode textNode2 = serializedObjectSupporter0.deserializeObjectTextNode214();
        org.jsoup.nodes.TextNode textNode3 = serializedObjectSupporter0.deserializeObjectTextNode79();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Document document4 = serializedObjectSupporter0.deserializeObjectDocument241();
// flaky:             org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: org.jsoup.nodes.Document$OutputSettings cannot be cast to org.jsoup.nodes.Document");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "More" + "'", str1, "More");
// flaky:         org.junit.Assert.assertNotNull(textNode2);
// flaky:         org.junit.Assert.assertNotNull(textNode3);
    }

    @Test
    public void test017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test017");
        org.jsoup.nodes.SerializedObjectSupporter serializedObjectSupporter0 = new org.jsoup.nodes.SerializedObjectSupporter();
        org.jsoup.nodes.TextNode textNode1 = serializedObjectSupporter0.deserializeObjectTextNode401();
        org.jsoup.nodes.TextNode textNode2 = serializedObjectSupporter0.deserializeObjectTextNode376();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Document document3 = serializedObjectSupporter0.deserializeObjectDocument391();
// flaky:             org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: org.jsoup.nodes.Document$OutputSettings cannot be cast to org.jsoup.nodes.Document");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
// flaky:         org.junit.Assert.assertNotNull(textNode1);
// flaky:         org.junit.Assert.assertNotNull(textNode2);
    }

    @Test
    public void test018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test018");
        java.lang.String str1 = org.jsoup.nodes.TextNode.normaliseWhitespace("hi!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "hi!" + "'", str1, "hi!");
    }

    @Test
    public void test019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test019");
        org.jsoup.nodes.SerializedObjectSupporter serializedObjectSupporter0 = new org.jsoup.nodes.SerializedObjectSupporter();
        java.lang.String str1 = serializedObjectSupporter0.deserializeObjectString93();
        org.jsoup.nodes.TextNode textNode2 = serializedObjectSupporter0.deserializeObjectTextNode214();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString109();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Document document4 = serializedObjectSupporter0.deserializeObjectDocument253();
// flaky:             org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: org.jsoup.nodes.Document$OutputSettings cannot be cast to org.jsoup.nodes.Document");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "More" + "'", str1, "More");
// flaky:         org.junit.Assert.assertNotNull(textNode2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "A caption" + "'", str3, "A caption");
    }

    @Test
    public void test020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test020");
        org.jsoup.nodes.SerializedObjectSupporter serializedObjectSupporter0 = new org.jsoup.nodes.SerializedObjectSupporter();
        java.lang.String str1 = serializedObjectSupporter0.deserializeObjectString93();
        java.lang.StringBuilder stringBuilder2 = serializedObjectSupporter0.deserializeObjectStringBuilder215();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString128();
        org.jsoup.nodes.TextNode textNode4 = serializedObjectSupporter0.deserializeObjectTextNode186();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Document document5 = serializedObjectSupporter0.deserializeObjectDocument253();
// flaky:             org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: org.jsoup.nodes.Document$OutputSettings cannot be cast to org.jsoup.nodes.Document");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "More" + "'", str1, "More");
        org.junit.Assert.assertNotNull(stringBuilder2);
        org.junit.Assert.assertEquals(stringBuilder2.toString(), "<div id=\"1\">");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + " 12.3% " + "'", str3, " 12.3% ");
// flaky:         org.junit.Assert.assertNotNull(textNode4);
    }

    @Test
    public void test021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test021");
        org.jsoup.nodes.SerializedObjectSupporter serializedObjectSupporter0 = new org.jsoup.nodes.SerializedObjectSupporter();
        java.lang.String str1 = serializedObjectSupporter0.deserializeObjectString93();
        org.jsoup.nodes.TextNode textNode2 = serializedObjectSupporter0.deserializeObjectTextNode214();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString109();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Document document4 = serializedObjectSupporter0.deserializeObjectDocument241();
// flaky:             org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: org.jsoup.nodes.Document$OutputSettings cannot be cast to org.jsoup.nodes.Document");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "More" + "'", str1, "More");
// flaky:         org.junit.Assert.assertNotNull(textNode2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "A caption" + "'", str3, "A caption");
    }

    @Test
    public void test022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test022");
        org.jsoup.nodes.SerializedObjectSupporter serializedObjectSupporter0 = new org.jsoup.nodes.SerializedObjectSupporter();
        java.lang.String str1 = serializedObjectSupporter0.deserializeObjectString93();
        org.jsoup.nodes.TextNode textNode2 = serializedObjectSupporter0.deserializeObjectTextNode214();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString109();
        org.jsoup.nodes.TextNode textNode4 = serializedObjectSupporter0.deserializeObjectTextNode86();
        java.lang.String str5 = serializedObjectSupporter0.deserializeObjectString27();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Document document6 = serializedObjectSupporter0.deserializeObjectDocument407();
// flaky:             org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: org.jsoup.nodes.Document$OutputSettings cannot be cast to org.jsoup.nodes.Document");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "More" + "'", str1, "More");
// flaky:         org.junit.Assert.assertNotNull(textNode2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "A caption" + "'", str3, "A caption");
// flaky:         org.junit.Assert.assertNotNull(textNode4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "now" + "'", str5, "now");
    }

    @Test
    public void test023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test023");
        org.jsoup.nodes.SerializedObjectSupporter serializedObjectSupporter0 = new org.jsoup.nodes.SerializedObjectSupporter();
        java.lang.String str1 = serializedObjectSupporter0.deserializeObjectString93();
        org.jsoup.nodes.TextNode textNode2 = serializedObjectSupporter0.deserializeObjectTextNode214();
        java.lang.StringBuilder stringBuilder3 = serializedObjectSupporter0.deserializeObjectStringBuilder143();
        java.lang.StringBuilder stringBuilder4 = serializedObjectSupporter0.deserializeObjectStringBuilder71();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "More" + "'", str1, "More");
// flaky:         org.junit.Assert.assertNotNull(textNode2);
        org.junit.Assert.assertNotNull(stringBuilder3);
        org.junit.Assert.assertEquals(stringBuilder3.toString(), "<div id=\"1\"></div>\n<div id=\"2\">\n Text \n <p>One</p>");
        org.junit.Assert.assertNotNull(stringBuilder4);
        org.junit.Assert.assertEquals(stringBuilder4.toString(), "<html>\n <head>\n  <title>Hello there</title>");
    }

    @Test
    public void test024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test024");
        org.jsoup.nodes.SerializedObjectSupporter serializedObjectSupporter0 = new org.jsoup.nodes.SerializedObjectSupporter();
        org.jsoup.nodes.TextNode textNode1 = serializedObjectSupporter0.deserializeObjectTextNode401();
        java.lang.StringBuilder stringBuilder2 = serializedObjectSupporter0.deserializeObjectStringBuilder163();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Document document3 = serializedObjectSupporter0.deserializeObjectDocument357();
// flaky:             org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: org.jsoup.nodes.Document$OutputSettings cannot be cast to org.jsoup.nodes.Document");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
// flaky:         org.junit.Assert.assertNotNull(textNode1);
        org.junit.Assert.assertNotNull(stringBuilder2);
        org.junit.Assert.assertEquals(stringBuilder2.toString(), "<html>\n <head>\n  <title>Format test</title>\n </head>\n <body>\n  <div>\n   <p>\n    Hello \n    <span>\n     jsoup \n     <span>");
    }

    @Test
    public void test025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test025");
        org.jsoup.nodes.SerializedObjectSupporter serializedObjectSupporter0 = new org.jsoup.nodes.SerializedObjectSupporter();
        java.lang.String str1 = serializedObjectSupporter0.deserializeObjectString93();
        org.jsoup.nodes.TextNode textNode2 = serializedObjectSupporter0.deserializeObjectTextNode214();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString109();
        java.lang.String str4 = serializedObjectSupporter0.deserializeObjectString3();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Document document5 = serializedObjectSupporter0.deserializeObjectDocument235();
// flaky:             org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: org.jsoup.nodes.Document$OutputSettings cannot be cast to org.jsoup.nodes.Document");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "More" + "'", str1, "More");
// flaky:         org.junit.Assert.assertNotNull(textNode2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "A caption" + "'", str3, "A caption");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "This" + "'", str4, "This");
    }

    @Test
    public void test026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test026");
        org.jsoup.nodes.SerializedObjectSupporter serializedObjectSupporter0 = new org.jsoup.nodes.SerializedObjectSupporter();
        java.lang.String str1 = serializedObjectSupporter0.deserializeObjectString93();
        java.lang.StringBuilder stringBuilder2 = serializedObjectSupporter0.deserializeObjectStringBuilder267();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Document document3 = serializedObjectSupporter0.deserializeObjectDocument221();
// flaky:             org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: org.jsoup.nodes.Document$OutputSettings cannot be cast to org.jsoup.nodes.Document");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "More" + "'", str1, "More");
        org.junit.Assert.assertNotNull(stringBuilder2);
        org.junit.Assert.assertEquals(stringBuilder2.toString(), "<doc>\n <val>");
    }

    @Test
    public void test027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test027");
        org.jsoup.nodes.SerializedObjectSupporter serializedObjectSupporter0 = new org.jsoup.nodes.SerializedObjectSupporter();
        java.lang.String str1 = serializedObjectSupporter0.deserializeObjectString93();
        org.jsoup.nodes.TextNode textNode2 = serializedObjectSupporter0.deserializeObjectTextNode214();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Document document3 = serializedObjectSupporter0.deserializeObjectDocument59();
// flaky:             org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: org.jsoup.nodes.Document$OutputSettings cannot be cast to org.jsoup.nodes.Document");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "More" + "'", str1, "More");
// flaky:         org.junit.Assert.assertNotNull(textNode2);
    }

    @Test
    public void test028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test028");
        org.jsoup.nodes.SerializedObjectSupporter serializedObjectSupporter0 = new org.jsoup.nodes.SerializedObjectSupporter();
        org.jsoup.nodes.TextNode textNode1 = serializedObjectSupporter0.deserializeObjectTextNode401();
        java.lang.StringBuilder stringBuilder2 = serializedObjectSupporter0.deserializeObjectStringBuilder163();
        org.jsoup.nodes.TextNode textNode3 = serializedObjectSupporter0.deserializeObjectTextNode135();
        org.jsoup.nodes.TextNode textNode4 = serializedObjectSupporter0.deserializeObjectTextNode183();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Document document5 = serializedObjectSupporter0.deserializeObjectDocument116();
// flaky:             org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: org.jsoup.nodes.Document$OutputSettings cannot be cast to org.jsoup.nodes.Document");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
// flaky:         org.junit.Assert.assertNotNull(textNode1);
        org.junit.Assert.assertNotNull(stringBuilder2);
        org.junit.Assert.assertEquals(stringBuilder2.toString(), "<html>\n <head>\n  <title>Format test</title>\n </head>\n <body>\n  <div>\n   <p>\n    Hello \n    <span>\n     jsoup \n     <span>");
// flaky:         org.junit.Assert.assertNotNull(textNode3);
// flaky:         org.junit.Assert.assertNotNull(textNode4);
    }

    @Test
    public void test029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test029");
        org.jsoup.nodes.SerializedObjectSupporter serializedObjectSupporter0 = new org.jsoup.nodes.SerializedObjectSupporter();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Document document1 = serializedObjectSupporter0.deserializeObjectDocument417();
// flaky:             org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: org.jsoup.nodes.Document$OutputSettings cannot be cast to org.jsoup.nodes.Document");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
    }

    @Test
    public void test030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test030");
        org.jsoup.nodes.SerializedObjectSupporter serializedObjectSupporter0 = new org.jsoup.nodes.SerializedObjectSupporter();
        java.lang.String str1 = serializedObjectSupporter0.deserializeObjectString93();
        org.jsoup.nodes.TextNode textNode2 = serializedObjectSupporter0.deserializeObjectTextNode214();
        java.lang.StringBuilder stringBuilder3 = serializedObjectSupporter0.deserializeObjectStringBuilder143();
        java.lang.StringBuilder stringBuilder4 = serializedObjectSupporter0.deserializeObjectStringBuilder261();
        java.lang.StringBuilder stringBuilder5 = serializedObjectSupporter0.deserializeObjectStringBuilder423();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Document document6 = serializedObjectSupporter0.deserializeObjectDocument90();
// flaky:             org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: org.jsoup.nodes.Document$OutputSettings cannot be cast to org.jsoup.nodes.Document");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "More" + "'", str1, "More");
// flaky:         org.junit.Assert.assertNotNull(textNode2);
        org.junit.Assert.assertNotNull(stringBuilder3);
        org.junit.Assert.assertEquals(stringBuilder3.toString(), "<div id=\"1\"></div>\n<div id=\"2\">\n Text \n <p>One</p>");
        org.junit.Assert.assertNotNull(stringBuilder4);
        org.junit.Assert.assertEquals(stringBuilder4.toString(), "<doc>\n <val>");
        org.junit.Assert.assertNotNull(stringBuilder5);
        org.junit.Assert.assertEquals(stringBuilder5.toString(), "<p><b>One</b></p>\n<b> \n <table>\n  <tbody>\n   <tr>\n    <td><p><i>Three</i></p><p><i>Four</i></p></td>\n   </tr>\n  </tbody>\n </table> <p>");
    }

    @Test
    public void test031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test031");
        org.jsoup.nodes.SerializedObjectSupporter serializedObjectSupporter0 = new org.jsoup.nodes.SerializedObjectSupporter();
        java.lang.String str1 = serializedObjectSupporter0.deserializeObjectString93();
        java.lang.StringBuilder stringBuilder2 = serializedObjectSupporter0.deserializeObjectStringBuilder267();
        org.jsoup.nodes.TextNode textNode3 = serializedObjectSupporter0.deserializeObjectTextNode102();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Document document4 = serializedObjectSupporter0.deserializeObjectDocument39();
// flaky:             org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: org.jsoup.nodes.Document$OutputSettings cannot be cast to org.jsoup.nodes.Document");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "More" + "'", str1, "More");
        org.junit.Assert.assertNotNull(stringBuilder2);
        org.junit.Assert.assertEquals(stringBuilder2.toString(), "<doc>\n <val>");
// flaky:         org.junit.Assert.assertNotNull(textNode3);
    }

    @Test
    public void test032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test032");
        org.jsoup.nodes.SerializedObjectSupporter serializedObjectSupporter0 = new org.jsoup.nodes.SerializedObjectSupporter();
        java.lang.String str1 = serializedObjectSupporter0.deserializeObjectString93();
        org.jsoup.nodes.TextNode textNode2 = serializedObjectSupporter0.deserializeObjectTextNode214();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString109();
        org.jsoup.nodes.TextNode textNode4 = serializedObjectSupporter0.deserializeObjectTextNode408();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "More" + "'", str1, "More");
// flaky:         org.junit.Assert.assertNotNull(textNode2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "A caption" + "'", str3, "A caption");
// flaky:         org.junit.Assert.assertNotNull(textNode4);
    }

    @Test
    public void test033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test033");
        org.jsoup.nodes.SerializedObjectSupporter serializedObjectSupporter0 = new org.jsoup.nodes.SerializedObjectSupporter();
        org.jsoup.nodes.TextNode textNode1 = serializedObjectSupporter0.deserializeObjectTextNode401();
        java.lang.StringBuilder stringBuilder2 = serializedObjectSupporter0.deserializeObjectStringBuilder268();
// flaky:         org.junit.Assert.assertNotNull(textNode1);
        org.junit.Assert.assertNotNull(stringBuilder2);
        org.junit.Assert.assertEquals(stringBuilder2.toString(), "<doc>\n <val>\n  One\n  <val>");
    }

    @Test
    public void test034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test034");
        org.jsoup.nodes.SerializedObjectSupporter serializedObjectSupporter0 = new org.jsoup.nodes.SerializedObjectSupporter();
        org.jsoup.nodes.TextNode textNode1 = serializedObjectSupporter0.deserializeObjectTextNode401();
        java.lang.StringBuilder stringBuilder2 = serializedObjectSupporter0.deserializeObjectStringBuilder163();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Document document3 = serializedObjectSupporter0.deserializeObjectDocument146();
// flaky:             org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: org.jsoup.nodes.Document$OutputSettings cannot be cast to org.jsoup.nodes.Document");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
// flaky:         org.junit.Assert.assertNotNull(textNode1);
        org.junit.Assert.assertNotNull(stringBuilder2);
        org.junit.Assert.assertEquals(stringBuilder2.toString(), "<html>\n <head>\n  <title>Format test</title>\n </head>\n <body>\n  <div>\n   <p>\n    Hello \n    <span>\n     jsoup \n     <span>");
    }

    @Test
    public void test035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test035");
        org.jsoup.nodes.SerializedObjectSupporter serializedObjectSupporter0 = new org.jsoup.nodes.SerializedObjectSupporter();
        java.lang.String str1 = serializedObjectSupporter0.deserializeObjectString93();
        java.lang.StringBuilder stringBuilder2 = serializedObjectSupporter0.deserializeObjectStringBuilder36();
        java.lang.StringBuilder stringBuilder3 = serializedObjectSupporter0.deserializeObjectStringBuilder399();
        org.jsoup.nodes.TextNode textNode4 = serializedObjectSupporter0.deserializeObjectTextNode54();
        org.jsoup.nodes.TextNode textNode5 = serializedObjectSupporter0.deserializeObjectTextNode163();
        java.lang.StringBuilder stringBuilder6 = serializedObjectSupporter0.deserializeObjectStringBuilder326();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Document document7 = serializedObjectSupporter0.deserializeObjectDocument423();
// flaky:             org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: org.jsoup.nodes.Document$OutputSettings cannot be cast to org.jsoup.nodes.Document");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "More" + "'", str1, "More");
        org.junit.Assert.assertNotNull(stringBuilder2);
        org.junit.Assert.assertEquals(stringBuilder2.toString(), "<div>\n <p><b>This</b> is <b>jsoup</b>.</p>\n</div>");
        org.junit.Assert.assertNotNull(stringBuilder3);
        org.junit.Assert.assertEquals(stringBuilder3.toString(), "<table> \n <colgroup> \n  <col /> \n </colgroup>\n <colgroup> \n  <col /> \n  <col /> \n  <col /> \n </colgroup>\n <thead> \n  <tr> \n   <th> </th>\n   <th>2008 </th>\n   <th>2007 </th>\n   <th>2006 </th>\n  </tr>\n </thead>\n <tbody> \n  <tr> \n   <th scope=\"rowgroup\"> Research and development </th>\n   <td> $ 1,109 </td>\n   <td> $ 782 </td>\n   <td> $ 712 </td>\n  </tr>\n  <tr> \n   <th scope=\"row\">");
// flaky:         org.junit.Assert.assertNotNull(textNode4);
// flaky:         org.junit.Assert.assertNotNull(textNode5);
        org.junit.Assert.assertNotNull(stringBuilder6);
        org.junit.Assert.assertEquals(stringBuilder6.toString(), "<b>");
    }

    @Test
    public void test036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test036");
        org.jsoup.nodes.SerializedObjectSupporter serializedObjectSupporter0 = new org.jsoup.nodes.SerializedObjectSupporter();
        java.lang.String str1 = serializedObjectSupporter0.deserializeObjectString93();
        java.lang.StringBuilder stringBuilder2 = serializedObjectSupporter0.deserializeObjectStringBuilder215();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString128();
        org.jsoup.nodes.TextNode textNode4 = serializedObjectSupporter0.deserializeObjectTextNode186();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Document document5 = serializedObjectSupporter0.deserializeObjectDocument382();
// flaky:             org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: org.jsoup.nodes.Document$OutputSettings cannot be cast to org.jsoup.nodes.Document");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "More" + "'", str1, "More");
        org.junit.Assert.assertNotNull(stringBuilder2);
        org.junit.Assert.assertEquals(stringBuilder2.toString(), "<div id=\"1\">");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + " 12.3% " + "'", str3, " 12.3% ");
// flaky:         org.junit.Assert.assertNotNull(textNode4);
    }

    @Test
    public void test037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test037");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("hi!", "hi!");
        textNode2.text = "";
        java.lang.String str5 = textNode2.outerHtml();
        org.jsoup.nodes.Node node6 = textNode2.clone();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(node6);
    }

    @Test
    public void test038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test038");
        org.jsoup.nodes.SerializedObjectSupporter serializedObjectSupporter0 = new org.jsoup.nodes.SerializedObjectSupporter();
        java.lang.String str1 = serializedObjectSupporter0.deserializeObjectString93();
        java.lang.StringBuilder stringBuilder2 = serializedObjectSupporter0.deserializeObjectStringBuilder36();
        org.jsoup.nodes.TextNode textNode3 = serializedObjectSupporter0.deserializeObjectTextNode137();
        org.jsoup.nodes.TextNode textNode4 = serializedObjectSupporter0.deserializeObjectTextNode289();
        java.lang.StringBuilder stringBuilder5 = serializedObjectSupporter0.deserializeObjectStringBuilder23();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Document document6 = serializedObjectSupporter0.deserializeObjectDocument160();
// flaky:             org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: org.jsoup.nodes.Document$OutputSettings cannot be cast to org.jsoup.nodes.Document");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "More" + "'", str1, "More");
        org.junit.Assert.assertNotNull(stringBuilder2);
        org.junit.Assert.assertEquals(stringBuilder2.toString(), "<div>\n <p><b>This</b> is <b>jsoup</b>.</p>\n</div>");
// flaky:         org.junit.Assert.assertNotNull(textNode3);
// flaky:         org.junit.Assert.assertNotNull(textNode4);
        org.junit.Assert.assertNotNull(stringBuilder5);
        org.junit.Assert.assertEquals(stringBuilder5.toString(), "<p>This <a>is</a><span>foo</span> <a>jsoup</a><span>foo</span>");
    }

    @Test
    public void test039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test039");
        org.jsoup.nodes.SerializedObjectSupporter serializedObjectSupporter0 = new org.jsoup.nodes.SerializedObjectSupporter();
        java.lang.String str1 = serializedObjectSupporter0.deserializeObjectString93();
        java.lang.StringBuilder stringBuilder2 = serializedObjectSupporter0.deserializeObjectStringBuilder36();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Document document3 = serializedObjectSupporter0.deserializeObjectDocument182();
// flaky:             org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: org.jsoup.nodes.Document$OutputSettings cannot be cast to org.jsoup.nodes.Document");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "More" + "'", str1, "More");
        org.junit.Assert.assertNotNull(stringBuilder2);
        org.junit.Assert.assertEquals(stringBuilder2.toString(), "<div>\n <p><b>This</b> is <b>jsoup</b>.</p>\n</div>");
    }

    @Test
    public void test040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test040");
        org.jsoup.nodes.SerializedObjectSupporter serializedObjectSupporter0 = new org.jsoup.nodes.SerializedObjectSupporter();
        java.lang.String str1 = serializedObjectSupporter0.deserializeObjectString93();
        java.lang.StringBuilder stringBuilder2 = serializedObjectSupporter0.deserializeObjectStringBuilder215();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString128();
        java.lang.StringBuilder stringBuilder4 = serializedObjectSupporter0.deserializeObjectStringBuilder419();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Document document5 = serializedObjectSupporter0.deserializeObjectDocument266();
// flaky:             org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: org.jsoup.nodes.Document$OutputSettings cannot be cast to org.jsoup.nodes.Document");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "More" + "'", str1, "More");
        org.junit.Assert.assertNotNull(stringBuilder2);
        org.junit.Assert.assertEquals(stringBuilder2.toString(), "<div id=\"1\">");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + " 12.3% " + "'", str3, " 12.3% ");
        org.junit.Assert.assertNotNull(stringBuilder4);
        org.junit.Assert.assertEquals(stringBuilder4.toString(), "<p><b>One</b></p>\n<b>");
    }

    @Test
    public void test041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test041");
        org.jsoup.nodes.SerializedObjectSupporter serializedObjectSupporter0 = new org.jsoup.nodes.SerializedObjectSupporter();
        java.lang.String str1 = serializedObjectSupporter0.deserializeObjectString93();
        org.jsoup.nodes.TextNode textNode2 = serializedObjectSupporter0.deserializeObjectTextNode214();
        java.lang.StringBuilder stringBuilder3 = serializedObjectSupporter0.deserializeObjectStringBuilder19();
        java.lang.StringBuilder stringBuilder4 = serializedObjectSupporter0.deserializeObjectStringBuilder44();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "More" + "'", str1, "More");
// flaky:         org.junit.Assert.assertNotNull(textNode2);
        org.junit.Assert.assertNotNull(stringBuilder3);
        org.junit.Assert.assertEquals(stringBuilder3.toString(), "<p>This <a>is</a><span>");
        org.junit.Assert.assertNotNull(stringBuilder4);
        org.junit.Assert.assertEquals(stringBuilder4.toString(), "<a>One</a> Two Three \n<i>Four</i> Fix \n<i>");
    }

    @Test
    public void test042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test042");
        org.jsoup.nodes.SerializedObjectSupporter serializedObjectSupporter0 = new org.jsoup.nodes.SerializedObjectSupporter();
        org.jsoup.nodes.TextNode textNode1 = serializedObjectSupporter0.deserializeObjectTextNode401();
        java.lang.StringBuilder stringBuilder2 = serializedObjectSupporter0.deserializeObjectStringBuilder163();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString25();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Document document4 = serializedObjectSupporter0.deserializeObjectDocument194();
// flaky:             org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: org.jsoup.nodes.Document$OutputSettings cannot be cast to org.jsoup.nodes.Document");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
// flaky:         org.junit.Assert.assertNotNull(textNode1);
        org.junit.Assert.assertNotNull(stringBuilder2);
        org.junit.Assert.assertEquals(stringBuilder2.toString(), "<html>\n <head>\n  <title>Format test</title>\n </head>\n <body>\n  <div>\n   <p>\n    Hello \n    <span>\n     jsoup \n     <span>");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Hello " + "'", str3, "Hello ");
    }

    @Test
    public void test043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test043");
        org.jsoup.nodes.SerializedObjectSupporter serializedObjectSupporter0 = new org.jsoup.nodes.SerializedObjectSupporter();
        java.lang.String str1 = serializedObjectSupporter0.deserializeObjectString93();
        java.lang.StringBuilder stringBuilder2 = serializedObjectSupporter0.deserializeObjectStringBuilder36();
        java.lang.StringBuilder stringBuilder3 = serializedObjectSupporter0.deserializeObjectStringBuilder399();
        org.jsoup.nodes.TextNode textNode4 = serializedObjectSupporter0.deserializeObjectTextNode54();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Document document5 = serializedObjectSupporter0.deserializeObjectDocument55();
// flaky:             org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: org.jsoup.nodes.Document$OutputSettings cannot be cast to org.jsoup.nodes.Document");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "More" + "'", str1, "More");
        org.junit.Assert.assertNotNull(stringBuilder2);
        org.junit.Assert.assertEquals(stringBuilder2.toString(), "<div>\n <p><b>This</b> is <b>jsoup</b>.</p>\n</div>");
        org.junit.Assert.assertNotNull(stringBuilder3);
        org.junit.Assert.assertEquals(stringBuilder3.toString(), "<table> \n <colgroup> \n  <col /> \n </colgroup>\n <colgroup> \n  <col /> \n  <col /> \n  <col /> \n </colgroup>\n <thead> \n  <tr> \n   <th> </th>\n   <th>2008 </th>\n   <th>2007 </th>\n   <th>2006 </th>\n  </tr>\n </thead>\n <tbody> \n  <tr> \n   <th scope=\"rowgroup\"> Research and development </th>\n   <td> $ 1,109 </td>\n   <td> $ 782 </td>\n   <td> $ 712 </td>\n  </tr>\n  <tr> \n   <th scope=\"row\">");
// flaky:         org.junit.Assert.assertNotNull(textNode4);
    }

    @Test
    public void test044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test044");
        org.jsoup.nodes.SerializedObjectSupporter serializedObjectSupporter0 = new org.jsoup.nodes.SerializedObjectSupporter();
        java.lang.String str1 = serializedObjectSupporter0.deserializeObjectString93();
        org.jsoup.nodes.TextNode textNode2 = serializedObjectSupporter0.deserializeObjectTextNode214();
        java.lang.StringBuilder stringBuilder3 = serializedObjectSupporter0.deserializeObjectStringBuilder143();
        java.lang.StringBuilder stringBuilder4 = serializedObjectSupporter0.deserializeObjectStringBuilder261();
        java.lang.String str5 = serializedObjectSupporter0.deserializeObjectString63();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Document document6 = serializedObjectSupporter0.deserializeObjectDocument343();
// flaky:             org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: org.jsoup.nodes.Document$OutputSettings cannot be cast to org.jsoup.nodes.Document");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "More" + "'", str1, "More");
// flaky:         org.junit.Assert.assertNotNull(textNode2);
        org.junit.Assert.assertNotNull(stringBuilder3);
        org.junit.Assert.assertEquals(stringBuilder3.toString(), "<div id=\"1\"></div>\n<div id=\"2\">\n Text \n <p>One</p>");
        org.junit.Assert.assertNotNull(stringBuilder4);
        org.junit.Assert.assertEquals(stringBuilder4.toString(), "<doc>\n <val>");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "two &" + "'", str5, "two &");
    }

    @Test
    public void test045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test045");
        org.jsoup.nodes.SerializedObjectSupporter serializedObjectSupporter0 = new org.jsoup.nodes.SerializedObjectSupporter();
        java.lang.String str1 = serializedObjectSupporter0.deserializeObjectString93();
        java.lang.StringBuilder stringBuilder2 = serializedObjectSupporter0.deserializeObjectStringBuilder267();
        org.jsoup.nodes.TextNode textNode3 = serializedObjectSupporter0.deserializeObjectTextNode102();
        java.lang.StringBuilder stringBuilder4 = serializedObjectSupporter0.deserializeObjectStringBuilder26();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Document document5 = serializedObjectSupporter0.deserializeObjectDocument246();
// flaky:             org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: org.jsoup.nodes.Document$OutputSettings cannot be cast to org.jsoup.nodes.Document");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "More" + "'", str1, "More");
        org.junit.Assert.assertNotNull(stringBuilder2);
        org.junit.Assert.assertEquals(stringBuilder2.toString(), "<doc>\n <val>");
// flaky:         org.junit.Assert.assertNotNull(textNode3);
        org.junit.Assert.assertNotNull(stringBuilder4);
        org.junit.Assert.assertEquals(stringBuilder4.toString(), "<div>\n <p>");
    }

    @Test
    public void test046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test046");
        org.jsoup.nodes.SerializedObjectSupporter serializedObjectSupporter0 = new org.jsoup.nodes.SerializedObjectSupporter();
        java.lang.String str1 = serializedObjectSupporter0.deserializeObjectString93();
        org.jsoup.nodes.TextNode textNode2 = serializedObjectSupporter0.deserializeObjectTextNode214();
        java.lang.StringBuilder stringBuilder3 = serializedObjectSupporter0.deserializeObjectStringBuilder143();
        java.lang.StringBuilder stringBuilder4 = serializedObjectSupporter0.deserializeObjectStringBuilder261();
        org.jsoup.nodes.TextNode textNode5 = serializedObjectSupporter0.deserializeObjectTextNode255();
        org.jsoup.nodes.TextNode textNode6 = serializedObjectSupporter0.deserializeObjectTextNode421();
        java.lang.String str8 = null; // flaky: textNode6.attr(" Research and development ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "More" + "'", str1, "More");
// flaky:         org.junit.Assert.assertNotNull(textNode2);
        org.junit.Assert.assertNotNull(stringBuilder3);
        org.junit.Assert.assertEquals(stringBuilder3.toString(), "<div id=\"1\"></div>\n<div id=\"2\">\n Text \n <p>One</p>");
        org.junit.Assert.assertNotNull(stringBuilder4);
        org.junit.Assert.assertEquals(stringBuilder4.toString(), "<doc>\n <val>");
// flaky:         org.junit.Assert.assertNotNull(textNode5);
// flaky:         org.junit.Assert.assertNotNull(textNode6);
// flaky:         org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
    }

    @Test
    public void test047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test047");
        org.jsoup.nodes.SerializedObjectSupporter serializedObjectSupporter0 = new org.jsoup.nodes.SerializedObjectSupporter();
        java.lang.String str1 = serializedObjectSupporter0.deserializeObjectString93();
        java.lang.StringBuilder stringBuilder2 = serializedObjectSupporter0.deserializeObjectStringBuilder36();
        org.jsoup.nodes.TextNode textNode3 = serializedObjectSupporter0.deserializeObjectTextNode102();
        java.lang.StringBuilder stringBuilder4 = serializedObjectSupporter0.deserializeObjectStringBuilder101();
        java.lang.StringBuilder stringBuilder5 = serializedObjectSupporter0.deserializeObjectStringBuilder190();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "More" + "'", str1, "More");
        org.junit.Assert.assertNotNull(stringBuilder2);
        org.junit.Assert.assertEquals(stringBuilder2.toString(), "<div>\n <p><b>This</b> is <b>jsoup</b>.</p>\n</div>");
// flaky:         org.junit.Assert.assertNotNull(textNode3);
        org.junit.Assert.assertNotNull(stringBuilder4);
        org.junit.Assert.assertEquals(stringBuilder4.toString(), "<div>\n <p>One</p>\n <p><span>");
        org.junit.Assert.assertNotNull(stringBuilder5);
        org.junit.Assert.assertEquals(stringBuilder5.toString(), "<p>One <em>four</em><b>");
    }

    @Test
    public void test048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test048");
        org.jsoup.nodes.SerializedObjectSupporter serializedObjectSupporter0 = new org.jsoup.nodes.SerializedObjectSupporter();
        java.lang.String str1 = serializedObjectSupporter0.deserializeObjectString93();
        org.jsoup.nodes.TextNode textNode2 = serializedObjectSupporter0.deserializeObjectTextNode214();
        java.lang.StringBuilder stringBuilder3 = serializedObjectSupporter0.deserializeObjectStringBuilder143();
        java.lang.StringBuilder stringBuilder4 = serializedObjectSupporter0.deserializeObjectStringBuilder261();
        org.jsoup.nodes.TextNode textNode5 = serializedObjectSupporter0.deserializeObjectTextNode255();
        org.jsoup.nodes.TextNode textNode6 = serializedObjectSupporter0.deserializeObjectTextNode346();
        java.lang.String str7 = serializedObjectSupporter0.deserializeObjectString86();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "More" + "'", str1, "More");
// flaky:         org.junit.Assert.assertNotNull(textNode2);
        org.junit.Assert.assertNotNull(stringBuilder3);
        org.junit.Assert.assertEquals(stringBuilder3.toString(), "<div id=\"1\"></div>\n<div id=\"2\">\n Text \n <p>One</p>");
        org.junit.Assert.assertNotNull(stringBuilder4);
        org.junit.Assert.assertEquals(stringBuilder4.toString(), "<doc>\n <val>");
// flaky:         org.junit.Assert.assertNotNull(textNode5);
// flaky:         org.junit.Assert.assertNotNull(textNode6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Def" + "'", str7, "Def");
    }

    @Test
    public void test049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test049");
        org.jsoup.nodes.SerializedObjectSupporter serializedObjectSupporter0 = new org.jsoup.nodes.SerializedObjectSupporter();
        java.lang.String str1 = serializedObjectSupporter0.deserializeObjectString93();
        java.lang.StringBuilder stringBuilder2 = serializedObjectSupporter0.deserializeObjectStringBuilder215();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Document document3 = serializedObjectSupporter0.deserializeObjectDocument170();
// flaky:             org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: org.jsoup.nodes.Document$OutputSettings cannot be cast to org.jsoup.nodes.Document");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "More" + "'", str1, "More");
        org.junit.Assert.assertNotNull(stringBuilder2);
        org.junit.Assert.assertEquals(stringBuilder2.toString(), "<div id=\"1\">");
    }

    @Test
    public void test050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test050");
        org.jsoup.nodes.SerializedObjectSupporter serializedObjectSupporter0 = new org.jsoup.nodes.SerializedObjectSupporter();
        java.lang.String str1 = serializedObjectSupporter0.deserializeObjectString93();
        java.lang.StringBuilder stringBuilder2 = serializedObjectSupporter0.deserializeObjectStringBuilder267();
        org.jsoup.nodes.TextNode textNode3 = serializedObjectSupporter0.deserializeObjectTextNode102();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Document document4 = serializedObjectSupporter0.deserializeObjectDocument58();
// flaky:             org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: org.jsoup.nodes.Document$OutputSettings cannot be cast to org.jsoup.nodes.Document");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "More" + "'", str1, "More");
        org.junit.Assert.assertNotNull(stringBuilder2);
        org.junit.Assert.assertEquals(stringBuilder2.toString(), "<doc>\n <val>");
// flaky:         org.junit.Assert.assertNotNull(textNode3);
    }

    @Test
    public void test051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test051");
        org.jsoup.nodes.SerializedObjectSupporter serializedObjectSupporter0 = new org.jsoup.nodes.SerializedObjectSupporter();
        java.lang.String str1 = serializedObjectSupporter0.deserializeObjectString93();
        java.lang.StringBuilder stringBuilder2 = serializedObjectSupporter0.deserializeObjectStringBuilder215();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString128();
        java.lang.StringBuilder stringBuilder4 = serializedObjectSupporter0.deserializeObjectStringBuilder419();
        java.lang.String str5 = serializedObjectSupporter0.deserializeObjectString34();
        org.jsoup.nodes.TextNode textNode6 = serializedObjectSupporter0.deserializeObjectTextNode185();
        org.jsoup.nodes.Node node7 = null; // flaky: textNode6.unwrap();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "More" + "'", str1, "More");
        org.junit.Assert.assertNotNull(stringBuilder2);
        org.junit.Assert.assertEquals(stringBuilder2.toString(), "<div id=\"1\">");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + " 12.3% " + "'", str3, " 12.3% ");
        org.junit.Assert.assertNotNull(stringBuilder4);
        org.junit.Assert.assertEquals(stringBuilder4.toString(), "<p><b>One</b></p>\n<b>");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "< > & \" ' \327" + "'", str5, "< > & \" ' \327");
// flaky:         org.junit.Assert.assertNotNull(textNode6);
        org.junit.Assert.assertNull(node7);
    }

    @Test
    public void test052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test052");
        org.jsoup.nodes.SerializedObjectSupporter serializedObjectSupporter0 = new org.jsoup.nodes.SerializedObjectSupporter();
        java.lang.String str1 = serializedObjectSupporter0.deserializeObjectString93();
        org.jsoup.nodes.TextNode textNode2 = serializedObjectSupporter0.deserializeObjectTextNode214();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString109();
        org.jsoup.nodes.TextNode textNode4 = serializedObjectSupporter0.deserializeObjectTextNode86();
        org.jsoup.nodes.TextNode textNode5 = serializedObjectSupporter0.deserializeObjectTextNode143();
        java.lang.StringBuilder stringBuilder6 = serializedObjectSupporter0.deserializeObjectStringBuilder162();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "More" + "'", str1, "More");
// flaky:         org.junit.Assert.assertNotNull(textNode2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "A caption" + "'", str3, "A caption");
// flaky:         org.junit.Assert.assertNotNull(textNode4);
// flaky:         org.junit.Assert.assertNotNull(textNode5);
        org.junit.Assert.assertNotNull(stringBuilder6);
        org.junit.Assert.assertEquals(stringBuilder6.toString(), "<html>\n <head>\n  <title>Format test</title>\n </head>\n <body>\n  <div>\n   <p>\n    Hello \n    <span>");
    }

    @Test
    public void test053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test053");
        org.jsoup.nodes.SerializedObjectSupporter serializedObjectSupporter0 = new org.jsoup.nodes.SerializedObjectSupporter();
        org.jsoup.nodes.TextNode textNode1 = serializedObjectSupporter0.deserializeObjectTextNode401();
        java.lang.StringBuilder stringBuilder2 = serializedObjectSupporter0.deserializeObjectStringBuilder60();
        java.lang.StringBuilder stringBuilder3 = serializedObjectSupporter0.deserializeObjectStringBuilder114();
        java.lang.StringBuilder stringBuilder4 = serializedObjectSupporter0.deserializeObjectStringBuilder238();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Document document5 = serializedObjectSupporter0.deserializeObjectDocument24();
// flaky:             org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: org.jsoup.nodes.Document$OutputSettings cannot be cast to org.jsoup.nodes.Document");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
// flaky:         org.junit.Assert.assertNotNull(textNode1);
        org.junit.Assert.assertNotNull(stringBuilder2);
        org.junit.Assert.assertEquals(stringBuilder2.toString(), "<html>\n <head>\n  <script>one</script>\n  <noscript></noscript>\n </head>\n <body>\n  <p>");
        org.junit.Assert.assertNotNull(stringBuilder3);
        org.junit.Assert.assertEquals(stringBuilder3.toString(), "\nthere &amp; now &gt; \n<p>");
        org.junit.Assert.assertNotNull(stringBuilder4);
        org.junit.Assert.assertEquals(stringBuilder4.toString(), "<img src=\"cid:12345\" />");
    }

    @Test
    public void test054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test054");
        org.jsoup.nodes.SerializedObjectSupporter serializedObjectSupporter0 = new org.jsoup.nodes.SerializedObjectSupporter();
        java.lang.String str1 = serializedObjectSupporter0.deserializeObjectString93();
        org.jsoup.nodes.TextNode textNode2 = serializedObjectSupporter0.deserializeObjectTextNode214();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString109();
        org.jsoup.nodes.TextNode textNode4 = serializedObjectSupporter0.deserializeObjectTextNode86();
        org.jsoup.nodes.TextNode textNode5 = serializedObjectSupporter0.deserializeObjectTextNode194();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "More" + "'", str1, "More");
// flaky:         org.junit.Assert.assertNotNull(textNode2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "A caption" + "'", str3, "A caption");
// flaky:         org.junit.Assert.assertNotNull(textNode4);
// flaky:         org.junit.Assert.assertNotNull(textNode5);
    }

    @Test
    public void test055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test055");
        org.jsoup.nodes.SerializedObjectSupporter serializedObjectSupporter0 = new org.jsoup.nodes.SerializedObjectSupporter();
        java.lang.String str1 = serializedObjectSupporter0.deserializeObjectString93();
        java.lang.StringBuilder stringBuilder2 = serializedObjectSupporter0.deserializeObjectStringBuilder36();
        org.jsoup.nodes.TextNode textNode3 = serializedObjectSupporter0.deserializeObjectTextNode137();
        org.jsoup.nodes.TextNode textNode4 = serializedObjectSupporter0.deserializeObjectTextNode289();
        java.lang.StringBuilder stringBuilder5 = serializedObjectSupporter0.deserializeObjectStringBuilder23();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Document document6 = serializedObjectSupporter0.deserializeObjectDocument183();
// flaky:             org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: org.jsoup.nodes.Document$OutputSettings cannot be cast to org.jsoup.nodes.Document");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "More" + "'", str1, "More");
        org.junit.Assert.assertNotNull(stringBuilder2);
        org.junit.Assert.assertEquals(stringBuilder2.toString(), "<div>\n <p><b>This</b> is <b>jsoup</b>.</p>\n</div>");
// flaky:         org.junit.Assert.assertNotNull(textNode3);
// flaky:         org.junit.Assert.assertNotNull(textNode4);
        org.junit.Assert.assertNotNull(stringBuilder5);
        org.junit.Assert.assertEquals(stringBuilder5.toString(), "<p>This <a>is</a><span>foo</span> <a>jsoup</a><span>foo</span>");
    }

    @Test
    public void test056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test056");
        org.jsoup.nodes.SerializedObjectSupporter serializedObjectSupporter0 = new org.jsoup.nodes.SerializedObjectSupporter();
        java.lang.String str1 = serializedObjectSupporter0.deserializeObjectString93();
        java.lang.StringBuilder stringBuilder2 = serializedObjectSupporter0.deserializeObjectStringBuilder36();
        org.jsoup.nodes.TextNode textNode3 = serializedObjectSupporter0.deserializeObjectTextNode137();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Document document4 = serializedObjectSupporter0.deserializeObjectDocument120();
// flaky:             org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: org.jsoup.nodes.Document$OutputSettings cannot be cast to org.jsoup.nodes.Document");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "More" + "'", str1, "More");
        org.junit.Assert.assertNotNull(stringBuilder2);
        org.junit.Assert.assertEquals(stringBuilder2.toString(), "<div>\n <p><b>This</b> is <b>jsoup</b>.</p>\n</div>");
// flaky:         org.junit.Assert.assertNotNull(textNode3);
    }

    @Test
    public void test057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test057");
        org.jsoup.nodes.SerializedObjectSupporter serializedObjectSupporter0 = new org.jsoup.nodes.SerializedObjectSupporter();
        java.lang.String str1 = serializedObjectSupporter0.deserializeObjectString93();
        java.lang.StringBuilder stringBuilder2 = serializedObjectSupporter0.deserializeObjectStringBuilder215();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString128();
        java.lang.StringBuilder stringBuilder4 = serializedObjectSupporter0.deserializeObjectStringBuilder419();
        java.lang.String str5 = serializedObjectSupporter0.deserializeObjectString34();
        org.jsoup.nodes.TextNode textNode6 = serializedObjectSupporter0.deserializeObjectTextNode217();
        org.jsoup.nodes.TextNode textNode7 = serializedObjectSupporter0.deserializeObjectTextNode140();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "More" + "'", str1, "More");
        org.junit.Assert.assertNotNull(stringBuilder2);
        org.junit.Assert.assertEquals(stringBuilder2.toString(), "<div id=\"1\">");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + " 12.3% " + "'", str3, " 12.3% ");
        org.junit.Assert.assertNotNull(stringBuilder4);
        org.junit.Assert.assertEquals(stringBuilder4.toString(), "<p><b>One</b></p>\n<b>");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "< > & \" ' \327" + "'", str5, "< > & \" ' \327");
// flaky:         org.junit.Assert.assertNotNull(textNode6);
// flaky:         org.junit.Assert.assertNotNull(textNode7);
    }

    @Test
    public void test058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test058");
        org.jsoup.nodes.SerializedObjectSupporter serializedObjectSupporter0 = new org.jsoup.nodes.SerializedObjectSupporter();
        java.lang.String str1 = serializedObjectSupporter0.deserializeObjectString93();
        org.jsoup.nodes.TextNode textNode2 = serializedObjectSupporter0.deserializeObjectTextNode214();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString109();
        org.jsoup.nodes.TextNode textNode4 = serializedObjectSupporter0.deserializeObjectTextNode86();
        org.jsoup.nodes.TextNode textNode5 = serializedObjectSupporter0.deserializeObjectTextNode143();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Document document6 = serializedObjectSupporter0.deserializeObjectDocument397();
// flaky:             org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: org.jsoup.nodes.Document$OutputSettings cannot be cast to org.jsoup.nodes.Document");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "More" + "'", str1, "More");
// flaky:         org.junit.Assert.assertNotNull(textNode2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "A caption" + "'", str3, "A caption");
// flaky:         org.junit.Assert.assertNotNull(textNode4);
// flaky:         org.junit.Assert.assertNotNull(textNode5);
    }

    @Test
    public void test059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test059");
        org.jsoup.nodes.SerializedObjectSupporter serializedObjectSupporter0 = new org.jsoup.nodes.SerializedObjectSupporter();
        org.jsoup.nodes.TextNode textNode1 = serializedObjectSupporter0.deserializeObjectTextNode401();
        org.jsoup.nodes.TextNode textNode2 = serializedObjectSupporter0.deserializeObjectTextNode376();
        org.jsoup.nodes.TextNode textNode3 = serializedObjectSupporter0.deserializeObjectTextNode145();
        java.lang.StringBuilder stringBuilder4 = serializedObjectSupporter0.deserializeObjectStringBuilder373();
        org.jsoup.nodes.TextNode textNode5 = serializedObjectSupporter0.deserializeObjectTextNode344();
        org.jsoup.nodes.TextNode textNode6 = serializedObjectSupporter0.deserializeObjectTextNode416();
        java.lang.String str7 = null; // flaky: textNode6.baseUri();
// flaky:         org.junit.Assert.assertNotNull(textNode1);
// flaky:         org.junit.Assert.assertNotNull(textNode2);
// flaky:         org.junit.Assert.assertNotNull(textNode3);
        org.junit.Assert.assertNotNull(stringBuilder4);
        org.junit.Assert.assertEquals(stringBuilder4.toString(), "");
// flaky:         org.junit.Assert.assertNotNull(textNode5);
// flaky:         org.junit.Assert.assertNotNull(textNode6);
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
    }

    @Test
    public void test060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test060");
        org.jsoup.nodes.SerializedObjectSupporter serializedObjectSupporter0 = new org.jsoup.nodes.SerializedObjectSupporter();
        java.lang.String str1 = serializedObjectSupporter0.deserializeObjectString93();
        java.lang.StringBuilder stringBuilder2 = serializedObjectSupporter0.deserializeObjectStringBuilder36();
        org.jsoup.nodes.TextNode textNode3 = serializedObjectSupporter0.deserializeObjectTextNode102();
        org.jsoup.nodes.TextNode textNode4 = serializedObjectSupporter0.deserializeObjectTextNode270();
        java.lang.String str5 = serializedObjectSupporter0.deserializeObjectString22();
        java.lang.StringBuilder stringBuilder6 = serializedObjectSupporter0.deserializeObjectStringBuilder88();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "More" + "'", str1, "More");
        org.junit.Assert.assertNotNull(stringBuilder2);
        org.junit.Assert.assertEquals(stringBuilder2.toString(), "<div>\n <p><b>This</b> is <b>jsoup</b>.</p>\n</div>");
// flaky:         org.junit.Assert.assertNotNull(textNode3);
// flaky:         org.junit.Assert.assertNotNull(textNode4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Four" + "'", str5, "Four");
        org.junit.Assert.assertNotNull(stringBuilder6);
        org.junit.Assert.assertEquals(stringBuilder6.toString(), "<div>\n <p>Hello</p>\n <div>");
    }

    @Test
    public void test061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test061");
        org.jsoup.nodes.SerializedObjectSupporter serializedObjectSupporter0 = new org.jsoup.nodes.SerializedObjectSupporter();
        java.lang.String str1 = serializedObjectSupporter0.deserializeObjectString93();
        java.lang.StringBuilder stringBuilder2 = serializedObjectSupporter0.deserializeObjectStringBuilder145();
        org.jsoup.nodes.TextNode textNode3 = serializedObjectSupporter0.deserializeObjectTextNode197();
        java.lang.StringBuilder stringBuilder4 = serializedObjectSupporter0.deserializeObjectStringBuilder407();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Document document5 = serializedObjectSupporter0.deserializeObjectDocument132();
// flaky:             org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: org.jsoup.nodes.Document$OutputSettings cannot be cast to org.jsoup.nodes.Document");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "More" + "'", str1, "More");
        org.junit.Assert.assertNotNull(stringBuilder2);
        org.junit.Assert.assertEquals(stringBuilder2.toString(), "<div id=\"1\">");
// flaky:         org.junit.Assert.assertNotNull(textNode3);
        org.junit.Assert.assertNotNull(stringBuilder4);
        org.junit.Assert.assertEquals(stringBuilder4.toString(), "<table> \n <colgroup> \n  <col /> \n </colgroup>\n <colgroup> \n  <col /> \n  <col /> \n  <col /> \n </colgroup>\n <thead> \n  <tr> \n   <th> </th>\n   <th>2008 </th>\n   <th>2007 </th>\n   <th>2006 </th>\n  </tr>\n </thead>\n <tbody> \n  <tr> \n   <th scope=\"rowgroup\"> Research and development </th>\n   <td> $ 1,109 </td>\n   <td> $ 782 </td>\n   <td> $ 712 </td>\n  </tr>\n  <tr> \n   <th scope=\"row\"> Percentage of net sales </th>\n   <td> 3.4% </td>\n   <td> 3.3% </td>\n   <td> 3.7% </td>\n  </tr>\n </tbody>\n <tbody> \n  <tr> \n   <th scope=\"rowgroup\"> Selling, general, and administrative </th>\n   <td> $ 3,761 </td>\n   <td>");
    }

    @Test
    public void test062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test062");
        org.jsoup.nodes.SerializedObjectSupporter serializedObjectSupporter0 = new org.jsoup.nodes.SerializedObjectSupporter();
        java.lang.String str1 = serializedObjectSupporter0.deserializeObjectString93();
        org.jsoup.nodes.TextNode textNode2 = serializedObjectSupporter0.deserializeObjectTextNode214();
        java.lang.StringBuilder stringBuilder3 = serializedObjectSupporter0.deserializeObjectStringBuilder143();
        java.lang.StringBuilder stringBuilder4 = serializedObjectSupporter0.deserializeObjectStringBuilder261();
        org.jsoup.nodes.TextNode textNode5 = serializedObjectSupporter0.deserializeObjectTextNode255();
        org.jsoup.nodes.Node node8 = null; // flaky: textNode5.attr("Check", "now");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "More" + "'", str1, "More");
// flaky:         org.junit.Assert.assertNotNull(textNode2);
        org.junit.Assert.assertNotNull(stringBuilder3);
        org.junit.Assert.assertEquals(stringBuilder3.toString(), "<div id=\"1\"></div>\n<div id=\"2\">\n Text \n <p>One</p>");
        org.junit.Assert.assertNotNull(stringBuilder4);
        org.junit.Assert.assertEquals(stringBuilder4.toString(), "<doc>\n <val>");
// flaky:         org.junit.Assert.assertNotNull(textNode5);
// flaky:         org.junit.Assert.assertNotNull(node8);
    }

    @Test
    public void test063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test063");
        org.jsoup.nodes.SerializedObjectSupporter serializedObjectSupporter0 = new org.jsoup.nodes.SerializedObjectSupporter();
        java.lang.String str1 = serializedObjectSupporter0.deserializeObjectString93();
        java.lang.StringBuilder stringBuilder2 = serializedObjectSupporter0.deserializeObjectStringBuilder36();
        org.jsoup.nodes.TextNode textNode3 = serializedObjectSupporter0.deserializeObjectTextNode137();
        org.jsoup.nodes.TextNode textNode4 = serializedObjectSupporter0.deserializeObjectTextNode289();
        java.lang.StringBuilder stringBuilder5 = serializedObjectSupporter0.deserializeObjectStringBuilder23();
        org.jsoup.nodes.TextNode textNode6 = serializedObjectSupporter0.deserializeObjectTextNode278();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Document document7 = serializedObjectSupporter0.deserializeObjectDocument382();
// flaky:             org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: org.jsoup.nodes.Document$OutputSettings cannot be cast to org.jsoup.nodes.Document");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "More" + "'", str1, "More");
        org.junit.Assert.assertNotNull(stringBuilder2);
        org.junit.Assert.assertEquals(stringBuilder2.toString(), "<div>\n <p><b>This</b> is <b>jsoup</b>.</p>\n</div>");
// flaky:         org.junit.Assert.assertNotNull(textNode3);
// flaky:         org.junit.Assert.assertNotNull(textNode4);
        org.junit.Assert.assertNotNull(stringBuilder5);
        org.junit.Assert.assertEquals(stringBuilder5.toString(), "<p>This <a>is</a><span>foo</span> <a>jsoup</a><span>foo</span>");
// flaky:         org.junit.Assert.assertNotNull(textNode6);
    }

    @Test
    public void test064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test064");
        org.jsoup.nodes.SerializedObjectSupporter serializedObjectSupporter0 = new org.jsoup.nodes.SerializedObjectSupporter();
        java.lang.String str1 = serializedObjectSupporter0.deserializeObjectString93();
        org.jsoup.nodes.TextNode textNode2 = serializedObjectSupporter0.deserializeObjectTextNode214();
        java.lang.StringBuilder stringBuilder3 = serializedObjectSupporter0.deserializeObjectStringBuilder143();
        java.lang.StringBuilder stringBuilder4 = serializedObjectSupporter0.deserializeObjectStringBuilder261();
        org.jsoup.nodes.TextNode textNode5 = serializedObjectSupporter0.deserializeObjectTextNode255();
        org.jsoup.nodes.TextNode textNode6 = serializedObjectSupporter0.deserializeObjectTextNode421();
        org.jsoup.nodes.TextNode textNode7 = serializedObjectSupporter0.deserializeObjectTextNode251();
        org.jsoup.nodes.TextNode textNode8 = serializedObjectSupporter0.deserializeObjectTextNode79();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Document document9 = serializedObjectSupporter0.deserializeObjectDocument343();
// flaky:             org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: org.jsoup.nodes.Document$OutputSettings cannot be cast to org.jsoup.nodes.Document");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "More" + "'", str1, "More");
// flaky:         org.junit.Assert.assertNotNull(textNode2);
        org.junit.Assert.assertNotNull(stringBuilder3);
        org.junit.Assert.assertEquals(stringBuilder3.toString(), "<div id=\"1\"></div>\n<div id=\"2\">\n Text \n <p>One</p>");
        org.junit.Assert.assertNotNull(stringBuilder4);
        org.junit.Assert.assertEquals(stringBuilder4.toString(), "<doc>\n <val>");
// flaky:         org.junit.Assert.assertNotNull(textNode5);
// flaky:         org.junit.Assert.assertNotNull(textNode6);
// flaky:         org.junit.Assert.assertNotNull(textNode7);
// flaky:         org.junit.Assert.assertNotNull(textNode8);
    }

    @Test
    public void test065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test065");
        org.jsoup.nodes.Document.OutputSettings outputSettings0 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Entities.EscapeMode escapeMode1 = null;
        outputSettings0.setescapeMode(escapeMode1);
        org.jsoup.nodes.Entities.EscapeMode escapeMode3 = outputSettings0.escapeMode;
        org.junit.Assert.assertNull(escapeMode3);
    }

    @Test
    public void test066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test066");
        org.jsoup.nodes.SerializedObjectSupporter serializedObjectSupporter0 = new org.jsoup.nodes.SerializedObjectSupporter();
        java.lang.String str1 = serializedObjectSupporter0.deserializeObjectString93();
        org.jsoup.nodes.TextNode textNode2 = serializedObjectSupporter0.deserializeObjectTextNode214();
        java.lang.StringBuilder stringBuilder3 = serializedObjectSupporter0.deserializeObjectStringBuilder19();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Document document4 = serializedObjectSupporter0.deserializeObjectDocument10();
// flaky:             org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: org.jsoup.nodes.Document$OutputSettings cannot be cast to org.jsoup.nodes.Document");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "More" + "'", str1, "More");
// flaky:         org.junit.Assert.assertNotNull(textNode2);
        org.junit.Assert.assertNotNull(stringBuilder3);
        org.junit.Assert.assertEquals(stringBuilder3.toString(), "<p>This <a>is</a><span>");
    }

    @Test
    public void test067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test067");
        java.lang.String str0 = org.jsoup.nodes.TextNode.TEXT_KEY;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "text" + "'", str0, "text");
    }

    @Test
    public void test068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test068");
        org.jsoup.nodes.SerializedObjectSupporter serializedObjectSupporter0 = new org.jsoup.nodes.SerializedObjectSupporter();
        java.lang.String str1 = serializedObjectSupporter0.deserializeObjectString93();
        java.lang.StringBuilder stringBuilder2 = serializedObjectSupporter0.deserializeObjectStringBuilder267();
        org.jsoup.nodes.TextNode textNode3 = serializedObjectSupporter0.deserializeObjectTextNode102();
        java.lang.String str4 = null; // flaky: textNode3.toString();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "More" + "'", str1, "More");
        org.junit.Assert.assertNotNull(stringBuilder2);
        org.junit.Assert.assertEquals(stringBuilder2.toString(), "<doc>\n <val>");
// flaky:         org.junit.Assert.assertNotNull(textNode3);
// flaky:         org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Two" + "'", str4, "Two");
    }

    @Test
    public void test069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test069");
        org.jsoup.nodes.SerializedObjectSupporter serializedObjectSupporter0 = new org.jsoup.nodes.SerializedObjectSupporter();
        org.jsoup.nodes.TextNode textNode1 = serializedObjectSupporter0.deserializeObjectTextNode401();
        java.lang.StringBuilder stringBuilder2 = serializedObjectSupporter0.deserializeObjectStringBuilder60();
        java.lang.StringBuilder stringBuilder3 = serializedObjectSupporter0.deserializeObjectStringBuilder427();
// flaky:         org.junit.Assert.assertNotNull(textNode1);
        org.junit.Assert.assertNotNull(stringBuilder2);
        org.junit.Assert.assertEquals(stringBuilder2.toString(), "<html>\n <head>\n  <script>one</script>\n  <noscript></noscript>\n </head>\n <body>\n  <p>");
        org.junit.Assert.assertNotNull(stringBuilder3);
        org.junit.Assert.assertEquals(stringBuilder3.toString(), "");
    }

    @Test
    public void test070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test070");
        org.jsoup.nodes.SerializedObjectSupporter serializedObjectSupporter0 = new org.jsoup.nodes.SerializedObjectSupporter();
        org.jsoup.nodes.TextNode textNode1 = serializedObjectSupporter0.deserializeObjectTextNode401();
        java.lang.StringBuilder stringBuilder2 = serializedObjectSupporter0.deserializeObjectStringBuilder163();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Document document3 = serializedObjectSupporter0.deserializeObjectDocument271();
// flaky:             org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: org.jsoup.nodes.Document$OutputSettings cannot be cast to org.jsoup.nodes.Document");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
// flaky:         org.junit.Assert.assertNotNull(textNode1);
        org.junit.Assert.assertNotNull(stringBuilder2);
        org.junit.Assert.assertEquals(stringBuilder2.toString(), "<html>\n <head>\n  <title>Format test</title>\n </head>\n <body>\n  <div>\n   <p>\n    Hello \n    <span>\n     jsoup \n     <span>");
    }

    @Test
    public void test071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test071");
        org.jsoup.nodes.SerializedObjectSupporter serializedObjectSupporter0 = new org.jsoup.nodes.SerializedObjectSupporter();
        java.lang.String str1 = serializedObjectSupporter0.deserializeObjectString93();
        org.jsoup.nodes.TextNode textNode2 = serializedObjectSupporter0.deserializeObjectTextNode214();
        java.lang.StringBuilder stringBuilder3 = serializedObjectSupporter0.deserializeObjectStringBuilder143();
        java.lang.StringBuilder stringBuilder4 = serializedObjectSupporter0.deserializeObjectStringBuilder261();
        org.jsoup.nodes.TextNode textNode5 = serializedObjectSupporter0.deserializeObjectTextNode255();
        org.jsoup.nodes.TextNode textNode6 = serializedObjectSupporter0.deserializeObjectTextNode421();
        org.jsoup.nodes.TextNode textNode7 = serializedObjectSupporter0.deserializeObjectTextNode251();
        java.lang.StringBuilder stringBuilder8 = serializedObjectSupporter0.deserializeObjectStringBuilder232();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Document document9 = serializedObjectSupporter0.deserializeObjectDocument157();
// flaky:             org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: org.jsoup.nodes.Document$OutputSettings cannot be cast to org.jsoup.nodes.Document");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "More" + "'", str1, "More");
// flaky:         org.junit.Assert.assertNotNull(textNode2);
        org.junit.Assert.assertNotNull(stringBuilder3);
        org.junit.Assert.assertEquals(stringBuilder3.toString(), "<div id=\"1\"></div>\n<div id=\"2\">\n Text \n <p>One</p>");
        org.junit.Assert.assertNotNull(stringBuilder4);
        org.junit.Assert.assertEquals(stringBuilder4.toString(), "<doc>\n <val>");
// flaky:         org.junit.Assert.assertNotNull(textNode5);
// flaky:         org.junit.Assert.assertNotNull(textNode6);
// flaky:         org.junit.Assert.assertNotNull(textNode7);
        org.junit.Assert.assertNotNull(stringBuilder8);
        org.junit.Assert.assertEquals(stringBuilder8.toString(), "<p><a rel=\"nofollow\">Dodgy</a> <a href=\"http://nice.com\" rel=\"nofollow\">Nice</a></p>\n<blockquote>");
    }

    @Test
    public void test072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test072");
        org.jsoup.nodes.SerializedObjectSupporter serializedObjectSupporter0 = new org.jsoup.nodes.SerializedObjectSupporter();
        org.jsoup.nodes.TextNode textNode1 = serializedObjectSupporter0.deserializeObjectTextNode401();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Document document2 = serializedObjectSupporter0.deserializeObjectDocument235();
// flaky:             org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: org.jsoup.nodes.Document$OutputSettings cannot be cast to org.jsoup.nodes.Document");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
// flaky:         org.junit.Assert.assertNotNull(textNode1);
    }

    @Test
    public void test073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test073");
        org.jsoup.nodes.SerializedObjectSupporter serializedObjectSupporter0 = new org.jsoup.nodes.SerializedObjectSupporter();
        java.lang.String str1 = serializedObjectSupporter0.deserializeObjectString93();
        java.lang.StringBuilder stringBuilder2 = serializedObjectSupporter0.deserializeObjectStringBuilder36();
        org.jsoup.nodes.TextNode textNode3 = serializedObjectSupporter0.deserializeObjectTextNode137();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Document document4 = serializedObjectSupporter0.deserializeObjectDocument334();
// flaky:             org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: org.jsoup.nodes.Document$OutputSettings cannot be cast to org.jsoup.nodes.Document");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "More" + "'", str1, "More");
        org.junit.Assert.assertNotNull(stringBuilder2);
        org.junit.Assert.assertEquals(stringBuilder2.toString(), "<div>\n <p><b>This</b> is <b>jsoup</b>.</p>\n</div>");
// flaky:         org.junit.Assert.assertNotNull(textNode3);
    }

    @Test
    public void test074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test074");
        org.jsoup.nodes.SerializedObjectSupporter serializedObjectSupporter0 = new org.jsoup.nodes.SerializedObjectSupporter();
        org.jsoup.nodes.TextNode textNode1 = serializedObjectSupporter0.deserializeObjectTextNode401();
        java.lang.StringBuilder stringBuilder2 = serializedObjectSupporter0.deserializeObjectStringBuilder163();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString25();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Document document4 = serializedObjectSupporter0.deserializeObjectDocument44();
// flaky:             org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: org.jsoup.nodes.Document$OutputSettings cannot be cast to org.jsoup.nodes.Document");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
// flaky:         org.junit.Assert.assertNotNull(textNode1);
        org.junit.Assert.assertNotNull(stringBuilder2);
        org.junit.Assert.assertEquals(stringBuilder2.toString(), "<html>\n <head>\n  <title>Format test</title>\n </head>\n <body>\n  <div>\n   <p>\n    Hello \n    <span>\n     jsoup \n     <span>");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Hello " + "'", str3, "Hello ");
    }

    @Test
    public void test075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test075");
        org.jsoup.nodes.SerializedObjectSupporter serializedObjectSupporter0 = new org.jsoup.nodes.SerializedObjectSupporter();
        org.jsoup.nodes.TextNode textNode1 = serializedObjectSupporter0.deserializeObjectTextNode401();
        java.lang.StringBuilder stringBuilder2 = serializedObjectSupporter0.deserializeObjectStringBuilder163();
        java.lang.StringBuilder stringBuilder3 = serializedObjectSupporter0.deserializeObjectStringBuilder209();
// flaky:         org.junit.Assert.assertNotNull(textNode1);
        org.junit.Assert.assertNotNull(stringBuilder2);
        org.junit.Assert.assertEquals(stringBuilder2.toString(), "<html>\n <head>\n  <title>Format test</title>\n </head>\n <body>\n  <div>\n   <p>\n    Hello \n    <span>\n     jsoup \n     <span>");
        org.junit.Assert.assertNotNull(stringBuilder3);
        org.junit.Assert.assertEquals(stringBuilder3.toString(), "<span>two</span>");
    }

    @Test
    public void test076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test076");
        org.jsoup.nodes.SerializedObjectSupporter serializedObjectSupporter0 = new org.jsoup.nodes.SerializedObjectSupporter();
        java.lang.String str1 = serializedObjectSupporter0.deserializeObjectString93();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Document document2 = serializedObjectSupporter0.deserializeObjectDocument347();
// flaky:             org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: org.jsoup.nodes.Document$OutputSettings cannot be cast to org.jsoup.nodes.Document");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "More" + "'", str1, "More");
    }

    @Test
    public void test077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test077");
        org.jsoup.nodes.SerializedObjectSupporter serializedObjectSupporter0 = new org.jsoup.nodes.SerializedObjectSupporter();
        java.lang.String str1 = serializedObjectSupporter0.deserializeObjectString93();
        java.lang.StringBuilder stringBuilder2 = serializedObjectSupporter0.deserializeObjectStringBuilder36();
        java.lang.StringBuilder stringBuilder3 = serializedObjectSupporter0.deserializeObjectStringBuilder399();
        org.jsoup.nodes.TextNode textNode4 = serializedObjectSupporter0.deserializeObjectTextNode126();
        java.lang.StringBuilder stringBuilder5 = serializedObjectSupporter0.deserializeObjectStringBuilder285();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "More" + "'", str1, "More");
        org.junit.Assert.assertNotNull(stringBuilder2);
        org.junit.Assert.assertEquals(stringBuilder2.toString(), "<div>\n <p><b>This</b> is <b>jsoup</b>.</p>\n</div>");
        org.junit.Assert.assertNotNull(stringBuilder3);
        org.junit.Assert.assertEquals(stringBuilder3.toString(), "<table> \n <colgroup> \n  <col /> \n </colgroup>\n <colgroup> \n  <col /> \n  <col /> \n  <col /> \n </colgroup>\n <thead> \n  <tr> \n   <th> </th>\n   <th>2008 </th>\n   <th>2007 </th>\n   <th>2006 </th>\n  </tr>\n </thead>\n <tbody> \n  <tr> \n   <th scope=\"rowgroup\"> Research and development </th>\n   <td> $ 1,109 </td>\n   <td> $ 782 </td>\n   <td> $ 712 </td>\n  </tr>\n  <tr> \n   <th scope=\"row\">");
// flaky:         org.junit.Assert.assertNotNull(textNode4);
        org.junit.Assert.assertNotNull(stringBuilder5);
        org.junit.Assert.assertEquals(stringBuilder5.toString(), "<html>\n <head>\n  <title>");
    }

    @Test
    public void test078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test078");
        org.jsoup.nodes.SerializedObjectSupporter serializedObjectSupporter0 = new org.jsoup.nodes.SerializedObjectSupporter();
        java.lang.String str1 = serializedObjectSupporter0.deserializeObjectString93();
        java.lang.StringBuilder stringBuilder2 = serializedObjectSupporter0.deserializeObjectStringBuilder36();
        java.lang.StringBuilder stringBuilder3 = serializedObjectSupporter0.deserializeObjectStringBuilder399();
        org.jsoup.nodes.TextNode textNode4 = serializedObjectSupporter0.deserializeObjectTextNode54();
        org.jsoup.nodes.TextNode textNode5 = serializedObjectSupporter0.deserializeObjectTextNode163();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Document document6 = serializedObjectSupporter0.deserializeObjectDocument153();
// flaky:             org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: org.jsoup.nodes.Document$OutputSettings cannot be cast to org.jsoup.nodes.Document");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "More" + "'", str1, "More");
        org.junit.Assert.assertNotNull(stringBuilder2);
        org.junit.Assert.assertEquals(stringBuilder2.toString(), "<div>\n <p><b>This</b> is <b>jsoup</b>.</p>\n</div>");
        org.junit.Assert.assertNotNull(stringBuilder3);
        org.junit.Assert.assertEquals(stringBuilder3.toString(), "<table> \n <colgroup> \n  <col /> \n </colgroup>\n <colgroup> \n  <col /> \n  <col /> \n  <col /> \n </colgroup>\n <thead> \n  <tr> \n   <th> </th>\n   <th>2008 </th>\n   <th>2007 </th>\n   <th>2006 </th>\n  </tr>\n </thead>\n <tbody> \n  <tr> \n   <th scope=\"rowgroup\"> Research and development </th>\n   <td> $ 1,109 </td>\n   <td> $ 782 </td>\n   <td> $ 712 </td>\n  </tr>\n  <tr> \n   <th scope=\"row\">");
// flaky:         org.junit.Assert.assertNotNull(textNode4);
// flaky:         org.junit.Assert.assertNotNull(textNode5);
    }

    @Test
    public void test079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test079");
        java.lang.String str1 = org.jsoup.nodes.TextNode.normaliseWhitespace(" ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + " " + "'", str1, " ");
    }

    @Test
    public void test080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test080");
        org.jsoup.nodes.SerializedObjectSupporter serializedObjectSupporter0 = new org.jsoup.nodes.SerializedObjectSupporter();
        org.jsoup.nodes.TextNode textNode1 = serializedObjectSupporter0.deserializeObjectTextNode401();
        java.lang.StringBuilder stringBuilder2 = serializedObjectSupporter0.deserializeObjectStringBuilder60();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Document document3 = serializedObjectSupporter0.deserializeObjectDocument245();
// flaky:             org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: org.jsoup.nodes.Document$OutputSettings cannot be cast to org.jsoup.nodes.Document");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
// flaky:         org.junit.Assert.assertNotNull(textNode1);
        org.junit.Assert.assertNotNull(stringBuilder2);
        org.junit.Assert.assertEquals(stringBuilder2.toString(), "<html>\n <head>\n  <script>one</script>\n  <noscript></noscript>\n </head>\n <body>\n  <p>");
    }

    @Test
    public void test081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test081");
        org.jsoup.nodes.SerializedObjectSupporter serializedObjectSupporter0 = new org.jsoup.nodes.SerializedObjectSupporter();
        java.lang.String str1 = serializedObjectSupporter0.deserializeObjectString93();
        org.jsoup.nodes.TextNode textNode2 = serializedObjectSupporter0.deserializeObjectTextNode214();
        java.lang.StringBuilder stringBuilder3 = serializedObjectSupporter0.deserializeObjectStringBuilder143();
        java.lang.StringBuilder stringBuilder4 = serializedObjectSupporter0.deserializeObjectStringBuilder261();
        org.jsoup.nodes.TextNode textNode5 = serializedObjectSupporter0.deserializeObjectTextNode255();
        org.jsoup.nodes.TextNode textNode6 = serializedObjectSupporter0.deserializeObjectTextNode346();
        java.lang.String str7 = serializedObjectSupporter0.deserializeObjectString125();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Document document8 = serializedObjectSupporter0.deserializeObjectDocument366();
// flaky:             org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: org.jsoup.nodes.Document$OutputSettings cannot be cast to org.jsoup.nodes.Document");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "More" + "'", str1, "More");
// flaky:         org.junit.Assert.assertNotNull(textNode2);
        org.junit.Assert.assertNotNull(stringBuilder3);
        org.junit.Assert.assertEquals(stringBuilder3.toString(), "<div id=\"1\"></div>\n<div id=\"2\">\n Text \n <p>One</p>");
        org.junit.Assert.assertNotNull(stringBuilder4);
        org.junit.Assert.assertEquals(stringBuilder4.toString(), "<doc>\n <val>");
// flaky:         org.junit.Assert.assertNotNull(textNode5);
// flaky:         org.junit.Assert.assertNotNull(textNode6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + " $ 2,963 " + "'", str7, " $ 2,963 ");
    }

    @Test
    public void test082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test082");
        org.jsoup.nodes.SerializedObjectSupporter serializedObjectSupporter0 = new org.jsoup.nodes.SerializedObjectSupporter();
        org.jsoup.nodes.TextNode textNode1 = serializedObjectSupporter0.deserializeObjectTextNode401();
        java.lang.StringBuilder stringBuilder2 = serializedObjectSupporter0.deserializeObjectStringBuilder163();
        org.jsoup.nodes.TextNode textNode3 = serializedObjectSupporter0.deserializeObjectTextNode135();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Document document4 = serializedObjectSupporter0.deserializeObjectDocument277();
// flaky:             org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: org.jsoup.nodes.Document$OutputSettings cannot be cast to org.jsoup.nodes.Document");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
// flaky:         org.junit.Assert.assertNotNull(textNode1);
        org.junit.Assert.assertNotNull(stringBuilder2);
        org.junit.Assert.assertEquals(stringBuilder2.toString(), "<html>\n <head>\n  <title>Format test</title>\n </head>\n <body>\n  <div>\n   <p>\n    Hello \n    <span>\n     jsoup \n     <span>");
// flaky:         org.junit.Assert.assertNotNull(textNode3);
    }

    @Test
    public void test083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test083");
        org.jsoup.nodes.SerializedObjectSupporter serializedObjectSupporter0 = new org.jsoup.nodes.SerializedObjectSupporter();
        org.jsoup.nodes.TextNode textNode1 = serializedObjectSupporter0.deserializeObjectTextNode401();
        java.lang.StringBuilder stringBuilder2 = serializedObjectSupporter0.deserializeObjectStringBuilder163();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Document document3 = serializedObjectSupporter0.deserializeObjectDocument157();
// flaky:             org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: org.jsoup.nodes.Document$OutputSettings cannot be cast to org.jsoup.nodes.Document");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
// flaky:         org.junit.Assert.assertNotNull(textNode1);
        org.junit.Assert.assertNotNull(stringBuilder2);
        org.junit.Assert.assertEquals(stringBuilder2.toString(), "<html>\n <head>\n  <title>Format test</title>\n </head>\n <body>\n  <div>\n   <p>\n    Hello \n    <span>\n     jsoup \n     <span>");
    }

    @Test
    public void test084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test084");
        org.jsoup.nodes.SerializedObjectSupporter serializedObjectSupporter0 = new org.jsoup.nodes.SerializedObjectSupporter();
        java.lang.String str1 = serializedObjectSupporter0.deserializeObjectString93();
        java.lang.StringBuilder stringBuilder2 = serializedObjectSupporter0.deserializeObjectStringBuilder215();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString128();
        org.jsoup.nodes.TextNode textNode4 = serializedObjectSupporter0.deserializeObjectTextNode186();
        org.jsoup.nodes.TextNode textNode5 = serializedObjectSupporter0.deserializeObjectTextNode364();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Document document6 = serializedObjectSupporter0.deserializeObjectDocument376();
// flaky:             org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: org.jsoup.nodes.Document$OutputSettings cannot be cast to org.jsoup.nodes.Document");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "More" + "'", str1, "More");
        org.junit.Assert.assertNotNull(stringBuilder2);
        org.junit.Assert.assertEquals(stringBuilder2.toString(), "<div id=\"1\">");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + " 12.3% " + "'", str3, " 12.3% ");
// flaky:         org.junit.Assert.assertNotNull(textNode4);
// flaky:         org.junit.Assert.assertNotNull(textNode5);
    }

    @Test
    public void test085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test085");
        org.jsoup.nodes.SerializedObjectSupporter serializedObjectSupporter0 = new org.jsoup.nodes.SerializedObjectSupporter();
        org.jsoup.nodes.TextNode textNode1 = serializedObjectSupporter0.deserializeObjectTextNode401();
        java.lang.StringBuilder stringBuilder2 = serializedObjectSupporter0.deserializeObjectStringBuilder60();
        java.lang.StringBuilder stringBuilder3 = serializedObjectSupporter0.deserializeObjectStringBuilder114();
        java.lang.StringBuilder stringBuilder4 = serializedObjectSupporter0.deserializeObjectStringBuilder238();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Document document5 = serializedObjectSupporter0.deserializeObjectDocument91();
// flaky:             org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: org.jsoup.nodes.Document$OutputSettings cannot be cast to org.jsoup.nodes.Document");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
// flaky:         org.junit.Assert.assertNotNull(textNode1);
        org.junit.Assert.assertNotNull(stringBuilder2);
        org.junit.Assert.assertEquals(stringBuilder2.toString(), "<html>\n <head>\n  <script>one</script>\n  <noscript></noscript>\n </head>\n <body>\n  <p>");
        org.junit.Assert.assertNotNull(stringBuilder3);
        org.junit.Assert.assertEquals(stringBuilder3.toString(), "\nthere &amp; now &gt; \n<p>");
        org.junit.Assert.assertNotNull(stringBuilder4);
        org.junit.Assert.assertEquals(stringBuilder4.toString(), "<img src=\"cid:12345\" />");
    }

    @Test
    public void test086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test086");
        org.jsoup.nodes.SerializedObjectSupporter serializedObjectSupporter0 = new org.jsoup.nodes.SerializedObjectSupporter();
        org.jsoup.nodes.TextNode textNode1 = serializedObjectSupporter0.deserializeObjectTextNode401();
        java.lang.StringBuilder stringBuilder2 = serializedObjectSupporter0.deserializeObjectStringBuilder163();
        org.jsoup.nodes.TextNode textNode3 = serializedObjectSupporter0.deserializeObjectTextNode295();
// flaky:         org.junit.Assert.assertNotNull(textNode1);
        org.junit.Assert.assertNotNull(stringBuilder2);
        org.junit.Assert.assertEquals(stringBuilder2.toString(), "<html>\n <head>\n  <title>Format test</title>\n </head>\n <body>\n  <div>\n   <p>\n    Hello \n    <span>\n     jsoup \n     <span>");
// flaky:         org.junit.Assert.assertNotNull(textNode3);
    }

    @Test
    public void test087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test087");
        org.jsoup.nodes.SerializedObjectSupporter serializedObjectSupporter0 = new org.jsoup.nodes.SerializedObjectSupporter();
        java.lang.String str1 = serializedObjectSupporter0.deserializeObjectString93();
        org.jsoup.nodes.TextNode textNode2 = serializedObjectSupporter0.deserializeObjectTextNode214();
        java.lang.StringBuilder stringBuilder3 = serializedObjectSupporter0.deserializeObjectStringBuilder143();
        java.lang.StringBuilder stringBuilder4 = serializedObjectSupporter0.deserializeObjectStringBuilder261();
        org.jsoup.nodes.TextNode textNode5 = serializedObjectSupporter0.deserializeObjectTextNode255();
        org.jsoup.nodes.TextNode textNode6 = serializedObjectSupporter0.deserializeObjectTextNode421();
        org.jsoup.nodes.TextNode textNode7 = serializedObjectSupporter0.deserializeObjectTextNode251();
        java.lang.String str8 = serializedObjectSupporter0.deserializeObjectString75();
        org.jsoup.nodes.TextNode textNode9 = serializedObjectSupporter0.deserializeObjectTextNode255();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Document document10 = serializedObjectSupporter0.deserializeObjectDocument374();
// flaky:             org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: org.jsoup.nodes.Document$OutputSettings cannot be cast to org.jsoup.nodes.Document");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "More" + "'", str1, "More");
// flaky:         org.junit.Assert.assertNotNull(textNode2);
        org.junit.Assert.assertNotNull(stringBuilder3);
        org.junit.Assert.assertEquals(stringBuilder3.toString(), "<div id=\"1\"></div>\n<div id=\"2\">\n Text \n <p>One</p>");
        org.junit.Assert.assertNotNull(stringBuilder4);
        org.junit.Assert.assertEquals(stringBuilder4.toString(), "<doc>\n <val>");
// flaky:         org.junit.Assert.assertNotNull(textNode5);
// flaky:         org.junit.Assert.assertNotNull(textNode6);
// flaky:         org.junit.Assert.assertNotNull(textNode7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Nice" + "'", str8, "Nice");
// flaky:         org.junit.Assert.assertNotNull(textNode9);
    }

    @Test
    public void test088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test088");
        org.jsoup.nodes.SerializedObjectSupporter serializedObjectSupporter0 = new org.jsoup.nodes.SerializedObjectSupporter();
        java.lang.String str1 = serializedObjectSupporter0.deserializeObjectString93();
        java.lang.StringBuilder stringBuilder2 = serializedObjectSupporter0.deserializeObjectStringBuilder36();
        org.jsoup.nodes.TextNode textNode3 = serializedObjectSupporter0.deserializeObjectTextNode102();
        java.lang.StringBuilder stringBuilder4 = serializedObjectSupporter0.deserializeObjectStringBuilder101();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Document document5 = serializedObjectSupporter0.deserializeObjectDocument180();
// flaky:             org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: org.jsoup.nodes.Document$OutputSettings cannot be cast to org.jsoup.nodes.Document");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "More" + "'", str1, "More");
        org.junit.Assert.assertNotNull(stringBuilder2);
        org.junit.Assert.assertEquals(stringBuilder2.toString(), "<div>\n <p><b>This</b> is <b>jsoup</b>.</p>\n</div>");
// flaky:         org.junit.Assert.assertNotNull(textNode3);
        org.junit.Assert.assertNotNull(stringBuilder4);
        org.junit.Assert.assertEquals(stringBuilder4.toString(), "<div>\n <p>One</p>\n <p><span>");
    }

    @Test
    public void test089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test089");
        org.jsoup.nodes.SerializedObjectSupporter serializedObjectSupporter0 = new org.jsoup.nodes.SerializedObjectSupporter();
        java.lang.String str1 = serializedObjectSupporter0.deserializeObjectString93();
        java.lang.StringBuilder stringBuilder2 = serializedObjectSupporter0.deserializeObjectStringBuilder36();
        org.jsoup.nodes.TextNode textNode3 = serializedObjectSupporter0.deserializeObjectTextNode137();
        java.lang.StringBuilder stringBuilder4 = serializedObjectSupporter0.deserializeObjectStringBuilder231();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Document document5 = serializedObjectSupporter0.deserializeObjectDocument406();
// flaky:             org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: org.jsoup.nodes.Document$OutputSettings cannot be cast to org.jsoup.nodes.Document");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "More" + "'", str1, "More");
        org.junit.Assert.assertNotNull(stringBuilder2);
        org.junit.Assert.assertEquals(stringBuilder2.toString(), "<div>\n <p><b>This</b> is <b>jsoup</b>.</p>\n</div>");
// flaky:         org.junit.Assert.assertNotNull(textNode3);
        org.junit.Assert.assertNotNull(stringBuilder4);
        org.junit.Assert.assertEquals(stringBuilder4.toString(), "<p><a rel=\"nofollow\">Dodgy</a> <a href=\"http://nice.com\" rel=\"nofollow\">");
    }

    @Test
    public void test090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test090");
        org.jsoup.nodes.SerializedObjectSupporter serializedObjectSupporter0 = new org.jsoup.nodes.SerializedObjectSupporter();
        java.lang.String str1 = serializedObjectSupporter0.deserializeObjectString93();
        java.lang.StringBuilder stringBuilder2 = serializedObjectSupporter0.deserializeObjectStringBuilder145();
        org.jsoup.nodes.TextNode textNode3 = serializedObjectSupporter0.deserializeObjectTextNode197();
        java.lang.StringBuilder stringBuilder4 = serializedObjectSupporter0.deserializeObjectStringBuilder407();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Document document5 = serializedObjectSupporter0.deserializeObjectDocument173();
// flaky:             org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: org.jsoup.nodes.Document$OutputSettings cannot be cast to org.jsoup.nodes.Document");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "More" + "'", str1, "More");
        org.junit.Assert.assertNotNull(stringBuilder2);
        org.junit.Assert.assertEquals(stringBuilder2.toString(), "<div id=\"1\">");
// flaky:         org.junit.Assert.assertNotNull(textNode3);
        org.junit.Assert.assertNotNull(stringBuilder4);
        org.junit.Assert.assertEquals(stringBuilder4.toString(), "<table> \n <colgroup> \n  <col /> \n </colgroup>\n <colgroup> \n  <col /> \n  <col /> \n  <col /> \n </colgroup>\n <thead> \n  <tr> \n   <th> </th>\n   <th>2008 </th>\n   <th>2007 </th>\n   <th>2006 </th>\n  </tr>\n </thead>\n <tbody> \n  <tr> \n   <th scope=\"rowgroup\"> Research and development </th>\n   <td> $ 1,109 </td>\n   <td> $ 782 </td>\n   <td> $ 712 </td>\n  </tr>\n  <tr> \n   <th scope=\"row\"> Percentage of net sales </th>\n   <td> 3.4% </td>\n   <td> 3.3% </td>\n   <td> 3.7% </td>\n  </tr>\n </tbody>\n <tbody> \n  <tr> \n   <th scope=\"rowgroup\"> Selling, general, and administrative </th>\n   <td> $ 3,761 </td>\n   <td>");
    }

    @Test
    public void test091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test091");
        org.jsoup.nodes.Document.OutputSettings outputSettings0 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Entities.EscapeMode escapeMode1 = null;
        outputSettings0.setescapeMode(escapeMode1);
        java.nio.charset.Charset charset3 = null;
        outputSettings0.setcharset(charset3);
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Document.OutputSettings outputSettings5 = outputSettings0.clone();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test092");
        org.jsoup.nodes.SerializedObjectSupporter serializedObjectSupporter0 = new org.jsoup.nodes.SerializedObjectSupporter();
        java.lang.String str1 = serializedObjectSupporter0.deserializeObjectString93();
        java.lang.StringBuilder stringBuilder2 = serializedObjectSupporter0.deserializeObjectStringBuilder215();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Document document3 = serializedObjectSupporter0.deserializeObjectDocument205();
// flaky:             org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: org.jsoup.nodes.Document$OutputSettings cannot be cast to org.jsoup.nodes.Document");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "More" + "'", str1, "More");
        org.junit.Assert.assertNotNull(stringBuilder2);
        org.junit.Assert.assertEquals(stringBuilder2.toString(), "<div id=\"1\">");
    }

    @Test
    public void test093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test093");
        org.jsoup.nodes.SerializedObjectSupporter serializedObjectSupporter0 = new org.jsoup.nodes.SerializedObjectSupporter();
        java.lang.String str1 = serializedObjectSupporter0.deserializeObjectString93();
        java.lang.StringBuilder stringBuilder2 = serializedObjectSupporter0.deserializeObjectStringBuilder36();
        java.lang.StringBuilder stringBuilder3 = serializedObjectSupporter0.deserializeObjectStringBuilder399();
        org.jsoup.nodes.TextNode textNode4 = serializedObjectSupporter0.deserializeObjectTextNode54();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Document document5 = serializedObjectSupporter0.deserializeObjectDocument251();
// flaky:             org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: org.jsoup.nodes.Document$OutputSettings cannot be cast to org.jsoup.nodes.Document");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "More" + "'", str1, "More");
        org.junit.Assert.assertNotNull(stringBuilder2);
        org.junit.Assert.assertEquals(stringBuilder2.toString(), "<div>\n <p><b>This</b> is <b>jsoup</b>.</p>\n</div>");
        org.junit.Assert.assertNotNull(stringBuilder3);
        org.junit.Assert.assertEquals(stringBuilder3.toString(), "<table> \n <colgroup> \n  <col /> \n </colgroup>\n <colgroup> \n  <col /> \n  <col /> \n  <col /> \n </colgroup>\n <thead> \n  <tr> \n   <th> </th>\n   <th>2008 </th>\n   <th>2007 </th>\n   <th>2006 </th>\n  </tr>\n </thead>\n <tbody> \n  <tr> \n   <th scope=\"rowgroup\"> Research and development </th>\n   <td> $ 1,109 </td>\n   <td> $ 782 </td>\n   <td> $ 712 </td>\n  </tr>\n  <tr> \n   <th scope=\"row\">");
// flaky:         org.junit.Assert.assertNotNull(textNode4);
    }

    @Test
    public void test094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test094");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("Nice", "Four");
        java.lang.String str4 = textNode2.absUrl("Two ");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
    }

    @Test
    public void test095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test095");
        org.jsoup.nodes.SerializedObjectSupporter serializedObjectSupporter0 = new org.jsoup.nodes.SerializedObjectSupporter();
        org.jsoup.nodes.TextNode textNode1 = serializedObjectSupporter0.deserializeObjectTextNode401();
        java.lang.StringBuilder stringBuilder2 = serializedObjectSupporter0.deserializeObjectStringBuilder60();
        java.lang.StringBuilder stringBuilder3 = serializedObjectSupporter0.deserializeObjectStringBuilder114();
        java.lang.StringBuilder stringBuilder4 = serializedObjectSupporter0.deserializeObjectStringBuilder238();
        org.jsoup.nodes.TextNode textNode5 = serializedObjectSupporter0.deserializeObjectTextNode120();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Document document6 = serializedObjectSupporter0.deserializeObjectDocument11();
// flaky:             org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: org.jsoup.nodes.Document$OutputSettings cannot be cast to org.jsoup.nodes.Document");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
// flaky:         org.junit.Assert.assertNotNull(textNode1);
        org.junit.Assert.assertNotNull(stringBuilder2);
        org.junit.Assert.assertEquals(stringBuilder2.toString(), "<html>\n <head>\n  <script>one</script>\n  <noscript></noscript>\n </head>\n <body>\n  <p>");
        org.junit.Assert.assertNotNull(stringBuilder3);
        org.junit.Assert.assertEquals(stringBuilder3.toString(), "\nthere &amp; now &gt; \n<p>");
        org.junit.Assert.assertNotNull(stringBuilder4);
        org.junit.Assert.assertEquals(stringBuilder4.toString(), "<img src=\"cid:12345\" />");
// flaky:         org.junit.Assert.assertNotNull(textNode5);
    }

    @Test
    public void test096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test096");
        org.jsoup.nodes.SerializedObjectSupporter serializedObjectSupporter0 = new org.jsoup.nodes.SerializedObjectSupporter();
        org.jsoup.nodes.TextNode textNode1 = serializedObjectSupporter0.deserializeObjectTextNode401();
        org.jsoup.nodes.TextNode textNode2 = serializedObjectSupporter0.deserializeObjectTextNode376();
        org.jsoup.nodes.TextNode textNode3 = serializedObjectSupporter0.deserializeObjectTextNode145();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Document document4 = serializedObjectSupporter0.deserializeObjectDocument235();
// flaky:             org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: org.jsoup.nodes.Document$OutputSettings cannot be cast to org.jsoup.nodes.Document");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
// flaky:         org.junit.Assert.assertNotNull(textNode1);
// flaky:         org.junit.Assert.assertNotNull(textNode2);
// flaky:         org.junit.Assert.assertNotNull(textNode3);
    }

    @Test
    public void test097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test097");
        org.jsoup.nodes.SerializedObjectSupporter serializedObjectSupporter0 = new org.jsoup.nodes.SerializedObjectSupporter();
        java.lang.String str1 = serializedObjectSupporter0.deserializeObjectString93();
        java.lang.StringBuilder stringBuilder2 = serializedObjectSupporter0.deserializeObjectStringBuilder215();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString128();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Document document4 = serializedObjectSupporter0.deserializeObjectDocument222();
// flaky:             org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: org.jsoup.nodes.Document$OutputSettings cannot be cast to org.jsoup.nodes.Document");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "More" + "'", str1, "More");
        org.junit.Assert.assertNotNull(stringBuilder2);
        org.junit.Assert.assertEquals(stringBuilder2.toString(), "<div id=\"1\">");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + " 12.3% " + "'", str3, " 12.3% ");
    }

    @Test
    public void test098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test098");
        org.jsoup.nodes.SerializedObjectSupporter serializedObjectSupporter0 = new org.jsoup.nodes.SerializedObjectSupporter();
        java.lang.String str1 = serializedObjectSupporter0.deserializeObjectString93();
        java.lang.StringBuilder stringBuilder2 = serializedObjectSupporter0.deserializeObjectStringBuilder36();
        java.lang.StringBuilder stringBuilder3 = serializedObjectSupporter0.deserializeObjectStringBuilder399();
        org.jsoup.nodes.TextNode textNode4 = serializedObjectSupporter0.deserializeObjectTextNode54();
        org.jsoup.nodes.TextNode textNode5 = serializedObjectSupporter0.deserializeObjectTextNode163();
// flaky:         textNode5.text = "users";
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "More" + "'", str1, "More");
        org.junit.Assert.assertNotNull(stringBuilder2);
        org.junit.Assert.assertEquals(stringBuilder2.toString(), "<div>\n <p><b>This</b> is <b>jsoup</b>.</p>\n</div>");
        org.junit.Assert.assertNotNull(stringBuilder3);
        org.junit.Assert.assertEquals(stringBuilder3.toString(), "<table> \n <colgroup> \n  <col /> \n </colgroup>\n <colgroup> \n  <col /> \n  <col /> \n  <col /> \n </colgroup>\n <thead> \n  <tr> \n   <th> </th>\n   <th>2008 </th>\n   <th>2007 </th>\n   <th>2006 </th>\n  </tr>\n </thead>\n <tbody> \n  <tr> \n   <th scope=\"rowgroup\"> Research and development </th>\n   <td> $ 1,109 </td>\n   <td> $ 782 </td>\n   <td> $ 712 </td>\n  </tr>\n  <tr> \n   <th scope=\"row\">");
// flaky:         org.junit.Assert.assertNotNull(textNode4);
// flaky:         org.junit.Assert.assertNotNull(textNode5);
    }

    @Test
    public void test099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test099");
        org.jsoup.nodes.SerializedObjectSupporter serializedObjectSupporter0 = new org.jsoup.nodes.SerializedObjectSupporter();
        org.jsoup.nodes.TextNode textNode1 = serializedObjectSupporter0.deserializeObjectTextNode401();
        java.lang.StringBuilder stringBuilder2 = serializedObjectSupporter0.deserializeObjectStringBuilder163();
        org.jsoup.nodes.TextNode textNode3 = serializedObjectSupporter0.deserializeObjectTextNode397();
        org.jsoup.nodes.TextNode textNode4 = serializedObjectSupporter0.deserializeObjectTextNode188();
        java.lang.StringBuilder stringBuilder5 = serializedObjectSupporter0.deserializeObjectStringBuilder24();
// flaky:         org.junit.Assert.assertNotNull(textNode1);
        org.junit.Assert.assertNotNull(stringBuilder2);
        org.junit.Assert.assertEquals(stringBuilder2.toString(), "<html>\n <head>\n  <title>Format test</title>\n </head>\n <body>\n  <div>\n   <p>\n    Hello \n    <span>\n     jsoup \n     <span>");
// flaky:         org.junit.Assert.assertNotNull(textNode3);
// flaky:         org.junit.Assert.assertNotNull(textNode4);
        org.junit.Assert.assertNotNull(stringBuilder5);
        org.junit.Assert.assertEquals(stringBuilder5.toString(), "<p>");
    }

    @Test
    public void test100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test100");
        org.jsoup.nodes.Document.OutputSettings outputSettings0 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Entities.EscapeMode escapeMode1 = null;
        outputSettings0.setescapeMode(escapeMode1);
        java.nio.charset.CharsetEncoder charsetEncoder3 = null;
        outputSettings0.charsetEncoder = charsetEncoder3;
    }

    @Test
    public void test101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test101");
        org.jsoup.nodes.SerializedObjectSupporter serializedObjectSupporter0 = new org.jsoup.nodes.SerializedObjectSupporter();
        java.lang.String str1 = serializedObjectSupporter0.deserializeObjectString93();
        org.jsoup.nodes.TextNode textNode2 = serializedObjectSupporter0.deserializeObjectTextNode214();
        java.lang.StringBuilder stringBuilder3 = serializedObjectSupporter0.deserializeObjectStringBuilder19();
        org.jsoup.nodes.TextNode textNode4 = serializedObjectSupporter0.deserializeObjectTextNode127();
        java.lang.StringBuilder stringBuilder5 = serializedObjectSupporter0.deserializeObjectStringBuilder93();
        java.lang.StringBuilder stringBuilder6 = serializedObjectSupporter0.deserializeObjectStringBuilder86();
        java.lang.StringBuilder stringBuilder7 = serializedObjectSupporter0.deserializeObjectStringBuilder310();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "More" + "'", str1, "More");
// flaky:         org.junit.Assert.assertNotNull(textNode2);
        org.junit.Assert.assertNotNull(stringBuilder3);
        org.junit.Assert.assertEquals(stringBuilder3.toString(), "<p>This <a>is</a><span>");
// flaky:         org.junit.Assert.assertNotNull(textNode4);
        org.junit.Assert.assertNotNull(stringBuilder5);
        org.junit.Assert.assertEquals(stringBuilder5.toString(), "<div>\n <p>Hello</p>\n <div>\n  one\n </div>\n <div>");
        org.junit.Assert.assertNotNull(stringBuilder6);
        org.junit.Assert.assertEquals(stringBuilder6.toString(), "<div>\n <div>\n  one\n </div>\n <div>\n  two\n </div>\n <p>Hello</p>\n <p>Three</p>\n <!-- four -->\n <p>");
        org.junit.Assert.assertNotNull(stringBuilder7);
        org.junit.Assert.assertEquals(stringBuilder7.toString(), "<span>Hello \n <div>\n  there\n </div>");
    }

    @Test
    public void test102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test102");
        org.jsoup.nodes.SerializedObjectSupporter serializedObjectSupporter0 = new org.jsoup.nodes.SerializedObjectSupporter();
        java.lang.String str1 = serializedObjectSupporter0.deserializeObjectString93();
        org.jsoup.nodes.TextNode textNode2 = serializedObjectSupporter0.deserializeObjectTextNode214();
        java.lang.StringBuilder stringBuilder3 = serializedObjectSupporter0.deserializeObjectStringBuilder19();
        org.jsoup.nodes.TextNode textNode4 = serializedObjectSupporter0.deserializeObjectTextNode127();
        java.lang.StringBuilder stringBuilder5 = serializedObjectSupporter0.deserializeObjectStringBuilder93();
        java.lang.StringBuilder stringBuilder6 = serializedObjectSupporter0.deserializeObjectStringBuilder86();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Document document7 = serializedObjectSupporter0.deserializeObjectDocument363();
// flaky:             org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: org.jsoup.nodes.Document$OutputSettings cannot be cast to org.jsoup.nodes.Document");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "More" + "'", str1, "More");
// flaky:         org.junit.Assert.assertNotNull(textNode2);
        org.junit.Assert.assertNotNull(stringBuilder3);
        org.junit.Assert.assertEquals(stringBuilder3.toString(), "<p>This <a>is</a><span>");
// flaky:         org.junit.Assert.assertNotNull(textNode4);
        org.junit.Assert.assertNotNull(stringBuilder5);
        org.junit.Assert.assertEquals(stringBuilder5.toString(), "<div>\n <p>Hello</p>\n <div>\n  one\n </div>\n <div>");
        org.junit.Assert.assertNotNull(stringBuilder6);
        org.junit.Assert.assertEquals(stringBuilder6.toString(), "<div>\n <div>\n  one\n </div>\n <div>\n  two\n </div>\n <p>Hello</p>\n <p>Three</p>\n <!-- four -->\n <p>");
    }

    @Test
    public void test103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test103");
        org.jsoup.nodes.SerializedObjectSupporter serializedObjectSupporter0 = new org.jsoup.nodes.SerializedObjectSupporter();
        java.lang.String str1 = serializedObjectSupporter0.deserializeObjectString93();
        java.lang.StringBuilder stringBuilder2 = serializedObjectSupporter0.deserializeObjectStringBuilder36();
        org.jsoup.nodes.TextNode textNode3 = serializedObjectSupporter0.deserializeObjectTextNode137();
        org.jsoup.nodes.TextNode textNode4 = serializedObjectSupporter0.deserializeObjectTextNode289();
        java.lang.String str5 = null; // flaky: textNode4.nodeName();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "More" + "'", str1, "More");
        org.junit.Assert.assertNotNull(stringBuilder2);
        org.junit.Assert.assertEquals(stringBuilder2.toString(), "<div>\n <p><b>This</b> is <b>jsoup</b>.</p>\n</div>");
// flaky:         org.junit.Assert.assertNotNull(textNode3);
// flaky:         org.junit.Assert.assertNotNull(textNode4);
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "#text" + "'", str5, "#text");
    }

    @Test
    public void test104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test104");
        org.jsoup.nodes.SerializedObjectSupporter serializedObjectSupporter0 = new org.jsoup.nodes.SerializedObjectSupporter();
        java.lang.String str1 = serializedObjectSupporter0.deserializeObjectString93();
        java.lang.StringBuilder stringBuilder2 = serializedObjectSupporter0.deserializeObjectStringBuilder215();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString128();
        java.lang.StringBuilder stringBuilder4 = serializedObjectSupporter0.deserializeObjectStringBuilder419();
        java.lang.String str5 = serializedObjectSupporter0.deserializeObjectString34();
        java.lang.StringBuilder stringBuilder6 = serializedObjectSupporter0.deserializeObjectStringBuilder55();
        org.jsoup.nodes.TextNode textNode7 = serializedObjectSupporter0.deserializeObjectTextNode318();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "More" + "'", str1, "More");
        org.junit.Assert.assertNotNull(stringBuilder2);
        org.junit.Assert.assertEquals(stringBuilder2.toString(), "<div id=\"1\">");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + " 12.3% " + "'", str3, " 12.3% ");
        org.junit.Assert.assertNotNull(stringBuilder4);
        org.junit.Assert.assertEquals(stringBuilder4.toString(), "<p><b>One</b></p>\n<b>");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "< > & \" ' \327" + "'", str5, "< > & \" ' \327");
        org.junit.Assert.assertNotNull(stringBuilder6);
        org.junit.Assert.assertEquals(stringBuilder6.toString(), "<title>");
// flaky:         org.junit.Assert.assertNotNull(textNode7);
    }

    @Test
    public void test105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test105");
        org.jsoup.nodes.SerializedObjectSupporter serializedObjectSupporter0 = new org.jsoup.nodes.SerializedObjectSupporter();
        java.lang.String str1 = serializedObjectSupporter0.deserializeObjectString93();
        org.jsoup.nodes.TextNode textNode2 = serializedObjectSupporter0.deserializeObjectTextNode214();
        java.lang.StringBuilder stringBuilder3 = serializedObjectSupporter0.deserializeObjectStringBuilder143();
        java.lang.StringBuilder stringBuilder4 = serializedObjectSupporter0.deserializeObjectStringBuilder261();
        org.jsoup.nodes.TextNode textNode5 = serializedObjectSupporter0.deserializeObjectTextNode255();
        org.jsoup.nodes.TextNode textNode6 = serializedObjectSupporter0.deserializeObjectTextNode421();
        org.jsoup.nodes.TextNode textNode7 = serializedObjectSupporter0.deserializeObjectTextNode251();
        java.lang.StringBuilder stringBuilder8 = serializedObjectSupporter0.deserializeObjectStringBuilder232();
        org.jsoup.nodes.TextNode textNode9 = serializedObjectSupporter0.deserializeObjectTextNode278();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Document document10 = serializedObjectSupporter0.deserializeObjectDocument115();
// flaky:             org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: org.jsoup.nodes.Document$OutputSettings cannot be cast to org.jsoup.nodes.Document");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "More" + "'", str1, "More");
// flaky:         org.junit.Assert.assertNotNull(textNode2);
        org.junit.Assert.assertNotNull(stringBuilder3);
        org.junit.Assert.assertEquals(stringBuilder3.toString(), "<div id=\"1\"></div>\n<div id=\"2\">\n Text \n <p>One</p>");
        org.junit.Assert.assertNotNull(stringBuilder4);
        org.junit.Assert.assertEquals(stringBuilder4.toString(), "<doc>\n <val>");
// flaky:         org.junit.Assert.assertNotNull(textNode5);
// flaky:         org.junit.Assert.assertNotNull(textNode6);
// flaky:         org.junit.Assert.assertNotNull(textNode7);
        org.junit.Assert.assertNotNull(stringBuilder8);
        org.junit.Assert.assertEquals(stringBuilder8.toString(), "<p><a rel=\"nofollow\">Dodgy</a> <a href=\"http://nice.com\" rel=\"nofollow\">Nice</a></p>\n<blockquote>");
// flaky:         org.junit.Assert.assertNotNull(textNode9);
    }

    @Test
    public void test106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test106");
        org.jsoup.nodes.SerializedObjectSupporter serializedObjectSupporter0 = new org.jsoup.nodes.SerializedObjectSupporter();
        java.lang.String str1 = serializedObjectSupporter0.deserializeObjectString93();
        org.jsoup.nodes.TextNode textNode2 = serializedObjectSupporter0.deserializeObjectTextNode214();
        java.lang.StringBuilder stringBuilder3 = serializedObjectSupporter0.deserializeObjectStringBuilder143();
        java.lang.StringBuilder stringBuilder4 = serializedObjectSupporter0.deserializeObjectStringBuilder261();
        org.jsoup.nodes.TextNode textNode5 = serializedObjectSupporter0.deserializeObjectTextNode255();
        org.jsoup.nodes.TextNode textNode6 = serializedObjectSupporter0.deserializeObjectTextNode346();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Document document7 = serializedObjectSupporter0.deserializeObjectDocument123();
// flaky:             org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: org.jsoup.nodes.Document$OutputSettings cannot be cast to org.jsoup.nodes.Document");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "More" + "'", str1, "More");
// flaky:         org.junit.Assert.assertNotNull(textNode2);
        org.junit.Assert.assertNotNull(stringBuilder3);
        org.junit.Assert.assertEquals(stringBuilder3.toString(), "<div id=\"1\"></div>\n<div id=\"2\">\n Text \n <p>One</p>");
        org.junit.Assert.assertNotNull(stringBuilder4);
        org.junit.Assert.assertEquals(stringBuilder4.toString(), "<doc>\n <val>");
// flaky:         org.junit.Assert.assertNotNull(textNode5);
// flaky:         org.junit.Assert.assertNotNull(textNode6);
    }

    @Test
    public void test107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test107");
        org.jsoup.nodes.SerializedObjectSupporter serializedObjectSupporter0 = new org.jsoup.nodes.SerializedObjectSupporter();
        java.lang.String str1 = serializedObjectSupporter0.deserializeObjectString93();
        java.lang.StringBuilder stringBuilder2 = serializedObjectSupporter0.deserializeObjectStringBuilder36();
        java.lang.StringBuilder stringBuilder3 = serializedObjectSupporter0.deserializeObjectStringBuilder399();
        org.jsoup.nodes.TextNode textNode4 = serializedObjectSupporter0.deserializeObjectTextNode54();
        org.jsoup.nodes.TextNode textNode5 = serializedObjectSupporter0.deserializeObjectTextNode163();
        org.jsoup.nodes.TextNode textNode6 = serializedObjectSupporter0.deserializeObjectTextNode21();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "More" + "'", str1, "More");
        org.junit.Assert.assertNotNull(stringBuilder2);
        org.junit.Assert.assertEquals(stringBuilder2.toString(), "<div>\n <p><b>This</b> is <b>jsoup</b>.</p>\n</div>");
        org.junit.Assert.assertNotNull(stringBuilder3);
        org.junit.Assert.assertEquals(stringBuilder3.toString(), "<table> \n <colgroup> \n  <col /> \n </colgroup>\n <colgroup> \n  <col /> \n  <col /> \n  <col /> \n </colgroup>\n <thead> \n  <tr> \n   <th> </th>\n   <th>2008 </th>\n   <th>2007 </th>\n   <th>2006 </th>\n  </tr>\n </thead>\n <tbody> \n  <tr> \n   <th scope=\"rowgroup\"> Research and development </th>\n   <td> $ 1,109 </td>\n   <td> $ 782 </td>\n   <td> $ 712 </td>\n  </tr>\n  <tr> \n   <th scope=\"row\">");
// flaky:         org.junit.Assert.assertNotNull(textNode4);
// flaky:         org.junit.Assert.assertNotNull(textNode5);
// flaky:         org.junit.Assert.assertNotNull(textNode6);
    }

    @Test
    public void test108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test108");
        org.jsoup.nodes.SerializedObjectSupporter serializedObjectSupporter0 = new org.jsoup.nodes.SerializedObjectSupporter();
        java.lang.String str1 = serializedObjectSupporter0.deserializeObjectString93();
        org.jsoup.nodes.TextNode textNode2 = serializedObjectSupporter0.deserializeObjectTextNode214();
        org.jsoup.nodes.TextNode textNode3 = serializedObjectSupporter0.deserializeObjectTextNode79();
        org.jsoup.nodes.TextNode textNode4 = serializedObjectSupporter0.deserializeObjectTextNode169();
        org.jsoup.nodes.TextNode textNode5 = serializedObjectSupporter0.deserializeObjectTextNode80();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Document document6 = serializedObjectSupporter0.deserializeObjectDocument366();
// flaky:             org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: org.jsoup.nodes.Document$OutputSettings cannot be cast to org.jsoup.nodes.Document");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "More" + "'", str1, "More");
// flaky:         org.junit.Assert.assertNotNull(textNode2);
// flaky:         org.junit.Assert.assertNotNull(textNode3);
// flaky:         org.junit.Assert.assertNotNull(textNode4);
// flaky:         org.junit.Assert.assertNotNull(textNode5);
    }

    @Test
    public void test109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test109");
        org.jsoup.nodes.SerializedObjectSupporter serializedObjectSupporter0 = new org.jsoup.nodes.SerializedObjectSupporter();
        java.lang.String str1 = serializedObjectSupporter0.deserializeObjectString93();
        java.lang.StringBuilder stringBuilder2 = serializedObjectSupporter0.deserializeObjectStringBuilder215();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString128();
        java.lang.StringBuilder stringBuilder4 = serializedObjectSupporter0.deserializeObjectStringBuilder419();
        java.lang.StringBuilder stringBuilder5 = serializedObjectSupporter0.deserializeObjectStringBuilder335();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Document document6 = serializedObjectSupporter0.deserializeObjectDocument175();
// flaky:             org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: org.jsoup.nodes.Document$OutputSettings cannot be cast to org.jsoup.nodes.Document");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "More" + "'", str1, "More");
        org.junit.Assert.assertNotNull(stringBuilder2);
        org.junit.Assert.assertEquals(stringBuilder2.toString(), "<div id=\"1\">");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + " 12.3% " + "'", str3, " 12.3% ");
        org.junit.Assert.assertNotNull(stringBuilder4);
        org.junit.Assert.assertEquals(stringBuilder4.toString(), "<p><b>One</b></p>\n<b>");
        org.junit.Assert.assertNotNull(stringBuilder5);
        org.junit.Assert.assertEquals(stringBuilder5.toString(), "<p><b class=\"one\">One <i>Two <b>Three</b></i></b></p>\n<p><b class=\"one\"><i><b>");
    }

    @Test
    public void test110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test110");
        org.jsoup.nodes.SerializedObjectSupporter serializedObjectSupporter0 = new org.jsoup.nodes.SerializedObjectSupporter();
        java.lang.String str1 = serializedObjectSupporter0.deserializeObjectString93();
        java.lang.StringBuilder stringBuilder2 = serializedObjectSupporter0.deserializeObjectStringBuilder36();
        org.jsoup.nodes.TextNode textNode3 = serializedObjectSupporter0.deserializeObjectTextNode137();
        org.jsoup.nodes.TextNode textNode4 = serializedObjectSupporter0.deserializeObjectTextNode289();
        java.lang.StringBuilder stringBuilder5 = serializedObjectSupporter0.deserializeObjectStringBuilder310();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Document document6 = serializedObjectSupporter0.deserializeObjectDocument358();
// flaky:             org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: org.jsoup.nodes.Document$OutputSettings cannot be cast to org.jsoup.nodes.Document");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "More" + "'", str1, "More");
        org.junit.Assert.assertNotNull(stringBuilder2);
        org.junit.Assert.assertEquals(stringBuilder2.toString(), "<div>\n <p><b>This</b> is <b>jsoup</b>.</p>\n</div>");
// flaky:         org.junit.Assert.assertNotNull(textNode3);
// flaky:         org.junit.Assert.assertNotNull(textNode4);
        org.junit.Assert.assertNotNull(stringBuilder5);
        org.junit.Assert.assertEquals(stringBuilder5.toString(), "<span>Hello \n <div>\n  there\n </div>");
    }

    @Test
    public void test111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test111");
        org.jsoup.nodes.SerializedObjectSupporter serializedObjectSupporter0 = new org.jsoup.nodes.SerializedObjectSupporter();
        java.lang.String str1 = serializedObjectSupporter0.deserializeObjectString93();
        org.jsoup.nodes.TextNode textNode2 = serializedObjectSupporter0.deserializeObjectTextNode214();
        java.lang.StringBuilder stringBuilder3 = serializedObjectSupporter0.deserializeObjectStringBuilder143();
        java.lang.StringBuilder stringBuilder4 = serializedObjectSupporter0.deserializeObjectStringBuilder261();
        java.lang.StringBuilder stringBuilder5 = serializedObjectSupporter0.deserializeObjectStringBuilder423();
        org.jsoup.nodes.TextNode textNode6 = serializedObjectSupporter0.deserializeObjectTextNode145();
        java.util.List<org.jsoup.nodes.Node> nodeList7 = null; // flaky: textNode6.siblingNodes();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "More" + "'", str1, "More");
// flaky:         org.junit.Assert.assertNotNull(textNode2);
        org.junit.Assert.assertNotNull(stringBuilder3);
        org.junit.Assert.assertEquals(stringBuilder3.toString(), "<div id=\"1\"></div>\n<div id=\"2\">\n Text \n <p>One</p>");
        org.junit.Assert.assertNotNull(stringBuilder4);
        org.junit.Assert.assertEquals(stringBuilder4.toString(), "<doc>\n <val>");
        org.junit.Assert.assertNotNull(stringBuilder5);
        org.junit.Assert.assertEquals(stringBuilder5.toString(), "<p><b>One</b></p>\n<b> \n <table>\n  <tbody>\n   <tr>\n    <td><p><i>Three</i></p><p><i>Four</i></p></td>\n   </tr>\n  </tbody>\n </table> <p>");
// flaky:         org.junit.Assert.assertNotNull(textNode6);
// flaky:         org.junit.Assert.assertNotNull(nodeList7);
    }

    @Test
    public void test112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test112");
        org.jsoup.nodes.SerializedObjectSupporter serializedObjectSupporter0 = new org.jsoup.nodes.SerializedObjectSupporter();
        java.lang.String str1 = serializedObjectSupporter0.deserializeObjectString93();
        org.jsoup.nodes.TextNode textNode2 = serializedObjectSupporter0.deserializeObjectTextNode214();
        java.lang.StringBuilder stringBuilder3 = serializedObjectSupporter0.deserializeObjectStringBuilder19();
        java.lang.StringBuilder stringBuilder4 = serializedObjectSupporter0.deserializeObjectStringBuilder225();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Document document5 = serializedObjectSupporter0.deserializeObjectDocument138();
// flaky:             org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: org.jsoup.nodes.Document$OutputSettings cannot be cast to org.jsoup.nodes.Document");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "More" + "'", str1, "More");
// flaky:         org.junit.Assert.assertNotNull(textNode2);
        org.junit.Assert.assertNotNull(stringBuilder3);
        org.junit.Assert.assertEquals(stringBuilder3.toString(), "<p>This <a>is</a><span>");
        org.junit.Assert.assertNotNull(stringBuilder4);
        org.junit.Assert.assertEquals(stringBuilder4.toString(), "");
    }

    @Test
    public void test113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test113");
        org.jsoup.nodes.Document.OutputSettings outputSettings0 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Entities.EscapeMode escapeMode1 = null;
        outputSettings0.setescapeMode(escapeMode1);
        org.jsoup.nodes.Entities.EscapeMode escapeMode3 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings4 = outputSettings0.escapeMode(escapeMode3);
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Document.OutputSettings outputSettings5 = outputSettings0.clone();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(outputSettings4);
    }

    @Test
    public void test114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test114");
        org.jsoup.nodes.SerializedObjectSupporter serializedObjectSupporter0 = new org.jsoup.nodes.SerializedObjectSupporter();
        java.lang.String str1 = serializedObjectSupporter0.deserializeObjectString93();
        org.jsoup.nodes.TextNode textNode2 = serializedObjectSupporter0.deserializeObjectTextNode214();
        java.lang.StringBuilder stringBuilder3 = serializedObjectSupporter0.deserializeObjectStringBuilder143();
        java.lang.StringBuilder stringBuilder4 = serializedObjectSupporter0.deserializeObjectStringBuilder261();
        org.jsoup.nodes.TextNode textNode5 = serializedObjectSupporter0.deserializeObjectTextNode255();
        org.jsoup.nodes.TextNode textNode6 = serializedObjectSupporter0.deserializeObjectTextNode421();
        org.jsoup.nodes.TextNode textNode7 = serializedObjectSupporter0.deserializeObjectTextNode251();
        java.lang.String str8 = serializedObjectSupporter0.deserializeObjectString75();
        org.jsoup.nodes.TextNode textNode9 = serializedObjectSupporter0.deserializeObjectTextNode255();
        java.lang.StringBuilder stringBuilder10 = serializedObjectSupporter0.deserializeObjectStringBuilder123();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Document document11 = serializedObjectSupporter0.deserializeObjectDocument109();
// flaky:             org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: org.jsoup.nodes.Document$OutputSettings cannot be cast to org.jsoup.nodes.Document");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "More" + "'", str1, "More");
// flaky:         org.junit.Assert.assertNotNull(textNode2);
        org.junit.Assert.assertNotNull(stringBuilder3);
        org.junit.Assert.assertEquals(stringBuilder3.toString(), "<div id=\"1\"></div>\n<div id=\"2\">\n Text \n <p>One</p>");
        org.junit.Assert.assertNotNull(stringBuilder4);
        org.junit.Assert.assertEquals(stringBuilder4.toString(), "<doc>\n <val>");
// flaky:         org.junit.Assert.assertNotNull(textNode5);
// flaky:         org.junit.Assert.assertNotNull(textNode6);
// flaky:         org.junit.Assert.assertNotNull(textNode7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Nice" + "'", str8, "Nice");
// flaky:         org.junit.Assert.assertNotNull(textNode9);
        org.junit.Assert.assertNotNull(stringBuilder10);
        org.junit.Assert.assertEquals(stringBuilder10.toString(), "<div>\n <div class=\"head\">\n  <p>");
    }

    @Test
    public void test115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test115");
        org.jsoup.nodes.SerializedObjectSupporter serializedObjectSupporter0 = new org.jsoup.nodes.SerializedObjectSupporter();
        org.jsoup.nodes.TextNode textNode1 = serializedObjectSupporter0.deserializeObjectTextNode401();
        java.lang.StringBuilder stringBuilder2 = serializedObjectSupporter0.deserializeObjectStringBuilder60();
        java.lang.StringBuilder stringBuilder3 = serializedObjectSupporter0.deserializeObjectStringBuilder114();
        java.lang.StringBuilder stringBuilder4 = serializedObjectSupporter0.deserializeObjectStringBuilder238();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Document document5 = serializedObjectSupporter0.deserializeObjectDocument16();
// flaky:             org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: org.jsoup.nodes.Document$OutputSettings cannot be cast to org.jsoup.nodes.Document");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
// flaky:         org.junit.Assert.assertNotNull(textNode1);
        org.junit.Assert.assertNotNull(stringBuilder2);
        org.junit.Assert.assertEquals(stringBuilder2.toString(), "<html>\n <head>\n  <script>one</script>\n  <noscript></noscript>\n </head>\n <body>\n  <p>");
        org.junit.Assert.assertNotNull(stringBuilder3);
        org.junit.Assert.assertEquals(stringBuilder3.toString(), "\nthere &amp; now &gt; \n<p>");
        org.junit.Assert.assertNotNull(stringBuilder4);
        org.junit.Assert.assertEquals(stringBuilder4.toString(), "<img src=\"cid:12345\" />");
    }

    @Test
    public void test116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test116");
        org.jsoup.nodes.SerializedObjectSupporter serializedObjectSupporter0 = new org.jsoup.nodes.SerializedObjectSupporter();
        java.lang.String str1 = serializedObjectSupporter0.deserializeObjectString93();
        java.lang.StringBuilder stringBuilder2 = serializedObjectSupporter0.deserializeObjectStringBuilder267();
        org.jsoup.nodes.TextNode textNode3 = serializedObjectSupporter0.deserializeObjectTextNode102();
        org.jsoup.nodes.TextNode textNode4 = serializedObjectSupporter0.deserializeObjectTextNode184();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "More" + "'", str1, "More");
        org.junit.Assert.assertNotNull(stringBuilder2);
        org.junit.Assert.assertEquals(stringBuilder2.toString(), "<doc>\n <val>");
// flaky:         org.junit.Assert.assertNotNull(textNode3);
// flaky:         org.junit.Assert.assertNotNull(textNode4);
    }

    @Test
    public void test117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test117");
        org.jsoup.nodes.SerializedObjectSupporter serializedObjectSupporter0 = new org.jsoup.nodes.SerializedObjectSupporter();
        java.lang.StringBuilder stringBuilder1 = serializedObjectSupporter0.deserializeObjectStringBuilder294();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Document document2 = serializedObjectSupporter0.deserializeObjectDocument248();
// flaky:             org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: org.jsoup.nodes.Document$OutputSettings cannot be cast to org.jsoup.nodes.Document");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(stringBuilder1);
        org.junit.Assert.assertEquals(stringBuilder1.toString(), "<html>\n <head></head>\n <body class=\"name\">\n  <font face=\"Arial\">\n   <div>");
    }

    @Test
    public void test118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test118");
        org.jsoup.nodes.SerializedObjectSupporter serializedObjectSupporter0 = new org.jsoup.nodes.SerializedObjectSupporter();
        org.jsoup.nodes.TextNode textNode1 = serializedObjectSupporter0.deserializeObjectTextNode401();
        org.jsoup.nodes.TextNode textNode2 = serializedObjectSupporter0.deserializeObjectTextNode376();
        org.jsoup.nodes.TextNode textNode3 = serializedObjectSupporter0.deserializeObjectTextNode145();
        java.lang.StringBuilder stringBuilder4 = serializedObjectSupporter0.deserializeObjectStringBuilder373();
        org.jsoup.nodes.TextNode textNode5 = serializedObjectSupporter0.deserializeObjectTextNode344();
// flaky:         textNode5.ensureAttributes();
// flaky:         org.junit.Assert.assertNotNull(textNode1);
// flaky:         org.junit.Assert.assertNotNull(textNode2);
// flaky:         org.junit.Assert.assertNotNull(textNode3);
        org.junit.Assert.assertNotNull(stringBuilder4);
        org.junit.Assert.assertEquals(stringBuilder4.toString(), "");
// flaky:         org.junit.Assert.assertNotNull(textNode5);
    }

    @Test
    public void test119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test119");
        org.jsoup.nodes.SerializedObjectSupporter serializedObjectSupporter0 = new org.jsoup.nodes.SerializedObjectSupporter();
        org.jsoup.nodes.TextNode textNode1 = serializedObjectSupporter0.deserializeObjectTextNode401();
        org.jsoup.nodes.TextNode textNode2 = serializedObjectSupporter0.deserializeObjectTextNode376();
        org.jsoup.nodes.TextNode textNode3 = serializedObjectSupporter0.deserializeObjectTextNode145();
        java.lang.StringBuilder stringBuilder4 = serializedObjectSupporter0.deserializeObjectStringBuilder317();
// flaky:         org.junit.Assert.assertNotNull(textNode1);
// flaky:         org.junit.Assert.assertNotNull(textNode2);
// flaky:         org.junit.Assert.assertNotNull(textNode3);
        org.junit.Assert.assertNotNull(stringBuilder4);
        org.junit.Assert.assertEquals(stringBuilder4.toString(), "<font>");
    }

    @Test
    public void test120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test120");
        org.jsoup.nodes.SerializedObjectSupporter serializedObjectSupporter0 = new org.jsoup.nodes.SerializedObjectSupporter();
        org.jsoup.nodes.TextNode textNode1 = serializedObjectSupporter0.deserializeObjectTextNode401();
        java.lang.StringBuilder stringBuilder2 = serializedObjectSupporter0.deserializeObjectStringBuilder163();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString25();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Document document4 = serializedObjectSupporter0.deserializeObjectDocument201();
// flaky:             org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: org.jsoup.nodes.Document$OutputSettings cannot be cast to org.jsoup.nodes.Document");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
// flaky:         org.junit.Assert.assertNotNull(textNode1);
        org.junit.Assert.assertNotNull(stringBuilder2);
        org.junit.Assert.assertEquals(stringBuilder2.toString(), "<html>\n <head>\n  <title>Format test</title>\n </head>\n <body>\n  <div>\n   <p>\n    Hello \n    <span>\n     jsoup \n     <span>");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Hello " + "'", str3, "Hello ");
    }

    @Test
    public void test121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test121");
        org.jsoup.nodes.SerializedObjectSupporter serializedObjectSupporter0 = new org.jsoup.nodes.SerializedObjectSupporter();
        java.lang.String str1 = serializedObjectSupporter0.deserializeObjectString93();
        org.jsoup.nodes.TextNode textNode2 = serializedObjectSupporter0.deserializeObjectTextNode214();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString109();
        org.jsoup.nodes.TextNode textNode4 = serializedObjectSupporter0.deserializeObjectTextNode86();
        org.jsoup.nodes.TextNode textNode5 = serializedObjectSupporter0.deserializeObjectTextNode143();
        java.lang.StringBuilder stringBuilder6 = serializedObjectSupporter0.deserializeObjectStringBuilder356();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "More" + "'", str1, "More");
// flaky:         org.junit.Assert.assertNotNull(textNode2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "A caption" + "'", str3, "A caption");
// flaky:         org.junit.Assert.assertNotNull(textNode4);
// flaky:         org.junit.Assert.assertNotNull(textNode5);
        org.junit.Assert.assertNotNull(stringBuilder6);
        org.junit.Assert.assertEquals(stringBuilder6.toString(), "<table>\n <tbody>\n  <tr>\n   <td>1</td>\n  </tr> \n  <tr>\n   <td>2</td>\n  </tr> \n  <tr>\n   <td> \n    <table>\n     <tbody>\n      <tr>\n       <td>3</td>");
    }

    @Test
    public void test122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test122");
        org.jsoup.nodes.SerializedObjectSupporter serializedObjectSupporter0 = new org.jsoup.nodes.SerializedObjectSupporter();
        java.lang.String str1 = serializedObjectSupporter0.deserializeObjectString93();
        java.lang.StringBuilder stringBuilder2 = serializedObjectSupporter0.deserializeObjectStringBuilder36();
        org.jsoup.nodes.TextNode textNode3 = serializedObjectSupporter0.deserializeObjectTextNode102();
        java.lang.StringBuilder stringBuilder4 = serializedObjectSupporter0.deserializeObjectStringBuilder101();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Document document5 = serializedObjectSupporter0.deserializeObjectDocument414();
// flaky:             org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: org.jsoup.nodes.Document$OutputSettings cannot be cast to org.jsoup.nodes.Document");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "More" + "'", str1, "More");
        org.junit.Assert.assertNotNull(stringBuilder2);
        org.junit.Assert.assertEquals(stringBuilder2.toString(), "<div>\n <p><b>This</b> is <b>jsoup</b>.</p>\n</div>");
// flaky:         org.junit.Assert.assertNotNull(textNode3);
        org.junit.Assert.assertNotNull(stringBuilder4);
        org.junit.Assert.assertEquals(stringBuilder4.toString(), "<div>\n <p>One</p>\n <p><span>");
    }

    @Test
    public void test123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test123");
        org.jsoup.nodes.Document.OutputSettings outputSettings0 = new org.jsoup.nodes.Document.OutputSettings();
        java.nio.charset.CharsetEncoder charsetEncoder1 = null;
        outputSettings0.setcharsetEncoder(charsetEncoder1);
        int int3 = outputSettings0.indentAmount();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
    }

    @Test
    public void test124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test124");
        org.jsoup.nodes.SerializedObjectSupporter serializedObjectSupporter0 = new org.jsoup.nodes.SerializedObjectSupporter();
        java.lang.String str1 = serializedObjectSupporter0.deserializeObjectString93();
        java.lang.StringBuilder stringBuilder2 = serializedObjectSupporter0.deserializeObjectStringBuilder36();
        org.jsoup.nodes.TextNode textNode3 = serializedObjectSupporter0.deserializeObjectTextNode137();
        org.jsoup.nodes.TextNode textNode4 = serializedObjectSupporter0.deserializeObjectTextNode289();
        java.lang.StringBuilder stringBuilder5 = serializedObjectSupporter0.deserializeObjectStringBuilder86();
        java.lang.StringBuilder stringBuilder6 = serializedObjectSupporter0.deserializeObjectStringBuilder149();
        org.jsoup.nodes.TextNode textNode7 = serializedObjectSupporter0.deserializeObjectTextNode242();
        java.lang.StringBuilder stringBuilder8 = serializedObjectSupporter0.deserializeObjectStringBuilder169();
        java.lang.StringBuilder stringBuilder9 = serializedObjectSupporter0.deserializeObjectStringBuilder381();
        java.lang.StringBuilder stringBuilder10 = serializedObjectSupporter0.deserializeObjectStringBuilder67();
        org.jsoup.nodes.TextNode textNode11 = serializedObjectSupporter0.deserializeObjectTextNode198();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "More" + "'", str1, "More");
        org.junit.Assert.assertNotNull(stringBuilder2);
        org.junit.Assert.assertEquals(stringBuilder2.toString(), "<div>\n <p><b>This</b> is <b>jsoup</b>.</p>\n</div>");
// flaky:         org.junit.Assert.assertNotNull(textNode3);
// flaky:         org.junit.Assert.assertNotNull(textNode4);
        org.junit.Assert.assertNotNull(stringBuilder5);
        org.junit.Assert.assertEquals(stringBuilder5.toString(), "<div>\n <div>\n  one\n </div>\n <div>\n  two\n </div>\n <p>Hello</p>\n <p>Three</p>\n <!-- four -->\n <p>");
        org.junit.Assert.assertNotNull(stringBuilder6);
        org.junit.Assert.assertEquals(stringBuilder6.toString(), "<div id=\"1\">\n Text \n <p>One</p> Text \n <p>Two</p>\n</div>\n<div id=\"2\">\n <p>");
// flaky:         org.junit.Assert.assertNotNull(textNode7);
        org.junit.Assert.assertNotNull(stringBuilder8);
        org.junit.Assert.assertEquals(stringBuilder8.toString(), "<title>");
        org.junit.Assert.assertNotNull(stringBuilder9);
        org.junit.Assert.assertEquals(stringBuilder9.toString(), "<table> \n <colgroup> \n  <col />");
        org.junit.Assert.assertNotNull(stringBuilder10);
        org.junit.Assert.assertEquals(stringBuilder10.toString(), "<html>\n <head>\n  <title>Hello</title>");
// flaky:         org.junit.Assert.assertNotNull(textNode11);
    }

    @Test
    public void test125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test125");
        org.jsoup.nodes.SerializedObjectSupporter serializedObjectSupporter0 = new org.jsoup.nodes.SerializedObjectSupporter();
        java.lang.String str1 = serializedObjectSupporter0.deserializeObjectString93();
        org.jsoup.nodes.TextNode textNode2 = serializedObjectSupporter0.deserializeObjectTextNode214();
        org.jsoup.nodes.TextNode textNode3 = serializedObjectSupporter0.deserializeObjectTextNode260();
        java.lang.StringBuilder stringBuilder4 = serializedObjectSupporter0.deserializeObjectStringBuilder345();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Document document5 = serializedObjectSupporter0.deserializeObjectDocument11();
// flaky:             org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: org.jsoup.nodes.Document$OutputSettings cannot be cast to org.jsoup.nodes.Document");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "More" + "'", str1, "More");
// flaky:         org.junit.Assert.assertNotNull(textNode2);
// flaky:         org.junit.Assert.assertNotNull(textNode3);
        org.junit.Assert.assertNotNull(stringBuilder4);
        org.junit.Assert.assertEquals(stringBuilder4.toString(), "<div> \n <a name=\"top\"></a>\n <p id=\"1\">");
    }

    @Test
    public void test126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test126");
        org.jsoup.nodes.SerializedObjectSupporter serializedObjectSupporter0 = new org.jsoup.nodes.SerializedObjectSupporter();
        java.lang.String str1 = serializedObjectSupporter0.deserializeObjectString93();
        java.lang.StringBuilder stringBuilder2 = serializedObjectSupporter0.deserializeObjectStringBuilder36();
        org.jsoup.nodes.TextNode textNode3 = serializedObjectSupporter0.deserializeObjectTextNode137();
        org.jsoup.nodes.TextNode textNode4 = serializedObjectSupporter0.deserializeObjectTextNode289();
        java.lang.StringBuilder stringBuilder5 = serializedObjectSupporter0.deserializeObjectStringBuilder86();
        java.lang.StringBuilder stringBuilder6 = serializedObjectSupporter0.deserializeObjectStringBuilder149();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Document document7 = serializedObjectSupporter0.deserializeObjectDocument167();
// flaky:             org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: org.jsoup.nodes.Document$OutputSettings cannot be cast to org.jsoup.nodes.Document");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "More" + "'", str1, "More");
        org.junit.Assert.assertNotNull(stringBuilder2);
        org.junit.Assert.assertEquals(stringBuilder2.toString(), "<div>\n <p><b>This</b> is <b>jsoup</b>.</p>\n</div>");
// flaky:         org.junit.Assert.assertNotNull(textNode3);
// flaky:         org.junit.Assert.assertNotNull(textNode4);
        org.junit.Assert.assertNotNull(stringBuilder5);
        org.junit.Assert.assertEquals(stringBuilder5.toString(), "<div>\n <div>\n  one\n </div>\n <div>\n  two\n </div>\n <p>Hello</p>\n <p>Three</p>\n <!-- four -->\n <p>");
        org.junit.Assert.assertNotNull(stringBuilder6);
        org.junit.Assert.assertEquals(stringBuilder6.toString(), "<div id=\"1\">\n Text \n <p>One</p> Text \n <p>Two</p>\n</div>\n<div id=\"2\">\n <p>");
    }

    @Test
    public void test127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test127");
        org.jsoup.nodes.SerializedObjectSupporter serializedObjectSupporter0 = new org.jsoup.nodes.SerializedObjectSupporter();
        org.jsoup.nodes.TextNode textNode1 = serializedObjectSupporter0.deserializeObjectTextNode401();
        org.jsoup.nodes.TextNode textNode2 = serializedObjectSupporter0.deserializeObjectTextNode376();
        org.jsoup.nodes.TextNode textNode3 = serializedObjectSupporter0.deserializeObjectTextNode122();
// flaky:         org.junit.Assert.assertNotNull(textNode1);
// flaky:         org.junit.Assert.assertNotNull(textNode2);
// flaky:         org.junit.Assert.assertNotNull(textNode3);
    }

    @Test
    public void test128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test128");
        org.jsoup.nodes.SerializedObjectSupporter serializedObjectSupporter0 = new org.jsoup.nodes.SerializedObjectSupporter();
        java.lang.String str1 = serializedObjectSupporter0.deserializeObjectString93();
        java.lang.StringBuilder stringBuilder2 = serializedObjectSupporter0.deserializeObjectStringBuilder36();
        org.jsoup.nodes.TextNode textNode3 = serializedObjectSupporter0.deserializeObjectTextNode102();
        org.jsoup.nodes.TextNode textNode4 = serializedObjectSupporter0.deserializeObjectTextNode270();
        java.lang.String str5 = null; // flaky: textNode4.getTEXT_KEY();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "More" + "'", str1, "More");
        org.junit.Assert.assertNotNull(stringBuilder2);
        org.junit.Assert.assertEquals(stringBuilder2.toString(), "<div>\n <p><b>This</b> is <b>jsoup</b>.</p>\n</div>");
// flaky:         org.junit.Assert.assertNotNull(textNode3);
// flaky:         org.junit.Assert.assertNotNull(textNode4);
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "text" + "'", str5, "text");
    }

    @Test
    public void test129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test129");
        org.jsoup.nodes.SerializedObjectSupporter serializedObjectSupporter0 = new org.jsoup.nodes.SerializedObjectSupporter();
        org.jsoup.nodes.TextNode textNode1 = serializedObjectSupporter0.deserializeObjectTextNode401();
        java.lang.StringBuilder stringBuilder2 = serializedObjectSupporter0.deserializeObjectStringBuilder60();
        java.lang.StringBuilder stringBuilder3 = serializedObjectSupporter0.deserializeObjectStringBuilder114();
        java.lang.StringBuilder stringBuilder4 = serializedObjectSupporter0.deserializeObjectStringBuilder238();
        java.lang.StringBuilder stringBuilder5 = serializedObjectSupporter0.deserializeObjectStringBuilder38();
// flaky:         org.junit.Assert.assertNotNull(textNode1);
        org.junit.Assert.assertNotNull(stringBuilder2);
        org.junit.Assert.assertEquals(stringBuilder2.toString(), "<html>\n <head>\n  <script>one</script>\n  <noscript></noscript>\n </head>\n <body>\n  <p>");
        org.junit.Assert.assertNotNull(stringBuilder3);
        org.junit.Assert.assertEquals(stringBuilder3.toString(), "\nthere &amp; now &gt; \n<p>");
        org.junit.Assert.assertNotNull(stringBuilder4);
        org.junit.Assert.assertEquals(stringBuilder4.toString(), "<img src=\"cid:12345\" />");
        org.junit.Assert.assertNotNull(stringBuilder5);
        org.junit.Assert.assertEquals(stringBuilder5.toString(), "<a>");
    }

    @Test
    public void test130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test130");
        org.jsoup.nodes.SerializedObjectSupporter serializedObjectSupporter0 = new org.jsoup.nodes.SerializedObjectSupporter();
        java.lang.String str1 = serializedObjectSupporter0.deserializeObjectString93();
        java.lang.StringBuilder stringBuilder2 = serializedObjectSupporter0.deserializeObjectStringBuilder36();
        org.jsoup.nodes.TextNode textNode3 = serializedObjectSupporter0.deserializeObjectTextNode102();
        java.lang.StringBuilder stringBuilder4 = serializedObjectSupporter0.deserializeObjectStringBuilder101();
        org.jsoup.nodes.TextNode textNode5 = serializedObjectSupporter0.deserializeObjectTextNode307();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "More" + "'", str1, "More");
        org.junit.Assert.assertNotNull(stringBuilder2);
        org.junit.Assert.assertEquals(stringBuilder2.toString(), "<div>\n <p><b>This</b> is <b>jsoup</b>.</p>\n</div>");
// flaky:         org.junit.Assert.assertNotNull(textNode3);
        org.junit.Assert.assertNotNull(stringBuilder4);
        org.junit.Assert.assertEquals(stringBuilder4.toString(), "<div>\n <p>One</p>\n <p><span>");
// flaky:         org.junit.Assert.assertNotNull(textNode5);
    }

    @Test
    public void test131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test131");
        org.jsoup.nodes.SerializedObjectSupporter serializedObjectSupporter0 = new org.jsoup.nodes.SerializedObjectSupporter();
        java.lang.String str1 = serializedObjectSupporter0.deserializeObjectString93();
        java.lang.StringBuilder stringBuilder2 = serializedObjectSupporter0.deserializeObjectStringBuilder215();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString128();
        java.lang.StringBuilder stringBuilder4 = serializedObjectSupporter0.deserializeObjectStringBuilder419();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Document document5 = serializedObjectSupporter0.deserializeObjectDocument149();
// flaky:             org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: org.jsoup.nodes.Document$OutputSettings cannot be cast to org.jsoup.nodes.Document");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "More" + "'", str1, "More");
        org.junit.Assert.assertNotNull(stringBuilder2);
        org.junit.Assert.assertEquals(stringBuilder2.toString(), "<div id=\"1\">");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + " 12.3% " + "'", str3, " 12.3% ");
        org.junit.Assert.assertNotNull(stringBuilder4);
        org.junit.Assert.assertEquals(stringBuilder4.toString(), "<p><b>One</b></p>\n<b>");
    }

    @Test
    public void test132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test132");
        org.jsoup.nodes.SerializedObjectSupporter serializedObjectSupporter0 = new org.jsoup.nodes.SerializedObjectSupporter();
        java.lang.String str1 = serializedObjectSupporter0.deserializeObjectString93();
        java.lang.StringBuilder stringBuilder2 = serializedObjectSupporter0.deserializeObjectStringBuilder215();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString128();
        java.lang.StringBuilder stringBuilder4 = serializedObjectSupporter0.deserializeObjectStringBuilder419();
        java.lang.String str5 = serializedObjectSupporter0.deserializeObjectString34();
        org.jsoup.nodes.TextNode textNode6 = serializedObjectSupporter0.deserializeObjectTextNode185();
        org.jsoup.nodes.TextNode textNode7 = serializedObjectSupporter0.deserializeObjectTextNode12();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "More" + "'", str1, "More");
        org.junit.Assert.assertNotNull(stringBuilder2);
        org.junit.Assert.assertEquals(stringBuilder2.toString(), "<div id=\"1\">");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + " 12.3% " + "'", str3, " 12.3% ");
        org.junit.Assert.assertNotNull(stringBuilder4);
        org.junit.Assert.assertEquals(stringBuilder4.toString(), "<p><b>One</b></p>\n<b>");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "< > & \" ' \327" + "'", str5, "< > & \" ' \327");
// flaky:         org.junit.Assert.assertNotNull(textNode6);
// flaky:         org.junit.Assert.assertNotNull(textNode7);
    }

    @Test
    public void test133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test133");
        org.jsoup.nodes.SerializedObjectSupporter serializedObjectSupporter0 = new org.jsoup.nodes.SerializedObjectSupporter();
        java.lang.String str1 = serializedObjectSupporter0.deserializeObjectString93();
        org.jsoup.nodes.TextNode textNode2 = serializedObjectSupporter0.deserializeObjectTextNode214();
        java.lang.StringBuilder stringBuilder3 = serializedObjectSupporter0.deserializeObjectStringBuilder143();
        java.lang.StringBuilder stringBuilder4 = serializedObjectSupporter0.deserializeObjectStringBuilder261();
        org.jsoup.nodes.TextNode textNode5 = serializedObjectSupporter0.deserializeObjectTextNode255();
        org.jsoup.nodes.TextNode textNode6 = serializedObjectSupporter0.deserializeObjectTextNode421();
        org.jsoup.nodes.TextNode textNode7 = serializedObjectSupporter0.deserializeObjectTextNode251();
        java.lang.StringBuilder stringBuilder8 = serializedObjectSupporter0.deserializeObjectStringBuilder232();
        org.jsoup.nodes.TextNode textNode9 = serializedObjectSupporter0.deserializeObjectTextNode278();
        org.jsoup.nodes.TextNode textNode10 = serializedObjectSupporter0.deserializeObjectTextNode287();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "More" + "'", str1, "More");
// flaky:         org.junit.Assert.assertNotNull(textNode2);
        org.junit.Assert.assertNotNull(stringBuilder3);
        org.junit.Assert.assertEquals(stringBuilder3.toString(), "<div id=\"1\"></div>\n<div id=\"2\">\n Text \n <p>One</p>");
        org.junit.Assert.assertNotNull(stringBuilder4);
        org.junit.Assert.assertEquals(stringBuilder4.toString(), "<doc>\n <val>");
// flaky:         org.junit.Assert.assertNotNull(textNode5);
// flaky:         org.junit.Assert.assertNotNull(textNode6);
// flaky:         org.junit.Assert.assertNotNull(textNode7);
        org.junit.Assert.assertNotNull(stringBuilder8);
        org.junit.Assert.assertEquals(stringBuilder8.toString(), "<p><a rel=\"nofollow\">Dodgy</a> <a href=\"http://nice.com\" rel=\"nofollow\">Nice</a></p>\n<blockquote>");
// flaky:         org.junit.Assert.assertNotNull(textNode9);
// flaky:         org.junit.Assert.assertNotNull(textNode10);
    }

    @Test
    public void test134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test134");
        org.jsoup.nodes.SerializedObjectSupporter serializedObjectSupporter0 = new org.jsoup.nodes.SerializedObjectSupporter();
        java.lang.String str1 = serializedObjectSupporter0.deserializeObjectString93();
        java.lang.StringBuilder stringBuilder2 = serializedObjectSupporter0.deserializeObjectStringBuilder36();
        org.jsoup.nodes.TextNode textNode3 = serializedObjectSupporter0.deserializeObjectTextNode137();
        org.jsoup.nodes.TextNode textNode4 = serializedObjectSupporter0.deserializeObjectTextNode289();
        java.lang.StringBuilder stringBuilder5 = serializedObjectSupporter0.deserializeObjectStringBuilder86();
        org.jsoup.nodes.TextNode textNode6 = serializedObjectSupporter0.deserializeObjectTextNode400();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Document document7 = serializedObjectSupporter0.deserializeObjectDocument275();
// flaky:             org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: org.jsoup.nodes.Document$OutputSettings cannot be cast to org.jsoup.nodes.Document");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "More" + "'", str1, "More");
        org.junit.Assert.assertNotNull(stringBuilder2);
        org.junit.Assert.assertEquals(stringBuilder2.toString(), "<div>\n <p><b>This</b> is <b>jsoup</b>.</p>\n</div>");
// flaky:         org.junit.Assert.assertNotNull(textNode3);
// flaky:         org.junit.Assert.assertNotNull(textNode4);
        org.junit.Assert.assertNotNull(stringBuilder5);
        org.junit.Assert.assertEquals(stringBuilder5.toString(), "<div>\n <div>\n  one\n </div>\n <div>\n  two\n </div>\n <p>Hello</p>\n <p>Three</p>\n <!-- four -->\n <p>");
// flaky:         org.junit.Assert.assertNotNull(textNode6);
    }

    @Test
    public void test135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test135");
        org.jsoup.nodes.SerializedObjectSupporter serializedObjectSupporter0 = new org.jsoup.nodes.SerializedObjectSupporter();
        java.lang.String str1 = serializedObjectSupporter0.deserializeObjectString93();
        java.lang.StringBuilder stringBuilder2 = serializedObjectSupporter0.deserializeObjectStringBuilder36();
        org.jsoup.nodes.TextNode textNode3 = serializedObjectSupporter0.deserializeObjectTextNode102();
        java.lang.StringBuilder stringBuilder4 = serializedObjectSupporter0.deserializeObjectStringBuilder101();
        java.lang.StringBuilder stringBuilder5 = serializedObjectSupporter0.deserializeObjectStringBuilder186();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Document document6 = serializedObjectSupporter0.deserializeObjectDocument380();
// flaky:             org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: org.jsoup.nodes.Document$OutputSettings cannot be cast to org.jsoup.nodes.Document");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "More" + "'", str1, "More");
        org.junit.Assert.assertNotNull(stringBuilder2);
        org.junit.Assert.assertEquals(stringBuilder2.toString(), "<div>\n <p><b>This</b> is <b>jsoup</b>.</p>\n</div>");
// flaky:         org.junit.Assert.assertNotNull(textNode3);
        org.junit.Assert.assertNotNull(stringBuilder4);
        org.junit.Assert.assertEquals(stringBuilder4.toString(), "<div>\n <p>One</p>\n <p><span>");
        org.junit.Assert.assertNotNull(stringBuilder5);
        org.junit.Assert.assertEquals(stringBuilder5.toString(), "<div>\n One Two \n <b>");
    }

    @Test
    public void test136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test136");
        org.jsoup.nodes.SerializedObjectSupporter serializedObjectSupporter0 = new org.jsoup.nodes.SerializedObjectSupporter();
        java.lang.String str1 = serializedObjectSupporter0.deserializeObjectString93();
        java.lang.StringBuilder stringBuilder2 = serializedObjectSupporter0.deserializeObjectStringBuilder36();
        org.jsoup.nodes.TextNode textNode3 = serializedObjectSupporter0.deserializeObjectTextNode137();
        org.jsoup.nodes.TextNode textNode4 = serializedObjectSupporter0.deserializeObjectTextNode289();
        java.lang.StringBuilder stringBuilder5 = serializedObjectSupporter0.deserializeObjectStringBuilder254();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Document document6 = serializedObjectSupporter0.deserializeObjectDocument164();
// flaky:             org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: org.jsoup.nodes.Document$OutputSettings cannot be cast to org.jsoup.nodes.Document");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "More" + "'", str1, "More");
        org.junit.Assert.assertNotNull(stringBuilder2);
        org.junit.Assert.assertEquals(stringBuilder2.toString(), "<div>\n <p><b>This</b> is <b>jsoup</b>.</p>\n</div>");
// flaky:         org.junit.Assert.assertNotNull(textNode3);
// flaky:         org.junit.Assert.assertNotNull(textNode4);
        org.junit.Assert.assertNotNull(stringBuilder5);
        org.junit.Assert.assertEquals(stringBuilder5.toString(), "\nHello \n<b>there</b>");
    }

    @Test
    public void test137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test137");
        org.jsoup.nodes.SerializedObjectSupporter serializedObjectSupporter0 = new org.jsoup.nodes.SerializedObjectSupporter();
        java.lang.String str1 = serializedObjectSupporter0.deserializeObjectString93();
        java.lang.StringBuilder stringBuilder2 = serializedObjectSupporter0.deserializeObjectStringBuilder36();
        org.jsoup.nodes.TextNode textNode3 = serializedObjectSupporter0.deserializeObjectTextNode137();
        org.jsoup.nodes.TextNode textNode4 = serializedObjectSupporter0.deserializeObjectTextNode289();
        java.lang.StringBuilder stringBuilder5 = serializedObjectSupporter0.deserializeObjectStringBuilder86();
        org.jsoup.nodes.TextNode textNode6 = serializedObjectSupporter0.deserializeObjectTextNode359();
        java.lang.String str7 = serializedObjectSupporter0.deserializeObjectString47();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Document document8 = serializedObjectSupporter0.deserializeObjectDocument129();
// flaky:             org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: org.jsoup.nodes.Document$OutputSettings cannot be cast to org.jsoup.nodes.Document");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "More" + "'", str1, "More");
        org.junit.Assert.assertNotNull(stringBuilder2);
        org.junit.Assert.assertEquals(stringBuilder2.toString(), "<div>\n <p><b>This</b> is <b>jsoup</b>.</p>\n</div>");
// flaky:         org.junit.Assert.assertNotNull(textNode3);
// flaky:         org.junit.Assert.assertNotNull(textNode4);
        org.junit.Assert.assertNotNull(stringBuilder5);
        org.junit.Assert.assertEquals(stringBuilder5.toString(), "<div>\n <div>\n  one\n </div>\n <div>\n  two\n </div>\n <p>Hello</p>\n <p>Three</p>\n <!-- four -->\n <p>");
// flaky:         org.junit.Assert.assertNotNull(textNode6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "There!" + "'", str7, "There!");
    }

    @Test
    public void test138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test138");
        org.jsoup.nodes.SerializedObjectSupporter serializedObjectSupporter0 = new org.jsoup.nodes.SerializedObjectSupporter();
        org.jsoup.nodes.TextNode textNode1 = serializedObjectSupporter0.deserializeObjectTextNode401();
        org.jsoup.nodes.TextNode textNode2 = serializedObjectSupporter0.deserializeObjectTextNode376();
        org.jsoup.nodes.TextNode textNode3 = serializedObjectSupporter0.deserializeObjectTextNode145();
        java.lang.StringBuilder stringBuilder4 = serializedObjectSupporter0.deserializeObjectStringBuilder373();
        org.jsoup.nodes.TextNode textNode5 = serializedObjectSupporter0.deserializeObjectTextNode344();
        org.jsoup.nodes.TextNode textNode6 = serializedObjectSupporter0.deserializeObjectTextNode416();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Document document7 = serializedObjectSupporter0.deserializeObjectDocument1();
// flaky:             org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: org.jsoup.nodes.Document$OutputSettings cannot be cast to org.jsoup.nodes.Document");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
// flaky:         org.junit.Assert.assertNotNull(textNode1);
// flaky:         org.junit.Assert.assertNotNull(textNode2);
// flaky:         org.junit.Assert.assertNotNull(textNode3);
        org.junit.Assert.assertNotNull(stringBuilder4);
        org.junit.Assert.assertEquals(stringBuilder4.toString(), "");
// flaky:         org.junit.Assert.assertNotNull(textNode5);
// flaky:         org.junit.Assert.assertNotNull(textNode6);
    }

    @Test
    public void test139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test139");
        org.jsoup.nodes.SerializedObjectSupporter serializedObjectSupporter0 = new org.jsoup.nodes.SerializedObjectSupporter();
        java.lang.String str1 = serializedObjectSupporter0.deserializeObjectString93();
        org.jsoup.nodes.TextNode textNode2 = serializedObjectSupporter0.deserializeObjectTextNode214();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString109();
        java.lang.StringBuilder stringBuilder4 = serializedObjectSupporter0.deserializeObjectStringBuilder45();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Document document5 = serializedObjectSupporter0.deserializeObjectDocument316();
// flaky:             org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: org.jsoup.nodes.Document$OutputSettings cannot be cast to org.jsoup.nodes.Document");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "More" + "'", str1, "More");
// flaky:         org.junit.Assert.assertNotNull(textNode2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "A caption" + "'", str3, "A caption");
        org.junit.Assert.assertNotNull(stringBuilder4);
        org.junit.Assert.assertEquals(stringBuilder4.toString(), "<p>");
    }

    @Test
    public void test140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test140");
        org.jsoup.nodes.SerializedObjectSupporter serializedObjectSupporter0 = new org.jsoup.nodes.SerializedObjectSupporter();
        org.jsoup.nodes.TextNode textNode1 = serializedObjectSupporter0.deserializeObjectTextNode401();
        java.lang.StringBuilder stringBuilder2 = serializedObjectSupporter0.deserializeObjectStringBuilder60();
        java.lang.StringBuilder stringBuilder3 = serializedObjectSupporter0.deserializeObjectStringBuilder114();
        java.lang.StringBuilder stringBuilder4 = serializedObjectSupporter0.deserializeObjectStringBuilder421();
        java.lang.StringBuilder stringBuilder5 = serializedObjectSupporter0.deserializeObjectStringBuilder174();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Document document6 = serializedObjectSupporter0.deserializeObjectDocument376();
// flaky:             org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: org.jsoup.nodes.Document$OutputSettings cannot be cast to org.jsoup.nodes.Document");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
// flaky:         org.junit.Assert.assertNotNull(textNode1);
        org.junit.Assert.assertNotNull(stringBuilder2);
        org.junit.Assert.assertEquals(stringBuilder2.toString(), "<html>\n <head>\n  <script>one</script>\n  <noscript></noscript>\n </head>\n <body>\n  <p>");
        org.junit.Assert.assertNotNull(stringBuilder3);
        org.junit.Assert.assertEquals(stringBuilder3.toString(), "\nthere &amp; now &gt; \n<p>");
        org.junit.Assert.assertNotNull(stringBuilder4);
        org.junit.Assert.assertEquals(stringBuilder4.toString(), "<p><b>One</b></p>\n<b> \n <table>\n  <tbody>\n   <tr>\n    <td><p><i>Three</i></p><p><i>");
        org.junit.Assert.assertNotNull(stringBuilder5);
        org.junit.Assert.assertEquals(stringBuilder5.toString(), "<div>\n <p>Hello</p>\n <p>there</p>\n</div>");
    }

    @Test
    public void test141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test141");
        org.jsoup.nodes.SerializedObjectSupporter serializedObjectSupporter0 = new org.jsoup.nodes.SerializedObjectSupporter();
        java.lang.String str1 = serializedObjectSupporter0.deserializeObjectString93();
        org.jsoup.nodes.TextNode textNode2 = serializedObjectSupporter0.deserializeObjectTextNode214();
        java.lang.StringBuilder stringBuilder3 = serializedObjectSupporter0.deserializeObjectStringBuilder143();
        java.lang.StringBuilder stringBuilder4 = serializedObjectSupporter0.deserializeObjectStringBuilder261();
        org.jsoup.nodes.TextNode textNode5 = serializedObjectSupporter0.deserializeObjectTextNode255();
        org.jsoup.nodes.TextNode textNode6 = serializedObjectSupporter0.deserializeObjectTextNode421();
        org.jsoup.nodes.TextNode textNode7 = serializedObjectSupporter0.deserializeObjectTextNode251();
        java.lang.String str8 = serializedObjectSupporter0.deserializeObjectString75();
        java.lang.String str9 = serializedObjectSupporter0.deserializeObjectString48();
        java.lang.String str10 = serializedObjectSupporter0.deserializeObjectString24();
        java.lang.String str11 = serializedObjectSupporter0.deserializeObjectString3();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Document document12 = serializedObjectSupporter0.deserializeObjectDocument328();
// flaky:             org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: org.jsoup.nodes.Document$OutputSettings cannot be cast to org.jsoup.nodes.Document");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "More" + "'", str1, "More");
// flaky:         org.junit.Assert.assertNotNull(textNode2);
        org.junit.Assert.assertNotNull(stringBuilder3);
        org.junit.Assert.assertEquals(stringBuilder3.toString(), "<div id=\"1\"></div>\n<div id=\"2\">\n Text \n <p>One</p>");
        org.junit.Assert.assertNotNull(stringBuilder4);
        org.junit.Assert.assertEquals(stringBuilder4.toString(), "<doc>\n <val>");
// flaky:         org.junit.Assert.assertNotNull(textNode5);
// flaky:         org.junit.Assert.assertNotNull(textNode6);
// flaky:         org.junit.Assert.assertNotNull(textNode7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Nice" + "'", str8, "Nice");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Check" + "'", str9, "Check");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Six" + "'", str10, "Six");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "This" + "'", str11, "This");
    }

    @Test
    public void test142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test142");
        org.jsoup.nodes.Document.OutputSettings outputSettings0 = new org.jsoup.nodes.Document.OutputSettings();
        java.nio.charset.CharsetEncoder charsetEncoder1 = null;
        outputSettings0.setcharsetEncoder(charsetEncoder1);
        outputSettings0.setprettyPrint(true);
    }

    @Test
    public void test143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test143");
        org.jsoup.nodes.SerializedObjectSupporter serializedObjectSupporter0 = new org.jsoup.nodes.SerializedObjectSupporter();
        java.lang.String str1 = serializedObjectSupporter0.deserializeObjectString93();
        java.lang.StringBuilder stringBuilder2 = serializedObjectSupporter0.deserializeObjectStringBuilder36();
        org.jsoup.nodes.TextNode textNode3 = serializedObjectSupporter0.deserializeObjectTextNode137();
        org.jsoup.nodes.TextNode textNode4 = serializedObjectSupporter0.deserializeObjectTextNode289();
        java.lang.StringBuilder stringBuilder5 = serializedObjectSupporter0.deserializeObjectStringBuilder86();
        java.lang.StringBuilder stringBuilder6 = serializedObjectSupporter0.deserializeObjectStringBuilder149();
        org.jsoup.nodes.TextNode textNode7 = serializedObjectSupporter0.deserializeObjectTextNode242();
        java.lang.StringBuilder stringBuilder8 = serializedObjectSupporter0.deserializeObjectStringBuilder169();
        java.lang.StringBuilder stringBuilder9 = serializedObjectSupporter0.deserializeObjectStringBuilder381();
        java.lang.String str10 = serializedObjectSupporter0.deserializeObjectString63();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "More" + "'", str1, "More");
        org.junit.Assert.assertNotNull(stringBuilder2);
        org.junit.Assert.assertEquals(stringBuilder2.toString(), "<div>\n <p><b>This</b> is <b>jsoup</b>.</p>\n</div>");
// flaky:         org.junit.Assert.assertNotNull(textNode3);
// flaky:         org.junit.Assert.assertNotNull(textNode4);
        org.junit.Assert.assertNotNull(stringBuilder5);
        org.junit.Assert.assertEquals(stringBuilder5.toString(), "<div>\n <div>\n  one\n </div>\n <div>\n  two\n </div>\n <p>Hello</p>\n <p>Three</p>\n <!-- four -->\n <p>");
        org.junit.Assert.assertNotNull(stringBuilder6);
        org.junit.Assert.assertEquals(stringBuilder6.toString(), "<div id=\"1\">\n Text \n <p>One</p> Text \n <p>Two</p>\n</div>\n<div id=\"2\">\n <p>");
// flaky:         org.junit.Assert.assertNotNull(textNode7);
        org.junit.Assert.assertNotNull(stringBuilder8);
        org.junit.Assert.assertEquals(stringBuilder8.toString(), "<title>");
        org.junit.Assert.assertNotNull(stringBuilder9);
        org.junit.Assert.assertEquals(stringBuilder9.toString(), "<table> \n <colgroup> \n  <col />");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "two &" + "'", str10, "two &");
    }

    @Test
    public void test144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test144");
        org.jsoup.nodes.SerializedObjectSupporter serializedObjectSupporter0 = new org.jsoup.nodes.SerializedObjectSupporter();
        java.lang.String str1 = serializedObjectSupporter0.deserializeObjectString93();
        java.lang.StringBuilder stringBuilder2 = serializedObjectSupporter0.deserializeObjectStringBuilder215();
        org.jsoup.nodes.TextNode textNode3 = serializedObjectSupporter0.deserializeObjectTextNode380();
        org.jsoup.nodes.TextNode textNode4 = serializedObjectSupporter0.deserializeObjectTextNode382();
        java.lang.StringBuilder stringBuilder5 = serializedObjectSupporter0.deserializeObjectStringBuilder73();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Document document6 = serializedObjectSupporter0.deserializeObjectDocument224();
// flaky:             org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: org.jsoup.nodes.Document$OutputSettings cannot be cast to org.jsoup.nodes.Document");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "More" + "'", str1, "More");
        org.junit.Assert.assertNotNull(stringBuilder2);
        org.junit.Assert.assertEquals(stringBuilder2.toString(), "<div id=\"1\">");
// flaky:         org.junit.Assert.assertNotNull(textNode3);
// flaky:         org.junit.Assert.assertNotNull(textNode4);
        org.junit.Assert.assertNotNull(stringBuilder5);
        org.junit.Assert.assertEquals(stringBuilder5.toString(), "<html>\n <head>\n  <title>Hello there</title> \n </head>\n <body>\n  <p id=\"1\">One more</p>\n  <p>");
    }

    @Test
    public void test145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test145");
        org.jsoup.nodes.SerializedObjectSupporter serializedObjectSupporter0 = new org.jsoup.nodes.SerializedObjectSupporter();
        java.lang.String str1 = serializedObjectSupporter0.deserializeObjectString93();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Document document2 = serializedObjectSupporter0.deserializeObjectDocument29();
// flaky:             org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: org.jsoup.nodes.Document$OutputSettings cannot be cast to org.jsoup.nodes.Document");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "More" + "'", str1, "More");
    }

    @Test
    public void test146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test146");
        org.jsoup.nodes.SerializedObjectSupporter serializedObjectSupporter0 = new org.jsoup.nodes.SerializedObjectSupporter();
        java.lang.String str1 = serializedObjectSupporter0.deserializeObjectString93();
        org.jsoup.nodes.TextNode textNode2 = serializedObjectSupporter0.deserializeObjectTextNode214();
        java.lang.StringBuilder stringBuilder3 = serializedObjectSupporter0.deserializeObjectStringBuilder143();
        java.lang.StringBuilder stringBuilder4 = serializedObjectSupporter0.deserializeObjectStringBuilder261();
        org.jsoup.nodes.TextNode textNode5 = serializedObjectSupporter0.deserializeObjectTextNode255();
        org.jsoup.nodes.TextNode textNode6 = serializedObjectSupporter0.deserializeObjectTextNode421();
        org.jsoup.nodes.TextNode textNode7 = serializedObjectSupporter0.deserializeObjectTextNode251();
        java.lang.String str8 = serializedObjectSupporter0.deserializeObjectString75();
        java.lang.String str9 = serializedObjectSupporter0.deserializeObjectString48();
        java.lang.String str10 = serializedObjectSupporter0.deserializeObjectString24();
        java.lang.String str11 = serializedObjectSupporter0.deserializeObjectString3();
        java.lang.StringBuilder stringBuilder12 = serializedObjectSupporter0.deserializeObjectStringBuilder232();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "More" + "'", str1, "More");
// flaky:         org.junit.Assert.assertNotNull(textNode2);
        org.junit.Assert.assertNotNull(stringBuilder3);
        org.junit.Assert.assertEquals(stringBuilder3.toString(), "<div id=\"1\"></div>\n<div id=\"2\">\n Text \n <p>One</p>");
        org.junit.Assert.assertNotNull(stringBuilder4);
        org.junit.Assert.assertEquals(stringBuilder4.toString(), "<doc>\n <val>");
// flaky:         org.junit.Assert.assertNotNull(textNode5);
// flaky:         org.junit.Assert.assertNotNull(textNode6);
// flaky:         org.junit.Assert.assertNotNull(textNode7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Nice" + "'", str8, "Nice");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Check" + "'", str9, "Check");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Six" + "'", str10, "Six");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "This" + "'", str11, "This");
        org.junit.Assert.assertNotNull(stringBuilder12);
        org.junit.Assert.assertEquals(stringBuilder12.toString(), "<p><a rel=\"nofollow\">Dodgy</a> <a href=\"http://nice.com\" rel=\"nofollow\">Nice</a></p>\n<blockquote>");
    }

    @Test
    public void test147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test147");
        org.jsoup.nodes.SerializedObjectSupporter serializedObjectSupporter0 = new org.jsoup.nodes.SerializedObjectSupporter();
        java.lang.String str1 = serializedObjectSupporter0.deserializeObjectString93();
        java.lang.StringBuilder stringBuilder2 = serializedObjectSupporter0.deserializeObjectStringBuilder36();
        org.jsoup.nodes.TextNode textNode3 = serializedObjectSupporter0.deserializeObjectTextNode102();
        java.lang.StringBuilder stringBuilder4 = serializedObjectSupporter0.deserializeObjectStringBuilder14();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "More" + "'", str1, "More");
        org.junit.Assert.assertNotNull(stringBuilder2);
        org.junit.Assert.assertEquals(stringBuilder2.toString(), "<div>\n <p><b>This</b> is <b>jsoup</b>.</p>\n</div>");
// flaky:         org.junit.Assert.assertNotNull(textNode3);
        org.junit.Assert.assertNotNull(stringBuilder4);
        org.junit.Assert.assertEquals(stringBuilder4.toString(), "<p>This <span>foo</span><a>is</a> <span>");
    }

    @Test
    public void test148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test148");
        org.jsoup.nodes.SerializedObjectSupporter serializedObjectSupporter0 = new org.jsoup.nodes.SerializedObjectSupporter();
        java.lang.String str1 = serializedObjectSupporter0.deserializeObjectString93();
        java.lang.StringBuilder stringBuilder2 = serializedObjectSupporter0.deserializeObjectStringBuilder36();
        org.jsoup.nodes.TextNode textNode3 = serializedObjectSupporter0.deserializeObjectTextNode137();
        java.lang.StringBuilder stringBuilder4 = serializedObjectSupporter0.deserializeObjectStringBuilder231();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Document document5 = serializedObjectSupporter0.deserializeObjectDocument23();
// flaky:             org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: org.jsoup.nodes.Document$OutputSettings cannot be cast to org.jsoup.nodes.Document");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "More" + "'", str1, "More");
        org.junit.Assert.assertNotNull(stringBuilder2);
        org.junit.Assert.assertEquals(stringBuilder2.toString(), "<div>\n <p><b>This</b> is <b>jsoup</b>.</p>\n</div>");
// flaky:         org.junit.Assert.assertNotNull(textNode3);
        org.junit.Assert.assertNotNull(stringBuilder4);
        org.junit.Assert.assertEquals(stringBuilder4.toString(), "<p><a rel=\"nofollow\">Dodgy</a> <a href=\"http://nice.com\" rel=\"nofollow\">");
    }

    @Test
    public void test149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test149");
        org.jsoup.nodes.SerializedObjectSupporter serializedObjectSupporter0 = new org.jsoup.nodes.SerializedObjectSupporter();
        java.lang.String str1 = serializedObjectSupporter0.deserializeObjectString93();
        org.jsoup.nodes.TextNode textNode2 = serializedObjectSupporter0.deserializeObjectTextNode214();
        java.lang.StringBuilder stringBuilder3 = serializedObjectSupporter0.deserializeObjectStringBuilder19();
        java.lang.StringBuilder stringBuilder4 = serializedObjectSupporter0.deserializeObjectStringBuilder235();
        org.jsoup.nodes.TextNode textNode5 = serializedObjectSupporter0.deserializeObjectTextNode22();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Document document6 = serializedObjectSupporter0.deserializeObjectDocument147();
// flaky:             org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: org.jsoup.nodes.Document$OutputSettings cannot be cast to org.jsoup.nodes.Document");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "More" + "'", str1, "More");
// flaky:         org.junit.Assert.assertNotNull(textNode2);
        org.junit.Assert.assertNotNull(stringBuilder3);
        org.junit.Assert.assertEquals(stringBuilder3.toString(), "<p>This <a>is</a><span>");
        org.junit.Assert.assertNotNull(stringBuilder4);
        org.junit.Assert.assertEquals(stringBuilder4.toString(), "<a href=\"http://example.com/foo\" rel=\"nofollow\">");
// flaky:         org.junit.Assert.assertNotNull(textNode5);
    }

    @Test
    public void test150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test150");
        org.jsoup.nodes.SerializedObjectSupporter serializedObjectSupporter0 = new org.jsoup.nodes.SerializedObjectSupporter();
        java.lang.String str1 = serializedObjectSupporter0.deserializeObjectString93();
        java.lang.StringBuilder stringBuilder2 = serializedObjectSupporter0.deserializeObjectStringBuilder36();
        org.jsoup.nodes.TextNode textNode3 = serializedObjectSupporter0.deserializeObjectTextNode137();
        org.jsoup.nodes.TextNode textNode4 = serializedObjectSupporter0.deserializeObjectTextNode289();
        java.lang.StringBuilder stringBuilder5 = serializedObjectSupporter0.deserializeObjectStringBuilder86();
        java.lang.StringBuilder stringBuilder6 = serializedObjectSupporter0.deserializeObjectStringBuilder149();
        org.jsoup.nodes.TextNode textNode7 = serializedObjectSupporter0.deserializeObjectTextNode242();
        org.jsoup.nodes.TextNode textNode8 = serializedObjectSupporter0.deserializeObjectTextNode352();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "More" + "'", str1, "More");
        org.junit.Assert.assertNotNull(stringBuilder2);
        org.junit.Assert.assertEquals(stringBuilder2.toString(), "<div>\n <p><b>This</b> is <b>jsoup</b>.</p>\n</div>");
// flaky:         org.junit.Assert.assertNotNull(textNode3);
// flaky:         org.junit.Assert.assertNotNull(textNode4);
        org.junit.Assert.assertNotNull(stringBuilder5);
        org.junit.Assert.assertEquals(stringBuilder5.toString(), "<div>\n <div>\n  one\n </div>\n <div>\n  two\n </div>\n <p>Hello</p>\n <p>Three</p>\n <!-- four -->\n <p>");
        org.junit.Assert.assertNotNull(stringBuilder6);
        org.junit.Assert.assertEquals(stringBuilder6.toString(), "<div id=\"1\">\n Text \n <p>One</p> Text \n <p>Two</p>\n</div>\n<div id=\"2\">\n <p>");
// flaky:         org.junit.Assert.assertNotNull(textNode7);
// flaky:         org.junit.Assert.assertNotNull(textNode8);
    }

    @Test
    public void test151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test151");
        org.jsoup.nodes.SerializedObjectSupporter serializedObjectSupporter0 = new org.jsoup.nodes.SerializedObjectSupporter();
        java.lang.String str1 = serializedObjectSupporter0.deserializeObjectString93();
        org.jsoup.nodes.TextNode textNode2 = serializedObjectSupporter0.deserializeObjectTextNode214();
        java.lang.StringBuilder stringBuilder3 = serializedObjectSupporter0.deserializeObjectStringBuilder143();
        java.lang.StringBuilder stringBuilder4 = serializedObjectSupporter0.deserializeObjectStringBuilder261();
        org.jsoup.nodes.TextNode textNode5 = serializedObjectSupporter0.deserializeObjectTextNode255();
        org.jsoup.nodes.TextNode textNode6 = serializedObjectSupporter0.deserializeObjectTextNode421();
        org.jsoup.nodes.TextNode textNode7 = serializedObjectSupporter0.deserializeObjectTextNode251();
        java.lang.String str8 = serializedObjectSupporter0.deserializeObjectString75();
        org.jsoup.nodes.TextNode textNode9 = serializedObjectSupporter0.deserializeObjectTextNode39();
        java.lang.StringBuilder stringBuilder10 = serializedObjectSupporter0.deserializeObjectStringBuilder133();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "More" + "'", str1, "More");
// flaky:         org.junit.Assert.assertNotNull(textNode2);
        org.junit.Assert.assertNotNull(stringBuilder3);
        org.junit.Assert.assertEquals(stringBuilder3.toString(), "<div id=\"1\"></div>\n<div id=\"2\">\n Text \n <p>One</p>");
        org.junit.Assert.assertNotNull(stringBuilder4);
        org.junit.Assert.assertEquals(stringBuilder4.toString(), "<doc>\n <val>");
// flaky:         org.junit.Assert.assertNotNull(textNode5);
// flaky:         org.junit.Assert.assertNotNull(textNode6);
// flaky:         org.junit.Assert.assertNotNull(textNode7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Nice" + "'", str8, "Nice");
// flaky:         org.junit.Assert.assertNotNull(textNode9);
        org.junit.Assert.assertNotNull(stringBuilder10);
        org.junit.Assert.assertEquals(stringBuilder10.toString(), "<html>\n<head>\n<title>Check</title> \n</head>\n<body>\n<div>");
    }

    @Test
    public void test152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test152");
        org.jsoup.nodes.SerializedObjectSupporter serializedObjectSupporter0 = new org.jsoup.nodes.SerializedObjectSupporter();
        org.jsoup.nodes.TextNode textNode1 = serializedObjectSupporter0.deserializeObjectTextNode401();
        java.lang.StringBuilder stringBuilder2 = serializedObjectSupporter0.deserializeObjectStringBuilder60();
        java.lang.StringBuilder stringBuilder3 = serializedObjectSupporter0.deserializeObjectStringBuilder114();
        java.lang.StringBuilder stringBuilder4 = serializedObjectSupporter0.deserializeObjectStringBuilder238();
        org.jsoup.nodes.TextNode textNode5 = serializedObjectSupporter0.deserializeObjectTextNode290();
        org.jsoup.nodes.TextNode textNode6 = serializedObjectSupporter0.deserializeObjectTextNode339();
        org.jsoup.nodes.TextNode textNode7 = serializedObjectSupporter0.deserializeObjectTextNode27();
// flaky:         org.junit.Assert.assertNotNull(textNode1);
        org.junit.Assert.assertNotNull(stringBuilder2);
        org.junit.Assert.assertEquals(stringBuilder2.toString(), "<html>\n <head>\n  <script>one</script>\n  <noscript></noscript>\n </head>\n <body>\n  <p>");
        org.junit.Assert.assertNotNull(stringBuilder3);
        org.junit.Assert.assertEquals(stringBuilder3.toString(), "\nthere &amp; now &gt; \n<p>");
        org.junit.Assert.assertNotNull(stringBuilder4);
        org.junit.Assert.assertEquals(stringBuilder4.toString(), "<img src=\"cid:12345\" />");
// flaky:         org.junit.Assert.assertNotNull(textNode5);
// flaky:         org.junit.Assert.assertNotNull(textNode6);
// flaky:         org.junit.Assert.assertNotNull(textNode7);
    }

    @Test
    public void test153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test153");
        org.jsoup.nodes.SerializedObjectSupporter serializedObjectSupporter0 = new org.jsoup.nodes.SerializedObjectSupporter();
        java.lang.String str1 = serializedObjectSupporter0.deserializeObjectString93();
        org.jsoup.nodes.TextNode textNode2 = serializedObjectSupporter0.deserializeObjectTextNode214();
        java.lang.StringBuilder stringBuilder3 = serializedObjectSupporter0.deserializeObjectStringBuilder143();
        java.lang.StringBuilder stringBuilder4 = serializedObjectSupporter0.deserializeObjectStringBuilder261();
        org.jsoup.nodes.TextNode textNode5 = serializedObjectSupporter0.deserializeObjectTextNode255();
        org.jsoup.nodes.TextNode textNode7 = null; // flaky: textNode5.text("< > & \" ' \327");
        boolean boolean9 = false; // flaky: textNode5.hasAttr("");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "More" + "'", str1, "More");
// flaky:         org.junit.Assert.assertNotNull(textNode2);
        org.junit.Assert.assertNotNull(stringBuilder3);
        org.junit.Assert.assertEquals(stringBuilder3.toString(), "<div id=\"1\"></div>\n<div id=\"2\">\n Text \n <p>One</p>");
        org.junit.Assert.assertNotNull(stringBuilder4);
        org.junit.Assert.assertEquals(stringBuilder4.toString(), "<doc>\n <val>");
// flaky:         org.junit.Assert.assertNotNull(textNode5);
// flaky:         org.junit.Assert.assertNotNull(textNode7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test154");
        org.jsoup.nodes.SerializedObjectSupporter serializedObjectSupporter0 = new org.jsoup.nodes.SerializedObjectSupporter();
        java.lang.String str1 = serializedObjectSupporter0.deserializeObjectString93();
        java.lang.StringBuilder stringBuilder2 = serializedObjectSupporter0.deserializeObjectStringBuilder215();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString128();
        org.jsoup.nodes.TextNode textNode4 = serializedObjectSupporter0.deserializeObjectTextNode186();
        java.lang.StringBuilder stringBuilder5 = serializedObjectSupporter0.deserializeObjectStringBuilder239();
        java.lang.String str6 = serializedObjectSupporter0.deserializeObjectString69();
        org.jsoup.nodes.TextNode textNode7 = serializedObjectSupporter0.deserializeObjectTextNode360();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "More" + "'", str1, "More");
        org.junit.Assert.assertNotNull(stringBuilder2);
        org.junit.Assert.assertEquals(stringBuilder2.toString(), "<div id=\"1\">");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + " 12.3% " + "'", str3, " 12.3% ");
// flaky:         org.junit.Assert.assertNotNull(textNode4);
        org.junit.Assert.assertNotNull(stringBuilder5);
        org.junit.Assert.assertEquals(stringBuilder5.toString(), "<p class=\"foo\"><a class=\"qux\">");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Text 1 " + "'", str6, "Text 1 ");
// flaky:         org.junit.Assert.assertNotNull(textNode7);
    }

    @Test
    public void test155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test155");
        org.jsoup.nodes.SerializedObjectSupporter serializedObjectSupporter0 = new org.jsoup.nodes.SerializedObjectSupporter();
        java.lang.String str1 = serializedObjectSupporter0.deserializeObjectString93();
        org.jsoup.nodes.TextNode textNode2 = serializedObjectSupporter0.deserializeObjectTextNode214();
        java.lang.StringBuilder stringBuilder3 = serializedObjectSupporter0.deserializeObjectStringBuilder143();
        java.lang.StringBuilder stringBuilder4 = serializedObjectSupporter0.deserializeObjectStringBuilder261();
        java.lang.StringBuilder stringBuilder5 = serializedObjectSupporter0.deserializeObjectStringBuilder423();
        java.lang.String str6 = serializedObjectSupporter0.deserializeObjectString40();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "More" + "'", str1, "More");
// flaky:         org.junit.Assert.assertNotNull(textNode2);
        org.junit.Assert.assertNotNull(stringBuilder3);
        org.junit.Assert.assertEquals(stringBuilder3.toString(), "<div id=\"1\"></div>\n<div id=\"2\">\n Text \n <p>One</p>");
        org.junit.Assert.assertNotNull(stringBuilder4);
        org.junit.Assert.assertEquals(stringBuilder4.toString(), "<doc>\n <val>");
        org.junit.Assert.assertNotNull(stringBuilder5);
        org.junit.Assert.assertEquals(stringBuilder5.toString(), "<p><b>One</b></p>\n<b> \n <table>\n  <tbody>\n   <tr>\n    <td><p><i>Three</i></p><p><i>Four</i></p></td>\n   </tr>\n  </tbody>\n </table> <p>");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "one" + "'", str6, "one");
    }

    @Test
    public void test156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test156");
        org.jsoup.nodes.SerializedObjectSupporter serializedObjectSupporter0 = new org.jsoup.nodes.SerializedObjectSupporter();
        java.lang.String str1 = serializedObjectSupporter0.deserializeObjectString93();
        java.lang.StringBuilder stringBuilder2 = serializedObjectSupporter0.deserializeObjectStringBuilder215();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString128();
        java.lang.StringBuilder stringBuilder4 = serializedObjectSupporter0.deserializeObjectStringBuilder419();
        java.lang.String str5 = serializedObjectSupporter0.deserializeObjectString34();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Document document6 = serializedObjectSupporter0.deserializeObjectDocument203();
// flaky:             org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: org.jsoup.nodes.Document$OutputSettings cannot be cast to org.jsoup.nodes.Document");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "More" + "'", str1, "More");
        org.junit.Assert.assertNotNull(stringBuilder2);
        org.junit.Assert.assertEquals(stringBuilder2.toString(), "<div id=\"1\">");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + " 12.3% " + "'", str3, " 12.3% ");
        org.junit.Assert.assertNotNull(stringBuilder4);
        org.junit.Assert.assertEquals(stringBuilder4.toString(), "<p><b>One</b></p>\n<b>");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "< > & \" ' \327" + "'", str5, "< > & \" ' \327");
    }

    @Test
    public void test157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test157");
        org.jsoup.nodes.SerializedObjectSupporter serializedObjectSupporter0 = new org.jsoup.nodes.SerializedObjectSupporter();
        java.lang.String str1 = serializedObjectSupporter0.deserializeObjectString93();
        java.lang.StringBuilder stringBuilder2 = serializedObjectSupporter0.deserializeObjectStringBuilder215();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString128();
        java.lang.StringBuilder stringBuilder4 = serializedObjectSupporter0.deserializeObjectStringBuilder419();
        java.lang.String str5 = serializedObjectSupporter0.deserializeObjectString34();
        java.lang.StringBuilder stringBuilder6 = serializedObjectSupporter0.deserializeObjectStringBuilder155();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Document document7 = serializedObjectSupporter0.deserializeObjectDocument279();
// flaky:             org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: org.jsoup.nodes.Document$OutputSettings cannot be cast to org.jsoup.nodes.Document");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "More" + "'", str1, "More");
        org.junit.Assert.assertNotNull(stringBuilder2);
        org.junit.Assert.assertEquals(stringBuilder2.toString(), "<div id=\"1\">");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + " 12.3% " + "'", str3, " 12.3% ");
        org.junit.Assert.assertNotNull(stringBuilder4);
        org.junit.Assert.assertEquals(stringBuilder4.toString(), "<p><b>One</b></p>\n<b>");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "< > & \" ' \327" + "'", str5, "< > & \" ' \327");
        org.junit.Assert.assertNotNull(stringBuilder6);
        org.junit.Assert.assertEquals(stringBuilder6.toString(), "<html>\n <head>\n  <title>");
    }

    @Test
    public void test158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test158");
        org.jsoup.nodes.SerializedObjectSupporter serializedObjectSupporter0 = new org.jsoup.nodes.SerializedObjectSupporter();
        org.jsoup.nodes.TextNode textNode1 = serializedObjectSupporter0.deserializeObjectTextNode401();
        java.lang.StringBuilder stringBuilder2 = serializedObjectSupporter0.deserializeObjectStringBuilder60();
        java.lang.StringBuilder stringBuilder3 = serializedObjectSupporter0.deserializeObjectStringBuilder114();
        java.lang.StringBuilder stringBuilder4 = serializedObjectSupporter0.deserializeObjectStringBuilder238();
        org.jsoup.nodes.TextNode textNode5 = serializedObjectSupporter0.deserializeObjectTextNode290();
        org.jsoup.nodes.TextNode textNode6 = serializedObjectSupporter0.deserializeObjectTextNode339();
        java.lang.StringBuilder stringBuilder7 = serializedObjectSupporter0.deserializeObjectStringBuilder340();
// flaky:         org.junit.Assert.assertNotNull(textNode1);
        org.junit.Assert.assertNotNull(stringBuilder2);
        org.junit.Assert.assertEquals(stringBuilder2.toString(), "<html>\n <head>\n  <script>one</script>\n  <noscript></noscript>\n </head>\n <body>\n  <p>");
        org.junit.Assert.assertNotNull(stringBuilder3);
        org.junit.Assert.assertEquals(stringBuilder3.toString(), "\nthere &amp; now &gt; \n<p>");
        org.junit.Assert.assertNotNull(stringBuilder4);
        org.junit.Assert.assertEquals(stringBuilder4.toString(), "<img src=\"cid:12345\" />");
// flaky:         org.junit.Assert.assertNotNull(textNode5);
// flaky:         org.junit.Assert.assertNotNull(textNode6);
        org.junit.Assert.assertNotNull(stringBuilder7);
        org.junit.Assert.assertEquals(stringBuilder7.toString(), "<textarea>");
    }

    @Test
    public void test159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test159");
        org.jsoup.nodes.SerializedObjectSupporter serializedObjectSupporter0 = new org.jsoup.nodes.SerializedObjectSupporter();
        java.lang.String str1 = serializedObjectSupporter0.deserializeObjectString93();
        java.lang.StringBuilder stringBuilder2 = serializedObjectSupporter0.deserializeObjectStringBuilder36();
        org.jsoup.nodes.TextNode textNode3 = serializedObjectSupporter0.deserializeObjectTextNode137();
        org.jsoup.nodes.TextNode textNode4 = serializedObjectSupporter0.deserializeObjectTextNode289();
        java.lang.StringBuilder stringBuilder5 = serializedObjectSupporter0.deserializeObjectStringBuilder86();
        java.lang.StringBuilder stringBuilder6 = serializedObjectSupporter0.deserializeObjectStringBuilder149();
        org.jsoup.nodes.TextNode textNode7 = serializedObjectSupporter0.deserializeObjectTextNode242();
        java.lang.StringBuilder stringBuilder8 = serializedObjectSupporter0.deserializeObjectStringBuilder169();
        java.lang.StringBuilder stringBuilder9 = serializedObjectSupporter0.deserializeObjectStringBuilder381();
        java.lang.StringBuilder stringBuilder10 = serializedObjectSupporter0.deserializeObjectStringBuilder67();
        java.lang.StringBuilder stringBuilder11 = serializedObjectSupporter0.deserializeObjectStringBuilder216();
        org.jsoup.nodes.TextNode textNode12 = serializedObjectSupporter0.deserializeObjectTextNode217();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "More" + "'", str1, "More");
        org.junit.Assert.assertNotNull(stringBuilder2);
        org.junit.Assert.assertEquals(stringBuilder2.toString(), "<div>\n <p><b>This</b> is <b>jsoup</b>.</p>\n</div>");
// flaky:         org.junit.Assert.assertNotNull(textNode3);
// flaky:         org.junit.Assert.assertNotNull(textNode4);
        org.junit.Assert.assertNotNull(stringBuilder5);
        org.junit.Assert.assertEquals(stringBuilder5.toString(), "<div>\n <div>\n  one\n </div>\n <div>\n  two\n </div>\n <p>Hello</p>\n <p>Three</p>\n <!-- four -->\n <p>");
        org.junit.Assert.assertNotNull(stringBuilder6);
        org.junit.Assert.assertEquals(stringBuilder6.toString(), "<div id=\"1\">\n Text \n <p>One</p> Text \n <p>Two</p>\n</div>\n<div id=\"2\">\n <p>");
// flaky:         org.junit.Assert.assertNotNull(textNode7);
        org.junit.Assert.assertNotNull(stringBuilder8);
        org.junit.Assert.assertEquals(stringBuilder8.toString(), "<title>");
        org.junit.Assert.assertNotNull(stringBuilder9);
        org.junit.Assert.assertEquals(stringBuilder9.toString(), "<table> \n <colgroup> \n  <col />");
        org.junit.Assert.assertNotNull(stringBuilder10);
        org.junit.Assert.assertEquals(stringBuilder10.toString(), "<html>\n <head>\n  <title>Hello</title>");
        org.junit.Assert.assertNotNull(stringBuilder11);
        org.junit.Assert.assertEquals(stringBuilder11.toString(), "<div id=\"1\">\n Text 1 \n <p>");
// flaky:         org.junit.Assert.assertNotNull(textNode12);
    }

    @Test
    public void test160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test160");
        org.jsoup.nodes.SerializedObjectSupporter serializedObjectSupporter0 = new org.jsoup.nodes.SerializedObjectSupporter();
        org.jsoup.nodes.TextNode textNode1 = serializedObjectSupporter0.deserializeObjectTextNode401();
        java.lang.StringBuilder stringBuilder2 = serializedObjectSupporter0.deserializeObjectStringBuilder60();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Document document3 = serializedObjectSupporter0.deserializeObjectDocument164();
// flaky:             org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: org.jsoup.nodes.Document$OutputSettings cannot be cast to org.jsoup.nodes.Document");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
// flaky:         org.junit.Assert.assertNotNull(textNode1);
        org.junit.Assert.assertNotNull(stringBuilder2);
        org.junit.Assert.assertEquals(stringBuilder2.toString(), "<html>\n <head>\n  <script>one</script>\n  <noscript></noscript>\n </head>\n <body>\n  <p>");
    }

    @Test
    public void test161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test161");
        org.jsoup.nodes.Document.OutputSettings outputSettings0 = new org.jsoup.nodes.Document.OutputSettings();
        java.nio.charset.CharsetEncoder charsetEncoder1 = null;
        outputSettings0.setcharsetEncoder(charsetEncoder1);
        java.nio.charset.CharsetEncoder charsetEncoder3 = outputSettings0.charsetEncoder;
        outputSettings0.setforceAllElementAsBlock(false);
        org.junit.Assert.assertNull(charsetEncoder3);
    }

    @Test
    public void test162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test162");
        org.jsoup.nodes.SerializedObjectSupporter serializedObjectSupporter0 = new org.jsoup.nodes.SerializedObjectSupporter();
        java.lang.String str1 = serializedObjectSupporter0.deserializeObjectString93();
        java.lang.StringBuilder stringBuilder2 = serializedObjectSupporter0.deserializeObjectStringBuilder215();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString128();
        java.lang.StringBuilder stringBuilder4 = serializedObjectSupporter0.deserializeObjectStringBuilder419();
        java.lang.String str5 = serializedObjectSupporter0.deserializeObjectString34();
        org.jsoup.nodes.TextNode textNode6 = serializedObjectSupporter0.deserializeObjectTextNode185();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Document document7 = serializedObjectSupporter0.deserializeObjectDocument162();
// flaky:             org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: org.jsoup.nodes.Document$OutputSettings cannot be cast to org.jsoup.nodes.Document");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "More" + "'", str1, "More");
        org.junit.Assert.assertNotNull(stringBuilder2);
        org.junit.Assert.assertEquals(stringBuilder2.toString(), "<div id=\"1\">");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + " 12.3% " + "'", str3, " 12.3% ");
        org.junit.Assert.assertNotNull(stringBuilder4);
        org.junit.Assert.assertEquals(stringBuilder4.toString(), "<p><b>One</b></p>\n<b>");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "< > & \" ' \327" + "'", str5, "< > & \" ' \327");
// flaky:         org.junit.Assert.assertNotNull(textNode6);
    }

    @Test
    public void test163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test163");
        org.jsoup.nodes.SerializedObjectSupporter serializedObjectSupporter0 = new org.jsoup.nodes.SerializedObjectSupporter();
        java.lang.String str1 = serializedObjectSupporter0.deserializeObjectString93();
        java.lang.StringBuilder stringBuilder2 = serializedObjectSupporter0.deserializeObjectStringBuilder36();
        java.lang.StringBuilder stringBuilder3 = serializedObjectSupporter0.deserializeObjectStringBuilder399();
        org.jsoup.nodes.TextNode textNode4 = serializedObjectSupporter0.deserializeObjectTextNode54();
        org.jsoup.nodes.TextNode textNode5 = serializedObjectSupporter0.deserializeObjectTextNode163();
        java.lang.StringBuilder stringBuilder6 = serializedObjectSupporter0.deserializeObjectStringBuilder136();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "More" + "'", str1, "More");
        org.junit.Assert.assertNotNull(stringBuilder2);
        org.junit.Assert.assertEquals(stringBuilder2.toString(), "<div>\n <p><b>This</b> is <b>jsoup</b>.</p>\n</div>");
        org.junit.Assert.assertNotNull(stringBuilder3);
        org.junit.Assert.assertEquals(stringBuilder3.toString(), "<table> \n <colgroup> \n  <col /> \n </colgroup>\n <colgroup> \n  <col /> \n  <col /> \n  <col /> \n </colgroup>\n <thead> \n  <tr> \n   <th> </th>\n   <th>2008 </th>\n   <th>2007 </th>\n   <th>2006 </th>\n  </tr>\n </thead>\n <tbody> \n  <tr> \n   <th scope=\"rowgroup\"> Research and development </th>\n   <td> $ 1,109 </td>\n   <td> $ 782 </td>\n   <td> $ 712 </td>\n  </tr>\n  <tr> \n   <th scope=\"row\">");
// flaky:         org.junit.Assert.assertNotNull(textNode4);
// flaky:         org.junit.Assert.assertNotNull(textNode5);
        org.junit.Assert.assertNotNull(stringBuilder6);
        org.junit.Assert.assertEquals(stringBuilder6.toString(), "<html>\n<head>\n<title>Check</title>");
    }

    @Test
    public void test164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test164");
        org.jsoup.nodes.SerializedObjectSupporter serializedObjectSupporter0 = new org.jsoup.nodes.SerializedObjectSupporter();
        java.lang.String str1 = serializedObjectSupporter0.deserializeObjectString93();
        java.lang.StringBuilder stringBuilder2 = serializedObjectSupporter0.deserializeObjectStringBuilder267();
        java.lang.StringBuilder stringBuilder3 = serializedObjectSupporter0.deserializeObjectStringBuilder14();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "More" + "'", str1, "More");
        org.junit.Assert.assertNotNull(stringBuilder2);
        org.junit.Assert.assertEquals(stringBuilder2.toString(), "<doc>\n <val>");
        org.junit.Assert.assertNotNull(stringBuilder3);
        org.junit.Assert.assertEquals(stringBuilder3.toString(), "<p>This <span>foo</span><a>is</a> <span>");
    }

    @Test
    public void test165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test165");
        org.jsoup.nodes.SerializedObjectSupporter serializedObjectSupporter0 = new org.jsoup.nodes.SerializedObjectSupporter();
        java.lang.String str1 = serializedObjectSupporter0.deserializeObjectString93();
        org.jsoup.nodes.TextNode textNode2 = serializedObjectSupporter0.deserializeObjectTextNode214();
        org.jsoup.nodes.TextNode textNode3 = serializedObjectSupporter0.deserializeObjectTextNode79();
        org.jsoup.nodes.TextNode textNode4 = serializedObjectSupporter0.deserializeObjectTextNode169();
        org.jsoup.nodes.Node node7 = null; // flaky: textNode4.attr("Two", "is");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "More" + "'", str1, "More");
// flaky:         org.junit.Assert.assertNotNull(textNode2);
// flaky:         org.junit.Assert.assertNotNull(textNode3);
// flaky:         org.junit.Assert.assertNotNull(textNode4);
// flaky:         org.junit.Assert.assertNotNull(node7);
    }

    @Test
    public void test166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test166");
        org.jsoup.nodes.SerializedObjectSupporter serializedObjectSupporter0 = new org.jsoup.nodes.SerializedObjectSupporter();
        java.lang.String str1 = serializedObjectSupporter0.deserializeObjectString93();
        java.lang.StringBuilder stringBuilder2 = serializedObjectSupporter0.deserializeObjectStringBuilder215();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString128();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Document document4 = serializedObjectSupporter0.deserializeObjectDocument359();
// flaky:             org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: org.jsoup.nodes.Document$OutputSettings cannot be cast to org.jsoup.nodes.Document");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "More" + "'", str1, "More");
        org.junit.Assert.assertNotNull(stringBuilder2);
        org.junit.Assert.assertEquals(stringBuilder2.toString(), "<div id=\"1\">");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + " 12.3% " + "'", str3, " 12.3% ");
    }

    @Test
    public void test167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test167");
        org.jsoup.nodes.SerializedObjectSupporter serializedObjectSupporter0 = new org.jsoup.nodes.SerializedObjectSupporter();
        java.lang.String str1 = serializedObjectSupporter0.deserializeObjectString93();
        org.jsoup.nodes.TextNode textNode2 = serializedObjectSupporter0.deserializeObjectTextNode214();
        java.lang.StringBuilder stringBuilder3 = serializedObjectSupporter0.deserializeObjectStringBuilder143();
        java.lang.StringBuilder stringBuilder4 = serializedObjectSupporter0.deserializeObjectStringBuilder261();
        org.jsoup.nodes.TextNode textNode5 = serializedObjectSupporter0.deserializeObjectTextNode255();
        org.jsoup.nodes.TextNode textNode6 = serializedObjectSupporter0.deserializeObjectTextNode421();
        org.jsoup.nodes.TextNode textNode7 = serializedObjectSupporter0.deserializeObjectTextNode251();
        java.lang.String str8 = serializedObjectSupporter0.deserializeObjectString75();
        org.jsoup.nodes.TextNode textNode9 = serializedObjectSupporter0.deserializeObjectTextNode255();
        java.lang.StringBuilder stringBuilder10 = serializedObjectSupporter0.deserializeObjectStringBuilder123();
        org.jsoup.nodes.TextNode textNode11 = serializedObjectSupporter0.deserializeObjectTextNode367();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "More" + "'", str1, "More");
// flaky:         org.junit.Assert.assertNotNull(textNode2);
        org.junit.Assert.assertNotNull(stringBuilder3);
        org.junit.Assert.assertEquals(stringBuilder3.toString(), "<div id=\"1\"></div>\n<div id=\"2\">\n Text \n <p>One</p>");
        org.junit.Assert.assertNotNull(stringBuilder4);
        org.junit.Assert.assertEquals(stringBuilder4.toString(), "<doc>\n <val>");
// flaky:         org.junit.Assert.assertNotNull(textNode5);
// flaky:         org.junit.Assert.assertNotNull(textNode6);
// flaky:         org.junit.Assert.assertNotNull(textNode7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Nice" + "'", str8, "Nice");
// flaky:         org.junit.Assert.assertNotNull(textNode9);
        org.junit.Assert.assertNotNull(stringBuilder10);
        org.junit.Assert.assertEquals(stringBuilder10.toString(), "<div>\n <div class=\"head\">\n  <p>");
// flaky:         org.junit.Assert.assertNotNull(textNode11);
    }

    @Test
    public void test168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test168");
        org.jsoup.nodes.SerializedObjectSupporter serializedObjectSupporter0 = new org.jsoup.nodes.SerializedObjectSupporter();
        org.jsoup.nodes.TextNode textNode1 = serializedObjectSupporter0.deserializeObjectTextNode401();
        java.lang.StringBuilder stringBuilder2 = serializedObjectSupporter0.deserializeObjectStringBuilder163();
        org.jsoup.nodes.TextNode textNode3 = serializedObjectSupporter0.deserializeObjectTextNode135();
        org.jsoup.nodes.TextNode textNode4 = serializedObjectSupporter0.deserializeObjectTextNode32();
// flaky:         org.junit.Assert.assertNotNull(textNode1);
        org.junit.Assert.assertNotNull(stringBuilder2);
        org.junit.Assert.assertEquals(stringBuilder2.toString(), "<html>\n <head>\n  <title>Format test</title>\n </head>\n <body>\n  <div>\n   <p>\n    Hello \n    <span>\n     jsoup \n     <span>");
// flaky:         org.junit.Assert.assertNotNull(textNode3);
// flaky:         org.junit.Assert.assertNotNull(textNode4);
    }

    @Test
    public void test169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test169");
        org.jsoup.nodes.SerializedObjectSupporter serializedObjectSupporter0 = new org.jsoup.nodes.SerializedObjectSupporter();
        java.lang.String str1 = serializedObjectSupporter0.deserializeObjectString93();
        java.lang.StringBuilder stringBuilder2 = serializedObjectSupporter0.deserializeObjectStringBuilder215();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString128();
        java.lang.StringBuilder stringBuilder4 = serializedObjectSupporter0.deserializeObjectStringBuilder419();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Document document5 = serializedObjectSupporter0.deserializeObjectDocument112();
// flaky:             org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: org.jsoup.nodes.Document$OutputSettings cannot be cast to org.jsoup.nodes.Document");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "More" + "'", str1, "More");
        org.junit.Assert.assertNotNull(stringBuilder2);
        org.junit.Assert.assertEquals(stringBuilder2.toString(), "<div id=\"1\">");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + " 12.3% " + "'", str3, " 12.3% ");
        org.junit.Assert.assertNotNull(stringBuilder4);
        org.junit.Assert.assertEquals(stringBuilder4.toString(), "<p><b>One</b></p>\n<b>");
    }

    @Test
    public void test170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test170");
        org.jsoup.nodes.SerializedObjectSupporter serializedObjectSupporter0 = new org.jsoup.nodes.SerializedObjectSupporter();
        java.lang.String str1 = serializedObjectSupporter0.deserializeObjectString93();
        java.lang.StringBuilder stringBuilder2 = serializedObjectSupporter0.deserializeObjectStringBuilder36();
        java.lang.StringBuilder stringBuilder3 = serializedObjectSupporter0.deserializeObjectStringBuilder399();
        org.jsoup.nodes.TextNode textNode4 = serializedObjectSupporter0.deserializeObjectTextNode126();
        java.lang.StringBuilder stringBuilder5 = serializedObjectSupporter0.deserializeObjectStringBuilder341();
        org.jsoup.nodes.TextNode textNode6 = serializedObjectSupporter0.deserializeObjectTextNode277();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "More" + "'", str1, "More");
        org.junit.Assert.assertNotNull(stringBuilder2);
        org.junit.Assert.assertEquals(stringBuilder2.toString(), "<div>\n <p><b>This</b> is <b>jsoup</b>.</p>\n</div>");
        org.junit.Assert.assertNotNull(stringBuilder3);
        org.junit.Assert.assertEquals(stringBuilder3.toString(), "<table> \n <colgroup> \n  <col /> \n </colgroup>\n <colgroup> \n  <col /> \n  <col /> \n  <col /> \n </colgroup>\n <thead> \n  <tr> \n   <th> </th>\n   <th>2008 </th>\n   <th>2007 </th>\n   <th>2006 </th>\n  </tr>\n </thead>\n <tbody> \n  <tr> \n   <th scope=\"rowgroup\"> Research and development </th>\n   <td> $ 1,109 </td>\n   <td> $ 782 </td>\n   <td> $ 712 </td>\n  </tr>\n  <tr> \n   <th scope=\"row\">");
// flaky:         org.junit.Assert.assertNotNull(textNode4);
        org.junit.Assert.assertNotNull(stringBuilder5);
        org.junit.Assert.assertEquals(stringBuilder5.toString(), "");
// flaky:         org.junit.Assert.assertNotNull(textNode6);
    }

    @Test
    public void test171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test171");
        org.jsoup.nodes.SerializedObjectSupporter serializedObjectSupporter0 = new org.jsoup.nodes.SerializedObjectSupporter();
        org.jsoup.nodes.TextNode textNode1 = serializedObjectSupporter0.deserializeObjectTextNode401();
        org.jsoup.nodes.TextNode textNode2 = serializedObjectSupporter0.deserializeObjectTextNode376();
        org.jsoup.nodes.TextNode textNode3 = serializedObjectSupporter0.deserializeObjectTextNode145();
        org.jsoup.nodes.TextNode textNode4 = serializedObjectSupporter0.deserializeObjectTextNode411();
// flaky:         org.junit.Assert.assertNotNull(textNode1);
// flaky:         org.junit.Assert.assertNotNull(textNode2);
// flaky:         org.junit.Assert.assertNotNull(textNode3);
// flaky:         org.junit.Assert.assertNotNull(textNode4);
    }

    @Test
    public void test172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test172");
        org.jsoup.nodes.Document.OutputSettings outputSettings0 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Entities.EscapeMode escapeMode1 = null;
        outputSettings0.setescapeMode(escapeMode1);
        java.nio.charset.Charset charset3 = null;
        outputSettings0.setcharset(charset3);
        int int5 = outputSettings0.indentAmount;
        java.nio.charset.CharsetEncoder charsetEncoder6 = outputSettings0.getcharsetEncoder();
        org.jsoup.nodes.Entities.EscapeMode escapeMode7 = outputSettings0.escapeMode;
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertNotNull(charsetEncoder6);
        org.junit.Assert.assertNull(escapeMode7);
    }

    @Test
    public void test173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test173");
        org.jsoup.nodes.SerializedObjectSupporter serializedObjectSupporter0 = new org.jsoup.nodes.SerializedObjectSupporter();
        java.lang.String str1 = serializedObjectSupporter0.deserializeObjectString93();
        java.lang.StringBuilder stringBuilder2 = serializedObjectSupporter0.deserializeObjectStringBuilder36();
        org.jsoup.nodes.TextNode textNode3 = serializedObjectSupporter0.deserializeObjectTextNode137();
        org.jsoup.nodes.TextNode textNode4 = serializedObjectSupporter0.deserializeObjectTextNode289();
        java.lang.StringBuilder stringBuilder5 = serializedObjectSupporter0.deserializeObjectStringBuilder86();
        java.lang.StringBuilder stringBuilder6 = serializedObjectSupporter0.deserializeObjectStringBuilder149();
        org.jsoup.nodes.TextNode textNode7 = serializedObjectSupporter0.deserializeObjectTextNode242();
        java.lang.StringBuilder stringBuilder8 = serializedObjectSupporter0.deserializeObjectStringBuilder169();
        java.lang.StringBuilder stringBuilder9 = serializedObjectSupporter0.deserializeObjectStringBuilder381();
        java.lang.StringBuilder stringBuilder10 = serializedObjectSupporter0.deserializeObjectStringBuilder67();
        org.jsoup.nodes.TextNode textNode11 = serializedObjectSupporter0.deserializeObjectTextNode69();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "More" + "'", str1, "More");
        org.junit.Assert.assertNotNull(stringBuilder2);
        org.junit.Assert.assertEquals(stringBuilder2.toString(), "<div>\n <p><b>This</b> is <b>jsoup</b>.</p>\n</div>");
// flaky:         org.junit.Assert.assertNotNull(textNode3);
// flaky:         org.junit.Assert.assertNotNull(textNode4);
        org.junit.Assert.assertNotNull(stringBuilder5);
        org.junit.Assert.assertEquals(stringBuilder5.toString(), "<div>\n <div>\n  one\n </div>\n <div>\n  two\n </div>\n <p>Hello</p>\n <p>Three</p>\n <!-- four -->\n <p>");
        org.junit.Assert.assertNotNull(stringBuilder6);
        org.junit.Assert.assertEquals(stringBuilder6.toString(), "<div id=\"1\">\n Text \n <p>One</p> Text \n <p>Two</p>\n</div>\n<div id=\"2\">\n <p>");
// flaky:         org.junit.Assert.assertNotNull(textNode7);
        org.junit.Assert.assertNotNull(stringBuilder8);
        org.junit.Assert.assertEquals(stringBuilder8.toString(), "<title>");
        org.junit.Assert.assertNotNull(stringBuilder9);
        org.junit.Assert.assertEquals(stringBuilder9.toString(), "<table> \n <colgroup> \n  <col />");
        org.junit.Assert.assertNotNull(stringBuilder10);
        org.junit.Assert.assertEquals(stringBuilder10.toString(), "<html>\n <head>\n  <title>Hello</title>");
// flaky:         org.junit.Assert.assertNotNull(textNode11);
    }

    @Test
    public void test174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test174");
        org.jsoup.nodes.SerializedObjectSupporter serializedObjectSupporter0 = new org.jsoup.nodes.SerializedObjectSupporter();
        org.jsoup.nodes.TextNode textNode1 = serializedObjectSupporter0.deserializeObjectTextNode401();
        java.lang.StringBuilder stringBuilder2 = serializedObjectSupporter0.deserializeObjectStringBuilder60();
        java.lang.StringBuilder stringBuilder3 = serializedObjectSupporter0.deserializeObjectStringBuilder114();
        java.lang.StringBuilder stringBuilder4 = serializedObjectSupporter0.deserializeObjectStringBuilder238();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Document document5 = serializedObjectSupporter0.deserializeObjectDocument92();
// flaky:             org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: org.jsoup.nodes.Document$OutputSettings cannot be cast to org.jsoup.nodes.Document");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
// flaky:         org.junit.Assert.assertNotNull(textNode1);
        org.junit.Assert.assertNotNull(stringBuilder2);
        org.junit.Assert.assertEquals(stringBuilder2.toString(), "<html>\n <head>\n  <script>one</script>\n  <noscript></noscript>\n </head>\n <body>\n  <p>");
        org.junit.Assert.assertNotNull(stringBuilder3);
        org.junit.Assert.assertEquals(stringBuilder3.toString(), "\nthere &amp; now &gt; \n<p>");
        org.junit.Assert.assertNotNull(stringBuilder4);
        org.junit.Assert.assertEquals(stringBuilder4.toString(), "<img src=\"cid:12345\" />");
    }

    @Test
    public void test175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test175");
        org.jsoup.nodes.SerializedObjectSupporter serializedObjectSupporter0 = new org.jsoup.nodes.SerializedObjectSupporter();
        java.lang.String str1 = serializedObjectSupporter0.deserializeObjectString93();
        java.lang.StringBuilder stringBuilder2 = serializedObjectSupporter0.deserializeObjectStringBuilder215();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString128();
        java.lang.StringBuilder stringBuilder4 = serializedObjectSupporter0.deserializeObjectStringBuilder419();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Document document5 = serializedObjectSupporter0.deserializeObjectDocument316();
// flaky:             org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: org.jsoup.nodes.Document$OutputSettings cannot be cast to org.jsoup.nodes.Document");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "More" + "'", str1, "More");
        org.junit.Assert.assertNotNull(stringBuilder2);
        org.junit.Assert.assertEquals(stringBuilder2.toString(), "<div id=\"1\">");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + " 12.3% " + "'", str3, " 12.3% ");
        org.junit.Assert.assertNotNull(stringBuilder4);
        org.junit.Assert.assertEquals(stringBuilder4.toString(), "<p><b>One</b></p>\n<b>");
    }

    @Test
    public void test176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test176");
        org.jsoup.nodes.Document.OutputSettings outputSettings0 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Entities.EscapeMode escapeMode1 = null;
        outputSettings0.setescapeMode(escapeMode1);
        org.jsoup.nodes.Entities.EscapeMode escapeMode3 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings4 = outputSettings0.escapeMode(escapeMode3);
        org.jsoup.nodes.Entities.EscapeMode escapeMode5 = outputSettings0.escapeMode;
        org.jsoup.nodes.Document.OutputSettings outputSettings6 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Entities.EscapeMode escapeMode7 = null;
        outputSettings6.setescapeMode(escapeMode7);
        org.jsoup.nodes.Entities.EscapeMode escapeMode9 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings10 = outputSettings6.escapeMode(escapeMode9);
        org.jsoup.nodes.Entities.EscapeMode escapeMode11 = outputSettings6.escapeMode;
        java.nio.charset.Charset charset12 = outputSettings6.getcharset();
        outputSettings0.setcharset(charset12);
        org.junit.Assert.assertNotNull(outputSettings4);
        org.junit.Assert.assertNull(escapeMode5);
        org.junit.Assert.assertNotNull(outputSettings10);
        org.junit.Assert.assertNull(escapeMode11);
        org.junit.Assert.assertNotNull(charset12);
    }

    @Test
    public void test177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test177");
        org.jsoup.nodes.SerializedObjectSupporter serializedObjectSupporter0 = new org.jsoup.nodes.SerializedObjectSupporter();
        java.lang.String str1 = serializedObjectSupporter0.deserializeObjectString93();
        org.jsoup.nodes.TextNode textNode2 = serializedObjectSupporter0.deserializeObjectTextNode214();
        java.lang.StringBuilder stringBuilder3 = serializedObjectSupporter0.deserializeObjectStringBuilder143();
        java.lang.StringBuilder stringBuilder4 = serializedObjectSupporter0.deserializeObjectStringBuilder261();
        org.jsoup.nodes.TextNode textNode5 = serializedObjectSupporter0.deserializeObjectTextNode255();
        org.jsoup.nodes.TextNode textNode6 = serializedObjectSupporter0.deserializeObjectTextNode421();
        org.jsoup.nodes.TextNode textNode7 = serializedObjectSupporter0.deserializeObjectTextNode251();
        java.lang.String str8 = serializedObjectSupporter0.deserializeObjectString75();
        org.jsoup.nodes.TextNode textNode9 = serializedObjectSupporter0.deserializeObjectTextNode255();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Document document10 = serializedObjectSupporter0.deserializeObjectDocument21();
// flaky:             org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: org.jsoup.nodes.Document$OutputSettings cannot be cast to org.jsoup.nodes.Document");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "More" + "'", str1, "More");
// flaky:         org.junit.Assert.assertNotNull(textNode2);
        org.junit.Assert.assertNotNull(stringBuilder3);
        org.junit.Assert.assertEquals(stringBuilder3.toString(), "<div id=\"1\"></div>\n<div id=\"2\">\n Text \n <p>One</p>");
        org.junit.Assert.assertNotNull(stringBuilder4);
        org.junit.Assert.assertEquals(stringBuilder4.toString(), "<doc>\n <val>");
// flaky:         org.junit.Assert.assertNotNull(textNode5);
// flaky:         org.junit.Assert.assertNotNull(textNode6);
// flaky:         org.junit.Assert.assertNotNull(textNode7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Nice" + "'", str8, "Nice");
// flaky:         org.junit.Assert.assertNotNull(textNode9);
    }

    @Test
    public void test178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test178");
        org.jsoup.nodes.SerializedObjectSupporter serializedObjectSupporter0 = new org.jsoup.nodes.SerializedObjectSupporter();
        org.jsoup.nodes.TextNode textNode1 = serializedObjectSupporter0.deserializeObjectTextNode401();
        org.jsoup.nodes.TextNode textNode2 = serializedObjectSupporter0.deserializeObjectTextNode376();
        org.jsoup.nodes.TextNode textNode3 = serializedObjectSupporter0.deserializeObjectTextNode145();
        java.lang.StringBuilder stringBuilder4 = serializedObjectSupporter0.deserializeObjectStringBuilder373();
        org.jsoup.nodes.TextNode textNode5 = serializedObjectSupporter0.deserializeObjectTextNode344();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Document document6 = serializedObjectSupporter0.deserializeObjectDocument27();
// flaky:             org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: org.jsoup.nodes.Document$OutputSettings cannot be cast to org.jsoup.nodes.Document");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
// flaky:         org.junit.Assert.assertNotNull(textNode1);
// flaky:         org.junit.Assert.assertNotNull(textNode2);
// flaky:         org.junit.Assert.assertNotNull(textNode3);
        org.junit.Assert.assertNotNull(stringBuilder4);
        org.junit.Assert.assertEquals(stringBuilder4.toString(), "");
// flaky:         org.junit.Assert.assertNotNull(textNode5);
    }

    @Test
    public void test179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test179");
        org.jsoup.nodes.SerializedObjectSupporter serializedObjectSupporter0 = new org.jsoup.nodes.SerializedObjectSupporter();
        java.lang.String str1 = serializedObjectSupporter0.deserializeObjectString93();
        org.jsoup.nodes.TextNode textNode2 = serializedObjectSupporter0.deserializeObjectTextNode214();
        java.lang.StringBuilder stringBuilder3 = serializedObjectSupporter0.deserializeObjectStringBuilder143();
        java.lang.StringBuilder stringBuilder4 = serializedObjectSupporter0.deserializeObjectStringBuilder261();
        org.jsoup.nodes.TextNode textNode5 = serializedObjectSupporter0.deserializeObjectTextNode255();
        org.jsoup.nodes.TextNode textNode6 = serializedObjectSupporter0.deserializeObjectTextNode421();
        org.jsoup.nodes.TextNode textNode7 = serializedObjectSupporter0.deserializeObjectTextNode251();
        java.lang.String str8 = serializedObjectSupporter0.deserializeObjectString75();
        org.jsoup.nodes.TextNode textNode9 = serializedObjectSupporter0.deserializeObjectTextNode255();
        java.lang.StringBuilder stringBuilder10 = serializedObjectSupporter0.deserializeObjectStringBuilder123();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Document document11 = serializedObjectSupporter0.deserializeObjectDocument232();
// flaky:             org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: org.jsoup.nodes.Document$OutputSettings cannot be cast to org.jsoup.nodes.Document");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "More" + "'", str1, "More");
// flaky:         org.junit.Assert.assertNotNull(textNode2);
        org.junit.Assert.assertNotNull(stringBuilder3);
        org.junit.Assert.assertEquals(stringBuilder3.toString(), "<div id=\"1\"></div>\n<div id=\"2\">\n Text \n <p>One</p>");
        org.junit.Assert.assertNotNull(stringBuilder4);
        org.junit.Assert.assertEquals(stringBuilder4.toString(), "<doc>\n <val>");
// flaky:         org.junit.Assert.assertNotNull(textNode5);
// flaky:         org.junit.Assert.assertNotNull(textNode6);
// flaky:         org.junit.Assert.assertNotNull(textNode7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Nice" + "'", str8, "Nice");
// flaky:         org.junit.Assert.assertNotNull(textNode9);
        org.junit.Assert.assertNotNull(stringBuilder10);
        org.junit.Assert.assertEquals(stringBuilder10.toString(), "<div>\n <div class=\"head\">\n  <p>");
    }

    @Test
    public void test180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test180");
        org.jsoup.nodes.SerializedObjectSupporter serializedObjectSupporter0 = new org.jsoup.nodes.SerializedObjectSupporter();
        java.lang.String str1 = serializedObjectSupporter0.deserializeObjectString93();
        java.lang.StringBuilder stringBuilder2 = serializedObjectSupporter0.deserializeObjectStringBuilder215();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString128();
        org.jsoup.nodes.TextNode textNode4 = serializedObjectSupporter0.deserializeObjectTextNode186();
        org.jsoup.nodes.TextNode textNode5 = serializedObjectSupporter0.deserializeObjectTextNode364();
        java.lang.StringBuilder stringBuilder6 = serializedObjectSupporter0.deserializeObjectStringBuilder206();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Document document7 = serializedObjectSupporter0.deserializeObjectDocument303();
// flaky:             org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: org.jsoup.nodes.Document$OutputSettings cannot be cast to org.jsoup.nodes.Document");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "More" + "'", str1, "More");
        org.junit.Assert.assertNotNull(stringBuilder2);
        org.junit.Assert.assertEquals(stringBuilder2.toString(), "<div id=\"1\">");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + " 12.3% " + "'", str3, " 12.3% ");
// flaky:         org.junit.Assert.assertNotNull(textNode4);
// flaky:         org.junit.Assert.assertNotNull(textNode5);
        org.junit.Assert.assertNotNull(stringBuilder6);
        org.junit.Assert.assertEquals(stringBuilder6.toString(), "<p>");
    }

    @Test
    public void test181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test181");
        org.jsoup.nodes.SerializedObjectSupporter serializedObjectSupporter0 = new org.jsoup.nodes.SerializedObjectSupporter();
        java.lang.String str1 = serializedObjectSupporter0.deserializeObjectString93();
        java.lang.StringBuilder stringBuilder2 = serializedObjectSupporter0.deserializeObjectStringBuilder36();
        org.jsoup.nodes.TextNode textNode3 = serializedObjectSupporter0.deserializeObjectTextNode137();
        org.jsoup.nodes.TextNode textNode4 = serializedObjectSupporter0.deserializeObjectTextNode289();
        java.lang.StringBuilder stringBuilder5 = serializedObjectSupporter0.deserializeObjectStringBuilder23();
        org.jsoup.nodes.TextNode textNode6 = serializedObjectSupporter0.deserializeObjectTextNode278();
        org.jsoup.nodes.TextNode textNode7 = serializedObjectSupporter0.deserializeObjectTextNode363();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Document document8 = serializedObjectSupporter0.deserializeObjectDocument182();
// flaky:             org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: org.jsoup.nodes.Document$OutputSettings cannot be cast to org.jsoup.nodes.Document");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "More" + "'", str1, "More");
        org.junit.Assert.assertNotNull(stringBuilder2);
        org.junit.Assert.assertEquals(stringBuilder2.toString(), "<div>\n <p><b>This</b> is <b>jsoup</b>.</p>\n</div>");
// flaky:         org.junit.Assert.assertNotNull(textNode3);
// flaky:         org.junit.Assert.assertNotNull(textNode4);
        org.junit.Assert.assertNotNull(stringBuilder5);
        org.junit.Assert.assertEquals(stringBuilder5.toString(), "<p>This <a>is</a><span>foo</span> <a>jsoup</a><span>foo</span>");
// flaky:         org.junit.Assert.assertNotNull(textNode6);
// flaky:         org.junit.Assert.assertNotNull(textNode7);
    }

    @Test
    public void test182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test182");
        org.jsoup.nodes.SerializedObjectSupporter serializedObjectSupporter0 = new org.jsoup.nodes.SerializedObjectSupporter();
        java.lang.String str1 = serializedObjectSupporter0.deserializeObjectString93();
        org.jsoup.nodes.TextNode textNode2 = serializedObjectSupporter0.deserializeObjectTextNode214();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString109();
        org.jsoup.nodes.TextNode textNode4 = serializedObjectSupporter0.deserializeObjectTextNode86();
        java.lang.String str5 = serializedObjectSupporter0.deserializeObjectString27();
        java.lang.StringBuilder stringBuilder6 = serializedObjectSupporter0.deserializeObjectStringBuilder72();
        org.jsoup.nodes.TextNode textNode7 = serializedObjectSupporter0.deserializeObjectTextNode341();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "More" + "'", str1, "More");
// flaky:         org.junit.Assert.assertNotNull(textNode2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "A caption" + "'", str3, "A caption");
// flaky:         org.junit.Assert.assertNotNull(textNode4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "now" + "'", str5, "now");
        org.junit.Assert.assertNotNull(stringBuilder6);
        org.junit.Assert.assertEquals(stringBuilder6.toString(), "<html>\n <head>\n  <title>Hello there</title> \n </head>\n <body>\n  <p id=\"1\">");
// flaky:         org.junit.Assert.assertNotNull(textNode7);
    }

    @Test
    public void test183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test183");
        org.jsoup.nodes.SerializedObjectSupporter serializedObjectSupporter0 = new org.jsoup.nodes.SerializedObjectSupporter();
        java.lang.String str1 = serializedObjectSupporter0.deserializeObjectString93();
        java.lang.StringBuilder stringBuilder2 = serializedObjectSupporter0.deserializeObjectStringBuilder267();
        org.jsoup.nodes.TextNode textNode3 = serializedObjectSupporter0.deserializeObjectTextNode102();
        java.lang.StringBuilder stringBuilder4 = serializedObjectSupporter0.deserializeObjectStringBuilder26();
        org.jsoup.nodes.TextNode textNode5 = serializedObjectSupporter0.deserializeObjectTextNode181();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "More" + "'", str1, "More");
        org.junit.Assert.assertNotNull(stringBuilder2);
        org.junit.Assert.assertEquals(stringBuilder2.toString(), "<doc>\n <val>");
// flaky:         org.junit.Assert.assertNotNull(textNode3);
        org.junit.Assert.assertNotNull(stringBuilder4);
        org.junit.Assert.assertEquals(stringBuilder4.toString(), "<div>\n <p>");
// flaky:         org.junit.Assert.assertNotNull(textNode5);
    }

    @Test
    public void test184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test184");
        org.jsoup.nodes.SerializedObjectSupporter serializedObjectSupporter0 = new org.jsoup.nodes.SerializedObjectSupporter();
        org.jsoup.nodes.TextNode textNode1 = serializedObjectSupporter0.deserializeObjectTextNode401();
        java.lang.StringBuilder stringBuilder2 = serializedObjectSupporter0.deserializeObjectStringBuilder163();
        org.jsoup.nodes.TextNode textNode3 = serializedObjectSupporter0.deserializeObjectTextNode135();
        org.jsoup.nodes.TextNode textNode4 = serializedObjectSupporter0.deserializeObjectTextNode183();
        org.jsoup.nodes.TextNode textNode5 = serializedObjectSupporter0.deserializeObjectTextNode384();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Document document6 = serializedObjectSupporter0.deserializeObjectDocument384();
// flaky:             org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: org.jsoup.nodes.Document$OutputSettings cannot be cast to org.jsoup.nodes.Document");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
// flaky:         org.junit.Assert.assertNotNull(textNode1);
        org.junit.Assert.assertNotNull(stringBuilder2);
        org.junit.Assert.assertEquals(stringBuilder2.toString(), "<html>\n <head>\n  <title>Format test</title>\n </head>\n <body>\n  <div>\n   <p>\n    Hello \n    <span>\n     jsoup \n     <span>");
// flaky:         org.junit.Assert.assertNotNull(textNode3);
// flaky:         org.junit.Assert.assertNotNull(textNode4);
// flaky:         org.junit.Assert.assertNotNull(textNode5);
    }

    @Test
    public void test185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test185");
        org.jsoup.nodes.SerializedObjectSupporter serializedObjectSupporter0 = new org.jsoup.nodes.SerializedObjectSupporter();
        java.lang.String str1 = serializedObjectSupporter0.deserializeObjectString93();
        java.lang.StringBuilder stringBuilder2 = serializedObjectSupporter0.deserializeObjectStringBuilder215();
        java.lang.StringBuilder stringBuilder3 = serializedObjectSupporter0.deserializeObjectStringBuilder380();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "More" + "'", str1, "More");
        org.junit.Assert.assertNotNull(stringBuilder2);
        org.junit.Assert.assertEquals(stringBuilder2.toString(), "<div id=\"1\">");
        org.junit.Assert.assertNotNull(stringBuilder3);
        org.junit.Assert.assertEquals(stringBuilder3.toString(), "<table> \n <colgroup>");
    }

    @Test
    public void test186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test186");
        org.jsoup.nodes.SerializedObjectSupporter serializedObjectSupporter0 = new org.jsoup.nodes.SerializedObjectSupporter();
        java.lang.String str1 = serializedObjectSupporter0.deserializeObjectString93();
        org.jsoup.nodes.TextNode textNode2 = serializedObjectSupporter0.deserializeObjectTextNode214();
        java.lang.StringBuilder stringBuilder3 = serializedObjectSupporter0.deserializeObjectStringBuilder19();
        java.lang.StringBuilder stringBuilder4 = serializedObjectSupporter0.deserializeObjectStringBuilder235();
        org.jsoup.nodes.TextNode textNode5 = serializedObjectSupporter0.deserializeObjectTextNode22();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Document document6 = serializedObjectSupporter0.deserializeObjectDocument287();
// flaky:             org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: org.jsoup.nodes.Document$OutputSettings cannot be cast to org.jsoup.nodes.Document");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "More" + "'", str1, "More");
// flaky:         org.junit.Assert.assertNotNull(textNode2);
        org.junit.Assert.assertNotNull(stringBuilder3);
        org.junit.Assert.assertEquals(stringBuilder3.toString(), "<p>This <a>is</a><span>");
        org.junit.Assert.assertNotNull(stringBuilder4);
        org.junit.Assert.assertEquals(stringBuilder4.toString(), "<a href=\"http://example.com/foo\" rel=\"nofollow\">");
// flaky:         org.junit.Assert.assertNotNull(textNode5);
    }

    @Test
    public void test187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test187");
        org.jsoup.nodes.SerializedObjectSupporter serializedObjectSupporter0 = new org.jsoup.nodes.SerializedObjectSupporter();
        org.jsoup.nodes.TextNode textNode1 = serializedObjectSupporter0.deserializeObjectTextNode401();
        java.lang.StringBuilder stringBuilder2 = serializedObjectSupporter0.deserializeObjectStringBuilder163();
        org.jsoup.nodes.TextNode textNode3 = serializedObjectSupporter0.deserializeObjectTextNode135();
        org.jsoup.nodes.TextNode textNode4 = serializedObjectSupporter0.deserializeObjectTextNode242();
        java.lang.StringBuilder stringBuilder5 = serializedObjectSupporter0.deserializeObjectStringBuilder256();
        java.lang.StringBuilder stringBuilder6 = serializedObjectSupporter0.deserializeObjectStringBuilder258();
// flaky:         org.junit.Assert.assertNotNull(textNode1);
        org.junit.Assert.assertNotNull(stringBuilder2);
        org.junit.Assert.assertEquals(stringBuilder2.toString(), "<html>\n <head>\n  <title>Format test</title>\n </head>\n <body>\n  <div>\n   <p>\n    Hello \n    <span>\n     jsoup \n     <span>");
// flaky:         org.junit.Assert.assertNotNull(textNode3);
// flaky:         org.junit.Assert.assertNotNull(textNode4);
        org.junit.Assert.assertNotNull(stringBuilder5);
        org.junit.Assert.assertEquals(stringBuilder5.toString(), "<doc id=\"2\" href=\"/bar\">");
        org.junit.Assert.assertNotNull(stringBuilder6);
        org.junit.Assert.assertEquals(stringBuilder6.toString(), "<doc id=\"2\" href=\"/bar\">\n Foo \n <br />\n <link>\n  One\n </link>\n <link>");
    }

    @Test
    public void test188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test188");
        org.jsoup.nodes.Document.OutputSettings outputSettings0 = new org.jsoup.nodes.Document.OutputSettings();
        outputSettings0.setforceAllElementAsBlock(false);
        org.jsoup.nodes.Document.OutputSettings outputSettings4 = outputSettings0.prettyPrint(true);
        org.jsoup.nodes.Document.OutputSettings outputSettings5 = outputSettings4.clone();
        org.junit.Assert.assertNotNull(outputSettings4);
        org.junit.Assert.assertNotNull(outputSettings5);
    }

    @Test
    public void test189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test189");
        org.jsoup.nodes.SerializedObjectSupporter serializedObjectSupporter0 = new org.jsoup.nodes.SerializedObjectSupporter();
        java.lang.String str1 = serializedObjectSupporter0.deserializeObjectString93();
        java.lang.StringBuilder stringBuilder2 = serializedObjectSupporter0.deserializeObjectStringBuilder36();
        org.jsoup.nodes.TextNode textNode3 = serializedObjectSupporter0.deserializeObjectTextNode102();
        org.jsoup.nodes.TextNode textNode4 = serializedObjectSupporter0.deserializeObjectTextNode270();
        java.lang.String str5 = serializedObjectSupporter0.deserializeObjectString22();
        java.lang.StringBuilder stringBuilder6 = serializedObjectSupporter0.deserializeObjectStringBuilder146();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Document document7 = serializedObjectSupporter0.deserializeObjectDocument352();
// flaky:             org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: org.jsoup.nodes.Document$OutputSettings cannot be cast to org.jsoup.nodes.Document");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "More" + "'", str1, "More");
        org.junit.Assert.assertNotNull(stringBuilder2);
        org.junit.Assert.assertEquals(stringBuilder2.toString(), "<div>\n <p><b>This</b> is <b>jsoup</b>.</p>\n</div>");
// flaky:         org.junit.Assert.assertNotNull(textNode3);
// flaky:         org.junit.Assert.assertNotNull(textNode4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Four" + "'", str5, "Four");
        org.junit.Assert.assertNotNull(stringBuilder6);
        org.junit.Assert.assertEquals(stringBuilder6.toString(), "<div id=\"1\">\n Text \n <p>");
    }

    @Test
    public void test190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test190");
        org.jsoup.nodes.SerializedObjectSupporter serializedObjectSupporter0 = new org.jsoup.nodes.SerializedObjectSupporter();
        java.lang.String str1 = serializedObjectSupporter0.deserializeObjectString93();
        java.lang.StringBuilder stringBuilder2 = serializedObjectSupporter0.deserializeObjectStringBuilder36();
        org.jsoup.nodes.TextNode textNode3 = serializedObjectSupporter0.deserializeObjectTextNode137();
        org.jsoup.nodes.TextNode textNode4 = serializedObjectSupporter0.deserializeObjectTextNode289();
        java.lang.StringBuilder stringBuilder5 = serializedObjectSupporter0.deserializeObjectStringBuilder99();
        org.jsoup.nodes.TextNode textNode6 = serializedObjectSupporter0.deserializeObjectTextNode54();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "More" + "'", str1, "More");
        org.junit.Assert.assertNotNull(stringBuilder2);
        org.junit.Assert.assertEquals(stringBuilder2.toString(), "<div>\n <p><b>This</b> is <b>jsoup</b>.</p>\n</div>");
// flaky:         org.junit.Assert.assertNotNull(textNode3);
// flaky:         org.junit.Assert.assertNotNull(textNode4);
        org.junit.Assert.assertNotNull(stringBuilder5);
        org.junit.Assert.assertEquals(stringBuilder5.toString(), "<div>\n <p>One</p>\n <p><span>");
// flaky:         org.junit.Assert.assertNotNull(textNode6);
    }

    @Test
    public void test191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test191");
        org.jsoup.nodes.SerializedObjectSupporter serializedObjectSupporter0 = new org.jsoup.nodes.SerializedObjectSupporter();
        java.lang.String str1 = serializedObjectSupporter0.deserializeObjectString93();
        org.jsoup.nodes.TextNode textNode2 = serializedObjectSupporter0.deserializeObjectTextNode214();
        java.lang.StringBuilder stringBuilder3 = serializedObjectSupporter0.deserializeObjectStringBuilder143();
        java.lang.StringBuilder stringBuilder4 = serializedObjectSupporter0.deserializeObjectStringBuilder261();
        java.lang.StringBuilder stringBuilder5 = serializedObjectSupporter0.deserializeObjectStringBuilder423();
        org.jsoup.nodes.TextNode textNode6 = serializedObjectSupporter0.deserializeObjectTextNode145();
        java.lang.String str7 = serializedObjectSupporter0.deserializeObjectString23();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Document document8 = serializedObjectSupporter0.deserializeObjectDocument149();
// flaky:             org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: org.jsoup.nodes.Document$OutputSettings cannot be cast to org.jsoup.nodes.Document");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "More" + "'", str1, "More");
// flaky:         org.junit.Assert.assertNotNull(textNode2);
        org.junit.Assert.assertNotNull(stringBuilder3);
        org.junit.Assert.assertEquals(stringBuilder3.toString(), "<div id=\"1\"></div>\n<div id=\"2\">\n Text \n <p>One</p>");
        org.junit.Assert.assertNotNull(stringBuilder4);
        org.junit.Assert.assertEquals(stringBuilder4.toString(), "<doc>\n <val>");
        org.junit.Assert.assertNotNull(stringBuilder5);
        org.junit.Assert.assertEquals(stringBuilder5.toString(), "<p><b>One</b></p>\n<b> \n <table>\n  <tbody>\n   <tr>\n    <td><p><i>Three</i></p><p><i>Four</i></p></td>\n   </tr>\n  </tbody>\n </table> <p>");
// flaky:         org.junit.Assert.assertNotNull(textNode6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Fix " + "'", str7, "Fix ");
    }

    @Test
    public void test192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test192");
        org.jsoup.nodes.SerializedObjectSupporter serializedObjectSupporter0 = new org.jsoup.nodes.SerializedObjectSupporter();
        java.lang.String str1 = serializedObjectSupporter0.deserializeObjectString93();
        java.lang.StringBuilder stringBuilder2 = serializedObjectSupporter0.deserializeObjectStringBuilder145();
        org.jsoup.nodes.TextNode textNode3 = serializedObjectSupporter0.deserializeObjectTextNode284();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "More" + "'", str1, "More");
        org.junit.Assert.assertNotNull(stringBuilder2);
        org.junit.Assert.assertEquals(stringBuilder2.toString(), "<div id=\"1\">");
// flaky:         org.junit.Assert.assertNotNull(textNode3);
    }

    @Test
    public void test193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test193");
        org.jsoup.nodes.Document.OutputSettings outputSettings0 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Entities.EscapeMode escapeMode1 = null;
        outputSettings0.setescapeMode(escapeMode1);
        java.nio.charset.Charset charset3 = outputSettings0.getcharset();
        org.jsoup.nodes.Document.OutputSettings outputSettings5 = outputSettings0.forceAllElementAsBlock(true);
        org.junit.Assert.assertNotNull(charset3);
        org.junit.Assert.assertNotNull(outputSettings5);
    }

    @Test
    public void test194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test194");
        org.jsoup.nodes.SerializedObjectSupporter serializedObjectSupporter0 = new org.jsoup.nodes.SerializedObjectSupporter();
        org.jsoup.nodes.TextNode textNode1 = serializedObjectSupporter0.deserializeObjectTextNode401();
        java.lang.StringBuilder stringBuilder2 = serializedObjectSupporter0.deserializeObjectStringBuilder60();
        java.lang.StringBuilder stringBuilder3 = serializedObjectSupporter0.deserializeObjectStringBuilder114();
        java.lang.StringBuilder stringBuilder4 = serializedObjectSupporter0.deserializeObjectStringBuilder421();
        org.jsoup.nodes.TextNode textNode5 = serializedObjectSupporter0.deserializeObjectTextNode168();
        java.lang.StringBuilder stringBuilder6 = serializedObjectSupporter0.deserializeObjectStringBuilder378();
// flaky:         org.junit.Assert.assertNotNull(textNode1);
        org.junit.Assert.assertNotNull(stringBuilder2);
        org.junit.Assert.assertEquals(stringBuilder2.toString(), "<html>\n <head>\n  <script>one</script>\n  <noscript></noscript>\n </head>\n <body>\n  <p>");
        org.junit.Assert.assertNotNull(stringBuilder3);
        org.junit.Assert.assertEquals(stringBuilder3.toString(), "\nthere &amp; now &gt; \n<p>");
        org.junit.Assert.assertNotNull(stringBuilder4);
        org.junit.Assert.assertEquals(stringBuilder4.toString(), "<p><b>One</b></p>\n<b> \n <table>\n  <tbody>\n   <tr>\n    <td><p><i>Three</i></p><p><i>");
// flaky:         org.junit.Assert.assertNotNull(textNode5);
        org.junit.Assert.assertNotNull(stringBuilder6);
        org.junit.Assert.assertEquals(stringBuilder6.toString(), "<p =a=\"\">One<a <p=\"\">Something</a></p>\n<a <p=\"\">");
    }

    @Test
    public void test195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test195");
        org.jsoup.nodes.Document.OutputSettings outputSettings0 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Entities.EscapeMode escapeMode1 = null;
        outputSettings0.setescapeMode(escapeMode1);
        org.jsoup.nodes.Entities.EscapeMode escapeMode3 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings4 = outputSettings0.escapeMode(escapeMode3);
        org.jsoup.nodes.Entities.EscapeMode escapeMode5 = outputSettings0.escapeMode;
        java.nio.charset.Charset charset6 = outputSettings0.getcharset();
        int int7 = outputSettings0.indentAmount;
        boolean boolean8 = outputSettings0.getprettyPrint();
        org.junit.Assert.assertNotNull(outputSettings4);
        org.junit.Assert.assertNull(escapeMode5);
        org.junit.Assert.assertNotNull(charset6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test196");
        org.jsoup.nodes.SerializedObjectSupporter serializedObjectSupporter0 = new org.jsoup.nodes.SerializedObjectSupporter();
        org.jsoup.nodes.TextNode textNode1 = serializedObjectSupporter0.deserializeObjectTextNode401();
        org.jsoup.nodes.TextNode textNode2 = serializedObjectSupporter0.deserializeObjectTextNode376();
        org.jsoup.nodes.TextNode textNode3 = serializedObjectSupporter0.deserializeObjectTextNode145();
        java.lang.StringBuilder stringBuilder4 = serializedObjectSupporter0.deserializeObjectStringBuilder373();
        org.jsoup.nodes.TextNode textNode5 = serializedObjectSupporter0.deserializeObjectTextNode344();
        org.jsoup.nodes.TextNode textNode6 = serializedObjectSupporter0.deserializeObjectTextNode281();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Document document7 = serializedObjectSupporter0.deserializeObjectDocument173();
// flaky:             org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: org.jsoup.nodes.Document$OutputSettings cannot be cast to org.jsoup.nodes.Document");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
// flaky:         org.junit.Assert.assertNotNull(textNode1);
// flaky:         org.junit.Assert.assertNotNull(textNode2);
// flaky:         org.junit.Assert.assertNotNull(textNode3);
        org.junit.Assert.assertNotNull(stringBuilder4);
        org.junit.Assert.assertEquals(stringBuilder4.toString(), "");
// flaky:         org.junit.Assert.assertNotNull(textNode5);
// flaky:         org.junit.Assert.assertNotNull(textNode6);
    }

    @Test
    public void test197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test197");
        org.jsoup.nodes.SerializedObjectSupporter serializedObjectSupporter0 = new org.jsoup.nodes.SerializedObjectSupporter();
        java.lang.String str1 = serializedObjectSupporter0.deserializeObjectString93();
        java.lang.StringBuilder stringBuilder2 = serializedObjectSupporter0.deserializeObjectStringBuilder36();
        org.jsoup.nodes.TextNode textNode3 = serializedObjectSupporter0.deserializeObjectTextNode137();
        org.jsoup.nodes.TextNode textNode4 = serializedObjectSupporter0.deserializeObjectTextNode289();
        java.lang.StringBuilder stringBuilder5 = serializedObjectSupporter0.deserializeObjectStringBuilder23();
        org.jsoup.nodes.TextNode textNode6 = serializedObjectSupporter0.deserializeObjectTextNode278();
        org.jsoup.nodes.TextNode textNode7 = serializedObjectSupporter0.deserializeObjectTextNode363();
        java.lang.StringBuilder stringBuilder8 = serializedObjectSupporter0.deserializeObjectStringBuilder158();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Document document9 = serializedObjectSupporter0.deserializeObjectDocument247();
// flaky:             org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: org.jsoup.nodes.Document$OutputSettings cannot be cast to org.jsoup.nodes.Document");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "More" + "'", str1, "More");
        org.junit.Assert.assertNotNull(stringBuilder2);
        org.junit.Assert.assertEquals(stringBuilder2.toString(), "<div>\n <p><b>This</b> is <b>jsoup</b>.</p>\n</div>");
// flaky:         org.junit.Assert.assertNotNull(textNode3);
// flaky:         org.junit.Assert.assertNotNull(textNode4);
        org.junit.Assert.assertNotNull(stringBuilder5);
        org.junit.Assert.assertEquals(stringBuilder5.toString(), "<p>This <a>is</a><span>foo</span> <a>jsoup</a><span>foo</span>");
// flaky:         org.junit.Assert.assertNotNull(textNode6);
// flaky:         org.junit.Assert.assertNotNull(textNode7);
        org.junit.Assert.assertNotNull(stringBuilder8);
        org.junit.Assert.assertEquals(stringBuilder8.toString(), "<html>\n <head>\n  <title>Format test</title>\n </head>\n <body>\n  <div>\n   <p>Hello <span>jsoup <span>");
    }

    @Test
    public void test198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test198");
        org.jsoup.nodes.SerializedObjectSupporter serializedObjectSupporter0 = new org.jsoup.nodes.SerializedObjectSupporter();
        java.lang.String str1 = serializedObjectSupporter0.deserializeObjectString93();
        java.lang.StringBuilder stringBuilder2 = serializedObjectSupporter0.deserializeObjectStringBuilder145();
        org.jsoup.nodes.TextNode textNode3 = serializedObjectSupporter0.deserializeObjectTextNode197();
        org.jsoup.nodes.TextNode textNode4 = serializedObjectSupporter0.deserializeObjectTextNode234();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "More" + "'", str1, "More");
        org.junit.Assert.assertNotNull(stringBuilder2);
        org.junit.Assert.assertEquals(stringBuilder2.toString(), "<div id=\"1\">");
// flaky:         org.junit.Assert.assertNotNull(textNode3);
// flaky:         org.junit.Assert.assertNotNull(textNode4);
    }

    @Test
    public void test199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test199");
        org.jsoup.nodes.SerializedObjectSupporter serializedObjectSupporter0 = new org.jsoup.nodes.SerializedObjectSupporter();
        java.lang.String str1 = serializedObjectSupporter0.deserializeObjectString93();
        java.lang.StringBuilder stringBuilder2 = serializedObjectSupporter0.deserializeObjectStringBuilder36();
        org.jsoup.nodes.TextNode textNode3 = serializedObjectSupporter0.deserializeObjectTextNode137();
        org.jsoup.nodes.TextNode textNode4 = serializedObjectSupporter0.deserializeObjectTextNode289();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Document document5 = serializedObjectSupporter0.deserializeObjectDocument194();
// flaky:             org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: org.jsoup.nodes.Document$OutputSettings cannot be cast to org.jsoup.nodes.Document");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "More" + "'", str1, "More");
        org.junit.Assert.assertNotNull(stringBuilder2);
        org.junit.Assert.assertEquals(stringBuilder2.toString(), "<div>\n <p><b>This</b> is <b>jsoup</b>.</p>\n</div>");
// flaky:         org.junit.Assert.assertNotNull(textNode3);
// flaky:         org.junit.Assert.assertNotNull(textNode4);
    }

    @Test
    public void test200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test200");
        org.jsoup.nodes.SerializedObjectSupporter serializedObjectSupporter0 = new org.jsoup.nodes.SerializedObjectSupporter();
        org.jsoup.nodes.TextNode textNode1 = serializedObjectSupporter0.deserializeObjectTextNode401();
        org.jsoup.nodes.TextNode textNode2 = serializedObjectSupporter0.deserializeObjectTextNode376();
        org.jsoup.nodes.TextNode textNode3 = serializedObjectSupporter0.deserializeObjectTextNode145();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Document document4 = serializedObjectSupporter0.deserializeObjectDocument361();
// flaky:             org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: org.jsoup.nodes.Document$OutputSettings cannot be cast to org.jsoup.nodes.Document");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
// flaky:         org.junit.Assert.assertNotNull(textNode1);
// flaky:         org.junit.Assert.assertNotNull(textNode2);
// flaky:         org.junit.Assert.assertNotNull(textNode3);
    }

    @Test
    public void test201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test201");
        org.jsoup.nodes.SerializedObjectSupporter serializedObjectSupporter0 = new org.jsoup.nodes.SerializedObjectSupporter();
        java.lang.String str1 = serializedObjectSupporter0.deserializeObjectString93();
        java.lang.StringBuilder stringBuilder2 = serializedObjectSupporter0.deserializeObjectStringBuilder36();
        org.jsoup.nodes.TextNode textNode3 = serializedObjectSupporter0.deserializeObjectTextNode137();
        org.jsoup.nodes.TextNode textNode4 = serializedObjectSupporter0.deserializeObjectTextNode289();
        java.lang.StringBuilder stringBuilder5 = serializedObjectSupporter0.deserializeObjectStringBuilder310();
        java.lang.String str6 = serializedObjectSupporter0.deserializeObjectString107();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "More" + "'", str1, "More");
        org.junit.Assert.assertNotNull(stringBuilder2);
        org.junit.Assert.assertEquals(stringBuilder2.toString(), "<div>\n <p><b>This</b> is <b>jsoup</b>.</p>\n</div>");
// flaky:         org.junit.Assert.assertNotNull(textNode3);
// flaky:         org.junit.Assert.assertNotNull(textNode4);
        org.junit.Assert.assertNotNull(stringBuilder5);
        org.junit.Assert.assertEquals(stringBuilder5.toString(), "<span>Hello \n <div>\n  there\n </div>");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + " aft" + "'", str6, " aft");
    }

    @Test
    public void test202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test202");
        org.jsoup.nodes.SerializedObjectSupporter serializedObjectSupporter0 = new org.jsoup.nodes.SerializedObjectSupporter();
        org.jsoup.nodes.TextNode textNode1 = serializedObjectSupporter0.deserializeObjectTextNode401();
        java.lang.StringBuilder stringBuilder2 = serializedObjectSupporter0.deserializeObjectStringBuilder163();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString25();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Document document4 = serializedObjectSupporter0.deserializeObjectDocument414();
// flaky:             org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: org.jsoup.nodes.Document$OutputSettings cannot be cast to org.jsoup.nodes.Document");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
// flaky:         org.junit.Assert.assertNotNull(textNode1);
        org.junit.Assert.assertNotNull(stringBuilder2);
        org.junit.Assert.assertEquals(stringBuilder2.toString(), "<html>\n <head>\n  <title>Format test</title>\n </head>\n <body>\n  <div>\n   <p>\n    Hello \n    <span>\n     jsoup \n     <span>");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Hello " + "'", str3, "Hello ");
    }

    @Test
    public void test203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test203");
        org.jsoup.nodes.SerializedObjectSupporter serializedObjectSupporter0 = new org.jsoup.nodes.SerializedObjectSupporter();
        org.jsoup.nodes.TextNode textNode1 = serializedObjectSupporter0.deserializeObjectTextNode401();
        java.lang.StringBuilder stringBuilder2 = serializedObjectSupporter0.deserializeObjectStringBuilder60();
        java.lang.StringBuilder stringBuilder3 = serializedObjectSupporter0.deserializeObjectStringBuilder114();
        java.lang.StringBuilder stringBuilder4 = serializedObjectSupporter0.deserializeObjectStringBuilder238();
        org.jsoup.nodes.TextNode textNode5 = serializedObjectSupporter0.deserializeObjectTextNode120();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Document document6 = serializedObjectSupporter0.deserializeObjectDocument414();
// flaky:             org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: org.jsoup.nodes.Document$OutputSettings cannot be cast to org.jsoup.nodes.Document");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
// flaky:         org.junit.Assert.assertNotNull(textNode1);
        org.junit.Assert.assertNotNull(stringBuilder2);
        org.junit.Assert.assertEquals(stringBuilder2.toString(), "<html>\n <head>\n  <script>one</script>\n  <noscript></noscript>\n </head>\n <body>\n  <p>");
        org.junit.Assert.assertNotNull(stringBuilder3);
        org.junit.Assert.assertEquals(stringBuilder3.toString(), "\nthere &amp; now &gt; \n<p>");
        org.junit.Assert.assertNotNull(stringBuilder4);
        org.junit.Assert.assertEquals(stringBuilder4.toString(), "<img src=\"cid:12345\" />");
// flaky:         org.junit.Assert.assertNotNull(textNode5);
    }

    @Test
    public void test204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test204");
        org.jsoup.nodes.SerializedObjectSupporter serializedObjectSupporter0 = new org.jsoup.nodes.SerializedObjectSupporter();
        org.jsoup.nodes.TextNode textNode1 = serializedObjectSupporter0.deserializeObjectTextNode401();
        org.jsoup.nodes.TextNode textNode2 = serializedObjectSupporter0.deserializeObjectTextNode5();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString134();
// flaky:         org.junit.Assert.assertNotNull(textNode1);
// flaky:         org.junit.Assert.assertNotNull(textNode2);
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\u2663" + "'", str3, "\u2663");
    }

    @Test
    public void test205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test205");
        org.jsoup.nodes.SerializedObjectSupporter serializedObjectSupporter0 = new org.jsoup.nodes.SerializedObjectSupporter();
        java.lang.String str1 = serializedObjectSupporter0.deserializeObjectString93();
        org.jsoup.nodes.TextNode textNode2 = serializedObjectSupporter0.deserializeObjectTextNode214();
        java.lang.StringBuilder stringBuilder3 = serializedObjectSupporter0.deserializeObjectStringBuilder143();
        java.lang.StringBuilder stringBuilder4 = serializedObjectSupporter0.deserializeObjectStringBuilder261();
        java.lang.StringBuilder stringBuilder5 = serializedObjectSupporter0.deserializeObjectStringBuilder423();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Document document6 = serializedObjectSupporter0.deserializeObjectDocument63();
// flaky:             org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: org.jsoup.nodes.Document$OutputSettings cannot be cast to org.jsoup.nodes.Document");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "More" + "'", str1, "More");
// flaky:         org.junit.Assert.assertNotNull(textNode2);
        org.junit.Assert.assertNotNull(stringBuilder3);
        org.junit.Assert.assertEquals(stringBuilder3.toString(), "<div id=\"1\"></div>\n<div id=\"2\">\n Text \n <p>One</p>");
        org.junit.Assert.assertNotNull(stringBuilder4);
        org.junit.Assert.assertEquals(stringBuilder4.toString(), "<doc>\n <val>");
        org.junit.Assert.assertNotNull(stringBuilder5);
        org.junit.Assert.assertEquals(stringBuilder5.toString(), "<p><b>One</b></p>\n<b> \n <table>\n  <tbody>\n   <tr>\n    <td><p><i>Three</i></p><p><i>Four</i></p></td>\n   </tr>\n  </tbody>\n </table> <p>");
    }

    @Test
    public void test206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test206");
        org.jsoup.nodes.SerializedObjectSupporter serializedObjectSupporter0 = new org.jsoup.nodes.SerializedObjectSupporter();
        java.lang.String str1 = serializedObjectSupporter0.deserializeObjectString93();
        java.lang.StringBuilder stringBuilder2 = serializedObjectSupporter0.deserializeObjectStringBuilder36();
        java.lang.StringBuilder stringBuilder3 = serializedObjectSupporter0.deserializeObjectStringBuilder399();
        org.jsoup.nodes.TextNode textNode4 = serializedObjectSupporter0.deserializeObjectTextNode126();
        java.lang.StringBuilder stringBuilder5 = serializedObjectSupporter0.deserializeObjectStringBuilder72();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "More" + "'", str1, "More");
        org.junit.Assert.assertNotNull(stringBuilder2);
        org.junit.Assert.assertEquals(stringBuilder2.toString(), "<div>\n <p><b>This</b> is <b>jsoup</b>.</p>\n</div>");
        org.junit.Assert.assertNotNull(stringBuilder3);
        org.junit.Assert.assertEquals(stringBuilder3.toString(), "<table> \n <colgroup> \n  <col /> \n </colgroup>\n <colgroup> \n  <col /> \n  <col /> \n  <col /> \n </colgroup>\n <thead> \n  <tr> \n   <th> </th>\n   <th>2008 </th>\n   <th>2007 </th>\n   <th>2006 </th>\n  </tr>\n </thead>\n <tbody> \n  <tr> \n   <th scope=\"rowgroup\"> Research and development </th>\n   <td> $ 1,109 </td>\n   <td> $ 782 </td>\n   <td> $ 712 </td>\n  </tr>\n  <tr> \n   <th scope=\"row\">");
// flaky:         org.junit.Assert.assertNotNull(textNode4);
        org.junit.Assert.assertNotNull(stringBuilder5);
        org.junit.Assert.assertEquals(stringBuilder5.toString(), "<html>\n <head>\n  <title>Hello there</title> \n </head>\n <body>\n  <p id=\"1\">");
    }

    @Test
    public void test207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test207");
        org.jsoup.nodes.SerializedObjectSupporter serializedObjectSupporter0 = new org.jsoup.nodes.SerializedObjectSupporter();
        java.lang.String str1 = serializedObjectSupporter0.deserializeObjectString93();
        java.lang.StringBuilder stringBuilder2 = serializedObjectSupporter0.deserializeObjectStringBuilder36();
        org.jsoup.nodes.TextNode textNode3 = serializedObjectSupporter0.deserializeObjectTextNode137();
        org.jsoup.nodes.TextNode textNode4 = serializedObjectSupporter0.deserializeObjectTextNode289();
        java.lang.StringBuilder stringBuilder5 = serializedObjectSupporter0.deserializeObjectStringBuilder23();
        org.jsoup.nodes.TextNode textNode6 = serializedObjectSupporter0.deserializeObjectTextNode278();
        org.jsoup.nodes.TextNode textNode7 = serializedObjectSupporter0.deserializeObjectTextNode363();
        java.lang.StringBuilder stringBuilder8 = serializedObjectSupporter0.deserializeObjectStringBuilder158();
        org.jsoup.nodes.TextNode textNode9 = serializedObjectSupporter0.deserializeObjectTextNode116();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "More" + "'", str1, "More");
        org.junit.Assert.assertNotNull(stringBuilder2);
        org.junit.Assert.assertEquals(stringBuilder2.toString(), "<div>\n <p><b>This</b> is <b>jsoup</b>.</p>\n</div>");
// flaky:         org.junit.Assert.assertNotNull(textNode3);
// flaky:         org.junit.Assert.assertNotNull(textNode4);
        org.junit.Assert.assertNotNull(stringBuilder5);
        org.junit.Assert.assertEquals(stringBuilder5.toString(), "<p>This <a>is</a><span>foo</span> <a>jsoup</a><span>foo</span>");
// flaky:         org.junit.Assert.assertNotNull(textNode6);
// flaky:         org.junit.Assert.assertNotNull(textNode7);
        org.junit.Assert.assertNotNull(stringBuilder8);
        org.junit.Assert.assertEquals(stringBuilder8.toString(), "<html>\n <head>\n  <title>Format test</title>\n </head>\n <body>\n  <div>\n   <p>Hello <span>jsoup <span>");
// flaky:         org.junit.Assert.assertNotNull(textNode9);
    }

    @Test
    public void test208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test208");
        org.jsoup.nodes.SerializedObjectSupporter serializedObjectSupporter0 = new org.jsoup.nodes.SerializedObjectSupporter();
        java.lang.String str1 = serializedObjectSupporter0.deserializeObjectString93();
        java.lang.StringBuilder stringBuilder2 = serializedObjectSupporter0.deserializeObjectStringBuilder215();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString128();
        java.lang.StringBuilder stringBuilder4 = serializedObjectSupporter0.deserializeObjectStringBuilder419();
        java.lang.StringBuilder stringBuilder5 = serializedObjectSupporter0.deserializeObjectStringBuilder335();
        java.lang.StringBuilder stringBuilder6 = serializedObjectSupporter0.deserializeObjectStringBuilder299();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "More" + "'", str1, "More");
        org.junit.Assert.assertNotNull(stringBuilder2);
        org.junit.Assert.assertEquals(stringBuilder2.toString(), "<div id=\"1\">");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + " 12.3% " + "'", str3, " 12.3% ");
        org.junit.Assert.assertNotNull(stringBuilder4);
        org.junit.Assert.assertEquals(stringBuilder4.toString(), "<p><b>One</b></p>\n<b>");
        org.junit.Assert.assertNotNull(stringBuilder5);
        org.junit.Assert.assertEquals(stringBuilder5.toString(), "<p><b class=\"one\">One <i>Two <b>Three</b></i></b></p>\n<p><b class=\"one\"><i><b>");
        org.junit.Assert.assertNotNull(stringBuilder6);
        org.junit.Assert.assertEquals(stringBuilder6.toString(), "<h1>Hello </h1>\n<h2>There \n <hgroup>\n  <h1>Another</h1>\n  <h2>headline</h2>\n </hgroup>");
    }

    @Test
    public void test209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test209");
        org.jsoup.nodes.SerializedObjectSupporter serializedObjectSupporter0 = new org.jsoup.nodes.SerializedObjectSupporter();
        java.lang.String str1 = serializedObjectSupporter0.deserializeObjectString93();
        org.jsoup.nodes.TextNode textNode2 = serializedObjectSupporter0.deserializeObjectTextNode214();
        java.lang.StringBuilder stringBuilder3 = serializedObjectSupporter0.deserializeObjectStringBuilder143();
        java.lang.StringBuilder stringBuilder4 = serializedObjectSupporter0.deserializeObjectStringBuilder261();
        org.jsoup.nodes.TextNode textNode5 = serializedObjectSupporter0.deserializeObjectTextNode255();
        org.jsoup.nodes.TextNode textNode6 = serializedObjectSupporter0.deserializeObjectTextNode421();
        org.jsoup.nodes.TextNode textNode7 = serializedObjectSupporter0.deserializeObjectTextNode251();
        java.lang.String str8 = serializedObjectSupporter0.deserializeObjectString75();
        org.jsoup.nodes.TextNode textNode9 = serializedObjectSupporter0.deserializeObjectTextNode39();
        org.jsoup.nodes.TextNode textNode10 = serializedObjectSupporter0.deserializeObjectTextNode46();
        java.lang.StringBuilder stringBuilder11 = serializedObjectSupporter0.deserializeObjectStringBuilder174();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "More" + "'", str1, "More");
// flaky:         org.junit.Assert.assertNotNull(textNode2);
        org.junit.Assert.assertNotNull(stringBuilder3);
        org.junit.Assert.assertEquals(stringBuilder3.toString(), "<div id=\"1\"></div>\n<div id=\"2\">\n Text \n <p>One</p>");
        org.junit.Assert.assertNotNull(stringBuilder4);
        org.junit.Assert.assertEquals(stringBuilder4.toString(), "<doc>\n <val>");
// flaky:         org.junit.Assert.assertNotNull(textNode5);
// flaky:         org.junit.Assert.assertNotNull(textNode6);
// flaky:         org.junit.Assert.assertNotNull(textNode7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Nice" + "'", str8, "Nice");
// flaky:         org.junit.Assert.assertNotNull(textNode9);
// flaky:         org.junit.Assert.assertNotNull(textNode10);
        org.junit.Assert.assertNotNull(stringBuilder11);
        org.junit.Assert.assertEquals(stringBuilder11.toString(), "<div>\n <p>Hello</p>\n <p>there</p>\n</div>");
    }

    @Test
    public void test210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test210");
        org.jsoup.nodes.SerializedObjectSupporter serializedObjectSupporter0 = new org.jsoup.nodes.SerializedObjectSupporter();
        java.lang.String str1 = serializedObjectSupporter0.deserializeObjectString93();
        org.jsoup.nodes.TextNode textNode2 = serializedObjectSupporter0.deserializeObjectTextNode214();
        java.lang.StringBuilder stringBuilder3 = serializedObjectSupporter0.deserializeObjectStringBuilder143();
        java.lang.StringBuilder stringBuilder4 = serializedObjectSupporter0.deserializeObjectStringBuilder261();
        org.jsoup.nodes.TextNode textNode5 = serializedObjectSupporter0.deserializeObjectTextNode255();
        org.jsoup.nodes.TextNode textNode6 = serializedObjectSupporter0.deserializeObjectTextNode421();
        org.jsoup.nodes.TextNode textNode7 = serializedObjectSupporter0.deserializeObjectTextNode251();
        java.lang.String str8 = serializedObjectSupporter0.deserializeObjectString75();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Document document9 = serializedObjectSupporter0.deserializeObjectDocument390();
// flaky:             org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: org.jsoup.nodes.Document$OutputSettings cannot be cast to org.jsoup.nodes.Document");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "More" + "'", str1, "More");
// flaky:         org.junit.Assert.assertNotNull(textNode2);
        org.junit.Assert.assertNotNull(stringBuilder3);
        org.junit.Assert.assertEquals(stringBuilder3.toString(), "<div id=\"1\"></div>\n<div id=\"2\">\n Text \n <p>One</p>");
        org.junit.Assert.assertNotNull(stringBuilder4);
        org.junit.Assert.assertEquals(stringBuilder4.toString(), "<doc>\n <val>");
// flaky:         org.junit.Assert.assertNotNull(textNode5);
// flaky:         org.junit.Assert.assertNotNull(textNode6);
// flaky:         org.junit.Assert.assertNotNull(textNode7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Nice" + "'", str8, "Nice");
    }

    @Test
    public void test211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test211");
        org.jsoup.nodes.SerializedObjectSupporter serializedObjectSupporter0 = new org.jsoup.nodes.SerializedObjectSupporter();
        java.lang.String str1 = serializedObjectSupporter0.deserializeObjectString93();
        java.lang.StringBuilder stringBuilder2 = serializedObjectSupporter0.deserializeObjectStringBuilder36();
        java.lang.StringBuilder stringBuilder3 = serializedObjectSupporter0.deserializeObjectStringBuilder399();
        org.jsoup.nodes.TextNode textNode4 = serializedObjectSupporter0.deserializeObjectTextNode54();
        org.jsoup.nodes.TextNode textNode5 = serializedObjectSupporter0.deserializeObjectTextNode343();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "More" + "'", str1, "More");
        org.junit.Assert.assertNotNull(stringBuilder2);
        org.junit.Assert.assertEquals(stringBuilder2.toString(), "<div>\n <p><b>This</b> is <b>jsoup</b>.</p>\n</div>");
        org.junit.Assert.assertNotNull(stringBuilder3);
        org.junit.Assert.assertEquals(stringBuilder3.toString(), "<table> \n <colgroup> \n  <col /> \n </colgroup>\n <colgroup> \n  <col /> \n  <col /> \n  <col /> \n </colgroup>\n <thead> \n  <tr> \n   <th> </th>\n   <th>2008 </th>\n   <th>2007 </th>\n   <th>2006 </th>\n  </tr>\n </thead>\n <tbody> \n  <tr> \n   <th scope=\"rowgroup\"> Research and development </th>\n   <td> $ 1,109 </td>\n   <td> $ 782 </td>\n   <td> $ 712 </td>\n  </tr>\n  <tr> \n   <th scope=\"row\">");
// flaky:         org.junit.Assert.assertNotNull(textNode4);
// flaky:         org.junit.Assert.assertNotNull(textNode5);
    }

    @Test
    public void test212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test212");
        org.jsoup.nodes.Document.OutputSettings outputSettings0 = new org.jsoup.nodes.Document.OutputSettings();
        outputSettings0.setforceAllElementAsBlock(false);
        org.jsoup.nodes.Document.OutputSettings outputSettings4 = outputSettings0.prettyPrint(true);
        org.jsoup.nodes.Document.OutputSettings outputSettings6 = outputSettings4.indentAmount(100);
        org.junit.Assert.assertNotNull(outputSettings4);
        org.junit.Assert.assertNotNull(outputSettings6);
    }

    @Test
    public void test213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test213");
        org.jsoup.nodes.SerializedObjectSupporter serializedObjectSupporter0 = new org.jsoup.nodes.SerializedObjectSupporter();
        java.lang.String str1 = serializedObjectSupporter0.deserializeObjectString93();
        java.lang.StringBuilder stringBuilder2 = serializedObjectSupporter0.deserializeObjectStringBuilder36();
        org.jsoup.nodes.TextNode textNode3 = serializedObjectSupporter0.deserializeObjectTextNode137();
        org.jsoup.nodes.TextNode textNode4 = serializedObjectSupporter0.deserializeObjectTextNode289();
        java.lang.StringBuilder stringBuilder5 = serializedObjectSupporter0.deserializeObjectStringBuilder310();
        java.lang.String str6 = serializedObjectSupporter0.deserializeObjectString2();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "More" + "'", str1, "More");
        org.junit.Assert.assertNotNull(stringBuilder2);
        org.junit.Assert.assertEquals(stringBuilder2.toString(), "<div>\n <p><b>This</b> is <b>jsoup</b>.</p>\n</div>");
// flaky:         org.junit.Assert.assertNotNull(textNode3);
// flaky:         org.junit.Assert.assertNotNull(textNode4);
        org.junit.Assert.assertNotNull(stringBuilder5);
        org.junit.Assert.assertEquals(stringBuilder5.toString(), "<span>Hello \n <div>\n  there\n </div>");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + " jsoup " + "'", str6, " jsoup ");
    }

    @Test
    public void test214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test214");
        org.jsoup.nodes.SerializedObjectSupporter serializedObjectSupporter0 = new org.jsoup.nodes.SerializedObjectSupporter();
        org.jsoup.nodes.TextNode textNode1 = serializedObjectSupporter0.deserializeObjectTextNode401();
        java.lang.StringBuilder stringBuilder2 = serializedObjectSupporter0.deserializeObjectStringBuilder163();
        org.jsoup.nodes.TextNode textNode3 = serializedObjectSupporter0.deserializeObjectTextNode397();
        java.lang.String str4 = serializedObjectSupporter0.deserializeObjectString75();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Document document5 = serializedObjectSupporter0.deserializeObjectDocument44();
// flaky:             org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: org.jsoup.nodes.Document$OutputSettings cannot be cast to org.jsoup.nodes.Document");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
// flaky:         org.junit.Assert.assertNotNull(textNode1);
        org.junit.Assert.assertNotNull(stringBuilder2);
        org.junit.Assert.assertEquals(stringBuilder2.toString(), "<html>\n <head>\n  <title>Format test</title>\n </head>\n <body>\n  <div>\n   <p>\n    Hello \n    <span>\n     jsoup \n     <span>");
// flaky:         org.junit.Assert.assertNotNull(textNode3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Nice" + "'", str4, "Nice");
    }

    @Test
    public void test215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test215");
        org.jsoup.nodes.SerializedObjectSupporter serializedObjectSupporter0 = new org.jsoup.nodes.SerializedObjectSupporter();
        java.lang.String str1 = serializedObjectSupporter0.deserializeObjectString93();
        org.jsoup.nodes.TextNode textNode2 = serializedObjectSupporter0.deserializeObjectTextNode214();
        java.lang.StringBuilder stringBuilder3 = serializedObjectSupporter0.deserializeObjectStringBuilder143();
        java.lang.StringBuilder stringBuilder4 = serializedObjectSupporter0.deserializeObjectStringBuilder261();
        org.jsoup.nodes.TextNode textNode5 = serializedObjectSupporter0.deserializeObjectTextNode255();
        org.jsoup.nodes.TextNode textNode6 = serializedObjectSupporter0.deserializeObjectTextNode421();
        org.jsoup.nodes.TextNode textNode7 = serializedObjectSupporter0.deserializeObjectTextNode251();
        java.lang.StringBuilder stringBuilder8 = serializedObjectSupporter0.deserializeObjectStringBuilder232();
        java.lang.StringBuilder stringBuilder9 = serializedObjectSupporter0.deserializeObjectStringBuilder91();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "More" + "'", str1, "More");
// flaky:         org.junit.Assert.assertNotNull(textNode2);
        org.junit.Assert.assertNotNull(stringBuilder3);
        org.junit.Assert.assertEquals(stringBuilder3.toString(), "<div id=\"1\"></div>\n<div id=\"2\">\n Text \n <p>One</p>");
        org.junit.Assert.assertNotNull(stringBuilder4);
        org.junit.Assert.assertEquals(stringBuilder4.toString(), "<doc>\n <val>");
// flaky:         org.junit.Assert.assertNotNull(textNode5);
// flaky:         org.junit.Assert.assertNotNull(textNode6);
// flaky:         org.junit.Assert.assertNotNull(textNode7);
        org.junit.Assert.assertNotNull(stringBuilder8);
        org.junit.Assert.assertEquals(stringBuilder8.toString(), "<p><a rel=\"nofollow\">Dodgy</a> <a href=\"http://nice.com\" rel=\"nofollow\">Nice</a></p>\n<blockquote>");
        org.junit.Assert.assertNotNull(stringBuilder9);
        org.junit.Assert.assertEquals(stringBuilder9.toString(), "<div>\n <p>");
    }

    @Test
    public void test216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test216");
        org.jsoup.nodes.Document.OutputSettings outputSettings0 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Entities.EscapeMode escapeMode1 = null;
        outputSettings0.setescapeMode(escapeMode1);
        org.jsoup.nodes.Entities.EscapeMode escapeMode3 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings4 = outputSettings0.escapeMode(escapeMode3);
        org.jsoup.nodes.Entities.EscapeMode escapeMode5 = outputSettings0.escapeMode;
        org.jsoup.nodes.Entities.EscapeMode escapeMode6 = outputSettings0.getescapeMode();
        int int7 = outputSettings0.getindentAmount();
        org.junit.Assert.assertNotNull(outputSettings4);
        org.junit.Assert.assertNull(escapeMode5);
        org.junit.Assert.assertNull(escapeMode6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
    }

    @Test
    public void test217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test217");
        org.jsoup.nodes.SerializedObjectSupporter serializedObjectSupporter0 = new org.jsoup.nodes.SerializedObjectSupporter();
        java.lang.String str1 = serializedObjectSupporter0.deserializeObjectString93();
        org.jsoup.nodes.TextNode textNode2 = serializedObjectSupporter0.deserializeObjectTextNode214();
        java.lang.StringBuilder stringBuilder3 = serializedObjectSupporter0.deserializeObjectStringBuilder143();
        java.lang.StringBuilder stringBuilder4 = serializedObjectSupporter0.deserializeObjectStringBuilder261();
        org.jsoup.nodes.TextNode textNode5 = serializedObjectSupporter0.deserializeObjectTextNode255();
        org.jsoup.nodes.TextNode textNode6 = serializedObjectSupporter0.deserializeObjectTextNode421();
        org.jsoup.nodes.TextNode textNode7 = serializedObjectSupporter0.deserializeObjectTextNode251();
        java.lang.StringBuilder stringBuilder8 = serializedObjectSupporter0.deserializeObjectStringBuilder232();
        java.lang.String str9 = serializedObjectSupporter0.deserializeObjectString100();
        java.lang.StringBuilder stringBuilder10 = serializedObjectSupporter0.deserializeObjectStringBuilder186();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Document document11 = serializedObjectSupporter0.deserializeObjectDocument36();
// flaky:             org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: org.jsoup.nodes.Document$OutputSettings cannot be cast to org.jsoup.nodes.Document");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "More" + "'", str1, "More");
// flaky:         org.junit.Assert.assertNotNull(textNode2);
        org.junit.Assert.assertNotNull(stringBuilder3);
        org.junit.Assert.assertEquals(stringBuilder3.toString(), "<div id=\"1\"></div>\n<div id=\"2\">\n Text \n <p>One</p>");
        org.junit.Assert.assertNotNull(stringBuilder4);
        org.junit.Assert.assertEquals(stringBuilder4.toString(), "<doc>\n <val>");
// flaky:         org.junit.Assert.assertNotNull(textNode5);
// flaky:         org.junit.Assert.assertNotNull(textNode6);
// flaky:         org.junit.Assert.assertNotNull(textNode7);
        org.junit.Assert.assertNotNull(stringBuilder8);
        org.junit.Assert.assertEquals(stringBuilder8.toString(), "<p><a rel=\"nofollow\">Dodgy</a> <a href=\"http://nice.com\" rel=\"nofollow\">Nice</a></p>\n<blockquote>");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "5" + "'", str9, "5");
        org.junit.Assert.assertNotNull(stringBuilder10);
        org.junit.Assert.assertEquals(stringBuilder10.toString(), "<div>\n One Two \n <b>");
    }

    @Test
    public void test218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test218");
        org.jsoup.nodes.SerializedObjectSupporter serializedObjectSupporter0 = new org.jsoup.nodes.SerializedObjectSupporter();
        java.lang.String str1 = serializedObjectSupporter0.deserializeObjectString93();
        java.lang.StringBuilder stringBuilder2 = serializedObjectSupporter0.deserializeObjectStringBuilder215();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString128();
        java.lang.StringBuilder stringBuilder4 = serializedObjectSupporter0.deserializeObjectStringBuilder419();
        java.lang.String str5 = serializedObjectSupporter0.deserializeObjectString34();
        org.jsoup.nodes.TextNode textNode6 = serializedObjectSupporter0.deserializeObjectTextNode168();
        java.lang.String str7 = serializedObjectSupporter0.deserializeObjectString85();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "More" + "'", str1, "More");
        org.junit.Assert.assertNotNull(stringBuilder2);
        org.junit.Assert.assertEquals(stringBuilder2.toString(), "<div id=\"1\">");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + " 12.3% " + "'", str3, " 12.3% ");
        org.junit.Assert.assertNotNull(stringBuilder4);
        org.junit.Assert.assertEquals(stringBuilder4.toString(), "<p><b>One</b></p>\n<b>");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "< > & \" ' \327" + "'", str5, "< > & \" ' \327");
// flaky:         org.junit.Assert.assertNotNull(textNode6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Term" + "'", str7, "Term");
    }

    @Test
    public void test219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test219");
        org.jsoup.nodes.SerializedObjectSupporter serializedObjectSupporter0 = new org.jsoup.nodes.SerializedObjectSupporter();
        java.lang.String str1 = serializedObjectSupporter0.deserializeObjectString93();
        java.lang.StringBuilder stringBuilder2 = serializedObjectSupporter0.deserializeObjectStringBuilder36();
        org.jsoup.nodes.TextNode textNode3 = serializedObjectSupporter0.deserializeObjectTextNode102();
        org.jsoup.nodes.TextNode textNode4 = serializedObjectSupporter0.deserializeObjectTextNode270();
        java.lang.String str5 = serializedObjectSupporter0.deserializeObjectString22();
        java.lang.StringBuilder stringBuilder6 = serializedObjectSupporter0.deserializeObjectStringBuilder146();
        org.jsoup.nodes.TextNode textNode7 = serializedObjectSupporter0.deserializeObjectTextNode238();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Document document8 = serializedObjectSupporter0.deserializeObjectDocument77();
// flaky:             org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: org.jsoup.nodes.Document$OutputSettings cannot be cast to org.jsoup.nodes.Document");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "More" + "'", str1, "More");
        org.junit.Assert.assertNotNull(stringBuilder2);
        org.junit.Assert.assertEquals(stringBuilder2.toString(), "<div>\n <p><b>This</b> is <b>jsoup</b>.</p>\n</div>");
// flaky:         org.junit.Assert.assertNotNull(textNode3);
// flaky:         org.junit.Assert.assertNotNull(textNode4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Four" + "'", str5, "Four");
        org.junit.Assert.assertNotNull(stringBuilder6);
        org.junit.Assert.assertEquals(stringBuilder6.toString(), "<div id=\"1\">\n Text \n <p>");
// flaky:         org.junit.Assert.assertNotNull(textNode7);
    }

    @Test
    public void test220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test220");
        org.jsoup.nodes.SerializedObjectSupporter serializedObjectSupporter0 = new org.jsoup.nodes.SerializedObjectSupporter();
        java.lang.String str1 = serializedObjectSupporter0.deserializeObjectString93();
        java.lang.StringBuilder stringBuilder2 = serializedObjectSupporter0.deserializeObjectStringBuilder36();
        org.jsoup.nodes.TextNode textNode3 = serializedObjectSupporter0.deserializeObjectTextNode137();
        org.jsoup.nodes.TextNode textNode4 = serializedObjectSupporter0.deserializeObjectTextNode289();
        java.lang.StringBuilder stringBuilder5 = serializedObjectSupporter0.deserializeObjectStringBuilder86();
        org.jsoup.nodes.TextNode textNode6 = serializedObjectSupporter0.deserializeObjectTextNode359();
        org.jsoup.nodes.TextNode textNode7 = serializedObjectSupporter0.deserializeObjectTextNode29();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "More" + "'", str1, "More");
        org.junit.Assert.assertNotNull(stringBuilder2);
        org.junit.Assert.assertEquals(stringBuilder2.toString(), "<div>\n <p><b>This</b> is <b>jsoup</b>.</p>\n</div>");
// flaky:         org.junit.Assert.assertNotNull(textNode3);
// flaky:         org.junit.Assert.assertNotNull(textNode4);
        org.junit.Assert.assertNotNull(stringBuilder5);
        org.junit.Assert.assertEquals(stringBuilder5.toString(), "<div>\n <div>\n  one\n </div>\n <div>\n  two\n </div>\n <p>Hello</p>\n <p>Three</p>\n <!-- four -->\n <p>");
// flaky:         org.junit.Assert.assertNotNull(textNode6);
// flaky:         org.junit.Assert.assertNotNull(textNode7);
    }

    @Test
    public void test221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test221");
        org.jsoup.nodes.SerializedObjectSupporter serializedObjectSupporter0 = new org.jsoup.nodes.SerializedObjectSupporter();
        java.lang.String str1 = serializedObjectSupporter0.deserializeObjectString93();
        org.jsoup.nodes.TextNode textNode2 = serializedObjectSupporter0.deserializeObjectTextNode214();
        java.lang.StringBuilder stringBuilder3 = serializedObjectSupporter0.deserializeObjectStringBuilder143();
        java.lang.StringBuilder stringBuilder4 = serializedObjectSupporter0.deserializeObjectStringBuilder261();
        org.jsoup.nodes.TextNode textNode5 = serializedObjectSupporter0.deserializeObjectTextNode255();
        org.jsoup.nodes.TextNode textNode6 = serializedObjectSupporter0.deserializeObjectTextNode421();
        org.jsoup.nodes.TextNode textNode7 = serializedObjectSupporter0.deserializeObjectTextNode251();
        java.lang.String str8 = serializedObjectSupporter0.deserializeObjectString75();
        java.lang.String str9 = serializedObjectSupporter0.deserializeObjectString48();
        java.lang.String str10 = serializedObjectSupporter0.deserializeObjectString24();
        java.lang.String str11 = serializedObjectSupporter0.deserializeObjectString3();
        org.jsoup.nodes.TextNode textNode12 = serializedObjectSupporter0.deserializeObjectTextNode391();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "More" + "'", str1, "More");
// flaky:         org.junit.Assert.assertNotNull(textNode2);
        org.junit.Assert.assertNotNull(stringBuilder3);
        org.junit.Assert.assertEquals(stringBuilder3.toString(), "<div id=\"1\"></div>\n<div id=\"2\">\n Text \n <p>One</p>");
        org.junit.Assert.assertNotNull(stringBuilder4);
        org.junit.Assert.assertEquals(stringBuilder4.toString(), "<doc>\n <val>");
// flaky:         org.junit.Assert.assertNotNull(textNode5);
// flaky:         org.junit.Assert.assertNotNull(textNode6);
// flaky:         org.junit.Assert.assertNotNull(textNode7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Nice" + "'", str8, "Nice");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Check" + "'", str9, "Check");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Six" + "'", str10, "Six");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "This" + "'", str11, "This");
// flaky:         org.junit.Assert.assertNotNull(textNode12);
    }

    @Test
    public void test222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test222");
        org.jsoup.nodes.SerializedObjectSupporter serializedObjectSupporter0 = new org.jsoup.nodes.SerializedObjectSupporter();
        org.jsoup.nodes.TextNode textNode1 = serializedObjectSupporter0.deserializeObjectTextNode401();
        java.lang.StringBuilder stringBuilder2 = serializedObjectSupporter0.deserializeObjectStringBuilder60();
        java.lang.StringBuilder stringBuilder3 = serializedObjectSupporter0.deserializeObjectStringBuilder114();
        java.lang.StringBuilder stringBuilder4 = serializedObjectSupporter0.deserializeObjectStringBuilder421();
        org.jsoup.nodes.TextNode textNode5 = serializedObjectSupporter0.deserializeObjectTextNode168();
        org.jsoup.nodes.Document document6 = null; // flaky: textNode5.ownerDocument();
        java.util.List<org.jsoup.nodes.Node> nodeList7 = null; // flaky: textNode5.childNodes();
// flaky:         org.junit.Assert.assertNotNull(textNode1);
        org.junit.Assert.assertNotNull(stringBuilder2);
        org.junit.Assert.assertEquals(stringBuilder2.toString(), "<html>\n <head>\n  <script>one</script>\n  <noscript></noscript>\n </head>\n <body>\n  <p>");
        org.junit.Assert.assertNotNull(stringBuilder3);
        org.junit.Assert.assertEquals(stringBuilder3.toString(), "\nthere &amp; now &gt; \n<p>");
        org.junit.Assert.assertNotNull(stringBuilder4);
        org.junit.Assert.assertEquals(stringBuilder4.toString(), "<p><b>One</b></p>\n<b> \n <table>\n  <tbody>\n   <tr>\n    <td><p><i>Three</i></p><p><i>");
// flaky:         org.junit.Assert.assertNotNull(textNode5);
// flaky:         org.junit.Assert.assertNotNull(document6);
// flaky:         org.junit.Assert.assertNotNull(nodeList7);
    }

    @Test
    public void test223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test223");
        org.jsoup.nodes.SerializedObjectSupporter serializedObjectSupporter0 = new org.jsoup.nodes.SerializedObjectSupporter();
        java.lang.String str1 = serializedObjectSupporter0.deserializeObjectString93();
        java.lang.StringBuilder stringBuilder2 = serializedObjectSupporter0.deserializeObjectStringBuilder36();
        org.jsoup.nodes.TextNode textNode3 = serializedObjectSupporter0.deserializeObjectTextNode137();
        org.jsoup.nodes.TextNode textNode4 = serializedObjectSupporter0.deserializeObjectTextNode289();
        java.lang.StringBuilder stringBuilder5 = serializedObjectSupporter0.deserializeObjectStringBuilder23();
        org.jsoup.nodes.TextNode textNode6 = serializedObjectSupporter0.deserializeObjectTextNode278();
        org.jsoup.nodes.TextNode textNode7 = serializedObjectSupporter0.deserializeObjectTextNode95();
        java.lang.StringBuilder stringBuilder8 = serializedObjectSupporter0.deserializeObjectStringBuilder36();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Document document9 = serializedObjectSupporter0.deserializeObjectDocument420();
// flaky:             org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: org.jsoup.nodes.Document$OutputSettings cannot be cast to org.jsoup.nodes.Document");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "More" + "'", str1, "More");
        org.junit.Assert.assertNotNull(stringBuilder2);
        org.junit.Assert.assertEquals(stringBuilder2.toString(), "<div>\n <p><b>This</b> is <b>jsoup</b>.</p>\n</div>");
// flaky:         org.junit.Assert.assertNotNull(textNode3);
// flaky:         org.junit.Assert.assertNotNull(textNode4);
        org.junit.Assert.assertNotNull(stringBuilder5);
        org.junit.Assert.assertEquals(stringBuilder5.toString(), "<p>This <a>is</a><span>foo</span> <a>jsoup</a><span>foo</span>");
// flaky:         org.junit.Assert.assertNotNull(textNode6);
// flaky:         org.junit.Assert.assertNotNull(textNode7);
        org.junit.Assert.assertNotNull(stringBuilder8);
        org.junit.Assert.assertEquals(stringBuilder8.toString(), "<div>\n <p><b>This</b> is <b>jsoup</b>.</p>\n</div>");
    }

    @Test
    public void test224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test224");
        org.jsoup.nodes.SerializedObjectSupporter serializedObjectSupporter0 = new org.jsoup.nodes.SerializedObjectSupporter();
        java.lang.String str1 = serializedObjectSupporter0.deserializeObjectString98();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Document document2 = serializedObjectSupporter0.deserializeObjectDocument316();
// flaky:             org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: org.jsoup.nodes.Document$OutputSettings cannot be cast to org.jsoup.nodes.Document");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "3" + "'", str1, "3");
    }

    @Test
    public void test225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test225");
        org.jsoup.nodes.SerializedObjectSupporter serializedObjectSupporter0 = new org.jsoup.nodes.SerializedObjectSupporter();
        java.lang.String str1 = serializedObjectSupporter0.deserializeObjectString93();
        java.lang.StringBuilder stringBuilder2 = serializedObjectSupporter0.deserializeObjectStringBuilder36();
        org.jsoup.nodes.TextNode textNode3 = serializedObjectSupporter0.deserializeObjectTextNode137();
        org.jsoup.nodes.TextNode textNode4 = serializedObjectSupporter0.deserializeObjectTextNode289();
        java.lang.StringBuilder stringBuilder5 = serializedObjectSupporter0.deserializeObjectStringBuilder86();
        java.lang.StringBuilder stringBuilder6 = serializedObjectSupporter0.deserializeObjectStringBuilder149();
        org.jsoup.nodes.TextNode textNode7 = serializedObjectSupporter0.deserializeObjectTextNode242();
        java.lang.StringBuilder stringBuilder8 = serializedObjectSupporter0.deserializeObjectStringBuilder169();
        java.lang.StringBuilder stringBuilder9 = serializedObjectSupporter0.deserializeObjectStringBuilder381();
        java.lang.StringBuilder stringBuilder10 = serializedObjectSupporter0.deserializeObjectStringBuilder67();
        java.lang.StringBuilder stringBuilder11 = serializedObjectSupporter0.deserializeObjectStringBuilder216();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Document document12 = serializedObjectSupporter0.deserializeObjectDocument125();
// flaky:             org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: org.jsoup.nodes.Document$OutputSettings cannot be cast to org.jsoup.nodes.Document");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "More" + "'", str1, "More");
        org.junit.Assert.assertNotNull(stringBuilder2);
        org.junit.Assert.assertEquals(stringBuilder2.toString(), "<div>\n <p><b>This</b> is <b>jsoup</b>.</p>\n</div>");
// flaky:         org.junit.Assert.assertNotNull(textNode3);
// flaky:         org.junit.Assert.assertNotNull(textNode4);
        org.junit.Assert.assertNotNull(stringBuilder5);
        org.junit.Assert.assertEquals(stringBuilder5.toString(), "<div>\n <div>\n  one\n </div>\n <div>\n  two\n </div>\n <p>Hello</p>\n <p>Three</p>\n <!-- four -->\n <p>");
        org.junit.Assert.assertNotNull(stringBuilder6);
        org.junit.Assert.assertEquals(stringBuilder6.toString(), "<div id=\"1\">\n Text \n <p>One</p> Text \n <p>Two</p>\n</div>\n<div id=\"2\">\n <p>");
// flaky:         org.junit.Assert.assertNotNull(textNode7);
        org.junit.Assert.assertNotNull(stringBuilder8);
        org.junit.Assert.assertEquals(stringBuilder8.toString(), "<title>");
        org.junit.Assert.assertNotNull(stringBuilder9);
        org.junit.Assert.assertEquals(stringBuilder9.toString(), "<table> \n <colgroup> \n  <col />");
        org.junit.Assert.assertNotNull(stringBuilder10);
        org.junit.Assert.assertEquals(stringBuilder10.toString(), "<html>\n <head>\n  <title>Hello</title>");
        org.junit.Assert.assertNotNull(stringBuilder11);
        org.junit.Assert.assertEquals(stringBuilder11.toString(), "<div id=\"1\">\n Text 1 \n <p>");
    }

    @Test
    public void test226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test226");
        org.jsoup.nodes.SerializedObjectSupporter serializedObjectSupporter0 = new org.jsoup.nodes.SerializedObjectSupporter();
        org.jsoup.nodes.TextNode textNode1 = serializedObjectSupporter0.deserializeObjectTextNode401();
        java.lang.StringBuilder stringBuilder2 = serializedObjectSupporter0.deserializeObjectStringBuilder163();
        org.jsoup.nodes.TextNode textNode3 = serializedObjectSupporter0.deserializeObjectTextNode135();
        org.jsoup.nodes.TextNode textNode4 = serializedObjectSupporter0.deserializeObjectTextNode183();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Document document5 = serializedObjectSupporter0.deserializeObjectDocument232();
// flaky:             org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: org.jsoup.nodes.Document$OutputSettings cannot be cast to org.jsoup.nodes.Document");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
// flaky:         org.junit.Assert.assertNotNull(textNode1);
        org.junit.Assert.assertNotNull(stringBuilder2);
        org.junit.Assert.assertEquals(stringBuilder2.toString(), "<html>\n <head>\n  <title>Format test</title>\n </head>\n <body>\n  <div>\n   <p>\n    Hello \n    <span>\n     jsoup \n     <span>");
// flaky:         org.junit.Assert.assertNotNull(textNode3);
// flaky:         org.junit.Assert.assertNotNull(textNode4);
    }

    @Test
    public void test227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test227");
        org.jsoup.nodes.SerializedObjectSupporter serializedObjectSupporter0 = new org.jsoup.nodes.SerializedObjectSupporter();
        java.lang.String str1 = serializedObjectSupporter0.deserializeObjectString93();
        org.jsoup.nodes.TextNode textNode2 = serializedObjectSupporter0.deserializeObjectTextNode214();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString109();
        java.lang.StringBuilder stringBuilder4 = serializedObjectSupporter0.deserializeObjectStringBuilder430();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Document document5 = serializedObjectSupporter0.deserializeObjectDocument401();
// flaky:             org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: org.jsoup.nodes.Document$OutputSettings cannot be cast to org.jsoup.nodes.Document");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "More" + "'", str1, "More");
// flaky:         org.junit.Assert.assertNotNull(textNode2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "A caption" + "'", str3, "A caption");
        org.junit.Assert.assertNotNull(stringBuilder4);
        org.junit.Assert.assertEquals(stringBuilder4.toString(), "<textarea>");
    }

    @Test
    public void test228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test228");
        org.jsoup.nodes.Document.OutputSettings outputSettings0 = new org.jsoup.nodes.Document.OutputSettings();
        boolean boolean1 = outputSettings0.forceAllElementAsBlock();
        int int2 = outputSettings0.indentAmount();
        org.jsoup.nodes.Entities.EscapeMode escapeMode3 = outputSettings0.escapeMode();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
        org.junit.Assert.assertTrue("'" + escapeMode3 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode3.equals(org.jsoup.nodes.Entities.EscapeMode.base));
    }

    @Test
    public void test229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test229");
        org.jsoup.nodes.SerializedObjectSupporter serializedObjectSupporter0 = new org.jsoup.nodes.SerializedObjectSupporter();
        org.jsoup.nodes.TextNode textNode1 = serializedObjectSupporter0.deserializeObjectTextNode401();
        java.lang.StringBuilder stringBuilder2 = serializedObjectSupporter0.deserializeObjectStringBuilder60();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Document document3 = serializedObjectSupporter0.deserializeObjectDocument141();
// flaky:             org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: org.jsoup.nodes.Document$OutputSettings cannot be cast to org.jsoup.nodes.Document");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
// flaky:         org.junit.Assert.assertNotNull(textNode1);
        org.junit.Assert.assertNotNull(stringBuilder2);
        org.junit.Assert.assertEquals(stringBuilder2.toString(), "<html>\n <head>\n  <script>one</script>\n  <noscript></noscript>\n </head>\n <body>\n  <p>");
    }

    @Test
    public void test230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test230");
        org.jsoup.nodes.SerializedObjectSupporter serializedObjectSupporter0 = new org.jsoup.nodes.SerializedObjectSupporter();
        java.lang.String str1 = serializedObjectSupporter0.deserializeObjectString93();
        java.lang.StringBuilder stringBuilder2 = serializedObjectSupporter0.deserializeObjectStringBuilder36();
        org.jsoup.nodes.TextNode textNode3 = serializedObjectSupporter0.deserializeObjectTextNode137();
        org.jsoup.nodes.TextNode textNode4 = serializedObjectSupporter0.deserializeObjectTextNode289();
        java.lang.StringBuilder stringBuilder5 = serializedObjectSupporter0.deserializeObjectStringBuilder86();
        java.lang.StringBuilder stringBuilder6 = serializedObjectSupporter0.deserializeObjectStringBuilder166();
        org.jsoup.nodes.TextNode textNode7 = serializedObjectSupporter0.deserializeObjectTextNode281();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "More" + "'", str1, "More");
        org.junit.Assert.assertNotNull(stringBuilder2);
        org.junit.Assert.assertEquals(stringBuilder2.toString(), "<div>\n <p><b>This</b> is <b>jsoup</b>.</p>\n</div>");
// flaky:         org.junit.Assert.assertNotNull(textNode3);
// flaky:         org.junit.Assert.assertNotNull(textNode4);
        org.junit.Assert.assertNotNull(stringBuilder5);
        org.junit.Assert.assertEquals(stringBuilder5.toString(), "<div>\n <div>\n  one\n </div>\n <div>\n  two\n </div>\n <p>Hello</p>\n <p>Three</p>\n <!-- four -->\n <p>");
        org.junit.Assert.assertNotNull(stringBuilder6);
        org.junit.Assert.assertEquals(stringBuilder6.toString(), "<html><head></head><body><div>");
// flaky:         org.junit.Assert.assertNotNull(textNode7);
    }

    @Test
    public void test231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test231");
        org.jsoup.nodes.SerializedObjectSupporter serializedObjectSupporter0 = new org.jsoup.nodes.SerializedObjectSupporter();
        java.lang.String str1 = serializedObjectSupporter0.deserializeObjectString93();
        java.lang.StringBuilder stringBuilder2 = serializedObjectSupporter0.deserializeObjectStringBuilder215();
        org.jsoup.nodes.TextNode textNode3 = serializedObjectSupporter0.deserializeObjectTextNode204();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "More" + "'", str1, "More");
        org.junit.Assert.assertNotNull(stringBuilder2);
        org.junit.Assert.assertEquals(stringBuilder2.toString(), "<div id=\"1\">");
// flaky:         org.junit.Assert.assertNotNull(textNode3);
    }

    @Test
    public void test232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test232");
        org.jsoup.nodes.Document.OutputSettings outputSettings0 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Entities.EscapeMode escapeMode1 = null;
        outputSettings0.setescapeMode(escapeMode1);
        org.jsoup.nodes.Entities.EscapeMode escapeMode3 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings4 = outputSettings0.escapeMode(escapeMode3);
        java.nio.charset.Charset charset5 = outputSettings4.charset;
        org.junit.Assert.assertNotNull(outputSettings4);
        org.junit.Assert.assertNotNull(charset5);
    }

    @Test
    public void test233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test233");
        org.jsoup.nodes.SerializedObjectSupporter serializedObjectSupporter0 = new org.jsoup.nodes.SerializedObjectSupporter();
        org.jsoup.nodes.TextNode textNode1 = serializedObjectSupporter0.deserializeObjectTextNode401();
        org.jsoup.nodes.TextNode textNode2 = serializedObjectSupporter0.deserializeObjectTextNode376();
        org.jsoup.nodes.TextNode textNode3 = serializedObjectSupporter0.deserializeObjectTextNode145();
        java.lang.StringBuilder stringBuilder4 = serializedObjectSupporter0.deserializeObjectStringBuilder373();
        org.jsoup.nodes.TextNode textNode5 = serializedObjectSupporter0.deserializeObjectTextNode344();
        org.jsoup.nodes.TextNode textNode6 = serializedObjectSupporter0.deserializeObjectTextNode416();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Document document7 = serializedObjectSupporter0.deserializeObjectDocument102();
// flaky:             org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: org.jsoup.nodes.Document$OutputSettings cannot be cast to org.jsoup.nodes.Document");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
// flaky:         org.junit.Assert.assertNotNull(textNode1);
// flaky:         org.junit.Assert.assertNotNull(textNode2);
// flaky:         org.junit.Assert.assertNotNull(textNode3);
        org.junit.Assert.assertNotNull(stringBuilder4);
        org.junit.Assert.assertEquals(stringBuilder4.toString(), "");
// flaky:         org.junit.Assert.assertNotNull(textNode5);
// flaky:         org.junit.Assert.assertNotNull(textNode6);
    }

    @Test
    public void test234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test234");
        org.jsoup.nodes.SerializedObjectSupporter serializedObjectSupporter0 = new org.jsoup.nodes.SerializedObjectSupporter();
        org.jsoup.nodes.TextNode textNode1 = serializedObjectSupporter0.deserializeObjectTextNode401();
        java.lang.StringBuilder stringBuilder2 = serializedObjectSupporter0.deserializeObjectStringBuilder60();
        java.lang.StringBuilder stringBuilder3 = serializedObjectSupporter0.deserializeObjectStringBuilder114();
        java.lang.StringBuilder stringBuilder4 = serializedObjectSupporter0.deserializeObjectStringBuilder238();
        org.jsoup.nodes.TextNode textNode5 = serializedObjectSupporter0.deserializeObjectTextNode290();
        org.jsoup.nodes.TextNode textNode6 = serializedObjectSupporter0.deserializeObjectTextNode16();
        java.lang.String str7 = serializedObjectSupporter0.deserializeObjectString66();
// flaky:         org.junit.Assert.assertNotNull(textNode1);
        org.junit.Assert.assertNotNull(stringBuilder2);
        org.junit.Assert.assertEquals(stringBuilder2.toString(), "<html>\n <head>\n  <script>one</script>\n  <noscript></noscript>\n </head>\n <body>\n  <p>");
        org.junit.Assert.assertNotNull(stringBuilder3);
        org.junit.Assert.assertEquals(stringBuilder3.toString(), "\nthere &amp; now &gt; \n<p>");
        org.junit.Assert.assertNotNull(stringBuilder4);
        org.junit.Assert.assertEquals(stringBuilder4.toString(), "<img src=\"cid:12345\" />");
// flaky:         org.junit.Assert.assertNotNull(textNode5);
// flaky:         org.junit.Assert.assertNotNull(textNode6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + " Four" + "'", str7, " Four");
    }

    @Test
    public void test235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test235");
        org.jsoup.nodes.SerializedObjectSupporter serializedObjectSupporter0 = new org.jsoup.nodes.SerializedObjectSupporter();
        java.lang.String str1 = serializedObjectSupporter0.deserializeObjectString93();
        org.jsoup.nodes.TextNode textNode2 = serializedObjectSupporter0.deserializeObjectTextNode214();
        java.lang.StringBuilder stringBuilder3 = serializedObjectSupporter0.deserializeObjectStringBuilder143();
        java.lang.StringBuilder stringBuilder4 = serializedObjectSupporter0.deserializeObjectStringBuilder261();
        org.jsoup.nodes.TextNode textNode5 = serializedObjectSupporter0.deserializeObjectTextNode255();
        org.jsoup.nodes.TextNode textNode6 = serializedObjectSupporter0.deserializeObjectTextNode346();
        java.lang.StringBuilder stringBuilder7 = serializedObjectSupporter0.deserializeObjectStringBuilder78();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "More" + "'", str1, "More");
// flaky:         org.junit.Assert.assertNotNull(textNode2);
        org.junit.Assert.assertNotNull(stringBuilder3);
        org.junit.Assert.assertEquals(stringBuilder3.toString(), "<div id=\"1\"></div>\n<div id=\"2\">\n Text \n <p>One</p>");
        org.junit.Assert.assertNotNull(stringBuilder4);
        org.junit.Assert.assertEquals(stringBuilder4.toString(), "<doc>\n <val>");
// flaky:         org.junit.Assert.assertNotNull(textNode5);
// flaky:         org.junit.Assert.assertNotNull(textNode6);
        org.junit.Assert.assertNotNull(stringBuilder7);
        org.junit.Assert.assertEquals(stringBuilder7.toString(), "<div>\n <div>");
    }

    @Test
    public void test236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test236");
        org.jsoup.nodes.SerializedObjectSupporter serializedObjectSupporter0 = new org.jsoup.nodes.SerializedObjectSupporter();
        java.lang.String str1 = serializedObjectSupporter0.deserializeObjectString93();
        java.lang.StringBuilder stringBuilder2 = serializedObjectSupporter0.deserializeObjectStringBuilder36();
        org.jsoup.nodes.TextNode textNode3 = serializedObjectSupporter0.deserializeObjectTextNode137();
        java.lang.StringBuilder stringBuilder4 = serializedObjectSupporter0.deserializeObjectStringBuilder301();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "More" + "'", str1, "More");
        org.junit.Assert.assertNotNull(stringBuilder2);
        org.junit.Assert.assertEquals(stringBuilder2.toString(), "<div>\n <p><b>This</b> is <b>jsoup</b>.</p>\n</div>");
// flaky:         org.junit.Assert.assertNotNull(textNode3);
        org.junit.Assert.assertNotNull(stringBuilder4);
        org.junit.Assert.assertEquals(stringBuilder4.toString(), "<h1>Hello </h1>\n<h2>There \n <hgroup>\n  <h1>Another</h1>\n  <h2>headline</h2>\n </hgroup> \n <hgroup>\n  <h1>More</h1>\n  <p>");
    }

    @Test
    public void test237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test237");
        org.jsoup.nodes.Document.OutputSettings outputSettings0 = new org.jsoup.nodes.Document.OutputSettings();
        boolean boolean1 = outputSettings0.forceAllElementAsBlock();
        int int2 = outputSettings0.indentAmount();
        org.jsoup.nodes.Document.OutputSettings outputSettings3 = outputSettings0.clone();
        int int4 = outputSettings0.getindentAmount();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
        org.junit.Assert.assertNotNull(outputSettings3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
    }

    @Test
    public void test238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test238");
        org.jsoup.nodes.SerializedObjectSupporter serializedObjectSupporter0 = new org.jsoup.nodes.SerializedObjectSupporter();
        java.lang.String str1 = serializedObjectSupporter0.deserializeObjectString93();
        org.jsoup.nodes.TextNode textNode2 = serializedObjectSupporter0.deserializeObjectTextNode214();
        java.lang.StringBuilder stringBuilder3 = serializedObjectSupporter0.deserializeObjectStringBuilder143();
        java.lang.StringBuilder stringBuilder4 = serializedObjectSupporter0.deserializeObjectStringBuilder261();
        org.jsoup.nodes.TextNode textNode5 = serializedObjectSupporter0.deserializeObjectTextNode255();
        org.jsoup.nodes.TextNode textNode6 = serializedObjectSupporter0.deserializeObjectTextNode421();
        org.jsoup.nodes.TextNode textNode7 = serializedObjectSupporter0.deserializeObjectTextNode251();
        java.lang.String str8 = serializedObjectSupporter0.deserializeObjectString75();
        org.jsoup.nodes.TextNode textNode9 = serializedObjectSupporter0.deserializeObjectTextNode39();
        java.lang.String str10 = serializedObjectSupporter0.deserializeObjectString63();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "More" + "'", str1, "More");
// flaky:         org.junit.Assert.assertNotNull(textNode2);
        org.junit.Assert.assertNotNull(stringBuilder3);
        org.junit.Assert.assertEquals(stringBuilder3.toString(), "<div id=\"1\"></div>\n<div id=\"2\">\n Text \n <p>One</p>");
        org.junit.Assert.assertNotNull(stringBuilder4);
        org.junit.Assert.assertEquals(stringBuilder4.toString(), "<doc>\n <val>");
// flaky:         org.junit.Assert.assertNotNull(textNode5);
// flaky:         org.junit.Assert.assertNotNull(textNode6);
// flaky:         org.junit.Assert.assertNotNull(textNode7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Nice" + "'", str8, "Nice");
// flaky:         org.junit.Assert.assertNotNull(textNode9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "two &" + "'", str10, "two &");
    }

    @Test
    public void test239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test239");
        org.jsoup.nodes.SerializedObjectSupporter serializedObjectSupporter0 = new org.jsoup.nodes.SerializedObjectSupporter();
        java.lang.String str1 = serializedObjectSupporter0.deserializeObjectString93();
        org.jsoup.nodes.TextNode textNode2 = serializedObjectSupporter0.deserializeObjectTextNode214();
        org.jsoup.nodes.TextNode textNode3 = serializedObjectSupporter0.deserializeObjectTextNode79();
        org.jsoup.nodes.TextNode textNode4 = serializedObjectSupporter0.deserializeObjectTextNode169();
        org.jsoup.nodes.TextNode textNode5 = serializedObjectSupporter0.deserializeObjectTextNode80();
        java.lang.StringBuilder stringBuilder6 = serializedObjectSupporter0.deserializeObjectStringBuilder343();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "More" + "'", str1, "More");
// flaky:         org.junit.Assert.assertNotNull(textNode2);
// flaky:         org.junit.Assert.assertNotNull(textNode3);
// flaky:         org.junit.Assert.assertNotNull(textNode4);
// flaky:         org.junit.Assert.assertNotNull(textNode5);
        org.junit.Assert.assertNotNull(stringBuilder6);
        org.junit.Assert.assertEquals(stringBuilder6.toString(), "<p id=\"\ufffd\">");
    }

    @Test
    public void test240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test240");
        org.jsoup.nodes.SerializedObjectSupporter serializedObjectSupporter0 = new org.jsoup.nodes.SerializedObjectSupporter();
        java.lang.String str1 = serializedObjectSupporter0.deserializeObjectString93();
        org.jsoup.nodes.TextNode textNode2 = serializedObjectSupporter0.deserializeObjectTextNode214();
        java.lang.StringBuilder stringBuilder3 = serializedObjectSupporter0.deserializeObjectStringBuilder143();
        java.lang.StringBuilder stringBuilder4 = serializedObjectSupporter0.deserializeObjectStringBuilder261();
        org.jsoup.nodes.TextNode textNode5 = serializedObjectSupporter0.deserializeObjectTextNode255();
        org.jsoup.nodes.TextNode textNode6 = serializedObjectSupporter0.deserializeObjectTextNode421();
        org.jsoup.nodes.TextNode textNode7 = serializedObjectSupporter0.deserializeObjectTextNode251();
        java.lang.String str8 = serializedObjectSupporter0.deserializeObjectString75();
        org.jsoup.nodes.TextNode textNode9 = serializedObjectSupporter0.deserializeObjectTextNode255();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Document document10 = serializedObjectSupporter0.deserializeObjectDocument401();
// flaky:             org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: org.jsoup.nodes.Document$OutputSettings cannot be cast to org.jsoup.nodes.Document");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "More" + "'", str1, "More");
// flaky:         org.junit.Assert.assertNotNull(textNode2);
        org.junit.Assert.assertNotNull(stringBuilder3);
        org.junit.Assert.assertEquals(stringBuilder3.toString(), "<div id=\"1\"></div>\n<div id=\"2\">\n Text \n <p>One</p>");
        org.junit.Assert.assertNotNull(stringBuilder4);
        org.junit.Assert.assertEquals(stringBuilder4.toString(), "<doc>\n <val>");
// flaky:         org.junit.Assert.assertNotNull(textNode5);
// flaky:         org.junit.Assert.assertNotNull(textNode6);
// flaky:         org.junit.Assert.assertNotNull(textNode7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Nice" + "'", str8, "Nice");
// flaky:         org.junit.Assert.assertNotNull(textNode9);
    }

    @Test
    public void test241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test241");
        org.jsoup.nodes.SerializedObjectSupporter serializedObjectSupporter0 = new org.jsoup.nodes.SerializedObjectSupporter();
        org.jsoup.nodes.TextNode textNode1 = serializedObjectSupporter0.deserializeObjectTextNode401();
        org.jsoup.nodes.TextNode textNode2 = serializedObjectSupporter0.deserializeObjectTextNode376();
        org.jsoup.nodes.TextNode textNode3 = serializedObjectSupporter0.deserializeObjectTextNode145();
        java.lang.StringBuilder stringBuilder4 = serializedObjectSupporter0.deserializeObjectStringBuilder373();
        java.lang.StringBuilder stringBuilder5 = serializedObjectSupporter0.deserializeObjectStringBuilder379();
// flaky:         org.junit.Assert.assertNotNull(textNode1);
// flaky:         org.junit.Assert.assertNotNull(textNode2);
// flaky:         org.junit.Assert.assertNotNull(textNode3);
        org.junit.Assert.assertNotNull(stringBuilder4);
        org.junit.Assert.assertEquals(stringBuilder4.toString(), "");
        org.junit.Assert.assertNotNull(stringBuilder5);
        org.junit.Assert.assertEquals(stringBuilder5.toString(), "<table>");
    }

    @Test
    public void test242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test242");
        org.jsoup.nodes.SerializedObjectSupporter serializedObjectSupporter0 = new org.jsoup.nodes.SerializedObjectSupporter();
        java.lang.String str1 = serializedObjectSupporter0.deserializeObjectString93();
        org.jsoup.nodes.TextNode textNode2 = serializedObjectSupporter0.deserializeObjectTextNode214();
        java.lang.StringBuilder stringBuilder3 = serializedObjectSupporter0.deserializeObjectStringBuilder143();
        java.lang.StringBuilder stringBuilder4 = serializedObjectSupporter0.deserializeObjectStringBuilder261();
        org.jsoup.nodes.TextNode textNode5 = serializedObjectSupporter0.deserializeObjectTextNode255();
        org.jsoup.nodes.TextNode textNode6 = serializedObjectSupporter0.deserializeObjectTextNode421();
        org.jsoup.nodes.TextNode textNode7 = serializedObjectSupporter0.deserializeObjectTextNode251();
        java.lang.String str8 = serializedObjectSupporter0.deserializeObjectString75();
        java.lang.String str9 = serializedObjectSupporter0.deserializeObjectString48();
        java.lang.String str10 = serializedObjectSupporter0.deserializeObjectString24();
        java.lang.String str11 = serializedObjectSupporter0.deserializeObjectString3();
        java.lang.StringBuilder stringBuilder12 = serializedObjectSupporter0.deserializeObjectStringBuilder320();
        java.lang.StringBuilder stringBuilder13 = serializedObjectSupporter0.deserializeObjectStringBuilder64();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "More" + "'", str1, "More");
// flaky:         org.junit.Assert.assertNotNull(textNode2);
        org.junit.Assert.assertNotNull(stringBuilder3);
        org.junit.Assert.assertEquals(stringBuilder3.toString(), "<div id=\"1\"></div>\n<div id=\"2\">\n Text \n <p>One</p>");
        org.junit.Assert.assertNotNull(stringBuilder4);
        org.junit.Assert.assertEquals(stringBuilder4.toString(), "<doc>\n <val>");
// flaky:         org.junit.Assert.assertNotNull(textNode5);
// flaky:         org.junit.Assert.assertNotNull(textNode6);
// flaky:         org.junit.Assert.assertNotNull(textNode7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Nice" + "'", str8, "Nice");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Check" + "'", str9, "Check");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Six" + "'", str10, "Six");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "This" + "'", str11, "This");
        org.junit.Assert.assertNotNull(stringBuilder12);
        org.junit.Assert.assertEquals(stringBuilder12.toString(), "<font>Hello \n <div>\n  there\n </div> <span>");
        org.junit.Assert.assertNotNull(stringBuilder13);
        org.junit.Assert.assertEquals(stringBuilder13.toString(), "<p title=\"&#960;\">");
    }

    @Test
    public void test243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test243");
        org.jsoup.nodes.SerializedObjectSupporter serializedObjectSupporter0 = new org.jsoup.nodes.SerializedObjectSupporter();
        java.lang.String str1 = serializedObjectSupporter0.deserializeObjectString93();
        org.jsoup.nodes.TextNode textNode2 = serializedObjectSupporter0.deserializeObjectTextNode214();
        java.lang.StringBuilder stringBuilder3 = serializedObjectSupporter0.deserializeObjectStringBuilder143();
        java.lang.StringBuilder stringBuilder4 = serializedObjectSupporter0.deserializeObjectStringBuilder261();
        org.jsoup.nodes.TextNode textNode5 = serializedObjectSupporter0.deserializeObjectTextNode255();
        org.jsoup.nodes.TextNode textNode6 = serializedObjectSupporter0.deserializeObjectTextNode421();
        org.jsoup.nodes.TextNode textNode7 = serializedObjectSupporter0.deserializeObjectTextNode251();
        java.lang.StringBuilder stringBuilder8 = serializedObjectSupporter0.deserializeObjectStringBuilder232();
        java.lang.String str9 = serializedObjectSupporter0.deserializeObjectString100();
        java.lang.StringBuilder stringBuilder10 = serializedObjectSupporter0.deserializeObjectStringBuilder186();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Document document11 = serializedObjectSupporter0.deserializeObjectDocument384();
// flaky:             org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: org.jsoup.nodes.Document$OutputSettings cannot be cast to org.jsoup.nodes.Document");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "More" + "'", str1, "More");
// flaky:         org.junit.Assert.assertNotNull(textNode2);
        org.junit.Assert.assertNotNull(stringBuilder3);
        org.junit.Assert.assertEquals(stringBuilder3.toString(), "<div id=\"1\"></div>\n<div id=\"2\">\n Text \n <p>One</p>");
        org.junit.Assert.assertNotNull(stringBuilder4);
        org.junit.Assert.assertEquals(stringBuilder4.toString(), "<doc>\n <val>");
// flaky:         org.junit.Assert.assertNotNull(textNode5);
// flaky:         org.junit.Assert.assertNotNull(textNode6);
// flaky:         org.junit.Assert.assertNotNull(textNode7);
        org.junit.Assert.assertNotNull(stringBuilder8);
        org.junit.Assert.assertEquals(stringBuilder8.toString(), "<p><a rel=\"nofollow\">Dodgy</a> <a href=\"http://nice.com\" rel=\"nofollow\">Nice</a></p>\n<blockquote>");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "5" + "'", str9, "5");
        org.junit.Assert.assertNotNull(stringBuilder10);
        org.junit.Assert.assertEquals(stringBuilder10.toString(), "<div>\n One Two \n <b>");
    }

    @Test
    public void test244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test244");
        org.jsoup.nodes.SerializedObjectSupporter serializedObjectSupporter0 = new org.jsoup.nodes.SerializedObjectSupporter();
        java.lang.String str1 = serializedObjectSupporter0.deserializeObjectString93();
        org.jsoup.nodes.TextNode textNode2 = serializedObjectSupporter0.deserializeObjectTextNode214();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Document document3 = serializedObjectSupporter0.deserializeObjectDocument168();
// flaky:             org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: org.jsoup.nodes.Document$OutputSettings cannot be cast to org.jsoup.nodes.Document");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "More" + "'", str1, "More");
// flaky:         org.junit.Assert.assertNotNull(textNode2);
    }

    @Test
    public void test245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test245");
        org.jsoup.nodes.SerializedObjectSupporter serializedObjectSupporter0 = new org.jsoup.nodes.SerializedObjectSupporter();
        java.lang.String str1 = serializedObjectSupporter0.deserializeObjectString93();
        org.jsoup.nodes.TextNode textNode2 = serializedObjectSupporter0.deserializeObjectTextNode214();
        java.lang.StringBuilder stringBuilder3 = serializedObjectSupporter0.deserializeObjectStringBuilder143();
        java.lang.StringBuilder stringBuilder4 = serializedObjectSupporter0.deserializeObjectStringBuilder261();
        java.lang.String str5 = serializedObjectSupporter0.deserializeObjectString63();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Document document6 = serializedObjectSupporter0.deserializeObjectDocument133();
// flaky:             org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: org.jsoup.nodes.Document$OutputSettings cannot be cast to org.jsoup.nodes.Document");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "More" + "'", str1, "More");
// flaky:         org.junit.Assert.assertNotNull(textNode2);
        org.junit.Assert.assertNotNull(stringBuilder3);
        org.junit.Assert.assertEquals(stringBuilder3.toString(), "<div id=\"1\"></div>\n<div id=\"2\">\n Text \n <p>One</p>");
        org.junit.Assert.assertNotNull(stringBuilder4);
        org.junit.Assert.assertEquals(stringBuilder4.toString(), "<doc>\n <val>");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "two &" + "'", str5, "two &");
    }

    @Test
    public void test246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test246");
        org.jsoup.nodes.SerializedObjectSupporter serializedObjectSupporter0 = new org.jsoup.nodes.SerializedObjectSupporter();
        java.lang.String str1 = serializedObjectSupporter0.deserializeObjectString93();
        java.lang.StringBuilder stringBuilder2 = serializedObjectSupporter0.deserializeObjectStringBuilder267();
        java.lang.StringBuilder stringBuilder3 = serializedObjectSupporter0.deserializeObjectStringBuilder350();
        org.jsoup.nodes.TextNode textNode4 = serializedObjectSupporter0.deserializeObjectTextNode157();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "More" + "'", str1, "More");
        org.junit.Assert.assertNotNull(stringBuilder2);
        org.junit.Assert.assertEquals(stringBuilder2.toString(), "<doc>\n <val>");
        org.junit.Assert.assertNotNull(stringBuilder3);
        org.junit.Assert.assertEquals(stringBuilder3.toString(), "<table>\n <tbody>\n  <tr>\n   <td>");
// flaky:         org.junit.Assert.assertNotNull(textNode4);
    }

    @Test
    public void test247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test247");
        org.jsoup.nodes.SerializedObjectSupporter serializedObjectSupporter0 = new org.jsoup.nodes.SerializedObjectSupporter();
        java.lang.String str1 = serializedObjectSupporter0.deserializeObjectString93();
        java.lang.StringBuilder stringBuilder2 = serializedObjectSupporter0.deserializeObjectStringBuilder267();
        org.jsoup.nodes.TextNode textNode3 = serializedObjectSupporter0.deserializeObjectTextNode102();
        org.jsoup.nodes.TextNode textNode4 = serializedObjectSupporter0.deserializeObjectTextNode231();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "More" + "'", str1, "More");
        org.junit.Assert.assertNotNull(stringBuilder2);
        org.junit.Assert.assertEquals(stringBuilder2.toString(), "<doc>\n <val>");
// flaky:         org.junit.Assert.assertNotNull(textNode3);
// flaky:         org.junit.Assert.assertNotNull(textNode4);
    }

    @Test
    public void test248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test248");
        org.jsoup.nodes.SerializedObjectSupporter serializedObjectSupporter0 = new org.jsoup.nodes.SerializedObjectSupporter();
        java.lang.String str1 = serializedObjectSupporter0.deserializeObjectString93();
        org.jsoup.nodes.TextNode textNode2 = serializedObjectSupporter0.deserializeObjectTextNode214();
        java.lang.StringBuilder stringBuilder3 = serializedObjectSupporter0.deserializeObjectStringBuilder143();
        java.lang.StringBuilder stringBuilder4 = serializedObjectSupporter0.deserializeObjectStringBuilder261();
        org.jsoup.nodes.TextNode textNode5 = serializedObjectSupporter0.deserializeObjectTextNode255();
        org.jsoup.nodes.TextNode textNode6 = serializedObjectSupporter0.deserializeObjectTextNode421();
        org.jsoup.nodes.TextNode textNode7 = serializedObjectSupporter0.deserializeObjectTextNode251();
        java.lang.String str8 = serializedObjectSupporter0.deserializeObjectString75();
        java.lang.String str9 = serializedObjectSupporter0.deserializeObjectString48();
        java.lang.String str10 = serializedObjectSupporter0.deserializeObjectString24();
        java.lang.String str11 = serializedObjectSupporter0.deserializeObjectString3();
        java.lang.StringBuilder stringBuilder12 = serializedObjectSupporter0.deserializeObjectStringBuilder183();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "More" + "'", str1, "More");
// flaky:         org.junit.Assert.assertNotNull(textNode2);
        org.junit.Assert.assertNotNull(stringBuilder3);
        org.junit.Assert.assertEquals(stringBuilder3.toString(), "<div id=\"1\"></div>\n<div id=\"2\">\n Text \n <p>One</p>");
        org.junit.Assert.assertNotNull(stringBuilder4);
        org.junit.Assert.assertEquals(stringBuilder4.toString(), "<doc>\n <val>");
// flaky:         org.junit.Assert.assertNotNull(textNode5);
// flaky:         org.junit.Assert.assertNotNull(textNode6);
// flaky:         org.junit.Assert.assertNotNull(textNode7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Nice" + "'", str8, "Nice");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Check" + "'", str9, "Check");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Six" + "'", str10, "Six");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "This" + "'", str11, "This");
        org.junit.Assert.assertNotNull(stringBuilder12);
        org.junit.Assert.assertEquals(stringBuilder12.toString(), "One <span>two &amp;</span>");
    }

    @Test
    public void test249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test249");
        org.jsoup.nodes.SerializedObjectSupporter serializedObjectSupporter0 = new org.jsoup.nodes.SerializedObjectSupporter();
        java.lang.String str1 = serializedObjectSupporter0.deserializeObjectString93();
        java.lang.StringBuilder stringBuilder2 = serializedObjectSupporter0.deserializeObjectStringBuilder36();
        org.jsoup.nodes.TextNode textNode3 = serializedObjectSupporter0.deserializeObjectTextNode102();
        java.lang.StringBuilder stringBuilder4 = serializedObjectSupporter0.deserializeObjectStringBuilder101();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Document document5 = serializedObjectSupporter0.deserializeObjectDocument220();
// flaky:             org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: org.jsoup.nodes.Document$OutputSettings cannot be cast to org.jsoup.nodes.Document");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "More" + "'", str1, "More");
        org.junit.Assert.assertNotNull(stringBuilder2);
        org.junit.Assert.assertEquals(stringBuilder2.toString(), "<div>\n <p><b>This</b> is <b>jsoup</b>.</p>\n</div>");
// flaky:         org.junit.Assert.assertNotNull(textNode3);
        org.junit.Assert.assertNotNull(stringBuilder4);
        org.junit.Assert.assertEquals(stringBuilder4.toString(), "<div>\n <p>One</p>\n <p><span>");
    }

    @Test
    public void test250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test250");
        org.jsoup.nodes.SerializedObjectSupporter serializedObjectSupporter0 = new org.jsoup.nodes.SerializedObjectSupporter();
        java.lang.String str1 = serializedObjectSupporter0.deserializeObjectString93();
        java.lang.StringBuilder stringBuilder2 = serializedObjectSupporter0.deserializeObjectStringBuilder267();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Document document3 = serializedObjectSupporter0.deserializeObjectDocument54();
// flaky:             org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: org.jsoup.nodes.Document$OutputSettings cannot be cast to org.jsoup.nodes.Document");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "More" + "'", str1, "More");
        org.junit.Assert.assertNotNull(stringBuilder2);
        org.junit.Assert.assertEquals(stringBuilder2.toString(), "<doc>\n <val>");
    }

    @Test
    public void test251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test251");
        org.jsoup.nodes.SerializedObjectSupporter serializedObjectSupporter0 = new org.jsoup.nodes.SerializedObjectSupporter();
        java.lang.String str1 = serializedObjectSupporter0.deserializeObjectString93();
        org.jsoup.nodes.TextNode textNode2 = serializedObjectSupporter0.deserializeObjectTextNode214();
        java.lang.StringBuilder stringBuilder3 = serializedObjectSupporter0.deserializeObjectStringBuilder143();
        java.lang.StringBuilder stringBuilder4 = serializedObjectSupporter0.deserializeObjectStringBuilder261();
        org.jsoup.nodes.TextNode textNode5 = serializedObjectSupporter0.deserializeObjectTextNode255();
        org.jsoup.nodes.TextNode textNode6 = serializedObjectSupporter0.deserializeObjectTextNode421();
        org.jsoup.nodes.TextNode textNode7 = serializedObjectSupporter0.deserializeObjectTextNode251();
        java.lang.String str8 = serializedObjectSupporter0.deserializeObjectString75();
        org.jsoup.nodes.TextNode textNode9 = serializedObjectSupporter0.deserializeObjectTextNode255();
        java.lang.StringBuilder stringBuilder10 = serializedObjectSupporter0.deserializeObjectStringBuilder123();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Document document11 = serializedObjectSupporter0.deserializeObjectDocument362();
// flaky:             org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: org.jsoup.nodes.Document$OutputSettings cannot be cast to org.jsoup.nodes.Document");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "More" + "'", str1, "More");
// flaky:         org.junit.Assert.assertNotNull(textNode2);
        org.junit.Assert.assertNotNull(stringBuilder3);
        org.junit.Assert.assertEquals(stringBuilder3.toString(), "<div id=\"1\"></div>\n<div id=\"2\">\n Text \n <p>One</p>");
        org.junit.Assert.assertNotNull(stringBuilder4);
        org.junit.Assert.assertEquals(stringBuilder4.toString(), "<doc>\n <val>");
// flaky:         org.junit.Assert.assertNotNull(textNode5);
// flaky:         org.junit.Assert.assertNotNull(textNode6);
// flaky:         org.junit.Assert.assertNotNull(textNode7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Nice" + "'", str8, "Nice");
// flaky:         org.junit.Assert.assertNotNull(textNode9);
        org.junit.Assert.assertNotNull(stringBuilder10);
        org.junit.Assert.assertEquals(stringBuilder10.toString(), "<div>\n <div class=\"head\">\n  <p>");
    }

    @Test
    public void test252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test252");
        org.jsoup.nodes.Document.OutputSettings outputSettings0 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Entities.EscapeMode escapeMode1 = null;
        outputSettings0.setescapeMode(escapeMode1);
        java.nio.charset.Charset charset3 = null;
        outputSettings0.setcharset(charset3);
        int int5 = outputSettings0.indentAmount;
        java.nio.charset.CharsetEncoder charsetEncoder6 = outputSettings0.getcharsetEncoder();
        org.jsoup.nodes.Entities.EscapeMode escapeMode7 = outputSettings0.getescapeMode();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertNotNull(charsetEncoder6);
        org.junit.Assert.assertNull(escapeMode7);
    }

    @Test
    public void test253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test253");
        org.jsoup.nodes.Document.OutputSettings outputSettings0 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Entities.EscapeMode escapeMode1 = null;
        outputSettings0.setescapeMode(escapeMode1);
        org.jsoup.nodes.Entities.EscapeMode escapeMode3 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings4 = outputSettings0.escapeMode(escapeMode3);
        java.nio.charset.CharsetEncoder charsetEncoder5 = null;
        outputSettings4.charsetEncoder = charsetEncoder5;
        outputSettings4.prettyPrint = false;
        org.junit.Assert.assertNotNull(outputSettings4);
    }

    @Test
    public void test254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test254");
        org.jsoup.nodes.Document.OutputSettings outputSettings0 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Entities.EscapeMode escapeMode1 = null;
        outputSettings0.setescapeMode(escapeMode1);
        org.jsoup.nodes.Entities.EscapeMode escapeMode3 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings4 = outputSettings0.escapeMode(escapeMode3);
        org.jsoup.nodes.Entities.EscapeMode escapeMode5 = outputSettings0.escapeMode;
        java.nio.charset.Charset charset6 = outputSettings0.getcharset();
        org.jsoup.nodes.Entities.EscapeMode escapeMode7 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings8 = outputSettings0.escapeMode(escapeMode7);
        org.jsoup.nodes.Entities.EscapeMode escapeMode9 = outputSettings0.escapeMode();
        org.junit.Assert.assertNotNull(outputSettings4);
        org.junit.Assert.assertNull(escapeMode5);
        org.junit.Assert.assertNotNull(charset6);
        org.junit.Assert.assertNotNull(outputSettings8);
        org.junit.Assert.assertNull(escapeMode9);
    }

    @Test
    public void test255() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test255");
        org.jsoup.nodes.SerializedObjectSupporter serializedObjectSupporter0 = new org.jsoup.nodes.SerializedObjectSupporter();
        java.lang.String str1 = serializedObjectSupporter0.deserializeObjectString93();
        org.jsoup.nodes.TextNode textNode2 = serializedObjectSupporter0.deserializeObjectTextNode214();
        java.lang.StringBuilder stringBuilder3 = serializedObjectSupporter0.deserializeObjectStringBuilder143();
        java.lang.StringBuilder stringBuilder4 = serializedObjectSupporter0.deserializeObjectStringBuilder261();
        java.lang.StringBuilder stringBuilder5 = serializedObjectSupporter0.deserializeObjectStringBuilder423();
        java.lang.StringBuilder stringBuilder6 = serializedObjectSupporter0.deserializeObjectStringBuilder19();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "More" + "'", str1, "More");
// flaky:         org.junit.Assert.assertNotNull(textNode2);
        org.junit.Assert.assertNotNull(stringBuilder3);
        org.junit.Assert.assertEquals(stringBuilder3.toString(), "<div id=\"1\"></div>\n<div id=\"2\">\n Text \n <p>One</p>");
        org.junit.Assert.assertNotNull(stringBuilder4);
        org.junit.Assert.assertEquals(stringBuilder4.toString(), "<doc>\n <val>");
        org.junit.Assert.assertNotNull(stringBuilder5);
        org.junit.Assert.assertEquals(stringBuilder5.toString(), "<p><b>One</b></p>\n<b> \n <table>\n  <tbody>\n   <tr>\n    <td><p><i>Three</i></p><p><i>Four</i></p></td>\n   </tr>\n  </tbody>\n </table> <p>");
        org.junit.Assert.assertNotNull(stringBuilder6);
        org.junit.Assert.assertEquals(stringBuilder6.toString(), "<p>This <a>is</a><span>");
    }

    @Test
    public void test256() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test256");
        org.jsoup.nodes.SerializedObjectSupporter serializedObjectSupporter0 = new org.jsoup.nodes.SerializedObjectSupporter();
        java.lang.String str1 = serializedObjectSupporter0.deserializeObjectString93();
        java.lang.StringBuilder stringBuilder2 = serializedObjectSupporter0.deserializeObjectStringBuilder36();
        org.jsoup.nodes.TextNode textNode3 = serializedObjectSupporter0.deserializeObjectTextNode137();
        org.jsoup.nodes.TextNode textNode4 = serializedObjectSupporter0.deserializeObjectTextNode289();
        java.lang.StringBuilder stringBuilder5 = serializedObjectSupporter0.deserializeObjectStringBuilder86();
        java.lang.StringBuilder stringBuilder6 = serializedObjectSupporter0.deserializeObjectStringBuilder166();
        java.lang.StringBuilder stringBuilder7 = serializedObjectSupporter0.deserializeObjectStringBuilder347();
        org.jsoup.nodes.TextNode textNode8 = serializedObjectSupporter0.deserializeObjectTextNode213();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "More" + "'", str1, "More");
        org.junit.Assert.assertNotNull(stringBuilder2);
        org.junit.Assert.assertEquals(stringBuilder2.toString(), "<div>\n <p><b>This</b> is <b>jsoup</b>.</p>\n</div>");
// flaky:         org.junit.Assert.assertNotNull(textNode3);
// flaky:         org.junit.Assert.assertNotNull(textNode4);
        org.junit.Assert.assertNotNull(stringBuilder5);
        org.junit.Assert.assertEquals(stringBuilder5.toString(), "<div>\n <div>\n  one\n </div>\n <div>\n  two\n </div>\n <p>Hello</p>\n <p>Three</p>\n <!-- four -->\n <p>");
        org.junit.Assert.assertNotNull(stringBuilder6);
        org.junit.Assert.assertEquals(stringBuilder6.toString(), "<html><head></head><body><div>");
        org.junit.Assert.assertNotNull(stringBuilder7);
        org.junit.Assert.assertEquals(stringBuilder7.toString(), "<html>\n <head></head>\n <body>\n  pre \n  <script>inner</script>");
// flaky:         org.junit.Assert.assertNotNull(textNode8);
    }

    @Test
    public void test257() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test257");
        org.jsoup.nodes.SerializedObjectSupporter serializedObjectSupporter0 = new org.jsoup.nodes.SerializedObjectSupporter();
        java.lang.String str1 = serializedObjectSupporter0.deserializeObjectString93();
        org.jsoup.nodes.TextNode textNode2 = serializedObjectSupporter0.deserializeObjectTextNode214();
        org.jsoup.nodes.TextNode textNode3 = serializedObjectSupporter0.deserializeObjectTextNode79();
        java.lang.StringBuilder stringBuilder4 = serializedObjectSupporter0.deserializeObjectStringBuilder65();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "More" + "'", str1, "More");
// flaky:         org.junit.Assert.assertNotNull(textNode2);
// flaky:         org.junit.Assert.assertNotNull(textNode3);
        org.junit.Assert.assertNotNull(stringBuilder4);
        org.junit.Assert.assertEquals(stringBuilder4.toString(), "<p title=\"&pi;\">");
    }

    @Test
    public void test258() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test258");
        org.jsoup.nodes.Document.OutputSettings outputSettings0 = new org.jsoup.nodes.Document.OutputSettings();
        java.nio.charset.CharsetEncoder charsetEncoder1 = null;
        outputSettings0.setcharsetEncoder(charsetEncoder1);
        java.nio.charset.CharsetEncoder charsetEncoder3 = outputSettings0.charsetEncoder;
        org.jsoup.nodes.Document.OutputSettings outputSettings4 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Entities.EscapeMode escapeMode5 = null;
        outputSettings4.setescapeMode(escapeMode5);
        java.nio.charset.Charset charset7 = null;
        outputSettings4.setcharset(charset7);
        int int9 = outputSettings4.indentAmount;
        java.nio.charset.CharsetEncoder charsetEncoder10 = outputSettings4.getcharsetEncoder();
        outputSettings0.setcharsetEncoder(charsetEncoder10);
        org.junit.Assert.assertNull(charsetEncoder3);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertNotNull(charsetEncoder10);
    }

    @Test
    public void test259() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test259");
        org.jsoup.nodes.SerializedObjectSupporter serializedObjectSupporter0 = new org.jsoup.nodes.SerializedObjectSupporter();
        java.lang.String str1 = serializedObjectSupporter0.deserializeObjectString93();
        java.lang.StringBuilder stringBuilder2 = serializedObjectSupporter0.deserializeObjectStringBuilder36();
        java.lang.StringBuilder stringBuilder3 = serializedObjectSupporter0.deserializeObjectStringBuilder399();
        org.jsoup.nodes.TextNode textNode4 = serializedObjectSupporter0.deserializeObjectTextNode54();
        org.jsoup.nodes.TextNode textNode5 = serializedObjectSupporter0.deserializeObjectTextNode169();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "More" + "'", str1, "More");
        org.junit.Assert.assertNotNull(stringBuilder2);
        org.junit.Assert.assertEquals(stringBuilder2.toString(), "<div>\n <p><b>This</b> is <b>jsoup</b>.</p>\n</div>");
        org.junit.Assert.assertNotNull(stringBuilder3);
        org.junit.Assert.assertEquals(stringBuilder3.toString(), "<table> \n <colgroup> \n  <col /> \n </colgroup>\n <colgroup> \n  <col /> \n  <col /> \n  <col /> \n </colgroup>\n <thead> \n  <tr> \n   <th> </th>\n   <th>2008 </th>\n   <th>2007 </th>\n   <th>2006 </th>\n  </tr>\n </thead>\n <tbody> \n  <tr> \n   <th scope=\"rowgroup\"> Research and development </th>\n   <td> $ 1,109 </td>\n   <td> $ 782 </td>\n   <td> $ 712 </td>\n  </tr>\n  <tr> \n   <th scope=\"row\">");
// flaky:         org.junit.Assert.assertNotNull(textNode4);
// flaky:         org.junit.Assert.assertNotNull(textNode5);
    }

    @Test
    public void test260() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test260");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode(" now", "4");
    }

    @Test
    public void test261() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test261");
        org.jsoup.nodes.SerializedObjectSupporter serializedObjectSupporter0 = new org.jsoup.nodes.SerializedObjectSupporter();
        java.lang.String str1 = serializedObjectSupporter0.deserializeObjectString93();
        org.jsoup.nodes.TextNode textNode2 = serializedObjectSupporter0.deserializeObjectTextNode214();
        java.lang.StringBuilder stringBuilder3 = serializedObjectSupporter0.deserializeObjectStringBuilder143();
        java.lang.StringBuilder stringBuilder4 = serializedObjectSupporter0.deserializeObjectStringBuilder261();
        java.lang.String str5 = serializedObjectSupporter0.deserializeObjectString63();
        java.lang.StringBuilder stringBuilder6 = serializedObjectSupporter0.deserializeObjectStringBuilder39();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "More" + "'", str1, "More");
// flaky:         org.junit.Assert.assertNotNull(textNode2);
        org.junit.Assert.assertNotNull(stringBuilder3);
        org.junit.Assert.assertEquals(stringBuilder3.toString(), "<div id=\"1\"></div>\n<div id=\"2\">\n Text \n <p>One</p>");
        org.junit.Assert.assertNotNull(stringBuilder4);
        org.junit.Assert.assertEquals(stringBuilder4.toString(), "<doc>\n <val>");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "two &" + "'", str5, "two &");
        org.junit.Assert.assertNotNull(stringBuilder6);
        org.junit.Assert.assertEquals(stringBuilder6.toString(), "<a>One</a>");
    }

    @Test
    public void test262() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test262");
        org.jsoup.nodes.SerializedObjectSupporter serializedObjectSupporter0 = new org.jsoup.nodes.SerializedObjectSupporter();
        java.lang.String str1 = serializedObjectSupporter0.deserializeObjectString93();
        org.jsoup.nodes.TextNode textNode2 = serializedObjectSupporter0.deserializeObjectTextNode214();
        java.lang.StringBuilder stringBuilder3 = serializedObjectSupporter0.deserializeObjectStringBuilder143();
        java.lang.StringBuilder stringBuilder4 = serializedObjectSupporter0.deserializeObjectStringBuilder261();
        org.jsoup.nodes.TextNode textNode5 = serializedObjectSupporter0.deserializeObjectTextNode255();
        org.jsoup.nodes.TextNode textNode6 = serializedObjectSupporter0.deserializeObjectTextNode421();
        org.jsoup.nodes.TextNode textNode7 = serializedObjectSupporter0.deserializeObjectTextNode251();
        java.lang.String str8 = serializedObjectSupporter0.deserializeObjectString75();
        java.lang.String str9 = serializedObjectSupporter0.deserializeObjectString48();
        java.lang.String str10 = serializedObjectSupporter0.deserializeObjectString24();
        java.lang.String str11 = serializedObjectSupporter0.deserializeObjectString3();
        java.lang.StringBuilder stringBuilder12 = serializedObjectSupporter0.deserializeObjectStringBuilder320();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Document document13 = serializedObjectSupporter0.deserializeObjectDocument416();
// flaky:             org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: org.jsoup.nodes.Document$OutputSettings cannot be cast to org.jsoup.nodes.Document");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "More" + "'", str1, "More");
// flaky:         org.junit.Assert.assertNotNull(textNode2);
        org.junit.Assert.assertNotNull(stringBuilder3);
        org.junit.Assert.assertEquals(stringBuilder3.toString(), "<div id=\"1\"></div>\n<div id=\"2\">\n Text \n <p>One</p>");
        org.junit.Assert.assertNotNull(stringBuilder4);
        org.junit.Assert.assertEquals(stringBuilder4.toString(), "<doc>\n <val>");
// flaky:         org.junit.Assert.assertNotNull(textNode5);
// flaky:         org.junit.Assert.assertNotNull(textNode6);
// flaky:         org.junit.Assert.assertNotNull(textNode7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Nice" + "'", str8, "Nice");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Check" + "'", str9, "Check");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Six" + "'", str10, "Six");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "This" + "'", str11, "This");
        org.junit.Assert.assertNotNull(stringBuilder12);
        org.junit.Assert.assertEquals(stringBuilder12.toString(), "<font>Hello \n <div>\n  there\n </div> <span>");
    }

    @Test
    public void test263() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test263");
        org.jsoup.nodes.SerializedObjectSupporter serializedObjectSupporter0 = new org.jsoup.nodes.SerializedObjectSupporter();
        org.jsoup.nodes.TextNode textNode1 = serializedObjectSupporter0.deserializeObjectTextNode401();
        java.lang.StringBuilder stringBuilder2 = serializedObjectSupporter0.deserializeObjectStringBuilder60();
        java.lang.StringBuilder stringBuilder3 = serializedObjectSupporter0.deserializeObjectStringBuilder114();
        java.lang.StringBuilder stringBuilder4 = serializedObjectSupporter0.deserializeObjectStringBuilder421();
        org.jsoup.nodes.TextNode textNode5 = serializedObjectSupporter0.deserializeObjectTextNode168();
        org.jsoup.nodes.TextNode textNode6 = serializedObjectSupporter0.deserializeObjectTextNode382();
// flaky:         org.junit.Assert.assertNotNull(textNode1);
        org.junit.Assert.assertNotNull(stringBuilder2);
        org.junit.Assert.assertEquals(stringBuilder2.toString(), "<html>\n <head>\n  <script>one</script>\n  <noscript></noscript>\n </head>\n <body>\n  <p>");
        org.junit.Assert.assertNotNull(stringBuilder3);
        org.junit.Assert.assertEquals(stringBuilder3.toString(), "\nthere &amp; now &gt; \n<p>");
        org.junit.Assert.assertNotNull(stringBuilder4);
        org.junit.Assert.assertEquals(stringBuilder4.toString(), "<p><b>One</b></p>\n<b> \n <table>\n  <tbody>\n   <tr>\n    <td><p><i>Three</i></p><p><i>");
// flaky:         org.junit.Assert.assertNotNull(textNode5);
// flaky:         org.junit.Assert.assertNotNull(textNode6);
    }

    @Test
    public void test264() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test264");
        org.jsoup.nodes.SerializedObjectSupporter serializedObjectSupporter0 = new org.jsoup.nodes.SerializedObjectSupporter();
        java.lang.String str1 = serializedObjectSupporter0.deserializeObjectString93();
        java.lang.StringBuilder stringBuilder2 = serializedObjectSupporter0.deserializeObjectStringBuilder36();
        org.jsoup.nodes.TextNode textNode3 = serializedObjectSupporter0.deserializeObjectTextNode137();
        org.jsoup.nodes.TextNode textNode4 = serializedObjectSupporter0.deserializeObjectTextNode289();
        java.lang.StringBuilder stringBuilder5 = serializedObjectSupporter0.deserializeObjectStringBuilder86();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Document document6 = serializedObjectSupporter0.deserializeObjectDocument370();
// flaky:             org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: org.jsoup.nodes.Document$OutputSettings cannot be cast to org.jsoup.nodes.Document");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "More" + "'", str1, "More");
        org.junit.Assert.assertNotNull(stringBuilder2);
        org.junit.Assert.assertEquals(stringBuilder2.toString(), "<div>\n <p><b>This</b> is <b>jsoup</b>.</p>\n</div>");
// flaky:         org.junit.Assert.assertNotNull(textNode3);
// flaky:         org.junit.Assert.assertNotNull(textNode4);
        org.junit.Assert.assertNotNull(stringBuilder5);
        org.junit.Assert.assertEquals(stringBuilder5.toString(), "<div>\n <div>\n  one\n </div>\n <div>\n  two\n </div>\n <p>Hello</p>\n <p>Three</p>\n <!-- four -->\n <p>");
    }

    @Test
    public void test265() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test265");
        org.jsoup.nodes.SerializedObjectSupporter serializedObjectSupporter0 = new org.jsoup.nodes.SerializedObjectSupporter();
        java.lang.String str1 = serializedObjectSupporter0.deserializeObjectString93();
        org.jsoup.nodes.TextNode textNode2 = serializedObjectSupporter0.deserializeObjectTextNode214();
        java.lang.StringBuilder stringBuilder3 = serializedObjectSupporter0.deserializeObjectStringBuilder143();
        java.lang.StringBuilder stringBuilder4 = serializedObjectSupporter0.deserializeObjectStringBuilder261();
        org.jsoup.nodes.TextNode textNode5 = serializedObjectSupporter0.deserializeObjectTextNode255();
        org.jsoup.nodes.TextNode textNode6 = serializedObjectSupporter0.deserializeObjectTextNode421();
        org.jsoup.nodes.TextNode textNode7 = serializedObjectSupporter0.deserializeObjectTextNode251();
        java.lang.StringBuilder stringBuilder8 = serializedObjectSupporter0.deserializeObjectStringBuilder232();
        java.lang.StringBuilder stringBuilder9 = serializedObjectSupporter0.deserializeObjectStringBuilder140();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "More" + "'", str1, "More");
// flaky:         org.junit.Assert.assertNotNull(textNode2);
        org.junit.Assert.assertNotNull(stringBuilder3);
        org.junit.Assert.assertEquals(stringBuilder3.toString(), "<div id=\"1\"></div>\n<div id=\"2\">\n Text \n <p>One</p>");
        org.junit.Assert.assertNotNull(stringBuilder4);
        org.junit.Assert.assertEquals(stringBuilder4.toString(), "<doc>\n <val>");
// flaky:         org.junit.Assert.assertNotNull(textNode5);
// flaky:         org.junit.Assert.assertNotNull(textNode6);
// flaky:         org.junit.Assert.assertNotNull(textNode7);
        org.junit.Assert.assertNotNull(stringBuilder8);
        org.junit.Assert.assertEquals(stringBuilder8.toString(), "<p><a rel=\"nofollow\">Dodgy</a> <a href=\"http://nice.com\" rel=\"nofollow\">Nice</a></p>\n<blockquote>");
        org.junit.Assert.assertNotNull(stringBuilder9);
        org.junit.Assert.assertEquals(stringBuilder9.toString(), "<p>");
    }

    @Test
    public void test266() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test266");
        org.jsoup.nodes.SerializedObjectSupporter serializedObjectSupporter0 = new org.jsoup.nodes.SerializedObjectSupporter();
        org.jsoup.nodes.TextNode textNode1 = serializedObjectSupporter0.deserializeObjectTextNode401();
        org.jsoup.nodes.TextNode textNode2 = serializedObjectSupporter0.deserializeObjectTextNode376();
        org.jsoup.nodes.TextNode textNode3 = serializedObjectSupporter0.deserializeObjectTextNode145();
        org.jsoup.nodes.TextNode textNode4 = serializedObjectSupporter0.deserializeObjectTextNode48();
// flaky:         org.junit.Assert.assertNotNull(textNode1);
// flaky:         org.junit.Assert.assertNotNull(textNode2);
// flaky:         org.junit.Assert.assertNotNull(textNode3);
// flaky:         org.junit.Assert.assertNotNull(textNode4);
    }

    @Test
    public void test267() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test267");
        org.jsoup.nodes.SerializedObjectSupporter serializedObjectSupporter0 = new org.jsoup.nodes.SerializedObjectSupporter();
        java.lang.String str1 = serializedObjectSupporter0.deserializeObjectString93();
        java.lang.StringBuilder stringBuilder2 = serializedObjectSupporter0.deserializeObjectStringBuilder215();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString128();
        java.lang.String str4 = serializedObjectSupporter0.deserializeObjectString29();
        org.jsoup.nodes.TextNode textNode5 = serializedObjectSupporter0.deserializeObjectTextNode10();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "More" + "'", str1, "More");
        org.junit.Assert.assertNotNull(stringBuilder2);
        org.junit.Assert.assertEquals(stringBuilder2.toString(), "<div id=\"1\">");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + " 12.3% " + "'", str3, " 12.3% ");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "The " + "'", str4, "The ");
// flaky:         org.junit.Assert.assertNotNull(textNode5);
    }

    @Test
    public void test268() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test268");
        org.jsoup.nodes.SerializedObjectSupporter serializedObjectSupporter0 = new org.jsoup.nodes.SerializedObjectSupporter();
        java.lang.String str1 = serializedObjectSupporter0.deserializeObjectString93();
        org.jsoup.nodes.TextNode textNode2 = serializedObjectSupporter0.deserializeObjectTextNode214();
        org.jsoup.nodes.TextNode textNode3 = serializedObjectSupporter0.deserializeObjectTextNode79();
        org.jsoup.nodes.TextNode textNode4 = serializedObjectSupporter0.deserializeObjectTextNode169();
        org.jsoup.nodes.TextNode textNode5 = serializedObjectSupporter0.deserializeObjectTextNode80();
        org.jsoup.nodes.TextNode textNode6 = serializedObjectSupporter0.deserializeObjectTextNode283();
        java.lang.String str7 = serializedObjectSupporter0.deserializeObjectString88();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "More" + "'", str1, "More");
// flaky:         org.junit.Assert.assertNotNull(textNode2);
// flaky:         org.junit.Assert.assertNotNull(textNode3);
// flaky:         org.junit.Assert.assertNotNull(textNode4);
// flaky:         org.junit.Assert.assertNotNull(textNode5);
// flaky:         org.junit.Assert.assertNotNull(textNode6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Six " + "'", str7, "Six ");
    }

    @Test
    public void test269() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test269");
        org.jsoup.nodes.SerializedObjectSupporter serializedObjectSupporter0 = new org.jsoup.nodes.SerializedObjectSupporter();
        java.lang.String str1 = serializedObjectSupporter0.deserializeObjectString93();
        org.jsoup.nodes.TextNode textNode2 = serializedObjectSupporter0.deserializeObjectTextNode214();
        java.lang.StringBuilder stringBuilder3 = serializedObjectSupporter0.deserializeObjectStringBuilder143();
        java.lang.StringBuilder stringBuilder4 = serializedObjectSupporter0.deserializeObjectStringBuilder261();
        org.jsoup.nodes.TextNode textNode5 = serializedObjectSupporter0.deserializeObjectTextNode255();
        org.jsoup.nodes.TextNode textNode6 = serializedObjectSupporter0.deserializeObjectTextNode421();
        org.jsoup.nodes.TextNode textNode7 = serializedObjectSupporter0.deserializeObjectTextNode251();
        java.lang.String str8 = serializedObjectSupporter0.deserializeObjectString75();
        org.jsoup.nodes.TextNode textNode9 = serializedObjectSupporter0.deserializeObjectTextNode39();
        java.lang.StringBuilder stringBuilder10 = serializedObjectSupporter0.deserializeObjectStringBuilder241();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "More" + "'", str1, "More");
// flaky:         org.junit.Assert.assertNotNull(textNode2);
        org.junit.Assert.assertNotNull(stringBuilder3);
        org.junit.Assert.assertEquals(stringBuilder3.toString(), "<div id=\"1\"></div>\n<div id=\"2\">\n Text \n <p>One</p>");
        org.junit.Assert.assertNotNull(stringBuilder4);
        org.junit.Assert.assertEquals(stringBuilder4.toString(), "<doc>\n <val>");
// flaky:         org.junit.Assert.assertNotNull(textNode5);
// flaky:         org.junit.Assert.assertNotNull(textNode6);
// flaky:         org.junit.Assert.assertNotNull(textNode7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Nice" + "'", str8, "Nice");
// flaky:         org.junit.Assert.assertNotNull(textNode9);
        org.junit.Assert.assertNotNull(stringBuilder10);
        org.junit.Assert.assertEquals(stringBuilder10.toString(), "<div><p>");
    }

    @Test
    public void test270() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test270");
        org.jsoup.nodes.SerializedObjectSupporter serializedObjectSupporter0 = new org.jsoup.nodes.SerializedObjectSupporter();
        java.lang.String str1 = serializedObjectSupporter0.deserializeObjectString93();
        org.jsoup.nodes.TextNode textNode2 = serializedObjectSupporter0.deserializeObjectTextNode214();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString109();
        java.lang.StringBuilder stringBuilder4 = serializedObjectSupporter0.deserializeObjectStringBuilder430();
        java.lang.String str5 = serializedObjectSupporter0.deserializeObjectString94();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "More" + "'", str1, "More");
// flaky:         org.junit.Assert.assertNotNull(textNode2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "A caption" + "'", str3, "A caption");
        org.junit.Assert.assertNotNull(stringBuilder4);
        org.junit.Assert.assertEquals(stringBuilder4.toString(), "<textarea>");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "stuff" + "'", str5, "stuff");
    }

    @Test
    public void test271() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test271");
        org.jsoup.nodes.SerializedObjectSupporter serializedObjectSupporter0 = new org.jsoup.nodes.SerializedObjectSupporter();
        java.lang.String str1 = serializedObjectSupporter0.deserializeObjectString93();
        java.lang.StringBuilder stringBuilder2 = serializedObjectSupporter0.deserializeObjectStringBuilder36();
        org.jsoup.nodes.TextNode textNode3 = serializedObjectSupporter0.deserializeObjectTextNode137();
        org.jsoup.nodes.TextNode textNode4 = serializedObjectSupporter0.deserializeObjectTextNode289();
        java.lang.StringBuilder stringBuilder5 = serializedObjectSupporter0.deserializeObjectStringBuilder86();
        java.lang.StringBuilder stringBuilder6 = serializedObjectSupporter0.deserializeObjectStringBuilder166();
        org.jsoup.nodes.TextNode textNode7 = serializedObjectSupporter0.deserializeObjectTextNode120();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Document document8 = serializedObjectSupporter0.deserializeObjectDocument170();
// flaky:             org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: org.jsoup.nodes.Document$OutputSettings cannot be cast to org.jsoup.nodes.Document");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "More" + "'", str1, "More");
        org.junit.Assert.assertNotNull(stringBuilder2);
        org.junit.Assert.assertEquals(stringBuilder2.toString(), "<div>\n <p><b>This</b> is <b>jsoup</b>.</p>\n</div>");
// flaky:         org.junit.Assert.assertNotNull(textNode3);
// flaky:         org.junit.Assert.assertNotNull(textNode4);
        org.junit.Assert.assertNotNull(stringBuilder5);
        org.junit.Assert.assertEquals(stringBuilder5.toString(), "<div>\n <div>\n  one\n </div>\n <div>\n  two\n </div>\n <p>Hello</p>\n <p>Three</p>\n <!-- four -->\n <p>");
        org.junit.Assert.assertNotNull(stringBuilder6);
        org.junit.Assert.assertEquals(stringBuilder6.toString(), "<html><head></head><body><div>");
// flaky:         org.junit.Assert.assertNotNull(textNode7);
    }

    @Test
    public void test272() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test272");
        org.jsoup.nodes.Document.OutputSettings outputSettings0 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Entities.EscapeMode escapeMode1 = null;
        outputSettings0.setescapeMode(escapeMode1);
        org.jsoup.nodes.Entities.EscapeMode escapeMode3 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings4 = outputSettings0.escapeMode(escapeMode3);
        java.nio.charset.CharsetEncoder charsetEncoder5 = null;
        outputSettings4.charsetEncoder = charsetEncoder5;
        int int7 = outputSettings4.indentAmount;
        org.junit.Assert.assertNotNull(outputSettings4);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
    }

    @Test
    public void test273() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test273");
        org.jsoup.nodes.SerializedObjectSupporter serializedObjectSupporter0 = new org.jsoup.nodes.SerializedObjectSupporter();
        org.jsoup.nodes.TextNode textNode1 = serializedObjectSupporter0.deserializeObjectTextNode401();
        org.jsoup.nodes.TextNode textNode2 = serializedObjectSupporter0.deserializeObjectTextNode376();
        org.jsoup.nodes.TextNode textNode3 = serializedObjectSupporter0.deserializeObjectTextNode145();
        org.jsoup.nodes.TextNode textNode4 = serializedObjectSupporter0.deserializeObjectTextNode273();
// flaky:         org.junit.Assert.assertNotNull(textNode1);
// flaky:         org.junit.Assert.assertNotNull(textNode2);
// flaky:         org.junit.Assert.assertNotNull(textNode3);
// flaky:         org.junit.Assert.assertNotNull(textNode4);
    }

    @Test
    public void test274() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test274");
        org.jsoup.nodes.SerializedObjectSupporter serializedObjectSupporter0 = new org.jsoup.nodes.SerializedObjectSupporter();
        org.jsoup.nodes.TextNode textNode1 = serializedObjectSupporter0.deserializeObjectTextNode401();
        java.lang.StringBuilder stringBuilder2 = serializedObjectSupporter0.deserializeObjectStringBuilder60();
        java.lang.StringBuilder stringBuilder3 = serializedObjectSupporter0.deserializeObjectStringBuilder114();
        java.lang.StringBuilder stringBuilder4 = serializedObjectSupporter0.deserializeObjectStringBuilder421();
        org.jsoup.nodes.TextNode textNode5 = serializedObjectSupporter0.deserializeObjectTextNode168();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Document document6 = serializedObjectSupporter0.deserializeObjectDocument367();
// flaky:             org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: org.jsoup.nodes.Document$OutputSettings cannot be cast to org.jsoup.nodes.Document");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
// flaky:         org.junit.Assert.assertNotNull(textNode1);
        org.junit.Assert.assertNotNull(stringBuilder2);
        org.junit.Assert.assertEquals(stringBuilder2.toString(), "<html>\n <head>\n  <script>one</script>\n  <noscript></noscript>\n </head>\n <body>\n  <p>");
        org.junit.Assert.assertNotNull(stringBuilder3);
        org.junit.Assert.assertEquals(stringBuilder3.toString(), "\nthere &amp; now &gt; \n<p>");
        org.junit.Assert.assertNotNull(stringBuilder4);
        org.junit.Assert.assertEquals(stringBuilder4.toString(), "<p><b>One</b></p>\n<b> \n <table>\n  <tbody>\n   <tr>\n    <td><p><i>Three</i></p><p><i>");
// flaky:         org.junit.Assert.assertNotNull(textNode5);
    }

    @Test
    public void test275() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test275");
        org.jsoup.nodes.SerializedObjectSupporter serializedObjectSupporter0 = new org.jsoup.nodes.SerializedObjectSupporter();
        java.lang.String str1 = serializedObjectSupporter0.deserializeObjectString93();
        org.jsoup.nodes.TextNode textNode2 = serializedObjectSupporter0.deserializeObjectTextNode214();
        java.lang.StringBuilder stringBuilder3 = serializedObjectSupporter0.deserializeObjectStringBuilder143();
        java.lang.StringBuilder stringBuilder4 = serializedObjectSupporter0.deserializeObjectStringBuilder261();
        org.jsoup.nodes.TextNode textNode5 = serializedObjectSupporter0.deserializeObjectTextNode255();
        org.jsoup.nodes.TextNode textNode6 = serializedObjectSupporter0.deserializeObjectTextNode346();
        java.lang.StringBuilder stringBuilder7 = serializedObjectSupporter0.deserializeObjectStringBuilder17();
        org.jsoup.nodes.TextNode textNode8 = serializedObjectSupporter0.deserializeObjectTextNode201();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "More" + "'", str1, "More");
// flaky:         org.junit.Assert.assertNotNull(textNode2);
        org.junit.Assert.assertNotNull(stringBuilder3);
        org.junit.Assert.assertEquals(stringBuilder3.toString(), "<div id=\"1\"></div>\n<div id=\"2\">\n Text \n <p>One</p>");
        org.junit.Assert.assertNotNull(stringBuilder4);
        org.junit.Assert.assertEquals(stringBuilder4.toString(), "<doc>\n <val>");
// flaky:         org.junit.Assert.assertNotNull(textNode5);
// flaky:         org.junit.Assert.assertNotNull(textNode6);
        org.junit.Assert.assertNotNull(stringBuilder7);
        org.junit.Assert.assertEquals(stringBuilder7.toString(), "<p>");
// flaky:         org.junit.Assert.assertNotNull(textNode8);
    }

    @Test
    public void test276() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test276");
        org.jsoup.nodes.SerializedObjectSupporter serializedObjectSupporter0 = new org.jsoup.nodes.SerializedObjectSupporter();
        java.lang.String str1 = serializedObjectSupporter0.deserializeObjectString93();
        java.lang.StringBuilder stringBuilder2 = serializedObjectSupporter0.deserializeObjectStringBuilder36();
        org.jsoup.nodes.TextNode textNode3 = serializedObjectSupporter0.deserializeObjectTextNode137();
        org.jsoup.nodes.TextNode textNode4 = serializedObjectSupporter0.deserializeObjectTextNode289();
        java.lang.StringBuilder stringBuilder5 = serializedObjectSupporter0.deserializeObjectStringBuilder86();
        java.lang.StringBuilder stringBuilder6 = serializedObjectSupporter0.deserializeObjectStringBuilder149();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Document document7 = serializedObjectSupporter0.deserializeObjectDocument377();
// flaky:             org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: org.jsoup.nodes.Document$OutputSettings cannot be cast to org.jsoup.nodes.Document");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "More" + "'", str1, "More");
        org.junit.Assert.assertNotNull(stringBuilder2);
        org.junit.Assert.assertEquals(stringBuilder2.toString(), "<div>\n <p><b>This</b> is <b>jsoup</b>.</p>\n</div>");
// flaky:         org.junit.Assert.assertNotNull(textNode3);
// flaky:         org.junit.Assert.assertNotNull(textNode4);
        org.junit.Assert.assertNotNull(stringBuilder5);
        org.junit.Assert.assertEquals(stringBuilder5.toString(), "<div>\n <div>\n  one\n </div>\n <div>\n  two\n </div>\n <p>Hello</p>\n <p>Three</p>\n <!-- four -->\n <p>");
        org.junit.Assert.assertNotNull(stringBuilder6);
        org.junit.Assert.assertEquals(stringBuilder6.toString(), "<div id=\"1\">\n Text \n <p>One</p> Text \n <p>Two</p>\n</div>\n<div id=\"2\">\n <p>");
    }

    @Test
    public void test277() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test277");
        org.jsoup.nodes.SerializedObjectSupporter serializedObjectSupporter0 = new org.jsoup.nodes.SerializedObjectSupporter();
        java.lang.String str1 = serializedObjectSupporter0.deserializeObjectString93();
        java.lang.StringBuilder stringBuilder2 = serializedObjectSupporter0.deserializeObjectStringBuilder36();
        org.jsoup.nodes.TextNode textNode3 = serializedObjectSupporter0.deserializeObjectTextNode137();
        org.jsoup.nodes.TextNode textNode4 = serializedObjectSupporter0.deserializeObjectTextNode289();
        java.lang.StringBuilder stringBuilder5 = serializedObjectSupporter0.deserializeObjectStringBuilder86();
        java.lang.StringBuilder stringBuilder6 = serializedObjectSupporter0.deserializeObjectStringBuilder149();
        org.jsoup.nodes.TextNode textNode7 = serializedObjectSupporter0.deserializeObjectTextNode242();
        java.lang.StringBuilder stringBuilder8 = serializedObjectSupporter0.deserializeObjectStringBuilder169();
        java.lang.StringBuilder stringBuilder9 = serializedObjectSupporter0.deserializeObjectStringBuilder381();
        java.lang.StringBuilder stringBuilder10 = serializedObjectSupporter0.deserializeObjectStringBuilder67();
        java.lang.StringBuilder stringBuilder11 = serializedObjectSupporter0.deserializeObjectStringBuilder216();
        java.lang.StringBuilder stringBuilder12 = serializedObjectSupporter0.deserializeObjectStringBuilder178();
        java.lang.StringBuilder stringBuilder13 = serializedObjectSupporter0.deserializeObjectStringBuilder13();
        java.lang.String str14 = serializedObjectSupporter0.deserializeObjectString77();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "More" + "'", str1, "More");
        org.junit.Assert.assertNotNull(stringBuilder2);
        org.junit.Assert.assertEquals(stringBuilder2.toString(), "<div>\n <p><b>This</b> is <b>jsoup</b>.</p>\n</div>");
// flaky:         org.junit.Assert.assertNotNull(textNode3);
// flaky:         org.junit.Assert.assertNotNull(textNode4);
        org.junit.Assert.assertNotNull(stringBuilder5);
        org.junit.Assert.assertEquals(stringBuilder5.toString(), "<div>\n <div>\n  one\n </div>\n <div>\n  two\n </div>\n <p>Hello</p>\n <p>Three</p>\n <!-- four -->\n <p>");
        org.junit.Assert.assertNotNull(stringBuilder6);
        org.junit.Assert.assertEquals(stringBuilder6.toString(), "<div id=\"1\">\n Text \n <p>One</p> Text \n <p>Two</p>\n</div>\n<div id=\"2\">\n <p>");
// flaky:         org.junit.Assert.assertNotNull(textNode7);
        org.junit.Assert.assertNotNull(stringBuilder8);
        org.junit.Assert.assertEquals(stringBuilder8.toString(), "<title>");
        org.junit.Assert.assertNotNull(stringBuilder9);
        org.junit.Assert.assertEquals(stringBuilder9.toString(), "<table> \n <colgroup> \n  <col />");
        org.junit.Assert.assertNotNull(stringBuilder10);
        org.junit.Assert.assertEquals(stringBuilder10.toString(), "<html>\n <head>\n  <title>Hello</title>");
        org.junit.Assert.assertNotNull(stringBuilder11);
        org.junit.Assert.assertEquals(stringBuilder11.toString(), "<div id=\"1\">\n Text 1 \n <p>");
        org.junit.Assert.assertNotNull(stringBuilder12);
        org.junit.Assert.assertEquals(stringBuilder12.toString(), "");
        org.junit.Assert.assertNotNull(stringBuilder13);
        org.junit.Assert.assertEquals(stringBuilder13.toString(), "<p>This <span>foo</span><a>is</a>");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Test" + "'", str14, "Test");
    }

    @Test
    public void test278() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test278");
        org.jsoup.nodes.SerializedObjectSupporter serializedObjectSupporter0 = new org.jsoup.nodes.SerializedObjectSupporter();
        java.lang.String str1 = serializedObjectSupporter0.deserializeObjectString93();
        java.lang.StringBuilder stringBuilder2 = serializedObjectSupporter0.deserializeObjectStringBuilder215();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString128();
        java.lang.StringBuilder stringBuilder4 = serializedObjectSupporter0.deserializeObjectStringBuilder419();
        java.lang.String str5 = serializedObjectSupporter0.deserializeObjectString34();
        org.jsoup.nodes.TextNode textNode6 = serializedObjectSupporter0.deserializeObjectTextNode247();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "More" + "'", str1, "More");
        org.junit.Assert.assertNotNull(stringBuilder2);
        org.junit.Assert.assertEquals(stringBuilder2.toString(), "<div id=\"1\">");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + " 12.3% " + "'", str3, " 12.3% ");
        org.junit.Assert.assertNotNull(stringBuilder4);
        org.junit.Assert.assertEquals(stringBuilder4.toString(), "<p><b>One</b></p>\n<b>");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "< > & \" ' \327" + "'", str5, "< > & \" ' \327");
// flaky:         org.junit.Assert.assertNotNull(textNode6);
    }

    @Test
    public void test279() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test279");
        org.jsoup.nodes.SerializedObjectSupporter serializedObjectSupporter0 = new org.jsoup.nodes.SerializedObjectSupporter();
        java.lang.String str1 = serializedObjectSupporter0.deserializeObjectString93();
        java.lang.StringBuilder stringBuilder2 = serializedObjectSupporter0.deserializeObjectStringBuilder215();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Document document3 = serializedObjectSupporter0.deserializeObjectDocument275();
// flaky:             org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: org.jsoup.nodes.Document$OutputSettings cannot be cast to org.jsoup.nodes.Document");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "More" + "'", str1, "More");
        org.junit.Assert.assertNotNull(stringBuilder2);
        org.junit.Assert.assertEquals(stringBuilder2.toString(), "<div id=\"1\">");
    }

    @Test
    public void test280() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test280");
        org.jsoup.nodes.SerializedObjectSupporter serializedObjectSupporter0 = new org.jsoup.nodes.SerializedObjectSupporter();
        java.lang.String str1 = serializedObjectSupporter0.deserializeObjectString93();
        java.lang.StringBuilder stringBuilder2 = serializedObjectSupporter0.deserializeObjectStringBuilder215();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString128();
        org.jsoup.nodes.TextNode textNode4 = serializedObjectSupporter0.deserializeObjectTextNode186();
        org.jsoup.nodes.TextNode textNode5 = serializedObjectSupporter0.deserializeObjectTextNode414();
        org.jsoup.nodes.TextNode textNode6 = serializedObjectSupporter0.deserializeObjectTextNode391();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "More" + "'", str1, "More");
        org.junit.Assert.assertNotNull(stringBuilder2);
        org.junit.Assert.assertEquals(stringBuilder2.toString(), "<div id=\"1\">");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + " 12.3% " + "'", str3, " 12.3% ");
// flaky:         org.junit.Assert.assertNotNull(textNode4);
// flaky:         org.junit.Assert.assertNotNull(textNode5);
// flaky:         org.junit.Assert.assertNotNull(textNode6);
    }

    @Test
    public void test281() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test281");
        org.jsoup.nodes.Document.OutputSettings outputSettings0 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Entities.EscapeMode escapeMode1 = null;
        outputSettings0.setescapeMode(escapeMode1);
        java.nio.charset.Charset charset3 = null;
        outputSettings0.setcharset(charset3);
        int int5 = outputSettings0.indentAmount;
        java.nio.charset.CharsetEncoder charsetEncoder6 = outputSettings0.getcharsetEncoder();
        outputSettings0.setprettyPrint(false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertNotNull(charsetEncoder6);
    }

    @Test
    public void test282() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test282");
        org.jsoup.nodes.SerializedObjectSupporter serializedObjectSupporter0 = new org.jsoup.nodes.SerializedObjectSupporter();
        java.lang.String str1 = serializedObjectSupporter0.deserializeObjectString93();
        java.lang.StringBuilder stringBuilder2 = serializedObjectSupporter0.deserializeObjectStringBuilder215();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString128();
        java.lang.StringBuilder stringBuilder4 = serializedObjectSupporter0.deserializeObjectStringBuilder419();
        java.lang.String str5 = serializedObjectSupporter0.deserializeObjectString34();
        java.lang.StringBuilder stringBuilder6 = serializedObjectSupporter0.deserializeObjectStringBuilder412();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Document document7 = serializedObjectSupporter0.deserializeObjectDocument63();
// flaky:             org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: org.jsoup.nodes.Document$OutputSettings cannot be cast to org.jsoup.nodes.Document");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "More" + "'", str1, "More");
        org.junit.Assert.assertNotNull(stringBuilder2);
        org.junit.Assert.assertEquals(stringBuilder2.toString(), "<div id=\"1\">");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + " 12.3% " + "'", str3, " 12.3% ");
        org.junit.Assert.assertNotNull(stringBuilder4);
        org.junit.Assert.assertEquals(stringBuilder4.toString(), "<p><b>One</b></p>\n<b>");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "< > & \" ' \327" + "'", str5, "< > & \" ' \327");
        org.junit.Assert.assertNotNull(stringBuilder6);
        org.junit.Assert.assertEquals(stringBuilder6.toString(), "<table> \n <colgroup> \n  <col /> \n </colgroup>\n <colgroup> \n  <col /> \n  <col /> \n  <col /> \n </colgroup>\n <thead> \n  <tr> \n   <th> </th>\n   <th>2008 </th>\n   <th>2007 </th>\n   <th>2006 </th>\n  </tr>\n </thead>\n <tbody> \n  <tr> \n   <th scope=\"rowgroup\"> Research and development </th>\n   <td> $ 1,109 </td>\n   <td> $ 782 </td>\n   <td> $ 712 </td>\n  </tr>\n  <tr> \n   <th scope=\"row\"> Percentage of net sales </th>\n   <td> 3.4% </td>\n   <td> 3.3% </td>\n   <td> 3.7% </td>\n  </tr>\n </tbody>\n <tbody> \n  <tr> \n   <th scope=\"rowgroup\"> Selling, general, and administrative </th>\n   <td> $ 3,761 </td>\n   <td> $ 2,963 </td>\n   <td> $ 2,433 </td>\n  </tr>\n  <tr> \n   <th scope=\"row\"> Percentage of net sales </th>\n   <td> 11.6% </td>\n   <td>");
    }

    @Test
    public void test283() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test283");
        org.jsoup.nodes.SerializedObjectSupporter serializedObjectSupporter0 = new org.jsoup.nodes.SerializedObjectSupporter();
        java.lang.String str1 = serializedObjectSupporter0.deserializeObjectString93();
        java.lang.StringBuilder stringBuilder2 = serializedObjectSupporter0.deserializeObjectStringBuilder36();
        java.lang.StringBuilder stringBuilder3 = serializedObjectSupporter0.deserializeObjectStringBuilder399();
        org.jsoup.nodes.TextNode textNode4 = serializedObjectSupporter0.deserializeObjectTextNode54();
        java.lang.String str5 = serializedObjectSupporter0.deserializeObjectString9();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Document document6 = serializedObjectSupporter0.deserializeObjectDocument110();
// flaky:             org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: org.jsoup.nodes.Document$OutputSettings cannot be cast to org.jsoup.nodes.Document");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "More" + "'", str1, "More");
        org.junit.Assert.assertNotNull(stringBuilder2);
        org.junit.Assert.assertEquals(stringBuilder2.toString(), "<div>\n <p><b>This</b> is <b>jsoup</b>.</p>\n</div>");
        org.junit.Assert.assertNotNull(stringBuilder3);
        org.junit.Assert.assertEquals(stringBuilder3.toString(), "<table> \n <colgroup> \n  <col /> \n </colgroup>\n <colgroup> \n  <col /> \n  <col /> \n  <col /> \n </colgroup>\n <thead> \n  <tr> \n   <th> </th>\n   <th>2008 </th>\n   <th>2007 </th>\n   <th>2006 </th>\n  </tr>\n </thead>\n <tbody> \n  <tr> \n   <th scope=\"rowgroup\"> Research and development </th>\n   <td> $ 1,109 </td>\n   <td> $ 782 </td>\n   <td> $ 712 </td>\n  </tr>\n  <tr> \n   <th scope=\"row\">");
// flaky:         org.junit.Assert.assertNotNull(textNode4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "three" + "'", str5, "three");
    }

    @Test
    public void test284() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test284");
        org.jsoup.nodes.SerializedObjectSupporter serializedObjectSupporter0 = new org.jsoup.nodes.SerializedObjectSupporter();
        org.jsoup.nodes.TextNode textNode1 = serializedObjectSupporter0.deserializeObjectTextNode401();
        java.lang.StringBuilder stringBuilder2 = serializedObjectSupporter0.deserializeObjectStringBuilder163();
        java.lang.StringBuilder stringBuilder3 = serializedObjectSupporter0.deserializeObjectStringBuilder102();
// flaky:         org.junit.Assert.assertNotNull(textNode1);
        org.junit.Assert.assertNotNull(stringBuilder2);
        org.junit.Assert.assertEquals(stringBuilder2.toString(), "<html>\n <head>\n  <title>Format test</title>\n </head>\n <body>\n  <div>\n   <p>\n    Hello \n    <span>\n     jsoup \n     <span>");
        org.junit.Assert.assertNotNull(stringBuilder3);
        org.junit.Assert.assertEquals(stringBuilder3.toString(), "<div>\n <p>One</p>\n <p><span>Two</span></p>\n</div>\n<p><span>");
    }

    @Test
    public void test285() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test285");
        org.jsoup.nodes.SerializedObjectSupporter serializedObjectSupporter0 = new org.jsoup.nodes.SerializedObjectSupporter();
        java.lang.String str1 = serializedObjectSupporter0.deserializeObjectString93();
        org.jsoup.nodes.TextNode textNode2 = serializedObjectSupporter0.deserializeObjectTextNode214();
        org.jsoup.nodes.TextNode textNode3 = serializedObjectSupporter0.deserializeObjectTextNode79();
        org.jsoup.nodes.TextNode textNode4 = serializedObjectSupporter0.deserializeObjectTextNode169();
        org.jsoup.nodes.TextNode textNode5 = serializedObjectSupporter0.deserializeObjectTextNode80();
        java.lang.StringBuilder stringBuilder6 = serializedObjectSupporter0.deserializeObjectStringBuilder291();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Document document7 = serializedObjectSupporter0.deserializeObjectDocument420();
// flaky:             org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: org.jsoup.nodes.Document$OutputSettings cannot be cast to org.jsoup.nodes.Document");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "More" + "'", str1, "More");
// flaky:         org.junit.Assert.assertNotNull(textNode2);
// flaky:         org.junit.Assert.assertNotNull(textNode3);
// flaky:         org.junit.Assert.assertNotNull(textNode4);
// flaky:         org.junit.Assert.assertNotNull(textNode5);
        org.junit.Assert.assertNotNull(stringBuilder6);
        org.junit.Assert.assertEquals(stringBuilder6.toString(), "<!DOCTYPE html>\n<html>\n <head></head>\n <body>\n  OneTwoThree\n  <link />FourFive ");
    }

    @Test
    public void test286() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test286");
        org.jsoup.nodes.SerializedObjectSupporter serializedObjectSupporter0 = new org.jsoup.nodes.SerializedObjectSupporter();
        java.lang.String str1 = serializedObjectSupporter0.deserializeObjectString93();
        org.jsoup.nodes.TextNode textNode2 = serializedObjectSupporter0.deserializeObjectTextNode214();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString109();
        org.jsoup.nodes.TextNode textNode4 = serializedObjectSupporter0.deserializeObjectTextNode86();
        org.jsoup.nodes.TextNode textNode5 = serializedObjectSupporter0.deserializeObjectTextNode143();
        org.jsoup.nodes.TextNode textNode6 = serializedObjectSupporter0.deserializeObjectTextNode336();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "More" + "'", str1, "More");
// flaky:         org.junit.Assert.assertNotNull(textNode2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "A caption" + "'", str3, "A caption");
// flaky:         org.junit.Assert.assertNotNull(textNode4);
// flaky:         org.junit.Assert.assertNotNull(textNode5);
// flaky:         org.junit.Assert.assertNotNull(textNode6);
    }

    @Test
    public void test287() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test287");
        org.jsoup.nodes.SerializedObjectSupporter serializedObjectSupporter0 = new org.jsoup.nodes.SerializedObjectSupporter();
        java.lang.String str1 = serializedObjectSupporter0.deserializeObjectString93();
        java.lang.StringBuilder stringBuilder2 = serializedObjectSupporter0.deserializeObjectStringBuilder267();
        org.jsoup.nodes.TextNode textNode3 = serializedObjectSupporter0.deserializeObjectTextNode102();
        java.lang.String str4 = serializedObjectSupporter0.deserializeObjectString110();
        org.jsoup.nodes.TextNode textNode5 = serializedObjectSupporter0.deserializeObjectTextNode107();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "More" + "'", str1, "More");
        org.junit.Assert.assertNotNull(stringBuilder2);
        org.junit.Assert.assertEquals(stringBuilder2.toString(), "<doc>\n <val>");
// flaky:         org.junit.Assert.assertNotNull(textNode3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Something" + "'", str4, "Something");
// flaky:         org.junit.Assert.assertNotNull(textNode5);
    }

    @Test
    public void test288() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test288");
        org.jsoup.nodes.SerializedObjectSupporter serializedObjectSupporter0 = new org.jsoup.nodes.SerializedObjectSupporter();
        java.lang.String str1 = serializedObjectSupporter0.deserializeObjectString93();
        org.jsoup.nodes.TextNode textNode2 = serializedObjectSupporter0.deserializeObjectTextNode214();
        java.lang.StringBuilder stringBuilder3 = serializedObjectSupporter0.deserializeObjectStringBuilder19();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Document document4 = serializedObjectSupporter0.deserializeObjectDocument177();
// flaky:             org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: org.jsoup.nodes.Document$OutputSettings cannot be cast to org.jsoup.nodes.Document");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "More" + "'", str1, "More");
// flaky:         org.junit.Assert.assertNotNull(textNode2);
        org.junit.Assert.assertNotNull(stringBuilder3);
        org.junit.Assert.assertEquals(stringBuilder3.toString(), "<p>This <a>is</a><span>");
    }

    @Test
    public void test289() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test289");
        org.jsoup.nodes.SerializedObjectSupporter serializedObjectSupporter0 = new org.jsoup.nodes.SerializedObjectSupporter();
        java.lang.String str1 = serializedObjectSupporter0.deserializeObjectString93();
        java.lang.StringBuilder stringBuilder2 = serializedObjectSupporter0.deserializeObjectStringBuilder36();
        org.jsoup.nodes.TextNode textNode3 = serializedObjectSupporter0.deserializeObjectTextNode137();
        org.jsoup.nodes.TextNode textNode4 = serializedObjectSupporter0.deserializeObjectTextNode289();
        java.lang.StringBuilder stringBuilder5 = serializedObjectSupporter0.deserializeObjectStringBuilder86();
        java.lang.StringBuilder stringBuilder6 = serializedObjectSupporter0.deserializeObjectStringBuilder149();
        java.lang.StringBuilder stringBuilder7 = serializedObjectSupporter0.deserializeObjectStringBuilder243();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "More" + "'", str1, "More");
        org.junit.Assert.assertNotNull(stringBuilder2);
        org.junit.Assert.assertEquals(stringBuilder2.toString(), "<div>\n <p><b>This</b> is <b>jsoup</b>.</p>\n</div>");
// flaky:         org.junit.Assert.assertNotNull(textNode3);
// flaky:         org.junit.Assert.assertNotNull(textNode4);
        org.junit.Assert.assertNotNull(stringBuilder5);
        org.junit.Assert.assertEquals(stringBuilder5.toString(), "<div>\n <div>\n  one\n </div>\n <div>\n  two\n </div>\n <p>Hello</p>\n <p>Three</p>\n <!-- four -->\n <p>");
        org.junit.Assert.assertNotNull(stringBuilder6);
        org.junit.Assert.assertEquals(stringBuilder6.toString(), "<div id=\"1\">\n Text \n <p>One</p> Text \n <p>Two</p>\n</div>\n<div id=\"2\">\n <p>");
        org.junit.Assert.assertNotNull(stringBuilder7);
        org.junit.Assert.assertEquals(stringBuilder7.toString(), "<div><p>");
    }

    @Test
    public void test290() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test290");
        org.jsoup.nodes.SerializedObjectSupporter serializedObjectSupporter0 = new org.jsoup.nodes.SerializedObjectSupporter();
        java.lang.String str1 = serializedObjectSupporter0.deserializeObjectString98();
        java.lang.StringBuilder stringBuilder2 = serializedObjectSupporter0.deserializeObjectStringBuilder264();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString135();
        java.lang.StringBuilder stringBuilder4 = serializedObjectSupporter0.deserializeObjectStringBuilder47();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "3" + "'", str1, "3");
        org.junit.Assert.assertNotNull(stringBuilder2);
        org.junit.Assert.assertEquals(stringBuilder2.toString(), "<doc>\n <val>");
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "& \" \256\u0438\ud559" + "'", str3, "& \" \256\u0438\ud559");
        org.junit.Assert.assertNotNull(stringBuilder4);
        org.junit.Assert.assertEquals(stringBuilder4.toString(), "<p>Hello <em>there</em>");
    }

    @Test
    public void test291() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test291");
        org.jsoup.nodes.SerializedObjectSupporter serializedObjectSupporter0 = new org.jsoup.nodes.SerializedObjectSupporter();
        java.lang.String str1 = serializedObjectSupporter0.deserializeObjectString93();
        java.lang.StringBuilder stringBuilder2 = serializedObjectSupporter0.deserializeObjectStringBuilder215();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString128();
        java.lang.StringBuilder stringBuilder4 = serializedObjectSupporter0.deserializeObjectStringBuilder419();
        java.lang.String str5 = serializedObjectSupporter0.deserializeObjectString34();
        org.jsoup.nodes.TextNode textNode6 = serializedObjectSupporter0.deserializeObjectTextNode217();
        java.lang.StringBuilder stringBuilder7 = serializedObjectSupporter0.deserializeObjectStringBuilder46();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "More" + "'", str1, "More");
        org.junit.Assert.assertNotNull(stringBuilder2);
        org.junit.Assert.assertEquals(stringBuilder2.toString(), "<div id=\"1\">");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + " 12.3% " + "'", str3, " 12.3% ");
        org.junit.Assert.assertNotNull(stringBuilder4);
        org.junit.Assert.assertEquals(stringBuilder4.toString(), "<p><b>One</b></p>\n<b>");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "< > & \" ' \327" + "'", str5, "< > & \" ' \327");
// flaky:         org.junit.Assert.assertNotNull(textNode6);
        org.junit.Assert.assertNotNull(stringBuilder7);
        org.junit.Assert.assertEquals(stringBuilder7.toString(), "<p>Hello <em>");
    }
}
