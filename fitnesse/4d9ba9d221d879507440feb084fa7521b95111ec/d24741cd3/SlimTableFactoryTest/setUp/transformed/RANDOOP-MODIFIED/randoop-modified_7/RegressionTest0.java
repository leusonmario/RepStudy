import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest0 {

    public static boolean debug = false;

    @Test
    public void test00001() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00001");
        fitnesse.testsystems.slim.tables.SlimTableFactoryTest slimTableFactoryTest0 = new fitnesse.testsystems.slim.tables.SlimTableFactoryTest();
        fitnesse.testsystems.slim.Table table1 = null;
        slimTableFactoryTest0.table = table1;
        // The following exception was thrown during execution in test generation
        try {
            slimTableFactoryTest0.tableTypeStartingWithcommentColonShouldReturnNull();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test00002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00002");
        fitnesse.testsystems.slim.tables.SlimTableFactoryTest slimTableFactoryTest0 = new fitnesse.testsystems.slim.tables.SlimTableFactoryTest();
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory1 = slimTableFactoryTest0.slimTableFactory;
        fitnesse.testsystems.slim.Table table2 = slimTableFactoryTest0.gettable();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass3 = table2.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(slimTableFactory1);
        org.junit.Assert.assertNull(table2);
    }

    @Test
    public void test00003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00003");
        fitnesse.testsystems.slim.tables.SlimTableFactoryTest slimTableFactoryTest0 = new fitnesse.testsystems.slim.tables.SlimTableFactoryTest();
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory1 = slimTableFactoryTest0.slimTableFactory;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass2 = slimTableFactory1.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(slimTableFactory1);
    }

    @Test
    public void test00004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00004");
        fitnesse.testsystems.slim.tables.SlimTableFactoryTest slimTableFactoryTest0 = new fitnesse.testsystems.slim.tables.SlimTableFactoryTest();
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory1 = slimTableFactoryTest0.slimTableFactory;
        fitnesse.testsystems.slim.Table table2 = slimTableFactoryTest0.gettable();
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory3 = null;
        slimTableFactoryTest0.slimTableFactory = slimTableFactory3;
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
    public void test00005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00005");
        fitnesse.testsystems.slim.tables.SlimTableFactoryTest slimTableFactoryTest0 = new fitnesse.testsystems.slim.tables.SlimTableFactoryTest();
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory1 = slimTableFactoryTest0.slimTableFactory;
        fitnesse.testsystems.slim.Table table2 = slimTableFactoryTest0.gettable();
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory3 = null;
        slimTableFactoryTest0.slimTableFactory = slimTableFactory3;
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
    public void test00006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00006");
        fitnesse.testsystems.slim.tables.SlimTableFactoryTest slimTableFactoryTest0 = new fitnesse.testsystems.slim.tables.SlimTableFactoryTest();
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory1 = slimTableFactoryTest0.slimTableFactory;
        fitnesse.testsystems.slim.Table table2 = slimTableFactoryTest0.gettable();
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory3 = null;
        slimTableFactoryTest0.slimTableFactory = slimTableFactory3;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory5 = null;
        slimTableFactoryTest0.slimTableFactory = slimTableFactory5;
        java.lang.Class<?> wildcardClass7 = slimTableFactoryTest0.getClass();
        org.junit.Assert.assertNull(slimTableFactory1);
        org.junit.Assert.assertNull(table2);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test00007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00007");
        fitnesse.testsystems.slim.tables.SlimTableFactoryTest slimTableFactoryTest0 = new fitnesse.testsystems.slim.tables.SlimTableFactoryTest();
        fitnesse.testsystems.slim.Table table1 = null;
        slimTableFactoryTest0.table = table1;
        fitnesse.testsystems.slim.Table table3 = null;
        slimTableFactoryTest0.settable(table3);
        fitnesse.testsystems.slim.Table table5 = null;
        slimTableFactoryTest0.table = table5;
        java.lang.Class<?> wildcardClass7 = slimTableFactoryTest0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test00008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00008");
        fitnesse.testsystems.slim.tables.SlimTableFactoryTest slimTableFactoryTest0 = new fitnesse.testsystems.slim.tables.SlimTableFactoryTest();
        fitnesse.testsystems.slim.Table table1 = null;
        slimTableFactoryTest0.table = table1;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory3 = slimTableFactoryTest0.slimTableFactory;
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
    public void test00009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00009");
        fitnesse.testsystems.slim.tables.SlimTableFactoryTest slimTableFactoryTest0 = new fitnesse.testsystems.slim.tables.SlimTableFactoryTest();
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory1 = slimTableFactoryTest0.slimTableFactory;
        fitnesse.testsystems.slim.Table table2 = slimTableFactoryTest0.gettable();
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory3 = null;
        slimTableFactoryTest0.slimTableFactory = slimTableFactory3;
        fitnesse.testsystems.slim.Table table5 = null;
        slimTableFactoryTest0.settable(table5);
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory7 = slimTableFactoryTest0.slimTableFactory;
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
    }

    @Test
    public void test00010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00010");
        fitnesse.testsystems.slim.tables.SlimTableFactoryTest slimTableFactoryTest0 = new fitnesse.testsystems.slim.tables.SlimTableFactoryTest();
        fitnesse.testsystems.slim.Table table1 = null;
        slimTableFactoryTest0.table = table1;
        fitnesse.testsystems.slim.Table table3 = null;
        slimTableFactoryTest0.settable(table3);
        java.util.Map<java.lang.String, java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable>> strMap5 = slimTableFactoryTest0.map;
        // The following exception was thrown during execution in test generation
        try {
            slimTableFactoryTest0.tableTypeStartingWithcommentColonShouldReturnNull();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(strMap5);
    }

    @Test
    public void test00011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00011");
        fitnesse.testsystems.slim.tables.SlimTableFactoryTest slimTableFactoryTest0 = new fitnesse.testsystems.slim.tables.SlimTableFactoryTest();
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory1 = slimTableFactoryTest0.slimTableFactory;
        fitnesse.testsystems.slim.Table table2 = slimTableFactoryTest0.gettable();
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory3 = null;
        slimTableFactoryTest0.slimTableFactory = slimTableFactory3;
        fitnesse.testsystems.slim.Table table5 = null;
        slimTableFactoryTest0.settable(table5);
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
    public void test00012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00012");
        fitnesse.testsystems.slim.tables.SlimTableFactoryTest slimTableFactoryTest0 = new fitnesse.testsystems.slim.tables.SlimTableFactoryTest();
        fitnesse.testsystems.slim.Table table1 = null;
        slimTableFactoryTest0.table = table1;
        // The following exception was thrown during execution in test generation
        try {
            slimTableFactoryTest0.checkTableTypeDefineUsedForTable();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test00013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00013");
        fitnesse.testsystems.slim.tables.SlimTableFactoryTest slimTableFactoryTest0 = new fitnesse.testsystems.slim.tables.SlimTableFactoryTest();
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory1 = slimTableFactoryTest0.slimTableFactory;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory2 = slimTableFactoryTest0.slimTableFactory;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory3 = null;
        slimTableFactoryTest0.slimTableFactory = slimTableFactory3;
        // The following exception was thrown during execution in test generation
        try {
            slimTableFactoryTest0.checkTableTypeDefinesIgnoredIfDifferentSpecified();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(slimTableFactory1);
        org.junit.Assert.assertNull(slimTableFactory2);
    }

    @Test
    public void test00014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00014");
        fitnesse.testsystems.slim.tables.SlimTableFactoryTest slimTableFactoryTest0 = new fitnesse.testsystems.slim.tables.SlimTableFactoryTest();
        fitnesse.testsystems.slim.Table table1 = null;
        slimTableFactoryTest0.table = table1;
        fitnesse.testsystems.slim.Table table3 = null;
        slimTableFactoryTest0.settable(table3);
        fitnesse.testsystems.slim.Table table5 = null;
        slimTableFactoryTest0.settable(table5);
        // The following exception was thrown during execution in test generation
        try {
            slimTableFactoryTest0.shouldCreateCorrectSlimTableForTablesType();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test00015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00015");
        fitnesse.testsystems.slim.tables.SlimTableFactoryTest slimTableFactoryTest0 = new fitnesse.testsystems.slim.tables.SlimTableFactoryTest();
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory1 = slimTableFactoryTest0.slimTableFactory;
        fitnesse.testsystems.slim.Table table2 = slimTableFactoryTest0.gettable();
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory3 = null;
        slimTableFactoryTest0.slimTableFactory = slimTableFactory3;
        fitnesse.testsystems.slim.Table table5 = null;
        slimTableFactoryTest0.settable(table5);
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory7 = slimTableFactoryTest0.slimTableFactory;
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
    public void test00016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00016");
        fitnesse.testsystems.slim.tables.SlimTableFactoryTest slimTableFactoryTest0 = new fitnesse.testsystems.slim.tables.SlimTableFactoryTest();
        fitnesse.testsystems.slim.Table table1 = null;
        slimTableFactoryTest0.table = table1;
        fitnesse.testsystems.slim.Table table3 = null;
        slimTableFactoryTest0.settable(table3);
        fitnesse.testsystems.slim.Table table5 = null;
        slimTableFactoryTest0.table = table5;
        // The following exception was thrown during execution in test generation
        try {
            slimTableFactoryTest0.checkTableTypeDefineUsedForTable();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test00017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00017");
        fitnesse.testsystems.slim.tables.SlimTableFactoryTest slimTableFactoryTest0 = new fitnesse.testsystems.slim.tables.SlimTableFactoryTest();
        fitnesse.testsystems.slim.Table table1 = null;
        slimTableFactoryTest0.table = table1;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory3 = slimTableFactoryTest0.slimTableFactory;
        java.util.Map<java.lang.String, java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable>> strMap4 = slimTableFactoryTest0.getmap();
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory5 = slimTableFactoryTest0.slimTableFactory;
        java.lang.Class<?> wildcardClass6 = slimTableFactoryTest0.getClass();
        org.junit.Assert.assertNull(slimTableFactory3);
        org.junit.Assert.assertNull(strMap4);
        org.junit.Assert.assertNull(slimTableFactory5);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test00018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00018");
        fitnesse.testsystems.slim.tables.SlimTableFactoryTest slimTableFactoryTest0 = new fitnesse.testsystems.slim.tables.SlimTableFactoryTest();
        fitnesse.testsystems.slim.Table table1 = null;
        slimTableFactoryTest0.table = table1;
        fitnesse.testsystems.slim.Table table3 = null;
        slimTableFactoryTest0.settable(table3);
        // The following exception was thrown during execution in test generation
        try {
            slimTableFactoryTest0.addTableTypeImport("hi!", "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test00019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00019");
        fitnesse.testsystems.slim.tables.SlimTableFactoryTest slimTableFactoryTest0 = new fitnesse.testsystems.slim.tables.SlimTableFactoryTest();
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory1 = slimTableFactoryTest0.slimTableFactory;
        fitnesse.testsystems.slim.Table table2 = slimTableFactoryTest0.gettable();
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory3 = null;
        slimTableFactoryTest0.slimTableFactory = slimTableFactory3;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory5 = null;
        slimTableFactoryTest0.slimTableFactory = slimTableFactory5;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory7 = slimTableFactoryTest0.slimTableFactory;
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
    public void test00020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00020");
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
        org.junit.Assert.assertNull(table10);
    }

    @Test
    public void test00021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00021");
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
        java.lang.Class<?> wildcardClass13 = slimTableFactoryTest0.getClass();
        org.junit.Assert.assertNull(slimTableFactory1);
        org.junit.Assert.assertNull(table2);
        org.junit.Assert.assertNull(slimTableFactory7);
        org.junit.Assert.assertNull(slimTableFactory8);
        org.junit.Assert.assertNull(table9);
        org.junit.Assert.assertNull(table10);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test00022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00022");
        fitnesse.testsystems.slim.tables.SlimTableFactoryTest slimTableFactoryTest0 = new fitnesse.testsystems.slim.tables.SlimTableFactoryTest();
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory1 = slimTableFactoryTest0.slimTableFactory;
        fitnesse.testsystems.slim.Table table2 = slimTableFactoryTest0.gettable();
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory3 = null;
        slimTableFactoryTest0.slimTableFactory = slimTableFactory3;
        fitnesse.testsystems.slim.Table table5 = null;
        slimTableFactoryTest0.settable(table5);
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory7 = slimTableFactoryTest0.slimTableFactory;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory8 = slimTableFactoryTest0.getslimTableFactory();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass9 = slimTableFactory8.getClass();
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
    public void test00023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00023");
        fitnesse.testsystems.slim.tables.SlimTableFactoryTest slimTableFactoryTest0 = new fitnesse.testsystems.slim.tables.SlimTableFactoryTest();
        fitnesse.testsystems.slim.Table table1 = null;
        slimTableFactoryTest0.table = table1;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory3 = slimTableFactoryTest0.slimTableFactory;
        java.util.Map<java.lang.String, java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable>> strMap4 = slimTableFactoryTest0.getmap();
        fitnesse.testsystems.slim.Table table5 = null;
        slimTableFactoryTest0.settable(table5);
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory7 = null;
        slimTableFactoryTest0.slimTableFactory = slimTableFactory7;
        java.lang.Class<?> wildcardClass9 = slimTableFactoryTest0.getClass();
        org.junit.Assert.assertNull(slimTableFactory3);
        org.junit.Assert.assertNull(strMap4);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test00024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00024");
        fitnesse.testsystems.slim.tables.SlimTableFactoryTest slimTableFactoryTest0 = new fitnesse.testsystems.slim.tables.SlimTableFactoryTest();
        fitnesse.testsystems.slim.Table table1 = null;
        slimTableFactoryTest0.table = table1;
        fitnesse.testsystems.slim.Table table3 = slimTableFactoryTest0.table;
        // The following exception was thrown during execution in test generation
        try {
            slimTableFactoryTest0.checkTableTypeDefineUsedForTable();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(table3);
    }

    @Test
    public void test00025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00025");
        fitnesse.testsystems.slim.tables.SlimTableFactoryTest slimTableFactoryTest0 = new fitnesse.testsystems.slim.tables.SlimTableFactoryTest();
        fitnesse.testsystems.slim.Table table1 = null;
        slimTableFactoryTest0.table = table1;
        fitnesse.testsystems.slim.Table table3 = null;
        slimTableFactoryTest0.settable(table3);
        fitnesse.testsystems.slim.Table table5 = null;
        slimTableFactoryTest0.settable(table5);
        fitnesse.testsystems.slim.Table table7 = slimTableFactoryTest0.table;
        // The following exception was thrown during execution in test generation
        try {
            slimTableFactoryTest0.commentTableShouldReturnNull();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(table7);
    }

    @Test
    public void test00026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00026");
        fitnesse.testsystems.slim.tables.SlimTableFactoryTest slimTableFactoryTest0 = new fitnesse.testsystems.slim.tables.SlimTableFactoryTest();
        fitnesse.testsystems.slim.Table table1 = null;
        slimTableFactoryTest0.table = table1;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory3 = slimTableFactoryTest0.slimTableFactory;
        java.util.Map<java.lang.String, java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable>> strMap4 = slimTableFactoryTest0.getmap();
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory5 = slimTableFactoryTest0.slimTableFactory;
        java.util.Map<java.lang.String, java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable>> strMap6 = slimTableFactoryTest0.getmap();
        java.lang.Class<?> wildcardClass7 = slimTableFactoryTest0.getClass();
        org.junit.Assert.assertNull(slimTableFactory3);
        org.junit.Assert.assertNull(strMap4);
        org.junit.Assert.assertNull(slimTableFactory5);
        org.junit.Assert.assertNull(strMap6);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test00027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00027");
        fitnesse.testsystems.slim.tables.SlimTableFactoryTest slimTableFactoryTest0 = new fitnesse.testsystems.slim.tables.SlimTableFactoryTest();
        fitnesse.testsystems.slim.Table table1 = null;
        slimTableFactoryTest0.table = table1;
        fitnesse.testsystems.slim.Table table3 = null;
        slimTableFactoryTest0.settable(table3);
        java.util.Map<java.lang.String, java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable>> strMap5 = slimTableFactoryTest0.map;
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
    public void test00028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00028");
        fitnesse.testsystems.slim.tables.SlimTableFactoryTest slimTableFactoryTest0 = new fitnesse.testsystems.slim.tables.SlimTableFactoryTest();
        fitnesse.testsystems.slim.Table table1 = null;
        slimTableFactoryTest0.table = table1;
        fitnesse.testsystems.slim.Table table3 = null;
        slimTableFactoryTest0.settable(table3);
        fitnesse.testsystems.slim.Table table5 = null;
        slimTableFactoryTest0.table = table5;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory7 = slimTableFactoryTest0.slimTableFactory;
        // The following exception was thrown during execution in test generation
        try {
            slimTableFactoryTest0.addTableTypeImport("", "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(slimTableFactory7);
    }

    @Test
    public void test00029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00029");
        fitnesse.testsystems.slim.tables.SlimTableFactoryTest slimTableFactoryTest0 = new fitnesse.testsystems.slim.tables.SlimTableFactoryTest();
        fitnesse.testsystems.slim.Table table1 = null;
        slimTableFactoryTest0.table = table1;
        fitnesse.testsystems.slim.Table table3 = slimTableFactoryTest0.table;
        java.lang.Class<?> wildcardClass4 = slimTableFactoryTest0.getClass();
        org.junit.Assert.assertNull(table3);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test00030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00030");
        fitnesse.testsystems.slim.tables.SlimTableFactoryTest slimTableFactoryTest0 = new fitnesse.testsystems.slim.tables.SlimTableFactoryTest();
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory1 = slimTableFactoryTest0.slimTableFactory;
        fitnesse.testsystems.slim.Table table2 = slimTableFactoryTest0.gettable();
        fitnesse.testsystems.slim.Table table3 = null;
        slimTableFactoryTest0.table = table3;
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
    public void test00031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00031");
        fitnesse.testsystems.slim.tables.SlimTableFactoryTest slimTableFactoryTest0 = new fitnesse.testsystems.slim.tables.SlimTableFactoryTest();
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory1 = slimTableFactoryTest0.slimTableFactory;
        fitnesse.testsystems.slim.Table table2 = slimTableFactoryTest0.gettable();
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory3 = null;
        slimTableFactoryTest0.slimTableFactory = slimTableFactory3;
        fitnesse.testsystems.slim.Table table5 = null;
        slimTableFactoryTest0.settable(table5);
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
    public void test00032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00032");
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
    }

    @Test
    public void test00033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00033");
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
        org.junit.Assert.assertNull(table10);
    }

    @Test
    public void test00034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00034");
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
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass11 = strMap10.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(table7);
        org.junit.Assert.assertNull(strMap10);
    }

    @Test
    public void test00035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00035");
        fitnesse.testsystems.slim.tables.SlimTableFactoryTest slimTableFactoryTest0 = new fitnesse.testsystems.slim.tables.SlimTableFactoryTest();
        fitnesse.testsystems.slim.Table table1 = null;
        slimTableFactoryTest0.table = table1;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory3 = null;
        slimTableFactoryTest0.slimTableFactory = slimTableFactory3;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory5 = slimTableFactoryTest0.getslimTableFactory();
        fitnesse.testsystems.slim.Table table6 = slimTableFactoryTest0.table;
        // The following exception was thrown during execution in test generation
        try {
            slimTableFactoryTest0.addTableTypeImport("", "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(slimTableFactory5);
        org.junit.Assert.assertNull(table6);
    }

    @Test
    public void test00036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00036");
        fitnesse.testsystems.slim.tables.SlimTableFactoryTest slimTableFactoryTest0 = new fitnesse.testsystems.slim.tables.SlimTableFactoryTest();
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory1 = slimTableFactoryTest0.slimTableFactory;
        fitnesse.testsystems.slim.Table table2 = slimTableFactoryTest0.gettable();
        fitnesse.testsystems.slim.Table table3 = null;
        slimTableFactoryTest0.table = table3;
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
    public void test00037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00037");
        fitnesse.testsystems.slim.tables.SlimTableFactoryTest slimTableFactoryTest0 = new fitnesse.testsystems.slim.tables.SlimTableFactoryTest();
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory1 = slimTableFactoryTest0.slimTableFactory;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory2 = slimTableFactoryTest0.slimTableFactory;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory3 = null;
        slimTableFactoryTest0.slimTableFactory = slimTableFactory3;
        // The following exception was thrown during execution in test generation
        try {
            slimTableFactoryTest0.addTableTypeImport("hi!", "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(slimTableFactory1);
        org.junit.Assert.assertNull(slimTableFactory2);
    }

    @Test
    public void test00038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00038");
        fitnesse.testsystems.slim.tables.SlimTableFactoryTest slimTableFactoryTest0 = new fitnesse.testsystems.slim.tables.SlimTableFactoryTest();
        fitnesse.testsystems.slim.Table table1 = null;
        slimTableFactoryTest0.table = table1;
        fitnesse.testsystems.slim.Table table3 = null;
        slimTableFactoryTest0.settable(table3);
        // The following exception was thrown during execution in test generation
        try {
            slimTableFactoryTest0.tableTypeStartingWithcommentColonShouldReturnNull();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test00039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00039");
        fitnesse.testsystems.slim.tables.SlimTableFactoryTest slimTableFactoryTest0 = new fitnesse.testsystems.slim.tables.SlimTableFactoryTest();
        fitnesse.testsystems.slim.Table table1 = null;
        slimTableFactoryTest0.table = table1;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory3 = slimTableFactoryTest0.slimTableFactory;
        java.util.Map<java.lang.String, java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable>> strMap4 = slimTableFactoryTest0.getmap();
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
    public void test00040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00040");
        fitnesse.testsystems.slim.tables.SlimTableFactoryTest slimTableFactoryTest0 = new fitnesse.testsystems.slim.tables.SlimTableFactoryTest();
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory1 = slimTableFactoryTest0.slimTableFactory;
        fitnesse.testsystems.slim.Table table2 = slimTableFactoryTest0.table;
        java.util.Map<java.lang.String, java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable>> strMap3 = slimTableFactoryTest0.map;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory4 = null;
        slimTableFactoryTest0.slimTableFactory = slimTableFactory4;
        fitnesse.testsystems.slim.Table table6 = null;
        slimTableFactoryTest0.table = table6;
        fitnesse.testsystems.slim.Table table8 = slimTableFactoryTest0.gettable();
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
        org.junit.Assert.assertNull(table8);
    }

    @Test
    public void test00041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00041");
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
        org.junit.Assert.assertNull(table10);
    }

    @Test
    public void test00042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00042");
        fitnesse.testsystems.slim.tables.SlimTableFactoryTest slimTableFactoryTest0 = new fitnesse.testsystems.slim.tables.SlimTableFactoryTest();
        fitnesse.testsystems.slim.Table table1 = null;
        slimTableFactoryTest0.table = table1;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory3 = slimTableFactoryTest0.slimTableFactory;
        java.util.Map<java.lang.String, java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable>> strMap4 = slimTableFactoryTest0.getmap();
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory5 = slimTableFactoryTest0.slimTableFactory;
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

    @Test
    public void test00043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00043");
        fitnesse.testsystems.slim.tables.SlimTableFactoryTest slimTableFactoryTest0 = new fitnesse.testsystems.slim.tables.SlimTableFactoryTest();
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory1 = slimTableFactoryTest0.slimTableFactory;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory2 = null;
        slimTableFactoryTest0.slimTableFactory = slimTableFactory2;
        // The following exception was thrown during execution in test generation
        try {
            slimTableFactoryTest0.tableTypeStartingWithcommentColonShouldReturnNull();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(slimTableFactory1);
    }

    @Test
    public void test00044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00044");
        fitnesse.testsystems.slim.tables.SlimTableFactoryTest slimTableFactoryTest0 = new fitnesse.testsystems.slim.tables.SlimTableFactoryTest();
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory1 = slimTableFactoryTest0.slimTableFactory;
        fitnesse.testsystems.slim.Table table2 = slimTableFactoryTest0.gettable();
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory3 = null;
        slimTableFactoryTest0.slimTableFactory = slimTableFactory3;
        fitnesse.testsystems.slim.Table table5 = null;
        slimTableFactoryTest0.settable(table5);
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory7 = slimTableFactoryTest0.slimTableFactory;
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
        org.junit.Assert.assertNull(slimTableFactory7);
        org.junit.Assert.assertNull(slimTableFactory8);
    }

    @Test
    public void test00045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00045");
        fitnesse.testsystems.slim.tables.SlimTableFactoryTest slimTableFactoryTest0 = new fitnesse.testsystems.slim.tables.SlimTableFactoryTest();
        fitnesse.testsystems.slim.Table table1 = null;
        slimTableFactoryTest0.table = table1;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory3 = slimTableFactoryTest0.slimTableFactory;
        java.util.Map<java.lang.String, java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable>> strMap4 = slimTableFactoryTest0.map;
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
    public void test00046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00046");
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
    public void test00047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00047");
        fitnesse.testsystems.slim.tables.SlimTableFactoryTest slimTableFactoryTest0 = new fitnesse.testsystems.slim.tables.SlimTableFactoryTest();
        fitnesse.testsystems.slim.Table table1 = null;
        slimTableFactoryTest0.table = table1;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory3 = slimTableFactoryTest0.slimTableFactory;
        java.util.Map<java.lang.String, java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable>> strMap4 = slimTableFactoryTest0.getmap();
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory5 = null;
        slimTableFactoryTest0.setslimTableFactory(slimTableFactory5);
        // The following exception was thrown during execution in test generation
        try {
            slimTableFactoryTest0.checkTableTypeDefinesIgnoredIfDifferentSpecified();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(slimTableFactory3);
        org.junit.Assert.assertNull(strMap4);
    }

    @Test
    public void test00048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00048");
        fitnesse.testsystems.slim.tables.SlimTableFactoryTest slimTableFactoryTest0 = new fitnesse.testsystems.slim.tables.SlimTableFactoryTest();
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory1 = slimTableFactoryTest0.slimTableFactory;
        fitnesse.testsystems.slim.Table table2 = slimTableFactoryTest0.gettable();
        fitnesse.testsystems.slim.Table table3 = null;
        slimTableFactoryTest0.table = table3;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory5 = slimTableFactoryTest0.getslimTableFactory();
        // The following exception was thrown during execution in test generation
        try {
            slimTableFactoryTest0.addTableTypeImport("", "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(slimTableFactory1);
        org.junit.Assert.assertNull(table2);
        org.junit.Assert.assertNull(slimTableFactory5);
    }

    @Test
    public void test00049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00049");
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
        // The following exception was thrown during execution in test generation
        try {
            slimTableFactoryTest0.checkTableTypeDefineUsedForTable();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(table7);
    }

    @Test
    public void test00050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00050");
        fitnesse.testsystems.slim.tables.SlimTableFactoryTest slimTableFactoryTest0 = new fitnesse.testsystems.slim.tables.SlimTableFactoryTest();
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory1 = slimTableFactoryTest0.slimTableFactory;
        fitnesse.testsystems.slim.Table table2 = slimTableFactoryTest0.gettable();
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory3 = null;
        slimTableFactoryTest0.slimTableFactory = slimTableFactory3;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory5 = null;
        slimTableFactoryTest0.setslimTableFactory(slimTableFactory5);
        // The following exception was thrown during execution in test generation
        try {
            slimTableFactoryTest0.addTableTypeImport("hi!", "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(slimTableFactory1);
        org.junit.Assert.assertNull(table2);
    }

    @Test
    public void test00051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00051");
        fitnesse.testsystems.slim.tables.SlimTableFactoryTest slimTableFactoryTest0 = new fitnesse.testsystems.slim.tables.SlimTableFactoryTest();
        fitnesse.testsystems.slim.Table table1 = null;
        slimTableFactoryTest0.table = table1;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory3 = null;
        slimTableFactoryTest0.setslimTableFactory(slimTableFactory3);
        java.util.Map<java.lang.String, java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable>> strMap5 = slimTableFactoryTest0.map;
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
    public void test00052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00052");
        fitnesse.testsystems.slim.tables.SlimTableFactoryTest slimTableFactoryTest0 = new fitnesse.testsystems.slim.tables.SlimTableFactoryTest();
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory1 = slimTableFactoryTest0.slimTableFactory;
        fitnesse.testsystems.slim.Table table2 = slimTableFactoryTest0.table;
        java.util.Map<java.lang.String, java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable>> strMap3 = slimTableFactoryTest0.map;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory4 = null;
        slimTableFactoryTest0.slimTableFactory = slimTableFactory4;
        fitnesse.testsystems.slim.Table table6 = null;
        slimTableFactoryTest0.table = table6;
        java.util.Map<java.lang.String, java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable>> strMap8 = slimTableFactoryTest0.getmap();
        // The following exception was thrown during execution in test generation
        try {
            slimTableFactoryTest0.addTableTypeImport("hi!", "hi!");
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
    public void test00053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00053");
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
    public void test00054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00054");
        fitnesse.testsystems.slim.tables.SlimTableFactoryTest slimTableFactoryTest0 = new fitnesse.testsystems.slim.tables.SlimTableFactoryTest();
        fitnesse.testsystems.slim.Table table1 = slimTableFactoryTest0.table;
        java.util.Map<java.lang.String, java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable>> strMap2 = slimTableFactoryTest0.getmap();
        fitnesse.testsystems.slim.Table table3 = null;
        slimTableFactoryTest0.table = table3;
        java.lang.Class<?> wildcardClass5 = slimTableFactoryTest0.getClass();
        org.junit.Assert.assertNull(table1);
        org.junit.Assert.assertNull(strMap2);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test00055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00055");
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
        // The following exception was thrown during execution in test generation
        try {
            slimTableFactoryTest0.checkTableTypeDefineUsedForTable();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(table7);
        org.junit.Assert.assertNull(strMap10);
    }

    @Test
    public void test00056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00056");
        fitnesse.testsystems.slim.tables.SlimTableFactoryTest slimTableFactoryTest0 = new fitnesse.testsystems.slim.tables.SlimTableFactoryTest();
        fitnesse.testsystems.slim.Table table1 = null;
        slimTableFactoryTest0.table = table1;
        fitnesse.testsystems.slim.Table table3 = null;
        slimTableFactoryTest0.settable(table3);
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory5 = null;
        slimTableFactoryTest0.setslimTableFactory(slimTableFactory5);
        fitnesse.testsystems.slim.Table table7 = slimTableFactoryTest0.table;
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
    public void test00057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00057");
        fitnesse.testsystems.slim.tables.SlimTableFactoryTest slimTableFactoryTest0 = new fitnesse.testsystems.slim.tables.SlimTableFactoryTest();
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory1 = slimTableFactoryTest0.slimTableFactory;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory2 = slimTableFactoryTest0.slimTableFactory;
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
        org.junit.Assert.assertNull(slimTableFactory2);
    }

    @Test
    public void test00058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00058");
        fitnesse.testsystems.slim.tables.SlimTableFactoryTest slimTableFactoryTest0 = new fitnesse.testsystems.slim.tables.SlimTableFactoryTest();
        fitnesse.testsystems.slim.Table table1 = null;
        slimTableFactoryTest0.table = table1;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory3 = null;
        slimTableFactoryTest0.setslimTableFactory(slimTableFactory3);
        // The following exception was thrown during execution in test generation
        try {
            slimTableFactoryTest0.checkTableTypeDefineUsedForTable();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test00059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00059");
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
    public void test00060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00060");
        fitnesse.testsystems.slim.tables.SlimTableFactoryTest slimTableFactoryTest0 = new fitnesse.testsystems.slim.tables.SlimTableFactoryTest();
        fitnesse.testsystems.slim.Table table1 = null;
        slimTableFactoryTest0.table = table1;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory3 = null;
        slimTableFactoryTest0.slimTableFactory = slimTableFactory3;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory5 = slimTableFactoryTest0.getslimTableFactory();
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
    public void test00061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00061");
        fitnesse.testsystems.slim.tables.SlimTableFactoryTest slimTableFactoryTest0 = new fitnesse.testsystems.slim.tables.SlimTableFactoryTest();
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory1 = slimTableFactoryTest0.slimTableFactory;
        fitnesse.testsystems.slim.Table table2 = slimTableFactoryTest0.table;
        java.util.Map<java.lang.String, java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable>> strMap3 = slimTableFactoryTest0.map;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory4 = null;
        slimTableFactoryTest0.slimTableFactory = slimTableFactory4;
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
    }

    @Test
    public void test00062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00062");
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
    public void test00063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00063");
        fitnesse.testsystems.slim.tables.SlimTableFactoryTest slimTableFactoryTest0 = new fitnesse.testsystems.slim.tables.SlimTableFactoryTest();
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory1 = slimTableFactoryTest0.slimTableFactory;
        fitnesse.testsystems.slim.Table table2 = slimTableFactoryTest0.gettable();
        fitnesse.testsystems.slim.Table table3 = null;
        slimTableFactoryTest0.table = table3;
        // The following exception was thrown during execution in test generation
        try {
            slimTableFactoryTest0.addTableTypeImport("hi!", "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(slimTableFactory1);
        org.junit.Assert.assertNull(table2);
    }

    @Test
    public void test00064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00064");
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
            slimTableFactoryTest0.commentTableShouldReturnNull();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(slimTableFactory1);
        org.junit.Assert.assertNull(table2);
        org.junit.Assert.assertNull(slimTableFactory7);
    }

    @Test
    public void test00065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00065");
        fitnesse.testsystems.slim.tables.SlimTableFactoryTest slimTableFactoryTest0 = new fitnesse.testsystems.slim.tables.SlimTableFactoryTest();
        fitnesse.testsystems.slim.Table table1 = null;
        slimTableFactoryTest0.table = table1;
        fitnesse.testsystems.slim.Table table3 = null;
        slimTableFactoryTest0.settable(table3);
        fitnesse.testsystems.slim.Table table5 = null;
        slimTableFactoryTest0.settable(table5);
        fitnesse.testsystems.slim.Table table7 = null;
        slimTableFactoryTest0.table = table7;
        // The following exception was thrown during execution in test generation
        try {
            slimTableFactoryTest0.shouldCreateCorrectSlimTableForTablesType();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test00066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00066");
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
            slimTableFactoryTest0.addTableTypeImport("", "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(slimTableFactory3);
        org.junit.Assert.assertNull(strMap4);
        org.junit.Assert.assertNull(strMap9);
    }

    @Test
    public void test00067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00067");
        fitnesse.testsystems.slim.tables.SlimTableFactoryTest slimTableFactoryTest0 = new fitnesse.testsystems.slim.tables.SlimTableFactoryTest();
        fitnesse.testsystems.slim.Table table1 = null;
        slimTableFactoryTest0.table = table1;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory3 = null;
        slimTableFactoryTest0.slimTableFactory = slimTableFactory3;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory5 = slimTableFactoryTest0.getslimTableFactory();
        fitnesse.testsystems.slim.Table table6 = slimTableFactoryTest0.table;
        java.lang.Class<?> wildcardClass7 = slimTableFactoryTest0.getClass();
        org.junit.Assert.assertNull(slimTableFactory5);
        org.junit.Assert.assertNull(table6);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test00068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00068");
        fitnesse.testsystems.slim.tables.SlimTableFactoryTest slimTableFactoryTest0 = new fitnesse.testsystems.slim.tables.SlimTableFactoryTest();
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory1 = slimTableFactoryTest0.slimTableFactory;
        fitnesse.testsystems.slim.Table table2 = slimTableFactoryTest0.gettable();
        fitnesse.testsystems.slim.Table table3 = null;
        slimTableFactoryTest0.table = table3;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory5 = slimTableFactoryTest0.getslimTableFactory();
        // The following exception was thrown during execution in test generation
        try {
            slimTableFactoryTest0.commentTableShouldReturnNull();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(slimTableFactory1);
        org.junit.Assert.assertNull(table2);
        org.junit.Assert.assertNull(slimTableFactory5);
    }

    @Test
    public void test00069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00069");
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
        java.lang.Class<?> wildcardClass10 = slimTableFactoryTest0.getClass();
        org.junit.Assert.assertNull(slimTableFactory5);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test00070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00070");
        fitnesse.testsystems.slim.tables.SlimTableFactoryTest slimTableFactoryTest0 = new fitnesse.testsystems.slim.tables.SlimTableFactoryTest();
        fitnesse.testsystems.slim.Table table1 = null;
        slimTableFactoryTest0.table = table1;
        fitnesse.testsystems.slim.Table table3 = null;
        slimTableFactoryTest0.settable(table3);
        java.util.Map<java.lang.String, java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable>> strMap5 = slimTableFactoryTest0.map;
        java.util.Map<java.lang.String, java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable>> strMap6 = slimTableFactoryTest0.getmap();
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory7 = slimTableFactoryTest0.slimTableFactory;
        java.util.Map<java.lang.String, java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable>> strMap8 = slimTableFactoryTest0.map;
        // The following exception was thrown during execution in test generation
        try {
            slimTableFactoryTest0.shouldCreateCorrectSlimTableForTablesType();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(strMap5);
        org.junit.Assert.assertNull(strMap6);
        org.junit.Assert.assertNull(slimTableFactory7);
        org.junit.Assert.assertNull(strMap8);
    }

    @Test
    public void test00071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00071");
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
    public void test00072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00072");
        fitnesse.testsystems.slim.tables.SlimTableFactoryTest slimTableFactoryTest0 = new fitnesse.testsystems.slim.tables.SlimTableFactoryTest();
        fitnesse.testsystems.slim.Table table1 = null;
        slimTableFactoryTest0.table = table1;
        fitnesse.testsystems.slim.Table table3 = null;
        slimTableFactoryTest0.settable(table3);
        java.util.Map<java.lang.String, java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable>> strMap5 = slimTableFactoryTest0.map;
        java.util.Map<java.lang.String, java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable>> strMap6 = slimTableFactoryTest0.getmap();
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory7 = slimTableFactoryTest0.slimTableFactory;
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
    }

    @Test
    public void test00073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00073");
        fitnesse.testsystems.slim.tables.SlimTableFactoryTest slimTableFactoryTest0 = new fitnesse.testsystems.slim.tables.SlimTableFactoryTest();
        fitnesse.testsystems.slim.Table table1 = null;
        slimTableFactoryTest0.table = table1;
        fitnesse.testsystems.slim.Table table3 = null;
        slimTableFactoryTest0.settable(table3);
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory5 = null;
        slimTableFactoryTest0.slimTableFactory = slimTableFactory5;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory7 = null;
        slimTableFactoryTest0.slimTableFactory = slimTableFactory7;
        // The following exception was thrown during execution in test generation
        try {
            slimTableFactoryTest0.tableTypeStartingWithcommentColonShouldReturnNull();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test00074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00074");
        fitnesse.testsystems.slim.tables.SlimTableFactoryTest slimTableFactoryTest0 = new fitnesse.testsystems.slim.tables.SlimTableFactoryTest();
        fitnesse.testsystems.slim.Table table1 = null;
        slimTableFactoryTest0.table = table1;
        fitnesse.testsystems.slim.Table table3 = null;
        slimTableFactoryTest0.settable(table3);
        fitnesse.testsystems.slim.Table table5 = null;
        slimTableFactoryTest0.table = table5;
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
    public void test00075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00075");
        fitnesse.testsystems.slim.tables.SlimTableFactoryTest slimTableFactoryTest0 = new fitnesse.testsystems.slim.tables.SlimTableFactoryTest();
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory1 = slimTableFactoryTest0.slimTableFactory;
        fitnesse.testsystems.slim.Table table2 = slimTableFactoryTest0.gettable();
        fitnesse.testsystems.slim.Table table3 = null;
        slimTableFactoryTest0.table = table3;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory5 = slimTableFactoryTest0.getslimTableFactory();
        // The following exception was thrown during execution in test generation
        try {
            slimTableFactoryTest0.tableTypeStartingWithcommentColonShouldReturnNull();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(slimTableFactory1);
        org.junit.Assert.assertNull(table2);
        org.junit.Assert.assertNull(slimTableFactory5);
    }

    @Test
    public void test00076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00076");
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
        java.lang.Class<?> wildcardClass15 = slimTableFactoryTest0.getClass();
        org.junit.Assert.assertNull(slimTableFactory3);
        org.junit.Assert.assertNull(strMap4);
        org.junit.Assert.assertNull(table13);
        org.junit.Assert.assertNull(slimTableFactory14);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test00077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00077");
        fitnesse.testsystems.slim.tables.SlimTableFactoryTest slimTableFactoryTest0 = new fitnesse.testsystems.slim.tables.SlimTableFactoryTest();
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory1 = slimTableFactoryTest0.slimTableFactory;
        fitnesse.testsystems.slim.Table table2 = slimTableFactoryTest0.gettable();
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory3 = null;
        slimTableFactoryTest0.slimTableFactory = slimTableFactory3;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory5 = null;
        slimTableFactoryTest0.slimTableFactory = slimTableFactory5;
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
    public void test00078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00078");
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
    }

    @Test
    public void test00079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00079");
        fitnesse.testsystems.slim.tables.SlimTableFactoryTest slimTableFactoryTest0 = new fitnesse.testsystems.slim.tables.SlimTableFactoryTest();
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory1 = slimTableFactoryTest0.slimTableFactory;
        fitnesse.testsystems.slim.Table table2 = slimTableFactoryTest0.gettable();
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory3 = null;
        slimTableFactoryTest0.slimTableFactory = slimTableFactory3;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory5 = null;
        slimTableFactoryTest0.setslimTableFactory(slimTableFactory5);
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
    public void test00080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00080");
        fitnesse.testsystems.slim.tables.SlimTableFactoryTest slimTableFactoryTest0 = new fitnesse.testsystems.slim.tables.SlimTableFactoryTest();
        fitnesse.testsystems.slim.Table table1 = null;
        slimTableFactoryTest0.table = table1;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory3 = slimTableFactoryTest0.slimTableFactory;
        java.util.Map<java.lang.String, java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable>> strMap4 = slimTableFactoryTest0.getmap();
        // The following exception was thrown during execution in test generation
        try {
            slimTableFactoryTest0.addTableTypeImport("hi!", "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(slimTableFactory3);
        org.junit.Assert.assertNull(strMap4);
    }

    @Test
    public void test00081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00081");
        fitnesse.testsystems.slim.tables.SlimTableFactoryTest slimTableFactoryTest0 = new fitnesse.testsystems.slim.tables.SlimTableFactoryTest();
        fitnesse.testsystems.slim.Table table1 = null;
        slimTableFactoryTest0.table = table1;
        fitnesse.testsystems.slim.Table table3 = slimTableFactoryTest0.table;
        fitnesse.testsystems.slim.Table table4 = slimTableFactoryTest0.gettable();
        java.util.Map<java.lang.String, java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable>> strMap5 = slimTableFactoryTest0.getmap();
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory6 = slimTableFactoryTest0.getslimTableFactory();
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
        org.junit.Assert.assertNull(slimTableFactory6);
    }

    @Test
    public void test00082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00082");
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
            slimTableFactoryTest0.shouldCreateCorrectSlimTableForTablesType();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(table7);
        org.junit.Assert.assertNull(strMap8);
    }

    @Test
    public void test00083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00083");
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
        fitnesse.testsystems.slim.Table table12 = null;
        slimTableFactoryTest0.table = table12;
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
    }

    @Test
    public void test00084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00084");
        fitnesse.testsystems.slim.tables.SlimTableFactoryTest slimTableFactoryTest0 = new fitnesse.testsystems.slim.tables.SlimTableFactoryTest();
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory1 = null;
        slimTableFactoryTest0.slimTableFactory = slimTableFactory1;
        // The following exception was thrown during execution in test generation
        try {
            slimTableFactoryTest0.checkTableTypeDefineUsedForTable();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test00085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00085");
        fitnesse.testsystems.slim.tables.SlimTableFactoryTest slimTableFactoryTest0 = new fitnesse.testsystems.slim.tables.SlimTableFactoryTest();
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory1 = slimTableFactoryTest0.slimTableFactory;
        fitnesse.testsystems.slim.Table table2 = slimTableFactoryTest0.gettable();
        fitnesse.testsystems.slim.Table table3 = null;
        slimTableFactoryTest0.table = table3;
        fitnesse.testsystems.slim.Table table5 = null;
        slimTableFactoryTest0.table = table5;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory7 = null;
        slimTableFactoryTest0.slimTableFactory = slimTableFactory7;
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
    public void test00086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00086");
        fitnesse.testsystems.slim.tables.SlimTableFactoryTest slimTableFactoryTest0 = new fitnesse.testsystems.slim.tables.SlimTableFactoryTest();
        fitnesse.testsystems.slim.Table table1 = null;
        slimTableFactoryTest0.table = table1;
        fitnesse.testsystems.slim.Table table3 = null;
        slimTableFactoryTest0.settable(table3);
        fitnesse.testsystems.slim.Table table5 = null;
        slimTableFactoryTest0.table = table5;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory7 = slimTableFactoryTest0.slimTableFactory;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory8 = slimTableFactoryTest0.slimTableFactory;
        // The following exception was thrown during execution in test generation
        try {
            slimTableFactoryTest0.addTableTypeImport("", "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(slimTableFactory7);
        org.junit.Assert.assertNull(slimTableFactory8);
    }

    @Test
    public void test00087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00087");
        fitnesse.testsystems.slim.tables.SlimTableFactoryTest slimTableFactoryTest0 = new fitnesse.testsystems.slim.tables.SlimTableFactoryTest();
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory1 = slimTableFactoryTest0.slimTableFactory;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory2 = slimTableFactoryTest0.slimTableFactory;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory3 = slimTableFactoryTest0.slimTableFactory;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory4 = null;
        slimTableFactoryTest0.slimTableFactory = slimTableFactory4;
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
    public void test00088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00088");
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
    }

    @Test
    public void test00089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00089");
        fitnesse.testsystems.slim.tables.SlimTableFactoryTest slimTableFactoryTest0 = new fitnesse.testsystems.slim.tables.SlimTableFactoryTest();
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory1 = slimTableFactoryTest0.slimTableFactory;
        fitnesse.testsystems.slim.Table table2 = slimTableFactoryTest0.gettable();
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory3 = null;
        slimTableFactoryTest0.slimTableFactory = slimTableFactory3;
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
    public void test00090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00090");
        fitnesse.testsystems.slim.tables.SlimTableFactoryTest slimTableFactoryTest0 = new fitnesse.testsystems.slim.tables.SlimTableFactoryTest();
        fitnesse.testsystems.slim.Table table1 = null;
        slimTableFactoryTest0.table = table1;
        fitnesse.testsystems.slim.Table table3 = null;
        slimTableFactoryTest0.settable(table3);
        java.util.Map<java.lang.String, java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable>> strMap5 = slimTableFactoryTest0.map;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory6 = slimTableFactoryTest0.getslimTableFactory();
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory7 = slimTableFactoryTest0.getslimTableFactory();
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
    }

    @Test
    public void test00091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00091");
        fitnesse.testsystems.slim.tables.SlimTableFactoryTest slimTableFactoryTest0 = new fitnesse.testsystems.slim.tables.SlimTableFactoryTest();
        fitnesse.testsystems.slim.Table table1 = null;
        slimTableFactoryTest0.table = table1;
        fitnesse.testsystems.slim.Table table3 = null;
        slimTableFactoryTest0.settable(table3);
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory5 = null;
        slimTableFactoryTest0.slimTableFactory = slimTableFactory5;
        // The following exception was thrown during execution in test generation
        try {
            slimTableFactoryTest0.addTableTypeImport("", "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test00092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00092");
        fitnesse.testsystems.slim.tables.SlimTableFactoryTest slimTableFactoryTest0 = new fitnesse.testsystems.slim.tables.SlimTableFactoryTest();
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory1 = slimTableFactoryTest0.slimTableFactory;
        fitnesse.testsystems.slim.Table table2 = slimTableFactoryTest0.gettable();
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory3 = null;
        slimTableFactoryTest0.slimTableFactory = slimTableFactory3;
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
    public void test00093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00093");
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
        // The following exception was thrown during execution in test generation
        try {
            slimTableFactoryTest0.shouldCreateCorrectSlimTableForTablesType();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(slimTableFactory7);
    }

    @Test
    public void test00094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00094");
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
            slimTableFactoryTest0.commentTableShouldReturnNull();
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
    public void test00095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00095");
        fitnesse.testsystems.slim.tables.SlimTableFactoryTest slimTableFactoryTest0 = new fitnesse.testsystems.slim.tables.SlimTableFactoryTest();
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory1 = slimTableFactoryTest0.slimTableFactory;
        fitnesse.testsystems.slim.Table table2 = slimTableFactoryTest0.table;
        java.util.Map<java.lang.String, java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable>> strMap3 = slimTableFactoryTest0.map;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory4 = null;
        slimTableFactoryTest0.slimTableFactory = slimTableFactory4;
        fitnesse.testsystems.slim.Table table6 = null;
        slimTableFactoryTest0.table = table6;
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
    public void test00096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00096");
        fitnesse.testsystems.slim.tables.SlimTableFactoryTest slimTableFactoryTest0 = new fitnesse.testsystems.slim.tables.SlimTableFactoryTest();
        fitnesse.testsystems.slim.Table table1 = null;
        slimTableFactoryTest0.table = table1;
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
    public void test00097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00097");
        fitnesse.testsystems.slim.tables.SlimTableFactoryTest slimTableFactoryTest0 = new fitnesse.testsystems.slim.tables.SlimTableFactoryTest();
        fitnesse.testsystems.slim.Table table1 = null;
        slimTableFactoryTest0.table = table1;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory3 = null;
        slimTableFactoryTest0.slimTableFactory = slimTableFactory3;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory5 = slimTableFactoryTest0.getslimTableFactory();
        fitnesse.testsystems.slim.Table table6 = slimTableFactoryTest0.table;
        // The following exception was thrown during execution in test generation
        try {
            slimTableFactoryTest0.checkTableTypeDefinesIgnoredIfDifferentSpecified();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(slimTableFactory5);
        org.junit.Assert.assertNull(table6);
    }

    @Test
    public void test00098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00098");
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
    public void test00099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00099");
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
    }

    @Test
    public void test00100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00100");
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
        org.junit.Assert.assertNull(slimTableFactory10);
    }

    @Test
    public void test00101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00101");
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
        java.lang.Class<?> wildcardClass11 = slimTableFactoryTest0.getClass();
        org.junit.Assert.assertNull(slimTableFactory3);
        org.junit.Assert.assertNull(strMap4);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test00102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00102");
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
            slimTableFactoryTest0.commentTableShouldReturnNull();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(slimTableFactory3);
        org.junit.Assert.assertNull(strMap4);
        org.junit.Assert.assertNull(strMap9);
    }

    @Test
    public void test00103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00103");
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
        java.lang.Class<?> wildcardClass12 = slimTableFactoryTest0.getClass();
        org.junit.Assert.assertNull(slimTableFactory1);
        org.junit.Assert.assertNull(table2);
        org.junit.Assert.assertNull(slimTableFactory7);
        org.junit.Assert.assertNull(slimTableFactory8);
        org.junit.Assert.assertNull(table9);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test00104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00104");
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
        org.junit.Assert.assertNull(table10);
    }

    @Test
    public void test00105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00105");
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
    public void test00106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00106");
        fitnesse.testsystems.slim.tables.SlimTableFactoryTest slimTableFactoryTest0 = new fitnesse.testsystems.slim.tables.SlimTableFactoryTest();
        fitnesse.testsystems.slim.Table table1 = null;
        slimTableFactoryTest0.table = table1;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory3 = null;
        slimTableFactoryTest0.slimTableFactory = slimTableFactory3;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory5 = slimTableFactoryTest0.getslimTableFactory();
        fitnesse.testsystems.slim.Table table6 = null;
        slimTableFactoryTest0.settable(table6);
        // The following exception was thrown during execution in test generation
        try {
            slimTableFactoryTest0.checkTableTypeDefinesIgnoredIfDifferentSpecified();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(slimTableFactory5);
    }

    @Test
    public void test00107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00107");
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
        // The following exception was thrown during execution in test generation
        try {
            slimTableFactoryTest0.tableTypeStartingWithcommentColonShouldReturnNull();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(slimTableFactory9);
    }

    @Test
    public void test00108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00108");
        fitnesse.testsystems.slim.tables.SlimTableFactoryTest slimTableFactoryTest0 = new fitnesse.testsystems.slim.tables.SlimTableFactoryTest();
        fitnesse.testsystems.slim.Table table1 = null;
        slimTableFactoryTest0.table = table1;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory3 = null;
        slimTableFactoryTest0.slimTableFactory = slimTableFactory3;
        // The following exception was thrown during execution in test generation
        try {
            slimTableFactoryTest0.tableTypeStartingWithcommentColonShouldReturnNull();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test00109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00109");
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
            java.lang.Class<?> wildcardClass10 = table9.getClass();
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
    public void test00110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00110");
        fitnesse.testsystems.slim.tables.SlimTableFactoryTest slimTableFactoryTest0 = new fitnesse.testsystems.slim.tables.SlimTableFactoryTest();
        fitnesse.testsystems.slim.Table table1 = null;
        slimTableFactoryTest0.table = table1;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory3 = null;
        slimTableFactoryTest0.setslimTableFactory(slimTableFactory3);
        java.util.Map<java.lang.String, java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable>> strMap5 = slimTableFactoryTest0.map;
        // The following exception was thrown during execution in test generation
        try {
            slimTableFactoryTest0.shouldCreateCorrectSlimTableForTablesType();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(strMap5);
    }

    @Test
    public void test00111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00111");
        fitnesse.testsystems.slim.tables.SlimTableFactoryTest slimTableFactoryTest0 = new fitnesse.testsystems.slim.tables.SlimTableFactoryTest();
        fitnesse.testsystems.slim.Table table1 = null;
        slimTableFactoryTest0.table = table1;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory3 = slimTableFactoryTest0.slimTableFactory;
        java.util.Map<java.lang.String, java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable>> strMap4 = slimTableFactoryTest0.map;
        fitnesse.testsystems.slim.Table table5 = slimTableFactoryTest0.table;
        // The following exception was thrown during execution in test generation
        try {
            slimTableFactoryTest0.shouldCreateCorrectSlimTableForTablesType();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(slimTableFactory3);
        org.junit.Assert.assertNull(strMap4);
        org.junit.Assert.assertNull(table5);
    }

    @Test
    public void test00112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00112");
        fitnesse.testsystems.slim.tables.SlimTableFactoryTest slimTableFactoryTest0 = new fitnesse.testsystems.slim.tables.SlimTableFactoryTest();
        fitnesse.testsystems.slim.Table table1 = null;
        slimTableFactoryTest0.table = table1;
        fitnesse.testsystems.slim.Table table3 = null;
        slimTableFactoryTest0.settable(table3);
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory5 = null;
        slimTableFactoryTest0.setslimTableFactory(slimTableFactory5);
        java.util.Map<java.lang.String, java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable>> strMap7 = slimTableFactoryTest0.map;
        java.util.Map<java.lang.String, java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable>> strMap8 = slimTableFactoryTest0.getmap();
        // The following exception was thrown during execution in test generation
        try {
            slimTableFactoryTest0.commentTableShouldReturnNull();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(strMap7);
        org.junit.Assert.assertNull(strMap8);
    }

    @Test
    public void test00113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00113");
        fitnesse.testsystems.slim.tables.SlimTableFactoryTest slimTableFactoryTest0 = new fitnesse.testsystems.slim.tables.SlimTableFactoryTest();
        fitnesse.testsystems.slim.Table table1 = null;
        slimTableFactoryTest0.table = table1;
        fitnesse.testsystems.slim.Table table3 = null;
        slimTableFactoryTest0.settable(table3);
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory5 = null;
        slimTableFactoryTest0.setslimTableFactory(slimTableFactory5);
        java.util.Map<java.lang.String, java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable>> strMap7 = slimTableFactoryTest0.map;
        java.util.Map<java.lang.String, java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable>> strMap8 = slimTableFactoryTest0.getmap();
        // The following exception was thrown during execution in test generation
        try {
            slimTableFactoryTest0.addTableTypeImport("", "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(strMap7);
        org.junit.Assert.assertNull(strMap8);
    }

    @Test
    public void test00114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00114");
        fitnesse.testsystems.slim.tables.SlimTableFactoryTest slimTableFactoryTest0 = new fitnesse.testsystems.slim.tables.SlimTableFactoryTest();
        fitnesse.testsystems.slim.Table table1 = null;
        slimTableFactoryTest0.table = table1;
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
        org.junit.Assert.assertNull(strMap5);
    }

    @Test
    public void test00115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00115");
        fitnesse.testsystems.slim.tables.SlimTableFactoryTest slimTableFactoryTest0 = new fitnesse.testsystems.slim.tables.SlimTableFactoryTest();
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory1 = slimTableFactoryTest0.slimTableFactory;
        fitnesse.testsystems.slim.Table table2 = slimTableFactoryTest0.gettable();
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory3 = null;
        slimTableFactoryTest0.slimTableFactory = slimTableFactory3;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory5 = null;
        slimTableFactoryTest0.slimTableFactory = slimTableFactory5;
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
    public void test00116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00116");
        fitnesse.testsystems.slim.tables.SlimTableFactoryTest slimTableFactoryTest0 = new fitnesse.testsystems.slim.tables.SlimTableFactoryTest();
        fitnesse.testsystems.slim.Table table1 = null;
        slimTableFactoryTest0.table = table1;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory3 = slimTableFactoryTest0.getslimTableFactory();
        fitnesse.testsystems.slim.Table table4 = slimTableFactoryTest0.gettable();
        // The following exception was thrown during execution in test generation
        try {
            slimTableFactoryTest0.tableTypeStartingWithcommentColonShouldReturnNull();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(slimTableFactory3);
        org.junit.Assert.assertNull(table4);
    }

    @Test
    public void test00117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00117");
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
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass12 = strMap11.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(slimTableFactory3);
        org.junit.Assert.assertNull(strMap4);
        org.junit.Assert.assertNull(strMap11);
    }

    @Test
    public void test00118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00118");
        fitnesse.testsystems.slim.tables.SlimTableFactoryTest slimTableFactoryTest0 = new fitnesse.testsystems.slim.tables.SlimTableFactoryTest();
        fitnesse.testsystems.slim.Table table1 = null;
        slimTableFactoryTest0.table = table1;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory3 = slimTableFactoryTest0.slimTableFactory;
        java.util.Map<java.lang.String, java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable>> strMap4 = slimTableFactoryTest0.getmap();
        fitnesse.testsystems.slim.Table table5 = null;
        slimTableFactoryTest0.settable(table5);
        // The following exception was thrown during execution in test generation
        try {
            slimTableFactoryTest0.addTableTypeImport("", "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(slimTableFactory3);
        org.junit.Assert.assertNull(strMap4);
    }

    @Test
    public void test00119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00119");
        fitnesse.testsystems.slim.tables.SlimTableFactoryTest slimTableFactoryTest0 = new fitnesse.testsystems.slim.tables.SlimTableFactoryTest();
        fitnesse.testsystems.slim.Table table1 = null;
        slimTableFactoryTest0.table = table1;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory3 = null;
        slimTableFactoryTest0.slimTableFactory = slimTableFactory3;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory5 = slimTableFactoryTest0.getslimTableFactory();
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory6 = slimTableFactoryTest0.slimTableFactory;
        java.lang.Class<?> wildcardClass7 = slimTableFactoryTest0.getClass();
        org.junit.Assert.assertNull(slimTableFactory5);
        org.junit.Assert.assertNull(slimTableFactory6);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test00120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00120");
        fitnesse.testsystems.slim.tables.SlimTableFactoryTest slimTableFactoryTest0 = new fitnesse.testsystems.slim.tables.SlimTableFactoryTest();
        fitnesse.testsystems.slim.Table table1 = null;
        slimTableFactoryTest0.table = table1;
        fitnesse.testsystems.slim.Table table3 = null;
        slimTableFactoryTest0.settable(table3);
        fitnesse.testsystems.slim.Table table5 = null;
        slimTableFactoryTest0.settable(table5);
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory7 = slimTableFactoryTest0.slimTableFactory;
        // The following exception was thrown during execution in test generation
        try {
            slimTableFactoryTest0.commentTableShouldReturnNull();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(slimTableFactory7);
    }

    @Test
    public void test00121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00121");
        fitnesse.testsystems.slim.tables.SlimTableFactoryTest slimTableFactoryTest0 = new fitnesse.testsystems.slim.tables.SlimTableFactoryTest();
        fitnesse.testsystems.slim.Table table1 = null;
        slimTableFactoryTest0.table = table1;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory3 = slimTableFactoryTest0.slimTableFactory;
        java.util.Map<java.lang.String, java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable>> strMap4 = slimTableFactoryTest0.getmap();
        fitnesse.testsystems.slim.Table table5 = null;
        slimTableFactoryTest0.settable(table5);
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
    }

    @Test
    public void test00122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00122");
        fitnesse.testsystems.slim.tables.SlimTableFactoryTest slimTableFactoryTest0 = new fitnesse.testsystems.slim.tables.SlimTableFactoryTest();
        fitnesse.testsystems.slim.Table table1 = null;
        slimTableFactoryTest0.table = table1;
        fitnesse.testsystems.slim.Table table3 = slimTableFactoryTest0.table;
        fitnesse.testsystems.slim.Table table4 = slimTableFactoryTest0.gettable();
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory5 = slimTableFactoryTest0.slimTableFactory;
        fitnesse.testsystems.slim.Table table6 = null;
        slimTableFactoryTest0.settable(table6);
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
    public void test00123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00123");
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
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory11 = null;
        slimTableFactoryTest0.setslimTableFactory(slimTableFactory11);
        // The following exception was thrown during execution in test generation
        try {
            slimTableFactoryTest0.checkTableTypeDefineUsedForTable();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(slimTableFactory5);
        org.junit.Assert.assertNull(strMap10);
    }

    @Test
    public void test00124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00124");
        fitnesse.testsystems.slim.tables.SlimTableFactoryTest slimTableFactoryTest0 = new fitnesse.testsystems.slim.tables.SlimTableFactoryTest();
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory1 = slimTableFactoryTest0.slimTableFactory;
        fitnesse.testsystems.slim.Table table2 = slimTableFactoryTest0.gettable();
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory3 = null;
        slimTableFactoryTest0.slimTableFactory = slimTableFactory3;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory5 = null;
        slimTableFactoryTest0.slimTableFactory = slimTableFactory5;
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
        org.junit.Assert.assertNull(slimTableFactory1);
        org.junit.Assert.assertNull(table2);
        org.junit.Assert.assertNull(slimTableFactory7);
    }

    @Test
    public void test00125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00125");
        fitnesse.testsystems.slim.tables.SlimTableFactoryTest slimTableFactoryTest0 = new fitnesse.testsystems.slim.tables.SlimTableFactoryTest();
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory1 = slimTableFactoryTest0.slimTableFactory;
        fitnesse.testsystems.slim.Table table2 = slimTableFactoryTest0.table;
        java.util.Map<java.lang.String, java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable>> strMap3 = slimTableFactoryTest0.map;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory4 = null;
        slimTableFactoryTest0.slimTableFactory = slimTableFactory4;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory6 = null;
        slimTableFactoryTest0.slimTableFactory = slimTableFactory6;
        fitnesse.testsystems.slim.Table table8 = null;
        slimTableFactoryTest0.table = table8;
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
    public void test00126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00126");
        fitnesse.testsystems.slim.tables.SlimTableFactoryTest slimTableFactoryTest0 = new fitnesse.testsystems.slim.tables.SlimTableFactoryTest();
        fitnesse.testsystems.slim.Table table1 = null;
        slimTableFactoryTest0.table = table1;
        fitnesse.testsystems.slim.Table table3 = null;
        slimTableFactoryTest0.settable(table3);
        java.util.Map<java.lang.String, java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable>> strMap5 = slimTableFactoryTest0.map;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory6 = slimTableFactoryTest0.getslimTableFactory();
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory7 = slimTableFactoryTest0.getslimTableFactory();
        fitnesse.testsystems.slim.Table table8 = slimTableFactoryTest0.gettable();
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
    public void test00127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00127");
        fitnesse.testsystems.slim.tables.SlimTableFactoryTest slimTableFactoryTest0 = new fitnesse.testsystems.slim.tables.SlimTableFactoryTest();
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory1 = slimTableFactoryTest0.slimTableFactory;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory2 = slimTableFactoryTest0.slimTableFactory;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory3 = slimTableFactoryTest0.slimTableFactory;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory4 = null;
        slimTableFactoryTest0.slimTableFactory = slimTableFactory4;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory6 = slimTableFactoryTest0.slimTableFactory;
        java.lang.Class<?> wildcardClass7 = slimTableFactoryTest0.getClass();
        org.junit.Assert.assertNull(slimTableFactory1);
        org.junit.Assert.assertNull(slimTableFactory2);
        org.junit.Assert.assertNull(slimTableFactory3);
        org.junit.Assert.assertNull(slimTableFactory6);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test00128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00128");
        fitnesse.testsystems.slim.tables.SlimTableFactoryTest slimTableFactoryTest0 = new fitnesse.testsystems.slim.tables.SlimTableFactoryTest();
        fitnesse.testsystems.slim.Table table1 = null;
        slimTableFactoryTest0.table = table1;
        fitnesse.testsystems.slim.Table table3 = slimTableFactoryTest0.table;
        fitnesse.testsystems.slim.Table table4 = slimTableFactoryTest0.gettable();
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory5 = slimTableFactoryTest0.slimTableFactory;
        fitnesse.testsystems.slim.Table table6 = null;
        slimTableFactoryTest0.settable(table6);
        fitnesse.testsystems.slim.Table table8 = slimTableFactoryTest0.table;
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
        org.junit.Assert.assertNull(table8);
    }

    @Test
    public void test00129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00129");
        fitnesse.testsystems.slim.tables.SlimTableFactoryTest slimTableFactoryTest0 = new fitnesse.testsystems.slim.tables.SlimTableFactoryTest();
        fitnesse.testsystems.slim.Table table1 = null;
        slimTableFactoryTest0.table = table1;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory3 = slimTableFactoryTest0.slimTableFactory;
        java.util.Map<java.lang.String, java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable>> strMap4 = slimTableFactoryTest0.getmap();
        fitnesse.testsystems.slim.Table table5 = null;
        slimTableFactoryTest0.settable(table5);
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory7 = null;
        slimTableFactoryTest0.slimTableFactory = slimTableFactory7;
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
    public void test00130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00130");
        fitnesse.testsystems.slim.tables.SlimTableFactoryTest slimTableFactoryTest0 = new fitnesse.testsystems.slim.tables.SlimTableFactoryTest();
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory1 = slimTableFactoryTest0.slimTableFactory;
        fitnesse.testsystems.slim.Table table2 = slimTableFactoryTest0.gettable();
        fitnesse.testsystems.slim.Table table3 = null;
        slimTableFactoryTest0.table = table3;
        fitnesse.testsystems.slim.Table table5 = null;
        slimTableFactoryTest0.table = table5;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory7 = null;
        slimTableFactoryTest0.slimTableFactory = slimTableFactory7;
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
    public void test00131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00131");
        fitnesse.testsystems.slim.tables.SlimTableFactoryTest slimTableFactoryTest0 = new fitnesse.testsystems.slim.tables.SlimTableFactoryTest();
        fitnesse.testsystems.slim.Table table1 = null;
        slimTableFactoryTest0.table = table1;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory3 = slimTableFactoryTest0.slimTableFactory;
        java.util.Map<java.lang.String, java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable>> strMap4 = slimTableFactoryTest0.getmap();
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
    public void test00132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00132");
        fitnesse.testsystems.slim.tables.SlimTableFactoryTest slimTableFactoryTest0 = new fitnesse.testsystems.slim.tables.SlimTableFactoryTest();
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory1 = slimTableFactoryTest0.slimTableFactory;
        fitnesse.testsystems.slim.Table table2 = slimTableFactoryTest0.gettable();
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory3 = null;
        slimTableFactoryTest0.slimTableFactory = slimTableFactory3;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory5 = null;
        slimTableFactoryTest0.slimTableFactory = slimTableFactory5;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory7 = slimTableFactoryTest0.slimTableFactory;
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
    public void test00133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00133");
        fitnesse.testsystems.slim.tables.SlimTableFactoryTest slimTableFactoryTest0 = new fitnesse.testsystems.slim.tables.SlimTableFactoryTest();
        fitnesse.testsystems.slim.Table table1 = null;
        slimTableFactoryTest0.table = table1;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory3 = slimTableFactoryTest0.slimTableFactory;
        java.util.Map<java.lang.String, java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable>> strMap4 = slimTableFactoryTest0.getmap();
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory5 = null;
        slimTableFactoryTest0.setslimTableFactory(slimTableFactory5);
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
    public void test00134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00134");
        fitnesse.testsystems.slim.tables.SlimTableFactoryTest slimTableFactoryTest0 = new fitnesse.testsystems.slim.tables.SlimTableFactoryTest();
        fitnesse.testsystems.slim.Table table1 = null;
        slimTableFactoryTest0.table = table1;
        fitnesse.testsystems.slim.Table table3 = null;
        slimTableFactoryTest0.settable(table3);
        fitnesse.testsystems.slim.Table table5 = null;
        slimTableFactoryTest0.settable(table5);
        // The following exception was thrown during execution in test generation
        try {
            slimTableFactoryTest0.addTableTypeImport("hi!", "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test00135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00135");
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
        org.junit.Assert.assertNull(table10);
    }

    @Test
    public void test00136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00136");
        fitnesse.testsystems.slim.tables.SlimTableFactoryTest slimTableFactoryTest0 = new fitnesse.testsystems.slim.tables.SlimTableFactoryTest();
        fitnesse.testsystems.slim.Table table1 = null;
        slimTableFactoryTest0.table = table1;
        fitnesse.testsystems.slim.Table table3 = null;
        slimTableFactoryTest0.settable(table3);
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory5 = null;
        slimTableFactoryTest0.setslimTableFactory(slimTableFactory5);
        fitnesse.testsystems.slim.Table table7 = slimTableFactoryTest0.table;
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
    public void test00137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00137");
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
    }

    @Test
    public void test00138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00138");
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
        // The following exception was thrown during execution in test generation
        try {
            slimTableFactoryTest0.shouldCreateCorrectSlimTableForTablesType();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test00139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00139");
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
    }

    @Test
    public void test00140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00140");
        fitnesse.testsystems.slim.tables.SlimTableFactoryTest slimTableFactoryTest0 = new fitnesse.testsystems.slim.tables.SlimTableFactoryTest();
        fitnesse.testsystems.slim.Table table1 = null;
        slimTableFactoryTest0.table = table1;
        fitnesse.testsystems.slim.Table table3 = slimTableFactoryTest0.table;
        fitnesse.testsystems.slim.Table table4 = slimTableFactoryTest0.gettable();
        java.util.Map<java.lang.String, java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable>> strMap5 = slimTableFactoryTest0.getmap();
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory6 = slimTableFactoryTest0.getslimTableFactory();
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory7 = null;
        slimTableFactoryTest0.slimTableFactory = slimTableFactory7;
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
        org.junit.Assert.assertNull(slimTableFactory6);
    }

    @Test
    public void test00141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00141");
        fitnesse.testsystems.slim.tables.SlimTableFactoryTest slimTableFactoryTest0 = new fitnesse.testsystems.slim.tables.SlimTableFactoryTest();
        fitnesse.testsystems.slim.Table table1 = null;
        slimTableFactoryTest0.table = table1;
        fitnesse.testsystems.slim.Table table3 = null;
        slimTableFactoryTest0.settable(table3);
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory5 = null;
        slimTableFactoryTest0.slimTableFactory = slimTableFactory5;
        // The following exception was thrown during execution in test generation
        try {
            slimTableFactoryTest0.shouldCreateCorrectSlimTableForTablesType();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test00142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00142");
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
            slimTableFactoryTest0.tableTypeStartingWithcommentColonShouldReturnNull();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(strMap5);
    }

    @Test
    public void test00143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00143");
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
        // The following exception was thrown during execution in test generation
        try {
            slimTableFactoryTest0.tableTypeStartingWithcommentColonShouldReturnNull();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(slimTableFactory7);
    }

    @Test
    public void test00144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00144");
        fitnesse.testsystems.slim.tables.SlimTableFactoryTest slimTableFactoryTest0 = new fitnesse.testsystems.slim.tables.SlimTableFactoryTest();
        fitnesse.testsystems.slim.Table table1 = null;
        slimTableFactoryTest0.table = table1;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory3 = slimTableFactoryTest0.slimTableFactory;
        java.util.Map<java.lang.String, java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable>> strMap4 = slimTableFactoryTest0.getmap();
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory5 = slimTableFactoryTest0.getslimTableFactory();
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
    }

    @Test
    public void test00145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00145");
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
        // The following exception was thrown during execution in test generation
        try {
            slimTableFactoryTest0.tableTypeStartingWithcommentColonShouldReturnNull();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(slimTableFactory3);
        org.junit.Assert.assertNull(strMap4);
        org.junit.Assert.assertNull(strMap11);
    }

    @Test
    public void test00146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00146");
        fitnesse.testsystems.slim.tables.SlimTableFactoryTest slimTableFactoryTest0 = new fitnesse.testsystems.slim.tables.SlimTableFactoryTest();
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory1 = slimTableFactoryTest0.slimTableFactory;
        fitnesse.testsystems.slim.Table table2 = slimTableFactoryTest0.gettable();
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory3 = null;
        slimTableFactoryTest0.slimTableFactory = slimTableFactory3;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory5 = null;
        slimTableFactoryTest0.slimTableFactory = slimTableFactory5;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory7 = null;
        slimTableFactoryTest0.setslimTableFactory(slimTableFactory7);
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
    public void test00147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00147");
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
            slimTableFactoryTest0.shouldCreateCorrectSlimTableForTablesType();
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
    public void test00148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00148");
        fitnesse.testsystems.slim.tables.SlimTableFactoryTest slimTableFactoryTest0 = new fitnesse.testsystems.slim.tables.SlimTableFactoryTest();
        fitnesse.testsystems.slim.Table table1 = null;
        slimTableFactoryTest0.table = table1;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory3 = slimTableFactoryTest0.slimTableFactory;
        java.util.Map<java.lang.String, java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable>> strMap4 = slimTableFactoryTest0.getmap();
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory5 = slimTableFactoryTest0.getslimTableFactory();
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
    }

    @Test
    public void test00149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00149");
        fitnesse.testsystems.slim.tables.SlimTableFactoryTest slimTableFactoryTest0 = new fitnesse.testsystems.slim.tables.SlimTableFactoryTest();
        fitnesse.testsystems.slim.Table table1 = null;
        slimTableFactoryTest0.table = table1;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory3 = slimTableFactoryTest0.slimTableFactory;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory4 = null;
        slimTableFactoryTest0.setslimTableFactory(slimTableFactory4);
        java.util.Map<java.lang.String, java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable>> strMap6 = slimTableFactoryTest0.getmap();
        fitnesse.testsystems.slim.Table table7 = null;
        slimTableFactoryTest0.table = table7;
        java.lang.Class<?> wildcardClass9 = slimTableFactoryTest0.getClass();
        org.junit.Assert.assertNull(slimTableFactory3);
        org.junit.Assert.assertNull(strMap6);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test00150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00150");
        fitnesse.testsystems.slim.tables.SlimTableFactoryTest slimTableFactoryTest0 = new fitnesse.testsystems.slim.tables.SlimTableFactoryTest();
        fitnesse.testsystems.slim.Table table1 = null;
        slimTableFactoryTest0.table = table1;
        fitnesse.testsystems.slim.Table table3 = slimTableFactoryTest0.table;
        fitnesse.testsystems.slim.Table table4 = slimTableFactoryTest0.gettable();
        java.util.Map<java.lang.String, java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable>> strMap5 = slimTableFactoryTest0.getmap();
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory6 = slimTableFactoryTest0.getslimTableFactory();
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
        org.junit.Assert.assertNull(slimTableFactory6);
    }

    @Test
    public void test00151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00151");
        fitnesse.testsystems.slim.tables.SlimTableFactoryTest slimTableFactoryTest0 = new fitnesse.testsystems.slim.tables.SlimTableFactoryTest();
        fitnesse.testsystems.slim.Table table1 = slimTableFactoryTest0.table;
        java.util.Map<java.lang.String, java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable>> strMap2 = slimTableFactoryTest0.getmap();
        java.util.Map<java.lang.String, java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable>> strMap3 = slimTableFactoryTest0.getmap();
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory4 = slimTableFactoryTest0.slimTableFactory;
        fitnesse.testsystems.slim.Table table5 = null;
        slimTableFactoryTest0.settable(table5);
        fitnesse.testsystems.slim.Table table7 = slimTableFactoryTest0.table;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass8 = table7.getClass();
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
    public void test00152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00152");
        fitnesse.testsystems.slim.tables.SlimTableFactoryTest slimTableFactoryTest0 = new fitnesse.testsystems.slim.tables.SlimTableFactoryTest();
        fitnesse.testsystems.slim.Table table1 = null;
        slimTableFactoryTest0.table = table1;
        fitnesse.testsystems.slim.Table table3 = slimTableFactoryTest0.table;
        fitnesse.testsystems.slim.Table table4 = slimTableFactoryTest0.gettable();
        java.util.Map<java.lang.String, java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable>> strMap5 = slimTableFactoryTest0.getmap();
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
    }

    @Test
    public void test00153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00153");
        fitnesse.testsystems.slim.tables.SlimTableFactoryTest slimTableFactoryTest0 = new fitnesse.testsystems.slim.tables.SlimTableFactoryTest();
        fitnesse.testsystems.slim.Table table1 = null;
        slimTableFactoryTest0.table = table1;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory3 = slimTableFactoryTest0.slimTableFactory;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory4 = slimTableFactoryTest0.slimTableFactory;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory5 = slimTableFactoryTest0.slimTableFactory;
        // The following exception was thrown during execution in test generation
        try {
            slimTableFactoryTest0.shouldCreateCorrectSlimTableForTablesType();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(slimTableFactory3);
        org.junit.Assert.assertNull(slimTableFactory4);
        org.junit.Assert.assertNull(slimTableFactory5);
    }

    @Test
    public void test00154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00154");
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
            slimTableFactoryTest0.shouldCreateCorrectSlimTableForTablesType();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(table7);
        org.junit.Assert.assertNull(table8);
    }

    @Test
    public void test00155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00155");
        fitnesse.testsystems.slim.tables.SlimTableFactoryTest slimTableFactoryTest0 = new fitnesse.testsystems.slim.tables.SlimTableFactoryTest();
        fitnesse.testsystems.slim.Table table1 = null;
        slimTableFactoryTest0.table = table1;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory3 = null;
        slimTableFactoryTest0.setslimTableFactory(slimTableFactory3);
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory5 = slimTableFactoryTest0.slimTableFactory;
        java.util.Map<java.lang.String, java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable>> strMap6 = slimTableFactoryTest0.getmap();
        // The following exception was thrown during execution in test generation
        try {
            slimTableFactoryTest0.checkTableTypeDefinesIgnoredIfDifferentSpecified();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(slimTableFactory5);
        org.junit.Assert.assertNull(strMap6);
    }

    @Test
    public void test00156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00156");
        fitnesse.testsystems.slim.tables.SlimTableFactoryTest slimTableFactoryTest0 = new fitnesse.testsystems.slim.tables.SlimTableFactoryTest();
        fitnesse.testsystems.slim.Table table1 = null;
        slimTableFactoryTest0.table = table1;
        fitnesse.testsystems.slim.Table table3 = slimTableFactoryTest0.table;
        fitnesse.testsystems.slim.Table table4 = slimTableFactoryTest0.gettable();
        java.util.Map<java.lang.String, java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable>> strMap5 = slimTableFactoryTest0.getmap();
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory6 = slimTableFactoryTest0.getslimTableFactory();
        // The following exception was thrown during execution in test generation
        try {
            slimTableFactoryTest0.shouldCreateCorrectSlimTableForTablesType();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(table3);
        org.junit.Assert.assertNull(table4);
        org.junit.Assert.assertNull(strMap5);
        org.junit.Assert.assertNull(slimTableFactory6);
    }

    @Test
    public void test00157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00157");
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
            slimTableFactoryTest0.checkTableTypeDefinesIgnoredIfDifferentSpecified();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(slimTableFactory3);
        org.junit.Assert.assertNull(strMap4);
    }

    @Test
    public void test00158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00158");
        fitnesse.testsystems.slim.tables.SlimTableFactoryTest slimTableFactoryTest0 = new fitnesse.testsystems.slim.tables.SlimTableFactoryTest();
        fitnesse.testsystems.slim.Table table1 = slimTableFactoryTest0.table;
        java.util.Map<java.lang.String, java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable>> strMap2 = slimTableFactoryTest0.getmap();
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory3 = slimTableFactoryTest0.slimTableFactory;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory4 = slimTableFactoryTest0.slimTableFactory;
        java.lang.Class<?> wildcardClass5 = slimTableFactoryTest0.getClass();
        org.junit.Assert.assertNull(table1);
        org.junit.Assert.assertNull(strMap2);
        org.junit.Assert.assertNull(slimTableFactory3);
        org.junit.Assert.assertNull(slimTableFactory4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test00159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00159");
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
            slimTableFactoryTest0.checkTableTypeDefineUsedForTable();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(strMap5);
    }

    @Test
    public void test00160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00160");
        fitnesse.testsystems.slim.tables.SlimTableFactoryTest slimTableFactoryTest0 = new fitnesse.testsystems.slim.tables.SlimTableFactoryTest();
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory1 = slimTableFactoryTest0.slimTableFactory;
        fitnesse.testsystems.slim.Table table2 = slimTableFactoryTest0.gettable();
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory3 = null;
        slimTableFactoryTest0.slimTableFactory = slimTableFactory3;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory5 = null;
        slimTableFactoryTest0.slimTableFactory = slimTableFactory5;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory7 = slimTableFactoryTest0.slimTableFactory;
        java.util.Map<java.lang.String, java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable>> strMap8 = slimTableFactoryTest0.map;
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
        org.junit.Assert.assertNull(strMap8);
    }

    @Test
    public void test00161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00161");
        fitnesse.testsystems.slim.tables.SlimTableFactoryTest slimTableFactoryTest0 = new fitnesse.testsystems.slim.tables.SlimTableFactoryTest();
        fitnesse.testsystems.slim.Table table1 = null;
        slimTableFactoryTest0.table = table1;
        // The following exception was thrown during execution in test generation
        try {
            slimTableFactoryTest0.addTableTypeImport("hi!", "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test00162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00162");
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
    }

    @Test
    public void test00163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00163");
        fitnesse.testsystems.slim.tables.SlimTableFactoryTest slimTableFactoryTest0 = new fitnesse.testsystems.slim.tables.SlimTableFactoryTest();
        fitnesse.testsystems.slim.Table table1 = null;
        slimTableFactoryTest0.table = table1;
        fitnesse.testsystems.slim.Table table3 = null;
        slimTableFactoryTest0.settable(table3);
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory5 = null;
        slimTableFactoryTest0.setslimTableFactory(slimTableFactory5);
        java.util.Map<java.lang.String, java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable>> strMap7 = slimTableFactoryTest0.map;
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
    public void test00164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00164");
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
    public void test00165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00165");
        fitnesse.testsystems.slim.tables.SlimTableFactoryTest slimTableFactoryTest0 = new fitnesse.testsystems.slim.tables.SlimTableFactoryTest();
        fitnesse.testsystems.slim.Table table1 = null;
        slimTableFactoryTest0.table = table1;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory3 = null;
        slimTableFactoryTest0.slimTableFactory = slimTableFactory3;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory5 = slimTableFactoryTest0.getslimTableFactory();
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory6 = slimTableFactoryTest0.getslimTableFactory();
        // The following exception was thrown during execution in test generation
        try {
            slimTableFactoryTest0.checkTableTypeDefineUsedForTable();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(slimTableFactory5);
        org.junit.Assert.assertNull(slimTableFactory6);
    }

    @Test
    public void test00166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00166");
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
    }

    @Test
    public void test00167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00167");
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
        java.util.Map<java.lang.String, java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable>> strMap11 = slimTableFactoryTest0.map;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory12 = slimTableFactoryTest0.getslimTableFactory();
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
        org.junit.Assert.assertNull(table10);
        org.junit.Assert.assertNull(strMap11);
        org.junit.Assert.assertNull(slimTableFactory12);
    }

    @Test
    public void test00168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00168");
        fitnesse.testsystems.slim.tables.SlimTableFactoryTest slimTableFactoryTest0 = new fitnesse.testsystems.slim.tables.SlimTableFactoryTest();
        fitnesse.testsystems.slim.Table table1 = null;
        slimTableFactoryTest0.table = table1;
        fitnesse.testsystems.slim.Table table3 = null;
        slimTableFactoryTest0.settable(table3);
        java.util.Map<java.lang.String, java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable>> strMap5 = slimTableFactoryTest0.getmap();
        // The following exception was thrown during execution in test generation
        try {
            slimTableFactoryTest0.addTableTypeImport("", "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(strMap5);
    }

    @Test
    public void test00169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00169");
        fitnesse.testsystems.slim.tables.SlimTableFactoryTest slimTableFactoryTest0 = new fitnesse.testsystems.slim.tables.SlimTableFactoryTest();
        fitnesse.testsystems.slim.Table table1 = null;
        slimTableFactoryTest0.table = table1;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory3 = slimTableFactoryTest0.slimTableFactory;
        java.util.Map<java.lang.String, java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable>> strMap4 = slimTableFactoryTest0.map;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory5 = null;
        slimTableFactoryTest0.setslimTableFactory(slimTableFactory5);
        fitnesse.testsystems.slim.Table table7 = null;
        slimTableFactoryTest0.table = table7;
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
    public void test00170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00170");
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
            slimTableFactoryTest0.addTableTypeImport("hi!", "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(slimTableFactory3);
        org.junit.Assert.assertNull(strMap4);
        org.junit.Assert.assertNull(table13);
    }

    @Test
    public void test00171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00171");
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
        // The following exception was thrown during execution in test generation
        try {
            slimTableFactoryTest0.tableTypeStartingWithcommentColonShouldReturnNull();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(table7);
        org.junit.Assert.assertNull(strMap10);
        org.junit.Assert.assertNull(slimTableFactory11);
    }

    @Test
    public void test00172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00172");
        fitnesse.testsystems.slim.tables.SlimTableFactoryTest slimTableFactoryTest0 = new fitnesse.testsystems.slim.tables.SlimTableFactoryTest();
        fitnesse.testsystems.slim.Table table1 = null;
        slimTableFactoryTest0.table = table1;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory3 = slimTableFactoryTest0.getslimTableFactory();
        fitnesse.testsystems.slim.Table table4 = slimTableFactoryTest0.gettable();
        // The following exception was thrown during execution in test generation
        try {
            slimTableFactoryTest0.checkTableTypeDefineUsedForTable();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(slimTableFactory3);
        org.junit.Assert.assertNull(table4);
    }

    @Test
    public void test00173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00173");
        fitnesse.testsystems.slim.tables.SlimTableFactoryTest slimTableFactoryTest0 = new fitnesse.testsystems.slim.tables.SlimTableFactoryTest();
        fitnesse.testsystems.slim.Table table1 = null;
        slimTableFactoryTest0.table = table1;
        fitnesse.testsystems.slim.Table table3 = null;
        slimTableFactoryTest0.settable(table3);
        fitnesse.testsystems.slim.Table table5 = null;
        slimTableFactoryTest0.settable(table5);
        // The following exception was thrown during execution in test generation
        try {
            slimTableFactoryTest0.commentTableShouldReturnNull();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test00174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00174");
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
        org.junit.Assert.assertNull(table11);
    }

    @Test
    public void test00175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00175");
        fitnesse.testsystems.slim.tables.SlimTableFactoryTest slimTableFactoryTest0 = new fitnesse.testsystems.slim.tables.SlimTableFactoryTest();
        fitnesse.testsystems.slim.Table table1 = null;
        slimTableFactoryTest0.table = table1;
        fitnesse.testsystems.slim.Table table3 = slimTableFactoryTest0.table;
        fitnesse.testsystems.slim.Table table4 = slimTableFactoryTest0.gettable();
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory5 = slimTableFactoryTest0.slimTableFactory;
        fitnesse.testsystems.slim.Table table6 = null;
        slimTableFactoryTest0.settable(table6);
        fitnesse.testsystems.slim.Table table8 = slimTableFactoryTest0.table;
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
        org.junit.Assert.assertNull(table8);
    }

    @Test
    public void test00176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00176");
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
            slimTableFactoryTest0.shouldCreateCorrectSlimTableForTablesType();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(strMap5);
    }

    @Test
    public void test00177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00177");
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
    public void test00178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00178");
        fitnesse.testsystems.slim.tables.SlimTableFactoryTest slimTableFactoryTest0 = new fitnesse.testsystems.slim.tables.SlimTableFactoryTest();
        fitnesse.testsystems.slim.Table table1 = null;
        slimTableFactoryTest0.table = table1;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory3 = null;
        slimTableFactoryTest0.setslimTableFactory(slimTableFactory3);
        java.util.Map<java.lang.String, java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable>> strMap5 = slimTableFactoryTest0.map;
        fitnesse.testsystems.slim.Table table6 = null;
        slimTableFactoryTest0.table = table6;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory8 = null;
        slimTableFactoryTest0.slimTableFactory = slimTableFactory8;
        fitnesse.testsystems.slim.Table table10 = slimTableFactoryTest0.table;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass11 = table10.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(strMap5);
        org.junit.Assert.assertNull(table10);
    }

    @Test
    public void test00179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00179");
        fitnesse.testsystems.slim.tables.SlimTableFactoryTest slimTableFactoryTest0 = new fitnesse.testsystems.slim.tables.SlimTableFactoryTest();
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory1 = slimTableFactoryTest0.slimTableFactory;
        fitnesse.testsystems.slim.Table table2 = slimTableFactoryTest0.gettable();
        fitnesse.testsystems.slim.Table table3 = null;
        slimTableFactoryTest0.table = table3;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory5 = slimTableFactoryTest0.getslimTableFactory();
        fitnesse.testsystems.slim.Table table6 = null;
        slimTableFactoryTest0.settable(table6);
        // The following exception was thrown during execution in test generation
        try {
            slimTableFactoryTest0.tableTypeStartingWithcommentColonShouldReturnNull();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(slimTableFactory1);
        org.junit.Assert.assertNull(table2);
        org.junit.Assert.assertNull(slimTableFactory5);
    }

    @Test
    public void test00180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00180");
        fitnesse.testsystems.slim.tables.SlimTableFactoryTest slimTableFactoryTest0 = new fitnesse.testsystems.slim.tables.SlimTableFactoryTest();
        fitnesse.testsystems.slim.Table table1 = null;
        slimTableFactoryTest0.table = table1;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory3 = slimTableFactoryTest0.slimTableFactory;
        java.util.Map<java.lang.String, java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable>> strMap4 = slimTableFactoryTest0.getmap();
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory5 = slimTableFactoryTest0.slimTableFactory;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory6 = slimTableFactoryTest0.getslimTableFactory();
        // The following exception was thrown during execution in test generation
        try {
            slimTableFactoryTest0.addTableTypeImport("hi!", "");
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
    public void test00181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00181");
        fitnesse.testsystems.slim.tables.SlimTableFactoryTest slimTableFactoryTest0 = new fitnesse.testsystems.slim.tables.SlimTableFactoryTest();
        fitnesse.testsystems.slim.Table table1 = null;
        slimTableFactoryTest0.table = table1;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory3 = slimTableFactoryTest0.getslimTableFactory();
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory4 = slimTableFactoryTest0.getslimTableFactory();
        java.lang.Class<?> wildcardClass5 = slimTableFactoryTest0.getClass();
        org.junit.Assert.assertNull(slimTableFactory3);
        org.junit.Assert.assertNull(slimTableFactory4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test00182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00182");
        fitnesse.testsystems.slim.tables.SlimTableFactoryTest slimTableFactoryTest0 = new fitnesse.testsystems.slim.tables.SlimTableFactoryTest();
        fitnesse.testsystems.slim.Table table1 = slimTableFactoryTest0.table;
        java.util.Map<java.lang.String, java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable>> strMap2 = slimTableFactoryTest0.getmap();
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory3 = slimTableFactoryTest0.slimTableFactory;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory4 = slimTableFactoryTest0.getslimTableFactory();
        java.util.Map<java.lang.String, java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable>> strMap5 = slimTableFactoryTest0.getmap();
        fitnesse.testsystems.slim.Table table6 = null;
        slimTableFactoryTest0.table = table6;
        // The following exception was thrown during execution in test generation
        try {
            slimTableFactoryTest0.addTableTypeImport("hi!", "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(table1);
        org.junit.Assert.assertNull(strMap2);
        org.junit.Assert.assertNull(slimTableFactory3);
        org.junit.Assert.assertNull(slimTableFactory4);
        org.junit.Assert.assertNull(strMap5);
    }

    @Test
    public void test00183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00183");
        fitnesse.testsystems.slim.tables.SlimTableFactoryTest slimTableFactoryTest0 = new fitnesse.testsystems.slim.tables.SlimTableFactoryTest();
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory1 = slimTableFactoryTest0.slimTableFactory;
        fitnesse.testsystems.slim.Table table2 = slimTableFactoryTest0.gettable();
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory3 = null;
        slimTableFactoryTest0.slimTableFactory = slimTableFactory3;
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
    public void test00184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00184");
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
            slimTableFactoryTest0.checkTableTypeDefineUsedForTable();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(table7);
        org.junit.Assert.assertNull(strMap8);
    }

    @Test
    public void test00185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00185");
        fitnesse.testsystems.slim.tables.SlimTableFactoryTest slimTableFactoryTest0 = new fitnesse.testsystems.slim.tables.SlimTableFactoryTest();
        fitnesse.testsystems.slim.Table table1 = null;
        slimTableFactoryTest0.table = table1;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory3 = slimTableFactoryTest0.slimTableFactory;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory4 = slimTableFactoryTest0.slimTableFactory;
        // The following exception was thrown during execution in test generation
        try {
            slimTableFactoryTest0.commentTableShouldReturnNull();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(slimTableFactory3);
        org.junit.Assert.assertNull(slimTableFactory4);
    }

    @Test
    public void test00186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00186");
        fitnesse.testsystems.slim.tables.SlimTableFactoryTest slimTableFactoryTest0 = new fitnesse.testsystems.slim.tables.SlimTableFactoryTest();
        fitnesse.testsystems.slim.Table table1 = null;
        slimTableFactoryTest0.table = table1;
        fitnesse.testsystems.slim.Table table3 = null;
        slimTableFactoryTest0.settable(table3);
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory5 = null;
        slimTableFactoryTest0.setslimTableFactory(slimTableFactory5);
        // The following exception was thrown during execution in test generation
        try {
            slimTableFactoryTest0.shouldCreateCorrectSlimTableForTablesType();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test00187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00187");
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
        // The following exception was thrown during execution in test generation
        try {
            slimTableFactoryTest0.checkTableTypeDefinesIgnoredIfDifferentSpecified();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(slimTableFactory3);
        org.junit.Assert.assertNull(strMap4);
    }

    @Test
    public void test00188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00188");
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
            slimTableFactoryTest0.addTableTypeImport("", "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(table7);
        org.junit.Assert.assertNull(table8);
    }

    @Test
    public void test00189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00189");
        fitnesse.testsystems.slim.tables.SlimTableFactoryTest slimTableFactoryTest0 = new fitnesse.testsystems.slim.tables.SlimTableFactoryTest();
        fitnesse.testsystems.slim.Table table1 = null;
        slimTableFactoryTest0.table = table1;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory3 = slimTableFactoryTest0.slimTableFactory;
        // The following exception was thrown during execution in test generation
        try {
            slimTableFactoryTest0.shouldCreateCorrectSlimTableForTablesType();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(slimTableFactory3);
    }

    @Test
    public void test00190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00190");
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
        // The following exception was thrown during execution in test generation
        try {
            slimTableFactoryTest0.checkTableTypeDefineUsedForTable();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(table7);
        org.junit.Assert.assertNull(strMap10);
    }

    @Test
    public void test00191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00191");
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
        // The following exception was thrown during execution in test generation
        try {
            slimTableFactoryTest0.addTableTypeImport("", "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(slimTableFactory1);
        org.junit.Assert.assertNull(table2);
        org.junit.Assert.assertNull(table9);
    }

    @Test
    public void test00192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00192");
        fitnesse.testsystems.slim.tables.SlimTableFactoryTest slimTableFactoryTest0 = new fitnesse.testsystems.slim.tables.SlimTableFactoryTest();
        fitnesse.testsystems.slim.Table table1 = null;
        slimTableFactoryTest0.table = table1;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory3 = slimTableFactoryTest0.getslimTableFactory();
        // The following exception was thrown during execution in test generation
        try {
            slimTableFactoryTest0.shouldCreateCorrectSlimTableForTablesType();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(slimTableFactory3);
    }

    @Test
    public void test00193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00193");
        fitnesse.testsystems.slim.tables.SlimTableFactoryTest slimTableFactoryTest0 = new fitnesse.testsystems.slim.tables.SlimTableFactoryTest();
        fitnesse.testsystems.slim.Table table1 = null;
        slimTableFactoryTest0.table = table1;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory3 = slimTableFactoryTest0.slimTableFactory;
        java.util.Map<java.lang.String, java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable>> strMap4 = slimTableFactoryTest0.getmap();
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory5 = slimTableFactoryTest0.slimTableFactory;
        java.util.Map<java.lang.String, java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable>> strMap6 = slimTableFactoryTest0.getmap();
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory7 = slimTableFactoryTest0.slimTableFactory;
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
        org.junit.Assert.assertNull(slimTableFactory7);
    }

    @Test
    public void test00194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00194");
        fitnesse.testsystems.slim.tables.SlimTableFactoryTest slimTableFactoryTest0 = new fitnesse.testsystems.slim.tables.SlimTableFactoryTest();
        fitnesse.testsystems.slim.Table table1 = null;
        slimTableFactoryTest0.table = table1;
        // The following exception was thrown during execution in test generation
        try {
            slimTableFactoryTest0.commentTableShouldReturnNull();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test00195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00195");
        fitnesse.testsystems.slim.tables.SlimTableFactoryTest slimTableFactoryTest0 = new fitnesse.testsystems.slim.tables.SlimTableFactoryTest();
        fitnesse.testsystems.slim.Table table1 = null;
        slimTableFactoryTest0.table = table1;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory3 = slimTableFactoryTest0.getslimTableFactory();
        fitnesse.testsystems.slim.Table table4 = slimTableFactoryTest0.gettable();
        java.util.Map<java.lang.String, java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable>> strMap5 = slimTableFactoryTest0.getmap();
        fitnesse.testsystems.slim.Table table6 = slimTableFactoryTest0.table;
        // The following exception was thrown during execution in test generation
        try {
            slimTableFactoryTest0.commentTableShouldReturnNull();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(slimTableFactory3);
        org.junit.Assert.assertNull(table4);
        org.junit.Assert.assertNull(strMap5);
        org.junit.Assert.assertNull(table6);
    }

    @Test
    public void test00196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00196");
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
    public void test00197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00197");
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
        // The following exception was thrown during execution in test generation
        try {
            slimTableFactoryTest0.shouldCreateCorrectSlimTableForTablesType();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(slimTableFactory9);
    }

    @Test
    public void test00198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00198");
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
            slimTableFactoryTest0.commentTableShouldReturnNull();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(slimTableFactory1);
        org.junit.Assert.assertNull(table2);
        org.junit.Assert.assertNull(strMap3);
    }

    @Test
    public void test00199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00199");
        fitnesse.testsystems.slim.tables.SlimTableFactoryTest slimTableFactoryTest0 = new fitnesse.testsystems.slim.tables.SlimTableFactoryTest();
        fitnesse.testsystems.slim.Table table1 = null;
        slimTableFactoryTest0.table = table1;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory3 = null;
        slimTableFactoryTest0.slimTableFactory = slimTableFactory3;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory5 = slimTableFactoryTest0.getslimTableFactory();
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory6 = null;
        slimTableFactoryTest0.setslimTableFactory(slimTableFactory6);
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
    public void test00200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00200");
        fitnesse.testsystems.slim.tables.SlimTableFactoryTest slimTableFactoryTest0 = new fitnesse.testsystems.slim.tables.SlimTableFactoryTest();
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory1 = slimTableFactoryTest0.slimTableFactory;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory2 = slimTableFactoryTest0.slimTableFactory;
        fitnesse.testsystems.slim.Table table3 = slimTableFactoryTest0.gettable();
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory4 = slimTableFactoryTest0.getslimTableFactory();
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory5 = slimTableFactoryTest0.slimTableFactory;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass6 = slimTableFactory5.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(slimTableFactory1);
        org.junit.Assert.assertNull(slimTableFactory2);
        org.junit.Assert.assertNull(table3);
        org.junit.Assert.assertNull(slimTableFactory4);
        org.junit.Assert.assertNull(slimTableFactory5);
    }

    @Test
    public void test00201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00201");
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
            slimTableFactoryTest0.addTableTypeImport("hi!", "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(slimTableFactory3);
        org.junit.Assert.assertNull(table8);
    }

    @Test
    public void test00202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00202");
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
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory13 = slimTableFactoryTest0.slimTableFactory;
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
        org.junit.Assert.assertNull(table12);
        org.junit.Assert.assertNull(slimTableFactory13);
    }

    @Test
    public void test00203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00203");
        fitnesse.testsystems.slim.tables.SlimTableFactoryTest slimTableFactoryTest0 = new fitnesse.testsystems.slim.tables.SlimTableFactoryTest();
        fitnesse.testsystems.slim.Table table1 = null;
        slimTableFactoryTest0.table = table1;
        fitnesse.testsystems.slim.Table table3 = null;
        slimTableFactoryTest0.settable(table3);
        fitnesse.testsystems.slim.Table table5 = null;
        slimTableFactoryTest0.settable(table5);
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory7 = slimTableFactoryTest0.slimTableFactory;
        fitnesse.testsystems.slim.Table table8 = slimTableFactoryTest0.gettable();
        // The following exception was thrown during execution in test generation
        try {
            slimTableFactoryTest0.shouldCreateCorrectSlimTableForTablesType();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(slimTableFactory7);
        org.junit.Assert.assertNull(table8);
    }

    @Test
    public void test00204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00204");
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
    }

    @Test
    public void test00205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00205");
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
            slimTableFactoryTest0.checkTableTypeDefineUsedForTable();
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
    public void test00206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00206");
        fitnesse.testsystems.slim.tables.SlimTableFactoryTest slimTableFactoryTest0 = new fitnesse.testsystems.slim.tables.SlimTableFactoryTest();
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory1 = slimTableFactoryTest0.slimTableFactory;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory2 = slimTableFactoryTest0.slimTableFactory;
        fitnesse.testsystems.slim.Table table3 = slimTableFactoryTest0.gettable();
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory4 = slimTableFactoryTest0.getslimTableFactory();
        java.lang.Class<?> wildcardClass5 = slimTableFactoryTest0.getClass();
        org.junit.Assert.assertNull(slimTableFactory1);
        org.junit.Assert.assertNull(slimTableFactory2);
        org.junit.Assert.assertNull(table3);
        org.junit.Assert.assertNull(slimTableFactory4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test00207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00207");
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
            slimTableFactoryTest0.commentTableShouldReturnNull();
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
    public void test00208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00208");
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
    public void test00209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00209");
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
        org.junit.Assert.assertNull(table10);
    }

    @Test
    public void test00210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00210");
        fitnesse.testsystems.slim.tables.SlimTableFactoryTest slimTableFactoryTest0 = new fitnesse.testsystems.slim.tables.SlimTableFactoryTest();
        fitnesse.testsystems.slim.Table table1 = null;
        slimTableFactoryTest0.table = table1;
        fitnesse.testsystems.slim.Table table3 = null;
        slimTableFactoryTest0.settable(table3);
        fitnesse.testsystems.slim.Table table5 = null;
        slimTableFactoryTest0.settable(table5);
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory7 = slimTableFactoryTest0.slimTableFactory;
        java.util.Map<java.lang.String, java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable>> strMap8 = slimTableFactoryTest0.map;
        // The following exception was thrown during execution in test generation
        try {
            slimTableFactoryTest0.checkTableTypeDefinesIgnoredIfDifferentSpecified();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(slimTableFactory7);
        org.junit.Assert.assertNull(strMap8);
    }

    @Test
    public void test00211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00211");
        fitnesse.testsystems.slim.tables.SlimTableFactoryTest slimTableFactoryTest0 = new fitnesse.testsystems.slim.tables.SlimTableFactoryTest();
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory1 = slimTableFactoryTest0.slimTableFactory;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory2 = slimTableFactoryTest0.slimTableFactory;
        fitnesse.testsystems.slim.Table table3 = slimTableFactoryTest0.gettable();
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory4 = slimTableFactoryTest0.getslimTableFactory();
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory5 = slimTableFactoryTest0.slimTableFactory;
        fitnesse.testsystems.slim.Table table6 = slimTableFactoryTest0.gettable();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass7 = table6.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(slimTableFactory1);
        org.junit.Assert.assertNull(slimTableFactory2);
        org.junit.Assert.assertNull(table3);
        org.junit.Assert.assertNull(slimTableFactory4);
        org.junit.Assert.assertNull(slimTableFactory5);
        org.junit.Assert.assertNull(table6);
    }

    @Test
    public void test00212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00212");
        fitnesse.testsystems.slim.tables.SlimTableFactoryTest slimTableFactoryTest0 = new fitnesse.testsystems.slim.tables.SlimTableFactoryTest();
        fitnesse.testsystems.slim.Table table1 = null;
        slimTableFactoryTest0.table = table1;
        fitnesse.testsystems.slim.Table table3 = slimTableFactoryTest0.table;
        fitnesse.testsystems.slim.Table table4 = slimTableFactoryTest0.gettable();
        java.util.Map<java.lang.String, java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable>> strMap5 = slimTableFactoryTest0.getmap();
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory6 = slimTableFactoryTest0.getslimTableFactory();
        java.lang.Class<?> wildcardClass7 = slimTableFactoryTest0.getClass();
        org.junit.Assert.assertNull(table3);
        org.junit.Assert.assertNull(table4);
        org.junit.Assert.assertNull(strMap5);
        org.junit.Assert.assertNull(slimTableFactory6);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test00213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00213");
        fitnesse.testsystems.slim.tables.SlimTableFactoryTest slimTableFactoryTest0 = new fitnesse.testsystems.slim.tables.SlimTableFactoryTest();
        fitnesse.testsystems.slim.Table table1 = null;
        slimTableFactoryTest0.table = table1;
        fitnesse.testsystems.slim.Table table3 = null;
        slimTableFactoryTest0.settable(table3);
        java.util.Map<java.lang.String, java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable>> strMap5 = slimTableFactoryTest0.map;
        java.util.Map<java.lang.String, java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable>> strMap6 = slimTableFactoryTest0.getmap();
        fitnesse.testsystems.slim.Table table7 = null;
        slimTableFactoryTest0.table = table7;
        // The following exception was thrown during execution in test generation
        try {
            slimTableFactoryTest0.checkTableTypeDefineUsedForTable();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(strMap5);
        org.junit.Assert.assertNull(strMap6);
    }

    @Test
    public void test00214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00214");
        fitnesse.testsystems.slim.tables.SlimTableFactoryTest slimTableFactoryTest0 = new fitnesse.testsystems.slim.tables.SlimTableFactoryTest();
        fitnesse.testsystems.slim.Table table1 = null;
        slimTableFactoryTest0.table = table1;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory3 = slimTableFactoryTest0.slimTableFactory;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory4 = null;
        slimTableFactoryTest0.setslimTableFactory(slimTableFactory4);
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
        org.junit.Assert.assertNull(slimTableFactory3);
        org.junit.Assert.assertNull(strMap6);
    }

    @Test
    public void test00215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00215");
        fitnesse.testsystems.slim.tables.SlimTableFactoryTest slimTableFactoryTest0 = new fitnesse.testsystems.slim.tables.SlimTableFactoryTest();
        fitnesse.testsystems.slim.Table table1 = null;
        slimTableFactoryTest0.table = table1;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory3 = slimTableFactoryTest0.slimTableFactory;
        java.util.Map<java.lang.String, java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable>> strMap4 = slimTableFactoryTest0.getmap();
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory5 = null;
        slimTableFactoryTest0.slimTableFactory = slimTableFactory5;
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
    }

    @Test
    public void test00216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00216");
        fitnesse.testsystems.slim.tables.SlimTableFactoryTest slimTableFactoryTest0 = new fitnesse.testsystems.slim.tables.SlimTableFactoryTest();
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory1 = null;
        slimTableFactoryTest0.slimTableFactory = slimTableFactory1;
        // The following exception was thrown during execution in test generation
        try {
            slimTableFactoryTest0.commentTableShouldReturnNull();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test00217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00217");
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
            slimTableFactoryTest0.shouldCreateCorrectSlimTableForTablesType();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(slimTableFactory9);
    }

    @Test
    public void test00218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00218");
        fitnesse.testsystems.slim.tables.SlimTableFactoryTest slimTableFactoryTest0 = new fitnesse.testsystems.slim.tables.SlimTableFactoryTest();
        fitnesse.testsystems.slim.Table table1 = null;
        slimTableFactoryTest0.table = table1;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory3 = slimTableFactoryTest0.slimTableFactory;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory4 = slimTableFactoryTest0.slimTableFactory;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory5 = slimTableFactoryTest0.slimTableFactory;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory6 = null;
        slimTableFactoryTest0.slimTableFactory = slimTableFactory6;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory8 = null;
        slimTableFactoryTest0.slimTableFactory = slimTableFactory8;
        java.lang.Class<?> wildcardClass10 = slimTableFactoryTest0.getClass();
        org.junit.Assert.assertNull(slimTableFactory3);
        org.junit.Assert.assertNull(slimTableFactory4);
        org.junit.Assert.assertNull(slimTableFactory5);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test00219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00219");
        fitnesse.testsystems.slim.tables.SlimTableFactoryTest slimTableFactoryTest0 = new fitnesse.testsystems.slim.tables.SlimTableFactoryTest();
        fitnesse.testsystems.slim.Table table1 = slimTableFactoryTest0.table;
        java.util.Map<java.lang.String, java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable>> strMap2 = slimTableFactoryTest0.getmap();
        java.util.Map<java.lang.String, java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable>> strMap3 = slimTableFactoryTest0.getmap();
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory4 = slimTableFactoryTest0.slimTableFactory;
        fitnesse.testsystems.slim.Table table5 = null;
        slimTableFactoryTest0.table = table5;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory7 = slimTableFactoryTest0.slimTableFactory;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass8 = slimTableFactory7.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(table1);
        org.junit.Assert.assertNull(strMap2);
        org.junit.Assert.assertNull(strMap3);
        org.junit.Assert.assertNull(slimTableFactory4);
        org.junit.Assert.assertNull(slimTableFactory7);
    }

    @Test
    public void test00220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00220");
        fitnesse.testsystems.slim.tables.SlimTableFactoryTest slimTableFactoryTest0 = new fitnesse.testsystems.slim.tables.SlimTableFactoryTest();
        fitnesse.testsystems.slim.Table table1 = null;
        slimTableFactoryTest0.table = table1;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory3 = slimTableFactoryTest0.slimTableFactory;
        java.util.Map<java.lang.String, java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable>> strMap4 = slimTableFactoryTest0.map;
        // The following exception was thrown during execution in test generation
        try {
            slimTableFactoryTest0.addTableTypeImport("", "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(slimTableFactory3);
        org.junit.Assert.assertNull(strMap4);
    }

    @Test
    public void test00221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00221");
        fitnesse.testsystems.slim.tables.SlimTableFactoryTest slimTableFactoryTest0 = new fitnesse.testsystems.slim.tables.SlimTableFactoryTest();
        fitnesse.testsystems.slim.Table table1 = null;
        slimTableFactoryTest0.table = table1;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory3 = slimTableFactoryTest0.slimTableFactory;
        java.util.Map<java.lang.String, java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable>> strMap4 = slimTableFactoryTest0.getmap();
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
    public void test00222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00222");
        fitnesse.testsystems.slim.tables.SlimTableFactoryTest slimTableFactoryTest0 = new fitnesse.testsystems.slim.tables.SlimTableFactoryTest();
        fitnesse.testsystems.slim.Table table1 = null;
        slimTableFactoryTest0.table = table1;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory3 = slimTableFactoryTest0.slimTableFactory;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory4 = slimTableFactoryTest0.slimTableFactory;
        // The following exception was thrown during execution in test generation
        try {
            slimTableFactoryTest0.checkTableTypeDefinesIgnoredIfDifferentSpecified();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(slimTableFactory3);
        org.junit.Assert.assertNull(slimTableFactory4);
    }

    @Test
    public void test00223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00223");
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
            slimTableFactoryTest0.shouldCreateCorrectSlimTableForTablesType();
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
    public void test00224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00224");
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
        // The following exception was thrown during execution in test generation
        try {
            slimTableFactoryTest0.shouldCreateCorrectSlimTableForTablesType();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(slimTableFactory7);
        org.junit.Assert.assertNull(slimTableFactory8);
        org.junit.Assert.assertNull(table9);
    }

    @Test
    public void test00225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00225");
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
            slimTableFactoryTest0.checkTableTypeDefineUsedForTable();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test00226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00226");
        fitnesse.testsystems.slim.tables.SlimTableFactoryTest slimTableFactoryTest0 = new fitnesse.testsystems.slim.tables.SlimTableFactoryTest();
        fitnesse.testsystems.slim.Table table1 = slimTableFactoryTest0.table;
        java.util.Map<java.lang.String, java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable>> strMap2 = slimTableFactoryTest0.getmap();
        fitnesse.testsystems.slim.Table table3 = null;
        slimTableFactoryTest0.table = table3;
        // The following exception was thrown during execution in test generation
        try {
            slimTableFactoryTest0.checkTableTypeDefinesIgnoredIfDifferentSpecified();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(table1);
        org.junit.Assert.assertNull(strMap2);
    }

    @Test
    public void test00227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00227");
        fitnesse.testsystems.slim.tables.SlimTableFactoryTest slimTableFactoryTest0 = new fitnesse.testsystems.slim.tables.SlimTableFactoryTest();
        fitnesse.testsystems.slim.Table table1 = null;
        slimTableFactoryTest0.table = table1;
        fitnesse.testsystems.slim.Table table3 = null;
        slimTableFactoryTest0.settable(table3);
        java.util.Map<java.lang.String, java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable>> strMap5 = slimTableFactoryTest0.map;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory6 = slimTableFactoryTest0.getslimTableFactory();
        // The following exception was thrown during execution in test generation
        try {
            slimTableFactoryTest0.checkTableTypeDefinesIgnoredIfDifferentSpecified();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(strMap5);
        org.junit.Assert.assertNull(slimTableFactory6);
    }

    @Test
    public void test00228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00228");
        fitnesse.testsystems.slim.tables.SlimTableFactoryTest slimTableFactoryTest0 = new fitnesse.testsystems.slim.tables.SlimTableFactoryTest();
        fitnesse.testsystems.slim.Table table1 = null;
        slimTableFactoryTest0.table = table1;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory3 = slimTableFactoryTest0.slimTableFactory;
        java.util.Map<java.lang.String, java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable>> strMap4 = slimTableFactoryTest0.getmap();
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory5 = null;
        slimTableFactoryTest0.slimTableFactory = slimTableFactory5;
        // The following exception was thrown during execution in test generation
        try {
            slimTableFactoryTest0.checkTableTypeDefinesIgnoredIfDifferentSpecified();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(slimTableFactory3);
        org.junit.Assert.assertNull(strMap4);
    }

    @Test
    public void test00229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00229");
        fitnesse.testsystems.slim.tables.SlimTableFactoryTest slimTableFactoryTest0 = new fitnesse.testsystems.slim.tables.SlimTableFactoryTest();
        fitnesse.testsystems.slim.Table table1 = slimTableFactoryTest0.table;
        java.util.Map<java.lang.String, java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable>> strMap2 = slimTableFactoryTest0.getmap();
        java.util.Map<java.lang.String, java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable>> strMap3 = slimTableFactoryTest0.getmap();
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory4 = null;
        slimTableFactoryTest0.setslimTableFactory(slimTableFactory4);
        java.lang.Class<?> wildcardClass6 = slimTableFactoryTest0.getClass();
        org.junit.Assert.assertNull(table1);
        org.junit.Assert.assertNull(strMap2);
        org.junit.Assert.assertNull(strMap3);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test00230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00230");
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
    }

    @Test
    public void test00231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00231");
        fitnesse.testsystems.slim.tables.SlimTableFactoryTest slimTableFactoryTest0 = new fitnesse.testsystems.slim.tables.SlimTableFactoryTest();
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory1 = slimTableFactoryTest0.slimTableFactory;
        fitnesse.testsystems.slim.Table table2 = slimTableFactoryTest0.gettable();
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory3 = null;
        slimTableFactoryTest0.slimTableFactory = slimTableFactory3;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory5 = null;
        slimTableFactoryTest0.slimTableFactory = slimTableFactory5;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory7 = slimTableFactoryTest0.slimTableFactory;
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
    }

    @Test
    public void test00232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00232");
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
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory12 = null;
        slimTableFactoryTest0.slimTableFactory = slimTableFactory12;
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
    }

    @Test
    public void test00233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00233");
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
    }

    @Test
    public void test00234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00234");
        fitnesse.testsystems.slim.tables.SlimTableFactoryTest slimTableFactoryTest0 = new fitnesse.testsystems.slim.tables.SlimTableFactoryTest();
        fitnesse.testsystems.slim.Table table1 = null;
        slimTableFactoryTest0.table = table1;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory3 = null;
        slimTableFactoryTest0.setslimTableFactory(slimTableFactory3);
        // The following exception was thrown during execution in test generation
        try {
            slimTableFactoryTest0.tableTypeStartingWithcommentColonShouldReturnNull();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test00235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00235");
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
            slimTableFactoryTest0.addTableTypeImport("hi!", "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(slimTableFactory5);
        org.junit.Assert.assertNull(slimTableFactory6);
    }

    @Test
    public void test00236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00236");
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
        fitnesse.testsystems.slim.Table table15 = null;
        slimTableFactoryTest0.table = table15;
        // The following exception was thrown during execution in test generation
        try {
            slimTableFactoryTest0.commentTableShouldReturnNull();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(slimTableFactory3);
        org.junit.Assert.assertNull(strMap4);
        org.junit.Assert.assertNull(table13);
        org.junit.Assert.assertNull(slimTableFactory14);
    }

    @Test
    public void test00237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00237");
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
            slimTableFactoryTest0.checkTableTypeDefinesIgnoredIfDifferentSpecified();
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
    public void test00238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00238");
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
    }

    @Test
    public void test00239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00239");
        fitnesse.testsystems.slim.tables.SlimTableFactoryTest slimTableFactoryTest0 = new fitnesse.testsystems.slim.tables.SlimTableFactoryTest();
        fitnesse.testsystems.slim.Table table1 = null;
        slimTableFactoryTest0.table = table1;
        fitnesse.testsystems.slim.Table table3 = null;
        slimTableFactoryTest0.settable(table3);
        java.util.Map<java.lang.String, java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable>> strMap5 = slimTableFactoryTest0.getmap();
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
    public void test00240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00240");
        fitnesse.testsystems.slim.tables.SlimTableFactoryTest slimTableFactoryTest0 = new fitnesse.testsystems.slim.tables.SlimTableFactoryTest();
        fitnesse.testsystems.slim.Table table1 = null;
        slimTableFactoryTest0.table = table1;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory3 = slimTableFactoryTest0.slimTableFactory;
        java.util.Map<java.lang.String, java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable>> strMap4 = slimTableFactoryTest0.getmap();
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory5 = slimTableFactoryTest0.slimTableFactory;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory6 = null;
        slimTableFactoryTest0.setslimTableFactory(slimTableFactory6);
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

    @Test
    public void test00241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00241");
        fitnesse.testsystems.slim.tables.SlimTableFactoryTest slimTableFactoryTest0 = new fitnesse.testsystems.slim.tables.SlimTableFactoryTest();
        fitnesse.testsystems.slim.Table table1 = null;
        slimTableFactoryTest0.table = table1;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory3 = slimTableFactoryTest0.slimTableFactory;
        java.util.Map<java.lang.String, java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable>> strMap4 = slimTableFactoryTest0.map;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory5 = null;
        slimTableFactoryTest0.setslimTableFactory(slimTableFactory5);
        fitnesse.testsystems.slim.Table table7 = null;
        slimTableFactoryTest0.table = table7;
        java.lang.Class<?> wildcardClass9 = slimTableFactoryTest0.getClass();
        org.junit.Assert.assertNull(slimTableFactory3);
        org.junit.Assert.assertNull(strMap4);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test00242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00242");
        fitnesse.testsystems.slim.tables.SlimTableFactoryTest slimTableFactoryTest0 = new fitnesse.testsystems.slim.tables.SlimTableFactoryTest();
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory1 = slimTableFactoryTest0.slimTableFactory;
        fitnesse.testsystems.slim.Table table2 = slimTableFactoryTest0.gettable();
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory3 = null;
        slimTableFactoryTest0.slimTableFactory = slimTableFactory3;
        fitnesse.testsystems.slim.Table table5 = null;
        slimTableFactoryTest0.settable(table5);
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory7 = slimTableFactoryTest0.slimTableFactory;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory8 = slimTableFactoryTest0.getslimTableFactory();
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
    }

    @Test
    public void test00243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00243");
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
        fitnesse.testsystems.slim.Table table12 = null;
        slimTableFactoryTest0.settable(table12);
        fitnesse.testsystems.slim.Table table14 = null;
        slimTableFactoryTest0.settable(table14);
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory16 = null;
        slimTableFactoryTest0.setslimTableFactory(slimTableFactory16);
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
    public void test00244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00244");
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
    }

    @Test
    public void test00245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00245");
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
        fitnesse.testsystems.slim.Table table15 = null;
        slimTableFactoryTest0.settable(table15);
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
    }

    @Test
    public void test00246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00246");
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
        org.junit.Assert.assertNull(slimTableFactory10);
    }

    @Test
    public void test00247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00247");
        fitnesse.testsystems.slim.tables.SlimTableFactoryTest slimTableFactoryTest0 = new fitnesse.testsystems.slim.tables.SlimTableFactoryTest();
        fitnesse.testsystems.slim.Table table1 = null;
        slimTableFactoryTest0.table = table1;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory3 = slimTableFactoryTest0.slimTableFactory;
        fitnesse.testsystems.slim.Table table4 = slimTableFactoryTest0.table;
        // The following exception was thrown during execution in test generation
        try {
            slimTableFactoryTest0.addTableTypeImport("", "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(slimTableFactory3);
        org.junit.Assert.assertNull(table4);
    }

    @Test
    public void test00248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00248");
        fitnesse.testsystems.slim.tables.SlimTableFactoryTest slimTableFactoryTest0 = new fitnesse.testsystems.slim.tables.SlimTableFactoryTest();
        fitnesse.testsystems.slim.Table table1 = null;
        slimTableFactoryTest0.table = table1;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory3 = slimTableFactoryTest0.slimTableFactory;
        java.util.Map<java.lang.String, java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable>> strMap4 = slimTableFactoryTest0.map;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory5 = null;
        slimTableFactoryTest0.setslimTableFactory(slimTableFactory5);
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
        org.junit.Assert.assertNull(strMap4);
    }

    @Test
    public void test00249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00249");
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
    public void test00250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00250");
        fitnesse.testsystems.slim.tables.SlimTableFactoryTest slimTableFactoryTest0 = new fitnesse.testsystems.slim.tables.SlimTableFactoryTest();
        fitnesse.testsystems.slim.Table table1 = null;
        slimTableFactoryTest0.table = table1;
        fitnesse.testsystems.slim.Table table3 = null;
        slimTableFactoryTest0.settable(table3);
        java.util.Map<java.lang.String, java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable>> strMap5 = slimTableFactoryTest0.getmap();
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory6 = slimTableFactoryTest0.getslimTableFactory();
        // The following exception was thrown during execution in test generation
        try {
            slimTableFactoryTest0.commentTableShouldReturnNull();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(strMap5);
        org.junit.Assert.assertNull(slimTableFactory6);
    }

    @Test
    public void test00251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00251");
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
    public void test00252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00252");
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
    public void test00253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00253");
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
        java.util.Map<java.lang.String, java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable>> strMap10 = slimTableFactoryTest0.getmap();
        java.lang.Class<?> wildcardClass11 = slimTableFactoryTest0.getClass();
        org.junit.Assert.assertNull(strMap5);
        org.junit.Assert.assertNull(strMap6);
        org.junit.Assert.assertNull(slimTableFactory7);
        org.junit.Assert.assertNull(strMap8);
        org.junit.Assert.assertNull(slimTableFactory9);
        org.junit.Assert.assertNull(strMap10);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test00254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00254");
        fitnesse.testsystems.slim.tables.SlimTableFactoryTest slimTableFactoryTest0 = new fitnesse.testsystems.slim.tables.SlimTableFactoryTest();
        fitnesse.testsystems.slim.Table table1 = slimTableFactoryTest0.table;
        java.util.Map<java.lang.String, java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable>> strMap2 = slimTableFactoryTest0.getmap();
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
    public void test00255() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00255");
        fitnesse.testsystems.slim.tables.SlimTableFactoryTest slimTableFactoryTest0 = new fitnesse.testsystems.slim.tables.SlimTableFactoryTest();
        fitnesse.testsystems.slim.Table table1 = null;
        slimTableFactoryTest0.table = table1;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory3 = null;
        slimTableFactoryTest0.slimTableFactory = slimTableFactory3;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory5 = slimTableFactoryTest0.getslimTableFactory();
        fitnesse.testsystems.slim.Table table6 = null;
        slimTableFactoryTest0.settable(table6);
        java.lang.Class<?> wildcardClass8 = slimTableFactoryTest0.getClass();
        org.junit.Assert.assertNull(slimTableFactory5);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test00256() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00256");
        fitnesse.testsystems.slim.tables.SlimTableFactoryTest slimTableFactoryTest0 = new fitnesse.testsystems.slim.tables.SlimTableFactoryTest();
        fitnesse.testsystems.slim.Table table1 = null;
        slimTableFactoryTest0.table = table1;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory3 = null;
        slimTableFactoryTest0.setslimTableFactory(slimTableFactory3);
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory5 = slimTableFactoryTest0.slimTableFactory;
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
    public void test00257() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00257");
        fitnesse.testsystems.slim.tables.SlimTableFactoryTest slimTableFactoryTest0 = new fitnesse.testsystems.slim.tables.SlimTableFactoryTest();
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory1 = slimTableFactoryTest0.slimTableFactory;
        fitnesse.testsystems.slim.Table table2 = slimTableFactoryTest0.gettable();
        fitnesse.testsystems.slim.Table table3 = null;
        slimTableFactoryTest0.table = table3;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory5 = slimTableFactoryTest0.getslimTableFactory();
        fitnesse.testsystems.slim.Table table6 = null;
        slimTableFactoryTest0.settable(table6);
        // The following exception was thrown during execution in test generation
        try {
            slimTableFactoryTest0.checkTableTypeDefineUsedForTable();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(slimTableFactory1);
        org.junit.Assert.assertNull(table2);
        org.junit.Assert.assertNull(slimTableFactory5);
    }

    @Test
    public void test00258() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00258");
        fitnesse.testsystems.slim.tables.SlimTableFactoryTest slimTableFactoryTest0 = new fitnesse.testsystems.slim.tables.SlimTableFactoryTest();
        fitnesse.testsystems.slim.Table table1 = null;
        slimTableFactoryTest0.table = table1;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory3 = slimTableFactoryTest0.slimTableFactory;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory4 = null;
        slimTableFactoryTest0.slimTableFactory = slimTableFactory4;
        java.lang.Class<?> wildcardClass6 = slimTableFactoryTest0.getClass();
        org.junit.Assert.assertNull(slimTableFactory3);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test00259() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00259");
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
            slimTableFactoryTest0.checkTableTypeDefinesIgnoredIfDifferentSpecified();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(strMap5);
    }

    @Test
    public void test00260() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00260");
        fitnesse.testsystems.slim.tables.SlimTableFactoryTest slimTableFactoryTest0 = new fitnesse.testsystems.slim.tables.SlimTableFactoryTest();
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory1 = slimTableFactoryTest0.slimTableFactory;
        fitnesse.testsystems.slim.Table table2 = slimTableFactoryTest0.gettable();
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory3 = null;
        slimTableFactoryTest0.slimTableFactory = slimTableFactory3;
        fitnesse.testsystems.slim.Table table5 = null;
        slimTableFactoryTest0.settable(table5);
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory7 = slimTableFactoryTest0.slimTableFactory;
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
    public void test00261() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00261");
        fitnesse.testsystems.slim.tables.SlimTableFactoryTest slimTableFactoryTest0 = new fitnesse.testsystems.slim.tables.SlimTableFactoryTest();
        fitnesse.testsystems.slim.Table table1 = null;
        slimTableFactoryTest0.table = table1;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory3 = null;
        slimTableFactoryTest0.slimTableFactory = slimTableFactory3;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory5 = slimTableFactoryTest0.getslimTableFactory();
        // The following exception was thrown during execution in test generation
        try {
            slimTableFactoryTest0.checkTableTypeDefineUsedForTable();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(slimTableFactory5);
    }

    @Test
    public void test00262() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00262");
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
        // The following exception was thrown during execution in test generation
        try {
            slimTableFactoryTest0.checkTableTypeDefineUsedForTable();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(slimTableFactory9);
        org.junit.Assert.assertNull(slimTableFactory12);
    }

    @Test
    public void test00263() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00263");
        fitnesse.testsystems.slim.tables.SlimTableFactoryTest slimTableFactoryTest0 = new fitnesse.testsystems.slim.tables.SlimTableFactoryTest();
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory1 = slimTableFactoryTest0.slimTableFactory;
        fitnesse.testsystems.slim.Table table2 = slimTableFactoryTest0.gettable();
        fitnesse.testsystems.slim.Table table3 = null;
        slimTableFactoryTest0.table = table3;
        fitnesse.testsystems.slim.Table table5 = null;
        slimTableFactoryTest0.table = table5;
        java.util.Map<java.lang.String, java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable>> strMap7 = slimTableFactoryTest0.getmap();
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
    }

    @Test
    public void test00264() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00264");
        fitnesse.testsystems.slim.tables.SlimTableFactoryTest slimTableFactoryTest0 = new fitnesse.testsystems.slim.tables.SlimTableFactoryTest();
        fitnesse.testsystems.slim.Table table1 = null;
        slimTableFactoryTest0.table = table1;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory3 = slimTableFactoryTest0.slimTableFactory;
        fitnesse.testsystems.slim.Table table4 = null;
        slimTableFactoryTest0.table = table4;
        java.util.Map<java.lang.String, java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable>> strMap6 = slimTableFactoryTest0.map;
        // The following exception was thrown during execution in test generation
        try {
            slimTableFactoryTest0.commentTableShouldReturnNull();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(slimTableFactory3);
        org.junit.Assert.assertNull(strMap6);
    }

    @Test
    public void test00265() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00265");
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
        org.junit.Assert.assertNull(table10);
    }

    @Test
    public void test00266() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00266");
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
        org.junit.Assert.assertNull(table10);
    }

    @Test
    public void test00267() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00267");
        fitnesse.testsystems.slim.tables.SlimTableFactoryTest slimTableFactoryTest0 = new fitnesse.testsystems.slim.tables.SlimTableFactoryTest();
        fitnesse.testsystems.slim.Table table1 = slimTableFactoryTest0.table;
        java.util.Map<java.lang.String, java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable>> strMap2 = slimTableFactoryTest0.getmap();
        fitnesse.testsystems.slim.Table table3 = null;
        slimTableFactoryTest0.table = table3;
        fitnesse.testsystems.slim.Table table5 = slimTableFactoryTest0.table;
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
    }

    @Test
    public void test00268() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00268");
        fitnesse.testsystems.slim.tables.SlimTableFactoryTest slimTableFactoryTest0 = new fitnesse.testsystems.slim.tables.SlimTableFactoryTest();
        fitnesse.testsystems.slim.Table table1 = slimTableFactoryTest0.table;
        java.util.Map<java.lang.String, java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable>> strMap2 = slimTableFactoryTest0.getmap();
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory3 = null;
        slimTableFactoryTest0.slimTableFactory = slimTableFactory3;
        fitnesse.testsystems.slim.Table table5 = slimTableFactoryTest0.table;
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
    }

    @Test
    public void test00269() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00269");
        fitnesse.testsystems.slim.tables.SlimTableFactoryTest slimTableFactoryTest0 = new fitnesse.testsystems.slim.tables.SlimTableFactoryTest();
        fitnesse.testsystems.slim.Table table1 = null;
        slimTableFactoryTest0.table = table1;
        fitnesse.testsystems.slim.Table table3 = null;
        slimTableFactoryTest0.settable(table3);
        java.util.Map<java.lang.String, java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable>> strMap5 = slimTableFactoryTest0.getmap();
        java.util.Map<java.lang.String, java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable>> strMap6 = slimTableFactoryTest0.map;
        // The following exception was thrown during execution in test generation
        try {
            slimTableFactoryTest0.addTableTypeImport("", "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(strMap5);
        org.junit.Assert.assertNull(strMap6);
    }

    @Test
    public void test00270() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00270");
        fitnesse.testsystems.slim.tables.SlimTableFactoryTest slimTableFactoryTest0 = new fitnesse.testsystems.slim.tables.SlimTableFactoryTest();
        fitnesse.testsystems.slim.Table table1 = slimTableFactoryTest0.table;
        java.util.Map<java.lang.String, java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable>> strMap2 = slimTableFactoryTest0.getmap();
        java.util.Map<java.lang.String, java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable>> strMap3 = slimTableFactoryTest0.getmap();
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory4 = slimTableFactoryTest0.slimTableFactory;
        fitnesse.testsystems.slim.Table table5 = null;
        slimTableFactoryTest0.settable(table5);
        fitnesse.testsystems.slim.Table table7 = slimTableFactoryTest0.table;
        java.util.Map<java.lang.String, java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable>> strMap8 = slimTableFactoryTest0.map;
        java.util.Map<java.lang.String, java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable>> strMap9 = slimTableFactoryTest0.getmap();
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
        org.junit.Assert.assertNull(strMap9);
    }

    @Test
    public void test00271() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00271");
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
            slimTableFactoryTest0.checkTableTypeDefinesIgnoredIfDifferentSpecified();
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
    public void test00272() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00272");
        fitnesse.testsystems.slim.tables.SlimTableFactoryTest slimTableFactoryTest0 = new fitnesse.testsystems.slim.tables.SlimTableFactoryTest();
        fitnesse.testsystems.slim.Table table1 = null;
        slimTableFactoryTest0.table = table1;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory3 = slimTableFactoryTest0.slimTableFactory;
        fitnesse.testsystems.slim.Table table4 = slimTableFactoryTest0.table;
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
    public void test00273() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00273");
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
    }

    @Test
    public void test00274() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00274");
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
            slimTableFactoryTest0.commentTableShouldReturnNull();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test00275() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00275");
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
    public void test00276() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00276");
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
        java.lang.Class<?> wildcardClass13 = slimTableFactoryTest0.getClass();
        org.junit.Assert.assertNull(table3);
        org.junit.Assert.assertNull(table4);
        org.junit.Assert.assertNull(strMap5);
        org.junit.Assert.assertNull(strMap6);
        org.junit.Assert.assertNull(table7);
        org.junit.Assert.assertNull(table10);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test00277() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00277");
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
            slimTableFactoryTest0.checkTableTypeDefineUsedForTable();
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
    public void test00278() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00278");
        fitnesse.testsystems.slim.tables.SlimTableFactoryTest slimTableFactoryTest0 = new fitnesse.testsystems.slim.tables.SlimTableFactoryTest();
        fitnesse.testsystems.slim.Table table1 = null;
        slimTableFactoryTest0.table = table1;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory3 = slimTableFactoryTest0.slimTableFactory;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory4 = null;
        slimTableFactoryTest0.slimTableFactory = slimTableFactory4;
        // The following exception was thrown during execution in test generation
        try {
            slimTableFactoryTest0.tableTypeStartingWithcommentColonShouldReturnNull();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(slimTableFactory3);
    }

    @Test
    public void test00279() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00279");
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
        // The following exception was thrown during execution in test generation
        try {
            slimTableFactoryTest0.checkTableTypeDefineUsedForTable();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(table7);
        org.junit.Assert.assertNull(strMap12);
        org.junit.Assert.assertNull(slimTableFactory13);
    }

    @Test
    public void test00280() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00280");
        fitnesse.testsystems.slim.tables.SlimTableFactoryTest slimTableFactoryTest0 = new fitnesse.testsystems.slim.tables.SlimTableFactoryTest();
        fitnesse.testsystems.slim.Table table1 = null;
        slimTableFactoryTest0.table = table1;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory3 = slimTableFactoryTest0.getslimTableFactory();
        fitnesse.testsystems.slim.Table table4 = slimTableFactoryTest0.gettable();
        java.util.Map<java.lang.String, java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable>> strMap5 = slimTableFactoryTest0.getmap();
        fitnesse.testsystems.slim.Table table6 = slimTableFactoryTest0.table;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory7 = slimTableFactoryTest0.slimTableFactory;
        // The following exception was thrown during execution in test generation
        try {
            slimTableFactoryTest0.commentTableShouldReturnNull();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(slimTableFactory3);
        org.junit.Assert.assertNull(table4);
        org.junit.Assert.assertNull(strMap5);
        org.junit.Assert.assertNull(table6);
        org.junit.Assert.assertNull(slimTableFactory7);
    }

    @Test
    public void test00281() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00281");
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
            slimTableFactoryTest0.checkTableTypeDefineUsedForTable();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(slimTableFactory3);
        org.junit.Assert.assertNull(strMap4);
        org.junit.Assert.assertNull(strMap11);
    }

    @Test
    public void test00282() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00282");
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
            slimTableFactoryTest0.checkTableTypeDefineUsedForTable();
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
    public void test00283() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00283");
        fitnesse.testsystems.slim.tables.SlimTableFactoryTest slimTableFactoryTest0 = new fitnesse.testsystems.slim.tables.SlimTableFactoryTest();
        fitnesse.testsystems.slim.Table table1 = null;
        slimTableFactoryTest0.table = table1;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory3 = null;
        slimTableFactoryTest0.setslimTableFactory(slimTableFactory3);
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory5 = slimTableFactoryTest0.slimTableFactory;
        java.util.Map<java.lang.String, java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable>> strMap6 = slimTableFactoryTest0.getmap();
        fitnesse.testsystems.slim.Table table7 = null;
        slimTableFactoryTest0.table = table7;
        java.lang.Class<?> wildcardClass9 = slimTableFactoryTest0.getClass();
        org.junit.Assert.assertNull(slimTableFactory5);
        org.junit.Assert.assertNull(strMap6);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test00284() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00284");
        fitnesse.testsystems.slim.tables.SlimTableFactoryTest slimTableFactoryTest0 = new fitnesse.testsystems.slim.tables.SlimTableFactoryTest();
        fitnesse.testsystems.slim.Table table1 = null;
        slimTableFactoryTest0.table = table1;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory3 = slimTableFactoryTest0.slimTableFactory;
        java.util.Map<java.lang.String, java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable>> strMap4 = slimTableFactoryTest0.getmap();
        fitnesse.testsystems.slim.Table table5 = null;
        slimTableFactoryTest0.settable(table5);
        fitnesse.testsystems.slim.Table table7 = null;
        slimTableFactoryTest0.table = table7;
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
    public void test00285() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00285");
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
        java.util.Map<java.lang.String, java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable>> strMap10 = slimTableFactoryTest0.getmap();
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
        org.junit.Assert.assertNull(strMap10);
    }

    @Test
    public void test00286() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00286");
        fitnesse.testsystems.slim.tables.SlimTableFactoryTest slimTableFactoryTest0 = new fitnesse.testsystems.slim.tables.SlimTableFactoryTest();
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory1 = slimTableFactoryTest0.slimTableFactory;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory2 = slimTableFactoryTest0.slimTableFactory;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory3 = slimTableFactoryTest0.slimTableFactory;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory4 = null;
        slimTableFactoryTest0.slimTableFactory = slimTableFactory4;
        // The following exception was thrown during execution in test generation
        try {
            slimTableFactoryTest0.checkTableTypeDefinesIgnoredIfDifferentSpecified();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(slimTableFactory1);
        org.junit.Assert.assertNull(slimTableFactory2);
        org.junit.Assert.assertNull(slimTableFactory3);
    }

    @Test
    public void test00287() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00287");
        fitnesse.testsystems.slim.tables.SlimTableFactoryTest slimTableFactoryTest0 = new fitnesse.testsystems.slim.tables.SlimTableFactoryTest();
        fitnesse.testsystems.slim.Table table1 = null;
        slimTableFactoryTest0.table = table1;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory3 = slimTableFactoryTest0.slimTableFactory;
        fitnesse.testsystems.slim.Table table4 = null;
        slimTableFactoryTest0.table = table4;
        java.util.Map<java.lang.String, java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable>> strMap6 = slimTableFactoryTest0.map;
        // The following exception was thrown during execution in test generation
        try {
            slimTableFactoryTest0.addTableTypeImport("", "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(slimTableFactory3);
        org.junit.Assert.assertNull(strMap6);
    }

    @Test
    public void test00288() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00288");
        fitnesse.testsystems.slim.tables.SlimTableFactoryTest slimTableFactoryTest0 = new fitnesse.testsystems.slim.tables.SlimTableFactoryTest();
        fitnesse.testsystems.slim.Table table1 = null;
        slimTableFactoryTest0.table = table1;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory3 = slimTableFactoryTest0.slimTableFactory;
        java.util.Map<java.lang.String, java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable>> strMap4 = slimTableFactoryTest0.getmap();
        fitnesse.testsystems.slim.Table table5 = null;
        slimTableFactoryTest0.settable(table5);
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory7 = null;
        slimTableFactoryTest0.setslimTableFactory(slimTableFactory7);
        java.lang.Class<?> wildcardClass9 = slimTableFactoryTest0.getClass();
        org.junit.Assert.assertNull(slimTableFactory3);
        org.junit.Assert.assertNull(strMap4);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test00289() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00289");
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
        java.util.Map<java.lang.String, java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable>> strMap11 = slimTableFactoryTest0.map;
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
        org.junit.Assert.assertNull(table10);
        org.junit.Assert.assertNull(strMap11);
    }

    @Test
    public void test00290() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00290");
        fitnesse.testsystems.slim.tables.SlimTableFactoryTest slimTableFactoryTest0 = new fitnesse.testsystems.slim.tables.SlimTableFactoryTest();
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory1 = slimTableFactoryTest0.slimTableFactory;
        fitnesse.testsystems.slim.Table table2 = slimTableFactoryTest0.table;
        java.util.Map<java.lang.String, java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable>> strMap3 = slimTableFactoryTest0.map;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory4 = null;
        slimTableFactoryTest0.slimTableFactory = slimTableFactory4;
        fitnesse.testsystems.slim.Table table6 = null;
        slimTableFactoryTest0.table = table6;
        java.util.Map<java.lang.String, java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable>> strMap8 = slimTableFactoryTest0.getmap();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass9 = strMap8.getClass();
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
    public void test00291() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00291");
        fitnesse.testsystems.slim.tables.SlimTableFactoryTest slimTableFactoryTest0 = new fitnesse.testsystems.slim.tables.SlimTableFactoryTest();
        fitnesse.testsystems.slim.Table table1 = null;
        slimTableFactoryTest0.table = table1;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory3 = slimTableFactoryTest0.slimTableFactory;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory4 = null;
        slimTableFactoryTest0.setslimTableFactory(slimTableFactory4);
        // The following exception was thrown during execution in test generation
        try {
            slimTableFactoryTest0.shouldCreateCorrectSlimTableForTablesType();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(slimTableFactory3);
    }

    @Test
    public void test00292() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00292");
        fitnesse.testsystems.slim.tables.SlimTableFactoryTest slimTableFactoryTest0 = new fitnesse.testsystems.slim.tables.SlimTableFactoryTest();
        fitnesse.testsystems.slim.Table table1 = null;
        slimTableFactoryTest0.table = table1;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory3 = slimTableFactoryTest0.slimTableFactory;
        java.util.Map<java.lang.String, java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable>> strMap4 = slimTableFactoryTest0.map;
        java.lang.Class<?> wildcardClass5 = slimTableFactoryTest0.getClass();
        org.junit.Assert.assertNull(slimTableFactory3);
        org.junit.Assert.assertNull(strMap4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test00293() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00293");
        fitnesse.testsystems.slim.tables.SlimTableFactoryTest slimTableFactoryTest0 = new fitnesse.testsystems.slim.tables.SlimTableFactoryTest();
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory1 = slimTableFactoryTest0.slimTableFactory;
        fitnesse.testsystems.slim.Table table2 = slimTableFactoryTest0.table;
        java.util.Map<java.lang.String, java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable>> strMap3 = slimTableFactoryTest0.map;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory4 = null;
        slimTableFactoryTest0.slimTableFactory = slimTableFactory4;
        fitnesse.testsystems.slim.Table table6 = null;
        slimTableFactoryTest0.table = table6;
        fitnesse.testsystems.slim.Table table8 = slimTableFactoryTest0.gettable();
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
        org.junit.Assert.assertNull(table8);
    }

    @Test
    public void test00294() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00294");
        fitnesse.testsystems.slim.tables.SlimTableFactoryTest slimTableFactoryTest0 = new fitnesse.testsystems.slim.tables.SlimTableFactoryTest();
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory1 = slimTableFactoryTest0.slimTableFactory;
        fitnesse.testsystems.slim.Table table2 = slimTableFactoryTest0.table;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory3 = null;
        slimTableFactoryTest0.setslimTableFactory(slimTableFactory3);
        fitnesse.testsystems.slim.Table table5 = null;
        slimTableFactoryTest0.settable(table5);
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
    public void test00295() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00295");
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
    public void test00296() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00296");
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
            slimTableFactoryTest0.tableTypeStartingWithcommentColonShouldReturnNull();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(slimTableFactory3);
        org.junit.Assert.assertNull(strMap4);
        org.junit.Assert.assertNull(table13);
    }

    @Test
    public void test00297() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00297");
        fitnesse.testsystems.slim.tables.SlimTableFactoryTest slimTableFactoryTest0 = new fitnesse.testsystems.slim.tables.SlimTableFactoryTest();
        fitnesse.testsystems.slim.Table table1 = null;
        slimTableFactoryTest0.table = table1;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory3 = slimTableFactoryTest0.slimTableFactory;
        java.util.Map<java.lang.String, java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable>> strMap4 = slimTableFactoryTest0.map;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory5 = null;
        slimTableFactoryTest0.setslimTableFactory(slimTableFactory5);
        // The following exception was thrown during execution in test generation
        try {
            slimTableFactoryTest0.checkTableTypeDefinesIgnoredIfDifferentSpecified();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(slimTableFactory3);
        org.junit.Assert.assertNull(strMap4);
    }

    @Test
    public void test00298() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00298");
        fitnesse.testsystems.slim.tables.SlimTableFactoryTest slimTableFactoryTest0 = new fitnesse.testsystems.slim.tables.SlimTableFactoryTest();
        fitnesse.testsystems.slim.Table table1 = null;
        slimTableFactoryTest0.table = table1;
        fitnesse.testsystems.slim.Table table3 = null;
        slimTableFactoryTest0.settable(table3);
        java.util.Map<java.lang.String, java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable>> strMap5 = slimTableFactoryTest0.map;
        java.util.Map<java.lang.String, java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable>> strMap6 = slimTableFactoryTest0.getmap();
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory7 = slimTableFactoryTest0.slimTableFactory;
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
    }

    @Test
    public void test00299() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00299");
        fitnesse.testsystems.slim.tables.SlimTableFactoryTest slimTableFactoryTest0 = new fitnesse.testsystems.slim.tables.SlimTableFactoryTest();
        fitnesse.testsystems.slim.Table table1 = slimTableFactoryTest0.table;
        java.util.Map<java.lang.String, java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable>> strMap2 = slimTableFactoryTest0.getmap();
        java.util.Map<java.lang.String, java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable>> strMap3 = slimTableFactoryTest0.getmap();
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory4 = slimTableFactoryTest0.slimTableFactory;
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
        org.junit.Assert.assertNull(table1);
        org.junit.Assert.assertNull(strMap2);
        org.junit.Assert.assertNull(strMap3);
        org.junit.Assert.assertNull(slimTableFactory4);
        org.junit.Assert.assertNull(slimTableFactory7);
    }

    @Test
    public void test00300() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00300");
        fitnesse.testsystems.slim.tables.SlimTableFactoryTest slimTableFactoryTest0 = new fitnesse.testsystems.slim.tables.SlimTableFactoryTest();
        fitnesse.testsystems.slim.Table table1 = null;
        slimTableFactoryTest0.table = table1;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory3 = null;
        slimTableFactoryTest0.slimTableFactory = slimTableFactory3;
        fitnesse.testsystems.slim.Table table5 = null;
        slimTableFactoryTest0.settable(table5);
        java.util.Map<java.lang.String, java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable>> strMap7 = slimTableFactoryTest0.getmap();
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
    public void test00301() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00301");
        fitnesse.testsystems.slim.tables.SlimTableFactoryTest slimTableFactoryTest0 = new fitnesse.testsystems.slim.tables.SlimTableFactoryTest();
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory1 = slimTableFactoryTest0.slimTableFactory;
        fitnesse.testsystems.slim.Table table2 = null;
        slimTableFactoryTest0.settable(table2);
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory4 = slimTableFactoryTest0.slimTableFactory;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory5 = null;
        slimTableFactoryTest0.setslimTableFactory(slimTableFactory5);
        // The following exception was thrown during execution in test generation
        try {
            slimTableFactoryTest0.checkTableTypeDefineUsedForTable();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(slimTableFactory1);
        org.junit.Assert.assertNull(slimTableFactory4);
    }

    @Test
    public void test00302() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00302");
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
        java.util.Map<java.lang.String, java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable>> strMap11 = slimTableFactoryTest0.map;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory12 = slimTableFactoryTest0.getslimTableFactory();
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
        org.junit.Assert.assertNull(table10);
        org.junit.Assert.assertNull(strMap11);
        org.junit.Assert.assertNull(slimTableFactory12);
    }

    @Test
    public void test00303() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00303");
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
        org.junit.Assert.assertNull(table14);
    }

    @Test
    public void test00304() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00304");
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
        // The following exception was thrown during execution in test generation
        try {
            slimTableFactoryTest0.checkTableTypeDefineUsedForTable();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(slimTableFactory7);
        org.junit.Assert.assertNull(slimTableFactory8);
        org.junit.Assert.assertNull(table9);
    }

    @Test
    public void test00305() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00305");
        fitnesse.testsystems.slim.tables.SlimTableFactoryTest slimTableFactoryTest0 = new fitnesse.testsystems.slim.tables.SlimTableFactoryTest();
        fitnesse.testsystems.slim.Table table1 = null;
        slimTableFactoryTest0.table = table1;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory3 = slimTableFactoryTest0.slimTableFactory;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory4 = slimTableFactoryTest0.slimTableFactory;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory5 = slimTableFactoryTest0.slimTableFactory;
        // The following exception was thrown during execution in test generation
        try {
            slimTableFactoryTest0.tableTypeStartingWithcommentColonShouldReturnNull();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(slimTableFactory3);
        org.junit.Assert.assertNull(slimTableFactory4);
        org.junit.Assert.assertNull(slimTableFactory5);
    }

    @Test
    public void test00306() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00306");
        fitnesse.testsystems.slim.tables.SlimTableFactoryTest slimTableFactoryTest0 = new fitnesse.testsystems.slim.tables.SlimTableFactoryTest();
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory1 = slimTableFactoryTest0.slimTableFactory;
        fitnesse.testsystems.slim.Table table2 = slimTableFactoryTest0.table;
        java.util.Map<java.lang.String, java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable>> strMap3 = slimTableFactoryTest0.map;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory4 = null;
        slimTableFactoryTest0.slimTableFactory = slimTableFactory4;
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
    }

    @Test
    public void test00307() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00307");
        fitnesse.testsystems.slim.tables.SlimTableFactoryTest slimTableFactoryTest0 = new fitnesse.testsystems.slim.tables.SlimTableFactoryTest();
        fitnesse.testsystems.slim.Table table1 = null;
        slimTableFactoryTest0.table = table1;
        fitnesse.testsystems.slim.Table table3 = null;
        slimTableFactoryTest0.settable(table3);
        fitnesse.testsystems.slim.Table table5 = null;
        slimTableFactoryTest0.settable(table5);
        java.lang.Class<?> wildcardClass7 = slimTableFactoryTest0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test00308() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00308");
        fitnesse.testsystems.slim.tables.SlimTableFactoryTest slimTableFactoryTest0 = new fitnesse.testsystems.slim.tables.SlimTableFactoryTest();
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory1 = slimTableFactoryTest0.slimTableFactory;
        fitnesse.testsystems.slim.Table table2 = null;
        slimTableFactoryTest0.settable(table2);
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory4 = null;
        slimTableFactoryTest0.setslimTableFactory(slimTableFactory4);
        // The following exception was thrown during execution in test generation
        try {
            slimTableFactoryTest0.addTableTypeImport("", "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(slimTableFactory1);
    }

    @Test
    public void test00309() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00309");
        fitnesse.testsystems.slim.tables.SlimTableFactoryTest slimTableFactoryTest0 = new fitnesse.testsystems.slim.tables.SlimTableFactoryTest();
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory1 = slimTableFactoryTest0.slimTableFactory;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory2 = slimTableFactoryTest0.slimTableFactory;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory3 = null;
        slimTableFactoryTest0.slimTableFactory = slimTableFactory3;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory5 = slimTableFactoryTest0.slimTableFactory;
        // The following exception was thrown during execution in test generation
        try {
            slimTableFactoryTest0.shouldCreateCorrectSlimTableForTablesType();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(slimTableFactory1);
        org.junit.Assert.assertNull(slimTableFactory2);
        org.junit.Assert.assertNull(slimTableFactory5);
    }

    @Test
    public void test00310() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00310");
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
        fitnesse.testsystems.slim.Table table15 = null;
        slimTableFactoryTest0.settable(table15);
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
    }

    @Test
    public void test00311() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00311");
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
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory10 = slimTableFactoryTest0.slimTableFactory;
        java.lang.Class<?> wildcardClass11 = slimTableFactoryTest0.getClass();
        org.junit.Assert.assertNull(slimTableFactory1);
        org.junit.Assert.assertNull(table2);
        org.junit.Assert.assertNull(slimTableFactory7);
        org.junit.Assert.assertNull(slimTableFactory8);
        org.junit.Assert.assertNull(table9);
        org.junit.Assert.assertNull(slimTableFactory10);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test00312() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00312");
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
        org.junit.Assert.assertNull(slimTableFactory7);
        org.junit.Assert.assertNull(slimTableFactory10);
    }

    @Test
    public void test00313() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00313");
        fitnesse.testsystems.slim.tables.SlimTableFactoryTest slimTableFactoryTest0 = new fitnesse.testsystems.slim.tables.SlimTableFactoryTest();
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory1 = slimTableFactoryTest0.slimTableFactory;
        fitnesse.testsystems.slim.Table table2 = slimTableFactoryTest0.gettable();
        java.util.Map<java.lang.String, java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable>> strMap3 = slimTableFactoryTest0.map;
        fitnesse.testsystems.slim.Table table4 = null;
        slimTableFactoryTest0.settable(table4);
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
    }

    @Test
    public void test00314() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00314");
        fitnesse.testsystems.slim.tables.SlimTableFactoryTest slimTableFactoryTest0 = new fitnesse.testsystems.slim.tables.SlimTableFactoryTest();
        fitnesse.testsystems.slim.Table table1 = null;
        slimTableFactoryTest0.table = table1;
        fitnesse.testsystems.slim.Table table3 = null;
        slimTableFactoryTest0.settable(table3);
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory5 = null;
        slimTableFactoryTest0.slimTableFactory = slimTableFactory5;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory7 = null;
        slimTableFactoryTest0.slimTableFactory = slimTableFactory7;
        java.lang.Class<?> wildcardClass9 = slimTableFactoryTest0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test00315() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00315");
        fitnesse.testsystems.slim.tables.SlimTableFactoryTest slimTableFactoryTest0 = new fitnesse.testsystems.slim.tables.SlimTableFactoryTest();
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory1 = slimTableFactoryTest0.slimTableFactory;
        fitnesse.testsystems.slim.Table table2 = slimTableFactoryTest0.table;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory3 = null;
        slimTableFactoryTest0.setslimTableFactory(slimTableFactory3);
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory5 = null;
        slimTableFactoryTest0.slimTableFactory = slimTableFactory5;
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
    public void test00316() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00316");
        fitnesse.testsystems.slim.tables.SlimTableFactoryTest slimTableFactoryTest0 = new fitnesse.testsystems.slim.tables.SlimTableFactoryTest();
        fitnesse.testsystems.slim.Table table1 = null;
        slimTableFactoryTest0.table = table1;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory3 = slimTableFactoryTest0.slimTableFactory;
        java.util.Map<java.lang.String, java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable>> strMap4 = slimTableFactoryTest0.map;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory5 = slimTableFactoryTest0.getslimTableFactory();
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
    }

    @Test
    public void test00317() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00317");
        fitnesse.testsystems.slim.tables.SlimTableFactoryTest slimTableFactoryTest0 = new fitnesse.testsystems.slim.tables.SlimTableFactoryTest();
        fitnesse.testsystems.slim.Table table1 = null;
        slimTableFactoryTest0.table = table1;
        fitnesse.testsystems.slim.Table table3 = null;
        slimTableFactoryTest0.settable(table3);
        java.util.Map<java.lang.String, java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable>> strMap5 = slimTableFactoryTest0.map;
        java.util.Map<java.lang.String, java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable>> strMap6 = slimTableFactoryTest0.getmap();
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory7 = null;
        slimTableFactoryTest0.slimTableFactory = slimTableFactory7;
        // The following exception was thrown during execution in test generation
        try {
            slimTableFactoryTest0.checkTableTypeDefinesIgnoredIfDifferentSpecified();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(strMap5);
        org.junit.Assert.assertNull(strMap6);
    }

    @Test
    public void test00318() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00318");
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
        java.util.Map<java.lang.String, java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable>> strMap11 = slimTableFactoryTest0.map;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory12 = slimTableFactoryTest0.getslimTableFactory();
        fitnesse.testsystems.slim.Table table13 = null;
        slimTableFactoryTest0.settable(table13);
        fitnesse.testsystems.slim.Table table15 = null;
        slimTableFactoryTest0.settable(table15);
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
        org.junit.Assert.assertNull(strMap11);
        org.junit.Assert.assertNull(slimTableFactory12);
    }

    @Test
    public void test00319() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00319");
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
        fitnesse.testsystems.slim.Table table12 = slimTableFactoryTest0.gettable();
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
        org.junit.Assert.assertNull(table10);
        org.junit.Assert.assertNull(table11);
        org.junit.Assert.assertNull(table12);
    }

    @Test
    public void test00320() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00320");
        fitnesse.testsystems.slim.tables.SlimTableFactoryTest slimTableFactoryTest0 = new fitnesse.testsystems.slim.tables.SlimTableFactoryTest();
        fitnesse.testsystems.slim.Table table1 = null;
        slimTableFactoryTest0.table = table1;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory3 = slimTableFactoryTest0.getslimTableFactory();
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory4 = slimTableFactoryTest0.getslimTableFactory();
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
        org.junit.Assert.assertNull(slimTableFactory4);
    }

    @Test
    public void test00321() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00321");
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
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory12 = slimTableFactoryTest0.slimTableFactory;
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
        org.junit.Assert.assertNull(slimTableFactory10);
        org.junit.Assert.assertNull(slimTableFactory11);
        org.junit.Assert.assertNull(slimTableFactory12);
    }

    @Test
    public void test00322() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00322");
        fitnesse.testsystems.slim.tables.SlimTableFactoryTest slimTableFactoryTest0 = new fitnesse.testsystems.slim.tables.SlimTableFactoryTest();
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory1 = slimTableFactoryTest0.slimTableFactory;
        fitnesse.testsystems.slim.Table table2 = slimTableFactoryTest0.gettable();
        fitnesse.testsystems.slim.Table table3 = null;
        slimTableFactoryTest0.table = table3;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory5 = slimTableFactoryTest0.getslimTableFactory();
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory6 = null;
        slimTableFactoryTest0.setslimTableFactory(slimTableFactory6);
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory8 = null;
        slimTableFactoryTest0.setslimTableFactory(slimTableFactory8);
        // The following exception was thrown during execution in test generation
        try {
            slimTableFactoryTest0.checkTableTypeDefineUsedForTable();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(slimTableFactory1);
        org.junit.Assert.assertNull(table2);
        org.junit.Assert.assertNull(slimTableFactory5);
    }

    @Test
    public void test00323() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00323");
        fitnesse.testsystems.slim.tables.SlimTableFactoryTest slimTableFactoryTest0 = new fitnesse.testsystems.slim.tables.SlimTableFactoryTest();
        fitnesse.testsystems.slim.Table table1 = slimTableFactoryTest0.table;
        java.util.Map<java.lang.String, java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable>> strMap2 = slimTableFactoryTest0.getmap();
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory3 = null;
        slimTableFactoryTest0.slimTableFactory = slimTableFactory3;
        fitnesse.testsystems.slim.Table table5 = slimTableFactoryTest0.table;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory6 = slimTableFactoryTest0.slimTableFactory;
        java.lang.Class<?> wildcardClass7 = slimTableFactoryTest0.getClass();
        org.junit.Assert.assertNull(table1);
        org.junit.Assert.assertNull(strMap2);
        org.junit.Assert.assertNull(table5);
        org.junit.Assert.assertNull(slimTableFactory6);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test00324() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00324");
        fitnesse.testsystems.slim.tables.SlimTableFactoryTest slimTableFactoryTest0 = new fitnesse.testsystems.slim.tables.SlimTableFactoryTest();
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory1 = slimTableFactoryTest0.slimTableFactory;
        fitnesse.testsystems.slim.Table table2 = slimTableFactoryTest0.gettable();
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory3 = null;
        slimTableFactoryTest0.slimTableFactory = slimTableFactory3;
        java.lang.Class<?> wildcardClass5 = slimTableFactoryTest0.getClass();
        org.junit.Assert.assertNull(slimTableFactory1);
        org.junit.Assert.assertNull(table2);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test00325() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00325");
        fitnesse.testsystems.slim.tables.SlimTableFactoryTest slimTableFactoryTest0 = new fitnesse.testsystems.slim.tables.SlimTableFactoryTest();
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory1 = slimTableFactoryTest0.slimTableFactory;
        fitnesse.testsystems.slim.Table table2 = slimTableFactoryTest0.gettable();
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory3 = null;
        slimTableFactoryTest0.slimTableFactory = slimTableFactory3;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory5 = null;
        slimTableFactoryTest0.slimTableFactory = slimTableFactory5;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory7 = slimTableFactoryTest0.slimTableFactory;
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
    public void test00326() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00326");
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
        fitnesse.testsystems.slim.Table table13 = null;
        slimTableFactoryTest0.table = table13;
        // The following exception was thrown during execution in test generation
        try {
            slimTableFactoryTest0.checkTableTypeDefineUsedForTable();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(slimTableFactory9);
        org.junit.Assert.assertNull(slimTableFactory12);
    }

    @Test
    public void test00327() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00327");
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
        // The following exception was thrown during execution in test generation
        try {
            slimTableFactoryTest0.addTableTypeImport("hi!", "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(slimTableFactory3);
        org.junit.Assert.assertNull(strMap4);
    }

    @Test
    public void test00328() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00328");
        fitnesse.testsystems.slim.tables.SlimTableFactoryTest slimTableFactoryTest0 = new fitnesse.testsystems.slim.tables.SlimTableFactoryTest();
        fitnesse.testsystems.slim.Table table1 = null;
        slimTableFactoryTest0.table = table1;
        fitnesse.testsystems.slim.Table table3 = null;
        slimTableFactoryTest0.settable(table3);
        java.util.Map<java.lang.String, java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable>> strMap5 = slimTableFactoryTest0.map;
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
        org.junit.Assert.assertNull(strMap5);
        org.junit.Assert.assertNull(strMap6);
    }

    @Test
    public void test00329() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00329");
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
        // The following exception was thrown during execution in test generation
        try {
            slimTableFactoryTest0.shouldCreateCorrectSlimTableForTablesType();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(strMap5);
        org.junit.Assert.assertNull(slimTableFactory10);
    }

    @Test
    public void test00330() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00330");
        fitnesse.testsystems.slim.tables.SlimTableFactoryTest slimTableFactoryTest0 = new fitnesse.testsystems.slim.tables.SlimTableFactoryTest();
        fitnesse.testsystems.slim.Table table1 = null;
        slimTableFactoryTest0.table = table1;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory3 = slimTableFactoryTest0.slimTableFactory;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory4 = slimTableFactoryTest0.slimTableFactory;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory5 = slimTableFactoryTest0.slimTableFactory;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory6 = null;
        slimTableFactoryTest0.slimTableFactory = slimTableFactory6;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory8 = null;
        slimTableFactoryTest0.slimTableFactory = slimTableFactory8;
        // The following exception was thrown during execution in test generation
        try {
            slimTableFactoryTest0.tableTypeStartingWithcommentColonShouldReturnNull();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(slimTableFactory3);
        org.junit.Assert.assertNull(slimTableFactory4);
        org.junit.Assert.assertNull(slimTableFactory5);
    }

    @Test
    public void test00331() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00331");
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
            slimTableFactoryTest0.commentTableShouldReturnNull();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(strMap7);
        org.junit.Assert.assertNull(strMap8);
        org.junit.Assert.assertNull(table9);
    }

    @Test
    public void test00332() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00332");
        fitnesse.testsystems.slim.tables.SlimTableFactoryTest slimTableFactoryTest0 = new fitnesse.testsystems.slim.tables.SlimTableFactoryTest();
        fitnesse.testsystems.slim.Table table1 = null;
        slimTableFactoryTest0.table = table1;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory3 = slimTableFactoryTest0.slimTableFactory;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory4 = slimTableFactoryTest0.slimTableFactory;
        java.util.Map<java.lang.String, java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable>> strMap5 = slimTableFactoryTest0.map;
        fitnesse.testsystems.slim.Table table6 = slimTableFactoryTest0.table;
        // The following exception was thrown during execution in test generation
        try {
            slimTableFactoryTest0.checkTableTypeDefinesIgnoredIfDifferentSpecified();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(slimTableFactory3);
        org.junit.Assert.assertNull(slimTableFactory4);
        org.junit.Assert.assertNull(strMap5);
        org.junit.Assert.assertNull(table6);
    }

    @Test
    public void test00333() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00333");
        fitnesse.testsystems.slim.tables.SlimTableFactoryTest slimTableFactoryTest0 = new fitnesse.testsystems.slim.tables.SlimTableFactoryTest();
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory1 = slimTableFactoryTest0.slimTableFactory;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory2 = slimTableFactoryTest0.slimTableFactory;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory3 = slimTableFactoryTest0.slimTableFactory;
        fitnesse.testsystems.slim.Table table4 = null;
        slimTableFactoryTest0.table = table4;
        // The following exception was thrown during execution in test generation
        try {
            slimTableFactoryTest0.shouldCreateCorrectSlimTableForTablesType();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(slimTableFactory1);
        org.junit.Assert.assertNull(slimTableFactory2);
        org.junit.Assert.assertNull(slimTableFactory3);
    }

    @Test
    public void test00334() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00334");
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
            slimTableFactoryTest0.addTableTypeImport("hi!", "hi!");
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
    public void test00335() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00335");
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
        java.lang.Class<?> wildcardClass13 = slimTableFactoryTest0.getClass();
        org.junit.Assert.assertNull(slimTableFactory1);
        org.junit.Assert.assertNull(table2);
        org.junit.Assert.assertNull(slimTableFactory7);
        org.junit.Assert.assertNull(slimTableFactory8);
        org.junit.Assert.assertNull(table9);
        org.junit.Assert.assertNull(table12);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test00336() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00336");
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
            slimTableFactoryTest0.commentTableShouldReturnNull();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(slimTableFactory5);
        org.junit.Assert.assertNull(slimTableFactory6);
    }

    @Test
    public void test00337() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00337");
        fitnesse.testsystems.slim.tables.SlimTableFactoryTest slimTableFactoryTest0 = new fitnesse.testsystems.slim.tables.SlimTableFactoryTest();
        fitnesse.testsystems.slim.Table table1 = null;
        slimTableFactoryTest0.table = table1;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory3 = slimTableFactoryTest0.slimTableFactory;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory4 = null;
        slimTableFactoryTest0.slimTableFactory = slimTableFactory4;
        java.util.Map<java.lang.String, java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable>> strMap6 = slimTableFactoryTest0.getmap();
        // The following exception was thrown during execution in test generation
        try {
            slimTableFactoryTest0.checkTableTypeDefinesIgnoredIfDifferentSpecified();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(slimTableFactory3);
        org.junit.Assert.assertNull(strMap6);
    }

    @Test
    public void test00338() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00338");
        fitnesse.testsystems.slim.tables.SlimTableFactoryTest slimTableFactoryTest0 = new fitnesse.testsystems.slim.tables.SlimTableFactoryTest();
        fitnesse.testsystems.slim.Table table1 = null;
        slimTableFactoryTest0.table = table1;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory3 = slimTableFactoryTest0.slimTableFactory;
        java.util.Map<java.lang.String, java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable>> strMap4 = slimTableFactoryTest0.getmap();
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory5 = slimTableFactoryTest0.slimTableFactory;
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
        org.junit.Assert.assertNull(slimTableFactory3);
        org.junit.Assert.assertNull(strMap4);
        org.junit.Assert.assertNull(slimTableFactory5);
        org.junit.Assert.assertNull(strMap6);
    }

    @Test
    public void test00339() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00339");
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
    }

    @Test
    public void test00340() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00340");
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
    }

    @Test
    public void test00341() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00341");
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
    }

    @Test
    public void test00342() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00342");
        fitnesse.testsystems.slim.tables.SlimTableFactoryTest slimTableFactoryTest0 = new fitnesse.testsystems.slim.tables.SlimTableFactoryTest();
        fitnesse.testsystems.slim.Table table1 = null;
        slimTableFactoryTest0.table = table1;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory3 = slimTableFactoryTest0.slimTableFactory;
        java.util.Map<java.lang.String, java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable>> strMap4 = slimTableFactoryTest0.map;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory5 = null;
        slimTableFactoryTest0.setslimTableFactory(slimTableFactory5);
        // The following exception was thrown during execution in test generation
        try {
            slimTableFactoryTest0.addTableTypeImport("hi!", "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(slimTableFactory3);
        org.junit.Assert.assertNull(strMap4);
    }

    @Test
    public void test00343() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00343");
        fitnesse.testsystems.slim.tables.SlimTableFactoryTest slimTableFactoryTest0 = new fitnesse.testsystems.slim.tables.SlimTableFactoryTest();
        fitnesse.testsystems.slim.Table table1 = null;
        slimTableFactoryTest0.table = table1;
        fitnesse.testsystems.slim.Table table3 = null;
        slimTableFactoryTest0.settable(table3);
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory5 = null;
        slimTableFactoryTest0.setslimTableFactory(slimTableFactory5);
        fitnesse.testsystems.slim.Table table7 = slimTableFactoryTest0.table;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory8 = slimTableFactoryTest0.getslimTableFactory();
        // The following exception was thrown during execution in test generation
        try {
            slimTableFactoryTest0.checkTableTypeDefineUsedForTable();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(table7);
        org.junit.Assert.assertNull(slimTableFactory8);
    }

    @Test
    public void test00344() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00344");
        fitnesse.testsystems.slim.tables.SlimTableFactoryTest slimTableFactoryTest0 = new fitnesse.testsystems.slim.tables.SlimTableFactoryTest();
        fitnesse.testsystems.slim.Table table1 = null;
        slimTableFactoryTest0.table = table1;
        fitnesse.testsystems.slim.Table table3 = slimTableFactoryTest0.table;
        fitnesse.testsystems.slim.Table table4 = slimTableFactoryTest0.gettable();
        java.util.Map<java.lang.String, java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable>> strMap5 = slimTableFactoryTest0.getmap();
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory6 = slimTableFactoryTest0.getslimTableFactory();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass7 = slimTableFactory6.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(table3);
        org.junit.Assert.assertNull(table4);
        org.junit.Assert.assertNull(strMap5);
        org.junit.Assert.assertNull(slimTableFactory6);
    }

    @Test
    public void test00345() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00345");
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
    public void test00346() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00346");
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
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory12 = null;
        slimTableFactoryTest0.slimTableFactory = slimTableFactory12;
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
    }

    @Test
    public void test00347() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00347");
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
        fitnesse.testsystems.slim.Table table12 = slimTableFactoryTest0.gettable();
        // The following exception was thrown during execution in test generation
        try {
            slimTableFactoryTest0.checkTableTypeDefinesIgnoredIfDifferentSpecified();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(table7);
        org.junit.Assert.assertNull(table12);
    }

    @Test
    public void test00348() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00348");
        fitnesse.testsystems.slim.tables.SlimTableFactoryTest slimTableFactoryTest0 = new fitnesse.testsystems.slim.tables.SlimTableFactoryTest();
        fitnesse.testsystems.slim.Table table1 = slimTableFactoryTest0.table;
        java.util.Map<java.lang.String, java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable>> strMap2 = slimTableFactoryTest0.getmap();
        java.util.Map<java.lang.String, java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable>> strMap3 = slimTableFactoryTest0.getmap();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass4 = strMap3.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(table1);
        org.junit.Assert.assertNull(strMap2);
        org.junit.Assert.assertNull(strMap3);
    }

    @Test
    public void test00349() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00349");
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
    public void test00350() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00350");
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
        fitnesse.testsystems.slim.Table table13 = null;
        slimTableFactoryTest0.settable(table13);
        // The following exception was thrown during execution in test generation
        try {
            slimTableFactoryTest0.commentTableShouldReturnNull();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(table7);
        org.junit.Assert.assertNull(strMap12);
    }

    @Test
    public void test00351() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00351");
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
            slimTableFactoryTest0.tableTypeStartingWithcommentColonShouldReturnNull();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(slimTableFactory5);
        org.junit.Assert.assertNull(slimTableFactory6);
    }

    @Test
    public void test00352() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00352");
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
            slimTableFactoryTest0.checkTableTypeDefinesIgnoredIfDifferentSpecified();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(slimTableFactory5);
        org.junit.Assert.assertNull(table8);
        org.junit.Assert.assertNull(strMap9);
    }

    @Test
    public void test00353() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00353");
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
    public void test00354() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00354");
        fitnesse.testsystems.slim.tables.SlimTableFactoryTest slimTableFactoryTest0 = new fitnesse.testsystems.slim.tables.SlimTableFactoryTest();
        fitnesse.testsystems.slim.Table table1 = null;
        slimTableFactoryTest0.table = table1;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory3 = slimTableFactoryTest0.slimTableFactory;
        java.util.Map<java.lang.String, java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable>> strMap4 = slimTableFactoryTest0.getmap();
        fitnesse.testsystems.slim.Table table5 = null;
        slimTableFactoryTest0.settable(table5);
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory7 = null;
        slimTableFactoryTest0.setslimTableFactory(slimTableFactory7);
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
    public void test00355() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00355");
        fitnesse.testsystems.slim.tables.SlimTableFactoryTest slimTableFactoryTest0 = new fitnesse.testsystems.slim.tables.SlimTableFactoryTest();
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory1 = slimTableFactoryTest0.slimTableFactory;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory2 = slimTableFactoryTest0.slimTableFactory;
        java.util.Map<java.lang.String, java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable>> strMap3 = slimTableFactoryTest0.map;
        java.util.Map<java.lang.String, java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable>> strMap4 = slimTableFactoryTest0.map;
        org.junit.Assert.assertNull(slimTableFactory1);
        org.junit.Assert.assertNull(slimTableFactory2);
        org.junit.Assert.assertNull(strMap3);
        org.junit.Assert.assertNull(strMap4);
    }

    @Test
    public void test00356() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00356");
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
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory12 = slimTableFactoryTest0.slimTableFactory;
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
        org.junit.Assert.assertNull(slimTableFactory12);
    }

    @Test
    public void test00357() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00357");
        fitnesse.testsystems.slim.tables.SlimTableFactoryTest slimTableFactoryTest0 = new fitnesse.testsystems.slim.tables.SlimTableFactoryTest();
        fitnesse.testsystems.slim.Table table1 = null;
        slimTableFactoryTest0.table = table1;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory3 = slimTableFactoryTest0.slimTableFactory;
        fitnesse.testsystems.slim.Table table4 = null;
        slimTableFactoryTest0.settable(table4);
        // The following exception was thrown during execution in test generation
        try {
            slimTableFactoryTest0.tableTypeStartingWithcommentColonShouldReturnNull();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(slimTableFactory3);
    }

    @Test
    public void test00358() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00358");
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
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory10 = null;
        slimTableFactoryTest0.setslimTableFactory(slimTableFactory10);
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory12 = slimTableFactoryTest0.getslimTableFactory();
        java.lang.Class<?> wildcardClass13 = slimTableFactoryTest0.getClass();
        org.junit.Assert.assertNull(strMap5);
        org.junit.Assert.assertNull(slimTableFactory12);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test00359() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00359");
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
        java.lang.Class<?> wildcardClass15 = slimTableFactoryTest0.getClass();
        org.junit.Assert.assertNull(strMap5);
        org.junit.Assert.assertNull(strMap6);
        org.junit.Assert.assertNull(slimTableFactory7);
        org.junit.Assert.assertNull(strMap8);
        org.junit.Assert.assertNull(slimTableFactory9);
        org.junit.Assert.assertNull(slimTableFactory12);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test00360() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00360");
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
        java.util.Map<java.lang.String, java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable>> strMap10 = slimTableFactoryTest0.getmap();
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
        org.junit.Assert.assertNull(strMap10);
    }

    @Test
    public void test00361() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00361");
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
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory11 = null;
        slimTableFactoryTest0.slimTableFactory = slimTableFactory11;
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
    }

    @Test
    public void test00362() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00362");
        fitnesse.testsystems.slim.tables.SlimTableFactoryTest slimTableFactoryTest0 = new fitnesse.testsystems.slim.tables.SlimTableFactoryTest();
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory1 = slimTableFactoryTest0.slimTableFactory;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory2 = slimTableFactoryTest0.slimTableFactory;
        fitnesse.testsystems.slim.Table table3 = slimTableFactoryTest0.gettable();
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory4 = slimTableFactoryTest0.getslimTableFactory();
        java.util.Map<java.lang.String, java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable>> strMap5 = slimTableFactoryTest0.map;
        fitnesse.testsystems.slim.Table table6 = null;
        slimTableFactoryTest0.settable(table6);
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory8 = slimTableFactoryTest0.slimTableFactory;
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
        org.junit.Assert.assertNull(strMap5);
        org.junit.Assert.assertNull(slimTableFactory8);
    }

    @Test
    public void test00363() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00363");
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
    public void test00364() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00364");
        fitnesse.testsystems.slim.tables.SlimTableFactoryTest slimTableFactoryTest0 = new fitnesse.testsystems.slim.tables.SlimTableFactoryTest();
        fitnesse.testsystems.slim.Table table1 = null;
        slimTableFactoryTest0.table = table1;
        fitnesse.testsystems.slim.Table table3 = null;
        slimTableFactoryTest0.settable(table3);
        java.util.Map<java.lang.String, java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable>> strMap5 = slimTableFactoryTest0.map;
        java.util.Map<java.lang.String, java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable>> strMap6 = slimTableFactoryTest0.getmap();
        java.util.Map<java.lang.String, java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable>> strMap7 = slimTableFactoryTest0.getmap();
        // The following exception was thrown during execution in test generation
        try {
            slimTableFactoryTest0.shouldCreateCorrectSlimTableForTablesType();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(strMap5);
        org.junit.Assert.assertNull(strMap6);
        org.junit.Assert.assertNull(strMap7);
    }

    @Test
    public void test00365() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00365");
        fitnesse.testsystems.slim.tables.SlimTableFactoryTest slimTableFactoryTest0 = new fitnesse.testsystems.slim.tables.SlimTableFactoryTest();
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory1 = slimTableFactoryTest0.slimTableFactory;
        fitnesse.testsystems.slim.Table table2 = slimTableFactoryTest0.gettable();
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory3 = null;
        slimTableFactoryTest0.slimTableFactory = slimTableFactory3;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory5 = null;
        slimTableFactoryTest0.slimTableFactory = slimTableFactory5;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory7 = slimTableFactoryTest0.slimTableFactory;
        java.util.Map<java.lang.String, java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable>> strMap8 = slimTableFactoryTest0.map;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory9 = slimTableFactoryTest0.getslimTableFactory();
        java.lang.Class<?> wildcardClass10 = slimTableFactoryTest0.getClass();
        org.junit.Assert.assertNull(slimTableFactory1);
        org.junit.Assert.assertNull(table2);
        org.junit.Assert.assertNull(slimTableFactory7);
        org.junit.Assert.assertNull(strMap8);
        org.junit.Assert.assertNull(slimTableFactory9);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test00366() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00366");
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
        org.junit.Assert.assertNull(strMap14);
    }

    @Test
    public void test00367() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00367");
        fitnesse.testsystems.slim.tables.SlimTableFactoryTest slimTableFactoryTest0 = new fitnesse.testsystems.slim.tables.SlimTableFactoryTest();
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory1 = slimTableFactoryTest0.slimTableFactory;
        fitnesse.testsystems.slim.Table table2 = slimTableFactoryTest0.table;
        java.util.Map<java.lang.String, java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable>> strMap3 = slimTableFactoryTest0.map;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory4 = null;
        slimTableFactoryTest0.slimTableFactory = slimTableFactory4;
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
        org.junit.Assert.assertNull(slimTableFactory1);
        org.junit.Assert.assertNull(table2);
        org.junit.Assert.assertNull(strMap3);
        org.junit.Assert.assertNull(table8);
        org.junit.Assert.assertNull(strMap9);
    }

    @Test
    public void test00368() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00368");
        fitnesse.testsystems.slim.tables.SlimTableFactoryTest slimTableFactoryTest0 = new fitnesse.testsystems.slim.tables.SlimTableFactoryTest();
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory1 = slimTableFactoryTest0.slimTableFactory;
        fitnesse.testsystems.slim.Table table2 = slimTableFactoryTest0.gettable();
        java.util.Map<java.lang.String, java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable>> strMap3 = slimTableFactoryTest0.map;
        fitnesse.testsystems.slim.Table table4 = null;
        slimTableFactoryTest0.settable(table4);
        java.lang.Class<?> wildcardClass6 = slimTableFactoryTest0.getClass();
        org.junit.Assert.assertNull(slimTableFactory1);
        org.junit.Assert.assertNull(table2);
        org.junit.Assert.assertNull(strMap3);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test00369() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00369");
        fitnesse.testsystems.slim.tables.SlimTableFactoryTest slimTableFactoryTest0 = new fitnesse.testsystems.slim.tables.SlimTableFactoryTest();
        fitnesse.testsystems.slim.Table table1 = null;
        slimTableFactoryTest0.table = table1;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory3 = slimTableFactoryTest0.slimTableFactory;
        java.util.Map<java.lang.String, java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable>> strMap4 = slimTableFactoryTest0.getmap();
        fitnesse.testsystems.slim.Table table5 = null;
        slimTableFactoryTest0.settable(table5);
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
    public void test00370() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00370");
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
        fitnesse.testsystems.slim.Table table12 = slimTableFactoryTest0.table;
        // The following exception was thrown during execution in test generation
        try {
            slimTableFactoryTest0.addTableTypeImport("", "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(strMap5);
        org.junit.Assert.assertNull(slimTableFactory10);
        org.junit.Assert.assertNull(slimTableFactory11);
        org.junit.Assert.assertNull(table12);
    }

    @Test
    public void test00371() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00371");
        fitnesse.testsystems.slim.tables.SlimTableFactoryTest slimTableFactoryTest0 = new fitnesse.testsystems.slim.tables.SlimTableFactoryTest();
        fitnesse.testsystems.slim.Table table1 = slimTableFactoryTest0.table;
        java.util.Map<java.lang.String, java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable>> strMap2 = slimTableFactoryTest0.getmap();
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory3 = null;
        slimTableFactoryTest0.slimTableFactory = slimTableFactory3;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory5 = slimTableFactoryTest0.slimTableFactory;
        // The following exception was thrown during execution in test generation
        try {
            slimTableFactoryTest0.checkTableTypeDefinesIgnoredIfDifferentSpecified();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(table1);
        org.junit.Assert.assertNull(strMap2);
        org.junit.Assert.assertNull(slimTableFactory5);
    }

    @Test
    public void test00372() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00372");
        fitnesse.testsystems.slim.tables.SlimTableFactoryTest slimTableFactoryTest0 = new fitnesse.testsystems.slim.tables.SlimTableFactoryTest();
        fitnesse.testsystems.slim.Table table1 = slimTableFactoryTest0.table;
        java.util.Map<java.lang.String, java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable>> strMap2 = slimTableFactoryTest0.getmap();
        java.util.Map<java.lang.String, java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable>> strMap3 = slimTableFactoryTest0.getmap();
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory4 = slimTableFactoryTest0.slimTableFactory;
        fitnesse.testsystems.slim.Table table5 = null;
        slimTableFactoryTest0.table = table5;
        java.util.Map<java.lang.String, java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable>> strMap7 = slimTableFactoryTest0.map;
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
        org.junit.Assert.assertNull(strMap7);
    }

    @Test
    public void test00373() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00373");
        fitnesse.testsystems.slim.tables.SlimTableFactoryTest slimTableFactoryTest0 = new fitnesse.testsystems.slim.tables.SlimTableFactoryTest();
        fitnesse.testsystems.slim.Table table1 = slimTableFactoryTest0.table;
        java.util.Map<java.lang.String, java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable>> strMap2 = slimTableFactoryTest0.getmap();
        java.util.Map<java.lang.String, java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable>> strMap3 = slimTableFactoryTest0.getmap();
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory4 = slimTableFactoryTest0.slimTableFactory;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory5 = slimTableFactoryTest0.getslimTableFactory();
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory6 = null;
        slimTableFactoryTest0.setslimTableFactory(slimTableFactory6);
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
        org.junit.Assert.assertNull(slimTableFactory5);
    }

    @Test
    public void test00374() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00374");
        fitnesse.testsystems.slim.tables.SlimTableFactoryTest slimTableFactoryTest0 = new fitnesse.testsystems.slim.tables.SlimTableFactoryTest();
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory1 = slimTableFactoryTest0.slimTableFactory;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory2 = slimTableFactoryTest0.slimTableFactory;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory3 = slimTableFactoryTest0.slimTableFactory;
        java.util.Map<java.lang.String, java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable>> strMap4 = slimTableFactoryTest0.map;
        java.util.Map<java.lang.String, java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable>> strMap5 = slimTableFactoryTest0.map;
        java.util.Map<java.lang.String, java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable>> strMap6 = slimTableFactoryTest0.map;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory7 = slimTableFactoryTest0.slimTableFactory;
        org.junit.Assert.assertNull(slimTableFactory1);
        org.junit.Assert.assertNull(slimTableFactory2);
        org.junit.Assert.assertNull(slimTableFactory3);
        org.junit.Assert.assertNull(strMap4);
        org.junit.Assert.assertNull(strMap5);
        org.junit.Assert.assertNull(strMap6);
        org.junit.Assert.assertNull(slimTableFactory7);
    }

    @Test
    public void test00375() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00375");
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
            slimTableFactoryTest0.addTableTypeImport("hi!", "");
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
    public void test00376() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00376");
        fitnesse.testsystems.slim.tables.SlimTableFactoryTest slimTableFactoryTest0 = new fitnesse.testsystems.slim.tables.SlimTableFactoryTest();
        fitnesse.testsystems.slim.Table table1 = null;
        slimTableFactoryTest0.table = table1;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory3 = slimTableFactoryTest0.slimTableFactory;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory4 = slimTableFactoryTest0.slimTableFactory;
        fitnesse.testsystems.slim.Table table5 = null;
        slimTableFactoryTest0.settable(table5);
        java.lang.Class<?> wildcardClass7 = slimTableFactoryTest0.getClass();
        org.junit.Assert.assertNull(slimTableFactory3);
        org.junit.Assert.assertNull(slimTableFactory4);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test00377() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00377");
        fitnesse.testsystems.slim.tables.SlimTableFactoryTest slimTableFactoryTest0 = new fitnesse.testsystems.slim.tables.SlimTableFactoryTest();
        fitnesse.testsystems.slim.Table table1 = null;
        slimTableFactoryTest0.table = table1;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory3 = slimTableFactoryTest0.slimTableFactory;
        java.util.Map<java.lang.String, java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable>> strMap4 = slimTableFactoryTest0.map;
        fitnesse.testsystems.slim.Table table5 = slimTableFactoryTest0.table;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory6 = null;
        slimTableFactoryTest0.setslimTableFactory(slimTableFactory6);
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory8 = slimTableFactoryTest0.slimTableFactory;
        // The following exception was thrown during execution in test generation
        try {
            slimTableFactoryTest0.checkTableTypeDefineUsedForTable();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(slimTableFactory3);
        org.junit.Assert.assertNull(strMap4);
        org.junit.Assert.assertNull(table5);
        org.junit.Assert.assertNull(slimTableFactory8);
    }

    @Test
    public void test00378() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00378");
        fitnesse.testsystems.slim.tables.SlimTableFactoryTest slimTableFactoryTest0 = new fitnesse.testsystems.slim.tables.SlimTableFactoryTest();
        fitnesse.testsystems.slim.Table table1 = null;
        slimTableFactoryTest0.table = table1;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory3 = slimTableFactoryTest0.slimTableFactory;
        java.util.Map<java.lang.String, java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable>> strMap4 = slimTableFactoryTest0.map;
        // The following exception was thrown during execution in test generation
        try {
            slimTableFactoryTest0.addTableTypeImport("hi!", "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(slimTableFactory3);
        org.junit.Assert.assertNull(strMap4);
    }

    @Test
    public void test00379() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00379");
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
        java.lang.Class<?> wildcardClass10 = slimTableFactoryTest0.getClass();
        org.junit.Assert.assertNull(strMap5);
        org.junit.Assert.assertNull(strMap6);
        org.junit.Assert.assertNull(slimTableFactory7);
        org.junit.Assert.assertNull(table8);
        org.junit.Assert.assertNull(slimTableFactory9);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test00380() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00380");
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
        org.junit.Assert.assertNull(table10);
    }

    @Test
    public void test00381() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00381");
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
            slimTableFactoryTest0.checkTableTypeDefineUsedForTable();
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
    public void test00382() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00382");
        fitnesse.testsystems.slim.tables.SlimTableFactoryTest slimTableFactoryTest0 = new fitnesse.testsystems.slim.tables.SlimTableFactoryTest();
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory1 = slimTableFactoryTest0.slimTableFactory;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory2 = slimTableFactoryTest0.slimTableFactory;
        fitnesse.testsystems.slim.Table table3 = slimTableFactoryTest0.gettable();
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory4 = slimTableFactoryTest0.getslimTableFactory();
        fitnesse.testsystems.slim.Table table5 = slimTableFactoryTest0.table;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory6 = null;
        slimTableFactoryTest0.setslimTableFactory(slimTableFactory6);
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
        org.junit.Assert.assertNull(table5);
    }

    @Test
    public void test00383() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00383");
        fitnesse.testsystems.slim.tables.SlimTableFactoryTest slimTableFactoryTest0 = new fitnesse.testsystems.slim.tables.SlimTableFactoryTest();
        fitnesse.testsystems.slim.Table table1 = null;
        slimTableFactoryTest0.table = table1;
        fitnesse.testsystems.slim.Table table3 = null;
        slimTableFactoryTest0.settable(table3);
        fitnesse.testsystems.slim.Table table5 = slimTableFactoryTest0.table;
        // The following exception was thrown during execution in test generation
        try {
            slimTableFactoryTest0.checkTableTypeDefinesIgnoredIfDifferentSpecified();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(table5);
    }

    @Test
    public void test00384() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00384");
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
    }

    @Test
    public void test00385() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00385");
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
        // The following exception was thrown during execution in test generation
        try {
            slimTableFactoryTest0.tableTypeStartingWithcommentColonShouldReturnNull();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(slimTableFactory3);
        org.junit.Assert.assertNull(strMap4);
        org.junit.Assert.assertNull(table13);
        org.junit.Assert.assertNull(slimTableFactory14);
    }

    @Test
    public void test00386() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00386");
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
        fitnesse.testsystems.slim.Table table12 = slimTableFactoryTest0.gettable();
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
        org.junit.Assert.assertNull(table12);
    }

    @Test
    public void test00387() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00387");
        fitnesse.testsystems.slim.tables.SlimTableFactoryTest slimTableFactoryTest0 = new fitnesse.testsystems.slim.tables.SlimTableFactoryTest();
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory1 = slimTableFactoryTest0.slimTableFactory;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory2 = slimTableFactoryTest0.slimTableFactory;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory3 = slimTableFactoryTest0.slimTableFactory;
        java.util.Map<java.lang.String, java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable>> strMap4 = slimTableFactoryTest0.map;
        fitnesse.testsystems.slim.Table table5 = null;
        slimTableFactoryTest0.settable(table5);
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory7 = slimTableFactoryTest0.getslimTableFactory();
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory8 = slimTableFactoryTest0.getslimTableFactory();
        // The following exception was thrown during execution in test generation
        try {
            slimTableFactoryTest0.checkTableTypeDefineUsedForTable();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(slimTableFactory1);
        org.junit.Assert.assertNull(slimTableFactory2);
        org.junit.Assert.assertNull(slimTableFactory3);
        org.junit.Assert.assertNull(strMap4);
        org.junit.Assert.assertNull(slimTableFactory7);
        org.junit.Assert.assertNull(slimTableFactory8);
    }

    @Test
    public void test00388() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00388");
        fitnesse.testsystems.slim.tables.SlimTableFactoryTest slimTableFactoryTest0 = new fitnesse.testsystems.slim.tables.SlimTableFactoryTest();
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory1 = slimTableFactoryTest0.slimTableFactory;
        fitnesse.testsystems.slim.Table table2 = slimTableFactoryTest0.gettable();
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory3 = null;
        slimTableFactoryTest0.slimTableFactory = slimTableFactory3;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory5 = null;
        slimTableFactoryTest0.slimTableFactory = slimTableFactory5;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory7 = null;
        slimTableFactoryTest0.setslimTableFactory(slimTableFactory7);
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
    public void test00389() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00389");
        fitnesse.testsystems.slim.tables.SlimTableFactoryTest slimTableFactoryTest0 = new fitnesse.testsystems.slim.tables.SlimTableFactoryTest();
        fitnesse.testsystems.slim.Table table1 = null;
        slimTableFactoryTest0.table = table1;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory3 = slimTableFactoryTest0.slimTableFactory;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory4 = slimTableFactoryTest0.slimTableFactory;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory5 = slimTableFactoryTest0.slimTableFactory;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory6 = null;
        slimTableFactoryTest0.slimTableFactory = slimTableFactory6;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory8 = null;
        slimTableFactoryTest0.slimTableFactory = slimTableFactory8;
        fitnesse.testsystems.slim.Table table10 = null;
        slimTableFactoryTest0.table = table10;
        // The following exception was thrown during execution in test generation
        try {
            slimTableFactoryTest0.addTableTypeImport("hi!", "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(slimTableFactory3);
        org.junit.Assert.assertNull(slimTableFactory4);
        org.junit.Assert.assertNull(slimTableFactory5);
    }

    @Test
    public void test00390() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00390");
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
            slimTableFactoryTest0.checkTableTypeDefinesIgnoredIfDifferentSpecified();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test00391() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00391");
        fitnesse.testsystems.slim.tables.SlimTableFactoryTest slimTableFactoryTest0 = new fitnesse.testsystems.slim.tables.SlimTableFactoryTest();
        fitnesse.testsystems.slim.Table table1 = null;
        slimTableFactoryTest0.table = table1;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory3 = slimTableFactoryTest0.slimTableFactory;
        java.util.Map<java.lang.String, java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable>> strMap4 = slimTableFactoryTest0.getmap();
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory5 = slimTableFactoryTest0.slimTableFactory;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory6 = slimTableFactoryTest0.getslimTableFactory();
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
    public void test00392() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00392");
        fitnesse.testsystems.slim.tables.SlimTableFactoryTest slimTableFactoryTest0 = new fitnesse.testsystems.slim.tables.SlimTableFactoryTest();
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory1 = slimTableFactoryTest0.slimTableFactory;
        fitnesse.testsystems.slim.Table table2 = slimTableFactoryTest0.gettable();
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory3 = null;
        slimTableFactoryTest0.slimTableFactory = slimTableFactory3;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory5 = null;
        slimTableFactoryTest0.setslimTableFactory(slimTableFactory5);
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory7 = null;
        slimTableFactoryTest0.slimTableFactory = slimTableFactory7;
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
    public void test00393() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00393");
        fitnesse.testsystems.slim.tables.SlimTableFactoryTest slimTableFactoryTest0 = new fitnesse.testsystems.slim.tables.SlimTableFactoryTest();
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory1 = slimTableFactoryTest0.slimTableFactory;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory2 = slimTableFactoryTest0.slimTableFactory;
        fitnesse.testsystems.slim.Table table3 = slimTableFactoryTest0.gettable();
        fitnesse.testsystems.slim.Table table4 = slimTableFactoryTest0.gettable();
        fitnesse.testsystems.slim.Table table5 = slimTableFactoryTest0.gettable();
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory6 = slimTableFactoryTest0.slimTableFactory;
        fitnesse.testsystems.slim.Table table7 = null;
        slimTableFactoryTest0.settable(table7);
        java.lang.Class<?> wildcardClass9 = slimTableFactoryTest0.getClass();
        org.junit.Assert.assertNull(slimTableFactory1);
        org.junit.Assert.assertNull(slimTableFactory2);
        org.junit.Assert.assertNull(table3);
        org.junit.Assert.assertNull(table4);
        org.junit.Assert.assertNull(table5);
        org.junit.Assert.assertNull(slimTableFactory6);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test00394() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00394");
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
    public void test00395() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00395");
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
        org.junit.Assert.assertNull(table10);
        org.junit.Assert.assertNull(strMap13);
    }

    @Test
    public void test00396() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00396");
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
            slimTableFactoryTest0.checkTableTypeDefinesIgnoredIfDifferentSpecified();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(slimTableFactory7);
        org.junit.Assert.assertNull(strMap8);
    }

    @Test
    public void test00397() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00397");
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
        java.lang.Class<?> wildcardClass14 = slimTableFactoryTest0.getClass();
        org.junit.Assert.assertNull(slimTableFactory3);
        org.junit.Assert.assertNull(strMap4);
        org.junit.Assert.assertNull(strMap9);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test00398() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00398");
        fitnesse.testsystems.slim.tables.SlimTableFactoryTest slimTableFactoryTest0 = new fitnesse.testsystems.slim.tables.SlimTableFactoryTest();
        fitnesse.testsystems.slim.Table table1 = null;
        slimTableFactoryTest0.table = table1;
        fitnesse.testsystems.slim.Table table3 = null;
        slimTableFactoryTest0.settable(table3);
        java.util.Map<java.lang.String, java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable>> strMap5 = slimTableFactoryTest0.map;
        java.util.Map<java.lang.String, java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable>> strMap6 = slimTableFactoryTest0.getmap();
        // The following exception was thrown during execution in test generation
        try {
            slimTableFactoryTest0.addTableTypeImport("", "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(strMap5);
        org.junit.Assert.assertNull(strMap6);
    }

    @Test
    public void test00399() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00399");
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
        org.junit.Assert.assertNull(table12);
    }

    @Test
    public void test00400() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00400");
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
        java.lang.Class<?> wildcardClass12 = slimTableFactoryTest0.getClass();
        org.junit.Assert.assertNull(slimTableFactory1);
        org.junit.Assert.assertNull(table2);
        org.junit.Assert.assertNull(strMap3);
        org.junit.Assert.assertNull(strMap8);
        org.junit.Assert.assertNull(table9);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test00401() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00401");
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
            slimTableFactoryTest0.checkTableTypeDefineUsedForTable();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(slimTableFactory1);
        org.junit.Assert.assertNull(table2);
        org.junit.Assert.assertNull(strMap3);
    }

    @Test
    public void test00402() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00402");
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
        java.lang.Class<?> wildcardClass12 = slimTableFactoryTest0.getClass();
        org.junit.Assert.assertNull(slimTableFactory7);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test00403() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00403");
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
            slimTableFactoryTest0.addTableTypeImport("", "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(slimTableFactory5);
        org.junit.Assert.assertNull(strMap10);
        org.junit.Assert.assertNull(strMap11);
    }

    @Test
    public void test00404() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00404");
        fitnesse.testsystems.slim.tables.SlimTableFactoryTest slimTableFactoryTest0 = new fitnesse.testsystems.slim.tables.SlimTableFactoryTest();
        fitnesse.testsystems.slim.Table table1 = slimTableFactoryTest0.table;
        java.util.Map<java.lang.String, java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable>> strMap2 = slimTableFactoryTest0.getmap();
        java.util.Map<java.lang.String, java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable>> strMap3 = slimTableFactoryTest0.getmap();
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory4 = slimTableFactoryTest0.slimTableFactory;
        fitnesse.testsystems.slim.Table table5 = null;
        slimTableFactoryTest0.settable(table5);
        fitnesse.testsystems.slim.Table table7 = slimTableFactoryTest0.table;
        java.lang.Class<?> wildcardClass8 = slimTableFactoryTest0.getClass();
        org.junit.Assert.assertNull(table1);
        org.junit.Assert.assertNull(strMap2);
        org.junit.Assert.assertNull(strMap3);
        org.junit.Assert.assertNull(slimTableFactory4);
        org.junit.Assert.assertNull(table7);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test00405() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00405");
        fitnesse.testsystems.slim.tables.SlimTableFactoryTest slimTableFactoryTest0 = new fitnesse.testsystems.slim.tables.SlimTableFactoryTest();
        fitnesse.testsystems.slim.Table table1 = slimTableFactoryTest0.table;
        java.util.Map<java.lang.String, java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable>> strMap2 = slimTableFactoryTest0.getmap();
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory3 = null;
        slimTableFactoryTest0.slimTableFactory = slimTableFactory3;
        fitnesse.testsystems.slim.Table table5 = slimTableFactoryTest0.table;
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
    }

    @Test
    public void test00406() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00406");
        fitnesse.testsystems.slim.tables.SlimTableFactoryTest slimTableFactoryTest0 = new fitnesse.testsystems.slim.tables.SlimTableFactoryTest();
        fitnesse.testsystems.slim.Table table1 = slimTableFactoryTest0.table;
        java.util.Map<java.lang.String, java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable>> strMap2 = slimTableFactoryTest0.getmap();
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory3 = slimTableFactoryTest0.slimTableFactory;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory4 = slimTableFactoryTest0.getslimTableFactory();
        fitnesse.testsystems.slim.Table table5 = null;
        slimTableFactoryTest0.table = table5;
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
    }

    @Test
    public void test00407() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00407");
        fitnesse.testsystems.slim.tables.SlimTableFactoryTest slimTableFactoryTest0 = new fitnesse.testsystems.slim.tables.SlimTableFactoryTest();
        fitnesse.testsystems.slim.Table table1 = slimTableFactoryTest0.table;
        java.util.Map<java.lang.String, java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable>> strMap2 = slimTableFactoryTest0.getmap();
        java.util.Map<java.lang.String, java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable>> strMap3 = slimTableFactoryTest0.getmap();
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory4 = slimTableFactoryTest0.slimTableFactory;
        fitnesse.testsystems.slim.Table table5 = null;
        slimTableFactoryTest0.settable(table5);
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
    }

    @Test
    public void test00408() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00408");
        fitnesse.testsystems.slim.tables.SlimTableFactoryTest slimTableFactoryTest0 = new fitnesse.testsystems.slim.tables.SlimTableFactoryTest();
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory1 = slimTableFactoryTest0.slimTableFactory;
        fitnesse.testsystems.slim.Table table2 = null;
        slimTableFactoryTest0.settable(table2);
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory4 = slimTableFactoryTest0.slimTableFactory;
        // The following exception was thrown during execution in test generation
        try {
            slimTableFactoryTest0.addTableTypeImport("hi!", "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(slimTableFactory1);
        org.junit.Assert.assertNull(slimTableFactory4);
    }

    @Test
    public void test00409() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00409");
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
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory12 = null;
        slimTableFactoryTest0.slimTableFactory = slimTableFactory12;
        fitnesse.testsystems.slim.Table table14 = slimTableFactoryTest0.gettable();
        fitnesse.testsystems.slim.Table table15 = slimTableFactoryTest0.gettable();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass16 = table15.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(slimTableFactory3);
        org.junit.Assert.assertNull(strMap4);
        org.junit.Assert.assertNull(table9);
        org.junit.Assert.assertNull(table14);
        org.junit.Assert.assertNull(table15);
    }

    @Test
    public void test00410() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00410");
        fitnesse.testsystems.slim.tables.SlimTableFactoryTest slimTableFactoryTest0 = new fitnesse.testsystems.slim.tables.SlimTableFactoryTest();
        fitnesse.testsystems.slim.Table table1 = null;
        slimTableFactoryTest0.table = table1;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory3 = slimTableFactoryTest0.slimTableFactory;
        fitnesse.testsystems.slim.Table table4 = null;
        slimTableFactoryTest0.table = table4;
        java.util.Map<java.lang.String, java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable>> strMap6 = slimTableFactoryTest0.map;
        java.util.Map<java.lang.String, java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable>> strMap7 = slimTableFactoryTest0.getmap();
        // The following exception was thrown during execution in test generation
        try {
            slimTableFactoryTest0.commentTableShouldReturnNull();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(slimTableFactory3);
        org.junit.Assert.assertNull(strMap6);
        org.junit.Assert.assertNull(strMap7);
    }

    @Test
    public void test00411() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00411");
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
        java.lang.Class<?> wildcardClass13 = slimTableFactoryTest0.getClass();
        org.junit.Assert.assertNull(strMap5);
        org.junit.Assert.assertNull(strMap6);
        org.junit.Assert.assertNull(slimTableFactory7);
        org.junit.Assert.assertNull(strMap8);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test00412() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00412");
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
        // The following exception was thrown during execution in test generation
        try {
            slimTableFactoryTest0.commentTableShouldReturnNull();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(slimTableFactory7);
    }

    @Test
    public void test00413() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00413");
        fitnesse.testsystems.slim.tables.SlimTableFactoryTest slimTableFactoryTest0 = new fitnesse.testsystems.slim.tables.SlimTableFactoryTest();
        fitnesse.testsystems.slim.Table table1 = null;
        slimTableFactoryTest0.table = table1;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory3 = slimTableFactoryTest0.slimTableFactory;
        java.util.Map<java.lang.String, java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable>> strMap4 = slimTableFactoryTest0.getmap();
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory5 = null;
        slimTableFactoryTest0.slimTableFactory = slimTableFactory5;
        java.lang.Class<?> wildcardClass7 = slimTableFactoryTest0.getClass();
        org.junit.Assert.assertNull(slimTableFactory3);
        org.junit.Assert.assertNull(strMap4);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test00414() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00414");
        fitnesse.testsystems.slim.tables.SlimTableFactoryTest slimTableFactoryTest0 = new fitnesse.testsystems.slim.tables.SlimTableFactoryTest();
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory1 = slimTableFactoryTest0.slimTableFactory;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory2 = slimTableFactoryTest0.slimTableFactory;
        fitnesse.testsystems.slim.Table table3 = slimTableFactoryTest0.gettable();
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory4 = null;
        slimTableFactoryTest0.slimTableFactory = slimTableFactory4;
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
    }

    @Test
    public void test00415() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00415");
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
    }

    @Test
    public void test00416() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00416");
        fitnesse.testsystems.slim.tables.SlimTableFactoryTest slimTableFactoryTest0 = new fitnesse.testsystems.slim.tables.SlimTableFactoryTest();
        fitnesse.testsystems.slim.Table table1 = null;
        slimTableFactoryTest0.table = table1;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory3 = slimTableFactoryTest0.slimTableFactory;
        java.util.Map<java.lang.String, java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable>> strMap4 = slimTableFactoryTest0.getmap();
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory5 = slimTableFactoryTest0.slimTableFactory;
        java.util.Map<java.lang.String, java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable>> strMap6 = slimTableFactoryTest0.getmap();
        fitnesse.testsystems.slim.Table table7 = null;
        slimTableFactoryTest0.table = table7;
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
    }

    @Test
    public void test00417() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00417");
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
        java.util.Map<java.lang.String, java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable>> strMap17 = slimTableFactoryTest0.getmap();
        // The following exception was thrown during execution in test generation
        try {
            slimTableFactoryTest0.tableTypeStartingWithcommentColonShouldReturnNull();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(slimTableFactory3);
        org.junit.Assert.assertNull(strMap4);
        org.junit.Assert.assertNull(strMap17);
    }

    @Test
    public void test00418() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00418");
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
    }

    @Test
    public void test00419() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00419");
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
    public void test00420() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00420");
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
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory10 = null;
        slimTableFactoryTest0.setslimTableFactory(slimTableFactory10);
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory12 = slimTableFactoryTest0.getslimTableFactory();
        // The following exception was thrown during execution in test generation
        try {
            slimTableFactoryTest0.checkTableTypeDefinesIgnoredIfDifferentSpecified();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(strMap5);
        org.junit.Assert.assertNull(slimTableFactory12);
    }

    @Test
    public void test00421() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00421");
        fitnesse.testsystems.slim.tables.SlimTableFactoryTest slimTableFactoryTest0 = new fitnesse.testsystems.slim.tables.SlimTableFactoryTest();
        fitnesse.testsystems.slim.Table table1 = null;
        slimTableFactoryTest0.table = table1;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory3 = slimTableFactoryTest0.slimTableFactory;
        java.util.Map<java.lang.String, java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable>> strMap4 = slimTableFactoryTest0.getmap();
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory5 = slimTableFactoryTest0.slimTableFactory;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory6 = null;
        slimTableFactoryTest0.setslimTableFactory(slimTableFactory6);
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
    }

    @Test
    public void test00422() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00422");
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
    }

    @Test
    public void test00423() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00423");
        fitnesse.testsystems.slim.tables.SlimTableFactoryTest slimTableFactoryTest0 = new fitnesse.testsystems.slim.tables.SlimTableFactoryTest();
        fitnesse.testsystems.slim.Table table1 = null;
        slimTableFactoryTest0.table = table1;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory3 = slimTableFactoryTest0.slimTableFactory;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory4 = slimTableFactoryTest0.slimTableFactory;
        java.util.Map<java.lang.String, java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable>> strMap5 = slimTableFactoryTest0.map;
        fitnesse.testsystems.slim.Table table6 = slimTableFactoryTest0.table;
        java.util.Map<java.lang.String, java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable>> strMap7 = slimTableFactoryTest0.getmap();
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
    }

    @Test
    public void test00424() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00424");
        fitnesse.testsystems.slim.tables.SlimTableFactoryTest slimTableFactoryTest0 = new fitnesse.testsystems.slim.tables.SlimTableFactoryTest();
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory1 = slimTableFactoryTest0.slimTableFactory;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory2 = slimTableFactoryTest0.slimTableFactory;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory3 = slimTableFactoryTest0.slimTableFactory;
        java.util.Map<java.lang.String, java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable>> strMap4 = slimTableFactoryTest0.map;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory5 = slimTableFactoryTest0.slimTableFactory;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory6 = slimTableFactoryTest0.slimTableFactory;
        fitnesse.testsystems.slim.Table table7 = slimTableFactoryTest0.table;
        fitnesse.testsystems.slim.Table table8 = null;
        slimTableFactoryTest0.table = table8;
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
        org.junit.Assert.assertNull(strMap4);
        org.junit.Assert.assertNull(slimTableFactory5);
        org.junit.Assert.assertNull(slimTableFactory6);
        org.junit.Assert.assertNull(table7);
    }

    @Test
    public void test00425() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00425");
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
            slimTableFactoryTest0.checkTableTypeDefineUsedForTable();
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
    public void test00426() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00426");
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
    }

    @Test
    public void test00427() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00427");
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
    }

    @Test
    public void test00428() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00428");
        fitnesse.testsystems.slim.tables.SlimTableFactoryTest slimTableFactoryTest0 = new fitnesse.testsystems.slim.tables.SlimTableFactoryTest();
        fitnesse.testsystems.slim.Table table1 = null;
        slimTableFactoryTest0.table = table1;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory3 = slimTableFactoryTest0.getslimTableFactory();
        fitnesse.testsystems.slim.Table table4 = slimTableFactoryTest0.gettable();
        java.util.Map<java.lang.String, java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable>> strMap5 = slimTableFactoryTest0.getmap();
        fitnesse.testsystems.slim.Table table6 = slimTableFactoryTest0.table;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory7 = slimTableFactoryTest0.slimTableFactory;
        // The following exception was thrown during execution in test generation
        try {
            slimTableFactoryTest0.addTableTypeImport("hi!", "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(slimTableFactory3);
        org.junit.Assert.assertNull(table4);
        org.junit.Assert.assertNull(strMap5);
        org.junit.Assert.assertNull(table6);
        org.junit.Assert.assertNull(slimTableFactory7);
    }

    @Test
    public void test00429() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00429");
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
        fitnesse.testsystems.slim.Table table12 = null;
        slimTableFactoryTest0.settable(table12);
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory14 = slimTableFactoryTest0.slimTableFactory;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass15 = slimTableFactory14.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(strMap5);
        org.junit.Assert.assertNull(slimTableFactory6);
        org.junit.Assert.assertNull(slimTableFactory7);
        org.junit.Assert.assertNull(table8);
        org.junit.Assert.assertNull(table11);
        org.junit.Assert.assertNull(slimTableFactory14);
    }

    @Test
    public void test00430() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00430");
        fitnesse.testsystems.slim.tables.SlimTableFactoryTest slimTableFactoryTest0 = new fitnesse.testsystems.slim.tables.SlimTableFactoryTest();
        fitnesse.testsystems.slim.Table table1 = null;
        slimTableFactoryTest0.table = table1;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory3 = slimTableFactoryTest0.slimTableFactory;
        java.util.Map<java.lang.String, java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable>> strMap4 = slimTableFactoryTest0.getmap();
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory5 = slimTableFactoryTest0.slimTableFactory;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory6 = slimTableFactoryTest0.getslimTableFactory();
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory7 = null;
        slimTableFactoryTest0.slimTableFactory = slimTableFactory7;
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
    public void test00431() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00431");
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
        // The following exception was thrown during execution in test generation
        try {
            slimTableFactoryTest0.addTableTypeImport("", "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(slimTableFactory7);
        org.junit.Assert.assertNull(strMap10);
    }

    @Test
    public void test00432() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00432");
        fitnesse.testsystems.slim.tables.SlimTableFactoryTest slimTableFactoryTest0 = new fitnesse.testsystems.slim.tables.SlimTableFactoryTest();
        fitnesse.testsystems.slim.Table table1 = null;
        slimTableFactoryTest0.table = table1;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory3 = slimTableFactoryTest0.getslimTableFactory();
        fitnesse.testsystems.slim.Table table4 = slimTableFactoryTest0.gettable();
        java.util.Map<java.lang.String, java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable>> strMap5 = slimTableFactoryTest0.getmap();
        fitnesse.testsystems.slim.Table table6 = slimTableFactoryTest0.table;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass7 = table6.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(slimTableFactory3);
        org.junit.Assert.assertNull(table4);
        org.junit.Assert.assertNull(strMap5);
        org.junit.Assert.assertNull(table6);
    }

    @Test
    public void test00433() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00433");
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
    }

    @Test
    public void test00434() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00434");
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
        fitnesse.testsystems.slim.Table table18 = slimTableFactoryTest0.gettable();
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
        org.junit.Assert.assertNull(table18);
    }

    @Test
    public void test00435() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00435");
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
        java.util.Map<java.lang.String, java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable>> strMap11 = slimTableFactoryTest0.map;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory12 = slimTableFactoryTest0.getslimTableFactory();
        fitnesse.testsystems.slim.Table table13 = null;
        slimTableFactoryTest0.settable(table13);
        fitnesse.testsystems.slim.Table table15 = null;
        slimTableFactoryTest0.settable(table15);
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
        org.junit.Assert.assertNull(table10);
        org.junit.Assert.assertNull(strMap11);
        org.junit.Assert.assertNull(slimTableFactory12);
    }

    @Test
    public void test00436() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00436");
        fitnesse.testsystems.slim.tables.SlimTableFactoryTest slimTableFactoryTest0 = new fitnesse.testsystems.slim.tables.SlimTableFactoryTest();
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory1 = slimTableFactoryTest0.slimTableFactory;
        fitnesse.testsystems.slim.Table table2 = slimTableFactoryTest0.table;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory3 = null;
        slimTableFactoryTest0.setslimTableFactory(slimTableFactory3);
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
    public void test00437() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00437");
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
    public void test00438() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00438");
        fitnesse.testsystems.slim.tables.SlimTableFactoryTest slimTableFactoryTest0 = new fitnesse.testsystems.slim.tables.SlimTableFactoryTest();
        fitnesse.testsystems.slim.Table table1 = null;
        slimTableFactoryTest0.table = table1;
        fitnesse.testsystems.slim.Table table3 = null;
        slimTableFactoryTest0.settable(table3);
        java.util.Map<java.lang.String, java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable>> strMap5 = slimTableFactoryTest0.map;
        java.util.Map<java.lang.String, java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable>> strMap6 = slimTableFactoryTest0.getmap();
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory7 = null;
        slimTableFactoryTest0.slimTableFactory = slimTableFactory7;
        // The following exception was thrown during execution in test generation
        try {
            slimTableFactoryTest0.checkTableTypeDefineUsedForTable();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(strMap5);
        org.junit.Assert.assertNull(strMap6);
    }

    @Test
    public void test00439() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00439");
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
        slimTableFactoryTest0.slimTableFactory = slimTableFactory11;
        java.lang.Class<?> wildcardClass13 = slimTableFactoryTest0.getClass();
        org.junit.Assert.assertNull(slimTableFactory3);
        org.junit.Assert.assertNull(strMap4);
        org.junit.Assert.assertNull(strMap9);
        org.junit.Assert.assertNull(slimTableFactory10);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test00440() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00440");
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
            slimTableFactoryTest0.tableTypeStartingWithcommentColonShouldReturnNull();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(slimTableFactory3);
        org.junit.Assert.assertNull(table6);
    }

    @Test
    public void test00441() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00441");
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
        fitnesse.testsystems.slim.Table table12 = null;
        slimTableFactoryTest0.settable(table12);
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
        org.junit.Assert.assertNull(table11);
    }

    @Test
    public void test00442() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00442");
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
        slimTableFactoryTest0.settable(table13);
        java.util.Map<java.lang.String, java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable>> strMap15 = slimTableFactoryTest0.getmap();
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
        org.junit.Assert.assertNull(strMap15);
    }

    @Test
    public void test00443() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00443");
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
        java.lang.Class<?> wildcardClass10 = slimTableFactoryTest0.getClass();
        org.junit.Assert.assertNull(slimTableFactory1);
        org.junit.Assert.assertNull(table2);
        org.junit.Assert.assertNull(slimTableFactory7);
        org.junit.Assert.assertNull(slimTableFactory8);
        org.junit.Assert.assertNull(table9);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test00444() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00444");
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
            slimTableFactoryTest0.checkTableTypeDefineUsedForTable();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(slimTableFactory3);
        org.junit.Assert.assertNull(slimTableFactory4);
        org.junit.Assert.assertNull(slimTableFactory7);
    }

    @Test
    public void test00445() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00445");
        fitnesse.testsystems.slim.tables.SlimTableFactoryTest slimTableFactoryTest0 = new fitnesse.testsystems.slim.tables.SlimTableFactoryTest();
        fitnesse.testsystems.slim.Table table1 = slimTableFactoryTest0.table;
        java.util.Map<java.lang.String, java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable>> strMap2 = slimTableFactoryTest0.getmap();
        java.util.Map<java.lang.String, java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable>> strMap3 = slimTableFactoryTest0.getmap();
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory4 = slimTableFactoryTest0.slimTableFactory;
        fitnesse.testsystems.slim.Table table5 = null;
        slimTableFactoryTest0.table = table5;
        fitnesse.testsystems.slim.Table table7 = null;
        slimTableFactoryTest0.table = table7;
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
    }

    @Test
    public void test00446() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00446");
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
        org.junit.Assert.assertNull(slimTableFactory7);
        org.junit.Assert.assertNull(slimTableFactory8);
        org.junit.Assert.assertNull(table11);
        org.junit.Assert.assertNull(slimTableFactory12);
    }

    @Test
    public void test00447() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00447");
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
        java.lang.Class<?> wildcardClass12 = slimTableFactoryTest0.getClass();
        org.junit.Assert.assertNull(slimTableFactory7);
        org.junit.Assert.assertNull(strMap10);
        org.junit.Assert.assertNull(table11);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test00448() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00448");
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
        fitnesse.testsystems.slim.Table table10 = slimTableFactoryTest0.gettable();
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
        org.junit.Assert.assertNull(strMap9);
        org.junit.Assert.assertNull(table10);
    }

    @Test
    public void test00449() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00449");
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
    }

    @Test
    public void test00450() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00450");
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
    public void test00451() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00451");
        fitnesse.testsystems.slim.tables.SlimTableFactoryTest slimTableFactoryTest0 = new fitnesse.testsystems.slim.tables.SlimTableFactoryTest();
        fitnesse.testsystems.slim.Table table1 = null;
        slimTableFactoryTest0.table = table1;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory3 = null;
        slimTableFactoryTest0.setslimTableFactory(slimTableFactory3);
        java.util.Map<java.lang.String, java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable>> strMap5 = slimTableFactoryTest0.map;
        fitnesse.testsystems.slim.Table table6 = null;
        slimTableFactoryTest0.table = table6;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory8 = slimTableFactoryTest0.getslimTableFactory();
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
        org.junit.Assert.assertNull(slimTableFactory8);
    }

    @Test
    public void test00452() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00452");
        fitnesse.testsystems.slim.tables.SlimTableFactoryTest slimTableFactoryTest0 = new fitnesse.testsystems.slim.tables.SlimTableFactoryTest();
        fitnesse.testsystems.slim.Table table1 = null;
        slimTableFactoryTest0.table = table1;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory3 = slimTableFactoryTest0.slimTableFactory;
        fitnesse.testsystems.slim.Table table4 = slimTableFactoryTest0.table;
        // The following exception was thrown during execution in test generation
        try {
            slimTableFactoryTest0.addTableTypeImport("hi!", "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(slimTableFactory3);
        org.junit.Assert.assertNull(table4);
    }

    @Test
    public void test00453() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00453");
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
        org.junit.Assert.assertNull(slimTableFactory12);
    }

    @Test
    public void test00454() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00454");
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
        java.util.Map<java.lang.String, java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable>> strMap14 = slimTableFactoryTest0.getmap();
        // The following exception was thrown during execution in test generation
        try {
            slimTableFactoryTest0.shouldCreateCorrectSlimTableForTablesType();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(table7);
        org.junit.Assert.assertNull(strMap12);
        org.junit.Assert.assertNull(slimTableFactory13);
        org.junit.Assert.assertNull(strMap14);
    }

    @Test
    public void test00455() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00455");
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
    }

    @Test
    public void test00456() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00456");
        fitnesse.testsystems.slim.tables.SlimTableFactoryTest slimTableFactoryTest0 = new fitnesse.testsystems.slim.tables.SlimTableFactoryTest();
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory1 = slimTableFactoryTest0.slimTableFactory;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory2 = slimTableFactoryTest0.slimTableFactory;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory3 = null;
        slimTableFactoryTest0.slimTableFactory = slimTableFactory3;
        fitnesse.testsystems.slim.Table table5 = null;
        slimTableFactoryTest0.table = table5;
        // The following exception was thrown during execution in test generation
        try {
            slimTableFactoryTest0.checkTableTypeDefinesIgnoredIfDifferentSpecified();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(slimTableFactory1);
        org.junit.Assert.assertNull(slimTableFactory2);
    }

    @Test
    public void test00457() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00457");
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
    }

    @Test
    public void test00458() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00458");
        fitnesse.testsystems.slim.tables.SlimTableFactoryTest slimTableFactoryTest0 = new fitnesse.testsystems.slim.tables.SlimTableFactoryTest();
        fitnesse.testsystems.slim.Table table1 = null;
        slimTableFactoryTest0.table = table1;
        fitnesse.testsystems.slim.Table table3 = slimTableFactoryTest0.table;
        fitnesse.testsystems.slim.Table table4 = slimTableFactoryTest0.gettable();
        java.util.Map<java.lang.String, java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable>> strMap5 = slimTableFactoryTest0.getmap();
        java.util.Map<java.lang.String, java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable>> strMap6 = slimTableFactoryTest0.map;
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
    }

    @Test
    public void test00459() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00459");
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
            java.lang.Class<?> wildcardClass11 = table10.getClass();
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
    public void test00460() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00460");
        fitnesse.testsystems.slim.tables.SlimTableFactoryTest slimTableFactoryTest0 = new fitnesse.testsystems.slim.tables.SlimTableFactoryTest();
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory1 = slimTableFactoryTest0.slimTableFactory;
        fitnesse.testsystems.slim.Table table2 = slimTableFactoryTest0.gettable();
        fitnesse.testsystems.slim.Table table3 = null;
        slimTableFactoryTest0.table = table3;
        fitnesse.testsystems.slim.Table table5 = null;
        slimTableFactoryTest0.table = table5;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory7 = slimTableFactoryTest0.slimTableFactory;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass8 = slimTableFactory7.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(slimTableFactory1);
        org.junit.Assert.assertNull(table2);
        org.junit.Assert.assertNull(slimTableFactory7);
    }

    @Test
    public void test00461() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00461");
        fitnesse.testsystems.slim.tables.SlimTableFactoryTest slimTableFactoryTest0 = new fitnesse.testsystems.slim.tables.SlimTableFactoryTest();
        fitnesse.testsystems.slim.Table table1 = null;
        slimTableFactoryTest0.table = table1;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory3 = slimTableFactoryTest0.slimTableFactory;
        java.util.Map<java.lang.String, java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable>> strMap4 = slimTableFactoryTest0.map;
        fitnesse.testsystems.slim.Table table5 = slimTableFactoryTest0.table;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory6 = null;
        slimTableFactoryTest0.setslimTableFactory(slimTableFactory6);
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory8 = slimTableFactoryTest0.slimTableFactory;
        // The following exception was thrown during execution in test generation
        try {
            slimTableFactoryTest0.commentTableShouldReturnNull();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(slimTableFactory3);
        org.junit.Assert.assertNull(strMap4);
        org.junit.Assert.assertNull(table5);
        org.junit.Assert.assertNull(slimTableFactory8);
    }

    @Test
    public void test00462() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00462");
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
            slimTableFactoryTest0.checkTableTypeDefineUsedForTable();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(slimTableFactory7);
        org.junit.Assert.assertNull(slimTableFactory8);
    }

    @Test
    public void test00463() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00463");
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
    public void test00464() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00464");
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
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory14 = slimTableFactoryTest0.slimTableFactory;
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
        org.junit.Assert.assertNull(slimTableFactory14);
    }

    @Test
    public void test00465() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00465");
        fitnesse.testsystems.slim.tables.SlimTableFactoryTest slimTableFactoryTest0 = new fitnesse.testsystems.slim.tables.SlimTableFactoryTest();
        fitnesse.testsystems.slim.Table table1 = null;
        slimTableFactoryTest0.table = table1;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory3 = null;
        slimTableFactoryTest0.setslimTableFactory(slimTableFactory3);
        java.util.Map<java.lang.String, java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable>> strMap5 = slimTableFactoryTest0.map;
        fitnesse.testsystems.slim.Table table6 = null;
        slimTableFactoryTest0.table = table6;
        fitnesse.testsystems.slim.Table table8 = slimTableFactoryTest0.table;
        // The following exception was thrown during execution in test generation
        try {
            slimTableFactoryTest0.commentTableShouldReturnNull();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(strMap5);
        org.junit.Assert.assertNull(table8);
    }

    @Test
    public void test00466() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00466");
        fitnesse.testsystems.slim.tables.SlimTableFactoryTest slimTableFactoryTest0 = new fitnesse.testsystems.slim.tables.SlimTableFactoryTest();
        fitnesse.testsystems.slim.Table table1 = null;
        slimTableFactoryTest0.table = table1;
        fitnesse.testsystems.slim.Table table3 = slimTableFactoryTest0.table;
        fitnesse.testsystems.slim.Table table4 = slimTableFactoryTest0.gettable();
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory5 = slimTableFactoryTest0.slimTableFactory;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory6 = slimTableFactoryTest0.getslimTableFactory();
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory7 = slimTableFactoryTest0.slimTableFactory;
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
        org.junit.Assert.assertNull(slimTableFactory6);
        org.junit.Assert.assertNull(slimTableFactory7);
    }

    @Test
    public void test00467() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00467");
        fitnesse.testsystems.slim.tables.SlimTableFactoryTest slimTableFactoryTest0 = new fitnesse.testsystems.slim.tables.SlimTableFactoryTest();
        fitnesse.testsystems.slim.Table table1 = null;
        slimTableFactoryTest0.table = table1;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory3 = slimTableFactoryTest0.slimTableFactory;
        java.util.Map<java.lang.String, java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable>> strMap4 = slimTableFactoryTest0.map;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory5 = slimTableFactoryTest0.getslimTableFactory();
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory6 = slimTableFactoryTest0.getslimTableFactory();
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
    }

    @Test
    public void test00468() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00468");
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
        // The following exception was thrown during execution in test generation
        try {
            slimTableFactoryTest0.checkTableTypeDefineUsedForTable();
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
    public void test00469() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00469");
        fitnesse.testsystems.slim.tables.SlimTableFactoryTest slimTableFactoryTest0 = new fitnesse.testsystems.slim.tables.SlimTableFactoryTest();
        fitnesse.testsystems.slim.Table table1 = null;
        slimTableFactoryTest0.table = table1;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory3 = slimTableFactoryTest0.slimTableFactory;
        java.util.Map<java.lang.String, java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable>> strMap4 = slimTableFactoryTest0.getmap();
        fitnesse.testsystems.slim.Table table5 = null;
        slimTableFactoryTest0.settable(table5);
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory7 = null;
        slimTableFactoryTest0.slimTableFactory = slimTableFactory7;
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
    public void test00470() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00470");
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
        org.junit.Assert.assertNull(table8);
        org.junit.Assert.assertNull(table9);
    }

    @Test
    public void test00471() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00471");
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
        org.junit.Assert.assertNull(table11);
    }

    @Test
    public void test00472() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00472");
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
        java.lang.Class<?> wildcardClass13 = slimTableFactoryTest0.getClass();
        org.junit.Assert.assertNull(slimTableFactory3);
        org.junit.Assert.assertNull(strMap4);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test00473() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00473");
        fitnesse.testsystems.slim.tables.SlimTableFactoryTest slimTableFactoryTest0 = new fitnesse.testsystems.slim.tables.SlimTableFactoryTest();
        fitnesse.testsystems.slim.Table table1 = null;
        slimTableFactoryTest0.table = table1;
        fitnesse.testsystems.slim.Table table3 = null;
        slimTableFactoryTest0.settable(table3);
        java.util.Map<java.lang.String, java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable>> strMap5 = slimTableFactoryTest0.map;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory6 = slimTableFactoryTest0.getslimTableFactory();
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory7 = slimTableFactoryTest0.getslimTableFactory();
        java.util.Map<java.lang.String, java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable>> strMap8 = slimTableFactoryTest0.getmap();
        java.lang.Class<?> wildcardClass9 = slimTableFactoryTest0.getClass();
        org.junit.Assert.assertNull(strMap5);
        org.junit.Assert.assertNull(slimTableFactory6);
        org.junit.Assert.assertNull(slimTableFactory7);
        org.junit.Assert.assertNull(strMap8);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test00474() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00474");
        fitnesse.testsystems.slim.tables.SlimTableFactoryTest slimTableFactoryTest0 = new fitnesse.testsystems.slim.tables.SlimTableFactoryTest();
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory1 = slimTableFactoryTest0.slimTableFactory;
        fitnesse.testsystems.slim.Table table2 = slimTableFactoryTest0.table;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory3 = null;
        slimTableFactoryTest0.setslimTableFactory(slimTableFactory3);
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory5 = null;
        slimTableFactoryTest0.slimTableFactory = slimTableFactory5;
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
    public void test00475() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00475");
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
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory12 = null;
        slimTableFactoryTest0.slimTableFactory = slimTableFactory12;
        // The following exception was thrown during execution in test generation
        try {
            slimTableFactoryTest0.addTableTypeImport("", "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(slimTableFactory3);
        org.junit.Assert.assertNull(strMap4);
        org.junit.Assert.assertNull(table9);
    }

    @Test
    public void test00476() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00476");
        fitnesse.testsystems.slim.tables.SlimTableFactoryTest slimTableFactoryTest0 = new fitnesse.testsystems.slim.tables.SlimTableFactoryTest();
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory1 = slimTableFactoryTest0.slimTableFactory;
        fitnesse.testsystems.slim.Table table2 = slimTableFactoryTest0.gettable();
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory3 = null;
        slimTableFactoryTest0.slimTableFactory = slimTableFactory3;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory5 = null;
        slimTableFactoryTest0.slimTableFactory = slimTableFactory5;
        fitnesse.testsystems.slim.Table table7 = slimTableFactoryTest0.gettable();
        // The following exception was thrown during execution in test generation
        try {
            slimTableFactoryTest0.checkTableTypeDefinesIgnoredIfDifferentSpecified();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(slimTableFactory1);
        org.junit.Assert.assertNull(table2);
        org.junit.Assert.assertNull(table7);
    }

    @Test
    public void test00477() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00477");
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
            slimTableFactoryTest0.tableTypeStartingWithcommentColonShouldReturnNull();
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
    public void test00478() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00478");
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
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory10 = null;
        slimTableFactoryTest0.setslimTableFactory(slimTableFactory10);
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
    public void test00479() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00479");
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
    }

    @Test
    public void test00480() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00480");
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
        // The following exception was thrown during execution in test generation
        try {
            slimTableFactoryTest0.checkTableTypeDefineUsedForTable();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(slimTableFactory3);
        org.junit.Assert.assertNull(strMap4);
        org.junit.Assert.assertNull(strMap11);
    }

    @Test
    public void test00481() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00481");
        fitnesse.testsystems.slim.tables.SlimTableFactoryTest slimTableFactoryTest0 = new fitnesse.testsystems.slim.tables.SlimTableFactoryTest();
        fitnesse.testsystems.slim.Table table1 = null;
        slimTableFactoryTest0.table = table1;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory3 = slimTableFactoryTest0.getslimTableFactory();
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory4 = slimTableFactoryTest0.slimTableFactory;
        fitnesse.testsystems.slim.Table table5 = null;
        slimTableFactoryTest0.settable(table5);
        java.lang.Class<?> wildcardClass7 = slimTableFactoryTest0.getClass();
        org.junit.Assert.assertNull(slimTableFactory3);
        org.junit.Assert.assertNull(slimTableFactory4);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test00482() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00482");
        fitnesse.testsystems.slim.tables.SlimTableFactoryTest slimTableFactoryTest0 = new fitnesse.testsystems.slim.tables.SlimTableFactoryTest();
        fitnesse.testsystems.slim.Table table1 = slimTableFactoryTest0.table;
        java.util.Map<java.lang.String, java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable>> strMap2 = slimTableFactoryTest0.getmap();
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory3 = slimTableFactoryTest0.slimTableFactory;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory4 = slimTableFactoryTest0.getslimTableFactory();
        java.util.Map<java.lang.String, java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable>> strMap5 = slimTableFactoryTest0.getmap();
        fitnesse.testsystems.slim.Table table6 = null;
        slimTableFactoryTest0.table = table6;
        fitnesse.testsystems.slim.Table table8 = slimTableFactoryTest0.gettable();
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
    }

    @Test
    public void test00483() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00483");
        fitnesse.testsystems.slim.tables.SlimTableFactoryTest slimTableFactoryTest0 = new fitnesse.testsystems.slim.tables.SlimTableFactoryTest();
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory1 = slimTableFactoryTest0.slimTableFactory;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory2 = slimTableFactoryTest0.slimTableFactory;
        fitnesse.testsystems.slim.Table table3 = slimTableFactoryTest0.gettable();
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory4 = slimTableFactoryTest0.getslimTableFactory();
        fitnesse.testsystems.slim.Table table5 = null;
        slimTableFactoryTest0.table = table5;
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
        org.junit.Assert.assertNull(slimTableFactory4);
    }

    @Test
    public void test00484() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00484");
        fitnesse.testsystems.slim.tables.SlimTableFactoryTest slimTableFactoryTest0 = new fitnesse.testsystems.slim.tables.SlimTableFactoryTest();
        fitnesse.testsystems.slim.Table table1 = null;
        slimTableFactoryTest0.table = table1;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory3 = slimTableFactoryTest0.slimTableFactory;
        java.util.Map<java.lang.String, java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable>> strMap4 = slimTableFactoryTest0.getmap();
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory5 = slimTableFactoryTest0.slimTableFactory;
        java.util.Map<java.lang.String, java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable>> strMap6 = slimTableFactoryTest0.getmap();
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
    }

    @Test
    public void test00485() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00485");
        fitnesse.testsystems.slim.tables.SlimTableFactoryTest slimTableFactoryTest0 = new fitnesse.testsystems.slim.tables.SlimTableFactoryTest();
        fitnesse.testsystems.slim.Table table1 = null;
        slimTableFactoryTest0.table = table1;
        fitnesse.testsystems.slim.Table table3 = null;
        slimTableFactoryTest0.settable(table3);
        fitnesse.testsystems.slim.Table table5 = null;
        slimTableFactoryTest0.table = table5;
        // The following exception was thrown during execution in test generation
        try {
            slimTableFactoryTest0.addTableTypeImport("", "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test00486() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00486");
        fitnesse.testsystems.slim.tables.SlimTableFactoryTest slimTableFactoryTest0 = new fitnesse.testsystems.slim.tables.SlimTableFactoryTest();
        fitnesse.testsystems.slim.Table table1 = null;
        slimTableFactoryTest0.table = table1;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory3 = null;
        slimTableFactoryTest0.slimTableFactory = slimTableFactory3;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory5 = slimTableFactoryTest0.getslimTableFactory();
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory6 = slimTableFactoryTest0.slimTableFactory;
        // The following exception was thrown during execution in test generation
        try {
            slimTableFactoryTest0.tableTypeStartingWithcommentColonShouldReturnNull();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(slimTableFactory5);
        org.junit.Assert.assertNull(slimTableFactory6);
    }

    @Test
    public void test00487() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00487");
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
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory15 = slimTableFactoryTest0.slimTableFactory;
        // The following exception was thrown during execution in test generation
        try {
            slimTableFactoryTest0.shouldCreateCorrectSlimTableForTablesType();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(slimTableFactory3);
        org.junit.Assert.assertNull(strMap4);
        org.junit.Assert.assertNull(slimTableFactory15);
    }

    @Test
    public void test00488() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00488");
        fitnesse.testsystems.slim.tables.SlimTableFactoryTest slimTableFactoryTest0 = new fitnesse.testsystems.slim.tables.SlimTableFactoryTest();
        fitnesse.testsystems.slim.Table table1 = null;
        slimTableFactoryTest0.table = table1;
        fitnesse.testsystems.slim.Table table3 = null;
        slimTableFactoryTest0.settable(table3);
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory5 = slimTableFactoryTest0.slimTableFactory;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory6 = slimTableFactoryTest0.getslimTableFactory();
        // The following exception was thrown during execution in test generation
        try {
            slimTableFactoryTest0.tableTypeStartingWithcommentColonShouldReturnNull();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(slimTableFactory5);
        org.junit.Assert.assertNull(slimTableFactory6);
    }

    @Test
    public void test00489() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00489");
        fitnesse.testsystems.slim.tables.SlimTableFactoryTest slimTableFactoryTest0 = new fitnesse.testsystems.slim.tables.SlimTableFactoryTest();
        fitnesse.testsystems.slim.Table table1 = null;
        slimTableFactoryTest0.table = table1;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory3 = slimTableFactoryTest0.getslimTableFactory();
        // The following exception was thrown during execution in test generation
        try {
            slimTableFactoryTest0.tableTypeStartingWithcommentColonShouldReturnNull();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(slimTableFactory3);
    }

    @Test
    public void test00490() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00490");
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
        fitnesse.testsystems.slim.Table table12 = null;
        slimTableFactoryTest0.settable(table12);
        fitnesse.testsystems.slim.Table table14 = null;
        slimTableFactoryTest0.settable(table14);
        java.util.Map<java.lang.String, java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable>> strMap16 = slimTableFactoryTest0.getmap();
        java.util.Map<java.lang.String, java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable>> strMap17 = slimTableFactoryTest0.getmap();
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
        org.junit.Assert.assertNull(strMap16);
        org.junit.Assert.assertNull(strMap17);
    }

    @Test
    public void test00491() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00491");
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
            slimTableFactoryTest0.checkTableTypeDefinesIgnoredIfDifferentSpecified();
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
    public void test00492() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00492");
        fitnesse.testsystems.slim.tables.SlimTableFactoryTest slimTableFactoryTest0 = new fitnesse.testsystems.slim.tables.SlimTableFactoryTest();
        fitnesse.testsystems.slim.Table table1 = null;
        slimTableFactoryTest0.table = table1;
        fitnesse.testsystems.slim.Table table3 = null;
        slimTableFactoryTest0.settable(table3);
        java.util.Map<java.lang.String, java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable>> strMap5 = slimTableFactoryTest0.map;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory6 = slimTableFactoryTest0.getslimTableFactory();
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory7 = slimTableFactoryTest0.getslimTableFactory();
        fitnesse.testsystems.slim.Table table8 = slimTableFactoryTest0.gettable();
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
    public void test00493() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00493");
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
        org.junit.Assert.assertNull(table10);
        org.junit.Assert.assertNull(strMap13);
    }

    @Test
    public void test00494() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00494");
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
        slimTableFactoryTest0.setslimTableFactory(slimTableFactory15);
        // The following exception was thrown during execution in test generation
        try {
            slimTableFactoryTest0.checkTableTypeDefinesIgnoredIfDifferentSpecified();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(slimTableFactory3);
        org.junit.Assert.assertNull(strMap4);
    }

    @Test
    public void test00495() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00495");
        fitnesse.testsystems.slim.tables.SlimTableFactoryTest slimTableFactoryTest0 = new fitnesse.testsystems.slim.tables.SlimTableFactoryTest();
        java.lang.Class<?> wildcardClass1 = slimTableFactoryTest0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void test00496() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00496");
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
        fitnesse.testsystems.slim.Table table14 = slimTableFactoryTest0.table;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory15 = null;
        slimTableFactoryTest0.slimTableFactory = slimTableFactory15;
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
        org.junit.Assert.assertNull(table14);
    }

    @Test
    public void test00497() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00497");
        fitnesse.testsystems.slim.tables.SlimTableFactoryTest slimTableFactoryTest0 = new fitnesse.testsystems.slim.tables.SlimTableFactoryTest();
        fitnesse.testsystems.slim.Table table1 = null;
        slimTableFactoryTest0.table = table1;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory3 = slimTableFactoryTest0.getslimTableFactory();
        fitnesse.testsystems.slim.Table table4 = slimTableFactoryTest0.gettable();
        java.util.Map<java.lang.String, java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable>> strMap5 = slimTableFactoryTest0.getmap();
        fitnesse.testsystems.slim.Table table6 = slimTableFactoryTest0.table;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory7 = slimTableFactoryTest0.slimTableFactory;
        fitnesse.testsystems.slim.Table table8 = slimTableFactoryTest0.table;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory9 = null;
        slimTableFactoryTest0.slimTableFactory = slimTableFactory9;
        // The following exception was thrown during execution in test generation
        try {
            slimTableFactoryTest0.commentTableShouldReturnNull();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(slimTableFactory3);
        org.junit.Assert.assertNull(table4);
        org.junit.Assert.assertNull(strMap5);
        org.junit.Assert.assertNull(table6);
        org.junit.Assert.assertNull(slimTableFactory7);
        org.junit.Assert.assertNull(table8);
    }

    @Test
    public void test00498() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00498");
        fitnesse.testsystems.slim.tables.SlimTableFactoryTest slimTableFactoryTest0 = new fitnesse.testsystems.slim.tables.SlimTableFactoryTest();
        fitnesse.testsystems.slim.Table table1 = null;
        slimTableFactoryTest0.table = table1;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory3 = slimTableFactoryTest0.slimTableFactory;
        java.util.Map<java.lang.String, java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable>> strMap4 = slimTableFactoryTest0.map;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory5 = null;
        slimTableFactoryTest0.setslimTableFactory(slimTableFactory5);
        java.util.Map<java.lang.String, java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable>> strMap7 = slimTableFactoryTest0.map;
        // The following exception was thrown during execution in test generation
        try {
            slimTableFactoryTest0.shouldCreateCorrectSlimTableForTablesType();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(slimTableFactory3);
        org.junit.Assert.assertNull(strMap4);
        org.junit.Assert.assertNull(strMap7);
    }

    @Test
    public void test00499() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00499");
        fitnesse.testsystems.slim.tables.SlimTableFactoryTest slimTableFactoryTest0 = new fitnesse.testsystems.slim.tables.SlimTableFactoryTest();
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory1 = slimTableFactoryTest0.slimTableFactory;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory2 = slimTableFactoryTest0.slimTableFactory;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory3 = null;
        slimTableFactoryTest0.slimTableFactory = slimTableFactory3;
        // The following exception was thrown during execution in test generation
        try {
            slimTableFactoryTest0.checkTableTypeDefineUsedForTable();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(slimTableFactory1);
        org.junit.Assert.assertNull(slimTableFactory2);
    }

    @Test
    public void test00500() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00500");
        fitnesse.testsystems.slim.tables.SlimTableFactoryTest slimTableFactoryTest0 = new fitnesse.testsystems.slim.tables.SlimTableFactoryTest();
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory1 = slimTableFactoryTest0.slimTableFactory;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory2 = slimTableFactoryTest0.slimTableFactory;
        fitnesse.testsystems.slim.Table table3 = slimTableFactoryTest0.gettable();
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory4 = slimTableFactoryTest0.getslimTableFactory();
        java.util.Map<java.lang.String, java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable>> strMap5 = slimTableFactoryTest0.map;
        fitnesse.testsystems.slim.Table table6 = null;
        slimTableFactoryTest0.settable(table6);
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory8 = slimTableFactoryTest0.slimTableFactory;
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
        org.junit.Assert.assertNull(slimTableFactory4);
        org.junit.Assert.assertNull(strMap5);
        org.junit.Assert.assertNull(slimTableFactory8);
    }
}

