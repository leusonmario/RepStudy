import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest60 {

    public static boolean debug = false;

    @Test
    public void test30001() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest60.test30001");
        fitnesse.testsystems.slim.tables.SlimTableFactoryTest slimTableFactoryTest0 = new fitnesse.testsystems.slim.tables.SlimTableFactoryTest();
        java.util.Map<java.lang.String, java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable>> strMap1 = slimTableFactoryTest0.map;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory2 = null;
        slimTableFactoryTest0.setslimTableFactory(slimTableFactory2);
        fitnesse.testsystems.slim.Table table4 = null;
        slimTableFactoryTest0.table = table4;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory6 = null;
        slimTableFactoryTest0.slimTableFactory = slimTableFactory6;
        fitnesse.testsystems.slim.Table table8 = null;
        slimTableFactoryTest0.table = table8;
        java.util.Map<java.lang.String, java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable>> strMap10 = slimTableFactoryTest0.map;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory11 = slimTableFactoryTest0.slimTableFactory;
        fitnesse.testsystems.slim.Table table12 = slimTableFactoryTest0.table;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory13 = null;
        slimTableFactoryTest0.slimTableFactory = slimTableFactory13;
        java.util.Map<java.lang.String, java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable>> strMap15 = slimTableFactoryTest0.map;
        java.util.Map<java.lang.String, java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable>> strMap16 = slimTableFactoryTest0.map;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory17 = slimTableFactoryTest0.slimTableFactory;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory18 = null;
        slimTableFactoryTest0.slimTableFactory = slimTableFactory18;
        fitnesse.testsystems.slim.Table table20 = null;
        slimTableFactoryTest0.table = table20;
        org.junit.Assert.assertNull(strMap1);
        org.junit.Assert.assertNull(strMap10);
        org.junit.Assert.assertNull(slimTableFactory11);
        org.junit.Assert.assertNull(table12);
        org.junit.Assert.assertNull(strMap15);
        org.junit.Assert.assertNull(strMap16);
        org.junit.Assert.assertNull(slimTableFactory17);
    }

    @Test
    public void test30002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest60.test30002");
        fitnesse.testsystems.slim.tables.SlimTableFactoryTest slimTableFactoryTest0 = new fitnesse.testsystems.slim.tables.SlimTableFactoryTest();
        fitnesse.testsystems.slim.Table table1 = slimTableFactoryTest0.gettable();
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory2 = slimTableFactoryTest0.slimTableFactory;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory3 = slimTableFactoryTest0.slimTableFactory;
        java.util.Map<java.lang.String, java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable>> strMap4 = slimTableFactoryTest0.getmap();
        java.util.Map<java.lang.String, java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable>> strMap5 = slimTableFactoryTest0.map;
        fitnesse.testsystems.slim.Table table6 = slimTableFactoryTest0.table;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory7 = null;
        slimTableFactoryTest0.slimTableFactory = slimTableFactory7;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory9 = null;
        slimTableFactoryTest0.slimTableFactory = slimTableFactory9;
        fitnesse.testsystems.slim.Table table11 = slimTableFactoryTest0.gettable();
        fitnesse.testsystems.slim.Table table12 = null;
        slimTableFactoryTest0.settable(table12);
        fitnesse.testsystems.slim.Table table14 = slimTableFactoryTest0.gettable();
        // The following exception was thrown during execution in test generation
        try {
            slimTableFactoryTest0.shouldCreateCorrectSlimTableForTablesType();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(table1);
        org.junit.Assert.assertNull(slimTableFactory2);
        org.junit.Assert.assertNull(slimTableFactory3);
        org.junit.Assert.assertNull(strMap4);
        org.junit.Assert.assertNull(strMap5);
        org.junit.Assert.assertNull(table6);
        org.junit.Assert.assertNull(table11);
        org.junit.Assert.assertNull(table14);
    }

    @Test
    public void test30003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest60.test30003");
        fitnesse.testsystems.slim.tables.SlimTableFactoryTest slimTableFactoryTest0 = new fitnesse.testsystems.slim.tables.SlimTableFactoryTest();
        java.util.Map<java.lang.String, java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable>> strMap1 = slimTableFactoryTest0.map;
        fitnesse.testsystems.slim.Table table2 = null;
        slimTableFactoryTest0.settable(table2);
        fitnesse.testsystems.slim.Table table4 = slimTableFactoryTest0.gettable();
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory5 = slimTableFactoryTest0.slimTableFactory;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory6 = slimTableFactoryTest0.slimTableFactory;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory7 = null;
        slimTableFactoryTest0.slimTableFactory = slimTableFactory7;
        java.util.Map<java.lang.String, java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable>> strMap9 = slimTableFactoryTest0.map;
        java.util.Map<java.lang.String, java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable>> strMap10 = slimTableFactoryTest0.map;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory11 = null;
        slimTableFactoryTest0.slimTableFactory = slimTableFactory11;
        org.junit.Assert.assertNull(strMap1);
        org.junit.Assert.assertNull(table4);
        org.junit.Assert.assertNull(slimTableFactory5);
        org.junit.Assert.assertNull(slimTableFactory6);
        org.junit.Assert.assertNull(strMap9);
        org.junit.Assert.assertNull(strMap10);
    }

    @Test
    public void test30004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest60.test30004");
        fitnesse.testsystems.slim.tables.SlimTableFactoryTest slimTableFactoryTest0 = new fitnesse.testsystems.slim.tables.SlimTableFactoryTest();
        java.util.Map<java.lang.String, java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable>> strMap1 = slimTableFactoryTest0.map;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory2 = slimTableFactoryTest0.slimTableFactory;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory3 = null;
        slimTableFactoryTest0.setslimTableFactory(slimTableFactory3);
        fitnesse.testsystems.slim.Table table5 = slimTableFactoryTest0.table;
        fitnesse.testsystems.slim.Table table6 = null;
        slimTableFactoryTest0.table = table6;
        java.util.Map<java.lang.String, java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable>> strMap8 = slimTableFactoryTest0.map;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory9 = null;
        slimTableFactoryTest0.slimTableFactory = slimTableFactory9;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory11 = null;
        slimTableFactoryTest0.slimTableFactory = slimTableFactory11;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory13 = slimTableFactoryTest0.slimTableFactory;
        fitnesse.testsystems.slim.Table table14 = slimTableFactoryTest0.table;
        fitnesse.testsystems.slim.Table table15 = null;
        slimTableFactoryTest0.table = table15;
        fitnesse.testsystems.slim.Table table17 = slimTableFactoryTest0.table;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory18 = slimTableFactoryTest0.getslimTableFactory();
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory19 = null;
        slimTableFactoryTest0.slimTableFactory = slimTableFactory19;
        fitnesse.testsystems.slim.Table table21 = slimTableFactoryTest0.table;
        fitnesse.testsystems.slim.Table table22 = slimTableFactoryTest0.gettable();
        org.junit.Assert.assertNull(strMap1);
        org.junit.Assert.assertNull(slimTableFactory2);
        org.junit.Assert.assertNull(table5);
        org.junit.Assert.assertNull(strMap8);
        org.junit.Assert.assertNull(slimTableFactory13);
        org.junit.Assert.assertNull(table14);
        org.junit.Assert.assertNull(table17);
        org.junit.Assert.assertNull(slimTableFactory18);
        org.junit.Assert.assertNull(table21);
        org.junit.Assert.assertNull(table22);
    }

    @Test
    public void test30005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest60.test30005");
        fitnesse.testsystems.slim.tables.SlimTableFactoryTest slimTableFactoryTest0 = new fitnesse.testsystems.slim.tables.SlimTableFactoryTest();
        java.util.Map<java.lang.String, java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable>> strMap1 = slimTableFactoryTest0.map;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory2 = null;
        slimTableFactoryTest0.setslimTableFactory(slimTableFactory2);
        fitnesse.testsystems.slim.Table table4 = slimTableFactoryTest0.table;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory5 = null;
        slimTableFactoryTest0.setslimTableFactory(slimTableFactory5);
        fitnesse.testsystems.slim.Table table7 = null;
        slimTableFactoryTest0.settable(table7);
        fitnesse.testsystems.slim.Table table9 = slimTableFactoryTest0.table;
        fitnesse.testsystems.slim.Table table10 = slimTableFactoryTest0.table;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory11 = null;
        slimTableFactoryTest0.slimTableFactory = slimTableFactory11;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory13 = slimTableFactoryTest0.slimTableFactory;
        // The following exception was thrown during execution in test generation
        try {
            slimTableFactoryTest0.addTableTypeImport("", "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(strMap1);
        org.junit.Assert.assertNull(table4);
        org.junit.Assert.assertNull(table9);
        org.junit.Assert.assertNull(table10);
        org.junit.Assert.assertNull(slimTableFactory13);
    }

    @Test
    public void test30006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest60.test30006");
        fitnesse.testsystems.slim.tables.SlimTableFactoryTest slimTableFactoryTest0 = new fitnesse.testsystems.slim.tables.SlimTableFactoryTest();
        java.util.Map<java.lang.String, java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable>> strMap1 = slimTableFactoryTest0.map;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory2 = slimTableFactoryTest0.slimTableFactory;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory3 = null;
        slimTableFactoryTest0.setslimTableFactory(slimTableFactory3);
        fitnesse.testsystems.slim.Table table5 = null;
        slimTableFactoryTest0.settable(table5);
        fitnesse.testsystems.slim.Table table7 = slimTableFactoryTest0.gettable();
        java.util.Map<java.lang.String, java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable>> strMap8 = slimTableFactoryTest0.map;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory9 = slimTableFactoryTest0.slimTableFactory;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory10 = null;
        slimTableFactoryTest0.slimTableFactory = slimTableFactory10;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory12 = slimTableFactoryTest0.slimTableFactory;
        fitnesse.testsystems.slim.Table table13 = null;
        slimTableFactoryTest0.table = table13;
        org.junit.Assert.assertNull(strMap1);
        org.junit.Assert.assertNull(slimTableFactory2);
        org.junit.Assert.assertNull(table7);
        org.junit.Assert.assertNull(strMap8);
        org.junit.Assert.assertNull(slimTableFactory9);
        org.junit.Assert.assertNull(slimTableFactory12);
    }

    @Test
    public void test30007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest60.test30007");
        fitnesse.testsystems.slim.tables.SlimTableFactoryTest slimTableFactoryTest0 = new fitnesse.testsystems.slim.tables.SlimTableFactoryTest();
        java.util.Map<java.lang.String, java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable>> strMap1 = slimTableFactoryTest0.map;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory2 = null;
        slimTableFactoryTest0.setslimTableFactory(slimTableFactory2);
        fitnesse.testsystems.slim.Table table4 = null;
        slimTableFactoryTest0.table = table4;
        fitnesse.testsystems.slim.Table table6 = null;
        slimTableFactoryTest0.table = table6;
        fitnesse.testsystems.slim.Table table8 = slimTableFactoryTest0.gettable();
        fitnesse.testsystems.slim.Table table9 = null;
        slimTableFactoryTest0.table = table9;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory11 = slimTableFactoryTest0.getslimTableFactory();
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory12 = null;
        slimTableFactoryTest0.slimTableFactory = slimTableFactory12;
        // The following exception was thrown during execution in test generation
        try {
            slimTableFactoryTest0.checkTableTypeDefineUsedForTable();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(strMap1);
        org.junit.Assert.assertNull(table8);
        org.junit.Assert.assertNull(slimTableFactory11);
    }

    @Test
    public void test30008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest60.test30008");
        fitnesse.testsystems.slim.tables.SlimTableFactoryTest slimTableFactoryTest0 = new fitnesse.testsystems.slim.tables.SlimTableFactoryTest();
        fitnesse.testsystems.slim.Table table1 = slimTableFactoryTest0.gettable();
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory2 = slimTableFactoryTest0.slimTableFactory;
        fitnesse.testsystems.slim.Table table3 = null;
        slimTableFactoryTest0.settable(table3);
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory5 = null;
        slimTableFactoryTest0.setslimTableFactory(slimTableFactory5);
        fitnesse.testsystems.slim.Table table7 = null;
        slimTableFactoryTest0.table = table7;
        fitnesse.testsystems.slim.Table table9 = null;
        slimTableFactoryTest0.settable(table9);
        fitnesse.testsystems.slim.Table table11 = slimTableFactoryTest0.table;
        fitnesse.testsystems.slim.Table table12 = null;
        slimTableFactoryTest0.settable(table12);
        fitnesse.testsystems.slim.Table table14 = slimTableFactoryTest0.table;
        org.junit.Assert.assertNull(table1);
        org.junit.Assert.assertNull(slimTableFactory2);
        org.junit.Assert.assertNull(table11);
        org.junit.Assert.assertNull(table14);
    }

    @Test
    public void test30009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest60.test30009");
        fitnesse.testsystems.slim.tables.SlimTableFactoryTest slimTableFactoryTest0 = new fitnesse.testsystems.slim.tables.SlimTableFactoryTest();
        fitnesse.testsystems.slim.Table table1 = slimTableFactoryTest0.gettable();
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory2 = slimTableFactoryTest0.slimTableFactory;
        fitnesse.testsystems.slim.Table table3 = null;
        slimTableFactoryTest0.settable(table3);
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory5 = null;
        slimTableFactoryTest0.setslimTableFactory(slimTableFactory5);
        fitnesse.testsystems.slim.Table table7 = null;
        slimTableFactoryTest0.settable(table7);
        fitnesse.testsystems.slim.Table table9 = null;
        slimTableFactoryTest0.settable(table9);
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory11 = slimTableFactoryTest0.slimTableFactory;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory12 = null;
        slimTableFactoryTest0.slimTableFactory = slimTableFactory12;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory14 = null;
        slimTableFactoryTest0.slimTableFactory = slimTableFactory14;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory16 = null;
        slimTableFactoryTest0.slimTableFactory = slimTableFactory16;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory18 = slimTableFactoryTest0.getslimTableFactory();
        fitnesse.testsystems.slim.Table table19 = null;
        slimTableFactoryTest0.table = table19;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory21 = slimTableFactoryTest0.getslimTableFactory();
        org.junit.Assert.assertNull(table1);
        org.junit.Assert.assertNull(slimTableFactory2);
        org.junit.Assert.assertNull(slimTableFactory11);
        org.junit.Assert.assertNull(slimTableFactory18);
        org.junit.Assert.assertNull(slimTableFactory21);
    }

    @Test
    public void test30010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest60.test30010");
        fitnesse.testsystems.slim.tables.SlimTableFactoryTest slimTableFactoryTest0 = new fitnesse.testsystems.slim.tables.SlimTableFactoryTest();
        fitnesse.testsystems.slim.Table table1 = slimTableFactoryTest0.gettable();
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory2 = slimTableFactoryTest0.slimTableFactory;
        fitnesse.testsystems.slim.Table table3 = null;
        slimTableFactoryTest0.settable(table3);
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory5 = null;
        slimTableFactoryTest0.setslimTableFactory(slimTableFactory5);
        fitnesse.testsystems.slim.Table table7 = null;
        slimTableFactoryTest0.settable(table7);
        fitnesse.testsystems.slim.Table table9 = null;
        slimTableFactoryTest0.settable(table9);
        fitnesse.testsystems.slim.Table table11 = null;
        slimTableFactoryTest0.settable(table11);
        java.util.Map<java.lang.String, java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable>> strMap13 = slimTableFactoryTest0.map;
        fitnesse.testsystems.slim.Table table14 = slimTableFactoryTest0.table;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory15 = slimTableFactoryTest0.slimTableFactory;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory16 = slimTableFactoryTest0.getslimTableFactory();
        fitnesse.testsystems.slim.Table table17 = slimTableFactoryTest0.gettable();
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory18 = slimTableFactoryTest0.slimTableFactory;
        fitnesse.testsystems.slim.Table table19 = null;
        slimTableFactoryTest0.settable(table19);
        org.junit.Assert.assertNull(table1);
        org.junit.Assert.assertNull(slimTableFactory2);
        org.junit.Assert.assertNull(strMap13);
        org.junit.Assert.assertNull(table14);
        org.junit.Assert.assertNull(slimTableFactory15);
        org.junit.Assert.assertNull(slimTableFactory16);
        org.junit.Assert.assertNull(table17);
        org.junit.Assert.assertNull(slimTableFactory18);
    }

    @Test
    public void test30011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest60.test30011");
        fitnesse.testsystems.slim.tables.SlimTableFactoryTest slimTableFactoryTest0 = new fitnesse.testsystems.slim.tables.SlimTableFactoryTest();
        java.util.Map<java.lang.String, java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable>> strMap1 = slimTableFactoryTest0.map;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory2 = slimTableFactoryTest0.slimTableFactory;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory3 = null;
        slimTableFactoryTest0.slimTableFactory = slimTableFactory3;
        fitnesse.testsystems.slim.Table table5 = slimTableFactoryTest0.table;
        fitnesse.testsystems.slim.Table table6 = null;
        slimTableFactoryTest0.settable(table6);
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory8 = slimTableFactoryTest0.slimTableFactory;
        fitnesse.testsystems.slim.Table table9 = null;
        slimTableFactoryTest0.settable(table9);
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory11 = slimTableFactoryTest0.slimTableFactory;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory12 = slimTableFactoryTest0.slimTableFactory;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory13 = null;
        slimTableFactoryTest0.setslimTableFactory(slimTableFactory13);
        fitnesse.testsystems.slim.Table table15 = slimTableFactoryTest0.table;
        org.junit.Assert.assertNull(strMap1);
        org.junit.Assert.assertNull(slimTableFactory2);
        org.junit.Assert.assertNull(table5);
        org.junit.Assert.assertNull(slimTableFactory8);
        org.junit.Assert.assertNull(slimTableFactory11);
        org.junit.Assert.assertNull(slimTableFactory12);
        org.junit.Assert.assertNull(table15);
    }

    @Test
    public void test30012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest60.test30012");
        fitnesse.testsystems.slim.tables.SlimTableFactoryTest slimTableFactoryTest0 = new fitnesse.testsystems.slim.tables.SlimTableFactoryTest();
        fitnesse.testsystems.slim.Table table1 = slimTableFactoryTest0.gettable();
        fitnesse.testsystems.slim.Table table2 = null;
        slimTableFactoryTest0.settable(table2);
        fitnesse.testsystems.slim.Table table4 = null;
        slimTableFactoryTest0.settable(table4);
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory6 = null;
        slimTableFactoryTest0.slimTableFactory = slimTableFactory6;
        fitnesse.testsystems.slim.Table table8 = null;
        slimTableFactoryTest0.table = table8;
        fitnesse.testsystems.slim.Table table10 = null;
        slimTableFactoryTest0.settable(table10);
        // The following exception was thrown during execution in test generation
        try {
            slimTableFactoryTest0.tableTypeStartingWithcommentColonShouldReturnNull();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(table1);
    }

    @Test
    public void test30013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest60.test30013");
        fitnesse.testsystems.slim.tables.SlimTableFactoryTest slimTableFactoryTest0 = new fitnesse.testsystems.slim.tables.SlimTableFactoryTest();
        fitnesse.testsystems.slim.Table table1 = slimTableFactoryTest0.gettable();
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory2 = slimTableFactoryTest0.slimTableFactory;
        fitnesse.testsystems.slim.Table table3 = null;
        slimTableFactoryTest0.settable(table3);
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory5 = null;
        slimTableFactoryTest0.setslimTableFactory(slimTableFactory5);
        fitnesse.testsystems.slim.Table table7 = null;
        slimTableFactoryTest0.settable(table7);
        fitnesse.testsystems.slim.Table table9 = null;
        slimTableFactoryTest0.settable(table9);
        fitnesse.testsystems.slim.Table table11 = null;
        slimTableFactoryTest0.settable(table11);
        java.util.Map<java.lang.String, java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable>> strMap13 = slimTableFactoryTest0.map;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory14 = null;
        slimTableFactoryTest0.slimTableFactory = slimTableFactory14;
        fitnesse.testsystems.slim.Table table16 = null;
        slimTableFactoryTest0.settable(table16);
        fitnesse.testsystems.slim.Table table18 = null;
        slimTableFactoryTest0.settable(table18);
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory20 = slimTableFactoryTest0.getslimTableFactory();
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory21 = null;
        slimTableFactoryTest0.setslimTableFactory(slimTableFactory21);
        java.util.Map<java.lang.String, java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable>> strMap23 = slimTableFactoryTest0.map;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory24 = slimTableFactoryTest0.slimTableFactory;
        // The following exception was thrown during execution in test generation
        try {
            slimTableFactoryTest0.addTableTypeImport("", "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(table1);
        org.junit.Assert.assertNull(slimTableFactory2);
        org.junit.Assert.assertNull(strMap13);
        org.junit.Assert.assertNull(slimTableFactory20);
        org.junit.Assert.assertNull(strMap23);
        org.junit.Assert.assertNull(slimTableFactory24);
    }

    @Test
    public void test30014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest60.test30014");
        fitnesse.testsystems.slim.tables.SlimTableFactoryTest slimTableFactoryTest0 = new fitnesse.testsystems.slim.tables.SlimTableFactoryTest();
        java.util.Map<java.lang.String, java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable>> strMap1 = slimTableFactoryTest0.map;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory2 = slimTableFactoryTest0.slimTableFactory;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory3 = slimTableFactoryTest0.getslimTableFactory();
        fitnesse.testsystems.slim.Table table4 = slimTableFactoryTest0.gettable();
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory5 = null;
        slimTableFactoryTest0.slimTableFactory = slimTableFactory5;
        java.util.Map<java.lang.String, java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable>> strMap7 = slimTableFactoryTest0.map;
        java.util.Map<java.lang.String, java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable>> strMap8 = slimTableFactoryTest0.getmap();
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory9 = slimTableFactoryTest0.slimTableFactory;
        // The following exception was thrown during execution in test generation
        try {
            slimTableFactoryTest0.shouldCreateCorrectSlimTableForTablesType();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(strMap1);
        org.junit.Assert.assertNull(slimTableFactory2);
        org.junit.Assert.assertNull(slimTableFactory3);
        org.junit.Assert.assertNull(table4);
        org.junit.Assert.assertNull(strMap7);
        org.junit.Assert.assertNull(strMap8);
        org.junit.Assert.assertNull(slimTableFactory9);
    }

    @Test
    public void test30015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest60.test30015");
        fitnesse.testsystems.slim.tables.SlimTableFactoryTest slimTableFactoryTest0 = new fitnesse.testsystems.slim.tables.SlimTableFactoryTest();
        java.util.Map<java.lang.String, java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable>> strMap1 = slimTableFactoryTest0.map;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory2 = slimTableFactoryTest0.slimTableFactory;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory3 = null;
        slimTableFactoryTest0.setslimTableFactory(slimTableFactory3);
        fitnesse.testsystems.slim.Table table5 = slimTableFactoryTest0.table;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory6 = null;
        slimTableFactoryTest0.slimTableFactory = slimTableFactory6;
        fitnesse.testsystems.slim.Table table8 = slimTableFactoryTest0.gettable();
        fitnesse.testsystems.slim.Table table9 = null;
        slimTableFactoryTest0.table = table9;
        java.util.Map<java.lang.String, java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable>> strMap11 = slimTableFactoryTest0.getmap();
        java.util.Map<java.lang.String, java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable>> strMap12 = slimTableFactoryTest0.map;
        fitnesse.testsystems.slim.Table table13 = null;
        slimTableFactoryTest0.table = table13;
        fitnesse.testsystems.slim.Table table15 = null;
        slimTableFactoryTest0.table = table15;
        java.util.Map<java.lang.String, java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable>> strMap17 = slimTableFactoryTest0.map;
        java.util.Map<java.lang.String, java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable>> strMap18 = slimTableFactoryTest0.getmap();
        fitnesse.testsystems.slim.Table table19 = null;
        slimTableFactoryTest0.table = table19;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory21 = slimTableFactoryTest0.slimTableFactory;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory22 = null;
        slimTableFactoryTest0.setslimTableFactory(slimTableFactory22);
        org.junit.Assert.assertNull(strMap1);
        org.junit.Assert.assertNull(slimTableFactory2);
        org.junit.Assert.assertNull(table5);
        org.junit.Assert.assertNull(table8);
        org.junit.Assert.assertNull(strMap11);
        org.junit.Assert.assertNull(strMap12);
        org.junit.Assert.assertNull(strMap17);
        org.junit.Assert.assertNull(strMap18);
        org.junit.Assert.assertNull(slimTableFactory21);
    }

    @Test
    public void test30016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest60.test30016");
        fitnesse.testsystems.slim.tables.SlimTableFactoryTest slimTableFactoryTest0 = new fitnesse.testsystems.slim.tables.SlimTableFactoryTest();
        fitnesse.testsystems.slim.Table table1 = slimTableFactoryTest0.gettable();
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory2 = slimTableFactoryTest0.slimTableFactory;
        fitnesse.testsystems.slim.Table table3 = null;
        slimTableFactoryTest0.settable(table3);
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory5 = slimTableFactoryTest0.getslimTableFactory();
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory6 = slimTableFactoryTest0.getslimTableFactory();
        java.util.Map<java.lang.String, java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable>> strMap7 = slimTableFactoryTest0.getmap();
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory8 = null;
        slimTableFactoryTest0.slimTableFactory = slimTableFactory8;
        fitnesse.testsystems.slim.Table table10 = null;
        slimTableFactoryTest0.settable(table10);
        fitnesse.testsystems.slim.Table table12 = null;
        slimTableFactoryTest0.settable(table12);
        fitnesse.testsystems.slim.Table table14 = slimTableFactoryTest0.table;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory15 = slimTableFactoryTest0.slimTableFactory;
        fitnesse.testsystems.slim.Table table16 = null;
        slimTableFactoryTest0.table = table16;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory18 = slimTableFactoryTest0.slimTableFactory;
        // The following exception was thrown during execution in test generation
        try {
            slimTableFactoryTest0.addTableTypeImport("", "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(table1);
        org.junit.Assert.assertNull(slimTableFactory2);
        org.junit.Assert.assertNull(slimTableFactory5);
        org.junit.Assert.assertNull(slimTableFactory6);
        org.junit.Assert.assertNull(strMap7);
        org.junit.Assert.assertNull(table14);
        org.junit.Assert.assertNull(slimTableFactory15);
        org.junit.Assert.assertNull(slimTableFactory18);
    }

    @Test
    public void test30017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest60.test30017");
        fitnesse.testsystems.slim.tables.SlimTableFactoryTest slimTableFactoryTest0 = new fitnesse.testsystems.slim.tables.SlimTableFactoryTest();
        java.util.Map<java.lang.String, java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable>> strMap1 = slimTableFactoryTest0.map;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory2 = null;
        slimTableFactoryTest0.setslimTableFactory(slimTableFactory2);
        fitnesse.testsystems.slim.Table table4 = slimTableFactoryTest0.table;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory5 = null;
        slimTableFactoryTest0.setslimTableFactory(slimTableFactory5);
        fitnesse.testsystems.slim.Table table7 = null;
        slimTableFactoryTest0.settable(table7);
        fitnesse.testsystems.slim.Table table9 = slimTableFactoryTest0.gettable();
        java.util.Map<java.lang.String, java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable>> strMap10 = slimTableFactoryTest0.getmap();
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory11 = slimTableFactoryTest0.getslimTableFactory();
        fitnesse.testsystems.slim.Table table12 = null;
        slimTableFactoryTest0.table = table12;
        java.util.Map<java.lang.String, java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable>> strMap14 = slimTableFactoryTest0.map;
        fitnesse.testsystems.slim.Table table15 = null;
        slimTableFactoryTest0.table = table15;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory17 = null;
        slimTableFactoryTest0.setslimTableFactory(slimTableFactory17);
        fitnesse.testsystems.slim.Table table19 = slimTableFactoryTest0.table;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory20 = null;
        slimTableFactoryTest0.slimTableFactory = slimTableFactory20;
        java.util.Map<java.lang.String, java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable>> strMap22 = slimTableFactoryTest0.map;
        org.junit.Assert.assertNull(strMap1);
        org.junit.Assert.assertNull(table4);
        org.junit.Assert.assertNull(table9);
        org.junit.Assert.assertNull(strMap10);
        org.junit.Assert.assertNull(slimTableFactory11);
        org.junit.Assert.assertNull(strMap14);
        org.junit.Assert.assertNull(table19);
        org.junit.Assert.assertNull(strMap22);
    }

    @Test
    public void test30018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest60.test30018");
        fitnesse.testsystems.slim.tables.SlimTableFactoryTest slimTableFactoryTest0 = new fitnesse.testsystems.slim.tables.SlimTableFactoryTest();
        fitnesse.testsystems.slim.Table table1 = slimTableFactoryTest0.gettable();
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory2 = slimTableFactoryTest0.slimTableFactory;
        fitnesse.testsystems.slim.Table table3 = null;
        slimTableFactoryTest0.settable(table3);
        java.util.Map<java.lang.String, java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable>> strMap5 = slimTableFactoryTest0.map;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory6 = null;
        slimTableFactoryTest0.slimTableFactory = slimTableFactory6;
        fitnesse.testsystems.slim.Table table8 = slimTableFactoryTest0.gettable();
        java.util.Map<java.lang.String, java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable>> strMap9 = slimTableFactoryTest0.map;
        fitnesse.testsystems.slim.Table table10 = null;
        slimTableFactoryTest0.table = table10;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory12 = slimTableFactoryTest0.slimTableFactory;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory13 = slimTableFactoryTest0.getslimTableFactory();
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory14 = null;
        slimTableFactoryTest0.setslimTableFactory(slimTableFactory14);
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory16 = slimTableFactoryTest0.slimTableFactory;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory17 = null;
        slimTableFactoryTest0.setslimTableFactory(slimTableFactory17);
        org.junit.Assert.assertNull(table1);
        org.junit.Assert.assertNull(slimTableFactory2);
        org.junit.Assert.assertNull(strMap5);
        org.junit.Assert.assertNull(table8);
        org.junit.Assert.assertNull(strMap9);
        org.junit.Assert.assertNull(slimTableFactory12);
        org.junit.Assert.assertNull(slimTableFactory13);
        org.junit.Assert.assertNull(slimTableFactory16);
    }

    @Test
    public void test30019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest60.test30019");
        fitnesse.testsystems.slim.tables.SlimTableFactoryTest slimTableFactoryTest0 = new fitnesse.testsystems.slim.tables.SlimTableFactoryTest();
        fitnesse.testsystems.slim.Table table1 = slimTableFactoryTest0.gettable();
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory2 = slimTableFactoryTest0.slimTableFactory;
        fitnesse.testsystems.slim.Table table3 = null;
        slimTableFactoryTest0.settable(table3);
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory5 = slimTableFactoryTest0.getslimTableFactory();
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory6 = slimTableFactoryTest0.getslimTableFactory();
        java.util.Map<java.lang.String, java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable>> strMap7 = slimTableFactoryTest0.map;
        fitnesse.testsystems.slim.Table table8 = null;
        slimTableFactoryTest0.table = table8;
        fitnesse.testsystems.slim.Table table10 = null;
        slimTableFactoryTest0.table = table10;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory12 = null;
        slimTableFactoryTest0.slimTableFactory = slimTableFactory12;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory14 = null;
        slimTableFactoryTest0.setslimTableFactory(slimTableFactory14);
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory16 = slimTableFactoryTest0.getslimTableFactory();
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory17 = null;
        slimTableFactoryTest0.setslimTableFactory(slimTableFactory17);
        java.util.Map<java.lang.String, java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable>> strMap19 = slimTableFactoryTest0.map;
        java.util.Map<java.lang.String, java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable>> strMap20 = slimTableFactoryTest0.map;
        java.lang.Class<?> wildcardClass21 = slimTableFactoryTest0.getClass();
        org.junit.Assert.assertNull(table1);
        org.junit.Assert.assertNull(slimTableFactory2);
        org.junit.Assert.assertNull(slimTableFactory5);
        org.junit.Assert.assertNull(slimTableFactory6);
        org.junit.Assert.assertNull(strMap7);
        org.junit.Assert.assertNull(slimTableFactory16);
        org.junit.Assert.assertNull(strMap19);
        org.junit.Assert.assertNull(strMap20);
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test30020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest60.test30020");
        fitnesse.testsystems.slim.tables.SlimTableFactoryTest slimTableFactoryTest0 = new fitnesse.testsystems.slim.tables.SlimTableFactoryTest();
        java.util.Map<java.lang.String, java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable>> strMap1 = slimTableFactoryTest0.map;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory2 = null;
        slimTableFactoryTest0.setslimTableFactory(slimTableFactory2);
        fitnesse.testsystems.slim.Table table4 = slimTableFactoryTest0.table;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory5 = null;
        slimTableFactoryTest0.setslimTableFactory(slimTableFactory5);
        fitnesse.testsystems.slim.Table table7 = null;
        slimTableFactoryTest0.settable(table7);
        fitnesse.testsystems.slim.Table table9 = slimTableFactoryTest0.gettable();
        java.util.Map<java.lang.String, java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable>> strMap10 = slimTableFactoryTest0.getmap();
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory11 = slimTableFactoryTest0.getslimTableFactory();
        java.util.Map<java.lang.String, java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable>> strMap12 = slimTableFactoryTest0.getmap();
        java.util.Map<java.lang.String, java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable>> strMap13 = slimTableFactoryTest0.getmap();
        java.util.Map<java.lang.String, java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable>> strMap14 = slimTableFactoryTest0.map;
        fitnesse.testsystems.slim.Table table15 = null;
        slimTableFactoryTest0.settable(table15);
        fitnesse.testsystems.slim.Table table17 = slimTableFactoryTest0.table;
        org.junit.Assert.assertNull(strMap1);
        org.junit.Assert.assertNull(table4);
        org.junit.Assert.assertNull(table9);
        org.junit.Assert.assertNull(strMap10);
        org.junit.Assert.assertNull(slimTableFactory11);
        org.junit.Assert.assertNull(strMap12);
        org.junit.Assert.assertNull(strMap13);
        org.junit.Assert.assertNull(strMap14);
        org.junit.Assert.assertNull(table17);
    }

    @Test
    public void test30021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest60.test30021");
        fitnesse.testsystems.slim.tables.SlimTableFactoryTest slimTableFactoryTest0 = new fitnesse.testsystems.slim.tables.SlimTableFactoryTest();
        java.util.Map<java.lang.String, java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable>> strMap1 = slimTableFactoryTest0.map;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory2 = slimTableFactoryTest0.slimTableFactory;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory3 = null;
        slimTableFactoryTest0.setslimTableFactory(slimTableFactory3);
        fitnesse.testsystems.slim.Table table5 = slimTableFactoryTest0.table;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory6 = null;
        slimTableFactoryTest0.slimTableFactory = slimTableFactory6;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory8 = null;
        slimTableFactoryTest0.slimTableFactory = slimTableFactory8;
        fitnesse.testsystems.slim.Table table10 = slimTableFactoryTest0.gettable();
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory11 = slimTableFactoryTest0.getslimTableFactory();
        java.util.Map<java.lang.String, java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable>> strMap12 = slimTableFactoryTest0.getmap();
        java.util.Map<java.lang.String, java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable>> strMap13 = slimTableFactoryTest0.map;
        // The following exception was thrown during execution in test generation
        try {
            slimTableFactoryTest0.checkTableTypeDefinesIgnoredIfDifferentSpecified();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(strMap1);
        org.junit.Assert.assertNull(slimTableFactory2);
        org.junit.Assert.assertNull(table5);
        org.junit.Assert.assertNull(table10);
        org.junit.Assert.assertNull(slimTableFactory11);
        org.junit.Assert.assertNull(strMap12);
        org.junit.Assert.assertNull(strMap13);
    }

    @Test
    public void test30022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest60.test30022");
        fitnesse.testsystems.slim.tables.SlimTableFactoryTest slimTableFactoryTest0 = new fitnesse.testsystems.slim.tables.SlimTableFactoryTest();
        fitnesse.testsystems.slim.Table table1 = slimTableFactoryTest0.gettable();
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory2 = slimTableFactoryTest0.slimTableFactory;
        fitnesse.testsystems.slim.Table table3 = null;
        slimTableFactoryTest0.settable(table3);
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory5 = slimTableFactoryTest0.getslimTableFactory();
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory6 = null;
        slimTableFactoryTest0.slimTableFactory = slimTableFactory6;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory8 = null;
        slimTableFactoryTest0.slimTableFactory = slimTableFactory8;
        java.util.Map<java.lang.String, java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable>> strMap10 = slimTableFactoryTest0.map;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory11 = slimTableFactoryTest0.slimTableFactory;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory12 = slimTableFactoryTest0.slimTableFactory;
        org.junit.Assert.assertNull(table1);
        org.junit.Assert.assertNull(slimTableFactory2);
        org.junit.Assert.assertNull(slimTableFactory5);
        org.junit.Assert.assertNull(strMap10);
        org.junit.Assert.assertNull(slimTableFactory11);
        org.junit.Assert.assertNull(slimTableFactory12);
    }

    @Test
    public void test30023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest60.test30023");
        fitnesse.testsystems.slim.tables.SlimTableFactoryTest slimTableFactoryTest0 = new fitnesse.testsystems.slim.tables.SlimTableFactoryTest();
        java.util.Map<java.lang.String, java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable>> strMap1 = slimTableFactoryTest0.map;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory2 = null;
        slimTableFactoryTest0.setslimTableFactory(slimTableFactory2);
        fitnesse.testsystems.slim.Table table4 = null;
        slimTableFactoryTest0.table = table4;
        java.util.Map<java.lang.String, java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable>> strMap6 = slimTableFactoryTest0.map;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory7 = slimTableFactoryTest0.getslimTableFactory();
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory8 = slimTableFactoryTest0.getslimTableFactory();
        fitnesse.testsystems.slim.Table table9 = null;
        slimTableFactoryTest0.table = table9;
        fitnesse.testsystems.slim.Table table11 = null;
        slimTableFactoryTest0.settable(table11);
        fitnesse.testsystems.slim.Table table13 = null;
        slimTableFactoryTest0.settable(table13);
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory15 = null;
        slimTableFactoryTest0.setslimTableFactory(slimTableFactory15);
        fitnesse.testsystems.slim.Table table17 = null;
        slimTableFactoryTest0.table = table17;
        // The following exception was thrown during execution in test generation
        try {
            slimTableFactoryTest0.shouldCreateCorrectSlimTableForTablesType();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(strMap1);
        org.junit.Assert.assertNull(strMap6);
        org.junit.Assert.assertNull(slimTableFactory7);
        org.junit.Assert.assertNull(slimTableFactory8);
    }

    @Test
    public void test30024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest60.test30024");
        fitnesse.testsystems.slim.tables.SlimTableFactoryTest slimTableFactoryTest0 = new fitnesse.testsystems.slim.tables.SlimTableFactoryTest();
        fitnesse.testsystems.slim.Table table1 = slimTableFactoryTest0.gettable();
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory2 = slimTableFactoryTest0.slimTableFactory;
        fitnesse.testsystems.slim.Table table3 = null;
        slimTableFactoryTest0.settable(table3);
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory5 = null;
        slimTableFactoryTest0.setslimTableFactory(slimTableFactory5);
        fitnesse.testsystems.slim.Table table7 = null;
        slimTableFactoryTest0.settable(table7);
        fitnesse.testsystems.slim.Table table9 = null;
        slimTableFactoryTest0.settable(table9);
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory11 = slimTableFactoryTest0.slimTableFactory;
        fitnesse.testsystems.slim.Table table12 = slimTableFactoryTest0.table;
        fitnesse.testsystems.slim.Table table13 = null;
        slimTableFactoryTest0.settable(table13);
        fitnesse.testsystems.slim.Table table15 = null;
        slimTableFactoryTest0.settable(table15);
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory17 = null;
        slimTableFactoryTest0.slimTableFactory = slimTableFactory17;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory19 = null;
        slimTableFactoryTest0.slimTableFactory = slimTableFactory19;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory21 = null;
        slimTableFactoryTest0.slimTableFactory = slimTableFactory21;
        // The following exception was thrown during execution in test generation
        try {
            slimTableFactoryTest0.checkTableTypeDefineUsedForTable();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(table1);
        org.junit.Assert.assertNull(slimTableFactory2);
        org.junit.Assert.assertNull(slimTableFactory11);
        org.junit.Assert.assertNull(table12);
    }

    @Test
    public void test30025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest60.test30025");
        fitnesse.testsystems.slim.tables.SlimTableFactoryTest slimTableFactoryTest0 = new fitnesse.testsystems.slim.tables.SlimTableFactoryTest();
        java.util.Map<java.lang.String, java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable>> strMap1 = slimTableFactoryTest0.map;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory2 = null;
        slimTableFactoryTest0.setslimTableFactory(slimTableFactory2);
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory4 = null;
        slimTableFactoryTest0.setslimTableFactory(slimTableFactory4);
        java.util.Map<java.lang.String, java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable>> strMap6 = slimTableFactoryTest0.getmap();
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory7 = slimTableFactoryTest0.getslimTableFactory();
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory8 = null;
        slimTableFactoryTest0.setslimTableFactory(slimTableFactory8);
        java.util.Map<java.lang.String, java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable>> strMap10 = slimTableFactoryTest0.getmap();
        java.util.Map<java.lang.String, java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable>> strMap11 = slimTableFactoryTest0.map;
        fitnesse.testsystems.slim.Table table12 = slimTableFactoryTest0.gettable();
        org.junit.Assert.assertNull(strMap1);
        org.junit.Assert.assertNull(strMap6);
        org.junit.Assert.assertNull(slimTableFactory7);
        org.junit.Assert.assertNull(strMap10);
        org.junit.Assert.assertNull(strMap11);
        org.junit.Assert.assertNull(table12);
    }

    @Test
    public void test30026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest60.test30026");
        fitnesse.testsystems.slim.tables.SlimTableFactoryTest slimTableFactoryTest0 = new fitnesse.testsystems.slim.tables.SlimTableFactoryTest();
        fitnesse.testsystems.slim.Table table1 = slimTableFactoryTest0.gettable();
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory2 = slimTableFactoryTest0.slimTableFactory;
        fitnesse.testsystems.slim.Table table3 = null;
        slimTableFactoryTest0.settable(table3);
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory5 = slimTableFactoryTest0.getslimTableFactory();
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory6 = slimTableFactoryTest0.getslimTableFactory();
        fitnesse.testsystems.slim.Table table7 = slimTableFactoryTest0.table;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory8 = slimTableFactoryTest0.slimTableFactory;
        java.util.Map<java.lang.String, java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable>> strMap9 = slimTableFactoryTest0.map;
        java.util.Map<java.lang.String, java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable>> strMap10 = slimTableFactoryTest0.map;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory11 = null;
        slimTableFactoryTest0.slimTableFactory = slimTableFactory11;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory13 = slimTableFactoryTest0.getslimTableFactory();
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory14 = slimTableFactoryTest0.getslimTableFactory();
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory15 = null;
        slimTableFactoryTest0.slimTableFactory = slimTableFactory15;
        java.lang.Class<?> wildcardClass17 = slimTableFactoryTest0.getClass();
        org.junit.Assert.assertNull(table1);
        org.junit.Assert.assertNull(slimTableFactory2);
        org.junit.Assert.assertNull(slimTableFactory5);
        org.junit.Assert.assertNull(slimTableFactory6);
        org.junit.Assert.assertNull(table7);
        org.junit.Assert.assertNull(slimTableFactory8);
        org.junit.Assert.assertNull(strMap9);
        org.junit.Assert.assertNull(strMap10);
        org.junit.Assert.assertNull(slimTableFactory13);
        org.junit.Assert.assertNull(slimTableFactory14);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test30027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest60.test30027");
        fitnesse.testsystems.slim.tables.SlimTableFactoryTest slimTableFactoryTest0 = new fitnesse.testsystems.slim.tables.SlimTableFactoryTest();
        java.util.Map<java.lang.String, java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable>> strMap1 = slimTableFactoryTest0.map;
        fitnesse.testsystems.slim.Table table2 = null;
        slimTableFactoryTest0.settable(table2);
        fitnesse.testsystems.slim.Table table4 = slimTableFactoryTest0.gettable();
        fitnesse.testsystems.slim.Table table5 = null;
        slimTableFactoryTest0.table = table5;
        fitnesse.testsystems.slim.Table table7 = slimTableFactoryTest0.table;
        java.util.Map<java.lang.String, java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable>> strMap8 = slimTableFactoryTest0.getmap();
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory9 = null;
        slimTableFactoryTest0.setslimTableFactory(slimTableFactory9);
        java.util.Map<java.lang.String, java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable>> strMap11 = slimTableFactoryTest0.getmap();
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory12 = slimTableFactoryTest0.getslimTableFactory();
        org.junit.Assert.assertNull(strMap1);
        org.junit.Assert.assertNull(table4);
        org.junit.Assert.assertNull(table7);
        org.junit.Assert.assertNull(strMap8);
        org.junit.Assert.assertNull(strMap11);
        org.junit.Assert.assertNull(slimTableFactory12);
    }

    @Test
    public void test30028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest60.test30028");
        fitnesse.testsystems.slim.tables.SlimTableFactoryTest slimTableFactoryTest0 = new fitnesse.testsystems.slim.tables.SlimTableFactoryTest();
        java.util.Map<java.lang.String, java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable>> strMap1 = slimTableFactoryTest0.map;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory2 = null;
        slimTableFactoryTest0.setslimTableFactory(slimTableFactory2);
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory4 = null;
        slimTableFactoryTest0.setslimTableFactory(slimTableFactory4);
        java.util.Map<java.lang.String, java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable>> strMap6 = slimTableFactoryTest0.getmap();
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory7 = slimTableFactoryTest0.getslimTableFactory();
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory8 = null;
        slimTableFactoryTest0.slimTableFactory = slimTableFactory8;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory10 = slimTableFactoryTest0.slimTableFactory;
        fitnesse.testsystems.slim.Table table11 = slimTableFactoryTest0.gettable();
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory12 = null;
        slimTableFactoryTest0.setslimTableFactory(slimTableFactory12);
        fitnesse.testsystems.slim.Table table14 = null;
        slimTableFactoryTest0.table = table14;
        fitnesse.testsystems.slim.Table table16 = slimTableFactoryTest0.table;
        org.junit.Assert.assertNull(strMap1);
        org.junit.Assert.assertNull(strMap6);
        org.junit.Assert.assertNull(slimTableFactory7);
        org.junit.Assert.assertNull(slimTableFactory10);
        org.junit.Assert.assertNull(table11);
        org.junit.Assert.assertNull(table16);
    }

    @Test
    public void test30029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest60.test30029");
        fitnesse.testsystems.slim.tables.SlimTableFactoryTest slimTableFactoryTest0 = new fitnesse.testsystems.slim.tables.SlimTableFactoryTest();
        fitnesse.testsystems.slim.Table table1 = slimTableFactoryTest0.gettable();
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory2 = slimTableFactoryTest0.slimTableFactory;
        fitnesse.testsystems.slim.Table table3 = null;
        slimTableFactoryTest0.settable(table3);
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory5 = null;
        slimTableFactoryTest0.setslimTableFactory(slimTableFactory5);
        fitnesse.testsystems.slim.Table table7 = null;
        slimTableFactoryTest0.settable(table7);
        fitnesse.testsystems.slim.Table table9 = null;
        slimTableFactoryTest0.settable(table9);
        fitnesse.testsystems.slim.Table table11 = null;
        slimTableFactoryTest0.settable(table11);
        java.util.Map<java.lang.String, java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable>> strMap13 = slimTableFactoryTest0.map;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory14 = null;
        slimTableFactoryTest0.slimTableFactory = slimTableFactory14;
        fitnesse.testsystems.slim.Table table16 = null;
        slimTableFactoryTest0.settable(table16);
        fitnesse.testsystems.slim.Table table18 = null;
        slimTableFactoryTest0.settable(table18);
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory20 = slimTableFactoryTest0.getslimTableFactory();
        fitnesse.testsystems.slim.Table table21 = slimTableFactoryTest0.table;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory22 = slimTableFactoryTest0.slimTableFactory;
        fitnesse.testsystems.slim.Table table23 = slimTableFactoryTest0.table;
        fitnesse.testsystems.slim.Table table24 = slimTableFactoryTest0.table;
        // The following exception was thrown during execution in test generation
        try {
            slimTableFactoryTest0.commentTableShouldReturnNull();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(table1);
        org.junit.Assert.assertNull(slimTableFactory2);
        org.junit.Assert.assertNull(strMap13);
        org.junit.Assert.assertNull(slimTableFactory20);
        org.junit.Assert.assertNull(table21);
        org.junit.Assert.assertNull(slimTableFactory22);
        org.junit.Assert.assertNull(table23);
        org.junit.Assert.assertNull(table24);
    }

    @Test
    public void test30030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest60.test30030");
        fitnesse.testsystems.slim.tables.SlimTableFactoryTest slimTableFactoryTest0 = new fitnesse.testsystems.slim.tables.SlimTableFactoryTest();
        java.util.Map<java.lang.String, java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable>> strMap1 = slimTableFactoryTest0.map;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory2 = null;
        slimTableFactoryTest0.setslimTableFactory(slimTableFactory2);
        fitnesse.testsystems.slim.Table table4 = null;
        slimTableFactoryTest0.table = table4;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory6 = null;
        slimTableFactoryTest0.slimTableFactory = slimTableFactory6;
        fitnesse.testsystems.slim.Table table8 = null;
        slimTableFactoryTest0.table = table8;
        java.util.Map<java.lang.String, java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable>> strMap10 = slimTableFactoryTest0.map;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory11 = slimTableFactoryTest0.getslimTableFactory();
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory12 = slimTableFactoryTest0.getslimTableFactory();
        java.util.Map<java.lang.String, java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable>> strMap13 = slimTableFactoryTest0.getmap();
        fitnesse.testsystems.slim.Table table14 = null;
        slimTableFactoryTest0.settable(table14);
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory16 = slimTableFactoryTest0.getslimTableFactory();
        java.util.Map<java.lang.String, java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable>> strMap17 = slimTableFactoryTest0.getmap();
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory18 = null;
        slimTableFactoryTest0.slimTableFactory = slimTableFactory18;
        org.junit.Assert.assertNull(strMap1);
        org.junit.Assert.assertNull(strMap10);
        org.junit.Assert.assertNull(slimTableFactory11);
        org.junit.Assert.assertNull(slimTableFactory12);
        org.junit.Assert.assertNull(strMap13);
        org.junit.Assert.assertNull(slimTableFactory16);
        org.junit.Assert.assertNull(strMap17);
    }

    @Test
    public void test30031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest60.test30031");
        fitnesse.testsystems.slim.tables.SlimTableFactoryTest slimTableFactoryTest0 = new fitnesse.testsystems.slim.tables.SlimTableFactoryTest();
        java.util.Map<java.lang.String, java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable>> strMap1 = slimTableFactoryTest0.map;
        fitnesse.testsystems.slim.Table table2 = null;
        slimTableFactoryTest0.settable(table2);
        fitnesse.testsystems.slim.Table table4 = slimTableFactoryTest0.gettable();
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory5 = null;
        slimTableFactoryTest0.setslimTableFactory(slimTableFactory5);
        fitnesse.testsystems.slim.Table table7 = slimTableFactoryTest0.table;
        java.util.Map<java.lang.String, java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable>> strMap8 = slimTableFactoryTest0.map;
        fitnesse.testsystems.slim.Table table9 = slimTableFactoryTest0.gettable();
        fitnesse.testsystems.slim.Table table10 = null;
        slimTableFactoryTest0.settable(table10);
        fitnesse.testsystems.slim.Table table12 = null;
        slimTableFactoryTest0.table = table12;
        java.util.Map<java.lang.String, java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable>> strMap14 = slimTableFactoryTest0.getmap();
        java.util.Map<java.lang.String, java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable>> strMap15 = slimTableFactoryTest0.getmap();
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory16 = slimTableFactoryTest0.getslimTableFactory();
        fitnesse.testsystems.slim.Table table17 = null;
        slimTableFactoryTest0.settable(table17);
        fitnesse.testsystems.slim.Table table19 = null;
        slimTableFactoryTest0.table = table19;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory21 = null;
        slimTableFactoryTest0.setslimTableFactory(slimTableFactory21);
        fitnesse.testsystems.slim.Table table23 = null;
        slimTableFactoryTest0.settable(table23);
        fitnesse.testsystems.slim.Table table25 = null;
        slimTableFactoryTest0.settable(table25);
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory27 = slimTableFactoryTest0.getslimTableFactory();
        fitnesse.testsystems.slim.Table table28 = null;
        slimTableFactoryTest0.table = table28;
        // The following exception was thrown during execution in test generation
        try {
            slimTableFactoryTest0.commentTableShouldReturnNull();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(strMap1);
        org.junit.Assert.assertNull(table4);
        org.junit.Assert.assertNull(table7);
        org.junit.Assert.assertNull(strMap8);
        org.junit.Assert.assertNull(table9);
        org.junit.Assert.assertNull(strMap14);
        org.junit.Assert.assertNull(strMap15);
        org.junit.Assert.assertNull(slimTableFactory16);
        org.junit.Assert.assertNull(slimTableFactory27);
    }

    @Test
    public void test30032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest60.test30032");
        fitnesse.testsystems.slim.tables.SlimTableFactoryTest slimTableFactoryTest0 = new fitnesse.testsystems.slim.tables.SlimTableFactoryTest();
        java.util.Map<java.lang.String, java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable>> strMap1 = slimTableFactoryTest0.map;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory2 = null;
        slimTableFactoryTest0.setslimTableFactory(slimTableFactory2);
        fitnesse.testsystems.slim.Table table4 = null;
        slimTableFactoryTest0.table = table4;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory6 = null;
        slimTableFactoryTest0.slimTableFactory = slimTableFactory6;
        fitnesse.testsystems.slim.Table table8 = null;
        slimTableFactoryTest0.table = table8;
        java.util.Map<java.lang.String, java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable>> strMap10 = slimTableFactoryTest0.map;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory11 = slimTableFactoryTest0.getslimTableFactory();
        fitnesse.testsystems.slim.Table table12 = slimTableFactoryTest0.table;
        fitnesse.testsystems.slim.Table table13 = slimTableFactoryTest0.table;
        java.util.Map<java.lang.String, java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable>> strMap14 = slimTableFactoryTest0.getmap();
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory15 = null;
        slimTableFactoryTest0.setslimTableFactory(slimTableFactory15);
        java.util.Map<java.lang.String, java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable>> strMap17 = slimTableFactoryTest0.getmap();
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory18 = null;
        slimTableFactoryTest0.slimTableFactory = slimTableFactory18;
        fitnesse.testsystems.slim.Table table20 = null;
        slimTableFactoryTest0.table = table20;
        org.junit.Assert.assertNull(strMap1);
        org.junit.Assert.assertNull(strMap10);
        org.junit.Assert.assertNull(slimTableFactory11);
        org.junit.Assert.assertNull(table12);
        org.junit.Assert.assertNull(table13);
        org.junit.Assert.assertNull(strMap14);
        org.junit.Assert.assertNull(strMap17);
    }

    @Test
    public void test30033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest60.test30033");
        fitnesse.testsystems.slim.tables.SlimTableFactoryTest slimTableFactoryTest0 = new fitnesse.testsystems.slim.tables.SlimTableFactoryTest();
        fitnesse.testsystems.slim.Table table1 = slimTableFactoryTest0.gettable();
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory2 = null;
        slimTableFactoryTest0.slimTableFactory = slimTableFactory2;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory4 = slimTableFactoryTest0.getslimTableFactory();
        fitnesse.testsystems.slim.Table table5 = null;
        slimTableFactoryTest0.table = table5;
        fitnesse.testsystems.slim.Table table7 = null;
        slimTableFactoryTest0.settable(table7);
        fitnesse.testsystems.slim.Table table9 = slimTableFactoryTest0.table;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory10 = null;
        slimTableFactoryTest0.slimTableFactory = slimTableFactory10;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory12 = null;
        slimTableFactoryTest0.slimTableFactory = slimTableFactory12;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory14 = null;
        slimTableFactoryTest0.setslimTableFactory(slimTableFactory14);
        fitnesse.testsystems.slim.Table table16 = slimTableFactoryTest0.gettable();
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory17 = slimTableFactoryTest0.slimTableFactory;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory18 = slimTableFactoryTest0.slimTableFactory;
        fitnesse.testsystems.slim.Table table19 = null;
        slimTableFactoryTest0.table = table19;
        // The following exception was thrown during execution in test generation
        try {
            slimTableFactoryTest0.checkTableTypeDefinesIgnoredIfDifferentSpecified();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(table1);
        org.junit.Assert.assertNull(slimTableFactory4);
        org.junit.Assert.assertNull(table9);
        org.junit.Assert.assertNull(table16);
        org.junit.Assert.assertNull(slimTableFactory17);
        org.junit.Assert.assertNull(slimTableFactory18);
    }

    @Test
    public void test30034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest60.test30034");
        fitnesse.testsystems.slim.tables.SlimTableFactoryTest slimTableFactoryTest0 = new fitnesse.testsystems.slim.tables.SlimTableFactoryTest();
        fitnesse.testsystems.slim.Table table1 = slimTableFactoryTest0.gettable();
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory2 = slimTableFactoryTest0.slimTableFactory;
        fitnesse.testsystems.slim.Table table3 = null;
        slimTableFactoryTest0.settable(table3);
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory5 = null;
        slimTableFactoryTest0.setslimTableFactory(slimTableFactory5);
        fitnesse.testsystems.slim.Table table7 = null;
        slimTableFactoryTest0.settable(table7);
        fitnesse.testsystems.slim.Table table9 = null;
        slimTableFactoryTest0.settable(table9);
        java.util.Map<java.lang.String, java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable>> strMap11 = slimTableFactoryTest0.map;
        fitnesse.testsystems.slim.Table table12 = null;
        slimTableFactoryTest0.table = table12;
        java.util.Map<java.lang.String, java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable>> strMap14 = slimTableFactoryTest0.map;
        fitnesse.testsystems.slim.Table table15 = null;
        slimTableFactoryTest0.table = table15;
        fitnesse.testsystems.slim.Table table17 = null;
        slimTableFactoryTest0.table = table17;
        fitnesse.testsystems.slim.Table table19 = null;
        slimTableFactoryTest0.settable(table19);
        java.util.Map<java.lang.String, java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable>> strMap21 = slimTableFactoryTest0.getmap();
        fitnesse.testsystems.slim.Table table22 = null;
        slimTableFactoryTest0.settable(table22);
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory24 = slimTableFactoryTest0.slimTableFactory;
        fitnesse.testsystems.slim.Table table25 = null;
        slimTableFactoryTest0.table = table25;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory27 = slimTableFactoryTest0.getslimTableFactory();
        org.junit.Assert.assertNull(table1);
        org.junit.Assert.assertNull(slimTableFactory2);
        org.junit.Assert.assertNull(strMap11);
        org.junit.Assert.assertNull(strMap14);
        org.junit.Assert.assertNull(strMap21);
        org.junit.Assert.assertNull(slimTableFactory24);
        org.junit.Assert.assertNull(slimTableFactory27);
    }

    @Test
    public void test30035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest60.test30035");
        fitnesse.testsystems.slim.tables.SlimTableFactoryTest slimTableFactoryTest0 = new fitnesse.testsystems.slim.tables.SlimTableFactoryTest();
        java.util.Map<java.lang.String, java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable>> strMap1 = slimTableFactoryTest0.map;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory2 = slimTableFactoryTest0.slimTableFactory;
        java.util.Map<java.lang.String, java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable>> strMap3 = slimTableFactoryTest0.getmap();
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory4 = slimTableFactoryTest0.slimTableFactory;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory5 = slimTableFactoryTest0.getslimTableFactory();
        java.util.Map<java.lang.String, java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable>> strMap6 = slimTableFactoryTest0.getmap();
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory7 = null;
        slimTableFactoryTest0.setslimTableFactory(slimTableFactory7);
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory9 = slimTableFactoryTest0.slimTableFactory;
        java.util.Map<java.lang.String, java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable>> strMap10 = slimTableFactoryTest0.map;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory11 = null;
        slimTableFactoryTest0.setslimTableFactory(slimTableFactory11);
        org.junit.Assert.assertNull(strMap1);
        org.junit.Assert.assertNull(slimTableFactory2);
        org.junit.Assert.assertNull(strMap3);
        org.junit.Assert.assertNull(slimTableFactory4);
        org.junit.Assert.assertNull(slimTableFactory5);
        org.junit.Assert.assertNull(strMap6);
        org.junit.Assert.assertNull(slimTableFactory9);
        org.junit.Assert.assertNull(strMap10);
    }

    @Test
    public void test30036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest60.test30036");
        fitnesse.testsystems.slim.tables.SlimTableFactoryTest slimTableFactoryTest0 = new fitnesse.testsystems.slim.tables.SlimTableFactoryTest();
        fitnesse.testsystems.slim.Table table1 = slimTableFactoryTest0.gettable();
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory2 = null;
        slimTableFactoryTest0.slimTableFactory = slimTableFactory2;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory4 = slimTableFactoryTest0.getslimTableFactory();
        fitnesse.testsystems.slim.Table table5 = null;
        slimTableFactoryTest0.table = table5;
        fitnesse.testsystems.slim.Table table7 = null;
        slimTableFactoryTest0.settable(table7);
        fitnesse.testsystems.slim.Table table9 = slimTableFactoryTest0.table;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory10 = null;
        slimTableFactoryTest0.setslimTableFactory(slimTableFactory10);
        java.util.Map<java.lang.String, java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable>> strMap12 = slimTableFactoryTest0.getmap();
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory13 = null;
        slimTableFactoryTest0.slimTableFactory = slimTableFactory13;
        java.util.Map<java.lang.String, java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable>> strMap15 = slimTableFactoryTest0.getmap();
        org.junit.Assert.assertNull(table1);
        org.junit.Assert.assertNull(slimTableFactory4);
        org.junit.Assert.assertNull(table9);
        org.junit.Assert.assertNull(strMap12);
        org.junit.Assert.assertNull(strMap15);
    }

    @Test
    public void test30037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest60.test30037");
        fitnesse.testsystems.slim.tables.SlimTableFactoryTest slimTableFactoryTest0 = new fitnesse.testsystems.slim.tables.SlimTableFactoryTest();
        fitnesse.testsystems.slim.Table table1 = slimTableFactoryTest0.gettable();
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory2 = slimTableFactoryTest0.slimTableFactory;
        fitnesse.testsystems.slim.Table table3 = null;
        slimTableFactoryTest0.settable(table3);
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory5 = slimTableFactoryTest0.getslimTableFactory();
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory6 = slimTableFactoryTest0.getslimTableFactory();
        fitnesse.testsystems.slim.Table table7 = slimTableFactoryTest0.table;
        java.util.Map<java.lang.String, java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable>> strMap8 = slimTableFactoryTest0.getmap();
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory9 = slimTableFactoryTest0.getslimTableFactory();
        fitnesse.testsystems.slim.Table table10 = null;
        slimTableFactoryTest0.table = table10;
        fitnesse.testsystems.slim.Table table12 = slimTableFactoryTest0.table;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory13 = slimTableFactoryTest0.slimTableFactory;
        java.util.Map<java.lang.String, java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable>> strMap14 = slimTableFactoryTest0.getmap();
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory15 = null;
        slimTableFactoryTest0.setslimTableFactory(slimTableFactory15);
        org.junit.Assert.assertNull(table1);
        org.junit.Assert.assertNull(slimTableFactory2);
        org.junit.Assert.assertNull(slimTableFactory5);
        org.junit.Assert.assertNull(slimTableFactory6);
        org.junit.Assert.assertNull(table7);
        org.junit.Assert.assertNull(strMap8);
        org.junit.Assert.assertNull(slimTableFactory9);
        org.junit.Assert.assertNull(table12);
        org.junit.Assert.assertNull(slimTableFactory13);
        org.junit.Assert.assertNull(strMap14);
    }

    @Test
    public void test30038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest60.test30038");
        fitnesse.testsystems.slim.tables.SlimTableFactoryTest slimTableFactoryTest0 = new fitnesse.testsystems.slim.tables.SlimTableFactoryTest();
        java.util.Map<java.lang.String, java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable>> strMap1 = slimTableFactoryTest0.map;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory2 = null;
        slimTableFactoryTest0.setslimTableFactory(slimTableFactory2);
        fitnesse.testsystems.slim.Table table4 = slimTableFactoryTest0.table;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory5 = null;
        slimTableFactoryTest0.setslimTableFactory(slimTableFactory5);
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory7 = slimTableFactoryTest0.slimTableFactory;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory8 = slimTableFactoryTest0.getslimTableFactory();
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory9 = null;
        slimTableFactoryTest0.slimTableFactory = slimTableFactory9;
        fitnesse.testsystems.slim.Table table11 = slimTableFactoryTest0.gettable();
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory12 = null;
        slimTableFactoryTest0.setslimTableFactory(slimTableFactory12);
        fitnesse.testsystems.slim.Table table14 = slimTableFactoryTest0.table;
        org.junit.Assert.assertNull(strMap1);
        org.junit.Assert.assertNull(table4);
        org.junit.Assert.assertNull(slimTableFactory7);
        org.junit.Assert.assertNull(slimTableFactory8);
        org.junit.Assert.assertNull(table11);
        org.junit.Assert.assertNull(table14);
    }

    @Test
    public void test30039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest60.test30039");
        fitnesse.testsystems.slim.tables.SlimTableFactoryTest slimTableFactoryTest0 = new fitnesse.testsystems.slim.tables.SlimTableFactoryTest();
        java.util.Map<java.lang.String, java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable>> strMap1 = slimTableFactoryTest0.map;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory2 = null;
        slimTableFactoryTest0.setslimTableFactory(slimTableFactory2);
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory4 = null;
        slimTableFactoryTest0.setslimTableFactory(slimTableFactory4);
        java.util.Map<java.lang.String, java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable>> strMap6 = slimTableFactoryTest0.getmap();
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory7 = slimTableFactoryTest0.getslimTableFactory();
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory8 = null;
        slimTableFactoryTest0.setslimTableFactory(slimTableFactory8);
        fitnesse.testsystems.slim.Table table10 = null;
        slimTableFactoryTest0.table = table10;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory12 = slimTableFactoryTest0.slimTableFactory;
        fitnesse.testsystems.slim.Table table13 = slimTableFactoryTest0.table;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory14 = null;
        slimTableFactoryTest0.setslimTableFactory(slimTableFactory14);
        org.junit.Assert.assertNull(strMap1);
        org.junit.Assert.assertNull(strMap6);
        org.junit.Assert.assertNull(slimTableFactory7);
        org.junit.Assert.assertNull(slimTableFactory12);
        org.junit.Assert.assertNull(table13);
    }

    @Test
    public void test30040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest60.test30040");
        fitnesse.testsystems.slim.tables.SlimTableFactoryTest slimTableFactoryTest0 = new fitnesse.testsystems.slim.tables.SlimTableFactoryTest();
        java.util.Map<java.lang.String, java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable>> strMap1 = slimTableFactoryTest0.map;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory2 = slimTableFactoryTest0.slimTableFactory;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory3 = slimTableFactoryTest0.getslimTableFactory();
        fitnesse.testsystems.slim.Table table4 = slimTableFactoryTest0.gettable();
        fitnesse.testsystems.slim.Table table5 = null;
        slimTableFactoryTest0.settable(table5);
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory7 = null;
        slimTableFactoryTest0.setslimTableFactory(slimTableFactory7);
        fitnesse.testsystems.slim.Table table9 = slimTableFactoryTest0.table;
        fitnesse.testsystems.slim.Table table10 = null;
        slimTableFactoryTest0.table = table10;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory12 = null;
        slimTableFactoryTest0.slimTableFactory = slimTableFactory12;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory14 = null;
        slimTableFactoryTest0.setslimTableFactory(slimTableFactory14);
        org.junit.Assert.assertNull(strMap1);
        org.junit.Assert.assertNull(slimTableFactory2);
        org.junit.Assert.assertNull(slimTableFactory3);
        org.junit.Assert.assertNull(table4);
        org.junit.Assert.assertNull(table9);
    }

    @Test
    public void test30041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest60.test30041");
        fitnesse.testsystems.slim.tables.SlimTableFactoryTest slimTableFactoryTest0 = new fitnesse.testsystems.slim.tables.SlimTableFactoryTest();
        fitnesse.testsystems.slim.Table table1 = slimTableFactoryTest0.gettable();
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory2 = slimTableFactoryTest0.slimTableFactory;
        fitnesse.testsystems.slim.Table table3 = null;
        slimTableFactoryTest0.settable(table3);
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory5 = null;
        slimTableFactoryTest0.setslimTableFactory(slimTableFactory5);
        fitnesse.testsystems.slim.Table table7 = null;
        slimTableFactoryTest0.settable(table7);
        fitnesse.testsystems.slim.Table table9 = null;
        slimTableFactoryTest0.settable(table9);
        fitnesse.testsystems.slim.Table table11 = null;
        slimTableFactoryTest0.settable(table11);
        java.util.Map<java.lang.String, java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable>> strMap13 = slimTableFactoryTest0.map;
        fitnesse.testsystems.slim.Table table14 = slimTableFactoryTest0.table;
        fitnesse.testsystems.slim.Table table15 = null;
        slimTableFactoryTest0.table = table15;
        java.util.Map<java.lang.String, java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable>> strMap17 = slimTableFactoryTest0.map;
        fitnesse.testsystems.slim.Table table18 = null;
        slimTableFactoryTest0.settable(table18);
        java.util.Map<java.lang.String, java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable>> strMap20 = slimTableFactoryTest0.map;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory21 = null;
        slimTableFactoryTest0.setslimTableFactory(slimTableFactory21);
        java.util.Map<java.lang.String, java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable>> strMap23 = slimTableFactoryTest0.getmap();
        // The following exception was thrown during execution in test generation
        try {
            slimTableFactoryTest0.addTableTypeImport("", "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(table1);
        org.junit.Assert.assertNull(slimTableFactory2);
        org.junit.Assert.assertNull(strMap13);
        org.junit.Assert.assertNull(table14);
        org.junit.Assert.assertNull(strMap17);
        org.junit.Assert.assertNull(strMap20);
        org.junit.Assert.assertNull(strMap23);
    }

    @Test
    public void test30042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest60.test30042");
        fitnesse.testsystems.slim.tables.SlimTableFactoryTest slimTableFactoryTest0 = new fitnesse.testsystems.slim.tables.SlimTableFactoryTest();
        fitnesse.testsystems.slim.Table table1 = slimTableFactoryTest0.gettable();
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory2 = slimTableFactoryTest0.slimTableFactory;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory3 = slimTableFactoryTest0.slimTableFactory;
        java.util.Map<java.lang.String, java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable>> strMap4 = slimTableFactoryTest0.getmap();
        java.util.Map<java.lang.String, java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable>> strMap5 = slimTableFactoryTest0.map;
        fitnesse.testsystems.slim.Table table6 = slimTableFactoryTest0.table;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory7 = null;
        slimTableFactoryTest0.slimTableFactory = slimTableFactory7;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory9 = null;
        slimTableFactoryTest0.slimTableFactory = slimTableFactory9;
        fitnesse.testsystems.slim.Table table11 = slimTableFactoryTest0.table;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory12 = slimTableFactoryTest0.getslimTableFactory();
        java.util.Map<java.lang.String, java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable>> strMap13 = slimTableFactoryTest0.map;
        java.util.Map<java.lang.String, java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable>> strMap14 = slimTableFactoryTest0.map;
        org.junit.Assert.assertNull(table1);
        org.junit.Assert.assertNull(slimTableFactory2);
        org.junit.Assert.assertNull(slimTableFactory3);
        org.junit.Assert.assertNull(strMap4);
        org.junit.Assert.assertNull(strMap5);
        org.junit.Assert.assertNull(table6);
        org.junit.Assert.assertNull(table11);
        org.junit.Assert.assertNull(slimTableFactory12);
        org.junit.Assert.assertNull(strMap13);
        org.junit.Assert.assertNull(strMap14);
    }

    @Test
    public void test30043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest60.test30043");
        fitnesse.testsystems.slim.tables.SlimTableFactoryTest slimTableFactoryTest0 = new fitnesse.testsystems.slim.tables.SlimTableFactoryTest();
        java.util.Map<java.lang.String, java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable>> strMap1 = slimTableFactoryTest0.map;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory2 = null;
        slimTableFactoryTest0.setslimTableFactory(slimTableFactory2);
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory4 = null;
        slimTableFactoryTest0.setslimTableFactory(slimTableFactory4);
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory6 = slimTableFactoryTest0.getslimTableFactory();
        java.util.Map<java.lang.String, java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable>> strMap7 = slimTableFactoryTest0.map;
        java.util.Map<java.lang.String, java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable>> strMap8 = slimTableFactoryTest0.getmap();
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory9 = null;
        slimTableFactoryTest0.setslimTableFactory(slimTableFactory9);
        // The following exception was thrown during execution in test generation
        try {
            slimTableFactoryTest0.checkTableTypeDefinesIgnoredIfDifferentSpecified();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(strMap1);
        org.junit.Assert.assertNull(slimTableFactory6);
        org.junit.Assert.assertNull(strMap7);
        org.junit.Assert.assertNull(strMap8);
    }

    @Test
    public void test30044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest60.test30044");
        fitnesse.testsystems.slim.tables.SlimTableFactoryTest slimTableFactoryTest0 = new fitnesse.testsystems.slim.tables.SlimTableFactoryTest();
        java.util.Map<java.lang.String, java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable>> strMap1 = slimTableFactoryTest0.map;
        fitnesse.testsystems.slim.Table table2 = null;
        slimTableFactoryTest0.settable(table2);
        fitnesse.testsystems.slim.Table table4 = slimTableFactoryTest0.gettable();
        fitnesse.testsystems.slim.Table table5 = null;
        slimTableFactoryTest0.table = table5;
        java.util.Map<java.lang.String, java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable>> strMap7 = slimTableFactoryTest0.map;
        java.util.Map<java.lang.String, java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable>> strMap8 = slimTableFactoryTest0.getmap();
        java.util.Map<java.lang.String, java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable>> strMap9 = slimTableFactoryTest0.getmap();
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory10 = null;
        slimTableFactoryTest0.slimTableFactory = slimTableFactory10;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory12 = slimTableFactoryTest0.getslimTableFactory();
        fitnesse.testsystems.slim.Table table13 = slimTableFactoryTest0.gettable();
        org.junit.Assert.assertNull(strMap1);
        org.junit.Assert.assertNull(table4);
        org.junit.Assert.assertNull(strMap7);
        org.junit.Assert.assertNull(strMap8);
        org.junit.Assert.assertNull(strMap9);
        org.junit.Assert.assertNull(slimTableFactory12);
        org.junit.Assert.assertNull(table13);
    }

    @Test
    public void test30045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest60.test30045");
        fitnesse.testsystems.slim.tables.SlimTableFactoryTest slimTableFactoryTest0 = new fitnesse.testsystems.slim.tables.SlimTableFactoryTest();
        java.util.Map<java.lang.String, java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable>> strMap1 = slimTableFactoryTest0.map;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory2 = null;
        slimTableFactoryTest0.setslimTableFactory(slimTableFactory2);
        fitnesse.testsystems.slim.Table table4 = null;
        slimTableFactoryTest0.table = table4;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory6 = null;
        slimTableFactoryTest0.slimTableFactory = slimTableFactory6;
        fitnesse.testsystems.slim.Table table8 = null;
        slimTableFactoryTest0.table = table8;
        java.util.Map<java.lang.String, java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable>> strMap10 = slimTableFactoryTest0.map;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory11 = null;
        slimTableFactoryTest0.setslimTableFactory(slimTableFactory11);
        java.util.Map<java.lang.String, java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable>> strMap13 = slimTableFactoryTest0.map;
        fitnesse.testsystems.slim.Table table14 = null;
        slimTableFactoryTest0.settable(table14);
        fitnesse.testsystems.slim.Table table16 = null;
        slimTableFactoryTest0.table = table16;
        fitnesse.testsystems.slim.Table table18 = null;
        slimTableFactoryTest0.table = table18;
        fitnesse.testsystems.slim.Table table20 = null;
        slimTableFactoryTest0.table = table20;
        org.junit.Assert.assertNull(strMap1);
        org.junit.Assert.assertNull(strMap10);
        org.junit.Assert.assertNull(strMap13);
    }

    @Test
    public void test30046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest60.test30046");
        fitnesse.testsystems.slim.tables.SlimTableFactoryTest slimTableFactoryTest0 = new fitnesse.testsystems.slim.tables.SlimTableFactoryTest();
        fitnesse.testsystems.slim.Table table1 = slimTableFactoryTest0.gettable();
        java.util.Map<java.lang.String, java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable>> strMap2 = slimTableFactoryTest0.map;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory3 = null;
        slimTableFactoryTest0.slimTableFactory = slimTableFactory3;
        fitnesse.testsystems.slim.Table table5 = slimTableFactoryTest0.gettable();
        java.util.Map<java.lang.String, java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable>> strMap6 = slimTableFactoryTest0.getmap();
        // The following exception was thrown during execution in test generation
        try {
            slimTableFactoryTest0.tableTypeStartingWithcommentColonShouldReturnNull();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(table1);
        org.junit.Assert.assertNull(strMap2);
        org.junit.Assert.assertNull(table5);
        org.junit.Assert.assertNull(strMap6);
    }

    @Test
    public void test30047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest60.test30047");
        fitnesse.testsystems.slim.tables.SlimTableFactoryTest slimTableFactoryTest0 = new fitnesse.testsystems.slim.tables.SlimTableFactoryTest();
        java.util.Map<java.lang.String, java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable>> strMap1 = slimTableFactoryTest0.map;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory2 = slimTableFactoryTest0.slimTableFactory;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory3 = null;
        slimTableFactoryTest0.setslimTableFactory(slimTableFactory3);
        fitnesse.testsystems.slim.Table table5 = slimTableFactoryTest0.table;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory6 = null;
        slimTableFactoryTest0.slimTableFactory = slimTableFactory6;
        java.util.Map<java.lang.String, java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable>> strMap8 = slimTableFactoryTest0.getmap();
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory9 = null;
        slimTableFactoryTest0.slimTableFactory = slimTableFactory9;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory11 = null;
        slimTableFactoryTest0.setslimTableFactory(slimTableFactory11);
        fitnesse.testsystems.slim.Table table13 = slimTableFactoryTest0.table;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory14 = null;
        slimTableFactoryTest0.setslimTableFactory(slimTableFactory14);
        // The following exception was thrown during execution in test generation
        try {
            slimTableFactoryTest0.checkTableTypeDefineUsedForTable();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(strMap1);
        org.junit.Assert.assertNull(slimTableFactory2);
        org.junit.Assert.assertNull(table5);
        org.junit.Assert.assertNull(strMap8);
        org.junit.Assert.assertNull(table13);
    }

    @Test
    public void test30048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest60.test30048");
        fitnesse.testsystems.slim.tables.SlimTableFactoryTest slimTableFactoryTest0 = new fitnesse.testsystems.slim.tables.SlimTableFactoryTest();
        java.util.Map<java.lang.String, java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable>> strMap1 = slimTableFactoryTest0.map;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory2 = null;
        slimTableFactoryTest0.setslimTableFactory(slimTableFactory2);
        fitnesse.testsystems.slim.Table table4 = slimTableFactoryTest0.table;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory5 = slimTableFactoryTest0.slimTableFactory;
        fitnesse.testsystems.slim.Table table6 = null;
        slimTableFactoryTest0.table = table6;
        fitnesse.testsystems.slim.Table table8 = slimTableFactoryTest0.table;
        fitnesse.testsystems.slim.Table table9 = slimTableFactoryTest0.table;
        java.util.Map<java.lang.String, java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable>> strMap10 = slimTableFactoryTest0.getmap();
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory11 = slimTableFactoryTest0.slimTableFactory;
        fitnesse.testsystems.slim.Table table12 = slimTableFactoryTest0.gettable();
        fitnesse.testsystems.slim.Table table13 = slimTableFactoryTest0.table;
        java.lang.Class<?> wildcardClass14 = slimTableFactoryTest0.getClass();
        org.junit.Assert.assertNull(strMap1);
        org.junit.Assert.assertNull(table4);
        org.junit.Assert.assertNull(slimTableFactory5);
        org.junit.Assert.assertNull(table8);
        org.junit.Assert.assertNull(table9);
        org.junit.Assert.assertNull(strMap10);
        org.junit.Assert.assertNull(slimTableFactory11);
        org.junit.Assert.assertNull(table12);
        org.junit.Assert.assertNull(table13);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test30049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest60.test30049");
        fitnesse.testsystems.slim.tables.SlimTableFactoryTest slimTableFactoryTest0 = new fitnesse.testsystems.slim.tables.SlimTableFactoryTest();
        java.util.Map<java.lang.String, java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable>> strMap1 = slimTableFactoryTest0.map;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory2 = slimTableFactoryTest0.slimTableFactory;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory3 = null;
        slimTableFactoryTest0.setslimTableFactory(slimTableFactory3);
        fitnesse.testsystems.slim.Table table5 = null;
        slimTableFactoryTest0.settable(table5);
        fitnesse.testsystems.slim.Table table7 = slimTableFactoryTest0.gettable();
        java.util.Map<java.lang.String, java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable>> strMap8 = slimTableFactoryTest0.map;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory9 = slimTableFactoryTest0.slimTableFactory;
        fitnesse.testsystems.slim.Table table10 = slimTableFactoryTest0.table;
        fitnesse.testsystems.slim.Table table11 = null;
        slimTableFactoryTest0.table = table11;
        fitnesse.testsystems.slim.Table table13 = null;
        slimTableFactoryTest0.settable(table13);
        fitnesse.testsystems.slim.Table table15 = slimTableFactoryTest0.table;
        org.junit.Assert.assertNull(strMap1);
        org.junit.Assert.assertNull(slimTableFactory2);
        org.junit.Assert.assertNull(table7);
        org.junit.Assert.assertNull(strMap8);
        org.junit.Assert.assertNull(slimTableFactory9);
        org.junit.Assert.assertNull(table10);
        org.junit.Assert.assertNull(table15);
    }

    @Test
    public void test30050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest60.test30050");
        fitnesse.testsystems.slim.tables.SlimTableFactoryTest slimTableFactoryTest0 = new fitnesse.testsystems.slim.tables.SlimTableFactoryTest();
        java.util.Map<java.lang.String, java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable>> strMap1 = slimTableFactoryTest0.map;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory2 = slimTableFactoryTest0.slimTableFactory;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory3 = null;
        slimTableFactoryTest0.setslimTableFactory(slimTableFactory3);
        fitnesse.testsystems.slim.Table table5 = slimTableFactoryTest0.table;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory6 = null;
        slimTableFactoryTest0.slimTableFactory = slimTableFactory6;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory8 = null;
        slimTableFactoryTest0.slimTableFactory = slimTableFactory8;
        fitnesse.testsystems.slim.Table table10 = null;
        slimTableFactoryTest0.table = table10;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory12 = null;
        slimTableFactoryTest0.setslimTableFactory(slimTableFactory12);
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory14 = null;
        slimTableFactoryTest0.setslimTableFactory(slimTableFactory14);
        java.util.Map<java.lang.String, java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable>> strMap16 = slimTableFactoryTest0.getmap();
        org.junit.Assert.assertNull(strMap1);
        org.junit.Assert.assertNull(slimTableFactory2);
        org.junit.Assert.assertNull(table5);
        org.junit.Assert.assertNull(strMap16);
    }

    @Test
    public void test30051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest60.test30051");
        fitnesse.testsystems.slim.tables.SlimTableFactoryTest slimTableFactoryTest0 = new fitnesse.testsystems.slim.tables.SlimTableFactoryTest();
        fitnesse.testsystems.slim.Table table1 = slimTableFactoryTest0.gettable();
        fitnesse.testsystems.slim.Table table2 = slimTableFactoryTest0.table;
        fitnesse.testsystems.slim.Table table3 = null;
        slimTableFactoryTest0.table = table3;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory5 = slimTableFactoryTest0.getslimTableFactory();
        java.util.Map<java.lang.String, java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable>> strMap6 = slimTableFactoryTest0.getmap();
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory7 = slimTableFactoryTest0.getslimTableFactory();
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory8 = slimTableFactoryTest0.getslimTableFactory();
        fitnesse.testsystems.slim.Table table9 = null;
        slimTableFactoryTest0.table = table9;
        fitnesse.testsystems.slim.Table table11 = null;
        slimTableFactoryTest0.settable(table11);
        org.junit.Assert.assertNull(table1);
        org.junit.Assert.assertNull(table2);
        org.junit.Assert.assertNull(slimTableFactory5);
        org.junit.Assert.assertNull(strMap6);
        org.junit.Assert.assertNull(slimTableFactory7);
        org.junit.Assert.assertNull(slimTableFactory8);
    }

    @Test
    public void test30052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest60.test30052");
        fitnesse.testsystems.slim.tables.SlimTableFactoryTest slimTableFactoryTest0 = new fitnesse.testsystems.slim.tables.SlimTableFactoryTest();
        java.util.Map<java.lang.String, java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable>> strMap1 = slimTableFactoryTest0.map;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory2 = null;
        slimTableFactoryTest0.setslimTableFactory(slimTableFactory2);
        fitnesse.testsystems.slim.Table table4 = null;
        slimTableFactoryTest0.table = table4;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory6 = null;
        slimTableFactoryTest0.slimTableFactory = slimTableFactory6;
        fitnesse.testsystems.slim.Table table8 = null;
        slimTableFactoryTest0.table = table8;
        java.util.Map<java.lang.String, java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable>> strMap10 = slimTableFactoryTest0.map;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory11 = slimTableFactoryTest0.getslimTableFactory();
        fitnesse.testsystems.slim.Table table12 = slimTableFactoryTest0.table;
        fitnesse.testsystems.slim.Table table13 = slimTableFactoryTest0.table;
        java.util.Map<java.lang.String, java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable>> strMap14 = slimTableFactoryTest0.getmap();
        fitnesse.testsystems.slim.Table table15 = slimTableFactoryTest0.table;
        java.util.Map<java.lang.String, java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable>> strMap16 = slimTableFactoryTest0.getmap();
        org.junit.Assert.assertNull(strMap1);
        org.junit.Assert.assertNull(strMap10);
        org.junit.Assert.assertNull(slimTableFactory11);
        org.junit.Assert.assertNull(table12);
        org.junit.Assert.assertNull(table13);
        org.junit.Assert.assertNull(strMap14);
        org.junit.Assert.assertNull(table15);
        org.junit.Assert.assertNull(strMap16);
    }

    @Test
    public void test30053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest60.test30053");
        fitnesse.testsystems.slim.tables.SlimTableFactoryTest slimTableFactoryTest0 = new fitnesse.testsystems.slim.tables.SlimTableFactoryTest();
        java.util.Map<java.lang.String, java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable>> strMap1 = slimTableFactoryTest0.map;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory2 = slimTableFactoryTest0.slimTableFactory;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory3 = slimTableFactoryTest0.slimTableFactory;
        fitnesse.testsystems.slim.Table table4 = null;
        slimTableFactoryTest0.table = table4;
        fitnesse.testsystems.slim.Table table6 = slimTableFactoryTest0.gettable();
        fitnesse.testsystems.slim.Table table7 = slimTableFactoryTest0.table;
        java.util.Map<java.lang.String, java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable>> strMap8 = slimTableFactoryTest0.map;
        fitnesse.testsystems.slim.Table table9 = null;
        slimTableFactoryTest0.table = table9;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory11 = slimTableFactoryTest0.slimTableFactory;
        fitnesse.testsystems.slim.Table table12 = slimTableFactoryTest0.gettable();
        org.junit.Assert.assertNull(strMap1);
        org.junit.Assert.assertNull(slimTableFactory2);
        org.junit.Assert.assertNull(slimTableFactory3);
        org.junit.Assert.assertNull(table6);
        org.junit.Assert.assertNull(table7);
        org.junit.Assert.assertNull(strMap8);
        org.junit.Assert.assertNull(slimTableFactory11);
        org.junit.Assert.assertNull(table12);
    }

    @Test
    public void test30054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest60.test30054");
        fitnesse.testsystems.slim.tables.SlimTableFactoryTest slimTableFactoryTest0 = new fitnesse.testsystems.slim.tables.SlimTableFactoryTest();
        java.util.Map<java.lang.String, java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable>> strMap1 = slimTableFactoryTest0.map;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory2 = null;
        slimTableFactoryTest0.setslimTableFactory(slimTableFactory2);
        fitnesse.testsystems.slim.Table table4 = slimTableFactoryTest0.table;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory5 = null;
        slimTableFactoryTest0.setslimTableFactory(slimTableFactory5);
        fitnesse.testsystems.slim.Table table7 = null;
        slimTableFactoryTest0.settable(table7);
        fitnesse.testsystems.slim.Table table9 = slimTableFactoryTest0.gettable();
        java.util.Map<java.lang.String, java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable>> strMap10 = slimTableFactoryTest0.getmap();
        fitnesse.testsystems.slim.Table table11 = slimTableFactoryTest0.table;
        fitnesse.testsystems.slim.Table table12 = slimTableFactoryTest0.gettable();
        java.util.Map<java.lang.String, java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable>> strMap13 = slimTableFactoryTest0.map;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory14 = slimTableFactoryTest0.getslimTableFactory();
        java.util.Map<java.lang.String, java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable>> strMap15 = slimTableFactoryTest0.getmap();
        java.util.Map<java.lang.String, java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable>> strMap16 = slimTableFactoryTest0.getmap();
        // The following exception was thrown during execution in test generation
        try {
            slimTableFactoryTest0.checkTableTypeDefinesIgnoredIfDifferentSpecified();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(strMap1);
        org.junit.Assert.assertNull(table4);
        org.junit.Assert.assertNull(table9);
        org.junit.Assert.assertNull(strMap10);
        org.junit.Assert.assertNull(table11);
        org.junit.Assert.assertNull(table12);
        org.junit.Assert.assertNull(strMap13);
        org.junit.Assert.assertNull(slimTableFactory14);
        org.junit.Assert.assertNull(strMap15);
        org.junit.Assert.assertNull(strMap16);
    }

    @Test
    public void test30055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest60.test30055");
        fitnesse.testsystems.slim.tables.SlimTableFactoryTest slimTableFactoryTest0 = new fitnesse.testsystems.slim.tables.SlimTableFactoryTest();
        java.util.Map<java.lang.String, java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable>> strMap1 = slimTableFactoryTest0.map;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory2 = null;
        slimTableFactoryTest0.setslimTableFactory(slimTableFactory2);
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory4 = null;
        slimTableFactoryTest0.setslimTableFactory(slimTableFactory4);
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory6 = slimTableFactoryTest0.slimTableFactory;
        fitnesse.testsystems.slim.Table table7 = null;
        slimTableFactoryTest0.table = table7;
        java.util.Map<java.lang.String, java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable>> strMap9 = slimTableFactoryTest0.map;
        fitnesse.testsystems.slim.Table table10 = null;
        slimTableFactoryTest0.settable(table10);
        fitnesse.testsystems.slim.Table table12 = slimTableFactoryTest0.gettable();
        fitnesse.testsystems.slim.Table table13 = slimTableFactoryTest0.gettable();
        fitnesse.testsystems.slim.Table table14 = slimTableFactoryTest0.gettable();
        org.junit.Assert.assertNull(strMap1);
        org.junit.Assert.assertNull(slimTableFactory6);
        org.junit.Assert.assertNull(strMap9);
        org.junit.Assert.assertNull(table12);
        org.junit.Assert.assertNull(table13);
        org.junit.Assert.assertNull(table14);
    }

    @Test
    public void test30056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest60.test30056");
        fitnesse.testsystems.slim.tables.SlimTableFactoryTest slimTableFactoryTest0 = new fitnesse.testsystems.slim.tables.SlimTableFactoryTest();
        fitnesse.testsystems.slim.Table table1 = slimTableFactoryTest0.gettable();
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory2 = slimTableFactoryTest0.slimTableFactory;
        fitnesse.testsystems.slim.Table table3 = null;
        slimTableFactoryTest0.settable(table3);
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory5 = null;
        slimTableFactoryTest0.setslimTableFactory(slimTableFactory5);
        fitnesse.testsystems.slim.Table table7 = null;
        slimTableFactoryTest0.settable(table7);
        fitnesse.testsystems.slim.Table table9 = null;
        slimTableFactoryTest0.settable(table9);
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory11 = slimTableFactoryTest0.slimTableFactory;
        fitnesse.testsystems.slim.Table table12 = slimTableFactoryTest0.table;
        fitnesse.testsystems.slim.Table table13 = null;
        slimTableFactoryTest0.settable(table13);
        fitnesse.testsystems.slim.Table table15 = null;
        slimTableFactoryTest0.settable(table15);
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory17 = null;
        slimTableFactoryTest0.slimTableFactory = slimTableFactory17;
        fitnesse.testsystems.slim.Table table19 = slimTableFactoryTest0.gettable();
        java.util.Map<java.lang.String, java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable>> strMap20 = slimTableFactoryTest0.map;
        org.junit.Assert.assertNull(table1);
        org.junit.Assert.assertNull(slimTableFactory2);
        org.junit.Assert.assertNull(slimTableFactory11);
        org.junit.Assert.assertNull(table12);
        org.junit.Assert.assertNull(table19);
        org.junit.Assert.assertNull(strMap20);
    }

    @Test
    public void test30057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest60.test30057");
        fitnesse.testsystems.slim.tables.SlimTableFactoryTest slimTableFactoryTest0 = new fitnesse.testsystems.slim.tables.SlimTableFactoryTest();
        java.util.Map<java.lang.String, java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable>> strMap1 = slimTableFactoryTest0.map;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory2 = slimTableFactoryTest0.slimTableFactory;
        fitnesse.testsystems.slim.Table table3 = slimTableFactoryTest0.table;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory4 = slimTableFactoryTest0.slimTableFactory;
        fitnesse.testsystems.slim.Table table5 = null;
        slimTableFactoryTest0.settable(table5);
        fitnesse.testsystems.slim.Table table7 = null;
        slimTableFactoryTest0.table = table7;
        org.junit.Assert.assertNull(strMap1);
        org.junit.Assert.assertNull(slimTableFactory2);
        org.junit.Assert.assertNull(table3);
        org.junit.Assert.assertNull(slimTableFactory4);
    }

    @Test
    public void test30058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest60.test30058");
        fitnesse.testsystems.slim.tables.SlimTableFactoryTest slimTableFactoryTest0 = new fitnesse.testsystems.slim.tables.SlimTableFactoryTest();
        fitnesse.testsystems.slim.Table table1 = slimTableFactoryTest0.gettable();
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory2 = slimTableFactoryTest0.slimTableFactory;
        fitnesse.testsystems.slim.Table table3 = null;
        slimTableFactoryTest0.settable(table3);
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory5 = null;
        slimTableFactoryTest0.setslimTableFactory(slimTableFactory5);
        fitnesse.testsystems.slim.Table table7 = null;
        slimTableFactoryTest0.table = table7;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory9 = slimTableFactoryTest0.slimTableFactory;
        fitnesse.testsystems.slim.Table table10 = slimTableFactoryTest0.gettable();
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory11 = null;
        slimTableFactoryTest0.slimTableFactory = slimTableFactory11;
        fitnesse.testsystems.slim.Table table13 = slimTableFactoryTest0.table;
        java.util.Map<java.lang.String, java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable>> strMap14 = slimTableFactoryTest0.map;
        java.util.Map<java.lang.String, java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable>> strMap15 = slimTableFactoryTest0.map;
        fitnesse.testsystems.slim.Table table16 = null;
        slimTableFactoryTest0.settable(table16);
        fitnesse.testsystems.slim.Table table18 = null;
        slimTableFactoryTest0.table = table18;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory20 = null;
        slimTableFactoryTest0.setslimTableFactory(slimTableFactory20);
        fitnesse.testsystems.slim.Table table22 = null;
        slimTableFactoryTest0.settable(table22);
        java.util.Map<java.lang.String, java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable>> strMap24 = slimTableFactoryTest0.map;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory25 = slimTableFactoryTest0.getslimTableFactory();
        org.junit.Assert.assertNull(table1);
        org.junit.Assert.assertNull(slimTableFactory2);
        org.junit.Assert.assertNull(slimTableFactory9);
        org.junit.Assert.assertNull(table10);
        org.junit.Assert.assertNull(table13);
        org.junit.Assert.assertNull(strMap14);
        org.junit.Assert.assertNull(strMap15);
        org.junit.Assert.assertNull(strMap24);
        org.junit.Assert.assertNull(slimTableFactory25);
    }

    @Test
    public void test30059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest60.test30059");
        fitnesse.testsystems.slim.tables.SlimTableFactoryTest slimTableFactoryTest0 = new fitnesse.testsystems.slim.tables.SlimTableFactoryTest();
        java.util.Map<java.lang.String, java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable>> strMap1 = slimTableFactoryTest0.map;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory2 = null;
        slimTableFactoryTest0.setslimTableFactory(slimTableFactory2);
        fitnesse.testsystems.slim.Table table4 = slimTableFactoryTest0.table;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory5 = slimTableFactoryTest0.slimTableFactory;
        java.util.Map<java.lang.String, java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable>> strMap6 = slimTableFactoryTest0.getmap();
        java.util.Map<java.lang.String, java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable>> strMap7 = slimTableFactoryTest0.map;
        java.util.Map<java.lang.String, java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable>> strMap8 = slimTableFactoryTest0.map;
        fitnesse.testsystems.slim.Table table9 = null;
        slimTableFactoryTest0.settable(table9);
        org.junit.Assert.assertNull(strMap1);
        org.junit.Assert.assertNull(table4);
        org.junit.Assert.assertNull(slimTableFactory5);
        org.junit.Assert.assertNull(strMap6);
        org.junit.Assert.assertNull(strMap7);
        org.junit.Assert.assertNull(strMap8);
    }

    @Test
    public void test30060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest60.test30060");
        fitnesse.testsystems.slim.tables.SlimTableFactoryTest slimTableFactoryTest0 = new fitnesse.testsystems.slim.tables.SlimTableFactoryTest();
        java.util.Map<java.lang.String, java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable>> strMap1 = slimTableFactoryTest0.map;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory2 = null;
        slimTableFactoryTest0.setslimTableFactory(slimTableFactory2);
        fitnesse.testsystems.slim.Table table4 = null;
        slimTableFactoryTest0.table = table4;
        java.util.Map<java.lang.String, java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable>> strMap6 = slimTableFactoryTest0.map;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory7 = slimTableFactoryTest0.getslimTableFactory();
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory8 = slimTableFactoryTest0.getslimTableFactory();
        fitnesse.testsystems.slim.Table table9 = null;
        slimTableFactoryTest0.table = table9;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory11 = slimTableFactoryTest0.slimTableFactory;
        java.util.Map<java.lang.String, java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable>> strMap12 = slimTableFactoryTest0.getmap();
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory13 = slimTableFactoryTest0.slimTableFactory;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory14 = null;
        slimTableFactoryTest0.slimTableFactory = slimTableFactory14;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory16 = slimTableFactoryTest0.getslimTableFactory();
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory17 = null;
        slimTableFactoryTest0.setslimTableFactory(slimTableFactory17);
        fitnesse.testsystems.slim.Table table19 = slimTableFactoryTest0.table;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory20 = null;
        slimTableFactoryTest0.slimTableFactory = slimTableFactory20;
        fitnesse.testsystems.slim.Table table22 = null;
        slimTableFactoryTest0.settable(table22);
        org.junit.Assert.assertNull(strMap1);
        org.junit.Assert.assertNull(strMap6);
        org.junit.Assert.assertNull(slimTableFactory7);
        org.junit.Assert.assertNull(slimTableFactory8);
        org.junit.Assert.assertNull(slimTableFactory11);
        org.junit.Assert.assertNull(strMap12);
        org.junit.Assert.assertNull(slimTableFactory13);
        org.junit.Assert.assertNull(slimTableFactory16);
        org.junit.Assert.assertNull(table19);
    }

    @Test
    public void test30061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest60.test30061");
        fitnesse.testsystems.slim.tables.SlimTableFactoryTest slimTableFactoryTest0 = new fitnesse.testsystems.slim.tables.SlimTableFactoryTest();
        java.util.Map<java.lang.String, java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable>> strMap1 = slimTableFactoryTest0.map;
        fitnesse.testsystems.slim.Table table2 = null;
        slimTableFactoryTest0.settable(table2);
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory4 = null;
        slimTableFactoryTest0.slimTableFactory = slimTableFactory4;
        java.util.Map<java.lang.String, java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable>> strMap6 = slimTableFactoryTest0.map;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory7 = slimTableFactoryTest0.slimTableFactory;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory8 = null;
        slimTableFactoryTest0.slimTableFactory = slimTableFactory8;
        java.util.Map<java.lang.String, java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable>> strMap10 = slimTableFactoryTest0.getmap();
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory11 = null;
        slimTableFactoryTest0.slimTableFactory = slimTableFactory11;
        fitnesse.testsystems.slim.Table table13 = slimTableFactoryTest0.gettable();
        java.util.Map<java.lang.String, java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable>> strMap14 = slimTableFactoryTest0.map;
        org.junit.Assert.assertNull(strMap1);
        org.junit.Assert.assertNull(strMap6);
        org.junit.Assert.assertNull(slimTableFactory7);
        org.junit.Assert.assertNull(strMap10);
        org.junit.Assert.assertNull(table13);
        org.junit.Assert.assertNull(strMap14);
    }

    @Test
    public void test30062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest60.test30062");
        fitnesse.testsystems.slim.tables.SlimTableFactoryTest slimTableFactoryTest0 = new fitnesse.testsystems.slim.tables.SlimTableFactoryTest();
        java.util.Map<java.lang.String, java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable>> strMap1 = slimTableFactoryTest0.map;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory2 = null;
        slimTableFactoryTest0.setslimTableFactory(slimTableFactory2);
        fitnesse.testsystems.slim.Table table4 = slimTableFactoryTest0.table;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory5 = null;
        slimTableFactoryTest0.setslimTableFactory(slimTableFactory5);
        fitnesse.testsystems.slim.Table table7 = null;
        slimTableFactoryTest0.settable(table7);
        fitnesse.testsystems.slim.Table table9 = slimTableFactoryTest0.gettable();
        fitnesse.testsystems.slim.Table table10 = null;
        slimTableFactoryTest0.settable(table10);
        fitnesse.testsystems.slim.Table table12 = slimTableFactoryTest0.gettable();
        fitnesse.testsystems.slim.Table table13 = null;
        slimTableFactoryTest0.table = table13;
        fitnesse.testsystems.slim.Table table15 = slimTableFactoryTest0.gettable();
        fitnesse.testsystems.slim.Table table16 = slimTableFactoryTest0.gettable();
        fitnesse.testsystems.slim.Table table17 = null;
        slimTableFactoryTest0.settable(table17);
        // The following exception was thrown during execution in test generation
        try {
            slimTableFactoryTest0.checkTableTypeDefineUsedForTable();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(strMap1);
        org.junit.Assert.assertNull(table4);
        org.junit.Assert.assertNull(table9);
        org.junit.Assert.assertNull(table12);
        org.junit.Assert.assertNull(table15);
        org.junit.Assert.assertNull(table16);
    }

    @Test
    public void test30063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest60.test30063");
        fitnesse.testsystems.slim.tables.SlimTableFactoryTest slimTableFactoryTest0 = new fitnesse.testsystems.slim.tables.SlimTableFactoryTest();
        java.util.Map<java.lang.String, java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable>> strMap1 = slimTableFactoryTest0.map;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory2 = slimTableFactoryTest0.slimTableFactory;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory3 = null;
        slimTableFactoryTest0.setslimTableFactory(slimTableFactory3);
        fitnesse.testsystems.slim.Table table5 = null;
        slimTableFactoryTest0.settable(table5);
        fitnesse.testsystems.slim.Table table7 = slimTableFactoryTest0.gettable();
        fitnesse.testsystems.slim.Table table8 = slimTableFactoryTest0.table;
        fitnesse.testsystems.slim.Table table9 = null;
        slimTableFactoryTest0.table = table9;
        fitnesse.testsystems.slim.Table table11 = null;
        slimTableFactoryTest0.settable(table11);
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory13 = slimTableFactoryTest0.slimTableFactory;
        java.util.Map<java.lang.String, java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable>> strMap14 = slimTableFactoryTest0.getmap();
        fitnesse.testsystems.slim.Table table15 = slimTableFactoryTest0.gettable();
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory16 = slimTableFactoryTest0.getslimTableFactory();
        // The following exception was thrown during execution in test generation
        try {
            slimTableFactoryTest0.addTableTypeImport("", "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(strMap1);
        org.junit.Assert.assertNull(slimTableFactory2);
        org.junit.Assert.assertNull(table7);
        org.junit.Assert.assertNull(table8);
        org.junit.Assert.assertNull(slimTableFactory13);
        org.junit.Assert.assertNull(strMap14);
        org.junit.Assert.assertNull(table15);
        org.junit.Assert.assertNull(slimTableFactory16);
    }

    @Test
    public void test30064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest60.test30064");
        fitnesse.testsystems.slim.tables.SlimTableFactoryTest slimTableFactoryTest0 = new fitnesse.testsystems.slim.tables.SlimTableFactoryTest();
        fitnesse.testsystems.slim.Table table1 = slimTableFactoryTest0.gettable();
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory2 = slimTableFactoryTest0.slimTableFactory;
        fitnesse.testsystems.slim.Table table3 = null;
        slimTableFactoryTest0.settable(table3);
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory5 = null;
        slimTableFactoryTest0.setslimTableFactory(slimTableFactory5);
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory7 = null;
        slimTableFactoryTest0.setslimTableFactory(slimTableFactory7);
        java.util.Map<java.lang.String, java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable>> strMap9 = slimTableFactoryTest0.getmap();
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory10 = slimTableFactoryTest0.getslimTableFactory();
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory11 = null;
        slimTableFactoryTest0.setslimTableFactory(slimTableFactory11);
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory13 = slimTableFactoryTest0.slimTableFactory;
        // The following exception was thrown during execution in test generation
        try {
            slimTableFactoryTest0.commentTableShouldReturnNull();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(table1);
        org.junit.Assert.assertNull(slimTableFactory2);
        org.junit.Assert.assertNull(strMap9);
        org.junit.Assert.assertNull(slimTableFactory10);
        org.junit.Assert.assertNull(slimTableFactory13);
    }

    @Test
    public void test30065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest60.test30065");
        fitnesse.testsystems.slim.tables.SlimTableFactoryTest slimTableFactoryTest0 = new fitnesse.testsystems.slim.tables.SlimTableFactoryTest();
        java.util.Map<java.lang.String, java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable>> strMap1 = slimTableFactoryTest0.map;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory2 = null;
        slimTableFactoryTest0.setslimTableFactory(slimTableFactory2);
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory4 = null;
        slimTableFactoryTest0.setslimTableFactory(slimTableFactory4);
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory6 = slimTableFactoryTest0.slimTableFactory;
        fitnesse.testsystems.slim.Table table7 = null;
        slimTableFactoryTest0.table = table7;
        java.util.Map<java.lang.String, java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable>> strMap9 = slimTableFactoryTest0.getmap();
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory10 = slimTableFactoryTest0.getslimTableFactory();
        fitnesse.testsystems.slim.Table table11 = slimTableFactoryTest0.table;
        fitnesse.testsystems.slim.Table table12 = null;
        slimTableFactoryTest0.settable(table12);
        java.util.Map<java.lang.String, java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable>> strMap14 = slimTableFactoryTest0.getmap();
        org.junit.Assert.assertNull(strMap1);
        org.junit.Assert.assertNull(slimTableFactory6);
        org.junit.Assert.assertNull(strMap9);
        org.junit.Assert.assertNull(slimTableFactory10);
        org.junit.Assert.assertNull(table11);
        org.junit.Assert.assertNull(strMap14);
    }

    @Test
    public void test30066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest60.test30066");
        fitnesse.testsystems.slim.tables.SlimTableFactoryTest slimTableFactoryTest0 = new fitnesse.testsystems.slim.tables.SlimTableFactoryTest();
        java.util.Map<java.lang.String, java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable>> strMap1 = slimTableFactoryTest0.map;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory2 = null;
        slimTableFactoryTest0.setslimTableFactory(slimTableFactory2);
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory4 = null;
        slimTableFactoryTest0.setslimTableFactory(slimTableFactory4);
        fitnesse.testsystems.slim.Table table6 = slimTableFactoryTest0.table;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory7 = null;
        slimTableFactoryTest0.setslimTableFactory(slimTableFactory7);
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory9 = null;
        slimTableFactoryTest0.setslimTableFactory(slimTableFactory9);
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory11 = slimTableFactoryTest0.slimTableFactory;
        fitnesse.testsystems.slim.Table table12 = slimTableFactoryTest0.table;
        org.junit.Assert.assertNull(strMap1);
        org.junit.Assert.assertNull(table6);
        org.junit.Assert.assertNull(slimTableFactory11);
        org.junit.Assert.assertNull(table12);
    }

    @Test
    public void test30067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest60.test30067");
        fitnesse.testsystems.slim.tables.SlimTableFactoryTest slimTableFactoryTest0 = new fitnesse.testsystems.slim.tables.SlimTableFactoryTest();
        fitnesse.testsystems.slim.Table table1 = slimTableFactoryTest0.gettable();
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory2 = null;
        slimTableFactoryTest0.slimTableFactory = slimTableFactory2;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory4 = null;
        slimTableFactoryTest0.slimTableFactory = slimTableFactory4;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory6 = slimTableFactoryTest0.slimTableFactory;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory7 = slimTableFactoryTest0.slimTableFactory;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory8 = slimTableFactoryTest0.getslimTableFactory();
        java.util.Map<java.lang.String, java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable>> strMap9 = slimTableFactoryTest0.getmap();
        fitnesse.testsystems.slim.Table table10 = slimTableFactoryTest0.gettable();
        // The following exception was thrown during execution in test generation
        try {
            slimTableFactoryTest0.shouldCreateCorrectSlimTableForTablesType();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(table1);
        org.junit.Assert.assertNull(slimTableFactory6);
        org.junit.Assert.assertNull(slimTableFactory7);
        org.junit.Assert.assertNull(slimTableFactory8);
        org.junit.Assert.assertNull(strMap9);
        org.junit.Assert.assertNull(table10);
    }

    @Test
    public void test30068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest60.test30068");
        fitnesse.testsystems.slim.tables.SlimTableFactoryTest slimTableFactoryTest0 = new fitnesse.testsystems.slim.tables.SlimTableFactoryTest();
        fitnesse.testsystems.slim.Table table1 = slimTableFactoryTest0.gettable();
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory2 = slimTableFactoryTest0.getslimTableFactory();
        fitnesse.testsystems.slim.Table table3 = null;
        slimTableFactoryTest0.table = table3;
        fitnesse.testsystems.slim.Table table5 = slimTableFactoryTest0.gettable();
        java.util.Map<java.lang.String, java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable>> strMap6 = slimTableFactoryTest0.getmap();
        java.util.Map<java.lang.String, java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable>> strMap7 = slimTableFactoryTest0.getmap();
        fitnesse.testsystems.slim.Table table8 = slimTableFactoryTest0.table;
        java.util.Map<java.lang.String, java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable>> strMap9 = slimTableFactoryTest0.map;
        fitnesse.testsystems.slim.Table table10 = null;
        slimTableFactoryTest0.table = table10;
        org.junit.Assert.assertNull(table1);
        org.junit.Assert.assertNull(slimTableFactory2);
        org.junit.Assert.assertNull(table5);
        org.junit.Assert.assertNull(strMap6);
        org.junit.Assert.assertNull(strMap7);
        org.junit.Assert.assertNull(table8);
        org.junit.Assert.assertNull(strMap9);
    }

    @Test
    public void test30069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest60.test30069");
        fitnesse.testsystems.slim.tables.SlimTableFactoryTest slimTableFactoryTest0 = new fitnesse.testsystems.slim.tables.SlimTableFactoryTest();
        fitnesse.testsystems.slim.Table table1 = slimTableFactoryTest0.gettable();
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory2 = slimTableFactoryTest0.slimTableFactory;
        fitnesse.testsystems.slim.Table table3 = null;
        slimTableFactoryTest0.settable(table3);
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory5 = null;
        slimTableFactoryTest0.setslimTableFactory(slimTableFactory5);
        fitnesse.testsystems.slim.Table table7 = null;
        slimTableFactoryTest0.settable(table7);
        fitnesse.testsystems.slim.Table table9 = null;
        slimTableFactoryTest0.settable(table9);
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory11 = slimTableFactoryTest0.slimTableFactory;
        fitnesse.testsystems.slim.Table table12 = slimTableFactoryTest0.table;
        fitnesse.testsystems.slim.Table table13 = null;
        slimTableFactoryTest0.settable(table13);
        fitnesse.testsystems.slim.Table table15 = null;
        slimTableFactoryTest0.settable(table15);
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory17 = null;
        slimTableFactoryTest0.slimTableFactory = slimTableFactory17;
        java.util.Map<java.lang.String, java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable>> strMap19 = slimTableFactoryTest0.map;
        java.util.Map<java.lang.String, java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable>> strMap20 = slimTableFactoryTest0.map;
        fitnesse.testsystems.slim.Table table21 = slimTableFactoryTest0.gettable();
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory22 = slimTableFactoryTest0.slimTableFactory;
        fitnesse.testsystems.slim.Table table23 = slimTableFactoryTest0.gettable();
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory24 = slimTableFactoryTest0.slimTableFactory;
        org.junit.Assert.assertNull(table1);
        org.junit.Assert.assertNull(slimTableFactory2);
        org.junit.Assert.assertNull(slimTableFactory11);
        org.junit.Assert.assertNull(table12);
        org.junit.Assert.assertNull(strMap19);
        org.junit.Assert.assertNull(strMap20);
        org.junit.Assert.assertNull(table21);
        org.junit.Assert.assertNull(slimTableFactory22);
        org.junit.Assert.assertNull(table23);
        org.junit.Assert.assertNull(slimTableFactory24);
    }

    @Test
    public void test30070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest60.test30070");
        fitnesse.testsystems.slim.tables.SlimTableFactoryTest slimTableFactoryTest0 = new fitnesse.testsystems.slim.tables.SlimTableFactoryTest();
        java.util.Map<java.lang.String, java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable>> strMap1 = slimTableFactoryTest0.map;
        fitnesse.testsystems.slim.Table table2 = null;
        slimTableFactoryTest0.settable(table2);
        fitnesse.testsystems.slim.Table table4 = slimTableFactoryTest0.gettable();
        fitnesse.testsystems.slim.Table table5 = null;
        slimTableFactoryTest0.table = table5;
        fitnesse.testsystems.slim.Table table7 = slimTableFactoryTest0.table;
        fitnesse.testsystems.slim.Table table8 = null;
        slimTableFactoryTest0.settable(table8);
        fitnesse.testsystems.slim.Table table10 = null;
        slimTableFactoryTest0.settable(table10);
        fitnesse.testsystems.slim.Table table12 = null;
        slimTableFactoryTest0.settable(table12);
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory14 = null;
        slimTableFactoryTest0.setslimTableFactory(slimTableFactory14);
        org.junit.Assert.assertNull(strMap1);
        org.junit.Assert.assertNull(table4);
        org.junit.Assert.assertNull(table7);
    }

    @Test
    public void test30071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest60.test30071");
        fitnesse.testsystems.slim.tables.SlimTableFactoryTest slimTableFactoryTest0 = new fitnesse.testsystems.slim.tables.SlimTableFactoryTest();
        fitnesse.testsystems.slim.Table table1 = slimTableFactoryTest0.gettable();
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory2 = slimTableFactoryTest0.slimTableFactory;
        fitnesse.testsystems.slim.Table table3 = null;
        slimTableFactoryTest0.settable(table3);
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory5 = null;
        slimTableFactoryTest0.setslimTableFactory(slimTableFactory5);
        fitnesse.testsystems.slim.Table table7 = null;
        slimTableFactoryTest0.table = table7;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory9 = slimTableFactoryTest0.slimTableFactory;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory10 = null;
        slimTableFactoryTest0.setslimTableFactory(slimTableFactory10);
        fitnesse.testsystems.slim.Table table12 = slimTableFactoryTest0.table;
        java.util.Map<java.lang.String, java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable>> strMap13 = slimTableFactoryTest0.map;
        org.junit.Assert.assertNull(table1);
        org.junit.Assert.assertNull(slimTableFactory2);
        org.junit.Assert.assertNull(slimTableFactory9);
        org.junit.Assert.assertNull(table12);
        org.junit.Assert.assertNull(strMap13);
    }

    @Test
    public void test30072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest60.test30072");
        fitnesse.testsystems.slim.tables.SlimTableFactoryTest slimTableFactoryTest0 = new fitnesse.testsystems.slim.tables.SlimTableFactoryTest();
        fitnesse.testsystems.slim.Table table1 = slimTableFactoryTest0.gettable();
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory2 = slimTableFactoryTest0.slimTableFactory;
        fitnesse.testsystems.slim.Table table3 = null;
        slimTableFactoryTest0.settable(table3);
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory5 = null;
        slimTableFactoryTest0.setslimTableFactory(slimTableFactory5);
        fitnesse.testsystems.slim.Table table7 = null;
        slimTableFactoryTest0.settable(table7);
        fitnesse.testsystems.slim.Table table9 = null;
        slimTableFactoryTest0.settable(table9);
        fitnesse.testsystems.slim.Table table11 = null;
        slimTableFactoryTest0.settable(table11);
        java.util.Map<java.lang.String, java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable>> strMap13 = slimTableFactoryTest0.map;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory14 = slimTableFactoryTest0.getslimTableFactory();
        java.util.Map<java.lang.String, java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable>> strMap15 = slimTableFactoryTest0.map;
        fitnesse.testsystems.slim.Table table16 = slimTableFactoryTest0.gettable();
        fitnesse.testsystems.slim.Table table17 = null;
        slimTableFactoryTest0.settable(table17);
        java.util.Map<java.lang.String, java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable>> strMap19 = slimTableFactoryTest0.map;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory20 = slimTableFactoryTest0.getslimTableFactory();
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory21 = slimTableFactoryTest0.getslimTableFactory();
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory22 = slimTableFactoryTest0.slimTableFactory;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory23 = slimTableFactoryTest0.getslimTableFactory();
        org.junit.Assert.assertNull(table1);
        org.junit.Assert.assertNull(slimTableFactory2);
        org.junit.Assert.assertNull(strMap13);
        org.junit.Assert.assertNull(slimTableFactory14);
        org.junit.Assert.assertNull(strMap15);
        org.junit.Assert.assertNull(table16);
        org.junit.Assert.assertNull(strMap19);
        org.junit.Assert.assertNull(slimTableFactory20);
        org.junit.Assert.assertNull(slimTableFactory21);
        org.junit.Assert.assertNull(slimTableFactory22);
        org.junit.Assert.assertNull(slimTableFactory23);
    }

    @Test
    public void test30073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest60.test30073");
        fitnesse.testsystems.slim.tables.SlimTableFactoryTest slimTableFactoryTest0 = new fitnesse.testsystems.slim.tables.SlimTableFactoryTest();
        fitnesse.testsystems.slim.Table table1 = slimTableFactoryTest0.gettable();
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory2 = slimTableFactoryTest0.slimTableFactory;
        fitnesse.testsystems.slim.Table table3 = null;
        slimTableFactoryTest0.settable(table3);
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory5 = null;
        slimTableFactoryTest0.setslimTableFactory(slimTableFactory5);
        fitnesse.testsystems.slim.Table table7 = null;
        slimTableFactoryTest0.settable(table7);
        fitnesse.testsystems.slim.Table table9 = null;
        slimTableFactoryTest0.settable(table9);
        java.util.Map<java.lang.String, java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable>> strMap11 = slimTableFactoryTest0.map;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory12 = null;
        slimTableFactoryTest0.slimTableFactory = slimTableFactory12;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory14 = null;
        slimTableFactoryTest0.slimTableFactory = slimTableFactory14;
        java.util.Map<java.lang.String, java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable>> strMap16 = slimTableFactoryTest0.getmap();
        fitnesse.testsystems.slim.Table table17 = null;
        slimTableFactoryTest0.table = table17;
        java.util.Map<java.lang.String, java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable>> strMap19 = slimTableFactoryTest0.getmap();
        fitnesse.testsystems.slim.Table table20 = slimTableFactoryTest0.table;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory21 = null;
        slimTableFactoryTest0.slimTableFactory = slimTableFactory21;
        org.junit.Assert.assertNull(table1);
        org.junit.Assert.assertNull(slimTableFactory2);
        org.junit.Assert.assertNull(strMap11);
        org.junit.Assert.assertNull(strMap16);
        org.junit.Assert.assertNull(strMap19);
        org.junit.Assert.assertNull(table20);
    }

    @Test
    public void test30074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest60.test30074");
        fitnesse.testsystems.slim.tables.SlimTableFactoryTest slimTableFactoryTest0 = new fitnesse.testsystems.slim.tables.SlimTableFactoryTest();
        java.util.Map<java.lang.String, java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable>> strMap1 = slimTableFactoryTest0.map;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory2 = slimTableFactoryTest0.slimTableFactory;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory3 = null;
        slimTableFactoryTest0.slimTableFactory = slimTableFactory3;
        fitnesse.testsystems.slim.Table table5 = slimTableFactoryTest0.table;
        fitnesse.testsystems.slim.Table table6 = slimTableFactoryTest0.table;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory7 = null;
        slimTableFactoryTest0.setslimTableFactory(slimTableFactory7);
        java.util.Map<java.lang.String, java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable>> strMap9 = slimTableFactoryTest0.map;
        fitnesse.testsystems.slim.Table table10 = null;
        slimTableFactoryTest0.table = table10;
        fitnesse.testsystems.slim.Table table12 = null;
        slimTableFactoryTest0.settable(table12);
        // The following exception was thrown during execution in test generation
        try {
            slimTableFactoryTest0.checkTableTypeDefineUsedForTable();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(strMap1);
        org.junit.Assert.assertNull(slimTableFactory2);
        org.junit.Assert.assertNull(table5);
        org.junit.Assert.assertNull(table6);
        org.junit.Assert.assertNull(strMap9);
    }

    @Test
    public void test30075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest60.test30075");
        fitnesse.testsystems.slim.tables.SlimTableFactoryTest slimTableFactoryTest0 = new fitnesse.testsystems.slim.tables.SlimTableFactoryTest();
        fitnesse.testsystems.slim.Table table1 = slimTableFactoryTest0.gettable();
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory2 = slimTableFactoryTest0.slimTableFactory;
        fitnesse.testsystems.slim.Table table3 = null;
        slimTableFactoryTest0.settable(table3);
        java.util.Map<java.lang.String, java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable>> strMap5 = slimTableFactoryTest0.map;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory6 = null;
        slimTableFactoryTest0.slimTableFactory = slimTableFactory6;
        java.util.Map<java.lang.String, java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable>> strMap8 = slimTableFactoryTest0.map;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory9 = slimTableFactoryTest0.slimTableFactory;
        java.util.Map<java.lang.String, java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable>> strMap10 = slimTableFactoryTest0.map;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory11 = null;
        slimTableFactoryTest0.slimTableFactory = slimTableFactory11;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory13 = null;
        slimTableFactoryTest0.setslimTableFactory(slimTableFactory13);
        fitnesse.testsystems.slim.Table table15 = slimTableFactoryTest0.table;
        org.junit.Assert.assertNull(table1);
        org.junit.Assert.assertNull(slimTableFactory2);
        org.junit.Assert.assertNull(strMap5);
        org.junit.Assert.assertNull(strMap8);
        org.junit.Assert.assertNull(slimTableFactory9);
        org.junit.Assert.assertNull(strMap10);
        org.junit.Assert.assertNull(table15);
    }

    @Test
    public void test30076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest60.test30076");
        fitnesse.testsystems.slim.tables.SlimTableFactoryTest slimTableFactoryTest0 = new fitnesse.testsystems.slim.tables.SlimTableFactoryTest();
        java.util.Map<java.lang.String, java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable>> strMap1 = slimTableFactoryTest0.map;
        fitnesse.testsystems.slim.Table table2 = null;
        slimTableFactoryTest0.settable(table2);
        fitnesse.testsystems.slim.Table table4 = slimTableFactoryTest0.gettable();
        fitnesse.testsystems.slim.Table table5 = null;
        slimTableFactoryTest0.table = table5;
        java.util.Map<java.lang.String, java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable>> strMap7 = slimTableFactoryTest0.map;
        java.util.Map<java.lang.String, java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable>> strMap8 = slimTableFactoryTest0.getmap();
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory9 = null;
        slimTableFactoryTest0.slimTableFactory = slimTableFactory9;
        java.util.Map<java.lang.String, java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable>> strMap11 = slimTableFactoryTest0.map;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory12 = null;
        slimTableFactoryTest0.slimTableFactory = slimTableFactory12;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory14 = null;
        slimTableFactoryTest0.setslimTableFactory(slimTableFactory14);
        java.util.Map<java.lang.String, java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable>> strMap16 = slimTableFactoryTest0.getmap();
        org.junit.Assert.assertNull(strMap1);
        org.junit.Assert.assertNull(table4);
        org.junit.Assert.assertNull(strMap7);
        org.junit.Assert.assertNull(strMap8);
        org.junit.Assert.assertNull(strMap11);
        org.junit.Assert.assertNull(strMap16);
    }

    @Test
    public void test30077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest60.test30077");
        fitnesse.testsystems.slim.tables.SlimTableFactoryTest slimTableFactoryTest0 = new fitnesse.testsystems.slim.tables.SlimTableFactoryTest();
        fitnesse.testsystems.slim.Table table1 = slimTableFactoryTest0.gettable();
        fitnesse.testsystems.slim.Table table2 = slimTableFactoryTest0.table;
        fitnesse.testsystems.slim.Table table3 = null;
        slimTableFactoryTest0.table = table3;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory5 = slimTableFactoryTest0.getslimTableFactory();
        java.util.Map<java.lang.String, java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable>> strMap6 = slimTableFactoryTest0.getmap();
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory7 = null;
        slimTableFactoryTest0.setslimTableFactory(slimTableFactory7);
        fitnesse.testsystems.slim.Table table9 = null;
        slimTableFactoryTest0.table = table9;
        fitnesse.testsystems.slim.Table table11 = slimTableFactoryTest0.gettable();
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory12 = null;
        slimTableFactoryTest0.setslimTableFactory(slimTableFactory12);
        // The following exception was thrown during execution in test generation
        try {
            slimTableFactoryTest0.shouldCreateCorrectSlimTableForTablesType();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(table1);
        org.junit.Assert.assertNull(table2);
        org.junit.Assert.assertNull(slimTableFactory5);
        org.junit.Assert.assertNull(strMap6);
        org.junit.Assert.assertNull(table11);
    }

    @Test
    public void test30078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest60.test30078");
        fitnesse.testsystems.slim.tables.SlimTableFactoryTest slimTableFactoryTest0 = new fitnesse.testsystems.slim.tables.SlimTableFactoryTest();
        java.util.Map<java.lang.String, java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable>> strMap1 = slimTableFactoryTest0.map;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory2 = slimTableFactoryTest0.slimTableFactory;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory3 = null;
        slimTableFactoryTest0.setslimTableFactory(slimTableFactory3);
        fitnesse.testsystems.slim.Table table5 = slimTableFactoryTest0.table;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory6 = null;
        slimTableFactoryTest0.slimTableFactory = slimTableFactory6;
        fitnesse.testsystems.slim.Table table8 = null;
        slimTableFactoryTest0.settable(table8);
        java.util.Map<java.lang.String, java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable>> strMap10 = slimTableFactoryTest0.map;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory11 = null;
        slimTableFactoryTest0.setslimTableFactory(slimTableFactory11);
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory13 = null;
        slimTableFactoryTest0.setslimTableFactory(slimTableFactory13);
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory15 = slimTableFactoryTest0.slimTableFactory;
        java.util.Map<java.lang.String, java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable>> strMap16 = slimTableFactoryTest0.getmap();
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory17 = null;
        slimTableFactoryTest0.slimTableFactory = slimTableFactory17;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory19 = slimTableFactoryTest0.getslimTableFactory();
        // The following exception was thrown during execution in test generation
        try {
            slimTableFactoryTest0.checkTableTypeDefinesIgnoredIfDifferentSpecified();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(strMap1);
        org.junit.Assert.assertNull(slimTableFactory2);
        org.junit.Assert.assertNull(table5);
        org.junit.Assert.assertNull(strMap10);
        org.junit.Assert.assertNull(slimTableFactory15);
        org.junit.Assert.assertNull(strMap16);
        org.junit.Assert.assertNull(slimTableFactory19);
    }

    @Test
    public void test30079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest60.test30079");
        fitnesse.testsystems.slim.tables.SlimTableFactoryTest slimTableFactoryTest0 = new fitnesse.testsystems.slim.tables.SlimTableFactoryTest();
        java.util.Map<java.lang.String, java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable>> strMap1 = slimTableFactoryTest0.map;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory2 = slimTableFactoryTest0.slimTableFactory;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory3 = null;
        slimTableFactoryTest0.slimTableFactory = slimTableFactory3;
        fitnesse.testsystems.slim.Table table5 = slimTableFactoryTest0.gettable();
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory6 = null;
        slimTableFactoryTest0.setslimTableFactory(slimTableFactory6);
        fitnesse.testsystems.slim.Table table8 = null;
        slimTableFactoryTest0.settable(table8);
        java.util.Map<java.lang.String, java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable>> strMap10 = slimTableFactoryTest0.getmap();
        fitnesse.testsystems.slim.Table table11 = null;
        slimTableFactoryTest0.settable(table11);
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory13 = null;
        slimTableFactoryTest0.setslimTableFactory(slimTableFactory13);
        org.junit.Assert.assertNull(strMap1);
        org.junit.Assert.assertNull(slimTableFactory2);
        org.junit.Assert.assertNull(table5);
        org.junit.Assert.assertNull(strMap10);
    }

    @Test
    public void test30080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest60.test30080");
        fitnesse.testsystems.slim.tables.SlimTableFactoryTest slimTableFactoryTest0 = new fitnesse.testsystems.slim.tables.SlimTableFactoryTest();
        fitnesse.testsystems.slim.Table table1 = slimTableFactoryTest0.gettable();
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory2 = slimTableFactoryTest0.slimTableFactory;
        fitnesse.testsystems.slim.Table table3 = null;
        slimTableFactoryTest0.settable(table3);
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory5 = null;
        slimTableFactoryTest0.setslimTableFactory(slimTableFactory5);
        fitnesse.testsystems.slim.Table table7 = null;
        slimTableFactoryTest0.settable(table7);
        fitnesse.testsystems.slim.Table table9 = null;
        slimTableFactoryTest0.settable(table9);
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory11 = slimTableFactoryTest0.slimTableFactory;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory12 = slimTableFactoryTest0.slimTableFactory;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory13 = slimTableFactoryTest0.slimTableFactory;
        java.util.Map<java.lang.String, java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable>> strMap14 = slimTableFactoryTest0.map;
        // The following exception was thrown during execution in test generation
        try {
            slimTableFactoryTest0.commentTableShouldReturnNull();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(table1);
        org.junit.Assert.assertNull(slimTableFactory2);
        org.junit.Assert.assertNull(slimTableFactory11);
        org.junit.Assert.assertNull(slimTableFactory12);
        org.junit.Assert.assertNull(slimTableFactory13);
        org.junit.Assert.assertNull(strMap14);
    }

    @Test
    public void test30081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest60.test30081");
        fitnesse.testsystems.slim.tables.SlimTableFactoryTest slimTableFactoryTest0 = new fitnesse.testsystems.slim.tables.SlimTableFactoryTest();
        java.util.Map<java.lang.String, java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable>> strMap1 = slimTableFactoryTest0.map;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory2 = slimTableFactoryTest0.slimTableFactory;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory3 = null;
        slimTableFactoryTest0.setslimTableFactory(slimTableFactory3);
        fitnesse.testsystems.slim.Table table5 = slimTableFactoryTest0.table;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory6 = null;
        slimTableFactoryTest0.slimTableFactory = slimTableFactory6;
        java.util.Map<java.lang.String, java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable>> strMap8 = slimTableFactoryTest0.getmap();
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory9 = null;
        slimTableFactoryTest0.slimTableFactory = slimTableFactory9;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory11 = null;
        slimTableFactoryTest0.setslimTableFactory(slimTableFactory11);
        fitnesse.testsystems.slim.Table table13 = null;
        slimTableFactoryTest0.table = table13;
        java.util.Map<java.lang.String, java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable>> strMap15 = slimTableFactoryTest0.map;
        org.junit.Assert.assertNull(strMap1);
        org.junit.Assert.assertNull(slimTableFactory2);
        org.junit.Assert.assertNull(table5);
        org.junit.Assert.assertNull(strMap8);
        org.junit.Assert.assertNull(strMap15);
    }

    @Test
    public void test30082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest60.test30082");
        fitnesse.testsystems.slim.tables.SlimTableFactoryTest slimTableFactoryTest0 = new fitnesse.testsystems.slim.tables.SlimTableFactoryTest();
        java.util.Map<java.lang.String, java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable>> strMap1 = slimTableFactoryTest0.map;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory2 = null;
        slimTableFactoryTest0.setslimTableFactory(slimTableFactory2);
        fitnesse.testsystems.slim.Table table4 = null;
        slimTableFactoryTest0.table = table4;
        java.util.Map<java.lang.String, java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable>> strMap6 = slimTableFactoryTest0.getmap();
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory7 = slimTableFactoryTest0.slimTableFactory;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory8 = slimTableFactoryTest0.slimTableFactory;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory9 = null;
        slimTableFactoryTest0.slimTableFactory = slimTableFactory9;
        fitnesse.testsystems.slim.Table table11 = null;
        slimTableFactoryTest0.table = table11;
        org.junit.Assert.assertNull(strMap1);
        org.junit.Assert.assertNull(strMap6);
        org.junit.Assert.assertNull(slimTableFactory7);
        org.junit.Assert.assertNull(slimTableFactory8);
    }

    @Test
    public void test30083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest60.test30083");
        fitnesse.testsystems.slim.tables.SlimTableFactoryTest slimTableFactoryTest0 = new fitnesse.testsystems.slim.tables.SlimTableFactoryTest();
        java.util.Map<java.lang.String, java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable>> strMap1 = slimTableFactoryTest0.map;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory2 = null;
        slimTableFactoryTest0.setslimTableFactory(slimTableFactory2);
        fitnesse.testsystems.slim.Table table4 = slimTableFactoryTest0.table;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory5 = slimTableFactoryTest0.slimTableFactory;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory6 = slimTableFactoryTest0.getslimTableFactory();
        fitnesse.testsystems.slim.Table table7 = slimTableFactoryTest0.gettable();
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory8 = slimTableFactoryTest0.slimTableFactory;
        java.util.Map<java.lang.String, java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable>> strMap9 = slimTableFactoryTest0.getmap();
        java.util.Map<java.lang.String, java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable>> strMap10 = slimTableFactoryTest0.getmap();
        fitnesse.testsystems.slim.Table table11 = null;
        slimTableFactoryTest0.settable(table11);
        fitnesse.testsystems.slim.Table table13 = null;
        slimTableFactoryTest0.table = table13;
        fitnesse.testsystems.slim.Table table15 = slimTableFactoryTest0.table;
        java.util.Map<java.lang.String, java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable>> strMap16 = slimTableFactoryTest0.getmap();
        java.util.Map<java.lang.String, java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable>> strMap17 = slimTableFactoryTest0.map;
        fitnesse.testsystems.slim.Table table18 = null;
        slimTableFactoryTest0.settable(table18);
        org.junit.Assert.assertNull(strMap1);
        org.junit.Assert.assertNull(table4);
        org.junit.Assert.assertNull(slimTableFactory5);
        org.junit.Assert.assertNull(slimTableFactory6);
        org.junit.Assert.assertNull(table7);
        org.junit.Assert.assertNull(slimTableFactory8);
        org.junit.Assert.assertNull(strMap9);
        org.junit.Assert.assertNull(strMap10);
        org.junit.Assert.assertNull(table15);
        org.junit.Assert.assertNull(strMap16);
        org.junit.Assert.assertNull(strMap17);
    }

    @Test
    public void test30084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest60.test30084");
        fitnesse.testsystems.slim.tables.SlimTableFactoryTest slimTableFactoryTest0 = new fitnesse.testsystems.slim.tables.SlimTableFactoryTest();
        java.util.Map<java.lang.String, java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable>> strMap1 = slimTableFactoryTest0.map;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory2 = null;
        slimTableFactoryTest0.setslimTableFactory(slimTableFactory2);
        fitnesse.testsystems.slim.Table table4 = null;
        slimTableFactoryTest0.table = table4;
        java.util.Map<java.lang.String, java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable>> strMap6 = slimTableFactoryTest0.map;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory7 = slimTableFactoryTest0.getslimTableFactory();
        java.util.Map<java.lang.String, java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable>> strMap8 = slimTableFactoryTest0.getmap();
        fitnesse.testsystems.slim.Table table9 = null;
        slimTableFactoryTest0.settable(table9);
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory11 = slimTableFactoryTest0.slimTableFactory;
        fitnesse.testsystems.slim.Table table12 = null;
        slimTableFactoryTest0.table = table12;
        org.junit.Assert.assertNull(strMap1);
        org.junit.Assert.assertNull(strMap6);
        org.junit.Assert.assertNull(slimTableFactory7);
        org.junit.Assert.assertNull(strMap8);
        org.junit.Assert.assertNull(slimTableFactory11);
    }

    @Test
    public void test30085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest60.test30085");
        fitnesse.testsystems.slim.tables.SlimTableFactoryTest slimTableFactoryTest0 = new fitnesse.testsystems.slim.tables.SlimTableFactoryTest();
        java.util.Map<java.lang.String, java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable>> strMap1 = slimTableFactoryTest0.map;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory2 = slimTableFactoryTest0.slimTableFactory;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory3 = null;
        slimTableFactoryTest0.slimTableFactory = slimTableFactory3;
        fitnesse.testsystems.slim.Table table5 = slimTableFactoryTest0.table;
        fitnesse.testsystems.slim.Table table6 = null;
        slimTableFactoryTest0.settable(table6);
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory8 = slimTableFactoryTest0.getslimTableFactory();
        fitnesse.testsystems.slim.Table table9 = slimTableFactoryTest0.table;
        java.util.Map<java.lang.String, java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable>> strMap10 = slimTableFactoryTest0.getmap();
        java.util.Map<java.lang.String, java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable>> strMap11 = slimTableFactoryTest0.map;
        org.junit.Assert.assertNull(strMap1);
        org.junit.Assert.assertNull(slimTableFactory2);
        org.junit.Assert.assertNull(table5);
        org.junit.Assert.assertNull(slimTableFactory8);
        org.junit.Assert.assertNull(table9);
        org.junit.Assert.assertNull(strMap10);
        org.junit.Assert.assertNull(strMap11);
    }

    @Test
    public void test30086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest60.test30086");
        fitnesse.testsystems.slim.tables.SlimTableFactoryTest slimTableFactoryTest0 = new fitnesse.testsystems.slim.tables.SlimTableFactoryTest();
        fitnesse.testsystems.slim.Table table1 = slimTableFactoryTest0.gettable();
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory2 = slimTableFactoryTest0.slimTableFactory;
        fitnesse.testsystems.slim.Table table3 = null;
        slimTableFactoryTest0.settable(table3);
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory5 = null;
        slimTableFactoryTest0.setslimTableFactory(slimTableFactory5);
        fitnesse.testsystems.slim.Table table7 = null;
        slimTableFactoryTest0.settable(table7);
        fitnesse.testsystems.slim.Table table9 = null;
        slimTableFactoryTest0.settable(table9);
        fitnesse.testsystems.slim.Table table11 = null;
        slimTableFactoryTest0.settable(table11);
        fitnesse.testsystems.slim.Table table13 = slimTableFactoryTest0.table;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory14 = null;
        slimTableFactoryTest0.slimTableFactory = slimTableFactory14;
        fitnesse.testsystems.slim.Table table16 = null;
        slimTableFactoryTest0.settable(table16);
        java.util.Map<java.lang.String, java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable>> strMap18 = slimTableFactoryTest0.map;
        org.junit.Assert.assertNull(table1);
        org.junit.Assert.assertNull(slimTableFactory2);
        org.junit.Assert.assertNull(table13);
        org.junit.Assert.assertNull(strMap18);
    }

    @Test
    public void test30087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest60.test30087");
        fitnesse.testsystems.slim.tables.SlimTableFactoryTest slimTableFactoryTest0 = new fitnesse.testsystems.slim.tables.SlimTableFactoryTest();
        java.util.Map<java.lang.String, java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable>> strMap1 = slimTableFactoryTest0.map;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory2 = null;
        slimTableFactoryTest0.setslimTableFactory(slimTableFactory2);
        fitnesse.testsystems.slim.Table table4 = null;
        slimTableFactoryTest0.table = table4;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory6 = null;
        slimTableFactoryTest0.slimTableFactory = slimTableFactory6;
        fitnesse.testsystems.slim.Table table8 = slimTableFactoryTest0.gettable();
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory9 = null;
        slimTableFactoryTest0.slimTableFactory = slimTableFactory9;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory11 = slimTableFactoryTest0.slimTableFactory;
        fitnesse.testsystems.slim.Table table12 = null;
        slimTableFactoryTest0.settable(table12);
        fitnesse.testsystems.slim.Table table14 = slimTableFactoryTest0.table;
        fitnesse.testsystems.slim.Table table15 = slimTableFactoryTest0.table;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory16 = slimTableFactoryTest0.slimTableFactory;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory17 = slimTableFactoryTest0.getslimTableFactory();
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory18 = slimTableFactoryTest0.getslimTableFactory();
        fitnesse.testsystems.slim.Table table19 = null;
        slimTableFactoryTest0.table = table19;
        org.junit.Assert.assertNull(strMap1);
        org.junit.Assert.assertNull(table8);
        org.junit.Assert.assertNull(slimTableFactory11);
        org.junit.Assert.assertNull(table14);
        org.junit.Assert.assertNull(table15);
        org.junit.Assert.assertNull(slimTableFactory16);
        org.junit.Assert.assertNull(slimTableFactory17);
        org.junit.Assert.assertNull(slimTableFactory18);
    }

    @Test
    public void test30088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest60.test30088");
        fitnesse.testsystems.slim.tables.SlimTableFactoryTest slimTableFactoryTest0 = new fitnesse.testsystems.slim.tables.SlimTableFactoryTest();
        java.util.Map<java.lang.String, java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable>> strMap1 = slimTableFactoryTest0.map;
        fitnesse.testsystems.slim.Table table2 = null;
        slimTableFactoryTest0.settable(table2);
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory4 = null;
        slimTableFactoryTest0.slimTableFactory = slimTableFactory4;
        java.util.Map<java.lang.String, java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable>> strMap6 = slimTableFactoryTest0.map;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory7 = slimTableFactoryTest0.slimTableFactory;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory8 = slimTableFactoryTest0.getslimTableFactory();
        fitnesse.testsystems.slim.Table table9 = null;
        slimTableFactoryTest0.table = table9;
        fitnesse.testsystems.slim.Table table11 = null;
        slimTableFactoryTest0.settable(table11);
        fitnesse.testsystems.slim.Table table13 = slimTableFactoryTest0.gettable();
        java.util.Map<java.lang.String, java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable>> strMap14 = slimTableFactoryTest0.map;
        java.util.Map<java.lang.String, java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable>> strMap15 = slimTableFactoryTest0.map;
        java.util.Map<java.lang.String, java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable>> strMap16 = slimTableFactoryTest0.map;
        org.junit.Assert.assertNull(strMap1);
        org.junit.Assert.assertNull(strMap6);
        org.junit.Assert.assertNull(slimTableFactory7);
        org.junit.Assert.assertNull(slimTableFactory8);
        org.junit.Assert.assertNull(table13);
        org.junit.Assert.assertNull(strMap14);
        org.junit.Assert.assertNull(strMap15);
        org.junit.Assert.assertNull(strMap16);
    }

    @Test
    public void test30089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest60.test30089");
        fitnesse.testsystems.slim.tables.SlimTableFactoryTest slimTableFactoryTest0 = new fitnesse.testsystems.slim.tables.SlimTableFactoryTest();
        fitnesse.testsystems.slim.Table table1 = slimTableFactoryTest0.gettable();
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory2 = slimTableFactoryTest0.slimTableFactory;
        fitnesse.testsystems.slim.Table table3 = null;
        slimTableFactoryTest0.settable(table3);
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory5 = null;
        slimTableFactoryTest0.setslimTableFactory(slimTableFactory5);
        fitnesse.testsystems.slim.Table table7 = null;
        slimTableFactoryTest0.settable(table7);
        fitnesse.testsystems.slim.Table table9 = null;
        slimTableFactoryTest0.settable(table9);
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory11 = slimTableFactoryTest0.slimTableFactory;
        fitnesse.testsystems.slim.Table table12 = slimTableFactoryTest0.table;
        fitnesse.testsystems.slim.Table table13 = null;
        slimTableFactoryTest0.table = table13;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory15 = null;
        slimTableFactoryTest0.slimTableFactory = slimTableFactory15;
        fitnesse.testsystems.slim.Table table17 = slimTableFactoryTest0.gettable();
        fitnesse.testsystems.slim.Table table18 = null;
        slimTableFactoryTest0.settable(table18);
        org.junit.Assert.assertNull(table1);
        org.junit.Assert.assertNull(slimTableFactory2);
        org.junit.Assert.assertNull(slimTableFactory11);
        org.junit.Assert.assertNull(table12);
        org.junit.Assert.assertNull(table17);
    }

    @Test
    public void test30090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest60.test30090");
        fitnesse.testsystems.slim.tables.SlimTableFactoryTest slimTableFactoryTest0 = new fitnesse.testsystems.slim.tables.SlimTableFactoryTest();
        java.util.Map<java.lang.String, java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable>> strMap1 = slimTableFactoryTest0.map;
        fitnesse.testsystems.slim.Table table2 = null;
        slimTableFactoryTest0.settable(table2);
        fitnesse.testsystems.slim.Table table4 = slimTableFactoryTest0.gettable();
        fitnesse.testsystems.slim.Table table5 = null;
        slimTableFactoryTest0.table = table5;
        fitnesse.testsystems.slim.Table table7 = null;
        slimTableFactoryTest0.table = table7;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory9 = slimTableFactoryTest0.slimTableFactory;
        fitnesse.testsystems.slim.Table table10 = slimTableFactoryTest0.gettable();
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory11 = null;
        slimTableFactoryTest0.slimTableFactory = slimTableFactory11;
        // The following exception was thrown during execution in test generation
        try {
            slimTableFactoryTest0.checkTableTypeDefinesIgnoredIfDifferentSpecified();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(strMap1);
        org.junit.Assert.assertNull(table4);
        org.junit.Assert.assertNull(slimTableFactory9);
        org.junit.Assert.assertNull(table10);
    }

    @Test
    public void test30091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest60.test30091");
        fitnesse.testsystems.slim.tables.SlimTableFactoryTest slimTableFactoryTest0 = new fitnesse.testsystems.slim.tables.SlimTableFactoryTest();
        fitnesse.testsystems.slim.Table table1 = slimTableFactoryTest0.gettable();
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory2 = slimTableFactoryTest0.slimTableFactory;
        fitnesse.testsystems.slim.Table table3 = null;
        slimTableFactoryTest0.settable(table3);
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory5 = slimTableFactoryTest0.getslimTableFactory();
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory6 = slimTableFactoryTest0.slimTableFactory;
        fitnesse.testsystems.slim.Table table7 = slimTableFactoryTest0.gettable();
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory8 = null;
        slimTableFactoryTest0.setslimTableFactory(slimTableFactory8);
        fitnesse.testsystems.slim.Table table10 = slimTableFactoryTest0.table;
        fitnesse.testsystems.slim.Table table11 = null;
        slimTableFactoryTest0.table = table11;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory13 = slimTableFactoryTest0.slimTableFactory;
        // The following exception was thrown during execution in test generation
        try {
            slimTableFactoryTest0.addTableTypeImport("", "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(table1);
        org.junit.Assert.assertNull(slimTableFactory2);
        org.junit.Assert.assertNull(slimTableFactory5);
        org.junit.Assert.assertNull(slimTableFactory6);
        org.junit.Assert.assertNull(table7);
        org.junit.Assert.assertNull(table10);
        org.junit.Assert.assertNull(slimTableFactory13);
    }

    @Test
    public void test30092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest60.test30092");
        fitnesse.testsystems.slim.tables.SlimTableFactoryTest slimTableFactoryTest0 = new fitnesse.testsystems.slim.tables.SlimTableFactoryTest();
        fitnesse.testsystems.slim.Table table1 = slimTableFactoryTest0.gettable();
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory2 = null;
        slimTableFactoryTest0.slimTableFactory = slimTableFactory2;
        java.util.Map<java.lang.String, java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable>> strMap4 = slimTableFactoryTest0.getmap();
        fitnesse.testsystems.slim.Table table5 = slimTableFactoryTest0.gettable();
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory6 = null;
        slimTableFactoryTest0.setslimTableFactory(slimTableFactory6);
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory8 = slimTableFactoryTest0.getslimTableFactory();
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory9 = slimTableFactoryTest0.slimTableFactory;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory10 = slimTableFactoryTest0.slimTableFactory;
        java.util.Map<java.lang.String, java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable>> strMap11 = slimTableFactoryTest0.getmap();
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory12 = slimTableFactoryTest0.getslimTableFactory();
        org.junit.Assert.assertNull(table1);
        org.junit.Assert.assertNull(strMap4);
        org.junit.Assert.assertNull(table5);
        org.junit.Assert.assertNull(slimTableFactory8);
        org.junit.Assert.assertNull(slimTableFactory9);
        org.junit.Assert.assertNull(slimTableFactory10);
        org.junit.Assert.assertNull(strMap11);
        org.junit.Assert.assertNull(slimTableFactory12);
    }

    @Test
    public void test30093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest60.test30093");
        fitnesse.testsystems.slim.tables.SlimTableFactoryTest slimTableFactoryTest0 = new fitnesse.testsystems.slim.tables.SlimTableFactoryTest();
        java.util.Map<java.lang.String, java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable>> strMap1 = slimTableFactoryTest0.map;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory2 = null;
        slimTableFactoryTest0.setslimTableFactory(slimTableFactory2);
        fitnesse.testsystems.slim.Table table4 = slimTableFactoryTest0.table;
        fitnesse.testsystems.slim.Table table5 = null;
        slimTableFactoryTest0.table = table5;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory7 = null;
        slimTableFactoryTest0.slimTableFactory = slimTableFactory7;
        java.util.Map<java.lang.String, java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable>> strMap9 = slimTableFactoryTest0.map;
        fitnesse.testsystems.slim.Table table10 = null;
        slimTableFactoryTest0.settable(table10);
        fitnesse.testsystems.slim.Table table12 = null;
        slimTableFactoryTest0.table = table12;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory14 = slimTableFactoryTest0.getslimTableFactory();
        org.junit.Assert.assertNull(strMap1);
        org.junit.Assert.assertNull(table4);
        org.junit.Assert.assertNull(strMap9);
        org.junit.Assert.assertNull(slimTableFactory14);
    }
}

