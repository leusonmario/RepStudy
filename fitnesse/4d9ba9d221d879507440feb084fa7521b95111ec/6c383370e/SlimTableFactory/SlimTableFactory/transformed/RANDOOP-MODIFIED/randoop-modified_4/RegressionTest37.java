import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest37 {

    public static boolean debug = false;

    @Test
    public void test18501() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18501");
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory0 = new fitnesse.testsystems.slim.tables.SlimTableFactory();
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory1 = slimTableFactory0.copy();
        java.util.Map<java.lang.String, java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable>> strMap2 = slimTableFactory1.tableTypes;
        boolean boolean4 = slimTableFactory1.hasColon("");
        boolean boolean6 = slimTableFactory1.hasColon("hi!");
        java.util.Map<java.lang.String, java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable>> strMap7 = slimTableFactory1.tableTypes;
        java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable> wildcardClass9 = slimTableFactory1.getTableType("");
        java.util.Map<java.lang.String, java.lang.String> strMap10 = slimTableFactory1.tableTypeArrays;
        java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable> wildcardClass12 = slimTableFactory1.getTableType("hi!");
        java.util.Map<java.lang.String, java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable>> strMap13 = slimTableFactory1.tableTypes;
        java.lang.String str15 = slimTableFactory1.getFullTableName("");
        boolean boolean17 = slimTableFactory1.hasColon("hi!");
        java.util.Map<java.lang.String, java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable>> strMap18 = slimTableFactory1.tableTypes;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory19 = new fitnesse.testsystems.slim.tables.SlimTableFactory();
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory20 = slimTableFactory19.copy();
        boolean boolean22 = slimTableFactory20.hasColon("hi!");
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory23 = slimTableFactory20.copy();
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory24 = slimTableFactory20.copy();
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory25 = slimTableFactory24.copy();
        java.util.Map<java.lang.String, java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable>> strMap26 = slimTableFactory24.tableTypes;
        boolean boolean28 = slimTableFactory24.hasColon("");
        java.util.Map<java.lang.String, java.lang.String> strMap29 = slimTableFactory24.tableTypeArrays;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory30 = slimTableFactory24.copy();
        java.util.Map<java.lang.String, java.lang.String> strMap31 = slimTableFactory24.tableTypeArrays;
        slimTableFactory1.tableTypeArrays = strMap31;
        java.util.Map<java.lang.String, java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable>> strMap33 = slimTableFactory1.tableTypes;
        fitnesse.testsystems.slim.Table table34 = null;
        fitnesse.testsystems.slim.SlimTestContext slimTestContext36 = null;
        // The following exception was thrown during execution in test generation
        try {
            fitnesse.testsystems.slim.tables.SlimTable slimTable37 = slimTableFactory1.makeSlimTable(table34, "", slimTestContext36);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(slimTableFactory1);
        org.junit.Assert.assertNotNull(strMap2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(strMap7);
        org.junit.Assert.assertNull(wildcardClass9);
        org.junit.Assert.assertNotNull(strMap10);
        org.junit.Assert.assertNull(wildcardClass12);
        org.junit.Assert.assertNotNull(strMap13);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(strMap18);
        org.junit.Assert.assertNotNull(slimTableFactory20);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(slimTableFactory23);
        org.junit.Assert.assertNotNull(slimTableFactory24);
        org.junit.Assert.assertNotNull(slimTableFactory25);
        org.junit.Assert.assertNotNull(strMap26);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertNotNull(strMap29);
        org.junit.Assert.assertNotNull(slimTableFactory30);
        org.junit.Assert.assertNotNull(strMap31);
        org.junit.Assert.assertNotNull(strMap33);
    }

    @Test
    public void test18502() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18502");
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory0 = new fitnesse.testsystems.slim.tables.SlimTableFactory();
        java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable> wildcardClass2 = slimTableFactory0.getTableType("");
        java.util.Map<java.lang.String, java.lang.String> strMap3 = slimTableFactory0.tableTypeArrays;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory4 = slimTableFactory0.copy();
        boolean boolean6 = slimTableFactory4.hasColon("");
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory7 = new fitnesse.testsystems.slim.tables.SlimTableFactory();
        java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable> wildcardClass9 = slimTableFactory7.getTableType("");
        java.util.Map<java.lang.String, java.lang.String> strMap10 = slimTableFactory7.tableTypeArrays;
        boolean boolean12 = slimTableFactory7.hasColon("");
        java.lang.String str14 = slimTableFactory7.makeTableType("");
        java.util.Map<java.lang.String, java.lang.String> strMap15 = slimTableFactory7.tableTypeArrays;
        slimTableFactory4.tableTypeArrays = strMap15;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory17 = new fitnesse.testsystems.slim.tables.SlimTableFactory();
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory18 = slimTableFactory17.copy();
        boolean boolean20 = slimTableFactory18.hasColon("hi!");
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory21 = slimTableFactory18.copy();
        java.util.Map<java.lang.String, java.lang.String> strMap22 = slimTableFactory18.tableTypeArrays;
        java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable> wildcardClass24 = slimTableFactory18.getTableType("");
        java.util.Map<java.lang.String, java.lang.String> strMap25 = slimTableFactory18.tableTypeArrays;
        slimTableFactory4.tableTypeArrays = strMap25;
        java.util.Map<java.lang.String, java.lang.String> strMap27 = slimTableFactory4.tableTypeArrays;
        java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable> wildcardClass29 = slimTableFactory4.getTableType("hi!");
        boolean boolean31 = slimTableFactory4.hasColon("");
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory32 = new fitnesse.testsystems.slim.tables.SlimTableFactory();
        java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable> wildcardClass34 = slimTableFactory32.getTableType("");
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory35 = slimTableFactory32.copy();
        boolean boolean37 = slimTableFactory32.hasColon("hi!");
        java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable> wildcardClass39 = slimTableFactory32.getTableType("hi!");
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory40 = new fitnesse.testsystems.slim.tables.SlimTableFactory();
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory41 = slimTableFactory40.copy();
        java.util.Map<java.lang.String, java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable>> strMap42 = slimTableFactory41.tableTypes;
        boolean boolean44 = slimTableFactory41.hasColon("");
        java.util.Map<java.lang.String, java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable>> strMap45 = slimTableFactory41.tableTypes;
        java.util.Map<java.lang.String, java.lang.String> strMap46 = slimTableFactory41.tableTypeArrays;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory47 = new fitnesse.testsystems.slim.tables.SlimTableFactory();
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory48 = slimTableFactory47.copy();
        java.util.Map<java.lang.String, java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable>> strMap49 = slimTableFactory48.tableTypes;
        boolean boolean51 = slimTableFactory48.hasColon("");
        boolean boolean53 = slimTableFactory48.hasColon("hi!");
        java.util.Map<java.lang.String, java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable>> strMap54 = slimTableFactory48.tableTypes;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory55 = new fitnesse.testsystems.slim.tables.SlimTableFactory();
        java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable> wildcardClass57 = slimTableFactory55.getTableType("");
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory58 = slimTableFactory55.copy();
        java.util.Map<java.lang.String, java.lang.String> strMap59 = slimTableFactory58.tableTypeArrays;
        slimTableFactory48.tableTypeArrays = strMap59;
        slimTableFactory41.tableTypeArrays = strMap59;
        slimTableFactory32.tableTypeArrays = strMap59;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory63 = new fitnesse.testsystems.slim.tables.SlimTableFactory();
        java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable> wildcardClass65 = slimTableFactory63.getTableType("");
        java.util.Map<java.lang.String, java.lang.String> strMap66 = slimTableFactory63.tableTypeArrays;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory67 = slimTableFactory63.copy();
        boolean boolean69 = slimTableFactory67.hasColon("");
        java.lang.String str71 = slimTableFactory67.makeTableType("");
        java.util.Map<java.lang.String, java.lang.String> strMap72 = slimTableFactory67.tableTypeArrays;
        slimTableFactory32.tableTypeArrays = strMap72;
        slimTableFactory4.tableTypeArrays = strMap72;
        java.lang.Class<?> wildcardClass75 = slimTableFactory4.getClass();
        org.junit.Assert.assertNull(wildcardClass2);
        org.junit.Assert.assertNotNull(strMap3);
        org.junit.Assert.assertNotNull(slimTableFactory4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(wildcardClass9);
        org.junit.Assert.assertNotNull(strMap10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertNotNull(strMap15);
        org.junit.Assert.assertNotNull(slimTableFactory18);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(slimTableFactory21);
        org.junit.Assert.assertNotNull(strMap22);
        org.junit.Assert.assertNull(wildcardClass24);
        org.junit.Assert.assertNotNull(strMap25);
        org.junit.Assert.assertNotNull(strMap27);
        org.junit.Assert.assertNull(wildcardClass29);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertNull(wildcardClass34);
        org.junit.Assert.assertNotNull(slimTableFactory35);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertNull(wildcardClass39);
        org.junit.Assert.assertNotNull(slimTableFactory41);
        org.junit.Assert.assertNotNull(strMap42);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertNotNull(strMap45);
        org.junit.Assert.assertNotNull(strMap46);
        org.junit.Assert.assertNotNull(slimTableFactory48);
        org.junit.Assert.assertNotNull(strMap49);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + false + "'", boolean53 == false);
        org.junit.Assert.assertNotNull(strMap54);
        org.junit.Assert.assertNull(wildcardClass57);
        org.junit.Assert.assertNotNull(slimTableFactory58);
        org.junit.Assert.assertNotNull(strMap59);
        org.junit.Assert.assertNull(wildcardClass65);
        org.junit.Assert.assertNotNull(strMap66);
        org.junit.Assert.assertNotNull(slimTableFactory67);
        org.junit.Assert.assertTrue("'" + boolean69 + "' != '" + false + "'", boolean69 == false);
        org.junit.Assert.assertEquals("'" + str71 + "' != '" + "" + "'", str71, "");
        org.junit.Assert.assertNotNull(strMap72);
        org.junit.Assert.assertNotNull(wildcardClass75);
    }

    @Test
    public void test18503() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18503");
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory0 = new fitnesse.testsystems.slim.tables.SlimTableFactory();
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory1 = slimTableFactory0.copy();
        java.util.Map<java.lang.String, java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable>> strMap2 = slimTableFactory1.tableTypes;
        boolean boolean4 = slimTableFactory1.hasColon("");
        java.util.Map<java.lang.String, java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable>> strMap5 = slimTableFactory1.tableTypes;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory6 = slimTableFactory1.copy();
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory7 = slimTableFactory6.copy();
        java.lang.String str9 = slimTableFactory6.makeTableType("hi!");
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory10 = slimTableFactory6.copy();
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory11 = new fitnesse.testsystems.slim.tables.SlimTableFactory();
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory12 = slimTableFactory11.copy();
        boolean boolean14 = slimTableFactory12.hasColon("hi!");
        java.util.Map<java.lang.String, java.lang.String> strMap15 = slimTableFactory12.tableTypeArrays;
        java.lang.String str17 = slimTableFactory12.getFullTableName("");
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory18 = new fitnesse.testsystems.slim.tables.SlimTableFactory();
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory19 = slimTableFactory18.copy();
        boolean boolean21 = slimTableFactory19.hasColon("hi!");
        java.util.Map<java.lang.String, java.lang.String> strMap22 = slimTableFactory19.tableTypeArrays;
        java.lang.String str24 = slimTableFactory19.getFullTableName("");
        java.util.Map<java.lang.String, java.lang.String> strMap25 = slimTableFactory19.tableTypeArrays;
        slimTableFactory12.tableTypeArrays = strMap25;
        java.util.Map<java.lang.String, java.lang.String> strMap27 = slimTableFactory12.tableTypeArrays;
        java.util.Map<java.lang.String, java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable>> strMap28 = slimTableFactory12.tableTypes;
        java.lang.String str30 = slimTableFactory12.getFullTableName("hi!");
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory31 = slimTableFactory12.copy();
        java.util.Map<java.lang.String, java.lang.String> strMap32 = slimTableFactory12.tableTypeArrays;
        slimTableFactory6.tableTypeArrays = strMap32;
        java.lang.String str35 = slimTableFactory6.getFullTableName("");
        java.util.Map<java.lang.String, java.lang.String> strMap36 = slimTableFactory6.tableTypeArrays;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory37 = new fitnesse.testsystems.slim.tables.SlimTableFactory();
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory38 = slimTableFactory37.copy();
        java.util.Map<java.lang.String, java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable>> strMap39 = slimTableFactory38.tableTypes;
        java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable> wildcardClass41 = slimTableFactory38.getTableType("hi!");
        boolean boolean43 = slimTableFactory38.hasColon("");
        java.lang.String str45 = slimTableFactory38.makeTableType("hi!");
        boolean boolean47 = slimTableFactory38.hasColon("hi!");
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory48 = slimTableFactory38.copy();
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory49 = slimTableFactory48.copy();
        java.util.Map<java.lang.String, java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable>> strMap50 = slimTableFactory48.tableTypes;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory51 = new fitnesse.testsystems.slim.tables.SlimTableFactory();
        java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable> wildcardClass53 = slimTableFactory51.getTableType("");
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory54 = slimTableFactory51.copy();
        boolean boolean56 = slimTableFactory51.hasColon("hi!");
        java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable> wildcardClass58 = slimTableFactory51.getTableType("hi!");
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory59 = new fitnesse.testsystems.slim.tables.SlimTableFactory();
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory60 = slimTableFactory59.copy();
        java.util.Map<java.lang.String, java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable>> strMap61 = slimTableFactory60.tableTypes;
        boolean boolean63 = slimTableFactory60.hasColon("");
        java.util.Map<java.lang.String, java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable>> strMap64 = slimTableFactory60.tableTypes;
        java.util.Map<java.lang.String, java.lang.String> strMap65 = slimTableFactory60.tableTypeArrays;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory66 = new fitnesse.testsystems.slim.tables.SlimTableFactory();
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory67 = slimTableFactory66.copy();
        java.util.Map<java.lang.String, java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable>> strMap68 = slimTableFactory67.tableTypes;
        boolean boolean70 = slimTableFactory67.hasColon("");
        boolean boolean72 = slimTableFactory67.hasColon("hi!");
        java.util.Map<java.lang.String, java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable>> strMap73 = slimTableFactory67.tableTypes;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory74 = new fitnesse.testsystems.slim.tables.SlimTableFactory();
        java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable> wildcardClass76 = slimTableFactory74.getTableType("");
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory77 = slimTableFactory74.copy();
        java.util.Map<java.lang.String, java.lang.String> strMap78 = slimTableFactory77.tableTypeArrays;
        slimTableFactory67.tableTypeArrays = strMap78;
        slimTableFactory60.tableTypeArrays = strMap78;
        slimTableFactory51.tableTypeArrays = strMap78;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory82 = slimTableFactory51.copy();
        java.util.Map<java.lang.String, java.lang.String> strMap83 = slimTableFactory82.tableTypeArrays;
        java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable> wildcardClass85 = slimTableFactory82.getTableType("");
        java.lang.String str87 = slimTableFactory82.getFullTableName("hi!");
        java.util.Map<java.lang.String, java.lang.String> strMap88 = slimTableFactory82.tableTypeArrays;
        slimTableFactory48.tableTypeArrays = strMap88;
        slimTableFactory6.tableTypeArrays = strMap88;
        org.junit.Assert.assertNotNull(slimTableFactory1);
        org.junit.Assert.assertNotNull(strMap2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(strMap5);
        org.junit.Assert.assertNotNull(slimTableFactory6);
        org.junit.Assert.assertNotNull(slimTableFactory7);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertNotNull(slimTableFactory10);
        org.junit.Assert.assertNotNull(slimTableFactory12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(strMap15);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertNotNull(slimTableFactory19);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(strMap22);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "" + "'", str24, "");
        org.junit.Assert.assertNotNull(strMap25);
        org.junit.Assert.assertNotNull(strMap27);
        org.junit.Assert.assertNotNull(strMap28);
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "hi!" + "'", str30, "hi!");
        org.junit.Assert.assertNotNull(slimTableFactory31);
        org.junit.Assert.assertNotNull(strMap32);
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "" + "'", str35, "");
        org.junit.Assert.assertNotNull(strMap36);
        org.junit.Assert.assertNotNull(slimTableFactory38);
        org.junit.Assert.assertNotNull(strMap39);
        org.junit.Assert.assertNull(wildcardClass41);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertEquals("'" + str45 + "' != '" + "hi!" + "'", str45, "hi!");
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertNotNull(slimTableFactory48);
        org.junit.Assert.assertNotNull(slimTableFactory49);
        org.junit.Assert.assertNotNull(strMap50);
        org.junit.Assert.assertNull(wildcardClass53);
        org.junit.Assert.assertNotNull(slimTableFactory54);
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + false + "'", boolean56 == false);
        org.junit.Assert.assertNull(wildcardClass58);
        org.junit.Assert.assertNotNull(slimTableFactory60);
        org.junit.Assert.assertNotNull(strMap61);
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + false + "'", boolean63 == false);
        org.junit.Assert.assertNotNull(strMap64);
        org.junit.Assert.assertNotNull(strMap65);
        org.junit.Assert.assertNotNull(slimTableFactory67);
        org.junit.Assert.assertNotNull(strMap68);
        org.junit.Assert.assertTrue("'" + boolean70 + "' != '" + false + "'", boolean70 == false);
        org.junit.Assert.assertTrue("'" + boolean72 + "' != '" + false + "'", boolean72 == false);
        org.junit.Assert.assertNotNull(strMap73);
        org.junit.Assert.assertNull(wildcardClass76);
        org.junit.Assert.assertNotNull(slimTableFactory77);
        org.junit.Assert.assertNotNull(strMap78);
        org.junit.Assert.assertNotNull(slimTableFactory82);
        org.junit.Assert.assertNotNull(strMap83);
        org.junit.Assert.assertNull(wildcardClass85);
        org.junit.Assert.assertEquals("'" + str87 + "' != '" + "hi!" + "'", str87, "hi!");
        org.junit.Assert.assertNotNull(strMap88);
    }

    @Test
    public void test18504() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18504");
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory0 = new fitnesse.testsystems.slim.tables.SlimTableFactory();
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory1 = slimTableFactory0.copy();
        boolean boolean3 = slimTableFactory1.hasColon("hi!");
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory4 = slimTableFactory1.copy();
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory5 = slimTableFactory1.copy();
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory6 = new fitnesse.testsystems.slim.tables.SlimTableFactory();
        java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable> wildcardClass8 = slimTableFactory6.getTableType("");
        boolean boolean10 = slimTableFactory6.hasColon("");
        java.util.Map<java.lang.String, java.lang.String> strMap11 = slimTableFactory6.tableTypeArrays;
        slimTableFactory5.tableTypeArrays = strMap11;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory13 = slimTableFactory5.copy();
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory14 = slimTableFactory13.copy();
        java.lang.String str16 = slimTableFactory13.makeTableType("");
        java.util.Map<java.lang.String, java.lang.String> strMap17 = slimTableFactory13.tableTypeArrays;
        java.util.Map<java.lang.String, java.lang.String> strMap18 = slimTableFactory13.tableTypeArrays;
        fitnesse.testsystems.slim.Table table19 = null;
        // The following exception was thrown during execution in test generation
        try {
            slimTableFactory13.parseDefineTableTypeRow(table19, 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(slimTableFactory1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(slimTableFactory4);
        org.junit.Assert.assertNotNull(slimTableFactory5);
        org.junit.Assert.assertNull(wildcardClass8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(strMap11);
        org.junit.Assert.assertNotNull(slimTableFactory13);
        org.junit.Assert.assertNotNull(slimTableFactory14);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertNotNull(strMap17);
        org.junit.Assert.assertNotNull(strMap18);
    }

    @Test
    public void test18505() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18505");
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory0 = new fitnesse.testsystems.slim.tables.SlimTableFactory();
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory1 = slimTableFactory0.copy();
        java.util.Map<java.lang.String, java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable>> strMap2 = slimTableFactory1.tableTypes;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory3 = new fitnesse.testsystems.slim.tables.SlimTableFactory();
        java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable> wildcardClass5 = slimTableFactory3.getTableType("");
        boolean boolean7 = slimTableFactory3.hasColon("");
        java.util.Map<java.lang.String, java.lang.String> strMap8 = slimTableFactory3.tableTypeArrays;
        slimTableFactory1.tableTypeArrays = strMap8;
        java.lang.String str11 = slimTableFactory1.makeTableType("");
        java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable> wildcardClass13 = slimTableFactory1.getTableType("");
        java.util.Map<java.lang.String, java.lang.String> strMap14 = slimTableFactory1.tableTypeArrays;
        java.util.Map<java.lang.String, java.lang.String> strMap15 = slimTableFactory1.tableTypeArrays;
        java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable> wildcardClass17 = slimTableFactory1.getTableType("hi!");
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory18 = slimTableFactory1.copy();
        fitnesse.testsystems.slim.Table table19 = null;
        // The following exception was thrown during execution in test generation
        try {
            slimTableFactory1.parseDefineTableTypeRow(table19, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(slimTableFactory1);
        org.junit.Assert.assertNotNull(strMap2);
        org.junit.Assert.assertNull(wildcardClass5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(strMap8);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNull(wildcardClass13);
        org.junit.Assert.assertNotNull(strMap14);
        org.junit.Assert.assertNotNull(strMap15);
        org.junit.Assert.assertNull(wildcardClass17);
        org.junit.Assert.assertNotNull(slimTableFactory18);
    }

    @Test
    public void test18506() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18506");
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory0 = new fitnesse.testsystems.slim.tables.SlimTableFactory();
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory1 = slimTableFactory0.copy();
        boolean boolean3 = slimTableFactory1.hasColon("hi!");
        java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable> wildcardClass5 = slimTableFactory1.getTableType("hi!");
        boolean boolean7 = slimTableFactory1.hasColon("");
        boolean boolean9 = slimTableFactory1.hasColon("hi!");
        java.util.Map<java.lang.String, java.lang.String> strMap10 = slimTableFactory1.tableTypeArrays;
        java.util.Map<java.lang.String, java.lang.String> strMap11 = slimTableFactory1.tableTypeArrays;
        java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable> wildcardClass13 = slimTableFactory1.getTableType("");
        java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable> wildcardClass15 = slimTableFactory1.getTableType("hi!");
        java.lang.String str17 = slimTableFactory1.makeTableType("hi!");
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory18 = slimTableFactory1.copy();
        java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable> wildcardClass20 = slimTableFactory18.getTableType("");
        org.junit.Assert.assertNotNull(slimTableFactory1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(wildcardClass5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(strMap10);
        org.junit.Assert.assertNotNull(strMap11);
        org.junit.Assert.assertNull(wildcardClass13);
        org.junit.Assert.assertNull(wildcardClass15);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
        org.junit.Assert.assertNotNull(slimTableFactory18);
        org.junit.Assert.assertNull(wildcardClass20);
    }

    @Test
    public void test18507() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18507");
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory0 = new fitnesse.testsystems.slim.tables.SlimTableFactory();
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory1 = slimTableFactory0.copy();
        java.util.Map<java.lang.String, java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable>> strMap2 = slimTableFactory1.tableTypes;
        boolean boolean4 = slimTableFactory1.hasColon("");
        boolean boolean6 = slimTableFactory1.hasColon("hi!");
        java.util.Map<java.lang.String, java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable>> strMap7 = slimTableFactory1.tableTypes;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory8 = new fitnesse.testsystems.slim.tables.SlimTableFactory();
        java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable> wildcardClass10 = slimTableFactory8.getTableType("");
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory11 = slimTableFactory8.copy();
        java.util.Map<java.lang.String, java.lang.String> strMap12 = slimTableFactory11.tableTypeArrays;
        slimTableFactory1.tableTypeArrays = strMap12;
        java.lang.String str15 = slimTableFactory1.makeTableType("");
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory16 = new fitnesse.testsystems.slim.tables.SlimTableFactory();
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory17 = slimTableFactory16.copy();
        java.util.Map<java.lang.String, java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable>> strMap18 = slimTableFactory17.tableTypes;
        boolean boolean20 = slimTableFactory17.hasColon("");
        java.lang.String str22 = slimTableFactory17.makeTableType("");
        java.util.Map<java.lang.String, java.lang.String> strMap23 = slimTableFactory17.tableTypeArrays;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory24 = new fitnesse.testsystems.slim.tables.SlimTableFactory();
        java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable> wildcardClass26 = slimTableFactory24.getTableType("");
        java.util.Map<java.lang.String, java.lang.String> strMap27 = slimTableFactory24.tableTypeArrays;
        boolean boolean29 = slimTableFactory24.hasColon("");
        java.lang.String str31 = slimTableFactory24.makeTableType("");
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory32 = slimTableFactory24.copy();
        java.util.Map<java.lang.String, java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable>> strMap33 = slimTableFactory24.tableTypes;
        boolean boolean35 = slimTableFactory24.hasColon("");
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory36 = slimTableFactory24.copy();
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory37 = new fitnesse.testsystems.slim.tables.SlimTableFactory();
        java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable> wildcardClass39 = slimTableFactory37.getTableType("");
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory40 = slimTableFactory37.copy();
        boolean boolean42 = slimTableFactory37.hasColon("hi!");
        java.lang.String str44 = slimTableFactory37.getFullTableName("");
        java.util.Map<java.lang.String, java.lang.String> strMap45 = slimTableFactory37.tableTypeArrays;
        slimTableFactory24.tableTypeArrays = strMap45;
        slimTableFactory17.tableTypeArrays = strMap45;
        slimTableFactory1.tableTypeArrays = strMap45;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory49 = slimTableFactory1.copy();
        fitnesse.testsystems.slim.Table table50 = null;
        // The following exception was thrown during execution in test generation
        try {
            slimTableFactory1.parseDefineTableTypeRow(table50, (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(slimTableFactory1);
        org.junit.Assert.assertNotNull(strMap2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(strMap7);
        org.junit.Assert.assertNull(wildcardClass10);
        org.junit.Assert.assertNotNull(slimTableFactory11);
        org.junit.Assert.assertNotNull(strMap12);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertNotNull(slimTableFactory17);
        org.junit.Assert.assertNotNull(strMap18);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertNotNull(strMap23);
        org.junit.Assert.assertNull(wildcardClass26);
        org.junit.Assert.assertNotNull(strMap27);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "" + "'", str31, "");
        org.junit.Assert.assertNotNull(slimTableFactory32);
        org.junit.Assert.assertNotNull(strMap33);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertNotNull(slimTableFactory36);
        org.junit.Assert.assertNull(wildcardClass39);
        org.junit.Assert.assertNotNull(slimTableFactory40);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertEquals("'" + str44 + "' != '" + "" + "'", str44, "");
        org.junit.Assert.assertNotNull(strMap45);
        org.junit.Assert.assertNotNull(slimTableFactory49);
    }

    @Test
    public void test18508() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18508");
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory0 = new fitnesse.testsystems.slim.tables.SlimTableFactory();
        java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable> wildcardClass2 = slimTableFactory0.getTableType("");
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory3 = slimTableFactory0.copy();
        boolean boolean5 = slimTableFactory0.hasColon("hi!");
        java.lang.String str7 = slimTableFactory0.getFullTableName("");
        java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable> wildcardClass9 = slimTableFactory0.getTableType("hi!");
        java.lang.String str11 = slimTableFactory0.getFullTableName("");
        java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable> wildcardClass13 = slimTableFactory0.getTableType("hi!");
        boolean boolean15 = slimTableFactory0.hasColon("");
        java.lang.String str17 = slimTableFactory0.getFullTableName("");
        org.junit.Assert.assertNull(wildcardClass2);
        org.junit.Assert.assertNotNull(slimTableFactory3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNull(wildcardClass9);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNull(wildcardClass13);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
    }

    @Test
    public void test18509() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18509");
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory0 = new fitnesse.testsystems.slim.tables.SlimTableFactory();
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory1 = slimTableFactory0.copy();
        java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable> wildcardClass3 = slimTableFactory0.getTableType("hi!");
        java.util.Map<java.lang.String, java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable>> strMap4 = slimTableFactory0.tableTypes;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory5 = new fitnesse.testsystems.slim.tables.SlimTableFactory();
        java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable> wildcardClass7 = slimTableFactory5.getTableType("");
        boolean boolean9 = slimTableFactory5.hasColon("");
        java.util.Map<java.lang.String, java.lang.String> strMap10 = slimTableFactory5.tableTypeArrays;
        boolean boolean12 = slimTableFactory5.hasColon("");
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory13 = new fitnesse.testsystems.slim.tables.SlimTableFactory();
        java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable> wildcardClass15 = slimTableFactory13.getTableType("");
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory16 = slimTableFactory13.copy();
        boolean boolean18 = slimTableFactory13.hasColon("hi!");
        java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable> wildcardClass20 = slimTableFactory13.getTableType("hi!");
        java.util.Map<java.lang.String, java.lang.String> strMap21 = slimTableFactory13.tableTypeArrays;
        java.util.Map<java.lang.String, java.lang.String> strMap22 = slimTableFactory13.tableTypeArrays;
        slimTableFactory5.tableTypeArrays = strMap22;
        slimTableFactory0.tableTypeArrays = strMap22;
        boolean boolean26 = slimTableFactory0.hasColon("hi!");
        fitnesse.testsystems.slim.Table table27 = null;
        // The following exception was thrown during execution in test generation
        try {
            slimTableFactory0.parseDefineTableTypeRow(table27, (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(slimTableFactory1);
        org.junit.Assert.assertNull(wildcardClass3);
        org.junit.Assert.assertNotNull(strMap4);
        org.junit.Assert.assertNull(wildcardClass7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(strMap10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNull(wildcardClass15);
        org.junit.Assert.assertNotNull(slimTableFactory16);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNull(wildcardClass20);
        org.junit.Assert.assertNotNull(strMap21);
        org.junit.Assert.assertNotNull(strMap22);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
    }

    @Test
    public void test18510() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18510");
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory0 = new fitnesse.testsystems.slim.tables.SlimTableFactory();
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory1 = slimTableFactory0.copy();
        boolean boolean3 = slimTableFactory1.hasColon("hi!");
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory4 = slimTableFactory1.copy();
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory5 = slimTableFactory1.copy();
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory6 = slimTableFactory5.copy();
        boolean boolean8 = slimTableFactory5.hasColon("");
        java.util.Map<java.lang.String, java.lang.String> strMap9 = slimTableFactory5.tableTypeArrays;
        java.util.Map<java.lang.String, java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable>> strMap10 = slimTableFactory5.tableTypes;
        boolean boolean12 = slimTableFactory5.hasColon("");
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory13 = slimTableFactory5.copy();
        boolean boolean15 = slimTableFactory13.hasColon("");
        java.util.Map<java.lang.String, java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable>> strMap16 = slimTableFactory13.tableTypes;
        org.junit.Assert.assertNotNull(slimTableFactory1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(slimTableFactory4);
        org.junit.Assert.assertNotNull(slimTableFactory5);
        org.junit.Assert.assertNotNull(slimTableFactory6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(strMap9);
        org.junit.Assert.assertNotNull(strMap10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(slimTableFactory13);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(strMap16);
    }

    @Test
    public void test18511() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18511");
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory0 = new fitnesse.testsystems.slim.tables.SlimTableFactory();
        java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable> wildcardClass2 = slimTableFactory0.getTableType("");
        boolean boolean4 = slimTableFactory0.hasColon("");
        java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable> wildcardClass6 = slimTableFactory0.getTableType("");
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory7 = new fitnesse.testsystems.slim.tables.SlimTableFactory();
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory8 = slimTableFactory7.copy();
        java.util.Map<java.lang.String, java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable>> strMap9 = slimTableFactory8.tableTypes;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory10 = new fitnesse.testsystems.slim.tables.SlimTableFactory();
        java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable> wildcardClass12 = slimTableFactory10.getTableType("");
        boolean boolean14 = slimTableFactory10.hasColon("");
        java.util.Map<java.lang.String, java.lang.String> strMap15 = slimTableFactory10.tableTypeArrays;
        slimTableFactory8.tableTypeArrays = strMap15;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory17 = new fitnesse.testsystems.slim.tables.SlimTableFactory();
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory18 = slimTableFactory17.copy();
        boolean boolean20 = slimTableFactory18.hasColon("hi!");
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory21 = slimTableFactory18.copy();
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory22 = slimTableFactory18.copy();
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory23 = slimTableFactory22.copy();
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory24 = new fitnesse.testsystems.slim.tables.SlimTableFactory();
        java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable> wildcardClass26 = slimTableFactory24.getTableType("");
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory27 = slimTableFactory24.copy();
        boolean boolean29 = slimTableFactory24.hasColon("hi!");
        java.util.Map<java.lang.String, java.lang.String> strMap30 = slimTableFactory24.tableTypeArrays;
        slimTableFactory22.tableTypeArrays = strMap30;
        java.util.Map<java.lang.String, java.lang.String> strMap32 = slimTableFactory22.tableTypeArrays;
        slimTableFactory8.tableTypeArrays = strMap32;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory34 = slimTableFactory8.copy();
        java.util.Map<java.lang.String, java.lang.String> strMap35 = slimTableFactory34.tableTypeArrays;
        slimTableFactory0.tableTypeArrays = strMap35;
        java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable> wildcardClass38 = slimTableFactory0.getTableType("");
        fitnesse.testsystems.slim.Table table39 = null;
        // The following exception was thrown during execution in test generation
        try {
            slimTableFactory0.parseDefineTableTypeRow(table39, (int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(wildcardClass2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(wildcardClass6);
        org.junit.Assert.assertNotNull(slimTableFactory8);
        org.junit.Assert.assertNotNull(strMap9);
        org.junit.Assert.assertNull(wildcardClass12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(strMap15);
        org.junit.Assert.assertNotNull(slimTableFactory18);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(slimTableFactory21);
        org.junit.Assert.assertNotNull(slimTableFactory22);
        org.junit.Assert.assertNotNull(slimTableFactory23);
        org.junit.Assert.assertNull(wildcardClass26);
        org.junit.Assert.assertNotNull(slimTableFactory27);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertNotNull(strMap30);
        org.junit.Assert.assertNotNull(strMap32);
        org.junit.Assert.assertNotNull(slimTableFactory34);
        org.junit.Assert.assertNotNull(strMap35);
        org.junit.Assert.assertNull(wildcardClass38);
    }

    @Test
    public void test18512() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18512");
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory0 = new fitnesse.testsystems.slim.tables.SlimTableFactory();
        java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable> wildcardClass2 = slimTableFactory0.getTableType("");
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory3 = slimTableFactory0.copy();
        boolean boolean5 = slimTableFactory0.hasColon("");
        java.util.Map<java.lang.String, java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable>> strMap6 = slimTableFactory0.tableTypes;
        java.lang.String str8 = slimTableFactory0.getFullTableName("hi!");
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory9 = new fitnesse.testsystems.slim.tables.SlimTableFactory();
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory10 = slimTableFactory9.copy();
        boolean boolean12 = slimTableFactory10.hasColon("hi!");
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory13 = slimTableFactory10.copy();
        java.util.Map<java.lang.String, java.lang.String> strMap14 = slimTableFactory10.tableTypeArrays;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory15 = new fitnesse.testsystems.slim.tables.SlimTableFactory();
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory16 = slimTableFactory15.copy();
        boolean boolean18 = slimTableFactory16.hasColon("hi!");
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory19 = slimTableFactory16.copy();
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory20 = slimTableFactory16.copy();
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory21 = slimTableFactory16.copy();
        java.util.Map<java.lang.String, java.lang.String> strMap22 = slimTableFactory21.tableTypeArrays;
        slimTableFactory10.tableTypeArrays = strMap22;
        slimTableFactory0.tableTypeArrays = strMap22;
        java.util.Map<java.lang.String, java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable>> strMap25 = slimTableFactory0.tableTypes;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory26 = new fitnesse.testsystems.slim.tables.SlimTableFactory();
        java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable> wildcardClass28 = slimTableFactory26.getTableType("");
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory29 = slimTableFactory26.copy();
        boolean boolean31 = slimTableFactory26.hasColon("hi!");
        java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable> wildcardClass33 = slimTableFactory26.getTableType("hi!");
        java.lang.String str35 = slimTableFactory26.getFullTableName("");
        java.lang.String str37 = slimTableFactory26.makeTableType("");
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory38 = new fitnesse.testsystems.slim.tables.SlimTableFactory();
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory39 = slimTableFactory38.copy();
        boolean boolean41 = slimTableFactory39.hasColon("hi!");
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory42 = slimTableFactory39.copy();
        java.util.Map<java.lang.String, java.lang.String> strMap43 = slimTableFactory39.tableTypeArrays;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory44 = new fitnesse.testsystems.slim.tables.SlimTableFactory();
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory45 = slimTableFactory44.copy();
        boolean boolean47 = slimTableFactory45.hasColon("hi!");
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory48 = slimTableFactory45.copy();
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory49 = slimTableFactory45.copy();
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory50 = slimTableFactory45.copy();
        java.util.Map<java.lang.String, java.lang.String> strMap51 = slimTableFactory50.tableTypeArrays;
        slimTableFactory39.tableTypeArrays = strMap51;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory53 = new fitnesse.testsystems.slim.tables.SlimTableFactory();
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory54 = new fitnesse.testsystems.slim.tables.SlimTableFactory();
        java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable> wildcardClass56 = slimTableFactory54.getTableType("");
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory57 = slimTableFactory54.copy();
        boolean boolean59 = slimTableFactory54.hasColon("");
        java.util.Map<java.lang.String, java.lang.String> strMap60 = slimTableFactory54.tableTypeArrays;
        slimTableFactory53.tableTypeArrays = strMap60;
        slimTableFactory39.tableTypeArrays = strMap60;
        slimTableFactory26.tableTypeArrays = strMap60;
        slimTableFactory0.tableTypeArrays = strMap60;
        java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable> wildcardClass66 = slimTableFactory0.getTableType("");
        java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable> wildcardClass68 = slimTableFactory0.getTableType("");
        java.lang.String str70 = slimTableFactory0.getFullTableName("");
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory71 = slimTableFactory0.copy();
        boolean boolean73 = slimTableFactory71.hasColon("hi!");
        java.util.Map<java.lang.String, java.lang.String> strMap74 = slimTableFactory71.tableTypeArrays;
        java.util.Map<java.lang.String, java.lang.String> strMap75 = slimTableFactory71.tableTypeArrays;
        org.junit.Assert.assertNull(wildcardClass2);
        org.junit.Assert.assertNotNull(slimTableFactory3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(strMap6);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertNotNull(slimTableFactory10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(slimTableFactory13);
        org.junit.Assert.assertNotNull(strMap14);
        org.junit.Assert.assertNotNull(slimTableFactory16);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(slimTableFactory19);
        org.junit.Assert.assertNotNull(slimTableFactory20);
        org.junit.Assert.assertNotNull(slimTableFactory21);
        org.junit.Assert.assertNotNull(strMap22);
        org.junit.Assert.assertNotNull(strMap25);
        org.junit.Assert.assertNull(wildcardClass28);
        org.junit.Assert.assertNotNull(slimTableFactory29);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertNull(wildcardClass33);
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "" + "'", str35, "");
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "" + "'", str37, "");
        org.junit.Assert.assertNotNull(slimTableFactory39);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertNotNull(slimTableFactory42);
        org.junit.Assert.assertNotNull(strMap43);
        org.junit.Assert.assertNotNull(slimTableFactory45);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertNotNull(slimTableFactory48);
        org.junit.Assert.assertNotNull(slimTableFactory49);
        org.junit.Assert.assertNotNull(slimTableFactory50);
        org.junit.Assert.assertNotNull(strMap51);
        org.junit.Assert.assertNull(wildcardClass56);
        org.junit.Assert.assertNotNull(slimTableFactory57);
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + false + "'", boolean59 == false);
        org.junit.Assert.assertNotNull(strMap60);
        org.junit.Assert.assertNull(wildcardClass66);
        org.junit.Assert.assertNull(wildcardClass68);
        org.junit.Assert.assertEquals("'" + str70 + "' != '" + "" + "'", str70, "");
        org.junit.Assert.assertNotNull(slimTableFactory71);
        org.junit.Assert.assertTrue("'" + boolean73 + "' != '" + false + "'", boolean73 == false);
        org.junit.Assert.assertNotNull(strMap74);
        org.junit.Assert.assertNotNull(strMap75);
    }

    @Test
    public void test18513() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18513");
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory0 = new fitnesse.testsystems.slim.tables.SlimTableFactory();
        java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable> wildcardClass2 = slimTableFactory0.getTableType("");
        java.util.Map<java.lang.String, java.lang.String> strMap3 = slimTableFactory0.tableTypeArrays;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory4 = slimTableFactory0.copy();
        boolean boolean6 = slimTableFactory4.hasColon("");
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory7 = new fitnesse.testsystems.slim.tables.SlimTableFactory();
        java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable> wildcardClass9 = slimTableFactory7.getTableType("");
        java.util.Map<java.lang.String, java.lang.String> strMap10 = slimTableFactory7.tableTypeArrays;
        boolean boolean12 = slimTableFactory7.hasColon("");
        java.lang.String str14 = slimTableFactory7.makeTableType("");
        java.util.Map<java.lang.String, java.lang.String> strMap15 = slimTableFactory7.tableTypeArrays;
        slimTableFactory4.tableTypeArrays = strMap15;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory17 = new fitnesse.testsystems.slim.tables.SlimTableFactory();
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory18 = slimTableFactory17.copy();
        boolean boolean20 = slimTableFactory18.hasColon("hi!");
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory21 = slimTableFactory18.copy();
        java.util.Map<java.lang.String, java.lang.String> strMap22 = slimTableFactory18.tableTypeArrays;
        java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable> wildcardClass24 = slimTableFactory18.getTableType("");
        java.util.Map<java.lang.String, java.lang.String> strMap25 = slimTableFactory18.tableTypeArrays;
        slimTableFactory4.tableTypeArrays = strMap25;
        java.util.Map<java.lang.String, java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable>> strMap27 = slimTableFactory4.tableTypes;
        boolean boolean29 = slimTableFactory4.hasColon("");
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory30 = slimTableFactory4.copy();
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory31 = new fitnesse.testsystems.slim.tables.SlimTableFactory();
        java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable> wildcardClass33 = slimTableFactory31.getTableType("");
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory34 = slimTableFactory31.copy();
        boolean boolean36 = slimTableFactory31.hasColon("hi!");
        java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable> wildcardClass38 = slimTableFactory31.getTableType("hi!");
        java.util.Map<java.lang.String, java.lang.String> strMap39 = slimTableFactory31.tableTypeArrays;
        java.util.Map<java.lang.String, java.lang.String> strMap40 = slimTableFactory31.tableTypeArrays;
        slimTableFactory4.tableTypeArrays = strMap40;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory42 = new fitnesse.testsystems.slim.tables.SlimTableFactory();
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory43 = slimTableFactory42.copy();
        java.lang.String str45 = slimTableFactory42.getFullTableName("hi!");
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory46 = slimTableFactory42.copy();
        java.util.Map<java.lang.String, java.lang.String> strMap47 = slimTableFactory42.tableTypeArrays;
        slimTableFactory4.tableTypeArrays = strMap47;
        java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable> wildcardClass50 = slimTableFactory4.getTableType("hi!");
        java.util.Map<java.lang.String, java.lang.String> strMap51 = slimTableFactory4.tableTypeArrays;
        org.junit.Assert.assertNull(wildcardClass2);
        org.junit.Assert.assertNotNull(strMap3);
        org.junit.Assert.assertNotNull(slimTableFactory4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(wildcardClass9);
        org.junit.Assert.assertNotNull(strMap10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertNotNull(strMap15);
        org.junit.Assert.assertNotNull(slimTableFactory18);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(slimTableFactory21);
        org.junit.Assert.assertNotNull(strMap22);
        org.junit.Assert.assertNull(wildcardClass24);
        org.junit.Assert.assertNotNull(strMap25);
        org.junit.Assert.assertNotNull(strMap27);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertNotNull(slimTableFactory30);
        org.junit.Assert.assertNull(wildcardClass33);
        org.junit.Assert.assertNotNull(slimTableFactory34);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertNull(wildcardClass38);
        org.junit.Assert.assertNotNull(strMap39);
        org.junit.Assert.assertNotNull(strMap40);
        org.junit.Assert.assertNotNull(slimTableFactory43);
        org.junit.Assert.assertEquals("'" + str45 + "' != '" + "hi!" + "'", str45, "hi!");
        org.junit.Assert.assertNotNull(slimTableFactory46);
        org.junit.Assert.assertNotNull(strMap47);
        org.junit.Assert.assertNull(wildcardClass50);
        org.junit.Assert.assertNotNull(strMap51);
    }

    @Test
    public void test18514() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18514");
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory0 = new fitnesse.testsystems.slim.tables.SlimTableFactory();
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory1 = slimTableFactory0.copy();
        boolean boolean3 = slimTableFactory1.hasColon("hi!");
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory4 = slimTableFactory1.copy();
        java.util.Map<java.lang.String, java.lang.String> strMap5 = slimTableFactory1.tableTypeArrays;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory6 = slimTableFactory1.copy();
        boolean boolean8 = slimTableFactory6.hasColon("hi!");
        java.util.Map<java.lang.String, java.lang.String> strMap9 = slimTableFactory6.tableTypeArrays;
        java.lang.String str11 = slimTableFactory6.getFullTableName("hi!");
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory12 = slimTableFactory6.copy();
        java.util.Map<java.lang.String, java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable>> strMap13 = slimTableFactory6.tableTypes;
        java.lang.String str15 = slimTableFactory6.makeTableType("hi!");
        org.junit.Assert.assertNotNull(slimTableFactory1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(slimTableFactory4);
        org.junit.Assert.assertNotNull(strMap5);
        org.junit.Assert.assertNotNull(slimTableFactory6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(strMap9);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertNotNull(slimTableFactory12);
        org.junit.Assert.assertNotNull(strMap13);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
    }

    @Test
    public void test18515() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18515");
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory0 = new fitnesse.testsystems.slim.tables.SlimTableFactory();
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory1 = slimTableFactory0.copy();
        java.util.Map<java.lang.String, java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable>> strMap2 = slimTableFactory1.tableTypes;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory3 = new fitnesse.testsystems.slim.tables.SlimTableFactory();
        java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable> wildcardClass5 = slimTableFactory3.getTableType("");
        boolean boolean7 = slimTableFactory3.hasColon("");
        java.util.Map<java.lang.String, java.lang.String> strMap8 = slimTableFactory3.tableTypeArrays;
        slimTableFactory1.tableTypeArrays = strMap8;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory10 = new fitnesse.testsystems.slim.tables.SlimTableFactory();
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory11 = slimTableFactory10.copy();
        boolean boolean13 = slimTableFactory11.hasColon("hi!");
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory14 = slimTableFactory11.copy();
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory15 = slimTableFactory11.copy();
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory16 = slimTableFactory15.copy();
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory17 = new fitnesse.testsystems.slim.tables.SlimTableFactory();
        java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable> wildcardClass19 = slimTableFactory17.getTableType("");
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory20 = slimTableFactory17.copy();
        boolean boolean22 = slimTableFactory17.hasColon("hi!");
        java.util.Map<java.lang.String, java.lang.String> strMap23 = slimTableFactory17.tableTypeArrays;
        slimTableFactory15.tableTypeArrays = strMap23;
        java.util.Map<java.lang.String, java.lang.String> strMap25 = slimTableFactory15.tableTypeArrays;
        slimTableFactory1.tableTypeArrays = strMap25;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory27 = slimTableFactory1.copy();
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory28 = slimTableFactory1.copy();
        boolean boolean30 = slimTableFactory28.hasColon("hi!");
        java.util.Map<java.lang.String, java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable>> strMap31 = slimTableFactory28.tableTypes;
        java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable> wildcardClass33 = slimTableFactory28.getTableType("hi!");
        java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable> wildcardClass35 = slimTableFactory28.getTableType("");
        org.junit.Assert.assertNotNull(slimTableFactory1);
        org.junit.Assert.assertNotNull(strMap2);
        org.junit.Assert.assertNull(wildcardClass5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(strMap8);
        org.junit.Assert.assertNotNull(slimTableFactory11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(slimTableFactory14);
        org.junit.Assert.assertNotNull(slimTableFactory15);
        org.junit.Assert.assertNotNull(slimTableFactory16);
        org.junit.Assert.assertNull(wildcardClass19);
        org.junit.Assert.assertNotNull(slimTableFactory20);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(strMap23);
        org.junit.Assert.assertNotNull(strMap25);
        org.junit.Assert.assertNotNull(slimTableFactory27);
        org.junit.Assert.assertNotNull(slimTableFactory28);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertNotNull(strMap31);
        org.junit.Assert.assertNull(wildcardClass33);
        org.junit.Assert.assertNull(wildcardClass35);
    }

    @Test
    public void test18516() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18516");
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory0 = new fitnesse.testsystems.slim.tables.SlimTableFactory();
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory1 = slimTableFactory0.copy();
        java.util.Map<java.lang.String, java.lang.String> strMap2 = null;
        slimTableFactory0.tableTypeArrays = strMap2;
        java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable> wildcardClass5 = slimTableFactory0.getTableType("hi!");
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory6 = new fitnesse.testsystems.slim.tables.SlimTableFactory();
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory7 = slimTableFactory6.copy();
        boolean boolean9 = slimTableFactory7.hasColon("hi!");
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory10 = slimTableFactory7.copy();
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory11 = slimTableFactory7.copy();
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory12 = new fitnesse.testsystems.slim.tables.SlimTableFactory();
        java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable> wildcardClass14 = slimTableFactory12.getTableType("");
        boolean boolean16 = slimTableFactory12.hasColon("");
        java.util.Map<java.lang.String, java.lang.String> strMap17 = slimTableFactory12.tableTypeArrays;
        slimTableFactory11.tableTypeArrays = strMap17;
        slimTableFactory0.tableTypeArrays = strMap17;
        boolean boolean21 = slimTableFactory0.hasColon("");
        java.util.Map<java.lang.String, java.lang.String> strMap22 = slimTableFactory0.tableTypeArrays;
        java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable> wildcardClass24 = slimTableFactory0.getTableType("hi!");
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory25 = new fitnesse.testsystems.slim.tables.SlimTableFactory();
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory26 = slimTableFactory25.copy();
        boolean boolean28 = slimTableFactory26.hasColon("hi!");
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory29 = slimTableFactory26.copy();
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory30 = slimTableFactory26.copy();
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory31 = slimTableFactory30.copy();
        boolean boolean33 = slimTableFactory30.hasColon("hi!");
        java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable> wildcardClass35 = slimTableFactory30.getTableType("");
        java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable> wildcardClass37 = slimTableFactory30.getTableType("hi!");
        java.util.Map<java.lang.String, java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable>> strMap38 = slimTableFactory30.tableTypes;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory39 = slimTableFactory30.copy();
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory40 = new fitnesse.testsystems.slim.tables.SlimTableFactory();
        java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable> wildcardClass42 = slimTableFactory40.getTableType("");
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory43 = slimTableFactory40.copy();
        java.util.Map<java.lang.String, java.lang.String> strMap44 = slimTableFactory43.tableTypeArrays;
        java.lang.String str46 = slimTableFactory43.makeTableType("hi!");
        boolean boolean48 = slimTableFactory43.hasColon("hi!");
        java.lang.String str50 = slimTableFactory43.getFullTableName("");
        java.util.Map<java.lang.String, java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable>> strMap51 = slimTableFactory43.tableTypes;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory52 = slimTableFactory43.copy();
        java.util.Map<java.lang.String, java.lang.String> strMap53 = null;
        slimTableFactory52.tableTypeArrays = strMap53;
        java.util.Map<java.lang.String, java.lang.String> strMap55 = slimTableFactory52.tableTypeArrays;
        java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable> wildcardClass57 = slimTableFactory52.getTableType("");
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory58 = new fitnesse.testsystems.slim.tables.SlimTableFactory();
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory59 = slimTableFactory58.copy();
        boolean boolean61 = slimTableFactory59.hasColon("hi!");
        java.util.Map<java.lang.String, java.lang.String> strMap62 = slimTableFactory59.tableTypeArrays;
        java.lang.String str64 = slimTableFactory59.getFullTableName("");
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory65 = new fitnesse.testsystems.slim.tables.SlimTableFactory();
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory66 = slimTableFactory65.copy();
        boolean boolean68 = slimTableFactory66.hasColon("hi!");
        java.util.Map<java.lang.String, java.lang.String> strMap69 = slimTableFactory66.tableTypeArrays;
        java.lang.String str71 = slimTableFactory66.getFullTableName("");
        java.util.Map<java.lang.String, java.lang.String> strMap72 = slimTableFactory66.tableTypeArrays;
        slimTableFactory59.tableTypeArrays = strMap72;
        java.util.Map<java.lang.String, java.lang.String> strMap74 = slimTableFactory59.tableTypeArrays;
        java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable> wildcardClass76 = slimTableFactory59.getTableType("");
        java.util.Map<java.lang.String, java.lang.String> strMap77 = slimTableFactory59.tableTypeArrays;
        slimTableFactory52.tableTypeArrays = strMap77;
        slimTableFactory30.tableTypeArrays = strMap77;
        slimTableFactory0.tableTypeArrays = strMap77;
        org.junit.Assert.assertNotNull(slimTableFactory1);
        org.junit.Assert.assertNull(wildcardClass5);
        org.junit.Assert.assertNotNull(slimTableFactory7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(slimTableFactory10);
        org.junit.Assert.assertNotNull(slimTableFactory11);
        org.junit.Assert.assertNull(wildcardClass14);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(strMap17);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(strMap22);
        org.junit.Assert.assertNull(wildcardClass24);
        org.junit.Assert.assertNotNull(slimTableFactory26);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertNotNull(slimTableFactory29);
        org.junit.Assert.assertNotNull(slimTableFactory30);
        org.junit.Assert.assertNotNull(slimTableFactory31);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertNull(wildcardClass35);
        org.junit.Assert.assertNull(wildcardClass37);
        org.junit.Assert.assertNotNull(strMap38);
        org.junit.Assert.assertNotNull(slimTableFactory39);
        org.junit.Assert.assertNull(wildcardClass42);
        org.junit.Assert.assertNotNull(slimTableFactory43);
        org.junit.Assert.assertNotNull(strMap44);
        org.junit.Assert.assertEquals("'" + str46 + "' != '" + "hi!" + "'", str46, "hi!");
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertEquals("'" + str50 + "' != '" + "" + "'", str50, "");
        org.junit.Assert.assertNotNull(strMap51);
        org.junit.Assert.assertNotNull(slimTableFactory52);
        org.junit.Assert.assertNull(strMap55);
        org.junit.Assert.assertNull(wildcardClass57);
        org.junit.Assert.assertNotNull(slimTableFactory59);
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + false + "'", boolean61 == false);
        org.junit.Assert.assertNotNull(strMap62);
        org.junit.Assert.assertEquals("'" + str64 + "' != '" + "" + "'", str64, "");
        org.junit.Assert.assertNotNull(slimTableFactory66);
        org.junit.Assert.assertTrue("'" + boolean68 + "' != '" + false + "'", boolean68 == false);
        org.junit.Assert.assertNotNull(strMap69);
        org.junit.Assert.assertEquals("'" + str71 + "' != '" + "" + "'", str71, "");
        org.junit.Assert.assertNotNull(strMap72);
        org.junit.Assert.assertNotNull(strMap74);
        org.junit.Assert.assertNull(wildcardClass76);
        org.junit.Assert.assertNotNull(strMap77);
    }

    @Test
    public void test18517() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18517");
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory0 = new fitnesse.testsystems.slim.tables.SlimTableFactory();
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory1 = slimTableFactory0.copy();
        java.lang.String str3 = slimTableFactory0.getFullTableName("hi!");
        java.util.Map<java.lang.String, java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable>> strMap4 = slimTableFactory0.tableTypes;
        java.lang.String str6 = slimTableFactory0.makeTableType("hi!");
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory7 = slimTableFactory0.copy();
        java.util.Map<java.lang.String, java.lang.String> strMap8 = slimTableFactory0.tableTypeArrays;
        java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable> wildcardClass10 = slimTableFactory0.getTableType("hi!");
        org.junit.Assert.assertNotNull(slimTableFactory1);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertNotNull(strMap4);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertNotNull(slimTableFactory7);
        org.junit.Assert.assertNotNull(strMap8);
        org.junit.Assert.assertNull(wildcardClass10);
    }

    @Test
    public void test18518() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18518");
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory0 = new fitnesse.testsystems.slim.tables.SlimTableFactory();
        java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable> wildcardClass2 = slimTableFactory0.getTableType("");
        boolean boolean4 = slimTableFactory0.hasColon("");
        java.util.Map<java.lang.String, java.lang.String> strMap5 = slimTableFactory0.tableTypeArrays;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory6 = new fitnesse.testsystems.slim.tables.SlimTableFactory();
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory7 = slimTableFactory6.copy();
        boolean boolean9 = slimTableFactory7.hasColon("hi!");
        java.util.Map<java.lang.String, java.lang.String> strMap10 = slimTableFactory7.tableTypeArrays;
        java.util.Map<java.lang.String, java.lang.String> strMap11 = slimTableFactory7.tableTypeArrays;
        slimTableFactory0.tableTypeArrays = strMap11;
        java.util.Map<java.lang.String, java.lang.String> strMap13 = slimTableFactory0.tableTypeArrays;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory14 = slimTableFactory0.copy();
        java.lang.String str16 = slimTableFactory0.makeTableType("hi!");
        java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable> wildcardClass18 = slimTableFactory0.getTableType("");
        java.lang.String str20 = slimTableFactory0.makeTableType("");
        org.junit.Assert.assertNull(wildcardClass2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(strMap5);
        org.junit.Assert.assertNotNull(slimTableFactory7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(strMap10);
        org.junit.Assert.assertNotNull(strMap11);
        org.junit.Assert.assertNotNull(strMap13);
        org.junit.Assert.assertNotNull(slimTableFactory14);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertNull(wildcardClass18);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
    }

    @Test
    public void test18519() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18519");
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory0 = new fitnesse.testsystems.slim.tables.SlimTableFactory();
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory1 = slimTableFactory0.copy();
        java.util.Map<java.lang.String, java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable>> strMap2 = slimTableFactory1.tableTypes;
        boolean boolean4 = slimTableFactory1.hasColon("");
        boolean boolean6 = slimTableFactory1.hasColon("hi!");
        java.util.Map<java.lang.String, java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable>> strMap7 = slimTableFactory1.tableTypes;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory8 = new fitnesse.testsystems.slim.tables.SlimTableFactory();
        java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable> wildcardClass10 = slimTableFactory8.getTableType("");
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory11 = slimTableFactory8.copy();
        java.util.Map<java.lang.String, java.lang.String> strMap12 = slimTableFactory11.tableTypeArrays;
        slimTableFactory1.tableTypeArrays = strMap12;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory14 = slimTableFactory1.copy();
        java.lang.String str16 = slimTableFactory14.makeTableType("hi!");
        java.lang.String str18 = slimTableFactory14.getFullTableName("hi!");
        java.util.Map<java.lang.String, java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable>> strMap19 = slimTableFactory14.tableTypes;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory20 = slimTableFactory14.copy();
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory21 = new fitnesse.testsystems.slim.tables.SlimTableFactory();
        java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable> wildcardClass23 = slimTableFactory21.getTableType("");
        java.util.Map<java.lang.String, java.lang.String> strMap24 = slimTableFactory21.tableTypeArrays;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory25 = slimTableFactory21.copy();
        java.util.Map<java.lang.String, java.lang.String> strMap26 = slimTableFactory21.tableTypeArrays;
        java.lang.String str28 = slimTableFactory21.makeTableType("");
        java.lang.String str30 = slimTableFactory21.getFullTableName("hi!");
        java.lang.String str32 = slimTableFactory21.getFullTableName("");
        java.lang.String str34 = slimTableFactory21.getFullTableName("");
        java.util.Map<java.lang.String, java.lang.String> strMap35 = slimTableFactory21.tableTypeArrays;
        slimTableFactory14.tableTypeArrays = strMap35;
        org.junit.Assert.assertNotNull(slimTableFactory1);
        org.junit.Assert.assertNotNull(strMap2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(strMap7);
        org.junit.Assert.assertNull(wildcardClass10);
        org.junit.Assert.assertNotNull(slimTableFactory11);
        org.junit.Assert.assertNotNull(strMap12);
        org.junit.Assert.assertNotNull(slimTableFactory14);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!" + "'", str18, "hi!");
        org.junit.Assert.assertNotNull(strMap19);
        org.junit.Assert.assertNotNull(slimTableFactory20);
        org.junit.Assert.assertNull(wildcardClass23);
        org.junit.Assert.assertNotNull(strMap24);
        org.junit.Assert.assertNotNull(slimTableFactory25);
        org.junit.Assert.assertNotNull(strMap26);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "" + "'", str28, "");
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "hi!" + "'", str30, "hi!");
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "" + "'", str32, "");
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "" + "'", str34, "");
        org.junit.Assert.assertNotNull(strMap35);
    }

    @Test
    public void test18520() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18520");
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory0 = new fitnesse.testsystems.slim.tables.SlimTableFactory();
        java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable> wildcardClass2 = slimTableFactory0.getTableType("");
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory3 = slimTableFactory0.copy();
        boolean boolean5 = slimTableFactory0.hasColon("hi!");
        java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable> wildcardClass7 = slimTableFactory0.getTableType("hi!");
        java.lang.String str9 = slimTableFactory0.getFullTableName("");
        java.lang.String str11 = slimTableFactory0.makeTableType("hi!");
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory12 = slimTableFactory0.copy();
        boolean boolean14 = slimTableFactory0.hasColon("");
        java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable> wildcardClass16 = slimTableFactory0.getTableType("");
        java.lang.String str18 = slimTableFactory0.getFullTableName("hi!");
        fitnesse.testsystems.slim.Table table19 = null;
        fitnesse.testsystems.slim.SlimTestContext slimTestContext21 = null;
        // The following exception was thrown during execution in test generation
        try {
            fitnesse.testsystems.slim.tables.SlimTable slimTable22 = slimTableFactory0.makeSlimTable(table19, "", slimTestContext21);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(wildcardClass2);
        org.junit.Assert.assertNotNull(slimTableFactory3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(wildcardClass7);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertNotNull(slimTableFactory12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNull(wildcardClass16);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!" + "'", str18, "hi!");
    }

    @Test
    public void test18521() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18521");
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory0 = new fitnesse.testsystems.slim.tables.SlimTableFactory();
        java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable> wildcardClass2 = slimTableFactory0.getTableType("");
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory3 = slimTableFactory0.copy();
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory4 = slimTableFactory3.copy();
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory5 = new fitnesse.testsystems.slim.tables.SlimTableFactory();
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory6 = slimTableFactory5.copy();
        boolean boolean8 = slimTableFactory6.hasColon("hi!");
        java.util.Map<java.lang.String, java.lang.String> strMap9 = slimTableFactory6.tableTypeArrays;
        java.lang.String str11 = slimTableFactory6.getFullTableName("");
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory12 = new fitnesse.testsystems.slim.tables.SlimTableFactory();
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory13 = slimTableFactory12.copy();
        boolean boolean15 = slimTableFactory13.hasColon("hi!");
        java.util.Map<java.lang.String, java.lang.String> strMap16 = slimTableFactory13.tableTypeArrays;
        java.lang.String str18 = slimTableFactory13.getFullTableName("");
        java.util.Map<java.lang.String, java.lang.String> strMap19 = slimTableFactory13.tableTypeArrays;
        slimTableFactory6.tableTypeArrays = strMap19;
        java.util.Map<java.lang.String, java.lang.String> strMap21 = slimTableFactory6.tableTypeArrays;
        java.util.Map<java.lang.String, java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable>> strMap22 = slimTableFactory6.tableTypes;
        java.util.Map<java.lang.String, java.lang.String> strMap23 = slimTableFactory6.tableTypeArrays;
        slimTableFactory3.tableTypeArrays = strMap23;
        java.util.Map<java.lang.String, java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable>> strMap25 = slimTableFactory3.tableTypes;
        java.lang.String str27 = slimTableFactory3.makeTableType("");
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory28 = new fitnesse.testsystems.slim.tables.SlimTableFactory();
        java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable> wildcardClass30 = slimTableFactory28.getTableType("");
        java.util.Map<java.lang.String, java.lang.String> strMap31 = slimTableFactory28.tableTypeArrays;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory32 = slimTableFactory28.copy();
        boolean boolean34 = slimTableFactory32.hasColon("");
        java.lang.String str36 = slimTableFactory32.makeTableType("");
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory37 = new fitnesse.testsystems.slim.tables.SlimTableFactory();
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory38 = slimTableFactory37.copy();
        java.util.Map<java.lang.String, java.lang.String> strMap39 = null;
        slimTableFactory37.tableTypeArrays = strMap39;
        java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable> wildcardClass42 = slimTableFactory37.getTableType("hi!");
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory43 = new fitnesse.testsystems.slim.tables.SlimTableFactory();
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory44 = slimTableFactory43.copy();
        boolean boolean46 = slimTableFactory44.hasColon("hi!");
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory47 = slimTableFactory44.copy();
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory48 = slimTableFactory44.copy();
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory49 = new fitnesse.testsystems.slim.tables.SlimTableFactory();
        java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable> wildcardClass51 = slimTableFactory49.getTableType("");
        boolean boolean53 = slimTableFactory49.hasColon("");
        java.util.Map<java.lang.String, java.lang.String> strMap54 = slimTableFactory49.tableTypeArrays;
        slimTableFactory48.tableTypeArrays = strMap54;
        slimTableFactory37.tableTypeArrays = strMap54;
        boolean boolean58 = slimTableFactory37.hasColon("");
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory59 = new fitnesse.testsystems.slim.tables.SlimTableFactory();
        java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable> wildcardClass61 = slimTableFactory59.getTableType("");
        java.util.Map<java.lang.String, java.lang.String> strMap62 = slimTableFactory59.tableTypeArrays;
        slimTableFactory37.tableTypeArrays = strMap62;
        java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable> wildcardClass65 = slimTableFactory37.getTableType("hi!");
        java.util.Map<java.lang.String, java.lang.String> strMap66 = slimTableFactory37.tableTypeArrays;
        slimTableFactory32.tableTypeArrays = strMap66;
        slimTableFactory3.tableTypeArrays = strMap66;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory69 = slimTableFactory3.copy();
        java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable> wildcardClass71 = slimTableFactory3.getTableType("hi!");
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory72 = slimTableFactory3.copy();
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory73 = slimTableFactory3.copy();
        java.util.Map<java.lang.String, java.lang.String> strMap74 = slimTableFactory3.tableTypeArrays;
        java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable> wildcardClass76 = slimTableFactory3.getTableType("hi!");
        java.lang.Class<?> wildcardClass77 = slimTableFactory3.getClass();
        org.junit.Assert.assertNull(wildcardClass2);
        org.junit.Assert.assertNotNull(slimTableFactory3);
        org.junit.Assert.assertNotNull(slimTableFactory4);
        org.junit.Assert.assertNotNull(slimTableFactory6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(strMap9);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNotNull(slimTableFactory13);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(strMap16);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertNotNull(strMap19);
        org.junit.Assert.assertNotNull(strMap21);
        org.junit.Assert.assertNotNull(strMap22);
        org.junit.Assert.assertNotNull(strMap23);
        org.junit.Assert.assertNotNull(strMap25);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "" + "'", str27, "");
        org.junit.Assert.assertNull(wildcardClass30);
        org.junit.Assert.assertNotNull(strMap31);
        org.junit.Assert.assertNotNull(slimTableFactory32);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "" + "'", str36, "");
        org.junit.Assert.assertNotNull(slimTableFactory38);
        org.junit.Assert.assertNull(wildcardClass42);
        org.junit.Assert.assertNotNull(slimTableFactory44);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertNotNull(slimTableFactory47);
        org.junit.Assert.assertNotNull(slimTableFactory48);
        org.junit.Assert.assertNull(wildcardClass51);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + false + "'", boolean53 == false);
        org.junit.Assert.assertNotNull(strMap54);
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + false + "'", boolean58 == false);
        org.junit.Assert.assertNull(wildcardClass61);
        org.junit.Assert.assertNotNull(strMap62);
        org.junit.Assert.assertNull(wildcardClass65);
        org.junit.Assert.assertNotNull(strMap66);
        org.junit.Assert.assertNotNull(slimTableFactory69);
        org.junit.Assert.assertNull(wildcardClass71);
        org.junit.Assert.assertNotNull(slimTableFactory72);
        org.junit.Assert.assertNotNull(slimTableFactory73);
        org.junit.Assert.assertNotNull(strMap74);
        org.junit.Assert.assertNull(wildcardClass76);
        org.junit.Assert.assertNotNull(wildcardClass77);
    }

    @Test
    public void test18522() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18522");
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory0 = new fitnesse.testsystems.slim.tables.SlimTableFactory();
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory1 = slimTableFactory0.copy();
        java.util.Map<java.lang.String, java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable>> strMap2 = slimTableFactory1.tableTypes;
        boolean boolean4 = slimTableFactory1.hasColon("");
        java.util.Map<java.lang.String, java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable>> strMap5 = slimTableFactory1.tableTypes;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory6 = slimTableFactory1.copy();
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory7 = slimTableFactory6.copy();
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory8 = slimTableFactory7.copy();
        java.lang.String str10 = slimTableFactory8.getFullTableName("");
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory11 = slimTableFactory8.copy();
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory12 = new fitnesse.testsystems.slim.tables.SlimTableFactory();
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory13 = slimTableFactory12.copy();
        java.util.Map<java.lang.String, java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable>> strMap14 = slimTableFactory13.tableTypes;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory15 = new fitnesse.testsystems.slim.tables.SlimTableFactory();
        java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable> wildcardClass17 = slimTableFactory15.getTableType("");
        boolean boolean19 = slimTableFactory15.hasColon("");
        java.util.Map<java.lang.String, java.lang.String> strMap20 = slimTableFactory15.tableTypeArrays;
        slimTableFactory13.tableTypeArrays = strMap20;
        java.lang.String str23 = slimTableFactory13.makeTableType("");
        java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable> wildcardClass25 = slimTableFactory13.getTableType("");
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory26 = slimTableFactory13.copy();
        java.lang.String str28 = slimTableFactory13.getFullTableName("");
        java.lang.String str30 = slimTableFactory13.makeTableType("");
        java.util.Map<java.lang.String, java.lang.String> strMap31 = slimTableFactory13.tableTypeArrays;
        slimTableFactory11.tableTypeArrays = strMap31;
        java.lang.Class<?> wildcardClass33 = strMap31.getClass();
        org.junit.Assert.assertNotNull(slimTableFactory1);
        org.junit.Assert.assertNotNull(strMap2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(strMap5);
        org.junit.Assert.assertNotNull(slimTableFactory6);
        org.junit.Assert.assertNotNull(slimTableFactory7);
        org.junit.Assert.assertNotNull(slimTableFactory8);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNotNull(slimTableFactory11);
        org.junit.Assert.assertNotNull(slimTableFactory13);
        org.junit.Assert.assertNotNull(strMap14);
        org.junit.Assert.assertNull(wildcardClass17);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(strMap20);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
        org.junit.Assert.assertNull(wildcardClass25);
        org.junit.Assert.assertNotNull(slimTableFactory26);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "" + "'", str28, "");
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "" + "'", str30, "");
        org.junit.Assert.assertNotNull(strMap31);
        org.junit.Assert.assertNotNull(wildcardClass33);
    }

    @Test
    public void test18523() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18523");
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory0 = new fitnesse.testsystems.slim.tables.SlimTableFactory();
        java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable> wildcardClass2 = slimTableFactory0.getTableType("");
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory3 = slimTableFactory0.copy();
        boolean boolean5 = slimTableFactory0.hasColon("");
        java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable> wildcardClass7 = slimTableFactory0.getTableType("hi!");
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory8 = slimTableFactory0.copy();
        java.util.Map<java.lang.String, java.lang.String> strMap9 = slimTableFactory0.tableTypeArrays;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory10 = new fitnesse.testsystems.slim.tables.SlimTableFactory();
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory11 = slimTableFactory10.copy();
        boolean boolean13 = slimTableFactory11.hasColon("hi!");
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory14 = slimTableFactory11.copy();
        java.util.Map<java.lang.String, java.lang.String> strMap15 = slimTableFactory11.tableTypeArrays;
        java.lang.String str17 = slimTableFactory11.getFullTableName("hi!");
        java.util.Map<java.lang.String, java.lang.String> strMap18 = slimTableFactory11.tableTypeArrays;
        slimTableFactory0.tableTypeArrays = strMap18;
        java.lang.String str21 = slimTableFactory0.getFullTableName("");
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory22 = new fitnesse.testsystems.slim.tables.SlimTableFactory();
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory23 = slimTableFactory22.copy();
        java.util.Map<java.lang.String, java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable>> strMap24 = slimTableFactory23.tableTypes;
        boolean boolean26 = slimTableFactory23.hasColon("");
        boolean boolean28 = slimTableFactory23.hasColon("hi!");
        boolean boolean30 = slimTableFactory23.hasColon("");
        java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable> wildcardClass32 = slimTableFactory23.getTableType("");
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory33 = new fitnesse.testsystems.slim.tables.SlimTableFactory();
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory34 = slimTableFactory33.copy();
        java.util.Map<java.lang.String, java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable>> strMap35 = slimTableFactory34.tableTypes;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory36 = new fitnesse.testsystems.slim.tables.SlimTableFactory();
        java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable> wildcardClass38 = slimTableFactory36.getTableType("");
        boolean boolean40 = slimTableFactory36.hasColon("");
        java.util.Map<java.lang.String, java.lang.String> strMap41 = slimTableFactory36.tableTypeArrays;
        slimTableFactory34.tableTypeArrays = strMap41;
        java.lang.String str44 = slimTableFactory34.makeTableType("");
        java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable> wildcardClass46 = slimTableFactory34.getTableType("");
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory47 = slimTableFactory34.copy();
        java.lang.String str49 = slimTableFactory34.getFullTableName("");
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory50 = new fitnesse.testsystems.slim.tables.SlimTableFactory();
        java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable> wildcardClass52 = slimTableFactory50.getTableType("");
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory53 = slimTableFactory50.copy();
        java.util.Map<java.lang.String, java.lang.String> strMap54 = slimTableFactory53.tableTypeArrays;
        java.util.Map<java.lang.String, java.lang.String> strMap55 = slimTableFactory53.tableTypeArrays;
        java.util.Map<java.lang.String, java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable>> strMap56 = slimTableFactory53.tableTypes;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory57 = slimTableFactory53.copy();
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory58 = new fitnesse.testsystems.slim.tables.SlimTableFactory();
        java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable> wildcardClass60 = slimTableFactory58.getTableType("");
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory61 = slimTableFactory58.copy();
        boolean boolean63 = slimTableFactory58.hasColon("hi!");
        java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable> wildcardClass65 = slimTableFactory58.getTableType("hi!");
        java.util.Map<java.lang.String, java.lang.String> strMap66 = slimTableFactory58.tableTypeArrays;
        java.util.Map<java.lang.String, java.lang.String> strMap67 = slimTableFactory58.tableTypeArrays;
        java.util.Map<java.lang.String, java.lang.String> strMap68 = slimTableFactory58.tableTypeArrays;
        slimTableFactory57.tableTypeArrays = strMap68;
        slimTableFactory34.tableTypeArrays = strMap68;
        slimTableFactory23.tableTypeArrays = strMap68;
        slimTableFactory0.tableTypeArrays = strMap68;
        org.junit.Assert.assertNull(wildcardClass2);
        org.junit.Assert.assertNotNull(slimTableFactory3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(wildcardClass7);
        org.junit.Assert.assertNotNull(slimTableFactory8);
        org.junit.Assert.assertNotNull(strMap9);
        org.junit.Assert.assertNotNull(slimTableFactory11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(slimTableFactory14);
        org.junit.Assert.assertNotNull(strMap15);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
        org.junit.Assert.assertNotNull(strMap18);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertNotNull(slimTableFactory23);
        org.junit.Assert.assertNotNull(strMap24);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertNull(wildcardClass32);
        org.junit.Assert.assertNotNull(slimTableFactory34);
        org.junit.Assert.assertNotNull(strMap35);
        org.junit.Assert.assertNull(wildcardClass38);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertNotNull(strMap41);
        org.junit.Assert.assertEquals("'" + str44 + "' != '" + "" + "'", str44, "");
        org.junit.Assert.assertNull(wildcardClass46);
        org.junit.Assert.assertNotNull(slimTableFactory47);
        org.junit.Assert.assertEquals("'" + str49 + "' != '" + "" + "'", str49, "");
        org.junit.Assert.assertNull(wildcardClass52);
        org.junit.Assert.assertNotNull(slimTableFactory53);
        org.junit.Assert.assertNotNull(strMap54);
        org.junit.Assert.assertNotNull(strMap55);
        org.junit.Assert.assertNotNull(strMap56);
        org.junit.Assert.assertNotNull(slimTableFactory57);
        org.junit.Assert.assertNull(wildcardClass60);
        org.junit.Assert.assertNotNull(slimTableFactory61);
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + false + "'", boolean63 == false);
        org.junit.Assert.assertNull(wildcardClass65);
        org.junit.Assert.assertNotNull(strMap66);
        org.junit.Assert.assertNotNull(strMap67);
        org.junit.Assert.assertNotNull(strMap68);
    }

    @Test
    public void test18524() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18524");
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory0 = new fitnesse.testsystems.slim.tables.SlimTableFactory();
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory1 = slimTableFactory0.copy();
        java.util.Map<java.lang.String, java.lang.String> strMap2 = null;
        slimTableFactory0.tableTypeArrays = strMap2;
        java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable> wildcardClass5 = slimTableFactory0.getTableType("hi!");
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory6 = new fitnesse.testsystems.slim.tables.SlimTableFactory();
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory7 = slimTableFactory6.copy();
        boolean boolean9 = slimTableFactory7.hasColon("hi!");
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory10 = slimTableFactory7.copy();
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory11 = slimTableFactory7.copy();
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory12 = new fitnesse.testsystems.slim.tables.SlimTableFactory();
        java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable> wildcardClass14 = slimTableFactory12.getTableType("");
        boolean boolean16 = slimTableFactory12.hasColon("");
        java.util.Map<java.lang.String, java.lang.String> strMap17 = slimTableFactory12.tableTypeArrays;
        slimTableFactory11.tableTypeArrays = strMap17;
        slimTableFactory0.tableTypeArrays = strMap17;
        boolean boolean21 = slimTableFactory0.hasColon("");
        java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable> wildcardClass23 = slimTableFactory0.getTableType("");
        java.util.Map<java.lang.String, java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable>> strMap24 = slimTableFactory0.tableTypes;
        java.lang.String str26 = slimTableFactory0.getFullTableName("hi!");
        boolean boolean28 = slimTableFactory0.hasColon("hi!");
        fitnesse.testsystems.slim.Table table29 = null;
        // The following exception was thrown during execution in test generation
        try {
            fitnesse.testsystems.slim.tables.SlimTable slimTable30 = slimTableFactory0.parseDefineTableTypeTable(table29);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(slimTableFactory1);
        org.junit.Assert.assertNull(wildcardClass5);
        org.junit.Assert.assertNotNull(slimTableFactory7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(slimTableFactory10);
        org.junit.Assert.assertNotNull(slimTableFactory11);
        org.junit.Assert.assertNull(wildcardClass14);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(strMap17);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNull(wildcardClass23);
        org.junit.Assert.assertNotNull(strMap24);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "hi!" + "'", str26, "hi!");
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
    }

    @Test
    public void test18525() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18525");
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory0 = new fitnesse.testsystems.slim.tables.SlimTableFactory();
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory1 = slimTableFactory0.copy();
        boolean boolean3 = slimTableFactory1.hasColon("hi!");
        java.util.Map<java.lang.String, java.lang.String> strMap4 = slimTableFactory1.tableTypeArrays;
        java.lang.String str6 = slimTableFactory1.getFullTableName("");
        boolean boolean8 = slimTableFactory1.hasColon("");
        java.lang.String str10 = slimTableFactory1.makeTableType("hi!");
        java.util.Map<java.lang.String, java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable>> strMap11 = slimTableFactory1.tableTypes;
        boolean boolean13 = slimTableFactory1.hasColon("hi!");
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory14 = new fitnesse.testsystems.slim.tables.SlimTableFactory();
        java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable> wildcardClass16 = slimTableFactory14.getTableType("");
        java.util.Map<java.lang.String, java.lang.String> strMap17 = slimTableFactory14.tableTypeArrays;
        boolean boolean19 = slimTableFactory14.hasColon("");
        java.lang.String str21 = slimTableFactory14.makeTableType("");
        java.util.Map<java.lang.String, java.lang.String> strMap22 = slimTableFactory14.tableTypeArrays;
        java.lang.String str24 = slimTableFactory14.makeTableType("");
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory25 = slimTableFactory14.copy();
        java.lang.String str27 = slimTableFactory14.makeTableType("hi!");
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory28 = slimTableFactory14.copy();
        java.util.Map<java.lang.String, java.lang.String> strMap29 = slimTableFactory14.tableTypeArrays;
        slimTableFactory1.tableTypeArrays = strMap29;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory31 = slimTableFactory1.copy();
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory32 = slimTableFactory1.copy();
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory33 = slimTableFactory32.copy();
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory34 = slimTableFactory33.copy();
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory35 = slimTableFactory34.copy();
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory36 = new fitnesse.testsystems.slim.tables.SlimTableFactory();
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory37 = slimTableFactory36.copy();
        java.util.Map<java.lang.String, java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable>> strMap38 = slimTableFactory37.tableTypes;
        java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable> wildcardClass40 = slimTableFactory37.getTableType("hi!");
        java.util.Map<java.lang.String, java.lang.String> strMap41 = slimTableFactory37.tableTypeArrays;
        java.util.Map<java.lang.String, java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable>> strMap42 = slimTableFactory37.tableTypes;
        boolean boolean44 = slimTableFactory37.hasColon("hi!");
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory45 = slimTableFactory37.copy();
        java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable> wildcardClass47 = slimTableFactory45.getTableType("");
        java.lang.String str49 = slimTableFactory45.getFullTableName("");
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory50 = slimTableFactory45.copy();
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory51 = new fitnesse.testsystems.slim.tables.SlimTableFactory();
        java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable> wildcardClass53 = slimTableFactory51.getTableType("");
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory54 = slimTableFactory51.copy();
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory55 = new fitnesse.testsystems.slim.tables.SlimTableFactory();
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory56 = slimTableFactory55.copy();
        java.util.Map<java.lang.String, java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable>> strMap57 = slimTableFactory56.tableTypes;
        boolean boolean59 = slimTableFactory56.hasColon("");
        boolean boolean61 = slimTableFactory56.hasColon("hi!");
        java.util.Map<java.lang.String, java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable>> strMap62 = slimTableFactory56.tableTypes;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory63 = new fitnesse.testsystems.slim.tables.SlimTableFactory();
        java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable> wildcardClass65 = slimTableFactory63.getTableType("");
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory66 = slimTableFactory63.copy();
        java.util.Map<java.lang.String, java.lang.String> strMap67 = slimTableFactory66.tableTypeArrays;
        slimTableFactory56.tableTypeArrays = strMap67;
        slimTableFactory51.tableTypeArrays = strMap67;
        java.util.Map<java.lang.String, java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable>> strMap70 = slimTableFactory51.tableTypes;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory71 = slimTableFactory51.copy();
        java.util.Map<java.lang.String, java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable>> strMap72 = slimTableFactory51.tableTypes;
        boolean boolean74 = slimTableFactory51.hasColon("hi!");
        boolean boolean76 = slimTableFactory51.hasColon("");
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory77 = new fitnesse.testsystems.slim.tables.SlimTableFactory();
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory78 = slimTableFactory77.copy();
        boolean boolean80 = slimTableFactory78.hasColon("hi!");
        java.util.Map<java.lang.String, java.lang.String> strMap81 = slimTableFactory78.tableTypeArrays;
        java.lang.String str83 = slimTableFactory78.getFullTableName("");
        java.util.Map<java.lang.String, java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable>> strMap84 = slimTableFactory78.tableTypes;
        java.util.Map<java.lang.String, java.lang.String> strMap85 = slimTableFactory78.tableTypeArrays;
        java.util.Map<java.lang.String, java.lang.String> strMap86 = slimTableFactory78.tableTypeArrays;
        slimTableFactory51.tableTypeArrays = strMap86;
        slimTableFactory45.tableTypeArrays = strMap86;
        slimTableFactory34.tableTypeArrays = strMap86;
        org.junit.Assert.assertNotNull(slimTableFactory1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(strMap4);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertNotNull(strMap11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNull(wildcardClass16);
        org.junit.Assert.assertNotNull(strMap17);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertNotNull(strMap22);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "" + "'", str24, "");
        org.junit.Assert.assertNotNull(slimTableFactory25);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "hi!" + "'", str27, "hi!");
        org.junit.Assert.assertNotNull(slimTableFactory28);
        org.junit.Assert.assertNotNull(strMap29);
        org.junit.Assert.assertNotNull(slimTableFactory31);
        org.junit.Assert.assertNotNull(slimTableFactory32);
        org.junit.Assert.assertNotNull(slimTableFactory33);
        org.junit.Assert.assertNotNull(slimTableFactory34);
        org.junit.Assert.assertNotNull(slimTableFactory35);
        org.junit.Assert.assertNotNull(slimTableFactory37);
        org.junit.Assert.assertNotNull(strMap38);
        org.junit.Assert.assertNull(wildcardClass40);
        org.junit.Assert.assertNotNull(strMap41);
        org.junit.Assert.assertNotNull(strMap42);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertNotNull(slimTableFactory45);
        org.junit.Assert.assertNull(wildcardClass47);
        org.junit.Assert.assertEquals("'" + str49 + "' != '" + "" + "'", str49, "");
        org.junit.Assert.assertNotNull(slimTableFactory50);
        org.junit.Assert.assertNull(wildcardClass53);
        org.junit.Assert.assertNotNull(slimTableFactory54);
        org.junit.Assert.assertNotNull(slimTableFactory56);
        org.junit.Assert.assertNotNull(strMap57);
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + false + "'", boolean59 == false);
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + false + "'", boolean61 == false);
        org.junit.Assert.assertNotNull(strMap62);
        org.junit.Assert.assertNull(wildcardClass65);
        org.junit.Assert.assertNotNull(slimTableFactory66);
        org.junit.Assert.assertNotNull(strMap67);
        org.junit.Assert.assertNotNull(strMap70);
        org.junit.Assert.assertNotNull(slimTableFactory71);
        org.junit.Assert.assertNotNull(strMap72);
        org.junit.Assert.assertTrue("'" + boolean74 + "' != '" + false + "'", boolean74 == false);
        org.junit.Assert.assertTrue("'" + boolean76 + "' != '" + false + "'", boolean76 == false);
        org.junit.Assert.assertNotNull(slimTableFactory78);
        org.junit.Assert.assertTrue("'" + boolean80 + "' != '" + false + "'", boolean80 == false);
        org.junit.Assert.assertNotNull(strMap81);
        org.junit.Assert.assertEquals("'" + str83 + "' != '" + "" + "'", str83, "");
        org.junit.Assert.assertNotNull(strMap84);
        org.junit.Assert.assertNotNull(strMap85);
        org.junit.Assert.assertNotNull(strMap86);
    }

    @Test
    public void test18526() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18526");
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory0 = new fitnesse.testsystems.slim.tables.SlimTableFactory();
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory1 = slimTableFactory0.copy();
        boolean boolean3 = slimTableFactory1.hasColon("hi!");
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory4 = slimTableFactory1.copy();
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory5 = slimTableFactory1.copy();
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory6 = slimTableFactory5.copy();
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory7 = new fitnesse.testsystems.slim.tables.SlimTableFactory();
        java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable> wildcardClass9 = slimTableFactory7.getTableType("");
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory10 = slimTableFactory7.copy();
        boolean boolean12 = slimTableFactory7.hasColon("hi!");
        java.util.Map<java.lang.String, java.lang.String> strMap13 = slimTableFactory7.tableTypeArrays;
        slimTableFactory5.tableTypeArrays = strMap13;
        java.util.Map<java.lang.String, java.lang.String> strMap15 = slimTableFactory5.tableTypeArrays;
        boolean boolean17 = slimTableFactory5.hasColon("hi!");
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory18 = slimTableFactory5.copy();
        java.lang.String str20 = slimTableFactory5.getFullTableName("");
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory21 = slimTableFactory5.copy();
        java.lang.Class<?> wildcardClass22 = slimTableFactory21.getClass();
        org.junit.Assert.assertNotNull(slimTableFactory1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(slimTableFactory4);
        org.junit.Assert.assertNotNull(slimTableFactory5);
        org.junit.Assert.assertNotNull(slimTableFactory6);
        org.junit.Assert.assertNull(wildcardClass9);
        org.junit.Assert.assertNotNull(slimTableFactory10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(strMap13);
        org.junit.Assert.assertNotNull(strMap15);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(slimTableFactory18);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertNotNull(slimTableFactory21);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test18527() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18527");
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory0 = new fitnesse.testsystems.slim.tables.SlimTableFactory();
        java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable> wildcardClass2 = slimTableFactory0.getTableType("");
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory3 = slimTableFactory0.copy();
        java.lang.String str5 = slimTableFactory3.getFullTableName("hi!");
        java.lang.String str7 = slimTableFactory3.makeTableType("hi!");
        java.lang.String str9 = slimTableFactory3.getFullTableName("hi!");
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory10 = new fitnesse.testsystems.slim.tables.SlimTableFactory();
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory11 = slimTableFactory10.copy();
        boolean boolean13 = slimTableFactory11.hasColon("hi!");
        java.util.Map<java.lang.String, java.lang.String> strMap14 = slimTableFactory11.tableTypeArrays;
        java.lang.String str16 = slimTableFactory11.getFullTableName("");
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory17 = new fitnesse.testsystems.slim.tables.SlimTableFactory();
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory18 = slimTableFactory17.copy();
        boolean boolean20 = slimTableFactory18.hasColon("hi!");
        java.util.Map<java.lang.String, java.lang.String> strMap21 = slimTableFactory18.tableTypeArrays;
        java.lang.String str23 = slimTableFactory18.getFullTableName("");
        java.util.Map<java.lang.String, java.lang.String> strMap24 = slimTableFactory18.tableTypeArrays;
        slimTableFactory11.tableTypeArrays = strMap24;
        java.util.Map<java.lang.String, java.lang.String> strMap26 = slimTableFactory11.tableTypeArrays;
        slimTableFactory3.tableTypeArrays = strMap26;
        java.util.Map<java.lang.String, java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable>> strMap28 = slimTableFactory3.tableTypes;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory29 = slimTableFactory3.copy();
        java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable> wildcardClass31 = slimTableFactory29.getTableType("");
        org.junit.Assert.assertNull(wildcardClass2);
        org.junit.Assert.assertNotNull(slimTableFactory3);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertNotNull(slimTableFactory11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(strMap14);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertNotNull(slimTableFactory18);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(strMap21);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
        org.junit.Assert.assertNotNull(strMap24);
        org.junit.Assert.assertNotNull(strMap26);
        org.junit.Assert.assertNotNull(strMap28);
        org.junit.Assert.assertNotNull(slimTableFactory29);
        org.junit.Assert.assertNull(wildcardClass31);
    }

    @Test
    public void test18528() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18528");
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory0 = new fitnesse.testsystems.slim.tables.SlimTableFactory();
        java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable> wildcardClass2 = slimTableFactory0.getTableType("");
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory3 = slimTableFactory0.copy();
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory4 = new fitnesse.testsystems.slim.tables.SlimTableFactory();
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory5 = slimTableFactory4.copy();
        java.util.Map<java.lang.String, java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable>> strMap6 = slimTableFactory5.tableTypes;
        boolean boolean8 = slimTableFactory5.hasColon("");
        boolean boolean10 = slimTableFactory5.hasColon("hi!");
        java.util.Map<java.lang.String, java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable>> strMap11 = slimTableFactory5.tableTypes;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory12 = new fitnesse.testsystems.slim.tables.SlimTableFactory();
        java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable> wildcardClass14 = slimTableFactory12.getTableType("");
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory15 = slimTableFactory12.copy();
        java.util.Map<java.lang.String, java.lang.String> strMap16 = slimTableFactory15.tableTypeArrays;
        slimTableFactory5.tableTypeArrays = strMap16;
        slimTableFactory0.tableTypeArrays = strMap16;
        java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable> wildcardClass20 = slimTableFactory0.getTableType("");
        java.util.Map<java.lang.String, java.lang.String> strMap21 = slimTableFactory0.tableTypeArrays;
        java.lang.Class<?> wildcardClass22 = slimTableFactory0.getClass();
        org.junit.Assert.assertNull(wildcardClass2);
        org.junit.Assert.assertNotNull(slimTableFactory3);
        org.junit.Assert.assertNotNull(slimTableFactory5);
        org.junit.Assert.assertNotNull(strMap6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(strMap11);
        org.junit.Assert.assertNull(wildcardClass14);
        org.junit.Assert.assertNotNull(slimTableFactory15);
        org.junit.Assert.assertNotNull(strMap16);
        org.junit.Assert.assertNull(wildcardClass20);
        org.junit.Assert.assertNotNull(strMap21);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test18529() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18529");
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory0 = new fitnesse.testsystems.slim.tables.SlimTableFactory();
        java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable> wildcardClass2 = slimTableFactory0.getTableType("");
        java.util.Map<java.lang.String, java.lang.String> strMap3 = slimTableFactory0.tableTypeArrays;
        boolean boolean5 = slimTableFactory0.hasColon("");
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory6 = slimTableFactory0.copy();
        boolean boolean8 = slimTableFactory6.hasColon("hi!");
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory9 = slimTableFactory6.copy();
        fitnesse.testsystems.slim.Table table10 = null;
        // The following exception was thrown during execution in test generation
        try {
            fitnesse.testsystems.slim.tables.SlimTable slimTable11 = slimTableFactory9.parseDefineTableTypeTable(table10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(wildcardClass2);
        org.junit.Assert.assertNotNull(strMap3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(slimTableFactory6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(slimTableFactory9);
    }

    @Test
    public void test18530() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18530");
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory0 = new fitnesse.testsystems.slim.tables.SlimTableFactory();
        java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable> wildcardClass2 = slimTableFactory0.getTableType("");
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory3 = slimTableFactory0.copy();
        boolean boolean5 = slimTableFactory0.hasColon("hi!");
        java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable> wildcardClass7 = slimTableFactory0.getTableType("hi!");
        java.lang.String str9 = slimTableFactory0.getFullTableName("");
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory10 = slimTableFactory0.copy();
        java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable> wildcardClass12 = slimTableFactory0.getTableType("");
        boolean boolean14 = slimTableFactory0.hasColon("hi!");
        java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable> wildcardClass16 = slimTableFactory0.getTableType("hi!");
        boolean boolean18 = slimTableFactory0.hasColon("");
        java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable> wildcardClass20 = slimTableFactory0.getTableType("hi!");
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory21 = slimTableFactory0.copy();
        fitnesse.testsystems.slim.Table table22 = null;
        // The following exception was thrown during execution in test generation
        try {
            fitnesse.testsystems.slim.tables.SlimTable slimTable23 = slimTableFactory0.parseDefineTableTypeTable(table22);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(wildcardClass2);
        org.junit.Assert.assertNotNull(slimTableFactory3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(wildcardClass7);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNotNull(slimTableFactory10);
        org.junit.Assert.assertNull(wildcardClass12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNull(wildcardClass16);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNull(wildcardClass20);
        org.junit.Assert.assertNotNull(slimTableFactory21);
    }

    @Test
    public void test18531() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18531");
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory0 = new fitnesse.testsystems.slim.tables.SlimTableFactory();
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory1 = slimTableFactory0.copy();
        java.util.Map<java.lang.String, java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable>> strMap2 = slimTableFactory1.tableTypes;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory3 = new fitnesse.testsystems.slim.tables.SlimTableFactory();
        java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable> wildcardClass5 = slimTableFactory3.getTableType("");
        boolean boolean7 = slimTableFactory3.hasColon("");
        java.util.Map<java.lang.String, java.lang.String> strMap8 = slimTableFactory3.tableTypeArrays;
        slimTableFactory1.tableTypeArrays = strMap8;
        java.lang.String str11 = slimTableFactory1.makeTableType("");
        java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable> wildcardClass13 = slimTableFactory1.getTableType("");
        java.lang.String str15 = slimTableFactory1.getFullTableName("hi!");
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory16 = slimTableFactory1.copy();
        boolean boolean18 = slimTableFactory1.hasColon("");
        boolean boolean20 = slimTableFactory1.hasColon("");
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory21 = slimTableFactory1.copy();
        java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable> wildcardClass23 = slimTableFactory1.getTableType("hi!");
        java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable> wildcardClass25 = slimTableFactory1.getTableType("");
        java.util.Map<java.lang.String, java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable>> strMap26 = slimTableFactory1.tableTypes;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory27 = slimTableFactory1.copy();
        org.junit.Assert.assertNotNull(slimTableFactory1);
        org.junit.Assert.assertNotNull(strMap2);
        org.junit.Assert.assertNull(wildcardClass5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(strMap8);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNull(wildcardClass13);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertNotNull(slimTableFactory16);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(slimTableFactory21);
        org.junit.Assert.assertNull(wildcardClass23);
        org.junit.Assert.assertNull(wildcardClass25);
        org.junit.Assert.assertNotNull(strMap26);
        org.junit.Assert.assertNotNull(slimTableFactory27);
    }

    @Test
    public void test18532() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18532");
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory0 = new fitnesse.testsystems.slim.tables.SlimTableFactory();
        java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable> wildcardClass2 = slimTableFactory0.getTableType("");
        boolean boolean4 = slimTableFactory0.hasColon("");
        java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable> wildcardClass6 = slimTableFactory0.getTableType("hi!");
        java.lang.String str8 = slimTableFactory0.getFullTableName("hi!");
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory9 = slimTableFactory0.copy();
        java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable> wildcardClass11 = slimTableFactory0.getTableType("");
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory12 = new fitnesse.testsystems.slim.tables.SlimTableFactory();
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory13 = slimTableFactory12.copy();
        boolean boolean15 = slimTableFactory13.hasColon("hi!");
        java.util.Map<java.lang.String, java.lang.String> strMap16 = slimTableFactory13.tableTypeArrays;
        java.lang.String str18 = slimTableFactory13.getFullTableName("");
        java.util.Map<java.lang.String, java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable>> strMap19 = slimTableFactory13.tableTypes;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory20 = new fitnesse.testsystems.slim.tables.SlimTableFactory();
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory21 = slimTableFactory20.copy();
        boolean boolean23 = slimTableFactory21.hasColon("hi!");
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory24 = slimTableFactory21.copy();
        java.util.Map<java.lang.String, java.lang.String> strMap25 = slimTableFactory21.tableTypeArrays;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory26 = new fitnesse.testsystems.slim.tables.SlimTableFactory();
        java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable> wildcardClass28 = slimTableFactory26.getTableType("");
        java.util.Map<java.lang.String, java.lang.String> strMap29 = slimTableFactory26.tableTypeArrays;
        java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable> wildcardClass31 = slimTableFactory26.getTableType("");
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory32 = new fitnesse.testsystems.slim.tables.SlimTableFactory();
        java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable> wildcardClass34 = slimTableFactory32.getTableType("");
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory35 = slimTableFactory32.copy();
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory36 = slimTableFactory35.copy();
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory37 = new fitnesse.testsystems.slim.tables.SlimTableFactory();
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory38 = slimTableFactory37.copy();
        java.util.Map<java.lang.String, java.lang.String> strMap39 = slimTableFactory37.tableTypeArrays;
        slimTableFactory35.tableTypeArrays = strMap39;
        slimTableFactory26.tableTypeArrays = strMap39;
        slimTableFactory21.tableTypeArrays = strMap39;
        slimTableFactory13.tableTypeArrays = strMap39;
        java.lang.String str45 = slimTableFactory13.getFullTableName("hi!");
        java.util.Map<java.lang.String, java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable>> strMap46 = slimTableFactory13.tableTypes;
        java.lang.String str48 = slimTableFactory13.makeTableType("");
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory49 = slimTableFactory13.copy();
        java.util.Map<java.lang.String, java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable>> strMap50 = slimTableFactory49.tableTypes;
        java.util.Map<java.lang.String, java.lang.String> strMap51 = slimTableFactory49.tableTypeArrays;
        slimTableFactory0.tableTypeArrays = strMap51;
        java.lang.String str54 = slimTableFactory0.getFullTableName("hi!");
        org.junit.Assert.assertNull(wildcardClass2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(wildcardClass6);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertNotNull(slimTableFactory9);
        org.junit.Assert.assertNull(wildcardClass11);
        org.junit.Assert.assertNotNull(slimTableFactory13);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(strMap16);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertNotNull(strMap19);
        org.junit.Assert.assertNotNull(slimTableFactory21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNotNull(slimTableFactory24);
        org.junit.Assert.assertNotNull(strMap25);
        org.junit.Assert.assertNull(wildcardClass28);
        org.junit.Assert.assertNotNull(strMap29);
        org.junit.Assert.assertNull(wildcardClass31);
        org.junit.Assert.assertNull(wildcardClass34);
        org.junit.Assert.assertNotNull(slimTableFactory35);
        org.junit.Assert.assertNotNull(slimTableFactory36);
        org.junit.Assert.assertNotNull(slimTableFactory38);
        org.junit.Assert.assertNotNull(strMap39);
        org.junit.Assert.assertEquals("'" + str45 + "' != '" + "hi!" + "'", str45, "hi!");
        org.junit.Assert.assertNotNull(strMap46);
        org.junit.Assert.assertEquals("'" + str48 + "' != '" + "" + "'", str48, "");
        org.junit.Assert.assertNotNull(slimTableFactory49);
        org.junit.Assert.assertNotNull(strMap50);
        org.junit.Assert.assertNotNull(strMap51);
        org.junit.Assert.assertEquals("'" + str54 + "' != '" + "hi!" + "'", str54, "hi!");
    }

    @Test
    public void test18533() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18533");
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory0 = new fitnesse.testsystems.slim.tables.SlimTableFactory();
        java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable> wildcardClass2 = slimTableFactory0.getTableType("");
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory3 = slimTableFactory0.copy();
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory4 = slimTableFactory3.copy();
        java.util.Map<java.lang.String, java.lang.String> strMap5 = slimTableFactory3.tableTypeArrays;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory6 = new fitnesse.testsystems.slim.tables.SlimTableFactory();
        java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable> wildcardClass8 = slimTableFactory6.getTableType("");
        java.util.Map<java.lang.String, java.lang.String> strMap9 = slimTableFactory6.tableTypeArrays;
        boolean boolean11 = slimTableFactory6.hasColon("");
        java.lang.String str13 = slimTableFactory6.makeTableType("");
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory14 = slimTableFactory6.copy();
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory15 = slimTableFactory14.copy();
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory16 = new fitnesse.testsystems.slim.tables.SlimTableFactory();
        java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable> wildcardClass18 = slimTableFactory16.getTableType("");
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory19 = slimTableFactory16.copy();
        java.util.Map<java.lang.String, java.lang.String> strMap20 = slimTableFactory19.tableTypeArrays;
        slimTableFactory14.tableTypeArrays = strMap20;
        slimTableFactory3.tableTypeArrays = strMap20;
        java.util.Map<java.lang.String, java.lang.String> strMap23 = slimTableFactory3.tableTypeArrays;
        java.lang.String str25 = slimTableFactory3.makeTableType("hi!");
        java.lang.String str27 = slimTableFactory3.makeTableType("");
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory28 = slimTableFactory3.copy();
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory29 = slimTableFactory3.copy();
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory30 = new fitnesse.testsystems.slim.tables.SlimTableFactory();
        java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable> wildcardClass32 = slimTableFactory30.getTableType("");
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory33 = slimTableFactory30.copy();
        boolean boolean35 = slimTableFactory30.hasColon("");
        java.util.Map<java.lang.String, java.lang.String> strMap36 = slimTableFactory30.tableTypeArrays;
        java.util.Map<java.lang.String, java.lang.String> strMap37 = slimTableFactory30.tableTypeArrays;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory38 = slimTableFactory30.copy();
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory39 = new fitnesse.testsystems.slim.tables.SlimTableFactory();
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory40 = slimTableFactory39.copy();
        java.util.Map<java.lang.String, java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable>> strMap41 = slimTableFactory40.tableTypes;
        boolean boolean43 = slimTableFactory40.hasColon("");
        boolean boolean45 = slimTableFactory40.hasColon("hi!");
        boolean boolean47 = slimTableFactory40.hasColon("");
        java.lang.String str49 = slimTableFactory40.makeTableType("");
        java.lang.String str51 = slimTableFactory40.makeTableType("");
        java.lang.String str53 = slimTableFactory40.makeTableType("hi!");
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory54 = slimTableFactory40.copy();
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory55 = slimTableFactory40.copy();
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory56 = new fitnesse.testsystems.slim.tables.SlimTableFactory();
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory57 = slimTableFactory56.copy();
        java.util.Map<java.lang.String, java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable>> strMap58 = slimTableFactory57.tableTypes;
        java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable> wildcardClass60 = slimTableFactory57.getTableType("hi!");
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory61 = new fitnesse.testsystems.slim.tables.SlimTableFactory();
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory62 = slimTableFactory61.copy();
        boolean boolean64 = slimTableFactory62.hasColon("hi!");
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory65 = slimTableFactory62.copy();
        java.util.Map<java.lang.String, java.lang.String> strMap66 = slimTableFactory62.tableTypeArrays;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory67 = new fitnesse.testsystems.slim.tables.SlimTableFactory();
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory68 = slimTableFactory67.copy();
        boolean boolean70 = slimTableFactory68.hasColon("hi!");
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory71 = slimTableFactory68.copy();
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory72 = slimTableFactory68.copy();
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory73 = slimTableFactory68.copy();
        java.util.Map<java.lang.String, java.lang.String> strMap74 = slimTableFactory73.tableTypeArrays;
        slimTableFactory62.tableTypeArrays = strMap74;
        slimTableFactory57.tableTypeArrays = strMap74;
        java.util.Map<java.lang.String, java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable>> strMap77 = slimTableFactory57.tableTypes;
        java.lang.String str79 = slimTableFactory57.getFullTableName("hi!");
        java.util.Map<java.lang.String, java.lang.String> strMap80 = slimTableFactory57.tableTypeArrays;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory81 = new fitnesse.testsystems.slim.tables.SlimTableFactory();
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory82 = slimTableFactory81.copy();
        java.util.Map<java.lang.String, java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable>> strMap83 = slimTableFactory82.tableTypes;
        boolean boolean85 = slimTableFactory82.hasColon("");
        boolean boolean87 = slimTableFactory82.hasColon("hi!");
        java.util.Map<java.lang.String, java.lang.String> strMap88 = slimTableFactory82.tableTypeArrays;
        java.util.Map<java.lang.String, java.lang.String> strMap89 = slimTableFactory82.tableTypeArrays;
        slimTableFactory57.tableTypeArrays = strMap89;
        slimTableFactory55.tableTypeArrays = strMap89;
        slimTableFactory38.tableTypeArrays = strMap89;
        slimTableFactory29.tableTypeArrays = strMap89;
        fitnesse.testsystems.slim.Table table94 = null;
        // The following exception was thrown during execution in test generation
        try {
            fitnesse.testsystems.slim.tables.SlimTable slimTable95 = slimTableFactory29.parseDefineTableTypeTable(table94);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(wildcardClass2);
        org.junit.Assert.assertNotNull(slimTableFactory3);
        org.junit.Assert.assertNotNull(slimTableFactory4);
        org.junit.Assert.assertNotNull(strMap5);
        org.junit.Assert.assertNull(wildcardClass8);
        org.junit.Assert.assertNotNull(strMap9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNotNull(slimTableFactory14);
        org.junit.Assert.assertNotNull(slimTableFactory15);
        org.junit.Assert.assertNull(wildcardClass18);
        org.junit.Assert.assertNotNull(slimTableFactory19);
        org.junit.Assert.assertNotNull(strMap20);
        org.junit.Assert.assertNotNull(strMap23);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "hi!" + "'", str25, "hi!");
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "" + "'", str27, "");
        org.junit.Assert.assertNotNull(slimTableFactory28);
        org.junit.Assert.assertNotNull(slimTableFactory29);
        org.junit.Assert.assertNull(wildcardClass32);
        org.junit.Assert.assertNotNull(slimTableFactory33);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertNotNull(strMap36);
        org.junit.Assert.assertNotNull(strMap37);
        org.junit.Assert.assertNotNull(slimTableFactory38);
        org.junit.Assert.assertNotNull(slimTableFactory40);
        org.junit.Assert.assertNotNull(strMap41);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertEquals("'" + str49 + "' != '" + "" + "'", str49, "");
        org.junit.Assert.assertEquals("'" + str51 + "' != '" + "" + "'", str51, "");
        org.junit.Assert.assertEquals("'" + str53 + "' != '" + "hi!" + "'", str53, "hi!");
        org.junit.Assert.assertNotNull(slimTableFactory54);
        org.junit.Assert.assertNotNull(slimTableFactory55);
        org.junit.Assert.assertNotNull(slimTableFactory57);
        org.junit.Assert.assertNotNull(strMap58);
        org.junit.Assert.assertNull(wildcardClass60);
        org.junit.Assert.assertNotNull(slimTableFactory62);
        org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + false + "'", boolean64 == false);
        org.junit.Assert.assertNotNull(slimTableFactory65);
        org.junit.Assert.assertNotNull(strMap66);
        org.junit.Assert.assertNotNull(slimTableFactory68);
        org.junit.Assert.assertTrue("'" + boolean70 + "' != '" + false + "'", boolean70 == false);
        org.junit.Assert.assertNotNull(slimTableFactory71);
        org.junit.Assert.assertNotNull(slimTableFactory72);
        org.junit.Assert.assertNotNull(slimTableFactory73);
        org.junit.Assert.assertNotNull(strMap74);
        org.junit.Assert.assertNotNull(strMap77);
        org.junit.Assert.assertEquals("'" + str79 + "' != '" + "hi!" + "'", str79, "hi!");
        org.junit.Assert.assertNotNull(strMap80);
        org.junit.Assert.assertNotNull(slimTableFactory82);
        org.junit.Assert.assertNotNull(strMap83);
        org.junit.Assert.assertTrue("'" + boolean85 + "' != '" + false + "'", boolean85 == false);
        org.junit.Assert.assertTrue("'" + boolean87 + "' != '" + false + "'", boolean87 == false);
        org.junit.Assert.assertNotNull(strMap88);
        org.junit.Assert.assertNotNull(strMap89);
    }

    @Test
    public void test18534() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18534");
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory0 = new fitnesse.testsystems.slim.tables.SlimTableFactory();
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory1 = slimTableFactory0.copy();
        java.util.Map<java.lang.String, java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable>> strMap2 = slimTableFactory1.tableTypes;
        boolean boolean4 = slimTableFactory1.hasColon("");
        boolean boolean6 = slimTableFactory1.hasColon("hi!");
        boolean boolean8 = slimTableFactory1.hasColon("");
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory9 = slimTableFactory1.copy();
        java.util.Map<java.lang.String, java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable>> strMap10 = slimTableFactory9.tableTypes;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory11 = slimTableFactory9.copy();
        java.util.Map<java.lang.String, java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable>> strMap12 = slimTableFactory11.tableTypes;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory13 = slimTableFactory11.copy();
        java.lang.String str15 = slimTableFactory11.makeTableType("");
        java.lang.String str17 = slimTableFactory11.getFullTableName("hi!");
        java.lang.String str19 = slimTableFactory11.makeTableType("hi!");
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory20 = slimTableFactory11.copy();
        java.lang.String str22 = slimTableFactory20.makeTableType("hi!");
        org.junit.Assert.assertNotNull(slimTableFactory1);
        org.junit.Assert.assertNotNull(strMap2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(slimTableFactory9);
        org.junit.Assert.assertNotNull(strMap10);
        org.junit.Assert.assertNotNull(slimTableFactory11);
        org.junit.Assert.assertNotNull(strMap12);
        org.junit.Assert.assertNotNull(slimTableFactory13);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "hi!" + "'", str19, "hi!");
        org.junit.Assert.assertNotNull(slimTableFactory20);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "hi!" + "'", str22, "hi!");
    }

    @Test
    public void test18535() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18535");
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory0 = new fitnesse.testsystems.slim.tables.SlimTableFactory();
        java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable> wildcardClass2 = slimTableFactory0.getTableType("");
        java.util.Map<java.lang.String, java.lang.String> strMap3 = slimTableFactory0.tableTypeArrays;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory4 = slimTableFactory0.copy();
        boolean boolean6 = slimTableFactory4.hasColon("");
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory7 = new fitnesse.testsystems.slim.tables.SlimTableFactory();
        java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable> wildcardClass9 = slimTableFactory7.getTableType("");
        java.util.Map<java.lang.String, java.lang.String> strMap10 = slimTableFactory7.tableTypeArrays;
        boolean boolean12 = slimTableFactory7.hasColon("");
        java.lang.String str14 = slimTableFactory7.makeTableType("");
        java.util.Map<java.lang.String, java.lang.String> strMap15 = slimTableFactory7.tableTypeArrays;
        slimTableFactory4.tableTypeArrays = strMap15;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory17 = new fitnesse.testsystems.slim.tables.SlimTableFactory();
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory18 = slimTableFactory17.copy();
        boolean boolean20 = slimTableFactory18.hasColon("hi!");
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory21 = slimTableFactory18.copy();
        java.util.Map<java.lang.String, java.lang.String> strMap22 = slimTableFactory18.tableTypeArrays;
        java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable> wildcardClass24 = slimTableFactory18.getTableType("");
        java.util.Map<java.lang.String, java.lang.String> strMap25 = slimTableFactory18.tableTypeArrays;
        slimTableFactory4.tableTypeArrays = strMap25;
        java.util.Map<java.lang.String, java.lang.String> strMap27 = slimTableFactory4.tableTypeArrays;
        java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable> wildcardClass29 = slimTableFactory4.getTableType("hi!");
        boolean boolean31 = slimTableFactory4.hasColon("");
        java.lang.String str33 = slimTableFactory4.makeTableType("");
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory34 = new fitnesse.testsystems.slim.tables.SlimTableFactory();
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory35 = slimTableFactory34.copy();
        boolean boolean37 = slimTableFactory35.hasColon("hi!");
        java.util.Map<java.lang.String, java.lang.String> strMap38 = slimTableFactory35.tableTypeArrays;
        java.lang.String str40 = slimTableFactory35.getFullTableName("");
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory41 = new fitnesse.testsystems.slim.tables.SlimTableFactory();
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory42 = slimTableFactory41.copy();
        boolean boolean44 = slimTableFactory42.hasColon("hi!");
        java.util.Map<java.lang.String, java.lang.String> strMap45 = slimTableFactory42.tableTypeArrays;
        java.lang.String str47 = slimTableFactory42.getFullTableName("");
        java.util.Map<java.lang.String, java.lang.String> strMap48 = slimTableFactory42.tableTypeArrays;
        slimTableFactory35.tableTypeArrays = strMap48;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory50 = slimTableFactory35.copy();
        java.util.Map<java.lang.String, java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable>> strMap51 = slimTableFactory35.tableTypes;
        java.lang.String str53 = slimTableFactory35.makeTableType("");
        java.util.Map<java.lang.String, java.lang.String> strMap54 = slimTableFactory35.tableTypeArrays;
        java.util.Map<java.lang.String, java.lang.String> strMap55 = slimTableFactory35.tableTypeArrays;
        java.util.Map<java.lang.String, java.lang.String> strMap56 = slimTableFactory35.tableTypeArrays;
        slimTableFactory4.tableTypeArrays = strMap56;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory58 = new fitnesse.testsystems.slim.tables.SlimTableFactory();
        java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable> wildcardClass60 = slimTableFactory58.getTableType("");
        boolean boolean62 = slimTableFactory58.hasColon("");
        java.lang.String str64 = slimTableFactory58.makeTableType("hi!");
        java.util.Map<java.lang.String, java.lang.String> strMap65 = slimTableFactory58.tableTypeArrays;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory66 = new fitnesse.testsystems.slim.tables.SlimTableFactory();
        java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable> wildcardClass68 = slimTableFactory66.getTableType("");
        java.util.Map<java.lang.String, java.lang.String> strMap69 = slimTableFactory66.tableTypeArrays;
        boolean boolean71 = slimTableFactory66.hasColon("");
        java.lang.String str73 = slimTableFactory66.makeTableType("");
        java.util.Map<java.lang.String, java.lang.String> strMap74 = slimTableFactory66.tableTypeArrays;
        slimTableFactory58.tableTypeArrays = strMap74;
        java.lang.String str77 = slimTableFactory58.makeTableType("hi!");
        java.util.Map<java.lang.String, java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable>> strMap78 = slimTableFactory58.tableTypes;
        java.lang.String str80 = slimTableFactory58.makeTableType("hi!");
        java.util.Map<java.lang.String, java.lang.String> strMap81 = slimTableFactory58.tableTypeArrays;
        slimTableFactory4.tableTypeArrays = strMap81;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory83 = slimTableFactory4.copy();
        java.lang.Class<?> wildcardClass84 = slimTableFactory4.getClass();
        org.junit.Assert.assertNull(wildcardClass2);
        org.junit.Assert.assertNotNull(strMap3);
        org.junit.Assert.assertNotNull(slimTableFactory4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(wildcardClass9);
        org.junit.Assert.assertNotNull(strMap10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertNotNull(strMap15);
        org.junit.Assert.assertNotNull(slimTableFactory18);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(slimTableFactory21);
        org.junit.Assert.assertNotNull(strMap22);
        org.junit.Assert.assertNull(wildcardClass24);
        org.junit.Assert.assertNotNull(strMap25);
        org.junit.Assert.assertNotNull(strMap27);
        org.junit.Assert.assertNull(wildcardClass29);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "" + "'", str33, "");
        org.junit.Assert.assertNotNull(slimTableFactory35);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertNotNull(strMap38);
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "" + "'", str40, "");
        org.junit.Assert.assertNotNull(slimTableFactory42);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertNotNull(strMap45);
        org.junit.Assert.assertEquals("'" + str47 + "' != '" + "" + "'", str47, "");
        org.junit.Assert.assertNotNull(strMap48);
        org.junit.Assert.assertNotNull(slimTableFactory50);
        org.junit.Assert.assertNotNull(strMap51);
        org.junit.Assert.assertEquals("'" + str53 + "' != '" + "" + "'", str53, "");
        org.junit.Assert.assertNotNull(strMap54);
        org.junit.Assert.assertNotNull(strMap55);
        org.junit.Assert.assertNotNull(strMap56);
        org.junit.Assert.assertNull(wildcardClass60);
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + false + "'", boolean62 == false);
        org.junit.Assert.assertEquals("'" + str64 + "' != '" + "hi!" + "'", str64, "hi!");
        org.junit.Assert.assertNotNull(strMap65);
        org.junit.Assert.assertNull(wildcardClass68);
        org.junit.Assert.assertNotNull(strMap69);
        org.junit.Assert.assertTrue("'" + boolean71 + "' != '" + false + "'", boolean71 == false);
        org.junit.Assert.assertEquals("'" + str73 + "' != '" + "" + "'", str73, "");
        org.junit.Assert.assertNotNull(strMap74);
        org.junit.Assert.assertEquals("'" + str77 + "' != '" + "hi!" + "'", str77, "hi!");
        org.junit.Assert.assertNotNull(strMap78);
        org.junit.Assert.assertEquals("'" + str80 + "' != '" + "hi!" + "'", str80, "hi!");
        org.junit.Assert.assertNotNull(strMap81);
        org.junit.Assert.assertNotNull(slimTableFactory83);
        org.junit.Assert.assertNotNull(wildcardClass84);
    }

    @Test
    public void test18536() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18536");
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory0 = new fitnesse.testsystems.slim.tables.SlimTableFactory();
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory1 = slimTableFactory0.copy();
        java.util.Map<java.lang.String, java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable>> strMap2 = slimTableFactory1.tableTypes;
        boolean boolean4 = slimTableFactory1.hasColon("");
        java.util.Map<java.lang.String, java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable>> strMap5 = slimTableFactory1.tableTypes;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory6 = slimTableFactory1.copy();
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory7 = slimTableFactory6.copy();
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory8 = slimTableFactory7.copy();
        java.util.Map<java.lang.String, java.lang.String> strMap9 = slimTableFactory7.tableTypeArrays;
        java.lang.String str11 = slimTableFactory7.makeTableType("hi!");
        java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable> wildcardClass13 = slimTableFactory7.getTableType("");
        boolean boolean15 = slimTableFactory7.hasColon("hi!");
        java.util.Map<java.lang.String, java.lang.String> strMap16 = slimTableFactory7.tableTypeArrays;
        fitnesse.testsystems.slim.Table table17 = null;
        // The following exception was thrown during execution in test generation
        try {
            slimTableFactory7.parseDefineTableTypeRow(table17, (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(slimTableFactory1);
        org.junit.Assert.assertNotNull(strMap2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(strMap5);
        org.junit.Assert.assertNotNull(slimTableFactory6);
        org.junit.Assert.assertNotNull(slimTableFactory7);
        org.junit.Assert.assertNotNull(slimTableFactory8);
        org.junit.Assert.assertNotNull(strMap9);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertNull(wildcardClass13);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(strMap16);
    }

    @Test
    public void test18537() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18537");
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory0 = new fitnesse.testsystems.slim.tables.SlimTableFactory();
        java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable> wildcardClass2 = slimTableFactory0.getTableType("");
        java.util.Map<java.lang.String, java.lang.String> strMap3 = slimTableFactory0.tableTypeArrays;
        boolean boolean5 = slimTableFactory0.hasColon("");
        java.lang.String str7 = slimTableFactory0.makeTableType("");
        java.lang.String str9 = slimTableFactory0.makeTableType("");
        java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable> wildcardClass11 = slimTableFactory0.getTableType("hi!");
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory12 = slimTableFactory0.copy();
        java.lang.String str14 = slimTableFactory12.getFullTableName("");
        java.util.Map<java.lang.String, java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable>> strMap15 = slimTableFactory12.tableTypes;
        org.junit.Assert.assertNull(wildcardClass2);
        org.junit.Assert.assertNotNull(strMap3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNull(wildcardClass11);
        org.junit.Assert.assertNotNull(slimTableFactory12);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertNotNull(strMap15);
    }

    @Test
    public void test18538() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18538");
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory0 = new fitnesse.testsystems.slim.tables.SlimTableFactory();
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory1 = slimTableFactory0.copy();
        boolean boolean3 = slimTableFactory1.hasColon("hi!");
        java.util.Map<java.lang.String, java.lang.String> strMap4 = slimTableFactory1.tableTypeArrays;
        java.lang.String str6 = slimTableFactory1.getFullTableName("");
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory7 = new fitnesse.testsystems.slim.tables.SlimTableFactory();
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory8 = slimTableFactory7.copy();
        boolean boolean10 = slimTableFactory8.hasColon("hi!");
        java.util.Map<java.lang.String, java.lang.String> strMap11 = slimTableFactory8.tableTypeArrays;
        java.lang.String str13 = slimTableFactory8.getFullTableName("");
        java.util.Map<java.lang.String, java.lang.String> strMap14 = slimTableFactory8.tableTypeArrays;
        slimTableFactory1.tableTypeArrays = strMap14;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory16 = slimTableFactory1.copy();
        java.util.Map<java.lang.String, java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable>> strMap17 = slimTableFactory1.tableTypes;
        boolean boolean19 = slimTableFactory1.hasColon("");
        boolean boolean21 = slimTableFactory1.hasColon("");
        java.util.Map<java.lang.String, java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable>> strMap22 = slimTableFactory1.tableTypes;
        fitnesse.testsystems.slim.Table table23 = null;
        // The following exception was thrown during execution in test generation
        try {
            fitnesse.testsystems.slim.tables.SlimTable slimTable24 = slimTableFactory1.parseDefineTableTypeTable(table23);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(slimTableFactory1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(strMap4);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(slimTableFactory8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(strMap11);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNotNull(strMap14);
        org.junit.Assert.assertNotNull(slimTableFactory16);
        org.junit.Assert.assertNotNull(strMap17);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(strMap22);
    }

    @Test
    public void test18539() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18539");
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory0 = new fitnesse.testsystems.slim.tables.SlimTableFactory();
        java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable> wildcardClass2 = slimTableFactory0.getTableType("");
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory3 = slimTableFactory0.copy();
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory4 = new fitnesse.testsystems.slim.tables.SlimTableFactory();
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory5 = slimTableFactory4.copy();
        java.util.Map<java.lang.String, java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable>> strMap6 = slimTableFactory5.tableTypes;
        boolean boolean8 = slimTableFactory5.hasColon("");
        boolean boolean10 = slimTableFactory5.hasColon("hi!");
        java.util.Map<java.lang.String, java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable>> strMap11 = slimTableFactory5.tableTypes;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory12 = new fitnesse.testsystems.slim.tables.SlimTableFactory();
        java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable> wildcardClass14 = slimTableFactory12.getTableType("");
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory15 = slimTableFactory12.copy();
        java.util.Map<java.lang.String, java.lang.String> strMap16 = slimTableFactory15.tableTypeArrays;
        slimTableFactory5.tableTypeArrays = strMap16;
        slimTableFactory0.tableTypeArrays = strMap16;
        boolean boolean20 = slimTableFactory0.hasColon("hi!");
        boolean boolean22 = slimTableFactory0.hasColon("hi!");
        boolean boolean24 = slimTableFactory0.hasColon("");
        org.junit.Assert.assertNull(wildcardClass2);
        org.junit.Assert.assertNotNull(slimTableFactory3);
        org.junit.Assert.assertNotNull(slimTableFactory5);
        org.junit.Assert.assertNotNull(strMap6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(strMap11);
        org.junit.Assert.assertNull(wildcardClass14);
        org.junit.Assert.assertNotNull(slimTableFactory15);
        org.junit.Assert.assertNotNull(strMap16);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
    }

    @Test
    public void test18540() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18540");
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory0 = new fitnesse.testsystems.slim.tables.SlimTableFactory();
        java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable> wildcardClass2 = slimTableFactory0.getTableType("");
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory3 = slimTableFactory0.copy();
        boolean boolean5 = slimTableFactory0.hasColon("hi!");
        java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable> wildcardClass7 = slimTableFactory0.getTableType("hi!");
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory8 = new fitnesse.testsystems.slim.tables.SlimTableFactory();
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory9 = slimTableFactory8.copy();
        java.util.Map<java.lang.String, java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable>> strMap10 = slimTableFactory9.tableTypes;
        boolean boolean12 = slimTableFactory9.hasColon("");
        java.util.Map<java.lang.String, java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable>> strMap13 = slimTableFactory9.tableTypes;
        java.util.Map<java.lang.String, java.lang.String> strMap14 = slimTableFactory9.tableTypeArrays;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory15 = new fitnesse.testsystems.slim.tables.SlimTableFactory();
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory16 = slimTableFactory15.copy();
        java.util.Map<java.lang.String, java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable>> strMap17 = slimTableFactory16.tableTypes;
        boolean boolean19 = slimTableFactory16.hasColon("");
        boolean boolean21 = slimTableFactory16.hasColon("hi!");
        java.util.Map<java.lang.String, java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable>> strMap22 = slimTableFactory16.tableTypes;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory23 = new fitnesse.testsystems.slim.tables.SlimTableFactory();
        java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable> wildcardClass25 = slimTableFactory23.getTableType("");
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory26 = slimTableFactory23.copy();
        java.util.Map<java.lang.String, java.lang.String> strMap27 = slimTableFactory26.tableTypeArrays;
        slimTableFactory16.tableTypeArrays = strMap27;
        slimTableFactory9.tableTypeArrays = strMap27;
        slimTableFactory0.tableTypeArrays = strMap27;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory31 = slimTableFactory0.copy();
        java.lang.String str33 = slimTableFactory31.makeTableType("hi!");
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory34 = new fitnesse.testsystems.slim.tables.SlimTableFactory();
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory35 = slimTableFactory34.copy();
        boolean boolean37 = slimTableFactory35.hasColon("hi!");
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory38 = slimTableFactory35.copy();
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory39 = slimTableFactory35.copy();
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory40 = slimTableFactory35.copy();
        boolean boolean42 = slimTableFactory40.hasColon("hi!");
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory43 = slimTableFactory40.copy();
        java.util.Map<java.lang.String, java.lang.String> strMap44 = slimTableFactory43.tableTypeArrays;
        slimTableFactory31.tableTypeArrays = strMap44;
        java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable> wildcardClass47 = slimTableFactory31.getTableType("hi!");
        java.lang.String str49 = slimTableFactory31.makeTableType("hi!");
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory50 = slimTableFactory31.copy();
        java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable> wildcardClass52 = slimTableFactory31.getTableType("hi!");
        boolean boolean54 = slimTableFactory31.hasColon("");
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory55 = slimTableFactory31.copy();
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory56 = slimTableFactory31.copy();
        java.util.Map<java.lang.String, java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable>> strMap57 = slimTableFactory31.tableTypes;
        java.lang.String str59 = slimTableFactory31.makeTableType("");
        java.lang.Class<?> wildcardClass60 = slimTableFactory31.getClass();
        org.junit.Assert.assertNull(wildcardClass2);
        org.junit.Assert.assertNotNull(slimTableFactory3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(wildcardClass7);
        org.junit.Assert.assertNotNull(slimTableFactory9);
        org.junit.Assert.assertNotNull(strMap10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(strMap13);
        org.junit.Assert.assertNotNull(strMap14);
        org.junit.Assert.assertNotNull(slimTableFactory16);
        org.junit.Assert.assertNotNull(strMap17);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(strMap22);
        org.junit.Assert.assertNull(wildcardClass25);
        org.junit.Assert.assertNotNull(slimTableFactory26);
        org.junit.Assert.assertNotNull(strMap27);
        org.junit.Assert.assertNotNull(slimTableFactory31);
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "hi!" + "'", str33, "hi!");
        org.junit.Assert.assertNotNull(slimTableFactory35);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertNotNull(slimTableFactory38);
        org.junit.Assert.assertNotNull(slimTableFactory39);
        org.junit.Assert.assertNotNull(slimTableFactory40);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertNotNull(slimTableFactory43);
        org.junit.Assert.assertNotNull(strMap44);
        org.junit.Assert.assertNull(wildcardClass47);
        org.junit.Assert.assertEquals("'" + str49 + "' != '" + "hi!" + "'", str49, "hi!");
        org.junit.Assert.assertNotNull(slimTableFactory50);
        org.junit.Assert.assertNull(wildcardClass52);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + false + "'", boolean54 == false);
        org.junit.Assert.assertNotNull(slimTableFactory55);
        org.junit.Assert.assertNotNull(slimTableFactory56);
        org.junit.Assert.assertNotNull(strMap57);
        org.junit.Assert.assertEquals("'" + str59 + "' != '" + "" + "'", str59, "");
        org.junit.Assert.assertNotNull(wildcardClass60);
    }

    @Test
    public void test18541() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18541");
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory0 = new fitnesse.testsystems.slim.tables.SlimTableFactory();
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory1 = slimTableFactory0.copy();
        java.util.Map<java.lang.String, java.lang.String> strMap2 = null;
        slimTableFactory0.tableTypeArrays = strMap2;
        java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable> wildcardClass5 = slimTableFactory0.getTableType("hi!");
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory6 = new fitnesse.testsystems.slim.tables.SlimTableFactory();
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory7 = slimTableFactory6.copy();
        boolean boolean9 = slimTableFactory7.hasColon("hi!");
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory10 = slimTableFactory7.copy();
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory11 = slimTableFactory7.copy();
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory12 = new fitnesse.testsystems.slim.tables.SlimTableFactory();
        java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable> wildcardClass14 = slimTableFactory12.getTableType("");
        boolean boolean16 = slimTableFactory12.hasColon("");
        java.util.Map<java.lang.String, java.lang.String> strMap17 = slimTableFactory12.tableTypeArrays;
        slimTableFactory11.tableTypeArrays = strMap17;
        slimTableFactory0.tableTypeArrays = strMap17;
        boolean boolean21 = slimTableFactory0.hasColon("");
        java.util.Map<java.lang.String, java.lang.String> strMap22 = slimTableFactory0.tableTypeArrays;
        java.lang.String str24 = slimTableFactory0.makeTableType("");
        org.junit.Assert.assertNotNull(slimTableFactory1);
        org.junit.Assert.assertNull(wildcardClass5);
        org.junit.Assert.assertNotNull(slimTableFactory7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(slimTableFactory10);
        org.junit.Assert.assertNotNull(slimTableFactory11);
        org.junit.Assert.assertNull(wildcardClass14);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(strMap17);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(strMap22);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "" + "'", str24, "");
    }

    @Test
    public void test18542() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18542");
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory0 = new fitnesse.testsystems.slim.tables.SlimTableFactory();
        java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable> wildcardClass2 = slimTableFactory0.getTableType("");
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory3 = slimTableFactory0.copy();
        java.lang.String str5 = slimTableFactory3.getFullTableName("");
        java.util.Map<java.lang.String, java.lang.String> strMap6 = slimTableFactory3.tableTypeArrays;
        boolean boolean8 = slimTableFactory3.hasColon("hi!");
        java.lang.String str10 = slimTableFactory3.makeTableType("hi!");
        java.lang.String str12 = slimTableFactory3.getFullTableName("hi!");
        org.junit.Assert.assertNull(wildcardClass2);
        org.junit.Assert.assertNotNull(slimTableFactory3);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(strMap6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
    }

    @Test
    public void test18543() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18543");
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory0 = new fitnesse.testsystems.slim.tables.SlimTableFactory();
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory1 = slimTableFactory0.copy();
        boolean boolean3 = slimTableFactory1.hasColon("hi!");
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory4 = slimTableFactory1.copy();
        java.util.Map<java.lang.String, java.lang.String> strMap5 = slimTableFactory1.tableTypeArrays;
        java.lang.String str7 = slimTableFactory1.getFullTableName("hi!");
        java.util.Map<java.lang.String, java.lang.String> strMap8 = slimTableFactory1.tableTypeArrays;
        java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable> wildcardClass10 = slimTableFactory1.getTableType("");
        boolean boolean12 = slimTableFactory1.hasColon("hi!");
        java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable> wildcardClass14 = slimTableFactory1.getTableType("");
        java.util.Map<java.lang.String, java.lang.String> strMap15 = slimTableFactory1.tableTypeArrays;
        fitnesse.testsystems.slim.Table table16 = null;
        // The following exception was thrown during execution in test generation
        try {
            fitnesse.testsystems.slim.tables.SlimTable slimTable17 = slimTableFactory1.parseDefineTableTypeTable(table16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(slimTableFactory1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(slimTableFactory4);
        org.junit.Assert.assertNotNull(strMap5);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertNotNull(strMap8);
        org.junit.Assert.assertNull(wildcardClass10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNull(wildcardClass14);
        org.junit.Assert.assertNotNull(strMap15);
    }

    @Test
    public void test18544() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18544");
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory0 = new fitnesse.testsystems.slim.tables.SlimTableFactory();
        java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable> wildcardClass2 = slimTableFactory0.getTableType("");
        java.util.Map<java.lang.String, java.lang.String> strMap3 = slimTableFactory0.tableTypeArrays;
        boolean boolean5 = slimTableFactory0.hasColon("");
        java.lang.String str7 = slimTableFactory0.makeTableType("");
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory8 = slimTableFactory0.copy();
        java.util.Map<java.lang.String, java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable>> strMap9 = slimTableFactory0.tableTypes;
        java.util.Map<java.lang.String, java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable>> strMap10 = slimTableFactory0.tableTypes;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory11 = slimTableFactory0.copy();
        java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable> wildcardClass13 = slimTableFactory0.getTableType("hi!");
        java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable> wildcardClass15 = slimTableFactory0.getTableType("hi!");
        org.junit.Assert.assertNull(wildcardClass2);
        org.junit.Assert.assertNotNull(strMap3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNotNull(slimTableFactory8);
        org.junit.Assert.assertNotNull(strMap9);
        org.junit.Assert.assertNotNull(strMap10);
        org.junit.Assert.assertNotNull(slimTableFactory11);
        org.junit.Assert.assertNull(wildcardClass13);
        org.junit.Assert.assertNull(wildcardClass15);
    }

    @Test
    public void test18545() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18545");
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory0 = new fitnesse.testsystems.slim.tables.SlimTableFactory();
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory1 = slimTableFactory0.copy();
        java.util.Map<java.lang.String, java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable>> strMap2 = slimTableFactory1.tableTypes;
        boolean boolean4 = slimTableFactory1.hasColon("");
        java.util.Map<java.lang.String, java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable>> strMap5 = slimTableFactory1.tableTypes;
        java.util.Map<java.lang.String, java.lang.String> strMap6 = slimTableFactory1.tableTypeArrays;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory7 = new fitnesse.testsystems.slim.tables.SlimTableFactory();
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory8 = slimTableFactory7.copy();
        java.util.Map<java.lang.String, java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable>> strMap9 = slimTableFactory8.tableTypes;
        boolean boolean11 = slimTableFactory8.hasColon("");
        boolean boolean13 = slimTableFactory8.hasColon("hi!");
        java.util.Map<java.lang.String, java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable>> strMap14 = slimTableFactory8.tableTypes;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory15 = new fitnesse.testsystems.slim.tables.SlimTableFactory();
        java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable> wildcardClass17 = slimTableFactory15.getTableType("");
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory18 = slimTableFactory15.copy();
        java.util.Map<java.lang.String, java.lang.String> strMap19 = slimTableFactory18.tableTypeArrays;
        slimTableFactory8.tableTypeArrays = strMap19;
        slimTableFactory1.tableTypeArrays = strMap19;
        java.util.Map<java.lang.String, java.lang.String> strMap22 = slimTableFactory1.tableTypeArrays;
        java.lang.String str24 = slimTableFactory1.getFullTableName("hi!");
        fitnesse.testsystems.slim.Table table25 = null;
        // The following exception was thrown during execution in test generation
        try {
            slimTableFactory1.parseDefineTableTypeRow(table25, 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(slimTableFactory1);
        org.junit.Assert.assertNotNull(strMap2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(strMap5);
        org.junit.Assert.assertNotNull(strMap6);
        org.junit.Assert.assertNotNull(slimTableFactory8);
        org.junit.Assert.assertNotNull(strMap9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(strMap14);
        org.junit.Assert.assertNull(wildcardClass17);
        org.junit.Assert.assertNotNull(slimTableFactory18);
        org.junit.Assert.assertNotNull(strMap19);
        org.junit.Assert.assertNotNull(strMap22);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "hi!" + "'", str24, "hi!");
    }

    @Test
    public void test18546() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18546");
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory0 = new fitnesse.testsystems.slim.tables.SlimTableFactory();
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory1 = slimTableFactory0.copy();
        java.lang.String str3 = slimTableFactory0.getFullTableName("hi!");
        java.lang.String str5 = slimTableFactory0.makeTableType("");
        java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable> wildcardClass7 = slimTableFactory0.getTableType("hi!");
        java.lang.String str9 = slimTableFactory0.getFullTableName("hi!");
        boolean boolean11 = slimTableFactory0.hasColon("");
        java.lang.String str13 = slimTableFactory0.getFullTableName("hi!");
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory14 = slimTableFactory0.copy();
        java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable> wildcardClass16 = slimTableFactory0.getTableType("");
        org.junit.Assert.assertNotNull(slimTableFactory1);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNull(wildcardClass7);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertNotNull(slimTableFactory14);
        org.junit.Assert.assertNull(wildcardClass16);
    }

    @Test
    public void test18547() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18547");
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory0 = new fitnesse.testsystems.slim.tables.SlimTableFactory();
        java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable> wildcardClass2 = slimTableFactory0.getTableType("");
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory3 = slimTableFactory0.copy();
        boolean boolean5 = slimTableFactory0.hasColon("hi!");
        java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable> wildcardClass7 = slimTableFactory0.getTableType("hi!");
        java.lang.String str9 = slimTableFactory0.getFullTableName("");
        java.lang.String str11 = slimTableFactory0.makeTableType("");
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory12 = new fitnesse.testsystems.slim.tables.SlimTableFactory();
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory13 = slimTableFactory12.copy();
        boolean boolean15 = slimTableFactory13.hasColon("hi!");
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory16 = slimTableFactory13.copy();
        java.util.Map<java.lang.String, java.lang.String> strMap17 = slimTableFactory13.tableTypeArrays;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory18 = new fitnesse.testsystems.slim.tables.SlimTableFactory();
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory19 = slimTableFactory18.copy();
        boolean boolean21 = slimTableFactory19.hasColon("hi!");
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory22 = slimTableFactory19.copy();
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory23 = slimTableFactory19.copy();
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory24 = slimTableFactory19.copy();
        java.util.Map<java.lang.String, java.lang.String> strMap25 = slimTableFactory24.tableTypeArrays;
        slimTableFactory13.tableTypeArrays = strMap25;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory27 = new fitnesse.testsystems.slim.tables.SlimTableFactory();
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory28 = new fitnesse.testsystems.slim.tables.SlimTableFactory();
        java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable> wildcardClass30 = slimTableFactory28.getTableType("");
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory31 = slimTableFactory28.copy();
        boolean boolean33 = slimTableFactory28.hasColon("");
        java.util.Map<java.lang.String, java.lang.String> strMap34 = slimTableFactory28.tableTypeArrays;
        slimTableFactory27.tableTypeArrays = strMap34;
        slimTableFactory13.tableTypeArrays = strMap34;
        slimTableFactory0.tableTypeArrays = strMap34;
        java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable> wildcardClass39 = slimTableFactory0.getTableType("hi!");
        java.lang.String str41 = slimTableFactory0.makeTableType("");
        boolean boolean43 = slimTableFactory0.hasColon("hi!");
        java.util.Map<java.lang.String, java.lang.String> strMap44 = slimTableFactory0.tableTypeArrays;
        fitnesse.testsystems.slim.Table table45 = null;
        fitnesse.testsystems.slim.SlimTestContext slimTestContext47 = null;
        // The following exception was thrown during execution in test generation
        try {
            fitnesse.testsystems.slim.tables.SlimTable slimTable48 = slimTableFactory0.makeSlimTable(table45, "", slimTestContext47);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(wildcardClass2);
        org.junit.Assert.assertNotNull(slimTableFactory3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(wildcardClass7);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNotNull(slimTableFactory13);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(slimTableFactory16);
        org.junit.Assert.assertNotNull(strMap17);
        org.junit.Assert.assertNotNull(slimTableFactory19);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(slimTableFactory22);
        org.junit.Assert.assertNotNull(slimTableFactory23);
        org.junit.Assert.assertNotNull(slimTableFactory24);
        org.junit.Assert.assertNotNull(strMap25);
        org.junit.Assert.assertNull(wildcardClass30);
        org.junit.Assert.assertNotNull(slimTableFactory31);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertNotNull(strMap34);
        org.junit.Assert.assertNull(wildcardClass39);
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "" + "'", str41, "");
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertNotNull(strMap44);
    }

    @Test
    public void test18548() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18548");
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory0 = new fitnesse.testsystems.slim.tables.SlimTableFactory();
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory1 = slimTableFactory0.copy();
        java.util.Map<java.lang.String, java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable>> strMap2 = slimTableFactory1.tableTypes;
        boolean boolean4 = slimTableFactory1.hasColon("");
        boolean boolean6 = slimTableFactory1.hasColon("hi!");
        java.util.Map<java.lang.String, java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable>> strMap7 = slimTableFactory1.tableTypes;
        java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable> wildcardClass9 = slimTableFactory1.getTableType("");
        java.util.Map<java.lang.String, java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable>> strMap10 = slimTableFactory1.tableTypes;
        java.lang.String str12 = slimTableFactory1.makeTableType("hi!");
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory13 = new fitnesse.testsystems.slim.tables.SlimTableFactory();
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory14 = slimTableFactory13.copy();
        boolean boolean16 = slimTableFactory14.hasColon("hi!");
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory17 = slimTableFactory14.copy();
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory18 = slimTableFactory14.copy();
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory19 = slimTableFactory14.copy();
        java.util.Map<java.lang.String, java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable>> strMap20 = slimTableFactory14.tableTypes;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory21 = slimTableFactory14.copy();
        java.util.Map<java.lang.String, java.lang.String> strMap22 = slimTableFactory21.tableTypeArrays;
        slimTableFactory1.tableTypeArrays = strMap22;
        java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable> wildcardClass25 = slimTableFactory1.getTableType("");
        java.lang.String str27 = slimTableFactory1.makeTableType("");
        org.junit.Assert.assertNotNull(slimTableFactory1);
        org.junit.Assert.assertNotNull(strMap2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(strMap7);
        org.junit.Assert.assertNull(wildcardClass9);
        org.junit.Assert.assertNotNull(strMap10);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertNotNull(slimTableFactory14);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(slimTableFactory17);
        org.junit.Assert.assertNotNull(slimTableFactory18);
        org.junit.Assert.assertNotNull(slimTableFactory19);
        org.junit.Assert.assertNotNull(strMap20);
        org.junit.Assert.assertNotNull(slimTableFactory21);
        org.junit.Assert.assertNotNull(strMap22);
        org.junit.Assert.assertNull(wildcardClass25);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "" + "'", str27, "");
    }

    @Test
    public void test18549() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18549");
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory0 = new fitnesse.testsystems.slim.tables.SlimTableFactory();
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory1 = slimTableFactory0.copy();
        java.util.Map<java.lang.String, java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable>> strMap2 = slimTableFactory1.tableTypes;
        java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable> wildcardClass4 = slimTableFactory1.getTableType("hi!");
        java.util.Map<java.lang.String, java.lang.String> strMap5 = slimTableFactory1.tableTypeArrays;
        java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable> wildcardClass7 = slimTableFactory1.getTableType("hi!");
        java.lang.String str9 = slimTableFactory1.makeTableType("");
        java.util.Map<java.lang.String, java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable>> strMap10 = slimTableFactory1.tableTypes;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory11 = slimTableFactory1.copy();
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory12 = slimTableFactory11.copy();
        boolean boolean14 = slimTableFactory11.hasColon("hi!");
        org.junit.Assert.assertNotNull(slimTableFactory1);
        org.junit.Assert.assertNotNull(strMap2);
        org.junit.Assert.assertNull(wildcardClass4);
        org.junit.Assert.assertNotNull(strMap5);
        org.junit.Assert.assertNull(wildcardClass7);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNotNull(strMap10);
        org.junit.Assert.assertNotNull(slimTableFactory11);
        org.junit.Assert.assertNotNull(slimTableFactory12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test18550() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18550");
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory0 = new fitnesse.testsystems.slim.tables.SlimTableFactory();
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory1 = slimTableFactory0.copy();
        boolean boolean3 = slimTableFactory1.hasColon("hi!");
        java.util.Map<java.lang.String, java.lang.String> strMap4 = slimTableFactory1.tableTypeArrays;
        java.lang.String str6 = slimTableFactory1.getFullTableName("");
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory7 = new fitnesse.testsystems.slim.tables.SlimTableFactory();
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory8 = slimTableFactory7.copy();
        boolean boolean10 = slimTableFactory8.hasColon("hi!");
        java.util.Map<java.lang.String, java.lang.String> strMap11 = slimTableFactory8.tableTypeArrays;
        java.lang.String str13 = slimTableFactory8.getFullTableName("");
        java.util.Map<java.lang.String, java.lang.String> strMap14 = slimTableFactory8.tableTypeArrays;
        slimTableFactory1.tableTypeArrays = strMap14;
        java.util.Map<java.lang.String, java.lang.String> strMap16 = slimTableFactory1.tableTypeArrays;
        java.util.Map<java.lang.String, java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable>> strMap17 = slimTableFactory1.tableTypes;
        java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable> wildcardClass19 = slimTableFactory1.getTableType("hi!");
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory20 = slimTableFactory1.copy();
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory21 = new fitnesse.testsystems.slim.tables.SlimTableFactory();
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory22 = slimTableFactory21.copy();
        java.util.Map<java.lang.String, java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable>> strMap23 = slimTableFactory22.tableTypes;
        boolean boolean25 = slimTableFactory22.hasColon("");
        boolean boolean27 = slimTableFactory22.hasColon("hi!");
        java.util.Map<java.lang.String, java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable>> strMap28 = slimTableFactory22.tableTypes;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory29 = new fitnesse.testsystems.slim.tables.SlimTableFactory();
        java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable> wildcardClass31 = slimTableFactory29.getTableType("");
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory32 = slimTableFactory29.copy();
        java.util.Map<java.lang.String, java.lang.String> strMap33 = slimTableFactory32.tableTypeArrays;
        slimTableFactory22.tableTypeArrays = strMap33;
        java.lang.String str36 = slimTableFactory22.makeTableType("");
        java.lang.String str38 = slimTableFactory22.getFullTableName("hi!");
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory39 = new fitnesse.testsystems.slim.tables.SlimTableFactory();
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory40 = slimTableFactory39.copy();
        boolean boolean42 = slimTableFactory40.hasColon("hi!");
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory43 = slimTableFactory40.copy();
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory44 = slimTableFactory40.copy();
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory45 = slimTableFactory44.copy();
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory46 = new fitnesse.testsystems.slim.tables.SlimTableFactory();
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory47 = slimTableFactory46.copy();
        boolean boolean49 = slimTableFactory47.hasColon("hi!");
        java.util.Map<java.lang.String, java.lang.String> strMap50 = slimTableFactory47.tableTypeArrays;
        slimTableFactory45.tableTypeArrays = strMap50;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory52 = new fitnesse.testsystems.slim.tables.SlimTableFactory();
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory53 = slimTableFactory52.copy();
        boolean boolean55 = slimTableFactory53.hasColon("hi!");
        java.util.Map<java.lang.String, java.lang.String> strMap56 = slimTableFactory53.tableTypeArrays;
        java.lang.String str58 = slimTableFactory53.getFullTableName("");
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory59 = new fitnesse.testsystems.slim.tables.SlimTableFactory();
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory60 = slimTableFactory59.copy();
        boolean boolean62 = slimTableFactory60.hasColon("hi!");
        java.util.Map<java.lang.String, java.lang.String> strMap63 = slimTableFactory60.tableTypeArrays;
        java.lang.String str65 = slimTableFactory60.getFullTableName("");
        java.util.Map<java.lang.String, java.lang.String> strMap66 = slimTableFactory60.tableTypeArrays;
        slimTableFactory53.tableTypeArrays = strMap66;
        java.util.Map<java.lang.String, java.lang.String> strMap68 = slimTableFactory53.tableTypeArrays;
        slimTableFactory45.tableTypeArrays = strMap68;
        slimTableFactory22.tableTypeArrays = strMap68;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory71 = new fitnesse.testsystems.slim.tables.SlimTableFactory();
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory72 = slimTableFactory71.copy();
        boolean boolean74 = slimTableFactory72.hasColon("hi!");
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory75 = slimTableFactory72.copy();
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory76 = slimTableFactory72.copy();
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory77 = slimTableFactory72.copy();
        java.util.Map<java.lang.String, java.lang.String> strMap78 = slimTableFactory77.tableTypeArrays;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory79 = new fitnesse.testsystems.slim.tables.SlimTableFactory();
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory80 = slimTableFactory79.copy();
        boolean boolean82 = slimTableFactory80.hasColon("hi!");
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory83 = slimTableFactory80.copy();
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory84 = slimTableFactory80.copy();
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory85 = slimTableFactory80.copy();
        java.util.Map<java.lang.String, java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable>> strMap86 = slimTableFactory80.tableTypes;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory87 = new fitnesse.testsystems.slim.tables.SlimTableFactory();
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory88 = slimTableFactory87.copy();
        java.util.Map<java.lang.String, java.lang.String> strMap89 = slimTableFactory87.tableTypeArrays;
        slimTableFactory80.tableTypeArrays = strMap89;
        slimTableFactory77.tableTypeArrays = strMap89;
        slimTableFactory22.tableTypeArrays = strMap89;
        slimTableFactory1.tableTypeArrays = strMap89;
        java.util.Map<java.lang.String, java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable>> strMap94 = slimTableFactory1.tableTypes;
        java.lang.String str96 = slimTableFactory1.makeTableType("hi!");
        fitnesse.testsystems.slim.Table table97 = null;
        // The following exception was thrown during execution in test generation
        try {
            fitnesse.testsystems.slim.tables.SlimTable slimTable98 = slimTableFactory1.parseDefineTableTypeTable(table97);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(slimTableFactory1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(strMap4);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(slimTableFactory8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(strMap11);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNotNull(strMap14);
        org.junit.Assert.assertNotNull(strMap16);
        org.junit.Assert.assertNotNull(strMap17);
        org.junit.Assert.assertNull(wildcardClass19);
        org.junit.Assert.assertNotNull(slimTableFactory20);
        org.junit.Assert.assertNotNull(slimTableFactory22);
        org.junit.Assert.assertNotNull(strMap23);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNotNull(strMap28);
        org.junit.Assert.assertNull(wildcardClass31);
        org.junit.Assert.assertNotNull(slimTableFactory32);
        org.junit.Assert.assertNotNull(strMap33);
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "" + "'", str36, "");
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "hi!" + "'", str38, "hi!");
        org.junit.Assert.assertNotNull(slimTableFactory40);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertNotNull(slimTableFactory43);
        org.junit.Assert.assertNotNull(slimTableFactory44);
        org.junit.Assert.assertNotNull(slimTableFactory45);
        org.junit.Assert.assertNotNull(slimTableFactory47);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
        org.junit.Assert.assertNotNull(strMap50);
        org.junit.Assert.assertNotNull(slimTableFactory53);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + false + "'", boolean55 == false);
        org.junit.Assert.assertNotNull(strMap56);
        org.junit.Assert.assertEquals("'" + str58 + "' != '" + "" + "'", str58, "");
        org.junit.Assert.assertNotNull(slimTableFactory60);
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + false + "'", boolean62 == false);
        org.junit.Assert.assertNotNull(strMap63);
        org.junit.Assert.assertEquals("'" + str65 + "' != '" + "" + "'", str65, "");
        org.junit.Assert.assertNotNull(strMap66);
        org.junit.Assert.assertNotNull(strMap68);
        org.junit.Assert.assertNotNull(slimTableFactory72);
        org.junit.Assert.assertTrue("'" + boolean74 + "' != '" + false + "'", boolean74 == false);
        org.junit.Assert.assertNotNull(slimTableFactory75);
        org.junit.Assert.assertNotNull(slimTableFactory76);
        org.junit.Assert.assertNotNull(slimTableFactory77);
        org.junit.Assert.assertNotNull(strMap78);
        org.junit.Assert.assertNotNull(slimTableFactory80);
        org.junit.Assert.assertTrue("'" + boolean82 + "' != '" + false + "'", boolean82 == false);
        org.junit.Assert.assertNotNull(slimTableFactory83);
        org.junit.Assert.assertNotNull(slimTableFactory84);
        org.junit.Assert.assertNotNull(slimTableFactory85);
        org.junit.Assert.assertNotNull(strMap86);
        org.junit.Assert.assertNotNull(slimTableFactory88);
        org.junit.Assert.assertNotNull(strMap89);
        org.junit.Assert.assertNotNull(strMap94);
        org.junit.Assert.assertEquals("'" + str96 + "' != '" + "hi!" + "'", str96, "hi!");
    }

    @Test
    public void test18551() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18551");
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory0 = new fitnesse.testsystems.slim.tables.SlimTableFactory();
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory1 = slimTableFactory0.copy();
        java.util.Map<java.lang.String, java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable>> strMap2 = slimTableFactory1.tableTypes;
        boolean boolean4 = slimTableFactory1.hasColon("");
        boolean boolean6 = slimTableFactory1.hasColon("hi!");
        boolean boolean8 = slimTableFactory1.hasColon("");
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory9 = slimTableFactory1.copy();
        java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable> wildcardClass11 = slimTableFactory9.getTableType("hi!");
        java.util.Map<java.lang.String, java.lang.String> strMap12 = slimTableFactory9.tableTypeArrays;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory13 = new fitnesse.testsystems.slim.tables.SlimTableFactory();
        java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable> wildcardClass15 = slimTableFactory13.getTableType("");
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory16 = slimTableFactory13.copy();
        boolean boolean18 = slimTableFactory16.hasColon("");
        boolean boolean20 = slimTableFactory16.hasColon("hi!");
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory21 = slimTableFactory16.copy();
        java.lang.String str23 = slimTableFactory16.getFullTableName("");
        java.util.Map<java.lang.String, java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable>> strMap24 = slimTableFactory16.tableTypes;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory25 = new fitnesse.testsystems.slim.tables.SlimTableFactory();
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory26 = slimTableFactory25.copy();
        boolean boolean28 = slimTableFactory26.hasColon("hi!");
        java.util.Map<java.lang.String, java.lang.String> strMap29 = slimTableFactory26.tableTypeArrays;
        java.lang.String str31 = slimTableFactory26.getFullTableName("");
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory32 = new fitnesse.testsystems.slim.tables.SlimTableFactory();
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory33 = slimTableFactory32.copy();
        boolean boolean35 = slimTableFactory33.hasColon("hi!");
        java.util.Map<java.lang.String, java.lang.String> strMap36 = slimTableFactory33.tableTypeArrays;
        java.lang.String str38 = slimTableFactory33.getFullTableName("");
        java.util.Map<java.lang.String, java.lang.String> strMap39 = slimTableFactory33.tableTypeArrays;
        slimTableFactory26.tableTypeArrays = strMap39;
        java.util.Map<java.lang.String, java.lang.String> strMap41 = slimTableFactory26.tableTypeArrays;
        java.util.Map<java.lang.String, java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable>> strMap42 = slimTableFactory26.tableTypes;
        java.lang.String str44 = slimTableFactory26.getFullTableName("hi!");
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory45 = slimTableFactory26.copy();
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory46 = new fitnesse.testsystems.slim.tables.SlimTableFactory();
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory47 = slimTableFactory46.copy();
        boolean boolean49 = slimTableFactory47.hasColon("hi!");
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory50 = slimTableFactory47.copy();
        java.util.Map<java.lang.String, java.lang.String> strMap51 = slimTableFactory47.tableTypeArrays;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory52 = slimTableFactory47.copy();
        boolean boolean54 = slimTableFactory52.hasColon("hi!");
        java.util.Map<java.lang.String, java.lang.String> strMap55 = slimTableFactory52.tableTypeArrays;
        slimTableFactory45.tableTypeArrays = strMap55;
        slimTableFactory16.tableTypeArrays = strMap55;
        slimTableFactory9.tableTypeArrays = strMap55;
        boolean boolean60 = slimTableFactory9.hasColon("");
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory61 = slimTableFactory9.copy();
        java.util.Map<java.lang.String, java.lang.String> strMap62 = slimTableFactory9.tableTypeArrays;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory63 = new fitnesse.testsystems.slim.tables.SlimTableFactory();
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory64 = slimTableFactory63.copy();
        boolean boolean66 = slimTableFactory64.hasColon("hi!");
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory67 = new fitnesse.testsystems.slim.tables.SlimTableFactory();
        java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable> wildcardClass69 = slimTableFactory67.getTableType("");
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory70 = slimTableFactory67.copy();
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory71 = new fitnesse.testsystems.slim.tables.SlimTableFactory();
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory72 = slimTableFactory71.copy();
        java.util.Map<java.lang.String, java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable>> strMap73 = slimTableFactory72.tableTypes;
        boolean boolean75 = slimTableFactory72.hasColon("");
        boolean boolean77 = slimTableFactory72.hasColon("hi!");
        java.util.Map<java.lang.String, java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable>> strMap78 = slimTableFactory72.tableTypes;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory79 = new fitnesse.testsystems.slim.tables.SlimTableFactory();
        java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable> wildcardClass81 = slimTableFactory79.getTableType("");
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory82 = slimTableFactory79.copy();
        java.util.Map<java.lang.String, java.lang.String> strMap83 = slimTableFactory82.tableTypeArrays;
        slimTableFactory72.tableTypeArrays = strMap83;
        slimTableFactory67.tableTypeArrays = strMap83;
        slimTableFactory64.tableTypeArrays = strMap83;
        boolean boolean88 = slimTableFactory64.hasColon("");
        java.util.Map<java.lang.String, java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable>> strMap89 = slimTableFactory64.tableTypes;
        java.util.Map<java.lang.String, java.lang.String> strMap90 = slimTableFactory64.tableTypeArrays;
        slimTableFactory9.tableTypeArrays = strMap90;
        java.util.Map<java.lang.String, java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable>> strMap92 = slimTableFactory9.tableTypes;
        fitnesse.testsystems.slim.Table table93 = null;
        // The following exception was thrown during execution in test generation
        try {
            fitnesse.testsystems.slim.tables.SlimTable slimTable94 = slimTableFactory9.parseDefineTableTypeTable(table93);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(slimTableFactory1);
        org.junit.Assert.assertNotNull(strMap2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(slimTableFactory9);
        org.junit.Assert.assertNull(wildcardClass11);
        org.junit.Assert.assertNotNull(strMap12);
        org.junit.Assert.assertNull(wildcardClass15);
        org.junit.Assert.assertNotNull(slimTableFactory16);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(slimTableFactory21);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
        org.junit.Assert.assertNotNull(strMap24);
        org.junit.Assert.assertNotNull(slimTableFactory26);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertNotNull(strMap29);
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "" + "'", str31, "");
        org.junit.Assert.assertNotNull(slimTableFactory33);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertNotNull(strMap36);
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "" + "'", str38, "");
        org.junit.Assert.assertNotNull(strMap39);
        org.junit.Assert.assertNotNull(strMap41);
        org.junit.Assert.assertNotNull(strMap42);
        org.junit.Assert.assertEquals("'" + str44 + "' != '" + "hi!" + "'", str44, "hi!");
        org.junit.Assert.assertNotNull(slimTableFactory45);
        org.junit.Assert.assertNotNull(slimTableFactory47);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
        org.junit.Assert.assertNotNull(slimTableFactory50);
        org.junit.Assert.assertNotNull(strMap51);
        org.junit.Assert.assertNotNull(slimTableFactory52);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + false + "'", boolean54 == false);
        org.junit.Assert.assertNotNull(strMap55);
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + false + "'", boolean60 == false);
        org.junit.Assert.assertNotNull(slimTableFactory61);
        org.junit.Assert.assertNotNull(strMap62);
        org.junit.Assert.assertNotNull(slimTableFactory64);
        org.junit.Assert.assertTrue("'" + boolean66 + "' != '" + false + "'", boolean66 == false);
        org.junit.Assert.assertNull(wildcardClass69);
        org.junit.Assert.assertNotNull(slimTableFactory70);
        org.junit.Assert.assertNotNull(slimTableFactory72);
        org.junit.Assert.assertNotNull(strMap73);
        org.junit.Assert.assertTrue("'" + boolean75 + "' != '" + false + "'", boolean75 == false);
        org.junit.Assert.assertTrue("'" + boolean77 + "' != '" + false + "'", boolean77 == false);
        org.junit.Assert.assertNotNull(strMap78);
        org.junit.Assert.assertNull(wildcardClass81);
        org.junit.Assert.assertNotNull(slimTableFactory82);
        org.junit.Assert.assertNotNull(strMap83);
        org.junit.Assert.assertTrue("'" + boolean88 + "' != '" + false + "'", boolean88 == false);
        org.junit.Assert.assertNotNull(strMap89);
        org.junit.Assert.assertNotNull(strMap90);
        org.junit.Assert.assertNotNull(strMap92);
    }

    @Test
    public void test18552() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18552");
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory0 = new fitnesse.testsystems.slim.tables.SlimTableFactory();
        java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable> wildcardClass2 = slimTableFactory0.getTableType("");
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory3 = slimTableFactory0.copy();
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory4 = new fitnesse.testsystems.slim.tables.SlimTableFactory();
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory5 = slimTableFactory4.copy();
        java.util.Map<java.lang.String, java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable>> strMap6 = slimTableFactory5.tableTypes;
        boolean boolean8 = slimTableFactory5.hasColon("");
        boolean boolean10 = slimTableFactory5.hasColon("hi!");
        java.util.Map<java.lang.String, java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable>> strMap11 = slimTableFactory5.tableTypes;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory12 = new fitnesse.testsystems.slim.tables.SlimTableFactory();
        java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable> wildcardClass14 = slimTableFactory12.getTableType("");
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory15 = slimTableFactory12.copy();
        java.util.Map<java.lang.String, java.lang.String> strMap16 = slimTableFactory15.tableTypeArrays;
        slimTableFactory5.tableTypeArrays = strMap16;
        slimTableFactory0.tableTypeArrays = strMap16;
        java.util.Map<java.lang.String, java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable>> strMap19 = slimTableFactory0.tableTypes;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory20 = slimTableFactory0.copy();
        java.lang.String str22 = slimTableFactory20.makeTableType("");
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory23 = slimTableFactory20.copy();
        java.lang.String str25 = slimTableFactory20.getFullTableName("hi!");
        java.lang.String str27 = slimTableFactory20.makeTableType("");
        java.util.Map<java.lang.String, java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable>> strMap28 = slimTableFactory20.tableTypes;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory29 = new fitnesse.testsystems.slim.tables.SlimTableFactory();
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory30 = slimTableFactory29.copy();
        boolean boolean32 = slimTableFactory30.hasColon("hi!");
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory33 = slimTableFactory30.copy();
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory34 = slimTableFactory30.copy();
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory35 = slimTableFactory34.copy();
        boolean boolean37 = slimTableFactory34.hasColon("");
        boolean boolean39 = slimTableFactory34.hasColon("hi!");
        boolean boolean41 = slimTableFactory34.hasColon("hi!");
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory42 = new fitnesse.testsystems.slim.tables.SlimTableFactory();
        java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable> wildcardClass44 = slimTableFactory42.getTableType("");
        java.util.Map<java.lang.String, java.lang.String> strMap45 = slimTableFactory42.tableTypeArrays;
        boolean boolean47 = slimTableFactory42.hasColon("");
        java.lang.String str49 = slimTableFactory42.makeTableType("");
        java.lang.String str51 = slimTableFactory42.makeTableType("");
        java.lang.String str53 = slimTableFactory42.makeTableType("");
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory54 = new fitnesse.testsystems.slim.tables.SlimTableFactory();
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory55 = slimTableFactory54.copy();
        boolean boolean57 = slimTableFactory55.hasColon("hi!");
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory58 = new fitnesse.testsystems.slim.tables.SlimTableFactory();
        java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable> wildcardClass60 = slimTableFactory58.getTableType("");
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory61 = slimTableFactory58.copy();
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory62 = new fitnesse.testsystems.slim.tables.SlimTableFactory();
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory63 = slimTableFactory62.copy();
        java.util.Map<java.lang.String, java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable>> strMap64 = slimTableFactory63.tableTypes;
        boolean boolean66 = slimTableFactory63.hasColon("");
        boolean boolean68 = slimTableFactory63.hasColon("hi!");
        java.util.Map<java.lang.String, java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable>> strMap69 = slimTableFactory63.tableTypes;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory70 = new fitnesse.testsystems.slim.tables.SlimTableFactory();
        java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable> wildcardClass72 = slimTableFactory70.getTableType("");
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory73 = slimTableFactory70.copy();
        java.util.Map<java.lang.String, java.lang.String> strMap74 = slimTableFactory73.tableTypeArrays;
        slimTableFactory63.tableTypeArrays = strMap74;
        slimTableFactory58.tableTypeArrays = strMap74;
        slimTableFactory55.tableTypeArrays = strMap74;
        slimTableFactory42.tableTypeArrays = strMap74;
        slimTableFactory34.tableTypeArrays = strMap74;
        java.lang.String str81 = slimTableFactory34.getFullTableName("hi!");
        java.util.Map<java.lang.String, java.lang.String> strMap82 = slimTableFactory34.tableTypeArrays;
        slimTableFactory20.tableTypeArrays = strMap82;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory84 = slimTableFactory20.copy();
        org.junit.Assert.assertNull(wildcardClass2);
        org.junit.Assert.assertNotNull(slimTableFactory3);
        org.junit.Assert.assertNotNull(slimTableFactory5);
        org.junit.Assert.assertNotNull(strMap6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(strMap11);
        org.junit.Assert.assertNull(wildcardClass14);
        org.junit.Assert.assertNotNull(slimTableFactory15);
        org.junit.Assert.assertNotNull(strMap16);
        org.junit.Assert.assertNotNull(strMap19);
        org.junit.Assert.assertNotNull(slimTableFactory20);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertNotNull(slimTableFactory23);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "hi!" + "'", str25, "hi!");
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "" + "'", str27, "");
        org.junit.Assert.assertNotNull(strMap28);
        org.junit.Assert.assertNotNull(slimTableFactory30);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertNotNull(slimTableFactory33);
        org.junit.Assert.assertNotNull(slimTableFactory34);
        org.junit.Assert.assertNotNull(slimTableFactory35);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertNull(wildcardClass44);
        org.junit.Assert.assertNotNull(strMap45);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertEquals("'" + str49 + "' != '" + "" + "'", str49, "");
        org.junit.Assert.assertEquals("'" + str51 + "' != '" + "" + "'", str51, "");
        org.junit.Assert.assertEquals("'" + str53 + "' != '" + "" + "'", str53, "");
        org.junit.Assert.assertNotNull(slimTableFactory55);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + false + "'", boolean57 == false);
        org.junit.Assert.assertNull(wildcardClass60);
        org.junit.Assert.assertNotNull(slimTableFactory61);
        org.junit.Assert.assertNotNull(slimTableFactory63);
        org.junit.Assert.assertNotNull(strMap64);
        org.junit.Assert.assertTrue("'" + boolean66 + "' != '" + false + "'", boolean66 == false);
        org.junit.Assert.assertTrue("'" + boolean68 + "' != '" + false + "'", boolean68 == false);
        org.junit.Assert.assertNotNull(strMap69);
        org.junit.Assert.assertNull(wildcardClass72);
        org.junit.Assert.assertNotNull(slimTableFactory73);
        org.junit.Assert.assertNotNull(strMap74);
        org.junit.Assert.assertEquals("'" + str81 + "' != '" + "hi!" + "'", str81, "hi!");
        org.junit.Assert.assertNotNull(strMap82);
        org.junit.Assert.assertNotNull(slimTableFactory84);
    }

    @Test
    public void test18553() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18553");
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory0 = new fitnesse.testsystems.slim.tables.SlimTableFactory();
        java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable> wildcardClass2 = slimTableFactory0.getTableType("");
        java.util.Map<java.lang.String, java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable>> strMap3 = slimTableFactory0.tableTypes;
        java.lang.String str5 = slimTableFactory0.getFullTableName("");
        fitnesse.testsystems.slim.Table table6 = null;
        // The following exception was thrown during execution in test generation
        try {
            slimTableFactory0.parseDefineTableTypeRow(table6, (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(wildcardClass2);
        org.junit.Assert.assertNotNull(strMap3);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
    }

    @Test
    public void test18554() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18554");
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory0 = new fitnesse.testsystems.slim.tables.SlimTableFactory();
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory1 = slimTableFactory0.copy();
        boolean boolean3 = slimTableFactory1.hasColon("hi!");
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory4 = slimTableFactory1.copy();
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory5 = slimTableFactory1.copy();
        java.util.Map<java.lang.String, java.lang.String> strMap6 = slimTableFactory1.tableTypeArrays;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory7 = new fitnesse.testsystems.slim.tables.SlimTableFactory();
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory8 = slimTableFactory7.copy();
        boolean boolean10 = slimTableFactory8.hasColon("hi!");
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory11 = slimTableFactory8.copy();
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory12 = slimTableFactory8.copy();
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory13 = slimTableFactory12.copy();
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory14 = new fitnesse.testsystems.slim.tables.SlimTableFactory();
        java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable> wildcardClass16 = slimTableFactory14.getTableType("");
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory17 = slimTableFactory14.copy();
        boolean boolean19 = slimTableFactory14.hasColon("hi!");
        java.util.Map<java.lang.String, java.lang.String> strMap20 = slimTableFactory14.tableTypeArrays;
        slimTableFactory12.tableTypeArrays = strMap20;
        java.util.Map<java.lang.String, java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable>> strMap22 = slimTableFactory12.tableTypes;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory23 = slimTableFactory12.copy();
        java.util.Map<java.lang.String, java.lang.String> strMap24 = slimTableFactory23.tableTypeArrays;
        slimTableFactory1.tableTypeArrays = strMap24;
        java.lang.String str27 = slimTableFactory1.makeTableType("hi!");
        java.util.Map<java.lang.String, java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable>> strMap28 = slimTableFactory1.tableTypes;
        java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable> wildcardClass30 = slimTableFactory1.getTableType("");
        java.lang.String str32 = slimTableFactory1.makeTableType("hi!");
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory33 = new fitnesse.testsystems.slim.tables.SlimTableFactory();
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory34 = slimTableFactory33.copy();
        java.util.Map<java.lang.String, java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable>> strMap35 = slimTableFactory34.tableTypes;
        boolean boolean37 = slimTableFactory34.hasColon("");
        java.util.Map<java.lang.String, java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable>> strMap38 = slimTableFactory34.tableTypes;
        java.util.Map<java.lang.String, java.lang.String> strMap39 = slimTableFactory34.tableTypeArrays;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory40 = slimTableFactory34.copy();
        java.util.Map<java.lang.String, java.lang.String> strMap41 = slimTableFactory34.tableTypeArrays;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory42 = new fitnesse.testsystems.slim.tables.SlimTableFactory();
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory43 = slimTableFactory42.copy();
        java.util.Map<java.lang.String, java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable>> strMap44 = slimTableFactory43.tableTypes;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory45 = new fitnesse.testsystems.slim.tables.SlimTableFactory();
        java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable> wildcardClass47 = slimTableFactory45.getTableType("");
        boolean boolean49 = slimTableFactory45.hasColon("");
        java.util.Map<java.lang.String, java.lang.String> strMap50 = slimTableFactory45.tableTypeArrays;
        slimTableFactory43.tableTypeArrays = strMap50;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory52 = new fitnesse.testsystems.slim.tables.SlimTableFactory();
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory53 = slimTableFactory52.copy();
        boolean boolean55 = slimTableFactory53.hasColon("hi!");
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory56 = slimTableFactory53.copy();
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory57 = slimTableFactory53.copy();
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory58 = slimTableFactory57.copy();
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory59 = new fitnesse.testsystems.slim.tables.SlimTableFactory();
        java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable> wildcardClass61 = slimTableFactory59.getTableType("");
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory62 = slimTableFactory59.copy();
        boolean boolean64 = slimTableFactory59.hasColon("hi!");
        java.util.Map<java.lang.String, java.lang.String> strMap65 = slimTableFactory59.tableTypeArrays;
        slimTableFactory57.tableTypeArrays = strMap65;
        java.util.Map<java.lang.String, java.lang.String> strMap67 = slimTableFactory57.tableTypeArrays;
        slimTableFactory43.tableTypeArrays = strMap67;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory69 = new fitnesse.testsystems.slim.tables.SlimTableFactory();
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory70 = slimTableFactory69.copy();
        java.util.Map<java.lang.String, java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable>> strMap71 = slimTableFactory70.tableTypes;
        boolean boolean73 = slimTableFactory70.hasColon("");
        java.util.Map<java.lang.String, java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable>> strMap74 = slimTableFactory70.tableTypes;
        java.util.Map<java.lang.String, java.lang.String> strMap75 = slimTableFactory70.tableTypeArrays;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory76 = slimTableFactory70.copy();
        java.util.Map<java.lang.String, java.lang.String> strMap77 = slimTableFactory70.tableTypeArrays;
        slimTableFactory43.tableTypeArrays = strMap77;
        slimTableFactory34.tableTypeArrays = strMap77;
        java.lang.String str81 = slimTableFactory34.makeTableType("");
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory82 = slimTableFactory34.copy();
        java.util.Map<java.lang.String, java.lang.String> strMap83 = slimTableFactory34.tableTypeArrays;
        java.util.Map<java.lang.String, java.lang.String> strMap84 = slimTableFactory34.tableTypeArrays;
        java.util.Map<java.lang.String, java.lang.String> strMap85 = slimTableFactory34.tableTypeArrays;
        slimTableFactory1.tableTypeArrays = strMap85;
        org.junit.Assert.assertNotNull(slimTableFactory1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(slimTableFactory4);
        org.junit.Assert.assertNotNull(slimTableFactory5);
        org.junit.Assert.assertNotNull(strMap6);
        org.junit.Assert.assertNotNull(slimTableFactory8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(slimTableFactory11);
        org.junit.Assert.assertNotNull(slimTableFactory12);
        org.junit.Assert.assertNotNull(slimTableFactory13);
        org.junit.Assert.assertNull(wildcardClass16);
        org.junit.Assert.assertNotNull(slimTableFactory17);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(strMap20);
        org.junit.Assert.assertNotNull(strMap22);
        org.junit.Assert.assertNotNull(slimTableFactory23);
        org.junit.Assert.assertNotNull(strMap24);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "hi!" + "'", str27, "hi!");
        org.junit.Assert.assertNotNull(strMap28);
        org.junit.Assert.assertNull(wildcardClass30);
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "hi!" + "'", str32, "hi!");
        org.junit.Assert.assertNotNull(slimTableFactory34);
        org.junit.Assert.assertNotNull(strMap35);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertNotNull(strMap38);
        org.junit.Assert.assertNotNull(strMap39);
        org.junit.Assert.assertNotNull(slimTableFactory40);
        org.junit.Assert.assertNotNull(strMap41);
        org.junit.Assert.assertNotNull(slimTableFactory43);
        org.junit.Assert.assertNotNull(strMap44);
        org.junit.Assert.assertNull(wildcardClass47);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
        org.junit.Assert.assertNotNull(strMap50);
        org.junit.Assert.assertNotNull(slimTableFactory53);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + false + "'", boolean55 == false);
        org.junit.Assert.assertNotNull(slimTableFactory56);
        org.junit.Assert.assertNotNull(slimTableFactory57);
        org.junit.Assert.assertNotNull(slimTableFactory58);
        org.junit.Assert.assertNull(wildcardClass61);
        org.junit.Assert.assertNotNull(slimTableFactory62);
        org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + false + "'", boolean64 == false);
        org.junit.Assert.assertNotNull(strMap65);
        org.junit.Assert.assertNotNull(strMap67);
        org.junit.Assert.assertNotNull(slimTableFactory70);
        org.junit.Assert.assertNotNull(strMap71);
        org.junit.Assert.assertTrue("'" + boolean73 + "' != '" + false + "'", boolean73 == false);
        org.junit.Assert.assertNotNull(strMap74);
        org.junit.Assert.assertNotNull(strMap75);
        org.junit.Assert.assertNotNull(slimTableFactory76);
        org.junit.Assert.assertNotNull(strMap77);
        org.junit.Assert.assertEquals("'" + str81 + "' != '" + "" + "'", str81, "");
        org.junit.Assert.assertNotNull(slimTableFactory82);
        org.junit.Assert.assertNotNull(strMap83);
        org.junit.Assert.assertNotNull(strMap84);
        org.junit.Assert.assertNotNull(strMap85);
    }

    @Test
    public void test18555() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18555");
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory0 = new fitnesse.testsystems.slim.tables.SlimTableFactory();
        java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable> wildcardClass2 = slimTableFactory0.getTableType("");
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory3 = slimTableFactory0.copy();
        java.util.Map<java.lang.String, java.lang.String> strMap4 = slimTableFactory3.tableTypeArrays;
        java.util.Map<java.lang.String, java.lang.String> strMap5 = slimTableFactory3.tableTypeArrays;
        java.util.Map<java.lang.String, java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable>> strMap6 = slimTableFactory3.tableTypes;
        java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable> wildcardClass8 = slimTableFactory3.getTableType("");
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory9 = slimTableFactory3.copy();
        java.util.Map<java.lang.String, java.lang.String> strMap10 = slimTableFactory3.tableTypeArrays;
        java.lang.String str12 = slimTableFactory3.getFullTableName("hi!");
        java.util.Map<java.lang.String, java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable>> strMap13 = slimTableFactory3.tableTypes;
        java.lang.String str15 = slimTableFactory3.getFullTableName("");
        org.junit.Assert.assertNull(wildcardClass2);
        org.junit.Assert.assertNotNull(slimTableFactory3);
        org.junit.Assert.assertNotNull(strMap4);
        org.junit.Assert.assertNotNull(strMap5);
        org.junit.Assert.assertNotNull(strMap6);
        org.junit.Assert.assertNull(wildcardClass8);
        org.junit.Assert.assertNotNull(slimTableFactory9);
        org.junit.Assert.assertNotNull(strMap10);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertNotNull(strMap13);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
    }

    @Test
    public void test18556() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18556");
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory0 = new fitnesse.testsystems.slim.tables.SlimTableFactory();
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory1 = slimTableFactory0.copy();
        boolean boolean3 = slimTableFactory1.hasColon("hi!");
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory4 = slimTableFactory1.copy();
        java.util.Map<java.lang.String, java.lang.String> strMap5 = slimTableFactory1.tableTypeArrays;
        boolean boolean7 = slimTableFactory1.hasColon("hi!");
        java.lang.String str9 = slimTableFactory1.makeTableType("");
        java.util.Map<java.lang.String, java.lang.String> strMap10 = slimTableFactory1.tableTypeArrays;
        java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable> wildcardClass12 = slimTableFactory1.getTableType("hi!");
        java.util.Map<java.lang.String, java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable>> strMap13 = slimTableFactory1.tableTypes;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory14 = new fitnesse.testsystems.slim.tables.SlimTableFactory();
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory15 = slimTableFactory14.copy();
        boolean boolean17 = slimTableFactory15.hasColon("hi!");
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory18 = slimTableFactory15.copy();
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory19 = slimTableFactory15.copy();
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory20 = slimTableFactory15.copy();
        java.util.Map<java.lang.String, java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable>> strMap21 = slimTableFactory15.tableTypes;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory22 = new fitnesse.testsystems.slim.tables.SlimTableFactory();
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory23 = slimTableFactory22.copy();
        java.util.Map<java.lang.String, java.lang.String> strMap24 = slimTableFactory22.tableTypeArrays;
        slimTableFactory15.tableTypeArrays = strMap24;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory26 = new fitnesse.testsystems.slim.tables.SlimTableFactory();
        java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable> wildcardClass28 = slimTableFactory26.getTableType("");
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory29 = slimTableFactory26.copy();
        java.util.Map<java.lang.String, java.lang.String> strMap30 = slimTableFactory29.tableTypeArrays;
        java.util.Map<java.lang.String, java.lang.String> strMap31 = slimTableFactory29.tableTypeArrays;
        slimTableFactory15.tableTypeArrays = strMap31;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory33 = new fitnesse.testsystems.slim.tables.SlimTableFactory();
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory34 = slimTableFactory33.copy();
        java.util.Map<java.lang.String, java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable>> strMap35 = slimTableFactory34.tableTypes;
        boolean boolean37 = slimTableFactory34.hasColon("");
        boolean boolean39 = slimTableFactory34.hasColon("hi!");
        java.util.Map<java.lang.String, java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable>> strMap40 = slimTableFactory34.tableTypes;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory41 = new fitnesse.testsystems.slim.tables.SlimTableFactory();
        java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable> wildcardClass43 = slimTableFactory41.getTableType("");
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory44 = slimTableFactory41.copy();
        java.util.Map<java.lang.String, java.lang.String> strMap45 = slimTableFactory44.tableTypeArrays;
        slimTableFactory34.tableTypeArrays = strMap45;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory47 = slimTableFactory34.copy();
        java.lang.String str49 = slimTableFactory47.makeTableType("hi!");
        java.lang.String str51 = slimTableFactory47.getFullTableName("hi!");
        java.lang.String str53 = slimTableFactory47.getFullTableName("");
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory54 = slimTableFactory47.copy();
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory55 = new fitnesse.testsystems.slim.tables.SlimTableFactory();
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory56 = new fitnesse.testsystems.slim.tables.SlimTableFactory();
        java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable> wildcardClass58 = slimTableFactory56.getTableType("");
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory59 = slimTableFactory56.copy();
        boolean boolean61 = slimTableFactory56.hasColon("");
        java.util.Map<java.lang.String, java.lang.String> strMap62 = slimTableFactory56.tableTypeArrays;
        slimTableFactory55.tableTypeArrays = strMap62;
        java.util.Map<java.lang.String, java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable>> strMap64 = slimTableFactory55.tableTypes;
        boolean boolean66 = slimTableFactory55.hasColon("hi!");
        boolean boolean68 = slimTableFactory55.hasColon("");
        java.util.Map<java.lang.String, java.lang.String> strMap69 = slimTableFactory55.tableTypeArrays;
        slimTableFactory47.tableTypeArrays = strMap69;
        slimTableFactory15.tableTypeArrays = strMap69;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory72 = slimTableFactory15.copy();
        java.util.Map<java.lang.String, java.lang.String> strMap73 = slimTableFactory15.tableTypeArrays;
        java.util.Map<java.lang.String, java.lang.String> strMap74 = slimTableFactory15.tableTypeArrays;
        slimTableFactory1.tableTypeArrays = strMap74;
        java.util.Map<java.lang.String, java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable>> strMap76 = slimTableFactory1.tableTypes;
        org.junit.Assert.assertNotNull(slimTableFactory1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(slimTableFactory4);
        org.junit.Assert.assertNotNull(strMap5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNotNull(strMap10);
        org.junit.Assert.assertNull(wildcardClass12);
        org.junit.Assert.assertNotNull(strMap13);
        org.junit.Assert.assertNotNull(slimTableFactory15);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(slimTableFactory18);
        org.junit.Assert.assertNotNull(slimTableFactory19);
        org.junit.Assert.assertNotNull(slimTableFactory20);
        org.junit.Assert.assertNotNull(strMap21);
        org.junit.Assert.assertNotNull(slimTableFactory23);
        org.junit.Assert.assertNotNull(strMap24);
        org.junit.Assert.assertNull(wildcardClass28);
        org.junit.Assert.assertNotNull(slimTableFactory29);
        org.junit.Assert.assertNotNull(strMap30);
        org.junit.Assert.assertNotNull(strMap31);
        org.junit.Assert.assertNotNull(slimTableFactory34);
        org.junit.Assert.assertNotNull(strMap35);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertNotNull(strMap40);
        org.junit.Assert.assertNull(wildcardClass43);
        org.junit.Assert.assertNotNull(slimTableFactory44);
        org.junit.Assert.assertNotNull(strMap45);
        org.junit.Assert.assertNotNull(slimTableFactory47);
        org.junit.Assert.assertEquals("'" + str49 + "' != '" + "hi!" + "'", str49, "hi!");
        org.junit.Assert.assertEquals("'" + str51 + "' != '" + "hi!" + "'", str51, "hi!");
        org.junit.Assert.assertEquals("'" + str53 + "' != '" + "" + "'", str53, "");
        org.junit.Assert.assertNotNull(slimTableFactory54);
        org.junit.Assert.assertNull(wildcardClass58);
        org.junit.Assert.assertNotNull(slimTableFactory59);
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + false + "'", boolean61 == false);
        org.junit.Assert.assertNotNull(strMap62);
        org.junit.Assert.assertNotNull(strMap64);
        org.junit.Assert.assertTrue("'" + boolean66 + "' != '" + false + "'", boolean66 == false);
        org.junit.Assert.assertTrue("'" + boolean68 + "' != '" + false + "'", boolean68 == false);
        org.junit.Assert.assertNotNull(strMap69);
        org.junit.Assert.assertNotNull(slimTableFactory72);
        org.junit.Assert.assertNotNull(strMap73);
        org.junit.Assert.assertNotNull(strMap74);
        org.junit.Assert.assertNotNull(strMap76);
    }

    @Test
    public void test18557() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18557");
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory0 = new fitnesse.testsystems.slim.tables.SlimTableFactory();
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory1 = slimTableFactory0.copy();
        java.util.Map<java.lang.String, java.lang.String> strMap2 = null;
        slimTableFactory0.tableTypeArrays = strMap2;
        java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable> wildcardClass5 = slimTableFactory0.getTableType("hi!");
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory6 = new fitnesse.testsystems.slim.tables.SlimTableFactory();
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory7 = slimTableFactory6.copy();
        boolean boolean9 = slimTableFactory7.hasColon("hi!");
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory10 = slimTableFactory7.copy();
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory11 = slimTableFactory7.copy();
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory12 = new fitnesse.testsystems.slim.tables.SlimTableFactory();
        java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable> wildcardClass14 = slimTableFactory12.getTableType("");
        boolean boolean16 = slimTableFactory12.hasColon("");
        java.util.Map<java.lang.String, java.lang.String> strMap17 = slimTableFactory12.tableTypeArrays;
        slimTableFactory11.tableTypeArrays = strMap17;
        slimTableFactory0.tableTypeArrays = strMap17;
        boolean boolean21 = slimTableFactory0.hasColon("");
        java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable> wildcardClass23 = slimTableFactory0.getTableType("");
        java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable> wildcardClass25 = slimTableFactory0.getTableType("");
        boolean boolean27 = slimTableFactory0.hasColon("hi!");
        boolean boolean29 = slimTableFactory0.hasColon("hi!");
        java.lang.String str31 = slimTableFactory0.getFullTableName("");
        org.junit.Assert.assertNotNull(slimTableFactory1);
        org.junit.Assert.assertNull(wildcardClass5);
        org.junit.Assert.assertNotNull(slimTableFactory7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(slimTableFactory10);
        org.junit.Assert.assertNotNull(slimTableFactory11);
        org.junit.Assert.assertNull(wildcardClass14);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(strMap17);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNull(wildcardClass23);
        org.junit.Assert.assertNull(wildcardClass25);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "" + "'", str31, "");
    }

    @Test
    public void test18558() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18558");
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory0 = new fitnesse.testsystems.slim.tables.SlimTableFactory();
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory1 = slimTableFactory0.copy();
        boolean boolean3 = slimTableFactory1.hasColon("hi!");
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory4 = slimTableFactory1.copy();
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory5 = slimTableFactory1.copy();
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory6 = slimTableFactory5.copy();
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory7 = new fitnesse.testsystems.slim.tables.SlimTableFactory();
        java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable> wildcardClass9 = slimTableFactory7.getTableType("");
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory10 = slimTableFactory7.copy();
        boolean boolean12 = slimTableFactory7.hasColon("hi!");
        java.util.Map<java.lang.String, java.lang.String> strMap13 = slimTableFactory7.tableTypeArrays;
        slimTableFactory5.tableTypeArrays = strMap13;
        java.util.Map<java.lang.String, java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable>> strMap15 = slimTableFactory5.tableTypes;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory16 = slimTableFactory5.copy();
        java.util.Map<java.lang.String, java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable>> strMap17 = slimTableFactory16.tableTypes;
        java.util.Map<java.lang.String, java.lang.String> strMap18 = slimTableFactory16.tableTypeArrays;
        java.lang.String str20 = slimTableFactory16.makeTableType("");
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory21 = slimTableFactory16.copy();
        java.lang.String str23 = slimTableFactory21.makeTableType("hi!");
        org.junit.Assert.assertNotNull(slimTableFactory1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(slimTableFactory4);
        org.junit.Assert.assertNotNull(slimTableFactory5);
        org.junit.Assert.assertNotNull(slimTableFactory6);
        org.junit.Assert.assertNull(wildcardClass9);
        org.junit.Assert.assertNotNull(slimTableFactory10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(strMap13);
        org.junit.Assert.assertNotNull(strMap15);
        org.junit.Assert.assertNotNull(slimTableFactory16);
        org.junit.Assert.assertNotNull(strMap17);
        org.junit.Assert.assertNotNull(strMap18);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertNotNull(slimTableFactory21);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "hi!" + "'", str23, "hi!");
    }

    @Test
    public void test18559() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18559");
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory0 = new fitnesse.testsystems.slim.tables.SlimTableFactory();
        java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable> wildcardClass2 = slimTableFactory0.getTableType("");
        java.util.Map<java.lang.String, java.lang.String> strMap3 = slimTableFactory0.tableTypeArrays;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory4 = slimTableFactory0.copy();
        boolean boolean6 = slimTableFactory4.hasColon("");
        java.lang.String str8 = slimTableFactory4.makeTableType("");
        java.util.Map<java.lang.String, java.lang.String> strMap9 = slimTableFactory4.tableTypeArrays;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory10 = slimTableFactory4.copy();
        java.util.Map<java.lang.String, java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable>> strMap11 = slimTableFactory4.tableTypes;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory12 = slimTableFactory4.copy();
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory13 = slimTableFactory12.copy();
        boolean boolean15 = slimTableFactory13.hasColon("hi!");
        org.junit.Assert.assertNull(wildcardClass2);
        org.junit.Assert.assertNotNull(strMap3);
        org.junit.Assert.assertNotNull(slimTableFactory4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNotNull(strMap9);
        org.junit.Assert.assertNotNull(slimTableFactory10);
        org.junit.Assert.assertNotNull(strMap11);
        org.junit.Assert.assertNotNull(slimTableFactory12);
        org.junit.Assert.assertNotNull(slimTableFactory13);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test18560() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18560");
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory0 = new fitnesse.testsystems.slim.tables.SlimTableFactory();
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory1 = slimTableFactory0.copy();
        boolean boolean3 = slimTableFactory1.hasColon("hi!");
        java.util.Map<java.lang.String, java.lang.String> strMap4 = slimTableFactory1.tableTypeArrays;
        java.lang.String str6 = slimTableFactory1.getFullTableName("");
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory7 = new fitnesse.testsystems.slim.tables.SlimTableFactory();
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory8 = slimTableFactory7.copy();
        boolean boolean10 = slimTableFactory8.hasColon("hi!");
        java.util.Map<java.lang.String, java.lang.String> strMap11 = slimTableFactory8.tableTypeArrays;
        java.lang.String str13 = slimTableFactory8.getFullTableName("");
        java.util.Map<java.lang.String, java.lang.String> strMap14 = slimTableFactory8.tableTypeArrays;
        slimTableFactory1.tableTypeArrays = strMap14;
        java.util.Map<java.lang.String, java.lang.String> strMap16 = slimTableFactory1.tableTypeArrays;
        java.util.Map<java.lang.String, java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable>> strMap17 = slimTableFactory1.tableTypes;
        java.lang.String str19 = slimTableFactory1.getFullTableName("hi!");
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory20 = slimTableFactory1.copy();
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory21 = new fitnesse.testsystems.slim.tables.SlimTableFactory();
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory22 = slimTableFactory21.copy();
        boolean boolean24 = slimTableFactory22.hasColon("hi!");
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory25 = slimTableFactory22.copy();
        java.util.Map<java.lang.String, java.lang.String> strMap26 = slimTableFactory22.tableTypeArrays;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory27 = slimTableFactory22.copy();
        boolean boolean29 = slimTableFactory27.hasColon("hi!");
        java.util.Map<java.lang.String, java.lang.String> strMap30 = slimTableFactory27.tableTypeArrays;
        slimTableFactory20.tableTypeArrays = strMap30;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory32 = slimTableFactory20.copy();
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory33 = new fitnesse.testsystems.slim.tables.SlimTableFactory();
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory34 = slimTableFactory33.copy();
        boolean boolean36 = slimTableFactory34.hasColon("hi!");
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory37 = slimTableFactory34.copy();
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory38 = slimTableFactory34.copy();
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory39 = slimTableFactory34.copy();
        java.util.Map<java.lang.String, java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable>> strMap40 = slimTableFactory34.tableTypes;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory41 = new fitnesse.testsystems.slim.tables.SlimTableFactory();
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory42 = slimTableFactory41.copy();
        java.util.Map<java.lang.String, java.lang.String> strMap43 = null;
        slimTableFactory41.tableTypeArrays = strMap43;
        java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable> wildcardClass46 = slimTableFactory41.getTableType("hi!");
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory47 = new fitnesse.testsystems.slim.tables.SlimTableFactory();
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory48 = slimTableFactory47.copy();
        boolean boolean50 = slimTableFactory48.hasColon("hi!");
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory51 = slimTableFactory48.copy();
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory52 = slimTableFactory48.copy();
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory53 = new fitnesse.testsystems.slim.tables.SlimTableFactory();
        java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable> wildcardClass55 = slimTableFactory53.getTableType("");
        boolean boolean57 = slimTableFactory53.hasColon("");
        java.util.Map<java.lang.String, java.lang.String> strMap58 = slimTableFactory53.tableTypeArrays;
        slimTableFactory52.tableTypeArrays = strMap58;
        slimTableFactory41.tableTypeArrays = strMap58;
        boolean boolean62 = slimTableFactory41.hasColon("");
        java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable> wildcardClass64 = slimTableFactory41.getTableType("");
        java.util.Map<java.lang.String, java.lang.String> strMap65 = slimTableFactory41.tableTypeArrays;
        slimTableFactory34.tableTypeArrays = strMap65;
        slimTableFactory32.tableTypeArrays = strMap65;
        java.util.Map<java.lang.String, java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable>> strMap68 = slimTableFactory32.tableTypes;
        java.lang.String str70 = slimTableFactory32.makeTableType("hi!");
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory71 = slimTableFactory32.copy();
        boolean boolean73 = slimTableFactory32.hasColon("");
        fitnesse.testsystems.slim.Table table74 = null;
        // The following exception was thrown during execution in test generation
        try {
            fitnesse.testsystems.slim.tables.SlimTable slimTable75 = slimTableFactory32.parseDefineTableTypeTable(table74);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(slimTableFactory1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(strMap4);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(slimTableFactory8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(strMap11);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNotNull(strMap14);
        org.junit.Assert.assertNotNull(strMap16);
        org.junit.Assert.assertNotNull(strMap17);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "hi!" + "'", str19, "hi!");
        org.junit.Assert.assertNotNull(slimTableFactory20);
        org.junit.Assert.assertNotNull(slimTableFactory22);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(slimTableFactory25);
        org.junit.Assert.assertNotNull(strMap26);
        org.junit.Assert.assertNotNull(slimTableFactory27);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertNotNull(strMap30);
        org.junit.Assert.assertNotNull(slimTableFactory32);
        org.junit.Assert.assertNotNull(slimTableFactory34);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertNotNull(slimTableFactory37);
        org.junit.Assert.assertNotNull(slimTableFactory38);
        org.junit.Assert.assertNotNull(slimTableFactory39);
        org.junit.Assert.assertNotNull(strMap40);
        org.junit.Assert.assertNotNull(slimTableFactory42);
        org.junit.Assert.assertNull(wildcardClass46);
        org.junit.Assert.assertNotNull(slimTableFactory48);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
        org.junit.Assert.assertNotNull(slimTableFactory51);
        org.junit.Assert.assertNotNull(slimTableFactory52);
        org.junit.Assert.assertNull(wildcardClass55);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + false + "'", boolean57 == false);
        org.junit.Assert.assertNotNull(strMap58);
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + false + "'", boolean62 == false);
        org.junit.Assert.assertNull(wildcardClass64);
        org.junit.Assert.assertNotNull(strMap65);
        org.junit.Assert.assertNotNull(strMap68);
        org.junit.Assert.assertEquals("'" + str70 + "' != '" + "hi!" + "'", str70, "hi!");
        org.junit.Assert.assertNotNull(slimTableFactory71);
        org.junit.Assert.assertTrue("'" + boolean73 + "' != '" + false + "'", boolean73 == false);
    }

    @Test
    public void test18561() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18561");
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory0 = new fitnesse.testsystems.slim.tables.SlimTableFactory();
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory1 = slimTableFactory0.copy();
        java.util.Map<java.lang.String, java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable>> strMap2 = slimTableFactory1.tableTypes;
        java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable> wildcardClass4 = slimTableFactory1.getTableType("hi!");
        java.util.Map<java.lang.String, java.lang.String> strMap5 = slimTableFactory1.tableTypeArrays;
        java.util.Map<java.lang.String, java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable>> strMap6 = slimTableFactory1.tableTypes;
        java.util.Map<java.lang.String, java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable>> strMap7 = slimTableFactory1.tableTypes;
        fitnesse.testsystems.slim.Table table8 = null;
        fitnesse.testsystems.slim.SlimTestContext slimTestContext10 = null;
        // The following exception was thrown during execution in test generation
        try {
            fitnesse.testsystems.slim.tables.SlimTable slimTable11 = slimTableFactory1.makeSlimTable(table8, "", slimTestContext10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(slimTableFactory1);
        org.junit.Assert.assertNotNull(strMap2);
        org.junit.Assert.assertNull(wildcardClass4);
        org.junit.Assert.assertNotNull(strMap5);
        org.junit.Assert.assertNotNull(strMap6);
        org.junit.Assert.assertNotNull(strMap7);
    }

    @Test
    public void test18562() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18562");
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory0 = new fitnesse.testsystems.slim.tables.SlimTableFactory();
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory1 = slimTableFactory0.copy();
        boolean boolean3 = slimTableFactory1.hasColon("hi!");
        java.util.Map<java.lang.String, java.lang.String> strMap4 = slimTableFactory1.tableTypeArrays;
        java.lang.String str6 = slimTableFactory1.getFullTableName("");
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory7 = new fitnesse.testsystems.slim.tables.SlimTableFactory();
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory8 = slimTableFactory7.copy();
        boolean boolean10 = slimTableFactory8.hasColon("hi!");
        java.util.Map<java.lang.String, java.lang.String> strMap11 = slimTableFactory8.tableTypeArrays;
        java.lang.String str13 = slimTableFactory8.getFullTableName("");
        java.util.Map<java.lang.String, java.lang.String> strMap14 = slimTableFactory8.tableTypeArrays;
        slimTableFactory1.tableTypeArrays = strMap14;
        java.util.Map<java.lang.String, java.lang.String> strMap16 = slimTableFactory1.tableTypeArrays;
        java.util.Map<java.lang.String, java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable>> strMap17 = slimTableFactory1.tableTypes;
        java.util.Map<java.lang.String, java.lang.String> strMap18 = slimTableFactory1.tableTypeArrays;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory19 = new fitnesse.testsystems.slim.tables.SlimTableFactory();
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory20 = slimTableFactory19.copy();
        java.util.Map<java.lang.String, java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable>> strMap21 = slimTableFactory20.tableTypes;
        boolean boolean23 = slimTableFactory20.hasColon("");
        boolean boolean25 = slimTableFactory20.hasColon("hi!");
        boolean boolean27 = slimTableFactory20.hasColon("");
        java.lang.String str29 = slimTableFactory20.getFullTableName("");
        boolean boolean31 = slimTableFactory20.hasColon("");
        java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable> wildcardClass33 = slimTableFactory20.getTableType("hi!");
        java.util.Map<java.lang.String, java.lang.String> strMap34 = slimTableFactory20.tableTypeArrays;
        slimTableFactory1.tableTypeArrays = strMap34;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory36 = slimTableFactory1.copy();
        java.lang.String str38 = slimTableFactory36.makeTableType("hi!");
        java.lang.String str40 = slimTableFactory36.getFullTableName("hi!");
        java.util.Map<java.lang.String, java.lang.String> strMap41 = slimTableFactory36.tableTypeArrays;
        org.junit.Assert.assertNotNull(slimTableFactory1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(strMap4);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(slimTableFactory8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(strMap11);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNotNull(strMap14);
        org.junit.Assert.assertNotNull(strMap16);
        org.junit.Assert.assertNotNull(strMap17);
        org.junit.Assert.assertNotNull(strMap18);
        org.junit.Assert.assertNotNull(slimTableFactory20);
        org.junit.Assert.assertNotNull(strMap21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "" + "'", str29, "");
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertNull(wildcardClass33);
        org.junit.Assert.assertNotNull(strMap34);
        org.junit.Assert.assertNotNull(slimTableFactory36);
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "hi!" + "'", str38, "hi!");
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "hi!" + "'", str40, "hi!");
        org.junit.Assert.assertNotNull(strMap41);
    }

    @Test
    public void test18563() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18563");
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory0 = new fitnesse.testsystems.slim.tables.SlimTableFactory();
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory1 = slimTableFactory0.copy();
        boolean boolean3 = slimTableFactory1.hasColon("hi!");
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory4 = slimTableFactory1.copy();
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory5 = slimTableFactory1.copy();
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory6 = slimTableFactory5.copy();
        boolean boolean8 = slimTableFactory5.hasColon("hi!");
        java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable> wildcardClass10 = slimTableFactory5.getTableType("");
        java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable> wildcardClass12 = slimTableFactory5.getTableType("hi!");
        java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable> wildcardClass14 = slimTableFactory5.getTableType("");
        java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable> wildcardClass16 = slimTableFactory5.getTableType("");
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory17 = new fitnesse.testsystems.slim.tables.SlimTableFactory();
        java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable> wildcardClass19 = slimTableFactory17.getTableType("");
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory20 = slimTableFactory17.copy();
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory21 = slimTableFactory20.copy();
        java.util.Map<java.lang.String, java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable>> strMap22 = slimTableFactory21.tableTypes;
        java.lang.String str24 = slimTableFactory21.getFullTableName("");
        java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable> wildcardClass26 = slimTableFactory21.getTableType("hi!");
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory27 = slimTableFactory21.copy();
        java.util.Map<java.lang.String, java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable>> strMap28 = slimTableFactory21.tableTypes;
        java.util.Map<java.lang.String, java.lang.String> strMap29 = slimTableFactory21.tableTypeArrays;
        java.util.Map<java.lang.String, java.lang.String> strMap30 = slimTableFactory21.tableTypeArrays;
        slimTableFactory5.tableTypeArrays = strMap30;
        org.junit.Assert.assertNotNull(slimTableFactory1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(slimTableFactory4);
        org.junit.Assert.assertNotNull(slimTableFactory5);
        org.junit.Assert.assertNotNull(slimTableFactory6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(wildcardClass10);
        org.junit.Assert.assertNull(wildcardClass12);
        org.junit.Assert.assertNull(wildcardClass14);
        org.junit.Assert.assertNull(wildcardClass16);
        org.junit.Assert.assertNull(wildcardClass19);
        org.junit.Assert.assertNotNull(slimTableFactory20);
        org.junit.Assert.assertNotNull(slimTableFactory21);
        org.junit.Assert.assertNotNull(strMap22);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "" + "'", str24, "");
        org.junit.Assert.assertNull(wildcardClass26);
        org.junit.Assert.assertNotNull(slimTableFactory27);
        org.junit.Assert.assertNotNull(strMap28);
        org.junit.Assert.assertNotNull(strMap29);
        org.junit.Assert.assertNotNull(strMap30);
    }

    @Test
    public void test18564() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18564");
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory0 = new fitnesse.testsystems.slim.tables.SlimTableFactory();
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory1 = slimTableFactory0.copy();
        boolean boolean3 = slimTableFactory1.hasColon("hi!");
        java.util.Map<java.lang.String, java.lang.String> strMap4 = slimTableFactory1.tableTypeArrays;
        java.lang.String str6 = slimTableFactory1.getFullTableName("");
        java.util.Map<java.lang.String, java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable>> strMap7 = slimTableFactory1.tableTypes;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory8 = new fitnesse.testsystems.slim.tables.SlimTableFactory();
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory9 = slimTableFactory8.copy();
        boolean boolean11 = slimTableFactory9.hasColon("hi!");
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory12 = slimTableFactory9.copy();
        java.util.Map<java.lang.String, java.lang.String> strMap13 = slimTableFactory9.tableTypeArrays;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory14 = new fitnesse.testsystems.slim.tables.SlimTableFactory();
        java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable> wildcardClass16 = slimTableFactory14.getTableType("");
        java.util.Map<java.lang.String, java.lang.String> strMap17 = slimTableFactory14.tableTypeArrays;
        java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable> wildcardClass19 = slimTableFactory14.getTableType("");
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory20 = new fitnesse.testsystems.slim.tables.SlimTableFactory();
        java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable> wildcardClass22 = slimTableFactory20.getTableType("");
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory23 = slimTableFactory20.copy();
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory24 = slimTableFactory23.copy();
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory25 = new fitnesse.testsystems.slim.tables.SlimTableFactory();
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory26 = slimTableFactory25.copy();
        java.util.Map<java.lang.String, java.lang.String> strMap27 = slimTableFactory25.tableTypeArrays;
        slimTableFactory23.tableTypeArrays = strMap27;
        slimTableFactory14.tableTypeArrays = strMap27;
        slimTableFactory9.tableTypeArrays = strMap27;
        slimTableFactory1.tableTypeArrays = strMap27;
        java.lang.String str33 = slimTableFactory1.getFullTableName("hi!");
        java.util.Map<java.lang.String, java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable>> strMap34 = slimTableFactory1.tableTypes;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory35 = slimTableFactory1.copy();
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory36 = slimTableFactory35.copy();
        java.lang.String str38 = slimTableFactory36.makeTableType("");
        java.lang.String str40 = slimTableFactory36.getFullTableName("");
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory41 = new fitnesse.testsystems.slim.tables.SlimTableFactory();
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory42 = slimTableFactory41.copy();
        boolean boolean44 = slimTableFactory42.hasColon("hi!");
        java.util.Map<java.lang.String, java.lang.String> strMap45 = slimTableFactory42.tableTypeArrays;
        java.lang.String str47 = slimTableFactory42.getFullTableName("");
        java.util.Map<java.lang.String, java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable>> strMap48 = slimTableFactory42.tableTypes;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory49 = slimTableFactory42.copy();
        java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable> wildcardClass51 = slimTableFactory42.getTableType("hi!");
        java.util.Map<java.lang.String, java.lang.String> strMap52 = slimTableFactory42.tableTypeArrays;
        java.util.Map<java.lang.String, java.lang.String> strMap53 = slimTableFactory42.tableTypeArrays;
        java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable> wildcardClass55 = slimTableFactory42.getTableType("hi!");
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory56 = slimTableFactory42.copy();
        java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable> wildcardClass58 = slimTableFactory42.getTableType("hi!");
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory59 = new fitnesse.testsystems.slim.tables.SlimTableFactory();
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory60 = slimTableFactory59.copy();
        java.util.Map<java.lang.String, java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable>> strMap61 = slimTableFactory60.tableTypes;
        boolean boolean63 = slimTableFactory60.hasColon("");
        boolean boolean65 = slimTableFactory60.hasColon("hi!");
        java.util.Map<java.lang.String, java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable>> strMap66 = slimTableFactory60.tableTypes;
        java.util.Map<java.lang.String, java.lang.String> strMap67 = slimTableFactory60.tableTypeArrays;
        java.lang.String str69 = slimTableFactory60.makeTableType("");
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory70 = new fitnesse.testsystems.slim.tables.SlimTableFactory();
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory71 = slimTableFactory70.copy();
        java.lang.String str73 = slimTableFactory70.getFullTableName("hi!");
        java.lang.String str75 = slimTableFactory70.makeTableType("");
        java.util.Map<java.lang.String, java.lang.String> strMap76 = null;
        slimTableFactory70.tableTypeArrays = strMap76;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory78 = new fitnesse.testsystems.slim.tables.SlimTableFactory();
        java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable> wildcardClass80 = slimTableFactory78.getTableType("");
        boolean boolean82 = slimTableFactory78.hasColon("");
        java.lang.String str84 = slimTableFactory78.getFullTableName("");
        java.util.Map<java.lang.String, java.lang.String> strMap85 = slimTableFactory78.tableTypeArrays;
        slimTableFactory70.tableTypeArrays = strMap85;
        slimTableFactory60.tableTypeArrays = strMap85;
        slimTableFactory42.tableTypeArrays = strMap85;
        slimTableFactory36.tableTypeArrays = strMap85;
        java.util.Map<java.lang.String, java.lang.String> strMap90 = slimTableFactory36.tableTypeArrays;
        org.junit.Assert.assertNotNull(slimTableFactory1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(strMap4);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(strMap7);
        org.junit.Assert.assertNotNull(slimTableFactory9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(slimTableFactory12);
        org.junit.Assert.assertNotNull(strMap13);
        org.junit.Assert.assertNull(wildcardClass16);
        org.junit.Assert.assertNotNull(strMap17);
        org.junit.Assert.assertNull(wildcardClass19);
        org.junit.Assert.assertNull(wildcardClass22);
        org.junit.Assert.assertNotNull(slimTableFactory23);
        org.junit.Assert.assertNotNull(slimTableFactory24);
        org.junit.Assert.assertNotNull(slimTableFactory26);
        org.junit.Assert.assertNotNull(strMap27);
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "hi!" + "'", str33, "hi!");
        org.junit.Assert.assertNotNull(strMap34);
        org.junit.Assert.assertNotNull(slimTableFactory35);
        org.junit.Assert.assertNotNull(slimTableFactory36);
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "" + "'", str38, "");
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "" + "'", str40, "");
        org.junit.Assert.assertNotNull(slimTableFactory42);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertNotNull(strMap45);
        org.junit.Assert.assertEquals("'" + str47 + "' != '" + "" + "'", str47, "");
        org.junit.Assert.assertNotNull(strMap48);
        org.junit.Assert.assertNotNull(slimTableFactory49);
        org.junit.Assert.assertNull(wildcardClass51);
        org.junit.Assert.assertNotNull(strMap52);
        org.junit.Assert.assertNotNull(strMap53);
        org.junit.Assert.assertNull(wildcardClass55);
        org.junit.Assert.assertNotNull(slimTableFactory56);
        org.junit.Assert.assertNull(wildcardClass58);
        org.junit.Assert.assertNotNull(slimTableFactory60);
        org.junit.Assert.assertNotNull(strMap61);
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + false + "'", boolean63 == false);
        org.junit.Assert.assertTrue("'" + boolean65 + "' != '" + false + "'", boolean65 == false);
        org.junit.Assert.assertNotNull(strMap66);
        org.junit.Assert.assertNotNull(strMap67);
        org.junit.Assert.assertEquals("'" + str69 + "' != '" + "" + "'", str69, "");
        org.junit.Assert.assertNotNull(slimTableFactory71);
        org.junit.Assert.assertEquals("'" + str73 + "' != '" + "hi!" + "'", str73, "hi!");
        org.junit.Assert.assertEquals("'" + str75 + "' != '" + "" + "'", str75, "");
        org.junit.Assert.assertNull(wildcardClass80);
        org.junit.Assert.assertTrue("'" + boolean82 + "' != '" + false + "'", boolean82 == false);
        org.junit.Assert.assertEquals("'" + str84 + "' != '" + "" + "'", str84, "");
        org.junit.Assert.assertNotNull(strMap85);
        org.junit.Assert.assertNotNull(strMap90);
    }

    @Test
    public void test18565() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18565");
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory0 = new fitnesse.testsystems.slim.tables.SlimTableFactory();
        java.lang.String str2 = slimTableFactory0.getFullTableName("");
        java.lang.String str4 = slimTableFactory0.makeTableType("hi!");
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory5 = slimTableFactory0.copy();
        boolean boolean7 = slimTableFactory0.hasColon("hi!");
        java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable> wildcardClass9 = slimTableFactory0.getTableType("");
        java.lang.String str11 = slimTableFactory0.getFullTableName("");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertNotNull(slimTableFactory5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(wildcardClass9);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
    }

    @Test
    public void test18566() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18566");
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory0 = new fitnesse.testsystems.slim.tables.SlimTableFactory();
        java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable> wildcardClass2 = slimTableFactory0.getTableType("");
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory3 = slimTableFactory0.copy();
        boolean boolean5 = slimTableFactory0.hasColon("hi!");
        java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable> wildcardClass7 = slimTableFactory0.getTableType("hi!");
        java.util.Map<java.lang.String, java.lang.String> strMap8 = slimTableFactory0.tableTypeArrays;
        java.util.Map<java.lang.String, java.lang.String> strMap9 = slimTableFactory0.tableTypeArrays;
        java.util.Map<java.lang.String, java.lang.String> strMap10 = slimTableFactory0.tableTypeArrays;
        boolean boolean12 = slimTableFactory0.hasColon("hi!");
        java.util.Map<java.lang.String, java.lang.String> strMap13 = slimTableFactory0.tableTypeArrays;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory14 = slimTableFactory0.copy();
        java.util.Map<java.lang.String, java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable>> strMap15 = slimTableFactory0.tableTypes;
        org.junit.Assert.assertNull(wildcardClass2);
        org.junit.Assert.assertNotNull(slimTableFactory3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(wildcardClass7);
        org.junit.Assert.assertNotNull(strMap8);
        org.junit.Assert.assertNotNull(strMap9);
        org.junit.Assert.assertNotNull(strMap10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(strMap13);
        org.junit.Assert.assertNotNull(slimTableFactory14);
        org.junit.Assert.assertNotNull(strMap15);
    }

    @Test
    public void test18567() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18567");
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory0 = new fitnesse.testsystems.slim.tables.SlimTableFactory();
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory1 = slimTableFactory0.copy();
        java.util.Map<java.lang.String, java.lang.String> strMap2 = null;
        slimTableFactory0.tableTypeArrays = strMap2;
        java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable> wildcardClass5 = slimTableFactory0.getTableType("hi!");
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory6 = new fitnesse.testsystems.slim.tables.SlimTableFactory();
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory7 = slimTableFactory6.copy();
        boolean boolean9 = slimTableFactory7.hasColon("hi!");
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory10 = slimTableFactory7.copy();
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory11 = slimTableFactory7.copy();
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory12 = new fitnesse.testsystems.slim.tables.SlimTableFactory();
        java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable> wildcardClass14 = slimTableFactory12.getTableType("");
        boolean boolean16 = slimTableFactory12.hasColon("");
        java.util.Map<java.lang.String, java.lang.String> strMap17 = slimTableFactory12.tableTypeArrays;
        slimTableFactory11.tableTypeArrays = strMap17;
        slimTableFactory0.tableTypeArrays = strMap17;
        boolean boolean21 = slimTableFactory0.hasColon("");
        java.util.Map<java.lang.String, java.lang.String> strMap22 = slimTableFactory0.tableTypeArrays;
        java.util.Map<java.lang.String, java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable>> strMap23 = slimTableFactory0.tableTypes;
        org.junit.Assert.assertNotNull(slimTableFactory1);
        org.junit.Assert.assertNull(wildcardClass5);
        org.junit.Assert.assertNotNull(slimTableFactory7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(slimTableFactory10);
        org.junit.Assert.assertNotNull(slimTableFactory11);
        org.junit.Assert.assertNull(wildcardClass14);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(strMap17);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(strMap22);
        org.junit.Assert.assertNotNull(strMap23);
    }

    @Test
    public void test18568() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18568");
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory0 = new fitnesse.testsystems.slim.tables.SlimTableFactory();
        java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable> wildcardClass2 = slimTableFactory0.getTableType("");
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory3 = slimTableFactory0.copy();
        boolean boolean5 = slimTableFactory0.hasColon("");
        java.util.Map<java.lang.String, java.lang.String> strMap6 = slimTableFactory0.tableTypeArrays;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory7 = slimTableFactory0.copy();
        boolean boolean9 = slimTableFactory0.hasColon("");
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory10 = slimTableFactory0.copy();
        java.lang.String str12 = slimTableFactory0.getFullTableName("hi!");
        boolean boolean14 = slimTableFactory0.hasColon("");
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory15 = slimTableFactory0.copy();
        org.junit.Assert.assertNull(wildcardClass2);
        org.junit.Assert.assertNotNull(slimTableFactory3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(strMap6);
        org.junit.Assert.assertNotNull(slimTableFactory7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(slimTableFactory10);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(slimTableFactory15);
    }

    @Test
    public void test18569() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18569");
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory0 = new fitnesse.testsystems.slim.tables.SlimTableFactory();
        java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable> wildcardClass2 = slimTableFactory0.getTableType("");
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory3 = slimTableFactory0.copy();
        boolean boolean5 = slimTableFactory0.hasColon("hi!");
        java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable> wildcardClass7 = slimTableFactory0.getTableType("hi!");
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory8 = new fitnesse.testsystems.slim.tables.SlimTableFactory();
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory9 = slimTableFactory8.copy();
        java.util.Map<java.lang.String, java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable>> strMap10 = slimTableFactory9.tableTypes;
        boolean boolean12 = slimTableFactory9.hasColon("");
        java.util.Map<java.lang.String, java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable>> strMap13 = slimTableFactory9.tableTypes;
        java.util.Map<java.lang.String, java.lang.String> strMap14 = slimTableFactory9.tableTypeArrays;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory15 = new fitnesse.testsystems.slim.tables.SlimTableFactory();
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory16 = slimTableFactory15.copy();
        java.util.Map<java.lang.String, java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable>> strMap17 = slimTableFactory16.tableTypes;
        boolean boolean19 = slimTableFactory16.hasColon("");
        boolean boolean21 = slimTableFactory16.hasColon("hi!");
        java.util.Map<java.lang.String, java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable>> strMap22 = slimTableFactory16.tableTypes;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory23 = new fitnesse.testsystems.slim.tables.SlimTableFactory();
        java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable> wildcardClass25 = slimTableFactory23.getTableType("");
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory26 = slimTableFactory23.copy();
        java.util.Map<java.lang.String, java.lang.String> strMap27 = slimTableFactory26.tableTypeArrays;
        slimTableFactory16.tableTypeArrays = strMap27;
        slimTableFactory9.tableTypeArrays = strMap27;
        slimTableFactory0.tableTypeArrays = strMap27;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory31 = slimTableFactory0.copy();
        java.lang.String str33 = slimTableFactory31.makeTableType("hi!");
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory34 = new fitnesse.testsystems.slim.tables.SlimTableFactory();
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory35 = slimTableFactory34.copy();
        boolean boolean37 = slimTableFactory35.hasColon("hi!");
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory38 = slimTableFactory35.copy();
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory39 = slimTableFactory35.copy();
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory40 = slimTableFactory35.copy();
        boolean boolean42 = slimTableFactory40.hasColon("hi!");
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory43 = slimTableFactory40.copy();
        java.util.Map<java.lang.String, java.lang.String> strMap44 = slimTableFactory43.tableTypeArrays;
        slimTableFactory31.tableTypeArrays = strMap44;
        java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable> wildcardClass47 = slimTableFactory31.getTableType("hi!");
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory48 = slimTableFactory31.copy();
        java.util.Map<java.lang.String, java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable>> strMap49 = slimTableFactory48.tableTypes;
        java.lang.String str51 = slimTableFactory48.getFullTableName("");
        fitnesse.testsystems.slim.Table table52 = null;
        fitnesse.testsystems.slim.SlimTestContext slimTestContext54 = null;
        // The following exception was thrown during execution in test generation
        try {
            fitnesse.testsystems.slim.tables.SlimTable slimTable55 = slimTableFactory48.makeSlimTable(table52, "", slimTestContext54);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(wildcardClass2);
        org.junit.Assert.assertNotNull(slimTableFactory3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(wildcardClass7);
        org.junit.Assert.assertNotNull(slimTableFactory9);
        org.junit.Assert.assertNotNull(strMap10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(strMap13);
        org.junit.Assert.assertNotNull(strMap14);
        org.junit.Assert.assertNotNull(slimTableFactory16);
        org.junit.Assert.assertNotNull(strMap17);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(strMap22);
        org.junit.Assert.assertNull(wildcardClass25);
        org.junit.Assert.assertNotNull(slimTableFactory26);
        org.junit.Assert.assertNotNull(strMap27);
        org.junit.Assert.assertNotNull(slimTableFactory31);
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "hi!" + "'", str33, "hi!");
        org.junit.Assert.assertNotNull(slimTableFactory35);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertNotNull(slimTableFactory38);
        org.junit.Assert.assertNotNull(slimTableFactory39);
        org.junit.Assert.assertNotNull(slimTableFactory40);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertNotNull(slimTableFactory43);
        org.junit.Assert.assertNotNull(strMap44);
        org.junit.Assert.assertNull(wildcardClass47);
        org.junit.Assert.assertNotNull(slimTableFactory48);
        org.junit.Assert.assertNotNull(strMap49);
        org.junit.Assert.assertEquals("'" + str51 + "' != '" + "" + "'", str51, "");
    }

    @Test
    public void test18570() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18570");
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory0 = new fitnesse.testsystems.slim.tables.SlimTableFactory();
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory1 = slimTableFactory0.copy();
        boolean boolean3 = slimTableFactory1.hasColon("hi!");
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory4 = slimTableFactory1.copy();
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory5 = slimTableFactory1.copy();
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory6 = slimTableFactory1.copy();
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory7 = slimTableFactory1.copy();
        java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable> wildcardClass9 = slimTableFactory1.getTableType("");
        boolean boolean11 = slimTableFactory1.hasColon("");
        java.lang.String str13 = slimTableFactory1.makeTableType("hi!");
        boolean boolean15 = slimTableFactory1.hasColon("");
        org.junit.Assert.assertNotNull(slimTableFactory1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(slimTableFactory4);
        org.junit.Assert.assertNotNull(slimTableFactory5);
        org.junit.Assert.assertNotNull(slimTableFactory6);
        org.junit.Assert.assertNotNull(slimTableFactory7);
        org.junit.Assert.assertNull(wildcardClass9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test18571() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18571");
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory0 = new fitnesse.testsystems.slim.tables.SlimTableFactory();
        java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable> wildcardClass2 = slimTableFactory0.getTableType("");
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory3 = slimTableFactory0.copy();
        java.util.Map<java.lang.String, java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable>> strMap4 = slimTableFactory3.tableTypes;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory5 = new fitnesse.testsystems.slim.tables.SlimTableFactory();
        java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable> wildcardClass7 = slimTableFactory5.getTableType("");
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory8 = slimTableFactory5.copy();
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory9 = new fitnesse.testsystems.slim.tables.SlimTableFactory();
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory10 = slimTableFactory9.copy();
        java.util.Map<java.lang.String, java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable>> strMap11 = slimTableFactory10.tableTypes;
        boolean boolean13 = slimTableFactory10.hasColon("");
        boolean boolean15 = slimTableFactory10.hasColon("hi!");
        java.util.Map<java.lang.String, java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable>> strMap16 = slimTableFactory10.tableTypes;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory17 = new fitnesse.testsystems.slim.tables.SlimTableFactory();
        java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable> wildcardClass19 = slimTableFactory17.getTableType("");
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory20 = slimTableFactory17.copy();
        java.util.Map<java.lang.String, java.lang.String> strMap21 = slimTableFactory20.tableTypeArrays;
        slimTableFactory10.tableTypeArrays = strMap21;
        slimTableFactory5.tableTypeArrays = strMap21;
        slimTableFactory3.tableTypeArrays = strMap21;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory25 = new fitnesse.testsystems.slim.tables.SlimTableFactory();
        java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable> wildcardClass27 = slimTableFactory25.getTableType("");
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory28 = slimTableFactory25.copy();
        java.util.Map<java.lang.String, java.lang.String> strMap29 = slimTableFactory28.tableTypeArrays;
        java.util.Map<java.lang.String, java.lang.String> strMap30 = slimTableFactory28.tableTypeArrays;
        java.util.Map<java.lang.String, java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable>> strMap31 = slimTableFactory28.tableTypes;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory32 = slimTableFactory28.copy();
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory33 = new fitnesse.testsystems.slim.tables.SlimTableFactory();
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory34 = slimTableFactory33.copy();
        java.util.Map<java.lang.String, java.lang.String> strMap35 = null;
        slimTableFactory33.tableTypeArrays = strMap35;
        java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable> wildcardClass38 = slimTableFactory33.getTableType("hi!");
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory39 = new fitnesse.testsystems.slim.tables.SlimTableFactory();
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory40 = slimTableFactory39.copy();
        boolean boolean42 = slimTableFactory40.hasColon("hi!");
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory43 = slimTableFactory40.copy();
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory44 = slimTableFactory40.copy();
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory45 = new fitnesse.testsystems.slim.tables.SlimTableFactory();
        java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable> wildcardClass47 = slimTableFactory45.getTableType("");
        boolean boolean49 = slimTableFactory45.hasColon("");
        java.util.Map<java.lang.String, java.lang.String> strMap50 = slimTableFactory45.tableTypeArrays;
        slimTableFactory44.tableTypeArrays = strMap50;
        slimTableFactory33.tableTypeArrays = strMap50;
        boolean boolean54 = slimTableFactory33.hasColon("");
        boolean boolean56 = slimTableFactory33.hasColon("");
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory57 = new fitnesse.testsystems.slim.tables.SlimTableFactory();
        java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable> wildcardClass59 = slimTableFactory57.getTableType("");
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory60 = slimTableFactory57.copy();
        boolean boolean62 = slimTableFactory57.hasColon("hi!");
        java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable> wildcardClass64 = slimTableFactory57.getTableType("hi!");
        java.util.Map<java.lang.String, java.lang.String> strMap65 = slimTableFactory57.tableTypeArrays;
        slimTableFactory33.tableTypeArrays = strMap65;
        slimTableFactory28.tableTypeArrays = strMap65;
        slimTableFactory3.tableTypeArrays = strMap65;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory69 = slimTableFactory3.copy();
        org.junit.Assert.assertNull(wildcardClass2);
        org.junit.Assert.assertNotNull(slimTableFactory3);
        org.junit.Assert.assertNotNull(strMap4);
        org.junit.Assert.assertNull(wildcardClass7);
        org.junit.Assert.assertNotNull(slimTableFactory8);
        org.junit.Assert.assertNotNull(slimTableFactory10);
        org.junit.Assert.assertNotNull(strMap11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(strMap16);
        org.junit.Assert.assertNull(wildcardClass19);
        org.junit.Assert.assertNotNull(slimTableFactory20);
        org.junit.Assert.assertNotNull(strMap21);
        org.junit.Assert.assertNull(wildcardClass27);
        org.junit.Assert.assertNotNull(slimTableFactory28);
        org.junit.Assert.assertNotNull(strMap29);
        org.junit.Assert.assertNotNull(strMap30);
        org.junit.Assert.assertNotNull(strMap31);
        org.junit.Assert.assertNotNull(slimTableFactory32);
        org.junit.Assert.assertNotNull(slimTableFactory34);
        org.junit.Assert.assertNull(wildcardClass38);
        org.junit.Assert.assertNotNull(slimTableFactory40);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertNotNull(slimTableFactory43);
        org.junit.Assert.assertNotNull(slimTableFactory44);
        org.junit.Assert.assertNull(wildcardClass47);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
        org.junit.Assert.assertNotNull(strMap50);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + false + "'", boolean54 == false);
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + false + "'", boolean56 == false);
        org.junit.Assert.assertNull(wildcardClass59);
        org.junit.Assert.assertNotNull(slimTableFactory60);
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + false + "'", boolean62 == false);
        org.junit.Assert.assertNull(wildcardClass64);
        org.junit.Assert.assertNotNull(strMap65);
        org.junit.Assert.assertNotNull(slimTableFactory69);
    }

    @Test
    public void test18572() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18572");
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory0 = new fitnesse.testsystems.slim.tables.SlimTableFactory();
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory1 = slimTableFactory0.copy();
        boolean boolean3 = slimTableFactory1.hasColon("hi!");
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory4 = slimTableFactory1.copy();
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory5 = slimTableFactory1.copy();
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory6 = slimTableFactory1.copy();
        java.util.Map<java.lang.String, java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable>> strMap7 = slimTableFactory1.tableTypes;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory8 = new fitnesse.testsystems.slim.tables.SlimTableFactory();
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory9 = slimTableFactory8.copy();
        java.util.Map<java.lang.String, java.lang.String> strMap10 = slimTableFactory8.tableTypeArrays;
        slimTableFactory1.tableTypeArrays = strMap10;
        java.lang.String str13 = slimTableFactory1.makeTableType("");
        java.util.Map<java.lang.String, java.lang.String> strMap14 = slimTableFactory1.tableTypeArrays;
        java.lang.String str16 = slimTableFactory1.getFullTableName("hi!");
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory17 = new fitnesse.testsystems.slim.tables.SlimTableFactory();
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory18 = slimTableFactory17.copy();
        boolean boolean20 = slimTableFactory18.hasColon("hi!");
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory21 = slimTableFactory18.copy();
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory22 = slimTableFactory18.copy();
        java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable> wildcardClass24 = slimTableFactory22.getTableType("hi!");
        boolean boolean26 = slimTableFactory22.hasColon("hi!");
        java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable> wildcardClass28 = slimTableFactory22.getTableType("hi!");
        java.lang.String str30 = slimTableFactory22.makeTableType("hi!");
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory31 = slimTableFactory22.copy();
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory32 = slimTableFactory31.copy();
        java.util.Map<java.lang.String, java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable>> strMap33 = slimTableFactory32.tableTypes;
        java.util.Map<java.lang.String, java.lang.String> strMap34 = slimTableFactory32.tableTypeArrays;
        slimTableFactory1.tableTypeArrays = strMap34;
        java.lang.String str37 = slimTableFactory1.makeTableType("hi!");
        org.junit.Assert.assertNotNull(slimTableFactory1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(slimTableFactory4);
        org.junit.Assert.assertNotNull(slimTableFactory5);
        org.junit.Assert.assertNotNull(slimTableFactory6);
        org.junit.Assert.assertNotNull(strMap7);
        org.junit.Assert.assertNotNull(slimTableFactory9);
        org.junit.Assert.assertNotNull(strMap10);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNotNull(strMap14);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertNotNull(slimTableFactory18);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(slimTableFactory21);
        org.junit.Assert.assertNotNull(slimTableFactory22);
        org.junit.Assert.assertNull(wildcardClass24);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNull(wildcardClass28);
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "hi!" + "'", str30, "hi!");
        org.junit.Assert.assertNotNull(slimTableFactory31);
        org.junit.Assert.assertNotNull(slimTableFactory32);
        org.junit.Assert.assertNotNull(strMap33);
        org.junit.Assert.assertNotNull(strMap34);
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "hi!" + "'", str37, "hi!");
    }

    @Test
    public void test18573() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18573");
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory0 = new fitnesse.testsystems.slim.tables.SlimTableFactory();
        java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable> wildcardClass2 = slimTableFactory0.getTableType("");
        java.util.Map<java.lang.String, java.lang.String> strMap3 = slimTableFactory0.tableTypeArrays;
        java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable> wildcardClass5 = slimTableFactory0.getTableType("");
        java.util.Map<java.lang.String, java.lang.String> strMap6 = slimTableFactory0.tableTypeArrays;
        boolean boolean8 = slimTableFactory0.hasColon("");
        java.util.Map<java.lang.String, java.lang.String> strMap9 = slimTableFactory0.tableTypeArrays;
        fitnesse.testsystems.slim.Table table10 = null;
        // The following exception was thrown during execution in test generation
        try {
            slimTableFactory0.parseDefineTableTypeRow(table10, (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(wildcardClass2);
        org.junit.Assert.assertNotNull(strMap3);
        org.junit.Assert.assertNull(wildcardClass5);
        org.junit.Assert.assertNotNull(strMap6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(strMap9);
    }

    @Test
    public void test18574() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18574");
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory0 = new fitnesse.testsystems.slim.tables.SlimTableFactory();
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory1 = slimTableFactory0.copy();
        java.util.Map<java.lang.String, java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable>> strMap2 = slimTableFactory1.tableTypes;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory3 = new fitnesse.testsystems.slim.tables.SlimTableFactory();
        java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable> wildcardClass5 = slimTableFactory3.getTableType("");
        boolean boolean7 = slimTableFactory3.hasColon("");
        java.util.Map<java.lang.String, java.lang.String> strMap8 = slimTableFactory3.tableTypeArrays;
        slimTableFactory1.tableTypeArrays = strMap8;
        java.lang.String str11 = slimTableFactory1.makeTableType("");
        java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable> wildcardClass13 = slimTableFactory1.getTableType("");
        java.lang.String str15 = slimTableFactory1.getFullTableName("hi!");
        java.util.Map<java.lang.String, java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable>> strMap16 = slimTableFactory1.tableTypes;
        java.lang.String str18 = slimTableFactory1.getFullTableName("");
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory19 = slimTableFactory1.copy();
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory20 = slimTableFactory19.copy();
        java.lang.String str22 = slimTableFactory20.getFullTableName("");
        org.junit.Assert.assertNotNull(slimTableFactory1);
        org.junit.Assert.assertNotNull(strMap2);
        org.junit.Assert.assertNull(wildcardClass5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(strMap8);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNull(wildcardClass13);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertNotNull(strMap16);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertNotNull(slimTableFactory19);
        org.junit.Assert.assertNotNull(slimTableFactory20);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
    }

    @Test
    public void test18575() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18575");
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory0 = new fitnesse.testsystems.slim.tables.SlimTableFactory();
        java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable> wildcardClass2 = slimTableFactory0.getTableType("");
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory3 = slimTableFactory0.copy();
        boolean boolean5 = slimTableFactory0.hasColon("hi!");
        java.lang.String str7 = slimTableFactory0.getFullTableName("");
        java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable> wildcardClass9 = slimTableFactory0.getTableType("hi!");
        java.util.Map<java.lang.String, java.lang.String> strMap10 = slimTableFactory0.tableTypeArrays;
        java.util.Map<java.lang.String, java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable>> strMap11 = slimTableFactory0.tableTypes;
        java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable> wildcardClass13 = slimTableFactory0.getTableType("");
        java.util.Map<java.lang.String, java.lang.String> strMap14 = slimTableFactory0.tableTypeArrays;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory15 = slimTableFactory0.copy();
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory16 = slimTableFactory15.copy();
        java.util.Map<java.lang.String, java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable>> strMap17 = slimTableFactory16.tableTypes;
        java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable> wildcardClass19 = slimTableFactory16.getTableType("hi!");
        org.junit.Assert.assertNull(wildcardClass2);
        org.junit.Assert.assertNotNull(slimTableFactory3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNull(wildcardClass9);
        org.junit.Assert.assertNotNull(strMap10);
        org.junit.Assert.assertNotNull(strMap11);
        org.junit.Assert.assertNull(wildcardClass13);
        org.junit.Assert.assertNotNull(strMap14);
        org.junit.Assert.assertNotNull(slimTableFactory15);
        org.junit.Assert.assertNotNull(slimTableFactory16);
        org.junit.Assert.assertNotNull(strMap17);
        org.junit.Assert.assertNull(wildcardClass19);
    }

    @Test
    public void test18576() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18576");
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory0 = new fitnesse.testsystems.slim.tables.SlimTableFactory();
        java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable> wildcardClass2 = slimTableFactory0.getTableType("");
        boolean boolean4 = slimTableFactory0.hasColon("");
        java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable> wildcardClass6 = slimTableFactory0.getTableType("hi!");
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory7 = new fitnesse.testsystems.slim.tables.SlimTableFactory();
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory8 = slimTableFactory7.copy();
        boolean boolean10 = slimTableFactory7.hasColon("hi!");
        java.util.Map<java.lang.String, java.lang.String> strMap11 = slimTableFactory7.tableTypeArrays;
        slimTableFactory0.tableTypeArrays = strMap11;
        java.lang.String str14 = slimTableFactory0.getFullTableName("");
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory15 = slimTableFactory0.copy();
        org.junit.Assert.assertNull(wildcardClass2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(wildcardClass6);
        org.junit.Assert.assertNotNull(slimTableFactory8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(strMap11);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertNotNull(slimTableFactory15);
    }

    @Test
    public void test18577() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18577");
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory0 = new fitnesse.testsystems.slim.tables.SlimTableFactory();
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory1 = slimTableFactory0.copy();
        boolean boolean3 = slimTableFactory1.hasColon("hi!");
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory4 = slimTableFactory1.copy();
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory5 = slimTableFactory1.copy();
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory6 = slimTableFactory5.copy();
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory7 = new fitnesse.testsystems.slim.tables.SlimTableFactory();
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory8 = slimTableFactory7.copy();
        boolean boolean10 = slimTableFactory8.hasColon("hi!");
        java.util.Map<java.lang.String, java.lang.String> strMap11 = slimTableFactory8.tableTypeArrays;
        slimTableFactory6.tableTypeArrays = strMap11;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory13 = new fitnesse.testsystems.slim.tables.SlimTableFactory();
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory14 = slimTableFactory13.copy();
        boolean boolean16 = slimTableFactory14.hasColon("hi!");
        java.util.Map<java.lang.String, java.lang.String> strMap17 = slimTableFactory14.tableTypeArrays;
        java.lang.String str19 = slimTableFactory14.getFullTableName("");
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory20 = new fitnesse.testsystems.slim.tables.SlimTableFactory();
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory21 = slimTableFactory20.copy();
        boolean boolean23 = slimTableFactory21.hasColon("hi!");
        java.util.Map<java.lang.String, java.lang.String> strMap24 = slimTableFactory21.tableTypeArrays;
        java.lang.String str26 = slimTableFactory21.getFullTableName("");
        java.util.Map<java.lang.String, java.lang.String> strMap27 = slimTableFactory21.tableTypeArrays;
        slimTableFactory14.tableTypeArrays = strMap27;
        java.util.Map<java.lang.String, java.lang.String> strMap29 = slimTableFactory14.tableTypeArrays;
        slimTableFactory6.tableTypeArrays = strMap29;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory31 = slimTableFactory6.copy();
        boolean boolean33 = slimTableFactory31.hasColon("");
        java.lang.String str35 = slimTableFactory31.getFullTableName("hi!");
        java.util.Map<java.lang.String, java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable>> strMap36 = slimTableFactory31.tableTypes;
        java.lang.Class<?> wildcardClass37 = strMap36.getClass();
        org.junit.Assert.assertNotNull(slimTableFactory1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(slimTableFactory4);
        org.junit.Assert.assertNotNull(slimTableFactory5);
        org.junit.Assert.assertNotNull(slimTableFactory6);
        org.junit.Assert.assertNotNull(slimTableFactory8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(strMap11);
        org.junit.Assert.assertNotNull(slimTableFactory14);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(strMap17);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertNotNull(slimTableFactory21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNotNull(strMap24);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "" + "'", str26, "");
        org.junit.Assert.assertNotNull(strMap27);
        org.junit.Assert.assertNotNull(strMap29);
        org.junit.Assert.assertNotNull(slimTableFactory31);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "hi!" + "'", str35, "hi!");
        org.junit.Assert.assertNotNull(strMap36);
        org.junit.Assert.assertNotNull(wildcardClass37);
    }

    @Test
    public void test18578() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18578");
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory0 = new fitnesse.testsystems.slim.tables.SlimTableFactory();
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory1 = slimTableFactory0.copy();
        boolean boolean3 = slimTableFactory1.hasColon("hi!");
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory4 = slimTableFactory1.copy();
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory5 = slimTableFactory1.copy();
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory6 = slimTableFactory1.copy();
        boolean boolean8 = slimTableFactory6.hasColon("hi!");
        java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable> wildcardClass10 = slimTableFactory6.getTableType("");
        java.util.Map<java.lang.String, java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable>> strMap11 = slimTableFactory6.tableTypes;
        fitnesse.testsystems.slim.Table table12 = null;
        fitnesse.testsystems.slim.SlimTestContext slimTestContext14 = null;
        // The following exception was thrown during execution in test generation
        try {
            fitnesse.testsystems.slim.tables.SlimTable slimTable15 = slimTableFactory6.makeSlimTable(table12, "", slimTestContext14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(slimTableFactory1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(slimTableFactory4);
        org.junit.Assert.assertNotNull(slimTableFactory5);
        org.junit.Assert.assertNotNull(slimTableFactory6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(wildcardClass10);
        org.junit.Assert.assertNotNull(strMap11);
    }

    @Test
    public void test18579() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18579");
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory0 = new fitnesse.testsystems.slim.tables.SlimTableFactory();
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory1 = slimTableFactory0.copy();
        boolean boolean3 = slimTableFactory1.hasColon("hi!");
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory4 = slimTableFactory1.copy();
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory5 = slimTableFactory1.copy();
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory6 = slimTableFactory1.copy();
        java.util.Map<java.lang.String, java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable>> strMap7 = slimTableFactory1.tableTypes;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory8 = slimTableFactory1.copy();
        java.util.Map<java.lang.String, java.lang.String> strMap9 = slimTableFactory8.tableTypeArrays;
        java.lang.String str11 = slimTableFactory8.makeTableType("");
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory12 = slimTableFactory8.copy();
        boolean boolean14 = slimTableFactory12.hasColon("hi!");
        org.junit.Assert.assertNotNull(slimTableFactory1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(slimTableFactory4);
        org.junit.Assert.assertNotNull(slimTableFactory5);
        org.junit.Assert.assertNotNull(slimTableFactory6);
        org.junit.Assert.assertNotNull(strMap7);
        org.junit.Assert.assertNotNull(slimTableFactory8);
        org.junit.Assert.assertNotNull(strMap9);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNotNull(slimTableFactory12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test18580() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18580");
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory0 = new fitnesse.testsystems.slim.tables.SlimTableFactory();
        java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable> wildcardClass2 = slimTableFactory0.getTableType("");
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory3 = slimTableFactory0.copy();
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory4 = slimTableFactory3.copy();
        java.lang.String str6 = slimTableFactory3.makeTableType("");
        java.lang.String str8 = slimTableFactory3.makeTableType("");
        java.util.Map<java.lang.String, java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable>> strMap9 = slimTableFactory3.tableTypes;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory10 = new fitnesse.testsystems.slim.tables.SlimTableFactory();
        java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable> wildcardClass12 = slimTableFactory10.getTableType("");
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory13 = slimTableFactory10.copy();
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory14 = new fitnesse.testsystems.slim.tables.SlimTableFactory();
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory15 = slimTableFactory14.copy();
        java.util.Map<java.lang.String, java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable>> strMap16 = slimTableFactory15.tableTypes;
        boolean boolean18 = slimTableFactory15.hasColon("");
        boolean boolean20 = slimTableFactory15.hasColon("hi!");
        java.util.Map<java.lang.String, java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable>> strMap21 = slimTableFactory15.tableTypes;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory22 = new fitnesse.testsystems.slim.tables.SlimTableFactory();
        java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable> wildcardClass24 = slimTableFactory22.getTableType("");
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory25 = slimTableFactory22.copy();
        java.util.Map<java.lang.String, java.lang.String> strMap26 = slimTableFactory25.tableTypeArrays;
        slimTableFactory15.tableTypeArrays = strMap26;
        slimTableFactory10.tableTypeArrays = strMap26;
        java.util.Map<java.lang.String, java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable>> strMap29 = slimTableFactory10.tableTypes;
        java.util.Map<java.lang.String, java.lang.String> strMap30 = slimTableFactory10.tableTypeArrays;
        slimTableFactory3.tableTypeArrays = strMap30;
        java.util.Map<java.lang.String, java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable>> strMap32 = slimTableFactory3.tableTypes;
        java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable> wildcardClass34 = slimTableFactory3.getTableType("");
        java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable> wildcardClass36 = slimTableFactory3.getTableType("");
        org.junit.Assert.assertNull(wildcardClass2);
        org.junit.Assert.assertNotNull(slimTableFactory3);
        org.junit.Assert.assertNotNull(slimTableFactory4);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNotNull(strMap9);
        org.junit.Assert.assertNull(wildcardClass12);
        org.junit.Assert.assertNotNull(slimTableFactory13);
        org.junit.Assert.assertNotNull(slimTableFactory15);
        org.junit.Assert.assertNotNull(strMap16);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(strMap21);
        org.junit.Assert.assertNull(wildcardClass24);
        org.junit.Assert.assertNotNull(slimTableFactory25);
        org.junit.Assert.assertNotNull(strMap26);
        org.junit.Assert.assertNotNull(strMap29);
        org.junit.Assert.assertNotNull(strMap30);
        org.junit.Assert.assertNotNull(strMap32);
        org.junit.Assert.assertNull(wildcardClass34);
        org.junit.Assert.assertNull(wildcardClass36);
    }

    @Test
    public void test18581() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18581");
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory0 = new fitnesse.testsystems.slim.tables.SlimTableFactory();
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory1 = slimTableFactory0.copy();
        boolean boolean3 = slimTableFactory1.hasColon("hi!");
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory4 = slimTableFactory1.copy();
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory5 = slimTableFactory1.copy();
        java.lang.String str7 = slimTableFactory5.getFullTableName("hi!");
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory8 = slimTableFactory5.copy();
        java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable> wildcardClass10 = slimTableFactory5.getTableType("hi!");
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory11 = new fitnesse.testsystems.slim.tables.SlimTableFactory();
        java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable> wildcardClass13 = slimTableFactory11.getTableType("");
        java.util.Map<java.lang.String, java.lang.String> strMap14 = slimTableFactory11.tableTypeArrays;
        java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable> wildcardClass16 = slimTableFactory11.getTableType("");
        java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable> wildcardClass18 = slimTableFactory11.getTableType("hi!");
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory19 = slimTableFactory11.copy();
        boolean boolean21 = slimTableFactory11.hasColon("");
        java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable> wildcardClass23 = slimTableFactory11.getTableType("hi!");
        java.util.Map<java.lang.String, java.lang.String> strMap24 = slimTableFactory11.tableTypeArrays;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory25 = new fitnesse.testsystems.slim.tables.SlimTableFactory();
        java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable> wildcardClass27 = slimTableFactory25.getTableType("");
        boolean boolean29 = slimTableFactory25.hasColon("");
        java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable> wildcardClass31 = slimTableFactory25.getTableType("hi!");
        java.lang.String str33 = slimTableFactory25.getFullTableName("hi!");
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory34 = slimTableFactory25.copy();
        java.lang.String str36 = slimTableFactory25.getFullTableName("hi!");
        java.util.Map<java.lang.String, java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable>> strMap37 = slimTableFactory25.tableTypes;
        java.lang.String str39 = slimTableFactory25.makeTableType("hi!");
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory40 = new fitnesse.testsystems.slim.tables.SlimTableFactory();
        java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable> wildcardClass42 = slimTableFactory40.getTableType("");
        boolean boolean44 = slimTableFactory40.hasColon("");
        java.lang.String str46 = slimTableFactory40.makeTableType("hi!");
        java.util.Map<java.lang.String, java.lang.String> strMap47 = slimTableFactory40.tableTypeArrays;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory48 = new fitnesse.testsystems.slim.tables.SlimTableFactory();
        java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable> wildcardClass50 = slimTableFactory48.getTableType("");
        java.util.Map<java.lang.String, java.lang.String> strMap51 = slimTableFactory48.tableTypeArrays;
        boolean boolean53 = slimTableFactory48.hasColon("");
        java.lang.String str55 = slimTableFactory48.makeTableType("");
        java.util.Map<java.lang.String, java.lang.String> strMap56 = slimTableFactory48.tableTypeArrays;
        slimTableFactory40.tableTypeArrays = strMap56;
        slimTableFactory25.tableTypeArrays = strMap56;
        slimTableFactory11.tableTypeArrays = strMap56;
        slimTableFactory5.tableTypeArrays = strMap56;
        java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable> wildcardClass62 = slimTableFactory5.getTableType("hi!");
        org.junit.Assert.assertNotNull(slimTableFactory1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(slimTableFactory4);
        org.junit.Assert.assertNotNull(slimTableFactory5);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertNotNull(slimTableFactory8);
        org.junit.Assert.assertNull(wildcardClass10);
        org.junit.Assert.assertNull(wildcardClass13);
        org.junit.Assert.assertNotNull(strMap14);
        org.junit.Assert.assertNull(wildcardClass16);
        org.junit.Assert.assertNull(wildcardClass18);
        org.junit.Assert.assertNotNull(slimTableFactory19);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNull(wildcardClass23);
        org.junit.Assert.assertNotNull(strMap24);
        org.junit.Assert.assertNull(wildcardClass27);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertNull(wildcardClass31);
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "hi!" + "'", str33, "hi!");
        org.junit.Assert.assertNotNull(slimTableFactory34);
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "hi!" + "'", str36, "hi!");
        org.junit.Assert.assertNotNull(strMap37);
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "hi!" + "'", str39, "hi!");
        org.junit.Assert.assertNull(wildcardClass42);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertEquals("'" + str46 + "' != '" + "hi!" + "'", str46, "hi!");
        org.junit.Assert.assertNotNull(strMap47);
        org.junit.Assert.assertNull(wildcardClass50);
        org.junit.Assert.assertNotNull(strMap51);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + false + "'", boolean53 == false);
        org.junit.Assert.assertEquals("'" + str55 + "' != '" + "" + "'", str55, "");
        org.junit.Assert.assertNotNull(strMap56);
        org.junit.Assert.assertNull(wildcardClass62);
    }

    @Test
    public void test18582() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18582");
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory0 = new fitnesse.testsystems.slim.tables.SlimTableFactory();
        java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable> wildcardClass2 = slimTableFactory0.getTableType("");
        java.util.Map<java.lang.String, java.lang.String> strMap3 = slimTableFactory0.tableTypeArrays;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory4 = slimTableFactory0.copy();
        boolean boolean6 = slimTableFactory4.hasColon("");
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory7 = new fitnesse.testsystems.slim.tables.SlimTableFactory();
        java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable> wildcardClass9 = slimTableFactory7.getTableType("");
        java.util.Map<java.lang.String, java.lang.String> strMap10 = slimTableFactory7.tableTypeArrays;
        boolean boolean12 = slimTableFactory7.hasColon("");
        java.lang.String str14 = slimTableFactory7.makeTableType("");
        java.util.Map<java.lang.String, java.lang.String> strMap15 = slimTableFactory7.tableTypeArrays;
        slimTableFactory4.tableTypeArrays = strMap15;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory17 = new fitnesse.testsystems.slim.tables.SlimTableFactory();
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory18 = slimTableFactory17.copy();
        boolean boolean20 = slimTableFactory18.hasColon("hi!");
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory21 = slimTableFactory18.copy();
        java.util.Map<java.lang.String, java.lang.String> strMap22 = slimTableFactory18.tableTypeArrays;
        java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable> wildcardClass24 = slimTableFactory18.getTableType("");
        java.util.Map<java.lang.String, java.lang.String> strMap25 = slimTableFactory18.tableTypeArrays;
        slimTableFactory4.tableTypeArrays = strMap25;
        java.util.Map<java.lang.String, java.lang.String> strMap27 = slimTableFactory4.tableTypeArrays;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory28 = new fitnesse.testsystems.slim.tables.SlimTableFactory();
        java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable> wildcardClass30 = slimTableFactory28.getTableType("");
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory31 = slimTableFactory28.copy();
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory32 = new fitnesse.testsystems.slim.tables.SlimTableFactory();
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory33 = slimTableFactory32.copy();
        java.util.Map<java.lang.String, java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable>> strMap34 = slimTableFactory33.tableTypes;
        boolean boolean36 = slimTableFactory33.hasColon("");
        boolean boolean38 = slimTableFactory33.hasColon("hi!");
        java.util.Map<java.lang.String, java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable>> strMap39 = slimTableFactory33.tableTypes;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory40 = new fitnesse.testsystems.slim.tables.SlimTableFactory();
        java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable> wildcardClass42 = slimTableFactory40.getTableType("");
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory43 = slimTableFactory40.copy();
        java.util.Map<java.lang.String, java.lang.String> strMap44 = slimTableFactory43.tableTypeArrays;
        slimTableFactory33.tableTypeArrays = strMap44;
        slimTableFactory28.tableTypeArrays = strMap44;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory47 = slimTableFactory28.copy();
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory48 = slimTableFactory47.copy();
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory49 = slimTableFactory47.copy();
        java.util.Map<java.lang.String, java.lang.String> strMap50 = slimTableFactory49.tableTypeArrays;
        slimTableFactory4.tableTypeArrays = strMap50;
        java.lang.String str53 = slimTableFactory4.makeTableType("hi!");
        java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable> wildcardClass55 = slimTableFactory4.getTableType("hi!");
        org.junit.Assert.assertNull(wildcardClass2);
        org.junit.Assert.assertNotNull(strMap3);
        org.junit.Assert.assertNotNull(slimTableFactory4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(wildcardClass9);
        org.junit.Assert.assertNotNull(strMap10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertNotNull(strMap15);
        org.junit.Assert.assertNotNull(slimTableFactory18);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(slimTableFactory21);
        org.junit.Assert.assertNotNull(strMap22);
        org.junit.Assert.assertNull(wildcardClass24);
        org.junit.Assert.assertNotNull(strMap25);
        org.junit.Assert.assertNotNull(strMap27);
        org.junit.Assert.assertNull(wildcardClass30);
        org.junit.Assert.assertNotNull(slimTableFactory31);
        org.junit.Assert.assertNotNull(slimTableFactory33);
        org.junit.Assert.assertNotNull(strMap34);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertNotNull(strMap39);
        org.junit.Assert.assertNull(wildcardClass42);
        org.junit.Assert.assertNotNull(slimTableFactory43);
        org.junit.Assert.assertNotNull(strMap44);
        org.junit.Assert.assertNotNull(slimTableFactory47);
        org.junit.Assert.assertNotNull(slimTableFactory48);
        org.junit.Assert.assertNotNull(slimTableFactory49);
        org.junit.Assert.assertNotNull(strMap50);
        org.junit.Assert.assertEquals("'" + str53 + "' != '" + "hi!" + "'", str53, "hi!");
        org.junit.Assert.assertNull(wildcardClass55);
    }

    @Test
    public void test18583() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18583");
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory0 = new fitnesse.testsystems.slim.tables.SlimTableFactory();
        java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable> wildcardClass2 = slimTableFactory0.getTableType("");
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory3 = slimTableFactory0.copy();
        boolean boolean5 = slimTableFactory0.hasColon("");
        java.util.Map<java.lang.String, java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable>> strMap6 = slimTableFactory0.tableTypes;
        java.lang.String str8 = slimTableFactory0.getFullTableName("hi!");
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory9 = new fitnesse.testsystems.slim.tables.SlimTableFactory();
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory10 = slimTableFactory9.copy();
        boolean boolean12 = slimTableFactory10.hasColon("hi!");
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory13 = slimTableFactory10.copy();
        java.util.Map<java.lang.String, java.lang.String> strMap14 = slimTableFactory10.tableTypeArrays;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory15 = new fitnesse.testsystems.slim.tables.SlimTableFactory();
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory16 = slimTableFactory15.copy();
        boolean boolean18 = slimTableFactory16.hasColon("hi!");
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory19 = slimTableFactory16.copy();
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory20 = slimTableFactory16.copy();
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory21 = slimTableFactory16.copy();
        java.util.Map<java.lang.String, java.lang.String> strMap22 = slimTableFactory21.tableTypeArrays;
        slimTableFactory10.tableTypeArrays = strMap22;
        slimTableFactory0.tableTypeArrays = strMap22;
        java.util.Map<java.lang.String, java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable>> strMap25 = slimTableFactory0.tableTypes;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory26 = new fitnesse.testsystems.slim.tables.SlimTableFactory();
        java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable> wildcardClass28 = slimTableFactory26.getTableType("");
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory29 = slimTableFactory26.copy();
        boolean boolean31 = slimTableFactory26.hasColon("hi!");
        java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable> wildcardClass33 = slimTableFactory26.getTableType("hi!");
        java.lang.String str35 = slimTableFactory26.getFullTableName("");
        java.lang.String str37 = slimTableFactory26.makeTableType("");
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory38 = new fitnesse.testsystems.slim.tables.SlimTableFactory();
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory39 = slimTableFactory38.copy();
        boolean boolean41 = slimTableFactory39.hasColon("hi!");
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory42 = slimTableFactory39.copy();
        java.util.Map<java.lang.String, java.lang.String> strMap43 = slimTableFactory39.tableTypeArrays;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory44 = new fitnesse.testsystems.slim.tables.SlimTableFactory();
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory45 = slimTableFactory44.copy();
        boolean boolean47 = slimTableFactory45.hasColon("hi!");
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory48 = slimTableFactory45.copy();
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory49 = slimTableFactory45.copy();
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory50 = slimTableFactory45.copy();
        java.util.Map<java.lang.String, java.lang.String> strMap51 = slimTableFactory50.tableTypeArrays;
        slimTableFactory39.tableTypeArrays = strMap51;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory53 = new fitnesse.testsystems.slim.tables.SlimTableFactory();
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory54 = new fitnesse.testsystems.slim.tables.SlimTableFactory();
        java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable> wildcardClass56 = slimTableFactory54.getTableType("");
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory57 = slimTableFactory54.copy();
        boolean boolean59 = slimTableFactory54.hasColon("");
        java.util.Map<java.lang.String, java.lang.String> strMap60 = slimTableFactory54.tableTypeArrays;
        slimTableFactory53.tableTypeArrays = strMap60;
        slimTableFactory39.tableTypeArrays = strMap60;
        slimTableFactory26.tableTypeArrays = strMap60;
        slimTableFactory0.tableTypeArrays = strMap60;
        java.util.Map<java.lang.String, java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable>> strMap65 = slimTableFactory0.tableTypes;
        java.lang.String str67 = slimTableFactory0.makeTableType("");
        java.util.Map<java.lang.String, java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable>> strMap68 = slimTableFactory0.tableTypes;
        org.junit.Assert.assertNull(wildcardClass2);
        org.junit.Assert.assertNotNull(slimTableFactory3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(strMap6);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertNotNull(slimTableFactory10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(slimTableFactory13);
        org.junit.Assert.assertNotNull(strMap14);
        org.junit.Assert.assertNotNull(slimTableFactory16);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(slimTableFactory19);
        org.junit.Assert.assertNotNull(slimTableFactory20);
        org.junit.Assert.assertNotNull(slimTableFactory21);
        org.junit.Assert.assertNotNull(strMap22);
        org.junit.Assert.assertNotNull(strMap25);
        org.junit.Assert.assertNull(wildcardClass28);
        org.junit.Assert.assertNotNull(slimTableFactory29);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertNull(wildcardClass33);
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "" + "'", str35, "");
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "" + "'", str37, "");
        org.junit.Assert.assertNotNull(slimTableFactory39);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertNotNull(slimTableFactory42);
        org.junit.Assert.assertNotNull(strMap43);
        org.junit.Assert.assertNotNull(slimTableFactory45);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertNotNull(slimTableFactory48);
        org.junit.Assert.assertNotNull(slimTableFactory49);
        org.junit.Assert.assertNotNull(slimTableFactory50);
        org.junit.Assert.assertNotNull(strMap51);
        org.junit.Assert.assertNull(wildcardClass56);
        org.junit.Assert.assertNotNull(slimTableFactory57);
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + false + "'", boolean59 == false);
        org.junit.Assert.assertNotNull(strMap60);
        org.junit.Assert.assertNotNull(strMap65);
        org.junit.Assert.assertEquals("'" + str67 + "' != '" + "" + "'", str67, "");
        org.junit.Assert.assertNotNull(strMap68);
    }

    @Test
    public void test18584() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18584");
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory0 = new fitnesse.testsystems.slim.tables.SlimTableFactory();
        java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable> wildcardClass2 = slimTableFactory0.getTableType("");
        boolean boolean4 = slimTableFactory0.hasColon("");
        java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable> wildcardClass6 = slimTableFactory0.getTableType("hi!");
        java.lang.String str8 = slimTableFactory0.getFullTableName("hi!");
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory9 = slimTableFactory0.copy();
        java.lang.String str11 = slimTableFactory0.getFullTableName("hi!");
        java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable> wildcardClass13 = slimTableFactory0.getTableType("hi!");
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory14 = slimTableFactory0.copy();
        java.util.Map<java.lang.String, java.lang.String> strMap15 = slimTableFactory0.tableTypeArrays;
        java.util.Map<java.lang.String, java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable>> strMap16 = slimTableFactory0.tableTypes;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory17 = new fitnesse.testsystems.slim.tables.SlimTableFactory();
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory18 = slimTableFactory17.copy();
        boolean boolean20 = slimTableFactory18.hasColon("hi!");
        java.util.Map<java.lang.String, java.lang.String> strMap21 = slimTableFactory18.tableTypeArrays;
        java.lang.String str23 = slimTableFactory18.getFullTableName("");
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory24 = new fitnesse.testsystems.slim.tables.SlimTableFactory();
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory25 = slimTableFactory24.copy();
        boolean boolean27 = slimTableFactory25.hasColon("hi!");
        java.util.Map<java.lang.String, java.lang.String> strMap28 = slimTableFactory25.tableTypeArrays;
        java.lang.String str30 = slimTableFactory25.getFullTableName("");
        java.util.Map<java.lang.String, java.lang.String> strMap31 = slimTableFactory25.tableTypeArrays;
        slimTableFactory18.tableTypeArrays = strMap31;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory33 = slimTableFactory18.copy();
        java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable> wildcardClass35 = slimTableFactory18.getTableType("");
        java.util.Map<java.lang.String, java.lang.String> strMap36 = slimTableFactory18.tableTypeArrays;
        slimTableFactory0.tableTypeArrays = strMap36;
        org.junit.Assert.assertNull(wildcardClass2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(wildcardClass6);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertNotNull(slimTableFactory9);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertNull(wildcardClass13);
        org.junit.Assert.assertNotNull(slimTableFactory14);
        org.junit.Assert.assertNotNull(strMap15);
        org.junit.Assert.assertNotNull(strMap16);
        org.junit.Assert.assertNotNull(slimTableFactory18);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(strMap21);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
        org.junit.Assert.assertNotNull(slimTableFactory25);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNotNull(strMap28);
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "" + "'", str30, "");
        org.junit.Assert.assertNotNull(strMap31);
        org.junit.Assert.assertNotNull(slimTableFactory33);
        org.junit.Assert.assertNull(wildcardClass35);
        org.junit.Assert.assertNotNull(strMap36);
    }

    @Test
    public void test18585() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18585");
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory0 = new fitnesse.testsystems.slim.tables.SlimTableFactory();
        java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable> wildcardClass2 = slimTableFactory0.getTableType("");
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory3 = slimTableFactory0.copy();
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory4 = slimTableFactory3.copy();
        java.lang.String str6 = slimTableFactory3.makeTableType("");
        java.lang.String str8 = slimTableFactory3.makeTableType("");
        java.util.Map<java.lang.String, java.lang.String> strMap9 = slimTableFactory3.tableTypeArrays;
        java.util.Map<java.lang.String, java.lang.String> strMap10 = slimTableFactory3.tableTypeArrays;
        java.util.Map<java.lang.String, java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable>> strMap11 = slimTableFactory3.tableTypes;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory12 = slimTableFactory3.copy();
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory13 = slimTableFactory12.copy();
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory14 = new fitnesse.testsystems.slim.tables.SlimTableFactory();
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory15 = slimTableFactory14.copy();
        java.util.Map<java.lang.String, java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable>> strMap16 = slimTableFactory15.tableTypes;
        boolean boolean18 = slimTableFactory15.hasColon("");
        boolean boolean20 = slimTableFactory15.hasColon("hi!");
        boolean boolean22 = slimTableFactory15.hasColon("");
        java.lang.String str24 = slimTableFactory15.makeTableType("");
        java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable> wildcardClass26 = slimTableFactory15.getTableType("");
        java.util.Map<java.lang.String, java.lang.String> strMap27 = slimTableFactory15.tableTypeArrays;
        slimTableFactory13.tableTypeArrays = strMap27;
        java.lang.String str30 = slimTableFactory13.makeTableType("hi!");
        org.junit.Assert.assertNull(wildcardClass2);
        org.junit.Assert.assertNotNull(slimTableFactory3);
        org.junit.Assert.assertNotNull(slimTableFactory4);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNotNull(strMap9);
        org.junit.Assert.assertNotNull(strMap10);
        org.junit.Assert.assertNotNull(strMap11);
        org.junit.Assert.assertNotNull(slimTableFactory12);
        org.junit.Assert.assertNotNull(slimTableFactory13);
        org.junit.Assert.assertNotNull(slimTableFactory15);
        org.junit.Assert.assertNotNull(strMap16);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "" + "'", str24, "");
        org.junit.Assert.assertNull(wildcardClass26);
        org.junit.Assert.assertNotNull(strMap27);
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "hi!" + "'", str30, "hi!");
    }

    @Test
    public void test18586() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18586");
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory0 = new fitnesse.testsystems.slim.tables.SlimTableFactory();
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory1 = slimTableFactory0.copy();
        boolean boolean3 = slimTableFactory1.hasColon("hi!");
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory4 = slimTableFactory1.copy();
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory5 = slimTableFactory1.copy();
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory6 = slimTableFactory1.copy();
        java.util.Map<java.lang.String, java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable>> strMap7 = slimTableFactory1.tableTypes;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory8 = new fitnesse.testsystems.slim.tables.SlimTableFactory();
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory9 = slimTableFactory8.copy();
        java.util.Map<java.lang.String, java.lang.String> strMap10 = slimTableFactory8.tableTypeArrays;
        slimTableFactory1.tableTypeArrays = strMap10;
        java.lang.String str13 = slimTableFactory1.makeTableType("");
        java.lang.String str15 = slimTableFactory1.makeTableType("hi!");
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory16 = slimTableFactory1.copy();
        java.lang.Class<?> wildcardClass17 = slimTableFactory1.getClass();
        org.junit.Assert.assertNotNull(slimTableFactory1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(slimTableFactory4);
        org.junit.Assert.assertNotNull(slimTableFactory5);
        org.junit.Assert.assertNotNull(slimTableFactory6);
        org.junit.Assert.assertNotNull(strMap7);
        org.junit.Assert.assertNotNull(slimTableFactory9);
        org.junit.Assert.assertNotNull(strMap10);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertNotNull(slimTableFactory16);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test18587() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18587");
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory0 = new fitnesse.testsystems.slim.tables.SlimTableFactory();
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory1 = slimTableFactory0.copy();
        boolean boolean3 = slimTableFactory1.hasColon("hi!");
        java.util.Map<java.lang.String, java.lang.String> strMap4 = slimTableFactory1.tableTypeArrays;
        java.lang.String str6 = slimTableFactory1.getFullTableName("");
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory7 = new fitnesse.testsystems.slim.tables.SlimTableFactory();
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory8 = slimTableFactory7.copy();
        boolean boolean10 = slimTableFactory8.hasColon("hi!");
        java.util.Map<java.lang.String, java.lang.String> strMap11 = slimTableFactory8.tableTypeArrays;
        java.lang.String str13 = slimTableFactory8.getFullTableName("");
        java.util.Map<java.lang.String, java.lang.String> strMap14 = slimTableFactory8.tableTypeArrays;
        slimTableFactory1.tableTypeArrays = strMap14;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory16 = slimTableFactory1.copy();
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory17 = slimTableFactory1.copy();
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory18 = new fitnesse.testsystems.slim.tables.SlimTableFactory();
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory19 = slimTableFactory18.copy();
        boolean boolean21 = slimTableFactory19.hasColon("hi!");
        java.util.Map<java.lang.String, java.lang.String> strMap22 = slimTableFactory19.tableTypeArrays;
        slimTableFactory17.tableTypeArrays = strMap22;
        java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable> wildcardClass25 = slimTableFactory17.getTableType("");
        java.lang.String str27 = slimTableFactory17.makeTableType("");
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory28 = slimTableFactory17.copy();
        java.lang.String str30 = slimTableFactory17.getFullTableName("");
        fitnesse.testsystems.slim.Table table31 = null;
        fitnesse.testsystems.slim.SlimTestContext slimTestContext33 = null;
        // The following exception was thrown during execution in test generation
        try {
            fitnesse.testsystems.slim.tables.SlimTable slimTable34 = slimTableFactory17.makeSlimTable(table31, "", slimTestContext33);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(slimTableFactory1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(strMap4);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(slimTableFactory8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(strMap11);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNotNull(strMap14);
        org.junit.Assert.assertNotNull(slimTableFactory16);
        org.junit.Assert.assertNotNull(slimTableFactory17);
        org.junit.Assert.assertNotNull(slimTableFactory19);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(strMap22);
        org.junit.Assert.assertNull(wildcardClass25);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "" + "'", str27, "");
        org.junit.Assert.assertNotNull(slimTableFactory28);
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "" + "'", str30, "");
    }

    @Test
    public void test18588() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18588");
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory0 = new fitnesse.testsystems.slim.tables.SlimTableFactory();
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory1 = slimTableFactory0.copy();
        java.util.Map<java.lang.String, java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable>> strMap2 = slimTableFactory1.tableTypes;
        boolean boolean4 = slimTableFactory1.hasColon("");
        boolean boolean6 = slimTableFactory1.hasColon("hi!");
        boolean boolean8 = slimTableFactory1.hasColon("");
        java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable> wildcardClass10 = slimTableFactory1.getTableType("hi!");
        java.util.Map<java.lang.String, java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable>> strMap11 = slimTableFactory1.tableTypes;
        java.util.Map<java.lang.String, java.lang.String> strMap12 = slimTableFactory1.tableTypeArrays;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory13 = slimTableFactory1.copy();
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory14 = slimTableFactory1.copy();
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory15 = slimTableFactory14.copy();
        java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable> wildcardClass17 = slimTableFactory15.getTableType("");
        java.util.Map<java.lang.String, java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable>> strMap18 = slimTableFactory15.tableTypes;
        boolean boolean20 = slimTableFactory15.hasColon("");
        org.junit.Assert.assertNotNull(slimTableFactory1);
        org.junit.Assert.assertNotNull(strMap2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(wildcardClass10);
        org.junit.Assert.assertNotNull(strMap11);
        org.junit.Assert.assertNotNull(strMap12);
        org.junit.Assert.assertNotNull(slimTableFactory13);
        org.junit.Assert.assertNotNull(slimTableFactory14);
        org.junit.Assert.assertNotNull(slimTableFactory15);
        org.junit.Assert.assertNull(wildcardClass17);
        org.junit.Assert.assertNotNull(strMap18);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
    }

    @Test
    public void test18589() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18589");
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory0 = new fitnesse.testsystems.slim.tables.SlimTableFactory();
        java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable> wildcardClass2 = slimTableFactory0.getTableType("");
        boolean boolean4 = slimTableFactory0.hasColon("");
        java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable> wildcardClass6 = slimTableFactory0.getTableType("hi!");
        java.lang.String str8 = slimTableFactory0.getFullTableName("hi!");
        boolean boolean10 = slimTableFactory0.hasColon("hi!");
        org.junit.Assert.assertNull(wildcardClass2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(wildcardClass6);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test18590() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18590");
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory0 = new fitnesse.testsystems.slim.tables.SlimTableFactory();
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory1 = slimTableFactory0.copy();
        boolean boolean3 = slimTableFactory1.hasColon("hi!");
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory4 = slimTableFactory1.copy();
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory5 = slimTableFactory1.copy();
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory6 = slimTableFactory1.copy();
        boolean boolean8 = slimTableFactory6.hasColon("hi!");
        java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable> wildcardClass10 = slimTableFactory6.getTableType("");
        java.util.Map<java.lang.String, java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable>> strMap11 = slimTableFactory6.tableTypes;
        boolean boolean13 = slimTableFactory6.hasColon("hi!");
        fitnesse.testsystems.slim.Table table14 = null;
        fitnesse.testsystems.slim.SlimTestContext slimTestContext16 = null;
        // The following exception was thrown during execution in test generation
        try {
            fitnesse.testsystems.slim.tables.SlimTable slimTable17 = slimTableFactory6.makeSlimTable(table14, "", slimTestContext16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(slimTableFactory1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(slimTableFactory4);
        org.junit.Assert.assertNotNull(slimTableFactory5);
        org.junit.Assert.assertNotNull(slimTableFactory6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(wildcardClass10);
        org.junit.Assert.assertNotNull(strMap11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test18591() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18591");
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory0 = new fitnesse.testsystems.slim.tables.SlimTableFactory();
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory1 = slimTableFactory0.copy();
        java.util.Map<java.lang.String, java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable>> strMap2 = slimTableFactory1.tableTypes;
        boolean boolean4 = slimTableFactory1.hasColon("");
        boolean boolean6 = slimTableFactory1.hasColon("hi!");
        java.util.Map<java.lang.String, java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable>> strMap7 = slimTableFactory1.tableTypes;
        java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable> wildcardClass9 = slimTableFactory1.getTableType("hi!");
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory10 = slimTableFactory1.copy();
        java.lang.String str12 = slimTableFactory10.makeTableType("");
        java.lang.Class<?> wildcardClass13 = slimTableFactory10.getClass();
        org.junit.Assert.assertNotNull(slimTableFactory1);
        org.junit.Assert.assertNotNull(strMap2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(strMap7);
        org.junit.Assert.assertNull(wildcardClass9);
        org.junit.Assert.assertNotNull(slimTableFactory10);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test18592() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18592");
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory0 = new fitnesse.testsystems.slim.tables.SlimTableFactory();
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory1 = slimTableFactory0.copy();
        boolean boolean3 = slimTableFactory1.hasColon("hi!");
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory4 = slimTableFactory1.copy();
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory5 = slimTableFactory1.copy();
        java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable> wildcardClass7 = slimTableFactory5.getTableType("hi!");
        java.util.Map<java.lang.String, java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable>> strMap8 = slimTableFactory5.tableTypes;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory9 = new fitnesse.testsystems.slim.tables.SlimTableFactory();
        java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable> wildcardClass11 = slimTableFactory9.getTableType("");
        java.util.Map<java.lang.String, java.lang.String> strMap12 = slimTableFactory9.tableTypeArrays;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory13 = slimTableFactory9.copy();
        java.util.Map<java.lang.String, java.lang.String> strMap14 = slimTableFactory9.tableTypeArrays;
        slimTableFactory5.tableTypeArrays = strMap14;
        java.lang.String str17 = slimTableFactory5.getFullTableName("hi!");
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory18 = slimTableFactory5.copy();
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory19 = new fitnesse.testsystems.slim.tables.SlimTableFactory();
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory20 = slimTableFactory19.copy();
        boolean boolean22 = slimTableFactory20.hasColon("hi!");
        java.util.Map<java.lang.String, java.lang.String> strMap23 = slimTableFactory20.tableTypeArrays;
        java.lang.String str25 = slimTableFactory20.getFullTableName("");
        java.util.Map<java.lang.String, java.lang.String> strMap26 = slimTableFactory20.tableTypeArrays;
        slimTableFactory5.tableTypeArrays = strMap26;
        java.util.Map<java.lang.String, java.lang.String> strMap28 = slimTableFactory5.tableTypeArrays;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory29 = slimTableFactory5.copy();
        java.util.Map<java.lang.String, java.lang.String> strMap30 = slimTableFactory29.tableTypeArrays;
        fitnesse.testsystems.slim.Table table31 = null;
        // The following exception was thrown during execution in test generation
        try {
            slimTableFactory29.parseDefineTableTypeRow(table31, (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(slimTableFactory1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(slimTableFactory4);
        org.junit.Assert.assertNotNull(slimTableFactory5);
        org.junit.Assert.assertNull(wildcardClass7);
        org.junit.Assert.assertNotNull(strMap8);
        org.junit.Assert.assertNull(wildcardClass11);
        org.junit.Assert.assertNotNull(strMap12);
        org.junit.Assert.assertNotNull(slimTableFactory13);
        org.junit.Assert.assertNotNull(strMap14);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
        org.junit.Assert.assertNotNull(slimTableFactory18);
        org.junit.Assert.assertNotNull(slimTableFactory20);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(strMap23);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "" + "'", str25, "");
        org.junit.Assert.assertNotNull(strMap26);
        org.junit.Assert.assertNotNull(strMap28);
        org.junit.Assert.assertNotNull(slimTableFactory29);
        org.junit.Assert.assertNotNull(strMap30);
    }

    @Test
    public void test18593() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18593");
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory0 = new fitnesse.testsystems.slim.tables.SlimTableFactory();
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory1 = slimTableFactory0.copy();
        java.util.Map<java.lang.String, java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable>> strMap2 = slimTableFactory1.tableTypes;
        boolean boolean4 = slimTableFactory1.hasColon("");
        boolean boolean6 = slimTableFactory1.hasColon("hi!");
        java.util.Map<java.lang.String, java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable>> strMap7 = slimTableFactory1.tableTypes;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory8 = new fitnesse.testsystems.slim.tables.SlimTableFactory();
        java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable> wildcardClass10 = slimTableFactory8.getTableType("");
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory11 = slimTableFactory8.copy();
        java.util.Map<java.lang.String, java.lang.String> strMap12 = slimTableFactory11.tableTypeArrays;
        slimTableFactory1.tableTypeArrays = strMap12;
        java.lang.String str15 = slimTableFactory1.makeTableType("");
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory16 = new fitnesse.testsystems.slim.tables.SlimTableFactory();
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory17 = slimTableFactory16.copy();
        java.util.Map<java.lang.String, java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable>> strMap18 = slimTableFactory17.tableTypes;
        boolean boolean20 = slimTableFactory17.hasColon("");
        java.lang.String str22 = slimTableFactory17.makeTableType("");
        java.util.Map<java.lang.String, java.lang.String> strMap23 = slimTableFactory17.tableTypeArrays;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory24 = new fitnesse.testsystems.slim.tables.SlimTableFactory();
        java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable> wildcardClass26 = slimTableFactory24.getTableType("");
        java.util.Map<java.lang.String, java.lang.String> strMap27 = slimTableFactory24.tableTypeArrays;
        boolean boolean29 = slimTableFactory24.hasColon("");
        java.lang.String str31 = slimTableFactory24.makeTableType("");
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory32 = slimTableFactory24.copy();
        java.util.Map<java.lang.String, java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable>> strMap33 = slimTableFactory24.tableTypes;
        boolean boolean35 = slimTableFactory24.hasColon("");
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory36 = slimTableFactory24.copy();
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory37 = new fitnesse.testsystems.slim.tables.SlimTableFactory();
        java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable> wildcardClass39 = slimTableFactory37.getTableType("");
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory40 = slimTableFactory37.copy();
        boolean boolean42 = slimTableFactory37.hasColon("hi!");
        java.lang.String str44 = slimTableFactory37.getFullTableName("");
        java.util.Map<java.lang.String, java.lang.String> strMap45 = slimTableFactory37.tableTypeArrays;
        slimTableFactory24.tableTypeArrays = strMap45;
        slimTableFactory17.tableTypeArrays = strMap45;
        slimTableFactory1.tableTypeArrays = strMap45;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory49 = slimTableFactory1.copy();
        java.lang.String str51 = slimTableFactory1.makeTableType("");
        org.junit.Assert.assertNotNull(slimTableFactory1);
        org.junit.Assert.assertNotNull(strMap2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(strMap7);
        org.junit.Assert.assertNull(wildcardClass10);
        org.junit.Assert.assertNotNull(slimTableFactory11);
        org.junit.Assert.assertNotNull(strMap12);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertNotNull(slimTableFactory17);
        org.junit.Assert.assertNotNull(strMap18);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertNotNull(strMap23);
        org.junit.Assert.assertNull(wildcardClass26);
        org.junit.Assert.assertNotNull(strMap27);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "" + "'", str31, "");
        org.junit.Assert.assertNotNull(slimTableFactory32);
        org.junit.Assert.assertNotNull(strMap33);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertNotNull(slimTableFactory36);
        org.junit.Assert.assertNull(wildcardClass39);
        org.junit.Assert.assertNotNull(slimTableFactory40);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertEquals("'" + str44 + "' != '" + "" + "'", str44, "");
        org.junit.Assert.assertNotNull(strMap45);
        org.junit.Assert.assertNotNull(slimTableFactory49);
        org.junit.Assert.assertEquals("'" + str51 + "' != '" + "" + "'", str51, "");
    }

    @Test
    public void test18594() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18594");
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory0 = new fitnesse.testsystems.slim.tables.SlimTableFactory();
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory1 = slimTableFactory0.copy();
        java.util.Map<java.lang.String, java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable>> strMap2 = slimTableFactory1.tableTypes;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory3 = new fitnesse.testsystems.slim.tables.SlimTableFactory();
        java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable> wildcardClass5 = slimTableFactory3.getTableType("");
        boolean boolean7 = slimTableFactory3.hasColon("");
        java.util.Map<java.lang.String, java.lang.String> strMap8 = slimTableFactory3.tableTypeArrays;
        slimTableFactory1.tableTypeArrays = strMap8;
        java.lang.String str11 = slimTableFactory1.makeTableType("");
        java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable> wildcardClass13 = slimTableFactory1.getTableType("");
        java.lang.String str15 = slimTableFactory1.getFullTableName("hi!");
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory16 = slimTableFactory1.copy();
        java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable> wildcardClass18 = slimTableFactory16.getTableType("hi!");
        java.util.Map<java.lang.String, java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable>> strMap19 = slimTableFactory16.tableTypes;
        java.util.Map<java.lang.String, java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable>> strMap20 = slimTableFactory16.tableTypes;
        boolean boolean22 = slimTableFactory16.hasColon("");
        java.lang.String str24 = slimTableFactory16.getFullTableName("hi!");
        java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable> wildcardClass26 = slimTableFactory16.getTableType("");
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory27 = slimTableFactory16.copy();
        java.util.Map<java.lang.String, java.lang.String> strMap28 = slimTableFactory27.tableTypeArrays;
        org.junit.Assert.assertNotNull(slimTableFactory1);
        org.junit.Assert.assertNotNull(strMap2);
        org.junit.Assert.assertNull(wildcardClass5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(strMap8);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNull(wildcardClass13);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertNotNull(slimTableFactory16);
        org.junit.Assert.assertNull(wildcardClass18);
        org.junit.Assert.assertNotNull(strMap19);
        org.junit.Assert.assertNotNull(strMap20);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "hi!" + "'", str24, "hi!");
        org.junit.Assert.assertNull(wildcardClass26);
        org.junit.Assert.assertNotNull(slimTableFactory27);
        org.junit.Assert.assertNotNull(strMap28);
    }

    @Test
    public void test18595() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18595");
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory0 = new fitnesse.testsystems.slim.tables.SlimTableFactory();
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory1 = slimTableFactory0.copy();
        boolean boolean3 = slimTableFactory1.hasColon("hi!");
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory4 = slimTableFactory1.copy();
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory5 = slimTableFactory1.copy();
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory6 = new fitnesse.testsystems.slim.tables.SlimTableFactory();
        java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable> wildcardClass8 = slimTableFactory6.getTableType("");
        boolean boolean10 = slimTableFactory6.hasColon("");
        java.util.Map<java.lang.String, java.lang.String> strMap11 = slimTableFactory6.tableTypeArrays;
        slimTableFactory5.tableTypeArrays = strMap11;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory13 = slimTableFactory5.copy();
        java.lang.String str15 = slimTableFactory5.getFullTableName("hi!");
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory16 = new fitnesse.testsystems.slim.tables.SlimTableFactory();
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory17 = slimTableFactory16.copy();
        boolean boolean19 = slimTableFactory17.hasColon("hi!");
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory20 = slimTableFactory17.copy();
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory21 = slimTableFactory17.copy();
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory22 = slimTableFactory21.copy();
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory23 = new fitnesse.testsystems.slim.tables.SlimTableFactory();
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory24 = slimTableFactory23.copy();
        boolean boolean26 = slimTableFactory24.hasColon("hi!");
        java.util.Map<java.lang.String, java.lang.String> strMap27 = slimTableFactory24.tableTypeArrays;
        slimTableFactory22.tableTypeArrays = strMap27;
        java.util.Map<java.lang.String, java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable>> strMap29 = slimTableFactory22.tableTypes;
        java.lang.String str31 = slimTableFactory22.getFullTableName("hi!");
        java.util.Map<java.lang.String, java.lang.String> strMap32 = slimTableFactory22.tableTypeArrays;
        slimTableFactory5.tableTypeArrays = strMap32;
        java.util.Map<java.lang.String, java.lang.String> strMap34 = slimTableFactory5.tableTypeArrays;
        org.junit.Assert.assertNotNull(slimTableFactory1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(slimTableFactory4);
        org.junit.Assert.assertNotNull(slimTableFactory5);
        org.junit.Assert.assertNull(wildcardClass8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(strMap11);
        org.junit.Assert.assertNotNull(slimTableFactory13);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertNotNull(slimTableFactory17);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(slimTableFactory20);
        org.junit.Assert.assertNotNull(slimTableFactory21);
        org.junit.Assert.assertNotNull(slimTableFactory22);
        org.junit.Assert.assertNotNull(slimTableFactory24);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNotNull(strMap27);
        org.junit.Assert.assertNotNull(strMap29);
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "hi!" + "'", str31, "hi!");
        org.junit.Assert.assertNotNull(strMap32);
        org.junit.Assert.assertNotNull(strMap34);
    }

    @Test
    public void test18596() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18596");
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory0 = new fitnesse.testsystems.slim.tables.SlimTableFactory();
        java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable> wildcardClass2 = slimTableFactory0.getTableType("");
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory3 = slimTableFactory0.copy();
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory4 = slimTableFactory3.copy();
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory5 = new fitnesse.testsystems.slim.tables.SlimTableFactory();
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory6 = slimTableFactory5.copy();
        boolean boolean8 = slimTableFactory6.hasColon("hi!");
        java.util.Map<java.lang.String, java.lang.String> strMap9 = slimTableFactory6.tableTypeArrays;
        java.lang.String str11 = slimTableFactory6.getFullTableName("");
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory12 = new fitnesse.testsystems.slim.tables.SlimTableFactory();
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory13 = slimTableFactory12.copy();
        boolean boolean15 = slimTableFactory13.hasColon("hi!");
        java.util.Map<java.lang.String, java.lang.String> strMap16 = slimTableFactory13.tableTypeArrays;
        java.lang.String str18 = slimTableFactory13.getFullTableName("");
        java.util.Map<java.lang.String, java.lang.String> strMap19 = slimTableFactory13.tableTypeArrays;
        slimTableFactory6.tableTypeArrays = strMap19;
        java.util.Map<java.lang.String, java.lang.String> strMap21 = slimTableFactory6.tableTypeArrays;
        java.util.Map<java.lang.String, java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable>> strMap22 = slimTableFactory6.tableTypes;
        java.util.Map<java.lang.String, java.lang.String> strMap23 = slimTableFactory6.tableTypeArrays;
        slimTableFactory3.tableTypeArrays = strMap23;
        java.util.Map<java.lang.String, java.lang.String> strMap25 = slimTableFactory3.tableTypeArrays;
        boolean boolean27 = slimTableFactory3.hasColon("");
        java.lang.String str29 = slimTableFactory3.makeTableType("");
        fitnesse.testsystems.slim.Table table30 = null;
        // The following exception was thrown during execution in test generation
        try {
            slimTableFactory3.parseDefineTableTypeRow(table30, (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(wildcardClass2);
        org.junit.Assert.assertNotNull(slimTableFactory3);
        org.junit.Assert.assertNotNull(slimTableFactory4);
        org.junit.Assert.assertNotNull(slimTableFactory6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(strMap9);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNotNull(slimTableFactory13);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(strMap16);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertNotNull(strMap19);
        org.junit.Assert.assertNotNull(strMap21);
        org.junit.Assert.assertNotNull(strMap22);
        org.junit.Assert.assertNotNull(strMap23);
        org.junit.Assert.assertNotNull(strMap25);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "" + "'", str29, "");
    }

    @Test
    public void test18597() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18597");
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory0 = new fitnesse.testsystems.slim.tables.SlimTableFactory();
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory1 = slimTableFactory0.copy();
        boolean boolean3 = slimTableFactory1.hasColon("hi!");
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory4 = slimTableFactory1.copy();
        java.util.Map<java.lang.String, java.lang.String> strMap5 = slimTableFactory1.tableTypeArrays;
        java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable> wildcardClass7 = slimTableFactory1.getTableType("hi!");
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory8 = new fitnesse.testsystems.slim.tables.SlimTableFactory();
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory9 = slimTableFactory8.copy();
        java.util.Map<java.lang.String, java.lang.String> strMap10 = null;
        slimTableFactory8.tableTypeArrays = strMap10;
        java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable> wildcardClass13 = slimTableFactory8.getTableType("hi!");
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory14 = new fitnesse.testsystems.slim.tables.SlimTableFactory();
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory15 = slimTableFactory14.copy();
        boolean boolean17 = slimTableFactory15.hasColon("hi!");
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory18 = slimTableFactory15.copy();
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory19 = slimTableFactory15.copy();
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory20 = new fitnesse.testsystems.slim.tables.SlimTableFactory();
        java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable> wildcardClass22 = slimTableFactory20.getTableType("");
        boolean boolean24 = slimTableFactory20.hasColon("");
        java.util.Map<java.lang.String, java.lang.String> strMap25 = slimTableFactory20.tableTypeArrays;
        slimTableFactory19.tableTypeArrays = strMap25;
        slimTableFactory8.tableTypeArrays = strMap25;
        boolean boolean29 = slimTableFactory8.hasColon("");
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory30 = new fitnesse.testsystems.slim.tables.SlimTableFactory();
        java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable> wildcardClass32 = slimTableFactory30.getTableType("");
        java.util.Map<java.lang.String, java.lang.String> strMap33 = slimTableFactory30.tableTypeArrays;
        slimTableFactory8.tableTypeArrays = strMap33;
        slimTableFactory1.tableTypeArrays = strMap33;
        boolean boolean37 = slimTableFactory1.hasColon("");
        java.util.Map<java.lang.String, java.lang.String> strMap38 = slimTableFactory1.tableTypeArrays;
        java.lang.String str40 = slimTableFactory1.makeTableType("hi!");
        fitnesse.testsystems.slim.Table table41 = null;
        // The following exception was thrown during execution in test generation
        try {
            slimTableFactory1.parseDefineTableTypeRow(table41, (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(slimTableFactory1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(slimTableFactory4);
        org.junit.Assert.assertNotNull(strMap5);
        org.junit.Assert.assertNull(wildcardClass7);
        org.junit.Assert.assertNotNull(slimTableFactory9);
        org.junit.Assert.assertNull(wildcardClass13);
        org.junit.Assert.assertNotNull(slimTableFactory15);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(slimTableFactory18);
        org.junit.Assert.assertNotNull(slimTableFactory19);
        org.junit.Assert.assertNull(wildcardClass22);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(strMap25);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertNull(wildcardClass32);
        org.junit.Assert.assertNotNull(strMap33);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertNotNull(strMap38);
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "hi!" + "'", str40, "hi!");
    }

    @Test
    public void test18598() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18598");
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory0 = new fitnesse.testsystems.slim.tables.SlimTableFactory();
        java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable> wildcardClass2 = slimTableFactory0.getTableType("");
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory3 = slimTableFactory0.copy();
        java.util.Map<java.lang.String, java.lang.String> strMap4 = slimTableFactory3.tableTypeArrays;
        java.util.Map<java.lang.String, java.lang.String> strMap5 = slimTableFactory3.tableTypeArrays;
        java.util.Map<java.lang.String, java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable>> strMap6 = slimTableFactory3.tableTypes;
        java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable> wildcardClass8 = slimTableFactory3.getTableType("");
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory9 = slimTableFactory3.copy();
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory10 = new fitnesse.testsystems.slim.tables.SlimTableFactory();
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory11 = slimTableFactory10.copy();
        java.util.Map<java.lang.String, java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable>> strMap12 = slimTableFactory11.tableTypes;
        boolean boolean14 = slimTableFactory11.hasColon("");
        boolean boolean16 = slimTableFactory11.hasColon("hi!");
        java.util.Map<java.lang.String, java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable>> strMap17 = slimTableFactory11.tableTypes;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory18 = new fitnesse.testsystems.slim.tables.SlimTableFactory();
        java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable> wildcardClass20 = slimTableFactory18.getTableType("");
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory21 = slimTableFactory18.copy();
        java.util.Map<java.lang.String, java.lang.String> strMap22 = slimTableFactory21.tableTypeArrays;
        slimTableFactory11.tableTypeArrays = strMap22;
        slimTableFactory9.tableTypeArrays = strMap22;
        java.lang.String str26 = slimTableFactory9.makeTableType("");
        java.util.Map<java.lang.String, java.lang.String> strMap27 = slimTableFactory9.tableTypeArrays;
        java.util.Map<java.lang.String, java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable>> strMap28 = slimTableFactory9.tableTypes;
        org.junit.Assert.assertNull(wildcardClass2);
        org.junit.Assert.assertNotNull(slimTableFactory3);
        org.junit.Assert.assertNotNull(strMap4);
        org.junit.Assert.assertNotNull(strMap5);
        org.junit.Assert.assertNotNull(strMap6);
        org.junit.Assert.assertNull(wildcardClass8);
        org.junit.Assert.assertNotNull(slimTableFactory9);
        org.junit.Assert.assertNotNull(slimTableFactory11);
        org.junit.Assert.assertNotNull(strMap12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(strMap17);
        org.junit.Assert.assertNull(wildcardClass20);
        org.junit.Assert.assertNotNull(slimTableFactory21);
        org.junit.Assert.assertNotNull(strMap22);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "" + "'", str26, "");
        org.junit.Assert.assertNotNull(strMap27);
        org.junit.Assert.assertNotNull(strMap28);
    }

    @Test
    public void test18599() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18599");
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory0 = new fitnesse.testsystems.slim.tables.SlimTableFactory();
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory1 = slimTableFactory0.copy();
        java.util.Map<java.lang.String, java.lang.String> strMap2 = null;
        slimTableFactory0.tableTypeArrays = strMap2;
        java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable> wildcardClass5 = slimTableFactory0.getTableType("hi!");
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory6 = new fitnesse.testsystems.slim.tables.SlimTableFactory();
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory7 = slimTableFactory6.copy();
        boolean boolean9 = slimTableFactory7.hasColon("hi!");
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory10 = slimTableFactory7.copy();
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory11 = slimTableFactory7.copy();
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory12 = new fitnesse.testsystems.slim.tables.SlimTableFactory();
        java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable> wildcardClass14 = slimTableFactory12.getTableType("");
        boolean boolean16 = slimTableFactory12.hasColon("");
        java.util.Map<java.lang.String, java.lang.String> strMap17 = slimTableFactory12.tableTypeArrays;
        slimTableFactory11.tableTypeArrays = strMap17;
        slimTableFactory0.tableTypeArrays = strMap17;
        boolean boolean21 = slimTableFactory0.hasColon("");
        java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable> wildcardClass23 = slimTableFactory0.getTableType("");
        java.util.Map<java.lang.String, java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable>> strMap24 = slimTableFactory0.tableTypes;
        java.lang.String str26 = slimTableFactory0.getFullTableName("hi!");
        boolean boolean28 = slimTableFactory0.hasColon("");
        org.junit.Assert.assertNotNull(slimTableFactory1);
        org.junit.Assert.assertNull(wildcardClass5);
        org.junit.Assert.assertNotNull(slimTableFactory7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(slimTableFactory10);
        org.junit.Assert.assertNotNull(slimTableFactory11);
        org.junit.Assert.assertNull(wildcardClass14);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(strMap17);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNull(wildcardClass23);
        org.junit.Assert.assertNotNull(strMap24);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "hi!" + "'", str26, "hi!");
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
    }

    @Test
    public void test18600() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18600");
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory0 = new fitnesse.testsystems.slim.tables.SlimTableFactory();
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory1 = slimTableFactory0.copy();
        java.lang.String str3 = slimTableFactory0.getFullTableName("hi!");
        java.util.Map<java.lang.String, java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable>> strMap4 = slimTableFactory0.tableTypes;
        java.lang.String str6 = slimTableFactory0.makeTableType("");
        java.lang.String str8 = slimTableFactory0.makeTableType("hi!");
        java.lang.String str10 = slimTableFactory0.getFullTableName("hi!");
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory11 = slimTableFactory0.copy();
        java.util.Map<java.lang.String, java.lang.String> strMap12 = slimTableFactory11.tableTypeArrays;
        boolean boolean14 = slimTableFactory11.hasColon("hi!");
        org.junit.Assert.assertNotNull(slimTableFactory1);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertNotNull(strMap4);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertNotNull(slimTableFactory11);
        org.junit.Assert.assertNotNull(strMap12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test18601() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18601");
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory0 = new fitnesse.testsystems.slim.tables.SlimTableFactory();
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory1 = slimTableFactory0.copy();
        java.util.Map<java.lang.String, java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable>> strMap2 = slimTableFactory1.tableTypes;
        boolean boolean4 = slimTableFactory1.hasColon("");
        boolean boolean6 = slimTableFactory1.hasColon("hi!");
        boolean boolean8 = slimTableFactory1.hasColon("");
        java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable> wildcardClass10 = slimTableFactory1.getTableType("hi!");
        java.lang.String str12 = slimTableFactory1.getFullTableName("hi!");
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory13 = new fitnesse.testsystems.slim.tables.SlimTableFactory();
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory14 = slimTableFactory13.copy();
        boolean boolean16 = slimTableFactory14.hasColon("hi!");
        java.util.Map<java.lang.String, java.lang.String> strMap17 = slimTableFactory14.tableTypeArrays;
        java.lang.String str19 = slimTableFactory14.getFullTableName("");
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory20 = new fitnesse.testsystems.slim.tables.SlimTableFactory();
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory21 = slimTableFactory20.copy();
        boolean boolean23 = slimTableFactory21.hasColon("hi!");
        java.util.Map<java.lang.String, java.lang.String> strMap24 = slimTableFactory21.tableTypeArrays;
        java.lang.String str26 = slimTableFactory21.getFullTableName("");
        java.util.Map<java.lang.String, java.lang.String> strMap27 = slimTableFactory21.tableTypeArrays;
        slimTableFactory14.tableTypeArrays = strMap27;
        java.util.Map<java.lang.String, java.lang.String> strMap29 = slimTableFactory14.tableTypeArrays;
        java.util.Map<java.lang.String, java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable>> strMap30 = slimTableFactory14.tableTypes;
        java.util.Map<java.lang.String, java.lang.String> strMap31 = slimTableFactory14.tableTypeArrays;
        slimTableFactory1.tableTypeArrays = strMap31;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory33 = slimTableFactory1.copy();
        boolean boolean35 = slimTableFactory33.hasColon("hi!");
        java.util.Map<java.lang.String, java.lang.String> strMap36 = slimTableFactory33.tableTypeArrays;
        fitnesse.testsystems.slim.Table table37 = null;
        // The following exception was thrown during execution in test generation
        try {
            slimTableFactory33.parseDefineTableTypeRow(table37, (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(slimTableFactory1);
        org.junit.Assert.assertNotNull(strMap2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(wildcardClass10);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertNotNull(slimTableFactory14);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(strMap17);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertNotNull(slimTableFactory21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNotNull(strMap24);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "" + "'", str26, "");
        org.junit.Assert.assertNotNull(strMap27);
        org.junit.Assert.assertNotNull(strMap29);
        org.junit.Assert.assertNotNull(strMap30);
        org.junit.Assert.assertNotNull(strMap31);
        org.junit.Assert.assertNotNull(slimTableFactory33);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertNotNull(strMap36);
    }

    @Test
    public void test18602() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18602");
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory0 = new fitnesse.testsystems.slim.tables.SlimTableFactory();
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory1 = slimTableFactory0.copy();
        boolean boolean3 = slimTableFactory1.hasColon("hi!");
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory4 = slimTableFactory1.copy();
        java.util.Map<java.lang.String, java.lang.String> strMap5 = slimTableFactory1.tableTypeArrays;
        java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable> wildcardClass7 = slimTableFactory1.getTableType("");
        java.util.Map<java.lang.String, java.lang.String> strMap8 = slimTableFactory1.tableTypeArrays;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory9 = slimTableFactory1.copy();
        boolean boolean11 = slimTableFactory9.hasColon("hi!");
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory12 = slimTableFactory9.copy();
        boolean boolean14 = slimTableFactory12.hasColon("");
        org.junit.Assert.assertNotNull(slimTableFactory1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(slimTableFactory4);
        org.junit.Assert.assertNotNull(strMap5);
        org.junit.Assert.assertNull(wildcardClass7);
        org.junit.Assert.assertNotNull(strMap8);
        org.junit.Assert.assertNotNull(slimTableFactory9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(slimTableFactory12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test18603() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18603");
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory0 = new fitnesse.testsystems.slim.tables.SlimTableFactory();
        java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable> wildcardClass2 = slimTableFactory0.getTableType("");
        fitnesse.testsystems.slim.Table table3 = null;
        // The following exception was thrown during execution in test generation
        try {
            slimTableFactory0.parseDefineTableTypeRow(table3, (int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(wildcardClass2);
    }

    @Test
    public void test18604() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18604");
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory0 = new fitnesse.testsystems.slim.tables.SlimTableFactory();
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory1 = slimTableFactory0.copy();
        java.util.Map<java.lang.String, java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable>> strMap2 = slimTableFactory1.tableTypes;
        boolean boolean4 = slimTableFactory1.hasColon("");
        boolean boolean6 = slimTableFactory1.hasColon("hi!");
        java.util.Map<java.lang.String, java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable>> strMap7 = slimTableFactory1.tableTypes;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory8 = new fitnesse.testsystems.slim.tables.SlimTableFactory();
        java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable> wildcardClass10 = slimTableFactory8.getTableType("");
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory11 = slimTableFactory8.copy();
        java.util.Map<java.lang.String, java.lang.String> strMap12 = slimTableFactory11.tableTypeArrays;
        slimTableFactory1.tableTypeArrays = strMap12;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory14 = slimTableFactory1.copy();
        boolean boolean16 = slimTableFactory1.hasColon("hi!");
        java.util.Map<java.lang.String, java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable>> strMap17 = slimTableFactory1.tableTypes;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory18 = new fitnesse.testsystems.slim.tables.SlimTableFactory();
        java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable> wildcardClass20 = slimTableFactory18.getTableType("");
        java.util.Map<java.lang.String, java.lang.String> strMap21 = slimTableFactory18.tableTypeArrays;
        java.lang.String str23 = slimTableFactory18.makeTableType("hi!");
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory24 = slimTableFactory18.copy();
        java.util.Map<java.lang.String, java.lang.String> strMap25 = slimTableFactory18.tableTypeArrays;
        slimTableFactory1.tableTypeArrays = strMap25;
        java.lang.String str28 = slimTableFactory1.makeTableType("");
        java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable> wildcardClass30 = slimTableFactory1.getTableType("");
        boolean boolean32 = slimTableFactory1.hasColon("");
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory33 = slimTableFactory1.copy();
        java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable> wildcardClass35 = slimTableFactory1.getTableType("");
        java.lang.String str37 = slimTableFactory1.getFullTableName("hi!");
        org.junit.Assert.assertNotNull(slimTableFactory1);
        org.junit.Assert.assertNotNull(strMap2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(strMap7);
        org.junit.Assert.assertNull(wildcardClass10);
        org.junit.Assert.assertNotNull(slimTableFactory11);
        org.junit.Assert.assertNotNull(strMap12);
        org.junit.Assert.assertNotNull(slimTableFactory14);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(strMap17);
        org.junit.Assert.assertNull(wildcardClass20);
        org.junit.Assert.assertNotNull(strMap21);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "hi!" + "'", str23, "hi!");
        org.junit.Assert.assertNotNull(slimTableFactory24);
        org.junit.Assert.assertNotNull(strMap25);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "" + "'", str28, "");
        org.junit.Assert.assertNull(wildcardClass30);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertNotNull(slimTableFactory33);
        org.junit.Assert.assertNull(wildcardClass35);
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "hi!" + "'", str37, "hi!");
    }

    @Test
    public void test18605() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18605");
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory0 = new fitnesse.testsystems.slim.tables.SlimTableFactory();
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory1 = slimTableFactory0.copy();
        boolean boolean3 = slimTableFactory1.hasColon("hi!");
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory4 = slimTableFactory1.copy();
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory5 = slimTableFactory1.copy();
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory6 = slimTableFactory5.copy();
        java.util.Map<java.lang.String, java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable>> strMap7 = slimTableFactory5.tableTypes;
        java.lang.String str9 = slimTableFactory5.getFullTableName("");
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory10 = slimTableFactory5.copy();
        boolean boolean12 = slimTableFactory10.hasColon("hi!");
        java.util.Map<java.lang.String, java.lang.String> strMap13 = slimTableFactory10.tableTypeArrays;
        java.lang.Class<?> wildcardClass14 = strMap13.getClass();
        org.junit.Assert.assertNotNull(slimTableFactory1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(slimTableFactory4);
        org.junit.Assert.assertNotNull(slimTableFactory5);
        org.junit.Assert.assertNotNull(slimTableFactory6);
        org.junit.Assert.assertNotNull(strMap7);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNotNull(slimTableFactory10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(strMap13);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test18606() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18606");
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory0 = new fitnesse.testsystems.slim.tables.SlimTableFactory();
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory1 = slimTableFactory0.copy();
        boolean boolean3 = slimTableFactory1.hasColon("hi!");
        java.util.Map<java.lang.String, java.lang.String> strMap4 = slimTableFactory1.tableTypeArrays;
        java.lang.String str6 = slimTableFactory1.getFullTableName("");
        java.util.Map<java.lang.String, java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable>> strMap7 = slimTableFactory1.tableTypes;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory8 = slimTableFactory1.copy();
        java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable> wildcardClass10 = slimTableFactory1.getTableType("hi!");
        java.util.Map<java.lang.String, java.lang.String> strMap11 = slimTableFactory1.tableTypeArrays;
        java.util.Map<java.lang.String, java.lang.String> strMap12 = slimTableFactory1.tableTypeArrays;
        java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable> wildcardClass14 = slimTableFactory1.getTableType("hi!");
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory15 = slimTableFactory1.copy();
        java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable> wildcardClass17 = slimTableFactory1.getTableType("hi!");
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory18 = new fitnesse.testsystems.slim.tables.SlimTableFactory();
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory19 = slimTableFactory18.copy();
        java.util.Map<java.lang.String, java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable>> strMap20 = slimTableFactory19.tableTypes;
        boolean boolean22 = slimTableFactory19.hasColon("");
        boolean boolean24 = slimTableFactory19.hasColon("hi!");
        java.util.Map<java.lang.String, java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable>> strMap25 = slimTableFactory19.tableTypes;
        java.util.Map<java.lang.String, java.lang.String> strMap26 = slimTableFactory19.tableTypeArrays;
        java.lang.String str28 = slimTableFactory19.makeTableType("");
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory29 = new fitnesse.testsystems.slim.tables.SlimTableFactory();
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory30 = slimTableFactory29.copy();
        java.lang.String str32 = slimTableFactory29.getFullTableName("hi!");
        java.lang.String str34 = slimTableFactory29.makeTableType("");
        java.util.Map<java.lang.String, java.lang.String> strMap35 = null;
        slimTableFactory29.tableTypeArrays = strMap35;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory37 = new fitnesse.testsystems.slim.tables.SlimTableFactory();
        java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable> wildcardClass39 = slimTableFactory37.getTableType("");
        boolean boolean41 = slimTableFactory37.hasColon("");
        java.lang.String str43 = slimTableFactory37.getFullTableName("");
        java.util.Map<java.lang.String, java.lang.String> strMap44 = slimTableFactory37.tableTypeArrays;
        slimTableFactory29.tableTypeArrays = strMap44;
        slimTableFactory19.tableTypeArrays = strMap44;
        slimTableFactory1.tableTypeArrays = strMap44;
        java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable> wildcardClass49 = slimTableFactory1.getTableType("hi!");
        java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable> wildcardClass51 = slimTableFactory1.getTableType("hi!");
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory52 = new fitnesse.testsystems.slim.tables.SlimTableFactory();
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory53 = new fitnesse.testsystems.slim.tables.SlimTableFactory();
        java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable> wildcardClass55 = slimTableFactory53.getTableType("");
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory56 = slimTableFactory53.copy();
        boolean boolean58 = slimTableFactory53.hasColon("");
        java.util.Map<java.lang.String, java.lang.String> strMap59 = slimTableFactory53.tableTypeArrays;
        slimTableFactory52.tableTypeArrays = strMap59;
        java.util.Map<java.lang.String, java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable>> strMap61 = slimTableFactory52.tableTypes;
        java.util.Map<java.lang.String, java.lang.String> strMap62 = slimTableFactory52.tableTypeArrays;
        java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable> wildcardClass64 = slimTableFactory52.getTableType("");
        boolean boolean66 = slimTableFactory52.hasColon("hi!");
        java.util.Map<java.lang.String, java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable>> strMap67 = slimTableFactory52.tableTypes;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory68 = slimTableFactory52.copy();
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory69 = slimTableFactory52.copy();
        java.util.Map<java.lang.String, java.lang.String> strMap70 = slimTableFactory52.tableTypeArrays;
        slimTableFactory1.tableTypeArrays = strMap70;
        org.junit.Assert.assertNotNull(slimTableFactory1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(strMap4);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(strMap7);
        org.junit.Assert.assertNotNull(slimTableFactory8);
        org.junit.Assert.assertNull(wildcardClass10);
        org.junit.Assert.assertNotNull(strMap11);
        org.junit.Assert.assertNotNull(strMap12);
        org.junit.Assert.assertNull(wildcardClass14);
        org.junit.Assert.assertNotNull(slimTableFactory15);
        org.junit.Assert.assertNull(wildcardClass17);
        org.junit.Assert.assertNotNull(slimTableFactory19);
        org.junit.Assert.assertNotNull(strMap20);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(strMap25);
        org.junit.Assert.assertNotNull(strMap26);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "" + "'", str28, "");
        org.junit.Assert.assertNotNull(slimTableFactory30);
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "hi!" + "'", str32, "hi!");
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "" + "'", str34, "");
        org.junit.Assert.assertNull(wildcardClass39);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertEquals("'" + str43 + "' != '" + "" + "'", str43, "");
        org.junit.Assert.assertNotNull(strMap44);
        org.junit.Assert.assertNull(wildcardClass49);
        org.junit.Assert.assertNull(wildcardClass51);
        org.junit.Assert.assertNull(wildcardClass55);
        org.junit.Assert.assertNotNull(slimTableFactory56);
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + false + "'", boolean58 == false);
        org.junit.Assert.assertNotNull(strMap59);
        org.junit.Assert.assertNotNull(strMap61);
        org.junit.Assert.assertNotNull(strMap62);
        org.junit.Assert.assertNull(wildcardClass64);
        org.junit.Assert.assertTrue("'" + boolean66 + "' != '" + false + "'", boolean66 == false);
        org.junit.Assert.assertNotNull(strMap67);
        org.junit.Assert.assertNotNull(slimTableFactory68);
        org.junit.Assert.assertNotNull(slimTableFactory69);
        org.junit.Assert.assertNotNull(strMap70);
    }

    @Test
    public void test18607() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18607");
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory0 = new fitnesse.testsystems.slim.tables.SlimTableFactory();
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory1 = slimTableFactory0.copy();
        java.util.Map<java.lang.String, java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable>> strMap2 = slimTableFactory1.tableTypes;
        boolean boolean4 = slimTableFactory1.hasColon("");
        boolean boolean6 = slimTableFactory1.hasColon("hi!");
        java.util.Map<java.lang.String, java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable>> strMap7 = slimTableFactory1.tableTypes;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory8 = new fitnesse.testsystems.slim.tables.SlimTableFactory();
        java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable> wildcardClass10 = slimTableFactory8.getTableType("");
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory11 = slimTableFactory8.copy();
        java.util.Map<java.lang.String, java.lang.String> strMap12 = slimTableFactory11.tableTypeArrays;
        slimTableFactory1.tableTypeArrays = strMap12;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory14 = slimTableFactory1.copy();
        java.lang.String str16 = slimTableFactory14.makeTableType("hi!");
        java.lang.String str18 = slimTableFactory14.getFullTableName("hi!");
        java.util.Map<java.lang.String, java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable>> strMap19 = slimTableFactory14.tableTypes;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory20 = slimTableFactory14.copy();
        java.lang.String str22 = slimTableFactory20.makeTableType("hi!");
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory23 = slimTableFactory20.copy();
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory24 = slimTableFactory23.copy();
        org.junit.Assert.assertNotNull(slimTableFactory1);
        org.junit.Assert.assertNotNull(strMap2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(strMap7);
        org.junit.Assert.assertNull(wildcardClass10);
        org.junit.Assert.assertNotNull(slimTableFactory11);
        org.junit.Assert.assertNotNull(strMap12);
        org.junit.Assert.assertNotNull(slimTableFactory14);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!" + "'", str18, "hi!");
        org.junit.Assert.assertNotNull(strMap19);
        org.junit.Assert.assertNotNull(slimTableFactory20);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "hi!" + "'", str22, "hi!");
        org.junit.Assert.assertNotNull(slimTableFactory23);
        org.junit.Assert.assertNotNull(slimTableFactory24);
    }

    @Test
    public void test18608() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18608");
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory0 = new fitnesse.testsystems.slim.tables.SlimTableFactory();
        java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable> wildcardClass2 = slimTableFactory0.getTableType("");
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory3 = slimTableFactory0.copy();
        boolean boolean5 = slimTableFactory0.hasColon("hi!");
        java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable> wildcardClass7 = slimTableFactory0.getTableType("hi!");
        java.lang.String str9 = slimTableFactory0.getFullTableName("");
        java.lang.String str11 = slimTableFactory0.makeTableType("hi!");
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory12 = slimTableFactory0.copy();
        java.util.Map<java.lang.String, java.lang.String> strMap13 = slimTableFactory12.tableTypeArrays;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory14 = slimTableFactory12.copy();
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory15 = new fitnesse.testsystems.slim.tables.SlimTableFactory();
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory16 = slimTableFactory15.copy();
        boolean boolean18 = slimTableFactory16.hasColon("hi!");
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory19 = slimTableFactory16.copy();
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory20 = slimTableFactory16.copy();
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory21 = slimTableFactory20.copy();
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory22 = new fitnesse.testsystems.slim.tables.SlimTableFactory();
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory23 = slimTableFactory22.copy();
        boolean boolean25 = slimTableFactory23.hasColon("hi!");
        java.util.Map<java.lang.String, java.lang.String> strMap26 = slimTableFactory23.tableTypeArrays;
        slimTableFactory21.tableTypeArrays = strMap26;
        java.lang.String str29 = slimTableFactory21.makeTableType("");
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory30 = slimTableFactory21.copy();
        java.lang.String str32 = slimTableFactory21.makeTableType("hi!");
        java.util.Map<java.lang.String, java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable>> strMap33 = slimTableFactory21.tableTypes;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory34 = slimTableFactory21.copy();
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory35 = new fitnesse.testsystems.slim.tables.SlimTableFactory();
        java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable> wildcardClass37 = slimTableFactory35.getTableType("");
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory38 = slimTableFactory35.copy();
        boolean boolean40 = slimTableFactory35.hasColon("hi!");
        java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable> wildcardClass42 = slimTableFactory35.getTableType("hi!");
        java.lang.String str44 = slimTableFactory35.getFullTableName("");
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory45 = slimTableFactory35.copy();
        java.lang.String str47 = slimTableFactory35.makeTableType("hi!");
        java.util.Map<java.lang.String, java.lang.String> strMap48 = slimTableFactory35.tableTypeArrays;
        slimTableFactory21.tableTypeArrays = strMap48;
        slimTableFactory12.tableTypeArrays = strMap48;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory51 = new fitnesse.testsystems.slim.tables.SlimTableFactory();
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory52 = slimTableFactory51.copy();
        java.util.Map<java.lang.String, java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable>> strMap53 = slimTableFactory52.tableTypes;
        boolean boolean55 = slimTableFactory52.hasColon("");
        java.util.Map<java.lang.String, java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable>> strMap56 = slimTableFactory52.tableTypes;
        java.util.Map<java.lang.String, java.lang.String> strMap57 = slimTableFactory52.tableTypeArrays;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory58 = slimTableFactory52.copy();
        java.util.Map<java.lang.String, java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable>> strMap59 = slimTableFactory58.tableTypes;
        java.util.Map<java.lang.String, java.lang.String> strMap60 = slimTableFactory58.tableTypeArrays;
        slimTableFactory12.tableTypeArrays = strMap60;
        java.lang.Class<?> wildcardClass62 = slimTableFactory12.getClass();
        org.junit.Assert.assertNull(wildcardClass2);
        org.junit.Assert.assertNotNull(slimTableFactory3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(wildcardClass7);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertNotNull(slimTableFactory12);
        org.junit.Assert.assertNotNull(strMap13);
        org.junit.Assert.assertNotNull(slimTableFactory14);
        org.junit.Assert.assertNotNull(slimTableFactory16);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(slimTableFactory19);
        org.junit.Assert.assertNotNull(slimTableFactory20);
        org.junit.Assert.assertNotNull(slimTableFactory21);
        org.junit.Assert.assertNotNull(slimTableFactory23);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNotNull(strMap26);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "" + "'", str29, "");
        org.junit.Assert.assertNotNull(slimTableFactory30);
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "hi!" + "'", str32, "hi!");
        org.junit.Assert.assertNotNull(strMap33);
        org.junit.Assert.assertNotNull(slimTableFactory34);
        org.junit.Assert.assertNull(wildcardClass37);
        org.junit.Assert.assertNotNull(slimTableFactory38);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertNull(wildcardClass42);
        org.junit.Assert.assertEquals("'" + str44 + "' != '" + "" + "'", str44, "");
        org.junit.Assert.assertNotNull(slimTableFactory45);
        org.junit.Assert.assertEquals("'" + str47 + "' != '" + "hi!" + "'", str47, "hi!");
        org.junit.Assert.assertNotNull(strMap48);
        org.junit.Assert.assertNotNull(slimTableFactory52);
        org.junit.Assert.assertNotNull(strMap53);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + false + "'", boolean55 == false);
        org.junit.Assert.assertNotNull(strMap56);
        org.junit.Assert.assertNotNull(strMap57);
        org.junit.Assert.assertNotNull(slimTableFactory58);
        org.junit.Assert.assertNotNull(strMap59);
        org.junit.Assert.assertNotNull(strMap60);
        org.junit.Assert.assertNotNull(wildcardClass62);
    }

    @Test
    public void test18609() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18609");
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory0 = new fitnesse.testsystems.slim.tables.SlimTableFactory();
        java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable> wildcardClass2 = slimTableFactory0.getTableType("");
        java.util.Map<java.lang.String, java.lang.String> strMap3 = slimTableFactory0.tableTypeArrays;
        boolean boolean5 = slimTableFactory0.hasColon("");
        java.lang.String str7 = slimTableFactory0.makeTableType("");
        java.util.Map<java.lang.String, java.lang.String> strMap8 = slimTableFactory0.tableTypeArrays;
        java.lang.String str10 = slimTableFactory0.getFullTableName("hi!");
        java.lang.String str12 = slimTableFactory0.getFullTableName("hi!");
        java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable> wildcardClass14 = slimTableFactory0.getTableType("");
        java.util.Map<java.lang.String, java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable>> strMap15 = slimTableFactory0.tableTypes;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory16 = slimTableFactory0.copy();
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory17 = slimTableFactory16.copy();
        org.junit.Assert.assertNull(wildcardClass2);
        org.junit.Assert.assertNotNull(strMap3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNotNull(strMap8);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertNull(wildcardClass14);
        org.junit.Assert.assertNotNull(strMap15);
        org.junit.Assert.assertNotNull(slimTableFactory16);
        org.junit.Assert.assertNotNull(slimTableFactory17);
    }

    @Test
    public void test18610() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18610");
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory0 = new fitnesse.testsystems.slim.tables.SlimTableFactory();
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory1 = slimTableFactory0.copy();
        java.util.Map<java.lang.String, java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable>> strMap2 = slimTableFactory1.tableTypes;
        boolean boolean4 = slimTableFactory1.hasColon("");
        boolean boolean6 = slimTableFactory1.hasColon("hi!");
        boolean boolean8 = slimTableFactory1.hasColon("");
        java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable> wildcardClass10 = slimTableFactory1.getTableType("hi!");
        java.lang.String str12 = slimTableFactory1.getFullTableName("hi!");
        java.lang.String str14 = slimTableFactory1.makeTableType("");
        java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable> wildcardClass16 = slimTableFactory1.getTableType("hi!");
        java.lang.String str18 = slimTableFactory1.getFullTableName("");
        java.lang.String str20 = slimTableFactory1.makeTableType("hi!");
        org.junit.Assert.assertNotNull(slimTableFactory1);
        org.junit.Assert.assertNotNull(strMap2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(wildcardClass10);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertNull(wildcardClass16);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "hi!" + "'", str20, "hi!");
    }

    @Test
    public void test18611() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18611");
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory0 = new fitnesse.testsystems.slim.tables.SlimTableFactory();
        java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable> wildcardClass2 = slimTableFactory0.getTableType("");
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory3 = slimTableFactory0.copy();
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory4 = slimTableFactory3.copy();
        java.lang.String str6 = slimTableFactory3.makeTableType("");
        java.lang.String str8 = slimTableFactory3.makeTableType("");
        java.util.Map<java.lang.String, java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable>> strMap9 = slimTableFactory3.tableTypes;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory10 = new fitnesse.testsystems.slim.tables.SlimTableFactory();
        java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable> wildcardClass12 = slimTableFactory10.getTableType("");
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory13 = slimTableFactory10.copy();
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory14 = new fitnesse.testsystems.slim.tables.SlimTableFactory();
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory15 = slimTableFactory14.copy();
        java.util.Map<java.lang.String, java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable>> strMap16 = slimTableFactory15.tableTypes;
        boolean boolean18 = slimTableFactory15.hasColon("");
        boolean boolean20 = slimTableFactory15.hasColon("hi!");
        java.util.Map<java.lang.String, java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable>> strMap21 = slimTableFactory15.tableTypes;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory22 = new fitnesse.testsystems.slim.tables.SlimTableFactory();
        java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable> wildcardClass24 = slimTableFactory22.getTableType("");
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory25 = slimTableFactory22.copy();
        java.util.Map<java.lang.String, java.lang.String> strMap26 = slimTableFactory25.tableTypeArrays;
        slimTableFactory15.tableTypeArrays = strMap26;
        slimTableFactory10.tableTypeArrays = strMap26;
        java.util.Map<java.lang.String, java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable>> strMap29 = slimTableFactory10.tableTypes;
        java.util.Map<java.lang.String, java.lang.String> strMap30 = slimTableFactory10.tableTypeArrays;
        slimTableFactory3.tableTypeArrays = strMap30;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory32 = slimTableFactory3.copy();
        java.util.Map<java.lang.String, java.lang.String> strMap33 = slimTableFactory32.tableTypeArrays;
        boolean boolean35 = slimTableFactory32.hasColon("hi!");
        java.lang.String str37 = slimTableFactory32.makeTableType("");
        fitnesse.testsystems.slim.Table table38 = null;
        // The following exception was thrown during execution in test generation
        try {
            slimTableFactory32.parseDefineTableTypeRow(table38, (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(wildcardClass2);
        org.junit.Assert.assertNotNull(slimTableFactory3);
        org.junit.Assert.assertNotNull(slimTableFactory4);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNotNull(strMap9);
        org.junit.Assert.assertNull(wildcardClass12);
        org.junit.Assert.assertNotNull(slimTableFactory13);
        org.junit.Assert.assertNotNull(slimTableFactory15);
        org.junit.Assert.assertNotNull(strMap16);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(strMap21);
        org.junit.Assert.assertNull(wildcardClass24);
        org.junit.Assert.assertNotNull(slimTableFactory25);
        org.junit.Assert.assertNotNull(strMap26);
        org.junit.Assert.assertNotNull(strMap29);
        org.junit.Assert.assertNotNull(strMap30);
        org.junit.Assert.assertNotNull(slimTableFactory32);
        org.junit.Assert.assertNotNull(strMap33);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "" + "'", str37, "");
    }

    @Test
    public void test18612() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18612");
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory0 = new fitnesse.testsystems.slim.tables.SlimTableFactory();
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory1 = slimTableFactory0.copy();
        java.util.Map<java.lang.String, java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable>> strMap2 = slimTableFactory1.tableTypes;
        boolean boolean4 = slimTableFactory1.hasColon("");
        boolean boolean6 = slimTableFactory1.hasColon("hi!");
        boolean boolean8 = slimTableFactory1.hasColon("");
        boolean boolean10 = slimTableFactory1.hasColon("hi!");
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory11 = slimTableFactory1.copy();
        java.lang.String str13 = slimTableFactory11.getFullTableName("");
        java.util.Map<java.lang.String, java.lang.String> strMap14 = slimTableFactory11.tableTypeArrays;
        java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable> wildcardClass16 = slimTableFactory11.getTableType("");
        java.util.Map<java.lang.String, java.lang.String> strMap17 = slimTableFactory11.tableTypeArrays;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory18 = slimTableFactory11.copy();
        org.junit.Assert.assertNotNull(slimTableFactory1);
        org.junit.Assert.assertNotNull(strMap2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(slimTableFactory11);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNotNull(strMap14);
        org.junit.Assert.assertNull(wildcardClass16);
        org.junit.Assert.assertNotNull(strMap17);
        org.junit.Assert.assertNotNull(slimTableFactory18);
    }

    @Test
    public void test18613() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18613");
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory0 = new fitnesse.testsystems.slim.tables.SlimTableFactory();
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory1 = slimTableFactory0.copy();
        boolean boolean3 = slimTableFactory1.hasColon("hi!");
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory4 = slimTableFactory1.copy();
        java.util.Map<java.lang.String, java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable>> strMap5 = slimTableFactory1.tableTypes;
        java.util.Map<java.lang.String, java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable>> strMap6 = slimTableFactory1.tableTypes;
        java.util.Map<java.lang.String, java.lang.String> strMap7 = slimTableFactory1.tableTypeArrays;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory8 = slimTableFactory1.copy();
        java.util.Map<java.lang.String, java.lang.String> strMap9 = slimTableFactory1.tableTypeArrays;
        org.junit.Assert.assertNotNull(slimTableFactory1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(slimTableFactory4);
        org.junit.Assert.assertNotNull(strMap5);
        org.junit.Assert.assertNotNull(strMap6);
        org.junit.Assert.assertNotNull(strMap7);
        org.junit.Assert.assertNotNull(slimTableFactory8);
        org.junit.Assert.assertNotNull(strMap9);
    }

    @Test
    public void test18614() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18614");
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory0 = new fitnesse.testsystems.slim.tables.SlimTableFactory();
        java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable> wildcardClass2 = slimTableFactory0.getTableType("");
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory3 = slimTableFactory0.copy();
        java.lang.String str5 = slimTableFactory3.getFullTableName("hi!");
        java.lang.String str7 = slimTableFactory3.makeTableType("hi!");
        java.lang.String str9 = slimTableFactory3.getFullTableName("hi!");
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory10 = new fitnesse.testsystems.slim.tables.SlimTableFactory();
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory11 = slimTableFactory10.copy();
        boolean boolean13 = slimTableFactory11.hasColon("hi!");
        java.util.Map<java.lang.String, java.lang.String> strMap14 = slimTableFactory11.tableTypeArrays;
        java.lang.String str16 = slimTableFactory11.getFullTableName("");
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory17 = new fitnesse.testsystems.slim.tables.SlimTableFactory();
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory18 = slimTableFactory17.copy();
        boolean boolean20 = slimTableFactory18.hasColon("hi!");
        java.util.Map<java.lang.String, java.lang.String> strMap21 = slimTableFactory18.tableTypeArrays;
        java.lang.String str23 = slimTableFactory18.getFullTableName("");
        java.util.Map<java.lang.String, java.lang.String> strMap24 = slimTableFactory18.tableTypeArrays;
        slimTableFactory11.tableTypeArrays = strMap24;
        java.util.Map<java.lang.String, java.lang.String> strMap26 = slimTableFactory11.tableTypeArrays;
        slimTableFactory3.tableTypeArrays = strMap26;
        java.util.Map<java.lang.String, java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable>> strMap28 = slimTableFactory3.tableTypes;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory29 = slimTableFactory3.copy();
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory30 = slimTableFactory3.copy();
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory31 = slimTableFactory30.copy();
        boolean boolean33 = slimTableFactory31.hasColon("");
        fitnesse.testsystems.slim.Table table34 = null;
        // The following exception was thrown during execution in test generation
        try {
            slimTableFactory31.parseDefineTableTypeRow(table34, (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(wildcardClass2);
        org.junit.Assert.assertNotNull(slimTableFactory3);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertNotNull(slimTableFactory11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(strMap14);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertNotNull(slimTableFactory18);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(strMap21);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
        org.junit.Assert.assertNotNull(strMap24);
        org.junit.Assert.assertNotNull(strMap26);
        org.junit.Assert.assertNotNull(strMap28);
        org.junit.Assert.assertNotNull(slimTableFactory29);
        org.junit.Assert.assertNotNull(slimTableFactory30);
        org.junit.Assert.assertNotNull(slimTableFactory31);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
    }
}

