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
        org.jsoup.nodes.SerializedObjectSupporter serializedObjectSupporter0 = new org.jsoup.nodes.SerializedObjectSupporter();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Document document1 = serializedObjectSupporter0.deserializeObjectDocument202();
// flaky:             org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: org.jsoup.nodes.Document$OutputSettings cannot be cast to org.jsoup.nodes.Document");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
    }

    @Test
    public void test002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test002");
        org.jsoup.nodes.SerializedObjectSupporter serializedObjectSupporter0 = new org.jsoup.nodes.SerializedObjectSupporter();
        org.jsoup.nodes.TextNode textNode1 = serializedObjectSupporter0.deserializeObjectTextNode372();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Document document2 = serializedObjectSupporter0.deserializeObjectDocument150();
// flaky:             org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: org.jsoup.nodes.Document$OutputSettings cannot be cast to org.jsoup.nodes.Document");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
// flaky:         org.junit.Assert.assertNotNull(textNode1);
    }

    @Test
    public void test003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test003");
        org.jsoup.nodes.SerializedObjectSupporter serializedObjectSupporter0 = new org.jsoup.nodes.SerializedObjectSupporter();
        org.jsoup.nodes.TextNode textNode1 = serializedObjectSupporter0.deserializeObjectTextNode372();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Document document2 = serializedObjectSupporter0.deserializeObjectDocument202();
// flaky:             org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: org.jsoup.nodes.Document$OutputSettings cannot be cast to org.jsoup.nodes.Document");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
// flaky:         org.junit.Assert.assertNotNull(textNode1);
    }

    @Test
    public void test004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test004");
        org.jsoup.nodes.SerializedObjectSupporter serializedObjectSupporter0 = new org.jsoup.nodes.SerializedObjectSupporter();
        org.jsoup.nodes.TextNode textNode1 = serializedObjectSupporter0.deserializeObjectTextNode105();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Document document2 = serializedObjectSupporter0.deserializeObjectDocument397();
// flaky:             org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: org.jsoup.nodes.Document$OutputSettings cannot be cast to org.jsoup.nodes.Document");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
// flaky:         org.junit.Assert.assertNotNull(textNode1);
    }

    @Test
    public void test005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test005");
        org.jsoup.nodes.SerializedObjectSupporter serializedObjectSupporter0 = new org.jsoup.nodes.SerializedObjectSupporter();
        org.jsoup.nodes.TextNode textNode1 = serializedObjectSupporter0.deserializeObjectTextNode372();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Document document2 = serializedObjectSupporter0.deserializeObjectDocument315();
// flaky:             org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: org.jsoup.nodes.Document$OutputSettings cannot be cast to org.jsoup.nodes.Document");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
// flaky:         org.junit.Assert.assertNotNull(textNode1);
    }

    @Test
    public void test006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test006");
        org.jsoup.nodes.SerializedObjectSupporter serializedObjectSupporter0 = new org.jsoup.nodes.SerializedObjectSupporter();
        java.lang.StringBuilder stringBuilder1 = serializedObjectSupporter0.deserializeObjectStringBuilder18();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Document document2 = serializedObjectSupporter0.deserializeObjectDocument303();
// flaky:             org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: org.jsoup.nodes.Document$OutputSettings cannot be cast to org.jsoup.nodes.Document");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(stringBuilder1);
        org.junit.Assert.assertEquals(stringBuilder1.toString(), "<p>This <a>");
    }

    @Test
    public void test007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test007");
        org.jsoup.nodes.Document.OutputSettings outputSettings0 = new org.jsoup.nodes.Document.OutputSettings();
        java.nio.charset.CharsetEncoder charsetEncoder1 = null;
        outputSettings0.charsetEncoder = charsetEncoder1;
    }

    @Test
    public void test008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test008");
        org.jsoup.nodes.SerializedObjectSupporter serializedObjectSupporter0 = new org.jsoup.nodes.SerializedObjectSupporter();
        java.lang.StringBuilder stringBuilder1 = serializedObjectSupporter0.deserializeObjectStringBuilder18();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Document document2 = serializedObjectSupporter0.deserializeObjectDocument34();
// flaky:             org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: org.jsoup.nodes.Document$OutputSettings cannot be cast to org.jsoup.nodes.Document");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(stringBuilder1);
        org.junit.Assert.assertEquals(stringBuilder1.toString(), "<p>This <a>");
    }

    @Test
    public void test009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test009");
        org.jsoup.nodes.SerializedObjectSupporter serializedObjectSupporter0 = new org.jsoup.nodes.SerializedObjectSupporter();
        java.lang.StringBuilder stringBuilder1 = serializedObjectSupporter0.deserializeObjectStringBuilder18();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Document document2 = serializedObjectSupporter0.deserializeObjectDocument408();
// flaky:             org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: org.jsoup.nodes.Document$OutputSettings cannot be cast to org.jsoup.nodes.Document");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(stringBuilder1);
        org.junit.Assert.assertEquals(stringBuilder1.toString(), "<p>This <a>");
    }

    @Test
    public void test010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test010");
        org.jsoup.nodes.SerializedObjectSupporter serializedObjectSupporter0 = new org.jsoup.nodes.SerializedObjectSupporter();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Document document1 = serializedObjectSupporter0.deserializeObjectDocument105();
// flaky:             org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: org.jsoup.nodes.Document$OutputSettings cannot be cast to org.jsoup.nodes.Document");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
    }

    @Test
    public void test011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test011");
        org.jsoup.nodes.SerializedObjectSupporter serializedObjectSupporter0 = new org.jsoup.nodes.SerializedObjectSupporter();
        java.lang.StringBuilder stringBuilder1 = serializedObjectSupporter0.deserializeObjectStringBuilder18();
        org.jsoup.nodes.TextNode textNode2 = serializedObjectSupporter0.deserializeObjectTextNode4();
        org.jsoup.nodes.TextNode textNode3 = serializedObjectSupporter0.deserializeObjectTextNode238();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Document document4 = serializedObjectSupporter0.deserializeObjectDocument25();
// flaky:             org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: org.jsoup.nodes.Document$OutputSettings cannot be cast to org.jsoup.nodes.Document");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(stringBuilder1);
        org.junit.Assert.assertEquals(stringBuilder1.toString(), "<p>This <a>");
// flaky:         org.junit.Assert.assertNotNull(textNode2);
// flaky:         org.junit.Assert.assertNotNull(textNode3);
    }

    @Test
    public void test012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test012");
        org.jsoup.nodes.SerializedObjectSupporter serializedObjectSupporter0 = new org.jsoup.nodes.SerializedObjectSupporter();
        org.jsoup.nodes.TextNode textNode1 = serializedObjectSupporter0.deserializeObjectTextNode105();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Document document2 = serializedObjectSupporter0.deserializeObjectDocument376();
// flaky:             org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: org.jsoup.nodes.Document$OutputSettings cannot be cast to org.jsoup.nodes.Document");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
// flaky:         org.junit.Assert.assertNotNull(textNode1);
    }

    @Test
    public void test013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test013");
        org.jsoup.nodes.SerializedObjectSupporter serializedObjectSupporter0 = new org.jsoup.nodes.SerializedObjectSupporter();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Document document1 = serializedObjectSupporter0.deserializeObjectDocument336();
// flaky:             org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: org.jsoup.nodes.Document$OutputSettings cannot be cast to org.jsoup.nodes.Document");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
    }

    @Test
    public void test014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test014");
        org.jsoup.nodes.SerializedObjectSupporter serializedObjectSupporter0 = new org.jsoup.nodes.SerializedObjectSupporter();
        org.jsoup.nodes.TextNode textNode1 = serializedObjectSupporter0.deserializeObjectTextNode105();
        org.jsoup.nodes.TextNode textNode2 = serializedObjectSupporter0.deserializeObjectTextNode112();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Document document3 = serializedObjectSupporter0.deserializeObjectDocument323();
// flaky:             org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: org.jsoup.nodes.Document$OutputSettings cannot be cast to org.jsoup.nodes.Document");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
// flaky:         org.junit.Assert.assertNotNull(textNode1);
// flaky:         org.junit.Assert.assertNotNull(textNode2);
    }

    @Test
    public void test015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test015");
        org.jsoup.nodes.SerializedObjectSupporter serializedObjectSupporter0 = new org.jsoup.nodes.SerializedObjectSupporter();
        org.jsoup.nodes.TextNode textNode1 = serializedObjectSupporter0.deserializeObjectTextNode105();
        org.jsoup.nodes.TextNode textNode2 = serializedObjectSupporter0.deserializeObjectTextNode112();
        java.lang.StringBuilder stringBuilder3 = serializedObjectSupporter0.deserializeObjectStringBuilder139();
// flaky:         org.junit.Assert.assertNotNull(textNode1);
// flaky:         org.junit.Assert.assertNotNull(textNode2);
        org.junit.Assert.assertNotNull(stringBuilder3);
        org.junit.Assert.assertEquals(stringBuilder3.toString(), "<p>");
    }

    @Test
    public void test016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test016");
        org.jsoup.nodes.SerializedObjectSupporter serializedObjectSupporter0 = new org.jsoup.nodes.SerializedObjectSupporter();
        java.lang.StringBuilder stringBuilder1 = serializedObjectSupporter0.deserializeObjectStringBuilder18();
        org.jsoup.nodes.TextNode textNode2 = serializedObjectSupporter0.deserializeObjectTextNode252();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Document document3 = serializedObjectSupporter0.deserializeObjectDocument109();
// flaky:             org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: org.jsoup.nodes.Document$OutputSettings cannot be cast to org.jsoup.nodes.Document");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(stringBuilder1);
        org.junit.Assert.assertEquals(stringBuilder1.toString(), "<p>This <a>");
// flaky:         org.junit.Assert.assertNotNull(textNode2);
    }

    @Test
    public void test017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test017");
        org.jsoup.nodes.SerializedObjectSupporter serializedObjectSupporter0 = new org.jsoup.nodes.SerializedObjectSupporter();
        java.lang.StringBuilder stringBuilder1 = serializedObjectSupporter0.deserializeObjectStringBuilder18();
        org.jsoup.nodes.TextNode textNode2 = serializedObjectSupporter0.deserializeObjectTextNode4();
        java.lang.String str4 = null; // flaky: textNode2.attr("three");
        org.junit.Assert.assertNotNull(stringBuilder1);
        org.junit.Assert.assertEquals(stringBuilder1.toString(), "<p>This <a>");
// flaky:         org.junit.Assert.assertNotNull(textNode2);
// flaky:         org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
    }

    @Test
    public void test018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test018");
        org.jsoup.nodes.SerializedObjectSupporter serializedObjectSupporter0 = new org.jsoup.nodes.SerializedObjectSupporter();
        org.jsoup.nodes.TextNode textNode1 = serializedObjectSupporter0.deserializeObjectTextNode372();
        java.lang.StringBuilder stringBuilder2 = serializedObjectSupporter0.deserializeObjectStringBuilder33();
        java.lang.StringBuilder stringBuilder3 = serializedObjectSupporter0.deserializeObjectStringBuilder29();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Document document4 = serializedObjectSupporter0.deserializeObjectDocument322();
// flaky:             org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: org.jsoup.nodes.Document$OutputSettings cannot be cast to org.jsoup.nodes.Document");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
// flaky:         org.junit.Assert.assertNotNull(textNode1);
        org.junit.Assert.assertNotNull(stringBuilder2);
        org.junit.Assert.assertEquals(stringBuilder2.toString(), "<div>\n <p><b>This</b>");
        org.junit.Assert.assertNotNull(stringBuilder3);
        org.junit.Assert.assertEquals(stringBuilder3.toString(), "<p><b>Bold</b>");
    }

    @Test
    public void test019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test019");
        org.jsoup.nodes.SerializedObjectSupporter serializedObjectSupporter0 = new org.jsoup.nodes.SerializedObjectSupporter();
        org.jsoup.nodes.TextNode textNode1 = serializedObjectSupporter0.deserializeObjectTextNode372();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Document document2 = serializedObjectSupporter0.deserializeObjectDocument192();
// flaky:             org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: org.jsoup.nodes.Document$OutputSettings cannot be cast to org.jsoup.nodes.Document");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
// flaky:         org.junit.Assert.assertNotNull(textNode1);
    }

    @Test
    public void test020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test020");
        org.jsoup.nodes.SerializedObjectSupporter serializedObjectSupporter0 = new org.jsoup.nodes.SerializedObjectSupporter();
        org.jsoup.nodes.TextNode textNode1 = serializedObjectSupporter0.deserializeObjectTextNode372();
        org.jsoup.nodes.TextNode textNode2 = serializedObjectSupporter0.deserializeObjectTextNode34();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Document document3 = serializedObjectSupporter0.deserializeObjectDocument250();
// flaky:             org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: org.jsoup.nodes.Document$OutputSettings cannot be cast to org.jsoup.nodes.Document");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
// flaky:         org.junit.Assert.assertNotNull(textNode1);
// flaky:         org.junit.Assert.assertNotNull(textNode2);
    }

    @Test
    public void test021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test021");
        org.jsoup.nodes.SerializedObjectSupporter serializedObjectSupporter0 = new org.jsoup.nodes.SerializedObjectSupporter();
        org.jsoup.nodes.TextNode textNode1 = serializedObjectSupporter0.deserializeObjectTextNode105();
        org.jsoup.nodes.TextNode textNode2 = serializedObjectSupporter0.deserializeObjectTextNode99();
        org.jsoup.nodes.TextNode textNode3 = serializedObjectSupporter0.deserializeObjectTextNode303();
        org.jsoup.nodes.TextNode textNode4 = serializedObjectSupporter0.deserializeObjectTextNode38();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Document document5 = serializedObjectSupporter0.deserializeObjectDocument81();
// flaky:             org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: org.jsoup.nodes.Document$OutputSettings cannot be cast to org.jsoup.nodes.Document");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
// flaky:         org.junit.Assert.assertNotNull(textNode1);
// flaky:         org.junit.Assert.assertNotNull(textNode2);
// flaky:         org.junit.Assert.assertNotNull(textNode3);
// flaky:         org.junit.Assert.assertNotNull(textNode4);
    }

    @Test
    public void test022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test022");
        org.jsoup.nodes.Document.OutputSettings outputSettings0 = new org.jsoup.nodes.Document.OutputSettings();
        boolean boolean1 = outputSettings0.prettyPrint();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test023");
        org.jsoup.nodes.SerializedObjectSupporter serializedObjectSupporter0 = new org.jsoup.nodes.SerializedObjectSupporter();
        org.jsoup.nodes.TextNode textNode1 = serializedObjectSupporter0.deserializeObjectTextNode379();
        org.jsoup.nodes.Node node2 = null; // flaky: textNode1.unwrap();
// flaky:         org.junit.Assert.assertNotNull(textNode1);
        org.junit.Assert.assertNull(node2);
    }

    @Test
    public void test024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test024");
        org.jsoup.nodes.SerializedObjectSupporter serializedObjectSupporter0 = new org.jsoup.nodes.SerializedObjectSupporter();
        org.jsoup.nodes.TextNode textNode1 = serializedObjectSupporter0.deserializeObjectTextNode105();
        org.jsoup.nodes.TextNode textNode2 = serializedObjectSupporter0.deserializeObjectTextNode112();
        java.lang.StringBuilder stringBuilder3 = serializedObjectSupporter0.deserializeObjectStringBuilder139();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Document document4 = serializedObjectSupporter0.deserializeObjectDocument129();
// flaky:             org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: org.jsoup.nodes.Document$OutputSettings cannot be cast to org.jsoup.nodes.Document");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
// flaky:         org.junit.Assert.assertNotNull(textNode1);
// flaky:         org.junit.Assert.assertNotNull(textNode2);
        org.junit.Assert.assertNotNull(stringBuilder3);
        org.junit.Assert.assertEquals(stringBuilder3.toString(), "<p>");
    }

    @Test
    public void test025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test025");
        org.jsoup.nodes.SerializedObjectSupporter serializedObjectSupporter0 = new org.jsoup.nodes.SerializedObjectSupporter();
        org.jsoup.nodes.TextNode textNode1 = serializedObjectSupporter0.deserializeObjectTextNode372();
        org.jsoup.nodes.TextNode textNode2 = serializedObjectSupporter0.deserializeObjectTextNode34();
        java.lang.StringBuilder stringBuilder3 = serializedObjectSupporter0.deserializeObjectStringBuilder342();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Document document4 = serializedObjectSupporter0.deserializeObjectDocument390();
// flaky:             org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: org.jsoup.nodes.Document$OutputSettings cannot be cast to org.jsoup.nodes.Document");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
// flaky:         org.junit.Assert.assertNotNull(textNode1);
// flaky:         org.junit.Assert.assertNotNull(textNode2);
        org.junit.Assert.assertNotNull(stringBuilder3);
        org.junit.Assert.assertEquals(stringBuilder3.toString(), "\n0\n<p>");
    }

    @Test
    public void test026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test026");
        org.jsoup.nodes.Document.OutputSettings outputSettings0 = new org.jsoup.nodes.Document.OutputSettings();
        java.nio.charset.Charset charset1 = outputSettings0.charset();
        boolean boolean2 = outputSettings0.getprettyPrint();
        org.junit.Assert.assertNotNull(charset1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test027");
        org.jsoup.nodes.SerializedObjectSupporter serializedObjectSupporter0 = new org.jsoup.nodes.SerializedObjectSupporter();
        org.jsoup.nodes.TextNode textNode1 = serializedObjectSupporter0.deserializeObjectTextNode105();
        org.jsoup.nodes.TextNode textNode2 = serializedObjectSupporter0.deserializeObjectTextNode99();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString61();
        java.lang.StringBuilder stringBuilder4 = serializedObjectSupporter0.deserializeObjectStringBuilder267();
        java.lang.StringBuilder stringBuilder5 = serializedObjectSupporter0.deserializeObjectStringBuilder162();
// flaky:         org.junit.Assert.assertNotNull(textNode1);
// flaky:         org.junit.Assert.assertNotNull(textNode2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Another" + "'", str3, "Another");
        org.junit.Assert.assertNotNull(stringBuilder4);
        org.junit.Assert.assertEquals(stringBuilder4.toString(), "<doc>\n <val>");
        org.junit.Assert.assertNotNull(stringBuilder5);
        org.junit.Assert.assertEquals(stringBuilder5.toString(), "<html>\n <head>\n  <title>Format test</title>\n </head>\n <body>\n  <div>\n   <p>\n    Hello \n    <span>");
    }

    @Test
    public void test028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test028");
        org.jsoup.nodes.SerializedObjectSupporter serializedObjectSupporter0 = new org.jsoup.nodes.SerializedObjectSupporter();
        org.jsoup.nodes.TextNode textNode1 = serializedObjectSupporter0.deserializeObjectTextNode105();
        org.jsoup.nodes.TextNode textNode2 = serializedObjectSupporter0.deserializeObjectTextNode383();
        org.jsoup.nodes.Node node3 = null; // flaky: textNode2.nextSibling();
// flaky:         org.junit.Assert.assertNotNull(textNode1);
// flaky:         org.junit.Assert.assertNotNull(textNode2);
// flaky:         org.junit.Assert.assertNotNull(node3);
    }

    @Test
    public void test029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test029");
        org.jsoup.nodes.SerializedObjectSupporter serializedObjectSupporter0 = new org.jsoup.nodes.SerializedObjectSupporter();
        java.lang.StringBuilder stringBuilder1 = serializedObjectSupporter0.deserializeObjectStringBuilder18();
        org.jsoup.nodes.TextNode textNode2 = serializedObjectSupporter0.deserializeObjectTextNode204();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Document document3 = serializedObjectSupporter0.deserializeObjectDocument105();
// flaky:             org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: org.jsoup.nodes.Document$OutputSettings cannot be cast to org.jsoup.nodes.Document");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(stringBuilder1);
        org.junit.Assert.assertEquals(stringBuilder1.toString(), "<p>This <a>");
// flaky:         org.junit.Assert.assertNotNull(textNode2);
    }

    @Test
    public void test030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test030");
        org.jsoup.nodes.SerializedObjectSupporter serializedObjectSupporter0 = new org.jsoup.nodes.SerializedObjectSupporter();
        org.jsoup.nodes.TextNode textNode1 = serializedObjectSupporter0.deserializeObjectTextNode105();
        org.jsoup.nodes.TextNode textNode2 = serializedObjectSupporter0.deserializeObjectTextNode266();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Document document3 = serializedObjectSupporter0.deserializeObjectDocument195();
// flaky:             org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: org.jsoup.nodes.Document$OutputSettings cannot be cast to org.jsoup.nodes.Document");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
// flaky:         org.junit.Assert.assertNotNull(textNode1);
// flaky:         org.junit.Assert.assertNotNull(textNode2);
    }

    @Test
    public void test031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test031");
        org.jsoup.nodes.SerializedObjectSupporter serializedObjectSupporter0 = new org.jsoup.nodes.SerializedObjectSupporter();
        java.lang.StringBuilder stringBuilder1 = serializedObjectSupporter0.deserializeObjectStringBuilder18();
        org.jsoup.nodes.TextNode textNode2 = serializedObjectSupporter0.deserializeObjectTextNode252();
        java.lang.StringBuilder stringBuilder3 = serializedObjectSupporter0.deserializeObjectStringBuilder361();
        org.junit.Assert.assertNotNull(stringBuilder1);
        org.junit.Assert.assertEquals(stringBuilder1.toString(), "<p>This <a>");
// flaky:         org.junit.Assert.assertNotNull(textNode2);
        org.junit.Assert.assertNotNull(stringBuilder3);
        org.junit.Assert.assertEquals(stringBuilder3.toString(), "<table>\n <tbody>\n  <tr>\n   <td>aaa</td>\n   <td>");
    }

    @Test
    public void test032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test032");
        org.jsoup.nodes.Document.OutputSettings outputSettings0 = new org.jsoup.nodes.Document.OutputSettings();
        java.nio.charset.Charset charset1 = outputSettings0.charset();
        org.jsoup.nodes.Document.OutputSettings outputSettings2 = outputSettings0.clone();
        org.jsoup.nodes.Document.OutputSettings outputSettings3 = new org.jsoup.nodes.Document.OutputSettings();
        java.nio.charset.Charset charset4 = outputSettings3.charset();
        org.jsoup.nodes.Document.OutputSettings outputSettings5 = outputSettings3.clone();
        java.nio.charset.CharsetEncoder charsetEncoder6 = outputSettings3.encoder();
        outputSettings0.charsetEncoder = charsetEncoder6;
        boolean boolean8 = outputSettings0.getforceAllElementAsBlock();
        org.junit.Assert.assertNotNull(charset1);
        org.junit.Assert.assertNotNull(outputSettings2);
        org.junit.Assert.assertNotNull(charset4);
        org.junit.Assert.assertNotNull(outputSettings5);
        org.junit.Assert.assertNotNull(charsetEncoder6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test033");
        org.jsoup.nodes.SerializedObjectSupporter serializedObjectSupporter0 = new org.jsoup.nodes.SerializedObjectSupporter();
        org.jsoup.nodes.TextNode textNode1 = serializedObjectSupporter0.deserializeObjectTextNode372();
        org.jsoup.nodes.TextNode textNode2 = serializedObjectSupporter0.deserializeObjectTextNode34();
        java.lang.StringBuilder stringBuilder3 = serializedObjectSupporter0.deserializeObjectStringBuilder342();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Document document4 = serializedObjectSupporter0.deserializeObjectDocument157();
// flaky:             org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: org.jsoup.nodes.Document$OutputSettings cannot be cast to org.jsoup.nodes.Document");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
// flaky:         org.junit.Assert.assertNotNull(textNode1);
// flaky:         org.junit.Assert.assertNotNull(textNode2);
        org.junit.Assert.assertNotNull(stringBuilder3);
        org.junit.Assert.assertEquals(stringBuilder3.toString(), "\n0\n<p>");
    }

    @Test
    public void test034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test034");
        org.jsoup.nodes.Document.OutputSettings outputSettings0 = new org.jsoup.nodes.Document.OutputSettings();
        java.nio.charset.Charset charset1 = outputSettings0.charset();
        org.jsoup.nodes.Document.OutputSettings outputSettings2 = outputSettings0.clone();
        java.nio.charset.CharsetEncoder charsetEncoder3 = outputSettings0.encoder();
        org.jsoup.nodes.Document.OutputSettings outputSettings5 = outputSettings0.prettyPrint(false);
        org.junit.Assert.assertNotNull(charset1);
        org.junit.Assert.assertNotNull(outputSettings2);
        org.junit.Assert.assertNotNull(charsetEncoder3);
        org.junit.Assert.assertNotNull(outputSettings5);
    }

    @Test
    public void test035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test035");
        org.jsoup.nodes.SerializedObjectSupporter serializedObjectSupporter0 = new org.jsoup.nodes.SerializedObjectSupporter();
        org.jsoup.nodes.TextNode textNode1 = serializedObjectSupporter0.deserializeObjectTextNode105();
        org.jsoup.nodes.TextNode textNode2 = serializedObjectSupporter0.deserializeObjectTextNode99();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString61();
        java.lang.StringBuilder stringBuilder4 = serializedObjectSupporter0.deserializeObjectStringBuilder267();
        java.lang.StringBuilder stringBuilder5 = serializedObjectSupporter0.deserializeObjectStringBuilder63();
        org.jsoup.nodes.TextNode textNode6 = serializedObjectSupporter0.deserializeObjectTextNode61();
        java.lang.StringBuilder stringBuilder7 = serializedObjectSupporter0.deserializeObjectStringBuilder397();
// flaky:         org.junit.Assert.assertNotNull(textNode1);
// flaky:         org.junit.Assert.assertNotNull(textNode2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Another" + "'", str3, "Another");
        org.junit.Assert.assertNotNull(stringBuilder4);
        org.junit.Assert.assertEquals(stringBuilder4.toString(), "<doc>\n <val>");
        org.junit.Assert.assertNotNull(stringBuilder5);
        org.junit.Assert.assertEquals(stringBuilder5.toString(), "<p title=\"\u03c0\">");
// flaky:         org.junit.Assert.assertNotNull(textNode6);
        org.junit.Assert.assertNotNull(stringBuilder7);
        org.junit.Assert.assertEquals(stringBuilder7.toString(), "<table> \n <colgroup> \n  <col /> \n </colgroup>\n <colgroup> \n  <col /> \n  <col /> \n  <col /> \n </colgroup>\n <thead> \n  <tr> \n   <th> </th>\n   <th>2008 </th>\n   <th>2007 </th>\n   <th>2006 </th>\n  </tr>\n </thead>\n <tbody> \n  <tr> \n   <th scope=\"rowgroup\"> Research and development </th>\n   <td> $ 1,109 </td>\n   <td> $ 782 </td>\n   <td>");
    }

    @Test
    public void test036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test036");
        org.jsoup.nodes.SerializedObjectSupporter serializedObjectSupporter0 = new org.jsoup.nodes.SerializedObjectSupporter();
        org.jsoup.nodes.TextNode textNode1 = serializedObjectSupporter0.deserializeObjectTextNode105();
        org.jsoup.nodes.TextNode textNode2 = serializedObjectSupporter0.deserializeObjectTextNode99();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Document document3 = serializedObjectSupporter0.deserializeObjectDocument397();
// flaky:             org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: org.jsoup.nodes.Document$OutputSettings cannot be cast to org.jsoup.nodes.Document");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
// flaky:         org.junit.Assert.assertNotNull(textNode1);
// flaky:         org.junit.Assert.assertNotNull(textNode2);
    }

    @Test
    public void test037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test037");
        org.jsoup.nodes.SerializedObjectSupporter serializedObjectSupporter0 = new org.jsoup.nodes.SerializedObjectSupporter();
        org.jsoup.nodes.TextNode textNode1 = serializedObjectSupporter0.deserializeObjectTextNode372();
        java.lang.StringBuilder stringBuilder2 = serializedObjectSupporter0.deserializeObjectStringBuilder33();
        org.jsoup.nodes.TextNode textNode3 = serializedObjectSupporter0.deserializeObjectTextNode400();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Document document4 = serializedObjectSupporter0.deserializeObjectDocument122();
// flaky:             org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: org.jsoup.nodes.Document$OutputSettings cannot be cast to org.jsoup.nodes.Document");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
// flaky:         org.junit.Assert.assertNotNull(textNode1);
        org.junit.Assert.assertNotNull(stringBuilder2);
        org.junit.Assert.assertEquals(stringBuilder2.toString(), "<div>\n <p><b>This</b>");
// flaky:         org.junit.Assert.assertNotNull(textNode3);
    }

    @Test
    public void test038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test038");
        org.jsoup.nodes.SerializedObjectSupporter serializedObjectSupporter0 = new org.jsoup.nodes.SerializedObjectSupporter();
        org.jsoup.nodes.TextNode textNode1 = serializedObjectSupporter0.deserializeObjectTextNode372();
        org.jsoup.nodes.TextNode textNode2 = serializedObjectSupporter0.deserializeObjectTextNode34();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Document document3 = serializedObjectSupporter0.deserializeObjectDocument238();
// flaky:             org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: org.jsoup.nodes.Document$OutputSettings cannot be cast to org.jsoup.nodes.Document");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
// flaky:         org.junit.Assert.assertNotNull(textNode1);
// flaky:         org.junit.Assert.assertNotNull(textNode2);
    }

    @Test
    public void test039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test039");
        org.jsoup.nodes.SerializedObjectSupporter serializedObjectSupporter0 = new org.jsoup.nodes.SerializedObjectSupporter();
        org.jsoup.nodes.TextNode textNode1 = serializedObjectSupporter0.deserializeObjectTextNode105();
        org.jsoup.nodes.TextNode textNode2 = serializedObjectSupporter0.deserializeObjectTextNode99();
        org.jsoup.nodes.TextNode textNode3 = serializedObjectSupporter0.deserializeObjectTextNode303();
        org.jsoup.nodes.TextNode textNode4 = serializedObjectSupporter0.deserializeObjectTextNode342();
// flaky:         org.junit.Assert.assertNotNull(textNode1);
// flaky:         org.junit.Assert.assertNotNull(textNode2);
// flaky:         org.junit.Assert.assertNotNull(textNode3);
// flaky:         org.junit.Assert.assertNotNull(textNode4);
    }

    @Test
    public void test040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test040");
        org.jsoup.nodes.SerializedObjectSupporter serializedObjectSupporter0 = new org.jsoup.nodes.SerializedObjectSupporter();
        java.lang.StringBuilder stringBuilder1 = serializedObjectSupporter0.deserializeObjectStringBuilder18();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Document document2 = serializedObjectSupporter0.deserializeObjectDocument21();
// flaky:             org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: org.jsoup.nodes.Document$OutputSettings cannot be cast to org.jsoup.nodes.Document");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(stringBuilder1);
        org.junit.Assert.assertEquals(stringBuilder1.toString(), "<p>This <a>");
    }

    @Test
    public void test041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test041");
        org.jsoup.nodes.SerializedObjectSupporter serializedObjectSupporter0 = new org.jsoup.nodes.SerializedObjectSupporter();
        org.jsoup.nodes.TextNode textNode1 = serializedObjectSupporter0.deserializeObjectTextNode105();
        org.jsoup.nodes.TextNode textNode2 = serializedObjectSupporter0.deserializeObjectTextNode99();
        org.jsoup.nodes.TextNode textNode3 = serializedObjectSupporter0.deserializeObjectTextNode303();
        org.jsoup.nodes.TextNode textNode4 = serializedObjectSupporter0.deserializeObjectTextNode38();
        org.jsoup.nodes.TextNode textNode5 = serializedObjectSupporter0.deserializeObjectTextNode204();
        org.jsoup.nodes.TextNode textNode6 = serializedObjectSupporter0.deserializeObjectTextNode21();
// flaky:         org.junit.Assert.assertNotNull(textNode1);
// flaky:         org.junit.Assert.assertNotNull(textNode2);
// flaky:         org.junit.Assert.assertNotNull(textNode3);
// flaky:         org.junit.Assert.assertNotNull(textNode4);
// flaky:         org.junit.Assert.assertNotNull(textNode5);
// flaky:         org.junit.Assert.assertNotNull(textNode6);
    }

    @Test
    public void test042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test042");
        org.jsoup.nodes.SerializedObjectSupporter serializedObjectSupporter0 = new org.jsoup.nodes.SerializedObjectSupporter();
        java.lang.StringBuilder stringBuilder1 = serializedObjectSupporter0.deserializeObjectStringBuilder18();
        org.jsoup.nodes.TextNode textNode2 = serializedObjectSupporter0.deserializeObjectTextNode204();
        java.lang.StringBuilder stringBuilder3 = serializedObjectSupporter0.deserializeObjectStringBuilder327();
        org.junit.Assert.assertNotNull(stringBuilder1);
        org.junit.Assert.assertEquals(stringBuilder1.toString(), "<p>This <a>");
// flaky:         org.junit.Assert.assertNotNull(textNode2);
        org.junit.Assert.assertNotNull(stringBuilder3);
        org.junit.Assert.assertEquals(stringBuilder3.toString(), "<b>1</b>\n<p><b>");
    }

    @Test
    public void test043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test043");
        org.jsoup.nodes.SerializedObjectSupporter serializedObjectSupporter0 = new org.jsoup.nodes.SerializedObjectSupporter();
        java.lang.String str1 = serializedObjectSupporter0.deserializeObjectString130();
        java.lang.StringBuilder stringBuilder2 = serializedObjectSupporter0.deserializeObjectStringBuilder312();
        java.lang.StringBuilder stringBuilder3 = serializedObjectSupporter0.deserializeObjectStringBuilder244();
        java.lang.StringBuilder stringBuilder4 = serializedObjectSupporter0.deserializeObjectStringBuilder2();
        org.jsoup.nodes.TextNode textNode5 = serializedObjectSupporter0.deserializeObjectTextNode229();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "X\n" + "'", str1, "X\n");
        org.junit.Assert.assertNotNull(stringBuilder2);
        org.junit.Assert.assertEquals(stringBuilder2.toString(), "<html>\n <head>\n  <noscript></noscript>\n </head>\n <body>\n  <img src=\"foo\" />\n  <p>");
        org.junit.Assert.assertNotNull(stringBuilder3);
        org.junit.Assert.assertEquals(stringBuilder3.toString(), "<p>");
        org.junit.Assert.assertNotNull(stringBuilder4);
        org.junit.Assert.assertEquals(stringBuilder4.toString(), "<p><i><b>");
// flaky:         org.junit.Assert.assertNotNull(textNode5);
    }

    @Test
    public void test044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test044");
        org.jsoup.nodes.SerializedObjectSupporter serializedObjectSupporter0 = new org.jsoup.nodes.SerializedObjectSupporter();
        org.jsoup.nodes.TextNode textNode1 = serializedObjectSupporter0.deserializeObjectTextNode372();
        org.jsoup.nodes.TextNode textNode2 = serializedObjectSupporter0.deserializeObjectTextNode34();
        java.lang.StringBuilder stringBuilder3 = serializedObjectSupporter0.deserializeObjectStringBuilder342();
        java.lang.StringBuilder stringBuilder4 = serializedObjectSupporter0.deserializeObjectStringBuilder416();
        java.lang.StringBuilder stringBuilder5 = serializedObjectSupporter0.deserializeObjectStringBuilder316();
// flaky:         org.junit.Assert.assertNotNull(textNode1);
// flaky:         org.junit.Assert.assertNotNull(textNode2);
        org.junit.Assert.assertNotNull(stringBuilder3);
        org.junit.Assert.assertEquals(stringBuilder3.toString(), "\n0\n<p>");
        org.junit.Assert.assertNotNull(stringBuilder4);
        org.junit.Assert.assertEquals(stringBuilder4.toString(), "<!DOCTYPE html>\n<html>\n<head></head>\n<body>\n<p><b class=\"x\"><b class=\"x\"><b><b class=\"x\"><b class=\"x\"><b>X </b></b></b></b></b></b></p>\n<p><b class=\"x\"><b><b class=\"x\"><b class=\"x\"><b>X </b></b></b></b></b></p>\n<p><b class=\"x\"><b><b class=\"x\"><b class=\"x\"><b><b><b class=\"x\"><b>");
        org.junit.Assert.assertNotNull(stringBuilder5);
        org.junit.Assert.assertEquals(stringBuilder5.toString(), "<a>Hello \n <div>\n  there\n </div> <span>");
    }

    @Test
    public void test045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test045");
        java.lang.String str1 = org.jsoup.nodes.TextNode.normaliseWhitespace("aaa");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "aaa" + "'", str1, "aaa");
    }

    @Test
    public void test046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test046");
        org.jsoup.nodes.SerializedObjectSupporter serializedObjectSupporter0 = new org.jsoup.nodes.SerializedObjectSupporter();
        org.jsoup.nodes.TextNode textNode1 = serializedObjectSupporter0.deserializeObjectTextNode105();
        org.jsoup.nodes.TextNode textNode2 = serializedObjectSupporter0.deserializeObjectTextNode99();
        java.lang.StringBuilder stringBuilder3 = serializedObjectSupporter0.deserializeObjectStringBuilder317();
        java.lang.StringBuilder stringBuilder4 = serializedObjectSupporter0.deserializeObjectStringBuilder231();
        org.jsoup.nodes.TextNode textNode5 = serializedObjectSupporter0.deserializeObjectTextNode47();
// flaky:         org.junit.Assert.assertNotNull(textNode1);
// flaky:         org.junit.Assert.assertNotNull(textNode2);
        org.junit.Assert.assertNotNull(stringBuilder3);
        org.junit.Assert.assertEquals(stringBuilder3.toString(), "<font>");
        org.junit.Assert.assertNotNull(stringBuilder4);
        org.junit.Assert.assertEquals(stringBuilder4.toString(), "<p><a rel=\"nofollow\">Dodgy</a> <a href=\"http://nice.com\" rel=\"nofollow\">");
// flaky:         org.junit.Assert.assertNotNull(textNode5);
    }

    @Test
    public void test047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test047");
        org.jsoup.nodes.SerializedObjectSupporter serializedObjectSupporter0 = new org.jsoup.nodes.SerializedObjectSupporter();
        org.jsoup.nodes.TextNode textNode1 = serializedObjectSupporter0.deserializeObjectTextNode372();
        org.jsoup.nodes.TextNode textNode2 = serializedObjectSupporter0.deserializeObjectTextNode34();
        java.lang.StringBuilder stringBuilder3 = serializedObjectSupporter0.deserializeObjectStringBuilder342();
        java.lang.StringBuilder stringBuilder4 = serializedObjectSupporter0.deserializeObjectStringBuilder416();
        java.lang.StringBuilder stringBuilder5 = serializedObjectSupporter0.deserializeObjectStringBuilder336();
        java.lang.String str6 = serializedObjectSupporter0.deserializeObjectString67();
        org.jsoup.nodes.TextNode textNode7 = serializedObjectSupporter0.deserializeObjectTextNode139();
        org.jsoup.nodes.TextNode textNode8 = serializedObjectSupporter0.deserializeObjectTextNode251();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Document document9 = serializedObjectSupporter0.deserializeObjectDocument208();
// flaky:             org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: org.jsoup.nodes.Document$OutputSettings cannot be cast to org.jsoup.nodes.Document");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
// flaky:         org.junit.Assert.assertNotNull(textNode1);
// flaky:         org.junit.Assert.assertNotNull(textNode2);
        org.junit.Assert.assertNotNull(stringBuilder3);
        org.junit.Assert.assertEquals(stringBuilder3.toString(), "\n0\n<p>");
        org.junit.Assert.assertNotNull(stringBuilder4);
        org.junit.Assert.assertEquals(stringBuilder4.toString(), "<!DOCTYPE html>\n<html>\n<head></head>\n<body>\n<p><b class=\"x\"><b class=\"x\"><b><b class=\"x\"><b class=\"x\"><b>X </b></b></b></b></b></b></p>\n<p><b class=\"x\"><b><b class=\"x\"><b class=\"x\"><b>X </b></b></b></b></b></p>\n<p><b class=\"x\"><b><b class=\"x\"><b class=\"x\"><b><b><b class=\"x\"><b>");
        org.junit.Assert.assertNotNull(stringBuilder5);
        org.junit.Assert.assertEquals(stringBuilder5.toString(), "\n<!-- comment -->\n<!-- comment 2 -->\n<html>\n <head></head>\n <body>\n  <p>");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + " three" + "'", str6, " three");
// flaky:         org.junit.Assert.assertNotNull(textNode7);
// flaky:         org.junit.Assert.assertNotNull(textNode8);
    }

    @Test
    public void test048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test048");
        org.jsoup.nodes.SerializedObjectSupporter serializedObjectSupporter0 = new org.jsoup.nodes.SerializedObjectSupporter();
        org.jsoup.nodes.TextNode textNode1 = serializedObjectSupporter0.deserializeObjectTextNode105();
        org.jsoup.nodes.TextNode textNode2 = serializedObjectSupporter0.deserializeObjectTextNode112();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString45();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Document document4 = serializedObjectSupporter0.deserializeObjectDocument8();
// flaky:             org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: org.jsoup.nodes.Document$OutputSettings cannot be cast to org.jsoup.nodes.Document");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
// flaky:         org.junit.Assert.assertNotNull(textNode1);
// flaky:         org.junit.Assert.assertNotNull(textNode2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "there & now > " + "'", str3, "there & now > ");
    }

    @Test
    public void test049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test049");
        org.jsoup.nodes.Document.OutputSettings outputSettings0 = new org.jsoup.nodes.Document.OutputSettings();
        java.nio.charset.Charset charset1 = outputSettings0.charset();
        org.jsoup.nodes.Document.OutputSettings outputSettings2 = outputSettings0.clone();
        java.nio.charset.Charset charset3 = outputSettings0.charset();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Document.OutputSettings outputSettings5 = outputSettings0.indentAmount((-1));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Must be true");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(charset1);
        org.junit.Assert.assertNotNull(outputSettings2);
        org.junit.Assert.assertNotNull(charset3);
    }

    @Test
    public void test050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test050");
        org.jsoup.nodes.SerializedObjectSupporter serializedObjectSupporter0 = new org.jsoup.nodes.SerializedObjectSupporter();
        org.jsoup.nodes.TextNode textNode1 = serializedObjectSupporter0.deserializeObjectTextNode105();
        org.jsoup.nodes.TextNode textNode2 = serializedObjectSupporter0.deserializeObjectTextNode99();
        java.lang.StringBuilder stringBuilder3 = serializedObjectSupporter0.deserializeObjectStringBuilder317();
        java.lang.StringBuilder stringBuilder4 = serializedObjectSupporter0.deserializeObjectStringBuilder231();
        java.lang.StringBuilder stringBuilder5 = serializedObjectSupporter0.deserializeObjectStringBuilder419();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Document document6 = serializedObjectSupporter0.deserializeObjectDocument400();
// flaky:             org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: org.jsoup.nodes.Document$OutputSettings cannot be cast to org.jsoup.nodes.Document");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
// flaky:         org.junit.Assert.assertNotNull(textNode1);
// flaky:         org.junit.Assert.assertNotNull(textNode2);
        org.junit.Assert.assertNotNull(stringBuilder3);
        org.junit.Assert.assertEquals(stringBuilder3.toString(), "<font>");
        org.junit.Assert.assertNotNull(stringBuilder4);
        org.junit.Assert.assertEquals(stringBuilder4.toString(), "<p><a rel=\"nofollow\">Dodgy</a> <a href=\"http://nice.com\" rel=\"nofollow\">");
        org.junit.Assert.assertNotNull(stringBuilder5);
        org.junit.Assert.assertEquals(stringBuilder5.toString(), "<p><b>One</b></p>\n<b>");
    }

    @Test
    public void test051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test051");
        org.jsoup.nodes.SerializedObjectSupporter serializedObjectSupporter0 = new org.jsoup.nodes.SerializedObjectSupporter();
        org.jsoup.nodes.TextNode textNode1 = serializedObjectSupporter0.deserializeObjectTextNode105();
        org.jsoup.nodes.TextNode textNode2 = serializedObjectSupporter0.deserializeObjectTextNode266();
        java.lang.StringBuilder stringBuilder3 = serializedObjectSupporter0.deserializeObjectStringBuilder321();
        java.lang.StringBuilder stringBuilder4 = serializedObjectSupporter0.deserializeObjectStringBuilder343();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Document document5 = serializedObjectSupporter0.deserializeObjectDocument280();
// flaky:             org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: org.jsoup.nodes.Document$OutputSettings cannot be cast to org.jsoup.nodes.Document");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
// flaky:         org.junit.Assert.assertNotNull(textNode1);
// flaky:         org.junit.Assert.assertNotNull(textNode2);
        org.junit.Assert.assertNotNull(stringBuilder3);
        org.junit.Assert.assertEquals(stringBuilder3.toString(), "<p>");
        org.junit.Assert.assertNotNull(stringBuilder4);
        org.junit.Assert.assertEquals(stringBuilder4.toString(), "<p id=\"\ufffd\">");
    }

    @Test
    public void test052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test052");
        org.jsoup.nodes.SerializedObjectSupporter serializedObjectSupporter0 = new org.jsoup.nodes.SerializedObjectSupporter();
        java.lang.String str1 = serializedObjectSupporter0.deserializeObjectString130();
        java.lang.StringBuilder stringBuilder2 = serializedObjectSupporter0.deserializeObjectStringBuilder49();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "X\n" + "'", str1, "X\n");
        org.junit.Assert.assertNotNull(stringBuilder2);
        org.junit.Assert.assertEquals(stringBuilder2.toString(), "");
    }

    @Test
    public void test053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test053");
        org.jsoup.nodes.SerializedObjectSupporter serializedObjectSupporter0 = new org.jsoup.nodes.SerializedObjectSupporter();
        org.jsoup.nodes.TextNode textNode1 = serializedObjectSupporter0.deserializeObjectTextNode372();
        org.jsoup.nodes.TextNode textNode2 = serializedObjectSupporter0.deserializeObjectTextNode34();
        java.lang.StringBuilder stringBuilder3 = serializedObjectSupporter0.deserializeObjectStringBuilder342();
        java.lang.StringBuilder stringBuilder4 = serializedObjectSupporter0.deserializeObjectStringBuilder416();
        java.lang.StringBuilder stringBuilder5 = serializedObjectSupporter0.deserializeObjectStringBuilder336();
        java.lang.String str6 = serializedObjectSupporter0.deserializeObjectString67();
        org.jsoup.nodes.TextNode textNode7 = serializedObjectSupporter0.deserializeObjectTextNode139();
        org.jsoup.nodes.TextNode textNode8 = serializedObjectSupporter0.deserializeObjectTextNode26();
// flaky:         org.junit.Assert.assertNotNull(textNode1);
// flaky:         org.junit.Assert.assertNotNull(textNode2);
        org.junit.Assert.assertNotNull(stringBuilder3);
        org.junit.Assert.assertEquals(stringBuilder3.toString(), "\n0\n<p>");
        org.junit.Assert.assertNotNull(stringBuilder4);
        org.junit.Assert.assertEquals(stringBuilder4.toString(), "<!DOCTYPE html>\n<html>\n<head></head>\n<body>\n<p><b class=\"x\"><b class=\"x\"><b><b class=\"x\"><b class=\"x\"><b>X </b></b></b></b></b></b></p>\n<p><b class=\"x\"><b><b class=\"x\"><b class=\"x\"><b>X </b></b></b></b></b></p>\n<p><b class=\"x\"><b><b class=\"x\"><b class=\"x\"><b><b><b class=\"x\"><b>");
        org.junit.Assert.assertNotNull(stringBuilder5);
        org.junit.Assert.assertEquals(stringBuilder5.toString(), "\n<!-- comment -->\n<!-- comment 2 -->\n<html>\n <head></head>\n <body>\n  <p>");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + " three" + "'", str6, " three");
// flaky:         org.junit.Assert.assertNotNull(textNode7);
// flaky:         org.junit.Assert.assertNotNull(textNode8);
    }

    @Test
    public void test054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test054");
        org.jsoup.nodes.SerializedObjectSupporter serializedObjectSupporter0 = new org.jsoup.nodes.SerializedObjectSupporter();
        org.jsoup.nodes.TextNode textNode1 = serializedObjectSupporter0.deserializeObjectTextNode372();
        java.lang.StringBuilder stringBuilder2 = serializedObjectSupporter0.deserializeObjectStringBuilder33();
        java.lang.StringBuilder stringBuilder3 = serializedObjectSupporter0.deserializeObjectStringBuilder29();
        java.lang.String str4 = serializedObjectSupporter0.deserializeObjectString66();
        org.jsoup.nodes.TextNode textNode5 = serializedObjectSupporter0.deserializeObjectTextNode350();
// flaky:         org.junit.Assert.assertNotNull(textNode1);
        org.junit.Assert.assertNotNull(stringBuilder2);
        org.junit.Assert.assertEquals(stringBuilder2.toString(), "<div>\n <p><b>This</b>");
        org.junit.Assert.assertNotNull(stringBuilder3);
        org.junit.Assert.assertEquals(stringBuilder3.toString(), "<p><b>Bold</b>");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + " Four" + "'", str4, " Four");
// flaky:         org.junit.Assert.assertNotNull(textNode5);
    }

    @Test
    public void test055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test055");
        org.jsoup.nodes.SerializedObjectSupporter serializedObjectSupporter0 = new org.jsoup.nodes.SerializedObjectSupporter();
        org.jsoup.nodes.TextNode textNode1 = serializedObjectSupporter0.deserializeObjectTextNode105();
        org.jsoup.nodes.TextNode textNode2 = serializedObjectSupporter0.deserializeObjectTextNode99();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Document document3 = serializedObjectSupporter0.deserializeObjectDocument223();
// flaky:             org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: org.jsoup.nodes.Document$OutputSettings cannot be cast to org.jsoup.nodes.Document");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
// flaky:         org.junit.Assert.assertNotNull(textNode1);
// flaky:         org.junit.Assert.assertNotNull(textNode2);
    }

    @Test
    public void test056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test056");
        org.jsoup.nodes.SerializedObjectSupporter serializedObjectSupporter0 = new org.jsoup.nodes.SerializedObjectSupporter();
        org.jsoup.nodes.TextNode textNode1 = serializedObjectSupporter0.deserializeObjectTextNode372();
        org.jsoup.nodes.TextNode textNode2 = serializedObjectSupporter0.deserializeObjectTextNode34();
        java.lang.StringBuilder stringBuilder3 = serializedObjectSupporter0.deserializeObjectStringBuilder342();
        org.jsoup.nodes.TextNode textNode4 = serializedObjectSupporter0.deserializeObjectTextNode17();
        org.jsoup.nodes.TextNode textNode5 = serializedObjectSupporter0.deserializeObjectTextNode208();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Document document6 = serializedObjectSupporter0.deserializeObjectDocument226();
// flaky:             org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: org.jsoup.nodes.Document$OutputSettings cannot be cast to org.jsoup.nodes.Document");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
// flaky:         org.junit.Assert.assertNotNull(textNode1);
// flaky:         org.junit.Assert.assertNotNull(textNode2);
        org.junit.Assert.assertNotNull(stringBuilder3);
        org.junit.Assert.assertEquals(stringBuilder3.toString(), "\n0\n<p>");
// flaky:         org.junit.Assert.assertNotNull(textNode4);
// flaky:         org.junit.Assert.assertNotNull(textNode5);
    }

    @Test
    public void test057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test057");
        org.jsoup.nodes.SerializedObjectSupporter serializedObjectSupporter0 = new org.jsoup.nodes.SerializedObjectSupporter();
        org.jsoup.nodes.TextNode textNode1 = serializedObjectSupporter0.deserializeObjectTextNode105();
        org.jsoup.nodes.TextNode textNode2 = serializedObjectSupporter0.deserializeObjectTextNode266();
        java.lang.StringBuilder stringBuilder3 = serializedObjectSupporter0.deserializeObjectStringBuilder321();
        java.lang.StringBuilder stringBuilder4 = serializedObjectSupporter0.deserializeObjectStringBuilder343();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Document document5 = serializedObjectSupporter0.deserializeObjectDocument356();
// flaky:             org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: org.jsoup.nodes.Document$OutputSettings cannot be cast to org.jsoup.nodes.Document");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
// flaky:         org.junit.Assert.assertNotNull(textNode1);
// flaky:         org.junit.Assert.assertNotNull(textNode2);
        org.junit.Assert.assertNotNull(stringBuilder3);
        org.junit.Assert.assertEquals(stringBuilder3.toString(), "<p>");
        org.junit.Assert.assertNotNull(stringBuilder4);
        org.junit.Assert.assertEquals(stringBuilder4.toString(), "<p id=\"\ufffd\">");
    }

    @Test
    public void test058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test058");
        org.jsoup.nodes.SerializedObjectSupporter serializedObjectSupporter0 = new org.jsoup.nodes.SerializedObjectSupporter();
        org.jsoup.nodes.TextNode textNode1 = serializedObjectSupporter0.deserializeObjectTextNode105();
        org.jsoup.nodes.TextNode textNode2 = serializedObjectSupporter0.deserializeObjectTextNode112();
        java.lang.StringBuilder stringBuilder3 = serializedObjectSupporter0.deserializeObjectStringBuilder356();
        org.jsoup.nodes.TextNode textNode4 = serializedObjectSupporter0.deserializeObjectTextNode183();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Document document5 = serializedObjectSupporter0.deserializeObjectDocument350();
// flaky:             org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: org.jsoup.nodes.Document$OutputSettings cannot be cast to org.jsoup.nodes.Document");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
// flaky:         org.junit.Assert.assertNotNull(textNode1);
// flaky:         org.junit.Assert.assertNotNull(textNode2);
        org.junit.Assert.assertNotNull(stringBuilder3);
        org.junit.Assert.assertEquals(stringBuilder3.toString(), "<table>\n <tbody>\n  <tr>\n   <td>1</td>\n  </tr> \n  <tr>\n   <td>2</td>\n  </tr> \n  <tr>\n   <td> \n    <table>\n     <tbody>\n      <tr>\n       <td>3</td>");
// flaky:         org.junit.Assert.assertNotNull(textNode4);
    }

    @Test
    public void test059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test059");
        org.jsoup.nodes.SerializedObjectSupporter serializedObjectSupporter0 = new org.jsoup.nodes.SerializedObjectSupporter();
        org.jsoup.nodes.TextNode textNode1 = serializedObjectSupporter0.deserializeObjectTextNode372();
        org.jsoup.nodes.TextNode textNode2 = serializedObjectSupporter0.deserializeObjectTextNode245();
        org.jsoup.nodes.TextNode textNode3 = serializedObjectSupporter0.deserializeObjectTextNode205();
        org.jsoup.nodes.TextNode textNode4 = serializedObjectSupporter0.deserializeObjectTextNode95();
// flaky:         org.junit.Assert.assertNotNull(textNode1);
// flaky:         org.junit.Assert.assertNotNull(textNode2);
// flaky:         org.junit.Assert.assertNotNull(textNode3);
// flaky:         org.junit.Assert.assertNotNull(textNode4);
    }

    @Test
    public void test060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test060");
        org.jsoup.nodes.SerializedObjectSupporter serializedObjectSupporter0 = new org.jsoup.nodes.SerializedObjectSupporter();
        java.lang.StringBuilder stringBuilder1 = serializedObjectSupporter0.deserializeObjectStringBuilder18();
        java.lang.StringBuilder stringBuilder2 = serializedObjectSupporter0.deserializeObjectStringBuilder55();
        java.lang.StringBuilder stringBuilder3 = serializedObjectSupporter0.deserializeObjectStringBuilder105();
        org.jsoup.nodes.TextNode textNode4 = serializedObjectSupporter0.deserializeObjectTextNode429();
        org.junit.Assert.assertNotNull(stringBuilder1);
        org.junit.Assert.assertEquals(stringBuilder1.toString(), "<p>This <a>");
        org.junit.Assert.assertNotNull(stringBuilder2);
        org.junit.Assert.assertEquals(stringBuilder2.toString(), "<title>");
        org.junit.Assert.assertNotNull(stringBuilder3);
        org.junit.Assert.assertEquals(stringBuilder3.toString(), "<html>\n <head></head>\n <body>\n  <div id=\"1\">\n   <p>Hello</p>\n   <p>");
// flaky:         org.junit.Assert.assertNotNull(textNode4);
    }

    @Test
    public void test061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test061");
        org.jsoup.nodes.SerializedObjectSupporter serializedObjectSupporter0 = new org.jsoup.nodes.SerializedObjectSupporter();
        java.lang.StringBuilder stringBuilder1 = serializedObjectSupporter0.deserializeObjectStringBuilder18();
        org.jsoup.nodes.TextNode textNode2 = serializedObjectSupporter0.deserializeObjectTextNode252();
        java.lang.StringBuilder stringBuilder3 = serializedObjectSupporter0.deserializeObjectStringBuilder241();
        org.jsoup.nodes.TextNode textNode4 = serializedObjectSupporter0.deserializeObjectTextNode29();
        org.jsoup.nodes.TextNode textNode5 = serializedObjectSupporter0.deserializeObjectTextNode345();
        org.junit.Assert.assertNotNull(stringBuilder1);
        org.junit.Assert.assertEquals(stringBuilder1.toString(), "<p>This <a>");
// flaky:         org.junit.Assert.assertNotNull(textNode2);
        org.junit.Assert.assertNotNull(stringBuilder3);
        org.junit.Assert.assertEquals(stringBuilder3.toString(), "<div><p>");
// flaky:         org.junit.Assert.assertNotNull(textNode4);
// flaky:         org.junit.Assert.assertNotNull(textNode5);
    }

    @Test
    public void test062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test062");
        org.jsoup.nodes.SerializedObjectSupporter serializedObjectSupporter0 = new org.jsoup.nodes.SerializedObjectSupporter();
        org.jsoup.nodes.TextNode textNode1 = serializedObjectSupporter0.deserializeObjectTextNode105();
        org.jsoup.nodes.TextNode textNode2 = serializedObjectSupporter0.deserializeObjectTextNode303();
        java.lang.StringBuilder stringBuilder3 = serializedObjectSupporter0.deserializeObjectStringBuilder183();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Document document4 = serializedObjectSupporter0.deserializeObjectDocument116();
// flaky:             org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: org.jsoup.nodes.Document$OutputSettings cannot be cast to org.jsoup.nodes.Document");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
// flaky:         org.junit.Assert.assertNotNull(textNode1);
// flaky:         org.junit.Assert.assertNotNull(textNode2);
        org.junit.Assert.assertNotNull(stringBuilder3);
        org.junit.Assert.assertEquals(stringBuilder3.toString(), "One <span>two &amp;</span>");
    }

    @Test
    public void test063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test063");
        org.jsoup.nodes.SerializedObjectSupporter serializedObjectSupporter0 = new org.jsoup.nodes.SerializedObjectSupporter();
        org.jsoup.nodes.TextNode textNode1 = serializedObjectSupporter0.deserializeObjectTextNode105();
        org.jsoup.nodes.TextNode textNode2 = serializedObjectSupporter0.deserializeObjectTextNode99();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString61();
        org.jsoup.nodes.TextNode textNode4 = serializedObjectSupporter0.deserializeObjectTextNode328();
// flaky:         textNode4.text = "Term";
// flaky:         org.junit.Assert.assertNotNull(textNode1);
// flaky:         org.junit.Assert.assertNotNull(textNode2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Another" + "'", str3, "Another");
// flaky:         org.junit.Assert.assertNotNull(textNode4);
    }

    @Test
    public void test064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test064");
        org.jsoup.nodes.SerializedObjectSupporter serializedObjectSupporter0 = new org.jsoup.nodes.SerializedObjectSupporter();
        org.jsoup.nodes.TextNode textNode1 = serializedObjectSupporter0.deserializeObjectTextNode105();
        org.jsoup.nodes.TextNode textNode2 = serializedObjectSupporter0.deserializeObjectTextNode99();
        java.lang.String str4 = null; // flaky: textNode2.absUrl("Foo ");
// flaky:         org.junit.Assert.assertNotNull(textNode1);
// flaky:         org.junit.Assert.assertNotNull(textNode2);
// flaky:         org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
    }

    @Test
    public void test065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test065");
        org.jsoup.nodes.Document.OutputSettings outputSettings0 = new org.jsoup.nodes.Document.OutputSettings();
        java.nio.charset.Charset charset1 = outputSettings0.charset;
        java.nio.charset.CharsetEncoder charsetEncoder2 = outputSettings0.encoder();
        boolean boolean3 = outputSettings0.forceAllElementAsBlock();
        org.junit.Assert.assertNotNull(charset1);
        org.junit.Assert.assertNotNull(charsetEncoder2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test066");
        org.jsoup.nodes.SerializedObjectSupporter serializedObjectSupporter0 = new org.jsoup.nodes.SerializedObjectSupporter();
        org.jsoup.nodes.TextNode textNode1 = serializedObjectSupporter0.deserializeObjectTextNode105();
        org.jsoup.nodes.TextNode textNode2 = serializedObjectSupporter0.deserializeObjectTextNode99();
        java.lang.StringBuilder stringBuilder3 = serializedObjectSupporter0.deserializeObjectStringBuilder317();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Document document4 = serializedObjectSupporter0.deserializeObjectDocument196();
// flaky:             org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: org.jsoup.nodes.Document$OutputSettings cannot be cast to org.jsoup.nodes.Document");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
// flaky:         org.junit.Assert.assertNotNull(textNode1);
// flaky:         org.junit.Assert.assertNotNull(textNode2);
        org.junit.Assert.assertNotNull(stringBuilder3);
        org.junit.Assert.assertEquals(stringBuilder3.toString(), "<font>");
    }

    @Test
    public void test067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test067");
        org.jsoup.nodes.SerializedObjectSupporter serializedObjectSupporter0 = new org.jsoup.nodes.SerializedObjectSupporter();
        org.jsoup.nodes.TextNode textNode1 = serializedObjectSupporter0.deserializeObjectTextNode105();
        org.jsoup.nodes.TextNode textNode2 = serializedObjectSupporter0.deserializeObjectTextNode99();
        org.jsoup.nodes.TextNode textNode3 = serializedObjectSupporter0.deserializeObjectTextNode21();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.TextNode textNode5 = null; // flaky: textNode3.splitText((int) ' ');
// flaky:             org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Split offset must not be greater than current text length");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
// flaky:         org.junit.Assert.assertNotNull(textNode1);
// flaky:         org.junit.Assert.assertNotNull(textNode2);
// flaky:         org.junit.Assert.assertNotNull(textNode3);
    }

    @Test
    public void test068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test068");
        org.jsoup.nodes.SerializedObjectSupporter serializedObjectSupporter0 = new org.jsoup.nodes.SerializedObjectSupporter();
        org.jsoup.nodes.TextNode textNode1 = serializedObjectSupporter0.deserializeObjectTextNode379();
        org.jsoup.nodes.TextNode textNode2 = serializedObjectSupporter0.deserializeObjectTextNode72();
// flaky:         org.junit.Assert.assertNotNull(textNode1);
// flaky:         org.junit.Assert.assertNotNull(textNode2);
    }

    @Test
    public void test069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test069");
        org.jsoup.nodes.SerializedObjectSupporter serializedObjectSupporter0 = new org.jsoup.nodes.SerializedObjectSupporter();
        org.jsoup.nodes.TextNode textNode1 = serializedObjectSupporter0.deserializeObjectTextNode105();
        org.jsoup.nodes.TextNode textNode2 = serializedObjectSupporter0.deserializeObjectTextNode99();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString61();
        java.lang.StringBuilder stringBuilder4 = serializedObjectSupporter0.deserializeObjectStringBuilder267();
        org.jsoup.nodes.TextNode textNode5 = serializedObjectSupporter0.deserializeObjectTextNode285();
        java.lang.StringBuilder stringBuilder6 = serializedObjectSupporter0.deserializeObjectStringBuilder5();
        java.lang.String str7 = serializedObjectSupporter0.deserializeObjectString37();
// flaky:         org.junit.Assert.assertNotNull(textNode1);
// flaky:         org.junit.Assert.assertNotNull(textNode2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Another" + "'", str3, "Another");
        org.junit.Assert.assertNotNull(stringBuilder4);
        org.junit.Assert.assertEquals(stringBuilder4.toString(), "<doc>\n <val>");
// flaky:         org.junit.Assert.assertNotNull(textNode5);
        org.junit.Assert.assertNotNull(stringBuilder6);
        org.junit.Assert.assertEquals(stringBuilder6.toString(), "<div>");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\u03c0 & < > " + "'", str7, "\u03c0 & < > ");
    }

    @Test
    public void test070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test070");
        org.jsoup.nodes.SerializedObjectSupporter serializedObjectSupporter0 = new org.jsoup.nodes.SerializedObjectSupporter();
        org.jsoup.nodes.TextNode textNode1 = serializedObjectSupporter0.deserializeObjectTextNode372();
        java.lang.StringBuilder stringBuilder2 = serializedObjectSupporter0.deserializeObjectStringBuilder130();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Document document3 = serializedObjectSupporter0.deserializeObjectDocument270();
// flaky:             org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: org.jsoup.nodes.Document$OutputSettings cannot be cast to org.jsoup.nodes.Document");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
// flaky:         org.junit.Assert.assertNotNull(textNode1);
        org.junit.Assert.assertNotNull(stringBuilder2);
        org.junit.Assert.assertEquals(stringBuilder2.toString(), "<em>");
    }

    @Test
    public void test071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test071");
        org.jsoup.nodes.SerializedObjectSupporter serializedObjectSupporter0 = new org.jsoup.nodes.SerializedObjectSupporter();
        org.jsoup.nodes.TextNode textNode1 = serializedObjectSupporter0.deserializeObjectTextNode372();
        java.lang.StringBuilder stringBuilder2 = serializedObjectSupporter0.deserializeObjectStringBuilder33();
        org.jsoup.nodes.TextNode textNode3 = serializedObjectSupporter0.deserializeObjectTextNode400();
        java.lang.String str4 = serializedObjectSupporter0.deserializeObjectString101();
// flaky:         org.junit.Assert.assertNotNull(textNode1);
        org.junit.Assert.assertNotNull(stringBuilder2);
        org.junit.Assert.assertEquals(stringBuilder2.toString(), "<div>\n <p><b>This</b>");
// flaky:         org.junit.Assert.assertNotNull(textNode3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "bbb" + "'", str4, "bbb");
    }

    @Test
    public void test072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test072");
        org.jsoup.nodes.SerializedObjectSupporter serializedObjectSupporter0 = new org.jsoup.nodes.SerializedObjectSupporter();
        java.lang.StringBuilder stringBuilder1 = serializedObjectSupporter0.deserializeObjectStringBuilder18();
        java.lang.StringBuilder stringBuilder2 = serializedObjectSupporter0.deserializeObjectStringBuilder55();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString83();
        org.junit.Assert.assertNotNull(stringBuilder1);
        org.junit.Assert.assertEquals(stringBuilder1.toString(), "<p>This <a>");
        org.junit.Assert.assertNotNull(stringBuilder2);
        org.junit.Assert.assertEquals(stringBuilder2.toString(), "<title>");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Foo " + "'", str3, "Foo ");
    }

    @Test
    public void test073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test073");
        org.jsoup.nodes.SerializedObjectSupporter serializedObjectSupporter0 = new org.jsoup.nodes.SerializedObjectSupporter();
        org.jsoup.nodes.TextNode textNode1 = serializedObjectSupporter0.deserializeObjectTextNode372();
        java.lang.StringBuilder stringBuilder2 = serializedObjectSupporter0.deserializeObjectStringBuilder33();
        java.lang.StringBuilder stringBuilder3 = serializedObjectSupporter0.deserializeObjectStringBuilder29();
        java.lang.StringBuilder stringBuilder4 = serializedObjectSupporter0.deserializeObjectStringBuilder156();
// flaky:         org.junit.Assert.assertNotNull(textNode1);
        org.junit.Assert.assertNotNull(stringBuilder2);
        org.junit.Assert.assertEquals(stringBuilder2.toString(), "<div>\n <p><b>This</b>");
        org.junit.Assert.assertNotNull(stringBuilder3);
        org.junit.Assert.assertEquals(stringBuilder3.toString(), "<p><b>Bold</b>");
        org.junit.Assert.assertNotNull(stringBuilder4);
        org.junit.Assert.assertEquals(stringBuilder4.toString(), "<html>\n <head>\n  <title>Format test</title>\n </head>\n <body>\n  <div>\n   <p>");
    }

    @Test
    public void test074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test074");
        org.jsoup.nodes.SerializedObjectSupporter serializedObjectSupporter0 = new org.jsoup.nodes.SerializedObjectSupporter();
        org.jsoup.nodes.TextNode textNode1 = serializedObjectSupporter0.deserializeObjectTextNode105();
        org.jsoup.nodes.TextNode textNode2 = serializedObjectSupporter0.deserializeObjectTextNode266();
        java.lang.StringBuilder stringBuilder3 = serializedObjectSupporter0.deserializeObjectStringBuilder321();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Document document4 = serializedObjectSupporter0.deserializeObjectDocument139();
// flaky:             org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: org.jsoup.nodes.Document$OutputSettings cannot be cast to org.jsoup.nodes.Document");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
// flaky:         org.junit.Assert.assertNotNull(textNode1);
// flaky:         org.junit.Assert.assertNotNull(textNode2);
        org.junit.Assert.assertNotNull(stringBuilder3);
        org.junit.Assert.assertEquals(stringBuilder3.toString(), "<p>");
    }

    @Test
    public void test075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test075");
        org.jsoup.nodes.SerializedObjectSupporter serializedObjectSupporter0 = new org.jsoup.nodes.SerializedObjectSupporter();
        org.jsoup.nodes.TextNode textNode1 = serializedObjectSupporter0.deserializeObjectTextNode372();
        java.lang.StringBuilder stringBuilder2 = serializedObjectSupporter0.deserializeObjectStringBuilder33();
        java.lang.StringBuilder stringBuilder3 = serializedObjectSupporter0.deserializeObjectStringBuilder29();
        java.lang.String str4 = serializedObjectSupporter0.deserializeObjectString66();
        org.jsoup.nodes.TextNode textNode5 = serializedObjectSupporter0.deserializeObjectTextNode98();
// flaky:         org.junit.Assert.assertNotNull(textNode1);
        org.junit.Assert.assertNotNull(stringBuilder2);
        org.junit.Assert.assertEquals(stringBuilder2.toString(), "<div>\n <p><b>This</b>");
        org.junit.Assert.assertNotNull(stringBuilder3);
        org.junit.Assert.assertEquals(stringBuilder3.toString(), "<p><b>Bold</b>");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + " Four" + "'", str4, " Four");
// flaky:         org.junit.Assert.assertNotNull(textNode5);
    }

    @Test
    public void test076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test076");
        org.jsoup.nodes.SerializedObjectSupporter serializedObjectSupporter0 = new org.jsoup.nodes.SerializedObjectSupporter();
        org.jsoup.nodes.TextNode textNode1 = serializedObjectSupporter0.deserializeObjectTextNode372();
        java.lang.StringBuilder stringBuilder2 = serializedObjectSupporter0.deserializeObjectStringBuilder130();
        java.lang.StringBuilder stringBuilder3 = serializedObjectSupporter0.deserializeObjectStringBuilder252();
        java.lang.String str4 = serializedObjectSupporter0.deserializeObjectString9();
        java.lang.StringBuilder stringBuilder5 = serializedObjectSupporter0.deserializeObjectStringBuilder56();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Document document6 = serializedObjectSupporter0.deserializeObjectDocument199();
// flaky:             org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: org.jsoup.nodes.Document$OutputSettings cannot be cast to org.jsoup.nodes.Document");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
// flaky:         org.junit.Assert.assertNotNull(textNode1);
        org.junit.Assert.assertNotNull(stringBuilder2);
        org.junit.Assert.assertEquals(stringBuilder2.toString(), "<em>");
        org.junit.Assert.assertNotNull(stringBuilder3);
        org.junit.Assert.assertEquals(stringBuilder3.toString(), "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "three" + "'", str4, "three");
        org.junit.Assert.assertNotNull(stringBuilder5);
        org.junit.Assert.assertEquals(stringBuilder5.toString(), "<!DOCTYPE html>\n<html>\n <head>\n  <title>");
    }

    @Test
    public void test077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test077");
        org.jsoup.nodes.SerializedObjectSupporter serializedObjectSupporter0 = new org.jsoup.nodes.SerializedObjectSupporter();
        org.jsoup.nodes.TextNode textNode1 = serializedObjectSupporter0.deserializeObjectTextNode372();
        org.jsoup.nodes.TextNode textNode2 = serializedObjectSupporter0.deserializeObjectTextNode34();
        java.lang.StringBuilder stringBuilder3 = serializedObjectSupporter0.deserializeObjectStringBuilder342();
        java.lang.StringBuilder stringBuilder4 = serializedObjectSupporter0.deserializeObjectStringBuilder416();
        java.lang.StringBuilder stringBuilder5 = serializedObjectSupporter0.deserializeObjectStringBuilder336();
        java.lang.String str6 = serializedObjectSupporter0.deserializeObjectString67();
        org.jsoup.nodes.TextNode textNode7 = serializedObjectSupporter0.deserializeObjectTextNode139();
        org.jsoup.nodes.TextNode textNode8 = serializedObjectSupporter0.deserializeObjectTextNode251();
        java.lang.String str9 = serializedObjectSupporter0.deserializeObjectString47();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Document document10 = serializedObjectSupporter0.deserializeObjectDocument166();
// flaky:             org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: org.jsoup.nodes.Document$OutputSettings cannot be cast to org.jsoup.nodes.Document");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
// flaky:         org.junit.Assert.assertNotNull(textNode1);
// flaky:         org.junit.Assert.assertNotNull(textNode2);
        org.junit.Assert.assertNotNull(stringBuilder3);
        org.junit.Assert.assertEquals(stringBuilder3.toString(), "\n0\n<p>");
        org.junit.Assert.assertNotNull(stringBuilder4);
        org.junit.Assert.assertEquals(stringBuilder4.toString(), "<!DOCTYPE html>\n<html>\n<head></head>\n<body>\n<p><b class=\"x\"><b class=\"x\"><b><b class=\"x\"><b class=\"x\"><b>X </b></b></b></b></b></b></p>\n<p><b class=\"x\"><b><b class=\"x\"><b class=\"x\"><b>X </b></b></b></b></b></p>\n<p><b class=\"x\"><b><b class=\"x\"><b class=\"x\"><b><b><b class=\"x\"><b>");
        org.junit.Assert.assertNotNull(stringBuilder5);
        org.junit.Assert.assertEquals(stringBuilder5.toString(), "\n<!-- comment -->\n<!-- comment 2 -->\n<html>\n <head></head>\n <body>\n  <p>");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + " three" + "'", str6, " three");
// flaky:         org.junit.Assert.assertNotNull(textNode7);
// flaky:         org.junit.Assert.assertNotNull(textNode8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "There!" + "'", str9, "There!");
    }

    @Test
    public void test078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test078");
        org.jsoup.nodes.SerializedObjectSupporter serializedObjectSupporter0 = new org.jsoup.nodes.SerializedObjectSupporter();
        org.jsoup.nodes.TextNode textNode1 = serializedObjectSupporter0.deserializeObjectTextNode372();
        java.lang.StringBuilder stringBuilder2 = serializedObjectSupporter0.deserializeObjectStringBuilder33();
        java.lang.StringBuilder stringBuilder3 = serializedObjectSupporter0.deserializeObjectStringBuilder210();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Document document4 = serializedObjectSupporter0.deserializeObjectDocument128();
// flaky:             org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: org.jsoup.nodes.Document$OutputSettings cannot be cast to org.jsoup.nodes.Document");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
// flaky:         org.junit.Assert.assertNotNull(textNode1);
        org.junit.Assert.assertNotNull(stringBuilder2);
        org.junit.Assert.assertEquals(stringBuilder2.toString(), "<div>\n <p><b>This</b>");
        org.junit.Assert.assertNotNull(stringBuilder3);
        org.junit.Assert.assertEquals(stringBuilder3.toString(), "<div>");
    }

    @Test
    public void test079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test079");
        org.jsoup.nodes.SerializedObjectSupporter serializedObjectSupporter0 = new org.jsoup.nodes.SerializedObjectSupporter();
        org.jsoup.nodes.TextNode textNode1 = serializedObjectSupporter0.deserializeObjectTextNode105();
        org.jsoup.nodes.TextNode textNode2 = serializedObjectSupporter0.deserializeObjectTextNode303();
        java.lang.StringBuilder stringBuilder3 = serializedObjectSupporter0.deserializeObjectStringBuilder183();
        java.lang.StringBuilder stringBuilder4 = serializedObjectSupporter0.deserializeObjectStringBuilder367();
// flaky:         org.junit.Assert.assertNotNull(textNode1);
// flaky:         org.junit.Assert.assertNotNull(textNode2);
        org.junit.Assert.assertNotNull(stringBuilder3);
        org.junit.Assert.assertEquals(stringBuilder3.toString(), "One <span>two &amp;</span>");
        org.junit.Assert.assertNotNull(stringBuilder4);
        org.junit.Assert.assertEquals(stringBuilder4.toString(), "<table> \n <tbody>\n  <tr>\n   <td>One </td>\n   <td>\n    <table>\n     <tbody>\n      <tr>\n       <td>");
    }

    @Test
    public void test080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test080");
        org.jsoup.nodes.SerializedObjectSupporter serializedObjectSupporter0 = new org.jsoup.nodes.SerializedObjectSupporter();
        org.jsoup.nodes.TextNode textNode1 = serializedObjectSupporter0.deserializeObjectTextNode372();
        java.lang.StringBuilder stringBuilder2 = serializedObjectSupporter0.deserializeObjectStringBuilder130();
        java.lang.StringBuilder stringBuilder3 = serializedObjectSupporter0.deserializeObjectStringBuilder252();
        java.lang.String str4 = serializedObjectSupporter0.deserializeObjectString9();
        java.lang.StringBuilder stringBuilder5 = serializedObjectSupporter0.deserializeObjectStringBuilder56();
        org.jsoup.nodes.TextNode textNode6 = serializedObjectSupporter0.deserializeObjectTextNode172();
// flaky:         org.junit.Assert.assertNotNull(textNode1);
        org.junit.Assert.assertNotNull(stringBuilder2);
        org.junit.Assert.assertEquals(stringBuilder2.toString(), "<em>");
        org.junit.Assert.assertNotNull(stringBuilder3);
        org.junit.Assert.assertEquals(stringBuilder3.toString(), "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "three" + "'", str4, "three");
        org.junit.Assert.assertNotNull(stringBuilder5);
        org.junit.Assert.assertEquals(stringBuilder5.toString(), "<!DOCTYPE html>\n<html>\n <head>\n  <title>");
// flaky:         org.junit.Assert.assertNotNull(textNode6);
    }

    @Test
    public void test081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test081");
        org.jsoup.nodes.SerializedObjectSupporter serializedObjectSupporter0 = new org.jsoup.nodes.SerializedObjectSupporter();
        org.jsoup.nodes.TextNode textNode1 = serializedObjectSupporter0.deserializeObjectTextNode105();
        org.jsoup.nodes.TextNode textNode2 = serializedObjectSupporter0.deserializeObjectTextNode266();
        java.lang.StringBuilder stringBuilder3 = serializedObjectSupporter0.deserializeObjectStringBuilder321();
        java.lang.StringBuilder stringBuilder4 = serializedObjectSupporter0.deserializeObjectStringBuilder168();
// flaky:         org.junit.Assert.assertNotNull(textNode1);
// flaky:         org.junit.Assert.assertNotNull(textNode2);
        org.junit.Assert.assertNotNull(stringBuilder3);
        org.junit.Assert.assertEquals(stringBuilder3.toString(), "<p>");
        org.junit.Assert.assertNotNull(stringBuilder4);
        org.junit.Assert.assertEquals(stringBuilder4.toString(), "<script>one\ntwo</script>");
    }

    @Test
    public void test082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test082");
        org.jsoup.nodes.SerializedObjectSupporter serializedObjectSupporter0 = new org.jsoup.nodes.SerializedObjectSupporter();
        org.jsoup.nodes.TextNode textNode1 = serializedObjectSupporter0.deserializeObjectTextNode372();
        java.lang.StringBuilder stringBuilder2 = serializedObjectSupporter0.deserializeObjectStringBuilder130();
        org.jsoup.nodes.TextNode textNode3 = serializedObjectSupporter0.deserializeObjectTextNode404();
// flaky:         org.junit.Assert.assertNotNull(textNode1);
        org.junit.Assert.assertNotNull(stringBuilder2);
        org.junit.Assert.assertEquals(stringBuilder2.toString(), "<em>");
// flaky:         org.junit.Assert.assertNotNull(textNode3);
    }

    @Test
    public void test083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test083");
        org.jsoup.nodes.SerializedObjectSupporter serializedObjectSupporter0 = new org.jsoup.nodes.SerializedObjectSupporter();
        org.jsoup.nodes.TextNode textNode1 = serializedObjectSupporter0.deserializeObjectTextNode105();
        org.jsoup.nodes.TextNode textNode2 = serializedObjectSupporter0.deserializeObjectTextNode383();
        org.jsoup.nodes.TextNode textNode3 = serializedObjectSupporter0.deserializeObjectTextNode185();
// flaky:         org.junit.Assert.assertNotNull(textNode1);
// flaky:         org.junit.Assert.assertNotNull(textNode2);
// flaky:         org.junit.Assert.assertNotNull(textNode3);
    }

    @Test
    public void test084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test084");
        org.jsoup.nodes.SerializedObjectSupporter serializedObjectSupporter0 = new org.jsoup.nodes.SerializedObjectSupporter();
        org.jsoup.nodes.TextNode textNode1 = serializedObjectSupporter0.deserializeObjectTextNode105();
        org.jsoup.nodes.TextNode textNode2 = serializedObjectSupporter0.deserializeObjectTextNode99();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString61();
        java.lang.StringBuilder stringBuilder4 = serializedObjectSupporter0.deserializeObjectStringBuilder233();
// flaky:         org.junit.Assert.assertNotNull(textNode1);
// flaky:         org.junit.Assert.assertNotNull(textNode2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Another" + "'", str3, "Another");
        org.junit.Assert.assertNotNull(stringBuilder4);
        org.junit.Assert.assertEquals(stringBuilder4.toString(), "<a>");
    }

    @Test
    public void test085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test085");
        org.jsoup.nodes.SerializedObjectSupporter serializedObjectSupporter0 = new org.jsoup.nodes.SerializedObjectSupporter();
        org.jsoup.nodes.TextNode textNode1 = serializedObjectSupporter0.deserializeObjectTextNode372();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Document document2 = serializedObjectSupporter0.deserializeObjectDocument349();
// flaky:             org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: org.jsoup.nodes.Document$OutputSettings cannot be cast to org.jsoup.nodes.Document");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
// flaky:         org.junit.Assert.assertNotNull(textNode1);
    }

    @Test
    public void test086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test086");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("hi!", "three");
        java.lang.String str3 = textNode2.nodeName();
        org.junit.Assert.assertNotNull(textNode2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "#text" + "'", str3, "#text");
    }

    @Test
    public void test087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test087");
        org.jsoup.nodes.SerializedObjectSupporter serializedObjectSupporter0 = new org.jsoup.nodes.SerializedObjectSupporter();
        org.jsoup.nodes.TextNode textNode1 = serializedObjectSupporter0.deserializeObjectTextNode105();
        java.lang.StringBuilder stringBuilder2 = serializedObjectSupporter0.deserializeObjectStringBuilder350();
        org.jsoup.nodes.TextNode textNode3 = serializedObjectSupporter0.deserializeObjectTextNode401();
// flaky:         org.junit.Assert.assertNotNull(textNode1);
        org.junit.Assert.assertNotNull(stringBuilder2);
        org.junit.Assert.assertEquals(stringBuilder2.toString(), "<table>\n <tbody>\n  <tr>\n   <td>");
// flaky:         org.junit.Assert.assertNotNull(textNode3);
    }

    @Test
    public void test088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test088");
        org.jsoup.nodes.SerializedObjectSupporter serializedObjectSupporter0 = new org.jsoup.nodes.SerializedObjectSupporter();
        org.jsoup.nodes.TextNode textNode1 = serializedObjectSupporter0.deserializeObjectTextNode105();
        org.jsoup.nodes.TextNode textNode2 = serializedObjectSupporter0.deserializeObjectTextNode99();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString61();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Document document4 = serializedObjectSupporter0.deserializeObjectDocument262();
// flaky:             org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: org.jsoup.nodes.Document$OutputSettings cannot be cast to org.jsoup.nodes.Document");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
// flaky:         org.junit.Assert.assertNotNull(textNode1);
// flaky:         org.junit.Assert.assertNotNull(textNode2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Another" + "'", str3, "Another");
    }

    @Test
    public void test089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test089");
        org.jsoup.nodes.SerializedObjectSupporter serializedObjectSupporter0 = new org.jsoup.nodes.SerializedObjectSupporter();
        java.lang.String str1 = serializedObjectSupporter0.deserializeObjectString130();
        java.lang.StringBuilder stringBuilder2 = serializedObjectSupporter0.deserializeObjectStringBuilder312();
        java.lang.StringBuilder stringBuilder3 = serializedObjectSupporter0.deserializeObjectStringBuilder244();
        java.lang.StringBuilder stringBuilder4 = serializedObjectSupporter0.deserializeObjectStringBuilder2();
        java.lang.StringBuilder stringBuilder5 = serializedObjectSupporter0.deserializeObjectStringBuilder211();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "X\n" + "'", str1, "X\n");
        org.junit.Assert.assertNotNull(stringBuilder2);
        org.junit.Assert.assertEquals(stringBuilder2.toString(), "<html>\n <head>\n  <noscript></noscript>\n </head>\n <body>\n  <img src=\"foo\" />\n  <p>");
        org.junit.Assert.assertNotNull(stringBuilder3);
        org.junit.Assert.assertEquals(stringBuilder3.toString(), "<p>");
        org.junit.Assert.assertNotNull(stringBuilder4);
        org.junit.Assert.assertEquals(stringBuilder4.toString(), "<p><i><b>");
        org.junit.Assert.assertNotNull(stringBuilder5);
        org.junit.Assert.assertEquals(stringBuilder5.toString(), "<div>\n One ");
    }

    @Test
    public void test090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test090");
        org.jsoup.nodes.SerializedObjectSupporter serializedObjectSupporter0 = new org.jsoup.nodes.SerializedObjectSupporter();
        java.lang.StringBuilder stringBuilder1 = serializedObjectSupporter0.deserializeObjectStringBuilder18();
        org.jsoup.nodes.TextNode textNode2 = serializedObjectSupporter0.deserializeObjectTextNode4();
        java.lang.StringBuilder stringBuilder3 = serializedObjectSupporter0.deserializeObjectStringBuilder74();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Document document4 = serializedObjectSupporter0.deserializeObjectDocument408();
// flaky:             org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: org.jsoup.nodes.Document$OutputSettings cannot be cast to org.jsoup.nodes.Document");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(stringBuilder1);
        org.junit.Assert.assertEquals(stringBuilder1.toString(), "<p>This <a>");
// flaky:         org.junit.Assert.assertNotNull(textNode2);
        org.junit.Assert.assertNotNull(stringBuilder3);
        org.junit.Assert.assertEquals(stringBuilder3.toString(), "<html>\n <head>\n  <title>");
    }

    @Test
    public void test091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test091");
        org.jsoup.nodes.SerializedObjectSupporter serializedObjectSupporter0 = new org.jsoup.nodes.SerializedObjectSupporter();
        java.lang.String str1 = serializedObjectSupporter0.deserializeObjectString130();
        java.lang.StringBuilder stringBuilder2 = serializedObjectSupporter0.deserializeObjectStringBuilder312();
        java.lang.StringBuilder stringBuilder3 = serializedObjectSupporter0.deserializeObjectStringBuilder244();
        java.lang.StringBuilder stringBuilder4 = serializedObjectSupporter0.deserializeObjectStringBuilder180();
        org.jsoup.nodes.TextNode textNode5 = serializedObjectSupporter0.deserializeObjectTextNode245();
        java.lang.String str6 = serializedObjectSupporter0.deserializeObjectString120();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "X\n" + "'", str1, "X\n");
        org.junit.Assert.assertNotNull(stringBuilder2);
        org.junit.Assert.assertEquals(stringBuilder2.toString(), "<html>\n <head>\n  <noscript></noscript>\n </head>\n <body>\n  <img src=\"foo\" />\n  <p>");
        org.junit.Assert.assertNotNull(stringBuilder3);
        org.junit.Assert.assertEquals(stringBuilder3.toString(), "<p>");
        org.junit.Assert.assertNotNull(stringBuilder4);
        org.junit.Assert.assertEquals(stringBuilder4.toString(), "One <span>two &amp;</span>");
// flaky:         org.junit.Assert.assertNotNull(textNode5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + " 3.4% " + "'", str6, " 3.4% ");
    }

    @Test
    public void test092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test092");
        org.jsoup.nodes.SerializedObjectSupporter serializedObjectSupporter0 = new org.jsoup.nodes.SerializedObjectSupporter();
        org.jsoup.nodes.TextNode textNode1 = serializedObjectSupporter0.deserializeObjectTextNode105();
        java.lang.StringBuilder stringBuilder2 = serializedObjectSupporter0.deserializeObjectStringBuilder350();
        org.jsoup.nodes.TextNode textNode3 = serializedObjectSupporter0.deserializeObjectTextNode401();
        org.jsoup.nodes.TextNode textNode4 = serializedObjectSupporter0.deserializeObjectTextNode173();
// flaky:         org.junit.Assert.assertNotNull(textNode1);
        org.junit.Assert.assertNotNull(stringBuilder2);
        org.junit.Assert.assertEquals(stringBuilder2.toString(), "<table>\n <tbody>\n  <tr>\n   <td>");
// flaky:         org.junit.Assert.assertNotNull(textNode3);
// flaky:         org.junit.Assert.assertNotNull(textNode4);
    }

    @Test
    public void test093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test093");
        org.jsoup.nodes.SerializedObjectSupporter serializedObjectSupporter0 = new org.jsoup.nodes.SerializedObjectSupporter();
        org.jsoup.nodes.TextNode textNode1 = serializedObjectSupporter0.deserializeObjectTextNode105();
        org.jsoup.nodes.TextNode textNode2 = serializedObjectSupporter0.deserializeObjectTextNode99();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString3();
        java.lang.String str4 = serializedObjectSupporter0.deserializeObjectString35();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Document document5 = serializedObjectSupporter0.deserializeObjectDocument179();
// flaky:             org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: org.jsoup.nodes.Document$OutputSettings cannot be cast to org.jsoup.nodes.Document");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
// flaky:         org.junit.Assert.assertNotNull(textNode1);
// flaky:         org.junit.Assert.assertNotNull(textNode2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "This" + "'", str3, "This");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "two" + "'", str4, "two");
    }

    @Test
    public void test094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test094");
        org.jsoup.nodes.SerializedObjectSupporter serializedObjectSupporter0 = new org.jsoup.nodes.SerializedObjectSupporter();
        java.lang.StringBuilder stringBuilder1 = serializedObjectSupporter0.deserializeObjectStringBuilder18();
        org.jsoup.nodes.TextNode textNode2 = serializedObjectSupporter0.deserializeObjectTextNode204();
        org.jsoup.nodes.TextNode textNode3 = serializedObjectSupporter0.deserializeObjectTextNode15();
        java.lang.StringBuilder stringBuilder4 = serializedObjectSupporter0.deserializeObjectStringBuilder42();
        java.lang.StringBuilder stringBuilder5 = serializedObjectSupporter0.deserializeObjectStringBuilder9();
        org.junit.Assert.assertNotNull(stringBuilder1);
        org.junit.Assert.assertEquals(stringBuilder1.toString(), "<p>This <a>");
// flaky:         org.junit.Assert.assertNotNull(textNode2);
// flaky:         org.junit.Assert.assertNotNull(textNode3);
        org.junit.Assert.assertNotNull(stringBuilder4);
        org.junit.Assert.assertEquals(stringBuilder4.toString(), "<a>One</a> Two Three \n<i>Four</i>");
        org.junit.Assert.assertNotNull(stringBuilder5);
        org.junit.Assert.assertEquals(stringBuilder5.toString(), "<textarea>");
    }

    @Test
    public void test095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test095");
        org.jsoup.nodes.SerializedObjectSupporter serializedObjectSupporter0 = new org.jsoup.nodes.SerializedObjectSupporter();
        org.jsoup.nodes.TextNode textNode1 = serializedObjectSupporter0.deserializeObjectTextNode372();
        java.lang.StringBuilder stringBuilder2 = serializedObjectSupporter0.deserializeObjectStringBuilder130();
        java.lang.StringBuilder stringBuilder3 = serializedObjectSupporter0.deserializeObjectStringBuilder252();
        java.lang.String str4 = serializedObjectSupporter0.deserializeObjectString9();
        org.jsoup.nodes.TextNode textNode5 = serializedObjectSupporter0.deserializeObjectTextNode169();
        java.lang.StringBuilder stringBuilder6 = serializedObjectSupporter0.deserializeObjectStringBuilder5();
// flaky:         org.junit.Assert.assertNotNull(textNode1);
        org.junit.Assert.assertNotNull(stringBuilder2);
        org.junit.Assert.assertEquals(stringBuilder2.toString(), "<em>");
        org.junit.Assert.assertNotNull(stringBuilder3);
        org.junit.Assert.assertEquals(stringBuilder3.toString(), "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "three" + "'", str4, "three");
// flaky:         org.junit.Assert.assertNotNull(textNode5);
        org.junit.Assert.assertNotNull(stringBuilder6);
        org.junit.Assert.assertEquals(stringBuilder6.toString(), "<div>");
    }

    @Test
    public void test096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test096");
        org.jsoup.nodes.SerializedObjectSupporter serializedObjectSupporter0 = new org.jsoup.nodes.SerializedObjectSupporter();
        org.jsoup.nodes.TextNode textNode1 = serializedObjectSupporter0.deserializeObjectTextNode105();
        org.jsoup.nodes.TextNode textNode2 = serializedObjectSupporter0.deserializeObjectTextNode99();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString61();
        org.jsoup.nodes.TextNode textNode4 = serializedObjectSupporter0.deserializeObjectTextNode328();
        org.jsoup.nodes.TextNode textNode5 = serializedObjectSupporter0.deserializeObjectTextNode392();
// flaky:         org.junit.Assert.assertNotNull(textNode1);
// flaky:         org.junit.Assert.assertNotNull(textNode2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Another" + "'", str3, "Another");
// flaky:         org.junit.Assert.assertNotNull(textNode4);
// flaky:         org.junit.Assert.assertNotNull(textNode5);
    }

    @Test
    public void test097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test097");
        org.jsoup.nodes.SerializedObjectSupporter serializedObjectSupporter0 = new org.jsoup.nodes.SerializedObjectSupporter();
        java.lang.String str1 = serializedObjectSupporter0.deserializeObjectString130();
        java.lang.StringBuilder stringBuilder2 = serializedObjectSupporter0.deserializeObjectStringBuilder312();
        java.lang.StringBuilder stringBuilder3 = serializedObjectSupporter0.deserializeObjectStringBuilder244();
        java.lang.StringBuilder stringBuilder4 = serializedObjectSupporter0.deserializeObjectStringBuilder180();
        java.lang.StringBuilder stringBuilder5 = serializedObjectSupporter0.deserializeObjectStringBuilder152();
        java.lang.String str6 = serializedObjectSupporter0.deserializeObjectString60();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "X\n" + "'", str1, "X\n");
        org.junit.Assert.assertNotNull(stringBuilder2);
        org.junit.Assert.assertEquals(stringBuilder2.toString(), "<html>\n <head>\n  <noscript></noscript>\n </head>\n <body>\n  <img src=\"foo\" />\n  <p>");
        org.junit.Assert.assertNotNull(stringBuilder3);
        org.junit.Assert.assertEquals(stringBuilder3.toString(), "<p>");
        org.junit.Assert.assertNotNull(stringBuilder4);
        org.junit.Assert.assertEquals(stringBuilder4.toString(), "One <span>two &amp;</span>");
        org.junit.Assert.assertNotNull(stringBuilder5);
        org.junit.Assert.assertEquals(stringBuilder5.toString(), "<html>\n <head></head>\n <body>\n  <div title=\"Tags &amp;c.\">\n   <img src=\"foo.png\" />\n   <p>\n    <!-- comment -->");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "\n" + "'", str6, "\n");
    }

    @Test
    public void test098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test098");
        org.jsoup.nodes.SerializedObjectSupporter serializedObjectSupporter0 = new org.jsoup.nodes.SerializedObjectSupporter();
        org.jsoup.nodes.TextNode textNode1 = serializedObjectSupporter0.deserializeObjectTextNode372();
        org.jsoup.nodes.TextNode textNode2 = serializedObjectSupporter0.deserializeObjectTextNode34();
        java.lang.StringBuilder stringBuilder3 = serializedObjectSupporter0.deserializeObjectStringBuilder342();
        java.lang.StringBuilder stringBuilder4 = serializedObjectSupporter0.deserializeObjectStringBuilder165();
        java.lang.StringBuilder stringBuilder5 = serializedObjectSupporter0.deserializeObjectStringBuilder67();
        java.lang.String str6 = serializedObjectSupporter0.deserializeObjectString35();
        java.lang.String str7 = serializedObjectSupporter0.deserializeObjectString13();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Document document8 = serializedObjectSupporter0.deserializeObjectDocument279();
// flaky:             org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: org.jsoup.nodes.Document$OutputSettings cannot be cast to org.jsoup.nodes.Document");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
// flaky:         org.junit.Assert.assertNotNull(textNode1);
// flaky:         org.junit.Assert.assertNotNull(textNode2);
        org.junit.Assert.assertNotNull(stringBuilder3);
        org.junit.Assert.assertEquals(stringBuilder3.toString(), "\n0\n<p>");
        org.junit.Assert.assertNotNull(stringBuilder4);
        org.junit.Assert.assertEquals(stringBuilder4.toString(), "<html>\n<head></head>\n<body>\n<div>\n<p>");
        org.junit.Assert.assertNotNull(stringBuilder5);
        org.junit.Assert.assertEquals(stringBuilder5.toString(), "<html>\n <head>\n  <title>Hello</title>");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "two" + "'", str6, "two");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "." + "'", str7, ".");
    }

    @Test
    public void test099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test099");
        org.jsoup.nodes.SerializedObjectSupporter serializedObjectSupporter0 = new org.jsoup.nodes.SerializedObjectSupporter();
        org.jsoup.nodes.TextNode textNode1 = serializedObjectSupporter0.deserializeObjectTextNode105();
        org.jsoup.nodes.TextNode textNode2 = serializedObjectSupporter0.deserializeObjectTextNode266();
        java.lang.StringBuilder stringBuilder3 = serializedObjectSupporter0.deserializeObjectStringBuilder321();
        org.jsoup.nodes.TextNode textNode4 = serializedObjectSupporter0.deserializeObjectTextNode369();
// flaky:         org.junit.Assert.assertNotNull(textNode1);
// flaky:         org.junit.Assert.assertNotNull(textNode2);
        org.junit.Assert.assertNotNull(stringBuilder3);
        org.junit.Assert.assertEquals(stringBuilder3.toString(), "<p>");
// flaky:         org.junit.Assert.assertNotNull(textNode4);
    }

    @Test
    public void test100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test100");
        org.jsoup.nodes.SerializedObjectSupporter serializedObjectSupporter0 = new org.jsoup.nodes.SerializedObjectSupporter();
        java.lang.StringBuilder stringBuilder1 = serializedObjectSupporter0.deserializeObjectStringBuilder18();
        org.jsoup.nodes.TextNode textNode2 = serializedObjectSupporter0.deserializeObjectTextNode252();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString62();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Document document4 = serializedObjectSupporter0.deserializeObjectDocument74();
// flaky:             org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: org.jsoup.nodes.Document$OutputSettings cannot be cast to org.jsoup.nodes.Document");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(stringBuilder1);
        org.junit.Assert.assertEquals(stringBuilder1.toString(), "<p>This <a>");
// flaky:         org.junit.Assert.assertNotNull(textNode2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "One " + "'", str3, "One ");
    }

    @Test
    public void test101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test101");
        org.jsoup.nodes.SerializedObjectSupporter serializedObjectSupporter0 = new org.jsoup.nodes.SerializedObjectSupporter();
        org.jsoup.nodes.TextNode textNode1 = serializedObjectSupporter0.deserializeObjectTextNode105();
        org.jsoup.nodes.TextNode textNode2 = serializedObjectSupporter0.deserializeObjectTextNode99();
        org.jsoup.nodes.TextNode textNode3 = serializedObjectSupporter0.deserializeObjectTextNode391();
        org.jsoup.nodes.Node node5 = null; // flaky: textNode3.before("\n\tOne\n\tTwo\n\tThree\n");
// flaky:         org.junit.Assert.assertNotNull(textNode1);
// flaky:         org.junit.Assert.assertNotNull(textNode2);
// flaky:         org.junit.Assert.assertNotNull(textNode3);
// flaky:         org.junit.Assert.assertNotNull(node5);
    }

    @Test
    public void test102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test102");
        org.jsoup.nodes.SerializedObjectSupporter serializedObjectSupporter0 = new org.jsoup.nodes.SerializedObjectSupporter();
        org.jsoup.nodes.TextNode textNode1 = serializedObjectSupporter0.deserializeObjectTextNode372();
        java.lang.StringBuilder stringBuilder2 = serializedObjectSupporter0.deserializeObjectStringBuilder130();
        org.jsoup.nodes.TextNode textNode3 = serializedObjectSupporter0.deserializeObjectTextNode374();
// flaky:         org.junit.Assert.assertNotNull(textNode1);
        org.junit.Assert.assertNotNull(stringBuilder2);
        org.junit.Assert.assertEquals(stringBuilder2.toString(), "<em>");
// flaky:         org.junit.Assert.assertNotNull(textNode3);
    }

    @Test
    public void test103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test103");
        org.jsoup.nodes.SerializedObjectSupporter serializedObjectSupporter0 = new org.jsoup.nodes.SerializedObjectSupporter();
        org.jsoup.nodes.TextNode textNode1 = serializedObjectSupporter0.deserializeObjectTextNode46();
// flaky:         org.junit.Assert.assertNotNull(textNode1);
    }

    @Test
    public void test104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test104");
        org.jsoup.nodes.SerializedObjectSupporter serializedObjectSupporter0 = new org.jsoup.nodes.SerializedObjectSupporter();
        org.jsoup.nodes.TextNode textNode1 = serializedObjectSupporter0.deserializeObjectTextNode372();
        org.jsoup.nodes.TextNode textNode2 = serializedObjectSupporter0.deserializeObjectTextNode34();
        java.lang.StringBuilder stringBuilder3 = serializedObjectSupporter0.deserializeObjectStringBuilder342();
        org.jsoup.nodes.TextNode textNode4 = serializedObjectSupporter0.deserializeObjectTextNode17();
        org.jsoup.nodes.TextNode textNode5 = serializedObjectSupporter0.deserializeObjectTextNode208();
        org.jsoup.nodes.TextNode textNode6 = serializedObjectSupporter0.deserializeObjectTextNode218();
        java.lang.StringBuilder stringBuilder7 = serializedObjectSupporter0.deserializeObjectStringBuilder310();
// flaky:         org.junit.Assert.assertNotNull(textNode1);
// flaky:         org.junit.Assert.assertNotNull(textNode2);
        org.junit.Assert.assertNotNull(stringBuilder3);
        org.junit.Assert.assertEquals(stringBuilder3.toString(), "\n0\n<p>");
// flaky:         org.junit.Assert.assertNotNull(textNode4);
// flaky:         org.junit.Assert.assertNotNull(textNode5);
// flaky:         org.junit.Assert.assertNotNull(textNode6);
        org.junit.Assert.assertNotNull(stringBuilder7);
        org.junit.Assert.assertEquals(stringBuilder7.toString(), "<span>Hello \n <div>\n  there\n </div>");
    }

    @Test
    public void test105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test105");
        org.jsoup.nodes.SerializedObjectSupporter serializedObjectSupporter0 = new org.jsoup.nodes.SerializedObjectSupporter();
        java.lang.StringBuilder stringBuilder1 = serializedObjectSupporter0.deserializeObjectStringBuilder18();
        org.jsoup.nodes.TextNode textNode2 = serializedObjectSupporter0.deserializeObjectTextNode4();
        org.jsoup.nodes.TextNode textNode3 = serializedObjectSupporter0.deserializeObjectTextNode238();
        org.jsoup.nodes.TextNode textNode4 = serializedObjectSupporter0.deserializeObjectTextNode281();
        org.jsoup.nodes.TextNode textNode5 = serializedObjectSupporter0.deserializeObjectTextNode160();
        org.jsoup.nodes.TextNode textNode6 = serializedObjectSupporter0.deserializeObjectTextNode49();
        org.junit.Assert.assertNotNull(stringBuilder1);
        org.junit.Assert.assertEquals(stringBuilder1.toString(), "<p>This <a>");
// flaky:         org.junit.Assert.assertNotNull(textNode2);
// flaky:         org.junit.Assert.assertNotNull(textNode3);
// flaky:         org.junit.Assert.assertNotNull(textNode4);
// flaky:         org.junit.Assert.assertNotNull(textNode5);
// flaky:         org.junit.Assert.assertNotNull(textNode6);
    }

    @Test
    public void test106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test106");
        org.jsoup.nodes.SerializedObjectSupporter serializedObjectSupporter0 = new org.jsoup.nodes.SerializedObjectSupporter();
        org.jsoup.nodes.TextNode textNode1 = serializedObjectSupporter0.deserializeObjectTextNode105();
        org.jsoup.nodes.TextNode textNode2 = serializedObjectSupporter0.deserializeObjectTextNode99();
        org.jsoup.nodes.TextNode textNode3 = serializedObjectSupporter0.deserializeObjectTextNode21();
        org.jsoup.nodes.TextNode textNode4 = serializedObjectSupporter0.deserializeObjectTextNode167();
// flaky:         org.junit.Assert.assertNotNull(textNode1);
// flaky:         org.junit.Assert.assertNotNull(textNode2);
// flaky:         org.junit.Assert.assertNotNull(textNode3);
// flaky:         org.junit.Assert.assertNotNull(textNode4);
    }

    @Test
    public void test107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test107");
        org.jsoup.nodes.SerializedObjectSupporter serializedObjectSupporter0 = new org.jsoup.nodes.SerializedObjectSupporter();
        org.jsoup.nodes.TextNode textNode1 = serializedObjectSupporter0.deserializeObjectTextNode105();
        java.lang.StringBuilder stringBuilder2 = serializedObjectSupporter0.deserializeObjectStringBuilder350();
        java.lang.StringBuilder stringBuilder3 = serializedObjectSupporter0.deserializeObjectStringBuilder148();
// flaky:         org.junit.Assert.assertNotNull(textNode1);
        org.junit.Assert.assertNotNull(stringBuilder2);
        org.junit.Assert.assertEquals(stringBuilder2.toString(), "<table>\n <tbody>\n  <tr>\n   <td>");
        org.junit.Assert.assertNotNull(stringBuilder3);
        org.junit.Assert.assertEquals(stringBuilder3.toString(), "<div id=\"1\">\n Text \n <p>One</p> Text \n <p>");
    }

    @Test
    public void test108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test108");
        org.jsoup.nodes.SerializedObjectSupporter serializedObjectSupporter0 = new org.jsoup.nodes.SerializedObjectSupporter();
        java.lang.StringBuilder stringBuilder1 = serializedObjectSupporter0.deserializeObjectStringBuilder18();
        org.jsoup.nodes.TextNode textNode2 = serializedObjectSupporter0.deserializeObjectTextNode204();
        org.jsoup.nodes.TextNode textNode3 = serializedObjectSupporter0.deserializeObjectTextNode15();
        java.lang.StringBuilder stringBuilder4 = serializedObjectSupporter0.deserializeObjectStringBuilder42();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Document document5 = serializedObjectSupporter0.deserializeObjectDocument281();
// flaky:             org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: org.jsoup.nodes.Document$OutputSettings cannot be cast to org.jsoup.nodes.Document");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(stringBuilder1);
        org.junit.Assert.assertEquals(stringBuilder1.toString(), "<p>This <a>");
// flaky:         org.junit.Assert.assertNotNull(textNode2);
// flaky:         org.junit.Assert.assertNotNull(textNode3);
        org.junit.Assert.assertNotNull(stringBuilder4);
        org.junit.Assert.assertEquals(stringBuilder4.toString(), "<a>One</a> Two Three \n<i>Four</i>");
    }

    @Test
    public void test109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test109");
        org.jsoup.nodes.SerializedObjectSupporter serializedObjectSupporter0 = new org.jsoup.nodes.SerializedObjectSupporter();
        java.lang.StringBuilder stringBuilder1 = serializedObjectSupporter0.deserializeObjectStringBuilder18();
        org.jsoup.nodes.TextNode textNode2 = serializedObjectSupporter0.deserializeObjectTextNode369();
        org.jsoup.nodes.TextNode textNode3 = serializedObjectSupporter0.deserializeObjectTextNode246();
        java.lang.StringBuilder stringBuilder4 = serializedObjectSupporter0.deserializeObjectStringBuilder306();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Document document5 = serializedObjectSupporter0.deserializeObjectDocument192();
// flaky:             org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: org.jsoup.nodes.Document$OutputSettings cannot be cast to org.jsoup.nodes.Document");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(stringBuilder1);
        org.junit.Assert.assertEquals(stringBuilder1.toString(), "<p>This <a>");
// flaky:         org.junit.Assert.assertNotNull(textNode2);
// flaky:         org.junit.Assert.assertNotNull(textNode3);
        org.junit.Assert.assertNotNull(stringBuilder4);
        org.junit.Assert.assertEquals(stringBuilder4.toString(), "<h1>Hello \n <div>\n  There\n </div> now</h1> \n<h2>");
    }

    @Test
    public void test110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test110");
        org.jsoup.nodes.SerializedObjectSupporter serializedObjectSupporter0 = new org.jsoup.nodes.SerializedObjectSupporter();
        java.lang.StringBuilder stringBuilder1 = serializedObjectSupporter0.deserializeObjectStringBuilder18();
        org.jsoup.nodes.TextNode textNode2 = serializedObjectSupporter0.deserializeObjectTextNode4();
        org.jsoup.nodes.TextNode textNode3 = serializedObjectSupporter0.deserializeObjectTextNode238();
        org.jsoup.nodes.TextNode textNode4 = serializedObjectSupporter0.deserializeObjectTextNode281();
        java.lang.String str5 = serializedObjectSupporter0.deserializeObjectString65();
        org.junit.Assert.assertNotNull(stringBuilder1);
        org.junit.Assert.assertEquals(stringBuilder1.toString(), "<p>This <a>");
// flaky:         org.junit.Assert.assertNotNull(textNode2);
// flaky:         org.junit.Assert.assertNotNull(textNode3);
// flaky:         org.junit.Assert.assertNotNull(textNode4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Two " + "'", str5, "Two ");
    }

    @Test
    public void test111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test111");
        org.jsoup.nodes.SerializedObjectSupporter serializedObjectSupporter0 = new org.jsoup.nodes.SerializedObjectSupporter();
        java.lang.StringBuilder stringBuilder1 = serializedObjectSupporter0.deserializeObjectStringBuilder18();
        java.lang.StringBuilder stringBuilder2 = serializedObjectSupporter0.deserializeObjectStringBuilder55();
        java.lang.StringBuilder stringBuilder3 = serializedObjectSupporter0.deserializeObjectStringBuilder105();
        org.jsoup.nodes.TextNode textNode4 = serializedObjectSupporter0.deserializeObjectTextNode313();
        org.junit.Assert.assertNotNull(stringBuilder1);
        org.junit.Assert.assertEquals(stringBuilder1.toString(), "<p>This <a>");
        org.junit.Assert.assertNotNull(stringBuilder2);
        org.junit.Assert.assertEquals(stringBuilder2.toString(), "<title>");
        org.junit.Assert.assertNotNull(stringBuilder3);
        org.junit.Assert.assertEquals(stringBuilder3.toString(), "<html>\n <head></head>\n <body>\n  <div id=\"1\">\n   <p>Hello</p>\n   <p>");
// flaky:         org.junit.Assert.assertNotNull(textNode4);
    }

    @Test
    public void test112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test112");
        org.jsoup.nodes.SerializedObjectSupporter serializedObjectSupporter0 = new org.jsoup.nodes.SerializedObjectSupporter();
        org.jsoup.nodes.TextNode textNode1 = serializedObjectSupporter0.deserializeObjectTextNode105();
        org.jsoup.nodes.TextNode textNode2 = serializedObjectSupporter0.deserializeObjectTextNode99();
        org.jsoup.nodes.TextNode textNode3 = serializedObjectSupporter0.deserializeObjectTextNode303();
        org.jsoup.nodes.TextNode textNode4 = serializedObjectSupporter0.deserializeObjectTextNode38();
        org.jsoup.nodes.TextNode textNode5 = serializedObjectSupporter0.deserializeObjectTextNode204();
        java.lang.StringBuilder stringBuilder6 = serializedObjectSupporter0.deserializeObjectStringBuilder269();
// flaky:         org.junit.Assert.assertNotNull(textNode1);
// flaky:         org.junit.Assert.assertNotNull(textNode2);
// flaky:         org.junit.Assert.assertNotNull(textNode3);
// flaky:         org.junit.Assert.assertNotNull(textNode4);
// flaky:         org.junit.Assert.assertNotNull(textNode5);
        org.junit.Assert.assertNotNull(stringBuilder6);
        org.junit.Assert.assertEquals(stringBuilder6.toString(), "<doc>\n <val>\n  One\n  <val>\n   Two\n  </val>");
    }

    @Test
    public void test113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test113");
        org.jsoup.nodes.SerializedObjectSupporter serializedObjectSupporter0 = new org.jsoup.nodes.SerializedObjectSupporter();
        org.jsoup.nodes.TextNode textNode1 = serializedObjectSupporter0.deserializeObjectTextNode105();
        org.jsoup.nodes.TextNode textNode2 = serializedObjectSupporter0.deserializeObjectTextNode99();
        org.jsoup.nodes.TextNode textNode3 = serializedObjectSupporter0.deserializeObjectTextNode21();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Document document4 = serializedObjectSupporter0.deserializeObjectDocument103();
// flaky:             org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: org.jsoup.nodes.Document$OutputSettings cannot be cast to org.jsoup.nodes.Document");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
// flaky:         org.junit.Assert.assertNotNull(textNode1);
// flaky:         org.junit.Assert.assertNotNull(textNode2);
// flaky:         org.junit.Assert.assertNotNull(textNode3);
    }

    @Test
    public void test114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test114");
        org.jsoup.nodes.SerializedObjectSupporter serializedObjectSupporter0 = new org.jsoup.nodes.SerializedObjectSupporter();
        org.jsoup.nodes.TextNode textNode1 = serializedObjectSupporter0.deserializeObjectTextNode105();
        org.jsoup.nodes.TextNode textNode2 = serializedObjectSupporter0.deserializeObjectTextNode99();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString61();
        org.jsoup.nodes.TextNode textNode4 = serializedObjectSupporter0.deserializeObjectTextNode328();
        java.lang.StringBuilder stringBuilder5 = serializedObjectSupporter0.deserializeObjectStringBuilder32();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Document document6 = serializedObjectSupporter0.deserializeObjectDocument370();
// flaky:             org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: org.jsoup.nodes.Document$OutputSettings cannot be cast to org.jsoup.nodes.Document");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
// flaky:         org.junit.Assert.assertNotNull(textNode1);
// flaky:         org.junit.Assert.assertNotNull(textNode2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Another" + "'", str3, "Another");
// flaky:         org.junit.Assert.assertNotNull(textNode4);
        org.junit.Assert.assertNotNull(stringBuilder5);
        org.junit.Assert.assertEquals(stringBuilder5.toString(), "<div>\n <p><b>");
    }

    @Test
    public void test115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test115");
        org.jsoup.nodes.SerializedObjectSupporter serializedObjectSupporter0 = new org.jsoup.nodes.SerializedObjectSupporter();
        org.jsoup.nodes.TextNode textNode1 = serializedObjectSupporter0.deserializeObjectTextNode372();
        java.lang.StringBuilder stringBuilder2 = serializedObjectSupporter0.deserializeObjectStringBuilder33();
        java.lang.StringBuilder stringBuilder3 = serializedObjectSupporter0.deserializeObjectStringBuilder29();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Document document4 = serializedObjectSupporter0.deserializeObjectDocument90();
// flaky:             org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: org.jsoup.nodes.Document$OutputSettings cannot be cast to org.jsoup.nodes.Document");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
// flaky:         org.junit.Assert.assertNotNull(textNode1);
        org.junit.Assert.assertNotNull(stringBuilder2);
        org.junit.Assert.assertEquals(stringBuilder2.toString(), "<div>\n <p><b>This</b>");
        org.junit.Assert.assertNotNull(stringBuilder3);
        org.junit.Assert.assertEquals(stringBuilder3.toString(), "<p><b>Bold</b>");
    }

    @Test
    public void test116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test116");
        org.jsoup.nodes.SerializedObjectSupporter serializedObjectSupporter0 = new org.jsoup.nodes.SerializedObjectSupporter();
        org.jsoup.nodes.TextNode textNode1 = serializedObjectSupporter0.deserializeObjectTextNode105();
        org.jsoup.nodes.TextNode textNode2 = serializedObjectSupporter0.deserializeObjectTextNode99();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString61();
        org.jsoup.nodes.TextNode textNode4 = serializedObjectSupporter0.deserializeObjectTextNode328();
        java.lang.StringBuilder stringBuilder5 = serializedObjectSupporter0.deserializeObjectStringBuilder212();
        org.jsoup.nodes.TextNode textNode6 = serializedObjectSupporter0.deserializeObjectTextNode21();
// flaky:         org.junit.Assert.assertNotNull(textNode1);
// flaky:         org.junit.Assert.assertNotNull(textNode2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Another" + "'", str3, "Another");
// flaky:         org.junit.Assert.assertNotNull(textNode4);
        org.junit.Assert.assertNotNull(stringBuilder5);
        org.junit.Assert.assertEquals(stringBuilder5.toString(), "");
// flaky:         org.junit.Assert.assertNotNull(textNode6);
    }

    @Test
    public void test117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test117");
        org.jsoup.nodes.SerializedObjectSupporter serializedObjectSupporter0 = new org.jsoup.nodes.SerializedObjectSupporter();
        java.lang.StringBuilder stringBuilder1 = serializedObjectSupporter0.deserializeObjectStringBuilder18();
        org.jsoup.nodes.TextNode textNode2 = serializedObjectSupporter0.deserializeObjectTextNode369();
        org.jsoup.nodes.TextNode textNode3 = serializedObjectSupporter0.deserializeObjectTextNode246();
        org.jsoup.nodes.TextNode textNode4 = serializedObjectSupporter0.deserializeObjectTextNode258();
        org.junit.Assert.assertNotNull(stringBuilder1);
        org.junit.Assert.assertEquals(stringBuilder1.toString(), "<p>This <a>");
// flaky:         org.junit.Assert.assertNotNull(textNode2);
// flaky:         org.junit.Assert.assertNotNull(textNode3);
// flaky:         org.junit.Assert.assertNotNull(textNode4);
    }

    @Test
    public void test118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test118");
        org.jsoup.nodes.SerializedObjectSupporter serializedObjectSupporter0 = new org.jsoup.nodes.SerializedObjectSupporter();
        org.jsoup.nodes.TextNode textNode1 = serializedObjectSupporter0.deserializeObjectTextNode105();
        org.jsoup.nodes.TextNode textNode2 = serializedObjectSupporter0.deserializeObjectTextNode112();
        java.lang.StringBuilder stringBuilder3 = serializedObjectSupporter0.deserializeObjectStringBuilder356();
        java.lang.StringBuilder stringBuilder4 = serializedObjectSupporter0.deserializeObjectStringBuilder16();
// flaky:         org.junit.Assert.assertNotNull(textNode1);
// flaky:         org.junit.Assert.assertNotNull(textNode2);
        org.junit.Assert.assertNotNull(stringBuilder3);
        org.junit.Assert.assertEquals(stringBuilder3.toString(), "<table>\n <tbody>\n  <tr>\n   <td>1</td>\n  </tr> \n  <tr>\n   <td>2</td>\n  </tr> \n  <tr>\n   <td> \n    <table>\n     <tbody>\n      <tr>\n       <td>3</td>");
        org.junit.Assert.assertNotNull(stringBuilder4);
        org.junit.Assert.assertEquals(stringBuilder4.toString(), "<p>This <span>foo</span><a>is</a> <span>foo</span><a>jsoup</a>");
    }

    @Test
    public void test119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test119");
        org.jsoup.nodes.SerializedObjectSupporter serializedObjectSupporter0 = new org.jsoup.nodes.SerializedObjectSupporter();
        org.jsoup.nodes.TextNode textNode1 = serializedObjectSupporter0.deserializeObjectTextNode105();
        org.jsoup.nodes.TextNode textNode2 = serializedObjectSupporter0.deserializeObjectTextNode99();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString61();
        java.lang.StringBuilder stringBuilder4 = serializedObjectSupporter0.deserializeObjectStringBuilder267();
        org.jsoup.nodes.TextNode textNode5 = serializedObjectSupporter0.deserializeObjectTextNode285();
        java.lang.StringBuilder stringBuilder6 = serializedObjectSupporter0.deserializeObjectStringBuilder231();
        org.jsoup.nodes.TextNode textNode7 = serializedObjectSupporter0.deserializeObjectTextNode43();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Document document8 = serializedObjectSupporter0.deserializeObjectDocument15();
// flaky:             org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: org.jsoup.nodes.Document$OutputSettings cannot be cast to org.jsoup.nodes.Document");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
// flaky:         org.junit.Assert.assertNotNull(textNode1);
// flaky:         org.junit.Assert.assertNotNull(textNode2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Another" + "'", str3, "Another");
        org.junit.Assert.assertNotNull(stringBuilder4);
        org.junit.Assert.assertEquals(stringBuilder4.toString(), "<doc>\n <val>");
// flaky:         org.junit.Assert.assertNotNull(textNode5);
        org.junit.Assert.assertNotNull(stringBuilder6);
        org.junit.Assert.assertEquals(stringBuilder6.toString(), "<p><a rel=\"nofollow\">Dodgy</a> <a href=\"http://nice.com\" rel=\"nofollow\">");
// flaky:         org.junit.Assert.assertNotNull(textNode7);
    }

    @Test
    public void test120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test120");
        org.jsoup.nodes.SerializedObjectSupporter serializedObjectSupporter0 = new org.jsoup.nodes.SerializedObjectSupporter();
        org.jsoup.nodes.TextNode textNode1 = serializedObjectSupporter0.deserializeObjectTextNode105();
        org.jsoup.nodes.TextNode textNode2 = serializedObjectSupporter0.deserializeObjectTextNode99();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString61();
        java.lang.StringBuilder stringBuilder4 = serializedObjectSupporter0.deserializeObjectStringBuilder267();
        org.jsoup.nodes.TextNode textNode5 = serializedObjectSupporter0.deserializeObjectTextNode285();
        java.lang.StringBuilder stringBuilder6 = serializedObjectSupporter0.deserializeObjectStringBuilder5();
        java.lang.StringBuilder stringBuilder7 = serializedObjectSupporter0.deserializeObjectStringBuilder165();
        java.lang.StringBuilder stringBuilder8 = serializedObjectSupporter0.deserializeObjectStringBuilder419();
// flaky:         org.junit.Assert.assertNotNull(textNode1);
// flaky:         org.junit.Assert.assertNotNull(textNode2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Another" + "'", str3, "Another");
        org.junit.Assert.assertNotNull(stringBuilder4);
        org.junit.Assert.assertEquals(stringBuilder4.toString(), "<doc>\n <val>");
// flaky:         org.junit.Assert.assertNotNull(textNode5);
        org.junit.Assert.assertNotNull(stringBuilder6);
        org.junit.Assert.assertEquals(stringBuilder6.toString(), "<div>");
        org.junit.Assert.assertNotNull(stringBuilder7);
        org.junit.Assert.assertEquals(stringBuilder7.toString(), "<html>\n<head></head>\n<body>\n<div>\n<p>");
        org.junit.Assert.assertNotNull(stringBuilder8);
        org.junit.Assert.assertEquals(stringBuilder8.toString(), "<p><b>One</b></p>\n<b>");
    }

    @Test
    public void test121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test121");
        org.jsoup.nodes.SerializedObjectSupporter serializedObjectSupporter0 = new org.jsoup.nodes.SerializedObjectSupporter();
        org.jsoup.nodes.TextNode textNode1 = serializedObjectSupporter0.deserializeObjectTextNode105();
        org.jsoup.nodes.TextNode textNode2 = serializedObjectSupporter0.deserializeObjectTextNode112();
        java.lang.StringBuilder stringBuilder3 = serializedObjectSupporter0.deserializeObjectStringBuilder356();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Document document4 = serializedObjectSupporter0.deserializeObjectDocument406();
// flaky:             org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: org.jsoup.nodes.Document$OutputSettings cannot be cast to org.jsoup.nodes.Document");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
// flaky:         org.junit.Assert.assertNotNull(textNode1);
// flaky:         org.junit.Assert.assertNotNull(textNode2);
        org.junit.Assert.assertNotNull(stringBuilder3);
        org.junit.Assert.assertEquals(stringBuilder3.toString(), "<table>\n <tbody>\n  <tr>\n   <td>1</td>\n  </tr> \n  <tr>\n   <td>2</td>\n  </tr> \n  <tr>\n   <td> \n    <table>\n     <tbody>\n      <tr>\n       <td>3</td>");
    }

    @Test
    public void test122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test122");
        org.jsoup.nodes.SerializedObjectSupporter serializedObjectSupporter0 = new org.jsoup.nodes.SerializedObjectSupporter();
        org.jsoup.nodes.TextNode textNode1 = serializedObjectSupporter0.deserializeObjectTextNode105();
        org.jsoup.nodes.TextNode textNode2 = serializedObjectSupporter0.deserializeObjectTextNode99();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString61();
        java.lang.StringBuilder stringBuilder4 = serializedObjectSupporter0.deserializeObjectStringBuilder267();
        org.jsoup.nodes.TextNode textNode5 = serializedObjectSupporter0.deserializeObjectTextNode285();
        org.jsoup.nodes.TextNode textNode6 = serializedObjectSupporter0.deserializeObjectTextNode174();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Document document7 = serializedObjectSupporter0.deserializeObjectDocument68();
// flaky:             org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: org.jsoup.nodes.Document$OutputSettings cannot be cast to org.jsoup.nodes.Document");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
// flaky:         org.junit.Assert.assertNotNull(textNode1);
// flaky:         org.junit.Assert.assertNotNull(textNode2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Another" + "'", str3, "Another");
        org.junit.Assert.assertNotNull(stringBuilder4);
        org.junit.Assert.assertEquals(stringBuilder4.toString(), "<doc>\n <val>");
// flaky:         org.junit.Assert.assertNotNull(textNode5);
// flaky:         org.junit.Assert.assertNotNull(textNode6);
    }

    @Test
    public void test123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test123");
        org.jsoup.nodes.SerializedObjectSupporter serializedObjectSupporter0 = new org.jsoup.nodes.SerializedObjectSupporter();
        java.lang.StringBuilder stringBuilder1 = serializedObjectSupporter0.deserializeObjectStringBuilder18();
        org.jsoup.nodes.TextNode textNode2 = serializedObjectSupporter0.deserializeObjectTextNode252();
        org.jsoup.nodes.TextNode textNode3 = serializedObjectSupporter0.deserializeObjectTextNode260();
        org.jsoup.nodes.TextNode textNode4 = serializedObjectSupporter0.deserializeObjectTextNode35();
        java.lang.StringBuilder stringBuilder5 = serializedObjectSupporter0.deserializeObjectStringBuilder85();
        org.junit.Assert.assertNotNull(stringBuilder1);
        org.junit.Assert.assertEquals(stringBuilder1.toString(), "<p>This <a>");
// flaky:         org.junit.Assert.assertNotNull(textNode2);
// flaky:         org.junit.Assert.assertNotNull(textNode3);
// flaky:         org.junit.Assert.assertNotNull(textNode4);
        org.junit.Assert.assertNotNull(stringBuilder5);
        org.junit.Assert.assertEquals(stringBuilder5.toString(), "<div>\n <div>\n  one\n </div>\n <div>\n  two\n </div>\n <p>Hello</p>\n <p>");
    }

    @Test
    public void test124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test124");
        org.jsoup.nodes.SerializedObjectSupporter serializedObjectSupporter0 = new org.jsoup.nodes.SerializedObjectSupporter();
        org.jsoup.nodes.TextNode textNode1 = serializedObjectSupporter0.deserializeObjectTextNode372();
        org.jsoup.nodes.TextNode textNode2 = serializedObjectSupporter0.deserializeObjectTextNode34();
        java.lang.StringBuilder stringBuilder3 = serializedObjectSupporter0.deserializeObjectStringBuilder342();
        java.lang.StringBuilder stringBuilder4 = serializedObjectSupporter0.deserializeObjectStringBuilder416();
        java.lang.StringBuilder stringBuilder5 = serializedObjectSupporter0.deserializeObjectStringBuilder336();
        java.lang.String str6 = serializedObjectSupporter0.deserializeObjectString67();
        org.jsoup.nodes.TextNode textNode7 = serializedObjectSupporter0.deserializeObjectTextNode139();
        org.jsoup.nodes.TextNode textNode8 = serializedObjectSupporter0.deserializeObjectTextNode154();
// flaky:         org.junit.Assert.assertNotNull(textNode1);
// flaky:         org.junit.Assert.assertNotNull(textNode2);
        org.junit.Assert.assertNotNull(stringBuilder3);
        org.junit.Assert.assertEquals(stringBuilder3.toString(), "\n0\n<p>");
        org.junit.Assert.assertNotNull(stringBuilder4);
        org.junit.Assert.assertEquals(stringBuilder4.toString(), "<!DOCTYPE html>\n<html>\n<head></head>\n<body>\n<p><b class=\"x\"><b class=\"x\"><b><b class=\"x\"><b class=\"x\"><b>X </b></b></b></b></b></b></p>\n<p><b class=\"x\"><b><b class=\"x\"><b class=\"x\"><b>X </b></b></b></b></b></p>\n<p><b class=\"x\"><b><b class=\"x\"><b class=\"x\"><b><b><b class=\"x\"><b>");
        org.junit.Assert.assertNotNull(stringBuilder5);
        org.junit.Assert.assertEquals(stringBuilder5.toString(), "\n<!-- comment -->\n<!-- comment 2 -->\n<html>\n <head></head>\n <body>\n  <p>");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + " three" + "'", str6, " three");
// flaky:         org.junit.Assert.assertNotNull(textNode7);
// flaky:         org.junit.Assert.assertNotNull(textNode8);
    }

    @Test
    public void test125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test125");
        org.jsoup.nodes.SerializedObjectSupporter serializedObjectSupporter0 = new org.jsoup.nodes.SerializedObjectSupporter();
        org.jsoup.nodes.TextNode textNode1 = serializedObjectSupporter0.deserializeObjectTextNode105();
        org.jsoup.nodes.TextNode textNode2 = serializedObjectSupporter0.deserializeObjectTextNode266();
        java.lang.StringBuilder stringBuilder3 = serializedObjectSupporter0.deserializeObjectStringBuilder321();
        java.lang.StringBuilder stringBuilder4 = serializedObjectSupporter0.deserializeObjectStringBuilder88();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Document document5 = serializedObjectSupporter0.deserializeObjectDocument65();
// flaky:             org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: org.jsoup.nodes.Document$OutputSettings cannot be cast to org.jsoup.nodes.Document");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
// flaky:         org.junit.Assert.assertNotNull(textNode1);
// flaky:         org.junit.Assert.assertNotNull(textNode2);
        org.junit.Assert.assertNotNull(stringBuilder3);
        org.junit.Assert.assertEquals(stringBuilder3.toString(), "<p>");
        org.junit.Assert.assertNotNull(stringBuilder4);
        org.junit.Assert.assertEquals(stringBuilder4.toString(), "<div>\n <p>Hello</p>\n <div>");
    }

    @Test
    public void test126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test126");
        org.jsoup.nodes.SerializedObjectSupporter serializedObjectSupporter0 = new org.jsoup.nodes.SerializedObjectSupporter();
        org.jsoup.nodes.TextNode textNode1 = serializedObjectSupporter0.deserializeObjectTextNode105();
        org.jsoup.nodes.TextNode textNode2 = serializedObjectSupporter0.deserializeObjectTextNode99();
        org.jsoup.nodes.TextNode textNode3 = serializedObjectSupporter0.deserializeObjectTextNode21();
        org.jsoup.nodes.Node node5 = null; // flaky: textNode3.after("This");
// flaky:         org.junit.Assert.assertNotNull(textNode1);
// flaky:         org.junit.Assert.assertNotNull(textNode2);
// flaky:         org.junit.Assert.assertNotNull(textNode3);
// flaky:         org.junit.Assert.assertNotNull(node5);
    }

    @Test
    public void test127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test127");
        org.jsoup.nodes.SerializedObjectSupporter serializedObjectSupporter0 = new org.jsoup.nodes.SerializedObjectSupporter();
        java.lang.StringBuilder stringBuilder1 = serializedObjectSupporter0.deserializeObjectStringBuilder18();
        org.jsoup.nodes.TextNode textNode2 = serializedObjectSupporter0.deserializeObjectTextNode4();
        org.jsoup.nodes.TextNode textNode3 = serializedObjectSupporter0.deserializeObjectTextNode238();
        java.lang.StringBuilder stringBuilder4 = serializedObjectSupporter0.deserializeObjectStringBuilder232();
        java.lang.String str5 = serializedObjectSupporter0.deserializeObjectString41();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Document document6 = serializedObjectSupporter0.deserializeObjectDocument245();
// flaky:             org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: org.jsoup.nodes.Document$OutputSettings cannot be cast to org.jsoup.nodes.Document");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(stringBuilder1);
        org.junit.Assert.assertEquals(stringBuilder1.toString(), "<p>This <a>");
// flaky:         org.junit.Assert.assertNotNull(textNode2);
// flaky:         org.junit.Assert.assertNotNull(textNode3);
        org.junit.Assert.assertNotNull(stringBuilder4);
        org.junit.Assert.assertEquals(stringBuilder4.toString(), "<p><a rel=\"nofollow\">Dodgy</a> <a href=\"http://nice.com\" rel=\"nofollow\">Nice</a></p>\n<blockquote>");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Three" + "'", str5, "Three");
    }

    @Test
    public void test128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test128");
        org.jsoup.nodes.SerializedObjectSupporter serializedObjectSupporter0 = new org.jsoup.nodes.SerializedObjectSupporter();
        java.lang.StringBuilder stringBuilder1 = serializedObjectSupporter0.deserializeObjectStringBuilder18();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Document document2 = serializedObjectSupporter0.deserializeObjectDocument152();
// flaky:             org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: org.jsoup.nodes.Document$OutputSettings cannot be cast to org.jsoup.nodes.Document");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(stringBuilder1);
        org.junit.Assert.assertEquals(stringBuilder1.toString(), "<p>This <a>");
    }

    @Test
    public void test129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test129");
        org.jsoup.nodes.Document.OutputSettings outputSettings0 = new org.jsoup.nodes.Document.OutputSettings();
        java.nio.charset.Charset charset1 = outputSettings0.charset();
        org.jsoup.nodes.Document.OutputSettings outputSettings2 = outputSettings0.clone();
        java.nio.charset.Charset charset3 = outputSettings0.charset();
        boolean boolean4 = outputSettings0.getforceAllElementAsBlock();
        org.junit.Assert.assertNotNull(charset1);
        org.junit.Assert.assertNotNull(outputSettings2);
        org.junit.Assert.assertNotNull(charset3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test130");
        org.jsoup.nodes.SerializedObjectSupporter serializedObjectSupporter0 = new org.jsoup.nodes.SerializedObjectSupporter();
        java.lang.StringBuilder stringBuilder1 = serializedObjectSupporter0.deserializeObjectStringBuilder18();
        org.jsoup.nodes.TextNode textNode2 = serializedObjectSupporter0.deserializeObjectTextNode4();
        org.jsoup.nodes.TextNode textNode3 = serializedObjectSupporter0.deserializeObjectTextNode238();
        java.lang.StringBuilder stringBuilder4 = serializedObjectSupporter0.deserializeObjectStringBuilder232();
        java.lang.String str5 = serializedObjectSupporter0.deserializeObjectString41();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Document document6 = serializedObjectSupporter0.deserializeObjectDocument281();
// flaky:             org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: org.jsoup.nodes.Document$OutputSettings cannot be cast to org.jsoup.nodes.Document");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(stringBuilder1);
        org.junit.Assert.assertEquals(stringBuilder1.toString(), "<p>This <a>");
// flaky:         org.junit.Assert.assertNotNull(textNode2);
// flaky:         org.junit.Assert.assertNotNull(textNode3);
        org.junit.Assert.assertNotNull(stringBuilder4);
        org.junit.Assert.assertEquals(stringBuilder4.toString(), "<p><a rel=\"nofollow\">Dodgy</a> <a href=\"http://nice.com\" rel=\"nofollow\">Nice</a></p>\n<blockquote>");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Three" + "'", str5, "Three");
    }

    @Test
    public void test131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test131");
        org.jsoup.nodes.SerializedObjectSupporter serializedObjectSupporter0 = new org.jsoup.nodes.SerializedObjectSupporter();
        org.jsoup.nodes.TextNode textNode1 = serializedObjectSupporter0.deserializeObjectTextNode372();
        org.jsoup.nodes.TextNode textNode2 = serializedObjectSupporter0.deserializeObjectTextNode245();
        org.jsoup.nodes.TextNode textNode3 = serializedObjectSupporter0.deserializeObjectTextNode218();
        org.jsoup.nodes.TextNode textNode4 = serializedObjectSupporter0.deserializeObjectTextNode160();
// flaky:         org.junit.Assert.assertNotNull(textNode1);
// flaky:         org.junit.Assert.assertNotNull(textNode2);
// flaky:         org.junit.Assert.assertNotNull(textNode3);
// flaky:         org.junit.Assert.assertNotNull(textNode4);
    }

    @Test
    public void test132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test132");
        org.jsoup.nodes.SerializedObjectSupporter serializedObjectSupporter0 = new org.jsoup.nodes.SerializedObjectSupporter();
        java.lang.StringBuilder stringBuilder1 = serializedObjectSupporter0.deserializeObjectStringBuilder18();
        org.jsoup.nodes.TextNode textNode2 = serializedObjectSupporter0.deserializeObjectTextNode4();
        org.jsoup.nodes.TextNode textNode3 = serializedObjectSupporter0.deserializeObjectTextNode238();
        java.lang.StringBuilder stringBuilder4 = serializedObjectSupporter0.deserializeObjectStringBuilder232();
        org.jsoup.nodes.TextNode textNode5 = serializedObjectSupporter0.deserializeObjectTextNode57();
        org.junit.Assert.assertNotNull(stringBuilder1);
        org.junit.Assert.assertEquals(stringBuilder1.toString(), "<p>This <a>");
// flaky:         org.junit.Assert.assertNotNull(textNode2);
// flaky:         org.junit.Assert.assertNotNull(textNode3);
        org.junit.Assert.assertNotNull(stringBuilder4);
        org.junit.Assert.assertEquals(stringBuilder4.toString(), "<p><a rel=\"nofollow\">Dodgy</a> <a href=\"http://nice.com\" rel=\"nofollow\">Nice</a></p>\n<blockquote>");
// flaky:         org.junit.Assert.assertNotNull(textNode5);
    }

    @Test
    public void test133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test133");
        org.jsoup.nodes.SerializedObjectSupporter serializedObjectSupporter0 = new org.jsoup.nodes.SerializedObjectSupporter();
        java.lang.StringBuilder stringBuilder1 = serializedObjectSupporter0.deserializeObjectStringBuilder18();
        org.jsoup.nodes.TextNode textNode2 = serializedObjectSupporter0.deserializeObjectTextNode4();
        org.jsoup.nodes.TextNode textNode3 = serializedObjectSupporter0.deserializeObjectTextNode238();
        java.lang.StringBuilder stringBuilder4 = serializedObjectSupporter0.deserializeObjectStringBuilder232();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Document document5 = serializedObjectSupporter0.deserializeObjectDocument317();
// flaky:             org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: org.jsoup.nodes.Document$OutputSettings cannot be cast to org.jsoup.nodes.Document");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(stringBuilder1);
        org.junit.Assert.assertEquals(stringBuilder1.toString(), "<p>This <a>");
// flaky:         org.junit.Assert.assertNotNull(textNode2);
// flaky:         org.junit.Assert.assertNotNull(textNode3);
        org.junit.Assert.assertNotNull(stringBuilder4);
        org.junit.Assert.assertEquals(stringBuilder4.toString(), "<p><a rel=\"nofollow\">Dodgy</a> <a href=\"http://nice.com\" rel=\"nofollow\">Nice</a></p>\n<blockquote>");
    }

    @Test
    public void test134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test134");
        org.jsoup.nodes.SerializedObjectSupporter serializedObjectSupporter0 = new org.jsoup.nodes.SerializedObjectSupporter();
        org.jsoup.nodes.TextNode textNode1 = serializedObjectSupporter0.deserializeObjectTextNode372();
        org.jsoup.nodes.TextNode textNode2 = serializedObjectSupporter0.deserializeObjectTextNode34();
        java.lang.StringBuilder stringBuilder3 = serializedObjectSupporter0.deserializeObjectStringBuilder342();
        java.lang.StringBuilder stringBuilder4 = serializedObjectSupporter0.deserializeObjectStringBuilder82();
        java.lang.StringBuilder stringBuilder5 = serializedObjectSupporter0.deserializeObjectStringBuilder385();
        java.lang.StringBuilder stringBuilder6 = serializedObjectSupporter0.deserializeObjectStringBuilder194();
// flaky:         org.junit.Assert.assertNotNull(textNode1);
// flaky:         org.junit.Assert.assertNotNull(textNode2);
        org.junit.Assert.assertNotNull(stringBuilder3);
        org.junit.Assert.assertEquals(stringBuilder3.toString(), "\n0\n<p>");
        org.junit.Assert.assertNotNull(stringBuilder4);
        org.junit.Assert.assertEquals(stringBuilder4.toString(), "<div>\n <div>");
        org.junit.Assert.assertNotNull(stringBuilder5);
        org.junit.Assert.assertEquals(stringBuilder5.toString(), "<table> \n <colgroup> \n  <col /> \n </colgroup>\n <colgroup> \n  <col /> \n  <col /> \n  <col />");
        org.junit.Assert.assertNotNull(stringBuilder6);
        org.junit.Assert.assertEquals(stringBuilder6.toString(), "<p>One <em>four</em><i>");
    }

    @Test
    public void test135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test135");
        org.jsoup.nodes.SerializedObjectSupporter serializedObjectSupporter0 = new org.jsoup.nodes.SerializedObjectSupporter();
        java.lang.StringBuilder stringBuilder1 = serializedObjectSupporter0.deserializeObjectStringBuilder18();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Document document2 = serializedObjectSupporter0.deserializeObjectDocument336();
// flaky:             org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: org.jsoup.nodes.Document$OutputSettings cannot be cast to org.jsoup.nodes.Document");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(stringBuilder1);
        org.junit.Assert.assertEquals(stringBuilder1.toString(), "<p>This <a>");
    }

    @Test
    public void test136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test136");
        org.jsoup.nodes.SerializedObjectSupporter serializedObjectSupporter0 = new org.jsoup.nodes.SerializedObjectSupporter();
        org.jsoup.nodes.TextNode textNode1 = serializedObjectSupporter0.deserializeObjectTextNode372();
        org.jsoup.nodes.TextNode textNode2 = serializedObjectSupporter0.deserializeObjectTextNode34();
        java.lang.StringBuilder stringBuilder3 = serializedObjectSupporter0.deserializeObjectStringBuilder342();
        org.jsoup.nodes.TextNode textNode4 = serializedObjectSupporter0.deserializeObjectTextNode17();
        org.jsoup.nodes.TextNode textNode5 = serializedObjectSupporter0.deserializeObjectTextNode208();
        org.jsoup.nodes.TextNode textNode6 = serializedObjectSupporter0.deserializeObjectTextNode218();
        org.jsoup.nodes.TextNode textNode7 = serializedObjectSupporter0.deserializeObjectTextNode114();
// flaky:         org.junit.Assert.assertNotNull(textNode1);
// flaky:         org.junit.Assert.assertNotNull(textNode2);
        org.junit.Assert.assertNotNull(stringBuilder3);
        org.junit.Assert.assertEquals(stringBuilder3.toString(), "\n0\n<p>");
// flaky:         org.junit.Assert.assertNotNull(textNode4);
// flaky:         org.junit.Assert.assertNotNull(textNode5);
// flaky:         org.junit.Assert.assertNotNull(textNode6);
// flaky:         org.junit.Assert.assertNotNull(textNode7);
    }

    @Test
    public void test137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test137");
        org.jsoup.nodes.SerializedObjectSupporter serializedObjectSupporter0 = new org.jsoup.nodes.SerializedObjectSupporter();
        java.lang.StringBuilder stringBuilder1 = serializedObjectSupporter0.deserializeObjectStringBuilder18();
        org.jsoup.nodes.TextNode textNode2 = serializedObjectSupporter0.deserializeObjectTextNode4();
        org.jsoup.nodes.TextNode textNode3 = serializedObjectSupporter0.deserializeObjectTextNode429();
        org.junit.Assert.assertNotNull(stringBuilder1);
        org.junit.Assert.assertEquals(stringBuilder1.toString(), "<p>This <a>");
// flaky:         org.junit.Assert.assertNotNull(textNode2);
// flaky:         org.junit.Assert.assertNotNull(textNode3);
    }

    @Test
    public void test138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test138");
        org.jsoup.nodes.SerializedObjectSupporter serializedObjectSupporter0 = new org.jsoup.nodes.SerializedObjectSupporter();
        org.jsoup.nodes.TextNode textNode1 = serializedObjectSupporter0.deserializeObjectTextNode372();
        java.lang.StringBuilder stringBuilder2 = serializedObjectSupporter0.deserializeObjectStringBuilder130();
        java.lang.StringBuilder stringBuilder3 = serializedObjectSupporter0.deserializeObjectStringBuilder244();
// flaky:         org.junit.Assert.assertNotNull(textNode1);
        org.junit.Assert.assertNotNull(stringBuilder2);
        org.junit.Assert.assertEquals(stringBuilder2.toString(), "<em>");
        org.junit.Assert.assertNotNull(stringBuilder3);
        org.junit.Assert.assertEquals(stringBuilder3.toString(), "<p>");
    }

    @Test
    public void test139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test139");
        org.jsoup.nodes.SerializedObjectSupporter serializedObjectSupporter0 = new org.jsoup.nodes.SerializedObjectSupporter();
        org.jsoup.nodes.TextNode textNode1 = serializedObjectSupporter0.deserializeObjectTextNode105();
        org.jsoup.nodes.TextNode textNode2 = serializedObjectSupporter0.deserializeObjectTextNode99();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString3();
        java.lang.String str4 = serializedObjectSupporter0.deserializeObjectString35();
        org.jsoup.nodes.TextNode textNode5 = serializedObjectSupporter0.deserializeObjectTextNode234();
// flaky:         org.junit.Assert.assertNotNull(textNode1);
// flaky:         org.junit.Assert.assertNotNull(textNode2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "This" + "'", str3, "This");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "two" + "'", str4, "two");
// flaky:         org.junit.Assert.assertNotNull(textNode5);
    }

    @Test
    public void test140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test140");
        org.jsoup.nodes.SerializedObjectSupporter serializedObjectSupporter0 = new org.jsoup.nodes.SerializedObjectSupporter();
        java.lang.String str1 = serializedObjectSupporter0.deserializeObjectString130();
        java.lang.StringBuilder stringBuilder2 = serializedObjectSupporter0.deserializeObjectStringBuilder312();
        java.lang.StringBuilder stringBuilder3 = serializedObjectSupporter0.deserializeObjectStringBuilder244();
        java.lang.StringBuilder stringBuilder4 = serializedObjectSupporter0.deserializeObjectStringBuilder180();
        java.lang.StringBuilder stringBuilder5 = serializedObjectSupporter0.deserializeObjectStringBuilder420();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "X\n" + "'", str1, "X\n");
        org.junit.Assert.assertNotNull(stringBuilder2);
        org.junit.Assert.assertEquals(stringBuilder2.toString(), "<html>\n <head>\n  <noscript></noscript>\n </head>\n <body>\n  <img src=\"foo\" />\n  <p>");
        org.junit.Assert.assertNotNull(stringBuilder3);
        org.junit.Assert.assertEquals(stringBuilder3.toString(), "<p>");
        org.junit.Assert.assertNotNull(stringBuilder4);
        org.junit.Assert.assertEquals(stringBuilder4.toString(), "One <span>two &amp;</span>");
        org.junit.Assert.assertNotNull(stringBuilder5);
        org.junit.Assert.assertEquals(stringBuilder5.toString(), "<p><b>One</b></p>\n<b> \n <table>\n  <tbody>\n   <tr>\n    <td><p><i>");
    }

    @Test
    public void test141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test141");
        org.jsoup.nodes.SerializedObjectSupporter serializedObjectSupporter0 = new org.jsoup.nodes.SerializedObjectSupporter();
        org.jsoup.nodes.TextNode textNode1 = serializedObjectSupporter0.deserializeObjectTextNode372();
        java.lang.StringBuilder stringBuilder2 = serializedObjectSupporter0.deserializeObjectStringBuilder130();
        java.lang.StringBuilder stringBuilder3 = serializedObjectSupporter0.deserializeObjectStringBuilder252();
        java.lang.String str4 = serializedObjectSupporter0.deserializeObjectString9();
        org.jsoup.nodes.TextNode textNode5 = serializedObjectSupporter0.deserializeObjectTextNode169();
        java.lang.StringBuilder stringBuilder6 = serializedObjectSupporter0.deserializeObjectStringBuilder346();
        java.lang.String str7 = serializedObjectSupporter0.deserializeObjectString122();
// flaky:         org.junit.Assert.assertNotNull(textNode1);
        org.junit.Assert.assertNotNull(stringBuilder2);
        org.junit.Assert.assertEquals(stringBuilder2.toString(), "<em>");
        org.junit.Assert.assertNotNull(stringBuilder3);
        org.junit.Assert.assertEquals(stringBuilder3.toString(), "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "three" + "'", str4, "three");
// flaky:         org.junit.Assert.assertNotNull(textNode5);
        org.junit.Assert.assertNotNull(stringBuilder6);
        org.junit.Assert.assertEquals(stringBuilder6.toString(), "<html>\n <head></head>\n <body>");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + " 3.7% " + "'", str7, " 3.7% ");
    }

    @Test
    public void test142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test142");
        org.jsoup.nodes.SerializedObjectSupporter serializedObjectSupporter0 = new org.jsoup.nodes.SerializedObjectSupporter();
        org.jsoup.nodes.TextNode textNode1 = serializedObjectSupporter0.deserializeObjectTextNode372();
        java.lang.StringBuilder stringBuilder2 = serializedObjectSupporter0.deserializeObjectStringBuilder130();
        java.lang.StringBuilder stringBuilder3 = serializedObjectSupporter0.deserializeObjectStringBuilder252();
        java.lang.String str4 = serializedObjectSupporter0.deserializeObjectString9();
        java.lang.StringBuilder stringBuilder5 = serializedObjectSupporter0.deserializeObjectStringBuilder56();
        java.lang.StringBuilder stringBuilder6 = serializedObjectSupporter0.deserializeObjectStringBuilder15();
        org.jsoup.nodes.TextNode textNode7 = serializedObjectSupporter0.deserializeObjectTextNode427();
// flaky:         org.junit.Assert.assertNotNull(textNode1);
        org.junit.Assert.assertNotNull(stringBuilder2);
        org.junit.Assert.assertEquals(stringBuilder2.toString(), "<em>");
        org.junit.Assert.assertNotNull(stringBuilder3);
        org.junit.Assert.assertEquals(stringBuilder3.toString(), "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "three" + "'", str4, "three");
        org.junit.Assert.assertNotNull(stringBuilder5);
        org.junit.Assert.assertEquals(stringBuilder5.toString(), "<!DOCTYPE html>\n<html>\n <head>\n  <title>");
        org.junit.Assert.assertNotNull(stringBuilder6);
        org.junit.Assert.assertEquals(stringBuilder6.toString(), "<p>This <span>foo</span><a>is</a> <span>foo</span><a>");
// flaky:         org.junit.Assert.assertNotNull(textNode7);
    }

    @Test
    public void test143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test143");
        org.jsoup.nodes.SerializedObjectSupporter serializedObjectSupporter0 = new org.jsoup.nodes.SerializedObjectSupporter();
        org.jsoup.nodes.TextNode textNode1 = serializedObjectSupporter0.deserializeObjectTextNode105();
        org.jsoup.nodes.TextNode textNode2 = serializedObjectSupporter0.deserializeObjectTextNode266();
        org.jsoup.nodes.TextNode textNode3 = serializedObjectSupporter0.deserializeObjectTextNode374();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Document document4 = serializedObjectSupporter0.deserializeObjectDocument96();
// flaky:             org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: org.jsoup.nodes.Document$OutputSettings cannot be cast to org.jsoup.nodes.Document");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
// flaky:         org.junit.Assert.assertNotNull(textNode1);
// flaky:         org.junit.Assert.assertNotNull(textNode2);
// flaky:         org.junit.Assert.assertNotNull(textNode3);
    }

    @Test
    public void test144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test144");
        org.jsoup.nodes.SerializedObjectSupporter serializedObjectSupporter0 = new org.jsoup.nodes.SerializedObjectSupporter();
        org.jsoup.nodes.TextNode textNode1 = serializedObjectSupporter0.deserializeObjectTextNode372();
        org.jsoup.nodes.TextNode textNode2 = serializedObjectSupporter0.deserializeObjectTextNode34();
        java.lang.StringBuilder stringBuilder3 = serializedObjectSupporter0.deserializeObjectStringBuilder342();
        java.lang.StringBuilder stringBuilder4 = serializedObjectSupporter0.deserializeObjectStringBuilder82();
        java.lang.StringBuilder stringBuilder5 = serializedObjectSupporter0.deserializeObjectStringBuilder219();
// flaky:         org.junit.Assert.assertNotNull(textNode1);
// flaky:         org.junit.Assert.assertNotNull(textNode2);
        org.junit.Assert.assertNotNull(stringBuilder3);
        org.junit.Assert.assertEquals(stringBuilder3.toString(), "\n0\n<p>");
        org.junit.Assert.assertNotNull(stringBuilder4);
        org.junit.Assert.assertEquals(stringBuilder4.toString(), "<div>\n <div>");
        org.junit.Assert.assertNotNull(stringBuilder5);
        org.junit.Assert.assertEquals(stringBuilder5.toString(), "<div id=\"1\">\n Text 1 \n <p>One</p> Text 2 \n <p>Two</p>\n <p>");
    }

    @Test
    public void test145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test145");
        org.jsoup.nodes.SerializedObjectSupporter serializedObjectSupporter0 = new org.jsoup.nodes.SerializedObjectSupporter();
        java.lang.StringBuilder stringBuilder1 = serializedObjectSupporter0.deserializeObjectStringBuilder18();
        org.jsoup.nodes.TextNode textNode2 = serializedObjectSupporter0.deserializeObjectTextNode4();
        org.jsoup.nodes.TextNode textNode3 = serializedObjectSupporter0.deserializeObjectTextNode276();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Document document4 = serializedObjectSupporter0.deserializeObjectDocument427();
// flaky:             org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: org.jsoup.nodes.Document$OutputSettings cannot be cast to org.jsoup.nodes.Document");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(stringBuilder1);
        org.junit.Assert.assertEquals(stringBuilder1.toString(), "<p>This <a>");
// flaky:         org.junit.Assert.assertNotNull(textNode2);
// flaky:         org.junit.Assert.assertNotNull(textNode3);
    }

    @Test
    public void test146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test146");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("\271\262\263\274\275\276", "Head");
    }

    @Test
    public void test147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test147");
        org.jsoup.nodes.Document.OutputSettings outputSettings0 = new org.jsoup.nodes.Document.OutputSettings();
        java.nio.charset.Charset charset1 = outputSettings0.charset;
        boolean boolean2 = outputSettings0.forceAllElementAsBlock();
        org.junit.Assert.assertNotNull(charset1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test148");
        org.jsoup.nodes.SerializedObjectSupporter serializedObjectSupporter0 = new org.jsoup.nodes.SerializedObjectSupporter();
        org.jsoup.nodes.TextNode textNode1 = serializedObjectSupporter0.deserializeObjectTextNode105();
        org.jsoup.nodes.TextNode textNode2 = serializedObjectSupporter0.deserializeObjectTextNode99();
        java.lang.StringBuilder stringBuilder3 = serializedObjectSupporter0.deserializeObjectStringBuilder317();
        org.jsoup.nodes.TextNode textNode4 = serializedObjectSupporter0.deserializeObjectTextNode26();
        java.lang.String str5 = serializedObjectSupporter0.deserializeObjectString114();
// flaky:         org.junit.Assert.assertNotNull(textNode1);
// flaky:         org.junit.Assert.assertNotNull(textNode2);
        org.junit.Assert.assertNotNull(stringBuilder3);
        org.junit.Assert.assertEquals(stringBuilder3.toString(), "<font>");
// flaky:         org.junit.Assert.assertNotNull(textNode4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "2006 " + "'", str5, "2006 ");
    }

    @Test
    public void test149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test149");
        org.jsoup.nodes.SerializedObjectSupporter serializedObjectSupporter0 = new org.jsoup.nodes.SerializedObjectSupporter();
        java.lang.String str1 = serializedObjectSupporter0.deserializeObjectString130();
        java.lang.StringBuilder stringBuilder2 = serializedObjectSupporter0.deserializeObjectStringBuilder111();
        java.lang.StringBuilder stringBuilder3 = serializedObjectSupporter0.deserializeObjectStringBuilder212();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "X\n" + "'", str1, "X\n");
        org.junit.Assert.assertNotNull(stringBuilder2);
        org.junit.Assert.assertEquals(stringBuilder2.toString(), "<p>");
        org.junit.Assert.assertNotNull(stringBuilder3);
        org.junit.Assert.assertEquals(stringBuilder3.toString(), "");
    }

    @Test
    public void test150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test150");
        org.jsoup.nodes.SerializedObjectSupporter serializedObjectSupporter0 = new org.jsoup.nodes.SerializedObjectSupporter();
        java.lang.String str1 = serializedObjectSupporter0.deserializeObjectString130();
        java.lang.StringBuilder stringBuilder2 = serializedObjectSupporter0.deserializeObjectStringBuilder312();
        java.lang.StringBuilder stringBuilder3 = serializedObjectSupporter0.deserializeObjectStringBuilder130();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "X\n" + "'", str1, "X\n");
        org.junit.Assert.assertNotNull(stringBuilder2);
        org.junit.Assert.assertEquals(stringBuilder2.toString(), "<html>\n <head>\n  <noscript></noscript>\n </head>\n <body>\n  <img src=\"foo\" />\n  <p>");
        org.junit.Assert.assertNotNull(stringBuilder3);
        org.junit.Assert.assertEquals(stringBuilder3.toString(), "<em>");
    }

    @Test
    public void test151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test151");
        org.jsoup.nodes.SerializedObjectSupporter serializedObjectSupporter0 = new org.jsoup.nodes.SerializedObjectSupporter();
        java.lang.StringBuilder stringBuilder1 = serializedObjectSupporter0.deserializeObjectStringBuilder18();
        org.jsoup.nodes.TextNode textNode2 = serializedObjectSupporter0.deserializeObjectTextNode252();
        java.lang.StringBuilder stringBuilder3 = serializedObjectSupporter0.deserializeObjectStringBuilder391();
        org.junit.Assert.assertNotNull(stringBuilder1);
        org.junit.Assert.assertEquals(stringBuilder1.toString(), "<p>This <a>");
// flaky:         org.junit.Assert.assertNotNull(textNode2);
        org.junit.Assert.assertNotNull(stringBuilder3);
        org.junit.Assert.assertEquals(stringBuilder3.toString(), "<table> \n <colgroup> \n  <col /> \n </colgroup>\n <colgroup> \n  <col /> \n  <col /> \n  <col /> \n </colgroup>\n <thead> \n  <tr> \n   <th> </th>\n   <th>2008 </th>\n   <th>2007 </th>\n   <th>");
    }

    @Test
    public void test152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test152");
        org.jsoup.nodes.SerializedObjectSupporter serializedObjectSupporter0 = new org.jsoup.nodes.SerializedObjectSupporter();
        org.jsoup.nodes.TextNode textNode1 = serializedObjectSupporter0.deserializeObjectTextNode105();
        org.jsoup.nodes.TextNode textNode2 = serializedObjectSupporter0.deserializeObjectTextNode112();
        java.lang.StringBuilder stringBuilder3 = serializedObjectSupporter0.deserializeObjectStringBuilder356();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Document document4 = serializedObjectSupporter0.deserializeObjectDocument41();
// flaky:             org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: org.jsoup.nodes.Document$OutputSettings cannot be cast to org.jsoup.nodes.Document");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
// flaky:         org.junit.Assert.assertNotNull(textNode1);
// flaky:         org.junit.Assert.assertNotNull(textNode2);
        org.junit.Assert.assertNotNull(stringBuilder3);
        org.junit.Assert.assertEquals(stringBuilder3.toString(), "<table>\n <tbody>\n  <tr>\n   <td>1</td>\n  </tr> \n  <tr>\n   <td>2</td>\n  </tr> \n  <tr>\n   <td> \n    <table>\n     <tbody>\n      <tr>\n       <td>3</td>");
    }

    @Test
    public void test153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test153");
        org.jsoup.nodes.SerializedObjectSupporter serializedObjectSupporter0 = new org.jsoup.nodes.SerializedObjectSupporter();
        java.lang.StringBuilder stringBuilder1 = serializedObjectSupporter0.deserializeObjectStringBuilder18();
        org.jsoup.nodes.TextNode textNode2 = serializedObjectSupporter0.deserializeObjectTextNode4();
        org.jsoup.nodes.TextNode textNode3 = serializedObjectSupporter0.deserializeObjectTextNode276();
        java.lang.StringBuilder stringBuilder4 = serializedObjectSupporter0.deserializeObjectStringBuilder288();
        org.jsoup.nodes.TextNode textNode5 = serializedObjectSupporter0.deserializeObjectTextNode34();
        org.junit.Assert.assertNotNull(stringBuilder1);
        org.junit.Assert.assertEquals(stringBuilder1.toString(), "<p>This <a>");
// flaky:         org.junit.Assert.assertNotNull(textNode2);
// flaky:         org.junit.Assert.assertNotNull(textNode3);
        org.junit.Assert.assertNotNull(stringBuilder4);
        org.junit.Assert.assertEquals(stringBuilder4.toString(), "<!DOCTYPE html>\n<html>\n <head></head>\n <body>\n  OneTwo");
// flaky:         org.junit.Assert.assertNotNull(textNode5);
    }

    @Test
    public void test154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test154");
        org.jsoup.nodes.SerializedObjectSupporter serializedObjectSupporter0 = new org.jsoup.nodes.SerializedObjectSupporter();
        java.lang.StringBuilder stringBuilder1 = serializedObjectSupporter0.deserializeObjectStringBuilder18();
        org.jsoup.nodes.TextNode textNode2 = serializedObjectSupporter0.deserializeObjectTextNode204();
        org.jsoup.nodes.TextNode textNode3 = serializedObjectSupporter0.deserializeObjectTextNode126();
        java.lang.StringBuilder stringBuilder4 = serializedObjectSupporter0.deserializeObjectStringBuilder159();
        java.lang.StringBuilder stringBuilder5 = serializedObjectSupporter0.deserializeObjectStringBuilder142();
        java.lang.String str6 = serializedObjectSupporter0.deserializeObjectString83();
        org.junit.Assert.assertNotNull(stringBuilder1);
        org.junit.Assert.assertEquals(stringBuilder1.toString(), "<p>This <a>");
// flaky:         org.junit.Assert.assertNotNull(textNode2);
// flaky:         org.junit.Assert.assertNotNull(textNode3);
        org.junit.Assert.assertNotNull(stringBuilder4);
        org.junit.Assert.assertEquals(stringBuilder4.toString(), "<html>\n <head>\n  <title>Format test</title>\n </head>\n <body>\n  <div>\n   <p>Hello <span>jsoup <span>users</span></span></p>\n   <p>");
        org.junit.Assert.assertNotNull(stringBuilder5);
        org.junit.Assert.assertEquals(stringBuilder5.toString(), "<div id=\"1\"></div>\n<div id=\"2\">\n Text \n <p>");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Foo " + "'", str6, "Foo ");
    }

    @Test
    public void test155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test155");
        org.jsoup.nodes.SerializedObjectSupporter serializedObjectSupporter0 = new org.jsoup.nodes.SerializedObjectSupporter();
        org.jsoup.nodes.TextNode textNode1 = serializedObjectSupporter0.deserializeObjectTextNode372();
        org.jsoup.nodes.TextNode textNode2 = serializedObjectSupporter0.deserializeObjectTextNode34();
        java.lang.StringBuilder stringBuilder3 = serializedObjectSupporter0.deserializeObjectStringBuilder342();
        java.lang.StringBuilder stringBuilder4 = serializedObjectSupporter0.deserializeObjectStringBuilder148();
        java.lang.StringBuilder stringBuilder5 = serializedObjectSupporter0.deserializeObjectStringBuilder424();
        java.lang.StringBuilder stringBuilder6 = serializedObjectSupporter0.deserializeObjectStringBuilder344();
// flaky:         org.junit.Assert.assertNotNull(textNode1);
// flaky:         org.junit.Assert.assertNotNull(textNode2);
        org.junit.Assert.assertNotNull(stringBuilder3);
        org.junit.Assert.assertEquals(stringBuilder3.toString(), "\n0\n<p>");
        org.junit.Assert.assertNotNull(stringBuilder4);
        org.junit.Assert.assertEquals(stringBuilder4.toString(), "<div id=\"1\">\n Text \n <p>One</p> Text \n <p>");
        org.junit.Assert.assertNotNull(stringBuilder5);
        org.junit.Assert.assertEquals(stringBuilder5.toString(), "<html>\n <head></head>\n <body>\n  <table>\n   <tbody>\n    <tr>\n     <td>");
        org.junit.Assert.assertNotNull(stringBuilder6);
        org.junit.Assert.assertEquals(stringBuilder6.toString(), "<div>");
    }

    @Test
    public void test156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test156");
        org.jsoup.nodes.SerializedObjectSupporter serializedObjectSupporter0 = new org.jsoup.nodes.SerializedObjectSupporter();
        org.jsoup.nodes.TextNode textNode1 = serializedObjectSupporter0.deserializeObjectTextNode372();
        java.lang.StringBuilder stringBuilder2 = serializedObjectSupporter0.deserializeObjectStringBuilder130();
        java.lang.StringBuilder stringBuilder3 = serializedObjectSupporter0.deserializeObjectStringBuilder252();
        java.lang.String str4 = serializedObjectSupporter0.deserializeObjectString9();
        org.jsoup.nodes.TextNode textNode5 = serializedObjectSupporter0.deserializeObjectTextNode169();
        java.lang.StringBuilder stringBuilder6 = serializedObjectSupporter0.deserializeObjectStringBuilder27();
// flaky:         org.junit.Assert.assertNotNull(textNode1);
        org.junit.Assert.assertNotNull(stringBuilder2);
        org.junit.Assert.assertEquals(stringBuilder2.toString(), "<em>");
        org.junit.Assert.assertNotNull(stringBuilder3);
        org.junit.Assert.assertEquals(stringBuilder3.toString(), "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "three" + "'", str4, "three");
// flaky:         org.junit.Assert.assertNotNull(textNode5);
        org.junit.Assert.assertNotNull(stringBuilder6);
        org.junit.Assert.assertEquals(stringBuilder6.toString(), "<div>\n <p>");
    }

    @Test
    public void test157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test157");
        org.jsoup.nodes.SerializedObjectSupporter serializedObjectSupporter0 = new org.jsoup.nodes.SerializedObjectSupporter();
        java.lang.StringBuilder stringBuilder1 = serializedObjectSupporter0.deserializeObjectStringBuilder18();
        org.jsoup.nodes.TextNode textNode2 = serializedObjectSupporter0.deserializeObjectTextNode4();
        org.jsoup.nodes.TextNode textNode3 = serializedObjectSupporter0.deserializeObjectTextNode238();
        java.lang.StringBuilder stringBuilder4 = serializedObjectSupporter0.deserializeObjectStringBuilder232();
        java.lang.String str5 = serializedObjectSupporter0.deserializeObjectString1();
        org.junit.Assert.assertNotNull(stringBuilder1);
        org.junit.Assert.assertEquals(stringBuilder1.toString(), "<p>This <a>");
// flaky:         org.junit.Assert.assertNotNull(textNode2);
// flaky:         org.junit.Assert.assertNotNull(textNode3);
        org.junit.Assert.assertNotNull(stringBuilder4);
        org.junit.Assert.assertEquals(stringBuilder4.toString(), "<p><a rel=\"nofollow\">Dodgy</a> <a href=\"http://nice.com\" rel=\"nofollow\">Nice</a></p>\n<blockquote>");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "text" + "'", str5, "text");
    }

    @Test
    public void test158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test158");
        org.jsoup.nodes.SerializedObjectSupporter serializedObjectSupporter0 = new org.jsoup.nodes.SerializedObjectSupporter();
        org.jsoup.nodes.TextNode textNode1 = serializedObjectSupporter0.deserializeObjectTextNode372();
        org.jsoup.nodes.TextNode textNode2 = serializedObjectSupporter0.deserializeObjectTextNode34();
        java.lang.StringBuilder stringBuilder3 = serializedObjectSupporter0.deserializeObjectStringBuilder342();
        java.lang.StringBuilder stringBuilder4 = serializedObjectSupporter0.deserializeObjectStringBuilder148();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Document document5 = serializedObjectSupporter0.deserializeObjectDocument325();
// flaky:             org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: org.jsoup.nodes.Document$OutputSettings cannot be cast to org.jsoup.nodes.Document");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
// flaky:         org.junit.Assert.assertNotNull(textNode1);
// flaky:         org.junit.Assert.assertNotNull(textNode2);
        org.junit.Assert.assertNotNull(stringBuilder3);
        org.junit.Assert.assertEquals(stringBuilder3.toString(), "\n0\n<p>");
        org.junit.Assert.assertNotNull(stringBuilder4);
        org.junit.Assert.assertEquals(stringBuilder4.toString(), "<div id=\"1\">\n Text \n <p>One</p> Text \n <p>");
    }

    @Test
    public void test159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test159");
        org.jsoup.nodes.SerializedObjectSupporter serializedObjectSupporter0 = new org.jsoup.nodes.SerializedObjectSupporter();
        java.lang.StringBuilder stringBuilder1 = serializedObjectSupporter0.deserializeObjectStringBuilder18();
        org.jsoup.nodes.TextNode textNode2 = serializedObjectSupporter0.deserializeObjectTextNode4();
        org.jsoup.nodes.TextNode textNode3 = serializedObjectSupporter0.deserializeObjectTextNode238();
        org.jsoup.nodes.TextNode textNode4 = serializedObjectSupporter0.deserializeObjectTextNode281();
        java.lang.StringBuilder stringBuilder5 = serializedObjectSupporter0.deserializeObjectStringBuilder301();
        java.lang.StringBuilder stringBuilder6 = serializedObjectSupporter0.deserializeObjectStringBuilder25();
        org.junit.Assert.assertNotNull(stringBuilder1);
        org.junit.Assert.assertEquals(stringBuilder1.toString(), "<p>This <a>");
// flaky:         org.junit.Assert.assertNotNull(textNode2);
// flaky:         org.junit.Assert.assertNotNull(textNode3);
// flaky:         org.junit.Assert.assertNotNull(textNode4);
        org.junit.Assert.assertNotNull(stringBuilder5);
        org.junit.Assert.assertEquals(stringBuilder5.toString(), "<h1>Hello </h1>\n<h2>There \n <hgroup>\n  <h1>Another</h1>\n  <h2>headline</h2>\n </hgroup> \n <hgroup>\n  <h1>More</h1>\n  <p>");
        org.junit.Assert.assertNotNull(stringBuilder6);
        org.junit.Assert.assertEquals(stringBuilder6.toString(), "<p>");
    }

    @Test
    public void test160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test160");
        org.jsoup.nodes.SerializedObjectSupporter serializedObjectSupporter0 = new org.jsoup.nodes.SerializedObjectSupporter();
        org.jsoup.nodes.TextNode textNode1 = serializedObjectSupporter0.deserializeObjectTextNode105();
        org.jsoup.nodes.TextNode textNode2 = serializedObjectSupporter0.deserializeObjectTextNode99();
        org.jsoup.nodes.TextNode textNode3 = serializedObjectSupporter0.deserializeObjectTextNode21();
        java.lang.StringBuilder stringBuilder4 = serializedObjectSupporter0.deserializeObjectStringBuilder425();
        org.jsoup.nodes.TextNode textNode5 = serializedObjectSupporter0.deserializeObjectTextNode221();
// flaky:         org.junit.Assert.assertNotNull(textNode1);
// flaky:         org.junit.Assert.assertNotNull(textNode2);
// flaky:         org.junit.Assert.assertNotNull(textNode3);
        org.junit.Assert.assertNotNull(stringBuilder4);
        org.junit.Assert.assertEquals(stringBuilder4.toString(), "<html>\n <head></head>\n <body>\n  <ol>\n   <li>");
// flaky:         org.junit.Assert.assertNotNull(textNode5);
    }

    @Test
    public void test161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test161");
        org.jsoup.nodes.SerializedObjectSupporter serializedObjectSupporter0 = new org.jsoup.nodes.SerializedObjectSupporter();
        org.jsoup.nodes.TextNode textNode1 = serializedObjectSupporter0.deserializeObjectTextNode372();
        org.jsoup.nodes.TextNode textNode2 = serializedObjectSupporter0.deserializeObjectTextNode34();
        java.lang.StringBuilder stringBuilder3 = serializedObjectSupporter0.deserializeObjectStringBuilder342();
        java.lang.StringBuilder stringBuilder4 = serializedObjectSupporter0.deserializeObjectStringBuilder416();
        java.lang.StringBuilder stringBuilder5 = serializedObjectSupporter0.deserializeObjectStringBuilder336();
        java.lang.String str6 = serializedObjectSupporter0.deserializeObjectString67();
        org.jsoup.nodes.TextNode textNode7 = serializedObjectSupporter0.deserializeObjectTextNode8();
        org.jsoup.nodes.TextNode textNode8 = serializedObjectSupporter0.deserializeObjectTextNode422();
// flaky:         org.junit.Assert.assertNotNull(textNode1);
// flaky:         org.junit.Assert.assertNotNull(textNode2);
        org.junit.Assert.assertNotNull(stringBuilder3);
        org.junit.Assert.assertEquals(stringBuilder3.toString(), "\n0\n<p>");
        org.junit.Assert.assertNotNull(stringBuilder4);
        org.junit.Assert.assertEquals(stringBuilder4.toString(), "<!DOCTYPE html>\n<html>\n<head></head>\n<body>\n<p><b class=\"x\"><b class=\"x\"><b><b class=\"x\"><b class=\"x\"><b>X </b></b></b></b></b></b></p>\n<p><b class=\"x\"><b><b class=\"x\"><b class=\"x\"><b>X </b></b></b></b></b></p>\n<p><b class=\"x\"><b><b class=\"x\"><b class=\"x\"><b><b><b class=\"x\"><b>");
        org.junit.Assert.assertNotNull(stringBuilder5);
        org.junit.Assert.assertEquals(stringBuilder5.toString(), "\n<!-- comment -->\n<!-- comment 2 -->\n<html>\n <head></head>\n <body>\n  <p>");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + " three" + "'", str6, " three");
// flaky:         org.junit.Assert.assertNotNull(textNode7);
// flaky:         org.junit.Assert.assertNotNull(textNode8);
    }

    @Test
    public void test162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test162");
        org.jsoup.nodes.SerializedObjectSupporter serializedObjectSupporter0 = new org.jsoup.nodes.SerializedObjectSupporter();
        org.jsoup.nodes.TextNode textNode1 = serializedObjectSupporter0.deserializeObjectTextNode372();
        org.jsoup.nodes.TextNode textNode2 = serializedObjectSupporter0.deserializeObjectTextNode34();
        org.jsoup.nodes.TextNode textNode3 = serializedObjectSupporter0.deserializeObjectTextNode429();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str5 = null; // flaky: textNode3.absUrl("");
// flaky:             org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: String must not be empty");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
// flaky:         org.junit.Assert.assertNotNull(textNode1);
// flaky:         org.junit.Assert.assertNotNull(textNode2);
// flaky:         org.junit.Assert.assertNotNull(textNode3);
    }

    @Test
    public void test163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test163");
        org.jsoup.nodes.SerializedObjectSupporter serializedObjectSupporter0 = new org.jsoup.nodes.SerializedObjectSupporter();
        org.jsoup.nodes.TextNode textNode1 = serializedObjectSupporter0.deserializeObjectTextNode372();
        java.lang.StringBuilder stringBuilder2 = serializedObjectSupporter0.deserializeObjectStringBuilder130();
        java.lang.StringBuilder stringBuilder3 = serializedObjectSupporter0.deserializeObjectStringBuilder252();
        java.lang.String str4 = serializedObjectSupporter0.deserializeObjectString9();
        org.jsoup.nodes.TextNode textNode5 = serializedObjectSupporter0.deserializeObjectTextNode307();
        java.lang.StringBuilder stringBuilder6 = serializedObjectSupporter0.deserializeObjectStringBuilder40();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Document document7 = serializedObjectSupporter0.deserializeObjectDocument158();
// flaky:             org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: org.jsoup.nodes.Document$OutputSettings cannot be cast to org.jsoup.nodes.Document");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
// flaky:         org.junit.Assert.assertNotNull(textNode1);
        org.junit.Assert.assertNotNull(stringBuilder2);
        org.junit.Assert.assertEquals(stringBuilder2.toString(), "<em>");
        org.junit.Assert.assertNotNull(stringBuilder3);
        org.junit.Assert.assertEquals(stringBuilder3.toString(), "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "three" + "'", str4, "three");
// flaky:         org.junit.Assert.assertNotNull(textNode5);
        org.junit.Assert.assertNotNull(stringBuilder6);
        org.junit.Assert.assertEquals(stringBuilder6.toString(), "<a>One</a> Two");
    }

    @Test
    public void test164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test164");
        org.jsoup.nodes.SerializedObjectSupporter serializedObjectSupporter0 = new org.jsoup.nodes.SerializedObjectSupporter();
        org.jsoup.nodes.TextNode textNode1 = serializedObjectSupporter0.deserializeObjectTextNode372();
        java.lang.StringBuilder stringBuilder2 = serializedObjectSupporter0.deserializeObjectStringBuilder130();
        java.lang.StringBuilder stringBuilder3 = serializedObjectSupporter0.deserializeObjectStringBuilder252();
        java.lang.String str4 = serializedObjectSupporter0.deserializeObjectString9();
        java.lang.StringBuilder stringBuilder5 = serializedObjectSupporter0.deserializeObjectStringBuilder56();
        java.lang.String str6 = serializedObjectSupporter0.deserializeObjectString85();
        java.lang.StringBuilder stringBuilder7 = serializedObjectSupporter0.deserializeObjectStringBuilder306();
// flaky:         org.junit.Assert.assertNotNull(textNode1);
        org.junit.Assert.assertNotNull(stringBuilder2);
        org.junit.Assert.assertEquals(stringBuilder2.toString(), "<em>");
        org.junit.Assert.assertNotNull(stringBuilder3);
        org.junit.Assert.assertEquals(stringBuilder3.toString(), "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "three" + "'", str4, "three");
        org.junit.Assert.assertNotNull(stringBuilder5);
        org.junit.Assert.assertEquals(stringBuilder5.toString(), "<!DOCTYPE html>\n<html>\n <head>\n  <title>");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Term" + "'", str6, "Term");
        org.junit.Assert.assertNotNull(stringBuilder7);
        org.junit.Assert.assertEquals(stringBuilder7.toString(), "<h1>Hello \n <div>\n  There\n </div> now</h1> \n<h2>");
    }

    @Test
    public void test165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test165");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("Six ", "Another");
        org.jsoup.nodes.Node node3 = null;
        // The following exception was thrown during execution in test generation
        try {
            textNode2.replaceWith(node3);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test166");
        org.jsoup.nodes.SerializedObjectSupporter serializedObjectSupporter0 = new org.jsoup.nodes.SerializedObjectSupporter();
        java.lang.StringBuilder stringBuilder1 = serializedObjectSupporter0.deserializeObjectStringBuilder18();
        org.jsoup.nodes.TextNode textNode2 = serializedObjectSupporter0.deserializeObjectTextNode204();
        org.jsoup.nodes.TextNode textNode3 = serializedObjectSupporter0.deserializeObjectTextNode126();
        java.lang.StringBuilder stringBuilder4 = serializedObjectSupporter0.deserializeObjectStringBuilder159();
        org.jsoup.nodes.TextNode textNode5 = serializedObjectSupporter0.deserializeObjectTextNode394();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Document document6 = serializedObjectSupporter0.deserializeObjectDocument65();
// flaky:             org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: org.jsoup.nodes.Document$OutputSettings cannot be cast to org.jsoup.nodes.Document");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(stringBuilder1);
        org.junit.Assert.assertEquals(stringBuilder1.toString(), "<p>This <a>");
// flaky:         org.junit.Assert.assertNotNull(textNode2);
// flaky:         org.junit.Assert.assertNotNull(textNode3);
        org.junit.Assert.assertNotNull(stringBuilder4);
        org.junit.Assert.assertEquals(stringBuilder4.toString(), "<html>\n <head>\n  <title>Format test</title>\n </head>\n <body>\n  <div>\n   <p>Hello <span>jsoup <span>users</span></span></p>\n   <p>");
// flaky:         org.junit.Assert.assertNotNull(textNode5);
    }

    @Test
    public void test167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test167");
        org.jsoup.nodes.SerializedObjectSupporter serializedObjectSupporter0 = new org.jsoup.nodes.SerializedObjectSupporter();
        org.jsoup.nodes.TextNode textNode1 = serializedObjectSupporter0.deserializeObjectTextNode372();
        org.jsoup.nodes.TextNode textNode2 = serializedObjectSupporter0.deserializeObjectTextNode34();
        java.lang.StringBuilder stringBuilder3 = serializedObjectSupporter0.deserializeObjectStringBuilder342();
        java.lang.StringBuilder stringBuilder4 = serializedObjectSupporter0.deserializeObjectStringBuilder416();
        java.lang.StringBuilder stringBuilder5 = serializedObjectSupporter0.deserializeObjectStringBuilder336();
        java.lang.String str6 = serializedObjectSupporter0.deserializeObjectString67();
        org.jsoup.nodes.TextNode textNode7 = serializedObjectSupporter0.deserializeObjectTextNode139();
        org.jsoup.nodes.TextNode textNode8 = serializedObjectSupporter0.deserializeObjectTextNode251();
        java.lang.StringBuilder stringBuilder9 = serializedObjectSupporter0.deserializeObjectStringBuilder317();
        java.lang.StringBuilder stringBuilder10 = serializedObjectSupporter0.deserializeObjectStringBuilder355();
        org.jsoup.nodes.TextNode textNode11 = serializedObjectSupporter0.deserializeObjectTextNode338();
// flaky:         org.junit.Assert.assertNotNull(textNode1);
// flaky:         org.junit.Assert.assertNotNull(textNode2);
        org.junit.Assert.assertNotNull(stringBuilder3);
        org.junit.Assert.assertEquals(stringBuilder3.toString(), "\n0\n<p>");
        org.junit.Assert.assertNotNull(stringBuilder4);
        org.junit.Assert.assertEquals(stringBuilder4.toString(), "<!DOCTYPE html>\n<html>\n<head></head>\n<body>\n<p><b class=\"x\"><b class=\"x\"><b><b class=\"x\"><b class=\"x\"><b>X </b></b></b></b></b></b></p>\n<p><b class=\"x\"><b><b class=\"x\"><b class=\"x\"><b>X </b></b></b></b></b></p>\n<p><b class=\"x\"><b><b class=\"x\"><b class=\"x\"><b><b><b class=\"x\"><b>");
        org.junit.Assert.assertNotNull(stringBuilder5);
        org.junit.Assert.assertEquals(stringBuilder5.toString(), "\n<!-- comment -->\n<!-- comment 2 -->\n<html>\n <head></head>\n <body>\n  <p>");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + " three" + "'", str6, " three");
// flaky:         org.junit.Assert.assertNotNull(textNode7);
// flaky:         org.junit.Assert.assertNotNull(textNode8);
        org.junit.Assert.assertNotNull(stringBuilder9);
        org.junit.Assert.assertEquals(stringBuilder9.toString(), "<font>");
        org.junit.Assert.assertNotNull(stringBuilder10);
        org.junit.Assert.assertEquals(stringBuilder10.toString(), "<table>\n <tbody>\n  <tr>\n   <td>1</td>\n  </tr> \n  <tr>\n   <td>2</td>\n  </tr> \n  <tr>\n   <td> \n    <table>\n     <tbody>\n      <tr>\n       <td>");
// flaky:         org.junit.Assert.assertNotNull(textNode11);
    }

    @Test
    public void test168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test168");
        org.jsoup.nodes.SerializedObjectSupporter serializedObjectSupporter0 = new org.jsoup.nodes.SerializedObjectSupporter();
        org.jsoup.nodes.TextNode textNode1 = serializedObjectSupporter0.deserializeObjectTextNode105();
        org.jsoup.nodes.TextNode textNode2 = serializedObjectSupporter0.deserializeObjectTextNode99();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString61();
        java.lang.StringBuilder stringBuilder4 = serializedObjectSupporter0.deserializeObjectStringBuilder267();
        java.lang.String str5 = serializedObjectSupporter0.deserializeObjectString129();
        org.jsoup.nodes.TextNode textNode6 = serializedObjectSupporter0.deserializeObjectTextNode358();
// flaky:         org.junit.Assert.assertNotNull(textNode1);
// flaky:         org.junit.Assert.assertNotNull(textNode2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Another" + "'", str3, "Another");
        org.junit.Assert.assertNotNull(stringBuilder4);
        org.junit.Assert.assertEquals(stringBuilder4.toString(), "<doc>\n <val>");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + " 12.6% " + "'", str5, " 12.6% ");
// flaky:         org.junit.Assert.assertNotNull(textNode6);
    }

    @Test
    public void test169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test169");
        org.jsoup.nodes.SerializedObjectSupporter serializedObjectSupporter0 = new org.jsoup.nodes.SerializedObjectSupporter();
        java.lang.StringBuilder stringBuilder1 = serializedObjectSupporter0.deserializeObjectStringBuilder18();
        org.jsoup.nodes.TextNode textNode2 = serializedObjectSupporter0.deserializeObjectTextNode4();
        org.jsoup.nodes.TextNode textNode3 = serializedObjectSupporter0.deserializeObjectTextNode276();
        org.jsoup.nodes.TextNode textNode4 = serializedObjectSupporter0.deserializeObjectTextNode377();
        org.junit.Assert.assertNotNull(stringBuilder1);
        org.junit.Assert.assertEquals(stringBuilder1.toString(), "<p>This <a>");
// flaky:         org.junit.Assert.assertNotNull(textNode2);
// flaky:         org.junit.Assert.assertNotNull(textNode3);
// flaky:         org.junit.Assert.assertNotNull(textNode4);
    }

    @Test
    public void test170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test170");
        java.lang.String str0 = org.jsoup.nodes.TextNode.TEXT_KEY;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "text" + "'", str0, "text");
    }

    @Test
    public void test171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test171");
        org.jsoup.nodes.SerializedObjectSupporter serializedObjectSupporter0 = new org.jsoup.nodes.SerializedObjectSupporter();
        java.lang.StringBuilder stringBuilder1 = serializedObjectSupporter0.deserializeObjectStringBuilder18();
        org.jsoup.nodes.TextNode textNode2 = serializedObjectSupporter0.deserializeObjectTextNode252();
        org.jsoup.nodes.TextNode textNode3 = serializedObjectSupporter0.deserializeObjectTextNode393();
        java.lang.StringBuilder stringBuilder4 = serializedObjectSupporter0.deserializeObjectStringBuilder358();
        org.junit.Assert.assertNotNull(stringBuilder1);
        org.junit.Assert.assertEquals(stringBuilder1.toString(), "<p>This <a>");
// flaky:         org.junit.Assert.assertNotNull(textNode2);
// flaky:         org.junit.Assert.assertNotNull(textNode3);
        org.junit.Assert.assertNotNull(stringBuilder4);
        org.junit.Assert.assertEquals(stringBuilder4.toString(), "<table>\n <tbody>\n  <tr>\n   <td>1</td>\n  </tr> \n  <tr>\n   <td>2</td>\n  </tr> \n  <tr>\n   <td> \n    <table>\n     <tbody>\n      <tr>\n       <td>3</td> \n       <td>4</td>\n      </tr>\n     </tbody>\n    </table>");
    }

    @Test
    public void test172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test172");
        org.jsoup.nodes.SerializedObjectSupporter serializedObjectSupporter0 = new org.jsoup.nodes.SerializedObjectSupporter();
        org.jsoup.nodes.TextNode textNode1 = serializedObjectSupporter0.deserializeObjectTextNode372();
        org.jsoup.nodes.TextNode textNode2 = serializedObjectSupporter0.deserializeObjectTextNode34();
        java.lang.StringBuilder stringBuilder3 = serializedObjectSupporter0.deserializeObjectStringBuilder342();
        java.lang.StringBuilder stringBuilder4 = serializedObjectSupporter0.deserializeObjectStringBuilder416();
        java.lang.StringBuilder stringBuilder5 = serializedObjectSupporter0.deserializeObjectStringBuilder336();
        java.lang.String str6 = serializedObjectSupporter0.deserializeObjectString67();
        org.jsoup.nodes.TextNode textNode7 = serializedObjectSupporter0.deserializeObjectTextNode139();
        org.jsoup.nodes.TextNode textNode8 = serializedObjectSupporter0.deserializeObjectTextNode251();
        java.lang.String str9 = serializedObjectSupporter0.deserializeObjectString47();
        java.lang.StringBuilder stringBuilder10 = serializedObjectSupporter0.deserializeObjectStringBuilder96();
        org.jsoup.nodes.TextNode textNode11 = serializedObjectSupporter0.deserializeObjectTextNode208();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Document document12 = serializedObjectSupporter0.deserializeObjectDocument12();
// flaky:             org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: org.jsoup.nodes.Document$OutputSettings cannot be cast to org.jsoup.nodes.Document");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
// flaky:         org.junit.Assert.assertNotNull(textNode1);
// flaky:         org.junit.Assert.assertNotNull(textNode2);
        org.junit.Assert.assertNotNull(stringBuilder3);
        org.junit.Assert.assertEquals(stringBuilder3.toString(), "\n0\n<p>");
        org.junit.Assert.assertNotNull(stringBuilder4);
        org.junit.Assert.assertEquals(stringBuilder4.toString(), "<!DOCTYPE html>\n<html>\n<head></head>\n<body>\n<p><b class=\"x\"><b class=\"x\"><b><b class=\"x\"><b class=\"x\"><b>X </b></b></b></b></b></b></p>\n<p><b class=\"x\"><b><b class=\"x\"><b class=\"x\"><b>X </b></b></b></b></b></p>\n<p><b class=\"x\"><b><b class=\"x\"><b class=\"x\"><b><b><b class=\"x\"><b>");
        org.junit.Assert.assertNotNull(stringBuilder5);
        org.junit.Assert.assertEquals(stringBuilder5.toString(), "\n<!-- comment -->\n<!-- comment 2 -->\n<html>\n <head></head>\n <body>\n  <p>");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + " three" + "'", str6, " three");
// flaky:         org.junit.Assert.assertNotNull(textNode7);
// flaky:         org.junit.Assert.assertNotNull(textNode8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "There!" + "'", str9, "There!");
        org.junit.Assert.assertNotNull(stringBuilder10);
        org.junit.Assert.assertEquals(stringBuilder10.toString(), "<p><span>");
// flaky:         org.junit.Assert.assertNotNull(textNode11);
    }

    @Test
    public void test173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test173");
        org.jsoup.nodes.SerializedObjectSupporter serializedObjectSupporter0 = new org.jsoup.nodes.SerializedObjectSupporter();
        org.jsoup.nodes.TextNode textNode1 = serializedObjectSupporter0.deserializeObjectTextNode105();
        org.jsoup.nodes.TextNode textNode2 = serializedObjectSupporter0.deserializeObjectTextNode383();
        java.lang.StringBuilder stringBuilder3 = serializedObjectSupporter0.deserializeObjectStringBuilder370();
// flaky:         org.junit.Assert.assertNotNull(textNode1);
// flaky:         org.junit.Assert.assertNotNull(textNode2);
        org.junit.Assert.assertNotNull(stringBuilder3);
        org.junit.Assert.assertEquals(stringBuilder3.toString(), "<table>\n <tbody>\n  <tr>\n   <td>");
    }

    @Test
    public void test174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test174");
        org.jsoup.nodes.SerializedObjectSupporter serializedObjectSupporter0 = new org.jsoup.nodes.SerializedObjectSupporter();
        org.jsoup.nodes.TextNode textNode1 = serializedObjectSupporter0.deserializeObjectTextNode105();
        org.jsoup.nodes.TextNode textNode2 = serializedObjectSupporter0.deserializeObjectTextNode112();
        java.lang.StringBuilder stringBuilder3 = serializedObjectSupporter0.deserializeObjectStringBuilder139();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Document document4 = serializedObjectSupporter0.deserializeObjectDocument145();
// flaky:             org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: org.jsoup.nodes.Document$OutputSettings cannot be cast to org.jsoup.nodes.Document");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
// flaky:         org.junit.Assert.assertNotNull(textNode1);
// flaky:         org.junit.Assert.assertNotNull(textNode2);
        org.junit.Assert.assertNotNull(stringBuilder3);
        org.junit.Assert.assertEquals(stringBuilder3.toString(), "<p>");
    }

    @Test
    public void test175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test175");
        org.jsoup.nodes.Document.OutputSettings outputSettings0 = new org.jsoup.nodes.Document.OutputSettings();
        int int1 = outputSettings0.indentAmount();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1 + "'", int1 == 1);
    }

    @Test
    public void test176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test176");
        org.jsoup.nodes.SerializedObjectSupporter serializedObjectSupporter0 = new org.jsoup.nodes.SerializedObjectSupporter();
        org.jsoup.nodes.TextNode textNode1 = serializedObjectSupporter0.deserializeObjectTextNode105();
        org.jsoup.nodes.TextNode textNode2 = serializedObjectSupporter0.deserializeObjectTextNode99();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString61();
        java.lang.StringBuilder stringBuilder4 = serializedObjectSupporter0.deserializeObjectStringBuilder267();
        org.jsoup.nodes.TextNode textNode5 = serializedObjectSupporter0.deserializeObjectTextNode285();
        java.lang.StringBuilder stringBuilder6 = serializedObjectSupporter0.deserializeObjectStringBuilder5();
        org.jsoup.nodes.TextNode textNode7 = serializedObjectSupporter0.deserializeObjectTextNode353();
// flaky:         org.junit.Assert.assertNotNull(textNode1);
// flaky:         org.junit.Assert.assertNotNull(textNode2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Another" + "'", str3, "Another");
        org.junit.Assert.assertNotNull(stringBuilder4);
        org.junit.Assert.assertEquals(stringBuilder4.toString(), "<doc>\n <val>");
// flaky:         org.junit.Assert.assertNotNull(textNode5);
        org.junit.Assert.assertNotNull(stringBuilder6);
        org.junit.Assert.assertEquals(stringBuilder6.toString(), "<div>");
// flaky:         org.junit.Assert.assertNotNull(textNode7);
    }

    @Test
    public void test177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test177");
        org.jsoup.nodes.SerializedObjectSupporter serializedObjectSupporter0 = new org.jsoup.nodes.SerializedObjectSupporter();
        java.lang.StringBuilder stringBuilder1 = serializedObjectSupporter0.deserializeObjectStringBuilder18();
        org.jsoup.nodes.TextNode textNode2 = serializedObjectSupporter0.deserializeObjectTextNode4();
        org.jsoup.nodes.TextNode textNode3 = serializedObjectSupporter0.deserializeObjectTextNode238();
        org.jsoup.nodes.TextNode textNode4 = serializedObjectSupporter0.deserializeObjectTextNode281();
        java.lang.StringBuilder stringBuilder5 = serializedObjectSupporter0.deserializeObjectStringBuilder301();
        java.lang.StringBuilder stringBuilder6 = serializedObjectSupporter0.deserializeObjectStringBuilder317();
        org.junit.Assert.assertNotNull(stringBuilder1);
        org.junit.Assert.assertEquals(stringBuilder1.toString(), "<p>This <a>");
// flaky:         org.junit.Assert.assertNotNull(textNode2);
// flaky:         org.junit.Assert.assertNotNull(textNode3);
// flaky:         org.junit.Assert.assertNotNull(textNode4);
        org.junit.Assert.assertNotNull(stringBuilder5);
        org.junit.Assert.assertEquals(stringBuilder5.toString(), "<h1>Hello </h1>\n<h2>There \n <hgroup>\n  <h1>Another</h1>\n  <h2>headline</h2>\n </hgroup> \n <hgroup>\n  <h1>More</h1>\n  <p>");
        org.junit.Assert.assertNotNull(stringBuilder6);
        org.junit.Assert.assertEquals(stringBuilder6.toString(), "<font>");
    }

    @Test
    public void test178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test178");
        org.jsoup.nodes.SerializedObjectSupporter serializedObjectSupporter0 = new org.jsoup.nodes.SerializedObjectSupporter();
        java.lang.String str1 = serializedObjectSupporter0.deserializeObjectString130();
        java.lang.StringBuilder stringBuilder2 = serializedObjectSupporter0.deserializeObjectStringBuilder312();
        java.lang.StringBuilder stringBuilder3 = serializedObjectSupporter0.deserializeObjectStringBuilder244();
        java.lang.StringBuilder stringBuilder4 = serializedObjectSupporter0.deserializeObjectStringBuilder180();
        org.jsoup.nodes.TextNode textNode5 = serializedObjectSupporter0.deserializeObjectTextNode222();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "X\n" + "'", str1, "X\n");
        org.junit.Assert.assertNotNull(stringBuilder2);
        org.junit.Assert.assertEquals(stringBuilder2.toString(), "<html>\n <head>\n  <noscript></noscript>\n </head>\n <body>\n  <img src=\"foo\" />\n  <p>");
        org.junit.Assert.assertNotNull(stringBuilder3);
        org.junit.Assert.assertEquals(stringBuilder3.toString(), "<p>");
        org.junit.Assert.assertNotNull(stringBuilder4);
        org.junit.Assert.assertEquals(stringBuilder4.toString(), "One <span>two &amp;</span>");
// flaky:         org.junit.Assert.assertNotNull(textNode5);
    }

    @Test
    public void test179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test179");
        org.jsoup.nodes.SerializedObjectSupporter serializedObjectSupporter0 = new org.jsoup.nodes.SerializedObjectSupporter();
        org.jsoup.nodes.TextNode textNode1 = serializedObjectSupporter0.deserializeObjectTextNode105();
        org.jsoup.nodes.TextNode textNode2 = serializedObjectSupporter0.deserializeObjectTextNode99();
        org.jsoup.nodes.TextNode textNode3 = serializedObjectSupporter0.deserializeObjectTextNode391();
        org.jsoup.nodes.TextNode textNode4 = serializedObjectSupporter0.deserializeObjectTextNode274();
        java.lang.StringBuilder stringBuilder5 = serializedObjectSupporter0.deserializeObjectStringBuilder18();
        java.lang.StringBuilder stringBuilder6 = serializedObjectSupporter0.deserializeObjectStringBuilder197();
        org.jsoup.nodes.TextNode textNode7 = serializedObjectSupporter0.deserializeObjectTextNode238();
        org.jsoup.nodes.TextNode textNode8 = serializedObjectSupporter0.deserializeObjectTextNode372();
// flaky:         org.junit.Assert.assertNotNull(textNode1);
// flaky:         org.junit.Assert.assertNotNull(textNode2);
// flaky:         org.junit.Assert.assertNotNull(textNode3);
// flaky:         org.junit.Assert.assertNotNull(textNode4);
        org.junit.Assert.assertNotNull(stringBuilder5);
        org.junit.Assert.assertEquals(stringBuilder5.toString(), "<p>This <a>");
        org.junit.Assert.assertNotNull(stringBuilder6);
        org.junit.Assert.assertEquals(stringBuilder6.toString(), "<p>");
// flaky:         org.junit.Assert.assertNotNull(textNode7);
// flaky:         org.junit.Assert.assertNotNull(textNode8);
    }

    @Test
    public void test180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test180");
        org.jsoup.nodes.Document.OutputSettings outputSettings0 = new org.jsoup.nodes.Document.OutputSettings();
        java.nio.charset.Charset charset1 = outputSettings0.charset();
        boolean boolean2 = outputSettings0.getprettyPrint();
        java.nio.charset.CharsetEncoder charsetEncoder3 = outputSettings0.encoder();
        org.junit.Assert.assertNotNull(charset1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(charsetEncoder3);
    }

    @Test
    public void test181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test181");
        org.jsoup.nodes.SerializedObjectSupporter serializedObjectSupporter0 = new org.jsoup.nodes.SerializedObjectSupporter();
        org.jsoup.nodes.TextNode textNode1 = serializedObjectSupporter0.deserializeObjectTextNode372();
        org.jsoup.nodes.TextNode textNode2 = serializedObjectSupporter0.deserializeObjectTextNode34();
        java.lang.StringBuilder stringBuilder3 = serializedObjectSupporter0.deserializeObjectStringBuilder342();
        org.jsoup.nodes.TextNode textNode4 = serializedObjectSupporter0.deserializeObjectTextNode17();
        org.jsoup.nodes.TextNode textNode5 = serializedObjectSupporter0.deserializeObjectTextNode208();
        org.jsoup.nodes.TextNode textNode6 = serializedObjectSupporter0.deserializeObjectTextNode218();
        java.lang.StringBuilder stringBuilder7 = serializedObjectSupporter0.deserializeObjectStringBuilder141();
// flaky:         org.junit.Assert.assertNotNull(textNode1);
// flaky:         org.junit.Assert.assertNotNull(textNode2);
        org.junit.Assert.assertNotNull(stringBuilder3);
        org.junit.Assert.assertEquals(stringBuilder3.toString(), "\n0\n<p>");
// flaky:         org.junit.Assert.assertNotNull(textNode4);
// flaky:         org.junit.Assert.assertNotNull(textNode5);
// flaky:         org.junit.Assert.assertNotNull(textNode6);
        org.junit.Assert.assertNotNull(stringBuilder7);
        org.junit.Assert.assertEquals(stringBuilder7.toString(), "<div id=\"1\"></div>\n<div id=\"2\">");
    }

    @Test
    public void test182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test182");
        org.jsoup.nodes.SerializedObjectSupporter serializedObjectSupporter0 = new org.jsoup.nodes.SerializedObjectSupporter();
        org.jsoup.nodes.TextNode textNode1 = serializedObjectSupporter0.deserializeObjectTextNode372();
        org.jsoup.nodes.TextNode textNode2 = serializedObjectSupporter0.deserializeObjectTextNode34();
        java.lang.StringBuilder stringBuilder3 = serializedObjectSupporter0.deserializeObjectStringBuilder342();
        java.lang.StringBuilder stringBuilder4 = serializedObjectSupporter0.deserializeObjectStringBuilder82();
        java.lang.StringBuilder stringBuilder5 = serializedObjectSupporter0.deserializeObjectStringBuilder385();
        java.lang.StringBuilder stringBuilder6 = serializedObjectSupporter0.deserializeObjectStringBuilder194();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Document document7 = serializedObjectSupporter0.deserializeObjectDocument19();
// flaky:             org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: org.jsoup.nodes.Document$OutputSettings cannot be cast to org.jsoup.nodes.Document");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
// flaky:         org.junit.Assert.assertNotNull(textNode1);
// flaky:         org.junit.Assert.assertNotNull(textNode2);
        org.junit.Assert.assertNotNull(stringBuilder3);
        org.junit.Assert.assertEquals(stringBuilder3.toString(), "\n0\n<p>");
        org.junit.Assert.assertNotNull(stringBuilder4);
        org.junit.Assert.assertEquals(stringBuilder4.toString(), "<div>\n <div>");
        org.junit.Assert.assertNotNull(stringBuilder5);
        org.junit.Assert.assertEquals(stringBuilder5.toString(), "<table> \n <colgroup> \n  <col /> \n </colgroup>\n <colgroup> \n  <col /> \n  <col /> \n  <col />");
        org.junit.Assert.assertNotNull(stringBuilder6);
        org.junit.Assert.assertEquals(stringBuilder6.toString(), "<p>One <em>four</em><i>");
    }

    @Test
    public void test183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test183");
        org.jsoup.nodes.SerializedObjectSupporter serializedObjectSupporter0 = new org.jsoup.nodes.SerializedObjectSupporter();
        java.lang.StringBuilder stringBuilder1 = serializedObjectSupporter0.deserializeObjectStringBuilder18();
        org.jsoup.nodes.TextNode textNode2 = serializedObjectSupporter0.deserializeObjectTextNode252();
        org.jsoup.nodes.TextNode textNode3 = serializedObjectSupporter0.deserializeObjectTextNode393();
        org.jsoup.nodes.TextNode textNode4 = serializedObjectSupporter0.deserializeObjectTextNode255();
        org.junit.Assert.assertNotNull(stringBuilder1);
        org.junit.Assert.assertEquals(stringBuilder1.toString(), "<p>This <a>");
// flaky:         org.junit.Assert.assertNotNull(textNode2);
// flaky:         org.junit.Assert.assertNotNull(textNode3);
// flaky:         org.junit.Assert.assertNotNull(textNode4);
    }
}
