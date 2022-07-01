import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest36 {

    public static boolean debug = false;

    @Test
    public void test18001() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18001");
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory0 = new fitnesse.testsystems.slim.tables.SlimTableFactory();
        java.lang.String str2 = slimTableFactory0.getFullTableName("hi!");
        java.util.Map<java.lang.String, java.lang.String> strMap3 = slimTableFactory0.tableTypeArrays;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory4 = slimTableFactory0.copy();
        boolean boolean6 = slimTableFactory0.hasColon("hi!");
        java.util.Map<java.lang.String, java.lang.String> strMap7 = slimTableFactory0.tableTypeArrays;
        java.util.Map<java.lang.String, java.lang.String> strMap8 = slimTableFactory0.tableTypeArrays;
        java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable> wildcardClass10 = slimTableFactory0.getTableType("hi!");
        java.lang.String str12 = slimTableFactory0.makeTableType("hi!");
        java.util.Map<java.lang.String, java.lang.String> strMap13 = slimTableFactory0.tableTypeArrays;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory14 = new fitnesse.testsystems.slim.tables.SlimTableFactory();
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory15 = new fitnesse.testsystems.slim.tables.SlimTableFactory();
        java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable> wildcardClass17 = slimTableFactory15.getTableType("");
        java.lang.String str19 = slimTableFactory15.getFullTableName("");
        java.util.Map<java.lang.String, java.lang.String> strMap20 = slimTableFactory15.tableTypeArrays;
        slimTableFactory14.tableTypeArrays = strMap20;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory22 = slimTableFactory14.copy();
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory23 = slimTableFactory14.copy();
        java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable> wildcardClass25 = slimTableFactory23.getTableType("hi!");
        java.util.Map<java.lang.String, java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable>> strMap26 = slimTableFactory23.tableTypes;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory27 = new fitnesse.testsystems.slim.tables.SlimTableFactory();
        java.lang.String str29 = slimTableFactory27.getFullTableName("hi!");
        java.util.Map<java.lang.String, java.lang.String> strMap30 = slimTableFactory27.tableTypeArrays;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory31 = slimTableFactory27.copy();
        java.util.Map<java.lang.String, java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable>> strMap32 = slimTableFactory31.tableTypes;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory33 = slimTableFactory31.copy();
        java.lang.String str35 = slimTableFactory33.getFullTableName("hi!");
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory36 = slimTableFactory33.copy();
        java.util.Map<java.lang.String, java.lang.String> strMap37 = slimTableFactory33.tableTypeArrays;
        slimTableFactory23.tableTypeArrays = strMap37;
        java.util.Map<java.lang.String, java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable>> strMap39 = slimTableFactory23.tableTypes;
        java.util.Map<java.lang.String, java.lang.String> strMap40 = slimTableFactory23.tableTypeArrays;
        slimTableFactory0.tableTypeArrays = strMap40;
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!" + "'", str2, "hi!");
        org.junit.Assert.assertNotNull(strMap3);
        org.junit.Assert.assertNotNull(slimTableFactory4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(strMap7);
        org.junit.Assert.assertNotNull(strMap8);
        org.junit.Assert.assertNull(wildcardClass10);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertNotNull(strMap13);
        org.junit.Assert.assertNull(wildcardClass17);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertNotNull(strMap20);
        org.junit.Assert.assertNotNull(slimTableFactory22);
        org.junit.Assert.assertNotNull(slimTableFactory23);
        org.junit.Assert.assertNull(wildcardClass25);
        org.junit.Assert.assertNotNull(strMap26);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "hi!" + "'", str29, "hi!");
        org.junit.Assert.assertNotNull(strMap30);
        org.junit.Assert.assertNotNull(slimTableFactory31);
        org.junit.Assert.assertNotNull(strMap32);
        org.junit.Assert.assertNotNull(slimTableFactory33);
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "hi!" + "'", str35, "hi!");
        org.junit.Assert.assertNotNull(slimTableFactory36);
        org.junit.Assert.assertNotNull(strMap37);
        org.junit.Assert.assertNotNull(strMap39);
        org.junit.Assert.assertNotNull(strMap40);
    }

    @Test
    public void test18002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18002");
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory0 = new fitnesse.testsystems.slim.tables.SlimTableFactory();
        java.lang.String str2 = slimTableFactory0.getFullTableName("hi!");
        java.util.Map<java.lang.String, java.lang.String> strMap3 = slimTableFactory0.tableTypeArrays;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory4 = slimTableFactory0.copy();
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory5 = slimTableFactory0.copy();
        boolean boolean7 = slimTableFactory0.hasColon("");
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory8 = slimTableFactory0.copy();
        java.util.Map<java.lang.String, java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable>> strMap9 = slimTableFactory8.tableTypes;
        boolean boolean11 = slimTableFactory8.hasColon("");
        java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable> wildcardClass13 = slimTableFactory8.getTableType("hi!");
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory14 = slimTableFactory8.copy();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!" + "'", str2, "hi!");
        org.junit.Assert.assertNotNull(strMap3);
        org.junit.Assert.assertNotNull(slimTableFactory4);
        org.junit.Assert.assertNotNull(slimTableFactory5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(slimTableFactory8);
        org.junit.Assert.assertNotNull(strMap9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNull(wildcardClass13);
        org.junit.Assert.assertNotNull(slimTableFactory14);
    }

    @Test
    public void test18003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18003");
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory0 = new fitnesse.testsystems.slim.tables.SlimTableFactory();
        java.lang.String str2 = slimTableFactory0.getFullTableName("hi!");
        java.util.Map<java.lang.String, java.lang.String> strMap3 = slimTableFactory0.tableTypeArrays;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory4 = slimTableFactory0.copy();
        java.util.Map<java.lang.String, java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable>> strMap5 = slimTableFactory4.tableTypes;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory6 = slimTableFactory4.copy();
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory7 = slimTableFactory6.copy();
        java.lang.String str9 = slimTableFactory7.makeTableType("hi!");
        boolean boolean11 = slimTableFactory7.hasColon("");
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory12 = new fitnesse.testsystems.slim.tables.SlimTableFactory();
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory13 = slimTableFactory12.copy();
        java.lang.String str15 = slimTableFactory12.makeTableType("hi!");
        java.util.Map<java.lang.String, java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable>> strMap16 = slimTableFactory12.tableTypes;
        boolean boolean18 = slimTableFactory12.hasColon("");
        java.util.Map<java.lang.String, java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable>> strMap19 = slimTableFactory12.tableTypes;
        java.util.Map<java.lang.String, java.lang.String> strMap20 = slimTableFactory12.tableTypeArrays;
        slimTableFactory7.tableTypeArrays = strMap20;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory22 = new fitnesse.testsystems.slim.tables.SlimTableFactory();
        java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable> wildcardClass24 = slimTableFactory22.getTableType("");
        boolean boolean26 = slimTableFactory22.hasColon("hi!");
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory27 = new fitnesse.testsystems.slim.tables.SlimTableFactory();
        java.lang.String str29 = slimTableFactory27.getFullTableName("hi!");
        java.util.Map<java.lang.String, java.lang.String> strMap30 = slimTableFactory27.tableTypeArrays;
        slimTableFactory22.tableTypeArrays = strMap30;
        java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable> wildcardClass33 = slimTableFactory22.getTableType("hi!");
        boolean boolean35 = slimTableFactory22.hasColon("");
        java.util.Map<java.lang.String, java.lang.String> strMap36 = slimTableFactory22.tableTypeArrays;
        java.lang.String str38 = slimTableFactory22.getFullTableName("hi!");
        java.util.Map<java.lang.String, java.lang.String> strMap39 = slimTableFactory22.tableTypeArrays;
        slimTableFactory7.tableTypeArrays = strMap39;
        java.util.Map<java.lang.String, java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable>> strMap41 = slimTableFactory7.tableTypes;
        fitnesse.testsystems.slim.Table table42 = null;
        // The following exception was thrown during execution in test generation
        try {
            fitnesse.testsystems.slim.tables.SlimTable slimTable43 = slimTableFactory7.parseDefineTableTypeTable(table42);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!" + "'", str2, "hi!");
        org.junit.Assert.assertNotNull(strMap3);
        org.junit.Assert.assertNotNull(slimTableFactory4);
        org.junit.Assert.assertNotNull(strMap5);
        org.junit.Assert.assertNotNull(slimTableFactory6);
        org.junit.Assert.assertNotNull(slimTableFactory7);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(slimTableFactory13);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertNotNull(strMap16);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(strMap19);
        org.junit.Assert.assertNotNull(strMap20);
        org.junit.Assert.assertNull(wildcardClass24);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "hi!" + "'", str29, "hi!");
        org.junit.Assert.assertNotNull(strMap30);
        org.junit.Assert.assertNull(wildcardClass33);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertNotNull(strMap36);
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "hi!" + "'", str38, "hi!");
        org.junit.Assert.assertNotNull(strMap39);
        org.junit.Assert.assertNotNull(strMap41);
    }

    @Test
    public void test18004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18004");
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory0 = new fitnesse.testsystems.slim.tables.SlimTableFactory();
        java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable> wildcardClass2 = slimTableFactory0.getTableType("");
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory3 = new fitnesse.testsystems.slim.tables.SlimTableFactory();
        java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable> wildcardClass5 = slimTableFactory3.getTableType("");
        java.lang.String str7 = slimTableFactory3.getFullTableName("");
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory8 = slimTableFactory3.copy();
        boolean boolean10 = slimTableFactory3.hasColon("");
        java.util.Map<java.lang.String, java.lang.String> strMap11 = slimTableFactory3.tableTypeArrays;
        java.util.Map<java.lang.String, java.lang.String> strMap12 = slimTableFactory3.tableTypeArrays;
        slimTableFactory0.tableTypeArrays = strMap12;
        boolean boolean15 = slimTableFactory0.hasColon("hi!");
        java.util.Map<java.lang.String, java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable>> strMap16 = slimTableFactory0.tableTypes;
        boolean boolean18 = slimTableFactory0.hasColon("");
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory19 = slimTableFactory0.copy();
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory20 = new fitnesse.testsystems.slim.tables.SlimTableFactory();
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory21 = new fitnesse.testsystems.slim.tables.SlimTableFactory();
        java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable> wildcardClass23 = slimTableFactory21.getTableType("");
        java.lang.String str25 = slimTableFactory21.getFullTableName("");
        java.util.Map<java.lang.String, java.lang.String> strMap26 = slimTableFactory21.tableTypeArrays;
        slimTableFactory20.tableTypeArrays = strMap26;
        java.util.Map<java.lang.String, java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable>> strMap28 = slimTableFactory20.tableTypes;
        java.util.Map<java.lang.String, java.lang.String> strMap29 = slimTableFactory20.tableTypeArrays;
        slimTableFactory0.tableTypeArrays = strMap29;
        java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable> wildcardClass32 = slimTableFactory0.getTableType("hi!");
        java.util.Map<java.lang.String, java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable>> strMap33 = slimTableFactory0.tableTypes;
        java.util.Map<java.lang.String, java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable>> strMap34 = slimTableFactory0.tableTypes;
        java.lang.String str36 = slimTableFactory0.makeTableType("");
        java.util.Map<java.lang.String, java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable>> strMap37 = slimTableFactory0.tableTypes;
        fitnesse.testsystems.slim.Table table38 = null;
        fitnesse.testsystems.slim.SlimTestContext slimTestContext40 = null;
        // The following exception was thrown during execution in test generation
        try {
            fitnesse.testsystems.slim.tables.SlimTable slimTable41 = slimTableFactory0.makeSlimTable(table38, "hi!", slimTestContext40);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(wildcardClass2);
        org.junit.Assert.assertNull(wildcardClass5);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNotNull(slimTableFactory8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(strMap11);
        org.junit.Assert.assertNotNull(strMap12);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(strMap16);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(slimTableFactory19);
        org.junit.Assert.assertNull(wildcardClass23);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "" + "'", str25, "");
        org.junit.Assert.assertNotNull(strMap26);
        org.junit.Assert.assertNotNull(strMap28);
        org.junit.Assert.assertNotNull(strMap29);
        org.junit.Assert.assertNull(wildcardClass32);
        org.junit.Assert.assertNotNull(strMap33);
        org.junit.Assert.assertNotNull(strMap34);
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "" + "'", str36, "");
        org.junit.Assert.assertNotNull(strMap37);
    }

    @Test
    public void test18005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18005");
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory0 = new fitnesse.testsystems.slim.tables.SlimTableFactory();
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory1 = new fitnesse.testsystems.slim.tables.SlimTableFactory();
        java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable> wildcardClass3 = slimTableFactory1.getTableType("");
        java.lang.String str5 = slimTableFactory1.getFullTableName("");
        java.util.Map<java.lang.String, java.lang.String> strMap6 = slimTableFactory1.tableTypeArrays;
        slimTableFactory0.tableTypeArrays = strMap6;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory8 = slimTableFactory0.copy();
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory9 = slimTableFactory8.copy();
        java.util.Map<java.lang.String, java.lang.String> strMap10 = slimTableFactory9.tableTypeArrays;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory11 = new fitnesse.testsystems.slim.tables.SlimTableFactory();
        java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable> wildcardClass13 = slimTableFactory11.getTableType("");
        java.lang.String str15 = slimTableFactory11.getFullTableName("");
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory16 = slimTableFactory11.copy();
        boolean boolean18 = slimTableFactory11.hasColon("");
        java.util.Map<java.lang.String, java.lang.String> strMap19 = slimTableFactory11.tableTypeArrays;
        slimTableFactory9.tableTypeArrays = strMap19;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory21 = slimTableFactory9.copy();
        java.util.Map<java.lang.String, java.lang.String> strMap22 = slimTableFactory21.tableTypeArrays;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory23 = slimTableFactory21.copy();
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory24 = new fitnesse.testsystems.slim.tables.SlimTableFactory();
        java.lang.String str26 = slimTableFactory24.getFullTableName("hi!");
        java.util.Map<java.lang.String, java.lang.String> strMap27 = slimTableFactory24.tableTypeArrays;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory28 = slimTableFactory24.copy();
        java.util.Map<java.lang.String, java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable>> strMap29 = slimTableFactory28.tableTypes;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory30 = slimTableFactory28.copy();
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory31 = slimTableFactory30.copy();
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory32 = slimTableFactory30.copy();
        boolean boolean34 = slimTableFactory30.hasColon("");
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory35 = slimTableFactory30.copy();
        java.util.Map<java.lang.String, java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable>> strMap36 = slimTableFactory35.tableTypes;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory37 = slimTableFactory35.copy();
        java.util.Map<java.lang.String, java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable>> strMap38 = slimTableFactory35.tableTypes;
        java.util.Map<java.lang.String, java.lang.String> strMap39 = slimTableFactory35.tableTypeArrays;
        slimTableFactory23.tableTypeArrays = strMap39;
        java.lang.Class<?> wildcardClass41 = slimTableFactory23.getClass();
        org.junit.Assert.assertNull(wildcardClass3);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(strMap6);
        org.junit.Assert.assertNotNull(slimTableFactory8);
        org.junit.Assert.assertNotNull(slimTableFactory9);
        org.junit.Assert.assertNotNull(strMap10);
        org.junit.Assert.assertNull(wildcardClass13);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertNotNull(slimTableFactory16);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(strMap19);
        org.junit.Assert.assertNotNull(slimTableFactory21);
        org.junit.Assert.assertNotNull(strMap22);
        org.junit.Assert.assertNotNull(slimTableFactory23);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "hi!" + "'", str26, "hi!");
        org.junit.Assert.assertNotNull(strMap27);
        org.junit.Assert.assertNotNull(slimTableFactory28);
        org.junit.Assert.assertNotNull(strMap29);
        org.junit.Assert.assertNotNull(slimTableFactory30);
        org.junit.Assert.assertNotNull(slimTableFactory31);
        org.junit.Assert.assertNotNull(slimTableFactory32);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertNotNull(slimTableFactory35);
        org.junit.Assert.assertNotNull(strMap36);
        org.junit.Assert.assertNotNull(slimTableFactory37);
        org.junit.Assert.assertNotNull(strMap38);
        org.junit.Assert.assertNotNull(strMap39);
        org.junit.Assert.assertNotNull(wildcardClass41);
    }

    @Test
    public void test18006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18006");
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory0 = new fitnesse.testsystems.slim.tables.SlimTableFactory();
        java.lang.String str2 = slimTableFactory0.getFullTableName("hi!");
        java.util.Map<java.lang.String, java.lang.String> strMap3 = slimTableFactory0.tableTypeArrays;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory4 = slimTableFactory0.copy();
        java.util.Map<java.lang.String, java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable>> strMap5 = slimTableFactory4.tableTypes;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory6 = slimTableFactory4.copy();
        java.util.Map<java.lang.String, java.lang.String> strMap7 = slimTableFactory6.tableTypeArrays;
        java.util.Map<java.lang.String, java.lang.String> strMap8 = slimTableFactory6.tableTypeArrays;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory9 = new fitnesse.testsystems.slim.tables.SlimTableFactory();
        java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable> wildcardClass11 = slimTableFactory9.getTableType("");
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory12 = new fitnesse.testsystems.slim.tables.SlimTableFactory();
        java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable> wildcardClass14 = slimTableFactory12.getTableType("");
        java.lang.String str16 = slimTableFactory12.getFullTableName("");
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory17 = slimTableFactory12.copy();
        boolean boolean19 = slimTableFactory12.hasColon("");
        java.util.Map<java.lang.String, java.lang.String> strMap20 = slimTableFactory12.tableTypeArrays;
        java.util.Map<java.lang.String, java.lang.String> strMap21 = slimTableFactory12.tableTypeArrays;
        slimTableFactory9.tableTypeArrays = strMap21;
        slimTableFactory6.tableTypeArrays = strMap21;
        java.util.Map<java.lang.String, java.lang.String> strMap24 = slimTableFactory6.tableTypeArrays;
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!" + "'", str2, "hi!");
        org.junit.Assert.assertNotNull(strMap3);
        org.junit.Assert.assertNotNull(slimTableFactory4);
        org.junit.Assert.assertNotNull(strMap5);
        org.junit.Assert.assertNotNull(slimTableFactory6);
        org.junit.Assert.assertNotNull(strMap7);
        org.junit.Assert.assertNotNull(strMap8);
        org.junit.Assert.assertNull(wildcardClass11);
        org.junit.Assert.assertNull(wildcardClass14);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertNotNull(slimTableFactory17);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(strMap20);
        org.junit.Assert.assertNotNull(strMap21);
        org.junit.Assert.assertNotNull(strMap24);
    }

    @Test
    public void test18007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18007");
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory0 = new fitnesse.testsystems.slim.tables.SlimTableFactory();
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory1 = new fitnesse.testsystems.slim.tables.SlimTableFactory();
        java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable> wildcardClass3 = slimTableFactory1.getTableType("");
        java.lang.String str5 = slimTableFactory1.getFullTableName("");
        java.util.Map<java.lang.String, java.lang.String> strMap6 = slimTableFactory1.tableTypeArrays;
        slimTableFactory0.tableTypeArrays = strMap6;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory8 = slimTableFactory0.copy();
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory9 = slimTableFactory0.copy();
        java.util.Map<java.lang.String, java.lang.String> strMap10 = slimTableFactory0.tableTypeArrays;
        java.lang.String str12 = slimTableFactory0.getFullTableName("");
        java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable> wildcardClass14 = slimTableFactory0.getTableType("hi!");
        java.lang.String str16 = slimTableFactory0.makeTableType("");
        boolean boolean18 = slimTableFactory0.hasColon("hi!");
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory19 = slimTableFactory0.copy();
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory20 = slimTableFactory19.copy();
        boolean boolean22 = slimTableFactory19.hasColon("");
        java.lang.String str24 = slimTableFactory19.makeTableType("hi!");
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory25 = slimTableFactory19.copy();
        org.junit.Assert.assertNull(wildcardClass3);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(strMap6);
        org.junit.Assert.assertNotNull(slimTableFactory8);
        org.junit.Assert.assertNotNull(slimTableFactory9);
        org.junit.Assert.assertNotNull(strMap10);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertNull(wildcardClass14);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(slimTableFactory19);
        org.junit.Assert.assertNotNull(slimTableFactory20);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "hi!" + "'", str24, "hi!");
        org.junit.Assert.assertNotNull(slimTableFactory25);
    }

    @Test
    public void test18008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18008");
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory0 = new fitnesse.testsystems.slim.tables.SlimTableFactory();
        java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable> wildcardClass2 = slimTableFactory0.getTableType("");
        java.lang.String str4 = slimTableFactory0.getFullTableName("");
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory5 = slimTableFactory0.copy();
        boolean boolean7 = slimTableFactory0.hasColon("");
        java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable> wildcardClass9 = slimTableFactory0.getTableType("");
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory10 = slimTableFactory0.copy();
        java.util.Map<java.lang.String, java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable>> strMap11 = slimTableFactory0.tableTypes;
        java.lang.String str13 = slimTableFactory0.getFullTableName("");
        boolean boolean15 = slimTableFactory0.hasColon("");
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory16 = new fitnesse.testsystems.slim.tables.SlimTableFactory();
        java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable> wildcardClass18 = slimTableFactory16.getTableType("");
        java.lang.String str20 = slimTableFactory16.getFullTableName("");
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory21 = slimTableFactory16.copy();
        java.lang.String str23 = slimTableFactory16.makeTableType("hi!");
        java.util.Map<java.lang.String, java.lang.String> strMap24 = slimTableFactory16.tableTypeArrays;
        slimTableFactory0.tableTypeArrays = strMap24;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory26 = new fitnesse.testsystems.slim.tables.SlimTableFactory();
        java.lang.String str28 = slimTableFactory26.getFullTableName("hi!");
        java.util.Map<java.lang.String, java.lang.String> strMap29 = slimTableFactory26.tableTypeArrays;
        java.lang.String str31 = slimTableFactory26.makeTableType("");
        java.util.Map<java.lang.String, java.lang.String> strMap32 = slimTableFactory26.tableTypeArrays;
        java.util.Map<java.lang.String, java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable>> strMap33 = slimTableFactory26.tableTypes;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory34 = new fitnesse.testsystems.slim.tables.SlimTableFactory();
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory35 = new fitnesse.testsystems.slim.tables.SlimTableFactory();
        java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable> wildcardClass37 = slimTableFactory35.getTableType("");
        java.lang.String str39 = slimTableFactory35.getFullTableName("");
        java.util.Map<java.lang.String, java.lang.String> strMap40 = slimTableFactory35.tableTypeArrays;
        slimTableFactory34.tableTypeArrays = strMap40;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory42 = slimTableFactory34.copy();
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory43 = slimTableFactory42.copy();
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory44 = slimTableFactory42.copy();
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory45 = new fitnesse.testsystems.slim.tables.SlimTableFactory();
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory46 = slimTableFactory45.copy();
        java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable> wildcardClass48 = slimTableFactory46.getTableType("hi!");
        java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable> wildcardClass50 = slimTableFactory46.getTableType("hi!");
        boolean boolean52 = slimTableFactory46.hasColon("");
        java.util.Map<java.lang.String, java.lang.String> strMap53 = slimTableFactory46.tableTypeArrays;
        slimTableFactory44.tableTypeArrays = strMap53;
        slimTableFactory26.tableTypeArrays = strMap53;
        slimTableFactory0.tableTypeArrays = strMap53;
        java.util.Map<java.lang.String, java.lang.String> strMap57 = slimTableFactory0.tableTypeArrays;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory58 = slimTableFactory0.copy();
        java.lang.String str60 = slimTableFactory0.makeTableType("");
        boolean boolean62 = slimTableFactory0.hasColon("");
        org.junit.Assert.assertNull(wildcardClass2);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(slimTableFactory5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(wildcardClass9);
        org.junit.Assert.assertNotNull(slimTableFactory10);
        org.junit.Assert.assertNotNull(strMap11);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNull(wildcardClass18);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertNotNull(slimTableFactory21);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "hi!" + "'", str23, "hi!");
        org.junit.Assert.assertNotNull(strMap24);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "hi!" + "'", str28, "hi!");
        org.junit.Assert.assertNotNull(strMap29);
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "" + "'", str31, "");
        org.junit.Assert.assertNotNull(strMap32);
        org.junit.Assert.assertNotNull(strMap33);
        org.junit.Assert.assertNull(wildcardClass37);
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "" + "'", str39, "");
        org.junit.Assert.assertNotNull(strMap40);
        org.junit.Assert.assertNotNull(slimTableFactory42);
        org.junit.Assert.assertNotNull(slimTableFactory43);
        org.junit.Assert.assertNotNull(slimTableFactory44);
        org.junit.Assert.assertNotNull(slimTableFactory46);
        org.junit.Assert.assertNull(wildcardClass48);
        org.junit.Assert.assertNull(wildcardClass50);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
        org.junit.Assert.assertNotNull(strMap53);
        org.junit.Assert.assertNotNull(strMap57);
        org.junit.Assert.assertNotNull(slimTableFactory58);
        org.junit.Assert.assertEquals("'" + str60 + "' != '" + "" + "'", str60, "");
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + false + "'", boolean62 == false);
    }

    @Test
    public void test18009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18009");
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory0 = new fitnesse.testsystems.slim.tables.SlimTableFactory();
        java.lang.String str2 = slimTableFactory0.getFullTableName("hi!");
        java.lang.String str4 = slimTableFactory0.makeTableType("");
        java.util.Map<java.lang.String, java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable>> strMap5 = slimTableFactory0.tableTypes;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory6 = slimTableFactory0.copy();
        java.lang.String str8 = slimTableFactory0.getFullTableName("");
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory9 = new fitnesse.testsystems.slim.tables.SlimTableFactory();
        java.lang.String str11 = slimTableFactory9.getFullTableName("hi!");
        java.util.Map<java.lang.String, java.lang.String> strMap12 = slimTableFactory9.tableTypeArrays;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory13 = new fitnesse.testsystems.slim.tables.SlimTableFactory();
        java.lang.String str15 = slimTableFactory13.getFullTableName("hi!");
        java.util.Map<java.lang.String, java.lang.String> strMap16 = slimTableFactory13.tableTypeArrays;
        slimTableFactory9.tableTypeArrays = strMap16;
        java.lang.String str19 = slimTableFactory9.makeTableType("");
        java.util.Map<java.lang.String, java.lang.String> strMap20 = slimTableFactory9.tableTypeArrays;
        slimTableFactory0.tableTypeArrays = strMap20;
        fitnesse.testsystems.slim.Table table22 = null;
        // The following exception was thrown during execution in test generation
        try {
            fitnesse.testsystems.slim.tables.SlimTable slimTable23 = slimTableFactory0.parseDefineTableTypeTable(table22);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!" + "'", str2, "hi!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(strMap5);
        org.junit.Assert.assertNotNull(slimTableFactory6);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertNotNull(strMap12);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertNotNull(strMap16);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertNotNull(strMap20);
    }

    @Test
    public void test18010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18010");
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory0 = new fitnesse.testsystems.slim.tables.SlimTableFactory();
        java.lang.String str2 = slimTableFactory0.getFullTableName("hi!");
        java.lang.String str4 = slimTableFactory0.makeTableType("");
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory5 = slimTableFactory0.copy();
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory6 = slimTableFactory5.copy();
        java.lang.String str8 = slimTableFactory5.makeTableType("");
        java.util.Map<java.lang.String, java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable>> strMap9 = slimTableFactory5.tableTypes;
        java.lang.String str11 = slimTableFactory5.makeTableType("hi!");
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory12 = new fitnesse.testsystems.slim.tables.SlimTableFactory();
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory13 = new fitnesse.testsystems.slim.tables.SlimTableFactory();
        java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable> wildcardClass15 = slimTableFactory13.getTableType("");
        java.lang.String str17 = slimTableFactory13.getFullTableName("");
        java.util.Map<java.lang.String, java.lang.String> strMap18 = slimTableFactory13.tableTypeArrays;
        slimTableFactory12.tableTypeArrays = strMap18;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory20 = slimTableFactory12.copy();
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory21 = slimTableFactory12.copy();
        java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable> wildcardClass23 = slimTableFactory21.getTableType("hi!");
        java.util.Map<java.lang.String, java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable>> strMap24 = slimTableFactory21.tableTypes;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory25 = new fitnesse.testsystems.slim.tables.SlimTableFactory();
        java.lang.String str27 = slimTableFactory25.getFullTableName("hi!");
        java.util.Map<java.lang.String, java.lang.String> strMap28 = slimTableFactory25.tableTypeArrays;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory29 = slimTableFactory25.copy();
        java.util.Map<java.lang.String, java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable>> strMap30 = slimTableFactory29.tableTypes;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory31 = slimTableFactory29.copy();
        java.lang.String str33 = slimTableFactory31.getFullTableName("hi!");
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory34 = slimTableFactory31.copy();
        java.util.Map<java.lang.String, java.lang.String> strMap35 = slimTableFactory31.tableTypeArrays;
        slimTableFactory21.tableTypeArrays = strMap35;
        java.util.Map<java.lang.String, java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable>> strMap37 = slimTableFactory21.tableTypes;
        java.util.Map<java.lang.String, java.lang.String> strMap38 = slimTableFactory21.tableTypeArrays;
        java.lang.String str40 = slimTableFactory21.getFullTableName("");
        java.lang.String str42 = slimTableFactory21.makeTableType("");
        boolean boolean44 = slimTableFactory21.hasColon("");
        java.util.Map<java.lang.String, java.lang.String> strMap45 = slimTableFactory21.tableTypeArrays;
        slimTableFactory5.tableTypeArrays = strMap45;
        boolean boolean48 = slimTableFactory5.hasColon("");
        fitnesse.testsystems.slim.Table table49 = null;
        fitnesse.testsystems.slim.SlimTestContext slimTestContext51 = null;
        // The following exception was thrown during execution in test generation
        try {
            fitnesse.testsystems.slim.tables.SlimTable slimTable52 = slimTableFactory5.makeSlimTable(table49, "hi!", slimTestContext51);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!" + "'", str2, "hi!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(slimTableFactory5);
        org.junit.Assert.assertNotNull(slimTableFactory6);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNotNull(strMap9);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertNull(wildcardClass15);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertNotNull(strMap18);
        org.junit.Assert.assertNotNull(slimTableFactory20);
        org.junit.Assert.assertNotNull(slimTableFactory21);
        org.junit.Assert.assertNull(wildcardClass23);
        org.junit.Assert.assertNotNull(strMap24);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "hi!" + "'", str27, "hi!");
        org.junit.Assert.assertNotNull(strMap28);
        org.junit.Assert.assertNotNull(slimTableFactory29);
        org.junit.Assert.assertNotNull(strMap30);
        org.junit.Assert.assertNotNull(slimTableFactory31);
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "hi!" + "'", str33, "hi!");
        org.junit.Assert.assertNotNull(slimTableFactory34);
        org.junit.Assert.assertNotNull(strMap35);
        org.junit.Assert.assertNotNull(strMap37);
        org.junit.Assert.assertNotNull(strMap38);
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "" + "'", str40, "");
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "" + "'", str42, "");
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertNotNull(strMap45);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
    }

    @Test
    public void test18011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18011");
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory0 = new fitnesse.testsystems.slim.tables.SlimTableFactory();
        java.lang.String str2 = slimTableFactory0.getFullTableName("hi!");
        java.util.Map<java.lang.String, java.lang.String> strMap3 = slimTableFactory0.tableTypeArrays;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory4 = new fitnesse.testsystems.slim.tables.SlimTableFactory();
        java.lang.String str6 = slimTableFactory4.getFullTableName("hi!");
        java.util.Map<java.lang.String, java.lang.String> strMap7 = slimTableFactory4.tableTypeArrays;
        slimTableFactory0.tableTypeArrays = strMap7;
        java.lang.String str10 = slimTableFactory0.getFullTableName("");
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory11 = slimTableFactory0.copy();
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory12 = slimTableFactory11.copy();
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory13 = slimTableFactory12.copy();
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory14 = slimTableFactory13.copy();
        java.util.Map<java.lang.String, java.lang.String> strMap15 = slimTableFactory13.tableTypeArrays;
        java.lang.String str17 = slimTableFactory13.makeTableType("hi!");
        java.lang.String str19 = slimTableFactory13.getFullTableName("");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!" + "'", str2, "hi!");
        org.junit.Assert.assertNotNull(strMap3);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertNotNull(strMap7);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNotNull(slimTableFactory11);
        org.junit.Assert.assertNotNull(slimTableFactory12);
        org.junit.Assert.assertNotNull(slimTableFactory13);
        org.junit.Assert.assertNotNull(slimTableFactory14);
        org.junit.Assert.assertNotNull(strMap15);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
    }

    @Test
    public void test18012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18012");
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory0 = new fitnesse.testsystems.slim.tables.SlimTableFactory();
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory1 = slimTableFactory0.copy();
        java.lang.String str3 = slimTableFactory0.makeTableType("hi!");
        java.lang.String str5 = slimTableFactory0.makeTableType("");
        java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable> wildcardClass7 = slimTableFactory0.getTableType("");
        java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable> wildcardClass9 = slimTableFactory0.getTableType("hi!");
        java.util.Map<java.lang.String, java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable>> strMap10 = slimTableFactory0.tableTypes;
        boolean boolean12 = slimTableFactory0.hasColon("");
        java.lang.String str14 = slimTableFactory0.getFullTableName("hi!");
        java.util.Map<java.lang.String, java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable>> strMap15 = slimTableFactory0.tableTypes;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory16 = new fitnesse.testsystems.slim.tables.SlimTableFactory();
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory17 = new fitnesse.testsystems.slim.tables.SlimTableFactory();
        java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable> wildcardClass19 = slimTableFactory17.getTableType("");
        java.lang.String str21 = slimTableFactory17.getFullTableName("");
        java.util.Map<java.lang.String, java.lang.String> strMap22 = slimTableFactory17.tableTypeArrays;
        slimTableFactory16.tableTypeArrays = strMap22;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory24 = slimTableFactory16.copy();
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory25 = slimTableFactory24.copy();
        java.util.Map<java.lang.String, java.lang.String> strMap26 = slimTableFactory25.tableTypeArrays;
        java.lang.String str28 = slimTableFactory25.makeTableType("hi!");
        boolean boolean30 = slimTableFactory25.hasColon("hi!");
        java.util.Map<java.lang.String, java.lang.String> strMap31 = slimTableFactory25.tableTypeArrays;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory32 = new fitnesse.testsystems.slim.tables.SlimTableFactory();
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory33 = slimTableFactory32.copy();
        java.util.Map<java.lang.String, java.lang.String> strMap34 = slimTableFactory32.tableTypeArrays;
        slimTableFactory25.tableTypeArrays = strMap34;
        java.util.Map<java.lang.String, java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable>> strMap36 = slimTableFactory25.tableTypes;
        java.lang.String str38 = slimTableFactory25.makeTableType("");
        java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable> wildcardClass40 = slimTableFactory25.getTableType("hi!");
        java.lang.String str42 = slimTableFactory25.makeTableType("");
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory43 = slimTableFactory25.copy();
        java.lang.String str45 = slimTableFactory25.makeTableType("");
        java.util.Map<java.lang.String, java.lang.String> strMap46 = slimTableFactory25.tableTypeArrays;
        slimTableFactory0.tableTypeArrays = strMap46;
        org.junit.Assert.assertNotNull(slimTableFactory1);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNull(wildcardClass7);
        org.junit.Assert.assertNull(wildcardClass9);
        org.junit.Assert.assertNotNull(strMap10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertNotNull(strMap15);
        org.junit.Assert.assertNull(wildcardClass19);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertNotNull(strMap22);
        org.junit.Assert.assertNotNull(slimTableFactory24);
        org.junit.Assert.assertNotNull(slimTableFactory25);
        org.junit.Assert.assertNotNull(strMap26);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "hi!" + "'", str28, "hi!");
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertNotNull(strMap31);
        org.junit.Assert.assertNotNull(slimTableFactory33);
        org.junit.Assert.assertNotNull(strMap34);
        org.junit.Assert.assertNotNull(strMap36);
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "" + "'", str38, "");
        org.junit.Assert.assertNull(wildcardClass40);
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "" + "'", str42, "");
        org.junit.Assert.assertNotNull(slimTableFactory43);
        org.junit.Assert.assertEquals("'" + str45 + "' != '" + "" + "'", str45, "");
        org.junit.Assert.assertNotNull(strMap46);
    }

    @Test
    public void test18013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18013");
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory0 = new fitnesse.testsystems.slim.tables.SlimTableFactory();
        java.lang.String str2 = slimTableFactory0.getFullTableName("hi!");
        java.util.Map<java.lang.String, java.lang.String> strMap3 = slimTableFactory0.tableTypeArrays;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory4 = new fitnesse.testsystems.slim.tables.SlimTableFactory();
        java.lang.String str6 = slimTableFactory4.getFullTableName("hi!");
        java.util.Map<java.lang.String, java.lang.String> strMap7 = slimTableFactory4.tableTypeArrays;
        slimTableFactory0.tableTypeArrays = strMap7;
        java.lang.String str10 = slimTableFactory0.makeTableType("");
        java.lang.String str12 = slimTableFactory0.makeTableType("hi!");
        boolean boolean14 = slimTableFactory0.hasColon("");
        java.util.Map<java.lang.String, java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable>> strMap15 = slimTableFactory0.tableTypes;
        boolean boolean17 = slimTableFactory0.hasColon("");
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory18 = slimTableFactory0.copy();
        java.lang.String str20 = slimTableFactory18.getFullTableName("");
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory21 = slimTableFactory18.copy();
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory22 = slimTableFactory18.copy();
        java.util.Map<java.lang.String, java.lang.String> strMap23 = slimTableFactory22.tableTypeArrays;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory24 = new fitnesse.testsystems.slim.tables.SlimTableFactory();
        java.lang.String str26 = slimTableFactory24.getFullTableName("hi!");
        java.lang.String str28 = slimTableFactory24.makeTableType("");
        java.util.Map<java.lang.String, java.lang.String> strMap29 = null;
        slimTableFactory24.tableTypeArrays = strMap29;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory31 = new fitnesse.testsystems.slim.tables.SlimTableFactory();
        java.lang.String str33 = slimTableFactory31.getFullTableName("hi!");
        java.util.Map<java.lang.String, java.lang.String> strMap34 = slimTableFactory31.tableTypeArrays;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory35 = slimTableFactory31.copy();
        java.util.Map<java.lang.String, java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable>> strMap36 = slimTableFactory35.tableTypes;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory37 = slimTableFactory35.copy();
        java.util.Map<java.lang.String, java.lang.String> strMap38 = slimTableFactory37.tableTypeArrays;
        java.util.Map<java.lang.String, java.lang.String> strMap39 = slimTableFactory37.tableTypeArrays;
        slimTableFactory24.tableTypeArrays = strMap39;
        java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable> wildcardClass42 = slimTableFactory24.getTableType("hi!");
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory43 = slimTableFactory24.copy();
        java.util.Map<java.lang.String, java.lang.String> strMap44 = slimTableFactory24.tableTypeArrays;
        java.util.Map<java.lang.String, java.lang.String> strMap45 = slimTableFactory24.tableTypeArrays;
        slimTableFactory22.tableTypeArrays = strMap45;
        java.lang.String str48 = slimTableFactory22.makeTableType("hi!");
        java.lang.Class<?> wildcardClass49 = slimTableFactory22.getClass();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!" + "'", str2, "hi!");
        org.junit.Assert.assertNotNull(strMap3);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertNotNull(strMap7);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(strMap15);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(slimTableFactory18);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertNotNull(slimTableFactory21);
        org.junit.Assert.assertNotNull(slimTableFactory22);
        org.junit.Assert.assertNotNull(strMap23);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "hi!" + "'", str26, "hi!");
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "" + "'", str28, "");
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "hi!" + "'", str33, "hi!");
        org.junit.Assert.assertNotNull(strMap34);
        org.junit.Assert.assertNotNull(slimTableFactory35);
        org.junit.Assert.assertNotNull(strMap36);
        org.junit.Assert.assertNotNull(slimTableFactory37);
        org.junit.Assert.assertNotNull(strMap38);
        org.junit.Assert.assertNotNull(strMap39);
        org.junit.Assert.assertNull(wildcardClass42);
        org.junit.Assert.assertNotNull(slimTableFactory43);
        org.junit.Assert.assertNotNull(strMap44);
        org.junit.Assert.assertNotNull(strMap45);
        org.junit.Assert.assertEquals("'" + str48 + "' != '" + "hi!" + "'", str48, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass49);
    }

    @Test
    public void test18014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18014");
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory0 = new fitnesse.testsystems.slim.tables.SlimTableFactory();
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory1 = slimTableFactory0.copy();
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory2 = slimTableFactory0.copy();
        java.lang.String str4 = slimTableFactory2.makeTableType("hi!");
        java.util.Map<java.lang.String, java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable>> strMap5 = slimTableFactory2.tableTypes;
        org.junit.Assert.assertNotNull(slimTableFactory1);
        org.junit.Assert.assertNotNull(slimTableFactory2);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertNotNull(strMap5);
    }

    @Test
    public void test18015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18015");
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory0 = new fitnesse.testsystems.slim.tables.SlimTableFactory();
        java.lang.String str2 = slimTableFactory0.getFullTableName("hi!");
        java.lang.String str4 = slimTableFactory0.makeTableType("");
        java.util.Map<java.lang.String, java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable>> strMap5 = slimTableFactory0.tableTypes;
        java.lang.String str7 = slimTableFactory0.makeTableType("hi!");
        java.lang.String str9 = slimTableFactory0.getFullTableName("");
        java.util.Map<java.lang.String, java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable>> strMap10 = slimTableFactory0.tableTypes;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory11 = slimTableFactory0.copy();
        java.lang.String str13 = slimTableFactory0.getFullTableName("hi!");
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory14 = slimTableFactory0.copy();
        java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable> wildcardClass16 = slimTableFactory14.getTableType("hi!");
        java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable> wildcardClass18 = slimTableFactory14.getTableType("");
        java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable> wildcardClass20 = slimTableFactory14.getTableType("hi!");
        java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable> wildcardClass22 = slimTableFactory14.getTableType("hi!");
        java.util.Map<java.lang.String, java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable>> strMap23 = slimTableFactory14.tableTypes;
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!" + "'", str2, "hi!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(strMap5);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNotNull(strMap10);
        org.junit.Assert.assertNotNull(slimTableFactory11);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertNotNull(slimTableFactory14);
        org.junit.Assert.assertNull(wildcardClass16);
        org.junit.Assert.assertNull(wildcardClass18);
        org.junit.Assert.assertNull(wildcardClass20);
        org.junit.Assert.assertNull(wildcardClass22);
        org.junit.Assert.assertNotNull(strMap23);
    }

    @Test
    public void test18016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18016");
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory0 = new fitnesse.testsystems.slim.tables.SlimTableFactory();
        java.lang.String str2 = slimTableFactory0.getFullTableName("hi!");
        java.util.Map<java.lang.String, java.lang.String> strMap3 = slimTableFactory0.tableTypeArrays;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory4 = slimTableFactory0.copy();
        java.util.Map<java.lang.String, java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable>> strMap5 = slimTableFactory4.tableTypes;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory6 = slimTableFactory4.copy();
        java.lang.String str8 = slimTableFactory6.getFullTableName("hi!");
        java.lang.String str10 = slimTableFactory6.makeTableType("hi!");
        java.lang.String str12 = slimTableFactory6.getFullTableName("hi!");
        java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable> wildcardClass14 = slimTableFactory6.getTableType("");
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory15 = new fitnesse.testsystems.slim.tables.SlimTableFactory();
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory16 = new fitnesse.testsystems.slim.tables.SlimTableFactory();
        java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable> wildcardClass18 = slimTableFactory16.getTableType("");
        java.lang.String str20 = slimTableFactory16.getFullTableName("");
        java.util.Map<java.lang.String, java.lang.String> strMap21 = slimTableFactory16.tableTypeArrays;
        slimTableFactory15.tableTypeArrays = strMap21;
        slimTableFactory6.tableTypeArrays = strMap21;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory24 = new fitnesse.testsystems.slim.tables.SlimTableFactory();
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory25 = new fitnesse.testsystems.slim.tables.SlimTableFactory();
        java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable> wildcardClass27 = slimTableFactory25.getTableType("");
        java.lang.String str29 = slimTableFactory25.getFullTableName("");
        java.util.Map<java.lang.String, java.lang.String> strMap30 = slimTableFactory25.tableTypeArrays;
        slimTableFactory24.tableTypeArrays = strMap30;
        java.util.Map<java.lang.String, java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable>> strMap32 = slimTableFactory24.tableTypes;
        java.util.Map<java.lang.String, java.lang.String> strMap33 = slimTableFactory24.tableTypeArrays;
        slimTableFactory6.tableTypeArrays = strMap33;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory35 = slimTableFactory6.copy();
        java.util.Map<java.lang.String, java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable>> strMap36 = slimTableFactory6.tableTypes;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory37 = slimTableFactory6.copy();
        boolean boolean39 = slimTableFactory6.hasColon("hi!");
        java.util.Map<java.lang.String, java.lang.String> strMap40 = slimTableFactory6.tableTypeArrays;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory41 = slimTableFactory6.copy();
        java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable> wildcardClass43 = slimTableFactory6.getTableType("");
        java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable> wildcardClass45 = slimTableFactory6.getTableType("");
        boolean boolean47 = slimTableFactory6.hasColon("");
        fitnesse.testsystems.slim.Table table48 = null;
        // The following exception was thrown during execution in test generation
        try {
            slimTableFactory6.parseDefineTableTypeRow(table48, (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!" + "'", str2, "hi!");
        org.junit.Assert.assertNotNull(strMap3);
        org.junit.Assert.assertNotNull(slimTableFactory4);
        org.junit.Assert.assertNotNull(strMap5);
        org.junit.Assert.assertNotNull(slimTableFactory6);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertNull(wildcardClass14);
        org.junit.Assert.assertNull(wildcardClass18);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertNotNull(strMap21);
        org.junit.Assert.assertNull(wildcardClass27);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "" + "'", str29, "");
        org.junit.Assert.assertNotNull(strMap30);
        org.junit.Assert.assertNotNull(strMap32);
        org.junit.Assert.assertNotNull(strMap33);
        org.junit.Assert.assertNotNull(slimTableFactory35);
        org.junit.Assert.assertNotNull(strMap36);
        org.junit.Assert.assertNotNull(slimTableFactory37);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertNotNull(strMap40);
        org.junit.Assert.assertNotNull(slimTableFactory41);
        org.junit.Assert.assertNull(wildcardClass43);
        org.junit.Assert.assertNull(wildcardClass45);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
    }

    @Test
    public void test18017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18017");
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory0 = new fitnesse.testsystems.slim.tables.SlimTableFactory();
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory1 = new fitnesse.testsystems.slim.tables.SlimTableFactory();
        java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable> wildcardClass3 = slimTableFactory1.getTableType("");
        java.lang.String str5 = slimTableFactory1.getFullTableName("");
        java.util.Map<java.lang.String, java.lang.String> strMap6 = slimTableFactory1.tableTypeArrays;
        slimTableFactory0.tableTypeArrays = strMap6;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory8 = slimTableFactory0.copy();
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory9 = slimTableFactory8.copy();
        java.util.Map<java.lang.String, java.lang.String> strMap10 = slimTableFactory9.tableTypeArrays;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory11 = new fitnesse.testsystems.slim.tables.SlimTableFactory();
        java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable> wildcardClass13 = slimTableFactory11.getTableType("");
        java.lang.String str15 = slimTableFactory11.getFullTableName("");
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory16 = slimTableFactory11.copy();
        boolean boolean18 = slimTableFactory11.hasColon("");
        java.util.Map<java.lang.String, java.lang.String> strMap19 = slimTableFactory11.tableTypeArrays;
        slimTableFactory9.tableTypeArrays = strMap19;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory21 = slimTableFactory9.copy();
        java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable> wildcardClass23 = slimTableFactory21.getTableType("hi!");
        java.lang.String str25 = slimTableFactory21.makeTableType("hi!");
        boolean boolean27 = slimTableFactory21.hasColon("");
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory28 = slimTableFactory21.copy();
        java.lang.Class<?> wildcardClass29 = slimTableFactory28.getClass();
        org.junit.Assert.assertNull(wildcardClass3);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(strMap6);
        org.junit.Assert.assertNotNull(slimTableFactory8);
        org.junit.Assert.assertNotNull(slimTableFactory9);
        org.junit.Assert.assertNotNull(strMap10);
        org.junit.Assert.assertNull(wildcardClass13);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertNotNull(slimTableFactory16);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(strMap19);
        org.junit.Assert.assertNotNull(slimTableFactory21);
        org.junit.Assert.assertNull(wildcardClass23);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "hi!" + "'", str25, "hi!");
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNotNull(slimTableFactory28);
        org.junit.Assert.assertNotNull(wildcardClass29);
    }

    @Test
    public void test18018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18018");
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory0 = new fitnesse.testsystems.slim.tables.SlimTableFactory();
        java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable> wildcardClass2 = slimTableFactory0.getTableType("");
        java.lang.String str4 = slimTableFactory0.getFullTableName("");
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory5 = slimTableFactory0.copy();
        java.lang.String str7 = slimTableFactory0.makeTableType("hi!");
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory8 = new fitnesse.testsystems.slim.tables.SlimTableFactory();
        java.lang.String str10 = slimTableFactory8.getFullTableName("hi!");
        java.util.Map<java.lang.String, java.lang.String> strMap11 = slimTableFactory8.tableTypeArrays;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory12 = new fitnesse.testsystems.slim.tables.SlimTableFactory();
        java.lang.String str14 = slimTableFactory12.getFullTableName("hi!");
        java.util.Map<java.lang.String, java.lang.String> strMap15 = slimTableFactory12.tableTypeArrays;
        slimTableFactory8.tableTypeArrays = strMap15;
        java.lang.String str18 = slimTableFactory8.getFullTableName("");
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory19 = new fitnesse.testsystems.slim.tables.SlimTableFactory();
        java.lang.String str21 = slimTableFactory19.getFullTableName("hi!");
        java.util.Map<java.lang.String, java.lang.String> strMap22 = slimTableFactory19.tableTypeArrays;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory23 = new fitnesse.testsystems.slim.tables.SlimTableFactory();
        java.lang.String str25 = slimTableFactory23.getFullTableName("hi!");
        java.util.Map<java.lang.String, java.lang.String> strMap26 = slimTableFactory23.tableTypeArrays;
        slimTableFactory19.tableTypeArrays = strMap26;
        slimTableFactory8.tableTypeArrays = strMap26;
        slimTableFactory0.tableTypeArrays = strMap26;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory30 = slimTableFactory0.copy();
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory31 = slimTableFactory30.copy();
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory32 = slimTableFactory30.copy();
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory33 = slimTableFactory32.copy();
        java.util.Map<java.lang.String, java.lang.String> strMap34 = slimTableFactory33.tableTypeArrays;
        java.util.Map<java.lang.String, java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable>> strMap35 = slimTableFactory33.tableTypes;
        java.lang.Class<?> wildcardClass36 = slimTableFactory33.getClass();
        org.junit.Assert.assertNull(wildcardClass2);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(slimTableFactory5);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertNotNull(strMap11);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertNotNull(strMap15);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "hi!" + "'", str21, "hi!");
        org.junit.Assert.assertNotNull(strMap22);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "hi!" + "'", str25, "hi!");
        org.junit.Assert.assertNotNull(strMap26);
        org.junit.Assert.assertNotNull(slimTableFactory30);
        org.junit.Assert.assertNotNull(slimTableFactory31);
        org.junit.Assert.assertNotNull(slimTableFactory32);
        org.junit.Assert.assertNotNull(slimTableFactory33);
        org.junit.Assert.assertNotNull(strMap34);
        org.junit.Assert.assertNotNull(strMap35);
        org.junit.Assert.assertNotNull(wildcardClass36);
    }

    @Test
    public void test18019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18019");
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory0 = new fitnesse.testsystems.slim.tables.SlimTableFactory();
        java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable> wildcardClass2 = slimTableFactory0.getTableType("");
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory3 = new fitnesse.testsystems.slim.tables.SlimTableFactory();
        java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable> wildcardClass5 = slimTableFactory3.getTableType("");
        java.lang.String str7 = slimTableFactory3.getFullTableName("");
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory8 = slimTableFactory3.copy();
        boolean boolean10 = slimTableFactory3.hasColon("");
        java.util.Map<java.lang.String, java.lang.String> strMap11 = slimTableFactory3.tableTypeArrays;
        java.util.Map<java.lang.String, java.lang.String> strMap12 = slimTableFactory3.tableTypeArrays;
        slimTableFactory0.tableTypeArrays = strMap12;
        boolean boolean15 = slimTableFactory0.hasColon("hi!");
        java.util.Map<java.lang.String, java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable>> strMap16 = slimTableFactory0.tableTypes;
        boolean boolean18 = slimTableFactory0.hasColon("");
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory19 = slimTableFactory0.copy();
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory20 = new fitnesse.testsystems.slim.tables.SlimTableFactory();
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory21 = new fitnesse.testsystems.slim.tables.SlimTableFactory();
        java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable> wildcardClass23 = slimTableFactory21.getTableType("");
        java.lang.String str25 = slimTableFactory21.getFullTableName("");
        java.util.Map<java.lang.String, java.lang.String> strMap26 = slimTableFactory21.tableTypeArrays;
        slimTableFactory20.tableTypeArrays = strMap26;
        java.util.Map<java.lang.String, java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable>> strMap28 = slimTableFactory20.tableTypes;
        java.util.Map<java.lang.String, java.lang.String> strMap29 = slimTableFactory20.tableTypeArrays;
        slimTableFactory0.tableTypeArrays = strMap29;
        java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable> wildcardClass32 = slimTableFactory0.getTableType("hi!");
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory33 = slimTableFactory0.copy();
        boolean boolean35 = slimTableFactory0.hasColon("");
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory36 = slimTableFactory0.copy();
        fitnesse.testsystems.slim.Table table37 = null;
        // The following exception was thrown during execution in test generation
        try {
            fitnesse.testsystems.slim.tables.SlimTable slimTable38 = slimTableFactory0.parseDefineTableTypeTable(table37);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(wildcardClass2);
        org.junit.Assert.assertNull(wildcardClass5);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNotNull(slimTableFactory8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(strMap11);
        org.junit.Assert.assertNotNull(strMap12);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(strMap16);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(slimTableFactory19);
        org.junit.Assert.assertNull(wildcardClass23);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "" + "'", str25, "");
        org.junit.Assert.assertNotNull(strMap26);
        org.junit.Assert.assertNotNull(strMap28);
        org.junit.Assert.assertNotNull(strMap29);
        org.junit.Assert.assertNull(wildcardClass32);
        org.junit.Assert.assertNotNull(slimTableFactory33);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertNotNull(slimTableFactory36);
    }

    @Test
    public void test18020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18020");
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory0 = new fitnesse.testsystems.slim.tables.SlimTableFactory();
        java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable> wildcardClass2 = slimTableFactory0.getTableType("");
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory3 = slimTableFactory0.copy();
        java.util.Map<java.lang.String, java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable>> strMap4 = slimTableFactory0.tableTypes;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory5 = slimTableFactory0.copy();
        java.util.Map<java.lang.String, java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable>> strMap6 = slimTableFactory5.tableTypes;
        java.util.Map<java.lang.String, java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable>> strMap7 = slimTableFactory5.tableTypes;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory8 = new fitnesse.testsystems.slim.tables.SlimTableFactory();
        java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable> wildcardClass10 = slimTableFactory8.getTableType("");
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory11 = new fitnesse.testsystems.slim.tables.SlimTableFactory();
        java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable> wildcardClass13 = slimTableFactory11.getTableType("");
        java.lang.String str15 = slimTableFactory11.getFullTableName("");
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory16 = slimTableFactory11.copy();
        boolean boolean18 = slimTableFactory11.hasColon("");
        java.util.Map<java.lang.String, java.lang.String> strMap19 = slimTableFactory11.tableTypeArrays;
        java.util.Map<java.lang.String, java.lang.String> strMap20 = slimTableFactory11.tableTypeArrays;
        slimTableFactory8.tableTypeArrays = strMap20;
        boolean boolean23 = slimTableFactory8.hasColon("hi!");
        java.util.Map<java.lang.String, java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable>> strMap24 = slimTableFactory8.tableTypes;
        boolean boolean26 = slimTableFactory8.hasColon("");
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory27 = slimTableFactory8.copy();
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory28 = new fitnesse.testsystems.slim.tables.SlimTableFactory();
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory29 = new fitnesse.testsystems.slim.tables.SlimTableFactory();
        java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable> wildcardClass31 = slimTableFactory29.getTableType("");
        java.lang.String str33 = slimTableFactory29.getFullTableName("");
        java.util.Map<java.lang.String, java.lang.String> strMap34 = slimTableFactory29.tableTypeArrays;
        slimTableFactory28.tableTypeArrays = strMap34;
        java.util.Map<java.lang.String, java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable>> strMap36 = slimTableFactory28.tableTypes;
        java.util.Map<java.lang.String, java.lang.String> strMap37 = slimTableFactory28.tableTypeArrays;
        slimTableFactory8.tableTypeArrays = strMap37;
        java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable> wildcardClass40 = slimTableFactory8.getTableType("hi!");
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory41 = new fitnesse.testsystems.slim.tables.SlimTableFactory();
        java.lang.String str43 = slimTableFactory41.getFullTableName("hi!");
        java.util.Map<java.lang.String, java.lang.String> strMap44 = slimTableFactory41.tableTypeArrays;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory45 = slimTableFactory41.copy();
        java.util.Map<java.lang.String, java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable>> strMap46 = slimTableFactory45.tableTypes;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory47 = slimTableFactory45.copy();
        java.lang.String str49 = slimTableFactory47.getFullTableName("hi!");
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory50 = slimTableFactory47.copy();
        java.util.Map<java.lang.String, java.lang.String> strMap51 = null;
        slimTableFactory50.tableTypeArrays = strMap51;
        boolean boolean54 = slimTableFactory50.hasColon("hi!");
        java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable> wildcardClass56 = slimTableFactory50.getTableType("hi!");
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory57 = new fitnesse.testsystems.slim.tables.SlimTableFactory();
        java.lang.String str59 = slimTableFactory57.getFullTableName("hi!");
        java.util.Map<java.lang.String, java.lang.String> strMap60 = slimTableFactory57.tableTypeArrays;
        java.lang.String str62 = slimTableFactory57.makeTableType("");
        java.util.Map<java.lang.String, java.lang.String> strMap63 = slimTableFactory57.tableTypeArrays;
        java.lang.String str65 = slimTableFactory57.getFullTableName("");
        java.util.Map<java.lang.String, java.lang.String> strMap66 = slimTableFactory57.tableTypeArrays;
        slimTableFactory50.tableTypeArrays = strMap66;
        slimTableFactory8.tableTypeArrays = strMap66;
        slimTableFactory5.tableTypeArrays = strMap66;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory70 = slimTableFactory5.copy();
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory71 = slimTableFactory5.copy();
        java.lang.String str73 = slimTableFactory5.getFullTableName("");
        java.util.Map<java.lang.String, java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable>> strMap74 = slimTableFactory5.tableTypes;
        org.junit.Assert.assertNull(wildcardClass2);
        org.junit.Assert.assertNotNull(slimTableFactory3);
        org.junit.Assert.assertNotNull(strMap4);
        org.junit.Assert.assertNotNull(slimTableFactory5);
        org.junit.Assert.assertNotNull(strMap6);
        org.junit.Assert.assertNotNull(strMap7);
        org.junit.Assert.assertNull(wildcardClass10);
        org.junit.Assert.assertNull(wildcardClass13);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertNotNull(slimTableFactory16);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(strMap19);
        org.junit.Assert.assertNotNull(strMap20);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNotNull(strMap24);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNotNull(slimTableFactory27);
        org.junit.Assert.assertNull(wildcardClass31);
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "" + "'", str33, "");
        org.junit.Assert.assertNotNull(strMap34);
        org.junit.Assert.assertNotNull(strMap36);
        org.junit.Assert.assertNotNull(strMap37);
        org.junit.Assert.assertNull(wildcardClass40);
        org.junit.Assert.assertEquals("'" + str43 + "' != '" + "hi!" + "'", str43, "hi!");
        org.junit.Assert.assertNotNull(strMap44);
        org.junit.Assert.assertNotNull(slimTableFactory45);
        org.junit.Assert.assertNotNull(strMap46);
        org.junit.Assert.assertNotNull(slimTableFactory47);
        org.junit.Assert.assertEquals("'" + str49 + "' != '" + "hi!" + "'", str49, "hi!");
        org.junit.Assert.assertNotNull(slimTableFactory50);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + false + "'", boolean54 == false);
        org.junit.Assert.assertNull(wildcardClass56);
        org.junit.Assert.assertEquals("'" + str59 + "' != '" + "hi!" + "'", str59, "hi!");
        org.junit.Assert.assertNotNull(strMap60);
        org.junit.Assert.assertEquals("'" + str62 + "' != '" + "" + "'", str62, "");
        org.junit.Assert.assertNotNull(strMap63);
        org.junit.Assert.assertEquals("'" + str65 + "' != '" + "" + "'", str65, "");
        org.junit.Assert.assertNotNull(strMap66);
        org.junit.Assert.assertNotNull(slimTableFactory70);
        org.junit.Assert.assertNotNull(slimTableFactory71);
        org.junit.Assert.assertEquals("'" + str73 + "' != '" + "" + "'", str73, "");
        org.junit.Assert.assertNotNull(strMap74);
    }

    @Test
    public void test18021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18021");
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory0 = new fitnesse.testsystems.slim.tables.SlimTableFactory();
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory1 = new fitnesse.testsystems.slim.tables.SlimTableFactory();
        java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable> wildcardClass3 = slimTableFactory1.getTableType("");
        java.lang.String str5 = slimTableFactory1.getFullTableName("");
        java.util.Map<java.lang.String, java.lang.String> strMap6 = slimTableFactory1.tableTypeArrays;
        slimTableFactory0.tableTypeArrays = strMap6;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory8 = slimTableFactory0.copy();
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory9 = slimTableFactory8.copy();
        boolean boolean11 = slimTableFactory9.hasColon("");
        java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable> wildcardClass13 = slimTableFactory9.getTableType("hi!");
        java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable> wildcardClass15 = slimTableFactory9.getTableType("hi!");
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory16 = slimTableFactory9.copy();
        boolean boolean18 = slimTableFactory16.hasColon("");
        java.util.Map<java.lang.String, java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable>> strMap19 = slimTableFactory16.tableTypes;
        java.lang.String str21 = slimTableFactory16.makeTableType("");
        org.junit.Assert.assertNull(wildcardClass3);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(strMap6);
        org.junit.Assert.assertNotNull(slimTableFactory8);
        org.junit.Assert.assertNotNull(slimTableFactory9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNull(wildcardClass13);
        org.junit.Assert.assertNull(wildcardClass15);
        org.junit.Assert.assertNotNull(slimTableFactory16);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(strMap19);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
    }

    @Test
    public void test18022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18022");
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory0 = new fitnesse.testsystems.slim.tables.SlimTableFactory();
        java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable> wildcardClass2 = slimTableFactory0.getTableType("");
        java.lang.String str4 = slimTableFactory0.getFullTableName("");
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory5 = slimTableFactory0.copy();
        boolean boolean7 = slimTableFactory0.hasColon("");
        java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable> wildcardClass9 = slimTableFactory0.getTableType("");
        java.lang.String str11 = slimTableFactory0.makeTableType("");
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory12 = slimTableFactory0.copy();
        java.lang.String str14 = slimTableFactory12.getFullTableName("");
        java.lang.String str16 = slimTableFactory12.getFullTableName("");
        boolean boolean18 = slimTableFactory12.hasColon("");
        java.util.Map<java.lang.String, java.lang.String> strMap19 = slimTableFactory12.tableTypeArrays;
        boolean boolean21 = slimTableFactory12.hasColon("");
        org.junit.Assert.assertNull(wildcardClass2);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(slimTableFactory5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(wildcardClass9);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNotNull(slimTableFactory12);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(strMap19);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
    }

    @Test
    public void test18023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18023");
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory0 = new fitnesse.testsystems.slim.tables.SlimTableFactory();
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory1 = new fitnesse.testsystems.slim.tables.SlimTableFactory();
        java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable> wildcardClass3 = slimTableFactory1.getTableType("");
        java.lang.String str5 = slimTableFactory1.getFullTableName("");
        java.util.Map<java.lang.String, java.lang.String> strMap6 = slimTableFactory1.tableTypeArrays;
        slimTableFactory0.tableTypeArrays = strMap6;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory8 = slimTableFactory0.copy();
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory9 = slimTableFactory8.copy();
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory10 = slimTableFactory8.copy();
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory11 = new fitnesse.testsystems.slim.tables.SlimTableFactory();
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory12 = slimTableFactory11.copy();
        java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable> wildcardClass14 = slimTableFactory12.getTableType("hi!");
        java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable> wildcardClass16 = slimTableFactory12.getTableType("hi!");
        boolean boolean18 = slimTableFactory12.hasColon("");
        java.util.Map<java.lang.String, java.lang.String> strMap19 = slimTableFactory12.tableTypeArrays;
        slimTableFactory10.tableTypeArrays = strMap19;
        boolean boolean22 = slimTableFactory10.hasColon("hi!");
        java.util.Map<java.lang.String, java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable>> strMap23 = slimTableFactory10.tableTypes;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory24 = slimTableFactory10.copy();
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory25 = slimTableFactory24.copy();
        java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable> wildcardClass27 = slimTableFactory24.getTableType("");
        org.junit.Assert.assertNull(wildcardClass3);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(strMap6);
        org.junit.Assert.assertNotNull(slimTableFactory8);
        org.junit.Assert.assertNotNull(slimTableFactory9);
        org.junit.Assert.assertNotNull(slimTableFactory10);
        org.junit.Assert.assertNotNull(slimTableFactory12);
        org.junit.Assert.assertNull(wildcardClass14);
        org.junit.Assert.assertNull(wildcardClass16);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(strMap19);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(strMap23);
        org.junit.Assert.assertNotNull(slimTableFactory24);
        org.junit.Assert.assertNotNull(slimTableFactory25);
        org.junit.Assert.assertNull(wildcardClass27);
    }

    @Test
    public void test18024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18024");
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory0 = new fitnesse.testsystems.slim.tables.SlimTableFactory();
        java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable> wildcardClass2 = slimTableFactory0.getTableType("");
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory3 = new fitnesse.testsystems.slim.tables.SlimTableFactory();
        java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable> wildcardClass5 = slimTableFactory3.getTableType("");
        java.lang.String str7 = slimTableFactory3.getFullTableName("");
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory8 = slimTableFactory3.copy();
        boolean boolean10 = slimTableFactory3.hasColon("");
        java.util.Map<java.lang.String, java.lang.String> strMap11 = slimTableFactory3.tableTypeArrays;
        java.util.Map<java.lang.String, java.lang.String> strMap12 = slimTableFactory3.tableTypeArrays;
        slimTableFactory0.tableTypeArrays = strMap12;
        boolean boolean15 = slimTableFactory0.hasColon("hi!");
        java.util.Map<java.lang.String, java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable>> strMap16 = slimTableFactory0.tableTypes;
        java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable> wildcardClass18 = slimTableFactory0.getTableType("hi!");
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory19 = new fitnesse.testsystems.slim.tables.SlimTableFactory();
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory20 = slimTableFactory19.copy();
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory21 = slimTableFactory19.copy();
        java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable> wildcardClass23 = slimTableFactory19.getTableType("hi!");
        java.util.Map<java.lang.String, java.lang.String> strMap24 = slimTableFactory19.tableTypeArrays;
        slimTableFactory0.tableTypeArrays = strMap24;
        java.util.Map<java.lang.String, java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable>> strMap26 = slimTableFactory0.tableTypes;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory27 = slimTableFactory0.copy();
        org.junit.Assert.assertNull(wildcardClass2);
        org.junit.Assert.assertNull(wildcardClass5);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNotNull(slimTableFactory8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(strMap11);
        org.junit.Assert.assertNotNull(strMap12);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(strMap16);
        org.junit.Assert.assertNull(wildcardClass18);
        org.junit.Assert.assertNotNull(slimTableFactory20);
        org.junit.Assert.assertNotNull(slimTableFactory21);
        org.junit.Assert.assertNull(wildcardClass23);
        org.junit.Assert.assertNotNull(strMap24);
        org.junit.Assert.assertNotNull(strMap26);
        org.junit.Assert.assertNotNull(slimTableFactory27);
    }

    @Test
    public void test18025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18025");
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory0 = new fitnesse.testsystems.slim.tables.SlimTableFactory();
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory1 = new fitnesse.testsystems.slim.tables.SlimTableFactory();
        java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable> wildcardClass3 = slimTableFactory1.getTableType("");
        java.lang.String str5 = slimTableFactory1.getFullTableName("");
        java.util.Map<java.lang.String, java.lang.String> strMap6 = slimTableFactory1.tableTypeArrays;
        slimTableFactory0.tableTypeArrays = strMap6;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory8 = slimTableFactory0.copy();
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory9 = slimTableFactory8.copy();
        java.util.Map<java.lang.String, java.lang.String> strMap10 = slimTableFactory9.tableTypeArrays;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory11 = new fitnesse.testsystems.slim.tables.SlimTableFactory();
        java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable> wildcardClass13 = slimTableFactory11.getTableType("");
        java.lang.String str15 = slimTableFactory11.getFullTableName("");
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory16 = slimTableFactory11.copy();
        boolean boolean18 = slimTableFactory11.hasColon("");
        java.util.Map<java.lang.String, java.lang.String> strMap19 = slimTableFactory11.tableTypeArrays;
        slimTableFactory9.tableTypeArrays = strMap19;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory21 = slimTableFactory9.copy();
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory22 = slimTableFactory9.copy();
        java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable> wildcardClass24 = slimTableFactory9.getTableType("");
        java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable> wildcardClass26 = slimTableFactory9.getTableType("hi!");
        java.util.Map<java.lang.String, java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable>> strMap27 = slimTableFactory9.tableTypes;
        java.util.Map<java.lang.String, java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable>> strMap28 = slimTableFactory9.tableTypes;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory29 = slimTableFactory9.copy();
        fitnesse.testsystems.slim.Table table30 = null;
        fitnesse.testsystems.slim.SlimTestContext slimTestContext32 = null;
        // The following exception was thrown during execution in test generation
        try {
            fitnesse.testsystems.slim.tables.SlimTable slimTable33 = slimTableFactory29.makeSlimTable(table30, "", slimTestContext32);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(wildcardClass3);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(strMap6);
        org.junit.Assert.assertNotNull(slimTableFactory8);
        org.junit.Assert.assertNotNull(slimTableFactory9);
        org.junit.Assert.assertNotNull(strMap10);
        org.junit.Assert.assertNull(wildcardClass13);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertNotNull(slimTableFactory16);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(strMap19);
        org.junit.Assert.assertNotNull(slimTableFactory21);
        org.junit.Assert.assertNotNull(slimTableFactory22);
        org.junit.Assert.assertNull(wildcardClass24);
        org.junit.Assert.assertNull(wildcardClass26);
        org.junit.Assert.assertNotNull(strMap27);
        org.junit.Assert.assertNotNull(strMap28);
        org.junit.Assert.assertNotNull(slimTableFactory29);
    }

    @Test
    public void test18026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18026");
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory0 = new fitnesse.testsystems.slim.tables.SlimTableFactory();
        java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable> wildcardClass2 = slimTableFactory0.getTableType("");
        java.lang.String str4 = slimTableFactory0.getFullTableName("");
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory5 = slimTableFactory0.copy();
        boolean boolean7 = slimTableFactory0.hasColon("");
        java.util.Map<java.lang.String, java.lang.String> strMap8 = slimTableFactory0.tableTypeArrays;
        java.lang.String str10 = slimTableFactory0.getFullTableName("hi!");
        java.lang.String str12 = slimTableFactory0.getFullTableName("hi!");
        java.lang.String str14 = slimTableFactory0.getFullTableName("hi!");
        java.lang.String str16 = slimTableFactory0.getFullTableName("");
        java.util.Map<java.lang.String, java.lang.String> strMap17 = slimTableFactory0.tableTypeArrays;
        boolean boolean19 = slimTableFactory0.hasColon("");
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory20 = slimTableFactory0.copy();
        java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable> wildcardClass22 = slimTableFactory0.getTableType("hi!");
        org.junit.Assert.assertNull(wildcardClass2);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(slimTableFactory5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(strMap8);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertNotNull(strMap17);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(slimTableFactory20);
        org.junit.Assert.assertNull(wildcardClass22);
    }

    @Test
    public void test18027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18027");
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory0 = new fitnesse.testsystems.slim.tables.SlimTableFactory();
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory1 = new fitnesse.testsystems.slim.tables.SlimTableFactory();
        java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable> wildcardClass3 = slimTableFactory1.getTableType("");
        java.lang.String str5 = slimTableFactory1.getFullTableName("");
        java.util.Map<java.lang.String, java.lang.String> strMap6 = slimTableFactory1.tableTypeArrays;
        slimTableFactory0.tableTypeArrays = strMap6;
        java.util.Map<java.lang.String, java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable>> strMap8 = slimTableFactory0.tableTypes;
        boolean boolean10 = slimTableFactory0.hasColon("hi!");
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory11 = slimTableFactory0.copy();
        java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable> wildcardClass13 = slimTableFactory0.getTableType("");
        java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable> wildcardClass15 = slimTableFactory0.getTableType("hi!");
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory16 = slimTableFactory0.copy();
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory17 = slimTableFactory16.copy();
        java.util.Map<java.lang.String, java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable>> strMap18 = slimTableFactory17.tableTypes;
        org.junit.Assert.assertNull(wildcardClass3);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(strMap6);
        org.junit.Assert.assertNotNull(strMap8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(slimTableFactory11);
        org.junit.Assert.assertNull(wildcardClass13);
        org.junit.Assert.assertNull(wildcardClass15);
        org.junit.Assert.assertNotNull(slimTableFactory16);
        org.junit.Assert.assertNotNull(slimTableFactory17);
        org.junit.Assert.assertNotNull(strMap18);
    }

    @Test
    public void test18028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18028");
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory0 = new fitnesse.testsystems.slim.tables.SlimTableFactory();
        java.lang.String str2 = slimTableFactory0.getFullTableName("hi!");
        java.lang.String str4 = slimTableFactory0.makeTableType("");
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory5 = slimTableFactory0.copy();
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory6 = slimTableFactory5.copy();
        java.util.Map<java.lang.String, java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable>> strMap7 = slimTableFactory6.tableTypes;
        java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable> wildcardClass9 = slimTableFactory6.getTableType("");
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory10 = slimTableFactory6.copy();
        java.util.Map<java.lang.String, java.lang.String> strMap11 = slimTableFactory6.tableTypeArrays;
        java.util.Map<java.lang.String, java.lang.String> strMap12 = slimTableFactory6.tableTypeArrays;
        java.lang.String str14 = slimTableFactory6.getFullTableName("hi!");
        java.lang.String str16 = slimTableFactory6.getFullTableName("");
        java.lang.Class<?> wildcardClass17 = slimTableFactory6.getClass();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!" + "'", str2, "hi!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(slimTableFactory5);
        org.junit.Assert.assertNotNull(slimTableFactory6);
        org.junit.Assert.assertNotNull(strMap7);
        org.junit.Assert.assertNull(wildcardClass9);
        org.junit.Assert.assertNotNull(slimTableFactory10);
        org.junit.Assert.assertNotNull(strMap11);
        org.junit.Assert.assertNotNull(strMap12);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test18029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18029");
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory0 = new fitnesse.testsystems.slim.tables.SlimTableFactory();
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory1 = new fitnesse.testsystems.slim.tables.SlimTableFactory();
        java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable> wildcardClass3 = slimTableFactory1.getTableType("");
        java.lang.String str5 = slimTableFactory1.getFullTableName("");
        java.util.Map<java.lang.String, java.lang.String> strMap6 = slimTableFactory1.tableTypeArrays;
        slimTableFactory0.tableTypeArrays = strMap6;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory8 = slimTableFactory0.copy();
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory9 = slimTableFactory8.copy();
        java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable> wildcardClass11 = slimTableFactory9.getTableType("hi!");
        java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable> wildcardClass13 = slimTableFactory9.getTableType("");
        java.lang.String str15 = slimTableFactory9.getFullTableName("hi!");
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory16 = slimTableFactory9.copy();
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory17 = slimTableFactory16.copy();
        java.lang.String str19 = slimTableFactory17.getFullTableName("");
        org.junit.Assert.assertNull(wildcardClass3);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(strMap6);
        org.junit.Assert.assertNotNull(slimTableFactory8);
        org.junit.Assert.assertNotNull(slimTableFactory9);
        org.junit.Assert.assertNull(wildcardClass11);
        org.junit.Assert.assertNull(wildcardClass13);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertNotNull(slimTableFactory16);
        org.junit.Assert.assertNotNull(slimTableFactory17);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
    }

    @Test
    public void test18030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18030");
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory0 = new fitnesse.testsystems.slim.tables.SlimTableFactory();
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory1 = slimTableFactory0.copy();
        java.lang.String str3 = slimTableFactory0.makeTableType("hi!");
        java.lang.String str5 = slimTableFactory0.makeTableType("");
        java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable> wildcardClass7 = slimTableFactory0.getTableType("");
        java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable> wildcardClass9 = slimTableFactory0.getTableType("hi!");
        java.util.Map<java.lang.String, java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable>> strMap10 = slimTableFactory0.tableTypes;
        boolean boolean12 = slimTableFactory0.hasColon("");
        java.lang.String str14 = slimTableFactory0.getFullTableName("hi!");
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory15 = slimTableFactory0.copy();
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory16 = slimTableFactory0.copy();
        java.lang.String str18 = slimTableFactory0.getFullTableName("");
        fitnesse.testsystems.slim.Table table19 = null;
        fitnesse.testsystems.slim.SlimTestContext slimTestContext21 = null;
        // The following exception was thrown during execution in test generation
        try {
            fitnesse.testsystems.slim.tables.SlimTable slimTable22 = slimTableFactory0.makeSlimTable(table19, "", slimTestContext21);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(slimTableFactory1);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNull(wildcardClass7);
        org.junit.Assert.assertNull(wildcardClass9);
        org.junit.Assert.assertNotNull(strMap10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertNotNull(slimTableFactory15);
        org.junit.Assert.assertNotNull(slimTableFactory16);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
    }

    @Test
    public void test18031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18031");
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory0 = new fitnesse.testsystems.slim.tables.SlimTableFactory();
        java.lang.String str2 = slimTableFactory0.getFullTableName("hi!");
        java.util.Map<java.lang.String, java.lang.String> strMap3 = slimTableFactory0.tableTypeArrays;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory4 = slimTableFactory0.copy();
        java.util.Map<java.lang.String, java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable>> strMap5 = slimTableFactory4.tableTypes;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory6 = slimTableFactory4.copy();
        boolean boolean8 = slimTableFactory4.hasColon("");
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory9 = slimTableFactory4.copy();
        java.util.Map<java.lang.String, java.lang.String> strMap10 = slimTableFactory4.tableTypeArrays;
        java.lang.Class<?> wildcardClass11 = strMap10.getClass();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!" + "'", str2, "hi!");
        org.junit.Assert.assertNotNull(strMap3);
        org.junit.Assert.assertNotNull(slimTableFactory4);
        org.junit.Assert.assertNotNull(strMap5);
        org.junit.Assert.assertNotNull(slimTableFactory6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(slimTableFactory9);
        org.junit.Assert.assertNotNull(strMap10);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test18032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18032");
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory0 = new fitnesse.testsystems.slim.tables.SlimTableFactory();
        java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable> wildcardClass2 = slimTableFactory0.getTableType("");
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory3 = slimTableFactory0.copy();
        java.lang.String str5 = slimTableFactory0.makeTableType("");
        java.util.Map<java.lang.String, java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable>> strMap6 = slimTableFactory0.tableTypes;
        fitnesse.testsystems.slim.Table table7 = null;
        fitnesse.testsystems.slim.SlimTestContext slimTestContext9 = null;
        // The following exception was thrown during execution in test generation
        try {
            fitnesse.testsystems.slim.tables.SlimTable slimTable10 = slimTableFactory0.makeSlimTable(table7, "", slimTestContext9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(wildcardClass2);
        org.junit.Assert.assertNotNull(slimTableFactory3);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(strMap6);
    }

    @Test
    public void test18033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18033");
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory0 = new fitnesse.testsystems.slim.tables.SlimTableFactory();
        java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable> wildcardClass2 = slimTableFactory0.getTableType("");
        java.lang.String str4 = slimTableFactory0.getFullTableName("");
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory5 = slimTableFactory0.copy();
        java.lang.String str7 = slimTableFactory0.makeTableType("hi!");
        java.util.Map<java.lang.String, java.lang.String> strMap8 = slimTableFactory0.tableTypeArrays;
        java.util.Map<java.lang.String, java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable>> strMap9 = slimTableFactory0.tableTypes;
        java.lang.String str11 = slimTableFactory0.getFullTableName("hi!");
        java.lang.String str13 = slimTableFactory0.makeTableType("");
        java.util.Map<java.lang.String, java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable>> strMap14 = slimTableFactory0.tableTypes;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory15 = slimTableFactory0.copy();
        java.lang.String str17 = slimTableFactory0.makeTableType("");
        org.junit.Assert.assertNull(wildcardClass2);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(slimTableFactory5);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertNotNull(strMap8);
        org.junit.Assert.assertNotNull(strMap9);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNotNull(strMap14);
        org.junit.Assert.assertNotNull(slimTableFactory15);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
    }

    @Test
    public void test18034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18034");
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory0 = new fitnesse.testsystems.slim.tables.SlimTableFactory();
        java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable> wildcardClass2 = slimTableFactory0.getTableType("");
        java.lang.String str4 = slimTableFactory0.getFullTableName("");
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory5 = slimTableFactory0.copy();
        java.util.Map<java.lang.String, java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable>> strMap6 = slimTableFactory5.tableTypes;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory7 = slimTableFactory5.copy();
        java.lang.String str9 = slimTableFactory7.getFullTableName("");
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory10 = slimTableFactory7.copy();
        java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable> wildcardClass12 = slimTableFactory10.getTableType("");
        java.lang.String str14 = slimTableFactory10.getFullTableName("hi!");
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory15 = slimTableFactory10.copy();
        fitnesse.testsystems.slim.Table table16 = null;
        // The following exception was thrown during execution in test generation
        try {
            fitnesse.testsystems.slim.tables.SlimTable slimTable17 = slimTableFactory10.parseDefineTableTypeTable(table16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(wildcardClass2);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(slimTableFactory5);
        org.junit.Assert.assertNotNull(strMap6);
        org.junit.Assert.assertNotNull(slimTableFactory7);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNotNull(slimTableFactory10);
        org.junit.Assert.assertNull(wildcardClass12);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertNotNull(slimTableFactory15);
    }

    @Test
    public void test18035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18035");
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory0 = new fitnesse.testsystems.slim.tables.SlimTableFactory();
        java.lang.String str2 = slimTableFactory0.getFullTableName("hi!");
        java.util.Map<java.lang.String, java.lang.String> strMap3 = slimTableFactory0.tableTypeArrays;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory4 = slimTableFactory0.copy();
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory5 = slimTableFactory0.copy();
        boolean boolean7 = slimTableFactory0.hasColon("");
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory8 = slimTableFactory0.copy();
        java.util.Map<java.lang.String, java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable>> strMap9 = slimTableFactory8.tableTypes;
        boolean boolean11 = slimTableFactory8.hasColon("");
        boolean boolean13 = slimTableFactory8.hasColon("hi!");
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory14 = slimTableFactory8.copy();
        java.lang.String str16 = slimTableFactory14.makeTableType("hi!");
        java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable> wildcardClass18 = slimTableFactory14.getTableType("");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!" + "'", str2, "hi!");
        org.junit.Assert.assertNotNull(strMap3);
        org.junit.Assert.assertNotNull(slimTableFactory4);
        org.junit.Assert.assertNotNull(slimTableFactory5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(slimTableFactory8);
        org.junit.Assert.assertNotNull(strMap9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(slimTableFactory14);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertNull(wildcardClass18);
    }

    @Test
    public void test18036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18036");
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory0 = new fitnesse.testsystems.slim.tables.SlimTableFactory();
        java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable> wildcardClass2 = slimTableFactory0.getTableType("");
        boolean boolean4 = slimTableFactory0.hasColon("hi!");
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory5 = slimTableFactory0.copy();
        java.util.Map<java.lang.String, java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable>> strMap6 = slimTableFactory5.tableTypes;
        java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable> wildcardClass8 = slimTableFactory5.getTableType("");
        java.lang.String str10 = slimTableFactory5.getFullTableName("");
        java.lang.String str12 = slimTableFactory5.getFullTableName("hi!");
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory13 = slimTableFactory5.copy();
        java.util.Map<java.lang.String, java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable>> strMap14 = slimTableFactory5.tableTypes;
        java.lang.String str16 = slimTableFactory5.makeTableType("hi!");
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory17 = new fitnesse.testsystems.slim.tables.SlimTableFactory();
        java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable> wildcardClass19 = slimTableFactory17.getTableType("");
        java.lang.String str21 = slimTableFactory17.getFullTableName("");
        java.util.Map<java.lang.String, java.lang.String> strMap22 = slimTableFactory17.tableTypeArrays;
        java.util.Map<java.lang.String, java.lang.String> strMap23 = slimTableFactory17.tableTypeArrays;
        java.lang.String str25 = slimTableFactory17.getFullTableName("hi!");
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory26 = new fitnesse.testsystems.slim.tables.SlimTableFactory();
        java.lang.String str28 = slimTableFactory26.getFullTableName("hi!");
        java.lang.String str30 = slimTableFactory26.makeTableType("");
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory31 = slimTableFactory26.copy();
        java.lang.String str33 = slimTableFactory26.makeTableType("");
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory34 = new fitnesse.testsystems.slim.tables.SlimTableFactory();
        java.lang.String str36 = slimTableFactory34.getFullTableName("hi!");
        java.util.Map<java.lang.String, java.lang.String> strMap37 = slimTableFactory34.tableTypeArrays;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory38 = slimTableFactory34.copy();
        boolean boolean40 = slimTableFactory34.hasColon("hi!");
        java.util.Map<java.lang.String, java.lang.String> strMap41 = slimTableFactory34.tableTypeArrays;
        slimTableFactory26.tableTypeArrays = strMap41;
        slimTableFactory17.tableTypeArrays = strMap41;
        java.util.Map<java.lang.String, java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable>> strMap44 = slimTableFactory17.tableTypes;
        java.util.Map<java.lang.String, java.lang.String> strMap45 = slimTableFactory17.tableTypeArrays;
        slimTableFactory5.tableTypeArrays = strMap45;
        org.junit.Assert.assertNull(wildcardClass2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(slimTableFactory5);
        org.junit.Assert.assertNotNull(strMap6);
        org.junit.Assert.assertNull(wildcardClass8);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertNotNull(slimTableFactory13);
        org.junit.Assert.assertNotNull(strMap14);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertNull(wildcardClass19);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertNotNull(strMap22);
        org.junit.Assert.assertNotNull(strMap23);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "hi!" + "'", str25, "hi!");
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "hi!" + "'", str28, "hi!");
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "" + "'", str30, "");
        org.junit.Assert.assertNotNull(slimTableFactory31);
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "" + "'", str33, "");
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "hi!" + "'", str36, "hi!");
        org.junit.Assert.assertNotNull(strMap37);
        org.junit.Assert.assertNotNull(slimTableFactory38);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertNotNull(strMap41);
        org.junit.Assert.assertNotNull(strMap44);
        org.junit.Assert.assertNotNull(strMap45);
    }

    @Test
    public void test18037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18037");
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory0 = new fitnesse.testsystems.slim.tables.SlimTableFactory();
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory1 = new fitnesse.testsystems.slim.tables.SlimTableFactory();
        java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable> wildcardClass3 = slimTableFactory1.getTableType("");
        java.lang.String str5 = slimTableFactory1.getFullTableName("");
        java.util.Map<java.lang.String, java.lang.String> strMap6 = slimTableFactory1.tableTypeArrays;
        slimTableFactory0.tableTypeArrays = strMap6;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory8 = slimTableFactory0.copy();
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory9 = slimTableFactory8.copy();
        boolean boolean11 = slimTableFactory9.hasColon("");
        java.lang.String str13 = slimTableFactory9.makeTableType("");
        java.util.Map<java.lang.String, java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable>> strMap14 = slimTableFactory9.tableTypes;
        java.lang.String str16 = slimTableFactory9.getFullTableName("");
        boolean boolean18 = slimTableFactory9.hasColon("hi!");
        org.junit.Assert.assertNull(wildcardClass3);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(strMap6);
        org.junit.Assert.assertNotNull(slimTableFactory8);
        org.junit.Assert.assertNotNull(slimTableFactory9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNotNull(strMap14);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test18038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18038");
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory0 = new fitnesse.testsystems.slim.tables.SlimTableFactory();
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory1 = new fitnesse.testsystems.slim.tables.SlimTableFactory();
        java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable> wildcardClass3 = slimTableFactory1.getTableType("");
        java.lang.String str5 = slimTableFactory1.getFullTableName("");
        java.util.Map<java.lang.String, java.lang.String> strMap6 = slimTableFactory1.tableTypeArrays;
        slimTableFactory0.tableTypeArrays = strMap6;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory8 = slimTableFactory0.copy();
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory9 = slimTableFactory8.copy();
        java.util.Map<java.lang.String, java.lang.String> strMap10 = slimTableFactory9.tableTypeArrays;
        java.lang.String str12 = slimTableFactory9.makeTableType("hi!");
        boolean boolean14 = slimTableFactory9.hasColon("hi!");
        java.lang.String str16 = slimTableFactory9.makeTableType("hi!");
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory17 = new fitnesse.testsystems.slim.tables.SlimTableFactory();
        java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable> wildcardClass19 = slimTableFactory17.getTableType("");
        java.lang.String str21 = slimTableFactory17.getFullTableName("");
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory22 = slimTableFactory17.copy();
        boolean boolean24 = slimTableFactory17.hasColon("");
        java.util.Map<java.lang.String, java.lang.String> strMap25 = slimTableFactory17.tableTypeArrays;
        java.util.Map<java.lang.String, java.lang.String> strMap26 = slimTableFactory17.tableTypeArrays;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory27 = new fitnesse.testsystems.slim.tables.SlimTableFactory();
        java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable> wildcardClass29 = slimTableFactory27.getTableType("");
        java.lang.String str31 = slimTableFactory27.getFullTableName("");
        java.util.Map<java.lang.String, java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable>> strMap32 = slimTableFactory27.tableTypes;
        java.util.Map<java.lang.String, java.lang.String> strMap33 = slimTableFactory27.tableTypeArrays;
        slimTableFactory17.tableTypeArrays = strMap33;
        slimTableFactory9.tableTypeArrays = strMap33;
        java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable> wildcardClass37 = slimTableFactory9.getTableType("");
        java.util.Map<java.lang.String, java.lang.String> strMap38 = slimTableFactory9.tableTypeArrays;
        java.util.Map<java.lang.String, java.lang.String> strMap39 = slimTableFactory9.tableTypeArrays;
        fitnesse.testsystems.slim.Table table40 = null;
        // The following exception was thrown during execution in test generation
        try {
            fitnesse.testsystems.slim.tables.SlimTable slimTable41 = slimTableFactory9.parseDefineTableTypeTable(table40);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(wildcardClass3);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(strMap6);
        org.junit.Assert.assertNotNull(slimTableFactory8);
        org.junit.Assert.assertNotNull(slimTableFactory9);
        org.junit.Assert.assertNotNull(strMap10);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertNull(wildcardClass19);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertNotNull(slimTableFactory22);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(strMap25);
        org.junit.Assert.assertNotNull(strMap26);
        org.junit.Assert.assertNull(wildcardClass29);
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "" + "'", str31, "");
        org.junit.Assert.assertNotNull(strMap32);
        org.junit.Assert.assertNotNull(strMap33);
        org.junit.Assert.assertNull(wildcardClass37);
        org.junit.Assert.assertNotNull(strMap38);
        org.junit.Assert.assertNotNull(strMap39);
    }

    @Test
    public void test18039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18039");
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory0 = new fitnesse.testsystems.slim.tables.SlimTableFactory();
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory1 = new fitnesse.testsystems.slim.tables.SlimTableFactory();
        java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable> wildcardClass3 = slimTableFactory1.getTableType("");
        java.lang.String str5 = slimTableFactory1.getFullTableName("");
        java.util.Map<java.lang.String, java.lang.String> strMap6 = slimTableFactory1.tableTypeArrays;
        slimTableFactory0.tableTypeArrays = strMap6;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory8 = slimTableFactory0.copy();
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory9 = slimTableFactory8.copy();
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory10 = slimTableFactory8.copy();
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory11 = new fitnesse.testsystems.slim.tables.SlimTableFactory();
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory12 = slimTableFactory11.copy();
        java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable> wildcardClass14 = slimTableFactory12.getTableType("hi!");
        java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable> wildcardClass16 = slimTableFactory12.getTableType("hi!");
        boolean boolean18 = slimTableFactory12.hasColon("");
        java.util.Map<java.lang.String, java.lang.String> strMap19 = slimTableFactory12.tableTypeArrays;
        slimTableFactory10.tableTypeArrays = strMap19;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory21 = new fitnesse.testsystems.slim.tables.SlimTableFactory();
        java.lang.String str23 = slimTableFactory21.getFullTableName("hi!");
        java.util.Map<java.lang.String, java.lang.String> strMap24 = slimTableFactory21.tableTypeArrays;
        java.lang.String str26 = slimTableFactory21.makeTableType("");
        java.util.Map<java.lang.String, java.lang.String> strMap27 = slimTableFactory21.tableTypeArrays;
        slimTableFactory10.tableTypeArrays = strMap27;
        java.lang.String str30 = slimTableFactory10.makeTableType("hi!");
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory31 = slimTableFactory10.copy();
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory32 = slimTableFactory31.copy();
        java.lang.String str34 = slimTableFactory31.makeTableType("hi!");
        boolean boolean36 = slimTableFactory31.hasColon("");
        java.util.Map<java.lang.String, java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable>> strMap37 = slimTableFactory31.tableTypes;
        fitnesse.testsystems.slim.Table table38 = null;
        fitnesse.testsystems.slim.SlimTestContext slimTestContext40 = null;
        // The following exception was thrown during execution in test generation
        try {
            fitnesse.testsystems.slim.tables.SlimTable slimTable41 = slimTableFactory31.makeSlimTable(table38, "", slimTestContext40);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(wildcardClass3);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(strMap6);
        org.junit.Assert.assertNotNull(slimTableFactory8);
        org.junit.Assert.assertNotNull(slimTableFactory9);
        org.junit.Assert.assertNotNull(slimTableFactory10);
        org.junit.Assert.assertNotNull(slimTableFactory12);
        org.junit.Assert.assertNull(wildcardClass14);
        org.junit.Assert.assertNull(wildcardClass16);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(strMap19);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "hi!" + "'", str23, "hi!");
        org.junit.Assert.assertNotNull(strMap24);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "" + "'", str26, "");
        org.junit.Assert.assertNotNull(strMap27);
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "hi!" + "'", str30, "hi!");
        org.junit.Assert.assertNotNull(slimTableFactory31);
        org.junit.Assert.assertNotNull(slimTableFactory32);
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "hi!" + "'", str34, "hi!");
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertNotNull(strMap37);
    }

    @Test
    public void test18040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18040");
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory0 = new fitnesse.testsystems.slim.tables.SlimTableFactory();
        java.lang.String str2 = slimTableFactory0.getFullTableName("hi!");
        java.util.Map<java.lang.String, java.lang.String> strMap3 = slimTableFactory0.tableTypeArrays;
        java.lang.String str5 = slimTableFactory0.makeTableType("");
        java.util.Map<java.lang.String, java.lang.String> strMap6 = slimTableFactory0.tableTypeArrays;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory7 = new fitnesse.testsystems.slim.tables.SlimTableFactory();
        java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable> wildcardClass9 = slimTableFactory7.getTableType("");
        boolean boolean11 = slimTableFactory7.hasColon("hi!");
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory12 = slimTableFactory7.copy();
        java.util.Map<java.lang.String, java.lang.String> strMap13 = slimTableFactory7.tableTypeArrays;
        slimTableFactory0.tableTypeArrays = strMap13;
        java.lang.String str16 = slimTableFactory0.makeTableType("");
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory17 = slimTableFactory0.copy();
        fitnesse.testsystems.slim.Table table18 = null;
        // The following exception was thrown during execution in test generation
        try {
            fitnesse.testsystems.slim.tables.SlimTable slimTable19 = slimTableFactory17.parseDefineTableTypeTable(table18);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!" + "'", str2, "hi!");
        org.junit.Assert.assertNotNull(strMap3);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(strMap6);
        org.junit.Assert.assertNull(wildcardClass9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(slimTableFactory12);
        org.junit.Assert.assertNotNull(strMap13);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertNotNull(slimTableFactory17);
    }

    @Test
    public void test18041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18041");
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory0 = new fitnesse.testsystems.slim.tables.SlimTableFactory();
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory1 = new fitnesse.testsystems.slim.tables.SlimTableFactory();
        java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable> wildcardClass3 = slimTableFactory1.getTableType("");
        java.lang.String str5 = slimTableFactory1.getFullTableName("");
        java.util.Map<java.lang.String, java.lang.String> strMap6 = slimTableFactory1.tableTypeArrays;
        slimTableFactory0.tableTypeArrays = strMap6;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory8 = slimTableFactory0.copy();
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory9 = slimTableFactory8.copy();
        java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable> wildcardClass11 = slimTableFactory9.getTableType("hi!");
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory12 = slimTableFactory9.copy();
        java.util.Map<java.lang.String, java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable>> strMap13 = slimTableFactory9.tableTypes;
        boolean boolean15 = slimTableFactory9.hasColon("hi!");
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory16 = slimTableFactory9.copy();
        java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable> wildcardClass18 = slimTableFactory9.getTableType("hi!");
        java.util.Map<java.lang.String, java.lang.String> strMap19 = slimTableFactory9.tableTypeArrays;
        java.util.Map<java.lang.String, java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable>> strMap20 = slimTableFactory9.tableTypes;
        boolean boolean22 = slimTableFactory9.hasColon("");
        java.lang.String str24 = slimTableFactory9.getFullTableName("");
        boolean boolean26 = slimTableFactory9.hasColon("hi!");
        fitnesse.testsystems.slim.Table table27 = null;
        fitnesse.testsystems.slim.SlimTestContext slimTestContext29 = null;
        // The following exception was thrown during execution in test generation
        try {
            fitnesse.testsystems.slim.tables.SlimTable slimTable30 = slimTableFactory9.makeSlimTable(table27, "hi!", slimTestContext29);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(wildcardClass3);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(strMap6);
        org.junit.Assert.assertNotNull(slimTableFactory8);
        org.junit.Assert.assertNotNull(slimTableFactory9);
        org.junit.Assert.assertNull(wildcardClass11);
        org.junit.Assert.assertNotNull(slimTableFactory12);
        org.junit.Assert.assertNotNull(strMap13);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(slimTableFactory16);
        org.junit.Assert.assertNull(wildcardClass18);
        org.junit.Assert.assertNotNull(strMap19);
        org.junit.Assert.assertNotNull(strMap20);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "" + "'", str24, "");
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
    }

    @Test
    public void test18042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18042");
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory0 = new fitnesse.testsystems.slim.tables.SlimTableFactory();
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory1 = new fitnesse.testsystems.slim.tables.SlimTableFactory();
        java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable> wildcardClass3 = slimTableFactory1.getTableType("");
        java.lang.String str5 = slimTableFactory1.getFullTableName("");
        java.util.Map<java.lang.String, java.lang.String> strMap6 = slimTableFactory1.tableTypeArrays;
        slimTableFactory0.tableTypeArrays = strMap6;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory8 = slimTableFactory0.copy();
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory9 = slimTableFactory8.copy();
        java.util.Map<java.lang.String, java.lang.String> strMap10 = slimTableFactory9.tableTypeArrays;
        java.lang.String str12 = slimTableFactory9.makeTableType("hi!");
        java.lang.String str14 = slimTableFactory9.getFullTableName("hi!");
        java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable> wildcardClass16 = slimTableFactory9.getTableType("");
        java.util.Map<java.lang.String, java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable>> strMap17 = slimTableFactory9.tableTypes;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory18 = slimTableFactory9.copy();
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory19 = new fitnesse.testsystems.slim.tables.SlimTableFactory();
        java.lang.String str21 = slimTableFactory19.getFullTableName("hi!");
        java.lang.String str23 = slimTableFactory19.makeTableType("");
        java.util.Map<java.lang.String, java.lang.String> strMap24 = null;
        slimTableFactory19.tableTypeArrays = strMap24;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory26 = new fitnesse.testsystems.slim.tables.SlimTableFactory();
        java.lang.String str28 = slimTableFactory26.getFullTableName("hi!");
        java.util.Map<java.lang.String, java.lang.String> strMap29 = slimTableFactory26.tableTypeArrays;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory30 = slimTableFactory26.copy();
        java.util.Map<java.lang.String, java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable>> strMap31 = slimTableFactory30.tableTypes;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory32 = slimTableFactory30.copy();
        java.util.Map<java.lang.String, java.lang.String> strMap33 = slimTableFactory32.tableTypeArrays;
        java.util.Map<java.lang.String, java.lang.String> strMap34 = slimTableFactory32.tableTypeArrays;
        slimTableFactory19.tableTypeArrays = strMap34;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory36 = slimTableFactory19.copy();
        java.lang.String str38 = slimTableFactory19.makeTableType("");
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory39 = new fitnesse.testsystems.slim.tables.SlimTableFactory();
        java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable> wildcardClass41 = slimTableFactory39.getTableType("");
        java.util.Map<java.lang.String, java.lang.String> strMap42 = slimTableFactory39.tableTypeArrays;
        slimTableFactory19.tableTypeArrays = strMap42;
        slimTableFactory18.tableTypeArrays = strMap42;
        boolean boolean46 = slimTableFactory18.hasColon("hi!");
        fitnesse.testsystems.slim.Table table47 = null;
        // The following exception was thrown during execution in test generation
        try {
            slimTableFactory18.parseDefineTableTypeRow(table47, 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(wildcardClass3);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(strMap6);
        org.junit.Assert.assertNotNull(slimTableFactory8);
        org.junit.Assert.assertNotNull(slimTableFactory9);
        org.junit.Assert.assertNotNull(strMap10);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertNull(wildcardClass16);
        org.junit.Assert.assertNotNull(strMap17);
        org.junit.Assert.assertNotNull(slimTableFactory18);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "hi!" + "'", str21, "hi!");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "hi!" + "'", str28, "hi!");
        org.junit.Assert.assertNotNull(strMap29);
        org.junit.Assert.assertNotNull(slimTableFactory30);
        org.junit.Assert.assertNotNull(strMap31);
        org.junit.Assert.assertNotNull(slimTableFactory32);
        org.junit.Assert.assertNotNull(strMap33);
        org.junit.Assert.assertNotNull(strMap34);
        org.junit.Assert.assertNotNull(slimTableFactory36);
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "" + "'", str38, "");
        org.junit.Assert.assertNull(wildcardClass41);
        org.junit.Assert.assertNotNull(strMap42);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
    }

    @Test
    public void test18043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18043");
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory0 = new fitnesse.testsystems.slim.tables.SlimTableFactory();
        java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable> wildcardClass2 = slimTableFactory0.getTableType("");
        java.util.Map<java.lang.String, java.lang.String> strMap3 = slimTableFactory0.tableTypeArrays;
        java.lang.String str5 = slimTableFactory0.getFullTableName("hi!");
        java.util.Map<java.lang.String, java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable>> strMap6 = slimTableFactory0.tableTypes;
        java.util.Map<java.lang.String, java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable>> strMap7 = slimTableFactory0.tableTypes;
        org.junit.Assert.assertNull(wildcardClass2);
        org.junit.Assert.assertNotNull(strMap3);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertNotNull(strMap6);
        org.junit.Assert.assertNotNull(strMap7);
    }

    @Test
    public void test18044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18044");
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory0 = new fitnesse.testsystems.slim.tables.SlimTableFactory();
        java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable> wildcardClass2 = slimTableFactory0.getTableType("");
        java.lang.String str4 = slimTableFactory0.getFullTableName("");
        java.util.Map<java.lang.String, java.lang.String> strMap5 = slimTableFactory0.tableTypeArrays;
        java.util.Map<java.lang.String, java.lang.String> strMap6 = slimTableFactory0.tableTypeArrays;
        java.util.Map<java.lang.String, java.lang.String> strMap7 = slimTableFactory0.tableTypeArrays;
        java.util.Map<java.lang.String, java.lang.String> strMap8 = slimTableFactory0.tableTypeArrays;
        java.lang.String str10 = slimTableFactory0.getFullTableName("hi!");
        java.lang.String str12 = slimTableFactory0.makeTableType("hi!");
        java.lang.Class<?> wildcardClass13 = slimTableFactory0.getClass();
        org.junit.Assert.assertNull(wildcardClass2);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(strMap5);
        org.junit.Assert.assertNotNull(strMap6);
        org.junit.Assert.assertNotNull(strMap7);
        org.junit.Assert.assertNotNull(strMap8);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test18045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18045");
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory0 = new fitnesse.testsystems.slim.tables.SlimTableFactory();
        java.lang.String str2 = slimTableFactory0.getFullTableName("hi!");
        java.util.Map<java.lang.String, java.lang.String> strMap3 = slimTableFactory0.tableTypeArrays;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory4 = new fitnesse.testsystems.slim.tables.SlimTableFactory();
        java.lang.String str6 = slimTableFactory4.getFullTableName("hi!");
        java.util.Map<java.lang.String, java.lang.String> strMap7 = slimTableFactory4.tableTypeArrays;
        slimTableFactory0.tableTypeArrays = strMap7;
        java.lang.String str10 = slimTableFactory0.getFullTableName("");
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory11 = slimTableFactory0.copy();
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory12 = slimTableFactory0.copy();
        java.util.Map<java.lang.String, java.lang.String> strMap13 = slimTableFactory0.tableTypeArrays;
        boolean boolean15 = slimTableFactory0.hasColon("hi!");
        java.util.Map<java.lang.String, java.lang.String> strMap16 = slimTableFactory0.tableTypeArrays;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory17 = slimTableFactory0.copy();
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory18 = new fitnesse.testsystems.slim.tables.SlimTableFactory();
        java.lang.String str20 = slimTableFactory18.getFullTableName("hi!");
        java.util.Map<java.lang.String, java.lang.String> strMap21 = slimTableFactory18.tableTypeArrays;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory22 = slimTableFactory18.copy();
        boolean boolean24 = slimTableFactory18.hasColon("hi!");
        boolean boolean26 = slimTableFactory18.hasColon("");
        boolean boolean28 = slimTableFactory18.hasColon("");
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory29 = new fitnesse.testsystems.slim.tables.SlimTableFactory();
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory30 = new fitnesse.testsystems.slim.tables.SlimTableFactory();
        java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable> wildcardClass32 = slimTableFactory30.getTableType("");
        java.lang.String str34 = slimTableFactory30.getFullTableName("");
        java.util.Map<java.lang.String, java.lang.String> strMap35 = slimTableFactory30.tableTypeArrays;
        slimTableFactory29.tableTypeArrays = strMap35;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory37 = slimTableFactory29.copy();
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory38 = slimTableFactory37.copy();
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory39 = slimTableFactory37.copy();
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory40 = slimTableFactory37.copy();
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory41 = slimTableFactory37.copy();
        java.util.Map<java.lang.String, java.lang.String> strMap42 = slimTableFactory37.tableTypeArrays;
        slimTableFactory18.tableTypeArrays = strMap42;
        slimTableFactory17.tableTypeArrays = strMap42;
        java.util.Map<java.lang.String, java.lang.String> strMap45 = slimTableFactory17.tableTypeArrays;
        fitnesse.testsystems.slim.Table table46 = null;
        // The following exception was thrown during execution in test generation
        try {
            fitnesse.testsystems.slim.tables.SlimTable slimTable47 = slimTableFactory17.parseDefineTableTypeTable(table46);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!" + "'", str2, "hi!");
        org.junit.Assert.assertNotNull(strMap3);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertNotNull(strMap7);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNotNull(slimTableFactory11);
        org.junit.Assert.assertNotNull(slimTableFactory12);
        org.junit.Assert.assertNotNull(strMap13);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(strMap16);
        org.junit.Assert.assertNotNull(slimTableFactory17);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "hi!" + "'", str20, "hi!");
        org.junit.Assert.assertNotNull(strMap21);
        org.junit.Assert.assertNotNull(slimTableFactory22);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertNull(wildcardClass32);
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "" + "'", str34, "");
        org.junit.Assert.assertNotNull(strMap35);
        org.junit.Assert.assertNotNull(slimTableFactory37);
        org.junit.Assert.assertNotNull(slimTableFactory38);
        org.junit.Assert.assertNotNull(slimTableFactory39);
        org.junit.Assert.assertNotNull(slimTableFactory40);
        org.junit.Assert.assertNotNull(slimTableFactory41);
        org.junit.Assert.assertNotNull(strMap42);
        org.junit.Assert.assertNotNull(strMap45);
    }

    @Test
    public void test18046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18046");
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory0 = new fitnesse.testsystems.slim.tables.SlimTableFactory();
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory1 = new fitnesse.testsystems.slim.tables.SlimTableFactory();
        java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable> wildcardClass3 = slimTableFactory1.getTableType("");
        java.lang.String str5 = slimTableFactory1.getFullTableName("");
        java.util.Map<java.lang.String, java.lang.String> strMap6 = slimTableFactory1.tableTypeArrays;
        slimTableFactory0.tableTypeArrays = strMap6;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory8 = slimTableFactory0.copy();
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory9 = slimTableFactory8.copy();
        java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable> wildcardClass11 = slimTableFactory9.getTableType("hi!");
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory12 = slimTableFactory9.copy();
        java.util.Map<java.lang.String, java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable>> strMap13 = slimTableFactory9.tableTypes;
        java.util.Map<java.lang.String, java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable>> strMap14 = slimTableFactory9.tableTypes;
        boolean boolean16 = slimTableFactory9.hasColon("");
        org.junit.Assert.assertNull(wildcardClass3);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(strMap6);
        org.junit.Assert.assertNotNull(slimTableFactory8);
        org.junit.Assert.assertNotNull(slimTableFactory9);
        org.junit.Assert.assertNull(wildcardClass11);
        org.junit.Assert.assertNotNull(slimTableFactory12);
        org.junit.Assert.assertNotNull(strMap13);
        org.junit.Assert.assertNotNull(strMap14);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test18047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18047");
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory0 = new fitnesse.testsystems.slim.tables.SlimTableFactory();
        java.lang.String str2 = slimTableFactory0.getFullTableName("hi!");
        java.util.Map<java.lang.String, java.lang.String> strMap3 = slimTableFactory0.tableTypeArrays;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory4 = slimTableFactory0.copy();
        java.lang.String str6 = slimTableFactory4.makeTableType("");
        java.util.Map<java.lang.String, java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable>> strMap7 = slimTableFactory4.tableTypes;
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!" + "'", str2, "hi!");
        org.junit.Assert.assertNotNull(strMap3);
        org.junit.Assert.assertNotNull(slimTableFactory4);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(strMap7);
    }

    @Test
    public void test18048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18048");
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory0 = new fitnesse.testsystems.slim.tables.SlimTableFactory();
        java.lang.String str2 = slimTableFactory0.getFullTableName("hi!");
        java.util.Map<java.lang.String, java.lang.String> strMap3 = slimTableFactory0.tableTypeArrays;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory4 = slimTableFactory0.copy();
        java.util.Map<java.lang.String, java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable>> strMap5 = slimTableFactory4.tableTypes;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory6 = slimTableFactory4.copy();
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory7 = slimTableFactory6.copy();
        boolean boolean9 = slimTableFactory7.hasColon("hi!");
        java.util.Map<java.lang.String, java.lang.String> strMap10 = slimTableFactory7.tableTypeArrays;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory11 = slimTableFactory7.copy();
        fitnesse.testsystems.slim.Table table12 = null;
        // The following exception was thrown during execution in test generation
        try {
            fitnesse.testsystems.slim.tables.SlimTable slimTable13 = slimTableFactory7.parseDefineTableTypeTable(table12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!" + "'", str2, "hi!");
        org.junit.Assert.assertNotNull(strMap3);
        org.junit.Assert.assertNotNull(slimTableFactory4);
        org.junit.Assert.assertNotNull(strMap5);
        org.junit.Assert.assertNotNull(slimTableFactory6);
        org.junit.Assert.assertNotNull(slimTableFactory7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(strMap10);
        org.junit.Assert.assertNotNull(slimTableFactory11);
    }

    @Test
    public void test18049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18049");
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory0 = new fitnesse.testsystems.slim.tables.SlimTableFactory();
        java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable> wildcardClass2 = slimTableFactory0.getTableType("");
        java.lang.String str4 = slimTableFactory0.getFullTableName("");
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory5 = slimTableFactory0.copy();
        boolean boolean7 = slimTableFactory0.hasColon("");
        java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable> wildcardClass9 = slimTableFactory0.getTableType("");
        java.lang.String str11 = slimTableFactory0.makeTableType("");
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory12 = slimTableFactory0.copy();
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory13 = new fitnesse.testsystems.slim.tables.SlimTableFactory();
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory14 = new fitnesse.testsystems.slim.tables.SlimTableFactory();
        java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable> wildcardClass16 = slimTableFactory14.getTableType("");
        java.lang.String str18 = slimTableFactory14.getFullTableName("");
        java.util.Map<java.lang.String, java.lang.String> strMap19 = slimTableFactory14.tableTypeArrays;
        slimTableFactory13.tableTypeArrays = strMap19;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory21 = slimTableFactory13.copy();
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory22 = slimTableFactory21.copy();
        java.util.Map<java.lang.String, java.lang.String> strMap23 = slimTableFactory22.tableTypeArrays;
        slimTableFactory12.tableTypeArrays = strMap23;
        boolean boolean26 = slimTableFactory12.hasColon("");
        java.lang.String str28 = slimTableFactory12.makeTableType("");
        java.lang.String str30 = slimTableFactory12.getFullTableName("hi!");
        java.util.Map<java.lang.String, java.lang.String> strMap31 = slimTableFactory12.tableTypeArrays;
        java.util.Map<java.lang.String, java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable>> strMap32 = slimTableFactory12.tableTypes;
        java.lang.String str34 = slimTableFactory12.getFullTableName("");
        org.junit.Assert.assertNull(wildcardClass2);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(slimTableFactory5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(wildcardClass9);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNotNull(slimTableFactory12);
        org.junit.Assert.assertNull(wildcardClass16);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertNotNull(strMap19);
        org.junit.Assert.assertNotNull(slimTableFactory21);
        org.junit.Assert.assertNotNull(slimTableFactory22);
        org.junit.Assert.assertNotNull(strMap23);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "" + "'", str28, "");
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "hi!" + "'", str30, "hi!");
        org.junit.Assert.assertNotNull(strMap31);
        org.junit.Assert.assertNotNull(strMap32);
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "" + "'", str34, "");
    }

    @Test
    public void test18050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18050");
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory0 = new fitnesse.testsystems.slim.tables.SlimTableFactory();
        java.lang.String str2 = slimTableFactory0.getFullTableName("hi!");
        java.util.Map<java.lang.String, java.lang.String> strMap3 = slimTableFactory0.tableTypeArrays;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory4 = slimTableFactory0.copy();
        java.util.Map<java.lang.String, java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable>> strMap5 = slimTableFactory4.tableTypes;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory6 = slimTableFactory4.copy();
        java.lang.String str8 = slimTableFactory6.getFullTableName("hi!");
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory9 = slimTableFactory6.copy();
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory10 = slimTableFactory9.copy();
        java.util.Map<java.lang.String, java.lang.String> strMap11 = slimTableFactory10.tableTypeArrays;
        java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable> wildcardClass13 = slimTableFactory10.getTableType("");
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory14 = slimTableFactory10.copy();
        boolean boolean16 = slimTableFactory14.hasColon("");
        java.lang.String str18 = slimTableFactory14.makeTableType("");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!" + "'", str2, "hi!");
        org.junit.Assert.assertNotNull(strMap3);
        org.junit.Assert.assertNotNull(slimTableFactory4);
        org.junit.Assert.assertNotNull(strMap5);
        org.junit.Assert.assertNotNull(slimTableFactory6);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertNotNull(slimTableFactory9);
        org.junit.Assert.assertNotNull(slimTableFactory10);
        org.junit.Assert.assertNotNull(strMap11);
        org.junit.Assert.assertNull(wildcardClass13);
        org.junit.Assert.assertNotNull(slimTableFactory14);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
    }

    @Test
    public void test18051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18051");
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory0 = new fitnesse.testsystems.slim.tables.SlimTableFactory();
        java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable> wildcardClass2 = slimTableFactory0.getTableType("");
        boolean boolean4 = slimTableFactory0.hasColon("");
        boolean boolean6 = slimTableFactory0.hasColon("hi!");
        java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable> wildcardClass8 = slimTableFactory0.getTableType("hi!");
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory9 = new fitnesse.testsystems.slim.tables.SlimTableFactory();
        java.lang.String str11 = slimTableFactory9.getFullTableName("hi!");
        java.lang.String str13 = slimTableFactory9.makeTableType("");
        java.util.Map<java.lang.String, java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable>> strMap14 = slimTableFactory9.tableTypes;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory15 = new fitnesse.testsystems.slim.tables.SlimTableFactory();
        java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable> wildcardClass17 = slimTableFactory15.getTableType("");
        java.lang.String str19 = slimTableFactory15.getFullTableName("");
        java.util.Map<java.lang.String, java.lang.String> strMap20 = slimTableFactory15.tableTypeArrays;
        slimTableFactory9.tableTypeArrays = strMap20;
        slimTableFactory0.tableTypeArrays = strMap20;
        boolean boolean24 = slimTableFactory0.hasColon("");
        java.lang.String str26 = slimTableFactory0.getFullTableName("hi!");
        java.lang.String str28 = slimTableFactory0.makeTableType("");
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory29 = slimTableFactory0.copy();
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory30 = slimTableFactory0.copy();
        java.lang.String str32 = slimTableFactory30.makeTableType("");
        java.lang.String str34 = slimTableFactory30.getFullTableName("");
        boolean boolean36 = slimTableFactory30.hasColon("hi!");
        org.junit.Assert.assertNull(wildcardClass2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(wildcardClass8);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNotNull(strMap14);
        org.junit.Assert.assertNull(wildcardClass17);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertNotNull(strMap20);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "hi!" + "'", str26, "hi!");
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "" + "'", str28, "");
        org.junit.Assert.assertNotNull(slimTableFactory29);
        org.junit.Assert.assertNotNull(slimTableFactory30);
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "" + "'", str32, "");
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "" + "'", str34, "");
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
    }

    @Test
    public void test18052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18052");
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory0 = new fitnesse.testsystems.slim.tables.SlimTableFactory();
        java.lang.String str2 = slimTableFactory0.getFullTableName("hi!");
        java.util.Map<java.lang.String, java.lang.String> strMap3 = slimTableFactory0.tableTypeArrays;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory4 = slimTableFactory0.copy();
        java.util.Map<java.lang.String, java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable>> strMap5 = slimTableFactory4.tableTypes;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory6 = slimTableFactory4.copy();
        java.util.Map<java.lang.String, java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable>> strMap7 = slimTableFactory4.tableTypes;
        java.lang.String str9 = slimTableFactory4.getFullTableName("hi!");
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory10 = slimTableFactory4.copy();
        java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable> wildcardClass12 = slimTableFactory10.getTableType("hi!");
        java.lang.String str14 = slimTableFactory10.getFullTableName("");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!" + "'", str2, "hi!");
        org.junit.Assert.assertNotNull(strMap3);
        org.junit.Assert.assertNotNull(slimTableFactory4);
        org.junit.Assert.assertNotNull(strMap5);
        org.junit.Assert.assertNotNull(slimTableFactory6);
        org.junit.Assert.assertNotNull(strMap7);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertNotNull(slimTableFactory10);
        org.junit.Assert.assertNull(wildcardClass12);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
    }

    @Test
    public void test18053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18053");
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory0 = new fitnesse.testsystems.slim.tables.SlimTableFactory();
        java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable> wildcardClass2 = slimTableFactory0.getTableType("");
        java.lang.String str4 = slimTableFactory0.makeTableType("");
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory5 = new fitnesse.testsystems.slim.tables.SlimTableFactory();
        java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable> wildcardClass7 = slimTableFactory5.getTableType("");
        java.lang.String str9 = slimTableFactory5.getFullTableName("");
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory10 = slimTableFactory5.copy();
        java.util.Map<java.lang.String, java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable>> strMap11 = slimTableFactory5.tableTypes;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory12 = new fitnesse.testsystems.slim.tables.SlimTableFactory();
        java.lang.String str14 = slimTableFactory12.getFullTableName("hi!");
        java.util.Map<java.lang.String, java.lang.String> strMap15 = slimTableFactory12.tableTypeArrays;
        java.lang.String str17 = slimTableFactory12.makeTableType("");
        java.util.Map<java.lang.String, java.lang.String> strMap18 = slimTableFactory12.tableTypeArrays;
        java.lang.String str20 = slimTableFactory12.getFullTableName("");
        java.util.Map<java.lang.String, java.lang.String> strMap21 = slimTableFactory12.tableTypeArrays;
        slimTableFactory5.tableTypeArrays = strMap21;
        java.util.Map<java.lang.String, java.lang.String> strMap23 = slimTableFactory5.tableTypeArrays;
        slimTableFactory0.tableTypeArrays = strMap23;
        java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable> wildcardClass26 = slimTableFactory0.getTableType("hi!");
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory27 = slimTableFactory0.copy();
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory28 = slimTableFactory0.copy();
        java.lang.String str30 = slimTableFactory28.getFullTableName("hi!");
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory31 = new fitnesse.testsystems.slim.tables.SlimTableFactory();
        java.lang.String str33 = slimTableFactory31.getFullTableName("hi!");
        java.util.Map<java.lang.String, java.lang.String> strMap34 = slimTableFactory31.tableTypeArrays;
        boolean boolean36 = slimTableFactory31.hasColon("");
        java.util.Map<java.lang.String, java.lang.String> strMap37 = slimTableFactory31.tableTypeArrays;
        slimTableFactory28.tableTypeArrays = strMap37;
        java.util.Map<java.lang.String, java.lang.String> strMap39 = slimTableFactory28.tableTypeArrays;
        java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable> wildcardClass41 = slimTableFactory28.getTableType("hi!");
        org.junit.Assert.assertNull(wildcardClass2);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNull(wildcardClass7);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNotNull(slimTableFactory10);
        org.junit.Assert.assertNotNull(strMap11);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertNotNull(strMap15);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertNotNull(strMap18);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertNotNull(strMap21);
        org.junit.Assert.assertNotNull(strMap23);
        org.junit.Assert.assertNull(wildcardClass26);
        org.junit.Assert.assertNotNull(slimTableFactory27);
        org.junit.Assert.assertNotNull(slimTableFactory28);
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "hi!" + "'", str30, "hi!");
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "hi!" + "'", str33, "hi!");
        org.junit.Assert.assertNotNull(strMap34);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertNotNull(strMap37);
        org.junit.Assert.assertNotNull(strMap39);
        org.junit.Assert.assertNull(wildcardClass41);
    }

    @Test
    public void test18054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18054");
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory0 = new fitnesse.testsystems.slim.tables.SlimTableFactory();
        java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable> wildcardClass2 = slimTableFactory0.getTableType("");
        boolean boolean4 = slimTableFactory0.hasColon("");
        java.util.Map<java.lang.String, java.lang.String> strMap5 = slimTableFactory0.tableTypeArrays;
        java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable> wildcardClass7 = slimTableFactory0.getTableType("");
        java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable> wildcardClass9 = slimTableFactory0.getTableType("hi!");
        boolean boolean11 = slimTableFactory0.hasColon("");
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory12 = slimTableFactory0.copy();
        java.util.Map<java.lang.String, java.lang.String> strMap13 = slimTableFactory12.tableTypeArrays;
        java.lang.String str15 = slimTableFactory12.makeTableType("hi!");
        java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable> wildcardClass17 = slimTableFactory12.getTableType("");
        org.junit.Assert.assertNull(wildcardClass2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(strMap5);
        org.junit.Assert.assertNull(wildcardClass7);
        org.junit.Assert.assertNull(wildcardClass9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(slimTableFactory12);
        org.junit.Assert.assertNotNull(strMap13);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertNull(wildcardClass17);
    }

    @Test
    public void test18055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18055");
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory0 = new fitnesse.testsystems.slim.tables.SlimTableFactory();
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory1 = new fitnesse.testsystems.slim.tables.SlimTableFactory();
        java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable> wildcardClass3 = slimTableFactory1.getTableType("");
        java.lang.String str5 = slimTableFactory1.getFullTableName("");
        java.util.Map<java.lang.String, java.lang.String> strMap6 = slimTableFactory1.tableTypeArrays;
        slimTableFactory0.tableTypeArrays = strMap6;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory8 = slimTableFactory0.copy();
        java.lang.String str10 = slimTableFactory0.getFullTableName("hi!");
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory11 = slimTableFactory0.copy();
        java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable> wildcardClass13 = slimTableFactory11.getTableType("");
        java.lang.String str15 = slimTableFactory11.makeTableType("hi!");
        java.util.Map<java.lang.String, java.lang.String> strMap16 = slimTableFactory11.tableTypeArrays;
        org.junit.Assert.assertNull(wildcardClass3);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(strMap6);
        org.junit.Assert.assertNotNull(slimTableFactory8);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertNotNull(slimTableFactory11);
        org.junit.Assert.assertNull(wildcardClass13);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertNotNull(strMap16);
    }

    @Test
    public void test18056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18056");
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory0 = new fitnesse.testsystems.slim.tables.SlimTableFactory();
        java.lang.String str2 = slimTableFactory0.getFullTableName("hi!");
        java.util.Map<java.lang.String, java.lang.String> strMap3 = slimTableFactory0.tableTypeArrays;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory4 = slimTableFactory0.copy();
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory5 = slimTableFactory0.copy();
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory6 = slimTableFactory0.copy();
        java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable> wildcardClass8 = slimTableFactory6.getTableType("hi!");
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory9 = new fitnesse.testsystems.slim.tables.SlimTableFactory();
        java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable> wildcardClass11 = slimTableFactory9.getTableType("");
        java.lang.String str13 = slimTableFactory9.getFullTableName("");
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory14 = slimTableFactory9.copy();
        java.lang.String str16 = slimTableFactory9.makeTableType("hi!");
        java.util.Map<java.lang.String, java.lang.String> strMap17 = slimTableFactory9.tableTypeArrays;
        java.util.Map<java.lang.String, java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable>> strMap18 = slimTableFactory9.tableTypes;
        java.lang.String str20 = slimTableFactory9.getFullTableName("hi!");
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory21 = slimTableFactory9.copy();
        java.util.Map<java.lang.String, java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable>> strMap22 = slimTableFactory21.tableTypes;
        java.util.Map<java.lang.String, java.lang.String> strMap23 = slimTableFactory21.tableTypeArrays;
        slimTableFactory6.tableTypeArrays = strMap23;
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!" + "'", str2, "hi!");
        org.junit.Assert.assertNotNull(strMap3);
        org.junit.Assert.assertNotNull(slimTableFactory4);
        org.junit.Assert.assertNotNull(slimTableFactory5);
        org.junit.Assert.assertNotNull(slimTableFactory6);
        org.junit.Assert.assertNull(wildcardClass8);
        org.junit.Assert.assertNull(wildcardClass11);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNotNull(slimTableFactory14);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertNotNull(strMap17);
        org.junit.Assert.assertNotNull(strMap18);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "hi!" + "'", str20, "hi!");
        org.junit.Assert.assertNotNull(slimTableFactory21);
        org.junit.Assert.assertNotNull(strMap22);
        org.junit.Assert.assertNotNull(strMap23);
    }

    @Test
    public void test18057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18057");
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory0 = new fitnesse.testsystems.slim.tables.SlimTableFactory();
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory1 = new fitnesse.testsystems.slim.tables.SlimTableFactory();
        java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable> wildcardClass3 = slimTableFactory1.getTableType("");
        java.lang.String str5 = slimTableFactory1.getFullTableName("");
        java.util.Map<java.lang.String, java.lang.String> strMap6 = slimTableFactory1.tableTypeArrays;
        slimTableFactory0.tableTypeArrays = strMap6;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory8 = slimTableFactory0.copy();
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory9 = slimTableFactory8.copy();
        java.util.Map<java.lang.String, java.lang.String> strMap10 = slimTableFactory9.tableTypeArrays;
        java.lang.String str12 = slimTableFactory9.makeTableType("hi!");
        java.util.Map<java.lang.String, java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable>> strMap13 = slimTableFactory9.tableTypes;
        java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable> wildcardClass15 = slimTableFactory9.getTableType("hi!");
        java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable> wildcardClass17 = slimTableFactory9.getTableType("hi!");
        java.util.Map<java.lang.String, java.lang.String> strMap18 = slimTableFactory9.tableTypeArrays;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory19 = new fitnesse.testsystems.slim.tables.SlimTableFactory();
        java.lang.String str21 = slimTableFactory19.getFullTableName("hi!");
        java.lang.String str23 = slimTableFactory19.makeTableType("");
        java.util.Map<java.lang.String, java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable>> strMap24 = slimTableFactory19.tableTypes;
        java.lang.String str26 = slimTableFactory19.getFullTableName("");
        java.util.Map<java.lang.String, java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable>> strMap27 = slimTableFactory19.tableTypes;
        java.util.Map<java.lang.String, java.lang.String> strMap28 = slimTableFactory19.tableTypeArrays;
        java.util.Map<java.lang.String, java.lang.String> strMap29 = slimTableFactory19.tableTypeArrays;
        java.lang.String str31 = slimTableFactory19.getFullTableName("");
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory32 = new fitnesse.testsystems.slim.tables.SlimTableFactory();
        java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable> wildcardClass34 = slimTableFactory32.getTableType("");
        java.lang.String str36 = slimTableFactory32.getFullTableName("");
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory37 = slimTableFactory32.copy();
        boolean boolean39 = slimTableFactory32.hasColon("");
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory40 = slimTableFactory32.copy();
        java.util.Map<java.lang.String, java.lang.String> strMap41 = slimTableFactory40.tableTypeArrays;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory42 = new fitnesse.testsystems.slim.tables.SlimTableFactory();
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory43 = new fitnesse.testsystems.slim.tables.SlimTableFactory();
        java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable> wildcardClass45 = slimTableFactory43.getTableType("");
        java.lang.String str47 = slimTableFactory43.getFullTableName("");
        java.util.Map<java.lang.String, java.lang.String> strMap48 = slimTableFactory43.tableTypeArrays;
        slimTableFactory42.tableTypeArrays = strMap48;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory50 = slimTableFactory42.copy();
        java.util.Map<java.lang.String, java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable>> strMap51 = slimTableFactory42.tableTypes;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory52 = new fitnesse.testsystems.slim.tables.SlimTableFactory();
        java.lang.String str54 = slimTableFactory52.getFullTableName("hi!");
        java.util.Map<java.lang.String, java.lang.String> strMap55 = slimTableFactory52.tableTypeArrays;
        java.lang.String str57 = slimTableFactory52.makeTableType("");
        java.util.Map<java.lang.String, java.lang.String> strMap58 = slimTableFactory52.tableTypeArrays;
        slimTableFactory42.tableTypeArrays = strMap58;
        slimTableFactory40.tableTypeArrays = strMap58;
        java.util.Map<java.lang.String, java.lang.String> strMap61 = slimTableFactory40.tableTypeArrays;
        slimTableFactory19.tableTypeArrays = strMap61;
        slimTableFactory9.tableTypeArrays = strMap61;
        java.lang.Class<?> wildcardClass64 = slimTableFactory9.getClass();
        org.junit.Assert.assertNull(wildcardClass3);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(strMap6);
        org.junit.Assert.assertNotNull(slimTableFactory8);
        org.junit.Assert.assertNotNull(slimTableFactory9);
        org.junit.Assert.assertNotNull(strMap10);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertNotNull(strMap13);
        org.junit.Assert.assertNull(wildcardClass15);
        org.junit.Assert.assertNull(wildcardClass17);
        org.junit.Assert.assertNotNull(strMap18);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "hi!" + "'", str21, "hi!");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
        org.junit.Assert.assertNotNull(strMap24);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "" + "'", str26, "");
        org.junit.Assert.assertNotNull(strMap27);
        org.junit.Assert.assertNotNull(strMap28);
        org.junit.Assert.assertNotNull(strMap29);
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "" + "'", str31, "");
        org.junit.Assert.assertNull(wildcardClass34);
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "" + "'", str36, "");
        org.junit.Assert.assertNotNull(slimTableFactory37);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertNotNull(slimTableFactory40);
        org.junit.Assert.assertNotNull(strMap41);
        org.junit.Assert.assertNull(wildcardClass45);
        org.junit.Assert.assertEquals("'" + str47 + "' != '" + "" + "'", str47, "");
        org.junit.Assert.assertNotNull(strMap48);
        org.junit.Assert.assertNotNull(slimTableFactory50);
        org.junit.Assert.assertNotNull(strMap51);
        org.junit.Assert.assertEquals("'" + str54 + "' != '" + "hi!" + "'", str54, "hi!");
        org.junit.Assert.assertNotNull(strMap55);
        org.junit.Assert.assertEquals("'" + str57 + "' != '" + "" + "'", str57, "");
        org.junit.Assert.assertNotNull(strMap58);
        org.junit.Assert.assertNotNull(strMap61);
        org.junit.Assert.assertNotNull(wildcardClass64);
    }

    @Test
    public void test18058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18058");
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory0 = new fitnesse.testsystems.slim.tables.SlimTableFactory();
        java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable> wildcardClass2 = slimTableFactory0.getTableType("");
        java.lang.String str4 = slimTableFactory0.makeTableType("");
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory5 = new fitnesse.testsystems.slim.tables.SlimTableFactory();
        java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable> wildcardClass7 = slimTableFactory5.getTableType("");
        java.lang.String str9 = slimTableFactory5.getFullTableName("");
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory10 = slimTableFactory5.copy();
        java.util.Map<java.lang.String, java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable>> strMap11 = slimTableFactory5.tableTypes;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory12 = new fitnesse.testsystems.slim.tables.SlimTableFactory();
        java.lang.String str14 = slimTableFactory12.getFullTableName("hi!");
        java.util.Map<java.lang.String, java.lang.String> strMap15 = slimTableFactory12.tableTypeArrays;
        java.lang.String str17 = slimTableFactory12.makeTableType("");
        java.util.Map<java.lang.String, java.lang.String> strMap18 = slimTableFactory12.tableTypeArrays;
        java.lang.String str20 = slimTableFactory12.getFullTableName("");
        java.util.Map<java.lang.String, java.lang.String> strMap21 = slimTableFactory12.tableTypeArrays;
        slimTableFactory5.tableTypeArrays = strMap21;
        java.util.Map<java.lang.String, java.lang.String> strMap23 = slimTableFactory5.tableTypeArrays;
        slimTableFactory0.tableTypeArrays = strMap23;
        java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable> wildcardClass26 = slimTableFactory0.getTableType("hi!");
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory27 = slimTableFactory0.copy();
        boolean boolean29 = slimTableFactory0.hasColon("hi!");
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory30 = new fitnesse.testsystems.slim.tables.SlimTableFactory();
        java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable> wildcardClass32 = slimTableFactory30.getTableType("");
        java.lang.String str34 = slimTableFactory30.getFullTableName("");
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory35 = slimTableFactory30.copy();
        boolean boolean37 = slimTableFactory30.hasColon("");
        java.util.Map<java.lang.String, java.lang.String> strMap38 = slimTableFactory30.tableTypeArrays;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory39 = new fitnesse.testsystems.slim.tables.SlimTableFactory();
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory40 = slimTableFactory39.copy();
        java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable> wildcardClass42 = slimTableFactory40.getTableType("hi!");
        java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable> wildcardClass44 = slimTableFactory40.getTableType("hi!");
        boolean boolean46 = slimTableFactory40.hasColon("");
        java.util.Map<java.lang.String, java.lang.String> strMap47 = slimTableFactory40.tableTypeArrays;
        slimTableFactory30.tableTypeArrays = strMap47;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory49 = new fitnesse.testsystems.slim.tables.SlimTableFactory();
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory50 = new fitnesse.testsystems.slim.tables.SlimTableFactory();
        java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable> wildcardClass52 = slimTableFactory50.getTableType("");
        java.lang.String str54 = slimTableFactory50.getFullTableName("");
        java.util.Map<java.lang.String, java.lang.String> strMap55 = slimTableFactory50.tableTypeArrays;
        slimTableFactory49.tableTypeArrays = strMap55;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory57 = slimTableFactory49.copy();
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory58 = slimTableFactory57.copy();
        boolean boolean60 = slimTableFactory57.hasColon("hi!");
        java.util.Map<java.lang.String, java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable>> strMap61 = slimTableFactory57.tableTypes;
        java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable> wildcardClass63 = slimTableFactory57.getTableType("hi!");
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory64 = slimTableFactory57.copy();
        java.util.Map<java.lang.String, java.lang.String> strMap65 = slimTableFactory64.tableTypeArrays;
        slimTableFactory30.tableTypeArrays = strMap65;
        slimTableFactory0.tableTypeArrays = strMap65;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory68 = new fitnesse.testsystems.slim.tables.SlimTableFactory();
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory69 = new fitnesse.testsystems.slim.tables.SlimTableFactory();
        java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable> wildcardClass71 = slimTableFactory69.getTableType("");
        java.lang.String str73 = slimTableFactory69.getFullTableName("");
        java.util.Map<java.lang.String, java.lang.String> strMap74 = slimTableFactory69.tableTypeArrays;
        slimTableFactory68.tableTypeArrays = strMap74;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory76 = slimTableFactory68.copy();
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory77 = slimTableFactory76.copy();
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory78 = slimTableFactory76.copy();
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory79 = slimTableFactory76.copy();
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory80 = slimTableFactory76.copy();
        java.util.Map<java.lang.String, java.lang.String> strMap81 = slimTableFactory76.tableTypeArrays;
        java.lang.String str83 = slimTableFactory76.makeTableType("hi!");
        java.lang.String str85 = slimTableFactory76.makeTableType("hi!");
        java.util.Map<java.lang.String, java.lang.String> strMap86 = slimTableFactory76.tableTypeArrays;
        slimTableFactory0.tableTypeArrays = strMap86;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory88 = slimTableFactory0.copy();
        java.util.Map<java.lang.String, java.lang.String> strMap89 = slimTableFactory0.tableTypeArrays;
        boolean boolean91 = slimTableFactory0.hasColon("");
        org.junit.Assert.assertNull(wildcardClass2);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNull(wildcardClass7);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNotNull(slimTableFactory10);
        org.junit.Assert.assertNotNull(strMap11);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertNotNull(strMap15);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertNotNull(strMap18);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertNotNull(strMap21);
        org.junit.Assert.assertNotNull(strMap23);
        org.junit.Assert.assertNull(wildcardClass26);
        org.junit.Assert.assertNotNull(slimTableFactory27);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertNull(wildcardClass32);
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "" + "'", str34, "");
        org.junit.Assert.assertNotNull(slimTableFactory35);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertNotNull(strMap38);
        org.junit.Assert.assertNotNull(slimTableFactory40);
        org.junit.Assert.assertNull(wildcardClass42);
        org.junit.Assert.assertNull(wildcardClass44);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertNotNull(strMap47);
        org.junit.Assert.assertNull(wildcardClass52);
        org.junit.Assert.assertEquals("'" + str54 + "' != '" + "" + "'", str54, "");
        org.junit.Assert.assertNotNull(strMap55);
        org.junit.Assert.assertNotNull(slimTableFactory57);
        org.junit.Assert.assertNotNull(slimTableFactory58);
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + false + "'", boolean60 == false);
        org.junit.Assert.assertNotNull(strMap61);
        org.junit.Assert.assertNull(wildcardClass63);
        org.junit.Assert.assertNotNull(slimTableFactory64);
        org.junit.Assert.assertNotNull(strMap65);
        org.junit.Assert.assertNull(wildcardClass71);
        org.junit.Assert.assertEquals("'" + str73 + "' != '" + "" + "'", str73, "");
        org.junit.Assert.assertNotNull(strMap74);
        org.junit.Assert.assertNotNull(slimTableFactory76);
        org.junit.Assert.assertNotNull(slimTableFactory77);
        org.junit.Assert.assertNotNull(slimTableFactory78);
        org.junit.Assert.assertNotNull(slimTableFactory79);
        org.junit.Assert.assertNotNull(slimTableFactory80);
        org.junit.Assert.assertNotNull(strMap81);
        org.junit.Assert.assertEquals("'" + str83 + "' != '" + "hi!" + "'", str83, "hi!");
        org.junit.Assert.assertEquals("'" + str85 + "' != '" + "hi!" + "'", str85, "hi!");
        org.junit.Assert.assertNotNull(strMap86);
        org.junit.Assert.assertNotNull(slimTableFactory88);
        org.junit.Assert.assertNotNull(strMap89);
        org.junit.Assert.assertTrue("'" + boolean91 + "' != '" + false + "'", boolean91 == false);
    }

    @Test
    public void test18059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18059");
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory0 = new fitnesse.testsystems.slim.tables.SlimTableFactory();
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory1 = slimTableFactory0.copy();
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory2 = slimTableFactory0.copy();
        java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable> wildcardClass4 = slimTableFactory0.getTableType("hi!");
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory5 = new fitnesse.testsystems.slim.tables.SlimTableFactory();
        java.lang.String str7 = slimTableFactory5.getFullTableName("hi!");
        java.util.Map<java.lang.String, java.lang.String> strMap8 = slimTableFactory5.tableTypeArrays;
        java.lang.String str10 = slimTableFactory5.makeTableType("");
        java.util.Map<java.lang.String, java.lang.String> strMap11 = slimTableFactory5.tableTypeArrays;
        slimTableFactory0.tableTypeArrays = strMap11;
        java.util.Map<java.lang.String, java.lang.String> strMap13 = slimTableFactory0.tableTypeArrays;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory14 = new fitnesse.testsystems.slim.tables.SlimTableFactory();
        java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable> wildcardClass16 = slimTableFactory14.getTableType("");
        boolean boolean18 = slimTableFactory14.hasColon("");
        boolean boolean20 = slimTableFactory14.hasColon("hi!");
        java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable> wildcardClass22 = slimTableFactory14.getTableType("hi!");
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory23 = new fitnesse.testsystems.slim.tables.SlimTableFactory();
        java.lang.String str25 = slimTableFactory23.getFullTableName("hi!");
        java.lang.String str27 = slimTableFactory23.makeTableType("");
        java.util.Map<java.lang.String, java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable>> strMap28 = slimTableFactory23.tableTypes;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory29 = new fitnesse.testsystems.slim.tables.SlimTableFactory();
        java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable> wildcardClass31 = slimTableFactory29.getTableType("");
        java.lang.String str33 = slimTableFactory29.getFullTableName("");
        java.util.Map<java.lang.String, java.lang.String> strMap34 = slimTableFactory29.tableTypeArrays;
        slimTableFactory23.tableTypeArrays = strMap34;
        slimTableFactory14.tableTypeArrays = strMap34;
        boolean boolean38 = slimTableFactory14.hasColon("");
        java.util.Map<java.lang.String, java.lang.String> strMap39 = slimTableFactory14.tableTypeArrays;
        java.util.Map<java.lang.String, java.lang.String> strMap40 = slimTableFactory14.tableTypeArrays;
        slimTableFactory0.tableTypeArrays = strMap40;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory42 = slimTableFactory0.copy();
        fitnesse.testsystems.slim.Table table43 = null;
        fitnesse.testsystems.slim.SlimTestContext slimTestContext45 = null;
        // The following exception was thrown during execution in test generation
        try {
            fitnesse.testsystems.slim.tables.SlimTable slimTable46 = slimTableFactory42.makeSlimTable(table43, "hi!", slimTestContext45);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(slimTableFactory1);
        org.junit.Assert.assertNotNull(slimTableFactory2);
        org.junit.Assert.assertNull(wildcardClass4);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertNotNull(strMap8);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNotNull(strMap11);
        org.junit.Assert.assertNotNull(strMap13);
        org.junit.Assert.assertNull(wildcardClass16);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNull(wildcardClass22);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "hi!" + "'", str25, "hi!");
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "" + "'", str27, "");
        org.junit.Assert.assertNotNull(strMap28);
        org.junit.Assert.assertNull(wildcardClass31);
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "" + "'", str33, "");
        org.junit.Assert.assertNotNull(strMap34);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertNotNull(strMap39);
        org.junit.Assert.assertNotNull(strMap40);
        org.junit.Assert.assertNotNull(slimTableFactory42);
    }

    @Test
    public void test18060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18060");
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory0 = new fitnesse.testsystems.slim.tables.SlimTableFactory();
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory1 = slimTableFactory0.copy();
        java.lang.String str3 = slimTableFactory0.makeTableType("hi!");
        java.util.Map<java.lang.String, java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable>> strMap4 = slimTableFactory0.tableTypes;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory5 = slimTableFactory0.copy();
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory6 = slimTableFactory5.copy();
        java.util.Map<java.lang.String, java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable>> strMap7 = slimTableFactory5.tableTypes;
        java.util.Map<java.lang.String, java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable>> strMap8 = slimTableFactory5.tableTypes;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory9 = slimTableFactory5.copy();
        java.lang.String str11 = slimTableFactory5.makeTableType("");
        java.lang.String str13 = slimTableFactory5.getFullTableName("");
        java.util.Map<java.lang.String, java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable>> strMap14 = slimTableFactory5.tableTypes;
        java.lang.String str16 = slimTableFactory5.getFullTableName("hi!");
        org.junit.Assert.assertNotNull(slimTableFactory1);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertNotNull(strMap4);
        org.junit.Assert.assertNotNull(slimTableFactory5);
        org.junit.Assert.assertNotNull(slimTableFactory6);
        org.junit.Assert.assertNotNull(strMap7);
        org.junit.Assert.assertNotNull(strMap8);
        org.junit.Assert.assertNotNull(slimTableFactory9);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNotNull(strMap14);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
    }

    @Test
    public void test18061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18061");
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory0 = new fitnesse.testsystems.slim.tables.SlimTableFactory();
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory1 = new fitnesse.testsystems.slim.tables.SlimTableFactory();
        java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable> wildcardClass3 = slimTableFactory1.getTableType("");
        java.lang.String str5 = slimTableFactory1.getFullTableName("");
        java.util.Map<java.lang.String, java.lang.String> strMap6 = slimTableFactory1.tableTypeArrays;
        slimTableFactory0.tableTypeArrays = strMap6;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory8 = slimTableFactory0.copy();
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory9 = slimTableFactory8.copy();
        java.util.Map<java.lang.String, java.lang.String> strMap10 = slimTableFactory9.tableTypeArrays;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory11 = new fitnesse.testsystems.slim.tables.SlimTableFactory();
        java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable> wildcardClass13 = slimTableFactory11.getTableType("");
        java.lang.String str15 = slimTableFactory11.getFullTableName("");
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory16 = slimTableFactory11.copy();
        boolean boolean18 = slimTableFactory11.hasColon("");
        java.util.Map<java.lang.String, java.lang.String> strMap19 = slimTableFactory11.tableTypeArrays;
        slimTableFactory9.tableTypeArrays = strMap19;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory21 = slimTableFactory9.copy();
        java.lang.String str23 = slimTableFactory21.makeTableType("hi!");
        boolean boolean25 = slimTableFactory21.hasColon("hi!");
        java.lang.String str27 = slimTableFactory21.makeTableType("");
        org.junit.Assert.assertNull(wildcardClass3);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(strMap6);
        org.junit.Assert.assertNotNull(slimTableFactory8);
        org.junit.Assert.assertNotNull(slimTableFactory9);
        org.junit.Assert.assertNotNull(strMap10);
        org.junit.Assert.assertNull(wildcardClass13);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertNotNull(slimTableFactory16);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(strMap19);
        org.junit.Assert.assertNotNull(slimTableFactory21);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "hi!" + "'", str23, "hi!");
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "" + "'", str27, "");
    }

    @Test
    public void test18062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18062");
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory0 = new fitnesse.testsystems.slim.tables.SlimTableFactory();
        java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable> wildcardClass2 = slimTableFactory0.getTableType("");
        boolean boolean4 = slimTableFactory0.hasColon("");
        boolean boolean6 = slimTableFactory0.hasColon("hi!");
        java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable> wildcardClass8 = slimTableFactory0.getTableType("hi!");
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory9 = new fitnesse.testsystems.slim.tables.SlimTableFactory();
        java.lang.String str11 = slimTableFactory9.getFullTableName("hi!");
        java.lang.String str13 = slimTableFactory9.makeTableType("");
        java.util.Map<java.lang.String, java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable>> strMap14 = slimTableFactory9.tableTypes;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory15 = new fitnesse.testsystems.slim.tables.SlimTableFactory();
        java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable> wildcardClass17 = slimTableFactory15.getTableType("");
        java.lang.String str19 = slimTableFactory15.getFullTableName("");
        java.util.Map<java.lang.String, java.lang.String> strMap20 = slimTableFactory15.tableTypeArrays;
        slimTableFactory9.tableTypeArrays = strMap20;
        slimTableFactory0.tableTypeArrays = strMap20;
        boolean boolean24 = slimTableFactory0.hasColon("");
        java.lang.String str26 = slimTableFactory0.getFullTableName("hi!");
        java.lang.String str28 = slimTableFactory0.makeTableType("");
        java.util.Map<java.lang.String, java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable>> strMap29 = slimTableFactory0.tableTypes;
        java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable> wildcardClass31 = slimTableFactory0.getTableType("hi!");
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory32 = slimTableFactory0.copy();
        java.lang.String str34 = slimTableFactory0.makeTableType("hi!");
        org.junit.Assert.assertNull(wildcardClass2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(wildcardClass8);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNotNull(strMap14);
        org.junit.Assert.assertNull(wildcardClass17);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertNotNull(strMap20);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "hi!" + "'", str26, "hi!");
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "" + "'", str28, "");
        org.junit.Assert.assertNotNull(strMap29);
        org.junit.Assert.assertNull(wildcardClass31);
        org.junit.Assert.assertNotNull(slimTableFactory32);
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "hi!" + "'", str34, "hi!");
    }

    @Test
    public void test18063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18063");
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory0 = new fitnesse.testsystems.slim.tables.SlimTableFactory();
        java.lang.String str2 = slimTableFactory0.getFullTableName("hi!");
        java.util.Map<java.lang.String, java.lang.String> strMap3 = slimTableFactory0.tableTypeArrays;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory4 = new fitnesse.testsystems.slim.tables.SlimTableFactory();
        java.lang.String str6 = slimTableFactory4.getFullTableName("hi!");
        java.util.Map<java.lang.String, java.lang.String> strMap7 = slimTableFactory4.tableTypeArrays;
        slimTableFactory0.tableTypeArrays = strMap7;
        java.lang.String str10 = slimTableFactory0.makeTableType("");
        java.util.Map<java.lang.String, java.lang.String> strMap11 = slimTableFactory0.tableTypeArrays;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory12 = new fitnesse.testsystems.slim.tables.SlimTableFactory();
        java.lang.String str14 = slimTableFactory12.getFullTableName("hi!");
        java.util.Map<java.lang.String, java.lang.String> strMap15 = slimTableFactory12.tableTypeArrays;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory16 = slimTableFactory12.copy();
        java.util.Map<java.lang.String, java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable>> strMap17 = slimTableFactory16.tableTypes;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory18 = slimTableFactory16.copy();
        java.lang.String str20 = slimTableFactory18.getFullTableName("hi!");
        java.util.Map<java.lang.String, java.lang.String> strMap21 = slimTableFactory18.tableTypeArrays;
        slimTableFactory0.tableTypeArrays = strMap21;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory23 = new fitnesse.testsystems.slim.tables.SlimTableFactory();
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory24 = new fitnesse.testsystems.slim.tables.SlimTableFactory();
        java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable> wildcardClass26 = slimTableFactory24.getTableType("");
        java.lang.String str28 = slimTableFactory24.getFullTableName("");
        java.util.Map<java.lang.String, java.lang.String> strMap29 = slimTableFactory24.tableTypeArrays;
        slimTableFactory23.tableTypeArrays = strMap29;
        java.util.Map<java.lang.String, java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable>> strMap31 = slimTableFactory23.tableTypes;
        java.util.Map<java.lang.String, java.lang.String> strMap32 = slimTableFactory23.tableTypeArrays;
        slimTableFactory0.tableTypeArrays = strMap32;
        java.lang.String str35 = slimTableFactory0.makeTableType("hi!");
        java.util.Map<java.lang.String, java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable>> strMap36 = slimTableFactory0.tableTypes;
        java.util.Map<java.lang.String, java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable>> strMap37 = slimTableFactory0.tableTypes;
        fitnesse.testsystems.slim.Table table38 = null;
        fitnesse.testsystems.slim.SlimTestContext slimTestContext40 = null;
        // The following exception was thrown during execution in test generation
        try {
            fitnesse.testsystems.slim.tables.SlimTable slimTable41 = slimTableFactory0.makeSlimTable(table38, "", slimTestContext40);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!" + "'", str2, "hi!");
        org.junit.Assert.assertNotNull(strMap3);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertNotNull(strMap7);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNotNull(strMap11);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertNotNull(strMap15);
        org.junit.Assert.assertNotNull(slimTableFactory16);
        org.junit.Assert.assertNotNull(strMap17);
        org.junit.Assert.assertNotNull(slimTableFactory18);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "hi!" + "'", str20, "hi!");
        org.junit.Assert.assertNotNull(strMap21);
        org.junit.Assert.assertNull(wildcardClass26);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "" + "'", str28, "");
        org.junit.Assert.assertNotNull(strMap29);
        org.junit.Assert.assertNotNull(strMap31);
        org.junit.Assert.assertNotNull(strMap32);
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "hi!" + "'", str35, "hi!");
        org.junit.Assert.assertNotNull(strMap36);
        org.junit.Assert.assertNotNull(strMap37);
    }

    @Test
    public void test18064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18064");
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory0 = new fitnesse.testsystems.slim.tables.SlimTableFactory();
        java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable> wildcardClass2 = slimTableFactory0.getTableType("");
        java.lang.String str4 = slimTableFactory0.getFullTableName("");
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory5 = slimTableFactory0.copy();
        java.util.Map<java.lang.String, java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable>> strMap6 = slimTableFactory5.tableTypes;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory7 = slimTableFactory5.copy();
        boolean boolean9 = slimTableFactory7.hasColon("hi!");
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory10 = slimTableFactory7.copy();
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory11 = new fitnesse.testsystems.slim.tables.SlimTableFactory();
        java.lang.String str13 = slimTableFactory11.getFullTableName("hi!");
        java.util.Map<java.lang.String, java.lang.String> strMap14 = slimTableFactory11.tableTypeArrays;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory15 = new fitnesse.testsystems.slim.tables.SlimTableFactory();
        java.lang.String str17 = slimTableFactory15.getFullTableName("hi!");
        java.util.Map<java.lang.String, java.lang.String> strMap18 = slimTableFactory15.tableTypeArrays;
        slimTableFactory11.tableTypeArrays = strMap18;
        java.lang.String str21 = slimTableFactory11.getFullTableName("");
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory22 = new fitnesse.testsystems.slim.tables.SlimTableFactory();
        java.lang.String str24 = slimTableFactory22.getFullTableName("hi!");
        java.util.Map<java.lang.String, java.lang.String> strMap25 = slimTableFactory22.tableTypeArrays;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory26 = new fitnesse.testsystems.slim.tables.SlimTableFactory();
        java.lang.String str28 = slimTableFactory26.getFullTableName("hi!");
        java.util.Map<java.lang.String, java.lang.String> strMap29 = slimTableFactory26.tableTypeArrays;
        slimTableFactory22.tableTypeArrays = strMap29;
        slimTableFactory11.tableTypeArrays = strMap29;
        slimTableFactory10.tableTypeArrays = strMap29;
        java.lang.String str34 = slimTableFactory10.makeTableType("");
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory35 = slimTableFactory10.copy();
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory36 = slimTableFactory10.copy();
        org.junit.Assert.assertNull(wildcardClass2);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(slimTableFactory5);
        org.junit.Assert.assertNotNull(strMap6);
        org.junit.Assert.assertNotNull(slimTableFactory7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(slimTableFactory10);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertNotNull(strMap14);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
        org.junit.Assert.assertNotNull(strMap18);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "hi!" + "'", str24, "hi!");
        org.junit.Assert.assertNotNull(strMap25);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "hi!" + "'", str28, "hi!");
        org.junit.Assert.assertNotNull(strMap29);
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "" + "'", str34, "");
        org.junit.Assert.assertNotNull(slimTableFactory35);
        org.junit.Assert.assertNotNull(slimTableFactory36);
    }

    @Test
    public void test18065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18065");
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory0 = new fitnesse.testsystems.slim.tables.SlimTableFactory();
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory1 = slimTableFactory0.copy();
        java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable> wildcardClass3 = slimTableFactory1.getTableType("hi!");
        java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable> wildcardClass5 = slimTableFactory1.getTableType("hi!");
        boolean boolean7 = slimTableFactory1.hasColon("");
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory8 = slimTableFactory1.copy();
        java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable> wildcardClass10 = slimTableFactory8.getTableType("hi!");
        java.lang.String str12 = slimTableFactory8.getFullTableName("");
        java.util.Map<java.lang.String, java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable>> strMap13 = slimTableFactory8.tableTypes;
        java.util.Map<java.lang.String, java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable>> strMap14 = slimTableFactory8.tableTypes;
        java.util.Map<java.lang.String, java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable>> strMap15 = slimTableFactory8.tableTypes;
        org.junit.Assert.assertNotNull(slimTableFactory1);
        org.junit.Assert.assertNull(wildcardClass3);
        org.junit.Assert.assertNull(wildcardClass5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(slimTableFactory8);
        org.junit.Assert.assertNull(wildcardClass10);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertNotNull(strMap13);
        org.junit.Assert.assertNotNull(strMap14);
        org.junit.Assert.assertNotNull(strMap15);
    }

    @Test
    public void test18066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18066");
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory0 = new fitnesse.testsystems.slim.tables.SlimTableFactory();
        java.lang.String str2 = slimTableFactory0.getFullTableName("hi!");
        java.util.Map<java.lang.String, java.lang.String> strMap3 = slimTableFactory0.tableTypeArrays;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory4 = slimTableFactory0.copy();
        java.util.Map<java.lang.String, java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable>> strMap5 = slimTableFactory4.tableTypes;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory6 = slimTableFactory4.copy();
        java.lang.String str8 = slimTableFactory6.getFullTableName("hi!");
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory9 = slimTableFactory6.copy();
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory10 = slimTableFactory6.copy();
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory11 = slimTableFactory6.copy();
        java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable> wildcardClass13 = slimTableFactory6.getTableType("");
        java.lang.String str15 = slimTableFactory6.makeTableType("");
        java.util.Map<java.lang.String, java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable>> strMap16 = slimTableFactory6.tableTypes;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory17 = slimTableFactory6.copy();
        fitnesse.testsystems.slim.Table table18 = null;
        // The following exception was thrown during execution in test generation
        try {
            fitnesse.testsystems.slim.tables.SlimTable slimTable19 = slimTableFactory6.parseDefineTableTypeTable(table18);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!" + "'", str2, "hi!");
        org.junit.Assert.assertNotNull(strMap3);
        org.junit.Assert.assertNotNull(slimTableFactory4);
        org.junit.Assert.assertNotNull(strMap5);
        org.junit.Assert.assertNotNull(slimTableFactory6);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertNotNull(slimTableFactory9);
        org.junit.Assert.assertNotNull(slimTableFactory10);
        org.junit.Assert.assertNotNull(slimTableFactory11);
        org.junit.Assert.assertNull(wildcardClass13);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertNotNull(strMap16);
        org.junit.Assert.assertNotNull(slimTableFactory17);
    }

    @Test
    public void test18067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18067");
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory0 = new fitnesse.testsystems.slim.tables.SlimTableFactory();
        java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable> wildcardClass2 = slimTableFactory0.getTableType("");
        java.lang.String str4 = slimTableFactory0.getFullTableName("");
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory5 = slimTableFactory0.copy();
        boolean boolean7 = slimTableFactory0.hasColon("");
        java.util.Map<java.lang.String, java.lang.String> strMap8 = slimTableFactory0.tableTypeArrays;
        java.util.Map<java.lang.String, java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable>> strMap9 = slimTableFactory0.tableTypes;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory10 = slimTableFactory0.copy();
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory11 = new fitnesse.testsystems.slim.tables.SlimTableFactory();
        java.lang.String str13 = slimTableFactory11.getFullTableName("hi!");
        java.lang.String str15 = slimTableFactory11.makeTableType("");
        java.util.Map<java.lang.String, java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable>> strMap16 = slimTableFactory11.tableTypes;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory17 = new fitnesse.testsystems.slim.tables.SlimTableFactory();
        java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable> wildcardClass19 = slimTableFactory17.getTableType("");
        java.lang.String str21 = slimTableFactory17.getFullTableName("");
        java.util.Map<java.lang.String, java.lang.String> strMap22 = slimTableFactory17.tableTypeArrays;
        slimTableFactory11.tableTypeArrays = strMap22;
        slimTableFactory10.tableTypeArrays = strMap22;
        java.lang.String str26 = slimTableFactory10.makeTableType("");
        java.util.Map<java.lang.String, java.lang.String> strMap27 = slimTableFactory10.tableTypeArrays;
        boolean boolean29 = slimTableFactory10.hasColon("");
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory30 = new fitnesse.testsystems.slim.tables.SlimTableFactory();
        java.lang.String str32 = slimTableFactory30.getFullTableName("hi!");
        java.util.Map<java.lang.String, java.lang.String> strMap33 = slimTableFactory30.tableTypeArrays;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory34 = new fitnesse.testsystems.slim.tables.SlimTableFactory();
        java.lang.String str36 = slimTableFactory34.getFullTableName("hi!");
        java.util.Map<java.lang.String, java.lang.String> strMap37 = slimTableFactory34.tableTypeArrays;
        slimTableFactory30.tableTypeArrays = strMap37;
        java.lang.String str40 = slimTableFactory30.makeTableType("hi!");
        boolean boolean42 = slimTableFactory30.hasColon("");
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory43 = new fitnesse.testsystems.slim.tables.SlimTableFactory();
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory44 = slimTableFactory43.copy();
        java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable> wildcardClass46 = slimTableFactory44.getTableType("hi!");
        java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable> wildcardClass48 = slimTableFactory44.getTableType("hi!");
        boolean boolean50 = slimTableFactory44.hasColon("");
        java.util.Map<java.lang.String, java.lang.String> strMap51 = slimTableFactory44.tableTypeArrays;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory52 = slimTableFactory44.copy();
        java.lang.String str54 = slimTableFactory44.getFullTableName("");
        java.util.Map<java.lang.String, java.lang.String> strMap55 = slimTableFactory44.tableTypeArrays;
        slimTableFactory30.tableTypeArrays = strMap55;
        slimTableFactory10.tableTypeArrays = strMap55;
        java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable> wildcardClass59 = slimTableFactory10.getTableType("hi!");
        java.util.Map<java.lang.String, java.lang.String> strMap60 = slimTableFactory10.tableTypeArrays;
        java.util.Map<java.lang.String, java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable>> strMap61 = slimTableFactory10.tableTypes;
        java.lang.String str63 = slimTableFactory10.makeTableType("");
        java.lang.String str65 = slimTableFactory10.makeTableType("");
        org.junit.Assert.assertNull(wildcardClass2);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(slimTableFactory5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(strMap8);
        org.junit.Assert.assertNotNull(strMap9);
        org.junit.Assert.assertNotNull(slimTableFactory10);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertNotNull(strMap16);
        org.junit.Assert.assertNull(wildcardClass19);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertNotNull(strMap22);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "" + "'", str26, "");
        org.junit.Assert.assertNotNull(strMap27);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "hi!" + "'", str32, "hi!");
        org.junit.Assert.assertNotNull(strMap33);
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "hi!" + "'", str36, "hi!");
        org.junit.Assert.assertNotNull(strMap37);
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "hi!" + "'", str40, "hi!");
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertNotNull(slimTableFactory44);
        org.junit.Assert.assertNull(wildcardClass46);
        org.junit.Assert.assertNull(wildcardClass48);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
        org.junit.Assert.assertNotNull(strMap51);
        org.junit.Assert.assertNotNull(slimTableFactory52);
        org.junit.Assert.assertEquals("'" + str54 + "' != '" + "" + "'", str54, "");
        org.junit.Assert.assertNotNull(strMap55);
        org.junit.Assert.assertNull(wildcardClass59);
        org.junit.Assert.assertNotNull(strMap60);
        org.junit.Assert.assertNotNull(strMap61);
        org.junit.Assert.assertEquals("'" + str63 + "' != '" + "" + "'", str63, "");
        org.junit.Assert.assertEquals("'" + str65 + "' != '" + "" + "'", str65, "");
    }

    @Test
    public void test18068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18068");
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory0 = new fitnesse.testsystems.slim.tables.SlimTableFactory();
        java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable> wildcardClass2 = slimTableFactory0.getTableType("");
        java.lang.String str4 = slimTableFactory0.getFullTableName("");
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory5 = slimTableFactory0.copy();
        boolean boolean7 = slimTableFactory0.hasColon("");
        java.util.Map<java.lang.String, java.lang.String> strMap8 = slimTableFactory0.tableTypeArrays;
        java.util.Map<java.lang.String, java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable>> strMap9 = slimTableFactory0.tableTypes;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory10 = slimTableFactory0.copy();
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory11 = new fitnesse.testsystems.slim.tables.SlimTableFactory();
        java.lang.String str13 = slimTableFactory11.getFullTableName("hi!");
        java.lang.String str15 = slimTableFactory11.makeTableType("");
        java.util.Map<java.lang.String, java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable>> strMap16 = slimTableFactory11.tableTypes;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory17 = new fitnesse.testsystems.slim.tables.SlimTableFactory();
        java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable> wildcardClass19 = slimTableFactory17.getTableType("");
        java.lang.String str21 = slimTableFactory17.getFullTableName("");
        java.util.Map<java.lang.String, java.lang.String> strMap22 = slimTableFactory17.tableTypeArrays;
        slimTableFactory11.tableTypeArrays = strMap22;
        slimTableFactory10.tableTypeArrays = strMap22;
        java.lang.String str26 = slimTableFactory10.makeTableType("");
        java.util.Map<java.lang.String, java.lang.String> strMap27 = slimTableFactory10.tableTypeArrays;
        java.lang.String str29 = slimTableFactory10.getFullTableName("");
        java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable> wildcardClass31 = slimTableFactory10.getTableType("hi!");
        org.junit.Assert.assertNull(wildcardClass2);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(slimTableFactory5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(strMap8);
        org.junit.Assert.assertNotNull(strMap9);
        org.junit.Assert.assertNotNull(slimTableFactory10);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertNotNull(strMap16);
        org.junit.Assert.assertNull(wildcardClass19);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertNotNull(strMap22);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "" + "'", str26, "");
        org.junit.Assert.assertNotNull(strMap27);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "" + "'", str29, "");
        org.junit.Assert.assertNull(wildcardClass31);
    }

    @Test
    public void test18069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18069");
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory0 = new fitnesse.testsystems.slim.tables.SlimTableFactory();
        java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable> wildcardClass2 = slimTableFactory0.getTableType("");
        boolean boolean4 = slimTableFactory0.hasColon("");
        java.util.Map<java.lang.String, java.lang.String> strMap5 = slimTableFactory0.tableTypeArrays;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory6 = slimTableFactory0.copy();
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory7 = slimTableFactory0.copy();
        java.util.Map<java.lang.String, java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable>> strMap8 = slimTableFactory0.tableTypes;
        java.util.Map<java.lang.String, java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable>> strMap9 = slimTableFactory0.tableTypes;
        java.lang.String str11 = slimTableFactory0.getFullTableName("");
        java.lang.String str13 = slimTableFactory0.makeTableType("hi!");
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory14 = slimTableFactory0.copy();
        java.lang.String str16 = slimTableFactory0.getFullTableName("");
        java.lang.String str18 = slimTableFactory0.makeTableType("hi!");
        org.junit.Assert.assertNull(wildcardClass2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(strMap5);
        org.junit.Assert.assertNotNull(slimTableFactory6);
        org.junit.Assert.assertNotNull(slimTableFactory7);
        org.junit.Assert.assertNotNull(strMap8);
        org.junit.Assert.assertNotNull(strMap9);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertNotNull(slimTableFactory14);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!" + "'", str18, "hi!");
    }

    @Test
    public void test18070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18070");
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory0 = new fitnesse.testsystems.slim.tables.SlimTableFactory();
        java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable> wildcardClass2 = slimTableFactory0.getTableType("");
        java.lang.String str4 = slimTableFactory0.getFullTableName("");
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory5 = slimTableFactory0.copy();
        java.util.Map<java.lang.String, java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable>> strMap6 = slimTableFactory5.tableTypes;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory7 = slimTableFactory5.copy();
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory8 = slimTableFactory5.copy();
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory9 = new fitnesse.testsystems.slim.tables.SlimTableFactory();
        java.lang.String str11 = slimTableFactory9.getFullTableName("hi!");
        java.util.Map<java.lang.String, java.lang.String> strMap12 = slimTableFactory9.tableTypeArrays;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory13 = slimTableFactory9.copy();
        java.util.Map<java.lang.String, java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable>> strMap14 = slimTableFactory13.tableTypes;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory15 = slimTableFactory13.copy();
        java.lang.String str17 = slimTableFactory15.getFullTableName("hi!");
        java.util.Map<java.lang.String, java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable>> strMap18 = slimTableFactory15.tableTypes;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory19 = new fitnesse.testsystems.slim.tables.SlimTableFactory();
        java.lang.String str21 = slimTableFactory19.getFullTableName("hi!");
        java.util.Map<java.lang.String, java.lang.String> strMap22 = slimTableFactory19.tableTypeArrays;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory23 = new fitnesse.testsystems.slim.tables.SlimTableFactory();
        java.lang.String str25 = slimTableFactory23.getFullTableName("hi!");
        java.util.Map<java.lang.String, java.lang.String> strMap26 = slimTableFactory23.tableTypeArrays;
        slimTableFactory19.tableTypeArrays = strMap26;
        java.lang.String str29 = slimTableFactory19.getFullTableName("");
        java.util.Map<java.lang.String, java.lang.String> strMap30 = slimTableFactory19.tableTypeArrays;
        java.util.Map<java.lang.String, java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable>> strMap31 = slimTableFactory19.tableTypes;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory32 = new fitnesse.testsystems.slim.tables.SlimTableFactory();
        java.lang.String str34 = slimTableFactory32.getFullTableName("hi!");
        java.lang.String str36 = slimTableFactory32.makeTableType("");
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory37 = slimTableFactory32.copy();
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory38 = slimTableFactory37.copy();
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory39 = new fitnesse.testsystems.slim.tables.SlimTableFactory();
        java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable> wildcardClass41 = slimTableFactory39.getTableType("");
        java.lang.String str43 = slimTableFactory39.getFullTableName("");
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory44 = slimTableFactory39.copy();
        boolean boolean46 = slimTableFactory39.hasColon("");
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory47 = slimTableFactory39.copy();
        java.util.Map<java.lang.String, java.lang.String> strMap48 = slimTableFactory47.tableTypeArrays;
        slimTableFactory37.tableTypeArrays = strMap48;
        slimTableFactory19.tableTypeArrays = strMap48;
        slimTableFactory15.tableTypeArrays = strMap48;
        slimTableFactory5.tableTypeArrays = strMap48;
        java.util.Map<java.lang.String, java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable>> strMap53 = slimTableFactory5.tableTypes;
        java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable> wildcardClass55 = slimTableFactory5.getTableType("hi!");
        java.util.Map<java.lang.String, java.lang.String> strMap56 = slimTableFactory5.tableTypeArrays;
        java.lang.Class<?> wildcardClass57 = strMap56.getClass();
        org.junit.Assert.assertNull(wildcardClass2);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(slimTableFactory5);
        org.junit.Assert.assertNotNull(strMap6);
        org.junit.Assert.assertNotNull(slimTableFactory7);
        org.junit.Assert.assertNotNull(slimTableFactory8);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertNotNull(strMap12);
        org.junit.Assert.assertNotNull(slimTableFactory13);
        org.junit.Assert.assertNotNull(strMap14);
        org.junit.Assert.assertNotNull(slimTableFactory15);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
        org.junit.Assert.assertNotNull(strMap18);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "hi!" + "'", str21, "hi!");
        org.junit.Assert.assertNotNull(strMap22);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "hi!" + "'", str25, "hi!");
        org.junit.Assert.assertNotNull(strMap26);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "" + "'", str29, "");
        org.junit.Assert.assertNotNull(strMap30);
        org.junit.Assert.assertNotNull(strMap31);
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "hi!" + "'", str34, "hi!");
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "" + "'", str36, "");
        org.junit.Assert.assertNotNull(slimTableFactory37);
        org.junit.Assert.assertNotNull(slimTableFactory38);
        org.junit.Assert.assertNull(wildcardClass41);
        org.junit.Assert.assertEquals("'" + str43 + "' != '" + "" + "'", str43, "");
        org.junit.Assert.assertNotNull(slimTableFactory44);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertNotNull(slimTableFactory47);
        org.junit.Assert.assertNotNull(strMap48);
        org.junit.Assert.assertNotNull(strMap53);
        org.junit.Assert.assertNull(wildcardClass55);
        org.junit.Assert.assertNotNull(strMap56);
        org.junit.Assert.assertNotNull(wildcardClass57);
    }

    @Test
    public void test18071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18071");
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory0 = new fitnesse.testsystems.slim.tables.SlimTableFactory();
        java.lang.String str2 = slimTableFactory0.getFullTableName("hi!");
        java.util.Map<java.lang.String, java.lang.String> strMap3 = slimTableFactory0.tableTypeArrays;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory4 = slimTableFactory0.copy();
        java.util.Map<java.lang.String, java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable>> strMap5 = slimTableFactory4.tableTypes;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory6 = slimTableFactory4.copy();
        java.lang.String str8 = slimTableFactory6.getFullTableName("hi!");
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory9 = slimTableFactory6.copy();
        java.util.Map<java.lang.String, java.lang.String> strMap10 = slimTableFactory6.tableTypeArrays;
        java.lang.String str12 = slimTableFactory6.makeTableType("");
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory13 = slimTableFactory6.copy();
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory14 = slimTableFactory6.copy();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!" + "'", str2, "hi!");
        org.junit.Assert.assertNotNull(strMap3);
        org.junit.Assert.assertNotNull(slimTableFactory4);
        org.junit.Assert.assertNotNull(strMap5);
        org.junit.Assert.assertNotNull(slimTableFactory6);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertNotNull(slimTableFactory9);
        org.junit.Assert.assertNotNull(strMap10);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertNotNull(slimTableFactory13);
        org.junit.Assert.assertNotNull(slimTableFactory14);
    }

    @Test
    public void test18072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18072");
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory0 = new fitnesse.testsystems.slim.tables.SlimTableFactory();
        java.lang.String str2 = slimTableFactory0.getFullTableName("hi!");
        java.lang.String str4 = slimTableFactory0.makeTableType("");
        java.util.Map<java.lang.String, java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable>> strMap5 = slimTableFactory0.tableTypes;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory6 = slimTableFactory0.copy();
        java.util.Map<java.lang.String, java.lang.String> strMap7 = slimTableFactory0.tableTypeArrays;
        java.lang.String str9 = slimTableFactory0.getFullTableName("hi!");
        java.util.Map<java.lang.String, java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable>> strMap10 = slimTableFactory0.tableTypes;
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!" + "'", str2, "hi!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(strMap5);
        org.junit.Assert.assertNotNull(slimTableFactory6);
        org.junit.Assert.assertNotNull(strMap7);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertNotNull(strMap10);
    }

    @Test
    public void test18073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18073");
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory0 = new fitnesse.testsystems.slim.tables.SlimTableFactory();
        java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable> wildcardClass2 = slimTableFactory0.getTableType("");
        java.lang.String str4 = slimTableFactory0.getFullTableName("");
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory5 = slimTableFactory0.copy();
        boolean boolean7 = slimTableFactory0.hasColon("");
        java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable> wildcardClass9 = slimTableFactory0.getTableType("");
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory10 = slimTableFactory0.copy();
        java.util.Map<java.lang.String, java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable>> strMap11 = slimTableFactory0.tableTypes;
        java.lang.String str13 = slimTableFactory0.getFullTableName("");
        boolean boolean15 = slimTableFactory0.hasColon("");
        java.lang.String str17 = slimTableFactory0.makeTableType("hi!");
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory18 = slimTableFactory0.copy();
        java.lang.String str20 = slimTableFactory18.getFullTableName("");
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory21 = slimTableFactory18.copy();
        fitnesse.testsystems.slim.Table table22 = null;
        fitnesse.testsystems.slim.SlimTestContext slimTestContext24 = null;
        // The following exception was thrown during execution in test generation
        try {
            fitnesse.testsystems.slim.tables.SlimTable slimTable25 = slimTableFactory18.makeSlimTable(table22, "hi!", slimTestContext24);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(wildcardClass2);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(slimTableFactory5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(wildcardClass9);
        org.junit.Assert.assertNotNull(slimTableFactory10);
        org.junit.Assert.assertNotNull(strMap11);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
        org.junit.Assert.assertNotNull(slimTableFactory18);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertNotNull(slimTableFactory21);
    }

    @Test
    public void test18074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18074");
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory0 = new fitnesse.testsystems.slim.tables.SlimTableFactory();
        java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable> wildcardClass2 = slimTableFactory0.getTableType("");
        java.lang.String str4 = slimTableFactory0.getFullTableName("");
        java.util.Map<java.lang.String, java.lang.String> strMap5 = slimTableFactory0.tableTypeArrays;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory6 = slimTableFactory0.copy();
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory7 = new fitnesse.testsystems.slim.tables.SlimTableFactory();
        java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable> wildcardClass9 = slimTableFactory7.getTableType("");
        java.lang.String str11 = slimTableFactory7.getFullTableName("");
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory12 = slimTableFactory7.copy();
        boolean boolean14 = slimTableFactory7.hasColon("");
        java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable> wildcardClass16 = slimTableFactory7.getTableType("");
        java.lang.String str18 = slimTableFactory7.makeTableType("");
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory19 = slimTableFactory7.copy();
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory20 = new fitnesse.testsystems.slim.tables.SlimTableFactory();
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory21 = new fitnesse.testsystems.slim.tables.SlimTableFactory();
        java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable> wildcardClass23 = slimTableFactory21.getTableType("");
        java.lang.String str25 = slimTableFactory21.getFullTableName("");
        java.util.Map<java.lang.String, java.lang.String> strMap26 = slimTableFactory21.tableTypeArrays;
        slimTableFactory20.tableTypeArrays = strMap26;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory28 = slimTableFactory20.copy();
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory29 = slimTableFactory28.copy();
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory30 = slimTableFactory28.copy();
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory31 = new fitnesse.testsystems.slim.tables.SlimTableFactory();
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory32 = slimTableFactory31.copy();
        java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable> wildcardClass34 = slimTableFactory32.getTableType("hi!");
        java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable> wildcardClass36 = slimTableFactory32.getTableType("hi!");
        boolean boolean38 = slimTableFactory32.hasColon("");
        java.util.Map<java.lang.String, java.lang.String> strMap39 = slimTableFactory32.tableTypeArrays;
        slimTableFactory30.tableTypeArrays = strMap39;
        slimTableFactory7.tableTypeArrays = strMap39;
        slimTableFactory6.tableTypeArrays = strMap39;
        java.lang.String str44 = slimTableFactory6.makeTableType("hi!");
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory45 = slimTableFactory6.copy();
        fitnesse.testsystems.slim.Table table46 = null;
        // The following exception was thrown during execution in test generation
        try {
            fitnesse.testsystems.slim.tables.SlimTable slimTable47 = slimTableFactory6.parseDefineTableTypeTable(table46);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(wildcardClass2);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(strMap5);
        org.junit.Assert.assertNotNull(slimTableFactory6);
        org.junit.Assert.assertNull(wildcardClass9);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNotNull(slimTableFactory12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNull(wildcardClass16);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertNotNull(slimTableFactory19);
        org.junit.Assert.assertNull(wildcardClass23);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "" + "'", str25, "");
        org.junit.Assert.assertNotNull(strMap26);
        org.junit.Assert.assertNotNull(slimTableFactory28);
        org.junit.Assert.assertNotNull(slimTableFactory29);
        org.junit.Assert.assertNotNull(slimTableFactory30);
        org.junit.Assert.assertNotNull(slimTableFactory32);
        org.junit.Assert.assertNull(wildcardClass34);
        org.junit.Assert.assertNull(wildcardClass36);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertNotNull(strMap39);
        org.junit.Assert.assertEquals("'" + str44 + "' != '" + "hi!" + "'", str44, "hi!");
        org.junit.Assert.assertNotNull(slimTableFactory45);
    }

    @Test
    public void test18075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18075");
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory0 = new fitnesse.testsystems.slim.tables.SlimTableFactory();
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory1 = slimTableFactory0.copy();
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory2 = slimTableFactory0.copy();
        boolean boolean4 = slimTableFactory2.hasColon("hi!");
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory5 = slimTableFactory2.copy();
        java.lang.String str7 = slimTableFactory2.getFullTableName("");
        fitnesse.testsystems.slim.Table table8 = null;
        // The following exception was thrown during execution in test generation
        try {
            fitnesse.testsystems.slim.tables.SlimTable slimTable9 = slimTableFactory2.parseDefineTableTypeTable(table8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(slimTableFactory1);
        org.junit.Assert.assertNotNull(slimTableFactory2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(slimTableFactory5);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
    }

    @Test
    public void test18076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18076");
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory0 = new fitnesse.testsystems.slim.tables.SlimTableFactory();
        java.lang.String str2 = slimTableFactory0.getFullTableName("hi!");
        java.util.Map<java.lang.String, java.lang.String> strMap3 = slimTableFactory0.tableTypeArrays;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory4 = new fitnesse.testsystems.slim.tables.SlimTableFactory();
        java.lang.String str6 = slimTableFactory4.getFullTableName("hi!");
        java.util.Map<java.lang.String, java.lang.String> strMap7 = slimTableFactory4.tableTypeArrays;
        slimTableFactory0.tableTypeArrays = strMap7;
        java.lang.String str10 = slimTableFactory0.makeTableType("");
        java.util.Map<java.lang.String, java.lang.String> strMap11 = slimTableFactory0.tableTypeArrays;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory12 = new fitnesse.testsystems.slim.tables.SlimTableFactory();
        java.lang.String str14 = slimTableFactory12.getFullTableName("hi!");
        java.util.Map<java.lang.String, java.lang.String> strMap15 = slimTableFactory12.tableTypeArrays;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory16 = slimTableFactory12.copy();
        java.util.Map<java.lang.String, java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable>> strMap17 = slimTableFactory16.tableTypes;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory18 = slimTableFactory16.copy();
        java.lang.String str20 = slimTableFactory18.getFullTableName("hi!");
        java.util.Map<java.lang.String, java.lang.String> strMap21 = slimTableFactory18.tableTypeArrays;
        slimTableFactory0.tableTypeArrays = strMap21;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory23 = new fitnesse.testsystems.slim.tables.SlimTableFactory();
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory24 = new fitnesse.testsystems.slim.tables.SlimTableFactory();
        java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable> wildcardClass26 = slimTableFactory24.getTableType("");
        java.lang.String str28 = slimTableFactory24.getFullTableName("");
        java.util.Map<java.lang.String, java.lang.String> strMap29 = slimTableFactory24.tableTypeArrays;
        slimTableFactory23.tableTypeArrays = strMap29;
        java.util.Map<java.lang.String, java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable>> strMap31 = slimTableFactory23.tableTypes;
        java.util.Map<java.lang.String, java.lang.String> strMap32 = slimTableFactory23.tableTypeArrays;
        slimTableFactory0.tableTypeArrays = strMap32;
        java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable> wildcardClass35 = slimTableFactory0.getTableType("hi!");
        boolean boolean37 = slimTableFactory0.hasColon("");
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory38 = new fitnesse.testsystems.slim.tables.SlimTableFactory();
        java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable> wildcardClass40 = slimTableFactory38.getTableType("");
        boolean boolean42 = slimTableFactory38.hasColon("");
        boolean boolean44 = slimTableFactory38.hasColon("hi!");
        java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable> wildcardClass46 = slimTableFactory38.getTableType("hi!");
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory47 = new fitnesse.testsystems.slim.tables.SlimTableFactory();
        java.lang.String str49 = slimTableFactory47.getFullTableName("hi!");
        java.lang.String str51 = slimTableFactory47.makeTableType("");
        java.util.Map<java.lang.String, java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable>> strMap52 = slimTableFactory47.tableTypes;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory53 = new fitnesse.testsystems.slim.tables.SlimTableFactory();
        java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable> wildcardClass55 = slimTableFactory53.getTableType("");
        java.lang.String str57 = slimTableFactory53.getFullTableName("");
        java.util.Map<java.lang.String, java.lang.String> strMap58 = slimTableFactory53.tableTypeArrays;
        slimTableFactory47.tableTypeArrays = strMap58;
        slimTableFactory38.tableTypeArrays = strMap58;
        boolean boolean62 = slimTableFactory38.hasColon("");
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory63 = slimTableFactory38.copy();
        java.lang.String str65 = slimTableFactory38.makeTableType("");
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory66 = slimTableFactory38.copy();
        boolean boolean68 = slimTableFactory66.hasColon("");
        java.util.Map<java.lang.String, java.lang.String> strMap69 = slimTableFactory66.tableTypeArrays;
        java.lang.String str71 = slimTableFactory66.getFullTableName("");
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory72 = slimTableFactory66.copy();
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory73 = new fitnesse.testsystems.slim.tables.SlimTableFactory();
        java.lang.String str75 = slimTableFactory73.getFullTableName("hi!");
        java.util.Map<java.lang.String, java.lang.String> strMap76 = slimTableFactory73.tableTypeArrays;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory77 = slimTableFactory73.copy();
        java.util.Map<java.lang.String, java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable>> strMap78 = slimTableFactory77.tableTypes;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory79 = slimTableFactory77.copy();
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory80 = slimTableFactory79.copy();
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory81 = slimTableFactory79.copy();
        boolean boolean83 = slimTableFactory79.hasColon("");
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory84 = slimTableFactory79.copy();
        java.util.Map<java.lang.String, java.lang.String> strMap85 = slimTableFactory84.tableTypeArrays;
        java.util.Map<java.lang.String, java.lang.String> strMap86 = slimTableFactory84.tableTypeArrays;
        java.util.Map<java.lang.String, java.lang.String> strMap87 = slimTableFactory84.tableTypeArrays;
        slimTableFactory66.tableTypeArrays = strMap87;
        slimTableFactory0.tableTypeArrays = strMap87;
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!" + "'", str2, "hi!");
        org.junit.Assert.assertNotNull(strMap3);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertNotNull(strMap7);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNotNull(strMap11);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertNotNull(strMap15);
        org.junit.Assert.assertNotNull(slimTableFactory16);
        org.junit.Assert.assertNotNull(strMap17);
        org.junit.Assert.assertNotNull(slimTableFactory18);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "hi!" + "'", str20, "hi!");
        org.junit.Assert.assertNotNull(strMap21);
        org.junit.Assert.assertNull(wildcardClass26);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "" + "'", str28, "");
        org.junit.Assert.assertNotNull(strMap29);
        org.junit.Assert.assertNotNull(strMap31);
        org.junit.Assert.assertNotNull(strMap32);
        org.junit.Assert.assertNull(wildcardClass35);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertNull(wildcardClass40);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertNull(wildcardClass46);
        org.junit.Assert.assertEquals("'" + str49 + "' != '" + "hi!" + "'", str49, "hi!");
        org.junit.Assert.assertEquals("'" + str51 + "' != '" + "" + "'", str51, "");
        org.junit.Assert.assertNotNull(strMap52);
        org.junit.Assert.assertNull(wildcardClass55);
        org.junit.Assert.assertEquals("'" + str57 + "' != '" + "" + "'", str57, "");
        org.junit.Assert.assertNotNull(strMap58);
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + false + "'", boolean62 == false);
        org.junit.Assert.assertNotNull(slimTableFactory63);
        org.junit.Assert.assertEquals("'" + str65 + "' != '" + "" + "'", str65, "");
        org.junit.Assert.assertNotNull(slimTableFactory66);
        org.junit.Assert.assertTrue("'" + boolean68 + "' != '" + false + "'", boolean68 == false);
        org.junit.Assert.assertNotNull(strMap69);
        org.junit.Assert.assertEquals("'" + str71 + "' != '" + "" + "'", str71, "");
        org.junit.Assert.assertNotNull(slimTableFactory72);
        org.junit.Assert.assertEquals("'" + str75 + "' != '" + "hi!" + "'", str75, "hi!");
        org.junit.Assert.assertNotNull(strMap76);
        org.junit.Assert.assertNotNull(slimTableFactory77);
        org.junit.Assert.assertNotNull(strMap78);
        org.junit.Assert.assertNotNull(slimTableFactory79);
        org.junit.Assert.assertNotNull(slimTableFactory80);
        org.junit.Assert.assertNotNull(slimTableFactory81);
        org.junit.Assert.assertTrue("'" + boolean83 + "' != '" + false + "'", boolean83 == false);
        org.junit.Assert.assertNotNull(slimTableFactory84);
        org.junit.Assert.assertNotNull(strMap85);
        org.junit.Assert.assertNotNull(strMap86);
        org.junit.Assert.assertNotNull(strMap87);
    }

    @Test
    public void test18077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18077");
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory0 = new fitnesse.testsystems.slim.tables.SlimTableFactory();
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory1 = new fitnesse.testsystems.slim.tables.SlimTableFactory();
        java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable> wildcardClass3 = slimTableFactory1.getTableType("");
        java.lang.String str5 = slimTableFactory1.getFullTableName("");
        java.util.Map<java.lang.String, java.lang.String> strMap6 = slimTableFactory1.tableTypeArrays;
        slimTableFactory0.tableTypeArrays = strMap6;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory8 = slimTableFactory0.copy();
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory9 = slimTableFactory8.copy();
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory10 = slimTableFactory8.copy();
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory11 = slimTableFactory8.copy();
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory12 = slimTableFactory11.copy();
        java.lang.String str14 = slimTableFactory12.makeTableType("hi!");
        boolean boolean16 = slimTableFactory12.hasColon("hi!");
        org.junit.Assert.assertNull(wildcardClass3);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(strMap6);
        org.junit.Assert.assertNotNull(slimTableFactory8);
        org.junit.Assert.assertNotNull(slimTableFactory9);
        org.junit.Assert.assertNotNull(slimTableFactory10);
        org.junit.Assert.assertNotNull(slimTableFactory11);
        org.junit.Assert.assertNotNull(slimTableFactory12);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test18078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18078");
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory0 = new fitnesse.testsystems.slim.tables.SlimTableFactory();
        java.lang.String str2 = slimTableFactory0.makeTableType("");
        java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable> wildcardClass4 = slimTableFactory0.getTableType("");
        java.lang.String str6 = slimTableFactory0.getFullTableName("");
        java.util.Map<java.lang.String, java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable>> strMap7 = slimTableFactory0.tableTypes;
        java.util.Map<java.lang.String, java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable>> strMap8 = slimTableFactory0.tableTypes;
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertNull(wildcardClass4);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(strMap7);
        org.junit.Assert.assertNotNull(strMap8);
    }

    @Test
    public void test18079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18079");
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory0 = new fitnesse.testsystems.slim.tables.SlimTableFactory();
        java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable> wildcardClass2 = slimTableFactory0.getTableType("");
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory3 = slimTableFactory0.copy();
        java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable> wildcardClass5 = slimTableFactory0.getTableType("");
        java.lang.String str7 = slimTableFactory0.getFullTableName("hi!");
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory8 = new fitnesse.testsystems.slim.tables.SlimTableFactory();
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory9 = slimTableFactory8.copy();
        java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable> wildcardClass11 = slimTableFactory9.getTableType("hi!");
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory12 = slimTableFactory9.copy();
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory13 = new fitnesse.testsystems.slim.tables.SlimTableFactory();
        java.lang.String str15 = slimTableFactory13.getFullTableName("hi!");
        java.util.Map<java.lang.String, java.lang.String> strMap16 = slimTableFactory13.tableTypeArrays;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory17 = slimTableFactory13.copy();
        boolean boolean19 = slimTableFactory13.hasColon("hi!");
        java.util.Map<java.lang.String, java.lang.String> strMap20 = slimTableFactory13.tableTypeArrays;
        java.util.Map<java.lang.String, java.lang.String> strMap21 = slimTableFactory13.tableTypeArrays;
        java.util.Map<java.lang.String, java.lang.String> strMap22 = slimTableFactory13.tableTypeArrays;
        java.util.Map<java.lang.String, java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable>> strMap23 = slimTableFactory13.tableTypes;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory24 = slimTableFactory13.copy();
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory25 = new fitnesse.testsystems.slim.tables.SlimTableFactory();
        java.lang.String str27 = slimTableFactory25.getFullTableName("hi!");
        java.util.Map<java.lang.String, java.lang.String> strMap28 = slimTableFactory25.tableTypeArrays;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory29 = new fitnesse.testsystems.slim.tables.SlimTableFactory();
        java.lang.String str31 = slimTableFactory29.getFullTableName("hi!");
        java.util.Map<java.lang.String, java.lang.String> strMap32 = slimTableFactory29.tableTypeArrays;
        slimTableFactory25.tableTypeArrays = strMap32;
        java.lang.String str35 = slimTableFactory25.makeTableType("");
        java.util.Map<java.lang.String, java.lang.String> strMap36 = slimTableFactory25.tableTypeArrays;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory37 = new fitnesse.testsystems.slim.tables.SlimTableFactory();
        java.lang.String str39 = slimTableFactory37.getFullTableName("hi!");
        java.util.Map<java.lang.String, java.lang.String> strMap40 = slimTableFactory37.tableTypeArrays;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory41 = slimTableFactory37.copy();
        java.util.Map<java.lang.String, java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable>> strMap42 = slimTableFactory41.tableTypes;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory43 = slimTableFactory41.copy();
        java.lang.String str45 = slimTableFactory43.getFullTableName("hi!");
        java.util.Map<java.lang.String, java.lang.String> strMap46 = slimTableFactory43.tableTypeArrays;
        slimTableFactory25.tableTypeArrays = strMap46;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory48 = new fitnesse.testsystems.slim.tables.SlimTableFactory();
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory49 = new fitnesse.testsystems.slim.tables.SlimTableFactory();
        java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable> wildcardClass51 = slimTableFactory49.getTableType("");
        java.lang.String str53 = slimTableFactory49.getFullTableName("");
        java.util.Map<java.lang.String, java.lang.String> strMap54 = slimTableFactory49.tableTypeArrays;
        slimTableFactory48.tableTypeArrays = strMap54;
        java.util.Map<java.lang.String, java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable>> strMap56 = slimTableFactory48.tableTypes;
        java.util.Map<java.lang.String, java.lang.String> strMap57 = slimTableFactory48.tableTypeArrays;
        slimTableFactory25.tableTypeArrays = strMap57;
        java.util.Map<java.lang.String, java.lang.String> strMap59 = slimTableFactory25.tableTypeArrays;
        slimTableFactory24.tableTypeArrays = strMap59;
        slimTableFactory9.tableTypeArrays = strMap59;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory62 = new fitnesse.testsystems.slim.tables.SlimTableFactory();
        java.lang.String str64 = slimTableFactory62.getFullTableName("hi!");
        java.util.Map<java.lang.String, java.lang.String> strMap65 = slimTableFactory62.tableTypeArrays;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory66 = new fitnesse.testsystems.slim.tables.SlimTableFactory();
        java.lang.String str68 = slimTableFactory66.getFullTableName("hi!");
        java.util.Map<java.lang.String, java.lang.String> strMap69 = slimTableFactory66.tableTypeArrays;
        slimTableFactory62.tableTypeArrays = strMap69;
        java.lang.String str72 = slimTableFactory62.getFullTableName("");
        boolean boolean74 = slimTableFactory62.hasColon("hi!");
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory75 = new fitnesse.testsystems.slim.tables.SlimTableFactory();
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory76 = new fitnesse.testsystems.slim.tables.SlimTableFactory();
        java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable> wildcardClass78 = slimTableFactory76.getTableType("");
        java.lang.String str80 = slimTableFactory76.getFullTableName("");
        java.util.Map<java.lang.String, java.lang.String> strMap81 = slimTableFactory76.tableTypeArrays;
        slimTableFactory75.tableTypeArrays = strMap81;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory83 = slimTableFactory75.copy();
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory84 = slimTableFactory75.copy();
        java.util.Map<java.lang.String, java.lang.String> strMap85 = slimTableFactory84.tableTypeArrays;
        slimTableFactory62.tableTypeArrays = strMap85;
        slimTableFactory9.tableTypeArrays = strMap85;
        slimTableFactory0.tableTypeArrays = strMap85;
        boolean boolean90 = slimTableFactory0.hasColon("hi!");
        java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable> wildcardClass92 = slimTableFactory0.getTableType("");
        org.junit.Assert.assertNull(wildcardClass2);
        org.junit.Assert.assertNotNull(slimTableFactory3);
        org.junit.Assert.assertNull(wildcardClass5);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertNotNull(slimTableFactory9);
        org.junit.Assert.assertNull(wildcardClass11);
        org.junit.Assert.assertNotNull(slimTableFactory12);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertNotNull(strMap16);
        org.junit.Assert.assertNotNull(slimTableFactory17);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(strMap20);
        org.junit.Assert.assertNotNull(strMap21);
        org.junit.Assert.assertNotNull(strMap22);
        org.junit.Assert.assertNotNull(strMap23);
        org.junit.Assert.assertNotNull(slimTableFactory24);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "hi!" + "'", str27, "hi!");
        org.junit.Assert.assertNotNull(strMap28);
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "hi!" + "'", str31, "hi!");
        org.junit.Assert.assertNotNull(strMap32);
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "" + "'", str35, "");
        org.junit.Assert.assertNotNull(strMap36);
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "hi!" + "'", str39, "hi!");
        org.junit.Assert.assertNotNull(strMap40);
        org.junit.Assert.assertNotNull(slimTableFactory41);
        org.junit.Assert.assertNotNull(strMap42);
        org.junit.Assert.assertNotNull(slimTableFactory43);
        org.junit.Assert.assertEquals("'" + str45 + "' != '" + "hi!" + "'", str45, "hi!");
        org.junit.Assert.assertNotNull(strMap46);
        org.junit.Assert.assertNull(wildcardClass51);
        org.junit.Assert.assertEquals("'" + str53 + "' != '" + "" + "'", str53, "");
        org.junit.Assert.assertNotNull(strMap54);
        org.junit.Assert.assertNotNull(strMap56);
        org.junit.Assert.assertNotNull(strMap57);
        org.junit.Assert.assertNotNull(strMap59);
        org.junit.Assert.assertEquals("'" + str64 + "' != '" + "hi!" + "'", str64, "hi!");
        org.junit.Assert.assertNotNull(strMap65);
        org.junit.Assert.assertEquals("'" + str68 + "' != '" + "hi!" + "'", str68, "hi!");
        org.junit.Assert.assertNotNull(strMap69);
        org.junit.Assert.assertEquals("'" + str72 + "' != '" + "" + "'", str72, "");
        org.junit.Assert.assertTrue("'" + boolean74 + "' != '" + false + "'", boolean74 == false);
        org.junit.Assert.assertNull(wildcardClass78);
        org.junit.Assert.assertEquals("'" + str80 + "' != '" + "" + "'", str80, "");
        org.junit.Assert.assertNotNull(strMap81);
        org.junit.Assert.assertNotNull(slimTableFactory83);
        org.junit.Assert.assertNotNull(slimTableFactory84);
        org.junit.Assert.assertNotNull(strMap85);
        org.junit.Assert.assertTrue("'" + boolean90 + "' != '" + false + "'", boolean90 == false);
        org.junit.Assert.assertNull(wildcardClass92);
    }

    @Test
    public void test18080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18080");
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory0 = new fitnesse.testsystems.slim.tables.SlimTableFactory();
        java.lang.String str2 = slimTableFactory0.getFullTableName("hi!");
        java.lang.String str4 = slimTableFactory0.makeTableType("");
        java.util.Map<java.lang.String, java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable>> strMap5 = slimTableFactory0.tableTypes;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory6 = slimTableFactory0.copy();
        java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable> wildcardClass8 = slimTableFactory0.getTableType("hi!");
        java.util.Map<java.lang.String, java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable>> strMap9 = slimTableFactory0.tableTypes;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory10 = slimTableFactory0.copy();
        java.util.Map<java.lang.String, java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable>> strMap11 = slimTableFactory10.tableTypes;
        java.util.Map<java.lang.String, java.lang.String> strMap12 = slimTableFactory10.tableTypeArrays;
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!" + "'", str2, "hi!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(strMap5);
        org.junit.Assert.assertNotNull(slimTableFactory6);
        org.junit.Assert.assertNull(wildcardClass8);
        org.junit.Assert.assertNotNull(strMap9);
        org.junit.Assert.assertNotNull(slimTableFactory10);
        org.junit.Assert.assertNotNull(strMap11);
        org.junit.Assert.assertNotNull(strMap12);
    }

    @Test
    public void test18081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18081");
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory0 = new fitnesse.testsystems.slim.tables.SlimTableFactory();
        java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable> wildcardClass2 = slimTableFactory0.getTableType("");
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory3 = new fitnesse.testsystems.slim.tables.SlimTableFactory();
        java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable> wildcardClass5 = slimTableFactory3.getTableType("");
        java.lang.String str7 = slimTableFactory3.getFullTableName("");
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory8 = slimTableFactory3.copy();
        boolean boolean10 = slimTableFactory3.hasColon("");
        java.util.Map<java.lang.String, java.lang.String> strMap11 = slimTableFactory3.tableTypeArrays;
        java.util.Map<java.lang.String, java.lang.String> strMap12 = slimTableFactory3.tableTypeArrays;
        slimTableFactory0.tableTypeArrays = strMap12;
        boolean boolean15 = slimTableFactory0.hasColon("hi!");
        java.util.Map<java.lang.String, java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable>> strMap16 = slimTableFactory0.tableTypes;
        boolean boolean18 = slimTableFactory0.hasColon("");
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory19 = slimTableFactory0.copy();
        java.lang.String str21 = slimTableFactory19.getFullTableName("hi!");
        java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable> wildcardClass23 = slimTableFactory19.getTableType("hi!");
        java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable> wildcardClass25 = slimTableFactory19.getTableType("hi!");
        java.lang.String str27 = slimTableFactory19.getFullTableName("hi!");
        fitnesse.testsystems.slim.Table table28 = null;
        // The following exception was thrown during execution in test generation
        try {
            fitnesse.testsystems.slim.tables.SlimTable slimTable29 = slimTableFactory19.parseDefineTableTypeTable(table28);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(wildcardClass2);
        org.junit.Assert.assertNull(wildcardClass5);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNotNull(slimTableFactory8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(strMap11);
        org.junit.Assert.assertNotNull(strMap12);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(strMap16);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(slimTableFactory19);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "hi!" + "'", str21, "hi!");
        org.junit.Assert.assertNull(wildcardClass23);
        org.junit.Assert.assertNull(wildcardClass25);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "hi!" + "'", str27, "hi!");
    }

    @Test
    public void test18082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18082");
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory0 = new fitnesse.testsystems.slim.tables.SlimTableFactory();
        java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable> wildcardClass2 = slimTableFactory0.getTableType("");
        java.lang.String str4 = slimTableFactory0.getFullTableName("");
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory5 = slimTableFactory0.copy();
        java.lang.String str7 = slimTableFactory0.makeTableType("hi!");
        java.util.Map<java.lang.String, java.lang.String> strMap8 = slimTableFactory0.tableTypeArrays;
        java.util.Map<java.lang.String, java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable>> strMap9 = slimTableFactory0.tableTypes;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory10 = slimTableFactory0.copy();
        java.lang.String str12 = slimTableFactory10.makeTableType("hi!");
        java.lang.String str14 = slimTableFactory10.getFullTableName("");
        java.lang.String str16 = slimTableFactory10.getFullTableName("");
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory17 = slimTableFactory10.copy();
        java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable> wildcardClass19 = slimTableFactory10.getTableType("");
        java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable> wildcardClass21 = slimTableFactory10.getTableType("hi!");
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory22 = new fitnesse.testsystems.slim.tables.SlimTableFactory();
        java.lang.String str24 = slimTableFactory22.getFullTableName("hi!");
        java.util.Map<java.lang.String, java.lang.String> strMap25 = slimTableFactory22.tableTypeArrays;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory26 = slimTableFactory22.copy();
        java.util.Map<java.lang.String, java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable>> strMap27 = slimTableFactory26.tableTypes;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory28 = slimTableFactory26.copy();
        java.lang.String str30 = slimTableFactory28.getFullTableName("hi!");
        java.lang.String str32 = slimTableFactory28.makeTableType("");
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory33 = slimTableFactory28.copy();
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory34 = new fitnesse.testsystems.slim.tables.SlimTableFactory();
        java.lang.String str36 = slimTableFactory34.getFullTableName("hi!");
        java.util.Map<java.lang.String, java.lang.String> strMap37 = slimTableFactory34.tableTypeArrays;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory38 = new fitnesse.testsystems.slim.tables.SlimTableFactory();
        java.lang.String str40 = slimTableFactory38.getFullTableName("hi!");
        java.util.Map<java.lang.String, java.lang.String> strMap41 = slimTableFactory38.tableTypeArrays;
        slimTableFactory34.tableTypeArrays = strMap41;
        java.lang.String str44 = slimTableFactory34.makeTableType("");
        java.util.Map<java.lang.String, java.lang.String> strMap45 = slimTableFactory34.tableTypeArrays;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory46 = new fitnesse.testsystems.slim.tables.SlimTableFactory();
        java.lang.String str48 = slimTableFactory46.getFullTableName("hi!");
        java.util.Map<java.lang.String, java.lang.String> strMap49 = slimTableFactory46.tableTypeArrays;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory50 = slimTableFactory46.copy();
        java.util.Map<java.lang.String, java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable>> strMap51 = slimTableFactory50.tableTypes;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory52 = slimTableFactory50.copy();
        java.lang.String str54 = slimTableFactory52.getFullTableName("hi!");
        java.util.Map<java.lang.String, java.lang.String> strMap55 = slimTableFactory52.tableTypeArrays;
        slimTableFactory34.tableTypeArrays = strMap55;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory57 = new fitnesse.testsystems.slim.tables.SlimTableFactory();
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory58 = new fitnesse.testsystems.slim.tables.SlimTableFactory();
        java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable> wildcardClass60 = slimTableFactory58.getTableType("");
        java.lang.String str62 = slimTableFactory58.getFullTableName("");
        java.util.Map<java.lang.String, java.lang.String> strMap63 = slimTableFactory58.tableTypeArrays;
        slimTableFactory57.tableTypeArrays = strMap63;
        java.util.Map<java.lang.String, java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable>> strMap65 = slimTableFactory57.tableTypes;
        java.util.Map<java.lang.String, java.lang.String> strMap66 = slimTableFactory57.tableTypeArrays;
        slimTableFactory34.tableTypeArrays = strMap66;
        java.util.Map<java.lang.String, java.lang.String> strMap68 = slimTableFactory34.tableTypeArrays;
        slimTableFactory33.tableTypeArrays = strMap68;
        slimTableFactory10.tableTypeArrays = strMap68;
        java.util.Map<java.lang.String, java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable>> strMap71 = slimTableFactory10.tableTypes;
        boolean boolean73 = slimTableFactory10.hasColon("");
        org.junit.Assert.assertNull(wildcardClass2);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(slimTableFactory5);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertNotNull(strMap8);
        org.junit.Assert.assertNotNull(strMap9);
        org.junit.Assert.assertNotNull(slimTableFactory10);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertNotNull(slimTableFactory17);
        org.junit.Assert.assertNull(wildcardClass19);
        org.junit.Assert.assertNull(wildcardClass21);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "hi!" + "'", str24, "hi!");
        org.junit.Assert.assertNotNull(strMap25);
        org.junit.Assert.assertNotNull(slimTableFactory26);
        org.junit.Assert.assertNotNull(strMap27);
        org.junit.Assert.assertNotNull(slimTableFactory28);
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "hi!" + "'", str30, "hi!");
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "" + "'", str32, "");
        org.junit.Assert.assertNotNull(slimTableFactory33);
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "hi!" + "'", str36, "hi!");
        org.junit.Assert.assertNotNull(strMap37);
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "hi!" + "'", str40, "hi!");
        org.junit.Assert.assertNotNull(strMap41);
        org.junit.Assert.assertEquals("'" + str44 + "' != '" + "" + "'", str44, "");
        org.junit.Assert.assertNotNull(strMap45);
        org.junit.Assert.assertEquals("'" + str48 + "' != '" + "hi!" + "'", str48, "hi!");
        org.junit.Assert.assertNotNull(strMap49);
        org.junit.Assert.assertNotNull(slimTableFactory50);
        org.junit.Assert.assertNotNull(strMap51);
        org.junit.Assert.assertNotNull(slimTableFactory52);
        org.junit.Assert.assertEquals("'" + str54 + "' != '" + "hi!" + "'", str54, "hi!");
        org.junit.Assert.assertNotNull(strMap55);
        org.junit.Assert.assertNull(wildcardClass60);
        org.junit.Assert.assertEquals("'" + str62 + "' != '" + "" + "'", str62, "");
        org.junit.Assert.assertNotNull(strMap63);
        org.junit.Assert.assertNotNull(strMap65);
        org.junit.Assert.assertNotNull(strMap66);
        org.junit.Assert.assertNotNull(strMap68);
        org.junit.Assert.assertNotNull(strMap71);
        org.junit.Assert.assertTrue("'" + boolean73 + "' != '" + false + "'", boolean73 == false);
    }

    @Test
    public void test18083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18083");
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory0 = new fitnesse.testsystems.slim.tables.SlimTableFactory();
        java.lang.String str2 = slimTableFactory0.getFullTableName("hi!");
        java.lang.String str4 = slimTableFactory0.makeTableType("");
        java.util.Map<java.lang.String, java.lang.String> strMap5 = null;
        slimTableFactory0.tableTypeArrays = strMap5;
        boolean boolean8 = slimTableFactory0.hasColon("hi!");
        boolean boolean10 = slimTableFactory0.hasColon("hi!");
        java.util.Map<java.lang.String, java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable>> strMap11 = slimTableFactory0.tableTypes;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str13 = slimTableFactory0.getFullTableName("");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!" + "'", str2, "hi!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(strMap11);
    }

    @Test
    public void test18084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18084");
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory0 = new fitnesse.testsystems.slim.tables.SlimTableFactory();
        java.lang.String str2 = slimTableFactory0.getFullTableName("hi!");
        java.util.Map<java.lang.String, java.lang.String> strMap3 = slimTableFactory0.tableTypeArrays;
        java.lang.String str5 = slimTableFactory0.makeTableType("");
        java.util.Map<java.lang.String, java.lang.String> strMap6 = slimTableFactory0.tableTypeArrays;
        java.util.Map<java.lang.String, java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable>> strMap7 = slimTableFactory0.tableTypes;
        java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable> wildcardClass9 = slimTableFactory0.getTableType("hi!");
        java.lang.String str11 = slimTableFactory0.getFullTableName("hi!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!" + "'", str2, "hi!");
        org.junit.Assert.assertNotNull(strMap3);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(strMap6);
        org.junit.Assert.assertNotNull(strMap7);
        org.junit.Assert.assertNull(wildcardClass9);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
    }

    @Test
    public void test18085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18085");
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory0 = new fitnesse.testsystems.slim.tables.SlimTableFactory();
        java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable> wildcardClass2 = slimTableFactory0.getTableType("");
        java.lang.String str4 = slimTableFactory0.getFullTableName("");
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory5 = slimTableFactory0.copy();
        java.lang.String str7 = slimTableFactory0.makeTableType("hi!");
        java.util.Map<java.lang.String, java.lang.String> strMap8 = slimTableFactory0.tableTypeArrays;
        java.util.Map<java.lang.String, java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable>> strMap9 = slimTableFactory0.tableTypes;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory10 = slimTableFactory0.copy();
        java.lang.String str12 = slimTableFactory10.makeTableType("hi!");
        java.lang.String str14 = slimTableFactory10.getFullTableName("");
        java.lang.String str16 = slimTableFactory10.makeTableType("hi!");
        boolean boolean18 = slimTableFactory10.hasColon("hi!");
        java.lang.String str20 = slimTableFactory10.getFullTableName("hi!");
        java.lang.String str22 = slimTableFactory10.makeTableType("");
        org.junit.Assert.assertNull(wildcardClass2);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(slimTableFactory5);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertNotNull(strMap8);
        org.junit.Assert.assertNotNull(strMap9);
        org.junit.Assert.assertNotNull(slimTableFactory10);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "hi!" + "'", str20, "hi!");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
    }

    @Test
    public void test18086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18086");
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory0 = new fitnesse.testsystems.slim.tables.SlimTableFactory();
        java.lang.String str2 = slimTableFactory0.getFullTableName("hi!");
        java.util.Map<java.lang.String, java.lang.String> strMap3 = slimTableFactory0.tableTypeArrays;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory4 = new fitnesse.testsystems.slim.tables.SlimTableFactory();
        java.lang.String str6 = slimTableFactory4.getFullTableName("hi!");
        java.util.Map<java.lang.String, java.lang.String> strMap7 = slimTableFactory4.tableTypeArrays;
        slimTableFactory0.tableTypeArrays = strMap7;
        java.lang.String str10 = slimTableFactory0.getFullTableName("");
        java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable> wildcardClass12 = slimTableFactory0.getTableType("hi!");
        java.lang.String str14 = slimTableFactory0.getFullTableName("hi!");
        java.lang.String str16 = slimTableFactory0.getFullTableName("hi!");
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory17 = slimTableFactory0.copy();
        java.util.Map<java.lang.String, java.lang.String> strMap18 = slimTableFactory17.tableTypeArrays;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory19 = slimTableFactory17.copy();
        java.lang.String str21 = slimTableFactory19.getFullTableName("");
        java.util.Map<java.lang.String, java.lang.String> strMap22 = slimTableFactory19.tableTypeArrays;
        java.lang.String str24 = slimTableFactory19.makeTableType("hi!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!" + "'", str2, "hi!");
        org.junit.Assert.assertNotNull(strMap3);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertNotNull(strMap7);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNull(wildcardClass12);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertNotNull(slimTableFactory17);
        org.junit.Assert.assertNotNull(strMap18);
        org.junit.Assert.assertNotNull(slimTableFactory19);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertNotNull(strMap22);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "hi!" + "'", str24, "hi!");
    }

    @Test
    public void test18087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18087");
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory0 = new fitnesse.testsystems.slim.tables.SlimTableFactory();
        java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable> wildcardClass2 = slimTableFactory0.getTableType("");
        java.lang.String str4 = slimTableFactory0.getFullTableName("");
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory5 = slimTableFactory0.copy();
        boolean boolean7 = slimTableFactory0.hasColon("");
        java.util.Map<java.lang.String, java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable>> strMap8 = slimTableFactory0.tableTypes;
        java.util.Map<java.lang.String, java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable>> strMap9 = slimTableFactory0.tableTypes;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory10 = new fitnesse.testsystems.slim.tables.SlimTableFactory();
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory11 = slimTableFactory10.copy();
        java.lang.String str13 = slimTableFactory10.makeTableType("hi!");
        java.util.Map<java.lang.String, java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable>> strMap14 = slimTableFactory10.tableTypes;
        java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable> wildcardClass16 = slimTableFactory10.getTableType("");
        java.util.Map<java.lang.String, java.lang.String> strMap17 = slimTableFactory10.tableTypeArrays;
        slimTableFactory0.tableTypeArrays = strMap17;
        java.lang.String str20 = slimTableFactory0.makeTableType("hi!");
        java.util.Map<java.lang.String, java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable>> strMap21 = slimTableFactory0.tableTypes;
        java.util.Map<java.lang.String, java.lang.String> strMap22 = slimTableFactory0.tableTypeArrays;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory23 = slimTableFactory0.copy();
        java.util.Map<java.lang.String, java.lang.String> strMap24 = slimTableFactory0.tableTypeArrays;
        org.junit.Assert.assertNull(wildcardClass2);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(slimTableFactory5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(strMap8);
        org.junit.Assert.assertNotNull(strMap9);
        org.junit.Assert.assertNotNull(slimTableFactory11);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertNotNull(strMap14);
        org.junit.Assert.assertNull(wildcardClass16);
        org.junit.Assert.assertNotNull(strMap17);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "hi!" + "'", str20, "hi!");
        org.junit.Assert.assertNotNull(strMap21);
        org.junit.Assert.assertNotNull(strMap22);
        org.junit.Assert.assertNotNull(slimTableFactory23);
        org.junit.Assert.assertNotNull(strMap24);
    }

    @Test
    public void test18088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18088");
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory0 = new fitnesse.testsystems.slim.tables.SlimTableFactory();
        java.lang.String str2 = slimTableFactory0.getFullTableName("hi!");
        java.lang.String str4 = slimTableFactory0.makeTableType("");
        java.util.Map<java.lang.String, java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable>> strMap5 = slimTableFactory0.tableTypes;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory6 = slimTableFactory0.copy();
        java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable> wildcardClass8 = slimTableFactory0.getTableType("hi!");
        java.util.Map<java.lang.String, java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable>> strMap9 = slimTableFactory0.tableTypes;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory10 = slimTableFactory0.copy();
        java.lang.String str12 = slimTableFactory0.getFullTableName("");
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory13 = new fitnesse.testsystems.slim.tables.SlimTableFactory();
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory14 = slimTableFactory13.copy();
        java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable> wildcardClass16 = slimTableFactory14.getTableType("hi!");
        java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable> wildcardClass18 = slimTableFactory14.getTableType("hi!");
        boolean boolean20 = slimTableFactory14.hasColon("");
        java.util.Map<java.lang.String, java.lang.String> strMap21 = slimTableFactory14.tableTypeArrays;
        slimTableFactory0.tableTypeArrays = strMap21;
        java.util.Map<java.lang.String, java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable>> strMap23 = slimTableFactory0.tableTypes;
        java.lang.String str25 = slimTableFactory0.makeTableType("hi!");
        boolean boolean27 = slimTableFactory0.hasColon("");
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory28 = new fitnesse.testsystems.slim.tables.SlimTableFactory();
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory29 = slimTableFactory28.copy();
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory30 = slimTableFactory29.copy();
        boolean boolean32 = slimTableFactory29.hasColon("hi!");
        java.util.Map<java.lang.String, java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable>> strMap33 = slimTableFactory29.tableTypes;
        java.lang.String str35 = slimTableFactory29.getFullTableName("");
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory36 = slimTableFactory29.copy();
        java.util.Map<java.lang.String, java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable>> strMap37 = slimTableFactory36.tableTypes;
        java.lang.String str39 = slimTableFactory36.makeTableType("");
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory40 = new fitnesse.testsystems.slim.tables.SlimTableFactory();
        java.lang.String str42 = slimTableFactory40.getFullTableName("hi!");
        java.lang.String str44 = slimTableFactory40.makeTableType("");
        java.util.Map<java.lang.String, java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable>> strMap45 = slimTableFactory40.tableTypes;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory46 = slimTableFactory40.copy();
        java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable> wildcardClass48 = slimTableFactory40.getTableType("hi!");
        java.lang.String str50 = slimTableFactory40.makeTableType("");
        boolean boolean52 = slimTableFactory40.hasColon("");
        java.lang.String str54 = slimTableFactory40.makeTableType("hi!");
        java.lang.String str56 = slimTableFactory40.makeTableType("");
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory57 = new fitnesse.testsystems.slim.tables.SlimTableFactory();
        java.lang.String str59 = slimTableFactory57.getFullTableName("hi!");
        java.util.Map<java.lang.String, java.lang.String> strMap60 = slimTableFactory57.tableTypeArrays;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory61 = new fitnesse.testsystems.slim.tables.SlimTableFactory();
        java.lang.String str63 = slimTableFactory61.getFullTableName("hi!");
        java.util.Map<java.lang.String, java.lang.String> strMap64 = slimTableFactory61.tableTypeArrays;
        slimTableFactory57.tableTypeArrays = strMap64;
        slimTableFactory40.tableTypeArrays = strMap64;
        slimTableFactory36.tableTypeArrays = strMap64;
        slimTableFactory0.tableTypeArrays = strMap64;
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!" + "'", str2, "hi!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(strMap5);
        org.junit.Assert.assertNotNull(slimTableFactory6);
        org.junit.Assert.assertNull(wildcardClass8);
        org.junit.Assert.assertNotNull(strMap9);
        org.junit.Assert.assertNotNull(slimTableFactory10);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertNotNull(slimTableFactory14);
        org.junit.Assert.assertNull(wildcardClass16);
        org.junit.Assert.assertNull(wildcardClass18);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(strMap21);
        org.junit.Assert.assertNotNull(strMap23);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "hi!" + "'", str25, "hi!");
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNotNull(slimTableFactory29);
        org.junit.Assert.assertNotNull(slimTableFactory30);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertNotNull(strMap33);
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "" + "'", str35, "");
        org.junit.Assert.assertNotNull(slimTableFactory36);
        org.junit.Assert.assertNotNull(strMap37);
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "" + "'", str39, "");
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "hi!" + "'", str42, "hi!");
        org.junit.Assert.assertEquals("'" + str44 + "' != '" + "" + "'", str44, "");
        org.junit.Assert.assertNotNull(strMap45);
        org.junit.Assert.assertNotNull(slimTableFactory46);
        org.junit.Assert.assertNull(wildcardClass48);
        org.junit.Assert.assertEquals("'" + str50 + "' != '" + "" + "'", str50, "");
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
        org.junit.Assert.assertEquals("'" + str54 + "' != '" + "hi!" + "'", str54, "hi!");
        org.junit.Assert.assertEquals("'" + str56 + "' != '" + "" + "'", str56, "");
        org.junit.Assert.assertEquals("'" + str59 + "' != '" + "hi!" + "'", str59, "hi!");
        org.junit.Assert.assertNotNull(strMap60);
        org.junit.Assert.assertEquals("'" + str63 + "' != '" + "hi!" + "'", str63, "hi!");
        org.junit.Assert.assertNotNull(strMap64);
    }

    @Test
    public void test18089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18089");
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory0 = new fitnesse.testsystems.slim.tables.SlimTableFactory();
        java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable> wildcardClass2 = slimTableFactory0.getTableType("");
        java.lang.String str4 = slimTableFactory0.getFullTableName("");
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory5 = slimTableFactory0.copy();
        boolean boolean7 = slimTableFactory0.hasColon("");
        java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable> wildcardClass9 = slimTableFactory0.getTableType("");
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory10 = slimTableFactory0.copy();
        java.util.Map<java.lang.String, java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable>> strMap11 = slimTableFactory0.tableTypes;
        java.lang.String str13 = slimTableFactory0.getFullTableName("");
        boolean boolean15 = slimTableFactory0.hasColon("");
        java.lang.String str17 = slimTableFactory0.makeTableType("hi!");
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory18 = slimTableFactory0.copy();
        java.lang.String str20 = slimTableFactory18.getFullTableName("");
        java.lang.String str22 = slimTableFactory18.getFullTableName("hi!");
        org.junit.Assert.assertNull(wildcardClass2);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(slimTableFactory5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(wildcardClass9);
        org.junit.Assert.assertNotNull(slimTableFactory10);
        org.junit.Assert.assertNotNull(strMap11);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
        org.junit.Assert.assertNotNull(slimTableFactory18);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "hi!" + "'", str22, "hi!");
    }

    @Test
    public void test18090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18090");
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory0 = new fitnesse.testsystems.slim.tables.SlimTableFactory();
        java.lang.String str2 = slimTableFactory0.getFullTableName("hi!");
        java.util.Map<java.lang.String, java.lang.String> strMap3 = slimTableFactory0.tableTypeArrays;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory4 = slimTableFactory0.copy();
        java.util.Map<java.lang.String, java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable>> strMap5 = slimTableFactory4.tableTypes;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory6 = slimTableFactory4.copy();
        java.util.Map<java.lang.String, java.lang.String> strMap7 = slimTableFactory6.tableTypeArrays;
        java.util.Map<java.lang.String, java.lang.String> strMap8 = slimTableFactory6.tableTypeArrays;
        java.lang.String str10 = slimTableFactory6.getFullTableName("hi!");
        java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable> wildcardClass12 = slimTableFactory6.getTableType("hi!");
        boolean boolean14 = slimTableFactory6.hasColon("");
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory15 = new fitnesse.testsystems.slim.tables.SlimTableFactory();
        java.lang.String str17 = slimTableFactory15.getFullTableName("hi!");
        java.util.Map<java.lang.String, java.lang.String> strMap18 = slimTableFactory15.tableTypeArrays;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory19 = slimTableFactory15.copy();
        boolean boolean21 = slimTableFactory15.hasColon("hi!");
        java.util.Map<java.lang.String, java.lang.String> strMap22 = slimTableFactory15.tableTypeArrays;
        java.util.Map<java.lang.String, java.lang.String> strMap23 = slimTableFactory15.tableTypeArrays;
        slimTableFactory6.tableTypeArrays = strMap23;
        java.util.Map<java.lang.String, java.lang.String> strMap25 = slimTableFactory6.tableTypeArrays;
        java.lang.String str27 = slimTableFactory6.makeTableType("hi!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!" + "'", str2, "hi!");
        org.junit.Assert.assertNotNull(strMap3);
        org.junit.Assert.assertNotNull(slimTableFactory4);
        org.junit.Assert.assertNotNull(strMap5);
        org.junit.Assert.assertNotNull(slimTableFactory6);
        org.junit.Assert.assertNotNull(strMap7);
        org.junit.Assert.assertNotNull(strMap8);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertNull(wildcardClass12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
        org.junit.Assert.assertNotNull(strMap18);
        org.junit.Assert.assertNotNull(slimTableFactory19);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(strMap22);
        org.junit.Assert.assertNotNull(strMap23);
        org.junit.Assert.assertNotNull(strMap25);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "hi!" + "'", str27, "hi!");
    }

    @Test
    public void test18091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18091");
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory0 = new fitnesse.testsystems.slim.tables.SlimTableFactory();
        java.lang.String str2 = slimTableFactory0.getFullTableName("hi!");
        java.util.Map<java.lang.String, java.lang.String> strMap3 = slimTableFactory0.tableTypeArrays;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory4 = slimTableFactory0.copy();
        boolean boolean6 = slimTableFactory0.hasColon("hi!");
        java.util.Map<java.lang.String, java.lang.String> strMap7 = slimTableFactory0.tableTypeArrays;
        java.lang.String str9 = slimTableFactory0.makeTableType("");
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory10 = new fitnesse.testsystems.slim.tables.SlimTableFactory();
        java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable> wildcardClass12 = slimTableFactory10.getTableType("");
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory13 = new fitnesse.testsystems.slim.tables.SlimTableFactory();
        java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable> wildcardClass15 = slimTableFactory13.getTableType("");
        java.lang.String str17 = slimTableFactory13.getFullTableName("");
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory18 = slimTableFactory13.copy();
        boolean boolean20 = slimTableFactory13.hasColon("");
        java.util.Map<java.lang.String, java.lang.String> strMap21 = slimTableFactory13.tableTypeArrays;
        java.util.Map<java.lang.String, java.lang.String> strMap22 = slimTableFactory13.tableTypeArrays;
        slimTableFactory10.tableTypeArrays = strMap22;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory24 = new fitnesse.testsystems.slim.tables.SlimTableFactory();
        java.lang.String str26 = slimTableFactory24.getFullTableName("hi!");
        java.util.Map<java.lang.String, java.lang.String> strMap27 = slimTableFactory24.tableTypeArrays;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory28 = slimTableFactory24.copy();
        java.util.Map<java.lang.String, java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable>> strMap29 = slimTableFactory28.tableTypes;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory30 = slimTableFactory28.copy();
        java.lang.String str32 = slimTableFactory30.getFullTableName("hi!");
        java.util.Map<java.lang.String, java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable>> strMap33 = slimTableFactory30.tableTypes;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory34 = new fitnesse.testsystems.slim.tables.SlimTableFactory();
        java.lang.String str36 = slimTableFactory34.getFullTableName("hi!");
        java.lang.String str38 = slimTableFactory34.makeTableType("");
        java.util.Map<java.lang.String, java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable>> strMap39 = slimTableFactory34.tableTypes;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory40 = slimTableFactory34.copy();
        java.lang.String str42 = slimTableFactory34.getFullTableName("");
        java.util.Map<java.lang.String, java.lang.String> strMap43 = slimTableFactory34.tableTypeArrays;
        slimTableFactory30.tableTypeArrays = strMap43;
        slimTableFactory10.tableTypeArrays = strMap43;
        java.util.Map<java.lang.String, java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable>> strMap46 = slimTableFactory10.tableTypes;
        java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable> wildcardClass48 = slimTableFactory10.getTableType("");
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory49 = slimTableFactory10.copy();
        java.util.Map<java.lang.String, java.lang.String> strMap50 = slimTableFactory49.tableTypeArrays;
        slimTableFactory0.tableTypeArrays = strMap50;
        java.util.Map<java.lang.String, java.lang.String> strMap52 = slimTableFactory0.tableTypeArrays;
        java.util.Map<java.lang.String, java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable>> strMap53 = slimTableFactory0.tableTypes;
        java.util.Map<java.lang.String, java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable>> strMap54 = slimTableFactory0.tableTypes;
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!" + "'", str2, "hi!");
        org.junit.Assert.assertNotNull(strMap3);
        org.junit.Assert.assertNotNull(slimTableFactory4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(strMap7);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNull(wildcardClass12);
        org.junit.Assert.assertNull(wildcardClass15);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertNotNull(slimTableFactory18);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(strMap21);
        org.junit.Assert.assertNotNull(strMap22);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "hi!" + "'", str26, "hi!");
        org.junit.Assert.assertNotNull(strMap27);
        org.junit.Assert.assertNotNull(slimTableFactory28);
        org.junit.Assert.assertNotNull(strMap29);
        org.junit.Assert.assertNotNull(slimTableFactory30);
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "hi!" + "'", str32, "hi!");
        org.junit.Assert.assertNotNull(strMap33);
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "hi!" + "'", str36, "hi!");
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "" + "'", str38, "");
        org.junit.Assert.assertNotNull(strMap39);
        org.junit.Assert.assertNotNull(slimTableFactory40);
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "" + "'", str42, "");
        org.junit.Assert.assertNotNull(strMap43);
        org.junit.Assert.assertNotNull(strMap46);
        org.junit.Assert.assertNull(wildcardClass48);
        org.junit.Assert.assertNotNull(slimTableFactory49);
        org.junit.Assert.assertNotNull(strMap50);
        org.junit.Assert.assertNotNull(strMap52);
        org.junit.Assert.assertNotNull(strMap53);
        org.junit.Assert.assertNotNull(strMap54);
    }

    @Test
    public void test18092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18092");
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory0 = new fitnesse.testsystems.slim.tables.SlimTableFactory();
        java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable> wildcardClass2 = slimTableFactory0.getTableType("");
        boolean boolean4 = slimTableFactory0.hasColon("hi!");
        java.util.Map<java.lang.String, java.lang.String> strMap5 = slimTableFactory0.tableTypeArrays;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory6 = slimTableFactory0.copy();
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory7 = new fitnesse.testsystems.slim.tables.SlimTableFactory();
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory8 = slimTableFactory7.copy();
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory9 = slimTableFactory7.copy();
        java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable> wildcardClass11 = slimTableFactory7.getTableType("hi!");
        java.lang.String str13 = slimTableFactory7.getFullTableName("hi!");
        java.util.Map<java.lang.String, java.lang.String> strMap14 = slimTableFactory7.tableTypeArrays;
        slimTableFactory0.tableTypeArrays = strMap14;
        boolean boolean17 = slimTableFactory0.hasColon("");
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory18 = slimTableFactory0.copy();
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
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(strMap5);
        org.junit.Assert.assertNotNull(slimTableFactory6);
        org.junit.Assert.assertNotNull(slimTableFactory8);
        org.junit.Assert.assertNotNull(slimTableFactory9);
        org.junit.Assert.assertNull(wildcardClass11);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertNotNull(strMap14);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(slimTableFactory18);
    }

    @Test
    public void test18093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18093");
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory0 = new fitnesse.testsystems.slim.tables.SlimTableFactory();
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory1 = slimTableFactory0.copy();
        java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable> wildcardClass3 = slimTableFactory1.getTableType("hi!");
        java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable> wildcardClass5 = slimTableFactory1.getTableType("hi!");
        boolean boolean7 = slimTableFactory1.hasColon("");
        java.util.Map<java.lang.String, java.lang.String> strMap8 = slimTableFactory1.tableTypeArrays;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory9 = slimTableFactory1.copy();
        boolean boolean11 = slimTableFactory1.hasColon("");
        java.util.Map<java.lang.String, java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable>> strMap12 = slimTableFactory1.tableTypes;
        fitnesse.testsystems.slim.Table table13 = null;
        // The following exception was thrown during execution in test generation
        try {
            fitnesse.testsystems.slim.tables.SlimTable slimTable14 = slimTableFactory1.parseDefineTableTypeTable(table13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(slimTableFactory1);
        org.junit.Assert.assertNull(wildcardClass3);
        org.junit.Assert.assertNull(wildcardClass5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(strMap8);
        org.junit.Assert.assertNotNull(slimTableFactory9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(strMap12);
    }

    @Test
    public void test18094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18094");
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory0 = new fitnesse.testsystems.slim.tables.SlimTableFactory();
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory1 = new fitnesse.testsystems.slim.tables.SlimTableFactory();
        java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable> wildcardClass3 = slimTableFactory1.getTableType("");
        java.lang.String str5 = slimTableFactory1.getFullTableName("");
        java.util.Map<java.lang.String, java.lang.String> strMap6 = slimTableFactory1.tableTypeArrays;
        slimTableFactory0.tableTypeArrays = strMap6;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory8 = slimTableFactory0.copy();
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory9 = slimTableFactory8.copy();
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory10 = slimTableFactory8.copy();
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory11 = slimTableFactory8.copy();
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory12 = slimTableFactory8.copy();
        java.util.Map<java.lang.String, java.lang.String> strMap13 = slimTableFactory8.tableTypeArrays;
        java.lang.String str15 = slimTableFactory8.makeTableType("hi!");
        java.lang.String str17 = slimTableFactory8.makeTableType("hi!");
        java.util.Map<java.lang.String, java.lang.String> strMap18 = slimTableFactory8.tableTypeArrays;
        java.lang.String str20 = slimTableFactory8.makeTableType("hi!");
        java.lang.String str22 = slimTableFactory8.getFullTableName("hi!");
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory23 = slimTableFactory8.copy();
        java.lang.Class<?> wildcardClass24 = slimTableFactory23.getClass();
        org.junit.Assert.assertNull(wildcardClass3);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(strMap6);
        org.junit.Assert.assertNotNull(slimTableFactory8);
        org.junit.Assert.assertNotNull(slimTableFactory9);
        org.junit.Assert.assertNotNull(slimTableFactory10);
        org.junit.Assert.assertNotNull(slimTableFactory11);
        org.junit.Assert.assertNotNull(slimTableFactory12);
        org.junit.Assert.assertNotNull(strMap13);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
        org.junit.Assert.assertNotNull(strMap18);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "hi!" + "'", str20, "hi!");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "hi!" + "'", str22, "hi!");
        org.junit.Assert.assertNotNull(slimTableFactory23);
        org.junit.Assert.assertNotNull(wildcardClass24);
    }

    @Test
    public void test18095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18095");
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory0 = new fitnesse.testsystems.slim.tables.SlimTableFactory();
        java.lang.String str2 = slimTableFactory0.getFullTableName("hi!");
        java.util.Map<java.lang.String, java.lang.String> strMap3 = slimTableFactory0.tableTypeArrays;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory4 = slimTableFactory0.copy();
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory5 = slimTableFactory0.copy();
        boolean boolean7 = slimTableFactory0.hasColon("");
        java.lang.String str9 = slimTableFactory0.makeTableType("");
        java.lang.String str11 = slimTableFactory0.getFullTableName("hi!");
        java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable> wildcardClass13 = slimTableFactory0.getTableType("");
        java.util.Map<java.lang.String, java.lang.String> strMap14 = slimTableFactory0.tableTypeArrays;
        java.util.Map<java.lang.String, java.lang.String> strMap15 = slimTableFactory0.tableTypeArrays;
        java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable> wildcardClass17 = slimTableFactory0.getTableType("");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!" + "'", str2, "hi!");
        org.junit.Assert.assertNotNull(strMap3);
        org.junit.Assert.assertNotNull(slimTableFactory4);
        org.junit.Assert.assertNotNull(slimTableFactory5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertNull(wildcardClass13);
        org.junit.Assert.assertNotNull(strMap14);
        org.junit.Assert.assertNotNull(strMap15);
        org.junit.Assert.assertNull(wildcardClass17);
    }

    @Test
    public void test18096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18096");
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory0 = new fitnesse.testsystems.slim.tables.SlimTableFactory();
        java.lang.String str2 = slimTableFactory0.getFullTableName("hi!");
        java.lang.String str4 = slimTableFactory0.makeTableType("");
        java.util.Map<java.lang.String, java.lang.String> strMap5 = null;
        slimTableFactory0.tableTypeArrays = strMap5;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory7 = new fitnesse.testsystems.slim.tables.SlimTableFactory();
        java.lang.String str9 = slimTableFactory7.getFullTableName("hi!");
        java.util.Map<java.lang.String, java.lang.String> strMap10 = slimTableFactory7.tableTypeArrays;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory11 = slimTableFactory7.copy();
        java.util.Map<java.lang.String, java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable>> strMap12 = slimTableFactory11.tableTypes;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory13 = slimTableFactory11.copy();
        java.util.Map<java.lang.String, java.lang.String> strMap14 = slimTableFactory13.tableTypeArrays;
        java.util.Map<java.lang.String, java.lang.String> strMap15 = slimTableFactory13.tableTypeArrays;
        slimTableFactory0.tableTypeArrays = strMap15;
        java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable> wildcardClass18 = slimTableFactory0.getTableType("hi!");
        java.util.Map<java.lang.String, java.lang.String> strMap19 = slimTableFactory0.tableTypeArrays;
        boolean boolean21 = slimTableFactory0.hasColon("");
        java.lang.String str23 = slimTableFactory0.getFullTableName("");
        java.util.Map<java.lang.String, java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable>> strMap24 = slimTableFactory0.tableTypes;
        java.util.Map<java.lang.String, java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable>> strMap25 = slimTableFactory0.tableTypes;
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!" + "'", str2, "hi!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertNotNull(strMap10);
        org.junit.Assert.assertNotNull(slimTableFactory11);
        org.junit.Assert.assertNotNull(strMap12);
        org.junit.Assert.assertNotNull(slimTableFactory13);
        org.junit.Assert.assertNotNull(strMap14);
        org.junit.Assert.assertNotNull(strMap15);
        org.junit.Assert.assertNull(wildcardClass18);
        org.junit.Assert.assertNotNull(strMap19);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
        org.junit.Assert.assertNotNull(strMap24);
        org.junit.Assert.assertNotNull(strMap25);
    }

    @Test
    public void test18097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18097");
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory0 = new fitnesse.testsystems.slim.tables.SlimTableFactory();
        java.lang.String str2 = slimTableFactory0.getFullTableName("hi!");
        java.util.Map<java.lang.String, java.lang.String> strMap3 = slimTableFactory0.tableTypeArrays;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory4 = slimTableFactory0.copy();
        java.util.Map<java.lang.String, java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable>> strMap5 = slimTableFactory4.tableTypes;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory6 = slimTableFactory4.copy();
        java.util.Map<java.lang.String, java.lang.String> strMap7 = slimTableFactory6.tableTypeArrays;
        java.util.Map<java.lang.String, java.lang.String> strMap8 = slimTableFactory6.tableTypeArrays;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory9 = new fitnesse.testsystems.slim.tables.SlimTableFactory();
        java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable> wildcardClass11 = slimTableFactory9.getTableType("");
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory12 = new fitnesse.testsystems.slim.tables.SlimTableFactory();
        java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable> wildcardClass14 = slimTableFactory12.getTableType("");
        java.lang.String str16 = slimTableFactory12.getFullTableName("");
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory17 = slimTableFactory12.copy();
        boolean boolean19 = slimTableFactory12.hasColon("");
        java.util.Map<java.lang.String, java.lang.String> strMap20 = slimTableFactory12.tableTypeArrays;
        java.util.Map<java.lang.String, java.lang.String> strMap21 = slimTableFactory12.tableTypeArrays;
        slimTableFactory9.tableTypeArrays = strMap21;
        slimTableFactory6.tableTypeArrays = strMap21;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory24 = new fitnesse.testsystems.slim.tables.SlimTableFactory();
        java.lang.String str26 = slimTableFactory24.getFullTableName("hi!");
        java.util.Map<java.lang.String, java.lang.String> strMap27 = slimTableFactory24.tableTypeArrays;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory28 = slimTableFactory24.copy();
        java.util.Map<java.lang.String, java.lang.String> strMap29 = slimTableFactory24.tableTypeArrays;
        slimTableFactory6.tableTypeArrays = strMap29;
        boolean boolean32 = slimTableFactory6.hasColon("hi!");
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory33 = slimTableFactory6.copy();
        java.lang.String str35 = slimTableFactory33.getFullTableName("hi!");
        boolean boolean37 = slimTableFactory33.hasColon("hi!");
        java.lang.Class<?> wildcardClass38 = slimTableFactory33.getClass();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!" + "'", str2, "hi!");
        org.junit.Assert.assertNotNull(strMap3);
        org.junit.Assert.assertNotNull(slimTableFactory4);
        org.junit.Assert.assertNotNull(strMap5);
        org.junit.Assert.assertNotNull(slimTableFactory6);
        org.junit.Assert.assertNotNull(strMap7);
        org.junit.Assert.assertNotNull(strMap8);
        org.junit.Assert.assertNull(wildcardClass11);
        org.junit.Assert.assertNull(wildcardClass14);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertNotNull(slimTableFactory17);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(strMap20);
        org.junit.Assert.assertNotNull(strMap21);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "hi!" + "'", str26, "hi!");
        org.junit.Assert.assertNotNull(strMap27);
        org.junit.Assert.assertNotNull(slimTableFactory28);
        org.junit.Assert.assertNotNull(strMap29);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertNotNull(slimTableFactory33);
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "hi!" + "'", str35, "hi!");
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertNotNull(wildcardClass38);
    }

    @Test
    public void test18098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18098");
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory0 = new fitnesse.testsystems.slim.tables.SlimTableFactory();
        java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable> wildcardClass2 = slimTableFactory0.getTableType("");
        java.lang.String str4 = slimTableFactory0.getFullTableName("");
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory5 = slimTableFactory0.copy();
        boolean boolean7 = slimTableFactory0.hasColon("");
        java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable> wildcardClass9 = slimTableFactory0.getTableType("");
        java.lang.String str11 = slimTableFactory0.makeTableType("");
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory12 = slimTableFactory0.copy();
        java.util.Map<java.lang.String, java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable>> strMap13 = slimTableFactory12.tableTypes;
        java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable> wildcardClass15 = slimTableFactory12.getTableType("hi!");
        java.lang.String str17 = slimTableFactory12.getFullTableName("");
        java.util.Map<java.lang.String, java.lang.String> strMap18 = slimTableFactory12.tableTypeArrays;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory19 = new fitnesse.testsystems.slim.tables.SlimTableFactory();
        java.lang.String str21 = slimTableFactory19.getFullTableName("hi!");
        java.util.Map<java.lang.String, java.lang.String> strMap22 = slimTableFactory19.tableTypeArrays;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory23 = slimTableFactory19.copy();
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory24 = slimTableFactory19.copy();
        boolean boolean26 = slimTableFactory19.hasColon("");
        java.lang.String str28 = slimTableFactory19.getFullTableName("hi!");
        boolean boolean30 = slimTableFactory19.hasColon("hi!");
        java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable> wildcardClass32 = slimTableFactory19.getTableType("");
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory33 = slimTableFactory19.copy();
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory34 = new fitnesse.testsystems.slim.tables.SlimTableFactory();
        java.lang.String str36 = slimTableFactory34.getFullTableName("hi!");
        java.util.Map<java.lang.String, java.lang.String> strMap37 = slimTableFactory34.tableTypeArrays;
        java.lang.String str39 = slimTableFactory34.makeTableType("");
        java.util.Map<java.lang.String, java.lang.String> strMap40 = slimTableFactory34.tableTypeArrays;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory41 = new fitnesse.testsystems.slim.tables.SlimTableFactory();
        java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable> wildcardClass43 = slimTableFactory41.getTableType("");
        boolean boolean45 = slimTableFactory41.hasColon("hi!");
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory46 = slimTableFactory41.copy();
        java.util.Map<java.lang.String, java.lang.String> strMap47 = slimTableFactory41.tableTypeArrays;
        slimTableFactory34.tableTypeArrays = strMap47;
        java.lang.String str50 = slimTableFactory34.getFullTableName("");
        java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable> wildcardClass52 = slimTableFactory34.getTableType("");
        java.util.Map<java.lang.String, java.lang.String> strMap53 = slimTableFactory34.tableTypeArrays;
        slimTableFactory19.tableTypeArrays = strMap53;
        slimTableFactory12.tableTypeArrays = strMap53;
        org.junit.Assert.assertNull(wildcardClass2);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(slimTableFactory5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(wildcardClass9);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNotNull(slimTableFactory12);
        org.junit.Assert.assertNotNull(strMap13);
        org.junit.Assert.assertNull(wildcardClass15);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertNotNull(strMap18);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "hi!" + "'", str21, "hi!");
        org.junit.Assert.assertNotNull(strMap22);
        org.junit.Assert.assertNotNull(slimTableFactory23);
        org.junit.Assert.assertNotNull(slimTableFactory24);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "hi!" + "'", str28, "hi!");
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertNull(wildcardClass32);
        org.junit.Assert.assertNotNull(slimTableFactory33);
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "hi!" + "'", str36, "hi!");
        org.junit.Assert.assertNotNull(strMap37);
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "" + "'", str39, "");
        org.junit.Assert.assertNotNull(strMap40);
        org.junit.Assert.assertNull(wildcardClass43);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertNotNull(slimTableFactory46);
        org.junit.Assert.assertNotNull(strMap47);
        org.junit.Assert.assertEquals("'" + str50 + "' != '" + "" + "'", str50, "");
        org.junit.Assert.assertNull(wildcardClass52);
        org.junit.Assert.assertNotNull(strMap53);
    }

    @Test
    public void test18099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18099");
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory0 = new fitnesse.testsystems.slim.tables.SlimTableFactory();
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory1 = new fitnesse.testsystems.slim.tables.SlimTableFactory();
        java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable> wildcardClass3 = slimTableFactory1.getTableType("");
        java.lang.String str5 = slimTableFactory1.getFullTableName("");
        java.util.Map<java.lang.String, java.lang.String> strMap6 = slimTableFactory1.tableTypeArrays;
        slimTableFactory0.tableTypeArrays = strMap6;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory8 = slimTableFactory0.copy();
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory9 = slimTableFactory8.copy();
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory10 = slimTableFactory8.copy();
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory11 = slimTableFactory8.copy();
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory12 = slimTableFactory11.copy();
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory13 = slimTableFactory12.copy();
        java.lang.String str15 = slimTableFactory13.getFullTableName("hi!");
        java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable> wildcardClass17 = slimTableFactory13.getTableType("");
        java.util.Map<java.lang.String, java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable>> strMap18 = slimTableFactory13.tableTypes;
        org.junit.Assert.assertNull(wildcardClass3);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(strMap6);
        org.junit.Assert.assertNotNull(slimTableFactory8);
        org.junit.Assert.assertNotNull(slimTableFactory9);
        org.junit.Assert.assertNotNull(slimTableFactory10);
        org.junit.Assert.assertNotNull(slimTableFactory11);
        org.junit.Assert.assertNotNull(slimTableFactory12);
        org.junit.Assert.assertNotNull(slimTableFactory13);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertNull(wildcardClass17);
        org.junit.Assert.assertNotNull(strMap18);
    }

    @Test
    public void test18100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18100");
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory0 = new fitnesse.testsystems.slim.tables.SlimTableFactory();
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory1 = new fitnesse.testsystems.slim.tables.SlimTableFactory();
        java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable> wildcardClass3 = slimTableFactory1.getTableType("");
        java.lang.String str5 = slimTableFactory1.getFullTableName("");
        java.util.Map<java.lang.String, java.lang.String> strMap6 = slimTableFactory1.tableTypeArrays;
        slimTableFactory0.tableTypeArrays = strMap6;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory8 = slimTableFactory0.copy();
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory9 = slimTableFactory8.copy();
        java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable> wildcardClass11 = slimTableFactory9.getTableType("hi!");
        java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable> wildcardClass13 = slimTableFactory9.getTableType("");
        java.lang.String str15 = slimTableFactory9.makeTableType("hi!");
        fitnesse.testsystems.slim.Table table16 = null;
        // The following exception was thrown during execution in test generation
        try {
            slimTableFactory9.parseDefineTableTypeRow(table16, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(wildcardClass3);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(strMap6);
        org.junit.Assert.assertNotNull(slimTableFactory8);
        org.junit.Assert.assertNotNull(slimTableFactory9);
        org.junit.Assert.assertNull(wildcardClass11);
        org.junit.Assert.assertNull(wildcardClass13);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
    }

    @Test
    public void test18101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18101");
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory0 = new fitnesse.testsystems.slim.tables.SlimTableFactory();
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory1 = new fitnesse.testsystems.slim.tables.SlimTableFactory();
        java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable> wildcardClass3 = slimTableFactory1.getTableType("");
        java.lang.String str5 = slimTableFactory1.getFullTableName("");
        java.util.Map<java.lang.String, java.lang.String> strMap6 = slimTableFactory1.tableTypeArrays;
        slimTableFactory0.tableTypeArrays = strMap6;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory8 = slimTableFactory0.copy();
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory9 = slimTableFactory8.copy();
        java.util.Map<java.lang.String, java.lang.String> strMap10 = slimTableFactory9.tableTypeArrays;
        java.lang.String str12 = slimTableFactory9.makeTableType("hi!");
        java.lang.String str14 = slimTableFactory9.getFullTableName("hi!");
        java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable> wildcardClass16 = slimTableFactory9.getTableType("");
        java.util.Map<java.lang.String, java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable>> strMap17 = slimTableFactory9.tableTypes;
        boolean boolean19 = slimTableFactory9.hasColon("");
        java.util.Map<java.lang.String, java.lang.String> strMap20 = slimTableFactory9.tableTypeArrays;
        java.lang.String str22 = slimTableFactory9.makeTableType("");
        boolean boolean24 = slimTableFactory9.hasColon("hi!");
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory25 = slimTableFactory9.copy();
        org.junit.Assert.assertNull(wildcardClass3);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(strMap6);
        org.junit.Assert.assertNotNull(slimTableFactory8);
        org.junit.Assert.assertNotNull(slimTableFactory9);
        org.junit.Assert.assertNotNull(strMap10);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertNull(wildcardClass16);
        org.junit.Assert.assertNotNull(strMap17);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(strMap20);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(slimTableFactory25);
    }

    @Test
    public void test18102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18102");
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory0 = new fitnesse.testsystems.slim.tables.SlimTableFactory();
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory1 = new fitnesse.testsystems.slim.tables.SlimTableFactory();
        java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable> wildcardClass3 = slimTableFactory1.getTableType("");
        java.lang.String str5 = slimTableFactory1.getFullTableName("");
        java.util.Map<java.lang.String, java.lang.String> strMap6 = slimTableFactory1.tableTypeArrays;
        slimTableFactory0.tableTypeArrays = strMap6;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory8 = slimTableFactory0.copy();
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory9 = slimTableFactory8.copy();
        java.util.Map<java.lang.String, java.lang.String> strMap10 = slimTableFactory9.tableTypeArrays;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory11 = new fitnesse.testsystems.slim.tables.SlimTableFactory();
        java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable> wildcardClass13 = slimTableFactory11.getTableType("");
        java.lang.String str15 = slimTableFactory11.getFullTableName("");
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory16 = slimTableFactory11.copy();
        boolean boolean18 = slimTableFactory11.hasColon("");
        java.util.Map<java.lang.String, java.lang.String> strMap19 = slimTableFactory11.tableTypeArrays;
        slimTableFactory9.tableTypeArrays = strMap19;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory21 = slimTableFactory9.copy();
        boolean boolean23 = slimTableFactory21.hasColon("");
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory24 = slimTableFactory21.copy();
        java.util.Map<java.lang.String, java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable>> strMap25 = slimTableFactory21.tableTypes;
        boolean boolean27 = slimTableFactory21.hasColon("");
        org.junit.Assert.assertNull(wildcardClass3);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(strMap6);
        org.junit.Assert.assertNotNull(slimTableFactory8);
        org.junit.Assert.assertNotNull(slimTableFactory9);
        org.junit.Assert.assertNotNull(strMap10);
        org.junit.Assert.assertNull(wildcardClass13);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertNotNull(slimTableFactory16);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(strMap19);
        org.junit.Assert.assertNotNull(slimTableFactory21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNotNull(slimTableFactory24);
        org.junit.Assert.assertNotNull(strMap25);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
    }

    @Test
    public void test18103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18103");
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory0 = new fitnesse.testsystems.slim.tables.SlimTableFactory();
        java.lang.String str2 = slimTableFactory0.getFullTableName("hi!");
        java.util.Map<java.lang.String, java.lang.String> strMap3 = slimTableFactory0.tableTypeArrays;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory4 = new fitnesse.testsystems.slim.tables.SlimTableFactory();
        java.lang.String str6 = slimTableFactory4.getFullTableName("hi!");
        java.util.Map<java.lang.String, java.lang.String> strMap7 = slimTableFactory4.tableTypeArrays;
        slimTableFactory0.tableTypeArrays = strMap7;
        java.lang.String str10 = slimTableFactory0.getFullTableName("");
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory11 = slimTableFactory0.copy();
        java.lang.String str13 = slimTableFactory11.makeTableType("hi!");
        java.lang.String str15 = slimTableFactory11.getFullTableName("");
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory16 = slimTableFactory11.copy();
        boolean boolean18 = slimTableFactory11.hasColon("");
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory19 = slimTableFactory11.copy();
        java.util.Map<java.lang.String, java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable>> strMap20 = slimTableFactory11.tableTypes;
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!" + "'", str2, "hi!");
        org.junit.Assert.assertNotNull(strMap3);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertNotNull(strMap7);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNotNull(slimTableFactory11);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertNotNull(slimTableFactory16);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(slimTableFactory19);
        org.junit.Assert.assertNotNull(strMap20);
    }

    @Test
    public void test18104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18104");
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory0 = new fitnesse.testsystems.slim.tables.SlimTableFactory();
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory1 = new fitnesse.testsystems.slim.tables.SlimTableFactory();
        java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable> wildcardClass3 = slimTableFactory1.getTableType("");
        java.lang.String str5 = slimTableFactory1.getFullTableName("");
        java.util.Map<java.lang.String, java.lang.String> strMap6 = slimTableFactory1.tableTypeArrays;
        slimTableFactory0.tableTypeArrays = strMap6;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory8 = slimTableFactory0.copy();
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory9 = slimTableFactory8.copy();
        java.util.Map<java.lang.String, java.lang.String> strMap10 = slimTableFactory9.tableTypeArrays;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory11 = new fitnesse.testsystems.slim.tables.SlimTableFactory();
        java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable> wildcardClass13 = slimTableFactory11.getTableType("");
        java.lang.String str15 = slimTableFactory11.getFullTableName("");
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory16 = slimTableFactory11.copy();
        boolean boolean18 = slimTableFactory11.hasColon("");
        java.util.Map<java.lang.String, java.lang.String> strMap19 = slimTableFactory11.tableTypeArrays;
        slimTableFactory9.tableTypeArrays = strMap19;
        java.lang.String str22 = slimTableFactory9.getFullTableName("hi!");
        java.lang.String str24 = slimTableFactory9.makeTableType("hi!");
        java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable> wildcardClass26 = slimTableFactory9.getTableType("hi!");
        java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable> wildcardClass28 = slimTableFactory9.getTableType("");
        java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable> wildcardClass30 = slimTableFactory9.getTableType("hi!");
        boolean boolean32 = slimTableFactory9.hasColon("hi!");
        java.lang.String str34 = slimTableFactory9.makeTableType("hi!");
        java.lang.String str36 = slimTableFactory9.getFullTableName("");
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory37 = slimTableFactory9.copy();
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory38 = slimTableFactory37.copy();
        org.junit.Assert.assertNull(wildcardClass3);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(strMap6);
        org.junit.Assert.assertNotNull(slimTableFactory8);
        org.junit.Assert.assertNotNull(slimTableFactory9);
        org.junit.Assert.assertNotNull(strMap10);
        org.junit.Assert.assertNull(wildcardClass13);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertNotNull(slimTableFactory16);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(strMap19);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "hi!" + "'", str22, "hi!");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "hi!" + "'", str24, "hi!");
        org.junit.Assert.assertNull(wildcardClass26);
        org.junit.Assert.assertNull(wildcardClass28);
        org.junit.Assert.assertNull(wildcardClass30);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "hi!" + "'", str34, "hi!");
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "" + "'", str36, "");
        org.junit.Assert.assertNotNull(slimTableFactory37);
        org.junit.Assert.assertNotNull(slimTableFactory38);
    }

    @Test
    public void test18105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18105");
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory0 = new fitnesse.testsystems.slim.tables.SlimTableFactory();
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory1 = new fitnesse.testsystems.slim.tables.SlimTableFactory();
        java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable> wildcardClass3 = slimTableFactory1.getTableType("");
        java.lang.String str5 = slimTableFactory1.getFullTableName("");
        java.util.Map<java.lang.String, java.lang.String> strMap6 = slimTableFactory1.tableTypeArrays;
        slimTableFactory0.tableTypeArrays = strMap6;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory8 = slimTableFactory0.copy();
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory9 = slimTableFactory8.copy();
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory10 = slimTableFactory8.copy();
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory11 = slimTableFactory8.copy();
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory12 = slimTableFactory8.copy();
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory13 = slimTableFactory12.copy();
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory14 = slimTableFactory13.copy();
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory15 = new fitnesse.testsystems.slim.tables.SlimTableFactory();
        java.lang.String str17 = slimTableFactory15.getFullTableName("hi!");
        java.util.Map<java.lang.String, java.lang.String> strMap18 = slimTableFactory15.tableTypeArrays;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory19 = new fitnesse.testsystems.slim.tables.SlimTableFactory();
        java.lang.String str21 = slimTableFactory19.getFullTableName("hi!");
        java.util.Map<java.lang.String, java.lang.String> strMap22 = slimTableFactory19.tableTypeArrays;
        slimTableFactory15.tableTypeArrays = strMap22;
        java.lang.String str25 = slimTableFactory15.makeTableType("");
        java.util.Map<java.lang.String, java.lang.String> strMap26 = slimTableFactory15.tableTypeArrays;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory27 = new fitnesse.testsystems.slim.tables.SlimTableFactory();
        java.lang.String str29 = slimTableFactory27.getFullTableName("hi!");
        java.util.Map<java.lang.String, java.lang.String> strMap30 = slimTableFactory27.tableTypeArrays;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory31 = slimTableFactory27.copy();
        java.util.Map<java.lang.String, java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable>> strMap32 = slimTableFactory31.tableTypes;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory33 = slimTableFactory31.copy();
        java.lang.String str35 = slimTableFactory33.getFullTableName("hi!");
        java.util.Map<java.lang.String, java.lang.String> strMap36 = slimTableFactory33.tableTypeArrays;
        slimTableFactory15.tableTypeArrays = strMap36;
        slimTableFactory14.tableTypeArrays = strMap36;
        java.util.Map<java.lang.String, java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable>> strMap39 = slimTableFactory14.tableTypes;
        java.lang.String str41 = slimTableFactory14.makeTableType("hi!");
        java.util.Map<java.lang.String, java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable>> strMap42 = slimTableFactory14.tableTypes;
        java.lang.String str44 = slimTableFactory14.getFullTableName("hi!");
        org.junit.Assert.assertNull(wildcardClass3);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(strMap6);
        org.junit.Assert.assertNotNull(slimTableFactory8);
        org.junit.Assert.assertNotNull(slimTableFactory9);
        org.junit.Assert.assertNotNull(slimTableFactory10);
        org.junit.Assert.assertNotNull(slimTableFactory11);
        org.junit.Assert.assertNotNull(slimTableFactory12);
        org.junit.Assert.assertNotNull(slimTableFactory13);
        org.junit.Assert.assertNotNull(slimTableFactory14);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
        org.junit.Assert.assertNotNull(strMap18);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "hi!" + "'", str21, "hi!");
        org.junit.Assert.assertNotNull(strMap22);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "" + "'", str25, "");
        org.junit.Assert.assertNotNull(strMap26);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "hi!" + "'", str29, "hi!");
        org.junit.Assert.assertNotNull(strMap30);
        org.junit.Assert.assertNotNull(slimTableFactory31);
        org.junit.Assert.assertNotNull(strMap32);
        org.junit.Assert.assertNotNull(slimTableFactory33);
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "hi!" + "'", str35, "hi!");
        org.junit.Assert.assertNotNull(strMap36);
        org.junit.Assert.assertNotNull(strMap39);
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "hi!" + "'", str41, "hi!");
        org.junit.Assert.assertNotNull(strMap42);
        org.junit.Assert.assertEquals("'" + str44 + "' != '" + "hi!" + "'", str44, "hi!");
    }

    @Test
    public void test18106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18106");
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory0 = new fitnesse.testsystems.slim.tables.SlimTableFactory();
        java.lang.String str2 = slimTableFactory0.getFullTableName("hi!");
        java.util.Map<java.lang.String, java.lang.String> strMap3 = slimTableFactory0.tableTypeArrays;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory4 = new fitnesse.testsystems.slim.tables.SlimTableFactory();
        java.lang.String str6 = slimTableFactory4.getFullTableName("hi!");
        java.util.Map<java.lang.String, java.lang.String> strMap7 = slimTableFactory4.tableTypeArrays;
        slimTableFactory0.tableTypeArrays = strMap7;
        java.lang.String str10 = slimTableFactory0.getFullTableName("");
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory11 = new fitnesse.testsystems.slim.tables.SlimTableFactory();
        java.lang.String str13 = slimTableFactory11.getFullTableName("hi!");
        java.util.Map<java.lang.String, java.lang.String> strMap14 = slimTableFactory11.tableTypeArrays;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory15 = new fitnesse.testsystems.slim.tables.SlimTableFactory();
        java.lang.String str17 = slimTableFactory15.getFullTableName("hi!");
        java.util.Map<java.lang.String, java.lang.String> strMap18 = slimTableFactory15.tableTypeArrays;
        slimTableFactory11.tableTypeArrays = strMap18;
        slimTableFactory0.tableTypeArrays = strMap18;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory21 = slimTableFactory0.copy();
        boolean boolean23 = slimTableFactory0.hasColon("hi!");
        boolean boolean25 = slimTableFactory0.hasColon("hi!");
        java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable> wildcardClass27 = slimTableFactory0.getTableType("");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!" + "'", str2, "hi!");
        org.junit.Assert.assertNotNull(strMap3);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertNotNull(strMap7);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertNotNull(strMap14);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
        org.junit.Assert.assertNotNull(strMap18);
        org.junit.Assert.assertNotNull(slimTableFactory21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNull(wildcardClass27);
    }

    @Test
    public void test18107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18107");
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory0 = new fitnesse.testsystems.slim.tables.SlimTableFactory();
        java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable> wildcardClass2 = slimTableFactory0.getTableType("");
        java.lang.String str4 = slimTableFactory0.getFullTableName("");
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory5 = slimTableFactory0.copy();
        java.util.Map<java.lang.String, java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable>> strMap6 = slimTableFactory5.tableTypes;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory7 = slimTableFactory5.copy();
        java.util.Map<java.lang.String, java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable>> strMap8 = slimTableFactory5.tableTypes;
        java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable> wildcardClass10 = slimTableFactory5.getTableType("");
        java.lang.String str12 = slimTableFactory5.makeTableType("hi!");
        java.lang.String str14 = slimTableFactory5.makeTableType("");
        java.util.Map<java.lang.String, java.lang.String> strMap15 = slimTableFactory5.tableTypeArrays;
        java.util.Map<java.lang.String, java.lang.String> strMap16 = slimTableFactory5.tableTypeArrays;
        org.junit.Assert.assertNull(wildcardClass2);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(slimTableFactory5);
        org.junit.Assert.assertNotNull(strMap6);
        org.junit.Assert.assertNotNull(slimTableFactory7);
        org.junit.Assert.assertNotNull(strMap8);
        org.junit.Assert.assertNull(wildcardClass10);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertNotNull(strMap15);
        org.junit.Assert.assertNotNull(strMap16);
    }

    @Test
    public void test18108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18108");
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory0 = new fitnesse.testsystems.slim.tables.SlimTableFactory();
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory1 = slimTableFactory0.copy();
        java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable> wildcardClass3 = slimTableFactory1.getTableType("hi!");
        boolean boolean5 = slimTableFactory1.hasColon("hi!");
        boolean boolean7 = slimTableFactory1.hasColon("");
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory8 = slimTableFactory1.copy();
        org.junit.Assert.assertNotNull(slimTableFactory1);
        org.junit.Assert.assertNull(wildcardClass3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(slimTableFactory8);
    }

    @Test
    public void test18109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18109");
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory0 = new fitnesse.testsystems.slim.tables.SlimTableFactory();
        java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable> wildcardClass2 = slimTableFactory0.getTableType("");
        boolean boolean4 = slimTableFactory0.hasColon("");
        boolean boolean6 = slimTableFactory0.hasColon("hi!");
        java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable> wildcardClass8 = slimTableFactory0.getTableType("hi!");
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory9 = new fitnesse.testsystems.slim.tables.SlimTableFactory();
        java.lang.String str11 = slimTableFactory9.getFullTableName("hi!");
        java.lang.String str13 = slimTableFactory9.makeTableType("");
        java.util.Map<java.lang.String, java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable>> strMap14 = slimTableFactory9.tableTypes;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory15 = new fitnesse.testsystems.slim.tables.SlimTableFactory();
        java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable> wildcardClass17 = slimTableFactory15.getTableType("");
        java.lang.String str19 = slimTableFactory15.getFullTableName("");
        java.util.Map<java.lang.String, java.lang.String> strMap20 = slimTableFactory15.tableTypeArrays;
        slimTableFactory9.tableTypeArrays = strMap20;
        slimTableFactory0.tableTypeArrays = strMap20;
        boolean boolean24 = slimTableFactory0.hasColon("");
        java.util.Map<java.lang.String, java.lang.String> strMap25 = slimTableFactory0.tableTypeArrays;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory26 = new fitnesse.testsystems.slim.tables.SlimTableFactory();
        java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable> wildcardClass28 = slimTableFactory26.getTableType("");
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory29 = new fitnesse.testsystems.slim.tables.SlimTableFactory();
        java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable> wildcardClass31 = slimTableFactory29.getTableType("");
        java.lang.String str33 = slimTableFactory29.getFullTableName("");
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory34 = slimTableFactory29.copy();
        boolean boolean36 = slimTableFactory29.hasColon("");
        java.util.Map<java.lang.String, java.lang.String> strMap37 = slimTableFactory29.tableTypeArrays;
        java.util.Map<java.lang.String, java.lang.String> strMap38 = slimTableFactory29.tableTypeArrays;
        slimTableFactory26.tableTypeArrays = strMap38;
        boolean boolean41 = slimTableFactory26.hasColon("hi!");
        java.util.Map<java.lang.String, java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable>> strMap42 = slimTableFactory26.tableTypes;
        boolean boolean44 = slimTableFactory26.hasColon("");
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory45 = slimTableFactory26.copy();
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory46 = new fitnesse.testsystems.slim.tables.SlimTableFactory();
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory47 = new fitnesse.testsystems.slim.tables.SlimTableFactory();
        java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable> wildcardClass49 = slimTableFactory47.getTableType("");
        java.lang.String str51 = slimTableFactory47.getFullTableName("");
        java.util.Map<java.lang.String, java.lang.String> strMap52 = slimTableFactory47.tableTypeArrays;
        slimTableFactory46.tableTypeArrays = strMap52;
        java.util.Map<java.lang.String, java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable>> strMap54 = slimTableFactory46.tableTypes;
        java.util.Map<java.lang.String, java.lang.String> strMap55 = slimTableFactory46.tableTypeArrays;
        slimTableFactory26.tableTypeArrays = strMap55;
        slimTableFactory0.tableTypeArrays = strMap55;
        java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable> wildcardClass59 = slimTableFactory0.getTableType("hi!");
        java.util.Map<java.lang.String, java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable>> strMap60 = slimTableFactory0.tableTypes;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory61 = slimTableFactory0.copy();
        java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable> wildcardClass63 = slimTableFactory0.getTableType("");
        fitnesse.testsystems.slim.Table table64 = null;
        fitnesse.testsystems.slim.SlimTestContext slimTestContext66 = null;
        // The following exception was thrown during execution in test generation
        try {
            fitnesse.testsystems.slim.tables.SlimTable slimTable67 = slimTableFactory0.makeSlimTable(table64, "hi!", slimTestContext66);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(wildcardClass2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(wildcardClass8);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNotNull(strMap14);
        org.junit.Assert.assertNull(wildcardClass17);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertNotNull(strMap20);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(strMap25);
        org.junit.Assert.assertNull(wildcardClass28);
        org.junit.Assert.assertNull(wildcardClass31);
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "" + "'", str33, "");
        org.junit.Assert.assertNotNull(slimTableFactory34);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertNotNull(strMap37);
        org.junit.Assert.assertNotNull(strMap38);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertNotNull(strMap42);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertNotNull(slimTableFactory45);
        org.junit.Assert.assertNull(wildcardClass49);
        org.junit.Assert.assertEquals("'" + str51 + "' != '" + "" + "'", str51, "");
        org.junit.Assert.assertNotNull(strMap52);
        org.junit.Assert.assertNotNull(strMap54);
        org.junit.Assert.assertNotNull(strMap55);
        org.junit.Assert.assertNull(wildcardClass59);
        org.junit.Assert.assertNotNull(strMap60);
        org.junit.Assert.assertNotNull(slimTableFactory61);
        org.junit.Assert.assertNull(wildcardClass63);
    }

    @Test
    public void test18110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18110");
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory0 = new fitnesse.testsystems.slim.tables.SlimTableFactory();
        java.lang.String str2 = slimTableFactory0.getFullTableName("hi!");
        java.lang.String str4 = slimTableFactory0.makeTableType("");
        java.util.Map<java.lang.String, java.lang.String> strMap5 = null;
        slimTableFactory0.tableTypeArrays = strMap5;
        boolean boolean8 = slimTableFactory0.hasColon("hi!");
        java.util.Map<java.lang.String, java.lang.String> strMap9 = slimTableFactory0.tableTypeArrays;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory10 = new fitnesse.testsystems.slim.tables.SlimTableFactory();
        java.lang.String str12 = slimTableFactory10.getFullTableName("hi!");
        java.lang.String str14 = slimTableFactory10.makeTableType("");
        java.util.Map<java.lang.String, java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable>> strMap15 = slimTableFactory10.tableTypes;
        java.lang.String str17 = slimTableFactory10.getFullTableName("");
        java.util.Map<java.lang.String, java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable>> strMap18 = slimTableFactory10.tableTypes;
        java.util.Map<java.lang.String, java.lang.String> strMap19 = slimTableFactory10.tableTypeArrays;
        java.util.Map<java.lang.String, java.lang.String> strMap20 = slimTableFactory10.tableTypeArrays;
        slimTableFactory0.tableTypeArrays = strMap20;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory22 = slimTableFactory0.copy();
        java.util.Map<java.lang.String, java.lang.String> strMap23 = slimTableFactory0.tableTypeArrays;
        java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable> wildcardClass25 = slimTableFactory0.getTableType("");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!" + "'", str2, "hi!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(strMap9);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertNotNull(strMap15);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertNotNull(strMap18);
        org.junit.Assert.assertNotNull(strMap19);
        org.junit.Assert.assertNotNull(strMap20);
        org.junit.Assert.assertNotNull(slimTableFactory22);
        org.junit.Assert.assertNotNull(strMap23);
        org.junit.Assert.assertNull(wildcardClass25);
    }

    @Test
    public void test18111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18111");
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory0 = new fitnesse.testsystems.slim.tables.SlimTableFactory();
        java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable> wildcardClass2 = slimTableFactory0.getTableType("");
        java.lang.String str4 = slimTableFactory0.getFullTableName("");
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory5 = slimTableFactory0.copy();
        boolean boolean7 = slimTableFactory0.hasColon("");
        java.util.Map<java.lang.String, java.lang.String> strMap8 = slimTableFactory0.tableTypeArrays;
        java.util.Map<java.lang.String, java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable>> strMap9 = slimTableFactory0.tableTypes;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory10 = slimTableFactory0.copy();
        boolean boolean12 = slimTableFactory10.hasColon("");
        java.lang.String str14 = slimTableFactory10.makeTableType("");
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory15 = slimTableFactory10.copy();
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory16 = new fitnesse.testsystems.slim.tables.SlimTableFactory();
        java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable> wildcardClass18 = slimTableFactory16.getTableType("");
        java.lang.String str20 = slimTableFactory16.getFullTableName("");
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory21 = slimTableFactory16.copy();
        boolean boolean23 = slimTableFactory16.hasColon("");
        boolean boolean25 = slimTableFactory16.hasColon("hi!");
        boolean boolean27 = slimTableFactory16.hasColon("");
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory28 = slimTableFactory16.copy();
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory29 = new fitnesse.testsystems.slim.tables.SlimTableFactory();
        java.lang.String str31 = slimTableFactory29.getFullTableName("hi!");
        java.util.Map<java.lang.String, java.lang.String> strMap32 = slimTableFactory29.tableTypeArrays;
        java.lang.String str34 = slimTableFactory29.makeTableType("");
        java.util.Map<java.lang.String, java.lang.String> strMap35 = slimTableFactory29.tableTypeArrays;
        java.util.Map<java.lang.String, java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable>> strMap36 = slimTableFactory29.tableTypes;
        java.util.Map<java.lang.String, java.lang.String> strMap37 = slimTableFactory29.tableTypeArrays;
        slimTableFactory28.tableTypeArrays = strMap37;
        slimTableFactory10.tableTypeArrays = strMap37;
        org.junit.Assert.assertNull(wildcardClass2);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(slimTableFactory5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(strMap8);
        org.junit.Assert.assertNotNull(strMap9);
        org.junit.Assert.assertNotNull(slimTableFactory10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertNotNull(slimTableFactory15);
        org.junit.Assert.assertNull(wildcardClass18);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertNotNull(slimTableFactory21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNotNull(slimTableFactory28);
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "hi!" + "'", str31, "hi!");
        org.junit.Assert.assertNotNull(strMap32);
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "" + "'", str34, "");
        org.junit.Assert.assertNotNull(strMap35);
        org.junit.Assert.assertNotNull(strMap36);
        org.junit.Assert.assertNotNull(strMap37);
    }

    @Test
    public void test18112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18112");
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory0 = new fitnesse.testsystems.slim.tables.SlimTableFactory();
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory1 = new fitnesse.testsystems.slim.tables.SlimTableFactory();
        java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable> wildcardClass3 = slimTableFactory1.getTableType("");
        java.lang.String str5 = slimTableFactory1.getFullTableName("");
        java.util.Map<java.lang.String, java.lang.String> strMap6 = slimTableFactory1.tableTypeArrays;
        slimTableFactory0.tableTypeArrays = strMap6;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory8 = slimTableFactory0.copy();
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory9 = slimTableFactory8.copy();
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory10 = slimTableFactory8.copy();
        boolean boolean12 = slimTableFactory10.hasColon("");
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory13 = slimTableFactory10.copy();
        java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable> wildcardClass15 = slimTableFactory10.getTableType("hi!");
        java.lang.String str17 = slimTableFactory10.getFullTableName("");
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory18 = slimTableFactory10.copy();
        fitnesse.testsystems.slim.Table table19 = null;
        // The following exception was thrown during execution in test generation
        try {
            slimTableFactory10.parseDefineTableTypeRow(table19, (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(wildcardClass3);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(strMap6);
        org.junit.Assert.assertNotNull(slimTableFactory8);
        org.junit.Assert.assertNotNull(slimTableFactory9);
        org.junit.Assert.assertNotNull(slimTableFactory10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(slimTableFactory13);
        org.junit.Assert.assertNull(wildcardClass15);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertNotNull(slimTableFactory18);
    }

    @Test
    public void test18113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18113");
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory0 = new fitnesse.testsystems.slim.tables.SlimTableFactory();
        java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable> wildcardClass2 = slimTableFactory0.getTableType("");
        java.lang.String str4 = slimTableFactory0.getFullTableName("");
        java.util.Map<java.lang.String, java.lang.String> strMap5 = slimTableFactory0.tableTypeArrays;
        java.util.Map<java.lang.String, java.lang.String> strMap6 = slimTableFactory0.tableTypeArrays;
        java.lang.String str8 = slimTableFactory0.makeTableType("hi!");
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory9 = new fitnesse.testsystems.slim.tables.SlimTableFactory();
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory10 = new fitnesse.testsystems.slim.tables.SlimTableFactory();
        java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable> wildcardClass12 = slimTableFactory10.getTableType("");
        java.lang.String str14 = slimTableFactory10.getFullTableName("");
        java.util.Map<java.lang.String, java.lang.String> strMap15 = slimTableFactory10.tableTypeArrays;
        slimTableFactory9.tableTypeArrays = strMap15;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory17 = slimTableFactory9.copy();
        java.lang.String str19 = slimTableFactory9.getFullTableName("hi!");
        java.util.Map<java.lang.String, java.lang.String> strMap20 = slimTableFactory9.tableTypeArrays;
        slimTableFactory0.tableTypeArrays = strMap20;
        java.util.Map<java.lang.String, java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable>> strMap22 = slimTableFactory0.tableTypes;
        java.lang.String str24 = slimTableFactory0.getFullTableName("hi!");
        java.util.Map<java.lang.String, java.lang.String> strMap25 = slimTableFactory0.tableTypeArrays;
        java.util.Map<java.lang.String, java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable>> strMap26 = slimTableFactory0.tableTypes;
        java.util.Map<java.lang.String, java.lang.String> strMap27 = slimTableFactory0.tableTypeArrays;
        java.lang.String str29 = slimTableFactory0.makeTableType("hi!");
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory30 = slimTableFactory0.copy();
        org.junit.Assert.assertNull(wildcardClass2);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(strMap5);
        org.junit.Assert.assertNotNull(strMap6);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertNull(wildcardClass12);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertNotNull(strMap15);
        org.junit.Assert.assertNotNull(slimTableFactory17);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "hi!" + "'", str19, "hi!");
        org.junit.Assert.assertNotNull(strMap20);
        org.junit.Assert.assertNotNull(strMap22);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "hi!" + "'", str24, "hi!");
        org.junit.Assert.assertNotNull(strMap25);
        org.junit.Assert.assertNotNull(strMap26);
        org.junit.Assert.assertNotNull(strMap27);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "hi!" + "'", str29, "hi!");
        org.junit.Assert.assertNotNull(slimTableFactory30);
    }

    @Test
    public void test18114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18114");
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory0 = new fitnesse.testsystems.slim.tables.SlimTableFactory();
        java.lang.String str2 = slimTableFactory0.getFullTableName("hi!");
        java.lang.String str4 = slimTableFactory0.makeTableType("");
        java.util.Map<java.lang.String, java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable>> strMap5 = slimTableFactory0.tableTypes;
        java.lang.String str7 = slimTableFactory0.getFullTableName("");
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory8 = new fitnesse.testsystems.slim.tables.SlimTableFactory();
        java.lang.String str10 = slimTableFactory8.getFullTableName("hi!");
        java.util.Map<java.lang.String, java.lang.String> strMap11 = slimTableFactory8.tableTypeArrays;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory12 = slimTableFactory8.copy();
        java.util.Map<java.lang.String, java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable>> strMap13 = slimTableFactory12.tableTypes;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory14 = slimTableFactory12.copy();
        java.util.Map<java.lang.String, java.lang.String> strMap15 = slimTableFactory14.tableTypeArrays;
        java.util.Map<java.lang.String, java.lang.String> strMap16 = slimTableFactory14.tableTypeArrays;
        java.lang.String str18 = slimTableFactory14.getFullTableName("hi!");
        java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable> wildcardClass20 = slimTableFactory14.getTableType("hi!");
        boolean boolean22 = slimTableFactory14.hasColon("");
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory23 = new fitnesse.testsystems.slim.tables.SlimTableFactory();
        java.lang.String str25 = slimTableFactory23.getFullTableName("hi!");
        java.util.Map<java.lang.String, java.lang.String> strMap26 = slimTableFactory23.tableTypeArrays;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory27 = slimTableFactory23.copy();
        boolean boolean29 = slimTableFactory23.hasColon("hi!");
        java.util.Map<java.lang.String, java.lang.String> strMap30 = slimTableFactory23.tableTypeArrays;
        java.util.Map<java.lang.String, java.lang.String> strMap31 = slimTableFactory23.tableTypeArrays;
        slimTableFactory14.tableTypeArrays = strMap31;
        slimTableFactory0.tableTypeArrays = strMap31;
        java.util.Map<java.lang.String, java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable>> strMap34 = slimTableFactory0.tableTypes;
        java.util.Map<java.lang.String, java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable>> strMap35 = slimTableFactory0.tableTypes;
        boolean boolean37 = slimTableFactory0.hasColon("");
        java.util.Map<java.lang.String, java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable>> strMap38 = slimTableFactory0.tableTypes;
        boolean boolean40 = slimTableFactory0.hasColon("hi!");
        java.lang.String str42 = slimTableFactory0.getFullTableName("hi!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!" + "'", str2, "hi!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(strMap5);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertNotNull(strMap11);
        org.junit.Assert.assertNotNull(slimTableFactory12);
        org.junit.Assert.assertNotNull(strMap13);
        org.junit.Assert.assertNotNull(slimTableFactory14);
        org.junit.Assert.assertNotNull(strMap15);
        org.junit.Assert.assertNotNull(strMap16);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!" + "'", str18, "hi!");
        org.junit.Assert.assertNull(wildcardClass20);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "hi!" + "'", str25, "hi!");
        org.junit.Assert.assertNotNull(strMap26);
        org.junit.Assert.assertNotNull(slimTableFactory27);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertNotNull(strMap30);
        org.junit.Assert.assertNotNull(strMap31);
        org.junit.Assert.assertNotNull(strMap34);
        org.junit.Assert.assertNotNull(strMap35);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertNotNull(strMap38);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "hi!" + "'", str42, "hi!");
    }

    @Test
    public void test18115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18115");
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory0 = new fitnesse.testsystems.slim.tables.SlimTableFactory();
        java.lang.String str2 = slimTableFactory0.getFullTableName("hi!");
        java.util.Map<java.lang.String, java.lang.String> strMap3 = slimTableFactory0.tableTypeArrays;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory4 = slimTableFactory0.copy();
        java.util.Map<java.lang.String, java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable>> strMap5 = slimTableFactory4.tableTypes;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory6 = slimTableFactory4.copy();
        java.util.Map<java.lang.String, java.lang.String> strMap7 = slimTableFactory6.tableTypeArrays;
        java.util.Map<java.lang.String, java.lang.String> strMap8 = slimTableFactory6.tableTypeArrays;
        java.lang.String str10 = slimTableFactory6.getFullTableName("hi!");
        java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable> wildcardClass12 = slimTableFactory6.getTableType("");
        boolean boolean14 = slimTableFactory6.hasColon("");
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory15 = new fitnesse.testsystems.slim.tables.SlimTableFactory();
        java.lang.String str17 = slimTableFactory15.getFullTableName("hi!");
        java.util.Map<java.lang.String, java.lang.String> strMap18 = slimTableFactory15.tableTypeArrays;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory19 = slimTableFactory15.copy();
        java.util.Map<java.lang.String, java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable>> strMap20 = slimTableFactory19.tableTypes;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory21 = slimTableFactory19.copy();
        java.util.Map<java.lang.String, java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable>> strMap22 = slimTableFactory19.tableTypes;
        java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable> wildcardClass24 = slimTableFactory19.getTableType("");
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory25 = new fitnesse.testsystems.slim.tables.SlimTableFactory();
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory26 = slimTableFactory25.copy();
        java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable> wildcardClass28 = slimTableFactory26.getTableType("hi!");
        java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable> wildcardClass30 = slimTableFactory26.getTableType("hi!");
        boolean boolean32 = slimTableFactory26.hasColon("");
        java.util.Map<java.lang.String, java.lang.String> strMap33 = slimTableFactory26.tableTypeArrays;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory34 = slimTableFactory26.copy();
        java.lang.String str36 = slimTableFactory26.getFullTableName("");
        java.util.Map<java.lang.String, java.lang.String> strMap37 = slimTableFactory26.tableTypeArrays;
        slimTableFactory19.tableTypeArrays = strMap37;
        java.util.Map<java.lang.String, java.lang.String> strMap39 = slimTableFactory19.tableTypeArrays;
        java.util.Map<java.lang.String, java.lang.String> strMap40 = slimTableFactory19.tableTypeArrays;
        slimTableFactory6.tableTypeArrays = strMap40;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory42 = new fitnesse.testsystems.slim.tables.SlimTableFactory();
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory43 = new fitnesse.testsystems.slim.tables.SlimTableFactory();
        java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable> wildcardClass45 = slimTableFactory43.getTableType("");
        java.lang.String str47 = slimTableFactory43.getFullTableName("");
        java.util.Map<java.lang.String, java.lang.String> strMap48 = slimTableFactory43.tableTypeArrays;
        slimTableFactory42.tableTypeArrays = strMap48;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory50 = slimTableFactory42.copy();
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory51 = slimTableFactory50.copy();
        java.util.Map<java.lang.String, java.lang.String> strMap52 = slimTableFactory51.tableTypeArrays;
        java.lang.String str54 = slimTableFactory51.makeTableType("hi!");
        boolean boolean56 = slimTableFactory51.hasColon("hi!");
        java.lang.String str58 = slimTableFactory51.makeTableType("hi!");
        boolean boolean60 = slimTableFactory51.hasColon("hi!");
        java.lang.String str62 = slimTableFactory51.makeTableType("");
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory63 = slimTableFactory51.copy();
        java.util.Map<java.lang.String, java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable>> strMap64 = slimTableFactory51.tableTypes;
        java.util.Map<java.lang.String, java.lang.String> strMap65 = slimTableFactory51.tableTypeArrays;
        slimTableFactory6.tableTypeArrays = strMap65;
        java.util.Map<java.lang.String, java.lang.String> strMap67 = slimTableFactory6.tableTypeArrays;
        boolean boolean69 = slimTableFactory6.hasColon("hi!");
        java.util.Map<java.lang.String, java.lang.String> strMap70 = slimTableFactory6.tableTypeArrays;
        java.lang.Class<?> wildcardClass71 = strMap70.getClass();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!" + "'", str2, "hi!");
        org.junit.Assert.assertNotNull(strMap3);
        org.junit.Assert.assertNotNull(slimTableFactory4);
        org.junit.Assert.assertNotNull(strMap5);
        org.junit.Assert.assertNotNull(slimTableFactory6);
        org.junit.Assert.assertNotNull(strMap7);
        org.junit.Assert.assertNotNull(strMap8);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertNull(wildcardClass12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
        org.junit.Assert.assertNotNull(strMap18);
        org.junit.Assert.assertNotNull(slimTableFactory19);
        org.junit.Assert.assertNotNull(strMap20);
        org.junit.Assert.assertNotNull(slimTableFactory21);
        org.junit.Assert.assertNotNull(strMap22);
        org.junit.Assert.assertNull(wildcardClass24);
        org.junit.Assert.assertNotNull(slimTableFactory26);
        org.junit.Assert.assertNull(wildcardClass28);
        org.junit.Assert.assertNull(wildcardClass30);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertNotNull(strMap33);
        org.junit.Assert.assertNotNull(slimTableFactory34);
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "" + "'", str36, "");
        org.junit.Assert.assertNotNull(strMap37);
        org.junit.Assert.assertNotNull(strMap39);
        org.junit.Assert.assertNotNull(strMap40);
        org.junit.Assert.assertNull(wildcardClass45);
        org.junit.Assert.assertEquals("'" + str47 + "' != '" + "" + "'", str47, "");
        org.junit.Assert.assertNotNull(strMap48);
        org.junit.Assert.assertNotNull(slimTableFactory50);
        org.junit.Assert.assertNotNull(slimTableFactory51);
        org.junit.Assert.assertNotNull(strMap52);
        org.junit.Assert.assertEquals("'" + str54 + "' != '" + "hi!" + "'", str54, "hi!");
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + false + "'", boolean56 == false);
        org.junit.Assert.assertEquals("'" + str58 + "' != '" + "hi!" + "'", str58, "hi!");
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + false + "'", boolean60 == false);
        org.junit.Assert.assertEquals("'" + str62 + "' != '" + "" + "'", str62, "");
        org.junit.Assert.assertNotNull(slimTableFactory63);
        org.junit.Assert.assertNotNull(strMap64);
        org.junit.Assert.assertNotNull(strMap65);
        org.junit.Assert.assertNotNull(strMap67);
        org.junit.Assert.assertTrue("'" + boolean69 + "' != '" + false + "'", boolean69 == false);
        org.junit.Assert.assertNotNull(strMap70);
        org.junit.Assert.assertNotNull(wildcardClass71);
    }

    @Test
    public void test18116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18116");
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory0 = new fitnesse.testsystems.slim.tables.SlimTableFactory();
        java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable> wildcardClass2 = slimTableFactory0.getTableType("");
        java.lang.String str4 = slimTableFactory0.getFullTableName("");
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory5 = slimTableFactory0.copy();
        boolean boolean7 = slimTableFactory0.hasColon("");
        java.util.Map<java.lang.String, java.lang.String> strMap8 = slimTableFactory0.tableTypeArrays;
        java.util.Map<java.lang.String, java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable>> strMap9 = slimTableFactory0.tableTypes;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory10 = slimTableFactory0.copy();
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory11 = new fitnesse.testsystems.slim.tables.SlimTableFactory();
        java.lang.String str13 = slimTableFactory11.getFullTableName("hi!");
        java.lang.String str15 = slimTableFactory11.makeTableType("");
        java.util.Map<java.lang.String, java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable>> strMap16 = slimTableFactory11.tableTypes;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory17 = new fitnesse.testsystems.slim.tables.SlimTableFactory();
        java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable> wildcardClass19 = slimTableFactory17.getTableType("");
        java.lang.String str21 = slimTableFactory17.getFullTableName("");
        java.util.Map<java.lang.String, java.lang.String> strMap22 = slimTableFactory17.tableTypeArrays;
        slimTableFactory11.tableTypeArrays = strMap22;
        slimTableFactory10.tableTypeArrays = strMap22;
        java.lang.String str26 = slimTableFactory10.makeTableType("");
        java.util.Map<java.lang.String, java.lang.String> strMap27 = slimTableFactory10.tableTypeArrays;
        boolean boolean29 = slimTableFactory10.hasColon("");
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory30 = new fitnesse.testsystems.slim.tables.SlimTableFactory();
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory31 = new fitnesse.testsystems.slim.tables.SlimTableFactory();
        java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable> wildcardClass33 = slimTableFactory31.getTableType("");
        java.lang.String str35 = slimTableFactory31.getFullTableName("");
        java.util.Map<java.lang.String, java.lang.String> strMap36 = slimTableFactory31.tableTypeArrays;
        slimTableFactory30.tableTypeArrays = strMap36;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory38 = slimTableFactory30.copy();
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory39 = slimTableFactory38.copy();
        java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable> wildcardClass41 = slimTableFactory39.getTableType("hi!");
        java.util.Map<java.lang.String, java.lang.String> strMap42 = slimTableFactory39.tableTypeArrays;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory43 = new fitnesse.testsystems.slim.tables.SlimTableFactory();
        java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable> wildcardClass45 = slimTableFactory43.getTableType("");
        boolean boolean47 = slimTableFactory43.hasColon("");
        boolean boolean49 = slimTableFactory43.hasColon("hi!");
        java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable> wildcardClass51 = slimTableFactory43.getTableType("hi!");
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory52 = new fitnesse.testsystems.slim.tables.SlimTableFactory();
        java.lang.String str54 = slimTableFactory52.getFullTableName("hi!");
        java.lang.String str56 = slimTableFactory52.makeTableType("");
        java.util.Map<java.lang.String, java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable>> strMap57 = slimTableFactory52.tableTypes;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory58 = new fitnesse.testsystems.slim.tables.SlimTableFactory();
        java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable> wildcardClass60 = slimTableFactory58.getTableType("");
        java.lang.String str62 = slimTableFactory58.getFullTableName("");
        java.util.Map<java.lang.String, java.lang.String> strMap63 = slimTableFactory58.tableTypeArrays;
        slimTableFactory52.tableTypeArrays = strMap63;
        slimTableFactory43.tableTypeArrays = strMap63;
        slimTableFactory39.tableTypeArrays = strMap63;
        slimTableFactory10.tableTypeArrays = strMap63;
        java.lang.String str69 = slimTableFactory10.makeTableType("");
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory70 = slimTableFactory10.copy();
        java.lang.String str72 = slimTableFactory70.getFullTableName("hi!");
        java.util.Map<java.lang.String, java.lang.String> strMap73 = slimTableFactory70.tableTypeArrays;
        java.util.Map<java.lang.String, java.lang.String> strMap74 = slimTableFactory70.tableTypeArrays;
        org.junit.Assert.assertNull(wildcardClass2);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(slimTableFactory5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(strMap8);
        org.junit.Assert.assertNotNull(strMap9);
        org.junit.Assert.assertNotNull(slimTableFactory10);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertNotNull(strMap16);
        org.junit.Assert.assertNull(wildcardClass19);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertNotNull(strMap22);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "" + "'", str26, "");
        org.junit.Assert.assertNotNull(strMap27);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertNull(wildcardClass33);
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "" + "'", str35, "");
        org.junit.Assert.assertNotNull(strMap36);
        org.junit.Assert.assertNotNull(slimTableFactory38);
        org.junit.Assert.assertNotNull(slimTableFactory39);
        org.junit.Assert.assertNull(wildcardClass41);
        org.junit.Assert.assertNotNull(strMap42);
        org.junit.Assert.assertNull(wildcardClass45);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
        org.junit.Assert.assertNull(wildcardClass51);
        org.junit.Assert.assertEquals("'" + str54 + "' != '" + "hi!" + "'", str54, "hi!");
        org.junit.Assert.assertEquals("'" + str56 + "' != '" + "" + "'", str56, "");
        org.junit.Assert.assertNotNull(strMap57);
        org.junit.Assert.assertNull(wildcardClass60);
        org.junit.Assert.assertEquals("'" + str62 + "' != '" + "" + "'", str62, "");
        org.junit.Assert.assertNotNull(strMap63);
        org.junit.Assert.assertEquals("'" + str69 + "' != '" + "" + "'", str69, "");
        org.junit.Assert.assertNotNull(slimTableFactory70);
        org.junit.Assert.assertEquals("'" + str72 + "' != '" + "hi!" + "'", str72, "hi!");
        org.junit.Assert.assertNotNull(strMap73);
        org.junit.Assert.assertNotNull(strMap74);
    }

    @Test
    public void test18117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18117");
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory0 = new fitnesse.testsystems.slim.tables.SlimTableFactory();
        java.lang.String str2 = slimTableFactory0.getFullTableName("hi!");
        java.lang.String str4 = slimTableFactory0.makeTableType("");
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory5 = slimTableFactory0.copy();
        java.lang.String str7 = slimTableFactory0.getFullTableName("");
        boolean boolean9 = slimTableFactory0.hasColon("hi!");
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory10 = slimTableFactory0.copy();
        java.util.Map<java.lang.String, java.lang.String> strMap11 = slimTableFactory10.tableTypeArrays;
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!" + "'", str2, "hi!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(slimTableFactory5);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(slimTableFactory10);
        org.junit.Assert.assertNotNull(strMap11);
    }

    @Test
    public void test18118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18118");
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory0 = new fitnesse.testsystems.slim.tables.SlimTableFactory();
        java.lang.String str2 = slimTableFactory0.getFullTableName("hi!");
        java.util.Map<java.lang.String, java.lang.String> strMap3 = slimTableFactory0.tableTypeArrays;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory4 = slimTableFactory0.copy();
        java.util.Map<java.lang.String, java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable>> strMap5 = slimTableFactory4.tableTypes;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory6 = slimTableFactory4.copy();
        java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable> wildcardClass8 = slimTableFactory4.getTableType("hi!");
        java.lang.String str10 = slimTableFactory4.getFullTableName("hi!");
        boolean boolean12 = slimTableFactory4.hasColon("hi!");
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory13 = slimTableFactory4.copy();
        java.lang.String str15 = slimTableFactory13.getFullTableName("");
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory16 = new fitnesse.testsystems.slim.tables.SlimTableFactory();
        java.lang.String str18 = slimTableFactory16.getFullTableName("hi!");
        java.util.Map<java.lang.String, java.lang.String> strMap19 = slimTableFactory16.tableTypeArrays;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory20 = new fitnesse.testsystems.slim.tables.SlimTableFactory();
        java.lang.String str22 = slimTableFactory20.getFullTableName("hi!");
        java.util.Map<java.lang.String, java.lang.String> strMap23 = slimTableFactory20.tableTypeArrays;
        slimTableFactory16.tableTypeArrays = strMap23;
        java.lang.String str26 = slimTableFactory16.getFullTableName("");
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory27 = slimTableFactory16.copy();
        java.util.Map<java.lang.String, java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable>> strMap28 = slimTableFactory16.tableTypes;
        java.util.Map<java.lang.String, java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable>> strMap29 = slimTableFactory16.tableTypes;
        java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable> wildcardClass31 = slimTableFactory16.getTableType("");
        java.util.Map<java.lang.String, java.lang.String> strMap32 = slimTableFactory16.tableTypeArrays;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory33 = slimTableFactory16.copy();
        java.lang.String str35 = slimTableFactory16.getFullTableName("");
        java.util.Map<java.lang.String, java.lang.String> strMap36 = slimTableFactory16.tableTypeArrays;
        slimTableFactory13.tableTypeArrays = strMap36;
        java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable> wildcardClass39 = slimTableFactory13.getTableType("");
        java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable> wildcardClass41 = slimTableFactory13.getTableType("hi!");
        java.lang.String str43 = slimTableFactory13.makeTableType("");
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory44 = slimTableFactory13.copy();
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory45 = slimTableFactory13.copy();
        fitnesse.testsystems.slim.Table table46 = null;
        // The following exception was thrown during execution in test generation
        try {
            slimTableFactory13.parseDefineTableTypeRow(table46, (int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!" + "'", str2, "hi!");
        org.junit.Assert.assertNotNull(strMap3);
        org.junit.Assert.assertNotNull(slimTableFactory4);
        org.junit.Assert.assertNotNull(strMap5);
        org.junit.Assert.assertNotNull(slimTableFactory6);
        org.junit.Assert.assertNull(wildcardClass8);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(slimTableFactory13);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!" + "'", str18, "hi!");
        org.junit.Assert.assertNotNull(strMap19);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "hi!" + "'", str22, "hi!");
        org.junit.Assert.assertNotNull(strMap23);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "" + "'", str26, "");
        org.junit.Assert.assertNotNull(slimTableFactory27);
        org.junit.Assert.assertNotNull(strMap28);
        org.junit.Assert.assertNotNull(strMap29);
        org.junit.Assert.assertNull(wildcardClass31);
        org.junit.Assert.assertNotNull(strMap32);
        org.junit.Assert.assertNotNull(slimTableFactory33);
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "" + "'", str35, "");
        org.junit.Assert.assertNotNull(strMap36);
        org.junit.Assert.assertNull(wildcardClass39);
        org.junit.Assert.assertNull(wildcardClass41);
        org.junit.Assert.assertEquals("'" + str43 + "' != '" + "" + "'", str43, "");
        org.junit.Assert.assertNotNull(slimTableFactory44);
        org.junit.Assert.assertNotNull(slimTableFactory45);
    }

    @Test
    public void test18119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18119");
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory0 = new fitnesse.testsystems.slim.tables.SlimTableFactory();
        java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable> wildcardClass2 = slimTableFactory0.getTableType("");
        java.lang.String str4 = slimTableFactory0.getFullTableName("");
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory5 = slimTableFactory0.copy();
        java.lang.String str7 = slimTableFactory0.makeTableType("hi!");
        java.util.Map<java.lang.String, java.lang.String> strMap8 = slimTableFactory0.tableTypeArrays;
        java.util.Map<java.lang.String, java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable>> strMap9 = slimTableFactory0.tableTypes;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory10 = slimTableFactory0.copy();
        java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable> wildcardClass12 = slimTableFactory0.getTableType("hi!");
        java.lang.String str14 = slimTableFactory0.getFullTableName("hi!");
        java.util.Map<java.lang.String, java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable>> strMap15 = slimTableFactory0.tableTypes;
        java.lang.String str17 = slimTableFactory0.makeTableType("");
        java.lang.String str19 = slimTableFactory0.getFullTableName("");
        java.util.Map<java.lang.String, java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable>> strMap20 = slimTableFactory0.tableTypes;
        boolean boolean22 = slimTableFactory0.hasColon("hi!");
        org.junit.Assert.assertNull(wildcardClass2);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(slimTableFactory5);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertNotNull(strMap8);
        org.junit.Assert.assertNotNull(strMap9);
        org.junit.Assert.assertNotNull(slimTableFactory10);
        org.junit.Assert.assertNull(wildcardClass12);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertNotNull(strMap15);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertNotNull(strMap20);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
    }

    @Test
    public void test18120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18120");
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory0 = new fitnesse.testsystems.slim.tables.SlimTableFactory();
        java.lang.String str2 = slimTableFactory0.getFullTableName("hi!");
        java.util.Map<java.lang.String, java.lang.String> strMap3 = slimTableFactory0.tableTypeArrays;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory4 = new fitnesse.testsystems.slim.tables.SlimTableFactory();
        java.lang.String str6 = slimTableFactory4.getFullTableName("hi!");
        java.util.Map<java.lang.String, java.lang.String> strMap7 = slimTableFactory4.tableTypeArrays;
        slimTableFactory0.tableTypeArrays = strMap7;
        java.lang.String str10 = slimTableFactory0.getFullTableName("");
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory11 = slimTableFactory0.copy();
        java.util.Map<java.lang.String, java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable>> strMap12 = slimTableFactory0.tableTypes;
        java.util.Map<java.lang.String, java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable>> strMap13 = slimTableFactory0.tableTypes;
        java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable> wildcardClass15 = slimTableFactory0.getTableType("");
        java.util.Map<java.lang.String, java.lang.String> strMap16 = slimTableFactory0.tableTypeArrays;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory17 = slimTableFactory0.copy();
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory18 = new fitnesse.testsystems.slim.tables.SlimTableFactory();
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory19 = new fitnesse.testsystems.slim.tables.SlimTableFactory();
        java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable> wildcardClass21 = slimTableFactory19.getTableType("");
        java.lang.String str23 = slimTableFactory19.getFullTableName("");
        java.util.Map<java.lang.String, java.lang.String> strMap24 = slimTableFactory19.tableTypeArrays;
        slimTableFactory18.tableTypeArrays = strMap24;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory26 = slimTableFactory18.copy();
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory27 = slimTableFactory26.copy();
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory28 = slimTableFactory26.copy();
        boolean boolean30 = slimTableFactory28.hasColon("");
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory31 = slimTableFactory28.copy();
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory32 = new fitnesse.testsystems.slim.tables.SlimTableFactory();
        java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable> wildcardClass34 = slimTableFactory32.getTableType("");
        java.lang.String str36 = slimTableFactory32.getFullTableName("");
        java.util.Map<java.lang.String, java.lang.String> strMap37 = slimTableFactory32.tableTypeArrays;
        slimTableFactory28.tableTypeArrays = strMap37;
        slimTableFactory0.tableTypeArrays = strMap37;
        java.util.Map<java.lang.String, java.lang.String> strMap40 = slimTableFactory0.tableTypeArrays;
        java.util.Map<java.lang.String, java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable>> strMap41 = slimTableFactory0.tableTypes;
        java.util.Map<java.lang.String, java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable>> strMap42 = slimTableFactory0.tableTypes;
        java.lang.String str44 = slimTableFactory0.makeTableType("hi!");
        java.lang.String str46 = slimTableFactory0.makeTableType("hi!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!" + "'", str2, "hi!");
        org.junit.Assert.assertNotNull(strMap3);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertNotNull(strMap7);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNotNull(slimTableFactory11);
        org.junit.Assert.assertNotNull(strMap12);
        org.junit.Assert.assertNotNull(strMap13);
        org.junit.Assert.assertNull(wildcardClass15);
        org.junit.Assert.assertNotNull(strMap16);
        org.junit.Assert.assertNotNull(slimTableFactory17);
        org.junit.Assert.assertNull(wildcardClass21);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
        org.junit.Assert.assertNotNull(strMap24);
        org.junit.Assert.assertNotNull(slimTableFactory26);
        org.junit.Assert.assertNotNull(slimTableFactory27);
        org.junit.Assert.assertNotNull(slimTableFactory28);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertNotNull(slimTableFactory31);
        org.junit.Assert.assertNull(wildcardClass34);
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "" + "'", str36, "");
        org.junit.Assert.assertNotNull(strMap37);
        org.junit.Assert.assertNotNull(strMap40);
        org.junit.Assert.assertNotNull(strMap41);
        org.junit.Assert.assertNotNull(strMap42);
        org.junit.Assert.assertEquals("'" + str44 + "' != '" + "hi!" + "'", str44, "hi!");
        org.junit.Assert.assertEquals("'" + str46 + "' != '" + "hi!" + "'", str46, "hi!");
    }

    @Test
    public void test18121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18121");
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory0 = new fitnesse.testsystems.slim.tables.SlimTableFactory();
        java.lang.String str2 = slimTableFactory0.getFullTableName("hi!");
        java.util.Map<java.lang.String, java.lang.String> strMap3 = slimTableFactory0.tableTypeArrays;
        java.lang.String str5 = slimTableFactory0.makeTableType("");
        java.util.Map<java.lang.String, java.lang.String> strMap6 = slimTableFactory0.tableTypeArrays;
        java.lang.String str8 = slimTableFactory0.makeTableType("");
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory9 = slimTableFactory0.copy();
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory10 = slimTableFactory9.copy();
        java.util.Map<java.lang.String, java.lang.String> strMap11 = slimTableFactory9.tableTypeArrays;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory12 = slimTableFactory9.copy();
        java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable> wildcardClass14 = slimTableFactory12.getTableType("");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!" + "'", str2, "hi!");
        org.junit.Assert.assertNotNull(strMap3);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(strMap6);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNotNull(slimTableFactory9);
        org.junit.Assert.assertNotNull(slimTableFactory10);
        org.junit.Assert.assertNotNull(strMap11);
        org.junit.Assert.assertNotNull(slimTableFactory12);
        org.junit.Assert.assertNull(wildcardClass14);
    }

    @Test
    public void test18122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18122");
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory0 = new fitnesse.testsystems.slim.tables.SlimTableFactory();
        java.lang.String str2 = slimTableFactory0.getFullTableName("hi!");
        java.util.Map<java.lang.String, java.lang.String> strMap3 = slimTableFactory0.tableTypeArrays;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory4 = new fitnesse.testsystems.slim.tables.SlimTableFactory();
        java.lang.String str6 = slimTableFactory4.getFullTableName("hi!");
        java.util.Map<java.lang.String, java.lang.String> strMap7 = slimTableFactory4.tableTypeArrays;
        slimTableFactory0.tableTypeArrays = strMap7;
        java.lang.String str10 = slimTableFactory0.getFullTableName("");
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory11 = slimTableFactory0.copy();
        java.util.Map<java.lang.String, java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable>> strMap12 = slimTableFactory0.tableTypes;
        java.util.Map<java.lang.String, java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable>> strMap13 = slimTableFactory0.tableTypes;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory14 = new fitnesse.testsystems.slim.tables.SlimTableFactory();
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory15 = new fitnesse.testsystems.slim.tables.SlimTableFactory();
        java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable> wildcardClass17 = slimTableFactory15.getTableType("");
        java.lang.String str19 = slimTableFactory15.getFullTableName("");
        java.util.Map<java.lang.String, java.lang.String> strMap20 = slimTableFactory15.tableTypeArrays;
        slimTableFactory14.tableTypeArrays = strMap20;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory22 = slimTableFactory14.copy();
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory23 = slimTableFactory22.copy();
        java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable> wildcardClass25 = slimTableFactory23.getTableType("hi!");
        java.util.Map<java.lang.String, java.lang.String> strMap26 = slimTableFactory23.tableTypeArrays;
        slimTableFactory0.tableTypeArrays = strMap26;
        java.lang.String str29 = slimTableFactory0.makeTableType("hi!");
        java.lang.String str31 = slimTableFactory0.getFullTableName("");
        java.lang.String str33 = slimTableFactory0.makeTableType("");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!" + "'", str2, "hi!");
        org.junit.Assert.assertNotNull(strMap3);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertNotNull(strMap7);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNotNull(slimTableFactory11);
        org.junit.Assert.assertNotNull(strMap12);
        org.junit.Assert.assertNotNull(strMap13);
        org.junit.Assert.assertNull(wildcardClass17);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertNotNull(strMap20);
        org.junit.Assert.assertNotNull(slimTableFactory22);
        org.junit.Assert.assertNotNull(slimTableFactory23);
        org.junit.Assert.assertNull(wildcardClass25);
        org.junit.Assert.assertNotNull(strMap26);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "hi!" + "'", str29, "hi!");
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "" + "'", str31, "");
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "" + "'", str33, "");
    }

    @Test
    public void test18123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18123");
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory0 = new fitnesse.testsystems.slim.tables.SlimTableFactory();
        java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable> wildcardClass2 = slimTableFactory0.getTableType("");
        java.lang.String str4 = slimTableFactory0.getFullTableName("");
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory5 = slimTableFactory0.copy();
        java.lang.String str7 = slimTableFactory0.makeTableType("hi!");
        java.util.Map<java.lang.String, java.lang.String> strMap8 = slimTableFactory0.tableTypeArrays;
        java.util.Map<java.lang.String, java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable>> strMap9 = slimTableFactory0.tableTypes;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory10 = slimTableFactory0.copy();
        java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable> wildcardClass12 = slimTableFactory0.getTableType("hi!");
        java.util.Map<java.lang.String, java.lang.String> strMap13 = null;
        slimTableFactory0.tableTypeArrays = strMap13;
        boolean boolean16 = slimTableFactory0.hasColon("");
        java.util.Map<java.lang.String, java.lang.String> strMap17 = slimTableFactory0.tableTypeArrays;
        java.util.Map<java.lang.String, java.lang.String> strMap18 = slimTableFactory0.tableTypeArrays;
        java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable> wildcardClass20 = slimTableFactory0.getTableType("hi!");
        java.util.Map<java.lang.String, java.lang.String> strMap21 = slimTableFactory0.tableTypeArrays;
        fitnesse.testsystems.slim.Table table22 = null;
        // The following exception was thrown during execution in test generation
        try {
            fitnesse.testsystems.slim.tables.SlimTable slimTable23 = slimTableFactory0.parseDefineTableTypeTable(table22);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(wildcardClass2);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(slimTableFactory5);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertNotNull(strMap8);
        org.junit.Assert.assertNotNull(strMap9);
        org.junit.Assert.assertNotNull(slimTableFactory10);
        org.junit.Assert.assertNull(wildcardClass12);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNull(strMap17);
        org.junit.Assert.assertNull(strMap18);
        org.junit.Assert.assertNull(wildcardClass20);
        org.junit.Assert.assertNull(strMap21);
    }

    @Test
    public void test18124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18124");
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory0 = new fitnesse.testsystems.slim.tables.SlimTableFactory();
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory1 = new fitnesse.testsystems.slim.tables.SlimTableFactory();
        java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable> wildcardClass3 = slimTableFactory1.getTableType("");
        java.lang.String str5 = slimTableFactory1.getFullTableName("");
        java.util.Map<java.lang.String, java.lang.String> strMap6 = slimTableFactory1.tableTypeArrays;
        slimTableFactory0.tableTypeArrays = strMap6;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory8 = slimTableFactory0.copy();
        java.lang.String str10 = slimTableFactory0.getFullTableName("hi!");
        java.util.Map<java.lang.String, java.lang.String> strMap11 = slimTableFactory0.tableTypeArrays;
        boolean boolean13 = slimTableFactory0.hasColon("hi!");
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory14 = slimTableFactory0.copy();
        boolean boolean16 = slimTableFactory14.hasColon("");
        fitnesse.testsystems.slim.Table table17 = null;
        // The following exception was thrown during execution in test generation
        try {
            slimTableFactory14.parseDefineTableTypeRow(table17, 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(wildcardClass3);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(strMap6);
        org.junit.Assert.assertNotNull(slimTableFactory8);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertNotNull(strMap11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(slimTableFactory14);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test18125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18125");
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory0 = new fitnesse.testsystems.slim.tables.SlimTableFactory();
        java.lang.String str2 = slimTableFactory0.getFullTableName("hi!");
        java.util.Map<java.lang.String, java.lang.String> strMap3 = slimTableFactory0.tableTypeArrays;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory4 = new fitnesse.testsystems.slim.tables.SlimTableFactory();
        java.lang.String str6 = slimTableFactory4.getFullTableName("hi!");
        java.util.Map<java.lang.String, java.lang.String> strMap7 = slimTableFactory4.tableTypeArrays;
        slimTableFactory0.tableTypeArrays = strMap7;
        java.lang.String str10 = slimTableFactory0.getFullTableName("");
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory11 = slimTableFactory0.copy();
        java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable> wildcardClass13 = slimTableFactory11.getTableType("hi!");
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory14 = new fitnesse.testsystems.slim.tables.SlimTableFactory();
        java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable> wildcardClass16 = slimTableFactory14.getTableType("");
        boolean boolean18 = slimTableFactory14.hasColon("");
        boolean boolean20 = slimTableFactory14.hasColon("hi!");
        java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable> wildcardClass22 = slimTableFactory14.getTableType("hi!");
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory23 = new fitnesse.testsystems.slim.tables.SlimTableFactory();
        java.lang.String str25 = slimTableFactory23.getFullTableName("hi!");
        java.lang.String str27 = slimTableFactory23.makeTableType("");
        java.util.Map<java.lang.String, java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable>> strMap28 = slimTableFactory23.tableTypes;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory29 = new fitnesse.testsystems.slim.tables.SlimTableFactory();
        java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable> wildcardClass31 = slimTableFactory29.getTableType("");
        java.lang.String str33 = slimTableFactory29.getFullTableName("");
        java.util.Map<java.lang.String, java.lang.String> strMap34 = slimTableFactory29.tableTypeArrays;
        slimTableFactory23.tableTypeArrays = strMap34;
        slimTableFactory14.tableTypeArrays = strMap34;
        slimTableFactory11.tableTypeArrays = strMap34;
        boolean boolean39 = slimTableFactory11.hasColon("hi!");
        java.util.Map<java.lang.String, java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable>> strMap40 = slimTableFactory11.tableTypes;
        java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable> wildcardClass42 = slimTableFactory11.getTableType("");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!" + "'", str2, "hi!");
        org.junit.Assert.assertNotNull(strMap3);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertNotNull(strMap7);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNotNull(slimTableFactory11);
        org.junit.Assert.assertNull(wildcardClass13);
        org.junit.Assert.assertNull(wildcardClass16);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNull(wildcardClass22);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "hi!" + "'", str25, "hi!");
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "" + "'", str27, "");
        org.junit.Assert.assertNotNull(strMap28);
        org.junit.Assert.assertNull(wildcardClass31);
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "" + "'", str33, "");
        org.junit.Assert.assertNotNull(strMap34);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertNotNull(strMap40);
        org.junit.Assert.assertNull(wildcardClass42);
    }

    @Test
    public void test18126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18126");
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory0 = new fitnesse.testsystems.slim.tables.SlimTableFactory();
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory1 = new fitnesse.testsystems.slim.tables.SlimTableFactory();
        java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable> wildcardClass3 = slimTableFactory1.getTableType("");
        java.lang.String str5 = slimTableFactory1.getFullTableName("");
        java.util.Map<java.lang.String, java.lang.String> strMap6 = slimTableFactory1.tableTypeArrays;
        slimTableFactory0.tableTypeArrays = strMap6;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory8 = slimTableFactory0.copy();
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory9 = slimTableFactory8.copy();
        java.util.Map<java.lang.String, java.lang.String> strMap10 = slimTableFactory9.tableTypeArrays;
        java.lang.String str12 = slimTableFactory9.makeTableType("hi!");
        java.util.Map<java.lang.String, java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable>> strMap13 = slimTableFactory9.tableTypes;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory14 = slimTableFactory9.copy();
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory15 = new fitnesse.testsystems.slim.tables.SlimTableFactory();
        java.lang.String str17 = slimTableFactory15.getFullTableName("hi!");
        java.lang.String str19 = slimTableFactory15.makeTableType("");
        java.util.Map<java.lang.String, java.lang.String> strMap20 = null;
        slimTableFactory15.tableTypeArrays = strMap20;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory22 = new fitnesse.testsystems.slim.tables.SlimTableFactory();
        java.lang.String str24 = slimTableFactory22.getFullTableName("hi!");
        java.util.Map<java.lang.String, java.lang.String> strMap25 = slimTableFactory22.tableTypeArrays;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory26 = slimTableFactory22.copy();
        java.util.Map<java.lang.String, java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable>> strMap27 = slimTableFactory26.tableTypes;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory28 = slimTableFactory26.copy();
        java.util.Map<java.lang.String, java.lang.String> strMap29 = slimTableFactory28.tableTypeArrays;
        java.util.Map<java.lang.String, java.lang.String> strMap30 = slimTableFactory28.tableTypeArrays;
        slimTableFactory15.tableTypeArrays = strMap30;
        java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable> wildcardClass33 = slimTableFactory15.getTableType("hi!");
        java.util.Map<java.lang.String, java.lang.String> strMap34 = slimTableFactory15.tableTypeArrays;
        slimTableFactory9.tableTypeArrays = strMap34;
        java.lang.String str37 = slimTableFactory9.makeTableType("hi!");
        java.lang.String str39 = slimTableFactory9.makeTableType("hi!");
        org.junit.Assert.assertNull(wildcardClass3);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(strMap6);
        org.junit.Assert.assertNotNull(slimTableFactory8);
        org.junit.Assert.assertNotNull(slimTableFactory9);
        org.junit.Assert.assertNotNull(strMap10);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertNotNull(strMap13);
        org.junit.Assert.assertNotNull(slimTableFactory14);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "hi!" + "'", str24, "hi!");
        org.junit.Assert.assertNotNull(strMap25);
        org.junit.Assert.assertNotNull(slimTableFactory26);
        org.junit.Assert.assertNotNull(strMap27);
        org.junit.Assert.assertNotNull(slimTableFactory28);
        org.junit.Assert.assertNotNull(strMap29);
        org.junit.Assert.assertNotNull(strMap30);
        org.junit.Assert.assertNull(wildcardClass33);
        org.junit.Assert.assertNotNull(strMap34);
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "hi!" + "'", str37, "hi!");
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "hi!" + "'", str39, "hi!");
    }

    @Test
    public void test18127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18127");
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory0 = new fitnesse.testsystems.slim.tables.SlimTableFactory();
        java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable> wildcardClass2 = slimTableFactory0.getTableType("");
        java.lang.String str4 = slimTableFactory0.getFullTableName("");
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory5 = slimTableFactory0.copy();
        boolean boolean7 = slimTableFactory0.hasColon("");
        java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable> wildcardClass9 = slimTableFactory0.getTableType("");
        java.lang.String str11 = slimTableFactory0.makeTableType("");
        java.lang.String str13 = slimTableFactory0.makeTableType("");
        java.lang.String str15 = slimTableFactory0.makeTableType("hi!");
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory16 = slimTableFactory0.copy();
        boolean boolean18 = slimTableFactory0.hasColon("");
        fitnesse.testsystems.slim.Table table19 = null;
        // The following exception was thrown during execution in test generation
        try {
            fitnesse.testsystems.slim.tables.SlimTable slimTable20 = slimTableFactory0.parseDefineTableTypeTable(table19);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(wildcardClass2);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(slimTableFactory5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(wildcardClass9);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertNotNull(slimTableFactory16);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test18128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18128");
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory0 = new fitnesse.testsystems.slim.tables.SlimTableFactory();
        java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable> wildcardClass2 = slimTableFactory0.getTableType("");
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory3 = slimTableFactory0.copy();
        java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable> wildcardClass5 = slimTableFactory0.getTableType("");
        java.lang.String str7 = slimTableFactory0.getFullTableName("hi!");
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory8 = slimTableFactory0.copy();
        java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable> wildcardClass10 = slimTableFactory0.getTableType("");
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory11 = slimTableFactory0.copy();
        org.junit.Assert.assertNull(wildcardClass2);
        org.junit.Assert.assertNotNull(slimTableFactory3);
        org.junit.Assert.assertNull(wildcardClass5);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertNotNull(slimTableFactory8);
        org.junit.Assert.assertNull(wildcardClass10);
        org.junit.Assert.assertNotNull(slimTableFactory11);
    }

    @Test
    public void test18129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18129");
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory0 = new fitnesse.testsystems.slim.tables.SlimTableFactory();
        java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable> wildcardClass2 = slimTableFactory0.getTableType("");
        java.lang.String str4 = slimTableFactory0.getFullTableName("");
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory5 = slimTableFactory0.copy();
        boolean boolean7 = slimTableFactory0.hasColon("");
        java.util.Map<java.lang.String, java.lang.String> strMap8 = slimTableFactory0.tableTypeArrays;
        java.util.Map<java.lang.String, java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable>> strMap9 = slimTableFactory0.tableTypes;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory10 = slimTableFactory0.copy();
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory11 = new fitnesse.testsystems.slim.tables.SlimTableFactory();
        java.lang.String str13 = slimTableFactory11.getFullTableName("hi!");
        java.lang.String str15 = slimTableFactory11.makeTableType("");
        java.util.Map<java.lang.String, java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable>> strMap16 = slimTableFactory11.tableTypes;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory17 = new fitnesse.testsystems.slim.tables.SlimTableFactory();
        java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable> wildcardClass19 = slimTableFactory17.getTableType("");
        java.lang.String str21 = slimTableFactory17.getFullTableName("");
        java.util.Map<java.lang.String, java.lang.String> strMap22 = slimTableFactory17.tableTypeArrays;
        slimTableFactory11.tableTypeArrays = strMap22;
        slimTableFactory10.tableTypeArrays = strMap22;
        java.lang.String str26 = slimTableFactory10.makeTableType("");
        java.util.Map<java.lang.String, java.lang.String> strMap27 = slimTableFactory10.tableTypeArrays;
        boolean boolean29 = slimTableFactory10.hasColon("");
        java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable> wildcardClass31 = slimTableFactory10.getTableType("hi!");
        java.lang.Class<?> wildcardClass32 = slimTableFactory10.getClass();
        org.junit.Assert.assertNull(wildcardClass2);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(slimTableFactory5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(strMap8);
        org.junit.Assert.assertNotNull(strMap9);
        org.junit.Assert.assertNotNull(slimTableFactory10);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertNotNull(strMap16);
        org.junit.Assert.assertNull(wildcardClass19);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertNotNull(strMap22);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "" + "'", str26, "");
        org.junit.Assert.assertNotNull(strMap27);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertNull(wildcardClass31);
        org.junit.Assert.assertNotNull(wildcardClass32);
    }

    @Test
    public void test18130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18130");
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory0 = new fitnesse.testsystems.slim.tables.SlimTableFactory();
        java.lang.String str2 = slimTableFactory0.getFullTableName("hi!");
        java.util.Map<java.lang.String, java.lang.String> strMap3 = slimTableFactory0.tableTypeArrays;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory4 = new fitnesse.testsystems.slim.tables.SlimTableFactory();
        java.lang.String str6 = slimTableFactory4.getFullTableName("hi!");
        java.util.Map<java.lang.String, java.lang.String> strMap7 = slimTableFactory4.tableTypeArrays;
        slimTableFactory0.tableTypeArrays = strMap7;
        java.lang.String str10 = slimTableFactory0.getFullTableName("");
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory11 = slimTableFactory0.copy();
        java.util.Map<java.lang.String, java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable>> strMap12 = slimTableFactory0.tableTypes;
        java.util.Map<java.lang.String, java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable>> strMap13 = slimTableFactory0.tableTypes;
        java.util.Map<java.lang.String, java.lang.String> strMap14 = slimTableFactory0.tableTypeArrays;
        java.util.Map<java.lang.String, java.lang.String> strMap15 = slimTableFactory0.tableTypeArrays;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory16 = slimTableFactory0.copy();
        java.lang.String str18 = slimTableFactory0.makeTableType("");
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory19 = slimTableFactory0.copy();
        java.util.Map<java.lang.String, java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable>> strMap20 = slimTableFactory0.tableTypes;
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!" + "'", str2, "hi!");
        org.junit.Assert.assertNotNull(strMap3);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertNotNull(strMap7);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNotNull(slimTableFactory11);
        org.junit.Assert.assertNotNull(strMap12);
        org.junit.Assert.assertNotNull(strMap13);
        org.junit.Assert.assertNotNull(strMap14);
        org.junit.Assert.assertNotNull(strMap15);
        org.junit.Assert.assertNotNull(slimTableFactory16);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertNotNull(slimTableFactory19);
        org.junit.Assert.assertNotNull(strMap20);
    }

    @Test
    public void test18131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18131");
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory0 = new fitnesse.testsystems.slim.tables.SlimTableFactory();
        java.lang.String str2 = slimTableFactory0.getFullTableName("hi!");
        java.util.Map<java.lang.String, java.lang.String> strMap3 = slimTableFactory0.tableTypeArrays;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory4 = slimTableFactory0.copy();
        java.util.Map<java.lang.String, java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable>> strMap5 = slimTableFactory4.tableTypes;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory6 = slimTableFactory4.copy();
        java.lang.String str8 = slimTableFactory6.getFullTableName("hi!");
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory9 = slimTableFactory6.copy();
        java.util.Map<java.lang.String, java.lang.String> strMap10 = slimTableFactory6.tableTypeArrays;
        java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable> wildcardClass12 = slimTableFactory6.getTableType("");
        java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable> wildcardClass14 = slimTableFactory6.getTableType("");
        java.lang.String str16 = slimTableFactory6.makeTableType("");
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory17 = new fitnesse.testsystems.slim.tables.SlimTableFactory();
        java.lang.String str19 = slimTableFactory17.getFullTableName("hi!");
        java.util.Map<java.lang.String, java.lang.String> strMap20 = slimTableFactory17.tableTypeArrays;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory21 = new fitnesse.testsystems.slim.tables.SlimTableFactory();
        java.lang.String str23 = slimTableFactory21.getFullTableName("hi!");
        java.util.Map<java.lang.String, java.lang.String> strMap24 = slimTableFactory21.tableTypeArrays;
        slimTableFactory17.tableTypeArrays = strMap24;
        java.lang.String str27 = slimTableFactory17.makeTableType("");
        java.util.Map<java.lang.String, java.lang.String> strMap28 = slimTableFactory17.tableTypeArrays;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory29 = new fitnesse.testsystems.slim.tables.SlimTableFactory();
        java.lang.String str31 = slimTableFactory29.getFullTableName("hi!");
        java.util.Map<java.lang.String, java.lang.String> strMap32 = slimTableFactory29.tableTypeArrays;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory33 = slimTableFactory29.copy();
        java.util.Map<java.lang.String, java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable>> strMap34 = slimTableFactory33.tableTypes;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory35 = slimTableFactory33.copy();
        java.lang.String str37 = slimTableFactory35.getFullTableName("hi!");
        java.util.Map<java.lang.String, java.lang.String> strMap38 = slimTableFactory35.tableTypeArrays;
        slimTableFactory17.tableTypeArrays = strMap38;
        java.lang.String str41 = slimTableFactory17.makeTableType("");
        java.lang.String str43 = slimTableFactory17.getFullTableName("");
        boolean boolean45 = slimTableFactory17.hasColon("hi!");
        java.lang.String str47 = slimTableFactory17.getFullTableName("hi!");
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory48 = slimTableFactory17.copy();
        java.lang.String str50 = slimTableFactory48.getFullTableName("hi!");
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory51 = slimTableFactory48.copy();
        java.util.Map<java.lang.String, java.lang.String> strMap52 = slimTableFactory51.tableTypeArrays;
        slimTableFactory6.tableTypeArrays = strMap52;
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!" + "'", str2, "hi!");
        org.junit.Assert.assertNotNull(strMap3);
        org.junit.Assert.assertNotNull(slimTableFactory4);
        org.junit.Assert.assertNotNull(strMap5);
        org.junit.Assert.assertNotNull(slimTableFactory6);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertNotNull(slimTableFactory9);
        org.junit.Assert.assertNotNull(strMap10);
        org.junit.Assert.assertNull(wildcardClass12);
        org.junit.Assert.assertNull(wildcardClass14);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "hi!" + "'", str19, "hi!");
        org.junit.Assert.assertNotNull(strMap20);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "hi!" + "'", str23, "hi!");
        org.junit.Assert.assertNotNull(strMap24);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "" + "'", str27, "");
        org.junit.Assert.assertNotNull(strMap28);
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "hi!" + "'", str31, "hi!");
        org.junit.Assert.assertNotNull(strMap32);
        org.junit.Assert.assertNotNull(slimTableFactory33);
        org.junit.Assert.assertNotNull(strMap34);
        org.junit.Assert.assertNotNull(slimTableFactory35);
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "hi!" + "'", str37, "hi!");
        org.junit.Assert.assertNotNull(strMap38);
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "" + "'", str41, "");
        org.junit.Assert.assertEquals("'" + str43 + "' != '" + "" + "'", str43, "");
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertEquals("'" + str47 + "' != '" + "hi!" + "'", str47, "hi!");
        org.junit.Assert.assertNotNull(slimTableFactory48);
        org.junit.Assert.assertEquals("'" + str50 + "' != '" + "hi!" + "'", str50, "hi!");
        org.junit.Assert.assertNotNull(slimTableFactory51);
        org.junit.Assert.assertNotNull(strMap52);
    }

    @Test
    public void test18132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18132");
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory0 = new fitnesse.testsystems.slim.tables.SlimTableFactory();
        java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable> wildcardClass2 = slimTableFactory0.getTableType("");
        boolean boolean4 = slimTableFactory0.hasColon("");
        boolean boolean6 = slimTableFactory0.hasColon("hi!");
        java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable> wildcardClass8 = slimTableFactory0.getTableType("hi!");
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory9 = new fitnesse.testsystems.slim.tables.SlimTableFactory();
        java.lang.String str11 = slimTableFactory9.getFullTableName("hi!");
        java.lang.String str13 = slimTableFactory9.makeTableType("");
        java.util.Map<java.lang.String, java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable>> strMap14 = slimTableFactory9.tableTypes;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory15 = new fitnesse.testsystems.slim.tables.SlimTableFactory();
        java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable> wildcardClass17 = slimTableFactory15.getTableType("");
        java.lang.String str19 = slimTableFactory15.getFullTableName("");
        java.util.Map<java.lang.String, java.lang.String> strMap20 = slimTableFactory15.tableTypeArrays;
        slimTableFactory9.tableTypeArrays = strMap20;
        slimTableFactory0.tableTypeArrays = strMap20;
        boolean boolean24 = slimTableFactory0.hasColon("");
        java.util.Map<java.lang.String, java.lang.String> strMap25 = slimTableFactory0.tableTypeArrays;
        boolean boolean27 = slimTableFactory0.hasColon("hi!");
        java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable> wildcardClass29 = slimTableFactory0.getTableType("hi!");
        boolean boolean31 = slimTableFactory0.hasColon("hi!");
        java.lang.String str33 = slimTableFactory0.getFullTableName("hi!");
        java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable> wildcardClass35 = slimTableFactory0.getTableType("hi!");
        boolean boolean37 = slimTableFactory0.hasColon("hi!");
        org.junit.Assert.assertNull(wildcardClass2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(wildcardClass8);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNotNull(strMap14);
        org.junit.Assert.assertNull(wildcardClass17);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertNotNull(strMap20);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(strMap25);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNull(wildcardClass29);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "hi!" + "'", str33, "hi!");
        org.junit.Assert.assertNull(wildcardClass35);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
    }

    @Test
    public void test18133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18133");
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory0 = new fitnesse.testsystems.slim.tables.SlimTableFactory();
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory1 = slimTableFactory0.copy();
        java.lang.String str3 = slimTableFactory0.makeTableType("hi!");
        java.util.Map<java.lang.String, java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable>> strMap4 = slimTableFactory0.tableTypes;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory5 = slimTableFactory0.copy();
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory6 = slimTableFactory5.copy();
        boolean boolean8 = slimTableFactory5.hasColon("hi!");
        java.util.Map<java.lang.String, java.lang.String> strMap9 = slimTableFactory5.tableTypeArrays;
        boolean boolean11 = slimTableFactory5.hasColon("");
        org.junit.Assert.assertNotNull(slimTableFactory1);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertNotNull(strMap4);
        org.junit.Assert.assertNotNull(slimTableFactory5);
        org.junit.Assert.assertNotNull(slimTableFactory6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(strMap9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test18134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18134");
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory0 = new fitnesse.testsystems.slim.tables.SlimTableFactory();
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory1 = slimTableFactory0.copy();
        java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable> wildcardClass3 = slimTableFactory1.getTableType("hi!");
        java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable> wildcardClass5 = slimTableFactory1.getTableType("hi!");
        boolean boolean7 = slimTableFactory1.hasColon("");
        java.util.Map<java.lang.String, java.lang.String> strMap8 = slimTableFactory1.tableTypeArrays;
        java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable> wildcardClass10 = slimTableFactory1.getTableType("hi!");
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory11 = slimTableFactory1.copy();
        java.lang.String str13 = slimTableFactory11.makeTableType("hi!");
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory14 = new fitnesse.testsystems.slim.tables.SlimTableFactory();
        java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable> wildcardClass16 = slimTableFactory14.getTableType("");
        boolean boolean18 = slimTableFactory14.hasColon("");
        boolean boolean20 = slimTableFactory14.hasColon("hi!");
        java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable> wildcardClass22 = slimTableFactory14.getTableType("hi!");
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory23 = new fitnesse.testsystems.slim.tables.SlimTableFactory();
        java.lang.String str25 = slimTableFactory23.getFullTableName("hi!");
        java.lang.String str27 = slimTableFactory23.makeTableType("");
        java.util.Map<java.lang.String, java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable>> strMap28 = slimTableFactory23.tableTypes;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory29 = new fitnesse.testsystems.slim.tables.SlimTableFactory();
        java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable> wildcardClass31 = slimTableFactory29.getTableType("");
        java.lang.String str33 = slimTableFactory29.getFullTableName("");
        java.util.Map<java.lang.String, java.lang.String> strMap34 = slimTableFactory29.tableTypeArrays;
        slimTableFactory23.tableTypeArrays = strMap34;
        slimTableFactory14.tableTypeArrays = strMap34;
        boolean boolean38 = slimTableFactory14.hasColon("");
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory39 = slimTableFactory14.copy();
        java.lang.String str41 = slimTableFactory39.getFullTableName("hi!");
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory42 = new fitnesse.testsystems.slim.tables.SlimTableFactory();
        java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable> wildcardClass44 = slimTableFactory42.getTableType("");
        java.lang.String str46 = slimTableFactory42.getFullTableName("");
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory47 = slimTableFactory42.copy();
        boolean boolean49 = slimTableFactory42.hasColon("");
        java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable> wildcardClass51 = slimTableFactory42.getTableType("");
        java.lang.String str53 = slimTableFactory42.makeTableType("");
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory54 = slimTableFactory42.copy();
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory55 = new fitnesse.testsystems.slim.tables.SlimTableFactory();
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory56 = new fitnesse.testsystems.slim.tables.SlimTableFactory();
        java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable> wildcardClass58 = slimTableFactory56.getTableType("");
        java.lang.String str60 = slimTableFactory56.getFullTableName("");
        java.util.Map<java.lang.String, java.lang.String> strMap61 = slimTableFactory56.tableTypeArrays;
        slimTableFactory55.tableTypeArrays = strMap61;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory63 = slimTableFactory55.copy();
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory64 = slimTableFactory63.copy();
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory65 = slimTableFactory63.copy();
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory66 = new fitnesse.testsystems.slim.tables.SlimTableFactory();
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory67 = slimTableFactory66.copy();
        java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable> wildcardClass69 = slimTableFactory67.getTableType("hi!");
        java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable> wildcardClass71 = slimTableFactory67.getTableType("hi!");
        boolean boolean73 = slimTableFactory67.hasColon("");
        java.util.Map<java.lang.String, java.lang.String> strMap74 = slimTableFactory67.tableTypeArrays;
        slimTableFactory65.tableTypeArrays = strMap74;
        slimTableFactory42.tableTypeArrays = strMap74;
        java.util.Map<java.lang.String, java.lang.String> strMap77 = slimTableFactory42.tableTypeArrays;
        slimTableFactory39.tableTypeArrays = strMap77;
        slimTableFactory11.tableTypeArrays = strMap77;
        java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable> wildcardClass81 = slimTableFactory11.getTableType("");
        org.junit.Assert.assertNotNull(slimTableFactory1);
        org.junit.Assert.assertNull(wildcardClass3);
        org.junit.Assert.assertNull(wildcardClass5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(strMap8);
        org.junit.Assert.assertNull(wildcardClass10);
        org.junit.Assert.assertNotNull(slimTableFactory11);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertNull(wildcardClass16);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNull(wildcardClass22);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "hi!" + "'", str25, "hi!");
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "" + "'", str27, "");
        org.junit.Assert.assertNotNull(strMap28);
        org.junit.Assert.assertNull(wildcardClass31);
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "" + "'", str33, "");
        org.junit.Assert.assertNotNull(strMap34);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertNotNull(slimTableFactory39);
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "hi!" + "'", str41, "hi!");
        org.junit.Assert.assertNull(wildcardClass44);
        org.junit.Assert.assertEquals("'" + str46 + "' != '" + "" + "'", str46, "");
        org.junit.Assert.assertNotNull(slimTableFactory47);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
        org.junit.Assert.assertNull(wildcardClass51);
        org.junit.Assert.assertEquals("'" + str53 + "' != '" + "" + "'", str53, "");
        org.junit.Assert.assertNotNull(slimTableFactory54);
        org.junit.Assert.assertNull(wildcardClass58);
        org.junit.Assert.assertEquals("'" + str60 + "' != '" + "" + "'", str60, "");
        org.junit.Assert.assertNotNull(strMap61);
        org.junit.Assert.assertNotNull(slimTableFactory63);
        org.junit.Assert.assertNotNull(slimTableFactory64);
        org.junit.Assert.assertNotNull(slimTableFactory65);
        org.junit.Assert.assertNotNull(slimTableFactory67);
        org.junit.Assert.assertNull(wildcardClass69);
        org.junit.Assert.assertNull(wildcardClass71);
        org.junit.Assert.assertTrue("'" + boolean73 + "' != '" + false + "'", boolean73 == false);
        org.junit.Assert.assertNotNull(strMap74);
        org.junit.Assert.assertNotNull(strMap77);
        org.junit.Assert.assertNull(wildcardClass81);
    }

    @Test
    public void test18135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18135");
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory0 = new fitnesse.testsystems.slim.tables.SlimTableFactory();
        java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable> wildcardClass2 = slimTableFactory0.getTableType("");
        java.lang.String str4 = slimTableFactory0.getFullTableName("");
        java.util.Map<java.lang.String, java.lang.String> strMap5 = slimTableFactory0.tableTypeArrays;
        java.util.Map<java.lang.String, java.lang.String> strMap6 = slimTableFactory0.tableTypeArrays;
        java.lang.String str8 = slimTableFactory0.makeTableType("hi!");
        java.lang.String str10 = slimTableFactory0.getFullTableName("hi!");
        java.util.Map<java.lang.String, java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable>> strMap11 = slimTableFactory0.tableTypes;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory12 = new fitnesse.testsystems.slim.tables.SlimTableFactory();
        java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable> wildcardClass14 = slimTableFactory12.getTableType("");
        java.lang.String str16 = slimTableFactory12.getFullTableName("");
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory17 = slimTableFactory12.copy();
        java.util.Map<java.lang.String, java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable>> strMap18 = slimTableFactory17.tableTypes;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory19 = slimTableFactory17.copy();
        java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable> wildcardClass21 = slimTableFactory19.getTableType("");
        java.util.Map<java.lang.String, java.lang.String> strMap22 = slimTableFactory19.tableTypeArrays;
        slimTableFactory0.tableTypeArrays = strMap22;
        java.util.Map<java.lang.String, java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable>> strMap24 = slimTableFactory0.tableTypes;
        boolean boolean26 = slimTableFactory0.hasColon("");
        java.util.Map<java.lang.String, java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable>> strMap27 = slimTableFactory0.tableTypes;
        boolean boolean29 = slimTableFactory0.hasColon("hi!");
        java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable> wildcardClass31 = slimTableFactory0.getTableType("hi!");
        org.junit.Assert.assertNull(wildcardClass2);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(strMap5);
        org.junit.Assert.assertNotNull(strMap6);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertNotNull(strMap11);
        org.junit.Assert.assertNull(wildcardClass14);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertNotNull(slimTableFactory17);
        org.junit.Assert.assertNotNull(strMap18);
        org.junit.Assert.assertNotNull(slimTableFactory19);
        org.junit.Assert.assertNull(wildcardClass21);
        org.junit.Assert.assertNotNull(strMap22);
        org.junit.Assert.assertNotNull(strMap24);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNotNull(strMap27);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertNull(wildcardClass31);
    }

    @Test
    public void test18136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18136");
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory0 = new fitnesse.testsystems.slim.tables.SlimTableFactory();
        java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable> wildcardClass2 = slimTableFactory0.getTableType("");
        java.lang.String str4 = slimTableFactory0.getFullTableName("");
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory5 = slimTableFactory0.copy();
        java.lang.String str7 = slimTableFactory0.makeTableType("hi!");
        java.util.Map<java.lang.String, java.lang.String> strMap8 = slimTableFactory0.tableTypeArrays;
        java.util.Map<java.lang.String, java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable>> strMap9 = slimTableFactory0.tableTypes;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory10 = slimTableFactory0.copy();
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory11 = slimTableFactory10.copy();
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory12 = slimTableFactory10.copy();
        java.util.Map<java.lang.String, java.lang.String> strMap13 = slimTableFactory10.tableTypeArrays;
        java.lang.String str15 = slimTableFactory10.makeTableType("hi!");
        java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable> wildcardClass17 = slimTableFactory10.getTableType("hi!");
        java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable> wildcardClass19 = slimTableFactory10.getTableType("");
        java.lang.String str21 = slimTableFactory10.makeTableType("");
        org.junit.Assert.assertNull(wildcardClass2);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(slimTableFactory5);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertNotNull(strMap8);
        org.junit.Assert.assertNotNull(strMap9);
        org.junit.Assert.assertNotNull(slimTableFactory10);
        org.junit.Assert.assertNotNull(slimTableFactory11);
        org.junit.Assert.assertNotNull(slimTableFactory12);
        org.junit.Assert.assertNotNull(strMap13);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertNull(wildcardClass17);
        org.junit.Assert.assertNull(wildcardClass19);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
    }

    @Test
    public void test18137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18137");
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory0 = new fitnesse.testsystems.slim.tables.SlimTableFactory();
        java.lang.String str2 = slimTableFactory0.getFullTableName("hi!");
        java.util.Map<java.lang.String, java.lang.String> strMap3 = slimTableFactory0.tableTypeArrays;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory4 = slimTableFactory0.copy();
        java.util.Map<java.lang.String, java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable>> strMap5 = slimTableFactory4.tableTypes;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory6 = slimTableFactory4.copy();
        java.util.Map<java.lang.String, java.lang.String> strMap7 = slimTableFactory6.tableTypeArrays;
        java.util.Map<java.lang.String, java.lang.String> strMap8 = slimTableFactory6.tableTypeArrays;
        java.lang.String str10 = slimTableFactory6.getFullTableName("hi!");
        java.util.Map<java.lang.String, java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable>> strMap11 = slimTableFactory6.tableTypes;
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!" + "'", str2, "hi!");
        org.junit.Assert.assertNotNull(strMap3);
        org.junit.Assert.assertNotNull(slimTableFactory4);
        org.junit.Assert.assertNotNull(strMap5);
        org.junit.Assert.assertNotNull(slimTableFactory6);
        org.junit.Assert.assertNotNull(strMap7);
        org.junit.Assert.assertNotNull(strMap8);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertNotNull(strMap11);
    }

    @Test
    public void test18138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18138");
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory0 = new fitnesse.testsystems.slim.tables.SlimTableFactory();
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory1 = slimTableFactory0.copy();
        java.lang.String str3 = slimTableFactory0.makeTableType("hi!");
        java.lang.String str5 = slimTableFactory0.makeTableType("");
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory6 = slimTableFactory0.copy();
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory7 = slimTableFactory6.copy();
        java.lang.String str9 = slimTableFactory6.makeTableType("");
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory10 = new fitnesse.testsystems.slim.tables.SlimTableFactory();
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory11 = slimTableFactory10.copy();
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory12 = slimTableFactory10.copy();
        java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable> wildcardClass14 = slimTableFactory10.getTableType("hi!");
        java.util.Map<java.lang.String, java.lang.String> strMap15 = slimTableFactory10.tableTypeArrays;
        java.lang.String str17 = slimTableFactory10.makeTableType("hi!");
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory18 = new fitnesse.testsystems.slim.tables.SlimTableFactory();
        java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable> wildcardClass20 = slimTableFactory18.getTableType("");
        java.lang.String str22 = slimTableFactory18.getFullTableName("");
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory23 = slimTableFactory18.copy();
        java.lang.String str25 = slimTableFactory18.makeTableType("hi!");
        java.util.Map<java.lang.String, java.lang.String> strMap26 = slimTableFactory18.tableTypeArrays;
        java.util.Map<java.lang.String, java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable>> strMap27 = slimTableFactory18.tableTypes;
        java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable> wildcardClass29 = slimTableFactory18.getTableType("");
        java.util.Map<java.lang.String, java.lang.String> strMap30 = slimTableFactory18.tableTypeArrays;
        java.lang.String str32 = slimTableFactory18.makeTableType("hi!");
        java.util.Map<java.lang.String, java.lang.String> strMap33 = slimTableFactory18.tableTypeArrays;
        slimTableFactory10.tableTypeArrays = strMap33;
        slimTableFactory6.tableTypeArrays = strMap33;
        java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable> wildcardClass37 = slimTableFactory6.getTableType("");
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory38 = new fitnesse.testsystems.slim.tables.SlimTableFactory();
        java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable> wildcardClass40 = slimTableFactory38.getTableType("");
        java.lang.String str42 = slimTableFactory38.getFullTableName("");
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory43 = slimTableFactory38.copy();
        java.lang.String str45 = slimTableFactory38.makeTableType("hi!");
        java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable> wildcardClass47 = slimTableFactory38.getTableType("");
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory48 = slimTableFactory38.copy();
        java.util.Map<java.lang.String, java.lang.String> strMap49 = slimTableFactory38.tableTypeArrays;
        slimTableFactory6.tableTypeArrays = strMap49;
        org.junit.Assert.assertNotNull(slimTableFactory1);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(slimTableFactory6);
        org.junit.Assert.assertNotNull(slimTableFactory7);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNotNull(slimTableFactory11);
        org.junit.Assert.assertNotNull(slimTableFactory12);
        org.junit.Assert.assertNull(wildcardClass14);
        org.junit.Assert.assertNotNull(strMap15);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
        org.junit.Assert.assertNull(wildcardClass20);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertNotNull(slimTableFactory23);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "hi!" + "'", str25, "hi!");
        org.junit.Assert.assertNotNull(strMap26);
        org.junit.Assert.assertNotNull(strMap27);
        org.junit.Assert.assertNull(wildcardClass29);
        org.junit.Assert.assertNotNull(strMap30);
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "hi!" + "'", str32, "hi!");
        org.junit.Assert.assertNotNull(strMap33);
        org.junit.Assert.assertNull(wildcardClass37);
        org.junit.Assert.assertNull(wildcardClass40);
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "" + "'", str42, "");
        org.junit.Assert.assertNotNull(slimTableFactory43);
        org.junit.Assert.assertEquals("'" + str45 + "' != '" + "hi!" + "'", str45, "hi!");
        org.junit.Assert.assertNull(wildcardClass47);
        org.junit.Assert.assertNotNull(slimTableFactory48);
        org.junit.Assert.assertNotNull(strMap49);
    }

    @Test
    public void test18139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18139");
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory0 = new fitnesse.testsystems.slim.tables.SlimTableFactory();
        java.lang.String str2 = slimTableFactory0.getFullTableName("hi!");
        java.util.Map<java.lang.String, java.lang.String> strMap3 = slimTableFactory0.tableTypeArrays;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory4 = new fitnesse.testsystems.slim.tables.SlimTableFactory();
        java.lang.String str6 = slimTableFactory4.getFullTableName("hi!");
        java.util.Map<java.lang.String, java.lang.String> strMap7 = slimTableFactory4.tableTypeArrays;
        slimTableFactory0.tableTypeArrays = strMap7;
        java.lang.String str10 = slimTableFactory0.getFullTableName("");
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory11 = slimTableFactory0.copy();
        boolean boolean13 = slimTableFactory11.hasColon("hi!");
        java.lang.String str15 = slimTableFactory11.makeTableType("hi!");
        boolean boolean17 = slimTableFactory11.hasColon("hi!");
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory18 = new fitnesse.testsystems.slim.tables.SlimTableFactory();
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory19 = slimTableFactory18.copy();
        java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable> wildcardClass21 = slimTableFactory19.getTableType("hi!");
        java.util.Map<java.lang.String, java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable>> strMap22 = slimTableFactory19.tableTypes;
        java.util.Map<java.lang.String, java.lang.String> strMap23 = slimTableFactory19.tableTypeArrays;
        slimTableFactory11.tableTypeArrays = strMap23;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory25 = slimTableFactory11.copy();
        boolean boolean27 = slimTableFactory11.hasColon("");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!" + "'", str2, "hi!");
        org.junit.Assert.assertNotNull(strMap3);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertNotNull(strMap7);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNotNull(slimTableFactory11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(slimTableFactory19);
        org.junit.Assert.assertNull(wildcardClass21);
        org.junit.Assert.assertNotNull(strMap22);
        org.junit.Assert.assertNotNull(strMap23);
        org.junit.Assert.assertNotNull(slimTableFactory25);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
    }

    @Test
    public void test18140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18140");
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory0 = new fitnesse.testsystems.slim.tables.SlimTableFactory();
        java.lang.String str2 = slimTableFactory0.getFullTableName("hi!");
        java.util.Map<java.lang.String, java.lang.String> strMap3 = slimTableFactory0.tableTypeArrays;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory4 = new fitnesse.testsystems.slim.tables.SlimTableFactory();
        java.lang.String str6 = slimTableFactory4.getFullTableName("hi!");
        java.util.Map<java.lang.String, java.lang.String> strMap7 = slimTableFactory4.tableTypeArrays;
        slimTableFactory0.tableTypeArrays = strMap7;
        java.lang.String str10 = slimTableFactory0.makeTableType("");
        java.util.Map<java.lang.String, java.lang.String> strMap11 = slimTableFactory0.tableTypeArrays;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory12 = new fitnesse.testsystems.slim.tables.SlimTableFactory();
        java.lang.String str14 = slimTableFactory12.getFullTableName("hi!");
        java.util.Map<java.lang.String, java.lang.String> strMap15 = slimTableFactory12.tableTypeArrays;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory16 = slimTableFactory12.copy();
        java.util.Map<java.lang.String, java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable>> strMap17 = slimTableFactory16.tableTypes;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory18 = slimTableFactory16.copy();
        java.lang.String str20 = slimTableFactory18.getFullTableName("hi!");
        java.util.Map<java.lang.String, java.lang.String> strMap21 = slimTableFactory18.tableTypeArrays;
        slimTableFactory0.tableTypeArrays = strMap21;
        java.lang.String str24 = slimTableFactory0.makeTableType("");
        java.lang.String str26 = slimTableFactory0.getFullTableName("");
        boolean boolean28 = slimTableFactory0.hasColon("hi!");
        java.util.Map<java.lang.String, java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable>> strMap29 = slimTableFactory0.tableTypes;
        boolean boolean31 = slimTableFactory0.hasColon("hi!");
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory32 = new fitnesse.testsystems.slim.tables.SlimTableFactory();
        java.lang.String str34 = slimTableFactory32.getFullTableName("hi!");
        java.util.Map<java.lang.String, java.lang.String> strMap35 = slimTableFactory32.tableTypeArrays;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory36 = slimTableFactory32.copy();
        java.util.Map<java.lang.String, java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable>> strMap37 = slimTableFactory36.tableTypes;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory38 = slimTableFactory36.copy();
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory39 = slimTableFactory38.copy();
        java.lang.String str41 = slimTableFactory39.makeTableType("hi!");
        boolean boolean43 = slimTableFactory39.hasColon("");
        java.util.Map<java.lang.String, java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable>> strMap44 = slimTableFactory39.tableTypes;
        java.lang.String str46 = slimTableFactory39.makeTableType("");
        java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable> wildcardClass48 = slimTableFactory39.getTableType("");
        java.util.Map<java.lang.String, java.lang.String> strMap49 = slimTableFactory39.tableTypeArrays;
        slimTableFactory0.tableTypeArrays = strMap49;
        java.lang.String str52 = slimTableFactory0.getFullTableName("hi!");
        boolean boolean54 = slimTableFactory0.hasColon("");
        java.lang.String str56 = slimTableFactory0.makeTableType("");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!" + "'", str2, "hi!");
        org.junit.Assert.assertNotNull(strMap3);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertNotNull(strMap7);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNotNull(strMap11);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertNotNull(strMap15);
        org.junit.Assert.assertNotNull(slimTableFactory16);
        org.junit.Assert.assertNotNull(strMap17);
        org.junit.Assert.assertNotNull(slimTableFactory18);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "hi!" + "'", str20, "hi!");
        org.junit.Assert.assertNotNull(strMap21);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "" + "'", str24, "");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "" + "'", str26, "");
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertNotNull(strMap29);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "hi!" + "'", str34, "hi!");
        org.junit.Assert.assertNotNull(strMap35);
        org.junit.Assert.assertNotNull(slimTableFactory36);
        org.junit.Assert.assertNotNull(strMap37);
        org.junit.Assert.assertNotNull(slimTableFactory38);
        org.junit.Assert.assertNotNull(slimTableFactory39);
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "hi!" + "'", str41, "hi!");
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertNotNull(strMap44);
        org.junit.Assert.assertEquals("'" + str46 + "' != '" + "" + "'", str46, "");
        org.junit.Assert.assertNull(wildcardClass48);
        org.junit.Assert.assertNotNull(strMap49);
        org.junit.Assert.assertEquals("'" + str52 + "' != '" + "hi!" + "'", str52, "hi!");
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + false + "'", boolean54 == false);
        org.junit.Assert.assertEquals("'" + str56 + "' != '" + "" + "'", str56, "");
    }

    @Test
    public void test18141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18141");
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory0 = new fitnesse.testsystems.slim.tables.SlimTableFactory();
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory1 = new fitnesse.testsystems.slim.tables.SlimTableFactory();
        java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable> wildcardClass3 = slimTableFactory1.getTableType("");
        java.lang.String str5 = slimTableFactory1.getFullTableName("");
        java.util.Map<java.lang.String, java.lang.String> strMap6 = slimTableFactory1.tableTypeArrays;
        slimTableFactory0.tableTypeArrays = strMap6;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory8 = slimTableFactory0.copy();
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory9 = slimTableFactory8.copy();
        java.util.Map<java.lang.String, java.lang.String> strMap10 = slimTableFactory9.tableTypeArrays;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory11 = new fitnesse.testsystems.slim.tables.SlimTableFactory();
        java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable> wildcardClass13 = slimTableFactory11.getTableType("");
        java.lang.String str15 = slimTableFactory11.getFullTableName("");
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory16 = slimTableFactory11.copy();
        boolean boolean18 = slimTableFactory11.hasColon("");
        java.util.Map<java.lang.String, java.lang.String> strMap19 = slimTableFactory11.tableTypeArrays;
        slimTableFactory9.tableTypeArrays = strMap19;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory21 = slimTableFactory9.copy();
        java.lang.String str23 = slimTableFactory21.makeTableType("hi!");
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory24 = slimTableFactory21.copy();
        java.lang.String str26 = slimTableFactory21.getFullTableName("hi!");
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory27 = slimTableFactory21.copy();
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory28 = new fitnesse.testsystems.slim.tables.SlimTableFactory();
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory29 = slimTableFactory28.copy();
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory30 = slimTableFactory29.copy();
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory31 = new fitnesse.testsystems.slim.tables.SlimTableFactory();
        java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable> wildcardClass33 = slimTableFactory31.getTableType("");
        java.lang.String str35 = slimTableFactory31.getFullTableName("");
        java.util.Map<java.lang.String, java.lang.String> strMap36 = slimTableFactory31.tableTypeArrays;
        java.util.Map<java.lang.String, java.lang.String> strMap37 = slimTableFactory31.tableTypeArrays;
        java.lang.String str39 = slimTableFactory31.makeTableType("hi!");
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory40 = new fitnesse.testsystems.slim.tables.SlimTableFactory();
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory41 = new fitnesse.testsystems.slim.tables.SlimTableFactory();
        java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable> wildcardClass43 = slimTableFactory41.getTableType("");
        java.lang.String str45 = slimTableFactory41.getFullTableName("");
        java.util.Map<java.lang.String, java.lang.String> strMap46 = slimTableFactory41.tableTypeArrays;
        slimTableFactory40.tableTypeArrays = strMap46;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory48 = slimTableFactory40.copy();
        java.lang.String str50 = slimTableFactory40.getFullTableName("hi!");
        java.util.Map<java.lang.String, java.lang.String> strMap51 = slimTableFactory40.tableTypeArrays;
        slimTableFactory31.tableTypeArrays = strMap51;
        slimTableFactory29.tableTypeArrays = strMap51;
        java.lang.String str55 = slimTableFactory29.makeTableType("hi!");
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory56 = new fitnesse.testsystems.slim.tables.SlimTableFactory();
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory57 = new fitnesse.testsystems.slim.tables.SlimTableFactory();
        java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable> wildcardClass59 = slimTableFactory57.getTableType("");
        java.lang.String str61 = slimTableFactory57.getFullTableName("");
        java.util.Map<java.lang.String, java.lang.String> strMap62 = slimTableFactory57.tableTypeArrays;
        slimTableFactory56.tableTypeArrays = strMap62;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory64 = slimTableFactory56.copy();
        java.util.Map<java.lang.String, java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable>> strMap65 = slimTableFactory56.tableTypes;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory66 = new fitnesse.testsystems.slim.tables.SlimTableFactory();
        java.lang.String str68 = slimTableFactory66.getFullTableName("hi!");
        java.util.Map<java.lang.String, java.lang.String> strMap69 = slimTableFactory66.tableTypeArrays;
        java.lang.String str71 = slimTableFactory66.makeTableType("");
        java.util.Map<java.lang.String, java.lang.String> strMap72 = slimTableFactory66.tableTypeArrays;
        slimTableFactory56.tableTypeArrays = strMap72;
        slimTableFactory29.tableTypeArrays = strMap72;
        slimTableFactory27.tableTypeArrays = strMap72;
        java.util.Map<java.lang.String, java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable>> strMap76 = slimTableFactory27.tableTypes;
        org.junit.Assert.assertNull(wildcardClass3);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(strMap6);
        org.junit.Assert.assertNotNull(slimTableFactory8);
        org.junit.Assert.assertNotNull(slimTableFactory9);
        org.junit.Assert.assertNotNull(strMap10);
        org.junit.Assert.assertNull(wildcardClass13);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertNotNull(slimTableFactory16);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(strMap19);
        org.junit.Assert.assertNotNull(slimTableFactory21);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "hi!" + "'", str23, "hi!");
        org.junit.Assert.assertNotNull(slimTableFactory24);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "hi!" + "'", str26, "hi!");
        org.junit.Assert.assertNotNull(slimTableFactory27);
        org.junit.Assert.assertNotNull(slimTableFactory29);
        org.junit.Assert.assertNotNull(slimTableFactory30);
        org.junit.Assert.assertNull(wildcardClass33);
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "" + "'", str35, "");
        org.junit.Assert.assertNotNull(strMap36);
        org.junit.Assert.assertNotNull(strMap37);
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "hi!" + "'", str39, "hi!");
        org.junit.Assert.assertNull(wildcardClass43);
        org.junit.Assert.assertEquals("'" + str45 + "' != '" + "" + "'", str45, "");
        org.junit.Assert.assertNotNull(strMap46);
        org.junit.Assert.assertNotNull(slimTableFactory48);
        org.junit.Assert.assertEquals("'" + str50 + "' != '" + "hi!" + "'", str50, "hi!");
        org.junit.Assert.assertNotNull(strMap51);
        org.junit.Assert.assertEquals("'" + str55 + "' != '" + "hi!" + "'", str55, "hi!");
        org.junit.Assert.assertNull(wildcardClass59);
        org.junit.Assert.assertEquals("'" + str61 + "' != '" + "" + "'", str61, "");
        org.junit.Assert.assertNotNull(strMap62);
        org.junit.Assert.assertNotNull(slimTableFactory64);
        org.junit.Assert.assertNotNull(strMap65);
        org.junit.Assert.assertEquals("'" + str68 + "' != '" + "hi!" + "'", str68, "hi!");
        org.junit.Assert.assertNotNull(strMap69);
        org.junit.Assert.assertEquals("'" + str71 + "' != '" + "" + "'", str71, "");
        org.junit.Assert.assertNotNull(strMap72);
        org.junit.Assert.assertNotNull(strMap76);
    }

    @Test
    public void test18142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18142");
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory0 = new fitnesse.testsystems.slim.tables.SlimTableFactory();
        java.lang.String str2 = slimTableFactory0.getFullTableName("hi!");
        java.util.Map<java.lang.String, java.lang.String> strMap3 = slimTableFactory0.tableTypeArrays;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory4 = slimTableFactory0.copy();
        java.util.Map<java.lang.String, java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable>> strMap5 = slimTableFactory4.tableTypes;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory6 = slimTableFactory4.copy();
        java.lang.String str8 = slimTableFactory6.getFullTableName("hi!");
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory9 = slimTableFactory6.copy();
        java.util.Map<java.lang.String, java.lang.String> strMap10 = slimTableFactory6.tableTypeArrays;
        java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable> wildcardClass12 = slimTableFactory6.getTableType("");
        boolean boolean14 = slimTableFactory6.hasColon("");
        java.lang.String str16 = slimTableFactory6.makeTableType("hi!");
        java.util.Map<java.lang.String, java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable>> strMap17 = slimTableFactory6.tableTypes;
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!" + "'", str2, "hi!");
        org.junit.Assert.assertNotNull(strMap3);
        org.junit.Assert.assertNotNull(slimTableFactory4);
        org.junit.Assert.assertNotNull(strMap5);
        org.junit.Assert.assertNotNull(slimTableFactory6);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertNotNull(slimTableFactory9);
        org.junit.Assert.assertNotNull(strMap10);
        org.junit.Assert.assertNull(wildcardClass12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertNotNull(strMap17);
    }

    @Test
    public void test18143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18143");
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory0 = new fitnesse.testsystems.slim.tables.SlimTableFactory();
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory1 = new fitnesse.testsystems.slim.tables.SlimTableFactory();
        java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable> wildcardClass3 = slimTableFactory1.getTableType("");
        java.lang.String str5 = slimTableFactory1.getFullTableName("");
        java.util.Map<java.lang.String, java.lang.String> strMap6 = slimTableFactory1.tableTypeArrays;
        slimTableFactory0.tableTypeArrays = strMap6;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory8 = slimTableFactory0.copy();
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory9 = slimTableFactory8.copy();
        java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable> wildcardClass11 = slimTableFactory9.getTableType("hi!");
        boolean boolean13 = slimTableFactory9.hasColon("");
        java.util.Map<java.lang.String, java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable>> strMap14 = slimTableFactory9.tableTypes;
        java.util.Map<java.lang.String, java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable>> strMap15 = slimTableFactory9.tableTypes;
        org.junit.Assert.assertNull(wildcardClass3);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(strMap6);
        org.junit.Assert.assertNotNull(slimTableFactory8);
        org.junit.Assert.assertNotNull(slimTableFactory9);
        org.junit.Assert.assertNull(wildcardClass11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(strMap14);
        org.junit.Assert.assertNotNull(strMap15);
    }

    @Test
    public void test18144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18144");
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory0 = new fitnesse.testsystems.slim.tables.SlimTableFactory();
        java.lang.String str2 = slimTableFactory0.getFullTableName("hi!");
        java.util.Map<java.lang.String, java.lang.String> strMap3 = slimTableFactory0.tableTypeArrays;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory4 = new fitnesse.testsystems.slim.tables.SlimTableFactory();
        java.lang.String str6 = slimTableFactory4.getFullTableName("hi!");
        java.util.Map<java.lang.String, java.lang.String> strMap7 = slimTableFactory4.tableTypeArrays;
        slimTableFactory0.tableTypeArrays = strMap7;
        java.lang.String str10 = slimTableFactory0.makeTableType("");
        java.util.Map<java.lang.String, java.lang.String> strMap11 = slimTableFactory0.tableTypeArrays;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory12 = new fitnesse.testsystems.slim.tables.SlimTableFactory();
        java.lang.String str14 = slimTableFactory12.getFullTableName("hi!");
        java.util.Map<java.lang.String, java.lang.String> strMap15 = slimTableFactory12.tableTypeArrays;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory16 = slimTableFactory12.copy();
        java.util.Map<java.lang.String, java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable>> strMap17 = slimTableFactory16.tableTypes;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory18 = slimTableFactory16.copy();
        java.lang.String str20 = slimTableFactory18.getFullTableName("hi!");
        java.util.Map<java.lang.String, java.lang.String> strMap21 = slimTableFactory18.tableTypeArrays;
        slimTableFactory0.tableTypeArrays = strMap21;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory23 = new fitnesse.testsystems.slim.tables.SlimTableFactory();
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory24 = new fitnesse.testsystems.slim.tables.SlimTableFactory();
        java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable> wildcardClass26 = slimTableFactory24.getTableType("");
        java.lang.String str28 = slimTableFactory24.getFullTableName("");
        java.util.Map<java.lang.String, java.lang.String> strMap29 = slimTableFactory24.tableTypeArrays;
        slimTableFactory23.tableTypeArrays = strMap29;
        java.util.Map<java.lang.String, java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable>> strMap31 = slimTableFactory23.tableTypes;
        java.util.Map<java.lang.String, java.lang.String> strMap32 = slimTableFactory23.tableTypeArrays;
        slimTableFactory0.tableTypeArrays = strMap32;
        java.lang.String str35 = slimTableFactory0.getFullTableName("hi!");
        java.util.Map<java.lang.String, java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable>> strMap36 = slimTableFactory0.tableTypes;
        java.util.Map<java.lang.String, java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable>> strMap37 = slimTableFactory0.tableTypes;
        java.lang.String str39 = slimTableFactory0.makeTableType("");
        java.lang.String str41 = slimTableFactory0.makeTableType("");
        java.util.Map<java.lang.String, java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable>> strMap42 = slimTableFactory0.tableTypes;
        fitnesse.testsystems.slim.Table table43 = null;
        // The following exception was thrown during execution in test generation
        try {
            slimTableFactory0.parseDefineTableTypeRow(table43, 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!" + "'", str2, "hi!");
        org.junit.Assert.assertNotNull(strMap3);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertNotNull(strMap7);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNotNull(strMap11);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertNotNull(strMap15);
        org.junit.Assert.assertNotNull(slimTableFactory16);
        org.junit.Assert.assertNotNull(strMap17);
        org.junit.Assert.assertNotNull(slimTableFactory18);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "hi!" + "'", str20, "hi!");
        org.junit.Assert.assertNotNull(strMap21);
        org.junit.Assert.assertNull(wildcardClass26);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "" + "'", str28, "");
        org.junit.Assert.assertNotNull(strMap29);
        org.junit.Assert.assertNotNull(strMap31);
        org.junit.Assert.assertNotNull(strMap32);
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "hi!" + "'", str35, "hi!");
        org.junit.Assert.assertNotNull(strMap36);
        org.junit.Assert.assertNotNull(strMap37);
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "" + "'", str39, "");
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "" + "'", str41, "");
        org.junit.Assert.assertNotNull(strMap42);
    }

    @Test
    public void test18145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18145");
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory0 = new fitnesse.testsystems.slim.tables.SlimTableFactory();
        java.lang.String str2 = slimTableFactory0.getFullTableName("hi!");
        java.util.Map<java.lang.String, java.lang.String> strMap3 = slimTableFactory0.tableTypeArrays;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory4 = new fitnesse.testsystems.slim.tables.SlimTableFactory();
        java.lang.String str6 = slimTableFactory4.getFullTableName("hi!");
        java.util.Map<java.lang.String, java.lang.String> strMap7 = slimTableFactory4.tableTypeArrays;
        slimTableFactory0.tableTypeArrays = strMap7;
        java.lang.String str10 = slimTableFactory0.getFullTableName("");
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory11 = new fitnesse.testsystems.slim.tables.SlimTableFactory();
        java.lang.String str13 = slimTableFactory11.getFullTableName("hi!");
        java.util.Map<java.lang.String, java.lang.String> strMap14 = slimTableFactory11.tableTypeArrays;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory15 = new fitnesse.testsystems.slim.tables.SlimTableFactory();
        java.lang.String str17 = slimTableFactory15.getFullTableName("hi!");
        java.util.Map<java.lang.String, java.lang.String> strMap18 = slimTableFactory15.tableTypeArrays;
        slimTableFactory11.tableTypeArrays = strMap18;
        slimTableFactory0.tableTypeArrays = strMap18;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory21 = new fitnesse.testsystems.slim.tables.SlimTableFactory();
        java.lang.String str23 = slimTableFactory21.getFullTableName("hi!");
        java.lang.String str25 = slimTableFactory21.makeTableType("");
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory26 = slimTableFactory21.copy();
        java.lang.String str28 = slimTableFactory21.makeTableType("");
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory29 = new fitnesse.testsystems.slim.tables.SlimTableFactory();
        java.lang.String str31 = slimTableFactory29.getFullTableName("hi!");
        java.util.Map<java.lang.String, java.lang.String> strMap32 = slimTableFactory29.tableTypeArrays;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory33 = slimTableFactory29.copy();
        boolean boolean35 = slimTableFactory29.hasColon("hi!");
        java.util.Map<java.lang.String, java.lang.String> strMap36 = slimTableFactory29.tableTypeArrays;
        slimTableFactory21.tableTypeArrays = strMap36;
        slimTableFactory0.tableTypeArrays = strMap36;
        java.lang.String str40 = slimTableFactory0.getFullTableName("");
        java.util.Map<java.lang.String, java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable>> strMap41 = slimTableFactory0.tableTypes;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory42 = slimTableFactory0.copy();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!" + "'", str2, "hi!");
        org.junit.Assert.assertNotNull(strMap3);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertNotNull(strMap7);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertNotNull(strMap14);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
        org.junit.Assert.assertNotNull(strMap18);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "hi!" + "'", str23, "hi!");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "" + "'", str25, "");
        org.junit.Assert.assertNotNull(slimTableFactory26);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "" + "'", str28, "");
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "hi!" + "'", str31, "hi!");
        org.junit.Assert.assertNotNull(strMap32);
        org.junit.Assert.assertNotNull(slimTableFactory33);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertNotNull(strMap36);
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "" + "'", str40, "");
        org.junit.Assert.assertNotNull(strMap41);
        org.junit.Assert.assertNotNull(slimTableFactory42);
    }

    @Test
    public void test18146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18146");
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory0 = new fitnesse.testsystems.slim.tables.SlimTableFactory();
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory1 = new fitnesse.testsystems.slim.tables.SlimTableFactory();
        java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable> wildcardClass3 = slimTableFactory1.getTableType("");
        java.lang.String str5 = slimTableFactory1.getFullTableName("");
        java.util.Map<java.lang.String, java.lang.String> strMap6 = slimTableFactory1.tableTypeArrays;
        slimTableFactory0.tableTypeArrays = strMap6;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory8 = slimTableFactory0.copy();
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory9 = slimTableFactory8.copy();
        java.util.Map<java.lang.String, java.lang.String> strMap10 = slimTableFactory9.tableTypeArrays;
        java.lang.String str12 = slimTableFactory9.makeTableType("hi!");
        boolean boolean14 = slimTableFactory9.hasColon("hi!");
        java.util.Map<java.lang.String, java.lang.String> strMap15 = slimTableFactory9.tableTypeArrays;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory16 = slimTableFactory9.copy();
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory17 = slimTableFactory16.copy();
        fitnesse.testsystems.slim.Table table18 = null;
        fitnesse.testsystems.slim.SlimTestContext slimTestContext20 = null;
        // The following exception was thrown during execution in test generation
        try {
            fitnesse.testsystems.slim.tables.SlimTable slimTable21 = slimTableFactory16.makeSlimTable(table18, "", slimTestContext20);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(wildcardClass3);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(strMap6);
        org.junit.Assert.assertNotNull(slimTableFactory8);
        org.junit.Assert.assertNotNull(slimTableFactory9);
        org.junit.Assert.assertNotNull(strMap10);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(strMap15);
        org.junit.Assert.assertNotNull(slimTableFactory16);
        org.junit.Assert.assertNotNull(slimTableFactory17);
    }

    @Test
    public void test18147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18147");
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory0 = new fitnesse.testsystems.slim.tables.SlimTableFactory();
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory1 = new fitnesse.testsystems.slim.tables.SlimTableFactory();
        java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable> wildcardClass3 = slimTableFactory1.getTableType("");
        java.lang.String str5 = slimTableFactory1.getFullTableName("");
        java.util.Map<java.lang.String, java.lang.String> strMap6 = slimTableFactory1.tableTypeArrays;
        slimTableFactory0.tableTypeArrays = strMap6;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory8 = slimTableFactory0.copy();
        java.lang.String str10 = slimTableFactory0.getFullTableName("hi!");
        java.util.Map<java.lang.String, java.lang.String> strMap11 = slimTableFactory0.tableTypeArrays;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory12 = slimTableFactory0.copy();
        java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable> wildcardClass14 = slimTableFactory12.getTableType("hi!");
        java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable> wildcardClass16 = slimTableFactory12.getTableType("");
        java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable> wildcardClass18 = slimTableFactory12.getTableType("");
        java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable> wildcardClass20 = slimTableFactory12.getTableType("hi!");
        boolean boolean22 = slimTableFactory12.hasColon("hi!");
        org.junit.Assert.assertNull(wildcardClass3);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(strMap6);
        org.junit.Assert.assertNotNull(slimTableFactory8);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertNotNull(strMap11);
        org.junit.Assert.assertNotNull(slimTableFactory12);
        org.junit.Assert.assertNull(wildcardClass14);
        org.junit.Assert.assertNull(wildcardClass16);
        org.junit.Assert.assertNull(wildcardClass18);
        org.junit.Assert.assertNull(wildcardClass20);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
    }

    @Test
    public void test18148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18148");
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory0 = new fitnesse.testsystems.slim.tables.SlimTableFactory();
        java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable> wildcardClass2 = slimTableFactory0.getTableType("");
        java.lang.String str4 = slimTableFactory0.getFullTableName("");
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory5 = slimTableFactory0.copy();
        boolean boolean7 = slimTableFactory0.hasColon("");
        java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable> wildcardClass9 = slimTableFactory0.getTableType("");
        java.lang.String str11 = slimTableFactory0.makeTableType("");
        java.lang.String str13 = slimTableFactory0.makeTableType("hi!");
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory14 = new fitnesse.testsystems.slim.tables.SlimTableFactory();
        java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable> wildcardClass16 = slimTableFactory14.getTableType("");
        java.lang.String str18 = slimTableFactory14.getFullTableName("");
        java.util.Map<java.lang.String, java.lang.String> strMap19 = slimTableFactory14.tableTypeArrays;
        java.util.Map<java.lang.String, java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable>> strMap20 = slimTableFactory14.tableTypes;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory21 = new fitnesse.testsystems.slim.tables.SlimTableFactory();
        java.lang.String str23 = slimTableFactory21.getFullTableName("hi!");
        java.util.Map<java.lang.String, java.lang.String> strMap24 = slimTableFactory21.tableTypeArrays;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory25 = slimTableFactory21.copy();
        java.util.Map<java.lang.String, java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable>> strMap26 = slimTableFactory25.tableTypes;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory27 = slimTableFactory25.copy();
        java.lang.String str29 = slimTableFactory27.getFullTableName("hi!");
        java.lang.String str31 = slimTableFactory27.makeTableType("hi!");
        java.lang.String str33 = slimTableFactory27.getFullTableName("hi!");
        java.util.Map<java.lang.String, java.lang.String> strMap34 = slimTableFactory27.tableTypeArrays;
        slimTableFactory14.tableTypeArrays = strMap34;
        slimTableFactory0.tableTypeArrays = strMap34;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory37 = new fitnesse.testsystems.slim.tables.SlimTableFactory();
        java.lang.String str39 = slimTableFactory37.getFullTableName("hi!");
        java.util.Map<java.lang.String, java.lang.String> strMap40 = slimTableFactory37.tableTypeArrays;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory41 = slimTableFactory37.copy();
        boolean boolean43 = slimTableFactory37.hasColon("hi!");
        boolean boolean45 = slimTableFactory37.hasColon("");
        java.lang.String str47 = slimTableFactory37.makeTableType("");
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory48 = new fitnesse.testsystems.slim.tables.SlimTableFactory();
        java.lang.String str50 = slimTableFactory48.getFullTableName("hi!");
        java.util.Map<java.lang.String, java.lang.String> strMap51 = slimTableFactory48.tableTypeArrays;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory52 = slimTableFactory48.copy();
        java.util.Map<java.lang.String, java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable>> strMap53 = slimTableFactory52.tableTypes;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory54 = slimTableFactory52.copy();
        java.util.Map<java.lang.String, java.lang.String> strMap55 = slimTableFactory54.tableTypeArrays;
        java.util.Map<java.lang.String, java.lang.String> strMap56 = slimTableFactory54.tableTypeArrays;
        java.lang.String str58 = slimTableFactory54.getFullTableName("hi!");
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory59 = new fitnesse.testsystems.slim.tables.SlimTableFactory();
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory60 = new fitnesse.testsystems.slim.tables.SlimTableFactory();
        java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable> wildcardClass62 = slimTableFactory60.getTableType("");
        java.lang.String str64 = slimTableFactory60.getFullTableName("");
        java.util.Map<java.lang.String, java.lang.String> strMap65 = slimTableFactory60.tableTypeArrays;
        slimTableFactory59.tableTypeArrays = strMap65;
        java.util.Map<java.lang.String, java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable>> strMap67 = slimTableFactory59.tableTypes;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory68 = new fitnesse.testsystems.slim.tables.SlimTableFactory();
        java.lang.String str70 = slimTableFactory68.getFullTableName("hi!");
        java.util.Map<java.lang.String, java.lang.String> strMap71 = slimTableFactory68.tableTypeArrays;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory72 = slimTableFactory68.copy();
        java.util.Map<java.lang.String, java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable>> strMap73 = slimTableFactory72.tableTypes;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory74 = slimTableFactory72.copy();
        java.lang.String str76 = slimTableFactory74.getFullTableName("hi!");
        java.util.Map<java.lang.String, java.lang.String> strMap77 = slimTableFactory74.tableTypeArrays;
        slimTableFactory59.tableTypeArrays = strMap77;
        slimTableFactory54.tableTypeArrays = strMap77;
        slimTableFactory37.tableTypeArrays = strMap77;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory81 = new fitnesse.testsystems.slim.tables.SlimTableFactory();
        java.lang.String str83 = slimTableFactory81.getFullTableName("hi!");
        java.util.Map<java.lang.String, java.lang.String> strMap84 = slimTableFactory81.tableTypeArrays;
        java.lang.String str86 = slimTableFactory81.makeTableType("");
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory87 = new fitnesse.testsystems.slim.tables.SlimTableFactory();
        java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable> wildcardClass89 = slimTableFactory87.getTableType("");
        boolean boolean91 = slimTableFactory87.hasColon("");
        java.util.Map<java.lang.String, java.lang.String> strMap92 = slimTableFactory87.tableTypeArrays;
        slimTableFactory81.tableTypeArrays = strMap92;
        slimTableFactory37.tableTypeArrays = strMap92;
        slimTableFactory0.tableTypeArrays = strMap92;
        java.util.Map<java.lang.String, java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable>> strMap96 = slimTableFactory0.tableTypes;
        org.junit.Assert.assertNull(wildcardClass2);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(slimTableFactory5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(wildcardClass9);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertNull(wildcardClass16);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertNotNull(strMap19);
        org.junit.Assert.assertNotNull(strMap20);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "hi!" + "'", str23, "hi!");
        org.junit.Assert.assertNotNull(strMap24);
        org.junit.Assert.assertNotNull(slimTableFactory25);
        org.junit.Assert.assertNotNull(strMap26);
        org.junit.Assert.assertNotNull(slimTableFactory27);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "hi!" + "'", str29, "hi!");
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "hi!" + "'", str31, "hi!");
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "hi!" + "'", str33, "hi!");
        org.junit.Assert.assertNotNull(strMap34);
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "hi!" + "'", str39, "hi!");
        org.junit.Assert.assertNotNull(strMap40);
        org.junit.Assert.assertNotNull(slimTableFactory41);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertEquals("'" + str47 + "' != '" + "" + "'", str47, "");
        org.junit.Assert.assertEquals("'" + str50 + "' != '" + "hi!" + "'", str50, "hi!");
        org.junit.Assert.assertNotNull(strMap51);
        org.junit.Assert.assertNotNull(slimTableFactory52);
        org.junit.Assert.assertNotNull(strMap53);
        org.junit.Assert.assertNotNull(slimTableFactory54);
        org.junit.Assert.assertNotNull(strMap55);
        org.junit.Assert.assertNotNull(strMap56);
        org.junit.Assert.assertEquals("'" + str58 + "' != '" + "hi!" + "'", str58, "hi!");
        org.junit.Assert.assertNull(wildcardClass62);
        org.junit.Assert.assertEquals("'" + str64 + "' != '" + "" + "'", str64, "");
        org.junit.Assert.assertNotNull(strMap65);
        org.junit.Assert.assertNotNull(strMap67);
        org.junit.Assert.assertEquals("'" + str70 + "' != '" + "hi!" + "'", str70, "hi!");
        org.junit.Assert.assertNotNull(strMap71);
        org.junit.Assert.assertNotNull(slimTableFactory72);
        org.junit.Assert.assertNotNull(strMap73);
        org.junit.Assert.assertNotNull(slimTableFactory74);
        org.junit.Assert.assertEquals("'" + str76 + "' != '" + "hi!" + "'", str76, "hi!");
        org.junit.Assert.assertNotNull(strMap77);
        org.junit.Assert.assertEquals("'" + str83 + "' != '" + "hi!" + "'", str83, "hi!");
        org.junit.Assert.assertNotNull(strMap84);
        org.junit.Assert.assertEquals("'" + str86 + "' != '" + "" + "'", str86, "");
        org.junit.Assert.assertNull(wildcardClass89);
        org.junit.Assert.assertTrue("'" + boolean91 + "' != '" + false + "'", boolean91 == false);
        org.junit.Assert.assertNotNull(strMap92);
        org.junit.Assert.assertNotNull(strMap96);
    }

    @Test
    public void test18149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18149");
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory0 = new fitnesse.testsystems.slim.tables.SlimTableFactory();
        java.lang.String str2 = slimTableFactory0.getFullTableName("hi!");
        java.util.Map<java.lang.String, java.lang.String> strMap3 = slimTableFactory0.tableTypeArrays;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory4 = new fitnesse.testsystems.slim.tables.SlimTableFactory();
        java.lang.String str6 = slimTableFactory4.getFullTableName("hi!");
        java.util.Map<java.lang.String, java.lang.String> strMap7 = slimTableFactory4.tableTypeArrays;
        slimTableFactory0.tableTypeArrays = strMap7;
        java.lang.String str10 = slimTableFactory0.makeTableType("");
        java.util.Map<java.lang.String, java.lang.String> strMap11 = slimTableFactory0.tableTypeArrays;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory12 = new fitnesse.testsystems.slim.tables.SlimTableFactory();
        java.lang.String str14 = slimTableFactory12.getFullTableName("hi!");
        java.util.Map<java.lang.String, java.lang.String> strMap15 = slimTableFactory12.tableTypeArrays;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory16 = slimTableFactory12.copy();
        java.util.Map<java.lang.String, java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable>> strMap17 = slimTableFactory16.tableTypes;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory18 = slimTableFactory16.copy();
        java.lang.String str20 = slimTableFactory18.getFullTableName("hi!");
        java.util.Map<java.lang.String, java.lang.String> strMap21 = slimTableFactory18.tableTypeArrays;
        slimTableFactory0.tableTypeArrays = strMap21;
        java.lang.String str24 = slimTableFactory0.makeTableType("");
        java.lang.String str26 = slimTableFactory0.makeTableType("");
        java.util.Map<java.lang.String, java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable>> strMap27 = slimTableFactory0.tableTypes;
        boolean boolean29 = slimTableFactory0.hasColon("");
        boolean boolean31 = slimTableFactory0.hasColon("hi!");
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory32 = slimTableFactory0.copy();
        java.util.Map<java.lang.String, java.lang.String> strMap33 = slimTableFactory0.tableTypeArrays;
        fitnesse.testsystems.slim.Table table34 = null;
        // The following exception was thrown during execution in test generation
        try {
            slimTableFactory0.parseDefineTableTypeRow(table34, (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!" + "'", str2, "hi!");
        org.junit.Assert.assertNotNull(strMap3);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertNotNull(strMap7);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNotNull(strMap11);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertNotNull(strMap15);
        org.junit.Assert.assertNotNull(slimTableFactory16);
        org.junit.Assert.assertNotNull(strMap17);
        org.junit.Assert.assertNotNull(slimTableFactory18);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "hi!" + "'", str20, "hi!");
        org.junit.Assert.assertNotNull(strMap21);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "" + "'", str24, "");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "" + "'", str26, "");
        org.junit.Assert.assertNotNull(strMap27);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertNotNull(slimTableFactory32);
        org.junit.Assert.assertNotNull(strMap33);
    }

    @Test
    public void test18150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18150");
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory0 = new fitnesse.testsystems.slim.tables.SlimTableFactory();
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory1 = new fitnesse.testsystems.slim.tables.SlimTableFactory();
        java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable> wildcardClass3 = slimTableFactory1.getTableType("");
        java.lang.String str5 = slimTableFactory1.getFullTableName("");
        java.util.Map<java.lang.String, java.lang.String> strMap6 = slimTableFactory1.tableTypeArrays;
        slimTableFactory0.tableTypeArrays = strMap6;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory8 = slimTableFactory0.copy();
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory9 = slimTableFactory8.copy();
        java.util.Map<java.lang.String, java.lang.String> strMap10 = slimTableFactory9.tableTypeArrays;
        java.lang.String str12 = slimTableFactory9.makeTableType("hi!");
        java.lang.String str14 = slimTableFactory9.getFullTableName("hi!");
        java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable> wildcardClass16 = slimTableFactory9.getTableType("");
        java.util.Map<java.lang.String, java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable>> strMap17 = slimTableFactory9.tableTypes;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory18 = slimTableFactory9.copy();
        java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable> wildcardClass20 = slimTableFactory18.getTableType("");
        java.lang.String str22 = slimTableFactory18.makeTableType("");
        java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable> wildcardClass24 = slimTableFactory18.getTableType("");
        java.lang.String str26 = slimTableFactory18.makeTableType("");
        boolean boolean28 = slimTableFactory18.hasColon("");
        java.lang.String str30 = slimTableFactory18.makeTableType("hi!");
        fitnesse.testsystems.slim.Table table31 = null;
        // The following exception was thrown during execution in test generation
        try {
            fitnesse.testsystems.slim.tables.SlimTable slimTable32 = slimTableFactory18.parseDefineTableTypeTable(table31);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(wildcardClass3);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(strMap6);
        org.junit.Assert.assertNotNull(slimTableFactory8);
        org.junit.Assert.assertNotNull(slimTableFactory9);
        org.junit.Assert.assertNotNull(strMap10);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertNull(wildcardClass16);
        org.junit.Assert.assertNotNull(strMap17);
        org.junit.Assert.assertNotNull(slimTableFactory18);
        org.junit.Assert.assertNull(wildcardClass20);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertNull(wildcardClass24);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "" + "'", str26, "");
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "hi!" + "'", str30, "hi!");
    }

    @Test
    public void test18151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18151");
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory0 = new fitnesse.testsystems.slim.tables.SlimTableFactory();
        java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable> wildcardClass2 = slimTableFactory0.getTableType("");
        java.lang.String str4 = slimTableFactory0.getFullTableName("");
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory5 = slimTableFactory0.copy();
        boolean boolean7 = slimTableFactory0.hasColon("");
        java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable> wildcardClass9 = slimTableFactory0.getTableType("");
        java.lang.String str11 = slimTableFactory0.makeTableType("");
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory12 = slimTableFactory0.copy();
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory13 = new fitnesse.testsystems.slim.tables.SlimTableFactory();
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory14 = new fitnesse.testsystems.slim.tables.SlimTableFactory();
        java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable> wildcardClass16 = slimTableFactory14.getTableType("");
        java.lang.String str18 = slimTableFactory14.getFullTableName("");
        java.util.Map<java.lang.String, java.lang.String> strMap19 = slimTableFactory14.tableTypeArrays;
        slimTableFactory13.tableTypeArrays = strMap19;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory21 = slimTableFactory13.copy();
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory22 = slimTableFactory21.copy();
        java.util.Map<java.lang.String, java.lang.String> strMap23 = slimTableFactory22.tableTypeArrays;
        slimTableFactory12.tableTypeArrays = strMap23;
        java.lang.String str26 = slimTableFactory12.getFullTableName("hi!");
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory27 = slimTableFactory12.copy();
        java.util.Map<java.lang.String, java.lang.String> strMap28 = slimTableFactory27.tableTypeArrays;
        org.junit.Assert.assertNull(wildcardClass2);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(slimTableFactory5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(wildcardClass9);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNotNull(slimTableFactory12);
        org.junit.Assert.assertNull(wildcardClass16);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertNotNull(strMap19);
        org.junit.Assert.assertNotNull(slimTableFactory21);
        org.junit.Assert.assertNotNull(slimTableFactory22);
        org.junit.Assert.assertNotNull(strMap23);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "hi!" + "'", str26, "hi!");
        org.junit.Assert.assertNotNull(slimTableFactory27);
        org.junit.Assert.assertNotNull(strMap28);
    }

    @Test
    public void test18152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18152");
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory0 = new fitnesse.testsystems.slim.tables.SlimTableFactory();
        java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable> wildcardClass2 = slimTableFactory0.getTableType("");
        java.lang.String str4 = slimTableFactory0.getFullTableName("");
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory5 = slimTableFactory0.copy();
        java.util.Map<java.lang.String, java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable>> strMap6 = slimTableFactory0.tableTypes;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory7 = new fitnesse.testsystems.slim.tables.SlimTableFactory();
        java.lang.String str9 = slimTableFactory7.getFullTableName("hi!");
        java.util.Map<java.lang.String, java.lang.String> strMap10 = slimTableFactory7.tableTypeArrays;
        java.lang.String str12 = slimTableFactory7.makeTableType("");
        java.util.Map<java.lang.String, java.lang.String> strMap13 = slimTableFactory7.tableTypeArrays;
        java.lang.String str15 = slimTableFactory7.getFullTableName("");
        java.util.Map<java.lang.String, java.lang.String> strMap16 = slimTableFactory7.tableTypeArrays;
        slimTableFactory0.tableTypeArrays = strMap16;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory18 = slimTableFactory0.copy();
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory19 = slimTableFactory18.copy();
        fitnesse.testsystems.slim.Table table20 = null;
        // The following exception was thrown during execution in test generation
        try {
            slimTableFactory18.parseDefineTableTypeRow(table20, (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(wildcardClass2);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(slimTableFactory5);
        org.junit.Assert.assertNotNull(strMap6);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertNotNull(strMap10);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertNotNull(strMap13);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertNotNull(strMap16);
        org.junit.Assert.assertNotNull(slimTableFactory18);
        org.junit.Assert.assertNotNull(slimTableFactory19);
    }

    @Test
    public void test18153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18153");
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory0 = new fitnesse.testsystems.slim.tables.SlimTableFactory();
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory1 = new fitnesse.testsystems.slim.tables.SlimTableFactory();
        java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable> wildcardClass3 = slimTableFactory1.getTableType("");
        java.lang.String str5 = slimTableFactory1.getFullTableName("");
        java.util.Map<java.lang.String, java.lang.String> strMap6 = slimTableFactory1.tableTypeArrays;
        slimTableFactory0.tableTypeArrays = strMap6;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory8 = slimTableFactory0.copy();
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory9 = slimTableFactory8.copy();
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory10 = slimTableFactory8.copy();
        java.util.Map<java.lang.String, java.lang.String> strMap11 = slimTableFactory8.tableTypeArrays;
        java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable> wildcardClass13 = slimTableFactory8.getTableType("");
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory14 = slimTableFactory8.copy();
        fitnesse.testsystems.slim.Table table15 = null;
        fitnesse.testsystems.slim.SlimTestContext slimTestContext17 = null;
        // The following exception was thrown during execution in test generation
        try {
            fitnesse.testsystems.slim.tables.SlimTable slimTable18 = slimTableFactory8.makeSlimTable(table15, "hi!", slimTestContext17);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(wildcardClass3);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(strMap6);
        org.junit.Assert.assertNotNull(slimTableFactory8);
        org.junit.Assert.assertNotNull(slimTableFactory9);
        org.junit.Assert.assertNotNull(slimTableFactory10);
        org.junit.Assert.assertNotNull(strMap11);
        org.junit.Assert.assertNull(wildcardClass13);
        org.junit.Assert.assertNotNull(slimTableFactory14);
    }

    @Test
    public void test18154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18154");
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory0 = new fitnesse.testsystems.slim.tables.SlimTableFactory();
        java.lang.String str2 = slimTableFactory0.getFullTableName("hi!");
        java.util.Map<java.lang.String, java.lang.String> strMap3 = slimTableFactory0.tableTypeArrays;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory4 = slimTableFactory0.copy();
        java.util.Map<java.lang.String, java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable>> strMap5 = slimTableFactory4.tableTypes;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory6 = slimTableFactory4.copy();
        java.lang.String str8 = slimTableFactory6.getFullTableName("hi!");
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory9 = slimTableFactory6.copy();
        java.lang.String str11 = slimTableFactory6.getFullTableName("hi!");
        boolean boolean13 = slimTableFactory6.hasColon("");
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory14 = new fitnesse.testsystems.slim.tables.SlimTableFactory();
        java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable> wildcardClass16 = slimTableFactory14.getTableType("");
        java.lang.String str18 = slimTableFactory14.getFullTableName("");
        java.util.Map<java.lang.String, java.lang.String> strMap19 = slimTableFactory14.tableTypeArrays;
        java.util.Map<java.lang.String, java.lang.String> strMap20 = slimTableFactory14.tableTypeArrays;
        java.lang.String str22 = slimTableFactory14.getFullTableName("hi!");
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory23 = new fitnesse.testsystems.slim.tables.SlimTableFactory();
        java.lang.String str25 = slimTableFactory23.getFullTableName("hi!");
        java.lang.String str27 = slimTableFactory23.makeTableType("");
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory28 = slimTableFactory23.copy();
        java.lang.String str30 = slimTableFactory23.makeTableType("");
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory31 = new fitnesse.testsystems.slim.tables.SlimTableFactory();
        java.lang.String str33 = slimTableFactory31.getFullTableName("hi!");
        java.util.Map<java.lang.String, java.lang.String> strMap34 = slimTableFactory31.tableTypeArrays;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory35 = slimTableFactory31.copy();
        boolean boolean37 = slimTableFactory31.hasColon("hi!");
        java.util.Map<java.lang.String, java.lang.String> strMap38 = slimTableFactory31.tableTypeArrays;
        slimTableFactory23.tableTypeArrays = strMap38;
        slimTableFactory14.tableTypeArrays = strMap38;
        java.util.Map<java.lang.String, java.lang.String> strMap41 = slimTableFactory14.tableTypeArrays;
        slimTableFactory6.tableTypeArrays = strMap41;
        java.util.Map<java.lang.String, java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable>> strMap43 = slimTableFactory6.tableTypes;
        java.util.Map<java.lang.String, java.lang.String> strMap44 = slimTableFactory6.tableTypeArrays;
        java.lang.String str46 = slimTableFactory6.getFullTableName("hi!");
        fitnesse.testsystems.slim.Table table47 = null;
        // The following exception was thrown during execution in test generation
        try {
            fitnesse.testsystems.slim.tables.SlimTable slimTable48 = slimTableFactory6.parseDefineTableTypeTable(table47);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!" + "'", str2, "hi!");
        org.junit.Assert.assertNotNull(strMap3);
        org.junit.Assert.assertNotNull(slimTableFactory4);
        org.junit.Assert.assertNotNull(strMap5);
        org.junit.Assert.assertNotNull(slimTableFactory6);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertNotNull(slimTableFactory9);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNull(wildcardClass16);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertNotNull(strMap19);
        org.junit.Assert.assertNotNull(strMap20);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "hi!" + "'", str22, "hi!");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "hi!" + "'", str25, "hi!");
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "" + "'", str27, "");
        org.junit.Assert.assertNotNull(slimTableFactory28);
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "" + "'", str30, "");
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "hi!" + "'", str33, "hi!");
        org.junit.Assert.assertNotNull(strMap34);
        org.junit.Assert.assertNotNull(slimTableFactory35);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertNotNull(strMap38);
        org.junit.Assert.assertNotNull(strMap41);
        org.junit.Assert.assertNotNull(strMap43);
        org.junit.Assert.assertNotNull(strMap44);
        org.junit.Assert.assertEquals("'" + str46 + "' != '" + "hi!" + "'", str46, "hi!");
    }

    @Test
    public void test18155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18155");
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory0 = new fitnesse.testsystems.slim.tables.SlimTableFactory();
        java.lang.String str2 = slimTableFactory0.getFullTableName("hi!");
        java.util.Map<java.lang.String, java.lang.String> strMap3 = slimTableFactory0.tableTypeArrays;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory4 = slimTableFactory0.copy();
        boolean boolean6 = slimTableFactory0.hasColon("hi!");
        java.util.Map<java.lang.String, java.lang.String> strMap7 = slimTableFactory0.tableTypeArrays;
        java.util.Map<java.lang.String, java.lang.String> strMap8 = slimTableFactory0.tableTypeArrays;
        java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable> wildcardClass10 = slimTableFactory0.getTableType("hi!");
        java.lang.String str12 = slimTableFactory0.makeTableType("hi!");
        java.util.Map<java.lang.String, java.lang.String> strMap13 = slimTableFactory0.tableTypeArrays;
        java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable> wildcardClass15 = slimTableFactory0.getTableType("");
        fitnesse.testsystems.slim.Table table16 = null;
        fitnesse.testsystems.slim.SlimTestContext slimTestContext18 = null;
        // The following exception was thrown during execution in test generation
        try {
            fitnesse.testsystems.slim.tables.SlimTable slimTable19 = slimTableFactory0.makeSlimTable(table16, "hi!", slimTestContext18);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!" + "'", str2, "hi!");
        org.junit.Assert.assertNotNull(strMap3);
        org.junit.Assert.assertNotNull(slimTableFactory4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(strMap7);
        org.junit.Assert.assertNotNull(strMap8);
        org.junit.Assert.assertNull(wildcardClass10);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertNotNull(strMap13);
        org.junit.Assert.assertNull(wildcardClass15);
    }

    @Test
    public void test18156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18156");
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory0 = new fitnesse.testsystems.slim.tables.SlimTableFactory();
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory1 = slimTableFactory0.copy();
        java.lang.String str3 = slimTableFactory0.makeTableType("hi!");
        java.lang.String str5 = slimTableFactory0.makeTableType("");
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory6 = slimTableFactory0.copy();
        java.util.Map<java.lang.String, java.lang.String> strMap7 = slimTableFactory6.tableTypeArrays;
        java.util.Map<java.lang.String, java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable>> strMap8 = slimTableFactory6.tableTypes;
        java.lang.String str10 = slimTableFactory6.makeTableType("");
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory11 = new fitnesse.testsystems.slim.tables.SlimTableFactory();
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory12 = new fitnesse.testsystems.slim.tables.SlimTableFactory();
        java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable> wildcardClass14 = slimTableFactory12.getTableType("");
        java.lang.String str16 = slimTableFactory12.getFullTableName("");
        java.util.Map<java.lang.String, java.lang.String> strMap17 = slimTableFactory12.tableTypeArrays;
        slimTableFactory11.tableTypeArrays = strMap17;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory19 = slimTableFactory11.copy();
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory20 = slimTableFactory19.copy();
        java.util.Map<java.lang.String, java.lang.String> strMap21 = slimTableFactory20.tableTypeArrays;
        java.lang.String str23 = slimTableFactory20.makeTableType("hi!");
        java.lang.String str25 = slimTableFactory20.getFullTableName("hi!");
        java.util.Map<java.lang.String, java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable>> strMap26 = slimTableFactory20.tableTypes;
        boolean boolean28 = slimTableFactory20.hasColon("hi!");
        java.lang.String str30 = slimTableFactory20.makeTableType("hi!");
        java.lang.String str32 = slimTableFactory20.makeTableType("");
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory33 = new fitnesse.testsystems.slim.tables.SlimTableFactory();
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory34 = slimTableFactory33.copy();
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory35 = slimTableFactory34.copy();
        boolean boolean37 = slimTableFactory34.hasColon("hi!");
        java.util.Map<java.lang.String, java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable>> strMap38 = slimTableFactory34.tableTypes;
        java.lang.String str40 = slimTableFactory34.makeTableType("hi!");
        java.util.Map<java.lang.String, java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable>> strMap41 = slimTableFactory34.tableTypes;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory42 = new fitnesse.testsystems.slim.tables.SlimTableFactory();
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory43 = new fitnesse.testsystems.slim.tables.SlimTableFactory();
        java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable> wildcardClass45 = slimTableFactory43.getTableType("");
        java.lang.String str47 = slimTableFactory43.getFullTableName("");
        java.util.Map<java.lang.String, java.lang.String> strMap48 = slimTableFactory43.tableTypeArrays;
        slimTableFactory42.tableTypeArrays = strMap48;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory50 = slimTableFactory42.copy();
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory51 = slimTableFactory50.copy();
        java.util.Map<java.lang.String, java.lang.String> strMap52 = slimTableFactory51.tableTypeArrays;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory53 = new fitnesse.testsystems.slim.tables.SlimTableFactory();
        java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable> wildcardClass55 = slimTableFactory53.getTableType("");
        java.lang.String str57 = slimTableFactory53.getFullTableName("");
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory58 = slimTableFactory53.copy();
        boolean boolean60 = slimTableFactory53.hasColon("");
        java.util.Map<java.lang.String, java.lang.String> strMap61 = slimTableFactory53.tableTypeArrays;
        slimTableFactory51.tableTypeArrays = strMap61;
        slimTableFactory34.tableTypeArrays = strMap61;
        slimTableFactory20.tableTypeArrays = strMap61;
        slimTableFactory6.tableTypeArrays = strMap61;
        java.util.Map<java.lang.String, java.lang.String> strMap66 = slimTableFactory6.tableTypeArrays;
        fitnesse.testsystems.slim.Table table67 = null;
        // The following exception was thrown during execution in test generation
        try {
            fitnesse.testsystems.slim.tables.SlimTable slimTable68 = slimTableFactory6.parseDefineTableTypeTable(table67);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(slimTableFactory1);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(slimTableFactory6);
        org.junit.Assert.assertNotNull(strMap7);
        org.junit.Assert.assertNotNull(strMap8);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNull(wildcardClass14);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertNotNull(strMap17);
        org.junit.Assert.assertNotNull(slimTableFactory19);
        org.junit.Assert.assertNotNull(slimTableFactory20);
        org.junit.Assert.assertNotNull(strMap21);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "hi!" + "'", str23, "hi!");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "hi!" + "'", str25, "hi!");
        org.junit.Assert.assertNotNull(strMap26);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "hi!" + "'", str30, "hi!");
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "" + "'", str32, "");
        org.junit.Assert.assertNotNull(slimTableFactory34);
        org.junit.Assert.assertNotNull(slimTableFactory35);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertNotNull(strMap38);
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "hi!" + "'", str40, "hi!");
        org.junit.Assert.assertNotNull(strMap41);
        org.junit.Assert.assertNull(wildcardClass45);
        org.junit.Assert.assertEquals("'" + str47 + "' != '" + "" + "'", str47, "");
        org.junit.Assert.assertNotNull(strMap48);
        org.junit.Assert.assertNotNull(slimTableFactory50);
        org.junit.Assert.assertNotNull(slimTableFactory51);
        org.junit.Assert.assertNotNull(strMap52);
        org.junit.Assert.assertNull(wildcardClass55);
        org.junit.Assert.assertEquals("'" + str57 + "' != '" + "" + "'", str57, "");
        org.junit.Assert.assertNotNull(slimTableFactory58);
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + false + "'", boolean60 == false);
        org.junit.Assert.assertNotNull(strMap61);
        org.junit.Assert.assertNotNull(strMap66);
    }

    @Test
    public void test18157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18157");
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory0 = new fitnesse.testsystems.slim.tables.SlimTableFactory();
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory1 = slimTableFactory0.copy();
        java.lang.String str3 = slimTableFactory0.makeTableType("hi!");
        java.lang.String str5 = slimTableFactory0.makeTableType("");
        java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable> wildcardClass7 = slimTableFactory0.getTableType("");
        java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable> wildcardClass9 = slimTableFactory0.getTableType("hi!");
        java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable> wildcardClass11 = slimTableFactory0.getTableType("");
        java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable> wildcardClass13 = slimTableFactory0.getTableType("");
        boolean boolean15 = slimTableFactory0.hasColon("");
        org.junit.Assert.assertNotNull(slimTableFactory1);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNull(wildcardClass7);
        org.junit.Assert.assertNull(wildcardClass9);
        org.junit.Assert.assertNull(wildcardClass11);
        org.junit.Assert.assertNull(wildcardClass13);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test18158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18158");
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory0 = new fitnesse.testsystems.slim.tables.SlimTableFactory();
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory1 = new fitnesse.testsystems.slim.tables.SlimTableFactory();
        java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable> wildcardClass3 = slimTableFactory1.getTableType("");
        java.lang.String str5 = slimTableFactory1.getFullTableName("");
        java.util.Map<java.lang.String, java.lang.String> strMap6 = slimTableFactory1.tableTypeArrays;
        slimTableFactory0.tableTypeArrays = strMap6;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory8 = slimTableFactory0.copy();
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory9 = slimTableFactory8.copy();
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory10 = slimTableFactory8.copy();
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory11 = slimTableFactory8.copy();
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory12 = slimTableFactory8.copy();
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory13 = slimTableFactory12.copy();
        java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable> wildcardClass15 = slimTableFactory12.getTableType("hi!");
        java.lang.String str17 = slimTableFactory12.getFullTableName("hi!");
        java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable> wildcardClass19 = slimTableFactory12.getTableType("");
        fitnesse.testsystems.slim.Table table20 = null;
        // The following exception was thrown during execution in test generation
        try {
            slimTableFactory12.parseDefineTableTypeRow(table20, (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(wildcardClass3);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(strMap6);
        org.junit.Assert.assertNotNull(slimTableFactory8);
        org.junit.Assert.assertNotNull(slimTableFactory9);
        org.junit.Assert.assertNotNull(slimTableFactory10);
        org.junit.Assert.assertNotNull(slimTableFactory11);
        org.junit.Assert.assertNotNull(slimTableFactory12);
        org.junit.Assert.assertNotNull(slimTableFactory13);
        org.junit.Assert.assertNull(wildcardClass15);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
        org.junit.Assert.assertNull(wildcardClass19);
    }

    @Test
    public void test18159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18159");
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory0 = new fitnesse.testsystems.slim.tables.SlimTableFactory();
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory1 = slimTableFactory0.copy();
        java.lang.String str3 = slimTableFactory0.makeTableType("hi!");
        java.lang.String str5 = slimTableFactory0.makeTableType("");
        java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable> wildcardClass7 = slimTableFactory0.getTableType("");
        java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable> wildcardClass9 = slimTableFactory0.getTableType("hi!");
        java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable> wildcardClass11 = slimTableFactory0.getTableType("");
        java.lang.String str13 = slimTableFactory0.getFullTableName("hi!");
        java.util.Map<java.lang.String, java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable>> strMap14 = slimTableFactory0.tableTypes;
        org.junit.Assert.assertNotNull(slimTableFactory1);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNull(wildcardClass7);
        org.junit.Assert.assertNull(wildcardClass9);
        org.junit.Assert.assertNull(wildcardClass11);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertNotNull(strMap14);
    }

    @Test
    public void test18160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18160");
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory0 = new fitnesse.testsystems.slim.tables.SlimTableFactory();
        java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable> wildcardClass2 = slimTableFactory0.getTableType("");
        boolean boolean4 = slimTableFactory0.hasColon("");
        boolean boolean6 = slimTableFactory0.hasColon("hi!");
        java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable> wildcardClass8 = slimTableFactory0.getTableType("hi!");
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory9 = new fitnesse.testsystems.slim.tables.SlimTableFactory();
        java.lang.String str11 = slimTableFactory9.getFullTableName("hi!");
        java.lang.String str13 = slimTableFactory9.makeTableType("");
        java.util.Map<java.lang.String, java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable>> strMap14 = slimTableFactory9.tableTypes;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory15 = new fitnesse.testsystems.slim.tables.SlimTableFactory();
        java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable> wildcardClass17 = slimTableFactory15.getTableType("");
        java.lang.String str19 = slimTableFactory15.getFullTableName("");
        java.util.Map<java.lang.String, java.lang.String> strMap20 = slimTableFactory15.tableTypeArrays;
        slimTableFactory9.tableTypeArrays = strMap20;
        slimTableFactory0.tableTypeArrays = strMap20;
        boolean boolean24 = slimTableFactory0.hasColon("");
        java.lang.String str26 = slimTableFactory0.getFullTableName("hi!");
        java.util.Map<java.lang.String, java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable>> strMap27 = slimTableFactory0.tableTypes;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory28 = new fitnesse.testsystems.slim.tables.SlimTableFactory();
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory29 = slimTableFactory28.copy();
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory30 = slimTableFactory29.copy();
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory31 = new fitnesse.testsystems.slim.tables.SlimTableFactory();
        java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable> wildcardClass33 = slimTableFactory31.getTableType("");
        java.lang.String str35 = slimTableFactory31.getFullTableName("");
        java.util.Map<java.lang.String, java.lang.String> strMap36 = slimTableFactory31.tableTypeArrays;
        java.util.Map<java.lang.String, java.lang.String> strMap37 = slimTableFactory31.tableTypeArrays;
        java.lang.String str39 = slimTableFactory31.makeTableType("hi!");
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory40 = new fitnesse.testsystems.slim.tables.SlimTableFactory();
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory41 = new fitnesse.testsystems.slim.tables.SlimTableFactory();
        java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable> wildcardClass43 = slimTableFactory41.getTableType("");
        java.lang.String str45 = slimTableFactory41.getFullTableName("");
        java.util.Map<java.lang.String, java.lang.String> strMap46 = slimTableFactory41.tableTypeArrays;
        slimTableFactory40.tableTypeArrays = strMap46;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory48 = slimTableFactory40.copy();
        java.lang.String str50 = slimTableFactory40.getFullTableName("hi!");
        java.util.Map<java.lang.String, java.lang.String> strMap51 = slimTableFactory40.tableTypeArrays;
        slimTableFactory31.tableTypeArrays = strMap51;
        slimTableFactory29.tableTypeArrays = strMap51;
        java.lang.String str55 = slimTableFactory29.makeTableType("hi!");
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory56 = new fitnesse.testsystems.slim.tables.SlimTableFactory();
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory57 = new fitnesse.testsystems.slim.tables.SlimTableFactory();
        java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable> wildcardClass59 = slimTableFactory57.getTableType("");
        java.lang.String str61 = slimTableFactory57.getFullTableName("");
        java.util.Map<java.lang.String, java.lang.String> strMap62 = slimTableFactory57.tableTypeArrays;
        slimTableFactory56.tableTypeArrays = strMap62;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory64 = slimTableFactory56.copy();
        java.util.Map<java.lang.String, java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable>> strMap65 = slimTableFactory56.tableTypes;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory66 = new fitnesse.testsystems.slim.tables.SlimTableFactory();
        java.lang.String str68 = slimTableFactory66.getFullTableName("hi!");
        java.util.Map<java.lang.String, java.lang.String> strMap69 = slimTableFactory66.tableTypeArrays;
        java.lang.String str71 = slimTableFactory66.makeTableType("");
        java.util.Map<java.lang.String, java.lang.String> strMap72 = slimTableFactory66.tableTypeArrays;
        slimTableFactory56.tableTypeArrays = strMap72;
        slimTableFactory29.tableTypeArrays = strMap72;
        slimTableFactory0.tableTypeArrays = strMap72;
        java.util.Map<java.lang.String, java.lang.String> strMap76 = slimTableFactory0.tableTypeArrays;
        java.lang.String str78 = slimTableFactory0.makeTableType("hi!");
        java.util.Map<java.lang.String, java.lang.String> strMap79 = slimTableFactory0.tableTypeArrays;
        org.junit.Assert.assertNull(wildcardClass2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(wildcardClass8);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNotNull(strMap14);
        org.junit.Assert.assertNull(wildcardClass17);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertNotNull(strMap20);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "hi!" + "'", str26, "hi!");
        org.junit.Assert.assertNotNull(strMap27);
        org.junit.Assert.assertNotNull(slimTableFactory29);
        org.junit.Assert.assertNotNull(slimTableFactory30);
        org.junit.Assert.assertNull(wildcardClass33);
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "" + "'", str35, "");
        org.junit.Assert.assertNotNull(strMap36);
        org.junit.Assert.assertNotNull(strMap37);
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "hi!" + "'", str39, "hi!");
        org.junit.Assert.assertNull(wildcardClass43);
        org.junit.Assert.assertEquals("'" + str45 + "' != '" + "" + "'", str45, "");
        org.junit.Assert.assertNotNull(strMap46);
        org.junit.Assert.assertNotNull(slimTableFactory48);
        org.junit.Assert.assertEquals("'" + str50 + "' != '" + "hi!" + "'", str50, "hi!");
        org.junit.Assert.assertNotNull(strMap51);
        org.junit.Assert.assertEquals("'" + str55 + "' != '" + "hi!" + "'", str55, "hi!");
        org.junit.Assert.assertNull(wildcardClass59);
        org.junit.Assert.assertEquals("'" + str61 + "' != '" + "" + "'", str61, "");
        org.junit.Assert.assertNotNull(strMap62);
        org.junit.Assert.assertNotNull(slimTableFactory64);
        org.junit.Assert.assertNotNull(strMap65);
        org.junit.Assert.assertEquals("'" + str68 + "' != '" + "hi!" + "'", str68, "hi!");
        org.junit.Assert.assertNotNull(strMap69);
        org.junit.Assert.assertEquals("'" + str71 + "' != '" + "" + "'", str71, "");
        org.junit.Assert.assertNotNull(strMap72);
        org.junit.Assert.assertNotNull(strMap76);
        org.junit.Assert.assertEquals("'" + str78 + "' != '" + "hi!" + "'", str78, "hi!");
        org.junit.Assert.assertNotNull(strMap79);
    }

    @Test
    public void test18161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18161");
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory0 = new fitnesse.testsystems.slim.tables.SlimTableFactory();
        java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable> wildcardClass2 = slimTableFactory0.getTableType("");
        java.lang.String str4 = slimTableFactory0.getFullTableName("");
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory5 = slimTableFactory0.copy();
        java.lang.String str7 = slimTableFactory0.makeTableType("hi!");
        java.util.Map<java.lang.String, java.lang.String> strMap8 = slimTableFactory0.tableTypeArrays;
        java.util.Map<java.lang.String, java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable>> strMap9 = slimTableFactory0.tableTypes;
        java.lang.String str11 = slimTableFactory0.getFullTableName("hi!");
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory12 = slimTableFactory0.copy();
        java.util.Map<java.lang.String, java.lang.String> strMap13 = slimTableFactory0.tableTypeArrays;
        boolean boolean15 = slimTableFactory0.hasColon("");
        java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable> wildcardClass17 = slimTableFactory0.getTableType("");
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory18 = new fitnesse.testsystems.slim.tables.SlimTableFactory();
        java.lang.String str20 = slimTableFactory18.getFullTableName("hi!");
        java.lang.String str22 = slimTableFactory18.makeTableType("");
        java.util.Map<java.lang.String, java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable>> strMap23 = slimTableFactory18.tableTypes;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory24 = slimTableFactory18.copy();
        java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable> wildcardClass26 = slimTableFactory18.getTableType("hi!");
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory27 = slimTableFactory18.copy();
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory28 = new fitnesse.testsystems.slim.tables.SlimTableFactory();
        java.lang.String str30 = slimTableFactory28.getFullTableName("hi!");
        java.util.Map<java.lang.String, java.lang.String> strMap31 = slimTableFactory28.tableTypeArrays;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory32 = new fitnesse.testsystems.slim.tables.SlimTableFactory();
        java.lang.String str34 = slimTableFactory32.getFullTableName("hi!");
        java.util.Map<java.lang.String, java.lang.String> strMap35 = slimTableFactory32.tableTypeArrays;
        slimTableFactory28.tableTypeArrays = strMap35;
        java.lang.String str38 = slimTableFactory28.makeTableType("");
        java.util.Map<java.lang.String, java.lang.String> strMap39 = slimTableFactory28.tableTypeArrays;
        java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable> wildcardClass41 = slimTableFactory28.getTableType("hi!");
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory42 = slimTableFactory28.copy();
        java.lang.String str44 = slimTableFactory28.makeTableType("");
        java.util.Map<java.lang.String, java.lang.String> strMap45 = slimTableFactory28.tableTypeArrays;
        slimTableFactory18.tableTypeArrays = strMap45;
        slimTableFactory0.tableTypeArrays = strMap45;
        fitnesse.testsystems.slim.Table table48 = null;
        fitnesse.testsystems.slim.SlimTestContext slimTestContext50 = null;
        // The following exception was thrown during execution in test generation
        try {
            fitnesse.testsystems.slim.tables.SlimTable slimTable51 = slimTableFactory0.makeSlimTable(table48, "", slimTestContext50);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(wildcardClass2);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(slimTableFactory5);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertNotNull(strMap8);
        org.junit.Assert.assertNotNull(strMap9);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertNotNull(slimTableFactory12);
        org.junit.Assert.assertNotNull(strMap13);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNull(wildcardClass17);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "hi!" + "'", str20, "hi!");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertNotNull(strMap23);
        org.junit.Assert.assertNotNull(slimTableFactory24);
        org.junit.Assert.assertNull(wildcardClass26);
        org.junit.Assert.assertNotNull(slimTableFactory27);
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "hi!" + "'", str30, "hi!");
        org.junit.Assert.assertNotNull(strMap31);
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "hi!" + "'", str34, "hi!");
        org.junit.Assert.assertNotNull(strMap35);
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "" + "'", str38, "");
        org.junit.Assert.assertNotNull(strMap39);
        org.junit.Assert.assertNull(wildcardClass41);
        org.junit.Assert.assertNotNull(slimTableFactory42);
        org.junit.Assert.assertEquals("'" + str44 + "' != '" + "" + "'", str44, "");
        org.junit.Assert.assertNotNull(strMap45);
    }

    @Test
    public void test18162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18162");
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory0 = new fitnesse.testsystems.slim.tables.SlimTableFactory();
        java.lang.String str2 = slimTableFactory0.getFullTableName("hi!");
        java.util.Map<java.lang.String, java.lang.String> strMap3 = slimTableFactory0.tableTypeArrays;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory4 = slimTableFactory0.copy();
        java.util.Map<java.lang.String, java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable>> strMap5 = slimTableFactory4.tableTypes;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory6 = slimTableFactory4.copy();
        java.lang.String str8 = slimTableFactory6.getFullTableName("hi!");
        java.lang.String str10 = slimTableFactory6.makeTableType("hi!");
        java.lang.String str12 = slimTableFactory6.getFullTableName("hi!");
        java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable> wildcardClass14 = slimTableFactory6.getTableType("");
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory15 = new fitnesse.testsystems.slim.tables.SlimTableFactory();
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory16 = new fitnesse.testsystems.slim.tables.SlimTableFactory();
        java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable> wildcardClass18 = slimTableFactory16.getTableType("");
        java.lang.String str20 = slimTableFactory16.getFullTableName("");
        java.util.Map<java.lang.String, java.lang.String> strMap21 = slimTableFactory16.tableTypeArrays;
        slimTableFactory15.tableTypeArrays = strMap21;
        slimTableFactory6.tableTypeArrays = strMap21;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory24 = new fitnesse.testsystems.slim.tables.SlimTableFactory();
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory25 = new fitnesse.testsystems.slim.tables.SlimTableFactory();
        java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable> wildcardClass27 = slimTableFactory25.getTableType("");
        java.lang.String str29 = slimTableFactory25.getFullTableName("");
        java.util.Map<java.lang.String, java.lang.String> strMap30 = slimTableFactory25.tableTypeArrays;
        slimTableFactory24.tableTypeArrays = strMap30;
        java.util.Map<java.lang.String, java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable>> strMap32 = slimTableFactory24.tableTypes;
        java.util.Map<java.lang.String, java.lang.String> strMap33 = slimTableFactory24.tableTypeArrays;
        slimTableFactory6.tableTypeArrays = strMap33;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory35 = slimTableFactory6.copy();
        java.util.Map<java.lang.String, java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable>> strMap36 = slimTableFactory6.tableTypes;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory37 = slimTableFactory6.copy();
        java.util.Map<java.lang.String, java.lang.String> strMap38 = slimTableFactory37.tableTypeArrays;
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!" + "'", str2, "hi!");
        org.junit.Assert.assertNotNull(strMap3);
        org.junit.Assert.assertNotNull(slimTableFactory4);
        org.junit.Assert.assertNotNull(strMap5);
        org.junit.Assert.assertNotNull(slimTableFactory6);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertNull(wildcardClass14);
        org.junit.Assert.assertNull(wildcardClass18);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertNotNull(strMap21);
        org.junit.Assert.assertNull(wildcardClass27);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "" + "'", str29, "");
        org.junit.Assert.assertNotNull(strMap30);
        org.junit.Assert.assertNotNull(strMap32);
        org.junit.Assert.assertNotNull(strMap33);
        org.junit.Assert.assertNotNull(slimTableFactory35);
        org.junit.Assert.assertNotNull(strMap36);
        org.junit.Assert.assertNotNull(slimTableFactory37);
        org.junit.Assert.assertNotNull(strMap38);
    }

    @Test
    public void test18163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18163");
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory0 = new fitnesse.testsystems.slim.tables.SlimTableFactory();
        java.lang.String str2 = slimTableFactory0.makeTableType("");
        java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable> wildcardClass4 = slimTableFactory0.getTableType("");
        java.lang.String str6 = slimTableFactory0.makeTableType("");
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory7 = slimTableFactory0.copy();
        java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable> wildcardClass9 = slimTableFactory7.getTableType("");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertNull(wildcardClass4);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(slimTableFactory7);
        org.junit.Assert.assertNull(wildcardClass9);
    }

    @Test
    public void test18164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18164");
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory0 = new fitnesse.testsystems.slim.tables.SlimTableFactory();
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory1 = slimTableFactory0.copy();
        java.lang.String str3 = slimTableFactory0.makeTableType("hi!");
        java.util.Map<java.lang.String, java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable>> strMap4 = slimTableFactory0.tableTypes;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory5 = slimTableFactory0.copy();
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory6 = slimTableFactory5.copy();
        java.util.Map<java.lang.String, java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable>> strMap7 = slimTableFactory5.tableTypes;
        java.util.Map<java.lang.String, java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable>> strMap8 = slimTableFactory5.tableTypes;
        java.util.Map<java.lang.String, java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable>> strMap9 = slimTableFactory5.tableTypes;
        java.lang.String str11 = slimTableFactory5.getFullTableName("");
        java.util.Map<java.lang.String, java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable>> strMap12 = slimTableFactory5.tableTypes;
        java.util.Map<java.lang.String, java.lang.String> strMap13 = slimTableFactory5.tableTypeArrays;
        java.lang.String str15 = slimTableFactory5.makeTableType("hi!");
        fitnesse.testsystems.slim.Table table16 = null;
        // The following exception was thrown during execution in test generation
        try {
            fitnesse.testsystems.slim.tables.SlimTable slimTable17 = slimTableFactory5.parseDefineTableTypeTable(table16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(slimTableFactory1);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertNotNull(strMap4);
        org.junit.Assert.assertNotNull(slimTableFactory5);
        org.junit.Assert.assertNotNull(slimTableFactory6);
        org.junit.Assert.assertNotNull(strMap7);
        org.junit.Assert.assertNotNull(strMap8);
        org.junit.Assert.assertNotNull(strMap9);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNotNull(strMap12);
        org.junit.Assert.assertNotNull(strMap13);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
    }

    @Test
    public void test18165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18165");
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory0 = new fitnesse.testsystems.slim.tables.SlimTableFactory();
        java.lang.String str2 = slimTableFactory0.getFullTableName("hi!");
        java.util.Map<java.lang.String, java.lang.String> strMap3 = slimTableFactory0.tableTypeArrays;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory4 = slimTableFactory0.copy();
        java.util.Map<java.lang.String, java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable>> strMap5 = slimTableFactory4.tableTypes;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory6 = slimTableFactory4.copy();
        java.lang.String str8 = slimTableFactory6.getFullTableName("hi!");
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory9 = slimTableFactory6.copy();
        java.util.Map<java.lang.String, java.lang.String> strMap10 = null;
        slimTableFactory9.tableTypeArrays = strMap10;
        boolean boolean13 = slimTableFactory9.hasColon("hi!");
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory14 = new fitnesse.testsystems.slim.tables.SlimTableFactory();
        java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable> wildcardClass16 = slimTableFactory14.getTableType("");
        java.lang.String str18 = slimTableFactory14.getFullTableName("");
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory19 = slimTableFactory14.copy();
        boolean boolean21 = slimTableFactory14.hasColon("");
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory22 = slimTableFactory14.copy();
        java.util.Map<java.lang.String, java.lang.String> strMap23 = slimTableFactory22.tableTypeArrays;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory24 = new fitnesse.testsystems.slim.tables.SlimTableFactory();
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory25 = new fitnesse.testsystems.slim.tables.SlimTableFactory();
        java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable> wildcardClass27 = slimTableFactory25.getTableType("");
        java.lang.String str29 = slimTableFactory25.getFullTableName("");
        java.util.Map<java.lang.String, java.lang.String> strMap30 = slimTableFactory25.tableTypeArrays;
        slimTableFactory24.tableTypeArrays = strMap30;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory32 = slimTableFactory24.copy();
        java.util.Map<java.lang.String, java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable>> strMap33 = slimTableFactory24.tableTypes;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory34 = new fitnesse.testsystems.slim.tables.SlimTableFactory();
        java.lang.String str36 = slimTableFactory34.getFullTableName("hi!");
        java.util.Map<java.lang.String, java.lang.String> strMap37 = slimTableFactory34.tableTypeArrays;
        java.lang.String str39 = slimTableFactory34.makeTableType("");
        java.util.Map<java.lang.String, java.lang.String> strMap40 = slimTableFactory34.tableTypeArrays;
        slimTableFactory24.tableTypeArrays = strMap40;
        slimTableFactory22.tableTypeArrays = strMap40;
        slimTableFactory9.tableTypeArrays = strMap40;
        java.util.Map<java.lang.String, java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable>> strMap44 = slimTableFactory9.tableTypes;
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!" + "'", str2, "hi!");
        org.junit.Assert.assertNotNull(strMap3);
        org.junit.Assert.assertNotNull(slimTableFactory4);
        org.junit.Assert.assertNotNull(strMap5);
        org.junit.Assert.assertNotNull(slimTableFactory6);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertNotNull(slimTableFactory9);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNull(wildcardClass16);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertNotNull(slimTableFactory19);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(slimTableFactory22);
        org.junit.Assert.assertNotNull(strMap23);
        org.junit.Assert.assertNull(wildcardClass27);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "" + "'", str29, "");
        org.junit.Assert.assertNotNull(strMap30);
        org.junit.Assert.assertNotNull(slimTableFactory32);
        org.junit.Assert.assertNotNull(strMap33);
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "hi!" + "'", str36, "hi!");
        org.junit.Assert.assertNotNull(strMap37);
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "" + "'", str39, "");
        org.junit.Assert.assertNotNull(strMap40);
        org.junit.Assert.assertNotNull(strMap44);
    }

    @Test
    public void test18166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18166");
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory0 = new fitnesse.testsystems.slim.tables.SlimTableFactory();
        java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable> wildcardClass2 = slimTableFactory0.getTableType("");
        java.lang.String str4 = slimTableFactory0.getFullTableName("");
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory5 = slimTableFactory0.copy();
        java.lang.String str7 = slimTableFactory0.makeTableType("hi!");
        java.util.Map<java.lang.String, java.lang.String> strMap8 = slimTableFactory0.tableTypeArrays;
        java.util.Map<java.lang.String, java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable>> strMap9 = slimTableFactory0.tableTypes;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory10 = slimTableFactory0.copy();
        java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable> wildcardClass12 = slimTableFactory0.getTableType("hi!");
        java.util.Map<java.lang.String, java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable>> strMap13 = slimTableFactory0.tableTypes;
        org.junit.Assert.assertNull(wildcardClass2);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(slimTableFactory5);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertNotNull(strMap8);
        org.junit.Assert.assertNotNull(strMap9);
        org.junit.Assert.assertNotNull(slimTableFactory10);
        org.junit.Assert.assertNull(wildcardClass12);
        org.junit.Assert.assertNotNull(strMap13);
    }

    @Test
    public void test18167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18167");
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory0 = new fitnesse.testsystems.slim.tables.SlimTableFactory();
        java.lang.String str2 = slimTableFactory0.getFullTableName("hi!");
        java.util.Map<java.lang.String, java.lang.String> strMap3 = slimTableFactory0.tableTypeArrays;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory4 = new fitnesse.testsystems.slim.tables.SlimTableFactory();
        java.lang.String str6 = slimTableFactory4.getFullTableName("hi!");
        java.util.Map<java.lang.String, java.lang.String> strMap7 = slimTableFactory4.tableTypeArrays;
        slimTableFactory0.tableTypeArrays = strMap7;
        java.lang.String str10 = slimTableFactory0.getFullTableName("");
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory11 = slimTableFactory0.copy();
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory12 = slimTableFactory11.copy();
        java.lang.String str14 = slimTableFactory11.makeTableType("hi!");
        boolean boolean16 = slimTableFactory11.hasColon("");
        java.util.Map<java.lang.String, java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable>> strMap17 = slimTableFactory11.tableTypes;
        java.lang.String str19 = slimTableFactory11.makeTableType("");
        java.lang.Class<?> wildcardClass20 = slimTableFactory11.getClass();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!" + "'", str2, "hi!");
        org.junit.Assert.assertNotNull(strMap3);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertNotNull(strMap7);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNotNull(slimTableFactory11);
        org.junit.Assert.assertNotNull(slimTableFactory12);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(strMap17);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test18168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18168");
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory0 = new fitnesse.testsystems.slim.tables.SlimTableFactory();
        java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable> wildcardClass2 = slimTableFactory0.getTableType("");
        java.lang.String str4 = slimTableFactory0.getFullTableName("");
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory5 = slimTableFactory0.copy();
        boolean boolean7 = slimTableFactory0.hasColon("");
        java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable> wildcardClass9 = slimTableFactory0.getTableType("");
        java.lang.String str11 = slimTableFactory0.makeTableType("");
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory12 = slimTableFactory0.copy();
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory13 = new fitnesse.testsystems.slim.tables.SlimTableFactory();
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory14 = new fitnesse.testsystems.slim.tables.SlimTableFactory();
        java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable> wildcardClass16 = slimTableFactory14.getTableType("");
        java.lang.String str18 = slimTableFactory14.getFullTableName("");
        java.util.Map<java.lang.String, java.lang.String> strMap19 = slimTableFactory14.tableTypeArrays;
        slimTableFactory13.tableTypeArrays = strMap19;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory21 = slimTableFactory13.copy();
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory22 = slimTableFactory21.copy();
        java.util.Map<java.lang.String, java.lang.String> strMap23 = slimTableFactory22.tableTypeArrays;
        slimTableFactory12.tableTypeArrays = strMap23;
        java.util.Map<java.lang.String, java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable>> strMap25 = slimTableFactory12.tableTypes;
        fitnesse.testsystems.slim.Table table26 = null;
        // The following exception was thrown during execution in test generation
        try {
            fitnesse.testsystems.slim.tables.SlimTable slimTable27 = slimTableFactory12.parseDefineTableTypeTable(table26);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(wildcardClass2);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(slimTableFactory5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(wildcardClass9);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNotNull(slimTableFactory12);
        org.junit.Assert.assertNull(wildcardClass16);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertNotNull(strMap19);
        org.junit.Assert.assertNotNull(slimTableFactory21);
        org.junit.Assert.assertNotNull(slimTableFactory22);
        org.junit.Assert.assertNotNull(strMap23);
        org.junit.Assert.assertNotNull(strMap25);
    }

    @Test
    public void test18169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18169");
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory0 = new fitnesse.testsystems.slim.tables.SlimTableFactory();
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory1 = new fitnesse.testsystems.slim.tables.SlimTableFactory();
        java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable> wildcardClass3 = slimTableFactory1.getTableType("");
        java.lang.String str5 = slimTableFactory1.getFullTableName("");
        java.util.Map<java.lang.String, java.lang.String> strMap6 = slimTableFactory1.tableTypeArrays;
        slimTableFactory0.tableTypeArrays = strMap6;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory8 = slimTableFactory0.copy();
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory9 = slimTableFactory8.copy();
        java.util.Map<java.lang.String, java.lang.String> strMap10 = slimTableFactory9.tableTypeArrays;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory11 = new fitnesse.testsystems.slim.tables.SlimTableFactory();
        java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable> wildcardClass13 = slimTableFactory11.getTableType("");
        java.lang.String str15 = slimTableFactory11.getFullTableName("");
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory16 = slimTableFactory11.copy();
        boolean boolean18 = slimTableFactory11.hasColon("");
        java.util.Map<java.lang.String, java.lang.String> strMap19 = slimTableFactory11.tableTypeArrays;
        slimTableFactory9.tableTypeArrays = strMap19;
        java.lang.String str22 = slimTableFactory9.getFullTableName("hi!");
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory23 = new fitnesse.testsystems.slim.tables.SlimTableFactory();
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory24 = new fitnesse.testsystems.slim.tables.SlimTableFactory();
        java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable> wildcardClass26 = slimTableFactory24.getTableType("");
        java.lang.String str28 = slimTableFactory24.getFullTableName("");
        java.util.Map<java.lang.String, java.lang.String> strMap29 = slimTableFactory24.tableTypeArrays;
        slimTableFactory23.tableTypeArrays = strMap29;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory31 = slimTableFactory23.copy();
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory32 = slimTableFactory31.copy();
        java.util.Map<java.lang.String, java.lang.String> strMap33 = slimTableFactory32.tableTypeArrays;
        java.lang.String str35 = slimTableFactory32.makeTableType("hi!");
        boolean boolean37 = slimTableFactory32.hasColon("hi!");
        java.util.Map<java.lang.String, java.lang.String> strMap38 = slimTableFactory32.tableTypeArrays;
        slimTableFactory9.tableTypeArrays = strMap38;
        java.util.Map<java.lang.String, java.lang.String> strMap40 = slimTableFactory9.tableTypeArrays;
        java.lang.String str42 = slimTableFactory9.getFullTableName("");
        fitnesse.testsystems.slim.Table table43 = null;
        // The following exception was thrown during execution in test generation
        try {
            fitnesse.testsystems.slim.tables.SlimTable slimTable44 = slimTableFactory9.parseDefineTableTypeTable(table43);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(wildcardClass3);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(strMap6);
        org.junit.Assert.assertNotNull(slimTableFactory8);
        org.junit.Assert.assertNotNull(slimTableFactory9);
        org.junit.Assert.assertNotNull(strMap10);
        org.junit.Assert.assertNull(wildcardClass13);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertNotNull(slimTableFactory16);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(strMap19);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "hi!" + "'", str22, "hi!");
        org.junit.Assert.assertNull(wildcardClass26);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "" + "'", str28, "");
        org.junit.Assert.assertNotNull(strMap29);
        org.junit.Assert.assertNotNull(slimTableFactory31);
        org.junit.Assert.assertNotNull(slimTableFactory32);
        org.junit.Assert.assertNotNull(strMap33);
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "hi!" + "'", str35, "hi!");
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertNotNull(strMap38);
        org.junit.Assert.assertNotNull(strMap40);
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "" + "'", str42, "");
    }

    @Test
    public void test18170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18170");
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory0 = new fitnesse.testsystems.slim.tables.SlimTableFactory();
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory1 = new fitnesse.testsystems.slim.tables.SlimTableFactory();
        java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable> wildcardClass3 = slimTableFactory1.getTableType("");
        java.lang.String str5 = slimTableFactory1.getFullTableName("");
        java.util.Map<java.lang.String, java.lang.String> strMap6 = slimTableFactory1.tableTypeArrays;
        slimTableFactory0.tableTypeArrays = strMap6;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory8 = slimTableFactory0.copy();
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory9 = slimTableFactory8.copy();
        java.util.Map<java.lang.String, java.lang.String> strMap10 = slimTableFactory9.tableTypeArrays;
        java.lang.String str12 = slimTableFactory9.makeTableType("hi!");
        java.lang.String str14 = slimTableFactory9.getFullTableName("hi!");
        java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable> wildcardClass16 = slimTableFactory9.getTableType("");
        java.util.Map<java.lang.String, java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable>> strMap17 = slimTableFactory9.tableTypes;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory18 = new fitnesse.testsystems.slim.tables.SlimTableFactory();
        java.lang.String str20 = slimTableFactory18.getFullTableName("hi!");
        java.lang.String str22 = slimTableFactory18.makeTableType("");
        java.util.Map<java.lang.String, java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable>> strMap23 = slimTableFactory18.tableTypes;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory24 = slimTableFactory18.copy();
        java.lang.String str26 = slimTableFactory18.getFullTableName("");
        java.util.Map<java.lang.String, java.lang.String> strMap27 = slimTableFactory18.tableTypeArrays;
        slimTableFactory9.tableTypeArrays = strMap27;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory29 = slimTableFactory9.copy();
        java.util.Map<java.lang.String, java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable>> strMap30 = slimTableFactory9.tableTypes;
        java.lang.String str32 = slimTableFactory9.makeTableType("");
        java.lang.String str34 = slimTableFactory9.makeTableType("");
        java.util.Map<java.lang.String, java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable>> strMap35 = slimTableFactory9.tableTypes;
        boolean boolean37 = slimTableFactory9.hasColon("");
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory38 = slimTableFactory9.copy();
        boolean boolean40 = slimTableFactory9.hasColon("hi!");
        boolean boolean42 = slimTableFactory9.hasColon("");
        fitnesse.testsystems.slim.Table table43 = null;
        // The following exception was thrown during execution in test generation
        try {
            fitnesse.testsystems.slim.tables.SlimTable slimTable44 = slimTableFactory9.parseDefineTableTypeTable(table43);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(wildcardClass3);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(strMap6);
        org.junit.Assert.assertNotNull(slimTableFactory8);
        org.junit.Assert.assertNotNull(slimTableFactory9);
        org.junit.Assert.assertNotNull(strMap10);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertNull(wildcardClass16);
        org.junit.Assert.assertNotNull(strMap17);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "hi!" + "'", str20, "hi!");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertNotNull(strMap23);
        org.junit.Assert.assertNotNull(slimTableFactory24);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "" + "'", str26, "");
        org.junit.Assert.assertNotNull(strMap27);
        org.junit.Assert.assertNotNull(slimTableFactory29);
        org.junit.Assert.assertNotNull(strMap30);
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "" + "'", str32, "");
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "" + "'", str34, "");
        org.junit.Assert.assertNotNull(strMap35);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertNotNull(slimTableFactory38);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
    }
}

