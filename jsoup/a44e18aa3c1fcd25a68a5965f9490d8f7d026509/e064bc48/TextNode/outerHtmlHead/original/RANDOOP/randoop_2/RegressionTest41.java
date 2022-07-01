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
        org.jsoup.nodes.Document.OutputSettings outputSettings0 = new org.jsoup.nodes.Document.OutputSettings();
        boolean boolean1 = outputSettings0.prettyPrint();
        org.jsoup.nodes.Document.OutputSettings outputSettings3 = outputSettings0.prettyPrint(true);
        java.nio.charset.Charset charset4 = outputSettings0.charset();
        org.jsoup.nodes.Document.OutputSettings outputSettings6 = outputSettings0.forceAllElementAsBlock(false);
        org.jsoup.nodes.Document.OutputSettings outputSettings8 = outputSettings6.indentAmount((int) ' ');
        org.jsoup.nodes.Document.OutputSettings outputSettings10 = outputSettings6.prettyPrint(false);
        org.jsoup.nodes.Document.OutputSettings outputSettings12 = outputSettings10.indentAmount((int) (byte) 100);
        org.jsoup.nodes.Document.OutputSettings outputSettings13 = new org.jsoup.nodes.Document.OutputSettings();
        int int14 = outputSettings13.indentAmount();
        org.jsoup.nodes.Document.OutputSettings outputSettings16 = outputSettings13.forceAllElementAsBlock(true);
        boolean boolean17 = outputSettings13.forceAllElementAsBlock();
        org.jsoup.nodes.Document.OutputSettings outputSettings19 = outputSettings13.indentAmount((int) (byte) 10);
        org.jsoup.nodes.Document.OutputSettings outputSettings21 = outputSettings19.prettyPrint(true);
        org.jsoup.nodes.Document.OutputSettings outputSettings22 = new org.jsoup.nodes.Document.OutputSettings();
        boolean boolean23 = outputSettings22.prettyPrint();
        org.jsoup.nodes.Document.OutputSettings outputSettings25 = outputSettings22.prettyPrint(true);
        org.jsoup.nodes.Document.OutputSettings outputSettings26 = new org.jsoup.nodes.Document.OutputSettings();
        boolean boolean27 = outputSettings26.prettyPrint();
        org.jsoup.nodes.Entities.EscapeMode escapeMode28 = outputSettings26.escapeMode();
        int int29 = outputSettings26.indentAmount();
        org.jsoup.nodes.Document.OutputSettings outputSettings31 = outputSettings26.prettyPrint(false);
        org.jsoup.nodes.Document.OutputSettings outputSettings32 = new org.jsoup.nodes.Document.OutputSettings();
        boolean boolean33 = outputSettings32.prettyPrint();
        org.jsoup.nodes.Entities.EscapeMode escapeMode34 = outputSettings32.escapeMode();
        org.jsoup.nodes.Document.OutputSettings outputSettings35 = outputSettings31.escapeMode(escapeMode34);
        org.jsoup.nodes.Document.OutputSettings outputSettings36 = outputSettings22.escapeMode(escapeMode34);
        org.jsoup.nodes.Entities.EscapeMode escapeMode37 = outputSettings22.escapeMode();
        org.jsoup.nodes.Document.OutputSettings outputSettings38 = outputSettings22.clone();
        org.jsoup.nodes.Document.OutputSettings outputSettings40 = outputSettings38.prettyPrint(true);
        org.jsoup.nodes.Document.OutputSettings outputSettings41 = new org.jsoup.nodes.Document.OutputSettings();
        boolean boolean42 = outputSettings41.prettyPrint();
        org.jsoup.nodes.Document.OutputSettings outputSettings44 = outputSettings41.prettyPrint(true);
        org.jsoup.nodes.Document.OutputSettings outputSettings45 = new org.jsoup.nodes.Document.OutputSettings();
        boolean boolean46 = outputSettings45.prettyPrint();
        org.jsoup.nodes.Entities.EscapeMode escapeMode47 = outputSettings45.escapeMode();
        int int48 = outputSettings45.indentAmount();
        org.jsoup.nodes.Document.OutputSettings outputSettings50 = outputSettings45.prettyPrint(false);
        org.jsoup.nodes.Document.OutputSettings outputSettings51 = new org.jsoup.nodes.Document.OutputSettings();
        boolean boolean52 = outputSettings51.prettyPrint();
        org.jsoup.nodes.Entities.EscapeMode escapeMode53 = outputSettings51.escapeMode();
        org.jsoup.nodes.Document.OutputSettings outputSettings54 = outputSettings50.escapeMode(escapeMode53);
        org.jsoup.nodes.Document.OutputSettings outputSettings55 = outputSettings41.escapeMode(escapeMode53);
        org.jsoup.nodes.Entities.EscapeMode escapeMode56 = outputSettings41.escapeMode();
        org.jsoup.nodes.Document.OutputSettings outputSettings57 = outputSettings41.clone();
        org.jsoup.nodes.Document.OutputSettings outputSettings58 = outputSettings41.clone();
        org.jsoup.nodes.Document.OutputSettings outputSettings60 = outputSettings41.indentAmount((int) (byte) 1);
        java.nio.charset.Charset charset61 = outputSettings60.charset();
        org.jsoup.nodes.Document.OutputSettings outputSettings62 = outputSettings38.charset(charset61);
        org.jsoup.nodes.Document.OutputSettings outputSettings63 = outputSettings19.charset(charset61);
        boolean boolean64 = outputSettings19.forceAllElementAsBlock();
        java.nio.charset.Charset charset65 = outputSettings19.charset();
        org.jsoup.nodes.Document.OutputSettings outputSettings66 = outputSettings10.charset(charset65);
        org.jsoup.nodes.Document.OutputSettings outputSettings68 = outputSettings66.forceAllElementAsBlock(true);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertNotNull(outputSettings3);
        org.junit.Assert.assertNotNull(charset4);
        org.junit.Assert.assertNotNull(outputSettings6);
        org.junit.Assert.assertNotNull(outputSettings8);
        org.junit.Assert.assertNotNull(outputSettings10);
        org.junit.Assert.assertNotNull(outputSettings12);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertNotNull(outputSettings16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertNotNull(outputSettings19);
        org.junit.Assert.assertNotNull(outputSettings21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertNotNull(outputSettings25);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertTrue("'" + escapeMode28 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode28.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 1 + "'", int29 == 1);
        org.junit.Assert.assertNotNull(outputSettings31);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + true + "'", boolean33 == true);
        org.junit.Assert.assertTrue("'" + escapeMode34 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode34.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertNotNull(outputSettings35);
        org.junit.Assert.assertNotNull(outputSettings36);
        org.junit.Assert.assertTrue("'" + escapeMode37 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode37.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertNotNull(outputSettings38);
        org.junit.Assert.assertNotNull(outputSettings40);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + true + "'", boolean42 == true);
        org.junit.Assert.assertNotNull(outputSettings44);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + true + "'", boolean46 == true);
        org.junit.Assert.assertTrue("'" + escapeMode47 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode47.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + 1 + "'", int48 == 1);
        org.junit.Assert.assertNotNull(outputSettings50);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + true + "'", boolean52 == true);
        org.junit.Assert.assertTrue("'" + escapeMode53 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode53.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertNotNull(outputSettings54);
        org.junit.Assert.assertNotNull(outputSettings55);
        org.junit.Assert.assertTrue("'" + escapeMode56 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode56.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertNotNull(outputSettings57);
        org.junit.Assert.assertNotNull(outputSettings58);
        org.junit.Assert.assertNotNull(outputSettings60);
        org.junit.Assert.assertNotNull(charset61);
        org.junit.Assert.assertNotNull(outputSettings62);
        org.junit.Assert.assertNotNull(outputSettings63);
        org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + true + "'", boolean64 == true);
        org.junit.Assert.assertNotNull(charset65);
        org.junit.Assert.assertNotNull(outputSettings66);
        org.junit.Assert.assertNotNull(outputSettings68);
    }

    @Test
    public void test20502() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20502");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("", "");
        java.lang.String str3 = textNode2.getWholeText();
        java.lang.String str4 = textNode2.baseUri();
        org.jsoup.nodes.TextNode textNode6 = textNode2.text("hi!");
        java.lang.String str7 = textNode2.baseUri();
        java.lang.String str8 = textNode2.getWholeText();
        org.jsoup.nodes.TextNode textNode10 = textNode2.text("hi!");
        boolean boolean12 = textNode2.hasAttr("");
        java.lang.String str14 = textNode2.attr("");
        java.lang.String str15 = textNode2.getWholeText();
        java.lang.String str16 = textNode2.baseUri();
        boolean boolean17 = textNode2.isBlank();
        org.junit.Assert.assertNotNull(textNode2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(textNode6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertNotNull(textNode10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test20503() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20503");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("", "hi!");
        org.jsoup.nodes.Document document3 = textNode2.ownerDocument();
        org.jsoup.nodes.Node node6 = textNode2.attr("#text", "hi!");
        java.lang.String str7 = textNode2.nodeName();
        org.jsoup.nodes.Node node9 = textNode2.removeAttr("hi!");
        java.lang.String str10 = textNode2.text();
        org.jsoup.nodes.TextNode textNode12 = textNode2.text("hi!");
        org.jsoup.nodes.TextNode textNode15 = org.jsoup.nodes.TextNode.createFromEncoded("", "");
        java.lang.String str16 = textNode15.getWholeText();
        java.lang.String str17 = textNode15.baseUri();
        org.jsoup.nodes.TextNode textNode19 = textNode15.text("hi!");
        org.jsoup.nodes.Node node20 = textNode19.clone();
        org.jsoup.nodes.Node node22 = textNode19.removeAttr("hi!");
        java.lang.String str23 = textNode19.text();
        org.jsoup.nodes.Node node25 = textNode19.removeAttr("i!");
        int int26 = textNode19.siblingIndex();
        boolean boolean27 = textNode2.equals((java.lang.Object) int26);
        org.junit.Assert.assertNotNull(textNode2);
        org.junit.Assert.assertNull(document3);
        org.junit.Assert.assertNotNull(node6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "#text" + "'", str7, "#text");
        org.junit.Assert.assertNotNull(node9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNotNull(textNode12);
        org.junit.Assert.assertNotNull(textNode15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertNotNull(textNode19);
        org.junit.Assert.assertNotNull(node20);
        org.junit.Assert.assertNotNull(node22);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "hi!" + "'", str23, "hi!");
        org.junit.Assert.assertNotNull(node25);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
    }

    @Test
    public void test20504() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20504");
        org.jsoup.nodes.Document.OutputSettings outputSettings0 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Entities.EscapeMode escapeMode1 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings2 = outputSettings0.escapeMode(escapeMode1);
        java.nio.charset.Charset charset3 = outputSettings0.charset();
        org.jsoup.nodes.Document.OutputSettings outputSettings5 = outputSettings0.forceAllElementAsBlock(false);
        org.jsoup.nodes.Document.OutputSettings outputSettings6 = new org.jsoup.nodes.Document.OutputSettings();
        boolean boolean7 = outputSettings6.prettyPrint();
        org.jsoup.nodes.Document.OutputSettings outputSettings9 = outputSettings6.prettyPrint(true);
        java.nio.charset.Charset charset10 = outputSettings6.charset();
        org.jsoup.nodes.Document.OutputSettings outputSettings12 = outputSettings6.forceAllElementAsBlock(false);
        org.jsoup.nodes.Document.OutputSettings outputSettings13 = new org.jsoup.nodes.Document.OutputSettings();
        boolean boolean14 = outputSettings13.prettyPrint();
        org.jsoup.nodes.Entities.EscapeMode escapeMode15 = outputSettings13.escapeMode();
        boolean boolean16 = outputSettings13.forceAllElementAsBlock();
        org.jsoup.nodes.Document.OutputSettings outputSettings17 = new org.jsoup.nodes.Document.OutputSettings();
        boolean boolean18 = outputSettings17.prettyPrint();
        org.jsoup.nodes.Entities.EscapeMode escapeMode19 = outputSettings17.escapeMode();
        org.jsoup.nodes.Document.OutputSettings outputSettings20 = outputSettings13.escapeMode(escapeMode19);
        org.jsoup.nodes.Document.OutputSettings outputSettings22 = outputSettings13.prettyPrint(false);
        org.jsoup.nodes.Entities.EscapeMode escapeMode23 = outputSettings13.escapeMode();
        org.jsoup.nodes.Document.OutputSettings outputSettings24 = outputSettings12.escapeMode(escapeMode23);
        java.nio.charset.Charset charset25 = outputSettings24.charset();
        java.nio.charset.Charset charset26 = outputSettings24.charset();
        org.jsoup.nodes.Document.OutputSettings outputSettings27 = outputSettings0.charset(charset26);
        org.jsoup.nodes.Document.OutputSettings outputSettings29 = outputSettings27.indentAmount((int) (byte) 0);
        org.jsoup.nodes.Document.OutputSettings outputSettings30 = new org.jsoup.nodes.Document.OutputSettings();
        boolean boolean31 = outputSettings30.prettyPrint();
        org.jsoup.nodes.Entities.EscapeMode escapeMode32 = outputSettings30.escapeMode();
        int int33 = outputSettings30.indentAmount();
        org.jsoup.nodes.Document.OutputSettings outputSettings35 = outputSettings30.indentAmount(0);
        org.jsoup.nodes.Document.OutputSettings outputSettings37 = outputSettings30.forceAllElementAsBlock(false);
        java.nio.charset.Charset charset38 = outputSettings30.charset();
        int int39 = outputSettings30.indentAmount();
        org.jsoup.nodes.Document.OutputSettings outputSettings40 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Entities.EscapeMode escapeMode41 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings42 = outputSettings40.escapeMode(escapeMode41);
        boolean boolean43 = outputSettings40.forceAllElementAsBlock();
        org.jsoup.nodes.Document.OutputSettings outputSettings44 = new org.jsoup.nodes.Document.OutputSettings();
        boolean boolean45 = outputSettings44.prettyPrint();
        org.jsoup.nodes.Entities.EscapeMode escapeMode46 = outputSettings44.escapeMode();
        org.jsoup.nodes.Document.OutputSettings outputSettings47 = outputSettings40.escapeMode(escapeMode46);
        boolean boolean48 = outputSettings47.forceAllElementAsBlock();
        org.jsoup.nodes.Document.OutputSettings outputSettings49 = new org.jsoup.nodes.Document.OutputSettings();
        boolean boolean50 = outputSettings49.prettyPrint();
        org.jsoup.nodes.Document.OutputSettings outputSettings52 = outputSettings49.prettyPrint(true);
        boolean boolean53 = outputSettings49.prettyPrint();
        org.jsoup.nodes.Entities.EscapeMode escapeMode54 = outputSettings49.escapeMode();
        org.jsoup.nodes.Document.OutputSettings outputSettings55 = outputSettings47.escapeMode(escapeMode54);
        org.jsoup.nodes.Document.OutputSettings outputSettings56 = outputSettings30.escapeMode(escapeMode54);
        org.jsoup.nodes.Document.OutputSettings outputSettings57 = outputSettings29.escapeMode(escapeMode54);
        int int58 = outputSettings57.indentAmount();
        org.junit.Assert.assertNotNull(outputSettings2);
        org.junit.Assert.assertNotNull(charset3);
        org.junit.Assert.assertNotNull(outputSettings5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(outputSettings9);
        org.junit.Assert.assertNotNull(charset10);
        org.junit.Assert.assertNotNull(outputSettings12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + escapeMode15 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode15.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + escapeMode19 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode19.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertNotNull(outputSettings20);
        org.junit.Assert.assertNotNull(outputSettings22);
        org.junit.Assert.assertTrue("'" + escapeMode23 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode23.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertNotNull(outputSettings24);
        org.junit.Assert.assertNotNull(charset25);
        org.junit.Assert.assertNotNull(charset26);
        org.junit.Assert.assertNotNull(outputSettings27);
        org.junit.Assert.assertNotNull(outputSettings29);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + true + "'", boolean31 == true);
        org.junit.Assert.assertTrue("'" + escapeMode32 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode32.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 1 + "'", int33 == 1);
        org.junit.Assert.assertNotNull(outputSettings35);
        org.junit.Assert.assertNotNull(outputSettings37);
        org.junit.Assert.assertNotNull(charset38);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 0 + "'", int39 == 0);
        org.junit.Assert.assertNotNull(outputSettings42);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + true + "'", boolean45 == true);
        org.junit.Assert.assertTrue("'" + escapeMode46 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode46.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertNotNull(outputSettings47);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + true + "'", boolean50 == true);
        org.junit.Assert.assertNotNull(outputSettings52);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + true + "'", boolean53 == true);
        org.junit.Assert.assertTrue("'" + escapeMode54 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode54.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertNotNull(outputSettings55);
        org.junit.Assert.assertNotNull(outputSettings56);
        org.junit.Assert.assertNotNull(outputSettings57);
        org.junit.Assert.assertTrue("'" + int58 + "' != '" + 0 + "'", int58 == 0);
    }

    @Test
    public void test20505() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20505");
        org.jsoup.nodes.Document.OutputSettings outputSettings0 = new org.jsoup.nodes.Document.OutputSettings();
        boolean boolean1 = outputSettings0.prettyPrint();
        org.jsoup.nodes.Entities.EscapeMode escapeMode2 = outputSettings0.escapeMode();
        int int3 = outputSettings0.indentAmount();
        org.jsoup.nodes.Document.OutputSettings outputSettings5 = outputSettings0.prettyPrint(false);
        java.nio.charset.Charset charset6 = outputSettings5.charset();
        boolean boolean7 = outputSettings5.forceAllElementAsBlock();
        org.jsoup.nodes.Document.OutputSettings outputSettings8 = new org.jsoup.nodes.Document.OutputSettings();
        boolean boolean9 = outputSettings8.prettyPrint();
        org.jsoup.nodes.Document.OutputSettings outputSettings11 = outputSettings8.prettyPrint(true);
        org.jsoup.nodes.Document.OutputSettings outputSettings12 = new org.jsoup.nodes.Document.OutputSettings();
        boolean boolean13 = outputSettings12.prettyPrint();
        org.jsoup.nodes.Entities.EscapeMode escapeMode14 = outputSettings12.escapeMode();
        int int15 = outputSettings12.indentAmount();
        org.jsoup.nodes.Document.OutputSettings outputSettings17 = outputSettings12.prettyPrint(false);
        org.jsoup.nodes.Document.OutputSettings outputSettings18 = new org.jsoup.nodes.Document.OutputSettings();
        boolean boolean19 = outputSettings18.prettyPrint();
        org.jsoup.nodes.Entities.EscapeMode escapeMode20 = outputSettings18.escapeMode();
        org.jsoup.nodes.Document.OutputSettings outputSettings21 = outputSettings17.escapeMode(escapeMode20);
        org.jsoup.nodes.Document.OutputSettings outputSettings22 = outputSettings8.escapeMode(escapeMode20);
        org.jsoup.nodes.Entities.EscapeMode escapeMode23 = outputSettings8.escapeMode();
        org.jsoup.nodes.Document.OutputSettings outputSettings24 = outputSettings8.clone();
        org.jsoup.nodes.Document.OutputSettings outputSettings25 = outputSettings8.clone();
        boolean boolean26 = outputSettings25.forceAllElementAsBlock();
        org.jsoup.nodes.Document.OutputSettings outputSettings28 = outputSettings25.forceAllElementAsBlock(false);
        org.jsoup.nodes.Document.OutputSettings outputSettings30 = outputSettings28.forceAllElementAsBlock(false);
        org.jsoup.nodes.Document.OutputSettings outputSettings32 = outputSettings28.forceAllElementAsBlock(false);
        org.jsoup.nodes.Document.OutputSettings outputSettings33 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Entities.EscapeMode escapeMode34 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings35 = outputSettings33.escapeMode(escapeMode34);
        int int36 = outputSettings33.indentAmount();
        org.jsoup.nodes.Document.OutputSettings outputSettings37 = new org.jsoup.nodes.Document.OutputSettings();
        boolean boolean38 = outputSettings37.prettyPrint();
        org.jsoup.nodes.Document.OutputSettings outputSettings40 = outputSettings37.prettyPrint(true);
        java.nio.charset.Charset charset41 = outputSettings37.charset();
        org.jsoup.nodes.Document.OutputSettings outputSettings42 = outputSettings33.charset(charset41);
        java.nio.charset.Charset charset43 = outputSettings42.charset();
        org.jsoup.nodes.Document.OutputSettings outputSettings44 = outputSettings28.charset(charset43);
        org.jsoup.nodes.Document.OutputSettings outputSettings45 = new org.jsoup.nodes.Document.OutputSettings();
        boolean boolean46 = outputSettings45.prettyPrint();
        org.jsoup.nodes.Document.OutputSettings outputSettings48 = outputSettings45.prettyPrint(true);
        org.jsoup.nodes.Document.OutputSettings outputSettings49 = new org.jsoup.nodes.Document.OutputSettings();
        boolean boolean50 = outputSettings49.prettyPrint();
        org.jsoup.nodes.Entities.EscapeMode escapeMode51 = outputSettings49.escapeMode();
        int int52 = outputSettings49.indentAmount();
        org.jsoup.nodes.Document.OutputSettings outputSettings54 = outputSettings49.prettyPrint(false);
        org.jsoup.nodes.Document.OutputSettings outputSettings55 = new org.jsoup.nodes.Document.OutputSettings();
        boolean boolean56 = outputSettings55.prettyPrint();
        org.jsoup.nodes.Entities.EscapeMode escapeMode57 = outputSettings55.escapeMode();
        org.jsoup.nodes.Document.OutputSettings outputSettings58 = outputSettings54.escapeMode(escapeMode57);
        org.jsoup.nodes.Document.OutputSettings outputSettings59 = outputSettings45.escapeMode(escapeMode57);
        org.jsoup.nodes.Entities.EscapeMode escapeMode60 = outputSettings45.escapeMode();
        org.jsoup.nodes.Document.OutputSettings outputSettings61 = outputSettings45.clone();
        java.nio.charset.Charset charset62 = outputSettings45.charset();
        org.jsoup.nodes.Document.OutputSettings outputSettings63 = outputSettings44.charset(charset62);
        org.jsoup.nodes.Document.OutputSettings outputSettings64 = outputSettings5.charset(charset62);
        org.jsoup.nodes.Entities.EscapeMode escapeMode65 = outputSettings64.escapeMode();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + escapeMode2 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode2.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertNotNull(outputSettings5);
        org.junit.Assert.assertNotNull(charset6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(outputSettings11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + escapeMode14 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode14.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertNotNull(outputSettings17);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + escapeMode20 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode20.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertNotNull(outputSettings21);
        org.junit.Assert.assertNotNull(outputSettings22);
        org.junit.Assert.assertTrue("'" + escapeMode23 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode23.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertNotNull(outputSettings24);
        org.junit.Assert.assertNotNull(outputSettings25);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNotNull(outputSettings28);
        org.junit.Assert.assertNotNull(outputSettings30);
        org.junit.Assert.assertNotNull(outputSettings32);
        org.junit.Assert.assertNotNull(outputSettings35);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 1 + "'", int36 == 1);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + true + "'", boolean38 == true);
        org.junit.Assert.assertNotNull(outputSettings40);
        org.junit.Assert.assertNotNull(charset41);
        org.junit.Assert.assertNotNull(outputSettings42);
        org.junit.Assert.assertNotNull(charset43);
        org.junit.Assert.assertNotNull(outputSettings44);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + true + "'", boolean46 == true);
        org.junit.Assert.assertNotNull(outputSettings48);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + true + "'", boolean50 == true);
        org.junit.Assert.assertTrue("'" + escapeMode51 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode51.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertTrue("'" + int52 + "' != '" + 1 + "'", int52 == 1);
        org.junit.Assert.assertNotNull(outputSettings54);
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + true + "'", boolean56 == true);
        org.junit.Assert.assertTrue("'" + escapeMode57 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode57.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertNotNull(outputSettings58);
        org.junit.Assert.assertNotNull(outputSettings59);
        org.junit.Assert.assertTrue("'" + escapeMode60 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode60.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertNotNull(outputSettings61);
        org.junit.Assert.assertNotNull(charset62);
        org.junit.Assert.assertNotNull(outputSettings63);
        org.junit.Assert.assertNotNull(outputSettings64);
        org.junit.Assert.assertTrue("'" + escapeMode65 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode65.equals(org.jsoup.nodes.Entities.EscapeMode.base));
    }

    @Test
    public void test20506() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20506");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("hi!", "hi!");
        java.lang.String str3 = textNode2.getWholeText();
        org.jsoup.nodes.Node node4 = textNode2.parent();
        java.lang.String str6 = textNode2.absUrl("hi!");
        java.lang.String str7 = textNode2.toString();
        int int8 = textNode2.siblingIndex();
        org.jsoup.nodes.Node node9 = textNode2.parent();
        java.lang.String str10 = textNode2.text();
        org.jsoup.nodes.Node node12 = textNode2.removeAttr("hi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertNull(node4);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNull(node9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertNotNull(node12);
    }

    @Test
    public void test20507() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20507");
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
        boolean boolean34 = outputSettings28.forceAllElementAsBlock();
        org.jsoup.nodes.Document.OutputSettings outputSettings36 = outputSettings28.indentAmount((int) (short) 1);
        boolean boolean37 = outputSettings36.forceAllElementAsBlock();
        org.junit.Assert.assertNotNull(textNode2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(nodeList7);
        org.junit.Assert.assertNotNull(textNode9);
        org.junit.Assert.assertNotNull(textNode11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNotNull(outputSettings15);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + escapeMode18 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode18.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 1 + "'", int19 == 1);
        org.junit.Assert.assertNotNull(outputSettings21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + escapeMode24 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode24.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertNotNull(outputSettings25);
        org.junit.Assert.assertNotNull(outputSettings26);
        org.junit.Assert.assertTrue("'" + escapeMode27 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode27.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertNotNull(outputSettings28);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertNotNull(outputSettings31);
        org.junit.Assert.assertNotNull(charset32);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertNotNull(outputSettings36);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
    }

    @Test
    public void test20508() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20508");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("", "");
        org.jsoup.nodes.TextNode textNode4 = textNode2.text("");
        org.jsoup.nodes.TextNode textNode6 = textNode4.text("#text");
        textNode4.setBaseUri("#text");
        org.jsoup.nodes.TextNode textNode10 = textNode4.text("hi!");
        org.jsoup.nodes.Node node12 = textNode10.removeAttr("hi!");
        boolean boolean13 = textNode10.isBlank();
        org.jsoup.nodes.Document document14 = textNode10.ownerDocument();
        org.junit.Assert.assertNotNull(textNode2);
        org.junit.Assert.assertNotNull(textNode4);
        org.junit.Assert.assertNotNull(textNode6);
        org.junit.Assert.assertNotNull(textNode10);
        org.junit.Assert.assertNotNull(node12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNull(document14);
    }

    @Test
    public void test20509() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20509");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("", "hi!");
        org.jsoup.nodes.Document document3 = textNode2.ownerDocument();
        org.jsoup.nodes.Node node6 = textNode2.attr("#text", "hi!");
        java.lang.String str7 = textNode2.nodeName();
        org.jsoup.nodes.Attributes attributes8 = textNode2.attributes();
        int int9 = textNode2.siblingIndex();
        java.lang.String str10 = textNode2.nodeName();
        java.lang.String str11 = textNode2.nodeName();
        org.jsoup.nodes.Node node13 = textNode2.removeAttr("h");
        org.junit.Assert.assertNotNull(textNode2);
        org.junit.Assert.assertNull(document3);
        org.junit.Assert.assertNotNull(node6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "#text" + "'", str7, "#text");
        org.junit.Assert.assertNotNull(attributes8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "#text" + "'", str10, "#text");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "#text" + "'", str11, "#text");
        org.junit.Assert.assertNotNull(node13);
    }

    @Test
    public void test20510() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20510");
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
        org.jsoup.nodes.Document document15 = textNode6.ownerDocument();
        java.lang.String str16 = textNode6.nodeName();
        org.junit.Assert.assertNotNull(textNode2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(textNode6);
        org.junit.Assert.assertNotNull(node7);
        org.junit.Assert.assertNotNull(node9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertNotNull(nodeList11);
        org.junit.Assert.assertNotNull(textNode13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertNull(document15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "#text" + "'", str16, "#text");
    }

    @Test
    public void test20511() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20511");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("hi!", "hi!");
        java.lang.String str4 = textNode2.absUrl("hi!");
        org.jsoup.nodes.TextNode textNode6 = textNode2.text("");
        org.jsoup.nodes.Node node7 = textNode6.clone();
        boolean boolean9 = textNode6.hasAttr("#text");
        boolean boolean11 = textNode6.hasAttr("#text");
        org.jsoup.nodes.Node node12 = textNode6.previousSibling();
        textNode6.setBaseUri("i!");
        org.jsoup.nodes.Node node17 = textNode6.attr("text", "h");
        org.jsoup.nodes.Node node18 = textNode6.parent();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(textNode6);
        org.junit.Assert.assertNotNull(node7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNull(node12);
        org.junit.Assert.assertNotNull(node17);
        org.junit.Assert.assertNull(node18);
    }

    @Test
    public void test20512() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20512");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("", "");
        java.lang.String str3 = textNode2.getWholeText();
        java.lang.String str4 = textNode2.baseUri();
        org.jsoup.nodes.TextNode textNode6 = textNode2.text("hi!");
        org.jsoup.nodes.Node node7 = textNode6.clone();
        org.jsoup.nodes.Node node9 = textNode6.removeAttr("hi!");
        java.lang.String str10 = textNode6.toString();
        java.util.List<org.jsoup.nodes.Node> nodeList11 = textNode6.siblingNodes();
        org.jsoup.nodes.Node node13 = textNode6.removeAttr("#text");
        org.jsoup.nodes.Attributes attributes14 = textNode6.attributes();
        org.jsoup.nodes.Node node15 = textNode6.clone();
        java.lang.String str16 = textNode6.outerHtml();
        org.jsoup.nodes.Node node17 = textNode6.nextSibling();
        boolean boolean19 = textNode6.hasAttr("#");
        java.lang.String str20 = textNode6.outerHtml();
        org.junit.Assert.assertNotNull(textNode2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(textNode6);
        org.junit.Assert.assertNotNull(node7);
        org.junit.Assert.assertNotNull(node9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertNotNull(nodeList11);
        org.junit.Assert.assertNotNull(node13);
        org.junit.Assert.assertNotNull(attributes14);
        org.junit.Assert.assertNotNull(node15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertNull(node17);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "hi!" + "'", str20, "hi!");
    }

    @Test
    public void test20513() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20513");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("", "");
        java.lang.String str3 = textNode2.getWholeText();
        java.lang.String str4 = textNode2.baseUri();
        org.jsoup.nodes.TextNode textNode6 = textNode2.text("hi!");
        org.jsoup.nodes.Attributes attributes7 = textNode2.attributes();
        java.lang.String str9 = textNode2.attr("hi!");
        org.jsoup.nodes.Node node12 = textNode2.attr("#text", "i!");
        org.jsoup.nodes.Node node13 = textNode2.previousSibling();
        java.lang.String str14 = textNode2.toString();
        java.lang.String str15 = textNode2.baseUri();
        org.jsoup.nodes.TextNode textNode17 = textNode2.text("hi!");
        org.jsoup.nodes.Node node19 = textNode17.removeAttr("h");
        org.junit.Assert.assertNotNull(textNode2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(textNode6);
        org.junit.Assert.assertNotNull(attributes7);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNotNull(node12);
        org.junit.Assert.assertNull(node13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertNotNull(textNode17);
        org.junit.Assert.assertNotNull(node19);
    }

    @Test
    public void test20514() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20514");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("", "");
        java.lang.String str3 = textNode2.getWholeText();
        java.lang.String str4 = textNode2.baseUri();
        org.jsoup.nodes.TextNode textNode6 = textNode2.text("hi!");
        org.jsoup.nodes.Node node7 = textNode6.clone();
        org.jsoup.nodes.Node node9 = textNode6.removeAttr("hi!");
        java.lang.String str10 = textNode6.toString();
        java.util.List<org.jsoup.nodes.Node> nodeList11 = textNode6.siblingNodes();
        org.jsoup.nodes.Node node13 = textNode6.removeAttr("#text");
        boolean boolean15 = textNode6.hasAttr("hi!");
        boolean boolean16 = textNode6.isBlank();
        int int17 = textNode6.siblingIndex();
        org.jsoup.nodes.Node node20 = textNode6.attr("#text", "text");
        org.junit.Assert.assertNotNull(textNode2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(textNode6);
        org.junit.Assert.assertNotNull(node7);
        org.junit.Assert.assertNotNull(node9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertNotNull(nodeList11);
        org.junit.Assert.assertNotNull(node13);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertNotNull(node20);
    }

    @Test
    public void test20515() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20515");
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
        java.lang.String str22 = textNode11.baseUri();
        org.jsoup.nodes.TextNode textNode25 = new org.jsoup.nodes.TextNode("hi!", "hi!");
        boolean boolean27 = textNode25.hasAttr("hi!");
        org.jsoup.nodes.Attributes attributes28 = textNode25.attributes();
        java.lang.String str29 = textNode25.toString();
        boolean boolean30 = textNode11.equals((java.lang.Object) str29);
        java.lang.String str31 = textNode11.toString();
        org.jsoup.nodes.Node node32 = textNode11.nextSibling();
        org.junit.Assert.assertNotNull(textNode2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(node6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(textNode11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertNotNull(node21);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNotNull(attributes28);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "hi!" + "'", str29, "hi!");
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "" + "'", str31, "");
        org.junit.Assert.assertNull(node32);
    }

    @Test
    public void test20516() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20516");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("", "");
        boolean boolean3 = textNode2.isBlank();
        org.jsoup.nodes.Document.OutputSettings outputSettings4 = new org.jsoup.nodes.Document.OutputSettings();
        boolean boolean5 = outputSettings4.prettyPrint();
        boolean boolean6 = textNode2.equals((java.lang.Object) boolean5);
        java.lang.String str7 = textNode2.nodeName();
        org.jsoup.nodes.Node node8 = textNode2.clone();
        org.jsoup.nodes.Node node9 = textNode2.previousSibling();
        org.jsoup.nodes.Document.OutputSettings outputSettings10 = new org.jsoup.nodes.Document.OutputSettings();
        boolean boolean11 = outputSettings10.prettyPrint();
        org.jsoup.nodes.Document.OutputSettings outputSettings13 = outputSettings10.prettyPrint(true);
        org.jsoup.nodes.Document.OutputSettings outputSettings14 = new org.jsoup.nodes.Document.OutputSettings();
        boolean boolean15 = outputSettings14.prettyPrint();
        org.jsoup.nodes.Entities.EscapeMode escapeMode16 = outputSettings14.escapeMode();
        int int17 = outputSettings14.indentAmount();
        org.jsoup.nodes.Document.OutputSettings outputSettings19 = outputSettings14.prettyPrint(false);
        org.jsoup.nodes.Document.OutputSettings outputSettings20 = new org.jsoup.nodes.Document.OutputSettings();
        boolean boolean21 = outputSettings20.prettyPrint();
        org.jsoup.nodes.Entities.EscapeMode escapeMode22 = outputSettings20.escapeMode();
        org.jsoup.nodes.Document.OutputSettings outputSettings23 = outputSettings19.escapeMode(escapeMode22);
        org.jsoup.nodes.Document.OutputSettings outputSettings24 = outputSettings10.escapeMode(escapeMode22);
        org.jsoup.nodes.Entities.EscapeMode escapeMode25 = outputSettings10.escapeMode();
        org.jsoup.nodes.Document.OutputSettings outputSettings26 = outputSettings10.clone();
        org.jsoup.nodes.Document.OutputSettings outputSettings27 = outputSettings10.clone();
        org.jsoup.nodes.Document.OutputSettings outputSettings29 = outputSettings10.indentAmount((int) (byte) 1);
        java.nio.charset.Charset charset30 = outputSettings29.charset();
        org.jsoup.nodes.Entities.EscapeMode escapeMode31 = outputSettings29.escapeMode();
        boolean boolean32 = textNode2.equals((java.lang.Object) escapeMode31);
        textNode2.setBaseUri("");
        java.lang.String str35 = textNode2.text();
        textNode2.setBaseUri("hi!");
        org.jsoup.nodes.Node node38 = textNode2.clone();
        org.junit.Assert.assertNotNull(textNode2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "#text" + "'", str7, "#text");
        org.junit.Assert.assertNotNull(node8);
        org.junit.Assert.assertNull(node9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(outputSettings13);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + escapeMode16 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode16.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
        org.junit.Assert.assertNotNull(outputSettings19);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertTrue("'" + escapeMode22 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode22.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertNotNull(outputSettings23);
        org.junit.Assert.assertNotNull(outputSettings24);
        org.junit.Assert.assertTrue("'" + escapeMode25 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode25.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertNotNull(outputSettings26);
        org.junit.Assert.assertNotNull(outputSettings27);
        org.junit.Assert.assertNotNull(outputSettings29);
        org.junit.Assert.assertNotNull(charset30);
        org.junit.Assert.assertTrue("'" + escapeMode31 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode31.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "" + "'", str35, "");
        org.junit.Assert.assertNotNull(node38);
    }

    @Test
    public void test20517() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20517");
        org.jsoup.nodes.Document.OutputSettings outputSettings0 = new org.jsoup.nodes.Document.OutputSettings();
        boolean boolean1 = outputSettings0.prettyPrint();
        org.jsoup.nodes.Entities.EscapeMode escapeMode2 = outputSettings0.escapeMode();
        int int3 = outputSettings0.indentAmount();
        org.jsoup.nodes.Document.OutputSettings outputSettings5 = outputSettings0.indentAmount(0);
        org.jsoup.nodes.Document.OutputSettings outputSettings7 = outputSettings0.forceAllElementAsBlock(false);
        int int8 = outputSettings0.indentAmount();
        boolean boolean9 = outputSettings0.prettyPrint();
        boolean boolean10 = outputSettings0.forceAllElementAsBlock();
        org.jsoup.nodes.Document.OutputSettings outputSettings12 = outputSettings0.forceAllElementAsBlock(true);
        int int13 = outputSettings12.indentAmount();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + escapeMode2 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode2.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertNotNull(outputSettings5);
        org.junit.Assert.assertNotNull(outputSettings7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(outputSettings12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
    }

    @Test
    public void test20518() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20518");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("", "");
        java.lang.String str3 = textNode2.getWholeText();
        java.lang.String str4 = textNode2.baseUri();
        org.jsoup.nodes.TextNode textNode6 = textNode2.text("hi!");
        org.jsoup.nodes.Node node7 = textNode6.clone();
        org.jsoup.nodes.Node node9 = textNode6.removeAttr("hi!");
        java.lang.String str10 = textNode6.toString();
        java.util.List<org.jsoup.nodes.Node> nodeList11 = textNode6.siblingNodes();
        org.jsoup.nodes.Node node12 = textNode6.parent();
        boolean boolean14 = textNode6.hasAttr("h");
        org.junit.Assert.assertNotNull(textNode2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(textNode6);
        org.junit.Assert.assertNotNull(node7);
        org.junit.Assert.assertNotNull(node9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertNotNull(nodeList11);
        org.junit.Assert.assertNull(node12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test20519() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20519");
        org.jsoup.nodes.Document.OutputSettings outputSettings0 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Entities.EscapeMode escapeMode1 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings2 = outputSettings0.escapeMode(escapeMode1);
        java.nio.charset.Charset charset3 = outputSettings2.charset();
        org.jsoup.nodes.Document.OutputSettings outputSettings5 = outputSettings2.forceAllElementAsBlock(true);
        org.jsoup.nodes.Entities.EscapeMode escapeMode6 = outputSettings5.escapeMode();
        org.jsoup.nodes.Document.OutputSettings outputSettings8 = outputSettings5.forceAllElementAsBlock(true);
        boolean boolean9 = outputSettings8.prettyPrint();
        org.jsoup.nodes.Document.OutputSettings outputSettings10 = new org.jsoup.nodes.Document.OutputSettings();
        int int11 = outputSettings10.indentAmount();
        org.jsoup.nodes.Document.OutputSettings outputSettings13 = outputSettings10.forceAllElementAsBlock(true);
        org.jsoup.nodes.Document.OutputSettings outputSettings15 = outputSettings10.prettyPrint(true);
        java.nio.charset.Charset charset16 = outputSettings10.charset();
        org.jsoup.nodes.Entities.EscapeMode escapeMode17 = outputSettings10.escapeMode();
        org.jsoup.nodes.Document.OutputSettings outputSettings18 = outputSettings8.escapeMode(escapeMode17);
        org.jsoup.nodes.Document.OutputSettings outputSettings19 = outputSettings8.clone();
        org.jsoup.nodes.Document.OutputSettings outputSettings20 = outputSettings8.clone();
        org.jsoup.nodes.Document.OutputSettings outputSettings21 = new org.jsoup.nodes.Document.OutputSettings();
        boolean boolean22 = outputSettings21.prettyPrint();
        org.jsoup.nodes.Document.OutputSettings outputSettings24 = outputSettings21.prettyPrint(true);
        java.nio.charset.Charset charset25 = outputSettings21.charset();
        org.jsoup.nodes.Document.OutputSettings outputSettings26 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Entities.EscapeMode escapeMode27 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings28 = outputSettings26.escapeMode(escapeMode27);
        boolean boolean29 = outputSettings26.forceAllElementAsBlock();
        org.jsoup.nodes.Document.OutputSettings outputSettings30 = new org.jsoup.nodes.Document.OutputSettings();
        boolean boolean31 = outputSettings30.prettyPrint();
        org.jsoup.nodes.Entities.EscapeMode escapeMode32 = outputSettings30.escapeMode();
        org.jsoup.nodes.Document.OutputSettings outputSettings33 = outputSettings26.escapeMode(escapeMode32);
        int int34 = outputSettings33.indentAmount();
        org.jsoup.nodes.Document.OutputSettings outputSettings35 = new org.jsoup.nodes.Document.OutputSettings();
        boolean boolean36 = outputSettings35.prettyPrint();
        org.jsoup.nodes.Entities.EscapeMode escapeMode37 = outputSettings35.escapeMode();
        boolean boolean38 = outputSettings35.forceAllElementAsBlock();
        org.jsoup.nodes.Document.OutputSettings outputSettings39 = new org.jsoup.nodes.Document.OutputSettings();
        boolean boolean40 = outputSettings39.prettyPrint();
        org.jsoup.nodes.Entities.EscapeMode escapeMode41 = outputSettings39.escapeMode();
        org.jsoup.nodes.Document.OutputSettings outputSettings42 = outputSettings35.escapeMode(escapeMode41);
        org.jsoup.nodes.Document.OutputSettings outputSettings43 = outputSettings33.escapeMode(escapeMode41);
        org.jsoup.nodes.Document.OutputSettings outputSettings44 = outputSettings43.clone();
        org.jsoup.nodes.Entities.EscapeMode escapeMode45 = outputSettings43.escapeMode();
        org.jsoup.nodes.Document.OutputSettings outputSettings46 = outputSettings21.escapeMode(escapeMode45);
        org.jsoup.nodes.Document.OutputSettings outputSettings47 = outputSettings20.escapeMode(escapeMode45);
        org.junit.Assert.assertNotNull(outputSettings2);
        org.junit.Assert.assertNotNull(charset3);
        org.junit.Assert.assertNotNull(outputSettings5);
        org.junit.Assert.assertNull(escapeMode6);
        org.junit.Assert.assertNotNull(outputSettings8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertNotNull(outputSettings13);
        org.junit.Assert.assertNotNull(outputSettings15);
        org.junit.Assert.assertNotNull(charset16);
        org.junit.Assert.assertTrue("'" + escapeMode17 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode17.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertNotNull(outputSettings18);
        org.junit.Assert.assertNotNull(outputSettings19);
        org.junit.Assert.assertNotNull(outputSettings20);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertNotNull(outputSettings24);
        org.junit.Assert.assertNotNull(charset25);
        org.junit.Assert.assertNotNull(outputSettings28);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + true + "'", boolean31 == true);
        org.junit.Assert.assertTrue("'" + escapeMode32 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode32.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertNotNull(outputSettings33);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 1 + "'", int34 == 1);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + true + "'", boolean36 == true);
        org.junit.Assert.assertTrue("'" + escapeMode37 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode37.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + true + "'", boolean40 == true);
        org.junit.Assert.assertTrue("'" + escapeMode41 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode41.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertNotNull(outputSettings42);
        org.junit.Assert.assertNotNull(outputSettings43);
        org.junit.Assert.assertNotNull(outputSettings44);
        org.junit.Assert.assertTrue("'" + escapeMode45 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode45.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertNotNull(outputSettings46);
        org.junit.Assert.assertNotNull(outputSettings47);
    }

    @Test
    public void test20520() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20520");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("", "");
        boolean boolean3 = textNode2.isBlank();
        org.jsoup.nodes.Node node6 = textNode2.attr("hi!", "hi!");
        org.jsoup.nodes.TextNode textNode8 = textNode2.text("#text");
        org.jsoup.nodes.Node node10 = textNode8.removeAttr("#text");
        java.util.List<org.jsoup.nodes.Node> nodeList11 = textNode8.siblingNodes();
        org.jsoup.nodes.Document.OutputSettings outputSettings12 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Entities.EscapeMode escapeMode13 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings14 = outputSettings12.escapeMode(escapeMode13);
        org.jsoup.nodes.Document.OutputSettings outputSettings16 = outputSettings12.forceAllElementAsBlock(false);
        org.jsoup.nodes.Document.OutputSettings outputSettings17 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Entities.EscapeMode escapeMode18 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings19 = outputSettings17.escapeMode(escapeMode18);
        int int20 = outputSettings17.indentAmount();
        org.jsoup.nodes.Document.OutputSettings outputSettings21 = new org.jsoup.nodes.Document.OutputSettings();
        boolean boolean22 = outputSettings21.prettyPrint();
        org.jsoup.nodes.Document.OutputSettings outputSettings24 = outputSettings21.prettyPrint(true);
        java.nio.charset.Charset charset25 = outputSettings21.charset();
        org.jsoup.nodes.Document.OutputSettings outputSettings26 = outputSettings17.charset(charset25);
        org.jsoup.nodes.Document.OutputSettings outputSettings27 = outputSettings16.charset(charset25);
        org.jsoup.nodes.Document.OutputSettings outputSettings29 = outputSettings16.prettyPrint(false);
        org.jsoup.nodes.Document.OutputSettings outputSettings31 = outputSettings16.forceAllElementAsBlock(false);
        java.lang.Class<?> wildcardClass32 = outputSettings31.getClass();
        boolean boolean33 = textNode8.equals((java.lang.Object) wildcardClass32);
        java.lang.String str34 = textNode8.nodeName();
        java.lang.String str35 = textNode8.outerHtml();
        org.jsoup.nodes.Document document36 = textNode8.ownerDocument();
        java.lang.String str37 = textNode8.getWholeText();
        org.junit.Assert.assertNotNull(textNode2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(node6);
        org.junit.Assert.assertNotNull(textNode8);
        org.junit.Assert.assertNotNull(node10);
        org.junit.Assert.assertNotNull(nodeList11);
        org.junit.Assert.assertNotNull(outputSettings14);
        org.junit.Assert.assertNotNull(outputSettings16);
        org.junit.Assert.assertNotNull(outputSettings19);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 1 + "'", int20 == 1);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertNotNull(outputSettings24);
        org.junit.Assert.assertNotNull(charset25);
        org.junit.Assert.assertNotNull(outputSettings26);
        org.junit.Assert.assertNotNull(outputSettings27);
        org.junit.Assert.assertNotNull(outputSettings29);
        org.junit.Assert.assertNotNull(outputSettings31);
        org.junit.Assert.assertNotNull(wildcardClass32);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "#text" + "'", str34, "#text");
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "#text" + "'", str35, "#text");
        org.junit.Assert.assertNull(document36);
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "#text" + "'", str37, "#text");
    }

    @Test
    public void test20521() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20521");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("", "");
        boolean boolean3 = textNode2.isBlank();
        org.jsoup.nodes.Document.OutputSettings outputSettings4 = new org.jsoup.nodes.Document.OutputSettings();
        boolean boolean5 = outputSettings4.prettyPrint();
        org.jsoup.nodes.Entities.EscapeMode escapeMode6 = outputSettings4.escapeMode();
        int int7 = outputSettings4.indentAmount();
        org.jsoup.nodes.Document.OutputSettings outputSettings9 = outputSettings4.prettyPrint(false);
        java.nio.charset.Charset charset10 = outputSettings9.charset();
        boolean boolean11 = textNode2.equals((java.lang.Object) outputSettings9);
        org.jsoup.nodes.Entities.EscapeMode escapeMode12 = outputSettings9.escapeMode();
        org.jsoup.nodes.Document.OutputSettings outputSettings14 = outputSettings9.forceAllElementAsBlock(true);
        boolean boolean15 = outputSettings14.forceAllElementAsBlock();
        org.jsoup.nodes.Document.OutputSettings outputSettings16 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Entities.EscapeMode escapeMode17 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings18 = outputSettings16.escapeMode(escapeMode17);
        int int19 = outputSettings16.indentAmount();
        java.nio.charset.Charset charset20 = outputSettings16.charset();
        org.jsoup.nodes.Document.OutputSettings outputSettings21 = outputSettings14.charset(charset20);
        org.jsoup.nodes.Document.OutputSettings outputSettings23 = outputSettings14.forceAllElementAsBlock(true);
        org.jsoup.nodes.Document.OutputSettings outputSettings25 = outputSettings14.indentAmount((int) (byte) 0);
        boolean boolean26 = outputSettings25.prettyPrint();
        org.jsoup.nodes.Document.OutputSettings outputSettings28 = outputSettings25.indentAmount((int) (byte) 0);
        boolean boolean29 = outputSettings25.forceAllElementAsBlock();
        org.junit.Assert.assertNotNull(textNode2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + escapeMode6 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode6.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertNotNull(outputSettings9);
        org.junit.Assert.assertNotNull(charset10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + escapeMode12 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode12.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertNotNull(outputSettings14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNotNull(outputSettings18);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 1 + "'", int19 == 1);
        org.junit.Assert.assertNotNull(charset20);
        org.junit.Assert.assertNotNull(outputSettings21);
        org.junit.Assert.assertNotNull(outputSettings23);
        org.junit.Assert.assertNotNull(outputSettings25);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNotNull(outputSettings28);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
    }

    @Test
    public void test20522() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20522");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("", "");
        java.lang.String str3 = textNode2.toString();
        org.jsoup.nodes.Node node4 = textNode2.nextSibling();
        java.lang.String str5 = textNode2.outerHtml();
        boolean boolean7 = textNode2.hasAttr("text");
        java.util.List<org.jsoup.nodes.Node> nodeList8 = textNode2.childNodes();
        org.jsoup.nodes.TextNode textNode10 = textNode2.text("text");
        org.junit.Assert.assertNotNull(textNode2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertNull(node4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(nodeList8);
        org.junit.Assert.assertNotNull(textNode10);
    }

    @Test
    public void test20523() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20523");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("", "");
        org.jsoup.nodes.TextNode textNode4 = textNode2.text("");
        org.jsoup.nodes.Node node5 = textNode2.previousSibling();
        org.jsoup.nodes.Node node6 = textNode2.parent();
        org.jsoup.nodes.Attributes attributes7 = textNode2.attributes();
        org.jsoup.nodes.Node node8 = textNode2.clone();
        org.jsoup.nodes.Node node9 = textNode2.nextSibling();
        boolean boolean10 = textNode2.isBlank();
        boolean boolean11 = textNode2.isBlank();
        java.lang.String str12 = textNode2.getWholeText();
        java.lang.String str13 = textNode2.outerHtml();
        org.jsoup.nodes.Node node14 = textNode2.nextSibling();
        org.jsoup.nodes.Node node15 = textNode2.previousSibling();
        org.jsoup.nodes.TextNode textNode17 = textNode2.text("text");
        org.jsoup.nodes.Attributes attributes18 = textNode2.attributes();
        org.junit.Assert.assertNotNull(textNode2);
        org.junit.Assert.assertNotNull(textNode4);
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertNull(node6);
        org.junit.Assert.assertNotNull(attributes7);
        org.junit.Assert.assertNotNull(node8);
        org.junit.Assert.assertNull(node9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNull(node14);
        org.junit.Assert.assertNull(node15);
        org.junit.Assert.assertNotNull(textNode17);
        org.junit.Assert.assertNotNull(attributes18);
    }

    @Test
    public void test20524() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20524");
        org.jsoup.nodes.Document.OutputSettings outputSettings0 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Entities.EscapeMode escapeMode1 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings2 = outputSettings0.escapeMode(escapeMode1);
        boolean boolean3 = outputSettings0.forceAllElementAsBlock();
        org.jsoup.nodes.Document.OutputSettings outputSettings5 = outputSettings0.indentAmount((int) (byte) 0);
        org.jsoup.nodes.Document.OutputSettings outputSettings6 = new org.jsoup.nodes.Document.OutputSettings();
        int int7 = outputSettings6.indentAmount();
        org.jsoup.nodes.Document.OutputSettings outputSettings9 = outputSettings6.forceAllElementAsBlock(true);
        boolean boolean10 = outputSettings6.forceAllElementAsBlock();
        int int11 = outputSettings6.indentAmount();
        org.jsoup.nodes.Entities.EscapeMode escapeMode12 = outputSettings6.escapeMode();
        org.jsoup.nodes.Document.OutputSettings outputSettings13 = outputSettings5.escapeMode(escapeMode12);
        java.nio.charset.Charset charset14 = outputSettings5.charset();
        org.jsoup.nodes.Document.OutputSettings outputSettings16 = outputSettings5.forceAllElementAsBlock(true);
        org.jsoup.nodes.Document.OutputSettings outputSettings17 = new org.jsoup.nodes.Document.OutputSettings();
        boolean boolean18 = outputSettings17.prettyPrint();
        org.jsoup.nodes.Document.OutputSettings outputSettings20 = outputSettings17.prettyPrint(true);
        org.jsoup.nodes.Document.OutputSettings outputSettings21 = new org.jsoup.nodes.Document.OutputSettings();
        boolean boolean22 = outputSettings21.prettyPrint();
        org.jsoup.nodes.Entities.EscapeMode escapeMode23 = outputSettings21.escapeMode();
        int int24 = outputSettings21.indentAmount();
        org.jsoup.nodes.Document.OutputSettings outputSettings26 = outputSettings21.prettyPrint(false);
        org.jsoup.nodes.Document.OutputSettings outputSettings27 = new org.jsoup.nodes.Document.OutputSettings();
        boolean boolean28 = outputSettings27.prettyPrint();
        org.jsoup.nodes.Entities.EscapeMode escapeMode29 = outputSettings27.escapeMode();
        org.jsoup.nodes.Document.OutputSettings outputSettings30 = outputSettings26.escapeMode(escapeMode29);
        org.jsoup.nodes.Document.OutputSettings outputSettings31 = outputSettings17.escapeMode(escapeMode29);
        org.jsoup.nodes.Entities.EscapeMode escapeMode32 = outputSettings17.escapeMode();
        org.jsoup.nodes.Document.OutputSettings outputSettings33 = outputSettings17.clone();
        org.jsoup.nodes.Document.OutputSettings outputSettings34 = outputSettings17.clone();
        org.jsoup.nodes.Entities.EscapeMode escapeMode35 = outputSettings17.escapeMode();
        org.jsoup.nodes.Document.OutputSettings outputSettings36 = outputSettings16.escapeMode(escapeMode35);
        org.jsoup.nodes.Document.OutputSettings outputSettings37 = new org.jsoup.nodes.Document.OutputSettings();
        boolean boolean38 = outputSettings37.prettyPrint();
        org.jsoup.nodes.Document.OutputSettings outputSettings40 = outputSettings37.forceAllElementAsBlock(false);
        org.jsoup.nodes.Document.OutputSettings outputSettings41 = new org.jsoup.nodes.Document.OutputSettings();
        boolean boolean42 = outputSettings41.prettyPrint();
        org.jsoup.nodes.Entities.EscapeMode escapeMode43 = outputSettings41.escapeMode();
        boolean boolean44 = outputSettings41.forceAllElementAsBlock();
        org.jsoup.nodes.Document.OutputSettings outputSettings46 = outputSettings41.forceAllElementAsBlock(true);
        org.jsoup.nodes.Entities.EscapeMode escapeMode47 = outputSettings46.escapeMode();
        org.jsoup.nodes.Document.OutputSettings outputSettings48 = outputSettings37.escapeMode(escapeMode47);
        boolean boolean49 = outputSettings48.forceAllElementAsBlock();
        java.nio.charset.Charset charset50 = outputSettings48.charset();
        org.jsoup.nodes.Document.OutputSettings outputSettings51 = outputSettings36.charset(charset50);
        org.junit.Assert.assertNotNull(outputSettings2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(outputSettings5);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertNotNull(outputSettings9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertTrue("'" + escapeMode12 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode12.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertNotNull(outputSettings13);
        org.junit.Assert.assertNotNull(charset14);
        org.junit.Assert.assertNotNull(outputSettings16);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertNotNull(outputSettings20);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertTrue("'" + escapeMode23 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode23.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1 + "'", int24 == 1);
        org.junit.Assert.assertNotNull(outputSettings26);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertTrue("'" + escapeMode29 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode29.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertNotNull(outputSettings30);
        org.junit.Assert.assertNotNull(outputSettings31);
        org.junit.Assert.assertTrue("'" + escapeMode32 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode32.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertNotNull(outputSettings33);
        org.junit.Assert.assertNotNull(outputSettings34);
        org.junit.Assert.assertTrue("'" + escapeMode35 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode35.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertNotNull(outputSettings36);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + true + "'", boolean38 == true);
        org.junit.Assert.assertNotNull(outputSettings40);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + true + "'", boolean42 == true);
        org.junit.Assert.assertTrue("'" + escapeMode43 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode43.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertNotNull(outputSettings46);
        org.junit.Assert.assertTrue("'" + escapeMode47 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode47.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertNotNull(outputSettings48);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
        org.junit.Assert.assertNotNull(charset50);
        org.junit.Assert.assertNotNull(outputSettings51);
    }

    @Test
    public void test20525() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20525");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("", "");
        org.jsoup.nodes.TextNode textNode4 = textNode2.text("");
        org.jsoup.nodes.Node node5 = textNode4.nextSibling();
        org.junit.Assert.assertNotNull(textNode4);
        org.junit.Assert.assertNull(node5);
    }

    @Test
    public void test20526() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20526");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("", "");
        java.lang.String str3 = textNode2.getWholeText();
        java.lang.String str4 = textNode2.getWholeText();
        java.lang.String str5 = textNode2.text();
        java.lang.String str6 = textNode2.getWholeText();
        java.lang.String str7 = textNode2.nodeName();
        org.jsoup.nodes.Node node10 = textNode2.attr("hi!", "hi!");
        org.jsoup.nodes.Node node11 = node10.previousSibling();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node13 = node10.before("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(textNode2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "#text" + "'", str7, "#text");
        org.junit.Assert.assertNotNull(node10);
        org.junit.Assert.assertNull(node11);
    }

    @Test
    public void test20527() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20527");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("", "");
        java.lang.String str3 = textNode2.getWholeText();
        java.lang.String str4 = textNode2.baseUri();
        org.jsoup.nodes.TextNode textNode6 = textNode2.text("hi!");
        java.lang.String str8 = textNode2.attr("#text");
        int int9 = textNode2.siblingIndex();
        org.jsoup.nodes.Node node10 = textNode2.nextSibling();
        org.junit.Assert.assertNotNull(textNode2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(textNode6);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNull(node10);
    }

    @Test
    public void test20528() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20528");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("", "");
        java.lang.String str3 = textNode2.toString();
        org.jsoup.nodes.Node node4 = textNode2.nextSibling();
        org.jsoup.nodes.Document document5 = textNode2.ownerDocument();
        java.lang.String str6 = textNode2.getWholeText();
        java.lang.String str7 = textNode2.nodeName();
        org.jsoup.nodes.Node node10 = textNode2.attr("hi!", "");
        java.lang.String str12 = textNode2.absUrl("#text");
        java.lang.String str13 = textNode2.text();
        java.lang.String str14 = textNode2.getWholeText();
        org.junit.Assert.assertNotNull(textNode2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertNull(node4);
        org.junit.Assert.assertNull(document5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "#text" + "'", str7, "#text");
        org.junit.Assert.assertNotNull(node10);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
    }

    @Test
    public void test20529() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20529");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("", "");
        java.lang.String str3 = textNode2.getWholeText();
        java.lang.String str4 = textNode2.baseUri();
        org.jsoup.nodes.TextNode textNode6 = textNode2.text("hi!");
        java.lang.String str7 = textNode2.baseUri();
        java.lang.String str8 = textNode2.getWholeText();
        org.jsoup.nodes.TextNode textNode10 = textNode2.text("hi!");
        org.jsoup.nodes.Attributes attributes11 = textNode2.attributes();
        org.jsoup.nodes.Node node12 = textNode2.parent();
        java.lang.String str13 = textNode2.baseUri();
        org.jsoup.nodes.TextNode textNode16 = new org.jsoup.nodes.TextNode("hi!", "i!");
        org.jsoup.nodes.TextNode textNode19 = org.jsoup.nodes.TextNode.createFromEncoded("", "");
        org.jsoup.nodes.TextNode textNode21 = textNode19.text("");
        java.lang.String str22 = textNode19.outerHtml();
        org.jsoup.nodes.Document document23 = textNode19.ownerDocument();
        boolean boolean24 = textNode16.equals((java.lang.Object) textNode19);
        org.jsoup.nodes.Node node25 = textNode16.parent();
        java.lang.String str27 = textNode16.absUrl("hi!");
        boolean boolean28 = textNode16.isBlank();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node29 = textNode2.after((org.jsoup.nodes.Node) textNode16);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(textNode2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(textNode6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertNotNull(textNode10);
        org.junit.Assert.assertNotNull(attributes11);
        org.junit.Assert.assertNull(node12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNotNull(textNode19);
        org.junit.Assert.assertNotNull(textNode21);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertNull(document23);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNull(node25);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "" + "'", str27, "");
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
    }

    @Test
    public void test20530() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20530");
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
        boolean boolean15 = textNode7.isBlank();
        java.lang.String str16 = textNode7.outerHtml();
        java.util.List<org.jsoup.nodes.Node> nodeList17 = textNode7.childNodes();
        java.lang.String str18 = textNode7.baseUri();
        org.junit.Assert.assertNotNull(textNode2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(textNode7);
        org.junit.Assert.assertNotNull(textNode9);
        org.junit.Assert.assertNull(node10);
        org.junit.Assert.assertNull(node11);
        org.junit.Assert.assertNotNull(attributes12);
        org.junit.Assert.assertNotNull(node13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertNotNull(nodeList17);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
    }

    @Test
    public void test20531() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20531");
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
        java.lang.String str18 = textNode2.baseUri();
        java.lang.String str19 = textNode2.text();
        org.jsoup.nodes.Node node20 = textNode2.nextSibling();
        org.junit.Assert.assertNotNull(textNode2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(node6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(nodeList11);
        org.junit.Assert.assertNull(node12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertNotNull(nodeList15);
        org.junit.Assert.assertNull(document16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertNull(node20);
    }

    @Test
    public void test20532() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20532");
        org.jsoup.nodes.Document.OutputSettings outputSettings0 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Entities.EscapeMode escapeMode1 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings2 = outputSettings0.escapeMode(escapeMode1);
        org.jsoup.nodes.Document.OutputSettings outputSettings4 = outputSettings2.prettyPrint(false);
        org.jsoup.nodes.Document.OutputSettings outputSettings6 = outputSettings2.indentAmount((int) ' ');
        boolean boolean7 = outputSettings6.forceAllElementAsBlock();
        org.jsoup.nodes.Document.OutputSettings outputSettings9 = outputSettings6.indentAmount((int) (short) 100);
        org.jsoup.nodes.Entities.EscapeMode escapeMode10 = outputSettings6.escapeMode();
        org.junit.Assert.assertNotNull(outputSettings2);
        org.junit.Assert.assertNotNull(outputSettings4);
        org.junit.Assert.assertNotNull(outputSettings6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(outputSettings9);
        org.junit.Assert.assertNull(escapeMode10);
    }

    @Test
    public void test20533() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20533");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("", "");
        boolean boolean3 = textNode2.isBlank();
        org.jsoup.nodes.Node node6 = textNode2.attr("hi!", "hi!");
        org.jsoup.nodes.TextNode textNode8 = textNode2.text("#text");
        java.lang.String str9 = textNode8.getWholeText();
        boolean boolean10 = textNode8.isBlank();
        org.jsoup.nodes.TextNode textNode12 = textNode8.splitText((int) (byte) 0);
        org.jsoup.nodes.Node node13 = textNode8.previousSibling();
        org.jsoup.nodes.Node node15 = textNode8.removeAttr("hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList16 = textNode8.childNodes();
        java.lang.String str17 = textNode8.nodeName();
        java.lang.String str18 = textNode8.getWholeText();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.TextNode textNode20 = textNode8.splitText(32);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Split offset must not be greater than current text length");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(textNode2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(node6);
        org.junit.Assert.assertNotNull(textNode8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "#text" + "'", str9, "#text");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(textNode12);
        org.junit.Assert.assertNull(node13);
        org.junit.Assert.assertNotNull(node15);
        org.junit.Assert.assertNotNull(nodeList16);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "#text" + "'", str17, "#text");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
    }

    @Test
    public void test20534() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20534");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("", "");
        java.lang.String str3 = textNode2.nodeName();
        java.util.List<org.jsoup.nodes.Node> nodeList4 = textNode2.childNodes();
        org.jsoup.nodes.Node node5 = textNode2.previousSibling();
        java.lang.String str6 = textNode2.text();
        org.jsoup.nodes.Node node7 = textNode2.clone();
        node7.setBaseUri("h");
        org.junit.Assert.assertNotNull(textNode2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "#text" + "'", str3, "#text");
        org.junit.Assert.assertNotNull(nodeList4);
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(node7);
    }

    @Test
    public void test20535() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20535");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("", "");
        java.lang.String str3 = textNode2.getWholeText();
        java.lang.String str4 = textNode2.outerHtml();
        boolean boolean6 = textNode2.hasAttr("hi!");
        boolean boolean8 = textNode2.hasAttr("");
        java.lang.String str10 = textNode2.attr("");
        org.jsoup.nodes.Node node11 = textNode2.clone();
        org.jsoup.nodes.TextNode textNode13 = textNode2.text("#text");
        java.util.List<org.jsoup.nodes.Node> nodeList14 = textNode2.childNodes();
        java.lang.String str15 = textNode2.nodeName();
        java.util.List<org.jsoup.nodes.Node> nodeList16 = textNode2.childNodes();
        java.util.List<org.jsoup.nodes.Node> nodeList17 = textNode2.childNodes();
        java.lang.String str19 = textNode2.attr("text");
        org.junit.Assert.assertNotNull(textNode2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNotNull(node11);
        org.junit.Assert.assertNotNull(textNode13);
        org.junit.Assert.assertNotNull(nodeList14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "#text" + "'", str15, "#text");
        org.junit.Assert.assertNotNull(nodeList16);
        org.junit.Assert.assertNotNull(nodeList17);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "#text" + "'", str19, "#text");
    }

    @Test
    public void test20536() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20536");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("i!", "hi!");
        org.jsoup.nodes.Node node4 = textNode2.removeAttr("#");
        org.junit.Assert.assertNotNull(textNode2);
        org.junit.Assert.assertNotNull(node4);
    }

    @Test
    public void test20537() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20537");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("", "");
        java.lang.String str3 = textNode2.baseUri();
        boolean boolean5 = textNode2.hasAttr("#text");
        java.lang.String str7 = textNode2.attr("");
        org.jsoup.nodes.Node node8 = textNode2.parent();
        textNode2.setBaseUri("");
        java.util.List<org.jsoup.nodes.Node> nodeList11 = textNode2.siblingNodes();
        int int12 = textNode2.siblingIndex();
        java.util.List<org.jsoup.nodes.Node> nodeList13 = textNode2.siblingNodes();
        java.lang.String str14 = textNode2.baseUri();
        org.jsoup.nodes.TextNode textNode17 = org.jsoup.nodes.TextNode.createFromEncoded("", "");
        java.lang.String str18 = textNode17.baseUri();
        java.lang.String str19 = textNode17.baseUri();
        org.jsoup.nodes.TextNode textNode22 = org.jsoup.nodes.TextNode.createFromEncoded("", "");
        boolean boolean23 = textNode22.isBlank();
        org.jsoup.nodes.Node node26 = textNode22.attr("hi!", "hi!");
        org.jsoup.nodes.TextNode textNode28 = textNode22.text("#text");
        org.jsoup.nodes.Node node30 = textNode28.removeAttr("#text");
        java.lang.String str32 = textNode28.absUrl("#text");
        boolean boolean33 = textNode17.equals((java.lang.Object) textNode28);
        textNode17.setBaseUri("");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node36 = textNode2.after((org.jsoup.nodes.Node) textNode17);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(textNode2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNull(node8);
        org.junit.Assert.assertNotNull(nodeList11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNotNull(nodeList13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertNotNull(textNode17);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertNotNull(textNode22);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertNotNull(node26);
        org.junit.Assert.assertNotNull(textNode28);
        org.junit.Assert.assertNotNull(node30);
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "" + "'", str32, "");
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
    }

    @Test
    public void test20538() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20538");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("", "hi!");
        org.jsoup.nodes.Document document3 = textNode2.ownerDocument();
        org.jsoup.nodes.Node node6 = textNode2.attr("#text", "hi!");
        java.lang.String str7 = textNode2.nodeName();
        java.lang.String str9 = textNode2.absUrl("#text");
        org.jsoup.nodes.Node node10 = textNode2.clone();
        int int11 = textNode2.siblingIndex();
        java.lang.String str13 = textNode2.attr("i!");
        org.junit.Assert.assertNotNull(textNode2);
        org.junit.Assert.assertNull(document3);
        org.junit.Assert.assertNotNull(node6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "#text" + "'", str7, "#text");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNotNull(node10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
    }

    @Test
    public void test20539() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20539");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("", "");
        boolean boolean3 = textNode2.isBlank();
        org.jsoup.nodes.Document.OutputSettings outputSettings4 = new org.jsoup.nodes.Document.OutputSettings();
        boolean boolean5 = outputSettings4.prettyPrint();
        org.jsoup.nodes.Entities.EscapeMode escapeMode6 = outputSettings4.escapeMode();
        int int7 = outputSettings4.indentAmount();
        org.jsoup.nodes.Document.OutputSettings outputSettings9 = outputSettings4.prettyPrint(false);
        java.nio.charset.Charset charset10 = outputSettings9.charset();
        boolean boolean11 = textNode2.equals((java.lang.Object) outputSettings9);
        org.jsoup.nodes.Entities.EscapeMode escapeMode12 = outputSettings9.escapeMode();
        org.jsoup.nodes.Document.OutputSettings outputSettings14 = outputSettings9.forceAllElementAsBlock(true);
        boolean boolean15 = outputSettings14.forceAllElementAsBlock();
        org.jsoup.nodes.Document.OutputSettings outputSettings16 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Entities.EscapeMode escapeMode17 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings18 = outputSettings16.escapeMode(escapeMode17);
        int int19 = outputSettings16.indentAmount();
        java.nio.charset.Charset charset20 = outputSettings16.charset();
        org.jsoup.nodes.Document.OutputSettings outputSettings21 = outputSettings14.charset(charset20);
        org.jsoup.nodes.Document.OutputSettings outputSettings22 = outputSettings14.clone();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Document.OutputSettings outputSettings24 = outputSettings22.charset("");
            org.junit.Assert.fail("Expected exception of type java.nio.charset.IllegalCharsetNameException; message: ");
        } catch (java.nio.charset.IllegalCharsetNameException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(textNode2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + escapeMode6 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode6.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertNotNull(outputSettings9);
        org.junit.Assert.assertNotNull(charset10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + escapeMode12 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode12.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertNotNull(outputSettings14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNotNull(outputSettings18);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 1 + "'", int19 == 1);
        org.junit.Assert.assertNotNull(charset20);
        org.junit.Assert.assertNotNull(outputSettings21);
        org.junit.Assert.assertNotNull(outputSettings22);
    }

    @Test
    public void test20540() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20540");
        org.jsoup.nodes.Document.OutputSettings outputSettings0 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Entities.EscapeMode escapeMode1 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings2 = outputSettings0.escapeMode(escapeMode1);
        org.jsoup.nodes.Document.OutputSettings outputSettings4 = outputSettings0.forceAllElementAsBlock(false);
        org.jsoup.nodes.Document.OutputSettings outputSettings6 = outputSettings0.forceAllElementAsBlock(false);
        org.jsoup.nodes.Document.OutputSettings outputSettings8 = outputSettings6.indentAmount((int) ' ');
        boolean boolean9 = outputSettings8.forceAllElementAsBlock();
        org.jsoup.nodes.Document.OutputSettings outputSettings11 = outputSettings8.forceAllElementAsBlock(true);
        org.junit.Assert.assertNotNull(outputSettings2);
        org.junit.Assert.assertNotNull(outputSettings4);
        org.junit.Assert.assertNotNull(outputSettings6);
        org.junit.Assert.assertNotNull(outputSettings8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(outputSettings11);
    }

    @Test
    public void test20541() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20541");
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
        int int16 = textNode2.siblingIndex();
        org.jsoup.nodes.Document document17 = textNode2.ownerDocument();
        org.jsoup.nodes.TextNode textNode19 = textNode2.text("h");
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
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(nodeList11);
        org.junit.Assert.assertNull(node12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertNotNull(nodeList15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertNull(document17);
        org.junit.Assert.assertNotNull(textNode19);
    }

    @Test
    public void test20542() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20542");
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
        java.util.List<org.jsoup.nodes.Node> nodeList18 = textNode2.childNodes();
        org.jsoup.nodes.Node node19 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node20 = textNode2.before(node19);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(textNode2);
        org.junit.Assert.assertNotNull(textNode4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNull(node6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNull(node10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNotNull(node12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNotNull(nodeList15);
        org.junit.Assert.assertNotNull(textNode17);
        org.junit.Assert.assertNotNull(nodeList18);
    }

    @Test
    public void test20543() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20543");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("hi!", "");
        java.lang.String str3 = textNode2.baseUri();
        java.lang.String str4 = textNode2.baseUri();
        java.lang.String str6 = textNode2.absUrl("#text");
        org.jsoup.nodes.Node node7 = textNode2.clone();
        java.lang.String str9 = textNode2.absUrl("i!");
        org.jsoup.nodes.TextNode textNode11 = textNode2.text("i!");
        org.jsoup.nodes.TextNode textNode14 = org.jsoup.nodes.TextNode.createFromEncoded("", "");
        java.lang.String str15 = textNode14.toString();
        int int16 = textNode14.siblingIndex();
        java.lang.String str17 = textNode14.nodeName();
        java.lang.String str18 = textNode14.text();
        java.lang.String str20 = textNode14.attr("#text");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node21 = textNode11.after((org.jsoup.nodes.Node) textNode14);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(textNode2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(node7);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNotNull(textNode11);
        org.junit.Assert.assertNotNull(textNode14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "#text" + "'", str17, "#text");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
    }

    @Test
    public void test20544() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20544");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("hi!", "#text");
        org.jsoup.nodes.Node node4 = textNode2.removeAttr("hi!");
        org.jsoup.nodes.Node node7 = textNode2.attr("#text", "hi!");
        java.lang.String str8 = textNode2.text();
        org.jsoup.nodes.Document document9 = textNode2.ownerDocument();
        textNode2.setBaseUri("i!");
        org.jsoup.nodes.TextNode textNode13 = textNode2.text("#");
        org.junit.Assert.assertNotNull(textNode2);
        org.junit.Assert.assertNotNull(node4);
        org.junit.Assert.assertNotNull(node7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertNull(document9);
        org.junit.Assert.assertNotNull(textNode13);
    }

    @Test
    public void test20545() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20545");
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
        java.lang.String str20 = textNode11.attr("");
        org.jsoup.nodes.TextNode textNode22 = textNode11.text("hi!");
        org.jsoup.nodes.Node node23 = textNode11.parent();
        org.junit.Assert.assertNotNull(textNode2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(node6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(textNode11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertNotNull(textNode22);
        org.junit.Assert.assertNull(node23);
    }

    @Test
    public void test20546() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20546");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("", "");
        java.lang.String str3 = textNode2.baseUri();
        boolean boolean5 = textNode2.hasAttr("#text");
        java.lang.String str7 = textNode2.attr("");
        org.jsoup.nodes.Node node8 = textNode2.parent();
        textNode2.setBaseUri("");
        java.lang.String str12 = textNode2.attr("hi!");
        org.jsoup.nodes.Node node15 = textNode2.attr("h", "#text");
        java.util.List<org.jsoup.nodes.Node> nodeList16 = node15.siblingNodes();
        org.junit.Assert.assertNotNull(textNode2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNull(node8);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertNotNull(node15);
        org.junit.Assert.assertNotNull(nodeList16);
    }

    @Test
    public void test20547() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20547");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("", "");
        java.lang.String str3 = textNode2.toString();
        org.jsoup.nodes.Node node4 = textNode2.nextSibling();
        org.jsoup.nodes.Document document5 = textNode2.ownerDocument();
        java.lang.String str6 = textNode2.getWholeText();
        org.jsoup.nodes.Document document7 = textNode2.ownerDocument();
        java.lang.String str8 = textNode2.text();
        org.jsoup.nodes.TextNode textNode10 = textNode2.text("");
        org.junit.Assert.assertNotNull(textNode2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertNull(node4);
        org.junit.Assert.assertNull(document5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNull(document7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNotNull(textNode10);
    }

    @Test
    public void test20548() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20548");
        org.jsoup.nodes.Document.OutputSettings outputSettings0 = new org.jsoup.nodes.Document.OutputSettings();
        boolean boolean1 = outputSettings0.prettyPrint();
        org.jsoup.nodes.Document.OutputSettings outputSettings3 = outputSettings0.prettyPrint(true);
        org.jsoup.nodes.Document.OutputSettings outputSettings5 = outputSettings3.indentAmount((int) ' ');
        org.jsoup.nodes.Document.OutputSettings outputSettings7 = outputSettings3.prettyPrint(false);
        boolean boolean8 = outputSettings7.forceAllElementAsBlock();
        org.jsoup.nodes.Document.OutputSettings outputSettings9 = outputSettings7.clone();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Document.OutputSettings outputSettings11 = outputSettings7.charset("h");
            org.junit.Assert.fail("Expected exception of type java.nio.charset.UnsupportedCharsetException; message: h");
        } catch (java.nio.charset.UnsupportedCharsetException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertNotNull(outputSettings3);
        org.junit.Assert.assertNotNull(outputSettings5);
        org.junit.Assert.assertNotNull(outputSettings7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(outputSettings9);
    }

    @Test
    public void test20549() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20549");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("", "");
        java.lang.String str3 = textNode2.getWholeText();
        java.lang.String str4 = textNode2.outerHtml();
        java.lang.String str5 = textNode2.baseUri();
        java.lang.String str6 = textNode2.toString();
        org.jsoup.nodes.Node node7 = textNode2.nextSibling();
        boolean boolean8 = textNode2.isBlank();
        java.lang.String str10 = textNode2.attr("#text");
        org.jsoup.nodes.Node node11 = textNode2.previousSibling();
        java.lang.String str13 = textNode2.attr("hi!");
        java.lang.String str14 = textNode2.toString();
        java.lang.String str15 = textNode2.nodeName();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node17 = textNode2.childNode(35);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 35");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(textNode2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNull(node7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNull(node11);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "#text" + "'", str15, "#text");
    }

    @Test
    public void test20550() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20550");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("", "");
        java.lang.String str3 = textNode2.getWholeText();
        java.lang.String str4 = textNode2.getWholeText();
        org.jsoup.nodes.TextNode textNode7 = org.jsoup.nodes.TextNode.createFromEncoded("", "");
        java.lang.String str8 = textNode7.toString();
        boolean boolean9 = textNode2.equals((java.lang.Object) str8);
        org.jsoup.nodes.Node node12 = textNode2.attr("#text", "");
        java.lang.String str13 = textNode2.baseUri();
        boolean boolean14 = textNode2.isBlank();
        java.lang.String str15 = textNode2.text();
        textNode2.setBaseUri("i!");
        org.jsoup.nodes.Node node19 = textNode2.removeAttr("text");
        org.junit.Assert.assertNotNull(textNode2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(textNode7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(node12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertNotNull(node19);
    }

    @Test
    public void test20551() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20551");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("", "");
        org.jsoup.nodes.TextNode textNode4 = textNode2.text("");
        org.jsoup.nodes.TextNode textNode6 = textNode4.text("#text");
        org.jsoup.nodes.Node node7 = textNode6.nextSibling();
        org.jsoup.nodes.Node node9 = textNode6.removeAttr("#text");
        org.jsoup.nodes.TextNode textNode11 = textNode6.text("text");
        org.junit.Assert.assertNotNull(textNode2);
        org.junit.Assert.assertNotNull(textNode4);
        org.junit.Assert.assertNotNull(textNode6);
        org.junit.Assert.assertNull(node7);
        org.junit.Assert.assertNotNull(node9);
        org.junit.Assert.assertNotNull(textNode11);
    }

    @Test
    public void test20552() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20552");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("", "");
        boolean boolean3 = textNode2.isBlank();
        org.jsoup.nodes.Document document4 = textNode2.ownerDocument();
        org.jsoup.nodes.TextNode textNode6 = textNode2.text("");
        java.util.List<org.jsoup.nodes.Node> nodeList7 = textNode2.siblingNodes();
        java.lang.String str8 = textNode2.baseUri();
        org.jsoup.nodes.Attributes attributes9 = textNode2.attributes();
        org.jsoup.nodes.Document.OutputSettings outputSettings10 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Entities.EscapeMode escapeMode11 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings12 = outputSettings10.escapeMode(escapeMode11);
        boolean boolean13 = outputSettings10.forceAllElementAsBlock();
        org.jsoup.nodes.Document.OutputSettings outputSettings15 = outputSettings10.indentAmount((int) (byte) 0);
        org.jsoup.nodes.Document.OutputSettings outputSettings16 = new org.jsoup.nodes.Document.OutputSettings();
        int int17 = outputSettings16.indentAmount();
        org.jsoup.nodes.Document.OutputSettings outputSettings19 = outputSettings16.forceAllElementAsBlock(true);
        boolean boolean20 = outputSettings16.forceAllElementAsBlock();
        int int21 = outputSettings16.indentAmount();
        org.jsoup.nodes.Entities.EscapeMode escapeMode22 = outputSettings16.escapeMode();
        org.jsoup.nodes.Document.OutputSettings outputSettings23 = outputSettings15.escapeMode(escapeMode22);
        org.jsoup.nodes.Entities.EscapeMode escapeMode24 = outputSettings23.escapeMode();
        boolean boolean25 = outputSettings23.prettyPrint();
        org.jsoup.nodes.TextNode textNode28 = org.jsoup.nodes.TextNode.createFromEncoded("", "");
        java.lang.String str29 = textNode28.getWholeText();
        java.lang.String str30 = textNode28.baseUri();
        org.jsoup.nodes.TextNode textNode32 = textNode28.text("hi!");
        org.jsoup.nodes.Node node33 = textNode32.clone();
        org.jsoup.nodes.Node node35 = textNode32.removeAttr("hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList36 = textNode32.siblingNodes();
        java.lang.String str38 = textNode32.absUrl("#text");
        org.jsoup.nodes.Document.OutputSettings outputSettings39 = new org.jsoup.nodes.Document.OutputSettings();
        boolean boolean40 = outputSettings39.prettyPrint();
        org.jsoup.nodes.Document.OutputSettings outputSettings42 = outputSettings39.prettyPrint(true);
        org.jsoup.nodes.Document.OutputSettings outputSettings43 = new org.jsoup.nodes.Document.OutputSettings();
        boolean boolean44 = outputSettings43.prettyPrint();
        org.jsoup.nodes.Entities.EscapeMode escapeMode45 = outputSettings43.escapeMode();
        int int46 = outputSettings43.indentAmount();
        org.jsoup.nodes.Document.OutputSettings outputSettings48 = outputSettings43.prettyPrint(false);
        org.jsoup.nodes.Document.OutputSettings outputSettings49 = new org.jsoup.nodes.Document.OutputSettings();
        boolean boolean50 = outputSettings49.prettyPrint();
        org.jsoup.nodes.Entities.EscapeMode escapeMode51 = outputSettings49.escapeMode();
        org.jsoup.nodes.Document.OutputSettings outputSettings52 = outputSettings48.escapeMode(escapeMode51);
        org.jsoup.nodes.Document.OutputSettings outputSettings53 = outputSettings39.escapeMode(escapeMode51);
        org.jsoup.nodes.Entities.EscapeMode escapeMode54 = outputSettings39.escapeMode();
        boolean boolean55 = textNode32.equals((java.lang.Object) escapeMode54);
        org.jsoup.nodes.Document.OutputSettings outputSettings56 = outputSettings23.escapeMode(escapeMode54);
        org.jsoup.nodes.Document.OutputSettings outputSettings58 = outputSettings23.prettyPrint(false);
        org.jsoup.nodes.Document.OutputSettings outputSettings60 = outputSettings58.indentAmount(32);
        boolean boolean61 = textNode2.equals((java.lang.Object) outputSettings60);
        org.junit.Assert.assertNotNull(textNode2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNull(document4);
        org.junit.Assert.assertNotNull(textNode6);
        org.junit.Assert.assertNotNull(nodeList7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNotNull(attributes9);
        org.junit.Assert.assertNotNull(outputSettings12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(outputSettings15);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
        org.junit.Assert.assertNotNull(outputSettings19);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1 + "'", int21 == 1);
        org.junit.Assert.assertTrue("'" + escapeMode22 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode22.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertNotNull(outputSettings23);
        org.junit.Assert.assertTrue("'" + escapeMode24 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode24.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertNotNull(textNode28);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "" + "'", str29, "");
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "" + "'", str30, "");
        org.junit.Assert.assertNotNull(textNode32);
        org.junit.Assert.assertNotNull(node33);
        org.junit.Assert.assertNotNull(node35);
        org.junit.Assert.assertNotNull(nodeList36);
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "" + "'", str38, "");
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + true + "'", boolean40 == true);
        org.junit.Assert.assertNotNull(outputSettings42);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + true + "'", boolean44 == true);
        org.junit.Assert.assertTrue("'" + escapeMode45 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode45.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertTrue("'" + int46 + "' != '" + 1 + "'", int46 == 1);
        org.junit.Assert.assertNotNull(outputSettings48);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + true + "'", boolean50 == true);
        org.junit.Assert.assertTrue("'" + escapeMode51 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode51.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertNotNull(outputSettings52);
        org.junit.Assert.assertNotNull(outputSettings53);
        org.junit.Assert.assertTrue("'" + escapeMode54 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode54.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + false + "'", boolean55 == false);
        org.junit.Assert.assertNotNull(outputSettings56);
        org.junit.Assert.assertNotNull(outputSettings58);
        org.junit.Assert.assertNotNull(outputSettings60);
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + false + "'", boolean61 == false);
    }

    @Test
    public void test20553() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20553");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("", "");
        java.lang.String str3 = textNode2.getWholeText();
        java.lang.String str4 = textNode2.baseUri();
        org.jsoup.nodes.TextNode textNode6 = textNode2.text("hi!");
        java.lang.String str8 = textNode2.attr("#text");
        java.lang.String str10 = textNode2.attr("i!");
        org.jsoup.nodes.TextNode textNode13 = new org.jsoup.nodes.TextNode("hi!", "hi!");
        java.lang.String str15 = textNode13.absUrl("hi!");
        java.lang.String str17 = textNode13.absUrl("hi!");
        java.lang.String str19 = textNode13.absUrl("#text");
        java.lang.String str20 = textNode13.toString();
        java.lang.String str22 = textNode13.absUrl("hi!");
        org.jsoup.nodes.Node node25 = textNode13.attr("#text", "i!");
        boolean boolean26 = textNode2.equals((java.lang.Object) "i!");
        org.jsoup.nodes.Node node29 = textNode2.attr("h", "h");
        org.junit.Assert.assertNotNull(textNode2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(textNode6);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "hi!" + "'", str20, "hi!");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertNotNull(node25);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNotNull(node29);
    }

    @Test
    public void test20554() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20554");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("", "");
        org.jsoup.nodes.TextNode textNode4 = textNode2.text("");
        java.lang.String str5 = textNode2.outerHtml();
        java.lang.String str7 = textNode2.attr("");
        org.jsoup.nodes.Node node8 = textNode2.clone();
        boolean boolean10 = textNode2.hasAttr("h");
        org.jsoup.nodes.Node node11 = textNode2.parent();
        org.jsoup.nodes.TextNode textNode14 = org.jsoup.nodes.TextNode.createFromEncoded("", "");
        java.lang.String str15 = textNode14.baseUri();
        boolean boolean17 = textNode14.hasAttr("#text");
        java.lang.String str19 = textNode14.attr("");
        org.jsoup.nodes.Node node20 = textNode14.parent();
        textNode14.setBaseUri("");
        java.util.List<org.jsoup.nodes.Node> nodeList23 = textNode14.siblingNodes();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node24 = textNode2.before((org.jsoup.nodes.Node) textNode14);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(textNode2);
        org.junit.Assert.assertNotNull(textNode4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNotNull(node8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNull(node11);
        org.junit.Assert.assertNotNull(textNode14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertNull(node20);
        org.junit.Assert.assertNotNull(nodeList23);
    }

    @Test
    public void test20555() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20555");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("", "");
        java.lang.String str3 = textNode2.baseUri();
        boolean boolean5 = textNode2.hasAttr("#text");
        java.lang.String str7 = textNode2.attr("");
        boolean boolean9 = textNode2.hasAttr("#text");
        java.lang.String str10 = textNode2.text();
        int int11 = textNode2.siblingIndex();
        textNode2.setBaseUri("hi!");
        boolean boolean14 = textNode2.isBlank();
        java.lang.String str15 = textNode2.toString();
        java.lang.String str17 = textNode2.attr("#text");
        textNode2.setBaseUri("text");
        org.jsoup.nodes.TextNode textNode21 = textNode2.text("");
        org.jsoup.nodes.Attributes attributes22 = textNode21.attributes();
        org.junit.Assert.assertNotNull(textNode2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertNotNull(textNode21);
        org.junit.Assert.assertNotNull(attributes22);
    }

    @Test
    public void test20556() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20556");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("#text", "hi!");
        java.lang.String str3 = textNode2.text();
        org.jsoup.nodes.Document document4 = textNode2.ownerDocument();
        org.jsoup.nodes.Attributes attributes5 = textNode2.attributes();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node7 = textNode2.removeAttr("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: String must not be empty");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(textNode2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "#text" + "'", str3, "#text");
        org.junit.Assert.assertNull(document4);
        org.junit.Assert.assertNotNull(attributes5);
    }

    @Test
    public void test20557() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20557");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("i!", "h");
        java.lang.String str4 = textNode2.attr("text");
        org.jsoup.nodes.TextNode textNode6 = textNode2.text("hi!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "i!" + "'", str4, "i!");
        org.junit.Assert.assertNotNull(textNode6);
    }

    @Test
    public void test20558() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20558");
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
        java.lang.String str30 = textNode27.nodeName();
        java.lang.String str31 = textNode27.nodeName();
        org.junit.Assert.assertNotNull(textNode2);
        org.junit.Assert.assertNotNull(textNode4);
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNotNull(textNode10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(textNode15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertNotNull(nodeList17);
        org.junit.Assert.assertNotNull(node19);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertNotNull(textNode23);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "" + "'", str24, "");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "i!" + "'", str25, "i!");
        org.junit.Assert.assertNotNull(textNode27);
        org.junit.Assert.assertNotNull(textNode29);
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "#text" + "'", str30, "#text");
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "#text" + "'", str31, "#text");
    }

    @Test
    public void test20559() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20559");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("", "");
        org.jsoup.nodes.TextNode textNode4 = textNode2.text("");
        org.jsoup.nodes.TextNode textNode6 = textNode4.text("#text");
        textNode4.setBaseUri("#text");
        org.jsoup.nodes.TextNode textNode10 = textNode4.text("hi!");
        org.jsoup.nodes.TextNode textNode12 = textNode10.text("hi!");
        org.jsoup.nodes.Node node13 = textNode10.nextSibling();
        org.jsoup.nodes.TextNode textNode15 = textNode10.text("#text");
        org.jsoup.nodes.TextNode textNode17 = textNode10.text("hi!");
        org.jsoup.nodes.Node node18 = textNode17.nextSibling();
        java.lang.String str19 = textNode17.text();
        org.jsoup.nodes.Attributes attributes20 = textNode17.attributes();
        java.lang.String str21 = textNode17.getWholeText();
        org.junit.Assert.assertNotNull(textNode2);
        org.junit.Assert.assertNotNull(textNode4);
        org.junit.Assert.assertNotNull(textNode6);
        org.junit.Assert.assertNotNull(textNode10);
        org.junit.Assert.assertNotNull(textNode12);
        org.junit.Assert.assertNull(node13);
        org.junit.Assert.assertNotNull(textNode15);
        org.junit.Assert.assertNotNull(textNode17);
        org.junit.Assert.assertNull(node18);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "hi!" + "'", str19, "hi!");
        org.junit.Assert.assertNotNull(attributes20);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "hi!" + "'", str21, "hi!");
    }

    @Test
    public void test20560() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20560");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("", "#text");
        java.lang.String str3 = textNode2.getWholeText();
        java.lang.String str4 = textNode2.toString();
        org.jsoup.nodes.Node node7 = textNode2.attr("text", "#text");
        org.junit.Assert.assertNotNull(textNode2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(node7);
    }

    @Test
    public void test20561() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20561");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("hi!", "");
        java.lang.String str3 = textNode2.baseUri();
        java.lang.String str4 = textNode2.baseUri();
        java.lang.String str6 = textNode2.absUrl("#text");
        org.jsoup.nodes.TextNode textNode8 = textNode2.splitText(1);
        org.jsoup.nodes.Node node9 = textNode8.nextSibling();
        org.jsoup.nodes.Node node12 = textNode8.attr("#text", "hi!");
        org.jsoup.nodes.Document document13 = textNode8.ownerDocument();
        org.jsoup.nodes.Node node14 = textNode8.parent();
        org.junit.Assert.assertNotNull(textNode2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(textNode8);
        org.junit.Assert.assertNull(node9);
        org.junit.Assert.assertNotNull(node12);
        org.junit.Assert.assertNull(document13);
        org.junit.Assert.assertNull(node14);
    }

    @Test
    public void test20562() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20562");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("", "");
        java.lang.String str3 = textNode2.getWholeText();
        java.lang.String str4 = textNode2.getWholeText();
        org.jsoup.nodes.TextNode textNode7 = org.jsoup.nodes.TextNode.createFromEncoded("", "");
        java.lang.String str8 = textNode7.toString();
        boolean boolean9 = textNode2.equals((java.lang.Object) str8);
        org.jsoup.nodes.Node node12 = textNode2.attr("#text", "");
        java.lang.String str13 = textNode2.baseUri();
        org.jsoup.nodes.Document document14 = textNode2.ownerDocument();
        java.lang.String str16 = textNode2.absUrl("hi!");
        java.lang.String str17 = textNode2.baseUri();
        org.junit.Assert.assertNotNull(textNode2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(textNode7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(node12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNull(document14);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
    }

    @Test
    public void test20563() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20563");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("hi!", "hi!");
        java.lang.String str3 = textNode2.getWholeText();
        org.jsoup.nodes.TextNode textNode5 = textNode2.splitText(0);
        java.util.List<org.jsoup.nodes.Node> nodeList6 = textNode5.childNodes();
        boolean boolean7 = textNode5.isBlank();
        java.lang.String str8 = textNode5.toString();
        boolean boolean10 = textNode5.hasAttr("#text");
        org.jsoup.nodes.Attributes attributes11 = textNode5.attributes();
        org.jsoup.nodes.Node node14 = textNode5.attr("hi!", "i!");
        org.jsoup.select.NodeVisitor nodeVisitor15 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node16 = textNode5.traverse(nodeVisitor15);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertNotNull(textNode5);
        org.junit.Assert.assertNotNull(nodeList6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(attributes11);
        org.junit.Assert.assertNotNull(node14);
    }

    @Test
    public void test20564() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20564");
        org.jsoup.nodes.Document.OutputSettings outputSettings0 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Entities.EscapeMode escapeMode1 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings2 = outputSettings0.escapeMode(escapeMode1);
        org.jsoup.nodes.Document.OutputSettings outputSettings4 = outputSettings0.forceAllElementAsBlock(false);
        org.jsoup.nodes.Document.OutputSettings outputSettings6 = outputSettings0.forceAllElementAsBlock(true);
        org.jsoup.nodes.Document.OutputSettings outputSettings8 = outputSettings6.indentAmount(10);
        org.junit.Assert.assertNotNull(outputSettings2);
        org.junit.Assert.assertNotNull(outputSettings4);
        org.junit.Assert.assertNotNull(outputSettings6);
        org.junit.Assert.assertNotNull(outputSettings8);
    }

    @Test
    public void test20565() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20565");
        org.jsoup.nodes.Document.OutputSettings outputSettings0 = new org.jsoup.nodes.Document.OutputSettings();
        boolean boolean1 = outputSettings0.prettyPrint();
        org.jsoup.nodes.Document.OutputSettings outputSettings3 = outputSettings0.forceAllElementAsBlock(false);
        org.jsoup.nodes.Document.OutputSettings outputSettings4 = new org.jsoup.nodes.Document.OutputSettings();
        boolean boolean5 = outputSettings4.prettyPrint();
        org.jsoup.nodes.Entities.EscapeMode escapeMode6 = outputSettings4.escapeMode();
        boolean boolean7 = outputSettings4.forceAllElementAsBlock();
        org.jsoup.nodes.Document.OutputSettings outputSettings9 = outputSettings4.forceAllElementAsBlock(true);
        org.jsoup.nodes.Entities.EscapeMode escapeMode10 = outputSettings9.escapeMode();
        org.jsoup.nodes.Document.OutputSettings outputSettings11 = outputSettings0.escapeMode(escapeMode10);
        org.jsoup.nodes.Document.OutputSettings outputSettings12 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Entities.EscapeMode escapeMode13 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings14 = outputSettings12.escapeMode(escapeMode13);
        int int15 = outputSettings12.indentAmount();
        org.jsoup.nodes.Document.OutputSettings outputSettings17 = outputSettings12.forceAllElementAsBlock(false);
        int int18 = outputSettings12.indentAmount();
        org.jsoup.nodes.Entities.EscapeMode escapeMode19 = outputSettings12.escapeMode();
        boolean boolean20 = outputSettings12.forceAllElementAsBlock();
        org.jsoup.nodes.Document.OutputSettings outputSettings22 = outputSettings12.forceAllElementAsBlock(false);
        org.jsoup.nodes.Entities.EscapeMode escapeMode23 = outputSettings12.escapeMode();
        java.nio.charset.Charset charset24 = outputSettings12.charset();
        org.jsoup.nodes.Document.OutputSettings outputSettings25 = outputSettings11.charset(charset24);
        org.jsoup.nodes.Document.OutputSettings outputSettings27 = outputSettings11.forceAllElementAsBlock(false);
        org.jsoup.nodes.Document.OutputSettings outputSettings29 = outputSettings11.forceAllElementAsBlock(true);
        org.jsoup.nodes.Document.OutputSettings outputSettings30 = new org.jsoup.nodes.Document.OutputSettings();
        boolean boolean31 = outputSettings30.prettyPrint();
        org.jsoup.nodes.Entities.EscapeMode escapeMode32 = outputSettings30.escapeMode();
        boolean boolean33 = outputSettings30.forceAllElementAsBlock();
        org.jsoup.nodes.Document.OutputSettings outputSettings34 = new org.jsoup.nodes.Document.OutputSettings();
        boolean boolean35 = outputSettings34.prettyPrint();
        org.jsoup.nodes.Entities.EscapeMode escapeMode36 = outputSettings34.escapeMode();
        org.jsoup.nodes.Document.OutputSettings outputSettings37 = outputSettings30.escapeMode(escapeMode36);
        org.jsoup.nodes.Document.OutputSettings outputSettings39 = outputSettings30.prettyPrint(false);
        org.jsoup.nodes.Entities.EscapeMode escapeMode40 = outputSettings30.escapeMode();
        java.nio.charset.Charset charset41 = outputSettings30.charset();
        org.jsoup.nodes.Document.OutputSettings outputSettings42 = outputSettings11.charset(charset41);
        org.jsoup.nodes.Document.OutputSettings outputSettings43 = outputSettings42.clone();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertNotNull(outputSettings3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + escapeMode6 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode6.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(outputSettings9);
        org.junit.Assert.assertTrue("'" + escapeMode10 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode10.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertNotNull(outputSettings11);
        org.junit.Assert.assertNotNull(outputSettings14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertNotNull(outputSettings17);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertNull(escapeMode19);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(outputSettings22);
        org.junit.Assert.assertNull(escapeMode23);
        org.junit.Assert.assertNotNull(charset24);
        org.junit.Assert.assertNotNull(outputSettings25);
        org.junit.Assert.assertNotNull(outputSettings27);
        org.junit.Assert.assertNotNull(outputSettings29);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + true + "'", boolean31 == true);
        org.junit.Assert.assertTrue("'" + escapeMode32 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode32.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + true + "'", boolean35 == true);
        org.junit.Assert.assertTrue("'" + escapeMode36 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode36.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertNotNull(outputSettings37);
        org.junit.Assert.assertNotNull(outputSettings39);
        org.junit.Assert.assertTrue("'" + escapeMode40 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode40.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertNotNull(charset41);
        org.junit.Assert.assertNotNull(outputSettings42);
        org.junit.Assert.assertNotNull(outputSettings43);
    }

    @Test
    public void test20566() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20566");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("", "");
        java.lang.String str3 = textNode2.getWholeText();
        java.lang.String str4 = textNode2.outerHtml();
        java.util.List<org.jsoup.nodes.Node> nodeList5 = textNode2.siblingNodes();
        int int6 = textNode2.siblingIndex();
        java.lang.String str8 = textNode2.absUrl("hi!");
        java.lang.String str9 = textNode2.getWholeText();
        org.jsoup.nodes.Node node11 = textNode2.removeAttr("hi!");
        boolean boolean12 = textNode2.isBlank();
        org.jsoup.nodes.Document.OutputSettings outputSettings13 = new org.jsoup.nodes.Document.OutputSettings();
        boolean boolean14 = outputSettings13.prettyPrint();
        org.jsoup.nodes.Document.OutputSettings outputSettings16 = outputSettings13.prettyPrint(true);
        java.nio.charset.Charset charset17 = outputSettings13.charset();
        org.jsoup.nodes.Document.OutputSettings outputSettings19 = outputSettings13.forceAllElementAsBlock(false);
        org.jsoup.nodes.Document.OutputSettings outputSettings20 = new org.jsoup.nodes.Document.OutputSettings();
        int int21 = outputSettings20.indentAmount();
        org.jsoup.nodes.Document.OutputSettings outputSettings23 = outputSettings20.forceAllElementAsBlock(true);
        java.nio.charset.Charset charset24 = outputSettings20.charset();
        org.jsoup.nodes.Document.OutputSettings outputSettings25 = new org.jsoup.nodes.Document.OutputSettings();
        boolean boolean26 = outputSettings25.prettyPrint();
        org.jsoup.nodes.Document.OutputSettings outputSettings28 = outputSettings25.prettyPrint(true);
        org.jsoup.nodes.Document.OutputSettings outputSettings29 = new org.jsoup.nodes.Document.OutputSettings();
        boolean boolean30 = outputSettings29.prettyPrint();
        org.jsoup.nodes.Entities.EscapeMode escapeMode31 = outputSettings29.escapeMode();
        int int32 = outputSettings29.indentAmount();
        org.jsoup.nodes.Document.OutputSettings outputSettings34 = outputSettings29.prettyPrint(false);
        org.jsoup.nodes.Document.OutputSettings outputSettings35 = new org.jsoup.nodes.Document.OutputSettings();
        boolean boolean36 = outputSettings35.prettyPrint();
        org.jsoup.nodes.Entities.EscapeMode escapeMode37 = outputSettings35.escapeMode();
        org.jsoup.nodes.Document.OutputSettings outputSettings38 = outputSettings34.escapeMode(escapeMode37);
        org.jsoup.nodes.Document.OutputSettings outputSettings39 = outputSettings25.escapeMode(escapeMode37);
        org.jsoup.nodes.Document.OutputSettings outputSettings40 = outputSettings20.escapeMode(escapeMode37);
        org.jsoup.nodes.Document.OutputSettings outputSettings41 = outputSettings19.escapeMode(escapeMode37);
        org.jsoup.nodes.Document.OutputSettings outputSettings42 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Entities.EscapeMode escapeMode43 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings44 = outputSettings42.escapeMode(escapeMode43);
        org.jsoup.nodes.Document.OutputSettings outputSettings46 = outputSettings44.prettyPrint(false);
        org.jsoup.nodes.Document.OutputSettings outputSettings48 = outputSettings44.indentAmount((int) ' ');
        org.jsoup.nodes.Document.OutputSettings outputSettings49 = new org.jsoup.nodes.Document.OutputSettings();
        int int50 = outputSettings49.indentAmount();
        org.jsoup.nodes.Document.OutputSettings outputSettings52 = outputSettings49.forceAllElementAsBlock(true);
        boolean boolean53 = outputSettings49.forceAllElementAsBlock();
        org.jsoup.nodes.Document.OutputSettings outputSettings54 = new org.jsoup.nodes.Document.OutputSettings();
        boolean boolean55 = outputSettings54.prettyPrint();
        org.jsoup.nodes.Entities.EscapeMode escapeMode56 = outputSettings54.escapeMode();
        int int57 = outputSettings54.indentAmount();
        org.jsoup.nodes.Document.OutputSettings outputSettings59 = outputSettings54.prettyPrint(false);
        java.nio.charset.Charset charset60 = outputSettings59.charset();
        org.jsoup.nodes.Document.OutputSettings outputSettings61 = outputSettings49.charset(charset60);
        org.jsoup.nodes.Document.OutputSettings outputSettings62 = outputSettings44.charset(charset60);
        org.jsoup.nodes.Document.OutputSettings outputSettings63 = outputSettings19.charset(charset60);
        boolean boolean64 = textNode2.equals((java.lang.Object) outputSettings63);
        java.lang.String str65 = textNode2.getWholeText();
        org.junit.Assert.assertNotNull(textNode2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(nodeList5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNotNull(node11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNotNull(outputSettings16);
        org.junit.Assert.assertNotNull(charset17);
        org.junit.Assert.assertNotNull(outputSettings19);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1 + "'", int21 == 1);
        org.junit.Assert.assertNotNull(outputSettings23);
        org.junit.Assert.assertNotNull(charset24);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertNotNull(outputSettings28);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertTrue("'" + escapeMode31 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode31.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 1 + "'", int32 == 1);
        org.junit.Assert.assertNotNull(outputSettings34);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + true + "'", boolean36 == true);
        org.junit.Assert.assertTrue("'" + escapeMode37 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode37.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertNotNull(outputSettings38);
        org.junit.Assert.assertNotNull(outputSettings39);
        org.junit.Assert.assertNotNull(outputSettings40);
        org.junit.Assert.assertNotNull(outputSettings41);
        org.junit.Assert.assertNotNull(outputSettings44);
        org.junit.Assert.assertNotNull(outputSettings46);
        org.junit.Assert.assertNotNull(outputSettings48);
        org.junit.Assert.assertTrue("'" + int50 + "' != '" + 1 + "'", int50 == 1);
        org.junit.Assert.assertNotNull(outputSettings52);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + true + "'", boolean53 == true);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + true + "'", boolean55 == true);
        org.junit.Assert.assertTrue("'" + escapeMode56 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode56.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertTrue("'" + int57 + "' != '" + 1 + "'", int57 == 1);
        org.junit.Assert.assertNotNull(outputSettings59);
        org.junit.Assert.assertNotNull(charset60);
        org.junit.Assert.assertNotNull(outputSettings61);
        org.junit.Assert.assertNotNull(outputSettings62);
        org.junit.Assert.assertNotNull(outputSettings63);
        org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + false + "'", boolean64 == false);
        org.junit.Assert.assertEquals("'" + str65 + "' != '" + "" + "'", str65, "");
    }

    @Test
    public void test20567() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20567");
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
        java.lang.String str19 = textNode2.text();
        org.jsoup.nodes.Node node20 = textNode2.parent();
        org.jsoup.nodes.Document document21 = textNode2.ownerDocument();
        org.jsoup.nodes.Node node23 = textNode2.removeAttr("#text");
        org.junit.Assert.assertNotNull(textNode2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNull(node4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(textNode8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + escapeMode12 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode12.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertNotNull(outputSettings15);
        org.junit.Assert.assertNotNull(charset16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertNull(node20);
        org.junit.Assert.assertNull(document21);
        org.junit.Assert.assertNotNull(node23);
    }

    @Test
    public void test20568() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20568");
        org.jsoup.nodes.Document.OutputSettings outputSettings0 = new org.jsoup.nodes.Document.OutputSettings();
        boolean boolean1 = outputSettings0.prettyPrint();
        org.jsoup.nodes.Document.OutputSettings outputSettings3 = outputSettings0.prettyPrint(true);
        org.jsoup.nodes.Document.OutputSettings outputSettings4 = new org.jsoup.nodes.Document.OutputSettings();
        boolean boolean5 = outputSettings4.prettyPrint();
        org.jsoup.nodes.Entities.EscapeMode escapeMode6 = outputSettings4.escapeMode();
        int int7 = outputSettings4.indentAmount();
        org.jsoup.nodes.Document.OutputSettings outputSettings9 = outputSettings4.prettyPrint(false);
        org.jsoup.nodes.Document.OutputSettings outputSettings10 = new org.jsoup.nodes.Document.OutputSettings();
        boolean boolean11 = outputSettings10.prettyPrint();
        org.jsoup.nodes.Entities.EscapeMode escapeMode12 = outputSettings10.escapeMode();
        org.jsoup.nodes.Document.OutputSettings outputSettings13 = outputSettings9.escapeMode(escapeMode12);
        org.jsoup.nodes.Document.OutputSettings outputSettings14 = outputSettings0.escapeMode(escapeMode12);
        org.jsoup.nodes.Entities.EscapeMode escapeMode15 = outputSettings0.escapeMode();
        org.jsoup.nodes.Document.OutputSettings outputSettings16 = outputSettings0.clone();
        boolean boolean17 = outputSettings16.prettyPrint();
        org.jsoup.nodes.Document.OutputSettings outputSettings19 = outputSettings16.indentAmount((int) 'a');
        int int20 = outputSettings19.indentAmount();
        org.jsoup.nodes.Document.OutputSettings outputSettings21 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Entities.EscapeMode escapeMode22 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings23 = outputSettings21.escapeMode(escapeMode22);
        java.nio.charset.Charset charset24 = outputSettings23.charset();
        org.jsoup.nodes.Document.OutputSettings outputSettings25 = new org.jsoup.nodes.Document.OutputSettings();
        int int26 = outputSettings25.indentAmount();
        org.jsoup.nodes.Document.OutputSettings outputSettings28 = outputSettings25.forceAllElementAsBlock(true);
        org.jsoup.nodes.Document.OutputSettings outputSettings30 = outputSettings25.prettyPrint(true);
        java.nio.charset.Charset charset31 = outputSettings25.charset();
        org.jsoup.nodes.Document.OutputSettings outputSettings33 = outputSettings25.prettyPrint(false);
        org.jsoup.nodes.Document.OutputSettings outputSettings34 = new org.jsoup.nodes.Document.OutputSettings();
        boolean boolean35 = outputSettings34.prettyPrint();
        org.jsoup.nodes.Document.OutputSettings outputSettings37 = outputSettings34.prettyPrint(true);
        org.jsoup.nodes.Document.OutputSettings outputSettings39 = outputSettings37.indentAmount((int) ' ');
        boolean boolean40 = outputSettings39.prettyPrint();
        org.jsoup.nodes.Document.OutputSettings outputSettings41 = outputSettings39.clone();
        java.nio.charset.Charset charset42 = outputSettings39.charset();
        org.jsoup.nodes.Document.OutputSettings outputSettings43 = outputSettings33.charset(charset42);
        org.jsoup.nodes.Document.OutputSettings outputSettings44 = outputSettings23.charset(charset42);
        org.jsoup.nodes.Document.OutputSettings outputSettings45 = outputSettings19.charset(charset42);
        boolean boolean46 = outputSettings45.forceAllElementAsBlock();
        org.jsoup.nodes.Document.OutputSettings outputSettings47 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Entities.EscapeMode escapeMode48 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings49 = outputSettings47.escapeMode(escapeMode48);
        boolean boolean50 = outputSettings47.forceAllElementAsBlock();
        org.jsoup.nodes.Document.OutputSettings outputSettings52 = outputSettings47.indentAmount((int) (byte) 0);
        java.nio.charset.Charset charset53 = outputSettings52.charset();
        org.jsoup.nodes.Document.OutputSettings outputSettings54 = outputSettings45.charset(charset53);
        org.jsoup.nodes.Document.OutputSettings outputSettings55 = outputSettings45.clone();
        org.jsoup.nodes.Document.OutputSettings outputSettings57 = outputSettings55.indentAmount(1);
        java.nio.charset.Charset charset58 = outputSettings57.charset();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertNotNull(outputSettings3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + escapeMode6 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode6.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertNotNull(outputSettings9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + escapeMode12 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode12.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertNotNull(outputSettings13);
        org.junit.Assert.assertNotNull(outputSettings14);
        org.junit.Assert.assertTrue("'" + escapeMode15 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode15.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertNotNull(outputSettings16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertNotNull(outputSettings19);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 97 + "'", int20 == 97);
        org.junit.Assert.assertNotNull(outputSettings23);
        org.junit.Assert.assertNotNull(charset24);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 1 + "'", int26 == 1);
        org.junit.Assert.assertNotNull(outputSettings28);
        org.junit.Assert.assertNotNull(outputSettings30);
        org.junit.Assert.assertNotNull(charset31);
        org.junit.Assert.assertNotNull(outputSettings33);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + true + "'", boolean35 == true);
        org.junit.Assert.assertNotNull(outputSettings37);
        org.junit.Assert.assertNotNull(outputSettings39);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + true + "'", boolean40 == true);
        org.junit.Assert.assertNotNull(outputSettings41);
        org.junit.Assert.assertNotNull(charset42);
        org.junit.Assert.assertNotNull(outputSettings43);
        org.junit.Assert.assertNotNull(outputSettings44);
        org.junit.Assert.assertNotNull(outputSettings45);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertNotNull(outputSettings49);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
        org.junit.Assert.assertNotNull(outputSettings52);
        org.junit.Assert.assertNotNull(charset53);
        org.junit.Assert.assertNotNull(outputSettings54);
        org.junit.Assert.assertNotNull(outputSettings55);
        org.junit.Assert.assertNotNull(outputSettings57);
        org.junit.Assert.assertNotNull(charset58);
    }

    @Test
    public void test20569() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20569");
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
        org.jsoup.nodes.Node node16 = textNode4.attr("#text", "hi!");
        org.jsoup.nodes.TextNode textNode18 = textNode4.text("h");
        org.jsoup.nodes.Node node19 = textNode18.previousSibling();
        org.jsoup.nodes.Node node21 = textNode18.removeAttr("#text");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node23 = node21.after("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(textNode2);
        org.junit.Assert.assertNotNull(textNode4);
        org.junit.Assert.assertNotNull(textNode6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "#text" + "'", str7, "#text");
        org.junit.Assert.assertNotNull(nodeList8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "#text" + "'", str9, "#text");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "#text" + "'", str10, "#text");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "#text" + "'", str11, "#text");
        org.junit.Assert.assertNull(node12);
        org.junit.Assert.assertNotNull(node13);
        org.junit.Assert.assertNotNull(node16);
        org.junit.Assert.assertNotNull(textNode18);
        org.junit.Assert.assertNull(node19);
        org.junit.Assert.assertNotNull(node21);
    }

    @Test
    public void test20570() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20570");
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
        org.jsoup.nodes.Document.OutputSettings outputSettings18 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Entities.EscapeMode escapeMode19 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings20 = outputSettings18.escapeMode(escapeMode19);
        org.jsoup.nodes.Document.OutputSettings outputSettings22 = outputSettings20.prettyPrint(false);
        org.jsoup.nodes.Document.OutputSettings outputSettings23 = new org.jsoup.nodes.Document.OutputSettings();
        boolean boolean24 = outputSettings23.prettyPrint();
        org.jsoup.nodes.Document.OutputSettings outputSettings26 = outputSettings23.prettyPrint(true);
        org.jsoup.nodes.Document.OutputSettings outputSettings28 = outputSettings26.indentAmount((int) ' ');
        boolean boolean29 = outputSettings28.prettyPrint();
        org.jsoup.nodes.Document.OutputSettings outputSettings30 = outputSettings28.clone();
        java.nio.charset.Charset charset31 = outputSettings28.charset();
        org.jsoup.nodes.Document.OutputSettings outputSettings32 = outputSettings22.charset(charset31);
        org.jsoup.nodes.Document.OutputSettings outputSettings34 = outputSettings22.prettyPrint(true);
        boolean boolean35 = textNode2.equals((java.lang.Object) outputSettings22);
        java.util.List<org.jsoup.nodes.Node> nodeList36 = textNode2.childNodes();
        boolean boolean37 = textNode2.isBlank();
        java.util.List<org.jsoup.nodes.Node> nodeList38 = textNode2.childNodes();
        org.jsoup.nodes.Attributes attributes39 = textNode2.attributes();
        org.junit.Assert.assertNotNull(textNode2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(attributes13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(outputSettings20);
        org.junit.Assert.assertNotNull(outputSettings22);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertNotNull(outputSettings26);
        org.junit.Assert.assertNotNull(outputSettings28);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertNotNull(outputSettings30);
        org.junit.Assert.assertNotNull(charset31);
        org.junit.Assert.assertNotNull(outputSettings32);
        org.junit.Assert.assertNotNull(outputSettings34);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertNotNull(nodeList36);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + true + "'", boolean37 == true);
        org.junit.Assert.assertNotNull(nodeList38);
        org.junit.Assert.assertNotNull(attributes39);
    }

    @Test
    public void test20571() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20571");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("", "");
        java.lang.String str3 = textNode2.getWholeText();
        java.lang.String str4 = textNode2.baseUri();
        org.jsoup.nodes.TextNode textNode6 = textNode2.text("hi!");
        org.jsoup.nodes.Node node7 = textNode6.clone();
        org.jsoup.nodes.Node node9 = textNode6.removeAttr("hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList10 = textNode6.siblingNodes();
        java.lang.String str12 = textNode6.absUrl("#text");
        java.util.List<org.jsoup.nodes.Node> nodeList13 = textNode6.childNodes();
        org.jsoup.nodes.Node node15 = textNode6.removeAttr("#text");
        org.jsoup.nodes.Node node16 = textNode6.nextSibling();
        textNode6.setBaseUri("text");
        org.jsoup.select.NodeVisitor nodeVisitor19 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node20 = textNode6.traverse(nodeVisitor19);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(textNode2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(textNode6);
        org.junit.Assert.assertNotNull(node7);
        org.junit.Assert.assertNotNull(node9);
        org.junit.Assert.assertNotNull(nodeList10);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertNotNull(nodeList13);
        org.junit.Assert.assertNotNull(node15);
        org.junit.Assert.assertNull(node16);
    }

    @Test
    public void test20572() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20572");
        org.jsoup.nodes.Document.OutputSettings outputSettings0 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Entities.EscapeMode escapeMode1 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings2 = outputSettings0.escapeMode(escapeMode1);
        org.jsoup.nodes.Document.OutputSettings outputSettings4 = outputSettings0.forceAllElementAsBlock(false);
        org.jsoup.nodes.Document.OutputSettings outputSettings5 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Entities.EscapeMode escapeMode6 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings7 = outputSettings5.escapeMode(escapeMode6);
        int int8 = outputSettings5.indentAmount();
        org.jsoup.nodes.Document.OutputSettings outputSettings9 = new org.jsoup.nodes.Document.OutputSettings();
        boolean boolean10 = outputSettings9.prettyPrint();
        org.jsoup.nodes.Document.OutputSettings outputSettings12 = outputSettings9.prettyPrint(true);
        java.nio.charset.Charset charset13 = outputSettings9.charset();
        org.jsoup.nodes.Document.OutputSettings outputSettings14 = outputSettings5.charset(charset13);
        org.jsoup.nodes.Document.OutputSettings outputSettings15 = outputSettings4.charset(charset13);
        boolean boolean16 = outputSettings15.forceAllElementAsBlock();
        boolean boolean17 = outputSettings15.forceAllElementAsBlock();
        org.jsoup.nodes.Document.OutputSettings outputSettings19 = outputSettings15.forceAllElementAsBlock(true);
        org.jsoup.nodes.Document.OutputSettings outputSettings21 = outputSettings15.prettyPrint(true);
        org.junit.Assert.assertNotNull(outputSettings2);
        org.junit.Assert.assertNotNull(outputSettings4);
        org.junit.Assert.assertNotNull(outputSettings7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(outputSettings12);
        org.junit.Assert.assertNotNull(charset13);
        org.junit.Assert.assertNotNull(outputSettings14);
        org.junit.Assert.assertNotNull(outputSettings15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(outputSettings19);
        org.junit.Assert.assertNotNull(outputSettings21);
    }

    @Test
    public void test20573() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20573");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("", "");
        boolean boolean3 = textNode2.isBlank();
        org.jsoup.nodes.Document.OutputSettings outputSettings4 = new org.jsoup.nodes.Document.OutputSettings();
        boolean boolean5 = outputSettings4.prettyPrint();
        boolean boolean6 = textNode2.equals((java.lang.Object) boolean5);
        java.lang.String str7 = textNode2.outerHtml();
        textNode2.setBaseUri("#text");
        java.util.List<org.jsoup.nodes.Node> nodeList10 = textNode2.childNodes();
        java.lang.String str12 = textNode2.attr("hi!");
        org.jsoup.nodes.TextNode textNode14 = textNode2.text("");
        org.jsoup.nodes.TextNode textNode17 = org.jsoup.nodes.TextNode.createFromEncoded("", "");
        org.jsoup.nodes.TextNode textNode19 = textNode17.text("");
        org.jsoup.nodes.TextNode textNode21 = textNode19.text("#text");
        textNode19.setBaseUri("#text");
        org.jsoup.nodes.TextNode textNode25 = textNode19.text("hi!");
        org.jsoup.nodes.TextNode textNode27 = textNode25.text("hi!");
        org.jsoup.nodes.Node node28 = textNode25.nextSibling();
        // The following exception was thrown during execution in test generation
        try {
            textNode14.replaceWith(node28);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(textNode2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNotNull(nodeList10);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertNotNull(textNode14);
        org.junit.Assert.assertNotNull(textNode17);
        org.junit.Assert.assertNotNull(textNode19);
        org.junit.Assert.assertNotNull(textNode21);
        org.junit.Assert.assertNotNull(textNode25);
        org.junit.Assert.assertNotNull(textNode27);
        org.junit.Assert.assertNull(node28);
    }

    @Test
    public void test20574() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20574");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("", "");
        java.lang.String str3 = textNode2.baseUri();
        java.lang.String str4 = textNode2.nodeName();
        java.lang.String str5 = textNode2.baseUri();
        org.jsoup.nodes.Document.OutputSettings outputSettings6 = new org.jsoup.nodes.Document.OutputSettings();
        boolean boolean7 = outputSettings6.prettyPrint();
        org.jsoup.nodes.Document.OutputSettings outputSettings9 = outputSettings6.prettyPrint(true);
        org.jsoup.nodes.Document.OutputSettings outputSettings10 = new org.jsoup.nodes.Document.OutputSettings();
        boolean boolean11 = outputSettings10.prettyPrint();
        org.jsoup.nodes.Entities.EscapeMode escapeMode12 = outputSettings10.escapeMode();
        int int13 = outputSettings10.indentAmount();
        org.jsoup.nodes.Document.OutputSettings outputSettings15 = outputSettings10.prettyPrint(false);
        org.jsoup.nodes.Document.OutputSettings outputSettings16 = new org.jsoup.nodes.Document.OutputSettings();
        boolean boolean17 = outputSettings16.prettyPrint();
        org.jsoup.nodes.Entities.EscapeMode escapeMode18 = outputSettings16.escapeMode();
        org.jsoup.nodes.Document.OutputSettings outputSettings19 = outputSettings15.escapeMode(escapeMode18);
        org.jsoup.nodes.Document.OutputSettings outputSettings20 = outputSettings6.escapeMode(escapeMode18);
        boolean boolean21 = textNode2.equals((java.lang.Object) escapeMode18);
        org.jsoup.nodes.TextNode textNode24 = new org.jsoup.nodes.TextNode("hi!", "hi!");
        boolean boolean26 = textNode24.hasAttr("hi!");
        org.jsoup.nodes.Attributes attributes27 = textNode24.attributes();
        boolean boolean29 = textNode24.hasAttr("#text");
        org.jsoup.nodes.Node node30 = textNode24.previousSibling();
        org.jsoup.nodes.TextNode textNode32 = textNode24.text("");
        java.util.List<org.jsoup.nodes.Node> nodeList33 = textNode24.siblingNodes();
        boolean boolean35 = textNode24.hasAttr("#text");
        boolean boolean36 = textNode2.equals((java.lang.Object) boolean35);
        org.junit.Assert.assertNotNull(textNode2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "#text" + "'", str4, "#text");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(outputSettings9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + escapeMode12 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode12.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertNotNull(outputSettings15);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + escapeMode18 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode18.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertNotNull(outputSettings19);
        org.junit.Assert.assertNotNull(outputSettings20);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNotNull(attributes27);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertNull(node30);
        org.junit.Assert.assertNotNull(textNode32);
        org.junit.Assert.assertNotNull(nodeList33);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
    }

    @Test
    public void test20575() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20575");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("#text", "");
        java.lang.String str3 = textNode2.nodeName();
        java.lang.String str4 = textNode2.nodeName();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "#text" + "'", str3, "#text");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "#text" + "'", str4, "#text");
    }

    @Test
    public void test20576() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20576");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("", "");
        java.lang.String str3 = textNode2.getWholeText();
        java.lang.String str4 = textNode2.getWholeText();
        java.util.List<org.jsoup.nodes.Node> nodeList5 = textNode2.siblingNodes();
        java.lang.String str6 = textNode2.text();
        java.lang.String str7 = textNode2.text();
        int int8 = textNode2.siblingIndex();
        // The following exception was thrown during execution in test generation
        try {
            textNode2.remove();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(textNode2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(nodeList5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void test20577() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20577");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("", "");
        java.lang.String str3 = textNode2.getWholeText();
        java.lang.String str4 = textNode2.baseUri();
        org.jsoup.nodes.TextNode textNode6 = textNode2.text("hi!");
        org.jsoup.nodes.Node node8 = textNode2.removeAttr("hi!");
        int int9 = textNode2.siblingIndex();
        java.lang.String str10 = textNode2.baseUri();
        boolean boolean12 = textNode2.hasAttr("i!");
        org.jsoup.nodes.Node node13 = textNode2.parent();
        java.lang.String str14 = textNode2.getWholeText();
        org.jsoup.nodes.Node node15 = textNode2.clone();
        org.jsoup.nodes.TextNode textNode18 = org.jsoup.nodes.TextNode.createFromEncoded("", "");
        boolean boolean19 = textNode18.isBlank();
        org.jsoup.nodes.Node node20 = textNode18.previousSibling();
        java.lang.String str22 = textNode18.absUrl("#text");
        org.jsoup.nodes.Attributes attributes23 = textNode18.attributes();
        org.jsoup.nodes.TextNode textNode25 = textNode18.text("hi!");
        org.jsoup.nodes.Node node26 = textNode18.clone();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node27 = node15.before((org.jsoup.nodes.Node) textNode18);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(textNode2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(textNode6);
        org.junit.Assert.assertNotNull(node8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNull(node13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertNotNull(node15);
        org.junit.Assert.assertNotNull(textNode18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertNull(node20);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertNotNull(attributes23);
        org.junit.Assert.assertNotNull(textNode25);
        org.junit.Assert.assertNotNull(node26);
    }

    @Test
    public void test20578() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20578");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("", "");
        boolean boolean3 = textNode2.isBlank();
        org.jsoup.nodes.Node node6 = textNode2.attr("hi!", "hi!");
        org.jsoup.nodes.Document document7 = textNode2.ownerDocument();
        org.jsoup.nodes.TextNode textNode9 = textNode2.text("hi!");
        java.lang.String str10 = textNode9.outerHtml();
        boolean boolean11 = textNode9.isBlank();
        org.jsoup.nodes.TextNode textNode13 = textNode9.text("i!");
        org.junit.Assert.assertNotNull(textNode2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(node6);
        org.junit.Assert.assertNull(document7);
        org.junit.Assert.assertNotNull(textNode9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(textNode13);
    }

    @Test
    public void test20579() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20579");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("", "");
        boolean boolean3 = textNode2.isBlank();
        org.jsoup.nodes.Node node6 = textNode2.attr("hi!", "hi!");
        org.jsoup.nodes.TextNode textNode8 = textNode2.text("#text");
        org.jsoup.nodes.Node node9 = textNode2.nextSibling();
        org.jsoup.nodes.TextNode textNode11 = textNode2.text("#");
        org.junit.Assert.assertNotNull(textNode2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(node6);
        org.junit.Assert.assertNotNull(textNode8);
        org.junit.Assert.assertNull(node9);
        org.junit.Assert.assertNotNull(textNode11);
    }

    @Test
    public void test20580() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20580");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("", "");
        java.lang.String str3 = textNode2.getWholeText();
        java.lang.String str4 = textNode2.baseUri();
        org.jsoup.nodes.TextNode textNode6 = textNode2.text("hi!");
        org.jsoup.nodes.Node node7 = textNode6.clone();
        org.jsoup.nodes.Node node9 = textNode6.removeAttr("hi!");
        boolean boolean10 = textNode6.isBlank();
        org.jsoup.nodes.Node node13 = textNode6.attr("hi!", "");
        org.jsoup.nodes.Node node16 = textNode6.attr("i!", "");
        org.jsoup.nodes.Node node19 = textNode6.attr("hi!", "hi!");
        textNode6.setBaseUri("i!");
        org.jsoup.nodes.Node node23 = textNode6.removeAttr("h");
        org.junit.Assert.assertNotNull(textNode2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(textNode6);
        org.junit.Assert.assertNotNull(node7);
        org.junit.Assert.assertNotNull(node9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(node13);
        org.junit.Assert.assertNotNull(node16);
        org.junit.Assert.assertNotNull(node19);
        org.junit.Assert.assertNotNull(node23);
    }

    @Test
    public void test20581() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20581");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("i!", "#text");
        java.lang.String str3 = textNode2.text();
        org.jsoup.nodes.Document.OutputSettings outputSettings4 = new org.jsoup.nodes.Document.OutputSettings();
        boolean boolean5 = outputSettings4.prettyPrint();
        org.jsoup.nodes.Document.OutputSettings outputSettings7 = outputSettings4.prettyPrint(true);
        org.jsoup.nodes.Document.OutputSettings outputSettings9 = outputSettings7.indentAmount((int) ' ');
        boolean boolean10 = textNode2.equals((java.lang.Object) outputSettings9);
        org.jsoup.nodes.Document.OutputSettings outputSettings11 = new org.jsoup.nodes.Document.OutputSettings();
        boolean boolean12 = outputSettings11.prettyPrint();
        org.jsoup.nodes.Entities.EscapeMode escapeMode13 = outputSettings11.escapeMode();
        int int14 = outputSettings11.indentAmount();
        org.jsoup.nodes.Document.OutputSettings outputSettings16 = outputSettings11.prettyPrint(false);
        java.nio.charset.Charset charset17 = outputSettings16.charset();
        boolean boolean18 = outputSettings16.forceAllElementAsBlock();
        org.jsoup.nodes.Document.OutputSettings outputSettings19 = outputSettings16.clone();
        org.jsoup.nodes.Document.OutputSettings outputSettings20 = outputSettings16.clone();
        int int21 = outputSettings16.indentAmount();
        org.jsoup.nodes.Document.OutputSettings outputSettings23 = outputSettings16.indentAmount((int) (short) 1);
        org.jsoup.nodes.Document.OutputSettings outputSettings24 = outputSettings16.clone();
        org.jsoup.nodes.Entities.EscapeMode escapeMode25 = outputSettings16.escapeMode();
        org.jsoup.nodes.Document.OutputSettings outputSettings26 = outputSettings9.escapeMode(escapeMode25);
        org.jsoup.nodes.Document.OutputSettings outputSettings27 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Entities.EscapeMode escapeMode28 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings29 = outputSettings27.escapeMode(escapeMode28);
        int int30 = outputSettings27.indentAmount();
        org.jsoup.nodes.Document.OutputSettings outputSettings32 = outputSettings27.forceAllElementAsBlock(false);
        int int33 = outputSettings27.indentAmount();
        org.jsoup.nodes.Document.OutputSettings outputSettings34 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Entities.EscapeMode escapeMode35 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings36 = outputSettings34.escapeMode(escapeMode35);
        java.nio.charset.Charset charset37 = outputSettings36.charset();
        org.jsoup.nodes.Document.OutputSettings outputSettings38 = outputSettings27.charset(charset37);
        boolean boolean39 = outputSettings38.forceAllElementAsBlock();
        org.jsoup.nodes.Document.OutputSettings outputSettings40 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Entities.EscapeMode escapeMode41 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings42 = outputSettings40.escapeMode(escapeMode41);
        java.nio.charset.Charset charset43 = outputSettings40.charset();
        org.jsoup.nodes.Document.OutputSettings outputSettings45 = outputSettings40.forceAllElementAsBlock(false);
        org.jsoup.nodes.Document.OutputSettings outputSettings47 = outputSettings40.indentAmount((int) (byte) 10);
        org.jsoup.nodes.Document.OutputSettings outputSettings49 = outputSettings47.indentAmount((int) ' ');
        org.jsoup.nodes.Document.OutputSettings outputSettings50 = new org.jsoup.nodes.Document.OutputSettings();
        int int51 = outputSettings50.indentAmount();
        org.jsoup.nodes.Document.OutputSettings outputSettings53 = outputSettings50.forceAllElementAsBlock(true);
        boolean boolean54 = outputSettings50.forceAllElementAsBlock();
        org.jsoup.nodes.Document.OutputSettings outputSettings56 = outputSettings50.indentAmount((int) (byte) 10);
        org.jsoup.nodes.Document.OutputSettings outputSettings57 = new org.jsoup.nodes.Document.OutputSettings();
        boolean boolean58 = outputSettings57.prettyPrint();
        org.jsoup.nodes.Entities.EscapeMode escapeMode59 = outputSettings57.escapeMode();
        org.jsoup.nodes.Document.OutputSettings outputSettings60 = outputSettings50.escapeMode(escapeMode59);
        org.jsoup.nodes.Document.OutputSettings outputSettings61 = outputSettings47.escapeMode(escapeMode59);
        org.jsoup.nodes.Document.OutputSettings outputSettings62 = outputSettings38.escapeMode(escapeMode59);
        org.jsoup.nodes.Document.OutputSettings outputSettings63 = outputSettings62.clone();
        org.jsoup.nodes.Document.OutputSettings outputSettings65 = outputSettings63.prettyPrint(false);
        org.jsoup.nodes.Document.OutputSettings outputSettings66 = outputSettings63.clone();
        java.nio.charset.Charset charset67 = outputSettings66.charset();
        org.jsoup.nodes.Document.OutputSettings outputSettings68 = outputSettings9.charset(charset67);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "i!" + "'", str3, "i!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(outputSettings7);
        org.junit.Assert.assertNotNull(outputSettings9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + escapeMode13 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode13.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertNotNull(outputSettings16);
        org.junit.Assert.assertNotNull(charset17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(outputSettings19);
        org.junit.Assert.assertNotNull(outputSettings20);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1 + "'", int21 == 1);
        org.junit.Assert.assertNotNull(outputSettings23);
        org.junit.Assert.assertNotNull(outputSettings24);
        org.junit.Assert.assertTrue("'" + escapeMode25 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode25.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertNotNull(outputSettings26);
        org.junit.Assert.assertNotNull(outputSettings29);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 1 + "'", int30 == 1);
        org.junit.Assert.assertNotNull(outputSettings32);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 1 + "'", int33 == 1);
        org.junit.Assert.assertNotNull(outputSettings36);
        org.junit.Assert.assertNotNull(charset37);
        org.junit.Assert.assertNotNull(outputSettings38);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertNotNull(outputSettings42);
        org.junit.Assert.assertNotNull(charset43);
        org.junit.Assert.assertNotNull(outputSettings45);
        org.junit.Assert.assertNotNull(outputSettings47);
        org.junit.Assert.assertNotNull(outputSettings49);
        org.junit.Assert.assertTrue("'" + int51 + "' != '" + 1 + "'", int51 == 1);
        org.junit.Assert.assertNotNull(outputSettings53);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + true + "'", boolean54 == true);
        org.junit.Assert.assertNotNull(outputSettings56);
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + true + "'", boolean58 == true);
        org.junit.Assert.assertTrue("'" + escapeMode59 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode59.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertNotNull(outputSettings60);
        org.junit.Assert.assertNotNull(outputSettings61);
        org.junit.Assert.assertNotNull(outputSettings62);
        org.junit.Assert.assertNotNull(outputSettings63);
        org.junit.Assert.assertNotNull(outputSettings65);
        org.junit.Assert.assertNotNull(outputSettings66);
        org.junit.Assert.assertNotNull(charset67);
        org.junit.Assert.assertNotNull(outputSettings68);
    }

    @Test
    public void test20582() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20582");
        org.jsoup.nodes.Document.OutputSettings outputSettings0 = new org.jsoup.nodes.Document.OutputSettings();
        int int1 = outputSettings0.indentAmount();
        org.jsoup.nodes.Document.OutputSettings outputSettings3 = outputSettings0.forceAllElementAsBlock(true);
        org.jsoup.nodes.Document.OutputSettings outputSettings5 = outputSettings0.prettyPrint(true);
        java.nio.charset.Charset charset6 = outputSettings0.charset();
        org.jsoup.nodes.Document.OutputSettings outputSettings8 = outputSettings0.prettyPrint(false);
        org.jsoup.nodes.Document.OutputSettings outputSettings10 = outputSettings8.forceAllElementAsBlock(false);
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
        boolean boolean29 = outputSettings28.forceAllElementAsBlock();
        org.jsoup.nodes.Document.OutputSettings outputSettings31 = outputSettings28.forceAllElementAsBlock(false);
        org.jsoup.nodes.Document.OutputSettings outputSettings33 = outputSettings31.forceAllElementAsBlock(false);
        int int34 = outputSettings31.indentAmount();
        org.jsoup.nodes.Document.OutputSettings outputSettings35 = outputSettings31.clone();
        org.jsoup.nodes.Entities.EscapeMode escapeMode36 = outputSettings35.escapeMode();
        org.jsoup.nodes.Document.OutputSettings outputSettings37 = outputSettings10.escapeMode(escapeMode36);
        org.jsoup.nodes.Entities.EscapeMode escapeMode38 = outputSettings37.escapeMode();
        java.nio.charset.Charset charset39 = outputSettings37.charset();
        org.jsoup.nodes.Document.OutputSettings outputSettings41 = outputSettings37.indentAmount((int) (short) 10);
        java.lang.Class<?> wildcardClass42 = outputSettings41.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1 + "'", int1 == 1);
        org.junit.Assert.assertNotNull(outputSettings3);
        org.junit.Assert.assertNotNull(outputSettings5);
        org.junit.Assert.assertNotNull(charset6);
        org.junit.Assert.assertNotNull(outputSettings8);
        org.junit.Assert.assertNotNull(outputSettings10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(outputSettings14);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + escapeMode17 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode17.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertNotNull(outputSettings20);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertTrue("'" + escapeMode23 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode23.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertNotNull(outputSettings24);
        org.junit.Assert.assertNotNull(outputSettings25);
        org.junit.Assert.assertTrue("'" + escapeMode26 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode26.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertNotNull(outputSettings27);
        org.junit.Assert.assertNotNull(outputSettings28);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertNotNull(outputSettings31);
        org.junit.Assert.assertNotNull(outputSettings33);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 1 + "'", int34 == 1);
        org.junit.Assert.assertNotNull(outputSettings35);
        org.junit.Assert.assertTrue("'" + escapeMode36 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode36.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertNotNull(outputSettings37);
        org.junit.Assert.assertTrue("'" + escapeMode38 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode38.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertNotNull(charset39);
        org.junit.Assert.assertNotNull(outputSettings41);
        org.junit.Assert.assertNotNull(wildcardClass42);
    }

    @Test
    public void test20583() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20583");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("", "");
        org.jsoup.nodes.TextNode textNode4 = textNode2.text("");
        boolean boolean6 = textNode4.hasAttr("");
        org.jsoup.nodes.Node node7 = textNode4.clone();
        java.util.List<org.jsoup.nodes.Node> nodeList8 = node7.siblingNodes();
        node7.setBaseUri("hi!");
        org.jsoup.nodes.TextNode textNode13 = org.jsoup.nodes.TextNode.createFromEncoded("", "");
        java.lang.String str14 = textNode13.baseUri();
        java.lang.String str15 = textNode13.baseUri();
        java.lang.String str16 = textNode13.getWholeText();
        java.lang.String str17 = textNode13.outerHtml();
        java.lang.String str18 = textNode13.text();
        java.util.List<org.jsoup.nodes.Node> nodeList19 = textNode13.childNodes();
        boolean boolean21 = textNode13.hasAttr("h");
        org.jsoup.nodes.Node node22 = textNode13.clone();
        boolean boolean24 = textNode13.hasAttr("text");
        boolean boolean25 = node7.equals((java.lang.Object) textNode13);
        java.lang.String str26 = textNode13.outerHtml();
        org.junit.Assert.assertNotNull(textNode2);
        org.junit.Assert.assertNotNull(textNode4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(node7);
        org.junit.Assert.assertNotNull(nodeList8);
        org.junit.Assert.assertNotNull(textNode13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertNotNull(nodeList19);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(node22);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "" + "'", str26, "");
    }

    @Test
    public void test20584() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20584");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("", "");
        java.lang.String str3 = textNode2.getWholeText();
        java.lang.String str4 = textNode2.baseUri();
        org.jsoup.nodes.TextNode textNode6 = textNode2.text("hi!");
        org.jsoup.nodes.Node node7 = textNode6.clone();
        org.jsoup.nodes.Node node9 = textNode6.removeAttr("hi!");
        java.lang.String str10 = textNode6.toString();
        org.jsoup.nodes.Node node13 = textNode6.attr("#text", "hi!");
        java.lang.String str15 = textNode6.absUrl("h");
        java.lang.String str16 = textNode6.getWholeText();
        java.util.List<org.jsoup.nodes.Node> nodeList17 = textNode6.childNodes();
        org.jsoup.nodes.Node node18 = textNode6.parent();
        org.junit.Assert.assertNotNull(textNode2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(textNode6);
        org.junit.Assert.assertNotNull(node7);
        org.junit.Assert.assertNotNull(node9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertNotNull(node13);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertNotNull(nodeList17);
        org.junit.Assert.assertNull(node18);
    }

    @Test
    public void test20585() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20585");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("", "");
        boolean boolean3 = textNode2.isBlank();
        org.jsoup.nodes.Node node4 = textNode2.previousSibling();
        java.lang.String str5 = textNode2.getWholeText();
        java.lang.String str6 = textNode2.baseUri();
        java.lang.String str7 = textNode2.baseUri();
        java.lang.String str8 = textNode2.toString();
        org.jsoup.nodes.TextNode textNode10 = textNode2.text("#text");
        java.lang.String str11 = textNode2.toString();
        org.jsoup.nodes.Node node12 = textNode2.parent();
        org.jsoup.nodes.Node node14 = textNode2.removeAttr("#text");
        org.jsoup.nodes.Node node15 = textNode2.clone();
        java.lang.String str16 = textNode2.getWholeText();
        org.junit.Assert.assertNotNull(textNode2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNull(node4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNotNull(textNode10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "#text" + "'", str11, "#text");
        org.junit.Assert.assertNull(node12);
        org.junit.Assert.assertNotNull(node14);
        org.junit.Assert.assertNotNull(node15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "#text" + "'", str16, "#text");
    }

    @Test
    public void test20586() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20586");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("", "");
        boolean boolean3 = textNode2.isBlank();
        org.jsoup.nodes.Node node6 = textNode2.attr("hi!", "hi!");
        org.jsoup.nodes.TextNode textNode8 = textNode2.text("#text");
        org.jsoup.nodes.Node node10 = textNode8.removeAttr("#text");
        java.util.List<org.jsoup.nodes.Node> nodeList11 = textNode8.siblingNodes();
        java.lang.String str12 = textNode8.outerHtml();
        java.lang.String str14 = textNode8.attr("i!");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.TextNode textNode16 = textNode8.splitText((int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Split offset must not be greater than current text length");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(textNode2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(node6);
        org.junit.Assert.assertNotNull(textNode8);
        org.junit.Assert.assertNotNull(node10);
        org.junit.Assert.assertNotNull(nodeList11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "#text" + "'", str12, "#text");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
    }

    @Test
    public void test20587() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20587");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("", "");
        java.lang.String str3 = textNode2.toString();
        int int4 = textNode2.siblingIndex();
        java.lang.String str5 = textNode2.nodeName();
        org.jsoup.nodes.Node node7 = textNode2.removeAttr("h");
        org.jsoup.nodes.Node node8 = node7.clone();
        java.util.List<org.jsoup.nodes.Node> nodeList9 = node8.childNodes();
        java.util.List<org.jsoup.nodes.Node> nodeList10 = node8.childNodes();
        java.util.List<org.jsoup.nodes.Node> nodeList11 = node8.childNodes();
        org.junit.Assert.assertNotNull(textNode2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "#text" + "'", str5, "#text");
        org.junit.Assert.assertNotNull(node7);
        org.junit.Assert.assertNotNull(node8);
        org.junit.Assert.assertNotNull(nodeList9);
        org.junit.Assert.assertNotNull(nodeList10);
        org.junit.Assert.assertNotNull(nodeList11);
    }

    @Test
    public void test20588() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20588");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("i!", "#text");
        org.jsoup.nodes.Attributes attributes3 = textNode2.attributes();
        java.util.List<org.jsoup.nodes.Node> nodeList4 = textNode2.childNodes();
        java.lang.String str6 = textNode2.absUrl("hi!");
        org.jsoup.nodes.Node node9 = textNode2.attr("h", "");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node10 = textNode2.unwrap();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(textNode2);
        org.junit.Assert.assertNotNull(attributes3);
        org.junit.Assert.assertNotNull(nodeList4);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(node9);
    }

    @Test
    public void test20589() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20589");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("", "");
        java.lang.String str3 = textNode2.nodeName();
        java.util.List<org.jsoup.nodes.Node> nodeList4 = textNode2.childNodes();
        org.jsoup.nodes.Node node5 = textNode2.previousSibling();
        java.util.List<org.jsoup.nodes.Node> nodeList6 = textNode2.childNodes();
        java.lang.String str7 = textNode2.baseUri();
        org.jsoup.nodes.Node node10 = textNode2.attr("h", "#");
        org.junit.Assert.assertNotNull(textNode2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "#text" + "'", str3, "#text");
        org.junit.Assert.assertNotNull(nodeList4);
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertNotNull(nodeList6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNotNull(node10);
    }

    @Test
    public void test20590() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20590");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("#text", "");
        org.jsoup.nodes.TextNode textNode5 = org.jsoup.nodes.TextNode.createFromEncoded("", "");
        java.lang.String str6 = textNode5.nodeName();
        java.util.List<org.jsoup.nodes.Node> nodeList7 = textNode5.childNodes();
        org.jsoup.nodes.Node node8 = textNode5.previousSibling();
        org.jsoup.nodes.Node node10 = textNode5.removeAttr("hi!");
        org.jsoup.nodes.TextNode textNode12 = textNode5.text("i!");
        boolean boolean13 = textNode2.equals((java.lang.Object) textNode12);
        org.jsoup.nodes.Node node14 = textNode12.nextSibling();
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<org.jsoup.nodes.Node> nodeList15 = node14.siblingNodes();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(textNode5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "#text" + "'", str6, "#text");
        org.junit.Assert.assertNotNull(nodeList7);
        org.junit.Assert.assertNull(node8);
        org.junit.Assert.assertNotNull(node10);
        org.junit.Assert.assertNotNull(textNode12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNull(node14);
    }

    @Test
    public void test20591() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20591");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("", "");
        boolean boolean3 = textNode2.isBlank();
        org.jsoup.nodes.Document.OutputSettings outputSettings4 = new org.jsoup.nodes.Document.OutputSettings();
        boolean boolean5 = outputSettings4.prettyPrint();
        boolean boolean6 = textNode2.equals((java.lang.Object) boolean5);
        java.lang.String str7 = textNode2.outerHtml();
        org.jsoup.nodes.Document document8 = textNode2.ownerDocument();
        java.lang.String str10 = textNode2.attr("hi!");
        java.lang.String str11 = textNode2.baseUri();
        boolean boolean12 = textNode2.isBlank();
        org.jsoup.nodes.Document.OutputSettings outputSettings13 = new org.jsoup.nodes.Document.OutputSettings();
        int int14 = outputSettings13.indentAmount();
        org.jsoup.nodes.Document.OutputSettings outputSettings16 = outputSettings13.forceAllElementAsBlock(true);
        org.jsoup.nodes.Document.OutputSettings outputSettings18 = outputSettings13.prettyPrint(true);
        java.nio.charset.Charset charset19 = outputSettings13.charset();
        org.jsoup.nodes.Document.OutputSettings outputSettings21 = outputSettings13.prettyPrint(false);
        org.jsoup.nodes.Document.OutputSettings outputSettings23 = outputSettings21.forceAllElementAsBlock(false);
        boolean boolean24 = textNode2.equals((java.lang.Object) outputSettings23);
        boolean boolean26 = textNode2.hasAttr("");
        textNode2.setBaseUri("text");
        org.jsoup.nodes.TextNode textNode31 = org.jsoup.nodes.TextNode.createFromEncoded("", "");
        java.lang.String str32 = textNode31.nodeName();
        java.util.List<org.jsoup.nodes.Node> nodeList33 = textNode31.childNodes();
        org.jsoup.nodes.Node node34 = textNode31.previousSibling();
        java.lang.String str35 = textNode31.text();
        org.jsoup.nodes.TextNode textNode38 = org.jsoup.nodes.TextNode.createFromEncoded("", "");
        java.lang.String str39 = textNode38.baseUri();
        java.lang.String str40 = textNode38.baseUri();
        org.jsoup.nodes.TextNode textNode43 = org.jsoup.nodes.TextNode.createFromEncoded("", "");
        boolean boolean44 = textNode43.isBlank();
        org.jsoup.nodes.Node node47 = textNode43.attr("hi!", "hi!");
        org.jsoup.nodes.TextNode textNode49 = textNode43.text("#text");
        org.jsoup.nodes.Node node51 = textNode49.removeAttr("#text");
        java.lang.String str53 = textNode49.absUrl("#text");
        boolean boolean54 = textNode38.equals((java.lang.Object) textNode49);
        boolean boolean55 = textNode31.equals((java.lang.Object) textNode38);
        org.jsoup.nodes.TextNode textNode57 = textNode31.text("#");
        boolean boolean58 = textNode2.equals((java.lang.Object) textNode57);
        org.junit.Assert.assertNotNull(textNode2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNull(document8);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertNotNull(outputSettings16);
        org.junit.Assert.assertNotNull(outputSettings18);
        org.junit.Assert.assertNotNull(charset19);
        org.junit.Assert.assertNotNull(outputSettings21);
        org.junit.Assert.assertNotNull(outputSettings23);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNotNull(textNode31);
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "#text" + "'", str32, "#text");
        org.junit.Assert.assertNotNull(nodeList33);
        org.junit.Assert.assertNull(node34);
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "" + "'", str35, "");
        org.junit.Assert.assertNotNull(textNode38);
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "" + "'", str39, "");
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "" + "'", str40, "");
        org.junit.Assert.assertNotNull(textNode43);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + true + "'", boolean44 == true);
        org.junit.Assert.assertNotNull(node47);
        org.junit.Assert.assertNotNull(textNode49);
        org.junit.Assert.assertNotNull(node51);
        org.junit.Assert.assertEquals("'" + str53 + "' != '" + "" + "'", str53, "");
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + false + "'", boolean54 == false);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + false + "'", boolean55 == false);
        org.junit.Assert.assertNotNull(textNode57);
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + false + "'", boolean58 == false);
    }

    @Test
    public void test20592() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20592");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("#text", "i!");
        org.jsoup.nodes.Node node3 = textNode2.parent();
        java.lang.String str4 = textNode2.getWholeText();
        org.jsoup.nodes.TextNode textNode7 = new org.jsoup.nodes.TextNode("", "");
        org.jsoup.nodes.Node node10 = textNode7.attr("i!", "");
        java.util.List<org.jsoup.nodes.Node> nodeList11 = textNode7.childNodes();
        boolean boolean12 = textNode2.equals((java.lang.Object) nodeList11);
        org.jsoup.nodes.Node node13 = textNode2.clone();
        java.lang.String str15 = textNode2.absUrl("text");
        org.junit.Assert.assertNotNull(textNode2);
        org.junit.Assert.assertNull(node3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "#text" + "'", str4, "#text");
        org.junit.Assert.assertNotNull(node10);
        org.junit.Assert.assertNotNull(nodeList11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(node13);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
    }

    @Test
    public void test20593() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20593");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("", "");
        org.jsoup.nodes.TextNode textNode4 = textNode2.text("");
        java.lang.String str5 = textNode2.outerHtml();
        boolean boolean7 = textNode2.hasAttr("");
        org.jsoup.nodes.Node node10 = textNode2.attr("i!", "");
        org.jsoup.nodes.Node node11 = textNode2.parent();
        java.lang.String str12 = textNode2.getWholeText();
        java.lang.String str13 = textNode2.toString();
        org.jsoup.nodes.Node node14 = textNode2.parent();
        java.lang.String str15 = textNode2.getWholeText();
        org.junit.Assert.assertNotNull(textNode2);
        org.junit.Assert.assertNotNull(textNode4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(node10);
        org.junit.Assert.assertNull(node11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNull(node14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
    }

    @Test
    public void test20594() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20594");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("", "");
        org.jsoup.nodes.TextNode textNode4 = textNode2.text("");
        org.jsoup.nodes.Node node5 = textNode2.previousSibling();
        boolean boolean7 = textNode2.hasAttr("hi!");
        boolean boolean9 = textNode2.hasAttr("#text");
        java.lang.String str10 = textNode2.baseUri();
        java.lang.String str11 = textNode2.text();
        org.jsoup.nodes.Document document12 = textNode2.ownerDocument();
        java.lang.String str14 = textNode2.attr("#text");
        java.lang.String str16 = textNode2.attr("");
        org.jsoup.nodes.TextNode textNode18 = textNode2.text("#");
        org.jsoup.nodes.Node node19 = textNode18.previousSibling();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str20 = node19.baseUri();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(textNode2);
        org.junit.Assert.assertNotNull(textNode4);
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNull(document12);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertNotNull(textNode18);
        org.junit.Assert.assertNull(node19);
    }

    @Test
    public void test20595() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20595");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("", "");
        org.jsoup.nodes.TextNode textNode4 = textNode2.text("");
        org.jsoup.nodes.Node node5 = textNode2.previousSibling();
        org.jsoup.nodes.Node node6 = textNode2.parent();
        java.lang.String str7 = textNode2.baseUri();
        org.jsoup.nodes.Attributes attributes8 = textNode2.attributes();
        boolean boolean10 = textNode2.hasAttr("i!");
        java.lang.String str11 = textNode2.nodeName();
        org.junit.Assert.assertNotNull(textNode2);
        org.junit.Assert.assertNotNull(textNode4);
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertNull(node6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNotNull(attributes8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "#text" + "'", str11, "#text");
    }

    @Test
    public void test20596() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20596");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("", "");
        java.lang.String str3 = textNode2.text();
        org.jsoup.nodes.Node node5 = textNode2.removeAttr("hi!");
        java.lang.String str7 = textNode2.absUrl("hi!");
        int int8 = textNode2.siblingIndex();
        org.jsoup.nodes.Document document9 = textNode2.ownerDocument();
        org.junit.Assert.assertNotNull(textNode2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertNotNull(node5);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNull(document9);
    }

    @Test
    public void test20597() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20597");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("", "");
        boolean boolean3 = textNode2.isBlank();
        org.jsoup.nodes.Node node6 = textNode2.attr("hi!", "hi!");
        org.jsoup.nodes.TextNode textNode8 = textNode2.text("#text");
        org.jsoup.nodes.Node node10 = textNode8.removeAttr("#text");
        java.util.List<org.jsoup.nodes.Node> nodeList11 = textNode8.siblingNodes();
        java.lang.String str12 = textNode8.outerHtml();
        java.lang.String str14 = textNode8.attr("i!");
        boolean boolean15 = textNode8.isBlank();
        org.jsoup.nodes.TextNode textNode17 = textNode8.splitText((int) (byte) 1);
        org.jsoup.nodes.Document document18 = textNode17.ownerDocument();
        boolean boolean19 = textNode17.isBlank();
        java.lang.String str20 = textNode17.getWholeText();
        org.junit.Assert.assertNotNull(textNode2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(node6);
        org.junit.Assert.assertNotNull(textNode8);
        org.junit.Assert.assertNotNull(node10);
        org.junit.Assert.assertNotNull(nodeList11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "#text" + "'", str12, "#text");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(textNode17);
        org.junit.Assert.assertNull(document18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "text" + "'", str20, "text");
    }

    @Test
    public void test20598() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20598");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("", "");
        boolean boolean3 = textNode2.isBlank();
        org.jsoup.nodes.Document.OutputSettings outputSettings4 = new org.jsoup.nodes.Document.OutputSettings();
        boolean boolean5 = outputSettings4.prettyPrint();
        org.jsoup.nodes.Entities.EscapeMode escapeMode6 = outputSettings4.escapeMode();
        int int7 = outputSettings4.indentAmount();
        org.jsoup.nodes.Document.OutputSettings outputSettings9 = outputSettings4.prettyPrint(false);
        java.nio.charset.Charset charset10 = outputSettings9.charset();
        boolean boolean11 = textNode2.equals((java.lang.Object) outputSettings9);
        boolean boolean12 = outputSettings9.forceAllElementAsBlock();
        org.jsoup.nodes.Entities.EscapeMode escapeMode13 = outputSettings9.escapeMode();
        org.jsoup.nodes.Document.OutputSettings outputSettings15 = outputSettings9.indentAmount(32);
        org.jsoup.nodes.Document.OutputSettings outputSettings17 = outputSettings15.prettyPrint(false);
        org.jsoup.nodes.Entities.EscapeMode escapeMode18 = outputSettings17.escapeMode();
        boolean boolean19 = outputSettings17.prettyPrint();
        java.nio.charset.Charset charset20 = outputSettings17.charset();
        org.junit.Assert.assertNotNull(textNode2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + escapeMode6 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode6.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertNotNull(outputSettings9);
        org.junit.Assert.assertNotNull(charset10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + escapeMode13 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode13.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertNotNull(outputSettings15);
        org.junit.Assert.assertNotNull(outputSettings17);
        org.junit.Assert.assertTrue("'" + escapeMode18 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode18.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(charset20);
    }

    @Test
    public void test20599() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20599");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("", "");
        java.lang.String str3 = textNode2.getWholeText();
        java.lang.String str4 = textNode2.outerHtml();
        java.lang.String str5 = textNode2.nodeName();
        org.jsoup.nodes.TextNode textNode7 = textNode2.text("hi!");
        org.jsoup.nodes.Node node8 = textNode2.previousSibling();
        org.jsoup.nodes.Document document9 = textNode2.ownerDocument();
        int int10 = textNode2.siblingIndex();
        org.junit.Assert.assertNotNull(textNode2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "#text" + "'", str5, "#text");
        org.junit.Assert.assertNotNull(textNode7);
        org.junit.Assert.assertNull(node8);
        org.junit.Assert.assertNull(document9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
    }

    @Test
    public void test20600() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20600");
        org.jsoup.nodes.Document.OutputSettings outputSettings0 = new org.jsoup.nodes.Document.OutputSettings();
        boolean boolean1 = outputSettings0.prettyPrint();
        org.jsoup.nodes.Document.OutputSettings outputSettings3 = outputSettings0.prettyPrint(true);
        org.jsoup.nodes.Document.OutputSettings outputSettings4 = new org.jsoup.nodes.Document.OutputSettings();
        boolean boolean5 = outputSettings4.prettyPrint();
        org.jsoup.nodes.Entities.EscapeMode escapeMode6 = outputSettings4.escapeMode();
        int int7 = outputSettings4.indentAmount();
        org.jsoup.nodes.Document.OutputSettings outputSettings9 = outputSettings4.prettyPrint(false);
        org.jsoup.nodes.Document.OutputSettings outputSettings10 = new org.jsoup.nodes.Document.OutputSettings();
        boolean boolean11 = outputSettings10.prettyPrint();
        org.jsoup.nodes.Entities.EscapeMode escapeMode12 = outputSettings10.escapeMode();
        org.jsoup.nodes.Document.OutputSettings outputSettings13 = outputSettings9.escapeMode(escapeMode12);
        org.jsoup.nodes.Document.OutputSettings outputSettings14 = outputSettings0.escapeMode(escapeMode12);
        org.jsoup.nodes.Entities.EscapeMode escapeMode15 = outputSettings0.escapeMode();
        org.jsoup.nodes.Document.OutputSettings outputSettings16 = outputSettings0.clone();
        org.jsoup.nodes.Document.OutputSettings outputSettings17 = outputSettings0.clone();
        org.jsoup.nodes.Document.OutputSettings outputSettings18 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Entities.EscapeMode escapeMode19 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings20 = outputSettings18.escapeMode(escapeMode19);
        int int21 = outputSettings18.indentAmount();
        org.jsoup.nodes.Document.OutputSettings outputSettings23 = outputSettings18.forceAllElementAsBlock(false);
        org.jsoup.nodes.Document.OutputSettings outputSettings25 = outputSettings23.indentAmount((int) (byte) 1);
        java.nio.charset.Charset charset26 = outputSettings23.charset();
        org.jsoup.nodes.Document.OutputSettings outputSettings27 = outputSettings0.charset(charset26);
        org.jsoup.nodes.Document.OutputSettings outputSettings28 = outputSettings0.clone();
        org.jsoup.nodes.Document.OutputSettings outputSettings29 = new org.jsoup.nodes.Document.OutputSettings();
        boolean boolean30 = outputSettings29.prettyPrint();
        org.jsoup.nodes.Document.OutputSettings outputSettings32 = outputSettings29.prettyPrint(true);
        java.nio.charset.Charset charset33 = outputSettings29.charset();
        org.jsoup.nodes.Document.OutputSettings outputSettings35 = outputSettings29.forceAllElementAsBlock(false);
        org.jsoup.nodes.Entities.EscapeMode escapeMode36 = outputSettings29.escapeMode();
        org.jsoup.nodes.Document.OutputSettings outputSettings37 = outputSettings0.escapeMode(escapeMode36);
        boolean boolean38 = outputSettings37.prettyPrint();
        org.jsoup.nodes.Document.OutputSettings outputSettings40 = outputSettings37.indentAmount(10);
        org.jsoup.nodes.Document.OutputSettings outputSettings42 = outputSettings40.prettyPrint(true);
        org.jsoup.nodes.Entities.EscapeMode escapeMode43 = outputSettings40.escapeMode();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertNotNull(outputSettings3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + escapeMode6 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode6.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertNotNull(outputSettings9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + escapeMode12 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode12.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertNotNull(outputSettings13);
        org.junit.Assert.assertNotNull(outputSettings14);
        org.junit.Assert.assertTrue("'" + escapeMode15 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode15.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertNotNull(outputSettings16);
        org.junit.Assert.assertNotNull(outputSettings17);
        org.junit.Assert.assertNotNull(outputSettings20);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1 + "'", int21 == 1);
        org.junit.Assert.assertNotNull(outputSettings23);
        org.junit.Assert.assertNotNull(outputSettings25);
        org.junit.Assert.assertNotNull(charset26);
        org.junit.Assert.assertNotNull(outputSettings27);
        org.junit.Assert.assertNotNull(outputSettings28);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertNotNull(outputSettings32);
        org.junit.Assert.assertNotNull(charset33);
        org.junit.Assert.assertNotNull(outputSettings35);
        org.junit.Assert.assertTrue("'" + escapeMode36 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode36.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertNotNull(outputSettings37);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + true + "'", boolean38 == true);
        org.junit.Assert.assertNotNull(outputSettings40);
        org.junit.Assert.assertNotNull(outputSettings42);
        org.junit.Assert.assertTrue("'" + escapeMode43 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode43.equals(org.jsoup.nodes.Entities.EscapeMode.base));
    }

    @Test
    public void test20601() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20601");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("i!", "hi!");
        org.jsoup.nodes.TextNode textNode4 = textNode2.text("");
        java.lang.String str5 = textNode4.baseUri();
        java.util.List<org.jsoup.nodes.Node> nodeList6 = textNode4.childNodes();
        boolean boolean8 = textNode4.hasAttr("#text");
        java.lang.String str9 = textNode4.toString();
        org.junit.Assert.assertNotNull(textNode4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertNotNull(nodeList6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
    }

    @Test
    public void test20602() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20602");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("h", "#text");
        org.jsoup.nodes.Document document3 = textNode2.ownerDocument();
        java.lang.String str4 = textNode2.text();
        java.util.List<org.jsoup.nodes.Node> nodeList5 = textNode2.childNodes();
        org.junit.Assert.assertNull(document3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "h" + "'", str4, "h");
        org.junit.Assert.assertNotNull(nodeList5);
    }

    @Test
    public void test20603() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20603");
        org.jsoup.nodes.Document.OutputSettings outputSettings0 = new org.jsoup.nodes.Document.OutputSettings();
        boolean boolean1 = outputSettings0.prettyPrint();
        org.jsoup.nodes.Document.OutputSettings outputSettings3 = outputSettings0.prettyPrint(true);
        java.nio.charset.Charset charset4 = outputSettings0.charset();
        org.jsoup.nodes.Document.OutputSettings outputSettings6 = outputSettings0.forceAllElementAsBlock(false);
        org.jsoup.nodes.Document.OutputSettings outputSettings8 = outputSettings6.indentAmount((int) ' ');
        org.jsoup.nodes.Document.OutputSettings outputSettings9 = outputSettings6.clone();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertNotNull(outputSettings3);
        org.junit.Assert.assertNotNull(charset4);
        org.junit.Assert.assertNotNull(outputSettings6);
        org.junit.Assert.assertNotNull(outputSettings8);
        org.junit.Assert.assertNotNull(outputSettings9);
    }

    @Test
    public void test20604() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20604");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("hi!", "hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList3 = textNode2.siblingNodes();
        java.lang.String str4 = textNode2.toString();
        org.junit.Assert.assertNotNull(textNode2);
        org.junit.Assert.assertNotNull(nodeList3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
    }

    @Test
    public void test20605() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20605");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("", "");
        boolean boolean3 = textNode2.isBlank();
        org.jsoup.nodes.Node node4 = textNode2.clone();
        java.lang.String str5 = textNode2.outerHtml();
        org.jsoup.nodes.Attributes attributes6 = textNode2.attributes();
        org.jsoup.nodes.Document document7 = textNode2.ownerDocument();
        org.jsoup.nodes.TextNode textNode10 = org.jsoup.nodes.TextNode.createFromEncoded("", "");
        boolean boolean11 = textNode10.isBlank();
        org.jsoup.nodes.Node node14 = textNode10.attr("hi!", "hi!");
        boolean boolean16 = textNode10.equals((java.lang.Object) true);
        textNode10.setBaseUri("");
        org.jsoup.nodes.TextNode textNode21 = org.jsoup.nodes.TextNode.createFromEncoded("", "");
        java.lang.String str22 = textNode21.getWholeText();
        java.lang.String str23 = textNode21.outerHtml();
        java.util.List<org.jsoup.nodes.Node> nodeList24 = textNode21.siblingNodes();
        int int25 = textNode21.siblingIndex();
        boolean boolean26 = textNode10.equals((java.lang.Object) textNode21);
        textNode21.setBaseUri("#text");
        org.jsoup.nodes.TextNode textNode31 = org.jsoup.nodes.TextNode.createFromEncoded("i!", "i!");
        boolean boolean32 = textNode21.equals((java.lang.Object) textNode31);
        java.lang.String str33 = textNode31.outerHtml();
        org.jsoup.nodes.Attributes attributes34 = textNode31.attributes();
        boolean boolean35 = textNode2.equals((java.lang.Object) textNode31);
        org.jsoup.nodes.TextNode textNode38 = org.jsoup.nodes.TextNode.createFromEncoded("", "");
        java.lang.String str39 = textNode38.nodeName();
        org.jsoup.nodes.Node node40 = textNode38.nextSibling();
        org.jsoup.nodes.TextNode textNode42 = textNode38.text("hi!");
        boolean boolean44 = textNode38.hasAttr("#text");
        org.jsoup.nodes.Node node45 = textNode38.nextSibling();
        org.jsoup.nodes.TextNode textNode47 = textNode38.text("");
        org.jsoup.nodes.Node node50 = textNode38.attr("i!", "");
        boolean boolean51 = textNode31.equals((java.lang.Object) textNode38);
        java.lang.String str52 = textNode38.nodeName();
        org.junit.Assert.assertNotNull(textNode2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(node4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(attributes6);
        org.junit.Assert.assertNull(document7);
        org.junit.Assert.assertNotNull(textNode10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(node14);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(textNode21);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
        org.junit.Assert.assertNotNull(nodeList24);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNotNull(textNode31);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "i!" + "'", str33, "i!");
        org.junit.Assert.assertNotNull(attributes34);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertNotNull(textNode38);
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "#text" + "'", str39, "#text");
        org.junit.Assert.assertNull(node40);
        org.junit.Assert.assertNotNull(textNode42);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertNull(node45);
        org.junit.Assert.assertNotNull(textNode47);
        org.junit.Assert.assertNotNull(node50);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
        org.junit.Assert.assertEquals("'" + str52 + "' != '" + "#text" + "'", str52, "#text");
    }

    @Test
    public void test20606() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20606");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("", "");
        java.lang.String str3 = textNode2.toString();
        java.util.List<org.jsoup.nodes.Node> nodeList4 = textNode2.childNodes();
        org.jsoup.nodes.Node node6 = textNode2.removeAttr("hi!");
        boolean boolean8 = textNode2.hasAttr("i!");
        org.jsoup.nodes.Node node10 = textNode2.removeAttr("#text");
        java.lang.String str11 = textNode2.baseUri();
        org.jsoup.nodes.TextNode textNode13 = textNode2.text("hi!");
        java.lang.String str14 = textNode2.baseUri();
        java.lang.String str15 = textNode2.getWholeText();
        org.junit.Assert.assertNotNull(textNode2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertNotNull(nodeList4);
        org.junit.Assert.assertNotNull(node6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(node10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNotNull(textNode13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
    }

    @Test
    public void test20607() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20607");
        org.jsoup.nodes.Document.OutputSettings outputSettings0 = new org.jsoup.nodes.Document.OutputSettings();
        boolean boolean1 = outputSettings0.prettyPrint();
        org.jsoup.nodes.Document.OutputSettings outputSettings3 = outputSettings0.prettyPrint(true);
        org.jsoup.nodes.Document.OutputSettings outputSettings4 = new org.jsoup.nodes.Document.OutputSettings();
        boolean boolean5 = outputSettings4.prettyPrint();
        org.jsoup.nodes.Entities.EscapeMode escapeMode6 = outputSettings4.escapeMode();
        int int7 = outputSettings4.indentAmount();
        org.jsoup.nodes.Document.OutputSettings outputSettings9 = outputSettings4.prettyPrint(false);
        org.jsoup.nodes.Document.OutputSettings outputSettings10 = new org.jsoup.nodes.Document.OutputSettings();
        boolean boolean11 = outputSettings10.prettyPrint();
        org.jsoup.nodes.Entities.EscapeMode escapeMode12 = outputSettings10.escapeMode();
        org.jsoup.nodes.Document.OutputSettings outputSettings13 = outputSettings9.escapeMode(escapeMode12);
        org.jsoup.nodes.Document.OutputSettings outputSettings14 = outputSettings0.escapeMode(escapeMode12);
        org.jsoup.nodes.Entities.EscapeMode escapeMode15 = outputSettings0.escapeMode();
        org.jsoup.nodes.Document.OutputSettings outputSettings16 = outputSettings0.clone();
        boolean boolean17 = outputSettings16.prettyPrint();
        org.jsoup.nodes.Document.OutputSettings outputSettings19 = outputSettings16.prettyPrint(true);
        org.jsoup.nodes.Entities.EscapeMode escapeMode20 = outputSettings19.escapeMode();
        boolean boolean21 = outputSettings19.forceAllElementAsBlock();
        int int22 = outputSettings19.indentAmount();
        org.jsoup.nodes.Document.OutputSettings outputSettings23 = outputSettings19.clone();
        org.jsoup.nodes.Document.OutputSettings outputSettings25 = outputSettings23.forceAllElementAsBlock(false);
        org.jsoup.nodes.Document.OutputSettings outputSettings26 = new org.jsoup.nodes.Document.OutputSettings();
        boolean boolean27 = outputSettings26.prettyPrint();
        org.jsoup.nodes.Document.OutputSettings outputSettings29 = outputSettings26.prettyPrint(true);
        org.jsoup.nodes.Document.OutputSettings outputSettings31 = outputSettings29.indentAmount((int) ' ');
        boolean boolean32 = outputSettings31.prettyPrint();
        org.jsoup.nodes.Document.OutputSettings outputSettings33 = outputSettings31.clone();
        int int34 = outputSettings33.indentAmount();
        org.jsoup.nodes.Document.OutputSettings outputSettings36 = outputSettings33.prettyPrint(true);
        java.nio.charset.Charset charset37 = outputSettings36.charset();
        org.jsoup.nodes.Document.OutputSettings outputSettings38 = outputSettings25.charset(charset37);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertNotNull(outputSettings3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + escapeMode6 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode6.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertNotNull(outputSettings9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + escapeMode12 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode12.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertNotNull(outputSettings13);
        org.junit.Assert.assertNotNull(outputSettings14);
        org.junit.Assert.assertTrue("'" + escapeMode15 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode15.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertNotNull(outputSettings16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertNotNull(outputSettings19);
        org.junit.Assert.assertTrue("'" + escapeMode20 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode20.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 1 + "'", int22 == 1);
        org.junit.Assert.assertNotNull(outputSettings23);
        org.junit.Assert.assertNotNull(outputSettings25);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertNotNull(outputSettings29);
        org.junit.Assert.assertNotNull(outputSettings31);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + true + "'", boolean32 == true);
        org.junit.Assert.assertNotNull(outputSettings33);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 32 + "'", int34 == 32);
        org.junit.Assert.assertNotNull(outputSettings36);
        org.junit.Assert.assertNotNull(charset37);
        org.junit.Assert.assertNotNull(outputSettings38);
    }

    @Test
    public void test20608() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20608");
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
        int int30 = textNode29.siblingIndex();
        org.junit.Assert.assertNotNull(textNode2);
        org.junit.Assert.assertNotNull(textNode4);
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNotNull(textNode10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(textNode15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertNotNull(nodeList17);
        org.junit.Assert.assertNotNull(node19);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertNotNull(textNode23);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "" + "'", str24, "");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "i!" + "'", str25, "i!");
        org.junit.Assert.assertNotNull(textNode27);
        org.junit.Assert.assertNotNull(textNode29);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
    }

    @Test
    public void test20609() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20609");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("", "");
        boolean boolean3 = textNode2.isBlank();
        org.jsoup.nodes.Node node6 = textNode2.attr("hi!", "hi!");
        boolean boolean8 = textNode2.equals((java.lang.Object) true);
        textNode2.setBaseUri("");
        java.util.List<org.jsoup.nodes.Node> nodeList11 = textNode2.siblingNodes();
        boolean boolean12 = textNode2.isBlank();
        org.jsoup.nodes.Node node13 = textNode2.clone();
        java.lang.String str14 = textNode2.toString();
        java.lang.String str16 = textNode2.attr("h");
        java.lang.Class<?> wildcardClass17 = textNode2.getClass();
        org.junit.Assert.assertNotNull(textNode2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(node6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(nodeList11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(node13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test20610() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20610");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("", "");
        java.lang.String str3 = textNode2.text();
        org.jsoup.nodes.Node node5 = textNode2.removeAttr("i!");
        java.lang.String str6 = textNode2.outerHtml();
        java.lang.String str8 = textNode2.absUrl("#text");
        org.jsoup.nodes.Node node9 = textNode2.clone();
        java.lang.String str10 = textNode2.baseUri();
        boolean boolean12 = textNode2.hasAttr("");
        org.jsoup.nodes.Attributes attributes13 = textNode2.attributes();
        java.lang.String str15 = textNode2.absUrl("text");
        java.lang.String str16 = textNode2.nodeName();
        org.junit.Assert.assertNotNull(textNode2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertNotNull(node5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNotNull(node9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(attributes13);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "#text" + "'", str16, "#text");
    }

    @Test
    public void test20611() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20611");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("", "");
        java.lang.String str3 = textNode2.getWholeText();
        java.lang.String str4 = textNode2.baseUri();
        int int5 = textNode2.siblingIndex();
        boolean boolean7 = textNode2.hasAttr("");
        java.lang.String str8 = textNode2.toString();
        org.jsoup.nodes.Node node10 = textNode2.removeAttr("i!");
        java.lang.String str11 = textNode2.baseUri();
        org.jsoup.nodes.TextNode textNode13 = textNode2.text("");
        java.util.List<org.jsoup.nodes.Node> nodeList14 = textNode2.siblingNodes();
        org.jsoup.nodes.TextNode textNode17 = org.jsoup.nodes.TextNode.createFromEncoded("", "");
        java.lang.String str18 = textNode17.baseUri();
        boolean boolean20 = textNode17.hasAttr("#text");
        java.lang.String str22 = textNode17.attr("");
        boolean boolean24 = textNode17.hasAttr("#text");
        java.lang.String str25 = textNode17.text();
        java.lang.String str27 = textNode17.absUrl("h");
        java.lang.String str28 = textNode17.text();
        boolean boolean29 = textNode2.equals((java.lang.Object) textNode17);
        org.junit.Assert.assertNotNull(textNode2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNotNull(node10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNotNull(textNode13);
        org.junit.Assert.assertNotNull(nodeList14);
        org.junit.Assert.assertNotNull(textNode17);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "" + "'", str25, "");
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "" + "'", str27, "");
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "" + "'", str28, "");
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
    }

    @Test
    public void test20612() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20612");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("", "");
        boolean boolean3 = textNode2.isBlank();
        org.jsoup.nodes.Document.OutputSettings outputSettings4 = new org.jsoup.nodes.Document.OutputSettings();
        boolean boolean5 = outputSettings4.prettyPrint();
        boolean boolean6 = textNode2.equals((java.lang.Object) boolean5);
        java.lang.String str7 = textNode2.outerHtml();
        org.jsoup.nodes.Document document8 = textNode2.ownerDocument();
        java.lang.String str10 = textNode2.attr("hi!");
        java.lang.String str11 = textNode2.baseUri();
        boolean boolean12 = textNode2.isBlank();
        org.jsoup.nodes.Document.OutputSettings outputSettings13 = new org.jsoup.nodes.Document.OutputSettings();
        int int14 = outputSettings13.indentAmount();
        org.jsoup.nodes.Document.OutputSettings outputSettings16 = outputSettings13.forceAllElementAsBlock(true);
        org.jsoup.nodes.Document.OutputSettings outputSettings18 = outputSettings13.prettyPrint(true);
        java.nio.charset.Charset charset19 = outputSettings13.charset();
        org.jsoup.nodes.Document.OutputSettings outputSettings21 = outputSettings13.prettyPrint(false);
        org.jsoup.nodes.Document.OutputSettings outputSettings23 = outputSettings21.forceAllElementAsBlock(false);
        boolean boolean24 = textNode2.equals((java.lang.Object) outputSettings23);
        java.lang.String str25 = textNode2.outerHtml();
        org.jsoup.nodes.Node node26 = textNode2.clone();
        java.lang.String str28 = textNode2.absUrl("text");
        org.junit.Assert.assertNotNull(textNode2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNull(document8);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertNotNull(outputSettings16);
        org.junit.Assert.assertNotNull(outputSettings18);
        org.junit.Assert.assertNotNull(charset19);
        org.junit.Assert.assertNotNull(outputSettings21);
        org.junit.Assert.assertNotNull(outputSettings23);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "" + "'", str25, "");
        org.junit.Assert.assertNotNull(node26);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "" + "'", str28, "");
    }

    @Test
    public void test20613() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20613");
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
        org.jsoup.nodes.Attributes attributes17 = textNode6.attributes();
        java.util.List<org.jsoup.nodes.Node> nodeList18 = textNode6.siblingNodes();
        org.jsoup.nodes.Node node19 = textNode6.clone();
        int int20 = node19.siblingIndex();
        org.junit.Assert.assertNotNull(textNode2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(textNode6);
        org.junit.Assert.assertNotNull(node7);
        org.junit.Assert.assertNotNull(node9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNotNull(node13);
        org.junit.Assert.assertNull(document14);
        org.junit.Assert.assertNotNull(node16);
        org.junit.Assert.assertNotNull(attributes17);
        org.junit.Assert.assertNotNull(nodeList18);
        org.junit.Assert.assertNotNull(node19);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
    }

    @Test
    public void test20614() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20614");
        org.jsoup.nodes.Document.OutputSettings outputSettings0 = new org.jsoup.nodes.Document.OutputSettings();
        boolean boolean1 = outputSettings0.prettyPrint();
        org.jsoup.nodes.Entities.EscapeMode escapeMode2 = outputSettings0.escapeMode();
        boolean boolean3 = outputSettings0.forceAllElementAsBlock();
        org.jsoup.nodes.Document.OutputSettings outputSettings5 = outputSettings0.forceAllElementAsBlock(true);
        org.jsoup.nodes.Entities.EscapeMode escapeMode6 = outputSettings5.escapeMode();
        org.jsoup.nodes.Document.OutputSettings outputSettings7 = outputSettings5.clone();
        org.jsoup.nodes.Document.OutputSettings outputSettings9 = outputSettings5.prettyPrint(true);
        org.jsoup.nodes.Document.OutputSettings outputSettings11 = outputSettings9.forceAllElementAsBlock(true);
        boolean boolean12 = outputSettings11.forceAllElementAsBlock();
        org.jsoup.nodes.Document.OutputSettings outputSettings13 = outputSettings11.clone();
        org.jsoup.nodes.Document.OutputSettings outputSettings15 = outputSettings13.prettyPrint(true);
        org.jsoup.nodes.Document.OutputSettings outputSettings16 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Entities.EscapeMode escapeMode17 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings18 = outputSettings16.escapeMode(escapeMode17);
        boolean boolean19 = outputSettings16.forceAllElementAsBlock();
        org.jsoup.nodes.Document.OutputSettings outputSettings20 = new org.jsoup.nodes.Document.OutputSettings();
        boolean boolean21 = outputSettings20.prettyPrint();
        org.jsoup.nodes.Entities.EscapeMode escapeMode22 = outputSettings20.escapeMode();
        org.jsoup.nodes.Document.OutputSettings outputSettings23 = outputSettings16.escapeMode(escapeMode22);
        org.jsoup.nodes.Document.OutputSettings outputSettings24 = outputSettings15.escapeMode(escapeMode22);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + escapeMode2 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode2.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(outputSettings5);
        org.junit.Assert.assertTrue("'" + escapeMode6 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode6.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertNotNull(outputSettings7);
        org.junit.Assert.assertNotNull(outputSettings9);
        org.junit.Assert.assertNotNull(outputSettings11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(outputSettings13);
        org.junit.Assert.assertNotNull(outputSettings15);
        org.junit.Assert.assertNotNull(outputSettings18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertTrue("'" + escapeMode22 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode22.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertNotNull(outputSettings23);
        org.junit.Assert.assertNotNull(outputSettings24);
    }

    @Test
    public void test20615() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20615");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("", "");
        java.lang.String str3 = textNode2.getWholeText();
        java.lang.String str4 = textNode2.baseUri();
        org.jsoup.nodes.TextNode textNode6 = textNode2.text("hi!");
        java.lang.String str7 = textNode2.baseUri();
        org.jsoup.nodes.Node node8 = textNode2.parent();
        org.jsoup.nodes.Node node11 = textNode2.attr("#text", "hi!");
        java.lang.String str12 = textNode2.text();
        textNode2.setBaseUri("#text");
        org.junit.Assert.assertNotNull(textNode2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(textNode6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNull(node8);
        org.junit.Assert.assertNotNull(node11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
    }

    @Test
    public void test20616() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20616");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("", "");
        boolean boolean3 = textNode2.isBlank();
        org.jsoup.nodes.Node node6 = textNode2.attr("hi!", "hi!");
        org.jsoup.nodes.Document document7 = textNode2.ownerDocument();
        org.jsoup.nodes.TextNode textNode9 = textNode2.text("hi!");
        java.lang.String str10 = textNode9.nodeName();
        java.lang.String str12 = textNode9.absUrl("i!");
        org.jsoup.nodes.Node node15 = textNode9.attr("i!", "#text");
        org.jsoup.nodes.Node node16 = node15.nextSibling();
        java.lang.Class<?> wildcardClass17 = node15.getClass();
        org.junit.Assert.assertNotNull(textNode2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(node6);
        org.junit.Assert.assertNull(document7);
        org.junit.Assert.assertNotNull(textNode9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "#text" + "'", str10, "#text");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertNotNull(node15);
        org.junit.Assert.assertNull(node16);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test20617() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20617");
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
        java.lang.String str23 = textNode2.attr("hi!");
        org.jsoup.select.NodeVisitor nodeVisitor24 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node25 = textNode2.traverse(nodeVisitor24);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(textNode2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(node6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(textNode13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertNotNull(nodeList16);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "hi!" + "'", str23, "hi!");
    }

    @Test
    public void test20618() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20618");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("", "");
        java.lang.String str3 = textNode2.getWholeText();
        java.lang.String str4 = textNode2.baseUri();
        org.jsoup.nodes.TextNode textNode6 = textNode2.text("hi!");
        org.jsoup.nodes.Node node7 = textNode6.clone();
        org.jsoup.nodes.Node node9 = textNode6.removeAttr("hi!");
        java.lang.String str10 = textNode6.toString();
        java.util.List<org.jsoup.nodes.Node> nodeList11 = textNode6.siblingNodes();
        org.jsoup.nodes.TextNode textNode13 = textNode6.splitText((int) (short) 0);
        org.jsoup.nodes.Node node16 = textNode13.attr("hi!", "#text");
        java.lang.String str17 = node16.outerHtml();
        java.lang.String str18 = node16.outerHtml();
        org.jsoup.nodes.Node node19 = node16.clone();
        org.jsoup.nodes.TextNode textNode22 = new org.jsoup.nodes.TextNode("hi!", "hi!");
        boolean boolean24 = textNode22.hasAttr("hi!");
        org.jsoup.nodes.Document document25 = textNode22.ownerDocument();
        org.jsoup.nodes.TextNode textNode27 = textNode22.text("hi!");
        boolean boolean28 = node19.equals((java.lang.Object) textNode22);
        java.util.List<org.jsoup.nodes.Node> nodeList29 = node19.siblingNodes();
        org.junit.Assert.assertNotNull(textNode2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(textNode6);
        org.junit.Assert.assertNotNull(node7);
        org.junit.Assert.assertNotNull(node9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertNotNull(nodeList11);
        org.junit.Assert.assertNotNull(textNode13);
        org.junit.Assert.assertNotNull(node16);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!" + "'", str18, "hi!");
        org.junit.Assert.assertNotNull(node19);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNull(document25);
        org.junit.Assert.assertNotNull(textNode27);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertNotNull(nodeList29);
    }

    @Test
    public void test20619() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20619");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("hi!", "hi!");
        boolean boolean3 = textNode2.isBlank();
        org.jsoup.nodes.Node node4 = textNode2.clone();
        org.jsoup.nodes.TextNode textNode6 = textNode2.text("i!");
        org.jsoup.nodes.Node node7 = textNode6.previousSibling();
        org.jsoup.nodes.TextNode textNode9 = textNode6.text("#text");
        java.lang.String str10 = textNode6.outerHtml();
        java.lang.String str11 = textNode6.text();
        java.lang.String str12 = textNode6.nodeName();
        java.util.List<org.jsoup.nodes.Node> nodeList13 = textNode6.childNodes();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(node4);
        org.junit.Assert.assertNotNull(textNode6);
        org.junit.Assert.assertNull(node7);
        org.junit.Assert.assertNotNull(textNode9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "#text" + "'", str10, "#text");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "#text" + "'", str11, "#text");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "#text" + "'", str12, "#text");
        org.junit.Assert.assertNotNull(nodeList13);
    }

    @Test
    public void test20620() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20620");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("", "");
        org.jsoup.nodes.TextNode textNode4 = textNode2.text("");
        org.jsoup.nodes.Node node5 = textNode2.previousSibling();
        org.jsoup.nodes.Node node6 = textNode2.parent();
        org.jsoup.nodes.Attributes attributes7 = textNode2.attributes();
        org.jsoup.nodes.Node node8 = textNode2.clone();
        org.jsoup.nodes.Node node9 = textNode2.nextSibling();
        boolean boolean10 = textNode2.isBlank();
        org.jsoup.nodes.Node node13 = textNode2.attr("hi!", "");
        org.jsoup.nodes.TextNode textNode15 = textNode2.text("h");
        org.jsoup.nodes.TextNode textNode17 = textNode2.text("h");
        org.jsoup.nodes.Node node19 = textNode2.removeAttr("text");
        org.jsoup.select.NodeVisitor nodeVisitor20 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node21 = textNode2.traverse(nodeVisitor20);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(textNode2);
        org.junit.Assert.assertNotNull(textNode4);
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertNull(node6);
        org.junit.Assert.assertNotNull(attributes7);
        org.junit.Assert.assertNotNull(node8);
        org.junit.Assert.assertNull(node9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(node13);
        org.junit.Assert.assertNotNull(textNode15);
        org.junit.Assert.assertNotNull(textNode17);
        org.junit.Assert.assertNotNull(node19);
    }

    @Test
    public void test20621() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20621");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("", "");
        boolean boolean3 = textNode2.isBlank();
        org.jsoup.nodes.Node node6 = textNode2.attr("hi!", "hi!");
        org.jsoup.nodes.TextNode textNode8 = textNode2.text("");
        org.jsoup.nodes.TextNode textNode10 = textNode8.text("i!");
        int int11 = textNode8.siblingIndex();
        org.jsoup.nodes.Node node12 = textNode8.nextSibling();
        org.junit.Assert.assertNotNull(textNode2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(node6);
        org.junit.Assert.assertNotNull(textNode8);
        org.junit.Assert.assertNotNull(textNode10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNull(node12);
    }

    @Test
    public void test20622() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20622");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("", "");
        java.lang.String str3 = textNode2.getWholeText();
        java.lang.String str4 = textNode2.baseUri();
        org.jsoup.nodes.TextNode textNode6 = textNode2.text("hi!");
        java.lang.String str7 = textNode2.baseUri();
        java.lang.String str8 = textNode2.getWholeText();
        org.jsoup.nodes.TextNode textNode10 = textNode2.text("hi!");
        java.lang.String str12 = textNode2.attr("i!");
        org.jsoup.nodes.Node node14 = textNode2.removeAttr("hi!");
        org.jsoup.nodes.TextNode textNode16 = textNode2.text("hi!");
        org.jsoup.nodes.Node node18 = textNode16.removeAttr("#text");
        int int19 = node18.siblingIndex();
        org.junit.Assert.assertNotNull(textNode2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(textNode6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertNotNull(textNode10);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertNotNull(node14);
        org.junit.Assert.assertNotNull(textNode16);
        org.junit.Assert.assertNotNull(node18);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
    }

    @Test
    public void test20623() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20623");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("", "");
        java.lang.String str3 = textNode2.getWholeText();
        java.lang.String str4 = textNode2.outerHtml();
        java.util.List<org.jsoup.nodes.Node> nodeList5 = textNode2.siblingNodes();
        int int6 = textNode2.siblingIndex();
        java.lang.String str7 = textNode2.outerHtml();
        org.jsoup.nodes.TextNode textNode10 = org.jsoup.nodes.TextNode.createFromEncoded("", "");
        boolean boolean11 = textNode10.isBlank();
        org.jsoup.nodes.Node node14 = textNode10.attr("hi!", "hi!");
        org.jsoup.nodes.TextNode textNode16 = textNode10.text("");
        org.jsoup.nodes.Document.OutputSettings outputSettings17 = new org.jsoup.nodes.Document.OutputSettings();
        int int18 = outputSettings17.indentAmount();
        org.jsoup.nodes.Document.OutputSettings outputSettings20 = outputSettings17.forceAllElementAsBlock(true);
        boolean boolean21 = outputSettings17.forceAllElementAsBlock();
        org.jsoup.nodes.Document.OutputSettings outputSettings22 = new org.jsoup.nodes.Document.OutputSettings();
        boolean boolean23 = outputSettings22.prettyPrint();
        org.jsoup.nodes.Entities.EscapeMode escapeMode24 = outputSettings22.escapeMode();
        int int25 = outputSettings22.indentAmount();
        org.jsoup.nodes.Document.OutputSettings outputSettings27 = outputSettings22.prettyPrint(false);
        java.nio.charset.Charset charset28 = outputSettings27.charset();
        org.jsoup.nodes.Document.OutputSettings outputSettings29 = outputSettings17.charset(charset28);
        boolean boolean30 = textNode10.equals((java.lang.Object) outputSettings17);
        org.jsoup.nodes.Entities.EscapeMode escapeMode31 = outputSettings17.escapeMode();
        boolean boolean32 = textNode2.equals((java.lang.Object) escapeMode31);
        java.lang.String str34 = textNode2.absUrl("i!");
        org.jsoup.nodes.TextNode textNode37 = new org.jsoup.nodes.TextNode("hi!", "hi!");
        java.lang.String str39 = textNode37.absUrl("hi!");
        java.lang.String str41 = textNode37.absUrl("hi!");
        java.lang.String str43 = textNode37.absUrl("#text");
        java.util.List<org.jsoup.nodes.Node> nodeList44 = textNode37.childNodes();
        boolean boolean46 = textNode37.hasAttr("");
        java.lang.String str48 = textNode37.attr("#text");
        boolean boolean49 = textNode2.equals((java.lang.Object) textNode37);
        org.junit.Assert.assertNotNull(textNode2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(nodeList5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNotNull(textNode10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(node14);
        org.junit.Assert.assertNotNull(textNode16);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertNotNull(outputSettings20);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + escapeMode24 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode24.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 1 + "'", int25 == 1);
        org.junit.Assert.assertNotNull(outputSettings27);
        org.junit.Assert.assertNotNull(charset28);
        org.junit.Assert.assertNotNull(outputSettings29);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + escapeMode31 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode31.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "" + "'", str34, "");
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "" + "'", str39, "");
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "" + "'", str41, "");
        org.junit.Assert.assertEquals("'" + str43 + "' != '" + "" + "'", str43, "");
        org.junit.Assert.assertNotNull(nodeList44);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertEquals("'" + str48 + "' != '" + "" + "'", str48, "");
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
    }

    @Test
    public void test20624() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20624");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("", "");
        java.lang.String str3 = textNode2.getWholeText();
        java.lang.String str4 = textNode2.baseUri();
        org.jsoup.nodes.TextNode textNode6 = textNode2.text("hi!");
        org.jsoup.nodes.Node node7 = textNode6.clone();
        org.jsoup.nodes.Node node9 = textNode6.removeAttr("hi!");
        boolean boolean10 = textNode6.isBlank();
        org.jsoup.nodes.Node node13 = textNode6.attr("hi!", "");
        java.lang.String str15 = textNode6.attr("");
        java.lang.String str16 = textNode6.baseUri();
        java.lang.String str17 = textNode6.text();
        org.jsoup.nodes.TextNode textNode20 = new org.jsoup.nodes.TextNode("i!", "hi!");
        org.jsoup.nodes.TextNode textNode22 = textNode20.text("");
        org.jsoup.nodes.Node node23 = textNode22.parent();
        java.lang.String str24 = textNode22.nodeName();
        // The following exception was thrown during execution in test generation
        try {
            textNode6.replaceWith((org.jsoup.nodes.Node) textNode22);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(textNode2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(textNode6);
        org.junit.Assert.assertNotNull(node7);
        org.junit.Assert.assertNotNull(node9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(node13);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
        org.junit.Assert.assertNotNull(textNode22);
        org.junit.Assert.assertNull(node23);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "#text" + "'", str24, "#text");
    }

    @Test
    public void test20625() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20625");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("", "");
        java.lang.String str3 = textNode2.toString();
        int int4 = textNode2.siblingIndex();
        java.lang.String str5 = textNode2.nodeName();
        java.lang.String str6 = textNode2.text();
        org.jsoup.nodes.Node node7 = textNode2.clone();
        java.lang.String str9 = textNode2.absUrl("text");
        org.junit.Assert.assertNotNull(textNode2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "#text" + "'", str5, "#text");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(node7);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
    }

    @Test
    public void test20626() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20626");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("hi!", "hi!");
        boolean boolean4 = textNode2.hasAttr("hi!");
        java.lang.String str5 = textNode2.getWholeText();
        java.lang.String str6 = textNode2.text();
        org.jsoup.nodes.TextNode textNode8 = textNode2.text("i!");
        java.lang.String str9 = textNode2.outerHtml();
        textNode2.setBaseUri("");
        org.jsoup.nodes.Node node12 = textNode2.nextSibling();
        int int13 = textNode2.siblingIndex();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertNotNull(textNode8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "i!" + "'", str9, "i!");
        org.junit.Assert.assertNull(node12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
    }

    @Test
    public void test20627() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20627");
        org.jsoup.nodes.Document.OutputSettings outputSettings0 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Entities.EscapeMode escapeMode1 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings2 = outputSettings0.escapeMode(escapeMode1);
        org.jsoup.nodes.Document.OutputSettings outputSettings4 = outputSettings0.forceAllElementAsBlock(false);
        boolean boolean5 = outputSettings4.forceAllElementAsBlock();
        org.jsoup.nodes.Entities.EscapeMode escapeMode6 = outputSettings4.escapeMode();
        org.jsoup.nodes.Document.OutputSettings outputSettings8 = outputSettings4.indentAmount((int) (short) 10);
        org.jsoup.nodes.Document.OutputSettings outputSettings9 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Entities.EscapeMode escapeMode10 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings11 = outputSettings9.escapeMode(escapeMode10);
        org.jsoup.nodes.Document.OutputSettings outputSettings13 = outputSettings11.prettyPrint(false);
        org.jsoup.nodes.Document.OutputSettings outputSettings15 = outputSettings11.indentAmount((int) ' ');
        org.jsoup.nodes.Document.OutputSettings outputSettings16 = new org.jsoup.nodes.Document.OutputSettings();
        boolean boolean17 = outputSettings16.prettyPrint();
        org.jsoup.nodes.Entities.EscapeMode escapeMode18 = outputSettings16.escapeMode();
        boolean boolean19 = outputSettings16.forceAllElementAsBlock();
        org.jsoup.nodes.Document.OutputSettings outputSettings20 = new org.jsoup.nodes.Document.OutputSettings();
        boolean boolean21 = outputSettings20.prettyPrint();
        org.jsoup.nodes.Entities.EscapeMode escapeMode22 = outputSettings20.escapeMode();
        org.jsoup.nodes.Document.OutputSettings outputSettings23 = outputSettings16.escapeMode(escapeMode22);
        org.jsoup.nodes.Document.OutputSettings outputSettings24 = outputSettings11.escapeMode(escapeMode22);
        org.jsoup.nodes.Document.OutputSettings outputSettings25 = outputSettings8.escapeMode(escapeMode22);
        org.jsoup.nodes.Document.OutputSettings outputSettings27 = outputSettings25.prettyPrint(false);
        boolean boolean28 = outputSettings25.forceAllElementAsBlock();
        org.jsoup.nodes.Document.OutputSettings outputSettings30 = outputSettings25.forceAllElementAsBlock(true);
        org.jsoup.nodes.Document.OutputSettings outputSettings32 = outputSettings30.indentAmount((int) ' ');
        boolean boolean33 = outputSettings30.forceAllElementAsBlock();
        org.jsoup.nodes.Document.OutputSettings outputSettings34 = new org.jsoup.nodes.Document.OutputSettings();
        boolean boolean35 = outputSettings34.prettyPrint();
        org.jsoup.nodes.Document.OutputSettings outputSettings37 = outputSettings34.prettyPrint(true);
        java.nio.charset.Charset charset38 = outputSettings34.charset();
        org.jsoup.nodes.Document.OutputSettings outputSettings39 = new org.jsoup.nodes.Document.OutputSettings();
        boolean boolean40 = outputSettings39.prettyPrint();
        org.jsoup.nodes.Document.OutputSettings outputSettings42 = outputSettings39.prettyPrint(true);
        org.jsoup.nodes.Document.OutputSettings outputSettings43 = new org.jsoup.nodes.Document.OutputSettings();
        boolean boolean44 = outputSettings43.prettyPrint();
        org.jsoup.nodes.Entities.EscapeMode escapeMode45 = outputSettings43.escapeMode();
        int int46 = outputSettings43.indentAmount();
        org.jsoup.nodes.Document.OutputSettings outputSettings48 = outputSettings43.prettyPrint(false);
        org.jsoup.nodes.Document.OutputSettings outputSettings49 = new org.jsoup.nodes.Document.OutputSettings();
        boolean boolean50 = outputSettings49.prettyPrint();
        org.jsoup.nodes.Entities.EscapeMode escapeMode51 = outputSettings49.escapeMode();
        org.jsoup.nodes.Document.OutputSettings outputSettings52 = outputSettings48.escapeMode(escapeMode51);
        org.jsoup.nodes.Document.OutputSettings outputSettings53 = outputSettings39.escapeMode(escapeMode51);
        org.jsoup.nodes.Entities.EscapeMode escapeMode54 = outputSettings39.escapeMode();
        org.jsoup.nodes.Document.OutputSettings outputSettings55 = outputSettings39.clone();
        org.jsoup.nodes.Document.OutputSettings outputSettings56 = outputSettings39.clone();
        org.jsoup.nodes.Document.OutputSettings outputSettings58 = outputSettings39.indentAmount((int) (byte) 1);
        java.nio.charset.Charset charset59 = outputSettings58.charset();
        org.jsoup.nodes.Entities.EscapeMode escapeMode60 = outputSettings58.escapeMode();
        org.jsoup.nodes.Document.OutputSettings outputSettings61 = outputSettings34.escapeMode(escapeMode60);
        org.jsoup.nodes.Document.OutputSettings outputSettings62 = outputSettings61.clone();
        org.jsoup.nodes.Document.OutputSettings outputSettings63 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Entities.EscapeMode escapeMode64 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings65 = outputSettings63.escapeMode(escapeMode64);
        boolean boolean66 = outputSettings63.forceAllElementAsBlock();
        org.jsoup.nodes.Document.OutputSettings outputSettings67 = new org.jsoup.nodes.Document.OutputSettings();
        boolean boolean68 = outputSettings67.prettyPrint();
        org.jsoup.nodes.Entities.EscapeMode escapeMode69 = outputSettings67.escapeMode();
        org.jsoup.nodes.Document.OutputSettings outputSettings70 = outputSettings63.escapeMode(escapeMode69);
        boolean boolean71 = outputSettings70.forceAllElementAsBlock();
        org.jsoup.nodes.Document.OutputSettings outputSettings72 = new org.jsoup.nodes.Document.OutputSettings();
        boolean boolean73 = outputSettings72.prettyPrint();
        org.jsoup.nodes.Document.OutputSettings outputSettings75 = outputSettings72.prettyPrint(true);
        boolean boolean76 = outputSettings72.prettyPrint();
        org.jsoup.nodes.Entities.EscapeMode escapeMode77 = outputSettings72.escapeMode();
        org.jsoup.nodes.Document.OutputSettings outputSettings78 = outputSettings70.escapeMode(escapeMode77);
        org.jsoup.nodes.Document.OutputSettings outputSettings79 = outputSettings62.escapeMode(escapeMode77);
        org.jsoup.nodes.Document.OutputSettings outputSettings81 = outputSettings79.forceAllElementAsBlock(true);
        org.jsoup.nodes.Entities.EscapeMode escapeMode82 = outputSettings81.escapeMode();
        org.jsoup.nodes.Document.OutputSettings outputSettings83 = outputSettings30.escapeMode(escapeMode82);
        org.jsoup.nodes.Entities.EscapeMode escapeMode84 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings85 = outputSettings30.escapeMode(escapeMode84);
        org.jsoup.nodes.Document.OutputSettings outputSettings87 = outputSettings85.forceAllElementAsBlock(true);
        org.junit.Assert.assertNotNull(outputSettings2);
        org.junit.Assert.assertNotNull(outputSettings4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(escapeMode6);
        org.junit.Assert.assertNotNull(outputSettings8);
        org.junit.Assert.assertNotNull(outputSettings11);
        org.junit.Assert.assertNotNull(outputSettings13);
        org.junit.Assert.assertNotNull(outputSettings15);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + escapeMode18 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode18.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertTrue("'" + escapeMode22 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode22.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertNotNull(outputSettings23);
        org.junit.Assert.assertNotNull(outputSettings24);
        org.junit.Assert.assertNotNull(outputSettings25);
        org.junit.Assert.assertNotNull(outputSettings27);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertNotNull(outputSettings30);
        org.junit.Assert.assertNotNull(outputSettings32);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + true + "'", boolean33 == true);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + true + "'", boolean35 == true);
        org.junit.Assert.assertNotNull(outputSettings37);
        org.junit.Assert.assertNotNull(charset38);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + true + "'", boolean40 == true);
        org.junit.Assert.assertNotNull(outputSettings42);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + true + "'", boolean44 == true);
        org.junit.Assert.assertTrue("'" + escapeMode45 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode45.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertTrue("'" + int46 + "' != '" + 1 + "'", int46 == 1);
        org.junit.Assert.assertNotNull(outputSettings48);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + true + "'", boolean50 == true);
        org.junit.Assert.assertTrue("'" + escapeMode51 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode51.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertNotNull(outputSettings52);
        org.junit.Assert.assertNotNull(outputSettings53);
        org.junit.Assert.assertTrue("'" + escapeMode54 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode54.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertNotNull(outputSettings55);
        org.junit.Assert.assertNotNull(outputSettings56);
        org.junit.Assert.assertNotNull(outputSettings58);
        org.junit.Assert.assertNotNull(charset59);
        org.junit.Assert.assertTrue("'" + escapeMode60 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode60.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertNotNull(outputSettings61);
        org.junit.Assert.assertNotNull(outputSettings62);
        org.junit.Assert.assertNotNull(outputSettings65);
        org.junit.Assert.assertTrue("'" + boolean66 + "' != '" + false + "'", boolean66 == false);
        org.junit.Assert.assertTrue("'" + boolean68 + "' != '" + true + "'", boolean68 == true);
        org.junit.Assert.assertTrue("'" + escapeMode69 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode69.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertNotNull(outputSettings70);
        org.junit.Assert.assertTrue("'" + boolean71 + "' != '" + false + "'", boolean71 == false);
        org.junit.Assert.assertTrue("'" + boolean73 + "' != '" + true + "'", boolean73 == true);
        org.junit.Assert.assertNotNull(outputSettings75);
        org.junit.Assert.assertTrue("'" + boolean76 + "' != '" + true + "'", boolean76 == true);
        org.junit.Assert.assertTrue("'" + escapeMode77 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode77.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertNotNull(outputSettings78);
        org.junit.Assert.assertNotNull(outputSettings79);
        org.junit.Assert.assertNotNull(outputSettings81);
        org.junit.Assert.assertTrue("'" + escapeMode82 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode82.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertNotNull(outputSettings83);
        org.junit.Assert.assertNotNull(outputSettings85);
        org.junit.Assert.assertNotNull(outputSettings87);
    }

    @Test
    public void test20628() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20628");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("", "");
        boolean boolean3 = textNode2.isBlank();
        org.jsoup.nodes.Node node4 = textNode2.previousSibling();
        java.lang.String str5 = textNode2.getWholeText();
        java.lang.String str6 = textNode2.baseUri();
        java.lang.String str7 = textNode2.baseUri();
        java.lang.String str8 = textNode2.toString();
        org.jsoup.nodes.TextNode textNode10 = textNode2.text("#text");
        java.lang.String str11 = textNode2.toString();
        java.util.List<org.jsoup.nodes.Node> nodeList12 = textNode2.siblingNodes();
        boolean boolean13 = textNode2.isBlank();
        org.jsoup.nodes.Node node14 = textNode2.clone();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node15 = node14.unwrap();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(textNode2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNull(node4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNotNull(textNode10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "#text" + "'", str11, "#text");
        org.junit.Assert.assertNotNull(nodeList12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(node14);
    }

    @Test
    public void test20629() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20629");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("", "");
        org.jsoup.nodes.TextNode textNode4 = textNode2.text("");
        org.jsoup.nodes.Node node5 = textNode2.previousSibling();
        boolean boolean7 = textNode2.hasAttr("hi!");
        java.lang.String str8 = textNode2.toString();
        java.util.List<org.jsoup.nodes.Node> nodeList9 = textNode2.childNodes();
        java.lang.String str11 = textNode2.attr("h");
        org.jsoup.nodes.Node node14 = textNode2.attr("i!", "hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList15 = node14.siblingNodes();
        org.jsoup.nodes.TextNode textNode18 = org.jsoup.nodes.TextNode.createFromEncoded("", "");
        java.lang.String str19 = textNode18.getWholeText();
        java.lang.String str20 = textNode18.baseUri();
        org.jsoup.nodes.TextNode textNode22 = textNode18.text("hi!");
        org.jsoup.nodes.Node node23 = textNode22.clone();
        org.jsoup.nodes.Node node25 = textNode22.removeAttr("hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList26 = textNode22.siblingNodes();
        java.lang.String str28 = textNode22.absUrl("#text");
        java.util.List<org.jsoup.nodes.Node> nodeList29 = textNode22.childNodes();
        org.jsoup.nodes.TextNode textNode31 = textNode22.splitText((int) (byte) 1);
        org.jsoup.nodes.Node node32 = textNode31.clone();
        org.jsoup.nodes.Node node33 = textNode31.clone();
        boolean boolean34 = node14.equals((java.lang.Object) textNode31);
        org.jsoup.nodes.Node node37 = textNode31.attr("h", "#text");
        org.jsoup.nodes.Attributes attributes38 = textNode31.attributes();
        org.junit.Assert.assertNotNull(textNode2);
        org.junit.Assert.assertNotNull(textNode4);
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNotNull(nodeList9);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNotNull(node14);
        org.junit.Assert.assertNotNull(nodeList15);
        org.junit.Assert.assertNotNull(textNode18);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertNotNull(textNode22);
        org.junit.Assert.assertNotNull(node23);
        org.junit.Assert.assertNotNull(node25);
        org.junit.Assert.assertNotNull(nodeList26);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "" + "'", str28, "");
        org.junit.Assert.assertNotNull(nodeList29);
        org.junit.Assert.assertNotNull(textNode31);
        org.junit.Assert.assertNotNull(node32);
        org.junit.Assert.assertNotNull(node33);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertNotNull(node37);
        org.junit.Assert.assertNotNull(attributes38);
    }

    @Test
    public void test20630() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20630");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("", "");
        org.jsoup.nodes.TextNode textNode4 = textNode2.text("");
        org.jsoup.nodes.Node node5 = textNode2.previousSibling();
        boolean boolean7 = textNode2.hasAttr("hi!");
        java.lang.String str8 = textNode2.getWholeText();
        org.jsoup.nodes.TextNode textNode10 = textNode2.text("#text");
        java.lang.String str11 = textNode10.nodeName();
        org.jsoup.nodes.Node node14 = textNode10.attr("i!", "hi!");
        org.jsoup.nodes.Document document15 = node14.ownerDocument();
        // The following exception was thrown during execution in test generation
        try {
            document15.setBaseUri("text");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(textNode2);
        org.junit.Assert.assertNotNull(textNode4);
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNotNull(textNode10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "#text" + "'", str11, "#text");
        org.junit.Assert.assertNotNull(node14);
        org.junit.Assert.assertNull(document15);
    }

    @Test
    public void test20631() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20631");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("", "");
        org.jsoup.nodes.TextNode textNode4 = textNode2.text("");
        org.jsoup.nodes.TextNode textNode6 = textNode4.text("#text");
        org.jsoup.nodes.Attributes attributes7 = textNode6.attributes();
        java.lang.String str8 = textNode6.toString();
        boolean boolean9 = textNode6.isBlank();
        java.lang.String str10 = textNode6.toString();
        org.junit.Assert.assertNotNull(textNode2);
        org.junit.Assert.assertNotNull(textNode4);
        org.junit.Assert.assertNotNull(textNode6);
        org.junit.Assert.assertNotNull(attributes7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "#text" + "'", str8, "#text");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "#text" + "'", str10, "#text");
    }

    @Test
    public void test20632() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20632");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("", "");
        java.lang.String str3 = textNode2.getWholeText();
        java.lang.String str4 = textNode2.baseUri();
        boolean boolean5 = textNode2.isBlank();
        org.jsoup.nodes.Node node6 = textNode2.parent();
        boolean boolean7 = textNode2.isBlank();
        java.util.List<org.jsoup.nodes.Node> nodeList8 = textNode2.childNodes();
        java.lang.String str9 = textNode2.outerHtml();
        org.jsoup.nodes.TextNode textNode12 = org.jsoup.nodes.TextNode.createFromEncoded("", "");
        java.lang.String str13 = textNode12.toString();
        int int14 = textNode12.siblingIndex();
        java.lang.String str15 = textNode12.nodeName();
        org.jsoup.nodes.Node node17 = textNode12.removeAttr("h");
        boolean boolean18 = textNode2.equals((java.lang.Object) textNode12);
        org.jsoup.nodes.Node node20 = textNode2.removeAttr("h");
        java.lang.String str21 = textNode2.baseUri();
        org.jsoup.nodes.Node node22 = textNode2.previousSibling();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node24 = node22.after("h");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(textNode2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNull(node6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(nodeList8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNotNull(textNode12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "#text" + "'", str15, "#text");
        org.junit.Assert.assertNotNull(node17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(node20);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertNull(node22);
    }

    @Test
    public void test20633() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20633");
        org.jsoup.nodes.Document.OutputSettings outputSettings0 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Entities.EscapeMode escapeMode1 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings2 = outputSettings0.escapeMode(escapeMode1);
        int int3 = outputSettings0.indentAmount();
        java.nio.charset.Charset charset4 = outputSettings0.charset();
        org.jsoup.nodes.Entities.EscapeMode escapeMode5 = outputSettings0.escapeMode();
        org.jsoup.nodes.Entities.EscapeMode escapeMode6 = outputSettings0.escapeMode();
        org.jsoup.nodes.Document.OutputSettings outputSettings8 = outputSettings0.indentAmount((int) (short) 1);
        boolean boolean9 = outputSettings8.forceAllElementAsBlock();
        org.jsoup.nodes.Document.OutputSettings outputSettings11 = outputSettings8.indentAmount((int) (byte) 0);
        org.junit.Assert.assertNotNull(outputSettings2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertNotNull(charset4);
        org.junit.Assert.assertNull(escapeMode5);
        org.junit.Assert.assertNull(escapeMode6);
        org.junit.Assert.assertNotNull(outputSettings8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(outputSettings11);
    }

    @Test
    public void test20634() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20634");
        org.jsoup.nodes.Document.OutputSettings outputSettings0 = new org.jsoup.nodes.Document.OutputSettings();
        boolean boolean1 = outputSettings0.prettyPrint();
        org.jsoup.nodes.Entities.EscapeMode escapeMode2 = outputSettings0.escapeMode();
        int int3 = outputSettings0.indentAmount();
        org.jsoup.nodes.Document.OutputSettings outputSettings5 = outputSettings0.prettyPrint(false);
        org.jsoup.nodes.Document.OutputSettings outputSettings6 = new org.jsoup.nodes.Document.OutputSettings();
        boolean boolean7 = outputSettings6.prettyPrint();
        org.jsoup.nodes.Entities.EscapeMode escapeMode8 = outputSettings6.escapeMode();
        org.jsoup.nodes.Document.OutputSettings outputSettings9 = outputSettings5.escapeMode(escapeMode8);
        org.jsoup.nodes.Document.OutputSettings outputSettings11 = outputSettings5.forceAllElementAsBlock(true);
        org.jsoup.nodes.Document.OutputSettings outputSettings12 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Entities.EscapeMode escapeMode13 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings14 = outputSettings12.escapeMode(escapeMode13);
        java.nio.charset.Charset charset15 = outputSettings12.charset();
        org.jsoup.nodes.Document.OutputSettings outputSettings17 = outputSettings12.forceAllElementAsBlock(false);
        int int18 = outputSettings17.indentAmount();
        boolean boolean19 = outputSettings17.prettyPrint();
        int int20 = outputSettings17.indentAmount();
        boolean boolean21 = outputSettings17.prettyPrint();
        org.jsoup.nodes.Document.OutputSettings outputSettings23 = outputSettings17.prettyPrint(false);
        org.jsoup.nodes.Document.OutputSettings outputSettings24 = new org.jsoup.nodes.Document.OutputSettings();
        boolean boolean25 = outputSettings24.prettyPrint();
        org.jsoup.nodes.Entities.EscapeMode escapeMode26 = outputSettings24.escapeMode();
        boolean boolean27 = outputSettings24.forceAllElementAsBlock();
        org.jsoup.nodes.Document.OutputSettings outputSettings29 = outputSettings24.forceAllElementAsBlock(true);
        org.jsoup.nodes.Document.OutputSettings outputSettings30 = new org.jsoup.nodes.Document.OutputSettings();
        boolean boolean31 = outputSettings30.prettyPrint();
        org.jsoup.nodes.Document.OutputSettings outputSettings33 = outputSettings30.prettyPrint(true);
        org.jsoup.nodes.Document.OutputSettings outputSettings34 = new org.jsoup.nodes.Document.OutputSettings();
        boolean boolean35 = outputSettings34.prettyPrint();
        org.jsoup.nodes.Entities.EscapeMode escapeMode36 = outputSettings34.escapeMode();
        int int37 = outputSettings34.indentAmount();
        org.jsoup.nodes.Document.OutputSettings outputSettings39 = outputSettings34.prettyPrint(false);
        org.jsoup.nodes.Document.OutputSettings outputSettings40 = new org.jsoup.nodes.Document.OutputSettings();
        boolean boolean41 = outputSettings40.prettyPrint();
        org.jsoup.nodes.Entities.EscapeMode escapeMode42 = outputSettings40.escapeMode();
        org.jsoup.nodes.Document.OutputSettings outputSettings43 = outputSettings39.escapeMode(escapeMode42);
        org.jsoup.nodes.Document.OutputSettings outputSettings44 = outputSettings30.escapeMode(escapeMode42);
        org.jsoup.nodes.Entities.EscapeMode escapeMode45 = outputSettings30.escapeMode();
        org.jsoup.nodes.Document.OutputSettings outputSettings46 = outputSettings30.clone();
        org.jsoup.nodes.Document.OutputSettings outputSettings47 = outputSettings30.clone();
        org.jsoup.nodes.Document.OutputSettings outputSettings48 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Entities.EscapeMode escapeMode49 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings50 = outputSettings48.escapeMode(escapeMode49);
        int int51 = outputSettings48.indentAmount();
        org.jsoup.nodes.Document.OutputSettings outputSettings53 = outputSettings48.forceAllElementAsBlock(false);
        org.jsoup.nodes.Document.OutputSettings outputSettings55 = outputSettings53.indentAmount((int) (byte) 1);
        java.nio.charset.Charset charset56 = outputSettings53.charset();
        org.jsoup.nodes.Document.OutputSettings outputSettings57 = outputSettings30.charset(charset56);
        org.jsoup.nodes.Document.OutputSettings outputSettings58 = outputSettings29.charset(charset56);
        org.jsoup.nodes.Document.OutputSettings outputSettings59 = outputSettings23.charset(charset56);
        org.jsoup.nodes.Document.OutputSettings outputSettings60 = outputSettings11.charset(charset56);
        boolean boolean61 = outputSettings11.prettyPrint();
        org.jsoup.nodes.Document.OutputSettings outputSettings63 = outputSettings11.prettyPrint(false);
        org.jsoup.nodes.Document.OutputSettings outputSettings65 = outputSettings63.indentAmount((int) (byte) 10);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + escapeMode2 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode2.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertNotNull(outputSettings5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + escapeMode8 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode8.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertNotNull(outputSettings9);
        org.junit.Assert.assertNotNull(outputSettings11);
        org.junit.Assert.assertNotNull(outputSettings14);
        org.junit.Assert.assertNotNull(charset15);
        org.junit.Assert.assertNotNull(outputSettings17);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 1 + "'", int20 == 1);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertNotNull(outputSettings23);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertTrue("'" + escapeMode26 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode26.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNotNull(outputSettings29);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + true + "'", boolean31 == true);
        org.junit.Assert.assertNotNull(outputSettings33);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + true + "'", boolean35 == true);
        org.junit.Assert.assertTrue("'" + escapeMode36 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode36.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 1 + "'", int37 == 1);
        org.junit.Assert.assertNotNull(outputSettings39);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + true + "'", boolean41 == true);
        org.junit.Assert.assertTrue("'" + escapeMode42 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode42.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertNotNull(outputSettings43);
        org.junit.Assert.assertNotNull(outputSettings44);
        org.junit.Assert.assertTrue("'" + escapeMode45 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode45.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertNotNull(outputSettings46);
        org.junit.Assert.assertNotNull(outputSettings47);
        org.junit.Assert.assertNotNull(outputSettings50);
        org.junit.Assert.assertTrue("'" + int51 + "' != '" + 1 + "'", int51 == 1);
        org.junit.Assert.assertNotNull(outputSettings53);
        org.junit.Assert.assertNotNull(outputSettings55);
        org.junit.Assert.assertNotNull(charset56);
        org.junit.Assert.assertNotNull(outputSettings57);
        org.junit.Assert.assertNotNull(outputSettings58);
        org.junit.Assert.assertNotNull(outputSettings59);
        org.junit.Assert.assertNotNull(outputSettings60);
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + false + "'", boolean61 == false);
        org.junit.Assert.assertNotNull(outputSettings63);
        org.junit.Assert.assertNotNull(outputSettings65);
    }

    @Test
    public void test20635() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20635");
        org.jsoup.nodes.Document.OutputSettings outputSettings0 = new org.jsoup.nodes.Document.OutputSettings();
        boolean boolean1 = outputSettings0.prettyPrint();
        org.jsoup.nodes.Document.OutputSettings outputSettings3 = outputSettings0.prettyPrint(true);
        org.jsoup.nodes.Document.OutputSettings outputSettings4 = new org.jsoup.nodes.Document.OutputSettings();
        boolean boolean5 = outputSettings4.prettyPrint();
        org.jsoup.nodes.Entities.EscapeMode escapeMode6 = outputSettings4.escapeMode();
        int int7 = outputSettings4.indentAmount();
        org.jsoup.nodes.Document.OutputSettings outputSettings9 = outputSettings4.prettyPrint(false);
        org.jsoup.nodes.Document.OutputSettings outputSettings10 = new org.jsoup.nodes.Document.OutputSettings();
        boolean boolean11 = outputSettings10.prettyPrint();
        org.jsoup.nodes.Entities.EscapeMode escapeMode12 = outputSettings10.escapeMode();
        org.jsoup.nodes.Document.OutputSettings outputSettings13 = outputSettings9.escapeMode(escapeMode12);
        org.jsoup.nodes.Document.OutputSettings outputSettings14 = outputSettings0.escapeMode(escapeMode12);
        org.jsoup.nodes.Entities.EscapeMode escapeMode15 = outputSettings0.escapeMode();
        org.jsoup.nodes.Document.OutputSettings outputSettings16 = outputSettings0.clone();
        boolean boolean17 = outputSettings16.prettyPrint();
        org.jsoup.nodes.Document.OutputSettings outputSettings19 = outputSettings16.prettyPrint(true);
        org.jsoup.nodes.Entities.EscapeMode escapeMode20 = outputSettings19.escapeMode();
        boolean boolean21 = outputSettings19.forceAllElementAsBlock();
        int int22 = outputSettings19.indentAmount();
        org.jsoup.nodes.Document.OutputSettings outputSettings23 = outputSettings19.clone();
        org.jsoup.nodes.Document.OutputSettings outputSettings24 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Entities.EscapeMode escapeMode25 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings26 = outputSettings24.escapeMode(escapeMode25);
        org.jsoup.nodes.Document.OutputSettings outputSettings28 = outputSettings24.forceAllElementAsBlock(false);
        org.jsoup.nodes.Document.OutputSettings outputSettings29 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Entities.EscapeMode escapeMode30 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings31 = outputSettings29.escapeMode(escapeMode30);
        int int32 = outputSettings29.indentAmount();
        org.jsoup.nodes.Document.OutputSettings outputSettings33 = new org.jsoup.nodes.Document.OutputSettings();
        boolean boolean34 = outputSettings33.prettyPrint();
        org.jsoup.nodes.Document.OutputSettings outputSettings36 = outputSettings33.prettyPrint(true);
        java.nio.charset.Charset charset37 = outputSettings33.charset();
        org.jsoup.nodes.Document.OutputSettings outputSettings38 = outputSettings29.charset(charset37);
        org.jsoup.nodes.Document.OutputSettings outputSettings39 = outputSettings28.charset(charset37);
        org.jsoup.nodes.Document.OutputSettings outputSettings41 = outputSettings28.prettyPrint(false);
        java.nio.charset.Charset charset42 = outputSettings28.charset();
        org.jsoup.nodes.Document.OutputSettings outputSettings43 = outputSettings23.charset(charset42);
        org.jsoup.nodes.Document.OutputSettings outputSettings44 = new org.jsoup.nodes.Document.OutputSettings();
        boolean boolean45 = outputSettings44.prettyPrint();
        org.jsoup.nodes.Document.OutputSettings outputSettings47 = outputSettings44.prettyPrint(true);
        org.jsoup.nodes.Document.OutputSettings outputSettings49 = outputSettings47.indentAmount((int) ' ');
        org.jsoup.nodes.Document.OutputSettings outputSettings50 = new org.jsoup.nodes.Document.OutputSettings();
        boolean boolean51 = outputSettings50.prettyPrint();
        org.jsoup.nodes.Document.OutputSettings outputSettings53 = outputSettings50.prettyPrint(true);
        org.jsoup.nodes.Document.OutputSettings outputSettings54 = new org.jsoup.nodes.Document.OutputSettings();
        boolean boolean55 = outputSettings54.prettyPrint();
        org.jsoup.nodes.Entities.EscapeMode escapeMode56 = outputSettings54.escapeMode();
        int int57 = outputSettings54.indentAmount();
        org.jsoup.nodes.Document.OutputSettings outputSettings59 = outputSettings54.prettyPrint(false);
        org.jsoup.nodes.Document.OutputSettings outputSettings60 = new org.jsoup.nodes.Document.OutputSettings();
        boolean boolean61 = outputSettings60.prettyPrint();
        org.jsoup.nodes.Entities.EscapeMode escapeMode62 = outputSettings60.escapeMode();
        org.jsoup.nodes.Document.OutputSettings outputSettings63 = outputSettings59.escapeMode(escapeMode62);
        org.jsoup.nodes.Document.OutputSettings outputSettings64 = outputSettings50.escapeMode(escapeMode62);
        org.jsoup.nodes.Entities.EscapeMode escapeMode65 = outputSettings50.escapeMode();
        org.jsoup.nodes.Document.OutputSettings outputSettings66 = outputSettings50.clone();
        java.nio.charset.Charset charset67 = outputSettings50.charset();
        org.jsoup.nodes.Document.OutputSettings outputSettings68 = outputSettings47.charset(charset67);
        org.jsoup.nodes.Document.OutputSettings outputSettings69 = outputSettings43.charset(charset67);
        org.jsoup.nodes.Document.OutputSettings outputSettings71 = outputSettings43.indentAmount((int) (byte) 10);
        org.jsoup.nodes.Document.OutputSettings outputSettings73 = outputSettings71.indentAmount((int) 'a');
        org.jsoup.nodes.Entities.EscapeMode escapeMode74 = outputSettings73.escapeMode();
        org.jsoup.nodes.Document.OutputSettings outputSettings76 = outputSettings73.forceAllElementAsBlock(false);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertNotNull(outputSettings3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + escapeMode6 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode6.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertNotNull(outputSettings9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + escapeMode12 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode12.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertNotNull(outputSettings13);
        org.junit.Assert.assertNotNull(outputSettings14);
        org.junit.Assert.assertTrue("'" + escapeMode15 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode15.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertNotNull(outputSettings16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertNotNull(outputSettings19);
        org.junit.Assert.assertTrue("'" + escapeMode20 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode20.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 1 + "'", int22 == 1);
        org.junit.Assert.assertNotNull(outputSettings23);
        org.junit.Assert.assertNotNull(outputSettings26);
        org.junit.Assert.assertNotNull(outputSettings28);
        org.junit.Assert.assertNotNull(outputSettings31);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 1 + "'", int32 == 1);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + true + "'", boolean34 == true);
        org.junit.Assert.assertNotNull(outputSettings36);
        org.junit.Assert.assertNotNull(charset37);
        org.junit.Assert.assertNotNull(outputSettings38);
        org.junit.Assert.assertNotNull(outputSettings39);
        org.junit.Assert.assertNotNull(outputSettings41);
        org.junit.Assert.assertNotNull(charset42);
        org.junit.Assert.assertNotNull(outputSettings43);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + true + "'", boolean45 == true);
        org.junit.Assert.assertNotNull(outputSettings47);
        org.junit.Assert.assertNotNull(outputSettings49);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + true + "'", boolean51 == true);
        org.junit.Assert.assertNotNull(outputSettings53);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + true + "'", boolean55 == true);
        org.junit.Assert.assertTrue("'" + escapeMode56 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode56.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertTrue("'" + int57 + "' != '" + 1 + "'", int57 == 1);
        org.junit.Assert.assertNotNull(outputSettings59);
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + true + "'", boolean61 == true);
        org.junit.Assert.assertTrue("'" + escapeMode62 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode62.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertNotNull(outputSettings63);
        org.junit.Assert.assertNotNull(outputSettings64);
        org.junit.Assert.assertTrue("'" + escapeMode65 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode65.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertNotNull(outputSettings66);
        org.junit.Assert.assertNotNull(charset67);
        org.junit.Assert.assertNotNull(outputSettings68);
        org.junit.Assert.assertNotNull(outputSettings69);
        org.junit.Assert.assertNotNull(outputSettings71);
        org.junit.Assert.assertNotNull(outputSettings73);
        org.junit.Assert.assertTrue("'" + escapeMode74 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode74.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertNotNull(outputSettings76);
    }

    @Test
    public void test20636() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20636");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("", "");
        boolean boolean3 = textNode2.isBlank();
        java.lang.String str4 = textNode2.text();
        org.jsoup.nodes.Node node7 = textNode2.attr("#text", "hi!");
        int int8 = textNode2.siblingIndex();
        java.util.List<org.jsoup.nodes.Node> nodeList9 = textNode2.siblingNodes();
        int int10 = textNode2.siblingIndex();
        org.jsoup.nodes.Attributes attributes11 = textNode2.attributes();
        java.util.List<org.jsoup.nodes.Node> nodeList12 = textNode2.siblingNodes();
        org.jsoup.nodes.Node node13 = textNode2.clone();
        org.jsoup.nodes.TextNode textNode15 = textNode2.text("i!");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node17 = textNode15.childNode(0);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(textNode2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(node7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(nodeList9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNotNull(attributes11);
        org.junit.Assert.assertNotNull(nodeList12);
        org.junit.Assert.assertNotNull(node13);
        org.junit.Assert.assertNotNull(textNode15);
    }

    @Test
    public void test20637() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20637");
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
        org.jsoup.nodes.Node node15 = textNode2.clone();
        node15.setBaseUri("");
        org.junit.Assert.assertNotNull(textNode2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(node6);
        org.junit.Assert.assertNotNull(textNode8);
        org.junit.Assert.assertNull(node9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(attributes13);
        org.junit.Assert.assertNotNull(attributes14);
        org.junit.Assert.assertNotNull(node15);
    }

    @Test
    public void test20638() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20638");
        org.jsoup.nodes.Document.OutputSettings outputSettings0 = new org.jsoup.nodes.Document.OutputSettings();
        boolean boolean1 = outputSettings0.prettyPrint();
        org.jsoup.nodes.Entities.EscapeMode escapeMode2 = outputSettings0.escapeMode();
        boolean boolean3 = outputSettings0.forceAllElementAsBlock();
        org.jsoup.nodes.Document.OutputSettings outputSettings4 = new org.jsoup.nodes.Document.OutputSettings();
        boolean boolean5 = outputSettings4.prettyPrint();
        org.jsoup.nodes.Entities.EscapeMode escapeMode6 = outputSettings4.escapeMode();
        org.jsoup.nodes.Document.OutputSettings outputSettings7 = outputSettings0.escapeMode(escapeMode6);
        org.jsoup.nodes.Document.OutputSettings outputSettings9 = outputSettings0.prettyPrint(false);
        org.jsoup.nodes.Document.OutputSettings outputSettings11 = outputSettings0.indentAmount((int) (short) 100);
        org.jsoup.nodes.Document.OutputSettings outputSettings12 = outputSettings0.clone();
        org.jsoup.nodes.Entities.EscapeMode escapeMode13 = outputSettings12.escapeMode();
        org.jsoup.nodes.Document.OutputSettings outputSettings14 = outputSettings12.clone();
        org.jsoup.nodes.Document.OutputSettings outputSettings15 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Entities.EscapeMode escapeMode16 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings17 = outputSettings15.escapeMode(escapeMode16);
        org.jsoup.nodes.Document.OutputSettings outputSettings19 = outputSettings15.forceAllElementAsBlock(false);
        int int20 = outputSettings15.indentAmount();
        boolean boolean21 = outputSettings15.forceAllElementAsBlock();
        java.nio.charset.Charset charset22 = outputSettings15.charset();
        org.jsoup.nodes.Document.OutputSettings outputSettings23 = outputSettings12.charset(charset22);
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Document.OutputSettings outputSettings25 = outputSettings12.charset("i!");
            org.junit.Assert.fail("Expected exception of type java.nio.charset.IllegalCharsetNameException; message: i!");
        } catch (java.nio.charset.IllegalCharsetNameException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + escapeMode2 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode2.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + escapeMode6 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode6.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertNotNull(outputSettings7);
        org.junit.Assert.assertNotNull(outputSettings9);
        org.junit.Assert.assertNotNull(outputSettings11);
        org.junit.Assert.assertNotNull(outputSettings12);
        org.junit.Assert.assertTrue("'" + escapeMode13 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode13.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertNotNull(outputSettings14);
        org.junit.Assert.assertNotNull(outputSettings17);
        org.junit.Assert.assertNotNull(outputSettings19);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 1 + "'", int20 == 1);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(charset22);
        org.junit.Assert.assertNotNull(outputSettings23);
    }

    @Test
    public void test20639() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20639");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("", "");
        org.jsoup.nodes.TextNode textNode4 = textNode2.text("");
        org.jsoup.nodes.Node node5 = textNode2.previousSibling();
        boolean boolean7 = textNode2.hasAttr("hi!");
        java.lang.String str8 = textNode2.toString();
        java.util.List<org.jsoup.nodes.Node> nodeList9 = textNode2.childNodes();
        java.lang.String str11 = textNode2.attr("h");
        org.jsoup.nodes.Node node14 = textNode2.attr("i!", "hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList15 = node14.siblingNodes();
        org.jsoup.nodes.TextNode textNode18 = org.jsoup.nodes.TextNode.createFromEncoded("", "");
        java.lang.String str19 = textNode18.getWholeText();
        java.lang.String str20 = textNode18.baseUri();
        org.jsoup.nodes.TextNode textNode22 = textNode18.text("hi!");
        org.jsoup.nodes.Node node23 = textNode22.clone();
        org.jsoup.nodes.Node node25 = textNode22.removeAttr("hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList26 = textNode22.siblingNodes();
        java.lang.String str28 = textNode22.absUrl("#text");
        java.util.List<org.jsoup.nodes.Node> nodeList29 = textNode22.childNodes();
        org.jsoup.nodes.TextNode textNode31 = textNode22.splitText((int) (byte) 1);
        org.jsoup.nodes.Node node32 = textNode31.clone();
        org.jsoup.nodes.Node node33 = textNode31.clone();
        boolean boolean34 = node14.equals((java.lang.Object) textNode31);
        org.jsoup.nodes.Node node37 = textNode31.attr("h", "#text");
        org.jsoup.nodes.Node node38 = textNode31.parent();
        boolean boolean40 = textNode31.hasAttr("#");
        org.junit.Assert.assertNotNull(textNode2);
        org.junit.Assert.assertNotNull(textNode4);
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNotNull(nodeList9);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNotNull(node14);
        org.junit.Assert.assertNotNull(nodeList15);
        org.junit.Assert.assertNotNull(textNode18);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertNotNull(textNode22);
        org.junit.Assert.assertNotNull(node23);
        org.junit.Assert.assertNotNull(node25);
        org.junit.Assert.assertNotNull(nodeList26);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "" + "'", str28, "");
        org.junit.Assert.assertNotNull(nodeList29);
        org.junit.Assert.assertNotNull(textNode31);
        org.junit.Assert.assertNotNull(node32);
        org.junit.Assert.assertNotNull(node33);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertNotNull(node37);
        org.junit.Assert.assertNull(node38);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
    }

    @Test
    public void test20640() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20640");
        org.jsoup.nodes.Document.OutputSettings outputSettings0 = new org.jsoup.nodes.Document.OutputSettings();
        int int1 = outputSettings0.indentAmount();
        org.jsoup.nodes.Document.OutputSettings outputSettings3 = outputSettings0.forceAllElementAsBlock(true);
        boolean boolean4 = outputSettings0.forceAllElementAsBlock();
        org.jsoup.nodes.Document.OutputSettings outputSettings6 = outputSettings0.indentAmount((int) (byte) 10);
        org.jsoup.nodes.Document.OutputSettings outputSettings7 = new org.jsoup.nodes.Document.OutputSettings();
        boolean boolean8 = outputSettings7.prettyPrint();
        org.jsoup.nodes.Entities.EscapeMode escapeMode9 = outputSettings7.escapeMode();
        org.jsoup.nodes.Document.OutputSettings outputSettings10 = outputSettings0.escapeMode(escapeMode9);
        int int11 = outputSettings10.indentAmount();
        int int12 = outputSettings10.indentAmount();
        boolean boolean13 = outputSettings10.prettyPrint();
        boolean boolean14 = outputSettings10.prettyPrint();
        org.jsoup.nodes.Document.OutputSettings outputSettings15 = outputSettings10.clone();
        java.nio.charset.Charset charset16 = outputSettings15.charset();
        boolean boolean17 = outputSettings15.forceAllElementAsBlock();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1 + "'", int1 == 1);
        org.junit.Assert.assertNotNull(outputSettings3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(outputSettings6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + escapeMode9 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode9.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertNotNull(outputSettings10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 10 + "'", int11 == 10);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 10 + "'", int12 == 10);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNotNull(outputSettings15);
        org.junit.Assert.assertNotNull(charset16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
    }

    @Test
    public void test20641() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20641");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("hi!", "#text");
        java.lang.String str3 = textNode2.text();
        java.lang.String str4 = textNode2.toString();
        boolean boolean5 = textNode2.isBlank();
        java.lang.Object obj6 = null;
        boolean boolean7 = textNode2.equals(obj6);
        org.jsoup.nodes.Attributes attributes8 = textNode2.attributes();
        java.util.List<org.jsoup.nodes.Node> nodeList9 = textNode2.siblingNodes();
        org.jsoup.select.NodeVisitor nodeVisitor10 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node11 = textNode2.traverse(nodeVisitor10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(textNode2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(attributes8);
        org.junit.Assert.assertNotNull(nodeList9);
    }

    @Test
    public void test20642() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20642");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("", "");
        java.lang.String str3 = textNode2.getWholeText();
        java.lang.String str4 = textNode2.baseUri();
        org.jsoup.nodes.TextNode textNode6 = textNode2.text("hi!");
        org.jsoup.nodes.Node node7 = textNode6.clone();
        org.jsoup.nodes.Node node9 = textNode6.removeAttr("hi!");
        java.lang.String str10 = textNode6.toString();
        java.util.List<org.jsoup.nodes.Node> nodeList11 = textNode6.siblingNodes();
        org.jsoup.nodes.Node node12 = textNode6.parent();
        java.util.List<org.jsoup.nodes.Node> nodeList13 = textNode6.childNodes();
        java.lang.String str14 = textNode6.toString();
        java.util.List<org.jsoup.nodes.Node> nodeList15 = textNode6.siblingNodes();
        org.jsoup.nodes.TextNode textNode17 = textNode6.text("h");
        java.lang.String str18 = textNode17.text();
        org.junit.Assert.assertNotNull(textNode2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(textNode6);
        org.junit.Assert.assertNotNull(node7);
        org.junit.Assert.assertNotNull(node9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertNotNull(nodeList11);
        org.junit.Assert.assertNull(node12);
        org.junit.Assert.assertNotNull(nodeList13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertNotNull(nodeList15);
        org.junit.Assert.assertNotNull(textNode17);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "h" + "'", str18, "h");
    }

    @Test
    public void test20643() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20643");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("hi!", "hi!");
        java.lang.String str3 = textNode2.getWholeText();
        org.jsoup.nodes.TextNode textNode5 = textNode2.splitText(0);
        java.lang.String str6 = textNode2.getWholeText();
        java.lang.String str7 = textNode2.toString();
        java.lang.String str8 = textNode2.getWholeText();
        java.lang.String str9 = textNode2.toString();
        java.lang.String str10 = textNode2.getWholeText();
        org.jsoup.nodes.Document document11 = textNode2.ownerDocument();
        java.lang.String str12 = textNode2.getWholeText();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertNotNull(textNode5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNull(document11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
    }

    @Test
    public void test20644() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20644");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("", "");
        java.lang.String str3 = textNode2.text();
        java.lang.String str4 = textNode2.outerHtml();
        java.lang.String str5 = textNode2.toString();
        java.util.List<org.jsoup.nodes.Node> nodeList6 = textNode2.siblingNodes();
        org.jsoup.nodes.Document document7 = textNode2.ownerDocument();
        boolean boolean9 = textNode2.hasAttr("");
        // The following exception was thrown during execution in test generation
        try {
            textNode2.remove();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(textNode2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(nodeList6);
        org.junit.Assert.assertNull(document7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test20645() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20645");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("hi!", "hi!");
        java.lang.String str3 = textNode2.getWholeText();
        org.jsoup.nodes.TextNode textNode5 = textNode2.splitText(0);
        java.lang.String str6 = textNode2.outerHtml();
        java.util.List<org.jsoup.nodes.Node> nodeList7 = textNode2.siblingNodes();
        textNode2.setBaseUri("hi!");
        org.jsoup.nodes.TextNode textNode11 = textNode2.text("#");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node14 = textNode2.attr("", "text");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: String must not be empty");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertNotNull(textNode5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(nodeList7);
        org.junit.Assert.assertNotNull(textNode11);
    }

    @Test
    public void test20646() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20646");
        org.jsoup.nodes.Document.OutputSettings outputSettings0 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Entities.EscapeMode escapeMode1 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings2 = outputSettings0.escapeMode(escapeMode1);
        boolean boolean3 = outputSettings0.forceAllElementAsBlock();
        org.jsoup.nodes.Document.OutputSettings outputSettings4 = new org.jsoup.nodes.Document.OutputSettings();
        boolean boolean5 = outputSettings4.prettyPrint();
        org.jsoup.nodes.Entities.EscapeMode escapeMode6 = outputSettings4.escapeMode();
        org.jsoup.nodes.Document.OutputSettings outputSettings7 = outputSettings0.escapeMode(escapeMode6);
        boolean boolean8 = outputSettings0.forceAllElementAsBlock();
        boolean boolean9 = outputSettings0.forceAllElementAsBlock();
        org.jsoup.nodes.Document.OutputSettings outputSettings10 = new org.jsoup.nodes.Document.OutputSettings();
        boolean boolean11 = outputSettings10.prettyPrint();
        org.jsoup.nodes.Entities.EscapeMode escapeMode12 = outputSettings10.escapeMode();
        boolean boolean13 = outputSettings10.forceAllElementAsBlock();
        org.jsoup.nodes.Document.OutputSettings outputSettings15 = outputSettings10.forceAllElementAsBlock(true);
        org.jsoup.nodes.Entities.EscapeMode escapeMode16 = outputSettings15.escapeMode();
        org.jsoup.nodes.Document.OutputSettings outputSettings17 = outputSettings0.escapeMode(escapeMode16);
        org.jsoup.nodes.Document.OutputSettings outputSettings19 = outputSettings17.indentAmount((int) (short) 10);
        org.junit.Assert.assertNotNull(outputSettings2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + escapeMode6 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode6.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertNotNull(outputSettings7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + escapeMode12 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode12.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(outputSettings15);
        org.junit.Assert.assertTrue("'" + escapeMode16 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode16.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertNotNull(outputSettings17);
        org.junit.Assert.assertNotNull(outputSettings19);
    }

    @Test
    public void test20647() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20647");
        org.jsoup.nodes.Document.OutputSettings outputSettings0 = new org.jsoup.nodes.Document.OutputSettings();
        boolean boolean1 = outputSettings0.prettyPrint();
        org.jsoup.nodes.Entities.EscapeMode escapeMode2 = outputSettings0.escapeMode();
        int int3 = outputSettings0.indentAmount();
        org.jsoup.nodes.Document.OutputSettings outputSettings5 = outputSettings0.prettyPrint(false);
        org.jsoup.nodes.Document.OutputSettings outputSettings6 = new org.jsoup.nodes.Document.OutputSettings();
        boolean boolean7 = outputSettings6.prettyPrint();
        org.jsoup.nodes.Entities.EscapeMode escapeMode8 = outputSettings6.escapeMode();
        org.jsoup.nodes.Document.OutputSettings outputSettings9 = outputSettings5.escapeMode(escapeMode8);
        org.jsoup.nodes.Document.OutputSettings outputSettings10 = new org.jsoup.nodes.Document.OutputSettings();
        int int11 = outputSettings10.indentAmount();
        org.jsoup.nodes.Document.OutputSettings outputSettings13 = outputSettings10.forceAllElementAsBlock(true);
        boolean boolean14 = outputSettings10.forceAllElementAsBlock();
        org.jsoup.nodes.Document.OutputSettings outputSettings16 = outputSettings10.indentAmount((int) (byte) 10);
        org.jsoup.nodes.Document.OutputSettings outputSettings17 = new org.jsoup.nodes.Document.OutputSettings();
        boolean boolean18 = outputSettings17.prettyPrint();
        org.jsoup.nodes.Document.OutputSettings outputSettings20 = outputSettings17.prettyPrint(true);
        org.jsoup.nodes.Document.OutputSettings outputSettings21 = new org.jsoup.nodes.Document.OutputSettings();
        boolean boolean22 = outputSettings21.prettyPrint();
        org.jsoup.nodes.Entities.EscapeMode escapeMode23 = outputSettings21.escapeMode();
        int int24 = outputSettings21.indentAmount();
        org.jsoup.nodes.Document.OutputSettings outputSettings26 = outputSettings21.prettyPrint(false);
        org.jsoup.nodes.Document.OutputSettings outputSettings27 = new org.jsoup.nodes.Document.OutputSettings();
        boolean boolean28 = outputSettings27.prettyPrint();
        org.jsoup.nodes.Entities.EscapeMode escapeMode29 = outputSettings27.escapeMode();
        org.jsoup.nodes.Document.OutputSettings outputSettings30 = outputSettings26.escapeMode(escapeMode29);
        org.jsoup.nodes.Document.OutputSettings outputSettings31 = outputSettings17.escapeMode(escapeMode29);
        org.jsoup.nodes.Entities.EscapeMode escapeMode32 = outputSettings17.escapeMode();
        org.jsoup.nodes.Document.OutputSettings outputSettings33 = outputSettings16.escapeMode(escapeMode32);
        org.jsoup.nodes.Document.OutputSettings outputSettings34 = outputSettings5.escapeMode(escapeMode32);
        org.jsoup.nodes.TextNode textNode37 = org.jsoup.nodes.TextNode.createFromEncoded("", "");
        java.lang.String str38 = textNode37.getWholeText();
        java.lang.String str39 = textNode37.baseUri();
        org.jsoup.nodes.TextNode textNode41 = textNode37.text("hi!");
        org.jsoup.nodes.Node node42 = textNode41.clone();
        org.jsoup.nodes.Node node44 = textNode41.removeAttr("hi!");
        java.lang.String str45 = textNode41.toString();
        java.util.List<org.jsoup.nodes.Node> nodeList46 = textNode41.siblingNodes();
        org.jsoup.nodes.Document.OutputSettings outputSettings47 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Entities.EscapeMode escapeMode48 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings49 = outputSettings47.escapeMode(escapeMode48);
        int int50 = outputSettings47.indentAmount();
        org.jsoup.nodes.Document.OutputSettings outputSettings52 = outputSettings47.forceAllElementAsBlock(false);
        int int53 = outputSettings47.indentAmount();
        org.jsoup.nodes.Entities.EscapeMode escapeMode54 = outputSettings47.escapeMode();
        org.jsoup.nodes.Document.OutputSettings outputSettings55 = new org.jsoup.nodes.Document.OutputSettings();
        int int56 = outputSettings55.indentAmount();
        java.nio.charset.Charset charset57 = outputSettings55.charset();
        org.jsoup.nodes.Document.OutputSettings outputSettings58 = outputSettings47.charset(charset57);
        boolean boolean59 = textNode41.equals((java.lang.Object) outputSettings58);
        java.nio.charset.Charset charset60 = outputSettings58.charset();
        org.jsoup.nodes.Document.OutputSettings outputSettings61 = outputSettings34.charset(charset60);
        org.jsoup.nodes.Document.OutputSettings outputSettings63 = outputSettings34.prettyPrint(true);
        boolean boolean64 = outputSettings34.forceAllElementAsBlock();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + escapeMode2 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode2.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertNotNull(outputSettings5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + escapeMode8 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode8.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertNotNull(outputSettings9);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertNotNull(outputSettings13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNotNull(outputSettings16);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertNotNull(outputSettings20);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertTrue("'" + escapeMode23 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode23.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1 + "'", int24 == 1);
        org.junit.Assert.assertNotNull(outputSettings26);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertTrue("'" + escapeMode29 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode29.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertNotNull(outputSettings30);
        org.junit.Assert.assertNotNull(outputSettings31);
        org.junit.Assert.assertTrue("'" + escapeMode32 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode32.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertNotNull(outputSettings33);
        org.junit.Assert.assertNotNull(outputSettings34);
        org.junit.Assert.assertNotNull(textNode37);
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "" + "'", str38, "");
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "" + "'", str39, "");
        org.junit.Assert.assertNotNull(textNode41);
        org.junit.Assert.assertNotNull(node42);
        org.junit.Assert.assertNotNull(node44);
        org.junit.Assert.assertEquals("'" + str45 + "' != '" + "hi!" + "'", str45, "hi!");
        org.junit.Assert.assertNotNull(nodeList46);
        org.junit.Assert.assertNotNull(outputSettings49);
        org.junit.Assert.assertTrue("'" + int50 + "' != '" + 1 + "'", int50 == 1);
        org.junit.Assert.assertNotNull(outputSettings52);
        org.junit.Assert.assertTrue("'" + int53 + "' != '" + 1 + "'", int53 == 1);
        org.junit.Assert.assertNull(escapeMode54);
        org.junit.Assert.assertTrue("'" + int56 + "' != '" + 1 + "'", int56 == 1);
        org.junit.Assert.assertNotNull(charset57);
        org.junit.Assert.assertNotNull(outputSettings58);
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + false + "'", boolean59 == false);
        org.junit.Assert.assertNotNull(charset60);
        org.junit.Assert.assertNotNull(outputSettings61);
        org.junit.Assert.assertNotNull(outputSettings63);
        org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + false + "'", boolean64 == false);
    }

    @Test
    public void test20648() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20648");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("", "");
        org.jsoup.nodes.TextNode textNode4 = textNode2.text("");
        org.jsoup.nodes.TextNode textNode6 = textNode4.text("#text");
        textNode4.setBaseUri("#text");
        org.jsoup.nodes.TextNode textNode10 = textNode4.text("hi!");
        org.jsoup.nodes.TextNode textNode12 = textNode10.text("hi!");
        org.jsoup.nodes.Node node13 = textNode12.parent();
        java.lang.String str14 = textNode12.outerHtml();
        java.lang.String str16 = textNode12.attr("#");
        org.jsoup.nodes.TextNode textNode19 = org.jsoup.nodes.TextNode.createFromEncoded("", "");
        java.lang.String str20 = textNode19.getWholeText();
        java.lang.String str21 = textNode19.baseUri();
        org.jsoup.nodes.TextNode textNode23 = textNode19.text("hi!");
        org.jsoup.nodes.Node node24 = textNode23.clone();
        org.jsoup.nodes.Node node26 = textNode23.removeAttr("hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList27 = textNode23.siblingNodes();
        java.lang.String str29 = textNode23.absUrl("#text");
        boolean boolean31 = textNode23.hasAttr("hi!");
        // The following exception was thrown during execution in test generation
        try {
            textNode12.replaceWith((org.jsoup.nodes.Node) textNode23);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(textNode2);
        org.junit.Assert.assertNotNull(textNode4);
        org.junit.Assert.assertNotNull(textNode6);
        org.junit.Assert.assertNotNull(textNode10);
        org.junit.Assert.assertNotNull(textNode12);
        org.junit.Assert.assertNull(node13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertNotNull(textNode19);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertNotNull(textNode23);
        org.junit.Assert.assertNotNull(node24);
        org.junit.Assert.assertNotNull(node26);
        org.junit.Assert.assertNotNull(nodeList27);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "" + "'", str29, "");
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
    }

    @Test
    public void test20649() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20649");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("", "");
        java.lang.String str3 = textNode2.getWholeText();
        java.lang.String str4 = textNode2.baseUri();
        boolean boolean5 = textNode2.isBlank();
        org.jsoup.nodes.Attributes attributes6 = textNode2.attributes();
        boolean boolean7 = textNode2.isBlank();
        org.jsoup.nodes.TextNode textNode10 = new org.jsoup.nodes.TextNode("hi!", "i!");
        org.jsoup.nodes.TextNode textNode13 = org.jsoup.nodes.TextNode.createFromEncoded("", "");
        org.jsoup.nodes.TextNode textNode15 = textNode13.text("");
        java.lang.String str16 = textNode13.outerHtml();
        org.jsoup.nodes.Document document17 = textNode13.ownerDocument();
        boolean boolean18 = textNode10.equals((java.lang.Object) textNode13);
        boolean boolean19 = textNode2.equals((java.lang.Object) textNode10);
        org.jsoup.nodes.Node node20 = textNode2.nextSibling();
        org.junit.Assert.assertNotNull(textNode2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(attributes6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(textNode13);
        org.junit.Assert.assertNotNull(textNode15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertNull(document17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNull(node20);
    }

    @Test
    public void test20650() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20650");
        org.jsoup.nodes.Document.OutputSettings outputSettings0 = new org.jsoup.nodes.Document.OutputSettings();
        boolean boolean1 = outputSettings0.prettyPrint();
        org.jsoup.nodes.Document.OutputSettings outputSettings2 = outputSettings0.clone();
        org.jsoup.nodes.Document.OutputSettings outputSettings4 = outputSettings2.forceAllElementAsBlock(false);
        org.jsoup.nodes.Entities.EscapeMode escapeMode5 = outputSettings4.escapeMode();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertNotNull(outputSettings2);
        org.junit.Assert.assertNotNull(outputSettings4);
        org.junit.Assert.assertTrue("'" + escapeMode5 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode5.equals(org.jsoup.nodes.Entities.EscapeMode.base));
    }

    @Test
    public void test20651() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20651");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("", "");
        java.lang.String str3 = textNode2.getWholeText();
        java.lang.String str4 = textNode2.baseUri();
        org.jsoup.nodes.TextNode textNode6 = textNode2.text("hi!");
        org.jsoup.nodes.Node node7 = textNode6.clone();
        org.jsoup.nodes.Node node9 = textNode6.removeAttr("hi!");
        java.lang.String str10 = textNode6.toString();
        java.util.List<org.jsoup.nodes.Node> nodeList11 = textNode6.siblingNodes();
        org.jsoup.nodes.TextNode textNode13 = textNode6.splitText((int) (short) 0);
        java.util.List<org.jsoup.nodes.Node> nodeList14 = textNode13.childNodes();
        java.lang.String str16 = textNode13.absUrl("#text");
        java.lang.String str18 = textNode13.attr("hi!");
        org.jsoup.nodes.TextNode textNode20 = textNode13.text("h");
        org.jsoup.nodes.Attributes attributes21 = textNode20.attributes();
        org.jsoup.nodes.Node node23 = textNode20.removeAttr("#text");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node25 = node23.before("i!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(textNode2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(textNode6);
        org.junit.Assert.assertNotNull(node7);
        org.junit.Assert.assertNotNull(node9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertNotNull(nodeList11);
        org.junit.Assert.assertNotNull(textNode13);
        org.junit.Assert.assertNotNull(nodeList14);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertNotNull(textNode20);
        org.junit.Assert.assertNotNull(attributes21);
        org.junit.Assert.assertNotNull(node23);
    }

    @Test
    public void test20652() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20652");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("", "hi!");
        org.jsoup.nodes.Document document3 = textNode2.ownerDocument();
        org.jsoup.nodes.Node node6 = textNode2.attr("#text", "hi!");
        java.lang.String str7 = textNode2.nodeName();
        java.lang.String str9 = textNode2.absUrl("#text");
        java.lang.String str10 = textNode2.toString();
        java.util.List<org.jsoup.nodes.Node> nodeList11 = textNode2.childNodes();
        java.lang.String str12 = textNode2.baseUri();
        java.lang.String str13 = textNode2.baseUri();
        org.jsoup.nodes.Node node14 = textNode2.nextSibling();
        java.lang.String str15 = textNode2.getWholeText();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node16 = textNode2.unwrap();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(textNode2);
        org.junit.Assert.assertNull(document3);
        org.junit.Assert.assertNotNull(node6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "#text" + "'", str7, "#text");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNotNull(nodeList11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertNull(node14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
    }

    @Test
    public void test20653() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20653");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("", "");
        java.lang.String str3 = textNode2.baseUri();
        boolean boolean5 = textNode2.hasAttr("#text");
        java.lang.String str6 = textNode2.text();
        java.lang.String str7 = textNode2.text();
        org.jsoup.nodes.TextNode textNode10 = org.jsoup.nodes.TextNode.createFromEncoded("", "");
        boolean boolean11 = textNode10.isBlank();
        org.jsoup.nodes.Node node14 = textNode10.attr("hi!", "hi!");
        java.lang.String str16 = textNode10.attr("#text");
        java.lang.String str17 = textNode10.nodeName();
        java.util.List<org.jsoup.nodes.Node> nodeList18 = textNode10.childNodes();
        org.jsoup.nodes.TextNode textNode20 = textNode10.text("");
        textNode10.setBaseUri("#text");
        java.lang.String str23 = textNode10.toString();
        // The following exception was thrown during execution in test generation
        try {
            textNode2.replaceWith((org.jsoup.nodes.Node) textNode10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(textNode2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNotNull(textNode10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(node14);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "#text" + "'", str17, "#text");
        org.junit.Assert.assertNotNull(nodeList18);
        org.junit.Assert.assertNotNull(textNode20);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
    }

    @Test
    public void test20654() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20654");
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
        org.jsoup.nodes.Node node30 = textNode27.clone();
        org.junit.Assert.assertNotNull(textNode2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(node6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(textNode13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertNotNull(nodeList16);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(textNode23);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNull(node25);
        org.junit.Assert.assertNotNull(textNode27);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "" + "'", str29, "");
        org.junit.Assert.assertNotNull(node30);
    }

    @Test
    public void test20655() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20655");
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
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node18 = textNode4.before("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(textNode2);
        org.junit.Assert.assertNotNull(textNode4);
        org.junit.Assert.assertNotNull(textNode6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "#text" + "'", str7, "#text");
        org.junit.Assert.assertNotNull(nodeList8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "#text" + "'", str9, "#text");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "#text" + "'", str10, "#text");
        org.junit.Assert.assertNotNull(node11);
        org.junit.Assert.assertNull(node12);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertNull(document15);
        org.junit.Assert.assertNull(node16);
    }

    @Test
    public void test20656() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20656");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("", "");
        java.lang.String str3 = textNode2.getWholeText();
        java.lang.String str4 = textNode2.outerHtml();
        java.lang.String str5 = textNode2.baseUri();
        java.lang.String str6 = textNode2.toString();
        org.jsoup.nodes.TextNode textNode8 = textNode2.text("hi!");
        org.jsoup.nodes.TextNode textNode11 = org.jsoup.nodes.TextNode.createFromEncoded("", "");
        boolean boolean12 = textNode11.isBlank();
        org.jsoup.nodes.Node node15 = textNode11.attr("hi!", "hi!");
        org.jsoup.nodes.TextNode textNode17 = textNode11.text("");
        org.jsoup.nodes.Document.OutputSettings outputSettings18 = new org.jsoup.nodes.Document.OutputSettings();
        int int19 = outputSettings18.indentAmount();
        org.jsoup.nodes.Document.OutputSettings outputSettings21 = outputSettings18.forceAllElementAsBlock(true);
        boolean boolean22 = outputSettings18.forceAllElementAsBlock();
        org.jsoup.nodes.Document.OutputSettings outputSettings23 = new org.jsoup.nodes.Document.OutputSettings();
        boolean boolean24 = outputSettings23.prettyPrint();
        org.jsoup.nodes.Entities.EscapeMode escapeMode25 = outputSettings23.escapeMode();
        int int26 = outputSettings23.indentAmount();
        org.jsoup.nodes.Document.OutputSettings outputSettings28 = outputSettings23.prettyPrint(false);
        java.nio.charset.Charset charset29 = outputSettings28.charset();
        org.jsoup.nodes.Document.OutputSettings outputSettings30 = outputSettings18.charset(charset29);
        boolean boolean31 = textNode11.equals((java.lang.Object) outputSettings18);
        org.jsoup.nodes.Document.OutputSettings outputSettings33 = outputSettings18.prettyPrint(false);
        org.jsoup.nodes.Document.OutputSettings outputSettings35 = outputSettings33.indentAmount(97);
        boolean boolean36 = outputSettings35.forceAllElementAsBlock();
        org.jsoup.nodes.Document.OutputSettings outputSettings37 = new org.jsoup.nodes.Document.OutputSettings();
        int int38 = outputSettings37.indentAmount();
        org.jsoup.nodes.Document.OutputSettings outputSettings40 = outputSettings37.forceAllElementAsBlock(true);
        boolean boolean41 = outputSettings37.forceAllElementAsBlock();
        org.jsoup.nodes.Document.OutputSettings outputSettings43 = outputSettings37.indentAmount((int) (byte) 10);
        org.jsoup.nodes.Document.OutputSettings outputSettings44 = new org.jsoup.nodes.Document.OutputSettings();
        boolean boolean45 = outputSettings44.prettyPrint();
        org.jsoup.nodes.Entities.EscapeMode escapeMode46 = outputSettings44.escapeMode();
        org.jsoup.nodes.Document.OutputSettings outputSettings47 = outputSettings37.escapeMode(escapeMode46);
        org.jsoup.nodes.Document.OutputSettings outputSettings48 = outputSettings37.clone();
        org.jsoup.nodes.Entities.EscapeMode escapeMode49 = outputSettings48.escapeMode();
        org.jsoup.nodes.Document.OutputSettings outputSettings50 = outputSettings35.escapeMode(escapeMode49);
        boolean boolean51 = textNode8.equals((java.lang.Object) outputSettings50);
        java.lang.String str53 = textNode8.attr("#text");
        java.lang.String str54 = textNode8.nodeName();
        java.util.List<org.jsoup.nodes.Node> nodeList55 = textNode8.childNodes();
        org.junit.Assert.assertNotNull(textNode2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(textNode8);
        org.junit.Assert.assertNotNull(textNode11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(node15);
        org.junit.Assert.assertNotNull(textNode17);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 1 + "'", int19 == 1);
        org.junit.Assert.assertNotNull(outputSettings21);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertTrue("'" + escapeMode25 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode25.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 1 + "'", int26 == 1);
        org.junit.Assert.assertNotNull(outputSettings28);
        org.junit.Assert.assertNotNull(charset29);
        org.junit.Assert.assertNotNull(outputSettings30);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertNotNull(outputSettings33);
        org.junit.Assert.assertNotNull(outputSettings35);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + true + "'", boolean36 == true);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 1 + "'", int38 == 1);
        org.junit.Assert.assertNotNull(outputSettings40);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + true + "'", boolean41 == true);
        org.junit.Assert.assertNotNull(outputSettings43);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + true + "'", boolean45 == true);
        org.junit.Assert.assertTrue("'" + escapeMode46 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode46.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertNotNull(outputSettings47);
        org.junit.Assert.assertNotNull(outputSettings48);
        org.junit.Assert.assertTrue("'" + escapeMode49 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode49.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertNotNull(outputSettings50);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
        org.junit.Assert.assertEquals("'" + str53 + "' != '" + "" + "'", str53, "");
        org.junit.Assert.assertEquals("'" + str54 + "' != '" + "#text" + "'", str54, "#text");
        org.junit.Assert.assertNotNull(nodeList55);
    }

    @Test
    public void test20657() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20657");
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
        java.lang.String str17 = textNode16.outerHtml();
        org.jsoup.nodes.Node node18 = textNode16.previousSibling();
        textNode16.setBaseUri("");
        textNode16.setBaseUri("text");
        org.jsoup.nodes.Attributes attributes23 = textNode16.attributes();
        org.jsoup.nodes.Document document24 = textNode16.ownerDocument();
        org.junit.Assert.assertNotNull(textNode2);
        org.junit.Assert.assertNotNull(textNode5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "#text" + "'", str11, "#text");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertNotNull(textNode16);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
        org.junit.Assert.assertNull(node18);
        org.junit.Assert.assertNotNull(attributes23);
        org.junit.Assert.assertNull(document24);
    }

    @Test
    public void test20658() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20658");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("hi!", "hi!");
        java.lang.String str4 = textNode2.absUrl("hi!");
        java.lang.String str6 = textNode2.absUrl("hi!");
        java.lang.String str8 = textNode2.absUrl("#text");
        java.util.List<org.jsoup.nodes.Node> nodeList9 = textNode2.childNodes();
        boolean boolean11 = textNode2.hasAttr("");
        org.jsoup.nodes.Node node14 = textNode2.attr("i!", "text");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNotNull(nodeList9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(node14);
    }

    @Test
    public void test20659() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20659");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("", "");
        org.jsoup.nodes.TextNode textNode4 = textNode2.text("");
        org.jsoup.nodes.Node node5 = textNode2.previousSibling();
        boolean boolean7 = textNode2.hasAttr("hi!");
        java.lang.String str8 = textNode2.toString();
        java.util.List<org.jsoup.nodes.Node> nodeList9 = textNode2.childNodes();
        java.util.List<org.jsoup.nodes.Node> nodeList10 = textNode2.childNodes();
        java.lang.String str11 = textNode2.baseUri();
        java.lang.String str12 = textNode2.getWholeText();
        java.lang.String str14 = textNode2.absUrl("i!");
        java.lang.String str15 = textNode2.nodeName();
        org.jsoup.nodes.Document document16 = textNode2.ownerDocument();
        org.junit.Assert.assertNotNull(textNode2);
        org.junit.Assert.assertNotNull(textNode4);
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNotNull(nodeList9);
        org.junit.Assert.assertNotNull(nodeList10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "#text" + "'", str15, "#text");
        org.junit.Assert.assertNull(document16);
    }

    @Test
    public void test20660() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20660");
        org.jsoup.nodes.Document.OutputSettings outputSettings0 = new org.jsoup.nodes.Document.OutputSettings();
        boolean boolean1 = outputSettings0.prettyPrint();
        org.jsoup.nodes.Document.OutputSettings outputSettings3 = outputSettings0.prettyPrint(true);
        org.jsoup.nodes.Document.OutputSettings outputSettings4 = new org.jsoup.nodes.Document.OutputSettings();
        boolean boolean5 = outputSettings4.prettyPrint();
        org.jsoup.nodes.Entities.EscapeMode escapeMode6 = outputSettings4.escapeMode();
        int int7 = outputSettings4.indentAmount();
        org.jsoup.nodes.Document.OutputSettings outputSettings9 = outputSettings4.prettyPrint(false);
        org.jsoup.nodes.Document.OutputSettings outputSettings10 = new org.jsoup.nodes.Document.OutputSettings();
        boolean boolean11 = outputSettings10.prettyPrint();
        org.jsoup.nodes.Entities.EscapeMode escapeMode12 = outputSettings10.escapeMode();
        org.jsoup.nodes.Document.OutputSettings outputSettings13 = outputSettings9.escapeMode(escapeMode12);
        org.jsoup.nodes.Document.OutputSettings outputSettings14 = outputSettings0.escapeMode(escapeMode12);
        org.jsoup.nodes.Entities.EscapeMode escapeMode15 = outputSettings0.escapeMode();
        org.jsoup.nodes.Document.OutputSettings outputSettings16 = outputSettings0.clone();
        org.jsoup.nodes.Document.OutputSettings outputSettings18 = outputSettings16.prettyPrint(false);
        java.nio.charset.Charset charset19 = outputSettings18.charset();
        java.lang.Class<?> wildcardClass20 = outputSettings18.getClass();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertNotNull(outputSettings3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + escapeMode6 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode6.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertNotNull(outputSettings9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + escapeMode12 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode12.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertNotNull(outputSettings13);
        org.junit.Assert.assertNotNull(outputSettings14);
        org.junit.Assert.assertTrue("'" + escapeMode15 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode15.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertNotNull(outputSettings16);
        org.junit.Assert.assertNotNull(outputSettings18);
        org.junit.Assert.assertNotNull(charset19);
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test20661() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20661");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("", "");
        java.lang.String str3 = textNode2.nodeName();
        java.util.List<org.jsoup.nodes.Node> nodeList4 = textNode2.childNodes();
        org.jsoup.nodes.Node node5 = textNode2.previousSibling();
        org.jsoup.nodes.Node node7 = textNode2.removeAttr("hi!");
        org.jsoup.nodes.TextNode textNode9 = textNode2.text("");
        org.jsoup.nodes.TextNode textNode11 = textNode2.text("hi!");
        org.junit.Assert.assertNotNull(textNode2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "#text" + "'", str3, "#text");
        org.junit.Assert.assertNotNull(nodeList4);
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertNotNull(node7);
        org.junit.Assert.assertNotNull(textNode9);
        org.junit.Assert.assertNotNull(textNode11);
    }

    @Test
    public void test20662() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20662");
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
        org.jsoup.nodes.Document.OutputSettings outputSettings21 = new org.jsoup.nodes.Document.OutputSettings();
        boolean boolean22 = outputSettings21.prettyPrint();
        org.jsoup.nodes.Document.OutputSettings outputSettings24 = outputSettings21.prettyPrint(true);
        java.nio.charset.Charset charset25 = outputSettings21.charset();
        org.jsoup.nodes.Document.OutputSettings outputSettings27 = outputSettings21.forceAllElementAsBlock(false);
        org.jsoup.nodes.Document.OutputSettings outputSettings29 = outputSettings27.indentAmount((int) ' ');
        org.jsoup.nodes.Document.OutputSettings outputSettings31 = outputSettings29.prettyPrint(false);
        org.jsoup.nodes.Document.OutputSettings outputSettings32 = new org.jsoup.nodes.Document.OutputSettings();
        boolean boolean33 = outputSettings32.prettyPrint();
        org.jsoup.nodes.Entities.EscapeMode escapeMode34 = outputSettings32.escapeMode();
        boolean boolean35 = outputSettings32.forceAllElementAsBlock();
        org.jsoup.nodes.Document.OutputSettings outputSettings36 = new org.jsoup.nodes.Document.OutputSettings();
        boolean boolean37 = outputSettings36.prettyPrint();
        org.jsoup.nodes.Entities.EscapeMode escapeMode38 = outputSettings36.escapeMode();
        org.jsoup.nodes.Document.OutputSettings outputSettings39 = outputSettings32.escapeMode(escapeMode38);
        org.jsoup.nodes.Document.OutputSettings outputSettings40 = outputSettings29.escapeMode(escapeMode38);
        boolean boolean41 = textNode6.equals((java.lang.Object) outputSettings40);
        org.jsoup.nodes.Document.OutputSettings outputSettings43 = outputSettings40.indentAmount((int) ' ');
        org.jsoup.nodes.Document.OutputSettings outputSettings45 = outputSettings40.prettyPrint(true);
        org.junit.Assert.assertNotNull(textNode2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(textNode6);
        org.junit.Assert.assertNotNull(node7);
        org.junit.Assert.assertNotNull(node9);
        org.junit.Assert.assertNotNull(nodeList10);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertNotNull(nodeList13);
        org.junit.Assert.assertNotNull(textNode15);
        org.junit.Assert.assertNull(node16);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertNotNull(textNode20);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertNotNull(outputSettings24);
        org.junit.Assert.assertNotNull(charset25);
        org.junit.Assert.assertNotNull(outputSettings27);
        org.junit.Assert.assertNotNull(outputSettings29);
        org.junit.Assert.assertNotNull(outputSettings31);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + true + "'", boolean33 == true);
        org.junit.Assert.assertTrue("'" + escapeMode34 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode34.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + true + "'", boolean37 == true);
        org.junit.Assert.assertTrue("'" + escapeMode38 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode38.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertNotNull(outputSettings39);
        org.junit.Assert.assertNotNull(outputSettings40);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertNotNull(outputSettings43);
        org.junit.Assert.assertNotNull(outputSettings45);
    }

    @Test
    public void test20663() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20663");
        org.jsoup.nodes.Document.OutputSettings outputSettings0 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Entities.EscapeMode escapeMode1 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings2 = outputSettings0.escapeMode(escapeMode1);
        boolean boolean3 = outputSettings0.forceAllElementAsBlock();
        org.jsoup.nodes.Document.OutputSettings outputSettings5 = outputSettings0.indentAmount((int) (byte) 0);
        org.jsoup.nodes.Document.OutputSettings outputSettings6 = new org.jsoup.nodes.Document.OutputSettings();
        int int7 = outputSettings6.indentAmount();
        org.jsoup.nodes.Document.OutputSettings outputSettings9 = outputSettings6.forceAllElementAsBlock(true);
        boolean boolean10 = outputSettings6.forceAllElementAsBlock();
        int int11 = outputSettings6.indentAmount();
        org.jsoup.nodes.Entities.EscapeMode escapeMode12 = outputSettings6.escapeMode();
        org.jsoup.nodes.Document.OutputSettings outputSettings13 = outputSettings5.escapeMode(escapeMode12);
        org.jsoup.nodes.Entities.EscapeMode escapeMode14 = outputSettings13.escapeMode();
        org.jsoup.nodes.Document.OutputSettings outputSettings16 = outputSettings13.prettyPrint(true);
        org.junit.Assert.assertNotNull(outputSettings2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(outputSettings5);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertNotNull(outputSettings9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertTrue("'" + escapeMode12 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode12.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertNotNull(outputSettings13);
        org.junit.Assert.assertTrue("'" + escapeMode14 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode14.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertNotNull(outputSettings16);
    }

    @Test
    public void test20664() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20664");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("hi!", "hi!");
        java.lang.String str4 = textNode2.absUrl("hi!");
        org.jsoup.nodes.TextNode textNode6 = textNode2.text("");
        org.jsoup.nodes.Node node7 = textNode6.clone();
        boolean boolean9 = textNode6.hasAttr("#text");
        boolean boolean11 = textNode6.hasAttr("#text");
        java.lang.String str12 = textNode6.text();
        java.util.List<org.jsoup.nodes.Node> nodeList13 = textNode6.siblingNodes();
        org.jsoup.nodes.Node node16 = textNode6.attr("h", "i!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(textNode6);
        org.junit.Assert.assertNotNull(node7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertNotNull(nodeList13);
        org.junit.Assert.assertNotNull(node16);
    }

    @Test
    public void test20665() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20665");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("hi!", "hi!");
        java.lang.String str3 = textNode2.toString();
        java.lang.String str4 = textNode2.getWholeText();
        org.jsoup.nodes.Node node6 = textNode2.removeAttr("#");
        org.junit.Assert.assertNotNull(textNode2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertNotNull(node6);
    }

    @Test
    public void test20666() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20666");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("", "");
        java.lang.String str3 = textNode2.getWholeText();
        java.lang.String str4 = textNode2.getWholeText();
        java.lang.String str5 = textNode2.text();
        java.lang.String str6 = textNode2.getWholeText();
        java.lang.String str7 = textNode2.nodeName();
        org.jsoup.nodes.TextNode textNode9 = textNode2.text("");
        java.lang.String str10 = textNode9.outerHtml();
        org.jsoup.nodes.Attributes attributes11 = textNode9.attributes();
        java.lang.String str13 = textNode9.attr("");
        org.junit.Assert.assertNotNull(textNode2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "#text" + "'", str7, "#text");
        org.junit.Assert.assertNotNull(textNode9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNotNull(attributes11);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
    }

    @Test
    public void test20667() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20667");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("", "");
        java.lang.String str3 = textNode2.getWholeText();
        java.lang.String str4 = textNode2.baseUri();
        org.jsoup.nodes.TextNode textNode6 = textNode2.text("hi!");
        java.lang.String str7 = textNode2.baseUri();
        org.jsoup.nodes.Node node8 = textNode2.parent();
        org.jsoup.nodes.Node node11 = textNode2.attr("#text", "hi!");
        java.lang.String str12 = textNode2.text();
        org.jsoup.nodes.Node node13 = textNode2.clone();
        org.junit.Assert.assertNotNull(textNode2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(textNode6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNull(node8);
        org.junit.Assert.assertNotNull(node11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertNotNull(node13);
    }

    @Test
    public void test20668() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20668");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("hi!", "");
        java.lang.String str3 = textNode2.baseUri();
        boolean boolean5 = textNode2.hasAttr("");
        java.lang.String str6 = textNode2.getWholeText();
        org.jsoup.nodes.Node node8 = textNode2.removeAttr("i!");
        org.jsoup.nodes.Node node11 = textNode2.attr("i!", "hi!");
        org.jsoup.nodes.Node node12 = node11.nextSibling();
        org.jsoup.nodes.TextNode textNode15 = org.jsoup.nodes.TextNode.createFromEncoded("", "");
        org.jsoup.nodes.TextNode textNode17 = textNode15.text("");
        org.jsoup.nodes.Node node18 = textNode15.previousSibling();
        boolean boolean20 = textNode15.hasAttr("hi!");
        java.lang.String str21 = textNode15.getWholeText();
        org.jsoup.nodes.TextNode textNode23 = textNode15.text("#text");
        boolean boolean25 = textNode23.hasAttr("");
        org.jsoup.nodes.TextNode textNode28 = org.jsoup.nodes.TextNode.createFromEncoded("", "");
        java.lang.String str29 = textNode28.toString();
        java.util.List<org.jsoup.nodes.Node> nodeList30 = textNode28.childNodes();
        org.jsoup.nodes.Node node32 = textNode28.removeAttr("hi!");
        boolean boolean33 = textNode23.equals((java.lang.Object) textNode28);
        java.lang.String str34 = textNode28.baseUri();
        org.jsoup.nodes.TextNode textNode36 = textNode28.text("i!");
        java.util.List<org.jsoup.nodes.Node> nodeList37 = textNode36.siblingNodes();
        org.jsoup.nodes.Node node38 = textNode36.previousSibling();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node39 = node11.after((org.jsoup.nodes.Node) textNode36);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(textNode2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertNotNull(node8);
        org.junit.Assert.assertNotNull(node11);
        org.junit.Assert.assertNull(node12);
        org.junit.Assert.assertNotNull(textNode15);
        org.junit.Assert.assertNotNull(textNode17);
        org.junit.Assert.assertNull(node18);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertNotNull(textNode23);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNotNull(textNode28);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "" + "'", str29, "");
        org.junit.Assert.assertNotNull(nodeList30);
        org.junit.Assert.assertNotNull(node32);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "" + "'", str34, "");
        org.junit.Assert.assertNotNull(textNode36);
        org.junit.Assert.assertNotNull(nodeList37);
        org.junit.Assert.assertNull(node38);
    }

    @Test
    public void test20669() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20669");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("", "");
        boolean boolean3 = textNode2.isBlank();
        org.jsoup.nodes.Document.OutputSettings outputSettings4 = new org.jsoup.nodes.Document.OutputSettings();
        boolean boolean5 = outputSettings4.prettyPrint();
        boolean boolean6 = textNode2.equals((java.lang.Object) boolean5);
        java.lang.String str7 = textNode2.nodeName();
        org.jsoup.nodes.Node node8 = textNode2.clone();
        java.lang.String str9 = textNode2.nodeName();
        boolean boolean11 = textNode2.hasAttr("i!");
        org.junit.Assert.assertNotNull(textNode2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "#text" + "'", str7, "#text");
        org.junit.Assert.assertNotNull(node8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "#text" + "'", str9, "#text");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test20670() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20670");
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
        java.lang.String str43 = textNode17.attr("i!");
        boolean boolean44 = textNode17.isBlank();
        java.lang.String str45 = textNode17.getWholeText();
        org.jsoup.nodes.TextNode textNode48 = org.jsoup.nodes.TextNode.createFromEncoded("", "");
        java.lang.String str49 = textNode48.baseUri();
        boolean boolean51 = textNode48.hasAttr("#text");
        java.lang.String str53 = textNode48.attr("");
        boolean boolean55 = textNode48.hasAttr("#text");
        java.lang.String str56 = textNode48.text();
        org.jsoup.nodes.TextNode textNode58 = textNode48.text("hi!");
        java.lang.String str59 = textNode58.getWholeText();
        int int60 = textNode58.siblingIndex();
        org.jsoup.nodes.TextNode textNode63 = org.jsoup.nodes.TextNode.createFromEncoded("", "");
        java.lang.String str64 = textNode63.getWholeText();
        java.lang.String str65 = textNode63.outerHtml();
        java.lang.String str66 = textNode63.baseUri();
        java.lang.String str67 = textNode63.toString();
        org.jsoup.nodes.TextNode textNode69 = textNode63.text("hi!");
        java.lang.String str70 = textNode69.toString();
        java.lang.String str71 = textNode69.baseUri();
        boolean boolean72 = textNode58.equals((java.lang.Object) textNode69);
        textNode69.setBaseUri("i!");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node75 = textNode17.after((org.jsoup.nodes.Node) textNode69);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(textNode5);
        org.junit.Assert.assertNotNull(textNode7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNull(document9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(textNode13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertNotNull(textNode17);
        org.junit.Assert.assertNotNull(node18);
        org.junit.Assert.assertNotNull(node20);
        org.junit.Assert.assertNotNull(nodeList21);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertNotNull(outputSettings27);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertTrue("'" + escapeMode30 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode30.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 1 + "'", int31 == 1);
        org.junit.Assert.assertNotNull(outputSettings33);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + true + "'", boolean35 == true);
        org.junit.Assert.assertTrue("'" + escapeMode36 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode36.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertNotNull(outputSettings37);
        org.junit.Assert.assertNotNull(outputSettings38);
        org.junit.Assert.assertTrue("'" + escapeMode39 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode39.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertEquals("'" + str43 + "' != '" + "" + "'", str43, "");
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertEquals("'" + str45 + "' != '" + "hi!" + "'", str45, "hi!");
        org.junit.Assert.assertNotNull(textNode48);
        org.junit.Assert.assertEquals("'" + str49 + "' != '" + "" + "'", str49, "");
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
        org.junit.Assert.assertEquals("'" + str53 + "' != '" + "" + "'", str53, "");
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + false + "'", boolean55 == false);
        org.junit.Assert.assertEquals("'" + str56 + "' != '" + "" + "'", str56, "");
        org.junit.Assert.assertNotNull(textNode58);
        org.junit.Assert.assertEquals("'" + str59 + "' != '" + "hi!" + "'", str59, "hi!");
        org.junit.Assert.assertTrue("'" + int60 + "' != '" + 0 + "'", int60 == 0);
        org.junit.Assert.assertNotNull(textNode63);
        org.junit.Assert.assertEquals("'" + str64 + "' != '" + "" + "'", str64, "");
        org.junit.Assert.assertEquals("'" + str65 + "' != '" + "" + "'", str65, "");
        org.junit.Assert.assertEquals("'" + str66 + "' != '" + "" + "'", str66, "");
        org.junit.Assert.assertEquals("'" + str67 + "' != '" + "" + "'", str67, "");
        org.junit.Assert.assertNotNull(textNode69);
        org.junit.Assert.assertEquals("'" + str70 + "' != '" + "hi!" + "'", str70, "hi!");
        org.junit.Assert.assertEquals("'" + str71 + "' != '" + "" + "'", str71, "");
        org.junit.Assert.assertTrue("'" + boolean72 + "' != '" + false + "'", boolean72 == false);
    }

    @Test
    public void test20671() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20671");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("", "");
        java.lang.String str3 = textNode2.getWholeText();
        java.lang.String str4 = textNode2.outerHtml();
        boolean boolean6 = textNode2.hasAttr("hi!");
        org.jsoup.nodes.Node node8 = textNode2.removeAttr("hi!");
        textNode2.setBaseUri("");
        java.lang.String str11 = textNode2.getWholeText();
        int int12 = textNode2.siblingIndex();
        java.lang.String str13 = textNode2.getWholeText();
        org.jsoup.nodes.TextNode textNode15 = textNode2.text("i!");
        org.jsoup.nodes.Attributes attributes16 = textNode15.attributes();
        java.lang.String str17 = textNode15.text();
        boolean boolean18 = textNode15.isBlank();
        java.lang.String str19 = textNode15.outerHtml();
        org.jsoup.nodes.TextNode textNode22 = org.jsoup.nodes.TextNode.createFromEncoded("", "");
        boolean boolean23 = textNode22.isBlank();
        org.jsoup.nodes.Document.OutputSettings outputSettings24 = new org.jsoup.nodes.Document.OutputSettings();
        boolean boolean25 = outputSettings24.prettyPrint();
        boolean boolean26 = textNode22.equals((java.lang.Object) boolean25);
        java.lang.String str27 = textNode22.outerHtml();
        org.jsoup.nodes.TextNode textNode30 = org.jsoup.nodes.TextNode.createFromEncoded("", "");
        org.jsoup.nodes.TextNode textNode32 = textNode30.text("");
        org.jsoup.nodes.TextNode textNode34 = textNode32.text("#text");
        textNode32.setBaseUri("#text");
        textNode32.setBaseUri("hi!");
        boolean boolean39 = textNode22.equals((java.lang.Object) textNode32);
        java.util.List<org.jsoup.nodes.Node> nodeList40 = textNode22.siblingNodes();
        java.lang.String str41 = textNode22.text();
        org.jsoup.nodes.Node node42 = textNode22.clone();
        boolean boolean43 = textNode22.isBlank();
        org.jsoup.nodes.Node node46 = textNode22.attr("h", "hi!");
        java.lang.String str48 = textNode22.attr("h");
        java.lang.String str49 = textNode22.getWholeText();
        org.jsoup.nodes.Node node52 = textNode22.attr("i!", "");
        // The following exception was thrown during execution in test generation
        try {
            textNode15.replaceWith(node52);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(textNode2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(node8);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNotNull(textNode15);
        org.junit.Assert.assertNotNull(attributes16);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "i!" + "'", str17, "i!");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "i!" + "'", str19, "i!");
        org.junit.Assert.assertNotNull(textNode22);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "" + "'", str27, "");
        org.junit.Assert.assertNotNull(textNode30);
        org.junit.Assert.assertNotNull(textNode32);
        org.junit.Assert.assertNotNull(textNode34);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertNotNull(nodeList40);
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "" + "'", str41, "");
        org.junit.Assert.assertNotNull(node42);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + true + "'", boolean43 == true);
        org.junit.Assert.assertNotNull(node46);
        org.junit.Assert.assertEquals("'" + str48 + "' != '" + "hi!" + "'", str48, "hi!");
        org.junit.Assert.assertEquals("'" + str49 + "' != '" + "" + "'", str49, "");
        org.junit.Assert.assertNotNull(node52);
    }

    @Test
    public void test20672() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20672");
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
        org.jsoup.nodes.Node node19 = textNode2.parent();
        boolean boolean21 = textNode2.hasAttr("#text");
        java.lang.String str22 = textNode2.nodeName();
        java.lang.String str23 = textNode2.outerHtml();
        boolean boolean25 = textNode2.hasAttr("hi!");
        boolean boolean26 = textNode2.isBlank();
        org.jsoup.nodes.Node node27 = textNode2.clone();
        org.jsoup.nodes.Node node28 = textNode2.previousSibling();
        org.junit.Assert.assertNotNull(textNode2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNull(node4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(textNode8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + escapeMode12 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode12.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertNotNull(outputSettings15);
        org.junit.Assert.assertNotNull(charset16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNull(node19);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "#text" + "'", str22, "#text");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertNotNull(node27);
        org.junit.Assert.assertNull(node28);
    }

    @Test
    public void test20673() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20673");
        org.jsoup.nodes.Document.OutputSettings outputSettings0 = new org.jsoup.nodes.Document.OutputSettings();
        int int1 = outputSettings0.indentAmount();
        boolean boolean2 = outputSettings0.prettyPrint();
        org.jsoup.nodes.Document.OutputSettings outputSettings3 = new org.jsoup.nodes.Document.OutputSettings();
        boolean boolean4 = outputSettings3.prettyPrint();
        org.jsoup.nodes.Document.OutputSettings outputSettings6 = outputSettings3.prettyPrint(true);
        java.nio.charset.Charset charset7 = outputSettings3.charset();
        org.jsoup.nodes.Document.OutputSettings outputSettings9 = outputSettings3.forceAllElementAsBlock(false);
        org.jsoup.nodes.Document.OutputSettings outputSettings10 = new org.jsoup.nodes.Document.OutputSettings();
        int int11 = outputSettings10.indentAmount();
        org.jsoup.nodes.Document.OutputSettings outputSettings13 = outputSettings10.forceAllElementAsBlock(true);
        java.nio.charset.Charset charset14 = outputSettings10.charset();
        org.jsoup.nodes.Document.OutputSettings outputSettings15 = new org.jsoup.nodes.Document.OutputSettings();
        boolean boolean16 = outputSettings15.prettyPrint();
        org.jsoup.nodes.Document.OutputSettings outputSettings18 = outputSettings15.prettyPrint(true);
        org.jsoup.nodes.Document.OutputSettings outputSettings19 = new org.jsoup.nodes.Document.OutputSettings();
        boolean boolean20 = outputSettings19.prettyPrint();
        org.jsoup.nodes.Entities.EscapeMode escapeMode21 = outputSettings19.escapeMode();
        int int22 = outputSettings19.indentAmount();
        org.jsoup.nodes.Document.OutputSettings outputSettings24 = outputSettings19.prettyPrint(false);
        org.jsoup.nodes.Document.OutputSettings outputSettings25 = new org.jsoup.nodes.Document.OutputSettings();
        boolean boolean26 = outputSettings25.prettyPrint();
        org.jsoup.nodes.Entities.EscapeMode escapeMode27 = outputSettings25.escapeMode();
        org.jsoup.nodes.Document.OutputSettings outputSettings28 = outputSettings24.escapeMode(escapeMode27);
        org.jsoup.nodes.Document.OutputSettings outputSettings29 = outputSettings15.escapeMode(escapeMode27);
        org.jsoup.nodes.Document.OutputSettings outputSettings30 = outputSettings10.escapeMode(escapeMode27);
        org.jsoup.nodes.Document.OutputSettings outputSettings31 = outputSettings9.escapeMode(escapeMode27);
        org.jsoup.nodes.Entities.EscapeMode escapeMode32 = outputSettings31.escapeMode();
        org.jsoup.nodes.Document.OutputSettings outputSettings33 = outputSettings0.escapeMode(escapeMode32);
        org.jsoup.nodes.Document.OutputSettings outputSettings35 = outputSettings0.indentAmount(97);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1 + "'", int1 == 1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(outputSettings6);
        org.junit.Assert.assertNotNull(charset7);
        org.junit.Assert.assertNotNull(outputSettings9);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertNotNull(outputSettings13);
        org.junit.Assert.assertNotNull(charset14);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertNotNull(outputSettings18);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + escapeMode21 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode21.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 1 + "'", int22 == 1);
        org.junit.Assert.assertNotNull(outputSettings24);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertTrue("'" + escapeMode27 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode27.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertNotNull(outputSettings28);
        org.junit.Assert.assertNotNull(outputSettings29);
        org.junit.Assert.assertNotNull(outputSettings30);
        org.junit.Assert.assertNotNull(outputSettings31);
        org.junit.Assert.assertTrue("'" + escapeMode32 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode32.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertNotNull(outputSettings33);
        org.junit.Assert.assertNotNull(outputSettings35);
    }

    @Test
    public void test20674() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20674");
        org.jsoup.nodes.Document.OutputSettings outputSettings0 = new org.jsoup.nodes.Document.OutputSettings();
        boolean boolean1 = outputSettings0.prettyPrint();
        org.jsoup.nodes.Document.OutputSettings outputSettings3 = outputSettings0.prettyPrint(true);
        java.nio.charset.Charset charset4 = outputSettings0.charset();
        org.jsoup.nodes.Document.OutputSettings outputSettings6 = outputSettings0.forceAllElementAsBlock(false);
        org.jsoup.nodes.Document.OutputSettings outputSettings7 = new org.jsoup.nodes.Document.OutputSettings();
        int int8 = outputSettings7.indentAmount();
        org.jsoup.nodes.Document.OutputSettings outputSettings10 = outputSettings7.forceAllElementAsBlock(true);
        java.nio.charset.Charset charset11 = outputSettings7.charset();
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
        org.jsoup.nodes.Document.OutputSettings outputSettings27 = outputSettings7.escapeMode(escapeMode24);
        org.jsoup.nodes.Document.OutputSettings outputSettings28 = outputSettings6.escapeMode(escapeMode24);
        java.nio.charset.Charset charset29 = outputSettings28.charset();
        java.nio.charset.Charset charset30 = outputSettings28.charset();
        boolean boolean31 = outputSettings28.forceAllElementAsBlock();
        org.jsoup.nodes.Document.OutputSettings outputSettings32 = outputSettings28.clone();
        boolean boolean33 = outputSettings32.forceAllElementAsBlock();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertNotNull(outputSettings3);
        org.junit.Assert.assertNotNull(charset4);
        org.junit.Assert.assertNotNull(outputSettings6);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertNotNull(outputSettings10);
        org.junit.Assert.assertNotNull(charset11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNotNull(outputSettings15);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + escapeMode18 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode18.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 1 + "'", int19 == 1);
        org.junit.Assert.assertNotNull(outputSettings21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + escapeMode24 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode24.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertNotNull(outputSettings25);
        org.junit.Assert.assertNotNull(outputSettings26);
        org.junit.Assert.assertNotNull(outputSettings27);
        org.junit.Assert.assertNotNull(outputSettings28);
        org.junit.Assert.assertNotNull(charset29);
        org.junit.Assert.assertNotNull(charset30);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertNotNull(outputSettings32);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
    }

    @Test
    public void test20675() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20675");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("", "");
        org.jsoup.nodes.TextNode textNode4 = textNode2.text("");
        org.jsoup.nodes.TextNode textNode6 = textNode4.text("#text");
        java.util.List<org.jsoup.nodes.Node> nodeList7 = textNode6.childNodes();
        org.jsoup.nodes.Node node8 = textNode6.clone();
        boolean boolean10 = textNode6.hasAttr("hi!");
        org.jsoup.nodes.TextNode textNode12 = textNode6.splitText((int) (short) 1);
        org.jsoup.nodes.Document document13 = textNode6.ownerDocument();
        org.junit.Assert.assertNotNull(textNode2);
        org.junit.Assert.assertNotNull(textNode4);
        org.junit.Assert.assertNotNull(textNode6);
        org.junit.Assert.assertNotNull(nodeList7);
        org.junit.Assert.assertNotNull(node8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(textNode12);
        org.junit.Assert.assertNull(document13);
    }

    @Test
    public void test20676() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20676");
        org.jsoup.nodes.Document.OutputSettings outputSettings0 = new org.jsoup.nodes.Document.OutputSettings();
        int int1 = outputSettings0.indentAmount();
        org.jsoup.nodes.Document.OutputSettings outputSettings3 = outputSettings0.forceAllElementAsBlock(true);
        boolean boolean4 = outputSettings0.forceAllElementAsBlock();
        org.jsoup.nodes.Document.OutputSettings outputSettings6 = outputSettings0.indentAmount((int) (byte) 10);
        int int7 = outputSettings6.indentAmount();
        org.jsoup.nodes.Document.OutputSettings outputSettings8 = outputSettings6.clone();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1 + "'", int1 == 1);
        org.junit.Assert.assertNotNull(outputSettings3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(outputSettings6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 10 + "'", int7 == 10);
        org.junit.Assert.assertNotNull(outputSettings8);
    }

    @Test
    public void test20677() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20677");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("", "");
        org.jsoup.nodes.TextNode textNode4 = textNode2.text("");
        org.jsoup.nodes.TextNode textNode6 = textNode4.text("#text");
        java.lang.String str7 = textNode4.toString();
        java.util.List<org.jsoup.nodes.Node> nodeList8 = textNode4.siblingNodes();
        java.lang.String str9 = textNode4.nodeName();
        org.jsoup.nodes.TextNode textNode11 = textNode4.text("#text");
        java.util.List<org.jsoup.nodes.Node> nodeList12 = textNode4.childNodes();
        java.lang.String str13 = textNode4.baseUri();
        org.junit.Assert.assertNotNull(textNode2);
        org.junit.Assert.assertNotNull(textNode4);
        org.junit.Assert.assertNotNull(textNode6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "#text" + "'", str7, "#text");
        org.junit.Assert.assertNotNull(nodeList8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "#text" + "'", str9, "#text");
        org.junit.Assert.assertNotNull(textNode11);
        org.junit.Assert.assertNotNull(nodeList12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
    }

    @Test
    public void test20678() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20678");
        org.jsoup.nodes.Document.OutputSettings outputSettings0 = new org.jsoup.nodes.Document.OutputSettings();
        int int1 = outputSettings0.indentAmount();
        org.jsoup.nodes.Document.OutputSettings outputSettings3 = outputSettings0.forceAllElementAsBlock(true);
        org.jsoup.nodes.Document.OutputSettings outputSettings5 = outputSettings0.prettyPrint(true);
        java.nio.charset.Charset charset6 = outputSettings0.charset();
        org.jsoup.nodes.Document.OutputSettings outputSettings8 = outputSettings0.prettyPrint(false);
        org.jsoup.nodes.Document.OutputSettings outputSettings10 = outputSettings8.forceAllElementAsBlock(false);
        org.jsoup.nodes.Entities.EscapeMode escapeMode11 = outputSettings8.escapeMode();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1 + "'", int1 == 1);
        org.junit.Assert.assertNotNull(outputSettings3);
        org.junit.Assert.assertNotNull(outputSettings5);
        org.junit.Assert.assertNotNull(charset6);
        org.junit.Assert.assertNotNull(outputSettings8);
        org.junit.Assert.assertNotNull(outputSettings10);
        org.junit.Assert.assertTrue("'" + escapeMode11 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode11.equals(org.jsoup.nodes.Entities.EscapeMode.base));
    }

    @Test
    public void test20679() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20679");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("", "");
        java.lang.String str3 = textNode2.getWholeText();
        java.lang.String str4 = textNode2.outerHtml();
        java.lang.String str5 = textNode2.baseUri();
        java.lang.String str6 = textNode2.toString();
        org.jsoup.nodes.Node node7 = textNode2.nextSibling();
        boolean boolean8 = textNode2.isBlank();
        java.util.List<org.jsoup.nodes.Node> nodeList9 = textNode2.siblingNodes();
        java.lang.String str10 = textNode2.text();
        java.util.List<org.jsoup.nodes.Node> nodeList11 = textNode2.siblingNodes();
        org.junit.Assert.assertNotNull(textNode2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNull(node7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(nodeList9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNotNull(nodeList11);
    }

    @Test
    public void test20680() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20680");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("", "");
        java.lang.String str3 = textNode2.toString();
        org.jsoup.nodes.Node node4 = textNode2.nextSibling();
        java.lang.String str5 = textNode2.outerHtml();
        org.jsoup.nodes.Document document6 = textNode2.ownerDocument();
        java.lang.String str7 = textNode2.toString();
        java.lang.String str8 = textNode2.toString();
        org.junit.Assert.assertNotNull(textNode2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertNull(node4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNull(document6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
    }

    @Test
    public void test20681() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20681");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("", "");
        java.lang.String str3 = textNode2.baseUri();
        boolean boolean5 = textNode2.hasAttr("#text");
        java.lang.String str7 = textNode2.attr("");
        boolean boolean9 = textNode2.hasAttr("#text");
        java.lang.String str10 = textNode2.text();
        int int11 = textNode2.siblingIndex();
        textNode2.setBaseUri("hi!");
        boolean boolean14 = textNode2.isBlank();
        textNode2.setBaseUri("hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList17 = textNode2.childNodes();
        org.jsoup.nodes.Node node18 = textNode2.parent();
        boolean boolean20 = textNode2.hasAttr("i!");
        org.junit.Assert.assertNotNull(textNode2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNotNull(nodeList17);
        org.junit.Assert.assertNull(node18);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
    }

    @Test
    public void test20682() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20682");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("", "");
        org.jsoup.nodes.TextNode textNode4 = textNode2.text("");
        org.jsoup.nodes.Node node5 = textNode2.previousSibling();
        boolean boolean7 = textNode2.hasAttr("hi!");
        java.lang.String str8 = textNode2.getWholeText();
        org.jsoup.nodes.TextNode textNode10 = textNode2.text("#text");
        java.lang.String str11 = textNode10.nodeName();
        java.util.List<org.jsoup.nodes.Node> nodeList12 = textNode10.childNodes();
        org.jsoup.nodes.Node node13 = textNode10.previousSibling();
        java.lang.String str14 = textNode10.text();
        java.lang.String str15 = textNode10.text();
        java.util.List<org.jsoup.nodes.Node> nodeList16 = textNode10.childNodes();
        org.jsoup.nodes.Node node19 = textNode10.attr("#", "");
        java.lang.String str20 = textNode10.baseUri();
        java.lang.String str21 = textNode10.outerHtml();
        org.junit.Assert.assertNotNull(textNode2);
        org.junit.Assert.assertNotNull(textNode4);
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNotNull(textNode10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "#text" + "'", str11, "#text");
        org.junit.Assert.assertNotNull(nodeList12);
        org.junit.Assert.assertNull(node13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "#text" + "'", str14, "#text");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "#text" + "'", str15, "#text");
        org.junit.Assert.assertNotNull(nodeList16);
        org.junit.Assert.assertNotNull(node19);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "#text" + "'", str21, "#text");
    }

    @Test
    public void test20683() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20683");
        org.jsoup.nodes.Document.OutputSettings outputSettings0 = new org.jsoup.nodes.Document.OutputSettings();
        boolean boolean1 = outputSettings0.prettyPrint();
        org.jsoup.nodes.Document.OutputSettings outputSettings3 = outputSettings0.prettyPrint(true);
        org.jsoup.nodes.Document.OutputSettings outputSettings4 = new org.jsoup.nodes.Document.OutputSettings();
        boolean boolean5 = outputSettings4.prettyPrint();
        org.jsoup.nodes.Entities.EscapeMode escapeMode6 = outputSettings4.escapeMode();
        int int7 = outputSettings4.indentAmount();
        org.jsoup.nodes.Document.OutputSettings outputSettings9 = outputSettings4.prettyPrint(false);
        org.jsoup.nodes.Document.OutputSettings outputSettings10 = new org.jsoup.nodes.Document.OutputSettings();
        boolean boolean11 = outputSettings10.prettyPrint();
        org.jsoup.nodes.Entities.EscapeMode escapeMode12 = outputSettings10.escapeMode();
        org.jsoup.nodes.Document.OutputSettings outputSettings13 = outputSettings9.escapeMode(escapeMode12);
        org.jsoup.nodes.Document.OutputSettings outputSettings14 = outputSettings0.escapeMode(escapeMode12);
        org.jsoup.nodes.Entities.EscapeMode escapeMode15 = outputSettings0.escapeMode();
        org.jsoup.nodes.Document.OutputSettings outputSettings16 = outputSettings0.clone();
        org.jsoup.nodes.Document.OutputSettings outputSettings17 = outputSettings0.clone();
        org.jsoup.nodes.Document.OutputSettings outputSettings19 = outputSettings0.indentAmount((int) (byte) 1);
        org.jsoup.nodes.Entities.EscapeMode escapeMode20 = outputSettings0.escapeMode();
        org.jsoup.nodes.Document.OutputSettings outputSettings22 = outputSettings0.prettyPrint(true);
        org.jsoup.nodes.Document.OutputSettings outputSettings23 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Entities.EscapeMode escapeMode24 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings25 = outputSettings23.escapeMode(escapeMode24);
        org.jsoup.nodes.Document.OutputSettings outputSettings27 = outputSettings25.prettyPrint(false);
        org.jsoup.nodes.Document.OutputSettings outputSettings29 = outputSettings25.indentAmount((int) ' ');
        int int30 = outputSettings29.indentAmount();
        org.jsoup.nodes.Document.OutputSettings outputSettings32 = outputSettings29.prettyPrint(false);
        org.jsoup.nodes.Document.OutputSettings outputSettings33 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Entities.EscapeMode escapeMode34 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings35 = outputSettings33.escapeMode(escapeMode34);
        boolean boolean36 = outputSettings33.forceAllElementAsBlock();
        org.jsoup.nodes.Document.OutputSettings outputSettings37 = new org.jsoup.nodes.Document.OutputSettings();
        boolean boolean38 = outputSettings37.prettyPrint();
        org.jsoup.nodes.Entities.EscapeMode escapeMode39 = outputSettings37.escapeMode();
        org.jsoup.nodes.Document.OutputSettings outputSettings40 = outputSettings33.escapeMode(escapeMode39);
        int int41 = outputSettings40.indentAmount();
        org.jsoup.nodes.Document.OutputSettings outputSettings42 = new org.jsoup.nodes.Document.OutputSettings();
        int int43 = outputSettings42.indentAmount();
        org.jsoup.nodes.Document.OutputSettings outputSettings45 = outputSettings42.forceAllElementAsBlock(true);
        boolean boolean46 = outputSettings42.forceAllElementAsBlock();
        int int47 = outputSettings42.indentAmount();
        org.jsoup.nodes.Entities.EscapeMode escapeMode48 = outputSettings42.escapeMode();
        org.jsoup.nodes.Document.OutputSettings outputSettings49 = outputSettings40.escapeMode(escapeMode48);
        org.jsoup.nodes.Document.OutputSettings outputSettings50 = outputSettings29.escapeMode(escapeMode48);
        org.jsoup.nodes.Entities.EscapeMode escapeMode51 = outputSettings29.escapeMode();
        org.jsoup.nodes.Document.OutputSettings outputSettings52 = outputSettings22.escapeMode(escapeMode51);
        org.jsoup.nodes.Document.OutputSettings outputSettings53 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Entities.EscapeMode escapeMode54 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings55 = outputSettings53.escapeMode(escapeMode54);
        int int56 = outputSettings53.indentAmount();
        java.nio.charset.Charset charset57 = outputSettings53.charset();
        org.jsoup.nodes.Document.OutputSettings outputSettings58 = outputSettings52.charset(charset57);
        org.jsoup.nodes.Document.OutputSettings outputSettings59 = outputSettings52.clone();
        boolean boolean60 = outputSettings59.forceAllElementAsBlock();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertNotNull(outputSettings3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + escapeMode6 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode6.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertNotNull(outputSettings9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + escapeMode12 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode12.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertNotNull(outputSettings13);
        org.junit.Assert.assertNotNull(outputSettings14);
        org.junit.Assert.assertTrue("'" + escapeMode15 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode15.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertNotNull(outputSettings16);
        org.junit.Assert.assertNotNull(outputSettings17);
        org.junit.Assert.assertNotNull(outputSettings19);
        org.junit.Assert.assertTrue("'" + escapeMode20 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode20.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertNotNull(outputSettings22);
        org.junit.Assert.assertNotNull(outputSettings25);
        org.junit.Assert.assertNotNull(outputSettings27);
        org.junit.Assert.assertNotNull(outputSettings29);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 32 + "'", int30 == 32);
        org.junit.Assert.assertNotNull(outputSettings32);
        org.junit.Assert.assertNotNull(outputSettings35);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + true + "'", boolean38 == true);
        org.junit.Assert.assertTrue("'" + escapeMode39 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode39.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertNotNull(outputSettings40);
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 1 + "'", int41 == 1);
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + 1 + "'", int43 == 1);
        org.junit.Assert.assertNotNull(outputSettings45);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + true + "'", boolean46 == true);
        org.junit.Assert.assertTrue("'" + int47 + "' != '" + 1 + "'", int47 == 1);
        org.junit.Assert.assertTrue("'" + escapeMode48 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode48.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertNotNull(outputSettings49);
        org.junit.Assert.assertNotNull(outputSettings50);
        org.junit.Assert.assertTrue("'" + escapeMode51 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode51.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertNotNull(outputSettings52);
        org.junit.Assert.assertNotNull(outputSettings55);
        org.junit.Assert.assertTrue("'" + int56 + "' != '" + 1 + "'", int56 == 1);
        org.junit.Assert.assertNotNull(charset57);
        org.junit.Assert.assertNotNull(outputSettings58);
        org.junit.Assert.assertNotNull(outputSettings59);
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + false + "'", boolean60 == false);
    }

    @Test
    public void test20684() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20684");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("hi!", "i!");
        org.jsoup.nodes.Document document3 = textNode2.ownerDocument();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node5 = textNode2.removeAttr("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: String must not be empty");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(textNode2);
        org.junit.Assert.assertNull(document3);
    }

    @Test
    public void test20685() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20685");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("hi!", "hi!");
        boolean boolean4 = textNode2.hasAttr("hi!");
        java.lang.String str5 = textNode2.getWholeText();
        java.lang.String str6 = textNode2.text();
        boolean boolean7 = textNode2.isBlank();
        java.lang.String str8 = textNode2.baseUri();
        org.jsoup.nodes.Document document9 = textNode2.ownerDocument();
        org.jsoup.nodes.Node node10 = textNode2.previousSibling();
        org.jsoup.nodes.Node node11 = textNode2.clone();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node13 = textNode2.removeAttr("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: String must not be empty");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertNull(document9);
        org.junit.Assert.assertNull(node10);
        org.junit.Assert.assertNotNull(node11);
    }

    @Test
    public void test20686() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20686");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("", "");
        java.lang.String str3 = textNode2.toString();
        int int4 = textNode2.siblingIndex();
        java.lang.String str5 = textNode2.nodeName();
        org.jsoup.nodes.Node node7 = textNode2.removeAttr("h");
        org.jsoup.nodes.Node node8 = node7.clone();
        java.util.List<org.jsoup.nodes.Node> nodeList9 = node8.childNodes();
        org.jsoup.nodes.Node node10 = node8.nextSibling();
        org.jsoup.nodes.TextNode textNode13 = new org.jsoup.nodes.TextNode("hi!", "hi!");
        java.lang.String str14 = textNode13.getWholeText();
        org.jsoup.nodes.TextNode textNode16 = textNode13.splitText(0);
        java.lang.String str17 = textNode13.getWholeText();
        org.jsoup.nodes.Node node19 = textNode13.removeAttr("hi!");
        org.jsoup.nodes.Node node20 = textNode13.clone();
        org.jsoup.nodes.Node node21 = textNode13.previousSibling();
        // The following exception was thrown during execution in test generation
        try {
            node10.replaceWith((org.jsoup.nodes.Node) textNode13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(textNode2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "#text" + "'", str5, "#text");
        org.junit.Assert.assertNotNull(node7);
        org.junit.Assert.assertNotNull(node8);
        org.junit.Assert.assertNotNull(nodeList9);
        org.junit.Assert.assertNull(node10);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertNotNull(textNode16);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertNotNull(node19);
        org.junit.Assert.assertNotNull(node20);
        org.junit.Assert.assertNull(node21);
    }

    @Test
    public void test20687() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20687");
        org.jsoup.nodes.Document.OutputSettings outputSettings0 = new org.jsoup.nodes.Document.OutputSettings();
        boolean boolean1 = outputSettings0.prettyPrint();
        org.jsoup.nodes.Entities.EscapeMode escapeMode2 = outputSettings0.escapeMode();
        boolean boolean3 = outputSettings0.forceAllElementAsBlock();
        org.jsoup.nodes.Document.OutputSettings outputSettings4 = new org.jsoup.nodes.Document.OutputSettings();
        boolean boolean5 = outputSettings4.prettyPrint();
        org.jsoup.nodes.Entities.EscapeMode escapeMode6 = outputSettings4.escapeMode();
        org.jsoup.nodes.Document.OutputSettings outputSettings7 = outputSettings0.escapeMode(escapeMode6);
        org.jsoup.nodes.Document.OutputSettings outputSettings9 = outputSettings0.prettyPrint(false);
        org.jsoup.nodes.Document.OutputSettings outputSettings10 = new org.jsoup.nodes.Document.OutputSettings();
        boolean boolean11 = outputSettings10.prettyPrint();
        org.jsoup.nodes.Entities.EscapeMode escapeMode12 = outputSettings10.escapeMode();
        boolean boolean13 = outputSettings10.forceAllElementAsBlock();
        org.jsoup.nodes.Document.OutputSettings outputSettings15 = outputSettings10.forceAllElementAsBlock(true);
        org.jsoup.nodes.Entities.EscapeMode escapeMode16 = outputSettings15.escapeMode();
        org.jsoup.nodes.Document.OutputSettings outputSettings17 = outputSettings15.clone();
        org.jsoup.nodes.Document.OutputSettings outputSettings18 = new org.jsoup.nodes.Document.OutputSettings();
        boolean boolean19 = outputSettings18.prettyPrint();
        org.jsoup.nodes.Document.OutputSettings outputSettings21 = outputSettings18.prettyPrint(true);
        org.jsoup.nodes.Document.OutputSettings outputSettings22 = new org.jsoup.nodes.Document.OutputSettings();
        boolean boolean23 = outputSettings22.prettyPrint();
        org.jsoup.nodes.Entities.EscapeMode escapeMode24 = outputSettings22.escapeMode();
        int int25 = outputSettings22.indentAmount();
        org.jsoup.nodes.Document.OutputSettings outputSettings27 = outputSettings22.prettyPrint(false);
        org.jsoup.nodes.Document.OutputSettings outputSettings28 = new org.jsoup.nodes.Document.OutputSettings();
        boolean boolean29 = outputSettings28.prettyPrint();
        org.jsoup.nodes.Entities.EscapeMode escapeMode30 = outputSettings28.escapeMode();
        org.jsoup.nodes.Document.OutputSettings outputSettings31 = outputSettings27.escapeMode(escapeMode30);
        org.jsoup.nodes.Document.OutputSettings outputSettings32 = outputSettings18.escapeMode(escapeMode30);
        org.jsoup.nodes.Entities.EscapeMode escapeMode33 = outputSettings18.escapeMode();
        org.jsoup.nodes.Document.OutputSettings outputSettings34 = outputSettings18.clone();
        org.jsoup.nodes.Document.OutputSettings outputSettings35 = outputSettings18.clone();
        org.jsoup.nodes.Document.OutputSettings outputSettings37 = outputSettings18.indentAmount((int) (byte) 1);
        java.nio.charset.Charset charset38 = outputSettings37.charset();
        org.jsoup.nodes.Document.OutputSettings outputSettings39 = outputSettings15.charset(charset38);
        boolean boolean40 = outputSettings39.forceAllElementAsBlock();
        org.jsoup.nodes.Document.OutputSettings outputSettings41 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Entities.EscapeMode escapeMode42 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings43 = outputSettings41.escapeMode(escapeMode42);
        org.jsoup.nodes.Document.OutputSettings outputSettings45 = outputSettings41.forceAllElementAsBlock(false);
        org.jsoup.nodes.Document.OutputSettings outputSettings46 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Entities.EscapeMode escapeMode47 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings48 = outputSettings46.escapeMode(escapeMode47);
        int int49 = outputSettings46.indentAmount();
        org.jsoup.nodes.Document.OutputSettings outputSettings50 = new org.jsoup.nodes.Document.OutputSettings();
        boolean boolean51 = outputSettings50.prettyPrint();
        org.jsoup.nodes.Document.OutputSettings outputSettings53 = outputSettings50.prettyPrint(true);
        java.nio.charset.Charset charset54 = outputSettings50.charset();
        org.jsoup.nodes.Document.OutputSettings outputSettings55 = outputSettings46.charset(charset54);
        org.jsoup.nodes.Document.OutputSettings outputSettings56 = outputSettings45.charset(charset54);
        org.jsoup.nodes.Document.OutputSettings outputSettings58 = outputSettings45.prettyPrint(false);
        java.nio.charset.Charset charset59 = outputSettings58.charset();
        java.nio.charset.Charset charset60 = outputSettings58.charset();
        org.jsoup.nodes.Document.OutputSettings outputSettings61 = outputSettings39.charset(charset60);
        org.jsoup.nodes.Document.OutputSettings outputSettings62 = outputSettings0.charset(charset60);
        org.jsoup.nodes.Document.OutputSettings outputSettings64 = outputSettings0.indentAmount((int) (byte) 10);
        org.jsoup.nodes.Document.OutputSettings outputSettings65 = outputSettings0.clone();
        java.nio.charset.Charset charset66 = outputSettings0.charset();
        int int67 = outputSettings0.indentAmount();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + escapeMode2 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode2.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + escapeMode6 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode6.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertNotNull(outputSettings7);
        org.junit.Assert.assertNotNull(outputSettings9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + escapeMode12 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode12.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(outputSettings15);
        org.junit.Assert.assertTrue("'" + escapeMode16 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode16.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertNotNull(outputSettings17);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertNotNull(outputSettings21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + escapeMode24 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode24.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 1 + "'", int25 == 1);
        org.junit.Assert.assertNotNull(outputSettings27);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertTrue("'" + escapeMode30 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode30.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertNotNull(outputSettings31);
        org.junit.Assert.assertNotNull(outputSettings32);
        org.junit.Assert.assertTrue("'" + escapeMode33 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode33.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertNotNull(outputSettings34);
        org.junit.Assert.assertNotNull(outputSettings35);
        org.junit.Assert.assertNotNull(outputSettings37);
        org.junit.Assert.assertNotNull(charset38);
        org.junit.Assert.assertNotNull(outputSettings39);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + true + "'", boolean40 == true);
        org.junit.Assert.assertNotNull(outputSettings43);
        org.junit.Assert.assertNotNull(outputSettings45);
        org.junit.Assert.assertNotNull(outputSettings48);
        org.junit.Assert.assertTrue("'" + int49 + "' != '" + 1 + "'", int49 == 1);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + true + "'", boolean51 == true);
        org.junit.Assert.assertNotNull(outputSettings53);
        org.junit.Assert.assertNotNull(charset54);
        org.junit.Assert.assertNotNull(outputSettings55);
        org.junit.Assert.assertNotNull(outputSettings56);
        org.junit.Assert.assertNotNull(outputSettings58);
        org.junit.Assert.assertNotNull(charset59);
        org.junit.Assert.assertNotNull(charset60);
        org.junit.Assert.assertNotNull(outputSettings61);
        org.junit.Assert.assertNotNull(outputSettings62);
        org.junit.Assert.assertNotNull(outputSettings64);
        org.junit.Assert.assertNotNull(outputSettings65);
        org.junit.Assert.assertNotNull(charset66);
        org.junit.Assert.assertTrue("'" + int67 + "' != '" + 10 + "'", int67 == 10);
    }

    @Test
    public void test20688() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20688");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("", "");
        boolean boolean3 = textNode2.isBlank();
        org.jsoup.nodes.Node node6 = textNode2.attr("hi!", "hi!");
        java.lang.String str8 = textNode2.attr("#text");
        java.lang.String str9 = textNode2.nodeName();
        java.util.List<org.jsoup.nodes.Node> nodeList10 = textNode2.childNodes();
        org.jsoup.nodes.Document document11 = textNode2.ownerDocument();
        java.lang.String str12 = textNode2.baseUri();
        java.util.List<org.jsoup.nodes.Node> nodeList13 = textNode2.siblingNodes();
        org.jsoup.select.NodeVisitor nodeVisitor14 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node15 = textNode2.traverse(nodeVisitor14);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(textNode2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(node6);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "#text" + "'", str9, "#text");
        org.junit.Assert.assertNotNull(nodeList10);
        org.junit.Assert.assertNull(document11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertNotNull(nodeList13);
    }

    @Test
    public void test20689() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20689");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("", "");
        java.lang.String str3 = textNode2.getWholeText();
        java.lang.String str4 = textNode2.baseUri();
        org.jsoup.nodes.TextNode textNode6 = textNode2.text("hi!");
        org.jsoup.nodes.Node node7 = textNode6.clone();
        org.jsoup.nodes.Node node9 = textNode6.removeAttr("hi!");
        java.lang.String str10 = textNode6.toString();
        java.util.List<org.jsoup.nodes.Node> nodeList11 = textNode6.siblingNodes();
        org.jsoup.nodes.Node node13 = textNode6.removeAttr("#text");
        boolean boolean15 = textNode6.hasAttr("hi!");
        boolean boolean16 = textNode6.isBlank();
        int int17 = textNode6.siblingIndex();
        java.lang.String str18 = textNode6.getWholeText();
        org.jsoup.nodes.Node node20 = textNode6.removeAttr("i!");
        org.junit.Assert.assertNotNull(textNode2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(textNode6);
        org.junit.Assert.assertNotNull(node7);
        org.junit.Assert.assertNotNull(node9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertNotNull(nodeList11);
        org.junit.Assert.assertNotNull(node13);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!" + "'", str18, "hi!");
        org.junit.Assert.assertNotNull(node20);
    }

    @Test
    public void test20690() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20690");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("", "");
        java.lang.String str3 = textNode2.getWholeText();
        java.lang.String str4 = textNode2.baseUri();
        org.jsoup.nodes.TextNode textNode6 = textNode2.text("hi!");
        org.jsoup.nodes.Node node7 = textNode6.clone();
        org.jsoup.nodes.Node node9 = textNode6.removeAttr("hi!");
        java.lang.String str10 = textNode6.baseUri();
        java.util.List<org.jsoup.nodes.Node> nodeList11 = textNode6.childNodes();
        java.lang.String str12 = textNode6.text();
        java.util.List<org.jsoup.nodes.Node> nodeList13 = textNode6.siblingNodes();
        boolean boolean15 = textNode6.hasAttr("h");
        textNode6.setBaseUri("");
        org.junit.Assert.assertNotNull(textNode2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(textNode6);
        org.junit.Assert.assertNotNull(node7);
        org.junit.Assert.assertNotNull(node9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNotNull(nodeList11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertNotNull(nodeList13);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test20691() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20691");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("", "");
        org.jsoup.nodes.TextNode textNode4 = textNode2.text("");
        boolean boolean6 = textNode4.hasAttr("");
        java.util.List<org.jsoup.nodes.Node> nodeList7 = textNode4.childNodes();
        org.jsoup.nodes.Node node10 = textNode4.attr("i!", "hi!");
        org.jsoup.nodes.Attributes attributes11 = textNode4.attributes();
        org.jsoup.nodes.Attributes attributes12 = textNode4.attributes();
        java.lang.String str13 = textNode4.outerHtml();
        java.util.List<org.jsoup.nodes.Node> nodeList14 = textNode4.childNodes();
        org.junit.Assert.assertNotNull(textNode2);
        org.junit.Assert.assertNotNull(textNode4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(nodeList7);
        org.junit.Assert.assertNotNull(node10);
        org.junit.Assert.assertNotNull(attributes11);
        org.junit.Assert.assertNotNull(attributes12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNotNull(nodeList14);
    }

    @Test
    public void test20692() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20692");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("", "hi!");
        java.lang.String str3 = textNode2.baseUri();
        org.jsoup.nodes.Attributes attributes4 = textNode2.attributes();
        org.jsoup.nodes.Document document5 = textNode2.ownerDocument();
        java.lang.String str6 = textNode2.toString();
        org.jsoup.nodes.Node node7 = textNode2.previousSibling();
        // The following exception was thrown during execution in test generation
        try {
            node7.setBaseUri("text");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertNotNull(attributes4);
        org.junit.Assert.assertNull(document5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNull(node7);
    }

    @Test
    public void test20693() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20693");
        org.jsoup.nodes.Document.OutputSettings outputSettings0 = new org.jsoup.nodes.Document.OutputSettings();
        boolean boolean1 = outputSettings0.prettyPrint();
        org.jsoup.nodes.Document.OutputSettings outputSettings3 = outputSettings0.prettyPrint(true);
        org.jsoup.nodes.Document.OutputSettings outputSettings4 = new org.jsoup.nodes.Document.OutputSettings();
        boolean boolean5 = outputSettings4.prettyPrint();
        org.jsoup.nodes.Entities.EscapeMode escapeMode6 = outputSettings4.escapeMode();
        int int7 = outputSettings4.indentAmount();
        org.jsoup.nodes.Document.OutputSettings outputSettings9 = outputSettings4.prettyPrint(false);
        org.jsoup.nodes.Document.OutputSettings outputSettings10 = new org.jsoup.nodes.Document.OutputSettings();
        boolean boolean11 = outputSettings10.prettyPrint();
        org.jsoup.nodes.Entities.EscapeMode escapeMode12 = outputSettings10.escapeMode();
        org.jsoup.nodes.Document.OutputSettings outputSettings13 = outputSettings9.escapeMode(escapeMode12);
        org.jsoup.nodes.Document.OutputSettings outputSettings14 = outputSettings0.escapeMode(escapeMode12);
        org.jsoup.nodes.Entities.EscapeMode escapeMode15 = outputSettings0.escapeMode();
        org.jsoup.nodes.Document.OutputSettings outputSettings16 = outputSettings0.clone();
        org.jsoup.nodes.Document.OutputSettings outputSettings17 = outputSettings0.clone();
        boolean boolean18 = outputSettings17.forceAllElementAsBlock();
        org.jsoup.nodes.Document.OutputSettings outputSettings20 = outputSettings17.forceAllElementAsBlock(false);
        org.jsoup.nodes.Document.OutputSettings outputSettings21 = new org.jsoup.nodes.Document.OutputSettings();
        boolean boolean22 = outputSettings21.prettyPrint();
        org.jsoup.nodes.Document.OutputSettings outputSettings24 = outputSettings21.prettyPrint(true);
        java.nio.charset.Charset charset25 = outputSettings21.charset();
        org.jsoup.nodes.Document.OutputSettings outputSettings27 = outputSettings21.forceAllElementAsBlock(false);
        org.jsoup.nodes.Entities.EscapeMode escapeMode28 = outputSettings21.escapeMode();
        org.jsoup.nodes.Document.OutputSettings outputSettings29 = outputSettings17.escapeMode(escapeMode28);
        org.jsoup.nodes.Document.OutputSettings outputSettings30 = outputSettings17.clone();
        org.jsoup.nodes.Document.OutputSettings outputSettings31 = new org.jsoup.nodes.Document.OutputSettings();
        boolean boolean32 = outputSettings31.prettyPrint();
        org.jsoup.nodes.Document.OutputSettings outputSettings34 = outputSettings31.forceAllElementAsBlock(false);
        org.jsoup.nodes.Document.OutputSettings outputSettings35 = new org.jsoup.nodes.Document.OutputSettings();
        boolean boolean36 = outputSettings35.prettyPrint();
        org.jsoup.nodes.Entities.EscapeMode escapeMode37 = outputSettings35.escapeMode();
        boolean boolean38 = outputSettings35.forceAllElementAsBlock();
        org.jsoup.nodes.Document.OutputSettings outputSettings40 = outputSettings35.forceAllElementAsBlock(true);
        org.jsoup.nodes.Entities.EscapeMode escapeMode41 = outputSettings40.escapeMode();
        org.jsoup.nodes.Document.OutputSettings outputSettings42 = outputSettings31.escapeMode(escapeMode41);
        org.jsoup.nodes.Document.OutputSettings outputSettings43 = outputSettings17.escapeMode(escapeMode41);
        org.jsoup.nodes.Document.OutputSettings outputSettings44 = outputSettings43.clone();
        org.jsoup.nodes.Document.OutputSettings outputSettings45 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Entities.EscapeMode escapeMode46 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings47 = outputSettings45.escapeMode(escapeMode46);
        org.jsoup.nodes.Document.OutputSettings outputSettings49 = outputSettings47.prettyPrint(false);
        org.jsoup.nodes.Document.OutputSettings outputSettings50 = new org.jsoup.nodes.Document.OutputSettings();
        boolean boolean51 = outputSettings50.prettyPrint();
        org.jsoup.nodes.Document.OutputSettings outputSettings53 = outputSettings50.prettyPrint(true);
        org.jsoup.nodes.Document.OutputSettings outputSettings55 = outputSettings53.indentAmount((int) ' ');
        boolean boolean56 = outputSettings55.prettyPrint();
        org.jsoup.nodes.Document.OutputSettings outputSettings57 = outputSettings55.clone();
        java.nio.charset.Charset charset58 = outputSettings55.charset();
        org.jsoup.nodes.Document.OutputSettings outputSettings59 = outputSettings49.charset(charset58);
        org.jsoup.nodes.Document.OutputSettings outputSettings61 = outputSettings49.prettyPrint(true);
        java.nio.charset.Charset charset62 = outputSettings49.charset();
        org.jsoup.nodes.Document.OutputSettings outputSettings63 = outputSettings43.charset(charset62);
        org.jsoup.nodes.Document.OutputSettings outputSettings65 = outputSettings43.indentAmount(97);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertNotNull(outputSettings3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + escapeMode6 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode6.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertNotNull(outputSettings9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + escapeMode12 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode12.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertNotNull(outputSettings13);
        org.junit.Assert.assertNotNull(outputSettings14);
        org.junit.Assert.assertTrue("'" + escapeMode15 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode15.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertNotNull(outputSettings16);
        org.junit.Assert.assertNotNull(outputSettings17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(outputSettings20);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertNotNull(outputSettings24);
        org.junit.Assert.assertNotNull(charset25);
        org.junit.Assert.assertNotNull(outputSettings27);
        org.junit.Assert.assertTrue("'" + escapeMode28 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode28.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertNotNull(outputSettings29);
        org.junit.Assert.assertNotNull(outputSettings30);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + true + "'", boolean32 == true);
        org.junit.Assert.assertNotNull(outputSettings34);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + true + "'", boolean36 == true);
        org.junit.Assert.assertTrue("'" + escapeMode37 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode37.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertNotNull(outputSettings40);
        org.junit.Assert.assertTrue("'" + escapeMode41 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode41.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertNotNull(outputSettings42);
        org.junit.Assert.assertNotNull(outputSettings43);
        org.junit.Assert.assertNotNull(outputSettings44);
        org.junit.Assert.assertNotNull(outputSettings47);
        org.junit.Assert.assertNotNull(outputSettings49);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + true + "'", boolean51 == true);
        org.junit.Assert.assertNotNull(outputSettings53);
        org.junit.Assert.assertNotNull(outputSettings55);
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + true + "'", boolean56 == true);
        org.junit.Assert.assertNotNull(outputSettings57);
        org.junit.Assert.assertNotNull(charset58);
        org.junit.Assert.assertNotNull(outputSettings59);
        org.junit.Assert.assertNotNull(outputSettings61);
        org.junit.Assert.assertNotNull(charset62);
        org.junit.Assert.assertNotNull(outputSettings63);
        org.junit.Assert.assertNotNull(outputSettings65);
    }

    @Test
    public void test20694() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20694");
        org.jsoup.nodes.Document.OutputSettings outputSettings0 = new org.jsoup.nodes.Document.OutputSettings();
        boolean boolean1 = outputSettings0.prettyPrint();
        org.jsoup.nodes.Entities.EscapeMode escapeMode2 = outputSettings0.escapeMode();
        int int3 = outputSettings0.indentAmount();
        org.jsoup.nodes.Document.OutputSettings outputSettings5 = outputSettings0.prettyPrint(false);
        java.nio.charset.Charset charset6 = outputSettings5.charset();
        boolean boolean7 = outputSettings5.forceAllElementAsBlock();
        org.jsoup.nodes.Document.OutputSettings outputSettings8 = outputSettings5.clone();
        org.jsoup.nodes.Document.OutputSettings outputSettings9 = outputSettings5.clone();
        org.jsoup.nodes.Document.OutputSettings outputSettings10 = new org.jsoup.nodes.Document.OutputSettings();
        int int11 = outputSettings10.indentAmount();
        org.jsoup.nodes.Document.OutputSettings outputSettings13 = outputSettings10.forceAllElementAsBlock(true);
        boolean boolean14 = outputSettings10.forceAllElementAsBlock();
        org.jsoup.nodes.Document.OutputSettings outputSettings16 = outputSettings10.indentAmount((int) (byte) 10);
        org.jsoup.nodes.Document.OutputSettings outputSettings17 = new org.jsoup.nodes.Document.OutputSettings();
        boolean boolean18 = outputSettings17.prettyPrint();
        org.jsoup.nodes.Entities.EscapeMode escapeMode19 = outputSettings17.escapeMode();
        org.jsoup.nodes.Document.OutputSettings outputSettings20 = outputSettings10.escapeMode(escapeMode19);
        org.jsoup.nodes.Document.OutputSettings outputSettings21 = outputSettings10.clone();
        org.jsoup.nodes.Entities.EscapeMode escapeMode22 = outputSettings21.escapeMode();
        org.jsoup.nodes.Document.OutputSettings outputSettings23 = outputSettings9.escapeMode(escapeMode22);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + escapeMode2 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode2.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertNotNull(outputSettings5);
        org.junit.Assert.assertNotNull(charset6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(outputSettings8);
        org.junit.Assert.assertNotNull(outputSettings9);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertNotNull(outputSettings13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNotNull(outputSettings16);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + escapeMode19 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode19.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertNotNull(outputSettings20);
        org.junit.Assert.assertNotNull(outputSettings21);
        org.junit.Assert.assertTrue("'" + escapeMode22 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode22.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertNotNull(outputSettings23);
    }

    @Test
    public void test20695() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20695");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("", "");
        org.jsoup.nodes.TextNode textNode4 = textNode2.text("");
        org.jsoup.nodes.Node node5 = textNode2.previousSibling();
        boolean boolean7 = textNode2.hasAttr("hi!");
        java.lang.String str8 = textNode2.getWholeText();
        java.lang.String str9 = textNode2.nodeName();
        java.lang.String str10 = textNode2.toString();
        boolean boolean12 = textNode2.hasAttr("h");
        org.junit.Assert.assertNotNull(textNode2);
        org.junit.Assert.assertNotNull(textNode4);
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "#text" + "'", str9, "#text");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test20696() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20696");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("", "");
        java.lang.String str3 = textNode2.baseUri();
        org.jsoup.nodes.Node node4 = textNode2.previousSibling();
        org.jsoup.nodes.Document document5 = textNode2.ownerDocument();
        org.jsoup.nodes.TextNode textNode8 = org.jsoup.nodes.TextNode.createFromEncoded("", "");
        java.lang.String str9 = textNode8.getWholeText();
        java.lang.String str10 = textNode8.outerHtml();
        java.util.List<org.jsoup.nodes.Node> nodeList11 = textNode8.siblingNodes();
        int int12 = textNode8.siblingIndex();
        java.lang.String str14 = textNode8.absUrl("hi!");
        java.lang.String str15 = textNode8.getWholeText();
        org.jsoup.nodes.Node node17 = textNode8.removeAttr("hi!");
        boolean boolean18 = textNode8.isBlank();
        int int19 = textNode8.siblingIndex();
        // The following exception was thrown during execution in test generation
        try {
            document5.replaceWith((org.jsoup.nodes.Node) textNode8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(textNode2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertNull(node4);
        org.junit.Assert.assertNull(document5);
        org.junit.Assert.assertNotNull(textNode8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNotNull(nodeList11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertNotNull(node17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
    }

    @Test
    public void test20697() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20697");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("h", "hi!");
        boolean boolean4 = textNode2.hasAttr("#text");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node6 = textNode2.before("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(textNode2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test20698() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20698");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("", "");
        boolean boolean3 = textNode2.isBlank();
        org.jsoup.nodes.Node node6 = textNode2.attr("hi!", "hi!");
        org.jsoup.nodes.TextNode textNode8 = textNode2.text("#text");
        java.lang.String str9 = textNode2.outerHtml();
        java.lang.String str11 = textNode2.absUrl("i!");
        java.lang.String str12 = textNode2.nodeName();
        java.lang.String str13 = textNode2.toString();
        java.lang.String str15 = textNode2.absUrl("#text");
        java.lang.String str16 = textNode2.outerHtml();
        org.junit.Assert.assertNotNull(textNode2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(node6);
        org.junit.Assert.assertNotNull(textNode8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "#text" + "'", str9, "#text");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "#text" + "'", str12, "#text");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "#text" + "'", str13, "#text");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "#text" + "'", str16, "#text");
    }

    @Test
    public void test20699() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20699");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("hi!", "hi!");
        java.lang.String str4 = textNode2.absUrl("hi!");
        java.lang.String str6 = textNode2.absUrl("hi!");
        java.lang.String str8 = textNode2.absUrl("#text");
        java.util.List<org.jsoup.nodes.Node> nodeList9 = textNode2.childNodes();
        java.lang.String str10 = textNode2.outerHtml();
        boolean boolean11 = textNode2.isBlank();
        org.jsoup.nodes.TextNode textNode13 = textNode2.text("#");
        org.jsoup.select.NodeVisitor nodeVisitor14 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node15 = textNode13.traverse(nodeVisitor14);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNotNull(nodeList9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(textNode13);
    }

    @Test
    public void test20700() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20700");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("#text", "text");
        java.lang.String str3 = textNode2.toString();
        java.lang.String str5 = textNode2.attr("#text");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "#text" + "'", str3, "#text");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
    }

    @Test
    public void test20701() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20701");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("", "#text");
        org.jsoup.nodes.Document document3 = textNode2.ownerDocument();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node5 = textNode2.childNode((int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(document3);
    }

    @Test
    public void test20702() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20702");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("", "");
        java.lang.String str3 = textNode2.nodeName();
        java.util.List<org.jsoup.nodes.Node> nodeList4 = textNode2.childNodes();
        org.jsoup.nodes.TextNode textNode6 = textNode2.text("");
        java.lang.String str7 = textNode6.toString();
        // The following exception was thrown during execution in test generation
        try {
            textNode6.remove();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(textNode2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "#text" + "'", str3, "#text");
        org.junit.Assert.assertNotNull(nodeList4);
        org.junit.Assert.assertNotNull(textNode6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
    }

    @Test
    public void test20703() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20703");
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
        org.jsoup.nodes.Node node23 = textNode2.attr("text", "h");
        org.jsoup.nodes.Node node24 = textNode2.previousSibling();
        java.lang.String str25 = textNode2.nodeName();
        org.junit.Assert.assertNotNull(textNode2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNotNull(textNode10);
        org.junit.Assert.assertNotNull(textNode12);
        org.junit.Assert.assertNotNull(textNode14);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(nodeList20);
        org.junit.Assert.assertNotNull(node23);
        org.junit.Assert.assertNull(node24);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "#text" + "'", str25, "#text");
    }

    @Test
    public void test20704() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20704");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("", "hi!");
        org.jsoup.nodes.Document document3 = textNode2.ownerDocument();
        org.jsoup.nodes.Node node6 = textNode2.attr("#text", "hi!");
        java.lang.String str7 = textNode2.nodeName();
        org.jsoup.nodes.Attributes attributes8 = textNode2.attributes();
        java.lang.String str9 = textNode2.baseUri();
        org.jsoup.nodes.Node node11 = textNode2.removeAttr("#");
        org.junit.Assert.assertNotNull(textNode2);
        org.junit.Assert.assertNull(document3);
        org.junit.Assert.assertNotNull(node6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "#text" + "'", str7, "#text");
        org.junit.Assert.assertNotNull(attributes8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertNotNull(node11);
    }

    @Test
    public void test20705() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20705");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("", "");
        java.lang.String str3 = textNode2.nodeName();
        java.lang.String str4 = textNode2.toString();
        textNode2.setBaseUri("#text");
        org.jsoup.nodes.Node node7 = textNode2.clone();
        java.util.List<org.jsoup.nodes.Node> nodeList8 = textNode2.childNodes();
        boolean boolean9 = textNode2.isBlank();
        org.jsoup.nodes.Node node11 = textNode2.removeAttr("hi!");
        java.lang.String str12 = textNode2.baseUri();
        java.util.List<org.jsoup.nodes.Node> nodeList13 = textNode2.siblingNodes();
        org.junit.Assert.assertNotNull(textNode2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "#text" + "'", str3, "#text");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(node7);
        org.junit.Assert.assertNotNull(nodeList8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(node11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "#text" + "'", str12, "#text");
        org.junit.Assert.assertNotNull(nodeList13);
    }

    @Test
    public void test20706() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20706");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("", "");
        java.lang.String str3 = textNode2.getWholeText();
        java.lang.String str4 = textNode2.baseUri();
        int int5 = textNode2.siblingIndex();
        boolean boolean7 = textNode2.hasAttr("");
        java.lang.String str8 = textNode2.toString();
        java.lang.String str9 = textNode2.getWholeText();
        org.junit.Assert.assertNotNull(textNode2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
    }

    @Test
    public void test20707() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20707");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("", "");
        java.lang.String str3 = textNode2.toString();
        int int4 = textNode2.siblingIndex();
        java.lang.String str5 = textNode2.nodeName();
        java.lang.String str6 = textNode2.text();
        org.jsoup.nodes.Node node7 = textNode2.previousSibling();
        org.jsoup.nodes.Node node10 = textNode2.attr("hi!", "hi!");
        int int11 = textNode2.siblingIndex();
        org.jsoup.nodes.Document document12 = textNode2.ownerDocument();
        java.lang.String str14 = textNode2.attr("#text");
        org.jsoup.nodes.TextNode textNode16 = textNode2.text("#text");
        boolean boolean18 = textNode2.hasAttr("hi!");
        org.jsoup.nodes.Node node20 = textNode2.removeAttr("i!");
        org.junit.Assert.assertNotNull(textNode2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "#text" + "'", str5, "#text");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNull(node7);
        org.junit.Assert.assertNotNull(node10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNull(document12);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertNotNull(textNode16);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertNotNull(node20);
    }

    @Test
    public void test20708() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20708");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("", "");
        java.lang.String str3 = textNode2.toString();
        int int4 = textNode2.siblingIndex();
        java.lang.String str5 = textNode2.nodeName();
        org.jsoup.nodes.TextNode textNode7 = textNode2.text("");
        org.jsoup.nodes.Node node9 = textNode7.removeAttr("hi!");
        java.lang.String str10 = textNode7.getWholeText();
        org.jsoup.nodes.Node node11 = textNode7.parent();
        java.lang.String str12 = textNode7.text();
        // The following exception was thrown during execution in test generation
        try {
            textNode7.remove();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(textNode2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "#text" + "'", str5, "#text");
        org.junit.Assert.assertNotNull(textNode7);
        org.junit.Assert.assertNotNull(node9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNull(node11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
    }

    @Test
    public void test20709() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20709");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("", "");
        java.lang.String str3 = textNode2.getWholeText();
        java.lang.String str4 = textNode2.baseUri();
        int int5 = textNode2.siblingIndex();
        java.lang.String str6 = textNode2.baseUri();
        org.jsoup.nodes.Node node9 = textNode2.attr("i!", "h");
        int int10 = node9.siblingIndex();
        org.junit.Assert.assertNotNull(textNode2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(node9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
    }

    @Test
    public void test20710() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20710");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("", "");
        boolean boolean3 = textNode2.isBlank();
        org.jsoup.nodes.Node node4 = textNode2.previousSibling();
        java.lang.String str5 = textNode2.getWholeText();
        java.lang.String str6 = textNode2.baseUri();
        org.jsoup.nodes.TextNode textNode8 = textNode2.text("i!");
        java.util.List<org.jsoup.nodes.Node> nodeList9 = textNode8.siblingNodes();
        java.util.List<org.jsoup.nodes.Node> nodeList10 = textNode8.siblingNodes();
        org.jsoup.nodes.Node node11 = textNode8.previousSibling();
        org.jsoup.nodes.TextNode textNode13 = textNode8.splitText((int) (byte) 0);
        org.jsoup.nodes.TextNode textNode16 = org.jsoup.nodes.TextNode.createFromEncoded("hi!", "#text");
        org.jsoup.nodes.Node node18 = textNode16.removeAttr("hi!");
        org.jsoup.nodes.Node node21 = textNode16.attr("#text", "hi!");
        java.lang.String str22 = textNode16.text();
        java.lang.String str23 = textNode16.getWholeText();
        java.lang.String str24 = textNode16.baseUri();
        org.jsoup.nodes.Node node27 = textNode16.attr("#text", "h");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node28 = textNode8.before((org.jsoup.nodes.Node) textNode16);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(textNode2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNull(node4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(textNode8);
        org.junit.Assert.assertNotNull(nodeList9);
        org.junit.Assert.assertNotNull(nodeList10);
        org.junit.Assert.assertNull(node11);
        org.junit.Assert.assertNotNull(textNode13);
        org.junit.Assert.assertNotNull(textNode16);
        org.junit.Assert.assertNotNull(node18);
        org.junit.Assert.assertNotNull(node21);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "hi!" + "'", str22, "hi!");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "hi!" + "'", str23, "hi!");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "#text" + "'", str24, "#text");
        org.junit.Assert.assertNotNull(node27);
    }

    @Test
    public void test20711() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20711");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("", "hi!");
        org.jsoup.nodes.Document document3 = textNode2.ownerDocument();
        org.jsoup.nodes.Node node6 = textNode2.attr("#text", "hi!");
        java.lang.String str8 = textNode2.absUrl("hi!");
        org.jsoup.nodes.Attributes attributes9 = textNode2.attributes();
        org.jsoup.nodes.TextNode textNode11 = textNode2.text("text");
        // The following exception was thrown during execution in test generation
        try {
            textNode11.remove();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(textNode2);
        org.junit.Assert.assertNull(document3);
        org.junit.Assert.assertNotNull(node6);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNotNull(attributes9);
        org.junit.Assert.assertNotNull(textNode11);
    }

    @Test
    public void test20712() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20712");
        org.jsoup.nodes.Document.OutputSettings outputSettings0 = new org.jsoup.nodes.Document.OutputSettings();
        boolean boolean1 = outputSettings0.prettyPrint();
        org.jsoup.nodes.Document.OutputSettings outputSettings3 = outputSettings0.prettyPrint(true);
        org.jsoup.nodes.Document.OutputSettings outputSettings4 = new org.jsoup.nodes.Document.OutputSettings();
        boolean boolean5 = outputSettings4.prettyPrint();
        org.jsoup.nodes.Entities.EscapeMode escapeMode6 = outputSettings4.escapeMode();
        int int7 = outputSettings4.indentAmount();
        org.jsoup.nodes.Document.OutputSettings outputSettings9 = outputSettings4.prettyPrint(false);
        org.jsoup.nodes.Document.OutputSettings outputSettings10 = new org.jsoup.nodes.Document.OutputSettings();
        boolean boolean11 = outputSettings10.prettyPrint();
        org.jsoup.nodes.Entities.EscapeMode escapeMode12 = outputSettings10.escapeMode();
        org.jsoup.nodes.Document.OutputSettings outputSettings13 = outputSettings9.escapeMode(escapeMode12);
        org.jsoup.nodes.Document.OutputSettings outputSettings14 = outputSettings0.escapeMode(escapeMode12);
        org.jsoup.nodes.Entities.EscapeMode escapeMode15 = outputSettings0.escapeMode();
        org.jsoup.nodes.Document.OutputSettings outputSettings16 = outputSettings0.clone();
        org.jsoup.nodes.Document.OutputSettings outputSettings18 = outputSettings16.prettyPrint(true);
        org.jsoup.nodes.Document.OutputSettings outputSettings19 = new org.jsoup.nodes.Document.OutputSettings();
        boolean boolean20 = outputSettings19.prettyPrint();
        org.jsoup.nodes.Document.OutputSettings outputSettings22 = outputSettings19.prettyPrint(true);
        org.jsoup.nodes.Document.OutputSettings outputSettings23 = new org.jsoup.nodes.Document.OutputSettings();
        boolean boolean24 = outputSettings23.prettyPrint();
        org.jsoup.nodes.Entities.EscapeMode escapeMode25 = outputSettings23.escapeMode();
        int int26 = outputSettings23.indentAmount();
        org.jsoup.nodes.Document.OutputSettings outputSettings28 = outputSettings23.prettyPrint(false);
        org.jsoup.nodes.Document.OutputSettings outputSettings29 = new org.jsoup.nodes.Document.OutputSettings();
        boolean boolean30 = outputSettings29.prettyPrint();
        org.jsoup.nodes.Entities.EscapeMode escapeMode31 = outputSettings29.escapeMode();
        org.jsoup.nodes.Document.OutputSettings outputSettings32 = outputSettings28.escapeMode(escapeMode31);
        org.jsoup.nodes.Document.OutputSettings outputSettings33 = outputSettings19.escapeMode(escapeMode31);
        org.jsoup.nodes.Entities.EscapeMode escapeMode34 = outputSettings19.escapeMode();
        org.jsoup.nodes.Document.OutputSettings outputSettings35 = outputSettings19.clone();
        org.jsoup.nodes.Document.OutputSettings outputSettings36 = outputSettings19.clone();
        org.jsoup.nodes.Document.OutputSettings outputSettings38 = outputSettings19.indentAmount((int) (byte) 1);
        java.nio.charset.Charset charset39 = outputSettings38.charset();
        org.jsoup.nodes.Document.OutputSettings outputSettings40 = outputSettings16.charset(charset39);
        org.jsoup.nodes.Document.OutputSettings outputSettings41 = new org.jsoup.nodes.Document.OutputSettings();
        boolean boolean42 = outputSettings41.prettyPrint();
        org.jsoup.nodes.Document.OutputSettings outputSettings44 = outputSettings41.prettyPrint(true);
        java.nio.charset.Charset charset45 = outputSettings41.charset();
        org.jsoup.nodes.Document.OutputSettings outputSettings47 = outputSettings41.forceAllElementAsBlock(false);
        org.jsoup.nodes.Document.OutputSettings outputSettings49 = outputSettings47.indentAmount((int) ' ');
        org.jsoup.nodes.Document.OutputSettings outputSettings51 = outputSettings49.prettyPrint(false);
        org.jsoup.nodes.Document.OutputSettings outputSettings53 = outputSettings49.prettyPrint(true);
        org.jsoup.nodes.Entities.EscapeMode escapeMode54 = outputSettings53.escapeMode();
        org.jsoup.nodes.Document.OutputSettings outputSettings55 = new org.jsoup.nodes.Document.OutputSettings();
        boolean boolean56 = outputSettings55.prettyPrint();
        org.jsoup.nodes.Document.OutputSettings outputSettings58 = outputSettings55.prettyPrint(true);
        java.nio.charset.Charset charset59 = outputSettings55.charset();
        org.jsoup.nodes.Document.OutputSettings outputSettings61 = outputSettings55.forceAllElementAsBlock(false);
        org.jsoup.nodes.Document.OutputSettings outputSettings63 = outputSettings61.indentAmount((int) ' ');
        org.jsoup.nodes.Document.OutputSettings outputSettings65 = outputSettings63.prettyPrint(false);
        org.jsoup.nodes.Document.OutputSettings outputSettings67 = outputSettings63.prettyPrint(true);
        org.jsoup.nodes.Entities.EscapeMode escapeMode68 = outputSettings67.escapeMode();
        org.jsoup.nodes.Document.OutputSettings outputSettings69 = outputSettings53.escapeMode(escapeMode68);
        org.jsoup.nodes.Document.OutputSettings outputSettings70 = outputSettings16.escapeMode(escapeMode68);
        org.jsoup.nodes.Document.OutputSettings outputSettings71 = new org.jsoup.nodes.Document.OutputSettings();
        boolean boolean72 = outputSettings71.prettyPrint();
        org.jsoup.nodes.Entities.EscapeMode escapeMode73 = outputSettings71.escapeMode();
        org.jsoup.nodes.Document.OutputSettings outputSettings74 = outputSettings16.escapeMode(escapeMode73);
        org.jsoup.nodes.Document.OutputSettings outputSettings76 = outputSettings74.forceAllElementAsBlock(false);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertNotNull(outputSettings3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + escapeMode6 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode6.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertNotNull(outputSettings9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + escapeMode12 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode12.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertNotNull(outputSettings13);
        org.junit.Assert.assertNotNull(outputSettings14);
        org.junit.Assert.assertTrue("'" + escapeMode15 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode15.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertNotNull(outputSettings16);
        org.junit.Assert.assertNotNull(outputSettings18);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertNotNull(outputSettings22);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertTrue("'" + escapeMode25 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode25.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 1 + "'", int26 == 1);
        org.junit.Assert.assertNotNull(outputSettings28);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertTrue("'" + escapeMode31 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode31.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertNotNull(outputSettings32);
        org.junit.Assert.assertNotNull(outputSettings33);
        org.junit.Assert.assertTrue("'" + escapeMode34 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode34.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertNotNull(outputSettings35);
        org.junit.Assert.assertNotNull(outputSettings36);
        org.junit.Assert.assertNotNull(outputSettings38);
        org.junit.Assert.assertNotNull(charset39);
        org.junit.Assert.assertNotNull(outputSettings40);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + true + "'", boolean42 == true);
        org.junit.Assert.assertNotNull(outputSettings44);
        org.junit.Assert.assertNotNull(charset45);
        org.junit.Assert.assertNotNull(outputSettings47);
        org.junit.Assert.assertNotNull(outputSettings49);
        org.junit.Assert.assertNotNull(outputSettings51);
        org.junit.Assert.assertNotNull(outputSettings53);
        org.junit.Assert.assertTrue("'" + escapeMode54 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode54.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + true + "'", boolean56 == true);
        org.junit.Assert.assertNotNull(outputSettings58);
        org.junit.Assert.assertNotNull(charset59);
        org.junit.Assert.assertNotNull(outputSettings61);
        org.junit.Assert.assertNotNull(outputSettings63);
        org.junit.Assert.assertNotNull(outputSettings65);
        org.junit.Assert.assertNotNull(outputSettings67);
        org.junit.Assert.assertTrue("'" + escapeMode68 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode68.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertNotNull(outputSettings69);
        org.junit.Assert.assertNotNull(outputSettings70);
        org.junit.Assert.assertTrue("'" + boolean72 + "' != '" + true + "'", boolean72 == true);
        org.junit.Assert.assertTrue("'" + escapeMode73 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode73.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertNotNull(outputSettings74);
        org.junit.Assert.assertNotNull(outputSettings76);
    }

    @Test
    public void test20713() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20713");
        org.jsoup.nodes.Document.OutputSettings outputSettings0 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Entities.EscapeMode escapeMode1 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings2 = outputSettings0.escapeMode(escapeMode1);
        int int3 = outputSettings0.indentAmount();
        org.jsoup.nodes.Document.OutputSettings outputSettings5 = outputSettings0.forceAllElementAsBlock(false);
        int int6 = outputSettings0.indentAmount();
        org.jsoup.nodes.Entities.EscapeMode escapeMode7 = outputSettings0.escapeMode();
        org.jsoup.nodes.Document.OutputSettings outputSettings9 = outputSettings0.indentAmount((int) '#');
        org.jsoup.nodes.Document.OutputSettings outputSettings10 = new org.jsoup.nodes.Document.OutputSettings();
        int int11 = outputSettings10.indentAmount();
        org.jsoup.nodes.Document.OutputSettings outputSettings13 = outputSettings10.forceAllElementAsBlock(true);
        org.jsoup.nodes.Document.OutputSettings outputSettings15 = outputSettings10.prettyPrint(true);
        org.jsoup.nodes.Document.OutputSettings outputSettings16 = new org.jsoup.nodes.Document.OutputSettings();
        boolean boolean17 = outputSettings16.prettyPrint();
        org.jsoup.nodes.Entities.EscapeMode escapeMode18 = outputSettings16.escapeMode();
        boolean boolean19 = outputSettings16.forceAllElementAsBlock();
        org.jsoup.nodes.Document.OutputSettings outputSettings20 = new org.jsoup.nodes.Document.OutputSettings();
        boolean boolean21 = outputSettings20.prettyPrint();
        org.jsoup.nodes.Entities.EscapeMode escapeMode22 = outputSettings20.escapeMode();
        org.jsoup.nodes.Document.OutputSettings outputSettings23 = outputSettings16.escapeMode(escapeMode22);
        org.jsoup.nodes.Document.OutputSettings outputSettings24 = outputSettings10.escapeMode(escapeMode22);
        org.jsoup.nodes.Document.OutputSettings outputSettings25 = outputSettings9.escapeMode(escapeMode22);
        java.nio.charset.Charset charset26 = outputSettings9.charset();
        org.jsoup.nodes.Document.OutputSettings outputSettings27 = new org.jsoup.nodes.Document.OutputSettings();
        boolean boolean28 = outputSettings27.prettyPrint();
        org.jsoup.nodes.Document.OutputSettings outputSettings30 = outputSettings27.forceAllElementAsBlock(false);
        org.jsoup.nodes.Document.OutputSettings outputSettings31 = new org.jsoup.nodes.Document.OutputSettings();
        boolean boolean32 = outputSettings31.prettyPrint();
        org.jsoup.nodes.Entities.EscapeMode escapeMode33 = outputSettings31.escapeMode();
        boolean boolean34 = outputSettings31.forceAllElementAsBlock();
        org.jsoup.nodes.Document.OutputSettings outputSettings36 = outputSettings31.forceAllElementAsBlock(true);
        org.jsoup.nodes.Entities.EscapeMode escapeMode37 = outputSettings36.escapeMode();
        org.jsoup.nodes.Document.OutputSettings outputSettings38 = outputSettings27.escapeMode(escapeMode37);
        org.jsoup.nodes.Entities.EscapeMode escapeMode39 = outputSettings38.escapeMode();
        org.jsoup.nodes.Document.OutputSettings outputSettings40 = outputSettings9.escapeMode(escapeMode39);
        org.jsoup.nodes.Document.OutputSettings outputSettings42 = outputSettings40.prettyPrint(true);
        org.junit.Assert.assertNotNull(outputSettings2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertNotNull(outputSettings5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertNull(escapeMode7);
        org.junit.Assert.assertNotNull(outputSettings9);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertNotNull(outputSettings13);
        org.junit.Assert.assertNotNull(outputSettings15);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + escapeMode18 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode18.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertTrue("'" + escapeMode22 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode22.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertNotNull(outputSettings23);
        org.junit.Assert.assertNotNull(outputSettings24);
        org.junit.Assert.assertNotNull(outputSettings25);
        org.junit.Assert.assertNotNull(charset26);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertNotNull(outputSettings30);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + true + "'", boolean32 == true);
        org.junit.Assert.assertTrue("'" + escapeMode33 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode33.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertNotNull(outputSettings36);
        org.junit.Assert.assertTrue("'" + escapeMode37 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode37.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertNotNull(outputSettings38);
        org.junit.Assert.assertTrue("'" + escapeMode39 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode39.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertNotNull(outputSettings40);
        org.junit.Assert.assertNotNull(outputSettings42);
    }

    @Test
    public void test20714() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20714");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("", "");
        java.lang.String str3 = textNode2.getWholeText();
        java.lang.String str4 = textNode2.baseUri();
        org.jsoup.nodes.TextNode textNode6 = textNode2.text("hi!");
        org.jsoup.nodes.Node node7 = textNode6.clone();
        org.jsoup.nodes.Node node9 = textNode6.removeAttr("hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList10 = textNode6.siblingNodes();
        boolean boolean12 = textNode6.hasAttr("h");
        org.jsoup.nodes.Attributes attributes13 = textNode6.attributes();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.TextNode textNode15 = textNode6.splitText(10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Split offset must not be greater than current text length");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(textNode2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(textNode6);
        org.junit.Assert.assertNotNull(node7);
        org.junit.Assert.assertNotNull(node9);
        org.junit.Assert.assertNotNull(nodeList10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(attributes13);
    }

    @Test
    public void test20715() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20715");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("", "");
        boolean boolean3 = textNode2.isBlank();
        org.jsoup.nodes.Node node6 = textNode2.attr("hi!", "hi!");
        org.jsoup.nodes.TextNode textNode8 = textNode2.text("#text");
        java.lang.String str9 = textNode2.toString();
        java.lang.String str11 = textNode2.attr("#text");
        org.jsoup.nodes.TextNode textNode14 = org.jsoup.nodes.TextNode.createFromEncoded("", "");
        java.lang.String str15 = textNode14.getWholeText();
        java.lang.String str16 = textNode14.baseUri();
        org.jsoup.nodes.TextNode textNode18 = textNode14.text("hi!");
        java.lang.String str19 = textNode18.nodeName();
        boolean boolean21 = textNode18.hasAttr("");
        boolean boolean22 = textNode18.isBlank();
        org.jsoup.nodes.TextNode textNode24 = textNode18.text("i!");
        // The following exception was thrown during execution in test generation
        try {
            textNode2.replaceWith((org.jsoup.nodes.Node) textNode18);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(textNode2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(node6);
        org.junit.Assert.assertNotNull(textNode8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "#text" + "'", str9, "#text");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNotNull(textNode14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertNotNull(textNode18);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "#text" + "'", str19, "#text");
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(textNode24);
    }

    @Test
    public void test20716() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20716");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("", "");
        org.jsoup.nodes.TextNode textNode5 = org.jsoup.nodes.TextNode.createFromEncoded("", "");
        java.lang.String str6 = textNode5.baseUri();
        boolean boolean8 = textNode5.hasAttr("#text");
        java.lang.String str9 = textNode5.text();
        boolean boolean10 = textNode2.equals((java.lang.Object) str9);
        java.lang.String str11 = textNode2.nodeName();
        org.jsoup.nodes.Node node12 = textNode2.nextSibling();
        java.lang.String str13 = textNode2.nodeName();
        java.lang.String str14 = textNode2.getWholeText();
        java.util.List<org.jsoup.nodes.Node> nodeList15 = textNode2.childNodes();
        org.junit.Assert.assertNotNull(textNode2);
        org.junit.Assert.assertNotNull(textNode5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "#text" + "'", str11, "#text");
        org.junit.Assert.assertNull(node12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "#text" + "'", str13, "#text");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertNotNull(nodeList15);
    }

    @Test
    public void test20717() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20717");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("", "");
        org.jsoup.nodes.TextNode textNode4 = textNode2.text("");
        org.jsoup.nodes.TextNode textNode6 = textNode4.text("#text");
        java.lang.String str7 = textNode4.toString();
        java.util.List<org.jsoup.nodes.Node> nodeList8 = textNode4.siblingNodes();
        org.jsoup.nodes.Node node10 = textNode4.removeAttr("#text");
        node10.setBaseUri("");
        org.jsoup.nodes.Document.OutputSettings outputSettings13 = new org.jsoup.nodes.Document.OutputSettings();
        boolean boolean14 = outputSettings13.prettyPrint();
        org.jsoup.nodes.Entities.EscapeMode escapeMode15 = outputSettings13.escapeMode();
        int int16 = outputSettings13.indentAmount();
        org.jsoup.nodes.Document.OutputSettings outputSettings18 = outputSettings13.prettyPrint(false);
        org.jsoup.nodes.Document.OutputSettings outputSettings19 = new org.jsoup.nodes.Document.OutputSettings();
        boolean boolean20 = outputSettings19.prettyPrint();
        org.jsoup.nodes.Entities.EscapeMode escapeMode21 = outputSettings19.escapeMode();
        org.jsoup.nodes.Document.OutputSettings outputSettings22 = outputSettings18.escapeMode(escapeMode21);
        org.jsoup.nodes.Document.OutputSettings outputSettings23 = outputSettings18.clone();
        boolean boolean24 = outputSettings23.prettyPrint();
        org.jsoup.nodes.Document.OutputSettings outputSettings25 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Entities.EscapeMode escapeMode26 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings27 = outputSettings25.escapeMode(escapeMode26);
        int int28 = outputSettings25.indentAmount();
        org.jsoup.nodes.Document.OutputSettings outputSettings30 = outputSettings25.forceAllElementAsBlock(false);
        int int31 = outputSettings25.indentAmount();
        org.jsoup.nodes.Entities.EscapeMode escapeMode32 = outputSettings25.escapeMode();
        boolean boolean33 = outputSettings25.forceAllElementAsBlock();
        org.jsoup.nodes.Document.OutputSettings outputSettings35 = outputSettings25.forceAllElementAsBlock(false);
        org.jsoup.nodes.Document.OutputSettings outputSettings36 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Entities.EscapeMode escapeMode37 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings38 = outputSettings36.escapeMode(escapeMode37);
        int int39 = outputSettings36.indentAmount();
        org.jsoup.nodes.Entities.EscapeMode escapeMode40 = outputSettings36.escapeMode();
        org.jsoup.nodes.Document.OutputSettings outputSettings41 = new org.jsoup.nodes.Document.OutputSettings();
        boolean boolean42 = outputSettings41.prettyPrint();
        org.jsoup.nodes.Entities.EscapeMode escapeMode43 = outputSettings41.escapeMode();
        boolean boolean44 = outputSettings41.forceAllElementAsBlock();
        org.jsoup.nodes.Document.OutputSettings outputSettings45 = new org.jsoup.nodes.Document.OutputSettings();
        boolean boolean46 = outputSettings45.prettyPrint();
        org.jsoup.nodes.Entities.EscapeMode escapeMode47 = outputSettings45.escapeMode();
        org.jsoup.nodes.Document.OutputSettings outputSettings48 = outputSettings41.escapeMode(escapeMode47);
        org.jsoup.nodes.Document.OutputSettings outputSettings49 = outputSettings36.escapeMode(escapeMode47);
        org.jsoup.nodes.Document.OutputSettings outputSettings50 = outputSettings35.escapeMode(escapeMode47);
        org.jsoup.nodes.Document.OutputSettings outputSettings51 = outputSettings23.escapeMode(escapeMode47);
        boolean boolean52 = node10.equals((java.lang.Object) outputSettings23);
        boolean boolean53 = outputSettings23.prettyPrint();
        java.nio.charset.Charset charset54 = outputSettings23.charset();
        org.junit.Assert.assertNotNull(textNode2);
        org.junit.Assert.assertNotNull(textNode4);
        org.junit.Assert.assertNotNull(textNode6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "#text" + "'", str7, "#text");
        org.junit.Assert.assertNotNull(nodeList8);
        org.junit.Assert.assertNotNull(node10);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + escapeMode15 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode15.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
        org.junit.Assert.assertNotNull(outputSettings18);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + escapeMode21 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode21.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertNotNull(outputSettings22);
        org.junit.Assert.assertNotNull(outputSettings23);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(outputSettings27);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 1 + "'", int28 == 1);
        org.junit.Assert.assertNotNull(outputSettings30);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 1 + "'", int31 == 1);
        org.junit.Assert.assertNull(escapeMode32);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertNotNull(outputSettings35);
        org.junit.Assert.assertNotNull(outputSettings38);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 1 + "'", int39 == 1);
        org.junit.Assert.assertNull(escapeMode40);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + true + "'", boolean42 == true);
        org.junit.Assert.assertTrue("'" + escapeMode43 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode43.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + true + "'", boolean46 == true);
        org.junit.Assert.assertTrue("'" + escapeMode47 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode47.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertNotNull(outputSettings48);
        org.junit.Assert.assertNotNull(outputSettings49);
        org.junit.Assert.assertNotNull(outputSettings50);
        org.junit.Assert.assertNotNull(outputSettings51);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + false + "'", boolean53 == false);
        org.junit.Assert.assertNotNull(charset54);
    }

    @Test
    public void test20718() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20718");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("hi!", "");
        java.lang.String str3 = textNode2.baseUri();
        java.lang.String str4 = textNode2.baseUri();
        java.lang.String str6 = textNode2.absUrl("#text");
        java.util.List<org.jsoup.nodes.Node> nodeList7 = textNode2.childNodes();
        java.lang.String str8 = textNode2.toString();
        org.jsoup.nodes.Node node9 = textNode2.parent();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.TextNode textNode11 = textNode2.splitText((-1));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Split offset must be not be negative");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(textNode2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(nodeList7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertNull(node9);
    }

    @Test
    public void test20719() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20719");
        org.jsoup.nodes.Document.OutputSettings outputSettings0 = new org.jsoup.nodes.Document.OutputSettings();
        int int1 = outputSettings0.indentAmount();
        org.jsoup.nodes.Document.OutputSettings outputSettings3 = outputSettings0.forceAllElementAsBlock(true);
        boolean boolean4 = outputSettings0.forceAllElementAsBlock();
        org.jsoup.nodes.Document.OutputSettings outputSettings6 = outputSettings0.indentAmount((int) (byte) 10);
        org.jsoup.nodes.Document.OutputSettings outputSettings7 = new org.jsoup.nodes.Document.OutputSettings();
        boolean boolean8 = outputSettings7.prettyPrint();
        org.jsoup.nodes.Entities.EscapeMode escapeMode9 = outputSettings7.escapeMode();
        org.jsoup.nodes.Document.OutputSettings outputSettings10 = outputSettings0.escapeMode(escapeMode9);
        org.jsoup.nodes.Document.OutputSettings outputSettings12 = outputSettings0.prettyPrint(false);
        org.jsoup.nodes.Entities.EscapeMode escapeMode13 = outputSettings12.escapeMode();
        org.jsoup.nodes.Document.OutputSettings outputSettings14 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Entities.EscapeMode escapeMode15 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings16 = outputSettings14.escapeMode(escapeMode15);
        org.jsoup.nodes.Document.OutputSettings outputSettings18 = outputSettings16.prettyPrint(false);
        org.jsoup.nodes.Document.OutputSettings outputSettings20 = outputSettings16.indentAmount((int) ' ');
        org.jsoup.nodes.Document.OutputSettings outputSettings21 = new org.jsoup.nodes.Document.OutputSettings();
        int int22 = outputSettings21.indentAmount();
        org.jsoup.nodes.Document.OutputSettings outputSettings24 = outputSettings21.forceAllElementAsBlock(true);
        boolean boolean25 = outputSettings21.forceAllElementAsBlock();
        org.jsoup.nodes.Document.OutputSettings outputSettings26 = new org.jsoup.nodes.Document.OutputSettings();
        boolean boolean27 = outputSettings26.prettyPrint();
        org.jsoup.nodes.Entities.EscapeMode escapeMode28 = outputSettings26.escapeMode();
        int int29 = outputSettings26.indentAmount();
        org.jsoup.nodes.Document.OutputSettings outputSettings31 = outputSettings26.prettyPrint(false);
        java.nio.charset.Charset charset32 = outputSettings31.charset();
        org.jsoup.nodes.Document.OutputSettings outputSettings33 = outputSettings21.charset(charset32);
        org.jsoup.nodes.Document.OutputSettings outputSettings34 = outputSettings16.charset(charset32);
        org.jsoup.nodes.Document.OutputSettings outputSettings35 = outputSettings12.charset(charset32);
        boolean boolean36 = outputSettings35.forceAllElementAsBlock();
        int int37 = outputSettings35.indentAmount();
        org.jsoup.nodes.Document.OutputSettings outputSettings39 = outputSettings35.prettyPrint(true);
        org.jsoup.nodes.Document.OutputSettings outputSettings40 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Entities.EscapeMode escapeMode41 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings42 = outputSettings40.escapeMode(escapeMode41);
        int int43 = outputSettings40.indentAmount();
        org.jsoup.nodes.Document.OutputSettings outputSettings45 = outputSettings40.forceAllElementAsBlock(false);
        int int46 = outputSettings40.indentAmount();
        org.jsoup.nodes.Document.OutputSettings outputSettings47 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Entities.EscapeMode escapeMode48 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings49 = outputSettings47.escapeMode(escapeMode48);
        java.nio.charset.Charset charset50 = outputSettings49.charset();
        org.jsoup.nodes.Document.OutputSettings outputSettings51 = outputSettings40.charset(charset50);
        boolean boolean52 = outputSettings51.forceAllElementAsBlock();
        org.jsoup.nodes.Document.OutputSettings outputSettings53 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Entities.EscapeMode escapeMode54 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings55 = outputSettings53.escapeMode(escapeMode54);
        java.nio.charset.Charset charset56 = outputSettings53.charset();
        org.jsoup.nodes.Document.OutputSettings outputSettings58 = outputSettings53.forceAllElementAsBlock(false);
        org.jsoup.nodes.Document.OutputSettings outputSettings60 = outputSettings53.indentAmount((int) (byte) 10);
        org.jsoup.nodes.Document.OutputSettings outputSettings62 = outputSettings60.indentAmount((int) ' ');
        org.jsoup.nodes.Document.OutputSettings outputSettings63 = new org.jsoup.nodes.Document.OutputSettings();
        int int64 = outputSettings63.indentAmount();
        org.jsoup.nodes.Document.OutputSettings outputSettings66 = outputSettings63.forceAllElementAsBlock(true);
        boolean boolean67 = outputSettings63.forceAllElementAsBlock();
        org.jsoup.nodes.Document.OutputSettings outputSettings69 = outputSettings63.indentAmount((int) (byte) 10);
        org.jsoup.nodes.Document.OutputSettings outputSettings70 = new org.jsoup.nodes.Document.OutputSettings();
        boolean boolean71 = outputSettings70.prettyPrint();
        org.jsoup.nodes.Entities.EscapeMode escapeMode72 = outputSettings70.escapeMode();
        org.jsoup.nodes.Document.OutputSettings outputSettings73 = outputSettings63.escapeMode(escapeMode72);
        org.jsoup.nodes.Document.OutputSettings outputSettings74 = outputSettings60.escapeMode(escapeMode72);
        org.jsoup.nodes.Document.OutputSettings outputSettings75 = outputSettings51.escapeMode(escapeMode72);
        org.jsoup.nodes.Document.OutputSettings outputSettings76 = new org.jsoup.nodes.Document.OutputSettings();
        boolean boolean77 = outputSettings76.prettyPrint();
        org.jsoup.nodes.Entities.EscapeMode escapeMode78 = outputSettings76.escapeMode();
        int int79 = outputSettings76.indentAmount();
        org.jsoup.nodes.Document.OutputSettings outputSettings81 = outputSettings76.prettyPrint(false);
        org.jsoup.nodes.Document.OutputSettings outputSettings82 = new org.jsoup.nodes.Document.OutputSettings();
        boolean boolean83 = outputSettings82.prettyPrint();
        org.jsoup.nodes.Entities.EscapeMode escapeMode84 = outputSettings82.escapeMode();
        org.jsoup.nodes.Document.OutputSettings outputSettings85 = outputSettings81.escapeMode(escapeMode84);
        org.jsoup.nodes.Document.OutputSettings outputSettings86 = outputSettings81.clone();
        org.jsoup.nodes.Entities.EscapeMode escapeMode87 = outputSettings81.escapeMode();
        org.jsoup.nodes.Document.OutputSettings outputSettings88 = outputSettings75.escapeMode(escapeMode87);
        org.jsoup.nodes.Document.OutputSettings outputSettings89 = outputSettings35.escapeMode(escapeMode87);
        org.jsoup.nodes.Document.OutputSettings outputSettings91 = outputSettings89.prettyPrint(false);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1 + "'", int1 == 1);
        org.junit.Assert.assertNotNull(outputSettings3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(outputSettings6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + escapeMode9 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode9.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertNotNull(outputSettings10);
        org.junit.Assert.assertNotNull(outputSettings12);
        org.junit.Assert.assertTrue("'" + escapeMode13 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode13.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertNotNull(outputSettings16);
        org.junit.Assert.assertNotNull(outputSettings18);
        org.junit.Assert.assertNotNull(outputSettings20);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 1 + "'", int22 == 1);
        org.junit.Assert.assertNotNull(outputSettings24);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertTrue("'" + escapeMode28 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode28.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 1 + "'", int29 == 1);
        org.junit.Assert.assertNotNull(outputSettings31);
        org.junit.Assert.assertNotNull(charset32);
        org.junit.Assert.assertNotNull(outputSettings33);
        org.junit.Assert.assertNotNull(outputSettings34);
        org.junit.Assert.assertNotNull(outputSettings35);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + true + "'", boolean36 == true);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 10 + "'", int37 == 10);
        org.junit.Assert.assertNotNull(outputSettings39);
        org.junit.Assert.assertNotNull(outputSettings42);
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + 1 + "'", int43 == 1);
        org.junit.Assert.assertNotNull(outputSettings45);
        org.junit.Assert.assertTrue("'" + int46 + "' != '" + 1 + "'", int46 == 1);
        org.junit.Assert.assertNotNull(outputSettings49);
        org.junit.Assert.assertNotNull(charset50);
        org.junit.Assert.assertNotNull(outputSettings51);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
        org.junit.Assert.assertNotNull(outputSettings55);
        org.junit.Assert.assertNotNull(charset56);
        org.junit.Assert.assertNotNull(outputSettings58);
        org.junit.Assert.assertNotNull(outputSettings60);
        org.junit.Assert.assertNotNull(outputSettings62);
        org.junit.Assert.assertTrue("'" + int64 + "' != '" + 1 + "'", int64 == 1);
        org.junit.Assert.assertNotNull(outputSettings66);
        org.junit.Assert.assertTrue("'" + boolean67 + "' != '" + true + "'", boolean67 == true);
        org.junit.Assert.assertNotNull(outputSettings69);
        org.junit.Assert.assertTrue("'" + boolean71 + "' != '" + true + "'", boolean71 == true);
        org.junit.Assert.assertTrue("'" + escapeMode72 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode72.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertNotNull(outputSettings73);
        org.junit.Assert.assertNotNull(outputSettings74);
        org.junit.Assert.assertNotNull(outputSettings75);
        org.junit.Assert.assertTrue("'" + boolean77 + "' != '" + true + "'", boolean77 == true);
        org.junit.Assert.assertTrue("'" + escapeMode78 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode78.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertTrue("'" + int79 + "' != '" + 1 + "'", int79 == 1);
        org.junit.Assert.assertNotNull(outputSettings81);
        org.junit.Assert.assertTrue("'" + boolean83 + "' != '" + true + "'", boolean83 == true);
        org.junit.Assert.assertTrue("'" + escapeMode84 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode84.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertNotNull(outputSettings85);
        org.junit.Assert.assertNotNull(outputSettings86);
        org.junit.Assert.assertTrue("'" + escapeMode87 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode87.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertNotNull(outputSettings88);
        org.junit.Assert.assertNotNull(outputSettings89);
        org.junit.Assert.assertNotNull(outputSettings91);
    }

    @Test
    public void test20720() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20720");
        org.jsoup.nodes.Document.OutputSettings outputSettings0 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Entities.EscapeMode escapeMode1 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings2 = outputSettings0.escapeMode(escapeMode1);
        org.jsoup.nodes.Document.OutputSettings outputSettings4 = outputSettings0.forceAllElementAsBlock(false);
        org.jsoup.nodes.Document.OutputSettings outputSettings5 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Entities.EscapeMode escapeMode6 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings7 = outputSettings5.escapeMode(escapeMode6);
        int int8 = outputSettings5.indentAmount();
        org.jsoup.nodes.Document.OutputSettings outputSettings9 = new org.jsoup.nodes.Document.OutputSettings();
        boolean boolean10 = outputSettings9.prettyPrint();
        org.jsoup.nodes.Document.OutputSettings outputSettings12 = outputSettings9.prettyPrint(true);
        java.nio.charset.Charset charset13 = outputSettings9.charset();
        org.jsoup.nodes.Document.OutputSettings outputSettings14 = outputSettings5.charset(charset13);
        org.jsoup.nodes.Document.OutputSettings outputSettings15 = outputSettings4.charset(charset13);
        org.jsoup.nodes.Document.OutputSettings outputSettings17 = outputSettings4.prettyPrint(false);
        int int18 = outputSettings17.indentAmount();
        org.jsoup.nodes.Document.OutputSettings outputSettings20 = outputSettings17.indentAmount(97);
        org.jsoup.nodes.Document.OutputSettings outputSettings22 = outputSettings20.prettyPrint(false);
        int int23 = outputSettings22.indentAmount();
        org.jsoup.nodes.Entities.EscapeMode escapeMode24 = outputSettings22.escapeMode();
        int int25 = outputSettings22.indentAmount();
        org.junit.Assert.assertNotNull(outputSettings2);
        org.junit.Assert.assertNotNull(outputSettings4);
        org.junit.Assert.assertNotNull(outputSettings7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(outputSettings12);
        org.junit.Assert.assertNotNull(charset13);
        org.junit.Assert.assertNotNull(outputSettings14);
        org.junit.Assert.assertNotNull(outputSettings15);
        org.junit.Assert.assertNotNull(outputSettings17);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertNotNull(outputSettings20);
        org.junit.Assert.assertNotNull(outputSettings22);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 97 + "'", int23 == 97);
        org.junit.Assert.assertNull(escapeMode24);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 97 + "'", int25 == 97);
    }

    @Test
    public void test20721() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20721");
        org.jsoup.nodes.Document.OutputSettings outputSettings0 = new org.jsoup.nodes.Document.OutputSettings();
        boolean boolean1 = outputSettings0.prettyPrint();
        org.jsoup.nodes.Entities.EscapeMode escapeMode2 = outputSettings0.escapeMode();
        boolean boolean3 = outputSettings0.forceAllElementAsBlock();
        org.jsoup.nodes.Document.OutputSettings outputSettings5 = outputSettings0.forceAllElementAsBlock(true);
        org.jsoup.nodes.Entities.EscapeMode escapeMode6 = outputSettings5.escapeMode();
        org.jsoup.nodes.Document.OutputSettings outputSettings7 = outputSettings5.clone();
        org.jsoup.nodes.Document.OutputSettings outputSettings9 = outputSettings5.prettyPrint(true);
        org.jsoup.nodes.Document.OutputSettings outputSettings11 = outputSettings5.prettyPrint(true);
        org.jsoup.nodes.Document.OutputSettings outputSettings12 = new org.jsoup.nodes.Document.OutputSettings();
        boolean boolean13 = outputSettings12.prettyPrint();
        org.jsoup.nodes.Document.OutputSettings outputSettings15 = outputSettings12.prettyPrint(true);
        java.nio.charset.Charset charset16 = outputSettings12.charset();
        org.jsoup.nodes.Document.OutputSettings outputSettings18 = outputSettings12.forceAllElementAsBlock(false);
        org.jsoup.nodes.Document.OutputSettings outputSettings19 = new org.jsoup.nodes.Document.OutputSettings();
        int int20 = outputSettings19.indentAmount();
        org.jsoup.nodes.Document.OutputSettings outputSettings22 = outputSettings19.forceAllElementAsBlock(true);
        java.nio.charset.Charset charset23 = outputSettings19.charset();
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
        org.jsoup.nodes.Document.OutputSettings outputSettings39 = outputSettings19.escapeMode(escapeMode36);
        org.jsoup.nodes.Document.OutputSettings outputSettings40 = outputSettings18.escapeMode(escapeMode36);
        org.jsoup.nodes.Entities.EscapeMode escapeMode41 = outputSettings40.escapeMode();
        org.jsoup.nodes.Document.OutputSettings outputSettings42 = outputSettings11.escapeMode(escapeMode41);
        org.jsoup.nodes.Document.OutputSettings outputSettings44 = outputSettings11.forceAllElementAsBlock(true);
        org.jsoup.nodes.Document.OutputSettings outputSettings45 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Entities.EscapeMode escapeMode46 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings47 = outputSettings45.escapeMode(escapeMode46);
        int int48 = outputSettings45.indentAmount();
        org.jsoup.nodes.Document.OutputSettings outputSettings50 = outputSettings45.forceAllElementAsBlock(false);
        int int51 = outputSettings45.indentAmount();
        org.jsoup.nodes.Entities.EscapeMode escapeMode52 = outputSettings45.escapeMode();
        org.jsoup.nodes.Document.OutputSettings outputSettings53 = new org.jsoup.nodes.Document.OutputSettings();
        boolean boolean54 = outputSettings53.prettyPrint();
        org.jsoup.nodes.Document.OutputSettings outputSettings56 = outputSettings53.prettyPrint(true);
        java.nio.charset.Charset charset57 = outputSettings53.charset();
        org.jsoup.nodes.Document.OutputSettings outputSettings58 = outputSettings45.charset(charset57);
        java.nio.charset.Charset charset59 = outputSettings45.charset();
        org.jsoup.nodes.Document.OutputSettings outputSettings60 = outputSettings11.charset(charset59);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + escapeMode2 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode2.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(outputSettings5);
        org.junit.Assert.assertTrue("'" + escapeMode6 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode6.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertNotNull(outputSettings7);
        org.junit.Assert.assertNotNull(outputSettings9);
        org.junit.Assert.assertNotNull(outputSettings11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNotNull(outputSettings15);
        org.junit.Assert.assertNotNull(charset16);
        org.junit.Assert.assertNotNull(outputSettings18);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 1 + "'", int20 == 1);
        org.junit.Assert.assertNotNull(outputSettings22);
        org.junit.Assert.assertNotNull(charset23);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertNotNull(outputSettings27);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertTrue("'" + escapeMode30 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode30.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 1 + "'", int31 == 1);
        org.junit.Assert.assertNotNull(outputSettings33);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + true + "'", boolean35 == true);
        org.junit.Assert.assertTrue("'" + escapeMode36 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode36.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertNotNull(outputSettings37);
        org.junit.Assert.assertNotNull(outputSettings38);
        org.junit.Assert.assertNotNull(outputSettings39);
        org.junit.Assert.assertNotNull(outputSettings40);
        org.junit.Assert.assertTrue("'" + escapeMode41 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode41.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertNotNull(outputSettings42);
        org.junit.Assert.assertNotNull(outputSettings44);
        org.junit.Assert.assertNotNull(outputSettings47);
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + 1 + "'", int48 == 1);
        org.junit.Assert.assertNotNull(outputSettings50);
        org.junit.Assert.assertTrue("'" + int51 + "' != '" + 1 + "'", int51 == 1);
        org.junit.Assert.assertNull(escapeMode52);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + true + "'", boolean54 == true);
        org.junit.Assert.assertNotNull(outputSettings56);
        org.junit.Assert.assertNotNull(charset57);
        org.junit.Assert.assertNotNull(outputSettings58);
        org.junit.Assert.assertNotNull(charset59);
        org.junit.Assert.assertNotNull(outputSettings60);
    }

    @Test
    public void test20722() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20722");
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
        org.jsoup.nodes.Node node14 = textNode4.clone();
        java.lang.String str15 = textNode4.baseUri();
        java.lang.String str16 = textNode4.nodeName();
        java.lang.String str18 = textNode4.attr("#");
        org.junit.Assert.assertNotNull(textNode2);
        org.junit.Assert.assertNotNull(textNode4);
        org.junit.Assert.assertNotNull(textNode6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "#text" + "'", str7, "#text");
        org.junit.Assert.assertNotNull(nodeList8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "#text" + "'", str9, "#text");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "#text" + "'", str10, "#text");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "#text" + "'", str11, "#text");
        org.junit.Assert.assertNull(node12);
        org.junit.Assert.assertNotNull(node13);
        org.junit.Assert.assertNotNull(node14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "#text" + "'", str16, "#text");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
    }

    @Test
    public void test20723() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20723");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("", "");
        org.jsoup.nodes.TextNode textNode4 = textNode2.text("");
        java.lang.String str5 = textNode2.outerHtml();
        java.lang.String str7 = textNode2.attr("");
        org.jsoup.nodes.Node node9 = textNode2.removeAttr("#text");
        textNode2.setBaseUri("hi!");
        java.lang.String str13 = textNode2.attr("");
        org.jsoup.nodes.Node node14 = textNode2.clone();
        java.lang.String str15 = textNode2.toString();
        org.jsoup.nodes.Attributes attributes16 = textNode2.attributes();
        org.jsoup.nodes.Attributes attributes17 = textNode2.attributes();
        org.jsoup.nodes.TextNode textNode20 = org.jsoup.nodes.TextNode.createFromEncoded("", "");
        boolean boolean21 = textNode20.isBlank();
        org.jsoup.nodes.Node node24 = textNode20.attr("hi!", "hi!");
        org.jsoup.nodes.TextNode textNode26 = textNode20.text("#text");
        java.lang.String str27 = textNode26.getWholeText();
        boolean boolean28 = textNode26.isBlank();
        org.jsoup.nodes.TextNode textNode30 = textNode26.text("#text");
        org.jsoup.nodes.TextNode textNode33 = org.jsoup.nodes.TextNode.createFromEncoded("", "");
        java.lang.String str34 = textNode33.getWholeText();
        java.lang.String str36 = textNode33.attr("hi!");
        org.jsoup.nodes.Node node37 = textNode33.parent();
        boolean boolean38 = textNode26.equals((java.lang.Object) node37);
        org.jsoup.nodes.Node node41 = textNode26.attr("#text", "text");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node42 = textNode2.after((org.jsoup.nodes.Node) textNode26);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(textNode2);
        org.junit.Assert.assertNotNull(textNode4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNotNull(node9);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNotNull(node14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertNotNull(attributes16);
        org.junit.Assert.assertNotNull(attributes17);
        org.junit.Assert.assertNotNull(textNode20);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertNotNull(node24);
        org.junit.Assert.assertNotNull(textNode26);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "#text" + "'", str27, "#text");
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertNotNull(textNode30);
        org.junit.Assert.assertNotNull(textNode33);
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "" + "'", str34, "");
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "" + "'", str36, "");
        org.junit.Assert.assertNull(node37);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertNotNull(node41);
    }

    @Test
    public void test20724() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20724");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("", "");
        java.lang.String str3 = textNode2.text();
        java.lang.String str4 = textNode2.getWholeText();
        org.junit.Assert.assertNotNull(textNode2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
    }

    @Test
    public void test20725() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20725");
        org.jsoup.nodes.Document.OutputSettings outputSettings0 = new org.jsoup.nodes.Document.OutputSettings();
        int int1 = outputSettings0.indentAmount();
        org.jsoup.nodes.Document.OutputSettings outputSettings3 = outputSettings0.forceAllElementAsBlock(true);
        org.jsoup.nodes.Document.OutputSettings outputSettings5 = outputSettings0.prettyPrint(true);
        java.nio.charset.Charset charset6 = outputSettings0.charset();
        org.jsoup.nodes.Document.OutputSettings outputSettings8 = outputSettings0.prettyPrint(false);
        org.jsoup.nodes.Document.OutputSettings outputSettings10 = outputSettings8.forceAllElementAsBlock(false);
        int int11 = outputSettings8.indentAmount();
        org.jsoup.nodes.TextNode textNode14 = org.jsoup.nodes.TextNode.createFromEncoded("", "");
        boolean boolean15 = textNode14.isBlank();
        org.jsoup.nodes.Document.OutputSettings outputSettings16 = new org.jsoup.nodes.Document.OutputSettings();
        boolean boolean17 = outputSettings16.prettyPrint();
        org.jsoup.nodes.Entities.EscapeMode escapeMode18 = outputSettings16.escapeMode();
        int int19 = outputSettings16.indentAmount();
        org.jsoup.nodes.Document.OutputSettings outputSettings21 = outputSettings16.prettyPrint(false);
        java.nio.charset.Charset charset22 = outputSettings21.charset();
        boolean boolean23 = textNode14.equals((java.lang.Object) outputSettings21);
        boolean boolean24 = outputSettings21.forceAllElementAsBlock();
        java.nio.charset.Charset charset25 = outputSettings21.charset();
        org.jsoup.nodes.Document.OutputSettings outputSettings26 = outputSettings8.charset(charset25);
        boolean boolean27 = outputSettings26.prettyPrint();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1 + "'", int1 == 1);
        org.junit.Assert.assertNotNull(outputSettings3);
        org.junit.Assert.assertNotNull(outputSettings5);
        org.junit.Assert.assertNotNull(charset6);
        org.junit.Assert.assertNotNull(outputSettings8);
        org.junit.Assert.assertNotNull(outputSettings10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertNotNull(textNode14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + escapeMode18 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode18.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 1 + "'", int19 == 1);
        org.junit.Assert.assertNotNull(outputSettings21);
        org.junit.Assert.assertNotNull(charset22);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(charset25);
        org.junit.Assert.assertNotNull(outputSettings26);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
    }

    @Test
    public void test20726() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20726");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("", "");
        org.jsoup.nodes.TextNode textNode4 = textNode2.text("");
        org.jsoup.nodes.TextNode textNode6 = textNode4.text("#text");
        org.jsoup.nodes.Node node7 = textNode6.nextSibling();
        org.jsoup.nodes.Node node9 = textNode6.removeAttr("#text");
        java.lang.String str10 = textNode6.getWholeText();
        boolean boolean12 = textNode6.hasAttr("");
        java.lang.String str14 = textNode6.absUrl("#text");
        org.jsoup.nodes.TextNode textNode16 = textNode6.splitText((int) (short) 0);
        java.lang.Class<?> wildcardClass17 = textNode16.getClass();
        org.junit.Assert.assertNotNull(textNode2);
        org.junit.Assert.assertNotNull(textNode4);
        org.junit.Assert.assertNotNull(textNode6);
        org.junit.Assert.assertNull(node7);
        org.junit.Assert.assertNotNull(node9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "#text" + "'", str10, "#text");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertNotNull(textNode16);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test20727() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20727");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("", "");
        java.lang.String str3 = textNode2.baseUri();
        boolean boolean5 = textNode2.hasAttr("#text");
        java.lang.String str7 = textNode2.attr("");
        java.lang.String str8 = textNode2.nodeName();
        java.lang.String str9 = textNode2.outerHtml();
        java.lang.String str10 = textNode2.getWholeText();
        org.jsoup.nodes.Node node11 = textNode2.clone();
        org.jsoup.nodes.TextNode textNode13 = textNode2.text("i!");
        org.jsoup.nodes.Attributes attributes14 = textNode13.attributes();
        org.junit.Assert.assertNotNull(textNode2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "#text" + "'", str8, "#text");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNotNull(node11);
        org.junit.Assert.assertNotNull(textNode13);
        org.junit.Assert.assertNotNull(attributes14);
    }

    @Test
    public void test20728() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20728");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("", "");
        java.lang.String str3 = textNode2.baseUri();
        boolean boolean5 = textNode2.hasAttr("#text");
        java.lang.String str7 = textNode2.attr("");
        boolean boolean9 = textNode2.hasAttr("#text");
        java.lang.String str10 = textNode2.text();
        org.jsoup.nodes.TextNode textNode12 = textNode2.text("hi!");
        java.lang.String str13 = textNode12.getWholeText();
        int int14 = textNode12.siblingIndex();
        org.jsoup.nodes.TextNode textNode16 = textNode12.splitText((int) (short) 0);
        java.lang.String str17 = textNode16.getWholeText();
        org.jsoup.nodes.Node node18 = textNode16.clone();
        org.junit.Assert.assertNotNull(textNode2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNotNull(textNode12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertNotNull(textNode16);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
        org.junit.Assert.assertNotNull(node18);
    }

    @Test
    public void test20729() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20729");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("", "");
        java.lang.String str3 = textNode2.toString();
        int int4 = textNode2.siblingIndex();
        java.lang.String str5 = textNode2.nodeName();
        org.jsoup.nodes.TextNode textNode7 = textNode2.text("");
        org.jsoup.nodes.Node node8 = textNode2.previousSibling();
        java.lang.String str9 = textNode2.text();
        java.lang.String str10 = textNode2.getWholeText();
        java.lang.String str11 = textNode2.nodeName();
        java.lang.String str12 = textNode2.toString();
        org.jsoup.nodes.Node node13 = textNode2.previousSibling();
        org.jsoup.nodes.TextNode textNode16 = org.jsoup.nodes.TextNode.createFromEncoded("hi!", "");
        java.lang.String str17 = textNode16.baseUri();
        boolean boolean19 = textNode16.hasAttr("");
        java.lang.String str20 = textNode16.getWholeText();
        org.jsoup.nodes.Node node22 = textNode16.removeAttr("i!");
        java.lang.String str23 = textNode16.baseUri();
        org.jsoup.nodes.Attributes attributes24 = textNode16.attributes();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean25 = node13.equals((java.lang.Object) attributes24);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(textNode2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "#text" + "'", str5, "#text");
        org.junit.Assert.assertNotNull(textNode7);
        org.junit.Assert.assertNull(node8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "#text" + "'", str11, "#text");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertNull(node13);
        org.junit.Assert.assertNotNull(textNode16);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "hi!" + "'", str20, "hi!");
        org.junit.Assert.assertNotNull(node22);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
        org.junit.Assert.assertNotNull(attributes24);
    }

    @Test
    public void test20730() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20730");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("", "");
        java.lang.String str3 = textNode2.getWholeText();
        java.lang.String str4 = textNode2.baseUri();
        org.jsoup.nodes.TextNode textNode6 = textNode2.text("hi!");
        org.jsoup.nodes.Node node7 = textNode6.clone();
        org.jsoup.nodes.Node node9 = textNode6.removeAttr("hi!");
        java.lang.String str10 = textNode6.toString();
        textNode6.setBaseUri("");
        java.lang.String str13 = textNode6.baseUri();
        org.jsoup.nodes.Node node14 = textNode6.clone();
        org.jsoup.nodes.Node node17 = textNode6.attr("#text", "#text");
        org.jsoup.nodes.Node node18 = textNode6.clone();
        boolean boolean19 = textNode6.isBlank();
        org.junit.Assert.assertNotNull(textNode2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(textNode6);
        org.junit.Assert.assertNotNull(node7);
        org.junit.Assert.assertNotNull(node9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNotNull(node14);
        org.junit.Assert.assertNotNull(node17);
        org.junit.Assert.assertNotNull(node18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }

    @Test
    public void test20731() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20731");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("", "");
        java.lang.String str3 = textNode2.getWholeText();
        java.lang.String str4 = textNode2.baseUri();
        org.jsoup.nodes.TextNode textNode6 = textNode2.text("hi!");
        org.jsoup.nodes.Node node7 = textNode6.clone();
        org.jsoup.nodes.Node node9 = textNode6.removeAttr("hi!");
        java.lang.String str10 = textNode6.toString();
        java.util.List<org.jsoup.nodes.Node> nodeList11 = textNode6.siblingNodes();
        org.jsoup.nodes.TextNode textNode13 = textNode6.splitText((int) (short) 0);
        java.lang.String str14 = textNode13.text();
        org.jsoup.nodes.Node node15 = textNode13.previousSibling();
        boolean boolean16 = textNode13.isBlank();
        org.jsoup.nodes.Attributes attributes17 = textNode13.attributes();
        org.junit.Assert.assertNotNull(textNode2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(textNode6);
        org.junit.Assert.assertNotNull(node7);
        org.junit.Assert.assertNotNull(node9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertNotNull(nodeList11);
        org.junit.Assert.assertNotNull(textNode13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertNull(node15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(attributes17);
    }

    @Test
    public void test20732() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20732");
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
        org.jsoup.nodes.Node node22 = textNode2.removeAttr("text");
        java.lang.String str24 = textNode2.absUrl("hi!");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node26 = textNode2.removeAttr("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: String must not be empty");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(textNode2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNotNull(textNode10);
        org.junit.Assert.assertNotNull(textNode12);
        org.junit.Assert.assertNotNull(textNode14);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(nodeList20);
        org.junit.Assert.assertNotNull(node22);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "" + "'", str24, "");
    }

    @Test
    public void test20733() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20733");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("", "");
        java.lang.String str3 = textNode2.baseUri();
        boolean boolean5 = textNode2.hasAttr("#text");
        java.lang.String str7 = textNode2.attr("");
        textNode2.setBaseUri("#text");
        org.jsoup.nodes.Node node10 = textNode2.clone();
        java.lang.String str12 = textNode2.absUrl("#text");
        java.lang.String str14 = textNode2.attr("hi!");
        int int15 = textNode2.siblingIndex();
        org.jsoup.nodes.Node node18 = textNode2.attr("text", "");
        java.lang.String str19 = node18.baseUri();
        org.junit.Assert.assertNotNull(textNode2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNotNull(node10);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertNotNull(node18);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "#text" + "'", str19, "#text");
    }

    @Test
    public void test20734() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20734");
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
        org.jsoup.nodes.TextNode textNode16 = textNode14.text("h");
        org.junit.Assert.assertNotNull(textNode2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(textNode6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertNotNull(textNode10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(textNode14);
        org.junit.Assert.assertNotNull(textNode16);
    }

    @Test
    public void test20735() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20735");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("", "");
        boolean boolean3 = textNode2.isBlank();
        org.jsoup.nodes.Node node6 = textNode2.attr("hi!", "hi!");
        org.jsoup.nodes.TextNode textNode8 = textNode2.text("#text");
        org.jsoup.nodes.Node node10 = textNode8.removeAttr("#text");
        java.util.List<org.jsoup.nodes.Node> nodeList11 = textNode8.siblingNodes();
        java.lang.String str12 = textNode8.outerHtml();
        java.lang.String str14 = textNode8.attr("i!");
        boolean boolean15 = textNode8.isBlank();
        org.jsoup.nodes.TextNode textNode17 = textNode8.splitText((int) (byte) 1);
        java.lang.String str18 = textNode17.getWholeText();
        org.jsoup.nodes.TextNode textNode20 = textNode17.text("");
        org.jsoup.select.NodeVisitor nodeVisitor21 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node22 = textNode20.traverse(nodeVisitor21);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(textNode2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(node6);
        org.junit.Assert.assertNotNull(textNode8);
        org.junit.Assert.assertNotNull(node10);
        org.junit.Assert.assertNotNull(nodeList11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "#text" + "'", str12, "#text");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(textNode17);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "text" + "'", str18, "text");
        org.junit.Assert.assertNotNull(textNode20);
    }

    @Test
    public void test20736() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20736");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("", "");
        java.lang.String str3 = textNode2.toString();
        int int4 = textNode2.siblingIndex();
        java.lang.String str5 = textNode2.nodeName();
        org.jsoup.nodes.Node node6 = textNode2.clone();
        java.lang.String str7 = textNode2.text();
        java.util.List<org.jsoup.nodes.Node> nodeList8 = textNode2.siblingNodes();
        java.lang.String str10 = textNode2.absUrl("#");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node12 = textNode2.before("i!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(textNode2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "#text" + "'", str5, "#text");
        org.junit.Assert.assertNotNull(node6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNotNull(nodeList8);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
    }

    @Test
    public void test20737() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20737");
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
        org.jsoup.nodes.Document.OutputSettings outputSettings24 = outputSettings20.forceAllElementAsBlock(true);
        org.jsoup.nodes.Document.OutputSettings outputSettings26 = outputSettings24.forceAllElementAsBlock(false);
        org.jsoup.nodes.Document.OutputSettings outputSettings27 = outputSettings26.clone();
        org.jsoup.nodes.Document.OutputSettings outputSettings28 = outputSettings27.clone();
        int int29 = outputSettings28.indentAmount();
        boolean boolean30 = outputSettings28.prettyPrint();
        org.junit.Assert.assertNotNull(textNode2);
        org.junit.Assert.assertNotNull(textNode4);
        org.junit.Assert.assertNotNull(textNode6);
        org.junit.Assert.assertNotNull(attributes7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "#text" + "'", str8, "#text");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "#text" + "'", str9, "#text");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "#text" + "'", str10, "#text");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + escapeMode13 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode13.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + escapeMode17 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode17.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertNotNull(outputSettings18);
        org.junit.Assert.assertNotNull(outputSettings20);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(outputSettings24);
        org.junit.Assert.assertNotNull(outputSettings26);
        org.junit.Assert.assertNotNull(outputSettings27);
        org.junit.Assert.assertNotNull(outputSettings28);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 1 + "'", int29 == 1);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
    }

    @Test
    public void test20738() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20738");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("hi!", "hi!");
        boolean boolean4 = textNode2.hasAttr("hi!");
        java.lang.String str5 = textNode2.getWholeText();
        java.lang.String str6 = textNode2.text();
        boolean boolean7 = textNode2.isBlank();
        java.lang.String str8 = textNode2.baseUri();
        boolean boolean10 = textNode2.hasAttr("");
        java.lang.String str11 = textNode2.nodeName();
        boolean boolean13 = textNode2.hasAttr("");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "#text" + "'", str11, "#text");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test20739() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20739");
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
        org.jsoup.nodes.Node node17 = textNode14.attr("text", "h");
        org.junit.Assert.assertNotNull(textNode2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(textNode6);
        org.junit.Assert.assertNotNull(node7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNull(node12);
        org.junit.Assert.assertNotNull(textNode14);
        org.junit.Assert.assertNotNull(node17);
    }

    @Test
    public void test20740() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20740");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("hi!", "i!");
        int int3 = textNode2.siblingIndex();
        java.util.List<org.jsoup.nodes.Node> nodeList4 = textNode2.childNodes();
        java.lang.String str6 = textNode2.attr("i!");
        java.lang.String str8 = textNode2.absUrl("hi!");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(nodeList4);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
    }

    @Test
    public void test20741() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20741");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("", "");
        org.jsoup.nodes.TextNode textNode4 = textNode2.text("");
        org.jsoup.nodes.TextNode textNode6 = textNode4.text("#text");
        textNode4.setBaseUri("#text");
        org.jsoup.nodes.TextNode textNode10 = textNode4.text("hi!");
        org.jsoup.nodes.TextNode textNode12 = textNode10.text("hi!");
        org.jsoup.nodes.Node node13 = textNode10.clone();
        org.jsoup.nodes.TextNode textNode15 = textNode10.text("h");
        org.jsoup.nodes.Node node16 = textNode15.clone();
        org.jsoup.nodes.Document.OutputSettings outputSettings17 = new org.jsoup.nodes.Document.OutputSettings();
        boolean boolean18 = outputSettings17.prettyPrint();
        org.jsoup.nodes.Document.OutputSettings outputSettings20 = outputSettings17.prettyPrint(true);
        org.jsoup.nodes.Document.OutputSettings outputSettings21 = new org.jsoup.nodes.Document.OutputSettings();
        boolean boolean22 = outputSettings21.prettyPrint();
        org.jsoup.nodes.Entities.EscapeMode escapeMode23 = outputSettings21.escapeMode();
        int int24 = outputSettings21.indentAmount();
        org.jsoup.nodes.Document.OutputSettings outputSettings26 = outputSettings21.prettyPrint(false);
        org.jsoup.nodes.Document.OutputSettings outputSettings27 = new org.jsoup.nodes.Document.OutputSettings();
        boolean boolean28 = outputSettings27.prettyPrint();
        org.jsoup.nodes.Entities.EscapeMode escapeMode29 = outputSettings27.escapeMode();
        org.jsoup.nodes.Document.OutputSettings outputSettings30 = outputSettings26.escapeMode(escapeMode29);
        org.jsoup.nodes.Document.OutputSettings outputSettings31 = outputSettings17.escapeMode(escapeMode29);
        org.jsoup.nodes.Entities.EscapeMode escapeMode32 = outputSettings17.escapeMode();
        org.jsoup.nodes.Document.OutputSettings outputSettings33 = outputSettings17.clone();
        org.jsoup.nodes.Document.OutputSettings outputSettings34 = outputSettings17.clone();
        org.jsoup.nodes.Document.OutputSettings outputSettings36 = outputSettings17.indentAmount((int) (byte) 1);
        java.nio.charset.Charset charset37 = outputSettings36.charset();
        org.jsoup.nodes.Document.OutputSettings outputSettings39 = outputSettings36.prettyPrint(true);
        org.jsoup.nodes.TextNode textNode42 = org.jsoup.nodes.TextNode.createFromEncoded("", "");
        java.lang.String str43 = textNode42.getWholeText();
        java.lang.String str44 = textNode42.baseUri();
        org.jsoup.nodes.TextNode textNode46 = textNode42.text("hi!");
        org.jsoup.nodes.Node node47 = textNode46.clone();
        org.jsoup.nodes.Node node49 = textNode46.removeAttr("hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList50 = textNode46.siblingNodes();
        java.lang.String str52 = textNode46.absUrl("#text");
        org.jsoup.nodes.Document.OutputSettings outputSettings53 = new org.jsoup.nodes.Document.OutputSettings();
        boolean boolean54 = outputSettings53.prettyPrint();
        org.jsoup.nodes.Document.OutputSettings outputSettings56 = outputSettings53.prettyPrint(true);
        org.jsoup.nodes.Document.OutputSettings outputSettings57 = new org.jsoup.nodes.Document.OutputSettings();
        boolean boolean58 = outputSettings57.prettyPrint();
        org.jsoup.nodes.Entities.EscapeMode escapeMode59 = outputSettings57.escapeMode();
        int int60 = outputSettings57.indentAmount();
        org.jsoup.nodes.Document.OutputSettings outputSettings62 = outputSettings57.prettyPrint(false);
        org.jsoup.nodes.Document.OutputSettings outputSettings63 = new org.jsoup.nodes.Document.OutputSettings();
        boolean boolean64 = outputSettings63.prettyPrint();
        org.jsoup.nodes.Entities.EscapeMode escapeMode65 = outputSettings63.escapeMode();
        org.jsoup.nodes.Document.OutputSettings outputSettings66 = outputSettings62.escapeMode(escapeMode65);
        org.jsoup.nodes.Document.OutputSettings outputSettings67 = outputSettings53.escapeMode(escapeMode65);
        org.jsoup.nodes.Entities.EscapeMode escapeMode68 = outputSettings53.escapeMode();
        boolean boolean69 = textNode46.equals((java.lang.Object) escapeMode68);
        org.jsoup.nodes.Document.OutputSettings outputSettings70 = outputSettings36.escapeMode(escapeMode68);
        org.jsoup.nodes.Document.OutputSettings outputSettings71 = outputSettings70.clone();
        org.jsoup.nodes.Entities.EscapeMode escapeMode72 = outputSettings70.escapeMode();
        boolean boolean73 = textNode15.equals((java.lang.Object) outputSettings70);
        org.junit.Assert.assertNotNull(textNode2);
        org.junit.Assert.assertNotNull(textNode4);
        org.junit.Assert.assertNotNull(textNode6);
        org.junit.Assert.assertNotNull(textNode10);
        org.junit.Assert.assertNotNull(textNode12);
        org.junit.Assert.assertNotNull(node13);
        org.junit.Assert.assertNotNull(textNode15);
        org.junit.Assert.assertNotNull(node16);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertNotNull(outputSettings20);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertTrue("'" + escapeMode23 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode23.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1 + "'", int24 == 1);
        org.junit.Assert.assertNotNull(outputSettings26);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertTrue("'" + escapeMode29 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode29.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertNotNull(outputSettings30);
        org.junit.Assert.assertNotNull(outputSettings31);
        org.junit.Assert.assertTrue("'" + escapeMode32 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode32.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertNotNull(outputSettings33);
        org.junit.Assert.assertNotNull(outputSettings34);
        org.junit.Assert.assertNotNull(outputSettings36);
        org.junit.Assert.assertNotNull(charset37);
        org.junit.Assert.assertNotNull(outputSettings39);
        org.junit.Assert.assertNotNull(textNode42);
        org.junit.Assert.assertEquals("'" + str43 + "' != '" + "" + "'", str43, "");
        org.junit.Assert.assertEquals("'" + str44 + "' != '" + "" + "'", str44, "");
        org.junit.Assert.assertNotNull(textNode46);
        org.junit.Assert.assertNotNull(node47);
        org.junit.Assert.assertNotNull(node49);
        org.junit.Assert.assertNotNull(nodeList50);
        org.junit.Assert.assertEquals("'" + str52 + "' != '" + "" + "'", str52, "");
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + true + "'", boolean54 == true);
        org.junit.Assert.assertNotNull(outputSettings56);
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + true + "'", boolean58 == true);
        org.junit.Assert.assertTrue("'" + escapeMode59 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode59.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertTrue("'" + int60 + "' != '" + 1 + "'", int60 == 1);
        org.junit.Assert.assertNotNull(outputSettings62);
        org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + true + "'", boolean64 == true);
        org.junit.Assert.assertTrue("'" + escapeMode65 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode65.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertNotNull(outputSettings66);
        org.junit.Assert.assertNotNull(outputSettings67);
        org.junit.Assert.assertTrue("'" + escapeMode68 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode68.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertTrue("'" + boolean69 + "' != '" + false + "'", boolean69 == false);
        org.junit.Assert.assertNotNull(outputSettings70);
        org.junit.Assert.assertNotNull(outputSettings71);
        org.junit.Assert.assertTrue("'" + escapeMode72 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode72.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertTrue("'" + boolean73 + "' != '" + false + "'", boolean73 == false);
    }

    @Test
    public void test20742() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20742");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("", "");
        org.jsoup.nodes.TextNode textNode4 = textNode2.text("");
        org.jsoup.nodes.TextNode textNode6 = textNode4.text("#text");
        org.jsoup.nodes.Node node7 = textNode6.nextSibling();
        org.jsoup.nodes.Node node9 = textNode6.removeAttr("#text");
        java.lang.String str10 = textNode6.getWholeText();
        boolean boolean12 = textNode6.hasAttr("");
        java.lang.String str14 = textNode6.absUrl("#text");
        org.jsoup.nodes.TextNode textNode16 = textNode6.text("#");
        int int17 = textNode16.siblingIndex();
        org.junit.Assert.assertNotNull(textNode2);
        org.junit.Assert.assertNotNull(textNode4);
        org.junit.Assert.assertNotNull(textNode6);
        org.junit.Assert.assertNull(node7);
        org.junit.Assert.assertNotNull(node9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "#text" + "'", str10, "#text");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertNotNull(textNode16);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
    }

    @Test
    public void test20743() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20743");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("", "");
        org.jsoup.nodes.TextNode textNode4 = textNode2.text("");
        java.lang.String str5 = textNode2.outerHtml();
        java.lang.String str7 = textNode2.attr("");
        org.jsoup.nodes.Node node9 = textNode2.removeAttr("#text");
        org.jsoup.nodes.Attributes attributes10 = textNode2.attributes();
        java.lang.String str11 = textNode2.toString();
        org.jsoup.nodes.Node node14 = textNode2.attr("hi!", "hi!");
        int int15 = textNode2.siblingIndex();
        java.lang.String str17 = textNode2.attr("h");
        textNode2.setBaseUri("");
        java.lang.Class<?> wildcardClass20 = textNode2.getClass();
        org.junit.Assert.assertNotNull(textNode2);
        org.junit.Assert.assertNotNull(textNode4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNotNull(node9);
        org.junit.Assert.assertNotNull(attributes10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNotNull(node14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test20744() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20744");
        org.jsoup.nodes.Document.OutputSettings outputSettings0 = new org.jsoup.nodes.Document.OutputSettings();
        boolean boolean1 = outputSettings0.prettyPrint();
        org.jsoup.nodes.Entities.EscapeMode escapeMode2 = outputSettings0.escapeMode();
        boolean boolean3 = outputSettings0.forceAllElementAsBlock();
        org.jsoup.nodes.Document.OutputSettings outputSettings4 = new org.jsoup.nodes.Document.OutputSettings();
        boolean boolean5 = outputSettings4.prettyPrint();
        org.jsoup.nodes.Entities.EscapeMode escapeMode6 = outputSettings4.escapeMode();
        org.jsoup.nodes.Document.OutputSettings outputSettings7 = outputSettings0.escapeMode(escapeMode6);
        org.jsoup.nodes.Document.OutputSettings outputSettings9 = outputSettings0.prettyPrint(false);
        org.jsoup.nodes.Document.OutputSettings outputSettings10 = new org.jsoup.nodes.Document.OutputSettings();
        boolean boolean11 = outputSettings10.prettyPrint();
        org.jsoup.nodes.Entities.EscapeMode escapeMode12 = outputSettings10.escapeMode();
        boolean boolean13 = outputSettings10.forceAllElementAsBlock();
        org.jsoup.nodes.Document.OutputSettings outputSettings15 = outputSettings10.forceAllElementAsBlock(true);
        org.jsoup.nodes.Entities.EscapeMode escapeMode16 = outputSettings15.escapeMode();
        org.jsoup.nodes.Document.OutputSettings outputSettings17 = outputSettings15.clone();
        org.jsoup.nodes.Document.OutputSettings outputSettings18 = new org.jsoup.nodes.Document.OutputSettings();
        boolean boolean19 = outputSettings18.prettyPrint();
        org.jsoup.nodes.Document.OutputSettings outputSettings21 = outputSettings18.prettyPrint(true);
        org.jsoup.nodes.Document.OutputSettings outputSettings22 = new org.jsoup.nodes.Document.OutputSettings();
        boolean boolean23 = outputSettings22.prettyPrint();
        org.jsoup.nodes.Entities.EscapeMode escapeMode24 = outputSettings22.escapeMode();
        int int25 = outputSettings22.indentAmount();
        org.jsoup.nodes.Document.OutputSettings outputSettings27 = outputSettings22.prettyPrint(false);
        org.jsoup.nodes.Document.OutputSettings outputSettings28 = new org.jsoup.nodes.Document.OutputSettings();
        boolean boolean29 = outputSettings28.prettyPrint();
        org.jsoup.nodes.Entities.EscapeMode escapeMode30 = outputSettings28.escapeMode();
        org.jsoup.nodes.Document.OutputSettings outputSettings31 = outputSettings27.escapeMode(escapeMode30);
        org.jsoup.nodes.Document.OutputSettings outputSettings32 = outputSettings18.escapeMode(escapeMode30);
        org.jsoup.nodes.Entities.EscapeMode escapeMode33 = outputSettings18.escapeMode();
        org.jsoup.nodes.Document.OutputSettings outputSettings34 = outputSettings18.clone();
        org.jsoup.nodes.Document.OutputSettings outputSettings35 = outputSettings18.clone();
        org.jsoup.nodes.Document.OutputSettings outputSettings37 = outputSettings18.indentAmount((int) (byte) 1);
        java.nio.charset.Charset charset38 = outputSettings37.charset();
        org.jsoup.nodes.Document.OutputSettings outputSettings39 = outputSettings15.charset(charset38);
        boolean boolean40 = outputSettings39.forceAllElementAsBlock();
        org.jsoup.nodes.Document.OutputSettings outputSettings41 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Entities.EscapeMode escapeMode42 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings43 = outputSettings41.escapeMode(escapeMode42);
        org.jsoup.nodes.Document.OutputSettings outputSettings45 = outputSettings41.forceAllElementAsBlock(false);
        org.jsoup.nodes.Document.OutputSettings outputSettings46 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Entities.EscapeMode escapeMode47 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings48 = outputSettings46.escapeMode(escapeMode47);
        int int49 = outputSettings46.indentAmount();
        org.jsoup.nodes.Document.OutputSettings outputSettings50 = new org.jsoup.nodes.Document.OutputSettings();
        boolean boolean51 = outputSettings50.prettyPrint();
        org.jsoup.nodes.Document.OutputSettings outputSettings53 = outputSettings50.prettyPrint(true);
        java.nio.charset.Charset charset54 = outputSettings50.charset();
        org.jsoup.nodes.Document.OutputSettings outputSettings55 = outputSettings46.charset(charset54);
        org.jsoup.nodes.Document.OutputSettings outputSettings56 = outputSettings45.charset(charset54);
        org.jsoup.nodes.Document.OutputSettings outputSettings58 = outputSettings45.prettyPrint(false);
        java.nio.charset.Charset charset59 = outputSettings58.charset();
        java.nio.charset.Charset charset60 = outputSettings58.charset();
        org.jsoup.nodes.Document.OutputSettings outputSettings61 = outputSettings39.charset(charset60);
        org.jsoup.nodes.Document.OutputSettings outputSettings62 = outputSettings0.charset(charset60);
        org.jsoup.nodes.Document.OutputSettings outputSettings64 = outputSettings0.indentAmount((int) (byte) 10);
        org.jsoup.nodes.Document.OutputSettings outputSettings65 = outputSettings0.clone();
        org.jsoup.nodes.Entities.EscapeMode escapeMode66 = outputSettings0.escapeMode();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + escapeMode2 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode2.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + escapeMode6 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode6.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertNotNull(outputSettings7);
        org.junit.Assert.assertNotNull(outputSettings9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + escapeMode12 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode12.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(outputSettings15);
        org.junit.Assert.assertTrue("'" + escapeMode16 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode16.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertNotNull(outputSettings17);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertNotNull(outputSettings21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + escapeMode24 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode24.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 1 + "'", int25 == 1);
        org.junit.Assert.assertNotNull(outputSettings27);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertTrue("'" + escapeMode30 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode30.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertNotNull(outputSettings31);
        org.junit.Assert.assertNotNull(outputSettings32);
        org.junit.Assert.assertTrue("'" + escapeMode33 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode33.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertNotNull(outputSettings34);
        org.junit.Assert.assertNotNull(outputSettings35);
        org.junit.Assert.assertNotNull(outputSettings37);
        org.junit.Assert.assertNotNull(charset38);
        org.junit.Assert.assertNotNull(outputSettings39);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + true + "'", boolean40 == true);
        org.junit.Assert.assertNotNull(outputSettings43);
        org.junit.Assert.assertNotNull(outputSettings45);
        org.junit.Assert.assertNotNull(outputSettings48);
        org.junit.Assert.assertTrue("'" + int49 + "' != '" + 1 + "'", int49 == 1);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + true + "'", boolean51 == true);
        org.junit.Assert.assertNotNull(outputSettings53);
        org.junit.Assert.assertNotNull(charset54);
        org.junit.Assert.assertNotNull(outputSettings55);
        org.junit.Assert.assertNotNull(outputSettings56);
        org.junit.Assert.assertNotNull(outputSettings58);
        org.junit.Assert.assertNotNull(charset59);
        org.junit.Assert.assertNotNull(charset60);
        org.junit.Assert.assertNotNull(outputSettings61);
        org.junit.Assert.assertNotNull(outputSettings62);
        org.junit.Assert.assertNotNull(outputSettings64);
        org.junit.Assert.assertNotNull(outputSettings65);
        org.junit.Assert.assertTrue("'" + escapeMode66 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode66.equals(org.jsoup.nodes.Entities.EscapeMode.base));
    }

    @Test
    public void test20745() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20745");
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
        org.jsoup.nodes.Node node16 = textNode4.attr("#text", "hi!");
        org.jsoup.nodes.TextNode textNode18 = textNode4.text("h");
        textNode18.setBaseUri("hi!");
        java.lang.String str22 = textNode18.attr("");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node24 = textNode18.after("text");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(textNode2);
        org.junit.Assert.assertNotNull(textNode4);
        org.junit.Assert.assertNotNull(textNode6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "#text" + "'", str7, "#text");
        org.junit.Assert.assertNotNull(nodeList8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "#text" + "'", str9, "#text");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "#text" + "'", str10, "#text");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "#text" + "'", str11, "#text");
        org.junit.Assert.assertNull(node12);
        org.junit.Assert.assertNotNull(node13);
        org.junit.Assert.assertNotNull(node16);
        org.junit.Assert.assertNotNull(textNode18);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
    }

    @Test
    public void test20746() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20746");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("", "");
        java.lang.String str3 = textNode2.nodeName();
        org.jsoup.nodes.Node node4 = textNode2.nextSibling();
        org.jsoup.nodes.TextNode textNode6 = textNode2.text("hi!");
        boolean boolean8 = textNode2.hasAttr("#text");
        java.lang.String str10 = textNode2.attr("#text");
        java.util.List<org.jsoup.nodes.Node> nodeList11 = textNode2.siblingNodes();
        java.lang.String str12 = textNode2.toString();
        org.junit.Assert.assertNotNull(textNode2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "#text" + "'", str3, "#text");
        org.junit.Assert.assertNull(node4);
        org.junit.Assert.assertNotNull(textNode6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNotNull(nodeList11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
    }

    @Test
    public void test20747() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20747");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("", "");
        java.lang.String str3 = textNode2.toString();
        int int4 = textNode2.siblingIndex();
        java.lang.String str5 = textNode2.nodeName();
        java.lang.String str6 = textNode2.text();
        org.jsoup.nodes.Node node7 = textNode2.previousSibling();
        org.jsoup.nodes.Node node10 = textNode2.attr("hi!", "hi!");
        org.jsoup.nodes.Attributes attributes11 = textNode2.attributes();
        org.jsoup.nodes.Node node14 = textNode2.attr("h", "i!");
        org.junit.Assert.assertNotNull(textNode2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "#text" + "'", str5, "#text");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNull(node7);
        org.junit.Assert.assertNotNull(node10);
        org.junit.Assert.assertNotNull(attributes11);
        org.junit.Assert.assertNotNull(node14);
    }

    @Test
    public void test20748() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20748");
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
        org.jsoup.nodes.Node node16 = textNode15.previousSibling();
        java.lang.String str17 = textNode15.toString();
        boolean boolean19 = textNode15.hasAttr("text");
        org.jsoup.nodes.Document document20 = textNode15.ownerDocument();
        org.jsoup.nodes.Node node21 = textNode15.clone();
        org.jsoup.nodes.Node node22 = node21.parent();
        org.junit.Assert.assertNotNull(textNode2);
        org.junit.Assert.assertNotNull(textNode4);
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertNull(node6);
        org.junit.Assert.assertNotNull(attributes7);
        org.junit.Assert.assertNotNull(node8);
        org.junit.Assert.assertNull(node9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(node13);
        org.junit.Assert.assertNotNull(textNode15);
        org.junit.Assert.assertNull(node16);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "i!" + "'", str17, "i!");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertNull(document20);
        org.junit.Assert.assertNotNull(node21);
        org.junit.Assert.assertNull(node22);
    }

    @Test
    public void test20749() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20749");
        org.jsoup.nodes.Document.OutputSettings outputSettings0 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Entities.EscapeMode escapeMode1 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings2 = outputSettings0.escapeMode(escapeMode1);
        org.jsoup.nodes.Document.OutputSettings outputSettings4 = outputSettings0.forceAllElementAsBlock(false);
        org.jsoup.nodes.Document.OutputSettings outputSettings5 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Entities.EscapeMode escapeMode6 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings7 = outputSettings5.escapeMode(escapeMode6);
        int int8 = outputSettings5.indentAmount();
        org.jsoup.nodes.Document.OutputSettings outputSettings9 = new org.jsoup.nodes.Document.OutputSettings();
        boolean boolean10 = outputSettings9.prettyPrint();
        org.jsoup.nodes.Document.OutputSettings outputSettings12 = outputSettings9.prettyPrint(true);
        java.nio.charset.Charset charset13 = outputSettings9.charset();
        org.jsoup.nodes.Document.OutputSettings outputSettings14 = outputSettings5.charset(charset13);
        org.jsoup.nodes.Document.OutputSettings outputSettings15 = outputSettings4.charset(charset13);
        org.jsoup.nodes.Document.OutputSettings outputSettings17 = outputSettings4.prettyPrint(false);
        org.jsoup.nodes.Document.OutputSettings outputSettings19 = outputSettings17.indentAmount(1);
        boolean boolean20 = outputSettings19.prettyPrint();
        org.jsoup.nodes.Document.OutputSettings outputSettings22 = outputSettings19.forceAllElementAsBlock(true);
        java.nio.charset.Charset charset23 = outputSettings19.charset();
        org.junit.Assert.assertNotNull(outputSettings2);
        org.junit.Assert.assertNotNull(outputSettings4);
        org.junit.Assert.assertNotNull(outputSettings7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(outputSettings12);
        org.junit.Assert.assertNotNull(charset13);
        org.junit.Assert.assertNotNull(outputSettings14);
        org.junit.Assert.assertNotNull(outputSettings15);
        org.junit.Assert.assertNotNull(outputSettings17);
        org.junit.Assert.assertNotNull(outputSettings19);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(outputSettings22);
        org.junit.Assert.assertNotNull(charset23);
    }

    @Test
    public void test20750() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20750");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("hi!", "hi!");
        java.lang.String str3 = textNode2.getWholeText();
        org.jsoup.nodes.Attributes attributes4 = textNode2.attributes();
        java.lang.String str5 = textNode2.nodeName();
        textNode2.setBaseUri("i!");
        org.jsoup.nodes.Node node10 = textNode2.attr("h", "hi!");
        org.jsoup.nodes.TextNode textNode13 = org.jsoup.nodes.TextNode.createFromEncoded("", "");
        java.lang.String str14 = textNode13.baseUri();
        boolean boolean16 = textNode13.hasAttr("#text");
        java.lang.String str18 = textNode13.attr("");
        java.lang.String str19 = textNode13.nodeName();
        java.lang.String str20 = textNode13.outerHtml();
        java.lang.String str21 = textNode13.getWholeText();
        org.jsoup.nodes.Node node22 = textNode13.clone();
        java.lang.String str23 = textNode13.baseUri();
        org.jsoup.nodes.TextNode textNode25 = textNode13.text("#text");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node26 = textNode2.after((org.jsoup.nodes.Node) textNode25);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertNotNull(attributes4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "#text" + "'", str5, "#text");
        org.junit.Assert.assertNotNull(node10);
        org.junit.Assert.assertNotNull(textNode13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "#text" + "'", str19, "#text");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertNotNull(node22);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
        org.junit.Assert.assertNotNull(textNode25);
    }

    @Test
    public void test20751() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20751");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("hi!", "i!");
        org.jsoup.nodes.TextNode textNode5 = org.jsoup.nodes.TextNode.createFromEncoded("", "");
        org.jsoup.nodes.TextNode textNode7 = textNode5.text("");
        java.lang.String str8 = textNode5.outerHtml();
        org.jsoup.nodes.Document document9 = textNode5.ownerDocument();
        boolean boolean10 = textNode2.equals((java.lang.Object) textNode5);
        org.jsoup.nodes.Node node12 = textNode5.removeAttr("hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList13 = textNode5.siblingNodes();
        java.lang.String str14 = textNode5.baseUri();
        java.lang.String str15 = textNode5.text();
        java.lang.String str17 = textNode5.absUrl("i!");
        java.lang.String str18 = textNode5.getWholeText();
        org.jsoup.nodes.TextNode textNode21 = org.jsoup.nodes.TextNode.createFromEncoded("", "");
        org.jsoup.nodes.TextNode textNode23 = textNode21.text("");
        java.lang.String str24 = textNode21.outerHtml();
        boolean boolean26 = textNode21.hasAttr("");
        org.jsoup.nodes.Node node29 = textNode21.attr("#text", "#text");
        java.util.List<org.jsoup.nodes.Node> nodeList30 = textNode21.siblingNodes();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node31 = textNode5.after((org.jsoup.nodes.Node) textNode21);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(textNode5);
        org.junit.Assert.assertNotNull(textNode7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNull(document9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(node12);
        org.junit.Assert.assertNotNull(nodeList13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertNotNull(textNode21);
        org.junit.Assert.assertNotNull(textNode23);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "" + "'", str24, "");
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNotNull(node29);
        org.junit.Assert.assertNotNull(nodeList30);
    }

    @Test
    public void test20752() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20752");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("", "hi!");
        java.lang.String str3 = textNode2.baseUri();
        org.jsoup.nodes.Attributes attributes4 = textNode2.attributes();
        org.jsoup.nodes.Document document5 = textNode2.ownerDocument();
        java.lang.String str6 = textNode2.toString();
        textNode2.setBaseUri("hi!");
        java.lang.String str9 = textNode2.text();
        java.util.List<org.jsoup.nodes.Node> nodeList10 = textNode2.siblingNodes();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertNotNull(attributes4);
        org.junit.Assert.assertNull(document5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNotNull(nodeList10);
    }

    @Test
    public void test20753() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20753");
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
        org.jsoup.nodes.Node node19 = textNode2.parent();
        java.lang.String str21 = textNode2.attr("i!");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node24 = textNode2.attr("", "h");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: String must not be empty");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(textNode2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNull(node4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(textNode8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + escapeMode12 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode12.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertNotNull(outputSettings15);
        org.junit.Assert.assertNotNull(charset16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNull(node19);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
    }

    @Test
    public void test20754() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20754");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("i!", "i!");
        java.util.List<org.jsoup.nodes.Node> nodeList3 = textNode2.childNodes();
        org.jsoup.nodes.TextNode textNode5 = textNode2.splitText(0);
        org.jsoup.nodes.TextNode textNode7 = textNode2.text("h");
        java.lang.String str9 = textNode2.attr("#text");
        int int10 = textNode2.siblingIndex();
        org.junit.Assert.assertNotNull(textNode2);
        org.junit.Assert.assertNotNull(nodeList3);
        org.junit.Assert.assertNotNull(textNode5);
        org.junit.Assert.assertNotNull(textNode7);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
    }

    @Test
    public void test20755() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20755");
        org.jsoup.nodes.Document.OutputSettings outputSettings0 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Entities.EscapeMode escapeMode1 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings2 = outputSettings0.escapeMode(escapeMode1);
        boolean boolean3 = outputSettings0.forceAllElementAsBlock();
        org.jsoup.nodes.Document.OutputSettings outputSettings4 = new org.jsoup.nodes.Document.OutputSettings();
        boolean boolean5 = outputSettings4.prettyPrint();
        org.jsoup.nodes.Entities.EscapeMode escapeMode6 = outputSettings4.escapeMode();
        org.jsoup.nodes.Document.OutputSettings outputSettings7 = outputSettings0.escapeMode(escapeMode6);
        boolean boolean8 = outputSettings0.forceAllElementAsBlock();
        org.jsoup.nodes.Document.OutputSettings outputSettings10 = outputSettings0.prettyPrint(false);
        org.jsoup.nodes.Document.OutputSettings outputSettings12 = outputSettings0.indentAmount(97);
        org.jsoup.nodes.Document.OutputSettings outputSettings14 = outputSettings12.forceAllElementAsBlock(false);
        org.jsoup.nodes.Document.OutputSettings outputSettings16 = outputSettings12.prettyPrint(true);
        org.jsoup.nodes.Document.OutputSettings outputSettings18 = outputSettings16.forceAllElementAsBlock(false);
        org.jsoup.nodes.Entities.EscapeMode escapeMode19 = outputSettings16.escapeMode();
        org.junit.Assert.assertNotNull(outputSettings2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + escapeMode6 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode6.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertNotNull(outputSettings7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(outputSettings10);
        org.junit.Assert.assertNotNull(outputSettings12);
        org.junit.Assert.assertNotNull(outputSettings14);
        org.junit.Assert.assertNotNull(outputSettings16);
        org.junit.Assert.assertNotNull(outputSettings18);
        org.junit.Assert.assertTrue("'" + escapeMode19 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode19.equals(org.jsoup.nodes.Entities.EscapeMode.base));
    }

    @Test
    public void test20756() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20756");
        org.jsoup.nodes.Document.OutputSettings outputSettings0 = new org.jsoup.nodes.Document.OutputSettings();
        boolean boolean1 = outputSettings0.prettyPrint();
        org.jsoup.nodes.Document.OutputSettings outputSettings3 = outputSettings0.forceAllElementAsBlock(false);
        org.jsoup.nodes.Document.OutputSettings outputSettings4 = new org.jsoup.nodes.Document.OutputSettings();
        boolean boolean5 = outputSettings4.prettyPrint();
        org.jsoup.nodes.Entities.EscapeMode escapeMode6 = outputSettings4.escapeMode();
        boolean boolean7 = outputSettings4.forceAllElementAsBlock();
        org.jsoup.nodes.Document.OutputSettings outputSettings9 = outputSettings4.forceAllElementAsBlock(true);
        org.jsoup.nodes.Entities.EscapeMode escapeMode10 = outputSettings9.escapeMode();
        org.jsoup.nodes.Document.OutputSettings outputSettings11 = outputSettings0.escapeMode(escapeMode10);
        org.jsoup.nodes.Document.OutputSettings outputSettings12 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Entities.EscapeMode escapeMode13 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings14 = outputSettings12.escapeMode(escapeMode13);
        int int15 = outputSettings12.indentAmount();
        org.jsoup.nodes.Document.OutputSettings outputSettings17 = outputSettings12.forceAllElementAsBlock(false);
        int int18 = outputSettings12.indentAmount();
        org.jsoup.nodes.Entities.EscapeMode escapeMode19 = outputSettings12.escapeMode();
        boolean boolean20 = outputSettings12.forceAllElementAsBlock();
        org.jsoup.nodes.Document.OutputSettings outputSettings22 = outputSettings12.forceAllElementAsBlock(false);
        org.jsoup.nodes.Entities.EscapeMode escapeMode23 = outputSettings12.escapeMode();
        java.nio.charset.Charset charset24 = outputSettings12.charset();
        org.jsoup.nodes.Document.OutputSettings outputSettings25 = outputSettings11.charset(charset24);
        org.jsoup.nodes.Document.OutputSettings outputSettings27 = outputSettings25.forceAllElementAsBlock(false);
        org.jsoup.nodes.Entities.EscapeMode escapeMode28 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings29 = outputSettings25.escapeMode(escapeMode28);
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Document.OutputSettings outputSettings31 = outputSettings25.charset("");
            org.junit.Assert.fail("Expected exception of type java.nio.charset.IllegalCharsetNameException; message: ");
        } catch (java.nio.charset.IllegalCharsetNameException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertNotNull(outputSettings3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + escapeMode6 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode6.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(outputSettings9);
        org.junit.Assert.assertTrue("'" + escapeMode10 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode10.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertNotNull(outputSettings11);
        org.junit.Assert.assertNotNull(outputSettings14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertNotNull(outputSettings17);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertNull(escapeMode19);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(outputSettings22);
        org.junit.Assert.assertNull(escapeMode23);
        org.junit.Assert.assertNotNull(charset24);
        org.junit.Assert.assertNotNull(outputSettings25);
        org.junit.Assert.assertNotNull(outputSettings27);
        org.junit.Assert.assertNotNull(outputSettings29);
    }

    @Test
    public void test20757() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20757");
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
        java.lang.String str19 = textNode15.getWholeText();
        java.lang.String str20 = textNode15.getWholeText();
        java.lang.String str21 = textNode15.getWholeText();
        org.junit.Assert.assertNotNull(textNode2);
        org.junit.Assert.assertNotNull(textNode4);
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertNull(node6);
        org.junit.Assert.assertNotNull(attributes7);
        org.junit.Assert.assertNotNull(node8);
        org.junit.Assert.assertNull(node9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(node13);
        org.junit.Assert.assertNotNull(textNode15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "i!" + "'", str19, "i!");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "i!" + "'", str20, "i!");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "i!" + "'", str21, "i!");
    }

    @Test
    public void test20758() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20758");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("#text", "hi!");
        org.jsoup.nodes.TextNode textNode5 = org.jsoup.nodes.TextNode.createFromEncoded("", "");
        org.jsoup.nodes.TextNode textNode7 = textNode5.text("");
        org.jsoup.nodes.TextNode textNode9 = textNode7.text("#text");
        java.lang.String str10 = textNode7.toString();
        java.util.List<org.jsoup.nodes.Node> nodeList11 = textNode7.siblingNodes();
        java.lang.String str12 = textNode7.nodeName();
        boolean boolean13 = textNode2.equals((java.lang.Object) textNode7);
        org.jsoup.nodes.TextNode textNode15 = textNode7.text("");
        org.jsoup.nodes.TextNode textNode17 = textNode7.text("text");
        java.util.List<org.jsoup.nodes.Node> nodeList18 = textNode17.childNodes();
        java.lang.String str19 = textNode17.baseUri();
        org.junit.Assert.assertNotNull(textNode2);
        org.junit.Assert.assertNotNull(textNode5);
        org.junit.Assert.assertNotNull(textNode7);
        org.junit.Assert.assertNotNull(textNode9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "#text" + "'", str10, "#text");
        org.junit.Assert.assertNotNull(nodeList11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "#text" + "'", str12, "#text");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(textNode15);
        org.junit.Assert.assertNotNull(textNode17);
        org.junit.Assert.assertNotNull(nodeList18);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
    }

    @Test
    public void test20759() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20759");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("", "");
        java.lang.String str3 = textNode2.getWholeText();
        java.lang.String str4 = textNode2.baseUri();
        org.jsoup.nodes.TextNode textNode6 = textNode2.text("hi!");
        org.jsoup.nodes.Node node8 = textNode2.removeAttr("hi!");
        int int9 = textNode2.siblingIndex();
        java.lang.String str10 = textNode2.text();
        java.lang.String str11 = textNode2.outerHtml();
        java.util.List<org.jsoup.nodes.Node> nodeList12 = textNode2.childNodes();
        java.lang.String str14 = textNode2.absUrl("hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList15 = textNode2.siblingNodes();
        boolean boolean17 = textNode2.hasAttr("text");
        org.jsoup.nodes.Node node19 = textNode2.removeAttr("i!");
        java.lang.Class<?> wildcardClass20 = node19.getClass();
        org.junit.Assert.assertNotNull(textNode2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(textNode6);
        org.junit.Assert.assertNotNull(node8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertNotNull(nodeList12);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertNotNull(nodeList15);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertNotNull(node19);
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test20760() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20760");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("", "");
        java.lang.String str3 = textNode2.getWholeText();
        java.lang.String str4 = textNode2.baseUri();
        org.jsoup.nodes.TextNode textNode6 = textNode2.text("hi!");
        org.jsoup.nodes.Node node7 = textNode6.clone();
        org.jsoup.nodes.Node node9 = textNode6.removeAttr("hi!");
        java.lang.String str10 = textNode6.toString();
        java.util.List<org.jsoup.nodes.Node> nodeList11 = textNode6.siblingNodes();
        java.lang.String str13 = textNode6.attr("hi!");
        org.jsoup.nodes.Node node14 = textNode6.nextSibling();
        int int15 = textNode6.siblingIndex();
        int int16 = textNode6.siblingIndex();
        org.jsoup.nodes.Attributes attributes17 = textNode6.attributes();
        org.jsoup.nodes.Document document18 = textNode6.ownerDocument();
        org.junit.Assert.assertNotNull(textNode2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(textNode6);
        org.junit.Assert.assertNotNull(node7);
        org.junit.Assert.assertNotNull(node9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertNotNull(nodeList11);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNull(node14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertNotNull(attributes17);
        org.junit.Assert.assertNull(document18);
    }

    @Test
    public void test20761() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20761");
        org.jsoup.nodes.Document.OutputSettings outputSettings0 = new org.jsoup.nodes.Document.OutputSettings();
        boolean boolean1 = outputSettings0.prettyPrint();
        org.jsoup.nodes.Document.OutputSettings outputSettings3 = outputSettings0.prettyPrint(true);
        java.nio.charset.Charset charset4 = outputSettings0.charset();
        org.jsoup.nodes.Document.OutputSettings outputSettings5 = new org.jsoup.nodes.Document.OutputSettings();
        boolean boolean6 = outputSettings5.prettyPrint();
        org.jsoup.nodes.Document.OutputSettings outputSettings8 = outputSettings5.prettyPrint(true);
        org.jsoup.nodes.Document.OutputSettings outputSettings9 = new org.jsoup.nodes.Document.OutputSettings();
        boolean boolean10 = outputSettings9.prettyPrint();
        org.jsoup.nodes.Entities.EscapeMode escapeMode11 = outputSettings9.escapeMode();
        int int12 = outputSettings9.indentAmount();
        org.jsoup.nodes.Document.OutputSettings outputSettings14 = outputSettings9.prettyPrint(false);
        org.jsoup.nodes.Document.OutputSettings outputSettings15 = new org.jsoup.nodes.Document.OutputSettings();
        boolean boolean16 = outputSettings15.prettyPrint();
        org.jsoup.nodes.Entities.EscapeMode escapeMode17 = outputSettings15.escapeMode();
        org.jsoup.nodes.Document.OutputSettings outputSettings18 = outputSettings14.escapeMode(escapeMode17);
        org.jsoup.nodes.Document.OutputSettings outputSettings19 = outputSettings5.escapeMode(escapeMode17);
        org.jsoup.nodes.Entities.EscapeMode escapeMode20 = outputSettings5.escapeMode();
        org.jsoup.nodes.Document.OutputSettings outputSettings21 = outputSettings5.clone();
        org.jsoup.nodes.Document.OutputSettings outputSettings22 = outputSettings5.clone();
        org.jsoup.nodes.Document.OutputSettings outputSettings24 = outputSettings5.indentAmount((int) (byte) 1);
        java.nio.charset.Charset charset25 = outputSettings24.charset();
        org.jsoup.nodes.Entities.EscapeMode escapeMode26 = outputSettings24.escapeMode();
        org.jsoup.nodes.Document.OutputSettings outputSettings27 = outputSettings0.escapeMode(escapeMode26);
        org.jsoup.nodes.Document.OutputSettings outputSettings29 = outputSettings0.prettyPrint(true);
        boolean boolean30 = outputSettings0.prettyPrint();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Document.OutputSettings outputSettings32 = outputSettings0.charset("i!");
            org.junit.Assert.fail("Expected exception of type java.nio.charset.IllegalCharsetNameException; message: i!");
        } catch (java.nio.charset.IllegalCharsetNameException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertNotNull(outputSettings3);
        org.junit.Assert.assertNotNull(charset4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(outputSettings8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + escapeMode11 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode11.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertNotNull(outputSettings14);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + escapeMode17 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode17.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertNotNull(outputSettings18);
        org.junit.Assert.assertNotNull(outputSettings19);
        org.junit.Assert.assertTrue("'" + escapeMode20 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode20.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertNotNull(outputSettings21);
        org.junit.Assert.assertNotNull(outputSettings22);
        org.junit.Assert.assertNotNull(outputSettings24);
        org.junit.Assert.assertNotNull(charset25);
        org.junit.Assert.assertTrue("'" + escapeMode26 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode26.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertNotNull(outputSettings27);
        org.junit.Assert.assertNotNull(outputSettings29);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
    }

    @Test
    public void test20762() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20762");
        org.jsoup.nodes.Document.OutputSettings outputSettings0 = new org.jsoup.nodes.Document.OutputSettings();
        boolean boolean1 = outputSettings0.prettyPrint();
        org.jsoup.nodes.Entities.EscapeMode escapeMode2 = outputSettings0.escapeMode();
        boolean boolean3 = outputSettings0.forceAllElementAsBlock();
        org.jsoup.nodes.Document.OutputSettings outputSettings4 = new org.jsoup.nodes.Document.OutputSettings();
        boolean boolean5 = outputSettings4.prettyPrint();
        org.jsoup.nodes.Entities.EscapeMode escapeMode6 = outputSettings4.escapeMode();
        org.jsoup.nodes.Document.OutputSettings outputSettings7 = outputSettings0.escapeMode(escapeMode6);
        org.jsoup.nodes.Document.OutputSettings outputSettings9 = outputSettings0.prettyPrint(false);
        boolean boolean10 = outputSettings9.forceAllElementAsBlock();
        org.jsoup.nodes.Document.OutputSettings outputSettings12 = outputSettings9.prettyPrint(true);
        org.jsoup.nodes.Document.OutputSettings outputSettings13 = new org.jsoup.nodes.Document.OutputSettings();
        int int14 = outputSettings13.indentAmount();
        int int15 = outputSettings13.indentAmount();
        org.jsoup.nodes.Document.OutputSettings outputSettings17 = outputSettings13.indentAmount((int) (short) 100);
        java.nio.charset.Charset charset18 = outputSettings13.charset();
        org.jsoup.nodes.Document.OutputSettings outputSettings19 = outputSettings9.charset(charset18);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + escapeMode2 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode2.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + escapeMode6 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode6.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertNotNull(outputSettings7);
        org.junit.Assert.assertNotNull(outputSettings9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(outputSettings12);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertNotNull(outputSettings17);
        org.junit.Assert.assertNotNull(charset18);
        org.junit.Assert.assertNotNull(outputSettings19);
    }

    @Test
    public void test20763() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20763");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("", "");
        java.lang.String str3 = textNode2.getWholeText();
        java.lang.String str4 = textNode2.baseUri();
        org.jsoup.nodes.TextNode textNode6 = textNode2.text("hi!");
        org.jsoup.nodes.Attributes attributes7 = textNode2.attributes();
        java.lang.String str8 = textNode2.nodeName();
        org.jsoup.nodes.Node node9 = textNode2.clone();
        org.jsoup.nodes.Node node11 = textNode2.removeAttr("i!");
        org.jsoup.nodes.TextNode textNode14 = org.jsoup.nodes.TextNode.createFromEncoded("", "");
        java.lang.String str15 = textNode14.nodeName();
        java.util.List<org.jsoup.nodes.Node> nodeList16 = textNode14.childNodes();
        org.jsoup.nodes.Node node17 = textNode14.previousSibling();
        java.lang.String str18 = textNode14.text();
        boolean boolean19 = node11.equals((java.lang.Object) textNode14);
        org.jsoup.nodes.Node node20 = node11.previousSibling();
        org.jsoup.nodes.Node node21 = node11.previousSibling();
        org.junit.Assert.assertNotNull(textNode2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(textNode6);
        org.junit.Assert.assertNotNull(attributes7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "#text" + "'", str8, "#text");
        org.junit.Assert.assertNotNull(node9);
        org.junit.Assert.assertNotNull(node11);
        org.junit.Assert.assertNotNull(textNode14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "#text" + "'", str15, "#text");
        org.junit.Assert.assertNotNull(nodeList16);
        org.junit.Assert.assertNull(node17);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNull(node20);
        org.junit.Assert.assertNull(node21);
    }

    @Test
    public void test20764() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20764");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("", "");
        org.jsoup.nodes.TextNode textNode4 = textNode2.text("");
        java.lang.String str6 = textNode4.attr("#text");
        org.jsoup.nodes.Node node7 = textNode4.clone();
        org.jsoup.nodes.Document document8 = textNode4.ownerDocument();
        java.util.List<org.jsoup.nodes.Node> nodeList9 = textNode4.childNodes();
        java.lang.String str10 = textNode4.toString();
        org.jsoup.nodes.Node node13 = textNode4.attr("hi!", "#");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node15 = node13.before("h");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(textNode2);
        org.junit.Assert.assertNotNull(textNode4);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(node7);
        org.junit.Assert.assertNull(document8);
        org.junit.Assert.assertNotNull(nodeList9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNotNull(node13);
    }

    @Test
    public void test20765() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20765");
        org.jsoup.nodes.Document.OutputSettings outputSettings0 = new org.jsoup.nodes.Document.OutputSettings();
        int int1 = outputSettings0.indentAmount();
        org.jsoup.nodes.Document.OutputSettings outputSettings3 = outputSettings0.forceAllElementAsBlock(true);
        org.jsoup.nodes.Document.OutputSettings outputSettings4 = outputSettings3.clone();
        org.jsoup.nodes.Entities.EscapeMode escapeMode5 = outputSettings3.escapeMode();
        org.jsoup.nodes.Document.OutputSettings outputSettings7 = outputSettings3.forceAllElementAsBlock(true);
        org.jsoup.nodes.Document.OutputSettings outputSettings8 = outputSettings7.clone();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Document.OutputSettings outputSettings10 = outputSettings8.charset("i!");
            org.junit.Assert.fail("Expected exception of type java.nio.charset.IllegalCharsetNameException; message: i!");
        } catch (java.nio.charset.IllegalCharsetNameException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1 + "'", int1 == 1);
        org.junit.Assert.assertNotNull(outputSettings3);
        org.junit.Assert.assertNotNull(outputSettings4);
        org.junit.Assert.assertTrue("'" + escapeMode5 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode5.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertNotNull(outputSettings7);
        org.junit.Assert.assertNotNull(outputSettings8);
    }

    @Test
    public void test20766() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20766");
        org.jsoup.nodes.Document.OutputSettings outputSettings0 = new org.jsoup.nodes.Document.OutputSettings();
        boolean boolean1 = outputSettings0.prettyPrint();
        org.jsoup.nodes.Document.OutputSettings outputSettings3 = outputSettings0.prettyPrint(true);
        org.jsoup.nodes.Document.OutputSettings outputSettings4 = new org.jsoup.nodes.Document.OutputSettings();
        boolean boolean5 = outputSettings4.prettyPrint();
        org.jsoup.nodes.Entities.EscapeMode escapeMode6 = outputSettings4.escapeMode();
        int int7 = outputSettings4.indentAmount();
        org.jsoup.nodes.Document.OutputSettings outputSettings9 = outputSettings4.prettyPrint(false);
        org.jsoup.nodes.Document.OutputSettings outputSettings10 = new org.jsoup.nodes.Document.OutputSettings();
        boolean boolean11 = outputSettings10.prettyPrint();
        org.jsoup.nodes.Entities.EscapeMode escapeMode12 = outputSettings10.escapeMode();
        org.jsoup.nodes.Document.OutputSettings outputSettings13 = outputSettings9.escapeMode(escapeMode12);
        org.jsoup.nodes.Document.OutputSettings outputSettings14 = outputSettings0.escapeMode(escapeMode12);
        org.jsoup.nodes.Entities.EscapeMode escapeMode15 = outputSettings0.escapeMode();
        org.jsoup.nodes.Document.OutputSettings outputSettings16 = outputSettings0.clone();
        org.jsoup.nodes.Document.OutputSettings outputSettings17 = outputSettings0.clone();
        org.jsoup.nodes.Document.OutputSettings outputSettings19 = outputSettings0.indentAmount((int) (byte) 1);
        org.jsoup.nodes.Document.OutputSettings outputSettings21 = outputSettings19.forceAllElementAsBlock(true);
        org.jsoup.nodes.Document.OutputSettings outputSettings23 = outputSettings19.indentAmount((int) (short) 0);
        org.jsoup.nodes.Document.OutputSettings outputSettings25 = outputSettings23.forceAllElementAsBlock(true);
        org.jsoup.nodes.Document.OutputSettings outputSettings26 = new org.jsoup.nodes.Document.OutputSettings();
        boolean boolean27 = outputSettings26.prettyPrint();
        org.jsoup.nodes.Document.OutputSettings outputSettings29 = outputSettings26.prettyPrint(true);
        java.nio.charset.Charset charset30 = outputSettings26.charset();
        org.jsoup.nodes.Document.OutputSettings outputSettings32 = outputSettings26.forceAllElementAsBlock(false);
        org.jsoup.nodes.Document.OutputSettings outputSettings34 = outputSettings32.indentAmount((int) ' ');
        org.jsoup.nodes.Document.OutputSettings outputSettings36 = outputSettings34.prettyPrint(false);
        org.jsoup.nodes.Document.OutputSettings outputSettings38 = outputSettings34.prettyPrint(true);
        org.jsoup.nodes.Entities.EscapeMode escapeMode39 = outputSettings38.escapeMode();
        org.jsoup.nodes.Entities.EscapeMode escapeMode40 = outputSettings38.escapeMode();
        org.jsoup.nodes.Document.OutputSettings outputSettings41 = outputSettings25.escapeMode(escapeMode40);
        org.jsoup.nodes.Document.OutputSettings outputSettings43 = outputSettings25.prettyPrint(false);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertNotNull(outputSettings3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + escapeMode6 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode6.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertNotNull(outputSettings9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + escapeMode12 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode12.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertNotNull(outputSettings13);
        org.junit.Assert.assertNotNull(outputSettings14);
        org.junit.Assert.assertTrue("'" + escapeMode15 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode15.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertNotNull(outputSettings16);
        org.junit.Assert.assertNotNull(outputSettings17);
        org.junit.Assert.assertNotNull(outputSettings19);
        org.junit.Assert.assertNotNull(outputSettings21);
        org.junit.Assert.assertNotNull(outputSettings23);
        org.junit.Assert.assertNotNull(outputSettings25);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertNotNull(outputSettings29);
        org.junit.Assert.assertNotNull(charset30);
        org.junit.Assert.assertNotNull(outputSettings32);
        org.junit.Assert.assertNotNull(outputSettings34);
        org.junit.Assert.assertNotNull(outputSettings36);
        org.junit.Assert.assertNotNull(outputSettings38);
        org.junit.Assert.assertTrue("'" + escapeMode39 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode39.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertTrue("'" + escapeMode40 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode40.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertNotNull(outputSettings41);
        org.junit.Assert.assertNotNull(outputSettings43);
    }

    @Test
    public void test20767() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20767");
        org.jsoup.nodes.Document.OutputSettings outputSettings0 = new org.jsoup.nodes.Document.OutputSettings();
        int int1 = outputSettings0.indentAmount();
        org.jsoup.nodes.Document.OutputSettings outputSettings3 = outputSettings0.forceAllElementAsBlock(true);
        org.jsoup.nodes.Document.OutputSettings outputSettings5 = outputSettings0.prettyPrint(true);
        java.nio.charset.Charset charset6 = outputSettings0.charset();
        org.jsoup.nodes.Document.OutputSettings outputSettings8 = outputSettings0.prettyPrint(false);
        org.jsoup.nodes.Document.OutputSettings outputSettings10 = outputSettings8.forceAllElementAsBlock(false);
        org.jsoup.nodes.Document.OutputSettings outputSettings11 = outputSettings8.clone();
        org.jsoup.nodes.Document.OutputSettings outputSettings12 = outputSettings8.clone();
        int int13 = outputSettings12.indentAmount();
        org.jsoup.nodes.Document.OutputSettings outputSettings15 = outputSettings12.forceAllElementAsBlock(true);
        org.jsoup.nodes.Document.OutputSettings outputSettings16 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Entities.EscapeMode escapeMode17 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings18 = outputSettings16.escapeMode(escapeMode17);
        org.jsoup.nodes.Document.OutputSettings outputSettings20 = outputSettings16.forceAllElementAsBlock(false);
        boolean boolean21 = outputSettings20.forceAllElementAsBlock();
        org.jsoup.nodes.Entities.EscapeMode escapeMode22 = outputSettings20.escapeMode();
        org.jsoup.nodes.Document.OutputSettings outputSettings24 = outputSettings20.indentAmount((int) (short) 10);
        org.jsoup.nodes.Document.OutputSettings outputSettings25 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Entities.EscapeMode escapeMode26 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings27 = outputSettings25.escapeMode(escapeMode26);
        org.jsoup.nodes.Document.OutputSettings outputSettings29 = outputSettings27.prettyPrint(false);
        org.jsoup.nodes.Document.OutputSettings outputSettings31 = outputSettings27.indentAmount((int) ' ');
        org.jsoup.nodes.Document.OutputSettings outputSettings32 = new org.jsoup.nodes.Document.OutputSettings();
        boolean boolean33 = outputSettings32.prettyPrint();
        org.jsoup.nodes.Entities.EscapeMode escapeMode34 = outputSettings32.escapeMode();
        boolean boolean35 = outputSettings32.forceAllElementAsBlock();
        org.jsoup.nodes.Document.OutputSettings outputSettings36 = new org.jsoup.nodes.Document.OutputSettings();
        boolean boolean37 = outputSettings36.prettyPrint();
        org.jsoup.nodes.Entities.EscapeMode escapeMode38 = outputSettings36.escapeMode();
        org.jsoup.nodes.Document.OutputSettings outputSettings39 = outputSettings32.escapeMode(escapeMode38);
        org.jsoup.nodes.Document.OutputSettings outputSettings40 = outputSettings27.escapeMode(escapeMode38);
        org.jsoup.nodes.Document.OutputSettings outputSettings41 = outputSettings24.escapeMode(escapeMode38);
        org.jsoup.nodes.Document.OutputSettings outputSettings43 = outputSettings24.forceAllElementAsBlock(false);
        int int44 = outputSettings43.indentAmount();
        org.jsoup.nodes.Entities.EscapeMode escapeMode45 = outputSettings43.escapeMode();
        org.jsoup.nodes.Document.OutputSettings outputSettings46 = outputSettings12.escapeMode(escapeMode45);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1 + "'", int1 == 1);
        org.junit.Assert.assertNotNull(outputSettings3);
        org.junit.Assert.assertNotNull(outputSettings5);
        org.junit.Assert.assertNotNull(charset6);
        org.junit.Assert.assertNotNull(outputSettings8);
        org.junit.Assert.assertNotNull(outputSettings10);
        org.junit.Assert.assertNotNull(outputSettings11);
        org.junit.Assert.assertNotNull(outputSettings12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertNotNull(outputSettings15);
        org.junit.Assert.assertNotNull(outputSettings18);
        org.junit.Assert.assertNotNull(outputSettings20);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNull(escapeMode22);
        org.junit.Assert.assertNotNull(outputSettings24);
        org.junit.Assert.assertNotNull(outputSettings27);
        org.junit.Assert.assertNotNull(outputSettings29);
        org.junit.Assert.assertNotNull(outputSettings31);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + true + "'", boolean33 == true);
        org.junit.Assert.assertTrue("'" + escapeMode34 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode34.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + true + "'", boolean37 == true);
        org.junit.Assert.assertTrue("'" + escapeMode38 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode38.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertNotNull(outputSettings39);
        org.junit.Assert.assertNotNull(outputSettings40);
        org.junit.Assert.assertNotNull(outputSettings41);
        org.junit.Assert.assertNotNull(outputSettings43);
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + 10 + "'", int44 == 10);
        org.junit.Assert.assertTrue("'" + escapeMode45 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode45.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertNotNull(outputSettings46);
    }

    @Test
    public void test20768() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20768");
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
        boolean boolean34 = outputSettings28.prettyPrint();
        org.junit.Assert.assertNotNull(textNode2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(nodeList7);
        org.junit.Assert.assertNotNull(textNode9);
        org.junit.Assert.assertNotNull(textNode11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNotNull(outputSettings15);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + escapeMode18 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode18.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 1 + "'", int19 == 1);
        org.junit.Assert.assertNotNull(outputSettings21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + escapeMode24 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode24.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertNotNull(outputSettings25);
        org.junit.Assert.assertNotNull(outputSettings26);
        org.junit.Assert.assertTrue("'" + escapeMode27 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode27.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertNotNull(outputSettings28);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertNotNull(outputSettings31);
        org.junit.Assert.assertNotNull(charset32);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + true + "'", boolean34 == true);
    }

    @Test
    public void test20769() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20769");
        org.jsoup.nodes.Document.OutputSettings outputSettings0 = new org.jsoup.nodes.Document.OutputSettings();
        boolean boolean1 = outputSettings0.prettyPrint();
        org.jsoup.nodes.Entities.EscapeMode escapeMode2 = outputSettings0.escapeMode();
        int int3 = outputSettings0.indentAmount();
        org.jsoup.nodes.Document.OutputSettings outputSettings5 = outputSettings0.indentAmount(0);
        boolean boolean6 = outputSettings5.prettyPrint();
        boolean boolean7 = outputSettings5.forceAllElementAsBlock();
        org.jsoup.nodes.Document.OutputSettings outputSettings8 = outputSettings5.clone();
        boolean boolean9 = outputSettings8.forceAllElementAsBlock();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + escapeMode2 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode2.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertNotNull(outputSettings5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(outputSettings8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test20770() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20770");
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
        java.util.List<org.jsoup.nodes.Node> nodeList19 = textNode6.siblingNodes();
        org.jsoup.nodes.Node node20 = textNode6.parent();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.TextNode textNode22 = textNode6.splitText((int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Split offset must be not be negative");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(textNode2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(textNode6);
        org.junit.Assert.assertNotNull(node7);
        org.junit.Assert.assertNotNull(node9);
        org.junit.Assert.assertNotNull(nodeList10);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertNotNull(nodeList13);
        org.junit.Assert.assertNotNull(textNode15);
        org.junit.Assert.assertNull(node16);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertNotNull(nodeList19);
        org.junit.Assert.assertNull(node20);
    }

    @Test
    public void test20771() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20771");
        org.jsoup.nodes.Document.OutputSettings outputSettings0 = new org.jsoup.nodes.Document.OutputSettings();
        boolean boolean1 = outputSettings0.prettyPrint();
        org.jsoup.nodes.Entities.EscapeMode escapeMode2 = outputSettings0.escapeMode();
        boolean boolean3 = outputSettings0.forceAllElementAsBlock();
        org.jsoup.nodes.Document.OutputSettings outputSettings4 = new org.jsoup.nodes.Document.OutputSettings();
        boolean boolean5 = outputSettings4.prettyPrint();
        org.jsoup.nodes.Entities.EscapeMode escapeMode6 = outputSettings4.escapeMode();
        org.jsoup.nodes.Document.OutputSettings outputSettings7 = outputSettings0.escapeMode(escapeMode6);
        org.jsoup.nodes.Document.OutputSettings outputSettings9 = outputSettings0.prettyPrint(false);
        boolean boolean10 = outputSettings9.forceAllElementAsBlock();
        org.jsoup.nodes.Document.OutputSettings outputSettings12 = outputSettings9.prettyPrint(true);
        org.jsoup.nodes.Document.OutputSettings outputSettings14 = outputSettings9.prettyPrint(true);
        org.jsoup.nodes.Document.OutputSettings outputSettings15 = outputSettings9.clone();
        org.jsoup.nodes.Document.OutputSettings outputSettings17 = outputSettings15.forceAllElementAsBlock(true);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + escapeMode2 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode2.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + escapeMode6 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode6.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertNotNull(outputSettings7);
        org.junit.Assert.assertNotNull(outputSettings9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(outputSettings12);
        org.junit.Assert.assertNotNull(outputSettings14);
        org.junit.Assert.assertNotNull(outputSettings15);
        org.junit.Assert.assertNotNull(outputSettings17);
    }

    @Test
    public void test20772() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20772");
        org.jsoup.nodes.Document.OutputSettings outputSettings0 = new org.jsoup.nodes.Document.OutputSettings();
        boolean boolean1 = outputSettings0.prettyPrint();
        org.jsoup.nodes.Document.OutputSettings outputSettings3 = outputSettings0.prettyPrint(true);
        java.nio.charset.Charset charset4 = outputSettings0.charset();
        org.jsoup.nodes.Document.OutputSettings outputSettings6 = outputSettings0.forceAllElementAsBlock(false);
        org.jsoup.nodes.Document.OutputSettings outputSettings7 = new org.jsoup.nodes.Document.OutputSettings();
        int int8 = outputSettings7.indentAmount();
        org.jsoup.nodes.Document.OutputSettings outputSettings10 = outputSettings7.forceAllElementAsBlock(true);
        java.nio.charset.Charset charset11 = outputSettings7.charset();
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
        org.jsoup.nodes.Document.OutputSettings outputSettings27 = outputSettings7.escapeMode(escapeMode24);
        org.jsoup.nodes.Document.OutputSettings outputSettings28 = outputSettings6.escapeMode(escapeMode24);
        org.jsoup.nodes.Document.OutputSettings outputSettings29 = outputSettings6.clone();
        boolean boolean30 = outputSettings29.forceAllElementAsBlock();
        org.jsoup.nodes.Document.OutputSettings outputSettings32 = outputSettings29.indentAmount((int) (byte) 100);
        java.nio.charset.Charset charset33 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Document.OutputSettings outputSettings34 = outputSettings32.charset(charset33);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertNotNull(outputSettings3);
        org.junit.Assert.assertNotNull(charset4);
        org.junit.Assert.assertNotNull(outputSettings6);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertNotNull(outputSettings10);
        org.junit.Assert.assertNotNull(charset11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNotNull(outputSettings15);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + escapeMode18 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode18.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 1 + "'", int19 == 1);
        org.junit.Assert.assertNotNull(outputSettings21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + escapeMode24 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode24.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertNotNull(outputSettings25);
        org.junit.Assert.assertNotNull(outputSettings26);
        org.junit.Assert.assertNotNull(outputSettings27);
        org.junit.Assert.assertNotNull(outputSettings28);
        org.junit.Assert.assertNotNull(outputSettings29);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertNotNull(outputSettings32);
    }

    @Test
    public void test20773() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20773");
        org.jsoup.nodes.Document.OutputSettings outputSettings0 = new org.jsoup.nodes.Document.OutputSettings();
        boolean boolean1 = outputSettings0.prettyPrint();
        org.jsoup.nodes.Document.OutputSettings outputSettings3 = outputSettings0.prettyPrint(true);
        java.nio.charset.Charset charset4 = outputSettings0.charset();
        org.jsoup.nodes.Document.OutputSettings outputSettings6 = outputSettings0.forceAllElementAsBlock(false);
        org.jsoup.nodes.Document.OutputSettings outputSettings8 = outputSettings6.indentAmount((int) ' ');
        org.jsoup.nodes.Document.OutputSettings outputSettings10 = outputSettings8.prettyPrint(false);
        org.jsoup.nodes.Document.OutputSettings outputSettings11 = new org.jsoup.nodes.Document.OutputSettings();
        boolean boolean12 = outputSettings11.prettyPrint();
        org.jsoup.nodes.Entities.EscapeMode escapeMode13 = outputSettings11.escapeMode();
        boolean boolean14 = outputSettings11.forceAllElementAsBlock();
        org.jsoup.nodes.Document.OutputSettings outputSettings15 = new org.jsoup.nodes.Document.OutputSettings();
        boolean boolean16 = outputSettings15.prettyPrint();
        org.jsoup.nodes.Entities.EscapeMode escapeMode17 = outputSettings15.escapeMode();
        org.jsoup.nodes.Document.OutputSettings outputSettings18 = outputSettings11.escapeMode(escapeMode17);
        org.jsoup.nodes.Document.OutputSettings outputSettings19 = outputSettings8.escapeMode(escapeMode17);
        org.jsoup.nodes.Entities.EscapeMode escapeMode20 = outputSettings19.escapeMode();
        org.jsoup.nodes.Document.OutputSettings outputSettings22 = outputSettings19.indentAmount((int) (short) 1);
        org.jsoup.nodes.Document.OutputSettings outputSettings24 = outputSettings22.indentAmount(0);
        org.jsoup.nodes.Document.OutputSettings outputSettings25 = new org.jsoup.nodes.Document.OutputSettings();
        int int26 = outputSettings25.indentAmount();
        org.jsoup.nodes.Document.OutputSettings outputSettings28 = outputSettings25.forceAllElementAsBlock(true);
        org.jsoup.nodes.Document.OutputSettings outputSettings30 = outputSettings25.prettyPrint(true);
        java.nio.charset.Charset charset31 = outputSettings25.charset();
        org.jsoup.nodes.Document.OutputSettings outputSettings33 = outputSettings25.prettyPrint(false);
        org.jsoup.nodes.Document.OutputSettings outputSettings34 = new org.jsoup.nodes.Document.OutputSettings();
        boolean boolean35 = outputSettings34.prettyPrint();
        org.jsoup.nodes.Document.OutputSettings outputSettings37 = outputSettings34.prettyPrint(true);
        org.jsoup.nodes.Document.OutputSettings outputSettings39 = outputSettings37.indentAmount((int) ' ');
        boolean boolean40 = outputSettings39.prettyPrint();
        org.jsoup.nodes.Document.OutputSettings outputSettings41 = outputSettings39.clone();
        java.nio.charset.Charset charset42 = outputSettings39.charset();
        org.jsoup.nodes.Document.OutputSettings outputSettings43 = outputSettings33.charset(charset42);
        boolean boolean44 = outputSettings33.prettyPrint();
        boolean boolean45 = outputSettings33.prettyPrint();
        org.jsoup.nodes.Document.OutputSettings outputSettings47 = outputSettings33.indentAmount((int) '#');
        org.jsoup.nodes.Document.OutputSettings outputSettings48 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Entities.EscapeMode escapeMode49 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings50 = outputSettings48.escapeMode(escapeMode49);
        java.nio.charset.Charset charset51 = outputSettings48.charset();
        java.nio.charset.Charset charset52 = outputSettings48.charset();
        org.jsoup.nodes.Document.OutputSettings outputSettings53 = outputSettings47.charset(charset52);
        org.jsoup.nodes.Document.OutputSettings outputSettings54 = outputSettings22.charset(charset52);
        org.jsoup.nodes.Document.OutputSettings outputSettings56 = outputSettings22.indentAmount(32);
        org.jsoup.nodes.Document.OutputSettings outputSettings58 = outputSettings22.prettyPrint(false);
        org.jsoup.nodes.Document.OutputSettings outputSettings59 = outputSettings58.clone();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertNotNull(outputSettings3);
        org.junit.Assert.assertNotNull(charset4);
        org.junit.Assert.assertNotNull(outputSettings6);
        org.junit.Assert.assertNotNull(outputSettings8);
        org.junit.Assert.assertNotNull(outputSettings10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + escapeMode13 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode13.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + escapeMode17 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode17.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertNotNull(outputSettings18);
        org.junit.Assert.assertNotNull(outputSettings19);
        org.junit.Assert.assertTrue("'" + escapeMode20 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode20.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertNotNull(outputSettings22);
        org.junit.Assert.assertNotNull(outputSettings24);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 1 + "'", int26 == 1);
        org.junit.Assert.assertNotNull(outputSettings28);
        org.junit.Assert.assertNotNull(outputSettings30);
        org.junit.Assert.assertNotNull(charset31);
        org.junit.Assert.assertNotNull(outputSettings33);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + true + "'", boolean35 == true);
        org.junit.Assert.assertNotNull(outputSettings37);
        org.junit.Assert.assertNotNull(outputSettings39);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + true + "'", boolean40 == true);
        org.junit.Assert.assertNotNull(outputSettings41);
        org.junit.Assert.assertNotNull(charset42);
        org.junit.Assert.assertNotNull(outputSettings43);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertNotNull(outputSettings47);
        org.junit.Assert.assertNotNull(outputSettings50);
        org.junit.Assert.assertNotNull(charset51);
        org.junit.Assert.assertNotNull(charset52);
        org.junit.Assert.assertNotNull(outputSettings53);
        org.junit.Assert.assertNotNull(outputSettings54);
        org.junit.Assert.assertNotNull(outputSettings56);
        org.junit.Assert.assertNotNull(outputSettings58);
        org.junit.Assert.assertNotNull(outputSettings59);
    }

    @Test
    public void test20774() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20774");
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
        int int20 = textNode2.siblingIndex();
        org.jsoup.nodes.Attributes attributes21 = textNode2.attributes();
        org.jsoup.nodes.Document document22 = textNode2.ownerDocument();
        java.lang.String str24 = textNode2.absUrl("#text");
        org.junit.Assert.assertNotNull(textNode2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(node6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(textNode13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertNotNull(nodeList16);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertNotNull(attributes21);
        org.junit.Assert.assertNull(document22);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "" + "'", str24, "");
    }

    @Test
    public void test20775() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20775");
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
        int int16 = textNode2.siblingIndex();
        java.lang.String str18 = textNode2.absUrl("hi!");
        org.jsoup.nodes.Document document19 = textNode2.ownerDocument();
        org.jsoup.nodes.Node node20 = textNode2.previousSibling();
        java.lang.String str21 = textNode2.nodeName();
        java.lang.String str22 = textNode2.text();
        org.junit.Assert.assertNotNull(textNode2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(node6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(nodeList11);
        org.junit.Assert.assertNull(node12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertNotNull(nodeList15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertNull(document19);
        org.junit.Assert.assertNull(node20);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "#text" + "'", str21, "#text");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
    }

    @Test
    public void test20776() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20776");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("", "");
        java.lang.String str3 = textNode2.text();
        java.lang.String str4 = textNode2.outerHtml();
        org.jsoup.nodes.TextNode textNode6 = textNode2.text("#text");
        textNode2.setBaseUri("hi!");
        java.lang.String str10 = textNode2.attr("");
        boolean boolean11 = textNode2.isBlank();
        org.jsoup.nodes.Node node13 = textNode2.removeAttr("h");
        org.jsoup.select.NodeVisitor nodeVisitor14 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node15 = textNode2.traverse(nodeVisitor14);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(textNode2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(textNode6);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(node13);
    }

    @Test
    public void test20777() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20777");
        org.jsoup.nodes.Document.OutputSettings outputSettings0 = new org.jsoup.nodes.Document.OutputSettings();
        boolean boolean1 = outputSettings0.prettyPrint();
        org.jsoup.nodes.Entities.EscapeMode escapeMode2 = outputSettings0.escapeMode();
        int int3 = outputSettings0.indentAmount();
        org.jsoup.nodes.Document.OutputSettings outputSettings5 = outputSettings0.prettyPrint(false);
        org.jsoup.nodes.Document.OutputSettings outputSettings6 = new org.jsoup.nodes.Document.OutputSettings();
        boolean boolean7 = outputSettings6.prettyPrint();
        org.jsoup.nodes.Entities.EscapeMode escapeMode8 = outputSettings6.escapeMode();
        org.jsoup.nodes.Document.OutputSettings outputSettings9 = outputSettings5.escapeMode(escapeMode8);
        int int10 = outputSettings9.indentAmount();
        org.jsoup.nodes.Document.OutputSettings outputSettings12 = outputSettings9.forceAllElementAsBlock(false);
        org.jsoup.nodes.Document.OutputSettings outputSettings14 = outputSettings12.prettyPrint(false);
        java.nio.charset.Charset charset15 = outputSettings14.charset();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + escapeMode2 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode2.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertNotNull(outputSettings5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + escapeMode8 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode8.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertNotNull(outputSettings9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertNotNull(outputSettings12);
        org.junit.Assert.assertNotNull(outputSettings14);
        org.junit.Assert.assertNotNull(charset15);
    }

    @Test
    public void test20778() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20778");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("", "");
        boolean boolean3 = textNode2.isBlank();
        org.jsoup.nodes.Node node6 = textNode2.attr("hi!", "hi!");
        org.jsoup.nodes.TextNode textNode8 = textNode2.text("#text");
        org.jsoup.nodes.Node node10 = textNode8.removeAttr("#text");
        java.lang.String str12 = textNode8.absUrl("#text");
        boolean boolean14 = textNode8.hasAttr("#text");
        java.lang.String str15 = textNode8.outerHtml();
        org.jsoup.nodes.Node node17 = textNode8.removeAttr("#text");
        org.jsoup.nodes.Node node18 = node17.clone();
        org.junit.Assert.assertNotNull(textNode2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(node6);
        org.junit.Assert.assertNotNull(textNode8);
        org.junit.Assert.assertNotNull(node10);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "#text" + "'", str15, "#text");
        org.junit.Assert.assertNotNull(node17);
        org.junit.Assert.assertNotNull(node18);
    }

    @Test
    public void test20779() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20779");
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
        textNode23.setBaseUri("#text");
        org.junit.Assert.assertNotNull(textNode2);
        org.junit.Assert.assertNotNull(textNode4);
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNotNull(textNode10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(textNode15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertNotNull(nodeList17);
        org.junit.Assert.assertNotNull(node19);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertNotNull(textNode23);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "" + "'", str24, "");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "i!" + "'", str25, "i!");
    }
}

