import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest41 {

    public static boolean debug = false;

    @Test
    public void test20501() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20501");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("", "#text");
        textNode2.setBaseUri("");
        int int5 = textNode2.siblingIndex();
        org.jsoup.nodes.Document document6 = textNode2.ownerDocument();
        java.lang.String str7 = textNode2.nodeName();
        int int8 = textNode2.childNodeSize();
        java.lang.String str10 = textNode2.attr("");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNull(document6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "#text" + "'", str7, "#text");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
    }

    @Test
    public void test20502() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20502");
        org.jsoup.nodes.Document.OutputSettings outputSettings0 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Document.OutputSettings outputSettings1 = new org.jsoup.nodes.Document.OutputSettings();
        int int2 = outputSettings1.indentAmount();
        org.jsoup.nodes.Entities.EscapeMode escapeMode3 = outputSettings1.escapeMode();
        org.jsoup.nodes.Document.OutputSettings outputSettings4 = outputSettings0.escapeMode(escapeMode3);
        org.jsoup.nodes.Document.OutputSettings outputSettings6 = outputSettings0.indentAmount((int) (short) 100);
        org.jsoup.nodes.Document.OutputSettings outputSettings7 = new org.jsoup.nodes.Document.OutputSettings();
        boolean boolean8 = outputSettings7.prettyPrint();
        org.jsoup.nodes.Document.OutputSettings outputSettings10 = outputSettings7.prettyPrint(false);
        org.jsoup.nodes.Document.OutputSettings outputSettings11 = new org.jsoup.nodes.Document.OutputSettings();
        boolean boolean12 = outputSettings11.prettyPrint();
        org.jsoup.nodes.Document.OutputSettings outputSettings13 = new org.jsoup.nodes.Document.OutputSettings();
        int int14 = outputSettings13.indentAmount();
        org.jsoup.nodes.Entities.EscapeMode escapeMode15 = outputSettings13.escapeMode();
        java.nio.charset.Charset charset16 = outputSettings13.charset();
        org.jsoup.nodes.Document.OutputSettings outputSettings17 = outputSettings11.charset(charset16);
        org.jsoup.nodes.Document.OutputSettings outputSettings18 = outputSettings10.charset(charset16);
        org.jsoup.nodes.Document.OutputSettings outputSettings19 = outputSettings6.charset(charset16);
        org.jsoup.nodes.Document.OutputSettings outputSettings20 = new org.jsoup.nodes.Document.OutputSettings();
        boolean boolean21 = outputSettings20.prettyPrint();
        org.jsoup.nodes.Document.OutputSettings outputSettings23 = outputSettings20.prettyPrint(false);
        boolean boolean24 = outputSettings23.prettyPrint();
        org.jsoup.nodes.Document.OutputSettings outputSettings26 = outputSettings23.indentAmount(10);
        org.jsoup.nodes.Document.OutputSettings outputSettings27 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Document.OutputSettings outputSettings28 = new org.jsoup.nodes.Document.OutputSettings();
        int int29 = outputSettings28.indentAmount();
        org.jsoup.nodes.Entities.EscapeMode escapeMode30 = outputSettings28.escapeMode();
        org.jsoup.nodes.Document.OutputSettings outputSettings31 = outputSettings27.escapeMode(escapeMode30);
        org.jsoup.nodes.Document.OutputSettings outputSettings33 = outputSettings27.indentAmount((int) (short) 100);
        org.jsoup.nodes.Document.OutputSettings outputSettings34 = new org.jsoup.nodes.Document.OutputSettings();
        boolean boolean35 = outputSettings34.prettyPrint();
        org.jsoup.nodes.Document.OutputSettings outputSettings37 = outputSettings34.prettyPrint(false);
        org.jsoup.nodes.Document.OutputSettings outputSettings38 = new org.jsoup.nodes.Document.OutputSettings();
        boolean boolean39 = outputSettings38.prettyPrint();
        org.jsoup.nodes.Document.OutputSettings outputSettings40 = new org.jsoup.nodes.Document.OutputSettings();
        int int41 = outputSettings40.indentAmount();
        org.jsoup.nodes.Entities.EscapeMode escapeMode42 = outputSettings40.escapeMode();
        java.nio.charset.Charset charset43 = outputSettings40.charset();
        org.jsoup.nodes.Document.OutputSettings outputSettings44 = outputSettings38.charset(charset43);
        org.jsoup.nodes.Document.OutputSettings outputSettings45 = outputSettings37.charset(charset43);
        org.jsoup.nodes.Document.OutputSettings outputSettings46 = outputSettings33.charset(charset43);
        org.jsoup.nodes.Document.OutputSettings outputSettings47 = outputSettings26.charset(charset43);
        org.jsoup.nodes.Document.OutputSettings outputSettings48 = outputSettings6.charset(charset43);
        java.nio.charset.Charset charset49 = outputSettings48.charset();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
        org.junit.Assert.assertTrue("'" + escapeMode3 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode3.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertNotNull(outputSettings4);
        org.junit.Assert.assertNotNull(outputSettings6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(outputSettings10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertTrue("'" + escapeMode15 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode15.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertNotNull(charset16);
        org.junit.Assert.assertNotNull(outputSettings17);
        org.junit.Assert.assertNotNull(outputSettings18);
        org.junit.Assert.assertNotNull(outputSettings19);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertNotNull(outputSettings23);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(outputSettings26);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 1 + "'", int29 == 1);
        org.junit.Assert.assertTrue("'" + escapeMode30 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode30.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertNotNull(outputSettings31);
        org.junit.Assert.assertNotNull(outputSettings33);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + true + "'", boolean35 == true);
        org.junit.Assert.assertNotNull(outputSettings37);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + true + "'", boolean39 == true);
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 1 + "'", int41 == 1);
        org.junit.Assert.assertTrue("'" + escapeMode42 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode42.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertNotNull(charset43);
        org.junit.Assert.assertNotNull(outputSettings44);
        org.junit.Assert.assertNotNull(outputSettings45);
        org.junit.Assert.assertNotNull(outputSettings46);
        org.junit.Assert.assertNotNull(outputSettings47);
        org.junit.Assert.assertNotNull(outputSettings48);
        org.junit.Assert.assertNotNull(charset49);
    }

    @Test
    public void test20503() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20503");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("#text", "#text");
        java.util.List<org.jsoup.nodes.Node> nodeList3 = textNode2.siblingNodes();
        int int4 = textNode2.childNodeSize();
        java.lang.String str5 = textNode2.text();
        java.lang.String str6 = textNode2.text();
        java.lang.String str7 = textNode2.baseUri();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node8 = textNode2.unwrap();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(nodeList3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "#text" + "'", str5, "#text");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "#text" + "'", str6, "#text");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "#text" + "'", str7, "#text");
    }

    @Test
    public void test20504() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20504");
        org.jsoup.nodes.Document.OutputSettings outputSettings0 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Document.OutputSettings outputSettings1 = outputSettings0.clone();
        org.jsoup.nodes.Document.OutputSettings outputSettings3 = outputSettings0.prettyPrint(true);
        org.jsoup.nodes.Document.OutputSettings outputSettings4 = outputSettings3.clone();
        org.jsoup.nodes.Document.OutputSettings outputSettings6 = outputSettings3.prettyPrint(false);
        org.jsoup.nodes.Document.OutputSettings outputSettings7 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Document.OutputSettings outputSettings8 = outputSettings7.clone();
        boolean boolean9 = outputSettings8.prettyPrint();
        org.jsoup.nodes.Document.OutputSettings outputSettings10 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Document.OutputSettings outputSettings11 = new org.jsoup.nodes.Document.OutputSettings();
        int int12 = outputSettings11.indentAmount();
        org.jsoup.nodes.Entities.EscapeMode escapeMode13 = outputSettings11.escapeMode();
        org.jsoup.nodes.Document.OutputSettings outputSettings14 = outputSettings10.escapeMode(escapeMode13);
        org.jsoup.nodes.Document.OutputSettings outputSettings15 = outputSettings8.escapeMode(escapeMode13);
        org.jsoup.nodes.Document.OutputSettings outputSettings16 = outputSettings6.escapeMode(escapeMode13);
        org.jsoup.nodes.Document.OutputSettings outputSettings17 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Document.OutputSettings outputSettings18 = new org.jsoup.nodes.Document.OutputSettings();
        int int19 = outputSettings18.indentAmount();
        org.jsoup.nodes.Entities.EscapeMode escapeMode20 = outputSettings18.escapeMode();
        org.jsoup.nodes.Document.OutputSettings outputSettings21 = outputSettings17.escapeMode(escapeMode20);
        org.jsoup.nodes.Document.OutputSettings outputSettings23 = outputSettings17.indentAmount((int) (short) 100);
        org.jsoup.nodes.Entities.EscapeMode escapeMode24 = outputSettings17.escapeMode();
        org.jsoup.nodes.Document.OutputSettings outputSettings26 = outputSettings17.indentAmount((int) (short) 1);
        org.jsoup.nodes.Document.OutputSettings outputSettings27 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Document.OutputSettings outputSettings28 = new org.jsoup.nodes.Document.OutputSettings();
        int int29 = outputSettings28.indentAmount();
        org.jsoup.nodes.Entities.EscapeMode escapeMode30 = outputSettings28.escapeMode();
        org.jsoup.nodes.Document.OutputSettings outputSettings31 = outputSettings27.escapeMode(escapeMode30);
        org.jsoup.nodes.Entities.EscapeMode escapeMode32 = outputSettings31.escapeMode();
        org.jsoup.nodes.Document.OutputSettings outputSettings33 = outputSettings26.escapeMode(escapeMode32);
        java.nio.charset.Charset charset34 = outputSettings26.charset();
        org.jsoup.nodes.Document.OutputSettings outputSettings35 = outputSettings16.charset(charset34);
        org.jsoup.nodes.Document.OutputSettings outputSettings36 = new org.jsoup.nodes.Document.OutputSettings();
        boolean boolean37 = outputSettings36.prettyPrint();
        org.jsoup.nodes.Document.OutputSettings outputSettings39 = outputSettings36.prettyPrint(false);
        org.jsoup.nodes.Document.OutputSettings outputSettings41 = outputSettings36.indentAmount((int) '#');
        java.nio.charset.Charset charset42 = outputSettings36.charset();
        org.jsoup.nodes.Document.OutputSettings outputSettings43 = outputSettings35.charset(charset42);
        org.jsoup.nodes.Document.OutputSettings outputSettings45 = outputSettings43.indentAmount((int) 'a');
        org.jsoup.nodes.Document.OutputSettings outputSettings46 = outputSettings45.clone();
        org.jsoup.nodes.TextNode textNode49 = org.jsoup.nodes.TextNode.createFromEncoded("", "");
        java.lang.String str51 = textNode49.absUrl("i!");
        java.lang.String str52 = textNode49.text();
        org.jsoup.nodes.Document.OutputSettings outputSettings53 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Document.OutputSettings outputSettings54 = new org.jsoup.nodes.Document.OutputSettings();
        int int55 = outputSettings54.indentAmount();
        org.jsoup.nodes.Entities.EscapeMode escapeMode56 = outputSettings54.escapeMode();
        org.jsoup.nodes.Document.OutputSettings outputSettings57 = outputSettings53.escapeMode(escapeMode56);
        org.jsoup.nodes.Document.OutputSettings outputSettings59 = outputSettings53.indentAmount((int) (short) 100);
        org.jsoup.nodes.Entities.EscapeMode escapeMode60 = outputSettings53.escapeMode();
        org.jsoup.nodes.Document.OutputSettings outputSettings62 = outputSettings53.prettyPrint(true);
        java.nio.charset.Charset charset63 = outputSettings62.charset();
        boolean boolean64 = textNode49.equals((java.lang.Object) charset63);
        org.jsoup.nodes.Document.OutputSettings outputSettings65 = outputSettings45.charset(charset63);
        org.junit.Assert.assertNotNull(outputSettings1);
        org.junit.Assert.assertNotNull(outputSettings3);
        org.junit.Assert.assertNotNull(outputSettings4);
        org.junit.Assert.assertNotNull(outputSettings6);
        org.junit.Assert.assertNotNull(outputSettings8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + escapeMode13 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode13.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertNotNull(outputSettings14);
        org.junit.Assert.assertNotNull(outputSettings15);
        org.junit.Assert.assertNotNull(outputSettings16);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 1 + "'", int19 == 1);
        org.junit.Assert.assertTrue("'" + escapeMode20 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode20.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertNotNull(outputSettings21);
        org.junit.Assert.assertNotNull(outputSettings23);
        org.junit.Assert.assertTrue("'" + escapeMode24 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode24.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertNotNull(outputSettings26);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 1 + "'", int29 == 1);
        org.junit.Assert.assertTrue("'" + escapeMode30 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode30.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertNotNull(outputSettings31);
        org.junit.Assert.assertTrue("'" + escapeMode32 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode32.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertNotNull(outputSettings33);
        org.junit.Assert.assertNotNull(charset34);
        org.junit.Assert.assertNotNull(outputSettings35);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + true + "'", boolean37 == true);
        org.junit.Assert.assertNotNull(outputSettings39);
        org.junit.Assert.assertNotNull(outputSettings41);
        org.junit.Assert.assertNotNull(charset42);
        org.junit.Assert.assertNotNull(outputSettings43);
        org.junit.Assert.assertNotNull(outputSettings45);
        org.junit.Assert.assertNotNull(outputSettings46);
        org.junit.Assert.assertNotNull(textNode49);
        org.junit.Assert.assertEquals("'" + str51 + "' != '" + "" + "'", str51, "");
        org.junit.Assert.assertEquals("'" + str52 + "' != '" + "" + "'", str52, "");
        org.junit.Assert.assertTrue("'" + int55 + "' != '" + 1 + "'", int55 == 1);
        org.junit.Assert.assertTrue("'" + escapeMode56 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode56.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertNotNull(outputSettings57);
        org.junit.Assert.assertNotNull(outputSettings59);
        org.junit.Assert.assertTrue("'" + escapeMode60 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode60.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertNotNull(outputSettings62);
        org.junit.Assert.assertNotNull(charset63);
        org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + false + "'", boolean64 == false);
        org.junit.Assert.assertNotNull(outputSettings65);
    }

    @Test
    public void test20505() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20505");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("", "");
        boolean boolean3 = textNode2.isBlank();
        org.jsoup.nodes.Node node4 = textNode2.previousSibling();
        org.jsoup.nodes.Node node5 = textNode2.parent();
        java.lang.String str7 = textNode2.absUrl("#text");
        org.jsoup.nodes.Node node8 = textNode2.previousSibling();
        boolean boolean10 = textNode2.hasAttr("#text");
        java.util.List<org.jsoup.nodes.Node> nodeList11 = textNode2.siblingNodes();
        boolean boolean13 = textNode2.hasAttr("hi!");
        org.jsoup.nodes.Node node14 = textNode2.previousSibling();
        java.lang.String str15 = textNode2.nodeName();
        org.jsoup.nodes.Node node16 = textNode2.nextSibling();
        org.junit.Assert.assertNotNull(textNode2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNull(node4);
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNull(node8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(nodeList11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNull(node14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "#text" + "'", str15, "#text");
        org.junit.Assert.assertNull(node16);
    }

    @Test
    public void test20506() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20506");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("", "");
        boolean boolean3 = textNode2.isBlank();
        org.jsoup.nodes.Node node4 = textNode2.previousSibling();
        org.jsoup.nodes.Node node7 = textNode2.attr("hi!", "");
        java.lang.String str8 = textNode2.baseUri();
        boolean boolean9 = textNode2.isBlank();
        org.jsoup.nodes.Document document10 = textNode2.ownerDocument();
        java.lang.String str11 = textNode2.toString();
        java.lang.String str12 = textNode2.text();
        org.junit.Assert.assertNotNull(textNode2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNull(node4);
        org.junit.Assert.assertNotNull(node7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNull(document10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
    }

    @Test
    public void test20507() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20507");
        org.jsoup.nodes.Document.OutputSettings outputSettings0 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Document.OutputSettings outputSettings1 = outputSettings0.clone();
        org.jsoup.nodes.Document.OutputSettings outputSettings3 = outputSettings0.prettyPrint(true);
        org.jsoup.nodes.Document.OutputSettings outputSettings4 = outputSettings3.clone();
        org.jsoup.nodes.Document.OutputSettings outputSettings6 = outputSettings3.prettyPrint(false);
        org.jsoup.nodes.Entities.EscapeMode escapeMode7 = outputSettings3.escapeMode();
        org.jsoup.nodes.Document.OutputSettings outputSettings8 = outputSettings3.clone();
        org.jsoup.nodes.Document.OutputSettings outputSettings9 = new org.jsoup.nodes.Document.OutputSettings();
        boolean boolean10 = outputSettings9.prettyPrint();
        org.jsoup.nodes.Document.OutputSettings outputSettings12 = outputSettings9.prettyPrint(false);
        org.jsoup.nodes.Document.OutputSettings outputSettings13 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Entities.EscapeMode escapeMode14 = outputSettings13.escapeMode();
        org.jsoup.nodes.Document.OutputSettings outputSettings15 = outputSettings9.escapeMode(escapeMode14);
        org.jsoup.nodes.Document.OutputSettings outputSettings16 = outputSettings8.escapeMode(escapeMode14);
        org.jsoup.nodes.Document.OutputSettings outputSettings17 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Entities.EscapeMode escapeMode18 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings19 = outputSettings17.escapeMode(escapeMode18);
        int int20 = outputSettings19.indentAmount();
        boolean boolean21 = outputSettings19.prettyPrint();
        org.jsoup.nodes.Document.OutputSettings outputSettings22 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Entities.EscapeMode escapeMode23 = outputSettings22.escapeMode();
        org.jsoup.nodes.Document.OutputSettings outputSettings24 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Document.OutputSettings outputSettings25 = new org.jsoup.nodes.Document.OutputSettings();
        int int26 = outputSettings25.indentAmount();
        org.jsoup.nodes.Entities.EscapeMode escapeMode27 = outputSettings25.escapeMode();
        org.jsoup.nodes.Document.OutputSettings outputSettings28 = outputSettings24.escapeMode(escapeMode27);
        org.jsoup.nodes.Document.OutputSettings outputSettings30 = outputSettings24.indentAmount((int) (short) 100);
        org.jsoup.nodes.Entities.EscapeMode escapeMode31 = outputSettings24.escapeMode();
        org.jsoup.nodes.Document.OutputSettings outputSettings32 = outputSettings22.escapeMode(escapeMode31);
        org.jsoup.nodes.Document.OutputSettings outputSettings33 = outputSettings19.escapeMode(escapeMode31);
        org.jsoup.nodes.Document.OutputSettings outputSettings34 = outputSettings8.escapeMode(escapeMode31);
        org.jsoup.nodes.Document.OutputSettings outputSettings36 = outputSettings34.indentAmount(100);
        int int37 = outputSettings34.indentAmount();
        org.jsoup.nodes.Document.OutputSettings outputSettings38 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Entities.EscapeMode escapeMode39 = outputSettings38.escapeMode();
        boolean boolean40 = outputSettings38.prettyPrint();
        org.jsoup.nodes.Document.OutputSettings outputSettings41 = outputSettings38.clone();
        org.jsoup.nodes.Document.OutputSettings outputSettings42 = new org.jsoup.nodes.Document.OutputSettings();
        boolean boolean43 = outputSettings42.prettyPrint();
        org.jsoup.nodes.Document.OutputSettings outputSettings45 = outputSettings42.prettyPrint(false);
        org.jsoup.nodes.Document.OutputSettings outputSettings47 = outputSettings45.prettyPrint(false);
        org.jsoup.nodes.Document.OutputSettings outputSettings48 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Entities.EscapeMode escapeMode49 = outputSettings48.escapeMode();
        java.nio.charset.Charset charset50 = outputSettings48.charset();
        org.jsoup.nodes.Document.OutputSettings outputSettings51 = outputSettings45.charset(charset50);
        org.jsoup.nodes.Document.OutputSettings outputSettings52 = outputSettings38.charset(charset50);
        org.jsoup.nodes.Document.OutputSettings outputSettings53 = new org.jsoup.nodes.Document.OutputSettings();
        boolean boolean54 = outputSettings53.prettyPrint();
        org.jsoup.nodes.Document.OutputSettings outputSettings56 = outputSettings53.prettyPrint(false);
        org.jsoup.nodes.Document.OutputSettings outputSettings58 = outputSettings53.indentAmount((int) '#');
        org.jsoup.nodes.Entities.EscapeMode escapeMode59 = outputSettings53.escapeMode();
        org.jsoup.nodes.Document.OutputSettings outputSettings60 = outputSettings38.escapeMode(escapeMode59);
        java.nio.charset.Charset charset61 = outputSettings60.charset();
        org.jsoup.nodes.Entities.EscapeMode escapeMode62 = outputSettings60.escapeMode();
        java.nio.charset.Charset charset63 = outputSettings60.charset();
        org.jsoup.nodes.Document.OutputSettings outputSettings64 = new org.jsoup.nodes.Document.OutputSettings();
        boolean boolean65 = outputSettings64.prettyPrint();
        org.jsoup.nodes.Document.OutputSettings outputSettings67 = outputSettings64.prettyPrint(false);
        org.jsoup.nodes.Document.OutputSettings outputSettings69 = outputSettings64.indentAmount((int) '#');
        org.jsoup.nodes.Entities.EscapeMode escapeMode70 = outputSettings64.escapeMode();
        org.jsoup.nodes.Document.OutputSettings outputSettings71 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Entities.EscapeMode escapeMode72 = outputSettings71.escapeMode();
        org.jsoup.nodes.Document.OutputSettings outputSettings73 = outputSettings71.clone();
        org.jsoup.nodes.Document.OutputSettings outputSettings74 = new org.jsoup.nodes.Document.OutputSettings();
        int int75 = outputSettings74.indentAmount();
        org.jsoup.nodes.Entities.EscapeMode escapeMode76 = outputSettings74.escapeMode();
        java.nio.charset.Charset charset77 = outputSettings74.charset();
        org.jsoup.nodes.Document.OutputSettings outputSettings78 = outputSettings71.charset(charset77);
        org.jsoup.nodes.Document.OutputSettings outputSettings79 = outputSettings64.charset(charset77);
        org.jsoup.nodes.Document.OutputSettings outputSettings80 = outputSettings60.charset(charset77);
        org.jsoup.nodes.Document.OutputSettings outputSettings81 = outputSettings34.charset(charset77);
        org.jsoup.nodes.Document.OutputSettings outputSettings83 = outputSettings81.indentAmount(100);
        int int84 = outputSettings83.indentAmount();
        org.junit.Assert.assertNotNull(outputSettings1);
        org.junit.Assert.assertNotNull(outputSettings3);
        org.junit.Assert.assertNotNull(outputSettings4);
        org.junit.Assert.assertNotNull(outputSettings6);
        org.junit.Assert.assertTrue("'" + escapeMode7 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode7.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertNotNull(outputSettings8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(outputSettings12);
        org.junit.Assert.assertTrue("'" + escapeMode14 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode14.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertNotNull(outputSettings15);
        org.junit.Assert.assertNotNull(outputSettings16);
        org.junit.Assert.assertNotNull(outputSettings19);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 1 + "'", int20 == 1);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertTrue("'" + escapeMode23 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode23.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 1 + "'", int26 == 1);
        org.junit.Assert.assertTrue("'" + escapeMode27 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode27.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertNotNull(outputSettings28);
        org.junit.Assert.assertNotNull(outputSettings30);
        org.junit.Assert.assertTrue("'" + escapeMode31 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode31.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertNotNull(outputSettings32);
        org.junit.Assert.assertNotNull(outputSettings33);
        org.junit.Assert.assertNotNull(outputSettings34);
        org.junit.Assert.assertNotNull(outputSettings36);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 100 + "'", int37 == 100);
        org.junit.Assert.assertTrue("'" + escapeMode39 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode39.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + true + "'", boolean40 == true);
        org.junit.Assert.assertNotNull(outputSettings41);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + true + "'", boolean43 == true);
        org.junit.Assert.assertNotNull(outputSettings45);
        org.junit.Assert.assertNotNull(outputSettings47);
        org.junit.Assert.assertTrue("'" + escapeMode49 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode49.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertNotNull(charset50);
        org.junit.Assert.assertNotNull(outputSettings51);
        org.junit.Assert.assertNotNull(outputSettings52);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + true + "'", boolean54 == true);
        org.junit.Assert.assertNotNull(outputSettings56);
        org.junit.Assert.assertNotNull(outputSettings58);
        org.junit.Assert.assertTrue("'" + escapeMode59 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode59.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertNotNull(outputSettings60);
        org.junit.Assert.assertNotNull(charset61);
        org.junit.Assert.assertTrue("'" + escapeMode62 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode62.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertNotNull(charset63);
        org.junit.Assert.assertTrue("'" + boolean65 + "' != '" + true + "'", boolean65 == true);
        org.junit.Assert.assertNotNull(outputSettings67);
        org.junit.Assert.assertNotNull(outputSettings69);
        org.junit.Assert.assertTrue("'" + escapeMode70 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode70.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertTrue("'" + escapeMode72 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode72.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertNotNull(outputSettings73);
        org.junit.Assert.assertTrue("'" + int75 + "' != '" + 1 + "'", int75 == 1);
        org.junit.Assert.assertTrue("'" + escapeMode76 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode76.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertNotNull(charset77);
        org.junit.Assert.assertNotNull(outputSettings78);
        org.junit.Assert.assertNotNull(outputSettings79);
        org.junit.Assert.assertNotNull(outputSettings80);
        org.junit.Assert.assertNotNull(outputSettings81);
        org.junit.Assert.assertNotNull(outputSettings83);
        org.junit.Assert.assertTrue("'" + int84 + "' != '" + 100 + "'", int84 == 100);
    }

    @Test
    public void test20508() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20508");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("", "");
        java.util.List<org.jsoup.nodes.Node> nodeList3 = textNode2.childNodesCopy();
        org.jsoup.nodes.Document document4 = textNode2.ownerDocument();
        java.lang.String str6 = textNode2.attr("");
        java.lang.String str7 = textNode2.baseUri();
        org.jsoup.nodes.TextNode textNode9 = textNode2.text("");
        textNode2.setBaseUri("#text");
        java.lang.String str12 = textNode2.text();
        org.junit.Assert.assertNotNull(textNode2);
        org.junit.Assert.assertNotNull(nodeList3);
        org.junit.Assert.assertNull(document4);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNotNull(textNode9);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
    }

    @Test
    public void test20509() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20509");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("", "");
        java.lang.String str3 = textNode2.outerHtml();
        org.jsoup.nodes.TextNode textNode5 = textNode2.text("");
        org.jsoup.nodes.Node node8 = textNode2.attr("#text", "#text");
        java.lang.String str9 = textNode2.nodeName();
        org.jsoup.nodes.Node node10 = textNode2.nextSibling();
        java.lang.String str11 = textNode2.nodeName();
        org.jsoup.nodes.Document.OutputSettings outputSettings12 = new org.jsoup.nodes.Document.OutputSettings();
        int int13 = outputSettings12.indentAmount();
        org.jsoup.nodes.Entities.EscapeMode escapeMode14 = outputSettings12.escapeMode();
        org.jsoup.nodes.Document.OutputSettings outputSettings15 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Document.OutputSettings outputSettings16 = new org.jsoup.nodes.Document.OutputSettings();
        int int17 = outputSettings16.indentAmount();
        org.jsoup.nodes.Entities.EscapeMode escapeMode18 = outputSettings16.escapeMode();
        org.jsoup.nodes.Document.OutputSettings outputSettings19 = outputSettings15.escapeMode(escapeMode18);
        org.jsoup.nodes.Document.OutputSettings outputSettings20 = outputSettings12.escapeMode(escapeMode18);
        org.jsoup.nodes.Entities.EscapeMode escapeMode21 = outputSettings12.escapeMode();
        org.jsoup.nodes.Document.OutputSettings outputSettings23 = outputSettings12.prettyPrint(false);
        boolean boolean24 = textNode2.equals((java.lang.Object) false);
        org.jsoup.nodes.Node node25 = textNode2.clone();
        org.jsoup.nodes.TextNode textNode27 = textNode2.text("");
        org.jsoup.nodes.Attributes attributes28 = textNode2.attributes();
        org.junit.Assert.assertNotNull(textNode2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertNotNull(textNode5);
        org.junit.Assert.assertNotNull(node8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "#text" + "'", str9, "#text");
        org.junit.Assert.assertNull(node10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "#text" + "'", str11, "#text");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertTrue("'" + escapeMode14 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode14.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
        org.junit.Assert.assertTrue("'" + escapeMode18 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode18.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertNotNull(outputSettings19);
        org.junit.Assert.assertNotNull(outputSettings20);
        org.junit.Assert.assertTrue("'" + escapeMode21 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode21.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertNotNull(outputSettings23);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(node25);
        org.junit.Assert.assertNotNull(textNode27);
        org.junit.Assert.assertNotNull(attributes28);
    }

    @Test
    public void test20510() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20510");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("hi!", "#text");
        java.lang.String str4 = textNode2.attr("i!");
        int int5 = textNode2.siblingIndex();
        org.jsoup.nodes.Node node7 = textNode2.removeAttr("i!");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node9 = node7.before("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(textNode2);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(node7);
    }

    @Test
    public void test20511() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20511");
        org.jsoup.nodes.Document.OutputSettings outputSettings0 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Document.OutputSettings outputSettings1 = outputSettings0.clone();
        org.jsoup.nodes.Document.OutputSettings outputSettings3 = outputSettings1.prettyPrint(false);
        org.jsoup.nodes.Document.OutputSettings outputSettings4 = new org.jsoup.nodes.Document.OutputSettings();
        boolean boolean5 = outputSettings4.prettyPrint();
        org.jsoup.nodes.Document.OutputSettings outputSettings6 = new org.jsoup.nodes.Document.OutputSettings();
        int int7 = outputSettings6.indentAmount();
        org.jsoup.nodes.Entities.EscapeMode escapeMode8 = outputSettings6.escapeMode();
        java.nio.charset.Charset charset9 = outputSettings6.charset();
        org.jsoup.nodes.Document.OutputSettings outputSettings10 = outputSettings4.charset(charset9);
        org.jsoup.nodes.Document.OutputSettings outputSettings11 = outputSettings1.charset(charset9);
        org.jsoup.nodes.Document.OutputSettings outputSettings13 = outputSettings11.prettyPrint(true);
        org.jsoup.nodes.Document.OutputSettings outputSettings15 = outputSettings13.indentAmount((int) (byte) 100);
        java.nio.charset.Charset charset16 = outputSettings13.charset();
        org.jsoup.nodes.Document.OutputSettings outputSettings18 = outputSettings13.prettyPrint(false);
        org.jsoup.nodes.Document.OutputSettings outputSettings19 = outputSettings13.clone();
        org.jsoup.nodes.Document.OutputSettings outputSettings21 = outputSettings13.indentAmount((int) ' ');
        org.jsoup.nodes.Document.OutputSettings outputSettings22 = new org.jsoup.nodes.Document.OutputSettings();
        boolean boolean23 = outputSettings22.prettyPrint();
        org.jsoup.nodes.Document.OutputSettings outputSettings25 = outputSettings22.prettyPrint(false);
        boolean boolean26 = outputSettings25.prettyPrint();
        org.jsoup.nodes.Document.OutputSettings outputSettings28 = outputSettings25.indentAmount(10);
        org.jsoup.nodes.Document.OutputSettings outputSettings29 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Document.OutputSettings outputSettings30 = new org.jsoup.nodes.Document.OutputSettings();
        int int31 = outputSettings30.indentAmount();
        org.jsoup.nodes.Entities.EscapeMode escapeMode32 = outputSettings30.escapeMode();
        org.jsoup.nodes.Document.OutputSettings outputSettings33 = outputSettings29.escapeMode(escapeMode32);
        org.jsoup.nodes.Document.OutputSettings outputSettings35 = outputSettings29.indentAmount((int) (short) 100);
        org.jsoup.nodes.Entities.EscapeMode escapeMode36 = outputSettings29.escapeMode();
        org.jsoup.nodes.Document.OutputSettings outputSettings38 = outputSettings29.indentAmount((int) (short) 1);
        org.jsoup.nodes.Document.OutputSettings outputSettings39 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Document.OutputSettings outputSettings40 = new org.jsoup.nodes.Document.OutputSettings();
        int int41 = outputSettings40.indentAmount();
        org.jsoup.nodes.Entities.EscapeMode escapeMode42 = outputSettings40.escapeMode();
        org.jsoup.nodes.Document.OutputSettings outputSettings43 = outputSettings39.escapeMode(escapeMode42);
        org.jsoup.nodes.Entities.EscapeMode escapeMode44 = outputSettings43.escapeMode();
        org.jsoup.nodes.Document.OutputSettings outputSettings45 = outputSettings38.escapeMode(escapeMode44);
        org.jsoup.nodes.Document.OutputSettings outputSettings46 = outputSettings25.escapeMode(escapeMode44);
        org.jsoup.nodes.Entities.EscapeMode escapeMode47 = outputSettings25.escapeMode();
        org.jsoup.nodes.Document.OutputSettings outputSettings48 = outputSettings21.escapeMode(escapeMode47);
        org.jsoup.nodes.Document.OutputSettings outputSettings49 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Entities.EscapeMode escapeMode50 = outputSettings49.escapeMode();
        org.jsoup.nodes.Document.OutputSettings outputSettings52 = outputSettings49.prettyPrint(false);
        org.jsoup.nodes.Document.OutputSettings outputSettings53 = new org.jsoup.nodes.Document.OutputSettings();
        boolean boolean54 = outputSettings53.prettyPrint();
        org.jsoup.nodes.Document.OutputSettings outputSettings56 = outputSettings53.prettyPrint(false);
        org.jsoup.nodes.Document.OutputSettings outputSettings57 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Entities.EscapeMode escapeMode58 = outputSettings57.escapeMode();
        org.jsoup.nodes.Document.OutputSettings outputSettings59 = outputSettings53.escapeMode(escapeMode58);
        org.jsoup.nodes.Document.OutputSettings outputSettings60 = outputSettings53.clone();
        org.jsoup.nodes.Document.OutputSettings outputSettings61 = new org.jsoup.nodes.Document.OutputSettings();
        boolean boolean62 = outputSettings61.prettyPrint();
        org.jsoup.nodes.Document.OutputSettings outputSettings64 = outputSettings61.prettyPrint(false);
        org.jsoup.nodes.Document.OutputSettings outputSettings66 = outputSettings61.indentAmount((int) '#');
        org.jsoup.nodes.Entities.EscapeMode escapeMode67 = outputSettings61.escapeMode();
        org.jsoup.nodes.Document.OutputSettings outputSettings68 = outputSettings53.escapeMode(escapeMode67);
        org.jsoup.nodes.Document.OutputSettings outputSettings69 = outputSettings49.escapeMode(escapeMode67);
        int int70 = outputSettings49.indentAmount();
        boolean boolean71 = outputSettings49.prettyPrint();
        boolean boolean72 = outputSettings49.prettyPrint();
        java.nio.charset.Charset charset73 = outputSettings49.charset();
        org.jsoup.nodes.Document.OutputSettings outputSettings74 = outputSettings21.charset(charset73);
        org.junit.Assert.assertNotNull(outputSettings1);
        org.junit.Assert.assertNotNull(outputSettings3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + escapeMode8 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode8.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertNotNull(charset9);
        org.junit.Assert.assertNotNull(outputSettings10);
        org.junit.Assert.assertNotNull(outputSettings11);
        org.junit.Assert.assertNotNull(outputSettings13);
        org.junit.Assert.assertNotNull(outputSettings15);
        org.junit.Assert.assertNotNull(charset16);
        org.junit.Assert.assertNotNull(outputSettings18);
        org.junit.Assert.assertNotNull(outputSettings19);
        org.junit.Assert.assertNotNull(outputSettings21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertNotNull(outputSettings25);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNotNull(outputSettings28);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 1 + "'", int31 == 1);
        org.junit.Assert.assertTrue("'" + escapeMode32 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode32.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertNotNull(outputSettings33);
        org.junit.Assert.assertNotNull(outputSettings35);
        org.junit.Assert.assertTrue("'" + escapeMode36 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode36.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertNotNull(outputSettings38);
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 1 + "'", int41 == 1);
        org.junit.Assert.assertTrue("'" + escapeMode42 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode42.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertNotNull(outputSettings43);
        org.junit.Assert.assertTrue("'" + escapeMode44 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode44.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertNotNull(outputSettings45);
        org.junit.Assert.assertNotNull(outputSettings46);
        org.junit.Assert.assertTrue("'" + escapeMode47 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode47.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertNotNull(outputSettings48);
        org.junit.Assert.assertTrue("'" + escapeMode50 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode50.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertNotNull(outputSettings52);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + true + "'", boolean54 == true);
        org.junit.Assert.assertNotNull(outputSettings56);
        org.junit.Assert.assertTrue("'" + escapeMode58 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode58.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertNotNull(outputSettings59);
        org.junit.Assert.assertNotNull(outputSettings60);
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + true + "'", boolean62 == true);
        org.junit.Assert.assertNotNull(outputSettings64);
        org.junit.Assert.assertNotNull(outputSettings66);
        org.junit.Assert.assertTrue("'" + escapeMode67 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode67.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertNotNull(outputSettings68);
        org.junit.Assert.assertNotNull(outputSettings69);
        org.junit.Assert.assertTrue("'" + int70 + "' != '" + 1 + "'", int70 == 1);
        org.junit.Assert.assertTrue("'" + boolean71 + "' != '" + false + "'", boolean71 == false);
        org.junit.Assert.assertTrue("'" + boolean72 + "' != '" + false + "'", boolean72 == false);
        org.junit.Assert.assertNotNull(charset73);
        org.junit.Assert.assertNotNull(outputSettings74);
    }

    @Test
    public void test20512() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20512");
        org.jsoup.nodes.Document.OutputSettings outputSettings0 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Document.OutputSettings outputSettings1 = outputSettings0.clone();
        org.jsoup.nodes.Document.OutputSettings outputSettings3 = outputSettings1.prettyPrint(false);
        org.jsoup.nodes.Document.OutputSettings outputSettings4 = new org.jsoup.nodes.Document.OutputSettings();
        boolean boolean5 = outputSettings4.prettyPrint();
        org.jsoup.nodes.Document.OutputSettings outputSettings6 = new org.jsoup.nodes.Document.OutputSettings();
        int int7 = outputSettings6.indentAmount();
        org.jsoup.nodes.Entities.EscapeMode escapeMode8 = outputSettings6.escapeMode();
        java.nio.charset.Charset charset9 = outputSettings6.charset();
        org.jsoup.nodes.Document.OutputSettings outputSettings10 = outputSettings4.charset(charset9);
        org.jsoup.nodes.Document.OutputSettings outputSettings11 = outputSettings1.charset(charset9);
        org.jsoup.nodes.Document.OutputSettings outputSettings13 = outputSettings11.prettyPrint(true);
        org.jsoup.nodes.Document.OutputSettings outputSettings15 = outputSettings13.prettyPrint(true);
        boolean boolean16 = outputSettings15.prettyPrint();
        boolean boolean17 = outputSettings15.prettyPrint();
        java.nio.charset.Charset charset18 = outputSettings15.charset();
        org.jsoup.nodes.Document.OutputSettings outputSettings19 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Document.OutputSettings outputSettings20 = new org.jsoup.nodes.Document.OutputSettings();
        int int21 = outputSettings20.indentAmount();
        org.jsoup.nodes.Entities.EscapeMode escapeMode22 = outputSettings20.escapeMode();
        org.jsoup.nodes.Document.OutputSettings outputSettings23 = outputSettings19.escapeMode(escapeMode22);
        org.jsoup.nodes.Document.OutputSettings outputSettings25 = outputSettings19.indentAmount((int) (short) 100);
        java.nio.charset.Charset charset26 = outputSettings25.charset();
        org.jsoup.nodes.Entities.EscapeMode escapeMode27 = outputSettings25.escapeMode();
        org.jsoup.nodes.Document.OutputSettings outputSettings28 = outputSettings15.escapeMode(escapeMode27);
        boolean boolean29 = outputSettings15.prettyPrint();
        org.jsoup.nodes.Document.OutputSettings outputSettings30 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Document.OutputSettings outputSettings31 = outputSettings30.clone();
        boolean boolean32 = outputSettings31.prettyPrint();
        org.jsoup.nodes.Document.OutputSettings outputSettings33 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Document.OutputSettings outputSettings34 = new org.jsoup.nodes.Document.OutputSettings();
        int int35 = outputSettings34.indentAmount();
        org.jsoup.nodes.Entities.EscapeMode escapeMode36 = outputSettings34.escapeMode();
        org.jsoup.nodes.Document.OutputSettings outputSettings37 = outputSettings33.escapeMode(escapeMode36);
        org.jsoup.nodes.Document.OutputSettings outputSettings38 = outputSettings31.escapeMode(escapeMode36);
        org.jsoup.nodes.Document.OutputSettings outputSettings40 = outputSettings38.indentAmount((int) 'a');
        org.jsoup.nodes.Document.OutputSettings outputSettings41 = outputSettings40.clone();
        org.jsoup.nodes.Document.OutputSettings outputSettings43 = outputSettings41.prettyPrint(true);
        org.jsoup.nodes.Document.OutputSettings outputSettings45 = outputSettings43.indentAmount((int) (byte) 1);
        org.jsoup.nodes.Document.OutputSettings outputSettings46 = new org.jsoup.nodes.Document.OutputSettings();
        int int47 = outputSettings46.indentAmount();
        org.jsoup.nodes.Entities.EscapeMode escapeMode48 = outputSettings46.escapeMode();
        java.nio.charset.Charset charset49 = outputSettings46.charset();
        org.jsoup.nodes.Document.OutputSettings outputSettings50 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Entities.EscapeMode escapeMode51 = outputSettings50.escapeMode();
        java.nio.charset.Charset charset52 = outputSettings50.charset();
        org.jsoup.nodes.Document.OutputSettings outputSettings53 = outputSettings46.charset(charset52);
        org.jsoup.nodes.Entities.EscapeMode escapeMode54 = outputSettings53.escapeMode();
        org.jsoup.nodes.Entities.EscapeMode escapeMode55 = outputSettings53.escapeMode();
        org.jsoup.nodes.Document.OutputSettings outputSettings56 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Document.OutputSettings outputSettings57 = outputSettings56.clone();
        org.jsoup.nodes.Document.OutputSettings outputSettings58 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Document.OutputSettings outputSettings59 = new org.jsoup.nodes.Document.OutputSettings();
        int int60 = outputSettings59.indentAmount();
        org.jsoup.nodes.Entities.EscapeMode escapeMode61 = outputSettings59.escapeMode();
        org.jsoup.nodes.Document.OutputSettings outputSettings62 = outputSettings58.escapeMode(escapeMode61);
        org.jsoup.nodes.Document.OutputSettings outputSettings63 = outputSettings56.escapeMode(escapeMode61);
        org.jsoup.nodes.Entities.EscapeMode escapeMode64 = outputSettings56.escapeMode();
        org.jsoup.nodes.Document.OutputSettings outputSettings65 = new org.jsoup.nodes.Document.OutputSettings();
        boolean boolean66 = outputSettings65.prettyPrint();
        org.jsoup.nodes.Document.OutputSettings outputSettings68 = outputSettings65.prettyPrint(false);
        org.jsoup.nodes.Document.OutputSettings outputSettings69 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Entities.EscapeMode escapeMode70 = outputSettings69.escapeMode();
        org.jsoup.nodes.Document.OutputSettings outputSettings71 = outputSettings65.escapeMode(escapeMode70);
        org.jsoup.nodes.Document.OutputSettings outputSettings72 = outputSettings65.clone();
        org.jsoup.nodes.Document.OutputSettings outputSettings73 = new org.jsoup.nodes.Document.OutputSettings();
        boolean boolean74 = outputSettings73.prettyPrint();
        org.jsoup.nodes.Document.OutputSettings outputSettings76 = outputSettings73.prettyPrint(false);
        org.jsoup.nodes.Document.OutputSettings outputSettings78 = outputSettings73.indentAmount((int) '#');
        org.jsoup.nodes.Entities.EscapeMode escapeMode79 = outputSettings73.escapeMode();
        org.jsoup.nodes.Document.OutputSettings outputSettings80 = outputSettings65.escapeMode(escapeMode79);
        org.jsoup.nodes.Entities.EscapeMode escapeMode81 = outputSettings65.escapeMode();
        org.jsoup.nodes.Document.OutputSettings outputSettings82 = outputSettings56.escapeMode(escapeMode81);
        org.jsoup.nodes.Document.OutputSettings outputSettings83 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Entities.EscapeMode escapeMode84 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings85 = outputSettings83.escapeMode(escapeMode84);
        boolean boolean86 = outputSettings83.prettyPrint();
        org.jsoup.nodes.Document.OutputSettings outputSettings87 = new org.jsoup.nodes.Document.OutputSettings();
        int int88 = outputSettings87.indentAmount();
        org.jsoup.nodes.Entities.EscapeMode escapeMode89 = outputSettings87.escapeMode();
        org.jsoup.nodes.Document.OutputSettings outputSettings90 = outputSettings83.escapeMode(escapeMode89);
        boolean boolean91 = outputSettings90.prettyPrint();
        java.nio.charset.Charset charset92 = outputSettings90.charset();
        org.jsoup.nodes.Document.OutputSettings outputSettings93 = outputSettings56.charset(charset92);
        org.jsoup.nodes.Document.OutputSettings outputSettings94 = outputSettings53.charset(charset92);
        org.jsoup.nodes.Document.OutputSettings outputSettings95 = outputSettings45.charset(charset92);
        org.jsoup.nodes.Document.OutputSettings outputSettings96 = outputSettings15.charset(charset92);
        boolean boolean97 = outputSettings15.prettyPrint();
        org.junit.Assert.assertNotNull(outputSettings1);
        org.junit.Assert.assertNotNull(outputSettings3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + escapeMode8 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode8.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertNotNull(charset9);
        org.junit.Assert.assertNotNull(outputSettings10);
        org.junit.Assert.assertNotNull(outputSettings11);
        org.junit.Assert.assertNotNull(outputSettings13);
        org.junit.Assert.assertNotNull(outputSettings15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertNotNull(charset18);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1 + "'", int21 == 1);
        org.junit.Assert.assertTrue("'" + escapeMode22 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode22.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertNotNull(outputSettings23);
        org.junit.Assert.assertNotNull(outputSettings25);
        org.junit.Assert.assertNotNull(charset26);
        org.junit.Assert.assertTrue("'" + escapeMode27 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode27.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertNotNull(outputSettings28);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertNotNull(outputSettings31);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + true + "'", boolean32 == true);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 1 + "'", int35 == 1);
        org.junit.Assert.assertTrue("'" + escapeMode36 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode36.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertNotNull(outputSettings37);
        org.junit.Assert.assertNotNull(outputSettings38);
        org.junit.Assert.assertNotNull(outputSettings40);
        org.junit.Assert.assertNotNull(outputSettings41);
        org.junit.Assert.assertNotNull(outputSettings43);
        org.junit.Assert.assertNotNull(outputSettings45);
        org.junit.Assert.assertTrue("'" + int47 + "' != '" + 1 + "'", int47 == 1);
        org.junit.Assert.assertTrue("'" + escapeMode48 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode48.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertNotNull(charset49);
        org.junit.Assert.assertTrue("'" + escapeMode51 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode51.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertNotNull(charset52);
        org.junit.Assert.assertNotNull(outputSettings53);
        org.junit.Assert.assertTrue("'" + escapeMode54 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode54.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertTrue("'" + escapeMode55 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode55.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertNotNull(outputSettings57);
        org.junit.Assert.assertTrue("'" + int60 + "' != '" + 1 + "'", int60 == 1);
        org.junit.Assert.assertTrue("'" + escapeMode61 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode61.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertNotNull(outputSettings62);
        org.junit.Assert.assertNotNull(outputSettings63);
        org.junit.Assert.assertTrue("'" + escapeMode64 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode64.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertTrue("'" + boolean66 + "' != '" + true + "'", boolean66 == true);
        org.junit.Assert.assertNotNull(outputSettings68);
        org.junit.Assert.assertTrue("'" + escapeMode70 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode70.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertNotNull(outputSettings71);
        org.junit.Assert.assertNotNull(outputSettings72);
        org.junit.Assert.assertTrue("'" + boolean74 + "' != '" + true + "'", boolean74 == true);
        org.junit.Assert.assertNotNull(outputSettings76);
        org.junit.Assert.assertNotNull(outputSettings78);
        org.junit.Assert.assertTrue("'" + escapeMode79 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode79.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertNotNull(outputSettings80);
        org.junit.Assert.assertTrue("'" + escapeMode81 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode81.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertNotNull(outputSettings82);
        org.junit.Assert.assertNotNull(outputSettings85);
        org.junit.Assert.assertTrue("'" + boolean86 + "' != '" + true + "'", boolean86 == true);
        org.junit.Assert.assertTrue("'" + int88 + "' != '" + 1 + "'", int88 == 1);
        org.junit.Assert.assertTrue("'" + escapeMode89 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode89.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertNotNull(outputSettings90);
        org.junit.Assert.assertTrue("'" + boolean91 + "' != '" + true + "'", boolean91 == true);
        org.junit.Assert.assertNotNull(charset92);
        org.junit.Assert.assertNotNull(outputSettings93);
        org.junit.Assert.assertNotNull(outputSettings94);
        org.junit.Assert.assertNotNull(outputSettings95);
        org.junit.Assert.assertNotNull(outputSettings96);
        org.junit.Assert.assertTrue("'" + boolean97 + "' != '" + true + "'", boolean97 == true);
    }

    @Test
    public void test20513() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20513");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("", "");
        boolean boolean3 = textNode2.isBlank();
        boolean boolean4 = textNode2.isBlank();
        java.util.List<org.jsoup.nodes.Node> nodeList5 = textNode2.childNodes();
        java.lang.String str6 = textNode2.baseUri();
        int int7 = textNode2.childNodeSize();
        java.lang.String str8 = textNode2.nodeName();
        int int9 = textNode2.childNodeSize();
        org.jsoup.nodes.Attributes attributes10 = textNode2.attributes();
        org.jsoup.nodes.Node node11 = textNode2.previousSibling();
        org.jsoup.nodes.Node node13 = textNode2.removeAttr("i!");
        org.jsoup.nodes.Node node14 = node13.clone();
        org.jsoup.nodes.TextNode textNode17 = org.jsoup.nodes.TextNode.createFromEncoded("", "");
        boolean boolean18 = textNode17.isBlank();
        org.jsoup.nodes.Node node19 = textNode17.previousSibling();
        org.jsoup.nodes.Node node22 = textNode17.attr("hi!", "");
        java.lang.String str23 = textNode17.baseUri();
        java.lang.String str24 = textNode17.outerHtml();
        java.util.List<org.jsoup.nodes.Node> nodeList25 = textNode17.childNodesCopy();
        java.lang.String str26 = textNode17.baseUri();
        org.jsoup.nodes.Node node27 = textNode17.nextSibling();
        org.jsoup.nodes.Node node28 = textNode17.previousSibling();
        org.jsoup.nodes.TextNode textNode30 = textNode17.text("#text");
        java.lang.String str31 = textNode30.outerHtml();
        org.jsoup.nodes.Node node32 = textNode30.clone();
        java.util.List<org.jsoup.nodes.Node> nodeList33 = node32.childNodes();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node34 = node14.after(node32);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(textNode2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(nodeList5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "#text" + "'", str8, "#text");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNotNull(attributes10);
        org.junit.Assert.assertNull(node11);
        org.junit.Assert.assertNotNull(node13);
        org.junit.Assert.assertNotNull(node14);
        org.junit.Assert.assertNotNull(textNode17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertNull(node19);
        org.junit.Assert.assertNotNull(node22);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "" + "'", str24, "");
        org.junit.Assert.assertNotNull(nodeList25);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "" + "'", str26, "");
        org.junit.Assert.assertNull(node27);
        org.junit.Assert.assertNull(node28);
        org.junit.Assert.assertNotNull(textNode30);
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "#text" + "'", str31, "#text");
        org.junit.Assert.assertNotNull(node32);
        org.junit.Assert.assertNotNull(nodeList33);
    }

    @Test
    public void test20514() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20514");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("", "");
        boolean boolean3 = textNode2.isBlank();
        org.jsoup.nodes.Node node4 = textNode2.previousSibling();
        org.jsoup.nodes.Node node7 = textNode2.attr("hi!", "");
        java.lang.String str8 = textNode2.baseUri();
        boolean boolean9 = textNode2.isBlank();
        org.jsoup.nodes.TextNode textNode11 = textNode2.text("#text");
        org.jsoup.nodes.Attributes attributes12 = textNode11.attributes();
        org.jsoup.nodes.Node node15 = textNode11.attr("#text", "#");
        org.jsoup.nodes.Document.OutputSettings outputSettings16 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Document.OutputSettings outputSettings17 = new org.jsoup.nodes.Document.OutputSettings();
        int int18 = outputSettings17.indentAmount();
        org.jsoup.nodes.Entities.EscapeMode escapeMode19 = outputSettings17.escapeMode();
        org.jsoup.nodes.Document.OutputSettings outputSettings20 = outputSettings16.escapeMode(escapeMode19);
        org.jsoup.nodes.Document.OutputSettings outputSettings22 = outputSettings16.indentAmount((int) (short) 100);
        org.jsoup.nodes.Document.OutputSettings outputSettings23 = new org.jsoup.nodes.Document.OutputSettings();
        boolean boolean24 = outputSettings23.prettyPrint();
        org.jsoup.nodes.Document.OutputSettings outputSettings26 = outputSettings23.prettyPrint(false);
        org.jsoup.nodes.Document.OutputSettings outputSettings27 = new org.jsoup.nodes.Document.OutputSettings();
        boolean boolean28 = outputSettings27.prettyPrint();
        org.jsoup.nodes.Document.OutputSettings outputSettings29 = new org.jsoup.nodes.Document.OutputSettings();
        int int30 = outputSettings29.indentAmount();
        org.jsoup.nodes.Entities.EscapeMode escapeMode31 = outputSettings29.escapeMode();
        java.nio.charset.Charset charset32 = outputSettings29.charset();
        org.jsoup.nodes.Document.OutputSettings outputSettings33 = outputSettings27.charset(charset32);
        org.jsoup.nodes.Document.OutputSettings outputSettings34 = outputSettings26.charset(charset32);
        org.jsoup.nodes.Document.OutputSettings outputSettings35 = outputSettings22.charset(charset32);
        org.jsoup.nodes.Document.OutputSettings outputSettings36 = outputSettings22.clone();
        boolean boolean37 = textNode11.equals((java.lang.Object) outputSettings36);
        java.util.List<org.jsoup.nodes.Node> nodeList38 = textNode11.childNodesCopy();
        org.junit.Assert.assertNotNull(textNode2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNull(node4);
        org.junit.Assert.assertNotNull(node7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(textNode11);
        org.junit.Assert.assertNotNull(attributes12);
        org.junit.Assert.assertNotNull(node15);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + escapeMode19 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode19.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertNotNull(outputSettings20);
        org.junit.Assert.assertNotNull(outputSettings22);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertNotNull(outputSettings26);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 1 + "'", int30 == 1);
        org.junit.Assert.assertTrue("'" + escapeMode31 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode31.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertNotNull(charset32);
        org.junit.Assert.assertNotNull(outputSettings33);
        org.junit.Assert.assertNotNull(outputSettings34);
        org.junit.Assert.assertNotNull(outputSettings35);
        org.junit.Assert.assertNotNull(outputSettings36);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertNotNull(nodeList38);
    }

    @Test
    public void test20515() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20515");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("", "");
        boolean boolean3 = textNode2.isBlank();
        boolean boolean4 = textNode2.isBlank();
        java.util.List<org.jsoup.nodes.Node> nodeList5 = textNode2.childNodes();
        java.lang.String str6 = textNode2.baseUri();
        int int7 = textNode2.childNodeSize();
        boolean boolean9 = textNode2.hasAttr("");
        java.lang.String str10 = textNode2.toString();
        java.util.List<org.jsoup.nodes.Node> nodeList11 = textNode2.childNodesCopy();
        org.jsoup.nodes.TextNode textNode13 = textNode2.text("");
        org.jsoup.nodes.Node node14 = textNode2.nextSibling();
        java.lang.String str15 = textNode2.outerHtml();
        org.jsoup.nodes.Document document16 = textNode2.ownerDocument();
        java.lang.String str17 = textNode2.nodeName();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node18 = textNode2.unwrap();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(textNode2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(nodeList5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNotNull(nodeList11);
        org.junit.Assert.assertNotNull(textNode13);
        org.junit.Assert.assertNull(node14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertNull(document16);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "#text" + "'", str17, "#text");
    }

    @Test
    public void test20516() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20516");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("", "");
        boolean boolean3 = textNode2.isBlank();
        boolean boolean4 = textNode2.isBlank();
        java.util.List<org.jsoup.nodes.Node> nodeList5 = textNode2.childNodes();
        java.lang.String str6 = textNode2.baseUri();
        int int7 = textNode2.childNodeSize();
        boolean boolean9 = textNode2.hasAttr("");
        java.lang.String str10 = textNode2.toString();
        java.util.List<org.jsoup.nodes.Node> nodeList11 = textNode2.childNodesCopy();
        java.lang.String str12 = textNode2.toString();
        org.jsoup.nodes.Node node13 = textNode2.nextSibling();
        org.jsoup.nodes.Document document14 = textNode2.ownerDocument();
        java.util.List<org.jsoup.nodes.Node> nodeList15 = textNode2.siblingNodes();
        org.jsoup.nodes.Document.OutputSettings outputSettings16 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Document.OutputSettings outputSettings17 = new org.jsoup.nodes.Document.OutputSettings();
        int int18 = outputSettings17.indentAmount();
        org.jsoup.nodes.Entities.EscapeMode escapeMode19 = outputSettings17.escapeMode();
        org.jsoup.nodes.Document.OutputSettings outputSettings20 = outputSettings16.escapeMode(escapeMode19);
        org.jsoup.nodes.Document.OutputSettings outputSettings22 = outputSettings16.indentAmount((int) (short) 100);
        org.jsoup.nodes.Document.OutputSettings outputSettings24 = outputSettings22.prettyPrint(false);
        org.jsoup.nodes.Document.OutputSettings outputSettings25 = outputSettings24.clone();
        org.jsoup.nodes.Entities.EscapeMode escapeMode26 = outputSettings25.escapeMode();
        int int27 = outputSettings25.indentAmount();
        org.jsoup.nodes.Document.OutputSettings outputSettings29 = outputSettings25.indentAmount((int) ' ');
        org.jsoup.nodes.Document.OutputSettings outputSettings30 = outputSettings25.clone();
        boolean boolean31 = textNode2.equals((java.lang.Object) outputSettings25);
        org.jsoup.nodes.Document.OutputSettings outputSettings33 = outputSettings25.indentAmount((int) (byte) 10);
        int int34 = outputSettings25.indentAmount();
        org.junit.Assert.assertNotNull(textNode2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(nodeList5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNotNull(nodeList11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertNull(node13);
        org.junit.Assert.assertNull(document14);
        org.junit.Assert.assertNotNull(nodeList15);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + escapeMode19 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode19.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertNotNull(outputSettings20);
        org.junit.Assert.assertNotNull(outputSettings22);
        org.junit.Assert.assertNotNull(outputSettings24);
        org.junit.Assert.assertNotNull(outputSettings25);
        org.junit.Assert.assertTrue("'" + escapeMode26 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode26.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 100 + "'", int27 == 100);
        org.junit.Assert.assertNotNull(outputSettings29);
        org.junit.Assert.assertNotNull(outputSettings30);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertNotNull(outputSettings33);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 10 + "'", int34 == 10);
    }

    @Test
    public void test20517() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20517");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("", "");
        boolean boolean3 = textNode2.isBlank();
        org.jsoup.nodes.Node node4 = textNode2.previousSibling();
        org.jsoup.nodes.Node node7 = textNode2.attr("hi!", "");
        java.lang.String str8 = textNode2.baseUri();
        java.lang.String str9 = textNode2.outerHtml();
        java.util.List<org.jsoup.nodes.Node> nodeList10 = textNode2.childNodesCopy();
        org.jsoup.nodes.Node node11 = textNode2.clone();
        org.jsoup.nodes.Node node12 = textNode2.clone();
        org.jsoup.nodes.TextNode textNode14 = textNode2.text("");
        java.lang.String str15 = textNode14.getWholeText();
        java.lang.String str17 = textNode14.absUrl("hi!");
        textNode14.setBaseUri("");
        org.jsoup.nodes.TextNode textNode21 = textNode14.text("");
        org.jsoup.nodes.TextNode textNode23 = textNode21.text("");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node25 = textNode23.childNode(0);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(textNode2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNull(node4);
        org.junit.Assert.assertNotNull(node7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNotNull(nodeList10);
        org.junit.Assert.assertNotNull(node11);
        org.junit.Assert.assertNotNull(node12);
        org.junit.Assert.assertNotNull(textNode14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertNotNull(textNode21);
        org.junit.Assert.assertNotNull(textNode23);
    }

    @Test
    public void test20518() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20518");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("", "");
        boolean boolean3 = textNode2.isBlank();
        boolean boolean4 = textNode2.isBlank();
        java.util.List<org.jsoup.nodes.Node> nodeList5 = textNode2.childNodes();
        java.lang.String str6 = textNode2.baseUri();
        int int7 = textNode2.childNodeSize();
        boolean boolean9 = textNode2.hasAttr("");
        java.util.List<org.jsoup.nodes.Node> nodeList10 = textNode2.siblingNodes();
        boolean boolean12 = textNode2.hasAttr("#text");
        org.jsoup.nodes.TextNode textNode14 = textNode2.text("#");
        java.lang.String str16 = textNode2.absUrl("!");
        org.junit.Assert.assertNotNull(textNode2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(nodeList5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(nodeList10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(textNode14);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
    }

    @Test
    public void test20519() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20519");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("#text", "hi!");
        org.jsoup.nodes.Attributes attributes3 = textNode2.attributes();
        org.jsoup.nodes.Attributes attributes4 = textNode2.attributes();
        org.jsoup.nodes.TextNode textNode7 = org.jsoup.nodes.TextNode.createFromEncoded("#text", "");
        int int8 = textNode7.siblingIndex();
        java.lang.String str9 = textNode7.text();
        org.jsoup.nodes.Node node11 = textNode7.removeAttr("#");
        boolean boolean12 = textNode2.equals((java.lang.Object) "#");
        int int13 = textNode2.childNodeSize();
        org.junit.Assert.assertNotNull(textNode2);
        org.junit.Assert.assertNotNull(attributes3);
        org.junit.Assert.assertNotNull(attributes4);
        org.junit.Assert.assertNotNull(textNode7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "#text" + "'", str9, "#text");
        org.junit.Assert.assertNotNull(node11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
    }

    @Test
    public void test20520() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20520");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("hi!", "#text");
        java.lang.String str4 = textNode2.attr("hi!");
        boolean boolean5 = textNode2.isBlank();
        java.lang.String str7 = textNode2.attr("");
        java.lang.String str8 = textNode2.outerHtml();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
    }

    @Test
    public void test20521() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20521");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("", "");
        boolean boolean3 = textNode2.isBlank();
        org.jsoup.nodes.Node node4 = textNode2.previousSibling();
        org.jsoup.nodes.Node node7 = textNode2.attr("hi!", "");
        java.lang.String str8 = textNode2.baseUri();
        java.lang.String str9 = textNode2.outerHtml();
        java.util.List<org.jsoup.nodes.Node> nodeList10 = textNode2.childNodesCopy();
        java.lang.String str11 = textNode2.baseUri();
        org.jsoup.nodes.Node node12 = textNode2.nextSibling();
        org.jsoup.nodes.Node node13 = textNode2.previousSibling();
        org.jsoup.nodes.TextNode textNode15 = textNode2.text("#text");
        java.lang.String str16 = textNode15.getWholeText();
        org.jsoup.nodes.TextNode textNode18 = textNode15.text("i!");
        java.lang.String str19 = textNode18.toString();
        boolean boolean20 = textNode18.isBlank();
        org.jsoup.nodes.TextNode textNode22 = textNode18.text("#text");
        org.junit.Assert.assertNotNull(textNode2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNull(node4);
        org.junit.Assert.assertNotNull(node7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNotNull(nodeList10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNull(node12);
        org.junit.Assert.assertNull(node13);
        org.junit.Assert.assertNotNull(textNode15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "#text" + "'", str16, "#text");
        org.junit.Assert.assertNotNull(textNode18);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "i!" + "'", str19, "i!");
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(textNode22);
    }

    @Test
    public void test20522() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20522");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("", "");
        boolean boolean3 = textNode2.isBlank();
        org.jsoup.nodes.Node node4 = textNode2.previousSibling();
        java.lang.String str5 = textNode2.nodeName();
        boolean boolean6 = textNode2.isBlank();
        org.jsoup.nodes.Node node7 = textNode2.clone();
        java.lang.String str8 = textNode2.getWholeText();
        boolean boolean10 = textNode2.hasAttr("");
        org.jsoup.nodes.TextNode textNode12 = textNode2.text("i!");
        java.lang.String str13 = textNode2.text();
        java.lang.String str14 = textNode2.nodeName();
        java.lang.String str15 = textNode2.outerHtml();
        textNode2.setBaseUri("hi!");
        java.lang.String str18 = textNode2.baseUri();
        java.lang.String str19 = textNode2.getWholeText();
        java.lang.String str20 = textNode2.baseUri();
        org.jsoup.nodes.TextNode textNode23 = org.jsoup.nodes.TextNode.createFromEncoded("hi!", "hi!");
        java.lang.String str24 = textNode23.nodeName();
        java.util.List<org.jsoup.nodes.Node> nodeList25 = textNode23.siblingNodes();
        org.jsoup.nodes.Node node27 = textNode23.removeAttr("#text");
        // The following exception was thrown during execution in test generation
        try {
            textNode2.replaceWith(node27);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(textNode2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNull(node4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "#text" + "'", str5, "#text");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(node7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(textNode12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "i!" + "'", str13, "i!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "#text" + "'", str14, "#text");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "i!" + "'", str15, "i!");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!" + "'", str18, "hi!");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "i!" + "'", str19, "i!");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "hi!" + "'", str20, "hi!");
        org.junit.Assert.assertNotNull(textNode23);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "#text" + "'", str24, "#text");
        org.junit.Assert.assertNotNull(nodeList25);
        org.junit.Assert.assertNotNull(node27);
    }

    @Test
    public void test20523() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20523");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("", "");
        boolean boolean3 = textNode2.isBlank();
        org.jsoup.nodes.Node node4 = textNode2.previousSibling();
        java.lang.String str5 = textNode2.nodeName();
        boolean boolean6 = textNode2.isBlank();
        org.jsoup.nodes.Node node7 = textNode2.parent();
        org.jsoup.nodes.Node node8 = textNode2.previousSibling();
        java.lang.String str9 = textNode2.toString();
        java.lang.String str10 = textNode2.nodeName();
        java.lang.String str11 = textNode2.getWholeText();
        org.jsoup.nodes.Attributes attributes12 = textNode2.attributes();
        java.lang.String str13 = textNode2.toString();
        org.junit.Assert.assertNotNull(textNode2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNull(node4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "#text" + "'", str5, "#text");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNull(node7);
        org.junit.Assert.assertNull(node8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "#text" + "'", str10, "#text");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNotNull(attributes12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
    }

    @Test
    public void test20524() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20524");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("", "");
        boolean boolean3 = textNode2.isBlank();
        boolean boolean4 = textNode2.isBlank();
        java.util.List<org.jsoup.nodes.Node> nodeList5 = textNode2.childNodes();
        java.lang.String str6 = textNode2.baseUri();
        int int7 = textNode2.childNodeSize();
        boolean boolean9 = textNode2.hasAttr("");
        java.lang.String str11 = textNode2.absUrl("i!");
        boolean boolean13 = textNode2.hasAttr("");
        int int14 = textNode2.siblingIndex();
        boolean boolean15 = textNode2.isBlank();
        java.lang.String str17 = textNode2.absUrl("i!");
        org.jsoup.nodes.TextNode textNode19 = textNode2.text("h");
        org.junit.Assert.assertNotNull(textNode2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(nodeList5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertNotNull(textNode19);
    }

    @Test
    public void test20525() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20525");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("", "");
        boolean boolean3 = textNode2.isBlank();
        org.jsoup.nodes.Node node4 = textNode2.previousSibling();
        org.jsoup.nodes.Node node7 = textNode2.attr("hi!", "");
        java.lang.String str8 = textNode2.baseUri();
        java.lang.String str10 = textNode2.attr("");
        java.lang.String str11 = textNode2.nodeName();
        java.lang.String str12 = textNode2.outerHtml();
        java.util.List<org.jsoup.nodes.Node> nodeList13 = textNode2.siblingNodes();
        java.lang.String str14 = textNode2.nodeName();
        java.util.List<org.jsoup.nodes.Node> nodeList15 = textNode2.childNodesCopy();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node17 = textNode2.childNode(0);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(textNode2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNull(node4);
        org.junit.Assert.assertNotNull(node7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "#text" + "'", str11, "#text");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertNotNull(nodeList13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "#text" + "'", str14, "#text");
        org.junit.Assert.assertNotNull(nodeList15);
    }

    @Test
    public void test20526() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20526");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("", "");
        boolean boolean3 = textNode2.isBlank();
        org.jsoup.nodes.Node node4 = textNode2.previousSibling();
        org.jsoup.nodes.Node node7 = textNode2.attr("hi!", "");
        java.lang.String str8 = textNode2.baseUri();
        java.lang.String str9 = textNode2.outerHtml();
        org.jsoup.nodes.TextNode textNode11 = textNode2.text("#text");
        int int12 = textNode11.childNodeSize();
        boolean boolean14 = textNode11.hasAttr("#text");
        java.lang.String str15 = textNode11.getWholeText();
        boolean boolean17 = textNode11.hasAttr("");
        org.jsoup.nodes.Node node18 = textNode11.nextSibling();
        boolean boolean19 = textNode11.isBlank();
        int int20 = textNode11.childNodeSize();
        textNode11.setBaseUri("#");
        org.jsoup.nodes.Node node23 = textNode11.parent();
        org.junit.Assert.assertNotNull(textNode2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNull(node4);
        org.junit.Assert.assertNotNull(node7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNotNull(textNode11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "#text" + "'", str15, "#text");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNull(node18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertNull(node23);
    }

    @Test
    public void test20527() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20527");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("", "");
        boolean boolean3 = textNode2.isBlank();
        org.jsoup.nodes.Node node4 = textNode2.previousSibling();
        java.lang.String str5 = textNode2.nodeName();
        boolean boolean6 = textNode2.isBlank();
        java.util.List<org.jsoup.nodes.Node> nodeList7 = textNode2.childNodesCopy();
        textNode2.setBaseUri("#text");
        org.jsoup.nodes.Node node10 = textNode2.parent();
        java.lang.String str12 = textNode2.absUrl("#");
        java.lang.String str13 = textNode2.toString();
        org.jsoup.nodes.Attributes attributes14 = textNode2.attributes();
        org.junit.Assert.assertNotNull(textNode2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNull(node4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "#text" + "'", str5, "#text");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(nodeList7);
        org.junit.Assert.assertNull(node10);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNotNull(attributes14);
    }

    @Test
    public void test20528() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20528");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("", "");
        boolean boolean3 = textNode2.isBlank();
        org.jsoup.nodes.Node node4 = textNode2.previousSibling();
        org.jsoup.nodes.Node node7 = textNode2.attr("hi!", "");
        java.lang.String str8 = textNode2.baseUri();
        java.lang.String str9 = textNode2.outerHtml();
        java.util.List<org.jsoup.nodes.Node> nodeList10 = textNode2.childNodesCopy();
        java.lang.String str11 = textNode2.baseUri();
        org.jsoup.nodes.Node node12 = textNode2.nextSibling();
        org.jsoup.nodes.Node node13 = textNode2.previousSibling();
        org.jsoup.nodes.TextNode textNode15 = textNode2.text("#text");
        java.lang.String str16 = textNode15.outerHtml();
        org.jsoup.nodes.Node node17 = textNode15.nextSibling();
        java.lang.String str18 = textNode15.getWholeText();
        org.jsoup.nodes.TextNode textNode21 = org.jsoup.nodes.TextNode.createFromEncoded("", "");
        boolean boolean22 = textNode21.isBlank();
        org.jsoup.nodes.Node node23 = textNode21.previousSibling();
        java.lang.String str24 = textNode21.nodeName();
        org.jsoup.nodes.Node node25 = textNode21.nextSibling();
        boolean boolean26 = textNode21.isBlank();
        java.lang.String str27 = textNode21.baseUri();
        textNode21.setBaseUri("");
        java.lang.String str30 = textNode21.outerHtml();
        java.lang.String str31 = textNode21.outerHtml();
        // The following exception was thrown during execution in test generation
        try {
            textNode15.replaceWith((org.jsoup.nodes.Node) textNode21);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(textNode2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNull(node4);
        org.junit.Assert.assertNotNull(node7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNotNull(nodeList10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNull(node12);
        org.junit.Assert.assertNull(node13);
        org.junit.Assert.assertNotNull(textNode15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "#text" + "'", str16, "#text");
        org.junit.Assert.assertNull(node17);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "#text" + "'", str18, "#text");
        org.junit.Assert.assertNotNull(textNode21);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertNull(node23);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "#text" + "'", str24, "#text");
        org.junit.Assert.assertNull(node25);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "" + "'", str27, "");
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "" + "'", str30, "");
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "" + "'", str31, "");
    }

    @Test
    public void test20529() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20529");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("", "hi!");
        java.lang.String str4 = textNode2.absUrl("hi!");
        org.jsoup.nodes.Node node5 = textNode2.parent();
        org.jsoup.nodes.TextNode textNode7 = textNode2.text("");
        org.jsoup.nodes.Node node9 = textNode2.removeAttr("hi!");
        org.jsoup.nodes.Node node10 = textNode2.nextSibling();
        java.util.List<org.jsoup.nodes.Node> nodeList11 = textNode2.childNodesCopy();
        boolean boolean12 = textNode2.isBlank();
        org.jsoup.nodes.Node node13 = textNode2.nextSibling();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertNotNull(textNode7);
        org.junit.Assert.assertNotNull(node9);
        org.junit.Assert.assertNull(node10);
        org.junit.Assert.assertNotNull(nodeList11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNull(node13);
    }

    @Test
    public void test20530() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20530");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("hi!", "hi!");
        java.lang.String str4 = textNode2.absUrl("hi!");
        org.jsoup.nodes.Document document5 = textNode2.ownerDocument();
        java.lang.String str6 = textNode2.getWholeText();
        org.jsoup.nodes.Node node7 = textNode2.clone();
        org.jsoup.nodes.Node node8 = textNode2.parent();
        org.jsoup.nodes.Node node9 = textNode2.parent();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNull(document5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertNotNull(node7);
        org.junit.Assert.assertNull(node8);
        org.junit.Assert.assertNull(node9);
    }

    @Test
    public void test20531() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20531");
        org.jsoup.nodes.Document.OutputSettings outputSettings0 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Entities.EscapeMode escapeMode1 = outputSettings0.escapeMode();
        java.nio.charset.Charset charset2 = outputSettings0.charset();
        java.nio.charset.Charset charset3 = outputSettings0.charset();
        org.jsoup.nodes.TextNode textNode6 = org.jsoup.nodes.TextNode.createFromEncoded("", "");
        boolean boolean7 = textNode6.isBlank();
        org.jsoup.nodes.Node node8 = textNode6.previousSibling();
        org.jsoup.nodes.Node node11 = textNode6.attr("hi!", "");
        java.lang.String str12 = textNode6.baseUri();
        java.lang.String str13 = textNode6.outerHtml();
        java.util.List<org.jsoup.nodes.Node> nodeList14 = textNode6.childNodesCopy();
        org.jsoup.nodes.Node node15 = textNode6.clone();
        org.jsoup.nodes.Node node16 = textNode6.clone();
        org.jsoup.nodes.TextNode textNode18 = textNode6.text("");
        java.lang.String str19 = textNode18.getWholeText();
        java.lang.String str21 = textNode18.absUrl("hi!");
        java.lang.String str22 = textNode18.nodeName();
        org.jsoup.nodes.Document document23 = textNode18.ownerDocument();
        org.jsoup.nodes.Document.OutputSettings outputSettings24 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Document.OutputSettings outputSettings25 = new org.jsoup.nodes.Document.OutputSettings();
        int int26 = outputSettings25.indentAmount();
        org.jsoup.nodes.Entities.EscapeMode escapeMode27 = outputSettings25.escapeMode();
        org.jsoup.nodes.Document.OutputSettings outputSettings28 = outputSettings24.escapeMode(escapeMode27);
        org.jsoup.nodes.Document.OutputSettings outputSettings30 = outputSettings24.indentAmount((int) (short) 100);
        org.jsoup.nodes.Entities.EscapeMode escapeMode31 = outputSettings24.escapeMode();
        org.jsoup.nodes.Document.OutputSettings outputSettings33 = outputSettings24.prettyPrint(true);
        org.jsoup.nodes.Document.OutputSettings outputSettings35 = outputSettings24.prettyPrint(false);
        boolean boolean36 = textNode18.equals((java.lang.Object) outputSettings35);
        org.jsoup.nodes.Entities.EscapeMode escapeMode37 = outputSettings35.escapeMode();
        org.jsoup.nodes.Document.OutputSettings outputSettings38 = outputSettings0.escapeMode(escapeMode37);
        org.jsoup.nodes.Document.OutputSettings outputSettings39 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Entities.EscapeMode escapeMode40 = outputSettings39.escapeMode();
        org.jsoup.nodes.Document.OutputSettings outputSettings41 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Document.OutputSettings outputSettings42 = new org.jsoup.nodes.Document.OutputSettings();
        int int43 = outputSettings42.indentAmount();
        org.jsoup.nodes.Entities.EscapeMode escapeMode44 = outputSettings42.escapeMode();
        org.jsoup.nodes.Document.OutputSettings outputSettings45 = outputSettings41.escapeMode(escapeMode44);
        org.jsoup.nodes.Document.OutputSettings outputSettings47 = outputSettings41.indentAmount((int) (short) 100);
        org.jsoup.nodes.Entities.EscapeMode escapeMode48 = outputSettings41.escapeMode();
        org.jsoup.nodes.Document.OutputSettings outputSettings49 = outputSettings39.escapeMode(escapeMode48);
        org.jsoup.nodes.Document.OutputSettings outputSettings50 = outputSettings39.clone();
        int int51 = outputSettings39.indentAmount();
        org.jsoup.nodes.Entities.EscapeMode escapeMode52 = outputSettings39.escapeMode();
        org.jsoup.nodes.Document.OutputSettings outputSettings53 = outputSettings0.escapeMode(escapeMode52);
        org.junit.Assert.assertTrue("'" + escapeMode1 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode1.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertNotNull(charset2);
        org.junit.Assert.assertNotNull(charset3);
        org.junit.Assert.assertNotNull(textNode6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNull(node8);
        org.junit.Assert.assertNotNull(node11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNotNull(nodeList14);
        org.junit.Assert.assertNotNull(node15);
        org.junit.Assert.assertNotNull(node16);
        org.junit.Assert.assertNotNull(textNode18);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "#text" + "'", str22, "#text");
        org.junit.Assert.assertNull(document23);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 1 + "'", int26 == 1);
        org.junit.Assert.assertTrue("'" + escapeMode27 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode27.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertNotNull(outputSettings28);
        org.junit.Assert.assertNotNull(outputSettings30);
        org.junit.Assert.assertTrue("'" + escapeMode31 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode31.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertNotNull(outputSettings33);
        org.junit.Assert.assertNotNull(outputSettings35);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertTrue("'" + escapeMode37 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode37.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertNotNull(outputSettings38);
        org.junit.Assert.assertTrue("'" + escapeMode40 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode40.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + 1 + "'", int43 == 1);
        org.junit.Assert.assertTrue("'" + escapeMode44 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode44.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertNotNull(outputSettings45);
        org.junit.Assert.assertNotNull(outputSettings47);
        org.junit.Assert.assertTrue("'" + escapeMode48 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode48.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertNotNull(outputSettings49);
        org.junit.Assert.assertNotNull(outputSettings50);
        org.junit.Assert.assertTrue("'" + int51 + "' != '" + 1 + "'", int51 == 1);
        org.junit.Assert.assertTrue("'" + escapeMode52 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode52.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertNotNull(outputSettings53);
    }

    @Test
    public void test20532() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20532");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("", "");
        boolean boolean3 = textNode2.isBlank();
        org.jsoup.nodes.Node node4 = textNode2.previousSibling();
        org.jsoup.nodes.Node node7 = textNode2.attr("hi!", "");
        java.lang.String str8 = textNode2.baseUri();
        java.lang.String str9 = textNode2.outerHtml();
        java.util.List<org.jsoup.nodes.Node> nodeList10 = textNode2.childNodesCopy();
        org.jsoup.nodes.Node node11 = textNode2.clone();
        org.jsoup.nodes.Node node12 = textNode2.clone();
        org.jsoup.nodes.TextNode textNode14 = textNode2.text("");
        java.lang.String str15 = textNode14.getWholeText();
        java.lang.String str17 = textNode14.absUrl("hi!");
        int int18 = textNode14.childNodeSize();
        java.lang.String str20 = textNode14.absUrl("i!");
        java.lang.String str21 = textNode14.baseUri();
        boolean boolean22 = textNode14.isBlank();
        org.jsoup.nodes.Node node24 = textNode14.removeAttr("h");
        java.lang.String str26 = textNode14.attr("text");
        boolean boolean27 = textNode14.isBlank();
        org.junit.Assert.assertNotNull(textNode2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNull(node4);
        org.junit.Assert.assertNotNull(node7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNotNull(nodeList10);
        org.junit.Assert.assertNotNull(node11);
        org.junit.Assert.assertNotNull(node12);
        org.junit.Assert.assertNotNull(textNode14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertNotNull(node24);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "" + "'", str26, "");
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
    }

    @Test
    public void test20533() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20533");
        org.jsoup.nodes.Document.OutputSettings outputSettings0 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Document.OutputSettings outputSettings1 = outputSettings0.clone();
        org.jsoup.nodes.Document.OutputSettings outputSettings3 = outputSettings0.prettyPrint(true);
        org.jsoup.nodes.Document.OutputSettings outputSettings5 = outputSettings0.indentAmount(0);
        org.jsoup.nodes.Document.OutputSettings outputSettings7 = outputSettings0.prettyPrint(true);
        org.jsoup.nodes.Document.OutputSettings outputSettings9 = outputSettings7.indentAmount((int) '4');
        org.jsoup.nodes.Document.OutputSettings outputSettings11 = outputSettings9.prettyPrint(false);
        java.lang.Class<?> wildcardClass12 = outputSettings11.getClass();
        org.junit.Assert.assertNotNull(outputSettings1);
        org.junit.Assert.assertNotNull(outputSettings3);
        org.junit.Assert.assertNotNull(outputSettings5);
        org.junit.Assert.assertNotNull(outputSettings7);
        org.junit.Assert.assertNotNull(outputSettings9);
        org.junit.Assert.assertNotNull(outputSettings11);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test20534() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20534");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("", "");
        boolean boolean3 = textNode2.isBlank();
        boolean boolean4 = textNode2.isBlank();
        java.util.List<org.jsoup.nodes.Node> nodeList5 = textNode2.childNodes();
        java.lang.String str6 = textNode2.baseUri();
        int int7 = textNode2.childNodeSize();
        boolean boolean9 = textNode2.hasAttr("");
        java.lang.String str10 = textNode2.toString();
        java.util.List<org.jsoup.nodes.Node> nodeList11 = textNode2.childNodesCopy();
        org.jsoup.nodes.TextNode textNode13 = textNode2.text("");
        org.jsoup.nodes.Node node14 = textNode2.nextSibling();
        boolean boolean15 = textNode2.isBlank();
        java.lang.String str16 = textNode2.baseUri();
        java.lang.String str17 = textNode2.outerHtml();
        java.lang.String str19 = textNode2.attr("text");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node20 = textNode2.unwrap();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(textNode2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(nodeList5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNotNull(nodeList11);
        org.junit.Assert.assertNotNull(textNode13);
        org.junit.Assert.assertNull(node14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
    }

    @Test
    public void test20535() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20535");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("", "");
        boolean boolean3 = textNode2.isBlank();
        org.jsoup.nodes.Node node4 = textNode2.previousSibling();
        org.jsoup.nodes.Node node7 = textNode2.attr("hi!", "");
        java.lang.String str8 = textNode2.baseUri();
        java.lang.String str9 = textNode2.outerHtml();
        org.jsoup.nodes.TextNode textNode11 = textNode2.text("#text");
        org.jsoup.nodes.TextNode textNode14 = org.jsoup.nodes.TextNode.createFromEncoded("", "");
        boolean boolean15 = textNode14.isBlank();
        java.lang.String str17 = textNode14.attr("");
        boolean boolean18 = textNode2.equals((java.lang.Object) textNode14);
        boolean boolean20 = textNode2.equals((java.lang.Object) 100L);
        java.lang.String str21 = textNode2.toString();
        org.jsoup.nodes.Document.OutputSettings outputSettings22 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Document.OutputSettings outputSettings23 = outputSettings22.clone();
        org.jsoup.nodes.Document.OutputSettings outputSettings25 = outputSettings22.prettyPrint(true);
        org.jsoup.nodes.Document.OutputSettings outputSettings26 = outputSettings25.clone();
        boolean boolean27 = textNode2.equals((java.lang.Object) outputSettings25);
        java.lang.String str29 = textNode2.attr("");
        org.jsoup.nodes.Node node30 = textNode2.parent();
        int int31 = textNode2.childNodeSize();
        org.junit.Assert.assertNotNull(textNode2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNull(node4);
        org.junit.Assert.assertNotNull(node7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNotNull(textNode11);
        org.junit.Assert.assertNotNull(textNode14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "#text" + "'", str21, "#text");
        org.junit.Assert.assertNotNull(outputSettings23);
        org.junit.Assert.assertNotNull(outputSettings25);
        org.junit.Assert.assertNotNull(outputSettings26);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "" + "'", str29, "");
        org.junit.Assert.assertNull(node30);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 0 + "'", int31 == 0);
    }

    @Test
    public void test20536() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20536");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("hi!", "hi!");
        int int3 = textNode2.childNodeSize();
        int int4 = textNode2.childNodeSize();
        boolean boolean6 = textNode2.hasAttr("");
        org.jsoup.nodes.Node node7 = textNode2.clone();
        org.jsoup.nodes.Node node9 = textNode2.removeAttr("#text");
        java.lang.String str10 = textNode2.outerHtml();
        org.jsoup.nodes.TextNode textNode12 = textNode2.text("#");
        java.lang.String str13 = textNode2.baseUri();
        int int14 = textNode2.childNodeSize();
        org.jsoup.nodes.TextNode textNode17 = org.jsoup.nodes.TextNode.createFromEncoded("#text", "");
        org.jsoup.nodes.Node node18 = textNode17.nextSibling();
        java.lang.String str19 = textNode17.toString();
        org.jsoup.nodes.Node node20 = textNode17.clone();
        org.jsoup.nodes.TextNode textNode22 = textNode17.text("hi!");
        java.lang.String str23 = textNode22.text();
        java.lang.String str25 = textNode22.absUrl("#");
        org.jsoup.nodes.Node node26 = textNode22.clone();
        // The following exception was thrown during execution in test generation
        try {
            textNode2.replaceWith(node26);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(node7);
        org.junit.Assert.assertNotNull(node9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertNotNull(textNode12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertNotNull(textNode17);
        org.junit.Assert.assertNull(node18);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "#text" + "'", str19, "#text");
        org.junit.Assert.assertNotNull(node20);
        org.junit.Assert.assertNotNull(textNode22);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "hi!" + "'", str23, "hi!");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "" + "'", str25, "");
        org.junit.Assert.assertNotNull(node26);
    }

    @Test
    public void test20537() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20537");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("", "");
        boolean boolean3 = textNode2.isBlank();
        org.jsoup.nodes.Node node4 = textNode2.previousSibling();
        org.jsoup.nodes.Node node7 = textNode2.attr("hi!", "");
        java.lang.String str8 = textNode2.baseUri();
        java.lang.String str9 = textNode2.outerHtml();
        java.util.List<org.jsoup.nodes.Node> nodeList10 = textNode2.childNodesCopy();
        java.lang.String str12 = textNode2.attr("hi!");
        org.jsoup.nodes.Node node14 = textNode2.removeAttr("i!");
        boolean boolean15 = textNode2.isBlank();
        java.lang.String str17 = textNode2.attr("");
        org.jsoup.nodes.Node node18 = textNode2.clone();
        boolean boolean20 = textNode2.hasAttr("#text");
        java.lang.String str21 = textNode2.outerHtml();
        org.junit.Assert.assertNotNull(textNode2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNull(node4);
        org.junit.Assert.assertNotNull(node7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNotNull(nodeList10);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertNotNull(node14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertNotNull(node18);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
    }

    @Test
    public void test20538() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20538");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("", "");
        boolean boolean3 = textNode2.isBlank();
        org.jsoup.nodes.Node node6 = textNode2.attr("#text", "");
        java.lang.String str8 = textNode2.attr("");
        org.jsoup.nodes.Node node9 = textNode2.clone();
        org.jsoup.nodes.TextNode textNode11 = textNode2.text("i!");
        // The following exception was thrown during execution in test generation
        try {
            textNode2.remove();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(textNode2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(node6);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNotNull(node9);
        org.junit.Assert.assertNotNull(textNode11);
    }

    @Test
    public void test20539() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20539");
        org.jsoup.nodes.Document.OutputSettings outputSettings0 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Document.OutputSettings outputSettings1 = outputSettings0.clone();
        org.jsoup.nodes.Document.OutputSettings outputSettings3 = outputSettings1.prettyPrint(false);
        java.nio.charset.Charset charset4 = outputSettings3.charset();
        int int5 = outputSettings3.indentAmount();
        int int6 = outputSettings3.indentAmount();
        boolean boolean7 = outputSettings3.prettyPrint();
        org.jsoup.nodes.Document.OutputSettings outputSettings9 = outputSettings3.indentAmount((int) (byte) 1);
        org.junit.Assert.assertNotNull(outputSettings1);
        org.junit.Assert.assertNotNull(outputSettings3);
        org.junit.Assert.assertNotNull(charset4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(outputSettings9);
    }

    @Test
    public void test20540() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20540");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("", "");
        boolean boolean3 = textNode2.isBlank();
        org.jsoup.nodes.Node node4 = textNode2.previousSibling();
        java.lang.String str5 = textNode2.nodeName();
        org.jsoup.nodes.Node node6 = textNode2.nextSibling();
        boolean boolean7 = textNode2.isBlank();
        java.lang.String str8 = textNode2.text();
        java.lang.String str9 = textNode2.nodeName();
        java.lang.String str11 = textNode2.attr("");
        org.jsoup.nodes.Node node12 = textNode2.previousSibling();
        java.util.List<org.jsoup.nodes.Node> nodeList13 = textNode2.childNodesCopy();
        java.lang.String str14 = textNode2.text();
        java.lang.String str15 = textNode2.nodeName();
        org.junit.Assert.assertNotNull(textNode2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNull(node4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "#text" + "'", str5, "#text");
        org.junit.Assert.assertNull(node6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "#text" + "'", str9, "#text");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNull(node12);
        org.junit.Assert.assertNotNull(nodeList13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "#text" + "'", str15, "#text");
    }

    @Test
    public void test20541() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20541");
        org.jsoup.nodes.Document.OutputSettings outputSettings0 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Document.OutputSettings outputSettings1 = new org.jsoup.nodes.Document.OutputSettings();
        int int2 = outputSettings1.indentAmount();
        org.jsoup.nodes.Entities.EscapeMode escapeMode3 = outputSettings1.escapeMode();
        org.jsoup.nodes.Document.OutputSettings outputSettings4 = outputSettings0.escapeMode(escapeMode3);
        org.jsoup.nodes.Document.OutputSettings outputSettings6 = outputSettings0.indentAmount((int) (short) 100);
        org.jsoup.nodes.Entities.EscapeMode escapeMode7 = outputSettings0.escapeMode();
        org.jsoup.nodes.Document.OutputSettings outputSettings9 = outputSettings0.prettyPrint(true);
        int int10 = outputSettings0.indentAmount();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
        org.junit.Assert.assertTrue("'" + escapeMode3 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode3.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertNotNull(outputSettings4);
        org.junit.Assert.assertNotNull(outputSettings6);
        org.junit.Assert.assertTrue("'" + escapeMode7 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode7.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertNotNull(outputSettings9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 100 + "'", int10 == 100);
    }

    @Test
    public void test20542() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20542");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("", "");
        boolean boolean3 = textNode2.isBlank();
        org.jsoup.nodes.Node node4 = textNode2.previousSibling();
        org.jsoup.nodes.Node node7 = textNode2.attr("hi!", "");
        java.lang.String str8 = textNode2.baseUri();
        java.lang.String str9 = textNode2.outerHtml();
        org.jsoup.nodes.TextNode textNode11 = textNode2.text("#text");
        org.jsoup.nodes.TextNode textNode14 = org.jsoup.nodes.TextNode.createFromEncoded("", "");
        boolean boolean15 = textNode14.isBlank();
        java.lang.String str17 = textNode14.attr("");
        boolean boolean18 = textNode2.equals((java.lang.Object) textNode14);
        java.util.List<org.jsoup.nodes.Node> nodeList19 = textNode14.childNodes();
        java.lang.String str20 = textNode14.outerHtml();
        java.lang.String str21 = textNode14.nodeName();
        org.jsoup.nodes.Document document22 = textNode14.ownerDocument();
        org.jsoup.select.NodeVisitor nodeVisitor23 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node24 = document22.traverse(nodeVisitor23);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(textNode2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNull(node4);
        org.junit.Assert.assertNotNull(node7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNotNull(textNode11);
        org.junit.Assert.assertNotNull(textNode14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(nodeList19);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "#text" + "'", str21, "#text");
        org.junit.Assert.assertNull(document22);
    }

    @Test
    public void test20543() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20543");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("", "");
        boolean boolean3 = textNode2.isBlank();
        java.lang.String str4 = textNode2.outerHtml();
        java.lang.String str5 = textNode2.text();
        boolean boolean7 = textNode2.hasAttr("hi!");
        org.jsoup.nodes.Attributes attributes8 = textNode2.attributes();
        boolean boolean10 = textNode2.hasAttr("hi!");
        int int11 = textNode2.siblingIndex();
        org.jsoup.nodes.TextNode textNode14 = org.jsoup.nodes.TextNode.createFromEncoded("", "");
        boolean boolean15 = textNode14.isBlank();
        org.jsoup.nodes.Node node16 = textNode14.previousSibling();
        org.jsoup.nodes.Node node19 = textNode14.attr("hi!", "");
        java.lang.String str20 = textNode14.baseUri();
        java.lang.String str21 = textNode14.outerHtml();
        org.jsoup.nodes.TextNode textNode23 = textNode14.text("#text");
        org.jsoup.nodes.TextNode textNode26 = org.jsoup.nodes.TextNode.createFromEncoded("", "");
        boolean boolean27 = textNode26.isBlank();
        java.lang.String str29 = textNode26.attr("");
        boolean boolean30 = textNode14.equals((java.lang.Object) textNode26);
        java.lang.String str31 = textNode26.toString();
        boolean boolean32 = textNode2.equals((java.lang.Object) textNode26);
        java.util.List<org.jsoup.nodes.Node> nodeList33 = textNode26.siblingNodes();
        org.junit.Assert.assertNotNull(textNode2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(attributes8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNotNull(textNode14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNull(node16);
        org.junit.Assert.assertNotNull(node19);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertNotNull(textNode23);
        org.junit.Assert.assertNotNull(textNode26);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "" + "'", str29, "");
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "" + "'", str31, "");
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertNotNull(nodeList33);
    }

    @Test
    public void test20544() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20544");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("hi!", "hi!");
        java.lang.String str4 = textNode2.absUrl("hi!");
        org.jsoup.nodes.Document document5 = textNode2.ownerDocument();
        java.util.List<org.jsoup.nodes.Node> nodeList6 = textNode2.childNodes();
        org.jsoup.nodes.Node node7 = textNode2.clone();
        org.jsoup.nodes.TextNode textNode9 = textNode2.text("#text");
        int int10 = textNode9.childNodeSize();
        textNode9.setBaseUri("#");
        java.lang.String str14 = textNode9.attr("text");
        java.lang.String str15 = textNode9.text();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNull(document5);
        org.junit.Assert.assertNotNull(nodeList6);
        org.junit.Assert.assertNotNull(node7);
        org.junit.Assert.assertNotNull(textNode9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "#text" + "'", str14, "#text");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "#text" + "'", str15, "#text");
    }

    @Test
    public void test20545() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20545");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("", "");
        boolean boolean3 = textNode2.isBlank();
        org.jsoup.nodes.Node node4 = textNode2.previousSibling();
        java.lang.String str5 = textNode2.nodeName();
        org.jsoup.nodes.Node node6 = textNode2.nextSibling();
        boolean boolean7 = textNode2.isBlank();
        java.lang.String str8 = textNode2.baseUri();
        java.util.List<org.jsoup.nodes.Node> nodeList9 = textNode2.childNodes();
        java.lang.String str11 = textNode2.attr("hi!");
        org.jsoup.nodes.Node node12 = textNode2.clone();
        java.lang.String str14 = textNode2.attr("#text");
        org.jsoup.nodes.Node node17 = textNode2.attr("#text", "#text");
        int int18 = textNode2.siblingIndex();
        org.jsoup.nodes.Node node19 = textNode2.nextSibling();
        java.lang.String str21 = textNode2.attr("i!");
        org.jsoup.nodes.Attributes attributes22 = textNode2.attributes();
        org.jsoup.nodes.Node node23 = textNode2.clone();
        int int24 = textNode2.childNodeSize();
        org.junit.Assert.assertNotNull(textNode2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNull(node4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "#text" + "'", str5, "#text");
        org.junit.Assert.assertNull(node6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNotNull(nodeList9);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNotNull(node12);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertNotNull(node17);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertNull(node19);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertNotNull(attributes22);
        org.junit.Assert.assertNotNull(node23);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
    }

    @Test
    public void test20546() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20546");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("", "");
        boolean boolean3 = textNode2.isBlank();
        org.jsoup.nodes.Node node4 = textNode2.previousSibling();
        java.lang.String str5 = textNode2.nodeName();
        org.jsoup.nodes.Node node6 = textNode2.nextSibling();
        boolean boolean7 = textNode2.isBlank();
        org.jsoup.nodes.Node node8 = textNode2.clone();
        java.util.List<org.jsoup.nodes.Node> nodeList9 = textNode2.siblingNodes();
        java.lang.String str10 = textNode2.nodeName();
        java.lang.String str11 = textNode2.nodeName();
        org.jsoup.nodes.TextNode textNode14 = org.jsoup.nodes.TextNode.createFromEncoded("", "");
        boolean boolean15 = textNode14.isBlank();
        org.jsoup.nodes.Node node16 = textNode14.previousSibling();
        org.jsoup.nodes.Node node17 = textNode14.parent();
        java.lang.String str19 = textNode14.absUrl("#text");
        org.jsoup.nodes.Node node20 = textNode14.clone();
        java.lang.String str22 = textNode14.attr("");
        boolean boolean23 = textNode2.equals((java.lang.Object) str22);
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.TextNode textNode25 = textNode2.splitText((int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Split offset must not be greater than current text length");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(textNode2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNull(node4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "#text" + "'", str5, "#text");
        org.junit.Assert.assertNull(node6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(node8);
        org.junit.Assert.assertNotNull(nodeList9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "#text" + "'", str10, "#text");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "#text" + "'", str11, "#text");
        org.junit.Assert.assertNotNull(textNode14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNull(node16);
        org.junit.Assert.assertNull(node17);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertNotNull(node20);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
    }

    @Test
    public void test20547() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20547");
        org.jsoup.nodes.Document.OutputSettings outputSettings0 = new org.jsoup.nodes.Document.OutputSettings();
        boolean boolean1 = outputSettings0.prettyPrint();
        org.jsoup.nodes.Document.OutputSettings outputSettings3 = outputSettings0.prettyPrint(false);
        org.jsoup.nodes.Document.OutputSettings outputSettings5 = outputSettings0.indentAmount((int) '#');
        org.jsoup.nodes.Entities.EscapeMode escapeMode6 = outputSettings0.escapeMode();
        org.jsoup.nodes.Document.OutputSettings outputSettings8 = outputSettings0.indentAmount((int) ' ');
        int int9 = outputSettings0.indentAmount();
        java.nio.charset.Charset charset10 = outputSettings0.charset();
        int int11 = outputSettings0.indentAmount();
        int int12 = outputSettings0.indentAmount();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertNotNull(outputSettings3);
        org.junit.Assert.assertNotNull(outputSettings5);
        org.junit.Assert.assertTrue("'" + escapeMode6 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode6.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertNotNull(outputSettings8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 32 + "'", int9 == 32);
        org.junit.Assert.assertNotNull(charset10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 32 + "'", int11 == 32);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 32 + "'", int12 == 32);
    }

    @Test
    public void test20548() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20548");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("", "");
        java.util.List<org.jsoup.nodes.Node> nodeList3 = textNode2.childNodesCopy();
        java.lang.String str4 = textNode2.getWholeText();
        boolean boolean5 = textNode2.isBlank();
        java.util.List<org.jsoup.nodes.Node> nodeList6 = textNode2.childNodesCopy();
        org.junit.Assert.assertNotNull(textNode2);
        org.junit.Assert.assertNotNull(nodeList3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(nodeList6);
    }

    @Test
    public void test20549() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20549");
        org.jsoup.nodes.Document.OutputSettings outputSettings0 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Document.OutputSettings outputSettings1 = outputSettings0.clone();
        org.jsoup.nodes.Document.OutputSettings outputSettings3 = outputSettings0.prettyPrint(true);
        org.jsoup.nodes.Document.OutputSettings outputSettings4 = outputSettings3.clone();
        org.jsoup.nodes.Document.OutputSettings outputSettings6 = outputSettings3.prettyPrint(false);
        org.jsoup.nodes.Document.OutputSettings outputSettings7 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Document.OutputSettings outputSettings8 = outputSettings7.clone();
        boolean boolean9 = outputSettings8.prettyPrint();
        org.jsoup.nodes.Document.OutputSettings outputSettings10 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Document.OutputSettings outputSettings11 = new org.jsoup.nodes.Document.OutputSettings();
        int int12 = outputSettings11.indentAmount();
        org.jsoup.nodes.Entities.EscapeMode escapeMode13 = outputSettings11.escapeMode();
        org.jsoup.nodes.Document.OutputSettings outputSettings14 = outputSettings10.escapeMode(escapeMode13);
        org.jsoup.nodes.Document.OutputSettings outputSettings15 = outputSettings8.escapeMode(escapeMode13);
        org.jsoup.nodes.Document.OutputSettings outputSettings16 = outputSettings6.escapeMode(escapeMode13);
        org.jsoup.nodes.Document.OutputSettings outputSettings17 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Document.OutputSettings outputSettings18 = new org.jsoup.nodes.Document.OutputSettings();
        int int19 = outputSettings18.indentAmount();
        org.jsoup.nodes.Entities.EscapeMode escapeMode20 = outputSettings18.escapeMode();
        org.jsoup.nodes.Document.OutputSettings outputSettings21 = outputSettings17.escapeMode(escapeMode20);
        org.jsoup.nodes.Document.OutputSettings outputSettings23 = outputSettings17.indentAmount((int) (short) 100);
        org.jsoup.nodes.Entities.EscapeMode escapeMode24 = outputSettings17.escapeMode();
        org.jsoup.nodes.Document.OutputSettings outputSettings26 = outputSettings17.indentAmount((int) (short) 1);
        org.jsoup.nodes.Document.OutputSettings outputSettings27 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Document.OutputSettings outputSettings28 = new org.jsoup.nodes.Document.OutputSettings();
        int int29 = outputSettings28.indentAmount();
        org.jsoup.nodes.Entities.EscapeMode escapeMode30 = outputSettings28.escapeMode();
        org.jsoup.nodes.Document.OutputSettings outputSettings31 = outputSettings27.escapeMode(escapeMode30);
        org.jsoup.nodes.Entities.EscapeMode escapeMode32 = outputSettings31.escapeMode();
        org.jsoup.nodes.Document.OutputSettings outputSettings33 = outputSettings26.escapeMode(escapeMode32);
        java.nio.charset.Charset charset34 = outputSettings26.charset();
        org.jsoup.nodes.Document.OutputSettings outputSettings35 = outputSettings16.charset(charset34);
        java.nio.charset.Charset charset36 = outputSettings35.charset();
        org.jsoup.nodes.Document.OutputSettings outputSettings37 = new org.jsoup.nodes.Document.OutputSettings();
        int int38 = outputSettings37.indentAmount();
        org.jsoup.nodes.Entities.EscapeMode escapeMode39 = outputSettings37.escapeMode();
        int int40 = outputSettings37.indentAmount();
        java.nio.charset.Charset charset41 = outputSettings37.charset();
        org.jsoup.nodes.Document.OutputSettings outputSettings42 = outputSettings35.charset(charset41);
        org.jsoup.nodes.Document.OutputSettings outputSettings43 = new org.jsoup.nodes.Document.OutputSettings();
        boolean boolean44 = outputSettings43.prettyPrint();
        org.jsoup.nodes.Document.OutputSettings outputSettings45 = new org.jsoup.nodes.Document.OutputSettings();
        int int46 = outputSettings45.indentAmount();
        org.jsoup.nodes.Entities.EscapeMode escapeMode47 = outputSettings45.escapeMode();
        java.nio.charset.Charset charset48 = outputSettings45.charset();
        org.jsoup.nodes.Document.OutputSettings outputSettings49 = outputSettings43.charset(charset48);
        java.nio.charset.Charset charset50 = outputSettings43.charset();
        org.jsoup.nodes.Document.OutputSettings outputSettings51 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Document.OutputSettings outputSettings52 = new org.jsoup.nodes.Document.OutputSettings();
        int int53 = outputSettings52.indentAmount();
        org.jsoup.nodes.Entities.EscapeMode escapeMode54 = outputSettings52.escapeMode();
        org.jsoup.nodes.Document.OutputSettings outputSettings55 = outputSettings51.escapeMode(escapeMode54);
        org.jsoup.nodes.Document.OutputSettings outputSettings57 = outputSettings51.indentAmount((int) (short) 100);
        org.jsoup.nodes.Entities.EscapeMode escapeMode58 = outputSettings51.escapeMode();
        org.jsoup.nodes.Document.OutputSettings outputSettings60 = outputSettings51.prettyPrint(true);
        org.jsoup.nodes.Entities.EscapeMode escapeMode61 = outputSettings51.escapeMode();
        org.jsoup.nodes.Document.OutputSettings outputSettings62 = outputSettings43.escapeMode(escapeMode61);
        org.jsoup.nodes.Document.OutputSettings outputSettings63 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Entities.EscapeMode escapeMode64 = outputSettings63.escapeMode();
        org.jsoup.nodes.Document.OutputSettings outputSettings66 = outputSettings63.prettyPrint(false);
        org.jsoup.nodes.Entities.EscapeMode escapeMode67 = outputSettings63.escapeMode();
        org.jsoup.nodes.Document.OutputSettings outputSettings68 = outputSettings62.escapeMode(escapeMode67);
        org.jsoup.nodes.Document.OutputSettings outputSettings69 = outputSettings35.escapeMode(escapeMode67);
        org.junit.Assert.assertNotNull(outputSettings1);
        org.junit.Assert.assertNotNull(outputSettings3);
        org.junit.Assert.assertNotNull(outputSettings4);
        org.junit.Assert.assertNotNull(outputSettings6);
        org.junit.Assert.assertNotNull(outputSettings8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + escapeMode13 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode13.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertNotNull(outputSettings14);
        org.junit.Assert.assertNotNull(outputSettings15);
        org.junit.Assert.assertNotNull(outputSettings16);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 1 + "'", int19 == 1);
        org.junit.Assert.assertTrue("'" + escapeMode20 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode20.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertNotNull(outputSettings21);
        org.junit.Assert.assertNotNull(outputSettings23);
        org.junit.Assert.assertTrue("'" + escapeMode24 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode24.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertNotNull(outputSettings26);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 1 + "'", int29 == 1);
        org.junit.Assert.assertTrue("'" + escapeMode30 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode30.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertNotNull(outputSettings31);
        org.junit.Assert.assertTrue("'" + escapeMode32 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode32.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertNotNull(outputSettings33);
        org.junit.Assert.assertNotNull(charset34);
        org.junit.Assert.assertNotNull(outputSettings35);
        org.junit.Assert.assertNotNull(charset36);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 1 + "'", int38 == 1);
        org.junit.Assert.assertTrue("'" + escapeMode39 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode39.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 1 + "'", int40 == 1);
        org.junit.Assert.assertNotNull(charset41);
        org.junit.Assert.assertNotNull(outputSettings42);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + true + "'", boolean44 == true);
        org.junit.Assert.assertTrue("'" + int46 + "' != '" + 1 + "'", int46 == 1);
        org.junit.Assert.assertTrue("'" + escapeMode47 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode47.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertNotNull(charset48);
        org.junit.Assert.assertNotNull(outputSettings49);
        org.junit.Assert.assertNotNull(charset50);
        org.junit.Assert.assertTrue("'" + int53 + "' != '" + 1 + "'", int53 == 1);
        org.junit.Assert.assertTrue("'" + escapeMode54 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode54.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertNotNull(outputSettings55);
        org.junit.Assert.assertNotNull(outputSettings57);
        org.junit.Assert.assertTrue("'" + escapeMode58 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode58.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertNotNull(outputSettings60);
        org.junit.Assert.assertTrue("'" + escapeMode61 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode61.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertNotNull(outputSettings62);
        org.junit.Assert.assertTrue("'" + escapeMode64 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode64.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertNotNull(outputSettings66);
        org.junit.Assert.assertTrue("'" + escapeMode67 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode67.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertNotNull(outputSettings68);
        org.junit.Assert.assertNotNull(outputSettings69);
    }

    @Test
    public void test20550() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20550");
        org.jsoup.nodes.Document.OutputSettings outputSettings0 = new org.jsoup.nodes.Document.OutputSettings();
        boolean boolean1 = outputSettings0.prettyPrint();
        org.jsoup.nodes.Document.OutputSettings outputSettings3 = outputSettings0.prettyPrint(false);
        org.jsoup.nodes.Document.OutputSettings outputSettings4 = new org.jsoup.nodes.Document.OutputSettings();
        boolean boolean5 = outputSettings4.prettyPrint();
        org.jsoup.nodes.Document.OutputSettings outputSettings6 = new org.jsoup.nodes.Document.OutputSettings();
        int int7 = outputSettings6.indentAmount();
        org.jsoup.nodes.Entities.EscapeMode escapeMode8 = outputSettings6.escapeMode();
        java.nio.charset.Charset charset9 = outputSettings6.charset();
        org.jsoup.nodes.Document.OutputSettings outputSettings10 = outputSettings4.charset(charset9);
        org.jsoup.nodes.Document.OutputSettings outputSettings11 = outputSettings3.charset(charset9);
        java.nio.charset.Charset charset12 = outputSettings11.charset();
        org.jsoup.nodes.Document.OutputSettings outputSettings13 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Document.OutputSettings outputSettings14 = outputSettings13.clone();
        boolean boolean15 = outputSettings14.prettyPrint();
        org.jsoup.nodes.Document.OutputSettings outputSettings16 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Document.OutputSettings outputSettings17 = new org.jsoup.nodes.Document.OutputSettings();
        int int18 = outputSettings17.indentAmount();
        org.jsoup.nodes.Entities.EscapeMode escapeMode19 = outputSettings17.escapeMode();
        org.jsoup.nodes.Document.OutputSettings outputSettings20 = outputSettings16.escapeMode(escapeMode19);
        org.jsoup.nodes.Document.OutputSettings outputSettings21 = outputSettings14.escapeMode(escapeMode19);
        org.jsoup.nodes.Document.OutputSettings outputSettings22 = outputSettings11.escapeMode(escapeMode19);
        org.jsoup.nodes.Document.OutputSettings outputSettings23 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Document.OutputSettings outputSettings24 = new org.jsoup.nodes.Document.OutputSettings();
        int int25 = outputSettings24.indentAmount();
        org.jsoup.nodes.Entities.EscapeMode escapeMode26 = outputSettings24.escapeMode();
        org.jsoup.nodes.Document.OutputSettings outputSettings27 = outputSettings23.escapeMode(escapeMode26);
        org.jsoup.nodes.Document.OutputSettings outputSettings29 = outputSettings23.indentAmount((int) (short) 100);
        org.jsoup.nodes.Entities.EscapeMode escapeMode30 = outputSettings23.escapeMode();
        org.jsoup.nodes.Document.OutputSettings outputSettings32 = outputSettings23.indentAmount((int) (short) 1);
        org.jsoup.nodes.Document.OutputSettings outputSettings33 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Document.OutputSettings outputSettings34 = new org.jsoup.nodes.Document.OutputSettings();
        int int35 = outputSettings34.indentAmount();
        org.jsoup.nodes.Entities.EscapeMode escapeMode36 = outputSettings34.escapeMode();
        org.jsoup.nodes.Document.OutputSettings outputSettings37 = outputSettings33.escapeMode(escapeMode36);
        org.jsoup.nodes.Entities.EscapeMode escapeMode38 = outputSettings37.escapeMode();
        org.jsoup.nodes.Document.OutputSettings outputSettings39 = outputSettings32.escapeMode(escapeMode38);
        org.jsoup.nodes.Document.OutputSettings outputSettings40 = outputSettings22.escapeMode(escapeMode38);
        boolean boolean41 = outputSettings22.prettyPrint();
        org.jsoup.nodes.Document.OutputSettings outputSettings43 = outputSettings22.indentAmount(0);
        org.jsoup.nodes.Document.OutputSettings outputSettings44 = outputSettings22.clone();
        org.jsoup.nodes.Document.OutputSettings outputSettings45 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Document.OutputSettings outputSettings46 = new org.jsoup.nodes.Document.OutputSettings();
        int int47 = outputSettings46.indentAmount();
        org.jsoup.nodes.Entities.EscapeMode escapeMode48 = outputSettings46.escapeMode();
        org.jsoup.nodes.Document.OutputSettings outputSettings49 = outputSettings45.escapeMode(escapeMode48);
        org.jsoup.nodes.Document.OutputSettings outputSettings51 = outputSettings45.indentAmount((int) (short) 100);
        org.jsoup.nodes.Document.OutputSettings outputSettings52 = new org.jsoup.nodes.Document.OutputSettings();
        boolean boolean53 = outputSettings52.prettyPrint();
        org.jsoup.nodes.Document.OutputSettings outputSettings54 = new org.jsoup.nodes.Document.OutputSettings();
        int int55 = outputSettings54.indentAmount();
        org.jsoup.nodes.Entities.EscapeMode escapeMode56 = outputSettings54.escapeMode();
        java.nio.charset.Charset charset57 = outputSettings54.charset();
        org.jsoup.nodes.Document.OutputSettings outputSettings58 = outputSettings52.charset(charset57);
        java.nio.charset.Charset charset59 = outputSettings52.charset();
        org.jsoup.nodes.Document.OutputSettings outputSettings60 = outputSettings51.charset(charset59);
        org.jsoup.nodes.Document.OutputSettings outputSettings61 = outputSettings22.charset(charset59);
        boolean boolean62 = outputSettings22.prettyPrint();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertNotNull(outputSettings3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + escapeMode8 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode8.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertNotNull(charset9);
        org.junit.Assert.assertNotNull(outputSettings10);
        org.junit.Assert.assertNotNull(outputSettings11);
        org.junit.Assert.assertNotNull(charset12);
        org.junit.Assert.assertNotNull(outputSettings14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + escapeMode19 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode19.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertNotNull(outputSettings20);
        org.junit.Assert.assertNotNull(outputSettings21);
        org.junit.Assert.assertNotNull(outputSettings22);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 1 + "'", int25 == 1);
        org.junit.Assert.assertTrue("'" + escapeMode26 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode26.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertNotNull(outputSettings27);
        org.junit.Assert.assertNotNull(outputSettings29);
        org.junit.Assert.assertTrue("'" + escapeMode30 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode30.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertNotNull(outputSettings32);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 1 + "'", int35 == 1);
        org.junit.Assert.assertTrue("'" + escapeMode36 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode36.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertNotNull(outputSettings37);
        org.junit.Assert.assertTrue("'" + escapeMode38 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode38.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertNotNull(outputSettings39);
        org.junit.Assert.assertNotNull(outputSettings40);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertNotNull(outputSettings43);
        org.junit.Assert.assertNotNull(outputSettings44);
        org.junit.Assert.assertTrue("'" + int47 + "' != '" + 1 + "'", int47 == 1);
        org.junit.Assert.assertTrue("'" + escapeMode48 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode48.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertNotNull(outputSettings49);
        org.junit.Assert.assertNotNull(outputSettings51);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + true + "'", boolean53 == true);
        org.junit.Assert.assertTrue("'" + int55 + "' != '" + 1 + "'", int55 == 1);
        org.junit.Assert.assertTrue("'" + escapeMode56 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode56.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertNotNull(charset57);
        org.junit.Assert.assertNotNull(outputSettings58);
        org.junit.Assert.assertNotNull(charset59);
        org.junit.Assert.assertNotNull(outputSettings60);
        org.junit.Assert.assertNotNull(outputSettings61);
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + false + "'", boolean62 == false);
    }

    @Test
    public void test20551() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20551");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("", "");
        boolean boolean3 = textNode2.isBlank();
        org.jsoup.nodes.Node node4 = textNode2.previousSibling();
        java.lang.String str5 = textNode2.nodeName();
        java.lang.String str6 = textNode2.toString();
        boolean boolean8 = textNode2.hasAttr("");
        java.util.List<org.jsoup.nodes.Node> nodeList9 = textNode2.siblingNodes();
        org.jsoup.nodes.Node node10 = textNode2.nextSibling();
        org.junit.Assert.assertNotNull(textNode2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNull(node4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "#text" + "'", str5, "#text");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(nodeList9);
        org.junit.Assert.assertNull(node10);
    }

    @Test
    public void test20552() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20552");
        org.jsoup.nodes.Document.OutputSettings outputSettings0 = new org.jsoup.nodes.Document.OutputSettings();
        boolean boolean1 = outputSettings0.prettyPrint();
        org.jsoup.nodes.Document.OutputSettings outputSettings3 = outputSettings0.prettyPrint(false);
        org.jsoup.nodes.Document.OutputSettings outputSettings5 = outputSettings3.prettyPrint(false);
        org.jsoup.nodes.Document.OutputSettings outputSettings6 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Entities.EscapeMode escapeMode7 = outputSettings6.escapeMode();
        java.nio.charset.Charset charset8 = outputSettings6.charset();
        org.jsoup.nodes.Document.OutputSettings outputSettings9 = outputSettings3.charset(charset8);
        org.jsoup.nodes.Document.OutputSettings outputSettings11 = outputSettings3.indentAmount(10);
        org.jsoup.nodes.Document.OutputSettings outputSettings12 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Document.OutputSettings outputSettings13 = outputSettings12.clone();
        org.jsoup.nodes.Document.OutputSettings outputSettings15 = outputSettings12.prettyPrint(true);
        org.jsoup.nodes.Document.OutputSettings outputSettings16 = outputSettings15.clone();
        org.jsoup.nodes.Document.OutputSettings outputSettings18 = outputSettings15.prettyPrint(false);
        org.jsoup.nodes.Entities.EscapeMode escapeMode19 = outputSettings15.escapeMode();
        org.jsoup.nodes.Document.OutputSettings outputSettings20 = outputSettings15.clone();
        org.jsoup.nodes.Document.OutputSettings outputSettings21 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Document.OutputSettings outputSettings22 = outputSettings21.clone();
        org.jsoup.nodes.Document.OutputSettings outputSettings24 = outputSettings21.prettyPrint(true);
        int int25 = outputSettings24.indentAmount();
        int int26 = outputSettings24.indentAmount();
        org.jsoup.nodes.Entities.EscapeMode escapeMode27 = outputSettings24.escapeMode();
        org.jsoup.nodes.Document.OutputSettings outputSettings28 = outputSettings20.escapeMode(escapeMode27);
        org.jsoup.nodes.Document.OutputSettings outputSettings29 = outputSettings3.escapeMode(escapeMode27);
        org.jsoup.nodes.Document.OutputSettings outputSettings30 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Entities.EscapeMode escapeMode31 = outputSettings30.escapeMode();
        boolean boolean32 = outputSettings30.prettyPrint();
        org.jsoup.nodes.Document.OutputSettings outputSettings33 = outputSettings30.clone();
        org.jsoup.nodes.Document.OutputSettings outputSettings35 = outputSettings33.indentAmount((int) (short) 1);
        int int36 = outputSettings33.indentAmount();
        org.jsoup.nodes.Document.OutputSettings outputSettings38 = outputSettings33.prettyPrint(true);
        org.jsoup.nodes.Document.OutputSettings outputSettings40 = outputSettings38.prettyPrint(false);
        org.jsoup.nodes.Document.OutputSettings outputSettings42 = outputSettings38.indentAmount(0);
        org.jsoup.nodes.Document.OutputSettings outputSettings43 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Document.OutputSettings outputSettings44 = new org.jsoup.nodes.Document.OutputSettings();
        int int45 = outputSettings44.indentAmount();
        org.jsoup.nodes.Entities.EscapeMode escapeMode46 = outputSettings44.escapeMode();
        org.jsoup.nodes.Document.OutputSettings outputSettings47 = outputSettings43.escapeMode(escapeMode46);
        org.jsoup.nodes.Document.OutputSettings outputSettings49 = outputSettings43.indentAmount((int) (short) 100);
        org.jsoup.nodes.Document.OutputSettings outputSettings50 = new org.jsoup.nodes.Document.OutputSettings();
        boolean boolean51 = outputSettings50.prettyPrint();
        org.jsoup.nodes.Document.OutputSettings outputSettings53 = outputSettings50.prettyPrint(false);
        org.jsoup.nodes.Document.OutputSettings outputSettings54 = new org.jsoup.nodes.Document.OutputSettings();
        boolean boolean55 = outputSettings54.prettyPrint();
        org.jsoup.nodes.Document.OutputSettings outputSettings56 = new org.jsoup.nodes.Document.OutputSettings();
        int int57 = outputSettings56.indentAmount();
        org.jsoup.nodes.Entities.EscapeMode escapeMode58 = outputSettings56.escapeMode();
        java.nio.charset.Charset charset59 = outputSettings56.charset();
        org.jsoup.nodes.Document.OutputSettings outputSettings60 = outputSettings54.charset(charset59);
        org.jsoup.nodes.Document.OutputSettings outputSettings61 = outputSettings53.charset(charset59);
        org.jsoup.nodes.Document.OutputSettings outputSettings62 = outputSettings49.charset(charset59);
        boolean boolean63 = outputSettings62.prettyPrint();
        org.jsoup.nodes.Document.OutputSettings outputSettings64 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Entities.EscapeMode escapeMode65 = outputSettings64.escapeMode();
        org.jsoup.nodes.Document.OutputSettings outputSettings66 = outputSettings64.clone();
        org.jsoup.nodes.Document.OutputSettings outputSettings67 = new org.jsoup.nodes.Document.OutputSettings();
        int int68 = outputSettings67.indentAmount();
        org.jsoup.nodes.Entities.EscapeMode escapeMode69 = outputSettings67.escapeMode();
        java.nio.charset.Charset charset70 = outputSettings67.charset();
        org.jsoup.nodes.Document.OutputSettings outputSettings71 = outputSettings64.charset(charset70);
        org.jsoup.nodes.Document.OutputSettings outputSettings72 = outputSettings62.charset(charset70);
        org.jsoup.nodes.Document.OutputSettings outputSettings73 = outputSettings38.charset(charset70);
        org.jsoup.nodes.Document.OutputSettings outputSettings74 = outputSettings29.charset(charset70);
        int int75 = outputSettings29.indentAmount();
        org.jsoup.nodes.Document.OutputSettings outputSettings77 = outputSettings29.prettyPrint(true);
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Document.OutputSettings outputSettings79 = outputSettings77.indentAmount((-1));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Must be true");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertNotNull(outputSettings3);
        org.junit.Assert.assertNotNull(outputSettings5);
        org.junit.Assert.assertTrue("'" + escapeMode7 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode7.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertNotNull(charset8);
        org.junit.Assert.assertNotNull(outputSettings9);
        org.junit.Assert.assertNotNull(outputSettings11);
        org.junit.Assert.assertNotNull(outputSettings13);
        org.junit.Assert.assertNotNull(outputSettings15);
        org.junit.Assert.assertNotNull(outputSettings16);
        org.junit.Assert.assertNotNull(outputSettings18);
        org.junit.Assert.assertTrue("'" + escapeMode19 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode19.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertNotNull(outputSettings20);
        org.junit.Assert.assertNotNull(outputSettings22);
        org.junit.Assert.assertNotNull(outputSettings24);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 1 + "'", int25 == 1);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 1 + "'", int26 == 1);
        org.junit.Assert.assertTrue("'" + escapeMode27 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode27.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertNotNull(outputSettings28);
        org.junit.Assert.assertNotNull(outputSettings29);
        org.junit.Assert.assertTrue("'" + escapeMode31 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode31.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + true + "'", boolean32 == true);
        org.junit.Assert.assertNotNull(outputSettings33);
        org.junit.Assert.assertNotNull(outputSettings35);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 1 + "'", int36 == 1);
        org.junit.Assert.assertNotNull(outputSettings38);
        org.junit.Assert.assertNotNull(outputSettings40);
        org.junit.Assert.assertNotNull(outputSettings42);
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + 1 + "'", int45 == 1);
        org.junit.Assert.assertTrue("'" + escapeMode46 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode46.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertNotNull(outputSettings47);
        org.junit.Assert.assertNotNull(outputSettings49);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + true + "'", boolean51 == true);
        org.junit.Assert.assertNotNull(outputSettings53);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + true + "'", boolean55 == true);
        org.junit.Assert.assertTrue("'" + int57 + "' != '" + 1 + "'", int57 == 1);
        org.junit.Assert.assertTrue("'" + escapeMode58 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode58.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertNotNull(charset59);
        org.junit.Assert.assertNotNull(outputSettings60);
        org.junit.Assert.assertNotNull(outputSettings61);
        org.junit.Assert.assertNotNull(outputSettings62);
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + true + "'", boolean63 == true);
        org.junit.Assert.assertTrue("'" + escapeMode65 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode65.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertNotNull(outputSettings66);
        org.junit.Assert.assertTrue("'" + int68 + "' != '" + 1 + "'", int68 == 1);
        org.junit.Assert.assertTrue("'" + escapeMode69 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode69.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertNotNull(charset70);
        org.junit.Assert.assertNotNull(outputSettings71);
        org.junit.Assert.assertNotNull(outputSettings72);
        org.junit.Assert.assertNotNull(outputSettings73);
        org.junit.Assert.assertNotNull(outputSettings74);
        org.junit.Assert.assertTrue("'" + int75 + "' != '" + 10 + "'", int75 == 10);
        org.junit.Assert.assertNotNull(outputSettings77);
    }

    @Test
    public void test20553() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20553");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("", "");
        boolean boolean3 = textNode2.isBlank();
        org.jsoup.nodes.Node node4 = textNode2.previousSibling();
        org.jsoup.nodes.Node node7 = textNode2.attr("hi!", "");
        java.lang.String str8 = textNode2.baseUri();
        java.lang.String str9 = textNode2.outerHtml();
        org.jsoup.nodes.TextNode textNode11 = textNode2.text("#text");
        org.jsoup.nodes.TextNode textNode14 = org.jsoup.nodes.TextNode.createFromEncoded("", "");
        boolean boolean15 = textNode14.isBlank();
        java.lang.String str17 = textNode14.attr("");
        boolean boolean18 = textNode2.equals((java.lang.Object) textNode14);
        boolean boolean20 = textNode2.equals((java.lang.Object) 100L);
        org.jsoup.nodes.Node node22 = textNode2.removeAttr("#text");
        java.util.List<org.jsoup.nodes.Node> nodeList23 = textNode2.siblingNodes();
        org.jsoup.nodes.TextNode textNode26 = org.jsoup.nodes.TextNode.createFromEncoded("hi!", "hi!");
        org.jsoup.nodes.Node node27 = textNode26.parent();
        java.lang.String str28 = textNode26.outerHtml();
        java.util.List<org.jsoup.nodes.Node> nodeList29 = textNode26.childNodesCopy();
        java.util.List<org.jsoup.nodes.Node> nodeList30 = textNode26.siblingNodes();
        textNode26.setBaseUri("hi!");
        int int33 = textNode26.siblingIndex();
        java.util.List<org.jsoup.nodes.Node> nodeList34 = textNode26.siblingNodes();
        boolean boolean36 = textNode26.hasAttr("hi!");
        java.lang.String str37 = textNode26.nodeName();
        java.util.List<org.jsoup.nodes.Node> nodeList38 = textNode26.siblingNodes();
        org.jsoup.nodes.TextNode textNode40 = textNode26.text("h");
        boolean boolean41 = textNode2.equals((java.lang.Object) textNode26);
        java.util.List<org.jsoup.nodes.Node> nodeList42 = textNode2.childNodesCopy();
        org.junit.Assert.assertNotNull(textNode2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNull(node4);
        org.junit.Assert.assertNotNull(node7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNotNull(textNode11);
        org.junit.Assert.assertNotNull(textNode14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(node22);
        org.junit.Assert.assertNotNull(nodeList23);
        org.junit.Assert.assertNotNull(textNode26);
        org.junit.Assert.assertNull(node27);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "hi!" + "'", str28, "hi!");
        org.junit.Assert.assertNotNull(nodeList29);
        org.junit.Assert.assertNotNull(nodeList30);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
        org.junit.Assert.assertNotNull(nodeList34);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "#text" + "'", str37, "#text");
        org.junit.Assert.assertNotNull(nodeList38);
        org.junit.Assert.assertNotNull(textNode40);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertNotNull(nodeList42);
    }

    @Test
    public void test20554() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20554");
        org.jsoup.nodes.Document.OutputSettings outputSettings0 = new org.jsoup.nodes.Document.OutputSettings();
        boolean boolean1 = outputSettings0.prettyPrint();
        org.jsoup.nodes.Document.OutputSettings outputSettings2 = new org.jsoup.nodes.Document.OutputSettings();
        int int3 = outputSettings2.indentAmount();
        org.jsoup.nodes.Entities.EscapeMode escapeMode4 = outputSettings2.escapeMode();
        java.nio.charset.Charset charset5 = outputSettings2.charset();
        org.jsoup.nodes.Document.OutputSettings outputSettings6 = outputSettings0.charset(charset5);
        org.jsoup.nodes.Document.OutputSettings outputSettings7 = outputSettings0.clone();
        boolean boolean8 = outputSettings0.prettyPrint();
        boolean boolean9 = outputSettings0.prettyPrint();
        org.jsoup.nodes.Document.OutputSettings outputSettings11 = outputSettings0.prettyPrint(true);
        boolean boolean12 = outputSettings11.prettyPrint();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Document.OutputSettings outputSettings14 = outputSettings11.charset("#");
            org.junit.Assert.fail("Expected exception of type java.nio.charset.IllegalCharsetNameException; message: #");
        } catch (java.nio.charset.IllegalCharsetNameException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + escapeMode4 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode4.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertNotNull(charset5);
        org.junit.Assert.assertNotNull(outputSettings6);
        org.junit.Assert.assertNotNull(outputSettings7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(outputSettings11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
    }

    @Test
    public void test20555() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20555");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("", "");
        boolean boolean3 = textNode2.isBlank();
        java.lang.String str5 = textNode2.attr("");
        java.lang.String str7 = textNode2.attr("hi!");
        java.lang.String str8 = textNode2.baseUri();
        java.util.List<org.jsoup.nodes.Node> nodeList9 = textNode2.childNodesCopy();
        org.jsoup.nodes.Document.OutputSettings outputSettings10 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Document.OutputSettings outputSettings11 = outputSettings10.clone();
        boolean boolean12 = outputSettings11.prettyPrint();
        org.jsoup.nodes.Document.OutputSettings outputSettings13 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Document.OutputSettings outputSettings14 = new org.jsoup.nodes.Document.OutputSettings();
        int int15 = outputSettings14.indentAmount();
        org.jsoup.nodes.Entities.EscapeMode escapeMode16 = outputSettings14.escapeMode();
        org.jsoup.nodes.Document.OutputSettings outputSettings17 = outputSettings13.escapeMode(escapeMode16);
        org.jsoup.nodes.Document.OutputSettings outputSettings18 = outputSettings11.escapeMode(escapeMode16);
        org.jsoup.nodes.Document.OutputSettings outputSettings20 = outputSettings18.indentAmount((int) 'a');
        org.jsoup.nodes.Document.OutputSettings outputSettings22 = outputSettings18.prettyPrint(false);
        org.jsoup.nodes.Document.OutputSettings outputSettings23 = new org.jsoup.nodes.Document.OutputSettings();
        boolean boolean24 = outputSettings23.prettyPrint();
        org.jsoup.nodes.Document.OutputSettings outputSettings26 = outputSettings23.prettyPrint(false);
        org.jsoup.nodes.Document.OutputSettings outputSettings27 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Entities.EscapeMode escapeMode28 = outputSettings27.escapeMode();
        org.jsoup.nodes.Document.OutputSettings outputSettings29 = outputSettings23.escapeMode(escapeMode28);
        org.jsoup.nodes.Document.OutputSettings outputSettings30 = outputSettings23.clone();
        org.jsoup.nodes.Document.OutputSettings outputSettings31 = new org.jsoup.nodes.Document.OutputSettings();
        boolean boolean32 = outputSettings31.prettyPrint();
        org.jsoup.nodes.Document.OutputSettings outputSettings34 = outputSettings31.prettyPrint(false);
        org.jsoup.nodes.Document.OutputSettings outputSettings36 = outputSettings31.indentAmount((int) '#');
        org.jsoup.nodes.Entities.EscapeMode escapeMode37 = outputSettings31.escapeMode();
        org.jsoup.nodes.Document.OutputSettings outputSettings38 = outputSettings23.escapeMode(escapeMode37);
        org.jsoup.nodes.Entities.EscapeMode escapeMode39 = outputSettings23.escapeMode();
        org.jsoup.nodes.Document.OutputSettings outputSettings40 = outputSettings18.escapeMode(escapeMode39);
        org.jsoup.nodes.Document.OutputSettings outputSettings42 = outputSettings40.indentAmount((int) (byte) 100);
        boolean boolean43 = textNode2.equals((java.lang.Object) outputSettings40);
        java.lang.Class<?> wildcardClass44 = outputSettings40.getClass();
        org.junit.Assert.assertNotNull(textNode2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNotNull(nodeList9);
        org.junit.Assert.assertNotNull(outputSettings11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + escapeMode16 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode16.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertNotNull(outputSettings17);
        org.junit.Assert.assertNotNull(outputSettings18);
        org.junit.Assert.assertNotNull(outputSettings20);
        org.junit.Assert.assertNotNull(outputSettings22);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertNotNull(outputSettings26);
        org.junit.Assert.assertTrue("'" + escapeMode28 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode28.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertNotNull(outputSettings29);
        org.junit.Assert.assertNotNull(outputSettings30);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + true + "'", boolean32 == true);
        org.junit.Assert.assertNotNull(outputSettings34);
        org.junit.Assert.assertNotNull(outputSettings36);
        org.junit.Assert.assertTrue("'" + escapeMode37 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode37.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertNotNull(outputSettings38);
        org.junit.Assert.assertTrue("'" + escapeMode39 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode39.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertNotNull(outputSettings40);
        org.junit.Assert.assertNotNull(outputSettings42);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertNotNull(wildcardClass44);
    }

    @Test
    public void test20556() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20556");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("", "");
        boolean boolean3 = textNode2.isBlank();
        boolean boolean4 = textNode2.isBlank();
        java.util.List<org.jsoup.nodes.Node> nodeList5 = textNode2.childNodes();
        java.lang.String str6 = textNode2.baseUri();
        int int7 = textNode2.childNodeSize();
        boolean boolean9 = textNode2.hasAttr("");
        java.lang.String str10 = textNode2.toString();
        java.util.List<org.jsoup.nodes.Node> nodeList11 = textNode2.childNodesCopy();
        org.jsoup.nodes.TextNode textNode13 = textNode2.text("");
        org.jsoup.nodes.Node node14 = textNode2.nextSibling();
        org.jsoup.nodes.Node node15 = textNode2.clone();
        org.jsoup.nodes.TextNode textNode18 = org.jsoup.nodes.TextNode.createFromEncoded("", "");
        java.util.List<org.jsoup.nodes.Node> nodeList19 = textNode18.childNodesCopy();
        java.lang.String str20 = textNode18.text();
        org.jsoup.nodes.Node node23 = textNode18.attr("#text", "");
        boolean boolean24 = textNode2.equals((java.lang.Object) textNode18);
        org.jsoup.nodes.TextNode textNode26 = textNode2.text("#");
        textNode2.setBaseUri("#");
        int int29 = textNode2.siblingIndex();
        org.junit.Assert.assertNotNull(textNode2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(nodeList5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNotNull(nodeList11);
        org.junit.Assert.assertNotNull(textNode13);
        org.junit.Assert.assertNull(node14);
        org.junit.Assert.assertNotNull(node15);
        org.junit.Assert.assertNotNull(textNode18);
        org.junit.Assert.assertNotNull(nodeList19);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertNotNull(node23);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(textNode26);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
    }

    @Test
    public void test20557() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20557");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("text", "text");
        java.lang.String str3 = textNode2.outerHtml();
        org.jsoup.nodes.Node node5 = textNode2.removeAttr("hi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "text" + "'", str3, "text");
        org.junit.Assert.assertNotNull(node5);
    }

    @Test
    public void test20558() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20558");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("", "");
        boolean boolean3 = textNode2.isBlank();
        org.jsoup.nodes.Node node4 = textNode2.previousSibling();
        java.lang.String str5 = textNode2.nodeName();
        java.lang.String str6 = textNode2.getWholeText();
        java.lang.String str7 = textNode2.getWholeText();
        boolean boolean9 = textNode2.hasAttr("#text");
        int int10 = textNode2.siblingIndex();
        org.jsoup.nodes.TextNode textNode13 = org.jsoup.nodes.TextNode.createFromEncoded("", "");
        java.util.List<org.jsoup.nodes.Node> nodeList14 = textNode13.childNodesCopy();
        java.lang.String str15 = textNode13.toString();
        org.jsoup.nodes.Node node16 = textNode13.parent();
        org.jsoup.nodes.Node node17 = textNode13.nextSibling();
        java.lang.String str18 = textNode13.toString();
        org.jsoup.nodes.Node node20 = textNode13.removeAttr("#text");
        org.jsoup.nodes.Node node21 = textNode13.previousSibling();
        boolean boolean22 = textNode2.equals((java.lang.Object) textNode13);
        java.lang.String str23 = textNode13.outerHtml();
        org.junit.Assert.assertNotNull(textNode2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNull(node4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "#text" + "'", str5, "#text");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNotNull(textNode13);
        org.junit.Assert.assertNotNull(nodeList14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertNull(node16);
        org.junit.Assert.assertNull(node17);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertNotNull(node20);
        org.junit.Assert.assertNull(node21);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
    }

    @Test
    public void test20559() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20559");
        org.jsoup.nodes.Document.OutputSettings outputSettings0 = new org.jsoup.nodes.Document.OutputSettings();
        boolean boolean1 = outputSettings0.prettyPrint();
        org.jsoup.nodes.Document.OutputSettings outputSettings3 = outputSettings0.prettyPrint(false);
        org.jsoup.nodes.Document.OutputSettings outputSettings5 = outputSettings0.indentAmount((int) '#');
        org.jsoup.nodes.Entities.EscapeMode escapeMode6 = outputSettings5.escapeMode();
        org.jsoup.nodes.Document.OutputSettings outputSettings7 = outputSettings5.clone();
        org.jsoup.nodes.Document.OutputSettings outputSettings9 = outputSettings7.indentAmount(0);
        org.jsoup.nodes.Entities.EscapeMode escapeMode10 = outputSettings9.escapeMode();
        org.jsoup.nodes.Document.OutputSettings outputSettings11 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Entities.EscapeMode escapeMode12 = outputSettings11.escapeMode();
        boolean boolean13 = outputSettings11.prettyPrint();
        org.jsoup.nodes.Document.OutputSettings outputSettings14 = new org.jsoup.nodes.Document.OutputSettings();
        boolean boolean15 = outputSettings14.prettyPrint();
        org.jsoup.nodes.Document.OutputSettings outputSettings17 = outputSettings14.prettyPrint(false);
        org.jsoup.nodes.Document.OutputSettings outputSettings18 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Entities.EscapeMode escapeMode19 = outputSettings18.escapeMode();
        org.jsoup.nodes.Document.OutputSettings outputSettings20 = outputSettings14.escapeMode(escapeMode19);
        org.jsoup.nodes.Document.OutputSettings outputSettings21 = outputSettings14.clone();
        org.jsoup.nodes.Document.OutputSettings outputSettings22 = new org.jsoup.nodes.Document.OutputSettings();
        boolean boolean23 = outputSettings22.prettyPrint();
        org.jsoup.nodes.Document.OutputSettings outputSettings25 = outputSettings22.prettyPrint(false);
        org.jsoup.nodes.Document.OutputSettings outputSettings27 = outputSettings22.indentAmount((int) '#');
        org.jsoup.nodes.Entities.EscapeMode escapeMode28 = outputSettings22.escapeMode();
        org.jsoup.nodes.Document.OutputSettings outputSettings29 = outputSettings14.escapeMode(escapeMode28);
        org.jsoup.nodes.Document.OutputSettings outputSettings30 = outputSettings11.escapeMode(escapeMode28);
        org.jsoup.nodes.Document.OutputSettings outputSettings31 = outputSettings9.escapeMode(escapeMode28);
        org.jsoup.nodes.Document.OutputSettings outputSettings32 = new org.jsoup.nodes.Document.OutputSettings();
        boolean boolean33 = outputSettings32.prettyPrint();
        org.jsoup.nodes.Document.OutputSettings outputSettings35 = outputSettings32.prettyPrint(false);
        org.jsoup.nodes.Document.OutputSettings outputSettings36 = new org.jsoup.nodes.Document.OutputSettings();
        boolean boolean37 = outputSettings36.prettyPrint();
        org.jsoup.nodes.Document.OutputSettings outputSettings38 = new org.jsoup.nodes.Document.OutputSettings();
        int int39 = outputSettings38.indentAmount();
        org.jsoup.nodes.Entities.EscapeMode escapeMode40 = outputSettings38.escapeMode();
        java.nio.charset.Charset charset41 = outputSettings38.charset();
        org.jsoup.nodes.Document.OutputSettings outputSettings42 = outputSettings36.charset(charset41);
        org.jsoup.nodes.Document.OutputSettings outputSettings43 = outputSettings35.charset(charset41);
        java.nio.charset.Charset charset44 = outputSettings43.charset();
        org.jsoup.nodes.Document.OutputSettings outputSettings45 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Document.OutputSettings outputSettings46 = outputSettings45.clone();
        boolean boolean47 = outputSettings46.prettyPrint();
        org.jsoup.nodes.Document.OutputSettings outputSettings48 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Document.OutputSettings outputSettings49 = new org.jsoup.nodes.Document.OutputSettings();
        int int50 = outputSettings49.indentAmount();
        org.jsoup.nodes.Entities.EscapeMode escapeMode51 = outputSettings49.escapeMode();
        org.jsoup.nodes.Document.OutputSettings outputSettings52 = outputSettings48.escapeMode(escapeMode51);
        org.jsoup.nodes.Document.OutputSettings outputSettings53 = outputSettings46.escapeMode(escapeMode51);
        org.jsoup.nodes.Document.OutputSettings outputSettings54 = outputSettings43.escapeMode(escapeMode51);
        org.jsoup.nodes.Document.OutputSettings outputSettings55 = outputSettings31.escapeMode(escapeMode51);
        org.jsoup.nodes.Document.OutputSettings outputSettings57 = outputSettings31.indentAmount(35);
        int int58 = outputSettings31.indentAmount();
        org.jsoup.nodes.Document.OutputSettings outputSettings60 = outputSettings31.indentAmount(100);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertNotNull(outputSettings3);
        org.junit.Assert.assertNotNull(outputSettings5);
        org.junit.Assert.assertTrue("'" + escapeMode6 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode6.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertNotNull(outputSettings7);
        org.junit.Assert.assertNotNull(outputSettings9);
        org.junit.Assert.assertTrue("'" + escapeMode10 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode10.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertTrue("'" + escapeMode12 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode12.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNotNull(outputSettings17);
        org.junit.Assert.assertTrue("'" + escapeMode19 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode19.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertNotNull(outputSettings20);
        org.junit.Assert.assertNotNull(outputSettings21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertNotNull(outputSettings25);
        org.junit.Assert.assertNotNull(outputSettings27);
        org.junit.Assert.assertTrue("'" + escapeMode28 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode28.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertNotNull(outputSettings29);
        org.junit.Assert.assertNotNull(outputSettings30);
        org.junit.Assert.assertNotNull(outputSettings31);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + true + "'", boolean33 == true);
        org.junit.Assert.assertNotNull(outputSettings35);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + true + "'", boolean37 == true);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 1 + "'", int39 == 1);
        org.junit.Assert.assertTrue("'" + escapeMode40 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode40.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertNotNull(charset41);
        org.junit.Assert.assertNotNull(outputSettings42);
        org.junit.Assert.assertNotNull(outputSettings43);
        org.junit.Assert.assertNotNull(charset44);
        org.junit.Assert.assertNotNull(outputSettings46);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + true + "'", boolean47 == true);
        org.junit.Assert.assertTrue("'" + int50 + "' != '" + 1 + "'", int50 == 1);
        org.junit.Assert.assertTrue("'" + escapeMode51 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode51.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertNotNull(outputSettings52);
        org.junit.Assert.assertNotNull(outputSettings53);
        org.junit.Assert.assertNotNull(outputSettings54);
        org.junit.Assert.assertNotNull(outputSettings55);
        org.junit.Assert.assertNotNull(outputSettings57);
        org.junit.Assert.assertTrue("'" + int58 + "' != '" + 35 + "'", int58 == 35);
        org.junit.Assert.assertNotNull(outputSettings60);
    }

    @Test
    public void test20560() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20560");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("", "");
        boolean boolean3 = textNode2.isBlank();
        org.jsoup.nodes.Node node4 = textNode2.previousSibling();
        java.lang.String str5 = textNode2.nodeName();
        java.lang.String str6 = textNode2.getWholeText();
        java.lang.String str7 = textNode2.getWholeText();
        boolean boolean9 = textNode2.hasAttr("#text");
        java.lang.String str10 = textNode2.getWholeText();
        java.lang.String str12 = textNode2.attr("hi!");
        int int13 = textNode2.siblingIndex();
        org.jsoup.nodes.Node node14 = textNode2.nextSibling();
        org.junit.Assert.assertNotNull(textNode2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNull(node4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "#text" + "'", str5, "#text");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNull(node14);
    }

    @Test
    public void test20561() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20561");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("", "");
        boolean boolean3 = textNode2.isBlank();
        boolean boolean4 = textNode2.isBlank();
        java.util.List<org.jsoup.nodes.Node> nodeList5 = textNode2.childNodes();
        java.lang.String str6 = textNode2.baseUri();
        int int7 = textNode2.childNodeSize();
        boolean boolean9 = textNode2.hasAttr("");
        org.jsoup.nodes.Attributes attributes10 = textNode2.attributes();
        org.jsoup.nodes.Document document11 = textNode2.ownerDocument();
        org.jsoup.nodes.Node node12 = textNode2.previousSibling();
        java.lang.String str14 = textNode2.attr("text");
        org.junit.Assert.assertNotNull(textNode2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(nodeList5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(attributes10);
        org.junit.Assert.assertNull(document11);
        org.junit.Assert.assertNull(node12);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
    }

    @Test
    public void test20562() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20562");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("", "");
        boolean boolean3 = textNode2.isBlank();
        org.jsoup.nodes.Node node4 = textNode2.previousSibling();
        java.lang.String str5 = textNode2.nodeName();
        boolean boolean6 = textNode2.isBlank();
        org.jsoup.nodes.Node node7 = textNode2.clone();
        java.lang.String str8 = textNode2.getWholeText();
        java.lang.String str10 = textNode2.absUrl("i!");
        org.jsoup.nodes.Node node11 = textNode2.previousSibling();
        java.lang.String str12 = textNode2.toString();
        org.jsoup.nodes.Attributes attributes13 = textNode2.attributes();
        org.jsoup.nodes.Node node14 = textNode2.nextSibling();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass15 = node14.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(textNode2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNull(node4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "#text" + "'", str5, "#text");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(node7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNull(node11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertNotNull(attributes13);
        org.junit.Assert.assertNull(node14);
    }

    @Test
    public void test20563() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20563");
        org.jsoup.nodes.Document.OutputSettings outputSettings0 = new org.jsoup.nodes.Document.OutputSettings();
        boolean boolean1 = outputSettings0.prettyPrint();
        org.jsoup.nodes.Document.OutputSettings outputSettings3 = outputSettings0.prettyPrint(false);
        int int4 = outputSettings0.indentAmount();
        org.jsoup.nodes.Document.OutputSettings outputSettings5 = outputSettings0.clone();
        boolean boolean6 = outputSettings0.prettyPrint();
        org.jsoup.nodes.Document.OutputSettings outputSettings8 = outputSettings0.prettyPrint(false);
        org.jsoup.nodes.Document.OutputSettings outputSettings9 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Document.OutputSettings outputSettings10 = outputSettings9.clone();
        org.jsoup.nodes.Document.OutputSettings outputSettings12 = outputSettings9.prettyPrint(true);
        org.jsoup.nodes.Document.OutputSettings outputSettings14 = outputSettings9.indentAmount(0);
        org.jsoup.nodes.Document.OutputSettings outputSettings16 = outputSettings9.prettyPrint(true);
        java.nio.charset.Charset charset17 = outputSettings16.charset();
        org.jsoup.nodes.Document.OutputSettings outputSettings18 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Entities.EscapeMode escapeMode19 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings20 = outputSettings18.escapeMode(escapeMode19);
        int int21 = outputSettings20.indentAmount();
        boolean boolean22 = outputSettings20.prettyPrint();
        org.jsoup.nodes.Document.OutputSettings outputSettings23 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Document.OutputSettings outputSettings24 = outputSettings23.clone();
        boolean boolean25 = outputSettings24.prettyPrint();
        org.jsoup.nodes.Document.OutputSettings outputSettings26 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Document.OutputSettings outputSettings27 = new org.jsoup.nodes.Document.OutputSettings();
        int int28 = outputSettings27.indentAmount();
        org.jsoup.nodes.Entities.EscapeMode escapeMode29 = outputSettings27.escapeMode();
        org.jsoup.nodes.Document.OutputSettings outputSettings30 = outputSettings26.escapeMode(escapeMode29);
        org.jsoup.nodes.Document.OutputSettings outputSettings31 = outputSettings24.escapeMode(escapeMode29);
        org.jsoup.nodes.Entities.EscapeMode escapeMode32 = outputSettings24.escapeMode();
        org.jsoup.nodes.Document.OutputSettings outputSettings33 = outputSettings20.escapeMode(escapeMode32);
        org.jsoup.nodes.Document.OutputSettings outputSettings34 = new org.jsoup.nodes.Document.OutputSettings();
        boolean boolean35 = outputSettings34.prettyPrint();
        org.jsoup.nodes.Document.OutputSettings outputSettings37 = outputSettings34.prettyPrint(false);
        org.jsoup.nodes.Document.OutputSettings outputSettings39 = outputSettings34.indentAmount((int) '#');
        org.jsoup.nodes.Document.OutputSettings outputSettings40 = outputSettings34.clone();
        int int41 = outputSettings40.indentAmount();
        org.jsoup.nodes.Document.OutputSettings outputSettings43 = outputSettings40.indentAmount((int) (short) 0);
        org.jsoup.nodes.Entities.EscapeMode escapeMode44 = outputSettings43.escapeMode();
        org.jsoup.nodes.Document.OutputSettings outputSettings45 = outputSettings33.escapeMode(escapeMode44);
        org.jsoup.nodes.Document.OutputSettings outputSettings46 = outputSettings16.escapeMode(escapeMode44);
        org.jsoup.nodes.Document.OutputSettings outputSettings47 = outputSettings8.escapeMode(escapeMode44);
        org.jsoup.nodes.Document.OutputSettings outputSettings48 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Document.OutputSettings outputSettings49 = new org.jsoup.nodes.Document.OutputSettings();
        int int50 = outputSettings49.indentAmount();
        org.jsoup.nodes.Entities.EscapeMode escapeMode51 = outputSettings49.escapeMode();
        org.jsoup.nodes.Document.OutputSettings outputSettings52 = outputSettings48.escapeMode(escapeMode51);
        org.jsoup.nodes.Document.OutputSettings outputSettings54 = outputSettings48.indentAmount((int) (short) 100);
        org.jsoup.nodes.Document.OutputSettings outputSettings56 = outputSettings54.prettyPrint(false);
        org.jsoup.nodes.Document.OutputSettings outputSettings57 = outputSettings54.clone();
        int int58 = outputSettings57.indentAmount();
        org.jsoup.nodes.Entities.EscapeMode escapeMode59 = outputSettings57.escapeMode();
        org.jsoup.nodes.Document.OutputSettings outputSettings60 = outputSettings8.escapeMode(escapeMode59);
        org.jsoup.nodes.Document.OutputSettings outputSettings62 = outputSettings8.prettyPrint(true);
        org.jsoup.nodes.Document.OutputSettings outputSettings64 = outputSettings62.indentAmount(32);
        org.jsoup.nodes.Entities.EscapeMode escapeMode65 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings66 = outputSettings62.escapeMode(escapeMode65);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertNotNull(outputSettings3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertNotNull(outputSettings5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(outputSettings8);
        org.junit.Assert.assertNotNull(outputSettings10);
        org.junit.Assert.assertNotNull(outputSettings12);
        org.junit.Assert.assertNotNull(outputSettings14);
        org.junit.Assert.assertNotNull(outputSettings16);
        org.junit.Assert.assertNotNull(charset17);
        org.junit.Assert.assertNotNull(outputSettings20);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1 + "'", int21 == 1);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertNotNull(outputSettings24);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 1 + "'", int28 == 1);
        org.junit.Assert.assertTrue("'" + escapeMode29 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode29.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertNotNull(outputSettings30);
        org.junit.Assert.assertNotNull(outputSettings31);
        org.junit.Assert.assertTrue("'" + escapeMode32 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode32.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertNotNull(outputSettings33);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + true + "'", boolean35 == true);
        org.junit.Assert.assertNotNull(outputSettings37);
        org.junit.Assert.assertNotNull(outputSettings39);
        org.junit.Assert.assertNotNull(outputSettings40);
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 35 + "'", int41 == 35);
        org.junit.Assert.assertNotNull(outputSettings43);
        org.junit.Assert.assertTrue("'" + escapeMode44 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode44.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertNotNull(outputSettings45);
        org.junit.Assert.assertNotNull(outputSettings46);
        org.junit.Assert.assertNotNull(outputSettings47);
        org.junit.Assert.assertTrue("'" + int50 + "' != '" + 1 + "'", int50 == 1);
        org.junit.Assert.assertTrue("'" + escapeMode51 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode51.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertNotNull(outputSettings52);
        org.junit.Assert.assertNotNull(outputSettings54);
        org.junit.Assert.assertNotNull(outputSettings56);
        org.junit.Assert.assertNotNull(outputSettings57);
        org.junit.Assert.assertTrue("'" + int58 + "' != '" + 100 + "'", int58 == 100);
        org.junit.Assert.assertTrue("'" + escapeMode59 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode59.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertNotNull(outputSettings60);
        org.junit.Assert.assertNotNull(outputSettings62);
        org.junit.Assert.assertNotNull(outputSettings64);
        org.junit.Assert.assertNotNull(outputSettings66);
    }

    @Test
    public void test20564() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20564");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("", "#text");
        java.lang.String str3 = textNode2.baseUri();
        java.lang.String str4 = textNode2.toString();
        java.lang.String str5 = textNode2.outerHtml();
        java.lang.String str7 = textNode2.attr("");
        java.lang.String str8 = textNode2.getWholeText();
        org.jsoup.nodes.Node node9 = textNode2.nextSibling();
        org.jsoup.nodes.Document document10 = textNode2.ownerDocument();
        boolean boolean11 = textNode2.isBlank();
        boolean boolean13 = textNode2.hasAttr("#");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "#text" + "'", str3, "#text");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNull(node9);
        org.junit.Assert.assertNull(document10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test20565() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20565");
        org.jsoup.nodes.Document.OutputSettings outputSettings0 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Entities.EscapeMode escapeMode1 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings2 = outputSettings0.escapeMode(escapeMode1);
        boolean boolean3 = outputSettings0.prettyPrint();
        org.jsoup.nodes.Document.OutputSettings outputSettings4 = new org.jsoup.nodes.Document.OutputSettings();
        int int5 = outputSettings4.indentAmount();
        org.jsoup.nodes.Entities.EscapeMode escapeMode6 = outputSettings4.escapeMode();
        org.jsoup.nodes.Document.OutputSettings outputSettings7 = outputSettings0.escapeMode(escapeMode6);
        boolean boolean8 = outputSettings7.prettyPrint();
        org.jsoup.nodes.Document.OutputSettings outputSettings10 = outputSettings7.indentAmount((int) '#');
        org.jsoup.nodes.Document.OutputSettings outputSettings11 = new org.jsoup.nodes.Document.OutputSettings();
        boolean boolean12 = outputSettings11.prettyPrint();
        org.jsoup.nodes.Document.OutputSettings outputSettings14 = outputSettings11.prettyPrint(false);
        org.jsoup.nodes.Document.OutputSettings outputSettings16 = outputSettings11.indentAmount((int) '#');
        org.jsoup.nodes.Entities.EscapeMode escapeMode17 = outputSettings11.escapeMode();
        org.jsoup.nodes.Document.OutputSettings outputSettings18 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Entities.EscapeMode escapeMode19 = outputSettings18.escapeMode();
        org.jsoup.nodes.Document.OutputSettings outputSettings20 = outputSettings18.clone();
        org.jsoup.nodes.Document.OutputSettings outputSettings21 = new org.jsoup.nodes.Document.OutputSettings();
        int int22 = outputSettings21.indentAmount();
        org.jsoup.nodes.Entities.EscapeMode escapeMode23 = outputSettings21.escapeMode();
        java.nio.charset.Charset charset24 = outputSettings21.charset();
        org.jsoup.nodes.Document.OutputSettings outputSettings25 = outputSettings18.charset(charset24);
        org.jsoup.nodes.Document.OutputSettings outputSettings26 = outputSettings11.charset(charset24);
        org.jsoup.nodes.Document.OutputSettings outputSettings27 = outputSettings10.charset(charset24);
        org.jsoup.nodes.Document.OutputSettings outputSettings28 = outputSettings10.clone();
        int int29 = outputSettings10.indentAmount();
        org.jsoup.nodes.Document.OutputSettings outputSettings30 = outputSettings10.clone();
        org.jsoup.nodes.Document.OutputSettings outputSettings31 = outputSettings30.clone();
        org.jsoup.nodes.Document.OutputSettings outputSettings32 = new org.jsoup.nodes.Document.OutputSettings();
        boolean boolean33 = outputSettings32.prettyPrint();
        org.jsoup.nodes.Document.OutputSettings outputSettings35 = outputSettings32.prettyPrint(false);
        org.jsoup.nodes.Document.OutputSettings outputSettings37 = outputSettings32.indentAmount((int) '#');
        org.jsoup.nodes.Entities.EscapeMode escapeMode38 = outputSettings37.escapeMode();
        boolean boolean39 = outputSettings37.prettyPrint();
        org.jsoup.nodes.Document.OutputSettings outputSettings40 = outputSettings37.clone();
        int int41 = outputSettings40.indentAmount();
        java.nio.charset.Charset charset42 = outputSettings40.charset();
        org.jsoup.nodes.Document.OutputSettings outputSettings43 = outputSettings31.charset(charset42);
        org.jsoup.nodes.Entities.EscapeMode escapeMode44 = outputSettings43.escapeMode();
        org.jsoup.nodes.Document.OutputSettings outputSettings46 = outputSettings43.prettyPrint(true);
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Document.OutputSettings outputSettings48 = outputSettings46.charset("i!");
            org.junit.Assert.fail("Expected exception of type java.nio.charset.IllegalCharsetNameException; message: i!");
        } catch (java.nio.charset.IllegalCharsetNameException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(outputSettings2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + escapeMode6 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode6.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertNotNull(outputSettings7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(outputSettings10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(outputSettings14);
        org.junit.Assert.assertNotNull(outputSettings16);
        org.junit.Assert.assertTrue("'" + escapeMode17 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode17.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertTrue("'" + escapeMode19 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode19.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertNotNull(outputSettings20);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 1 + "'", int22 == 1);
        org.junit.Assert.assertTrue("'" + escapeMode23 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode23.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertNotNull(charset24);
        org.junit.Assert.assertNotNull(outputSettings25);
        org.junit.Assert.assertNotNull(outputSettings26);
        org.junit.Assert.assertNotNull(outputSettings27);
        org.junit.Assert.assertNotNull(outputSettings28);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 35 + "'", int29 == 35);
        org.junit.Assert.assertNotNull(outputSettings30);
        org.junit.Assert.assertNotNull(outputSettings31);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + true + "'", boolean33 == true);
        org.junit.Assert.assertNotNull(outputSettings35);
        org.junit.Assert.assertNotNull(outputSettings37);
        org.junit.Assert.assertTrue("'" + escapeMode38 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode38.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertNotNull(outputSettings40);
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 35 + "'", int41 == 35);
        org.junit.Assert.assertNotNull(charset42);
        org.junit.Assert.assertNotNull(outputSettings43);
        org.junit.Assert.assertTrue("'" + escapeMode44 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode44.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertNotNull(outputSettings46);
    }

    @Test
    public void test20566() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20566");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("", "");
        boolean boolean3 = textNode2.isBlank();
        boolean boolean4 = textNode2.isBlank();
        java.util.List<org.jsoup.nodes.Node> nodeList5 = textNode2.childNodes();
        org.jsoup.nodes.TextNode textNode7 = textNode2.text("");
        java.lang.String str8 = textNode2.toString();
        java.lang.String str9 = textNode2.text();
        java.lang.String str10 = textNode2.text();
        boolean boolean12 = textNode2.hasAttr("i!");
        java.lang.String str13 = textNode2.getWholeText();
        org.jsoup.nodes.Node node14 = textNode2.nextSibling();
        org.junit.Assert.assertNotNull(textNode2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(nodeList5);
        org.junit.Assert.assertNotNull(textNode7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNull(node14);
    }

    @Test
    public void test20567() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20567");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("", "");
        boolean boolean3 = textNode2.isBlank();
        boolean boolean4 = textNode2.isBlank();
        java.util.List<org.jsoup.nodes.Node> nodeList5 = textNode2.childNodes();
        org.jsoup.nodes.TextNode textNode7 = textNode2.text("");
        textNode2.setBaseUri("");
        java.lang.String str10 = textNode2.text();
        java.lang.String str11 = textNode2.baseUri();
        java.lang.String str12 = textNode2.getWholeText();
        org.jsoup.nodes.TextNode textNode14 = textNode2.text("#");
        org.jsoup.nodes.TextNode textNode16 = textNode2.text("");
        org.jsoup.nodes.Node node17 = textNode2.clone();
        org.jsoup.nodes.Node node18 = node17.clone();
        org.junit.Assert.assertNotNull(textNode2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(nodeList5);
        org.junit.Assert.assertNotNull(textNode7);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertNotNull(textNode14);
        org.junit.Assert.assertNotNull(textNode16);
        org.junit.Assert.assertNotNull(node17);
        org.junit.Assert.assertNotNull(node18);
    }

    @Test
    public void test20568() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20568");
        org.jsoup.nodes.Document.OutputSettings outputSettings0 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Entities.EscapeMode escapeMode1 = outputSettings0.escapeMode();
        boolean boolean2 = outputSettings0.prettyPrint();
        org.jsoup.nodes.Document.OutputSettings outputSettings3 = outputSettings0.clone();
        org.jsoup.nodes.Entities.EscapeMode escapeMode4 = outputSettings3.escapeMode();
        org.jsoup.nodes.Document.OutputSettings outputSettings6 = outputSettings3.indentAmount(0);
        org.jsoup.nodes.Document.OutputSettings outputSettings7 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Document.OutputSettings outputSettings8 = new org.jsoup.nodes.Document.OutputSettings();
        int int9 = outputSettings8.indentAmount();
        org.jsoup.nodes.Entities.EscapeMode escapeMode10 = outputSettings8.escapeMode();
        org.jsoup.nodes.Document.OutputSettings outputSettings11 = outputSettings7.escapeMode(escapeMode10);
        org.jsoup.nodes.Document.OutputSettings outputSettings13 = outputSettings7.indentAmount((int) (short) 100);
        org.jsoup.nodes.Document.OutputSettings outputSettings15 = outputSettings13.prettyPrint(false);
        org.jsoup.nodes.Document.OutputSettings outputSettings16 = outputSettings15.clone();
        org.jsoup.nodes.Entities.EscapeMode escapeMode17 = outputSettings16.escapeMode();
        int int18 = outputSettings16.indentAmount();
        org.jsoup.nodes.Document.OutputSettings outputSettings20 = outputSettings16.indentAmount((int) ' ');
        org.jsoup.nodes.Document.OutputSettings outputSettings21 = new org.jsoup.nodes.Document.OutputSettings();
        boolean boolean22 = outputSettings21.prettyPrint();
        org.jsoup.nodes.Document.OutputSettings outputSettings24 = outputSettings21.prettyPrint(false);
        org.jsoup.nodes.Document.OutputSettings outputSettings26 = outputSettings21.indentAmount((int) '#');
        org.jsoup.nodes.Document.OutputSettings outputSettings27 = outputSettings21.clone();
        org.jsoup.nodes.Document.OutputSettings outputSettings28 = outputSettings21.clone();
        org.jsoup.nodes.Document.OutputSettings outputSettings29 = outputSettings21.clone();
        int int30 = outputSettings29.indentAmount();
        java.nio.charset.Charset charset31 = outputSettings29.charset();
        org.jsoup.nodes.Document.OutputSettings outputSettings32 = outputSettings20.charset(charset31);
        org.jsoup.nodes.Document.OutputSettings outputSettings33 = outputSettings6.charset(charset31);
        org.junit.Assert.assertTrue("'" + escapeMode1 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode1.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(outputSettings3);
        org.junit.Assert.assertTrue("'" + escapeMode4 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode4.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertNotNull(outputSettings6);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + escapeMode10 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode10.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertNotNull(outputSettings11);
        org.junit.Assert.assertNotNull(outputSettings13);
        org.junit.Assert.assertNotNull(outputSettings15);
        org.junit.Assert.assertNotNull(outputSettings16);
        org.junit.Assert.assertTrue("'" + escapeMode17 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode17.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 100 + "'", int18 == 100);
        org.junit.Assert.assertNotNull(outputSettings20);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertNotNull(outputSettings24);
        org.junit.Assert.assertNotNull(outputSettings26);
        org.junit.Assert.assertNotNull(outputSettings27);
        org.junit.Assert.assertNotNull(outputSettings28);
        org.junit.Assert.assertNotNull(outputSettings29);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 35 + "'", int30 == 35);
        org.junit.Assert.assertNotNull(charset31);
        org.junit.Assert.assertNotNull(outputSettings32);
        org.junit.Assert.assertNotNull(outputSettings33);
    }

    @Test
    public void test20569() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20569");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("", "");
        boolean boolean3 = textNode2.isBlank();
        org.jsoup.nodes.Node node4 = textNode2.previousSibling();
        java.lang.String str5 = textNode2.nodeName();
        org.jsoup.nodes.Node node6 = textNode2.nextSibling();
        boolean boolean7 = textNode2.isBlank();
        java.util.List<org.jsoup.nodes.Node> nodeList8 = textNode2.childNodesCopy();
        org.jsoup.nodes.Attributes attributes9 = textNode2.attributes();
        int int10 = textNode2.childNodeSize();
        org.jsoup.nodes.Attributes attributes11 = textNode2.attributes();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.TextNode textNode13 = textNode2.splitText(97);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Split offset must not be greater than current text length");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(textNode2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNull(node4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "#text" + "'", str5, "#text");
        org.junit.Assert.assertNull(node6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(nodeList8);
        org.junit.Assert.assertNotNull(attributes9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNotNull(attributes11);
    }

    @Test
    public void test20570() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20570");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("", "");
        boolean boolean3 = textNode2.isBlank();
        java.lang.String str4 = textNode2.outerHtml();
        java.lang.String str5 = textNode2.text();
        boolean boolean7 = textNode2.hasAttr("hi!");
        org.jsoup.nodes.Attributes attributes8 = textNode2.attributes();
        java.lang.String str10 = textNode2.absUrl("#text");
        java.lang.String str11 = textNode2.outerHtml();
        java.lang.String str12 = textNode2.getWholeText();
        org.jsoup.nodes.TextNode textNode14 = textNode2.text("i!");
        java.lang.String str15 = textNode2.nodeName();
        java.util.List<org.jsoup.nodes.Node> nodeList16 = textNode2.childNodesCopy();
        java.lang.String str18 = textNode2.attr("#text");
        org.junit.Assert.assertNotNull(textNode2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(attributes8);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertNotNull(textNode14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "#text" + "'", str15, "#text");
        org.junit.Assert.assertNotNull(nodeList16);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
    }

    @Test
    public void test20571() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20571");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("", "");
        boolean boolean3 = textNode2.isBlank();
        org.jsoup.nodes.Node node4 = textNode2.previousSibling();
        org.jsoup.nodes.Node node5 = textNode2.parent();
        java.lang.String str7 = textNode2.absUrl("#text");
        org.jsoup.nodes.Node node8 = textNode2.previousSibling();
        boolean boolean10 = textNode2.hasAttr("#text");
        java.util.List<org.jsoup.nodes.Node> nodeList11 = textNode2.siblingNodes();
        org.jsoup.nodes.Node node12 = textNode2.clone();
        org.jsoup.nodes.Node node13 = node12.clone();
        java.util.List<org.jsoup.nodes.Node> nodeList14 = node12.childNodesCopy();
        org.junit.Assert.assertNotNull(textNode2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNull(node4);
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNull(node8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(nodeList11);
        org.junit.Assert.assertNotNull(node12);
        org.junit.Assert.assertNotNull(node13);
        org.junit.Assert.assertNotNull(nodeList14);
    }

    @Test
    public void test20572() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20572");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("hi!", "hi!");
        java.lang.String str3 = textNode2.text();
        boolean boolean5 = textNode2.hasAttr("h");
        org.jsoup.nodes.Document.OutputSettings outputSettings6 = new org.jsoup.nodes.Document.OutputSettings();
        int int7 = outputSettings6.indentAmount();
        org.jsoup.nodes.Entities.EscapeMode escapeMode8 = outputSettings6.escapeMode();
        org.jsoup.nodes.Document.OutputSettings outputSettings9 = outputSettings6.clone();
        java.nio.charset.Charset charset10 = outputSettings6.charset();
        org.jsoup.nodes.Document.OutputSettings outputSettings11 = new org.jsoup.nodes.Document.OutputSettings();
        boolean boolean12 = outputSettings11.prettyPrint();
        org.jsoup.nodes.Document.OutputSettings outputSettings14 = outputSettings11.prettyPrint(false);
        org.jsoup.nodes.Document.OutputSettings outputSettings15 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Entities.EscapeMode escapeMode16 = outputSettings15.escapeMode();
        org.jsoup.nodes.Document.OutputSettings outputSettings17 = outputSettings11.escapeMode(escapeMode16);
        org.jsoup.nodes.Document.OutputSettings outputSettings19 = outputSettings11.indentAmount((int) '4');
        org.jsoup.nodes.Entities.EscapeMode escapeMode20 = outputSettings11.escapeMode();
        java.nio.charset.Charset charset21 = outputSettings11.charset();
        org.jsoup.nodes.Document.OutputSettings outputSettings22 = outputSettings6.charset(charset21);
        org.jsoup.nodes.Document.OutputSettings outputSettings23 = outputSettings6.clone();
        org.jsoup.nodes.Document.OutputSettings outputSettings25 = outputSettings23.prettyPrint(false);
        int int26 = outputSettings23.indentAmount();
        org.jsoup.nodes.Document.OutputSettings outputSettings27 = outputSettings23.clone();
        java.nio.charset.Charset charset28 = outputSettings23.charset();
        boolean boolean29 = textNode2.equals((java.lang.Object) outputSettings23);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + escapeMode8 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode8.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertNotNull(outputSettings9);
        org.junit.Assert.assertNotNull(charset10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(outputSettings14);
        org.junit.Assert.assertTrue("'" + escapeMode16 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode16.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertNotNull(outputSettings17);
        org.junit.Assert.assertNotNull(outputSettings19);
        org.junit.Assert.assertTrue("'" + escapeMode20 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode20.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertNotNull(charset21);
        org.junit.Assert.assertNotNull(outputSettings22);
        org.junit.Assert.assertNotNull(outputSettings23);
        org.junit.Assert.assertNotNull(outputSettings25);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 1 + "'", int26 == 1);
        org.junit.Assert.assertNotNull(outputSettings27);
        org.junit.Assert.assertNotNull(charset28);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
    }

    @Test
    public void test20573() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20573");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("hi!", "hi!");
        org.jsoup.nodes.Node node3 = textNode2.parent();
        java.lang.String str4 = textNode2.outerHtml();
        org.jsoup.nodes.Node node5 = textNode2.previousSibling();
        org.jsoup.nodes.TextNode textNode8 = org.jsoup.nodes.TextNode.createFromEncoded("#text", "hi!");
        int int9 = textNode8.childNodeSize();
        boolean boolean10 = textNode2.equals((java.lang.Object) int9);
        boolean boolean12 = textNode2.hasAttr("hi!");
        int int13 = textNode2.siblingIndex();
        org.jsoup.nodes.Node node14 = textNode2.previousSibling();
        org.jsoup.nodes.TextNode textNode17 = org.jsoup.nodes.TextNode.createFromEncoded("", "");
        boolean boolean18 = textNode17.isBlank();
        org.jsoup.nodes.Node node19 = textNode17.previousSibling();
        java.lang.String str20 = textNode17.nodeName();
        org.jsoup.nodes.Node node21 = textNode17.nextSibling();
        boolean boolean22 = textNode17.isBlank();
        java.lang.String str23 = textNode17.text();
        org.jsoup.nodes.Node node24 = textNode17.previousSibling();
        java.lang.String str25 = textNode17.text();
        java.util.List<org.jsoup.nodes.Node> nodeList26 = textNode17.siblingNodes();
        java.lang.String str27 = textNode17.getWholeText();
        org.jsoup.nodes.Node node29 = textNode17.removeAttr("hi!");
        org.jsoup.nodes.TextNode textNode31 = textNode17.text("text");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node32 = textNode2.before((org.jsoup.nodes.Node) textNode31);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(textNode2);
        org.junit.Assert.assertNull(node3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertNotNull(textNode8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNull(node14);
        org.junit.Assert.assertNotNull(textNode17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertNull(node19);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "#text" + "'", str20, "#text");
        org.junit.Assert.assertNull(node21);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
        org.junit.Assert.assertNull(node24);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "" + "'", str25, "");
        org.junit.Assert.assertNotNull(nodeList26);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "" + "'", str27, "");
        org.junit.Assert.assertNotNull(node29);
        org.junit.Assert.assertNotNull(textNode31);
    }

    @Test
    public void test20574() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20574");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("", "");
        boolean boolean3 = textNode2.isBlank();
        org.jsoup.nodes.Node node4 = textNode2.previousSibling();
        java.lang.String str5 = textNode2.nodeName();
        java.lang.String str6 = textNode2.toString();
        org.jsoup.nodes.Node node8 = textNode2.removeAttr("#text");
        java.util.List<org.jsoup.nodes.Node> nodeList9 = textNode2.childNodes();
        int int10 = textNode2.siblingIndex();
        java.lang.Class<?> wildcardClass11 = textNode2.getClass();
        org.junit.Assert.assertNotNull(textNode2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNull(node4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "#text" + "'", str5, "#text");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(node8);
        org.junit.Assert.assertNotNull(nodeList9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test20575() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20575");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("", "");
        boolean boolean3 = textNode2.isBlank();
        org.jsoup.nodes.Node node4 = textNode2.previousSibling();
        org.jsoup.nodes.Node node7 = textNode2.attr("hi!", "");
        java.lang.String str8 = textNode2.baseUri();
        java.lang.String str9 = textNode2.outerHtml();
        java.util.List<org.jsoup.nodes.Node> nodeList10 = textNode2.childNodesCopy();
        org.jsoup.nodes.Node node11 = textNode2.clone();
        org.jsoup.nodes.Node node12 = textNode2.clone();
        org.jsoup.nodes.Node node13 = textNode2.clone();
        java.lang.String str14 = node13.baseUri();
        org.jsoup.nodes.Node node15 = node13.previousSibling();
        org.jsoup.select.NodeVisitor nodeVisitor16 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node17 = node15.traverse(nodeVisitor16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(textNode2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNull(node4);
        org.junit.Assert.assertNotNull(node7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNotNull(nodeList10);
        org.junit.Assert.assertNotNull(node11);
        org.junit.Assert.assertNotNull(node12);
        org.junit.Assert.assertNotNull(node13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertNull(node15);
    }

    @Test
    public void test20576() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20576");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("hi!", "hi!");
        int int3 = textNode2.childNodeSize();
        int int4 = textNode2.childNodeSize();
        textNode2.setBaseUri("hi!");
        org.jsoup.nodes.Node node7 = textNode2.previousSibling();
        org.jsoup.nodes.TextNode textNode9 = textNode2.text("");
        textNode2.setBaseUri("#");
        java.util.List<org.jsoup.nodes.Node> nodeList12 = textNode2.childNodesCopy();
        org.jsoup.nodes.Node node14 = textNode2.removeAttr("#");
        java.lang.String str15 = textNode2.text();
        int int16 = textNode2.childNodeSize();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNull(node7);
        org.junit.Assert.assertNotNull(textNode9);
        org.junit.Assert.assertNotNull(nodeList12);
        org.junit.Assert.assertNotNull(node14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
    }

    @Test
    public void test20577() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20577");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("", "");
        boolean boolean3 = textNode2.isBlank();
        org.jsoup.nodes.Node node4 = textNode2.previousSibling();
        org.jsoup.nodes.Node node7 = textNode2.attr("hi!", "");
        java.lang.String str8 = textNode2.baseUri();
        java.lang.String str9 = textNode2.outerHtml();
        org.jsoup.nodes.TextNode textNode11 = textNode2.text("#text");
        org.jsoup.nodes.TextNode textNode14 = org.jsoup.nodes.TextNode.createFromEncoded("", "");
        boolean boolean15 = textNode14.isBlank();
        java.lang.String str17 = textNode14.attr("");
        boolean boolean18 = textNode2.equals((java.lang.Object) textNode14);
        org.jsoup.nodes.Node node19 = textNode2.clone();
        org.jsoup.nodes.TextNode textNode22 = org.jsoup.nodes.TextNode.createFromEncoded("", "");
        boolean boolean23 = textNode22.isBlank();
        boolean boolean24 = textNode22.isBlank();
        java.util.List<org.jsoup.nodes.Node> nodeList25 = textNode22.childNodes();
        org.jsoup.nodes.TextNode textNode27 = textNode22.text("");
        textNode22.setBaseUri("hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList30 = textNode22.childNodesCopy();
        org.jsoup.nodes.Node node31 = textNode22.clone();
        java.util.List<org.jsoup.nodes.Node> nodeList32 = node31.childNodesCopy();
        boolean boolean33 = node19.equals((java.lang.Object) nodeList32);
        org.jsoup.nodes.Node node34 = node19.clone();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node36 = node19.after("#");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(textNode2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNull(node4);
        org.junit.Assert.assertNotNull(node7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNotNull(textNode11);
        org.junit.Assert.assertNotNull(textNode14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(node19);
        org.junit.Assert.assertNotNull(textNode22);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertNotNull(nodeList25);
        org.junit.Assert.assertNotNull(textNode27);
        org.junit.Assert.assertNotNull(nodeList30);
        org.junit.Assert.assertNotNull(node31);
        org.junit.Assert.assertNotNull(nodeList32);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertNotNull(node34);
    }

    @Test
    public void test20578() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20578");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("#text", "#text");
        textNode2.setBaseUri("#text");
        org.jsoup.nodes.Node node7 = textNode2.attr("hi!", "");
        java.lang.String str9 = textNode2.attr("i!");
        org.jsoup.nodes.TextNode textNode12 = org.jsoup.nodes.TextNode.createFromEncoded("", "");
        boolean boolean13 = textNode12.isBlank();
        org.jsoup.nodes.Node node16 = textNode12.attr("#text", "");
        boolean boolean17 = textNode12.isBlank();
        java.lang.Object obj18 = null;
        boolean boolean19 = textNode12.equals(obj18);
        java.util.List<org.jsoup.nodes.Node> nodeList20 = textNode12.childNodesCopy();
        boolean boolean21 = textNode2.equals((java.lang.Object) textNode12);
        org.jsoup.nodes.TextNode textNode23 = textNode12.text("#");
        boolean boolean24 = textNode12.isBlank();
        org.junit.Assert.assertNotNull(node7);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNotNull(textNode12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNotNull(node16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(nodeList20);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(textNode23);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
    }

    @Test
    public void test20579() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20579");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("h", "#text");
        org.jsoup.nodes.TextNode textNode5 = org.jsoup.nodes.TextNode.createFromEncoded("", "");
        boolean boolean6 = textNode5.isBlank();
        org.jsoup.nodes.Node node7 = textNode5.previousSibling();
        org.jsoup.nodes.Node node10 = textNode5.attr("hi!", "");
        java.lang.String str11 = textNode5.baseUri();
        boolean boolean12 = textNode5.isBlank();
        org.jsoup.nodes.Document document13 = textNode5.ownerDocument();
        java.lang.String str14 = textNode5.toString();
        // The following exception was thrown during execution in test generation
        try {
            textNode2.replaceWith((org.jsoup.nodes.Node) textNode5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(textNode2);
        org.junit.Assert.assertNotNull(textNode5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNull(node7);
        org.junit.Assert.assertNotNull(node10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNull(document13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
    }

    @Test
    public void test20580() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20580");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("hi!", "#");
        org.jsoup.nodes.Node node5 = textNode2.attr("#text", "i!");
        int int6 = node5.childNodeSize();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node8 = node5.after("!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(textNode2);
        org.junit.Assert.assertNotNull(node5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
    }

    @Test
    public void test20581() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20581");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("", "");
        boolean boolean3 = textNode2.isBlank();
        org.jsoup.nodes.Node node4 = textNode2.previousSibling();
        java.lang.String str5 = textNode2.nodeName();
        org.jsoup.nodes.Node node6 = textNode2.nextSibling();
        boolean boolean7 = textNode2.isBlank();
        java.util.List<org.jsoup.nodes.Node> nodeList8 = textNode2.childNodesCopy();
        java.util.List<org.jsoup.nodes.Node> nodeList9 = textNode2.childNodesCopy();
        org.jsoup.nodes.TextNode textNode11 = textNode2.text("hi!");
        boolean boolean13 = textNode2.hasAttr("i!");
        org.jsoup.nodes.Node node16 = textNode2.attr("i!", "");
        java.lang.Object obj17 = null;
        boolean boolean18 = textNode2.equals(obj17);
        org.jsoup.nodes.Node node19 = textNode2.previousSibling();
        java.lang.String str20 = textNode2.nodeName();
        java.lang.String str21 = textNode2.baseUri();
        org.jsoup.nodes.Node node24 = textNode2.attr("h", "#text");
        org.junit.Assert.assertNotNull(textNode2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNull(node4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "#text" + "'", str5, "#text");
        org.junit.Assert.assertNull(node6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(nodeList8);
        org.junit.Assert.assertNotNull(nodeList9);
        org.junit.Assert.assertNotNull(textNode11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(node16);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNull(node19);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "#text" + "'", str20, "#text");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertNotNull(node24);
    }

    @Test
    public void test20582() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20582");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("#text", "");
        org.jsoup.nodes.Node node3 = textNode2.nextSibling();
        java.lang.String str4 = textNode2.toString();
        org.jsoup.nodes.Node node5 = textNode2.clone();
        org.jsoup.nodes.Node node6 = node5.nextSibling();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Document document7 = node6.ownerDocument();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(textNode2);
        org.junit.Assert.assertNull(node3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "#text" + "'", str4, "#text");
        org.junit.Assert.assertNotNull(node5);
        org.junit.Assert.assertNull(node6);
    }

    @Test
    public void test20583() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20583");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("#text", "");
        int int3 = textNode2.siblingIndex();
        org.jsoup.nodes.Node node4 = textNode2.nextSibling();
        org.jsoup.select.NodeVisitor nodeVisitor5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node6 = textNode2.traverse(nodeVisitor5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(textNode2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNull(node4);
    }

    @Test
    public void test20584() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20584");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("", "");
        boolean boolean3 = textNode2.isBlank();
        org.jsoup.nodes.Node node4 = textNode2.previousSibling();
        org.jsoup.nodes.Node node7 = textNode2.attr("hi!", "");
        java.lang.String str8 = textNode2.baseUri();
        java.lang.String str9 = textNode2.outerHtml();
        org.jsoup.nodes.TextNode textNode11 = textNode2.text("#text");
        org.jsoup.nodes.TextNode textNode14 = org.jsoup.nodes.TextNode.createFromEncoded("", "");
        boolean boolean15 = textNode14.isBlank();
        java.lang.String str17 = textNode14.attr("");
        boolean boolean18 = textNode2.equals((java.lang.Object) textNode14);
        boolean boolean20 = textNode14.hasAttr("#text");
        java.util.List<org.jsoup.nodes.Node> nodeList21 = textNode14.siblingNodes();
        java.lang.String str22 = textNode14.nodeName();
        org.jsoup.nodes.TextNode textNode24 = textNode14.text("text");
        java.lang.String str26 = textNode14.attr("hi!");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node28 = textNode14.after("#text");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(textNode2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNull(node4);
        org.junit.Assert.assertNotNull(node7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNotNull(textNode11);
        org.junit.Assert.assertNotNull(textNode14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(nodeList21);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "#text" + "'", str22, "#text");
        org.junit.Assert.assertNotNull(textNode24);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "" + "'", str26, "");
    }

    @Test
    public void test20585() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20585");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("", "");
        boolean boolean3 = textNode2.isBlank();
        org.jsoup.nodes.Node node4 = textNode2.previousSibling();
        java.lang.String str5 = textNode2.nodeName();
        org.jsoup.nodes.Node node6 = textNode2.nextSibling();
        boolean boolean7 = textNode2.isBlank();
        java.lang.String str8 = textNode2.baseUri();
        textNode2.setBaseUri("");
        java.lang.String str11 = textNode2.outerHtml();
        org.jsoup.nodes.Document document12 = textNode2.ownerDocument();
        boolean boolean14 = textNode2.hasAttr("");
        org.jsoup.nodes.Node node15 = textNode2.parent();
        org.junit.Assert.assertNotNull(textNode2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNull(node4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "#text" + "'", str5, "#text");
        org.junit.Assert.assertNull(node6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNull(document12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNull(node15);
    }

    @Test
    public void test20586() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20586");
        org.jsoup.nodes.Document.OutputSettings outputSettings0 = new org.jsoup.nodes.Document.OutputSettings();
        boolean boolean1 = outputSettings0.prettyPrint();
        org.jsoup.nodes.Document.OutputSettings outputSettings3 = outputSettings0.prettyPrint(false);
        org.jsoup.nodes.Document.OutputSettings outputSettings5 = outputSettings0.indentAmount((int) '#');
        org.jsoup.nodes.Entities.EscapeMode escapeMode6 = outputSettings0.escapeMode();
        org.jsoup.nodes.Document.OutputSettings outputSettings8 = outputSettings0.indentAmount((int) ' ');
        org.jsoup.nodes.Document.OutputSettings outputSettings10 = outputSettings8.indentAmount((int) (short) 0);
        org.jsoup.nodes.Document.OutputSettings outputSettings11 = new org.jsoup.nodes.Document.OutputSettings();
        boolean boolean12 = outputSettings11.prettyPrint();
        org.jsoup.nodes.Document.OutputSettings outputSettings13 = new org.jsoup.nodes.Document.OutputSettings();
        int int14 = outputSettings13.indentAmount();
        org.jsoup.nodes.Entities.EscapeMode escapeMode15 = outputSettings13.escapeMode();
        java.nio.charset.Charset charset16 = outputSettings13.charset();
        org.jsoup.nodes.Document.OutputSettings outputSettings17 = outputSettings11.charset(charset16);
        java.nio.charset.Charset charset18 = outputSettings11.charset();
        org.jsoup.nodes.Document.OutputSettings outputSettings19 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Document.OutputSettings outputSettings20 = outputSettings19.clone();
        org.jsoup.nodes.Document.OutputSettings outputSettings21 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Document.OutputSettings outputSettings22 = new org.jsoup.nodes.Document.OutputSettings();
        int int23 = outputSettings22.indentAmount();
        org.jsoup.nodes.Entities.EscapeMode escapeMode24 = outputSettings22.escapeMode();
        org.jsoup.nodes.Document.OutputSettings outputSettings25 = outputSettings21.escapeMode(escapeMode24);
        org.jsoup.nodes.Document.OutputSettings outputSettings26 = outputSettings19.escapeMode(escapeMode24);
        org.jsoup.nodes.Document.OutputSettings outputSettings27 = outputSettings11.escapeMode(escapeMode24);
        org.jsoup.nodes.Document.OutputSettings outputSettings28 = outputSettings8.escapeMode(escapeMode24);
        int int29 = outputSettings28.indentAmount();
        org.jsoup.nodes.Document.OutputSettings outputSettings30 = outputSettings28.clone();
        org.jsoup.nodes.Document.OutputSettings outputSettings31 = new org.jsoup.nodes.Document.OutputSettings();
        boolean boolean32 = outputSettings31.prettyPrint();
        org.jsoup.nodes.Document.OutputSettings outputSettings34 = outputSettings31.prettyPrint(false);
        org.jsoup.nodes.Document.OutputSettings outputSettings35 = new org.jsoup.nodes.Document.OutputSettings();
        boolean boolean36 = outputSettings35.prettyPrint();
        org.jsoup.nodes.Document.OutputSettings outputSettings37 = new org.jsoup.nodes.Document.OutputSettings();
        int int38 = outputSettings37.indentAmount();
        org.jsoup.nodes.Entities.EscapeMode escapeMode39 = outputSettings37.escapeMode();
        java.nio.charset.Charset charset40 = outputSettings37.charset();
        org.jsoup.nodes.Document.OutputSettings outputSettings41 = outputSettings35.charset(charset40);
        org.jsoup.nodes.Document.OutputSettings outputSettings42 = outputSettings34.charset(charset40);
        org.jsoup.nodes.Document.OutputSettings outputSettings44 = outputSettings42.prettyPrint(false);
        org.jsoup.nodes.Document.OutputSettings outputSettings46 = outputSettings44.indentAmount((int) (short) 1);
        org.jsoup.nodes.Document.OutputSettings outputSettings47 = outputSettings46.clone();
        org.jsoup.nodes.Document.OutputSettings outputSettings48 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Document.OutputSettings outputSettings49 = new org.jsoup.nodes.Document.OutputSettings();
        int int50 = outputSettings49.indentAmount();
        org.jsoup.nodes.Entities.EscapeMode escapeMode51 = outputSettings49.escapeMode();
        org.jsoup.nodes.Document.OutputSettings outputSettings52 = outputSettings48.escapeMode(escapeMode51);
        org.jsoup.nodes.Document.OutputSettings outputSettings54 = outputSettings48.indentAmount((int) (short) 100);
        org.jsoup.nodes.Document.OutputSettings outputSettings55 = new org.jsoup.nodes.Document.OutputSettings();
        boolean boolean56 = outputSettings55.prettyPrint();
        org.jsoup.nodes.Document.OutputSettings outputSettings58 = outputSettings55.prettyPrint(false);
        org.jsoup.nodes.Document.OutputSettings outputSettings59 = new org.jsoup.nodes.Document.OutputSettings();
        boolean boolean60 = outputSettings59.prettyPrint();
        org.jsoup.nodes.Document.OutputSettings outputSettings61 = new org.jsoup.nodes.Document.OutputSettings();
        int int62 = outputSettings61.indentAmount();
        org.jsoup.nodes.Entities.EscapeMode escapeMode63 = outputSettings61.escapeMode();
        java.nio.charset.Charset charset64 = outputSettings61.charset();
        org.jsoup.nodes.Document.OutputSettings outputSettings65 = outputSettings59.charset(charset64);
        org.jsoup.nodes.Document.OutputSettings outputSettings66 = outputSettings58.charset(charset64);
        org.jsoup.nodes.Document.OutputSettings outputSettings67 = outputSettings54.charset(charset64);
        boolean boolean68 = outputSettings67.prettyPrint();
        org.jsoup.nodes.Document.OutputSettings outputSettings69 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Entities.EscapeMode escapeMode70 = outputSettings69.escapeMode();
        org.jsoup.nodes.Document.OutputSettings outputSettings71 = outputSettings69.clone();
        org.jsoup.nodes.Document.OutputSettings outputSettings72 = new org.jsoup.nodes.Document.OutputSettings();
        int int73 = outputSettings72.indentAmount();
        org.jsoup.nodes.Entities.EscapeMode escapeMode74 = outputSettings72.escapeMode();
        java.nio.charset.Charset charset75 = outputSettings72.charset();
        org.jsoup.nodes.Document.OutputSettings outputSettings76 = outputSettings69.charset(charset75);
        org.jsoup.nodes.Document.OutputSettings outputSettings77 = outputSettings67.charset(charset75);
        org.jsoup.nodes.Document.OutputSettings outputSettings78 = outputSettings47.charset(charset75);
        org.jsoup.nodes.Document.OutputSettings outputSettings79 = outputSettings30.charset(charset75);
        int int80 = outputSettings79.indentAmount();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertNotNull(outputSettings3);
        org.junit.Assert.assertNotNull(outputSettings5);
        org.junit.Assert.assertTrue("'" + escapeMode6 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode6.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertNotNull(outputSettings8);
        org.junit.Assert.assertNotNull(outputSettings10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertTrue("'" + escapeMode15 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode15.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertNotNull(charset16);
        org.junit.Assert.assertNotNull(outputSettings17);
        org.junit.Assert.assertNotNull(charset18);
        org.junit.Assert.assertNotNull(outputSettings20);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 1 + "'", int23 == 1);
        org.junit.Assert.assertTrue("'" + escapeMode24 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode24.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertNotNull(outputSettings25);
        org.junit.Assert.assertNotNull(outputSettings26);
        org.junit.Assert.assertNotNull(outputSettings27);
        org.junit.Assert.assertNotNull(outputSettings28);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
        org.junit.Assert.assertNotNull(outputSettings30);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + true + "'", boolean32 == true);
        org.junit.Assert.assertNotNull(outputSettings34);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + true + "'", boolean36 == true);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 1 + "'", int38 == 1);
        org.junit.Assert.assertTrue("'" + escapeMode39 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode39.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertNotNull(charset40);
        org.junit.Assert.assertNotNull(outputSettings41);
        org.junit.Assert.assertNotNull(outputSettings42);
        org.junit.Assert.assertNotNull(outputSettings44);
        org.junit.Assert.assertNotNull(outputSettings46);
        org.junit.Assert.assertNotNull(outputSettings47);
        org.junit.Assert.assertTrue("'" + int50 + "' != '" + 1 + "'", int50 == 1);
        org.junit.Assert.assertTrue("'" + escapeMode51 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode51.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertNotNull(outputSettings52);
        org.junit.Assert.assertNotNull(outputSettings54);
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + true + "'", boolean56 == true);
        org.junit.Assert.assertNotNull(outputSettings58);
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + true + "'", boolean60 == true);
        org.junit.Assert.assertTrue("'" + int62 + "' != '" + 1 + "'", int62 == 1);
        org.junit.Assert.assertTrue("'" + escapeMode63 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode63.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertNotNull(charset64);
        org.junit.Assert.assertNotNull(outputSettings65);
        org.junit.Assert.assertNotNull(outputSettings66);
        org.junit.Assert.assertNotNull(outputSettings67);
        org.junit.Assert.assertTrue("'" + boolean68 + "' != '" + true + "'", boolean68 == true);
        org.junit.Assert.assertTrue("'" + escapeMode70 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode70.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertNotNull(outputSettings71);
        org.junit.Assert.assertTrue("'" + int73 + "' != '" + 1 + "'", int73 == 1);
        org.junit.Assert.assertTrue("'" + escapeMode74 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode74.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertNotNull(charset75);
        org.junit.Assert.assertNotNull(outputSettings76);
        org.junit.Assert.assertNotNull(outputSettings77);
        org.junit.Assert.assertNotNull(outputSettings78);
        org.junit.Assert.assertNotNull(outputSettings79);
        org.junit.Assert.assertTrue("'" + int80 + "' != '" + 0 + "'", int80 == 0);
    }

    @Test
    public void test20587() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20587");
        org.jsoup.nodes.Document.OutputSettings outputSettings0 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Entities.EscapeMode escapeMode1 = outputSettings0.escapeMode();
        boolean boolean2 = outputSettings0.prettyPrint();
        org.jsoup.nodes.Entities.EscapeMode escapeMode3 = outputSettings0.escapeMode();
        org.jsoup.nodes.Document.OutputSettings outputSettings4 = outputSettings0.clone();
        org.jsoup.nodes.Document.OutputSettings outputSettings5 = new org.jsoup.nodes.Document.OutputSettings();
        int int6 = outputSettings5.indentAmount();
        org.jsoup.nodes.Entities.EscapeMode escapeMode7 = outputSettings5.escapeMode();
        boolean boolean8 = outputSettings5.prettyPrint();
        org.jsoup.nodes.Document.OutputSettings outputSettings9 = new org.jsoup.nodes.Document.OutputSettings();
        boolean boolean10 = outputSettings9.prettyPrint();
        org.jsoup.nodes.Document.OutputSettings outputSettings12 = outputSettings9.prettyPrint(false);
        org.jsoup.nodes.Document.OutputSettings outputSettings14 = outputSettings9.indentAmount((int) '#');
        org.jsoup.nodes.Document.OutputSettings outputSettings15 = outputSettings9.clone();
        int int16 = outputSettings15.indentAmount();
        org.jsoup.nodes.Document.OutputSettings outputSettings18 = outputSettings15.indentAmount((int) (short) 0);
        org.jsoup.nodes.Document.OutputSettings outputSettings19 = new org.jsoup.nodes.Document.OutputSettings();
        boolean boolean20 = outputSettings19.prettyPrint();
        org.jsoup.nodes.Document.OutputSettings outputSettings22 = outputSettings19.prettyPrint(false);
        org.jsoup.nodes.Document.OutputSettings outputSettings24 = outputSettings22.prettyPrint(false);
        org.jsoup.nodes.Document.OutputSettings outputSettings25 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Entities.EscapeMode escapeMode26 = outputSettings25.escapeMode();
        java.nio.charset.Charset charset27 = outputSettings25.charset();
        org.jsoup.nodes.Document.OutputSettings outputSettings28 = outputSettings22.charset(charset27);
        org.jsoup.nodes.Entities.EscapeMode escapeMode29 = outputSettings28.escapeMode();
        org.jsoup.nodes.Document.OutputSettings outputSettings30 = outputSettings15.escapeMode(escapeMode29);
        org.jsoup.nodes.Document.OutputSettings outputSettings31 = outputSettings5.escapeMode(escapeMode29);
        org.jsoup.nodes.Document.OutputSettings outputSettings32 = outputSettings0.escapeMode(escapeMode29);
        org.jsoup.nodes.TextNode textNode35 = new org.jsoup.nodes.TextNode("#text", "#text");
        java.util.List<org.jsoup.nodes.Node> nodeList36 = textNode35.siblingNodes();
        int int37 = textNode35.childNodeSize();
        int int38 = textNode35.childNodeSize();
        textNode35.setBaseUri("#text");
        java.lang.String str41 = textNode35.baseUri();
        org.jsoup.nodes.Document.OutputSettings outputSettings42 = new org.jsoup.nodes.Document.OutputSettings();
        boolean boolean43 = outputSettings42.prettyPrint();
        org.jsoup.nodes.Document.OutputSettings outputSettings45 = outputSettings42.prettyPrint(false);
        org.jsoup.nodes.Document.OutputSettings outputSettings47 = outputSettings42.indentAmount((int) '#');
        org.jsoup.nodes.Entities.EscapeMode escapeMode48 = outputSettings47.escapeMode();
        org.jsoup.nodes.Document.OutputSettings outputSettings49 = outputSettings47.clone();
        org.jsoup.nodes.Document.OutputSettings outputSettings50 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Document.OutputSettings outputSettings51 = outputSettings50.clone();
        boolean boolean52 = outputSettings51.prettyPrint();
        org.jsoup.nodes.Document.OutputSettings outputSettings53 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Document.OutputSettings outputSettings54 = new org.jsoup.nodes.Document.OutputSettings();
        int int55 = outputSettings54.indentAmount();
        org.jsoup.nodes.Entities.EscapeMode escapeMode56 = outputSettings54.escapeMode();
        org.jsoup.nodes.Document.OutputSettings outputSettings57 = outputSettings53.escapeMode(escapeMode56);
        org.jsoup.nodes.Document.OutputSettings outputSettings58 = outputSettings51.escapeMode(escapeMode56);
        org.jsoup.nodes.Document.OutputSettings outputSettings60 = outputSettings58.indentAmount((int) 'a');
        org.jsoup.nodes.Document.OutputSettings outputSettings62 = outputSettings58.prettyPrint(false);
        org.jsoup.nodes.Document.OutputSettings outputSettings63 = new org.jsoup.nodes.Document.OutputSettings();
        boolean boolean64 = outputSettings63.prettyPrint();
        org.jsoup.nodes.Document.OutputSettings outputSettings66 = outputSettings63.prettyPrint(false);
        org.jsoup.nodes.Document.OutputSettings outputSettings67 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Entities.EscapeMode escapeMode68 = outputSettings67.escapeMode();
        org.jsoup.nodes.Document.OutputSettings outputSettings69 = outputSettings63.escapeMode(escapeMode68);
        org.jsoup.nodes.Document.OutputSettings outputSettings70 = outputSettings63.clone();
        org.jsoup.nodes.Document.OutputSettings outputSettings71 = new org.jsoup.nodes.Document.OutputSettings();
        boolean boolean72 = outputSettings71.prettyPrint();
        org.jsoup.nodes.Document.OutputSettings outputSettings74 = outputSettings71.prettyPrint(false);
        org.jsoup.nodes.Document.OutputSettings outputSettings76 = outputSettings71.indentAmount((int) '#');
        org.jsoup.nodes.Entities.EscapeMode escapeMode77 = outputSettings71.escapeMode();
        org.jsoup.nodes.Document.OutputSettings outputSettings78 = outputSettings63.escapeMode(escapeMode77);
        org.jsoup.nodes.Entities.EscapeMode escapeMode79 = outputSettings63.escapeMode();
        org.jsoup.nodes.Document.OutputSettings outputSettings80 = outputSettings58.escapeMode(escapeMode79);
        org.jsoup.nodes.Document.OutputSettings outputSettings81 = outputSettings47.escapeMode(escapeMode79);
        boolean boolean82 = textNode35.equals((java.lang.Object) escapeMode79);
        org.jsoup.nodes.Document.OutputSettings outputSettings83 = outputSettings32.escapeMode(escapeMode79);
        org.jsoup.nodes.Entities.EscapeMode escapeMode84 = outputSettings83.escapeMode();
        org.junit.Assert.assertTrue("'" + escapeMode1 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode1.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + escapeMode3 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode3.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertNotNull(outputSettings4);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + escapeMode7 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode7.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(outputSettings12);
        org.junit.Assert.assertNotNull(outputSettings14);
        org.junit.Assert.assertNotNull(outputSettings15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 35 + "'", int16 == 35);
        org.junit.Assert.assertNotNull(outputSettings18);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertNotNull(outputSettings22);
        org.junit.Assert.assertNotNull(outputSettings24);
        org.junit.Assert.assertTrue("'" + escapeMode26 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode26.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertNotNull(charset27);
        org.junit.Assert.assertNotNull(outputSettings28);
        org.junit.Assert.assertTrue("'" + escapeMode29 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode29.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertNotNull(outputSettings30);
        org.junit.Assert.assertNotNull(outputSettings31);
        org.junit.Assert.assertNotNull(outputSettings32);
        org.junit.Assert.assertNotNull(nodeList36);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 0 + "'", int37 == 0);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 0 + "'", int38 == 0);
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "#text" + "'", str41, "#text");
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + true + "'", boolean43 == true);
        org.junit.Assert.assertNotNull(outputSettings45);
        org.junit.Assert.assertNotNull(outputSettings47);
        org.junit.Assert.assertTrue("'" + escapeMode48 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode48.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertNotNull(outputSettings49);
        org.junit.Assert.assertNotNull(outputSettings51);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + true + "'", boolean52 == true);
        org.junit.Assert.assertTrue("'" + int55 + "' != '" + 1 + "'", int55 == 1);
        org.junit.Assert.assertTrue("'" + escapeMode56 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode56.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertNotNull(outputSettings57);
        org.junit.Assert.assertNotNull(outputSettings58);
        org.junit.Assert.assertNotNull(outputSettings60);
        org.junit.Assert.assertNotNull(outputSettings62);
        org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + true + "'", boolean64 == true);
        org.junit.Assert.assertNotNull(outputSettings66);
        org.junit.Assert.assertTrue("'" + escapeMode68 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode68.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertNotNull(outputSettings69);
        org.junit.Assert.assertNotNull(outputSettings70);
        org.junit.Assert.assertTrue("'" + boolean72 + "' != '" + true + "'", boolean72 == true);
        org.junit.Assert.assertNotNull(outputSettings74);
        org.junit.Assert.assertNotNull(outputSettings76);
        org.junit.Assert.assertTrue("'" + escapeMode77 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode77.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertNotNull(outputSettings78);
        org.junit.Assert.assertTrue("'" + escapeMode79 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode79.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertNotNull(outputSettings80);
        org.junit.Assert.assertNotNull(outputSettings81);
        org.junit.Assert.assertTrue("'" + boolean82 + "' != '" + false + "'", boolean82 == false);
        org.junit.Assert.assertNotNull(outputSettings83);
        org.junit.Assert.assertTrue("'" + escapeMode84 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode84.equals(org.jsoup.nodes.Entities.EscapeMode.base));
    }

    @Test
    public void test20588() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20588");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("", "#text");
        java.lang.String str3 = textNode2.baseUri();
        org.jsoup.nodes.Node node4 = textNode2.parent();
        org.jsoup.nodes.TextNode textNode6 = textNode2.text("hi!");
        org.jsoup.nodes.Node node9 = textNode2.attr("hi!", "#");
        org.jsoup.nodes.Node node10 = textNode2.clone();
        java.lang.String str12 = textNode2.attr("text");
        org.jsoup.nodes.Node node13 = textNode2.parent();
        java.lang.String str15 = textNode2.attr("h");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "#text" + "'", str3, "#text");
        org.junit.Assert.assertNull(node4);
        org.junit.Assert.assertNotNull(textNode6);
        org.junit.Assert.assertNotNull(node9);
        org.junit.Assert.assertNotNull(node10);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertNull(node13);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
    }

    @Test
    public void test20589() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20589");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("hi!", "hi!");
        org.jsoup.nodes.TextNode textNode5 = org.jsoup.nodes.TextNode.createFromEncoded("", "");
        boolean boolean6 = textNode5.isBlank();
        org.jsoup.nodes.Node node7 = textNode5.previousSibling();
        java.lang.String str8 = textNode5.nodeName();
        org.jsoup.nodes.Node node9 = textNode5.nextSibling();
        boolean boolean10 = textNode5.isBlank();
        java.util.List<org.jsoup.nodes.Node> nodeList11 = textNode5.childNodesCopy();
        org.jsoup.nodes.Attributes attributes12 = textNode5.attributes();
        boolean boolean13 = textNode2.equals((java.lang.Object) textNode5);
        boolean boolean14 = textNode5.isBlank();
        org.jsoup.nodes.Node node15 = textNode5.parent();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node16 = node15.clone();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(textNode5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNull(node7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "#text" + "'", str8, "#text");
        org.junit.Assert.assertNull(node9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(nodeList11);
        org.junit.Assert.assertNotNull(attributes12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNull(node15);
    }

    @Test
    public void test20590() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20590");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("", "");
        boolean boolean3 = textNode2.isBlank();
        org.jsoup.nodes.Node node4 = textNode2.previousSibling();
        java.lang.String str5 = textNode2.nodeName();
        boolean boolean6 = textNode2.isBlank();
        org.jsoup.nodes.Node node7 = textNode2.clone();
        java.lang.String str8 = textNode2.getWholeText();
        int int9 = textNode2.siblingIndex();
        java.lang.String str10 = textNode2.getWholeText();
        java.lang.String str12 = textNode2.attr("text");
        org.jsoup.nodes.Document document13 = textNode2.ownerDocument();
        org.junit.Assert.assertNotNull(textNode2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNull(node4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "#text" + "'", str5, "#text");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(node7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertNull(document13);
    }

    @Test
    public void test20591() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20591");
        org.jsoup.nodes.Document.OutputSettings outputSettings0 = new org.jsoup.nodes.Document.OutputSettings();
        boolean boolean1 = outputSettings0.prettyPrint();
        org.jsoup.nodes.Document.OutputSettings outputSettings3 = outputSettings0.prettyPrint(false);
        org.jsoup.nodes.Document.OutputSettings outputSettings4 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Entities.EscapeMode escapeMode5 = outputSettings4.escapeMode();
        org.jsoup.nodes.Document.OutputSettings outputSettings6 = outputSettings0.escapeMode(escapeMode5);
        org.jsoup.nodes.Document.OutputSettings outputSettings8 = outputSettings0.indentAmount((int) '4');
        org.jsoup.nodes.Entities.EscapeMode escapeMode9 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings10 = outputSettings8.escapeMode(escapeMode9);
        int int11 = outputSettings10.indentAmount();
        org.jsoup.nodes.Document.OutputSettings outputSettings13 = outputSettings10.indentAmount(52);
        java.nio.charset.Charset charset14 = outputSettings10.charset();
        boolean boolean15 = outputSettings10.prettyPrint();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertNotNull(outputSettings3);
        org.junit.Assert.assertTrue("'" + escapeMode5 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode5.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertNotNull(outputSettings6);
        org.junit.Assert.assertNotNull(outputSettings8);
        org.junit.Assert.assertNotNull(outputSettings10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 52 + "'", int11 == 52);
        org.junit.Assert.assertNotNull(outputSettings13);
        org.junit.Assert.assertNotNull(charset14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test20592() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20592");
        org.jsoup.nodes.Document.OutputSettings outputSettings0 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Document.OutputSettings outputSettings1 = new org.jsoup.nodes.Document.OutputSettings();
        int int2 = outputSettings1.indentAmount();
        org.jsoup.nodes.Entities.EscapeMode escapeMode3 = outputSettings1.escapeMode();
        org.jsoup.nodes.Document.OutputSettings outputSettings4 = outputSettings0.escapeMode(escapeMode3);
        org.jsoup.nodes.Document.OutputSettings outputSettings6 = outputSettings0.indentAmount((int) (short) 100);
        org.jsoup.nodes.Entities.EscapeMode escapeMode7 = outputSettings0.escapeMode();
        org.jsoup.nodes.Document.OutputSettings outputSettings9 = outputSettings0.prettyPrint(true);
        org.jsoup.nodes.Document.OutputSettings outputSettings11 = outputSettings9.indentAmount(0);
        int int12 = outputSettings11.indentAmount();
        org.jsoup.nodes.Document.OutputSettings outputSettings14 = outputSettings11.prettyPrint(true);
        int int15 = outputSettings11.indentAmount();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
        org.junit.Assert.assertTrue("'" + escapeMode3 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode3.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertNotNull(outputSettings4);
        org.junit.Assert.assertNotNull(outputSettings6);
        org.junit.Assert.assertTrue("'" + escapeMode7 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode7.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertNotNull(outputSettings9);
        org.junit.Assert.assertNotNull(outputSettings11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNotNull(outputSettings14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
    }

    @Test
    public void test20593() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20593");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("", "");
        boolean boolean3 = textNode2.isBlank();
        org.jsoup.nodes.Node node4 = textNode2.previousSibling();
        java.lang.String str5 = textNode2.nodeName();
        org.jsoup.nodes.Node node6 = textNode2.nextSibling();
        boolean boolean7 = textNode2.isBlank();
        java.util.List<org.jsoup.nodes.Node> nodeList8 = textNode2.childNodesCopy();
        java.util.List<org.jsoup.nodes.Node> nodeList9 = textNode2.childNodesCopy();
        org.jsoup.nodes.TextNode textNode11 = textNode2.text("hi!");
        boolean boolean13 = textNode2.hasAttr("i!");
        int int14 = textNode2.childNodeSize();
        java.lang.String str15 = textNode2.baseUri();
        boolean boolean16 = textNode2.isBlank();
        org.jsoup.nodes.Node node18 = textNode2.removeAttr("hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList19 = textNode2.childNodes();
        // The following exception was thrown during execution in test generation
        try {
            textNode2.remove();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(textNode2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNull(node4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "#text" + "'", str5, "#text");
        org.junit.Assert.assertNull(node6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(nodeList8);
        org.junit.Assert.assertNotNull(nodeList9);
        org.junit.Assert.assertNotNull(textNode11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(node18);
        org.junit.Assert.assertNotNull(nodeList19);
    }

    @Test
    public void test20594() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20594");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("hi!", "hi!");
        java.lang.String str4 = textNode2.absUrl("hi!");
        boolean boolean6 = textNode2.equals((java.lang.Object) (byte) -1);
        org.jsoup.nodes.Node node7 = textNode2.parent();
        java.lang.String str9 = textNode2.attr("i!");
        int int10 = textNode2.childNodeSize();
        org.jsoup.nodes.TextNode textNode12 = textNode2.text("hi!");
        org.jsoup.nodes.Attributes attributes13 = textNode2.attributes();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(node7);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNotNull(textNode12);
        org.junit.Assert.assertNotNull(attributes13);
    }

    @Test
    public void test20595() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20595");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("", "hi!");
        java.lang.String str3 = textNode2.getWholeText();
        org.jsoup.nodes.Attributes attributes4 = textNode2.attributes();
        org.jsoup.nodes.TextNode textNode7 = org.jsoup.nodes.TextNode.createFromEncoded("", "");
        boolean boolean8 = textNode7.isBlank();
        org.jsoup.nodes.Node node9 = textNode7.previousSibling();
        org.jsoup.nodes.Node node12 = textNode7.attr("hi!", "");
        java.lang.String str13 = textNode7.baseUri();
        java.lang.String str14 = textNode7.outerHtml();
        org.jsoup.nodes.TextNode textNode16 = textNode7.text("#text");
        int int17 = textNode16.childNodeSize();
        org.jsoup.nodes.TextNode textNode19 = textNode16.text("hi!");
        org.jsoup.nodes.Node node20 = textNode16.previousSibling();
        boolean boolean21 = textNode2.equals((java.lang.Object) textNode16);
        org.jsoup.nodes.Node node22 = textNode2.clone();
        org.jsoup.nodes.TextNode textNode25 = new org.jsoup.nodes.TextNode("", "hi!");
        org.jsoup.nodes.Document document26 = textNode25.ownerDocument();
        java.lang.String str28 = textNode25.attr("i!");
        java.lang.String str29 = textNode25.baseUri();
        java.lang.String str30 = textNode25.outerHtml();
        // The following exception was thrown during execution in test generation
        try {
            textNode2.replaceWith((org.jsoup.nodes.Node) textNode25);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertNotNull(attributes4);
        org.junit.Assert.assertNotNull(textNode7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNull(node9);
        org.junit.Assert.assertNotNull(node12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertNotNull(textNode16);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertNotNull(textNode19);
        org.junit.Assert.assertNull(node20);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(node22);
        org.junit.Assert.assertNull(document26);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "" + "'", str28, "");
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "hi!" + "'", str29, "hi!");
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "" + "'", str30, "");
    }

    @Test
    public void test20596() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20596");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("", "");
        boolean boolean3 = textNode2.isBlank();
        org.jsoup.nodes.Node node4 = textNode2.previousSibling();
        java.lang.String str5 = textNode2.nodeName();
        org.jsoup.nodes.Node node6 = textNode2.nextSibling();
        boolean boolean7 = textNode2.isBlank();
        org.jsoup.nodes.Node node8 = textNode2.clone();
        java.util.List<org.jsoup.nodes.Node> nodeList9 = textNode2.childNodesCopy();
        java.util.List<org.jsoup.nodes.Node> nodeList10 = textNode2.childNodesCopy();
        java.lang.String str11 = textNode2.baseUri();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node13 = textNode2.childNode((int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 35");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(textNode2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNull(node4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "#text" + "'", str5, "#text");
        org.junit.Assert.assertNull(node6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(node8);
        org.junit.Assert.assertNotNull(nodeList9);
        org.junit.Assert.assertNotNull(nodeList10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
    }

    @Test
    public void test20597() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20597");
        org.jsoup.nodes.Document.OutputSettings outputSettings0 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Document.OutputSettings outputSettings1 = new org.jsoup.nodes.Document.OutputSettings();
        int int2 = outputSettings1.indentAmount();
        org.jsoup.nodes.Entities.EscapeMode escapeMode3 = outputSettings1.escapeMode();
        org.jsoup.nodes.Document.OutputSettings outputSettings4 = outputSettings0.escapeMode(escapeMode3);
        org.jsoup.nodes.Document.OutputSettings outputSettings6 = outputSettings0.indentAmount((int) (short) 100);
        org.jsoup.nodes.Entities.EscapeMode escapeMode7 = outputSettings0.escapeMode();
        org.jsoup.nodes.Document.OutputSettings outputSettings9 = outputSettings0.prettyPrint(true);
        boolean boolean10 = outputSettings0.prettyPrint();
        org.jsoup.nodes.Document.OutputSettings outputSettings12 = outputSettings0.indentAmount(0);
        org.jsoup.nodes.Document.OutputSettings outputSettings13 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Entities.EscapeMode escapeMode14 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings15 = outputSettings13.escapeMode(escapeMode14);
        boolean boolean16 = outputSettings13.prettyPrint();
        org.jsoup.nodes.Document.OutputSettings outputSettings17 = new org.jsoup.nodes.Document.OutputSettings();
        int int18 = outputSettings17.indentAmount();
        org.jsoup.nodes.Entities.EscapeMode escapeMode19 = outputSettings17.escapeMode();
        org.jsoup.nodes.Document.OutputSettings outputSettings20 = outputSettings13.escapeMode(escapeMode19);
        boolean boolean21 = outputSettings20.prettyPrint();
        org.jsoup.nodes.Document.OutputSettings outputSettings23 = outputSettings20.indentAmount((int) '#');
        org.jsoup.nodes.Document.OutputSettings outputSettings24 = new org.jsoup.nodes.Document.OutputSettings();
        boolean boolean25 = outputSettings24.prettyPrint();
        org.jsoup.nodes.Document.OutputSettings outputSettings27 = outputSettings24.prettyPrint(false);
        org.jsoup.nodes.Document.OutputSettings outputSettings29 = outputSettings24.indentAmount((int) '#');
        org.jsoup.nodes.Entities.EscapeMode escapeMode30 = outputSettings24.escapeMode();
        org.jsoup.nodes.Document.OutputSettings outputSettings31 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Entities.EscapeMode escapeMode32 = outputSettings31.escapeMode();
        org.jsoup.nodes.Document.OutputSettings outputSettings33 = outputSettings31.clone();
        org.jsoup.nodes.Document.OutputSettings outputSettings34 = new org.jsoup.nodes.Document.OutputSettings();
        int int35 = outputSettings34.indentAmount();
        org.jsoup.nodes.Entities.EscapeMode escapeMode36 = outputSettings34.escapeMode();
        java.nio.charset.Charset charset37 = outputSettings34.charset();
        org.jsoup.nodes.Document.OutputSettings outputSettings38 = outputSettings31.charset(charset37);
        org.jsoup.nodes.Document.OutputSettings outputSettings39 = outputSettings24.charset(charset37);
        org.jsoup.nodes.Document.OutputSettings outputSettings40 = outputSettings23.charset(charset37);
        org.jsoup.nodes.Document.OutputSettings outputSettings41 = outputSettings23.clone();
        org.jsoup.nodes.Entities.EscapeMode escapeMode42 = outputSettings23.escapeMode();
        org.jsoup.nodes.Document.OutputSettings outputSettings43 = outputSettings23.clone();
        org.jsoup.nodes.Document.OutputSettings outputSettings44 = outputSettings43.clone();
        org.jsoup.nodes.Entities.EscapeMode escapeMode45 = outputSettings43.escapeMode();
        org.jsoup.nodes.Document.OutputSettings outputSettings46 = outputSettings0.escapeMode(escapeMode45);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
        org.junit.Assert.assertTrue("'" + escapeMode3 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode3.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertNotNull(outputSettings4);
        org.junit.Assert.assertNotNull(outputSettings6);
        org.junit.Assert.assertTrue("'" + escapeMode7 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode7.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertNotNull(outputSettings9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(outputSettings12);
        org.junit.Assert.assertNotNull(outputSettings15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + escapeMode19 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode19.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertNotNull(outputSettings20);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertNotNull(outputSettings23);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertNotNull(outputSettings27);
        org.junit.Assert.assertNotNull(outputSettings29);
        org.junit.Assert.assertTrue("'" + escapeMode30 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode30.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertTrue("'" + escapeMode32 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode32.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertNotNull(outputSettings33);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 1 + "'", int35 == 1);
        org.junit.Assert.assertTrue("'" + escapeMode36 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode36.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertNotNull(charset37);
        org.junit.Assert.assertNotNull(outputSettings38);
        org.junit.Assert.assertNotNull(outputSettings39);
        org.junit.Assert.assertNotNull(outputSettings40);
        org.junit.Assert.assertNotNull(outputSettings41);
        org.junit.Assert.assertTrue("'" + escapeMode42 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode42.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertNotNull(outputSettings43);
        org.junit.Assert.assertNotNull(outputSettings44);
        org.junit.Assert.assertTrue("'" + escapeMode45 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode45.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertNotNull(outputSettings46);
    }

    @Test
    public void test20598() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20598");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("", "");
        boolean boolean3 = textNode2.isBlank();
        org.jsoup.nodes.Node node4 = textNode2.previousSibling();
        java.lang.String str5 = textNode2.nodeName();
        boolean boolean6 = textNode2.isBlank();
        boolean boolean8 = textNode2.hasAttr("");
        java.lang.String str10 = textNode2.absUrl("hi!");
        org.jsoup.nodes.Document document11 = textNode2.ownerDocument();
        boolean boolean13 = textNode2.hasAttr("!");
        org.junit.Assert.assertNotNull(textNode2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNull(node4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "#text" + "'", str5, "#text");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNull(document11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test20599() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20599");
        org.jsoup.nodes.Document.OutputSettings outputSettings0 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Document.OutputSettings outputSettings1 = outputSettings0.clone();
        org.jsoup.nodes.Document.OutputSettings outputSettings3 = outputSettings0.prettyPrint(true);
        org.jsoup.nodes.Document.OutputSettings outputSettings4 = outputSettings3.clone();
        org.jsoup.nodes.Document.OutputSettings outputSettings6 = outputSettings3.prettyPrint(false);
        org.jsoup.nodes.Document.OutputSettings outputSettings7 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Document.OutputSettings outputSettings8 = new org.jsoup.nodes.Document.OutputSettings();
        int int9 = outputSettings8.indentAmount();
        org.jsoup.nodes.Entities.EscapeMode escapeMode10 = outputSettings8.escapeMode();
        org.jsoup.nodes.Document.OutputSettings outputSettings11 = outputSettings7.escapeMode(escapeMode10);
        org.jsoup.nodes.Document.OutputSettings outputSettings13 = outputSettings7.indentAmount((int) (short) 100);
        org.jsoup.nodes.Document.OutputSettings outputSettings15 = outputSettings13.prettyPrint(false);
        org.jsoup.nodes.Document.OutputSettings outputSettings16 = outputSettings15.clone();
        org.jsoup.nodes.Entities.EscapeMode escapeMode17 = outputSettings16.escapeMode();
        org.jsoup.nodes.Document.OutputSettings outputSettings18 = outputSettings3.escapeMode(escapeMode17);
        java.nio.charset.Charset charset19 = outputSettings18.charset();
        org.jsoup.nodes.Entities.EscapeMode escapeMode20 = outputSettings18.escapeMode();
        java.nio.charset.Charset charset21 = outputSettings18.charset();
        org.jsoup.nodes.Document.OutputSettings outputSettings22 = new org.jsoup.nodes.Document.OutputSettings();
        boolean boolean23 = outputSettings22.prettyPrint();
        org.jsoup.nodes.Document.OutputSettings outputSettings25 = outputSettings22.prettyPrint(false);
        org.jsoup.nodes.Document.OutputSettings outputSettings27 = outputSettings22.indentAmount((int) '#');
        org.jsoup.nodes.Entities.EscapeMode escapeMode28 = outputSettings22.escapeMode();
        org.jsoup.nodes.Document.OutputSettings outputSettings30 = outputSettings22.indentAmount((int) 'a');
        int int31 = outputSettings22.indentAmount();
        org.jsoup.nodes.Document.OutputSettings outputSettings32 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Document.OutputSettings outputSettings33 = outputSettings32.clone();
        org.jsoup.nodes.Document.OutputSettings outputSettings35 = outputSettings32.prettyPrint(true);
        org.jsoup.nodes.Document.OutputSettings outputSettings37 = outputSettings32.indentAmount(0);
        org.jsoup.nodes.Document.OutputSettings outputSettings39 = outputSettings32.prettyPrint(true);
        org.jsoup.nodes.Document.OutputSettings outputSettings40 = outputSettings39.clone();
        java.nio.charset.Charset charset41 = outputSettings40.charset();
        org.jsoup.nodes.Document.OutputSettings outputSettings42 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Entities.EscapeMode escapeMode43 = outputSettings42.escapeMode();
        boolean boolean44 = outputSettings42.prettyPrint();
        org.jsoup.nodes.Document.OutputSettings outputSettings45 = outputSettings42.clone();
        org.jsoup.nodes.Document.OutputSettings outputSettings46 = new org.jsoup.nodes.Document.OutputSettings();
        boolean boolean47 = outputSettings46.prettyPrint();
        org.jsoup.nodes.Document.OutputSettings outputSettings49 = outputSettings46.prettyPrint(false);
        org.jsoup.nodes.Document.OutputSettings outputSettings51 = outputSettings49.prettyPrint(false);
        org.jsoup.nodes.Document.OutputSettings outputSettings52 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Entities.EscapeMode escapeMode53 = outputSettings52.escapeMode();
        java.nio.charset.Charset charset54 = outputSettings52.charset();
        org.jsoup.nodes.Document.OutputSettings outputSettings55 = outputSettings49.charset(charset54);
        org.jsoup.nodes.Document.OutputSettings outputSettings56 = outputSettings42.charset(charset54);
        org.jsoup.nodes.Document.OutputSettings outputSettings58 = outputSettings42.prettyPrint(false);
        org.jsoup.nodes.Document.OutputSettings outputSettings59 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Entities.EscapeMode escapeMode60 = outputSettings59.escapeMode();
        org.jsoup.nodes.Document.OutputSettings outputSettings61 = outputSettings58.escapeMode(escapeMode60);
        org.jsoup.nodes.Document.OutputSettings outputSettings62 = outputSettings58.clone();
        org.jsoup.nodes.Entities.EscapeMode escapeMode63 = outputSettings58.escapeMode();
        org.jsoup.nodes.Document.OutputSettings outputSettings64 = outputSettings40.escapeMode(escapeMode63);
        org.jsoup.nodes.Document.OutputSettings outputSettings65 = outputSettings22.escapeMode(escapeMode63);
        org.jsoup.nodes.Document.OutputSettings outputSettings66 = outputSettings18.escapeMode(escapeMode63);
        org.jsoup.nodes.Document.OutputSettings outputSettings68 = outputSettings18.indentAmount(0);
        org.jsoup.nodes.Document.OutputSettings outputSettings70 = outputSettings18.prettyPrint(false);
        org.junit.Assert.assertNotNull(outputSettings1);
        org.junit.Assert.assertNotNull(outputSettings3);
        org.junit.Assert.assertNotNull(outputSettings4);
        org.junit.Assert.assertNotNull(outputSettings6);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + escapeMode10 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode10.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertNotNull(outputSettings11);
        org.junit.Assert.assertNotNull(outputSettings13);
        org.junit.Assert.assertNotNull(outputSettings15);
        org.junit.Assert.assertNotNull(outputSettings16);
        org.junit.Assert.assertTrue("'" + escapeMode17 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode17.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertNotNull(outputSettings18);
        org.junit.Assert.assertNotNull(charset19);
        org.junit.Assert.assertTrue("'" + escapeMode20 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode20.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertNotNull(charset21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertNotNull(outputSettings25);
        org.junit.Assert.assertNotNull(outputSettings27);
        org.junit.Assert.assertTrue("'" + escapeMode28 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode28.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertNotNull(outputSettings30);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 97 + "'", int31 == 97);
        org.junit.Assert.assertNotNull(outputSettings33);
        org.junit.Assert.assertNotNull(outputSettings35);
        org.junit.Assert.assertNotNull(outputSettings37);
        org.junit.Assert.assertNotNull(outputSettings39);
        org.junit.Assert.assertNotNull(outputSettings40);
        org.junit.Assert.assertNotNull(charset41);
        org.junit.Assert.assertTrue("'" + escapeMode43 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode43.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + true + "'", boolean44 == true);
        org.junit.Assert.assertNotNull(outputSettings45);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + true + "'", boolean47 == true);
        org.junit.Assert.assertNotNull(outputSettings49);
        org.junit.Assert.assertNotNull(outputSettings51);
        org.junit.Assert.assertTrue("'" + escapeMode53 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode53.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertNotNull(charset54);
        org.junit.Assert.assertNotNull(outputSettings55);
        org.junit.Assert.assertNotNull(outputSettings56);
        org.junit.Assert.assertNotNull(outputSettings58);
        org.junit.Assert.assertTrue("'" + escapeMode60 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode60.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertNotNull(outputSettings61);
        org.junit.Assert.assertNotNull(outputSettings62);
        org.junit.Assert.assertTrue("'" + escapeMode63 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode63.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertNotNull(outputSettings64);
        org.junit.Assert.assertNotNull(outputSettings65);
        org.junit.Assert.assertNotNull(outputSettings66);
        org.junit.Assert.assertNotNull(outputSettings68);
        org.junit.Assert.assertNotNull(outputSettings70);
    }

    @Test
    public void test20600() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20600");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("", "");
        boolean boolean3 = textNode2.isBlank();
        org.jsoup.nodes.Node node4 = textNode2.previousSibling();
        java.lang.String str5 = textNode2.nodeName();
        org.jsoup.nodes.Node node6 = textNode2.nextSibling();
        boolean boolean7 = textNode2.isBlank();
        java.lang.String str8 = textNode2.baseUri();
        textNode2.setBaseUri("");
        int int11 = textNode2.siblingIndex();
        org.jsoup.nodes.Node node12 = textNode2.clone();
        org.jsoup.nodes.Node node13 = textNode2.nextSibling();
        boolean boolean15 = textNode2.hasAttr("");
        java.lang.String str17 = textNode2.attr("");
        java.util.List<org.jsoup.nodes.Node> nodeList18 = textNode2.childNodes();
        java.lang.String str19 = textNode2.getWholeText();
        java.lang.String str20 = textNode2.text();
        java.lang.String str22 = textNode2.absUrl("i");
        org.junit.Assert.assertNotNull(textNode2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNull(node4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "#text" + "'", str5, "#text");
        org.junit.Assert.assertNull(node6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNotNull(node12);
        org.junit.Assert.assertNull(node13);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertNotNull(nodeList18);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
    }

    @Test
    public void test20601() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20601");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("h", "#text");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.TextNode textNode4 = textNode2.splitText((int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Split offset must not be greater than current text length");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test20602() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20602");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("#text", "hi!");
        int int3 = textNode2.childNodeSize();
        org.jsoup.nodes.Node node4 = textNode2.clone();
        org.jsoup.nodes.Node node5 = textNode2.clone();
        org.jsoup.nodes.TextNode textNode7 = textNode2.text("#text");
        org.jsoup.nodes.Node node8 = textNode7.parent();
        boolean boolean10 = textNode7.hasAttr("");
        java.lang.String str11 = textNode7.toString();
        java.lang.String str12 = textNode7.baseUri();
        java.lang.String str13 = textNode7.toString();
        java.lang.String str15 = textNode7.attr("");
        org.junit.Assert.assertNotNull(textNode2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(node4);
        org.junit.Assert.assertNotNull(node5);
        org.junit.Assert.assertNotNull(textNode7);
        org.junit.Assert.assertNull(node8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "#text" + "'", str11, "#text");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "#text" + "'", str13, "#text");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
    }

    @Test
    public void test20603() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20603");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("", "i!");
        java.lang.String str4 = textNode2.absUrl("#text");
        java.util.List<org.jsoup.nodes.Node> nodeList5 = textNode2.childNodesCopy();
        org.jsoup.nodes.TextNode textNode7 = textNode2.text("i!");
        int int8 = textNode2.siblingIndex();
        java.util.List<org.jsoup.nodes.Node> nodeList9 = textNode2.childNodes();
        org.junit.Assert.assertNotNull(textNode2);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(nodeList5);
        org.junit.Assert.assertNotNull(textNode7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(nodeList9);
    }

    @Test
    public void test20604() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20604");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("", "");
        boolean boolean3 = textNode2.isBlank();
        org.jsoup.nodes.Node node4 = textNode2.previousSibling();
        org.jsoup.nodes.Node node7 = textNode2.attr("hi!", "");
        java.lang.String str8 = textNode2.baseUri();
        java.lang.String str9 = textNode2.outerHtml();
        java.util.List<org.jsoup.nodes.Node> nodeList10 = textNode2.childNodesCopy();
        java.lang.String str11 = textNode2.baseUri();
        org.jsoup.nodes.Node node12 = textNode2.nextSibling();
        org.jsoup.nodes.TextNode textNode14 = textNode2.text("");
        java.lang.String str15 = textNode14.toString();
        java.lang.String str16 = textNode14.text();
        org.jsoup.nodes.Node node17 = textNode14.parent();
        java.lang.String str19 = textNode14.absUrl("hi!");
        org.jsoup.nodes.Node node22 = textNode14.attr("hi!", "#");
        org.jsoup.nodes.Node node25 = textNode14.attr("text", "i");
        java.util.List<org.jsoup.nodes.Node> nodeList26 = node25.childNodes();
        org.junit.Assert.assertNotNull(textNode2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNull(node4);
        org.junit.Assert.assertNotNull(node7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNotNull(nodeList10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNull(node12);
        org.junit.Assert.assertNotNull(textNode14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertNull(node17);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertNotNull(node22);
        org.junit.Assert.assertNotNull(node25);
        org.junit.Assert.assertNotNull(nodeList26);
    }

    @Test
    public void test20605() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20605");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("hi!", "#text");
        java.lang.String str3 = textNode2.nodeName();
        org.jsoup.nodes.Node node5 = textNode2.removeAttr("#");
        org.jsoup.nodes.Node node8 = textNode2.attr("i!", "i!");
        org.jsoup.nodes.Attributes attributes9 = textNode2.attributes();
        org.jsoup.select.NodeVisitor nodeVisitor10 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node11 = textNode2.traverse(nodeVisitor10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "#text" + "'", str3, "#text");
        org.junit.Assert.assertNotNull(node5);
        org.junit.Assert.assertNotNull(node8);
        org.junit.Assert.assertNotNull(attributes9);
    }

    @Test
    public void test20606() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20606");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("", "");
        boolean boolean3 = textNode2.isBlank();
        org.jsoup.nodes.Node node4 = textNode2.previousSibling();
        java.lang.String str5 = textNode2.nodeName();
        org.jsoup.nodes.Node node6 = textNode2.nextSibling();
        boolean boolean7 = textNode2.isBlank();
        java.lang.String str8 = textNode2.baseUri();
        textNode2.setBaseUri("");
        int int11 = textNode2.siblingIndex();
        org.jsoup.nodes.Node node12 = textNode2.clone();
        int int13 = textNode2.childNodeSize();
        int int14 = textNode2.siblingIndex();
        boolean boolean16 = textNode2.hasAttr("!");
        org.junit.Assert.assertNotNull(textNode2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNull(node4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "#text" + "'", str5, "#text");
        org.junit.Assert.assertNull(node6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNotNull(node12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test20607() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20607");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("hi!", "hi!");
        org.jsoup.nodes.Node node3 = textNode2.parent();
        java.lang.String str4 = textNode2.outerHtml();
        org.jsoup.nodes.Node node5 = textNode2.previousSibling();
        org.jsoup.nodes.TextNode textNode8 = org.jsoup.nodes.TextNode.createFromEncoded("#text", "hi!");
        int int9 = textNode8.childNodeSize();
        boolean boolean10 = textNode2.equals((java.lang.Object) int9);
        java.util.List<org.jsoup.nodes.Node> nodeList11 = textNode2.childNodes();
        org.jsoup.nodes.TextNode textNode13 = textNode2.text("#");
        java.util.List<org.jsoup.nodes.Node> nodeList14 = textNode13.childNodesCopy();
        org.jsoup.nodes.TextNode textNode17 = new org.jsoup.nodes.TextNode("hi!", "hi!");
        java.lang.String str19 = textNode17.absUrl("hi!");
        boolean boolean21 = textNode17.equals((java.lang.Object) (byte) -1);
        java.util.List<org.jsoup.nodes.Node> nodeList22 = textNode17.childNodes();
        java.lang.String str24 = textNode17.attr("");
        java.util.List<org.jsoup.nodes.Node> nodeList25 = textNode17.childNodes();
        java.util.List<org.jsoup.nodes.Node> nodeList26 = textNode17.childNodes();
        java.lang.String str28 = textNode17.absUrl("#");
        // The following exception was thrown during execution in test generation
        try {
            textNode13.replaceWith((org.jsoup.nodes.Node) textNode17);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(textNode2);
        org.junit.Assert.assertNull(node3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertNotNull(textNode8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(nodeList11);
        org.junit.Assert.assertNotNull(textNode13);
        org.junit.Assert.assertNotNull(nodeList14);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(nodeList22);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "" + "'", str24, "");
        org.junit.Assert.assertNotNull(nodeList25);
        org.junit.Assert.assertNotNull(nodeList26);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "" + "'", str28, "");
    }

    @Test
    public void test20608() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20608");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("", "");
        boolean boolean3 = textNode2.isBlank();
        boolean boolean4 = textNode2.isBlank();
        java.util.List<org.jsoup.nodes.Node> nodeList5 = textNode2.childNodes();
        java.lang.String str6 = textNode2.baseUri();
        int int7 = textNode2.childNodeSize();
        boolean boolean9 = textNode2.hasAttr("");
        java.lang.String str10 = textNode2.toString();
        org.jsoup.nodes.Node node11 = textNode2.previousSibling();
        java.lang.String str13 = textNode2.attr("hi!");
        java.lang.String str14 = textNode2.text();
        java.lang.String str15 = textNode2.nodeName();
        org.jsoup.nodes.Node node17 = textNode2.removeAttr("i!");
        java.lang.String str18 = textNode2.nodeName();
        java.util.List<org.jsoup.nodes.Node> nodeList19 = textNode2.siblingNodes();
        java.lang.String str21 = textNode2.absUrl("hi!");
        org.jsoup.nodes.Node node22 = textNode2.nextSibling();
        java.lang.String str23 = textNode2.text();
        org.junit.Assert.assertNotNull(textNode2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(nodeList5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNull(node11);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "#text" + "'", str15, "#text");
        org.junit.Assert.assertNotNull(node17);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "#text" + "'", str18, "#text");
        org.junit.Assert.assertNotNull(nodeList19);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertNull(node22);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
    }

    @Test
    public void test20609() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20609");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("", "");
        boolean boolean3 = textNode2.isBlank();
        org.jsoup.nodes.Node node4 = textNode2.previousSibling();
        org.jsoup.nodes.Node node7 = textNode2.attr("hi!", "");
        java.lang.String str8 = textNode2.baseUri();
        boolean boolean10 = textNode2.hasAttr("hi!");
        org.jsoup.nodes.Node node12 = textNode2.removeAttr("i!");
        boolean boolean13 = textNode2.isBlank();
        org.jsoup.nodes.Node node15 = textNode2.removeAttr("i!");
        java.lang.String str16 = textNode2.getWholeText();
        org.junit.Assert.assertNotNull(textNode2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNull(node4);
        org.junit.Assert.assertNotNull(node7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(node12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNotNull(node15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
    }

    @Test
    public void test20610() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20610");
        org.jsoup.nodes.Document.OutputSettings outputSettings0 = new org.jsoup.nodes.Document.OutputSettings();
        boolean boolean1 = outputSettings0.prettyPrint();
        org.jsoup.nodes.Document.OutputSettings outputSettings3 = outputSettings0.prettyPrint(false);
        org.jsoup.nodes.Document.OutputSettings outputSettings5 = outputSettings0.indentAmount((int) '#');
        org.jsoup.nodes.Document.OutputSettings outputSettings6 = outputSettings0.clone();
        org.jsoup.nodes.Document.OutputSettings outputSettings7 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Document.OutputSettings outputSettings8 = new org.jsoup.nodes.Document.OutputSettings();
        int int9 = outputSettings8.indentAmount();
        org.jsoup.nodes.Entities.EscapeMode escapeMode10 = outputSettings8.escapeMode();
        org.jsoup.nodes.Document.OutputSettings outputSettings11 = outputSettings7.escapeMode(escapeMode10);
        org.jsoup.nodes.Document.OutputSettings outputSettings12 = outputSettings0.escapeMode(escapeMode10);
        java.nio.charset.Charset charset13 = outputSettings12.charset();
        org.jsoup.nodes.Document.OutputSettings outputSettings15 = outputSettings12.indentAmount((int) 'a');
        org.jsoup.nodes.Document.OutputSettings outputSettings17 = outputSettings15.prettyPrint(false);
        int int18 = outputSettings15.indentAmount();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertNotNull(outputSettings3);
        org.junit.Assert.assertNotNull(outputSettings5);
        org.junit.Assert.assertNotNull(outputSettings6);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + escapeMode10 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode10.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertNotNull(outputSettings11);
        org.junit.Assert.assertNotNull(outputSettings12);
        org.junit.Assert.assertNotNull(charset13);
        org.junit.Assert.assertNotNull(outputSettings15);
        org.junit.Assert.assertNotNull(outputSettings17);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 97 + "'", int18 == 97);
    }

    @Test
    public void test20611() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20611");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("#text", "");
        textNode2.setBaseUri("");
        boolean boolean5 = textNode2.isBlank();
        org.jsoup.nodes.TextNode textNode7 = textNode2.text("#");
        org.jsoup.nodes.TextNode textNode9 = textNode2.text("#text");
        org.jsoup.nodes.Node node11 = textNode9.removeAttr("!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(textNode7);
        org.junit.Assert.assertNotNull(textNode9);
        org.junit.Assert.assertNotNull(node11);
    }

    @Test
    public void test20612() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20612");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("", "");
        boolean boolean3 = textNode2.isBlank();
        org.jsoup.nodes.Node node4 = textNode2.previousSibling();
        org.jsoup.nodes.Node node7 = textNode2.attr("hi!", "");
        java.lang.String str8 = textNode2.baseUri();
        java.lang.String str9 = textNode2.outerHtml();
        org.jsoup.nodes.TextNode textNode11 = textNode2.text("#text");
        org.jsoup.nodes.TextNode textNode14 = org.jsoup.nodes.TextNode.createFromEncoded("", "");
        boolean boolean15 = textNode14.isBlank();
        java.lang.String str17 = textNode14.attr("");
        boolean boolean18 = textNode2.equals((java.lang.Object) textNode14);
        java.util.List<org.jsoup.nodes.Node> nodeList19 = textNode2.siblingNodes();
        org.jsoup.nodes.Node node20 = textNode2.parent();
        org.jsoup.nodes.Node node21 = textNode2.previousSibling();
        java.lang.String str22 = textNode2.outerHtml();
        java.lang.String str23 = textNode2.toString();
        org.junit.Assert.assertNotNull(textNode2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNull(node4);
        org.junit.Assert.assertNotNull(node7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNotNull(textNode11);
        org.junit.Assert.assertNotNull(textNode14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(nodeList19);
        org.junit.Assert.assertNull(node20);
        org.junit.Assert.assertNull(node21);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "#text" + "'", str22, "#text");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "#text" + "'", str23, "#text");
    }

    @Test
    public void test20613() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20613");
        org.jsoup.nodes.Document.OutputSettings outputSettings0 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Entities.EscapeMode escapeMode1 = outputSettings0.escapeMode();
        boolean boolean2 = outputSettings0.prettyPrint();
        org.jsoup.nodes.Document.OutputSettings outputSettings3 = outputSettings0.clone();
        org.jsoup.nodes.Document.OutputSettings outputSettings4 = new org.jsoup.nodes.Document.OutputSettings();
        boolean boolean5 = outputSettings4.prettyPrint();
        org.jsoup.nodes.Document.OutputSettings outputSettings7 = outputSettings4.prettyPrint(false);
        org.jsoup.nodes.Document.OutputSettings outputSettings9 = outputSettings7.prettyPrint(false);
        org.jsoup.nodes.Document.OutputSettings outputSettings10 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Entities.EscapeMode escapeMode11 = outputSettings10.escapeMode();
        java.nio.charset.Charset charset12 = outputSettings10.charset();
        org.jsoup.nodes.Document.OutputSettings outputSettings13 = outputSettings7.charset(charset12);
        org.jsoup.nodes.Document.OutputSettings outputSettings14 = outputSettings0.charset(charset12);
        org.jsoup.nodes.Document.OutputSettings outputSettings16 = outputSettings0.prettyPrint(false);
        org.jsoup.nodes.Document.OutputSettings outputSettings17 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Entities.EscapeMode escapeMode18 = outputSettings17.escapeMode();
        org.jsoup.nodes.Document.OutputSettings outputSettings19 = outputSettings16.escapeMode(escapeMode18);
        org.jsoup.nodes.Document.OutputSettings outputSettings20 = outputSettings16.clone();
        java.nio.charset.Charset charset21 = outputSettings20.charset();
        org.jsoup.nodes.Document.OutputSettings outputSettings22 = new org.jsoup.nodes.Document.OutputSettings();
        boolean boolean23 = outputSettings22.prettyPrint();
        org.jsoup.nodes.Document.OutputSettings outputSettings25 = outputSettings22.prettyPrint(false);
        org.jsoup.nodes.Document.OutputSettings outputSettings27 = outputSettings22.indentAmount((int) '#');
        org.jsoup.nodes.Entities.EscapeMode escapeMode28 = outputSettings22.escapeMode();
        org.jsoup.nodes.Document.OutputSettings outputSettings30 = outputSettings22.indentAmount((int) 'a');
        org.jsoup.nodes.Document.OutputSettings outputSettings32 = outputSettings30.indentAmount((int) ' ');
        int int33 = outputSettings30.indentAmount();
        org.jsoup.nodes.Document.OutputSettings outputSettings34 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Entities.EscapeMode escapeMode35 = outputSettings34.escapeMode();
        boolean boolean36 = outputSettings34.prettyPrint();
        org.jsoup.nodes.Entities.EscapeMode escapeMode37 = outputSettings34.escapeMode();
        java.nio.charset.Charset charset38 = outputSettings34.charset();
        org.jsoup.nodes.Document.OutputSettings outputSettings40 = outputSettings34.indentAmount(10);
        org.jsoup.nodes.Entities.EscapeMode escapeMode41 = outputSettings34.escapeMode();
        java.nio.charset.Charset charset42 = outputSettings34.charset();
        org.jsoup.nodes.Document.OutputSettings outputSettings43 = outputSettings30.charset(charset42);
        org.jsoup.nodes.Document.OutputSettings outputSettings44 = outputSettings20.charset(charset42);
        int int45 = outputSettings44.indentAmount();
        org.junit.Assert.assertTrue("'" + escapeMode1 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode1.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(outputSettings3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(outputSettings7);
        org.junit.Assert.assertNotNull(outputSettings9);
        org.junit.Assert.assertTrue("'" + escapeMode11 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode11.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertNotNull(charset12);
        org.junit.Assert.assertNotNull(outputSettings13);
        org.junit.Assert.assertNotNull(outputSettings14);
        org.junit.Assert.assertNotNull(outputSettings16);
        org.junit.Assert.assertTrue("'" + escapeMode18 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode18.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertNotNull(outputSettings19);
        org.junit.Assert.assertNotNull(outputSettings20);
        org.junit.Assert.assertNotNull(charset21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertNotNull(outputSettings25);
        org.junit.Assert.assertNotNull(outputSettings27);
        org.junit.Assert.assertTrue("'" + escapeMode28 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode28.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertNotNull(outputSettings30);
        org.junit.Assert.assertNotNull(outputSettings32);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 32 + "'", int33 == 32);
        org.junit.Assert.assertTrue("'" + escapeMode35 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode35.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + true + "'", boolean36 == true);
        org.junit.Assert.assertTrue("'" + escapeMode37 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode37.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertNotNull(charset38);
        org.junit.Assert.assertNotNull(outputSettings40);
        org.junit.Assert.assertTrue("'" + escapeMode41 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode41.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertNotNull(charset42);
        org.junit.Assert.assertNotNull(outputSettings43);
        org.junit.Assert.assertNotNull(outputSettings44);
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + 1 + "'", int45 == 1);
    }

    @Test
    public void test20614() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20614");
        org.jsoup.nodes.Document.OutputSettings outputSettings0 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Document.OutputSettings outputSettings1 = outputSettings0.clone();
        org.jsoup.nodes.Document.OutputSettings outputSettings3 = outputSettings0.prettyPrint(true);
        int int4 = outputSettings3.indentAmount();
        java.nio.charset.Charset charset5 = outputSettings3.charset();
        int int6 = outputSettings3.indentAmount();
        org.jsoup.nodes.Document.OutputSettings outputSettings8 = outputSettings3.indentAmount((int) (short) 0);
        org.junit.Assert.assertNotNull(outputSettings1);
        org.junit.Assert.assertNotNull(outputSettings3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertNotNull(charset5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertNotNull(outputSettings8);
    }

    @Test
    public void test20615() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20615");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("#text", "hi!");
        int int3 = textNode2.childNodeSize();
        org.jsoup.nodes.Node node4 = textNode2.clone();
        org.jsoup.nodes.Node node5 = textNode2.clone();
        org.jsoup.nodes.TextNode textNode7 = textNode2.text("#text");
        org.jsoup.nodes.Node node8 = textNode7.parent();
        boolean boolean10 = textNode7.hasAttr("");
        java.lang.String str11 = textNode7.toString();
        java.lang.String str12 = textNode7.baseUri();
        java.lang.String str13 = textNode7.toString();
        java.lang.String str14 = textNode7.baseUri();
        java.lang.String str15 = textNode7.nodeName();
        org.junit.Assert.assertNotNull(textNode2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(node4);
        org.junit.Assert.assertNotNull(node5);
        org.junit.Assert.assertNotNull(textNode7);
        org.junit.Assert.assertNull(node8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "#text" + "'", str11, "#text");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "#text" + "'", str13, "#text");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "#text" + "'", str15, "#text");
    }

    @Test
    public void test20616() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20616");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("", "");
        boolean boolean3 = textNode2.isBlank();
        org.jsoup.nodes.Node node4 = textNode2.previousSibling();
        org.jsoup.nodes.Node node7 = textNode2.attr("hi!", "");
        java.lang.String str8 = textNode2.baseUri();
        java.lang.String str9 = textNode2.outerHtml();
        java.util.List<org.jsoup.nodes.Node> nodeList10 = textNode2.childNodesCopy();
        java.lang.String str11 = textNode2.baseUri();
        org.jsoup.nodes.Node node12 = textNode2.nextSibling();
        org.jsoup.nodes.TextNode textNode14 = textNode2.text("");
        java.lang.String str15 = textNode14.getWholeText();
        boolean boolean16 = textNode14.isBlank();
        java.lang.String str17 = textNode14.outerHtml();
        java.lang.String str18 = textNode14.getWholeText();
        org.jsoup.nodes.TextNode textNode20 = textNode14.text("i!");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node22 = textNode14.before("h");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(textNode2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNull(node4);
        org.junit.Assert.assertNotNull(node7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNotNull(nodeList10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNull(node12);
        org.junit.Assert.assertNotNull(textNode14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertNotNull(textNode20);
    }

    @Test
    public void test20617() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20617");
        org.jsoup.nodes.Document.OutputSettings outputSettings0 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Document.OutputSettings outputSettings1 = outputSettings0.clone();
        org.jsoup.nodes.Document.OutputSettings outputSettings3 = outputSettings1.prettyPrint(false);
        org.jsoup.nodes.Document.OutputSettings outputSettings4 = outputSettings1.clone();
        org.jsoup.nodes.Entities.EscapeMode escapeMode5 = outputSettings1.escapeMode();
        org.jsoup.nodes.Entities.EscapeMode escapeMode6 = outputSettings1.escapeMode();
        org.junit.Assert.assertNotNull(outputSettings1);
        org.junit.Assert.assertNotNull(outputSettings3);
        org.junit.Assert.assertNotNull(outputSettings4);
        org.junit.Assert.assertTrue("'" + escapeMode5 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode5.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertTrue("'" + escapeMode6 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode6.equals(org.jsoup.nodes.Entities.EscapeMode.base));
    }

    @Test
    public void test20618() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20618");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("hi!", "hi!");
        java.lang.String str3 = textNode2.nodeName();
        java.util.List<org.jsoup.nodes.Node> nodeList4 = textNode2.childNodesCopy();
        boolean boolean5 = textNode2.isBlank();
        boolean boolean7 = textNode2.hasAttr("text");
        java.util.List<org.jsoup.nodes.Node> nodeList8 = textNode2.childNodes();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "#text" + "'", str3, "#text");
        org.junit.Assert.assertNotNull(nodeList4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(nodeList8);
    }

    @Test
    public void test20619() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20619");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("", "");
        boolean boolean3 = textNode2.isBlank();
        org.jsoup.nodes.Node node4 = textNode2.previousSibling();
        java.lang.String str5 = textNode2.nodeName();
        org.jsoup.nodes.Node node6 = textNode2.nextSibling();
        boolean boolean7 = textNode2.isBlank();
        java.lang.String str8 = textNode2.baseUri();
        java.util.List<org.jsoup.nodes.Node> nodeList9 = textNode2.childNodes();
        java.util.List<org.jsoup.nodes.Node> nodeList10 = textNode2.childNodes();
        java.lang.String str12 = textNode2.attr("");
        org.jsoup.nodes.Attributes attributes13 = textNode2.attributes();
        org.jsoup.nodes.Node node14 = textNode2.clone();
        // The following exception was thrown during execution in test generation
        try {
            node14.remove();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(textNode2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNull(node4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "#text" + "'", str5, "#text");
        org.junit.Assert.assertNull(node6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNotNull(nodeList9);
        org.junit.Assert.assertNotNull(nodeList10);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertNotNull(attributes13);
        org.junit.Assert.assertNotNull(node14);
    }

    @Test
    public void test20620() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20620");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("", "");
        boolean boolean3 = textNode2.isBlank();
        java.lang.String str4 = textNode2.outerHtml();
        java.lang.String str5 = textNode2.text();
        boolean boolean7 = textNode2.hasAttr("hi!");
        org.jsoup.nodes.Document.OutputSettings outputSettings8 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Entities.EscapeMode escapeMode9 = outputSettings8.escapeMode();
        org.jsoup.nodes.Document.OutputSettings outputSettings11 = outputSettings8.prettyPrint(false);
        org.jsoup.nodes.Document.OutputSettings outputSettings13 = outputSettings11.prettyPrint(true);
        boolean boolean14 = textNode2.equals((java.lang.Object) outputSettings11);
        java.lang.String str15 = textNode2.toString();
        java.lang.String str16 = textNode2.text();
        org.jsoup.nodes.TextNode textNode18 = textNode2.text("i");
        java.lang.String str20 = textNode18.attr("#text");
        org.junit.Assert.assertNotNull(textNode2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + escapeMode9 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode9.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertNotNull(outputSettings11);
        org.junit.Assert.assertNotNull(outputSettings13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertNotNull(textNode18);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
    }

    @Test
    public void test20621() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20621");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("hi!", "hi!");
        java.lang.String str4 = textNode2.absUrl("hi!");
        org.jsoup.nodes.Document document5 = textNode2.ownerDocument();
        java.lang.String str6 = textNode2.text();
        org.jsoup.nodes.TextNode textNode8 = textNode2.text("hi!");
        java.lang.String str10 = textNode2.attr("");
        java.lang.String str11 = textNode2.text();
        textNode2.setBaseUri("i!");
        org.jsoup.nodes.Node node14 = textNode2.clone();
        java.lang.String str15 = textNode2.baseUri();
        org.jsoup.nodes.Node node17 = textNode2.removeAttr("#");
        int int18 = node17.siblingIndex();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNull(document5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertNotNull(textNode8);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertNotNull(node14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "i!" + "'", str15, "i!");
        org.junit.Assert.assertNotNull(node17);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
    }

    @Test
    public void test20622() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20622");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("hi!", "hi!");
        java.lang.String str4 = textNode2.absUrl("hi!");
        org.jsoup.nodes.Document document5 = textNode2.ownerDocument();
        java.lang.String str6 = textNode2.getWholeText();
        org.jsoup.nodes.Node node7 = textNode2.clone();
        org.jsoup.nodes.Node node8 = textNode2.parent();
        boolean boolean9 = textNode2.isBlank();
        org.jsoup.nodes.Node node10 = textNode2.previousSibling();
        java.lang.String str12 = textNode2.absUrl("i!");
        java.lang.String str13 = textNode2.baseUri();
        org.jsoup.nodes.TextNode textNode15 = textNode2.text("hi!");
        org.jsoup.nodes.TextNode textNode17 = textNode2.text("h");
        org.jsoup.nodes.Node node20 = textNode17.attr("i", "h");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNull(document5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertNotNull(node7);
        org.junit.Assert.assertNull(node8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(node10);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertNotNull(textNode15);
        org.junit.Assert.assertNotNull(textNode17);
        org.junit.Assert.assertNotNull(node20);
    }

    @Test
    public void test20623() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20623");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("", "");
        boolean boolean3 = textNode2.isBlank();
        org.jsoup.nodes.Node node4 = textNode2.previousSibling();
        java.lang.String str5 = textNode2.nodeName();
        org.jsoup.nodes.Node node6 = textNode2.nextSibling();
        java.lang.String str8 = textNode2.attr("");
        org.jsoup.nodes.Node node9 = textNode2.previousSibling();
        java.lang.String str10 = textNode2.getWholeText();
        org.jsoup.nodes.Node node13 = textNode2.attr("#text", "i!");
        org.jsoup.nodes.TextNode textNode16 = org.jsoup.nodes.TextNode.createFromEncoded("", "");
        boolean boolean17 = textNode16.isBlank();
        org.jsoup.nodes.Node node18 = textNode16.previousSibling();
        java.lang.String str19 = textNode16.nodeName();
        java.lang.String str20 = textNode16.getWholeText();
        java.lang.String str21 = textNode16.getWholeText();
        boolean boolean23 = textNode16.hasAttr("#text");
        org.jsoup.nodes.Node node24 = textNode16.nextSibling();
        java.util.List<org.jsoup.nodes.Node> nodeList25 = textNode16.childNodesCopy();
        org.jsoup.nodes.Node node26 = textNode16.clone();
        org.jsoup.nodes.Node node27 = textNode16.clone();
        org.jsoup.nodes.Node node28 = node27.clone();
        java.lang.Class<?> wildcardClass29 = node27.getClass();
        boolean boolean30 = textNode2.equals((java.lang.Object) wildcardClass29);
        java.lang.String str31 = textNode2.baseUri();
        org.jsoup.nodes.TextNode textNode33 = textNode2.text("#");
        org.jsoup.nodes.Node node36 = textNode2.attr("text", "");
        org.jsoup.nodes.Document document37 = node36.ownerDocument();
        org.junit.Assert.assertNotNull(textNode2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNull(node4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "#text" + "'", str5, "#text");
        org.junit.Assert.assertNull(node6);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNull(node9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNotNull(node13);
        org.junit.Assert.assertNotNull(textNode16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertNull(node18);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "#text" + "'", str19, "#text");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNull(node24);
        org.junit.Assert.assertNotNull(nodeList25);
        org.junit.Assert.assertNotNull(node26);
        org.junit.Assert.assertNotNull(node27);
        org.junit.Assert.assertNotNull(node28);
        org.junit.Assert.assertNotNull(wildcardClass29);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "" + "'", str31, "");
        org.junit.Assert.assertNotNull(textNode33);
        org.junit.Assert.assertNotNull(node36);
        org.junit.Assert.assertNull(document37);
    }

    @Test
    public void test20624() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20624");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("", "");
        boolean boolean3 = textNode2.isBlank();
        boolean boolean4 = textNode2.isBlank();
        java.util.List<org.jsoup.nodes.Node> nodeList5 = textNode2.childNodes();
        org.jsoup.nodes.TextNode textNode7 = textNode2.text("");
        textNode2.setBaseUri("hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList10 = textNode2.childNodesCopy();
        java.lang.String str11 = textNode2.toString();
        int int12 = textNode2.siblingIndex();
        textNode2.setBaseUri("");
        java.lang.String str15 = textNode2.text();
        java.util.List<org.jsoup.nodes.Node> nodeList16 = textNode2.siblingNodes();
        org.junit.Assert.assertNotNull(textNode2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(nodeList5);
        org.junit.Assert.assertNotNull(textNode7);
        org.junit.Assert.assertNotNull(nodeList10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertNotNull(nodeList16);
    }

    @Test
    public void test20625() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20625");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("", "");
        boolean boolean3 = textNode2.isBlank();
        org.jsoup.nodes.Node node4 = textNode2.previousSibling();
        org.jsoup.nodes.Node node7 = textNode2.attr("hi!", "");
        java.lang.String str8 = textNode2.baseUri();
        java.lang.String str9 = textNode2.outerHtml();
        java.util.List<org.jsoup.nodes.Node> nodeList10 = textNode2.childNodesCopy();
        java.lang.String str11 = textNode2.baseUri();
        org.jsoup.nodes.Node node12 = textNode2.nextSibling();
        org.jsoup.nodes.TextNode textNode14 = textNode2.text("");
        java.util.List<org.jsoup.nodes.Node> nodeList15 = textNode14.childNodes();
        textNode14.setBaseUri("#text");
        java.util.List<org.jsoup.nodes.Node> nodeList18 = textNode14.siblingNodes();
        int int19 = textNode14.childNodeSize();
        org.jsoup.nodes.TextNode textNode21 = textNode14.text("#");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node22 = textNode14.unwrap();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(textNode2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNull(node4);
        org.junit.Assert.assertNotNull(node7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNotNull(nodeList10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNull(node12);
        org.junit.Assert.assertNotNull(textNode14);
        org.junit.Assert.assertNotNull(nodeList15);
        org.junit.Assert.assertNotNull(nodeList18);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertNotNull(textNode21);
    }

    @Test
    public void test20626() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20626");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("", "");
        boolean boolean3 = textNode2.isBlank();
        org.jsoup.nodes.Node node4 = textNode2.previousSibling();
        java.lang.String str5 = textNode2.nodeName();
        boolean boolean6 = textNode2.isBlank();
        java.util.List<org.jsoup.nodes.Node> nodeList7 = textNode2.childNodesCopy();
        textNode2.setBaseUri("#text");
        java.lang.String str10 = textNode2.baseUri();
        java.lang.String str11 = textNode2.toString();
        org.jsoup.nodes.TextNode textNode13 = textNode2.text("i!");
        textNode2.setBaseUri("#text");
        org.jsoup.nodes.Node node18 = textNode2.attr("h", "#");
        org.junit.Assert.assertNotNull(textNode2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNull(node4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "#text" + "'", str5, "#text");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(nodeList7);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "#text" + "'", str10, "#text");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNotNull(textNode13);
        org.junit.Assert.assertNotNull(node18);
    }

    @Test
    public void test20627() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20627");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("", "");
        boolean boolean3 = textNode2.isBlank();
        org.jsoup.nodes.Node node4 = textNode2.previousSibling();
        org.jsoup.nodes.Node node7 = textNode2.attr("hi!", "");
        java.lang.String str8 = textNode2.baseUri();
        java.lang.String str9 = textNode2.outerHtml();
        java.util.List<org.jsoup.nodes.Node> nodeList10 = textNode2.childNodesCopy();
        org.jsoup.nodes.Node node11 = textNode2.clone();
        org.jsoup.nodes.Node node12 = textNode2.clone();
        org.jsoup.nodes.TextNode textNode14 = textNode2.text("");
        java.lang.String str15 = textNode2.nodeName();
        boolean boolean16 = textNode2.isBlank();
        org.junit.Assert.assertNotNull(textNode2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNull(node4);
        org.junit.Assert.assertNotNull(node7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNotNull(nodeList10);
        org.junit.Assert.assertNotNull(node11);
        org.junit.Assert.assertNotNull(node12);
        org.junit.Assert.assertNotNull(textNode14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "#text" + "'", str15, "#text");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
    }

    @Test
    public void test20628() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20628");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("", "hi!");
        java.lang.String str3 = textNode2.toString();
        java.util.List<org.jsoup.nodes.Node> nodeList4 = textNode2.childNodesCopy();
        org.jsoup.nodes.Document.OutputSettings outputSettings5 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Document.OutputSettings outputSettings6 = new org.jsoup.nodes.Document.OutputSettings();
        int int7 = outputSettings6.indentAmount();
        org.jsoup.nodes.Entities.EscapeMode escapeMode8 = outputSettings6.escapeMode();
        org.jsoup.nodes.Document.OutputSettings outputSettings9 = outputSettings5.escapeMode(escapeMode8);
        org.jsoup.nodes.Document.OutputSettings outputSettings11 = outputSettings5.indentAmount((int) (short) 100);
        org.jsoup.nodes.Entities.EscapeMode escapeMode12 = outputSettings5.escapeMode();
        org.jsoup.nodes.Document.OutputSettings outputSettings14 = outputSettings5.prettyPrint(true);
        org.jsoup.nodes.Document.OutputSettings outputSettings16 = outputSettings5.indentAmount(10);
        java.nio.charset.Charset charset17 = outputSettings16.charset();
        org.jsoup.nodes.Entities.EscapeMode escapeMode18 = outputSettings16.escapeMode();
        boolean boolean19 = textNode2.equals((java.lang.Object) escapeMode18);
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.TextNode textNode21 = textNode2.splitText(35);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Split offset must not be greater than current text length");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertNotNull(nodeList4);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + escapeMode8 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode8.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertNotNull(outputSettings9);
        org.junit.Assert.assertNotNull(outputSettings11);
        org.junit.Assert.assertTrue("'" + escapeMode12 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode12.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertNotNull(outputSettings14);
        org.junit.Assert.assertNotNull(outputSettings16);
        org.junit.Assert.assertNotNull(charset17);
        org.junit.Assert.assertTrue("'" + escapeMode18 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode18.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }

    @Test
    public void test20629() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20629");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("", "");
        boolean boolean3 = textNode2.isBlank();
        org.jsoup.nodes.Node node4 = textNode2.previousSibling();
        org.jsoup.nodes.Node node7 = textNode2.attr("hi!", "");
        java.lang.String str8 = textNode2.baseUri();
        java.lang.String str9 = textNode2.outerHtml();
        org.jsoup.nodes.TextNode textNode11 = textNode2.text("#text");
        org.jsoup.nodes.TextNode textNode14 = org.jsoup.nodes.TextNode.createFromEncoded("", "");
        boolean boolean15 = textNode14.isBlank();
        java.lang.String str17 = textNode14.attr("");
        boolean boolean18 = textNode2.equals((java.lang.Object) textNode14);
        java.lang.String str19 = textNode2.nodeName();
        java.util.List<org.jsoup.nodes.Node> nodeList20 = textNode2.childNodesCopy();
        java.util.List<org.jsoup.nodes.Node> nodeList21 = textNode2.childNodes();
        org.jsoup.nodes.Document document22 = textNode2.ownerDocument();
        java.lang.String str24 = textNode2.absUrl("#text");
        int int25 = textNode2.siblingIndex();
        org.jsoup.nodes.Document document26 = textNode2.ownerDocument();
        java.lang.Class<?> wildcardClass27 = textNode2.getClass();
        org.junit.Assert.assertNotNull(textNode2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNull(node4);
        org.junit.Assert.assertNotNull(node7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNotNull(textNode11);
        org.junit.Assert.assertNotNull(textNode14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "#text" + "'", str19, "#text");
        org.junit.Assert.assertNotNull(nodeList20);
        org.junit.Assert.assertNotNull(nodeList21);
        org.junit.Assert.assertNull(document22);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "" + "'", str24, "");
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertNull(document26);
        org.junit.Assert.assertNotNull(wildcardClass27);
    }

    @Test
    public void test20630() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20630");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("", "hi!");
        java.lang.String str4 = textNode2.absUrl("hi!");
        org.jsoup.nodes.Node node5 = textNode2.parent();
        org.jsoup.nodes.TextNode textNode7 = textNode2.text("");
        org.jsoup.nodes.Node node9 = textNode2.removeAttr("hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList10 = textNode2.childNodesCopy();
        org.jsoup.nodes.Node node11 = textNode2.clone();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertNotNull(textNode7);
        org.junit.Assert.assertNotNull(node9);
        org.junit.Assert.assertNotNull(nodeList10);
        org.junit.Assert.assertNotNull(node11);
    }

    @Test
    public void test20631() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20631");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("", "#text");
        java.lang.String str3 = textNode2.baseUri();
        org.jsoup.nodes.Node node4 = textNode2.parent();
        org.jsoup.nodes.TextNode textNode6 = textNode2.text("hi!");
        org.jsoup.nodes.Node node9 = textNode2.attr("hi!", "#");
        org.jsoup.nodes.Node node10 = textNode2.clone();
        int int11 = textNode2.siblingIndex();
        org.jsoup.nodes.TextNode textNode13 = textNode2.text("i!");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str15 = textNode13.absUrl("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: String must not be empty");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "#text" + "'", str3, "#text");
        org.junit.Assert.assertNull(node4);
        org.junit.Assert.assertNotNull(textNode6);
        org.junit.Assert.assertNotNull(node9);
        org.junit.Assert.assertNotNull(node10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNotNull(textNode13);
    }

    @Test
    public void test20632() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20632");
        org.jsoup.nodes.Document.OutputSettings outputSettings0 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Entities.EscapeMode escapeMode1 = outputSettings0.escapeMode();
        org.jsoup.nodes.Document.OutputSettings outputSettings2 = outputSettings0.clone();
        org.jsoup.nodes.Document.OutputSettings outputSettings3 = new org.jsoup.nodes.Document.OutputSettings();
        int int4 = outputSettings3.indentAmount();
        org.jsoup.nodes.Entities.EscapeMode escapeMode5 = outputSettings3.escapeMode();
        java.nio.charset.Charset charset6 = outputSettings3.charset();
        org.jsoup.nodes.Document.OutputSettings outputSettings7 = outputSettings0.charset(charset6);
        org.jsoup.nodes.Document.OutputSettings outputSettings8 = new org.jsoup.nodes.Document.OutputSettings();
        boolean boolean9 = outputSettings8.prettyPrint();
        org.jsoup.nodes.Document.OutputSettings outputSettings11 = outputSettings8.prettyPrint(false);
        org.jsoup.nodes.Document.OutputSettings outputSettings13 = outputSettings11.prettyPrint(false);
        org.jsoup.nodes.Document.OutputSettings outputSettings14 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Entities.EscapeMode escapeMode15 = outputSettings14.escapeMode();
        java.nio.charset.Charset charset16 = outputSettings14.charset();
        org.jsoup.nodes.Document.OutputSettings outputSettings17 = outputSettings11.charset(charset16);
        org.jsoup.nodes.Document.OutputSettings outputSettings18 = outputSettings7.charset(charset16);
        org.jsoup.nodes.Document.OutputSettings outputSettings19 = new org.jsoup.nodes.Document.OutputSettings();
        boolean boolean20 = outputSettings19.prettyPrint();
        org.jsoup.nodes.Document.OutputSettings outputSettings22 = outputSettings19.prettyPrint(false);
        org.jsoup.nodes.Document.OutputSettings outputSettings23 = new org.jsoup.nodes.Document.OutputSettings();
        boolean boolean24 = outputSettings23.prettyPrint();
        org.jsoup.nodes.Document.OutputSettings outputSettings25 = new org.jsoup.nodes.Document.OutputSettings();
        int int26 = outputSettings25.indentAmount();
        org.jsoup.nodes.Entities.EscapeMode escapeMode27 = outputSettings25.escapeMode();
        java.nio.charset.Charset charset28 = outputSettings25.charset();
        org.jsoup.nodes.Document.OutputSettings outputSettings29 = outputSettings23.charset(charset28);
        org.jsoup.nodes.Document.OutputSettings outputSettings30 = outputSettings22.charset(charset28);
        org.jsoup.nodes.Document.OutputSettings outputSettings31 = outputSettings7.charset(charset28);
        int int32 = outputSettings7.indentAmount();
        org.jsoup.nodes.Document.OutputSettings outputSettings34 = outputSettings7.prettyPrint(true);
        org.jsoup.nodes.Document.OutputSettings outputSettings36 = outputSettings34.indentAmount(10);
        org.jsoup.nodes.Entities.EscapeMode escapeMode37 = outputSettings34.escapeMode();
        org.junit.Assert.assertTrue("'" + escapeMode1 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode1.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertNotNull(outputSettings2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + escapeMode5 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode5.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertNotNull(charset6);
        org.junit.Assert.assertNotNull(outputSettings7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(outputSettings11);
        org.junit.Assert.assertNotNull(outputSettings13);
        org.junit.Assert.assertTrue("'" + escapeMode15 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode15.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertNotNull(charset16);
        org.junit.Assert.assertNotNull(outputSettings17);
        org.junit.Assert.assertNotNull(outputSettings18);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertNotNull(outputSettings22);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 1 + "'", int26 == 1);
        org.junit.Assert.assertTrue("'" + escapeMode27 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode27.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertNotNull(charset28);
        org.junit.Assert.assertNotNull(outputSettings29);
        org.junit.Assert.assertNotNull(outputSettings30);
        org.junit.Assert.assertNotNull(outputSettings31);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 1 + "'", int32 == 1);
        org.junit.Assert.assertNotNull(outputSettings34);
        org.junit.Assert.assertNotNull(outputSettings36);
        org.junit.Assert.assertTrue("'" + escapeMode37 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode37.equals(org.jsoup.nodes.Entities.EscapeMode.base));
    }

    @Test
    public void test20633() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20633");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("", "");
        boolean boolean3 = textNode2.isBlank();
        org.jsoup.nodes.Node node4 = textNode2.previousSibling();
        java.lang.String str5 = textNode2.nodeName();
        boolean boolean6 = textNode2.isBlank();
        java.util.List<org.jsoup.nodes.Node> nodeList7 = textNode2.childNodesCopy();
        textNode2.setBaseUri("#text");
        java.lang.String str10 = textNode2.baseUri();
        org.jsoup.nodes.Node node13 = textNode2.attr("i!", "#text");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node15 = textNode2.childNode(32);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 32");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(textNode2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNull(node4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "#text" + "'", str5, "#text");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(nodeList7);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "#text" + "'", str10, "#text");
        org.junit.Assert.assertNotNull(node13);
    }

    @Test
    public void test20634() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20634");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("text", "!");
        org.junit.Assert.assertNotNull(textNode2);
    }

    @Test
    public void test20635() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20635");
        org.jsoup.nodes.Document.OutputSettings outputSettings0 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Document.OutputSettings outputSettings1 = new org.jsoup.nodes.Document.OutputSettings();
        int int2 = outputSettings1.indentAmount();
        org.jsoup.nodes.Entities.EscapeMode escapeMode3 = outputSettings1.escapeMode();
        org.jsoup.nodes.Document.OutputSettings outputSettings4 = outputSettings0.escapeMode(escapeMode3);
        org.jsoup.nodes.Document.OutputSettings outputSettings6 = outputSettings0.indentAmount((int) (short) 100);
        org.jsoup.nodes.Document.OutputSettings outputSettings7 = new org.jsoup.nodes.Document.OutputSettings();
        boolean boolean8 = outputSettings7.prettyPrint();
        org.jsoup.nodes.Document.OutputSettings outputSettings10 = outputSettings7.prettyPrint(false);
        org.jsoup.nodes.Document.OutputSettings outputSettings11 = new org.jsoup.nodes.Document.OutputSettings();
        boolean boolean12 = outputSettings11.prettyPrint();
        org.jsoup.nodes.Document.OutputSettings outputSettings13 = new org.jsoup.nodes.Document.OutputSettings();
        int int14 = outputSettings13.indentAmount();
        org.jsoup.nodes.Entities.EscapeMode escapeMode15 = outputSettings13.escapeMode();
        java.nio.charset.Charset charset16 = outputSettings13.charset();
        org.jsoup.nodes.Document.OutputSettings outputSettings17 = outputSettings11.charset(charset16);
        org.jsoup.nodes.Document.OutputSettings outputSettings18 = outputSettings10.charset(charset16);
        org.jsoup.nodes.Document.OutputSettings outputSettings19 = outputSettings6.charset(charset16);
        java.nio.charset.Charset charset20 = outputSettings19.charset();
        int int21 = outputSettings19.indentAmount();
        org.jsoup.nodes.Document.OutputSettings outputSettings23 = outputSettings19.prettyPrint(false);
        org.jsoup.nodes.Document.OutputSettings outputSettings24 = outputSettings19.clone();
        java.nio.charset.Charset charset25 = outputSettings19.charset();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
        org.junit.Assert.assertTrue("'" + escapeMode3 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode3.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertNotNull(outputSettings4);
        org.junit.Assert.assertNotNull(outputSettings6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(outputSettings10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertTrue("'" + escapeMode15 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode15.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertNotNull(charset16);
        org.junit.Assert.assertNotNull(outputSettings17);
        org.junit.Assert.assertNotNull(outputSettings18);
        org.junit.Assert.assertNotNull(outputSettings19);
        org.junit.Assert.assertNotNull(charset20);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 100 + "'", int21 == 100);
        org.junit.Assert.assertNotNull(outputSettings23);
        org.junit.Assert.assertNotNull(outputSettings24);
        org.junit.Assert.assertNotNull(charset25);
    }

    @Test
    public void test20636() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20636");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("", "");
        boolean boolean3 = textNode2.isBlank();
        boolean boolean4 = textNode2.isBlank();
        java.util.List<org.jsoup.nodes.Node> nodeList5 = textNode2.childNodes();
        java.lang.String str6 = textNode2.baseUri();
        int int7 = textNode2.childNodeSize();
        boolean boolean9 = textNode2.hasAttr("");
        java.util.List<org.jsoup.nodes.Node> nodeList10 = textNode2.siblingNodes();
        java.lang.String str11 = textNode2.nodeName();
        org.jsoup.nodes.Attributes attributes12 = textNode2.attributes();
        org.jsoup.nodes.Attributes attributes13 = textNode2.attributes();
        org.jsoup.nodes.TextNode textNode15 = textNode2.text("#");
        boolean boolean17 = textNode15.hasAttr("#");
        org.jsoup.nodes.Node node18 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node19 = textNode15.after(node18);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(textNode2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(nodeList5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(nodeList10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "#text" + "'", str11, "#text");
        org.junit.Assert.assertNotNull(attributes12);
        org.junit.Assert.assertNotNull(attributes13);
        org.junit.Assert.assertNotNull(textNode15);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test20637() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20637");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("", "");
        boolean boolean3 = textNode2.isBlank();
        org.jsoup.nodes.Node node4 = textNode2.previousSibling();
        org.jsoup.nodes.Node node7 = textNode2.attr("hi!", "");
        java.lang.String str8 = textNode2.baseUri();
        java.lang.String str9 = textNode2.outerHtml();
        org.jsoup.nodes.TextNode textNode11 = textNode2.text("#text");
        int int12 = textNode11.childNodeSize();
        org.jsoup.nodes.TextNode textNode14 = textNode11.text("hi!");
        java.lang.String str15 = textNode14.outerHtml();
        org.jsoup.nodes.Node node17 = textNode14.removeAttr("i!");
        java.lang.String str18 = textNode14.nodeName();
        boolean boolean19 = textNode14.isBlank();
        org.jsoup.nodes.Node node20 = textNode14.parent();
        boolean boolean22 = textNode14.hasAttr("hi!");
        org.junit.Assert.assertNotNull(textNode2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNull(node4);
        org.junit.Assert.assertNotNull(node7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNotNull(textNode11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNotNull(textNode14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertNotNull(node17);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "#text" + "'", str18, "#text");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNull(node20);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
    }

    @Test
    public void test20638() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20638");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("", "");
        boolean boolean3 = textNode2.isBlank();
        org.jsoup.nodes.Node node4 = textNode2.previousSibling();
        org.jsoup.nodes.Node node7 = textNode2.attr("hi!", "");
        java.lang.String str8 = textNode2.baseUri();
        boolean boolean9 = textNode2.isBlank();
        org.jsoup.nodes.Node node10 = textNode2.nextSibling();
        java.lang.String str11 = textNode2.toString();
        org.jsoup.nodes.Document document12 = textNode2.ownerDocument();
        textNode2.setBaseUri("");
        org.jsoup.nodes.Node node15 = textNode2.nextSibling();
        org.jsoup.nodes.Node node17 = textNode2.removeAttr("i!");
        org.jsoup.nodes.Node node18 = textNode2.parent();
        org.junit.Assert.assertNotNull(textNode2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNull(node4);
        org.junit.Assert.assertNotNull(node7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNull(node10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNull(document12);
        org.junit.Assert.assertNull(node15);
        org.junit.Assert.assertNotNull(node17);
        org.junit.Assert.assertNull(node18);
    }

    @Test
    public void test20639() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20639");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("", "");
        boolean boolean3 = textNode2.isBlank();
        org.jsoup.nodes.Node node6 = textNode2.attr("#text", "");
        java.lang.String str8 = textNode2.attr("");
        org.jsoup.nodes.Node node9 = textNode2.clone();
        org.jsoup.nodes.TextNode textNode11 = textNode2.text("");
        java.lang.String str13 = textNode2.attr("");
        java.lang.String str14 = textNode2.nodeName();
        boolean boolean16 = textNode2.hasAttr("#text");
        java.lang.String str17 = textNode2.outerHtml();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node19 = textNode2.before("h");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(textNode2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(node6);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNotNull(node9);
        org.junit.Assert.assertNotNull(textNode11);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "#text" + "'", str14, "#text");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
    }

    @Test
    public void test20640() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20640");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("", "");
        boolean boolean3 = textNode2.isBlank();
        org.jsoup.nodes.Node node4 = textNode2.previousSibling();
        org.jsoup.nodes.Node node5 = textNode2.parent();
        java.lang.String str7 = textNode2.absUrl("#text");
        org.jsoup.nodes.Node node8 = textNode2.previousSibling();
        java.lang.String str9 = textNode2.outerHtml();
        java.lang.String str10 = textNode2.nodeName();
        boolean boolean12 = textNode2.hasAttr("h");
        org.jsoup.nodes.Node node14 = textNode2.removeAttr("hi!");
        java.lang.String str16 = textNode2.absUrl("#text");
        org.junit.Assert.assertNotNull(textNode2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNull(node4);
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNull(node8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "#text" + "'", str10, "#text");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(node14);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
    }

    @Test
    public void test20641() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20641");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("", "");
        boolean boolean3 = textNode2.isBlank();
        org.jsoup.nodes.Node node4 = textNode2.previousSibling();
        org.jsoup.nodes.Node node7 = textNode2.attr("hi!", "");
        java.lang.String str8 = textNode2.baseUri();
        java.lang.String str9 = textNode2.outerHtml();
        java.util.List<org.jsoup.nodes.Node> nodeList10 = textNode2.childNodesCopy();
        org.jsoup.nodes.Node node11 = textNode2.clone();
        org.jsoup.nodes.Node node12 = textNode2.clone();
        org.jsoup.nodes.TextNode textNode14 = textNode2.text("");
        textNode2.setBaseUri("");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str18 = textNode2.absUrl("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: String must not be empty");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(textNode2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNull(node4);
        org.junit.Assert.assertNotNull(node7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNotNull(nodeList10);
        org.junit.Assert.assertNotNull(node11);
        org.junit.Assert.assertNotNull(node12);
        org.junit.Assert.assertNotNull(textNode14);
    }

    @Test
    public void test20642() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20642");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("", "");
        boolean boolean3 = textNode2.isBlank();
        org.jsoup.nodes.Node node4 = textNode2.previousSibling();
        org.jsoup.nodes.Node node5 = textNode2.parent();
        java.lang.String str7 = textNode2.absUrl("#text");
        java.lang.String str8 = textNode2.text();
        org.jsoup.nodes.Node node9 = textNode2.nextSibling();
        java.lang.String str11 = textNode2.attr("");
        org.jsoup.nodes.TextNode textNode14 = new org.jsoup.nodes.TextNode("", "");
        java.lang.String str15 = textNode14.outerHtml();
        org.jsoup.nodes.TextNode textNode17 = textNode14.text("");
        boolean boolean18 = textNode2.equals((java.lang.Object) "");
        boolean boolean20 = textNode2.hasAttr("#text");
        int int21 = textNode2.siblingIndex();
        java.util.List<org.jsoup.nodes.Node> nodeList22 = textNode2.childNodesCopy();
        org.jsoup.nodes.Attributes attributes23 = textNode2.attributes();
        org.jsoup.nodes.Node node24 = textNode2.clone();
        org.junit.Assert.assertNotNull(textNode2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNull(node4);
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNull(node9);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertNotNull(textNode17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertNotNull(nodeList22);
        org.junit.Assert.assertNotNull(attributes23);
        org.junit.Assert.assertNotNull(node24);
    }

    @Test
    public void test20643() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20643");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("", "");
        boolean boolean3 = textNode2.isBlank();
        boolean boolean4 = textNode2.isBlank();
        java.util.List<org.jsoup.nodes.Node> nodeList5 = textNode2.childNodes();
        org.jsoup.nodes.TextNode textNode7 = textNode2.text("");
        textNode2.setBaseUri("");
        org.jsoup.nodes.Node node10 = textNode2.nextSibling();
        org.jsoup.nodes.Document document11 = textNode2.ownerDocument();
        org.jsoup.nodes.Node node12 = textNode2.clone();
        int int13 = textNode2.siblingIndex();
        org.jsoup.nodes.Node node15 = textNode2.removeAttr("h");
        org.jsoup.nodes.Node node16 = textNode2.nextSibling();
        org.junit.Assert.assertNotNull(textNode2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(nodeList5);
        org.junit.Assert.assertNotNull(textNode7);
        org.junit.Assert.assertNull(node10);
        org.junit.Assert.assertNull(document11);
        org.junit.Assert.assertNotNull(node12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNotNull(node15);
        org.junit.Assert.assertNull(node16);
    }

    @Test
    public void test20644() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20644");
        org.jsoup.nodes.Document.OutputSettings outputSettings0 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Document.OutputSettings outputSettings1 = new org.jsoup.nodes.Document.OutputSettings();
        int int2 = outputSettings1.indentAmount();
        org.jsoup.nodes.Entities.EscapeMode escapeMode3 = outputSettings1.escapeMode();
        org.jsoup.nodes.Document.OutputSettings outputSettings4 = outputSettings0.escapeMode(escapeMode3);
        org.jsoup.nodes.Document.OutputSettings outputSettings6 = outputSettings0.indentAmount((int) (short) 100);
        org.jsoup.nodes.Document.OutputSettings outputSettings7 = new org.jsoup.nodes.Document.OutputSettings();
        boolean boolean8 = outputSettings7.prettyPrint();
        org.jsoup.nodes.Document.OutputSettings outputSettings10 = outputSettings7.prettyPrint(false);
        org.jsoup.nodes.Document.OutputSettings outputSettings11 = new org.jsoup.nodes.Document.OutputSettings();
        boolean boolean12 = outputSettings11.prettyPrint();
        org.jsoup.nodes.Document.OutputSettings outputSettings13 = new org.jsoup.nodes.Document.OutputSettings();
        int int14 = outputSettings13.indentAmount();
        org.jsoup.nodes.Entities.EscapeMode escapeMode15 = outputSettings13.escapeMode();
        java.nio.charset.Charset charset16 = outputSettings13.charset();
        org.jsoup.nodes.Document.OutputSettings outputSettings17 = outputSettings11.charset(charset16);
        org.jsoup.nodes.Document.OutputSettings outputSettings18 = outputSettings10.charset(charset16);
        org.jsoup.nodes.Document.OutputSettings outputSettings19 = outputSettings6.charset(charset16);
        org.jsoup.nodes.Entities.EscapeMode escapeMode20 = outputSettings19.escapeMode();
        org.jsoup.nodes.Document.OutputSettings outputSettings21 = outputSettings19.clone();
        java.nio.charset.Charset charset22 = outputSettings19.charset();
        int int23 = outputSettings19.indentAmount();
        org.jsoup.nodes.Entities.EscapeMode escapeMode24 = outputSettings19.escapeMode();
        org.jsoup.nodes.Document.OutputSettings outputSettings26 = outputSettings19.prettyPrint(false);
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Document.OutputSettings outputSettings28 = outputSettings26.charset("!");
            org.junit.Assert.fail("Expected exception of type java.nio.charset.IllegalCharsetNameException; message: !");
        } catch (java.nio.charset.IllegalCharsetNameException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
        org.junit.Assert.assertTrue("'" + escapeMode3 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode3.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertNotNull(outputSettings4);
        org.junit.Assert.assertNotNull(outputSettings6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(outputSettings10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertTrue("'" + escapeMode15 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode15.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertNotNull(charset16);
        org.junit.Assert.assertNotNull(outputSettings17);
        org.junit.Assert.assertNotNull(outputSettings18);
        org.junit.Assert.assertNotNull(outputSettings19);
        org.junit.Assert.assertTrue("'" + escapeMode20 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode20.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertNotNull(outputSettings21);
        org.junit.Assert.assertNotNull(charset22);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 100 + "'", int23 == 100);
        org.junit.Assert.assertTrue("'" + escapeMode24 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode24.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertNotNull(outputSettings26);
    }

    @Test
    public void test20645() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20645");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("", "");
        boolean boolean3 = textNode2.isBlank();
        org.jsoup.nodes.Node node4 = textNode2.previousSibling();
        org.jsoup.nodes.Node node7 = textNode2.attr("hi!", "");
        java.lang.String str8 = textNode2.baseUri();
        java.lang.String str9 = textNode2.outerHtml();
        java.util.List<org.jsoup.nodes.Node> nodeList10 = textNode2.childNodesCopy();
        java.lang.Object obj11 = null;
        boolean boolean12 = textNode2.equals(obj11);
        org.jsoup.nodes.TextNode textNode14 = textNode2.text("i!");
        org.jsoup.nodes.TextNode textNode16 = textNode14.text("i");
        org.junit.Assert.assertNotNull(textNode2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNull(node4);
        org.junit.Assert.assertNotNull(node7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNotNull(nodeList10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(textNode14);
        org.junit.Assert.assertNotNull(textNode16);
    }

    @Test
    public void test20646() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20646");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("hi!", "hi!");
        java.lang.String str3 = textNode2.nodeName();
        org.jsoup.nodes.Attributes attributes4 = textNode2.attributes();
        java.lang.String str6 = textNode2.attr("text");
        org.junit.Assert.assertNotNull(textNode2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "#text" + "'", str3, "#text");
        org.junit.Assert.assertNotNull(attributes4);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
    }

    @Test
    public void test20647() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20647");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("", "");
        boolean boolean3 = textNode2.isBlank();
        org.jsoup.nodes.Node node4 = textNode2.previousSibling();
        org.jsoup.nodes.Node node7 = textNode2.attr("hi!", "");
        java.lang.String str8 = textNode2.baseUri();
        java.lang.String str9 = textNode2.outerHtml();
        java.util.List<org.jsoup.nodes.Node> nodeList10 = textNode2.childNodesCopy();
        java.lang.String str11 = textNode2.baseUri();
        org.jsoup.nodes.Node node12 = textNode2.nextSibling();
        org.jsoup.nodes.Node node13 = textNode2.previousSibling();
        org.jsoup.nodes.TextNode textNode15 = textNode2.text("#text");
        org.jsoup.nodes.Node node17 = textNode15.removeAttr("#");
        org.jsoup.nodes.Node node18 = node17.clone();
        java.lang.String str19 = node18.baseUri();
        org.junit.Assert.assertNotNull(textNode2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNull(node4);
        org.junit.Assert.assertNotNull(node7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNotNull(nodeList10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNull(node12);
        org.junit.Assert.assertNull(node13);
        org.junit.Assert.assertNotNull(textNode15);
        org.junit.Assert.assertNotNull(node17);
        org.junit.Assert.assertNotNull(node18);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
    }

    @Test
    public void test20648() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20648");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("", "");
        boolean boolean3 = textNode2.isBlank();
        org.jsoup.nodes.Node node4 = textNode2.previousSibling();
        org.jsoup.nodes.Node node7 = textNode2.attr("hi!", "");
        java.lang.String str8 = textNode2.baseUri();
        java.lang.String str9 = textNode2.outerHtml();
        java.util.List<org.jsoup.nodes.Node> nodeList10 = textNode2.childNodesCopy();
        org.jsoup.nodes.Node node11 = textNode2.clone();
        org.jsoup.nodes.TextNode textNode14 = org.jsoup.nodes.TextNode.createFromEncoded("hi!", "hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList15 = textNode14.childNodes();
        boolean boolean16 = node11.equals((java.lang.Object) textNode14);
        org.jsoup.nodes.TextNode textNode18 = textNode14.text("hi!");
        org.jsoup.nodes.Node node19 = textNode14.previousSibling();
        org.jsoup.nodes.Node node22 = textNode14.attr("#text", "hi!");
        org.jsoup.nodes.Node node23 = textNode14.previousSibling();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str24 = node23.baseUri();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(textNode2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNull(node4);
        org.junit.Assert.assertNotNull(node7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNotNull(nodeList10);
        org.junit.Assert.assertNotNull(node11);
        org.junit.Assert.assertNotNull(textNode14);
        org.junit.Assert.assertNotNull(nodeList15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(textNode18);
        org.junit.Assert.assertNull(node19);
        org.junit.Assert.assertNotNull(node22);
        org.junit.Assert.assertNull(node23);
    }

    @Test
    public void test20649() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20649");
        org.jsoup.nodes.Document.OutputSettings outputSettings0 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Document.OutputSettings outputSettings1 = new org.jsoup.nodes.Document.OutputSettings();
        int int2 = outputSettings1.indentAmount();
        org.jsoup.nodes.Entities.EscapeMode escapeMode3 = outputSettings1.escapeMode();
        org.jsoup.nodes.Document.OutputSettings outputSettings4 = outputSettings0.escapeMode(escapeMode3);
        org.jsoup.nodes.Document.OutputSettings outputSettings6 = outputSettings0.indentAmount((int) (short) 100);
        org.jsoup.nodes.Document.OutputSettings outputSettings8 = outputSettings6.prettyPrint(false);
        org.jsoup.nodes.Document.OutputSettings outputSettings9 = outputSettings6.clone();
        org.jsoup.nodes.Document.OutputSettings outputSettings11 = outputSettings9.prettyPrint(true);
        org.jsoup.nodes.Entities.EscapeMode escapeMode12 = outputSettings9.escapeMode();
        org.jsoup.nodes.Document.OutputSettings outputSettings14 = outputSettings9.indentAmount((int) ' ');
        int int15 = outputSettings9.indentAmount();
        int int16 = outputSettings9.indentAmount();
        java.nio.charset.Charset charset17 = outputSettings9.charset();
        org.jsoup.nodes.Document.OutputSettings outputSettings19 = outputSettings9.prettyPrint(true);
        org.jsoup.nodes.Document.OutputSettings outputSettings20 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Document.OutputSettings outputSettings21 = new org.jsoup.nodes.Document.OutputSettings();
        int int22 = outputSettings21.indentAmount();
        org.jsoup.nodes.Entities.EscapeMode escapeMode23 = outputSettings21.escapeMode();
        org.jsoup.nodes.Document.OutputSettings outputSettings24 = outputSettings20.escapeMode(escapeMode23);
        org.jsoup.nodes.Document.OutputSettings outputSettings26 = outputSettings20.indentAmount((int) (short) 100);
        org.jsoup.nodes.Document.OutputSettings outputSettings27 = new org.jsoup.nodes.Document.OutputSettings();
        boolean boolean28 = outputSettings27.prettyPrint();
        org.jsoup.nodes.Document.OutputSettings outputSettings30 = outputSettings27.prettyPrint(false);
        org.jsoup.nodes.Document.OutputSettings outputSettings32 = outputSettings27.indentAmount((int) '#');
        org.jsoup.nodes.Entities.EscapeMode escapeMode33 = outputSettings27.escapeMode();
        org.jsoup.nodes.Document.OutputSettings outputSettings34 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Entities.EscapeMode escapeMode35 = outputSettings34.escapeMode();
        org.jsoup.nodes.Document.OutputSettings outputSettings36 = outputSettings34.clone();
        org.jsoup.nodes.Document.OutputSettings outputSettings37 = new org.jsoup.nodes.Document.OutputSettings();
        int int38 = outputSettings37.indentAmount();
        org.jsoup.nodes.Entities.EscapeMode escapeMode39 = outputSettings37.escapeMode();
        java.nio.charset.Charset charset40 = outputSettings37.charset();
        org.jsoup.nodes.Document.OutputSettings outputSettings41 = outputSettings34.charset(charset40);
        org.jsoup.nodes.Document.OutputSettings outputSettings42 = outputSettings27.charset(charset40);
        org.jsoup.nodes.Document.OutputSettings outputSettings43 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Document.OutputSettings outputSettings44 = new org.jsoup.nodes.Document.OutputSettings();
        int int45 = outputSettings44.indentAmount();
        org.jsoup.nodes.Entities.EscapeMode escapeMode46 = outputSettings44.escapeMode();
        org.jsoup.nodes.Document.OutputSettings outputSettings47 = outputSettings43.escapeMode(escapeMode46);
        org.jsoup.nodes.Document.OutputSettings outputSettings48 = outputSettings43.clone();
        org.jsoup.nodes.Document.OutputSettings outputSettings49 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Document.OutputSettings outputSettings50 = outputSettings49.clone();
        boolean boolean51 = outputSettings50.prettyPrint();
        org.jsoup.nodes.Document.OutputSettings outputSettings52 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Document.OutputSettings outputSettings53 = new org.jsoup.nodes.Document.OutputSettings();
        int int54 = outputSettings53.indentAmount();
        org.jsoup.nodes.Entities.EscapeMode escapeMode55 = outputSettings53.escapeMode();
        org.jsoup.nodes.Document.OutputSettings outputSettings56 = outputSettings52.escapeMode(escapeMode55);
        org.jsoup.nodes.Document.OutputSettings outputSettings57 = outputSettings50.escapeMode(escapeMode55);
        org.jsoup.nodes.Document.OutputSettings outputSettings58 = outputSettings43.escapeMode(escapeMode55);
        org.jsoup.nodes.Document.OutputSettings outputSettings59 = outputSettings42.escapeMode(escapeMode55);
        java.nio.charset.Charset charset60 = outputSettings59.charset();
        org.jsoup.nodes.Document.OutputSettings outputSettings61 = outputSettings26.charset(charset60);
        org.jsoup.nodes.Entities.EscapeMode escapeMode62 = outputSettings26.escapeMode();
        org.jsoup.nodes.Document.OutputSettings outputSettings63 = outputSettings9.escapeMode(escapeMode62);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
        org.junit.Assert.assertTrue("'" + escapeMode3 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode3.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertNotNull(outputSettings4);
        org.junit.Assert.assertNotNull(outputSettings6);
        org.junit.Assert.assertNotNull(outputSettings8);
        org.junit.Assert.assertNotNull(outputSettings9);
        org.junit.Assert.assertNotNull(outputSettings11);
        org.junit.Assert.assertTrue("'" + escapeMode12 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode12.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertNotNull(outputSettings14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 32 + "'", int15 == 32);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 32 + "'", int16 == 32);
        org.junit.Assert.assertNotNull(charset17);
        org.junit.Assert.assertNotNull(outputSettings19);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 1 + "'", int22 == 1);
        org.junit.Assert.assertTrue("'" + escapeMode23 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode23.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertNotNull(outputSettings24);
        org.junit.Assert.assertNotNull(outputSettings26);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertNotNull(outputSettings30);
        org.junit.Assert.assertNotNull(outputSettings32);
        org.junit.Assert.assertTrue("'" + escapeMode33 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode33.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertTrue("'" + escapeMode35 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode35.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertNotNull(outputSettings36);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 1 + "'", int38 == 1);
        org.junit.Assert.assertTrue("'" + escapeMode39 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode39.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertNotNull(charset40);
        org.junit.Assert.assertNotNull(outputSettings41);
        org.junit.Assert.assertNotNull(outputSettings42);
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + 1 + "'", int45 == 1);
        org.junit.Assert.assertTrue("'" + escapeMode46 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode46.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertNotNull(outputSettings47);
        org.junit.Assert.assertNotNull(outputSettings48);
        org.junit.Assert.assertNotNull(outputSettings50);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + true + "'", boolean51 == true);
        org.junit.Assert.assertTrue("'" + int54 + "' != '" + 1 + "'", int54 == 1);
        org.junit.Assert.assertTrue("'" + escapeMode55 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode55.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertNotNull(outputSettings56);
        org.junit.Assert.assertNotNull(outputSettings57);
        org.junit.Assert.assertNotNull(outputSettings58);
        org.junit.Assert.assertNotNull(outputSettings59);
        org.junit.Assert.assertNotNull(charset60);
        org.junit.Assert.assertNotNull(outputSettings61);
        org.junit.Assert.assertTrue("'" + escapeMode62 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode62.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertNotNull(outputSettings63);
    }

    @Test
    public void test20650() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20650");
        org.jsoup.nodes.Document.OutputSettings outputSettings0 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Entities.EscapeMode escapeMode1 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings2 = outputSettings0.escapeMode(escapeMode1);
        boolean boolean3 = outputSettings2.prettyPrint();
        org.jsoup.nodes.Document.OutputSettings outputSettings4 = new org.jsoup.nodes.Document.OutputSettings();
        boolean boolean5 = outputSettings4.prettyPrint();
        org.jsoup.nodes.Document.OutputSettings outputSettings7 = outputSettings4.prettyPrint(false);
        org.jsoup.nodes.Document.OutputSettings outputSettings9 = outputSettings4.indentAmount((int) '#');
        org.jsoup.nodes.Document.OutputSettings outputSettings10 = new org.jsoup.nodes.Document.OutputSettings();
        boolean boolean11 = outputSettings10.prettyPrint();
        org.jsoup.nodes.Document.OutputSettings outputSettings12 = new org.jsoup.nodes.Document.OutputSettings();
        int int13 = outputSettings12.indentAmount();
        org.jsoup.nodes.Entities.EscapeMode escapeMode14 = outputSettings12.escapeMode();
        java.nio.charset.Charset charset15 = outputSettings12.charset();
        org.jsoup.nodes.Document.OutputSettings outputSettings16 = outputSettings10.charset(charset15);
        java.nio.charset.Charset charset17 = outputSettings16.charset();
        org.jsoup.nodes.Document.OutputSettings outputSettings18 = outputSettings9.charset(charset17);
        org.jsoup.nodes.Document.OutputSettings outputSettings19 = outputSettings2.charset(charset17);
        boolean boolean20 = outputSettings2.prettyPrint();
        boolean boolean21 = outputSettings2.prettyPrint();
        org.jsoup.nodes.Entities.EscapeMode escapeMode22 = outputSettings2.escapeMode();
        org.jsoup.nodes.Entities.EscapeMode escapeMode23 = outputSettings2.escapeMode();
        org.jsoup.nodes.Document.OutputSettings outputSettings25 = outputSettings2.prettyPrint(false);
        org.junit.Assert.assertNotNull(outputSettings2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(outputSettings7);
        org.junit.Assert.assertNotNull(outputSettings9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertTrue("'" + escapeMode14 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode14.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertNotNull(charset15);
        org.junit.Assert.assertNotNull(outputSettings16);
        org.junit.Assert.assertNotNull(charset17);
        org.junit.Assert.assertNotNull(outputSettings18);
        org.junit.Assert.assertNotNull(outputSettings19);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertNull(escapeMode22);
        org.junit.Assert.assertNull(escapeMode23);
        org.junit.Assert.assertNotNull(outputSettings25);
    }

    @Test
    public void test20651() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20651");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("#text", "hi!");
        int int3 = textNode2.childNodeSize();
        org.jsoup.nodes.Node node4 = textNode2.clone();
        org.jsoup.nodes.Node node5 = textNode2.clone();
        org.jsoup.nodes.TextNode textNode7 = textNode2.text("#text");
        org.jsoup.nodes.Node node8 = textNode7.parent();
        boolean boolean10 = textNode7.hasAttr("");
        org.jsoup.nodes.Node node12 = textNode7.removeAttr("#");
        java.lang.String str13 = textNode7.getWholeText();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node15 = textNode7.childNode((int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 100");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(textNode2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(node4);
        org.junit.Assert.assertNotNull(node5);
        org.junit.Assert.assertNotNull(textNode7);
        org.junit.Assert.assertNull(node8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(node12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "#text" + "'", str13, "#text");
    }

    @Test
    public void test20652() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20652");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("", "");
        boolean boolean3 = textNode2.isBlank();
        org.jsoup.nodes.Node node4 = textNode2.previousSibling();
        java.lang.String str5 = textNode2.nodeName();
        org.jsoup.nodes.Node node6 = textNode2.nextSibling();
        boolean boolean7 = textNode2.isBlank();
        java.util.List<org.jsoup.nodes.Node> nodeList8 = textNode2.childNodesCopy();
        org.jsoup.nodes.TextNode textNode10 = textNode2.text("");
        org.jsoup.nodes.Node node13 = textNode10.attr("hi!", "");
        int int14 = textNode10.childNodeSize();
        textNode10.setBaseUri("");
        org.jsoup.nodes.TextNode textNode18 = textNode10.text("#");
        org.jsoup.nodes.Node node21 = textNode10.attr("i!", "");
        org.jsoup.nodes.Node node22 = textNode10.previousSibling();
        java.lang.String str24 = textNode10.attr("i");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node26 = textNode10.after("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(textNode2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNull(node4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "#text" + "'", str5, "#text");
        org.junit.Assert.assertNull(node6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(nodeList8);
        org.junit.Assert.assertNotNull(textNode10);
        org.junit.Assert.assertNotNull(node13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertNotNull(textNode18);
        org.junit.Assert.assertNotNull(node21);
        org.junit.Assert.assertNull(node22);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "" + "'", str24, "");
    }

    @Test
    public void test20653() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20653");
        org.jsoup.nodes.Document.OutputSettings outputSettings0 = new org.jsoup.nodes.Document.OutputSettings();
        boolean boolean1 = outputSettings0.prettyPrint();
        org.jsoup.nodes.Document.OutputSettings outputSettings3 = outputSettings0.prettyPrint(false);
        org.jsoup.nodes.Document.OutputSettings outputSettings5 = outputSettings3.prettyPrint(false);
        org.jsoup.nodes.Document.OutputSettings outputSettings6 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Entities.EscapeMode escapeMode7 = outputSettings6.escapeMode();
        java.nio.charset.Charset charset8 = outputSettings6.charset();
        org.jsoup.nodes.Document.OutputSettings outputSettings9 = outputSettings3.charset(charset8);
        org.jsoup.nodes.Document.OutputSettings outputSettings11 = outputSettings3.indentAmount(10);
        org.jsoup.nodes.Document.OutputSettings outputSettings12 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Document.OutputSettings outputSettings13 = outputSettings12.clone();
        org.jsoup.nodes.Document.OutputSettings outputSettings15 = outputSettings12.prettyPrint(true);
        org.jsoup.nodes.Document.OutputSettings outputSettings16 = outputSettings15.clone();
        org.jsoup.nodes.Document.OutputSettings outputSettings18 = outputSettings15.prettyPrint(false);
        org.jsoup.nodes.Entities.EscapeMode escapeMode19 = outputSettings15.escapeMode();
        org.jsoup.nodes.Document.OutputSettings outputSettings20 = outputSettings15.clone();
        org.jsoup.nodes.Document.OutputSettings outputSettings21 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Document.OutputSettings outputSettings22 = outputSettings21.clone();
        org.jsoup.nodes.Document.OutputSettings outputSettings24 = outputSettings21.prettyPrint(true);
        int int25 = outputSettings24.indentAmount();
        int int26 = outputSettings24.indentAmount();
        org.jsoup.nodes.Entities.EscapeMode escapeMode27 = outputSettings24.escapeMode();
        org.jsoup.nodes.Document.OutputSettings outputSettings28 = outputSettings20.escapeMode(escapeMode27);
        org.jsoup.nodes.Document.OutputSettings outputSettings29 = outputSettings3.escapeMode(escapeMode27);
        org.jsoup.nodes.Document.OutputSettings outputSettings30 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Entities.EscapeMode escapeMode31 = outputSettings30.escapeMode();
        boolean boolean32 = outputSettings30.prettyPrint();
        org.jsoup.nodes.Document.OutputSettings outputSettings33 = outputSettings30.clone();
        org.jsoup.nodes.Document.OutputSettings outputSettings35 = outputSettings33.indentAmount((int) (short) 1);
        int int36 = outputSettings33.indentAmount();
        org.jsoup.nodes.Document.OutputSettings outputSettings38 = outputSettings33.prettyPrint(true);
        org.jsoup.nodes.Document.OutputSettings outputSettings40 = outputSettings38.prettyPrint(false);
        org.jsoup.nodes.Document.OutputSettings outputSettings42 = outputSettings38.indentAmount(0);
        org.jsoup.nodes.Document.OutputSettings outputSettings43 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Document.OutputSettings outputSettings44 = new org.jsoup.nodes.Document.OutputSettings();
        int int45 = outputSettings44.indentAmount();
        org.jsoup.nodes.Entities.EscapeMode escapeMode46 = outputSettings44.escapeMode();
        org.jsoup.nodes.Document.OutputSettings outputSettings47 = outputSettings43.escapeMode(escapeMode46);
        org.jsoup.nodes.Document.OutputSettings outputSettings49 = outputSettings43.indentAmount((int) (short) 100);
        org.jsoup.nodes.Document.OutputSettings outputSettings50 = new org.jsoup.nodes.Document.OutputSettings();
        boolean boolean51 = outputSettings50.prettyPrint();
        org.jsoup.nodes.Document.OutputSettings outputSettings53 = outputSettings50.prettyPrint(false);
        org.jsoup.nodes.Document.OutputSettings outputSettings54 = new org.jsoup.nodes.Document.OutputSettings();
        boolean boolean55 = outputSettings54.prettyPrint();
        org.jsoup.nodes.Document.OutputSettings outputSettings56 = new org.jsoup.nodes.Document.OutputSettings();
        int int57 = outputSettings56.indentAmount();
        org.jsoup.nodes.Entities.EscapeMode escapeMode58 = outputSettings56.escapeMode();
        java.nio.charset.Charset charset59 = outputSettings56.charset();
        org.jsoup.nodes.Document.OutputSettings outputSettings60 = outputSettings54.charset(charset59);
        org.jsoup.nodes.Document.OutputSettings outputSettings61 = outputSettings53.charset(charset59);
        org.jsoup.nodes.Document.OutputSettings outputSettings62 = outputSettings49.charset(charset59);
        boolean boolean63 = outputSettings62.prettyPrint();
        org.jsoup.nodes.Document.OutputSettings outputSettings64 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Entities.EscapeMode escapeMode65 = outputSettings64.escapeMode();
        org.jsoup.nodes.Document.OutputSettings outputSettings66 = outputSettings64.clone();
        org.jsoup.nodes.Document.OutputSettings outputSettings67 = new org.jsoup.nodes.Document.OutputSettings();
        int int68 = outputSettings67.indentAmount();
        org.jsoup.nodes.Entities.EscapeMode escapeMode69 = outputSettings67.escapeMode();
        java.nio.charset.Charset charset70 = outputSettings67.charset();
        org.jsoup.nodes.Document.OutputSettings outputSettings71 = outputSettings64.charset(charset70);
        org.jsoup.nodes.Document.OutputSettings outputSettings72 = outputSettings62.charset(charset70);
        org.jsoup.nodes.Document.OutputSettings outputSettings73 = outputSettings38.charset(charset70);
        org.jsoup.nodes.Document.OutputSettings outputSettings74 = outputSettings29.charset(charset70);
        int int75 = outputSettings29.indentAmount();
        org.jsoup.nodes.Document.OutputSettings outputSettings76 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Document.OutputSettings outputSettings77 = outputSettings76.clone();
        org.jsoup.nodes.Document.OutputSettings outputSettings79 = outputSettings77.prettyPrint(false);
        java.nio.charset.Charset charset80 = outputSettings79.charset();
        org.jsoup.nodes.Document.OutputSettings outputSettings81 = outputSettings29.charset(charset80);
        boolean boolean82 = outputSettings29.prettyPrint();
        boolean boolean83 = outputSettings29.prettyPrint();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertNotNull(outputSettings3);
        org.junit.Assert.assertNotNull(outputSettings5);
        org.junit.Assert.assertTrue("'" + escapeMode7 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode7.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertNotNull(charset8);
        org.junit.Assert.assertNotNull(outputSettings9);
        org.junit.Assert.assertNotNull(outputSettings11);
        org.junit.Assert.assertNotNull(outputSettings13);
        org.junit.Assert.assertNotNull(outputSettings15);
        org.junit.Assert.assertNotNull(outputSettings16);
        org.junit.Assert.assertNotNull(outputSettings18);
        org.junit.Assert.assertTrue("'" + escapeMode19 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode19.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertNotNull(outputSettings20);
        org.junit.Assert.assertNotNull(outputSettings22);
        org.junit.Assert.assertNotNull(outputSettings24);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 1 + "'", int25 == 1);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 1 + "'", int26 == 1);
        org.junit.Assert.assertTrue("'" + escapeMode27 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode27.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertNotNull(outputSettings28);
        org.junit.Assert.assertNotNull(outputSettings29);
        org.junit.Assert.assertTrue("'" + escapeMode31 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode31.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + true + "'", boolean32 == true);
        org.junit.Assert.assertNotNull(outputSettings33);
        org.junit.Assert.assertNotNull(outputSettings35);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 1 + "'", int36 == 1);
        org.junit.Assert.assertNotNull(outputSettings38);
        org.junit.Assert.assertNotNull(outputSettings40);
        org.junit.Assert.assertNotNull(outputSettings42);
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + 1 + "'", int45 == 1);
        org.junit.Assert.assertTrue("'" + escapeMode46 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode46.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertNotNull(outputSettings47);
        org.junit.Assert.assertNotNull(outputSettings49);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + true + "'", boolean51 == true);
        org.junit.Assert.assertNotNull(outputSettings53);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + true + "'", boolean55 == true);
        org.junit.Assert.assertTrue("'" + int57 + "' != '" + 1 + "'", int57 == 1);
        org.junit.Assert.assertTrue("'" + escapeMode58 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode58.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertNotNull(charset59);
        org.junit.Assert.assertNotNull(outputSettings60);
        org.junit.Assert.assertNotNull(outputSettings61);
        org.junit.Assert.assertNotNull(outputSettings62);
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + true + "'", boolean63 == true);
        org.junit.Assert.assertTrue("'" + escapeMode65 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode65.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertNotNull(outputSettings66);
        org.junit.Assert.assertTrue("'" + int68 + "' != '" + 1 + "'", int68 == 1);
        org.junit.Assert.assertTrue("'" + escapeMode69 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode69.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertNotNull(charset70);
        org.junit.Assert.assertNotNull(outputSettings71);
        org.junit.Assert.assertNotNull(outputSettings72);
        org.junit.Assert.assertNotNull(outputSettings73);
        org.junit.Assert.assertNotNull(outputSettings74);
        org.junit.Assert.assertTrue("'" + int75 + "' != '" + 10 + "'", int75 == 10);
        org.junit.Assert.assertNotNull(outputSettings77);
        org.junit.Assert.assertNotNull(outputSettings79);
        org.junit.Assert.assertNotNull(charset80);
        org.junit.Assert.assertNotNull(outputSettings81);
        org.junit.Assert.assertTrue("'" + boolean82 + "' != '" + false + "'", boolean82 == false);
        org.junit.Assert.assertTrue("'" + boolean83 + "' != '" + false + "'", boolean83 == false);
    }

    @Test
    public void test20654() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20654");
        org.jsoup.nodes.Document.OutputSettings outputSettings0 = new org.jsoup.nodes.Document.OutputSettings();
        boolean boolean1 = outputSettings0.prettyPrint();
        org.jsoup.nodes.Document.OutputSettings outputSettings3 = outputSettings0.prettyPrint(false);
        org.jsoup.nodes.Document.OutputSettings outputSettings4 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Entities.EscapeMode escapeMode5 = outputSettings4.escapeMode();
        org.jsoup.nodes.Document.OutputSettings outputSettings6 = outputSettings0.escapeMode(escapeMode5);
        org.jsoup.nodes.Document.OutputSettings outputSettings7 = outputSettings0.clone();
        org.jsoup.nodes.Document.OutputSettings outputSettings9 = outputSettings7.prettyPrint(false);
        boolean boolean10 = outputSettings7.prettyPrint();
        org.jsoup.nodes.Document.OutputSettings outputSettings11 = outputSettings7.clone();
        org.jsoup.nodes.Document.OutputSettings outputSettings13 = outputSettings11.prettyPrint(false);
        org.jsoup.nodes.Document.OutputSettings outputSettings14 = outputSettings13.clone();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertNotNull(outputSettings3);
        org.junit.Assert.assertTrue("'" + escapeMode5 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode5.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertNotNull(outputSettings6);
        org.junit.Assert.assertNotNull(outputSettings7);
        org.junit.Assert.assertNotNull(outputSettings9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(outputSettings11);
        org.junit.Assert.assertNotNull(outputSettings13);
        org.junit.Assert.assertNotNull(outputSettings14);
    }

    @Test
    public void test20655() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20655");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("", "");
        boolean boolean3 = textNode2.isBlank();
        org.jsoup.nodes.Node node6 = textNode2.attr("#text", "");
        java.lang.String str8 = textNode2.attr("");
        org.jsoup.nodes.Node node9 = textNode2.clone();
        org.jsoup.nodes.TextNode textNode11 = textNode2.text("");
        java.lang.String str13 = textNode2.attr("");
        java.lang.String str14 = textNode2.baseUri();
        org.jsoup.nodes.TextNode textNode16 = textNode2.text("text");
        java.util.List<org.jsoup.nodes.Node> nodeList17 = textNode16.childNodesCopy();
        org.junit.Assert.assertNotNull(textNode2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(node6);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNotNull(node9);
        org.junit.Assert.assertNotNull(textNode11);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertNotNull(textNode16);
        org.junit.Assert.assertNotNull(nodeList17);
    }

    @Test
    public void test20656() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20656");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("", "");
        boolean boolean3 = textNode2.isBlank();
        org.jsoup.nodes.Node node4 = textNode2.previousSibling();
        java.lang.String str5 = textNode2.nodeName();
        java.lang.String str6 = textNode2.getWholeText();
        java.lang.String str7 = textNode2.getWholeText();
        boolean boolean9 = textNode2.hasAttr("#text");
        java.lang.String str10 = textNode2.getWholeText();
        java.util.List<org.jsoup.nodes.Node> nodeList11 = textNode2.childNodesCopy();
        org.jsoup.nodes.TextNode textNode13 = textNode2.text("hi!");
        java.lang.String str15 = textNode13.attr("#");
        java.lang.String str16 = textNode13.baseUri();
        java.lang.String str17 = textNode13.toString();
        boolean boolean18 = textNode13.isBlank();
        org.jsoup.nodes.TextNode textNode21 = new org.jsoup.nodes.TextNode("", "hi!");
        java.lang.String str23 = textNode21.absUrl("hi!");
        org.jsoup.nodes.Node node24 = textNode21.parent();
        org.jsoup.nodes.TextNode textNode26 = textNode21.text("");
        org.jsoup.nodes.Node node28 = textNode21.removeAttr("hi!");
        org.jsoup.nodes.Node node29 = textNode21.nextSibling();
        java.util.List<org.jsoup.nodes.Node> nodeList30 = textNode21.childNodesCopy();
        boolean boolean31 = textNode21.isBlank();
        boolean boolean32 = textNode13.equals((java.lang.Object) textNode21);
        java.lang.String str33 = textNode21.nodeName();
        java.lang.String str34 = textNode21.text();
        java.lang.String str35 = textNode21.nodeName();
        org.jsoup.nodes.Node node38 = textNode21.attr("i", "text");
        org.junit.Assert.assertNotNull(textNode2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNull(node4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "#text" + "'", str5, "#text");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNotNull(nodeList11);
        org.junit.Assert.assertNotNull(textNode13);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
        org.junit.Assert.assertNull(node24);
        org.junit.Assert.assertNotNull(textNode26);
        org.junit.Assert.assertNotNull(node28);
        org.junit.Assert.assertNull(node29);
        org.junit.Assert.assertNotNull(nodeList30);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + true + "'", boolean31 == true);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "#text" + "'", str33, "#text");
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "" + "'", str34, "");
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "#text" + "'", str35, "#text");
        org.junit.Assert.assertNotNull(node38);
    }

    @Test
    public void test20657() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20657");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("", "");
        boolean boolean3 = textNode2.isBlank();
        org.jsoup.nodes.Node node4 = textNode2.previousSibling();
        java.lang.String str5 = textNode2.nodeName();
        org.jsoup.nodes.Node node6 = textNode2.nextSibling();
        boolean boolean7 = textNode2.isBlank();
        java.util.List<org.jsoup.nodes.Node> nodeList8 = textNode2.childNodesCopy();
        java.util.List<org.jsoup.nodes.Node> nodeList9 = textNode2.childNodesCopy();
        org.jsoup.nodes.TextNode textNode11 = textNode2.text("hi!");
        boolean boolean13 = textNode2.hasAttr("i!");
        org.jsoup.nodes.Node node16 = textNode2.attr("i!", "");
        org.jsoup.nodes.TextNode textNode18 = textNode2.text("");
        org.jsoup.nodes.TextNode textNode20 = textNode18.text("#text");
        org.jsoup.nodes.Document document21 = textNode20.ownerDocument();
        org.jsoup.nodes.Node node23 = textNode20.removeAttr("#text");
        org.jsoup.nodes.TextNode textNode26 = org.jsoup.nodes.TextNode.createFromEncoded("", "");
        boolean boolean27 = textNode26.isBlank();
        org.jsoup.nodes.Node node28 = textNode26.previousSibling();
        java.lang.String str29 = textNode26.nodeName();
        org.jsoup.nodes.Node node30 = textNode26.nextSibling();
        boolean boolean31 = textNode26.isBlank();
        java.lang.String str32 = textNode26.text();
        org.jsoup.nodes.Node node33 = textNode26.previousSibling();
        java.lang.String str34 = textNode26.text();
        java.lang.String str35 = textNode26.nodeName();
        org.jsoup.nodes.Node node36 = textNode26.parent();
        org.jsoup.nodes.TextNode textNode38 = textNode26.text("i!");
        boolean boolean39 = node23.equals((java.lang.Object) textNode38);
        org.jsoup.nodes.TextNode textNode42 = new org.jsoup.nodes.TextNode("hi!", "hi!");
        java.lang.String str44 = textNode42.absUrl("hi!");
        boolean boolean46 = textNode42.equals((java.lang.Object) (byte) -1);
        java.util.List<org.jsoup.nodes.Node> nodeList47 = textNode42.childNodes();
        java.lang.String str48 = textNode42.baseUri();
        org.jsoup.nodes.TextNode textNode50 = textNode42.text("#text");
        org.jsoup.nodes.Node node51 = textNode50.previousSibling();
        org.jsoup.nodes.TextNode textNode53 = textNode50.text("#text");
        boolean boolean54 = node23.equals((java.lang.Object) "#text");
        org.junit.Assert.assertNotNull(textNode2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNull(node4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "#text" + "'", str5, "#text");
        org.junit.Assert.assertNull(node6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(nodeList8);
        org.junit.Assert.assertNotNull(nodeList9);
        org.junit.Assert.assertNotNull(textNode11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(node16);
        org.junit.Assert.assertNotNull(textNode18);
        org.junit.Assert.assertNotNull(textNode20);
        org.junit.Assert.assertNull(document21);
        org.junit.Assert.assertNotNull(node23);
        org.junit.Assert.assertNotNull(textNode26);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertNull(node28);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "#text" + "'", str29, "#text");
        org.junit.Assert.assertNull(node30);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + true + "'", boolean31 == true);
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "" + "'", str32, "");
        org.junit.Assert.assertNull(node33);
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "" + "'", str34, "");
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "#text" + "'", str35, "#text");
        org.junit.Assert.assertNull(node36);
        org.junit.Assert.assertNotNull(textNode38);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertEquals("'" + str44 + "' != '" + "" + "'", str44, "");
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertNotNull(nodeList47);
        org.junit.Assert.assertEquals("'" + str48 + "' != '" + "hi!" + "'", str48, "hi!");
        org.junit.Assert.assertNotNull(textNode50);
        org.junit.Assert.assertNull(node51);
        org.junit.Assert.assertNotNull(textNode53);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + false + "'", boolean54 == false);
    }

    @Test
    public void test20658() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20658");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("", "");
        boolean boolean3 = textNode2.isBlank();
        org.jsoup.nodes.Node node4 = textNode2.previousSibling();
        java.lang.String str5 = textNode2.nodeName();
        org.jsoup.nodes.Node node6 = textNode2.nextSibling();
        boolean boolean7 = textNode2.isBlank();
        java.util.List<org.jsoup.nodes.Node> nodeList8 = textNode2.childNodesCopy();
        java.util.List<org.jsoup.nodes.Node> nodeList9 = textNode2.childNodesCopy();
        org.jsoup.nodes.TextNode textNode11 = textNode2.text("hi!");
        org.jsoup.nodes.Node node14 = textNode2.attr("#text", "hi!");
        org.jsoup.nodes.Document document15 = node14.ownerDocument();
        org.junit.Assert.assertNotNull(textNode2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNull(node4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "#text" + "'", str5, "#text");
        org.junit.Assert.assertNull(node6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(nodeList8);
        org.junit.Assert.assertNotNull(nodeList9);
        org.junit.Assert.assertNotNull(textNode11);
        org.junit.Assert.assertNotNull(node14);
        org.junit.Assert.assertNull(document15);
    }

    @Test
    public void test20659() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20659");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("#text", "");
        org.jsoup.nodes.Node node3 = textNode2.clone();
        java.util.List<org.jsoup.nodes.Node> nodeList4 = textNode2.siblingNodes();
        boolean boolean6 = textNode2.hasAttr("#");
        org.jsoup.nodes.Node node7 = textNode2.previousSibling();
        org.junit.Assert.assertNotNull(node3);
        org.junit.Assert.assertNotNull(nodeList4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(node7);
    }

    @Test
    public void test20660() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20660");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("", "");
        boolean boolean3 = textNode2.isBlank();
        boolean boolean4 = textNode2.isBlank();
        java.util.List<org.jsoup.nodes.Node> nodeList5 = textNode2.childNodes();
        org.jsoup.nodes.Node node7 = textNode2.removeAttr("#text");
        java.util.List<org.jsoup.nodes.Node> nodeList8 = textNode2.childNodesCopy();
        java.lang.String str9 = textNode2.text();
        org.junit.Assert.assertNotNull(textNode2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(nodeList5);
        org.junit.Assert.assertNotNull(node7);
        org.junit.Assert.assertNotNull(nodeList8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
    }

    @Test
    public void test20661() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20661");
        org.jsoup.nodes.Document.OutputSettings outputSettings0 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Document.OutputSettings outputSettings1 = outputSettings0.clone();
        org.jsoup.nodes.Document.OutputSettings outputSettings3 = outputSettings1.prettyPrint(false);
        boolean boolean4 = outputSettings3.prettyPrint();
        java.nio.charset.Charset charset5 = outputSettings3.charset();
        org.jsoup.nodes.Document.OutputSettings outputSettings6 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Entities.EscapeMode escapeMode7 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings8 = outputSettings6.escapeMode(escapeMode7);
        boolean boolean9 = outputSettings6.prettyPrint();
        org.jsoup.nodes.Document.OutputSettings outputSettings10 = new org.jsoup.nodes.Document.OutputSettings();
        int int11 = outputSettings10.indentAmount();
        org.jsoup.nodes.Entities.EscapeMode escapeMode12 = outputSettings10.escapeMode();
        org.jsoup.nodes.Document.OutputSettings outputSettings13 = outputSettings6.escapeMode(escapeMode12);
        boolean boolean14 = outputSettings13.prettyPrint();
        org.jsoup.nodes.Document.OutputSettings outputSettings16 = outputSettings13.indentAmount((int) '#');
        org.jsoup.nodes.Document.OutputSettings outputSettings18 = outputSettings13.indentAmount(0);
        org.jsoup.nodes.Entities.EscapeMode escapeMode19 = outputSettings13.escapeMode();
        org.jsoup.nodes.Document.OutputSettings outputSettings20 = outputSettings3.escapeMode(escapeMode19);
        org.jsoup.nodes.Document.OutputSettings outputSettings21 = new org.jsoup.nodes.Document.OutputSettings();
        boolean boolean22 = outputSettings21.prettyPrint();
        org.jsoup.nodes.Document.OutputSettings outputSettings24 = outputSettings21.prettyPrint(false);
        org.jsoup.nodes.Document.OutputSettings outputSettings25 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Entities.EscapeMode escapeMode26 = outputSettings25.escapeMode();
        org.jsoup.nodes.Document.OutputSettings outputSettings27 = outputSettings21.escapeMode(escapeMode26);
        org.jsoup.nodes.Document.OutputSettings outputSettings29 = outputSettings21.indentAmount((int) '4');
        org.jsoup.nodes.Document.OutputSettings outputSettings31 = outputSettings21.prettyPrint(false);
        boolean boolean32 = outputSettings21.prettyPrint();
        org.jsoup.nodes.Document.OutputSettings outputSettings34 = outputSettings21.indentAmount((int) (byte) 1);
        org.jsoup.nodes.Document.OutputSettings outputSettings35 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Entities.EscapeMode escapeMode36 = outputSettings35.escapeMode();
        org.jsoup.nodes.Document.OutputSettings outputSettings38 = outputSettings35.prettyPrint(false);
        boolean boolean39 = outputSettings35.prettyPrint();
        org.jsoup.nodes.Document.OutputSettings outputSettings40 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Document.OutputSettings outputSettings41 = outputSettings40.clone();
        int int42 = outputSettings40.indentAmount();
        org.jsoup.nodes.Document.OutputSettings outputSettings43 = new org.jsoup.nodes.Document.OutputSettings();
        boolean boolean44 = outputSettings43.prettyPrint();
        org.jsoup.nodes.Document.OutputSettings outputSettings46 = outputSettings43.prettyPrint(false);
        org.jsoup.nodes.Document.OutputSettings outputSettings48 = outputSettings43.indentAmount((int) '#');
        org.jsoup.nodes.Entities.EscapeMode escapeMode49 = outputSettings48.escapeMode();
        int int50 = outputSettings48.indentAmount();
        org.jsoup.nodes.Document.OutputSettings outputSettings52 = outputSettings48.indentAmount((int) (short) 100);
        org.jsoup.nodes.Document.OutputSettings outputSettings53 = new org.jsoup.nodes.Document.OutputSettings();
        boolean boolean54 = outputSettings53.prettyPrint();
        org.jsoup.nodes.Document.OutputSettings outputSettings56 = outputSettings53.prettyPrint(false);
        org.jsoup.nodes.Document.OutputSettings outputSettings58 = outputSettings53.indentAmount((int) '#');
        org.jsoup.nodes.Document.OutputSettings outputSettings59 = new org.jsoup.nodes.Document.OutputSettings();
        boolean boolean60 = outputSettings59.prettyPrint();
        org.jsoup.nodes.Document.OutputSettings outputSettings61 = new org.jsoup.nodes.Document.OutputSettings();
        int int62 = outputSettings61.indentAmount();
        org.jsoup.nodes.Entities.EscapeMode escapeMode63 = outputSettings61.escapeMode();
        java.nio.charset.Charset charset64 = outputSettings61.charset();
        org.jsoup.nodes.Document.OutputSettings outputSettings65 = outputSettings59.charset(charset64);
        java.nio.charset.Charset charset66 = outputSettings65.charset();
        org.jsoup.nodes.Document.OutputSettings outputSettings67 = outputSettings58.charset(charset66);
        org.jsoup.nodes.Document.OutputSettings outputSettings68 = outputSettings48.charset(charset66);
        org.jsoup.nodes.Document.OutputSettings outputSettings69 = outputSettings40.charset(charset66);
        org.jsoup.nodes.Document.OutputSettings outputSettings70 = outputSettings35.charset(charset66);
        org.jsoup.nodes.Document.OutputSettings outputSettings71 = outputSettings21.charset(charset66);
        org.jsoup.nodes.Document.OutputSettings outputSettings72 = outputSettings20.charset(charset66);
        org.jsoup.nodes.Document.OutputSettings outputSettings74 = outputSettings72.indentAmount((int) '4');
        org.jsoup.nodes.Entities.EscapeMode escapeMode75 = outputSettings72.escapeMode();
        org.jsoup.nodes.Entities.EscapeMode escapeMode76 = outputSettings72.escapeMode();
        org.jsoup.nodes.Entities.EscapeMode escapeMode77 = outputSettings72.escapeMode();
        boolean boolean78 = outputSettings72.prettyPrint();
        org.junit.Assert.assertNotNull(outputSettings1);
        org.junit.Assert.assertNotNull(outputSettings3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(charset5);
        org.junit.Assert.assertNotNull(outputSettings8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertTrue("'" + escapeMode12 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode12.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertNotNull(outputSettings13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNotNull(outputSettings16);
        org.junit.Assert.assertNotNull(outputSettings18);
        org.junit.Assert.assertTrue("'" + escapeMode19 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode19.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertNotNull(outputSettings20);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertNotNull(outputSettings24);
        org.junit.Assert.assertTrue("'" + escapeMode26 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode26.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertNotNull(outputSettings27);
        org.junit.Assert.assertNotNull(outputSettings29);
        org.junit.Assert.assertNotNull(outputSettings31);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertNotNull(outputSettings34);
        org.junit.Assert.assertTrue("'" + escapeMode36 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode36.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertNotNull(outputSettings38);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertNotNull(outputSettings41);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 1 + "'", int42 == 1);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + true + "'", boolean44 == true);
        org.junit.Assert.assertNotNull(outputSettings46);
        org.junit.Assert.assertNotNull(outputSettings48);
        org.junit.Assert.assertTrue("'" + escapeMode49 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode49.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertTrue("'" + int50 + "' != '" + 35 + "'", int50 == 35);
        org.junit.Assert.assertNotNull(outputSettings52);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + true + "'", boolean54 == true);
        org.junit.Assert.assertNotNull(outputSettings56);
        org.junit.Assert.assertNotNull(outputSettings58);
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + true + "'", boolean60 == true);
        org.junit.Assert.assertTrue("'" + int62 + "' != '" + 1 + "'", int62 == 1);
        org.junit.Assert.assertTrue("'" + escapeMode63 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode63.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertNotNull(charset64);
        org.junit.Assert.assertNotNull(outputSettings65);
        org.junit.Assert.assertNotNull(charset66);
        org.junit.Assert.assertNotNull(outputSettings67);
        org.junit.Assert.assertNotNull(outputSettings68);
        org.junit.Assert.assertNotNull(outputSettings69);
        org.junit.Assert.assertNotNull(outputSettings70);
        org.junit.Assert.assertNotNull(outputSettings71);
        org.junit.Assert.assertNotNull(outputSettings72);
        org.junit.Assert.assertNotNull(outputSettings74);
        org.junit.Assert.assertTrue("'" + escapeMode75 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode75.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertTrue("'" + escapeMode76 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode76.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertTrue("'" + escapeMode77 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode77.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertTrue("'" + boolean78 + "' != '" + false + "'", boolean78 == false);
    }

    @Test
    public void test20662() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20662");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("i!", "hi!");
        org.jsoup.nodes.Node node3 = textNode2.previousSibling();
        int int4 = textNode2.childNodeSize();
        org.jsoup.nodes.TextNode textNode6 = textNode2.text("hi!");
        textNode2.setBaseUri("i!");
        org.jsoup.nodes.TextNode textNode10 = textNode2.splitText(1);
        org.jsoup.nodes.Node node13 = textNode2.attr("text", "h");
        org.junit.Assert.assertNotNull(textNode2);
        org.junit.Assert.assertNull(node3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(textNode6);
        org.junit.Assert.assertNotNull(textNode10);
        org.junit.Assert.assertNotNull(node13);
    }

    @Test
    public void test20663() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20663");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("", "hi!");
        java.lang.String str4 = textNode2.absUrl("hi!");
        org.jsoup.nodes.Node node5 = textNode2.parent();
        java.lang.String str6 = textNode2.nodeName();
        org.jsoup.nodes.Attributes attributes7 = textNode2.attributes();
        boolean boolean8 = textNode2.isBlank();
        textNode2.setBaseUri("h");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "#text" + "'", str6, "#text");
        org.junit.Assert.assertNotNull(attributes7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test20664() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20664");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("", "");
        boolean boolean3 = textNode2.isBlank();
        org.jsoup.nodes.Node node4 = textNode2.previousSibling();
        org.jsoup.nodes.Node node7 = textNode2.attr("hi!", "");
        java.lang.String str8 = textNode2.baseUri();
        boolean boolean9 = textNode2.isBlank();
        int int10 = textNode2.childNodeSize();
        java.lang.String str12 = textNode2.attr("");
        java.lang.String str14 = textNode2.absUrl("hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList15 = textNode2.siblingNodes();
        java.lang.String str16 = textNode2.text();
        java.util.List<org.jsoup.nodes.Node> nodeList17 = textNode2.childNodes();
        org.jsoup.nodes.Node node19 = textNode2.removeAttr("text");
        org.junit.Assert.assertNotNull(textNode2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNull(node4);
        org.junit.Assert.assertNotNull(node7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertNotNull(nodeList15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertNotNull(nodeList17);
        org.junit.Assert.assertNotNull(node19);
    }

    @Test
    public void test20665() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20665");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("", "");
        boolean boolean3 = textNode2.isBlank();
        boolean boolean4 = textNode2.isBlank();
        java.util.List<org.jsoup.nodes.Node> nodeList5 = textNode2.childNodes();
        org.jsoup.nodes.Node node7 = textNode2.removeAttr("#text");
        org.jsoup.nodes.Document.OutputSettings outputSettings8 = new org.jsoup.nodes.Document.OutputSettings();
        boolean boolean9 = outputSettings8.prettyPrint();
        org.jsoup.nodes.Document.OutputSettings outputSettings11 = outputSettings8.prettyPrint(false);
        boolean boolean12 = textNode2.equals((java.lang.Object) outputSettings11);
        org.jsoup.nodes.Document document13 = textNode2.ownerDocument();
        org.jsoup.nodes.Node node16 = textNode2.attr("i!", "#");
        java.util.List<org.jsoup.nodes.Node> nodeList17 = node16.childNodesCopy();
        org.jsoup.nodes.TextNode textNode20 = new org.jsoup.nodes.TextNode("#text", "#text");
        org.jsoup.nodes.Attributes attributes21 = textNode20.attributes();
        org.jsoup.nodes.Node node24 = textNode20.attr("hi!", "#");
        boolean boolean25 = node16.equals((java.lang.Object) "hi!");
        org.junit.Assert.assertNotNull(textNode2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(nodeList5);
        org.junit.Assert.assertNotNull(node7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(outputSettings11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNull(document13);
        org.junit.Assert.assertNotNull(node16);
        org.junit.Assert.assertNotNull(nodeList17);
        org.junit.Assert.assertNotNull(attributes21);
        org.junit.Assert.assertNotNull(node24);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
    }

    @Test
    public void test20666() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20666");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("#text", "hi!");
        org.jsoup.nodes.Node node3 = textNode2.previousSibling();
        java.lang.String str5 = textNode2.attr("hi!");
        java.lang.String str6 = textNode2.toString();
        org.jsoup.nodes.Node node7 = textNode2.clone();
        int int8 = node7.siblingIndex();
        org.junit.Assert.assertNull(node3);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "#text" + "'", str6, "#text");
        org.junit.Assert.assertNotNull(node7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void test20667() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20667");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("", "");
        boolean boolean3 = textNode2.isBlank();
        org.jsoup.nodes.Node node4 = textNode2.previousSibling();
        org.jsoup.nodes.Node node5 = textNode2.parent();
        java.lang.String str7 = textNode2.absUrl("#text");
        org.jsoup.nodes.Node node8 = textNode2.clone();
        java.util.List<org.jsoup.nodes.Node> nodeList9 = node8.childNodes();
        int int10 = node8.siblingIndex();
        org.jsoup.nodes.TextNode textNode13 = org.jsoup.nodes.TextNode.createFromEncoded("", "");
        boolean boolean14 = textNode13.isBlank();
        org.jsoup.nodes.Node node15 = textNode13.previousSibling();
        java.lang.String str16 = textNode13.nodeName();
        org.jsoup.nodes.Node node17 = textNode13.nextSibling();
        java.lang.String str19 = textNode13.attr("");
        java.lang.String str21 = textNode13.absUrl("i!");
        org.jsoup.nodes.Node node23 = textNode13.removeAttr("#");
        boolean boolean24 = node8.equals((java.lang.Object) textNode13);
        java.util.List<org.jsoup.nodes.Node> nodeList25 = node8.childNodes();
        org.junit.Assert.assertNotNull(textNode2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNull(node4);
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNotNull(node8);
        org.junit.Assert.assertNotNull(nodeList9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNotNull(textNode13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNull(node15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "#text" + "'", str16, "#text");
        org.junit.Assert.assertNull(node17);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertNotNull(node23);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(nodeList25);
    }

    @Test
    public void test20668() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20668");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("hi!", "hi!");
        java.lang.String str4 = textNode2.absUrl("hi!");
        org.jsoup.nodes.Document document5 = textNode2.ownerDocument();
        java.lang.String str6 = textNode2.text();
        java.util.List<org.jsoup.nodes.Node> nodeList7 = textNode2.childNodesCopy();
        org.jsoup.nodes.Node node8 = textNode2.parent();
        org.jsoup.nodes.Node node9 = textNode2.previousSibling();
        org.jsoup.nodes.TextNode textNode11 = textNode2.text("#text");
        int int12 = textNode11.siblingIndex();
        org.jsoup.nodes.Attributes attributes13 = textNode11.attributes();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNull(document5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertNotNull(nodeList7);
        org.junit.Assert.assertNull(node8);
        org.junit.Assert.assertNull(node9);
        org.junit.Assert.assertNotNull(textNode11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNotNull(attributes13);
    }

    @Test
    public void test20669() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20669");
        org.jsoup.nodes.Document.OutputSettings outputSettings0 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Document.OutputSettings outputSettings1 = outputSettings0.clone();
        boolean boolean2 = outputSettings1.prettyPrint();
        org.jsoup.nodes.Document.OutputSettings outputSettings3 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Document.OutputSettings outputSettings4 = new org.jsoup.nodes.Document.OutputSettings();
        int int5 = outputSettings4.indentAmount();
        org.jsoup.nodes.Entities.EscapeMode escapeMode6 = outputSettings4.escapeMode();
        org.jsoup.nodes.Document.OutputSettings outputSettings7 = outputSettings3.escapeMode(escapeMode6);
        org.jsoup.nodes.Document.OutputSettings outputSettings8 = outputSettings1.escapeMode(escapeMode6);
        org.jsoup.nodes.Document.OutputSettings outputSettings10 = outputSettings8.prettyPrint(true);
        java.nio.charset.Charset charset11 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Document.OutputSettings outputSettings12 = outputSettings8.charset(charset11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(outputSettings1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + escapeMode6 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode6.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertNotNull(outputSettings7);
        org.junit.Assert.assertNotNull(outputSettings8);
        org.junit.Assert.assertNotNull(outputSettings10);
    }

    @Test
    public void test20670() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20670");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("hi!", "hi!");
        org.jsoup.nodes.TextNode textNode5 = org.jsoup.nodes.TextNode.createFromEncoded("", "");
        boolean boolean6 = textNode5.isBlank();
        org.jsoup.nodes.Node node7 = textNode5.previousSibling();
        java.lang.String str8 = textNode5.nodeName();
        org.jsoup.nodes.Node node9 = textNode5.nextSibling();
        boolean boolean10 = textNode5.isBlank();
        java.util.List<org.jsoup.nodes.Node> nodeList11 = textNode5.childNodesCopy();
        org.jsoup.nodes.Attributes attributes12 = textNode5.attributes();
        boolean boolean13 = textNode2.equals((java.lang.Object) textNode5);
        java.lang.String str14 = textNode5.toString();
        java.lang.String str15 = textNode5.getWholeText();
        java.lang.String str16 = textNode5.outerHtml();
        org.jsoup.nodes.Document document17 = textNode5.ownerDocument();
        org.jsoup.nodes.TextNode textNode19 = textNode5.text("");
        org.jsoup.nodes.Node node20 = null;
        // The following exception was thrown during execution in test generation
        try {
            textNode19.replaceWith(node20);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(textNode5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNull(node7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "#text" + "'", str8, "#text");
        org.junit.Assert.assertNull(node9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(nodeList11);
        org.junit.Assert.assertNotNull(attributes12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertNull(document17);
        org.junit.Assert.assertNotNull(textNode19);
    }

    @Test
    public void test20671() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20671");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("#text", "hi!");
        org.jsoup.nodes.Node node3 = textNode2.previousSibling();
        org.jsoup.nodes.Document.OutputSettings outputSettings4 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Entities.EscapeMode escapeMode5 = outputSettings4.escapeMode();
        org.jsoup.nodes.Document.OutputSettings outputSettings6 = outputSettings4.clone();
        org.jsoup.nodes.Document.OutputSettings outputSettings7 = new org.jsoup.nodes.Document.OutputSettings();
        boolean boolean8 = outputSettings7.prettyPrint();
        org.jsoup.nodes.Document.OutputSettings outputSettings10 = outputSettings7.prettyPrint(false);
        org.jsoup.nodes.Document.OutputSettings outputSettings11 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Entities.EscapeMode escapeMode12 = outputSettings11.escapeMode();
        org.jsoup.nodes.Document.OutputSettings outputSettings13 = outputSettings7.escapeMode(escapeMode12);
        org.jsoup.nodes.Document.OutputSettings outputSettings14 = outputSettings7.clone();
        org.jsoup.nodes.Document.OutputSettings outputSettings15 = new org.jsoup.nodes.Document.OutputSettings();
        boolean boolean16 = outputSettings15.prettyPrint();
        org.jsoup.nodes.Document.OutputSettings outputSettings18 = outputSettings15.prettyPrint(false);
        org.jsoup.nodes.Document.OutputSettings outputSettings20 = outputSettings15.indentAmount((int) '#');
        org.jsoup.nodes.Entities.EscapeMode escapeMode21 = outputSettings15.escapeMode();
        org.jsoup.nodes.Document.OutputSettings outputSettings22 = outputSettings7.escapeMode(escapeMode21);
        org.jsoup.nodes.Entities.EscapeMode escapeMode23 = outputSettings7.escapeMode();
        org.jsoup.nodes.Document.OutputSettings outputSettings24 = outputSettings6.escapeMode(escapeMode23);
        boolean boolean25 = textNode2.equals((java.lang.Object) outputSettings6);
        int int26 = textNode2.childNodeSize();
        org.jsoup.nodes.Node node29 = textNode2.attr("h", "i!");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.TextNode textNode31 = textNode2.splitText((int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Split offset must be not be negative");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(node3);
        org.junit.Assert.assertTrue("'" + escapeMode5 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode5.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertNotNull(outputSettings6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(outputSettings10);
        org.junit.Assert.assertTrue("'" + escapeMode12 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode12.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertNotNull(outputSettings13);
        org.junit.Assert.assertNotNull(outputSettings14);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertNotNull(outputSettings18);
        org.junit.Assert.assertNotNull(outputSettings20);
        org.junit.Assert.assertTrue("'" + escapeMode21 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode21.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertNotNull(outputSettings22);
        org.junit.Assert.assertTrue("'" + escapeMode23 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode23.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertNotNull(outputSettings24);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertNotNull(node29);
    }

    @Test
    public void test20672() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20672");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("", "");
        boolean boolean3 = textNode2.isBlank();
        org.jsoup.nodes.Node node4 = textNode2.previousSibling();
        java.lang.String str5 = textNode2.nodeName();
        org.jsoup.nodes.Node node6 = textNode2.nextSibling();
        boolean boolean7 = textNode2.isBlank();
        boolean boolean8 = textNode2.isBlank();
        int int9 = textNode2.siblingIndex();
        java.util.List<org.jsoup.nodes.Node> nodeList10 = textNode2.childNodesCopy();
        java.lang.String str11 = textNode2.baseUri();
        java.util.List<org.jsoup.nodes.Node> nodeList12 = textNode2.childNodesCopy();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node13 = textNode2.unwrap();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(textNode2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNull(node4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "#text" + "'", str5, "#text");
        org.junit.Assert.assertNull(node6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNotNull(nodeList10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNotNull(nodeList12);
    }

    @Test
    public void test20673() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20673");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("hi!", "hi!");
        org.jsoup.nodes.TextNode textNode5 = org.jsoup.nodes.TextNode.createFromEncoded("", "");
        boolean boolean6 = textNode5.isBlank();
        org.jsoup.nodes.Node node7 = textNode5.previousSibling();
        java.lang.String str8 = textNode5.nodeName();
        org.jsoup.nodes.Node node9 = textNode5.nextSibling();
        boolean boolean10 = textNode5.isBlank();
        java.util.List<org.jsoup.nodes.Node> nodeList11 = textNode5.childNodesCopy();
        org.jsoup.nodes.Attributes attributes12 = textNode5.attributes();
        boolean boolean13 = textNode2.equals((java.lang.Object) textNode5);
        java.lang.String str14 = textNode2.baseUri();
        org.jsoup.nodes.Node node15 = textNode2.parent();
        java.lang.String str16 = textNode2.baseUri();
        org.junit.Assert.assertNotNull(textNode5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNull(node7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "#text" + "'", str8, "#text");
        org.junit.Assert.assertNull(node9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(nodeList11);
        org.junit.Assert.assertNotNull(attributes12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertNull(node15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
    }

    @Test
    public void test20674() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20674");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("", "");
        boolean boolean3 = textNode2.isBlank();
        org.jsoup.nodes.Node node4 = textNode2.previousSibling();
        org.jsoup.nodes.Node node7 = textNode2.attr("hi!", "");
        boolean boolean9 = textNode2.equals((java.lang.Object) 10.0d);
        java.lang.String str10 = textNode2.nodeName();
        textNode2.setBaseUri("");
        org.jsoup.nodes.Node node13 = textNode2.previousSibling();
        java.lang.String str14 = textNode2.nodeName();
        textNode2.setBaseUri("i!");
        boolean boolean17 = textNode2.isBlank();
        int int18 = textNode2.siblingIndex();
        org.jsoup.nodes.Attributes attributes19 = textNode2.attributes();
        int int20 = textNode2.childNodeSize();
        int int21 = textNode2.childNodeSize();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node23 = textNode2.before("h");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(textNode2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNull(node4);
        org.junit.Assert.assertNotNull(node7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "#text" + "'", str10, "#text");
        org.junit.Assert.assertNull(node13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "#text" + "'", str14, "#text");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertNotNull(attributes19);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
    }

    @Test
    public void test20675() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20675");
        org.jsoup.nodes.Document.OutputSettings outputSettings0 = new org.jsoup.nodes.Document.OutputSettings();
        boolean boolean1 = outputSettings0.prettyPrint();
        org.jsoup.nodes.Document.OutputSettings outputSettings3 = outputSettings0.prettyPrint(false);
        org.jsoup.nodes.Document.OutputSettings outputSettings5 = outputSettings0.indentAmount((int) '#');
        org.jsoup.nodes.Document.OutputSettings outputSettings6 = outputSettings0.clone();
        org.jsoup.nodes.Document.OutputSettings outputSettings7 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Document.OutputSettings outputSettings8 = new org.jsoup.nodes.Document.OutputSettings();
        int int9 = outputSettings8.indentAmount();
        org.jsoup.nodes.Entities.EscapeMode escapeMode10 = outputSettings8.escapeMode();
        org.jsoup.nodes.Document.OutputSettings outputSettings11 = outputSettings7.escapeMode(escapeMode10);
        org.jsoup.nodes.Document.OutputSettings outputSettings12 = outputSettings0.escapeMode(escapeMode10);
        org.jsoup.nodes.Document.OutputSettings outputSettings13 = outputSettings12.clone();
        org.jsoup.nodes.Document.OutputSettings outputSettings14 = outputSettings13.clone();
        int int15 = outputSettings13.indentAmount();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertNotNull(outputSettings3);
        org.junit.Assert.assertNotNull(outputSettings5);
        org.junit.Assert.assertNotNull(outputSettings6);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + escapeMode10 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode10.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertNotNull(outputSettings11);
        org.junit.Assert.assertNotNull(outputSettings12);
        org.junit.Assert.assertNotNull(outputSettings13);
        org.junit.Assert.assertNotNull(outputSettings14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 35 + "'", int15 == 35);
    }

    @Test
    public void test20676() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20676");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("", "");
        boolean boolean3 = textNode2.isBlank();
        org.jsoup.nodes.Node node4 = textNode2.previousSibling();
        java.lang.String str5 = textNode2.nodeName();
        org.jsoup.nodes.Node node6 = textNode2.nextSibling();
        boolean boolean7 = textNode2.isBlank();
        java.util.List<org.jsoup.nodes.Node> nodeList8 = textNode2.childNodesCopy();
        java.util.List<org.jsoup.nodes.Node> nodeList9 = textNode2.childNodesCopy();
        org.jsoup.nodes.TextNode textNode12 = org.jsoup.nodes.TextNode.createFromEncoded("", "");
        boolean boolean13 = textNode12.isBlank();
        org.jsoup.nodes.Node node14 = textNode12.previousSibling();
        org.jsoup.nodes.Node node17 = textNode12.attr("hi!", "");
        java.lang.String str18 = textNode12.baseUri();
        java.lang.String str19 = textNode12.outerHtml();
        java.util.List<org.jsoup.nodes.Node> nodeList20 = textNode12.childNodesCopy();
        java.lang.String str21 = textNode12.baseUri();
        org.jsoup.nodes.Node node22 = textNode12.nextSibling();
        org.jsoup.nodes.TextNode textNode24 = textNode12.text("");
        boolean boolean25 = textNode2.equals((java.lang.Object) textNode12);
        org.jsoup.nodes.Document document26 = textNode12.ownerDocument();
        org.jsoup.nodes.Document document27 = textNode12.ownerDocument();
        org.jsoup.nodes.TextNode textNode29 = textNode12.text("#text");
        java.lang.String str30 = textNode12.toString();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node31 = textNode12.unwrap();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(textNode2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNull(node4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "#text" + "'", str5, "#text");
        org.junit.Assert.assertNull(node6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(nodeList8);
        org.junit.Assert.assertNotNull(nodeList9);
        org.junit.Assert.assertNotNull(textNode12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNull(node14);
        org.junit.Assert.assertNotNull(node17);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertNotNull(nodeList20);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertNull(node22);
        org.junit.Assert.assertNotNull(textNode24);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNull(document26);
        org.junit.Assert.assertNull(document27);
        org.junit.Assert.assertNotNull(textNode29);
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "#text" + "'", str30, "#text");
    }

    @Test
    public void test20677() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20677");
        org.jsoup.nodes.Document.OutputSettings outputSettings0 = new org.jsoup.nodes.Document.OutputSettings();
        int int1 = outputSettings0.indentAmount();
        org.jsoup.nodes.Entities.EscapeMode escapeMode2 = outputSettings0.escapeMode();
        org.jsoup.nodes.Document.OutputSettings outputSettings3 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Document.OutputSettings outputSettings4 = outputSettings3.clone();
        org.jsoup.nodes.Document.OutputSettings outputSettings5 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Document.OutputSettings outputSettings6 = new org.jsoup.nodes.Document.OutputSettings();
        int int7 = outputSettings6.indentAmount();
        org.jsoup.nodes.Entities.EscapeMode escapeMode8 = outputSettings6.escapeMode();
        org.jsoup.nodes.Document.OutputSettings outputSettings9 = outputSettings5.escapeMode(escapeMode8);
        org.jsoup.nodes.Document.OutputSettings outputSettings10 = outputSettings3.escapeMode(escapeMode8);
        org.jsoup.nodes.Document.OutputSettings outputSettings11 = outputSettings0.escapeMode(escapeMode8);
        org.jsoup.nodes.Document.OutputSettings outputSettings12 = new org.jsoup.nodes.Document.OutputSettings();
        boolean boolean13 = outputSettings12.prettyPrint();
        org.jsoup.nodes.Document.OutputSettings outputSettings15 = outputSettings12.prettyPrint(false);
        org.jsoup.nodes.Document.OutputSettings outputSettings17 = outputSettings15.prettyPrint(false);
        org.jsoup.nodes.Document.OutputSettings outputSettings18 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Entities.EscapeMode escapeMode19 = outputSettings18.escapeMode();
        java.nio.charset.Charset charset20 = outputSettings18.charset();
        org.jsoup.nodes.Document.OutputSettings outputSettings21 = outputSettings15.charset(charset20);
        org.jsoup.nodes.Document.OutputSettings outputSettings22 = outputSettings0.charset(charset20);
        org.jsoup.nodes.Document.OutputSettings outputSettings23 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Document.OutputSettings outputSettings24 = outputSettings23.clone();
        org.jsoup.nodes.Document.OutputSettings outputSettings26 = outputSettings24.prettyPrint(false);
        org.jsoup.nodes.Document.OutputSettings outputSettings27 = new org.jsoup.nodes.Document.OutputSettings();
        boolean boolean28 = outputSettings27.prettyPrint();
        org.jsoup.nodes.Document.OutputSettings outputSettings29 = new org.jsoup.nodes.Document.OutputSettings();
        int int30 = outputSettings29.indentAmount();
        org.jsoup.nodes.Entities.EscapeMode escapeMode31 = outputSettings29.escapeMode();
        java.nio.charset.Charset charset32 = outputSettings29.charset();
        org.jsoup.nodes.Document.OutputSettings outputSettings33 = outputSettings27.charset(charset32);
        org.jsoup.nodes.Document.OutputSettings outputSettings34 = outputSettings24.charset(charset32);
        org.jsoup.nodes.Document.OutputSettings outputSettings35 = outputSettings22.charset(charset32);
        org.jsoup.nodes.Document.OutputSettings outputSettings36 = outputSettings35.clone();
        org.jsoup.nodes.Document.OutputSettings outputSettings37 = outputSettings36.clone();
        org.jsoup.nodes.Document.OutputSettings outputSettings38 = outputSettings36.clone();
        int int39 = outputSettings38.indentAmount();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1 + "'", int1 == 1);
        org.junit.Assert.assertTrue("'" + escapeMode2 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode2.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertNotNull(outputSettings4);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + escapeMode8 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode8.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertNotNull(outputSettings9);
        org.junit.Assert.assertNotNull(outputSettings10);
        org.junit.Assert.assertNotNull(outputSettings11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNotNull(outputSettings15);
        org.junit.Assert.assertNotNull(outputSettings17);
        org.junit.Assert.assertTrue("'" + escapeMode19 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode19.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertNotNull(charset20);
        org.junit.Assert.assertNotNull(outputSettings21);
        org.junit.Assert.assertNotNull(outputSettings22);
        org.junit.Assert.assertNotNull(outputSettings24);
        org.junit.Assert.assertNotNull(outputSettings26);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 1 + "'", int30 == 1);
        org.junit.Assert.assertTrue("'" + escapeMode31 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode31.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertNotNull(charset32);
        org.junit.Assert.assertNotNull(outputSettings33);
        org.junit.Assert.assertNotNull(outputSettings34);
        org.junit.Assert.assertNotNull(outputSettings35);
        org.junit.Assert.assertNotNull(outputSettings36);
        org.junit.Assert.assertNotNull(outputSettings37);
        org.junit.Assert.assertNotNull(outputSettings38);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 1 + "'", int39 == 1);
    }

    @Test
    public void test20678() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20678");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("hi!", "hi!");
        java.lang.String str4 = textNode2.absUrl("hi!");
        org.jsoup.nodes.Document document5 = textNode2.ownerDocument();
        java.util.List<org.jsoup.nodes.Node> nodeList6 = textNode2.childNodes();
        java.lang.String str7 = textNode2.nodeName();
        java.lang.String str8 = textNode2.baseUri();
        boolean boolean9 = textNode2.isBlank();
        java.lang.String str10 = textNode2.getWholeText();
        org.jsoup.nodes.TextNode textNode12 = textNode2.text("#text");
        java.util.List<org.jsoup.nodes.Node> nodeList13 = textNode2.childNodesCopy();
        org.jsoup.nodes.Attributes attributes14 = textNode2.attributes();
        java.util.List<org.jsoup.nodes.Node> nodeList15 = textNode2.siblingNodes();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNull(document5);
        org.junit.Assert.assertNotNull(nodeList6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "#text" + "'", str7, "#text");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertNotNull(textNode12);
        org.junit.Assert.assertNotNull(nodeList13);
        org.junit.Assert.assertNotNull(attributes14);
        org.junit.Assert.assertNotNull(nodeList15);
    }

    @Test
    public void test20679() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20679");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("#text", "");
        java.util.List<org.jsoup.nodes.Node> nodeList3 = textNode2.childNodes();
        org.jsoup.nodes.Document document4 = textNode2.ownerDocument();
        textNode2.setBaseUri("i!");
        int int7 = textNode2.childNodeSize();
        org.jsoup.nodes.Node node10 = textNode2.attr("#text", "#");
        org.jsoup.nodes.Attributes attributes11 = textNode2.attributes();
        org.junit.Assert.assertNotNull(nodeList3);
        org.junit.Assert.assertNull(document4);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(node10);
        org.junit.Assert.assertNotNull(attributes11);
    }

    @Test
    public void test20680() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20680");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("", "");
        boolean boolean3 = textNode2.isBlank();
        boolean boolean4 = textNode2.isBlank();
        java.util.List<org.jsoup.nodes.Node> nodeList5 = textNode2.childNodes();
        java.lang.String str6 = textNode2.baseUri();
        int int7 = textNode2.childNodeSize();
        boolean boolean9 = textNode2.hasAttr("");
        java.lang.String str11 = textNode2.absUrl("i!");
        java.util.List<org.jsoup.nodes.Node> nodeList12 = textNode2.childNodes();
        org.jsoup.nodes.TextNode textNode14 = textNode2.text("hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList15 = textNode14.siblingNodes();
        org.jsoup.nodes.Node node16 = textNode14.clone();
        org.jsoup.nodes.TextNode textNode19 = new org.jsoup.nodes.TextNode("hi!", "hi!");
        java.lang.String str21 = textNode19.absUrl("hi!");
        org.jsoup.nodes.Document document22 = textNode19.ownerDocument();
        java.lang.String str23 = textNode19.text();
        java.util.List<org.jsoup.nodes.Node> nodeList24 = textNode19.childNodesCopy();
        org.jsoup.nodes.Document document25 = textNode19.ownerDocument();
        org.jsoup.nodes.Node node28 = textNode19.attr("hi!", "");
        int int29 = textNode19.childNodeSize();
        org.jsoup.nodes.Node node30 = textNode19.previousSibling();
        org.jsoup.nodes.TextNode textNode32 = textNode19.text("i!");
        java.lang.String str33 = textNode19.toString();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node34 = textNode14.before((org.jsoup.nodes.Node) textNode19);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(textNode2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(nodeList5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNotNull(nodeList12);
        org.junit.Assert.assertNotNull(textNode14);
        org.junit.Assert.assertNotNull(nodeList15);
        org.junit.Assert.assertNotNull(node16);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertNull(document22);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "hi!" + "'", str23, "hi!");
        org.junit.Assert.assertNotNull(nodeList24);
        org.junit.Assert.assertNull(document25);
        org.junit.Assert.assertNotNull(node28);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
        org.junit.Assert.assertNull(node30);
        org.junit.Assert.assertNotNull(textNode32);
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "i!" + "'", str33, "i!");
    }

    @Test
    public void test20681() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20681");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("", "");
        boolean boolean3 = textNode2.isBlank();
        org.jsoup.nodes.Node node4 = textNode2.previousSibling();
        java.lang.String str5 = textNode2.nodeName();
        boolean boolean6 = textNode2.isBlank();
        java.util.List<org.jsoup.nodes.Node> nodeList7 = textNode2.childNodesCopy();
        textNode2.setBaseUri("#text");
        java.lang.String str10 = textNode2.baseUri();
        org.jsoup.nodes.Node node13 = textNode2.attr("i!", "#text");
        java.lang.String str15 = textNode2.absUrl("i!");
        java.lang.String str16 = textNode2.baseUri();
        java.lang.String str18 = textNode2.attr("hi!");
        org.jsoup.nodes.Node node19 = textNode2.nextSibling();
        org.junit.Assert.assertNotNull(textNode2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNull(node4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "#text" + "'", str5, "#text");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(nodeList7);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "#text" + "'", str10, "#text");
        org.junit.Assert.assertNotNull(node13);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "#text" + "'", str16, "#text");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertNull(node19);
    }

    @Test
    public void test20682() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20682");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("", "");
        boolean boolean3 = textNode2.isBlank();
        org.jsoup.nodes.Node node4 = textNode2.previousSibling();
        java.lang.String str5 = textNode2.nodeName();
        org.jsoup.nodes.Node node6 = textNode2.nextSibling();
        boolean boolean7 = textNode2.isBlank();
        java.util.List<org.jsoup.nodes.Node> nodeList8 = textNode2.childNodesCopy();
        java.util.List<org.jsoup.nodes.Node> nodeList9 = textNode2.childNodesCopy();
        org.jsoup.nodes.TextNode textNode12 = org.jsoup.nodes.TextNode.createFromEncoded("", "");
        boolean boolean13 = textNode12.isBlank();
        org.jsoup.nodes.Node node14 = textNode12.previousSibling();
        org.jsoup.nodes.Node node17 = textNode12.attr("hi!", "");
        java.lang.String str18 = textNode12.baseUri();
        java.lang.String str19 = textNode12.outerHtml();
        java.util.List<org.jsoup.nodes.Node> nodeList20 = textNode12.childNodesCopy();
        java.lang.String str21 = textNode12.baseUri();
        org.jsoup.nodes.Node node22 = textNode12.nextSibling();
        org.jsoup.nodes.TextNode textNode24 = textNode12.text("");
        boolean boolean25 = textNode2.equals((java.lang.Object) textNode12);
        org.jsoup.nodes.Document document26 = textNode12.ownerDocument();
        org.jsoup.nodes.Document document27 = textNode12.ownerDocument();
        org.jsoup.nodes.TextNode textNode29 = textNode12.text("hi!");
        org.jsoup.nodes.TextNode textNode31 = textNode29.text("i!");
        boolean boolean32 = textNode31.isBlank();
        org.jsoup.nodes.Node node33 = textNode31.previousSibling();
        java.lang.String str35 = textNode31.absUrl("hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList36 = textNode31.childNodesCopy();
        org.junit.Assert.assertNotNull(textNode2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNull(node4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "#text" + "'", str5, "#text");
        org.junit.Assert.assertNull(node6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(nodeList8);
        org.junit.Assert.assertNotNull(nodeList9);
        org.junit.Assert.assertNotNull(textNode12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNull(node14);
        org.junit.Assert.assertNotNull(node17);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertNotNull(nodeList20);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertNull(node22);
        org.junit.Assert.assertNotNull(textNode24);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNull(document26);
        org.junit.Assert.assertNull(document27);
        org.junit.Assert.assertNotNull(textNode29);
        org.junit.Assert.assertNotNull(textNode31);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertNull(node33);
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "" + "'", str35, "");
        org.junit.Assert.assertNotNull(nodeList36);
    }

    @Test
    public void test20683() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20683");
        org.jsoup.nodes.Document.OutputSettings outputSettings0 = new org.jsoup.nodes.Document.OutputSettings();
        boolean boolean1 = outputSettings0.prettyPrint();
        org.jsoup.nodes.Document.OutputSettings outputSettings3 = outputSettings0.prettyPrint(false);
        org.jsoup.nodes.Document.OutputSettings outputSettings5 = outputSettings0.indentAmount((int) '#');
        org.jsoup.nodes.Entities.EscapeMode escapeMode6 = outputSettings0.escapeMode();
        org.jsoup.nodes.Document.OutputSettings outputSettings8 = outputSettings0.indentAmount((int) 'a');
        int int9 = outputSettings0.indentAmount();
        org.jsoup.nodes.Document.OutputSettings outputSettings10 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Document.OutputSettings outputSettings11 = outputSettings10.clone();
        org.jsoup.nodes.Document.OutputSettings outputSettings13 = outputSettings10.prettyPrint(true);
        org.jsoup.nodes.Document.OutputSettings outputSettings15 = outputSettings10.indentAmount(0);
        org.jsoup.nodes.Document.OutputSettings outputSettings17 = outputSettings10.prettyPrint(true);
        org.jsoup.nodes.Document.OutputSettings outputSettings18 = outputSettings17.clone();
        java.nio.charset.Charset charset19 = outputSettings18.charset();
        org.jsoup.nodes.Document.OutputSettings outputSettings20 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Entities.EscapeMode escapeMode21 = outputSettings20.escapeMode();
        boolean boolean22 = outputSettings20.prettyPrint();
        org.jsoup.nodes.Document.OutputSettings outputSettings23 = outputSettings20.clone();
        org.jsoup.nodes.Document.OutputSettings outputSettings24 = new org.jsoup.nodes.Document.OutputSettings();
        boolean boolean25 = outputSettings24.prettyPrint();
        org.jsoup.nodes.Document.OutputSettings outputSettings27 = outputSettings24.prettyPrint(false);
        org.jsoup.nodes.Document.OutputSettings outputSettings29 = outputSettings27.prettyPrint(false);
        org.jsoup.nodes.Document.OutputSettings outputSettings30 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Entities.EscapeMode escapeMode31 = outputSettings30.escapeMode();
        java.nio.charset.Charset charset32 = outputSettings30.charset();
        org.jsoup.nodes.Document.OutputSettings outputSettings33 = outputSettings27.charset(charset32);
        org.jsoup.nodes.Document.OutputSettings outputSettings34 = outputSettings20.charset(charset32);
        org.jsoup.nodes.Document.OutputSettings outputSettings36 = outputSettings20.prettyPrint(false);
        org.jsoup.nodes.Document.OutputSettings outputSettings37 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Entities.EscapeMode escapeMode38 = outputSettings37.escapeMode();
        org.jsoup.nodes.Document.OutputSettings outputSettings39 = outputSettings36.escapeMode(escapeMode38);
        org.jsoup.nodes.Document.OutputSettings outputSettings40 = outputSettings36.clone();
        org.jsoup.nodes.Entities.EscapeMode escapeMode41 = outputSettings36.escapeMode();
        org.jsoup.nodes.Document.OutputSettings outputSettings42 = outputSettings18.escapeMode(escapeMode41);
        org.jsoup.nodes.Document.OutputSettings outputSettings43 = outputSettings0.escapeMode(escapeMode41);
        org.jsoup.nodes.Document.OutputSettings outputSettings44 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Document.OutputSettings outputSettings45 = new org.jsoup.nodes.Document.OutputSettings();
        int int46 = outputSettings45.indentAmount();
        org.jsoup.nodes.Entities.EscapeMode escapeMode47 = outputSettings45.escapeMode();
        org.jsoup.nodes.Document.OutputSettings outputSettings48 = outputSettings44.escapeMode(escapeMode47);
        org.jsoup.nodes.Document.OutputSettings outputSettings50 = outputSettings44.indentAmount((int) (short) 100);
        org.jsoup.nodes.Entities.EscapeMode escapeMode51 = outputSettings44.escapeMode();
        org.jsoup.nodes.Document.OutputSettings outputSettings53 = outputSettings44.prettyPrint(true);
        java.nio.charset.Charset charset54 = outputSettings53.charset();
        org.jsoup.nodes.Document.OutputSettings outputSettings55 = outputSettings43.charset(charset54);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertNotNull(outputSettings3);
        org.junit.Assert.assertNotNull(outputSettings5);
        org.junit.Assert.assertTrue("'" + escapeMode6 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode6.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertNotNull(outputSettings8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 97 + "'", int9 == 97);
        org.junit.Assert.assertNotNull(outputSettings11);
        org.junit.Assert.assertNotNull(outputSettings13);
        org.junit.Assert.assertNotNull(outputSettings15);
        org.junit.Assert.assertNotNull(outputSettings17);
        org.junit.Assert.assertNotNull(outputSettings18);
        org.junit.Assert.assertNotNull(charset19);
        org.junit.Assert.assertTrue("'" + escapeMode21 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode21.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertNotNull(outputSettings23);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertNotNull(outputSettings27);
        org.junit.Assert.assertNotNull(outputSettings29);
        org.junit.Assert.assertTrue("'" + escapeMode31 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode31.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertNotNull(charset32);
        org.junit.Assert.assertNotNull(outputSettings33);
        org.junit.Assert.assertNotNull(outputSettings34);
        org.junit.Assert.assertNotNull(outputSettings36);
        org.junit.Assert.assertTrue("'" + escapeMode38 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode38.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertNotNull(outputSettings39);
        org.junit.Assert.assertNotNull(outputSettings40);
        org.junit.Assert.assertTrue("'" + escapeMode41 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode41.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertNotNull(outputSettings42);
        org.junit.Assert.assertNotNull(outputSettings43);
        org.junit.Assert.assertTrue("'" + int46 + "' != '" + 1 + "'", int46 == 1);
        org.junit.Assert.assertTrue("'" + escapeMode47 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode47.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertNotNull(outputSettings48);
        org.junit.Assert.assertNotNull(outputSettings50);
        org.junit.Assert.assertTrue("'" + escapeMode51 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode51.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertNotNull(outputSettings53);
        org.junit.Assert.assertNotNull(charset54);
        org.junit.Assert.assertNotNull(outputSettings55);
    }
}

