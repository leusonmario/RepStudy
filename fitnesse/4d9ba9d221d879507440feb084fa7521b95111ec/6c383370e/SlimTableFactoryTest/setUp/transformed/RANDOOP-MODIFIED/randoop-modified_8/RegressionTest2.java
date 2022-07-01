import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest2 {

    public static boolean debug = false;

    @Test
    public void test01001() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01001");
        fitnesse.testsystems.slim.tables.SlimTableFactoryTest slimTableFactoryTest0 = new fitnesse.testsystems.slim.tables.SlimTableFactoryTest();
        fitnesse.testsystems.slim.Table table1 = slimTableFactoryTest0.table;
        java.util.Map<java.lang.String, java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable>> strMap2 = slimTableFactoryTest0.getmap();
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory3 = null;
        slimTableFactoryTest0.slimTableFactory = slimTableFactory3;
        fitnesse.testsystems.slim.Table table5 = slimTableFactoryTest0.table;
        java.util.Map<java.lang.String, java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable>> strMap6 = slimTableFactoryTest0.map;
        // The following exception was thrown during execution in test generation
        try {
            slimTableFactoryTest0.checkTableTypeDefineUsedForTable();
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
    public void test01002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01002");
        fitnesse.testsystems.slim.tables.SlimTableFactoryTest slimTableFactoryTest0 = new fitnesse.testsystems.slim.tables.SlimTableFactoryTest();
        fitnesse.testsystems.slim.Table table1 = slimTableFactoryTest0.table;
        java.util.Map<java.lang.String, java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable>> strMap2 = slimTableFactoryTest0.getmap();
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory3 = null;
        slimTableFactoryTest0.slimTableFactory = slimTableFactory3;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory5 = slimTableFactoryTest0.slimTableFactory;
        fitnesse.testsystems.slim.Table table6 = slimTableFactoryTest0.gettable();
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory7 = null;
        slimTableFactoryTest0.slimTableFactory = slimTableFactory7;
        // The following exception was thrown during execution in test generation
        try {
            slimTableFactoryTest0.shouldCreateCorrectSlimTableForTablesType();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(table1);
        org.junit.Assert.assertNull(strMap2);
        org.junit.Assert.assertNull(slimTableFactory5);
        org.junit.Assert.assertNull(table6);
    }

    @Test
    public void test01003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01003");
        fitnesse.testsystems.slim.tables.SlimTableFactoryTest slimTableFactoryTest0 = new fitnesse.testsystems.slim.tables.SlimTableFactoryTest();
        fitnesse.testsystems.slim.Table table1 = null;
        slimTableFactoryTest0.table = table1;
        fitnesse.testsystems.slim.Table table3 = slimTableFactoryTest0.table;
        fitnesse.testsystems.slim.Table table4 = slimTableFactoryTest0.gettable();
        // The following exception was thrown during execution in test generation
        try {
            slimTableFactoryTest0.checkTableTypeDefinesIgnoredIfDifferentSpecified();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(table3);
        org.junit.Assert.assertNull(table4);
    }

    @Test
    public void test01004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01004");
        fitnesse.testsystems.slim.tables.SlimTableFactoryTest slimTableFactoryTest0 = new fitnesse.testsystems.slim.tables.SlimTableFactoryTest();
        fitnesse.testsystems.slim.Table table1 = null;
        slimTableFactoryTest0.table = table1;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory3 = null;
        slimTableFactoryTest0.slimTableFactory = slimTableFactory3;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory5 = slimTableFactoryTest0.getslimTableFactory();
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory6 = null;
        slimTableFactoryTest0.setslimTableFactory(slimTableFactory6);
        fitnesse.testsystems.slim.Table table8 = null;
        slimTableFactoryTest0.settable(table8);
        java.util.Map<java.lang.String, java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable>> strMap10 = slimTableFactoryTest0.getmap();
        fitnesse.testsystems.slim.Table table11 = null;
        slimTableFactoryTest0.settable(table11);
        java.util.Map<java.lang.String, java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable>> strMap13 = slimTableFactoryTest0.map;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory14 = slimTableFactoryTest0.getslimTableFactory();
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory15 = slimTableFactoryTest0.slimTableFactory;
        // The following exception was thrown during execution in test generation
        try {
            slimTableFactoryTest0.checkTableTypeDefineUsedForTable();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(slimTableFactory5);
        org.junit.Assert.assertNull(strMap10);
        org.junit.Assert.assertNull(strMap13);
        org.junit.Assert.assertNull(slimTableFactory14);
        org.junit.Assert.assertNull(slimTableFactory15);
    }

    @Test
    public void test01005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01005");
        fitnesse.testsystems.slim.tables.SlimTableFactoryTest slimTableFactoryTest0 = new fitnesse.testsystems.slim.tables.SlimTableFactoryTest();
        fitnesse.testsystems.slim.Table table1 = null;
        slimTableFactoryTest0.table = table1;
        fitnesse.testsystems.slim.Table table3 = null;
        slimTableFactoryTest0.settable(table3);
        fitnesse.testsystems.slim.Table table5 = null;
        slimTableFactoryTest0.settable(table5);
        fitnesse.testsystems.slim.Table table7 = slimTableFactoryTest0.table;
        fitnesse.testsystems.slim.Table table8 = null;
        slimTableFactoryTest0.settable(table8);
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory10 = null;
        slimTableFactoryTest0.slimTableFactory = slimTableFactory10;
        // The following exception was thrown during execution in test generation
        try {
            slimTableFactoryTest0.addTableTypeImport("hi!", "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(table7);
    }

    @Test
    public void test01006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01006");
        fitnesse.testsystems.slim.tables.SlimTableFactoryTest slimTableFactoryTest0 = new fitnesse.testsystems.slim.tables.SlimTableFactoryTest();
        fitnesse.testsystems.slim.Table table1 = null;
        slimTableFactoryTest0.table = table1;
        fitnesse.testsystems.slim.Table table3 = slimTableFactoryTest0.table;
        fitnesse.testsystems.slim.Table table4 = slimTableFactoryTest0.gettable();
        java.util.Map<java.lang.String, java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable>> strMap5 = slimTableFactoryTest0.getmap();
        java.util.Map<java.lang.String, java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable>> strMap6 = slimTableFactoryTest0.map;
        fitnesse.testsystems.slim.Table table7 = slimTableFactoryTest0.table;
        fitnesse.testsystems.slim.Table table8 = slimTableFactoryTest0.gettable();
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory9 = slimTableFactoryTest0.slimTableFactory;
        // The following exception was thrown during execution in test generation
        try {
            slimTableFactoryTest0.commentTableShouldReturnNull();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(table3);
        org.junit.Assert.assertNull(table4);
        org.junit.Assert.assertNull(strMap5);
        org.junit.Assert.assertNull(strMap6);
        org.junit.Assert.assertNull(table7);
        org.junit.Assert.assertNull(table8);
        org.junit.Assert.assertNull(slimTableFactory9);
    }

    @Test
    public void test01007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01007");
        fitnesse.testsystems.slim.tables.SlimTableFactoryTest slimTableFactoryTest0 = new fitnesse.testsystems.slim.tables.SlimTableFactoryTest();
        fitnesse.testsystems.slim.Table table1 = null;
        slimTableFactoryTest0.table = table1;
        fitnesse.testsystems.slim.Table table3 = null;
        slimTableFactoryTest0.settable(table3);
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory5 = null;
        slimTableFactoryTest0.slimTableFactory = slimTableFactory5;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory7 = null;
        slimTableFactoryTest0.slimTableFactory = slimTableFactory7;
        fitnesse.testsystems.slim.Table table9 = null;
        slimTableFactoryTest0.table = table9;
        // The following exception was thrown during execution in test generation
        try {
            slimTableFactoryTest0.shouldCreateCorrectSlimTableForTablesType();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test01008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01008");
        fitnesse.testsystems.slim.tables.SlimTableFactoryTest slimTableFactoryTest0 = new fitnesse.testsystems.slim.tables.SlimTableFactoryTest();
        fitnesse.testsystems.slim.Table table1 = null;
        slimTableFactoryTest0.table = table1;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory3 = slimTableFactoryTest0.slimTableFactory;
        java.util.Map<java.lang.String, java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable>> strMap4 = slimTableFactoryTest0.getmap();
        fitnesse.testsystems.slim.Table table5 = null;
        slimTableFactoryTest0.settable(table5);
        fitnesse.testsystems.slim.Table table7 = null;
        slimTableFactoryTest0.table = table7;
        fitnesse.testsystems.slim.Table table9 = slimTableFactoryTest0.table;
        fitnesse.testsystems.slim.Table table10 = null;
        slimTableFactoryTest0.settable(table10);
        fitnesse.testsystems.slim.Table table12 = null;
        slimTableFactoryTest0.settable(table12);
        java.util.Map<java.lang.String, java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable>> strMap14 = slimTableFactoryTest0.map;
        fitnesse.testsystems.slim.Table table15 = null;
        slimTableFactoryTest0.table = table15;
        java.lang.Class<?> wildcardClass17 = slimTableFactoryTest0.getClass();
        org.junit.Assert.assertNull(slimTableFactory3);
        org.junit.Assert.assertNull(strMap4);
        org.junit.Assert.assertNull(table9);
        org.junit.Assert.assertNull(strMap14);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test01009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01009");
        fitnesse.testsystems.slim.tables.SlimTableFactoryTest slimTableFactoryTest0 = new fitnesse.testsystems.slim.tables.SlimTableFactoryTest();
        fitnesse.testsystems.slim.Table table1 = null;
        slimTableFactoryTest0.table = table1;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory3 = slimTableFactoryTest0.slimTableFactory;
        java.util.Map<java.lang.String, java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable>> strMap4 = slimTableFactoryTest0.getmap();
        fitnesse.testsystems.slim.Table table5 = null;
        slimTableFactoryTest0.settable(table5);
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory7 = null;
        slimTableFactoryTest0.setslimTableFactory(slimTableFactory7);
        fitnesse.testsystems.slim.Table table9 = slimTableFactoryTest0.table;
        fitnesse.testsystems.slim.Table table10 = slimTableFactoryTest0.gettable();
        fitnesse.testsystems.slim.Table table11 = slimTableFactoryTest0.table;
        // The following exception was thrown during execution in test generation
        try {
            slimTableFactoryTest0.shouldCreateCorrectSlimTableForTablesType();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(slimTableFactory3);
        org.junit.Assert.assertNull(strMap4);
        org.junit.Assert.assertNull(table9);
        org.junit.Assert.assertNull(table10);
        org.junit.Assert.assertNull(table11);
    }

    @Test
    public void test01010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01010");
        fitnesse.testsystems.slim.tables.SlimTableFactoryTest slimTableFactoryTest0 = new fitnesse.testsystems.slim.tables.SlimTableFactoryTest();
        fitnesse.testsystems.slim.Table table1 = slimTableFactoryTest0.table;
        java.util.Map<java.lang.String, java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable>> strMap2 = slimTableFactoryTest0.getmap();
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory3 = null;
        slimTableFactoryTest0.slimTableFactory = slimTableFactory3;
        fitnesse.testsystems.slim.Table table5 = slimTableFactoryTest0.table;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory6 = slimTableFactoryTest0.slimTableFactory;
        fitnesse.testsystems.slim.Table table7 = null;
        slimTableFactoryTest0.settable(table7);
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
        org.junit.Assert.assertNull(slimTableFactory6);
    }

    @Test
    public void test01011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01011");
        fitnesse.testsystems.slim.tables.SlimTableFactoryTest slimTableFactoryTest0 = new fitnesse.testsystems.slim.tables.SlimTableFactoryTest();
        fitnesse.testsystems.slim.Table table1 = null;
        slimTableFactoryTest0.table = table1;
        fitnesse.testsystems.slim.Table table3 = null;
        slimTableFactoryTest0.settable(table3);
        fitnesse.testsystems.slim.Table table5 = null;
        slimTableFactoryTest0.settable(table5);
        fitnesse.testsystems.slim.Table table7 = slimTableFactoryTest0.table;
        java.util.Map<java.lang.String, java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable>> strMap8 = slimTableFactoryTest0.getmap();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass9 = strMap8.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(table7);
        org.junit.Assert.assertNull(strMap8);
    }

    @Test
    public void test01012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01012");
        fitnesse.testsystems.slim.tables.SlimTableFactoryTest slimTableFactoryTest0 = new fitnesse.testsystems.slim.tables.SlimTableFactoryTest();
        fitnesse.testsystems.slim.Table table1 = null;
        slimTableFactoryTest0.table = table1;
        fitnesse.testsystems.slim.Table table3 = null;
        slimTableFactoryTest0.settable(table3);
        fitnesse.testsystems.slim.Table table5 = null;
        slimTableFactoryTest0.settable(table5);
        fitnesse.testsystems.slim.Table table7 = slimTableFactoryTest0.table;
        fitnesse.testsystems.slim.Table table8 = null;
        slimTableFactoryTest0.settable(table8);
        java.util.Map<java.lang.String, java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable>> strMap10 = slimTableFactoryTest0.getmap();
        fitnesse.testsystems.slim.Table table11 = null;
        slimTableFactoryTest0.table = table11;
        java.util.Map<java.lang.String, java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable>> strMap13 = slimTableFactoryTest0.getmap();
        fitnesse.testsystems.slim.Table table14 = null;
        slimTableFactoryTest0.table = table14;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory16 = null;
        slimTableFactoryTest0.setslimTableFactory(slimTableFactory16);
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory18 = null;
        slimTableFactoryTest0.setslimTableFactory(slimTableFactory18);
        // The following exception was thrown during execution in test generation
        try {
            slimTableFactoryTest0.commentTableShouldReturnNull();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(table7);
        org.junit.Assert.assertNull(strMap10);
        org.junit.Assert.assertNull(strMap13);
    }

    @Test
    public void test01013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01013");
        fitnesse.testsystems.slim.tables.SlimTableFactoryTest slimTableFactoryTest0 = new fitnesse.testsystems.slim.tables.SlimTableFactoryTest();
        fitnesse.testsystems.slim.Table table1 = null;
        slimTableFactoryTest0.table = table1;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory3 = slimTableFactoryTest0.getslimTableFactory();
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory4 = slimTableFactoryTest0.getslimTableFactory();
        fitnesse.testsystems.slim.Table table5 = null;
        slimTableFactoryTest0.table = table5;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory7 = slimTableFactoryTest0.slimTableFactory;
        java.util.Map<java.lang.String, java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable>> strMap8 = slimTableFactoryTest0.map;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory9 = null;
        slimTableFactoryTest0.slimTableFactory = slimTableFactory9;
        // The following exception was thrown during execution in test generation
        try {
            slimTableFactoryTest0.checkTableTypeDefinesIgnoredIfDifferentSpecified();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(slimTableFactory3);
        org.junit.Assert.assertNull(slimTableFactory4);
        org.junit.Assert.assertNull(slimTableFactory7);
        org.junit.Assert.assertNull(strMap8);
    }

    @Test
    public void test01014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01014");
        fitnesse.testsystems.slim.tables.SlimTableFactoryTest slimTableFactoryTest0 = new fitnesse.testsystems.slim.tables.SlimTableFactoryTest();
        fitnesse.testsystems.slim.Table table1 = null;
        slimTableFactoryTest0.table = table1;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory3 = slimTableFactoryTest0.slimTableFactory;
        java.util.Map<java.lang.String, java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable>> strMap4 = slimTableFactoryTest0.getmap();
        fitnesse.testsystems.slim.Table table5 = null;
        slimTableFactoryTest0.settable(table5);
        fitnesse.testsystems.slim.Table table7 = null;
        slimTableFactoryTest0.table = table7;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory9 = null;
        slimTableFactoryTest0.slimTableFactory = slimTableFactory9;
        fitnesse.testsystems.slim.Table table11 = null;
        slimTableFactoryTest0.table = table11;
        fitnesse.testsystems.slim.Table table13 = null;
        slimTableFactoryTest0.table = table13;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory15 = null;
        slimTableFactoryTest0.slimTableFactory = slimTableFactory15;
        fitnesse.testsystems.slim.Table table17 = slimTableFactoryTest0.table;
        // The following exception was thrown during execution in test generation
        try {
            slimTableFactoryTest0.shouldCreateCorrectSlimTableForTablesType();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(slimTableFactory3);
        org.junit.Assert.assertNull(strMap4);
        org.junit.Assert.assertNull(table17);
    }

    @Test
    public void test01015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01015");
        fitnesse.testsystems.slim.tables.SlimTableFactoryTest slimTableFactoryTest0 = new fitnesse.testsystems.slim.tables.SlimTableFactoryTest();
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory1 = slimTableFactoryTest0.slimTableFactory;
        fitnesse.testsystems.slim.Table table2 = slimTableFactoryTest0.gettable();
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory3 = null;
        slimTableFactoryTest0.slimTableFactory = slimTableFactory3;
        fitnesse.testsystems.slim.Table table5 = null;
        slimTableFactoryTest0.settable(table5);
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory7 = slimTableFactoryTest0.slimTableFactory;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory8 = slimTableFactoryTest0.getslimTableFactory();
        fitnesse.testsystems.slim.Table table9 = slimTableFactoryTest0.gettable();
        fitnesse.testsystems.slim.Table table10 = null;
        slimTableFactoryTest0.settable(table10);
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory12 = null;
        slimTableFactoryTest0.setslimTableFactory(slimTableFactory12);
        // The following exception was thrown during execution in test generation
        try {
            slimTableFactoryTest0.checkTableTypeDefinesIgnoredIfDifferentSpecified();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(slimTableFactory1);
        org.junit.Assert.assertNull(table2);
        org.junit.Assert.assertNull(slimTableFactory7);
        org.junit.Assert.assertNull(slimTableFactory8);
        org.junit.Assert.assertNull(table9);
    }

    @Test
    public void test01016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01016");
        fitnesse.testsystems.slim.tables.SlimTableFactoryTest slimTableFactoryTest0 = new fitnesse.testsystems.slim.tables.SlimTableFactoryTest();
        fitnesse.testsystems.slim.Table table1 = null;
        slimTableFactoryTest0.table = table1;
        fitnesse.testsystems.slim.Table table3 = null;
        slimTableFactoryTest0.settable(table3);
        fitnesse.testsystems.slim.Table table5 = null;
        slimTableFactoryTest0.settable(table5);
        fitnesse.testsystems.slim.Table table7 = slimTableFactoryTest0.table;
        fitnesse.testsystems.slim.Table table8 = null;
        slimTableFactoryTest0.settable(table8);
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory10 = null;
        slimTableFactoryTest0.slimTableFactory = slimTableFactory10;
        fitnesse.testsystems.slim.Table table12 = null;
        slimTableFactoryTest0.settable(table12);
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory14 = null;
        slimTableFactoryTest0.setslimTableFactory(slimTableFactory14);
        java.lang.Class<?> wildcardClass16 = slimTableFactoryTest0.getClass();
        org.junit.Assert.assertNull(table7);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test01017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01017");
        fitnesse.testsystems.slim.tables.SlimTableFactoryTest slimTableFactoryTest0 = new fitnesse.testsystems.slim.tables.SlimTableFactoryTest();
        fitnesse.testsystems.slim.Table table1 = null;
        slimTableFactoryTest0.table = table1;
        fitnesse.testsystems.slim.Table table3 = null;
        slimTableFactoryTest0.settable(table3);
        java.util.Map<java.lang.String, java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable>> strMap5 = slimTableFactoryTest0.map;
        java.util.Map<java.lang.String, java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable>> strMap6 = slimTableFactoryTest0.getmap();
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory7 = slimTableFactoryTest0.slimTableFactory;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory8 = slimTableFactoryTest0.slimTableFactory;
        java.lang.Class<?> wildcardClass9 = slimTableFactoryTest0.getClass();
        org.junit.Assert.assertNull(strMap5);
        org.junit.Assert.assertNull(strMap6);
        org.junit.Assert.assertNull(slimTableFactory7);
        org.junit.Assert.assertNull(slimTableFactory8);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test01018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01018");
        fitnesse.testsystems.slim.tables.SlimTableFactoryTest slimTableFactoryTest0 = new fitnesse.testsystems.slim.tables.SlimTableFactoryTest();
        fitnesse.testsystems.slim.Table table1 = null;
        slimTableFactoryTest0.table = table1;
        fitnesse.testsystems.slim.Table table3 = null;
        slimTableFactoryTest0.settable(table3);
        fitnesse.testsystems.slim.Table table5 = null;
        slimTableFactoryTest0.settable(table5);
        fitnesse.testsystems.slim.Table table7 = slimTableFactoryTest0.table;
        fitnesse.testsystems.slim.Table table8 = null;
        slimTableFactoryTest0.settable(table8);
        java.util.Map<java.lang.String, java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable>> strMap10 = slimTableFactoryTest0.getmap();
        fitnesse.testsystems.slim.Table table11 = null;
        slimTableFactoryTest0.table = table11;
        fitnesse.testsystems.slim.Table table13 = slimTableFactoryTest0.table;
        fitnesse.testsystems.slim.Table table14 = null;
        slimTableFactoryTest0.settable(table14);
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory16 = null;
        slimTableFactoryTest0.setslimTableFactory(slimTableFactory16);
        fitnesse.testsystems.slim.Table table18 = slimTableFactoryTest0.gettable();
        fitnesse.testsystems.slim.Table table19 = null;
        slimTableFactoryTest0.table = table19;
        java.lang.Class<?> wildcardClass21 = slimTableFactoryTest0.getClass();
        org.junit.Assert.assertNull(table7);
        org.junit.Assert.assertNull(strMap10);
        org.junit.Assert.assertNull(table13);
        org.junit.Assert.assertNull(table18);
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test01019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01019");
        fitnesse.testsystems.slim.tables.SlimTableFactoryTest slimTableFactoryTest0 = new fitnesse.testsystems.slim.tables.SlimTableFactoryTest();
        fitnesse.testsystems.slim.Table table1 = null;
        slimTableFactoryTest0.table = table1;
        fitnesse.testsystems.slim.Table table3 = slimTableFactoryTest0.table;
        fitnesse.testsystems.slim.Table table4 = slimTableFactoryTest0.gettable();
        java.util.Map<java.lang.String, java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable>> strMap5 = slimTableFactoryTest0.getmap();
        fitnesse.testsystems.slim.Table table6 = null;
        slimTableFactoryTest0.settable(table6);
        // The following exception was thrown during execution in test generation
        try {
            slimTableFactoryTest0.addTableTypeImport("hi!", "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(table3);
        org.junit.Assert.assertNull(table4);
        org.junit.Assert.assertNull(strMap5);
    }

    @Test
    public void test01020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01020");
        fitnesse.testsystems.slim.tables.SlimTableFactoryTest slimTableFactoryTest0 = new fitnesse.testsystems.slim.tables.SlimTableFactoryTest();
        fitnesse.testsystems.slim.Table table1 = null;
        slimTableFactoryTest0.table = table1;
        fitnesse.testsystems.slim.Table table3 = slimTableFactoryTest0.table;
        fitnesse.testsystems.slim.Table table4 = slimTableFactoryTest0.gettable();
        java.util.Map<java.lang.String, java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable>> strMap5 = slimTableFactoryTest0.getmap();
        java.util.Map<java.lang.String, java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable>> strMap6 = slimTableFactoryTest0.map;
        // The following exception was thrown during execution in test generation
        try {
            slimTableFactoryTest0.checkTableTypeDefinesIgnoredIfDifferentSpecified();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(table3);
        org.junit.Assert.assertNull(table4);
        org.junit.Assert.assertNull(strMap5);
        org.junit.Assert.assertNull(strMap6);
    }

    @Test
    public void test01021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01021");
        fitnesse.testsystems.slim.tables.SlimTableFactoryTest slimTableFactoryTest0 = new fitnesse.testsystems.slim.tables.SlimTableFactoryTest();
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory1 = slimTableFactoryTest0.slimTableFactory;
        fitnesse.testsystems.slim.Table table2 = slimTableFactoryTest0.gettable();
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory3 = null;
        slimTableFactoryTest0.slimTableFactory = slimTableFactory3;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory5 = null;
        slimTableFactoryTest0.slimTableFactory = slimTableFactory5;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory7 = null;
        slimTableFactoryTest0.setslimTableFactory(slimTableFactory7);
        fitnesse.testsystems.slim.Table table9 = slimTableFactoryTest0.table;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory10 = slimTableFactoryTest0.slimTableFactory;
        fitnesse.testsystems.slim.Table table11 = null;
        slimTableFactoryTest0.table = table11;
        java.lang.Class<?> wildcardClass13 = slimTableFactoryTest0.getClass();
        org.junit.Assert.assertNull(slimTableFactory1);
        org.junit.Assert.assertNull(table2);
        org.junit.Assert.assertNull(table9);
        org.junit.Assert.assertNull(slimTableFactory10);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test01022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01022");
        fitnesse.testsystems.slim.tables.SlimTableFactoryTest slimTableFactoryTest0 = new fitnesse.testsystems.slim.tables.SlimTableFactoryTest();
        fitnesse.testsystems.slim.Table table1 = null;
        slimTableFactoryTest0.table = table1;
        fitnesse.testsystems.slim.Table table3 = null;
        slimTableFactoryTest0.settable(table3);
        fitnesse.testsystems.slim.Table table5 = null;
        slimTableFactoryTest0.table = table5;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory7 = slimTableFactoryTest0.slimTableFactory;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory8 = slimTableFactoryTest0.slimTableFactory;
        fitnesse.testsystems.slim.Table table9 = slimTableFactoryTest0.gettable();
        fitnesse.testsystems.slim.Table table10 = null;
        slimTableFactoryTest0.table = table10;
        fitnesse.testsystems.slim.Table table12 = null;
        slimTableFactoryTest0.settable(table12);
        java.lang.Class<?> wildcardClass14 = slimTableFactoryTest0.getClass();
        org.junit.Assert.assertNull(slimTableFactory7);
        org.junit.Assert.assertNull(slimTableFactory8);
        org.junit.Assert.assertNull(table9);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test01023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01023");
        fitnesse.testsystems.slim.tables.SlimTableFactoryTest slimTableFactoryTest0 = new fitnesse.testsystems.slim.tables.SlimTableFactoryTest();
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory1 = slimTableFactoryTest0.slimTableFactory;
        fitnesse.testsystems.slim.Table table2 = slimTableFactoryTest0.gettable();
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory3 = null;
        slimTableFactoryTest0.slimTableFactory = slimTableFactory3;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory5 = null;
        slimTableFactoryTest0.slimTableFactory = slimTableFactory5;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory7 = null;
        slimTableFactoryTest0.setslimTableFactory(slimTableFactory7);
        fitnesse.testsystems.slim.Table table9 = slimTableFactoryTest0.table;
        fitnesse.testsystems.slim.Table table10 = slimTableFactoryTest0.gettable();
        java.util.Map<java.lang.String, java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable>> strMap11 = slimTableFactoryTest0.getmap();
        // The following exception was thrown during execution in test generation
        try {
            slimTableFactoryTest0.commentTableShouldReturnNull();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(slimTableFactory1);
        org.junit.Assert.assertNull(table2);
        org.junit.Assert.assertNull(table9);
        org.junit.Assert.assertNull(table10);
        org.junit.Assert.assertNull(strMap11);
    }

    @Test
    public void test01024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01024");
        fitnesse.testsystems.slim.tables.SlimTableFactoryTest slimTableFactoryTest0 = new fitnesse.testsystems.slim.tables.SlimTableFactoryTest();
        fitnesse.testsystems.slim.Table table1 = null;
        slimTableFactoryTest0.table = table1;
        fitnesse.testsystems.slim.Table table3 = slimTableFactoryTest0.table;
        fitnesse.testsystems.slim.Table table4 = slimTableFactoryTest0.gettable();
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory5 = slimTableFactoryTest0.slimTableFactory;
        java.util.Map<java.lang.String, java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable>> strMap6 = slimTableFactoryTest0.map;
        java.lang.Class<?> wildcardClass7 = slimTableFactoryTest0.getClass();
        org.junit.Assert.assertNull(table3);
        org.junit.Assert.assertNull(table4);
        org.junit.Assert.assertNull(slimTableFactory5);
        org.junit.Assert.assertNull(strMap6);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test01025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01025");
        fitnesse.testsystems.slim.tables.SlimTableFactoryTest slimTableFactoryTest0 = new fitnesse.testsystems.slim.tables.SlimTableFactoryTest();
        fitnesse.testsystems.slim.Table table1 = null;
        slimTableFactoryTest0.table = table1;
        fitnesse.testsystems.slim.Table table3 = null;
        slimTableFactoryTest0.settable(table3);
        fitnesse.testsystems.slim.Table table5 = null;
        slimTableFactoryTest0.settable(table5);
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory7 = slimTableFactoryTest0.slimTableFactory;
        java.util.Map<java.lang.String, java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable>> strMap8 = slimTableFactoryTest0.map;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory9 = slimTableFactoryTest0.slimTableFactory;
        fitnesse.testsystems.slim.Table table10 = null;
        slimTableFactoryTest0.settable(table10);
        fitnesse.testsystems.slim.Table table12 = null;
        slimTableFactoryTest0.settable(table12);
        // The following exception was thrown during execution in test generation
        try {
            slimTableFactoryTest0.checkTableTypeDefineUsedForTable();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(slimTableFactory7);
        org.junit.Assert.assertNull(strMap8);
        org.junit.Assert.assertNull(slimTableFactory9);
    }

    @Test
    public void test01026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01026");
        fitnesse.testsystems.slim.tables.SlimTableFactoryTest slimTableFactoryTest0 = new fitnesse.testsystems.slim.tables.SlimTableFactoryTest();
        fitnesse.testsystems.slim.Table table1 = null;
        slimTableFactoryTest0.table = table1;
        fitnesse.testsystems.slim.Table table3 = slimTableFactoryTest0.table;
        fitnesse.testsystems.slim.Table table4 = slimTableFactoryTest0.gettable();
        fitnesse.testsystems.slim.Table table5 = slimTableFactoryTest0.gettable();
        // The following exception was thrown during execution in test generation
        try {
            slimTableFactoryTest0.shouldCreateCorrectSlimTableForTablesType();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(table3);
        org.junit.Assert.assertNull(table4);
        org.junit.Assert.assertNull(table5);
    }

    @Test
    public void test01027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01027");
        fitnesse.testsystems.slim.tables.SlimTableFactoryTest slimTableFactoryTest0 = new fitnesse.testsystems.slim.tables.SlimTableFactoryTest();
        fitnesse.testsystems.slim.Table table1 = slimTableFactoryTest0.table;
        java.util.Map<java.lang.String, java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable>> strMap2 = slimTableFactoryTest0.map;
        fitnesse.testsystems.slim.Table table3 = null;
        slimTableFactoryTest0.table = table3;
        java.util.Map<java.lang.String, java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable>> strMap5 = slimTableFactoryTest0.getmap();
        java.util.Map<java.lang.String, java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable>> strMap6 = slimTableFactoryTest0.getmap();
        fitnesse.testsystems.slim.Table table7 = slimTableFactoryTest0.table;
        fitnesse.testsystems.slim.Table table8 = null;
        slimTableFactoryTest0.settable(table8);
        // The following exception was thrown during execution in test generation
        try {
            slimTableFactoryTest0.addTableTypeImport("", "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(table1);
        org.junit.Assert.assertNull(strMap2);
        org.junit.Assert.assertNull(strMap5);
        org.junit.Assert.assertNull(strMap6);
        org.junit.Assert.assertNull(table7);
    }

    @Test
    public void test01028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01028");
        fitnesse.testsystems.slim.tables.SlimTableFactoryTest slimTableFactoryTest0 = new fitnesse.testsystems.slim.tables.SlimTableFactoryTest();
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory1 = slimTableFactoryTest0.slimTableFactory;
        fitnesse.testsystems.slim.Table table2 = slimTableFactoryTest0.gettable();
        fitnesse.testsystems.slim.Table table3 = null;
        slimTableFactoryTest0.table = table3;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory5 = null;
        slimTableFactoryTest0.setslimTableFactory(slimTableFactory5);
        java.util.Map<java.lang.String, java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable>> strMap7 = slimTableFactoryTest0.map;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory8 = slimTableFactoryTest0.slimTableFactory;
        fitnesse.testsystems.slim.Table table9 = null;
        slimTableFactoryTest0.table = table9;
        java.util.Map<java.lang.String, java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable>> strMap11 = slimTableFactoryTest0.map;
        // The following exception was thrown during execution in test generation
        try {
            slimTableFactoryTest0.checkTableTypeDefineUsedForTable();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(slimTableFactory1);
        org.junit.Assert.assertNull(table2);
        org.junit.Assert.assertNull(strMap7);
        org.junit.Assert.assertNull(slimTableFactory8);
        org.junit.Assert.assertNull(strMap11);
    }

    @Test
    public void test01029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01029");
        fitnesse.testsystems.slim.tables.SlimTableFactoryTest slimTableFactoryTest0 = new fitnesse.testsystems.slim.tables.SlimTableFactoryTest();
        fitnesse.testsystems.slim.Table table1 = null;
        slimTableFactoryTest0.table = table1;
        fitnesse.testsystems.slim.Table table3 = null;
        slimTableFactoryTest0.settable(table3);
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory5 = null;
        slimTableFactoryTest0.slimTableFactory = slimTableFactory5;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory7 = null;
        slimTableFactoryTest0.slimTableFactory = slimTableFactory7;
        fitnesse.testsystems.slim.Table table9 = null;
        slimTableFactoryTest0.settable(table9);
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory11 = null;
        slimTableFactoryTest0.setslimTableFactory(slimTableFactory11);
        // The following exception was thrown during execution in test generation
        try {
            slimTableFactoryTest0.tableTypeStartingWithcommentColonShouldReturnNull();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test01030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01030");
        fitnesse.testsystems.slim.tables.SlimTableFactoryTest slimTableFactoryTest0 = new fitnesse.testsystems.slim.tables.SlimTableFactoryTest();
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory1 = slimTableFactoryTest0.slimTableFactory;
        fitnesse.testsystems.slim.Table table2 = slimTableFactoryTest0.gettable();
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory3 = null;
        slimTableFactoryTest0.slimTableFactory = slimTableFactory3;
        fitnesse.testsystems.slim.Table table5 = null;
        slimTableFactoryTest0.settable(table5);
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory7 = slimTableFactoryTest0.slimTableFactory;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory8 = slimTableFactoryTest0.getslimTableFactory();
        fitnesse.testsystems.slim.Table table9 = slimTableFactoryTest0.gettable();
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory10 = null;
        slimTableFactoryTest0.slimTableFactory = slimTableFactory10;
        java.util.Map<java.lang.String, java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable>> strMap12 = slimTableFactoryTest0.getmap();
        fitnesse.testsystems.slim.Table table13 = null;
        slimTableFactoryTest0.table = table13;
        // The following exception was thrown during execution in test generation
        try {
            slimTableFactoryTest0.checkTableTypeDefineUsedForTable();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(slimTableFactory1);
        org.junit.Assert.assertNull(table2);
        org.junit.Assert.assertNull(slimTableFactory7);
        org.junit.Assert.assertNull(slimTableFactory8);
        org.junit.Assert.assertNull(table9);
        org.junit.Assert.assertNull(strMap12);
    }

    @Test
    public void test01031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01031");
        fitnesse.testsystems.slim.tables.SlimTableFactoryTest slimTableFactoryTest0 = new fitnesse.testsystems.slim.tables.SlimTableFactoryTest();
        fitnesse.testsystems.slim.Table table1 = null;
        slimTableFactoryTest0.table = table1;
        fitnesse.testsystems.slim.Table table3 = null;
        slimTableFactoryTest0.settable(table3);
        java.util.Map<java.lang.String, java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable>> strMap5 = slimTableFactoryTest0.map;
        java.util.Map<java.lang.String, java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable>> strMap6 = slimTableFactoryTest0.getmap();
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory7 = slimTableFactoryTest0.slimTableFactory;
        java.util.Map<java.lang.String, java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable>> strMap8 = slimTableFactoryTest0.map;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory9 = slimTableFactoryTest0.slimTableFactory;
        fitnesse.testsystems.slim.Table table10 = null;
        slimTableFactoryTest0.settable(table10);
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory12 = slimTableFactoryTest0.getslimTableFactory();
        fitnesse.testsystems.slim.Table table13 = null;
        slimTableFactoryTest0.table = table13;
        fitnesse.testsystems.slim.Table table15 = null;
        slimTableFactoryTest0.table = table15;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory17 = slimTableFactoryTest0.slimTableFactory;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass18 = slimTableFactory17.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(strMap5);
        org.junit.Assert.assertNull(strMap6);
        org.junit.Assert.assertNull(slimTableFactory7);
        org.junit.Assert.assertNull(strMap8);
        org.junit.Assert.assertNull(slimTableFactory9);
        org.junit.Assert.assertNull(slimTableFactory12);
        org.junit.Assert.assertNull(slimTableFactory17);
    }

    @Test
    public void test01032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01032");
        fitnesse.testsystems.slim.tables.SlimTableFactoryTest slimTableFactoryTest0 = new fitnesse.testsystems.slim.tables.SlimTableFactoryTest();
        fitnesse.testsystems.slim.Table table1 = null;
        slimTableFactoryTest0.table = table1;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory3 = slimTableFactoryTest0.slimTableFactory;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory4 = slimTableFactoryTest0.slimTableFactory;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory5 = slimTableFactoryTest0.slimTableFactory;
        java.util.Map<java.lang.String, java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable>> strMap6 = slimTableFactoryTest0.getmap();
        // The following exception was thrown during execution in test generation
        try {
            slimTableFactoryTest0.checkTableTypeDefinesIgnoredIfDifferentSpecified();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(slimTableFactory3);
        org.junit.Assert.assertNull(slimTableFactory4);
        org.junit.Assert.assertNull(slimTableFactory5);
        org.junit.Assert.assertNull(strMap6);
    }

    @Test
    public void test01033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01033");
        fitnesse.testsystems.slim.tables.SlimTableFactoryTest slimTableFactoryTest0 = new fitnesse.testsystems.slim.tables.SlimTableFactoryTest();
        fitnesse.testsystems.slim.Table table1 = null;
        slimTableFactoryTest0.table = table1;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory3 = null;
        slimTableFactoryTest0.slimTableFactory = slimTableFactory3;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory5 = slimTableFactoryTest0.getslimTableFactory();
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory6 = null;
        slimTableFactoryTest0.setslimTableFactory(slimTableFactory6);
        fitnesse.testsystems.slim.Table table8 = null;
        slimTableFactoryTest0.settable(table8);
        java.util.Map<java.lang.String, java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable>> strMap10 = slimTableFactoryTest0.getmap();
        java.util.Map<java.lang.String, java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable>> strMap11 = slimTableFactoryTest0.getmap();
        // The following exception was thrown during execution in test generation
        try {
            slimTableFactoryTest0.checkTableTypeDefineUsedForTable();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(slimTableFactory5);
        org.junit.Assert.assertNull(strMap10);
        org.junit.Assert.assertNull(strMap11);
    }

    @Test
    public void test01034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01034");
        fitnesse.testsystems.slim.tables.SlimTableFactoryTest slimTableFactoryTest0 = new fitnesse.testsystems.slim.tables.SlimTableFactoryTest();
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory1 = slimTableFactoryTest0.slimTableFactory;
        fitnesse.testsystems.slim.Table table2 = slimTableFactoryTest0.gettable();
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory3 = null;
        slimTableFactoryTest0.slimTableFactory = slimTableFactory3;
        fitnesse.testsystems.slim.Table table5 = null;
        slimTableFactoryTest0.settable(table5);
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory7 = slimTableFactoryTest0.slimTableFactory;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory8 = slimTableFactoryTest0.getslimTableFactory();
        fitnesse.testsystems.slim.Table table9 = slimTableFactoryTest0.table;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory10 = null;
        slimTableFactoryTest0.setslimTableFactory(slimTableFactory10);
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory12 = null;
        slimTableFactoryTest0.setslimTableFactory(slimTableFactory12);
        // The following exception was thrown during execution in test generation
        try {
            slimTableFactoryTest0.addTableTypeImport("", "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(slimTableFactory1);
        org.junit.Assert.assertNull(table2);
        org.junit.Assert.assertNull(slimTableFactory7);
        org.junit.Assert.assertNull(slimTableFactory8);
        org.junit.Assert.assertNull(table9);
    }

    @Test
    public void test01035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01035");
        fitnesse.testsystems.slim.tables.SlimTableFactoryTest slimTableFactoryTest0 = new fitnesse.testsystems.slim.tables.SlimTableFactoryTest();
        fitnesse.testsystems.slim.Table table1 = null;
        slimTableFactoryTest0.table = table1;
        fitnesse.testsystems.slim.Table table3 = null;
        slimTableFactoryTest0.settable(table3);
        java.util.Map<java.lang.String, java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable>> strMap5 = slimTableFactoryTest0.map;
        java.util.Map<java.lang.String, java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable>> strMap6 = slimTableFactoryTest0.getmap();
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory7 = slimTableFactoryTest0.slimTableFactory;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory8 = slimTableFactoryTest0.slimTableFactory;
        // The following exception was thrown during execution in test generation
        try {
            slimTableFactoryTest0.commentTableShouldReturnNull();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(strMap5);
        org.junit.Assert.assertNull(strMap6);
        org.junit.Assert.assertNull(slimTableFactory7);
        org.junit.Assert.assertNull(slimTableFactory8);
    }

    @Test
    public void test01036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01036");
        fitnesse.testsystems.slim.tables.SlimTableFactoryTest slimTableFactoryTest0 = new fitnesse.testsystems.slim.tables.SlimTableFactoryTest();
        fitnesse.testsystems.slim.Table table1 = null;
        slimTableFactoryTest0.table = table1;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory3 = slimTableFactoryTest0.slimTableFactory;
        java.util.Map<java.lang.String, java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable>> strMap4 = slimTableFactoryTest0.getmap();
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory5 = slimTableFactoryTest0.slimTableFactory;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory6 = slimTableFactoryTest0.getslimTableFactory();
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory7 = null;
        slimTableFactoryTest0.setslimTableFactory(slimTableFactory7);
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory9 = slimTableFactoryTest0.slimTableFactory;
        fitnesse.testsystems.slim.Table table10 = slimTableFactoryTest0.table;
        // The following exception was thrown during execution in test generation
        try {
            slimTableFactoryTest0.addTableTypeImport("", "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(slimTableFactory3);
        org.junit.Assert.assertNull(strMap4);
        org.junit.Assert.assertNull(slimTableFactory5);
        org.junit.Assert.assertNull(slimTableFactory6);
        org.junit.Assert.assertNull(slimTableFactory9);
        org.junit.Assert.assertNull(table10);
    }

    @Test
    public void test01037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01037");
        fitnesse.testsystems.slim.tables.SlimTableFactoryTest slimTableFactoryTest0 = new fitnesse.testsystems.slim.tables.SlimTableFactoryTest();
        fitnesse.testsystems.slim.Table table1 = slimTableFactoryTest0.table;
        java.util.Map<java.lang.String, java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable>> strMap2 = slimTableFactoryTest0.getmap();
        fitnesse.testsystems.slim.Table table3 = null;
        slimTableFactoryTest0.table = table3;
        fitnesse.testsystems.slim.Table table5 = slimTableFactoryTest0.gettable();
        fitnesse.testsystems.slim.Table table6 = null;
        slimTableFactoryTest0.table = table6;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory8 = slimTableFactoryTest0.getslimTableFactory();
        fitnesse.testsystems.slim.Table table9 = null;
        slimTableFactoryTest0.settable(table9);
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory11 = null;
        slimTableFactoryTest0.slimTableFactory = slimTableFactory11;
        java.util.Map<java.lang.String, java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable>> strMap13 = slimTableFactoryTest0.map;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory14 = null;
        slimTableFactoryTest0.slimTableFactory = slimTableFactory14;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory16 = null;
        slimTableFactoryTest0.slimTableFactory = slimTableFactory16;
        java.lang.Class<?> wildcardClass18 = slimTableFactoryTest0.getClass();
        org.junit.Assert.assertNull(table1);
        org.junit.Assert.assertNull(strMap2);
        org.junit.Assert.assertNull(table5);
        org.junit.Assert.assertNull(slimTableFactory8);
        org.junit.Assert.assertNull(strMap13);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test01038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01038");
        fitnesse.testsystems.slim.tables.SlimTableFactoryTest slimTableFactoryTest0 = new fitnesse.testsystems.slim.tables.SlimTableFactoryTest();
        fitnesse.testsystems.slim.Table table1 = slimTableFactoryTest0.table;
        java.util.Map<java.lang.String, java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable>> strMap2 = slimTableFactoryTest0.getmap();
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory3 = slimTableFactoryTest0.slimTableFactory;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory4 = slimTableFactoryTest0.getslimTableFactory();
        java.util.Map<java.lang.String, java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable>> strMap5 = slimTableFactoryTest0.getmap();
        fitnesse.testsystems.slim.Table table6 = null;
        slimTableFactoryTest0.table = table6;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory8 = slimTableFactoryTest0.getslimTableFactory();
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory9 = slimTableFactoryTest0.slimTableFactory;
        // The following exception was thrown during execution in test generation
        try {
            slimTableFactoryTest0.addTableTypeImport("hi!", "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(table1);
        org.junit.Assert.assertNull(strMap2);
        org.junit.Assert.assertNull(slimTableFactory3);
        org.junit.Assert.assertNull(slimTableFactory4);
        org.junit.Assert.assertNull(strMap5);
        org.junit.Assert.assertNull(slimTableFactory8);
        org.junit.Assert.assertNull(slimTableFactory9);
    }

    @Test
    public void test01039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01039");
        fitnesse.testsystems.slim.tables.SlimTableFactoryTest slimTableFactoryTest0 = new fitnesse.testsystems.slim.tables.SlimTableFactoryTest();
        fitnesse.testsystems.slim.Table table1 = null;
        slimTableFactoryTest0.table = table1;
        fitnesse.testsystems.slim.Table table3 = null;
        slimTableFactoryTest0.settable(table3);
        fitnesse.testsystems.slim.Table table5 = null;
        slimTableFactoryTest0.settable(table5);
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory7 = slimTableFactoryTest0.slimTableFactory;
        fitnesse.testsystems.slim.Table table8 = null;
        slimTableFactoryTest0.settable(table8);
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory10 = slimTableFactoryTest0.getslimTableFactory();
        // The following exception was thrown during execution in test generation
        try {
            slimTableFactoryTest0.shouldCreateCorrectSlimTableForTablesType();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(slimTableFactory7);
        org.junit.Assert.assertNull(slimTableFactory10);
    }

    @Test
    public void test01040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01040");
        fitnesse.testsystems.slim.tables.SlimTableFactoryTest slimTableFactoryTest0 = new fitnesse.testsystems.slim.tables.SlimTableFactoryTest();
        fitnesse.testsystems.slim.Table table1 = null;
        slimTableFactoryTest0.table = table1;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory3 = slimTableFactoryTest0.slimTableFactory;
        java.util.Map<java.lang.String, java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable>> strMap4 = slimTableFactoryTest0.getmap();
        fitnesse.testsystems.slim.Table table5 = null;
        slimTableFactoryTest0.settable(table5);
        fitnesse.testsystems.slim.Table table7 = null;
        slimTableFactoryTest0.table = table7;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory9 = null;
        slimTableFactoryTest0.slimTableFactory = slimTableFactory9;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory11 = slimTableFactoryTest0.getslimTableFactory();
        java.util.Map<java.lang.String, java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable>> strMap12 = slimTableFactoryTest0.map;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory13 = null;
        slimTableFactoryTest0.slimTableFactory = slimTableFactory13;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory15 = slimTableFactoryTest0.slimTableFactory;
        // The following exception was thrown during execution in test generation
        try {
            slimTableFactoryTest0.addTableTypeImport("", "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(slimTableFactory3);
        org.junit.Assert.assertNull(strMap4);
        org.junit.Assert.assertNull(slimTableFactory11);
        org.junit.Assert.assertNull(strMap12);
        org.junit.Assert.assertNull(slimTableFactory15);
    }

    @Test
    public void test01041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01041");
        fitnesse.testsystems.slim.tables.SlimTableFactoryTest slimTableFactoryTest0 = new fitnesse.testsystems.slim.tables.SlimTableFactoryTest();
        fitnesse.testsystems.slim.Table table1 = slimTableFactoryTest0.table;
        java.util.Map<java.lang.String, java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable>> strMap2 = slimTableFactoryTest0.getmap();
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory3 = null;
        slimTableFactoryTest0.slimTableFactory = slimTableFactory3;
        fitnesse.testsystems.slim.Table table5 = slimTableFactoryTest0.table;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory6 = null;
        slimTableFactoryTest0.setslimTableFactory(slimTableFactory6);
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory8 = slimTableFactoryTest0.slimTableFactory;
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
        org.junit.Assert.assertNull(slimTableFactory8);
    }

    @Test
    public void test01042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01042");
        fitnesse.testsystems.slim.tables.SlimTableFactoryTest slimTableFactoryTest0 = new fitnesse.testsystems.slim.tables.SlimTableFactoryTest();
        fitnesse.testsystems.slim.Table table1 = null;
        slimTableFactoryTest0.table = table1;
        fitnesse.testsystems.slim.Table table3 = null;
        slimTableFactoryTest0.settable(table3);
        fitnesse.testsystems.slim.Table table5 = null;
        slimTableFactoryTest0.table = table5;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory7 = slimTableFactoryTest0.slimTableFactory;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory8 = slimTableFactoryTest0.slimTableFactory;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory9 = null;
        slimTableFactoryTest0.setslimTableFactory(slimTableFactory9);
        java.lang.Class<?> wildcardClass11 = slimTableFactoryTest0.getClass();
        org.junit.Assert.assertNull(slimTableFactory7);
        org.junit.Assert.assertNull(slimTableFactory8);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test01043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01043");
        fitnesse.testsystems.slim.tables.SlimTableFactoryTest slimTableFactoryTest0 = new fitnesse.testsystems.slim.tables.SlimTableFactoryTest();
        fitnesse.testsystems.slim.Table table1 = null;
        slimTableFactoryTest0.table = table1;
        fitnesse.testsystems.slim.Table table3 = null;
        slimTableFactoryTest0.settable(table3);
        fitnesse.testsystems.slim.Table table5 = null;
        slimTableFactoryTest0.settable(table5);
        fitnesse.testsystems.slim.Table table7 = slimTableFactoryTest0.table;
        fitnesse.testsystems.slim.Table table8 = null;
        slimTableFactoryTest0.settable(table8);
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory10 = null;
        slimTableFactoryTest0.slimTableFactory = slimTableFactory10;
        java.util.Map<java.lang.String, java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable>> strMap12 = slimTableFactoryTest0.map;
        // The following exception was thrown during execution in test generation
        try {
            slimTableFactoryTest0.checkTableTypeDefineUsedForTable();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(table7);
        org.junit.Assert.assertNull(strMap12);
    }

    @Test
    public void test01044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01044");
        fitnesse.testsystems.slim.tables.SlimTableFactoryTest slimTableFactoryTest0 = new fitnesse.testsystems.slim.tables.SlimTableFactoryTest();
        fitnesse.testsystems.slim.Table table1 = null;
        slimTableFactoryTest0.table = table1;
        fitnesse.testsystems.slim.Table table3 = slimTableFactoryTest0.table;
        fitnesse.testsystems.slim.Table table4 = slimTableFactoryTest0.gettable();
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory5 = slimTableFactoryTest0.slimTableFactory;
        java.util.Map<java.lang.String, java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable>> strMap6 = slimTableFactoryTest0.map;
        // The following exception was thrown during execution in test generation
        try {
            slimTableFactoryTest0.commentTableShouldReturnNull();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(table3);
        org.junit.Assert.assertNull(table4);
        org.junit.Assert.assertNull(slimTableFactory5);
        org.junit.Assert.assertNull(strMap6);
    }

    @Test
    public void test01045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01045");
        fitnesse.testsystems.slim.tables.SlimTableFactoryTest slimTableFactoryTest0 = new fitnesse.testsystems.slim.tables.SlimTableFactoryTest();
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory1 = slimTableFactoryTest0.slimTableFactory;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory2 = slimTableFactoryTest0.slimTableFactory;
        fitnesse.testsystems.slim.Table table3 = slimTableFactoryTest0.table;
        fitnesse.testsystems.slim.Table table4 = slimTableFactoryTest0.gettable();
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory5 = null;
        slimTableFactoryTest0.slimTableFactory = slimTableFactory5;
        java.lang.Class<?> wildcardClass7 = slimTableFactoryTest0.getClass();
        org.junit.Assert.assertNull(slimTableFactory1);
        org.junit.Assert.assertNull(slimTableFactory2);
        org.junit.Assert.assertNull(table3);
        org.junit.Assert.assertNull(table4);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test01046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01046");
        fitnesse.testsystems.slim.tables.SlimTableFactoryTest slimTableFactoryTest0 = new fitnesse.testsystems.slim.tables.SlimTableFactoryTest();
        fitnesse.testsystems.slim.Table table1 = null;
        slimTableFactoryTest0.table = table1;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory3 = slimTableFactoryTest0.getslimTableFactory();
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory4 = slimTableFactoryTest0.getslimTableFactory();
        fitnesse.testsystems.slim.Table table5 = null;
        slimTableFactoryTest0.table = table5;
        java.util.Map<java.lang.String, java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable>> strMap7 = slimTableFactoryTest0.map;
        // The following exception was thrown during execution in test generation
        try {
            slimTableFactoryTest0.checkTableTypeDefinesIgnoredIfDifferentSpecified();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(slimTableFactory3);
        org.junit.Assert.assertNull(slimTableFactory4);
        org.junit.Assert.assertNull(strMap7);
    }

    @Test
    public void test01047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01047");
        fitnesse.testsystems.slim.tables.SlimTableFactoryTest slimTableFactoryTest0 = new fitnesse.testsystems.slim.tables.SlimTableFactoryTest();
        fitnesse.testsystems.slim.Table table1 = null;
        slimTableFactoryTest0.table = table1;
        fitnesse.testsystems.slim.Table table3 = null;
        slimTableFactoryTest0.settable(table3);
        fitnesse.testsystems.slim.Table table5 = null;
        slimTableFactoryTest0.settable(table5);
        fitnesse.testsystems.slim.Table table7 = slimTableFactoryTest0.table;
        fitnesse.testsystems.slim.Table table8 = slimTableFactoryTest0.gettable();
        // The following exception was thrown during execution in test generation
        try {
            slimTableFactoryTest0.commentTableShouldReturnNull();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(table7);
        org.junit.Assert.assertNull(table8);
    }

    @Test
    public void test01048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01048");
        fitnesse.testsystems.slim.tables.SlimTableFactoryTest slimTableFactoryTest0 = new fitnesse.testsystems.slim.tables.SlimTableFactoryTest();
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory1 = slimTableFactoryTest0.slimTableFactory;
        fitnesse.testsystems.slim.Table table2 = slimTableFactoryTest0.table;
        java.util.Map<java.lang.String, java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable>> strMap3 = slimTableFactoryTest0.map;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory4 = null;
        slimTableFactoryTest0.slimTableFactory = slimTableFactory4;
        fitnesse.testsystems.slim.Table table6 = null;
        slimTableFactoryTest0.table = table6;
        java.util.Map<java.lang.String, java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable>> strMap8 = slimTableFactoryTest0.getmap();
        java.util.Map<java.lang.String, java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable>> strMap9 = slimTableFactoryTest0.map;
        // The following exception was thrown during execution in test generation
        try {
            slimTableFactoryTest0.tableTypeStartingWithcommentColonShouldReturnNull();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(slimTableFactory1);
        org.junit.Assert.assertNull(table2);
        org.junit.Assert.assertNull(strMap3);
        org.junit.Assert.assertNull(strMap8);
        org.junit.Assert.assertNull(strMap9);
    }

    @Test
    public void test01049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01049");
        fitnesse.testsystems.slim.tables.SlimTableFactoryTest slimTableFactoryTest0 = new fitnesse.testsystems.slim.tables.SlimTableFactoryTest();
        fitnesse.testsystems.slim.Table table1 = null;
        slimTableFactoryTest0.table = table1;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory3 = slimTableFactoryTest0.slimTableFactory;
        java.util.Map<java.lang.String, java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable>> strMap4 = slimTableFactoryTest0.getmap();
        fitnesse.testsystems.slim.Table table5 = null;
        slimTableFactoryTest0.settable(table5);
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory7 = null;
        slimTableFactoryTest0.slimTableFactory = slimTableFactory7;
        java.util.Map<java.lang.String, java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable>> strMap9 = slimTableFactoryTest0.getmap();
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory10 = null;
        slimTableFactoryTest0.slimTableFactory = slimTableFactory10;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory12 = null;
        slimTableFactoryTest0.slimTableFactory = slimTableFactory12;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory14 = slimTableFactoryTest0.slimTableFactory;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory15 = null;
        slimTableFactoryTest0.slimTableFactory = slimTableFactory15;
        // The following exception was thrown during execution in test generation
        try {
            slimTableFactoryTest0.checkTableTypeDefineUsedForTable();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(slimTableFactory3);
        org.junit.Assert.assertNull(strMap4);
        org.junit.Assert.assertNull(strMap9);
        org.junit.Assert.assertNull(slimTableFactory14);
    }

    @Test
    public void test01050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01050");
        fitnesse.testsystems.slim.tables.SlimTableFactoryTest slimTableFactoryTest0 = new fitnesse.testsystems.slim.tables.SlimTableFactoryTest();
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory1 = slimTableFactoryTest0.slimTableFactory;
        fitnesse.testsystems.slim.Table table2 = slimTableFactoryTest0.table;
        java.util.Map<java.lang.String, java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable>> strMap3 = slimTableFactoryTest0.map;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory4 = null;
        slimTableFactoryTest0.slimTableFactory = slimTableFactory4;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory6 = null;
        slimTableFactoryTest0.slimTableFactory = slimTableFactory6;
        // The following exception was thrown during execution in test generation
        try {
            slimTableFactoryTest0.checkTableTypeDefinesIgnoredIfDifferentSpecified();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(slimTableFactory1);
        org.junit.Assert.assertNull(table2);
        org.junit.Assert.assertNull(strMap3);
    }

    @Test
    public void test01051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01051");
        fitnesse.testsystems.slim.tables.SlimTableFactoryTest slimTableFactoryTest0 = new fitnesse.testsystems.slim.tables.SlimTableFactoryTest();
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory1 = slimTableFactoryTest0.slimTableFactory;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory2 = slimTableFactoryTest0.slimTableFactory;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory3 = null;
        slimTableFactoryTest0.slimTableFactory = slimTableFactory3;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory5 = null;
        slimTableFactoryTest0.slimTableFactory = slimTableFactory5;
        // The following exception was thrown during execution in test generation
        try {
            slimTableFactoryTest0.tableTypeStartingWithcommentColonShouldReturnNull();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(slimTableFactory1);
        org.junit.Assert.assertNull(slimTableFactory2);
    }

    @Test
    public void test01052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01052");
        fitnesse.testsystems.slim.tables.SlimTableFactoryTest slimTableFactoryTest0 = new fitnesse.testsystems.slim.tables.SlimTableFactoryTest();
        fitnesse.testsystems.slim.Table table1 = null;
        slimTableFactoryTest0.table = table1;
        fitnesse.testsystems.slim.Table table3 = null;
        slimTableFactoryTest0.settable(table3);
        java.util.Map<java.lang.String, java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable>> strMap5 = slimTableFactoryTest0.map;
        java.util.Map<java.lang.String, java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable>> strMap6 = slimTableFactoryTest0.getmap();
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory7 = slimTableFactoryTest0.slimTableFactory;
        fitnesse.testsystems.slim.Table table8 = slimTableFactoryTest0.table;
        // The following exception was thrown during execution in test generation
        try {
            slimTableFactoryTest0.checkTableTypeDefineUsedForTable();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(strMap5);
        org.junit.Assert.assertNull(strMap6);
        org.junit.Assert.assertNull(slimTableFactory7);
        org.junit.Assert.assertNull(table8);
    }

    @Test
    public void test01053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01053");
        fitnesse.testsystems.slim.tables.SlimTableFactoryTest slimTableFactoryTest0 = new fitnesse.testsystems.slim.tables.SlimTableFactoryTest();
        fitnesse.testsystems.slim.Table table1 = null;
        slimTableFactoryTest0.table = table1;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory3 = slimTableFactoryTest0.slimTableFactory;
        java.util.Map<java.lang.String, java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable>> strMap4 = slimTableFactoryTest0.getmap();
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory5 = slimTableFactoryTest0.slimTableFactory;
        java.util.Map<java.lang.String, java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable>> strMap6 = slimTableFactoryTest0.getmap();
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory7 = null;
        slimTableFactoryTest0.slimTableFactory = slimTableFactory7;
        java.util.Map<java.lang.String, java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable>> strMap9 = slimTableFactoryTest0.getmap();
        // The following exception was thrown during execution in test generation
        try {
            slimTableFactoryTest0.commentTableShouldReturnNull();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(slimTableFactory3);
        org.junit.Assert.assertNull(strMap4);
        org.junit.Assert.assertNull(slimTableFactory5);
        org.junit.Assert.assertNull(strMap6);
        org.junit.Assert.assertNull(strMap9);
    }

    @Test
    public void test01054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01054");
        fitnesse.testsystems.slim.tables.SlimTableFactoryTest slimTableFactoryTest0 = new fitnesse.testsystems.slim.tables.SlimTableFactoryTest();
        fitnesse.testsystems.slim.Table table1 = null;
        slimTableFactoryTest0.table = table1;
        fitnesse.testsystems.slim.Table table3 = null;
        slimTableFactoryTest0.settable(table3);
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory5 = null;
        slimTableFactoryTest0.slimTableFactory = slimTableFactory5;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory7 = null;
        slimTableFactoryTest0.slimTableFactory = slimTableFactory7;
        fitnesse.testsystems.slim.Table table9 = null;
        slimTableFactoryTest0.table = table9;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory11 = null;
        slimTableFactoryTest0.setslimTableFactory(slimTableFactory11);
        // The following exception was thrown during execution in test generation
        try {
            slimTableFactoryTest0.checkTableTypeDefineUsedForTable();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test01055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01055");
        fitnesse.testsystems.slim.tables.SlimTableFactoryTest slimTableFactoryTest0 = new fitnesse.testsystems.slim.tables.SlimTableFactoryTest();
        fitnesse.testsystems.slim.Table table1 = slimTableFactoryTest0.table;
        java.util.Map<java.lang.String, java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable>> strMap2 = slimTableFactoryTest0.getmap();
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory3 = null;
        slimTableFactoryTest0.slimTableFactory = slimTableFactory3;
        fitnesse.testsystems.slim.Table table5 = slimTableFactoryTest0.gettable();
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory6 = slimTableFactoryTest0.slimTableFactory;
        fitnesse.testsystems.slim.Table table7 = slimTableFactoryTest0.gettable();
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
        org.junit.Assert.assertNull(slimTableFactory6);
        org.junit.Assert.assertNull(table7);
    }

    @Test
    public void test01056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01056");
        fitnesse.testsystems.slim.tables.SlimTableFactoryTest slimTableFactoryTest0 = new fitnesse.testsystems.slim.tables.SlimTableFactoryTest();
        fitnesse.testsystems.slim.Table table1 = null;
        slimTableFactoryTest0.table = table1;
        fitnesse.testsystems.slim.Table table3 = null;
        slimTableFactoryTest0.settable(table3);
        fitnesse.testsystems.slim.Table table5 = null;
        slimTableFactoryTest0.settable(table5);
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory7 = slimTableFactoryTest0.slimTableFactory;
        java.util.Map<java.lang.String, java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable>> strMap8 = slimTableFactoryTest0.map;
        fitnesse.testsystems.slim.Table table9 = slimTableFactoryTest0.table;
        java.util.Map<java.lang.String, java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable>> strMap10 = slimTableFactoryTest0.getmap();
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory11 = null;
        slimTableFactoryTest0.slimTableFactory = slimTableFactory11;
        fitnesse.testsystems.slim.Table table13 = null;
        slimTableFactoryTest0.table = table13;
        // The following exception was thrown during execution in test generation
        try {
            slimTableFactoryTest0.tableTypeStartingWithcommentColonShouldReturnNull();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(slimTableFactory7);
        org.junit.Assert.assertNull(strMap8);
        org.junit.Assert.assertNull(table9);
        org.junit.Assert.assertNull(strMap10);
    }

    @Test
    public void test01057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01057");
        fitnesse.testsystems.slim.tables.SlimTableFactoryTest slimTableFactoryTest0 = new fitnesse.testsystems.slim.tables.SlimTableFactoryTest();
        fitnesse.testsystems.slim.Table table1 = null;
        slimTableFactoryTest0.table = table1;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory3 = null;
        slimTableFactoryTest0.slimTableFactory = slimTableFactory3;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory5 = slimTableFactoryTest0.getslimTableFactory();
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory6 = null;
        slimTableFactoryTest0.setslimTableFactory(slimTableFactory6);
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory8 = slimTableFactoryTest0.getslimTableFactory();
        fitnesse.testsystems.slim.Table table9 = slimTableFactoryTest0.gettable();
        fitnesse.testsystems.slim.Table table10 = null;
        slimTableFactoryTest0.settable(table10);
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory12 = slimTableFactoryTest0.getslimTableFactory();
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory13 = null;
        slimTableFactoryTest0.slimTableFactory = slimTableFactory13;
        fitnesse.testsystems.slim.Table table15 = null;
        slimTableFactoryTest0.table = table15;
        // The following exception was thrown during execution in test generation
        try {
            slimTableFactoryTest0.shouldCreateCorrectSlimTableForTablesType();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(slimTableFactory5);
        org.junit.Assert.assertNull(slimTableFactory8);
        org.junit.Assert.assertNull(table9);
        org.junit.Assert.assertNull(slimTableFactory12);
    }

    @Test
    public void test01058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01058");
        fitnesse.testsystems.slim.tables.SlimTableFactoryTest slimTableFactoryTest0 = new fitnesse.testsystems.slim.tables.SlimTableFactoryTest();
        fitnesse.testsystems.slim.Table table1 = null;
        slimTableFactoryTest0.table = table1;
        fitnesse.testsystems.slim.Table table3 = null;
        slimTableFactoryTest0.settable(table3);
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory5 = null;
        slimTableFactoryTest0.setslimTableFactory(slimTableFactory5);
        java.util.Map<java.lang.String, java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable>> strMap7 = slimTableFactoryTest0.map;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory8 = null;
        slimTableFactoryTest0.slimTableFactory = slimTableFactory8;
        fitnesse.testsystems.slim.Table table10 = null;
        slimTableFactoryTest0.table = table10;
        // The following exception was thrown during execution in test generation
        try {
            slimTableFactoryTest0.shouldCreateCorrectSlimTableForTablesType();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(strMap7);
    }

    @Test
    public void test01059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01059");
        fitnesse.testsystems.slim.tables.SlimTableFactoryTest slimTableFactoryTest0 = new fitnesse.testsystems.slim.tables.SlimTableFactoryTest();
        fitnesse.testsystems.slim.Table table1 = null;
        slimTableFactoryTest0.table = table1;
        fitnesse.testsystems.slim.Table table3 = slimTableFactoryTest0.gettable();
        fitnesse.testsystems.slim.Table table4 = slimTableFactoryTest0.gettable();
        // The following exception was thrown during execution in test generation
        try {
            slimTableFactoryTest0.shouldCreateCorrectSlimTableForTablesType();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(table3);
        org.junit.Assert.assertNull(table4);
    }

    @Test
    public void test01060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01060");
        fitnesse.testsystems.slim.tables.SlimTableFactoryTest slimTableFactoryTest0 = new fitnesse.testsystems.slim.tables.SlimTableFactoryTest();
        fitnesse.testsystems.slim.Table table1 = null;
        slimTableFactoryTest0.table = table1;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory3 = slimTableFactoryTest0.slimTableFactory;
        fitnesse.testsystems.slim.Table table4 = null;
        slimTableFactoryTest0.settable(table4);
        java.lang.Class<?> wildcardClass6 = slimTableFactoryTest0.getClass();
        org.junit.Assert.assertNull(slimTableFactory3);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test01061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01061");
        fitnesse.testsystems.slim.tables.SlimTableFactoryTest slimTableFactoryTest0 = new fitnesse.testsystems.slim.tables.SlimTableFactoryTest();
        fitnesse.testsystems.slim.Table table1 = null;
        slimTableFactoryTest0.table = table1;
        fitnesse.testsystems.slim.Table table3 = null;
        slimTableFactoryTest0.settable(table3);
        fitnesse.testsystems.slim.Table table5 = null;
        slimTableFactoryTest0.settable(table5);
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory7 = slimTableFactoryTest0.slimTableFactory;
        java.util.Map<java.lang.String, java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable>> strMap8 = slimTableFactoryTest0.map;
        fitnesse.testsystems.slim.Table table9 = slimTableFactoryTest0.table;
        java.util.Map<java.lang.String, java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable>> strMap10 = slimTableFactoryTest0.getmap();
        java.util.Map<java.lang.String, java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable>> strMap11 = slimTableFactoryTest0.map;
        fitnesse.testsystems.slim.Table table12 = slimTableFactoryTest0.table;
        java.util.Map<java.lang.String, java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable>> strMap13 = slimTableFactoryTest0.getmap();
        // The following exception was thrown during execution in test generation
        try {
            slimTableFactoryTest0.tableTypeStartingWithcommentColonShouldReturnNull();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(slimTableFactory7);
        org.junit.Assert.assertNull(strMap8);
        org.junit.Assert.assertNull(table9);
        org.junit.Assert.assertNull(strMap10);
        org.junit.Assert.assertNull(strMap11);
        org.junit.Assert.assertNull(table12);
        org.junit.Assert.assertNull(strMap13);
    }

    @Test
    public void test01062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01062");
        fitnesse.testsystems.slim.tables.SlimTableFactoryTest slimTableFactoryTest0 = new fitnesse.testsystems.slim.tables.SlimTableFactoryTest();
        fitnesse.testsystems.slim.Table table1 = null;
        slimTableFactoryTest0.table = table1;
        fitnesse.testsystems.slim.Table table3 = null;
        slimTableFactoryTest0.settable(table3);
        fitnesse.testsystems.slim.Table table5 = null;
        slimTableFactoryTest0.settable(table5);
        fitnesse.testsystems.slim.Table table7 = slimTableFactoryTest0.table;
        fitnesse.testsystems.slim.Table table8 = null;
        slimTableFactoryTest0.settable(table8);
        java.util.Map<java.lang.String, java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable>> strMap10 = slimTableFactoryTest0.getmap();
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory11 = slimTableFactoryTest0.getslimTableFactory();
        fitnesse.testsystems.slim.Table table12 = slimTableFactoryTest0.table;
        java.util.Map<java.lang.String, java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable>> strMap13 = slimTableFactoryTest0.getmap();
        // The following exception was thrown during execution in test generation
        try {
            slimTableFactoryTest0.checkTableTypeDefineUsedForTable();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(table7);
        org.junit.Assert.assertNull(strMap10);
        org.junit.Assert.assertNull(slimTableFactory11);
        org.junit.Assert.assertNull(table12);
        org.junit.Assert.assertNull(strMap13);
    }

    @Test
    public void test01063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01063");
        fitnesse.testsystems.slim.tables.SlimTableFactoryTest slimTableFactoryTest0 = new fitnesse.testsystems.slim.tables.SlimTableFactoryTest();
        fitnesse.testsystems.slim.Table table1 = null;
        slimTableFactoryTest0.table = table1;
        fitnesse.testsystems.slim.Table table3 = null;
        slimTableFactoryTest0.settable(table3);
        fitnesse.testsystems.slim.Table table5 = null;
        slimTableFactoryTest0.settable(table5);
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory7 = slimTableFactoryTest0.slimTableFactory;
        fitnesse.testsystems.slim.Table table8 = null;
        slimTableFactoryTest0.settable(table8);
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory10 = null;
        slimTableFactoryTest0.setslimTableFactory(slimTableFactory10);
        fitnesse.testsystems.slim.Table table12 = slimTableFactoryTest0.gettable();
        // The following exception was thrown during execution in test generation
        try {
            slimTableFactoryTest0.checkTableTypeDefineUsedForTable();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(slimTableFactory7);
        org.junit.Assert.assertNull(table12);
    }

    @Test
    public void test01064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01064");
        fitnesse.testsystems.slim.tables.SlimTableFactoryTest slimTableFactoryTest0 = new fitnesse.testsystems.slim.tables.SlimTableFactoryTest();
        fitnesse.testsystems.slim.Table table1 = slimTableFactoryTest0.table;
        java.util.Map<java.lang.String, java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable>> strMap2 = slimTableFactoryTest0.getmap();
        fitnesse.testsystems.slim.Table table3 = null;
        slimTableFactoryTest0.table = table3;
        fitnesse.testsystems.slim.Table table5 = null;
        slimTableFactoryTest0.settable(table5);
        // The following exception was thrown during execution in test generation
        try {
            slimTableFactoryTest0.checkTableTypeDefineUsedForTable();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(table1);
        org.junit.Assert.assertNull(strMap2);
    }

    @Test
    public void test01065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01065");
        fitnesse.testsystems.slim.tables.SlimTableFactoryTest slimTableFactoryTest0 = new fitnesse.testsystems.slim.tables.SlimTableFactoryTest();
        fitnesse.testsystems.slim.Table table1 = null;
        slimTableFactoryTest0.table = table1;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory3 = slimTableFactoryTest0.slimTableFactory;
        java.util.Map<java.lang.String, java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable>> strMap4 = slimTableFactoryTest0.getmap();
        fitnesse.testsystems.slim.Table table5 = null;
        slimTableFactoryTest0.settable(table5);
        fitnesse.testsystems.slim.Table table7 = null;
        slimTableFactoryTest0.table = table7;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory9 = null;
        slimTableFactoryTest0.slimTableFactory = slimTableFactory9;
        fitnesse.testsystems.slim.Table table11 = null;
        slimTableFactoryTest0.table = table11;
        fitnesse.testsystems.slim.Table table13 = slimTableFactoryTest0.gettable();
        fitnesse.testsystems.slim.Table table14 = null;
        slimTableFactoryTest0.settable(table14);
        fitnesse.testsystems.slim.Table table16 = null;
        slimTableFactoryTest0.table = table16;
        // The following exception was thrown during execution in test generation
        try {
            slimTableFactoryTest0.shouldCreateCorrectSlimTableForTablesType();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(slimTableFactory3);
        org.junit.Assert.assertNull(strMap4);
        org.junit.Assert.assertNull(table13);
    }

    @Test
    public void test01066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01066");
        fitnesse.testsystems.slim.tables.SlimTableFactoryTest slimTableFactoryTest0 = new fitnesse.testsystems.slim.tables.SlimTableFactoryTest();
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory1 = slimTableFactoryTest0.slimTableFactory;
        fitnesse.testsystems.slim.Table table2 = null;
        slimTableFactoryTest0.settable(table2);
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory4 = slimTableFactoryTest0.slimTableFactory;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory5 = null;
        slimTableFactoryTest0.setslimTableFactory(slimTableFactory5);
        // The following exception was thrown during execution in test generation
        try {
            slimTableFactoryTest0.shouldCreateCorrectSlimTableForTablesType();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(slimTableFactory1);
        org.junit.Assert.assertNull(slimTableFactory4);
    }

    @Test
    public void test01067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01067");
        fitnesse.testsystems.slim.tables.SlimTableFactoryTest slimTableFactoryTest0 = new fitnesse.testsystems.slim.tables.SlimTableFactoryTest();
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory1 = slimTableFactoryTest0.slimTableFactory;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory2 = slimTableFactoryTest0.slimTableFactory;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory3 = null;
        slimTableFactoryTest0.slimTableFactory = slimTableFactory3;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory5 = slimTableFactoryTest0.slimTableFactory;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory6 = null;
        slimTableFactoryTest0.setslimTableFactory(slimTableFactory6);
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory8 = slimTableFactoryTest0.getslimTableFactory();
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory9 = slimTableFactoryTest0.getslimTableFactory();
        java.util.Map<java.lang.String, java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable>> strMap10 = slimTableFactoryTest0.getmap();
        // The following exception was thrown during execution in test generation
        try {
            slimTableFactoryTest0.addTableTypeImport("hi!", "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(slimTableFactory1);
        org.junit.Assert.assertNull(slimTableFactory2);
        org.junit.Assert.assertNull(slimTableFactory5);
        org.junit.Assert.assertNull(slimTableFactory8);
        org.junit.Assert.assertNull(slimTableFactory9);
        org.junit.Assert.assertNull(strMap10);
    }

    @Test
    public void test01068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01068");
        fitnesse.testsystems.slim.tables.SlimTableFactoryTest slimTableFactoryTest0 = new fitnesse.testsystems.slim.tables.SlimTableFactoryTest();
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory1 = slimTableFactoryTest0.slimTableFactory;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory2 = slimTableFactoryTest0.slimTableFactory;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory3 = slimTableFactoryTest0.slimTableFactory;
        fitnesse.testsystems.slim.Table table4 = null;
        slimTableFactoryTest0.table = table4;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory6 = null;
        slimTableFactoryTest0.setslimTableFactory(slimTableFactory6);
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory8 = null;
        slimTableFactoryTest0.slimTableFactory = slimTableFactory8;
        // The following exception was thrown during execution in test generation
        try {
            slimTableFactoryTest0.tableTypeStartingWithcommentColonShouldReturnNull();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(slimTableFactory1);
        org.junit.Assert.assertNull(slimTableFactory2);
        org.junit.Assert.assertNull(slimTableFactory3);
    }

    @Test
    public void test01069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01069");
        fitnesse.testsystems.slim.tables.SlimTableFactoryTest slimTableFactoryTest0 = new fitnesse.testsystems.slim.tables.SlimTableFactoryTest();
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory1 = slimTableFactoryTest0.slimTableFactory;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory2 = slimTableFactoryTest0.slimTableFactory;
        fitnesse.testsystems.slim.Table table3 = slimTableFactoryTest0.gettable();
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory4 = slimTableFactoryTest0.getslimTableFactory();
        fitnesse.testsystems.slim.Table table5 = null;
        slimTableFactoryTest0.table = table5;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory7 = slimTableFactoryTest0.getslimTableFactory();
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory8 = null;
        slimTableFactoryTest0.setslimTableFactory(slimTableFactory8);
        // The following exception was thrown during execution in test generation
        try {
            slimTableFactoryTest0.addTableTypeImport("", "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(slimTableFactory1);
        org.junit.Assert.assertNull(slimTableFactory2);
        org.junit.Assert.assertNull(table3);
        org.junit.Assert.assertNull(slimTableFactory4);
        org.junit.Assert.assertNull(slimTableFactory7);
    }

    @Test
    public void test01070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01070");
        fitnesse.testsystems.slim.tables.SlimTableFactoryTest slimTableFactoryTest0 = new fitnesse.testsystems.slim.tables.SlimTableFactoryTest();
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory1 = slimTableFactoryTest0.slimTableFactory;
        fitnesse.testsystems.slim.Table table2 = slimTableFactoryTest0.gettable();
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory3 = null;
        slimTableFactoryTest0.slimTableFactory = slimTableFactory3;
        fitnesse.testsystems.slim.Table table5 = null;
        slimTableFactoryTest0.settable(table5);
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory7 = slimTableFactoryTest0.slimTableFactory;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory8 = slimTableFactoryTest0.getslimTableFactory();
        fitnesse.testsystems.slim.Table table9 = slimTableFactoryTest0.gettable();
        fitnesse.testsystems.slim.Table table10 = null;
        slimTableFactoryTest0.settable(table10);
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory12 = null;
        slimTableFactoryTest0.setslimTableFactory(slimTableFactory12);
        fitnesse.testsystems.slim.Table table14 = slimTableFactoryTest0.table;
        java.util.Map<java.lang.String, java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable>> strMap15 = slimTableFactoryTest0.map;
        java.util.Map<java.lang.String, java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable>> strMap16 = slimTableFactoryTest0.getmap();
        // The following exception was thrown during execution in test generation
        try {
            slimTableFactoryTest0.tableTypeStartingWithcommentColonShouldReturnNull();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(slimTableFactory1);
        org.junit.Assert.assertNull(table2);
        org.junit.Assert.assertNull(slimTableFactory7);
        org.junit.Assert.assertNull(slimTableFactory8);
        org.junit.Assert.assertNull(table9);
        org.junit.Assert.assertNull(table14);
        org.junit.Assert.assertNull(strMap15);
        org.junit.Assert.assertNull(strMap16);
    }

    @Test
    public void test01071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01071");
        fitnesse.testsystems.slim.tables.SlimTableFactoryTest slimTableFactoryTest0 = new fitnesse.testsystems.slim.tables.SlimTableFactoryTest();
        fitnesse.testsystems.slim.Table table1 = null;
        slimTableFactoryTest0.table = table1;
        fitnesse.testsystems.slim.Table table3 = null;
        slimTableFactoryTest0.settable(table3);
        java.util.Map<java.lang.String, java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable>> strMap5 = slimTableFactoryTest0.map;
        java.util.Map<java.lang.String, java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable>> strMap6 = slimTableFactoryTest0.getmap();
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory7 = slimTableFactoryTest0.slimTableFactory;
        fitnesse.testsystems.slim.Table table8 = slimTableFactoryTest0.table;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory9 = slimTableFactoryTest0.slimTableFactory;
        // The following exception was thrown during execution in test generation
        try {
            slimTableFactoryTest0.tableTypeStartingWithcommentColonShouldReturnNull();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(strMap5);
        org.junit.Assert.assertNull(strMap6);
        org.junit.Assert.assertNull(slimTableFactory7);
        org.junit.Assert.assertNull(table8);
        org.junit.Assert.assertNull(slimTableFactory9);
    }

    @Test
    public void test01072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01072");
        fitnesse.testsystems.slim.tables.SlimTableFactoryTest slimTableFactoryTest0 = new fitnesse.testsystems.slim.tables.SlimTableFactoryTest();
        fitnesse.testsystems.slim.Table table1 = null;
        slimTableFactoryTest0.table = table1;
        fitnesse.testsystems.slim.Table table3 = null;
        slimTableFactoryTest0.settable(table3);
        fitnesse.testsystems.slim.Table table5 = null;
        slimTableFactoryTest0.settable(table5);
        fitnesse.testsystems.slim.Table table7 = null;
        slimTableFactoryTest0.table = table7;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory9 = slimTableFactoryTest0.slimTableFactory;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory10 = null;
        slimTableFactoryTest0.slimTableFactory = slimTableFactory10;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory12 = slimTableFactoryTest0.slimTableFactory;
        fitnesse.testsystems.slim.Table table13 = slimTableFactoryTest0.table;
        fitnesse.testsystems.slim.Table table14 = null;
        slimTableFactoryTest0.table = table14;
        fitnesse.testsystems.slim.Table table16 = null;
        slimTableFactoryTest0.table = table16;
        java.lang.Class<?> wildcardClass18 = slimTableFactoryTest0.getClass();
        org.junit.Assert.assertNull(slimTableFactory9);
        org.junit.Assert.assertNull(slimTableFactory12);
        org.junit.Assert.assertNull(table13);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test01073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01073");
        fitnesse.testsystems.slim.tables.SlimTableFactoryTest slimTableFactoryTest0 = new fitnesse.testsystems.slim.tables.SlimTableFactoryTest();
        fitnesse.testsystems.slim.Table table1 = slimTableFactoryTest0.table;
        java.util.Map<java.lang.String, java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable>> strMap2 = slimTableFactoryTest0.getmap();
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory3 = slimTableFactoryTest0.getslimTableFactory();
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory4 = null;
        slimTableFactoryTest0.slimTableFactory = slimTableFactory4;
        fitnesse.testsystems.slim.Table table6 = slimTableFactoryTest0.table;
        // The following exception was thrown during execution in test generation
        try {
            slimTableFactoryTest0.shouldCreateCorrectSlimTableForTablesType();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(table1);
        org.junit.Assert.assertNull(strMap2);
        org.junit.Assert.assertNull(slimTableFactory3);
        org.junit.Assert.assertNull(table6);
    }

    @Test
    public void test01074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01074");
        fitnesse.testsystems.slim.tables.SlimTableFactoryTest slimTableFactoryTest0 = new fitnesse.testsystems.slim.tables.SlimTableFactoryTest();
        fitnesse.testsystems.slim.Table table1 = null;
        slimTableFactoryTest0.table = table1;
        fitnesse.testsystems.slim.Table table3 = null;
        slimTableFactoryTest0.settable(table3);
        fitnesse.testsystems.slim.Table table5 = null;
        slimTableFactoryTest0.table = table5;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory7 = slimTableFactoryTest0.slimTableFactory;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory8 = slimTableFactoryTest0.getslimTableFactory();
        java.util.Map<java.lang.String, java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable>> strMap9 = slimTableFactoryTest0.getmap();
        // The following exception was thrown during execution in test generation
        try {
            slimTableFactoryTest0.checkTableTypeDefineUsedForTable();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(slimTableFactory7);
        org.junit.Assert.assertNull(slimTableFactory8);
        org.junit.Assert.assertNull(strMap9);
    }

    @Test
    public void test01075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01075");
        fitnesse.testsystems.slim.tables.SlimTableFactoryTest slimTableFactoryTest0 = new fitnesse.testsystems.slim.tables.SlimTableFactoryTest();
        fitnesse.testsystems.slim.Table table1 = null;
        slimTableFactoryTest0.table = table1;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory3 = slimTableFactoryTest0.slimTableFactory;
        java.util.Map<java.lang.String, java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable>> strMap4 = slimTableFactoryTest0.map;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory5 = slimTableFactoryTest0.getslimTableFactory();
        // The following exception was thrown during execution in test generation
        try {
            slimTableFactoryTest0.addTableTypeImport("", "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(slimTableFactory3);
        org.junit.Assert.assertNull(strMap4);
        org.junit.Assert.assertNull(slimTableFactory5);
    }

    @Test
    public void test01076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01076");
        fitnesse.testsystems.slim.tables.SlimTableFactoryTest slimTableFactoryTest0 = new fitnesse.testsystems.slim.tables.SlimTableFactoryTest();
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory1 = slimTableFactoryTest0.slimTableFactory;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory2 = slimTableFactoryTest0.slimTableFactory;
        fitnesse.testsystems.slim.Table table3 = slimTableFactoryTest0.gettable();
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory4 = null;
        slimTableFactoryTest0.slimTableFactory = slimTableFactory4;
        java.util.Map<java.lang.String, java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable>> strMap6 = slimTableFactoryTest0.getmap();
        java.lang.Class<?> wildcardClass7 = slimTableFactoryTest0.getClass();
        org.junit.Assert.assertNull(slimTableFactory1);
        org.junit.Assert.assertNull(slimTableFactory2);
        org.junit.Assert.assertNull(table3);
        org.junit.Assert.assertNull(strMap6);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test01077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01077");
        fitnesse.testsystems.slim.tables.SlimTableFactoryTest slimTableFactoryTest0 = new fitnesse.testsystems.slim.tables.SlimTableFactoryTest();
        fitnesse.testsystems.slim.Table table1 = slimTableFactoryTest0.table;
        java.util.Map<java.lang.String, java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable>> strMap2 = slimTableFactoryTest0.getmap();
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory3 = slimTableFactoryTest0.slimTableFactory;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory4 = slimTableFactoryTest0.getslimTableFactory();
        java.util.Map<java.lang.String, java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable>> strMap5 = slimTableFactoryTest0.getmap();
        fitnesse.testsystems.slim.Table table6 = null;
        slimTableFactoryTest0.table = table6;
        fitnesse.testsystems.slim.Table table8 = slimTableFactoryTest0.gettable();
        java.util.Map<java.lang.String, java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable>> strMap9 = slimTableFactoryTest0.map;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory10 = slimTableFactoryTest0.getslimTableFactory();
        java.lang.Class<?> wildcardClass11 = slimTableFactoryTest0.getClass();
        org.junit.Assert.assertNull(table1);
        org.junit.Assert.assertNull(strMap2);
        org.junit.Assert.assertNull(slimTableFactory3);
        org.junit.Assert.assertNull(slimTableFactory4);
        org.junit.Assert.assertNull(strMap5);
        org.junit.Assert.assertNull(table8);
        org.junit.Assert.assertNull(strMap9);
        org.junit.Assert.assertNull(slimTableFactory10);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test01078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01078");
        fitnesse.testsystems.slim.tables.SlimTableFactoryTest slimTableFactoryTest0 = new fitnesse.testsystems.slim.tables.SlimTableFactoryTest();
        fitnesse.testsystems.slim.Table table1 = null;
        slimTableFactoryTest0.table = table1;
        fitnesse.testsystems.slim.Table table3 = null;
        slimTableFactoryTest0.settable(table3);
        fitnesse.testsystems.slim.Table table5 = null;
        slimTableFactoryTest0.settable(table5);
        fitnesse.testsystems.slim.Table table7 = slimTableFactoryTest0.table;
        fitnesse.testsystems.slim.Table table8 = null;
        slimTableFactoryTest0.settable(table8);
        java.util.Map<java.lang.String, java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable>> strMap10 = slimTableFactoryTest0.getmap();
        fitnesse.testsystems.slim.Table table11 = null;
        slimTableFactoryTest0.table = table11;
        fitnesse.testsystems.slim.Table table13 = slimTableFactoryTest0.table;
        fitnesse.testsystems.slim.Table table14 = null;
        slimTableFactoryTest0.settable(table14);
        fitnesse.testsystems.slim.Table table16 = null;
        slimTableFactoryTest0.table = table16;
        fitnesse.testsystems.slim.Table table18 = null;
        slimTableFactoryTest0.table = table18;
        // The following exception was thrown during execution in test generation
        try {
            slimTableFactoryTest0.tableTypeStartingWithcommentColonShouldReturnNull();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(table7);
        org.junit.Assert.assertNull(strMap10);
        org.junit.Assert.assertNull(table13);
    }

    @Test
    public void test01079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01079");
        fitnesse.testsystems.slim.tables.SlimTableFactoryTest slimTableFactoryTest0 = new fitnesse.testsystems.slim.tables.SlimTableFactoryTest();
        fitnesse.testsystems.slim.Table table1 = slimTableFactoryTest0.table;
        java.util.Map<java.lang.String, java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable>> strMap2 = slimTableFactoryTest0.getmap();
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory3 = null;
        slimTableFactoryTest0.slimTableFactory = slimTableFactory3;
        fitnesse.testsystems.slim.Table table5 = slimTableFactoryTest0.table;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory6 = slimTableFactoryTest0.slimTableFactory;
        fitnesse.testsystems.slim.Table table7 = null;
        slimTableFactoryTest0.settable(table7);
        // The following exception was thrown during execution in test generation
        try {
            slimTableFactoryTest0.shouldCreateCorrectSlimTableForTablesType();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(table1);
        org.junit.Assert.assertNull(strMap2);
        org.junit.Assert.assertNull(table5);
        org.junit.Assert.assertNull(slimTableFactory6);
    }

    @Test
    public void test01080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01080");
        fitnesse.testsystems.slim.tables.SlimTableFactoryTest slimTableFactoryTest0 = new fitnesse.testsystems.slim.tables.SlimTableFactoryTest();
        fitnesse.testsystems.slim.Table table1 = null;
        slimTableFactoryTest0.table = table1;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory3 = slimTableFactoryTest0.slimTableFactory;
        java.util.Map<java.lang.String, java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable>> strMap4 = slimTableFactoryTest0.getmap();
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory5 = slimTableFactoryTest0.slimTableFactory;
        java.util.Map<java.lang.String, java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable>> strMap6 = slimTableFactoryTest0.getmap();
        fitnesse.testsystems.slim.Table table7 = null;
        slimTableFactoryTest0.table = table7;
        java.util.Map<java.lang.String, java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable>> strMap9 = slimTableFactoryTest0.map;
        java.util.Map<java.lang.String, java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable>> strMap10 = slimTableFactoryTest0.getmap();
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory11 = slimTableFactoryTest0.slimTableFactory;
        // The following exception was thrown during execution in test generation
        try {
            slimTableFactoryTest0.addTableTypeImport("", "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(slimTableFactory3);
        org.junit.Assert.assertNull(strMap4);
        org.junit.Assert.assertNull(slimTableFactory5);
        org.junit.Assert.assertNull(strMap6);
        org.junit.Assert.assertNull(strMap9);
        org.junit.Assert.assertNull(strMap10);
        org.junit.Assert.assertNull(slimTableFactory11);
    }

    @Test
    public void test01081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01081");
        fitnesse.testsystems.slim.tables.SlimTableFactoryTest slimTableFactoryTest0 = new fitnesse.testsystems.slim.tables.SlimTableFactoryTest();
        fitnesse.testsystems.slim.Table table1 = null;
        slimTableFactoryTest0.table = table1;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory3 = slimTableFactoryTest0.getslimTableFactory();
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory4 = slimTableFactoryTest0.getslimTableFactory();
        fitnesse.testsystems.slim.Table table5 = null;
        slimTableFactoryTest0.table = table5;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory7 = slimTableFactoryTest0.slimTableFactory;
        // The following exception was thrown during execution in test generation
        try {
            slimTableFactoryTest0.tableTypeStartingWithcommentColonShouldReturnNull();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(slimTableFactory3);
        org.junit.Assert.assertNull(slimTableFactory4);
        org.junit.Assert.assertNull(slimTableFactory7);
    }

    @Test
    public void test01082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01082");
        fitnesse.testsystems.slim.tables.SlimTableFactoryTest slimTableFactoryTest0 = new fitnesse.testsystems.slim.tables.SlimTableFactoryTest();
        fitnesse.testsystems.slim.Table table1 = null;
        slimTableFactoryTest0.table = table1;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory3 = slimTableFactoryTest0.getslimTableFactory();
        fitnesse.testsystems.slim.Table table4 = slimTableFactoryTest0.gettable();
        java.util.Map<java.lang.String, java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable>> strMap5 = slimTableFactoryTest0.getmap();
        // The following exception was thrown during execution in test generation
        try {
            slimTableFactoryTest0.tableTypeStartingWithcommentColonShouldReturnNull();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(slimTableFactory3);
        org.junit.Assert.assertNull(table4);
        org.junit.Assert.assertNull(strMap5);
    }

    @Test
    public void test01083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01083");
        fitnesse.testsystems.slim.tables.SlimTableFactoryTest slimTableFactoryTest0 = new fitnesse.testsystems.slim.tables.SlimTableFactoryTest();
        fitnesse.testsystems.slim.Table table1 = null;
        slimTableFactoryTest0.table = table1;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory3 = null;
        slimTableFactoryTest0.slimTableFactory = slimTableFactory3;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory5 = slimTableFactoryTest0.getslimTableFactory();
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory6 = null;
        slimTableFactoryTest0.setslimTableFactory(slimTableFactory6);
        fitnesse.testsystems.slim.Table table8 = slimTableFactoryTest0.table;
        java.util.Map<java.lang.String, java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable>> strMap9 = slimTableFactoryTest0.getmap();
        // The following exception was thrown during execution in test generation
        try {
            slimTableFactoryTest0.shouldCreateCorrectSlimTableForTablesType();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(slimTableFactory5);
        org.junit.Assert.assertNull(table8);
        org.junit.Assert.assertNull(strMap9);
    }

    @Test
    public void test01084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01084");
        fitnesse.testsystems.slim.tables.SlimTableFactoryTest slimTableFactoryTest0 = new fitnesse.testsystems.slim.tables.SlimTableFactoryTest();
        fitnesse.testsystems.slim.Table table1 = slimTableFactoryTest0.table;
        java.util.Map<java.lang.String, java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable>> strMap2 = slimTableFactoryTest0.getmap();
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory3 = slimTableFactoryTest0.slimTableFactory;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory4 = slimTableFactoryTest0.getslimTableFactory();
        fitnesse.testsystems.slim.Table table5 = null;
        slimTableFactoryTest0.table = table5;
        java.util.Map<java.lang.String, java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable>> strMap7 = slimTableFactoryTest0.getmap();
        // The following exception was thrown during execution in test generation
        try {
            slimTableFactoryTest0.commentTableShouldReturnNull();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(table1);
        org.junit.Assert.assertNull(strMap2);
        org.junit.Assert.assertNull(slimTableFactory3);
        org.junit.Assert.assertNull(slimTableFactory4);
        org.junit.Assert.assertNull(strMap7);
    }

    @Test
    public void test01085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01085");
        fitnesse.testsystems.slim.tables.SlimTableFactoryTest slimTableFactoryTest0 = new fitnesse.testsystems.slim.tables.SlimTableFactoryTest();
        fitnesse.testsystems.slim.Table table1 = null;
        slimTableFactoryTest0.table = table1;
        fitnesse.testsystems.slim.Table table3 = null;
        slimTableFactoryTest0.settable(table3);
        fitnesse.testsystems.slim.Table table5 = null;
        slimTableFactoryTest0.settable(table5);
        fitnesse.testsystems.slim.Table table7 = slimTableFactoryTest0.table;
        java.util.Map<java.lang.String, java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable>> strMap8 = slimTableFactoryTest0.getmap();
        fitnesse.testsystems.slim.Table table9 = null;
        slimTableFactoryTest0.settable(table9);
        // The following exception was thrown during execution in test generation
        try {
            slimTableFactoryTest0.checkTableTypeDefinesIgnoredIfDifferentSpecified();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(table7);
        org.junit.Assert.assertNull(strMap8);
    }

    @Test
    public void test01086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01086");
        fitnesse.testsystems.slim.tables.SlimTableFactoryTest slimTableFactoryTest0 = new fitnesse.testsystems.slim.tables.SlimTableFactoryTest();
        fitnesse.testsystems.slim.Table table1 = null;
        slimTableFactoryTest0.table = table1;
        fitnesse.testsystems.slim.Table table3 = null;
        slimTableFactoryTest0.settable(table3);
        fitnesse.testsystems.slim.Table table5 = null;
        slimTableFactoryTest0.table = table5;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory7 = slimTableFactoryTest0.slimTableFactory;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory8 = slimTableFactoryTest0.slimTableFactory;
        java.util.Map<java.lang.String, java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable>> strMap9 = slimTableFactoryTest0.map;
        fitnesse.testsystems.slim.Table table10 = null;
        slimTableFactoryTest0.table = table10;
        java.lang.Class<?> wildcardClass12 = slimTableFactoryTest0.getClass();
        org.junit.Assert.assertNull(slimTableFactory7);
        org.junit.Assert.assertNull(slimTableFactory8);
        org.junit.Assert.assertNull(strMap9);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test01087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01087");
        fitnesse.testsystems.slim.tables.SlimTableFactoryTest slimTableFactoryTest0 = new fitnesse.testsystems.slim.tables.SlimTableFactoryTest();
        fitnesse.testsystems.slim.Table table1 = slimTableFactoryTest0.table;
        java.util.Map<java.lang.String, java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable>> strMap2 = slimTableFactoryTest0.getmap();
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory3 = slimTableFactoryTest0.slimTableFactory;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory4 = slimTableFactoryTest0.getslimTableFactory();
        java.util.Map<java.lang.String, java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable>> strMap5 = slimTableFactoryTest0.getmap();
        fitnesse.testsystems.slim.Table table6 = null;
        slimTableFactoryTest0.table = table6;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory8 = slimTableFactoryTest0.getslimTableFactory();
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory9 = slimTableFactoryTest0.slimTableFactory;
        // The following exception was thrown during execution in test generation
        try {
            slimTableFactoryTest0.commentTableShouldReturnNull();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(table1);
        org.junit.Assert.assertNull(strMap2);
        org.junit.Assert.assertNull(slimTableFactory3);
        org.junit.Assert.assertNull(slimTableFactory4);
        org.junit.Assert.assertNull(strMap5);
        org.junit.Assert.assertNull(slimTableFactory8);
        org.junit.Assert.assertNull(slimTableFactory9);
    }

    @Test
    public void test01088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01088");
        fitnesse.testsystems.slim.tables.SlimTableFactoryTest slimTableFactoryTest0 = new fitnesse.testsystems.slim.tables.SlimTableFactoryTest();
        fitnesse.testsystems.slim.Table table1 = slimTableFactoryTest0.table;
        java.util.Map<java.lang.String, java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable>> strMap2 = slimTableFactoryTest0.getmap();
        java.util.Map<java.lang.String, java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable>> strMap3 = slimTableFactoryTest0.getmap();
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory4 = slimTableFactoryTest0.slimTableFactory;
        fitnesse.testsystems.slim.Table table5 = null;
        slimTableFactoryTest0.settable(table5);
        fitnesse.testsystems.slim.Table table7 = slimTableFactoryTest0.table;
        java.util.Map<java.lang.String, java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable>> strMap8 = slimTableFactoryTest0.map;
        fitnesse.testsystems.slim.Table table9 = null;
        slimTableFactoryTest0.table = table9;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory11 = null;
        slimTableFactoryTest0.setslimTableFactory(slimTableFactory11);
        fitnesse.testsystems.slim.Table table13 = null;
        slimTableFactoryTest0.settable(table13);
        fitnesse.testsystems.slim.Table table15 = null;
        slimTableFactoryTest0.table = table15;
        // The following exception was thrown during execution in test generation
        try {
            slimTableFactoryTest0.commentTableShouldReturnNull();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(table1);
        org.junit.Assert.assertNull(strMap2);
        org.junit.Assert.assertNull(strMap3);
        org.junit.Assert.assertNull(slimTableFactory4);
        org.junit.Assert.assertNull(table7);
        org.junit.Assert.assertNull(strMap8);
    }

    @Test
    public void test01089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01089");
        fitnesse.testsystems.slim.tables.SlimTableFactoryTest slimTableFactoryTest0 = new fitnesse.testsystems.slim.tables.SlimTableFactoryTest();
        fitnesse.testsystems.slim.Table table1 = null;
        slimTableFactoryTest0.table = table1;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory3 = null;
        slimTableFactoryTest0.setslimTableFactory(slimTableFactory3);
        java.util.Map<java.lang.String, java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable>> strMap5 = slimTableFactoryTest0.map;
        fitnesse.testsystems.slim.Table table6 = slimTableFactoryTest0.gettable();
        // The following exception was thrown during execution in test generation
        try {
            slimTableFactoryTest0.checkTableTypeDefinesIgnoredIfDifferentSpecified();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(strMap5);
        org.junit.Assert.assertNull(table6);
    }

    @Test
    public void test01090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01090");
        fitnesse.testsystems.slim.tables.SlimTableFactoryTest slimTableFactoryTest0 = new fitnesse.testsystems.slim.tables.SlimTableFactoryTest();
        fitnesse.testsystems.slim.Table table1 = slimTableFactoryTest0.table;
        java.util.Map<java.lang.String, java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable>> strMap2 = slimTableFactoryTest0.getmap();
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory3 = slimTableFactoryTest0.slimTableFactory;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory4 = slimTableFactoryTest0.getslimTableFactory();
        java.util.Map<java.lang.String, java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable>> strMap5 = slimTableFactoryTest0.getmap();
        fitnesse.testsystems.slim.Table table6 = null;
        slimTableFactoryTest0.table = table6;
        fitnesse.testsystems.slim.Table table8 = slimTableFactoryTest0.gettable();
        java.util.Map<java.lang.String, java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable>> strMap9 = slimTableFactoryTest0.map;
        // The following exception was thrown during execution in test generation
        try {
            slimTableFactoryTest0.tableTypeStartingWithcommentColonShouldReturnNull();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(table1);
        org.junit.Assert.assertNull(strMap2);
        org.junit.Assert.assertNull(slimTableFactory3);
        org.junit.Assert.assertNull(slimTableFactory4);
        org.junit.Assert.assertNull(strMap5);
        org.junit.Assert.assertNull(table8);
        org.junit.Assert.assertNull(strMap9);
    }

    @Test
    public void test01091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01091");
        fitnesse.testsystems.slim.tables.SlimTableFactoryTest slimTableFactoryTest0 = new fitnesse.testsystems.slim.tables.SlimTableFactoryTest();
        fitnesse.testsystems.slim.Table table1 = null;
        slimTableFactoryTest0.table = table1;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory3 = null;
        slimTableFactoryTest0.setslimTableFactory(slimTableFactory3);
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory5 = slimTableFactoryTest0.slimTableFactory;
        java.util.Map<java.lang.String, java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable>> strMap6 = slimTableFactoryTest0.getmap();
        java.util.Map<java.lang.String, java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable>> strMap7 = slimTableFactoryTest0.getmap();
        // The following exception was thrown during execution in test generation
        try {
            slimTableFactoryTest0.addTableTypeImport("hi!", "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(slimTableFactory5);
        org.junit.Assert.assertNull(strMap6);
        org.junit.Assert.assertNull(strMap7);
    }

    @Test
    public void test01092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01092");
        fitnesse.testsystems.slim.tables.SlimTableFactoryTest slimTableFactoryTest0 = new fitnesse.testsystems.slim.tables.SlimTableFactoryTest();
        fitnesse.testsystems.slim.Table table1 = null;
        slimTableFactoryTest0.table = table1;
        fitnesse.testsystems.slim.Table table3 = slimTableFactoryTest0.table;
        fitnesse.testsystems.slim.Table table4 = slimTableFactoryTest0.gettable();
        java.util.Map<java.lang.String, java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable>> strMap5 = slimTableFactoryTest0.getmap();
        java.util.Map<java.lang.String, java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable>> strMap6 = slimTableFactoryTest0.map;
        fitnesse.testsystems.slim.Table table7 = slimTableFactoryTest0.table;
        java.util.Map<java.lang.String, java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable>> strMap8 = slimTableFactoryTest0.getmap();
        // The following exception was thrown during execution in test generation
        try {
            slimTableFactoryTest0.commentTableShouldReturnNull();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(table3);
        org.junit.Assert.assertNull(table4);
        org.junit.Assert.assertNull(strMap5);
        org.junit.Assert.assertNull(strMap6);
        org.junit.Assert.assertNull(table7);
        org.junit.Assert.assertNull(strMap8);
    }

    @Test
    public void test01093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01093");
        fitnesse.testsystems.slim.tables.SlimTableFactoryTest slimTableFactoryTest0 = new fitnesse.testsystems.slim.tables.SlimTableFactoryTest();
        fitnesse.testsystems.slim.Table table1 = null;
        slimTableFactoryTest0.table = table1;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory3 = slimTableFactoryTest0.slimTableFactory;
        java.util.Map<java.lang.String, java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable>> strMap4 = slimTableFactoryTest0.getmap();
        fitnesse.testsystems.slim.Table table5 = null;
        slimTableFactoryTest0.settable(table5);
        fitnesse.testsystems.slim.Table table7 = null;
        slimTableFactoryTest0.table = table7;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory9 = null;
        slimTableFactoryTest0.slimTableFactory = slimTableFactory9;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory11 = slimTableFactoryTest0.slimTableFactory;
        fitnesse.testsystems.slim.Table table12 = null;
        slimTableFactoryTest0.settable(table12);
        java.util.Map<java.lang.String, java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable>> strMap14 = slimTableFactoryTest0.map;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory15 = null;
        slimTableFactoryTest0.slimTableFactory = slimTableFactory15;
        // The following exception was thrown during execution in test generation
        try {
            slimTableFactoryTest0.tableTypeStartingWithcommentColonShouldReturnNull();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(slimTableFactory3);
        org.junit.Assert.assertNull(strMap4);
        org.junit.Assert.assertNull(slimTableFactory11);
        org.junit.Assert.assertNull(strMap14);
    }

    @Test
    public void test01094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01094");
        fitnesse.testsystems.slim.tables.SlimTableFactoryTest slimTableFactoryTest0 = new fitnesse.testsystems.slim.tables.SlimTableFactoryTest();
        fitnesse.testsystems.slim.Table table1 = null;
        slimTableFactoryTest0.table = table1;
        fitnesse.testsystems.slim.Table table3 = null;
        slimTableFactoryTest0.settable(table3);
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory5 = slimTableFactoryTest0.slimTableFactory;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory6 = slimTableFactoryTest0.getslimTableFactory();
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory7 = null;
        slimTableFactoryTest0.setslimTableFactory(slimTableFactory7);
        java.lang.Class<?> wildcardClass9 = slimTableFactoryTest0.getClass();
        org.junit.Assert.assertNull(slimTableFactory5);
        org.junit.Assert.assertNull(slimTableFactory6);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test01095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01095");
        fitnesse.testsystems.slim.tables.SlimTableFactoryTest slimTableFactoryTest0 = new fitnesse.testsystems.slim.tables.SlimTableFactoryTest();
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory1 = slimTableFactoryTest0.slimTableFactory;
        fitnesse.testsystems.slim.Table table2 = slimTableFactoryTest0.table;
        java.util.Map<java.lang.String, java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable>> strMap3 = slimTableFactoryTest0.map;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory4 = null;
        slimTableFactoryTest0.slimTableFactory = slimTableFactory4;
        fitnesse.testsystems.slim.Table table6 = null;
        slimTableFactoryTest0.table = table6;
        fitnesse.testsystems.slim.Table table8 = slimTableFactoryTest0.gettable();
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory9 = slimTableFactoryTest0.getslimTableFactory();
        fitnesse.testsystems.slim.Table table10 = null;
        slimTableFactoryTest0.table = table10;
        // The following exception was thrown during execution in test generation
        try {
            slimTableFactoryTest0.shouldCreateCorrectSlimTableForTablesType();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(slimTableFactory1);
        org.junit.Assert.assertNull(table2);
        org.junit.Assert.assertNull(strMap3);
        org.junit.Assert.assertNull(table8);
        org.junit.Assert.assertNull(slimTableFactory9);
    }

    @Test
    public void test01096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01096");
        fitnesse.testsystems.slim.tables.SlimTableFactoryTest slimTableFactoryTest0 = new fitnesse.testsystems.slim.tables.SlimTableFactoryTest();
        fitnesse.testsystems.slim.Table table1 = null;
        slimTableFactoryTest0.table = table1;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory3 = slimTableFactoryTest0.slimTableFactory;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory4 = slimTableFactoryTest0.slimTableFactory;
        fitnesse.testsystems.slim.Table table5 = null;
        slimTableFactoryTest0.settable(table5);
        fitnesse.testsystems.slim.Table table7 = slimTableFactoryTest0.table;
        // The following exception was thrown during execution in test generation
        try {
            slimTableFactoryTest0.checkTableTypeDefineUsedForTable();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(slimTableFactory3);
        org.junit.Assert.assertNull(slimTableFactory4);
        org.junit.Assert.assertNull(table7);
    }

    @Test
    public void test01097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01097");
        fitnesse.testsystems.slim.tables.SlimTableFactoryTest slimTableFactoryTest0 = new fitnesse.testsystems.slim.tables.SlimTableFactoryTest();
        fitnesse.testsystems.slim.Table table1 = null;
        slimTableFactoryTest0.table = table1;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory3 = slimTableFactoryTest0.slimTableFactory;
        java.util.Map<java.lang.String, java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable>> strMap4 = slimTableFactoryTest0.getmap();
        fitnesse.testsystems.slim.Table table5 = null;
        slimTableFactoryTest0.settable(table5);
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory7 = null;
        slimTableFactoryTest0.setslimTableFactory(slimTableFactory7);
        fitnesse.testsystems.slim.Table table9 = slimTableFactoryTest0.table;
        fitnesse.testsystems.slim.Table table10 = slimTableFactoryTest0.table;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory11 = slimTableFactoryTest0.slimTableFactory;
        // The following exception was thrown during execution in test generation
        try {
            slimTableFactoryTest0.shouldCreateCorrectSlimTableForTablesType();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(slimTableFactory3);
        org.junit.Assert.assertNull(strMap4);
        org.junit.Assert.assertNull(table9);
        org.junit.Assert.assertNull(table10);
        org.junit.Assert.assertNull(slimTableFactory11);
    }

    @Test
    public void test01098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01098");
        fitnesse.testsystems.slim.tables.SlimTableFactoryTest slimTableFactoryTest0 = new fitnesse.testsystems.slim.tables.SlimTableFactoryTest();
        fitnesse.testsystems.slim.Table table1 = null;
        slimTableFactoryTest0.table = table1;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory3 = slimTableFactoryTest0.slimTableFactory;
        java.util.Map<java.lang.String, java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable>> strMap4 = slimTableFactoryTest0.getmap();
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory5 = slimTableFactoryTest0.slimTableFactory;
        java.util.Map<java.lang.String, java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable>> strMap6 = slimTableFactoryTest0.getmap();
        fitnesse.testsystems.slim.Table table7 = null;
        slimTableFactoryTest0.settable(table7);
        fitnesse.testsystems.slim.Table table9 = slimTableFactoryTest0.table;
        java.util.Map<java.lang.String, java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable>> strMap10 = slimTableFactoryTest0.map;
        // The following exception was thrown during execution in test generation
        try {
            slimTableFactoryTest0.tableTypeStartingWithcommentColonShouldReturnNull();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(slimTableFactory3);
        org.junit.Assert.assertNull(strMap4);
        org.junit.Assert.assertNull(slimTableFactory5);
        org.junit.Assert.assertNull(strMap6);
        org.junit.Assert.assertNull(table9);
        org.junit.Assert.assertNull(strMap10);
    }

    @Test
    public void test01099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01099");
        fitnesse.testsystems.slim.tables.SlimTableFactoryTest slimTableFactoryTest0 = new fitnesse.testsystems.slim.tables.SlimTableFactoryTest();
        fitnesse.testsystems.slim.Table table1 = null;
        slimTableFactoryTest0.table = table1;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory3 = slimTableFactoryTest0.getslimTableFactory();
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory4 = slimTableFactoryTest0.getslimTableFactory();
        fitnesse.testsystems.slim.Table table5 = null;
        slimTableFactoryTest0.table = table5;
        fitnesse.testsystems.slim.Table table7 = null;
        slimTableFactoryTest0.table = table7;
        fitnesse.testsystems.slim.Table table9 = slimTableFactoryTest0.gettable();
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory10 = slimTableFactoryTest0.getslimTableFactory();
        // The following exception was thrown during execution in test generation
        try {
            slimTableFactoryTest0.shouldCreateCorrectSlimTableForTablesType();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(slimTableFactory3);
        org.junit.Assert.assertNull(slimTableFactory4);
        org.junit.Assert.assertNull(table9);
        org.junit.Assert.assertNull(slimTableFactory10);
    }

    @Test
    public void test01100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01100");
        fitnesse.testsystems.slim.tables.SlimTableFactoryTest slimTableFactoryTest0 = new fitnesse.testsystems.slim.tables.SlimTableFactoryTest();
        fitnesse.testsystems.slim.Table table1 = slimTableFactoryTest0.table;
        java.util.Map<java.lang.String, java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable>> strMap2 = slimTableFactoryTest0.getmap();
        fitnesse.testsystems.slim.Table table3 = null;
        slimTableFactoryTest0.table = table3;
        fitnesse.testsystems.slim.Table table5 = slimTableFactoryTest0.gettable();
        fitnesse.testsystems.slim.Table table6 = null;
        slimTableFactoryTest0.table = table6;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory8 = null;
        slimTableFactoryTest0.slimTableFactory = slimTableFactory8;
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
    }

    @Test
    public void test01101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01101");
        fitnesse.testsystems.slim.tables.SlimTableFactoryTest slimTableFactoryTest0 = new fitnesse.testsystems.slim.tables.SlimTableFactoryTest();
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory1 = slimTableFactoryTest0.slimTableFactory;
        fitnesse.testsystems.slim.Table table2 = slimTableFactoryTest0.gettable();
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory3 = null;
        slimTableFactoryTest0.slimTableFactory = slimTableFactory3;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory5 = null;
        slimTableFactoryTest0.slimTableFactory = slimTableFactory5;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory7 = null;
        slimTableFactoryTest0.setslimTableFactory(slimTableFactory7);
        fitnesse.testsystems.slim.Table table9 = slimTableFactoryTest0.table;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory10 = slimTableFactoryTest0.slimTableFactory;
        fitnesse.testsystems.slim.Table table11 = null;
        slimTableFactoryTest0.table = table11;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory13 = slimTableFactoryTest0.getslimTableFactory();
        // The following exception was thrown during execution in test generation
        try {
            slimTableFactoryTest0.checkTableTypeDefinesIgnoredIfDifferentSpecified();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(slimTableFactory1);
        org.junit.Assert.assertNull(table2);
        org.junit.Assert.assertNull(table9);
        org.junit.Assert.assertNull(slimTableFactory10);
        org.junit.Assert.assertNull(slimTableFactory13);
    }

    @Test
    public void test01102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01102");
        fitnesse.testsystems.slim.tables.SlimTableFactoryTest slimTableFactoryTest0 = new fitnesse.testsystems.slim.tables.SlimTableFactoryTest();
        java.util.Map<java.lang.String, java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable>> strMap1 = slimTableFactoryTest0.getmap();
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory2 = slimTableFactoryTest0.slimTableFactory;
        fitnesse.testsystems.slim.Table table3 = slimTableFactoryTest0.table;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory4 = slimTableFactoryTest0.getslimTableFactory();
        fitnesse.testsystems.slim.Table table5 = null;
        slimTableFactoryTest0.settable(table5);
        // The following exception was thrown during execution in test generation
        try {
            slimTableFactoryTest0.checkTableTypeDefinesIgnoredIfDifferentSpecified();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(strMap1);
        org.junit.Assert.assertNull(slimTableFactory2);
        org.junit.Assert.assertNull(table3);
        org.junit.Assert.assertNull(slimTableFactory4);
    }

    @Test
    public void test01103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01103");
        fitnesse.testsystems.slim.tables.SlimTableFactoryTest slimTableFactoryTest0 = new fitnesse.testsystems.slim.tables.SlimTableFactoryTest();
        fitnesse.testsystems.slim.Table table1 = null;
        slimTableFactoryTest0.table = table1;
        fitnesse.testsystems.slim.Table table3 = null;
        slimTableFactoryTest0.settable(table3);
        java.util.Map<java.lang.String, java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable>> strMap5 = slimTableFactoryTest0.map;
        fitnesse.testsystems.slim.Table table6 = null;
        slimTableFactoryTest0.settable(table6);
        // The following exception was thrown during execution in test generation
        try {
            slimTableFactoryTest0.checkTableTypeDefinesIgnoredIfDifferentSpecified();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(strMap5);
    }

    @Test
    public void test01104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01104");
        fitnesse.testsystems.slim.tables.SlimTableFactoryTest slimTableFactoryTest0 = new fitnesse.testsystems.slim.tables.SlimTableFactoryTest();
        fitnesse.testsystems.slim.Table table1 = null;
        slimTableFactoryTest0.table = table1;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory3 = slimTableFactoryTest0.slimTableFactory;
        java.util.Map<java.lang.String, java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable>> strMap4 = slimTableFactoryTest0.map;
        fitnesse.testsystems.slim.Table table5 = null;
        slimTableFactoryTest0.table = table5;
        // The following exception was thrown during execution in test generation
        try {
            slimTableFactoryTest0.checkTableTypeDefineUsedForTable();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(slimTableFactory3);
        org.junit.Assert.assertNull(strMap4);
    }

    @Test
    public void test01105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01105");
        fitnesse.testsystems.slim.tables.SlimTableFactoryTest slimTableFactoryTest0 = new fitnesse.testsystems.slim.tables.SlimTableFactoryTest();
        fitnesse.testsystems.slim.Table table1 = null;
        slimTableFactoryTest0.table = table1;
        fitnesse.testsystems.slim.Table table3 = null;
        slimTableFactoryTest0.settable(table3);
        fitnesse.testsystems.slim.Table table5 = null;
        slimTableFactoryTest0.settable(table5);
        fitnesse.testsystems.slim.Table table7 = slimTableFactoryTest0.table;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory8 = null;
        slimTableFactoryTest0.setslimTableFactory(slimTableFactory8);
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory10 = null;
        slimTableFactoryTest0.slimTableFactory = slimTableFactory10;
        java.util.Map<java.lang.String, java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable>> strMap12 = slimTableFactoryTest0.map;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory13 = slimTableFactoryTest0.slimTableFactory;
        fitnesse.testsystems.slim.Table table14 = null;
        slimTableFactoryTest0.table = table14;
        fitnesse.testsystems.slim.Table table16 = slimTableFactoryTest0.table;
        // The following exception was thrown during execution in test generation
        try {
            slimTableFactoryTest0.tableTypeStartingWithcommentColonShouldReturnNull();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(table7);
        org.junit.Assert.assertNull(strMap12);
        org.junit.Assert.assertNull(slimTableFactory13);
        org.junit.Assert.assertNull(table16);
    }

    @Test
    public void test01106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01106");
        fitnesse.testsystems.slim.tables.SlimTableFactoryTest slimTableFactoryTest0 = new fitnesse.testsystems.slim.tables.SlimTableFactoryTest();
        fitnesse.testsystems.slim.Table table1 = null;
        slimTableFactoryTest0.table = table1;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory3 = slimTableFactoryTest0.slimTableFactory;
        java.util.Map<java.lang.String, java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable>> strMap4 = slimTableFactoryTest0.getmap();
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory5 = null;
        slimTableFactoryTest0.setslimTableFactory(slimTableFactory5);
        fitnesse.testsystems.slim.Table table7 = slimTableFactoryTest0.gettable();
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory8 = null;
        slimTableFactoryTest0.setslimTableFactory(slimTableFactory8);
        fitnesse.testsystems.slim.Table table10 = slimTableFactoryTest0.gettable();
        // The following exception was thrown during execution in test generation
        try {
            slimTableFactoryTest0.addTableTypeImport("hi!", "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(slimTableFactory3);
        org.junit.Assert.assertNull(strMap4);
        org.junit.Assert.assertNull(table7);
        org.junit.Assert.assertNull(table10);
    }

    @Test
    public void test01107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01107");
        fitnesse.testsystems.slim.tables.SlimTableFactoryTest slimTableFactoryTest0 = new fitnesse.testsystems.slim.tables.SlimTableFactoryTest();
        fitnesse.testsystems.slim.Table table1 = null;
        slimTableFactoryTest0.table = table1;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory3 = slimTableFactoryTest0.slimTableFactory;
        java.util.Map<java.lang.String, java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable>> strMap4 = slimTableFactoryTest0.getmap();
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory5 = slimTableFactoryTest0.slimTableFactory;
        java.util.Map<java.lang.String, java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable>> strMap6 = slimTableFactoryTest0.getmap();
        fitnesse.testsystems.slim.Table table7 = null;
        slimTableFactoryTest0.table = table7;
        java.util.Map<java.lang.String, java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable>> strMap9 = slimTableFactoryTest0.map;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass10 = strMap9.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(slimTableFactory3);
        org.junit.Assert.assertNull(strMap4);
        org.junit.Assert.assertNull(slimTableFactory5);
        org.junit.Assert.assertNull(strMap6);
        org.junit.Assert.assertNull(strMap9);
    }

    @Test
    public void test01108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01108");
        fitnesse.testsystems.slim.tables.SlimTableFactoryTest slimTableFactoryTest0 = new fitnesse.testsystems.slim.tables.SlimTableFactoryTest();
        fitnesse.testsystems.slim.Table table1 = null;
        slimTableFactoryTest0.table = table1;
        fitnesse.testsystems.slim.Table table3 = null;
        slimTableFactoryTest0.settable(table3);
        java.util.Map<java.lang.String, java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable>> strMap5 = slimTableFactoryTest0.map;
        java.util.Map<java.lang.String, java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable>> strMap6 = slimTableFactoryTest0.getmap();
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory7 = slimTableFactoryTest0.slimTableFactory;
        java.util.Map<java.lang.String, java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable>> strMap8 = slimTableFactoryTest0.map;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory9 = slimTableFactoryTest0.slimTableFactory;
        fitnesse.testsystems.slim.Table table10 = null;
        slimTableFactoryTest0.settable(table10);
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory12 = null;
        slimTableFactoryTest0.slimTableFactory = slimTableFactory12;
        // The following exception was thrown during execution in test generation
        try {
            slimTableFactoryTest0.addTableTypeImport("", "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(strMap5);
        org.junit.Assert.assertNull(strMap6);
        org.junit.Assert.assertNull(slimTableFactory7);
        org.junit.Assert.assertNull(strMap8);
        org.junit.Assert.assertNull(slimTableFactory9);
    }

    @Test
    public void test01109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01109");
        fitnesse.testsystems.slim.tables.SlimTableFactoryTest slimTableFactoryTest0 = new fitnesse.testsystems.slim.tables.SlimTableFactoryTest();
        fitnesse.testsystems.slim.Table table1 = slimTableFactoryTest0.table;
        java.util.Map<java.lang.String, java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable>> strMap2 = slimTableFactoryTest0.getmap();
        java.util.Map<java.lang.String, java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable>> strMap3 = slimTableFactoryTest0.getmap();
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory4 = slimTableFactoryTest0.slimTableFactory;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory5 = slimTableFactoryTest0.getslimTableFactory();
        fitnesse.testsystems.slim.Table table6 = null;
        slimTableFactoryTest0.table = table6;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory8 = null;
        slimTableFactoryTest0.slimTableFactory = slimTableFactory8;
        java.lang.Class<?> wildcardClass10 = slimTableFactoryTest0.getClass();
        org.junit.Assert.assertNull(table1);
        org.junit.Assert.assertNull(strMap2);
        org.junit.Assert.assertNull(strMap3);
        org.junit.Assert.assertNull(slimTableFactory4);
        org.junit.Assert.assertNull(slimTableFactory5);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test01110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01110");
        fitnesse.testsystems.slim.tables.SlimTableFactoryTest slimTableFactoryTest0 = new fitnesse.testsystems.slim.tables.SlimTableFactoryTest();
        fitnesse.testsystems.slim.Table table1 = null;
        slimTableFactoryTest0.table = table1;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory3 = null;
        slimTableFactoryTest0.slimTableFactory = slimTableFactory3;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory5 = slimTableFactoryTest0.getslimTableFactory();
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory6 = slimTableFactoryTest0.slimTableFactory;
        java.util.Map<java.lang.String, java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable>> strMap7 = slimTableFactoryTest0.getmap();
        // The following exception was thrown during execution in test generation
        try {
            slimTableFactoryTest0.addTableTypeImport("hi!", "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(slimTableFactory5);
        org.junit.Assert.assertNull(slimTableFactory6);
        org.junit.Assert.assertNull(strMap7);
    }

    @Test
    public void test01111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01111");
        fitnesse.testsystems.slim.tables.SlimTableFactoryTest slimTableFactoryTest0 = new fitnesse.testsystems.slim.tables.SlimTableFactoryTest();
        fitnesse.testsystems.slim.Table table1 = null;
        slimTableFactoryTest0.table = table1;
        fitnesse.testsystems.slim.Table table3 = slimTableFactoryTest0.table;
        fitnesse.testsystems.slim.Table table4 = slimTableFactoryTest0.gettable();
        fitnesse.testsystems.slim.Table table5 = slimTableFactoryTest0.gettable();
        java.lang.Class<?> wildcardClass6 = slimTableFactoryTest0.getClass();
        org.junit.Assert.assertNull(table3);
        org.junit.Assert.assertNull(table4);
        org.junit.Assert.assertNull(table5);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test01112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01112");
        fitnesse.testsystems.slim.tables.SlimTableFactoryTest slimTableFactoryTest0 = new fitnesse.testsystems.slim.tables.SlimTableFactoryTest();
        fitnesse.testsystems.slim.Table table1 = null;
        slimTableFactoryTest0.table = table1;
        fitnesse.testsystems.slim.Table table3 = null;
        slimTableFactoryTest0.settable(table3);
        java.util.Map<java.lang.String, java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable>> strMap5 = slimTableFactoryTest0.map;
        java.util.Map<java.lang.String, java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable>> strMap6 = slimTableFactoryTest0.getmap();
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory7 = null;
        slimTableFactoryTest0.slimTableFactory = slimTableFactory7;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory9 = null;
        slimTableFactoryTest0.setslimTableFactory(slimTableFactory9);
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory11 = null;
        slimTableFactoryTest0.setslimTableFactory(slimTableFactory11);
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory13 = null;
        slimTableFactoryTest0.setslimTableFactory(slimTableFactory13);
        // The following exception was thrown during execution in test generation
        try {
            slimTableFactoryTest0.shouldCreateCorrectSlimTableForTablesType();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(strMap5);
        org.junit.Assert.assertNull(strMap6);
    }

    @Test
    public void test01113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01113");
        fitnesse.testsystems.slim.tables.SlimTableFactoryTest slimTableFactoryTest0 = new fitnesse.testsystems.slim.tables.SlimTableFactoryTest();
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory1 = slimTableFactoryTest0.slimTableFactory;
        fitnesse.testsystems.slim.Table table2 = slimTableFactoryTest0.gettable();
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory3 = null;
        slimTableFactoryTest0.slimTableFactory = slimTableFactory3;
        fitnesse.testsystems.slim.Table table5 = null;
        slimTableFactoryTest0.settable(table5);
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory7 = slimTableFactoryTest0.slimTableFactory;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory8 = slimTableFactoryTest0.getslimTableFactory();
        fitnesse.testsystems.slim.Table table9 = slimTableFactoryTest0.gettable();
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory10 = null;
        slimTableFactoryTest0.slimTableFactory = slimTableFactory10;
        // The following exception was thrown during execution in test generation
        try {
            slimTableFactoryTest0.tableTypeStartingWithcommentColonShouldReturnNull();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(slimTableFactory1);
        org.junit.Assert.assertNull(table2);
        org.junit.Assert.assertNull(slimTableFactory7);
        org.junit.Assert.assertNull(slimTableFactory8);
        org.junit.Assert.assertNull(table9);
    }

    @Test
    public void test01114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01114");
        fitnesse.testsystems.slim.tables.SlimTableFactoryTest slimTableFactoryTest0 = new fitnesse.testsystems.slim.tables.SlimTableFactoryTest();
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory1 = slimTableFactoryTest0.slimTableFactory;
        fitnesse.testsystems.slim.Table table2 = slimTableFactoryTest0.gettable();
        fitnesse.testsystems.slim.Table table3 = null;
        slimTableFactoryTest0.table = table3;
        fitnesse.testsystems.slim.Table table5 = null;
        slimTableFactoryTest0.table = table5;
        fitnesse.testsystems.slim.Table table7 = null;
        slimTableFactoryTest0.table = table7;
        // The following exception was thrown during execution in test generation
        try {
            slimTableFactoryTest0.checkTableTypeDefineUsedForTable();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(slimTableFactory1);
        org.junit.Assert.assertNull(table2);
    }

    @Test
    public void test01115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01115");
        fitnesse.testsystems.slim.tables.SlimTableFactoryTest slimTableFactoryTest0 = new fitnesse.testsystems.slim.tables.SlimTableFactoryTest();
        fitnesse.testsystems.slim.Table table1 = null;
        slimTableFactoryTest0.table = table1;
        fitnesse.testsystems.slim.Table table3 = null;
        slimTableFactoryTest0.settable(table3);
        fitnesse.testsystems.slim.Table table5 = null;
        slimTableFactoryTest0.settable(table5);
        fitnesse.testsystems.slim.Table table7 = slimTableFactoryTest0.table;
        fitnesse.testsystems.slim.Table table8 = null;
        slimTableFactoryTest0.settable(table8);
        java.util.Map<java.lang.String, java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable>> strMap10 = slimTableFactoryTest0.getmap();
        fitnesse.testsystems.slim.Table table11 = null;
        slimTableFactoryTest0.table = table11;
        fitnesse.testsystems.slim.Table table13 = slimTableFactoryTest0.table;
        // The following exception was thrown during execution in test generation
        try {
            slimTableFactoryTest0.commentTableShouldReturnNull();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(table7);
        org.junit.Assert.assertNull(strMap10);
        org.junit.Assert.assertNull(table13);
    }

    @Test
    public void test01116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01116");
        fitnesse.testsystems.slim.tables.SlimTableFactoryTest slimTableFactoryTest0 = new fitnesse.testsystems.slim.tables.SlimTableFactoryTest();
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory1 = slimTableFactoryTest0.slimTableFactory;
        fitnesse.testsystems.slim.Table table2 = slimTableFactoryTest0.table;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory3 = null;
        slimTableFactoryTest0.setslimTableFactory(slimTableFactory3);
        fitnesse.testsystems.slim.Table table5 = null;
        slimTableFactoryTest0.settable(table5);
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory7 = slimTableFactoryTest0.getslimTableFactory();
        java.util.Map<java.lang.String, java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable>> strMap8 = slimTableFactoryTest0.map;
        // The following exception was thrown during execution in test generation
        try {
            slimTableFactoryTest0.tableTypeStartingWithcommentColonShouldReturnNull();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(slimTableFactory1);
        org.junit.Assert.assertNull(table2);
        org.junit.Assert.assertNull(slimTableFactory7);
        org.junit.Assert.assertNull(strMap8);
    }

    @Test
    public void test01117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01117");
        fitnesse.testsystems.slim.tables.SlimTableFactoryTest slimTableFactoryTest0 = new fitnesse.testsystems.slim.tables.SlimTableFactoryTest();
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory1 = slimTableFactoryTest0.slimTableFactory;
        fitnesse.testsystems.slim.Table table2 = slimTableFactoryTest0.gettable();
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory3 = null;
        slimTableFactoryTest0.slimTableFactory = slimTableFactory3;
        fitnesse.testsystems.slim.Table table5 = null;
        slimTableFactoryTest0.settable(table5);
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory7 = slimTableFactoryTest0.slimTableFactory;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory8 = slimTableFactoryTest0.getslimTableFactory();
        fitnesse.testsystems.slim.Table table9 = slimTableFactoryTest0.gettable();
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory10 = null;
        slimTableFactoryTest0.slimTableFactory = slimTableFactory10;
        fitnesse.testsystems.slim.Table table12 = slimTableFactoryTest0.gettable();
        // The following exception was thrown during execution in test generation
        try {
            slimTableFactoryTest0.addTableTypeImport("hi!", "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(slimTableFactory1);
        org.junit.Assert.assertNull(table2);
        org.junit.Assert.assertNull(slimTableFactory7);
        org.junit.Assert.assertNull(slimTableFactory8);
        org.junit.Assert.assertNull(table9);
        org.junit.Assert.assertNull(table12);
    }

    @Test
    public void test01118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01118");
        fitnesse.testsystems.slim.tables.SlimTableFactoryTest slimTableFactoryTest0 = new fitnesse.testsystems.slim.tables.SlimTableFactoryTest();
        fitnesse.testsystems.slim.Table table1 = null;
        slimTableFactoryTest0.table = table1;
        fitnesse.testsystems.slim.Table table3 = null;
        slimTableFactoryTest0.settable(table3);
        java.util.Map<java.lang.String, java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable>> strMap5 = slimTableFactoryTest0.map;
        java.util.Map<java.lang.String, java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable>> strMap6 = slimTableFactoryTest0.getmap();
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory7 = slimTableFactoryTest0.slimTableFactory;
        java.util.Map<java.lang.String, java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable>> strMap8 = slimTableFactoryTest0.map;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory9 = slimTableFactoryTest0.slimTableFactory;
        fitnesse.testsystems.slim.Table table10 = null;
        slimTableFactoryTest0.settable(table10);
        fitnesse.testsystems.slim.Table table12 = slimTableFactoryTest0.gettable();
        fitnesse.testsystems.slim.Table table13 = null;
        slimTableFactoryTest0.table = table13;
        java.lang.Class<?> wildcardClass15 = slimTableFactoryTest0.getClass();
        org.junit.Assert.assertNull(strMap5);
        org.junit.Assert.assertNull(strMap6);
        org.junit.Assert.assertNull(slimTableFactory7);
        org.junit.Assert.assertNull(strMap8);
        org.junit.Assert.assertNull(slimTableFactory9);
        org.junit.Assert.assertNull(table12);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test01119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01119");
        fitnesse.testsystems.slim.tables.SlimTableFactoryTest slimTableFactoryTest0 = new fitnesse.testsystems.slim.tables.SlimTableFactoryTest();
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory1 = slimTableFactoryTest0.slimTableFactory;
        fitnesse.testsystems.slim.Table table2 = slimTableFactoryTest0.gettable();
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory3 = null;
        slimTableFactoryTest0.setslimTableFactory(slimTableFactory3);
        // The following exception was thrown during execution in test generation
        try {
            slimTableFactoryTest0.addTableTypeImport("hi!", "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(slimTableFactory1);
        org.junit.Assert.assertNull(table2);
    }

    @Test
    public void test01120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01120");
        fitnesse.testsystems.slim.tables.SlimTableFactoryTest slimTableFactoryTest0 = new fitnesse.testsystems.slim.tables.SlimTableFactoryTest();
        fitnesse.testsystems.slim.Table table1 = null;
        slimTableFactoryTest0.table = table1;
        fitnesse.testsystems.slim.Table table3 = null;
        slimTableFactoryTest0.settable(table3);
        fitnesse.testsystems.slim.Table table5 = null;
        slimTableFactoryTest0.settable(table5);
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory7 = slimTableFactoryTest0.slimTableFactory;
        java.util.Map<java.lang.String, java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable>> strMap8 = slimTableFactoryTest0.getmap();
        fitnesse.testsystems.slim.Table table9 = null;
        slimTableFactoryTest0.table = table9;
        // The following exception was thrown during execution in test generation
        try {
            slimTableFactoryTest0.addTableTypeImport("hi!", "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(slimTableFactory7);
        org.junit.Assert.assertNull(strMap8);
    }

    @Test
    public void test01121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01121");
        fitnesse.testsystems.slim.tables.SlimTableFactoryTest slimTableFactoryTest0 = new fitnesse.testsystems.slim.tables.SlimTableFactoryTest();
        fitnesse.testsystems.slim.Table table1 = null;
        slimTableFactoryTest0.table = table1;
        fitnesse.testsystems.slim.Table table3 = slimTableFactoryTest0.table;
        fitnesse.testsystems.slim.Table table4 = slimTableFactoryTest0.gettable();
        java.util.Map<java.lang.String, java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable>> strMap5 = slimTableFactoryTest0.getmap();
        java.util.Map<java.lang.String, java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable>> strMap6 = slimTableFactoryTest0.map;
        fitnesse.testsystems.slim.Table table7 = slimTableFactoryTest0.table;
        fitnesse.testsystems.slim.Table table8 = slimTableFactoryTest0.gettable();
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory9 = slimTableFactoryTest0.slimTableFactory;
        fitnesse.testsystems.slim.Table table10 = null;
        slimTableFactoryTest0.table = table10;
        java.lang.Class<?> wildcardClass12 = slimTableFactoryTest0.getClass();
        org.junit.Assert.assertNull(table3);
        org.junit.Assert.assertNull(table4);
        org.junit.Assert.assertNull(strMap5);
        org.junit.Assert.assertNull(strMap6);
        org.junit.Assert.assertNull(table7);
        org.junit.Assert.assertNull(table8);
        org.junit.Assert.assertNull(slimTableFactory9);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test01122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01122");
        fitnesse.testsystems.slim.tables.SlimTableFactoryTest slimTableFactoryTest0 = new fitnesse.testsystems.slim.tables.SlimTableFactoryTest();
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory1 = slimTableFactoryTest0.slimTableFactory;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory2 = slimTableFactoryTest0.slimTableFactory;
        fitnesse.testsystems.slim.Table table3 = null;
        slimTableFactoryTest0.settable(table3);
        fitnesse.testsystems.slim.Table table5 = slimTableFactoryTest0.table;
        fitnesse.testsystems.slim.Table table6 = null;
        slimTableFactoryTest0.table = table6;
        // The following exception was thrown during execution in test generation
        try {
            slimTableFactoryTest0.shouldCreateCorrectSlimTableForTablesType();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(slimTableFactory1);
        org.junit.Assert.assertNull(slimTableFactory2);
        org.junit.Assert.assertNull(table5);
    }

    @Test
    public void test01123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01123");
        fitnesse.testsystems.slim.tables.SlimTableFactoryTest slimTableFactoryTest0 = new fitnesse.testsystems.slim.tables.SlimTableFactoryTest();
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory1 = slimTableFactoryTest0.slimTableFactory;
        fitnesse.testsystems.slim.Table table2 = slimTableFactoryTest0.gettable();
        fitnesse.testsystems.slim.Table table3 = null;
        slimTableFactoryTest0.table = table3;
        fitnesse.testsystems.slim.Table table5 = null;
        slimTableFactoryTest0.table = table5;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory7 = slimTableFactoryTest0.getslimTableFactory();
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory8 = null;
        slimTableFactoryTest0.slimTableFactory = slimTableFactory8;
        // The following exception was thrown during execution in test generation
        try {
            slimTableFactoryTest0.addTableTypeImport("", "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(slimTableFactory1);
        org.junit.Assert.assertNull(table2);
        org.junit.Assert.assertNull(slimTableFactory7);
    }

    @Test
    public void test01124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01124");
        fitnesse.testsystems.slim.tables.SlimTableFactoryTest slimTableFactoryTest0 = new fitnesse.testsystems.slim.tables.SlimTableFactoryTest();
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory1 = slimTableFactoryTest0.slimTableFactory;
        fitnesse.testsystems.slim.Table table2 = slimTableFactoryTest0.gettable();
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory3 = null;
        slimTableFactoryTest0.slimTableFactory = slimTableFactory3;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory5 = null;
        slimTableFactoryTest0.slimTableFactory = slimTableFactory5;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory7 = null;
        slimTableFactoryTest0.setslimTableFactory(slimTableFactory7);
        fitnesse.testsystems.slim.Table table9 = null;
        slimTableFactoryTest0.settable(table9);
        java.lang.Class<?> wildcardClass11 = slimTableFactoryTest0.getClass();
        org.junit.Assert.assertNull(slimTableFactory1);
        org.junit.Assert.assertNull(table2);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test01125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01125");
        fitnesse.testsystems.slim.tables.SlimTableFactoryTest slimTableFactoryTest0 = new fitnesse.testsystems.slim.tables.SlimTableFactoryTest();
        fitnesse.testsystems.slim.Table table1 = null;
        slimTableFactoryTest0.table = table1;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory3 = slimTableFactoryTest0.slimTableFactory;
        java.util.Map<java.lang.String, java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable>> strMap4 = slimTableFactoryTest0.getmap();
        fitnesse.testsystems.slim.Table table5 = null;
        slimTableFactoryTest0.settable(table5);
        fitnesse.testsystems.slim.Table table7 = null;
        slimTableFactoryTest0.table = table7;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory9 = null;
        slimTableFactoryTest0.slimTableFactory = slimTableFactory9;
        java.util.Map<java.lang.String, java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable>> strMap11 = slimTableFactoryTest0.map;
        fitnesse.testsystems.slim.Table table12 = null;
        slimTableFactoryTest0.settable(table12);
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory14 = null;
        slimTableFactoryTest0.slimTableFactory = slimTableFactory14;
        java.util.Map<java.lang.String, java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable>> strMap16 = slimTableFactoryTest0.getmap();
        // The following exception was thrown during execution in test generation
        try {
            slimTableFactoryTest0.commentTableShouldReturnNull();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(slimTableFactory3);
        org.junit.Assert.assertNull(strMap4);
        org.junit.Assert.assertNull(strMap11);
        org.junit.Assert.assertNull(strMap16);
    }

    @Test
    public void test01126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01126");
        fitnesse.testsystems.slim.tables.SlimTableFactoryTest slimTableFactoryTest0 = new fitnesse.testsystems.slim.tables.SlimTableFactoryTest();
        fitnesse.testsystems.slim.Table table1 = null;
        slimTableFactoryTest0.table = table1;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory3 = slimTableFactoryTest0.slimTableFactory;
        java.util.Map<java.lang.String, java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable>> strMap4 = slimTableFactoryTest0.getmap();
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory5 = null;
        slimTableFactoryTest0.setslimTableFactory(slimTableFactory5);
        fitnesse.testsystems.slim.Table table7 = slimTableFactoryTest0.gettable();
        fitnesse.testsystems.slim.Table table8 = slimTableFactoryTest0.table;
        // The following exception was thrown during execution in test generation
        try {
            slimTableFactoryTest0.commentTableShouldReturnNull();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(slimTableFactory3);
        org.junit.Assert.assertNull(strMap4);
        org.junit.Assert.assertNull(table7);
        org.junit.Assert.assertNull(table8);
    }

    @Test
    public void test01127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01127");
        fitnesse.testsystems.slim.tables.SlimTableFactoryTest slimTableFactoryTest0 = new fitnesse.testsystems.slim.tables.SlimTableFactoryTest();
        fitnesse.testsystems.slim.Table table1 = null;
        slimTableFactoryTest0.table = table1;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory3 = slimTableFactoryTest0.slimTableFactory;
        java.util.Map<java.lang.String, java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable>> strMap4 = slimTableFactoryTest0.getmap();
        fitnesse.testsystems.slim.Table table5 = null;
        slimTableFactoryTest0.settable(table5);
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory7 = null;
        slimTableFactoryTest0.setslimTableFactory(slimTableFactory7);
        fitnesse.testsystems.slim.Table table9 = slimTableFactoryTest0.table;
        fitnesse.testsystems.slim.Table table10 = slimTableFactoryTest0.gettable();
        fitnesse.testsystems.slim.Table table11 = null;
        slimTableFactoryTest0.table = table11;
        java.util.Map<java.lang.String, java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable>> strMap13 = slimTableFactoryTest0.getmap();
        fitnesse.testsystems.slim.Table table14 = null;
        slimTableFactoryTest0.table = table14;
        // The following exception was thrown during execution in test generation
        try {
            slimTableFactoryTest0.tableTypeStartingWithcommentColonShouldReturnNull();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(slimTableFactory3);
        org.junit.Assert.assertNull(strMap4);
        org.junit.Assert.assertNull(table9);
        org.junit.Assert.assertNull(table10);
        org.junit.Assert.assertNull(strMap13);
    }

    @Test
    public void test01128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01128");
        fitnesse.testsystems.slim.tables.SlimTableFactoryTest slimTableFactoryTest0 = new fitnesse.testsystems.slim.tables.SlimTableFactoryTest();
        fitnesse.testsystems.slim.Table table1 = null;
        slimTableFactoryTest0.table = table1;
        fitnesse.testsystems.slim.Table table3 = slimTableFactoryTest0.table;
        fitnesse.testsystems.slim.Table table4 = slimTableFactoryTest0.gettable();
        java.util.Map<java.lang.String, java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable>> strMap5 = slimTableFactoryTest0.getmap();
        java.util.Map<java.lang.String, java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable>> strMap6 = slimTableFactoryTest0.map;
        fitnesse.testsystems.slim.Table table7 = slimTableFactoryTest0.table;
        java.util.Map<java.lang.String, java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable>> strMap8 = slimTableFactoryTest0.getmap();
        // The following exception was thrown during execution in test generation
        try {
            slimTableFactoryTest0.checkTableTypeDefineUsedForTable();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(table3);
        org.junit.Assert.assertNull(table4);
        org.junit.Assert.assertNull(strMap5);
        org.junit.Assert.assertNull(strMap6);
        org.junit.Assert.assertNull(table7);
        org.junit.Assert.assertNull(strMap8);
    }

    @Test
    public void test01129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01129");
        fitnesse.testsystems.slim.tables.SlimTableFactoryTest slimTableFactoryTest0 = new fitnesse.testsystems.slim.tables.SlimTableFactoryTest();
        fitnesse.testsystems.slim.Table table1 = null;
        slimTableFactoryTest0.table = table1;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory3 = slimTableFactoryTest0.slimTableFactory;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory4 = null;
        slimTableFactoryTest0.slimTableFactory = slimTableFactory4;
        fitnesse.testsystems.slim.Table table6 = slimTableFactoryTest0.gettable();
        fitnesse.testsystems.slim.Table table7 = null;
        slimTableFactoryTest0.table = table7;
        // The following exception was thrown during execution in test generation
        try {
            slimTableFactoryTest0.commentTableShouldReturnNull();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(slimTableFactory3);
        org.junit.Assert.assertNull(table6);
    }

    @Test
    public void test01130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01130");
        fitnesse.testsystems.slim.tables.SlimTableFactoryTest slimTableFactoryTest0 = new fitnesse.testsystems.slim.tables.SlimTableFactoryTest();
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory1 = slimTableFactoryTest0.slimTableFactory;
        fitnesse.testsystems.slim.Table table2 = slimTableFactoryTest0.gettable();
        fitnesse.testsystems.slim.Table table3 = null;
        slimTableFactoryTest0.table = table3;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory5 = null;
        slimTableFactoryTest0.setslimTableFactory(slimTableFactory5);
        java.util.Map<java.lang.String, java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable>> strMap7 = slimTableFactoryTest0.map;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory8 = slimTableFactoryTest0.slimTableFactory;
        java.util.Map<java.lang.String, java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable>> strMap9 = slimTableFactoryTest0.getmap();
        // The following exception was thrown during execution in test generation
        try {
            slimTableFactoryTest0.commentTableShouldReturnNull();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(slimTableFactory1);
        org.junit.Assert.assertNull(table2);
        org.junit.Assert.assertNull(strMap7);
        org.junit.Assert.assertNull(slimTableFactory8);
        org.junit.Assert.assertNull(strMap9);
    }

    @Test
    public void test01131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01131");
        fitnesse.testsystems.slim.tables.SlimTableFactoryTest slimTableFactoryTest0 = new fitnesse.testsystems.slim.tables.SlimTableFactoryTest();
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory1 = slimTableFactoryTest0.slimTableFactory;
        fitnesse.testsystems.slim.Table table2 = null;
        slimTableFactoryTest0.settable(table2);
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory4 = null;
        slimTableFactoryTest0.setslimTableFactory(slimTableFactory4);
        // The following exception was thrown during execution in test generation
        try {
            slimTableFactoryTest0.shouldCreateCorrectSlimTableForTablesType();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(slimTableFactory1);
    }

    @Test
    public void test01132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01132");
        fitnesse.testsystems.slim.tables.SlimTableFactoryTest slimTableFactoryTest0 = new fitnesse.testsystems.slim.tables.SlimTableFactoryTest();
        fitnesse.testsystems.slim.Table table1 = null;
        slimTableFactoryTest0.table = table1;
        fitnesse.testsystems.slim.Table table3 = null;
        slimTableFactoryTest0.settable(table3);
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory5 = null;
        slimTableFactoryTest0.setslimTableFactory(slimTableFactory5);
        fitnesse.testsystems.slim.Table table7 = slimTableFactoryTest0.table;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory8 = slimTableFactoryTest0.getslimTableFactory();
        fitnesse.testsystems.slim.Table table9 = slimTableFactoryTest0.gettable();
        java.util.Map<java.lang.String, java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable>> strMap10 = slimTableFactoryTest0.getmap();
        // The following exception was thrown during execution in test generation
        try {
            slimTableFactoryTest0.tableTypeStartingWithcommentColonShouldReturnNull();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(table7);
        org.junit.Assert.assertNull(slimTableFactory8);
        org.junit.Assert.assertNull(table9);
        org.junit.Assert.assertNull(strMap10);
    }

    @Test
    public void test01133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01133");
        fitnesse.testsystems.slim.tables.SlimTableFactoryTest slimTableFactoryTest0 = new fitnesse.testsystems.slim.tables.SlimTableFactoryTest();
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory1 = slimTableFactoryTest0.slimTableFactory;
        fitnesse.testsystems.slim.Table table2 = slimTableFactoryTest0.gettable();
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory3 = null;
        slimTableFactoryTest0.slimTableFactory = slimTableFactory3;
        fitnesse.testsystems.slim.Table table5 = null;
        slimTableFactoryTest0.settable(table5);
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory7 = slimTableFactoryTest0.slimTableFactory;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory8 = slimTableFactoryTest0.getslimTableFactory();
        fitnesse.testsystems.slim.Table table9 = slimTableFactoryTest0.gettable();
        // The following exception was thrown during execution in test generation
        try {
            slimTableFactoryTest0.checkTableTypeDefinesIgnoredIfDifferentSpecified();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(slimTableFactory1);
        org.junit.Assert.assertNull(table2);
        org.junit.Assert.assertNull(slimTableFactory7);
        org.junit.Assert.assertNull(slimTableFactory8);
        org.junit.Assert.assertNull(table9);
    }

    @Test
    public void test01134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01134");
        fitnesse.testsystems.slim.tables.SlimTableFactoryTest slimTableFactoryTest0 = new fitnesse.testsystems.slim.tables.SlimTableFactoryTest();
        fitnesse.testsystems.slim.Table table1 = null;
        slimTableFactoryTest0.table = table1;
        fitnesse.testsystems.slim.Table table3 = slimTableFactoryTest0.table;
        fitnesse.testsystems.slim.Table table4 = slimTableFactoryTest0.gettable();
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory5 = slimTableFactoryTest0.slimTableFactory;
        java.util.Map<java.lang.String, java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable>> strMap6 = slimTableFactoryTest0.map;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory7 = null;
        slimTableFactoryTest0.slimTableFactory = slimTableFactory7;
        // The following exception was thrown during execution in test generation
        try {
            slimTableFactoryTest0.shouldCreateCorrectSlimTableForTablesType();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(table3);
        org.junit.Assert.assertNull(table4);
        org.junit.Assert.assertNull(slimTableFactory5);
        org.junit.Assert.assertNull(strMap6);
    }

    @Test
    public void test01135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01135");
        fitnesse.testsystems.slim.tables.SlimTableFactoryTest slimTableFactoryTest0 = new fitnesse.testsystems.slim.tables.SlimTableFactoryTest();
        fitnesse.testsystems.slim.Table table1 = null;
        slimTableFactoryTest0.table = table1;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory3 = slimTableFactoryTest0.slimTableFactory;
        java.util.Map<java.lang.String, java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable>> strMap4 = slimTableFactoryTest0.getmap();
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory5 = slimTableFactoryTest0.slimTableFactory;
        java.util.Map<java.lang.String, java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable>> strMap6 = slimTableFactoryTest0.getmap();
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory7 = slimTableFactoryTest0.slimTableFactory;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory8 = null;
        slimTableFactoryTest0.slimTableFactory = slimTableFactory8;
        java.util.Map<java.lang.String, java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable>> strMap10 = slimTableFactoryTest0.map;
        // The following exception was thrown during execution in test generation
        try {
            slimTableFactoryTest0.shouldCreateCorrectSlimTableForTablesType();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(slimTableFactory3);
        org.junit.Assert.assertNull(strMap4);
        org.junit.Assert.assertNull(slimTableFactory5);
        org.junit.Assert.assertNull(strMap6);
        org.junit.Assert.assertNull(slimTableFactory7);
        org.junit.Assert.assertNull(strMap10);
    }

    @Test
    public void test01136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01136");
        fitnesse.testsystems.slim.tables.SlimTableFactoryTest slimTableFactoryTest0 = new fitnesse.testsystems.slim.tables.SlimTableFactoryTest();
        fitnesse.testsystems.slim.Table table1 = null;
        slimTableFactoryTest0.table = table1;
        fitnesse.testsystems.slim.Table table3 = null;
        slimTableFactoryTest0.settable(table3);
        java.util.Map<java.lang.String, java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable>> strMap5 = slimTableFactoryTest0.map;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory6 = slimTableFactoryTest0.getslimTableFactory();
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory7 = slimTableFactoryTest0.getslimTableFactory();
        fitnesse.testsystems.slim.Table table8 = slimTableFactoryTest0.gettable();
        fitnesse.testsystems.slim.Table table9 = null;
        slimTableFactoryTest0.settable(table9);
        fitnesse.testsystems.slim.Table table11 = null;
        slimTableFactoryTest0.table = table11;
        fitnesse.testsystems.slim.Table table13 = null;
        slimTableFactoryTest0.settable(table13);
        java.lang.Class<?> wildcardClass15 = slimTableFactoryTest0.getClass();
        org.junit.Assert.assertNull(strMap5);
        org.junit.Assert.assertNull(slimTableFactory6);
        org.junit.Assert.assertNull(slimTableFactory7);
        org.junit.Assert.assertNull(table8);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test01137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01137");
        fitnesse.testsystems.slim.tables.SlimTableFactoryTest slimTableFactoryTest0 = new fitnesse.testsystems.slim.tables.SlimTableFactoryTest();
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory1 = slimTableFactoryTest0.slimTableFactory;
        fitnesse.testsystems.slim.Table table2 = slimTableFactoryTest0.gettable();
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory3 = null;
        slimTableFactoryTest0.slimTableFactory = slimTableFactory3;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory5 = null;
        slimTableFactoryTest0.slimTableFactory = slimTableFactory5;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory7 = null;
        slimTableFactoryTest0.setslimTableFactory(slimTableFactory7);
        fitnesse.testsystems.slim.Table table9 = slimTableFactoryTest0.table;
        fitnesse.testsystems.slim.Table table10 = slimTableFactoryTest0.gettable();
        java.util.Map<java.lang.String, java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable>> strMap11 = slimTableFactoryTest0.getmap();
        // The following exception was thrown during execution in test generation
        try {
            slimTableFactoryTest0.tableTypeStartingWithcommentColonShouldReturnNull();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(slimTableFactory1);
        org.junit.Assert.assertNull(table2);
        org.junit.Assert.assertNull(table9);
        org.junit.Assert.assertNull(table10);
        org.junit.Assert.assertNull(strMap11);
    }

    @Test
    public void test01138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01138");
        fitnesse.testsystems.slim.tables.SlimTableFactoryTest slimTableFactoryTest0 = new fitnesse.testsystems.slim.tables.SlimTableFactoryTest();
        fitnesse.testsystems.slim.Table table1 = null;
        slimTableFactoryTest0.table = table1;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory3 = null;
        slimTableFactoryTest0.slimTableFactory = slimTableFactory3;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory5 = slimTableFactoryTest0.getslimTableFactory();
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory6 = null;
        slimTableFactoryTest0.setslimTableFactory(slimTableFactory6);
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory8 = slimTableFactoryTest0.getslimTableFactory();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass9 = slimTableFactory8.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(slimTableFactory5);
        org.junit.Assert.assertNull(slimTableFactory8);
    }

    @Test
    public void test01139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01139");
        fitnesse.testsystems.slim.tables.SlimTableFactoryTest slimTableFactoryTest0 = new fitnesse.testsystems.slim.tables.SlimTableFactoryTest();
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory1 = slimTableFactoryTest0.slimTableFactory;
        fitnesse.testsystems.slim.Table table2 = slimTableFactoryTest0.gettable();
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory3 = null;
        slimTableFactoryTest0.slimTableFactory = slimTableFactory3;
        fitnesse.testsystems.slim.Table table5 = null;
        slimTableFactoryTest0.settable(table5);
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory7 = slimTableFactoryTest0.slimTableFactory;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory8 = slimTableFactoryTest0.getslimTableFactory();
        fitnesse.testsystems.slim.Table table9 = slimTableFactoryTest0.gettable();
        fitnesse.testsystems.slim.Table table10 = slimTableFactoryTest0.gettable();
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory11 = null;
        slimTableFactoryTest0.slimTableFactory = slimTableFactory11;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory13 = slimTableFactoryTest0.slimTableFactory;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory14 = null;
        slimTableFactoryTest0.slimTableFactory = slimTableFactory14;
        // The following exception was thrown during execution in test generation
        try {
            slimTableFactoryTest0.addTableTypeImport("", "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(slimTableFactory1);
        org.junit.Assert.assertNull(table2);
        org.junit.Assert.assertNull(slimTableFactory7);
        org.junit.Assert.assertNull(slimTableFactory8);
        org.junit.Assert.assertNull(table9);
        org.junit.Assert.assertNull(table10);
        org.junit.Assert.assertNull(slimTableFactory13);
    }

    @Test
    public void test01140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01140");
        fitnesse.testsystems.slim.tables.SlimTableFactoryTest slimTableFactoryTest0 = new fitnesse.testsystems.slim.tables.SlimTableFactoryTest();
        fitnesse.testsystems.slim.Table table1 = null;
        slimTableFactoryTest0.table = table1;
        fitnesse.testsystems.slim.Table table3 = null;
        slimTableFactoryTest0.settable(table3);
        java.util.Map<java.lang.String, java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable>> strMap5 = slimTableFactoryTest0.map;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory6 = slimTableFactoryTest0.getslimTableFactory();
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory7 = slimTableFactoryTest0.getslimTableFactory();
        fitnesse.testsystems.slim.Table table8 = slimTableFactoryTest0.gettable();
        fitnesse.testsystems.slim.Table table9 = null;
        slimTableFactoryTest0.settable(table9);
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory11 = null;
        slimTableFactoryTest0.slimTableFactory = slimTableFactory11;
        fitnesse.testsystems.slim.Table table13 = slimTableFactoryTest0.gettable();
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory14 = slimTableFactoryTest0.slimTableFactory;
        java.util.Map<java.lang.String, java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable>> strMap15 = slimTableFactoryTest0.getmap();
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory16 = null;
        slimTableFactoryTest0.slimTableFactory = slimTableFactory16;
        fitnesse.testsystems.slim.Table table18 = slimTableFactoryTest0.table;
        // The following exception was thrown during execution in test generation
        try {
            slimTableFactoryTest0.addTableTypeImport("", "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(strMap5);
        org.junit.Assert.assertNull(slimTableFactory6);
        org.junit.Assert.assertNull(slimTableFactory7);
        org.junit.Assert.assertNull(table8);
        org.junit.Assert.assertNull(table13);
        org.junit.Assert.assertNull(slimTableFactory14);
        org.junit.Assert.assertNull(strMap15);
        org.junit.Assert.assertNull(table18);
    }

    @Test
    public void test01141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01141");
        fitnesse.testsystems.slim.tables.SlimTableFactoryTest slimTableFactoryTest0 = new fitnesse.testsystems.slim.tables.SlimTableFactoryTest();
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory1 = slimTableFactoryTest0.slimTableFactory;
        fitnesse.testsystems.slim.Table table2 = slimTableFactoryTest0.gettable();
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory3 = null;
        slimTableFactoryTest0.slimTableFactory = slimTableFactory3;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory5 = null;
        slimTableFactoryTest0.setslimTableFactory(slimTableFactory5);
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory7 = null;
        slimTableFactoryTest0.slimTableFactory = slimTableFactory7;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory9 = null;
        slimTableFactoryTest0.slimTableFactory = slimTableFactory9;
        // The following exception was thrown during execution in test generation
        try {
            slimTableFactoryTest0.checkTableTypeDefineUsedForTable();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(slimTableFactory1);
        org.junit.Assert.assertNull(table2);
    }

    @Test
    public void test01142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01142");
        fitnesse.testsystems.slim.tables.SlimTableFactoryTest slimTableFactoryTest0 = new fitnesse.testsystems.slim.tables.SlimTableFactoryTest();
        fitnesse.testsystems.slim.Table table1 = null;
        slimTableFactoryTest0.table = table1;
        fitnesse.testsystems.slim.Table table3 = null;
        slimTableFactoryTest0.settable(table3);
        java.util.Map<java.lang.String, java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable>> strMap5 = slimTableFactoryTest0.map;
        java.util.Map<java.lang.String, java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable>> strMap6 = slimTableFactoryTest0.getmap();
        java.util.Map<java.lang.String, java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable>> strMap7 = slimTableFactoryTest0.getmap();
        fitnesse.testsystems.slim.Table table8 = slimTableFactoryTest0.table;
        // The following exception was thrown during execution in test generation
        try {
            slimTableFactoryTest0.addTableTypeImport("hi!", "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(strMap5);
        org.junit.Assert.assertNull(strMap6);
        org.junit.Assert.assertNull(strMap7);
        org.junit.Assert.assertNull(table8);
    }

    @Test
    public void test01143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01143");
        fitnesse.testsystems.slim.tables.SlimTableFactoryTest slimTableFactoryTest0 = new fitnesse.testsystems.slim.tables.SlimTableFactoryTest();
        fitnesse.testsystems.slim.Table table1 = null;
        slimTableFactoryTest0.table = table1;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory3 = slimTableFactoryTest0.slimTableFactory;
        java.util.Map<java.lang.String, java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable>> strMap4 = slimTableFactoryTest0.getmap();
        fitnesse.testsystems.slim.Table table5 = null;
        slimTableFactoryTest0.settable(table5);
        fitnesse.testsystems.slim.Table table7 = null;
        slimTableFactoryTest0.table = table7;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory9 = null;
        slimTableFactoryTest0.slimTableFactory = slimTableFactory9;
        fitnesse.testsystems.slim.Table table11 = null;
        slimTableFactoryTest0.table = table11;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory13 = null;
        slimTableFactoryTest0.slimTableFactory = slimTableFactory13;
        fitnesse.testsystems.slim.Table table15 = slimTableFactoryTest0.gettable();
        java.lang.Class<?> wildcardClass16 = slimTableFactoryTest0.getClass();
        org.junit.Assert.assertNull(slimTableFactory3);
        org.junit.Assert.assertNull(strMap4);
        org.junit.Assert.assertNull(table15);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test01144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01144");
        fitnesse.testsystems.slim.tables.SlimTableFactoryTest slimTableFactoryTest0 = new fitnesse.testsystems.slim.tables.SlimTableFactoryTest();
        fitnesse.testsystems.slim.Table table1 = null;
        slimTableFactoryTest0.table = table1;
        fitnesse.testsystems.slim.Table table3 = null;
        slimTableFactoryTest0.settable(table3);
        fitnesse.testsystems.slim.Table table5 = null;
        slimTableFactoryTest0.settable(table5);
        fitnesse.testsystems.slim.Table table7 = slimTableFactoryTest0.table;
        fitnesse.testsystems.slim.Table table8 = null;
        slimTableFactoryTest0.settable(table8);
        java.util.Map<java.lang.String, java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable>> strMap10 = slimTableFactoryTest0.getmap();
        fitnesse.testsystems.slim.Table table11 = null;
        slimTableFactoryTest0.table = table11;
        fitnesse.testsystems.slim.Table table13 = slimTableFactoryTest0.table;
        fitnesse.testsystems.slim.Table table14 = null;
        slimTableFactoryTest0.settable(table14);
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory16 = null;
        slimTableFactoryTest0.setslimTableFactory(slimTableFactory16);
        java.lang.Class<?> wildcardClass18 = slimTableFactoryTest0.getClass();
        org.junit.Assert.assertNull(table7);
        org.junit.Assert.assertNull(strMap10);
        org.junit.Assert.assertNull(table13);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test01145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01145");
        fitnesse.testsystems.slim.tables.SlimTableFactoryTest slimTableFactoryTest0 = new fitnesse.testsystems.slim.tables.SlimTableFactoryTest();
        fitnesse.testsystems.slim.Table table1 = null;
        slimTableFactoryTest0.table = table1;
        fitnesse.testsystems.slim.Table table3 = null;
        slimTableFactoryTest0.settable(table3);
        fitnesse.testsystems.slim.Table table5 = null;
        slimTableFactoryTest0.settable(table5);
        fitnesse.testsystems.slim.Table table7 = slimTableFactoryTest0.table;
        fitnesse.testsystems.slim.Table table8 = null;
        slimTableFactoryTest0.settable(table8);
        java.util.Map<java.lang.String, java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable>> strMap10 = slimTableFactoryTest0.getmap();
        fitnesse.testsystems.slim.Table table11 = null;
        slimTableFactoryTest0.table = table11;
        java.util.Map<java.lang.String, java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable>> strMap13 = slimTableFactoryTest0.getmap();
        fitnesse.testsystems.slim.Table table14 = null;
        slimTableFactoryTest0.table = table14;
        java.util.Map<java.lang.String, java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable>> strMap16 = slimTableFactoryTest0.getmap();
        // The following exception was thrown during execution in test generation
        try {
            slimTableFactoryTest0.checkTableTypeDefinesIgnoredIfDifferentSpecified();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(table7);
        org.junit.Assert.assertNull(strMap10);
        org.junit.Assert.assertNull(strMap13);
        org.junit.Assert.assertNull(strMap16);
    }

    @Test
    public void test01146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01146");
        fitnesse.testsystems.slim.tables.SlimTableFactoryTest slimTableFactoryTest0 = new fitnesse.testsystems.slim.tables.SlimTableFactoryTest();
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory1 = slimTableFactoryTest0.slimTableFactory;
        fitnesse.testsystems.slim.Table table2 = slimTableFactoryTest0.gettable();
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory3 = null;
        slimTableFactoryTest0.slimTableFactory = slimTableFactory3;
        fitnesse.testsystems.slim.Table table5 = null;
        slimTableFactoryTest0.settable(table5);
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory7 = slimTableFactoryTest0.slimTableFactory;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory8 = slimTableFactoryTest0.getslimTableFactory();
        fitnesse.testsystems.slim.Table table9 = slimTableFactoryTest0.gettable();
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory10 = null;
        slimTableFactoryTest0.slimTableFactory = slimTableFactory10;
        java.util.Map<java.lang.String, java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable>> strMap12 = slimTableFactoryTest0.getmap();
        fitnesse.testsystems.slim.Table table13 = null;
        slimTableFactoryTest0.table = table13;
        // The following exception was thrown during execution in test generation
        try {
            slimTableFactoryTest0.addTableTypeImport("hi!", "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(slimTableFactory1);
        org.junit.Assert.assertNull(table2);
        org.junit.Assert.assertNull(slimTableFactory7);
        org.junit.Assert.assertNull(slimTableFactory8);
        org.junit.Assert.assertNull(table9);
        org.junit.Assert.assertNull(strMap12);
    }

    @Test
    public void test01147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01147");
        fitnesse.testsystems.slim.tables.SlimTableFactoryTest slimTableFactoryTest0 = new fitnesse.testsystems.slim.tables.SlimTableFactoryTest();
        fitnesse.testsystems.slim.Table table1 = null;
        slimTableFactoryTest0.table = table1;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory3 = slimTableFactoryTest0.slimTableFactory;
        java.util.Map<java.lang.String, java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable>> strMap4 = slimTableFactoryTest0.getmap();
        fitnesse.testsystems.slim.Table table5 = null;
        slimTableFactoryTest0.settable(table5);
        fitnesse.testsystems.slim.Table table7 = null;
        slimTableFactoryTest0.table = table7;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory9 = null;
        slimTableFactoryTest0.slimTableFactory = slimTableFactory9;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory11 = slimTableFactoryTest0.getslimTableFactory();
        java.util.Map<java.lang.String, java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable>> strMap12 = slimTableFactoryTest0.map;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory13 = null;
        slimTableFactoryTest0.slimTableFactory = slimTableFactory13;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory15 = slimTableFactoryTest0.slimTableFactory;
        // The following exception was thrown during execution in test generation
        try {
            slimTableFactoryTest0.checkTableTypeDefinesIgnoredIfDifferentSpecified();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(slimTableFactory3);
        org.junit.Assert.assertNull(strMap4);
        org.junit.Assert.assertNull(slimTableFactory11);
        org.junit.Assert.assertNull(strMap12);
        org.junit.Assert.assertNull(slimTableFactory15);
    }

    @Test
    public void test01148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01148");
        fitnesse.testsystems.slim.tables.SlimTableFactoryTest slimTableFactoryTest0 = new fitnesse.testsystems.slim.tables.SlimTableFactoryTest();
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory1 = slimTableFactoryTest0.slimTableFactory;
        fitnesse.testsystems.slim.Table table2 = slimTableFactoryTest0.gettable();
        fitnesse.testsystems.slim.Table table3 = null;
        slimTableFactoryTest0.table = table3;
        fitnesse.testsystems.slim.Table table5 = null;
        slimTableFactoryTest0.table = table5;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory7 = null;
        slimTableFactoryTest0.slimTableFactory = slimTableFactory7;
        fitnesse.testsystems.slim.Table table9 = slimTableFactoryTest0.table;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory10 = slimTableFactoryTest0.slimTableFactory;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory11 = slimTableFactoryTest0.slimTableFactory;
        // The following exception was thrown during execution in test generation
        try {
            slimTableFactoryTest0.addTableTypeImport("hi!", "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(slimTableFactory1);
        org.junit.Assert.assertNull(table2);
        org.junit.Assert.assertNull(table9);
        org.junit.Assert.assertNull(slimTableFactory10);
        org.junit.Assert.assertNull(slimTableFactory11);
    }

    @Test
    public void test01149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01149");
        fitnesse.testsystems.slim.tables.SlimTableFactoryTest slimTableFactoryTest0 = new fitnesse.testsystems.slim.tables.SlimTableFactoryTest();
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory1 = slimTableFactoryTest0.slimTableFactory;
        fitnesse.testsystems.slim.Table table2 = slimTableFactoryTest0.table;
        java.util.Map<java.lang.String, java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable>> strMap3 = slimTableFactoryTest0.map;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory4 = null;
        slimTableFactoryTest0.slimTableFactory = slimTableFactory4;
        fitnesse.testsystems.slim.Table table6 = null;
        slimTableFactoryTest0.table = table6;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory8 = slimTableFactoryTest0.getslimTableFactory();
        // The following exception was thrown during execution in test generation
        try {
            slimTableFactoryTest0.checkTableTypeDefinesIgnoredIfDifferentSpecified();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(slimTableFactory1);
        org.junit.Assert.assertNull(table2);
        org.junit.Assert.assertNull(strMap3);
        org.junit.Assert.assertNull(slimTableFactory8);
    }

    @Test
    public void test01150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01150");
        fitnesse.testsystems.slim.tables.SlimTableFactoryTest slimTableFactoryTest0 = new fitnesse.testsystems.slim.tables.SlimTableFactoryTest();
        fitnesse.testsystems.slim.Table table1 = slimTableFactoryTest0.table;
        java.util.Map<java.lang.String, java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable>> strMap2 = slimTableFactoryTest0.getmap();
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory3 = null;
        slimTableFactoryTest0.slimTableFactory = slimTableFactory3;
        fitnesse.testsystems.slim.Table table5 = slimTableFactoryTest0.table;
        java.util.Map<java.lang.String, java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable>> strMap6 = slimTableFactoryTest0.map;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory7 = slimTableFactoryTest0.getslimTableFactory();
        fitnesse.testsystems.slim.Table table8 = slimTableFactoryTest0.gettable();
        java.util.Map<java.lang.String, java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable>> strMap9 = slimTableFactoryTest0.map;
        // The following exception was thrown during execution in test generation
        try {
            slimTableFactoryTest0.commentTableShouldReturnNull();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(table1);
        org.junit.Assert.assertNull(strMap2);
        org.junit.Assert.assertNull(table5);
        org.junit.Assert.assertNull(strMap6);
        org.junit.Assert.assertNull(slimTableFactory7);
        org.junit.Assert.assertNull(table8);
        org.junit.Assert.assertNull(strMap9);
    }

    @Test
    public void test01151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01151");
        fitnesse.testsystems.slim.tables.SlimTableFactoryTest slimTableFactoryTest0 = new fitnesse.testsystems.slim.tables.SlimTableFactoryTest();
        fitnesse.testsystems.slim.Table table1 = null;
        slimTableFactoryTest0.table = table1;
        fitnesse.testsystems.slim.Table table3 = null;
        slimTableFactoryTest0.settable(table3);
        fitnesse.testsystems.slim.Table table5 = null;
        slimTableFactoryTest0.settable(table5);
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory7 = slimTableFactoryTest0.slimTableFactory;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory8 = slimTableFactoryTest0.slimTableFactory;
        // The following exception was thrown during execution in test generation
        try {
            slimTableFactoryTest0.checkTableTypeDefinesIgnoredIfDifferentSpecified();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(slimTableFactory7);
        org.junit.Assert.assertNull(slimTableFactory8);
    }

    @Test
    public void test01152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01152");
        fitnesse.testsystems.slim.tables.SlimTableFactoryTest slimTableFactoryTest0 = new fitnesse.testsystems.slim.tables.SlimTableFactoryTest();
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory1 = slimTableFactoryTest0.slimTableFactory;
        fitnesse.testsystems.slim.Table table2 = slimTableFactoryTest0.gettable();
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory3 = null;
        slimTableFactoryTest0.slimTableFactory = slimTableFactory3;
        fitnesse.testsystems.slim.Table table5 = null;
        slimTableFactoryTest0.settable(table5);
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory7 = slimTableFactoryTest0.slimTableFactory;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory8 = slimTableFactoryTest0.getslimTableFactory();
        fitnesse.testsystems.slim.Table table9 = slimTableFactoryTest0.table;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory10 = null;
        slimTableFactoryTest0.setslimTableFactory(slimTableFactory10);
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory12 = null;
        slimTableFactoryTest0.setslimTableFactory(slimTableFactory12);
        java.util.Map<java.lang.String, java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable>> strMap14 = slimTableFactoryTest0.map;
        // The following exception was thrown during execution in test generation
        try {
            slimTableFactoryTest0.checkTableTypeDefineUsedForTable();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(slimTableFactory1);
        org.junit.Assert.assertNull(table2);
        org.junit.Assert.assertNull(slimTableFactory7);
        org.junit.Assert.assertNull(slimTableFactory8);
        org.junit.Assert.assertNull(table9);
        org.junit.Assert.assertNull(strMap14);
    }

    @Test
    public void test01153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01153");
        fitnesse.testsystems.slim.tables.SlimTableFactoryTest slimTableFactoryTest0 = new fitnesse.testsystems.slim.tables.SlimTableFactoryTest();
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory1 = slimTableFactoryTest0.slimTableFactory;
        fitnesse.testsystems.slim.Table table2 = slimTableFactoryTest0.gettable();
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory3 = null;
        slimTableFactoryTest0.slimTableFactory = slimTableFactory3;
        fitnesse.testsystems.slim.Table table5 = null;
        slimTableFactoryTest0.settable(table5);
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory7 = slimTableFactoryTest0.slimTableFactory;
        fitnesse.testsystems.slim.Table table8 = null;
        slimTableFactoryTest0.settable(table8);
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory10 = slimTableFactoryTest0.slimTableFactory;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory11 = slimTableFactoryTest0.slimTableFactory;
        // The following exception was thrown during execution in test generation
        try {
            slimTableFactoryTest0.checkTableTypeDefineUsedForTable();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(slimTableFactory1);
        org.junit.Assert.assertNull(table2);
        org.junit.Assert.assertNull(slimTableFactory7);
        org.junit.Assert.assertNull(slimTableFactory10);
        org.junit.Assert.assertNull(slimTableFactory11);
    }

    @Test
    public void test01154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01154");
        fitnesse.testsystems.slim.tables.SlimTableFactoryTest slimTableFactoryTest0 = new fitnesse.testsystems.slim.tables.SlimTableFactoryTest();
        fitnesse.testsystems.slim.Table table1 = null;
        slimTableFactoryTest0.table = table1;
        fitnesse.testsystems.slim.Table table3 = slimTableFactoryTest0.table;
        fitnesse.testsystems.slim.Table table4 = slimTableFactoryTest0.gettable();
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory5 = slimTableFactoryTest0.slimTableFactory;
        fitnesse.testsystems.slim.Table table6 = null;
        slimTableFactoryTest0.settable(table6);
        fitnesse.testsystems.slim.Table table8 = slimTableFactoryTest0.table;
        fitnesse.testsystems.slim.Table table9 = null;
        slimTableFactoryTest0.settable(table9);
        // The following exception was thrown during execution in test generation
        try {
            slimTableFactoryTest0.commentTableShouldReturnNull();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(table3);
        org.junit.Assert.assertNull(table4);
        org.junit.Assert.assertNull(slimTableFactory5);
        org.junit.Assert.assertNull(table8);
    }

    @Test
    public void test01155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01155");
        fitnesse.testsystems.slim.tables.SlimTableFactoryTest slimTableFactoryTest0 = new fitnesse.testsystems.slim.tables.SlimTableFactoryTest();
        fitnesse.testsystems.slim.Table table1 = null;
        slimTableFactoryTest0.table = table1;
        fitnesse.testsystems.slim.Table table3 = slimTableFactoryTest0.table;
        fitnesse.testsystems.slim.Table table4 = slimTableFactoryTest0.gettable();
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory5 = slimTableFactoryTest0.slimTableFactory;
        fitnesse.testsystems.slim.Table table6 = null;
        slimTableFactoryTest0.settable(table6);
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory8 = null;
        slimTableFactoryTest0.slimTableFactory = slimTableFactory8;
        // The following exception was thrown during execution in test generation
        try {
            slimTableFactoryTest0.checkTableTypeDefinesIgnoredIfDifferentSpecified();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(table3);
        org.junit.Assert.assertNull(table4);
        org.junit.Assert.assertNull(slimTableFactory5);
    }

    @Test
    public void test01156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01156");
        fitnesse.testsystems.slim.tables.SlimTableFactoryTest slimTableFactoryTest0 = new fitnesse.testsystems.slim.tables.SlimTableFactoryTest();
        fitnesse.testsystems.slim.Table table1 = null;
        slimTableFactoryTest0.table = table1;
        fitnesse.testsystems.slim.Table table3 = null;
        slimTableFactoryTest0.settable(table3);
        fitnesse.testsystems.slim.Table table5 = null;
        slimTableFactoryTest0.table = table5;
        java.util.Map<java.lang.String, java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable>> strMap7 = slimTableFactoryTest0.getmap();
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory8 = null;
        slimTableFactoryTest0.setslimTableFactory(slimTableFactory8);
        // The following exception was thrown during execution in test generation
        try {
            slimTableFactoryTest0.checkTableTypeDefineUsedForTable();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(strMap7);
    }

    @Test
    public void test01157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01157");
        fitnesse.testsystems.slim.tables.SlimTableFactoryTest slimTableFactoryTest0 = new fitnesse.testsystems.slim.tables.SlimTableFactoryTest();
        fitnesse.testsystems.slim.Table table1 = null;
        slimTableFactoryTest0.table = table1;
        fitnesse.testsystems.slim.Table table3 = null;
        slimTableFactoryTest0.settable(table3);
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory5 = null;
        slimTableFactoryTest0.setslimTableFactory(slimTableFactory5);
        java.util.Map<java.lang.String, java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable>> strMap7 = slimTableFactoryTest0.map;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory8 = null;
        slimTableFactoryTest0.slimTableFactory = slimTableFactory8;
        fitnesse.testsystems.slim.Table table10 = null;
        slimTableFactoryTest0.table = table10;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory12 = slimTableFactoryTest0.getslimTableFactory();
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory13 = null;
        slimTableFactoryTest0.setslimTableFactory(slimTableFactory13);
        // The following exception was thrown during execution in test generation
        try {
            slimTableFactoryTest0.shouldCreateCorrectSlimTableForTablesType();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(strMap7);
        org.junit.Assert.assertNull(slimTableFactory12);
    }

    @Test
    public void test01158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01158");
        fitnesse.testsystems.slim.tables.SlimTableFactoryTest slimTableFactoryTest0 = new fitnesse.testsystems.slim.tables.SlimTableFactoryTest();
        fitnesse.testsystems.slim.Table table1 = null;
        slimTableFactoryTest0.table = table1;
        fitnesse.testsystems.slim.Table table3 = null;
        slimTableFactoryTest0.settable(table3);
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory5 = null;
        slimTableFactoryTest0.setslimTableFactory(slimTableFactory5);
        java.util.Map<java.lang.String, java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable>> strMap7 = slimTableFactoryTest0.map;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory8 = null;
        slimTableFactoryTest0.slimTableFactory = slimTableFactory8;
        fitnesse.testsystems.slim.Table table10 = null;
        slimTableFactoryTest0.table = table10;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory12 = slimTableFactoryTest0.getslimTableFactory();
        fitnesse.testsystems.slim.Table table13 = slimTableFactoryTest0.gettable();
        fitnesse.testsystems.slim.Table table14 = null;
        slimTableFactoryTest0.settable(table14);
        // The following exception was thrown during execution in test generation
        try {
            slimTableFactoryTest0.tableTypeStartingWithcommentColonShouldReturnNull();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(strMap7);
        org.junit.Assert.assertNull(slimTableFactory12);
        org.junit.Assert.assertNull(table13);
    }

    @Test
    public void test01159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01159");
        fitnesse.testsystems.slim.tables.SlimTableFactoryTest slimTableFactoryTest0 = new fitnesse.testsystems.slim.tables.SlimTableFactoryTest();
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory1 = slimTableFactoryTest0.slimTableFactory;
        fitnesse.testsystems.slim.Table table2 = slimTableFactoryTest0.gettable();
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory3 = null;
        slimTableFactoryTest0.slimTableFactory = slimTableFactory3;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory5 = null;
        slimTableFactoryTest0.slimTableFactory = slimTableFactory5;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory7 = null;
        slimTableFactoryTest0.setslimTableFactory(slimTableFactory7);
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory9 = null;
        slimTableFactoryTest0.slimTableFactory = slimTableFactory9;
        fitnesse.testsystems.slim.Table table11 = null;
        slimTableFactoryTest0.table = table11;
        // The following exception was thrown during execution in test generation
        try {
            slimTableFactoryTest0.checkTableTypeDefineUsedForTable();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(slimTableFactory1);
        org.junit.Assert.assertNull(table2);
    }

    @Test
    public void test01160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01160");
        fitnesse.testsystems.slim.tables.SlimTableFactoryTest slimTableFactoryTest0 = new fitnesse.testsystems.slim.tables.SlimTableFactoryTest();
        fitnesse.testsystems.slim.Table table1 = null;
        slimTableFactoryTest0.table = table1;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory3 = slimTableFactoryTest0.slimTableFactory;
        java.util.Map<java.lang.String, java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable>> strMap4 = slimTableFactoryTest0.getmap();
        fitnesse.testsystems.slim.Table table5 = null;
        slimTableFactoryTest0.settable(table5);
        fitnesse.testsystems.slim.Table table7 = null;
        slimTableFactoryTest0.table = table7;
        fitnesse.testsystems.slim.Table table9 = slimTableFactoryTest0.table;
        // The following exception was thrown during execution in test generation
        try {
            slimTableFactoryTest0.commentTableShouldReturnNull();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(slimTableFactory3);
        org.junit.Assert.assertNull(strMap4);
        org.junit.Assert.assertNull(table9);
    }

    @Test
    public void test01161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01161");
        fitnesse.testsystems.slim.tables.SlimTableFactoryTest slimTableFactoryTest0 = new fitnesse.testsystems.slim.tables.SlimTableFactoryTest();
        fitnesse.testsystems.slim.Table table1 = null;
        slimTableFactoryTest0.table = table1;
        fitnesse.testsystems.slim.Table table3 = null;
        slimTableFactoryTest0.settable(table3);
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory5 = null;
        slimTableFactoryTest0.setslimTableFactory(slimTableFactory5);
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory7 = null;
        slimTableFactoryTest0.setslimTableFactory(slimTableFactory7);
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory9 = null;
        slimTableFactoryTest0.slimTableFactory = slimTableFactory9;
        // The following exception was thrown during execution in test generation
        try {
            slimTableFactoryTest0.addTableTypeImport("hi!", "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test01162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01162");
        fitnesse.testsystems.slim.tables.SlimTableFactoryTest slimTableFactoryTest0 = new fitnesse.testsystems.slim.tables.SlimTableFactoryTest();
        fitnesse.testsystems.slim.Table table1 = null;
        slimTableFactoryTest0.table = table1;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory3 = null;
        slimTableFactoryTest0.slimTableFactory = slimTableFactory3;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory5 = slimTableFactoryTest0.getslimTableFactory();
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory6 = null;
        slimTableFactoryTest0.setslimTableFactory(slimTableFactory6);
        fitnesse.testsystems.slim.Table table8 = null;
        slimTableFactoryTest0.settable(table8);
        java.util.Map<java.lang.String, java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable>> strMap10 = slimTableFactoryTest0.getmap();
        fitnesse.testsystems.slim.Table table11 = null;
        slimTableFactoryTest0.settable(table11);
        fitnesse.testsystems.slim.Table table13 = null;
        slimTableFactoryTest0.settable(table13);
        // The following exception was thrown during execution in test generation
        try {
            slimTableFactoryTest0.commentTableShouldReturnNull();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(slimTableFactory5);
        org.junit.Assert.assertNull(strMap10);
    }

    @Test
    public void test01163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01163");
        fitnesse.testsystems.slim.tables.SlimTableFactoryTest slimTableFactoryTest0 = new fitnesse.testsystems.slim.tables.SlimTableFactoryTest();
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory1 = slimTableFactoryTest0.slimTableFactory;
        fitnesse.testsystems.slim.Table table2 = slimTableFactoryTest0.gettable();
        fitnesse.testsystems.slim.Table table3 = null;
        slimTableFactoryTest0.table = table3;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory5 = null;
        slimTableFactoryTest0.setslimTableFactory(slimTableFactory5);
        fitnesse.testsystems.slim.Table table7 = slimTableFactoryTest0.table;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory8 = slimTableFactoryTest0.getslimTableFactory();
        // The following exception was thrown during execution in test generation
        try {
            slimTableFactoryTest0.tableTypeStartingWithcommentColonShouldReturnNull();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(slimTableFactory1);
        org.junit.Assert.assertNull(table2);
        org.junit.Assert.assertNull(table7);
        org.junit.Assert.assertNull(slimTableFactory8);
    }

    @Test
    public void test01164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01164");
        fitnesse.testsystems.slim.tables.SlimTableFactoryTest slimTableFactoryTest0 = new fitnesse.testsystems.slim.tables.SlimTableFactoryTest();
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory1 = slimTableFactoryTest0.slimTableFactory;
        fitnesse.testsystems.slim.Table table2 = slimTableFactoryTest0.table;
        java.util.Map<java.lang.String, java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable>> strMap3 = slimTableFactoryTest0.map;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory4 = null;
        slimTableFactoryTest0.slimTableFactory = slimTableFactory4;
        fitnesse.testsystems.slim.Table table6 = null;
        slimTableFactoryTest0.table = table6;
        java.util.Map<java.lang.String, java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable>> strMap8 = slimTableFactoryTest0.getmap();
        fitnesse.testsystems.slim.Table table9 = slimTableFactoryTest0.table;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory10 = null;
        slimTableFactoryTest0.slimTableFactory = slimTableFactory10;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory12 = slimTableFactoryTest0.slimTableFactory;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory13 = null;
        slimTableFactoryTest0.slimTableFactory = slimTableFactory13;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory15 = slimTableFactoryTest0.getslimTableFactory();
        // The following exception was thrown during execution in test generation
        try {
            slimTableFactoryTest0.addTableTypeImport("hi!", "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(slimTableFactory1);
        org.junit.Assert.assertNull(table2);
        org.junit.Assert.assertNull(strMap3);
        org.junit.Assert.assertNull(strMap8);
        org.junit.Assert.assertNull(table9);
        org.junit.Assert.assertNull(slimTableFactory12);
        org.junit.Assert.assertNull(slimTableFactory15);
    }

    @Test
    public void test01165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01165");
        fitnesse.testsystems.slim.tables.SlimTableFactoryTest slimTableFactoryTest0 = new fitnesse.testsystems.slim.tables.SlimTableFactoryTest();
        fitnesse.testsystems.slim.Table table1 = null;
        slimTableFactoryTest0.table = table1;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory3 = slimTableFactoryTest0.getslimTableFactory();
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory4 = slimTableFactoryTest0.getslimTableFactory();
        fitnesse.testsystems.slim.Table table5 = null;
        slimTableFactoryTest0.table = table5;
        fitnesse.testsystems.slim.Table table7 = null;
        slimTableFactoryTest0.settable(table7);
        fitnesse.testsystems.slim.Table table9 = null;
        slimTableFactoryTest0.table = table9;
        // The following exception was thrown during execution in test generation
        try {
            slimTableFactoryTest0.tableTypeStartingWithcommentColonShouldReturnNull();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(slimTableFactory3);
        org.junit.Assert.assertNull(slimTableFactory4);
    }

    @Test
    public void test01166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01166");
        fitnesse.testsystems.slim.tables.SlimTableFactoryTest slimTableFactoryTest0 = new fitnesse.testsystems.slim.tables.SlimTableFactoryTest();
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory1 = slimTableFactoryTest0.slimTableFactory;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory2 = slimTableFactoryTest0.slimTableFactory;
        fitnesse.testsystems.slim.Table table3 = slimTableFactoryTest0.gettable();
        fitnesse.testsystems.slim.Table table4 = slimTableFactoryTest0.gettable();
        fitnesse.testsystems.slim.Table table5 = slimTableFactoryTest0.gettable();
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory6 = slimTableFactoryTest0.slimTableFactory;
        fitnesse.testsystems.slim.Table table7 = null;
        slimTableFactoryTest0.settable(table7);
        fitnesse.testsystems.slim.Table table9 = slimTableFactoryTest0.gettable();
        java.util.Map<java.lang.String, java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable>> strMap10 = slimTableFactoryTest0.map;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory11 = null;
        slimTableFactoryTest0.slimTableFactory = slimTableFactory11;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory13 = null;
        slimTableFactoryTest0.slimTableFactory = slimTableFactory13;
        // The following exception was thrown during execution in test generation
        try {
            slimTableFactoryTest0.tableTypeStartingWithcommentColonShouldReturnNull();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(slimTableFactory1);
        org.junit.Assert.assertNull(slimTableFactory2);
        org.junit.Assert.assertNull(table3);
        org.junit.Assert.assertNull(table4);
        org.junit.Assert.assertNull(table5);
        org.junit.Assert.assertNull(slimTableFactory6);
        org.junit.Assert.assertNull(table9);
        org.junit.Assert.assertNull(strMap10);
    }

    @Test
    public void test01167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01167");
        fitnesse.testsystems.slim.tables.SlimTableFactoryTest slimTableFactoryTest0 = new fitnesse.testsystems.slim.tables.SlimTableFactoryTest();
        fitnesse.testsystems.slim.Table table1 = slimTableFactoryTest0.table;
        fitnesse.testsystems.slim.Table table2 = null;
        slimTableFactoryTest0.table = table2;
        fitnesse.testsystems.slim.Table table4 = slimTableFactoryTest0.gettable();
        // The following exception was thrown during execution in test generation
        try {
            slimTableFactoryTest0.commentTableShouldReturnNull();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(table1);
        org.junit.Assert.assertNull(table4);
    }

    @Test
    public void test01168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01168");
        fitnesse.testsystems.slim.tables.SlimTableFactoryTest slimTableFactoryTest0 = new fitnesse.testsystems.slim.tables.SlimTableFactoryTest();
        fitnesse.testsystems.slim.Table table1 = null;
        slimTableFactoryTest0.table = table1;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory3 = slimTableFactoryTest0.slimTableFactory;
        java.util.Map<java.lang.String, java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable>> strMap4 = slimTableFactoryTest0.getmap();
        fitnesse.testsystems.slim.Table table5 = null;
        slimTableFactoryTest0.settable(table5);
        fitnesse.testsystems.slim.Table table7 = null;
        slimTableFactoryTest0.table = table7;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory9 = null;
        slimTableFactoryTest0.slimTableFactory = slimTableFactory9;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory11 = slimTableFactoryTest0.getslimTableFactory();
        java.util.Map<java.lang.String, java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable>> strMap12 = slimTableFactoryTest0.map;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory13 = null;
        slimTableFactoryTest0.slimTableFactory = slimTableFactory13;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory15 = null;
        slimTableFactoryTest0.slimTableFactory = slimTableFactory15;
        // The following exception was thrown during execution in test generation
        try {
            slimTableFactoryTest0.commentTableShouldReturnNull();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(slimTableFactory3);
        org.junit.Assert.assertNull(strMap4);
        org.junit.Assert.assertNull(slimTableFactory11);
        org.junit.Assert.assertNull(strMap12);
    }

    @Test
    public void test01169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01169");
        fitnesse.testsystems.slim.tables.SlimTableFactoryTest slimTableFactoryTest0 = new fitnesse.testsystems.slim.tables.SlimTableFactoryTest();
        fitnesse.testsystems.slim.Table table1 = null;
        slimTableFactoryTest0.table = table1;
        fitnesse.testsystems.slim.Table table3 = null;
        slimTableFactoryTest0.settable(table3);
        java.util.Map<java.lang.String, java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable>> strMap5 = slimTableFactoryTest0.map;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory6 = slimTableFactoryTest0.getslimTableFactory();
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory7 = slimTableFactoryTest0.getslimTableFactory();
        fitnesse.testsystems.slim.Table table8 = slimTableFactoryTest0.gettable();
        fitnesse.testsystems.slim.Table table9 = null;
        slimTableFactoryTest0.settable(table9);
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory11 = null;
        slimTableFactoryTest0.slimTableFactory = slimTableFactory11;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory13 = null;
        slimTableFactoryTest0.setslimTableFactory(slimTableFactory13);
        // The following exception was thrown during execution in test generation
        try {
            slimTableFactoryTest0.shouldCreateCorrectSlimTableForTablesType();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(strMap5);
        org.junit.Assert.assertNull(slimTableFactory6);
        org.junit.Assert.assertNull(slimTableFactory7);
        org.junit.Assert.assertNull(table8);
    }

    @Test
    public void test01170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01170");
        fitnesse.testsystems.slim.tables.SlimTableFactoryTest slimTableFactoryTest0 = new fitnesse.testsystems.slim.tables.SlimTableFactoryTest();
        fitnesse.testsystems.slim.Table table1 = null;
        slimTableFactoryTest0.table = table1;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory3 = slimTableFactoryTest0.slimTableFactory;
        java.util.Map<java.lang.String, java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable>> strMap4 = slimTableFactoryTest0.map;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory5 = slimTableFactoryTest0.getslimTableFactory();
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory6 = slimTableFactoryTest0.getslimTableFactory();
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory7 = null;
        slimTableFactoryTest0.setslimTableFactory(slimTableFactory7);
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory9 = slimTableFactoryTest0.getslimTableFactory();
        // The following exception was thrown during execution in test generation
        try {
            slimTableFactoryTest0.shouldCreateCorrectSlimTableForTablesType();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(slimTableFactory3);
        org.junit.Assert.assertNull(strMap4);
        org.junit.Assert.assertNull(slimTableFactory5);
        org.junit.Assert.assertNull(slimTableFactory6);
        org.junit.Assert.assertNull(slimTableFactory9);
    }

    @Test
    public void test01171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01171");
        fitnesse.testsystems.slim.tables.SlimTableFactoryTest slimTableFactoryTest0 = new fitnesse.testsystems.slim.tables.SlimTableFactoryTest();
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory1 = slimTableFactoryTest0.slimTableFactory;
        fitnesse.testsystems.slim.Table table2 = slimTableFactoryTest0.gettable();
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory3 = null;
        slimTableFactoryTest0.slimTableFactory = slimTableFactory3;
        fitnesse.testsystems.slim.Table table5 = null;
        slimTableFactoryTest0.settable(table5);
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory7 = slimTableFactoryTest0.slimTableFactory;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory8 = slimTableFactoryTest0.getslimTableFactory();
        fitnesse.testsystems.slim.Table table9 = null;
        slimTableFactoryTest0.settable(table9);
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory11 = slimTableFactoryTest0.slimTableFactory;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass12 = slimTableFactory11.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(slimTableFactory1);
        org.junit.Assert.assertNull(table2);
        org.junit.Assert.assertNull(slimTableFactory7);
        org.junit.Assert.assertNull(slimTableFactory8);
        org.junit.Assert.assertNull(slimTableFactory11);
    }

    @Test
    public void test01172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01172");
        fitnesse.testsystems.slim.tables.SlimTableFactoryTest slimTableFactoryTest0 = new fitnesse.testsystems.slim.tables.SlimTableFactoryTest();
        fitnesse.testsystems.slim.Table table1 = null;
        slimTableFactoryTest0.table = table1;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory3 = slimTableFactoryTest0.getslimTableFactory();
        fitnesse.testsystems.slim.Table table4 = slimTableFactoryTest0.gettable();
        // The following exception was thrown during execution in test generation
        try {
            slimTableFactoryTest0.shouldCreateCorrectSlimTableForTablesType();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(slimTableFactory3);
        org.junit.Assert.assertNull(table4);
    }

    @Test
    public void test01173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01173");
        fitnesse.testsystems.slim.tables.SlimTableFactoryTest slimTableFactoryTest0 = new fitnesse.testsystems.slim.tables.SlimTableFactoryTest();
        fitnesse.testsystems.slim.Table table1 = slimTableFactoryTest0.table;
        java.util.Map<java.lang.String, java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable>> strMap2 = slimTableFactoryTest0.getmap();
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory3 = null;
        slimTableFactoryTest0.slimTableFactory = slimTableFactory3;
        fitnesse.testsystems.slim.Table table5 = slimTableFactoryTest0.table;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory6 = slimTableFactoryTest0.slimTableFactory;
        // The following exception was thrown during execution in test generation
        try {
            slimTableFactoryTest0.addTableTypeImport("", "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(table1);
        org.junit.Assert.assertNull(strMap2);
        org.junit.Assert.assertNull(table5);
        org.junit.Assert.assertNull(slimTableFactory6);
    }

    @Test
    public void test01174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01174");
        fitnesse.testsystems.slim.tables.SlimTableFactoryTest slimTableFactoryTest0 = new fitnesse.testsystems.slim.tables.SlimTableFactoryTest();
        fitnesse.testsystems.slim.Table table1 = null;
        slimTableFactoryTest0.table = table1;
        fitnesse.testsystems.slim.Table table3 = null;
        slimTableFactoryTest0.settable(table3);
        fitnesse.testsystems.slim.Table table5 = null;
        slimTableFactoryTest0.table = table5;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory7 = slimTableFactoryTest0.slimTableFactory;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory8 = slimTableFactoryTest0.slimTableFactory;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory9 = null;
        slimTableFactoryTest0.slimTableFactory = slimTableFactory9;
        // The following exception was thrown during execution in test generation
        try {
            slimTableFactoryTest0.tableTypeStartingWithcommentColonShouldReturnNull();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(slimTableFactory7);
        org.junit.Assert.assertNull(slimTableFactory8);
    }

    @Test
    public void test01175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01175");
        fitnesse.testsystems.slim.tables.SlimTableFactoryTest slimTableFactoryTest0 = new fitnesse.testsystems.slim.tables.SlimTableFactoryTest();
        fitnesse.testsystems.slim.Table table1 = null;
        slimTableFactoryTest0.table = table1;
        fitnesse.testsystems.slim.Table table3 = null;
        slimTableFactoryTest0.settable(table3);
        fitnesse.testsystems.slim.Table table5 = null;
        slimTableFactoryTest0.settable(table5);
        fitnesse.testsystems.slim.Table table7 = slimTableFactoryTest0.table;
        fitnesse.testsystems.slim.Table table8 = null;
        slimTableFactoryTest0.settable(table8);
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory10 = null;
        slimTableFactoryTest0.slimTableFactory = slimTableFactory10;
        // The following exception was thrown during execution in test generation
        try {
            slimTableFactoryTest0.shouldCreateCorrectSlimTableForTablesType();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(table7);
    }

    @Test
    public void test01176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01176");
        fitnesse.testsystems.slim.tables.SlimTableFactoryTest slimTableFactoryTest0 = new fitnesse.testsystems.slim.tables.SlimTableFactoryTest();
        fitnesse.testsystems.slim.Table table1 = null;
        slimTableFactoryTest0.table = table1;
        fitnesse.testsystems.slim.Table table3 = null;
        slimTableFactoryTest0.settable(table3);
        fitnesse.testsystems.slim.Table table5 = null;
        slimTableFactoryTest0.table = table5;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory7 = slimTableFactoryTest0.slimTableFactory;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory8 = slimTableFactoryTest0.slimTableFactory;
        fitnesse.testsystems.slim.Table table9 = slimTableFactoryTest0.gettable();
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory10 = null;
        slimTableFactoryTest0.slimTableFactory = slimTableFactory10;
        fitnesse.testsystems.slim.Table table12 = slimTableFactoryTest0.gettable();
        java.util.Map<java.lang.String, java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable>> strMap13 = slimTableFactoryTest0.map;
        // The following exception was thrown during execution in test generation
        try {
            slimTableFactoryTest0.tableTypeStartingWithcommentColonShouldReturnNull();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(slimTableFactory7);
        org.junit.Assert.assertNull(slimTableFactory8);
        org.junit.Assert.assertNull(table9);
        org.junit.Assert.assertNull(table12);
        org.junit.Assert.assertNull(strMap13);
    }

    @Test
    public void test01177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01177");
        fitnesse.testsystems.slim.tables.SlimTableFactoryTest slimTableFactoryTest0 = new fitnesse.testsystems.slim.tables.SlimTableFactoryTest();
        fitnesse.testsystems.slim.Table table1 = null;
        slimTableFactoryTest0.table = table1;
        fitnesse.testsystems.slim.Table table3 = null;
        slimTableFactoryTest0.settable(table3);
        java.util.Map<java.lang.String, java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable>> strMap5 = slimTableFactoryTest0.map;
        java.util.Map<java.lang.String, java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable>> strMap6 = slimTableFactoryTest0.getmap();
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory7 = slimTableFactoryTest0.slimTableFactory;
        java.util.Map<java.lang.String, java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable>> strMap8 = slimTableFactoryTest0.map;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory9 = slimTableFactoryTest0.slimTableFactory;
        fitnesse.testsystems.slim.Table table10 = null;
        slimTableFactoryTest0.settable(table10);
        fitnesse.testsystems.slim.Table table12 = slimTableFactoryTest0.gettable();
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory13 = slimTableFactoryTest0.slimTableFactory;
        fitnesse.testsystems.slim.Table table14 = slimTableFactoryTest0.table;
        // The following exception was thrown during execution in test generation
        try {
            slimTableFactoryTest0.checkTableTypeDefinesIgnoredIfDifferentSpecified();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(strMap5);
        org.junit.Assert.assertNull(strMap6);
        org.junit.Assert.assertNull(slimTableFactory7);
        org.junit.Assert.assertNull(strMap8);
        org.junit.Assert.assertNull(slimTableFactory9);
        org.junit.Assert.assertNull(table12);
        org.junit.Assert.assertNull(slimTableFactory13);
        org.junit.Assert.assertNull(table14);
    }

    @Test
    public void test01178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01178");
        fitnesse.testsystems.slim.tables.SlimTableFactoryTest slimTableFactoryTest0 = new fitnesse.testsystems.slim.tables.SlimTableFactoryTest();
        fitnesse.testsystems.slim.Table table1 = null;
        slimTableFactoryTest0.table = table1;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory3 = slimTableFactoryTest0.slimTableFactory;
        java.util.Map<java.lang.String, java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable>> strMap4 = slimTableFactoryTest0.getmap();
        fitnesse.testsystems.slim.Table table5 = null;
        slimTableFactoryTest0.settable(table5);
        fitnesse.testsystems.slim.Table table7 = null;
        slimTableFactoryTest0.table = table7;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory9 = null;
        slimTableFactoryTest0.slimTableFactory = slimTableFactory9;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory11 = slimTableFactoryTest0.getslimTableFactory();
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory12 = slimTableFactoryTest0.slimTableFactory;
        // The following exception was thrown during execution in test generation
        try {
            slimTableFactoryTest0.checkTableTypeDefinesIgnoredIfDifferentSpecified();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(slimTableFactory3);
        org.junit.Assert.assertNull(strMap4);
        org.junit.Assert.assertNull(slimTableFactory11);
        org.junit.Assert.assertNull(slimTableFactory12);
    }

    @Test
    public void test01179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01179");
        fitnesse.testsystems.slim.tables.SlimTableFactoryTest slimTableFactoryTest0 = new fitnesse.testsystems.slim.tables.SlimTableFactoryTest();
        fitnesse.testsystems.slim.Table table1 = slimTableFactoryTest0.table;
        java.util.Map<java.lang.String, java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable>> strMap2 = slimTableFactoryTest0.getmap();
        java.util.Map<java.lang.String, java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable>> strMap3 = slimTableFactoryTest0.getmap();
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory4 = slimTableFactoryTest0.slimTableFactory;
        fitnesse.testsystems.slim.Table table5 = null;
        slimTableFactoryTest0.settable(table5);
        fitnesse.testsystems.slim.Table table7 = slimTableFactoryTest0.table;
        java.util.Map<java.lang.String, java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable>> strMap8 = slimTableFactoryTest0.map;
        java.util.Map<java.lang.String, java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable>> strMap9 = slimTableFactoryTest0.map;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory10 = slimTableFactoryTest0.slimTableFactory;
        java.util.Map<java.lang.String, java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable>> strMap11 = slimTableFactoryTest0.map;
        // The following exception was thrown during execution in test generation
        try {
            slimTableFactoryTest0.checkTableTypeDefinesIgnoredIfDifferentSpecified();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(table1);
        org.junit.Assert.assertNull(strMap2);
        org.junit.Assert.assertNull(strMap3);
        org.junit.Assert.assertNull(slimTableFactory4);
        org.junit.Assert.assertNull(table7);
        org.junit.Assert.assertNull(strMap8);
        org.junit.Assert.assertNull(strMap9);
        org.junit.Assert.assertNull(slimTableFactory10);
        org.junit.Assert.assertNull(strMap11);
    }

    @Test
    public void test01180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01180");
        fitnesse.testsystems.slim.tables.SlimTableFactoryTest slimTableFactoryTest0 = new fitnesse.testsystems.slim.tables.SlimTableFactoryTest();
        fitnesse.testsystems.slim.Table table1 = null;
        slimTableFactoryTest0.table = table1;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory3 = slimTableFactoryTest0.slimTableFactory;
        java.util.Map<java.lang.String, java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable>> strMap4 = slimTableFactoryTest0.getmap();
        fitnesse.testsystems.slim.Table table5 = null;
        slimTableFactoryTest0.settable(table5);
        fitnesse.testsystems.slim.Table table7 = null;
        slimTableFactoryTest0.table = table7;
        fitnesse.testsystems.slim.Table table9 = slimTableFactoryTest0.table;
        fitnesse.testsystems.slim.Table table10 = null;
        slimTableFactoryTest0.settable(table10);
        fitnesse.testsystems.slim.Table table12 = null;
        slimTableFactoryTest0.settable(table12);
        // The following exception was thrown during execution in test generation
        try {
            slimTableFactoryTest0.checkTableTypeDefineUsedForTable();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(slimTableFactory3);
        org.junit.Assert.assertNull(strMap4);
        org.junit.Assert.assertNull(table9);
    }

    @Test
    public void test01181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01181");
        fitnesse.testsystems.slim.tables.SlimTableFactoryTest slimTableFactoryTest0 = new fitnesse.testsystems.slim.tables.SlimTableFactoryTest();
        fitnesse.testsystems.slim.Table table1 = null;
        slimTableFactoryTest0.table = table1;
        fitnesse.testsystems.slim.Table table3 = null;
        slimTableFactoryTest0.settable(table3);
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory5 = null;
        slimTableFactoryTest0.setslimTableFactory(slimTableFactory5);
        java.util.Map<java.lang.String, java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable>> strMap7 = slimTableFactoryTest0.map;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory8 = null;
        slimTableFactoryTest0.slimTableFactory = slimTableFactory8;
        fitnesse.testsystems.slim.Table table10 = null;
        slimTableFactoryTest0.table = table10;
        java.util.Map<java.lang.String, java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable>> strMap12 = slimTableFactoryTest0.map;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass13 = strMap12.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(strMap7);
        org.junit.Assert.assertNull(strMap12);
    }

    @Test
    public void test01182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01182");
        fitnesse.testsystems.slim.tables.SlimTableFactoryTest slimTableFactoryTest0 = new fitnesse.testsystems.slim.tables.SlimTableFactoryTest();
        fitnesse.testsystems.slim.Table table1 = null;
        slimTableFactoryTest0.table = table1;
        fitnesse.testsystems.slim.Table table3 = null;
        slimTableFactoryTest0.settable(table3);
        java.util.Map<java.lang.String, java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable>> strMap5 = slimTableFactoryTest0.map;
        java.util.Map<java.lang.String, java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable>> strMap6 = slimTableFactoryTest0.getmap();
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory7 = null;
        slimTableFactoryTest0.slimTableFactory = slimTableFactory7;
        java.util.Map<java.lang.String, java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable>> strMap9 = slimTableFactoryTest0.map;
        // The following exception was thrown during execution in test generation
        try {
            slimTableFactoryTest0.checkTableTypeDefineUsedForTable();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(strMap5);
        org.junit.Assert.assertNull(strMap6);
        org.junit.Assert.assertNull(strMap9);
    }

    @Test
    public void test01183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01183");
        fitnesse.testsystems.slim.tables.SlimTableFactoryTest slimTableFactoryTest0 = new fitnesse.testsystems.slim.tables.SlimTableFactoryTest();
        fitnesse.testsystems.slim.Table table1 = null;
        slimTableFactoryTest0.table = table1;
        fitnesse.testsystems.slim.Table table3 = null;
        slimTableFactoryTest0.settable(table3);
        fitnesse.testsystems.slim.Table table5 = null;
        slimTableFactoryTest0.settable(table5);
        fitnesse.testsystems.slim.Table table7 = slimTableFactoryTest0.table;
        fitnesse.testsystems.slim.Table table8 = null;
        slimTableFactoryTest0.settable(table8);
        java.util.Map<java.lang.String, java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable>> strMap10 = slimTableFactoryTest0.getmap();
        fitnesse.testsystems.slim.Table table11 = null;
        slimTableFactoryTest0.table = table11;
        java.util.Map<java.lang.String, java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable>> strMap13 = slimTableFactoryTest0.getmap();
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory14 = null;
        slimTableFactoryTest0.setslimTableFactory(slimTableFactory14);
        java.lang.Class<?> wildcardClass16 = slimTableFactoryTest0.getClass();
        org.junit.Assert.assertNull(table7);
        org.junit.Assert.assertNull(strMap10);
        org.junit.Assert.assertNull(strMap13);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test01184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01184");
        fitnesse.testsystems.slim.tables.SlimTableFactoryTest slimTableFactoryTest0 = new fitnesse.testsystems.slim.tables.SlimTableFactoryTest();
        fitnesse.testsystems.slim.Table table1 = null;
        slimTableFactoryTest0.table = table1;
        fitnesse.testsystems.slim.Table table3 = null;
        slimTableFactoryTest0.settable(table3);
        java.util.Map<java.lang.String, java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable>> strMap5 = slimTableFactoryTest0.map;
        fitnesse.testsystems.slim.Table table6 = null;
        slimTableFactoryTest0.settable(table6);
        fitnesse.testsystems.slim.Table table8 = null;
        slimTableFactoryTest0.settable(table8);
        // The following exception was thrown during execution in test generation
        try {
            slimTableFactoryTest0.commentTableShouldReturnNull();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(strMap5);
    }

    @Test
    public void test01185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01185");
        fitnesse.testsystems.slim.tables.SlimTableFactoryTest slimTableFactoryTest0 = new fitnesse.testsystems.slim.tables.SlimTableFactoryTest();
        fitnesse.testsystems.slim.Table table1 = null;
        slimTableFactoryTest0.table = table1;
        fitnesse.testsystems.slim.Table table3 = null;
        slimTableFactoryTest0.settable(table3);
        fitnesse.testsystems.slim.Table table5 = null;
        slimTableFactoryTest0.settable(table5);
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory7 = slimTableFactoryTest0.slimTableFactory;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory8 = null;
        slimTableFactoryTest0.slimTableFactory = slimTableFactory8;
        java.util.Map<java.lang.String, java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable>> strMap10 = slimTableFactoryTest0.map;
        fitnesse.testsystems.slim.Table table11 = null;
        slimTableFactoryTest0.table = table11;
        org.junit.Assert.assertNull(slimTableFactory7);
        org.junit.Assert.assertNull(strMap10);
    }

    @Test
    public void test01186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01186");
        fitnesse.testsystems.slim.tables.SlimTableFactoryTest slimTableFactoryTest0 = new fitnesse.testsystems.slim.tables.SlimTableFactoryTest();
        fitnesse.testsystems.slim.Table table1 = null;
        slimTableFactoryTest0.table = table1;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory3 = slimTableFactoryTest0.slimTableFactory;
        java.util.Map<java.lang.String, java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable>> strMap4 = slimTableFactoryTest0.getmap();
        fitnesse.testsystems.slim.Table table5 = null;
        slimTableFactoryTest0.settable(table5);
        fitnesse.testsystems.slim.Table table7 = null;
        slimTableFactoryTest0.table = table7;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory9 = null;
        slimTableFactoryTest0.slimTableFactory = slimTableFactory9;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory11 = slimTableFactoryTest0.getslimTableFactory();
        java.util.Map<java.lang.String, java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable>> strMap12 = slimTableFactoryTest0.map;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory13 = null;
        slimTableFactoryTest0.slimTableFactory = slimTableFactory13;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory15 = null;
        slimTableFactoryTest0.slimTableFactory = slimTableFactory15;
        // The following exception was thrown during execution in test generation
        try {
            slimTableFactoryTest0.addTableTypeImport("hi!", "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(slimTableFactory3);
        org.junit.Assert.assertNull(strMap4);
        org.junit.Assert.assertNull(slimTableFactory11);
        org.junit.Assert.assertNull(strMap12);
    }

    @Test
    public void test01187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01187");
        fitnesse.testsystems.slim.tables.SlimTableFactoryTest slimTableFactoryTest0 = new fitnesse.testsystems.slim.tables.SlimTableFactoryTest();
        fitnesse.testsystems.slim.Table table1 = null;
        slimTableFactoryTest0.table = table1;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory3 = slimTableFactoryTest0.getslimTableFactory();
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory4 = slimTableFactoryTest0.getslimTableFactory();
        fitnesse.testsystems.slim.Table table5 = null;
        slimTableFactoryTest0.table = table5;
        java.util.Map<java.lang.String, java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable>> strMap7 = slimTableFactoryTest0.map;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass8 = strMap7.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(slimTableFactory3);
        org.junit.Assert.assertNull(slimTableFactory4);
        org.junit.Assert.assertNull(strMap7);
    }

    @Test
    public void test01188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01188");
        fitnesse.testsystems.slim.tables.SlimTableFactoryTest slimTableFactoryTest0 = new fitnesse.testsystems.slim.tables.SlimTableFactoryTest();
        fitnesse.testsystems.slim.Table table1 = null;
        slimTableFactoryTest0.table = table1;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory3 = slimTableFactoryTest0.slimTableFactory;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory4 = null;
        slimTableFactoryTest0.setslimTableFactory(slimTableFactory4);
        fitnesse.testsystems.slim.Table table6 = null;
        slimTableFactoryTest0.settable(table6);
        fitnesse.testsystems.slim.Table table8 = slimTableFactoryTest0.gettable();
        fitnesse.testsystems.slim.Table table9 = null;
        slimTableFactoryTest0.settable(table9);
        // The following exception was thrown during execution in test generation
        try {
            slimTableFactoryTest0.commentTableShouldReturnNull();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(slimTableFactory3);
        org.junit.Assert.assertNull(table8);
    }

    @Test
    public void test01189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01189");
        fitnesse.testsystems.slim.tables.SlimTableFactoryTest slimTableFactoryTest0 = new fitnesse.testsystems.slim.tables.SlimTableFactoryTest();
        fitnesse.testsystems.slim.Table table1 = null;
        slimTableFactoryTest0.table = table1;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory3 = null;
        slimTableFactoryTest0.setslimTableFactory(slimTableFactory3);
        java.util.Map<java.lang.String, java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable>> strMap5 = slimTableFactoryTest0.map;
        fitnesse.testsystems.slim.Table table6 = null;
        slimTableFactoryTest0.table = table6;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory8 = slimTableFactoryTest0.getslimTableFactory();
        // The following exception was thrown during execution in test generation
        try {
            slimTableFactoryTest0.checkTableTypeDefinesIgnoredIfDifferentSpecified();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(strMap5);
        org.junit.Assert.assertNull(slimTableFactory8);
    }

    @Test
    public void test01190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01190");
        fitnesse.testsystems.slim.tables.SlimTableFactoryTest slimTableFactoryTest0 = new fitnesse.testsystems.slim.tables.SlimTableFactoryTest();
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory1 = slimTableFactoryTest0.slimTableFactory;
        fitnesse.testsystems.slim.Table table2 = slimTableFactoryTest0.gettable();
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory3 = null;
        slimTableFactoryTest0.slimTableFactory = slimTableFactory3;
        fitnesse.testsystems.slim.Table table5 = null;
        slimTableFactoryTest0.settable(table5);
        java.util.Map<java.lang.String, java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable>> strMap7 = slimTableFactoryTest0.getmap();
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory8 = slimTableFactoryTest0.slimTableFactory;
        fitnesse.testsystems.slim.Table table9 = slimTableFactoryTest0.table;
        // The following exception was thrown during execution in test generation
        try {
            slimTableFactoryTest0.addTableTypeImport("hi!", "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(slimTableFactory1);
        org.junit.Assert.assertNull(table2);
        org.junit.Assert.assertNull(strMap7);
        org.junit.Assert.assertNull(slimTableFactory8);
        org.junit.Assert.assertNull(table9);
    }

    @Test
    public void test01191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01191");
        fitnesse.testsystems.slim.tables.SlimTableFactoryTest slimTableFactoryTest0 = new fitnesse.testsystems.slim.tables.SlimTableFactoryTest();
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory1 = slimTableFactoryTest0.slimTableFactory;
        fitnesse.testsystems.slim.Table table2 = slimTableFactoryTest0.gettable();
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory3 = null;
        slimTableFactoryTest0.slimTableFactory = slimTableFactory3;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory5 = null;
        slimTableFactoryTest0.slimTableFactory = slimTableFactory5;
        fitnesse.testsystems.slim.Table table7 = null;
        slimTableFactoryTest0.table = table7;
        // The following exception was thrown during execution in test generation
        try {
            slimTableFactoryTest0.addTableTypeImport("", "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(slimTableFactory1);
        org.junit.Assert.assertNull(table2);
    }

    @Test
    public void test01192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01192");
        fitnesse.testsystems.slim.tables.SlimTableFactoryTest slimTableFactoryTest0 = new fitnesse.testsystems.slim.tables.SlimTableFactoryTest();
        fitnesse.testsystems.slim.Table table1 = slimTableFactoryTest0.table;
        java.util.Map<java.lang.String, java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable>> strMap2 = slimTableFactoryTest0.getmap();
        fitnesse.testsystems.slim.Table table3 = null;
        slimTableFactoryTest0.table = table3;
        fitnesse.testsystems.slim.Table table5 = slimTableFactoryTest0.gettable();
        fitnesse.testsystems.slim.Table table6 = null;
        slimTableFactoryTest0.table = table6;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory8 = slimTableFactoryTest0.getslimTableFactory();
        fitnesse.testsystems.slim.Table table9 = null;
        slimTableFactoryTest0.settable(table9);
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory11 = null;
        slimTableFactoryTest0.setslimTableFactory(slimTableFactory11);
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
        org.junit.Assert.assertNull(slimTableFactory8);
    }

    @Test
    public void test01193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01193");
        fitnesse.testsystems.slim.tables.SlimTableFactoryTest slimTableFactoryTest0 = new fitnesse.testsystems.slim.tables.SlimTableFactoryTest();
        fitnesse.testsystems.slim.Table table1 = null;
        slimTableFactoryTest0.table = table1;
        fitnesse.testsystems.slim.Table table3 = null;
        slimTableFactoryTest0.settable(table3);
        fitnesse.testsystems.slim.Table table5 = null;
        slimTableFactoryTest0.settable(table5);
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory7 = slimTableFactoryTest0.slimTableFactory;
        fitnesse.testsystems.slim.Table table8 = null;
        slimTableFactoryTest0.settable(table8);
        fitnesse.testsystems.slim.Table table10 = null;
        slimTableFactoryTest0.settable(table10);
        java.util.Map<java.lang.String, java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable>> strMap12 = slimTableFactoryTest0.map;
        fitnesse.testsystems.slim.Table table13 = null;
        slimTableFactoryTest0.table = table13;
        // The following exception was thrown during execution in test generation
        try {
            slimTableFactoryTest0.commentTableShouldReturnNull();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(slimTableFactory7);
        org.junit.Assert.assertNull(strMap12);
    }

    @Test
    public void test01194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01194");
        fitnesse.testsystems.slim.tables.SlimTableFactoryTest slimTableFactoryTest0 = new fitnesse.testsystems.slim.tables.SlimTableFactoryTest();
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory1 = slimTableFactoryTest0.slimTableFactory;
        fitnesse.testsystems.slim.Table table2 = slimTableFactoryTest0.gettable();
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory3 = null;
        slimTableFactoryTest0.slimTableFactory = slimTableFactory3;
        fitnesse.testsystems.slim.Table table5 = null;
        slimTableFactoryTest0.settable(table5);
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory7 = slimTableFactoryTest0.slimTableFactory;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory8 = slimTableFactoryTest0.getslimTableFactory();
        fitnesse.testsystems.slim.Table table9 = null;
        slimTableFactoryTest0.table = table9;
        fitnesse.testsystems.slim.Table table11 = slimTableFactoryTest0.gettable();
        // The following exception was thrown during execution in test generation
        try {
            slimTableFactoryTest0.commentTableShouldReturnNull();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(slimTableFactory1);
        org.junit.Assert.assertNull(table2);
        org.junit.Assert.assertNull(slimTableFactory7);
        org.junit.Assert.assertNull(slimTableFactory8);
        org.junit.Assert.assertNull(table11);
    }

    @Test
    public void test01195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01195");
        fitnesse.testsystems.slim.tables.SlimTableFactoryTest slimTableFactoryTest0 = new fitnesse.testsystems.slim.tables.SlimTableFactoryTest();
        fitnesse.testsystems.slim.Table table1 = null;
        slimTableFactoryTest0.table = table1;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory3 = slimTableFactoryTest0.slimTableFactory;
        java.util.Map<java.lang.String, java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable>> strMap4 = slimTableFactoryTest0.getmap();
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory5 = slimTableFactoryTest0.slimTableFactory;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory6 = slimTableFactoryTest0.getslimTableFactory();
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory7 = null;
        slimTableFactoryTest0.setslimTableFactory(slimTableFactory7);
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory9 = slimTableFactoryTest0.slimTableFactory;
        fitnesse.testsystems.slim.Table table10 = null;
        slimTableFactoryTest0.settable(table10);
        // The following exception was thrown during execution in test generation
        try {
            slimTableFactoryTest0.tableTypeStartingWithcommentColonShouldReturnNull();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(slimTableFactory3);
        org.junit.Assert.assertNull(strMap4);
        org.junit.Assert.assertNull(slimTableFactory5);
        org.junit.Assert.assertNull(slimTableFactory6);
        org.junit.Assert.assertNull(slimTableFactory9);
    }

    @Test
    public void test01196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01196");
        fitnesse.testsystems.slim.tables.SlimTableFactoryTest slimTableFactoryTest0 = new fitnesse.testsystems.slim.tables.SlimTableFactoryTest();
        fitnesse.testsystems.slim.Table table1 = null;
        slimTableFactoryTest0.table = table1;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory3 = null;
        slimTableFactoryTest0.setslimTableFactory(slimTableFactory3);
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory5 = slimTableFactoryTest0.slimTableFactory;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory6 = slimTableFactoryTest0.getslimTableFactory();
        fitnesse.testsystems.slim.Table table7 = null;
        slimTableFactoryTest0.table = table7;
        fitnesse.testsystems.slim.Table table9 = null;
        slimTableFactoryTest0.settable(table9);
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory11 = slimTableFactoryTest0.slimTableFactory;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory12 = null;
        slimTableFactoryTest0.slimTableFactory = slimTableFactory12;
        // The following exception was thrown during execution in test generation
        try {
            slimTableFactoryTest0.addTableTypeImport("hi!", "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(slimTableFactory5);
        org.junit.Assert.assertNull(slimTableFactory6);
        org.junit.Assert.assertNull(slimTableFactory11);
    }

    @Test
    public void test01197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01197");
        fitnesse.testsystems.slim.tables.SlimTableFactoryTest slimTableFactoryTest0 = new fitnesse.testsystems.slim.tables.SlimTableFactoryTest();
        fitnesse.testsystems.slim.Table table1 = null;
        slimTableFactoryTest0.table = table1;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory3 = slimTableFactoryTest0.slimTableFactory;
        java.util.Map<java.lang.String, java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable>> strMap4 = slimTableFactoryTest0.getmap();
        fitnesse.testsystems.slim.Table table5 = null;
        slimTableFactoryTest0.settable(table5);
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory7 = null;
        slimTableFactoryTest0.setslimTableFactory(slimTableFactory7);
        java.util.Map<java.lang.String, java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable>> strMap9 = slimTableFactoryTest0.getmap();
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory10 = slimTableFactoryTest0.slimTableFactory;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory11 = slimTableFactoryTest0.getslimTableFactory();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass12 = slimTableFactory11.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(slimTableFactory3);
        org.junit.Assert.assertNull(strMap4);
        org.junit.Assert.assertNull(strMap9);
        org.junit.Assert.assertNull(slimTableFactory10);
        org.junit.Assert.assertNull(slimTableFactory11);
    }

    @Test
    public void test01198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01198");
        fitnesse.testsystems.slim.tables.SlimTableFactoryTest slimTableFactoryTest0 = new fitnesse.testsystems.slim.tables.SlimTableFactoryTest();
        fitnesse.testsystems.slim.Table table1 = null;
        slimTableFactoryTest0.table = table1;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory3 = null;
        slimTableFactoryTest0.slimTableFactory = slimTableFactory3;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory5 = slimTableFactoryTest0.getslimTableFactory();
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory6 = null;
        slimTableFactoryTest0.setslimTableFactory(slimTableFactory6);
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory8 = slimTableFactoryTest0.getslimTableFactory();
        fitnesse.testsystems.slim.Table table9 = slimTableFactoryTest0.gettable();
        fitnesse.testsystems.slim.Table table10 = null;
        slimTableFactoryTest0.settable(table10);
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory12 = slimTableFactoryTest0.getslimTableFactory();
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory13 = null;
        slimTableFactoryTest0.slimTableFactory = slimTableFactory13;
        fitnesse.testsystems.slim.Table table15 = slimTableFactoryTest0.table;
        // The following exception was thrown during execution in test generation
        try {
            slimTableFactoryTest0.checkTableTypeDefineUsedForTable();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(slimTableFactory5);
        org.junit.Assert.assertNull(slimTableFactory8);
        org.junit.Assert.assertNull(table9);
        org.junit.Assert.assertNull(slimTableFactory12);
        org.junit.Assert.assertNull(table15);
    }

    @Test
    public void test01199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01199");
        fitnesse.testsystems.slim.tables.SlimTableFactoryTest slimTableFactoryTest0 = new fitnesse.testsystems.slim.tables.SlimTableFactoryTest();
        fitnesse.testsystems.slim.Table table1 = null;
        slimTableFactoryTest0.table = table1;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory3 = slimTableFactoryTest0.slimTableFactory;
        java.util.Map<java.lang.String, java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable>> strMap4 = slimTableFactoryTest0.getmap();
        fitnesse.testsystems.slim.Table table5 = null;
        slimTableFactoryTest0.settable(table5);
        fitnesse.testsystems.slim.Table table7 = null;
        slimTableFactoryTest0.table = table7;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory9 = null;
        slimTableFactoryTest0.slimTableFactory = slimTableFactory9;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory11 = slimTableFactoryTest0.getslimTableFactory();
        java.util.Map<java.lang.String, java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable>> strMap12 = slimTableFactoryTest0.map;
        // The following exception was thrown during execution in test generation
        try {
            slimTableFactoryTest0.tableTypeStartingWithcommentColonShouldReturnNull();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(slimTableFactory3);
        org.junit.Assert.assertNull(strMap4);
        org.junit.Assert.assertNull(slimTableFactory11);
        org.junit.Assert.assertNull(strMap12);
    }

    @Test
    public void test01200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01200");
        fitnesse.testsystems.slim.tables.SlimTableFactoryTest slimTableFactoryTest0 = new fitnesse.testsystems.slim.tables.SlimTableFactoryTest();
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory1 = slimTableFactoryTest0.slimTableFactory;
        fitnesse.testsystems.slim.Table table2 = slimTableFactoryTest0.gettable();
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory3 = null;
        slimTableFactoryTest0.slimTableFactory = slimTableFactory3;
        fitnesse.testsystems.slim.Table table5 = null;
        slimTableFactoryTest0.settable(table5);
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory7 = slimTableFactoryTest0.slimTableFactory;
        fitnesse.testsystems.slim.Table table8 = null;
        slimTableFactoryTest0.settable(table8);
        // The following exception was thrown during execution in test generation
        try {
            slimTableFactoryTest0.shouldCreateCorrectSlimTableForTablesType();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(slimTableFactory1);
        org.junit.Assert.assertNull(table2);
        org.junit.Assert.assertNull(slimTableFactory7);
    }

    @Test
    public void test01201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01201");
        fitnesse.testsystems.slim.tables.SlimTableFactoryTest slimTableFactoryTest0 = new fitnesse.testsystems.slim.tables.SlimTableFactoryTest();
        fitnesse.testsystems.slim.Table table1 = slimTableFactoryTest0.table;
        java.util.Map<java.lang.String, java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable>> strMap2 = slimTableFactoryTest0.getmap();
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory3 = null;
        slimTableFactoryTest0.slimTableFactory = slimTableFactory3;
        fitnesse.testsystems.slim.Table table5 = slimTableFactoryTest0.table;
        fitnesse.testsystems.slim.Table table6 = slimTableFactoryTest0.table;
        // The following exception was thrown during execution in test generation
        try {
            slimTableFactoryTest0.shouldCreateCorrectSlimTableForTablesType();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(table1);
        org.junit.Assert.assertNull(strMap2);
        org.junit.Assert.assertNull(table5);
        org.junit.Assert.assertNull(table6);
    }

    @Test
    public void test01202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01202");
        fitnesse.testsystems.slim.tables.SlimTableFactoryTest slimTableFactoryTest0 = new fitnesse.testsystems.slim.tables.SlimTableFactoryTest();
        fitnesse.testsystems.slim.Table table1 = slimTableFactoryTest0.table;
        java.util.Map<java.lang.String, java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable>> strMap2 = slimTableFactoryTest0.getmap();
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory3 = slimTableFactoryTest0.slimTableFactory;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory4 = slimTableFactoryTest0.getslimTableFactory();
        java.util.Map<java.lang.String, java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable>> strMap5 = slimTableFactoryTest0.getmap();
        fitnesse.testsystems.slim.Table table6 = null;
        slimTableFactoryTest0.table = table6;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory8 = slimTableFactoryTest0.getslimTableFactory();
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory9 = slimTableFactoryTest0.slimTableFactory;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory10 = slimTableFactoryTest0.getslimTableFactory();
        java.lang.Class<?> wildcardClass11 = slimTableFactoryTest0.getClass();
        org.junit.Assert.assertNull(table1);
        org.junit.Assert.assertNull(strMap2);
        org.junit.Assert.assertNull(slimTableFactory3);
        org.junit.Assert.assertNull(slimTableFactory4);
        org.junit.Assert.assertNull(strMap5);
        org.junit.Assert.assertNull(slimTableFactory8);
        org.junit.Assert.assertNull(slimTableFactory9);
        org.junit.Assert.assertNull(slimTableFactory10);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test01203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01203");
        fitnesse.testsystems.slim.tables.SlimTableFactoryTest slimTableFactoryTest0 = new fitnesse.testsystems.slim.tables.SlimTableFactoryTest();
        fitnesse.testsystems.slim.Table table1 = null;
        slimTableFactoryTest0.table = table1;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory3 = slimTableFactoryTest0.slimTableFactory;
        java.util.Map<java.lang.String, java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable>> strMap4 = slimTableFactoryTest0.getmap();
        fitnesse.testsystems.slim.Table table5 = null;
        slimTableFactoryTest0.settable(table5);
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory7 = null;
        slimTableFactoryTest0.slimTableFactory = slimTableFactory7;
        java.util.Map<java.lang.String, java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable>> strMap9 = slimTableFactoryTest0.getmap();
        java.util.Map<java.lang.String, java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable>> strMap10 = slimTableFactoryTest0.getmap();
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory11 = null;
        slimTableFactoryTest0.slimTableFactory = slimTableFactory11;
        java.util.Map<java.lang.String, java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable>> strMap13 = slimTableFactoryTest0.map;
        fitnesse.testsystems.slim.Table table14 = slimTableFactoryTest0.table;
        fitnesse.testsystems.slim.Table table15 = slimTableFactoryTest0.table;
        // The following exception was thrown during execution in test generation
        try {
            slimTableFactoryTest0.checkTableTypeDefinesIgnoredIfDifferentSpecified();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(slimTableFactory3);
        org.junit.Assert.assertNull(strMap4);
        org.junit.Assert.assertNull(strMap9);
        org.junit.Assert.assertNull(strMap10);
        org.junit.Assert.assertNull(strMap13);
        org.junit.Assert.assertNull(table14);
        org.junit.Assert.assertNull(table15);
    }

    @Test
    public void test01204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01204");
        fitnesse.testsystems.slim.tables.SlimTableFactoryTest slimTableFactoryTest0 = new fitnesse.testsystems.slim.tables.SlimTableFactoryTest();
        fitnesse.testsystems.slim.Table table1 = null;
        slimTableFactoryTest0.table = table1;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory3 = slimTableFactoryTest0.slimTableFactory;
        java.util.Map<java.lang.String, java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable>> strMap4 = slimTableFactoryTest0.getmap();
        fitnesse.testsystems.slim.Table table5 = null;
        slimTableFactoryTest0.settable(table5);
        fitnesse.testsystems.slim.Table table7 = null;
        slimTableFactoryTest0.table = table7;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory9 = null;
        slimTableFactoryTest0.slimTableFactory = slimTableFactory9;
        fitnesse.testsystems.slim.Table table11 = null;
        slimTableFactoryTest0.table = table11;
        fitnesse.testsystems.slim.Table table13 = null;
        slimTableFactoryTest0.table = table13;
        // The following exception was thrown during execution in test generation
        try {
            slimTableFactoryTest0.tableTypeStartingWithcommentColonShouldReturnNull();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(slimTableFactory3);
        org.junit.Assert.assertNull(strMap4);
    }

    @Test
    public void test01205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01205");
        fitnesse.testsystems.slim.tables.SlimTableFactoryTest slimTableFactoryTest0 = new fitnesse.testsystems.slim.tables.SlimTableFactoryTest();
        fitnesse.testsystems.slim.Table table1 = null;
        slimTableFactoryTest0.table = table1;
        fitnesse.testsystems.slim.Table table3 = null;
        slimTableFactoryTest0.settable(table3);
        fitnesse.testsystems.slim.Table table5 = null;
        slimTableFactoryTest0.settable(table5);
        fitnesse.testsystems.slim.Table table7 = slimTableFactoryTest0.table;
        fitnesse.testsystems.slim.Table table8 = null;
        slimTableFactoryTest0.settable(table8);
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory10 = null;
        slimTableFactoryTest0.slimTableFactory = slimTableFactory10;
        fitnesse.testsystems.slim.Table table12 = null;
        slimTableFactoryTest0.table = table12;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory14 = slimTableFactoryTest0.getslimTableFactory();
        fitnesse.testsystems.slim.Table table15 = null;
        slimTableFactoryTest0.settable(table15);
        java.util.Map<java.lang.String, java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable>> strMap17 = slimTableFactoryTest0.map;
        // The following exception was thrown during execution in test generation
        try {
            slimTableFactoryTest0.shouldCreateCorrectSlimTableForTablesType();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(table7);
        org.junit.Assert.assertNull(slimTableFactory14);
        org.junit.Assert.assertNull(strMap17);
    }

    @Test
    public void test01206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01206");
        fitnesse.testsystems.slim.tables.SlimTableFactoryTest slimTableFactoryTest0 = new fitnesse.testsystems.slim.tables.SlimTableFactoryTest();
        fitnesse.testsystems.slim.Table table1 = null;
        slimTableFactoryTest0.table = table1;
        fitnesse.testsystems.slim.Table table3 = null;
        slimTableFactoryTest0.settable(table3);
        java.util.Map<java.lang.String, java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable>> strMap5 = slimTableFactoryTest0.map;
        java.util.Map<java.lang.String, java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable>> strMap6 = slimTableFactoryTest0.getmap();
        fitnesse.testsystems.slim.Table table7 = slimTableFactoryTest0.table;
        fitnesse.testsystems.slim.Table table8 = null;
        slimTableFactoryTest0.table = table8;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory10 = slimTableFactoryTest0.slimTableFactory;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory11 = slimTableFactoryTest0.slimTableFactory;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory12 = null;
        slimTableFactoryTest0.slimTableFactory = slimTableFactory12;
        // The following exception was thrown during execution in test generation
        try {
            slimTableFactoryTest0.commentTableShouldReturnNull();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(strMap5);
        org.junit.Assert.assertNull(strMap6);
        org.junit.Assert.assertNull(table7);
        org.junit.Assert.assertNull(slimTableFactory10);
        org.junit.Assert.assertNull(slimTableFactory11);
    }

    @Test
    public void test01207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01207");
        fitnesse.testsystems.slim.tables.SlimTableFactoryTest slimTableFactoryTest0 = new fitnesse.testsystems.slim.tables.SlimTableFactoryTest();
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory1 = null;
        slimTableFactoryTest0.slimTableFactory = slimTableFactory1;
        fitnesse.testsystems.slim.Table table3 = null;
        slimTableFactoryTest0.settable(table3);
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory5 = slimTableFactoryTest0.getslimTableFactory();
        fitnesse.testsystems.slim.Table table6 = null;
        slimTableFactoryTest0.settable(table6);
        // The following exception was thrown during execution in test generation
        try {
            slimTableFactoryTest0.addTableTypeImport("hi!", "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(slimTableFactory5);
    }

    @Test
    public void test01208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01208");
        fitnesse.testsystems.slim.tables.SlimTableFactoryTest slimTableFactoryTest0 = new fitnesse.testsystems.slim.tables.SlimTableFactoryTest();
        fitnesse.testsystems.slim.Table table1 = null;
        slimTableFactoryTest0.table = table1;
        fitnesse.testsystems.slim.Table table3 = null;
        slimTableFactoryTest0.settable(table3);
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory5 = null;
        slimTableFactoryTest0.slimTableFactory = slimTableFactory5;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory7 = null;
        slimTableFactoryTest0.slimTableFactory = slimTableFactory7;
        fitnesse.testsystems.slim.Table table9 = null;
        slimTableFactoryTest0.settable(table9);
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory11 = null;
        slimTableFactoryTest0.setslimTableFactory(slimTableFactory11);
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory13 = null;
        slimTableFactoryTest0.slimTableFactory = slimTableFactory13;
        fitnesse.testsystems.slim.Table table15 = null;
        slimTableFactoryTest0.settable(table15);
        // The following exception was thrown during execution in test generation
        try {
            slimTableFactoryTest0.checkTableTypeDefineUsedForTable();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test01209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01209");
        fitnesse.testsystems.slim.tables.SlimTableFactoryTest slimTableFactoryTest0 = new fitnesse.testsystems.slim.tables.SlimTableFactoryTest();
        fitnesse.testsystems.slim.Table table1 = null;
        slimTableFactoryTest0.table = table1;
        fitnesse.testsystems.slim.Table table3 = null;
        slimTableFactoryTest0.settable(table3);
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory5 = null;
        slimTableFactoryTest0.setslimTableFactory(slimTableFactory5);
        java.util.Map<java.lang.String, java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable>> strMap7 = slimTableFactoryTest0.map;
        java.util.Map<java.lang.String, java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable>> strMap8 = slimTableFactoryTest0.getmap();
        fitnesse.testsystems.slim.Table table9 = slimTableFactoryTest0.gettable();
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory10 = null;
        slimTableFactoryTest0.slimTableFactory = slimTableFactory10;
        // The following exception was thrown during execution in test generation
        try {
            slimTableFactoryTest0.tableTypeStartingWithcommentColonShouldReturnNull();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(strMap7);
        org.junit.Assert.assertNull(strMap8);
        org.junit.Assert.assertNull(table9);
    }

    @Test
    public void test01210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01210");
        fitnesse.testsystems.slim.tables.SlimTableFactoryTest slimTableFactoryTest0 = new fitnesse.testsystems.slim.tables.SlimTableFactoryTest();
        fitnesse.testsystems.slim.Table table1 = null;
        slimTableFactoryTest0.table = table1;
        fitnesse.testsystems.slim.Table table3 = null;
        slimTableFactoryTest0.settable(table3);
        java.util.Map<java.lang.String, java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable>> strMap5 = slimTableFactoryTest0.map;
        java.util.Map<java.lang.String, java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable>> strMap6 = slimTableFactoryTest0.getmap();
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory7 = null;
        slimTableFactoryTest0.slimTableFactory = slimTableFactory7;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory9 = null;
        slimTableFactoryTest0.setslimTableFactory(slimTableFactory9);
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory11 = null;
        slimTableFactoryTest0.setslimTableFactory(slimTableFactory11);
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory13 = null;
        slimTableFactoryTest0.setslimTableFactory(slimTableFactory13);
        java.lang.Class<?> wildcardClass15 = slimTableFactoryTest0.getClass();
        org.junit.Assert.assertNull(strMap5);
        org.junit.Assert.assertNull(strMap6);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test01211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01211");
        fitnesse.testsystems.slim.tables.SlimTableFactoryTest slimTableFactoryTest0 = new fitnesse.testsystems.slim.tables.SlimTableFactoryTest();
        fitnesse.testsystems.slim.Table table1 = null;
        slimTableFactoryTest0.table = table1;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory3 = null;
        slimTableFactoryTest0.slimTableFactory = slimTableFactory3;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory5 = slimTableFactoryTest0.getslimTableFactory();
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory6 = slimTableFactoryTest0.getslimTableFactory();
        // The following exception was thrown during execution in test generation
        try {
            slimTableFactoryTest0.shouldCreateCorrectSlimTableForTablesType();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(slimTableFactory5);
        org.junit.Assert.assertNull(slimTableFactory6);
    }

    @Test
    public void test01212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01212");
        fitnesse.testsystems.slim.tables.SlimTableFactoryTest slimTableFactoryTest0 = new fitnesse.testsystems.slim.tables.SlimTableFactoryTest();
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory1 = slimTableFactoryTest0.slimTableFactory;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory2 = slimTableFactoryTest0.slimTableFactory;
        fitnesse.testsystems.slim.Table table3 = slimTableFactoryTest0.gettable();
        fitnesse.testsystems.slim.Table table4 = slimTableFactoryTest0.gettable();
        fitnesse.testsystems.slim.Table table5 = slimTableFactoryTest0.gettable();
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory6 = slimTableFactoryTest0.slimTableFactory;
        fitnesse.testsystems.slim.Table table7 = null;
        slimTableFactoryTest0.settable(table7);
        fitnesse.testsystems.slim.Table table9 = null;
        slimTableFactoryTest0.settable(table9);
        java.lang.Class<?> wildcardClass11 = slimTableFactoryTest0.getClass();
        org.junit.Assert.assertNull(slimTableFactory1);
        org.junit.Assert.assertNull(slimTableFactory2);
        org.junit.Assert.assertNull(table3);
        org.junit.Assert.assertNull(table4);
        org.junit.Assert.assertNull(table5);
        org.junit.Assert.assertNull(slimTableFactory6);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test01213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01213");
        fitnesse.testsystems.slim.tables.SlimTableFactoryTest slimTableFactoryTest0 = new fitnesse.testsystems.slim.tables.SlimTableFactoryTest();
        fitnesse.testsystems.slim.Table table1 = null;
        slimTableFactoryTest0.table = table1;
        fitnesse.testsystems.slim.Table table3 = null;
        slimTableFactoryTest0.settable(table3);
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory5 = null;
        slimTableFactoryTest0.slimTableFactory = slimTableFactory5;
        fitnesse.testsystems.slim.Table table7 = slimTableFactoryTest0.table;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory8 = null;
        slimTableFactoryTest0.slimTableFactory = slimTableFactory8;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory10 = slimTableFactoryTest0.slimTableFactory;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass11 = slimTableFactory10.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(table7);
        org.junit.Assert.assertNull(slimTableFactory10);
    }

    @Test
    public void test01214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01214");
        fitnesse.testsystems.slim.tables.SlimTableFactoryTest slimTableFactoryTest0 = new fitnesse.testsystems.slim.tables.SlimTableFactoryTest();
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory1 = slimTableFactoryTest0.slimTableFactory;
        fitnesse.testsystems.slim.Table table2 = slimTableFactoryTest0.gettable();
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory3 = null;
        slimTableFactoryTest0.slimTableFactory = slimTableFactory3;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory5 = null;
        slimTableFactoryTest0.slimTableFactory = slimTableFactory5;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory7 = null;
        slimTableFactoryTest0.setslimTableFactory(slimTableFactory7);
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory9 = null;
        slimTableFactoryTest0.slimTableFactory = slimTableFactory9;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory11 = null;
        slimTableFactoryTest0.setslimTableFactory(slimTableFactory11);
        // The following exception was thrown during execution in test generation
        try {
            slimTableFactoryTest0.checkTableTypeDefineUsedForTable();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(slimTableFactory1);
        org.junit.Assert.assertNull(table2);
    }

    @Test
    public void test01215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01215");
        fitnesse.testsystems.slim.tables.SlimTableFactoryTest slimTableFactoryTest0 = new fitnesse.testsystems.slim.tables.SlimTableFactoryTest();
        fitnesse.testsystems.slim.Table table1 = null;
        slimTableFactoryTest0.table = table1;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory3 = slimTableFactoryTest0.slimTableFactory;
        java.util.Map<java.lang.String, java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable>> strMap4 = slimTableFactoryTest0.getmap();
        fitnesse.testsystems.slim.Table table5 = null;
        slimTableFactoryTest0.settable(table5);
        fitnesse.testsystems.slim.Table table7 = null;
        slimTableFactoryTest0.table = table7;
        java.util.Map<java.lang.String, java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable>> strMap9 = slimTableFactoryTest0.map;
        fitnesse.testsystems.slim.Table table10 = slimTableFactoryTest0.table;
        // The following exception was thrown during execution in test generation
        try {
            slimTableFactoryTest0.tableTypeStartingWithcommentColonShouldReturnNull();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(slimTableFactory3);
        org.junit.Assert.assertNull(strMap4);
        org.junit.Assert.assertNull(strMap9);
        org.junit.Assert.assertNull(table10);
    }

    @Test
    public void test01216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01216");
        fitnesse.testsystems.slim.tables.SlimTableFactoryTest slimTableFactoryTest0 = new fitnesse.testsystems.slim.tables.SlimTableFactoryTest();
        fitnesse.testsystems.slim.Table table1 = null;
        slimTableFactoryTest0.table = table1;
        fitnesse.testsystems.slim.Table table3 = null;
        slimTableFactoryTest0.settable(table3);
        fitnesse.testsystems.slim.Table table5 = null;
        slimTableFactoryTest0.table = table5;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory7 = slimTableFactoryTest0.slimTableFactory;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory8 = slimTableFactoryTest0.slimTableFactory;
        java.util.Map<java.lang.String, java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable>> strMap9 = slimTableFactoryTest0.map;
        fitnesse.testsystems.slim.Table table10 = null;
        slimTableFactoryTest0.settable(table10);
        // The following exception was thrown during execution in test generation
        try {
            slimTableFactoryTest0.shouldCreateCorrectSlimTableForTablesType();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(slimTableFactory7);
        org.junit.Assert.assertNull(slimTableFactory8);
        org.junit.Assert.assertNull(strMap9);
    }

    @Test
    public void test01217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01217");
        fitnesse.testsystems.slim.tables.SlimTableFactoryTest slimTableFactoryTest0 = new fitnesse.testsystems.slim.tables.SlimTableFactoryTest();
        fitnesse.testsystems.slim.Table table1 = null;
        slimTableFactoryTest0.table = table1;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory3 = slimTableFactoryTest0.getslimTableFactory();
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory4 = slimTableFactoryTest0.getslimTableFactory();
        fitnesse.testsystems.slim.Table table5 = null;
        slimTableFactoryTest0.table = table5;
        fitnesse.testsystems.slim.Table table7 = null;
        slimTableFactoryTest0.table = table7;
        java.util.Map<java.lang.String, java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable>> strMap9 = slimTableFactoryTest0.map;
        // The following exception was thrown during execution in test generation
        try {
            slimTableFactoryTest0.checkTableTypeDefinesIgnoredIfDifferentSpecified();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(slimTableFactory3);
        org.junit.Assert.assertNull(slimTableFactory4);
        org.junit.Assert.assertNull(strMap9);
    }

    @Test
    public void test01218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01218");
        fitnesse.testsystems.slim.tables.SlimTableFactoryTest slimTableFactoryTest0 = new fitnesse.testsystems.slim.tables.SlimTableFactoryTest();
        fitnesse.testsystems.slim.Table table1 = null;
        slimTableFactoryTest0.table = table1;
        fitnesse.testsystems.slim.Table table3 = null;
        slimTableFactoryTest0.settable(table3);
        java.util.Map<java.lang.String, java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable>> strMap5 = slimTableFactoryTest0.map;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory6 = slimTableFactoryTest0.getslimTableFactory();
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory7 = slimTableFactoryTest0.getslimTableFactory();
        java.util.Map<java.lang.String, java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable>> strMap8 = slimTableFactoryTest0.getmap();
        fitnesse.testsystems.slim.Table table9 = slimTableFactoryTest0.gettable();
        // The following exception was thrown during execution in test generation
        try {
            slimTableFactoryTest0.checkTableTypeDefineUsedForTable();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(strMap5);
        org.junit.Assert.assertNull(slimTableFactory6);
        org.junit.Assert.assertNull(slimTableFactory7);
        org.junit.Assert.assertNull(strMap8);
        org.junit.Assert.assertNull(table9);
    }

    @Test
    public void test01219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01219");
        fitnesse.testsystems.slim.tables.SlimTableFactoryTest slimTableFactoryTest0 = new fitnesse.testsystems.slim.tables.SlimTableFactoryTest();
        fitnesse.testsystems.slim.Table table1 = null;
        slimTableFactoryTest0.table = table1;
        fitnesse.testsystems.slim.Table table3 = null;
        slimTableFactoryTest0.settable(table3);
        fitnesse.testsystems.slim.Table table5 = null;
        slimTableFactoryTest0.settable(table5);
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory7 = slimTableFactoryTest0.slimTableFactory;
        fitnesse.testsystems.slim.Table table8 = null;
        slimTableFactoryTest0.settable(table8);
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory10 = null;
        slimTableFactoryTest0.setslimTableFactory(slimTableFactory10);
        fitnesse.testsystems.slim.Table table12 = slimTableFactoryTest0.gettable();
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory13 = null;
        slimTableFactoryTest0.slimTableFactory = slimTableFactory13;
        java.util.Map<java.lang.String, java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable>> strMap15 = slimTableFactoryTest0.getmap();
        // The following exception was thrown during execution in test generation
        try {
            slimTableFactoryTest0.commentTableShouldReturnNull();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(slimTableFactory7);
        org.junit.Assert.assertNull(table12);
        org.junit.Assert.assertNull(strMap15);
    }

    @Test
    public void test01220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01220");
        fitnesse.testsystems.slim.tables.SlimTableFactoryTest slimTableFactoryTest0 = new fitnesse.testsystems.slim.tables.SlimTableFactoryTest();
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory1 = null;
        slimTableFactoryTest0.slimTableFactory = slimTableFactory1;
        fitnesse.testsystems.slim.Table table3 = null;
        slimTableFactoryTest0.settable(table3);
        // The following exception was thrown during execution in test generation
        try {
            slimTableFactoryTest0.checkTableTypeDefineUsedForTable();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test01221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01221");
        fitnesse.testsystems.slim.tables.SlimTableFactoryTest slimTableFactoryTest0 = new fitnesse.testsystems.slim.tables.SlimTableFactoryTest();
        fitnesse.testsystems.slim.Table table1 = null;
        slimTableFactoryTest0.table = table1;
        fitnesse.testsystems.slim.Table table3 = null;
        slimTableFactoryTest0.settable(table3);
        fitnesse.testsystems.slim.Table table5 = null;
        slimTableFactoryTest0.settable(table5);
        fitnesse.testsystems.slim.Table table7 = slimTableFactoryTest0.table;
        fitnesse.testsystems.slim.Table table8 = null;
        slimTableFactoryTest0.settable(table8);
        java.util.Map<java.lang.String, java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable>> strMap10 = slimTableFactoryTest0.getmap();
        fitnesse.testsystems.slim.Table table11 = null;
        slimTableFactoryTest0.table = table11;
        java.util.Map<java.lang.String, java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable>> strMap13 = slimTableFactoryTest0.getmap();
        fitnesse.testsystems.slim.Table table14 = null;
        slimTableFactoryTest0.table = table14;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory16 = null;
        slimTableFactoryTest0.setslimTableFactory(slimTableFactory16);
        // The following exception was thrown during execution in test generation
        try {
            slimTableFactoryTest0.tableTypeStartingWithcommentColonShouldReturnNull();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(table7);
        org.junit.Assert.assertNull(strMap10);
        org.junit.Assert.assertNull(strMap13);
    }

    @Test
    public void test01222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01222");
        fitnesse.testsystems.slim.tables.SlimTableFactoryTest slimTableFactoryTest0 = new fitnesse.testsystems.slim.tables.SlimTableFactoryTest();
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory1 = slimTableFactoryTest0.slimTableFactory;
        fitnesse.testsystems.slim.Table table2 = slimTableFactoryTest0.gettable();
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory3 = null;
        slimTableFactoryTest0.slimTableFactory = slimTableFactory3;
        fitnesse.testsystems.slim.Table table5 = null;
        slimTableFactoryTest0.settable(table5);
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory7 = slimTableFactoryTest0.slimTableFactory;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory8 = slimTableFactoryTest0.getslimTableFactory();
        fitnesse.testsystems.slim.Table table9 = null;
        slimTableFactoryTest0.table = table9;
        java.util.Map<java.lang.String, java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable>> strMap11 = slimTableFactoryTest0.getmap();
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory12 = slimTableFactoryTest0.slimTableFactory;
        java.lang.Class<?> wildcardClass13 = slimTableFactoryTest0.getClass();
        org.junit.Assert.assertNull(slimTableFactory1);
        org.junit.Assert.assertNull(table2);
        org.junit.Assert.assertNull(slimTableFactory7);
        org.junit.Assert.assertNull(slimTableFactory8);
        org.junit.Assert.assertNull(strMap11);
        org.junit.Assert.assertNull(slimTableFactory12);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test01223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01223");
        fitnesse.testsystems.slim.tables.SlimTableFactoryTest slimTableFactoryTest0 = new fitnesse.testsystems.slim.tables.SlimTableFactoryTest();
        fitnesse.testsystems.slim.Table table1 = null;
        slimTableFactoryTest0.table = table1;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory3 = null;
        slimTableFactoryTest0.setslimTableFactory(slimTableFactory3);
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory5 = slimTableFactoryTest0.slimTableFactory;
        java.util.Map<java.lang.String, java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable>> strMap6 = slimTableFactoryTest0.getmap();
        fitnesse.testsystems.slim.Table table7 = null;
        slimTableFactoryTest0.table = table7;
        java.util.Map<java.lang.String, java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable>> strMap9 = slimTableFactoryTest0.getmap();
        // The following exception was thrown during execution in test generation
        try {
            slimTableFactoryTest0.checkTableTypeDefinesIgnoredIfDifferentSpecified();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(slimTableFactory5);
        org.junit.Assert.assertNull(strMap6);
        org.junit.Assert.assertNull(strMap9);
    }

    @Test
    public void test01224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01224");
        fitnesse.testsystems.slim.tables.SlimTableFactoryTest slimTableFactoryTest0 = new fitnesse.testsystems.slim.tables.SlimTableFactoryTest();
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory1 = slimTableFactoryTest0.slimTableFactory;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory2 = slimTableFactoryTest0.slimTableFactory;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory3 = null;
        slimTableFactoryTest0.slimTableFactory = slimTableFactory3;
        fitnesse.testsystems.slim.Table table5 = null;
        slimTableFactoryTest0.table = table5;
        fitnesse.testsystems.slim.Table table7 = slimTableFactoryTest0.gettable();
        // The following exception was thrown during execution in test generation
        try {
            slimTableFactoryTest0.checkTableTypeDefinesIgnoredIfDifferentSpecified();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(slimTableFactory1);
        org.junit.Assert.assertNull(slimTableFactory2);
        org.junit.Assert.assertNull(table7);
    }

    @Test
    public void test01225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01225");
        fitnesse.testsystems.slim.tables.SlimTableFactoryTest slimTableFactoryTest0 = new fitnesse.testsystems.slim.tables.SlimTableFactoryTest();
        fitnesse.testsystems.slim.Table table1 = null;
        slimTableFactoryTest0.table = table1;
        fitnesse.testsystems.slim.Table table3 = null;
        slimTableFactoryTest0.settable(table3);
        fitnesse.testsystems.slim.Table table5 = null;
        slimTableFactoryTest0.settable(table5);
        fitnesse.testsystems.slim.Table table7 = null;
        slimTableFactoryTest0.table = table7;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory9 = slimTableFactoryTest0.slimTableFactory;
        fitnesse.testsystems.slim.Table table10 = null;
        slimTableFactoryTest0.table = table10;
        // The following exception was thrown during execution in test generation
        try {
            slimTableFactoryTest0.checkTableTypeDefinesIgnoredIfDifferentSpecified();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(slimTableFactory9);
    }

    @Test
    public void test01226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01226");
        fitnesse.testsystems.slim.tables.SlimTableFactoryTest slimTableFactoryTest0 = new fitnesse.testsystems.slim.tables.SlimTableFactoryTest();
        fitnesse.testsystems.slim.Table table1 = null;
        slimTableFactoryTest0.table = table1;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory3 = slimTableFactoryTest0.slimTableFactory;
        java.util.Map<java.lang.String, java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable>> strMap4 = slimTableFactoryTest0.getmap();
        fitnesse.testsystems.slim.Table table5 = null;
        slimTableFactoryTest0.settable(table5);
        fitnesse.testsystems.slim.Table table7 = null;
        slimTableFactoryTest0.table = table7;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory9 = null;
        slimTableFactoryTest0.slimTableFactory = slimTableFactory9;
        fitnesse.testsystems.slim.Table table11 = null;
        slimTableFactoryTest0.table = table11;
        fitnesse.testsystems.slim.Table table13 = null;
        slimTableFactoryTest0.table = table13;
        fitnesse.testsystems.slim.Table table15 = null;
        slimTableFactoryTest0.table = table15;
        fitnesse.testsystems.slim.Table table17 = slimTableFactoryTest0.table;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory18 = null;
        slimTableFactoryTest0.slimTableFactory = slimTableFactory18;
        java.lang.Class<?> wildcardClass20 = slimTableFactoryTest0.getClass();
        org.junit.Assert.assertNull(slimTableFactory3);
        org.junit.Assert.assertNull(strMap4);
        org.junit.Assert.assertNull(table17);
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test01227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01227");
        fitnesse.testsystems.slim.tables.SlimTableFactoryTest slimTableFactoryTest0 = new fitnesse.testsystems.slim.tables.SlimTableFactoryTest();
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory1 = slimTableFactoryTest0.slimTableFactory;
        fitnesse.testsystems.slim.Table table2 = slimTableFactoryTest0.gettable();
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory3 = null;
        slimTableFactoryTest0.slimTableFactory = slimTableFactory3;
        fitnesse.testsystems.slim.Table table5 = null;
        slimTableFactoryTest0.settable(table5);
        java.util.Map<java.lang.String, java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable>> strMap7 = slimTableFactoryTest0.getmap();
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory8 = slimTableFactoryTest0.slimTableFactory;
        // The following exception was thrown during execution in test generation
        try {
            slimTableFactoryTest0.addTableTypeImport("hi!", "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(slimTableFactory1);
        org.junit.Assert.assertNull(table2);
        org.junit.Assert.assertNull(strMap7);
        org.junit.Assert.assertNull(slimTableFactory8);
    }

    @Test
    public void test01228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01228");
        fitnesse.testsystems.slim.tables.SlimTableFactoryTest slimTableFactoryTest0 = new fitnesse.testsystems.slim.tables.SlimTableFactoryTest();
        fitnesse.testsystems.slim.Table table1 = null;
        slimTableFactoryTest0.table = table1;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory3 = slimTableFactoryTest0.slimTableFactory;
        java.util.Map<java.lang.String, java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable>> strMap4 = slimTableFactoryTest0.getmap();
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory5 = null;
        slimTableFactoryTest0.slimTableFactory = slimTableFactory5;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory7 = null;
        slimTableFactoryTest0.slimTableFactory = slimTableFactory7;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory9 = slimTableFactoryTest0.slimTableFactory;
        fitnesse.testsystems.slim.Table table10 = slimTableFactoryTest0.gettable();
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory11 = null;
        slimTableFactoryTest0.slimTableFactory = slimTableFactory11;
        // The following exception was thrown during execution in test generation
        try {
            slimTableFactoryTest0.checkTableTypeDefineUsedForTable();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(slimTableFactory3);
        org.junit.Assert.assertNull(strMap4);
        org.junit.Assert.assertNull(slimTableFactory9);
        org.junit.Assert.assertNull(table10);
    }

    @Test
    public void test01229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01229");
        fitnesse.testsystems.slim.tables.SlimTableFactoryTest slimTableFactoryTest0 = new fitnesse.testsystems.slim.tables.SlimTableFactoryTest();
        fitnesse.testsystems.slim.Table table1 = null;
        slimTableFactoryTest0.table = table1;
        fitnesse.testsystems.slim.Table table3 = null;
        slimTableFactoryTest0.settable(table3);
        java.util.Map<java.lang.String, java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable>> strMap5 = slimTableFactoryTest0.map;
        java.util.Map<java.lang.String, java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable>> strMap6 = slimTableFactoryTest0.getmap();
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory7 = slimTableFactoryTest0.slimTableFactory;
        java.util.Map<java.lang.String, java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable>> strMap8 = slimTableFactoryTest0.map;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory9 = slimTableFactoryTest0.slimTableFactory;
        fitnesse.testsystems.slim.Table table10 = null;
        slimTableFactoryTest0.settable(table10);
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory12 = slimTableFactoryTest0.getslimTableFactory();
        fitnesse.testsystems.slim.Table table13 = null;
        slimTableFactoryTest0.table = table13;
        // The following exception was thrown during execution in test generation
        try {
            slimTableFactoryTest0.commentTableShouldReturnNull();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(strMap5);
        org.junit.Assert.assertNull(strMap6);
        org.junit.Assert.assertNull(slimTableFactory7);
        org.junit.Assert.assertNull(strMap8);
        org.junit.Assert.assertNull(slimTableFactory9);
        org.junit.Assert.assertNull(slimTableFactory12);
    }

    @Test
    public void test01230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01230");
        fitnesse.testsystems.slim.tables.SlimTableFactoryTest slimTableFactoryTest0 = new fitnesse.testsystems.slim.tables.SlimTableFactoryTest();
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory1 = slimTableFactoryTest0.slimTableFactory;
        fitnesse.testsystems.slim.Table table2 = slimTableFactoryTest0.gettable();
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory3 = null;
        slimTableFactoryTest0.slimTableFactory = slimTableFactory3;
        fitnesse.testsystems.slim.Table table5 = null;
        slimTableFactoryTest0.settable(table5);
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory7 = slimTableFactoryTest0.slimTableFactory;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory8 = slimTableFactoryTest0.getslimTableFactory();
        fitnesse.testsystems.slim.Table table9 = slimTableFactoryTest0.gettable();
        fitnesse.testsystems.slim.Table table10 = slimTableFactoryTest0.gettable();
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory11 = null;
        slimTableFactoryTest0.slimTableFactory = slimTableFactory11;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory13 = null;
        slimTableFactoryTest0.setslimTableFactory(slimTableFactory13);
        java.util.Map<java.lang.String, java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable>> strMap15 = slimTableFactoryTest0.map;
        fitnesse.testsystems.slim.Table table16 = null;
        slimTableFactoryTest0.table = table16;
        java.lang.Class<?> wildcardClass18 = slimTableFactoryTest0.getClass();
        org.junit.Assert.assertNull(slimTableFactory1);
        org.junit.Assert.assertNull(table2);
        org.junit.Assert.assertNull(slimTableFactory7);
        org.junit.Assert.assertNull(slimTableFactory8);
        org.junit.Assert.assertNull(table9);
        org.junit.Assert.assertNull(table10);
        org.junit.Assert.assertNull(strMap15);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test01231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01231");
        fitnesse.testsystems.slim.tables.SlimTableFactoryTest slimTableFactoryTest0 = new fitnesse.testsystems.slim.tables.SlimTableFactoryTest();
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory1 = slimTableFactoryTest0.slimTableFactory;
        fitnesse.testsystems.slim.Table table2 = slimTableFactoryTest0.table;
        java.util.Map<java.lang.String, java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable>> strMap3 = slimTableFactoryTest0.map;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory4 = null;
        slimTableFactoryTest0.slimTableFactory = slimTableFactory4;
        fitnesse.testsystems.slim.Table table6 = null;
        slimTableFactoryTest0.settable(table6);
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory8 = slimTableFactoryTest0.getslimTableFactory();
        fitnesse.testsystems.slim.Table table9 = slimTableFactoryTest0.gettable();
        fitnesse.testsystems.slim.Table table10 = slimTableFactoryTest0.gettable();
        // The following exception was thrown during execution in test generation
        try {
            slimTableFactoryTest0.tableTypeStartingWithcommentColonShouldReturnNull();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(slimTableFactory1);
        org.junit.Assert.assertNull(table2);
        org.junit.Assert.assertNull(strMap3);
        org.junit.Assert.assertNull(slimTableFactory8);
        org.junit.Assert.assertNull(table9);
        org.junit.Assert.assertNull(table10);
    }

    @Test
    public void test01232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01232");
        fitnesse.testsystems.slim.tables.SlimTableFactoryTest slimTableFactoryTest0 = new fitnesse.testsystems.slim.tables.SlimTableFactoryTest();
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory1 = slimTableFactoryTest0.slimTableFactory;
        fitnesse.testsystems.slim.Table table2 = slimTableFactoryTest0.table;
        java.util.Map<java.lang.String, java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable>> strMap3 = slimTableFactoryTest0.map;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory4 = null;
        slimTableFactoryTest0.slimTableFactory = slimTableFactory4;
        fitnesse.testsystems.slim.Table table6 = null;
        slimTableFactoryTest0.table = table6;
        java.util.Map<java.lang.String, java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable>> strMap8 = slimTableFactoryTest0.getmap();
        fitnesse.testsystems.slim.Table table9 = slimTableFactoryTest0.table;
        java.util.Map<java.lang.String, java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable>> strMap10 = slimTableFactoryTest0.map;
        fitnesse.testsystems.slim.Table table11 = slimTableFactoryTest0.gettable();
        // The following exception was thrown during execution in test generation
        try {
            slimTableFactoryTest0.shouldCreateCorrectSlimTableForTablesType();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(slimTableFactory1);
        org.junit.Assert.assertNull(table2);
        org.junit.Assert.assertNull(strMap3);
        org.junit.Assert.assertNull(strMap8);
        org.junit.Assert.assertNull(table9);
        org.junit.Assert.assertNull(strMap10);
        org.junit.Assert.assertNull(table11);
    }

    @Test
    public void test01233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01233");
        fitnesse.testsystems.slim.tables.SlimTableFactoryTest slimTableFactoryTest0 = new fitnesse.testsystems.slim.tables.SlimTableFactoryTest();
        fitnesse.testsystems.slim.Table table1 = null;
        slimTableFactoryTest0.table = table1;
        fitnesse.testsystems.slim.Table table3 = null;
        slimTableFactoryTest0.settable(table3);
        java.util.Map<java.lang.String, java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable>> strMap5 = slimTableFactoryTest0.map;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory6 = slimTableFactoryTest0.getslimTableFactory();
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory7 = slimTableFactoryTest0.getslimTableFactory();
        java.util.Map<java.lang.String, java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable>> strMap8 = slimTableFactoryTest0.getmap();
        fitnesse.testsystems.slim.Table table9 = slimTableFactoryTest0.gettable();
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory10 = slimTableFactoryTest0.slimTableFactory;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory11 = slimTableFactoryTest0.getslimTableFactory();
        // The following exception was thrown during execution in test generation
        try {
            slimTableFactoryTest0.shouldCreateCorrectSlimTableForTablesType();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(strMap5);
        org.junit.Assert.assertNull(slimTableFactory6);
        org.junit.Assert.assertNull(slimTableFactory7);
        org.junit.Assert.assertNull(strMap8);
        org.junit.Assert.assertNull(table9);
        org.junit.Assert.assertNull(slimTableFactory10);
        org.junit.Assert.assertNull(slimTableFactory11);
    }

    @Test
    public void test01234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01234");
        fitnesse.testsystems.slim.tables.SlimTableFactoryTest slimTableFactoryTest0 = new fitnesse.testsystems.slim.tables.SlimTableFactoryTest();
        fitnesse.testsystems.slim.Table table1 = slimTableFactoryTest0.table;
        java.util.Map<java.lang.String, java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable>> strMap2 = slimTableFactoryTest0.getmap();
        java.util.Map<java.lang.String, java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable>> strMap3 = slimTableFactoryTest0.getmap();
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory4 = slimTableFactoryTest0.slimTableFactory;
        fitnesse.testsystems.slim.Table table5 = null;
        slimTableFactoryTest0.settable(table5);
        fitnesse.testsystems.slim.Table table7 = slimTableFactoryTest0.table;
        java.util.Map<java.lang.String, java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable>> strMap8 = slimTableFactoryTest0.map;
        fitnesse.testsystems.slim.Table table9 = null;
        slimTableFactoryTest0.table = table9;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory11 = null;
        slimTableFactoryTest0.setslimTableFactory(slimTableFactory11);
        fitnesse.testsystems.slim.Table table13 = null;
        slimTableFactoryTest0.settable(table13);
        fitnesse.testsystems.slim.Table table15 = null;
        slimTableFactoryTest0.table = table15;
        fitnesse.testsystems.slim.Table table17 = null;
        slimTableFactoryTest0.table = table17;
        java.lang.Class<?> wildcardClass19 = slimTableFactoryTest0.getClass();
        org.junit.Assert.assertNull(table1);
        org.junit.Assert.assertNull(strMap2);
        org.junit.Assert.assertNull(strMap3);
        org.junit.Assert.assertNull(slimTableFactory4);
        org.junit.Assert.assertNull(table7);
        org.junit.Assert.assertNull(strMap8);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test01235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01235");
        fitnesse.testsystems.slim.tables.SlimTableFactoryTest slimTableFactoryTest0 = new fitnesse.testsystems.slim.tables.SlimTableFactoryTest();
        fitnesse.testsystems.slim.Table table1 = null;
        slimTableFactoryTest0.table = table1;
        fitnesse.testsystems.slim.Table table3 = null;
        slimTableFactoryTest0.settable(table3);
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory5 = null;
        slimTableFactoryTest0.slimTableFactory = slimTableFactory5;
        fitnesse.testsystems.slim.Table table7 = slimTableFactoryTest0.table;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory8 = null;
        slimTableFactoryTest0.slimTableFactory = slimTableFactory8;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory10 = null;
        slimTableFactoryTest0.slimTableFactory = slimTableFactory10;
        java.util.Map<java.lang.String, java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable>> strMap12 = slimTableFactoryTest0.map;
        java.util.Map<java.lang.String, java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable>> strMap13 = slimTableFactoryTest0.map;
        // The following exception was thrown during execution in test generation
        try {
            slimTableFactoryTest0.commentTableShouldReturnNull();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(table7);
        org.junit.Assert.assertNull(strMap12);
        org.junit.Assert.assertNull(strMap13);
    }

    @Test
    public void test01236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01236");
        fitnesse.testsystems.slim.tables.SlimTableFactoryTest slimTableFactoryTest0 = new fitnesse.testsystems.slim.tables.SlimTableFactoryTest();
        fitnesse.testsystems.slim.Table table1 = null;
        slimTableFactoryTest0.table = table1;
        fitnesse.testsystems.slim.Table table3 = null;
        slimTableFactoryTest0.settable(table3);
        fitnesse.testsystems.slim.Table table5 = null;
        slimTableFactoryTest0.settable(table5);
        fitnesse.testsystems.slim.Table table7 = slimTableFactoryTest0.table;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory8 = null;
        slimTableFactoryTest0.setslimTableFactory(slimTableFactory8);
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory10 = null;
        slimTableFactoryTest0.slimTableFactory = slimTableFactory10;
        fitnesse.testsystems.slim.Table table12 = null;
        slimTableFactoryTest0.settable(table12);
        // The following exception was thrown during execution in test generation
        try {
            slimTableFactoryTest0.tableTypeStartingWithcommentColonShouldReturnNull();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(table7);
    }

    @Test
    public void test01237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01237");
        fitnesse.testsystems.slim.tables.SlimTableFactoryTest slimTableFactoryTest0 = new fitnesse.testsystems.slim.tables.SlimTableFactoryTest();
        fitnesse.testsystems.slim.Table table1 = null;
        slimTableFactoryTest0.table = table1;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory3 = null;
        slimTableFactoryTest0.slimTableFactory = slimTableFactory3;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory5 = slimTableFactoryTest0.getslimTableFactory();
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory6 = slimTableFactoryTest0.getslimTableFactory();
        // The following exception was thrown during execution in test generation
        try {
            slimTableFactoryTest0.checkTableTypeDefinesIgnoredIfDifferentSpecified();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(slimTableFactory5);
        org.junit.Assert.assertNull(slimTableFactory6);
    }

    @Test
    public void test01238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01238");
        fitnesse.testsystems.slim.tables.SlimTableFactoryTest slimTableFactoryTest0 = new fitnesse.testsystems.slim.tables.SlimTableFactoryTest();
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory1 = slimTableFactoryTest0.slimTableFactory;
        fitnesse.testsystems.slim.Table table2 = slimTableFactoryTest0.gettable();
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory3 = null;
        slimTableFactoryTest0.slimTableFactory = slimTableFactory3;
        fitnesse.testsystems.slim.Table table5 = null;
        slimTableFactoryTest0.settable(table5);
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory7 = slimTableFactoryTest0.slimTableFactory;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory8 = slimTableFactoryTest0.getslimTableFactory();
        fitnesse.testsystems.slim.Table table9 = slimTableFactoryTest0.gettable();
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory10 = null;
        slimTableFactoryTest0.slimTableFactory = slimTableFactory10;
        fitnesse.testsystems.slim.Table table12 = slimTableFactoryTest0.table;
        fitnesse.testsystems.slim.Table table13 = slimTableFactoryTest0.table;
        fitnesse.testsystems.slim.Table table14 = null;
        slimTableFactoryTest0.settable(table14);
        // The following exception was thrown during execution in test generation
        try {
            slimTableFactoryTest0.checkTableTypeDefineUsedForTable();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(slimTableFactory1);
        org.junit.Assert.assertNull(table2);
        org.junit.Assert.assertNull(slimTableFactory7);
        org.junit.Assert.assertNull(slimTableFactory8);
        org.junit.Assert.assertNull(table9);
        org.junit.Assert.assertNull(table12);
        org.junit.Assert.assertNull(table13);
    }

    @Test
    public void test01239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01239");
        fitnesse.testsystems.slim.tables.SlimTableFactoryTest slimTableFactoryTest0 = new fitnesse.testsystems.slim.tables.SlimTableFactoryTest();
        fitnesse.testsystems.slim.Table table1 = slimTableFactoryTest0.table;
        java.util.Map<java.lang.String, java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable>> strMap2 = slimTableFactoryTest0.getmap();
        fitnesse.testsystems.slim.Table table3 = null;
        slimTableFactoryTest0.table = table3;
        fitnesse.testsystems.slim.Table table5 = slimTableFactoryTest0.gettable();
        fitnesse.testsystems.slim.Table table6 = null;
        slimTableFactoryTest0.table = table6;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory8 = slimTableFactoryTest0.getslimTableFactory();
        fitnesse.testsystems.slim.Table table9 = null;
        slimTableFactoryTest0.settable(table9);
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory11 = null;
        slimTableFactoryTest0.slimTableFactory = slimTableFactory11;
        java.util.Map<java.lang.String, java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable>> strMap13 = slimTableFactoryTest0.map;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory14 = null;
        slimTableFactoryTest0.slimTableFactory = slimTableFactory14;
        fitnesse.testsystems.slim.Table table16 = slimTableFactoryTest0.gettable();
        // The following exception was thrown during execution in test generation
        try {
            slimTableFactoryTest0.checkTableTypeDefinesIgnoredIfDifferentSpecified();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(table1);
        org.junit.Assert.assertNull(strMap2);
        org.junit.Assert.assertNull(table5);
        org.junit.Assert.assertNull(slimTableFactory8);
        org.junit.Assert.assertNull(strMap13);
        org.junit.Assert.assertNull(table16);
    }

    @Test
    public void test01240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01240");
        fitnesse.testsystems.slim.tables.SlimTableFactoryTest slimTableFactoryTest0 = new fitnesse.testsystems.slim.tables.SlimTableFactoryTest();
        fitnesse.testsystems.slim.Table table1 = null;
        slimTableFactoryTest0.table = table1;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory3 = slimTableFactoryTest0.slimTableFactory;
        java.util.Map<java.lang.String, java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable>> strMap4 = slimTableFactoryTest0.getmap();
        fitnesse.testsystems.slim.Table table5 = null;
        slimTableFactoryTest0.settable(table5);
        fitnesse.testsystems.slim.Table table7 = null;
        slimTableFactoryTest0.table = table7;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory9 = null;
        slimTableFactoryTest0.slimTableFactory = slimTableFactory9;
        java.util.Map<java.lang.String, java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable>> strMap11 = slimTableFactoryTest0.map;
        fitnesse.testsystems.slim.Table table12 = null;
        slimTableFactoryTest0.settable(table12);
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory14 = null;
        slimTableFactoryTest0.slimTableFactory = slimTableFactory14;
        // The following exception was thrown during execution in test generation
        try {
            slimTableFactoryTest0.commentTableShouldReturnNull();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(slimTableFactory3);
        org.junit.Assert.assertNull(strMap4);
        org.junit.Assert.assertNull(strMap11);
    }

    @Test
    public void test01241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01241");
        fitnesse.testsystems.slim.tables.SlimTableFactoryTest slimTableFactoryTest0 = new fitnesse.testsystems.slim.tables.SlimTableFactoryTest();
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory1 = slimTableFactoryTest0.slimTableFactory;
        fitnesse.testsystems.slim.Table table2 = slimTableFactoryTest0.table;
        java.util.Map<java.lang.String, java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable>> strMap3 = slimTableFactoryTest0.map;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory4 = null;
        slimTableFactoryTest0.slimTableFactory = slimTableFactory4;
        fitnesse.testsystems.slim.Table table6 = null;
        slimTableFactoryTest0.table = table6;
        java.util.Map<java.lang.String, java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable>> strMap8 = slimTableFactoryTest0.getmap();
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory9 = null;
        slimTableFactoryTest0.setslimTableFactory(slimTableFactory9);
        fitnesse.testsystems.slim.Table table11 = null;
        slimTableFactoryTest0.table = table11;
        // The following exception was thrown during execution in test generation
        try {
            slimTableFactoryTest0.checkTableTypeDefineUsedForTable();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(slimTableFactory1);
        org.junit.Assert.assertNull(table2);
        org.junit.Assert.assertNull(strMap3);
        org.junit.Assert.assertNull(strMap8);
    }

    @Test
    public void test01242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01242");
        fitnesse.testsystems.slim.tables.SlimTableFactoryTest slimTableFactoryTest0 = new fitnesse.testsystems.slim.tables.SlimTableFactoryTest();
        fitnesse.testsystems.slim.Table table1 = null;
        slimTableFactoryTest0.table = table1;
        fitnesse.testsystems.slim.Table table3 = null;
        slimTableFactoryTest0.settable(table3);
        fitnesse.testsystems.slim.Table table5 = null;
        slimTableFactoryTest0.settable(table5);
        fitnesse.testsystems.slim.Table table7 = slimTableFactoryTest0.table;
        fitnesse.testsystems.slim.Table table8 = null;
        slimTableFactoryTest0.settable(table8);
        java.util.Map<java.lang.String, java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable>> strMap10 = slimTableFactoryTest0.getmap();
        fitnesse.testsystems.slim.Table table11 = null;
        slimTableFactoryTest0.table = table11;
        fitnesse.testsystems.slim.Table table13 = slimTableFactoryTest0.table;
        fitnesse.testsystems.slim.Table table14 = null;
        slimTableFactoryTest0.settable(table14);
        fitnesse.testsystems.slim.Table table16 = null;
        slimTableFactoryTest0.table = table16;
        // The following exception was thrown during execution in test generation
        try {
            slimTableFactoryTest0.checkTableTypeDefineUsedForTable();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(table7);
        org.junit.Assert.assertNull(strMap10);
        org.junit.Assert.assertNull(table13);
    }

    @Test
    public void test01243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01243");
        fitnesse.testsystems.slim.tables.SlimTableFactoryTest slimTableFactoryTest0 = new fitnesse.testsystems.slim.tables.SlimTableFactoryTest();
        fitnesse.testsystems.slim.Table table1 = null;
        slimTableFactoryTest0.table = table1;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory3 = null;
        slimTableFactoryTest0.setslimTableFactory(slimTableFactory3);
        java.util.Map<java.lang.String, java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable>> strMap5 = slimTableFactoryTest0.map;
        fitnesse.testsystems.slim.Table table6 = null;
        slimTableFactoryTest0.table = table6;
        fitnesse.testsystems.slim.Table table8 = slimTableFactoryTest0.gettable();
        fitnesse.testsystems.slim.Table table9 = slimTableFactoryTest0.table;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass10 = table9.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(strMap5);
        org.junit.Assert.assertNull(table8);
        org.junit.Assert.assertNull(table9);
    }

    @Test
    public void test01244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01244");
        fitnesse.testsystems.slim.tables.SlimTableFactoryTest slimTableFactoryTest0 = new fitnesse.testsystems.slim.tables.SlimTableFactoryTest();
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory1 = slimTableFactoryTest0.slimTableFactory;
        fitnesse.testsystems.slim.Table table2 = slimTableFactoryTest0.gettable();
        fitnesse.testsystems.slim.Table table3 = null;
        slimTableFactoryTest0.table = table3;
        fitnesse.testsystems.slim.Table table5 = null;
        slimTableFactoryTest0.table = table5;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory7 = null;
        slimTableFactoryTest0.slimTableFactory = slimTableFactory7;
        fitnesse.testsystems.slim.Table table9 = slimTableFactoryTest0.gettable();
        fitnesse.testsystems.slim.Table table10 = null;
        slimTableFactoryTest0.table = table10;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory12 = null;
        slimTableFactoryTest0.slimTableFactory = slimTableFactory12;
        fitnesse.testsystems.slim.Table table14 = null;
        slimTableFactoryTest0.settable(table14);
        java.util.Map<java.lang.String, java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable>> strMap16 = slimTableFactoryTest0.getmap();
        // The following exception was thrown during execution in test generation
        try {
            slimTableFactoryTest0.commentTableShouldReturnNull();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(slimTableFactory1);
        org.junit.Assert.assertNull(table2);
        org.junit.Assert.assertNull(table9);
        org.junit.Assert.assertNull(strMap16);
    }

    @Test
    public void test01245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01245");
        fitnesse.testsystems.slim.tables.SlimTableFactoryTest slimTableFactoryTest0 = new fitnesse.testsystems.slim.tables.SlimTableFactoryTest();
        fitnesse.testsystems.slim.Table table1 = null;
        slimTableFactoryTest0.table = table1;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory3 = null;
        slimTableFactoryTest0.slimTableFactory = slimTableFactory3;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory5 = slimTableFactoryTest0.getslimTableFactory();
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory6 = null;
        slimTableFactoryTest0.setslimTableFactory(slimTableFactory6);
        fitnesse.testsystems.slim.Table table8 = null;
        slimTableFactoryTest0.settable(table8);
        java.util.Map<java.lang.String, java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable>> strMap10 = slimTableFactoryTest0.getmap();
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory11 = slimTableFactoryTest0.slimTableFactory;
        fitnesse.testsystems.slim.Table table12 = slimTableFactoryTest0.gettable();
        // The following exception was thrown during execution in test generation
        try {
            slimTableFactoryTest0.shouldCreateCorrectSlimTableForTablesType();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(slimTableFactory5);
        org.junit.Assert.assertNull(strMap10);
        org.junit.Assert.assertNull(slimTableFactory11);
        org.junit.Assert.assertNull(table12);
    }

    @Test
    public void test01246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01246");
        fitnesse.testsystems.slim.tables.SlimTableFactoryTest slimTableFactoryTest0 = new fitnesse.testsystems.slim.tables.SlimTableFactoryTest();
        fitnesse.testsystems.slim.Table table1 = null;
        slimTableFactoryTest0.table = table1;
        fitnesse.testsystems.slim.Table table3 = null;
        slimTableFactoryTest0.settable(table3);
        java.util.Map<java.lang.String, java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable>> strMap5 = slimTableFactoryTest0.map;
        java.util.Map<java.lang.String, java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable>> strMap6 = slimTableFactoryTest0.getmap();
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory7 = slimTableFactoryTest0.slimTableFactory;
        java.util.Map<java.lang.String, java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable>> strMap8 = slimTableFactoryTest0.map;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory9 = null;
        slimTableFactoryTest0.slimTableFactory = slimTableFactory9;
        fitnesse.testsystems.slim.Table table11 = null;
        slimTableFactoryTest0.table = table11;
        fitnesse.testsystems.slim.Table table13 = null;
        slimTableFactoryTest0.settable(table13);
        java.util.Map<java.lang.String, java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable>> strMap15 = slimTableFactoryTest0.map;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass16 = strMap15.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(strMap5);
        org.junit.Assert.assertNull(strMap6);
        org.junit.Assert.assertNull(slimTableFactory7);
        org.junit.Assert.assertNull(strMap8);
        org.junit.Assert.assertNull(strMap15);
    }

    @Test
    public void test01247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01247");
        fitnesse.testsystems.slim.tables.SlimTableFactoryTest slimTableFactoryTest0 = new fitnesse.testsystems.slim.tables.SlimTableFactoryTest();
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory1 = slimTableFactoryTest0.slimTableFactory;
        fitnesse.testsystems.slim.Table table2 = slimTableFactoryTest0.gettable();
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory3 = null;
        slimTableFactoryTest0.slimTableFactory = slimTableFactory3;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory5 = null;
        slimTableFactoryTest0.slimTableFactory = slimTableFactory5;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory7 = null;
        slimTableFactoryTest0.setslimTableFactory(slimTableFactory7);
        fitnesse.testsystems.slim.Table table9 = null;
        slimTableFactoryTest0.settable(table9);
        fitnesse.testsystems.slim.Table table11 = null;
        slimTableFactoryTest0.settable(table11);
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory13 = null;
        slimTableFactoryTest0.setslimTableFactory(slimTableFactory13);
        // The following exception was thrown during execution in test generation
        try {
            slimTableFactoryTest0.addTableTypeImport("", "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(slimTableFactory1);
        org.junit.Assert.assertNull(table2);
    }

    @Test
    public void test01248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01248");
        fitnesse.testsystems.slim.tables.SlimTableFactoryTest slimTableFactoryTest0 = new fitnesse.testsystems.slim.tables.SlimTableFactoryTest();
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory1 = slimTableFactoryTest0.slimTableFactory;
        fitnesse.testsystems.slim.Table table2 = slimTableFactoryTest0.table;
        java.util.Map<java.lang.String, java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable>> strMap3 = slimTableFactoryTest0.map;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory4 = null;
        slimTableFactoryTest0.slimTableFactory = slimTableFactory4;
        fitnesse.testsystems.slim.Table table6 = null;
        slimTableFactoryTest0.table = table6;
        java.util.Map<java.lang.String, java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable>> strMap8 = slimTableFactoryTest0.getmap();
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory9 = null;
        slimTableFactoryTest0.setslimTableFactory(slimTableFactory9);
        fitnesse.testsystems.slim.Table table11 = null;
        slimTableFactoryTest0.table = table11;
        // The following exception was thrown during execution in test generation
        try {
            slimTableFactoryTest0.checkTableTypeDefinesIgnoredIfDifferentSpecified();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(slimTableFactory1);
        org.junit.Assert.assertNull(table2);
        org.junit.Assert.assertNull(strMap3);
        org.junit.Assert.assertNull(strMap8);
    }

    @Test
    public void test01249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01249");
        fitnesse.testsystems.slim.tables.SlimTableFactoryTest slimTableFactoryTest0 = new fitnesse.testsystems.slim.tables.SlimTableFactoryTest();
        fitnesse.testsystems.slim.Table table1 = null;
        slimTableFactoryTest0.table = table1;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory3 = null;
        slimTableFactoryTest0.slimTableFactory = slimTableFactory3;
        fitnesse.testsystems.slim.Table table5 = null;
        slimTableFactoryTest0.settable(table5);
        java.util.Map<java.lang.String, java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable>> strMap7 = slimTableFactoryTest0.map;
        java.util.Map<java.lang.String, java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable>> strMap8 = slimTableFactoryTest0.map;
        // The following exception was thrown during execution in test generation
        try {
            slimTableFactoryTest0.shouldCreateCorrectSlimTableForTablesType();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(strMap7);
        org.junit.Assert.assertNull(strMap8);
    }

    @Test
    public void test01250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01250");
        fitnesse.testsystems.slim.tables.SlimTableFactoryTest slimTableFactoryTest0 = new fitnesse.testsystems.slim.tables.SlimTableFactoryTest();
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory1 = slimTableFactoryTest0.slimTableFactory;
        fitnesse.testsystems.slim.Table table2 = slimTableFactoryTest0.gettable();
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory3 = null;
        slimTableFactoryTest0.slimTableFactory = slimTableFactory3;
        fitnesse.testsystems.slim.Table table5 = null;
        slimTableFactoryTest0.settable(table5);
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory7 = slimTableFactoryTest0.slimTableFactory;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory8 = slimTableFactoryTest0.getslimTableFactory();
        fitnesse.testsystems.slim.Table table9 = slimTableFactoryTest0.gettable();
        fitnesse.testsystems.slim.Table table10 = slimTableFactoryTest0.gettable();
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory11 = null;
        slimTableFactoryTest0.slimTableFactory = slimTableFactory11;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory13 = null;
        slimTableFactoryTest0.setslimTableFactory(slimTableFactory13);
        java.util.Map<java.lang.String, java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable>> strMap15 = slimTableFactoryTest0.getmap();
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory16 = null;
        slimTableFactoryTest0.slimTableFactory = slimTableFactory16;
        // The following exception was thrown during execution in test generation
        try {
            slimTableFactoryTest0.addTableTypeImport("hi!", "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(slimTableFactory1);
        org.junit.Assert.assertNull(table2);
        org.junit.Assert.assertNull(slimTableFactory7);
        org.junit.Assert.assertNull(slimTableFactory8);
        org.junit.Assert.assertNull(table9);
        org.junit.Assert.assertNull(table10);
        org.junit.Assert.assertNull(strMap15);
    }

    @Test
    public void test01251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01251");
        fitnesse.testsystems.slim.tables.SlimTableFactoryTest slimTableFactoryTest0 = new fitnesse.testsystems.slim.tables.SlimTableFactoryTest();
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory1 = slimTableFactoryTest0.slimTableFactory;
        fitnesse.testsystems.slim.Table table2 = slimTableFactoryTest0.gettable();
        fitnesse.testsystems.slim.Table table3 = null;
        slimTableFactoryTest0.table = table3;
        fitnesse.testsystems.slim.Table table5 = null;
        slimTableFactoryTest0.table = table5;
        java.util.Map<java.lang.String, java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable>> strMap7 = slimTableFactoryTest0.getmap();
        java.util.Map<java.lang.String, java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable>> strMap8 = slimTableFactoryTest0.getmap();
        // The following exception was thrown during execution in test generation
        try {
            slimTableFactoryTest0.tableTypeStartingWithcommentColonShouldReturnNull();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(slimTableFactory1);
        org.junit.Assert.assertNull(table2);
        org.junit.Assert.assertNull(strMap7);
        org.junit.Assert.assertNull(strMap8);
    }

    @Test
    public void test01252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01252");
        fitnesse.testsystems.slim.tables.SlimTableFactoryTest slimTableFactoryTest0 = new fitnesse.testsystems.slim.tables.SlimTableFactoryTest();
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory1 = slimTableFactoryTest0.slimTableFactory;
        fitnesse.testsystems.slim.Table table2 = slimTableFactoryTest0.gettable();
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory3 = null;
        slimTableFactoryTest0.slimTableFactory = slimTableFactory3;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory5 = null;
        slimTableFactoryTest0.slimTableFactory = slimTableFactory5;
        fitnesse.testsystems.slim.Table table7 = slimTableFactoryTest0.gettable();
        java.util.Map<java.lang.String, java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable>> strMap8 = slimTableFactoryTest0.getmap();
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory9 = slimTableFactoryTest0.slimTableFactory;
        // The following exception was thrown during execution in test generation
        try {
            slimTableFactoryTest0.addTableTypeImport("", "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(slimTableFactory1);
        org.junit.Assert.assertNull(table2);
        org.junit.Assert.assertNull(table7);
        org.junit.Assert.assertNull(strMap8);
        org.junit.Assert.assertNull(slimTableFactory9);
    }

    @Test
    public void test01253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01253");
        fitnesse.testsystems.slim.tables.SlimTableFactoryTest slimTableFactoryTest0 = new fitnesse.testsystems.slim.tables.SlimTableFactoryTest();
        fitnesse.testsystems.slim.Table table1 = null;
        slimTableFactoryTest0.table = table1;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory3 = null;
        slimTableFactoryTest0.slimTableFactory = slimTableFactory3;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory5 = slimTableFactoryTest0.getslimTableFactory();
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory6 = null;
        slimTableFactoryTest0.setslimTableFactory(slimTableFactory6);
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory8 = slimTableFactoryTest0.getslimTableFactory();
        java.lang.Class<?> wildcardClass9 = slimTableFactoryTest0.getClass();
        org.junit.Assert.assertNull(slimTableFactory5);
        org.junit.Assert.assertNull(slimTableFactory8);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test01254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01254");
        fitnesse.testsystems.slim.tables.SlimTableFactoryTest slimTableFactoryTest0 = new fitnesse.testsystems.slim.tables.SlimTableFactoryTest();
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory1 = slimTableFactoryTest0.slimTableFactory;
        fitnesse.testsystems.slim.Table table2 = slimTableFactoryTest0.gettable();
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory3 = null;
        slimTableFactoryTest0.slimTableFactory = slimTableFactory3;
        fitnesse.testsystems.slim.Table table5 = null;
        slimTableFactoryTest0.settable(table5);
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory7 = slimTableFactoryTest0.slimTableFactory;
        fitnesse.testsystems.slim.Table table8 = null;
        slimTableFactoryTest0.settable(table8);
        fitnesse.testsystems.slim.Table table10 = slimTableFactoryTest0.table;
        fitnesse.testsystems.slim.Table table11 = slimTableFactoryTest0.gettable();
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory12 = null;
        slimTableFactoryTest0.slimTableFactory = slimTableFactory12;
        fitnesse.testsystems.slim.Table table14 = slimTableFactoryTest0.table;
        // The following exception was thrown during execution in test generation
        try {
            slimTableFactoryTest0.shouldCreateCorrectSlimTableForTablesType();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(slimTableFactory1);
        org.junit.Assert.assertNull(table2);
        org.junit.Assert.assertNull(slimTableFactory7);
        org.junit.Assert.assertNull(table10);
        org.junit.Assert.assertNull(table11);
        org.junit.Assert.assertNull(table14);
    }

    @Test
    public void test01255() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01255");
        fitnesse.testsystems.slim.tables.SlimTableFactoryTest slimTableFactoryTest0 = new fitnesse.testsystems.slim.tables.SlimTableFactoryTest();
        fitnesse.testsystems.slim.Table table1 = null;
        slimTableFactoryTest0.table = table1;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory3 = slimTableFactoryTest0.slimTableFactory;
        java.util.Map<java.lang.String, java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable>> strMap4 = slimTableFactoryTest0.getmap();
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory5 = slimTableFactoryTest0.slimTableFactory;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory6 = slimTableFactoryTest0.getslimTableFactory();
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory7 = null;
        slimTableFactoryTest0.slimTableFactory = slimTableFactory7;
        fitnesse.testsystems.slim.Table table9 = null;
        slimTableFactoryTest0.settable(table9);
        // The following exception was thrown during execution in test generation
        try {
            slimTableFactoryTest0.checkTableTypeDefineUsedForTable();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(slimTableFactory3);
        org.junit.Assert.assertNull(strMap4);
        org.junit.Assert.assertNull(slimTableFactory5);
        org.junit.Assert.assertNull(slimTableFactory6);
    }

    @Test
    public void test01256() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01256");
        fitnesse.testsystems.slim.tables.SlimTableFactoryTest slimTableFactoryTest0 = new fitnesse.testsystems.slim.tables.SlimTableFactoryTest();
        fitnesse.testsystems.slim.Table table1 = null;
        slimTableFactoryTest0.table = table1;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory3 = slimTableFactoryTest0.slimTableFactory;
        fitnesse.testsystems.slim.Table table4 = null;
        slimTableFactoryTest0.table = table4;
        java.util.Map<java.lang.String, java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable>> strMap6 = slimTableFactoryTest0.map;
        fitnesse.testsystems.slim.Table table7 = slimTableFactoryTest0.table;
        fitnesse.testsystems.slim.Table table8 = null;
        slimTableFactoryTest0.table = table8;
        // The following exception was thrown during execution in test generation
        try {
            slimTableFactoryTest0.checkTableTypeDefineUsedForTable();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(slimTableFactory3);
        org.junit.Assert.assertNull(strMap6);
        org.junit.Assert.assertNull(table7);
    }

    @Test
    public void test01257() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01257");
        fitnesse.testsystems.slim.tables.SlimTableFactoryTest slimTableFactoryTest0 = new fitnesse.testsystems.slim.tables.SlimTableFactoryTest();
        fitnesse.testsystems.slim.Table table1 = null;
        slimTableFactoryTest0.table = table1;
        fitnesse.testsystems.slim.Table table3 = null;
        slimTableFactoryTest0.settable(table3);
        fitnesse.testsystems.slim.Table table5 = null;
        slimTableFactoryTest0.settable(table5);
        fitnesse.testsystems.slim.Table table7 = slimTableFactoryTest0.table;
        fitnesse.testsystems.slim.Table table8 = null;
        slimTableFactoryTest0.settable(table8);
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory10 = null;
        slimTableFactoryTest0.slimTableFactory = slimTableFactory10;
        fitnesse.testsystems.slim.Table table12 = null;
        slimTableFactoryTest0.table = table12;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory14 = slimTableFactoryTest0.slimTableFactory;
        org.junit.Assert.assertNull(table7);
        org.junit.Assert.assertNull(slimTableFactory14);
    }

    @Test
    public void test01258() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01258");
        fitnesse.testsystems.slim.tables.SlimTableFactoryTest slimTableFactoryTest0 = new fitnesse.testsystems.slim.tables.SlimTableFactoryTest();
        fitnesse.testsystems.slim.Table table1 = null;
        slimTableFactoryTest0.table = table1;
        fitnesse.testsystems.slim.Table table3 = null;
        slimTableFactoryTest0.settable(table3);
        java.util.Map<java.lang.String, java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable>> strMap5 = slimTableFactoryTest0.map;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory6 = slimTableFactoryTest0.getslimTableFactory();
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory7 = slimTableFactoryTest0.getslimTableFactory();
        fitnesse.testsystems.slim.Table table8 = slimTableFactoryTest0.gettable();
        fitnesse.testsystems.slim.Table table9 = null;
        slimTableFactoryTest0.settable(table9);
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory11 = slimTableFactoryTest0.slimTableFactory;
        java.util.Map<java.lang.String, java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable>> strMap12 = slimTableFactoryTest0.map;
        // The following exception was thrown during execution in test generation
        try {
            slimTableFactoryTest0.commentTableShouldReturnNull();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(strMap5);
        org.junit.Assert.assertNull(slimTableFactory6);
        org.junit.Assert.assertNull(slimTableFactory7);
        org.junit.Assert.assertNull(table8);
        org.junit.Assert.assertNull(slimTableFactory11);
        org.junit.Assert.assertNull(strMap12);
    }

    @Test
    public void test01259() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01259");
        fitnesse.testsystems.slim.tables.SlimTableFactoryTest slimTableFactoryTest0 = new fitnesse.testsystems.slim.tables.SlimTableFactoryTest();
        fitnesse.testsystems.slim.Table table1 = null;
        slimTableFactoryTest0.table = table1;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory3 = slimTableFactoryTest0.slimTableFactory;
        java.util.Map<java.lang.String, java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable>> strMap4 = slimTableFactoryTest0.getmap();
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory5 = slimTableFactoryTest0.slimTableFactory;
        java.util.Map<java.lang.String, java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable>> strMap6 = slimTableFactoryTest0.getmap();
        fitnesse.testsystems.slim.Table table7 = null;
        slimTableFactoryTest0.table = table7;
        java.util.Map<java.lang.String, java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable>> strMap9 = slimTableFactoryTest0.map;
        java.util.Map<java.lang.String, java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable>> strMap10 = slimTableFactoryTest0.getmap();
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory11 = slimTableFactoryTest0.slimTableFactory;
        // The following exception was thrown during execution in test generation
        try {
            slimTableFactoryTest0.checkTableTypeDefineUsedForTable();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(slimTableFactory3);
        org.junit.Assert.assertNull(strMap4);
        org.junit.Assert.assertNull(slimTableFactory5);
        org.junit.Assert.assertNull(strMap6);
        org.junit.Assert.assertNull(strMap9);
        org.junit.Assert.assertNull(strMap10);
        org.junit.Assert.assertNull(slimTableFactory11);
    }

    @Test
    public void test01260() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01260");
        fitnesse.testsystems.slim.tables.SlimTableFactoryTest slimTableFactoryTest0 = new fitnesse.testsystems.slim.tables.SlimTableFactoryTest();
        fitnesse.testsystems.slim.Table table1 = null;
        slimTableFactoryTest0.table = table1;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory3 = slimTableFactoryTest0.slimTableFactory;
        java.util.Map<java.lang.String, java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable>> strMap4 = slimTableFactoryTest0.getmap();
        fitnesse.testsystems.slim.Table table5 = null;
        slimTableFactoryTest0.settable(table5);
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory7 = null;
        slimTableFactoryTest0.setslimTableFactory(slimTableFactory7);
        java.util.Map<java.lang.String, java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable>> strMap9 = slimTableFactoryTest0.getmap();
        java.util.Map<java.lang.String, java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable>> strMap10 = slimTableFactoryTest0.map;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory11 = null;
        slimTableFactoryTest0.slimTableFactory = slimTableFactory11;
        java.util.Map<java.lang.String, java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable>> strMap13 = slimTableFactoryTest0.getmap();
        // The following exception was thrown during execution in test generation
        try {
            slimTableFactoryTest0.tableTypeStartingWithcommentColonShouldReturnNull();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(slimTableFactory3);
        org.junit.Assert.assertNull(strMap4);
        org.junit.Assert.assertNull(strMap9);
        org.junit.Assert.assertNull(strMap10);
        org.junit.Assert.assertNull(strMap13);
    }

    @Test
    public void test01261() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01261");
        fitnesse.testsystems.slim.tables.SlimTableFactoryTest slimTableFactoryTest0 = new fitnesse.testsystems.slim.tables.SlimTableFactoryTest();
        fitnesse.testsystems.slim.Table table1 = null;
        slimTableFactoryTest0.table = table1;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory3 = slimTableFactoryTest0.slimTableFactory;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory4 = slimTableFactoryTest0.slimTableFactory;
        java.util.Map<java.lang.String, java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable>> strMap5 = slimTableFactoryTest0.map;
        fitnesse.testsystems.slim.Table table6 = slimTableFactoryTest0.table;
        java.util.Map<java.lang.String, java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable>> strMap7 = slimTableFactoryTest0.getmap();
        fitnesse.testsystems.slim.Table table8 = slimTableFactoryTest0.table;
        // The following exception was thrown during execution in test generation
        try {
            slimTableFactoryTest0.commentTableShouldReturnNull();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(slimTableFactory3);
        org.junit.Assert.assertNull(slimTableFactory4);
        org.junit.Assert.assertNull(strMap5);
        org.junit.Assert.assertNull(table6);
        org.junit.Assert.assertNull(strMap7);
        org.junit.Assert.assertNull(table8);
    }

    @Test
    public void test01262() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01262");
        fitnesse.testsystems.slim.tables.SlimTableFactoryTest slimTableFactoryTest0 = new fitnesse.testsystems.slim.tables.SlimTableFactoryTest();
        fitnesse.testsystems.slim.Table table1 = null;
        slimTableFactoryTest0.table = table1;
        fitnesse.testsystems.slim.Table table3 = null;
        slimTableFactoryTest0.settable(table3);
        fitnesse.testsystems.slim.Table table5 = null;
        slimTableFactoryTest0.settable(table5);
        fitnesse.testsystems.slim.Table table7 = slimTableFactoryTest0.table;
        fitnesse.testsystems.slim.Table table8 = null;
        slimTableFactoryTest0.settable(table8);
        java.util.Map<java.lang.String, java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable>> strMap10 = slimTableFactoryTest0.getmap();
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory11 = slimTableFactoryTest0.slimTableFactory;
        fitnesse.testsystems.slim.Table table12 = null;
        slimTableFactoryTest0.table = table12;
        // The following exception was thrown during execution in test generation
        try {
            slimTableFactoryTest0.checkTableTypeDefineUsedForTable();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(table7);
        org.junit.Assert.assertNull(strMap10);
        org.junit.Assert.assertNull(slimTableFactory11);
    }

    @Test
    public void test01263() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01263");
        fitnesse.testsystems.slim.tables.SlimTableFactoryTest slimTableFactoryTest0 = new fitnesse.testsystems.slim.tables.SlimTableFactoryTest();
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory1 = slimTableFactoryTest0.slimTableFactory;
        fitnesse.testsystems.slim.Table table2 = slimTableFactoryTest0.gettable();
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory3 = null;
        slimTableFactoryTest0.slimTableFactory = slimTableFactory3;
        fitnesse.testsystems.slim.Table table5 = null;
        slimTableFactoryTest0.settable(table5);
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory7 = slimTableFactoryTest0.slimTableFactory;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory8 = slimTableFactoryTest0.getslimTableFactory();
        fitnesse.testsystems.slim.Table table9 = null;
        slimTableFactoryTest0.table = table9;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory11 = slimTableFactoryTest0.getslimTableFactory();
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory12 = slimTableFactoryTest0.getslimTableFactory();
        java.util.Map<java.lang.String, java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable>> strMap13 = slimTableFactoryTest0.map;
        // The following exception was thrown during execution in test generation
        try {
            slimTableFactoryTest0.addTableTypeImport("hi!", "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(slimTableFactory1);
        org.junit.Assert.assertNull(table2);
        org.junit.Assert.assertNull(slimTableFactory7);
        org.junit.Assert.assertNull(slimTableFactory8);
        org.junit.Assert.assertNull(slimTableFactory11);
        org.junit.Assert.assertNull(slimTableFactory12);
        org.junit.Assert.assertNull(strMap13);
    }

    @Test
    public void test01264() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01264");
        fitnesse.testsystems.slim.tables.SlimTableFactoryTest slimTableFactoryTest0 = new fitnesse.testsystems.slim.tables.SlimTableFactoryTest();
        fitnesse.testsystems.slim.Table table1 = null;
        slimTableFactoryTest0.table = table1;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory3 = slimTableFactoryTest0.slimTableFactory;
        java.util.Map<java.lang.String, java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable>> strMap4 = slimTableFactoryTest0.getmap();
        fitnesse.testsystems.slim.Table table5 = null;
        slimTableFactoryTest0.settable(table5);
        fitnesse.testsystems.slim.Table table7 = null;
        slimTableFactoryTest0.table = table7;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory9 = null;
        slimTableFactoryTest0.slimTableFactory = slimTableFactory9;
        fitnesse.testsystems.slim.Table table11 = null;
        slimTableFactoryTest0.table = table11;
        fitnesse.testsystems.slim.Table table13 = null;
        slimTableFactoryTest0.settable(table13);
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory15 = null;
        slimTableFactoryTest0.slimTableFactory = slimTableFactory15;
        // The following exception was thrown during execution in test generation
        try {
            slimTableFactoryTest0.commentTableShouldReturnNull();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(slimTableFactory3);
        org.junit.Assert.assertNull(strMap4);
    }

    @Test
    public void test01265() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01265");
        fitnesse.testsystems.slim.tables.SlimTableFactoryTest slimTableFactoryTest0 = new fitnesse.testsystems.slim.tables.SlimTableFactoryTest();
        fitnesse.testsystems.slim.Table table1 = null;
        slimTableFactoryTest0.table = table1;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory3 = slimTableFactoryTest0.slimTableFactory;
        java.util.Map<java.lang.String, java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable>> strMap4 = slimTableFactoryTest0.getmap();
        fitnesse.testsystems.slim.Table table5 = null;
        slimTableFactoryTest0.settable(table5);
        fitnesse.testsystems.slim.Table table7 = null;
        slimTableFactoryTest0.table = table7;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory9 = null;
        slimTableFactoryTest0.slimTableFactory = slimTableFactory9;
        fitnesse.testsystems.slim.Table table11 = null;
        slimTableFactoryTest0.table = table11;
        fitnesse.testsystems.slim.Table table13 = slimTableFactoryTest0.gettable();
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory14 = slimTableFactoryTest0.slimTableFactory;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory15 = slimTableFactoryTest0.getslimTableFactory();
        // The following exception was thrown during execution in test generation
        try {
            slimTableFactoryTest0.shouldCreateCorrectSlimTableForTablesType();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(slimTableFactory3);
        org.junit.Assert.assertNull(strMap4);
        org.junit.Assert.assertNull(table13);
        org.junit.Assert.assertNull(slimTableFactory14);
        org.junit.Assert.assertNull(slimTableFactory15);
    }

    @Test
    public void test01266() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01266");
        fitnesse.testsystems.slim.tables.SlimTableFactoryTest slimTableFactoryTest0 = new fitnesse.testsystems.slim.tables.SlimTableFactoryTest();
        fitnesse.testsystems.slim.Table table1 = null;
        slimTableFactoryTest0.table = table1;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory3 = null;
        slimTableFactoryTest0.slimTableFactory = slimTableFactory3;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory5 = slimTableFactoryTest0.getslimTableFactory();
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory6 = slimTableFactoryTest0.getslimTableFactory();
        fitnesse.testsystems.slim.Table table7 = null;
        slimTableFactoryTest0.settable(table7);
        // The following exception was thrown during execution in test generation
        try {
            slimTableFactoryTest0.checkTableTypeDefinesIgnoredIfDifferentSpecified();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(slimTableFactory5);
        org.junit.Assert.assertNull(slimTableFactory6);
    }

    @Test
    public void test01267() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01267");
        fitnesse.testsystems.slim.tables.SlimTableFactoryTest slimTableFactoryTest0 = new fitnesse.testsystems.slim.tables.SlimTableFactoryTest();
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory1 = slimTableFactoryTest0.slimTableFactory;
        fitnesse.testsystems.slim.Table table2 = slimTableFactoryTest0.gettable();
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory3 = null;
        slimTableFactoryTest0.slimTableFactory = slimTableFactory3;
        fitnesse.testsystems.slim.Table table5 = null;
        slimTableFactoryTest0.settable(table5);
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory7 = slimTableFactoryTest0.slimTableFactory;
        fitnesse.testsystems.slim.Table table8 = null;
        slimTableFactoryTest0.settable(table8);
        fitnesse.testsystems.slim.Table table10 = slimTableFactoryTest0.table;
        fitnesse.testsystems.slim.Table table11 = slimTableFactoryTest0.gettable();
        fitnesse.testsystems.slim.Table table12 = null;
        slimTableFactoryTest0.table = table12;
        java.util.Map<java.lang.String, java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable>> strMap14 = slimTableFactoryTest0.map;
        // The following exception was thrown during execution in test generation
        try {
            slimTableFactoryTest0.checkTableTypeDefinesIgnoredIfDifferentSpecified();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(slimTableFactory1);
        org.junit.Assert.assertNull(table2);
        org.junit.Assert.assertNull(slimTableFactory7);
        org.junit.Assert.assertNull(table10);
        org.junit.Assert.assertNull(table11);
        org.junit.Assert.assertNull(strMap14);
    }

    @Test
    public void test01268() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01268");
        fitnesse.testsystems.slim.tables.SlimTableFactoryTest slimTableFactoryTest0 = new fitnesse.testsystems.slim.tables.SlimTableFactoryTest();
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory1 = slimTableFactoryTest0.slimTableFactory;
        fitnesse.testsystems.slim.Table table2 = slimTableFactoryTest0.gettable();
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory3 = null;
        slimTableFactoryTest0.slimTableFactory = slimTableFactory3;
        fitnesse.testsystems.slim.Table table5 = null;
        slimTableFactoryTest0.settable(table5);
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory7 = slimTableFactoryTest0.slimTableFactory;
        fitnesse.testsystems.slim.Table table8 = null;
        slimTableFactoryTest0.settable(table8);
        fitnesse.testsystems.slim.Table table10 = slimTableFactoryTest0.table;
        fitnesse.testsystems.slim.Table table11 = slimTableFactoryTest0.gettable();
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory12 = null;
        slimTableFactoryTest0.slimTableFactory = slimTableFactory12;
        java.lang.Class<?> wildcardClass14 = slimTableFactoryTest0.getClass();
        org.junit.Assert.assertNull(slimTableFactory1);
        org.junit.Assert.assertNull(table2);
        org.junit.Assert.assertNull(slimTableFactory7);
        org.junit.Assert.assertNull(table10);
        org.junit.Assert.assertNull(table11);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test01269() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01269");
        fitnesse.testsystems.slim.tables.SlimTableFactoryTest slimTableFactoryTest0 = new fitnesse.testsystems.slim.tables.SlimTableFactoryTest();
        fitnesse.testsystems.slim.Table table1 = null;
        slimTableFactoryTest0.table = table1;
        fitnesse.testsystems.slim.Table table3 = null;
        slimTableFactoryTest0.settable(table3);
        fitnesse.testsystems.slim.Table table5 = null;
        slimTableFactoryTest0.settable(table5);
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory7 = slimTableFactoryTest0.slimTableFactory;
        java.util.Map<java.lang.String, java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable>> strMap8 = slimTableFactoryTest0.map;
        fitnesse.testsystems.slim.Table table9 = slimTableFactoryTest0.table;
        java.util.Map<java.lang.String, java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable>> strMap10 = slimTableFactoryTest0.getmap();
        java.util.Map<java.lang.String, java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable>> strMap11 = slimTableFactoryTest0.map;
        fitnesse.testsystems.slim.Table table12 = slimTableFactoryTest0.table;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory13 = null;
        slimTableFactoryTest0.setslimTableFactory(slimTableFactory13);
        // The following exception was thrown during execution in test generation
        try {
            slimTableFactoryTest0.addTableTypeImport("", "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(slimTableFactory7);
        org.junit.Assert.assertNull(strMap8);
        org.junit.Assert.assertNull(table9);
        org.junit.Assert.assertNull(strMap10);
        org.junit.Assert.assertNull(strMap11);
        org.junit.Assert.assertNull(table12);
    }

    @Test
    public void test01270() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01270");
        fitnesse.testsystems.slim.tables.SlimTableFactoryTest slimTableFactoryTest0 = new fitnesse.testsystems.slim.tables.SlimTableFactoryTest();
        fitnesse.testsystems.slim.Table table1 = slimTableFactoryTest0.table;
        java.util.Map<java.lang.String, java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable>> strMap2 = slimTableFactoryTest0.getmap();
        java.util.Map<java.lang.String, java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable>> strMap3 = slimTableFactoryTest0.getmap();
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory4 = slimTableFactoryTest0.slimTableFactory;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory5 = slimTableFactoryTest0.getslimTableFactory();
        fitnesse.testsystems.slim.Table table6 = null;
        slimTableFactoryTest0.table = table6;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory8 = null;
        slimTableFactoryTest0.slimTableFactory = slimTableFactory8;
        // The following exception was thrown during execution in test generation
        try {
            slimTableFactoryTest0.addTableTypeImport("hi!", "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(table1);
        org.junit.Assert.assertNull(strMap2);
        org.junit.Assert.assertNull(strMap3);
        org.junit.Assert.assertNull(slimTableFactory4);
        org.junit.Assert.assertNull(slimTableFactory5);
    }

    @Test
    public void test01271() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01271");
        fitnesse.testsystems.slim.tables.SlimTableFactoryTest slimTableFactoryTest0 = new fitnesse.testsystems.slim.tables.SlimTableFactoryTest();
        fitnesse.testsystems.slim.Table table1 = null;
        slimTableFactoryTest0.table = table1;
        fitnesse.testsystems.slim.Table table3 = null;
        slimTableFactoryTest0.settable(table3);
        java.util.Map<java.lang.String, java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable>> strMap5 = slimTableFactoryTest0.map;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory6 = slimTableFactoryTest0.getslimTableFactory();
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory7 = slimTableFactoryTest0.getslimTableFactory();
        fitnesse.testsystems.slim.Table table8 = slimTableFactoryTest0.gettable();
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory9 = null;
        slimTableFactoryTest0.setslimTableFactory(slimTableFactory9);
        // The following exception was thrown during execution in test generation
        try {
            slimTableFactoryTest0.checkTableTypeDefineUsedForTable();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(strMap5);
        org.junit.Assert.assertNull(slimTableFactory6);
        org.junit.Assert.assertNull(slimTableFactory7);
        org.junit.Assert.assertNull(table8);
    }

    @Test
    public void test01272() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01272");
        fitnesse.testsystems.slim.tables.SlimTableFactoryTest slimTableFactoryTest0 = new fitnesse.testsystems.slim.tables.SlimTableFactoryTest();
        fitnesse.testsystems.slim.Table table1 = null;
        slimTableFactoryTest0.table = table1;
        fitnesse.testsystems.slim.Table table3 = null;
        slimTableFactoryTest0.settable(table3);
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory5 = null;
        slimTableFactoryTest0.setslimTableFactory(slimTableFactory5);
        // The following exception was thrown during execution in test generation
        try {
            slimTableFactoryTest0.addTableTypeImport("", "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test01273() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01273");
        fitnesse.testsystems.slim.tables.SlimTableFactoryTest slimTableFactoryTest0 = new fitnesse.testsystems.slim.tables.SlimTableFactoryTest();
        fitnesse.testsystems.slim.Table table1 = null;
        slimTableFactoryTest0.table = table1;
        fitnesse.testsystems.slim.Table table3 = slimTableFactoryTest0.table;
        fitnesse.testsystems.slim.Table table4 = slimTableFactoryTest0.gettable();
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory5 = slimTableFactoryTest0.slimTableFactory;
        java.util.Map<java.lang.String, java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable>> strMap6 = slimTableFactoryTest0.map;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory7 = slimTableFactoryTest0.slimTableFactory;
        // The following exception was thrown during execution in test generation
        try {
            slimTableFactoryTest0.addTableTypeImport("hi!", "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(table3);
        org.junit.Assert.assertNull(table4);
        org.junit.Assert.assertNull(slimTableFactory5);
        org.junit.Assert.assertNull(strMap6);
        org.junit.Assert.assertNull(slimTableFactory7);
    }

    @Test
    public void test01274() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01274");
        fitnesse.testsystems.slim.tables.SlimTableFactoryTest slimTableFactoryTest0 = new fitnesse.testsystems.slim.tables.SlimTableFactoryTest();
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory1 = slimTableFactoryTest0.slimTableFactory;
        fitnesse.testsystems.slim.Table table2 = slimTableFactoryTest0.gettable();
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory3 = null;
        slimTableFactoryTest0.slimTableFactory = slimTableFactory3;
        fitnesse.testsystems.slim.Table table5 = null;
        slimTableFactoryTest0.settable(table5);
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory7 = slimTableFactoryTest0.slimTableFactory;
        fitnesse.testsystems.slim.Table table8 = null;
        slimTableFactoryTest0.settable(table8);
        fitnesse.testsystems.slim.Table table10 = slimTableFactoryTest0.table;
        fitnesse.testsystems.slim.Table table11 = slimTableFactoryTest0.gettable();
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory12 = null;
        slimTableFactoryTest0.slimTableFactory = slimTableFactory12;
        fitnesse.testsystems.slim.Table table14 = slimTableFactoryTest0.gettable();
        // The following exception was thrown during execution in test generation
        try {
            slimTableFactoryTest0.addTableTypeImport("", "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(slimTableFactory1);
        org.junit.Assert.assertNull(table2);
        org.junit.Assert.assertNull(slimTableFactory7);
        org.junit.Assert.assertNull(table10);
        org.junit.Assert.assertNull(table11);
        org.junit.Assert.assertNull(table14);
    }

    @Test
    public void test01275() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01275");
        fitnesse.testsystems.slim.tables.SlimTableFactoryTest slimTableFactoryTest0 = new fitnesse.testsystems.slim.tables.SlimTableFactoryTest();
        fitnesse.testsystems.slim.Table table1 = slimTableFactoryTest0.table;
        java.util.Map<java.lang.String, java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable>> strMap2 = slimTableFactoryTest0.getmap();
        java.util.Map<java.lang.String, java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable>> strMap3 = slimTableFactoryTest0.getmap();
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory4 = slimTableFactoryTest0.slimTableFactory;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory5 = slimTableFactoryTest0.getslimTableFactory();
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory6 = null;
        slimTableFactoryTest0.setslimTableFactory(slimTableFactory6);
        fitnesse.testsystems.slim.Table table8 = slimTableFactoryTest0.gettable();
        // The following exception was thrown during execution in test generation
        try {
            slimTableFactoryTest0.addTableTypeImport("", "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(table1);
        org.junit.Assert.assertNull(strMap2);
        org.junit.Assert.assertNull(strMap3);
        org.junit.Assert.assertNull(slimTableFactory4);
        org.junit.Assert.assertNull(slimTableFactory5);
        org.junit.Assert.assertNull(table8);
    }

    @Test
    public void test01276() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01276");
        fitnesse.testsystems.slim.tables.SlimTableFactoryTest slimTableFactoryTest0 = new fitnesse.testsystems.slim.tables.SlimTableFactoryTest();
        fitnesse.testsystems.slim.Table table1 = null;
        slimTableFactoryTest0.table = table1;
        fitnesse.testsystems.slim.Table table3 = null;
        slimTableFactoryTest0.settable(table3);
        java.util.Map<java.lang.String, java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable>> strMap5 = slimTableFactoryTest0.map;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory6 = slimTableFactoryTest0.getslimTableFactory();
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory7 = slimTableFactoryTest0.getslimTableFactory();
        java.util.Map<java.lang.String, java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable>> strMap8 = slimTableFactoryTest0.getmap();
        java.util.Map<java.lang.String, java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable>> strMap9 = slimTableFactoryTest0.getmap();
        fitnesse.testsystems.slim.Table table10 = slimTableFactoryTest0.table;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass11 = table10.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(strMap5);
        org.junit.Assert.assertNull(slimTableFactory6);
        org.junit.Assert.assertNull(slimTableFactory7);
        org.junit.Assert.assertNull(strMap8);
        org.junit.Assert.assertNull(strMap9);
        org.junit.Assert.assertNull(table10);
    }

    @Test
    public void test01277() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01277");
        fitnesse.testsystems.slim.tables.SlimTableFactoryTest slimTableFactoryTest0 = new fitnesse.testsystems.slim.tables.SlimTableFactoryTest();
        fitnesse.testsystems.slim.Table table1 = null;
        slimTableFactoryTest0.table = table1;
        fitnesse.testsystems.slim.Table table3 = null;
        slimTableFactoryTest0.settable(table3);
        fitnesse.testsystems.slim.Table table5 = null;
        slimTableFactoryTest0.settable(table5);
        fitnesse.testsystems.slim.Table table7 = slimTableFactoryTest0.table;
        fitnesse.testsystems.slim.Table table8 = null;
        slimTableFactoryTest0.settable(table8);
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory10 = null;
        slimTableFactoryTest0.slimTableFactory = slimTableFactory10;
        java.util.Map<java.lang.String, java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable>> strMap12 = slimTableFactoryTest0.map;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory13 = null;
        slimTableFactoryTest0.slimTableFactory = slimTableFactory13;
        java.util.Map<java.lang.String, java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable>> strMap15 = slimTableFactoryTest0.map;
        // The following exception was thrown during execution in test generation
        try {
            slimTableFactoryTest0.shouldCreateCorrectSlimTableForTablesType();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(table7);
        org.junit.Assert.assertNull(strMap12);
        org.junit.Assert.assertNull(strMap15);
    }

    @Test
    public void test01278() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01278");
        fitnesse.testsystems.slim.tables.SlimTableFactoryTest slimTableFactoryTest0 = new fitnesse.testsystems.slim.tables.SlimTableFactoryTest();
        fitnesse.testsystems.slim.Table table1 = null;
        slimTableFactoryTest0.table = table1;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory3 = null;
        slimTableFactoryTest0.slimTableFactory = slimTableFactory3;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory5 = slimTableFactoryTest0.getslimTableFactory();
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory6 = slimTableFactoryTest0.slimTableFactory;
        java.util.Map<java.lang.String, java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable>> strMap7 = slimTableFactoryTest0.getmap();
        java.util.Map<java.lang.String, java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable>> strMap8 = slimTableFactoryTest0.getmap();
        // The following exception was thrown during execution in test generation
        try {
            slimTableFactoryTest0.checkTableTypeDefineUsedForTable();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(slimTableFactory5);
        org.junit.Assert.assertNull(slimTableFactory6);
        org.junit.Assert.assertNull(strMap7);
        org.junit.Assert.assertNull(strMap8);
    }

    @Test
    public void test01279() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01279");
        fitnesse.testsystems.slim.tables.SlimTableFactoryTest slimTableFactoryTest0 = new fitnesse.testsystems.slim.tables.SlimTableFactoryTest();
        fitnesse.testsystems.slim.Table table1 = null;
        slimTableFactoryTest0.table = table1;
        fitnesse.testsystems.slim.Table table3 = null;
        slimTableFactoryTest0.settable(table3);
        java.util.Map<java.lang.String, java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable>> strMap5 = slimTableFactoryTest0.map;
        java.util.Map<java.lang.String, java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable>> strMap6 = slimTableFactoryTest0.getmap();
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory7 = slimTableFactoryTest0.slimTableFactory;
        fitnesse.testsystems.slim.Table table8 = slimTableFactoryTest0.gettable();
        // The following exception was thrown during execution in test generation
        try {
            slimTableFactoryTest0.tableTypeStartingWithcommentColonShouldReturnNull();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(strMap5);
        org.junit.Assert.assertNull(strMap6);
        org.junit.Assert.assertNull(slimTableFactory7);
        org.junit.Assert.assertNull(table8);
    }

    @Test
    public void test01280() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01280");
        fitnesse.testsystems.slim.tables.SlimTableFactoryTest slimTableFactoryTest0 = new fitnesse.testsystems.slim.tables.SlimTableFactoryTest();
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory1 = slimTableFactoryTest0.slimTableFactory;
        fitnesse.testsystems.slim.Table table2 = slimTableFactoryTest0.gettable();
        fitnesse.testsystems.slim.Table table3 = null;
        slimTableFactoryTest0.table = table3;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory5 = null;
        slimTableFactoryTest0.setslimTableFactory(slimTableFactory5);
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory7 = slimTableFactoryTest0.getslimTableFactory();
        // The following exception was thrown during execution in test generation
        try {
            slimTableFactoryTest0.checkTableTypeDefineUsedForTable();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(slimTableFactory1);
        org.junit.Assert.assertNull(table2);
        org.junit.Assert.assertNull(slimTableFactory7);
    }

    @Test
    public void test01281() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01281");
        fitnesse.testsystems.slim.tables.SlimTableFactoryTest slimTableFactoryTest0 = new fitnesse.testsystems.slim.tables.SlimTableFactoryTest();
        fitnesse.testsystems.slim.Table table1 = null;
        slimTableFactoryTest0.table = table1;
        fitnesse.testsystems.slim.Table table3 = null;
        slimTableFactoryTest0.settable(table3);
        fitnesse.testsystems.slim.Table table5 = null;
        slimTableFactoryTest0.settable(table5);
        fitnesse.testsystems.slim.Table table7 = slimTableFactoryTest0.table;
        fitnesse.testsystems.slim.Table table8 = null;
        slimTableFactoryTest0.settable(table8);
        java.util.Map<java.lang.String, java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable>> strMap10 = slimTableFactoryTest0.getmap();
        fitnesse.testsystems.slim.Table table11 = slimTableFactoryTest0.gettable();
        // The following exception was thrown during execution in test generation
        try {
            slimTableFactoryTest0.checkTableTypeDefinesIgnoredIfDifferentSpecified();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(table7);
        org.junit.Assert.assertNull(strMap10);
        org.junit.Assert.assertNull(table11);
    }

    @Test
    public void test01282() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01282");
        fitnesse.testsystems.slim.tables.SlimTableFactoryTest slimTableFactoryTest0 = new fitnesse.testsystems.slim.tables.SlimTableFactoryTest();
        fitnesse.testsystems.slim.Table table1 = null;
        slimTableFactoryTest0.table = table1;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory3 = slimTableFactoryTest0.slimTableFactory;
        java.util.Map<java.lang.String, java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable>> strMap4 = slimTableFactoryTest0.getmap();
        fitnesse.testsystems.slim.Table table5 = null;
        slimTableFactoryTest0.settable(table5);
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory7 = null;
        slimTableFactoryTest0.setslimTableFactory(slimTableFactory7);
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory9 = slimTableFactoryTest0.slimTableFactory;
        fitnesse.testsystems.slim.Table table10 = slimTableFactoryTest0.table;
        fitnesse.testsystems.slim.Table table11 = slimTableFactoryTest0.table;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory12 = slimTableFactoryTest0.slimTableFactory;
        java.lang.Class<?> wildcardClass13 = slimTableFactoryTest0.getClass();
        org.junit.Assert.assertNull(slimTableFactory3);
        org.junit.Assert.assertNull(strMap4);
        org.junit.Assert.assertNull(slimTableFactory9);
        org.junit.Assert.assertNull(table10);
        org.junit.Assert.assertNull(table11);
        org.junit.Assert.assertNull(slimTableFactory12);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test01283() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01283");
        fitnesse.testsystems.slim.tables.SlimTableFactoryTest slimTableFactoryTest0 = new fitnesse.testsystems.slim.tables.SlimTableFactoryTest();
        fitnesse.testsystems.slim.Table table1 = null;
        slimTableFactoryTest0.table = table1;
        fitnesse.testsystems.slim.Table table3 = null;
        slimTableFactoryTest0.settable(table3);
        java.util.Map<java.lang.String, java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable>> strMap5 = slimTableFactoryTest0.map;
        fitnesse.testsystems.slim.Table table6 = null;
        slimTableFactoryTest0.settable(table6);
        fitnesse.testsystems.slim.Table table8 = null;
        slimTableFactoryTest0.settable(table8);
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory10 = slimTableFactoryTest0.getslimTableFactory();
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory11 = slimTableFactoryTest0.slimTableFactory;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory12 = slimTableFactoryTest0.slimTableFactory;
        // The following exception was thrown during execution in test generation
        try {
            slimTableFactoryTest0.checkTableTypeDefineUsedForTable();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(strMap5);
        org.junit.Assert.assertNull(slimTableFactory10);
        org.junit.Assert.assertNull(slimTableFactory11);
        org.junit.Assert.assertNull(slimTableFactory12);
    }

    @Test
    public void test01284() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01284");
        fitnesse.testsystems.slim.tables.SlimTableFactoryTest slimTableFactoryTest0 = new fitnesse.testsystems.slim.tables.SlimTableFactoryTest();
        fitnesse.testsystems.slim.Table table1 = null;
        slimTableFactoryTest0.table = table1;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory3 = slimTableFactoryTest0.slimTableFactory;
        java.util.Map<java.lang.String, java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable>> strMap4 = slimTableFactoryTest0.getmap();
        fitnesse.testsystems.slim.Table table5 = null;
        slimTableFactoryTest0.settable(table5);
        fitnesse.testsystems.slim.Table table7 = null;
        slimTableFactoryTest0.table = table7;
        fitnesse.testsystems.slim.Table table9 = slimTableFactoryTest0.table;
        fitnesse.testsystems.slim.Table table10 = null;
        slimTableFactoryTest0.settable(table10);
        fitnesse.testsystems.slim.Table table12 = null;
        slimTableFactoryTest0.settable(table12);
        java.util.Map<java.lang.String, java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable>> strMap14 = slimTableFactoryTest0.map;
        fitnesse.testsystems.slim.Table table15 = null;
        slimTableFactoryTest0.table = table15;
        fitnesse.testsystems.slim.Table table17 = slimTableFactoryTest0.gettable();
        // The following exception was thrown during execution in test generation
        try {
            slimTableFactoryTest0.addTableTypeImport("hi!", "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(slimTableFactory3);
        org.junit.Assert.assertNull(strMap4);
        org.junit.Assert.assertNull(table9);
        org.junit.Assert.assertNull(strMap14);
        org.junit.Assert.assertNull(table17);
    }

    @Test
    public void test01285() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01285");
        fitnesse.testsystems.slim.tables.SlimTableFactoryTest slimTableFactoryTest0 = new fitnesse.testsystems.slim.tables.SlimTableFactoryTest();
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory1 = slimTableFactoryTest0.slimTableFactory;
        fitnesse.testsystems.slim.Table table2 = slimTableFactoryTest0.gettable();
        fitnesse.testsystems.slim.Table table3 = null;
        slimTableFactoryTest0.table = table3;
        fitnesse.testsystems.slim.Table table5 = null;
        slimTableFactoryTest0.table = table5;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory7 = slimTableFactoryTest0.getslimTableFactory();
        // The following exception was thrown during execution in test generation
        try {
            slimTableFactoryTest0.tableTypeStartingWithcommentColonShouldReturnNull();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(slimTableFactory1);
        org.junit.Assert.assertNull(table2);
        org.junit.Assert.assertNull(slimTableFactory7);
    }

    @Test
    public void test01286() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01286");
        fitnesse.testsystems.slim.tables.SlimTableFactoryTest slimTableFactoryTest0 = new fitnesse.testsystems.slim.tables.SlimTableFactoryTest();
        fitnesse.testsystems.slim.Table table1 = null;
        slimTableFactoryTest0.table = table1;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory3 = slimTableFactoryTest0.slimTableFactory;
        java.util.Map<java.lang.String, java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable>> strMap4 = slimTableFactoryTest0.getmap();
        fitnesse.testsystems.slim.Table table5 = null;
        slimTableFactoryTest0.settable(table5);
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory7 = null;
        slimTableFactoryTest0.setslimTableFactory(slimTableFactory7);
        java.util.Map<java.lang.String, java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable>> strMap9 = slimTableFactoryTest0.getmap();
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory10 = slimTableFactoryTest0.slimTableFactory;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory11 = null;
        slimTableFactoryTest0.setslimTableFactory(slimTableFactory11);
        // The following exception was thrown during execution in test generation
        try {
            slimTableFactoryTest0.shouldCreateCorrectSlimTableForTablesType();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(slimTableFactory3);
        org.junit.Assert.assertNull(strMap4);
        org.junit.Assert.assertNull(strMap9);
        org.junit.Assert.assertNull(slimTableFactory10);
    }

    @Test
    public void test01287() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01287");
        fitnesse.testsystems.slim.tables.SlimTableFactoryTest slimTableFactoryTest0 = new fitnesse.testsystems.slim.tables.SlimTableFactoryTest();
        fitnesse.testsystems.slim.Table table1 = slimTableFactoryTest0.table;
        java.util.Map<java.lang.String, java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable>> strMap2 = slimTableFactoryTest0.getmap();
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory3 = slimTableFactoryTest0.slimTableFactory;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory4 = slimTableFactoryTest0.getslimTableFactory();
        fitnesse.testsystems.slim.Table table5 = slimTableFactoryTest0.table;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory6 = slimTableFactoryTest0.getslimTableFactory();
        fitnesse.testsystems.slim.Table table7 = null;
        slimTableFactoryTest0.settable(table7);
        // The following exception was thrown during execution in test generation
        try {
            slimTableFactoryTest0.commentTableShouldReturnNull();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(table1);
        org.junit.Assert.assertNull(strMap2);
        org.junit.Assert.assertNull(slimTableFactory3);
        org.junit.Assert.assertNull(slimTableFactory4);
        org.junit.Assert.assertNull(table5);
        org.junit.Assert.assertNull(slimTableFactory6);
    }

    @Test
    public void test01288() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01288");
        fitnesse.testsystems.slim.tables.SlimTableFactoryTest slimTableFactoryTest0 = new fitnesse.testsystems.slim.tables.SlimTableFactoryTest();
        fitnesse.testsystems.slim.Table table1 = null;
        slimTableFactoryTest0.table = table1;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory3 = slimTableFactoryTest0.slimTableFactory;
        java.util.Map<java.lang.String, java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable>> strMap4 = slimTableFactoryTest0.getmap();
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory5 = slimTableFactoryTest0.slimTableFactory;
        java.util.Map<java.lang.String, java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable>> strMap6 = slimTableFactoryTest0.map;
        fitnesse.testsystems.slim.Table table7 = null;
        slimTableFactoryTest0.settable(table7);
        fitnesse.testsystems.slim.Table table9 = slimTableFactoryTest0.gettable();
        // The following exception was thrown during execution in test generation
        try {
            slimTableFactoryTest0.checkTableTypeDefinesIgnoredIfDifferentSpecified();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(slimTableFactory3);
        org.junit.Assert.assertNull(strMap4);
        org.junit.Assert.assertNull(slimTableFactory5);
        org.junit.Assert.assertNull(strMap6);
        org.junit.Assert.assertNull(table9);
    }

    @Test
    public void test01289() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01289");
        fitnesse.testsystems.slim.tables.SlimTableFactoryTest slimTableFactoryTest0 = new fitnesse.testsystems.slim.tables.SlimTableFactoryTest();
        fitnesse.testsystems.slim.Table table1 = null;
        slimTableFactoryTest0.table = table1;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory3 = slimTableFactoryTest0.slimTableFactory;
        java.util.Map<java.lang.String, java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable>> strMap4 = slimTableFactoryTest0.getmap();
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory5 = slimTableFactoryTest0.slimTableFactory;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory6 = slimTableFactoryTest0.getslimTableFactory();
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory7 = null;
        slimTableFactoryTest0.slimTableFactory = slimTableFactory7;
        fitnesse.testsystems.slim.Table table9 = null;
        slimTableFactoryTest0.settable(table9);
        // The following exception was thrown during execution in test generation
        try {
            slimTableFactoryTest0.checkTableTypeDefinesIgnoredIfDifferentSpecified();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(slimTableFactory3);
        org.junit.Assert.assertNull(strMap4);
        org.junit.Assert.assertNull(slimTableFactory5);
        org.junit.Assert.assertNull(slimTableFactory6);
    }

    @Test
    public void test01290() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01290");
        fitnesse.testsystems.slim.tables.SlimTableFactoryTest slimTableFactoryTest0 = new fitnesse.testsystems.slim.tables.SlimTableFactoryTest();
        fitnesse.testsystems.slim.Table table1 = null;
        slimTableFactoryTest0.table = table1;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory3 = slimTableFactoryTest0.slimTableFactory;
        java.util.Map<java.lang.String, java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable>> strMap4 = slimTableFactoryTest0.getmap();
        fitnesse.testsystems.slim.Table table5 = null;
        slimTableFactoryTest0.settable(table5);
        fitnesse.testsystems.slim.Table table7 = slimTableFactoryTest0.table;
        fitnesse.testsystems.slim.Table table8 = slimTableFactoryTest0.table;
        fitnesse.testsystems.slim.Table table9 = slimTableFactoryTest0.gettable();
        // The following exception was thrown during execution in test generation
        try {
            slimTableFactoryTest0.checkTableTypeDefinesIgnoredIfDifferentSpecified();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(slimTableFactory3);
        org.junit.Assert.assertNull(strMap4);
        org.junit.Assert.assertNull(table7);
        org.junit.Assert.assertNull(table8);
        org.junit.Assert.assertNull(table9);
    }

    @Test
    public void test01291() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01291");
        fitnesse.testsystems.slim.tables.SlimTableFactoryTest slimTableFactoryTest0 = new fitnesse.testsystems.slim.tables.SlimTableFactoryTest();
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory1 = slimTableFactoryTest0.slimTableFactory;
        fitnesse.testsystems.slim.Table table2 = slimTableFactoryTest0.gettable();
        fitnesse.testsystems.slim.Table table3 = null;
        slimTableFactoryTest0.table = table3;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory5 = null;
        slimTableFactoryTest0.setslimTableFactory(slimTableFactory5);
        java.util.Map<java.lang.String, java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable>> strMap7 = slimTableFactoryTest0.map;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory8 = slimTableFactoryTest0.slimTableFactory;
        java.util.Map<java.lang.String, java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable>> strMap9 = slimTableFactoryTest0.getmap();
        // The following exception was thrown during execution in test generation
        try {
            slimTableFactoryTest0.addTableTypeImport("", "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(slimTableFactory1);
        org.junit.Assert.assertNull(table2);
        org.junit.Assert.assertNull(strMap7);
        org.junit.Assert.assertNull(slimTableFactory8);
        org.junit.Assert.assertNull(strMap9);
    }

    @Test
    public void test01292() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01292");
        fitnesse.testsystems.slim.tables.SlimTableFactoryTest slimTableFactoryTest0 = new fitnesse.testsystems.slim.tables.SlimTableFactoryTest();
        fitnesse.testsystems.slim.Table table1 = null;
        slimTableFactoryTest0.table = table1;
        fitnesse.testsystems.slim.Table table3 = null;
        slimTableFactoryTest0.settable(table3);
        java.util.Map<java.lang.String, java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable>> strMap5 = slimTableFactoryTest0.map;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory6 = slimTableFactoryTest0.getslimTableFactory();
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory7 = slimTableFactoryTest0.getslimTableFactory();
        fitnesse.testsystems.slim.Table table8 = slimTableFactoryTest0.gettable();
        fitnesse.testsystems.slim.Table table9 = null;
        slimTableFactoryTest0.settable(table9);
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory11 = null;
        slimTableFactoryTest0.slimTableFactory = slimTableFactory11;
        // The following exception was thrown during execution in test generation
        try {
            slimTableFactoryTest0.checkTableTypeDefineUsedForTable();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(strMap5);
        org.junit.Assert.assertNull(slimTableFactory6);
        org.junit.Assert.assertNull(slimTableFactory7);
        org.junit.Assert.assertNull(table8);
    }

    @Test
    public void test01293() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01293");
        fitnesse.testsystems.slim.tables.SlimTableFactoryTest slimTableFactoryTest0 = new fitnesse.testsystems.slim.tables.SlimTableFactoryTest();
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory1 = slimTableFactoryTest0.slimTableFactory;
        fitnesse.testsystems.slim.Table table2 = slimTableFactoryTest0.gettable();
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory3 = null;
        slimTableFactoryTest0.slimTableFactory = slimTableFactory3;
        fitnesse.testsystems.slim.Table table5 = null;
        slimTableFactoryTest0.settable(table5);
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory7 = slimTableFactoryTest0.slimTableFactory;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory8 = slimTableFactoryTest0.getslimTableFactory();
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory9 = null;
        slimTableFactoryTest0.setslimTableFactory(slimTableFactory9);
        // The following exception was thrown during execution in test generation
        try {
            slimTableFactoryTest0.addTableTypeImport("", "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(slimTableFactory1);
        org.junit.Assert.assertNull(table2);
        org.junit.Assert.assertNull(slimTableFactory7);
        org.junit.Assert.assertNull(slimTableFactory8);
    }

    @Test
    public void test01294() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01294");
        fitnesse.testsystems.slim.tables.SlimTableFactoryTest slimTableFactoryTest0 = new fitnesse.testsystems.slim.tables.SlimTableFactoryTest();
        fitnesse.testsystems.slim.Table table1 = null;
        slimTableFactoryTest0.table = table1;
        fitnesse.testsystems.slim.Table table3 = null;
        slimTableFactoryTest0.settable(table3);
        java.util.Map<java.lang.String, java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable>> strMap5 = slimTableFactoryTest0.map;
        fitnesse.testsystems.slim.Table table6 = null;
        slimTableFactoryTest0.settable(table6);
        // The following exception was thrown during execution in test generation
        try {
            slimTableFactoryTest0.commentTableShouldReturnNull();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(strMap5);
    }

    @Test
    public void test01295() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01295");
        fitnesse.testsystems.slim.tables.SlimTableFactoryTest slimTableFactoryTest0 = new fitnesse.testsystems.slim.tables.SlimTableFactoryTest();
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory1 = slimTableFactoryTest0.slimTableFactory;
        fitnesse.testsystems.slim.Table table2 = slimTableFactoryTest0.gettable();
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory3 = null;
        slimTableFactoryTest0.slimTableFactory = slimTableFactory3;
        // The following exception was thrown during execution in test generation
        try {
            slimTableFactoryTest0.addTableTypeImport("", "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(slimTableFactory1);
        org.junit.Assert.assertNull(table2);
    }

    @Test
    public void test01296() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01296");
        fitnesse.testsystems.slim.tables.SlimTableFactoryTest slimTableFactoryTest0 = new fitnesse.testsystems.slim.tables.SlimTableFactoryTest();
        fitnesse.testsystems.slim.Table table1 = slimTableFactoryTest0.table;
        java.util.Map<java.lang.String, java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable>> strMap2 = slimTableFactoryTest0.map;
        fitnesse.testsystems.slim.Table table3 = null;
        slimTableFactoryTest0.table = table3;
        java.util.Map<java.lang.String, java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable>> strMap5 = slimTableFactoryTest0.getmap();
        // The following exception was thrown during execution in test generation
        try {
            slimTableFactoryTest0.checkTableTypeDefineUsedForTable();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(table1);
        org.junit.Assert.assertNull(strMap2);
        org.junit.Assert.assertNull(strMap5);
    }

    @Test
    public void test01297() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01297");
        fitnesse.testsystems.slim.tables.SlimTableFactoryTest slimTableFactoryTest0 = new fitnesse.testsystems.slim.tables.SlimTableFactoryTest();
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory1 = slimTableFactoryTest0.slimTableFactory;
        fitnesse.testsystems.slim.Table table2 = slimTableFactoryTest0.gettable();
        fitnesse.testsystems.slim.Table table3 = null;
        slimTableFactoryTest0.table = table3;
        fitnesse.testsystems.slim.Table table5 = null;
        slimTableFactoryTest0.table = table5;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory7 = null;
        slimTableFactoryTest0.slimTableFactory = slimTableFactory7;
        fitnesse.testsystems.slim.Table table9 = slimTableFactoryTest0.table;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory10 = null;
        slimTableFactoryTest0.setslimTableFactory(slimTableFactory10);
        fitnesse.testsystems.slim.Table table12 = null;
        slimTableFactoryTest0.settable(table12);
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory14 = null;
        slimTableFactoryTest0.slimTableFactory = slimTableFactory14;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory16 = slimTableFactoryTest0.slimTableFactory;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory17 = slimTableFactoryTest0.slimTableFactory;
        // The following exception was thrown during execution in test generation
        try {
            slimTableFactoryTest0.commentTableShouldReturnNull();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(slimTableFactory1);
        org.junit.Assert.assertNull(table2);
        org.junit.Assert.assertNull(table9);
        org.junit.Assert.assertNull(slimTableFactory16);
        org.junit.Assert.assertNull(slimTableFactory17);
    }

    @Test
    public void test01298() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01298");
        fitnesse.testsystems.slim.tables.SlimTableFactoryTest slimTableFactoryTest0 = new fitnesse.testsystems.slim.tables.SlimTableFactoryTest();
        fitnesse.testsystems.slim.Table table1 = null;
        slimTableFactoryTest0.table = table1;
        fitnesse.testsystems.slim.Table table3 = null;
        slimTableFactoryTest0.settable(table3);
        java.util.Map<java.lang.String, java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable>> strMap5 = slimTableFactoryTest0.map;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory6 = slimTableFactoryTest0.getslimTableFactory();
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory7 = slimTableFactoryTest0.getslimTableFactory();
        fitnesse.testsystems.slim.Table table8 = slimTableFactoryTest0.gettable();
        fitnesse.testsystems.slim.Table table9 = null;
        slimTableFactoryTest0.settable(table9);
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory11 = slimTableFactoryTest0.slimTableFactory;
        // The following exception was thrown during execution in test generation
        try {
            slimTableFactoryTest0.tableTypeStartingWithcommentColonShouldReturnNull();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(strMap5);
        org.junit.Assert.assertNull(slimTableFactory6);
        org.junit.Assert.assertNull(slimTableFactory7);
        org.junit.Assert.assertNull(table8);
        org.junit.Assert.assertNull(slimTableFactory11);
    }

    @Test
    public void test01299() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01299");
        fitnesse.testsystems.slim.tables.SlimTableFactoryTest slimTableFactoryTest0 = new fitnesse.testsystems.slim.tables.SlimTableFactoryTest();
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory1 = slimTableFactoryTest0.slimTableFactory;
        fitnesse.testsystems.slim.Table table2 = slimTableFactoryTest0.gettable();
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory3 = null;
        slimTableFactoryTest0.slimTableFactory = slimTableFactory3;
        fitnesse.testsystems.slim.Table table5 = null;
        slimTableFactoryTest0.settable(table5);
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory7 = slimTableFactoryTest0.slimTableFactory;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory8 = slimTableFactoryTest0.getslimTableFactory();
        fitnesse.testsystems.slim.Table table9 = null;
        slimTableFactoryTest0.settable(table9);
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory11 = slimTableFactoryTest0.slimTableFactory;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory12 = slimTableFactoryTest0.getslimTableFactory();
        fitnesse.testsystems.slim.Table table13 = null;
        slimTableFactoryTest0.settable(table13);
        // The following exception was thrown during execution in test generation
        try {
            slimTableFactoryTest0.addTableTypeImport("", "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(slimTableFactory1);
        org.junit.Assert.assertNull(table2);
        org.junit.Assert.assertNull(slimTableFactory7);
        org.junit.Assert.assertNull(slimTableFactory8);
        org.junit.Assert.assertNull(slimTableFactory11);
        org.junit.Assert.assertNull(slimTableFactory12);
    }

    @Test
    public void test01300() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01300");
        fitnesse.testsystems.slim.tables.SlimTableFactoryTest slimTableFactoryTest0 = new fitnesse.testsystems.slim.tables.SlimTableFactoryTest();
        fitnesse.testsystems.slim.Table table1 = null;
        slimTableFactoryTest0.table = table1;
        fitnesse.testsystems.slim.Table table3 = null;
        slimTableFactoryTest0.settable(table3);
        fitnesse.testsystems.slim.Table table5 = null;
        slimTableFactoryTest0.settable(table5);
        fitnesse.testsystems.slim.Table table7 = slimTableFactoryTest0.table;
        fitnesse.testsystems.slim.Table table8 = null;
        slimTableFactoryTest0.settable(table8);
        java.util.Map<java.lang.String, java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable>> strMap10 = slimTableFactoryTest0.getmap();
        fitnesse.testsystems.slim.Table table11 = null;
        slimTableFactoryTest0.table = table11;
        fitnesse.testsystems.slim.Table table13 = slimTableFactoryTest0.table;
        fitnesse.testsystems.slim.Table table14 = null;
        slimTableFactoryTest0.settable(table14);
        java.util.Map<java.lang.String, java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable>> strMap16 = slimTableFactoryTest0.getmap();
        fitnesse.testsystems.slim.Table table17 = slimTableFactoryTest0.table;
        // The following exception was thrown during execution in test generation
        try {
            slimTableFactoryTest0.commentTableShouldReturnNull();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(table7);
        org.junit.Assert.assertNull(strMap10);
        org.junit.Assert.assertNull(table13);
        org.junit.Assert.assertNull(strMap16);
        org.junit.Assert.assertNull(table17);
    }

    @Test
    public void test01301() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01301");
        fitnesse.testsystems.slim.tables.SlimTableFactoryTest slimTableFactoryTest0 = new fitnesse.testsystems.slim.tables.SlimTableFactoryTest();
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory1 = slimTableFactoryTest0.slimTableFactory;
        fitnesse.testsystems.slim.Table table2 = slimTableFactoryTest0.gettable();
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory3 = null;
        slimTableFactoryTest0.slimTableFactory = slimTableFactory3;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory5 = null;
        slimTableFactoryTest0.slimTableFactory = slimTableFactory5;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory7 = null;
        slimTableFactoryTest0.setslimTableFactory(slimTableFactory7);
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory9 = null;
        slimTableFactoryTest0.slimTableFactory = slimTableFactory9;
        fitnesse.testsystems.slim.Table table11 = null;
        slimTableFactoryTest0.table = table11;
        fitnesse.testsystems.slim.Table table13 = slimTableFactoryTest0.table;
        fitnesse.testsystems.slim.Table table14 = null;
        slimTableFactoryTest0.table = table14;
        // The following exception was thrown during execution in test generation
        try {
            slimTableFactoryTest0.checkTableTypeDefineUsedForTable();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(slimTableFactory1);
        org.junit.Assert.assertNull(table2);
        org.junit.Assert.assertNull(table13);
    }

    @Test
    public void test01302() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01302");
        fitnesse.testsystems.slim.tables.SlimTableFactoryTest slimTableFactoryTest0 = new fitnesse.testsystems.slim.tables.SlimTableFactoryTest();
        fitnesse.testsystems.slim.Table table1 = slimTableFactoryTest0.table;
        java.util.Map<java.lang.String, java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable>> strMap2 = slimTableFactoryTest0.getmap();
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory3 = slimTableFactoryTest0.slimTableFactory;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory4 = slimTableFactoryTest0.getslimTableFactory();
        java.util.Map<java.lang.String, java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable>> strMap5 = slimTableFactoryTest0.getmap();
        fitnesse.testsystems.slim.Table table6 = slimTableFactoryTest0.table;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass7 = table6.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(table1);
        org.junit.Assert.assertNull(strMap2);
        org.junit.Assert.assertNull(slimTableFactory3);
        org.junit.Assert.assertNull(slimTableFactory4);
        org.junit.Assert.assertNull(strMap5);
        org.junit.Assert.assertNull(table6);
    }

    @Test
    public void test01303() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01303");
        fitnesse.testsystems.slim.tables.SlimTableFactoryTest slimTableFactoryTest0 = new fitnesse.testsystems.slim.tables.SlimTableFactoryTest();
        fitnesse.testsystems.slim.Table table1 = null;
        slimTableFactoryTest0.table = table1;
        fitnesse.testsystems.slim.Table table3 = null;
        slimTableFactoryTest0.settable(table3);
        fitnesse.testsystems.slim.Table table5 = null;
        slimTableFactoryTest0.settable(table5);
        fitnesse.testsystems.slim.Table table7 = slimTableFactoryTest0.table;
        fitnesse.testsystems.slim.Table table8 = null;
        slimTableFactoryTest0.settable(table8);
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory10 = null;
        slimTableFactoryTest0.slimTableFactory = slimTableFactory10;
        java.util.Map<java.lang.String, java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable>> strMap12 = slimTableFactoryTest0.map;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory13 = null;
        slimTableFactoryTest0.slimTableFactory = slimTableFactory13;
        java.util.Map<java.lang.String, java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable>> strMap15 = slimTableFactoryTest0.map;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory16 = slimTableFactoryTest0.getslimTableFactory();
        // The following exception was thrown during execution in test generation
        try {
            slimTableFactoryTest0.checkTableTypeDefineUsedForTable();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(table7);
        org.junit.Assert.assertNull(strMap12);
        org.junit.Assert.assertNull(strMap15);
        org.junit.Assert.assertNull(slimTableFactory16);
    }

    @Test
    public void test01304() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01304");
        fitnesse.testsystems.slim.tables.SlimTableFactoryTest slimTableFactoryTest0 = new fitnesse.testsystems.slim.tables.SlimTableFactoryTest();
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory1 = slimTableFactoryTest0.slimTableFactory;
        fitnesse.testsystems.slim.Table table2 = slimTableFactoryTest0.table;
        java.util.Map<java.lang.String, java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable>> strMap3 = slimTableFactoryTest0.map;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory4 = null;
        slimTableFactoryTest0.slimTableFactory = slimTableFactory4;
        fitnesse.testsystems.slim.Table table6 = null;
        slimTableFactoryTest0.table = table6;
        java.util.Map<java.lang.String, java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable>> strMap8 = slimTableFactoryTest0.getmap();
        fitnesse.testsystems.slim.Table table9 = slimTableFactoryTest0.table;
        java.util.Map<java.lang.String, java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable>> strMap10 = slimTableFactoryTest0.map;
        fitnesse.testsystems.slim.Table table11 = null;
        slimTableFactoryTest0.table = table11;
        // The following exception was thrown during execution in test generation
        try {
            slimTableFactoryTest0.addTableTypeImport("", "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(slimTableFactory1);
        org.junit.Assert.assertNull(table2);
        org.junit.Assert.assertNull(strMap3);
        org.junit.Assert.assertNull(strMap8);
        org.junit.Assert.assertNull(table9);
        org.junit.Assert.assertNull(strMap10);
    }

    @Test
    public void test01305() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01305");
        fitnesse.testsystems.slim.tables.SlimTableFactoryTest slimTableFactoryTest0 = new fitnesse.testsystems.slim.tables.SlimTableFactoryTest();
        fitnesse.testsystems.slim.Table table1 = null;
        slimTableFactoryTest0.table = table1;
        fitnesse.testsystems.slim.Table table3 = null;
        slimTableFactoryTest0.settable(table3);
        java.util.Map<java.lang.String, java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable>> strMap5 = slimTableFactoryTest0.map;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory6 = slimTableFactoryTest0.getslimTableFactory();
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory7 = slimTableFactoryTest0.getslimTableFactory();
        fitnesse.testsystems.slim.Table table8 = slimTableFactoryTest0.gettable();
        fitnesse.testsystems.slim.Table table9 = null;
        slimTableFactoryTest0.settable(table9);
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory11 = null;
        slimTableFactoryTest0.slimTableFactory = slimTableFactory11;
        fitnesse.testsystems.slim.Table table13 = slimTableFactoryTest0.gettable();
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory14 = slimTableFactoryTest0.slimTableFactory;
        // The following exception was thrown during execution in test generation
        try {
            slimTableFactoryTest0.checkTableTypeDefinesIgnoredIfDifferentSpecified();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(strMap5);
        org.junit.Assert.assertNull(slimTableFactory6);
        org.junit.Assert.assertNull(slimTableFactory7);
        org.junit.Assert.assertNull(table8);
        org.junit.Assert.assertNull(table13);
        org.junit.Assert.assertNull(slimTableFactory14);
    }

    @Test
    public void test01306() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01306");
        fitnesse.testsystems.slim.tables.SlimTableFactoryTest slimTableFactoryTest0 = new fitnesse.testsystems.slim.tables.SlimTableFactoryTest();
        fitnesse.testsystems.slim.Table table1 = null;
        slimTableFactoryTest0.table = table1;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory3 = slimTableFactoryTest0.slimTableFactory;
        java.util.Map<java.lang.String, java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable>> strMap4 = slimTableFactoryTest0.getmap();
        fitnesse.testsystems.slim.Table table5 = null;
        slimTableFactoryTest0.settable(table5);
        fitnesse.testsystems.slim.Table table7 = null;
        slimTableFactoryTest0.table = table7;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory9 = null;
        slimTableFactoryTest0.slimTableFactory = slimTableFactory9;
        java.util.Map<java.lang.String, java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable>> strMap11 = slimTableFactoryTest0.map;
        fitnesse.testsystems.slim.Table table12 = null;
        slimTableFactoryTest0.settable(table12);
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory14 = null;
        slimTableFactoryTest0.slimTableFactory = slimTableFactory14;
        // The following exception was thrown during execution in test generation
        try {
            slimTableFactoryTest0.shouldCreateCorrectSlimTableForTablesType();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(slimTableFactory3);
        org.junit.Assert.assertNull(strMap4);
        org.junit.Assert.assertNull(strMap11);
    }

    @Test
    public void test01307() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01307");
        fitnesse.testsystems.slim.tables.SlimTableFactoryTest slimTableFactoryTest0 = new fitnesse.testsystems.slim.tables.SlimTableFactoryTest();
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory1 = slimTableFactoryTest0.slimTableFactory;
        fitnesse.testsystems.slim.Table table2 = slimTableFactoryTest0.gettable();
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory3 = null;
        slimTableFactoryTest0.slimTableFactory = slimTableFactory3;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory5 = null;
        slimTableFactoryTest0.slimTableFactory = slimTableFactory5;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory7 = slimTableFactoryTest0.slimTableFactory;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory8 = null;
        slimTableFactoryTest0.slimTableFactory = slimTableFactory8;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory10 = slimTableFactoryTest0.slimTableFactory;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory11 = slimTableFactoryTest0.getslimTableFactory();
        // The following exception was thrown during execution in test generation
        try {
            slimTableFactoryTest0.checkTableTypeDefinesIgnoredIfDifferentSpecified();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(slimTableFactory1);
        org.junit.Assert.assertNull(table2);
        org.junit.Assert.assertNull(slimTableFactory7);
        org.junit.Assert.assertNull(slimTableFactory10);
        org.junit.Assert.assertNull(slimTableFactory11);
    }

    @Test
    public void test01308() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01308");
        fitnesse.testsystems.slim.tables.SlimTableFactoryTest slimTableFactoryTest0 = new fitnesse.testsystems.slim.tables.SlimTableFactoryTest();
        fitnesse.testsystems.slim.Table table1 = null;
        slimTableFactoryTest0.table = table1;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory3 = slimTableFactoryTest0.slimTableFactory;
        java.util.Map<java.lang.String, java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable>> strMap4 = slimTableFactoryTest0.getmap();
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory5 = null;
        slimTableFactoryTest0.slimTableFactory = slimTableFactory5;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory7 = null;
        slimTableFactoryTest0.slimTableFactory = slimTableFactory7;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory9 = slimTableFactoryTest0.slimTableFactory;
        fitnesse.testsystems.slim.Table table10 = slimTableFactoryTest0.gettable();
        fitnesse.testsystems.slim.Table table11 = slimTableFactoryTest0.table;
        // The following exception was thrown during execution in test generation
        try {
            slimTableFactoryTest0.addTableTypeImport("hi!", "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(slimTableFactory3);
        org.junit.Assert.assertNull(strMap4);
        org.junit.Assert.assertNull(slimTableFactory9);
        org.junit.Assert.assertNull(table10);
        org.junit.Assert.assertNull(table11);
    }

    @Test
    public void test01309() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01309");
        fitnesse.testsystems.slim.tables.SlimTableFactoryTest slimTableFactoryTest0 = new fitnesse.testsystems.slim.tables.SlimTableFactoryTest();
        fitnesse.testsystems.slim.Table table1 = null;
        slimTableFactoryTest0.table = table1;
        fitnesse.testsystems.slim.Table table3 = null;
        slimTableFactoryTest0.settable(table3);
        java.util.Map<java.lang.String, java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable>> strMap5 = slimTableFactoryTest0.map;
        java.util.Map<java.lang.String, java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable>> strMap6 = slimTableFactoryTest0.getmap();
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory7 = slimTableFactoryTest0.slimTableFactory;
        java.util.Map<java.lang.String, java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable>> strMap8 = slimTableFactoryTest0.map;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory9 = null;
        slimTableFactoryTest0.slimTableFactory = slimTableFactory9;
        fitnesse.testsystems.slim.Table table11 = null;
        slimTableFactoryTest0.table = table11;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory13 = slimTableFactoryTest0.slimTableFactory;
        java.util.Map<java.lang.String, java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable>> strMap14 = slimTableFactoryTest0.map;
        java.lang.Class<?> wildcardClass15 = slimTableFactoryTest0.getClass();
        org.junit.Assert.assertNull(strMap5);
        org.junit.Assert.assertNull(strMap6);
        org.junit.Assert.assertNull(slimTableFactory7);
        org.junit.Assert.assertNull(strMap8);
        org.junit.Assert.assertNull(slimTableFactory13);
        org.junit.Assert.assertNull(strMap14);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test01310() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01310");
        fitnesse.testsystems.slim.tables.SlimTableFactoryTest slimTableFactoryTest0 = new fitnesse.testsystems.slim.tables.SlimTableFactoryTest();
        fitnesse.testsystems.slim.Table table1 = null;
        slimTableFactoryTest0.table = table1;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory3 = slimTableFactoryTest0.slimTableFactory;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory4 = null;
        slimTableFactoryTest0.setslimTableFactory(slimTableFactory4);
        fitnesse.testsystems.slim.Table table6 = null;
        slimTableFactoryTest0.settable(table6);
        fitnesse.testsystems.slim.Table table8 = slimTableFactoryTest0.gettable();
        fitnesse.testsystems.slim.Table table9 = null;
        slimTableFactoryTest0.settable(table9);
        // The following exception was thrown during execution in test generation
        try {
            slimTableFactoryTest0.addTableTypeImport("", "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(slimTableFactory3);
        org.junit.Assert.assertNull(table8);
    }

    @Test
    public void test01311() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01311");
        fitnesse.testsystems.slim.tables.SlimTableFactoryTest slimTableFactoryTest0 = new fitnesse.testsystems.slim.tables.SlimTableFactoryTest();
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory1 = slimTableFactoryTest0.slimTableFactory;
        fitnesse.testsystems.slim.Table table2 = slimTableFactoryTest0.gettable();
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory3 = null;
        slimTableFactoryTest0.slimTableFactory = slimTableFactory3;
        fitnesse.testsystems.slim.Table table5 = null;
        slimTableFactoryTest0.settable(table5);
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory7 = slimTableFactoryTest0.slimTableFactory;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory8 = slimTableFactoryTest0.getslimTableFactory();
        fitnesse.testsystems.slim.Table table9 = slimTableFactoryTest0.gettable();
        fitnesse.testsystems.slim.Table table10 = slimTableFactoryTest0.gettable();
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory11 = null;
        slimTableFactoryTest0.slimTableFactory = slimTableFactory11;
        java.util.Map<java.lang.String, java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable>> strMap13 = slimTableFactoryTest0.map;
        fitnesse.testsystems.slim.Table table14 = null;
        slimTableFactoryTest0.table = table14;
        // The following exception was thrown during execution in test generation
        try {
            slimTableFactoryTest0.tableTypeStartingWithcommentColonShouldReturnNull();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(slimTableFactory1);
        org.junit.Assert.assertNull(table2);
        org.junit.Assert.assertNull(slimTableFactory7);
        org.junit.Assert.assertNull(slimTableFactory8);
        org.junit.Assert.assertNull(table9);
        org.junit.Assert.assertNull(table10);
        org.junit.Assert.assertNull(strMap13);
    }

    @Test
    public void test01312() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01312");
        fitnesse.testsystems.slim.tables.SlimTableFactoryTest slimTableFactoryTest0 = new fitnesse.testsystems.slim.tables.SlimTableFactoryTest();
        fitnesse.testsystems.slim.Table table1 = null;
        slimTableFactoryTest0.table = table1;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory3 = slimTableFactoryTest0.slimTableFactory;
        java.util.Map<java.lang.String, java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable>> strMap4 = slimTableFactoryTest0.getmap();
        fitnesse.testsystems.slim.Table table5 = null;
        slimTableFactoryTest0.settable(table5);
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory7 = null;
        slimTableFactoryTest0.slimTableFactory = slimTableFactory7;
        java.util.Map<java.lang.String, java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable>> strMap9 = slimTableFactoryTest0.getmap();
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory10 = null;
        slimTableFactoryTest0.slimTableFactory = slimTableFactory10;
        // The following exception was thrown during execution in test generation
        try {
            slimTableFactoryTest0.shouldCreateCorrectSlimTableForTablesType();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(slimTableFactory3);
        org.junit.Assert.assertNull(strMap4);
        org.junit.Assert.assertNull(strMap9);
    }

    @Test
    public void test01313() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01313");
        fitnesse.testsystems.slim.tables.SlimTableFactoryTest slimTableFactoryTest0 = new fitnesse.testsystems.slim.tables.SlimTableFactoryTest();
        fitnesse.testsystems.slim.Table table1 = null;
        slimTableFactoryTest0.table = table1;
        fitnesse.testsystems.slim.Table table3 = null;
        slimTableFactoryTest0.settable(table3);
        fitnesse.testsystems.slim.Table table5 = null;
        slimTableFactoryTest0.table = table5;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory7 = slimTableFactoryTest0.slimTableFactory;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory8 = slimTableFactoryTest0.slimTableFactory;
        fitnesse.testsystems.slim.Table table9 = slimTableFactoryTest0.gettable();
        java.util.Map<java.lang.String, java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable>> strMap10 = slimTableFactoryTest0.map;
        // The following exception was thrown during execution in test generation
        try {
            slimTableFactoryTest0.addTableTypeImport("", "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(slimTableFactory7);
        org.junit.Assert.assertNull(slimTableFactory8);
        org.junit.Assert.assertNull(table9);
        org.junit.Assert.assertNull(strMap10);
    }

    @Test
    public void test01314() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01314");
        fitnesse.testsystems.slim.tables.SlimTableFactoryTest slimTableFactoryTest0 = new fitnesse.testsystems.slim.tables.SlimTableFactoryTest();
        fitnesse.testsystems.slim.Table table1 = null;
        slimTableFactoryTest0.table = table1;
        fitnesse.testsystems.slim.Table table3 = null;
        slimTableFactoryTest0.settable(table3);
        fitnesse.testsystems.slim.Table table5 = null;
        slimTableFactoryTest0.settable(table5);
        fitnesse.testsystems.slim.Table table7 = slimTableFactoryTest0.table;
        fitnesse.testsystems.slim.Table table8 = null;
        slimTableFactoryTest0.settable(table8);
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory10 = null;
        slimTableFactoryTest0.slimTableFactory = slimTableFactory10;
        fitnesse.testsystems.slim.Table table12 = null;
        slimTableFactoryTest0.table = table12;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory14 = slimTableFactoryTest0.getslimTableFactory();
        fitnesse.testsystems.slim.Table table15 = null;
        slimTableFactoryTest0.settable(table15);
        java.util.Map<java.lang.String, java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable>> strMap17 = slimTableFactoryTest0.map;
        // The following exception was thrown during execution in test generation
        try {
            slimTableFactoryTest0.commentTableShouldReturnNull();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(table7);
        org.junit.Assert.assertNull(slimTableFactory14);
        org.junit.Assert.assertNull(strMap17);
    }

    @Test
    public void test01315() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01315");
        fitnesse.testsystems.slim.tables.SlimTableFactoryTest slimTableFactoryTest0 = new fitnesse.testsystems.slim.tables.SlimTableFactoryTest();
        fitnesse.testsystems.slim.Table table1 = null;
        slimTableFactoryTest0.table = table1;
        fitnesse.testsystems.slim.Table table3 = null;
        slimTableFactoryTest0.settable(table3);
        fitnesse.testsystems.slim.Table table5 = null;
        slimTableFactoryTest0.settable(table5);
        fitnesse.testsystems.slim.Table table7 = slimTableFactoryTest0.table;
        fitnesse.testsystems.slim.Table table8 = null;
        slimTableFactoryTest0.settable(table8);
        java.util.Map<java.lang.String, java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable>> strMap10 = slimTableFactoryTest0.getmap();
        fitnesse.testsystems.slim.Table table11 = null;
        slimTableFactoryTest0.table = table11;
        fitnesse.testsystems.slim.Table table13 = slimTableFactoryTest0.table;
        fitnesse.testsystems.slim.Table table14 = null;
        slimTableFactoryTest0.settable(table14);
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory16 = null;
        slimTableFactoryTest0.setslimTableFactory(slimTableFactory16);
        java.util.Map<java.lang.String, java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable>> strMap18 = slimTableFactoryTest0.map;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass19 = strMap18.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(table7);
        org.junit.Assert.assertNull(strMap10);
        org.junit.Assert.assertNull(table13);
        org.junit.Assert.assertNull(strMap18);
    }

    @Test
    public void test01316() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01316");
        fitnesse.testsystems.slim.tables.SlimTableFactoryTest slimTableFactoryTest0 = new fitnesse.testsystems.slim.tables.SlimTableFactoryTest();
        fitnesse.testsystems.slim.Table table1 = null;
        slimTableFactoryTest0.table = table1;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory3 = slimTableFactoryTest0.slimTableFactory;
        java.util.Map<java.lang.String, java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable>> strMap4 = slimTableFactoryTest0.getmap();
        fitnesse.testsystems.slim.Table table5 = null;
        slimTableFactoryTest0.settable(table5);
        fitnesse.testsystems.slim.Table table7 = null;
        slimTableFactoryTest0.table = table7;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory9 = null;
        slimTableFactoryTest0.slimTableFactory = slimTableFactory9;
        fitnesse.testsystems.slim.Table table11 = null;
        slimTableFactoryTest0.table = table11;
        fitnesse.testsystems.slim.Table table13 = null;
        slimTableFactoryTest0.table = table13;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory15 = null;
        slimTableFactoryTest0.slimTableFactory = slimTableFactory15;
        fitnesse.testsystems.slim.Table table17 = slimTableFactoryTest0.table;
        fitnesse.testsystems.slim.Table table18 = null;
        slimTableFactoryTest0.settable(table18);
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory20 = null;
        slimTableFactoryTest0.setslimTableFactory(slimTableFactory20);
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory22 = null;
        slimTableFactoryTest0.setslimTableFactory(slimTableFactory22);
        // The following exception was thrown during execution in test generation
        try {
            slimTableFactoryTest0.addTableTypeImport("hi!", "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(slimTableFactory3);
        org.junit.Assert.assertNull(strMap4);
        org.junit.Assert.assertNull(table17);
    }

    @Test
    public void test01317() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01317");
        fitnesse.testsystems.slim.tables.SlimTableFactoryTest slimTableFactoryTest0 = new fitnesse.testsystems.slim.tables.SlimTableFactoryTest();
        fitnesse.testsystems.slim.Table table1 = null;
        slimTableFactoryTest0.table = table1;
        fitnesse.testsystems.slim.Table table3 = slimTableFactoryTest0.table;
        fitnesse.testsystems.slim.Table table4 = slimTableFactoryTest0.gettable();
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory5 = slimTableFactoryTest0.slimTableFactory;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory6 = slimTableFactoryTest0.getslimTableFactory();
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory7 = slimTableFactoryTest0.slimTableFactory;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory8 = null;
        slimTableFactoryTest0.setslimTableFactory(slimTableFactory8);
        // The following exception was thrown during execution in test generation
        try {
            slimTableFactoryTest0.checkTableTypeDefineUsedForTable();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(table3);
        org.junit.Assert.assertNull(table4);
        org.junit.Assert.assertNull(slimTableFactory5);
        org.junit.Assert.assertNull(slimTableFactory6);
        org.junit.Assert.assertNull(slimTableFactory7);
    }

    @Test
    public void test01318() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01318");
        fitnesse.testsystems.slim.tables.SlimTableFactoryTest slimTableFactoryTest0 = new fitnesse.testsystems.slim.tables.SlimTableFactoryTest();
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory1 = slimTableFactoryTest0.slimTableFactory;
        fitnesse.testsystems.slim.Table table2 = slimTableFactoryTest0.gettable();
        fitnesse.testsystems.slim.Table table3 = null;
        slimTableFactoryTest0.table = table3;
        fitnesse.testsystems.slim.Table table5 = null;
        slimTableFactoryTest0.table = table5;
        // The following exception was thrown during execution in test generation
        try {
            slimTableFactoryTest0.tableTypeStartingWithcommentColonShouldReturnNull();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(slimTableFactory1);
        org.junit.Assert.assertNull(table2);
    }

    @Test
    public void test01319() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01319");
        fitnesse.testsystems.slim.tables.SlimTableFactoryTest slimTableFactoryTest0 = new fitnesse.testsystems.slim.tables.SlimTableFactoryTest();
        fitnesse.testsystems.slim.Table table1 = null;
        slimTableFactoryTest0.table = table1;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory3 = slimTableFactoryTest0.slimTableFactory;
        java.util.Map<java.lang.String, java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable>> strMap4 = slimTableFactoryTest0.map;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory5 = slimTableFactoryTest0.getslimTableFactory();
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory6 = slimTableFactoryTest0.getslimTableFactory();
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory7 = null;
        slimTableFactoryTest0.slimTableFactory = slimTableFactory7;
        // The following exception was thrown during execution in test generation
        try {
            slimTableFactoryTest0.tableTypeStartingWithcommentColonShouldReturnNull();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(slimTableFactory3);
        org.junit.Assert.assertNull(strMap4);
        org.junit.Assert.assertNull(slimTableFactory5);
        org.junit.Assert.assertNull(slimTableFactory6);
    }

    @Test
    public void test01320() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01320");
        fitnesse.testsystems.slim.tables.SlimTableFactoryTest slimTableFactoryTest0 = new fitnesse.testsystems.slim.tables.SlimTableFactoryTest();
        fitnesse.testsystems.slim.Table table1 = slimTableFactoryTest0.table;
        java.util.Map<java.lang.String, java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable>> strMap2 = slimTableFactoryTest0.getmap();
        java.util.Map<java.lang.String, java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable>> strMap3 = slimTableFactoryTest0.getmap();
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory4 = slimTableFactoryTest0.slimTableFactory;
        fitnesse.testsystems.slim.Table table5 = null;
        slimTableFactoryTest0.settable(table5);
        fitnesse.testsystems.slim.Table table7 = slimTableFactoryTest0.table;
        java.util.Map<java.lang.String, java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable>> strMap8 = slimTableFactoryTest0.map;
        fitnesse.testsystems.slim.Table table9 = null;
        slimTableFactoryTest0.table = table9;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory11 = null;
        slimTableFactoryTest0.setslimTableFactory(slimTableFactory11);
        fitnesse.testsystems.slim.Table table13 = null;
        slimTableFactoryTest0.settable(table13);
        fitnesse.testsystems.slim.Table table15 = null;
        slimTableFactoryTest0.table = table15;
        fitnesse.testsystems.slim.Table table17 = null;
        slimTableFactoryTest0.table = table17;
        // The following exception was thrown during execution in test generation
        try {
            slimTableFactoryTest0.commentTableShouldReturnNull();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(table1);
        org.junit.Assert.assertNull(strMap2);
        org.junit.Assert.assertNull(strMap3);
        org.junit.Assert.assertNull(slimTableFactory4);
        org.junit.Assert.assertNull(table7);
        org.junit.Assert.assertNull(strMap8);
    }

    @Test
    public void test01321() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01321");
        fitnesse.testsystems.slim.tables.SlimTableFactoryTest slimTableFactoryTest0 = new fitnesse.testsystems.slim.tables.SlimTableFactoryTest();
        fitnesse.testsystems.slim.Table table1 = null;
        slimTableFactoryTest0.table = table1;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory3 = slimTableFactoryTest0.slimTableFactory;
        java.util.Map<java.lang.String, java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable>> strMap4 = slimTableFactoryTest0.getmap();
        fitnesse.testsystems.slim.Table table5 = null;
        slimTableFactoryTest0.settable(table5);
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory7 = null;
        slimTableFactoryTest0.slimTableFactory = slimTableFactory7;
        fitnesse.testsystems.slim.Table table9 = slimTableFactoryTest0.table;
        fitnesse.testsystems.slim.Table table10 = slimTableFactoryTest0.table;
        java.util.Map<java.lang.String, java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable>> strMap11 = slimTableFactoryTest0.getmap();
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory12 = null;
        slimTableFactoryTest0.slimTableFactory = slimTableFactory12;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory14 = null;
        slimTableFactoryTest0.slimTableFactory = slimTableFactory14;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory16 = slimTableFactoryTest0.slimTableFactory;
        // The following exception was thrown during execution in test generation
        try {
            slimTableFactoryTest0.commentTableShouldReturnNull();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(slimTableFactory3);
        org.junit.Assert.assertNull(strMap4);
        org.junit.Assert.assertNull(table9);
        org.junit.Assert.assertNull(table10);
        org.junit.Assert.assertNull(strMap11);
        org.junit.Assert.assertNull(slimTableFactory16);
    }

    @Test
    public void test01322() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01322");
        fitnesse.testsystems.slim.tables.SlimTableFactoryTest slimTableFactoryTest0 = new fitnesse.testsystems.slim.tables.SlimTableFactoryTest();
        fitnesse.testsystems.slim.Table table1 = null;
        slimTableFactoryTest0.table = table1;
        fitnesse.testsystems.slim.Table table3 = null;
        slimTableFactoryTest0.settable(table3);
        java.util.Map<java.lang.String, java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable>> strMap5 = slimTableFactoryTest0.map;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory6 = slimTableFactoryTest0.getslimTableFactory();
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory7 = slimTableFactoryTest0.getslimTableFactory();
        fitnesse.testsystems.slim.Table table8 = slimTableFactoryTest0.gettable();
        fitnesse.testsystems.slim.Table table9 = null;
        slimTableFactoryTest0.settable(table9);
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory11 = null;
        slimTableFactoryTest0.slimTableFactory = slimTableFactory11;
        fitnesse.testsystems.slim.Table table13 = slimTableFactoryTest0.gettable();
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory14 = null;
        slimTableFactoryTest0.setslimTableFactory(slimTableFactory14);
        // The following exception was thrown during execution in test generation
        try {
            slimTableFactoryTest0.commentTableShouldReturnNull();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(strMap5);
        org.junit.Assert.assertNull(slimTableFactory6);
        org.junit.Assert.assertNull(slimTableFactory7);
        org.junit.Assert.assertNull(table8);
        org.junit.Assert.assertNull(table13);
    }

    @Test
    public void test01323() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01323");
        fitnesse.testsystems.slim.tables.SlimTableFactoryTest slimTableFactoryTest0 = new fitnesse.testsystems.slim.tables.SlimTableFactoryTest();
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory1 = slimTableFactoryTest0.slimTableFactory;
        fitnesse.testsystems.slim.Table table2 = slimTableFactoryTest0.gettable();
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory3 = null;
        slimTableFactoryTest0.slimTableFactory = slimTableFactory3;
        fitnesse.testsystems.slim.Table table5 = null;
        slimTableFactoryTest0.settable(table5);
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory7 = slimTableFactoryTest0.slimTableFactory;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory8 = slimTableFactoryTest0.getslimTableFactory();
        fitnesse.testsystems.slim.Table table9 = slimTableFactoryTest0.gettable();
        fitnesse.testsystems.slim.Table table10 = slimTableFactoryTest0.gettable();
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory11 = null;
        slimTableFactoryTest0.slimTableFactory = slimTableFactory11;
        java.util.Map<java.lang.String, java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable>> strMap13 = slimTableFactoryTest0.map;
        fitnesse.testsystems.slim.Table table14 = slimTableFactoryTest0.gettable();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass15 = table14.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(slimTableFactory1);
        org.junit.Assert.assertNull(table2);
        org.junit.Assert.assertNull(slimTableFactory7);
        org.junit.Assert.assertNull(slimTableFactory8);
        org.junit.Assert.assertNull(table9);
        org.junit.Assert.assertNull(table10);
        org.junit.Assert.assertNull(strMap13);
        org.junit.Assert.assertNull(table14);
    }

    @Test
    public void test01324() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01324");
        fitnesse.testsystems.slim.tables.SlimTableFactoryTest slimTableFactoryTest0 = new fitnesse.testsystems.slim.tables.SlimTableFactoryTest();
        fitnesse.testsystems.slim.Table table1 = null;
        slimTableFactoryTest0.table = table1;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory3 = null;
        slimTableFactoryTest0.slimTableFactory = slimTableFactory3;
        fitnesse.testsystems.slim.Table table5 = null;
        slimTableFactoryTest0.settable(table5);
        java.util.Map<java.lang.String, java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable>> strMap7 = slimTableFactoryTest0.map;
        // The following exception was thrown during execution in test generation
        try {
            slimTableFactoryTest0.tableTypeStartingWithcommentColonShouldReturnNull();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(strMap7);
    }

    @Test
    public void test01325() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01325");
        fitnesse.testsystems.slim.tables.SlimTableFactoryTest slimTableFactoryTest0 = new fitnesse.testsystems.slim.tables.SlimTableFactoryTest();
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory1 = slimTableFactoryTest0.slimTableFactory;
        fitnesse.testsystems.slim.Table table2 = slimTableFactoryTest0.gettable();
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory3 = null;
        slimTableFactoryTest0.slimTableFactory = slimTableFactory3;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory5 = null;
        slimTableFactoryTest0.slimTableFactory = slimTableFactory5;
        fitnesse.testsystems.slim.Table table7 = slimTableFactoryTest0.gettable();
        java.util.Map<java.lang.String, java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable>> strMap8 = slimTableFactoryTest0.getmap();
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory9 = slimTableFactoryTest0.getslimTableFactory();
        java.util.Map<java.lang.String, java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable>> strMap10 = slimTableFactoryTest0.map;
        // The following exception was thrown during execution in test generation
        try {
            slimTableFactoryTest0.shouldCreateCorrectSlimTableForTablesType();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(slimTableFactory1);
        org.junit.Assert.assertNull(table2);
        org.junit.Assert.assertNull(table7);
        org.junit.Assert.assertNull(strMap8);
        org.junit.Assert.assertNull(slimTableFactory9);
        org.junit.Assert.assertNull(strMap10);
    }

    @Test
    public void test01326() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01326");
        fitnesse.testsystems.slim.tables.SlimTableFactoryTest slimTableFactoryTest0 = new fitnesse.testsystems.slim.tables.SlimTableFactoryTest();
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory1 = slimTableFactoryTest0.slimTableFactory;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory2 = slimTableFactoryTest0.slimTableFactory;
        fitnesse.testsystems.slim.Table table3 = slimTableFactoryTest0.gettable();
        fitnesse.testsystems.slim.Table table4 = null;
        slimTableFactoryTest0.settable(table4);
        // The following exception was thrown during execution in test generation
        try {
            slimTableFactoryTest0.shouldCreateCorrectSlimTableForTablesType();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(slimTableFactory1);
        org.junit.Assert.assertNull(slimTableFactory2);
        org.junit.Assert.assertNull(table3);
    }

    @Test
    public void test01327() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01327");
        fitnesse.testsystems.slim.tables.SlimTableFactoryTest slimTableFactoryTest0 = new fitnesse.testsystems.slim.tables.SlimTableFactoryTest();
        fitnesse.testsystems.slim.Table table1 = null;
        slimTableFactoryTest0.table = table1;
        fitnesse.testsystems.slim.Table table3 = slimTableFactoryTest0.table;
        fitnesse.testsystems.slim.Table table4 = slimTableFactoryTest0.gettable();
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory5 = slimTableFactoryTest0.slimTableFactory;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory6 = slimTableFactoryTest0.getslimTableFactory();
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory7 = slimTableFactoryTest0.slimTableFactory;
        fitnesse.testsystems.slim.Table table8 = slimTableFactoryTest0.gettable();
        java.lang.Class<?> wildcardClass9 = slimTableFactoryTest0.getClass();
        org.junit.Assert.assertNull(table3);
        org.junit.Assert.assertNull(table4);
        org.junit.Assert.assertNull(slimTableFactory5);
        org.junit.Assert.assertNull(slimTableFactory6);
        org.junit.Assert.assertNull(slimTableFactory7);
        org.junit.Assert.assertNull(table8);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test01328() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01328");
        fitnesse.testsystems.slim.tables.SlimTableFactoryTest slimTableFactoryTest0 = new fitnesse.testsystems.slim.tables.SlimTableFactoryTest();
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory1 = slimTableFactoryTest0.slimTableFactory;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory2 = slimTableFactoryTest0.slimTableFactory;
        fitnesse.testsystems.slim.Table table3 = slimTableFactoryTest0.gettable();
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory4 = slimTableFactoryTest0.getslimTableFactory();
        fitnesse.testsystems.slim.Table table5 = null;
        slimTableFactoryTest0.table = table5;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory7 = slimTableFactoryTest0.getslimTableFactory();
        fitnesse.testsystems.slim.Table table8 = null;
        slimTableFactoryTest0.settable(table8);
        // The following exception was thrown during execution in test generation
        try {
            slimTableFactoryTest0.addTableTypeImport("hi!", "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(slimTableFactory1);
        org.junit.Assert.assertNull(slimTableFactory2);
        org.junit.Assert.assertNull(table3);
        org.junit.Assert.assertNull(slimTableFactory4);
        org.junit.Assert.assertNull(slimTableFactory7);
    }

    @Test
    public void test01329() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01329");
        fitnesse.testsystems.slim.tables.SlimTableFactoryTest slimTableFactoryTest0 = new fitnesse.testsystems.slim.tables.SlimTableFactoryTest();
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory1 = slimTableFactoryTest0.slimTableFactory;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory2 = slimTableFactoryTest0.slimTableFactory;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory3 = slimTableFactoryTest0.slimTableFactory;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory4 = null;
        slimTableFactoryTest0.slimTableFactory = slimTableFactory4;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory6 = slimTableFactoryTest0.slimTableFactory;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory7 = slimTableFactoryTest0.getslimTableFactory();
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory8 = slimTableFactoryTest0.getslimTableFactory();
        org.junit.Assert.assertNull(slimTableFactory1);
        org.junit.Assert.assertNull(slimTableFactory2);
        org.junit.Assert.assertNull(slimTableFactory3);
        org.junit.Assert.assertNull(slimTableFactory6);
        org.junit.Assert.assertNull(slimTableFactory7);
        org.junit.Assert.assertNull(slimTableFactory8);
    }

    @Test
    public void test01330() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01330");
        fitnesse.testsystems.slim.tables.SlimTableFactoryTest slimTableFactoryTest0 = new fitnesse.testsystems.slim.tables.SlimTableFactoryTest();
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory1 = slimTableFactoryTest0.slimTableFactory;
        fitnesse.testsystems.slim.Table table2 = slimTableFactoryTest0.gettable();
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory3 = null;
        slimTableFactoryTest0.slimTableFactory = slimTableFactory3;
        fitnesse.testsystems.slim.Table table5 = null;
        slimTableFactoryTest0.settable(table5);
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory7 = slimTableFactoryTest0.slimTableFactory;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory8 = slimTableFactoryTest0.getslimTableFactory();
        fitnesse.testsystems.slim.Table table9 = slimTableFactoryTest0.gettable();
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory10 = null;
        slimTableFactoryTest0.slimTableFactory = slimTableFactory10;
        fitnesse.testsystems.slim.Table table12 = slimTableFactoryTest0.table;
        // The following exception was thrown during execution in test generation
        try {
            slimTableFactoryTest0.commentTableShouldReturnNull();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(slimTableFactory1);
        org.junit.Assert.assertNull(table2);
        org.junit.Assert.assertNull(slimTableFactory7);
        org.junit.Assert.assertNull(slimTableFactory8);
        org.junit.Assert.assertNull(table9);
        org.junit.Assert.assertNull(table12);
    }

    @Test
    public void test01331() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01331");
        fitnesse.testsystems.slim.tables.SlimTableFactoryTest slimTableFactoryTest0 = new fitnesse.testsystems.slim.tables.SlimTableFactoryTest();
        fitnesse.testsystems.slim.Table table1 = null;
        slimTableFactoryTest0.table = table1;
        fitnesse.testsystems.slim.Table table3 = null;
        slimTableFactoryTest0.settable(table3);
        java.util.Map<java.lang.String, java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable>> strMap5 = slimTableFactoryTest0.map;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory6 = slimTableFactoryTest0.getslimTableFactory();
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory7 = slimTableFactoryTest0.getslimTableFactory();
        java.util.Map<java.lang.String, java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable>> strMap8 = slimTableFactoryTest0.getmap();
        java.util.Map<java.lang.String, java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable>> strMap9 = slimTableFactoryTest0.getmap();
        fitnesse.testsystems.slim.Table table10 = slimTableFactoryTest0.table;
        java.util.Map<java.lang.String, java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable>> strMap11 = slimTableFactoryTest0.getmap();
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory12 = slimTableFactoryTest0.getslimTableFactory();
        // The following exception was thrown during execution in test generation
        try {
            slimTableFactoryTest0.checkTableTypeDefineUsedForTable();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(strMap5);
        org.junit.Assert.assertNull(slimTableFactory6);
        org.junit.Assert.assertNull(slimTableFactory7);
        org.junit.Assert.assertNull(strMap8);
        org.junit.Assert.assertNull(strMap9);
        org.junit.Assert.assertNull(table10);
        org.junit.Assert.assertNull(strMap11);
        org.junit.Assert.assertNull(slimTableFactory12);
    }

    @Test
    public void test01332() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01332");
        fitnesse.testsystems.slim.tables.SlimTableFactoryTest slimTableFactoryTest0 = new fitnesse.testsystems.slim.tables.SlimTableFactoryTest();
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory1 = slimTableFactoryTest0.slimTableFactory;
        fitnesse.testsystems.slim.Table table2 = slimTableFactoryTest0.gettable();
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory3 = null;
        slimTableFactoryTest0.slimTableFactory = slimTableFactory3;
        fitnesse.testsystems.slim.Table table5 = null;
        slimTableFactoryTest0.settable(table5);
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory7 = slimTableFactoryTest0.slimTableFactory;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory8 = slimTableFactoryTest0.getslimTableFactory();
        fitnesse.testsystems.slim.Table table9 = slimTableFactoryTest0.gettable();
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory10 = null;
        slimTableFactoryTest0.slimTableFactory = slimTableFactory10;
        java.util.Map<java.lang.String, java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable>> strMap12 = slimTableFactoryTest0.getmap();
        fitnesse.testsystems.slim.Table table13 = slimTableFactoryTest0.gettable();
        // The following exception was thrown during execution in test generation
        try {
            slimTableFactoryTest0.shouldCreateCorrectSlimTableForTablesType();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(slimTableFactory1);
        org.junit.Assert.assertNull(table2);
        org.junit.Assert.assertNull(slimTableFactory7);
        org.junit.Assert.assertNull(slimTableFactory8);
        org.junit.Assert.assertNull(table9);
        org.junit.Assert.assertNull(strMap12);
        org.junit.Assert.assertNull(table13);
    }

    @Test
    public void test01333() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01333");
        fitnesse.testsystems.slim.tables.SlimTableFactoryTest slimTableFactoryTest0 = new fitnesse.testsystems.slim.tables.SlimTableFactoryTest();
        fitnesse.testsystems.slim.Table table1 = null;
        slimTableFactoryTest0.table = table1;
        fitnesse.testsystems.slim.Table table3 = slimTableFactoryTest0.table;
        fitnesse.testsystems.slim.Table table4 = slimTableFactoryTest0.gettable();
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory5 = slimTableFactoryTest0.getslimTableFactory();
        java.lang.Class<?> wildcardClass6 = slimTableFactoryTest0.getClass();
        org.junit.Assert.assertNull(table3);
        org.junit.Assert.assertNull(table4);
        org.junit.Assert.assertNull(slimTableFactory5);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test01334() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01334");
        fitnesse.testsystems.slim.tables.SlimTableFactoryTest slimTableFactoryTest0 = new fitnesse.testsystems.slim.tables.SlimTableFactoryTest();
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory1 = slimTableFactoryTest0.slimTableFactory;
        fitnesse.testsystems.slim.Table table2 = slimTableFactoryTest0.gettable();
        fitnesse.testsystems.slim.Table table3 = null;
        slimTableFactoryTest0.table = table3;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory5 = null;
        slimTableFactoryTest0.setslimTableFactory(slimTableFactory5);
        // The following exception was thrown during execution in test generation
        try {
            slimTableFactoryTest0.shouldCreateCorrectSlimTableForTablesType();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(slimTableFactory1);
        org.junit.Assert.assertNull(table2);
    }

    @Test
    public void test01335() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01335");
        fitnesse.testsystems.slim.tables.SlimTableFactoryTest slimTableFactoryTest0 = new fitnesse.testsystems.slim.tables.SlimTableFactoryTest();
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory1 = slimTableFactoryTest0.slimTableFactory;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory2 = slimTableFactoryTest0.slimTableFactory;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory3 = slimTableFactoryTest0.slimTableFactory;
        java.util.Map<java.lang.String, java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable>> strMap4 = slimTableFactoryTest0.map;
        fitnesse.testsystems.slim.Table table5 = null;
        slimTableFactoryTest0.settable(table5);
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory7 = slimTableFactoryTest0.getslimTableFactory();
        java.lang.Class<?> wildcardClass8 = slimTableFactoryTest0.getClass();
        org.junit.Assert.assertNull(slimTableFactory1);
        org.junit.Assert.assertNull(slimTableFactory2);
        org.junit.Assert.assertNull(slimTableFactory3);
        org.junit.Assert.assertNull(strMap4);
        org.junit.Assert.assertNull(slimTableFactory7);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test01336() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01336");
        fitnesse.testsystems.slim.tables.SlimTableFactoryTest slimTableFactoryTest0 = new fitnesse.testsystems.slim.tables.SlimTableFactoryTest();
        fitnesse.testsystems.slim.Table table1 = null;
        slimTableFactoryTest0.table = table1;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory3 = slimTableFactoryTest0.slimTableFactory;
        java.util.Map<java.lang.String, java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable>> strMap4 = slimTableFactoryTest0.getmap();
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory5 = null;
        slimTableFactoryTest0.setslimTableFactory(slimTableFactory5);
        fitnesse.testsystems.slim.Table table7 = slimTableFactoryTest0.gettable();
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory8 = null;
        slimTableFactoryTest0.setslimTableFactory(slimTableFactory8);
        // The following exception was thrown during execution in test generation
        try {
            slimTableFactoryTest0.checkTableTypeDefinesIgnoredIfDifferentSpecified();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(slimTableFactory3);
        org.junit.Assert.assertNull(strMap4);
        org.junit.Assert.assertNull(table7);
    }

    @Test
    public void test01337() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01337");
        fitnesse.testsystems.slim.tables.SlimTableFactoryTest slimTableFactoryTest0 = new fitnesse.testsystems.slim.tables.SlimTableFactoryTest();
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory1 = slimTableFactoryTest0.slimTableFactory;
        fitnesse.testsystems.slim.Table table2 = slimTableFactoryTest0.gettable();
        fitnesse.testsystems.slim.Table table3 = null;
        slimTableFactoryTest0.table = table3;
        fitnesse.testsystems.slim.Table table5 = null;
        slimTableFactoryTest0.table = table5;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory7 = slimTableFactoryTest0.slimTableFactory;
        java.lang.Class<?> wildcardClass8 = slimTableFactoryTest0.getClass();
        org.junit.Assert.assertNull(slimTableFactory1);
        org.junit.Assert.assertNull(table2);
        org.junit.Assert.assertNull(slimTableFactory7);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test01338() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01338");
        fitnesse.testsystems.slim.tables.SlimTableFactoryTest slimTableFactoryTest0 = new fitnesse.testsystems.slim.tables.SlimTableFactoryTest();
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory1 = slimTableFactoryTest0.slimTableFactory;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory2 = slimTableFactoryTest0.slimTableFactory;
        fitnesse.testsystems.slim.Table table3 = null;
        slimTableFactoryTest0.settable(table3);
        fitnesse.testsystems.slim.Table table5 = slimTableFactoryTest0.table;
        fitnesse.testsystems.slim.Table table6 = null;
        slimTableFactoryTest0.table = table6;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory8 = slimTableFactoryTest0.getslimTableFactory();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass9 = slimTableFactory8.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(slimTableFactory1);
        org.junit.Assert.assertNull(slimTableFactory2);
        org.junit.Assert.assertNull(table5);
        org.junit.Assert.assertNull(slimTableFactory8);
    }

    @Test
    public void test01339() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01339");
        fitnesse.testsystems.slim.tables.SlimTableFactoryTest slimTableFactoryTest0 = new fitnesse.testsystems.slim.tables.SlimTableFactoryTest();
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory1 = slimTableFactoryTest0.slimTableFactory;
        fitnesse.testsystems.slim.Table table2 = slimTableFactoryTest0.table;
        java.util.Map<java.lang.String, java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable>> strMap3 = slimTableFactoryTest0.map;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory4 = null;
        slimTableFactoryTest0.slimTableFactory = slimTableFactory4;
        fitnesse.testsystems.slim.Table table6 = null;
        slimTableFactoryTest0.table = table6;
        java.util.Map<java.lang.String, java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable>> strMap8 = slimTableFactoryTest0.getmap();
        fitnesse.testsystems.slim.Table table9 = slimTableFactoryTest0.table;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory10 = null;
        slimTableFactoryTest0.slimTableFactory = slimTableFactory10;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory12 = slimTableFactoryTest0.slimTableFactory;
        java.util.Map<java.lang.String, java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable>> strMap13 = slimTableFactoryTest0.map;
        // The following exception was thrown during execution in test generation
        try {
            slimTableFactoryTest0.addTableTypeImport("hi!", "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(slimTableFactory1);
        org.junit.Assert.assertNull(table2);
        org.junit.Assert.assertNull(strMap3);
        org.junit.Assert.assertNull(strMap8);
        org.junit.Assert.assertNull(table9);
        org.junit.Assert.assertNull(slimTableFactory12);
        org.junit.Assert.assertNull(strMap13);
    }

    @Test
    public void test01340() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01340");
        fitnesse.testsystems.slim.tables.SlimTableFactoryTest slimTableFactoryTest0 = new fitnesse.testsystems.slim.tables.SlimTableFactoryTest();
        fitnesse.testsystems.slim.Table table1 = null;
        slimTableFactoryTest0.table = table1;
        fitnesse.testsystems.slim.Table table3 = null;
        slimTableFactoryTest0.settable(table3);
        fitnesse.testsystems.slim.Table table5 = null;
        slimTableFactoryTest0.settable(table5);
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory7 = slimTableFactoryTest0.slimTableFactory;
        java.util.Map<java.lang.String, java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable>> strMap8 = slimTableFactoryTest0.map;
        fitnesse.testsystems.slim.Table table9 = slimTableFactoryTest0.table;
        java.util.Map<java.lang.String, java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable>> strMap10 = slimTableFactoryTest0.getmap();
        java.util.Map<java.lang.String, java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable>> strMap11 = slimTableFactoryTest0.map;
        fitnesse.testsystems.slim.Table table12 = slimTableFactoryTest0.table;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory13 = null;
        slimTableFactoryTest0.setslimTableFactory(slimTableFactory13);
        // The following exception was thrown during execution in test generation
        try {
            slimTableFactoryTest0.shouldCreateCorrectSlimTableForTablesType();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(slimTableFactory7);
        org.junit.Assert.assertNull(strMap8);
        org.junit.Assert.assertNull(table9);
        org.junit.Assert.assertNull(strMap10);
        org.junit.Assert.assertNull(strMap11);
        org.junit.Assert.assertNull(table12);
    }

    @Test
    public void test01341() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01341");
        fitnesse.testsystems.slim.tables.SlimTableFactoryTest slimTableFactoryTest0 = new fitnesse.testsystems.slim.tables.SlimTableFactoryTest();
        fitnesse.testsystems.slim.Table table1 = null;
        slimTableFactoryTest0.table = table1;
        fitnesse.testsystems.slim.Table table3 = null;
        slimTableFactoryTest0.settable(table3);
        java.util.Map<java.lang.String, java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable>> strMap5 = slimTableFactoryTest0.map;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory6 = slimTableFactoryTest0.getslimTableFactory();
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory7 = slimTableFactoryTest0.getslimTableFactory();
        fitnesse.testsystems.slim.Table table8 = slimTableFactoryTest0.gettable();
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory9 = null;
        slimTableFactoryTest0.slimTableFactory = slimTableFactory9;
        // The following exception was thrown during execution in test generation
        try {
            slimTableFactoryTest0.tableTypeStartingWithcommentColonShouldReturnNull();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(strMap5);
        org.junit.Assert.assertNull(slimTableFactory6);
        org.junit.Assert.assertNull(slimTableFactory7);
        org.junit.Assert.assertNull(table8);
    }

    @Test
    public void test01342() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01342");
        fitnesse.testsystems.slim.tables.SlimTableFactoryTest slimTableFactoryTest0 = new fitnesse.testsystems.slim.tables.SlimTableFactoryTest();
        fitnesse.testsystems.slim.Table table1 = null;
        slimTableFactoryTest0.table = table1;
        fitnesse.testsystems.slim.Table table3 = null;
        slimTableFactoryTest0.settable(table3);
        fitnesse.testsystems.slim.Table table5 = null;
        slimTableFactoryTest0.settable(table5);
        fitnesse.testsystems.slim.Table table7 = slimTableFactoryTest0.table;
        fitnesse.testsystems.slim.Table table8 = null;
        slimTableFactoryTest0.settable(table8);
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory10 = null;
        slimTableFactoryTest0.slimTableFactory = slimTableFactory10;
        fitnesse.testsystems.slim.Table table12 = null;
        slimTableFactoryTest0.settable(table12);
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory14 = null;
        slimTableFactoryTest0.setslimTableFactory(slimTableFactory14);
        // The following exception was thrown during execution in test generation
        try {
            slimTableFactoryTest0.addTableTypeImport("hi!", "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(table7);
    }

    @Test
    public void test01343() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01343");
        fitnesse.testsystems.slim.tables.SlimTableFactoryTest slimTableFactoryTest0 = new fitnesse.testsystems.slim.tables.SlimTableFactoryTest();
        fitnesse.testsystems.slim.Table table1 = null;
        slimTableFactoryTest0.table = table1;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory3 = slimTableFactoryTest0.slimTableFactory;
        java.util.Map<java.lang.String, java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable>> strMap4 = slimTableFactoryTest0.getmap();
        fitnesse.testsystems.slim.Table table5 = null;
        slimTableFactoryTest0.settable(table5);
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory7 = null;
        slimTableFactoryTest0.slimTableFactory = slimTableFactory7;
        java.util.Map<java.lang.String, java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable>> strMap9 = slimTableFactoryTest0.getmap();
        java.util.Map<java.lang.String, java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable>> strMap10 = slimTableFactoryTest0.getmap();
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory11 = null;
        slimTableFactoryTest0.slimTableFactory = slimTableFactory11;
        java.util.Map<java.lang.String, java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable>> strMap13 = slimTableFactoryTest0.map;
        fitnesse.testsystems.slim.Table table14 = slimTableFactoryTest0.table;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory15 = null;
        slimTableFactoryTest0.setslimTableFactory(slimTableFactory15);
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory17 = null;
        slimTableFactoryTest0.setslimTableFactory(slimTableFactory17);
        // The following exception was thrown during execution in test generation
        try {
            slimTableFactoryTest0.commentTableShouldReturnNull();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(slimTableFactory3);
        org.junit.Assert.assertNull(strMap4);
        org.junit.Assert.assertNull(strMap9);
        org.junit.Assert.assertNull(strMap10);
        org.junit.Assert.assertNull(strMap13);
        org.junit.Assert.assertNull(table14);
    }

    @Test
    public void test01344() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01344");
        fitnesse.testsystems.slim.tables.SlimTableFactoryTest slimTableFactoryTest0 = new fitnesse.testsystems.slim.tables.SlimTableFactoryTest();
        fitnesse.testsystems.slim.Table table1 = null;
        slimTableFactoryTest0.table = table1;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory3 = null;
        slimTableFactoryTest0.setslimTableFactory(slimTableFactory3);
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory5 = slimTableFactoryTest0.slimTableFactory;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory6 = slimTableFactoryTest0.getslimTableFactory();
        fitnesse.testsystems.slim.Table table7 = null;
        slimTableFactoryTest0.table = table7;
        // The following exception was thrown during execution in test generation
        try {
            slimTableFactoryTest0.shouldCreateCorrectSlimTableForTablesType();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(slimTableFactory5);
        org.junit.Assert.assertNull(slimTableFactory6);
    }

    @Test
    public void test01345() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01345");
        fitnesse.testsystems.slim.tables.SlimTableFactoryTest slimTableFactoryTest0 = new fitnesse.testsystems.slim.tables.SlimTableFactoryTest();
        fitnesse.testsystems.slim.Table table1 = null;
        slimTableFactoryTest0.table = table1;
        fitnesse.testsystems.slim.Table table3 = slimTableFactoryTest0.table;
        fitnesse.testsystems.slim.Table table4 = slimTableFactoryTest0.gettable();
        java.util.Map<java.lang.String, java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable>> strMap5 = slimTableFactoryTest0.getmap();
        java.util.Map<java.lang.String, java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable>> strMap6 = slimTableFactoryTest0.map;
        fitnesse.testsystems.slim.Table table7 = slimTableFactoryTest0.table;
        fitnesse.testsystems.slim.Table table8 = slimTableFactoryTest0.gettable();
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory9 = slimTableFactoryTest0.slimTableFactory;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory10 = slimTableFactoryTest0.slimTableFactory;
        fitnesse.testsystems.slim.Table table11 = slimTableFactoryTest0.table;
        java.lang.Class<?> wildcardClass12 = slimTableFactoryTest0.getClass();
        org.junit.Assert.assertNull(table3);
        org.junit.Assert.assertNull(table4);
        org.junit.Assert.assertNull(strMap5);
        org.junit.Assert.assertNull(strMap6);
        org.junit.Assert.assertNull(table7);
        org.junit.Assert.assertNull(table8);
        org.junit.Assert.assertNull(slimTableFactory9);
        org.junit.Assert.assertNull(slimTableFactory10);
        org.junit.Assert.assertNull(table11);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test01346() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01346");
        fitnesse.testsystems.slim.tables.SlimTableFactoryTest slimTableFactoryTest0 = new fitnesse.testsystems.slim.tables.SlimTableFactoryTest();
        fitnesse.testsystems.slim.Table table1 = null;
        slimTableFactoryTest0.table = table1;
        fitnesse.testsystems.slim.Table table3 = slimTableFactoryTest0.table;
        fitnesse.testsystems.slim.Table table4 = slimTableFactoryTest0.gettable();
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory5 = slimTableFactoryTest0.slimTableFactory;
        fitnesse.testsystems.slim.Table table6 = null;
        slimTableFactoryTest0.settable(table6);
        fitnesse.testsystems.slim.Table table8 = slimTableFactoryTest0.table;
        fitnesse.testsystems.slim.Table table9 = slimTableFactoryTest0.table;
        java.util.Map<java.lang.String, java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable>> strMap10 = slimTableFactoryTest0.map;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory11 = null;
        slimTableFactoryTest0.setslimTableFactory(slimTableFactory11);
        // The following exception was thrown during execution in test generation
        try {
            slimTableFactoryTest0.commentTableShouldReturnNull();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(table3);
        org.junit.Assert.assertNull(table4);
        org.junit.Assert.assertNull(slimTableFactory5);
        org.junit.Assert.assertNull(table8);
        org.junit.Assert.assertNull(table9);
        org.junit.Assert.assertNull(strMap10);
    }

    @Test
    public void test01347() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01347");
        fitnesse.testsystems.slim.tables.SlimTableFactoryTest slimTableFactoryTest0 = new fitnesse.testsystems.slim.tables.SlimTableFactoryTest();
        fitnesse.testsystems.slim.Table table1 = null;
        slimTableFactoryTest0.table = table1;
        fitnesse.testsystems.slim.Table table3 = null;
        slimTableFactoryTest0.settable(table3);
        fitnesse.testsystems.slim.Table table5 = null;
        slimTableFactoryTest0.settable(table5);
        fitnesse.testsystems.slim.Table table7 = slimTableFactoryTest0.table;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory8 = null;
        slimTableFactoryTest0.setslimTableFactory(slimTableFactory8);
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory10 = slimTableFactoryTest0.slimTableFactory;
        // The following exception was thrown during execution in test generation
        try {
            slimTableFactoryTest0.commentTableShouldReturnNull();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(table7);
        org.junit.Assert.assertNull(slimTableFactory10);
    }

    @Test
    public void test01348() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01348");
        fitnesse.testsystems.slim.tables.SlimTableFactoryTest slimTableFactoryTest0 = new fitnesse.testsystems.slim.tables.SlimTableFactoryTest();
        fitnesse.testsystems.slim.Table table1 = slimTableFactoryTest0.table;
        java.util.Map<java.lang.String, java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable>> strMap2 = slimTableFactoryTest0.map;
        fitnesse.testsystems.slim.Table table3 = null;
        slimTableFactoryTest0.table = table3;
        java.util.Map<java.lang.String, java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable>> strMap5 = slimTableFactoryTest0.getmap();
        java.util.Map<java.lang.String, java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable>> strMap6 = slimTableFactoryTest0.getmap();
        fitnesse.testsystems.slim.Table table7 = slimTableFactoryTest0.table;
        fitnesse.testsystems.slim.Table table8 = null;
        slimTableFactoryTest0.settable(table8);
        // The following exception was thrown during execution in test generation
        try {
            slimTableFactoryTest0.commentTableShouldReturnNull();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(table1);
        org.junit.Assert.assertNull(strMap2);
        org.junit.Assert.assertNull(strMap5);
        org.junit.Assert.assertNull(strMap6);
        org.junit.Assert.assertNull(table7);
    }

    @Test
    public void test01349() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01349");
        fitnesse.testsystems.slim.tables.SlimTableFactoryTest slimTableFactoryTest0 = new fitnesse.testsystems.slim.tables.SlimTableFactoryTest();
        fitnesse.testsystems.slim.Table table1 = null;
        slimTableFactoryTest0.table = table1;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory3 = slimTableFactoryTest0.slimTableFactory;
        java.util.Map<java.lang.String, java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable>> strMap4 = slimTableFactoryTest0.getmap();
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory5 = slimTableFactoryTest0.slimTableFactory;
        java.util.Map<java.lang.String, java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable>> strMap6 = slimTableFactoryTest0.getmap();
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory7 = null;
        slimTableFactoryTest0.slimTableFactory = slimTableFactory7;
        fitnesse.testsystems.slim.Table table9 = slimTableFactoryTest0.table;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass10 = table9.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(slimTableFactory3);
        org.junit.Assert.assertNull(strMap4);
        org.junit.Assert.assertNull(slimTableFactory5);
        org.junit.Assert.assertNull(strMap6);
        org.junit.Assert.assertNull(table9);
    }

    @Test
    public void test01350() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01350");
        fitnesse.testsystems.slim.tables.SlimTableFactoryTest slimTableFactoryTest0 = new fitnesse.testsystems.slim.tables.SlimTableFactoryTest();
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory1 = slimTableFactoryTest0.slimTableFactory;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory2 = slimTableFactoryTest0.slimTableFactory;
        fitnesse.testsystems.slim.Table table3 = slimTableFactoryTest0.gettable();
        fitnesse.testsystems.slim.Table table4 = slimTableFactoryTest0.gettable();
        fitnesse.testsystems.slim.Table table5 = slimTableFactoryTest0.gettable();
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory6 = slimTableFactoryTest0.slimTableFactory;
        fitnesse.testsystems.slim.Table table7 = null;
        slimTableFactoryTest0.table = table7;
        // The following exception was thrown during execution in test generation
        try {
            slimTableFactoryTest0.checkTableTypeDefineUsedForTable();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(slimTableFactory1);
        org.junit.Assert.assertNull(slimTableFactory2);
        org.junit.Assert.assertNull(table3);
        org.junit.Assert.assertNull(table4);
        org.junit.Assert.assertNull(table5);
        org.junit.Assert.assertNull(slimTableFactory6);
    }

    @Test
    public void test01351() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01351");
        fitnesse.testsystems.slim.tables.SlimTableFactoryTest slimTableFactoryTest0 = new fitnesse.testsystems.slim.tables.SlimTableFactoryTest();
        fitnesse.testsystems.slim.Table table1 = null;
        slimTableFactoryTest0.table = table1;
        fitnesse.testsystems.slim.Table table3 = null;
        slimTableFactoryTest0.settable(table3);
        java.util.Map<java.lang.String, java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable>> strMap5 = slimTableFactoryTest0.map;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory6 = slimTableFactoryTest0.getslimTableFactory();
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory7 = slimTableFactoryTest0.getslimTableFactory();
        fitnesse.testsystems.slim.Table table8 = slimTableFactoryTest0.gettable();
        fitnesse.testsystems.slim.Table table9 = null;
        slimTableFactoryTest0.settable(table9);
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory11 = null;
        slimTableFactoryTest0.slimTableFactory = slimTableFactory11;
        fitnesse.testsystems.slim.Table table13 = slimTableFactoryTest0.gettable();
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory14 = slimTableFactoryTest0.slimTableFactory;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory15 = null;
        slimTableFactoryTest0.slimTableFactory = slimTableFactory15;
        fitnesse.testsystems.slim.Table table17 = null;
        slimTableFactoryTest0.table = table17;
        java.lang.Class<?> wildcardClass19 = slimTableFactoryTest0.getClass();
        org.junit.Assert.assertNull(strMap5);
        org.junit.Assert.assertNull(slimTableFactory6);
        org.junit.Assert.assertNull(slimTableFactory7);
        org.junit.Assert.assertNull(table8);
        org.junit.Assert.assertNull(table13);
        org.junit.Assert.assertNull(slimTableFactory14);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test01352() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01352");
        fitnesse.testsystems.slim.tables.SlimTableFactoryTest slimTableFactoryTest0 = new fitnesse.testsystems.slim.tables.SlimTableFactoryTest();
        fitnesse.testsystems.slim.Table table1 = null;
        slimTableFactoryTest0.table = table1;
        fitnesse.testsystems.slim.Table table3 = null;
        slimTableFactoryTest0.settable(table3);
        fitnesse.testsystems.slim.Table table5 = null;
        slimTableFactoryTest0.settable(table5);
        fitnesse.testsystems.slim.Table table7 = slimTableFactoryTest0.table;
        fitnesse.testsystems.slim.Table table8 = null;
        slimTableFactoryTest0.settable(table8);
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory10 = null;
        slimTableFactoryTest0.slimTableFactory = slimTableFactory10;
        java.util.Map<java.lang.String, java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable>> strMap12 = slimTableFactoryTest0.map;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory13 = null;
        slimTableFactoryTest0.slimTableFactory = slimTableFactory13;
        java.util.Map<java.lang.String, java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable>> strMap15 = slimTableFactoryTest0.map;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory16 = slimTableFactoryTest0.getslimTableFactory();
        // The following exception was thrown during execution in test generation
        try {
            slimTableFactoryTest0.tableTypeStartingWithcommentColonShouldReturnNull();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(table7);
        org.junit.Assert.assertNull(strMap12);
        org.junit.Assert.assertNull(strMap15);
        org.junit.Assert.assertNull(slimTableFactory16);
    }

    @Test
    public void test01353() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01353");
        fitnesse.testsystems.slim.tables.SlimTableFactoryTest slimTableFactoryTest0 = new fitnesse.testsystems.slim.tables.SlimTableFactoryTest();
        fitnesse.testsystems.slim.Table table1 = null;
        slimTableFactoryTest0.table = table1;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory3 = null;
        slimTableFactoryTest0.setslimTableFactory(slimTableFactory3);
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory5 = slimTableFactoryTest0.slimTableFactory;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory6 = slimTableFactoryTest0.getslimTableFactory();
        fitnesse.testsystems.slim.Table table7 = null;
        slimTableFactoryTest0.table = table7;
        fitnesse.testsystems.slim.Table table9 = null;
        slimTableFactoryTest0.settable(table9);
        // The following exception was thrown during execution in test generation
        try {
            slimTableFactoryTest0.commentTableShouldReturnNull();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(slimTableFactory5);
        org.junit.Assert.assertNull(slimTableFactory6);
    }

    @Test
    public void test01354() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01354");
        fitnesse.testsystems.slim.tables.SlimTableFactoryTest slimTableFactoryTest0 = new fitnesse.testsystems.slim.tables.SlimTableFactoryTest();
        fitnesse.testsystems.slim.Table table1 = null;
        slimTableFactoryTest0.table = table1;
        fitnesse.testsystems.slim.Table table3 = null;
        slimTableFactoryTest0.settable(table3);
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory5 = null;
        slimTableFactoryTest0.setslimTableFactory(slimTableFactory5);
        java.util.Map<java.lang.String, java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable>> strMap7 = slimTableFactoryTest0.map;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory8 = null;
        slimTableFactoryTest0.slimTableFactory = slimTableFactory8;
        fitnesse.testsystems.slim.Table table10 = null;
        slimTableFactoryTest0.table = table10;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory12 = slimTableFactoryTest0.getslimTableFactory();
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory13 = null;
        slimTableFactoryTest0.setslimTableFactory(slimTableFactory13);
        java.util.Map<java.lang.String, java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable>> strMap15 = slimTableFactoryTest0.map;
        java.util.Map<java.lang.String, java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable>> strMap16 = slimTableFactoryTest0.getmap();
        // The following exception was thrown during execution in test generation
        try {
            slimTableFactoryTest0.checkTableTypeDefineUsedForTable();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(strMap7);
        org.junit.Assert.assertNull(slimTableFactory12);
        org.junit.Assert.assertNull(strMap15);
        org.junit.Assert.assertNull(strMap16);
    }

    @Test
    public void test01355() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01355");
        fitnesse.testsystems.slim.tables.SlimTableFactoryTest slimTableFactoryTest0 = new fitnesse.testsystems.slim.tables.SlimTableFactoryTest();
        fitnesse.testsystems.slim.Table table1 = null;
        slimTableFactoryTest0.table = table1;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory3 = slimTableFactoryTest0.slimTableFactory;
        java.util.Map<java.lang.String, java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable>> strMap4 = slimTableFactoryTest0.getmap();
        fitnesse.testsystems.slim.Table table5 = null;
        slimTableFactoryTest0.settable(table5);
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory7 = null;
        slimTableFactoryTest0.setslimTableFactory(slimTableFactory7);
        fitnesse.testsystems.slim.Table table9 = slimTableFactoryTest0.table;
        fitnesse.testsystems.slim.Table table10 = slimTableFactoryTest0.gettable();
        fitnesse.testsystems.slim.Table table11 = slimTableFactoryTest0.table;
        // The following exception was thrown during execution in test generation
        try {
            slimTableFactoryTest0.checkTableTypeDefinesIgnoredIfDifferentSpecified();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(slimTableFactory3);
        org.junit.Assert.assertNull(strMap4);
        org.junit.Assert.assertNull(table9);
        org.junit.Assert.assertNull(table10);
        org.junit.Assert.assertNull(table11);
    }

    @Test
    public void test01356() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01356");
        fitnesse.testsystems.slim.tables.SlimTableFactoryTest slimTableFactoryTest0 = new fitnesse.testsystems.slim.tables.SlimTableFactoryTest();
        fitnesse.testsystems.slim.Table table1 = null;
        slimTableFactoryTest0.table = table1;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory3 = null;
        slimTableFactoryTest0.setslimTableFactory(slimTableFactory3);
        java.util.Map<java.lang.String, java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable>> strMap5 = slimTableFactoryTest0.map;
        fitnesse.testsystems.slim.Table table6 = null;
        slimTableFactoryTest0.table = table6;
        java.util.Map<java.lang.String, java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable>> strMap8 = slimTableFactoryTest0.map;
        // The following exception was thrown during execution in test generation
        try {
            slimTableFactoryTest0.shouldCreateCorrectSlimTableForTablesType();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(strMap5);
        org.junit.Assert.assertNull(strMap8);
    }

    @Test
    public void test01357() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01357");
        fitnesse.testsystems.slim.tables.SlimTableFactoryTest slimTableFactoryTest0 = new fitnesse.testsystems.slim.tables.SlimTableFactoryTest();
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory1 = slimTableFactoryTest0.slimTableFactory;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory2 = slimTableFactoryTest0.slimTableFactory;
        fitnesse.testsystems.slim.Table table3 = slimTableFactoryTest0.table;
        fitnesse.testsystems.slim.Table table4 = slimTableFactoryTest0.gettable();
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory5 = null;
        slimTableFactoryTest0.slimTableFactory = slimTableFactory5;
        // The following exception was thrown during execution in test generation
        try {
            slimTableFactoryTest0.tableTypeStartingWithcommentColonShouldReturnNull();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(slimTableFactory1);
        org.junit.Assert.assertNull(slimTableFactory2);
        org.junit.Assert.assertNull(table3);
        org.junit.Assert.assertNull(table4);
    }

    @Test
    public void test01358() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01358");
        fitnesse.testsystems.slim.tables.SlimTableFactoryTest slimTableFactoryTest0 = new fitnesse.testsystems.slim.tables.SlimTableFactoryTest();
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory1 = slimTableFactoryTest0.slimTableFactory;
        fitnesse.testsystems.slim.Table table2 = slimTableFactoryTest0.gettable();
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory3 = null;
        slimTableFactoryTest0.slimTableFactory = slimTableFactory3;
        fitnesse.testsystems.slim.Table table5 = null;
        slimTableFactoryTest0.settable(table5);
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory7 = slimTableFactoryTest0.slimTableFactory;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory8 = slimTableFactoryTest0.getslimTableFactory();
        fitnesse.testsystems.slim.Table table9 = slimTableFactoryTest0.gettable();
        fitnesse.testsystems.slim.Table table10 = slimTableFactoryTest0.gettable();
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory11 = null;
        slimTableFactoryTest0.slimTableFactory = slimTableFactory11;
        java.util.Map<java.lang.String, java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable>> strMap13 = slimTableFactoryTest0.map;
        // The following exception was thrown during execution in test generation
        try {
            slimTableFactoryTest0.addTableTypeImport("", "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(slimTableFactory1);
        org.junit.Assert.assertNull(table2);
        org.junit.Assert.assertNull(slimTableFactory7);
        org.junit.Assert.assertNull(slimTableFactory8);
        org.junit.Assert.assertNull(table9);
        org.junit.Assert.assertNull(table10);
        org.junit.Assert.assertNull(strMap13);
    }

    @Test
    public void test01359() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01359");
        fitnesse.testsystems.slim.tables.SlimTableFactoryTest slimTableFactoryTest0 = new fitnesse.testsystems.slim.tables.SlimTableFactoryTest();
        fitnesse.testsystems.slim.Table table1 = null;
        slimTableFactoryTest0.table = table1;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory3 = null;
        slimTableFactoryTest0.setslimTableFactory(slimTableFactory3);
        java.util.Map<java.lang.String, java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable>> strMap5 = slimTableFactoryTest0.map;
        fitnesse.testsystems.slim.Table table6 = null;
        slimTableFactoryTest0.table = table6;
        java.util.Map<java.lang.String, java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable>> strMap8 = slimTableFactoryTest0.map;
        // The following exception was thrown during execution in test generation
        try {
            slimTableFactoryTest0.checkTableTypeDefinesIgnoredIfDifferentSpecified();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(strMap5);
        org.junit.Assert.assertNull(strMap8);
    }

    @Test
    public void test01360() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01360");
        fitnesse.testsystems.slim.tables.SlimTableFactoryTest slimTableFactoryTest0 = new fitnesse.testsystems.slim.tables.SlimTableFactoryTest();
        fitnesse.testsystems.slim.Table table1 = slimTableFactoryTest0.table;
        java.util.Map<java.lang.String, java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable>> strMap2 = slimTableFactoryTest0.getmap();
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory3 = slimTableFactoryTest0.slimTableFactory;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory4 = slimTableFactoryTest0.getslimTableFactory();
        java.util.Map<java.lang.String, java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable>> strMap5 = slimTableFactoryTest0.getmap();
        fitnesse.testsystems.slim.Table table6 = null;
        slimTableFactoryTest0.table = table6;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory8 = slimTableFactoryTest0.getslimTableFactory();
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory9 = slimTableFactoryTest0.slimTableFactory;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory10 = slimTableFactoryTest0.getslimTableFactory();
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory11 = null;
        slimTableFactoryTest0.setslimTableFactory(slimTableFactory11);
        // The following exception was thrown during execution in test generation
        try {
            slimTableFactoryTest0.shouldCreateCorrectSlimTableForTablesType();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(table1);
        org.junit.Assert.assertNull(strMap2);
        org.junit.Assert.assertNull(slimTableFactory3);
        org.junit.Assert.assertNull(slimTableFactory4);
        org.junit.Assert.assertNull(strMap5);
        org.junit.Assert.assertNull(slimTableFactory8);
        org.junit.Assert.assertNull(slimTableFactory9);
        org.junit.Assert.assertNull(slimTableFactory10);
    }

    @Test
    public void test01361() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01361");
        fitnesse.testsystems.slim.tables.SlimTableFactoryTest slimTableFactoryTest0 = new fitnesse.testsystems.slim.tables.SlimTableFactoryTest();
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory1 = slimTableFactoryTest0.slimTableFactory;
        fitnesse.testsystems.slim.Table table2 = slimTableFactoryTest0.gettable();
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory3 = null;
        slimTableFactoryTest0.slimTableFactory = slimTableFactory3;
        fitnesse.testsystems.slim.Table table5 = null;
        slimTableFactoryTest0.settable(table5);
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory7 = slimTableFactoryTest0.slimTableFactory;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory8 = slimTableFactoryTest0.getslimTableFactory();
        fitnesse.testsystems.slim.Table table9 = slimTableFactoryTest0.gettable();
        fitnesse.testsystems.slim.Table table10 = null;
        slimTableFactoryTest0.settable(table10);
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory12 = null;
        slimTableFactoryTest0.setslimTableFactory(slimTableFactory12);
        fitnesse.testsystems.slim.Table table14 = slimTableFactoryTest0.table;
        java.util.Map<java.lang.String, java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable>> strMap15 = slimTableFactoryTest0.map;
        java.util.Map<java.lang.String, java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable>> strMap16 = slimTableFactoryTest0.getmap();
        // The following exception was thrown during execution in test generation
        try {
            slimTableFactoryTest0.commentTableShouldReturnNull();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(slimTableFactory1);
        org.junit.Assert.assertNull(table2);
        org.junit.Assert.assertNull(slimTableFactory7);
        org.junit.Assert.assertNull(slimTableFactory8);
        org.junit.Assert.assertNull(table9);
        org.junit.Assert.assertNull(table14);
        org.junit.Assert.assertNull(strMap15);
        org.junit.Assert.assertNull(strMap16);
    }

    @Test
    public void test01362() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01362");
        fitnesse.testsystems.slim.tables.SlimTableFactoryTest slimTableFactoryTest0 = new fitnesse.testsystems.slim.tables.SlimTableFactoryTest();
        fitnesse.testsystems.slim.Table table1 = slimTableFactoryTest0.table;
        java.util.Map<java.lang.String, java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable>> strMap2 = slimTableFactoryTest0.getmap();
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory3 = null;
        slimTableFactoryTest0.slimTableFactory = slimTableFactory3;
        fitnesse.testsystems.slim.Table table5 = slimTableFactoryTest0.table;
        java.util.Map<java.lang.String, java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable>> strMap6 = slimTableFactoryTest0.map;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory7 = slimTableFactoryTest0.getslimTableFactory();
        fitnesse.testsystems.slim.Table table8 = slimTableFactoryTest0.gettable();
        java.util.Map<java.lang.String, java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable>> strMap9 = slimTableFactoryTest0.map;
        fitnesse.testsystems.slim.Table table10 = slimTableFactoryTest0.gettable();
        // The following exception was thrown during execution in test generation
        try {
            slimTableFactoryTest0.checkTableTypeDefinesIgnoredIfDifferentSpecified();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(table1);
        org.junit.Assert.assertNull(strMap2);
        org.junit.Assert.assertNull(table5);
        org.junit.Assert.assertNull(strMap6);
        org.junit.Assert.assertNull(slimTableFactory7);
        org.junit.Assert.assertNull(table8);
        org.junit.Assert.assertNull(strMap9);
        org.junit.Assert.assertNull(table10);
    }

    @Test
    public void test01363() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01363");
        fitnesse.testsystems.slim.tables.SlimTableFactoryTest slimTableFactoryTest0 = new fitnesse.testsystems.slim.tables.SlimTableFactoryTest();
        fitnesse.testsystems.slim.Table table1 = slimTableFactoryTest0.table;
        java.util.Map<java.lang.String, java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable>> strMap2 = slimTableFactoryTest0.getmap();
        java.util.Map<java.lang.String, java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable>> strMap3 = slimTableFactoryTest0.getmap();
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory4 = slimTableFactoryTest0.slimTableFactory;
        fitnesse.testsystems.slim.Table table5 = null;
        slimTableFactoryTest0.settable(table5);
        fitnesse.testsystems.slim.Table table7 = slimTableFactoryTest0.table;
        java.util.Map<java.lang.String, java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable>> strMap8 = slimTableFactoryTest0.map;
        java.util.Map<java.lang.String, java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable>> strMap9 = slimTableFactoryTest0.map;
        // The following exception was thrown during execution in test generation
        try {
            slimTableFactoryTest0.shouldCreateCorrectSlimTableForTablesType();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(table1);
        org.junit.Assert.assertNull(strMap2);
        org.junit.Assert.assertNull(strMap3);
        org.junit.Assert.assertNull(slimTableFactory4);
        org.junit.Assert.assertNull(table7);
        org.junit.Assert.assertNull(strMap8);
        org.junit.Assert.assertNull(strMap9);
    }

    @Test
    public void test01364() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01364");
        fitnesse.testsystems.slim.tables.SlimTableFactoryTest slimTableFactoryTest0 = new fitnesse.testsystems.slim.tables.SlimTableFactoryTest();
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory1 = null;
        slimTableFactoryTest0.slimTableFactory = slimTableFactory1;
        fitnesse.testsystems.slim.Table table3 = null;
        slimTableFactoryTest0.settable(table3);
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory5 = slimTableFactoryTest0.getslimTableFactory();
        fitnesse.testsystems.slim.Table table6 = null;
        slimTableFactoryTest0.settable(table6);
        // The following exception was thrown during execution in test generation
        try {
            slimTableFactoryTest0.shouldCreateCorrectSlimTableForTablesType();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(slimTableFactory5);
    }

    @Test
    public void test01365() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01365");
        fitnesse.testsystems.slim.tables.SlimTableFactoryTest slimTableFactoryTest0 = new fitnesse.testsystems.slim.tables.SlimTableFactoryTest();
        fitnesse.testsystems.slim.Table table1 = null;
        slimTableFactoryTest0.table = table1;
        fitnesse.testsystems.slim.Table table3 = null;
        slimTableFactoryTest0.settable(table3);
        fitnesse.testsystems.slim.Table table5 = null;
        slimTableFactoryTest0.table = table5;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory7 = slimTableFactoryTest0.slimTableFactory;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory8 = slimTableFactoryTest0.slimTableFactory;
        fitnesse.testsystems.slim.Table table9 = slimTableFactoryTest0.gettable();
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory10 = null;
        slimTableFactoryTest0.slimTableFactory = slimTableFactory10;
        fitnesse.testsystems.slim.Table table12 = slimTableFactoryTest0.gettable();
        java.util.Map<java.lang.String, java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable>> strMap13 = slimTableFactoryTest0.map;
        // The following exception was thrown during execution in test generation
        try {
            slimTableFactoryTest0.commentTableShouldReturnNull();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(slimTableFactory7);
        org.junit.Assert.assertNull(slimTableFactory8);
        org.junit.Assert.assertNull(table9);
        org.junit.Assert.assertNull(table12);
        org.junit.Assert.assertNull(strMap13);
    }

    @Test
    public void test01366() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01366");
        fitnesse.testsystems.slim.tables.SlimTableFactoryTest slimTableFactoryTest0 = new fitnesse.testsystems.slim.tables.SlimTableFactoryTest();
        fitnesse.testsystems.slim.Table table1 = null;
        slimTableFactoryTest0.table = table1;
        fitnesse.testsystems.slim.Table table3 = slimTableFactoryTest0.table;
        fitnesse.testsystems.slim.Table table4 = slimTableFactoryTest0.gettable();
        java.util.Map<java.lang.String, java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable>> strMap5 = slimTableFactoryTest0.getmap();
        java.util.Map<java.lang.String, java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable>> strMap6 = slimTableFactoryTest0.map;
        fitnesse.testsystems.slim.Table table7 = slimTableFactoryTest0.table;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory8 = null;
        slimTableFactoryTest0.slimTableFactory = slimTableFactory8;
        fitnesse.testsystems.slim.Table table10 = slimTableFactoryTest0.table;
        fitnesse.testsystems.slim.Table table11 = null;
        slimTableFactoryTest0.table = table11;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory13 = slimTableFactoryTest0.getslimTableFactory();
        // The following exception was thrown during execution in test generation
        try {
            slimTableFactoryTest0.checkTableTypeDefinesIgnoredIfDifferentSpecified();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(table3);
        org.junit.Assert.assertNull(table4);
        org.junit.Assert.assertNull(strMap5);
        org.junit.Assert.assertNull(strMap6);
        org.junit.Assert.assertNull(table7);
        org.junit.Assert.assertNull(table10);
        org.junit.Assert.assertNull(slimTableFactory13);
    }

    @Test
    public void test01367() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01367");
        fitnesse.testsystems.slim.tables.SlimTableFactoryTest slimTableFactoryTest0 = new fitnesse.testsystems.slim.tables.SlimTableFactoryTest();
        fitnesse.testsystems.slim.Table table1 = null;
        slimTableFactoryTest0.table = table1;
        fitnesse.testsystems.slim.Table table3 = slimTableFactoryTest0.table;
        fitnesse.testsystems.slim.Table table4 = slimTableFactoryTest0.gettable();
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory5 = slimTableFactoryTest0.slimTableFactory;
        java.util.Map<java.lang.String, java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable>> strMap6 = slimTableFactoryTest0.map;
        java.util.Map<java.lang.String, java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable>> strMap7 = slimTableFactoryTest0.getmap();
        java.util.Map<java.lang.String, java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable>> strMap8 = slimTableFactoryTest0.map;
        // The following exception was thrown during execution in test generation
        try {
            slimTableFactoryTest0.tableTypeStartingWithcommentColonShouldReturnNull();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(table3);
        org.junit.Assert.assertNull(table4);
        org.junit.Assert.assertNull(slimTableFactory5);
        org.junit.Assert.assertNull(strMap6);
        org.junit.Assert.assertNull(strMap7);
        org.junit.Assert.assertNull(strMap8);
    }

    @Test
    public void test01368() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01368");
        fitnesse.testsystems.slim.tables.SlimTableFactoryTest slimTableFactoryTest0 = new fitnesse.testsystems.slim.tables.SlimTableFactoryTest();
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory1 = slimTableFactoryTest0.slimTableFactory;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory2 = slimTableFactoryTest0.slimTableFactory;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory3 = slimTableFactoryTest0.slimTableFactory;
        fitnesse.testsystems.slim.Table table4 = null;
        slimTableFactoryTest0.table = table4;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory6 = null;
        slimTableFactoryTest0.setslimTableFactory(slimTableFactory6);
        // The following exception was thrown during execution in test generation
        try {
            slimTableFactoryTest0.commentTableShouldReturnNull();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(slimTableFactory1);
        org.junit.Assert.assertNull(slimTableFactory2);
        org.junit.Assert.assertNull(slimTableFactory3);
    }

    @Test
    public void test01369() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01369");
        fitnesse.testsystems.slim.tables.SlimTableFactoryTest slimTableFactoryTest0 = new fitnesse.testsystems.slim.tables.SlimTableFactoryTest();
        fitnesse.testsystems.slim.Table table1 = null;
        slimTableFactoryTest0.table = table1;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory3 = null;
        slimTableFactoryTest0.slimTableFactory = slimTableFactory3;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory5 = slimTableFactoryTest0.getslimTableFactory();
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory6 = null;
        slimTableFactoryTest0.setslimTableFactory(slimTableFactory6);
        fitnesse.testsystems.slim.Table table8 = slimTableFactoryTest0.table;
        fitnesse.testsystems.slim.Table table9 = slimTableFactoryTest0.gettable();
        // The following exception was thrown during execution in test generation
        try {
            slimTableFactoryTest0.shouldCreateCorrectSlimTableForTablesType();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(slimTableFactory5);
        org.junit.Assert.assertNull(table8);
        org.junit.Assert.assertNull(table9);
    }

    @Test
    public void test01370() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01370");
        fitnesse.testsystems.slim.tables.SlimTableFactoryTest slimTableFactoryTest0 = new fitnesse.testsystems.slim.tables.SlimTableFactoryTest();
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory1 = slimTableFactoryTest0.slimTableFactory;
        fitnesse.testsystems.slim.Table table2 = slimTableFactoryTest0.table;
        java.util.Map<java.lang.String, java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable>> strMap3 = slimTableFactoryTest0.map;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory4 = null;
        slimTableFactoryTest0.slimTableFactory = slimTableFactory4;
        fitnesse.testsystems.slim.Table table6 = null;
        slimTableFactoryTest0.table = table6;
        fitnesse.testsystems.slim.Table table8 = slimTableFactoryTest0.gettable();
        fitnesse.testsystems.slim.Table table9 = slimTableFactoryTest0.table;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory10 = null;
        slimTableFactoryTest0.slimTableFactory = slimTableFactory10;
        java.util.Map<java.lang.String, java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable>> strMap12 = slimTableFactoryTest0.getmap();
        // The following exception was thrown during execution in test generation
        try {
            slimTableFactoryTest0.commentTableShouldReturnNull();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(slimTableFactory1);
        org.junit.Assert.assertNull(table2);
        org.junit.Assert.assertNull(strMap3);
        org.junit.Assert.assertNull(table8);
        org.junit.Assert.assertNull(table9);
        org.junit.Assert.assertNull(strMap12);
    }

    @Test
    public void test01371() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01371");
        fitnesse.testsystems.slim.tables.SlimTableFactoryTest slimTableFactoryTest0 = new fitnesse.testsystems.slim.tables.SlimTableFactoryTest();
        fitnesse.testsystems.slim.Table table1 = slimTableFactoryTest0.table;
        fitnesse.testsystems.slim.Table table2 = null;
        slimTableFactoryTest0.table = table2;
        // The following exception was thrown during execution in test generation
        try {
            slimTableFactoryTest0.commentTableShouldReturnNull();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(table1);
    }

    @Test
    public void test01372() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01372");
        fitnesse.testsystems.slim.tables.SlimTableFactoryTest slimTableFactoryTest0 = new fitnesse.testsystems.slim.tables.SlimTableFactoryTest();
        fitnesse.testsystems.slim.Table table1 = null;
        slimTableFactoryTest0.table = table1;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory3 = slimTableFactoryTest0.slimTableFactory;
        java.util.Map<java.lang.String, java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable>> strMap4 = slimTableFactoryTest0.getmap();
        fitnesse.testsystems.slim.Table table5 = null;
        slimTableFactoryTest0.settable(table5);
        fitnesse.testsystems.slim.Table table7 = null;
        slimTableFactoryTest0.table = table7;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory9 = null;
        slimTableFactoryTest0.slimTableFactory = slimTableFactory9;
        fitnesse.testsystems.slim.Table table11 = null;
        slimTableFactoryTest0.table = table11;
        fitnesse.testsystems.slim.Table table13 = slimTableFactoryTest0.gettable();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass14 = table13.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(slimTableFactory3);
        org.junit.Assert.assertNull(strMap4);
        org.junit.Assert.assertNull(table13);
    }

    @Test
    public void test01373() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01373");
        fitnesse.testsystems.slim.tables.SlimTableFactoryTest slimTableFactoryTest0 = new fitnesse.testsystems.slim.tables.SlimTableFactoryTest();
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory1 = slimTableFactoryTest0.slimTableFactory;
        fitnesse.testsystems.slim.Table table2 = slimTableFactoryTest0.gettable();
        fitnesse.testsystems.slim.Table table3 = null;
        slimTableFactoryTest0.table = table3;
        fitnesse.testsystems.slim.Table table5 = null;
        slimTableFactoryTest0.table = table5;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory7 = null;
        slimTableFactoryTest0.slimTableFactory = slimTableFactory7;
        fitnesse.testsystems.slim.Table table9 = slimTableFactoryTest0.gettable();
        fitnesse.testsystems.slim.Table table10 = slimTableFactoryTest0.gettable();
        // The following exception was thrown during execution in test generation
        try {
            slimTableFactoryTest0.checkTableTypeDefinesIgnoredIfDifferentSpecified();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(slimTableFactory1);
        org.junit.Assert.assertNull(table2);
        org.junit.Assert.assertNull(table9);
        org.junit.Assert.assertNull(table10);
    }

    @Test
    public void test01374() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01374");
        fitnesse.testsystems.slim.tables.SlimTableFactoryTest slimTableFactoryTest0 = new fitnesse.testsystems.slim.tables.SlimTableFactoryTest();
        fitnesse.testsystems.slim.Table table1 = null;
        slimTableFactoryTest0.table = table1;
        fitnesse.testsystems.slim.Table table3 = null;
        slimTableFactoryTest0.settable(table3);
        fitnesse.testsystems.slim.Table table5 = null;
        slimTableFactoryTest0.settable(table5);
        fitnesse.testsystems.slim.Table table7 = null;
        slimTableFactoryTest0.table = table7;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory9 = slimTableFactoryTest0.slimTableFactory;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory10 = null;
        slimTableFactoryTest0.slimTableFactory = slimTableFactory10;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory12 = slimTableFactoryTest0.slimTableFactory;
        fitnesse.testsystems.slim.Table table13 = slimTableFactoryTest0.table;
        fitnesse.testsystems.slim.Table table14 = null;
        slimTableFactoryTest0.table = table14;
        // The following exception was thrown during execution in test generation
        try {
            slimTableFactoryTest0.tableTypeStartingWithcommentColonShouldReturnNull();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(slimTableFactory9);
        org.junit.Assert.assertNull(slimTableFactory12);
        org.junit.Assert.assertNull(table13);
    }

    @Test
    public void test01375() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01375");
        fitnesse.testsystems.slim.tables.SlimTableFactoryTest slimTableFactoryTest0 = new fitnesse.testsystems.slim.tables.SlimTableFactoryTest();
        fitnesse.testsystems.slim.Table table1 = null;
        slimTableFactoryTest0.table = table1;
        fitnesse.testsystems.slim.Table table3 = null;
        slimTableFactoryTest0.settable(table3);
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory5 = null;
        slimTableFactoryTest0.slimTableFactory = slimTableFactory5;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory7 = null;
        slimTableFactoryTest0.slimTableFactory = slimTableFactory7;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory9 = slimTableFactoryTest0.getslimTableFactory();
        // The following exception was thrown during execution in test generation
        try {
            slimTableFactoryTest0.checkTableTypeDefineUsedForTable();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(slimTableFactory9);
    }

    @Test
    public void test01376() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01376");
        fitnesse.testsystems.slim.tables.SlimTableFactoryTest slimTableFactoryTest0 = new fitnesse.testsystems.slim.tables.SlimTableFactoryTest();
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory1 = slimTableFactoryTest0.slimTableFactory;
        fitnesse.testsystems.slim.Table table2 = slimTableFactoryTest0.gettable();
        fitnesse.testsystems.slim.Table table3 = null;
        slimTableFactoryTest0.table = table3;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory5 = null;
        slimTableFactoryTest0.setslimTableFactory(slimTableFactory5);
        java.util.Map<java.lang.String, java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable>> strMap7 = slimTableFactoryTest0.map;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory8 = slimTableFactoryTest0.slimTableFactory;
        fitnesse.testsystems.slim.Table table9 = null;
        slimTableFactoryTest0.table = table9;
        java.util.Map<java.lang.String, java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable>> strMap11 = slimTableFactoryTest0.map;
        java.util.Map<java.lang.String, java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable>> strMap12 = slimTableFactoryTest0.map;
        // The following exception was thrown during execution in test generation
        try {
            slimTableFactoryTest0.shouldCreateCorrectSlimTableForTablesType();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(slimTableFactory1);
        org.junit.Assert.assertNull(table2);
        org.junit.Assert.assertNull(strMap7);
        org.junit.Assert.assertNull(slimTableFactory8);
        org.junit.Assert.assertNull(strMap11);
        org.junit.Assert.assertNull(strMap12);
    }

    @Test
    public void test01377() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01377");
        fitnesse.testsystems.slim.tables.SlimTableFactoryTest slimTableFactoryTest0 = new fitnesse.testsystems.slim.tables.SlimTableFactoryTest();
        fitnesse.testsystems.slim.Table table1 = null;
        slimTableFactoryTest0.table = table1;
        fitnesse.testsystems.slim.Table table3 = slimTableFactoryTest0.table;
        fitnesse.testsystems.slim.Table table4 = slimTableFactoryTest0.gettable();
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory5 = slimTableFactoryTest0.slimTableFactory;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory6 = slimTableFactoryTest0.getslimTableFactory();
        fitnesse.testsystems.slim.Table table7 = slimTableFactoryTest0.table;
        // The following exception was thrown during execution in test generation
        try {
            slimTableFactoryTest0.tableTypeStartingWithcommentColonShouldReturnNull();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(table3);
        org.junit.Assert.assertNull(table4);
        org.junit.Assert.assertNull(slimTableFactory5);
        org.junit.Assert.assertNull(slimTableFactory6);
        org.junit.Assert.assertNull(table7);
    }

    @Test
    public void test01378() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01378");
        fitnesse.testsystems.slim.tables.SlimTableFactoryTest slimTableFactoryTest0 = new fitnesse.testsystems.slim.tables.SlimTableFactoryTest();
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory1 = slimTableFactoryTest0.slimTableFactory;
        fitnesse.testsystems.slim.Table table2 = slimTableFactoryTest0.gettable();
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory3 = null;
        slimTableFactoryTest0.slimTableFactory = slimTableFactory3;
        fitnesse.testsystems.slim.Table table5 = null;
        slimTableFactoryTest0.settable(table5);
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory7 = slimTableFactoryTest0.slimTableFactory;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory8 = slimTableFactoryTest0.getslimTableFactory();
        fitnesse.testsystems.slim.Table table9 = slimTableFactoryTest0.gettable();
        fitnesse.testsystems.slim.Table table10 = slimTableFactoryTest0.gettable();
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory11 = null;
        slimTableFactoryTest0.slimTableFactory = slimTableFactory11;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory13 = null;
        slimTableFactoryTest0.setslimTableFactory(slimTableFactory13);
        java.util.Map<java.lang.String, java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable>> strMap15 = slimTableFactoryTest0.getmap();
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory16 = null;
        slimTableFactoryTest0.slimTableFactory = slimTableFactory16;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory18 = slimTableFactoryTest0.slimTableFactory;
        // The following exception was thrown during execution in test generation
        try {
            slimTableFactoryTest0.addTableTypeImport("hi!", "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(slimTableFactory1);
        org.junit.Assert.assertNull(table2);
        org.junit.Assert.assertNull(slimTableFactory7);
        org.junit.Assert.assertNull(slimTableFactory8);
        org.junit.Assert.assertNull(table9);
        org.junit.Assert.assertNull(table10);
        org.junit.Assert.assertNull(strMap15);
        org.junit.Assert.assertNull(slimTableFactory18);
    }

    @Test
    public void test01379() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01379");
        fitnesse.testsystems.slim.tables.SlimTableFactoryTest slimTableFactoryTest0 = new fitnesse.testsystems.slim.tables.SlimTableFactoryTest();
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory1 = slimTableFactoryTest0.slimTableFactory;
        fitnesse.testsystems.slim.Table table2 = slimTableFactoryTest0.gettable();
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory3 = null;
        slimTableFactoryTest0.slimTableFactory = slimTableFactory3;
        fitnesse.testsystems.slim.Table table5 = null;
        slimTableFactoryTest0.settable(table5);
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory7 = slimTableFactoryTest0.slimTableFactory;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory8 = slimTableFactoryTest0.getslimTableFactory();
        fitnesse.testsystems.slim.Table table9 = slimTableFactoryTest0.gettable();
        fitnesse.testsystems.slim.Table table10 = slimTableFactoryTest0.gettable();
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory11 = null;
        slimTableFactoryTest0.slimTableFactory = slimTableFactory11;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory13 = slimTableFactoryTest0.slimTableFactory;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory14 = null;
        slimTableFactoryTest0.slimTableFactory = slimTableFactory14;
        java.lang.Class<?> wildcardClass16 = slimTableFactoryTest0.getClass();
        org.junit.Assert.assertNull(slimTableFactory1);
        org.junit.Assert.assertNull(table2);
        org.junit.Assert.assertNull(slimTableFactory7);
        org.junit.Assert.assertNull(slimTableFactory8);
        org.junit.Assert.assertNull(table9);
        org.junit.Assert.assertNull(table10);
        org.junit.Assert.assertNull(slimTableFactory13);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test01380() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01380");
        fitnesse.testsystems.slim.tables.SlimTableFactoryTest slimTableFactoryTest0 = new fitnesse.testsystems.slim.tables.SlimTableFactoryTest();
        fitnesse.testsystems.slim.Table table1 = null;
        slimTableFactoryTest0.table = table1;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory3 = slimTableFactoryTest0.slimTableFactory;
        java.util.Map<java.lang.String, java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable>> strMap4 = slimTableFactoryTest0.getmap();
        fitnesse.testsystems.slim.Table table5 = null;
        slimTableFactoryTest0.settable(table5);
        fitnesse.testsystems.slim.Table table7 = null;
        slimTableFactoryTest0.table = table7;
        fitnesse.testsystems.slim.Table table9 = slimTableFactoryTest0.table;
        fitnesse.testsystems.slim.Table table10 = null;
        slimTableFactoryTest0.settable(table10);
        fitnesse.testsystems.slim.Table table12 = slimTableFactoryTest0.gettable();
        fitnesse.testsystems.slim.Table table13 = slimTableFactoryTest0.table;
        // The following exception was thrown during execution in test generation
        try {
            slimTableFactoryTest0.tableTypeStartingWithcommentColonShouldReturnNull();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(slimTableFactory3);
        org.junit.Assert.assertNull(strMap4);
        org.junit.Assert.assertNull(table9);
        org.junit.Assert.assertNull(table12);
        org.junit.Assert.assertNull(table13);
    }

    @Test
    public void test01381() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01381");
        fitnesse.testsystems.slim.tables.SlimTableFactoryTest slimTableFactoryTest0 = new fitnesse.testsystems.slim.tables.SlimTableFactoryTest();
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory1 = null;
        slimTableFactoryTest0.slimTableFactory = slimTableFactory1;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory3 = slimTableFactoryTest0.getslimTableFactory();
        // The following exception was thrown during execution in test generation
        try {
            slimTableFactoryTest0.checkTableTypeDefinesIgnoredIfDifferentSpecified();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(slimTableFactory3);
    }

    @Test
    public void test01382() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01382");
        fitnesse.testsystems.slim.tables.SlimTableFactoryTest slimTableFactoryTest0 = new fitnesse.testsystems.slim.tables.SlimTableFactoryTest();
        fitnesse.testsystems.slim.Table table1 = null;
        slimTableFactoryTest0.table = table1;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory3 = slimTableFactoryTest0.slimTableFactory;
        java.util.Map<java.lang.String, java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable>> strMap4 = slimTableFactoryTest0.map;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory5 = slimTableFactoryTest0.getslimTableFactory();
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory6 = slimTableFactoryTest0.getslimTableFactory();
        java.util.Map<java.lang.String, java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable>> strMap7 = slimTableFactoryTest0.getmap();
        // The following exception was thrown during execution in test generation
        try {
            slimTableFactoryTest0.addTableTypeImport("", "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(slimTableFactory3);
        org.junit.Assert.assertNull(strMap4);
        org.junit.Assert.assertNull(slimTableFactory5);
        org.junit.Assert.assertNull(slimTableFactory6);
        org.junit.Assert.assertNull(strMap7);
    }

    @Test
    public void test01383() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01383");
        fitnesse.testsystems.slim.tables.SlimTableFactoryTest slimTableFactoryTest0 = new fitnesse.testsystems.slim.tables.SlimTableFactoryTest();
        fitnesse.testsystems.slim.Table table1 = null;
        slimTableFactoryTest0.table = table1;
        fitnesse.testsystems.slim.Table table3 = null;
        slimTableFactoryTest0.settable(table3);
        java.util.Map<java.lang.String, java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable>> strMap5 = slimTableFactoryTest0.map;
        java.util.Map<java.lang.String, java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable>> strMap6 = slimTableFactoryTest0.getmap();
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory7 = slimTableFactoryTest0.slimTableFactory;
        fitnesse.testsystems.slim.Table table8 = slimTableFactoryTest0.gettable();
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory9 = null;
        slimTableFactoryTest0.slimTableFactory = slimTableFactory9;
        // The following exception was thrown during execution in test generation
        try {
            slimTableFactoryTest0.addTableTypeImport("hi!", "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(strMap5);
        org.junit.Assert.assertNull(strMap6);
        org.junit.Assert.assertNull(slimTableFactory7);
        org.junit.Assert.assertNull(table8);
    }

    @Test
    public void test01384() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01384");
        fitnesse.testsystems.slim.tables.SlimTableFactoryTest slimTableFactoryTest0 = new fitnesse.testsystems.slim.tables.SlimTableFactoryTest();
        fitnesse.testsystems.slim.Table table1 = null;
        slimTableFactoryTest0.table = table1;
        fitnesse.testsystems.slim.Table table3 = null;
        slimTableFactoryTest0.settable(table3);
        fitnesse.testsystems.slim.Table table5 = null;
        slimTableFactoryTest0.settable(table5);
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory7 = slimTableFactoryTest0.slimTableFactory;
        java.util.Map<java.lang.String, java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable>> strMap8 = slimTableFactoryTest0.getmap();
        fitnesse.testsystems.slim.Table table9 = null;
        slimTableFactoryTest0.table = table9;
        // The following exception was thrown during execution in test generation
        try {
            slimTableFactoryTest0.addTableTypeImport("", "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(slimTableFactory7);
        org.junit.Assert.assertNull(strMap8);
    }

    @Test
    public void test01385() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01385");
        fitnesse.testsystems.slim.tables.SlimTableFactoryTest slimTableFactoryTest0 = new fitnesse.testsystems.slim.tables.SlimTableFactoryTest();
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory1 = slimTableFactoryTest0.slimTableFactory;
        fitnesse.testsystems.slim.Table table2 = slimTableFactoryTest0.table;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory3 = null;
        slimTableFactoryTest0.setslimTableFactory(slimTableFactory3);
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory5 = null;
        slimTableFactoryTest0.slimTableFactory = slimTableFactory5;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory7 = slimTableFactoryTest0.slimTableFactory;
        // The following exception was thrown during execution in test generation
        try {
            slimTableFactoryTest0.tableTypeStartingWithcommentColonShouldReturnNull();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(slimTableFactory1);
        org.junit.Assert.assertNull(table2);
        org.junit.Assert.assertNull(slimTableFactory7);
    }

    @Test
    public void test01386() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01386");
        fitnesse.testsystems.slim.tables.SlimTableFactoryTest slimTableFactoryTest0 = new fitnesse.testsystems.slim.tables.SlimTableFactoryTest();
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory1 = slimTableFactoryTest0.slimTableFactory;
        fitnesse.testsystems.slim.Table table2 = slimTableFactoryTest0.gettable();
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory3 = null;
        slimTableFactoryTest0.slimTableFactory = slimTableFactory3;
        fitnesse.testsystems.slim.Table table5 = null;
        slimTableFactoryTest0.settable(table5);
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory7 = slimTableFactoryTest0.slimTableFactory;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory8 = slimTableFactoryTest0.getslimTableFactory();
        fitnesse.testsystems.slim.Table table9 = null;
        slimTableFactoryTest0.settable(table9);
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory11 = slimTableFactoryTest0.slimTableFactory;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory12 = slimTableFactoryTest0.getslimTableFactory();
        fitnesse.testsystems.slim.Table table13 = null;
        slimTableFactoryTest0.settable(table13);
        java.lang.Class<?> wildcardClass15 = slimTableFactoryTest0.getClass();
        org.junit.Assert.assertNull(slimTableFactory1);
        org.junit.Assert.assertNull(table2);
        org.junit.Assert.assertNull(slimTableFactory7);
        org.junit.Assert.assertNull(slimTableFactory8);
        org.junit.Assert.assertNull(slimTableFactory11);
        org.junit.Assert.assertNull(slimTableFactory12);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test01387() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01387");
        fitnesse.testsystems.slim.tables.SlimTableFactoryTest slimTableFactoryTest0 = new fitnesse.testsystems.slim.tables.SlimTableFactoryTest();
        fitnesse.testsystems.slim.Table table1 = null;
        slimTableFactoryTest0.table = table1;
        fitnesse.testsystems.slim.Table table3 = null;
        slimTableFactoryTest0.settable(table3);
        fitnesse.testsystems.slim.Table table5 = null;
        slimTableFactoryTest0.settable(table5);
        fitnesse.testsystems.slim.Table table7 = slimTableFactoryTest0.table;
        fitnesse.testsystems.slim.Table table8 = null;
        slimTableFactoryTest0.settable(table8);
        java.util.Map<java.lang.String, java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable>> strMap10 = slimTableFactoryTest0.getmap();
        fitnesse.testsystems.slim.Table table11 = null;
        slimTableFactoryTest0.table = table11;
        fitnesse.testsystems.slim.Table table13 = slimTableFactoryTest0.table;
        fitnesse.testsystems.slim.Table table14 = null;
        slimTableFactoryTest0.settable(table14);
        fitnesse.testsystems.slim.Table table16 = null;
        slimTableFactoryTest0.table = table16;
        fitnesse.testsystems.slim.Table table18 = slimTableFactoryTest0.table;
        java.util.Map<java.lang.String, java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable>> strMap19 = slimTableFactoryTest0.getmap();
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory20 = slimTableFactoryTest0.getslimTableFactory();
        // The following exception was thrown during execution in test generation
        try {
            slimTableFactoryTest0.tableTypeStartingWithcommentColonShouldReturnNull();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(table7);
        org.junit.Assert.assertNull(strMap10);
        org.junit.Assert.assertNull(table13);
        org.junit.Assert.assertNull(table18);
        org.junit.Assert.assertNull(strMap19);
        org.junit.Assert.assertNull(slimTableFactory20);
    }

    @Test
    public void test01388() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01388");
        fitnesse.testsystems.slim.tables.SlimTableFactoryTest slimTableFactoryTest0 = new fitnesse.testsystems.slim.tables.SlimTableFactoryTest();
        fitnesse.testsystems.slim.Table table1 = null;
        slimTableFactoryTest0.table = table1;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory3 = null;
        slimTableFactoryTest0.setslimTableFactory(slimTableFactory3);
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory5 = slimTableFactoryTest0.slimTableFactory;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory6 = slimTableFactoryTest0.getslimTableFactory();
        fitnesse.testsystems.slim.Table table7 = null;
        slimTableFactoryTest0.table = table7;
        fitnesse.testsystems.slim.Table table9 = null;
        slimTableFactoryTest0.settable(table9);
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory11 = slimTableFactoryTest0.slimTableFactory;
        java.util.Map<java.lang.String, java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable>> strMap12 = slimTableFactoryTest0.map;
        java.lang.Class<?> wildcardClass13 = slimTableFactoryTest0.getClass();
        org.junit.Assert.assertNull(slimTableFactory5);
        org.junit.Assert.assertNull(slimTableFactory6);
        org.junit.Assert.assertNull(slimTableFactory11);
        org.junit.Assert.assertNull(strMap12);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test01389() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01389");
        fitnesse.testsystems.slim.tables.SlimTableFactoryTest slimTableFactoryTest0 = new fitnesse.testsystems.slim.tables.SlimTableFactoryTest();
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory1 = slimTableFactoryTest0.slimTableFactory;
        fitnesse.testsystems.slim.Table table2 = slimTableFactoryTest0.gettable();
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory3 = null;
        slimTableFactoryTest0.slimTableFactory = slimTableFactory3;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory5 = null;
        slimTableFactoryTest0.slimTableFactory = slimTableFactory5;
        // The following exception was thrown during execution in test generation
        try {
            slimTableFactoryTest0.commentTableShouldReturnNull();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(slimTableFactory1);
        org.junit.Assert.assertNull(table2);
    }

    @Test
    public void test01390() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01390");
        fitnesse.testsystems.slim.tables.SlimTableFactoryTest slimTableFactoryTest0 = new fitnesse.testsystems.slim.tables.SlimTableFactoryTest();
        fitnesse.testsystems.slim.Table table1 = null;
        slimTableFactoryTest0.table = table1;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory3 = slimTableFactoryTest0.getslimTableFactory();
        fitnesse.testsystems.slim.Table table4 = slimTableFactoryTest0.gettable();
        java.util.Map<java.lang.String, java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable>> strMap5 = slimTableFactoryTest0.getmap();
        fitnesse.testsystems.slim.Table table6 = slimTableFactoryTest0.table;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory7 = slimTableFactoryTest0.slimTableFactory;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory8 = slimTableFactoryTest0.slimTableFactory;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory9 = null;
        slimTableFactoryTest0.setslimTableFactory(slimTableFactory9);
        // The following exception was thrown during execution in test generation
        try {
            slimTableFactoryTest0.checkTableTypeDefinesIgnoredIfDifferentSpecified();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(slimTableFactory3);
        org.junit.Assert.assertNull(table4);
        org.junit.Assert.assertNull(strMap5);
        org.junit.Assert.assertNull(table6);
        org.junit.Assert.assertNull(slimTableFactory7);
        org.junit.Assert.assertNull(slimTableFactory8);
    }

    @Test
    public void test01391() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01391");
        fitnesse.testsystems.slim.tables.SlimTableFactoryTest slimTableFactoryTest0 = new fitnesse.testsystems.slim.tables.SlimTableFactoryTest();
        fitnesse.testsystems.slim.Table table1 = null;
        slimTableFactoryTest0.table = table1;
        fitnesse.testsystems.slim.Table table3 = slimTableFactoryTest0.table;
        fitnesse.testsystems.slim.Table table4 = slimTableFactoryTest0.gettable();
        java.util.Map<java.lang.String, java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable>> strMap5 = slimTableFactoryTest0.getmap();
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory6 = slimTableFactoryTest0.getslimTableFactory();
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory7 = slimTableFactoryTest0.getslimTableFactory();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass8 = slimTableFactory7.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(table3);
        org.junit.Assert.assertNull(table4);
        org.junit.Assert.assertNull(strMap5);
        org.junit.Assert.assertNull(slimTableFactory6);
        org.junit.Assert.assertNull(slimTableFactory7);
    }

    @Test
    public void test01392() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01392");
        fitnesse.testsystems.slim.tables.SlimTableFactoryTest slimTableFactoryTest0 = new fitnesse.testsystems.slim.tables.SlimTableFactoryTest();
        fitnesse.testsystems.slim.Table table1 = null;
        slimTableFactoryTest0.table = table1;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory3 = null;
        slimTableFactoryTest0.slimTableFactory = slimTableFactory3;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory5 = slimTableFactoryTest0.getslimTableFactory();
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory6 = null;
        slimTableFactoryTest0.setslimTableFactory(slimTableFactory6);
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory8 = slimTableFactoryTest0.getslimTableFactory();
        fitnesse.testsystems.slim.Table table9 = slimTableFactoryTest0.gettable();
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory10 = slimTableFactoryTest0.slimTableFactory;
        // The following exception was thrown during execution in test generation
        try {
            slimTableFactoryTest0.shouldCreateCorrectSlimTableForTablesType();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(slimTableFactory5);
        org.junit.Assert.assertNull(slimTableFactory8);
        org.junit.Assert.assertNull(table9);
        org.junit.Assert.assertNull(slimTableFactory10);
    }

    @Test
    public void test01393() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01393");
        fitnesse.testsystems.slim.tables.SlimTableFactoryTest slimTableFactoryTest0 = new fitnesse.testsystems.slim.tables.SlimTableFactoryTest();
        fitnesse.testsystems.slim.Table table1 = null;
        slimTableFactoryTest0.table = table1;
        fitnesse.testsystems.slim.Table table3 = null;
        slimTableFactoryTest0.settable(table3);
        java.util.Map<java.lang.String, java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable>> strMap5 = slimTableFactoryTest0.map;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory6 = slimTableFactoryTest0.getslimTableFactory();
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory7 = slimTableFactoryTest0.getslimTableFactory();
        fitnesse.testsystems.slim.Table table8 = slimTableFactoryTest0.gettable();
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory9 = null;
        slimTableFactoryTest0.slimTableFactory = slimTableFactory9;
        // The following exception was thrown during execution in test generation
        try {
            slimTableFactoryTest0.addTableTypeImport("hi!", "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(strMap5);
        org.junit.Assert.assertNull(slimTableFactory6);
        org.junit.Assert.assertNull(slimTableFactory7);
        org.junit.Assert.assertNull(table8);
    }

    @Test
    public void test01394() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01394");
        fitnesse.testsystems.slim.tables.SlimTableFactoryTest slimTableFactoryTest0 = new fitnesse.testsystems.slim.tables.SlimTableFactoryTest();
        fitnesse.testsystems.slim.Table table1 = null;
        slimTableFactoryTest0.table = table1;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory3 = slimTableFactoryTest0.slimTableFactory;
        java.util.Map<java.lang.String, java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable>> strMap4 = slimTableFactoryTest0.getmap();
        fitnesse.testsystems.slim.Table table5 = null;
        slimTableFactoryTest0.settable(table5);
        fitnesse.testsystems.slim.Table table7 = null;
        slimTableFactoryTest0.table = table7;
        fitnesse.testsystems.slim.Table table9 = slimTableFactoryTest0.table;
        fitnesse.testsystems.slim.Table table10 = null;
        slimTableFactoryTest0.settable(table10);
        fitnesse.testsystems.slim.Table table12 = slimTableFactoryTest0.gettable();
        // The following exception was thrown during execution in test generation
        try {
            slimTableFactoryTest0.checkTableTypeDefinesIgnoredIfDifferentSpecified();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(slimTableFactory3);
        org.junit.Assert.assertNull(strMap4);
        org.junit.Assert.assertNull(table9);
        org.junit.Assert.assertNull(table12);
    }

    @Test
    public void test01395() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01395");
        fitnesse.testsystems.slim.tables.SlimTableFactoryTest slimTableFactoryTest0 = new fitnesse.testsystems.slim.tables.SlimTableFactoryTest();
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory1 = slimTableFactoryTest0.slimTableFactory;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory2 = slimTableFactoryTest0.slimTableFactory;
        fitnesse.testsystems.slim.Table table3 = slimTableFactoryTest0.gettable();
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory4 = slimTableFactoryTest0.getslimTableFactory();
        fitnesse.testsystems.slim.Table table5 = null;
        slimTableFactoryTest0.table = table5;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory7 = slimTableFactoryTest0.getslimTableFactory();
        // The following exception was thrown during execution in test generation
        try {
            slimTableFactoryTest0.checkTableTypeDefineUsedForTable();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(slimTableFactory1);
        org.junit.Assert.assertNull(slimTableFactory2);
        org.junit.Assert.assertNull(table3);
        org.junit.Assert.assertNull(slimTableFactory4);
        org.junit.Assert.assertNull(slimTableFactory7);
    }

    @Test
    public void test01396() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01396");
        fitnesse.testsystems.slim.tables.SlimTableFactoryTest slimTableFactoryTest0 = new fitnesse.testsystems.slim.tables.SlimTableFactoryTest();
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory1 = slimTableFactoryTest0.slimTableFactory;
        fitnesse.testsystems.slim.Table table2 = slimTableFactoryTest0.table;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory3 = null;
        slimTableFactoryTest0.setslimTableFactory(slimTableFactory3);
        fitnesse.testsystems.slim.Table table5 = null;
        slimTableFactoryTest0.table = table5;
        // The following exception was thrown during execution in test generation
        try {
            slimTableFactoryTest0.checkTableTypeDefineUsedForTable();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(slimTableFactory1);
        org.junit.Assert.assertNull(table2);
    }

    @Test
    public void test01397() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01397");
        fitnesse.testsystems.slim.tables.SlimTableFactoryTest slimTableFactoryTest0 = new fitnesse.testsystems.slim.tables.SlimTableFactoryTest();
        fitnesse.testsystems.slim.Table table1 = null;
        slimTableFactoryTest0.table = table1;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory3 = slimTableFactoryTest0.slimTableFactory;
        java.util.Map<java.lang.String, java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable>> strMap4 = slimTableFactoryTest0.getmap();
        fitnesse.testsystems.slim.Table table5 = null;
        slimTableFactoryTest0.settable(table5);
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory7 = null;
        slimTableFactoryTest0.setslimTableFactory(slimTableFactory7);
        java.util.Map<java.lang.String, java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable>> strMap9 = slimTableFactoryTest0.getmap();
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory10 = slimTableFactoryTest0.slimTableFactory;
        fitnesse.testsystems.slim.Table table11 = null;
        slimTableFactoryTest0.table = table11;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory13 = slimTableFactoryTest0.getslimTableFactory();
        // The following exception was thrown during execution in test generation
        try {
            slimTableFactoryTest0.shouldCreateCorrectSlimTableForTablesType();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(slimTableFactory3);
        org.junit.Assert.assertNull(strMap4);
        org.junit.Assert.assertNull(strMap9);
        org.junit.Assert.assertNull(slimTableFactory10);
        org.junit.Assert.assertNull(slimTableFactory13);
    }

    @Test
    public void test01398() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01398");
        fitnesse.testsystems.slim.tables.SlimTableFactoryTest slimTableFactoryTest0 = new fitnesse.testsystems.slim.tables.SlimTableFactoryTest();
        fitnesse.testsystems.slim.Table table1 = null;
        slimTableFactoryTest0.table = table1;
        fitnesse.testsystems.slim.Table table3 = null;
        slimTableFactoryTest0.settable(table3);
        java.util.Map<java.lang.String, java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable>> strMap5 = slimTableFactoryTest0.map;
        fitnesse.testsystems.slim.Table table6 = null;
        slimTableFactoryTest0.settable(table6);
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory8 = null;
        slimTableFactoryTest0.slimTableFactory = slimTableFactory8;
        // The following exception was thrown during execution in test generation
        try {
            slimTableFactoryTest0.checkTableTypeDefineUsedForTable();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(strMap5);
    }

    @Test
    public void test01399() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01399");
        fitnesse.testsystems.slim.tables.SlimTableFactoryTest slimTableFactoryTest0 = new fitnesse.testsystems.slim.tables.SlimTableFactoryTest();
        fitnesse.testsystems.slim.Table table1 = null;
        slimTableFactoryTest0.table = table1;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory3 = slimTableFactoryTest0.slimTableFactory;
        java.util.Map<java.lang.String, java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable>> strMap4 = slimTableFactoryTest0.map;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory5 = null;
        slimTableFactoryTest0.setslimTableFactory(slimTableFactory5);
        fitnesse.testsystems.slim.Table table7 = null;
        slimTableFactoryTest0.table = table7;
        fitnesse.testsystems.slim.Table table9 = null;
        slimTableFactoryTest0.table = table9;
        // The following exception was thrown during execution in test generation
        try {
            slimTableFactoryTest0.shouldCreateCorrectSlimTableForTablesType();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(slimTableFactory3);
        org.junit.Assert.assertNull(strMap4);
    }

    @Test
    public void test01400() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01400");
        fitnesse.testsystems.slim.tables.SlimTableFactoryTest slimTableFactoryTest0 = new fitnesse.testsystems.slim.tables.SlimTableFactoryTest();
        fitnesse.testsystems.slim.Table table1 = slimTableFactoryTest0.table;
        java.util.Map<java.lang.String, java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable>> strMap2 = slimTableFactoryTest0.getmap();
        fitnesse.testsystems.slim.Table table3 = null;
        slimTableFactoryTest0.table = table3;
        fitnesse.testsystems.slim.Table table5 = slimTableFactoryTest0.gettable();
        fitnesse.testsystems.slim.Table table6 = null;
        slimTableFactoryTest0.table = table6;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory8 = slimTableFactoryTest0.getslimTableFactory();
        fitnesse.testsystems.slim.Table table9 = null;
        slimTableFactoryTest0.settable(table9);
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory11 = null;
        slimTableFactoryTest0.slimTableFactory = slimTableFactory11;
        java.util.Map<java.lang.String, java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable>> strMap13 = slimTableFactoryTest0.map;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory14 = null;
        slimTableFactoryTest0.slimTableFactory = slimTableFactory14;
        java.util.Map<java.lang.String, java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable>> strMap16 = slimTableFactoryTest0.getmap();
        fitnesse.testsystems.slim.Table table17 = slimTableFactoryTest0.table;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory18 = slimTableFactoryTest0.slimTableFactory;
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
        org.junit.Assert.assertNull(slimTableFactory8);
        org.junit.Assert.assertNull(strMap13);
        org.junit.Assert.assertNull(strMap16);
        org.junit.Assert.assertNull(table17);
        org.junit.Assert.assertNull(slimTableFactory18);
    }

    @Test
    public void test01401() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01401");
        fitnesse.testsystems.slim.tables.SlimTableFactoryTest slimTableFactoryTest0 = new fitnesse.testsystems.slim.tables.SlimTableFactoryTest();
        fitnesse.testsystems.slim.Table table1 = null;
        slimTableFactoryTest0.table = table1;
        fitnesse.testsystems.slim.Table table3 = slimTableFactoryTest0.table;
        fitnesse.testsystems.slim.Table table4 = slimTableFactoryTest0.gettable();
        java.util.Map<java.lang.String, java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable>> strMap5 = slimTableFactoryTest0.getmap();
        java.util.Map<java.lang.String, java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable>> strMap6 = slimTableFactoryTest0.map;
        fitnesse.testsystems.slim.Table table7 = slimTableFactoryTest0.table;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory8 = null;
        slimTableFactoryTest0.slimTableFactory = slimTableFactory8;
        fitnesse.testsystems.slim.Table table10 = slimTableFactoryTest0.table;
        fitnesse.testsystems.slim.Table table11 = null;
        slimTableFactoryTest0.table = table11;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory13 = null;
        slimTableFactoryTest0.slimTableFactory = slimTableFactory13;
        // The following exception was thrown during execution in test generation
        try {
            slimTableFactoryTest0.addTableTypeImport("hi!", "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(table3);
        org.junit.Assert.assertNull(table4);
        org.junit.Assert.assertNull(strMap5);
        org.junit.Assert.assertNull(strMap6);
        org.junit.Assert.assertNull(table7);
        org.junit.Assert.assertNull(table10);
    }

    @Test
    public void test01402() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01402");
        fitnesse.testsystems.slim.tables.SlimTableFactoryTest slimTableFactoryTest0 = new fitnesse.testsystems.slim.tables.SlimTableFactoryTest();
        fitnesse.testsystems.slim.Table table1 = null;
        slimTableFactoryTest0.table = table1;
        fitnesse.testsystems.slim.Table table3 = null;
        slimTableFactoryTest0.settable(table3);
        fitnesse.testsystems.slim.Table table5 = null;
        slimTableFactoryTest0.settable(table5);
        fitnesse.testsystems.slim.Table table7 = slimTableFactoryTest0.table;
        fitnesse.testsystems.slim.Table table8 = null;
        slimTableFactoryTest0.settable(table8);
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory10 = null;
        slimTableFactoryTest0.slimTableFactory = slimTableFactory10;
        fitnesse.testsystems.slim.Table table12 = null;
        slimTableFactoryTest0.table = table12;
        fitnesse.testsystems.slim.Table table14 = null;
        slimTableFactoryTest0.table = table14;
        // The following exception was thrown during execution in test generation
        try {
            slimTableFactoryTest0.tableTypeStartingWithcommentColonShouldReturnNull();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(table7);
    }

    @Test
    public void test01403() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01403");
        fitnesse.testsystems.slim.tables.SlimTableFactoryTest slimTableFactoryTest0 = new fitnesse.testsystems.slim.tables.SlimTableFactoryTest();
        fitnesse.testsystems.slim.Table table1 = null;
        slimTableFactoryTest0.table = table1;
        fitnesse.testsystems.slim.Table table3 = null;
        slimTableFactoryTest0.settable(table3);
        fitnesse.testsystems.slim.Table table5 = null;
        slimTableFactoryTest0.settable(table5);
        fitnesse.testsystems.slim.Table table7 = slimTableFactoryTest0.table;
        fitnesse.testsystems.slim.Table table8 = null;
        slimTableFactoryTest0.settable(table8);
        java.util.Map<java.lang.String, java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable>> strMap10 = slimTableFactoryTest0.getmap();
        fitnesse.testsystems.slim.Table table11 = slimTableFactoryTest0.gettable();
        // The following exception was thrown during execution in test generation
        try {
            slimTableFactoryTest0.tableTypeStartingWithcommentColonShouldReturnNull();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(table7);
        org.junit.Assert.assertNull(strMap10);
        org.junit.Assert.assertNull(table11);
    }

    @Test
    public void test01404() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01404");
        fitnesse.testsystems.slim.tables.SlimTableFactoryTest slimTableFactoryTest0 = new fitnesse.testsystems.slim.tables.SlimTableFactoryTest();
        fitnesse.testsystems.slim.Table table1 = null;
        slimTableFactoryTest0.table = table1;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory3 = slimTableFactoryTest0.slimTableFactory;
        fitnesse.testsystems.slim.Table table4 = null;
        slimTableFactoryTest0.table = table4;
        fitnesse.testsystems.slim.Table table6 = null;
        slimTableFactoryTest0.table = table6;
        java.util.Map<java.lang.String, java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable>> strMap8 = slimTableFactoryTest0.getmap();
        org.junit.Assert.assertNull(slimTableFactory3);
        org.junit.Assert.assertNull(strMap8);
    }

    @Test
    public void test01405() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01405");
        fitnesse.testsystems.slim.tables.SlimTableFactoryTest slimTableFactoryTest0 = new fitnesse.testsystems.slim.tables.SlimTableFactoryTest();
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory1 = slimTableFactoryTest0.slimTableFactory;
        fitnesse.testsystems.slim.Table table2 = slimTableFactoryTest0.gettable();
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory3 = null;
        slimTableFactoryTest0.slimTableFactory = slimTableFactory3;
        fitnesse.testsystems.slim.Table table5 = null;
        slimTableFactoryTest0.settable(table5);
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory7 = slimTableFactoryTest0.slimTableFactory;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory8 = slimTableFactoryTest0.getslimTableFactory();
        fitnesse.testsystems.slim.Table table9 = null;
        slimTableFactoryTest0.table = table9;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory11 = slimTableFactoryTest0.getslimTableFactory();
        // The following exception was thrown during execution in test generation
        try {
            slimTableFactoryTest0.checkTableTypeDefinesIgnoredIfDifferentSpecified();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(slimTableFactory1);
        org.junit.Assert.assertNull(table2);
        org.junit.Assert.assertNull(slimTableFactory7);
        org.junit.Assert.assertNull(slimTableFactory8);
        org.junit.Assert.assertNull(slimTableFactory11);
    }

    @Test
    public void test01406() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01406");
        fitnesse.testsystems.slim.tables.SlimTableFactoryTest slimTableFactoryTest0 = new fitnesse.testsystems.slim.tables.SlimTableFactoryTest();
        fitnesse.testsystems.slim.Table table1 = null;
        slimTableFactoryTest0.table = table1;
        fitnesse.testsystems.slim.Table table3 = slimTableFactoryTest0.table;
        fitnesse.testsystems.slim.Table table4 = slimTableFactoryTest0.gettable();
        java.util.Map<java.lang.String, java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable>> strMap5 = slimTableFactoryTest0.getmap();
        java.util.Map<java.lang.String, java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable>> strMap6 = slimTableFactoryTest0.map;
        fitnesse.testsystems.slim.Table table7 = slimTableFactoryTest0.table;
        fitnesse.testsystems.slim.Table table8 = slimTableFactoryTest0.gettable();
        // The following exception was thrown during execution in test generation
        try {
            slimTableFactoryTest0.addTableTypeImport("", "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(table3);
        org.junit.Assert.assertNull(table4);
        org.junit.Assert.assertNull(strMap5);
        org.junit.Assert.assertNull(strMap6);
        org.junit.Assert.assertNull(table7);
        org.junit.Assert.assertNull(table8);
    }

    @Test
    public void test01407() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01407");
        fitnesse.testsystems.slim.tables.SlimTableFactoryTest slimTableFactoryTest0 = new fitnesse.testsystems.slim.tables.SlimTableFactoryTest();
        fitnesse.testsystems.slim.Table table1 = null;
        slimTableFactoryTest0.table = table1;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory3 = slimTableFactoryTest0.slimTableFactory;
        java.util.Map<java.lang.String, java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable>> strMap4 = slimTableFactoryTest0.getmap();
        fitnesse.testsystems.slim.Table table5 = null;
        slimTableFactoryTest0.settable(table5);
        fitnesse.testsystems.slim.Table table7 = null;
        slimTableFactoryTest0.table = table7;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory9 = null;
        slimTableFactoryTest0.slimTableFactory = slimTableFactory9;
        fitnesse.testsystems.slim.Table table11 = null;
        slimTableFactoryTest0.table = table11;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory13 = null;
        slimTableFactoryTest0.slimTableFactory = slimTableFactory13;
        fitnesse.testsystems.slim.Table table15 = slimTableFactoryTest0.gettable();
        fitnesse.testsystems.slim.Table table16 = slimTableFactoryTest0.table;
        fitnesse.testsystems.slim.Table table17 = null;
        slimTableFactoryTest0.table = table17;
        // The following exception was thrown during execution in test generation
        try {
            slimTableFactoryTest0.commentTableShouldReturnNull();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(slimTableFactory3);
        org.junit.Assert.assertNull(strMap4);
        org.junit.Assert.assertNull(table15);
        org.junit.Assert.assertNull(table16);
    }

    @Test
    public void test01408() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01408");
        fitnesse.testsystems.slim.tables.SlimTableFactoryTest slimTableFactoryTest0 = new fitnesse.testsystems.slim.tables.SlimTableFactoryTest();
        fitnesse.testsystems.slim.Table table1 = slimTableFactoryTest0.table;
        java.util.Map<java.lang.String, java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable>> strMap2 = slimTableFactoryTest0.getmap();
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory3 = null;
        slimTableFactoryTest0.slimTableFactory = slimTableFactory3;
        fitnesse.testsystems.slim.Table table5 = slimTableFactoryTest0.table;
        java.util.Map<java.lang.String, java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable>> strMap6 = slimTableFactoryTest0.map;
        java.util.Map<java.lang.String, java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable>> strMap7 = slimTableFactoryTest0.getmap();
        // The following exception was thrown during execution in test generation
        try {
            slimTableFactoryTest0.commentTableShouldReturnNull();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(table1);
        org.junit.Assert.assertNull(strMap2);
        org.junit.Assert.assertNull(table5);
        org.junit.Assert.assertNull(strMap6);
        org.junit.Assert.assertNull(strMap7);
    }

    @Test
    public void test01409() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01409");
        fitnesse.testsystems.slim.tables.SlimTableFactoryTest slimTableFactoryTest0 = new fitnesse.testsystems.slim.tables.SlimTableFactoryTest();
        fitnesse.testsystems.slim.Table table1 = slimTableFactoryTest0.table;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory2 = slimTableFactoryTest0.slimTableFactory;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory3 = null;
        slimTableFactoryTest0.setslimTableFactory(slimTableFactory3);
        java.util.Map<java.lang.String, java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable>> strMap5 = slimTableFactoryTest0.map;
        // The following exception was thrown during execution in test generation
        try {
            slimTableFactoryTest0.checkTableTypeDefineUsedForTable();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(table1);
        org.junit.Assert.assertNull(slimTableFactory2);
        org.junit.Assert.assertNull(strMap5);
    }

    @Test
    public void test01410() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01410");
        fitnesse.testsystems.slim.tables.SlimTableFactoryTest slimTableFactoryTest0 = new fitnesse.testsystems.slim.tables.SlimTableFactoryTest();
        fitnesse.testsystems.slim.Table table1 = null;
        slimTableFactoryTest0.table = table1;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory3 = slimTableFactoryTest0.slimTableFactory;
        java.util.Map<java.lang.String, java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable>> strMap4 = slimTableFactoryTest0.getmap();
        fitnesse.testsystems.slim.Table table5 = null;
        slimTableFactoryTest0.settable(table5);
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory7 = null;
        slimTableFactoryTest0.slimTableFactory = slimTableFactory7;
        java.util.Map<java.lang.String, java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable>> strMap9 = slimTableFactoryTest0.getmap();
        java.util.Map<java.lang.String, java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable>> strMap10 = slimTableFactoryTest0.getmap();
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory11 = null;
        slimTableFactoryTest0.slimTableFactory = slimTableFactory11;
        java.util.Map<java.lang.String, java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable>> strMap13 = slimTableFactoryTest0.map;
        fitnesse.testsystems.slim.Table table14 = slimTableFactoryTest0.table;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory15 = null;
        slimTableFactoryTest0.setslimTableFactory(slimTableFactory15);
        // The following exception was thrown during execution in test generation
        try {
            slimTableFactoryTest0.addTableTypeImport("", "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(slimTableFactory3);
        org.junit.Assert.assertNull(strMap4);
        org.junit.Assert.assertNull(strMap9);
        org.junit.Assert.assertNull(strMap10);
        org.junit.Assert.assertNull(strMap13);
        org.junit.Assert.assertNull(table14);
    }

    @Test
    public void test01411() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01411");
        fitnesse.testsystems.slim.tables.SlimTableFactoryTest slimTableFactoryTest0 = new fitnesse.testsystems.slim.tables.SlimTableFactoryTest();
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory1 = slimTableFactoryTest0.slimTableFactory;
        fitnesse.testsystems.slim.Table table2 = slimTableFactoryTest0.gettable();
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory3 = null;
        slimTableFactoryTest0.slimTableFactory = slimTableFactory3;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory5 = null;
        slimTableFactoryTest0.setslimTableFactory(slimTableFactory5);
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory7 = null;
        slimTableFactoryTest0.slimTableFactory = slimTableFactory7;
        fitnesse.testsystems.slim.Table table9 = slimTableFactoryTest0.gettable();
        java.util.Map<java.lang.String, java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable>> strMap10 = slimTableFactoryTest0.map;
        // The following exception was thrown during execution in test generation
        try {
            slimTableFactoryTest0.checkTableTypeDefineUsedForTable();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(slimTableFactory1);
        org.junit.Assert.assertNull(table2);
        org.junit.Assert.assertNull(table9);
        org.junit.Assert.assertNull(strMap10);
    }

    @Test
    public void test01412() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01412");
        fitnesse.testsystems.slim.tables.SlimTableFactoryTest slimTableFactoryTest0 = new fitnesse.testsystems.slim.tables.SlimTableFactoryTest();
        fitnesse.testsystems.slim.Table table1 = null;
        slimTableFactoryTest0.table = table1;
        fitnesse.testsystems.slim.Table table3 = null;
        slimTableFactoryTest0.settable(table3);
        java.util.Map<java.lang.String, java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable>> strMap5 = slimTableFactoryTest0.map;
        java.util.Map<java.lang.String, java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable>> strMap6 = slimTableFactoryTest0.getmap();
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory7 = slimTableFactoryTest0.slimTableFactory;
        java.util.Map<java.lang.String, java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable>> strMap8 = slimTableFactoryTest0.map;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory9 = null;
        slimTableFactoryTest0.slimTableFactory = slimTableFactory9;
        fitnesse.testsystems.slim.Table table11 = null;
        slimTableFactoryTest0.table = table11;
        fitnesse.testsystems.slim.Table table13 = null;
        slimTableFactoryTest0.settable(table13);
        java.util.Map<java.lang.String, java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable>> strMap15 = slimTableFactoryTest0.map;
        // The following exception was thrown during execution in test generation
        try {
            slimTableFactoryTest0.addTableTypeImport("hi!", "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(strMap5);
        org.junit.Assert.assertNull(strMap6);
        org.junit.Assert.assertNull(slimTableFactory7);
        org.junit.Assert.assertNull(strMap8);
        org.junit.Assert.assertNull(strMap15);
    }

    @Test
    public void test01413() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01413");
        fitnesse.testsystems.slim.tables.SlimTableFactoryTest slimTableFactoryTest0 = new fitnesse.testsystems.slim.tables.SlimTableFactoryTest();
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory1 = slimTableFactoryTest0.slimTableFactory;
        fitnesse.testsystems.slim.Table table2 = slimTableFactoryTest0.gettable();
        fitnesse.testsystems.slim.Table table3 = null;
        slimTableFactoryTest0.table = table3;
        fitnesse.testsystems.slim.Table table5 = null;
        slimTableFactoryTest0.table = table5;
        java.util.Map<java.lang.String, java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable>> strMap7 = slimTableFactoryTest0.getmap();
        java.util.Map<java.lang.String, java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable>> strMap8 = slimTableFactoryTest0.getmap();
        // The following exception was thrown during execution in test generation
        try {
            slimTableFactoryTest0.commentTableShouldReturnNull();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(slimTableFactory1);
        org.junit.Assert.assertNull(table2);
        org.junit.Assert.assertNull(strMap7);
        org.junit.Assert.assertNull(strMap8);
    }

    @Test
    public void test01414() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01414");
        fitnesse.testsystems.slim.tables.SlimTableFactoryTest slimTableFactoryTest0 = new fitnesse.testsystems.slim.tables.SlimTableFactoryTest();
        fitnesse.testsystems.slim.Table table1 = null;
        slimTableFactoryTest0.table = table1;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory3 = slimTableFactoryTest0.slimTableFactory;
        java.util.Map<java.lang.String, java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable>> strMap4 = slimTableFactoryTest0.getmap();
        fitnesse.testsystems.slim.Table table5 = null;
        slimTableFactoryTest0.settable(table5);
        fitnesse.testsystems.slim.Table table7 = null;
        slimTableFactoryTest0.table = table7;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory9 = null;
        slimTableFactoryTest0.slimTableFactory = slimTableFactory9;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory11 = slimTableFactoryTest0.slimTableFactory;
        fitnesse.testsystems.slim.Table table12 = null;
        slimTableFactoryTest0.settable(table12);
        java.util.Map<java.lang.String, java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable>> strMap14 = slimTableFactoryTest0.map;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory15 = null;
        slimTableFactoryTest0.slimTableFactory = slimTableFactory15;
        // The following exception was thrown during execution in test generation
        try {
            slimTableFactoryTest0.addTableTypeImport("", "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(slimTableFactory3);
        org.junit.Assert.assertNull(strMap4);
        org.junit.Assert.assertNull(slimTableFactory11);
        org.junit.Assert.assertNull(strMap14);
    }

    @Test
    public void test01415() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01415");
        fitnesse.testsystems.slim.tables.SlimTableFactoryTest slimTableFactoryTest0 = new fitnesse.testsystems.slim.tables.SlimTableFactoryTest();
        fitnesse.testsystems.slim.Table table1 = slimTableFactoryTest0.table;
        java.util.Map<java.lang.String, java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable>> strMap2 = slimTableFactoryTest0.getmap();
        fitnesse.testsystems.slim.Table table3 = null;
        slimTableFactoryTest0.table = table3;
        fitnesse.testsystems.slim.Table table5 = null;
        slimTableFactoryTest0.settable(table5);
        java.lang.Class<?> wildcardClass7 = slimTableFactoryTest0.getClass();
        org.junit.Assert.assertNull(table1);
        org.junit.Assert.assertNull(strMap2);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test01416() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01416");
        fitnesse.testsystems.slim.tables.SlimTableFactoryTest slimTableFactoryTest0 = new fitnesse.testsystems.slim.tables.SlimTableFactoryTest();
        fitnesse.testsystems.slim.Table table1 = null;
        slimTableFactoryTest0.table = table1;
        fitnesse.testsystems.slim.Table table3 = null;
        slimTableFactoryTest0.settable(table3);
        java.util.Map<java.lang.String, java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable>> strMap5 = slimTableFactoryTest0.map;
        java.util.Map<java.lang.String, java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable>> strMap6 = slimTableFactoryTest0.getmap();
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory7 = slimTableFactoryTest0.slimTableFactory;
        java.util.Map<java.lang.String, java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable>> strMap8 = slimTableFactoryTest0.map;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory9 = slimTableFactoryTest0.slimTableFactory;
        fitnesse.testsystems.slim.Table table10 = null;
        slimTableFactoryTest0.table = table10;
        org.junit.Assert.assertNull(strMap5);
        org.junit.Assert.assertNull(strMap6);
        org.junit.Assert.assertNull(slimTableFactory7);
        org.junit.Assert.assertNull(strMap8);
        org.junit.Assert.assertNull(slimTableFactory9);
    }

    @Test
    public void test01417() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01417");
        fitnesse.testsystems.slim.tables.SlimTableFactoryTest slimTableFactoryTest0 = new fitnesse.testsystems.slim.tables.SlimTableFactoryTest();
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory1 = slimTableFactoryTest0.slimTableFactory;
        fitnesse.testsystems.slim.Table table2 = null;
        slimTableFactoryTest0.settable(table2);
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory4 = slimTableFactoryTest0.slimTableFactory;
        // The following exception was thrown during execution in test generation
        try {
            slimTableFactoryTest0.tableTypeStartingWithcommentColonShouldReturnNull();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(slimTableFactory1);
        org.junit.Assert.assertNull(slimTableFactory4);
    }

    @Test
    public void test01418() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01418");
        fitnesse.testsystems.slim.tables.SlimTableFactoryTest slimTableFactoryTest0 = new fitnesse.testsystems.slim.tables.SlimTableFactoryTest();
        fitnesse.testsystems.slim.Table table1 = slimTableFactoryTest0.table;
        java.util.Map<java.lang.String, java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable>> strMap2 = slimTableFactoryTest0.getmap();
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory3 = slimTableFactoryTest0.slimTableFactory;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory4 = slimTableFactoryTest0.getslimTableFactory();
        fitnesse.testsystems.slim.Table table5 = slimTableFactoryTest0.table;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory6 = slimTableFactoryTest0.getslimTableFactory();
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory7 = slimTableFactoryTest0.getslimTableFactory();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass8 = slimTableFactory7.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(table1);
        org.junit.Assert.assertNull(strMap2);
        org.junit.Assert.assertNull(slimTableFactory3);
        org.junit.Assert.assertNull(slimTableFactory4);
        org.junit.Assert.assertNull(table5);
        org.junit.Assert.assertNull(slimTableFactory6);
        org.junit.Assert.assertNull(slimTableFactory7);
    }

    @Test
    public void test01419() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01419");
        fitnesse.testsystems.slim.tables.SlimTableFactoryTest slimTableFactoryTest0 = new fitnesse.testsystems.slim.tables.SlimTableFactoryTest();
        fitnesse.testsystems.slim.Table table1 = null;
        slimTableFactoryTest0.table = table1;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory3 = slimTableFactoryTest0.slimTableFactory;
        java.util.Map<java.lang.String, java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable>> strMap4 = slimTableFactoryTest0.getmap();
        fitnesse.testsystems.slim.Table table5 = null;
        slimTableFactoryTest0.settable(table5);
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory7 = null;
        slimTableFactoryTest0.setslimTableFactory(slimTableFactory7);
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory9 = slimTableFactoryTest0.slimTableFactory;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass10 = slimTableFactory9.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(slimTableFactory3);
        org.junit.Assert.assertNull(strMap4);
        org.junit.Assert.assertNull(slimTableFactory9);
    }

    @Test
    public void test01420() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01420");
        fitnesse.testsystems.slim.tables.SlimTableFactoryTest slimTableFactoryTest0 = new fitnesse.testsystems.slim.tables.SlimTableFactoryTest();
        fitnesse.testsystems.slim.Table table1 = null;
        slimTableFactoryTest0.table = table1;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory3 = null;
        slimTableFactoryTest0.slimTableFactory = slimTableFactory3;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory5 = slimTableFactoryTest0.getslimTableFactory();
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory6 = null;
        slimTableFactoryTest0.setslimTableFactory(slimTableFactory6);
        fitnesse.testsystems.slim.Table table8 = null;
        slimTableFactoryTest0.settable(table8);
        java.util.Map<java.lang.String, java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable>> strMap10 = slimTableFactoryTest0.getmap();
        fitnesse.testsystems.slim.Table table11 = null;
        slimTableFactoryTest0.settable(table11);
        fitnesse.testsystems.slim.Table table13 = null;
        slimTableFactoryTest0.settable(table13);
        java.util.Map<java.lang.String, java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable>> strMap15 = slimTableFactoryTest0.getmap();
        // The following exception was thrown during execution in test generation
        try {
            slimTableFactoryTest0.addTableTypeImport("hi!", "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(slimTableFactory5);
        org.junit.Assert.assertNull(strMap10);
        org.junit.Assert.assertNull(strMap15);
    }

    @Test
    public void test01421() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01421");
        fitnesse.testsystems.slim.tables.SlimTableFactoryTest slimTableFactoryTest0 = new fitnesse.testsystems.slim.tables.SlimTableFactoryTest();
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory1 = slimTableFactoryTest0.slimTableFactory;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory2 = slimTableFactoryTest0.slimTableFactory;
        fitnesse.testsystems.slim.Table table3 = slimTableFactoryTest0.gettable();
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory4 = slimTableFactoryTest0.getslimTableFactory();
        java.util.Map<java.lang.String, java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable>> strMap5 = slimTableFactoryTest0.map;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory6 = null;
        slimTableFactoryTest0.slimTableFactory = slimTableFactory6;
        // The following exception was thrown during execution in test generation
        try {
            slimTableFactoryTest0.checkTableTypeDefinesIgnoredIfDifferentSpecified();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(slimTableFactory1);
        org.junit.Assert.assertNull(slimTableFactory2);
        org.junit.Assert.assertNull(table3);
        org.junit.Assert.assertNull(slimTableFactory4);
        org.junit.Assert.assertNull(strMap5);
    }

    @Test
    public void test01422() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01422");
        fitnesse.testsystems.slim.tables.SlimTableFactoryTest slimTableFactoryTest0 = new fitnesse.testsystems.slim.tables.SlimTableFactoryTest();
        fitnesse.testsystems.slim.Table table1 = null;
        slimTableFactoryTest0.table = table1;
        fitnesse.testsystems.slim.Table table3 = null;
        slimTableFactoryTest0.settable(table3);
        fitnesse.testsystems.slim.Table table5 = null;
        slimTableFactoryTest0.settable(table5);
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory7 = slimTableFactoryTest0.slimTableFactory;
        java.util.Map<java.lang.String, java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable>> strMap8 = slimTableFactoryTest0.map;
        fitnesse.testsystems.slim.Table table9 = slimTableFactoryTest0.table;
        java.util.Map<java.lang.String, java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable>> strMap10 = slimTableFactoryTest0.getmap();
        java.util.Map<java.lang.String, java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable>> strMap11 = slimTableFactoryTest0.map;
        fitnesse.testsystems.slim.Table table12 = null;
        slimTableFactoryTest0.table = table12;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory14 = null;
        slimTableFactoryTest0.setslimTableFactory(slimTableFactory14);
        // The following exception was thrown during execution in test generation
        try {
            slimTableFactoryTest0.commentTableShouldReturnNull();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(slimTableFactory7);
        org.junit.Assert.assertNull(strMap8);
        org.junit.Assert.assertNull(table9);
        org.junit.Assert.assertNull(strMap10);
        org.junit.Assert.assertNull(strMap11);
    }

    @Test
    public void test01423() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01423");
        fitnesse.testsystems.slim.tables.SlimTableFactoryTest slimTableFactoryTest0 = new fitnesse.testsystems.slim.tables.SlimTableFactoryTest();
        fitnesse.testsystems.slim.Table table1 = null;
        slimTableFactoryTest0.table = table1;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory3 = slimTableFactoryTest0.slimTableFactory;
        java.util.Map<java.lang.String, java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable>> strMap4 = slimTableFactoryTest0.getmap();
        fitnesse.testsystems.slim.Table table5 = null;
        slimTableFactoryTest0.settable(table5);
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory7 = null;
        slimTableFactoryTest0.setslimTableFactory(slimTableFactory7);
        java.util.Map<java.lang.String, java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable>> strMap9 = slimTableFactoryTest0.getmap();
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory10 = null;
        slimTableFactoryTest0.slimTableFactory = slimTableFactory10;
        fitnesse.testsystems.slim.Table table12 = null;
        slimTableFactoryTest0.settable(table12);
        // The following exception was thrown during execution in test generation
        try {
            slimTableFactoryTest0.checkTableTypeDefineUsedForTable();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(slimTableFactory3);
        org.junit.Assert.assertNull(strMap4);
        org.junit.Assert.assertNull(strMap9);
    }

    @Test
    public void test01424() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01424");
        fitnesse.testsystems.slim.tables.SlimTableFactoryTest slimTableFactoryTest0 = new fitnesse.testsystems.slim.tables.SlimTableFactoryTest();
        fitnesse.testsystems.slim.Table table1 = null;
        slimTableFactoryTest0.table = table1;
        fitnesse.testsystems.slim.Table table3 = null;
        slimTableFactoryTest0.settable(table3);
        java.util.Map<java.lang.String, java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable>> strMap5 = slimTableFactoryTest0.map;
        java.util.Map<java.lang.String, java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable>> strMap6 = slimTableFactoryTest0.getmap();
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory7 = slimTableFactoryTest0.slimTableFactory;
        java.util.Map<java.lang.String, java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable>> strMap8 = slimTableFactoryTest0.map;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory9 = null;
        slimTableFactoryTest0.slimTableFactory = slimTableFactory9;
        fitnesse.testsystems.slim.Table table11 = null;
        slimTableFactoryTest0.table = table11;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory13 = slimTableFactoryTest0.slimTableFactory;
        fitnesse.testsystems.slim.Table table14 = slimTableFactoryTest0.table;
        // The following exception was thrown during execution in test generation
        try {
            slimTableFactoryTest0.checkTableTypeDefineUsedForTable();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(strMap5);
        org.junit.Assert.assertNull(strMap6);
        org.junit.Assert.assertNull(slimTableFactory7);
        org.junit.Assert.assertNull(strMap8);
        org.junit.Assert.assertNull(slimTableFactory13);
        org.junit.Assert.assertNull(table14);
    }

    @Test
    public void test01425() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01425");
        fitnesse.testsystems.slim.tables.SlimTableFactoryTest slimTableFactoryTest0 = new fitnesse.testsystems.slim.tables.SlimTableFactoryTest();
        fitnesse.testsystems.slim.Table table1 = null;
        slimTableFactoryTest0.table = table1;
        fitnesse.testsystems.slim.Table table3 = null;
        slimTableFactoryTest0.settable(table3);
        fitnesse.testsystems.slim.Table table5 = null;
        slimTableFactoryTest0.settable(table5);
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory7 = slimTableFactoryTest0.slimTableFactory;
        fitnesse.testsystems.slim.Table table8 = null;
        slimTableFactoryTest0.settable(table8);
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory10 = null;
        slimTableFactoryTest0.setslimTableFactory(slimTableFactory10);
        fitnesse.testsystems.slim.Table table12 = slimTableFactoryTest0.gettable();
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory13 = null;
        slimTableFactoryTest0.slimTableFactory = slimTableFactory13;
        java.util.Map<java.lang.String, java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable>> strMap15 = slimTableFactoryTest0.getmap();
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory16 = slimTableFactoryTest0.getslimTableFactory();
        // The following exception was thrown during execution in test generation
        try {
            slimTableFactoryTest0.checkTableTypeDefineUsedForTable();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(slimTableFactory7);
        org.junit.Assert.assertNull(table12);
        org.junit.Assert.assertNull(strMap15);
        org.junit.Assert.assertNull(slimTableFactory16);
    }

    @Test
    public void test01426() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01426");
        fitnesse.testsystems.slim.tables.SlimTableFactoryTest slimTableFactoryTest0 = new fitnesse.testsystems.slim.tables.SlimTableFactoryTest();
        fitnesse.testsystems.slim.Table table1 = slimTableFactoryTest0.table;
        java.util.Map<java.lang.String, java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable>> strMap2 = slimTableFactoryTest0.getmap();
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory3 = slimTableFactoryTest0.slimTableFactory;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory4 = slimTableFactoryTest0.slimTableFactory;
        fitnesse.testsystems.slim.Table table5 = slimTableFactoryTest0.gettable();
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory6 = slimTableFactoryTest0.slimTableFactory;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory7 = slimTableFactoryTest0.slimTableFactory;
        fitnesse.testsystems.slim.Table table8 = null;
        slimTableFactoryTest0.settable(table8);
        // The following exception was thrown during execution in test generation
        try {
            slimTableFactoryTest0.checkTableTypeDefineUsedForTable();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(table1);
        org.junit.Assert.assertNull(strMap2);
        org.junit.Assert.assertNull(slimTableFactory3);
        org.junit.Assert.assertNull(slimTableFactory4);
        org.junit.Assert.assertNull(table5);
        org.junit.Assert.assertNull(slimTableFactory6);
        org.junit.Assert.assertNull(slimTableFactory7);
    }

    @Test
    public void test01427() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01427");
        fitnesse.testsystems.slim.tables.SlimTableFactoryTest slimTableFactoryTest0 = new fitnesse.testsystems.slim.tables.SlimTableFactoryTest();
        fitnesse.testsystems.slim.Table table1 = null;
        slimTableFactoryTest0.table = table1;
        fitnesse.testsystems.slim.Table table3 = null;
        slimTableFactoryTest0.settable(table3);
        java.util.Map<java.lang.String, java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable>> strMap5 = slimTableFactoryTest0.map;
        java.util.Map<java.lang.String, java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable>> strMap6 = slimTableFactoryTest0.getmap();
        fitnesse.testsystems.slim.Table table7 = null;
        slimTableFactoryTest0.table = table7;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory9 = slimTableFactoryTest0.slimTableFactory;
        fitnesse.testsystems.slim.Table table10 = slimTableFactoryTest0.table;
        fitnesse.testsystems.slim.Table table11 = null;
        slimTableFactoryTest0.settable(table11);
        // The following exception was thrown during execution in test generation
        try {
            slimTableFactoryTest0.checkTableTypeDefineUsedForTable();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(strMap5);
        org.junit.Assert.assertNull(strMap6);
        org.junit.Assert.assertNull(slimTableFactory9);
        org.junit.Assert.assertNull(table10);
    }

    @Test
    public void test01428() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01428");
        fitnesse.testsystems.slim.tables.SlimTableFactoryTest slimTableFactoryTest0 = new fitnesse.testsystems.slim.tables.SlimTableFactoryTest();
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory1 = slimTableFactoryTest0.slimTableFactory;
        fitnesse.testsystems.slim.Table table2 = slimTableFactoryTest0.table;
        java.util.Map<java.lang.String, java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable>> strMap3 = slimTableFactoryTest0.map;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory4 = null;
        slimTableFactoryTest0.slimTableFactory = slimTableFactory4;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory6 = null;
        slimTableFactoryTest0.slimTableFactory = slimTableFactory6;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory8 = slimTableFactoryTest0.slimTableFactory;
        // The following exception was thrown during execution in test generation
        try {
            slimTableFactoryTest0.tableTypeStartingWithcommentColonShouldReturnNull();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(slimTableFactory1);
        org.junit.Assert.assertNull(table2);
        org.junit.Assert.assertNull(strMap3);
        org.junit.Assert.assertNull(slimTableFactory8);
    }

    @Test
    public void test01429() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01429");
        fitnesse.testsystems.slim.tables.SlimTableFactoryTest slimTableFactoryTest0 = new fitnesse.testsystems.slim.tables.SlimTableFactoryTest();
        fitnesse.testsystems.slim.Table table1 = null;
        slimTableFactoryTest0.table = table1;
        fitnesse.testsystems.slim.Table table3 = null;
        slimTableFactoryTest0.settable(table3);
        fitnesse.testsystems.slim.Table table5 = null;
        slimTableFactoryTest0.settable(table5);
        fitnesse.testsystems.slim.Table table7 = slimTableFactoryTest0.table;
        fitnesse.testsystems.slim.Table table8 = null;
        slimTableFactoryTest0.settable(table8);
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory10 = null;
        slimTableFactoryTest0.slimTableFactory = slimTableFactory10;
        fitnesse.testsystems.slim.Table table12 = null;
        slimTableFactoryTest0.table = table12;
        // The following exception was thrown during execution in test generation
        try {
            slimTableFactoryTest0.addTableTypeImport("hi!", "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(table7);
    }

    @Test
    public void test01430() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01430");
        fitnesse.testsystems.slim.tables.SlimTableFactoryTest slimTableFactoryTest0 = new fitnesse.testsystems.slim.tables.SlimTableFactoryTest();
        fitnesse.testsystems.slim.Table table1 = null;
        slimTableFactoryTest0.table = table1;
        fitnesse.testsystems.slim.Table table3 = null;
        slimTableFactoryTest0.settable(table3);
        fitnesse.testsystems.slim.Table table5 = null;
        slimTableFactoryTest0.settable(table5);
        fitnesse.testsystems.slim.Table table7 = null;
        slimTableFactoryTest0.table = table7;
        fitnesse.testsystems.slim.Table table9 = null;
        slimTableFactoryTest0.table = table9;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory11 = slimTableFactoryTest0.slimTableFactory;
        // The following exception was thrown during execution in test generation
        try {
            slimTableFactoryTest0.shouldCreateCorrectSlimTableForTablesType();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(slimTableFactory11);
    }

    @Test
    public void test01431() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01431");
        fitnesse.testsystems.slim.tables.SlimTableFactoryTest slimTableFactoryTest0 = new fitnesse.testsystems.slim.tables.SlimTableFactoryTest();
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory1 = slimTableFactoryTest0.slimTableFactory;
        fitnesse.testsystems.slim.Table table2 = slimTableFactoryTest0.gettable();
        fitnesse.testsystems.slim.Table table3 = null;
        slimTableFactoryTest0.table = table3;
        fitnesse.testsystems.slim.Table table5 = null;
        slimTableFactoryTest0.table = table5;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory7 = slimTableFactoryTest0.getslimTableFactory();
        java.util.Map<java.lang.String, java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable>> strMap8 = slimTableFactoryTest0.getmap();
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory9 = slimTableFactoryTest0.getslimTableFactory();
        // The following exception was thrown during execution in test generation
        try {
            slimTableFactoryTest0.tableTypeStartingWithcommentColonShouldReturnNull();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(slimTableFactory1);
        org.junit.Assert.assertNull(table2);
        org.junit.Assert.assertNull(slimTableFactory7);
        org.junit.Assert.assertNull(strMap8);
        org.junit.Assert.assertNull(slimTableFactory9);
    }

    @Test
    public void test01432() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01432");
        fitnesse.testsystems.slim.tables.SlimTableFactoryTest slimTableFactoryTest0 = new fitnesse.testsystems.slim.tables.SlimTableFactoryTest();
        fitnesse.testsystems.slim.Table table1 = null;
        slimTableFactoryTest0.table = table1;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory3 = null;
        slimTableFactoryTest0.slimTableFactory = slimTableFactory3;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory5 = slimTableFactoryTest0.getslimTableFactory();
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory6 = null;
        slimTableFactoryTest0.setslimTableFactory(slimTableFactory6);
        fitnesse.testsystems.slim.Table table8 = null;
        slimTableFactoryTest0.settable(table8);
        java.util.Map<java.lang.String, java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable>> strMap10 = slimTableFactoryTest0.getmap();
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory11 = slimTableFactoryTest0.slimTableFactory;
        fitnesse.testsystems.slim.Table table12 = slimTableFactoryTest0.gettable();
        fitnesse.testsystems.slim.Table table13 = null;
        slimTableFactoryTest0.settable(table13);
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory15 = slimTableFactoryTest0.slimTableFactory;
        // The following exception was thrown during execution in test generation
        try {
            slimTableFactoryTest0.checkTableTypeDefinesIgnoredIfDifferentSpecified();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(slimTableFactory5);
        org.junit.Assert.assertNull(strMap10);
        org.junit.Assert.assertNull(slimTableFactory11);
        org.junit.Assert.assertNull(table12);
        org.junit.Assert.assertNull(slimTableFactory15);
    }

    @Test
    public void test01433() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01433");
        fitnesse.testsystems.slim.tables.SlimTableFactoryTest slimTableFactoryTest0 = new fitnesse.testsystems.slim.tables.SlimTableFactoryTest();
        fitnesse.testsystems.slim.Table table1 = null;
        slimTableFactoryTest0.table = table1;
        fitnesse.testsystems.slim.Table table3 = null;
        slimTableFactoryTest0.settable(table3);
        fitnesse.testsystems.slim.Table table5 = null;
        slimTableFactoryTest0.settable(table5);
        fitnesse.testsystems.slim.Table table7 = null;
        slimTableFactoryTest0.table = table7;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory9 = slimTableFactoryTest0.slimTableFactory;
        fitnesse.testsystems.slim.Table table10 = null;
        slimTableFactoryTest0.table = table10;
        java.lang.Class<?> wildcardClass12 = slimTableFactoryTest0.getClass();
        org.junit.Assert.assertNull(slimTableFactory9);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test01434() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01434");
        fitnesse.testsystems.slim.tables.SlimTableFactoryTest slimTableFactoryTest0 = new fitnesse.testsystems.slim.tables.SlimTableFactoryTest();
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory1 = slimTableFactoryTest0.slimTableFactory;
        fitnesse.testsystems.slim.Table table2 = slimTableFactoryTest0.table;
        java.util.Map<java.lang.String, java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable>> strMap3 = slimTableFactoryTest0.map;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory4 = null;
        slimTableFactoryTest0.slimTableFactory = slimTableFactory4;
        fitnesse.testsystems.slim.Table table6 = null;
        slimTableFactoryTest0.table = table6;
        java.util.Map<java.lang.String, java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable>> strMap8 = slimTableFactoryTest0.getmap();
        fitnesse.testsystems.slim.Table table9 = slimTableFactoryTest0.table;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory10 = null;
        slimTableFactoryTest0.slimTableFactory = slimTableFactory10;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory12 = slimTableFactoryTest0.slimTableFactory;
        // The following exception was thrown during execution in test generation
        try {
            slimTableFactoryTest0.shouldCreateCorrectSlimTableForTablesType();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(slimTableFactory1);
        org.junit.Assert.assertNull(table2);
        org.junit.Assert.assertNull(strMap3);
        org.junit.Assert.assertNull(strMap8);
        org.junit.Assert.assertNull(table9);
        org.junit.Assert.assertNull(slimTableFactory12);
    }

    @Test
    public void test01435() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01435");
        fitnesse.testsystems.slim.tables.SlimTableFactoryTest slimTableFactoryTest0 = new fitnesse.testsystems.slim.tables.SlimTableFactoryTest();
        fitnesse.testsystems.slim.Table table1 = null;
        slimTableFactoryTest0.table = table1;
        fitnesse.testsystems.slim.Table table3 = null;
        slimTableFactoryTest0.settable(table3);
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory5 = null;
        slimTableFactoryTest0.setslimTableFactory(slimTableFactory5);
        java.util.Map<java.lang.String, java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable>> strMap7 = slimTableFactoryTest0.map;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory8 = slimTableFactoryTest0.getslimTableFactory();
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory9 = slimTableFactoryTest0.getslimTableFactory();
        // The following exception was thrown during execution in test generation
        try {
            slimTableFactoryTest0.shouldCreateCorrectSlimTableForTablesType();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(strMap7);
        org.junit.Assert.assertNull(slimTableFactory8);
        org.junit.Assert.assertNull(slimTableFactory9);
    }

    @Test
    public void test01436() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01436");
        fitnesse.testsystems.slim.tables.SlimTableFactoryTest slimTableFactoryTest0 = new fitnesse.testsystems.slim.tables.SlimTableFactoryTest();
        fitnesse.testsystems.slim.Table table1 = null;
        slimTableFactoryTest0.table = table1;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory3 = slimTableFactoryTest0.slimTableFactory;
        java.util.Map<java.lang.String, java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable>> strMap4 = slimTableFactoryTest0.getmap();
        fitnesse.testsystems.slim.Table table5 = null;
        slimTableFactoryTest0.settable(table5);
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory7 = null;
        slimTableFactoryTest0.slimTableFactory = slimTableFactory7;
        java.util.Map<java.lang.String, java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable>> strMap9 = slimTableFactoryTest0.getmap();
        java.util.Map<java.lang.String, java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable>> strMap10 = slimTableFactoryTest0.map;
        // The following exception was thrown during execution in test generation
        try {
            slimTableFactoryTest0.checkTableTypeDefineUsedForTable();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(slimTableFactory3);
        org.junit.Assert.assertNull(strMap4);
        org.junit.Assert.assertNull(strMap9);
        org.junit.Assert.assertNull(strMap10);
    }

    @Test
    public void test01437() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01437");
        fitnesse.testsystems.slim.tables.SlimTableFactoryTest slimTableFactoryTest0 = new fitnesse.testsystems.slim.tables.SlimTableFactoryTest();
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory1 = slimTableFactoryTest0.slimTableFactory;
        fitnesse.testsystems.slim.Table table2 = slimTableFactoryTest0.table;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory3 = null;
        slimTableFactoryTest0.setslimTableFactory(slimTableFactory3);
        fitnesse.testsystems.slim.Table table5 = null;
        slimTableFactoryTest0.settable(table5);
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory7 = slimTableFactoryTest0.getslimTableFactory();
        fitnesse.testsystems.slim.Table table8 = null;
        slimTableFactoryTest0.table = table8;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory10 = null;
        slimTableFactoryTest0.slimTableFactory = slimTableFactory10;
        java.lang.Class<?> wildcardClass12 = slimTableFactoryTest0.getClass();
        org.junit.Assert.assertNull(slimTableFactory1);
        org.junit.Assert.assertNull(table2);
        org.junit.Assert.assertNull(slimTableFactory7);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test01438() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01438");
        fitnesse.testsystems.slim.tables.SlimTableFactoryTest slimTableFactoryTest0 = new fitnesse.testsystems.slim.tables.SlimTableFactoryTest();
        fitnesse.testsystems.slim.Table table1 = null;
        slimTableFactoryTest0.table = table1;
        fitnesse.testsystems.slim.Table table3 = null;
        slimTableFactoryTest0.settable(table3);
        java.util.Map<java.lang.String, java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable>> strMap5 = slimTableFactoryTest0.map;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory6 = slimTableFactoryTest0.getslimTableFactory();
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory7 = slimTableFactoryTest0.getslimTableFactory();
        fitnesse.testsystems.slim.Table table8 = slimTableFactoryTest0.gettable();
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory9 = null;
        slimTableFactoryTest0.slimTableFactory = slimTableFactory9;
        fitnesse.testsystems.slim.Table table11 = slimTableFactoryTest0.table;
        java.util.Map<java.lang.String, java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable>> strMap12 = slimTableFactoryTest0.map;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass13 = strMap12.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(strMap5);
        org.junit.Assert.assertNull(slimTableFactory6);
        org.junit.Assert.assertNull(slimTableFactory7);
        org.junit.Assert.assertNull(table8);
        org.junit.Assert.assertNull(table11);
        org.junit.Assert.assertNull(strMap12);
    }

    @Test
    public void test01439() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01439");
        fitnesse.testsystems.slim.tables.SlimTableFactoryTest slimTableFactoryTest0 = new fitnesse.testsystems.slim.tables.SlimTableFactoryTest();
        fitnesse.testsystems.slim.Table table1 = null;
        slimTableFactoryTest0.table = table1;
        fitnesse.testsystems.slim.Table table3 = null;
        slimTableFactoryTest0.settable(table3);
        java.util.Map<java.lang.String, java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable>> strMap5 = slimTableFactoryTest0.map;
        java.util.Map<java.lang.String, java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable>> strMap6 = slimTableFactoryTest0.getmap();
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory7 = slimTableFactoryTest0.slimTableFactory;
        java.util.Map<java.lang.String, java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable>> strMap8 = slimTableFactoryTest0.map;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory9 = slimTableFactoryTest0.slimTableFactory;
        fitnesse.testsystems.slim.Table table10 = null;
        slimTableFactoryTest0.settable(table10);
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory12 = slimTableFactoryTest0.getslimTableFactory();
        // The following exception was thrown during execution in test generation
        try {
            slimTableFactoryTest0.addTableTypeImport("hi!", "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(strMap5);
        org.junit.Assert.assertNull(strMap6);
        org.junit.Assert.assertNull(slimTableFactory7);
        org.junit.Assert.assertNull(strMap8);
        org.junit.Assert.assertNull(slimTableFactory9);
        org.junit.Assert.assertNull(slimTableFactory12);
    }

    @Test
    public void test01440() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01440");
        fitnesse.testsystems.slim.tables.SlimTableFactoryTest slimTableFactoryTest0 = new fitnesse.testsystems.slim.tables.SlimTableFactoryTest();
        fitnesse.testsystems.slim.Table table1 = null;
        slimTableFactoryTest0.table = table1;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory3 = slimTableFactoryTest0.slimTableFactory;
        java.util.Map<java.lang.String, java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable>> strMap4 = slimTableFactoryTest0.map;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory5 = null;
        slimTableFactoryTest0.setslimTableFactory(slimTableFactory5);
        fitnesse.testsystems.slim.Table table7 = slimTableFactoryTest0.gettable();
        // The following exception was thrown during execution in test generation
        try {
            slimTableFactoryTest0.checkTableTypeDefinesIgnoredIfDifferentSpecified();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(slimTableFactory3);
        org.junit.Assert.assertNull(strMap4);
        org.junit.Assert.assertNull(table7);
    }

    @Test
    public void test01441() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01441");
        fitnesse.testsystems.slim.tables.SlimTableFactoryTest slimTableFactoryTest0 = new fitnesse.testsystems.slim.tables.SlimTableFactoryTest();
        fitnesse.testsystems.slim.Table table1 = null;
        slimTableFactoryTest0.table = table1;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory3 = slimTableFactoryTest0.slimTableFactory;
        fitnesse.testsystems.slim.Table table4 = null;
        slimTableFactoryTest0.table = table4;
        java.util.Map<java.lang.String, java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable>> strMap6 = slimTableFactoryTest0.map;
        fitnesse.testsystems.slim.Table table7 = null;
        slimTableFactoryTest0.table = table7;
        java.util.Map<java.lang.String, java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable>> strMap9 = slimTableFactoryTest0.getmap();
        // The following exception was thrown during execution in test generation
        try {
            slimTableFactoryTest0.commentTableShouldReturnNull();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(slimTableFactory3);
        org.junit.Assert.assertNull(strMap6);
        org.junit.Assert.assertNull(strMap9);
    }

    @Test
    public void test01442() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01442");
        fitnesse.testsystems.slim.tables.SlimTableFactoryTest slimTableFactoryTest0 = new fitnesse.testsystems.slim.tables.SlimTableFactoryTest();
        fitnesse.testsystems.slim.Table table1 = null;
        slimTableFactoryTest0.table = table1;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory3 = slimTableFactoryTest0.slimTableFactory;
        java.util.Map<java.lang.String, java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable>> strMap4 = slimTableFactoryTest0.getmap();
        fitnesse.testsystems.slim.Table table5 = null;
        slimTableFactoryTest0.settable(table5);
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory7 = null;
        slimTableFactoryTest0.slimTableFactory = slimTableFactory7;
        java.util.Map<java.lang.String, java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable>> strMap9 = slimTableFactoryTest0.getmap();
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory10 = null;
        slimTableFactoryTest0.setslimTableFactory(slimTableFactory10);
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory12 = null;
        slimTableFactoryTest0.slimTableFactory = slimTableFactory12;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory14 = null;
        slimTableFactoryTest0.setslimTableFactory(slimTableFactory14);
        fitnesse.testsystems.slim.Table table16 = slimTableFactoryTest0.gettable();
        fitnesse.testsystems.slim.Table table17 = null;
        slimTableFactoryTest0.table = table17;
        java.lang.Class<?> wildcardClass19 = slimTableFactoryTest0.getClass();
        org.junit.Assert.assertNull(slimTableFactory3);
        org.junit.Assert.assertNull(strMap4);
        org.junit.Assert.assertNull(strMap9);
        org.junit.Assert.assertNull(table16);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test01443() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01443");
        fitnesse.testsystems.slim.tables.SlimTableFactoryTest slimTableFactoryTest0 = new fitnesse.testsystems.slim.tables.SlimTableFactoryTest();
        fitnesse.testsystems.slim.Table table1 = null;
        slimTableFactoryTest0.table = table1;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory3 = slimTableFactoryTest0.slimTableFactory;
        java.util.Map<java.lang.String, java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable>> strMap4 = slimTableFactoryTest0.map;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory5 = null;
        slimTableFactoryTest0.setslimTableFactory(slimTableFactory5);
        fitnesse.testsystems.slim.Table table7 = null;
        slimTableFactoryTest0.table = table7;
        fitnesse.testsystems.slim.Table table9 = null;
        slimTableFactoryTest0.table = table9;
        // The following exception was thrown during execution in test generation
        try {
            slimTableFactoryTest0.tableTypeStartingWithcommentColonShouldReturnNull();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(slimTableFactory3);
        org.junit.Assert.assertNull(strMap4);
    }

    @Test
    public void test01444() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01444");
        fitnesse.testsystems.slim.tables.SlimTableFactoryTest slimTableFactoryTest0 = new fitnesse.testsystems.slim.tables.SlimTableFactoryTest();
        fitnesse.testsystems.slim.Table table1 = null;
        slimTableFactoryTest0.table = table1;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory3 = slimTableFactoryTest0.getslimTableFactory();
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory4 = slimTableFactoryTest0.getslimTableFactory();
        fitnesse.testsystems.slim.Table table5 = null;
        slimTableFactoryTest0.table = table5;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory7 = slimTableFactoryTest0.slimTableFactory;
        java.util.Map<java.lang.String, java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable>> strMap8 = slimTableFactoryTest0.map;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory9 = null;
        slimTableFactoryTest0.slimTableFactory = slimTableFactory9;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory11 = null;
        slimTableFactoryTest0.slimTableFactory = slimTableFactory11;
        // The following exception was thrown during execution in test generation
        try {
            slimTableFactoryTest0.shouldCreateCorrectSlimTableForTablesType();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(slimTableFactory3);
        org.junit.Assert.assertNull(slimTableFactory4);
        org.junit.Assert.assertNull(slimTableFactory7);
        org.junit.Assert.assertNull(strMap8);
    }

    @Test
    public void test01445() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01445");
        fitnesse.testsystems.slim.tables.SlimTableFactoryTest slimTableFactoryTest0 = new fitnesse.testsystems.slim.tables.SlimTableFactoryTest();
        fitnesse.testsystems.slim.Table table1 = slimTableFactoryTest0.table;
        java.util.Map<java.lang.String, java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable>> strMap2 = slimTableFactoryTest0.map;
        fitnesse.testsystems.slim.Table table3 = null;
        slimTableFactoryTest0.table = table3;
        // The following exception was thrown during execution in test generation
        try {
            slimTableFactoryTest0.checkTableTypeDefineUsedForTable();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(table1);
        org.junit.Assert.assertNull(strMap2);
    }

    @Test
    public void test01446() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01446");
        fitnesse.testsystems.slim.tables.SlimTableFactoryTest slimTableFactoryTest0 = new fitnesse.testsystems.slim.tables.SlimTableFactoryTest();
        fitnesse.testsystems.slim.Table table1 = slimTableFactoryTest0.table;
        java.util.Map<java.lang.String, java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable>> strMap2 = slimTableFactoryTest0.getmap();
        java.util.Map<java.lang.String, java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable>> strMap3 = slimTableFactoryTest0.getmap();
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory4 = slimTableFactoryTest0.slimTableFactory;
        fitnesse.testsystems.slim.Table table5 = null;
        slimTableFactoryTest0.settable(table5);
        fitnesse.testsystems.slim.Table table7 = slimTableFactoryTest0.gettable();
        // The following exception was thrown during execution in test generation
        try {
            slimTableFactoryTest0.tableTypeStartingWithcommentColonShouldReturnNull();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(table1);
        org.junit.Assert.assertNull(strMap2);
        org.junit.Assert.assertNull(strMap3);
        org.junit.Assert.assertNull(slimTableFactory4);
        org.junit.Assert.assertNull(table7);
    }

    @Test
    public void test01447() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01447");
        fitnesse.testsystems.slim.tables.SlimTableFactoryTest slimTableFactoryTest0 = new fitnesse.testsystems.slim.tables.SlimTableFactoryTest();
        fitnesse.testsystems.slim.Table table1 = null;
        slimTableFactoryTest0.table = table1;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory3 = null;
        slimTableFactoryTest0.slimTableFactory = slimTableFactory3;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory5 = slimTableFactoryTest0.getslimTableFactory();
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory6 = null;
        slimTableFactoryTest0.setslimTableFactory(slimTableFactory6);
        fitnesse.testsystems.slim.Table table8 = null;
        slimTableFactoryTest0.settable(table8);
        java.util.Map<java.lang.String, java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable>> strMap10 = slimTableFactoryTest0.getmap();
        fitnesse.testsystems.slim.Table table11 = null;
        slimTableFactoryTest0.settable(table11);
        fitnesse.testsystems.slim.Table table13 = slimTableFactoryTest0.table;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory14 = slimTableFactoryTest0.slimTableFactory;
        org.junit.Assert.assertNull(slimTableFactory5);
        org.junit.Assert.assertNull(strMap10);
        org.junit.Assert.assertNull(table13);
        org.junit.Assert.assertNull(slimTableFactory14);
    }

    @Test
    public void test01448() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01448");
        fitnesse.testsystems.slim.tables.SlimTableFactoryTest slimTableFactoryTest0 = new fitnesse.testsystems.slim.tables.SlimTableFactoryTest();
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory1 = slimTableFactoryTest0.slimTableFactory;
        fitnesse.testsystems.slim.Table table2 = slimTableFactoryTest0.gettable();
        fitnesse.testsystems.slim.Table table3 = null;
        slimTableFactoryTest0.table = table3;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory5 = null;
        slimTableFactoryTest0.setslimTableFactory(slimTableFactory5);
        fitnesse.testsystems.slim.Table table7 = slimTableFactoryTest0.table;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory8 = slimTableFactoryTest0.getslimTableFactory();
        // The following exception was thrown during execution in test generation
        try {
            slimTableFactoryTest0.addTableTypeImport("", "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(slimTableFactory1);
        org.junit.Assert.assertNull(table2);
        org.junit.Assert.assertNull(table7);
        org.junit.Assert.assertNull(slimTableFactory8);
    }

    @Test
    public void test01449() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01449");
        fitnesse.testsystems.slim.tables.SlimTableFactoryTest slimTableFactoryTest0 = new fitnesse.testsystems.slim.tables.SlimTableFactoryTest();
        fitnesse.testsystems.slim.Table table1 = null;
        slimTableFactoryTest0.table = table1;
        fitnesse.testsystems.slim.Table table3 = null;
        slimTableFactoryTest0.settable(table3);
        java.util.Map<java.lang.String, java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable>> strMap5 = slimTableFactoryTest0.map;
        java.util.Map<java.lang.String, java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable>> strMap6 = slimTableFactoryTest0.getmap();
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory7 = slimTableFactoryTest0.slimTableFactory;
        java.util.Map<java.lang.String, java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable>> strMap8 = slimTableFactoryTest0.map;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory9 = slimTableFactoryTest0.slimTableFactory;
        fitnesse.testsystems.slim.Table table10 = null;
        slimTableFactoryTest0.settable(table10);
        fitnesse.testsystems.slim.Table table12 = slimTableFactoryTest0.gettable();
        java.util.Map<java.lang.String, java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable>> strMap13 = slimTableFactoryTest0.map;
        // The following exception was thrown during execution in test generation
        try {
            slimTableFactoryTest0.tableTypeStartingWithcommentColonShouldReturnNull();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(strMap5);
        org.junit.Assert.assertNull(strMap6);
        org.junit.Assert.assertNull(slimTableFactory7);
        org.junit.Assert.assertNull(strMap8);
        org.junit.Assert.assertNull(slimTableFactory9);
        org.junit.Assert.assertNull(table12);
        org.junit.Assert.assertNull(strMap13);
    }

    @Test
    public void test01450() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01450");
        fitnesse.testsystems.slim.tables.SlimTableFactoryTest slimTableFactoryTest0 = new fitnesse.testsystems.slim.tables.SlimTableFactoryTest();
        fitnesse.testsystems.slim.Table table1 = null;
        slimTableFactoryTest0.table = table1;
        fitnesse.testsystems.slim.Table table3 = null;
        slimTableFactoryTest0.settable(table3);
        fitnesse.testsystems.slim.Table table5 = null;
        slimTableFactoryTest0.settable(table5);
        fitnesse.testsystems.slim.Table table7 = slimTableFactoryTest0.table;
        fitnesse.testsystems.slim.Table table8 = null;
        slimTableFactoryTest0.settable(table8);
        java.util.Map<java.lang.String, java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable>> strMap10 = slimTableFactoryTest0.getmap();
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory11 = slimTableFactoryTest0.slimTableFactory;
        fitnesse.testsystems.slim.Table table12 = null;
        slimTableFactoryTest0.settable(table12);
        // The following exception was thrown during execution in test generation
        try {
            slimTableFactoryTest0.shouldCreateCorrectSlimTableForTablesType();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(table7);
        org.junit.Assert.assertNull(strMap10);
        org.junit.Assert.assertNull(slimTableFactory11);
    }

    @Test
    public void test01451() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01451");
        fitnesse.testsystems.slim.tables.SlimTableFactoryTest slimTableFactoryTest0 = new fitnesse.testsystems.slim.tables.SlimTableFactoryTest();
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory1 = slimTableFactoryTest0.slimTableFactory;
        fitnesse.testsystems.slim.Table table2 = slimTableFactoryTest0.gettable();
        fitnesse.testsystems.slim.Table table3 = null;
        slimTableFactoryTest0.table = table3;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory5 = null;
        slimTableFactoryTest0.setslimTableFactory(slimTableFactory5);
        java.util.Map<java.lang.String, java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable>> strMap7 = slimTableFactoryTest0.map;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory8 = slimTableFactoryTest0.slimTableFactory;
        fitnesse.testsystems.slim.Table table9 = null;
        slimTableFactoryTest0.table = table9;
        java.util.Map<java.lang.String, java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable>> strMap11 = slimTableFactoryTest0.map;
        // The following exception was thrown during execution in test generation
        try {
            slimTableFactoryTest0.checkTableTypeDefinesIgnoredIfDifferentSpecified();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(slimTableFactory1);
        org.junit.Assert.assertNull(table2);
        org.junit.Assert.assertNull(strMap7);
        org.junit.Assert.assertNull(slimTableFactory8);
        org.junit.Assert.assertNull(strMap11);
    }

    @Test
    public void test01452() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01452");
        fitnesse.testsystems.slim.tables.SlimTableFactoryTest slimTableFactoryTest0 = new fitnesse.testsystems.slim.tables.SlimTableFactoryTest();
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory1 = slimTableFactoryTest0.slimTableFactory;
        fitnesse.testsystems.slim.Table table2 = slimTableFactoryTest0.gettable();
        fitnesse.testsystems.slim.Table table3 = null;
        slimTableFactoryTest0.table = table3;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory5 = null;
        slimTableFactoryTest0.setslimTableFactory(slimTableFactory5);
        // The following exception was thrown during execution in test generation
        try {
            slimTableFactoryTest0.checkTableTypeDefinesIgnoredIfDifferentSpecified();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(slimTableFactory1);
        org.junit.Assert.assertNull(table2);
    }

    @Test
    public void test01453() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01453");
        fitnesse.testsystems.slim.tables.SlimTableFactoryTest slimTableFactoryTest0 = new fitnesse.testsystems.slim.tables.SlimTableFactoryTest();
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory1 = slimTableFactoryTest0.slimTableFactory;
        fitnesse.testsystems.slim.Table table2 = slimTableFactoryTest0.gettable();
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory3 = null;
        slimTableFactoryTest0.slimTableFactory = slimTableFactory3;
        fitnesse.testsystems.slim.Table table5 = null;
        slimTableFactoryTest0.settable(table5);
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory7 = slimTableFactoryTest0.slimTableFactory;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory8 = slimTableFactoryTest0.getslimTableFactory();
        fitnesse.testsystems.slim.Table table9 = null;
        slimTableFactoryTest0.table = table9;
        fitnesse.testsystems.slim.Table table11 = slimTableFactoryTest0.table;
        fitnesse.testsystems.slim.Table table12 = null;
        slimTableFactoryTest0.table = table12;
        java.lang.Class<?> wildcardClass14 = slimTableFactoryTest0.getClass();
        org.junit.Assert.assertNull(slimTableFactory1);
        org.junit.Assert.assertNull(table2);
        org.junit.Assert.assertNull(slimTableFactory7);
        org.junit.Assert.assertNull(slimTableFactory8);
        org.junit.Assert.assertNull(table11);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test01454() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01454");
        fitnesse.testsystems.slim.tables.SlimTableFactoryTest slimTableFactoryTest0 = new fitnesse.testsystems.slim.tables.SlimTableFactoryTest();
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory1 = slimTableFactoryTest0.slimTableFactory;
        fitnesse.testsystems.slim.Table table2 = slimTableFactoryTest0.gettable();
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory3 = null;
        slimTableFactoryTest0.slimTableFactory = slimTableFactory3;
        fitnesse.testsystems.slim.Table table5 = null;
        slimTableFactoryTest0.settable(table5);
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory7 = slimTableFactoryTest0.slimTableFactory;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory8 = slimTableFactoryTest0.getslimTableFactory();
        fitnesse.testsystems.slim.Table table9 = slimTableFactoryTest0.table;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory10 = null;
        slimTableFactoryTest0.setslimTableFactory(slimTableFactory10);
        // The following exception was thrown during execution in test generation
        try {
            slimTableFactoryTest0.tableTypeStartingWithcommentColonShouldReturnNull();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(slimTableFactory1);
        org.junit.Assert.assertNull(table2);
        org.junit.Assert.assertNull(slimTableFactory7);
        org.junit.Assert.assertNull(slimTableFactory8);
        org.junit.Assert.assertNull(table9);
    }

    @Test
    public void test01455() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01455");
        fitnesse.testsystems.slim.tables.SlimTableFactoryTest slimTableFactoryTest0 = new fitnesse.testsystems.slim.tables.SlimTableFactoryTest();
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory1 = slimTableFactoryTest0.slimTableFactory;
        fitnesse.testsystems.slim.Table table2 = slimTableFactoryTest0.table;
        java.util.Map<java.lang.String, java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable>> strMap3 = slimTableFactoryTest0.map;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory4 = null;
        slimTableFactoryTest0.slimTableFactory = slimTableFactory4;
        fitnesse.testsystems.slim.Table table6 = null;
        slimTableFactoryTest0.table = table6;
        java.util.Map<java.lang.String, java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable>> strMap8 = slimTableFactoryTest0.getmap();
        java.util.Map<java.lang.String, java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable>> strMap9 = slimTableFactoryTest0.map;
        fitnesse.testsystems.slim.Table table10 = slimTableFactoryTest0.table;
        // The following exception was thrown during execution in test generation
        try {
            slimTableFactoryTest0.shouldCreateCorrectSlimTableForTablesType();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(slimTableFactory1);
        org.junit.Assert.assertNull(table2);
        org.junit.Assert.assertNull(strMap3);
        org.junit.Assert.assertNull(strMap8);
        org.junit.Assert.assertNull(strMap9);
        org.junit.Assert.assertNull(table10);
    }

    @Test
    public void test01456() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01456");
        fitnesse.testsystems.slim.tables.SlimTableFactoryTest slimTableFactoryTest0 = new fitnesse.testsystems.slim.tables.SlimTableFactoryTest();
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory1 = slimTableFactoryTest0.slimTableFactory;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory2 = slimTableFactoryTest0.slimTableFactory;
        fitnesse.testsystems.slim.Table table3 = slimTableFactoryTest0.gettable();
        fitnesse.testsystems.slim.Table table4 = slimTableFactoryTest0.gettable();
        fitnesse.testsystems.slim.Table table5 = slimTableFactoryTest0.gettable();
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory6 = slimTableFactoryTest0.slimTableFactory;
        fitnesse.testsystems.slim.Table table7 = null;
        slimTableFactoryTest0.settable(table7);
        fitnesse.testsystems.slim.Table table9 = null;
        slimTableFactoryTest0.settable(table9);
        java.util.Map<java.lang.String, java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable>> strMap11 = slimTableFactoryTest0.map;
        java.util.Map<java.lang.String, java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable>> strMap12 = slimTableFactoryTest0.map;
        // The following exception was thrown during execution in test generation
        try {
            slimTableFactoryTest0.checkTableTypeDefinesIgnoredIfDifferentSpecified();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(slimTableFactory1);
        org.junit.Assert.assertNull(slimTableFactory2);
        org.junit.Assert.assertNull(table3);
        org.junit.Assert.assertNull(table4);
        org.junit.Assert.assertNull(table5);
        org.junit.Assert.assertNull(slimTableFactory6);
        org.junit.Assert.assertNull(strMap11);
        org.junit.Assert.assertNull(strMap12);
    }

    @Test
    public void test01457() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01457");
        fitnesse.testsystems.slim.tables.SlimTableFactoryTest slimTableFactoryTest0 = new fitnesse.testsystems.slim.tables.SlimTableFactoryTest();
        fitnesse.testsystems.slim.Table table1 = null;
        slimTableFactoryTest0.table = table1;
        fitnesse.testsystems.slim.Table table3 = slimTableFactoryTest0.table;
        fitnesse.testsystems.slim.Table table4 = slimTableFactoryTest0.gettable();
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory5 = slimTableFactoryTest0.slimTableFactory;
        fitnesse.testsystems.slim.Table table6 = null;
        slimTableFactoryTest0.settable(table6);
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory8 = null;
        slimTableFactoryTest0.slimTableFactory = slimTableFactory8;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory10 = null;
        slimTableFactoryTest0.slimTableFactory = slimTableFactory10;
        // The following exception was thrown during execution in test generation
        try {
            slimTableFactoryTest0.commentTableShouldReturnNull();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(table3);
        org.junit.Assert.assertNull(table4);
        org.junit.Assert.assertNull(slimTableFactory5);
    }

    @Test
    public void test01458() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01458");
        fitnesse.testsystems.slim.tables.SlimTableFactoryTest slimTableFactoryTest0 = new fitnesse.testsystems.slim.tables.SlimTableFactoryTest();
        fitnesse.testsystems.slim.Table table1 = null;
        slimTableFactoryTest0.table = table1;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory3 = slimTableFactoryTest0.getslimTableFactory();
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory4 = slimTableFactoryTest0.getslimTableFactory();
        fitnesse.testsystems.slim.Table table5 = null;
        slimTableFactoryTest0.table = table5;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory7 = slimTableFactoryTest0.slimTableFactory;
        java.util.Map<java.lang.String, java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable>> strMap8 = slimTableFactoryTest0.map;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory9 = null;
        slimTableFactoryTest0.setslimTableFactory(slimTableFactory9);
        java.util.Map<java.lang.String, java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable>> strMap11 = slimTableFactoryTest0.getmap();
        // The following exception was thrown during execution in test generation
        try {
            slimTableFactoryTest0.tableTypeStartingWithcommentColonShouldReturnNull();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(slimTableFactory3);
        org.junit.Assert.assertNull(slimTableFactory4);
        org.junit.Assert.assertNull(slimTableFactory7);
        org.junit.Assert.assertNull(strMap8);
        org.junit.Assert.assertNull(strMap11);
    }

    @Test
    public void test01459() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01459");
        fitnesse.testsystems.slim.tables.SlimTableFactoryTest slimTableFactoryTest0 = new fitnesse.testsystems.slim.tables.SlimTableFactoryTest();
        fitnesse.testsystems.slim.Table table1 = slimTableFactoryTest0.table;
        java.util.Map<java.lang.String, java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable>> strMap2 = slimTableFactoryTest0.getmap();
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory3 = null;
        slimTableFactoryTest0.slimTableFactory = slimTableFactory3;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory5 = slimTableFactoryTest0.slimTableFactory;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory6 = null;
        slimTableFactoryTest0.setslimTableFactory(slimTableFactory6);
        // The following exception was thrown during execution in test generation
        try {
            slimTableFactoryTest0.addTableTypeImport("hi!", "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(table1);
        org.junit.Assert.assertNull(strMap2);
        org.junit.Assert.assertNull(slimTableFactory5);
    }

    @Test
    public void test01460() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01460");
        fitnesse.testsystems.slim.tables.SlimTableFactoryTest slimTableFactoryTest0 = new fitnesse.testsystems.slim.tables.SlimTableFactoryTest();
        fitnesse.testsystems.slim.Table table1 = null;
        slimTableFactoryTest0.table = table1;
        fitnesse.testsystems.slim.Table table3 = null;
        slimTableFactoryTest0.settable(table3);
        java.util.Map<java.lang.String, java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable>> strMap5 = slimTableFactoryTest0.map;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory6 = slimTableFactoryTest0.getslimTableFactory();
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory7 = slimTableFactoryTest0.getslimTableFactory();
        java.util.Map<java.lang.String, java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable>> strMap8 = slimTableFactoryTest0.getmap();
        java.util.Map<java.lang.String, java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable>> strMap9 = slimTableFactoryTest0.getmap();
        fitnesse.testsystems.slim.Table table10 = slimTableFactoryTest0.table;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory11 = null;
        slimTableFactoryTest0.setslimTableFactory(slimTableFactory11);
        fitnesse.testsystems.slim.Table table13 = slimTableFactoryTest0.gettable();
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory14 = slimTableFactoryTest0.getslimTableFactory();
        java.util.Map<java.lang.String, java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable>> strMap15 = slimTableFactoryTest0.getmap();
        org.junit.Assert.assertNull(strMap5);
        org.junit.Assert.assertNull(slimTableFactory6);
        org.junit.Assert.assertNull(slimTableFactory7);
        org.junit.Assert.assertNull(strMap8);
        org.junit.Assert.assertNull(strMap9);
        org.junit.Assert.assertNull(table10);
        org.junit.Assert.assertNull(table13);
        org.junit.Assert.assertNull(slimTableFactory14);
        org.junit.Assert.assertNull(strMap15);
    }

    @Test
    public void test01461() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01461");
        fitnesse.testsystems.slim.tables.SlimTableFactoryTest slimTableFactoryTest0 = new fitnesse.testsystems.slim.tables.SlimTableFactoryTest();
        fitnesse.testsystems.slim.Table table1 = null;
        slimTableFactoryTest0.table = table1;
        fitnesse.testsystems.slim.Table table3 = null;
        slimTableFactoryTest0.settable(table3);
        fitnesse.testsystems.slim.Table table5 = null;
        slimTableFactoryTest0.settable(table5);
        fitnesse.testsystems.slim.Table table7 = slimTableFactoryTest0.table;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory8 = null;
        slimTableFactoryTest0.setslimTableFactory(slimTableFactory8);
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory10 = null;
        slimTableFactoryTest0.slimTableFactory = slimTableFactory10;
        java.util.Map<java.lang.String, java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable>> strMap12 = slimTableFactoryTest0.map;
        java.lang.Class<?> wildcardClass13 = slimTableFactoryTest0.getClass();
        org.junit.Assert.assertNull(table7);
        org.junit.Assert.assertNull(strMap12);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test01462() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01462");
        fitnesse.testsystems.slim.tables.SlimTableFactoryTest slimTableFactoryTest0 = new fitnesse.testsystems.slim.tables.SlimTableFactoryTest();
        fitnesse.testsystems.slim.Table table1 = null;
        slimTableFactoryTest0.table = table1;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory3 = null;
        slimTableFactoryTest0.slimTableFactory = slimTableFactory3;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory5 = slimTableFactoryTest0.getslimTableFactory();
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory6 = slimTableFactoryTest0.slimTableFactory;
        fitnesse.testsystems.slim.Table table7 = slimTableFactoryTest0.table;
        java.lang.Class<?> wildcardClass8 = slimTableFactoryTest0.getClass();
        org.junit.Assert.assertNull(slimTableFactory5);
        org.junit.Assert.assertNull(slimTableFactory6);
        org.junit.Assert.assertNull(table7);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test01463() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01463");
        fitnesse.testsystems.slim.tables.SlimTableFactoryTest slimTableFactoryTest0 = new fitnesse.testsystems.slim.tables.SlimTableFactoryTest();
        fitnesse.testsystems.slim.Table table1 = null;
        slimTableFactoryTest0.table = table1;
        fitnesse.testsystems.slim.Table table3 = null;
        slimTableFactoryTest0.settable(table3);
        fitnesse.testsystems.slim.Table table5 = slimTableFactoryTest0.table;
        java.util.Map<java.lang.String, java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable>> strMap6 = slimTableFactoryTest0.getmap();
        fitnesse.testsystems.slim.Table table7 = null;
        slimTableFactoryTest0.table = table7;
        // The following exception was thrown during execution in test generation
        try {
            slimTableFactoryTest0.commentTableShouldReturnNull();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(table5);
        org.junit.Assert.assertNull(strMap6);
    }

    @Test
    public void test01464() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01464");
        fitnesse.testsystems.slim.tables.SlimTableFactoryTest slimTableFactoryTest0 = new fitnesse.testsystems.slim.tables.SlimTableFactoryTest();
        fitnesse.testsystems.slim.Table table1 = null;
        slimTableFactoryTest0.table = table1;
        fitnesse.testsystems.slim.Table table3 = null;
        slimTableFactoryTest0.settable(table3);
        java.util.Map<java.lang.String, java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable>> strMap5 = slimTableFactoryTest0.map;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory6 = slimTableFactoryTest0.getslimTableFactory();
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory7 = slimTableFactoryTest0.getslimTableFactory();
        java.util.Map<java.lang.String, java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable>> strMap8 = slimTableFactoryTest0.getmap();
        java.util.Map<java.lang.String, java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable>> strMap9 = slimTableFactoryTest0.getmap();
        // The following exception was thrown during execution in test generation
        try {
            slimTableFactoryTest0.addTableTypeImport("", "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(strMap5);
        org.junit.Assert.assertNull(slimTableFactory6);
        org.junit.Assert.assertNull(slimTableFactory7);
        org.junit.Assert.assertNull(strMap8);
        org.junit.Assert.assertNull(strMap9);
    }

    @Test
    public void test01465() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01465");
        fitnesse.testsystems.slim.tables.SlimTableFactoryTest slimTableFactoryTest0 = new fitnesse.testsystems.slim.tables.SlimTableFactoryTest();
        fitnesse.testsystems.slim.Table table1 = null;
        slimTableFactoryTest0.table = table1;
        fitnesse.testsystems.slim.Table table3 = null;
        slimTableFactoryTest0.settable(table3);
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory5 = null;
        slimTableFactoryTest0.setslimTableFactory(slimTableFactory5);
        java.util.Map<java.lang.String, java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable>> strMap7 = slimTableFactoryTest0.map;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory8 = null;
        slimTableFactoryTest0.slimTableFactory = slimTableFactory8;
        fitnesse.testsystems.slim.Table table10 = null;
        slimTableFactoryTest0.table = table10;
        // The following exception was thrown during execution in test generation
        try {
            slimTableFactoryTest0.checkTableTypeDefinesIgnoredIfDifferentSpecified();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(strMap7);
    }

    @Test
    public void test01466() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01466");
        fitnesse.testsystems.slim.tables.SlimTableFactoryTest slimTableFactoryTest0 = new fitnesse.testsystems.slim.tables.SlimTableFactoryTest();
        fitnesse.testsystems.slim.Table table1 = null;
        slimTableFactoryTest0.table = table1;
        fitnesse.testsystems.slim.Table table3 = null;
        slimTableFactoryTest0.settable(table3);
        java.util.Map<java.lang.String, java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable>> strMap5 = slimTableFactoryTest0.map;
        java.util.Map<java.lang.String, java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable>> strMap6 = slimTableFactoryTest0.getmap();
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory7 = slimTableFactoryTest0.slimTableFactory;
        fitnesse.testsystems.slim.Table table8 = slimTableFactoryTest0.gettable();
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory9 = null;
        slimTableFactoryTest0.slimTableFactory = slimTableFactory9;
        // The following exception was thrown during execution in test generation
        try {
            slimTableFactoryTest0.checkTableTypeDefineUsedForTable();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(strMap5);
        org.junit.Assert.assertNull(strMap6);
        org.junit.Assert.assertNull(slimTableFactory7);
        org.junit.Assert.assertNull(table8);
    }

    @Test
    public void test01467() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01467");
        fitnesse.testsystems.slim.tables.SlimTableFactoryTest slimTableFactoryTest0 = new fitnesse.testsystems.slim.tables.SlimTableFactoryTest();
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory1 = slimTableFactoryTest0.slimTableFactory;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory2 = slimTableFactoryTest0.slimTableFactory;
        fitnesse.testsystems.slim.Table table3 = slimTableFactoryTest0.gettable();
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory4 = slimTableFactoryTest0.getslimTableFactory();
        fitnesse.testsystems.slim.Table table5 = null;
        slimTableFactoryTest0.table = table5;
        java.util.Map<java.lang.String, java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable>> strMap7 = slimTableFactoryTest0.getmap();
        fitnesse.testsystems.slim.Table table8 = slimTableFactoryTest0.table;
        // The following exception was thrown during execution in test generation
        try {
            slimTableFactoryTest0.addTableTypeImport("", "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(slimTableFactory1);
        org.junit.Assert.assertNull(slimTableFactory2);
        org.junit.Assert.assertNull(table3);
        org.junit.Assert.assertNull(slimTableFactory4);
        org.junit.Assert.assertNull(strMap7);
        org.junit.Assert.assertNull(table8);
    }

    @Test
    public void test01468() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01468");
        fitnesse.testsystems.slim.tables.SlimTableFactoryTest slimTableFactoryTest0 = new fitnesse.testsystems.slim.tables.SlimTableFactoryTest();
        fitnesse.testsystems.slim.Table table1 = null;
        slimTableFactoryTest0.table = table1;
        fitnesse.testsystems.slim.Table table3 = null;
        slimTableFactoryTest0.settable(table3);
        fitnesse.testsystems.slim.Table table5 = null;
        slimTableFactoryTest0.settable(table5);
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory7 = slimTableFactoryTest0.slimTableFactory;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory8 = null;
        slimTableFactoryTest0.slimTableFactory = slimTableFactory8;
        java.util.Map<java.lang.String, java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable>> strMap10 = slimTableFactoryTest0.map;
        fitnesse.testsystems.slim.Table table11 = slimTableFactoryTest0.gettable();
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory12 = null;
        slimTableFactoryTest0.setslimTableFactory(slimTableFactory12);
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory14 = slimTableFactoryTest0.getslimTableFactory();
        java.lang.Class<?> wildcardClass15 = slimTableFactoryTest0.getClass();
        org.junit.Assert.assertNull(slimTableFactory7);
        org.junit.Assert.assertNull(strMap10);
        org.junit.Assert.assertNull(table11);
        org.junit.Assert.assertNull(slimTableFactory14);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test01469() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01469");
        fitnesse.testsystems.slim.tables.SlimTableFactoryTest slimTableFactoryTest0 = new fitnesse.testsystems.slim.tables.SlimTableFactoryTest();
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory1 = slimTableFactoryTest0.slimTableFactory;
        fitnesse.testsystems.slim.Table table2 = slimTableFactoryTest0.gettable();
        fitnesse.testsystems.slim.Table table3 = null;
        slimTableFactoryTest0.table = table3;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory5 = slimTableFactoryTest0.getslimTableFactory();
        fitnesse.testsystems.slim.Table table6 = slimTableFactoryTest0.gettable();
        // The following exception was thrown during execution in test generation
        try {
            slimTableFactoryTest0.shouldCreateCorrectSlimTableForTablesType();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(slimTableFactory1);
        org.junit.Assert.assertNull(table2);
        org.junit.Assert.assertNull(slimTableFactory5);
        org.junit.Assert.assertNull(table6);
    }

    @Test
    public void test01470() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01470");
        fitnesse.testsystems.slim.tables.SlimTableFactoryTest slimTableFactoryTest0 = new fitnesse.testsystems.slim.tables.SlimTableFactoryTest();
        fitnesse.testsystems.slim.Table table1 = null;
        slimTableFactoryTest0.table = table1;
        fitnesse.testsystems.slim.Table table3 = slimTableFactoryTest0.gettable();
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory4 = slimTableFactoryTest0.getslimTableFactory();
        // The following exception was thrown during execution in test generation
        try {
            slimTableFactoryTest0.checkTableTypeDefineUsedForTable();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(table3);
        org.junit.Assert.assertNull(slimTableFactory4);
    }

    @Test
    public void test01471() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01471");
        fitnesse.testsystems.slim.tables.SlimTableFactoryTest slimTableFactoryTest0 = new fitnesse.testsystems.slim.tables.SlimTableFactoryTest();
        fitnesse.testsystems.slim.Table table1 = null;
        slimTableFactoryTest0.table = table1;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory3 = slimTableFactoryTest0.slimTableFactory;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory4 = null;
        slimTableFactoryTest0.slimTableFactory = slimTableFactory4;
        fitnesse.testsystems.slim.Table table6 = slimTableFactoryTest0.gettable();
        fitnesse.testsystems.slim.Table table7 = null;
        slimTableFactoryTest0.table = table7;
        fitnesse.testsystems.slim.Table table9 = slimTableFactoryTest0.gettable();
        // The following exception was thrown during execution in test generation
        try {
            slimTableFactoryTest0.tableTypeStartingWithcommentColonShouldReturnNull();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(slimTableFactory3);
        org.junit.Assert.assertNull(table6);
        org.junit.Assert.assertNull(table9);
    }

    @Test
    public void test01472() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01472");
        fitnesse.testsystems.slim.tables.SlimTableFactoryTest slimTableFactoryTest0 = new fitnesse.testsystems.slim.tables.SlimTableFactoryTest();
        fitnesse.testsystems.slim.Table table1 = null;
        slimTableFactoryTest0.table = table1;
        fitnesse.testsystems.slim.Table table3 = null;
        slimTableFactoryTest0.settable(table3);
        java.util.Map<java.lang.String, java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable>> strMap5 = slimTableFactoryTest0.map;
        java.util.Map<java.lang.String, java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable>> strMap6 = slimTableFactoryTest0.getmap();
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory7 = slimTableFactoryTest0.slimTableFactory;
        fitnesse.testsystems.slim.Table table8 = slimTableFactoryTest0.table;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory9 = slimTableFactoryTest0.getslimTableFactory();
        // The following exception was thrown during execution in test generation
        try {
            slimTableFactoryTest0.addTableTypeImport("", "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(strMap5);
        org.junit.Assert.assertNull(strMap6);
        org.junit.Assert.assertNull(slimTableFactory7);
        org.junit.Assert.assertNull(table8);
        org.junit.Assert.assertNull(slimTableFactory9);
    }

    @Test
    public void test01473() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01473");
        fitnesse.testsystems.slim.tables.SlimTableFactoryTest slimTableFactoryTest0 = new fitnesse.testsystems.slim.tables.SlimTableFactoryTest();
        fitnesse.testsystems.slim.Table table1 = null;
        slimTableFactoryTest0.table = table1;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory3 = slimTableFactoryTest0.slimTableFactory;
        java.util.Map<java.lang.String, java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable>> strMap4 = slimTableFactoryTest0.getmap();
        fitnesse.testsystems.slim.Table table5 = null;
        slimTableFactoryTest0.settable(table5);
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory7 = null;
        slimTableFactoryTest0.setslimTableFactory(slimTableFactory7);
        java.util.Map<java.lang.String, java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable>> strMap9 = slimTableFactoryTest0.getmap();
        java.util.Map<java.lang.String, java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable>> strMap10 = slimTableFactoryTest0.map;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory11 = null;
        slimTableFactoryTest0.slimTableFactory = slimTableFactory11;
        // The following exception was thrown during execution in test generation
        try {
            slimTableFactoryTest0.tableTypeStartingWithcommentColonShouldReturnNull();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(slimTableFactory3);
        org.junit.Assert.assertNull(strMap4);
        org.junit.Assert.assertNull(strMap9);
        org.junit.Assert.assertNull(strMap10);
    }

    @Test
    public void test01474() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01474");
        fitnesse.testsystems.slim.tables.SlimTableFactoryTest slimTableFactoryTest0 = new fitnesse.testsystems.slim.tables.SlimTableFactoryTest();
        fitnesse.testsystems.slim.Table table1 = null;
        slimTableFactoryTest0.table = table1;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory3 = null;
        slimTableFactoryTest0.slimTableFactory = slimTableFactory3;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory5 = slimTableFactoryTest0.getslimTableFactory();
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory6 = null;
        slimTableFactoryTest0.setslimTableFactory(slimTableFactory6);
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory8 = slimTableFactoryTest0.getslimTableFactory();
        // The following exception was thrown during execution in test generation
        try {
            slimTableFactoryTest0.shouldCreateCorrectSlimTableForTablesType();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(slimTableFactory5);
        org.junit.Assert.assertNull(slimTableFactory8);
    }

    @Test
    public void test01475() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01475");
        fitnesse.testsystems.slim.tables.SlimTableFactoryTest slimTableFactoryTest0 = new fitnesse.testsystems.slim.tables.SlimTableFactoryTest();
        fitnesse.testsystems.slim.Table table1 = null;
        slimTableFactoryTest0.table = table1;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory3 = slimTableFactoryTest0.getslimTableFactory();
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory4 = slimTableFactoryTest0.getslimTableFactory();
        fitnesse.testsystems.slim.Table table5 = null;
        slimTableFactoryTest0.table = table5;
        fitnesse.testsystems.slim.Table table7 = null;
        slimTableFactoryTest0.table = table7;
        fitnesse.testsystems.slim.Table table9 = slimTableFactoryTest0.gettable();
        fitnesse.testsystems.slim.Table table10 = null;
        slimTableFactoryTest0.settable(table10);
        java.util.Map<java.lang.String, java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable>> strMap12 = slimTableFactoryTest0.map;
        java.lang.Class<?> wildcardClass13 = slimTableFactoryTest0.getClass();
        org.junit.Assert.assertNull(slimTableFactory3);
        org.junit.Assert.assertNull(slimTableFactory4);
        org.junit.Assert.assertNull(table9);
        org.junit.Assert.assertNull(strMap12);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test01476() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01476");
        fitnesse.testsystems.slim.tables.SlimTableFactoryTest slimTableFactoryTest0 = new fitnesse.testsystems.slim.tables.SlimTableFactoryTest();
        fitnesse.testsystems.slim.Table table1 = null;
        slimTableFactoryTest0.table = table1;
        fitnesse.testsystems.slim.Table table3 = null;
        slimTableFactoryTest0.settable(table3);
        fitnesse.testsystems.slim.Table table5 = null;
        slimTableFactoryTest0.settable(table5);
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory7 = slimTableFactoryTest0.slimTableFactory;
        java.util.Map<java.lang.String, java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable>> strMap8 = slimTableFactoryTest0.getmap();
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory9 = slimTableFactoryTest0.slimTableFactory;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory10 = null;
        slimTableFactoryTest0.setslimTableFactory(slimTableFactory10);
        // The following exception was thrown during execution in test generation
        try {
            slimTableFactoryTest0.checkTableTypeDefinesIgnoredIfDifferentSpecified();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(slimTableFactory7);
        org.junit.Assert.assertNull(strMap8);
        org.junit.Assert.assertNull(slimTableFactory9);
    }

    @Test
    public void test01477() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01477");
        fitnesse.testsystems.slim.tables.SlimTableFactoryTest slimTableFactoryTest0 = new fitnesse.testsystems.slim.tables.SlimTableFactoryTest();
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory1 = slimTableFactoryTest0.slimTableFactory;
        fitnesse.testsystems.slim.Table table2 = slimTableFactoryTest0.gettable();
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory3 = null;
        slimTableFactoryTest0.slimTableFactory = slimTableFactory3;
        fitnesse.testsystems.slim.Table table5 = null;
        slimTableFactoryTest0.settable(table5);
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory7 = slimTableFactoryTest0.slimTableFactory;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory8 = slimTableFactoryTest0.getslimTableFactory();
        fitnesse.testsystems.slim.Table table9 = slimTableFactoryTest0.gettable();
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory10 = null;
        slimTableFactoryTest0.slimTableFactory = slimTableFactory10;
        java.util.Map<java.lang.String, java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable>> strMap12 = slimTableFactoryTest0.getmap();
        // The following exception was thrown during execution in test generation
        try {
            slimTableFactoryTest0.commentTableShouldReturnNull();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(slimTableFactory1);
        org.junit.Assert.assertNull(table2);
        org.junit.Assert.assertNull(slimTableFactory7);
        org.junit.Assert.assertNull(slimTableFactory8);
        org.junit.Assert.assertNull(table9);
        org.junit.Assert.assertNull(strMap12);
    }

    @Test
    public void test01478() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01478");
        fitnesse.testsystems.slim.tables.SlimTableFactoryTest slimTableFactoryTest0 = new fitnesse.testsystems.slim.tables.SlimTableFactoryTest();
        fitnesse.testsystems.slim.Table table1 = null;
        slimTableFactoryTest0.table = table1;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory3 = slimTableFactoryTest0.slimTableFactory;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory4 = null;
        slimTableFactoryTest0.setslimTableFactory(slimTableFactory4);
        fitnesse.testsystems.slim.Table table6 = null;
        slimTableFactoryTest0.settable(table6);
        fitnesse.testsystems.slim.Table table8 = slimTableFactoryTest0.gettable();
        // The following exception was thrown during execution in test generation
        try {
            slimTableFactoryTest0.addTableTypeImport("", "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(slimTableFactory3);
        org.junit.Assert.assertNull(table8);
    }

    @Test
    public void test01479() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01479");
        fitnesse.testsystems.slim.tables.SlimTableFactoryTest slimTableFactoryTest0 = new fitnesse.testsystems.slim.tables.SlimTableFactoryTest();
        fitnesse.testsystems.slim.Table table1 = null;
        slimTableFactoryTest0.table = table1;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory3 = slimTableFactoryTest0.slimTableFactory;
        java.util.Map<java.lang.String, java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable>> strMap4 = slimTableFactoryTest0.getmap();
        fitnesse.testsystems.slim.Table table5 = null;
        slimTableFactoryTest0.settable(table5);
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory7 = null;
        slimTableFactoryTest0.slimTableFactory = slimTableFactory7;
        java.util.Map<java.lang.String, java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable>> strMap9 = slimTableFactoryTest0.getmap();
        java.util.Map<java.lang.String, java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable>> strMap10 = slimTableFactoryTest0.getmap();
        fitnesse.testsystems.slim.Table table11 = slimTableFactoryTest0.table;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory12 = slimTableFactoryTest0.slimTableFactory;
        java.util.Map<java.lang.String, java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable>> strMap13 = slimTableFactoryTest0.getmap();
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory14 = null;
        slimTableFactoryTest0.setslimTableFactory(slimTableFactory14);
        // The following exception was thrown during execution in test generation
        try {
            slimTableFactoryTest0.checkTableTypeDefinesIgnoredIfDifferentSpecified();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(slimTableFactory3);
        org.junit.Assert.assertNull(strMap4);
        org.junit.Assert.assertNull(strMap9);
        org.junit.Assert.assertNull(strMap10);
        org.junit.Assert.assertNull(table11);
        org.junit.Assert.assertNull(slimTableFactory12);
        org.junit.Assert.assertNull(strMap13);
    }

    @Test
    public void test01480() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01480");
        fitnesse.testsystems.slim.tables.SlimTableFactoryTest slimTableFactoryTest0 = new fitnesse.testsystems.slim.tables.SlimTableFactoryTest();
        fitnesse.testsystems.slim.Table table1 = slimTableFactoryTest0.table;
        java.util.Map<java.lang.String, java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable>> strMap2 = slimTableFactoryTest0.getmap();
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory3 = slimTableFactoryTest0.slimTableFactory;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory4 = slimTableFactoryTest0.getslimTableFactory();
        java.lang.Class<?> wildcardClass5 = slimTableFactoryTest0.getClass();
        org.junit.Assert.assertNull(table1);
        org.junit.Assert.assertNull(strMap2);
        org.junit.Assert.assertNull(slimTableFactory3);
        org.junit.Assert.assertNull(slimTableFactory4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test01481() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01481");
        fitnesse.testsystems.slim.tables.SlimTableFactoryTest slimTableFactoryTest0 = new fitnesse.testsystems.slim.tables.SlimTableFactoryTest();
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory1 = slimTableFactoryTest0.slimTableFactory;
        fitnesse.testsystems.slim.Table table2 = null;
        slimTableFactoryTest0.settable(table2);
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory4 = slimTableFactoryTest0.slimTableFactory;
        // The following exception was thrown during execution in test generation
        try {
            slimTableFactoryTest0.commentTableShouldReturnNull();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(slimTableFactory1);
        org.junit.Assert.assertNull(slimTableFactory4);
    }

    @Test
    public void test01482() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01482");
        fitnesse.testsystems.slim.tables.SlimTableFactoryTest slimTableFactoryTest0 = new fitnesse.testsystems.slim.tables.SlimTableFactoryTest();
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory1 = slimTableFactoryTest0.slimTableFactory;
        fitnesse.testsystems.slim.Table table2 = slimTableFactoryTest0.gettable();
        fitnesse.testsystems.slim.Table table3 = null;
        slimTableFactoryTest0.table = table3;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory5 = slimTableFactoryTest0.getslimTableFactory();
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory6 = null;
        slimTableFactoryTest0.setslimTableFactory(slimTableFactory6);
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory8 = null;
        slimTableFactoryTest0.slimTableFactory = slimTableFactory8;
        // The following exception was thrown during execution in test generation
        try {
            slimTableFactoryTest0.addTableTypeImport("", "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(slimTableFactory1);
        org.junit.Assert.assertNull(table2);
        org.junit.Assert.assertNull(slimTableFactory5);
    }

    @Test
    public void test01483() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01483");
        fitnesse.testsystems.slim.tables.SlimTableFactoryTest slimTableFactoryTest0 = new fitnesse.testsystems.slim.tables.SlimTableFactoryTest();
        fitnesse.testsystems.slim.Table table1 = null;
        slimTableFactoryTest0.table = table1;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory3 = slimTableFactoryTest0.getslimTableFactory();
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory4 = slimTableFactoryTest0.getslimTableFactory();
        fitnesse.testsystems.slim.Table table5 = null;
        slimTableFactoryTest0.table = table5;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory7 = slimTableFactoryTest0.slimTableFactory;
        java.util.Map<java.lang.String, java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable>> strMap8 = slimTableFactoryTest0.map;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory9 = null;
        slimTableFactoryTest0.slimTableFactory = slimTableFactory9;
        java.util.Map<java.lang.String, java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable>> strMap11 = slimTableFactoryTest0.getmap();
        // The following exception was thrown during execution in test generation
        try {
            slimTableFactoryTest0.shouldCreateCorrectSlimTableForTablesType();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(slimTableFactory3);
        org.junit.Assert.assertNull(slimTableFactory4);
        org.junit.Assert.assertNull(slimTableFactory7);
        org.junit.Assert.assertNull(strMap8);
        org.junit.Assert.assertNull(strMap11);
    }

    @Test
    public void test01484() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01484");
        fitnesse.testsystems.slim.tables.SlimTableFactoryTest slimTableFactoryTest0 = new fitnesse.testsystems.slim.tables.SlimTableFactoryTest();
        fitnesse.testsystems.slim.Table table1 = null;
        slimTableFactoryTest0.table = table1;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory3 = slimTableFactoryTest0.slimTableFactory;
        java.util.Map<java.lang.String, java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable>> strMap4 = slimTableFactoryTest0.map;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory5 = null;
        slimTableFactoryTest0.setslimTableFactory(slimTableFactory5);
        java.util.Map<java.lang.String, java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable>> strMap7 = slimTableFactoryTest0.map;
        fitnesse.testsystems.slim.Table table8 = slimTableFactoryTest0.table;
        fitnesse.testsystems.slim.Table table9 = null;
        slimTableFactoryTest0.table = table9;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory11 = slimTableFactoryTest0.getslimTableFactory();
        // The following exception was thrown during execution in test generation
        try {
            slimTableFactoryTest0.tableTypeStartingWithcommentColonShouldReturnNull();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(slimTableFactory3);
        org.junit.Assert.assertNull(strMap4);
        org.junit.Assert.assertNull(strMap7);
        org.junit.Assert.assertNull(table8);
        org.junit.Assert.assertNull(slimTableFactory11);
    }

    @Test
    public void test01485() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01485");
        fitnesse.testsystems.slim.tables.SlimTableFactoryTest slimTableFactoryTest0 = new fitnesse.testsystems.slim.tables.SlimTableFactoryTest();
        fitnesse.testsystems.slim.Table table1 = null;
        slimTableFactoryTest0.table = table1;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory3 = slimTableFactoryTest0.slimTableFactory;
        java.util.Map<java.lang.String, java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable>> strMap4 = slimTableFactoryTest0.getmap();
        fitnesse.testsystems.slim.Table table5 = null;
        slimTableFactoryTest0.settable(table5);
        fitnesse.testsystems.slim.Table table7 = null;
        slimTableFactoryTest0.table = table7;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory9 = null;
        slimTableFactoryTest0.slimTableFactory = slimTableFactory9;
        fitnesse.testsystems.slim.Table table11 = null;
        slimTableFactoryTest0.table = table11;
        fitnesse.testsystems.slim.Table table13 = slimTableFactoryTest0.gettable();
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory14 = slimTableFactoryTest0.slimTableFactory;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory15 = slimTableFactoryTest0.getslimTableFactory();
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory16 = slimTableFactoryTest0.getslimTableFactory();
        // The following exception was thrown during execution in test generation
        try {
            slimTableFactoryTest0.checkTableTypeDefineUsedForTable();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(slimTableFactory3);
        org.junit.Assert.assertNull(strMap4);
        org.junit.Assert.assertNull(table13);
        org.junit.Assert.assertNull(slimTableFactory14);
        org.junit.Assert.assertNull(slimTableFactory15);
        org.junit.Assert.assertNull(slimTableFactory16);
    }

    @Test
    public void test01486() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01486");
        fitnesse.testsystems.slim.tables.SlimTableFactoryTest slimTableFactoryTest0 = new fitnesse.testsystems.slim.tables.SlimTableFactoryTest();
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory1 = slimTableFactoryTest0.slimTableFactory;
        fitnesse.testsystems.slim.Table table2 = slimTableFactoryTest0.gettable();
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory3 = null;
        slimTableFactoryTest0.slimTableFactory = slimTableFactory3;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory5 = null;
        slimTableFactoryTest0.slimTableFactory = slimTableFactory5;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory7 = null;
        slimTableFactoryTest0.setslimTableFactory(slimTableFactory7);
        fitnesse.testsystems.slim.Table table9 = slimTableFactoryTest0.table;
        java.util.Map<java.lang.String, java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable>> strMap10 = slimTableFactoryTest0.getmap();
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory11 = null;
        slimTableFactoryTest0.slimTableFactory = slimTableFactory11;
        // The following exception was thrown during execution in test generation
        try {
            slimTableFactoryTest0.tableTypeStartingWithcommentColonShouldReturnNull();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(slimTableFactory1);
        org.junit.Assert.assertNull(table2);
        org.junit.Assert.assertNull(table9);
        org.junit.Assert.assertNull(strMap10);
    }

    @Test
    public void test01487() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01487");
        fitnesse.testsystems.slim.tables.SlimTableFactoryTest slimTableFactoryTest0 = new fitnesse.testsystems.slim.tables.SlimTableFactoryTest();
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory1 = slimTableFactoryTest0.slimTableFactory;
        fitnesse.testsystems.slim.Table table2 = slimTableFactoryTest0.gettable();
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory3 = null;
        slimTableFactoryTest0.slimTableFactory = slimTableFactory3;
        fitnesse.testsystems.slim.Table table5 = null;
        slimTableFactoryTest0.settable(table5);
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory7 = slimTableFactoryTest0.slimTableFactory;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory8 = slimTableFactoryTest0.getslimTableFactory();
        fitnesse.testsystems.slim.Table table9 = slimTableFactoryTest0.gettable();
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory10 = null;
        slimTableFactoryTest0.slimTableFactory = slimTableFactory10;
        java.util.Map<java.lang.String, java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable>> strMap12 = slimTableFactoryTest0.getmap();
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory13 = null;
        slimTableFactoryTest0.slimTableFactory = slimTableFactory13;
        // The following exception was thrown during execution in test generation
        try {
            slimTableFactoryTest0.addTableTypeImport("", "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(slimTableFactory1);
        org.junit.Assert.assertNull(table2);
        org.junit.Assert.assertNull(slimTableFactory7);
        org.junit.Assert.assertNull(slimTableFactory8);
        org.junit.Assert.assertNull(table9);
        org.junit.Assert.assertNull(strMap12);
    }

    @Test
    public void test01488() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01488");
        fitnesse.testsystems.slim.tables.SlimTableFactoryTest slimTableFactoryTest0 = new fitnesse.testsystems.slim.tables.SlimTableFactoryTest();
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory1 = slimTableFactoryTest0.slimTableFactory;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory2 = slimTableFactoryTest0.slimTableFactory;
        fitnesse.testsystems.slim.Table table3 = slimTableFactoryTest0.gettable();
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory4 = slimTableFactoryTest0.getslimTableFactory();
        fitnesse.testsystems.slim.Table table5 = slimTableFactoryTest0.table;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass6 = table5.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(slimTableFactory1);
        org.junit.Assert.assertNull(slimTableFactory2);
        org.junit.Assert.assertNull(table3);
        org.junit.Assert.assertNull(slimTableFactory4);
        org.junit.Assert.assertNull(table5);
    }

    @Test
    public void test01489() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01489");
        fitnesse.testsystems.slim.tables.SlimTableFactoryTest slimTableFactoryTest0 = new fitnesse.testsystems.slim.tables.SlimTableFactoryTest();
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory1 = slimTableFactoryTest0.slimTableFactory;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory2 = slimTableFactoryTest0.slimTableFactory;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory3 = null;
        slimTableFactoryTest0.slimTableFactory = slimTableFactory3;
        fitnesse.testsystems.slim.Table table5 = null;
        slimTableFactoryTest0.table = table5;
        // The following exception was thrown during execution in test generation
        try {
            slimTableFactoryTest0.tableTypeStartingWithcommentColonShouldReturnNull();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(slimTableFactory1);
        org.junit.Assert.assertNull(slimTableFactory2);
    }

    @Test
    public void test01490() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01490");
        fitnesse.testsystems.slim.tables.SlimTableFactoryTest slimTableFactoryTest0 = new fitnesse.testsystems.slim.tables.SlimTableFactoryTest();
        fitnesse.testsystems.slim.Table table1 = slimTableFactoryTest0.table;
        java.util.Map<java.lang.String, java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable>> strMap2 = slimTableFactoryTest0.getmap();
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory3 = null;
        slimTableFactoryTest0.slimTableFactory = slimTableFactory3;
        fitnesse.testsystems.slim.Table table5 = slimTableFactoryTest0.table;
        java.util.Map<java.lang.String, java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable>> strMap6 = slimTableFactoryTest0.map;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory7 = slimTableFactoryTest0.getslimTableFactory();
        fitnesse.testsystems.slim.Table table8 = slimTableFactoryTest0.gettable();
        java.util.Map<java.lang.String, java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable>> strMap9 = slimTableFactoryTest0.map;
        fitnesse.testsystems.slim.Table table10 = slimTableFactoryTest0.gettable();
        fitnesse.testsystems.slim.Table table11 = null;
        slimTableFactoryTest0.table = table11;
        // The following exception was thrown during execution in test generation
        try {
            slimTableFactoryTest0.checkTableTypeDefineUsedForTable();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(table1);
        org.junit.Assert.assertNull(strMap2);
        org.junit.Assert.assertNull(table5);
        org.junit.Assert.assertNull(strMap6);
        org.junit.Assert.assertNull(slimTableFactory7);
        org.junit.Assert.assertNull(table8);
        org.junit.Assert.assertNull(strMap9);
        org.junit.Assert.assertNull(table10);
    }

    @Test
    public void test01491() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01491");
        fitnesse.testsystems.slim.tables.SlimTableFactoryTest slimTableFactoryTest0 = new fitnesse.testsystems.slim.tables.SlimTableFactoryTest();
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory1 = slimTableFactoryTest0.slimTableFactory;
        fitnesse.testsystems.slim.Table table2 = slimTableFactoryTest0.gettable();
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory3 = null;
        slimTableFactoryTest0.slimTableFactory = slimTableFactory3;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory5 = null;
        slimTableFactoryTest0.slimTableFactory = slimTableFactory5;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory7 = null;
        slimTableFactoryTest0.setslimTableFactory(slimTableFactory7);
        fitnesse.testsystems.slim.Table table9 = slimTableFactoryTest0.table;
        java.util.Map<java.lang.String, java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable>> strMap10 = slimTableFactoryTest0.getmap();
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory11 = null;
        slimTableFactoryTest0.slimTableFactory = slimTableFactory11;
        // The following exception was thrown during execution in test generation
        try {
            slimTableFactoryTest0.addTableTypeImport("", "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(slimTableFactory1);
        org.junit.Assert.assertNull(table2);
        org.junit.Assert.assertNull(table9);
        org.junit.Assert.assertNull(strMap10);
    }

    @Test
    public void test01492() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01492");
        fitnesse.testsystems.slim.tables.SlimTableFactoryTest slimTableFactoryTest0 = new fitnesse.testsystems.slim.tables.SlimTableFactoryTest();
        fitnesse.testsystems.slim.Table table1 = null;
        slimTableFactoryTest0.table = table1;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory3 = slimTableFactoryTest0.slimTableFactory;
        java.util.Map<java.lang.String, java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable>> strMap4 = slimTableFactoryTest0.getmap();
        fitnesse.testsystems.slim.Table table5 = null;
        slimTableFactoryTest0.settable(table5);
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory7 = null;
        slimTableFactoryTest0.slimTableFactory = slimTableFactory7;
        fitnesse.testsystems.slim.Table table9 = slimTableFactoryTest0.table;
        fitnesse.testsystems.slim.Table table10 = slimTableFactoryTest0.table;
        java.util.Map<java.lang.String, java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable>> strMap11 = slimTableFactoryTest0.getmap();
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory12 = null;
        slimTableFactoryTest0.slimTableFactory = slimTableFactory12;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory14 = null;
        slimTableFactoryTest0.slimTableFactory = slimTableFactory14;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory16 = slimTableFactoryTest0.slimTableFactory;
        // The following exception was thrown during execution in test generation
        try {
            slimTableFactoryTest0.checkTableTypeDefinesIgnoredIfDifferentSpecified();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(slimTableFactory3);
        org.junit.Assert.assertNull(strMap4);
        org.junit.Assert.assertNull(table9);
        org.junit.Assert.assertNull(table10);
        org.junit.Assert.assertNull(strMap11);
        org.junit.Assert.assertNull(slimTableFactory16);
    }

    @Test
    public void test01493() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01493");
        fitnesse.testsystems.slim.tables.SlimTableFactoryTest slimTableFactoryTest0 = new fitnesse.testsystems.slim.tables.SlimTableFactoryTest();
        fitnesse.testsystems.slim.Table table1 = null;
        slimTableFactoryTest0.table = table1;
        fitnesse.testsystems.slim.Table table3 = slimTableFactoryTest0.table;
        fitnesse.testsystems.slim.Table table4 = slimTableFactoryTest0.gettable();
        fitnesse.testsystems.slim.Table table5 = slimTableFactoryTest0.gettable();
        java.util.Map<java.lang.String, java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable>> strMap6 = slimTableFactoryTest0.getmap();
        fitnesse.testsystems.slim.Table table7 = slimTableFactoryTest0.table;
        // The following exception was thrown during execution in test generation
        try {
            slimTableFactoryTest0.commentTableShouldReturnNull();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(table3);
        org.junit.Assert.assertNull(table4);
        org.junit.Assert.assertNull(table5);
        org.junit.Assert.assertNull(strMap6);
        org.junit.Assert.assertNull(table7);
    }

    @Test
    public void test01494() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01494");
        fitnesse.testsystems.slim.tables.SlimTableFactoryTest slimTableFactoryTest0 = new fitnesse.testsystems.slim.tables.SlimTableFactoryTest();
        fitnesse.testsystems.slim.Table table1 = slimTableFactoryTest0.table;
        java.util.Map<java.lang.String, java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable>> strMap2 = slimTableFactoryTest0.getmap();
        java.util.Map<java.lang.String, java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable>> strMap3 = slimTableFactoryTest0.getmap();
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory4 = slimTableFactoryTest0.slimTableFactory;
        fitnesse.testsystems.slim.Table table5 = null;
        slimTableFactoryTest0.settable(table5);
        fitnesse.testsystems.slim.Table table7 = slimTableFactoryTest0.table;
        java.util.Map<java.lang.String, java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable>> strMap8 = slimTableFactoryTest0.map;
        fitnesse.testsystems.slim.Table table9 = slimTableFactoryTest0.table;
        fitnesse.testsystems.slim.Table table10 = slimTableFactoryTest0.gettable();
        fitnesse.testsystems.slim.Table table11 = null;
        slimTableFactoryTest0.table = table11;
        // The following exception was thrown during execution in test generation
        try {
            slimTableFactoryTest0.tableTypeStartingWithcommentColonShouldReturnNull();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(table1);
        org.junit.Assert.assertNull(strMap2);
        org.junit.Assert.assertNull(strMap3);
        org.junit.Assert.assertNull(slimTableFactory4);
        org.junit.Assert.assertNull(table7);
        org.junit.Assert.assertNull(strMap8);
        org.junit.Assert.assertNull(table9);
        org.junit.Assert.assertNull(table10);
    }

    @Test
    public void test01495() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01495");
        fitnesse.testsystems.slim.tables.SlimTableFactoryTest slimTableFactoryTest0 = new fitnesse.testsystems.slim.tables.SlimTableFactoryTest();
        fitnesse.testsystems.slim.Table table1 = slimTableFactoryTest0.table;
        java.util.Map<java.lang.String, java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable>> strMap2 = slimTableFactoryTest0.getmap();
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory3 = slimTableFactoryTest0.slimTableFactory;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory4 = slimTableFactoryTest0.getslimTableFactory();
        java.util.Map<java.lang.String, java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable>> strMap5 = slimTableFactoryTest0.getmap();
        fitnesse.testsystems.slim.Table table6 = null;
        slimTableFactoryTest0.table = table6;
        fitnesse.testsystems.slim.Table table8 = slimTableFactoryTest0.gettable();
        java.util.Map<java.lang.String, java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable>> strMap9 = slimTableFactoryTest0.map;
        java.lang.Class<?> wildcardClass10 = slimTableFactoryTest0.getClass();
        org.junit.Assert.assertNull(table1);
        org.junit.Assert.assertNull(strMap2);
        org.junit.Assert.assertNull(slimTableFactory3);
        org.junit.Assert.assertNull(slimTableFactory4);
        org.junit.Assert.assertNull(strMap5);
        org.junit.Assert.assertNull(table8);
        org.junit.Assert.assertNull(strMap9);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test01496() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01496");
        fitnesse.testsystems.slim.tables.SlimTableFactoryTest slimTableFactoryTest0 = new fitnesse.testsystems.slim.tables.SlimTableFactoryTest();
        fitnesse.testsystems.slim.Table table1 = null;
        slimTableFactoryTest0.table = table1;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory3 = slimTableFactoryTest0.slimTableFactory;
        java.util.Map<java.lang.String, java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable>> strMap4 = slimTableFactoryTest0.getmap();
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory5 = slimTableFactoryTest0.slimTableFactory;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory6 = slimTableFactoryTest0.getslimTableFactory();
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory7 = null;
        slimTableFactoryTest0.setslimTableFactory(slimTableFactory7);
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory9 = slimTableFactoryTest0.slimTableFactory;
        fitnesse.testsystems.slim.Table table10 = null;
        slimTableFactoryTest0.settable(table10);
        java.lang.Class<?> wildcardClass12 = slimTableFactoryTest0.getClass();
        org.junit.Assert.assertNull(slimTableFactory3);
        org.junit.Assert.assertNull(strMap4);
        org.junit.Assert.assertNull(slimTableFactory5);
        org.junit.Assert.assertNull(slimTableFactory6);
        org.junit.Assert.assertNull(slimTableFactory9);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test01497() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01497");
        fitnesse.testsystems.slim.tables.SlimTableFactoryTest slimTableFactoryTest0 = new fitnesse.testsystems.slim.tables.SlimTableFactoryTest();
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory1 = slimTableFactoryTest0.slimTableFactory;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory2 = null;
        slimTableFactoryTest0.slimTableFactory = slimTableFactory2;
        // The following exception was thrown during execution in test generation
        try {
            slimTableFactoryTest0.shouldCreateCorrectSlimTableForTablesType();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(slimTableFactory1);
    }

    @Test
    public void test01498() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01498");
        fitnesse.testsystems.slim.tables.SlimTableFactoryTest slimTableFactoryTest0 = new fitnesse.testsystems.slim.tables.SlimTableFactoryTest();
        fitnesse.testsystems.slim.Table table1 = null;
        slimTableFactoryTest0.table = table1;
        fitnesse.testsystems.slim.Table table3 = null;
        slimTableFactoryTest0.settable(table3);
        fitnesse.testsystems.slim.Table table5 = null;
        slimTableFactoryTest0.settable(table5);
        fitnesse.testsystems.slim.Table table7 = null;
        slimTableFactoryTest0.table = table7;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory9 = slimTableFactoryTest0.slimTableFactory;
        fitnesse.testsystems.slim.Table table10 = null;
        slimTableFactoryTest0.table = table10;
        // The following exception was thrown during execution in test generation
        try {
            slimTableFactoryTest0.commentTableShouldReturnNull();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(slimTableFactory9);
    }

    @Test
    public void test01499() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01499");
        fitnesse.testsystems.slim.tables.SlimTableFactoryTest slimTableFactoryTest0 = new fitnesse.testsystems.slim.tables.SlimTableFactoryTest();
        fitnesse.testsystems.slim.Table table1 = null;
        slimTableFactoryTest0.table = table1;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory3 = null;
        slimTableFactoryTest0.slimTableFactory = slimTableFactory3;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory5 = slimTableFactoryTest0.getslimTableFactory();
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory6 = null;
        slimTableFactoryTest0.setslimTableFactory(slimTableFactory6);
        fitnesse.testsystems.slim.Table table8 = null;
        slimTableFactoryTest0.settable(table8);
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory10 = null;
        slimTableFactoryTest0.setslimTableFactory(slimTableFactory10);
        // The following exception was thrown during execution in test generation
        try {
            slimTableFactoryTest0.tableTypeStartingWithcommentColonShouldReturnNull();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(slimTableFactory5);
    }

    @Test
    public void test01500() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01500");
        fitnesse.testsystems.slim.tables.SlimTableFactoryTest slimTableFactoryTest0 = new fitnesse.testsystems.slim.tables.SlimTableFactoryTest();
        fitnesse.testsystems.slim.Table table1 = null;
        slimTableFactoryTest0.table = table1;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory3 = slimTableFactoryTest0.slimTableFactory;
        java.util.Map<java.lang.String, java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable>> strMap4 = slimTableFactoryTest0.getmap();
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory5 = slimTableFactoryTest0.slimTableFactory;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory6 = null;
        slimTableFactoryTest0.setslimTableFactory(slimTableFactory6);
        fitnesse.testsystems.slim.Table table8 = null;
        slimTableFactoryTest0.table = table8;
        fitnesse.testsystems.slim.Table table10 = null;
        slimTableFactoryTest0.settable(table10);
        fitnesse.testsystems.slim.Table table12 = null;
        slimTableFactoryTest0.settable(table12);
        // The following exception was thrown during execution in test generation
        try {
            slimTableFactoryTest0.tableTypeStartingWithcommentColonShouldReturnNull();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(slimTableFactory3);
        org.junit.Assert.assertNull(strMap4);
        org.junit.Assert.assertNull(slimTableFactory5);
    }
}

