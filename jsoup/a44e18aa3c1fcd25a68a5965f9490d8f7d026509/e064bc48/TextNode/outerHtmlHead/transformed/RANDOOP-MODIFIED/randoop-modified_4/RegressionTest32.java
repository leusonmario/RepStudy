import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest32 {

    public static boolean debug = false;

    @Test
    public void test16001() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16001");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("", "hi!");
        java.lang.String str3 = textNode2.text;
        java.lang.String str4 = textNode2.outerHtml();
        java.lang.String str5 = textNode2.getTEXT_KEY();
        java.lang.String str6 = textNode2.nodeName();
        boolean boolean7 = textNode2.isBlank();
        java.lang.String str8 = textNode2.outerHtml();
        java.lang.StringBuilder stringBuilder9 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings11 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Document.OutputSettings outputSettings13 = outputSettings11.indentAmount((int) 'a');
        org.jsoup.nodes.Document.OutputSettings outputSettings14 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Document.OutputSettings outputSettings16 = outputSettings14.indentAmount((int) 'a');
        org.jsoup.nodes.Entities.EscapeMode escapeMode17 = outputSettings16.escapeMode;
        java.nio.charset.Charset charset18 = outputSettings16.charset();
        org.jsoup.nodes.Document.OutputSettings outputSettings19 = outputSettings16.clone();
        outputSettings19.indentAmount = 0;
        org.jsoup.nodes.Document.OutputSettings outputSettings22 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Document.OutputSettings outputSettings24 = outputSettings22.indentAmount((int) 'a');
        org.jsoup.nodes.Entities.EscapeMode escapeMode25 = outputSettings24.escapeMode;
        java.nio.charset.Charset charset26 = outputSettings24.charset();
        org.jsoup.nodes.Entities.EscapeMode escapeMode27 = outputSettings24.escapeMode;
        int int28 = outputSettings24.indentAmount;
        java.nio.charset.CharsetEncoder charsetEncoder29 = outputSettings24.encoder();
        outputSettings19.charsetEncoder = charsetEncoder29;
        outputSettings11.setcharsetEncoder(charsetEncoder29);
        textNode2.outerHtmlTail(stringBuilder9, (int) (short) 100, outputSettings11);
        org.jsoup.nodes.Node node33 = textNode2.clone();
        java.lang.StringBuilder stringBuilder34 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings36 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Document.OutputSettings outputSettings38 = outputSettings36.indentAmount((int) 'a');
        org.jsoup.nodes.Entities.EscapeMode escapeMode39 = outputSettings38.escapeMode;
        java.nio.charset.Charset charset40 = outputSettings38.charset();
        org.jsoup.nodes.Document.OutputSettings outputSettings41 = outputSettings38.clone();
        outputSettings38.forceAllElementAsBlock = true;
        java.nio.charset.CharsetEncoder charsetEncoder44 = outputSettings38.getcharsetEncoder();
        org.jsoup.nodes.Document.OutputSettings outputSettings46 = outputSettings38.prettyPrint(false);
        textNode2.outerHtmlTail(stringBuilder34, (int) (short) 1, outputSettings38);
        org.jsoup.nodes.Document.OutputSettings outputSettings48 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Document.OutputSettings outputSettings50 = outputSettings48.indentAmount((int) 'a');
        org.jsoup.nodes.Entities.EscapeMode escapeMode51 = outputSettings50.escapeMode;
        outputSettings50.setindentAmount((int) '4');
        outputSettings50.setindentAmount((-1));
        boolean boolean56 = outputSettings50.getforceAllElementAsBlock();
        org.jsoup.nodes.Document.OutputSettings outputSettings57 = new org.jsoup.nodes.Document.OutputSettings();
        boolean boolean58 = outputSettings57.prettyPrint;
        org.jsoup.nodes.Document.OutputSettings outputSettings59 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Document.OutputSettings outputSettings61 = outputSettings59.indentAmount((int) 'a');
        org.jsoup.nodes.Entities.EscapeMode escapeMode62 = outputSettings61.escapeMode;
        java.nio.charset.Charset charset63 = outputSettings61.charset();
        org.jsoup.nodes.Document.OutputSettings outputSettings64 = outputSettings57.charset(charset63);
        boolean boolean65 = outputSettings57.getprettyPrint();
        boolean boolean66 = outputSettings57.getprettyPrint();
        org.jsoup.nodes.Document.OutputSettings outputSettings67 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Document.OutputSettings outputSettings69 = outputSettings67.indentAmount((int) 'a');
        org.jsoup.nodes.Entities.EscapeMode escapeMode70 = outputSettings69.escapeMode;
        outputSettings57.setescapeMode(escapeMode70);
        outputSettings50.escapeMode = escapeMode70;
        outputSettings38.setescapeMode(escapeMode70);
        java.nio.charset.CharsetEncoder charsetEncoder74 = outputSettings38.getcharsetEncoder();
        org.jsoup.nodes.Entities.EscapeMode escapeMode75 = outputSettings38.getescapeMode();
        int int76 = outputSettings38.indentAmount;
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "text" + "'", str5, "text");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "#text" + "'", str6, "#text");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNotNull(outputSettings13);
        org.junit.Assert.assertNotNull(outputSettings16);
        org.junit.Assert.assertTrue("'" + escapeMode17 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode17.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertNotNull(charset18);
        org.junit.Assert.assertNotNull(outputSettings19);
        org.junit.Assert.assertNotNull(outputSettings24);
        org.junit.Assert.assertTrue("'" + escapeMode25 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode25.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertNotNull(charset26);
        org.junit.Assert.assertTrue("'" + escapeMode27 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode27.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 97 + "'", int28 == 97);
        org.junit.Assert.assertNotNull(charsetEncoder29);
        org.junit.Assert.assertNotNull(node33);
        org.junit.Assert.assertNotNull(outputSettings38);
        org.junit.Assert.assertTrue("'" + escapeMode39 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode39.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertNotNull(charset40);
        org.junit.Assert.assertNotNull(outputSettings41);
        org.junit.Assert.assertNotNull(charsetEncoder44);
        org.junit.Assert.assertNotNull(outputSettings46);
        org.junit.Assert.assertNotNull(outputSettings50);
        org.junit.Assert.assertTrue("'" + escapeMode51 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode51.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + false + "'", boolean56 == false);
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + true + "'", boolean58 == true);
        org.junit.Assert.assertNotNull(outputSettings61);
        org.junit.Assert.assertTrue("'" + escapeMode62 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode62.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertNotNull(charset63);
        org.junit.Assert.assertNotNull(outputSettings64);
        org.junit.Assert.assertTrue("'" + boolean65 + "' != '" + true + "'", boolean65 == true);
        org.junit.Assert.assertTrue("'" + boolean66 + "' != '" + true + "'", boolean66 == true);
        org.junit.Assert.assertNotNull(outputSettings69);
        org.junit.Assert.assertTrue("'" + escapeMode70 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode70.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertNotNull(charsetEncoder74);
        org.junit.Assert.assertTrue("'" + escapeMode75 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode75.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertTrue("'" + int76 + "' != '" + 97 + "'", int76 == 97);
    }

    @Test
    public void test16002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16002");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("", "hi!");
        java.lang.String str3 = textNode2.text;
        java.lang.String str4 = textNode2.outerHtml();
        java.lang.String str5 = textNode2.getTEXT_KEY();
        java.lang.String str6 = textNode2.text;
        java.lang.Object obj7 = null;
        boolean boolean8 = textNode2.equals(obj7);
        org.jsoup.nodes.TextNode textNode10 = textNode2.text("hi!");
        org.jsoup.nodes.TextNode textNode12 = textNode10.text("#text");
        java.lang.String str13 = textNode10.text;
        java.lang.String str14 = textNode10.toString();
        org.jsoup.nodes.Attributes attributes15 = textNode10.attributes();
        org.jsoup.nodes.TextNode textNode18 = new org.jsoup.nodes.TextNode("", "");
        java.lang.StringBuilder stringBuilder19 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings21 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Document.OutputSettings outputSettings23 = outputSettings21.indentAmount((int) 'a');
        org.jsoup.nodes.Entities.EscapeMode escapeMode24 = outputSettings23.escapeMode;
        java.nio.charset.Charset charset25 = outputSettings23.charset();
        org.jsoup.nodes.Document.OutputSettings outputSettings26 = outputSettings23.clone();
        outputSettings23.forceAllElementAsBlock = true;
        outputSettings23.setprettyPrint(true);
        org.jsoup.nodes.Document.OutputSettings outputSettings32 = outputSettings23.prettyPrint(true);
        org.jsoup.nodes.Entities.EscapeMode escapeMode33 = outputSettings32.escapeMode;
        textNode18.outerHtmlTail(stringBuilder19, (int) '4', outputSettings32);
        org.jsoup.nodes.Document.OutputSettings outputSettings35 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Document.OutputSettings outputSettings37 = outputSettings35.indentAmount((int) 'a');
        org.jsoup.nodes.Entities.EscapeMode escapeMode38 = outputSettings37.escapeMode;
        java.nio.charset.Charset charset39 = outputSettings37.charset();
        outputSettings37.setindentAmount(0);
        org.jsoup.nodes.Entities.EscapeMode escapeMode42 = outputSettings37.escapeMode;
        org.jsoup.nodes.Document.OutputSettings outputSettings44 = outputSettings37.indentAmount((int) (byte) 10);
        boolean boolean45 = outputSettings37.forceAllElementAsBlock;
        org.jsoup.nodes.Document.OutputSettings outputSettings46 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Document.OutputSettings outputSettings48 = outputSettings46.indentAmount((int) 'a');
        org.jsoup.nodes.Entities.EscapeMode escapeMode49 = outputSettings48.escapeMode;
        java.nio.charset.Charset charset50 = outputSettings48.charset();
        org.jsoup.nodes.Entities.EscapeMode escapeMode51 = outputSettings48.escapeMode;
        boolean boolean52 = outputSettings48.prettyPrint;
        org.jsoup.nodes.Document.OutputSettings outputSettings53 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Document.OutputSettings outputSettings55 = outputSettings53.indentAmount((int) 'a');
        org.jsoup.nodes.Entities.EscapeMode escapeMode56 = outputSettings55.escapeMode;
        java.nio.charset.Charset charset57 = outputSettings55.charset();
        outputSettings55.setindentAmount(0);
        org.jsoup.nodes.Entities.EscapeMode escapeMode60 = outputSettings55.escapeMode;
        org.jsoup.nodes.Document.OutputSettings outputSettings61 = outputSettings48.escapeMode(escapeMode60);
        outputSettings37.setescapeMode(escapeMode60);
        org.jsoup.nodes.Document.OutputSettings outputSettings63 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Document.OutputSettings outputSettings65 = outputSettings63.indentAmount((int) 'a');
        org.jsoup.nodes.Document.OutputSettings outputSettings66 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Document.OutputSettings outputSettings68 = outputSettings66.indentAmount((int) 'a');
        org.jsoup.nodes.Entities.EscapeMode escapeMode69 = outputSettings68.escapeMode;
        java.nio.charset.Charset charset70 = outputSettings68.charset();
        outputSettings68.setindentAmount(0);
        org.jsoup.nodes.Entities.EscapeMode escapeMode73 = outputSettings68.escapeMode;
        outputSettings65.setescapeMode(escapeMode73);
        org.jsoup.nodes.Document.OutputSettings outputSettings76 = outputSettings65.prettyPrint(false);
        java.nio.charset.Charset charset77 = outputSettings76.getcharset();
        outputSettings37.charset = charset77;
        org.jsoup.nodes.Document.OutputSettings outputSettings79 = outputSettings32.charset(charset77);
        java.nio.charset.CharsetEncoder charsetEncoder80 = outputSettings32.getcharsetEncoder();
        boolean boolean81 = textNode10.equals((java.lang.Object) outputSettings32);
        org.jsoup.nodes.Node node83 = textNode10.removeAttr("#");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "text" + "'", str5, "text");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(textNode10);
        org.junit.Assert.assertNotNull(textNode12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "#text" + "'", str13, "#text");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "#text" + "'", str14, "#text");
        org.junit.Assert.assertNotNull(attributes15);
        org.junit.Assert.assertNotNull(outputSettings23);
        org.junit.Assert.assertTrue("'" + escapeMode24 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode24.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertNotNull(charset25);
        org.junit.Assert.assertNotNull(outputSettings26);
        org.junit.Assert.assertNotNull(outputSettings32);
        org.junit.Assert.assertTrue("'" + escapeMode33 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode33.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertNotNull(outputSettings37);
        org.junit.Assert.assertTrue("'" + escapeMode38 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode38.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertNotNull(charset39);
        org.junit.Assert.assertTrue("'" + escapeMode42 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode42.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertNotNull(outputSettings44);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertNotNull(outputSettings48);
        org.junit.Assert.assertTrue("'" + escapeMode49 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode49.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertNotNull(charset50);
        org.junit.Assert.assertTrue("'" + escapeMode51 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode51.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + true + "'", boolean52 == true);
        org.junit.Assert.assertNotNull(outputSettings55);
        org.junit.Assert.assertTrue("'" + escapeMode56 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode56.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertNotNull(charset57);
        org.junit.Assert.assertTrue("'" + escapeMode60 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode60.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertNotNull(outputSettings61);
        org.junit.Assert.assertNotNull(outputSettings65);
        org.junit.Assert.assertNotNull(outputSettings68);
        org.junit.Assert.assertTrue("'" + escapeMode69 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode69.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertNotNull(charset70);
        org.junit.Assert.assertTrue("'" + escapeMode73 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode73.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertNotNull(outputSettings76);
        org.junit.Assert.assertNotNull(charset77);
        org.junit.Assert.assertNotNull(outputSettings79);
        org.junit.Assert.assertNotNull(charsetEncoder80);
        org.junit.Assert.assertTrue("'" + boolean81 + "' != '" + false + "'", boolean81 == false);
        org.junit.Assert.assertNotNull(node83);
    }

    @Test
    public void test16003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16003");
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
        org.jsoup.select.NodeVisitor nodeVisitor13 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node14 = textNode2.traverse(nodeVisitor13);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "text" + "'", str5, "text");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "#text" + "'", str6, "#text");
        org.junit.Assert.assertNotNull(attributes7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
    }

    @Test
    public void test16004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16004");
        org.jsoup.nodes.Document.OutputSettings outputSettings0 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Document.OutputSettings outputSettings2 = outputSettings0.indentAmount((int) 'a');
        org.jsoup.nodes.Entities.EscapeMode escapeMode3 = outputSettings2.escapeMode;
        java.nio.charset.Charset charset4 = outputSettings2.charset();
        org.jsoup.nodes.Entities.EscapeMode escapeMode5 = outputSettings2.escapeMode;
        boolean boolean6 = outputSettings2.prettyPrint;
        boolean boolean7 = outputSettings2.forceAllElementAsBlock;
        boolean boolean8 = outputSettings2.getforceAllElementAsBlock();
        boolean boolean9 = outputSettings2.getprettyPrint();
        org.jsoup.nodes.Document.OutputSettings outputSettings10 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Document.OutputSettings outputSettings12 = outputSettings10.indentAmount((int) 'a');
        org.jsoup.nodes.Entities.EscapeMode escapeMode13 = outputSettings12.escapeMode;
        java.nio.charset.Charset charset14 = outputSettings12.charset();
        outputSettings12.setindentAmount(0);
        org.jsoup.nodes.Entities.EscapeMode escapeMode17 = outputSettings12.escapeMode;
        outputSettings2.escapeMode = escapeMode17;
        outputSettings2.prettyPrint = false;
        int int21 = outputSettings2.indentAmount;
        org.jsoup.nodes.Document.OutputSettings outputSettings23 = outputSettings2.indentAmount(10);
        org.jsoup.nodes.Document.OutputSettings outputSettings24 = outputSettings23.clone();
        boolean boolean25 = outputSettings24.prettyPrint();
        org.jsoup.nodes.Entities.EscapeMode escapeMode26 = outputSettings24.escapeMode();
        org.junit.Assert.assertNotNull(outputSettings2);
        org.junit.Assert.assertTrue("'" + escapeMode3 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode3.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertNotNull(charset4);
        org.junit.Assert.assertTrue("'" + escapeMode5 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode5.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(outputSettings12);
        org.junit.Assert.assertTrue("'" + escapeMode13 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode13.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertNotNull(charset14);
        org.junit.Assert.assertTrue("'" + escapeMode17 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode17.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 97 + "'", int21 == 97);
        org.junit.Assert.assertNotNull(outputSettings23);
        org.junit.Assert.assertNotNull(outputSettings24);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + escapeMode26 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode26.equals(org.jsoup.nodes.Entities.EscapeMode.base));
    }

    @Test
    public void test16005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16005");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("", "hi!");
        java.lang.String str3 = textNode2.text;
        java.lang.String str4 = textNode2.outerHtml();
        java.lang.String str5 = textNode2.getTEXT_KEY();
        java.lang.String str6 = textNode2.text;
        java.lang.Object obj7 = null;
        boolean boolean8 = textNode2.equals(obj7);
        java.lang.String str9 = textNode2.getWholeText();
        java.util.List<org.jsoup.nodes.Node> nodeList10 = textNode2.childNodes();
        org.jsoup.nodes.Document.OutputSettings outputSettings11 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Document.OutputSettings outputSettings13 = outputSettings11.indentAmount((int) 'a');
        java.nio.charset.Charset charset14 = outputSettings11.getcharset();
        boolean boolean15 = outputSettings11.prettyPrint();
        boolean boolean16 = outputSettings11.forceAllElementAsBlock;
        org.jsoup.nodes.Document.OutputSettings outputSettings17 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Document.OutputSettings outputSettings19 = outputSettings17.indentAmount((int) 'a');
        org.jsoup.nodes.Entities.EscapeMode escapeMode20 = outputSettings19.escapeMode;
        outputSettings19.setindentAmount((int) '4');
        org.jsoup.nodes.Document.OutputSettings outputSettings23 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Document.OutputSettings outputSettings25 = outputSettings23.indentAmount((int) 'a');
        org.jsoup.nodes.Entities.EscapeMode escapeMode26 = outputSettings25.escapeMode;
        java.nio.charset.Charset charset27 = outputSettings25.charset();
        outputSettings19.setcharset(charset27);
        org.jsoup.nodes.Document.OutputSettings outputSettings29 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Document.OutputSettings outputSettings31 = outputSettings29.indentAmount((int) 'a');
        org.jsoup.nodes.Entities.EscapeMode escapeMode32 = outputSettings31.escapeMode;
        java.nio.charset.Charset charset33 = outputSettings31.charset();
        org.jsoup.nodes.Entities.EscapeMode escapeMode34 = outputSettings31.escapeMode;
        boolean boolean35 = outputSettings31.prettyPrint;
        org.jsoup.nodes.Document.OutputSettings outputSettings36 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Document.OutputSettings outputSettings38 = outputSettings36.indentAmount((int) 'a');
        org.jsoup.nodes.Entities.EscapeMode escapeMode39 = outputSettings38.escapeMode;
        org.jsoup.nodes.Document.OutputSettings outputSettings40 = outputSettings31.escapeMode(escapeMode39);
        org.jsoup.nodes.Document.OutputSettings outputSettings41 = outputSettings19.escapeMode(escapeMode39);
        outputSettings11.setescapeMode(escapeMode39);
        boolean boolean43 = textNode2.equals((java.lang.Object) escapeMode39);
        java.lang.String str44 = textNode2.baseUri();
        java.lang.String str45 = textNode2.text;
        org.jsoup.nodes.Node node46 = textNode2.previousSibling();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "text" + "'", str5, "text");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNotNull(nodeList10);
        org.junit.Assert.assertNotNull(outputSettings13);
        org.junit.Assert.assertNotNull(charset14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(outputSettings19);
        org.junit.Assert.assertTrue("'" + escapeMode20 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode20.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertNotNull(outputSettings25);
        org.junit.Assert.assertTrue("'" + escapeMode26 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode26.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertNotNull(charset27);
        org.junit.Assert.assertNotNull(outputSettings31);
        org.junit.Assert.assertTrue("'" + escapeMode32 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode32.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertNotNull(charset33);
        org.junit.Assert.assertTrue("'" + escapeMode34 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode34.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + true + "'", boolean35 == true);
        org.junit.Assert.assertNotNull(outputSettings38);
        org.junit.Assert.assertTrue("'" + escapeMode39 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode39.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertNotNull(outputSettings40);
        org.junit.Assert.assertNotNull(outputSettings41);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertEquals("'" + str44 + "' != '" + "hi!" + "'", str44, "hi!");
        org.junit.Assert.assertEquals("'" + str45 + "' != '" + "" + "'", str45, "");
        org.junit.Assert.assertNull(node46);
    }

    @Test
    public void test16006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16006");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("", "hi!");
        java.lang.String str3 = textNode2.text;
        java.lang.String str4 = textNode2.outerHtml();
        java.lang.String str5 = textNode2.getTEXT_KEY();
        java.lang.String str6 = textNode2.nodeName();
        textNode2.settext("#text");
        java.util.List<org.jsoup.nodes.Node> nodeList9 = textNode2.siblingNodes();
        java.lang.String str10 = textNode2.nodeName();
        org.jsoup.nodes.TextNode textNode12 = textNode2.splitText(0);
        org.jsoup.nodes.Attributes attributes13 = textNode2.attributes();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "text" + "'", str5, "text");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "#text" + "'", str6, "#text");
        org.junit.Assert.assertNotNull(nodeList9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "#text" + "'", str10, "#text");
        org.junit.Assert.assertNotNull(textNode12);
        org.junit.Assert.assertNotNull(attributes13);
    }

    @Test
    public void test16007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16007");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("", "hi!");
        java.lang.String str3 = textNode2.text;
        java.lang.String str4 = textNode2.outerHtml();
        java.lang.String str5 = textNode2.getTEXT_KEY();
        java.lang.String str6 = textNode2.nodeName();
        org.jsoup.nodes.Attributes attributes7 = textNode2.attributes();
        org.jsoup.nodes.Node node8 = textNode2.clone();
        java.lang.StringBuilder stringBuilder9 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings11 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Document.OutputSettings outputSettings13 = outputSettings11.indentAmount((int) 'a');
        org.jsoup.nodes.Entities.EscapeMode escapeMode14 = outputSettings13.escapeMode;
        outputSettings13.setindentAmount((int) '4');
        org.jsoup.nodes.Document.OutputSettings outputSettings17 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Document.OutputSettings outputSettings19 = outputSettings17.indentAmount((int) 'a');
        org.jsoup.nodes.Entities.EscapeMode escapeMode20 = outputSettings19.escapeMode;
        java.nio.charset.Charset charset21 = outputSettings19.charset();
        outputSettings13.setcharset(charset21);
        org.jsoup.nodes.Document.OutputSettings outputSettings23 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Document.OutputSettings outputSettings25 = outputSettings23.indentAmount((int) 'a');
        org.jsoup.nodes.Entities.EscapeMode escapeMode26 = outputSettings25.escapeMode;
        java.nio.charset.Charset charset27 = outputSettings25.charset();
        org.jsoup.nodes.Entities.EscapeMode escapeMode28 = outputSettings25.escapeMode;
        boolean boolean29 = outputSettings25.prettyPrint;
        org.jsoup.nodes.Document.OutputSettings outputSettings30 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Document.OutputSettings outputSettings32 = outputSettings30.indentAmount((int) 'a');
        org.jsoup.nodes.Entities.EscapeMode escapeMode33 = outputSettings32.escapeMode;
        org.jsoup.nodes.Document.OutputSettings outputSettings34 = outputSettings25.escapeMode(escapeMode33);
        org.jsoup.nodes.Document.OutputSettings outputSettings35 = outputSettings13.escapeMode(escapeMode33);
        boolean boolean36 = outputSettings35.getforceAllElementAsBlock();
        textNode2.outerHtmlTail(stringBuilder9, (int) (byte) 0, outputSettings35);
        java.lang.String str38 = textNode2.nodeName();
        java.lang.String str39 = textNode2.nodeName();
        boolean boolean41 = textNode2.hasAttr("text");
        java.lang.String str42 = textNode2.text;
        org.jsoup.nodes.TextNode textNode45 = org.jsoup.nodes.TextNode.createFromEncoded("#text", "#text");
        org.jsoup.nodes.TextNode textNode47 = textNode45.text("text");
        java.lang.String str48 = textNode47.text();
        org.jsoup.nodes.TextNode textNode50 = textNode47.text("text");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node51 = textNode2.before((org.jsoup.nodes.Node) textNode50);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "text" + "'", str5, "text");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "#text" + "'", str6, "#text");
        org.junit.Assert.assertNotNull(attributes7);
        org.junit.Assert.assertNotNull(node8);
        org.junit.Assert.assertNotNull(outputSettings13);
        org.junit.Assert.assertTrue("'" + escapeMode14 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode14.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertNotNull(outputSettings19);
        org.junit.Assert.assertTrue("'" + escapeMode20 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode20.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertNotNull(charset21);
        org.junit.Assert.assertNotNull(outputSettings25);
        org.junit.Assert.assertTrue("'" + escapeMode26 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode26.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertNotNull(charset27);
        org.junit.Assert.assertTrue("'" + escapeMode28 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode28.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertNotNull(outputSettings32);
        org.junit.Assert.assertTrue("'" + escapeMode33 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode33.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertNotNull(outputSettings34);
        org.junit.Assert.assertNotNull(outputSettings35);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "#text" + "'", str38, "#text");
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "#text" + "'", str39, "#text");
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + true + "'", boolean41 == true);
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "" + "'", str42, "");
        org.junit.Assert.assertNotNull(textNode45);
        org.junit.Assert.assertNotNull(textNode47);
        org.junit.Assert.assertEquals("'" + str48 + "' != '" + "text" + "'", str48, "text");
        org.junit.Assert.assertNotNull(textNode50);
    }

    @Test
    public void test16008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16008");
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
        org.jsoup.nodes.Node node22 = textNode2.attr("#text", "");
        java.lang.StringBuilder stringBuilder23 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings25 = null;
        textNode2.outerHtmlTail(stringBuilder23, (int) (byte) 10, outputSettings25);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "text" + "'", str5, "text");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "#text" + "'", str6, "#text");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(nodeList14);
        org.junit.Assert.assertNull(document17);
        org.junit.Assert.assertNotNull(attributes18);
        org.junit.Assert.assertNull(node19);
        org.junit.Assert.assertNotNull(node22);
    }

    @Test
    public void test16009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16009");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("", "hi!");
        java.lang.String str3 = textNode2.text;
        java.lang.String str4 = textNode2.outerHtml();
        java.lang.String str5 = textNode2.getTEXT_KEY();
        java.lang.String str6 = textNode2.nodeName();
        org.jsoup.nodes.Attributes attributes7 = textNode2.attributes();
        java.lang.String str8 = textNode2.toString();
        java.lang.String str10 = textNode2.absUrl("text");
        java.lang.String str11 = textNode2.getWholeText();
        java.lang.String str13 = textNode2.attr("#text");
        org.jsoup.nodes.Node node14 = textNode2.parent();
        textNode2.setBaseUri("#");
        java.lang.String str17 = textNode2.text();
        org.jsoup.nodes.Node node18 = textNode2.nextSibling();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "text" + "'", str5, "text");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "#text" + "'", str6, "#text");
        org.junit.Assert.assertNotNull(attributes7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNull(node14);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertNull(node18);
    }

    @Test
    public void test16010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16010");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("#text", "#text");
        boolean boolean3 = textNode2.isBlank();
        org.jsoup.nodes.TextNode textNode5 = textNode2.text("text");
        org.jsoup.nodes.Node node7 = textNode2.removeAttr("text");
        java.lang.String str8 = textNode2.baseUri();
        org.jsoup.nodes.TextNode textNode10 = textNode2.text("ext");
        org.jsoup.nodes.Attributes attributes11 = textNode2.attributes();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(textNode5);
        org.junit.Assert.assertNotNull(node7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "#text" + "'", str8, "#text");
        org.junit.Assert.assertNotNull(textNode10);
        org.junit.Assert.assertNotNull(attributes11);
    }

    @Test
    public void test16011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16011");
        org.jsoup.nodes.Document.OutputSettings outputSettings0 = new org.jsoup.nodes.Document.OutputSettings();
        boolean boolean1 = outputSettings0.prettyPrint;
        org.jsoup.nodes.Document.OutputSettings outputSettings3 = outputSettings0.prettyPrint(true);
        boolean boolean4 = outputSettings0.forceAllElementAsBlock;
        boolean boolean5 = outputSettings0.getprettyPrint();
        org.jsoup.nodes.Document.OutputSettings outputSettings6 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Document.OutputSettings outputSettings8 = outputSettings6.indentAmount((int) 'a');
        org.jsoup.nodes.Entities.EscapeMode escapeMode9 = outputSettings8.escapeMode;
        java.nio.charset.Charset charset10 = outputSettings8.charset();
        outputSettings8.setindentAmount(0);
        org.jsoup.nodes.Entities.EscapeMode escapeMode13 = outputSettings8.escapeMode;
        org.jsoup.nodes.Document.OutputSettings outputSettings15 = outputSettings8.indentAmount((int) (byte) 10);
        boolean boolean16 = outputSettings8.getprettyPrint();
        outputSettings8.setprettyPrint(false);
        java.nio.charset.Charset charset19 = outputSettings8.charset();
        outputSettings0.charset = charset19;
        org.jsoup.nodes.Document.OutputSettings outputSettings21 = outputSettings0.clone();
        org.jsoup.nodes.TextNode textNode24 = new org.jsoup.nodes.TextNode("", "hi!");
        java.lang.String str25 = textNode24.text;
        java.lang.String str26 = textNode24.outerHtml();
        java.lang.String str27 = textNode24.getTEXT_KEY();
        java.lang.String str28 = textNode24.nodeName();
        textNode24.settext("#text");
        java.util.List<org.jsoup.nodes.Node> nodeList31 = textNode24.siblingNodes();
        java.lang.String str32 = textNode24.baseUri();
        java.util.List<org.jsoup.nodes.Node> nodeList33 = textNode24.childNodes();
        org.jsoup.nodes.Document.OutputSettings outputSettings34 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Document.OutputSettings outputSettings36 = outputSettings34.indentAmount((int) 'a');
        org.jsoup.nodes.Entities.EscapeMode escapeMode37 = outputSettings36.escapeMode;
        java.nio.charset.Charset charset38 = outputSettings36.charset();
        org.jsoup.nodes.Document.OutputSettings outputSettings39 = outputSettings36.clone();
        boolean boolean40 = outputSettings39.getprettyPrint();
        java.nio.charset.CharsetEncoder charsetEncoder41 = outputSettings39.getcharsetEncoder();
        org.jsoup.nodes.Document.OutputSettings outputSettings42 = outputSettings39.clone();
        boolean boolean43 = textNode24.equals((java.lang.Object) outputSettings42);
        int int44 = outputSettings42.indentAmount;
        java.nio.charset.CharsetEncoder charsetEncoder45 = outputSettings42.encoder();
        outputSettings21.setcharsetEncoder(charsetEncoder45);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertNotNull(outputSettings3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(outputSettings8);
        org.junit.Assert.assertTrue("'" + escapeMode9 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode9.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertNotNull(charset10);
        org.junit.Assert.assertTrue("'" + escapeMode13 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode13.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertNotNull(outputSettings15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertNotNull(charset19);
        org.junit.Assert.assertNotNull(outputSettings21);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "" + "'", str25, "");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "" + "'", str26, "");
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "text" + "'", str27, "text");
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "#text" + "'", str28, "#text");
        org.junit.Assert.assertNotNull(nodeList31);
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "hi!" + "'", str32, "hi!");
        org.junit.Assert.assertNotNull(nodeList33);
        org.junit.Assert.assertNotNull(outputSettings36);
        org.junit.Assert.assertTrue("'" + escapeMode37 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode37.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertNotNull(charset38);
        org.junit.Assert.assertNotNull(outputSettings39);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + true + "'", boolean40 == true);
        org.junit.Assert.assertNotNull(charsetEncoder41);
        org.junit.Assert.assertNotNull(outputSettings42);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + 97 + "'", int44 == 97);
        org.junit.Assert.assertNotNull(charsetEncoder45);
    }

    @Test
    public void test16012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16012");
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
        org.jsoup.nodes.TextNode textNode23 = textNode2.splitText(0);
        java.lang.String str24 = textNode23.toString();
        java.lang.String str26 = textNode23.attr("text");
        org.jsoup.nodes.Node node28 = textNode23.removeAttr("#text");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "text" + "'", str5, "text");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "#text" + "'", str6, "#text");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(nodeList14);
        org.junit.Assert.assertNull(document17);
        org.junit.Assert.assertNotNull(attributes18);
        org.junit.Assert.assertNull(node19);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "#text" + "'", str20, "#text");
        org.junit.Assert.assertNotNull(nodeList21);
        org.junit.Assert.assertNotNull(textNode23);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "text" + "'", str24, "text");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "text" + "'", str26, "text");
        org.junit.Assert.assertNotNull(node28);
    }

    @Test
    public void test16013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16013");
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
        org.jsoup.nodes.Node node24 = textNode2.attr("hi!", "#");
        textNode2.ensureAttributes();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "text" + "'", str5, "text");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "#text" + "'", str6, "#text");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(nodeList14);
        org.junit.Assert.assertNull(document17);
        org.junit.Assert.assertNotNull(attributes18);
        org.junit.Assert.assertNull(node19);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "#text" + "'", str20, "#text");
        org.junit.Assert.assertNotNull(nodeList21);
        org.junit.Assert.assertNotNull(node24);
    }

    @Test
    public void test16014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16014");
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
        java.lang.String str16 = textNode2.getWholeText();
        org.jsoup.nodes.Document document17 = textNode2.ownerDocument();
        org.jsoup.nodes.Node node19 = textNode2.removeAttr("t");
        java.lang.StringBuilder stringBuilder20 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings22 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Document.OutputSettings outputSettings24 = outputSettings22.indentAmount((int) 'a');
        org.jsoup.nodes.Entities.EscapeMode escapeMode25 = outputSettings24.escapeMode;
        java.nio.charset.Charset charset26 = outputSettings24.charset();
        org.jsoup.nodes.Document.OutputSettings outputSettings27 = outputSettings24.clone();
        outputSettings27.indentAmount = 0;
        org.jsoup.nodes.Entities.EscapeMode escapeMode30 = outputSettings27.getescapeMode();
        org.jsoup.nodes.Document.OutputSettings outputSettings31 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Document.OutputSettings outputSettings33 = outputSettings31.indentAmount((int) 'a');
        org.jsoup.nodes.Entities.EscapeMode escapeMode34 = outputSettings33.escapeMode;
        java.nio.charset.Charset charset35 = outputSettings33.charset();
        org.jsoup.nodes.Document.OutputSettings outputSettings36 = outputSettings33.clone();
        boolean boolean37 = outputSettings36.getprettyPrint();
        org.jsoup.nodes.Entities.EscapeMode escapeMode38 = outputSettings36.escapeMode;
        java.nio.charset.Charset charset39 = outputSettings36.getcharset();
        org.jsoup.nodes.Document.OutputSettings outputSettings40 = outputSettings27.charset(charset39);
        org.jsoup.nodes.Document.OutputSettings outputSettings41 = outputSettings40.clone();
        outputSettings40.setindentAmount((int) (short) 10);
        int int44 = outputSettings40.indentAmount;
        textNode2.outerHtmlTail(stringBuilder20, 0, outputSettings40);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(node6);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "text" + "'", str9, "text");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNull(node15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertNull(document17);
        org.junit.Assert.assertNotNull(node19);
        org.junit.Assert.assertNotNull(outputSettings24);
        org.junit.Assert.assertTrue("'" + escapeMode25 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode25.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertNotNull(charset26);
        org.junit.Assert.assertNotNull(outputSettings27);
        org.junit.Assert.assertTrue("'" + escapeMode30 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode30.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertNotNull(outputSettings33);
        org.junit.Assert.assertTrue("'" + escapeMode34 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode34.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertNotNull(charset35);
        org.junit.Assert.assertNotNull(outputSettings36);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + true + "'", boolean37 == true);
        org.junit.Assert.assertTrue("'" + escapeMode38 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode38.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertNotNull(charset39);
        org.junit.Assert.assertNotNull(outputSettings40);
        org.junit.Assert.assertNotNull(outputSettings41);
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + 10 + "'", int44 == 10);
    }

    @Test
    public void test16015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16015");
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
        java.lang.String str22 = textNode2.text;
        java.lang.String str23 = textNode2.nodeName();
        org.jsoup.nodes.TextNode textNode25 = textNode2.splitText(0);
        java.lang.String str26 = textNode25.getWholeText();
        org.jsoup.nodes.TextNode textNode28 = textNode25.text("#");
        java.lang.String str29 = textNode28.outerHtml();
        java.util.List<org.jsoup.nodes.Node> nodeList30 = textNode28.siblingNodes();
        java.lang.String str31 = textNode28.getTEXT_KEY();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "text" + "'", str5, "text");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "#text" + "'", str6, "#text");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(nodeList14);
        org.junit.Assert.assertNull(document17);
        org.junit.Assert.assertNotNull(attributes18);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "text" + "'", str19, "text");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "#text" + "'", str21, "#text");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "text" + "'", str22, "text");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "#text" + "'", str23, "#text");
        org.junit.Assert.assertNotNull(textNode25);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "text" + "'", str26, "text");
        org.junit.Assert.assertNotNull(textNode28);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "#" + "'", str29, "#");
        org.junit.Assert.assertNotNull(nodeList30);
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "text" + "'", str31, "text");
    }

    @Test
    public void test16016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16016");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("", "hi!");
        java.lang.String str3 = textNode2.text;
        java.lang.String str4 = textNode2.outerHtml();
        java.lang.String str5 = textNode2.getTEXT_KEY();
        java.lang.String str6 = textNode2.nodeName();
        boolean boolean8 = textNode2.equals((java.lang.Object) (short) 1);
        textNode2.setBaseUri("#text");
        boolean boolean11 = textNode2.isBlank();
        textNode2.text = "#text";
        org.jsoup.nodes.Node node14 = textNode2.parent();
        java.lang.String str15 = textNode2.nodeName();
        java.lang.String str16 = textNode2.baseUri();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node18 = textNode2.before("h");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "text" + "'", str5, "text");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "#text" + "'", str6, "#text");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNull(node14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "#text" + "'", str15, "#text");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "#text" + "'", str16, "#text");
    }

    @Test
    public void test16017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16017");
        org.jsoup.nodes.Document.OutputSettings outputSettings0 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Document.OutputSettings outputSettings2 = outputSettings0.indentAmount((int) 'a');
        java.nio.charset.Charset charset3 = outputSettings0.getcharset();
        boolean boolean4 = outputSettings0.prettyPrint();
        boolean boolean5 = outputSettings0.forceAllElementAsBlock;
        outputSettings0.indentAmount = (short) 1;
        outputSettings0.prettyPrint = true;
        outputSettings0.forceAllElementAsBlock = false;
        outputSettings0.setprettyPrint(false);
        outputSettings0.indentAmount = '#';
        org.jsoup.nodes.Document.OutputSettings outputSettings16 = new org.jsoup.nodes.Document.OutputSettings();
        boolean boolean17 = outputSettings16.prettyPrint;
        org.jsoup.nodes.Document.OutputSettings outputSettings18 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Document.OutputSettings outputSettings20 = outputSettings18.indentAmount((int) 'a');
        org.jsoup.nodes.Entities.EscapeMode escapeMode21 = outputSettings20.escapeMode;
        java.nio.charset.Charset charset22 = outputSettings20.charset();
        org.jsoup.nodes.Document.OutputSettings outputSettings23 = outputSettings16.charset(charset22);
        boolean boolean24 = outputSettings16.getprettyPrint();
        boolean boolean25 = outputSettings16.getprettyPrint();
        org.jsoup.nodes.Document.OutputSettings outputSettings26 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Document.OutputSettings outputSettings28 = outputSettings26.indentAmount((int) 'a');
        org.jsoup.nodes.Entities.EscapeMode escapeMode29 = outputSettings28.escapeMode;
        java.nio.charset.Charset charset30 = outputSettings28.charset;
        outputSettings16.setcharset(charset30);
        outputSettings16.setindentAmount(0);
        org.jsoup.nodes.Entities.EscapeMode escapeMode34 = outputSettings16.escapeMode;
        org.jsoup.nodes.Document.OutputSettings outputSettings35 = outputSettings0.escapeMode(escapeMode34);
        java.nio.charset.CharsetEncoder charsetEncoder36 = outputSettings35.encoder();
        org.jsoup.nodes.Document.OutputSettings outputSettings37 = outputSettings35.clone();
        org.junit.Assert.assertNotNull(outputSettings2);
        org.junit.Assert.assertNotNull(charset3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertNotNull(outputSettings20);
        org.junit.Assert.assertTrue("'" + escapeMode21 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode21.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertNotNull(charset22);
        org.junit.Assert.assertNotNull(outputSettings23);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertNotNull(outputSettings28);
        org.junit.Assert.assertTrue("'" + escapeMode29 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode29.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertNotNull(charset30);
        org.junit.Assert.assertTrue("'" + escapeMode34 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode34.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertNotNull(outputSettings35);
        org.junit.Assert.assertNotNull(charsetEncoder36);
        org.junit.Assert.assertNotNull(outputSettings37);
    }

    @Test
    public void test16018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16018");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("ext", "t");
        java.lang.String str3 = textNode2.toString();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node4 = textNode2.unwrap();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "ext" + "'", str3, "ext");
    }

    @Test
    public void test16019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16019");
        org.jsoup.nodes.TextNode textNode0 = new org.jsoup.nodes.TextNode();
        org.jsoup.nodes.Node node1 = textNode0.clone();
        java.lang.String str2 = textNode0.getTEXT_KEY();
        java.lang.StringBuilder stringBuilder3 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings5 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Document.OutputSettings outputSettings7 = outputSettings5.indentAmount((int) 'a');
        org.jsoup.nodes.Entities.EscapeMode escapeMode8 = outputSettings7.escapeMode;
        java.nio.charset.Charset charset9 = outputSettings7.charset();
        org.jsoup.nodes.Document.OutputSettings outputSettings10 = outputSettings7.clone();
        outputSettings10.indentAmount = 0;
        outputSettings10.setprettyPrint(false);
        outputSettings10.indentAmount = (short) 10;
        textNode0.outerHtmlTail(stringBuilder3, (int) '#', outputSettings10);
        org.jsoup.nodes.Entities.EscapeMode escapeMode18 = outputSettings10.getescapeMode();
        boolean boolean19 = outputSettings10.getforceAllElementAsBlock();
        org.jsoup.nodes.Document.OutputSettings outputSettings20 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Document.OutputSettings outputSettings22 = outputSettings20.indentAmount((int) 'a');
        org.jsoup.nodes.Entities.EscapeMode escapeMode23 = outputSettings22.escapeMode;
        java.nio.charset.Charset charset24 = outputSettings22.charset();
        org.jsoup.nodes.Entities.EscapeMode escapeMode25 = outputSettings22.escapeMode;
        boolean boolean26 = outputSettings22.prettyPrint;
        org.jsoup.nodes.Document.OutputSettings outputSettings27 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Document.OutputSettings outputSettings29 = outputSettings27.indentAmount((int) 'a');
        org.jsoup.nodes.Entities.EscapeMode escapeMode30 = outputSettings29.escapeMode;
        java.nio.charset.Charset charset31 = outputSettings29.charset();
        outputSettings29.setindentAmount(0);
        org.jsoup.nodes.Entities.EscapeMode escapeMode34 = outputSettings29.escapeMode;
        org.jsoup.nodes.Document.OutputSettings outputSettings35 = outputSettings22.escapeMode(escapeMode34);
        org.jsoup.nodes.Document.OutputSettings outputSettings36 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Document.OutputSettings outputSettings38 = outputSettings36.indentAmount((int) 'a');
        org.jsoup.nodes.Document.OutputSettings outputSettings39 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Document.OutputSettings outputSettings41 = outputSettings39.indentAmount((int) 'a');
        java.nio.charset.Charset charset42 = outputSettings39.getcharset();
        outputSettings38.setcharset(charset42);
        org.jsoup.nodes.Document.OutputSettings outputSettings44 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Document.OutputSettings outputSettings46 = outputSettings44.indentAmount((int) 'a');
        org.jsoup.nodes.Entities.EscapeMode escapeMode47 = outputSettings46.escapeMode;
        java.nio.charset.Charset charset48 = outputSettings46.charset();
        outputSettings38.charset = charset48;
        org.jsoup.nodes.Document.OutputSettings outputSettings50 = outputSettings22.charset(charset48);
        org.jsoup.nodes.Document.OutputSettings outputSettings51 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Document.OutputSettings outputSettings53 = outputSettings51.indentAmount((int) 'a');
        org.jsoup.nodes.Entities.EscapeMode escapeMode54 = outputSettings53.escapeMode;
        java.nio.charset.Charset charset55 = outputSettings53.charset();
        org.jsoup.nodes.Entities.EscapeMode escapeMode56 = outputSettings53.escapeMode;
        int int57 = outputSettings53.indentAmount;
        org.jsoup.nodes.Document.OutputSettings outputSettings58 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Document.OutputSettings outputSettings60 = outputSettings58.indentAmount((int) 'a');
        org.jsoup.nodes.Entities.EscapeMode escapeMode61 = outputSettings60.escapeMode;
        java.nio.charset.Charset charset62 = outputSettings60.charset();
        org.jsoup.nodes.Document.OutputSettings outputSettings63 = outputSettings60.clone();
        outputSettings63.indentAmount = 0;
        org.jsoup.nodes.Document.OutputSettings outputSettings66 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Document.OutputSettings outputSettings68 = outputSettings66.indentAmount((int) 'a');
        org.jsoup.nodes.Entities.EscapeMode escapeMode69 = outputSettings68.escapeMode;
        java.nio.charset.Charset charset70 = outputSettings68.charset();
        org.jsoup.nodes.Entities.EscapeMode escapeMode71 = outputSettings68.escapeMode;
        int int72 = outputSettings68.indentAmount;
        java.nio.charset.CharsetEncoder charsetEncoder73 = outputSettings68.encoder();
        outputSettings63.charsetEncoder = charsetEncoder73;
        java.nio.charset.CharsetEncoder charsetEncoder75 = outputSettings63.getcharsetEncoder();
        org.jsoup.nodes.Entities.EscapeMode escapeMode76 = outputSettings63.escapeMode();
        outputSettings53.setescapeMode(escapeMode76);
        outputSettings50.setescapeMode(escapeMode76);
        org.jsoup.nodes.Document.OutputSettings outputSettings79 = outputSettings10.escapeMode(escapeMode76);
        outputSettings79.setprettyPrint(false);
        boolean boolean82 = outputSettings79.forceAllElementAsBlock();
        java.nio.charset.CharsetEncoder charsetEncoder83 = outputSettings79.charsetEncoder;
        org.junit.Assert.assertNotNull(node1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "text" + "'", str2, "text");
        org.junit.Assert.assertNotNull(outputSettings7);
        org.junit.Assert.assertTrue("'" + escapeMode8 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode8.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertNotNull(charset9);
        org.junit.Assert.assertNotNull(outputSettings10);
        org.junit.Assert.assertTrue("'" + escapeMode18 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode18.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(outputSettings22);
        org.junit.Assert.assertTrue("'" + escapeMode23 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode23.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertNotNull(charset24);
        org.junit.Assert.assertTrue("'" + escapeMode25 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode25.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertNotNull(outputSettings29);
        org.junit.Assert.assertTrue("'" + escapeMode30 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode30.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertNotNull(charset31);
        org.junit.Assert.assertTrue("'" + escapeMode34 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode34.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertNotNull(outputSettings35);
        org.junit.Assert.assertNotNull(outputSettings38);
        org.junit.Assert.assertNotNull(outputSettings41);
        org.junit.Assert.assertNotNull(charset42);
        org.junit.Assert.assertNotNull(outputSettings46);
        org.junit.Assert.assertTrue("'" + escapeMode47 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode47.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertNotNull(charset48);
        org.junit.Assert.assertNotNull(outputSettings50);
        org.junit.Assert.assertNotNull(outputSettings53);
        org.junit.Assert.assertTrue("'" + escapeMode54 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode54.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertNotNull(charset55);
        org.junit.Assert.assertTrue("'" + escapeMode56 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode56.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertTrue("'" + int57 + "' != '" + 97 + "'", int57 == 97);
        org.junit.Assert.assertNotNull(outputSettings60);
        org.junit.Assert.assertTrue("'" + escapeMode61 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode61.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertNotNull(charset62);
        org.junit.Assert.assertNotNull(outputSettings63);
        org.junit.Assert.assertNotNull(outputSettings68);
        org.junit.Assert.assertTrue("'" + escapeMode69 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode69.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertNotNull(charset70);
        org.junit.Assert.assertTrue("'" + escapeMode71 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode71.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertTrue("'" + int72 + "' != '" + 97 + "'", int72 == 97);
        org.junit.Assert.assertNotNull(charsetEncoder73);
        org.junit.Assert.assertNotNull(charsetEncoder75);
        org.junit.Assert.assertTrue("'" + escapeMode76 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode76.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertNotNull(outputSettings79);
        org.junit.Assert.assertTrue("'" + boolean82 + "' != '" + false + "'", boolean82 == false);
        org.junit.Assert.assertNotNull(charsetEncoder83);
    }

    @Test
    public void test16020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16020");
        org.jsoup.nodes.Document.OutputSettings outputSettings0 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Document.OutputSettings outputSettings2 = outputSettings0.indentAmount((int) 'a');
        org.jsoup.nodes.Entities.EscapeMode escapeMode3 = outputSettings2.escapeMode;
        java.nio.charset.Charset charset4 = outputSettings2.charset();
        org.jsoup.nodes.Document.OutputSettings outputSettings5 = new org.jsoup.nodes.Document.OutputSettings();
        boolean boolean6 = outputSettings5.prettyPrint;
        org.jsoup.nodes.Document.OutputSettings outputSettings7 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Document.OutputSettings outputSettings9 = outputSettings7.indentAmount((int) 'a');
        org.jsoup.nodes.Entities.EscapeMode escapeMode10 = outputSettings9.escapeMode;
        java.nio.charset.Charset charset11 = outputSettings9.charset();
        org.jsoup.nodes.Document.OutputSettings outputSettings12 = outputSettings5.charset(charset11);
        outputSettings2.setcharset(charset11);
        boolean boolean14 = outputSettings2.prettyPrint();
        org.jsoup.nodes.Entities.EscapeMode escapeMode15 = outputSettings2.escapeMode;
        org.jsoup.nodes.Document.OutputSettings outputSettings16 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Document.OutputSettings outputSettings18 = outputSettings16.indentAmount((int) 'a');
        org.jsoup.nodes.Entities.EscapeMode escapeMode19 = outputSettings18.escapeMode;
        java.nio.charset.Charset charset20 = outputSettings18.charset;
        java.nio.charset.CharsetEncoder charsetEncoder21 = outputSettings18.getcharsetEncoder();
        outputSettings2.setcharsetEncoder(charsetEncoder21);
        java.nio.charset.Charset charset23 = outputSettings2.charset();
        org.jsoup.nodes.Document.OutputSettings outputSettings24 = new org.jsoup.nodes.Document.OutputSettings();
        boolean boolean25 = outputSettings24.prettyPrint;
        org.jsoup.nodes.Document.OutputSettings outputSettings26 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Document.OutputSettings outputSettings28 = outputSettings26.indentAmount((int) 'a');
        org.jsoup.nodes.Entities.EscapeMode escapeMode29 = outputSettings28.escapeMode;
        java.nio.charset.Charset charset30 = outputSettings28.charset();
        org.jsoup.nodes.Document.OutputSettings outputSettings31 = outputSettings24.charset(charset30);
        boolean boolean32 = outputSettings31.getforceAllElementAsBlock();
        boolean boolean33 = outputSettings31.prettyPrint();
        boolean boolean34 = outputSettings31.prettyPrint;
        org.jsoup.nodes.Entities.EscapeMode escapeMode35 = outputSettings31.getescapeMode();
        org.jsoup.nodes.Document.OutputSettings outputSettings36 = new org.jsoup.nodes.Document.OutputSettings();
        boolean boolean37 = outputSettings36.prettyPrint;
        org.jsoup.nodes.Document.OutputSettings outputSettings38 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Document.OutputSettings outputSettings40 = outputSettings38.indentAmount((int) 'a');
        org.jsoup.nodes.Entities.EscapeMode escapeMode41 = outputSettings40.escapeMode;
        java.nio.charset.Charset charset42 = outputSettings40.charset();
        org.jsoup.nodes.Document.OutputSettings outputSettings43 = outputSettings36.charset(charset42);
        boolean boolean44 = outputSettings36.getprettyPrint();
        boolean boolean45 = outputSettings36.getprettyPrint();
        java.nio.charset.CharsetEncoder charsetEncoder46 = outputSettings36.getcharsetEncoder();
        java.nio.charset.CharsetEncoder charsetEncoder47 = outputSettings36.getcharsetEncoder();
        outputSettings31.setcharsetEncoder(charsetEncoder47);
        org.jsoup.nodes.Document.OutputSettings outputSettings49 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Document.OutputSettings outputSettings51 = outputSettings49.indentAmount((int) 'a');
        org.jsoup.nodes.Entities.EscapeMode escapeMode52 = outputSettings51.escapeMode;
        java.nio.charset.Charset charset53 = outputSettings51.charset();
        org.jsoup.nodes.Document.OutputSettings outputSettings54 = outputSettings51.clone();
        outputSettings54.indentAmount = 0;
        outputSettings54.setprettyPrint(false);
        org.jsoup.nodes.Document.OutputSettings outputSettings59 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Document.OutputSettings outputSettings61 = outputSettings59.indentAmount((int) 'a');
        org.jsoup.nodes.Entities.EscapeMode escapeMode62 = outputSettings61.escapeMode;
        java.nio.charset.Charset charset63 = outputSettings61.charset();
        org.jsoup.nodes.Entities.EscapeMode escapeMode64 = outputSettings61.escapeMode;
        int int65 = outputSettings61.indentAmount;
        java.nio.charset.CharsetEncoder charsetEncoder66 = outputSettings61.encoder();
        outputSettings54.setcharsetEncoder(charsetEncoder66);
        outputSettings31.charsetEncoder = charsetEncoder66;
        outputSettings2.charsetEncoder = charsetEncoder66;
        int int70 = outputSettings2.indentAmount();
        outputSettings2.indentAmount = (short) 10;
        boolean boolean73 = outputSettings2.getprettyPrint();
        org.junit.Assert.assertNotNull(outputSettings2);
        org.junit.Assert.assertTrue("'" + escapeMode3 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode3.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertNotNull(charset4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(outputSettings9);
        org.junit.Assert.assertTrue("'" + escapeMode10 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode10.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertNotNull(charset11);
        org.junit.Assert.assertNotNull(outputSettings12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + escapeMode15 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode15.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertNotNull(outputSettings18);
        org.junit.Assert.assertTrue("'" + escapeMode19 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode19.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertNotNull(charset20);
        org.junit.Assert.assertNotNull(charsetEncoder21);
        org.junit.Assert.assertNotNull(charset23);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertNotNull(outputSettings28);
        org.junit.Assert.assertTrue("'" + escapeMode29 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode29.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertNotNull(charset30);
        org.junit.Assert.assertNotNull(outputSettings31);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + true + "'", boolean33 == true);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + true + "'", boolean34 == true);
        org.junit.Assert.assertTrue("'" + escapeMode35 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode35.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + true + "'", boolean37 == true);
        org.junit.Assert.assertNotNull(outputSettings40);
        org.junit.Assert.assertTrue("'" + escapeMode41 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode41.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertNotNull(charset42);
        org.junit.Assert.assertNotNull(outputSettings43);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + true + "'", boolean44 == true);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + true + "'", boolean45 == true);
        org.junit.Assert.assertNotNull(charsetEncoder46);
        org.junit.Assert.assertNotNull(charsetEncoder47);
        org.junit.Assert.assertNotNull(outputSettings51);
        org.junit.Assert.assertTrue("'" + escapeMode52 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode52.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertNotNull(charset53);
        org.junit.Assert.assertNotNull(outputSettings54);
        org.junit.Assert.assertNotNull(outputSettings61);
        org.junit.Assert.assertTrue("'" + escapeMode62 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode62.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertNotNull(charset63);
        org.junit.Assert.assertTrue("'" + escapeMode64 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode64.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertTrue("'" + int65 + "' != '" + 97 + "'", int65 == 97);
        org.junit.Assert.assertNotNull(charsetEncoder66);
        org.junit.Assert.assertTrue("'" + int70 + "' != '" + 97 + "'", int70 == 97);
        org.junit.Assert.assertTrue("'" + boolean73 + "' != '" + true + "'", boolean73 == true);
    }

    @Test
    public void test16021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16021");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("", "hi!");
        java.lang.String str3 = textNode2.text;
        boolean boolean5 = textNode2.hasAttr("hi!");
        org.jsoup.nodes.Node node6 = textNode2.parent();
        java.lang.StringBuilder stringBuilder7 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings9 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Document.OutputSettings outputSettings11 = outputSettings9.indentAmount((int) 'a');
        org.jsoup.nodes.Document.OutputSettings outputSettings12 = outputSettings9.clone();
        outputSettings12.indentAmount = 10;
        textNode2.outerHtmlTail(stringBuilder7, 100, outputSettings12);
        org.jsoup.nodes.Node node16 = textNode2.nextSibling();
        org.jsoup.nodes.Attributes attributes17 = textNode2.attributes();
        java.lang.String str18 = textNode2.text;
        java.lang.String str19 = textNode2.text();
        org.jsoup.nodes.Node node20 = textNode2.parent();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(node6);
        org.junit.Assert.assertNotNull(outputSettings11);
        org.junit.Assert.assertNotNull(outputSettings12);
        org.junit.Assert.assertNull(node16);
        org.junit.Assert.assertNotNull(attributes17);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertNull(node20);
    }

    @Test
    public void test16022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16022");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("", "hi!");
        java.lang.String str3 = textNode2.text;
        java.lang.String str4 = textNode2.outerHtml();
        java.lang.String str5 = textNode2.getTEXT_KEY();
        java.lang.String str6 = textNode2.nodeName();
        boolean boolean8 = textNode2.equals((java.lang.Object) (short) 1);
        textNode2.setBaseUri("#text");
        boolean boolean11 = textNode2.isBlank();
        org.jsoup.nodes.Node node12 = textNode2.nextSibling();
        java.lang.String str14 = textNode2.attr("h");
        org.jsoup.nodes.Node node15 = textNode2.clone();
        java.lang.String str16 = textNode2.nodeName();
        java.lang.String str17 = textNode2.nodeName();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "text" + "'", str5, "text");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "#text" + "'", str6, "#text");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNull(node12);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertNotNull(node15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "#text" + "'", str16, "#text");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "#text" + "'", str17, "#text");
    }

    @Test
    public void test16023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16023");
        org.jsoup.nodes.TextNode textNode0 = new org.jsoup.nodes.TextNode();
        org.jsoup.nodes.Node node1 = textNode0.clone();
        java.lang.String str2 = textNode0.getTEXT_KEY();
        java.lang.StringBuilder stringBuilder3 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings5 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Document.OutputSettings outputSettings7 = outputSettings5.indentAmount((int) 'a');
        org.jsoup.nodes.Entities.EscapeMode escapeMode8 = outputSettings7.escapeMode;
        java.nio.charset.Charset charset9 = outputSettings7.charset();
        org.jsoup.nodes.Document.OutputSettings outputSettings10 = outputSettings7.clone();
        outputSettings10.indentAmount = 0;
        outputSettings10.setprettyPrint(false);
        outputSettings10.indentAmount = (short) 10;
        textNode0.outerHtmlTail(stringBuilder3, (int) '#', outputSettings10);
        org.jsoup.nodes.Document.OutputSettings outputSettings18 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Document.OutputSettings outputSettings20 = outputSettings18.indentAmount((int) 'a');
        org.jsoup.nodes.Entities.EscapeMode escapeMode21 = outputSettings20.escapeMode;
        java.nio.charset.Charset charset22 = outputSettings20.charset();
        org.jsoup.nodes.Document.OutputSettings outputSettings23 = outputSettings20.clone();
        boolean boolean24 = outputSettings23.getprettyPrint();
        org.jsoup.nodes.Entities.EscapeMode escapeMode25 = outputSettings23.escapeMode;
        org.jsoup.nodes.Document.OutputSettings outputSettings26 = outputSettings10.escapeMode(escapeMode25);
        outputSettings10.setprettyPrint(true);
        org.jsoup.nodes.Document.OutputSettings outputSettings29 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Document.OutputSettings outputSettings31 = outputSettings29.indentAmount((int) 'a');
        java.nio.charset.Charset charset32 = outputSettings29.getcharset();
        boolean boolean33 = outputSettings29.prettyPrint();
        boolean boolean34 = outputSettings29.forceAllElementAsBlock;
        org.jsoup.nodes.Document.OutputSettings outputSettings35 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Document.OutputSettings outputSettings37 = outputSettings35.indentAmount((int) 'a');
        org.jsoup.nodes.Entities.EscapeMode escapeMode38 = outputSettings37.escapeMode;
        outputSettings37.setindentAmount((int) '4');
        org.jsoup.nodes.Document.OutputSettings outputSettings41 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Document.OutputSettings outputSettings43 = outputSettings41.indentAmount((int) 'a');
        org.jsoup.nodes.Entities.EscapeMode escapeMode44 = outputSettings43.escapeMode;
        java.nio.charset.Charset charset45 = outputSettings43.charset();
        outputSettings37.setcharset(charset45);
        org.jsoup.nodes.Document.OutputSettings outputSettings47 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Document.OutputSettings outputSettings49 = outputSettings47.indentAmount((int) 'a');
        org.jsoup.nodes.Entities.EscapeMode escapeMode50 = outputSettings49.escapeMode;
        java.nio.charset.Charset charset51 = outputSettings49.charset();
        org.jsoup.nodes.Entities.EscapeMode escapeMode52 = outputSettings49.escapeMode;
        boolean boolean53 = outputSettings49.prettyPrint;
        org.jsoup.nodes.Document.OutputSettings outputSettings54 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Document.OutputSettings outputSettings56 = outputSettings54.indentAmount((int) 'a');
        org.jsoup.nodes.Entities.EscapeMode escapeMode57 = outputSettings56.escapeMode;
        org.jsoup.nodes.Document.OutputSettings outputSettings58 = outputSettings49.escapeMode(escapeMode57);
        org.jsoup.nodes.Document.OutputSettings outputSettings59 = outputSettings37.escapeMode(escapeMode57);
        outputSettings29.setescapeMode(escapeMode57);
        org.jsoup.nodes.Document.OutputSettings outputSettings61 = outputSettings10.escapeMode(escapeMode57);
        boolean boolean62 = outputSettings10.prettyPrint();
        outputSettings10.setindentAmount(0);
        org.jsoup.nodes.Document.OutputSettings outputSettings65 = outputSettings10.clone();
        java.nio.charset.CharsetEncoder charsetEncoder66 = outputSettings65.charsetEncoder;
        org.junit.Assert.assertNotNull(node1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "text" + "'", str2, "text");
        org.junit.Assert.assertNotNull(outputSettings7);
        org.junit.Assert.assertTrue("'" + escapeMode8 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode8.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertNotNull(charset9);
        org.junit.Assert.assertNotNull(outputSettings10);
        org.junit.Assert.assertNotNull(outputSettings20);
        org.junit.Assert.assertTrue("'" + escapeMode21 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode21.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertNotNull(charset22);
        org.junit.Assert.assertNotNull(outputSettings23);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertTrue("'" + escapeMode25 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode25.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertNotNull(outputSettings26);
        org.junit.Assert.assertNotNull(outputSettings31);
        org.junit.Assert.assertNotNull(charset32);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + true + "'", boolean33 == true);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertNotNull(outputSettings37);
        org.junit.Assert.assertTrue("'" + escapeMode38 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode38.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertNotNull(outputSettings43);
        org.junit.Assert.assertTrue("'" + escapeMode44 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode44.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertNotNull(charset45);
        org.junit.Assert.assertNotNull(outputSettings49);
        org.junit.Assert.assertTrue("'" + escapeMode50 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode50.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertNotNull(charset51);
        org.junit.Assert.assertTrue("'" + escapeMode52 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode52.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + true + "'", boolean53 == true);
        org.junit.Assert.assertNotNull(outputSettings56);
        org.junit.Assert.assertTrue("'" + escapeMode57 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode57.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertNotNull(outputSettings58);
        org.junit.Assert.assertNotNull(outputSettings59);
        org.junit.Assert.assertNotNull(outputSettings61);
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + true + "'", boolean62 == true);
        org.junit.Assert.assertNotNull(outputSettings65);
        org.junit.Assert.assertNotNull(charsetEncoder66);
    }

    @Test
    public void test16024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16024");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("text", "");
        java.lang.String str3 = textNode2.getTEXT_KEY();
        java.lang.String str4 = textNode2.getTEXT_KEY();
        java.lang.String str5 = textNode2.outerHtml();
        java.lang.String str6 = textNode2.gettext();
        org.jsoup.nodes.TextNode textNode8 = textNode2.text("#");
        boolean boolean10 = textNode2.hasAttr("");
        java.lang.String str11 = textNode2.text();
        org.jsoup.nodes.Node node14 = textNode2.attr("#", "#text");
        java.lang.String str15 = textNode2.text;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node17 = textNode2.before("text");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "text" + "'", str3, "text");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "text" + "'", str4, "text");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "text" + "'", str5, "text");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "text" + "'", str6, "text");
        org.junit.Assert.assertNotNull(textNode8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "#" + "'", str11, "#");
        org.junit.Assert.assertNotNull(node14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "#" + "'", str15, "#");
    }

    @Test
    public void test16025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16025");
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
        java.lang.String str28 = textNode2.attr("#text");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "text" + "'", str5, "text");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "#text" + "'", str6, "#text");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(nodeList14);
        org.junit.Assert.assertNull(document17);
        org.junit.Assert.assertNotNull(attributes18);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "text" + "'", str19, "text");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "#text" + "'", str20, "#text");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertNull(node23);
        org.junit.Assert.assertNull(node24);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "" + "'", str28, "");
    }

    @Test
    public void test16026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16026");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("#text", "");
        java.lang.String str3 = textNode2.outerHtml();
        java.lang.String str4 = textNode2.toString();
        org.jsoup.nodes.Node node5 = textNode2.clone();
        org.jsoup.nodes.TextNode textNode7 = textNode2.splitText(0);
        org.junit.Assert.assertNotNull(textNode2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "#text" + "'", str3, "#text");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "#text" + "'", str4, "#text");
        org.junit.Assert.assertNotNull(node5);
        org.junit.Assert.assertNotNull(textNode7);
    }

    @Test
    public void test16027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16027");
        org.jsoup.nodes.Document.OutputSettings outputSettings0 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Document.OutputSettings outputSettings2 = outputSettings0.indentAmount((int) 'a');
        org.jsoup.nodes.Entities.EscapeMode escapeMode3 = outputSettings2.escapeMode;
        java.nio.charset.Charset charset4 = outputSettings2.charset();
        org.jsoup.nodes.Document.OutputSettings outputSettings5 = outputSettings2.clone();
        boolean boolean6 = outputSettings5.getprettyPrint();
        java.nio.charset.CharsetEncoder charsetEncoder7 = outputSettings5.getcharsetEncoder();
        org.jsoup.nodes.Document.OutputSettings outputSettings8 = outputSettings5.clone();
        org.jsoup.nodes.Entities.EscapeMode escapeMode9 = outputSettings8.getescapeMode();
        org.jsoup.nodes.Document.OutputSettings outputSettings11 = outputSettings8.prettyPrint(true);
        org.jsoup.nodes.Document.OutputSettings outputSettings13 = outputSettings8.indentAmount(97);
        org.jsoup.nodes.Entities.EscapeMode escapeMode14 = outputSettings8.escapeMode;
        org.jsoup.nodes.Entities.EscapeMode escapeMode15 = outputSettings8.escapeMode;
        org.junit.Assert.assertNotNull(outputSettings2);
        org.junit.Assert.assertTrue("'" + escapeMode3 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode3.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertNotNull(charset4);
        org.junit.Assert.assertNotNull(outputSettings5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(charsetEncoder7);
        org.junit.Assert.assertNotNull(outputSettings8);
        org.junit.Assert.assertTrue("'" + escapeMode9 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode9.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertNotNull(outputSettings11);
        org.junit.Assert.assertNotNull(outputSettings13);
        org.junit.Assert.assertTrue("'" + escapeMode14 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode14.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertTrue("'" + escapeMode15 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode15.equals(org.jsoup.nodes.Entities.EscapeMode.base));
    }

    @Test
    public void test16028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16028");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("", "hi!");
        java.lang.String str3 = textNode2.text;
        java.lang.String str4 = textNode2.outerHtml();
        java.lang.String str5 = textNode2.getTEXT_KEY();
        java.lang.String str6 = textNode2.text;
        java.lang.String str7 = textNode2.gettext();
        java.lang.String str9 = textNode2.attr("");
        textNode2.ensureAttributes();
        textNode2.text = "text";
        java.lang.String str13 = textNode2.nodeName();
        java.lang.String str14 = textNode2.text;
        org.jsoup.nodes.Node node15 = textNode2.nextSibling();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "text" + "'", str5, "text");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "#text" + "'", str13, "#text");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "text" + "'", str14, "text");
        org.junit.Assert.assertNull(node15);
    }

    @Test
    public void test16029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16029");
        org.jsoup.nodes.Document.OutputSettings outputSettings0 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Document.OutputSettings outputSettings2 = outputSettings0.indentAmount((int) 'a');
        org.jsoup.nodes.Entities.EscapeMode escapeMode3 = outputSettings2.escapeMode;
        java.nio.charset.Charset charset4 = outputSettings2.charset();
        org.jsoup.nodes.Document.OutputSettings outputSettings5 = outputSettings2.clone();
        outputSettings2.forceAllElementAsBlock = true;
        outputSettings2.setprettyPrint(true);
        org.jsoup.nodes.Document.OutputSettings outputSettings11 = outputSettings2.prettyPrint(true);
        org.jsoup.nodes.Entities.EscapeMode escapeMode12 = outputSettings11.escapeMode;
        org.jsoup.nodes.Document.OutputSettings outputSettings13 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Document.OutputSettings outputSettings15 = outputSettings13.indentAmount((int) 'a');
        org.jsoup.nodes.Entities.EscapeMode escapeMode16 = outputSettings15.escapeMode;
        java.nio.charset.Charset charset17 = outputSettings15.charset();
        org.jsoup.nodes.Document.OutputSettings outputSettings18 = outputSettings15.clone();
        outputSettings18.indentAmount = 0;
        org.jsoup.nodes.Document.OutputSettings outputSettings21 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Document.OutputSettings outputSettings23 = outputSettings21.indentAmount((int) 'a');
        org.jsoup.nodes.Entities.EscapeMode escapeMode24 = outputSettings23.escapeMode;
        java.nio.charset.Charset charset25 = outputSettings23.charset;
        outputSettings18.setcharset(charset25);
        org.jsoup.nodes.Document.OutputSettings outputSettings27 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Document.OutputSettings outputSettings29 = outputSettings27.indentAmount((int) 'a');
        org.jsoup.nodes.Entities.EscapeMode escapeMode30 = outputSettings29.escapeMode;
        java.nio.charset.Charset charset31 = outputSettings29.charset();
        outputSettings29.setindentAmount(0);
        org.jsoup.nodes.Entities.EscapeMode escapeMode34 = outputSettings29.escapeMode;
        org.jsoup.nodes.Document.OutputSettings outputSettings35 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Document.OutputSettings outputSettings37 = outputSettings35.indentAmount((int) 'a');
        org.jsoup.nodes.Entities.EscapeMode escapeMode38 = outputSettings37.escapeMode;
        java.nio.charset.Charset charset39 = outputSettings37.charset();
        outputSettings37.setindentAmount(0);
        org.jsoup.nodes.Entities.EscapeMode escapeMode42 = outputSettings37.escapeMode;
        outputSettings37.forceAllElementAsBlock = false;
        java.nio.charset.CharsetEncoder charsetEncoder45 = outputSettings37.charsetEncoder;
        outputSettings29.setcharsetEncoder(charsetEncoder45);
        outputSettings18.setcharsetEncoder(charsetEncoder45);
        org.jsoup.nodes.Entities.EscapeMode escapeMode48 = outputSettings18.escapeMode();
        org.jsoup.nodes.Document.OutputSettings outputSettings49 = outputSettings11.escapeMode(escapeMode48);
        outputSettings49.indentAmount = 0;
        org.junit.Assert.assertNotNull(outputSettings2);
        org.junit.Assert.assertTrue("'" + escapeMode3 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode3.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertNotNull(charset4);
        org.junit.Assert.assertNotNull(outputSettings5);
        org.junit.Assert.assertNotNull(outputSettings11);
        org.junit.Assert.assertTrue("'" + escapeMode12 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode12.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertNotNull(outputSettings15);
        org.junit.Assert.assertTrue("'" + escapeMode16 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode16.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertNotNull(charset17);
        org.junit.Assert.assertNotNull(outputSettings18);
        org.junit.Assert.assertNotNull(outputSettings23);
        org.junit.Assert.assertTrue("'" + escapeMode24 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode24.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertNotNull(charset25);
        org.junit.Assert.assertNotNull(outputSettings29);
        org.junit.Assert.assertTrue("'" + escapeMode30 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode30.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertNotNull(charset31);
        org.junit.Assert.assertTrue("'" + escapeMode34 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode34.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertNotNull(outputSettings37);
        org.junit.Assert.assertTrue("'" + escapeMode38 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode38.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertNotNull(charset39);
        org.junit.Assert.assertTrue("'" + escapeMode42 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode42.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertNotNull(charsetEncoder45);
        org.junit.Assert.assertTrue("'" + escapeMode48 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode48.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertNotNull(outputSettings49);
    }

    @Test
    public void test16030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16030");
        org.jsoup.nodes.Document.OutputSettings outputSettings0 = new org.jsoup.nodes.Document.OutputSettings();
        boolean boolean1 = outputSettings0.prettyPrint;
        org.jsoup.nodes.Document.OutputSettings outputSettings2 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Document.OutputSettings outputSettings4 = outputSettings2.indentAmount((int) 'a');
        org.jsoup.nodes.Entities.EscapeMode escapeMode5 = outputSettings4.escapeMode;
        java.nio.charset.Charset charset6 = outputSettings4.charset();
        org.jsoup.nodes.Document.OutputSettings outputSettings7 = outputSettings0.charset(charset6);
        boolean boolean8 = outputSettings7.getforceAllElementAsBlock();
        org.jsoup.nodes.Document.OutputSettings outputSettings9 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Document.OutputSettings outputSettings11 = outputSettings9.indentAmount((int) 'a');
        org.jsoup.nodes.Document.OutputSettings outputSettings12 = outputSettings9.clone();
        boolean boolean13 = outputSettings9.getforceAllElementAsBlock();
        outputSettings9.prettyPrint = true;
        java.nio.charset.CharsetEncoder charsetEncoder16 = outputSettings9.getcharsetEncoder();
        java.nio.charset.CharsetEncoder charsetEncoder17 = outputSettings9.encoder();
        org.jsoup.nodes.Document.OutputSettings outputSettings18 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Document.OutputSettings outputSettings20 = outputSettings18.indentAmount((int) 'a');
        org.jsoup.nodes.Entities.EscapeMode escapeMode21 = outputSettings20.escapeMode;
        outputSettings20.setindentAmount((int) '4');
        org.jsoup.nodes.Document.OutputSettings outputSettings24 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Document.OutputSettings outputSettings26 = outputSettings24.indentAmount((int) 'a');
        org.jsoup.nodes.Entities.EscapeMode escapeMode27 = outputSettings26.escapeMode;
        java.nio.charset.Charset charset28 = outputSettings26.charset();
        outputSettings20.setcharset(charset28);
        org.jsoup.nodes.Document.OutputSettings outputSettings30 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Document.OutputSettings outputSettings32 = outputSettings30.indentAmount((int) 'a');
        org.jsoup.nodes.Entities.EscapeMode escapeMode33 = outputSettings32.escapeMode;
        java.nio.charset.Charset charset34 = outputSettings32.charset();
        org.jsoup.nodes.Entities.EscapeMode escapeMode35 = outputSettings32.escapeMode;
        boolean boolean36 = outputSettings32.prettyPrint;
        org.jsoup.nodes.Document.OutputSettings outputSettings37 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Document.OutputSettings outputSettings39 = outputSettings37.indentAmount((int) 'a');
        org.jsoup.nodes.Entities.EscapeMode escapeMode40 = outputSettings39.escapeMode;
        org.jsoup.nodes.Document.OutputSettings outputSettings41 = outputSettings32.escapeMode(escapeMode40);
        org.jsoup.nodes.Document.OutputSettings outputSettings42 = outputSettings20.escapeMode(escapeMode40);
        org.jsoup.nodes.Document.OutputSettings outputSettings43 = outputSettings9.escapeMode(escapeMode40);
        boolean boolean44 = outputSettings43.getforceAllElementAsBlock();
        org.jsoup.nodes.Document.OutputSettings outputSettings46 = outputSettings43.prettyPrint(true);
        outputSettings46.setprettyPrint(true);
        java.nio.charset.CharsetEncoder charsetEncoder49 = outputSettings46.getcharsetEncoder();
        java.nio.charset.Charset charset50 = outputSettings46.charset();
        org.jsoup.nodes.Document.OutputSettings outputSettings51 = outputSettings7.charset(charset50);
        boolean boolean52 = outputSettings7.forceAllElementAsBlock();
        java.nio.charset.CharsetEncoder charsetEncoder53 = outputSettings7.charsetEncoder;
        org.jsoup.nodes.TextNode textNode56 = new org.jsoup.nodes.TextNode("", "hi!");
        java.lang.String str57 = textNode56.text;
        java.lang.String str58 = textNode56.outerHtml();
        java.lang.String str59 = textNode56.getTEXT_KEY();
        java.lang.String str60 = textNode56.nodeName();
        org.jsoup.nodes.Attributes attributes61 = textNode56.attributes();
        java.lang.String str62 = textNode56.toString();
        java.lang.String str64 = textNode56.absUrl("text");
        java.lang.StringBuilder stringBuilder65 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings67 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Document.OutputSettings outputSettings69 = outputSettings67.indentAmount((int) 'a');
        outputSettings69.prettyPrint = false;
        int int72 = outputSettings69.indentAmount;
        org.jsoup.nodes.Document.OutputSettings outputSettings74 = outputSettings69.forceAllElementAsBlock(false);
        outputSettings69.forceAllElementAsBlock = true;
        textNode56.outerHtmlTail(stringBuilder65, (int) (short) 10, outputSettings69);
        java.nio.charset.Charset charset78 = outputSettings69.charset;
        outputSettings7.charset = charset78;
        int int80 = outputSettings7.getindentAmount();
        org.jsoup.nodes.Document.OutputSettings outputSettings82 = outputSettings7.indentAmount((int) (byte) 1);
        boolean boolean83 = outputSettings82.prettyPrint;
        org.jsoup.nodes.Document.OutputSettings outputSettings85 = outputSettings82.prettyPrint(false);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertNotNull(outputSettings4);
        org.junit.Assert.assertTrue("'" + escapeMode5 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode5.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertNotNull(charset6);
        org.junit.Assert.assertNotNull(outputSettings7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(outputSettings11);
        org.junit.Assert.assertNotNull(outputSettings12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(charsetEncoder16);
        org.junit.Assert.assertNotNull(charsetEncoder17);
        org.junit.Assert.assertNotNull(outputSettings20);
        org.junit.Assert.assertTrue("'" + escapeMode21 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode21.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertNotNull(outputSettings26);
        org.junit.Assert.assertTrue("'" + escapeMode27 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode27.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertNotNull(charset28);
        org.junit.Assert.assertNotNull(outputSettings32);
        org.junit.Assert.assertTrue("'" + escapeMode33 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode33.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertNotNull(charset34);
        org.junit.Assert.assertTrue("'" + escapeMode35 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode35.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + true + "'", boolean36 == true);
        org.junit.Assert.assertNotNull(outputSettings39);
        org.junit.Assert.assertTrue("'" + escapeMode40 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode40.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertNotNull(outputSettings41);
        org.junit.Assert.assertNotNull(outputSettings42);
        org.junit.Assert.assertNotNull(outputSettings43);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertNotNull(outputSettings46);
        org.junit.Assert.assertNotNull(charsetEncoder49);
        org.junit.Assert.assertNotNull(charset50);
        org.junit.Assert.assertNotNull(outputSettings51);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
        org.junit.Assert.assertNotNull(charsetEncoder53);
        org.junit.Assert.assertEquals("'" + str57 + "' != '" + "" + "'", str57, "");
        org.junit.Assert.assertEquals("'" + str58 + "' != '" + "" + "'", str58, "");
        org.junit.Assert.assertEquals("'" + str59 + "' != '" + "text" + "'", str59, "text");
        org.junit.Assert.assertEquals("'" + str60 + "' != '" + "#text" + "'", str60, "#text");
        org.junit.Assert.assertNotNull(attributes61);
        org.junit.Assert.assertEquals("'" + str62 + "' != '" + "" + "'", str62, "");
        org.junit.Assert.assertEquals("'" + str64 + "' != '" + "" + "'", str64, "");
        org.junit.Assert.assertNotNull(outputSettings69);
        org.junit.Assert.assertTrue("'" + int72 + "' != '" + 97 + "'", int72 == 97);
        org.junit.Assert.assertNotNull(outputSettings74);
        org.junit.Assert.assertNotNull(charset78);
        org.junit.Assert.assertTrue("'" + int80 + "' != '" + 1 + "'", int80 == 1);
        org.junit.Assert.assertNotNull(outputSettings82);
        org.junit.Assert.assertTrue("'" + boolean83 + "' != '" + true + "'", boolean83 == true);
        org.junit.Assert.assertNotNull(outputSettings85);
    }

    @Test
    public void test16031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16031");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("", "hi!");
        java.lang.String str3 = textNode2.text;
        java.lang.String str4 = textNode2.outerHtml();
        java.lang.String str5 = textNode2.getTEXT_KEY();
        java.lang.String str6 = textNode2.text;
        java.lang.Object obj7 = null;
        boolean boolean8 = textNode2.equals(obj7);
        java.lang.String str9 = textNode2.baseUri();
        java.lang.String str10 = textNode2.getWholeText();
        java.lang.String str12 = textNode2.attr("hi!");
        textNode2.setBaseUri("text");
        java.lang.String str15 = textNode2.outerHtml();
        java.lang.String str16 = textNode2.gettext();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "text" + "'", str5, "text");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
    }

    @Test
    public void test16032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16032");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("", "hi!");
        java.lang.String str3 = textNode2.text;
        boolean boolean5 = textNode2.hasAttr("hi!");
        org.jsoup.nodes.Node node6 = textNode2.parent();
        java.lang.StringBuilder stringBuilder7 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings9 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Document.OutputSettings outputSettings11 = outputSettings9.indentAmount((int) 'a');
        org.jsoup.nodes.Document.OutputSettings outputSettings12 = outputSettings9.clone();
        outputSettings12.indentAmount = 10;
        textNode2.outerHtmlTail(stringBuilder7, 100, outputSettings12);
        org.jsoup.nodes.Node node16 = textNode2.nextSibling();
        org.jsoup.nodes.Attributes attributes17 = textNode2.attributes();
        java.lang.String str18 = textNode2.text;
        java.lang.String str19 = textNode2.text;
        java.lang.String str20 = textNode2.getWholeText();
        textNode2.text = "";
        java.lang.StringBuilder stringBuilder23 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings25 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Document.OutputSettings outputSettings27 = outputSettings25.indentAmount((int) 'a');
        org.jsoup.nodes.Document.OutputSettings outputSettings28 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Document.OutputSettings outputSettings30 = outputSettings28.indentAmount((int) 'a');
        org.jsoup.nodes.Entities.EscapeMode escapeMode31 = outputSettings30.escapeMode;
        java.nio.charset.Charset charset32 = outputSettings30.charset();
        outputSettings30.setindentAmount(0);
        org.jsoup.nodes.Entities.EscapeMode escapeMode35 = outputSettings30.escapeMode;
        outputSettings27.setescapeMode(escapeMode35);
        boolean boolean37 = outputSettings27.getprettyPrint();
        outputSettings27.indentAmount = 97;
        org.jsoup.nodes.Document.OutputSettings outputSettings40 = outputSettings27.clone();
        outputSettings40.indentAmount = (short) 1;
        org.jsoup.nodes.Entities.EscapeMode escapeMode43 = outputSettings40.getescapeMode();
        textNode2.outerHtmlTail(stringBuilder23, (int) (short) 10, outputSettings40);
        java.nio.charset.CharsetEncoder charsetEncoder45 = outputSettings40.charsetEncoder;
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(node6);
        org.junit.Assert.assertNotNull(outputSettings11);
        org.junit.Assert.assertNotNull(outputSettings12);
        org.junit.Assert.assertNull(node16);
        org.junit.Assert.assertNotNull(attributes17);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertNotNull(outputSettings27);
        org.junit.Assert.assertNotNull(outputSettings30);
        org.junit.Assert.assertTrue("'" + escapeMode31 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode31.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertNotNull(charset32);
        org.junit.Assert.assertTrue("'" + escapeMode35 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode35.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + true + "'", boolean37 == true);
        org.junit.Assert.assertNotNull(outputSettings40);
        org.junit.Assert.assertTrue("'" + escapeMode43 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode43.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertNotNull(charsetEncoder45);
    }

    @Test
    public void test16033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16033");
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
        java.lang.String str19 = textNode2.getWholeText();
        org.jsoup.nodes.TextNode textNode21 = textNode2.text("h");
        int int22 = textNode21.siblingIndex();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "text" + "'", str5, "text");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "#text" + "'", str6, "#text");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(nodeList14);
        org.junit.Assert.assertNull(document17);
        org.junit.Assert.assertNotNull(attributes18);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "text" + "'", str19, "text");
        org.junit.Assert.assertNotNull(textNode21);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
    }

    @Test
    public void test16034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16034");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("", "hi!");
        java.lang.String str3 = textNode2.text;
        java.lang.String str4 = textNode2.outerHtml();
        java.lang.String str5 = textNode2.getTEXT_KEY();
        java.lang.String str6 = textNode2.toString();
        boolean boolean7 = textNode2.isBlank();
        java.util.List<org.jsoup.nodes.Node> nodeList8 = textNode2.siblingNodes();
        org.jsoup.nodes.TextNode textNode10 = textNode2.text("text");
        java.lang.String str11 = textNode2.gettext();
        org.jsoup.select.NodeVisitor nodeVisitor12 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node13 = textNode2.traverse(nodeVisitor12);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "text" + "'", str5, "text");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(nodeList8);
        org.junit.Assert.assertNotNull(textNode10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "text" + "'", str11, "text");
    }

    @Test
    public void test16035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16035");
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
        org.jsoup.nodes.Attributes attributes15 = textNode2.attributes();
        textNode2.settext("text");
        org.jsoup.nodes.Document document18 = textNode2.ownerDocument();
        textNode2.text = "#text";
        textNode2.settext("#text");
        java.util.List<org.jsoup.nodes.Node> nodeList23 = textNode2.siblingNodes();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "text" + "'", str5, "text");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNotNull(nodeList8);
        org.junit.Assert.assertNotNull(textNode10);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "#text" + "'", str13, "#text");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(attributes15);
        org.junit.Assert.assertNull(document18);
        org.junit.Assert.assertNotNull(nodeList23);
    }

    @Test
    public void test16036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16036");
        org.jsoup.nodes.Document.OutputSettings outputSettings0 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Document.OutputSettings outputSettings2 = outputSettings0.indentAmount((int) 'a');
        org.jsoup.nodes.Entities.EscapeMode escapeMode3 = outputSettings2.escapeMode;
        java.nio.charset.Charset charset4 = outputSettings2.charset();
        org.jsoup.nodes.Document.OutputSettings outputSettings5 = outputSettings2.clone();
        outputSettings5.setindentAmount((int) (short) 10);
        outputSettings5.setindentAmount(97);
        outputSettings5.setprettyPrint(true);
        boolean boolean12 = outputSettings5.prettyPrint();
        int int13 = outputSettings5.getindentAmount();
        org.jsoup.nodes.Document.OutputSettings outputSettings15 = outputSettings5.forceAllElementAsBlock(true);
        int int16 = outputSettings15.indentAmount;
        org.junit.Assert.assertNotNull(outputSettings2);
        org.junit.Assert.assertTrue("'" + escapeMode3 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode3.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertNotNull(charset4);
        org.junit.Assert.assertNotNull(outputSettings5);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 97 + "'", int13 == 97);
        org.junit.Assert.assertNotNull(outputSettings15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 97 + "'", int16 == 97);
    }

    @Test
    public void test16037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16037");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("", "hi!");
        java.lang.String str3 = textNode2.text;
        java.lang.String str4 = textNode2.outerHtml();
        java.lang.String str5 = textNode2.getTEXT_KEY();
        java.lang.String str6 = textNode2.nodeName();
        boolean boolean7 = textNode2.isBlank();
        java.lang.String str8 = textNode2.outerHtml();
        java.lang.StringBuilder stringBuilder9 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings11 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Document.OutputSettings outputSettings13 = outputSettings11.indentAmount((int) 'a');
        org.jsoup.nodes.Document.OutputSettings outputSettings14 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Document.OutputSettings outputSettings16 = outputSettings14.indentAmount((int) 'a');
        org.jsoup.nodes.Entities.EscapeMode escapeMode17 = outputSettings16.escapeMode;
        java.nio.charset.Charset charset18 = outputSettings16.charset();
        org.jsoup.nodes.Document.OutputSettings outputSettings19 = outputSettings16.clone();
        outputSettings19.indentAmount = 0;
        org.jsoup.nodes.Document.OutputSettings outputSettings22 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Document.OutputSettings outputSettings24 = outputSettings22.indentAmount((int) 'a');
        org.jsoup.nodes.Entities.EscapeMode escapeMode25 = outputSettings24.escapeMode;
        java.nio.charset.Charset charset26 = outputSettings24.charset();
        org.jsoup.nodes.Entities.EscapeMode escapeMode27 = outputSettings24.escapeMode;
        int int28 = outputSettings24.indentAmount;
        java.nio.charset.CharsetEncoder charsetEncoder29 = outputSettings24.encoder();
        outputSettings19.charsetEncoder = charsetEncoder29;
        outputSettings11.setcharsetEncoder(charsetEncoder29);
        textNode2.outerHtmlTail(stringBuilder9, (int) (short) 100, outputSettings11);
        org.jsoup.nodes.Node node33 = textNode2.clone();
        org.jsoup.nodes.Node node34 = textNode2.clone();
        java.util.List<org.jsoup.nodes.Node> nodeList35 = textNode2.siblingNodes();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "text" + "'", str5, "text");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "#text" + "'", str6, "#text");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNotNull(outputSettings13);
        org.junit.Assert.assertNotNull(outputSettings16);
        org.junit.Assert.assertTrue("'" + escapeMode17 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode17.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertNotNull(charset18);
        org.junit.Assert.assertNotNull(outputSettings19);
        org.junit.Assert.assertNotNull(outputSettings24);
        org.junit.Assert.assertTrue("'" + escapeMode25 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode25.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertNotNull(charset26);
        org.junit.Assert.assertTrue("'" + escapeMode27 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode27.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 97 + "'", int28 == 97);
        org.junit.Assert.assertNotNull(charsetEncoder29);
        org.junit.Assert.assertNotNull(node33);
        org.junit.Assert.assertNotNull(node34);
        org.junit.Assert.assertNotNull(nodeList35);
    }

    @Test
    public void test16038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16038");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("", "hi!");
        java.lang.String str4 = textNode2.absUrl("#text");
        textNode2.ensureAttributes();
        org.jsoup.nodes.TextNode textNode8 = new org.jsoup.nodes.TextNode("", "hi!");
        java.lang.String str9 = textNode8.text;
        java.lang.String str10 = textNode8.outerHtml();
        boolean boolean12 = textNode8.hasAttr("text");
        boolean boolean13 = textNode2.equals((java.lang.Object) "text");
        org.jsoup.nodes.Node node14 = textNode2.nextSibling();
        java.lang.String str15 = textNode2.getTEXT_KEY();
        org.jsoup.nodes.TextNode textNode18 = new org.jsoup.nodes.TextNode("", "hi!");
        java.lang.String str19 = textNode18.text;
        java.lang.String str20 = textNode18.outerHtml();
        java.lang.String str21 = textNode18.getTEXT_KEY();
        java.lang.String str22 = textNode18.nodeName();
        boolean boolean24 = textNode18.equals((java.lang.Object) (short) 1);
        textNode18.setBaseUri("#text");
        boolean boolean27 = textNode18.isBlank();
        textNode18.text = "#text";
        java.util.List<org.jsoup.nodes.Node> nodeList30 = textNode18.childNodes();
        textNode18.settext("text");
        org.jsoup.nodes.Document document33 = textNode18.ownerDocument();
        org.jsoup.nodes.Attributes attributes34 = textNode18.attributes();
        java.lang.String str35 = textNode18.getTEXT_KEY();
        int int36 = textNode18.siblingIndex();
        java.lang.String str38 = textNode18.attr("hi!");
        java.lang.StringBuilder stringBuilder39 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings41 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Document.OutputSettings outputSettings43 = outputSettings41.indentAmount((int) 'a');
        org.jsoup.nodes.Document.OutputSettings outputSettings44 = outputSettings41.clone();
        boolean boolean45 = outputSettings41.getforceAllElementAsBlock();
        outputSettings41.prettyPrint = true;
        java.nio.charset.CharsetEncoder charsetEncoder48 = outputSettings41.getcharsetEncoder();
        java.nio.charset.CharsetEncoder charsetEncoder49 = outputSettings41.encoder();
        textNode18.outerHtmlTail(stringBuilder39, 97, outputSettings41);
        java.lang.String str51 = textNode18.text;
        org.jsoup.nodes.TextNode textNode53 = textNode18.text("text");
        org.jsoup.nodes.TextNode textNode55 = textNode18.text("");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node56 = textNode2.after((org.jsoup.nodes.Node) textNode55);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNull(node14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "text" + "'", str15, "text");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "text" + "'", str21, "text");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "#text" + "'", str22, "#text");
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertNotNull(nodeList30);
        org.junit.Assert.assertNull(document33);
        org.junit.Assert.assertNotNull(attributes34);
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "text" + "'", str35, "text");
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 0 + "'", int36 == 0);
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "" + "'", str38, "");
        org.junit.Assert.assertNotNull(outputSettings43);
        org.junit.Assert.assertNotNull(outputSettings44);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertNotNull(charsetEncoder48);
        org.junit.Assert.assertNotNull(charsetEncoder49);
        org.junit.Assert.assertEquals("'" + str51 + "' != '" + "text" + "'", str51, "text");
        org.junit.Assert.assertNotNull(textNode53);
        org.junit.Assert.assertNotNull(textNode55);
    }

    @Test
    public void test16039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16039");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("", "hi!");
        java.lang.String str3 = textNode2.text;
        java.lang.String str4 = textNode2.outerHtml();
        java.lang.String str5 = textNode2.getTEXT_KEY();
        java.lang.String str6 = textNode2.text;
        java.lang.String str7 = textNode2.gettext();
        int int8 = textNode2.siblingIndex();
        org.jsoup.nodes.TextNode textNode10 = textNode2.text("text");
        org.jsoup.nodes.TextNode textNode12 = textNode10.text("#");
        java.lang.String str13 = textNode10.outerHtml();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "text" + "'", str5, "text");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(textNode10);
        org.junit.Assert.assertNotNull(textNode12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "#" + "'", str13, "#");
    }

    @Test
    public void test16040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16040");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("", "hi!");
        java.lang.String str3 = textNode2.text;
        java.lang.String str4 = textNode2.outerHtml();
        java.lang.String str5 = textNode2.getTEXT_KEY();
        java.lang.String str6 = textNode2.nodeName();
        org.jsoup.nodes.Attributes attributes7 = textNode2.attributes();
        java.lang.String str8 = textNode2.toString();
        java.lang.String str10 = textNode2.absUrl("text");
        java.lang.StringBuilder stringBuilder11 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings13 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Document.OutputSettings outputSettings15 = outputSettings13.indentAmount((int) 'a');
        outputSettings15.prettyPrint = false;
        int int18 = outputSettings15.indentAmount;
        org.jsoup.nodes.Document.OutputSettings outputSettings20 = outputSettings15.forceAllElementAsBlock(false);
        outputSettings15.forceAllElementAsBlock = true;
        textNode2.outerHtmlTail(stringBuilder11, (int) (short) 10, outputSettings15);
        java.lang.String str24 = textNode2.getTEXT_KEY();
        java.lang.String str25 = textNode2.text;
        java.lang.String str26 = textNode2.outerHtml();
        java.lang.String str28 = textNode2.attr("");
        textNode2.setBaseUri("t");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "text" + "'", str5, "text");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "#text" + "'", str6, "#text");
        org.junit.Assert.assertNotNull(attributes7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNotNull(outputSettings15);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 97 + "'", int18 == 97);
        org.junit.Assert.assertNotNull(outputSettings20);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "text" + "'", str24, "text");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "" + "'", str25, "");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "" + "'", str26, "");
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "" + "'", str28, "");
    }

    @Test
    public void test16041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16041");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("", "hi!");
        java.lang.String str3 = textNode2.text;
        java.lang.String str4 = textNode2.outerHtml();
        java.lang.String str5 = textNode2.getTEXT_KEY();
        java.lang.String str6 = textNode2.text;
        java.lang.String str7 = textNode2.gettext();
        java.lang.String str9 = textNode2.attr("");
        textNode2.ensureAttributes();
        textNode2.setBaseUri("#text");
        java.lang.StringBuilder stringBuilder13 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings15 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Document.OutputSettings outputSettings17 = outputSettings15.indentAmount((int) 'a');
        org.jsoup.nodes.Document.OutputSettings outputSettings18 = outputSettings15.clone();
        boolean boolean19 = outputSettings15.getforceAllElementAsBlock();
        outputSettings15.prettyPrint = true;
        java.nio.charset.CharsetEncoder charsetEncoder22 = outputSettings15.getcharsetEncoder();
        org.jsoup.nodes.Document.OutputSettings outputSettings23 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Document.OutputSettings outputSettings25 = outputSettings23.indentAmount((int) 'a');
        java.nio.charset.Charset charset26 = outputSettings23.getcharset();
        org.jsoup.nodes.Document.OutputSettings outputSettings27 = outputSettings15.charset(charset26);
        textNode2.outerHtmlTail(stringBuilder13, (int) (short) 0, outputSettings27);
        outputSettings27.setindentAmount((int) 'a');
        boolean boolean31 = outputSettings27.prettyPrint();
        outputSettings27.indentAmount = (byte) 10;
        org.jsoup.nodes.Document.OutputSettings outputSettings34 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Document.OutputSettings outputSettings36 = outputSettings34.indentAmount((int) 'a');
        org.jsoup.nodes.Document.OutputSettings outputSettings37 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Document.OutputSettings outputSettings39 = outputSettings37.indentAmount((int) 'a');
        org.jsoup.nodes.Entities.EscapeMode escapeMode40 = outputSettings39.escapeMode;
        java.nio.charset.Charset charset41 = outputSettings39.charset();
        outputSettings39.setindentAmount(0);
        org.jsoup.nodes.Entities.EscapeMode escapeMode44 = outputSettings39.escapeMode;
        outputSettings36.setescapeMode(escapeMode44);
        boolean boolean46 = outputSettings36.getprettyPrint();
        outputSettings36.indentAmount = 97;
        org.jsoup.nodes.Document.OutputSettings outputSettings49 = outputSettings36.clone();
        org.jsoup.nodes.Entities.EscapeMode escapeMode50 = outputSettings36.escapeMode();
        org.jsoup.nodes.Entities.EscapeMode escapeMode51 = outputSettings36.escapeMode();
        java.nio.charset.Charset charset52 = outputSettings36.charset;
        outputSettings27.charset = charset52;
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "text" + "'", str5, "text");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNotNull(outputSettings17);
        org.junit.Assert.assertNotNull(outputSettings18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(charsetEncoder22);
        org.junit.Assert.assertNotNull(outputSettings25);
        org.junit.Assert.assertNotNull(charset26);
        org.junit.Assert.assertNotNull(outputSettings27);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + true + "'", boolean31 == true);
        org.junit.Assert.assertNotNull(outputSettings36);
        org.junit.Assert.assertNotNull(outputSettings39);
        org.junit.Assert.assertTrue("'" + escapeMode40 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode40.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertNotNull(charset41);
        org.junit.Assert.assertTrue("'" + escapeMode44 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode44.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + true + "'", boolean46 == true);
        org.junit.Assert.assertNotNull(outputSettings49);
        org.junit.Assert.assertTrue("'" + escapeMode50 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode50.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertTrue("'" + escapeMode51 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode51.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertNotNull(charset52);
    }

    @Test
    public void test16042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16042");
        org.jsoup.nodes.Document.OutputSettings outputSettings0 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Document.OutputSettings outputSettings2 = outputSettings0.indentAmount((int) 'a');
        org.jsoup.nodes.Entities.EscapeMode escapeMode3 = outputSettings2.escapeMode;
        java.nio.charset.Charset charset4 = outputSettings2.charset();
        org.jsoup.nodes.Document.OutputSettings outputSettings5 = outputSettings2.clone();
        outputSettings2.forceAllElementAsBlock = true;
        outputSettings2.setprettyPrint(true);
        org.jsoup.nodes.Document.OutputSettings outputSettings11 = outputSettings2.prettyPrint(true);
        org.jsoup.nodes.Document.OutputSettings outputSettings12 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Document.OutputSettings outputSettings14 = outputSettings12.indentAmount((int) 'a');
        org.jsoup.nodes.Entities.EscapeMode escapeMode15 = outputSettings14.escapeMode;
        java.nio.charset.Charset charset16 = outputSettings14.charset();
        outputSettings14.setindentAmount(0);
        org.jsoup.nodes.Entities.EscapeMode escapeMode19 = outputSettings14.escapeMode;
        org.jsoup.nodes.Document.OutputSettings outputSettings20 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Document.OutputSettings outputSettings22 = outputSettings20.indentAmount((int) 'a');
        org.jsoup.nodes.Entities.EscapeMode escapeMode23 = outputSettings22.escapeMode;
        java.nio.charset.Charset charset24 = outputSettings22.charset();
        outputSettings22.setindentAmount(0);
        org.jsoup.nodes.Entities.EscapeMode escapeMode27 = outputSettings22.escapeMode;
        outputSettings22.forceAllElementAsBlock = false;
        java.nio.charset.CharsetEncoder charsetEncoder30 = outputSettings22.charsetEncoder;
        outputSettings14.setcharsetEncoder(charsetEncoder30);
        outputSettings2.setcharsetEncoder(charsetEncoder30);
        org.jsoup.nodes.Document.OutputSettings outputSettings33 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Document.OutputSettings outputSettings35 = outputSettings33.indentAmount((int) 'a');
        org.jsoup.nodes.Document.OutputSettings outputSettings36 = outputSettings33.clone();
        outputSettings33.forceAllElementAsBlock = false;
        org.jsoup.nodes.Entities.EscapeMode escapeMode39 = outputSettings33.escapeMode;
        java.nio.charset.Charset charset40 = outputSettings33.charset;
        org.jsoup.nodes.Document.OutputSettings outputSettings41 = outputSettings33.clone();
        java.nio.charset.CharsetEncoder charsetEncoder42 = outputSettings33.charsetEncoder;
        outputSettings2.setcharsetEncoder(charsetEncoder42);
        int int44 = outputSettings2.indentAmount();
        org.junit.Assert.assertNotNull(outputSettings2);
        org.junit.Assert.assertTrue("'" + escapeMode3 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode3.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertNotNull(charset4);
        org.junit.Assert.assertNotNull(outputSettings5);
        org.junit.Assert.assertNotNull(outputSettings11);
        org.junit.Assert.assertNotNull(outputSettings14);
        org.junit.Assert.assertTrue("'" + escapeMode15 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode15.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertNotNull(charset16);
        org.junit.Assert.assertTrue("'" + escapeMode19 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode19.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertNotNull(outputSettings22);
        org.junit.Assert.assertTrue("'" + escapeMode23 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode23.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertNotNull(charset24);
        org.junit.Assert.assertTrue("'" + escapeMode27 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode27.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertNotNull(charsetEncoder30);
        org.junit.Assert.assertNotNull(outputSettings35);
        org.junit.Assert.assertNotNull(outputSettings36);
        org.junit.Assert.assertTrue("'" + escapeMode39 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode39.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertNotNull(charset40);
        org.junit.Assert.assertNotNull(outputSettings41);
        org.junit.Assert.assertNotNull(charsetEncoder42);
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + 97 + "'", int44 == 97);
    }

    @Test
    public void test16043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16043");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("text", "");
        java.util.List<org.jsoup.nodes.Node> nodeList3 = textNode2.childNodes();
        org.jsoup.nodes.Document.OutputSettings outputSettings4 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Document.OutputSettings outputSettings6 = outputSettings4.indentAmount((int) 'a');
        org.jsoup.nodes.Entities.EscapeMode escapeMode7 = outputSettings6.escapeMode;
        java.nio.charset.Charset charset8 = outputSettings6.charset();
        org.jsoup.nodes.Document.OutputSettings outputSettings9 = outputSettings6.clone();
        outputSettings9.indentAmount = 0;
        org.jsoup.nodes.Document.OutputSettings outputSettings12 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Document.OutputSettings outputSettings14 = outputSettings12.indentAmount((int) 'a');
        org.jsoup.nodes.Entities.EscapeMode escapeMode15 = outputSettings14.escapeMode;
        java.nio.charset.Charset charset16 = outputSettings14.charset;
        outputSettings9.setcharset(charset16);
        org.jsoup.nodes.Document.OutputSettings outputSettings19 = outputSettings9.forceAllElementAsBlock(false);
        org.jsoup.nodes.Entities.EscapeMode escapeMode20 = outputSettings9.escapeMode;
        boolean boolean21 = textNode2.equals((java.lang.Object) outputSettings9);
        org.jsoup.nodes.Document.OutputSettings outputSettings22 = outputSettings9.clone();
        org.jsoup.nodes.Document.OutputSettings outputSettings24 = outputSettings22.indentAmount((int) (byte) 100);
        org.jsoup.nodes.Document.OutputSettings outputSettings25 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Document.OutputSettings outputSettings27 = outputSettings25.indentAmount((int) 'a');
        org.jsoup.nodes.Entities.EscapeMode escapeMode28 = outputSettings27.escapeMode;
        java.nio.charset.Charset charset29 = outputSettings27.charset();
        org.jsoup.nodes.Document.OutputSettings outputSettings30 = outputSettings27.clone();
        boolean boolean31 = outputSettings30.getprettyPrint();
        java.nio.charset.CharsetEncoder charsetEncoder32 = outputSettings30.getcharsetEncoder();
        org.jsoup.nodes.Document.OutputSettings outputSettings33 = outputSettings30.clone();
        java.nio.charset.CharsetEncoder charsetEncoder34 = outputSettings30.charsetEncoder;
        outputSettings22.charsetEncoder = charsetEncoder34;
        org.jsoup.nodes.Document.OutputSettings outputSettings36 = new org.jsoup.nodes.Document.OutputSettings();
        boolean boolean37 = outputSettings36.prettyPrint;
        org.jsoup.nodes.Document.OutputSettings outputSettings38 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Document.OutputSettings outputSettings40 = outputSettings38.indentAmount((int) 'a');
        org.jsoup.nodes.Entities.EscapeMode escapeMode41 = outputSettings40.escapeMode;
        java.nio.charset.Charset charset42 = outputSettings40.charset();
        org.jsoup.nodes.Document.OutputSettings outputSettings43 = outputSettings36.charset(charset42);
        boolean boolean44 = outputSettings36.getprettyPrint();
        boolean boolean45 = outputSettings36.getprettyPrint();
        java.nio.charset.CharsetEncoder charsetEncoder46 = outputSettings36.getcharsetEncoder();
        boolean boolean47 = outputSettings36.prettyPrint;
        org.jsoup.nodes.Document.OutputSettings outputSettings49 = outputSettings36.forceAllElementAsBlock(false);
        org.jsoup.nodes.Entities.EscapeMode escapeMode50 = outputSettings36.getescapeMode();
        org.jsoup.nodes.Entities.EscapeMode escapeMode51 = outputSettings36.escapeMode;
        java.nio.charset.Charset charset52 = outputSettings36.charset;
        outputSettings22.setcharset(charset52);
        outputSettings22.forceAllElementAsBlock = false;
        int int56 = outputSettings22.indentAmount();
        org.jsoup.nodes.Document.OutputSettings outputSettings57 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Document.OutputSettings outputSettings59 = outputSettings57.indentAmount((int) 'a');
        org.jsoup.nodes.Entities.EscapeMode escapeMode60 = outputSettings59.escapeMode;
        java.nio.charset.Charset charset61 = outputSettings59.charset();
        org.jsoup.nodes.Entities.EscapeMode escapeMode62 = outputSettings59.escapeMode;
        boolean boolean63 = outputSettings59.prettyPrint;
        boolean boolean64 = outputSettings59.forceAllElementAsBlock;
        boolean boolean65 = outputSettings59.getforceAllElementAsBlock();
        boolean boolean66 = outputSettings59.getprettyPrint();
        java.nio.charset.Charset charset67 = outputSettings59.getcharset();
        boolean boolean68 = outputSettings59.getforceAllElementAsBlock();
        org.jsoup.nodes.Document.OutputSettings outputSettings70 = outputSettings59.prettyPrint(false);
        org.jsoup.nodes.Document.OutputSettings outputSettings72 = outputSettings59.indentAmount(0);
        org.jsoup.nodes.Document.OutputSettings outputSettings73 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Document.OutputSettings outputSettings75 = outputSettings73.indentAmount((int) 'a');
        org.jsoup.nodes.Entities.EscapeMode escapeMode76 = outputSettings75.escapeMode;
        java.nio.charset.Charset charset77 = outputSettings75.charset();
        org.jsoup.nodes.Document.OutputSettings outputSettings78 = outputSettings75.clone();
        boolean boolean79 = outputSettings78.getprettyPrint();
        java.nio.charset.CharsetEncoder charsetEncoder80 = outputSettings78.getcharsetEncoder();
        java.nio.charset.CharsetEncoder charsetEncoder81 = outputSettings78.charsetEncoder;
        outputSettings78.forceAllElementAsBlock = true;
        java.nio.charset.CharsetEncoder charsetEncoder84 = outputSettings78.getcharsetEncoder();
        outputSettings72.setcharsetEncoder(charsetEncoder84);
        outputSettings22.charsetEncoder = charsetEncoder84;
        org.junit.Assert.assertNotNull(textNode2);
        org.junit.Assert.assertNotNull(nodeList3);
        org.junit.Assert.assertNotNull(outputSettings6);
        org.junit.Assert.assertTrue("'" + escapeMode7 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode7.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertNotNull(charset8);
        org.junit.Assert.assertNotNull(outputSettings9);
        org.junit.Assert.assertNotNull(outputSettings14);
        org.junit.Assert.assertTrue("'" + escapeMode15 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode15.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertNotNull(charset16);
        org.junit.Assert.assertNotNull(outputSettings19);
        org.junit.Assert.assertTrue("'" + escapeMode20 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode20.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(outputSettings22);
        org.junit.Assert.assertNotNull(outputSettings24);
        org.junit.Assert.assertNotNull(outputSettings27);
        org.junit.Assert.assertTrue("'" + escapeMode28 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode28.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertNotNull(charset29);
        org.junit.Assert.assertNotNull(outputSettings30);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + true + "'", boolean31 == true);
        org.junit.Assert.assertNotNull(charsetEncoder32);
        org.junit.Assert.assertNotNull(outputSettings33);
        org.junit.Assert.assertNotNull(charsetEncoder34);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + true + "'", boolean37 == true);
        org.junit.Assert.assertNotNull(outputSettings40);
        org.junit.Assert.assertTrue("'" + escapeMode41 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode41.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertNotNull(charset42);
        org.junit.Assert.assertNotNull(outputSettings43);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + true + "'", boolean44 == true);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + true + "'", boolean45 == true);
        org.junit.Assert.assertNotNull(charsetEncoder46);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + true + "'", boolean47 == true);
        org.junit.Assert.assertNotNull(outputSettings49);
        org.junit.Assert.assertTrue("'" + escapeMode50 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode50.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertTrue("'" + escapeMode51 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode51.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertNotNull(charset52);
        org.junit.Assert.assertTrue("'" + int56 + "' != '" + 100 + "'", int56 == 100);
        org.junit.Assert.assertNotNull(outputSettings59);
        org.junit.Assert.assertTrue("'" + escapeMode60 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode60.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertNotNull(charset61);
        org.junit.Assert.assertTrue("'" + escapeMode62 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode62.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + true + "'", boolean63 == true);
        org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + false + "'", boolean64 == false);
        org.junit.Assert.assertTrue("'" + boolean65 + "' != '" + false + "'", boolean65 == false);
        org.junit.Assert.assertTrue("'" + boolean66 + "' != '" + true + "'", boolean66 == true);
        org.junit.Assert.assertNotNull(charset67);
        org.junit.Assert.assertTrue("'" + boolean68 + "' != '" + false + "'", boolean68 == false);
        org.junit.Assert.assertNotNull(outputSettings70);
        org.junit.Assert.assertNotNull(outputSettings72);
        org.junit.Assert.assertNotNull(outputSettings75);
        org.junit.Assert.assertTrue("'" + escapeMode76 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode76.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertNotNull(charset77);
        org.junit.Assert.assertNotNull(outputSettings78);
        org.junit.Assert.assertTrue("'" + boolean79 + "' != '" + true + "'", boolean79 == true);
        org.junit.Assert.assertNotNull(charsetEncoder80);
        org.junit.Assert.assertNotNull(charsetEncoder81);
        org.junit.Assert.assertNotNull(charsetEncoder84);
    }

    @Test
    public void test16044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16044");
        org.jsoup.nodes.Document.OutputSettings outputSettings0 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Document.OutputSettings outputSettings2 = outputSettings0.indentAmount((int) 'a');
        org.jsoup.nodes.Entities.EscapeMode escapeMode3 = outputSettings2.escapeMode;
        java.nio.charset.Charset charset4 = outputSettings2.charset();
        org.jsoup.nodes.Entities.EscapeMode escapeMode5 = outputSettings2.escapeMode;
        boolean boolean6 = outputSettings2.prettyPrint;
        org.jsoup.nodes.Document.OutputSettings outputSettings7 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Document.OutputSettings outputSettings9 = outputSettings7.indentAmount((int) 'a');
        org.jsoup.nodes.Entities.EscapeMode escapeMode10 = outputSettings9.escapeMode;
        org.jsoup.nodes.Document.OutputSettings outputSettings11 = outputSettings2.escapeMode(escapeMode10);
        org.jsoup.nodes.TextNode textNode14 = new org.jsoup.nodes.TextNode("", "hi!");
        java.lang.String str15 = textNode14.text;
        java.lang.String str16 = textNode14.outerHtml();
        java.lang.String str17 = textNode14.getTEXT_KEY();
        java.lang.String str18 = textNode14.nodeName();
        org.jsoup.nodes.Attributes attributes19 = textNode14.attributes();
        org.jsoup.nodes.Node node20 = textNode14.clone();
        java.lang.StringBuilder stringBuilder21 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings23 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Document.OutputSettings outputSettings25 = outputSettings23.indentAmount((int) 'a');
        org.jsoup.nodes.Entities.EscapeMode escapeMode26 = outputSettings25.escapeMode;
        outputSettings25.setindentAmount((int) '4');
        org.jsoup.nodes.Document.OutputSettings outputSettings29 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Document.OutputSettings outputSettings31 = outputSettings29.indentAmount((int) 'a');
        org.jsoup.nodes.Entities.EscapeMode escapeMode32 = outputSettings31.escapeMode;
        java.nio.charset.Charset charset33 = outputSettings31.charset();
        outputSettings25.setcharset(charset33);
        org.jsoup.nodes.Document.OutputSettings outputSettings35 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Document.OutputSettings outputSettings37 = outputSettings35.indentAmount((int) 'a');
        org.jsoup.nodes.Entities.EscapeMode escapeMode38 = outputSettings37.escapeMode;
        java.nio.charset.Charset charset39 = outputSettings37.charset();
        org.jsoup.nodes.Entities.EscapeMode escapeMode40 = outputSettings37.escapeMode;
        boolean boolean41 = outputSettings37.prettyPrint;
        org.jsoup.nodes.Document.OutputSettings outputSettings42 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Document.OutputSettings outputSettings44 = outputSettings42.indentAmount((int) 'a');
        org.jsoup.nodes.Entities.EscapeMode escapeMode45 = outputSettings44.escapeMode;
        org.jsoup.nodes.Document.OutputSettings outputSettings46 = outputSettings37.escapeMode(escapeMode45);
        org.jsoup.nodes.Document.OutputSettings outputSettings47 = outputSettings25.escapeMode(escapeMode45);
        boolean boolean48 = outputSettings47.getforceAllElementAsBlock();
        textNode14.outerHtmlTail(stringBuilder21, (int) (byte) 0, outputSettings47);
        org.jsoup.nodes.Document.OutputSettings outputSettings50 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Document.OutputSettings outputSettings52 = outputSettings50.indentAmount((int) 'a');
        org.jsoup.nodes.Entities.EscapeMode escapeMode53 = outputSettings52.escapeMode;
        java.nio.charset.Charset charset54 = outputSettings52.charset();
        outputSettings52.setindentAmount(0);
        org.jsoup.nodes.Entities.EscapeMode escapeMode57 = outputSettings52.escapeMode;
        outputSettings47.escapeMode = escapeMode57;
        org.jsoup.nodes.Document.OutputSettings outputSettings59 = outputSettings2.escapeMode(escapeMode57);
        outputSettings2.forceAllElementAsBlock = false;
        org.jsoup.nodes.Document.OutputSettings outputSettings63 = outputSettings2.indentAmount(0);
        java.nio.charset.Charset charset64 = outputSettings63.charset;
        java.nio.charset.CharsetEncoder charsetEncoder65 = outputSettings63.encoder();
        outputSettings63.setforceAllElementAsBlock(false);
        org.jsoup.nodes.Entities.EscapeMode escapeMode68 = outputSettings63.escapeMode();
        org.jsoup.nodes.Document.OutputSettings outputSettings69 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Document.OutputSettings outputSettings71 = outputSettings69.indentAmount((int) 'a');
        org.jsoup.nodes.Entities.EscapeMode escapeMode72 = outputSettings71.escapeMode;
        java.nio.charset.Charset charset73 = outputSettings71.charset();
        org.jsoup.nodes.Document.OutputSettings outputSettings74 = outputSettings71.clone();
        outputSettings71.forceAllElementAsBlock = true;
        org.jsoup.nodes.Entities.EscapeMode escapeMode77 = outputSettings71.escapeMode;
        int int78 = outputSettings71.getindentAmount();
        org.jsoup.nodes.Document.OutputSettings outputSettings80 = outputSettings71.prettyPrint(false);
        java.nio.charset.Charset charset81 = outputSettings71.charset();
        boolean boolean82 = outputSettings71.prettyPrint;
        org.jsoup.nodes.Entities.EscapeMode escapeMode83 = outputSettings71.escapeMode;
        org.jsoup.nodes.Document.OutputSettings outputSettings85 = outputSettings71.indentAmount((int) (short) 0);
        org.jsoup.nodes.Entities.EscapeMode escapeMode86 = outputSettings85.escapeMode();
        boolean boolean87 = outputSettings85.getprettyPrint();
        java.nio.charset.CharsetEncoder charsetEncoder88 = outputSettings85.getcharsetEncoder();
        outputSettings63.charsetEncoder = charsetEncoder88;
        boolean boolean90 = outputSettings63.forceAllElementAsBlock;
        org.jsoup.nodes.Document.OutputSettings outputSettings91 = outputSettings63.clone();
        org.jsoup.nodes.Document.OutputSettings outputSettings93 = outputSettings63.indentAmount((int) '4');
        org.junit.Assert.assertNotNull(outputSettings2);
        org.junit.Assert.assertTrue("'" + escapeMode3 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode3.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertNotNull(charset4);
        org.junit.Assert.assertTrue("'" + escapeMode5 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode5.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(outputSettings9);
        org.junit.Assert.assertTrue("'" + escapeMode10 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode10.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertNotNull(outputSettings11);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "text" + "'", str17, "text");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "#text" + "'", str18, "#text");
        org.junit.Assert.assertNotNull(attributes19);
        org.junit.Assert.assertNotNull(node20);
        org.junit.Assert.assertNotNull(outputSettings25);
        org.junit.Assert.assertTrue("'" + escapeMode26 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode26.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertNotNull(outputSettings31);
        org.junit.Assert.assertTrue("'" + escapeMode32 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode32.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertNotNull(charset33);
        org.junit.Assert.assertNotNull(outputSettings37);
        org.junit.Assert.assertTrue("'" + escapeMode38 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode38.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertNotNull(charset39);
        org.junit.Assert.assertTrue("'" + escapeMode40 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode40.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + true + "'", boolean41 == true);
        org.junit.Assert.assertNotNull(outputSettings44);
        org.junit.Assert.assertTrue("'" + escapeMode45 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode45.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertNotNull(outputSettings46);
        org.junit.Assert.assertNotNull(outputSettings47);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertNotNull(outputSettings52);
        org.junit.Assert.assertTrue("'" + escapeMode53 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode53.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertNotNull(charset54);
        org.junit.Assert.assertTrue("'" + escapeMode57 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode57.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertNotNull(outputSettings59);
        org.junit.Assert.assertNotNull(outputSettings63);
        org.junit.Assert.assertNotNull(charset64);
        org.junit.Assert.assertNotNull(charsetEncoder65);
        org.junit.Assert.assertTrue("'" + escapeMode68 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode68.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertNotNull(outputSettings71);
        org.junit.Assert.assertTrue("'" + escapeMode72 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode72.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertNotNull(charset73);
        org.junit.Assert.assertNotNull(outputSettings74);
        org.junit.Assert.assertTrue("'" + escapeMode77 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode77.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertTrue("'" + int78 + "' != '" + 97 + "'", int78 == 97);
        org.junit.Assert.assertNotNull(outputSettings80);
        org.junit.Assert.assertNotNull(charset81);
        org.junit.Assert.assertTrue("'" + boolean82 + "' != '" + false + "'", boolean82 == false);
        org.junit.Assert.assertTrue("'" + escapeMode83 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode83.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertNotNull(outputSettings85);
        org.junit.Assert.assertTrue("'" + escapeMode86 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode86.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertTrue("'" + boolean87 + "' != '" + false + "'", boolean87 == false);
        org.junit.Assert.assertNotNull(charsetEncoder88);
        org.junit.Assert.assertTrue("'" + boolean90 + "' != '" + false + "'", boolean90 == false);
        org.junit.Assert.assertNotNull(outputSettings91);
        org.junit.Assert.assertNotNull(outputSettings93);
    }

    @Test
    public void test16045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16045");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("text", "text");
        java.lang.String str3 = textNode2.getWholeText();
        org.jsoup.select.NodeVisitor nodeVisitor4 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node5 = textNode2.traverse(nodeVisitor4);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(textNode2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "text" + "'", str3, "text");
    }

    @Test
    public void test16046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16046");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("", "hi!");
        java.lang.String str3 = textNode2.text;
        java.lang.String str4 = textNode2.outerHtml();
        java.lang.String str5 = textNode2.getTEXT_KEY();
        java.lang.String str6 = textNode2.text;
        java.lang.String str7 = textNode2.gettext();
        int int8 = textNode2.siblingIndex();
        java.lang.String str9 = textNode2.getTEXT_KEY();
        java.lang.String str10 = textNode2.getWholeText();
        textNode2.settext("#text");
        java.lang.String str13 = textNode2.toString();
        java.lang.String str14 = textNode2.nodeName();
        java.lang.String str15 = textNode2.text;
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "text" + "'", str5, "text");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "text" + "'", str9, "text");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "#text" + "'", str13, "#text");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "#text" + "'", str14, "#text");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "#text" + "'", str15, "#text");
    }

    @Test
    public void test16047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16047");
        org.jsoup.nodes.Document.OutputSettings outputSettings0 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Document.OutputSettings outputSettings2 = outputSettings0.indentAmount((int) 'a');
        org.jsoup.nodes.Entities.EscapeMode escapeMode3 = outputSettings2.escapeMode;
        java.nio.charset.Charset charset4 = outputSettings2.charset();
        org.jsoup.nodes.Document.OutputSettings outputSettings5 = outputSettings2.clone();
        outputSettings5.setindentAmount((int) (short) 10);
        outputSettings5.setindentAmount(97);
        outputSettings5.setindentAmount((int) (byte) 10);
        outputSettings5.setindentAmount((int) (byte) -1);
        boolean boolean14 = outputSettings5.forceAllElementAsBlock();
        org.junit.Assert.assertNotNull(outputSettings2);
        org.junit.Assert.assertTrue("'" + escapeMode3 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode3.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertNotNull(charset4);
        org.junit.Assert.assertNotNull(outputSettings5);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test16048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16048");
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
        java.lang.String str13 = textNode2.gettext();
        boolean boolean15 = textNode2.hasAttr("hi!");
        org.jsoup.nodes.Document.OutputSettings outputSettings16 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Document.OutputSettings outputSettings18 = outputSettings16.indentAmount((int) 'a');
        org.jsoup.nodes.Entities.EscapeMode escapeMode19 = outputSettings18.escapeMode;
        java.nio.charset.Charset charset20 = outputSettings18.charset();
        org.jsoup.nodes.Document.OutputSettings outputSettings21 = outputSettings18.clone();
        outputSettings18.forceAllElementAsBlock = true;
        outputSettings18.forceAllElementAsBlock = false;
        java.nio.charset.Charset charset26 = outputSettings18.getcharset();
        boolean boolean27 = textNode2.equals((java.lang.Object) outputSettings18);
        java.util.List<org.jsoup.nodes.Node> nodeList28 = textNode2.childNodes();
        java.lang.String str29 = textNode2.text;
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "text" + "'", str5, "text");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "#text" + "'", str6, "#text");
        org.junit.Assert.assertNotNull(attributes7);
        org.junit.Assert.assertNotNull(nodeList8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNotNull(textNode12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(outputSettings18);
        org.junit.Assert.assertTrue("'" + escapeMode19 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode19.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertNotNull(charset20);
        org.junit.Assert.assertNotNull(outputSettings21);
        org.junit.Assert.assertNotNull(charset26);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNotNull(nodeList28);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "" + "'", str29, "");
    }

    @Test
    public void test16049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16049");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("", "hi!");
        java.lang.String str3 = textNode2.text;
        java.lang.String str4 = textNode2.outerHtml();
        textNode2.setBaseUri("hi!");
        org.jsoup.nodes.Node node7 = textNode2.previousSibling();
        org.jsoup.nodes.TextNode textNode9 = textNode2.text("text");
        org.jsoup.nodes.Node node10 = textNode2.previousSibling();
        org.jsoup.nodes.Node node11 = textNode2.nextSibling();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node13 = node11.childNode(0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNull(node7);
        org.junit.Assert.assertNotNull(textNode9);
        org.junit.Assert.assertNull(node10);
        org.junit.Assert.assertNull(node11);
    }

    @Test
    public void test16050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16050");
        org.jsoup.nodes.Document.OutputSettings outputSettings0 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Document.OutputSettings outputSettings2 = outputSettings0.indentAmount((int) 'a');
        org.jsoup.nodes.Entities.EscapeMode escapeMode3 = outputSettings2.escapeMode;
        java.nio.charset.Charset charset4 = outputSettings2.charset();
        org.jsoup.nodes.Document.OutputSettings outputSettings5 = outputSettings2.clone();
        outputSettings5.indentAmount = 0;
        org.jsoup.nodes.Document.OutputSettings outputSettings8 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Document.OutputSettings outputSettings10 = outputSettings8.indentAmount((int) 'a');
        org.jsoup.nodes.Entities.EscapeMode escapeMode11 = outputSettings10.escapeMode;
        java.nio.charset.Charset charset12 = outputSettings10.charset;
        outputSettings5.setcharset(charset12);
        org.jsoup.nodes.Document.OutputSettings outputSettings15 = outputSettings5.forceAllElementAsBlock(false);
        java.nio.charset.Charset charset16 = outputSettings5.charset();
        outputSettings5.prettyPrint = false;
        outputSettings5.prettyPrint = false;
        org.junit.Assert.assertNotNull(outputSettings2);
        org.junit.Assert.assertTrue("'" + escapeMode3 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode3.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertNotNull(charset4);
        org.junit.Assert.assertNotNull(outputSettings5);
        org.junit.Assert.assertNotNull(outputSettings10);
        org.junit.Assert.assertTrue("'" + escapeMode11 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode11.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertNotNull(charset12);
        org.junit.Assert.assertNotNull(outputSettings15);
        org.junit.Assert.assertNotNull(charset16);
    }

    @Test
    public void test16051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16051");
        org.jsoup.nodes.Document.OutputSettings outputSettings0 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Document.OutputSettings outputSettings2 = outputSettings0.indentAmount((int) 'a');
        org.jsoup.nodes.Entities.EscapeMode escapeMode3 = outputSettings2.escapeMode;
        java.nio.charset.Charset charset4 = outputSettings2.charset();
        org.jsoup.nodes.Document.OutputSettings outputSettings5 = outputSettings2.clone();
        outputSettings5.setindentAmount((int) (short) 10);
        outputSettings5.setindentAmount(97);
        outputSettings5.setprettyPrint(true);
        boolean boolean12 = outputSettings5.prettyPrint();
        int int13 = outputSettings5.getindentAmount();
        org.jsoup.nodes.Document.OutputSettings outputSettings15 = outputSettings5.forceAllElementAsBlock(true);
        outputSettings15.setforceAllElementAsBlock(false);
        boolean boolean18 = outputSettings15.prettyPrint();
        org.junit.Assert.assertNotNull(outputSettings2);
        org.junit.Assert.assertTrue("'" + escapeMode3 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode3.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertNotNull(charset4);
        org.junit.Assert.assertNotNull(outputSettings5);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 97 + "'", int13 == 97);
        org.junit.Assert.assertNotNull(outputSettings15);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
    }

    @Test
    public void test16052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16052");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("", "hi!");
        java.lang.String str3 = textNode2.text;
        java.lang.String str4 = textNode2.outerHtml();
        textNode2.setBaseUri("hi!");
        org.jsoup.nodes.Node node7 = textNode2.previousSibling();
        java.lang.String str8 = textNode2.text;
        java.lang.String str10 = textNode2.attr("#text");
        textNode2.settext("#text");
        org.jsoup.nodes.TextNode textNode15 = new org.jsoup.nodes.TextNode("text", "");
        java.lang.String str16 = textNode15.text;
        java.lang.String str17 = textNode15.text;
        boolean boolean18 = textNode2.equals((java.lang.Object) str17);
        java.lang.String str19 = textNode2.outerHtml();
        java.lang.String str20 = textNode2.nodeName();
        java.lang.String str21 = textNode2.getTEXT_KEY();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNull(node7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "text" + "'", str16, "text");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "text" + "'", str17, "text");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "#text" + "'", str20, "#text");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "text" + "'", str21, "text");
    }

    @Test
    public void test16053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16053");
        org.jsoup.nodes.Document.OutputSettings outputSettings0 = new org.jsoup.nodes.Document.OutputSettings();
        boolean boolean1 = outputSettings0.prettyPrint;
        org.jsoup.nodes.Document.OutputSettings outputSettings2 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Document.OutputSettings outputSettings4 = outputSettings2.indentAmount((int) 'a');
        org.jsoup.nodes.Entities.EscapeMode escapeMode5 = outputSettings4.escapeMode;
        java.nio.charset.Charset charset6 = outputSettings4.charset();
        org.jsoup.nodes.Document.OutputSettings outputSettings7 = outputSettings0.charset(charset6);
        boolean boolean8 = outputSettings7.getforceAllElementAsBlock();
        boolean boolean9 = outputSettings7.prettyPrint();
        boolean boolean10 = outputSettings7.prettyPrint;
        org.jsoup.nodes.Entities.EscapeMode escapeMode11 = outputSettings7.getescapeMode();
        org.jsoup.nodes.Document.OutputSettings outputSettings12 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Document.OutputSettings outputSettings14 = outputSettings12.indentAmount((int) 'a');
        org.jsoup.nodes.Entities.EscapeMode escapeMode15 = outputSettings14.escapeMode;
        java.nio.charset.Charset charset16 = outputSettings14.charset();
        org.jsoup.nodes.Document.OutputSettings outputSettings17 = new org.jsoup.nodes.Document.OutputSettings();
        boolean boolean18 = outputSettings17.prettyPrint;
        org.jsoup.nodes.Document.OutputSettings outputSettings19 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Document.OutputSettings outputSettings21 = outputSettings19.indentAmount((int) 'a');
        org.jsoup.nodes.Entities.EscapeMode escapeMode22 = outputSettings21.escapeMode;
        java.nio.charset.Charset charset23 = outputSettings21.charset();
        org.jsoup.nodes.Document.OutputSettings outputSettings24 = outputSettings17.charset(charset23);
        outputSettings14.setcharset(charset23);
        org.jsoup.nodes.Document.OutputSettings outputSettings26 = outputSettings7.charset(charset23);
        org.jsoup.nodes.Document.OutputSettings outputSettings27 = new org.jsoup.nodes.Document.OutputSettings();
        boolean boolean28 = outputSettings27.prettyPrint;
        org.jsoup.nodes.Document.OutputSettings outputSettings29 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Document.OutputSettings outputSettings31 = outputSettings29.indentAmount((int) 'a');
        org.jsoup.nodes.Entities.EscapeMode escapeMode32 = outputSettings31.escapeMode;
        java.nio.charset.Charset charset33 = outputSettings31.charset();
        org.jsoup.nodes.Document.OutputSettings outputSettings34 = outputSettings27.charset(charset33);
        boolean boolean35 = outputSettings34.getforceAllElementAsBlock();
        boolean boolean36 = outputSettings34.prettyPrint();
        boolean boolean37 = outputSettings34.prettyPrint;
        org.jsoup.nodes.Entities.EscapeMode escapeMode38 = outputSettings34.getescapeMode();
        org.jsoup.nodes.Document.OutputSettings outputSettings39 = new org.jsoup.nodes.Document.OutputSettings();
        boolean boolean40 = outputSettings39.prettyPrint;
        org.jsoup.nodes.Document.OutputSettings outputSettings41 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Document.OutputSettings outputSettings43 = outputSettings41.indentAmount((int) 'a');
        org.jsoup.nodes.Entities.EscapeMode escapeMode44 = outputSettings43.escapeMode;
        java.nio.charset.Charset charset45 = outputSettings43.charset();
        org.jsoup.nodes.Document.OutputSettings outputSettings46 = outputSettings43.clone();
        outputSettings43.forceAllElementAsBlock = true;
        org.jsoup.nodes.Entities.EscapeMode escapeMode49 = outputSettings43.escapeMode;
        org.jsoup.nodes.Document.OutputSettings outputSettings50 = outputSettings39.escapeMode(escapeMode49);
        int int51 = outputSettings50.indentAmount();
        org.jsoup.nodes.Document.OutputSettings outputSettings52 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Document.OutputSettings outputSettings54 = outputSettings52.indentAmount((int) 'a');
        org.jsoup.nodes.Entities.EscapeMode escapeMode55 = outputSettings54.escapeMode;
        java.nio.charset.Charset charset56 = outputSettings54.charset();
        org.jsoup.nodes.Document.OutputSettings outputSettings57 = outputSettings54.clone();
        outputSettings54.forceAllElementAsBlock = true;
        org.jsoup.nodes.Entities.EscapeMode escapeMode60 = outputSettings54.escapeMode;
        int int61 = outputSettings54.getindentAmount();
        org.jsoup.nodes.Document.OutputSettings outputSettings63 = outputSettings54.prettyPrint(false);
        java.nio.charset.Charset charset64 = outputSettings54.charset();
        boolean boolean65 = outputSettings54.prettyPrint;
        org.jsoup.nodes.Entities.EscapeMode escapeMode66 = outputSettings54.escapeMode;
        outputSettings50.escapeMode = escapeMode66;
        org.jsoup.nodes.Document.OutputSettings outputSettings68 = outputSettings34.escapeMode(escapeMode66);
        outputSettings7.setescapeMode(escapeMode66);
        outputSettings7.indentAmount = '#';
        java.nio.charset.Charset charset72 = outputSettings7.getcharset();
        boolean boolean73 = outputSettings7.forceAllElementAsBlock;
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertNotNull(outputSettings4);
        org.junit.Assert.assertTrue("'" + escapeMode5 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode5.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertNotNull(charset6);
        org.junit.Assert.assertNotNull(outputSettings7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + escapeMode11 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode11.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertNotNull(outputSettings14);
        org.junit.Assert.assertTrue("'" + escapeMode15 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode15.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertNotNull(charset16);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertNotNull(outputSettings21);
        org.junit.Assert.assertTrue("'" + escapeMode22 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode22.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertNotNull(charset23);
        org.junit.Assert.assertNotNull(outputSettings24);
        org.junit.Assert.assertNotNull(outputSettings26);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertNotNull(outputSettings31);
        org.junit.Assert.assertTrue("'" + escapeMode32 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode32.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertNotNull(charset33);
        org.junit.Assert.assertNotNull(outputSettings34);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + true + "'", boolean36 == true);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + true + "'", boolean37 == true);
        org.junit.Assert.assertTrue("'" + escapeMode38 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode38.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + true + "'", boolean40 == true);
        org.junit.Assert.assertNotNull(outputSettings43);
        org.junit.Assert.assertTrue("'" + escapeMode44 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode44.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertNotNull(charset45);
        org.junit.Assert.assertNotNull(outputSettings46);
        org.junit.Assert.assertTrue("'" + escapeMode49 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode49.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertNotNull(outputSettings50);
        org.junit.Assert.assertTrue("'" + int51 + "' != '" + 1 + "'", int51 == 1);
        org.junit.Assert.assertNotNull(outputSettings54);
        org.junit.Assert.assertTrue("'" + escapeMode55 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode55.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertNotNull(charset56);
        org.junit.Assert.assertNotNull(outputSettings57);
        org.junit.Assert.assertTrue("'" + escapeMode60 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode60.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertTrue("'" + int61 + "' != '" + 97 + "'", int61 == 97);
        org.junit.Assert.assertNotNull(outputSettings63);
        org.junit.Assert.assertNotNull(charset64);
        org.junit.Assert.assertTrue("'" + boolean65 + "' != '" + false + "'", boolean65 == false);
        org.junit.Assert.assertTrue("'" + escapeMode66 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode66.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertNotNull(outputSettings68);
        org.junit.Assert.assertNotNull(charset72);
        org.junit.Assert.assertTrue("'" + boolean73 + "' != '" + false + "'", boolean73 == false);
    }

    @Test
    public void test16054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16054");
        org.jsoup.nodes.Document.OutputSettings outputSettings0 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Document.OutputSettings outputSettings2 = outputSettings0.indentAmount((int) 'a');
        java.nio.charset.CharsetEncoder charsetEncoder3 = outputSettings2.charsetEncoder;
        outputSettings2.forceAllElementAsBlock = false;
        org.jsoup.nodes.Document.OutputSettings outputSettings6 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Document.OutputSettings outputSettings8 = outputSettings6.indentAmount((int) 'a');
        java.nio.charset.Charset charset9 = outputSettings6.getcharset();
        boolean boolean10 = outputSettings6.prettyPrint;
        java.nio.charset.CharsetEncoder charsetEncoder11 = outputSettings6.charsetEncoder;
        org.jsoup.nodes.Entities.EscapeMode escapeMode12 = outputSettings6.escapeMode;
        outputSettings2.setescapeMode(escapeMode12);
        boolean boolean14 = outputSettings2.getprettyPrint();
        org.junit.Assert.assertNotNull(outputSettings2);
        org.junit.Assert.assertNotNull(charsetEncoder3);
        org.junit.Assert.assertNotNull(outputSettings8);
        org.junit.Assert.assertNotNull(charset9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(charsetEncoder11);
        org.junit.Assert.assertTrue("'" + escapeMode12 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode12.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
    }

    @Test
    public void test16055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16055");
        org.jsoup.nodes.TextNode textNode0 = new org.jsoup.nodes.TextNode();
        textNode0.setBaseUri("#text");
        textNode0.settext("#text");
        java.lang.String str6 = textNode0.absUrl("hi!");
        textNode0.setBaseUri("hi!");
        org.jsoup.nodes.Node node9 = textNode0.clone();
        java.lang.String str10 = textNode0.text();
        org.jsoup.nodes.Node node11 = textNode0.parent();
        java.lang.String str12 = textNode0.text;
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(node9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "#text" + "'", str10, "#text");
        org.junit.Assert.assertNull(node11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "#text" + "'", str12, "#text");
    }

    @Test
    public void test16056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16056");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("", "hi!");
        java.lang.String str3 = textNode2.text;
        java.lang.String str4 = textNode2.outerHtml();
        java.lang.String str5 = textNode2.getTEXT_KEY();
        java.lang.String str6 = textNode2.nodeName();
        org.jsoup.nodes.Attributes attributes7 = textNode2.attributes();
        java.lang.String str8 = textNode2.toString();
        java.lang.String str10 = textNode2.absUrl("text");
        java.lang.String str11 = textNode2.getWholeText();
        org.jsoup.nodes.TextNode textNode14 = new org.jsoup.nodes.TextNode("", "hi!");
        java.lang.String str15 = textNode14.text;
        java.lang.String str16 = textNode14.outerHtml();
        java.lang.String str17 = textNode14.getTEXT_KEY();
        java.lang.String str18 = textNode14.nodeName();
        boolean boolean20 = textNode14.equals((java.lang.Object) (short) 1);
        java.lang.String str21 = textNode14.text();
        org.jsoup.nodes.Node node22 = textNode14.previousSibling();
        org.jsoup.nodes.Node node23 = textNode14.previousSibling();
        org.jsoup.nodes.TextNode textNode25 = textNode14.text("#text");
        boolean boolean27 = textNode25.hasAttr("");
        org.jsoup.nodes.Document.OutputSettings outputSettings28 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Document.OutputSettings outputSettings30 = outputSettings28.indentAmount((int) 'a');
        org.jsoup.nodes.Entities.EscapeMode escapeMode31 = outputSettings30.escapeMode;
        java.nio.charset.Charset charset32 = outputSettings30.charset();
        outputSettings30.setindentAmount(0);
        org.jsoup.nodes.Entities.EscapeMode escapeMode35 = outputSettings30.escapeMode;
        org.jsoup.nodes.Document.OutputSettings outputSettings37 = outputSettings30.indentAmount((int) (byte) 10);
        outputSettings37.setprettyPrint(false);
        boolean boolean40 = textNode25.equals((java.lang.Object) false);
        java.lang.String str41 = textNode25.toString();
        java.lang.StringBuilder stringBuilder42 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings44 = new org.jsoup.nodes.Document.OutputSettings();
        boolean boolean45 = outputSettings44.prettyPrint;
        org.jsoup.nodes.Document.OutputSettings outputSettings46 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Document.OutputSettings outputSettings48 = outputSettings46.indentAmount((int) 'a');
        org.jsoup.nodes.Entities.EscapeMode escapeMode49 = outputSettings48.escapeMode;
        java.nio.charset.Charset charset50 = outputSettings48.charset();
        org.jsoup.nodes.Document.OutputSettings outputSettings51 = outputSettings44.charset(charset50);
        boolean boolean52 = outputSettings51.getforceAllElementAsBlock();
        boolean boolean53 = outputSettings51.prettyPrint();
        boolean boolean54 = outputSettings51.prettyPrint;
        org.jsoup.nodes.Entities.EscapeMode escapeMode55 = outputSettings51.getescapeMode();
        org.jsoup.nodes.Document.OutputSettings outputSettings56 = new org.jsoup.nodes.Document.OutputSettings();
        boolean boolean57 = outputSettings56.prettyPrint;
        org.jsoup.nodes.Document.OutputSettings outputSettings58 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Document.OutputSettings outputSettings60 = outputSettings58.indentAmount((int) 'a');
        org.jsoup.nodes.Entities.EscapeMode escapeMode61 = outputSettings60.escapeMode;
        java.nio.charset.Charset charset62 = outputSettings60.charset();
        org.jsoup.nodes.Document.OutputSettings outputSettings63 = outputSettings60.clone();
        outputSettings60.forceAllElementAsBlock = true;
        org.jsoup.nodes.Entities.EscapeMode escapeMode66 = outputSettings60.escapeMode;
        org.jsoup.nodes.Document.OutputSettings outputSettings67 = outputSettings56.escapeMode(escapeMode66);
        int int68 = outputSettings67.indentAmount();
        org.jsoup.nodes.Document.OutputSettings outputSettings69 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Document.OutputSettings outputSettings71 = outputSettings69.indentAmount((int) 'a');
        org.jsoup.nodes.Entities.EscapeMode escapeMode72 = outputSettings71.escapeMode;
        java.nio.charset.Charset charset73 = outputSettings71.charset();
        org.jsoup.nodes.Document.OutputSettings outputSettings74 = outputSettings71.clone();
        outputSettings71.forceAllElementAsBlock = true;
        org.jsoup.nodes.Entities.EscapeMode escapeMode77 = outputSettings71.escapeMode;
        int int78 = outputSettings71.getindentAmount();
        org.jsoup.nodes.Document.OutputSettings outputSettings80 = outputSettings71.prettyPrint(false);
        java.nio.charset.Charset charset81 = outputSettings71.charset();
        boolean boolean82 = outputSettings71.prettyPrint;
        org.jsoup.nodes.Entities.EscapeMode escapeMode83 = outputSettings71.escapeMode;
        outputSettings67.escapeMode = escapeMode83;
        org.jsoup.nodes.Document.OutputSettings outputSettings85 = outputSettings51.escapeMode(escapeMode83);
        outputSettings51.setindentAmount((int) '#');
        boolean boolean88 = outputSettings51.prettyPrint;
        textNode25.outerHtmlTail(stringBuilder42, (int) (byte) -1, outputSettings51);
        boolean boolean90 = textNode2.equals((java.lang.Object) textNode25);
        org.jsoup.nodes.Node node91 = textNode2.nextSibling();
        java.lang.String str92 = textNode2.text;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node93 = textNode2.unwrap();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "text" + "'", str5, "text");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "#text" + "'", str6, "#text");
        org.junit.Assert.assertNotNull(attributes7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "text" + "'", str17, "text");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "#text" + "'", str18, "#text");
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertNull(node22);
        org.junit.Assert.assertNull(node23);
        org.junit.Assert.assertNotNull(textNode25);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNotNull(outputSettings30);
        org.junit.Assert.assertTrue("'" + escapeMode31 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode31.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertNotNull(charset32);
        org.junit.Assert.assertTrue("'" + escapeMode35 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode35.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertNotNull(outputSettings37);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "#text" + "'", str41, "#text");
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + true + "'", boolean45 == true);
        org.junit.Assert.assertNotNull(outputSettings48);
        org.junit.Assert.assertTrue("'" + escapeMode49 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode49.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertNotNull(charset50);
        org.junit.Assert.assertNotNull(outputSettings51);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + true + "'", boolean53 == true);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + true + "'", boolean54 == true);
        org.junit.Assert.assertTrue("'" + escapeMode55 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode55.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + true + "'", boolean57 == true);
        org.junit.Assert.assertNotNull(outputSettings60);
        org.junit.Assert.assertTrue("'" + escapeMode61 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode61.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertNotNull(charset62);
        org.junit.Assert.assertNotNull(outputSettings63);
        org.junit.Assert.assertTrue("'" + escapeMode66 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode66.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertNotNull(outputSettings67);
        org.junit.Assert.assertTrue("'" + int68 + "' != '" + 1 + "'", int68 == 1);
        org.junit.Assert.assertNotNull(outputSettings71);
        org.junit.Assert.assertTrue("'" + escapeMode72 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode72.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertNotNull(charset73);
        org.junit.Assert.assertNotNull(outputSettings74);
        org.junit.Assert.assertTrue("'" + escapeMode77 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode77.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertTrue("'" + int78 + "' != '" + 97 + "'", int78 == 97);
        org.junit.Assert.assertNotNull(outputSettings80);
        org.junit.Assert.assertNotNull(charset81);
        org.junit.Assert.assertTrue("'" + boolean82 + "' != '" + false + "'", boolean82 == false);
        org.junit.Assert.assertTrue("'" + escapeMode83 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode83.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertNotNull(outputSettings85);
        org.junit.Assert.assertTrue("'" + boolean88 + "' != '" + true + "'", boolean88 == true);
        org.junit.Assert.assertTrue("'" + boolean90 + "' != '" + false + "'", boolean90 == false);
        org.junit.Assert.assertNull(node91);
        org.junit.Assert.assertEquals("'" + str92 + "' != '" + "" + "'", str92, "");
    }

    @Test
    public void test16057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16057");
        org.jsoup.nodes.Document.OutputSettings outputSettings0 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Document.OutputSettings outputSettings2 = outputSettings0.indentAmount((int) 'a');
        org.jsoup.nodes.Entities.EscapeMode escapeMode3 = outputSettings2.escapeMode;
        java.nio.charset.Charset charset4 = outputSettings2.charset();
        org.jsoup.nodes.Document.OutputSettings outputSettings5 = outputSettings2.clone();
        outputSettings5.setindentAmount((int) (short) 10);
        outputSettings5.setindentAmount(97);
        org.jsoup.nodes.TextNode textNode12 = new org.jsoup.nodes.TextNode("", "hi!");
        java.lang.String str13 = textNode12.text;
        java.lang.String str14 = textNode12.outerHtml();
        java.lang.String str15 = textNode12.getTEXT_KEY();
        java.lang.String str16 = textNode12.text;
        java.lang.Object obj17 = null;
        boolean boolean18 = textNode12.equals(obj17);
        java.lang.String str19 = textNode12.getWholeText();
        java.util.List<org.jsoup.nodes.Node> nodeList20 = textNode12.childNodes();
        org.jsoup.nodes.Document.OutputSettings outputSettings21 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Document.OutputSettings outputSettings23 = outputSettings21.indentAmount((int) 'a');
        java.nio.charset.Charset charset24 = outputSettings21.getcharset();
        boolean boolean25 = outputSettings21.prettyPrint();
        boolean boolean26 = outputSettings21.forceAllElementAsBlock;
        org.jsoup.nodes.Document.OutputSettings outputSettings27 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Document.OutputSettings outputSettings29 = outputSettings27.indentAmount((int) 'a');
        org.jsoup.nodes.Entities.EscapeMode escapeMode30 = outputSettings29.escapeMode;
        outputSettings29.setindentAmount((int) '4');
        org.jsoup.nodes.Document.OutputSettings outputSettings33 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Document.OutputSettings outputSettings35 = outputSettings33.indentAmount((int) 'a');
        org.jsoup.nodes.Entities.EscapeMode escapeMode36 = outputSettings35.escapeMode;
        java.nio.charset.Charset charset37 = outputSettings35.charset();
        outputSettings29.setcharset(charset37);
        org.jsoup.nodes.Document.OutputSettings outputSettings39 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Document.OutputSettings outputSettings41 = outputSettings39.indentAmount((int) 'a');
        org.jsoup.nodes.Entities.EscapeMode escapeMode42 = outputSettings41.escapeMode;
        java.nio.charset.Charset charset43 = outputSettings41.charset();
        org.jsoup.nodes.Entities.EscapeMode escapeMode44 = outputSettings41.escapeMode;
        boolean boolean45 = outputSettings41.prettyPrint;
        org.jsoup.nodes.Document.OutputSettings outputSettings46 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Document.OutputSettings outputSettings48 = outputSettings46.indentAmount((int) 'a');
        org.jsoup.nodes.Entities.EscapeMode escapeMode49 = outputSettings48.escapeMode;
        org.jsoup.nodes.Document.OutputSettings outputSettings50 = outputSettings41.escapeMode(escapeMode49);
        org.jsoup.nodes.Document.OutputSettings outputSettings51 = outputSettings29.escapeMode(escapeMode49);
        outputSettings21.setescapeMode(escapeMode49);
        boolean boolean53 = textNode12.equals((java.lang.Object) escapeMode49);
        outputSettings5.setescapeMode(escapeMode49);
        org.jsoup.nodes.Document.OutputSettings outputSettings55 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Document.OutputSettings outputSettings57 = outputSettings55.indentAmount((int) 'a');
        org.jsoup.nodes.Document.OutputSettings outputSettings58 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Document.OutputSettings outputSettings60 = outputSettings58.indentAmount((int) 'a');
        org.jsoup.nodes.Entities.EscapeMode escapeMode61 = outputSettings60.escapeMode;
        java.nio.charset.Charset charset62 = outputSettings60.charset();
        outputSettings60.setindentAmount(0);
        org.jsoup.nodes.Entities.EscapeMode escapeMode65 = outputSettings60.escapeMode;
        outputSettings57.setescapeMode(escapeMode65);
        outputSettings5.escapeMode = escapeMode65;
        java.nio.charset.CharsetEncoder charsetEncoder68 = outputSettings5.charsetEncoder;
        outputSettings5.setforceAllElementAsBlock(false);
        java.nio.charset.Charset charset71 = outputSettings5.charset();
        org.junit.Assert.assertNotNull(outputSettings2);
        org.junit.Assert.assertTrue("'" + escapeMode3 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode3.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertNotNull(charset4);
        org.junit.Assert.assertNotNull(outputSettings5);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "text" + "'", str15, "text");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertNotNull(nodeList20);
        org.junit.Assert.assertNotNull(outputSettings23);
        org.junit.Assert.assertNotNull(charset24);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNotNull(outputSettings29);
        org.junit.Assert.assertTrue("'" + escapeMode30 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode30.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertNotNull(outputSettings35);
        org.junit.Assert.assertTrue("'" + escapeMode36 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode36.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertNotNull(charset37);
        org.junit.Assert.assertNotNull(outputSettings41);
        org.junit.Assert.assertTrue("'" + escapeMode42 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode42.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertNotNull(charset43);
        org.junit.Assert.assertTrue("'" + escapeMode44 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode44.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + true + "'", boolean45 == true);
        org.junit.Assert.assertNotNull(outputSettings48);
        org.junit.Assert.assertTrue("'" + escapeMode49 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode49.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertNotNull(outputSettings50);
        org.junit.Assert.assertNotNull(outputSettings51);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + false + "'", boolean53 == false);
        org.junit.Assert.assertNotNull(outputSettings57);
        org.junit.Assert.assertNotNull(outputSettings60);
        org.junit.Assert.assertTrue("'" + escapeMode61 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode61.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertNotNull(charset62);
        org.junit.Assert.assertTrue("'" + escapeMode65 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode65.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertNotNull(charsetEncoder68);
        org.junit.Assert.assertNotNull(charset71);
    }

    @Test
    public void test16058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16058");
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
        java.util.List<org.jsoup.nodes.Node> nodeList15 = textNode2.siblingNodes();
        java.lang.String str16 = textNode2.text();
        java.lang.String str17 = textNode2.getTEXT_KEY();
        java.lang.String str18 = textNode2.text();
        org.jsoup.nodes.TextNode textNode20 = textNode2.text("hi!");
        java.lang.String str21 = textNode20.gettext();
        boolean boolean22 = textNode20.isBlank();
        java.util.List<org.jsoup.nodes.Node> nodeList23 = textNode20.siblingNodes();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "text" + "'", str5, "text");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "#text" + "'", str6, "#text");
        org.junit.Assert.assertNotNull(attributes7);
        org.junit.Assert.assertNotNull(nodeList8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "#text" + "'", str11, "#text");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertNotNull(nodeList15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "text" + "'", str17, "text");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertNotNull(textNode20);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "hi!" + "'", str21, "hi!");
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(nodeList23);
    }

    @Test
    public void test16059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16059");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("", "hi!");
        java.lang.String str3 = textNode2.text;
        java.lang.String str4 = textNode2.outerHtml();
        java.lang.String str5 = textNode2.getTEXT_KEY();
        java.lang.String str6 = textNode2.text;
        java.lang.Object obj7 = null;
        boolean boolean8 = textNode2.equals(obj7);
        java.lang.String str9 = textNode2.getWholeText();
        java.util.List<org.jsoup.nodes.Node> nodeList10 = textNode2.childNodes();
        org.jsoup.nodes.Document.OutputSettings outputSettings11 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Document.OutputSettings outputSettings13 = outputSettings11.indentAmount((int) 'a');
        java.nio.charset.Charset charset14 = outputSettings11.getcharset();
        boolean boolean15 = outputSettings11.prettyPrint();
        boolean boolean16 = outputSettings11.forceAllElementAsBlock;
        org.jsoup.nodes.Document.OutputSettings outputSettings17 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Document.OutputSettings outputSettings19 = outputSettings17.indentAmount((int) 'a');
        org.jsoup.nodes.Entities.EscapeMode escapeMode20 = outputSettings19.escapeMode;
        outputSettings19.setindentAmount((int) '4');
        org.jsoup.nodes.Document.OutputSettings outputSettings23 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Document.OutputSettings outputSettings25 = outputSettings23.indentAmount((int) 'a');
        org.jsoup.nodes.Entities.EscapeMode escapeMode26 = outputSettings25.escapeMode;
        java.nio.charset.Charset charset27 = outputSettings25.charset();
        outputSettings19.setcharset(charset27);
        org.jsoup.nodes.Document.OutputSettings outputSettings29 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Document.OutputSettings outputSettings31 = outputSettings29.indentAmount((int) 'a');
        org.jsoup.nodes.Entities.EscapeMode escapeMode32 = outputSettings31.escapeMode;
        java.nio.charset.Charset charset33 = outputSettings31.charset();
        org.jsoup.nodes.Entities.EscapeMode escapeMode34 = outputSettings31.escapeMode;
        boolean boolean35 = outputSettings31.prettyPrint;
        org.jsoup.nodes.Document.OutputSettings outputSettings36 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Document.OutputSettings outputSettings38 = outputSettings36.indentAmount((int) 'a');
        org.jsoup.nodes.Entities.EscapeMode escapeMode39 = outputSettings38.escapeMode;
        org.jsoup.nodes.Document.OutputSettings outputSettings40 = outputSettings31.escapeMode(escapeMode39);
        org.jsoup.nodes.Document.OutputSettings outputSettings41 = outputSettings19.escapeMode(escapeMode39);
        outputSettings11.setescapeMode(escapeMode39);
        boolean boolean43 = textNode2.equals((java.lang.Object) escapeMode39);
        textNode2.settext("hi!");
        java.lang.String str47 = textNode2.attr("");
        java.lang.String str48 = textNode2.getTEXT_KEY();
        int int49 = textNode2.siblingIndex();
        org.jsoup.nodes.Node node50 = textNode2.parent();
        org.jsoup.nodes.Node node51 = textNode2.nextSibling();
        java.lang.String str52 = textNode2.text;
        org.jsoup.nodes.Attributes attributes53 = textNode2.attributes();
        int int54 = textNode2.siblingIndex();
        java.util.List<org.jsoup.nodes.Node> nodeList55 = textNode2.childNodes();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "text" + "'", str5, "text");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNotNull(nodeList10);
        org.junit.Assert.assertNotNull(outputSettings13);
        org.junit.Assert.assertNotNull(charset14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(outputSettings19);
        org.junit.Assert.assertTrue("'" + escapeMode20 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode20.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertNotNull(outputSettings25);
        org.junit.Assert.assertTrue("'" + escapeMode26 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode26.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertNotNull(charset27);
        org.junit.Assert.assertNotNull(outputSettings31);
        org.junit.Assert.assertTrue("'" + escapeMode32 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode32.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertNotNull(charset33);
        org.junit.Assert.assertTrue("'" + escapeMode34 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode34.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + true + "'", boolean35 == true);
        org.junit.Assert.assertNotNull(outputSettings38);
        org.junit.Assert.assertTrue("'" + escapeMode39 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode39.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertNotNull(outputSettings40);
        org.junit.Assert.assertNotNull(outputSettings41);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertEquals("'" + str47 + "' != '" + "" + "'", str47, "");
        org.junit.Assert.assertEquals("'" + str48 + "' != '" + "text" + "'", str48, "text");
        org.junit.Assert.assertTrue("'" + int49 + "' != '" + 0 + "'", int49 == 0);
        org.junit.Assert.assertNull(node50);
        org.junit.Assert.assertNull(node51);
        org.junit.Assert.assertEquals("'" + str52 + "' != '" + "hi!" + "'", str52, "hi!");
        org.junit.Assert.assertNotNull(attributes53);
        org.junit.Assert.assertTrue("'" + int54 + "' != '" + 0 + "'", int54 == 0);
        org.junit.Assert.assertNotNull(nodeList55);
    }

    @Test
    public void test16060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16060");
        org.jsoup.nodes.TextNode textNode0 = new org.jsoup.nodes.TextNode();
        textNode0.setBaseUri("#text");
        org.jsoup.nodes.Node node3 = textNode0.nextSibling();
        textNode0.text = "text";
        java.util.List<org.jsoup.nodes.Node> nodeList6 = textNode0.siblingNodes();
        java.lang.String str7 = textNode0.getWholeText();
        boolean boolean9 = textNode0.hasAttr("text");
        int int10 = textNode0.siblingIndex();
        int int11 = textNode0.siblingIndex();
        org.jsoup.nodes.Node node12 = textNode0.clone();
        org.junit.Assert.assertNull(node3);
        org.junit.Assert.assertNotNull(nodeList6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "text" + "'", str7, "text");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNotNull(node12);
    }

    @Test
    public void test16061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16061");
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
        boolean boolean22 = outputSettings20.forceAllElementAsBlock;
        org.jsoup.nodes.Document.OutputSettings outputSettings23 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Document.OutputSettings outputSettings25 = outputSettings23.indentAmount((int) 'a');
        org.jsoup.nodes.Entities.EscapeMode escapeMode26 = outputSettings25.escapeMode;
        java.nio.charset.Charset charset27 = outputSettings25.charset();
        org.jsoup.nodes.Document.OutputSettings outputSettings28 = outputSettings25.clone();
        boolean boolean29 = outputSettings28.getprettyPrint();
        java.nio.charset.CharsetEncoder charsetEncoder30 = outputSettings28.getcharsetEncoder();
        org.jsoup.nodes.Document.OutputSettings outputSettings31 = outputSettings28.clone();
        org.jsoup.nodes.Entities.EscapeMode escapeMode32 = outputSettings31.escapeMode;
        outputSettings31.setprettyPrint(false);
        org.jsoup.nodes.Document.OutputSettings outputSettings35 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Document.OutputSettings outputSettings37 = outputSettings35.indentAmount((int) 'a');
        org.jsoup.nodes.Entities.EscapeMode escapeMode38 = outputSettings37.escapeMode;
        java.nio.charset.Charset charset39 = outputSettings37.charset();
        org.jsoup.nodes.Entities.EscapeMode escapeMode40 = outputSettings37.escapeMode;
        boolean boolean41 = outputSettings37.prettyPrint;
        org.jsoup.nodes.Entities.EscapeMode escapeMode42 = outputSettings37.getescapeMode();
        org.jsoup.nodes.Document.OutputSettings outputSettings43 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Document.OutputSettings outputSettings45 = outputSettings43.indentAmount((int) 'a');
        org.jsoup.nodes.Entities.EscapeMode escapeMode46 = outputSettings45.escapeMode;
        java.nio.charset.Charset charset47 = outputSettings45.charset();
        org.jsoup.nodes.Entities.EscapeMode escapeMode48 = outputSettings45.escapeMode;
        int int49 = outputSettings45.indentAmount;
        java.nio.charset.CharsetEncoder charsetEncoder50 = outputSettings45.encoder();
        outputSettings37.charsetEncoder = charsetEncoder50;
        outputSettings31.charsetEncoder = charsetEncoder50;
        outputSettings20.charsetEncoder = charsetEncoder50;
        org.jsoup.nodes.Document.OutputSettings outputSettings55 = outputSettings20.prettyPrint(true);
        org.jsoup.nodes.Entities.EscapeMode escapeMode56 = outputSettings55.getescapeMode();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "text" + "'", str5, "text");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "#text" + "'", str6, "#text");
        org.junit.Assert.assertNotNull(nodeList9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertNotNull(nodeList11);
        org.junit.Assert.assertNotNull(outputSettings14);
        org.junit.Assert.assertTrue("'" + escapeMode15 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode15.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertNotNull(charset16);
        org.junit.Assert.assertNotNull(outputSettings17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertNotNull(charsetEncoder19);
        org.junit.Assert.assertNotNull(outputSettings20);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(outputSettings25);
        org.junit.Assert.assertTrue("'" + escapeMode26 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode26.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertNotNull(charset27);
        org.junit.Assert.assertNotNull(outputSettings28);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertNotNull(charsetEncoder30);
        org.junit.Assert.assertNotNull(outputSettings31);
        org.junit.Assert.assertTrue("'" + escapeMode32 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode32.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertNotNull(outputSettings37);
        org.junit.Assert.assertTrue("'" + escapeMode38 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode38.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertNotNull(charset39);
        org.junit.Assert.assertTrue("'" + escapeMode40 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode40.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + true + "'", boolean41 == true);
        org.junit.Assert.assertTrue("'" + escapeMode42 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode42.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertNotNull(outputSettings45);
        org.junit.Assert.assertTrue("'" + escapeMode46 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode46.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertNotNull(charset47);
        org.junit.Assert.assertTrue("'" + escapeMode48 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode48.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertTrue("'" + int49 + "' != '" + 97 + "'", int49 == 97);
        org.junit.Assert.assertNotNull(charsetEncoder50);
        org.junit.Assert.assertNotNull(outputSettings55);
        org.junit.Assert.assertTrue("'" + escapeMode56 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode56.equals(org.jsoup.nodes.Entities.EscapeMode.base));
    }

    @Test
    public void test16062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16062");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("", "hi!");
        java.lang.String str3 = textNode2.text;
        java.lang.String str4 = textNode2.outerHtml();
        java.lang.String str5 = textNode2.getTEXT_KEY();
        java.lang.String str6 = textNode2.text;
        java.lang.Object obj7 = null;
        boolean boolean8 = textNode2.equals(obj7);
        org.jsoup.nodes.TextNode textNode10 = textNode2.text("hi!");
        java.lang.String str11 = textNode10.nodeName();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "text" + "'", str5, "text");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(textNode10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "#text" + "'", str11, "#text");
    }

    @Test
    public void test16063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16063");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("", "hi!");
        java.lang.String str3 = textNode2.text;
        java.lang.String str4 = textNode2.outerHtml();
        java.lang.String str5 = textNode2.getTEXT_KEY();
        java.lang.String str6 = textNode2.nodeName();
        textNode2.settext("#text");
        java.util.List<org.jsoup.nodes.Node> nodeList9 = textNode2.siblingNodes();
        java.lang.String str10 = textNode2.nodeName();
        java.lang.String str11 = textNode2.baseUri();
        java.lang.String str12 = textNode2.getWholeText();
        org.jsoup.nodes.TextNode textNode14 = textNode2.text("text");
        java.util.List<org.jsoup.nodes.Node> nodeList15 = textNode14.childNodes();
        textNode14.text = "t";
        java.lang.String str18 = textNode14.baseUri();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "text" + "'", str5, "text");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "#text" + "'", str6, "#text");
        org.junit.Assert.assertNotNull(nodeList9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "#text" + "'", str10, "#text");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "#text" + "'", str12, "#text");
        org.junit.Assert.assertNotNull(textNode14);
        org.junit.Assert.assertNotNull(nodeList15);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!" + "'", str18, "hi!");
    }

    @Test
    public void test16064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16064");
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
        java.lang.String str22 = textNode2.text;
        java.lang.String str23 = textNode2.nodeName();
        org.jsoup.nodes.TextNode textNode25 = textNode2.splitText(0);
        java.lang.String str27 = textNode2.absUrl("#text");
        textNode2.ensureAttributes();
        java.lang.String str29 = textNode2.nodeName();
        java.lang.StringBuilder stringBuilder30 = null;
        org.jsoup.nodes.TextNode textNode34 = new org.jsoup.nodes.TextNode("", "hi!");
        java.lang.String str35 = textNode34.text;
        java.lang.String str36 = textNode34.outerHtml();
        java.lang.String str37 = textNode34.getTEXT_KEY();
        java.lang.String str38 = textNode34.nodeName();
        boolean boolean40 = textNode34.equals((java.lang.Object) (short) 1);
        textNode34.setBaseUri("#text");
        org.jsoup.nodes.Node node43 = textNode34.parent();
        java.lang.String str44 = textNode34.getWholeText();
        java.util.List<org.jsoup.nodes.Node> nodeList45 = textNode34.siblingNodes();
        textNode34.setBaseUri("#");
        java.lang.StringBuilder stringBuilder48 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings50 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Document.OutputSettings outputSettings52 = outputSettings50.indentAmount((int) 'a');
        org.jsoup.nodes.Entities.EscapeMode escapeMode53 = outputSettings52.escapeMode;
        java.nio.charset.Charset charset54 = outputSettings52.charset();
        org.jsoup.nodes.Document.OutputSettings outputSettings55 = outputSettings52.clone();
        java.nio.charset.Charset charset56 = outputSettings52.charset;
        org.jsoup.nodes.Document.OutputSettings outputSettings57 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Document.OutputSettings outputSettings59 = outputSettings57.indentAmount((int) 'a');
        java.nio.charset.Charset charset60 = outputSettings57.getcharset();
        boolean boolean61 = outputSettings57.prettyPrint();
        boolean boolean62 = outputSettings57.forceAllElementAsBlock;
        org.jsoup.nodes.Document.OutputSettings outputSettings63 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Document.OutputSettings outputSettings65 = outputSettings63.indentAmount((int) 'a');
        org.jsoup.nodes.Entities.EscapeMode escapeMode66 = outputSettings65.escapeMode;
        outputSettings65.setindentAmount((int) '4');
        org.jsoup.nodes.Document.OutputSettings outputSettings69 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Document.OutputSettings outputSettings71 = outputSettings69.indentAmount((int) 'a');
        org.jsoup.nodes.Entities.EscapeMode escapeMode72 = outputSettings71.escapeMode;
        java.nio.charset.Charset charset73 = outputSettings71.charset();
        outputSettings65.setcharset(charset73);
        org.jsoup.nodes.Document.OutputSettings outputSettings75 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Document.OutputSettings outputSettings77 = outputSettings75.indentAmount((int) 'a');
        org.jsoup.nodes.Entities.EscapeMode escapeMode78 = outputSettings77.escapeMode;
        java.nio.charset.Charset charset79 = outputSettings77.charset();
        org.jsoup.nodes.Entities.EscapeMode escapeMode80 = outputSettings77.escapeMode;
        boolean boolean81 = outputSettings77.prettyPrint;
        org.jsoup.nodes.Document.OutputSettings outputSettings82 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Document.OutputSettings outputSettings84 = outputSettings82.indentAmount((int) 'a');
        org.jsoup.nodes.Entities.EscapeMode escapeMode85 = outputSettings84.escapeMode;
        org.jsoup.nodes.Document.OutputSettings outputSettings86 = outputSettings77.escapeMode(escapeMode85);
        org.jsoup.nodes.Document.OutputSettings outputSettings87 = outputSettings65.escapeMode(escapeMode85);
        outputSettings57.setescapeMode(escapeMode85);
        outputSettings52.escapeMode = escapeMode85;
        java.nio.charset.Charset charset90 = outputSettings52.charset();
        textNode34.outerHtmlTail(stringBuilder48, (int) ' ', outputSettings52);
        textNode2.outerHtmlTail(stringBuilder30, (int) (byte) 100, outputSettings52);
        java.lang.String str93 = textNode2.outerHtml();
        java.util.List<org.jsoup.nodes.Node> nodeList94 = textNode2.childNodes();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "text" + "'", str5, "text");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "#text" + "'", str6, "#text");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(nodeList14);
        org.junit.Assert.assertNull(document17);
        org.junit.Assert.assertNotNull(attributes18);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "text" + "'", str19, "text");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "#text" + "'", str21, "#text");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "text" + "'", str22, "text");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "#text" + "'", str23, "#text");
        org.junit.Assert.assertNotNull(textNode25);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "" + "'", str27, "");
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "#text" + "'", str29, "#text");
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "" + "'", str35, "");
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "" + "'", str36, "");
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "text" + "'", str37, "text");
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "#text" + "'", str38, "#text");
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertNull(node43);
        org.junit.Assert.assertEquals("'" + str44 + "' != '" + "" + "'", str44, "");
        org.junit.Assert.assertNotNull(nodeList45);
        org.junit.Assert.assertNotNull(outputSettings52);
        org.junit.Assert.assertTrue("'" + escapeMode53 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode53.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertNotNull(charset54);
        org.junit.Assert.assertNotNull(outputSettings55);
        org.junit.Assert.assertNotNull(charset56);
        org.junit.Assert.assertNotNull(outputSettings59);
        org.junit.Assert.assertNotNull(charset60);
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + true + "'", boolean61 == true);
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + false + "'", boolean62 == false);
        org.junit.Assert.assertNotNull(outputSettings65);
        org.junit.Assert.assertTrue("'" + escapeMode66 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode66.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertNotNull(outputSettings71);
        org.junit.Assert.assertTrue("'" + escapeMode72 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode72.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertNotNull(charset73);
        org.junit.Assert.assertNotNull(outputSettings77);
        org.junit.Assert.assertTrue("'" + escapeMode78 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode78.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertNotNull(charset79);
        org.junit.Assert.assertTrue("'" + escapeMode80 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode80.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertTrue("'" + boolean81 + "' != '" + true + "'", boolean81 == true);
        org.junit.Assert.assertNotNull(outputSettings84);
        org.junit.Assert.assertTrue("'" + escapeMode85 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode85.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertNotNull(outputSettings86);
        org.junit.Assert.assertNotNull(outputSettings87);
        org.junit.Assert.assertNotNull(charset90);
        org.junit.Assert.assertEquals("'" + str93 + "' != '" + "" + "'", str93, "");
        org.junit.Assert.assertNotNull(nodeList94);
    }

    @Test
    public void test16065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16065");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("#text", "#text");
        java.util.List<org.jsoup.nodes.Node> nodeList3 = textNode2.childNodes();
        java.lang.StringBuilder stringBuilder4 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings6 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Document.OutputSettings outputSettings8 = outputSettings6.indentAmount((int) 'a');
        org.jsoup.nodes.Entities.EscapeMode escapeMode9 = outputSettings8.escapeMode;
        outputSettings8.setindentAmount((int) '4');
        org.jsoup.nodes.Document.OutputSettings outputSettings12 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Document.OutputSettings outputSettings14 = outputSettings12.indentAmount((int) 'a');
        org.jsoup.nodes.Entities.EscapeMode escapeMode15 = outputSettings14.escapeMode;
        java.nio.charset.Charset charset16 = outputSettings14.charset();
        outputSettings8.setcharset(charset16);
        org.jsoup.nodes.Document.OutputSettings outputSettings18 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Document.OutputSettings outputSettings20 = outputSettings18.indentAmount((int) 'a');
        org.jsoup.nodes.Entities.EscapeMode escapeMode21 = outputSettings20.escapeMode;
        java.nio.charset.Charset charset22 = outputSettings20.charset();
        org.jsoup.nodes.Entities.EscapeMode escapeMode23 = outputSettings20.escapeMode;
        boolean boolean24 = outputSettings20.prettyPrint;
        org.jsoup.nodes.Document.OutputSettings outputSettings25 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Document.OutputSettings outputSettings27 = outputSettings25.indentAmount((int) 'a');
        org.jsoup.nodes.Entities.EscapeMode escapeMode28 = outputSettings27.escapeMode;
        org.jsoup.nodes.Document.OutputSettings outputSettings29 = outputSettings20.escapeMode(escapeMode28);
        org.jsoup.nodes.Document.OutputSettings outputSettings30 = outputSettings8.escapeMode(escapeMode28);
        boolean boolean31 = outputSettings30.getforceAllElementAsBlock();
        textNode2.outerHtmlTail(stringBuilder4, (int) (short) 100, outputSettings30);
        org.jsoup.nodes.Document.OutputSettings outputSettings33 = new org.jsoup.nodes.Document.OutputSettings();
        boolean boolean34 = outputSettings33.prettyPrint;
        org.jsoup.nodes.Document.OutputSettings outputSettings35 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Document.OutputSettings outputSettings37 = outputSettings35.indentAmount((int) 'a');
        org.jsoup.nodes.Entities.EscapeMode escapeMode38 = outputSettings37.escapeMode;
        java.nio.charset.Charset charset39 = outputSettings37.charset();
        org.jsoup.nodes.Document.OutputSettings outputSettings40 = outputSettings33.charset(charset39);
        boolean boolean41 = outputSettings40.getforceAllElementAsBlock();
        boolean boolean42 = outputSettings40.forceAllElementAsBlock();
        org.jsoup.nodes.Document.OutputSettings outputSettings43 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Document.OutputSettings outputSettings45 = outputSettings43.indentAmount((int) 'a');
        org.jsoup.nodes.Document.OutputSettings outputSettings46 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Document.OutputSettings outputSettings48 = outputSettings46.indentAmount((int) 'a');
        org.jsoup.nodes.Entities.EscapeMode escapeMode49 = outputSettings48.escapeMode;
        java.nio.charset.Charset charset50 = outputSettings48.charset();
        outputSettings48.setindentAmount(0);
        org.jsoup.nodes.Entities.EscapeMode escapeMode53 = outputSettings48.escapeMode;
        outputSettings45.setescapeMode(escapeMode53);
        outputSettings40.setescapeMode(escapeMode53);
        org.jsoup.nodes.Document.OutputSettings outputSettings56 = outputSettings30.escapeMode(escapeMode53);
        outputSettings56.setindentAmount((int) (byte) 10);
        boolean boolean59 = outputSettings56.prettyPrint();
        org.junit.Assert.assertNotNull(nodeList3);
        org.junit.Assert.assertNotNull(outputSettings8);
        org.junit.Assert.assertTrue("'" + escapeMode9 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode9.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertNotNull(outputSettings14);
        org.junit.Assert.assertTrue("'" + escapeMode15 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode15.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertNotNull(charset16);
        org.junit.Assert.assertNotNull(outputSettings20);
        org.junit.Assert.assertTrue("'" + escapeMode21 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode21.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertNotNull(charset22);
        org.junit.Assert.assertTrue("'" + escapeMode23 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode23.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertNotNull(outputSettings27);
        org.junit.Assert.assertTrue("'" + escapeMode28 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode28.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertNotNull(outputSettings29);
        org.junit.Assert.assertNotNull(outputSettings30);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + true + "'", boolean34 == true);
        org.junit.Assert.assertNotNull(outputSettings37);
        org.junit.Assert.assertTrue("'" + escapeMode38 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode38.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertNotNull(charset39);
        org.junit.Assert.assertNotNull(outputSettings40);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertNotNull(outputSettings45);
        org.junit.Assert.assertNotNull(outputSettings48);
        org.junit.Assert.assertTrue("'" + escapeMode49 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode49.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertNotNull(charset50);
        org.junit.Assert.assertTrue("'" + escapeMode53 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode53.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertNotNull(outputSettings56);
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + true + "'", boolean59 == true);
    }

    @Test
    public void test16066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16066");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("", "hi!");
        java.lang.String str3 = textNode2.text;
        java.lang.String str4 = textNode2.outerHtml();
        textNode2.text = "text";
        textNode2.ensureAttributes();
        org.jsoup.nodes.Node node10 = textNode2.attr("text", "text");
        java.lang.String str11 = textNode2.outerHtml();
        org.jsoup.nodes.Document document12 = textNode2.ownerDocument();
        // The following exception was thrown during execution in test generation
        try {
            document12.remove();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(node10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "text" + "'", str11, "text");
        org.junit.Assert.assertNull(document12);
    }

    @Test
    public void test16067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16067");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("", "hi!");
        java.lang.String str3 = textNode2.text;
        java.lang.String str4 = textNode2.outerHtml();
        textNode2.setBaseUri("hi!");
        org.jsoup.nodes.Node node7 = textNode2.previousSibling();
        org.jsoup.nodes.TextNode textNode9 = textNode2.text("text");
        org.jsoup.nodes.Node node10 = textNode2.nextSibling();
        java.lang.String str11 = textNode2.getWholeText();
        java.lang.String str12 = textNode2.gettext();
        org.jsoup.nodes.Node node13 = textNode2.previousSibling();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass14 = node13.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNull(node7);
        org.junit.Assert.assertNotNull(textNode9);
        org.junit.Assert.assertNull(node10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "text" + "'", str11, "text");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "text" + "'", str12, "text");
        org.junit.Assert.assertNull(node13);
    }

    @Test
    public void test16068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16068");
        org.jsoup.nodes.Document.OutputSettings outputSettings0 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Document.OutputSettings outputSettings2 = outputSettings0.indentAmount((int) 'a');
        outputSettings2.prettyPrint = false;
        int int5 = outputSettings2.indentAmount;
        org.jsoup.nodes.Document.OutputSettings outputSettings7 = outputSettings2.forceAllElementAsBlock(false);
        outputSettings2.forceAllElementAsBlock = true;
        org.jsoup.nodes.Document.OutputSettings outputSettings11 = outputSettings2.prettyPrint(true);
        org.jsoup.nodes.Document.OutputSettings outputSettings13 = outputSettings2.prettyPrint(false);
        org.jsoup.nodes.Document.OutputSettings outputSettings14 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Document.OutputSettings outputSettings16 = outputSettings14.indentAmount((int) 'a');
        org.jsoup.nodes.Entities.EscapeMode escapeMode17 = outputSettings16.escapeMode;
        outputSettings16.setindentAmount((int) '4');
        org.jsoup.nodes.Document.OutputSettings outputSettings20 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Document.OutputSettings outputSettings22 = outputSettings20.indentAmount((int) 'a');
        org.jsoup.nodes.Entities.EscapeMode escapeMode23 = outputSettings22.escapeMode;
        java.nio.charset.Charset charset24 = outputSettings22.charset();
        outputSettings16.setcharset(charset24);
        org.jsoup.nodes.Document.OutputSettings outputSettings26 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Document.OutputSettings outputSettings28 = outputSettings26.indentAmount((int) 'a');
        org.jsoup.nodes.Entities.EscapeMode escapeMode29 = outputSettings28.escapeMode;
        java.nio.charset.Charset charset30 = outputSettings28.charset();
        org.jsoup.nodes.Entities.EscapeMode escapeMode31 = outputSettings28.escapeMode;
        boolean boolean32 = outputSettings28.prettyPrint;
        org.jsoup.nodes.Document.OutputSettings outputSettings33 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Document.OutputSettings outputSettings35 = outputSettings33.indentAmount((int) 'a');
        org.jsoup.nodes.Entities.EscapeMode escapeMode36 = outputSettings35.escapeMode;
        org.jsoup.nodes.Document.OutputSettings outputSettings37 = outputSettings28.escapeMode(escapeMode36);
        org.jsoup.nodes.Document.OutputSettings outputSettings38 = outputSettings16.escapeMode(escapeMode36);
        outputSettings2.setescapeMode(escapeMode36);
        org.jsoup.nodes.Document.OutputSettings outputSettings40 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Document.OutputSettings outputSettings42 = outputSettings40.indentAmount((int) 'a');
        org.jsoup.nodes.Entities.EscapeMode escapeMode43 = outputSettings42.escapeMode;
        java.nio.charset.Charset charset44 = outputSettings42.charset();
        org.jsoup.nodes.Entities.EscapeMode escapeMode45 = outputSettings42.escapeMode;
        boolean boolean46 = outputSettings42.prettyPrint;
        boolean boolean47 = outputSettings42.forceAllElementAsBlock;
        boolean boolean48 = outputSettings42.getforceAllElementAsBlock();
        boolean boolean49 = outputSettings42.getprettyPrint();
        boolean boolean50 = outputSettings42.getprettyPrint();
        outputSettings42.prettyPrint = true;
        java.nio.charset.Charset charset53 = outputSettings42.charset;
        org.jsoup.nodes.Document.OutputSettings outputSettings54 = outputSettings2.charset(charset53);
        boolean boolean55 = outputSettings2.prettyPrint();
        org.junit.Assert.assertNotNull(outputSettings2);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 97 + "'", int5 == 97);
        org.junit.Assert.assertNotNull(outputSettings7);
        org.junit.Assert.assertNotNull(outputSettings11);
        org.junit.Assert.assertNotNull(outputSettings13);
        org.junit.Assert.assertNotNull(outputSettings16);
        org.junit.Assert.assertTrue("'" + escapeMode17 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode17.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertNotNull(outputSettings22);
        org.junit.Assert.assertTrue("'" + escapeMode23 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode23.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertNotNull(charset24);
        org.junit.Assert.assertNotNull(outputSettings28);
        org.junit.Assert.assertTrue("'" + escapeMode29 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode29.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertNotNull(charset30);
        org.junit.Assert.assertTrue("'" + escapeMode31 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode31.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + true + "'", boolean32 == true);
        org.junit.Assert.assertNotNull(outputSettings35);
        org.junit.Assert.assertTrue("'" + escapeMode36 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode36.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertNotNull(outputSettings37);
        org.junit.Assert.assertNotNull(outputSettings38);
        org.junit.Assert.assertNotNull(outputSettings42);
        org.junit.Assert.assertTrue("'" + escapeMode43 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode43.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertNotNull(charset44);
        org.junit.Assert.assertTrue("'" + escapeMode45 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode45.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + true + "'", boolean46 == true);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + true + "'", boolean49 == true);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + true + "'", boolean50 == true);
        org.junit.Assert.assertNotNull(charset53);
        org.junit.Assert.assertNotNull(outputSettings54);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + false + "'", boolean55 == false);
    }

    @Test
    public void test16069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16069");
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
        java.lang.StringBuilder stringBuilder12 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings14 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Document.OutputSettings outputSettings16 = outputSettings14.indentAmount((int) 'a');
        outputSettings16.prettyPrint = false;
        int int19 = outputSettings16.indentAmount;
        java.nio.charset.Charset charset20 = outputSettings16.charset;
        org.jsoup.nodes.Document.OutputSettings outputSettings21 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Document.OutputSettings outputSettings23 = outputSettings21.indentAmount((int) 'a');
        org.jsoup.nodes.Document.OutputSettings outputSettings24 = outputSettings21.clone();
        outputSettings21.forceAllElementAsBlock = false;
        org.jsoup.nodes.Entities.EscapeMode escapeMode27 = outputSettings21.escapeMode;
        org.jsoup.nodes.Document.OutputSettings outputSettings28 = outputSettings16.escapeMode(escapeMode27);
        textNode2.outerHtmlTail(stringBuilder12, (int) (byte) 100, outputSettings16);
        textNode2.setBaseUri("#text");
        java.lang.String str32 = textNode2.getWholeText();
        org.jsoup.nodes.Node node33 = textNode2.parent();
        java.lang.String str34 = textNode2.text;
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "text" + "'", str5, "text");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "#text" + "'", str6, "#text");
        org.junit.Assert.assertNotNull(attributes7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNotNull(outputSettings16);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 97 + "'", int19 == 97);
        org.junit.Assert.assertNotNull(charset20);
        org.junit.Assert.assertNotNull(outputSettings23);
        org.junit.Assert.assertNotNull(outputSettings24);
        org.junit.Assert.assertTrue("'" + escapeMode27 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode27.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertNotNull(outputSettings28);
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "" + "'", str32, "");
        org.junit.Assert.assertNull(node33);
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "" + "'", str34, "");
    }

    @Test
    public void test16070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16070");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("", "hi!");
        java.lang.String str3 = textNode2.text;
        java.lang.String str4 = textNode2.outerHtml();
        java.lang.String str5 = textNode2.getTEXT_KEY();
        java.lang.String str6 = textNode2.nodeName();
        org.jsoup.nodes.Attributes attributes7 = textNode2.attributes();
        java.lang.String str8 = textNode2.text();
        java.lang.String str9 = textNode2.toString();
        java.lang.String str10 = textNode2.getWholeText();
        java.lang.StringBuilder stringBuilder11 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings13 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Document.OutputSettings outputSettings15 = outputSettings13.indentAmount((int) 'a');
        org.jsoup.nodes.Entities.EscapeMode escapeMode16 = outputSettings15.escapeMode;
        java.nio.charset.Charset charset17 = outputSettings15.charset();
        org.jsoup.nodes.Entities.EscapeMode escapeMode18 = outputSettings15.escapeMode;
        boolean boolean19 = outputSettings15.prettyPrint;
        org.jsoup.nodes.Document.OutputSettings outputSettings20 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Document.OutputSettings outputSettings22 = outputSettings20.indentAmount((int) 'a');
        org.jsoup.nodes.Entities.EscapeMode escapeMode23 = outputSettings22.escapeMode;
        outputSettings15.setescapeMode(escapeMode23);
        org.jsoup.nodes.Document.OutputSettings outputSettings25 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Document.OutputSettings outputSettings27 = outputSettings25.indentAmount((int) 'a');
        org.jsoup.nodes.Entities.EscapeMode escapeMode28 = outputSettings27.escapeMode;
        java.nio.charset.Charset charset29 = outputSettings27.charset();
        org.jsoup.nodes.Entities.EscapeMode escapeMode30 = outputSettings27.escapeMode;
        boolean boolean31 = outputSettings27.prettyPrint;
        boolean boolean32 = outputSettings27.forceAllElementAsBlock;
        boolean boolean33 = outputSettings27.getforceAllElementAsBlock();
        boolean boolean34 = outputSettings27.getprettyPrint();
        boolean boolean35 = outputSettings27.forceAllElementAsBlock();
        outputSettings27.forceAllElementAsBlock = false;
        org.jsoup.nodes.Entities.EscapeMode escapeMode38 = outputSettings27.escapeMode();
        org.jsoup.nodes.Document.OutputSettings outputSettings39 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Document.OutputSettings outputSettings41 = outputSettings39.indentAmount((int) 'a');
        org.jsoup.nodes.Entities.EscapeMode escapeMode42 = outputSettings41.escapeMode;
        java.nio.charset.Charset charset43 = outputSettings41.charset();
        org.jsoup.nodes.Document.OutputSettings outputSettings44 = outputSettings41.clone();
        outputSettings41.forceAllElementAsBlock = true;
        org.jsoup.nodes.Entities.EscapeMode escapeMode47 = outputSettings41.escapeMode;
        org.jsoup.nodes.Document.OutputSettings outputSettings48 = new org.jsoup.nodes.Document.OutputSettings();
        boolean boolean49 = outputSettings48.prettyPrint;
        org.jsoup.nodes.Document.OutputSettings outputSettings50 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Document.OutputSettings outputSettings52 = outputSettings50.indentAmount((int) 'a');
        org.jsoup.nodes.Entities.EscapeMode escapeMode53 = outputSettings52.escapeMode;
        java.nio.charset.Charset charset54 = outputSettings52.charset();
        org.jsoup.nodes.Document.OutputSettings outputSettings55 = outputSettings48.charset(charset54);
        outputSettings41.charset = charset54;
        outputSettings27.setcharset(charset54);
        org.jsoup.nodes.Document.OutputSettings outputSettings58 = outputSettings15.charset(charset54);
        outputSettings15.setprettyPrint(false);
        textNode2.outerHtmlTail(stringBuilder11, (int) 'a', outputSettings15);
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node63 = textNode2.removeAttr("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: String must not be empty");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "text" + "'", str5, "text");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "#text" + "'", str6, "#text");
        org.junit.Assert.assertNotNull(attributes7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNotNull(outputSettings15);
        org.junit.Assert.assertTrue("'" + escapeMode16 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode16.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertNotNull(charset17);
        org.junit.Assert.assertTrue("'" + escapeMode18 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode18.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertNotNull(outputSettings22);
        org.junit.Assert.assertTrue("'" + escapeMode23 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode23.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertNotNull(outputSettings27);
        org.junit.Assert.assertTrue("'" + escapeMode28 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode28.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertNotNull(charset29);
        org.junit.Assert.assertTrue("'" + escapeMode30 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode30.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + true + "'", boolean31 == true);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + true + "'", boolean34 == true);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertTrue("'" + escapeMode38 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode38.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertNotNull(outputSettings41);
        org.junit.Assert.assertTrue("'" + escapeMode42 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode42.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertNotNull(charset43);
        org.junit.Assert.assertNotNull(outputSettings44);
        org.junit.Assert.assertTrue("'" + escapeMode47 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode47.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + true + "'", boolean49 == true);
        org.junit.Assert.assertNotNull(outputSettings52);
        org.junit.Assert.assertTrue("'" + escapeMode53 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode53.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertNotNull(charset54);
        org.junit.Assert.assertNotNull(outputSettings55);
        org.junit.Assert.assertNotNull(outputSettings58);
    }

    @Test
    public void test16071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16071");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("#text", "#text");
        boolean boolean3 = textNode2.isBlank();
        org.jsoup.nodes.TextNode textNode5 = textNode2.text("text");
        textNode5.ensureAttributes();
        org.jsoup.nodes.Attributes attributes7 = textNode5.attributes();
        java.lang.String str9 = textNode5.attr("");
        org.jsoup.nodes.Document document10 = textNode5.ownerDocument();
        boolean boolean12 = textNode5.hasAttr("#");
        java.lang.String str13 = textNode5.text;
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(textNode5);
        org.junit.Assert.assertNotNull(attributes7);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNull(document10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "text" + "'", str13, "text");
    }

    @Test
    public void test16072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16072");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("", "hi!");
        java.lang.String str3 = textNode2.text;
        java.lang.String str4 = textNode2.outerHtml();
        java.lang.String str5 = textNode2.getTEXT_KEY();
        java.lang.String str6 = textNode2.nodeName();
        boolean boolean7 = textNode2.isBlank();
        java.lang.String str8 = textNode2.toString();
        java.lang.String str9 = textNode2.text();
        java.lang.StringBuilder stringBuilder10 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings12 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Document.OutputSettings outputSettings14 = outputSettings12.indentAmount((int) 'a');
        org.jsoup.nodes.Entities.EscapeMode escapeMode15 = outputSettings14.escapeMode;
        java.nio.charset.Charset charset16 = outputSettings14.charset();
        org.jsoup.nodes.Document.OutputSettings outputSettings17 = outputSettings14.clone();
        boolean boolean18 = outputSettings17.getprettyPrint();
        org.jsoup.nodes.Entities.EscapeMode escapeMode19 = outputSettings17.escapeMode;
        org.jsoup.nodes.Document.OutputSettings outputSettings20 = outputSettings17.clone();
        textNode2.outerHtmlTail(stringBuilder10, (int) ' ', outputSettings20);
        textNode2.settext("#");
        org.jsoup.nodes.Node node24 = textNode2.parent();
        java.lang.String str26 = textNode2.attr("text");
        org.jsoup.nodes.Document document27 = textNode2.ownerDocument();
        java.lang.String str29 = textNode2.attr("h");
        java.lang.String str30 = textNode2.nodeName();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "text" + "'", str5, "text");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "#text" + "'", str6, "#text");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNotNull(outputSettings14);
        org.junit.Assert.assertTrue("'" + escapeMode15 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode15.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertNotNull(charset16);
        org.junit.Assert.assertNotNull(outputSettings17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + escapeMode19 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode19.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertNotNull(outputSettings20);
        org.junit.Assert.assertNull(node24);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "#" + "'", str26, "#");
        org.junit.Assert.assertNull(document27);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "" + "'", str29, "");
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "#text" + "'", str30, "#text");
    }

    @Test
    public void test16073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16073");
        org.jsoup.nodes.Document.OutputSettings outputSettings0 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Document.OutputSettings outputSettings2 = outputSettings0.indentAmount((int) 'a');
        org.jsoup.nodes.Entities.EscapeMode escapeMode3 = outputSettings2.escapeMode;
        java.nio.charset.Charset charset4 = outputSettings2.charset();
        org.jsoup.nodes.Entities.EscapeMode escapeMode5 = outputSettings2.escapeMode;
        boolean boolean6 = outputSettings2.prettyPrint;
        boolean boolean7 = outputSettings2.forceAllElementAsBlock;
        boolean boolean8 = outputSettings2.getforceAllElementAsBlock();
        boolean boolean9 = outputSettings2.getprettyPrint();
        boolean boolean10 = outputSettings2.forceAllElementAsBlock();
        outputSettings2.forceAllElementAsBlock = false;
        org.jsoup.nodes.Entities.EscapeMode escapeMode13 = outputSettings2.escapeMode();
        boolean boolean14 = outputSettings2.forceAllElementAsBlock;
        org.jsoup.nodes.Document.OutputSettings outputSettings16 = outputSettings2.prettyPrint(false);
        org.jsoup.nodes.Document.OutputSettings outputSettings17 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Document.OutputSettings outputSettings19 = outputSettings17.indentAmount((int) 'a');
        org.jsoup.nodes.Entities.EscapeMode escapeMode20 = outputSettings19.escapeMode;
        java.nio.charset.Charset charset21 = outputSettings19.charset();
        org.jsoup.nodes.Document.OutputSettings outputSettings22 = outputSettings19.clone();
        boolean boolean23 = outputSettings22.getprettyPrint();
        org.jsoup.nodes.Entities.EscapeMode escapeMode24 = outputSettings22.escapeMode;
        org.jsoup.nodes.Document.OutputSettings outputSettings25 = outputSettings22.clone();
        org.jsoup.nodes.Entities.EscapeMode escapeMode26 = outputSettings25.escapeMode;
        outputSettings25.setprettyPrint(false);
        org.jsoup.nodes.Entities.EscapeMode escapeMode29 = outputSettings25.getescapeMode();
        outputSettings16.escapeMode = escapeMode29;
        outputSettings16.setindentAmount((int) (short) -1);
        java.nio.charset.CharsetEncoder charsetEncoder33 = outputSettings16.encoder();
        int int34 = outputSettings16.indentAmount();
        boolean boolean35 = outputSettings16.prettyPrint();
        org.jsoup.nodes.Document.OutputSettings outputSettings36 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Document.OutputSettings outputSettings38 = outputSettings36.indentAmount((int) 'a');
        org.jsoup.nodes.Entities.EscapeMode escapeMode39 = outputSettings38.escapeMode;
        outputSettings38.setindentAmount((int) '4');
        org.jsoup.nodes.Document.OutputSettings outputSettings42 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Document.OutputSettings outputSettings44 = outputSettings42.indentAmount((int) 'a');
        org.jsoup.nodes.Entities.EscapeMode escapeMode45 = outputSettings44.escapeMode;
        java.nio.charset.Charset charset46 = outputSettings44.charset();
        outputSettings38.setcharset(charset46);
        org.jsoup.nodes.Document.OutputSettings outputSettings48 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Document.OutputSettings outputSettings50 = outputSettings48.indentAmount((int) 'a');
        org.jsoup.nodes.Entities.EscapeMode escapeMode51 = outputSettings50.escapeMode;
        java.nio.charset.Charset charset52 = outputSettings50.charset();
        org.jsoup.nodes.Entities.EscapeMode escapeMode53 = outputSettings50.escapeMode;
        boolean boolean54 = outputSettings50.prettyPrint;
        org.jsoup.nodes.Document.OutputSettings outputSettings55 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Document.OutputSettings outputSettings57 = outputSettings55.indentAmount((int) 'a');
        org.jsoup.nodes.Entities.EscapeMode escapeMode58 = outputSettings57.escapeMode;
        org.jsoup.nodes.Document.OutputSettings outputSettings59 = outputSettings50.escapeMode(escapeMode58);
        org.jsoup.nodes.Document.OutputSettings outputSettings60 = outputSettings38.escapeMode(escapeMode58);
        org.jsoup.nodes.Entities.EscapeMode escapeMode61 = outputSettings38.escapeMode;
        org.jsoup.nodes.Document.OutputSettings outputSettings62 = outputSettings16.escapeMode(escapeMode61);
        org.junit.Assert.assertNotNull(outputSettings2);
        org.junit.Assert.assertTrue("'" + escapeMode3 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode3.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertNotNull(charset4);
        org.junit.Assert.assertTrue("'" + escapeMode5 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode5.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + escapeMode13 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode13.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(outputSettings16);
        org.junit.Assert.assertNotNull(outputSettings19);
        org.junit.Assert.assertTrue("'" + escapeMode20 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode20.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertNotNull(charset21);
        org.junit.Assert.assertNotNull(outputSettings22);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + escapeMode24 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode24.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertNotNull(outputSettings25);
        org.junit.Assert.assertTrue("'" + escapeMode26 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode26.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertTrue("'" + escapeMode29 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode29.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertNotNull(charsetEncoder33);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + (-1) + "'", int34 == (-1));
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertNotNull(outputSettings38);
        org.junit.Assert.assertTrue("'" + escapeMode39 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode39.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertNotNull(outputSettings44);
        org.junit.Assert.assertTrue("'" + escapeMode45 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode45.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertNotNull(charset46);
        org.junit.Assert.assertNotNull(outputSettings50);
        org.junit.Assert.assertTrue("'" + escapeMode51 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode51.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertNotNull(charset52);
        org.junit.Assert.assertTrue("'" + escapeMode53 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode53.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + true + "'", boolean54 == true);
        org.junit.Assert.assertNotNull(outputSettings57);
        org.junit.Assert.assertTrue("'" + escapeMode58 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode58.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertNotNull(outputSettings59);
        org.junit.Assert.assertNotNull(outputSettings60);
        org.junit.Assert.assertTrue("'" + escapeMode61 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode61.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertNotNull(outputSettings62);
    }

    @Test
    public void test16074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16074");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("", "hi!");
        java.lang.String str3 = textNode2.text;
        boolean boolean5 = textNode2.hasAttr("hi!");
        org.jsoup.nodes.Node node6 = textNode2.parent();
        textNode2.settext("hi!");
        org.jsoup.nodes.Document document9 = textNode2.ownerDocument();
        org.jsoup.nodes.Node node12 = textNode2.attr("hi!", "hi!");
        textNode2.settext("#text");
        textNode2.text = "";
        org.jsoup.nodes.TextNode textNode18 = textNode2.text("");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(node6);
        org.junit.Assert.assertNull(document9);
        org.junit.Assert.assertNotNull(node12);
        org.junit.Assert.assertNotNull(textNode18);
    }

    @Test
    public void test16075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16075");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("#text", "#text");
        int int3 = textNode2.siblingIndex();
        textNode2.text = "#";
        java.lang.StringBuilder stringBuilder6 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings8 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Document.OutputSettings outputSettings10 = outputSettings8.indentAmount((int) 'a');
        org.jsoup.nodes.Entities.EscapeMode escapeMode11 = outputSettings10.escapeMode;
        outputSettings10.setindentAmount((int) '4');
        org.jsoup.nodes.Document.OutputSettings outputSettings14 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Document.OutputSettings outputSettings16 = outputSettings14.indentAmount((int) 'a');
        org.jsoup.nodes.Entities.EscapeMode escapeMode17 = outputSettings16.escapeMode;
        java.nio.charset.Charset charset18 = outputSettings16.charset();
        outputSettings10.setcharset(charset18);
        org.jsoup.nodes.Document.OutputSettings outputSettings20 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Document.OutputSettings outputSettings22 = outputSettings20.indentAmount((int) 'a');
        org.jsoup.nodes.Entities.EscapeMode escapeMode23 = outputSettings22.escapeMode;
        java.nio.charset.Charset charset24 = outputSettings22.charset();
        org.jsoup.nodes.Entities.EscapeMode escapeMode25 = outputSettings22.escapeMode;
        boolean boolean26 = outputSettings22.prettyPrint;
        org.jsoup.nodes.Document.OutputSettings outputSettings27 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Document.OutputSettings outputSettings29 = outputSettings27.indentAmount((int) 'a');
        org.jsoup.nodes.Entities.EscapeMode escapeMode30 = outputSettings29.escapeMode;
        org.jsoup.nodes.Document.OutputSettings outputSettings31 = outputSettings22.escapeMode(escapeMode30);
        org.jsoup.nodes.Document.OutputSettings outputSettings32 = outputSettings10.escapeMode(escapeMode30);
        org.jsoup.nodes.Document.OutputSettings outputSettings34 = outputSettings32.forceAllElementAsBlock(false);
        java.nio.charset.Charset charset35 = outputSettings32.getcharset();
        textNode2.outerHtmlTail(stringBuilder6, (int) (byte) 100, outputSettings32);
        textNode2.settext("#text");
        org.jsoup.nodes.Node node39 = textNode2.parent();
        org.jsoup.nodes.Node node42 = textNode2.attr("hi!", "hi!");
        org.junit.Assert.assertNotNull(textNode2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(outputSettings10);
        org.junit.Assert.assertTrue("'" + escapeMode11 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode11.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertNotNull(outputSettings16);
        org.junit.Assert.assertTrue("'" + escapeMode17 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode17.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertNotNull(charset18);
        org.junit.Assert.assertNotNull(outputSettings22);
        org.junit.Assert.assertTrue("'" + escapeMode23 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode23.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertNotNull(charset24);
        org.junit.Assert.assertTrue("'" + escapeMode25 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode25.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertNotNull(outputSettings29);
        org.junit.Assert.assertTrue("'" + escapeMode30 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode30.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertNotNull(outputSettings31);
        org.junit.Assert.assertNotNull(outputSettings32);
        org.junit.Assert.assertNotNull(outputSettings34);
        org.junit.Assert.assertNotNull(charset35);
        org.junit.Assert.assertNull(node39);
        org.junit.Assert.assertNotNull(node42);
    }

    @Test
    public void test16076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16076");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("", "");
        java.lang.StringBuilder stringBuilder3 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings5 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Document.OutputSettings outputSettings7 = outputSettings5.indentAmount((int) 'a');
        org.jsoup.nodes.Entities.EscapeMode escapeMode8 = outputSettings7.escapeMode;
        java.nio.charset.Charset charset9 = outputSettings7.charset();
        org.jsoup.nodes.Document.OutputSettings outputSettings10 = outputSettings7.clone();
        outputSettings7.forceAllElementAsBlock = true;
        outputSettings7.setprettyPrint(true);
        org.jsoup.nodes.Document.OutputSettings outputSettings16 = outputSettings7.prettyPrint(true);
        org.jsoup.nodes.Entities.EscapeMode escapeMode17 = outputSettings16.escapeMode;
        textNode2.outerHtmlTail(stringBuilder3, (int) '4', outputSettings16);
        org.jsoup.nodes.Document.OutputSettings outputSettings20 = outputSettings16.prettyPrint(true);
        org.jsoup.nodes.Document.OutputSettings outputSettings21 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Document.OutputSettings outputSettings23 = outputSettings21.indentAmount((int) 'a');
        org.jsoup.nodes.Entities.EscapeMode escapeMode24 = outputSettings23.escapeMode;
        java.nio.charset.Charset charset25 = outputSettings23.charset;
        outputSettings23.setforceAllElementAsBlock(false);
        java.nio.charset.Charset charset28 = outputSettings23.getcharset();
        org.jsoup.nodes.Document.OutputSettings outputSettings29 = outputSettings16.charset(charset28);
        outputSettings29.forceAllElementAsBlock = false;
        org.jsoup.nodes.Document.OutputSettings outputSettings33 = outputSettings29.forceAllElementAsBlock(false);
        org.jsoup.nodes.Entities.EscapeMode escapeMode34 = outputSettings29.escapeMode();
        outputSettings29.forceAllElementAsBlock = true;
        java.nio.charset.Charset charset37 = outputSettings29.charset();
        org.jsoup.nodes.Entities.EscapeMode escapeMode38 = outputSettings29.escapeMode();
        org.junit.Assert.assertNotNull(outputSettings7);
        org.junit.Assert.assertTrue("'" + escapeMode8 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode8.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertNotNull(charset9);
        org.junit.Assert.assertNotNull(outputSettings10);
        org.junit.Assert.assertNotNull(outputSettings16);
        org.junit.Assert.assertTrue("'" + escapeMode17 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode17.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertNotNull(outputSettings20);
        org.junit.Assert.assertNotNull(outputSettings23);
        org.junit.Assert.assertTrue("'" + escapeMode24 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode24.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertNotNull(charset25);
        org.junit.Assert.assertNotNull(charset28);
        org.junit.Assert.assertNotNull(outputSettings29);
        org.junit.Assert.assertNotNull(outputSettings33);
        org.junit.Assert.assertTrue("'" + escapeMode34 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode34.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertNotNull(charset37);
        org.junit.Assert.assertTrue("'" + escapeMode38 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode38.equals(org.jsoup.nodes.Entities.EscapeMode.base));
    }

    @Test
    public void test16077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16077");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("", "hi!");
        java.lang.String str3 = textNode2.text;
        java.lang.String str4 = textNode2.outerHtml();
        java.lang.String str5 = textNode2.getTEXT_KEY();
        java.lang.String str6 = textNode2.nodeName();
        boolean boolean7 = textNode2.isBlank();
        java.lang.String str8 = textNode2.toString();
        boolean boolean9 = textNode2.isBlank();
        java.lang.String str10 = textNode2.getWholeText();
        org.jsoup.nodes.Node node11 = textNode2.clone();
        java.lang.String str12 = textNode2.gettext();
        java.lang.String str13 = textNode2.getTEXT_KEY();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "text" + "'", str5, "text");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "#text" + "'", str6, "#text");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNotNull(node11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "text" + "'", str13, "text");
    }

    @Test
    public void test16078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16078");
        org.jsoup.nodes.Document.OutputSettings outputSettings0 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Document.OutputSettings outputSettings2 = outputSettings0.indentAmount((int) 'a');
        java.nio.charset.Charset charset3 = outputSettings0.getcharset();
        boolean boolean4 = outputSettings0.prettyPrint();
        outputSettings0.forceAllElementAsBlock = false;
        java.nio.charset.CharsetEncoder charsetEncoder7 = outputSettings0.getcharsetEncoder();
        org.jsoup.nodes.Entities.EscapeMode escapeMode8 = outputSettings0.escapeMode;
        org.junit.Assert.assertNotNull(outputSettings2);
        org.junit.Assert.assertNotNull(charset3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(charsetEncoder7);
        org.junit.Assert.assertTrue("'" + escapeMode8 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode8.equals(org.jsoup.nodes.Entities.EscapeMode.base));
    }

    @Test
    public void test16079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16079");
        org.jsoup.nodes.Document.OutputSettings outputSettings0 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Document.OutputSettings outputSettings2 = outputSettings0.indentAmount((int) 'a');
        org.jsoup.nodes.Entities.EscapeMode escapeMode3 = outputSettings2.escapeMode;
        java.nio.charset.Charset charset4 = outputSettings2.charset();
        org.jsoup.nodes.Document.OutputSettings outputSettings5 = outputSettings2.clone();
        boolean boolean6 = outputSettings5.getprettyPrint();
        java.nio.charset.CharsetEncoder charsetEncoder7 = outputSettings5.getcharsetEncoder();
        org.jsoup.nodes.Document.OutputSettings outputSettings8 = outputSettings5.clone();
        org.jsoup.nodes.Document.OutputSettings outputSettings9 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Document.OutputSettings outputSettings11 = outputSettings9.indentAmount((int) 'a');
        org.jsoup.nodes.Entities.EscapeMode escapeMode12 = outputSettings11.escapeMode;
        java.nio.charset.Charset charset13 = outputSettings11.charset();
        org.jsoup.nodes.Document.OutputSettings outputSettings14 = outputSettings11.clone();
        java.nio.charset.Charset charset15 = outputSettings11.charset;
        outputSettings8.charset = charset15;
        org.jsoup.nodes.Document.OutputSettings outputSettings17 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Document.OutputSettings outputSettings19 = outputSettings17.indentAmount((int) 'a');
        org.jsoup.nodes.Entities.EscapeMode escapeMode20 = outputSettings19.escapeMode;
        outputSettings8.escapeMode = escapeMode20;
        java.nio.charset.Charset charset22 = outputSettings8.getcharset();
        org.jsoup.nodes.Document.OutputSettings outputSettings24 = outputSettings8.indentAmount((int) (byte) 0);
        org.jsoup.nodes.Document.OutputSettings outputSettings26 = outputSettings24.indentAmount(0);
        org.jsoup.nodes.Entities.EscapeMode escapeMode27 = null;
        outputSettings24.escapeMode = escapeMode27;
        boolean boolean29 = outputSettings24.forceAllElementAsBlock;
        org.jsoup.nodes.Entities.EscapeMode escapeMode30 = outputSettings24.getescapeMode();
        outputSettings24.indentAmount = (byte) 1;
        org.junit.Assert.assertNotNull(outputSettings2);
        org.junit.Assert.assertTrue("'" + escapeMode3 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode3.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertNotNull(charset4);
        org.junit.Assert.assertNotNull(outputSettings5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(charsetEncoder7);
        org.junit.Assert.assertNotNull(outputSettings8);
        org.junit.Assert.assertNotNull(outputSettings11);
        org.junit.Assert.assertTrue("'" + escapeMode12 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode12.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertNotNull(charset13);
        org.junit.Assert.assertNotNull(outputSettings14);
        org.junit.Assert.assertNotNull(charset15);
        org.junit.Assert.assertNotNull(outputSettings19);
        org.junit.Assert.assertTrue("'" + escapeMode20 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode20.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertNotNull(charset22);
        org.junit.Assert.assertNotNull(outputSettings24);
        org.junit.Assert.assertNotNull(outputSettings26);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertNull(escapeMode30);
    }

    @Test
    public void test16080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16080");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("#text", "#text");
        org.jsoup.nodes.Document document3 = textNode2.ownerDocument();
        org.jsoup.select.NodeVisitor nodeVisitor4 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node5 = textNode2.traverse(nodeVisitor4);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(textNode2);
        org.junit.Assert.assertNull(document3);
    }

    @Test
    public void test16081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16081");
        org.jsoup.nodes.Document.OutputSettings outputSettings0 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Document.OutputSettings outputSettings2 = outputSettings0.indentAmount((int) 'a');
        org.jsoup.nodes.Entities.EscapeMode escapeMode3 = outputSettings2.escapeMode;
        java.nio.charset.Charset charset4 = outputSettings2.charset();
        org.jsoup.nodes.Document.OutputSettings outputSettings5 = outputSettings2.clone();
        boolean boolean6 = outputSettings5.getprettyPrint();
        java.nio.charset.CharsetEncoder charsetEncoder7 = outputSettings5.getcharsetEncoder();
        org.jsoup.nodes.Document.OutputSettings outputSettings8 = outputSettings5.clone();
        boolean boolean9 = outputSettings8.getprettyPrint();
        org.jsoup.nodes.Document.OutputSettings outputSettings10 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Document.OutputSettings outputSettings12 = outputSettings10.indentAmount((int) 'a');
        org.jsoup.nodes.Entities.EscapeMode escapeMode13 = outputSettings12.escapeMode;
        java.nio.charset.Charset charset14 = outputSettings12.charset();
        org.jsoup.nodes.Document.OutputSettings outputSettings15 = outputSettings12.clone();
        outputSettings12.forceAllElementAsBlock = true;
        java.nio.charset.CharsetEncoder charsetEncoder18 = outputSettings12.getcharsetEncoder();
        org.jsoup.nodes.Document.OutputSettings outputSettings20 = outputSettings12.forceAllElementAsBlock(false);
        outputSettings20.setindentAmount((int) (byte) 10);
        org.jsoup.nodes.Document.OutputSettings outputSettings23 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Document.OutputSettings outputSettings25 = outputSettings23.indentAmount((int) 'a');
        org.jsoup.nodes.Entities.EscapeMode escapeMode26 = outputSettings25.escapeMode;
        java.nio.charset.Charset charset27 = outputSettings25.charset();
        org.jsoup.nodes.Entities.EscapeMode escapeMode28 = outputSettings25.escapeMode;
        boolean boolean29 = outputSettings25.prettyPrint;
        org.jsoup.nodes.Document.OutputSettings outputSettings30 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Document.OutputSettings outputSettings32 = outputSettings30.indentAmount((int) 'a');
        org.jsoup.nodes.Entities.EscapeMode escapeMode33 = outputSettings32.escapeMode;
        java.nio.charset.Charset charset34 = outputSettings32.charset();
        org.jsoup.nodes.Document.OutputSettings outputSettings35 = outputSettings32.clone();
        outputSettings32.forceAllElementAsBlock = true;
        org.jsoup.nodes.Entities.EscapeMode escapeMode38 = outputSettings32.escapeMode;
        org.jsoup.nodes.Document.OutputSettings outputSettings39 = outputSettings25.escapeMode(escapeMode38);
        boolean boolean40 = outputSettings25.prettyPrint();
        int int41 = outputSettings25.getindentAmount();
        org.jsoup.nodes.Entities.EscapeMode escapeMode42 = outputSettings25.escapeMode();
        outputSettings20.escapeMode = escapeMode42;
        org.jsoup.nodes.Document.OutputSettings outputSettings44 = outputSettings8.escapeMode(escapeMode42);
        org.jsoup.nodes.Document.OutputSettings outputSettings46 = outputSettings44.forceAllElementAsBlock(false);
        org.jsoup.nodes.Document.OutputSettings outputSettings47 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Document.OutputSettings outputSettings49 = outputSettings47.indentAmount((int) 'a');
        org.jsoup.nodes.Entities.EscapeMode escapeMode50 = outputSettings49.escapeMode;
        java.nio.charset.Charset charset51 = outputSettings49.charset();
        outputSettings49.setindentAmount(0);
        org.jsoup.nodes.Entities.EscapeMode escapeMode54 = outputSettings49.escapeMode;
        org.jsoup.nodes.Document.OutputSettings outputSettings56 = outputSettings49.indentAmount((int) (byte) 10);
        org.jsoup.nodes.Document.OutputSettings outputSettings58 = outputSettings56.prettyPrint(false);
        java.nio.charset.CharsetEncoder charsetEncoder59 = outputSettings58.encoder();
        java.nio.charset.CharsetEncoder charsetEncoder60 = outputSettings58.getcharsetEncoder();
        outputSettings44.setcharsetEncoder(charsetEncoder60);
        org.junit.Assert.assertNotNull(outputSettings2);
        org.junit.Assert.assertTrue("'" + escapeMode3 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode3.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertNotNull(charset4);
        org.junit.Assert.assertNotNull(outputSettings5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(charsetEncoder7);
        org.junit.Assert.assertNotNull(outputSettings8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(outputSettings12);
        org.junit.Assert.assertTrue("'" + escapeMode13 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode13.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertNotNull(charset14);
        org.junit.Assert.assertNotNull(outputSettings15);
        org.junit.Assert.assertNotNull(charsetEncoder18);
        org.junit.Assert.assertNotNull(outputSettings20);
        org.junit.Assert.assertNotNull(outputSettings25);
        org.junit.Assert.assertTrue("'" + escapeMode26 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode26.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertNotNull(charset27);
        org.junit.Assert.assertTrue("'" + escapeMode28 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode28.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertNotNull(outputSettings32);
        org.junit.Assert.assertTrue("'" + escapeMode33 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode33.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertNotNull(charset34);
        org.junit.Assert.assertNotNull(outputSettings35);
        org.junit.Assert.assertTrue("'" + escapeMode38 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode38.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertNotNull(outputSettings39);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + true + "'", boolean40 == true);
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 97 + "'", int41 == 97);
        org.junit.Assert.assertTrue("'" + escapeMode42 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode42.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertNotNull(outputSettings44);
        org.junit.Assert.assertNotNull(outputSettings46);
        org.junit.Assert.assertNotNull(outputSettings49);
        org.junit.Assert.assertTrue("'" + escapeMode50 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode50.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertNotNull(charset51);
        org.junit.Assert.assertTrue("'" + escapeMode54 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode54.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertNotNull(outputSettings56);
        org.junit.Assert.assertNotNull(outputSettings58);
        org.junit.Assert.assertNotNull(charsetEncoder59);
        org.junit.Assert.assertNotNull(charsetEncoder60);
    }

    @Test
    public void test16082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16082");
        org.jsoup.nodes.Document.OutputSettings outputSettings0 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Document.OutputSettings outputSettings2 = outputSettings0.indentAmount((int) 'a');
        org.jsoup.nodes.Entities.EscapeMode escapeMode3 = outputSettings2.escapeMode;
        java.nio.charset.Charset charset4 = outputSettings2.charset();
        org.jsoup.nodes.Entities.EscapeMode escapeMode5 = outputSettings2.escapeMode;
        boolean boolean6 = outputSettings2.prettyPrint;
        boolean boolean7 = outputSettings2.forceAllElementAsBlock;
        boolean boolean8 = outputSettings2.getforceAllElementAsBlock();
        boolean boolean9 = outputSettings2.getprettyPrint();
        boolean boolean10 = outputSettings2.forceAllElementAsBlock();
        outputSettings2.forceAllElementAsBlock = false;
        org.jsoup.nodes.Document.OutputSettings outputSettings13 = outputSettings2.clone();
        outputSettings13.setprettyPrint(false);
        outputSettings13.setforceAllElementAsBlock(true);
        java.nio.charset.Charset charset18 = outputSettings13.charset();
        int int19 = outputSettings13.indentAmount;
        org.junit.Assert.assertNotNull(outputSettings2);
        org.junit.Assert.assertTrue("'" + escapeMode3 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode3.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertNotNull(charset4);
        org.junit.Assert.assertTrue("'" + escapeMode5 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode5.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(outputSettings13);
        org.junit.Assert.assertNotNull(charset18);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 97 + "'", int19 == 97);
    }

    @Test
    public void test16083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16083");
        org.jsoup.nodes.Document.OutputSettings outputSettings0 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Document.OutputSettings outputSettings2 = outputSettings0.indentAmount((int) 'a');
        outputSettings2.prettyPrint = false;
        int int5 = outputSettings2.indentAmount;
        org.jsoup.nodes.Document.OutputSettings outputSettings7 = outputSettings2.forceAllElementAsBlock(false);
        outputSettings2.forceAllElementAsBlock = true;
        org.jsoup.nodes.Document.OutputSettings outputSettings11 = outputSettings2.prettyPrint(true);
        org.jsoup.nodes.Document.OutputSettings outputSettings13 = outputSettings2.prettyPrint(false);
        java.nio.charset.CharsetEncoder charsetEncoder14 = outputSettings2.getcharsetEncoder();
        java.nio.charset.Charset charset15 = outputSettings2.charset;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Document.OutputSettings outputSettings17 = outputSettings2.charset("t");
            org.junit.Assert.fail("Expected exception of type java.nio.charset.UnsupportedCharsetException; message: t");
        } catch (java.nio.charset.UnsupportedCharsetException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(outputSettings2);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 97 + "'", int5 == 97);
        org.junit.Assert.assertNotNull(outputSettings7);
        org.junit.Assert.assertNotNull(outputSettings11);
        org.junit.Assert.assertNotNull(outputSettings13);
        org.junit.Assert.assertNotNull(charsetEncoder14);
        org.junit.Assert.assertNotNull(charset15);
    }

    @Test
    public void test16084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16084");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("", "hi!");
        java.lang.String str3 = textNode2.text;
        java.lang.String str4 = textNode2.outerHtml();
        org.jsoup.nodes.Node node5 = textNode2.parent();
        org.jsoup.nodes.TextNode textNode7 = textNode2.text("ext");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.TextNode textNode9 = textNode7.splitText((int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Split offset must not be greater than current text length");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertNotNull(textNode7);
    }

    @Test
    public void test16085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16085");
        org.jsoup.nodes.Document.OutputSettings outputSettings0 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Document.OutputSettings outputSettings2 = outputSettings0.indentAmount((int) 'a');
        org.jsoup.nodes.Entities.EscapeMode escapeMode3 = outputSettings2.escapeMode;
        java.nio.charset.Charset charset4 = outputSettings2.charset();
        org.jsoup.nodes.Document.OutputSettings outputSettings5 = outputSettings2.clone();
        boolean boolean6 = outputSettings5.getprettyPrint();
        java.nio.charset.CharsetEncoder charsetEncoder7 = outputSettings5.getcharsetEncoder();
        org.jsoup.nodes.Document.OutputSettings outputSettings8 = outputSettings5.clone();
        org.jsoup.nodes.Entities.EscapeMode escapeMode9 = outputSettings8.escapeMode;
        outputSettings8.setprettyPrint(false);
        org.jsoup.nodes.Document.OutputSettings outputSettings12 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Document.OutputSettings outputSettings14 = outputSettings12.indentAmount((int) 'a');
        org.jsoup.nodes.Entities.EscapeMode escapeMode15 = outputSettings14.escapeMode;
        java.nio.charset.Charset charset16 = outputSettings14.charset();
        org.jsoup.nodes.Entities.EscapeMode escapeMode17 = outputSettings14.escapeMode;
        boolean boolean18 = outputSettings14.prettyPrint;
        org.jsoup.nodes.Entities.EscapeMode escapeMode19 = outputSettings14.getescapeMode();
        org.jsoup.nodes.Document.OutputSettings outputSettings20 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Document.OutputSettings outputSettings22 = outputSettings20.indentAmount((int) 'a');
        org.jsoup.nodes.Entities.EscapeMode escapeMode23 = outputSettings22.escapeMode;
        java.nio.charset.Charset charset24 = outputSettings22.charset();
        org.jsoup.nodes.Entities.EscapeMode escapeMode25 = outputSettings22.escapeMode;
        int int26 = outputSettings22.indentAmount;
        java.nio.charset.CharsetEncoder charsetEncoder27 = outputSettings22.encoder();
        outputSettings14.charsetEncoder = charsetEncoder27;
        outputSettings8.charsetEncoder = charsetEncoder27;
        boolean boolean30 = outputSettings8.forceAllElementAsBlock;
        int int31 = outputSettings8.indentAmount;
        org.jsoup.nodes.Document.OutputSettings outputSettings32 = new org.jsoup.nodes.Document.OutputSettings();
        boolean boolean33 = outputSettings32.prettyPrint;
        org.jsoup.nodes.Document.OutputSettings outputSettings34 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Document.OutputSettings outputSettings36 = outputSettings34.indentAmount((int) 'a');
        org.jsoup.nodes.Entities.EscapeMode escapeMode37 = outputSettings36.escapeMode;
        java.nio.charset.Charset charset38 = outputSettings36.charset();
        org.jsoup.nodes.Document.OutputSettings outputSettings39 = outputSettings32.charset(charset38);
        boolean boolean40 = outputSettings39.getforceAllElementAsBlock();
        org.jsoup.nodes.Document.OutputSettings outputSettings41 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Document.OutputSettings outputSettings43 = outputSettings41.indentAmount((int) 'a');
        org.jsoup.nodes.Document.OutputSettings outputSettings44 = outputSettings41.clone();
        boolean boolean45 = outputSettings41.getforceAllElementAsBlock();
        outputSettings41.prettyPrint = true;
        java.nio.charset.CharsetEncoder charsetEncoder48 = outputSettings41.getcharsetEncoder();
        java.nio.charset.CharsetEncoder charsetEncoder49 = outputSettings41.encoder();
        org.jsoup.nodes.Document.OutputSettings outputSettings50 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Document.OutputSettings outputSettings52 = outputSettings50.indentAmount((int) 'a');
        org.jsoup.nodes.Entities.EscapeMode escapeMode53 = outputSettings52.escapeMode;
        outputSettings52.setindentAmount((int) '4');
        org.jsoup.nodes.Document.OutputSettings outputSettings56 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Document.OutputSettings outputSettings58 = outputSettings56.indentAmount((int) 'a');
        org.jsoup.nodes.Entities.EscapeMode escapeMode59 = outputSettings58.escapeMode;
        java.nio.charset.Charset charset60 = outputSettings58.charset();
        outputSettings52.setcharset(charset60);
        org.jsoup.nodes.Document.OutputSettings outputSettings62 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Document.OutputSettings outputSettings64 = outputSettings62.indentAmount((int) 'a');
        org.jsoup.nodes.Entities.EscapeMode escapeMode65 = outputSettings64.escapeMode;
        java.nio.charset.Charset charset66 = outputSettings64.charset();
        org.jsoup.nodes.Entities.EscapeMode escapeMode67 = outputSettings64.escapeMode;
        boolean boolean68 = outputSettings64.prettyPrint;
        org.jsoup.nodes.Document.OutputSettings outputSettings69 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Document.OutputSettings outputSettings71 = outputSettings69.indentAmount((int) 'a');
        org.jsoup.nodes.Entities.EscapeMode escapeMode72 = outputSettings71.escapeMode;
        org.jsoup.nodes.Document.OutputSettings outputSettings73 = outputSettings64.escapeMode(escapeMode72);
        org.jsoup.nodes.Document.OutputSettings outputSettings74 = outputSettings52.escapeMode(escapeMode72);
        org.jsoup.nodes.Document.OutputSettings outputSettings75 = outputSettings41.escapeMode(escapeMode72);
        boolean boolean76 = outputSettings75.getforceAllElementAsBlock();
        org.jsoup.nodes.Document.OutputSettings outputSettings78 = outputSettings75.prettyPrint(true);
        outputSettings78.setprettyPrint(true);
        java.nio.charset.CharsetEncoder charsetEncoder81 = outputSettings78.getcharsetEncoder();
        java.nio.charset.Charset charset82 = outputSettings78.charset();
        org.jsoup.nodes.Document.OutputSettings outputSettings83 = outputSettings39.charset(charset82);
        org.jsoup.nodes.Document.OutputSettings outputSettings84 = outputSettings8.charset(charset82);
        java.nio.charset.Charset charset85 = outputSettings84.getcharset();
        java.nio.charset.CharsetEncoder charsetEncoder86 = outputSettings84.getcharsetEncoder();
        org.jsoup.nodes.Document.OutputSettings outputSettings87 = outputSettings84.clone();
        org.jsoup.nodes.Entities.EscapeMode escapeMode88 = outputSettings84.escapeMode();
        org.junit.Assert.assertNotNull(outputSettings2);
        org.junit.Assert.assertTrue("'" + escapeMode3 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode3.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertNotNull(charset4);
        org.junit.Assert.assertNotNull(outputSettings5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(charsetEncoder7);
        org.junit.Assert.assertNotNull(outputSettings8);
        org.junit.Assert.assertTrue("'" + escapeMode9 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode9.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertNotNull(outputSettings14);
        org.junit.Assert.assertTrue("'" + escapeMode15 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode15.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertNotNull(charset16);
        org.junit.Assert.assertTrue("'" + escapeMode17 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode17.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + escapeMode19 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode19.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertNotNull(outputSettings22);
        org.junit.Assert.assertTrue("'" + escapeMode23 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode23.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertNotNull(charset24);
        org.junit.Assert.assertTrue("'" + escapeMode25 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode25.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 97 + "'", int26 == 97);
        org.junit.Assert.assertNotNull(charsetEncoder27);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 97 + "'", int31 == 97);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + true + "'", boolean33 == true);
        org.junit.Assert.assertNotNull(outputSettings36);
        org.junit.Assert.assertTrue("'" + escapeMode37 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode37.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertNotNull(charset38);
        org.junit.Assert.assertNotNull(outputSettings39);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertNotNull(outputSettings43);
        org.junit.Assert.assertNotNull(outputSettings44);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertNotNull(charsetEncoder48);
        org.junit.Assert.assertNotNull(charsetEncoder49);
        org.junit.Assert.assertNotNull(outputSettings52);
        org.junit.Assert.assertTrue("'" + escapeMode53 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode53.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertNotNull(outputSettings58);
        org.junit.Assert.assertTrue("'" + escapeMode59 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode59.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertNotNull(charset60);
        org.junit.Assert.assertNotNull(outputSettings64);
        org.junit.Assert.assertTrue("'" + escapeMode65 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode65.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertNotNull(charset66);
        org.junit.Assert.assertTrue("'" + escapeMode67 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode67.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertTrue("'" + boolean68 + "' != '" + true + "'", boolean68 == true);
        org.junit.Assert.assertNotNull(outputSettings71);
        org.junit.Assert.assertTrue("'" + escapeMode72 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode72.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertNotNull(outputSettings73);
        org.junit.Assert.assertNotNull(outputSettings74);
        org.junit.Assert.assertNotNull(outputSettings75);
        org.junit.Assert.assertTrue("'" + boolean76 + "' != '" + false + "'", boolean76 == false);
        org.junit.Assert.assertNotNull(outputSettings78);
        org.junit.Assert.assertNotNull(charsetEncoder81);
        org.junit.Assert.assertNotNull(charset82);
        org.junit.Assert.assertNotNull(outputSettings83);
        org.junit.Assert.assertNotNull(outputSettings84);
        org.junit.Assert.assertNotNull(charset85);
        org.junit.Assert.assertNotNull(charsetEncoder86);
        org.junit.Assert.assertNotNull(outputSettings87);
        org.junit.Assert.assertTrue("'" + escapeMode88 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode88.equals(org.jsoup.nodes.Entities.EscapeMode.base));
    }

    @Test
    public void test16086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16086");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("", "hi!");
        java.lang.String str3 = textNode2.text;
        java.lang.String str4 = textNode2.outerHtml();
        java.lang.String str5 = textNode2.getTEXT_KEY();
        java.lang.String str6 = textNode2.nodeName();
        boolean boolean7 = textNode2.isBlank();
        java.lang.String str8 = textNode2.toString();
        java.lang.String str9 = textNode2.text();
        java.lang.StringBuilder stringBuilder10 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings12 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Document.OutputSettings outputSettings14 = outputSettings12.indentAmount((int) 'a');
        org.jsoup.nodes.Entities.EscapeMode escapeMode15 = outputSettings14.escapeMode;
        java.nio.charset.Charset charset16 = outputSettings14.charset();
        org.jsoup.nodes.Document.OutputSettings outputSettings17 = outputSettings14.clone();
        boolean boolean18 = outputSettings17.getprettyPrint();
        org.jsoup.nodes.Entities.EscapeMode escapeMode19 = outputSettings17.escapeMode;
        org.jsoup.nodes.Document.OutputSettings outputSettings20 = outputSettings17.clone();
        textNode2.outerHtmlTail(stringBuilder10, (int) ' ', outputSettings20);
        textNode2.settext("#");
        org.jsoup.nodes.Node node24 = textNode2.parent();
        org.jsoup.nodes.TextNode textNode26 = textNode2.text("text");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node28 = textNode2.after("ext");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "text" + "'", str5, "text");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "#text" + "'", str6, "#text");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNotNull(outputSettings14);
        org.junit.Assert.assertTrue("'" + escapeMode15 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode15.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertNotNull(charset16);
        org.junit.Assert.assertNotNull(outputSettings17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + escapeMode19 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode19.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertNotNull(outputSettings20);
        org.junit.Assert.assertNull(node24);
        org.junit.Assert.assertNotNull(textNode26);
    }

    @Test
    public void test16087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16087");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("", "hi!");
        java.lang.String str3 = textNode2.text;
        java.lang.String str4 = textNode2.outerHtml();
        java.lang.String str5 = textNode2.getTEXT_KEY();
        java.lang.String str6 = textNode2.text;
        java.lang.String str7 = textNode2.gettext();
        java.lang.String str9 = textNode2.attr("#text");
        java.lang.String str10 = textNode2.text;
        java.util.List<org.jsoup.nodes.Node> nodeList11 = textNode2.childNodes();
        java.lang.String str12 = textNode2.text;
        java.lang.String str13 = textNode2.text;
        org.jsoup.nodes.Node node14 = textNode2.nextSibling();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "text" + "'", str5, "text");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNotNull(nodeList11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNull(node14);
    }

    @Test
    public void test16088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16088");
        org.jsoup.nodes.Document.OutputSettings outputSettings0 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Document.OutputSettings outputSettings2 = outputSettings0.indentAmount((int) 'a');
        org.jsoup.nodes.Entities.EscapeMode escapeMode3 = outputSettings2.escapeMode;
        java.nio.charset.Charset charset4 = outputSettings2.charset();
        org.jsoup.nodes.Document.OutputSettings outputSettings5 = outputSettings2.clone();
        outputSettings5.indentAmount = 0;
        org.jsoup.nodes.Document.OutputSettings outputSettings8 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Document.OutputSettings outputSettings10 = outputSettings8.indentAmount((int) 'a');
        org.jsoup.nodes.Entities.EscapeMode escapeMode11 = outputSettings10.escapeMode;
        java.nio.charset.Charset charset12 = outputSettings10.charset();
        org.jsoup.nodes.Entities.EscapeMode escapeMode13 = outputSettings10.escapeMode;
        int int14 = outputSettings10.indentAmount;
        java.nio.charset.CharsetEncoder charsetEncoder15 = outputSettings10.encoder();
        outputSettings5.charsetEncoder = charsetEncoder15;
        int int17 = outputSettings5.getindentAmount();
        org.jsoup.nodes.Entities.EscapeMode escapeMode18 = outputSettings5.escapeMode();
        java.nio.charset.Charset charset19 = outputSettings5.charset();
        org.junit.Assert.assertNotNull(outputSettings2);
        org.junit.Assert.assertTrue("'" + escapeMode3 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode3.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertNotNull(charset4);
        org.junit.Assert.assertNotNull(outputSettings5);
        org.junit.Assert.assertNotNull(outputSettings10);
        org.junit.Assert.assertTrue("'" + escapeMode11 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode11.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertNotNull(charset12);
        org.junit.Assert.assertTrue("'" + escapeMode13 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode13.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 97 + "'", int14 == 97);
        org.junit.Assert.assertNotNull(charsetEncoder15);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + escapeMode18 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode18.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertNotNull(charset19);
    }

    @Test
    public void test16089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16089");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("", "hi!");
        java.lang.String str3 = textNode2.text;
        boolean boolean5 = textNode2.hasAttr("hi!");
        org.jsoup.nodes.Node node6 = textNode2.parent();
        textNode2.settext("hi!");
        org.jsoup.nodes.Document document9 = textNode2.ownerDocument();
        java.lang.String str11 = textNode2.attr("");
        org.jsoup.nodes.Node node12 = textNode2.parent();
        org.jsoup.nodes.TextNode textNode14 = textNode2.text("hi!");
        java.lang.String str15 = textNode14.text;
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(node6);
        org.junit.Assert.assertNull(document9);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNull(node12);
        org.junit.Assert.assertNotNull(textNode14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
    }

    @Test
    public void test16090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16090");
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
        java.lang.String str22 = textNode21.toString();
        boolean boolean24 = textNode21.hasAttr("hi!");
        java.lang.StringBuilder stringBuilder25 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings27 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Document.OutputSettings outputSettings29 = outputSettings27.indentAmount((int) 'a');
        java.nio.charset.Charset charset30 = outputSettings27.getcharset();
        boolean boolean31 = outputSettings27.prettyPrint();
        outputSettings27.forceAllElementAsBlock = false;
        org.jsoup.nodes.Document.OutputSettings outputSettings34 = outputSettings27.clone();
        textNode21.outerHtmlTail(stringBuilder25, (int) (short) 0, outputSettings27);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "text" + "'", str5, "text");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "#text" + "'", str6, "#text");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(nodeList14);
        org.junit.Assert.assertNull(document17);
        org.junit.Assert.assertNotNull(attributes18);
        org.junit.Assert.assertNull(node19);
        org.junit.Assert.assertNotNull(textNode21);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(outputSettings29);
        org.junit.Assert.assertNotNull(charset30);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + true + "'", boolean31 == true);
        org.junit.Assert.assertNotNull(outputSettings34);
    }

    @Test
    public void test16091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16091");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("", "hi!");
        java.lang.String str3 = textNode2.text;
        java.lang.String str4 = textNode2.outerHtml();
        java.lang.String str5 = textNode2.getTEXT_KEY();
        java.lang.String str6 = textNode2.text;
        java.lang.String str7 = textNode2.gettext();
        java.lang.String str9 = textNode2.attr("");
        textNode2.ensureAttributes();
        textNode2.setBaseUri("#text");
        java.lang.String str14 = textNode2.absUrl("text");
        java.lang.String str15 = textNode2.nodeName();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node17 = textNode2.childNode(52);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 52");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "text" + "'", str5, "text");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "#text" + "'", str15, "#text");
    }

    @Test
    public void test16092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16092");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("", "hi!");
        java.lang.String str3 = textNode2.text;
        java.lang.String str4 = textNode2.outerHtml();
        java.lang.String str5 = textNode2.getTEXT_KEY();
        java.lang.String str6 = textNode2.nodeName();
        org.jsoup.nodes.Attributes attributes7 = textNode2.attributes();
        org.jsoup.nodes.Node node8 = textNode2.clone();
        java.lang.StringBuilder stringBuilder9 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings11 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Document.OutputSettings outputSettings13 = outputSettings11.indentAmount((int) 'a');
        org.jsoup.nodes.Entities.EscapeMode escapeMode14 = outputSettings13.escapeMode;
        outputSettings13.setindentAmount((int) '4');
        org.jsoup.nodes.Document.OutputSettings outputSettings17 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Document.OutputSettings outputSettings19 = outputSettings17.indentAmount((int) 'a');
        org.jsoup.nodes.Entities.EscapeMode escapeMode20 = outputSettings19.escapeMode;
        java.nio.charset.Charset charset21 = outputSettings19.charset();
        outputSettings13.setcharset(charset21);
        org.jsoup.nodes.Document.OutputSettings outputSettings23 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Document.OutputSettings outputSettings25 = outputSettings23.indentAmount((int) 'a');
        org.jsoup.nodes.Entities.EscapeMode escapeMode26 = outputSettings25.escapeMode;
        java.nio.charset.Charset charset27 = outputSettings25.charset();
        org.jsoup.nodes.Entities.EscapeMode escapeMode28 = outputSettings25.escapeMode;
        boolean boolean29 = outputSettings25.prettyPrint;
        org.jsoup.nodes.Document.OutputSettings outputSettings30 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Document.OutputSettings outputSettings32 = outputSettings30.indentAmount((int) 'a');
        org.jsoup.nodes.Entities.EscapeMode escapeMode33 = outputSettings32.escapeMode;
        org.jsoup.nodes.Document.OutputSettings outputSettings34 = outputSettings25.escapeMode(escapeMode33);
        org.jsoup.nodes.Document.OutputSettings outputSettings35 = outputSettings13.escapeMode(escapeMode33);
        boolean boolean36 = outputSettings35.getforceAllElementAsBlock();
        textNode2.outerHtmlTail(stringBuilder9, (int) (byte) 0, outputSettings35);
        java.lang.String str38 = textNode2.getTEXT_KEY();
        org.jsoup.nodes.Document document39 = textNode2.ownerDocument();
        textNode2.text = "text";
        java.lang.String str42 = textNode2.toString();
        textNode2.text = "#text";
        org.jsoup.nodes.Node node45 = textNode2.previousSibling();
        org.jsoup.nodes.TextNode textNode47 = textNode2.text("i!");
        java.lang.String str48 = textNode2.gettext();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "text" + "'", str5, "text");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "#text" + "'", str6, "#text");
        org.junit.Assert.assertNotNull(attributes7);
        org.junit.Assert.assertNotNull(node8);
        org.junit.Assert.assertNotNull(outputSettings13);
        org.junit.Assert.assertTrue("'" + escapeMode14 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode14.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertNotNull(outputSettings19);
        org.junit.Assert.assertTrue("'" + escapeMode20 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode20.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertNotNull(charset21);
        org.junit.Assert.assertNotNull(outputSettings25);
        org.junit.Assert.assertTrue("'" + escapeMode26 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode26.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertNotNull(charset27);
        org.junit.Assert.assertTrue("'" + escapeMode28 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode28.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertNotNull(outputSettings32);
        org.junit.Assert.assertTrue("'" + escapeMode33 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode33.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertNotNull(outputSettings34);
        org.junit.Assert.assertNotNull(outputSettings35);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "text" + "'", str38, "text");
        org.junit.Assert.assertNull(document39);
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "" + "'", str42, "");
        org.junit.Assert.assertNull(node45);
        org.junit.Assert.assertNotNull(textNode47);
        org.junit.Assert.assertEquals("'" + str48 + "' != '" + "i!" + "'", str48, "i!");
    }

    @Test
    public void test16093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16093");
        org.jsoup.nodes.Document.OutputSettings outputSettings0 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Document.OutputSettings outputSettings2 = outputSettings0.indentAmount((int) 'a');
        org.jsoup.nodes.Document.OutputSettings outputSettings3 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Document.OutputSettings outputSettings5 = outputSettings3.indentAmount((int) 'a');
        org.jsoup.nodes.Entities.EscapeMode escapeMode6 = outputSettings5.escapeMode;
        java.nio.charset.Charset charset7 = outputSettings5.charset();
        org.jsoup.nodes.Document.OutputSettings outputSettings8 = outputSettings5.clone();
        outputSettings8.indentAmount = 0;
        org.jsoup.nodes.Document.OutputSettings outputSettings11 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Document.OutputSettings outputSettings13 = outputSettings11.indentAmount((int) 'a');
        org.jsoup.nodes.Entities.EscapeMode escapeMode14 = outputSettings13.escapeMode;
        java.nio.charset.Charset charset15 = outputSettings13.charset();
        org.jsoup.nodes.Entities.EscapeMode escapeMode16 = outputSettings13.escapeMode;
        int int17 = outputSettings13.indentAmount;
        java.nio.charset.CharsetEncoder charsetEncoder18 = outputSettings13.encoder();
        outputSettings8.charsetEncoder = charsetEncoder18;
        outputSettings0.setcharsetEncoder(charsetEncoder18);
        java.nio.charset.CharsetEncoder charsetEncoder21 = outputSettings0.encoder();
        org.jsoup.nodes.Document.OutputSettings outputSettings23 = outputSettings0.forceAllElementAsBlock(true);
        java.nio.charset.CharsetEncoder charsetEncoder24 = outputSettings0.charsetEncoder;
        org.jsoup.nodes.Document.OutputSettings outputSettings25 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Document.OutputSettings outputSettings27 = outputSettings25.indentAmount((int) 'a');
        org.jsoup.nodes.Entities.EscapeMode escapeMode28 = outputSettings27.escapeMode;
        outputSettings27.setindentAmount((int) '4');
        org.jsoup.nodes.Document.OutputSettings outputSettings31 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Document.OutputSettings outputSettings33 = outputSettings31.indentAmount((int) 'a');
        org.jsoup.nodes.Entities.EscapeMode escapeMode34 = outputSettings33.escapeMode;
        java.nio.charset.Charset charset35 = outputSettings33.charset();
        org.jsoup.nodes.Document.OutputSettings outputSettings36 = outputSettings33.clone();
        outputSettings33.forceAllElementAsBlock = true;
        outputSettings33.forceAllElementAsBlock = false;
        java.nio.charset.Charset charset41 = outputSettings33.getcharset();
        outputSettings27.charset = charset41;
        org.jsoup.nodes.Document.OutputSettings outputSettings43 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Document.OutputSettings outputSettings45 = outputSettings43.indentAmount((int) 'a');
        org.jsoup.nodes.Entities.EscapeMode escapeMode46 = outputSettings45.escapeMode;
        java.nio.charset.Charset charset47 = outputSettings45.charset();
        org.jsoup.nodes.Entities.EscapeMode escapeMode48 = outputSettings45.escapeMode;
        boolean boolean49 = outputSettings45.prettyPrint;
        org.jsoup.nodes.Document.OutputSettings outputSettings50 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Document.OutputSettings outputSettings52 = outputSettings50.indentAmount((int) 'a');
        org.jsoup.nodes.Entities.EscapeMode escapeMode53 = outputSettings52.escapeMode;
        outputSettings45.setescapeMode(escapeMode53);
        org.jsoup.nodes.Document.OutputSettings outputSettings55 = outputSettings27.escapeMode(escapeMode53);
        outputSettings0.setescapeMode(escapeMode53);
        outputSettings0.setindentAmount((int) (byte) 100);
        org.junit.Assert.assertNotNull(outputSettings2);
        org.junit.Assert.assertNotNull(outputSettings5);
        org.junit.Assert.assertTrue("'" + escapeMode6 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode6.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertNotNull(charset7);
        org.junit.Assert.assertNotNull(outputSettings8);
        org.junit.Assert.assertNotNull(outputSettings13);
        org.junit.Assert.assertTrue("'" + escapeMode14 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode14.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertNotNull(charset15);
        org.junit.Assert.assertTrue("'" + escapeMode16 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode16.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 97 + "'", int17 == 97);
        org.junit.Assert.assertNotNull(charsetEncoder18);
        org.junit.Assert.assertNotNull(charsetEncoder21);
        org.junit.Assert.assertNotNull(outputSettings23);
        org.junit.Assert.assertNotNull(charsetEncoder24);
        org.junit.Assert.assertNotNull(outputSettings27);
        org.junit.Assert.assertTrue("'" + escapeMode28 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode28.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertNotNull(outputSettings33);
        org.junit.Assert.assertTrue("'" + escapeMode34 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode34.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertNotNull(charset35);
        org.junit.Assert.assertNotNull(outputSettings36);
        org.junit.Assert.assertNotNull(charset41);
        org.junit.Assert.assertNotNull(outputSettings45);
        org.junit.Assert.assertTrue("'" + escapeMode46 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode46.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertNotNull(charset47);
        org.junit.Assert.assertTrue("'" + escapeMode48 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode48.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + true + "'", boolean49 == true);
        org.junit.Assert.assertNotNull(outputSettings52);
        org.junit.Assert.assertTrue("'" + escapeMode53 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode53.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertNotNull(outputSettings55);
    }

    @Test
    public void test16094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16094");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("", "hi!");
        java.lang.String str3 = textNode2.text;
        java.lang.String str4 = textNode2.outerHtml();
        boolean boolean6 = textNode2.hasAttr("text");
        textNode2.settext("hi!");
        java.lang.String str9 = textNode2.nodeName();
        org.jsoup.nodes.TextNode textNode12 = new org.jsoup.nodes.TextNode("#text", "");
        boolean boolean14 = textNode12.hasAttr("#text");
        java.lang.String str15 = textNode12.getTEXT_KEY();
        boolean boolean16 = textNode2.equals((java.lang.Object) textNode12);
        boolean boolean18 = textNode12.hasAttr("#text");
        java.util.List<org.jsoup.nodes.Node> nodeList19 = textNode12.siblingNodes();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "#text" + "'", str9, "#text");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "text" + "'", str15, "text");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(nodeList19);
    }

    @Test
    public void test16095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16095");
        org.jsoup.nodes.Document.OutputSettings outputSettings0 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Document.OutputSettings outputSettings2 = outputSettings0.indentAmount((int) 'a');
        org.jsoup.nodes.Entities.EscapeMode escapeMode3 = outputSettings2.escapeMode;
        java.nio.charset.Charset charset4 = outputSettings2.charset();
        org.jsoup.nodes.Document.OutputSettings outputSettings5 = outputSettings2.clone();
        outputSettings2.forceAllElementAsBlock = true;
        org.jsoup.nodes.Entities.EscapeMode escapeMode8 = outputSettings2.escapeMode;
        boolean boolean9 = outputSettings2.forceAllElementAsBlock();
        org.jsoup.nodes.Document.OutputSettings outputSettings10 = outputSettings2.clone();
        org.jsoup.nodes.Document.OutputSettings outputSettings11 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Document.OutputSettings outputSettings13 = outputSettings11.indentAmount((int) 'a');
        org.jsoup.nodes.Entities.EscapeMode escapeMode14 = outputSettings13.escapeMode;
        java.nio.charset.Charset charset15 = outputSettings13.charset();
        org.jsoup.nodes.Document.OutputSettings outputSettings16 = outputSettings13.clone();
        boolean boolean17 = outputSettings16.getprettyPrint();
        java.nio.charset.CharsetEncoder charsetEncoder18 = outputSettings16.getcharsetEncoder();
        java.nio.charset.CharsetEncoder charsetEncoder19 = outputSettings16.charsetEncoder;
        java.nio.charset.Charset charset20 = outputSettings16.charset;
        outputSettings2.setcharset(charset20);
        org.jsoup.nodes.Entities.EscapeMode escapeMode22 = outputSettings2.escapeMode;
        int int23 = outputSettings2.indentAmount();
        boolean boolean24 = outputSettings2.getforceAllElementAsBlock();
        boolean boolean25 = outputSettings2.forceAllElementAsBlock();
        org.junit.Assert.assertNotNull(outputSettings2);
        org.junit.Assert.assertTrue("'" + escapeMode3 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode3.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertNotNull(charset4);
        org.junit.Assert.assertNotNull(outputSettings5);
        org.junit.Assert.assertTrue("'" + escapeMode8 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode8.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(outputSettings10);
        org.junit.Assert.assertNotNull(outputSettings13);
        org.junit.Assert.assertTrue("'" + escapeMode14 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode14.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertNotNull(charset15);
        org.junit.Assert.assertNotNull(outputSettings16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertNotNull(charsetEncoder18);
        org.junit.Assert.assertNotNull(charsetEncoder19);
        org.junit.Assert.assertNotNull(charset20);
        org.junit.Assert.assertTrue("'" + escapeMode22 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode22.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 97 + "'", int23 == 97);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
    }

    @Test
    public void test16096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16096");
        org.jsoup.nodes.Document.OutputSettings outputSettings0 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Document.OutputSettings outputSettings2 = outputSettings0.indentAmount((int) 'a');
        org.jsoup.nodes.Entities.EscapeMode escapeMode3 = outputSettings2.escapeMode;
        java.nio.charset.Charset charset4 = outputSettings2.charset();
        org.jsoup.nodes.Document.OutputSettings outputSettings5 = outputSettings2.clone();
        outputSettings5.indentAmount = 0;
        org.jsoup.nodes.Document.OutputSettings outputSettings8 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Document.OutputSettings outputSettings10 = outputSettings8.indentAmount((int) 'a');
        org.jsoup.nodes.Entities.EscapeMode escapeMode11 = outputSettings10.escapeMode;
        java.nio.charset.Charset charset12 = outputSettings10.charset();
        org.jsoup.nodes.Entities.EscapeMode escapeMode13 = outputSettings10.escapeMode;
        int int14 = outputSettings10.indentAmount;
        java.nio.charset.CharsetEncoder charsetEncoder15 = outputSettings10.encoder();
        outputSettings5.charsetEncoder = charsetEncoder15;
        int int17 = outputSettings5.getindentAmount();
        org.jsoup.nodes.Entities.EscapeMode escapeMode18 = outputSettings5.escapeMode();
        boolean boolean19 = outputSettings5.prettyPrint();
        org.jsoup.nodes.Document.OutputSettings outputSettings21 = outputSettings5.forceAllElementAsBlock(true);
        java.nio.charset.Charset charset22 = outputSettings5.getcharset();
        outputSettings5.forceAllElementAsBlock = false;
        org.jsoup.nodes.Document.OutputSettings outputSettings26 = outputSettings5.indentAmount((int) 'a');
        org.jsoup.nodes.Document.OutputSettings outputSettings28 = outputSettings26.indentAmount((int) (byte) 0);
        org.junit.Assert.assertNotNull(outputSettings2);
        org.junit.Assert.assertTrue("'" + escapeMode3 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode3.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertNotNull(charset4);
        org.junit.Assert.assertNotNull(outputSettings5);
        org.junit.Assert.assertNotNull(outputSettings10);
        org.junit.Assert.assertTrue("'" + escapeMode11 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode11.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertNotNull(charset12);
        org.junit.Assert.assertTrue("'" + escapeMode13 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode13.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 97 + "'", int14 == 97);
        org.junit.Assert.assertNotNull(charsetEncoder15);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + escapeMode18 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode18.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertNotNull(outputSettings21);
        org.junit.Assert.assertNotNull(charset22);
        org.junit.Assert.assertNotNull(outputSettings26);
        org.junit.Assert.assertNotNull(outputSettings28);
    }

    @Test
    public void test16097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16097");
        org.jsoup.nodes.Document.OutputSettings outputSettings0 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Document.OutputSettings outputSettings2 = outputSettings0.indentAmount((int) 'a');
        org.jsoup.nodes.Entities.EscapeMode escapeMode3 = outputSettings2.escapeMode;
        java.nio.charset.Charset charset4 = outputSettings2.charset();
        org.jsoup.nodes.Entities.EscapeMode escapeMode5 = outputSettings2.escapeMode;
        boolean boolean6 = outputSettings2.prettyPrint;
        boolean boolean7 = outputSettings2.forceAllElementAsBlock;
        boolean boolean8 = outputSettings2.getforceAllElementAsBlock();
        boolean boolean9 = outputSettings2.getprettyPrint();
        org.jsoup.nodes.Document.OutputSettings outputSettings10 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Document.OutputSettings outputSettings12 = outputSettings10.indentAmount((int) 'a');
        org.jsoup.nodes.Entities.EscapeMode escapeMode13 = outputSettings12.escapeMode;
        java.nio.charset.Charset charset14 = outputSettings12.charset();
        outputSettings12.setindentAmount(0);
        org.jsoup.nodes.Entities.EscapeMode escapeMode17 = outputSettings12.escapeMode;
        outputSettings2.escapeMode = escapeMode17;
        outputSettings2.prettyPrint = false;
        org.jsoup.nodes.Document.OutputSettings outputSettings21 = outputSettings2.clone();
        java.nio.charset.CharsetEncoder charsetEncoder22 = outputSettings2.charsetEncoder;
        java.nio.charset.CharsetEncoder charsetEncoder23 = outputSettings2.getcharsetEncoder();
        org.junit.Assert.assertNotNull(outputSettings2);
        org.junit.Assert.assertTrue("'" + escapeMode3 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode3.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertNotNull(charset4);
        org.junit.Assert.assertTrue("'" + escapeMode5 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode5.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(outputSettings12);
        org.junit.Assert.assertTrue("'" + escapeMode13 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode13.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertNotNull(charset14);
        org.junit.Assert.assertTrue("'" + escapeMode17 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode17.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertNotNull(outputSettings21);
        org.junit.Assert.assertNotNull(charsetEncoder22);
        org.junit.Assert.assertNotNull(charsetEncoder23);
    }

    @Test
    public void test16098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16098");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("", "hi!");
        java.lang.String str3 = textNode2.text;
        java.lang.String str4 = textNode2.outerHtml();
        java.lang.String str5 = textNode2.getTEXT_KEY();
        java.lang.String str6 = textNode2.nodeName();
        boolean boolean8 = textNode2.equals((java.lang.Object) (short) 1);
        textNode2.setBaseUri("#text");
        boolean boolean11 = textNode2.isBlank();
        textNode2.text = "#text";
        java.lang.String str14 = textNode2.outerHtml();
        java.lang.String str15 = textNode2.gettext();
        java.lang.StringBuilder stringBuilder16 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings18 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Document.OutputSettings outputSettings20 = outputSettings18.indentAmount((int) 'a');
        org.jsoup.nodes.Document.OutputSettings outputSettings21 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Document.OutputSettings outputSettings23 = outputSettings21.indentAmount((int) 'a');
        org.jsoup.nodes.Entities.EscapeMode escapeMode24 = outputSettings23.escapeMode;
        java.nio.charset.Charset charset25 = outputSettings23.charset();
        outputSettings23.setindentAmount(0);
        org.jsoup.nodes.Entities.EscapeMode escapeMode28 = outputSettings23.escapeMode;
        outputSettings20.setescapeMode(escapeMode28);
        boolean boolean30 = outputSettings20.getprettyPrint();
        outputSettings20.setprettyPrint(false);
        outputSettings20.setprettyPrint(true);
        outputSettings20.setindentAmount((int) '4');
        java.nio.charset.CharsetEncoder charsetEncoder37 = outputSettings20.charsetEncoder;
        textNode2.outerHtmlTail(stringBuilder16, (-1), outputSettings20);
        org.jsoup.nodes.Document document39 = textNode2.ownerDocument();
        org.jsoup.nodes.Node node41 = textNode2.removeAttr("text");
        java.lang.String str43 = textNode2.absUrl("#text");
        boolean boolean45 = textNode2.hasAttr("#text");
        org.jsoup.nodes.Node node46 = textNode2.parent();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "text" + "'", str5, "text");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "#text" + "'", str6, "#text");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "#text" + "'", str14, "#text");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "#text" + "'", str15, "#text");
        org.junit.Assert.assertNotNull(outputSettings20);
        org.junit.Assert.assertNotNull(outputSettings23);
        org.junit.Assert.assertTrue("'" + escapeMode24 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode24.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertNotNull(charset25);
        org.junit.Assert.assertTrue("'" + escapeMode28 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode28.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertNotNull(charsetEncoder37);
        org.junit.Assert.assertNull(document39);
        org.junit.Assert.assertNotNull(node41);
        org.junit.Assert.assertEquals("'" + str43 + "' != '" + "" + "'", str43, "");
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertNull(node46);
    }

    @Test
    public void test16099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16099");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("", "hi!");
        java.lang.String str3 = textNode2.text;
        java.lang.String str4 = textNode2.outerHtml();
        java.lang.String str5 = textNode2.getTEXT_KEY();
        java.lang.String str6 = textNode2.nodeName();
        org.jsoup.nodes.Attributes attributes7 = textNode2.attributes();
        org.jsoup.nodes.Node node8 = textNode2.clone();
        java.lang.StringBuilder stringBuilder9 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings11 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Document.OutputSettings outputSettings13 = outputSettings11.indentAmount((int) 'a');
        org.jsoup.nodes.Entities.EscapeMode escapeMode14 = outputSettings13.escapeMode;
        outputSettings13.setindentAmount((int) '4');
        org.jsoup.nodes.Document.OutputSettings outputSettings17 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Document.OutputSettings outputSettings19 = outputSettings17.indentAmount((int) 'a');
        org.jsoup.nodes.Entities.EscapeMode escapeMode20 = outputSettings19.escapeMode;
        java.nio.charset.Charset charset21 = outputSettings19.charset();
        outputSettings13.setcharset(charset21);
        org.jsoup.nodes.Document.OutputSettings outputSettings23 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Document.OutputSettings outputSettings25 = outputSettings23.indentAmount((int) 'a');
        org.jsoup.nodes.Entities.EscapeMode escapeMode26 = outputSettings25.escapeMode;
        java.nio.charset.Charset charset27 = outputSettings25.charset();
        org.jsoup.nodes.Entities.EscapeMode escapeMode28 = outputSettings25.escapeMode;
        boolean boolean29 = outputSettings25.prettyPrint;
        org.jsoup.nodes.Document.OutputSettings outputSettings30 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Document.OutputSettings outputSettings32 = outputSettings30.indentAmount((int) 'a');
        org.jsoup.nodes.Entities.EscapeMode escapeMode33 = outputSettings32.escapeMode;
        org.jsoup.nodes.Document.OutputSettings outputSettings34 = outputSettings25.escapeMode(escapeMode33);
        org.jsoup.nodes.Document.OutputSettings outputSettings35 = outputSettings13.escapeMode(escapeMode33);
        boolean boolean36 = outputSettings35.getforceAllElementAsBlock();
        textNode2.outerHtmlTail(stringBuilder9, (int) (byte) 0, outputSettings35);
        org.jsoup.nodes.Document.OutputSettings outputSettings38 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Document.OutputSettings outputSettings40 = outputSettings38.indentAmount((int) 'a');
        org.jsoup.nodes.Entities.EscapeMode escapeMode41 = outputSettings40.escapeMode;
        java.nio.charset.Charset charset42 = outputSettings40.charset();
        outputSettings40.setindentAmount(0);
        org.jsoup.nodes.Entities.EscapeMode escapeMode45 = outputSettings40.escapeMode;
        outputSettings35.escapeMode = escapeMode45;
        org.jsoup.nodes.Document.OutputSettings outputSettings47 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Document.OutputSettings outputSettings49 = outputSettings47.indentAmount((int) 'a');
        org.jsoup.nodes.Entities.EscapeMode escapeMode50 = outputSettings49.escapeMode;
        java.nio.charset.Charset charset51 = outputSettings49.charset();
        org.jsoup.nodes.Entities.EscapeMode escapeMode52 = outputSettings49.escapeMode;
        boolean boolean53 = outputSettings49.prettyPrint;
        boolean boolean54 = outputSettings49.forceAllElementAsBlock;
        boolean boolean55 = outputSettings49.getforceAllElementAsBlock();
        boolean boolean56 = outputSettings49.getprettyPrint();
        boolean boolean57 = outputSettings49.forceAllElementAsBlock();
        org.jsoup.nodes.Entities.EscapeMode escapeMode58 = outputSettings49.escapeMode();
        outputSettings35.escapeMode = escapeMode58;
        boolean boolean60 = outputSettings35.prettyPrint;
        org.jsoup.nodes.TextNode textNode63 = new org.jsoup.nodes.TextNode("", "hi!");
        java.lang.String str64 = textNode63.text;
        java.lang.String str65 = textNode63.outerHtml();
        java.lang.String str66 = textNode63.getTEXT_KEY();
        java.lang.String str67 = textNode63.nodeName();
        boolean boolean69 = textNode63.equals((java.lang.Object) (short) 1);
        textNode63.setBaseUri("#text");
        boolean boolean72 = textNode63.isBlank();
        textNode63.text = "#text";
        java.util.List<org.jsoup.nodes.Node> nodeList75 = textNode63.childNodes();
        textNode63.settext("text");
        org.jsoup.nodes.Document document78 = textNode63.ownerDocument();
        org.jsoup.nodes.Attributes attributes79 = textNode63.attributes();
        java.lang.String str80 = textNode63.getTEXT_KEY();
        int int81 = textNode63.siblingIndex();
        java.lang.String str83 = textNode63.attr("hi!");
        java.lang.StringBuilder stringBuilder84 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings86 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Document.OutputSettings outputSettings88 = outputSettings86.indentAmount((int) 'a');
        org.jsoup.nodes.Document.OutputSettings outputSettings89 = outputSettings86.clone();
        boolean boolean90 = outputSettings86.getforceAllElementAsBlock();
        outputSettings86.prettyPrint = true;
        java.nio.charset.CharsetEncoder charsetEncoder93 = outputSettings86.getcharsetEncoder();
        java.nio.charset.CharsetEncoder charsetEncoder94 = outputSettings86.encoder();
        textNode63.outerHtmlTail(stringBuilder84, 97, outputSettings86);
        boolean boolean96 = outputSettings86.getprettyPrint();
        org.jsoup.nodes.Document.OutputSettings outputSettings97 = outputSettings86.clone();
        org.jsoup.nodes.Entities.EscapeMode escapeMode98 = outputSettings86.getescapeMode();
        outputSettings35.escapeMode = escapeMode98;
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "text" + "'", str5, "text");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "#text" + "'", str6, "#text");
        org.junit.Assert.assertNotNull(attributes7);
        org.junit.Assert.assertNotNull(node8);
        org.junit.Assert.assertNotNull(outputSettings13);
        org.junit.Assert.assertTrue("'" + escapeMode14 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode14.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertNotNull(outputSettings19);
        org.junit.Assert.assertTrue("'" + escapeMode20 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode20.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertNotNull(charset21);
        org.junit.Assert.assertNotNull(outputSettings25);
        org.junit.Assert.assertTrue("'" + escapeMode26 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode26.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertNotNull(charset27);
        org.junit.Assert.assertTrue("'" + escapeMode28 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode28.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertNotNull(outputSettings32);
        org.junit.Assert.assertTrue("'" + escapeMode33 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode33.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertNotNull(outputSettings34);
        org.junit.Assert.assertNotNull(outputSettings35);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertNotNull(outputSettings40);
        org.junit.Assert.assertTrue("'" + escapeMode41 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode41.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertNotNull(charset42);
        org.junit.Assert.assertTrue("'" + escapeMode45 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode45.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertNotNull(outputSettings49);
        org.junit.Assert.assertTrue("'" + escapeMode50 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode50.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertNotNull(charset51);
        org.junit.Assert.assertTrue("'" + escapeMode52 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode52.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + true + "'", boolean53 == true);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + false + "'", boolean54 == false);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + false + "'", boolean55 == false);
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + true + "'", boolean56 == true);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + false + "'", boolean57 == false);
        org.junit.Assert.assertTrue("'" + escapeMode58 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode58.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + true + "'", boolean60 == true);
        org.junit.Assert.assertEquals("'" + str64 + "' != '" + "" + "'", str64, "");
        org.junit.Assert.assertEquals("'" + str65 + "' != '" + "" + "'", str65, "");
        org.junit.Assert.assertEquals("'" + str66 + "' != '" + "text" + "'", str66, "text");
        org.junit.Assert.assertEquals("'" + str67 + "' != '" + "#text" + "'", str67, "#text");
        org.junit.Assert.assertTrue("'" + boolean69 + "' != '" + false + "'", boolean69 == false);
        org.junit.Assert.assertTrue("'" + boolean72 + "' != '" + true + "'", boolean72 == true);
        org.junit.Assert.assertNotNull(nodeList75);
        org.junit.Assert.assertNull(document78);
        org.junit.Assert.assertNotNull(attributes79);
        org.junit.Assert.assertEquals("'" + str80 + "' != '" + "text" + "'", str80, "text");
        org.junit.Assert.assertTrue("'" + int81 + "' != '" + 0 + "'", int81 == 0);
        org.junit.Assert.assertEquals("'" + str83 + "' != '" + "" + "'", str83, "");
        org.junit.Assert.assertNotNull(outputSettings88);
        org.junit.Assert.assertNotNull(outputSettings89);
        org.junit.Assert.assertTrue("'" + boolean90 + "' != '" + false + "'", boolean90 == false);
        org.junit.Assert.assertNotNull(charsetEncoder93);
        org.junit.Assert.assertNotNull(charsetEncoder94);
        org.junit.Assert.assertTrue("'" + boolean96 + "' != '" + true + "'", boolean96 == true);
        org.junit.Assert.assertNotNull(outputSettings97);
        org.junit.Assert.assertTrue("'" + escapeMode98 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode98.equals(org.jsoup.nodes.Entities.EscapeMode.base));
    }

    @Test
    public void test16100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16100");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("", "hi!");
        java.lang.String str3 = textNode2.text;
        java.lang.String str4 = textNode2.outerHtml();
        java.lang.String str5 = textNode2.getTEXT_KEY();
        java.lang.String str6 = textNode2.nodeName();
        textNode2.settext("#text");
        java.util.List<org.jsoup.nodes.Node> nodeList9 = textNode2.siblingNodes();
        org.jsoup.nodes.TextNode textNode11 = textNode2.text("#");
        java.lang.String str12 = textNode2.getTEXT_KEY();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node14 = textNode2.childNode(0);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "text" + "'", str5, "text");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "#text" + "'", str6, "#text");
        org.junit.Assert.assertNotNull(nodeList9);
        org.junit.Assert.assertNotNull(textNode11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "text" + "'", str12, "text");
    }

    @Test
    public void test16101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16101");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("#", "#text");
        textNode2.text = "";
        java.lang.StringBuilder stringBuilder5 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings7 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Document.OutputSettings outputSettings9 = outputSettings7.indentAmount((int) 'a');
        org.jsoup.nodes.Document.OutputSettings outputSettings10 = outputSettings7.clone();
        outputSettings7.forceAllElementAsBlock = false;
        java.nio.charset.CharsetEncoder charsetEncoder13 = outputSettings7.charsetEncoder;
        org.jsoup.nodes.Document.OutputSettings outputSettings15 = outputSettings7.prettyPrint(true);
        int int16 = outputSettings15.indentAmount();
        boolean boolean17 = outputSettings15.getprettyPrint();
        outputSettings15.setforceAllElementAsBlock(true);
        textNode2.outerHtmlTail(stringBuilder5, (int) (byte) 0, outputSettings15);
        org.junit.Assert.assertNotNull(outputSettings9);
        org.junit.Assert.assertNotNull(outputSettings10);
        org.junit.Assert.assertNotNull(charsetEncoder13);
        org.junit.Assert.assertNotNull(outputSettings15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 97 + "'", int16 == 97);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
    }

    @Test
    public void test16102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16102");
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
        java.lang.String str19 = textNode2.getWholeText();
        org.jsoup.nodes.TextNode textNode21 = textNode2.text("h");
        boolean boolean22 = textNode21.isBlank();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "text" + "'", str5, "text");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "#text" + "'", str6, "#text");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(nodeList14);
        org.junit.Assert.assertNull(document17);
        org.junit.Assert.assertNotNull(attributes18);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "text" + "'", str19, "text");
        org.junit.Assert.assertNotNull(textNode21);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
    }

    @Test
    public void test16103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16103");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("#text", "hi!");
        org.jsoup.nodes.Attributes attributes3 = textNode2.attributes();
        java.lang.StringBuilder stringBuilder4 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings6 = new org.jsoup.nodes.Document.OutputSettings();
        boolean boolean7 = outputSettings6.prettyPrint;
        org.jsoup.nodes.Document.OutputSettings outputSettings8 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Document.OutputSettings outputSettings10 = outputSettings8.indentAmount((int) 'a');
        org.jsoup.nodes.Entities.EscapeMode escapeMode11 = outputSettings10.escapeMode;
        java.nio.charset.Charset charset12 = outputSettings10.charset();
        org.jsoup.nodes.Document.OutputSettings outputSettings13 = outputSettings6.charset(charset12);
        boolean boolean14 = outputSettings13.getforceAllElementAsBlock();
        boolean boolean15 = outputSettings13.forceAllElementAsBlock();
        org.jsoup.nodes.Document.OutputSettings outputSettings16 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Document.OutputSettings outputSettings18 = outputSettings16.indentAmount((int) 'a');
        org.jsoup.nodes.Document.OutputSettings outputSettings19 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Document.OutputSettings outputSettings21 = outputSettings19.indentAmount((int) 'a');
        org.jsoup.nodes.Entities.EscapeMode escapeMode22 = outputSettings21.escapeMode;
        java.nio.charset.Charset charset23 = outputSettings21.charset();
        outputSettings21.setindentAmount(0);
        org.jsoup.nodes.Entities.EscapeMode escapeMode26 = outputSettings21.escapeMode;
        outputSettings18.setescapeMode(escapeMode26);
        outputSettings13.setescapeMode(escapeMode26);
        java.nio.charset.CharsetEncoder charsetEncoder29 = outputSettings13.charsetEncoder;
        // The following exception was thrown during execution in test generation
        try {
            textNode2.outerHtmlHead(stringBuilder4, (int) (byte) 0, outputSettings13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(textNode2);
        org.junit.Assert.assertNotNull(attributes3);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(outputSettings10);
        org.junit.Assert.assertTrue("'" + escapeMode11 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode11.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertNotNull(charset12);
        org.junit.Assert.assertNotNull(outputSettings13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(outputSettings18);
        org.junit.Assert.assertNotNull(outputSettings21);
        org.junit.Assert.assertTrue("'" + escapeMode22 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode22.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertNotNull(charset23);
        org.junit.Assert.assertTrue("'" + escapeMode26 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode26.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertNotNull(charsetEncoder29);
    }

    @Test
    public void test16104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16104");
        org.jsoup.nodes.Document.OutputSettings outputSettings0 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Document.OutputSettings outputSettings2 = outputSettings0.indentAmount((int) 'a');
        org.jsoup.nodes.Entities.EscapeMode escapeMode3 = outputSettings2.escapeMode;
        java.nio.charset.Charset charset4 = outputSettings2.charset();
        org.jsoup.nodes.Entities.EscapeMode escapeMode5 = outputSettings2.escapeMode;
        boolean boolean6 = outputSettings2.prettyPrint;
        boolean boolean7 = outputSettings2.forceAllElementAsBlock;
        boolean boolean8 = outputSettings2.getforceAllElementAsBlock();
        boolean boolean9 = outputSettings2.getprettyPrint();
        boolean boolean10 = outputSettings2.forceAllElementAsBlock();
        outputSettings2.forceAllElementAsBlock = false;
        outputSettings2.indentAmount = (-1);
        org.jsoup.nodes.Entities.EscapeMode escapeMode15 = outputSettings2.escapeMode();
        java.nio.charset.Charset charset16 = outputSettings2.charset();
        org.jsoup.nodes.Entities.EscapeMode escapeMode17 = outputSettings2.escapeMode;
        org.junit.Assert.assertNotNull(outputSettings2);
        org.junit.Assert.assertTrue("'" + escapeMode3 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode3.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertNotNull(charset4);
        org.junit.Assert.assertTrue("'" + escapeMode5 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode5.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + escapeMode15 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode15.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertNotNull(charset16);
        org.junit.Assert.assertTrue("'" + escapeMode17 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode17.equals(org.jsoup.nodes.Entities.EscapeMode.base));
    }

    @Test
    public void test16105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16105");
        org.jsoup.nodes.Document.OutputSettings outputSettings0 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Document.OutputSettings outputSettings2 = outputSettings0.indentAmount((int) 'a');
        org.jsoup.nodes.Entities.EscapeMode escapeMode3 = outputSettings2.escapeMode;
        java.nio.charset.Charset charset4 = outputSettings2.charset();
        org.jsoup.nodes.Document.OutputSettings outputSettings5 = outputSettings2.clone();
        outputSettings2.forceAllElementAsBlock = true;
        org.jsoup.nodes.Entities.EscapeMode escapeMode8 = outputSettings2.escapeMode;
        int int9 = outputSettings2.getindentAmount();
        org.jsoup.nodes.Document.OutputSettings outputSettings11 = outputSettings2.prettyPrint(false);
        boolean boolean12 = outputSettings2.getprettyPrint();
        java.nio.charset.Charset charset13 = outputSettings2.charset;
        org.jsoup.nodes.Document.OutputSettings outputSettings14 = outputSettings2.clone();
        java.nio.charset.CharsetEncoder charsetEncoder15 = outputSettings2.charsetEncoder;
        outputSettings2.setprettyPrint(true);
        boolean boolean18 = outputSettings2.getprettyPrint();
        boolean boolean19 = outputSettings2.getprettyPrint();
        org.junit.Assert.assertNotNull(outputSettings2);
        org.junit.Assert.assertTrue("'" + escapeMode3 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode3.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertNotNull(charset4);
        org.junit.Assert.assertNotNull(outputSettings5);
        org.junit.Assert.assertTrue("'" + escapeMode8 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode8.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 97 + "'", int9 == 97);
        org.junit.Assert.assertNotNull(outputSettings11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(charset13);
        org.junit.Assert.assertNotNull(outputSettings14);
        org.junit.Assert.assertNotNull(charsetEncoder15);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
    }

    @Test
    public void test16106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16106");
        org.jsoup.nodes.Document.OutputSettings outputSettings0 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Document.OutputSettings outputSettings2 = outputSettings0.indentAmount((int) 'a');
        org.jsoup.nodes.Entities.EscapeMode escapeMode3 = outputSettings2.escapeMode;
        java.nio.charset.Charset charset4 = outputSettings2.charset();
        org.jsoup.nodes.Document.OutputSettings outputSettings5 = outputSettings2.clone();
        boolean boolean6 = outputSettings5.getprettyPrint();
        org.jsoup.nodes.Entities.EscapeMode escapeMode7 = outputSettings5.escapeMode;
        org.jsoup.nodes.Document.OutputSettings outputSettings8 = outputSettings5.clone();
        java.nio.charset.CharsetEncoder charsetEncoder9 = outputSettings8.encoder();
        boolean boolean10 = outputSettings8.forceAllElementAsBlock();
        outputSettings8.indentAmount = (byte) 10;
        outputSettings8.setforceAllElementAsBlock(true);
        org.junit.Assert.assertNotNull(outputSettings2);
        org.junit.Assert.assertTrue("'" + escapeMode3 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode3.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertNotNull(charset4);
        org.junit.Assert.assertNotNull(outputSettings5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + escapeMode7 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode7.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertNotNull(outputSettings8);
        org.junit.Assert.assertNotNull(charsetEncoder9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test16107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16107");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("", "hi!");
        java.lang.String str3 = textNode2.text;
        java.lang.String str4 = textNode2.outerHtml();
        java.lang.String str5 = textNode2.getTEXT_KEY();
        java.lang.String str6 = textNode2.text;
        java.lang.Object obj7 = null;
        boolean boolean8 = textNode2.equals(obj7);
        org.jsoup.nodes.Node node10 = textNode2.removeAttr("hi!");
        org.jsoup.nodes.Node node11 = textNode2.previousSibling();
        textNode2.ensureAttributes();
        java.lang.StringBuilder stringBuilder13 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings15 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Document.OutputSettings outputSettings17 = outputSettings15.indentAmount((int) 'a');
        org.jsoup.nodes.Entities.EscapeMode escapeMode18 = outputSettings17.escapeMode;
        java.nio.charset.Charset charset19 = outputSettings17.charset();
        org.jsoup.nodes.Document.OutputSettings outputSettings20 = outputSettings17.clone();
        outputSettings17.forceAllElementAsBlock = true;
        outputSettings17.forceAllElementAsBlock = false;
        textNode2.outerHtmlTail(stringBuilder13, (int) '4', outputSettings17);
        java.nio.charset.CharsetEncoder charsetEncoder26 = outputSettings17.encoder();
        java.nio.charset.Charset charset27 = outputSettings17.charset();
        java.nio.charset.CharsetEncoder charsetEncoder28 = outputSettings17.getcharsetEncoder();
        boolean boolean29 = outputSettings17.forceAllElementAsBlock;
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "text" + "'", str5, "text");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(node10);
        org.junit.Assert.assertNull(node11);
        org.junit.Assert.assertNotNull(outputSettings17);
        org.junit.Assert.assertTrue("'" + escapeMode18 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode18.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertNotNull(charset19);
        org.junit.Assert.assertNotNull(outputSettings20);
        org.junit.Assert.assertNotNull(charsetEncoder26);
        org.junit.Assert.assertNotNull(charset27);
        org.junit.Assert.assertNotNull(charsetEncoder28);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
    }

    @Test
    public void test16108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16108");
        org.jsoup.nodes.Document.OutputSettings outputSettings0 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Document.OutputSettings outputSettings2 = outputSettings0.indentAmount((int) 'a');
        org.jsoup.nodes.Entities.EscapeMode escapeMode3 = outputSettings2.escapeMode;
        java.nio.charset.Charset charset4 = outputSettings2.charset();
        org.jsoup.nodes.Document.OutputSettings outputSettings5 = outputSettings2.clone();
        boolean boolean6 = outputSettings5.getprettyPrint();
        java.nio.charset.CharsetEncoder charsetEncoder7 = outputSettings5.getcharsetEncoder();
        org.jsoup.nodes.Document.OutputSettings outputSettings8 = outputSettings5.clone();
        java.nio.charset.CharsetEncoder charsetEncoder9 = outputSettings5.charsetEncoder;
        boolean boolean10 = outputSettings5.forceAllElementAsBlock;
        org.jsoup.nodes.TextNode textNode11 = new org.jsoup.nodes.TextNode();
        org.jsoup.nodes.Node node12 = textNode11.clone();
        java.lang.String str13 = textNode11.baseUri();
        org.jsoup.nodes.Document.OutputSettings outputSettings14 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Document.OutputSettings outputSettings16 = outputSettings14.indentAmount((int) 'a');
        org.jsoup.nodes.Entities.EscapeMode escapeMode17 = outputSettings16.escapeMode;
        java.nio.charset.Charset charset18 = outputSettings16.charset();
        org.jsoup.nodes.Document.OutputSettings outputSettings19 = outputSettings16.clone();
        outputSettings16.forceAllElementAsBlock = true;
        outputSettings16.forceAllElementAsBlock = false;
        boolean boolean24 = outputSettings16.prettyPrint;
        boolean boolean25 = textNode11.equals((java.lang.Object) outputSettings16);
        java.nio.charset.CharsetEncoder charsetEncoder26 = outputSettings16.encoder();
        outputSettings5.setcharsetEncoder(charsetEncoder26);
        org.jsoup.nodes.Document.OutputSettings outputSettings29 = outputSettings5.prettyPrint(false);
        outputSettings29.setindentAmount(10);
        java.nio.charset.Charset charset32 = outputSettings29.charset();
        org.jsoup.nodes.Document.OutputSettings outputSettings34 = outputSettings29.indentAmount(1);
        org.junit.Assert.assertNotNull(outputSettings2);
        org.junit.Assert.assertTrue("'" + escapeMode3 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode3.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertNotNull(charset4);
        org.junit.Assert.assertNotNull(outputSettings5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(charsetEncoder7);
        org.junit.Assert.assertNotNull(outputSettings8);
        org.junit.Assert.assertNotNull(charsetEncoder9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(node12);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNotNull(outputSettings16);
        org.junit.Assert.assertTrue("'" + escapeMode17 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode17.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertNotNull(charset18);
        org.junit.Assert.assertNotNull(outputSettings19);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNotNull(charsetEncoder26);
        org.junit.Assert.assertNotNull(outputSettings29);
        org.junit.Assert.assertNotNull(charset32);
        org.junit.Assert.assertNotNull(outputSettings34);
    }

    @Test
    public void test16109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16109");
        org.jsoup.nodes.Document.OutputSettings outputSettings0 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Document.OutputSettings outputSettings2 = outputSettings0.indentAmount((int) 'a');
        org.jsoup.nodes.Entities.EscapeMode escapeMode3 = outputSettings2.escapeMode;
        java.nio.charset.Charset charset4 = outputSettings2.charset();
        outputSettings2.setindentAmount(0);
        org.jsoup.nodes.Entities.EscapeMode escapeMode7 = outputSettings2.escapeMode;
        org.jsoup.nodes.Document.OutputSettings outputSettings9 = outputSettings2.indentAmount((int) (byte) 10);
        boolean boolean10 = outputSettings2.forceAllElementAsBlock;
        org.jsoup.nodes.Document.OutputSettings outputSettings11 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Document.OutputSettings outputSettings13 = outputSettings11.indentAmount((int) 'a');
        org.jsoup.nodes.Entities.EscapeMode escapeMode14 = outputSettings13.escapeMode;
        java.nio.charset.Charset charset15 = outputSettings13.charset();
        org.jsoup.nodes.Entities.EscapeMode escapeMode16 = outputSettings13.escapeMode;
        boolean boolean17 = outputSettings13.prettyPrint;
        org.jsoup.nodes.Document.OutputSettings outputSettings18 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Document.OutputSettings outputSettings20 = outputSettings18.indentAmount((int) 'a');
        org.jsoup.nodes.Entities.EscapeMode escapeMode21 = outputSettings20.escapeMode;
        java.nio.charset.Charset charset22 = outputSettings20.charset();
        outputSettings20.setindentAmount(0);
        org.jsoup.nodes.Entities.EscapeMode escapeMode25 = outputSettings20.escapeMode;
        org.jsoup.nodes.Document.OutputSettings outputSettings26 = outputSettings13.escapeMode(escapeMode25);
        outputSettings2.setescapeMode(escapeMode25);
        org.jsoup.nodes.Document.OutputSettings outputSettings28 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Document.OutputSettings outputSettings30 = outputSettings28.indentAmount((int) 'a');
        org.jsoup.nodes.Document.OutputSettings outputSettings31 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Document.OutputSettings outputSettings33 = outputSettings31.indentAmount((int) 'a');
        java.nio.charset.Charset charset34 = outputSettings31.getcharset();
        outputSettings30.setcharset(charset34);
        outputSettings2.setcharset(charset34);
        org.jsoup.nodes.Entities.EscapeMode escapeMode37 = outputSettings2.getescapeMode();
        java.nio.charset.Charset charset38 = outputSettings2.charset;
        org.jsoup.nodes.Document.OutputSettings outputSettings39 = new org.jsoup.nodes.Document.OutputSettings();
        boolean boolean40 = outputSettings39.prettyPrint;
        org.jsoup.nodes.Document.OutputSettings outputSettings41 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Document.OutputSettings outputSettings43 = outputSettings41.indentAmount((int) 'a');
        org.jsoup.nodes.Entities.EscapeMode escapeMode44 = outputSettings43.escapeMode;
        java.nio.charset.Charset charset45 = outputSettings43.charset();
        org.jsoup.nodes.Document.OutputSettings outputSettings46 = outputSettings39.charset(charset45);
        boolean boolean47 = outputSettings39.getprettyPrint();
        boolean boolean48 = outputSettings39.getprettyPrint();
        org.jsoup.nodes.Document.OutputSettings outputSettings49 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Document.OutputSettings outputSettings51 = outputSettings49.indentAmount((int) 'a');
        org.jsoup.nodes.Entities.EscapeMode escapeMode52 = outputSettings51.escapeMode;
        outputSettings39.setescapeMode(escapeMode52);
        outputSettings39.setforceAllElementAsBlock(true);
        outputSettings39.setindentAmount((int) (byte) 10);
        org.jsoup.nodes.Entities.EscapeMode escapeMode58 = outputSettings39.escapeMode;
        outputSettings2.escapeMode = escapeMode58;
        org.junit.Assert.assertNotNull(outputSettings2);
        org.junit.Assert.assertTrue("'" + escapeMode3 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode3.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertNotNull(charset4);
        org.junit.Assert.assertTrue("'" + escapeMode7 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode7.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertNotNull(outputSettings9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(outputSettings13);
        org.junit.Assert.assertTrue("'" + escapeMode14 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode14.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertNotNull(charset15);
        org.junit.Assert.assertTrue("'" + escapeMode16 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode16.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertNotNull(outputSettings20);
        org.junit.Assert.assertTrue("'" + escapeMode21 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode21.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertNotNull(charset22);
        org.junit.Assert.assertTrue("'" + escapeMode25 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode25.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertNotNull(outputSettings26);
        org.junit.Assert.assertNotNull(outputSettings30);
        org.junit.Assert.assertNotNull(outputSettings33);
        org.junit.Assert.assertNotNull(charset34);
        org.junit.Assert.assertTrue("'" + escapeMode37 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode37.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertNotNull(charset38);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + true + "'", boolean40 == true);
        org.junit.Assert.assertNotNull(outputSettings43);
        org.junit.Assert.assertTrue("'" + escapeMode44 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode44.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertNotNull(charset45);
        org.junit.Assert.assertNotNull(outputSettings46);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + true + "'", boolean47 == true);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + true + "'", boolean48 == true);
        org.junit.Assert.assertNotNull(outputSettings51);
        org.junit.Assert.assertTrue("'" + escapeMode52 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode52.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertTrue("'" + escapeMode58 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode58.equals(org.jsoup.nodes.Entities.EscapeMode.base));
    }

    @Test
    public void test16110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16110");
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
        java.lang.String str21 = textNode2.baseUri();
        org.jsoup.nodes.Document document22 = textNode2.ownerDocument();
        org.jsoup.nodes.TextNode textNode25 = new org.jsoup.nodes.TextNode("", "hi!");
        java.lang.String str26 = textNode25.text;
        java.lang.String str27 = textNode25.outerHtml();
        java.lang.String str28 = textNode25.getTEXT_KEY();
        java.lang.String str29 = textNode25.nodeName();
        boolean boolean31 = textNode25.equals((java.lang.Object) (short) 1);
        textNode25.setBaseUri("#text");
        boolean boolean34 = textNode25.isBlank();
        textNode25.text = "#text";
        java.util.List<org.jsoup.nodes.Node> nodeList37 = textNode25.childNodes();
        textNode25.settext("text");
        org.jsoup.nodes.Document document40 = textNode25.ownerDocument();
        org.jsoup.nodes.Attributes attributes41 = textNode25.attributes();
        java.lang.String str42 = textNode25.getTEXT_KEY();
        int int43 = textNode25.siblingIndex();
        java.lang.String str45 = textNode25.attr("hi!");
        org.jsoup.nodes.TextNode textNode47 = textNode25.text("text");
        org.jsoup.nodes.Node node48 = textNode25.clone();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node49 = textNode2.after(node48);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "text" + "'", str5, "text");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "#text" + "'", str6, "#text");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(nodeList14);
        org.junit.Assert.assertNull(document17);
        org.junit.Assert.assertNotNull(attributes18);
        org.junit.Assert.assertNull(node19);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "#text" + "'", str20, "#text");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "#text" + "'", str21, "#text");
        org.junit.Assert.assertNull(document22);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "" + "'", str26, "");
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "" + "'", str27, "");
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "text" + "'", str28, "text");
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "#text" + "'", str29, "#text");
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + true + "'", boolean34 == true);
        org.junit.Assert.assertNotNull(nodeList37);
        org.junit.Assert.assertNull(document40);
        org.junit.Assert.assertNotNull(attributes41);
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "text" + "'", str42, "text");
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + 0 + "'", int43 == 0);
        org.junit.Assert.assertEquals("'" + str45 + "' != '" + "" + "'", str45, "");
        org.junit.Assert.assertNotNull(textNode47);
        org.junit.Assert.assertNotNull(node48);
    }

    @Test
    public void test16111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16111");
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
        org.jsoup.nodes.Node node19 = textNode2.nextSibling();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "text" + "'", str5, "text");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "#text" + "'", str6, "#text");
        org.junit.Assert.assertNotNull(attributes7);
        org.junit.Assert.assertNotNull(nodeList8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNotNull(textNode12);
        org.junit.Assert.assertNotNull(textNode14);
        org.junit.Assert.assertNotNull(node17);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!" + "'", str18, "hi!");
        org.junit.Assert.assertNull(node19);
    }

    @Test
    public void test16112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16112");
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
        org.jsoup.nodes.Node node14 = textNode2.previousSibling();
        org.jsoup.nodes.Attributes attributes15 = textNode2.attributes();
        java.lang.String str16 = textNode2.baseUri();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "text" + "'", str5, "text");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "#text" + "'", str6, "#text");
        org.junit.Assert.assertNotNull(attributes7);
        org.junit.Assert.assertNotNull(nodeList8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "#text" + "'", str11, "#text");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNull(node14);
        org.junit.Assert.assertNotNull(attributes15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
    }

    @Test
    public void test16113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16113");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("", "hi!");
        java.lang.String str3 = textNode2.text;
        boolean boolean5 = textNode2.hasAttr("hi!");
        org.jsoup.nodes.Node node6 = textNode2.parent();
        textNode2.settext("hi!");
        java.lang.String str9 = textNode2.text;
        java.lang.String str10 = textNode2.toString();
        org.jsoup.nodes.Node node11 = textNode2.nextSibling();
        boolean boolean13 = textNode2.hasAttr("#");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node15 = textNode2.before("h");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(node6);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNull(node11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test16114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16114");
        org.jsoup.nodes.Document.OutputSettings outputSettings0 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Document.OutputSettings outputSettings2 = outputSettings0.indentAmount((int) 'a');
        org.jsoup.nodes.Document.OutputSettings outputSettings3 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Document.OutputSettings outputSettings5 = outputSettings3.indentAmount((int) 'a');
        org.jsoup.nodes.Entities.EscapeMode escapeMode6 = outputSettings5.escapeMode;
        java.nio.charset.Charset charset7 = outputSettings5.charset();
        outputSettings5.setindentAmount(0);
        org.jsoup.nodes.Entities.EscapeMode escapeMode10 = outputSettings5.escapeMode;
        outputSettings2.setescapeMode(escapeMode10);
        boolean boolean12 = outputSettings2.getprettyPrint();
        outputSettings2.indentAmount = 97;
        org.jsoup.nodes.Document.OutputSettings outputSettings15 = outputSettings2.clone();
        org.jsoup.nodes.Entities.EscapeMode escapeMode16 = outputSettings2.escapeMode();
        outputSettings2.forceAllElementAsBlock = true;
        outputSettings2.indentAmount = 1;
        int int21 = outputSettings2.indentAmount();
        org.jsoup.nodes.Document.OutputSettings outputSettings23 = outputSettings2.indentAmount(1);
        java.nio.charset.Charset charset24 = outputSettings23.charset();
        org.jsoup.nodes.Document.OutputSettings outputSettings25 = outputSettings23.clone();
        org.jsoup.nodes.Document.OutputSettings outputSettings26 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Document.OutputSettings outputSettings28 = outputSettings26.indentAmount((int) 'a');
        org.jsoup.nodes.Entities.EscapeMode escapeMode29 = outputSettings28.escapeMode;
        java.nio.charset.Charset charset30 = outputSettings28.charset();
        org.jsoup.nodes.Document.OutputSettings outputSettings31 = outputSettings28.clone();
        outputSettings31.indentAmount = 0;
        org.jsoup.nodes.Document.OutputSettings outputSettings34 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Document.OutputSettings outputSettings36 = outputSettings34.indentAmount((int) 'a');
        org.jsoup.nodes.Entities.EscapeMode escapeMode37 = outputSettings36.escapeMode;
        java.nio.charset.Charset charset38 = outputSettings36.charset;
        outputSettings31.setcharset(charset38);
        org.jsoup.nodes.Document.OutputSettings outputSettings41 = outputSettings31.forceAllElementAsBlock(false);
        outputSettings31.prettyPrint = true;
        java.nio.charset.CharsetEncoder charsetEncoder44 = outputSettings31.getcharsetEncoder();
        boolean boolean45 = outputSettings31.forceAllElementAsBlock;
        outputSettings31.forceAllElementAsBlock = false;
        org.jsoup.nodes.Document.OutputSettings outputSettings48 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Document.OutputSettings outputSettings50 = outputSettings48.indentAmount((int) 'a');
        org.jsoup.nodes.Document.OutputSettings outputSettings51 = outputSettings48.clone();
        outputSettings51.setforceAllElementAsBlock(true);
        java.nio.charset.CharsetEncoder charsetEncoder54 = outputSettings51.charsetEncoder;
        org.jsoup.nodes.Document.OutputSettings outputSettings55 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Document.OutputSettings outputSettings57 = outputSettings55.indentAmount((int) 'a');
        org.jsoup.nodes.Entities.EscapeMode escapeMode58 = outputSettings57.escapeMode;
        java.nio.charset.Charset charset59 = outputSettings57.charset();
        org.jsoup.nodes.Entities.EscapeMode escapeMode60 = outputSettings57.escapeMode;
        boolean boolean61 = outputSettings57.prettyPrint;
        org.jsoup.nodes.Document.OutputSettings outputSettings62 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Document.OutputSettings outputSettings64 = outputSettings62.indentAmount((int) 'a');
        org.jsoup.nodes.Entities.EscapeMode escapeMode65 = outputSettings64.escapeMode;
        org.jsoup.nodes.Document.OutputSettings outputSettings66 = outputSettings57.escapeMode(escapeMode65);
        outputSettings66.setindentAmount(0);
        org.jsoup.nodes.Document.OutputSettings outputSettings69 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Document.OutputSettings outputSettings71 = outputSettings69.indentAmount((int) 'a');
        org.jsoup.nodes.Entities.EscapeMode escapeMode72 = outputSettings71.escapeMode;
        java.nio.charset.Charset charset73 = outputSettings71.charset();
        org.jsoup.nodes.Entities.EscapeMode escapeMode74 = outputSettings71.escapeMode;
        int int75 = outputSettings71.indentAmount;
        java.nio.charset.CharsetEncoder charsetEncoder76 = outputSettings71.encoder();
        outputSettings66.charsetEncoder = charsetEncoder76;
        org.jsoup.nodes.Document.OutputSettings outputSettings78 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Document.OutputSettings outputSettings80 = outputSettings78.indentAmount((int) 'a');
        org.jsoup.nodes.Entities.EscapeMode escapeMode81 = outputSettings80.escapeMode;
        java.nio.charset.Charset charset82 = outputSettings80.charset();
        org.jsoup.nodes.Document.OutputSettings outputSettings83 = outputSettings80.clone();
        outputSettings83.indentAmount = 0;
        org.jsoup.nodes.Document.OutputSettings outputSettings86 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Document.OutputSettings outputSettings88 = outputSettings86.indentAmount((int) 'a');
        org.jsoup.nodes.Entities.EscapeMode escapeMode89 = outputSettings88.escapeMode;
        java.nio.charset.Charset charset90 = outputSettings88.charset;
        outputSettings83.setcharset(charset90);
        org.jsoup.nodes.Document.OutputSettings outputSettings92 = outputSettings66.charset(charset90);
        org.jsoup.nodes.Document.OutputSettings outputSettings93 = outputSettings51.charset(charset90);
        outputSettings31.charset = charset90;
        org.jsoup.nodes.Document.OutputSettings outputSettings95 = outputSettings23.charset(charset90);
        org.jsoup.nodes.Entities.EscapeMode escapeMode96 = outputSettings95.escapeMode();
        org.junit.Assert.assertNotNull(outputSettings2);
        org.junit.Assert.assertNotNull(outputSettings5);
        org.junit.Assert.assertTrue("'" + escapeMode6 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode6.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertNotNull(charset7);
        org.junit.Assert.assertTrue("'" + escapeMode10 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode10.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(outputSettings15);
        org.junit.Assert.assertTrue("'" + escapeMode16 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode16.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1 + "'", int21 == 1);
        org.junit.Assert.assertNotNull(outputSettings23);
        org.junit.Assert.assertNotNull(charset24);
        org.junit.Assert.assertNotNull(outputSettings25);
        org.junit.Assert.assertNotNull(outputSettings28);
        org.junit.Assert.assertTrue("'" + escapeMode29 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode29.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertNotNull(charset30);
        org.junit.Assert.assertNotNull(outputSettings31);
        org.junit.Assert.assertNotNull(outputSettings36);
        org.junit.Assert.assertTrue("'" + escapeMode37 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode37.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertNotNull(charset38);
        org.junit.Assert.assertNotNull(outputSettings41);
        org.junit.Assert.assertNotNull(charsetEncoder44);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertNotNull(outputSettings50);
        org.junit.Assert.assertNotNull(outputSettings51);
        org.junit.Assert.assertNotNull(charsetEncoder54);
        org.junit.Assert.assertNotNull(outputSettings57);
        org.junit.Assert.assertTrue("'" + escapeMode58 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode58.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertNotNull(charset59);
        org.junit.Assert.assertTrue("'" + escapeMode60 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode60.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + true + "'", boolean61 == true);
        org.junit.Assert.assertNotNull(outputSettings64);
        org.junit.Assert.assertTrue("'" + escapeMode65 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode65.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertNotNull(outputSettings66);
        org.junit.Assert.assertNotNull(outputSettings71);
        org.junit.Assert.assertTrue("'" + escapeMode72 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode72.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertNotNull(charset73);
        org.junit.Assert.assertTrue("'" + escapeMode74 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode74.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertTrue("'" + int75 + "' != '" + 97 + "'", int75 == 97);
        org.junit.Assert.assertNotNull(charsetEncoder76);
        org.junit.Assert.assertNotNull(outputSettings80);
        org.junit.Assert.assertTrue("'" + escapeMode81 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode81.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertNotNull(charset82);
        org.junit.Assert.assertNotNull(outputSettings83);
        org.junit.Assert.assertNotNull(outputSettings88);
        org.junit.Assert.assertTrue("'" + escapeMode89 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode89.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertNotNull(charset90);
        org.junit.Assert.assertNotNull(outputSettings92);
        org.junit.Assert.assertNotNull(outputSettings93);
        org.junit.Assert.assertNotNull(outputSettings95);
        org.junit.Assert.assertTrue("'" + escapeMode96 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode96.equals(org.jsoup.nodes.Entities.EscapeMode.base));
    }

    @Test
    public void test16115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16115");
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
        boolean boolean22 = textNode2.isBlank();
        org.jsoup.nodes.TextNode textNode24 = textNode2.text("");
        java.lang.String str26 = textNode2.absUrl("hi!");
        java.lang.String str28 = textNode2.attr("");
        org.jsoup.nodes.TextNode textNode30 = textNode2.text("hi!");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node32 = textNode2.childNode((int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 97");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "text" + "'", str5, "text");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "#text" + "'", str6, "#text");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(nodeList14);
        org.junit.Assert.assertNull(document17);
        org.junit.Assert.assertNotNull(attributes18);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "text" + "'", str19, "text");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "#text" + "'", str21, "#text");
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(textNode24);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "" + "'", str26, "");
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "" + "'", str28, "");
        org.junit.Assert.assertNotNull(textNode30);
    }

    @Test
    public void test16116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16116");
        org.jsoup.nodes.Document.OutputSettings outputSettings0 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Document.OutputSettings outputSettings2 = outputSettings0.indentAmount((int) 'a');
        outputSettings2.prettyPrint = false;
        org.jsoup.nodes.Document.OutputSettings outputSettings6 = outputSettings2.forceAllElementAsBlock(false);
        java.nio.charset.Charset charset7 = outputSettings6.getcharset();
        java.nio.charset.CharsetEncoder charsetEncoder8 = outputSettings6.encoder();
        outputSettings6.setprettyPrint(false);
        java.nio.charset.CharsetEncoder charsetEncoder11 = outputSettings6.encoder();
        org.jsoup.nodes.Document.OutputSettings outputSettings12 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Document.OutputSettings outputSettings14 = outputSettings12.indentAmount((int) 'a');
        org.jsoup.nodes.Entities.EscapeMode escapeMode15 = outputSettings14.escapeMode;
        java.nio.charset.Charset charset16 = outputSettings14.charset();
        org.jsoup.nodes.Entities.EscapeMode escapeMode17 = outputSettings14.escapeMode;
        boolean boolean18 = outputSettings14.prettyPrint;
        boolean boolean19 = outputSettings14.forceAllElementAsBlock;
        boolean boolean20 = outputSettings14.getforceAllElementAsBlock();
        boolean boolean21 = outputSettings14.getprettyPrint();
        java.nio.charset.Charset charset22 = outputSettings14.getcharset();
        outputSettings14.indentAmount = (short) -1;
        org.jsoup.nodes.Document.OutputSettings outputSettings26 = outputSettings14.forceAllElementAsBlock(true);
        outputSettings26.prettyPrint = true;
        org.jsoup.nodes.Document.OutputSettings outputSettings29 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Document.OutputSettings outputSettings31 = outputSettings29.indentAmount((int) 'a');
        org.jsoup.nodes.Document.OutputSettings outputSettings32 = outputSettings29.clone();
        outputSettings29.forceAllElementAsBlock = false;
        org.jsoup.nodes.Entities.EscapeMode escapeMode35 = outputSettings29.escapeMode;
        java.nio.charset.CharsetEncoder charsetEncoder36 = outputSettings29.encoder();
        outputSettings26.setcharsetEncoder(charsetEncoder36);
        outputSettings26.setforceAllElementAsBlock(false);
        org.jsoup.nodes.Document.OutputSettings outputSettings40 = outputSettings26.clone();
        boolean boolean41 = outputSettings26.forceAllElementAsBlock();
        org.jsoup.nodes.Entities.EscapeMode escapeMode42 = outputSettings26.escapeMode();
        outputSettings6.setescapeMode(escapeMode42);
        org.junit.Assert.assertNotNull(outputSettings2);
        org.junit.Assert.assertNotNull(outputSettings6);
        org.junit.Assert.assertNotNull(charset7);
        org.junit.Assert.assertNotNull(charsetEncoder8);
        org.junit.Assert.assertNotNull(charsetEncoder11);
        org.junit.Assert.assertNotNull(outputSettings14);
        org.junit.Assert.assertTrue("'" + escapeMode15 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode15.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertNotNull(charset16);
        org.junit.Assert.assertTrue("'" + escapeMode17 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode17.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertNotNull(charset22);
        org.junit.Assert.assertNotNull(outputSettings26);
        org.junit.Assert.assertNotNull(outputSettings31);
        org.junit.Assert.assertNotNull(outputSettings32);
        org.junit.Assert.assertTrue("'" + escapeMode35 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode35.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertNotNull(charsetEncoder36);
        org.junit.Assert.assertNotNull(outputSettings40);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertTrue("'" + escapeMode42 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode42.equals(org.jsoup.nodes.Entities.EscapeMode.base));
    }

    @Test
    public void test16117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16117");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("", "hi!");
        java.lang.String str4 = textNode2.absUrl("#text");
        java.lang.StringBuilder stringBuilder5 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings7 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Document.OutputSettings outputSettings9 = outputSettings7.indentAmount((int) 'a');
        org.jsoup.nodes.Entities.EscapeMode escapeMode10 = outputSettings9.escapeMode;
        java.nio.charset.Charset charset11 = outputSettings9.charset();
        org.jsoup.nodes.Entities.EscapeMode escapeMode12 = outputSettings9.escapeMode;
        boolean boolean13 = outputSettings9.prettyPrint;
        org.jsoup.nodes.Document.OutputSettings outputSettings14 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Document.OutputSettings outputSettings16 = outputSettings14.indentAmount((int) 'a');
        org.jsoup.nodes.Entities.EscapeMode escapeMode17 = outputSettings16.escapeMode;
        java.nio.charset.Charset charset18 = outputSettings16.charset();
        outputSettings16.setindentAmount(0);
        org.jsoup.nodes.Entities.EscapeMode escapeMode21 = outputSettings16.escapeMode;
        org.jsoup.nodes.Document.OutputSettings outputSettings22 = outputSettings9.escapeMode(escapeMode21);
        org.jsoup.nodes.Document.OutputSettings outputSettings23 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Document.OutputSettings outputSettings25 = outputSettings23.indentAmount((int) 'a');
        org.jsoup.nodes.Entities.EscapeMode escapeMode26 = outputSettings25.escapeMode;
        java.nio.charset.Charset charset27 = outputSettings25.charset();
        org.jsoup.nodes.Entities.EscapeMode escapeMode28 = outputSettings25.escapeMode;
        boolean boolean29 = outputSettings25.prettyPrint;
        boolean boolean30 = outputSettings25.forceAllElementAsBlock;
        boolean boolean31 = outputSettings25.getforceAllElementAsBlock();
        boolean boolean32 = outputSettings25.getprettyPrint();
        java.nio.charset.Charset charset33 = outputSettings25.getcharset();
        outputSettings9.charset = charset33;
        textNode2.outerHtmlTail(stringBuilder5, (int) (short) 1, outputSettings9);
        java.lang.String str37 = textNode2.absUrl("hi!");
        org.jsoup.nodes.Document document38 = textNode2.ownerDocument();
        java.lang.String str39 = textNode2.getWholeText();
        org.jsoup.nodes.Document document40 = textNode2.ownerDocument();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node42 = document40.before("text");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(outputSettings9);
        org.junit.Assert.assertTrue("'" + escapeMode10 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode10.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertNotNull(charset11);
        org.junit.Assert.assertTrue("'" + escapeMode12 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode12.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNotNull(outputSettings16);
        org.junit.Assert.assertTrue("'" + escapeMode17 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode17.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertNotNull(charset18);
        org.junit.Assert.assertTrue("'" + escapeMode21 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode21.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertNotNull(outputSettings22);
        org.junit.Assert.assertNotNull(outputSettings25);
        org.junit.Assert.assertTrue("'" + escapeMode26 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode26.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertNotNull(charset27);
        org.junit.Assert.assertTrue("'" + escapeMode28 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode28.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + true + "'", boolean32 == true);
        org.junit.Assert.assertNotNull(charset33);
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "" + "'", str37, "");
        org.junit.Assert.assertNull(document38);
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "" + "'", str39, "");
        org.junit.Assert.assertNull(document40);
    }

    @Test
    public void test16118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16118");
        org.jsoup.nodes.Document.OutputSettings outputSettings0 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Document.OutputSettings outputSettings2 = outputSettings0.indentAmount((int) 'a');
        java.nio.charset.Charset charset3 = outputSettings0.getcharset();
        boolean boolean4 = outputSettings0.prettyPrint();
        boolean boolean5 = outputSettings0.forceAllElementAsBlock;
        boolean boolean6 = outputSettings0.forceAllElementAsBlock();
        int int7 = outputSettings0.indentAmount();
        outputSettings0.indentAmount = (short) 10;
        outputSettings0.prettyPrint = true;
        boolean boolean12 = outputSettings0.getforceAllElementAsBlock();
        boolean boolean13 = outputSettings0.prettyPrint();
        outputSettings0.setforceAllElementAsBlock(true);
        org.junit.Assert.assertNotNull(outputSettings2);
        org.junit.Assert.assertNotNull(charset3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 97 + "'", int7 == 97);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
    }

    @Test
    public void test16119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16119");
        org.jsoup.nodes.Document.OutputSettings outputSettings0 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Document.OutputSettings outputSettings2 = outputSettings0.indentAmount((int) 'a');
        org.jsoup.nodes.Entities.EscapeMode escapeMode3 = outputSettings2.escapeMode;
        java.nio.charset.Charset charset4 = outputSettings2.charset();
        org.jsoup.nodes.Document.OutputSettings outputSettings5 = outputSettings2.clone();
        outputSettings2.forceAllElementAsBlock = true;
        org.jsoup.nodes.Entities.EscapeMode escapeMode8 = outputSettings2.escapeMode;
        org.jsoup.nodes.Document.OutputSettings outputSettings9 = new org.jsoup.nodes.Document.OutputSettings();
        boolean boolean10 = outputSettings9.prettyPrint;
        org.jsoup.nodes.Document.OutputSettings outputSettings11 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Document.OutputSettings outputSettings13 = outputSettings11.indentAmount((int) 'a');
        org.jsoup.nodes.Entities.EscapeMode escapeMode14 = outputSettings13.escapeMode;
        java.nio.charset.Charset charset15 = outputSettings13.charset();
        org.jsoup.nodes.Document.OutputSettings outputSettings16 = outputSettings9.charset(charset15);
        outputSettings2.charset = charset15;
        org.jsoup.nodes.Document.OutputSettings outputSettings18 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Document.OutputSettings outputSettings20 = outputSettings18.indentAmount((int) 'a');
        org.jsoup.nodes.Entities.EscapeMode escapeMode21 = outputSettings20.escapeMode;
        java.nio.charset.Charset charset22 = outputSettings20.charset();
        org.jsoup.nodes.Entities.EscapeMode escapeMode23 = outputSettings20.escapeMode;
        boolean boolean24 = outputSettings20.prettyPrint;
        org.jsoup.nodes.Document.OutputSettings outputSettings25 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Document.OutputSettings outputSettings27 = outputSettings25.indentAmount((int) 'a');
        org.jsoup.nodes.Entities.EscapeMode escapeMode28 = outputSettings27.escapeMode;
        org.jsoup.nodes.Document.OutputSettings outputSettings29 = outputSettings20.escapeMode(escapeMode28);
        outputSettings20.forceAllElementAsBlock = false;
        outputSettings20.setforceAllElementAsBlock(true);
        java.nio.charset.CharsetEncoder charsetEncoder34 = outputSettings20.encoder();
        outputSettings2.setcharsetEncoder(charsetEncoder34);
        boolean boolean36 = outputSettings2.forceAllElementAsBlock;
        int int37 = outputSettings2.indentAmount();
        outputSettings2.setindentAmount((int) (short) 10);
        org.jsoup.nodes.Document.OutputSettings outputSettings40 = new org.jsoup.nodes.Document.OutputSettings();
        boolean boolean41 = outputSettings40.prettyPrint;
        org.jsoup.nodes.Document.OutputSettings outputSettings42 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Document.OutputSettings outputSettings44 = outputSettings42.indentAmount((int) 'a');
        org.jsoup.nodes.Entities.EscapeMode escapeMode45 = outputSettings44.escapeMode;
        java.nio.charset.Charset charset46 = outputSettings44.charset();
        org.jsoup.nodes.Document.OutputSettings outputSettings47 = outputSettings40.charset(charset46);
        boolean boolean48 = outputSettings47.getforceAllElementAsBlock();
        outputSettings47.forceAllElementAsBlock = false;
        java.nio.charset.CharsetEncoder charsetEncoder51 = outputSettings47.charsetEncoder;
        java.nio.charset.CharsetEncoder charsetEncoder52 = outputSettings47.getcharsetEncoder();
        org.jsoup.nodes.Document.OutputSettings outputSettings53 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Document.OutputSettings outputSettings55 = outputSettings53.indentAmount((int) 'a');
        outputSettings55.prettyPrint = false;
        java.nio.charset.Charset charset58 = outputSettings55.getcharset();
        outputSettings47.setcharset(charset58);
        boolean boolean60 = outputSettings47.forceAllElementAsBlock;
        org.jsoup.nodes.Entities.EscapeMode escapeMode61 = outputSettings47.getescapeMode();
        org.jsoup.nodes.Document.OutputSettings outputSettings62 = outputSettings2.escapeMode(escapeMode61);
        int int63 = outputSettings2.indentAmount();
        org.junit.Assert.assertNotNull(outputSettings2);
        org.junit.Assert.assertTrue("'" + escapeMode3 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode3.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertNotNull(charset4);
        org.junit.Assert.assertNotNull(outputSettings5);
        org.junit.Assert.assertTrue("'" + escapeMode8 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode8.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(outputSettings13);
        org.junit.Assert.assertTrue("'" + escapeMode14 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode14.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertNotNull(charset15);
        org.junit.Assert.assertNotNull(outputSettings16);
        org.junit.Assert.assertNotNull(outputSettings20);
        org.junit.Assert.assertTrue("'" + escapeMode21 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode21.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertNotNull(charset22);
        org.junit.Assert.assertTrue("'" + escapeMode23 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode23.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertNotNull(outputSettings27);
        org.junit.Assert.assertTrue("'" + escapeMode28 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode28.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertNotNull(outputSettings29);
        org.junit.Assert.assertNotNull(charsetEncoder34);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + true + "'", boolean36 == true);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 97 + "'", int37 == 97);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + true + "'", boolean41 == true);
        org.junit.Assert.assertNotNull(outputSettings44);
        org.junit.Assert.assertTrue("'" + escapeMode45 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode45.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertNotNull(charset46);
        org.junit.Assert.assertNotNull(outputSettings47);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertNotNull(charsetEncoder51);
        org.junit.Assert.assertNotNull(charsetEncoder52);
        org.junit.Assert.assertNotNull(outputSettings55);
        org.junit.Assert.assertNotNull(charset58);
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + false + "'", boolean60 == false);
        org.junit.Assert.assertTrue("'" + escapeMode61 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode61.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertNotNull(outputSettings62);
        org.junit.Assert.assertTrue("'" + int63 + "' != '" + 10 + "'", int63 == 10);
    }

    @Test
    public void test16120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16120");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("", "hi!");
        java.lang.String str3 = textNode2.text;
        java.lang.String str4 = textNode2.outerHtml();
        textNode2.text = "text";
        textNode2.ensureAttributes();
        java.lang.String str8 = textNode2.getTEXT_KEY();
        org.jsoup.nodes.Document document9 = textNode2.ownerDocument();
        org.jsoup.nodes.Attributes attributes10 = textNode2.attributes();
        java.lang.String str11 = textNode2.text;
        textNode2.text = "#";
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "text" + "'", str8, "text");
        org.junit.Assert.assertNull(document9);
        org.junit.Assert.assertNotNull(attributes10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "text" + "'", str11, "text");
    }

    @Test
    public void test16121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16121");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("", "hi!");
        java.lang.String str3 = textNode2.text;
        java.lang.String str4 = textNode2.outerHtml();
        java.lang.String str5 = textNode2.getTEXT_KEY();
        java.lang.String str6 = textNode2.text;
        org.jsoup.nodes.Node node7 = textNode2.clone();
        java.lang.String str8 = textNode2.getWholeText();
        java.lang.String str10 = textNode2.absUrl("#text");
        textNode2.ensureAttributes();
        org.jsoup.nodes.TextNode textNode14 = new org.jsoup.nodes.TextNode("", "hi!");
        java.lang.String str15 = textNode14.text;
        boolean boolean17 = textNode14.hasAttr("hi!");
        org.jsoup.nodes.Node node18 = textNode14.parent();
        textNode14.settext("#text");
        java.lang.StringBuilder stringBuilder21 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings23 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Document.OutputSettings outputSettings25 = outputSettings23.indentAmount((int) 'a');
        outputSettings25.prettyPrint = false;
        int int28 = outputSettings25.indentAmount;
        org.jsoup.nodes.Document.OutputSettings outputSettings29 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Document.OutputSettings outputSettings31 = outputSettings29.indentAmount((int) 'a');
        org.jsoup.nodes.Entities.EscapeMode escapeMode32 = outputSettings31.escapeMode;
        java.nio.charset.Charset charset33 = outputSettings31.charset();
        org.jsoup.nodes.Document.OutputSettings outputSettings34 = outputSettings31.clone();
        outputSettings31.forceAllElementAsBlock = true;
        org.jsoup.nodes.Entities.EscapeMode escapeMode37 = outputSettings31.escapeMode;
        int int38 = outputSettings31.getindentAmount();
        org.jsoup.nodes.Document.OutputSettings outputSettings40 = outputSettings31.prettyPrint(false);
        java.nio.charset.Charset charset41 = outputSettings31.charset();
        outputSettings25.charset = charset41;
        textNode14.outerHtmlTail(stringBuilder21, (int) (short) 1, outputSettings25);
        java.lang.String str44 = textNode14.outerHtml();
        org.jsoup.nodes.Node node45 = textNode14.clone();
        boolean boolean46 = textNode2.equals((java.lang.Object) textNode14);
        int int47 = textNode14.siblingIndex();
        java.lang.String str49 = textNode14.attr("#text");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "text" + "'", str5, "text");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(node7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNull(node18);
        org.junit.Assert.assertNotNull(outputSettings25);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 97 + "'", int28 == 97);
        org.junit.Assert.assertNotNull(outputSettings31);
        org.junit.Assert.assertTrue("'" + escapeMode32 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode32.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertNotNull(charset33);
        org.junit.Assert.assertNotNull(outputSettings34);
        org.junit.Assert.assertTrue("'" + escapeMode37 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode37.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 97 + "'", int38 == 97);
        org.junit.Assert.assertNotNull(outputSettings40);
        org.junit.Assert.assertNotNull(charset41);
        org.junit.Assert.assertEquals("'" + str44 + "' != '" + "" + "'", str44, "");
        org.junit.Assert.assertNotNull(node45);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertTrue("'" + int47 + "' != '" + 0 + "'", int47 == 0);
        org.junit.Assert.assertEquals("'" + str49 + "' != '" + "" + "'", str49, "");
    }

    @Test
    public void test16122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16122");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("", "");
        java.lang.StringBuilder stringBuilder3 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings5 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Document.OutputSettings outputSettings7 = outputSettings5.indentAmount((int) 'a');
        org.jsoup.nodes.Entities.EscapeMode escapeMode8 = outputSettings7.escapeMode;
        java.nio.charset.Charset charset9 = outputSettings7.charset();
        org.jsoup.nodes.Document.OutputSettings outputSettings10 = outputSettings7.clone();
        outputSettings7.forceAllElementAsBlock = true;
        outputSettings7.setprettyPrint(true);
        org.jsoup.nodes.Document.OutputSettings outputSettings16 = outputSettings7.prettyPrint(true);
        org.jsoup.nodes.Entities.EscapeMode escapeMode17 = outputSettings16.escapeMode;
        textNode2.outerHtmlTail(stringBuilder3, (int) '4', outputSettings16);
        org.jsoup.nodes.Document.OutputSettings outputSettings19 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Document.OutputSettings outputSettings21 = outputSettings19.indentAmount((int) 'a');
        org.jsoup.nodes.Entities.EscapeMode escapeMode22 = outputSettings21.escapeMode;
        java.nio.charset.Charset charset23 = outputSettings21.charset();
        outputSettings21.setindentAmount(0);
        org.jsoup.nodes.Entities.EscapeMode escapeMode26 = outputSettings21.escapeMode;
        org.jsoup.nodes.Document.OutputSettings outputSettings28 = outputSettings21.indentAmount((int) (byte) 10);
        boolean boolean29 = outputSettings21.forceAllElementAsBlock;
        org.jsoup.nodes.Document.OutputSettings outputSettings30 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Document.OutputSettings outputSettings32 = outputSettings30.indentAmount((int) 'a');
        org.jsoup.nodes.Entities.EscapeMode escapeMode33 = outputSettings32.escapeMode;
        java.nio.charset.Charset charset34 = outputSettings32.charset();
        org.jsoup.nodes.Entities.EscapeMode escapeMode35 = outputSettings32.escapeMode;
        boolean boolean36 = outputSettings32.prettyPrint;
        org.jsoup.nodes.Document.OutputSettings outputSettings37 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Document.OutputSettings outputSettings39 = outputSettings37.indentAmount((int) 'a');
        org.jsoup.nodes.Entities.EscapeMode escapeMode40 = outputSettings39.escapeMode;
        java.nio.charset.Charset charset41 = outputSettings39.charset();
        outputSettings39.setindentAmount(0);
        org.jsoup.nodes.Entities.EscapeMode escapeMode44 = outputSettings39.escapeMode;
        org.jsoup.nodes.Document.OutputSettings outputSettings45 = outputSettings32.escapeMode(escapeMode44);
        outputSettings21.setescapeMode(escapeMode44);
        org.jsoup.nodes.Document.OutputSettings outputSettings47 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Document.OutputSettings outputSettings49 = outputSettings47.indentAmount((int) 'a');
        org.jsoup.nodes.Document.OutputSettings outputSettings50 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Document.OutputSettings outputSettings52 = outputSettings50.indentAmount((int) 'a');
        org.jsoup.nodes.Entities.EscapeMode escapeMode53 = outputSettings52.escapeMode;
        java.nio.charset.Charset charset54 = outputSettings52.charset();
        outputSettings52.setindentAmount(0);
        org.jsoup.nodes.Entities.EscapeMode escapeMode57 = outputSettings52.escapeMode;
        outputSettings49.setescapeMode(escapeMode57);
        org.jsoup.nodes.Document.OutputSettings outputSettings60 = outputSettings49.prettyPrint(false);
        java.nio.charset.Charset charset61 = outputSettings60.getcharset();
        outputSettings21.charset = charset61;
        org.jsoup.nodes.Document.OutputSettings outputSettings63 = outputSettings16.charset(charset61);
        org.jsoup.nodes.Document.OutputSettings outputSettings64 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Document.OutputSettings outputSettings66 = outputSettings64.indentAmount((int) 'a');
        java.nio.charset.Charset charset67 = outputSettings64.getcharset();
        org.jsoup.nodes.Document.OutputSettings outputSettings68 = new org.jsoup.nodes.Document.OutputSettings();
        boolean boolean69 = outputSettings68.prettyPrint;
        org.jsoup.nodes.Document.OutputSettings outputSettings70 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Document.OutputSettings outputSettings72 = outputSettings70.indentAmount((int) 'a');
        org.jsoup.nodes.Entities.EscapeMode escapeMode73 = outputSettings72.escapeMode;
        java.nio.charset.Charset charset74 = outputSettings72.charset();
        org.jsoup.nodes.Document.OutputSettings outputSettings75 = outputSettings68.charset(charset74);
        boolean boolean76 = outputSettings75.getforceAllElementAsBlock();
        boolean boolean77 = outputSettings75.forceAllElementAsBlock();
        org.jsoup.nodes.Document.OutputSettings outputSettings78 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Document.OutputSettings outputSettings80 = outputSettings78.indentAmount((int) 'a');
        org.jsoup.nodes.Document.OutputSettings outputSettings81 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Document.OutputSettings outputSettings83 = outputSettings81.indentAmount((int) 'a');
        org.jsoup.nodes.Entities.EscapeMode escapeMode84 = outputSettings83.escapeMode;
        java.nio.charset.Charset charset85 = outputSettings83.charset();
        outputSettings83.setindentAmount(0);
        org.jsoup.nodes.Entities.EscapeMode escapeMode88 = outputSettings83.escapeMode;
        outputSettings80.setescapeMode(escapeMode88);
        outputSettings75.setescapeMode(escapeMode88);
        org.jsoup.nodes.Document.OutputSettings outputSettings91 = outputSettings64.escapeMode(escapeMode88);
        org.jsoup.nodes.Document.OutputSettings outputSettings92 = outputSettings16.escapeMode(escapeMode88);
        boolean boolean93 = outputSettings16.getprettyPrint();
        java.nio.charset.CharsetEncoder charsetEncoder94 = outputSettings16.encoder();
        outputSettings16.forceAllElementAsBlock = true;
        org.jsoup.nodes.Document.OutputSettings outputSettings98 = outputSettings16.forceAllElementAsBlock(false);
        java.nio.charset.Charset charset99 = outputSettings98.charset;
        org.junit.Assert.assertNotNull(outputSettings7);
        org.junit.Assert.assertTrue("'" + escapeMode8 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode8.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertNotNull(charset9);
        org.junit.Assert.assertNotNull(outputSettings10);
        org.junit.Assert.assertNotNull(outputSettings16);
        org.junit.Assert.assertTrue("'" + escapeMode17 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode17.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertNotNull(outputSettings21);
        org.junit.Assert.assertTrue("'" + escapeMode22 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode22.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertNotNull(charset23);
        org.junit.Assert.assertTrue("'" + escapeMode26 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode26.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertNotNull(outputSettings28);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertNotNull(outputSettings32);
        org.junit.Assert.assertTrue("'" + escapeMode33 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode33.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertNotNull(charset34);
        org.junit.Assert.assertTrue("'" + escapeMode35 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode35.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + true + "'", boolean36 == true);
        org.junit.Assert.assertNotNull(outputSettings39);
        org.junit.Assert.assertTrue("'" + escapeMode40 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode40.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertNotNull(charset41);
        org.junit.Assert.assertTrue("'" + escapeMode44 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode44.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertNotNull(outputSettings45);
        org.junit.Assert.assertNotNull(outputSettings49);
        org.junit.Assert.assertNotNull(outputSettings52);
        org.junit.Assert.assertTrue("'" + escapeMode53 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode53.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertNotNull(charset54);
        org.junit.Assert.assertTrue("'" + escapeMode57 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode57.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertNotNull(outputSettings60);
        org.junit.Assert.assertNotNull(charset61);
        org.junit.Assert.assertNotNull(outputSettings63);
        org.junit.Assert.assertNotNull(outputSettings66);
        org.junit.Assert.assertNotNull(charset67);
        org.junit.Assert.assertTrue("'" + boolean69 + "' != '" + true + "'", boolean69 == true);
        org.junit.Assert.assertNotNull(outputSettings72);
        org.junit.Assert.assertTrue("'" + escapeMode73 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode73.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertNotNull(charset74);
        org.junit.Assert.assertNotNull(outputSettings75);
        org.junit.Assert.assertTrue("'" + boolean76 + "' != '" + false + "'", boolean76 == false);
        org.junit.Assert.assertTrue("'" + boolean77 + "' != '" + false + "'", boolean77 == false);
        org.junit.Assert.assertNotNull(outputSettings80);
        org.junit.Assert.assertNotNull(outputSettings83);
        org.junit.Assert.assertTrue("'" + escapeMode84 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode84.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertNotNull(charset85);
        org.junit.Assert.assertTrue("'" + escapeMode88 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode88.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertNotNull(outputSettings91);
        org.junit.Assert.assertNotNull(outputSettings92);
        org.junit.Assert.assertTrue("'" + boolean93 + "' != '" + true + "'", boolean93 == true);
        org.junit.Assert.assertNotNull(charsetEncoder94);
        org.junit.Assert.assertNotNull(outputSettings98);
        org.junit.Assert.assertNotNull(charset99);
    }

    @Test
    public void test16123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16123");
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
        org.jsoup.nodes.Attributes attributes15 = textNode2.attributes();
        textNode2.settext("text");
        org.jsoup.nodes.Document document18 = textNode2.ownerDocument();
        textNode2.text = "#text";
        java.lang.String str21 = textNode2.nodeName();
        org.jsoup.nodes.TextNode textNode23 = textNode2.text("hi!");
        org.jsoup.nodes.Document.OutputSettings outputSettings24 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Document.OutputSettings outputSettings26 = outputSettings24.indentAmount((int) 'a');
        org.jsoup.nodes.Entities.EscapeMode escapeMode27 = outputSettings26.escapeMode;
        java.nio.charset.Charset charset28 = outputSettings26.charset();
        org.jsoup.nodes.Entities.EscapeMode escapeMode29 = outputSettings26.escapeMode;
        boolean boolean30 = outputSettings26.prettyPrint;
        org.jsoup.nodes.Document.OutputSettings outputSettings31 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Document.OutputSettings outputSettings33 = outputSettings31.indentAmount((int) 'a');
        org.jsoup.nodes.Entities.EscapeMode escapeMode34 = outputSettings33.escapeMode;
        org.jsoup.nodes.Document.OutputSettings outputSettings35 = outputSettings26.escapeMode(escapeMode34);
        java.nio.charset.CharsetEncoder charsetEncoder36 = outputSettings35.encoder();
        boolean boolean37 = textNode2.equals((java.lang.Object) charsetEncoder36);
        boolean boolean38 = textNode2.isBlank();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "text" + "'", str5, "text");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNotNull(nodeList8);
        org.junit.Assert.assertNotNull(textNode10);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "#text" + "'", str13, "#text");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(attributes15);
        org.junit.Assert.assertNull(document18);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "#text" + "'", str21, "#text");
        org.junit.Assert.assertNotNull(textNode23);
        org.junit.Assert.assertNotNull(outputSettings26);
        org.junit.Assert.assertTrue("'" + escapeMode27 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode27.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertNotNull(charset28);
        org.junit.Assert.assertTrue("'" + escapeMode29 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode29.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertNotNull(outputSettings33);
        org.junit.Assert.assertTrue("'" + escapeMode34 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode34.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertNotNull(outputSettings35);
        org.junit.Assert.assertNotNull(charsetEncoder36);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
    }

    @Test
    public void test16124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16124");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("", "hi!");
        java.lang.String str3 = textNode2.text;
        java.lang.String str4 = textNode2.outerHtml();
        java.lang.String str5 = textNode2.getTEXT_KEY();
        java.lang.String str6 = textNode2.nodeName();
        org.jsoup.nodes.Attributes attributes7 = textNode2.attributes();
        java.lang.String str8 = textNode2.toString();
        java.lang.String str10 = textNode2.absUrl("text");
        java.lang.String str11 = textNode2.getWholeText();
        java.lang.String str13 = textNode2.attr("#text");
        org.jsoup.nodes.Node node14 = textNode2.parent();
        textNode2.setBaseUri("#");
        java.lang.String str17 = textNode2.getWholeText();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "text" + "'", str5, "text");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "#text" + "'", str6, "#text");
        org.junit.Assert.assertNotNull(attributes7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNull(node14);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
    }

    @Test
    public void test16125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16125");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("", "hi!");
        java.lang.String str3 = textNode2.text;
        boolean boolean5 = textNode2.hasAttr("hi!");
        org.jsoup.nodes.Node node6 = textNode2.parent();
        textNode2.settext("hi!");
        java.lang.String str9 = textNode2.getTEXT_KEY();
        boolean boolean11 = textNode2.hasAttr("");
        org.jsoup.nodes.TextNode textNode13 = textNode2.text("hi!");
        org.jsoup.nodes.TextNode textNode15 = textNode2.splitText(1);
        org.jsoup.nodes.Node node16 = textNode15.clone();
        textNode15.setBaseUri("h");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(node6);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "text" + "'", str9, "text");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(textNode13);
        org.junit.Assert.assertNotNull(textNode15);
        org.junit.Assert.assertNotNull(node16);
    }

    @Test
    public void test16126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16126");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("", "hi!");
        java.lang.String str3 = textNode2.getWholeText();
        java.lang.String str4 = textNode2.baseUri();
        java.lang.String str5 = textNode2.gettext();
        boolean boolean7 = textNode2.hasAttr("hi!");
        org.jsoup.nodes.Attributes attributes8 = textNode2.attributes();
        boolean boolean10 = textNode2.hasAttr("");
        org.jsoup.nodes.Node node11 = textNode2.clone();
        java.lang.String str12 = textNode2.toString();
        java.lang.String str14 = textNode2.attr("#");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(attributes8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(node11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
    }

    @Test
    public void test16127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16127");
        org.jsoup.nodes.Document.OutputSettings outputSettings0 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Document.OutputSettings outputSettings2 = outputSettings0.indentAmount((int) 'a');
        java.nio.charset.Charset charset3 = outputSettings0.getcharset();
        boolean boolean4 = outputSettings0.prettyPrint();
        boolean boolean5 = outputSettings0.forceAllElementAsBlock;
        outputSettings0.indentAmount = (byte) 100;
        int int8 = outputSettings0.indentAmount;
        org.jsoup.nodes.Document.OutputSettings outputSettings9 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Document.OutputSettings outputSettings11 = outputSettings9.indentAmount((int) 'a');
        org.jsoup.nodes.Document.OutputSettings outputSettings12 = outputSettings9.clone();
        outputSettings9.forceAllElementAsBlock = false;
        org.jsoup.nodes.Entities.EscapeMode escapeMode15 = outputSettings9.escapeMode;
        org.jsoup.nodes.Document.OutputSettings outputSettings16 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Document.OutputSettings outputSettings18 = outputSettings16.indentAmount((int) 'a');
        org.jsoup.nodes.Entities.EscapeMode escapeMode19 = outputSettings18.escapeMode;
        java.nio.charset.Charset charset20 = outputSettings18.charset();
        org.jsoup.nodes.Entities.EscapeMode escapeMode21 = outputSettings18.escapeMode;
        boolean boolean22 = outputSettings18.prettyPrint;
        org.jsoup.nodes.Entities.EscapeMode escapeMode23 = outputSettings18.getescapeMode();
        org.jsoup.nodes.Document.OutputSettings outputSettings24 = outputSettings9.escapeMode(escapeMode23);
        java.nio.charset.Charset charset25 = outputSettings9.getcharset();
        outputSettings0.setcharset(charset25);
        org.jsoup.nodes.Document.OutputSettings outputSettings28 = outputSettings0.prettyPrint(false);
        org.jsoup.nodes.Document.OutputSettings outputSettings29 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Document.OutputSettings outputSettings31 = outputSettings29.indentAmount((int) 'a');
        org.jsoup.nodes.Document.OutputSettings outputSettings32 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Document.OutputSettings outputSettings34 = outputSettings32.indentAmount((int) 'a');
        org.jsoup.nodes.Entities.EscapeMode escapeMode35 = outputSettings34.escapeMode;
        java.nio.charset.Charset charset36 = outputSettings34.charset();
        outputSettings34.setindentAmount(0);
        org.jsoup.nodes.Entities.EscapeMode escapeMode39 = outputSettings34.escapeMode;
        outputSettings31.setescapeMode(escapeMode39);
        boolean boolean41 = outputSettings31.prettyPrint();
        boolean boolean42 = outputSettings31.prettyPrint();
        java.nio.charset.Charset charset43 = outputSettings31.charset;
        org.jsoup.nodes.Document.OutputSettings outputSettings44 = outputSettings28.charset(charset43);
        java.nio.charset.CharsetEncoder charsetEncoder45 = outputSettings28.getcharsetEncoder();
        int int46 = outputSettings28.indentAmount();
        org.jsoup.nodes.Document.OutputSettings outputSettings48 = outputSettings28.forceAllElementAsBlock(false);
        int int49 = outputSettings28.indentAmount();
        org.junit.Assert.assertNotNull(outputSettings2);
        org.junit.Assert.assertNotNull(charset3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 100 + "'", int8 == 100);
        org.junit.Assert.assertNotNull(outputSettings11);
        org.junit.Assert.assertNotNull(outputSettings12);
        org.junit.Assert.assertTrue("'" + escapeMode15 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode15.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertNotNull(outputSettings18);
        org.junit.Assert.assertTrue("'" + escapeMode19 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode19.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertNotNull(charset20);
        org.junit.Assert.assertTrue("'" + escapeMode21 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode21.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertTrue("'" + escapeMode23 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode23.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertNotNull(outputSettings24);
        org.junit.Assert.assertNotNull(charset25);
        org.junit.Assert.assertNotNull(outputSettings28);
        org.junit.Assert.assertNotNull(outputSettings31);
        org.junit.Assert.assertNotNull(outputSettings34);
        org.junit.Assert.assertTrue("'" + escapeMode35 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode35.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertNotNull(charset36);
        org.junit.Assert.assertTrue("'" + escapeMode39 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode39.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + true + "'", boolean41 == true);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + true + "'", boolean42 == true);
        org.junit.Assert.assertNotNull(charset43);
        org.junit.Assert.assertNotNull(outputSettings44);
        org.junit.Assert.assertNotNull(charsetEncoder45);
        org.junit.Assert.assertTrue("'" + int46 + "' != '" + 100 + "'", int46 == 100);
        org.junit.Assert.assertNotNull(outputSettings48);
        org.junit.Assert.assertTrue("'" + int49 + "' != '" + 100 + "'", int49 == 100);
    }

    @Test
    public void test16128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16128");
        org.jsoup.nodes.Document.OutputSettings outputSettings0 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Document.OutputSettings outputSettings2 = outputSettings0.indentAmount((int) 'a');
        org.jsoup.nodes.Entities.EscapeMode escapeMode3 = outputSettings2.escapeMode;
        java.nio.charset.Charset charset4 = outputSettings2.charset();
        outputSettings2.setindentAmount(0);
        org.jsoup.nodes.Entities.EscapeMode escapeMode7 = outputSettings2.escapeMode;
        org.jsoup.nodes.Document.OutputSettings outputSettings9 = outputSettings2.indentAmount((int) (byte) 10);
        boolean boolean10 = outputSettings2.forceAllElementAsBlock;
        org.jsoup.nodes.Document.OutputSettings outputSettings11 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Document.OutputSettings outputSettings13 = outputSettings11.indentAmount((int) 'a');
        org.jsoup.nodes.Entities.EscapeMode escapeMode14 = outputSettings13.escapeMode;
        java.nio.charset.Charset charset15 = outputSettings13.charset();
        org.jsoup.nodes.Entities.EscapeMode escapeMode16 = outputSettings13.escapeMode;
        boolean boolean17 = outputSettings13.prettyPrint;
        org.jsoup.nodes.Document.OutputSettings outputSettings18 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Document.OutputSettings outputSettings20 = outputSettings18.indentAmount((int) 'a');
        org.jsoup.nodes.Entities.EscapeMode escapeMode21 = outputSettings20.escapeMode;
        java.nio.charset.Charset charset22 = outputSettings20.charset();
        outputSettings20.setindentAmount(0);
        org.jsoup.nodes.Entities.EscapeMode escapeMode25 = outputSettings20.escapeMode;
        org.jsoup.nodes.Document.OutputSettings outputSettings26 = outputSettings13.escapeMode(escapeMode25);
        outputSettings2.setescapeMode(escapeMode25);
        org.jsoup.nodes.Document.OutputSettings outputSettings28 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Document.OutputSettings outputSettings30 = outputSettings28.indentAmount((int) 'a');
        org.jsoup.nodes.Document.OutputSettings outputSettings31 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Document.OutputSettings outputSettings33 = outputSettings31.indentAmount((int) 'a');
        org.jsoup.nodes.Entities.EscapeMode escapeMode34 = outputSettings33.escapeMode;
        java.nio.charset.Charset charset35 = outputSettings33.charset();
        outputSettings33.setindentAmount(0);
        org.jsoup.nodes.Entities.EscapeMode escapeMode38 = outputSettings33.escapeMode;
        outputSettings30.setescapeMode(escapeMode38);
        org.jsoup.nodes.Document.OutputSettings outputSettings41 = outputSettings30.prettyPrint(false);
        java.nio.charset.Charset charset42 = outputSettings41.getcharset();
        outputSettings2.charset = charset42;
        org.jsoup.nodes.Document.OutputSettings outputSettings45 = outputSettings2.prettyPrint(true);
        int int46 = outputSettings2.getindentAmount();
        org.jsoup.nodes.Entities.EscapeMode escapeMode47 = outputSettings2.getescapeMode();
        org.junit.Assert.assertNotNull(outputSettings2);
        org.junit.Assert.assertTrue("'" + escapeMode3 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode3.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertNotNull(charset4);
        org.junit.Assert.assertTrue("'" + escapeMode7 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode7.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertNotNull(outputSettings9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(outputSettings13);
        org.junit.Assert.assertTrue("'" + escapeMode14 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode14.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertNotNull(charset15);
        org.junit.Assert.assertTrue("'" + escapeMode16 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode16.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertNotNull(outputSettings20);
        org.junit.Assert.assertTrue("'" + escapeMode21 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode21.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertNotNull(charset22);
        org.junit.Assert.assertTrue("'" + escapeMode25 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode25.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertNotNull(outputSettings26);
        org.junit.Assert.assertNotNull(outputSettings30);
        org.junit.Assert.assertNotNull(outputSettings33);
        org.junit.Assert.assertTrue("'" + escapeMode34 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode34.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertNotNull(charset35);
        org.junit.Assert.assertTrue("'" + escapeMode38 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode38.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertNotNull(outputSettings41);
        org.junit.Assert.assertNotNull(charset42);
        org.junit.Assert.assertNotNull(outputSettings45);
        org.junit.Assert.assertTrue("'" + int46 + "' != '" + 10 + "'", int46 == 10);
        org.junit.Assert.assertTrue("'" + escapeMode47 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode47.equals(org.jsoup.nodes.Entities.EscapeMode.base));
    }

    @Test
    public void test16129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16129");
        org.jsoup.nodes.Document.OutputSettings outputSettings0 = new org.jsoup.nodes.Document.OutputSettings();
        boolean boolean1 = outputSettings0.prettyPrint;
        org.jsoup.nodes.Document.OutputSettings outputSettings2 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Document.OutputSettings outputSettings4 = outputSettings2.indentAmount((int) 'a');
        org.jsoup.nodes.Entities.EscapeMode escapeMode5 = outputSettings4.escapeMode;
        java.nio.charset.Charset charset6 = outputSettings4.charset();
        org.jsoup.nodes.Document.OutputSettings outputSettings7 = outputSettings0.charset(charset6);
        boolean boolean8 = outputSettings7.getforceAllElementAsBlock();
        boolean boolean9 = outputSettings7.prettyPrint();
        boolean boolean10 = outputSettings7.prettyPrint;
        org.jsoup.nodes.Entities.EscapeMode escapeMode11 = outputSettings7.getescapeMode();
        org.jsoup.nodes.Document.OutputSettings outputSettings12 = new org.jsoup.nodes.Document.OutputSettings();
        boolean boolean13 = outputSettings12.prettyPrint;
        org.jsoup.nodes.Document.OutputSettings outputSettings14 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Document.OutputSettings outputSettings16 = outputSettings14.indentAmount((int) 'a');
        org.jsoup.nodes.Entities.EscapeMode escapeMode17 = outputSettings16.escapeMode;
        java.nio.charset.Charset charset18 = outputSettings16.charset();
        org.jsoup.nodes.Document.OutputSettings outputSettings19 = outputSettings12.charset(charset18);
        boolean boolean20 = outputSettings12.getprettyPrint();
        boolean boolean21 = outputSettings12.getprettyPrint();
        java.nio.charset.CharsetEncoder charsetEncoder22 = outputSettings12.getcharsetEncoder();
        java.nio.charset.CharsetEncoder charsetEncoder23 = outputSettings12.getcharsetEncoder();
        outputSettings7.setcharsetEncoder(charsetEncoder23);
        int int25 = outputSettings7.indentAmount;
        org.jsoup.nodes.Document.OutputSettings outputSettings26 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Document.OutputSettings outputSettings28 = outputSettings26.indentAmount((int) 'a');
        org.jsoup.nodes.Document.OutputSettings outputSettings29 = outputSettings26.clone();
        boolean boolean30 = outputSettings26.getforceAllElementAsBlock();
        outputSettings26.prettyPrint = true;
        java.nio.charset.CharsetEncoder charsetEncoder33 = outputSettings26.getcharsetEncoder();
        java.nio.charset.CharsetEncoder charsetEncoder34 = outputSettings26.encoder();
        org.jsoup.nodes.Entities.EscapeMode escapeMode35 = outputSettings26.escapeMode();
        org.jsoup.nodes.Document.OutputSettings outputSettings36 = outputSettings7.escapeMode(escapeMode35);
        boolean boolean37 = outputSettings36.prettyPrint;
        boolean boolean38 = outputSettings36.forceAllElementAsBlock();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertNotNull(outputSettings4);
        org.junit.Assert.assertTrue("'" + escapeMode5 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode5.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertNotNull(charset6);
        org.junit.Assert.assertNotNull(outputSettings7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + escapeMode11 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode11.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNotNull(outputSettings16);
        org.junit.Assert.assertTrue("'" + escapeMode17 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode17.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertNotNull(charset18);
        org.junit.Assert.assertNotNull(outputSettings19);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertNotNull(charsetEncoder22);
        org.junit.Assert.assertNotNull(charsetEncoder23);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 1 + "'", int25 == 1);
        org.junit.Assert.assertNotNull(outputSettings28);
        org.junit.Assert.assertNotNull(outputSettings29);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertNotNull(charsetEncoder33);
        org.junit.Assert.assertNotNull(charsetEncoder34);
        org.junit.Assert.assertTrue("'" + escapeMode35 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode35.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertNotNull(outputSettings36);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + true + "'", boolean37 == true);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
    }

    @Test
    public void test16130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16130");
        org.jsoup.nodes.TextNode textNode0 = new org.jsoup.nodes.TextNode();
        textNode0.setBaseUri("#text");
        textNode0.settext("#text");
        java.lang.String str6 = textNode0.absUrl("hi!");
        textNode0.setBaseUri("hi!");
        org.jsoup.nodes.Node node9 = textNode0.clone();
        java.lang.String str10 = textNode0.text();
        org.jsoup.nodes.Node node11 = textNode0.clone();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(node9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "#text" + "'", str10, "#text");
        org.junit.Assert.assertNotNull(node11);
    }

    @Test
    public void test16131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16131");
        org.jsoup.nodes.Document.OutputSettings outputSettings0 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Document.OutputSettings outputSettings2 = outputSettings0.indentAmount((int) 'a');
        org.jsoup.nodes.Entities.EscapeMode escapeMode3 = outputSettings2.escapeMode;
        java.nio.charset.Charset charset4 = outputSettings2.charset();
        boolean boolean5 = outputSettings2.prettyPrint();
        java.nio.charset.Charset charset6 = outputSettings2.charset;
        boolean boolean7 = outputSettings2.forceAllElementAsBlock;
        org.junit.Assert.assertNotNull(outputSettings2);
        org.junit.Assert.assertTrue("'" + escapeMode3 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode3.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertNotNull(charset4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(charset6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test16132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16132");
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
        java.lang.String str17 = textNode16.baseUri();
        org.jsoup.nodes.Node node19 = textNode16.removeAttr("ext");
        java.lang.String str20 = textNode16.outerHtml();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "text" + "'", str5, "text");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "#text" + "'", str6, "#text");
        org.junit.Assert.assertNotNull(attributes7);
        org.junit.Assert.assertNotNull(nodeList8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNotNull(textNode12);
        org.junit.Assert.assertNotNull(textNode14);
        org.junit.Assert.assertNotNull(textNode16);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
        org.junit.Assert.assertNotNull(node19);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
    }

    @Test
    public void test16133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16133");
        org.jsoup.nodes.Document.OutputSettings outputSettings0 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Document.OutputSettings outputSettings2 = outputSettings0.indentAmount((int) 'a');
        org.jsoup.nodes.Document.OutputSettings outputSettings3 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Document.OutputSettings outputSettings5 = outputSettings3.indentAmount((int) 'a');
        org.jsoup.nodes.Entities.EscapeMode escapeMode6 = outputSettings5.escapeMode;
        java.nio.charset.Charset charset7 = outputSettings5.charset();
        outputSettings5.setindentAmount(0);
        org.jsoup.nodes.Entities.EscapeMode escapeMode10 = outputSettings5.escapeMode;
        outputSettings2.setescapeMode(escapeMode10);
        org.jsoup.nodes.Document.OutputSettings outputSettings13 = outputSettings2.prettyPrint(false);
        java.nio.charset.Charset charset14 = outputSettings2.charset();
        org.jsoup.nodes.Document.OutputSettings outputSettings16 = outputSettings2.prettyPrint(true);
        org.junit.Assert.assertNotNull(outputSettings2);
        org.junit.Assert.assertNotNull(outputSettings5);
        org.junit.Assert.assertTrue("'" + escapeMode6 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode6.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertNotNull(charset7);
        org.junit.Assert.assertTrue("'" + escapeMode10 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode10.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertNotNull(outputSettings13);
        org.junit.Assert.assertNotNull(charset14);
        org.junit.Assert.assertNotNull(outputSettings16);
    }

    @Test
    public void test16134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16134");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("", "hi!");
        java.lang.String str3 = textNode2.text;
        boolean boolean5 = textNode2.hasAttr("hi!");
        org.jsoup.nodes.Node node6 = textNode2.parent();
        textNode2.settext("#text");
        textNode2.settext("text");
        textNode2.setBaseUri("text");
        java.lang.String str14 = textNode2.attr("#");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(node6);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
    }

    @Test
    public void test16135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16135");
        org.jsoup.nodes.Document.OutputSettings outputSettings0 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Document.OutputSettings outputSettings2 = outputSettings0.indentAmount((int) 'a');
        org.jsoup.nodes.Entities.EscapeMode escapeMode3 = outputSettings2.escapeMode;
        java.nio.charset.Charset charset4 = outputSettings2.charset();
        outputSettings2.setindentAmount(0);
        org.jsoup.nodes.Entities.EscapeMode escapeMode7 = outputSettings2.escapeMode;
        org.jsoup.nodes.Document.OutputSettings outputSettings9 = outputSettings2.indentAmount((int) (byte) 10);
        boolean boolean10 = outputSettings2.forceAllElementAsBlock;
        java.nio.charset.Charset charset11 = outputSettings2.charset();
        int int12 = outputSettings2.indentAmount;
        org.jsoup.nodes.Entities.EscapeMode escapeMode13 = outputSettings2.escapeMode;
        org.jsoup.nodes.Document.OutputSettings outputSettings14 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Document.OutputSettings outputSettings16 = outputSettings14.indentAmount((int) 'a');
        org.jsoup.nodes.Document.OutputSettings outputSettings17 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Document.OutputSettings outputSettings19 = outputSettings17.indentAmount((int) 'a');
        org.jsoup.nodes.Entities.EscapeMode escapeMode20 = outputSettings19.escapeMode;
        java.nio.charset.Charset charset21 = outputSettings19.charset();
        outputSettings19.setindentAmount(0);
        org.jsoup.nodes.Entities.EscapeMode escapeMode24 = outputSettings19.escapeMode;
        outputSettings16.setescapeMode(escapeMode24);
        org.jsoup.nodes.Document.OutputSettings outputSettings27 = outputSettings16.prettyPrint(false);
        org.jsoup.nodes.Entities.EscapeMode escapeMode28 = outputSettings16.escapeMode;
        int int29 = outputSettings16.indentAmount;
        java.nio.charset.Charset charset30 = outputSettings16.charset();
        outputSettings2.setcharset(charset30);
        org.junit.Assert.assertNotNull(outputSettings2);
        org.junit.Assert.assertTrue("'" + escapeMode3 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode3.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertNotNull(charset4);
        org.junit.Assert.assertTrue("'" + escapeMode7 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode7.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertNotNull(outputSettings9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(charset11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 10 + "'", int12 == 10);
        org.junit.Assert.assertTrue("'" + escapeMode13 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode13.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertNotNull(outputSettings16);
        org.junit.Assert.assertNotNull(outputSettings19);
        org.junit.Assert.assertTrue("'" + escapeMode20 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode20.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertNotNull(charset21);
        org.junit.Assert.assertTrue("'" + escapeMode24 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode24.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertNotNull(outputSettings27);
        org.junit.Assert.assertTrue("'" + escapeMode28 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode28.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 97 + "'", int29 == 97);
        org.junit.Assert.assertNotNull(charset30);
    }

    @Test
    public void test16136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16136");
        org.jsoup.nodes.Document.OutputSettings outputSettings0 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Document.OutputSettings outputSettings2 = outputSettings0.indentAmount((int) 'a');
        outputSettings2.prettyPrint = false;
        int int5 = outputSettings2.indentAmount;
        org.jsoup.nodes.Document.OutputSettings outputSettings7 = outputSettings2.forceAllElementAsBlock(false);
        outputSettings7.setindentAmount((int) (short) 0);
        outputSettings7.setforceAllElementAsBlock(true);
        outputSettings7.setforceAllElementAsBlock(false);
        org.jsoup.nodes.Entities.EscapeMode escapeMode14 = outputSettings7.escapeMode();
        org.jsoup.nodes.TextNode textNode17 = new org.jsoup.nodes.TextNode("", "hi!");
        java.lang.String str18 = textNode17.text;
        boolean boolean20 = textNode17.hasAttr("hi!");
        org.jsoup.nodes.Node node21 = textNode17.parent();
        textNode17.settext("#text");
        java.lang.StringBuilder stringBuilder24 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings26 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Document.OutputSettings outputSettings28 = outputSettings26.indentAmount((int) 'a');
        outputSettings28.prettyPrint = false;
        int int31 = outputSettings28.indentAmount;
        org.jsoup.nodes.Document.OutputSettings outputSettings32 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Document.OutputSettings outputSettings34 = outputSettings32.indentAmount((int) 'a');
        org.jsoup.nodes.Entities.EscapeMode escapeMode35 = outputSettings34.escapeMode;
        java.nio.charset.Charset charset36 = outputSettings34.charset();
        org.jsoup.nodes.Document.OutputSettings outputSettings37 = outputSettings34.clone();
        outputSettings34.forceAllElementAsBlock = true;
        org.jsoup.nodes.Entities.EscapeMode escapeMode40 = outputSettings34.escapeMode;
        int int41 = outputSettings34.getindentAmount();
        org.jsoup.nodes.Document.OutputSettings outputSettings43 = outputSettings34.prettyPrint(false);
        java.nio.charset.Charset charset44 = outputSettings34.charset();
        outputSettings28.charset = charset44;
        textNode17.outerHtmlTail(stringBuilder24, (int) (short) 1, outputSettings28);
        org.jsoup.nodes.Document.OutputSettings outputSettings47 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Document.OutputSettings outputSettings49 = outputSettings47.indentAmount((int) 'a');
        org.jsoup.nodes.Entities.EscapeMode escapeMode50 = outputSettings49.escapeMode;
        java.nio.charset.Charset charset51 = outputSettings49.charset();
        org.jsoup.nodes.Document.OutputSettings outputSettings52 = outputSettings49.clone();
        boolean boolean53 = outputSettings52.getprettyPrint();
        org.jsoup.nodes.Entities.EscapeMode escapeMode54 = outputSettings52.escapeMode;
        org.jsoup.nodes.Document.OutputSettings outputSettings55 = outputSettings52.clone();
        org.jsoup.nodes.Entities.EscapeMode escapeMode56 = outputSettings55.escapeMode;
        outputSettings55.setprettyPrint(false);
        org.jsoup.nodes.Entities.EscapeMode escapeMode59 = outputSettings55.getescapeMode();
        org.jsoup.nodes.Document.OutputSettings outputSettings60 = outputSettings55.clone();
        boolean boolean61 = outputSettings55.prettyPrint;
        boolean boolean62 = outputSettings55.prettyPrint();
        java.nio.charset.CharsetEncoder charsetEncoder63 = outputSettings55.getcharsetEncoder();
        outputSettings28.setcharsetEncoder(charsetEncoder63);
        outputSettings7.setcharsetEncoder(charsetEncoder63);
        org.junit.Assert.assertNotNull(outputSettings2);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 97 + "'", int5 == 97);
        org.junit.Assert.assertNotNull(outputSettings7);
        org.junit.Assert.assertTrue("'" + escapeMode14 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode14.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNull(node21);
        org.junit.Assert.assertNotNull(outputSettings28);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 97 + "'", int31 == 97);
        org.junit.Assert.assertNotNull(outputSettings34);
        org.junit.Assert.assertTrue("'" + escapeMode35 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode35.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertNotNull(charset36);
        org.junit.Assert.assertNotNull(outputSettings37);
        org.junit.Assert.assertTrue("'" + escapeMode40 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode40.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 97 + "'", int41 == 97);
        org.junit.Assert.assertNotNull(outputSettings43);
        org.junit.Assert.assertNotNull(charset44);
        org.junit.Assert.assertNotNull(outputSettings49);
        org.junit.Assert.assertTrue("'" + escapeMode50 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode50.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertNotNull(charset51);
        org.junit.Assert.assertNotNull(outputSettings52);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + true + "'", boolean53 == true);
        org.junit.Assert.assertTrue("'" + escapeMode54 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode54.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertNotNull(outputSettings55);
        org.junit.Assert.assertTrue("'" + escapeMode56 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode56.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertTrue("'" + escapeMode59 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode59.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertNotNull(outputSettings60);
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + false + "'", boolean61 == false);
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + false + "'", boolean62 == false);
        org.junit.Assert.assertNotNull(charsetEncoder63);
    }

    @Test
    public void test16137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16137");
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
        java.lang.String str23 = textNode2.absUrl("hi!");
        org.jsoup.nodes.Attributes attributes24 = textNode2.attributes();
        java.lang.String str25 = textNode2.toString();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "text" + "'", str5, "text");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "#text" + "'", str6, "#text");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(nodeList14);
        org.junit.Assert.assertNull(document17);
        org.junit.Assert.assertNotNull(attributes18);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "text" + "'", str19, "text");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
        org.junit.Assert.assertNotNull(attributes24);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "text" + "'", str25, "text");
    }

    @Test
    public void test16138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16138");
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
        org.jsoup.nodes.Node node12 = textNode2.clone();
        java.lang.String str13 = textNode2.toString();
        boolean boolean15 = textNode2.hasAttr("");
        org.jsoup.nodes.Node node17 = textNode2.removeAttr("i!");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node19 = node17.before("h");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "text" + "'", str5, "text");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "#text" + "'", str6, "#text");
        org.junit.Assert.assertNotNull(attributes7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNotNull(node12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(node17);
    }

    @Test
    public void test16139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16139");
        org.jsoup.nodes.Document.OutputSettings outputSettings0 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Document.OutputSettings outputSettings2 = outputSettings0.indentAmount((int) 'a');
        org.jsoup.nodes.Entities.EscapeMode escapeMode3 = outputSettings2.escapeMode;
        java.nio.charset.Charset charset4 = outputSettings2.charset();
        org.jsoup.nodes.Entities.EscapeMode escapeMode5 = outputSettings2.escapeMode;
        int int6 = outputSettings2.indentAmount;
        java.nio.charset.CharsetEncoder charsetEncoder7 = outputSettings2.encoder();
        java.nio.charset.Charset charset8 = outputSettings2.charset;
        org.jsoup.nodes.Document.OutputSettings outputSettings9 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Document.OutputSettings outputSettings11 = outputSettings9.indentAmount((int) 'a');
        org.jsoup.nodes.Document.OutputSettings outputSettings12 = outputSettings9.clone();
        boolean boolean13 = outputSettings9.getforceAllElementAsBlock();
        outputSettings9.prettyPrint = true;
        java.nio.charset.CharsetEncoder charsetEncoder16 = outputSettings9.getcharsetEncoder();
        java.nio.charset.CharsetEncoder charsetEncoder17 = outputSettings9.encoder();
        org.jsoup.nodes.Document.OutputSettings outputSettings18 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Document.OutputSettings outputSettings20 = outputSettings18.indentAmount((int) 'a');
        org.jsoup.nodes.Entities.EscapeMode escapeMode21 = outputSettings20.escapeMode;
        outputSettings20.setindentAmount((int) '4');
        org.jsoup.nodes.Document.OutputSettings outputSettings24 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Document.OutputSettings outputSettings26 = outputSettings24.indentAmount((int) 'a');
        org.jsoup.nodes.Entities.EscapeMode escapeMode27 = outputSettings26.escapeMode;
        java.nio.charset.Charset charset28 = outputSettings26.charset();
        outputSettings20.setcharset(charset28);
        org.jsoup.nodes.Document.OutputSettings outputSettings30 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Document.OutputSettings outputSettings32 = outputSettings30.indentAmount((int) 'a');
        org.jsoup.nodes.Entities.EscapeMode escapeMode33 = outputSettings32.escapeMode;
        java.nio.charset.Charset charset34 = outputSettings32.charset();
        org.jsoup.nodes.Entities.EscapeMode escapeMode35 = outputSettings32.escapeMode;
        boolean boolean36 = outputSettings32.prettyPrint;
        org.jsoup.nodes.Document.OutputSettings outputSettings37 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Document.OutputSettings outputSettings39 = outputSettings37.indentAmount((int) 'a');
        org.jsoup.nodes.Entities.EscapeMode escapeMode40 = outputSettings39.escapeMode;
        org.jsoup.nodes.Document.OutputSettings outputSettings41 = outputSettings32.escapeMode(escapeMode40);
        org.jsoup.nodes.Document.OutputSettings outputSettings42 = outputSettings20.escapeMode(escapeMode40);
        org.jsoup.nodes.Document.OutputSettings outputSettings43 = outputSettings9.escapeMode(escapeMode40);
        boolean boolean44 = outputSettings43.getforceAllElementAsBlock();
        boolean boolean45 = outputSettings43.forceAllElementAsBlock;
        org.jsoup.nodes.Document.OutputSettings outputSettings46 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Document.OutputSettings outputSettings48 = outputSettings46.indentAmount((int) 'a');
        org.jsoup.nodes.Entities.EscapeMode escapeMode49 = outputSettings48.escapeMode;
        java.nio.charset.Charset charset50 = outputSettings48.charset();
        org.jsoup.nodes.Document.OutputSettings outputSettings51 = outputSettings48.clone();
        boolean boolean52 = outputSettings51.getprettyPrint();
        java.nio.charset.CharsetEncoder charsetEncoder53 = outputSettings51.getcharsetEncoder();
        outputSettings43.setcharsetEncoder(charsetEncoder53);
        org.jsoup.nodes.Document.OutputSettings outputSettings55 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Document.OutputSettings outputSettings57 = outputSettings55.indentAmount((int) 'a');
        org.jsoup.nodes.Entities.EscapeMode escapeMode58 = outputSettings57.escapeMode;
        outputSettings57.setindentAmount((int) '4');
        org.jsoup.nodes.Document.OutputSettings outputSettings61 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Document.OutputSettings outputSettings63 = outputSettings61.indentAmount((int) 'a');
        org.jsoup.nodes.Entities.EscapeMode escapeMode64 = outputSettings63.escapeMode;
        java.nio.charset.Charset charset65 = outputSettings63.charset();
        org.jsoup.nodes.Document.OutputSettings outputSettings66 = outputSettings63.clone();
        outputSettings63.forceAllElementAsBlock = true;
        outputSettings63.forceAllElementAsBlock = false;
        java.nio.charset.Charset charset71 = outputSettings63.getcharset();
        outputSettings57.charset = charset71;
        org.jsoup.nodes.Document.OutputSettings outputSettings73 = outputSettings43.charset(charset71);
        org.jsoup.nodes.Document.OutputSettings outputSettings74 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Document.OutputSettings outputSettings76 = outputSettings74.indentAmount((int) 'a');
        org.jsoup.nodes.Entities.EscapeMode escapeMode77 = outputSettings76.escapeMode;
        java.nio.charset.Charset charset78 = outputSettings76.charset();
        org.jsoup.nodes.Entities.EscapeMode escapeMode79 = outputSettings76.escapeMode;
        int int80 = outputSettings76.indentAmount;
        java.nio.charset.CharsetEncoder charsetEncoder81 = outputSettings76.encoder();
        outputSettings73.charsetEncoder = charsetEncoder81;
        outputSettings2.setcharsetEncoder(charsetEncoder81);
        int int84 = outputSettings2.getindentAmount();
        java.nio.charset.CharsetEncoder charsetEncoder85 = outputSettings2.encoder();
        java.nio.charset.CharsetEncoder charsetEncoder86 = outputSettings2.getcharsetEncoder();
        org.junit.Assert.assertNotNull(outputSettings2);
        org.junit.Assert.assertTrue("'" + escapeMode3 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode3.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertNotNull(charset4);
        org.junit.Assert.assertTrue("'" + escapeMode5 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode5.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 97 + "'", int6 == 97);
        org.junit.Assert.assertNotNull(charsetEncoder7);
        org.junit.Assert.assertNotNull(charset8);
        org.junit.Assert.assertNotNull(outputSettings11);
        org.junit.Assert.assertNotNull(outputSettings12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(charsetEncoder16);
        org.junit.Assert.assertNotNull(charsetEncoder17);
        org.junit.Assert.assertNotNull(outputSettings20);
        org.junit.Assert.assertTrue("'" + escapeMode21 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode21.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertNotNull(outputSettings26);
        org.junit.Assert.assertTrue("'" + escapeMode27 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode27.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertNotNull(charset28);
        org.junit.Assert.assertNotNull(outputSettings32);
        org.junit.Assert.assertTrue("'" + escapeMode33 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode33.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertNotNull(charset34);
        org.junit.Assert.assertTrue("'" + escapeMode35 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode35.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + true + "'", boolean36 == true);
        org.junit.Assert.assertNotNull(outputSettings39);
        org.junit.Assert.assertTrue("'" + escapeMode40 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode40.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertNotNull(outputSettings41);
        org.junit.Assert.assertNotNull(outputSettings42);
        org.junit.Assert.assertNotNull(outputSettings43);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertNotNull(outputSettings48);
        org.junit.Assert.assertTrue("'" + escapeMode49 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode49.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertNotNull(charset50);
        org.junit.Assert.assertNotNull(outputSettings51);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + true + "'", boolean52 == true);
        org.junit.Assert.assertNotNull(charsetEncoder53);
        org.junit.Assert.assertNotNull(outputSettings57);
        org.junit.Assert.assertTrue("'" + escapeMode58 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode58.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertNotNull(outputSettings63);
        org.junit.Assert.assertTrue("'" + escapeMode64 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode64.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertNotNull(charset65);
        org.junit.Assert.assertNotNull(outputSettings66);
        org.junit.Assert.assertNotNull(charset71);
        org.junit.Assert.assertNotNull(outputSettings73);
        org.junit.Assert.assertNotNull(outputSettings76);
        org.junit.Assert.assertTrue("'" + escapeMode77 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode77.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertNotNull(charset78);
        org.junit.Assert.assertTrue("'" + escapeMode79 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode79.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertTrue("'" + int80 + "' != '" + 97 + "'", int80 == 97);
        org.junit.Assert.assertNotNull(charsetEncoder81);
        org.junit.Assert.assertTrue("'" + int84 + "' != '" + 97 + "'", int84 == 97);
        org.junit.Assert.assertNotNull(charsetEncoder85);
        org.junit.Assert.assertNotNull(charsetEncoder86);
    }

    @Test
    public void test16140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16140");
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
        boolean boolean14 = textNode2.isBlank();
        java.lang.String str15 = textNode2.gettext();
        java.lang.StringBuilder stringBuilder16 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings18 = new org.jsoup.nodes.Document.OutputSettings();
        boolean boolean19 = outputSettings18.prettyPrint;
        org.jsoup.nodes.Document.OutputSettings outputSettings20 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Document.OutputSettings outputSettings22 = outputSettings20.indentAmount((int) 'a');
        org.jsoup.nodes.Entities.EscapeMode escapeMode23 = outputSettings22.escapeMode;
        java.nio.charset.Charset charset24 = outputSettings22.charset();
        org.jsoup.nodes.Document.OutputSettings outputSettings25 = outputSettings18.charset(charset24);
        int int26 = outputSettings25.indentAmount;
        org.jsoup.nodes.Document.OutputSettings outputSettings27 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Document.OutputSettings outputSettings29 = outputSettings27.indentAmount((int) 'a');
        org.jsoup.nodes.Entities.EscapeMode escapeMode30 = outputSettings29.escapeMode;
        java.nio.charset.Charset charset31 = outputSettings29.charset();
        org.jsoup.nodes.Document.OutputSettings outputSettings32 = outputSettings29.clone();
        outputSettings29.forceAllElementAsBlock = true;
        outputSettings29.setprettyPrint(true);
        org.jsoup.nodes.Document.OutputSettings outputSettings37 = outputSettings29.clone();
        java.nio.charset.CharsetEncoder charsetEncoder38 = outputSettings37.encoder();
        outputSettings25.charsetEncoder = charsetEncoder38;
        textNode2.outerHtmlTail(stringBuilder16, 0, outputSettings25);
        java.lang.String str42 = textNode2.absUrl("h");
        boolean boolean43 = textNode2.isBlank();
        textNode2.setBaseUri("");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "text" + "'", str5, "text");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "#text" + "'", str6, "#text");
        org.junit.Assert.assertNotNull(nodeList9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertNotNull(nodeList11);
        org.junit.Assert.assertNotNull(attributes12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "#text" + "'", str13, "#text");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "#text" + "'", str15, "#text");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertNotNull(outputSettings22);
        org.junit.Assert.assertTrue("'" + escapeMode23 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode23.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertNotNull(charset24);
        org.junit.Assert.assertNotNull(outputSettings25);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 1 + "'", int26 == 1);
        org.junit.Assert.assertNotNull(outputSettings29);
        org.junit.Assert.assertTrue("'" + escapeMode30 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode30.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertNotNull(charset31);
        org.junit.Assert.assertNotNull(outputSettings32);
        org.junit.Assert.assertNotNull(outputSettings37);
        org.junit.Assert.assertNotNull(charsetEncoder38);
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "" + "'", str42, "");
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
    }

    @Test
    public void test16141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16141");
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
        java.lang.String str15 = textNode2.outerHtml();
        java.lang.StringBuilder stringBuilder16 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings18 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Document.OutputSettings outputSettings20 = outputSettings18.indentAmount((int) 'a');
        org.jsoup.nodes.Entities.EscapeMode escapeMode21 = outputSettings20.escapeMode;
        java.nio.charset.Charset charset22 = outputSettings20.charset();
        org.jsoup.nodes.Entities.EscapeMode escapeMode23 = outputSettings20.escapeMode;
        boolean boolean24 = outputSettings20.prettyPrint;
        boolean boolean25 = outputSettings20.forceAllElementAsBlock;
        boolean boolean26 = outputSettings20.getforceAllElementAsBlock();
        boolean boolean27 = outputSettings20.getprettyPrint();
        boolean boolean28 = outputSettings20.forceAllElementAsBlock();
        int int29 = outputSettings20.indentAmount();
        textNode2.outerHtmlTail(stringBuilder16, (int) (short) 0, outputSettings20);
        java.nio.charset.Charset charset31 = outputSettings20.getcharset();
        org.jsoup.nodes.Entities.EscapeMode escapeMode32 = outputSettings20.escapeMode;
        java.nio.charset.CharsetEncoder charsetEncoder33 = outputSettings20.encoder();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "text" + "'", str5, "text");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "#text" + "'", str6, "#text");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(nodeList14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "#text" + "'", str15, "#text");
        org.junit.Assert.assertNotNull(outputSettings20);
        org.junit.Assert.assertTrue("'" + escapeMode21 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode21.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertNotNull(charset22);
        org.junit.Assert.assertTrue("'" + escapeMode23 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode23.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 97 + "'", int29 == 97);
        org.junit.Assert.assertNotNull(charset31);
        org.junit.Assert.assertTrue("'" + escapeMode32 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode32.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertNotNull(charsetEncoder33);
    }

    @Test
    public void test16142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16142");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("", "hi!");
        java.lang.String str4 = textNode2.absUrl("#text");
        java.lang.StringBuilder stringBuilder5 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings7 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Document.OutputSettings outputSettings9 = outputSettings7.indentAmount((int) 'a');
        org.jsoup.nodes.Entities.EscapeMode escapeMode10 = outputSettings9.escapeMode;
        java.nio.charset.Charset charset11 = outputSettings9.charset();
        org.jsoup.nodes.Entities.EscapeMode escapeMode12 = outputSettings9.escapeMode;
        boolean boolean13 = outputSettings9.prettyPrint;
        org.jsoup.nodes.Document.OutputSettings outputSettings14 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Document.OutputSettings outputSettings16 = outputSettings14.indentAmount((int) 'a');
        org.jsoup.nodes.Entities.EscapeMode escapeMode17 = outputSettings16.escapeMode;
        java.nio.charset.Charset charset18 = outputSettings16.charset();
        outputSettings16.setindentAmount(0);
        org.jsoup.nodes.Entities.EscapeMode escapeMode21 = outputSettings16.escapeMode;
        org.jsoup.nodes.Document.OutputSettings outputSettings22 = outputSettings9.escapeMode(escapeMode21);
        org.jsoup.nodes.Document.OutputSettings outputSettings23 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Document.OutputSettings outputSettings25 = outputSettings23.indentAmount((int) 'a');
        org.jsoup.nodes.Entities.EscapeMode escapeMode26 = outputSettings25.escapeMode;
        java.nio.charset.Charset charset27 = outputSettings25.charset();
        org.jsoup.nodes.Entities.EscapeMode escapeMode28 = outputSettings25.escapeMode;
        boolean boolean29 = outputSettings25.prettyPrint;
        boolean boolean30 = outputSettings25.forceAllElementAsBlock;
        boolean boolean31 = outputSettings25.getforceAllElementAsBlock();
        boolean boolean32 = outputSettings25.getprettyPrint();
        java.nio.charset.Charset charset33 = outputSettings25.getcharset();
        outputSettings9.charset = charset33;
        textNode2.outerHtmlTail(stringBuilder5, (int) (short) 1, outputSettings9);
        java.lang.String str36 = textNode2.getTEXT_KEY();
        java.util.List<org.jsoup.nodes.Node> nodeList37 = textNode2.siblingNodes();
        org.jsoup.nodes.Node node40 = textNode2.attr("text", "#");
        java.util.List<org.jsoup.nodes.Node> nodeList41 = textNode2.siblingNodes();
        java.lang.String str43 = textNode2.attr("h");
        java.lang.StringBuilder stringBuilder44 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings46 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Document.OutputSettings outputSettings48 = outputSettings46.indentAmount((int) 'a');
        org.jsoup.nodes.Entities.EscapeMode escapeMode49 = outputSettings48.escapeMode;
        java.nio.charset.Charset charset50 = outputSettings48.charset();
        org.jsoup.nodes.Entities.EscapeMode escapeMode51 = outputSettings48.escapeMode;
        boolean boolean52 = outputSettings48.prettyPrint;
        org.jsoup.nodes.Document.OutputSettings outputSettings53 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Document.OutputSettings outputSettings55 = outputSettings53.indentAmount((int) 'a');
        org.jsoup.nodes.Entities.EscapeMode escapeMode56 = outputSettings55.escapeMode;
        org.jsoup.nodes.Document.OutputSettings outputSettings57 = outputSettings48.escapeMode(escapeMode56);
        outputSettings48.forceAllElementAsBlock = false;
        java.nio.charset.CharsetEncoder charsetEncoder60 = outputSettings48.encoder();
        org.jsoup.nodes.Entities.EscapeMode escapeMode61 = outputSettings48.escapeMode;
        outputSettings48.prettyPrint = false;
        textNode2.outerHtmlTail(stringBuilder44, (int) '#', outputSettings48);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(outputSettings9);
        org.junit.Assert.assertTrue("'" + escapeMode10 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode10.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertNotNull(charset11);
        org.junit.Assert.assertTrue("'" + escapeMode12 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode12.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNotNull(outputSettings16);
        org.junit.Assert.assertTrue("'" + escapeMode17 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode17.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertNotNull(charset18);
        org.junit.Assert.assertTrue("'" + escapeMode21 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode21.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertNotNull(outputSettings22);
        org.junit.Assert.assertNotNull(outputSettings25);
        org.junit.Assert.assertTrue("'" + escapeMode26 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode26.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertNotNull(charset27);
        org.junit.Assert.assertTrue("'" + escapeMode28 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode28.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + true + "'", boolean32 == true);
        org.junit.Assert.assertNotNull(charset33);
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "text" + "'", str36, "text");
        org.junit.Assert.assertNotNull(nodeList37);
        org.junit.Assert.assertNotNull(node40);
        org.junit.Assert.assertNotNull(nodeList41);
        org.junit.Assert.assertEquals("'" + str43 + "' != '" + "" + "'", str43, "");
        org.junit.Assert.assertNotNull(outputSettings48);
        org.junit.Assert.assertTrue("'" + escapeMode49 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode49.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertNotNull(charset50);
        org.junit.Assert.assertTrue("'" + escapeMode51 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode51.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + true + "'", boolean52 == true);
        org.junit.Assert.assertNotNull(outputSettings55);
        org.junit.Assert.assertTrue("'" + escapeMode56 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode56.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertNotNull(outputSettings57);
        org.junit.Assert.assertNotNull(charsetEncoder60);
        org.junit.Assert.assertTrue("'" + escapeMode61 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode61.equals(org.jsoup.nodes.Entities.EscapeMode.base));
    }

    @Test
    public void test16143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16143");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("", "hi!");
        java.lang.String str3 = textNode2.text;
        boolean boolean5 = textNode2.hasAttr("hi!");
        org.jsoup.nodes.Node node6 = textNode2.parent();
        textNode2.settext("hi!");
        java.lang.String str9 = textNode2.getTEXT_KEY();
        boolean boolean11 = textNode2.hasAttr("");
        org.jsoup.nodes.Node node14 = textNode2.attr("hi!", "#text");
        java.lang.String str15 = textNode2.baseUri();
        org.jsoup.nodes.TextNode textNode18 = new org.jsoup.nodes.TextNode("", "hi!");
        java.lang.String str19 = textNode18.text;
        java.lang.String str20 = textNode18.outerHtml();
        java.lang.String str21 = textNode18.getTEXT_KEY();
        java.lang.String str22 = textNode18.nodeName();
        boolean boolean24 = textNode18.equals((java.lang.Object) (short) 1);
        textNode18.setBaseUri("#text");
        boolean boolean27 = textNode18.isBlank();
        textNode18.text = "#text";
        java.util.List<org.jsoup.nodes.Node> nodeList30 = textNode18.childNodes();
        textNode18.settext("text");
        org.jsoup.nodes.Document document33 = textNode18.ownerDocument();
        org.jsoup.nodes.Attributes attributes34 = textNode18.attributes();
        org.jsoup.nodes.Node node35 = textNode18.nextSibling();
        java.lang.String str36 = textNode18.baseUri();
        java.util.List<org.jsoup.nodes.Node> nodeList37 = textNode18.siblingNodes();
        java.lang.String str38 = textNode18.toString();
        org.jsoup.nodes.Node node39 = textNode18.clone();
        textNode18.settext("hi!");
        java.lang.String str42 = textNode18.getWholeText();
        org.jsoup.nodes.Node node44 = textNode18.removeAttr("#");
        boolean boolean46 = textNode18.hasAttr("text");
        boolean boolean47 = textNode18.isBlank();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node48 = textNode2.before((org.jsoup.nodes.Node) textNode18);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(node6);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "text" + "'", str9, "text");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(node14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "text" + "'", str21, "text");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "#text" + "'", str22, "#text");
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertNotNull(nodeList30);
        org.junit.Assert.assertNull(document33);
        org.junit.Assert.assertNotNull(attributes34);
        org.junit.Assert.assertNull(node35);
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "#text" + "'", str36, "#text");
        org.junit.Assert.assertNotNull(nodeList37);
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "text" + "'", str38, "text");
        org.junit.Assert.assertNotNull(node39);
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "text" + "'", str42, "text");
        org.junit.Assert.assertNotNull(node44);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + true + "'", boolean46 == true);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
    }

    @Test
    public void test16144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16144");
        org.jsoup.nodes.Document.OutputSettings outputSettings0 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Document.OutputSettings outputSettings2 = outputSettings0.indentAmount((int) 'a');
        org.jsoup.nodes.Entities.EscapeMode escapeMode3 = outputSettings2.escapeMode;
        java.nio.charset.Charset charset4 = outputSettings2.charset();
        org.jsoup.nodes.Document.OutputSettings outputSettings5 = outputSettings2.clone();
        boolean boolean6 = outputSettings5.getprettyPrint();
        org.jsoup.nodes.Entities.EscapeMode escapeMode7 = outputSettings5.escapeMode;
        org.jsoup.nodes.Document.OutputSettings outputSettings8 = outputSettings5.clone();
        java.nio.charset.Charset charset9 = null;
        outputSettings5.charset = charset9;
        java.nio.charset.Charset charset11 = outputSettings5.charset();
        org.jsoup.nodes.Entities.EscapeMode escapeMode12 = outputSettings5.escapeMode();
        org.jsoup.nodes.Document.OutputSettings outputSettings13 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Document.OutputSettings outputSettings15 = outputSettings13.indentAmount((int) 'a');
        org.jsoup.nodes.Document.OutputSettings outputSettings16 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Document.OutputSettings outputSettings18 = outputSettings16.indentAmount((int) 'a');
        org.jsoup.nodes.Entities.EscapeMode escapeMode19 = outputSettings18.escapeMode;
        java.nio.charset.Charset charset20 = outputSettings18.charset();
        outputSettings18.setindentAmount(0);
        org.jsoup.nodes.Entities.EscapeMode escapeMode23 = outputSettings18.escapeMode;
        outputSettings15.setescapeMode(escapeMode23);
        boolean boolean25 = outputSettings15.getprettyPrint();
        outputSettings15.setprettyPrint(false);
        outputSettings15.setprettyPrint(true);
        outputSettings15.setindentAmount((int) '4');
        java.nio.charset.CharsetEncoder charsetEncoder32 = outputSettings15.encoder();
        org.jsoup.nodes.Entities.EscapeMode escapeMode33 = outputSettings15.escapeMode();
        org.jsoup.nodes.Document.OutputSettings outputSettings34 = outputSettings5.escapeMode(escapeMode33);
        java.nio.charset.Charset charset35 = outputSettings34.getcharset();
        org.junit.Assert.assertNotNull(outputSettings2);
        org.junit.Assert.assertTrue("'" + escapeMode3 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode3.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertNotNull(charset4);
        org.junit.Assert.assertNotNull(outputSettings5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + escapeMode7 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode7.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertNotNull(outputSettings8);
        org.junit.Assert.assertNull(charset11);
        org.junit.Assert.assertTrue("'" + escapeMode12 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode12.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertNotNull(outputSettings15);
        org.junit.Assert.assertNotNull(outputSettings18);
        org.junit.Assert.assertTrue("'" + escapeMode19 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode19.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertNotNull(charset20);
        org.junit.Assert.assertTrue("'" + escapeMode23 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode23.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertNotNull(charsetEncoder32);
        org.junit.Assert.assertTrue("'" + escapeMode33 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode33.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertNotNull(outputSettings34);
        org.junit.Assert.assertNull(charset35);
    }

    @Test
    public void test16145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16145");
        org.jsoup.nodes.Document.OutputSettings outputSettings0 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Document.OutputSettings outputSettings2 = outputSettings0.indentAmount((int) 'a');
        java.nio.charset.Charset charset3 = outputSettings0.getcharset();
        boolean boolean4 = outputSettings0.prettyPrint();
        boolean boolean5 = outputSettings0.forceAllElementAsBlock;
        outputSettings0.indentAmount = (short) 1;
        java.nio.charset.CharsetEncoder charsetEncoder8 = outputSettings0.encoder();
        java.nio.charset.Charset charset9 = outputSettings0.charset();
        java.nio.charset.CharsetEncoder charsetEncoder10 = outputSettings0.charsetEncoder;
        org.junit.Assert.assertNotNull(outputSettings2);
        org.junit.Assert.assertNotNull(charset3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(charsetEncoder8);
        org.junit.Assert.assertNotNull(charset9);
        org.junit.Assert.assertNotNull(charsetEncoder10);
    }

    @Test
    public void test16146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16146");
        org.jsoup.nodes.Document.OutputSettings outputSettings0 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Document.OutputSettings outputSettings2 = outputSettings0.indentAmount((int) 'a');
        org.jsoup.nodes.Entities.EscapeMode escapeMode3 = outputSettings2.escapeMode;
        java.nio.charset.Charset charset4 = outputSettings2.charset();
        org.jsoup.nodes.Document.OutputSettings outputSettings5 = outputSettings2.clone();
        outputSettings2.forceAllElementAsBlock = true;
        org.jsoup.nodes.Entities.EscapeMode escapeMode8 = outputSettings2.escapeMode;
        boolean boolean9 = outputSettings2.forceAllElementAsBlock();
        org.jsoup.nodes.Document.OutputSettings outputSettings10 = outputSettings2.clone();
        org.jsoup.nodes.Document.OutputSettings outputSettings11 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Document.OutputSettings outputSettings13 = outputSettings11.indentAmount((int) 'a');
        org.jsoup.nodes.Document.OutputSettings outputSettings14 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Document.OutputSettings outputSettings16 = outputSettings14.indentAmount((int) 'a');
        org.jsoup.nodes.Entities.EscapeMode escapeMode17 = outputSettings16.escapeMode;
        java.nio.charset.Charset charset18 = outputSettings16.charset();
        outputSettings16.setindentAmount(0);
        org.jsoup.nodes.Entities.EscapeMode escapeMode21 = outputSettings16.escapeMode;
        outputSettings13.setescapeMode(escapeMode21);
        boolean boolean23 = outputSettings13.getprettyPrint();
        outputSettings13.indentAmount = 97;
        org.jsoup.nodes.Document.OutputSettings outputSettings26 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Document.OutputSettings outputSettings28 = outputSettings26.indentAmount((int) 'a');
        java.nio.charset.Charset charset29 = outputSettings26.getcharset();
        boolean boolean30 = outputSettings26.prettyPrint();
        boolean boolean31 = outputSettings26.forceAllElementAsBlock;
        outputSettings26.indentAmount = (byte) 100;
        int int34 = outputSettings26.indentAmount;
        java.nio.charset.Charset charset35 = outputSettings26.getcharset();
        outputSettings13.setcharset(charset35);
        org.jsoup.nodes.Document.OutputSettings outputSettings37 = outputSettings2.charset(charset35);
        java.nio.charset.Charset charset38 = outputSettings37.getcharset();
        boolean boolean39 = outputSettings37.getforceAllElementAsBlock();
        org.jsoup.nodes.Entities.EscapeMode escapeMode40 = outputSettings37.escapeMode;
        org.junit.Assert.assertNotNull(outputSettings2);
        org.junit.Assert.assertTrue("'" + escapeMode3 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode3.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertNotNull(charset4);
        org.junit.Assert.assertNotNull(outputSettings5);
        org.junit.Assert.assertTrue("'" + escapeMode8 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode8.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(outputSettings10);
        org.junit.Assert.assertNotNull(outputSettings13);
        org.junit.Assert.assertNotNull(outputSettings16);
        org.junit.Assert.assertTrue("'" + escapeMode17 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode17.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertNotNull(charset18);
        org.junit.Assert.assertTrue("'" + escapeMode21 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode21.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertNotNull(outputSettings28);
        org.junit.Assert.assertNotNull(charset29);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 100 + "'", int34 == 100);
        org.junit.Assert.assertNotNull(charset35);
        org.junit.Assert.assertNotNull(outputSettings37);
        org.junit.Assert.assertNotNull(charset38);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + true + "'", boolean39 == true);
        org.junit.Assert.assertTrue("'" + escapeMode40 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode40.equals(org.jsoup.nodes.Entities.EscapeMode.base));
    }

    @Test
    public void test16147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16147");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("", "hi!");
        java.lang.String str3 = textNode2.text;
        java.lang.String str4 = textNode2.outerHtml();
        java.lang.String str5 = textNode2.getTEXT_KEY();
        java.lang.String str6 = textNode2.nodeName();
        org.jsoup.nodes.Attributes attributes7 = textNode2.attributes();
        org.jsoup.nodes.Node node8 = textNode2.clone();
        java.lang.StringBuilder stringBuilder9 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings11 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Document.OutputSettings outputSettings13 = outputSettings11.indentAmount((int) 'a');
        org.jsoup.nodes.Entities.EscapeMode escapeMode14 = outputSettings13.escapeMode;
        outputSettings13.setindentAmount((int) '4');
        org.jsoup.nodes.Document.OutputSettings outputSettings17 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Document.OutputSettings outputSettings19 = outputSettings17.indentAmount((int) 'a');
        org.jsoup.nodes.Entities.EscapeMode escapeMode20 = outputSettings19.escapeMode;
        java.nio.charset.Charset charset21 = outputSettings19.charset();
        outputSettings13.setcharset(charset21);
        org.jsoup.nodes.Document.OutputSettings outputSettings23 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Document.OutputSettings outputSettings25 = outputSettings23.indentAmount((int) 'a');
        org.jsoup.nodes.Entities.EscapeMode escapeMode26 = outputSettings25.escapeMode;
        java.nio.charset.Charset charset27 = outputSettings25.charset();
        org.jsoup.nodes.Entities.EscapeMode escapeMode28 = outputSettings25.escapeMode;
        boolean boolean29 = outputSettings25.prettyPrint;
        org.jsoup.nodes.Document.OutputSettings outputSettings30 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Document.OutputSettings outputSettings32 = outputSettings30.indentAmount((int) 'a');
        org.jsoup.nodes.Entities.EscapeMode escapeMode33 = outputSettings32.escapeMode;
        org.jsoup.nodes.Document.OutputSettings outputSettings34 = outputSettings25.escapeMode(escapeMode33);
        org.jsoup.nodes.Document.OutputSettings outputSettings35 = outputSettings13.escapeMode(escapeMode33);
        boolean boolean36 = outputSettings35.getforceAllElementAsBlock();
        textNode2.outerHtmlTail(stringBuilder9, (int) (byte) 0, outputSettings35);
        org.jsoup.nodes.Attributes attributes38 = textNode2.attributes();
        java.lang.String str40 = textNode2.absUrl("hi!");
        java.lang.String str41 = textNode2.text();
        textNode2.text = "i!";
        java.lang.String str44 = textNode2.text();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "text" + "'", str5, "text");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "#text" + "'", str6, "#text");
        org.junit.Assert.assertNotNull(attributes7);
        org.junit.Assert.assertNotNull(node8);
        org.junit.Assert.assertNotNull(outputSettings13);
        org.junit.Assert.assertTrue("'" + escapeMode14 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode14.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertNotNull(outputSettings19);
        org.junit.Assert.assertTrue("'" + escapeMode20 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode20.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertNotNull(charset21);
        org.junit.Assert.assertNotNull(outputSettings25);
        org.junit.Assert.assertTrue("'" + escapeMode26 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode26.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertNotNull(charset27);
        org.junit.Assert.assertTrue("'" + escapeMode28 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode28.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertNotNull(outputSettings32);
        org.junit.Assert.assertTrue("'" + escapeMode33 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode33.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertNotNull(outputSettings34);
        org.junit.Assert.assertNotNull(outputSettings35);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertNotNull(attributes38);
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "" + "'", str40, "");
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "" + "'", str41, "");
        org.junit.Assert.assertEquals("'" + str44 + "' != '" + "" + "'", str44, "");
    }

    @Test
    public void test16148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16148");
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
        org.jsoup.nodes.Node node15 = textNode2.previousSibling();
        textNode2.setBaseUri("hi!");
        org.jsoup.nodes.TextNode textNode20 = new org.jsoup.nodes.TextNode("", "hi!");
        java.lang.String str22 = textNode20.attr("text");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node23 = textNode2.before((org.jsoup.nodes.Node) textNode20);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "text" + "'", str5, "text");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "#text" + "'", str6, "#text");
        org.junit.Assert.assertNotNull(attributes7);
        org.junit.Assert.assertNotNull(nodeList8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNull(node11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertNull(node15);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
    }

    @Test
    public void test16149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16149");
        org.jsoup.nodes.Document.OutputSettings outputSettings0 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Document.OutputSettings outputSettings2 = outputSettings0.indentAmount((int) 'a');
        org.jsoup.nodes.Entities.EscapeMode escapeMode3 = outputSettings2.escapeMode;
        java.nio.charset.Charset charset4 = outputSettings2.charset();
        org.jsoup.nodes.Document.OutputSettings outputSettings5 = outputSettings2.clone();
        boolean boolean6 = outputSettings5.getprettyPrint();
        boolean boolean7 = outputSettings5.forceAllElementAsBlock();
        outputSettings5.indentAmount = (short) -1;
        org.jsoup.nodes.Document.OutputSettings outputSettings10 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Document.OutputSettings outputSettings12 = outputSettings10.indentAmount((int) 'a');
        org.jsoup.nodes.Entities.EscapeMode escapeMode13 = outputSettings12.escapeMode;
        java.nio.charset.Charset charset14 = outputSettings12.charset();
        org.jsoup.nodes.Document.OutputSettings outputSettings15 = outputSettings12.clone();
        outputSettings15.setindentAmount((int) (short) 10);
        outputSettings15.setindentAmount(97);
        outputSettings15.setprettyPrint(true);
        boolean boolean22 = outputSettings15.prettyPrint();
        int int23 = outputSettings15.getindentAmount();
        org.jsoup.nodes.Document.OutputSettings outputSettings25 = outputSettings15.forceAllElementAsBlock(true);
        org.jsoup.nodes.Document.OutputSettings outputSettings26 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Document.OutputSettings outputSettings28 = outputSettings26.indentAmount((int) 'a');
        org.jsoup.nodes.Entities.EscapeMode escapeMode29 = outputSettings28.escapeMode;
        java.nio.charset.Charset charset30 = outputSettings28.charset();
        org.jsoup.nodes.Document.OutputSettings outputSettings31 = outputSettings28.clone();
        outputSettings31.indentAmount = 0;
        org.jsoup.nodes.Document.OutputSettings outputSettings34 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Document.OutputSettings outputSettings36 = outputSettings34.indentAmount((int) 'a');
        org.jsoup.nodes.Entities.EscapeMode escapeMode37 = outputSettings36.escapeMode;
        java.nio.charset.Charset charset38 = outputSettings36.charset;
        outputSettings31.setcharset(charset38);
        org.jsoup.nodes.Document.OutputSettings outputSettings41 = outputSettings31.forceAllElementAsBlock(false);
        boolean boolean42 = outputSettings41.forceAllElementAsBlock;
        org.jsoup.nodes.Entities.EscapeMode escapeMode43 = outputSettings41.escapeMode();
        outputSettings15.escapeMode = escapeMode43;
        outputSettings5.setescapeMode(escapeMode43);
        org.jsoup.nodes.Entities.EscapeMode escapeMode46 = outputSettings5.escapeMode();
        org.junit.Assert.assertNotNull(outputSettings2);
        org.junit.Assert.assertTrue("'" + escapeMode3 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode3.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertNotNull(charset4);
        org.junit.Assert.assertNotNull(outputSettings5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(outputSettings12);
        org.junit.Assert.assertTrue("'" + escapeMode13 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode13.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertNotNull(charset14);
        org.junit.Assert.assertNotNull(outputSettings15);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 97 + "'", int23 == 97);
        org.junit.Assert.assertNotNull(outputSettings25);
        org.junit.Assert.assertNotNull(outputSettings28);
        org.junit.Assert.assertTrue("'" + escapeMode29 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode29.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertNotNull(charset30);
        org.junit.Assert.assertNotNull(outputSettings31);
        org.junit.Assert.assertNotNull(outputSettings36);
        org.junit.Assert.assertTrue("'" + escapeMode37 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode37.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertNotNull(charset38);
        org.junit.Assert.assertNotNull(outputSettings41);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertTrue("'" + escapeMode43 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode43.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertTrue("'" + escapeMode46 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode46.equals(org.jsoup.nodes.Entities.EscapeMode.base));
    }

    @Test
    public void test16150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16150");
        org.jsoup.nodes.Document.OutputSettings outputSettings0 = new org.jsoup.nodes.Document.OutputSettings();
        boolean boolean1 = outputSettings0.prettyPrint;
        org.jsoup.nodes.Document.OutputSettings outputSettings3 = outputSettings0.prettyPrint(true);
        org.jsoup.nodes.Document.OutputSettings outputSettings4 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Document.OutputSettings outputSettings6 = outputSettings4.indentAmount((int) 'a');
        org.jsoup.nodes.Entities.EscapeMode escapeMode7 = outputSettings6.escapeMode;
        java.nio.charset.Charset charset8 = outputSettings6.charset();
        org.jsoup.nodes.Entities.EscapeMode escapeMode9 = outputSettings6.escapeMode;
        int int10 = outputSettings6.indentAmount;
        java.nio.charset.CharsetEncoder charsetEncoder11 = outputSettings6.charsetEncoder;
        java.nio.charset.CharsetEncoder charsetEncoder12 = null;
        outputSettings6.charsetEncoder = charsetEncoder12;
        boolean boolean14 = outputSettings6.forceAllElementAsBlock;
        org.jsoup.nodes.Document.OutputSettings outputSettings15 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Document.OutputSettings outputSettings17 = outputSettings15.indentAmount((int) 'a');
        org.jsoup.nodes.Entities.EscapeMode escapeMode18 = outputSettings17.escapeMode;
        java.nio.charset.Charset charset19 = outputSettings17.charset();
        org.jsoup.nodes.Entities.EscapeMode escapeMode20 = outputSettings17.escapeMode;
        boolean boolean21 = outputSettings17.prettyPrint;
        boolean boolean22 = outputSettings17.forceAllElementAsBlock;
        boolean boolean23 = outputSettings17.getforceAllElementAsBlock();
        boolean boolean24 = outputSettings17.getforceAllElementAsBlock();
        org.jsoup.nodes.Document.OutputSettings outputSettings25 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Document.OutputSettings outputSettings27 = outputSettings25.indentAmount((int) 'a');
        org.jsoup.nodes.Document.OutputSettings outputSettings28 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Document.OutputSettings outputSettings30 = outputSettings28.indentAmount((int) 'a');
        java.nio.charset.Charset charset31 = outputSettings28.getcharset();
        outputSettings27.setcharset(charset31);
        outputSettings17.setcharset(charset31);
        outputSettings6.charset = charset31;
        outputSettings3.setcharset(charset31);
        org.jsoup.nodes.Document.OutputSettings outputSettings36 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Document.OutputSettings outputSettings38 = outputSettings36.indentAmount((int) 'a');
        org.jsoup.nodes.Entities.EscapeMode escapeMode39 = outputSettings38.escapeMode;
        java.nio.charset.Charset charset40 = outputSettings38.charset();
        org.jsoup.nodes.Document.OutputSettings outputSettings41 = outputSettings38.clone();
        outputSettings41.setindentAmount((int) (short) 10);
        org.jsoup.nodes.Document.OutputSettings outputSettings44 = new org.jsoup.nodes.Document.OutputSettings();
        boolean boolean45 = outputSettings44.prettyPrint;
        org.jsoup.nodes.Document.OutputSettings outputSettings46 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Document.OutputSettings outputSettings48 = outputSettings46.indentAmount((int) 'a');
        org.jsoup.nodes.Entities.EscapeMode escapeMode49 = outputSettings48.escapeMode;
        java.nio.charset.Charset charset50 = outputSettings48.charset();
        org.jsoup.nodes.Document.OutputSettings outputSettings51 = outputSettings48.clone();
        outputSettings48.forceAllElementAsBlock = true;
        org.jsoup.nodes.Entities.EscapeMode escapeMode54 = outputSettings48.escapeMode;
        org.jsoup.nodes.Document.OutputSettings outputSettings55 = outputSettings44.escapeMode(escapeMode54);
        outputSettings41.setescapeMode(escapeMode54);
        outputSettings41.indentAmount = (short) 10;
        int int59 = outputSettings41.indentAmount;
        java.nio.charset.Charset charset60 = outputSettings41.charset();
        outputSettings3.setcharset(charset60);
        org.jsoup.nodes.Document.OutputSettings outputSettings62 = outputSettings3.clone();
        outputSettings62.setindentAmount(35);
        int int65 = outputSettings62.getindentAmount();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertNotNull(outputSettings3);
        org.junit.Assert.assertNotNull(outputSettings6);
        org.junit.Assert.assertTrue("'" + escapeMode7 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode7.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertNotNull(charset8);
        org.junit.Assert.assertTrue("'" + escapeMode9 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode9.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 97 + "'", int10 == 97);
        org.junit.Assert.assertNotNull(charsetEncoder11);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(outputSettings17);
        org.junit.Assert.assertTrue("'" + escapeMode18 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode18.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertNotNull(charset19);
        org.junit.Assert.assertTrue("'" + escapeMode20 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode20.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(outputSettings27);
        org.junit.Assert.assertNotNull(outputSettings30);
        org.junit.Assert.assertNotNull(charset31);
        org.junit.Assert.assertNotNull(outputSettings38);
        org.junit.Assert.assertTrue("'" + escapeMode39 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode39.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertNotNull(charset40);
        org.junit.Assert.assertNotNull(outputSettings41);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + true + "'", boolean45 == true);
        org.junit.Assert.assertNotNull(outputSettings48);
        org.junit.Assert.assertTrue("'" + escapeMode49 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode49.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertNotNull(charset50);
        org.junit.Assert.assertNotNull(outputSettings51);
        org.junit.Assert.assertTrue("'" + escapeMode54 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode54.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertNotNull(outputSettings55);
        org.junit.Assert.assertTrue("'" + int59 + "' != '" + 10 + "'", int59 == 10);
        org.junit.Assert.assertNotNull(charset60);
        org.junit.Assert.assertNotNull(outputSettings62);
        org.junit.Assert.assertTrue("'" + int65 + "' != '" + 35 + "'", int65 == 35);
    }

    @Test
    public void test16151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16151");
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
        java.lang.StringBuilder stringBuilder25 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings27 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Document.OutputSettings outputSettings29 = outputSettings27.indentAmount((int) 'a');
        org.jsoup.nodes.Entities.EscapeMode escapeMode30 = outputSettings29.escapeMode;
        java.nio.charset.Charset charset31 = outputSettings29.charset();
        org.jsoup.nodes.Document.OutputSettings outputSettings32 = outputSettings29.clone();
        outputSettings29.forceAllElementAsBlock = true;
        org.jsoup.nodes.Entities.EscapeMode escapeMode35 = outputSettings29.escapeMode;
        int int36 = outputSettings29.getindentAmount();
        org.jsoup.nodes.Document.OutputSettings outputSettings38 = outputSettings29.prettyPrint(false);
        java.nio.charset.Charset charset39 = outputSettings29.charset();
        boolean boolean40 = outputSettings29.prettyPrint;
        org.jsoup.nodes.Entities.EscapeMode escapeMode41 = outputSettings29.escapeMode;
        outputSettings29.prettyPrint = false;
        org.jsoup.nodes.Document.OutputSettings outputSettings45 = outputSettings29.prettyPrint(false);
        org.jsoup.nodes.Document.OutputSettings outputSettings47 = outputSettings29.forceAllElementAsBlock(false);
        textNode2.outerHtmlTail(stringBuilder25, 0, outputSettings47);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "text" + "'", str5, "text");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "#text" + "'", str6, "#text");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(nodeList14);
        org.junit.Assert.assertNull(document17);
        org.junit.Assert.assertNotNull(attributes18);
        org.junit.Assert.assertNull(node19);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertNotNull(outputSettings29);
        org.junit.Assert.assertTrue("'" + escapeMode30 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode30.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertNotNull(charset31);
        org.junit.Assert.assertNotNull(outputSettings32);
        org.junit.Assert.assertTrue("'" + escapeMode35 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode35.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 97 + "'", int36 == 97);
        org.junit.Assert.assertNotNull(outputSettings38);
        org.junit.Assert.assertNotNull(charset39);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertTrue("'" + escapeMode41 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode41.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertNotNull(outputSettings45);
        org.junit.Assert.assertNotNull(outputSettings47);
    }

    @Test
    public void test16152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16152");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("", "hi!");
        java.lang.String str3 = textNode2.text;
        java.lang.String str4 = textNode2.outerHtml();
        java.lang.String str5 = textNode2.getTEXT_KEY();
        java.lang.String str6 = textNode2.nodeName();
        org.jsoup.nodes.Attributes attributes7 = textNode2.attributes();
        java.util.List<org.jsoup.nodes.Node> nodeList8 = textNode2.childNodes();
        java.lang.String str9 = textNode2.toString();
        java.util.List<org.jsoup.nodes.Node> nodeList10 = textNode2.childNodes();
        java.lang.String str11 = textNode2.gettext();
        boolean boolean12 = textNode2.isBlank();
        boolean boolean14 = textNode2.hasAttr("#");
        int int15 = textNode2.siblingIndex();
        int int16 = textNode2.siblingIndex();
        org.jsoup.nodes.Node node17 = textNode2.previousSibling();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "text" + "'", str5, "text");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "#text" + "'", str6, "#text");
        org.junit.Assert.assertNotNull(attributes7);
        org.junit.Assert.assertNotNull(nodeList8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNotNull(nodeList10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertNull(node17);
    }

    @Test
    public void test16153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16153");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("", "");
        java.lang.StringBuilder stringBuilder3 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings5 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Document.OutputSettings outputSettings7 = outputSettings5.indentAmount((int) 'a');
        org.jsoup.nodes.Entities.EscapeMode escapeMode8 = outputSettings7.escapeMode;
        java.nio.charset.Charset charset9 = outputSettings7.charset();
        org.jsoup.nodes.Document.OutputSettings outputSettings10 = outputSettings7.clone();
        outputSettings7.forceAllElementAsBlock = true;
        outputSettings7.setprettyPrint(true);
        org.jsoup.nodes.Document.OutputSettings outputSettings16 = outputSettings7.prettyPrint(true);
        org.jsoup.nodes.Entities.EscapeMode escapeMode17 = outputSettings16.escapeMode;
        textNode2.outerHtmlTail(stringBuilder3, (int) '4', outputSettings16);
        org.jsoup.nodes.Attributes attributes19 = textNode2.attributes();
        textNode2.settext("#text");
        org.jsoup.nodes.Node node22 = textNode2.parent();
        textNode2.text = "text";
        org.junit.Assert.assertNotNull(outputSettings7);
        org.junit.Assert.assertTrue("'" + escapeMode8 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode8.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertNotNull(charset9);
        org.junit.Assert.assertNotNull(outputSettings10);
        org.junit.Assert.assertNotNull(outputSettings16);
        org.junit.Assert.assertTrue("'" + escapeMode17 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode17.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertNotNull(attributes19);
        org.junit.Assert.assertNull(node22);
    }

    @Test
    public void test16154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16154");
        org.jsoup.nodes.Document.OutputSettings outputSettings0 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Document.OutputSettings outputSettings2 = outputSettings0.indentAmount((int) 'a');
        org.jsoup.nodes.Entities.EscapeMode escapeMode3 = outputSettings2.escapeMode;
        java.nio.charset.Charset charset4 = outputSettings2.charset();
        outputSettings2.setindentAmount(0);
        org.jsoup.nodes.Entities.EscapeMode escapeMode7 = outputSettings2.escapeMode;
        org.jsoup.nodes.Document.OutputSettings outputSettings9 = outputSettings2.indentAmount((int) (byte) 10);
        boolean boolean10 = outputSettings2.forceAllElementAsBlock;
        org.jsoup.nodes.Document.OutputSettings outputSettings11 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Document.OutputSettings outputSettings13 = outputSettings11.indentAmount((int) 'a');
        org.jsoup.nodes.Entities.EscapeMode escapeMode14 = outputSettings13.escapeMode;
        java.nio.charset.Charset charset15 = outputSettings13.charset();
        org.jsoup.nodes.Entities.EscapeMode escapeMode16 = outputSettings13.escapeMode;
        boolean boolean17 = outputSettings13.prettyPrint;
        org.jsoup.nodes.Document.OutputSettings outputSettings18 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Document.OutputSettings outputSettings20 = outputSettings18.indentAmount((int) 'a');
        org.jsoup.nodes.Entities.EscapeMode escapeMode21 = outputSettings20.escapeMode;
        java.nio.charset.Charset charset22 = outputSettings20.charset();
        outputSettings20.setindentAmount(0);
        org.jsoup.nodes.Entities.EscapeMode escapeMode25 = outputSettings20.escapeMode;
        org.jsoup.nodes.Document.OutputSettings outputSettings26 = outputSettings13.escapeMode(escapeMode25);
        outputSettings2.setescapeMode(escapeMode25);
        boolean boolean28 = outputSettings2.getprettyPrint();
        java.nio.charset.CharsetEncoder charsetEncoder29 = outputSettings2.encoder();
        org.jsoup.nodes.Entities.EscapeMode escapeMode30 = outputSettings2.escapeMode();
        org.junit.Assert.assertNotNull(outputSettings2);
        org.junit.Assert.assertTrue("'" + escapeMode3 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode3.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertNotNull(charset4);
        org.junit.Assert.assertTrue("'" + escapeMode7 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode7.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertNotNull(outputSettings9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(outputSettings13);
        org.junit.Assert.assertTrue("'" + escapeMode14 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode14.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertNotNull(charset15);
        org.junit.Assert.assertTrue("'" + escapeMode16 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode16.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertNotNull(outputSettings20);
        org.junit.Assert.assertTrue("'" + escapeMode21 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode21.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertNotNull(charset22);
        org.junit.Assert.assertTrue("'" + escapeMode25 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode25.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertNotNull(outputSettings26);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertNotNull(charsetEncoder29);
        org.junit.Assert.assertTrue("'" + escapeMode30 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode30.equals(org.jsoup.nodes.Entities.EscapeMode.base));
    }

    @Test
    public void test16155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16155");
        org.jsoup.nodes.Document.OutputSettings outputSettings0 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Document.OutputSettings outputSettings2 = outputSettings0.indentAmount((int) 'a');
        org.jsoup.nodes.Entities.EscapeMode escapeMode3 = outputSettings2.escapeMode;
        java.nio.charset.Charset charset4 = outputSettings2.charset();
        org.jsoup.nodes.Document.OutputSettings outputSettings5 = outputSettings2.clone();
        outputSettings2.forceAllElementAsBlock = true;
        org.jsoup.nodes.Entities.EscapeMode escapeMode8 = outputSettings2.escapeMode;
        int int9 = outputSettings2.getindentAmount();
        org.jsoup.nodes.TextNode textNode12 = new org.jsoup.nodes.TextNode("", "hi!");
        java.lang.String str13 = textNode12.text;
        java.lang.String str14 = textNode12.outerHtml();
        java.lang.String str15 = textNode12.getTEXT_KEY();
        java.lang.String str16 = textNode12.nodeName();
        boolean boolean17 = textNode12.isBlank();
        java.lang.String str18 = textNode12.outerHtml();
        java.lang.StringBuilder stringBuilder19 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings21 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Document.OutputSettings outputSettings23 = outputSettings21.indentAmount((int) 'a');
        org.jsoup.nodes.Document.OutputSettings outputSettings24 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Document.OutputSettings outputSettings26 = outputSettings24.indentAmount((int) 'a');
        org.jsoup.nodes.Entities.EscapeMode escapeMode27 = outputSettings26.escapeMode;
        java.nio.charset.Charset charset28 = outputSettings26.charset();
        org.jsoup.nodes.Document.OutputSettings outputSettings29 = outputSettings26.clone();
        outputSettings29.indentAmount = 0;
        org.jsoup.nodes.Document.OutputSettings outputSettings32 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Document.OutputSettings outputSettings34 = outputSettings32.indentAmount((int) 'a');
        org.jsoup.nodes.Entities.EscapeMode escapeMode35 = outputSettings34.escapeMode;
        java.nio.charset.Charset charset36 = outputSettings34.charset();
        org.jsoup.nodes.Entities.EscapeMode escapeMode37 = outputSettings34.escapeMode;
        int int38 = outputSettings34.indentAmount;
        java.nio.charset.CharsetEncoder charsetEncoder39 = outputSettings34.encoder();
        outputSettings29.charsetEncoder = charsetEncoder39;
        outputSettings21.setcharsetEncoder(charsetEncoder39);
        textNode12.outerHtmlTail(stringBuilder19, (int) (short) 100, outputSettings21);
        org.jsoup.nodes.Document.OutputSettings outputSettings43 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Document.OutputSettings outputSettings45 = outputSettings43.indentAmount((int) 'a');
        org.jsoup.nodes.Entities.EscapeMode escapeMode46 = outputSettings45.escapeMode;
        java.nio.charset.Charset charset47 = outputSettings45.charset();
        outputSettings45.setindentAmount(0);
        org.jsoup.nodes.Entities.EscapeMode escapeMode50 = outputSettings45.escapeMode;
        outputSettings45.forceAllElementAsBlock = false;
        java.nio.charset.CharsetEncoder charsetEncoder53 = outputSettings45.charsetEncoder;
        outputSettings21.charsetEncoder = charsetEncoder53;
        outputSettings2.setcharsetEncoder(charsetEncoder53);
        outputSettings2.indentAmount = (short) 0;
        boolean boolean58 = outputSettings2.prettyPrint();
        org.jsoup.nodes.Entities.EscapeMode escapeMode59 = outputSettings2.escapeMode;
        org.junit.Assert.assertNotNull(outputSettings2);
        org.junit.Assert.assertTrue("'" + escapeMode3 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode3.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertNotNull(charset4);
        org.junit.Assert.assertNotNull(outputSettings5);
        org.junit.Assert.assertTrue("'" + escapeMode8 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode8.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 97 + "'", int9 == 97);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "text" + "'", str15, "text");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "#text" + "'", str16, "#text");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertNotNull(outputSettings23);
        org.junit.Assert.assertNotNull(outputSettings26);
        org.junit.Assert.assertTrue("'" + escapeMode27 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode27.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertNotNull(charset28);
        org.junit.Assert.assertNotNull(outputSettings29);
        org.junit.Assert.assertNotNull(outputSettings34);
        org.junit.Assert.assertTrue("'" + escapeMode35 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode35.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertNotNull(charset36);
        org.junit.Assert.assertTrue("'" + escapeMode37 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode37.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 97 + "'", int38 == 97);
        org.junit.Assert.assertNotNull(charsetEncoder39);
        org.junit.Assert.assertNotNull(outputSettings45);
        org.junit.Assert.assertTrue("'" + escapeMode46 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode46.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertNotNull(charset47);
        org.junit.Assert.assertTrue("'" + escapeMode50 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode50.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertNotNull(charsetEncoder53);
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + true + "'", boolean58 == true);
        org.junit.Assert.assertTrue("'" + escapeMode59 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode59.equals(org.jsoup.nodes.Entities.EscapeMode.base));
    }

    @Test
    public void test16156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16156");
        org.jsoup.nodes.Document.OutputSettings outputSettings0 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Document.OutputSettings outputSettings2 = outputSettings0.indentAmount((int) 'a');
        org.jsoup.nodes.Entities.EscapeMode escapeMode3 = outputSettings2.escapeMode;
        java.nio.charset.Charset charset4 = outputSettings2.charset();
        org.jsoup.nodes.Document.OutputSettings outputSettings5 = outputSettings2.clone();
        outputSettings2.forceAllElementAsBlock = true;
        java.nio.charset.CharsetEncoder charsetEncoder8 = outputSettings2.getcharsetEncoder();
        org.jsoup.nodes.Document.OutputSettings outputSettings10 = outputSettings2.forceAllElementAsBlock(false);
        boolean boolean11 = outputSettings10.getprettyPrint();
        boolean boolean12 = outputSettings10.getforceAllElementAsBlock();
        org.jsoup.nodes.Document.OutputSettings outputSettings14 = outputSettings10.indentAmount((int) (short) 1);
        java.nio.charset.Charset charset15 = outputSettings14.charset;
        outputSettings14.indentAmount = (short) 100;
        org.jsoup.nodes.Document.OutputSettings outputSettings18 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Document.OutputSettings outputSettings20 = outputSettings18.indentAmount((int) 'a');
        org.jsoup.nodes.Document.OutputSettings outputSettings21 = outputSettings18.clone();
        outputSettings18.forceAllElementAsBlock = false;
        org.jsoup.nodes.Entities.EscapeMode escapeMode24 = outputSettings18.escapeMode;
        java.nio.charset.Charset charset25 = outputSettings18.charset;
        boolean boolean26 = outputSettings18.forceAllElementAsBlock;
        java.nio.charset.Charset charset27 = outputSettings18.charset();
        org.jsoup.nodes.Document.OutputSettings outputSettings29 = outputSettings18.prettyPrint(true);
        java.nio.charset.Charset charset30 = outputSettings18.getcharset();
        org.jsoup.nodes.Document.OutputSettings outputSettings31 = outputSettings14.charset(charset30);
        org.junit.Assert.assertNotNull(outputSettings2);
        org.junit.Assert.assertTrue("'" + escapeMode3 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode3.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertNotNull(charset4);
        org.junit.Assert.assertNotNull(outputSettings5);
        org.junit.Assert.assertNotNull(charsetEncoder8);
        org.junit.Assert.assertNotNull(outputSettings10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(outputSettings14);
        org.junit.Assert.assertNotNull(charset15);
        org.junit.Assert.assertNotNull(outputSettings20);
        org.junit.Assert.assertNotNull(outputSettings21);
        org.junit.Assert.assertTrue("'" + escapeMode24 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode24.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertNotNull(charset25);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNotNull(charset27);
        org.junit.Assert.assertNotNull(outputSettings29);
        org.junit.Assert.assertNotNull(charset30);
        org.junit.Assert.assertNotNull(outputSettings31);
    }

    @Test
    public void test16157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16157");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("", "hi!");
        java.lang.String str3 = textNode2.text;
        boolean boolean5 = textNode2.hasAttr("hi!");
        org.jsoup.nodes.Node node6 = textNode2.parent();
        java.lang.String str7 = textNode2.baseUri();
        textNode2.text = "#text";
        java.lang.String str10 = textNode2.baseUri();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(node6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
    }

    @Test
    public void test16158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16158");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("", "hi!");
        java.lang.String str4 = textNode2.absUrl("#text");
        java.lang.StringBuilder stringBuilder5 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings7 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Document.OutputSettings outputSettings9 = outputSettings7.indentAmount((int) 'a');
        org.jsoup.nodes.Entities.EscapeMode escapeMode10 = outputSettings9.escapeMode;
        java.nio.charset.Charset charset11 = outputSettings9.charset();
        org.jsoup.nodes.Entities.EscapeMode escapeMode12 = outputSettings9.escapeMode;
        boolean boolean13 = outputSettings9.prettyPrint;
        org.jsoup.nodes.Document.OutputSettings outputSettings14 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Document.OutputSettings outputSettings16 = outputSettings14.indentAmount((int) 'a');
        org.jsoup.nodes.Entities.EscapeMode escapeMode17 = outputSettings16.escapeMode;
        java.nio.charset.Charset charset18 = outputSettings16.charset();
        outputSettings16.setindentAmount(0);
        org.jsoup.nodes.Entities.EscapeMode escapeMode21 = outputSettings16.escapeMode;
        org.jsoup.nodes.Document.OutputSettings outputSettings22 = outputSettings9.escapeMode(escapeMode21);
        org.jsoup.nodes.Document.OutputSettings outputSettings23 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Document.OutputSettings outputSettings25 = outputSettings23.indentAmount((int) 'a');
        org.jsoup.nodes.Entities.EscapeMode escapeMode26 = outputSettings25.escapeMode;
        java.nio.charset.Charset charset27 = outputSettings25.charset();
        org.jsoup.nodes.Entities.EscapeMode escapeMode28 = outputSettings25.escapeMode;
        boolean boolean29 = outputSettings25.prettyPrint;
        boolean boolean30 = outputSettings25.forceAllElementAsBlock;
        boolean boolean31 = outputSettings25.getforceAllElementAsBlock();
        boolean boolean32 = outputSettings25.getprettyPrint();
        java.nio.charset.Charset charset33 = outputSettings25.getcharset();
        outputSettings9.charset = charset33;
        textNode2.outerHtmlTail(stringBuilder5, (int) (short) 1, outputSettings9);
        java.lang.String str37 = textNode2.absUrl("hi!");
        org.jsoup.nodes.Document document38 = textNode2.ownerDocument();
        java.lang.String str39 = textNode2.getWholeText();
        int int40 = textNode2.siblingIndex();
        java.lang.String str41 = textNode2.text;
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(outputSettings9);
        org.junit.Assert.assertTrue("'" + escapeMode10 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode10.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertNotNull(charset11);
        org.junit.Assert.assertTrue("'" + escapeMode12 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode12.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNotNull(outputSettings16);
        org.junit.Assert.assertTrue("'" + escapeMode17 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode17.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertNotNull(charset18);
        org.junit.Assert.assertTrue("'" + escapeMode21 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode21.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertNotNull(outputSettings22);
        org.junit.Assert.assertNotNull(outputSettings25);
        org.junit.Assert.assertTrue("'" + escapeMode26 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode26.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertNotNull(charset27);
        org.junit.Assert.assertTrue("'" + escapeMode28 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode28.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + true + "'", boolean32 == true);
        org.junit.Assert.assertNotNull(charset33);
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "" + "'", str37, "");
        org.junit.Assert.assertNull(document38);
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "" + "'", str39, "");
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 0 + "'", int40 == 0);
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "" + "'", str41, "");
    }

    @Test
    public void test16159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16159");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("", "hi!");
        java.lang.String str3 = textNode2.text;
        java.lang.String str4 = textNode2.outerHtml();
        java.lang.String str5 = textNode2.getTEXT_KEY();
        java.lang.String str6 = textNode2.nodeName();
        org.jsoup.nodes.Attributes attributes7 = textNode2.attributes();
        org.jsoup.nodes.Node node8 = textNode2.clone();
        java.lang.StringBuilder stringBuilder9 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings11 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Document.OutputSettings outputSettings13 = outputSettings11.indentAmount((int) 'a');
        org.jsoup.nodes.Entities.EscapeMode escapeMode14 = outputSettings13.escapeMode;
        outputSettings13.setindentAmount((int) '4');
        org.jsoup.nodes.Document.OutputSettings outputSettings17 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Document.OutputSettings outputSettings19 = outputSettings17.indentAmount((int) 'a');
        org.jsoup.nodes.Entities.EscapeMode escapeMode20 = outputSettings19.escapeMode;
        java.nio.charset.Charset charset21 = outputSettings19.charset();
        outputSettings13.setcharset(charset21);
        org.jsoup.nodes.Document.OutputSettings outputSettings23 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Document.OutputSettings outputSettings25 = outputSettings23.indentAmount((int) 'a');
        org.jsoup.nodes.Entities.EscapeMode escapeMode26 = outputSettings25.escapeMode;
        java.nio.charset.Charset charset27 = outputSettings25.charset();
        org.jsoup.nodes.Entities.EscapeMode escapeMode28 = outputSettings25.escapeMode;
        boolean boolean29 = outputSettings25.prettyPrint;
        org.jsoup.nodes.Document.OutputSettings outputSettings30 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Document.OutputSettings outputSettings32 = outputSettings30.indentAmount((int) 'a');
        org.jsoup.nodes.Entities.EscapeMode escapeMode33 = outputSettings32.escapeMode;
        org.jsoup.nodes.Document.OutputSettings outputSettings34 = outputSettings25.escapeMode(escapeMode33);
        org.jsoup.nodes.Document.OutputSettings outputSettings35 = outputSettings13.escapeMode(escapeMode33);
        boolean boolean36 = outputSettings35.getforceAllElementAsBlock();
        textNode2.outerHtmlTail(stringBuilder9, (int) (byte) 0, outputSettings35);
        org.jsoup.nodes.Attributes attributes38 = textNode2.attributes();
        java.lang.String str40 = textNode2.absUrl("hi!");
        java.lang.String str41 = textNode2.text();
        java.lang.String str42 = textNode2.getTEXT_KEY();
        java.lang.String str44 = textNode2.attr("#text");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node46 = textNode2.after("h");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "text" + "'", str5, "text");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "#text" + "'", str6, "#text");
        org.junit.Assert.assertNotNull(attributes7);
        org.junit.Assert.assertNotNull(node8);
        org.junit.Assert.assertNotNull(outputSettings13);
        org.junit.Assert.assertTrue("'" + escapeMode14 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode14.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertNotNull(outputSettings19);
        org.junit.Assert.assertTrue("'" + escapeMode20 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode20.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertNotNull(charset21);
        org.junit.Assert.assertNotNull(outputSettings25);
        org.junit.Assert.assertTrue("'" + escapeMode26 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode26.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertNotNull(charset27);
        org.junit.Assert.assertTrue("'" + escapeMode28 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode28.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertNotNull(outputSettings32);
        org.junit.Assert.assertTrue("'" + escapeMode33 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode33.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertNotNull(outputSettings34);
        org.junit.Assert.assertNotNull(outputSettings35);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertNotNull(attributes38);
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "" + "'", str40, "");
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "" + "'", str41, "");
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "text" + "'", str42, "text");
        org.junit.Assert.assertEquals("'" + str44 + "' != '" + "" + "'", str44, "");
    }

    @Test
    public void test16160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16160");
        org.jsoup.nodes.Document.OutputSettings outputSettings0 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Document.OutputSettings outputSettings2 = outputSettings0.indentAmount((int) 'a');
        org.jsoup.nodes.Entities.EscapeMode escapeMode3 = outputSettings2.escapeMode;
        java.nio.charset.Charset charset4 = outputSettings2.charset();
        org.jsoup.nodes.Document.OutputSettings outputSettings5 = outputSettings2.clone();
        outputSettings2.forceAllElementAsBlock = true;
        org.jsoup.nodes.Entities.EscapeMode escapeMode8 = outputSettings2.escapeMode;
        int int9 = outputSettings2.getindentAmount();
        org.jsoup.nodes.Document.OutputSettings outputSettings11 = outputSettings2.prettyPrint(false);
        java.nio.charset.Charset charset12 = outputSettings2.charset();
        boolean boolean13 = outputSettings2.prettyPrint;
        org.jsoup.nodes.Entities.EscapeMode escapeMode14 = outputSettings2.escapeMode;
        org.jsoup.nodes.Document.OutputSettings outputSettings16 = outputSettings2.indentAmount((int) (short) 0);
        org.jsoup.nodes.Document.OutputSettings outputSettings17 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Document.OutputSettings outputSettings19 = outputSettings17.indentAmount((int) 'a');
        org.jsoup.nodes.Document.OutputSettings outputSettings20 = outputSettings17.clone();
        outputSettings17.forceAllElementAsBlock = false;
        org.jsoup.nodes.Entities.EscapeMode escapeMode23 = outputSettings17.escapeMode;
        java.nio.charset.Charset charset24 = outputSettings17.charset;
        org.jsoup.nodes.Document.OutputSettings outputSettings25 = outputSettings17.clone();
        java.nio.charset.Charset charset26 = null;
        outputSettings17.charset = charset26;
        outputSettings17.setindentAmount((int) (byte) -1);
        org.jsoup.nodes.Document.OutputSettings outputSettings30 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Document.OutputSettings outputSettings32 = outputSettings30.indentAmount((int) 'a');
        org.jsoup.nodes.Document.OutputSettings outputSettings33 = outputSettings30.clone();
        outputSettings30.forceAllElementAsBlock = false;
        org.jsoup.nodes.Entities.EscapeMode escapeMode36 = outputSettings30.escapeMode;
        java.nio.charset.Charset charset37 = outputSettings30.charset;
        org.jsoup.nodes.Document.OutputSettings outputSettings38 = outputSettings30.clone();
        java.nio.charset.Charset charset39 = null;
        outputSettings30.charset = charset39;
        boolean boolean41 = outputSettings30.getprettyPrint();
        boolean boolean42 = outputSettings30.prettyPrint;
        org.jsoup.nodes.Document.OutputSettings outputSettings43 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Document.OutputSettings outputSettings45 = outputSettings43.indentAmount((int) 'a');
        outputSettings45.prettyPrint = false;
        int int48 = outputSettings45.indentAmount;
        java.nio.charset.Charset charset49 = outputSettings45.charset;
        outputSettings30.charset = charset49;
        java.nio.charset.Charset charset51 = outputSettings30.charset;
        org.jsoup.nodes.Document.OutputSettings outputSettings52 = outputSettings17.charset(charset51);
        outputSettings2.setcharset(charset51);
        org.junit.Assert.assertNotNull(outputSettings2);
        org.junit.Assert.assertTrue("'" + escapeMode3 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode3.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertNotNull(charset4);
        org.junit.Assert.assertNotNull(outputSettings5);
        org.junit.Assert.assertTrue("'" + escapeMode8 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode8.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 97 + "'", int9 == 97);
        org.junit.Assert.assertNotNull(outputSettings11);
        org.junit.Assert.assertNotNull(charset12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + escapeMode14 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode14.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertNotNull(outputSettings16);
        org.junit.Assert.assertNotNull(outputSettings19);
        org.junit.Assert.assertNotNull(outputSettings20);
        org.junit.Assert.assertTrue("'" + escapeMode23 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode23.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertNotNull(charset24);
        org.junit.Assert.assertNotNull(outputSettings25);
        org.junit.Assert.assertNotNull(outputSettings32);
        org.junit.Assert.assertNotNull(outputSettings33);
        org.junit.Assert.assertTrue("'" + escapeMode36 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode36.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertNotNull(charset37);
        org.junit.Assert.assertNotNull(outputSettings38);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + true + "'", boolean41 == true);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + true + "'", boolean42 == true);
        org.junit.Assert.assertNotNull(outputSettings45);
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + 97 + "'", int48 == 97);
        org.junit.Assert.assertNotNull(charset49);
        org.junit.Assert.assertNotNull(charset51);
        org.junit.Assert.assertNotNull(outputSettings52);
    }

    @Test
    public void test16161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16161");
        org.jsoup.nodes.Document.OutputSettings outputSettings0 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Document.OutputSettings outputSettings2 = outputSettings0.indentAmount((int) 'a');
        org.jsoup.nodes.Entities.EscapeMode escapeMode3 = outputSettings2.escapeMode;
        java.nio.charset.Charset charset4 = outputSettings2.charset();
        org.jsoup.nodes.Document.OutputSettings outputSettings5 = outputSettings2.clone();
        outputSettings5.indentAmount = 0;
        org.jsoup.nodes.Document.OutputSettings outputSettings8 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Document.OutputSettings outputSettings10 = outputSettings8.indentAmount((int) 'a');
        org.jsoup.nodes.Entities.EscapeMode escapeMode11 = outputSettings10.escapeMode;
        java.nio.charset.Charset charset12 = outputSettings10.charset;
        outputSettings5.setcharset(charset12);
        org.jsoup.nodes.Document.OutputSettings outputSettings15 = outputSettings5.forceAllElementAsBlock(false);
        outputSettings5.prettyPrint = true;
        java.nio.charset.CharsetEncoder charsetEncoder18 = outputSettings5.getcharsetEncoder();
        boolean boolean19 = outputSettings5.forceAllElementAsBlock;
        org.jsoup.nodes.Document.OutputSettings outputSettings20 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Document.OutputSettings outputSettings22 = outputSettings20.indentAmount((int) 'a');
        org.jsoup.nodes.Entities.EscapeMode escapeMode23 = outputSettings22.escapeMode;
        java.nio.charset.Charset charset24 = outputSettings22.charset();
        outputSettings22.setindentAmount(0);
        org.jsoup.nodes.Entities.EscapeMode escapeMode27 = outputSettings22.escapeMode;
        org.jsoup.nodes.Document.OutputSettings outputSettings29 = outputSettings22.indentAmount((int) (byte) 10);
        boolean boolean30 = outputSettings22.forceAllElementAsBlock;
        org.jsoup.nodes.Entities.EscapeMode escapeMode31 = outputSettings22.getescapeMode();
        org.jsoup.nodes.Entities.EscapeMode escapeMode32 = outputSettings22.escapeMode();
        outputSettings5.setescapeMode(escapeMode32);
        org.jsoup.nodes.Entities.EscapeMode escapeMode34 = outputSettings5.escapeMode;
        org.jsoup.nodes.Entities.EscapeMode escapeMode35 = outputSettings5.getescapeMode();
        boolean boolean36 = outputSettings5.getforceAllElementAsBlock();
        org.junit.Assert.assertNotNull(outputSettings2);
        org.junit.Assert.assertTrue("'" + escapeMode3 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode3.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertNotNull(charset4);
        org.junit.Assert.assertNotNull(outputSettings5);
        org.junit.Assert.assertNotNull(outputSettings10);
        org.junit.Assert.assertTrue("'" + escapeMode11 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode11.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertNotNull(charset12);
        org.junit.Assert.assertNotNull(outputSettings15);
        org.junit.Assert.assertNotNull(charsetEncoder18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(outputSettings22);
        org.junit.Assert.assertTrue("'" + escapeMode23 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode23.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertNotNull(charset24);
        org.junit.Assert.assertTrue("'" + escapeMode27 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode27.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertNotNull(outputSettings29);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + escapeMode31 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode31.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertTrue("'" + escapeMode32 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode32.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertTrue("'" + escapeMode34 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode34.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertTrue("'" + escapeMode35 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode35.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
    }

    @Test
    public void test16162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16162");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("", "hi!");
        java.lang.String str3 = textNode2.text;
        java.lang.String str4 = textNode2.outerHtml();
        java.lang.String str5 = textNode2.getTEXT_KEY();
        java.lang.String str6 = textNode2.nodeName();
        boolean boolean8 = textNode2.equals((java.lang.Object) (short) 1);
        textNode2.setBaseUri("#text");
        org.jsoup.nodes.Node node11 = textNode2.parent();
        java.lang.String str12 = textNode2.getWholeText();
        java.util.List<org.jsoup.nodes.Node> nodeList13 = textNode2.siblingNodes();
        textNode2.setBaseUri("#");
        java.lang.StringBuilder stringBuilder16 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings18 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Document.OutputSettings outputSettings20 = outputSettings18.indentAmount((int) 'a');
        org.jsoup.nodes.Entities.EscapeMode escapeMode21 = outputSettings20.escapeMode;
        java.nio.charset.Charset charset22 = outputSettings20.charset();
        org.jsoup.nodes.Document.OutputSettings outputSettings23 = outputSettings20.clone();
        java.nio.charset.Charset charset24 = outputSettings20.charset;
        org.jsoup.nodes.Document.OutputSettings outputSettings25 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Document.OutputSettings outputSettings27 = outputSettings25.indentAmount((int) 'a');
        java.nio.charset.Charset charset28 = outputSettings25.getcharset();
        boolean boolean29 = outputSettings25.prettyPrint();
        boolean boolean30 = outputSettings25.forceAllElementAsBlock;
        org.jsoup.nodes.Document.OutputSettings outputSettings31 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Document.OutputSettings outputSettings33 = outputSettings31.indentAmount((int) 'a');
        org.jsoup.nodes.Entities.EscapeMode escapeMode34 = outputSettings33.escapeMode;
        outputSettings33.setindentAmount((int) '4');
        org.jsoup.nodes.Document.OutputSettings outputSettings37 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Document.OutputSettings outputSettings39 = outputSettings37.indentAmount((int) 'a');
        org.jsoup.nodes.Entities.EscapeMode escapeMode40 = outputSettings39.escapeMode;
        java.nio.charset.Charset charset41 = outputSettings39.charset();
        outputSettings33.setcharset(charset41);
        org.jsoup.nodes.Document.OutputSettings outputSettings43 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Document.OutputSettings outputSettings45 = outputSettings43.indentAmount((int) 'a');
        org.jsoup.nodes.Entities.EscapeMode escapeMode46 = outputSettings45.escapeMode;
        java.nio.charset.Charset charset47 = outputSettings45.charset();
        org.jsoup.nodes.Entities.EscapeMode escapeMode48 = outputSettings45.escapeMode;
        boolean boolean49 = outputSettings45.prettyPrint;
        org.jsoup.nodes.Document.OutputSettings outputSettings50 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Document.OutputSettings outputSettings52 = outputSettings50.indentAmount((int) 'a');
        org.jsoup.nodes.Entities.EscapeMode escapeMode53 = outputSettings52.escapeMode;
        org.jsoup.nodes.Document.OutputSettings outputSettings54 = outputSettings45.escapeMode(escapeMode53);
        org.jsoup.nodes.Document.OutputSettings outputSettings55 = outputSettings33.escapeMode(escapeMode53);
        outputSettings25.setescapeMode(escapeMode53);
        outputSettings20.escapeMode = escapeMode53;
        java.nio.charset.Charset charset58 = outputSettings20.charset();
        textNode2.outerHtmlTail(stringBuilder16, (int) ' ', outputSettings20);
        org.jsoup.nodes.Entities.EscapeMode escapeMode60 = outputSettings20.escapeMode();
        boolean boolean61 = outputSettings20.getforceAllElementAsBlock();
        outputSettings20.prettyPrint = false;
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "text" + "'", str5, "text");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "#text" + "'", str6, "#text");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(node11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertNotNull(nodeList13);
        org.junit.Assert.assertNotNull(outputSettings20);
        org.junit.Assert.assertTrue("'" + escapeMode21 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode21.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertNotNull(charset22);
        org.junit.Assert.assertNotNull(outputSettings23);
        org.junit.Assert.assertNotNull(charset24);
        org.junit.Assert.assertNotNull(outputSettings27);
        org.junit.Assert.assertNotNull(charset28);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertNotNull(outputSettings33);
        org.junit.Assert.assertTrue("'" + escapeMode34 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode34.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertNotNull(outputSettings39);
        org.junit.Assert.assertTrue("'" + escapeMode40 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode40.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertNotNull(charset41);
        org.junit.Assert.assertNotNull(outputSettings45);
        org.junit.Assert.assertTrue("'" + escapeMode46 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode46.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertNotNull(charset47);
        org.junit.Assert.assertTrue("'" + escapeMode48 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode48.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + true + "'", boolean49 == true);
        org.junit.Assert.assertNotNull(outputSettings52);
        org.junit.Assert.assertTrue("'" + escapeMode53 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode53.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertNotNull(outputSettings54);
        org.junit.Assert.assertNotNull(outputSettings55);
        org.junit.Assert.assertNotNull(charset58);
        org.junit.Assert.assertTrue("'" + escapeMode60 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode60.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + false + "'", boolean61 == false);
    }

    @Test
    public void test16163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16163");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("", "hi!");
        java.lang.String str3 = textNode2.text;
        java.lang.String str4 = textNode2.outerHtml();
        java.lang.String str5 = textNode2.getTEXT_KEY();
        java.lang.String str6 = textNode2.nodeName();
        boolean boolean8 = textNode2.equals((java.lang.Object) (short) 1);
        textNode2.setBaseUri("#text");
        org.jsoup.nodes.Node node11 = textNode2.previousSibling();
        org.jsoup.nodes.TextNode textNode13 = textNode2.text("text");
        textNode2.ensureAttributes();
        textNode2.text = "#text";
        org.jsoup.nodes.Node node19 = textNode2.attr("h", "h");
        java.lang.String str20 = textNode2.getTEXT_KEY();
        java.lang.String str21 = textNode2.text;
        java.lang.StringBuilder stringBuilder22 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings24 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Document.OutputSettings outputSettings26 = outputSettings24.indentAmount((int) 'a');
        org.jsoup.nodes.Entities.EscapeMode escapeMode27 = outputSettings26.escapeMode;
        java.nio.charset.Charset charset28 = outputSettings26.charset();
        org.jsoup.nodes.Entities.EscapeMode escapeMode29 = outputSettings26.escapeMode;
        boolean boolean30 = outputSettings26.prettyPrint;
        org.jsoup.nodes.Document.OutputSettings outputSettings31 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Document.OutputSettings outputSettings33 = outputSettings31.indentAmount((int) 'a');
        org.jsoup.nodes.Entities.EscapeMode escapeMode34 = outputSettings33.escapeMode;
        org.jsoup.nodes.Document.OutputSettings outputSettings35 = outputSettings26.escapeMode(escapeMode34);
        outputSettings26.forceAllElementAsBlock = false;
        org.jsoup.nodes.Entities.EscapeMode escapeMode38 = outputSettings26.escapeMode();
        // The following exception was thrown during execution in test generation
        try {
            textNode2.outerHtmlHead(stringBuilder22, (int) (short) 0, outputSettings26);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "text" + "'", str5, "text");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "#text" + "'", str6, "#text");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(node11);
        org.junit.Assert.assertNotNull(textNode13);
        org.junit.Assert.assertNotNull(node19);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "text" + "'", str20, "text");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "#text" + "'", str21, "#text");
        org.junit.Assert.assertNotNull(outputSettings26);
        org.junit.Assert.assertTrue("'" + escapeMode27 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode27.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertNotNull(charset28);
        org.junit.Assert.assertTrue("'" + escapeMode29 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode29.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertNotNull(outputSettings33);
        org.junit.Assert.assertTrue("'" + escapeMode34 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode34.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertNotNull(outputSettings35);
        org.junit.Assert.assertTrue("'" + escapeMode38 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode38.equals(org.jsoup.nodes.Entities.EscapeMode.base));
    }

    @Test
    public void test16164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16164");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("", "hi!");
        java.lang.String str3 = textNode2.text;
        java.lang.String str4 = textNode2.outerHtml();
        java.lang.String str5 = textNode2.getTEXT_KEY();
        java.lang.String str6 = textNode2.text;
        java.lang.Object obj7 = null;
        boolean boolean8 = textNode2.equals(obj7);
        org.jsoup.nodes.TextNode textNode10 = textNode2.text("hi!");
        org.jsoup.nodes.Node node13 = textNode10.attr("hi!", "#text");
        org.jsoup.nodes.Node node14 = node13.parent();
        java.util.List<org.jsoup.nodes.Node> nodeList15 = node13.siblingNodes();
        node13.setBaseUri("#text");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "text" + "'", str5, "text");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(textNode10);
        org.junit.Assert.assertNotNull(node13);
        org.junit.Assert.assertNull(node14);
        org.junit.Assert.assertNotNull(nodeList15);
    }

    @Test
    public void test16165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16165");
        org.jsoup.nodes.Document.OutputSettings outputSettings0 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Document.OutputSettings outputSettings2 = outputSettings0.indentAmount((int) 'a');
        org.jsoup.nodes.Entities.EscapeMode escapeMode3 = outputSettings2.escapeMode;
        java.nio.charset.Charset charset4 = outputSettings2.charset();
        org.jsoup.nodes.Document.OutputSettings outputSettings5 = outputSettings2.clone();
        outputSettings5.indentAmount = 0;
        org.jsoup.nodes.Document.OutputSettings outputSettings8 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Document.OutputSettings outputSettings10 = outputSettings8.indentAmount((int) 'a');
        org.jsoup.nodes.Entities.EscapeMode escapeMode11 = outputSettings10.escapeMode;
        java.nio.charset.Charset charset12 = outputSettings10.charset();
        org.jsoup.nodes.Entities.EscapeMode escapeMode13 = outputSettings10.escapeMode;
        int int14 = outputSettings10.indentAmount;
        java.nio.charset.CharsetEncoder charsetEncoder15 = outputSettings10.encoder();
        outputSettings5.charsetEncoder = charsetEncoder15;
        org.jsoup.nodes.Document.OutputSettings outputSettings17 = new org.jsoup.nodes.Document.OutputSettings();
        boolean boolean18 = outputSettings17.prettyPrint;
        org.jsoup.nodes.Document.OutputSettings outputSettings19 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Document.OutputSettings outputSettings21 = outputSettings19.indentAmount((int) 'a');
        org.jsoup.nodes.Entities.EscapeMode escapeMode22 = outputSettings21.escapeMode;
        java.nio.charset.Charset charset23 = outputSettings21.charset();
        org.jsoup.nodes.Document.OutputSettings outputSettings24 = outputSettings17.charset(charset23);
        outputSettings5.charset = charset23;
        boolean boolean26 = outputSettings5.getforceAllElementAsBlock();
        outputSettings5.prettyPrint = false;
        boolean boolean29 = outputSettings5.prettyPrint();
        org.jsoup.nodes.Entities.EscapeMode escapeMode30 = outputSettings5.getescapeMode();
        org.jsoup.nodes.TextNode textNode33 = new org.jsoup.nodes.TextNode("", "hi!");
        java.lang.String str34 = textNode33.text;
        java.lang.String str35 = textNode33.outerHtml();
        java.lang.String str36 = textNode33.getTEXT_KEY();
        java.lang.String str37 = textNode33.nodeName();
        boolean boolean39 = textNode33.equals((java.lang.Object) (short) 1);
        textNode33.setBaseUri("#text");
        boolean boolean42 = textNode33.isBlank();
        textNode33.text = "#text";
        java.util.List<org.jsoup.nodes.Node> nodeList45 = textNode33.childNodes();
        java.lang.String str46 = textNode33.outerHtml();
        java.lang.StringBuilder stringBuilder47 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings49 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Document.OutputSettings outputSettings51 = outputSettings49.indentAmount((int) 'a');
        org.jsoup.nodes.Entities.EscapeMode escapeMode52 = outputSettings51.escapeMode;
        java.nio.charset.Charset charset53 = outputSettings51.charset();
        org.jsoup.nodes.Entities.EscapeMode escapeMode54 = outputSettings51.escapeMode;
        boolean boolean55 = outputSettings51.prettyPrint;
        boolean boolean56 = outputSettings51.forceAllElementAsBlock;
        boolean boolean57 = outputSettings51.getforceAllElementAsBlock();
        boolean boolean58 = outputSettings51.getprettyPrint();
        boolean boolean59 = outputSettings51.forceAllElementAsBlock();
        int int60 = outputSettings51.indentAmount();
        textNode33.outerHtmlTail(stringBuilder47, (int) (short) 0, outputSettings51);
        java.nio.charset.Charset charset62 = outputSettings51.getcharset();
        java.nio.charset.Charset charset63 = outputSettings51.charset();
        outputSettings5.setcharset(charset63);
        org.junit.Assert.assertNotNull(outputSettings2);
        org.junit.Assert.assertTrue("'" + escapeMode3 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode3.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertNotNull(charset4);
        org.junit.Assert.assertNotNull(outputSettings5);
        org.junit.Assert.assertNotNull(outputSettings10);
        org.junit.Assert.assertTrue("'" + escapeMode11 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode11.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertNotNull(charset12);
        org.junit.Assert.assertTrue("'" + escapeMode13 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode13.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 97 + "'", int14 == 97);
        org.junit.Assert.assertNotNull(charsetEncoder15);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertNotNull(outputSettings21);
        org.junit.Assert.assertTrue("'" + escapeMode22 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode22.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertNotNull(charset23);
        org.junit.Assert.assertNotNull(outputSettings24);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertTrue("'" + escapeMode30 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode30.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "" + "'", str34, "");
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "" + "'", str35, "");
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "text" + "'", str36, "text");
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "#text" + "'", str37, "#text");
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + true + "'", boolean42 == true);
        org.junit.Assert.assertNotNull(nodeList45);
        org.junit.Assert.assertEquals("'" + str46 + "' != '" + "#text" + "'", str46, "#text");
        org.junit.Assert.assertNotNull(outputSettings51);
        org.junit.Assert.assertTrue("'" + escapeMode52 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode52.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertNotNull(charset53);
        org.junit.Assert.assertTrue("'" + escapeMode54 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode54.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + true + "'", boolean55 == true);
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + false + "'", boolean56 == false);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + false + "'", boolean57 == false);
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + true + "'", boolean58 == true);
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + false + "'", boolean59 == false);
        org.junit.Assert.assertTrue("'" + int60 + "' != '" + 97 + "'", int60 == 97);
        org.junit.Assert.assertNotNull(charset62);
        org.junit.Assert.assertNotNull(charset63);
    }

    @Test
    public void test16166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16166");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("", "hi!");
        java.lang.String str3 = textNode2.text;
        java.lang.String str4 = textNode2.outerHtml();
        java.lang.String str5 = textNode2.getTEXT_KEY();
        java.lang.String str6 = textNode2.nodeName();
        boolean boolean8 = textNode2.equals((java.lang.Object) (short) 1);
        textNode2.setBaseUri("#text");
        org.jsoup.nodes.Node node11 = textNode2.previousSibling();
        textNode2.text = "#";
        java.lang.String str14 = textNode2.text();
        textNode2.text = "hi!";
        java.lang.String str18 = textNode2.absUrl("#");
        textNode2.ensureAttributes();
        java.lang.String str20 = textNode2.text;
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "text" + "'", str5, "text");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "#text" + "'", str6, "#text");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(node11);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "#" + "'", str14, "#");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "hi!" + "'", str20, "hi!");
    }

    @Test
    public void test16167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16167");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("", "hi!");
        java.lang.String str3 = textNode2.text;
        java.lang.String str4 = textNode2.outerHtml();
        java.lang.String str5 = textNode2.getTEXT_KEY();
        java.lang.String str6 = textNode2.text;
        java.lang.String str7 = textNode2.gettext();
        java.lang.String str9 = textNode2.attr("");
        textNode2.ensureAttributes();
        textNode2.setBaseUri("#text");
        java.lang.StringBuilder stringBuilder13 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings15 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Document.OutputSettings outputSettings17 = outputSettings15.indentAmount((int) 'a');
        org.jsoup.nodes.Document.OutputSettings outputSettings18 = outputSettings15.clone();
        boolean boolean19 = outputSettings15.getforceAllElementAsBlock();
        outputSettings15.prettyPrint = true;
        java.nio.charset.CharsetEncoder charsetEncoder22 = outputSettings15.getcharsetEncoder();
        org.jsoup.nodes.Document.OutputSettings outputSettings23 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Document.OutputSettings outputSettings25 = outputSettings23.indentAmount((int) 'a');
        java.nio.charset.Charset charset26 = outputSettings23.getcharset();
        org.jsoup.nodes.Document.OutputSettings outputSettings27 = outputSettings15.charset(charset26);
        textNode2.outerHtmlTail(stringBuilder13, (int) (short) 0, outputSettings27);
        boolean boolean29 = outputSettings27.prettyPrint;
        org.jsoup.nodes.Document.OutputSettings outputSettings30 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Document.OutputSettings outputSettings32 = outputSettings30.indentAmount((int) 'a');
        outputSettings32.setprettyPrint(false);
        org.jsoup.nodes.Document.OutputSettings outputSettings35 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Document.OutputSettings outputSettings37 = outputSettings35.indentAmount((int) 'a');
        outputSettings37.prettyPrint = false;
        java.nio.charset.Charset charset40 = outputSettings37.getcharset();
        outputSettings32.charset = charset40;
        org.jsoup.nodes.Document.OutputSettings outputSettings43 = outputSettings32.prettyPrint(false);
        org.jsoup.nodes.Entities.EscapeMode escapeMode44 = outputSettings32.escapeMode;
        org.jsoup.nodes.Document.OutputSettings outputSettings45 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Document.OutputSettings outputSettings47 = outputSettings45.indentAmount((int) 'a');
        org.jsoup.nodes.Document.OutputSettings outputSettings48 = outputSettings45.clone();
        org.jsoup.nodes.Document.OutputSettings outputSettings49 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Document.OutputSettings outputSettings51 = outputSettings49.indentAmount((int) 'a');
        org.jsoup.nodes.Document.OutputSettings outputSettings52 = outputSettings49.clone();
        outputSettings52.setforceAllElementAsBlock(true);
        java.nio.charset.CharsetEncoder charsetEncoder55 = outputSettings52.charsetEncoder;
        outputSettings45.setcharsetEncoder(charsetEncoder55);
        outputSettings32.setcharsetEncoder(charsetEncoder55);
        outputSettings27.charsetEncoder = charsetEncoder55;
        org.jsoup.nodes.Document.OutputSettings outputSettings59 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Document.OutputSettings outputSettings61 = outputSettings59.indentAmount((int) 'a');
        org.jsoup.nodes.Entities.EscapeMode escapeMode62 = outputSettings61.escapeMode;
        java.nio.charset.Charset charset63 = outputSettings61.charset();
        outputSettings61.setindentAmount(0);
        org.jsoup.nodes.Entities.EscapeMode escapeMode66 = outputSettings61.escapeMode;
        org.jsoup.nodes.Document.OutputSettings outputSettings68 = outputSettings61.indentAmount((int) (byte) 10);
        boolean boolean69 = outputSettings61.forceAllElementAsBlock;
        org.jsoup.nodes.Document.OutputSettings outputSettings70 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Document.OutputSettings outputSettings72 = outputSettings70.indentAmount((int) 'a');
        org.jsoup.nodes.Entities.EscapeMode escapeMode73 = outputSettings72.escapeMode;
        java.nio.charset.Charset charset74 = outputSettings72.charset();
        org.jsoup.nodes.Entities.EscapeMode escapeMode75 = outputSettings72.escapeMode;
        boolean boolean76 = outputSettings72.prettyPrint;
        org.jsoup.nodes.Document.OutputSettings outputSettings77 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Document.OutputSettings outputSettings79 = outputSettings77.indentAmount((int) 'a');
        org.jsoup.nodes.Entities.EscapeMode escapeMode80 = outputSettings79.escapeMode;
        java.nio.charset.Charset charset81 = outputSettings79.charset();
        outputSettings79.setindentAmount(0);
        org.jsoup.nodes.Entities.EscapeMode escapeMode84 = outputSettings79.escapeMode;
        org.jsoup.nodes.Document.OutputSettings outputSettings85 = outputSettings72.escapeMode(escapeMode84);
        outputSettings61.setescapeMode(escapeMode84);
        org.jsoup.nodes.Document.OutputSettings outputSettings87 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Document.OutputSettings outputSettings89 = outputSettings87.indentAmount((int) 'a');
        org.jsoup.nodes.Document.OutputSettings outputSettings90 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Document.OutputSettings outputSettings92 = outputSettings90.indentAmount((int) 'a');
        java.nio.charset.Charset charset93 = outputSettings90.getcharset();
        outputSettings89.setcharset(charset93);
        outputSettings61.setcharset(charset93);
        outputSettings27.setcharset(charset93);
        java.nio.charset.CharsetEncoder charsetEncoder97 = outputSettings27.encoder();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "text" + "'", str5, "text");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNotNull(outputSettings17);
        org.junit.Assert.assertNotNull(outputSettings18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(charsetEncoder22);
        org.junit.Assert.assertNotNull(outputSettings25);
        org.junit.Assert.assertNotNull(charset26);
        org.junit.Assert.assertNotNull(outputSettings27);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertNotNull(outputSettings32);
        org.junit.Assert.assertNotNull(outputSettings37);
        org.junit.Assert.assertNotNull(charset40);
        org.junit.Assert.assertNotNull(outputSettings43);
        org.junit.Assert.assertTrue("'" + escapeMode44 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode44.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertNotNull(outputSettings47);
        org.junit.Assert.assertNotNull(outputSettings48);
        org.junit.Assert.assertNotNull(outputSettings51);
        org.junit.Assert.assertNotNull(outputSettings52);
        org.junit.Assert.assertNotNull(charsetEncoder55);
        org.junit.Assert.assertNotNull(outputSettings61);
        org.junit.Assert.assertTrue("'" + escapeMode62 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode62.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertNotNull(charset63);
        org.junit.Assert.assertTrue("'" + escapeMode66 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode66.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertNotNull(outputSettings68);
        org.junit.Assert.assertTrue("'" + boolean69 + "' != '" + false + "'", boolean69 == false);
        org.junit.Assert.assertNotNull(outputSettings72);
        org.junit.Assert.assertTrue("'" + escapeMode73 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode73.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertNotNull(charset74);
        org.junit.Assert.assertTrue("'" + escapeMode75 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode75.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertTrue("'" + boolean76 + "' != '" + true + "'", boolean76 == true);
        org.junit.Assert.assertNotNull(outputSettings79);
        org.junit.Assert.assertTrue("'" + escapeMode80 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode80.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertNotNull(charset81);
        org.junit.Assert.assertTrue("'" + escapeMode84 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode84.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertNotNull(outputSettings85);
        org.junit.Assert.assertNotNull(outputSettings89);
        org.junit.Assert.assertNotNull(outputSettings92);
        org.junit.Assert.assertNotNull(charset93);
        org.junit.Assert.assertNotNull(charsetEncoder97);
    }
}

