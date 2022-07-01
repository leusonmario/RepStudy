import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest22 {

    public static boolean debug = false;

    @Test
    public void test11001() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11001");
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
    public void test11002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11002");
        fitnesse.testsystems.slim.tables.SlimTableFactoryTest slimTableFactoryTest0 = new fitnesse.testsystems.slim.tables.SlimTableFactoryTest();
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory1 = slimTableFactoryTest0.slimTableFactory;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory2 = slimTableFactoryTest0.slimTableFactory;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory3 = slimTableFactoryTest0.slimTableFactory;
        java.util.Map<java.lang.String, java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable>> strMap4 = slimTableFactoryTest0.map;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory5 = slimTableFactoryTest0.slimTableFactory;
        fitnesse.testsystems.slim.Table table6 = slimTableFactoryTest0.gettable();
        java.util.Map<java.lang.String, java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable>> strMap7 = slimTableFactoryTest0.getmap();
        java.lang.Class<?> wildcardClass8 = slimTableFactoryTest0.getClass();
        org.junit.Assert.assertNull(slimTableFactory1);
        org.junit.Assert.assertNull(slimTableFactory2);
        org.junit.Assert.assertNull(slimTableFactory3);
        org.junit.Assert.assertNull(strMap4);
        org.junit.Assert.assertNull(slimTableFactory5);
        org.junit.Assert.assertNull(table6);
        org.junit.Assert.assertNull(strMap7);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test11003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11003");
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
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory10 = slimTableFactoryTest0.getslimTableFactory();
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory11 = slimTableFactoryTest0.getslimTableFactory();
        fitnesse.testsystems.slim.Table table12 = slimTableFactoryTest0.gettable();
        // The following exception was thrown during execution in test generation
        try {
            slimTableFactoryTest0.addTableTypeImport("hi!", "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(slimTableFactory3);
        org.junit.Assert.assertNull(strMap4);
        org.junit.Assert.assertNull(strMap9);
        org.junit.Assert.assertNull(slimTableFactory10);
        org.junit.Assert.assertNull(slimTableFactory11);
        org.junit.Assert.assertNull(table12);
    }

    @Test
    public void test11004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11004");
        fitnesse.testsystems.slim.tables.SlimTableFactoryTest slimTableFactoryTest0 = new fitnesse.testsystems.slim.tables.SlimTableFactoryTest();
        fitnesse.testsystems.slim.Table table1 = slimTableFactoryTest0.table;
        fitnesse.testsystems.slim.Table table2 = null;
        slimTableFactoryTest0.table = table2;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory4 = null;
        slimTableFactoryTest0.slimTableFactory = slimTableFactory4;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory6 = slimTableFactoryTest0.slimTableFactory;
        java.util.Map<java.lang.String, java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable>> strMap7 = slimTableFactoryTest0.map;
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
        org.junit.Assert.assertNull(slimTableFactory6);
        org.junit.Assert.assertNull(strMap7);
    }

    @Test
    public void test11005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11005");
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
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory10 = slimTableFactoryTest0.getslimTableFactory();
        fitnesse.testsystems.slim.Table table11 = slimTableFactoryTest0.table;
        // The following exception was thrown during execution in test generation
        try {
            slimTableFactoryTest0.addTableTypeImport("hi!", "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(slimTableFactory5);
        org.junit.Assert.assertNull(table8);
        org.junit.Assert.assertNull(table9);
        org.junit.Assert.assertNull(slimTableFactory10);
        org.junit.Assert.assertNull(table11);
    }

    @Test
    public void test11006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11006");
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
        java.util.Map<java.lang.String, java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable>> strMap15 = slimTableFactoryTest0.getmap();
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory16 = slimTableFactoryTest0.getslimTableFactory();
        java.util.Map<java.lang.String, java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable>> strMap17 = slimTableFactoryTest0.map;
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
        org.junit.Assert.assertNull(strMap14);
        org.junit.Assert.assertNull(strMap15);
        org.junit.Assert.assertNull(slimTableFactory16);
        org.junit.Assert.assertNull(strMap17);
    }

    @Test
    public void test11007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11007");
        fitnesse.testsystems.slim.tables.SlimTableFactoryTest slimTableFactoryTest0 = new fitnesse.testsystems.slim.tables.SlimTableFactoryTest();
        fitnesse.testsystems.slim.Table table1 = slimTableFactoryTest0.table;
        java.util.Map<java.lang.String, java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable>> strMap2 = slimTableFactoryTest0.getmap();
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory3 = slimTableFactoryTest0.slimTableFactory;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory4 = slimTableFactoryTest0.getslimTableFactory();
        java.util.Map<java.lang.String, java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable>> strMap5 = slimTableFactoryTest0.getmap();
        fitnesse.testsystems.slim.Table table6 = null;
        slimTableFactoryTest0.settable(table6);
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory8 = slimTableFactoryTest0.getslimTableFactory();
        fitnesse.testsystems.slim.Table table9 = slimTableFactoryTest0.gettable();
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory10 = null;
        slimTableFactoryTest0.slimTableFactory = slimTableFactory10;
        java.lang.Class<?> wildcardClass12 = slimTableFactoryTest0.getClass();
        org.junit.Assert.assertNull(table1);
        org.junit.Assert.assertNull(strMap2);
        org.junit.Assert.assertNull(slimTableFactory3);
        org.junit.Assert.assertNull(slimTableFactory4);
        org.junit.Assert.assertNull(strMap5);
        org.junit.Assert.assertNull(slimTableFactory8);
        org.junit.Assert.assertNull(table9);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test11008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11008");
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
        fitnesse.testsystems.slim.Table table13 = slimTableFactoryTest0.gettable();
        fitnesse.testsystems.slim.Table table14 = slimTableFactoryTest0.gettable();
        fitnesse.testsystems.slim.Table table15 = slimTableFactoryTest0.gettable();
        fitnesse.testsystems.slim.Table table16 = null;
        slimTableFactoryTest0.table = table16;
        java.util.Map<java.lang.String, java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable>> strMap18 = slimTableFactoryTest0.map;
        org.junit.Assert.assertNull(table13);
        org.junit.Assert.assertNull(table14);
        org.junit.Assert.assertNull(table15);
        org.junit.Assert.assertNull(strMap18);
    }

    @Test
    public void test11009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11009");
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
        fitnesse.testsystems.slim.Table table14 = null;
        slimTableFactoryTest0.settable(table14);
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory16 = null;
        slimTableFactoryTest0.setslimTableFactory(slimTableFactory16);
        java.util.Map<java.lang.String, java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable>> strMap18 = slimTableFactoryTest0.getmap();
        fitnesse.testsystems.slim.Table table19 = slimTableFactoryTest0.table;
        // The following exception was thrown during execution in test generation
        try {
            slimTableFactoryTest0.addTableTypeImport("", "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(slimTableFactory3);
        org.junit.Assert.assertNull(strMap4);
        org.junit.Assert.assertNull(strMap11);
        org.junit.Assert.assertNull(strMap18);
        org.junit.Assert.assertNull(table19);
    }

    @Test
    public void test11010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11010");
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
        slimTableFactoryTest0.setslimTableFactory(slimTableFactory13);
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory15 = null;
        slimTableFactoryTest0.setslimTableFactory(slimTableFactory15);
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory17 = null;
        slimTableFactoryTest0.slimTableFactory = slimTableFactory17;
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
    public void test11011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11011");
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
        fitnesse.testsystems.slim.Table table10 = slimTableFactoryTest0.table;
        fitnesse.testsystems.slim.Table table11 = null;
        slimTableFactoryTest0.settable(table11);
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory13 = slimTableFactoryTest0.getslimTableFactory();
        fitnesse.testsystems.slim.Table table14 = slimTableFactoryTest0.table;
        java.util.Map<java.lang.String, java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable>> strMap15 = slimTableFactoryTest0.getmap();
        java.util.Map<java.lang.String, java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable>> strMap16 = slimTableFactoryTest0.getmap();
        org.junit.Assert.assertNull(slimTableFactory1);
        org.junit.Assert.assertNull(table2);
        org.junit.Assert.assertNull(strMap3);
        org.junit.Assert.assertNull(strMap8);
        org.junit.Assert.assertNull(table9);
        org.junit.Assert.assertNull(table10);
        org.junit.Assert.assertNull(slimTableFactory13);
        org.junit.Assert.assertNull(table14);
        org.junit.Assert.assertNull(strMap15);
        org.junit.Assert.assertNull(strMap16);
    }

    @Test
    public void test11012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11012");
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
        java.util.Map<java.lang.String, java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable>> strMap12 = slimTableFactoryTest0.getmap();
        // The following exception was thrown during execution in test generation
        try {
            slimTableFactoryTest0.commentTableShouldReturnNull();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(slimTableFactory7);
        org.junit.Assert.assertNull(slimTableFactory8);
        org.junit.Assert.assertNull(strMap9);
        org.junit.Assert.assertNull(strMap12);
    }

    @Test
    public void test11013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11013");
        fitnesse.testsystems.slim.tables.SlimTableFactoryTest slimTableFactoryTest0 = new fitnesse.testsystems.slim.tables.SlimTableFactoryTest();
        fitnesse.testsystems.slim.Table table1 = null;
        slimTableFactoryTest0.table = table1;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory3 = slimTableFactoryTest0.slimTableFactory;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory4 = null;
        slimTableFactoryTest0.slimTableFactory = slimTableFactory4;
        fitnesse.testsystems.slim.Table table6 = slimTableFactoryTest0.table;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory7 = null;
        slimTableFactoryTest0.setslimTableFactory(slimTableFactory7);
        java.util.Map<java.lang.String, java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable>> strMap9 = slimTableFactoryTest0.getmap();
        fitnesse.testsystems.slim.Table table10 = slimTableFactoryTest0.gettable();
        fitnesse.testsystems.slim.Table table11 = null;
        slimTableFactoryTest0.settable(table11);
        java.util.Map<java.lang.String, java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable>> strMap13 = slimTableFactoryTest0.getmap();
        org.junit.Assert.assertNull(slimTableFactory3);
        org.junit.Assert.assertNull(table6);
        org.junit.Assert.assertNull(strMap9);
        org.junit.Assert.assertNull(table10);
        org.junit.Assert.assertNull(strMap13);
    }

    @Test
    public void test11014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11014");
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
        fitnesse.testsystems.slim.Table table10 = slimTableFactoryTest0.gettable();
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
    }

    @Test
    public void test11015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11015");
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
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory14 = slimTableFactoryTest0.getslimTableFactory();
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory15 = slimTableFactoryTest0.getslimTableFactory();
        fitnesse.testsystems.slim.Table table16 = null;
        slimTableFactoryTest0.table = table16;
        java.lang.Class<?> wildcardClass18 = slimTableFactoryTest0.getClass();
        org.junit.Assert.assertNull(table7);
        org.junit.Assert.assertNull(strMap12);
        org.junit.Assert.assertNull(strMap13);
        org.junit.Assert.assertNull(slimTableFactory14);
        org.junit.Assert.assertNull(slimTableFactory15);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test11016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11016");
        fitnesse.testsystems.slim.tables.SlimTableFactoryTest slimTableFactoryTest0 = new fitnesse.testsystems.slim.tables.SlimTableFactoryTest();
        fitnesse.testsystems.slim.Table table1 = slimTableFactoryTest0.table;
        java.util.Map<java.lang.String, java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable>> strMap2 = slimTableFactoryTest0.getmap();
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory3 = slimTableFactoryTest0.slimTableFactory;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory4 = slimTableFactoryTest0.getslimTableFactory();
        java.util.Map<java.lang.String, java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable>> strMap5 = slimTableFactoryTest0.getmap();
        fitnesse.testsystems.slim.Table table6 = null;
        slimTableFactoryTest0.table = table6;
        fitnesse.testsystems.slim.Table table8 = slimTableFactoryTest0.gettable();
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory9 = null;
        slimTableFactoryTest0.slimTableFactory = slimTableFactory9;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory11 = null;
        slimTableFactoryTest0.setslimTableFactory(slimTableFactory11);
        fitnesse.testsystems.slim.Table table13 = null;
        slimTableFactoryTest0.table = table13;
        org.junit.Assert.assertNull(table1);
        org.junit.Assert.assertNull(strMap2);
        org.junit.Assert.assertNull(slimTableFactory3);
        org.junit.Assert.assertNull(slimTableFactory4);
        org.junit.Assert.assertNull(strMap5);
        org.junit.Assert.assertNull(table8);
    }

    @Test
    public void test11017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11017");
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
        java.util.Map<java.lang.String, java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable>> strMap12 = slimTableFactoryTest0.map;
        fitnesse.testsystems.slim.Table table13 = slimTableFactoryTest0.table;
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
        org.junit.Assert.assertNull(strMap12);
        org.junit.Assert.assertNull(table13);
    }

    @Test
    public void test11018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11018");
        fitnesse.testsystems.slim.tables.SlimTableFactoryTest slimTableFactoryTest0 = new fitnesse.testsystems.slim.tables.SlimTableFactoryTest();
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory1 = slimTableFactoryTest0.slimTableFactory;
        fitnesse.testsystems.slim.Table table2 = slimTableFactoryTest0.gettable();
        fitnesse.testsystems.slim.Table table3 = null;
        slimTableFactoryTest0.table = table3;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory5 = slimTableFactoryTest0.getslimTableFactory();
        fitnesse.testsystems.slim.Table table6 = slimTableFactoryTest0.gettable();
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory7 = null;
        slimTableFactoryTest0.setslimTableFactory(slimTableFactory7);
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
        org.junit.Assert.assertNull(table6);
    }

    @Test
    public void test11019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11019");
        fitnesse.testsystems.slim.tables.SlimTableFactoryTest slimTableFactoryTest0 = new fitnesse.testsystems.slim.tables.SlimTableFactoryTest();
        java.util.Map<java.lang.String, java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable>> strMap1 = slimTableFactoryTest0.getmap();
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory2 = slimTableFactoryTest0.slimTableFactory;
        fitnesse.testsystems.slim.Table table3 = slimTableFactoryTest0.table;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory4 = slimTableFactoryTest0.getslimTableFactory();
        fitnesse.testsystems.slim.Table table5 = null;
        slimTableFactoryTest0.settable(table5);
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory7 = null;
        slimTableFactoryTest0.setslimTableFactory(slimTableFactory7);
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory9 = null;
        slimTableFactoryTest0.setslimTableFactory(slimTableFactory9);
        fitnesse.testsystems.slim.Table table11 = slimTableFactoryTest0.gettable();
        org.junit.Assert.assertNull(strMap1);
        org.junit.Assert.assertNull(slimTableFactory2);
        org.junit.Assert.assertNull(table3);
        org.junit.Assert.assertNull(slimTableFactory4);
        org.junit.Assert.assertNull(table11);
    }

    @Test
    public void test11020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11020");
        fitnesse.testsystems.slim.tables.SlimTableFactoryTest slimTableFactoryTest0 = new fitnesse.testsystems.slim.tables.SlimTableFactoryTest();
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory1 = slimTableFactoryTest0.slimTableFactory;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory2 = slimTableFactoryTest0.slimTableFactory;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory3 = slimTableFactoryTest0.slimTableFactory;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory4 = null;
        slimTableFactoryTest0.slimTableFactory = slimTableFactory4;
        fitnesse.testsystems.slim.Table table6 = null;
        slimTableFactoryTest0.table = table6;
        java.util.Map<java.lang.String, java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable>> strMap8 = slimTableFactoryTest0.map;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory9 = null;
        slimTableFactoryTest0.setslimTableFactory(slimTableFactory9);
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
        org.junit.Assert.assertNull(slimTableFactory2);
        org.junit.Assert.assertNull(slimTableFactory3);
        org.junit.Assert.assertNull(strMap8);
    }

    @Test
    public void test11021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11021");
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
        java.util.Map<java.lang.String, java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable>> strMap14 = slimTableFactoryTest0.getmap();
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory15 = slimTableFactoryTest0.getslimTableFactory();
        java.util.Map<java.lang.String, java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable>> strMap16 = slimTableFactoryTest0.map;
        fitnesse.testsystems.slim.Table table17 = slimTableFactoryTest0.gettable();
        org.junit.Assert.assertNull(table7);
        org.junit.Assert.assertNull(strMap10);
        org.junit.Assert.assertNull(slimTableFactory11);
        org.junit.Assert.assertNull(table12);
        org.junit.Assert.assertNull(strMap13);
        org.junit.Assert.assertNull(strMap14);
        org.junit.Assert.assertNull(slimTableFactory15);
        org.junit.Assert.assertNull(strMap16);
        org.junit.Assert.assertNull(table17);
    }

    @Test
    public void test11022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11022");
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
        java.util.Map<java.lang.String, java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable>> strMap12 = slimTableFactoryTest0.getmap();
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
    public void test11023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11023");
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
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory17 = slimTableFactoryTest0.getslimTableFactory();
        java.util.Map<java.lang.String, java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable>> strMap18 = slimTableFactoryTest0.getmap();
        java.util.Map<java.lang.String, java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable>> strMap19 = slimTableFactoryTest0.getmap();
        fitnesse.testsystems.slim.Table table20 = slimTableFactoryTest0.gettable();
        fitnesse.testsystems.slim.Table table21 = slimTableFactoryTest0.gettable();
        org.junit.Assert.assertNull(strMap5);
        org.junit.Assert.assertNull(slimTableFactory6);
        org.junit.Assert.assertNull(slimTableFactory7);
        org.junit.Assert.assertNull(table8);
        org.junit.Assert.assertNull(table13);
        org.junit.Assert.assertNull(table14);
        org.junit.Assert.assertNull(slimTableFactory17);
        org.junit.Assert.assertNull(strMap18);
        org.junit.Assert.assertNull(strMap19);
        org.junit.Assert.assertNull(table20);
        org.junit.Assert.assertNull(table21);
    }

    @Test
    public void test11024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11024");
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
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory14 = slimTableFactoryTest0.slimTableFactory;
        java.lang.Class<?> wildcardClass15 = slimTableFactoryTest0.getClass();
        org.junit.Assert.assertNull(slimTableFactory1);
        org.junit.Assert.assertNull(table2);
        org.junit.Assert.assertNull(table9);
        org.junit.Assert.assertNull(slimTableFactory14);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test11025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11025");
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
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory15 = slimTableFactoryTest0.getslimTableFactory();
        fitnesse.testsystems.slim.Table table16 = slimTableFactoryTest0.table;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory17 = slimTableFactoryTest0.getslimTableFactory();
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory18 = slimTableFactoryTest0.getslimTableFactory();
        java.util.Map<java.lang.String, java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable>> strMap19 = slimTableFactoryTest0.map;
        org.junit.Assert.assertNull(table7);
        org.junit.Assert.assertNull(strMap12);
        org.junit.Assert.assertNull(slimTableFactory15);
        org.junit.Assert.assertNull(table16);
        org.junit.Assert.assertNull(slimTableFactory17);
        org.junit.Assert.assertNull(slimTableFactory18);
        org.junit.Assert.assertNull(strMap19);
    }

    @Test
    public void test11026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11026");
        fitnesse.testsystems.slim.tables.SlimTableFactoryTest slimTableFactoryTest0 = new fitnesse.testsystems.slim.tables.SlimTableFactoryTest();
        java.util.Map<java.lang.String, java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable>> strMap1 = slimTableFactoryTest0.getmap();
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory2 = null;
        slimTableFactoryTest0.setslimTableFactory(slimTableFactory2);
        fitnesse.testsystems.slim.Table table4 = slimTableFactoryTest0.gettable();
        java.util.Map<java.lang.String, java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable>> strMap5 = slimTableFactoryTest0.map;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory6 = null;
        slimTableFactoryTest0.slimTableFactory = slimTableFactory6;
        fitnesse.testsystems.slim.Table table8 = null;
        slimTableFactoryTest0.settable(table8);
        // The following exception was thrown during execution in test generation
        try {
            slimTableFactoryTest0.checkTableTypeDefinesIgnoredIfDifferentSpecified();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(strMap1);
        org.junit.Assert.assertNull(table4);
        org.junit.Assert.assertNull(strMap5);
    }

    @Test
    public void test11027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11027");
        fitnesse.testsystems.slim.tables.SlimTableFactoryTest slimTableFactoryTest0 = new fitnesse.testsystems.slim.tables.SlimTableFactoryTest();
        fitnesse.testsystems.slim.Table table1 = null;
        slimTableFactoryTest0.table = table1;
        fitnesse.testsystems.slim.Table table3 = null;
        slimTableFactoryTest0.settable(table3);
        java.util.Map<java.lang.String, java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable>> strMap5 = slimTableFactoryTest0.map;
        java.util.Map<java.lang.String, java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable>> strMap6 = slimTableFactoryTest0.getmap();
        fitnesse.testsystems.slim.Table table7 = slimTableFactoryTest0.table;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory8 = slimTableFactoryTest0.getslimTableFactory();
        fitnesse.testsystems.slim.Table table9 = slimTableFactoryTest0.table;
        fitnesse.testsystems.slim.Table table10 = null;
        slimTableFactoryTest0.table = table10;
        fitnesse.testsystems.slim.Table table12 = null;
        slimTableFactoryTest0.table = table12;
        // The following exception was thrown during execution in test generation
        try {
            slimTableFactoryTest0.addTableTypeImport("hi!", "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(strMap5);
        org.junit.Assert.assertNull(strMap6);
        org.junit.Assert.assertNull(table7);
        org.junit.Assert.assertNull(slimTableFactory8);
        org.junit.Assert.assertNull(table9);
    }

    @Test
    public void test11028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11028");
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
        java.util.Map<java.lang.String, java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable>> strMap12 = slimTableFactoryTest0.getmap();
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
        org.junit.Assert.assertNull(strMap6);
        org.junit.Assert.assertNull(table7);
        org.junit.Assert.assertNull(slimTableFactory10);
        org.junit.Assert.assertNull(slimTableFactory11);
        org.junit.Assert.assertNull(strMap12);
        org.junit.Assert.assertNull(table13);
        org.junit.Assert.assertNull(slimTableFactory14);
    }

    @Test
    public void test11029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11029");
        fitnesse.testsystems.slim.tables.SlimTableFactoryTest slimTableFactoryTest0 = new fitnesse.testsystems.slim.tables.SlimTableFactoryTest();
        fitnesse.testsystems.slim.Table table1 = slimTableFactoryTest0.table;
        java.util.Map<java.lang.String, java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable>> strMap2 = slimTableFactoryTest0.getmap();
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory3 = null;
        slimTableFactoryTest0.slimTableFactory = slimTableFactory3;
        fitnesse.testsystems.slim.Table table5 = slimTableFactoryTest0.table;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory6 = null;
        slimTableFactoryTest0.slimTableFactory = slimTableFactory6;
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
    public void test11030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11030");
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
        fitnesse.testsystems.slim.Table table11 = null;
        slimTableFactoryTest0.settable(table11);
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory13 = null;
        slimTableFactoryTest0.setslimTableFactory(slimTableFactory13);
        fitnesse.testsystems.slim.Table table15 = null;
        slimTableFactoryTest0.settable(table15);
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory17 = null;
        slimTableFactoryTest0.slimTableFactory = slimTableFactory17;
        // The following exception was thrown during execution in test generation
        try {
            slimTableFactoryTest0.checkTableTypeDefineUsedForTable();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(strMap5);
        org.junit.Assert.assertNull(table10);
    }

    @Test
    public void test11031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11031");
        fitnesse.testsystems.slim.tables.SlimTableFactoryTest slimTableFactoryTest0 = new fitnesse.testsystems.slim.tables.SlimTableFactoryTest();
        fitnesse.testsystems.slim.Table table1 = slimTableFactoryTest0.table;
        java.util.Map<java.lang.String, java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable>> strMap2 = slimTableFactoryTest0.getmap();
        java.util.Map<java.lang.String, java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable>> strMap3 = slimTableFactoryTest0.getmap();
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory4 = slimTableFactoryTest0.slimTableFactory;
        fitnesse.testsystems.slim.Table table5 = null;
        slimTableFactoryTest0.table = table5;
        fitnesse.testsystems.slim.Table table7 = slimTableFactoryTest0.table;
        fitnesse.testsystems.slim.Table table8 = null;
        slimTableFactoryTest0.table = table8;
        fitnesse.testsystems.slim.Table table10 = slimTableFactoryTest0.table;
        java.util.Map<java.lang.String, java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable>> strMap11 = slimTableFactoryTest0.map;
        org.junit.Assert.assertNull(table1);
        org.junit.Assert.assertNull(strMap2);
        org.junit.Assert.assertNull(strMap3);
        org.junit.Assert.assertNull(slimTableFactory4);
        org.junit.Assert.assertNull(table7);
        org.junit.Assert.assertNull(table10);
        org.junit.Assert.assertNull(strMap11);
    }

    @Test
    public void test11032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11032");
        fitnesse.testsystems.slim.tables.SlimTableFactoryTest slimTableFactoryTest0 = new fitnesse.testsystems.slim.tables.SlimTableFactoryTest();
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory1 = slimTableFactoryTest0.slimTableFactory;
        fitnesse.testsystems.slim.Table table2 = slimTableFactoryTest0.gettable();
        java.util.Map<java.lang.String, java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable>> strMap3 = slimTableFactoryTest0.map;
        fitnesse.testsystems.slim.Table table4 = slimTableFactoryTest0.gettable();
        fitnesse.testsystems.slim.Table table5 = slimTableFactoryTest0.table;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory6 = slimTableFactoryTest0.getslimTableFactory();
        org.junit.Assert.assertNull(slimTableFactory1);
        org.junit.Assert.assertNull(table2);
        org.junit.Assert.assertNull(strMap3);
        org.junit.Assert.assertNull(table4);
        org.junit.Assert.assertNull(table5);
        org.junit.Assert.assertNull(slimTableFactory6);
    }

    @Test
    public void test11033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11033");
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
        fitnesse.testsystems.slim.Table table11 = slimTableFactoryTest0.table;
        fitnesse.testsystems.slim.Table table12 = null;
        slimTableFactoryTest0.settable(table12);
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
        org.junit.Assert.assertNull(table11);
    }

    @Test
    public void test11034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11034");
        fitnesse.testsystems.slim.tables.SlimTableFactoryTest slimTableFactoryTest0 = new fitnesse.testsystems.slim.tables.SlimTableFactoryTest();
        fitnesse.testsystems.slim.Table table1 = slimTableFactoryTest0.table;
        java.util.Map<java.lang.String, java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable>> strMap2 = slimTableFactoryTest0.getmap();
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory3 = null;
        slimTableFactoryTest0.slimTableFactory = slimTableFactory3;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory5 = slimTableFactoryTest0.slimTableFactory;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory6 = null;
        slimTableFactoryTest0.setslimTableFactory(slimTableFactory6);
        fitnesse.testsystems.slim.Table table8 = null;
        slimTableFactoryTest0.table = table8;
        fitnesse.testsystems.slim.Table table10 = slimTableFactoryTest0.gettable();
        org.junit.Assert.assertNull(table1);
        org.junit.Assert.assertNull(strMap2);
        org.junit.Assert.assertNull(slimTableFactory5);
        org.junit.Assert.assertNull(table10);
    }

    @Test
    public void test11035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11035");
        fitnesse.testsystems.slim.tables.SlimTableFactoryTest slimTableFactoryTest0 = new fitnesse.testsystems.slim.tables.SlimTableFactoryTest();
        fitnesse.testsystems.slim.Table table1 = null;
        slimTableFactoryTest0.table = table1;
        fitnesse.testsystems.slim.Table table3 = null;
        slimTableFactoryTest0.settable(table3);
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory5 = slimTableFactoryTest0.slimTableFactory;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory6 = slimTableFactoryTest0.getslimTableFactory();
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory7 = null;
        slimTableFactoryTest0.setslimTableFactory(slimTableFactory7);
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory9 = null;
        slimTableFactoryTest0.setslimTableFactory(slimTableFactory9);
        java.util.Map<java.lang.String, java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable>> strMap11 = slimTableFactoryTest0.getmap();
        // The following exception was thrown during execution in test generation
        try {
            slimTableFactoryTest0.addTableTypeImport("hi!", "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(slimTableFactory5);
        org.junit.Assert.assertNull(slimTableFactory6);
        org.junit.Assert.assertNull(strMap11);
    }

    @Test
    public void test11036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11036");
        fitnesse.testsystems.slim.tables.SlimTableFactoryTest slimTableFactoryTest0 = new fitnesse.testsystems.slim.tables.SlimTableFactoryTest();
        fitnesse.testsystems.slim.Table table1 = slimTableFactoryTest0.table;
        java.util.Map<java.lang.String, java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable>> strMap2 = slimTableFactoryTest0.getmap();
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory3 = null;
        slimTableFactoryTest0.slimTableFactory = slimTableFactory3;
        fitnesse.testsystems.slim.Table table5 = slimTableFactoryTest0.table;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory6 = slimTableFactoryTest0.slimTableFactory;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory7 = null;
        slimTableFactoryTest0.setslimTableFactory(slimTableFactory7);
        fitnesse.testsystems.slim.Table table9 = null;
        slimTableFactoryTest0.settable(table9);
        java.util.Map<java.lang.String, java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable>> strMap11 = slimTableFactoryTest0.map;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory12 = null;
        slimTableFactoryTest0.slimTableFactory = slimTableFactory12;
        org.junit.Assert.assertNull(table1);
        org.junit.Assert.assertNull(strMap2);
        org.junit.Assert.assertNull(table5);
        org.junit.Assert.assertNull(slimTableFactory6);
        org.junit.Assert.assertNull(strMap11);
    }

    @Test
    public void test11037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11037");
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
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory13 = null;
        slimTableFactoryTest0.setslimTableFactory(slimTableFactory13);
        fitnesse.testsystems.slim.Table table15 = null;
        slimTableFactoryTest0.table = table15;
        fitnesse.testsystems.slim.Table table17 = slimTableFactoryTest0.table;
        fitnesse.testsystems.slim.Table table18 = slimTableFactoryTest0.gettable();
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory19 = null;
        slimTableFactoryTest0.setslimTableFactory(slimTableFactory19);
        fitnesse.testsystems.slim.Table table21 = slimTableFactoryTest0.table;
        org.junit.Assert.assertNull(strMap5);
        org.junit.Assert.assertNull(slimTableFactory12);
        org.junit.Assert.assertNull(table17);
        org.junit.Assert.assertNull(table18);
        org.junit.Assert.assertNull(table21);
    }

    @Test
    public void test11038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11038");
        fitnesse.testsystems.slim.tables.SlimTableFactoryTest slimTableFactoryTest0 = new fitnesse.testsystems.slim.tables.SlimTableFactoryTest();
        fitnesse.testsystems.slim.Table table1 = null;
        slimTableFactoryTest0.table = table1;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory3 = slimTableFactoryTest0.slimTableFactory;
        java.util.Map<java.lang.String, java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable>> strMap4 = slimTableFactoryTest0.getmap();
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory5 = slimTableFactoryTest0.slimTableFactory;
        java.util.Map<java.lang.String, java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable>> strMap6 = slimTableFactoryTest0.map;
        fitnesse.testsystems.slim.Table table7 = null;
        slimTableFactoryTest0.settable(table7);
        java.util.Map<java.lang.String, java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable>> strMap9 = slimTableFactoryTest0.getmap();
        fitnesse.testsystems.slim.Table table10 = null;
        slimTableFactoryTest0.settable(table10);
        fitnesse.testsystems.slim.Table table12 = slimTableFactoryTest0.table;
        fitnesse.testsystems.slim.Table table13 = null;
        slimTableFactoryTest0.table = table13;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory15 = null;
        slimTableFactoryTest0.setslimTableFactory(slimTableFactory15);
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
        org.junit.Assert.assertNull(table12);
    }

    @Test
    public void test11039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11039");
        fitnesse.testsystems.slim.tables.SlimTableFactoryTest slimTableFactoryTest0 = new fitnesse.testsystems.slim.tables.SlimTableFactoryTest();
        fitnesse.testsystems.slim.Table table1 = null;
        slimTableFactoryTest0.table = table1;
        fitnesse.testsystems.slim.Table table3 = null;
        slimTableFactoryTest0.settable(table3);
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory5 = null;
        slimTableFactoryTest0.slimTableFactory = slimTableFactory5;
        fitnesse.testsystems.slim.Table table7 = slimTableFactoryTest0.table;
        // The following exception was thrown during execution in test generation
        try {
            slimTableFactoryTest0.addTableTypeImport("", "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(table7);
    }

    @Test
    public void test11040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11040");
        fitnesse.testsystems.slim.tables.SlimTableFactoryTest slimTableFactoryTest0 = new fitnesse.testsystems.slim.tables.SlimTableFactoryTest();
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory1 = slimTableFactoryTest0.slimTableFactory;
        fitnesse.testsystems.slim.Table table2 = slimTableFactoryTest0.gettable();
        fitnesse.testsystems.slim.Table table3 = null;
        slimTableFactoryTest0.table = table3;
        fitnesse.testsystems.slim.Table table5 = null;
        slimTableFactoryTest0.table = table5;
        fitnesse.testsystems.slim.Table table7 = null;
        slimTableFactoryTest0.table = table7;
        java.lang.Class<?> wildcardClass9 = slimTableFactoryTest0.getClass();
        org.junit.Assert.assertNull(slimTableFactory1);
        org.junit.Assert.assertNull(table2);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test11041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11041");
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
        fitnesse.testsystems.slim.Table table13 = null;
        slimTableFactoryTest0.settable(table13);
        java.util.Map<java.lang.String, java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable>> strMap15 = slimTableFactoryTest0.getmap();
        // The following exception was thrown during execution in test generation
        try {
            slimTableFactoryTest0.addTableTypeImport("", "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(slimTableFactory3);
        org.junit.Assert.assertNull(strMap4);
        org.junit.Assert.assertNull(slimTableFactory11);
        org.junit.Assert.assertNull(slimTableFactory12);
        org.junit.Assert.assertNull(strMap15);
    }

    @Test
    public void test11042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11042");
        fitnesse.testsystems.slim.tables.SlimTableFactoryTest slimTableFactoryTest0 = new fitnesse.testsystems.slim.tables.SlimTableFactoryTest();
        fitnesse.testsystems.slim.Table table1 = null;
        slimTableFactoryTest0.table = table1;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory3 = slimTableFactoryTest0.slimTableFactory;
        java.util.Map<java.lang.String, java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable>> strMap4 = slimTableFactoryTest0.map;
        fitnesse.testsystems.slim.Table table5 = slimTableFactoryTest0.table;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory6 = slimTableFactoryTest0.slimTableFactory;
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
        org.junit.Assert.assertNull(table5);
        org.junit.Assert.assertNull(slimTableFactory6);
        org.junit.Assert.assertNull(strMap7);
    }

    @Test
    public void test11043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11043");
        fitnesse.testsystems.slim.tables.SlimTableFactoryTest slimTableFactoryTest0 = new fitnesse.testsystems.slim.tables.SlimTableFactoryTest();
        fitnesse.testsystems.slim.Table table1 = slimTableFactoryTest0.table;
        java.util.Map<java.lang.String, java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable>> strMap2 = slimTableFactoryTest0.getmap();
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory3 = slimTableFactoryTest0.getslimTableFactory();
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory4 = null;
        slimTableFactoryTest0.slimTableFactory = slimTableFactory4;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory6 = null;
        slimTableFactoryTest0.slimTableFactory = slimTableFactory6;
        fitnesse.testsystems.slim.Table table8 = slimTableFactoryTest0.table;
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
        org.junit.Assert.assertNull(table8);
    }

    @Test
    public void test11044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11044");
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
        fitnesse.testsystems.slim.Table table15 = slimTableFactoryTest0.gettable();
        fitnesse.testsystems.slim.Table table16 = slimTableFactoryTest0.gettable();
        org.junit.Assert.assertNull(slimTableFactory3);
        org.junit.Assert.assertNull(strMap4);
        org.junit.Assert.assertNull(strMap9);
        org.junit.Assert.assertNull(strMap10);
        org.junit.Assert.assertNull(strMap13);
        org.junit.Assert.assertNull(table14);
        org.junit.Assert.assertNull(table15);
        org.junit.Assert.assertNull(table16);
    }

    @Test
    public void test11045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11045");
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
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory13 = slimTableFactoryTest0.slimTableFactory;
        java.lang.Class<?> wildcardClass14 = slimTableFactoryTest0.getClass();
        org.junit.Assert.assertNull(slimTableFactory3);
        org.junit.Assert.assertNull(strMap4);
        org.junit.Assert.assertNull(strMap9);
        org.junit.Assert.assertNull(slimTableFactory10);
        org.junit.Assert.assertNull(slimTableFactory13);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test11046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11046");
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
        java.util.Map<java.lang.String, java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable>> strMap15 = slimTableFactoryTest0.map;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory16 = slimTableFactoryTest0.slimTableFactory;
        java.util.Map<java.lang.String, java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable>> strMap17 = slimTableFactoryTest0.map;
        fitnesse.testsystems.slim.Table table18 = slimTableFactoryTest0.gettable();
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory19 = null;
        slimTableFactoryTest0.slimTableFactory = slimTableFactory19;
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
        org.junit.Assert.assertNull(slimTableFactory14);
        org.junit.Assert.assertNull(strMap15);
        org.junit.Assert.assertNull(slimTableFactory16);
        org.junit.Assert.assertNull(strMap17);
        org.junit.Assert.assertNull(table18);
    }

    @Test
    public void test11047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11047");
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
        java.util.Map<java.lang.String, java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable>> strMap12 = slimTableFactoryTest0.getmap();
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory13 = null;
        slimTableFactoryTest0.slimTableFactory = slimTableFactory13;
        java.util.Map<java.lang.String, java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable>> strMap15 = slimTableFactoryTest0.getmap();
        fitnesse.testsystems.slim.Table table16 = slimTableFactoryTest0.gettable();
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory17 = null;
        slimTableFactoryTest0.setslimTableFactory(slimTableFactory17);
        org.junit.Assert.assertNull(slimTableFactory5);
        org.junit.Assert.assertNull(slimTableFactory8);
        org.junit.Assert.assertNull(table9);
        org.junit.Assert.assertNull(strMap12);
        org.junit.Assert.assertNull(strMap15);
        org.junit.Assert.assertNull(table16);
    }

    @Test
    public void test11048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11048");
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
        slimTableFactoryTest0.settable(table9);
        java.util.Map<java.lang.String, java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable>> strMap11 = slimTableFactoryTest0.getmap();
        fitnesse.testsystems.slim.Table table12 = null;
        slimTableFactoryTest0.settable(table12);
        org.junit.Assert.assertNull(slimTableFactory1);
        org.junit.Assert.assertNull(table2);
        org.junit.Assert.assertNull(strMap7);
        org.junit.Assert.assertNull(slimTableFactory8);
        org.junit.Assert.assertNull(strMap11);
    }

    @Test
    public void test11049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11049");
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
        fitnesse.testsystems.slim.Table table11 = null;
        slimTableFactoryTest0.settable(table11);
        fitnesse.testsystems.slim.Table table13 = null;
        slimTableFactoryTest0.table = table13;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory15 = slimTableFactoryTest0.slimTableFactory;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory16 = slimTableFactoryTest0.slimTableFactory;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory17 = slimTableFactoryTest0.getslimTableFactory();
        org.junit.Assert.assertNull(slimTableFactory7);
        org.junit.Assert.assertNull(strMap8);
        org.junit.Assert.assertNull(slimTableFactory15);
        org.junit.Assert.assertNull(slimTableFactory16);
        org.junit.Assert.assertNull(slimTableFactory17);
    }

    @Test
    public void test11050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11050");
        fitnesse.testsystems.slim.tables.SlimTableFactoryTest slimTableFactoryTest0 = new fitnesse.testsystems.slim.tables.SlimTableFactoryTest();
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory1 = slimTableFactoryTest0.slimTableFactory;
        fitnesse.testsystems.slim.Table table2 = slimTableFactoryTest0.table;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory3 = null;
        slimTableFactoryTest0.setslimTableFactory(slimTableFactory3);
        fitnesse.testsystems.slim.Table table5 = null;
        slimTableFactoryTest0.settable(table5);
        java.util.Map<java.lang.String, java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable>> strMap7 = slimTableFactoryTest0.getmap();
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory8 = null;
        slimTableFactoryTest0.slimTableFactory = slimTableFactory8;
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
    }

    @Test
    public void test11051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11051");
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
        fitnesse.testsystems.slim.Table table11 = null;
        slimTableFactoryTest0.settable(table11);
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory13 = null;
        slimTableFactoryTest0.slimTableFactory = slimTableFactory13;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory15 = null;
        slimTableFactoryTest0.slimTableFactory = slimTableFactory15;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory17 = null;
        slimTableFactoryTest0.setslimTableFactory(slimTableFactory17);
        // The following exception was thrown during execution in test generation
        try {
            slimTableFactoryTest0.checkTableTypeDefineUsedForTable();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(slimTableFactory3);
        org.junit.Assert.assertNull(table8);
    }

    @Test
    public void test11052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11052");
        fitnesse.testsystems.slim.tables.SlimTableFactoryTest slimTableFactoryTest0 = new fitnesse.testsystems.slim.tables.SlimTableFactoryTest();
        fitnesse.testsystems.slim.Table table1 = null;
        slimTableFactoryTest0.table = table1;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory3 = slimTableFactoryTest0.getslimTableFactory();
        fitnesse.testsystems.slim.Table table4 = slimTableFactoryTest0.gettable();
        java.util.Map<java.lang.String, java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable>> strMap5 = slimTableFactoryTest0.getmap();
        fitnesse.testsystems.slim.Table table6 = slimTableFactoryTest0.table;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory7 = slimTableFactoryTest0.slimTableFactory;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory8 = null;
        slimTableFactoryTest0.slimTableFactory = slimTableFactory8;
        fitnesse.testsystems.slim.Table table10 = slimTableFactoryTest0.gettable();
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory11 = null;
        slimTableFactoryTest0.slimTableFactory = slimTableFactory11;
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
        org.junit.Assert.assertNull(table10);
    }

    @Test
    public void test11053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11053");
        fitnesse.testsystems.slim.tables.SlimTableFactoryTest slimTableFactoryTest0 = new fitnesse.testsystems.slim.tables.SlimTableFactoryTest();
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory1 = slimTableFactoryTest0.slimTableFactory;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory2 = slimTableFactoryTest0.slimTableFactory;
        fitnesse.testsystems.slim.Table table3 = slimTableFactoryTest0.gettable();
        fitnesse.testsystems.slim.Table table4 = slimTableFactoryTest0.gettable();
        fitnesse.testsystems.slim.Table table5 = slimTableFactoryTest0.gettable();
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory6 = slimTableFactoryTest0.slimTableFactory;
        fitnesse.testsystems.slim.Table table7 = null;
        slimTableFactoryTest0.settable(table7);
        fitnesse.testsystems.slim.Table table9 = slimTableFactoryTest0.table;
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
        org.junit.Assert.assertNull(table4);
        org.junit.Assert.assertNull(table5);
        org.junit.Assert.assertNull(slimTableFactory6);
        org.junit.Assert.assertNull(table9);
    }

    @Test
    public void test11054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11054");
        fitnesse.testsystems.slim.tables.SlimTableFactoryTest slimTableFactoryTest0 = new fitnesse.testsystems.slim.tables.SlimTableFactoryTest();
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory1 = slimTableFactoryTest0.slimTableFactory;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory2 = slimTableFactoryTest0.slimTableFactory;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory3 = slimTableFactoryTest0.slimTableFactory;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory4 = null;
        slimTableFactoryTest0.slimTableFactory = slimTableFactory4;
        fitnesse.testsystems.slim.Table table6 = null;
        slimTableFactoryTest0.table = table6;
        java.util.Map<java.lang.String, java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable>> strMap8 = slimTableFactoryTest0.map;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory9 = slimTableFactoryTest0.slimTableFactory;
        org.junit.Assert.assertNull(slimTableFactory1);
        org.junit.Assert.assertNull(slimTableFactory2);
        org.junit.Assert.assertNull(slimTableFactory3);
        org.junit.Assert.assertNull(strMap8);
        org.junit.Assert.assertNull(slimTableFactory9);
    }

    @Test
    public void test11055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11055");
        fitnesse.testsystems.slim.tables.SlimTableFactoryTest slimTableFactoryTest0 = new fitnesse.testsystems.slim.tables.SlimTableFactoryTest();
        fitnesse.testsystems.slim.Table table1 = null;
        slimTableFactoryTest0.table = table1;
        fitnesse.testsystems.slim.Table table3 = null;
        slimTableFactoryTest0.settable(table3);
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
        org.junit.Assert.assertNull(strMap5);
    }

    @Test
    public void test11056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11056");
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
        fitnesse.testsystems.slim.Table table10 = null;
        slimTableFactoryTest0.table = table10;
        java.util.Map<java.lang.String, java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable>> strMap12 = slimTableFactoryTest0.getmap();
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory13 = slimTableFactoryTest0.getslimTableFactory();
        java.util.Map<java.lang.String, java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable>> strMap14 = slimTableFactoryTest0.getmap();
        fitnesse.testsystems.slim.Table table15 = slimTableFactoryTest0.table;
        java.lang.Class<?> wildcardClass16 = slimTableFactoryTest0.getClass();
        org.junit.Assert.assertNull(strMap5);
        org.junit.Assert.assertNull(slimTableFactory6);
        org.junit.Assert.assertNull(slimTableFactory7);
        org.junit.Assert.assertNull(strMap8);
        org.junit.Assert.assertNull(strMap9);
        org.junit.Assert.assertNull(strMap12);
        org.junit.Assert.assertNull(slimTableFactory13);
        org.junit.Assert.assertNull(strMap14);
        org.junit.Assert.assertNull(table15);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test11057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11057");
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
        java.util.Map<java.lang.String, java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable>> strMap17 = slimTableFactoryTest0.map;
        fitnesse.testsystems.slim.Table table18 = null;
        slimTableFactoryTest0.table = table18;
        org.junit.Assert.assertNull(slimTableFactory3);
        org.junit.Assert.assertNull(strMap4);
        org.junit.Assert.assertNull(strMap17);
    }

    @Test
    public void test11058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11058");
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
        fitnesse.testsystems.slim.Table table15 = null;
        slimTableFactoryTest0.settable(table15);
        java.util.Map<java.lang.String, java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable>> strMap17 = slimTableFactoryTest0.getmap();
        // The following exception was thrown during execution in test generation
        try {
            slimTableFactoryTest0.checkTableTypeDefineUsedForTable();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(strMap7);
        org.junit.Assert.assertNull(slimTableFactory12);
        org.junit.Assert.assertNull(strMap17);
    }

    @Test
    public void test11059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11059");
        fitnesse.testsystems.slim.tables.SlimTableFactoryTest slimTableFactoryTest0 = new fitnesse.testsystems.slim.tables.SlimTableFactoryTest();
        fitnesse.testsystems.slim.Table table1 = slimTableFactoryTest0.table;
        java.util.Map<java.lang.String, java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable>> strMap2 = slimTableFactoryTest0.getmap();
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory3 = null;
        slimTableFactoryTest0.slimTableFactory = slimTableFactory3;
        fitnesse.testsystems.slim.Table table5 = slimTableFactoryTest0.table;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory6 = null;
        slimTableFactoryTest0.slimTableFactory = slimTableFactory6;
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
        org.junit.Assert.assertNull(table1);
        org.junit.Assert.assertNull(strMap2);
        org.junit.Assert.assertNull(table5);
        org.junit.Assert.assertNull(table8);
        org.junit.Assert.assertNull(slimTableFactory9);
    }

    @Test
    public void test11060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11060");
        fitnesse.testsystems.slim.tables.SlimTableFactoryTest slimTableFactoryTest0 = new fitnesse.testsystems.slim.tables.SlimTableFactoryTest();
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory1 = slimTableFactoryTest0.slimTableFactory;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory2 = slimTableFactoryTest0.slimTableFactory;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory3 = slimTableFactoryTest0.slimTableFactory;
        java.util.Map<java.lang.String, java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable>> strMap4 = slimTableFactoryTest0.map;
        java.util.Map<java.lang.String, java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable>> strMap5 = slimTableFactoryTest0.map;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory6 = slimTableFactoryTest0.slimTableFactory;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory7 = slimTableFactoryTest0.slimTableFactory;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory8 = null;
        slimTableFactoryTest0.setslimTableFactory(slimTableFactory8);
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
        org.junit.Assert.assertNull(slimTableFactory2);
        org.junit.Assert.assertNull(slimTableFactory3);
        org.junit.Assert.assertNull(strMap4);
        org.junit.Assert.assertNull(strMap5);
        org.junit.Assert.assertNull(slimTableFactory6);
        org.junit.Assert.assertNull(slimTableFactory7);
    }

    @Test
    public void test11061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11061");
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
        fitnesse.testsystems.slim.Table table10 = slimTableFactoryTest0.table;
        fitnesse.testsystems.slim.Table table11 = slimTableFactoryTest0.gettable();
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory12 = null;
        slimTableFactoryTest0.slimTableFactory = slimTableFactory12;
        java.util.Map<java.lang.String, java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable>> strMap14 = slimTableFactoryTest0.map;
        // The following exception was thrown during execution in test generation
        try {
            slimTableFactoryTest0.commentTableShouldReturnNull();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(slimTableFactory5);
        org.junit.Assert.assertNull(table10);
        org.junit.Assert.assertNull(table11);
        org.junit.Assert.assertNull(strMap14);
    }

    @Test
    public void test11062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11062");
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
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory11 = slimTableFactoryTest0.slimTableFactory;
        java.util.Map<java.lang.String, java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable>> strMap12 = slimTableFactoryTest0.map;
        fitnesse.testsystems.slim.Table table13 = slimTableFactoryTest0.table;
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
        org.junit.Assert.assertNull(slimTableFactory10);
        org.junit.Assert.assertNull(slimTableFactory11);
        org.junit.Assert.assertNull(strMap12);
        org.junit.Assert.assertNull(table13);
    }

    @Test
    public void test11063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11063");
        fitnesse.testsystems.slim.tables.SlimTableFactoryTest slimTableFactoryTest0 = new fitnesse.testsystems.slim.tables.SlimTableFactoryTest();
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory1 = slimTableFactoryTest0.slimTableFactory;
        fitnesse.testsystems.slim.Table table2 = slimTableFactoryTest0.gettable();
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory3 = null;
        slimTableFactoryTest0.slimTableFactory = slimTableFactory3;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory5 = null;
        slimTableFactoryTest0.slimTableFactory = slimTableFactory5;
        java.util.Map<java.lang.String, java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable>> strMap7 = slimTableFactoryTest0.map;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory8 = slimTableFactoryTest0.slimTableFactory;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory9 = slimTableFactoryTest0.getslimTableFactory();
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
        org.junit.Assert.assertNull(slimTableFactory9);
    }

    @Test
    public void test11064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11064");
        fitnesse.testsystems.slim.tables.SlimTableFactoryTest slimTableFactoryTest0 = new fitnesse.testsystems.slim.tables.SlimTableFactoryTest();
        fitnesse.testsystems.slim.Table table1 = null;
        slimTableFactoryTest0.table = table1;
        fitnesse.testsystems.slim.Table table3 = slimTableFactoryTest0.table;
        fitnesse.testsystems.slim.Table table4 = slimTableFactoryTest0.gettable();
        java.util.Map<java.lang.String, java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable>> strMap5 = slimTableFactoryTest0.getmap();
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory6 = slimTableFactoryTest0.getslimTableFactory();
        java.util.Map<java.lang.String, java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable>> strMap7 = slimTableFactoryTest0.map;
        fitnesse.testsystems.slim.Table table8 = slimTableFactoryTest0.table;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory9 = slimTableFactoryTest0.getslimTableFactory();
        org.junit.Assert.assertNull(table3);
        org.junit.Assert.assertNull(table4);
        org.junit.Assert.assertNull(strMap5);
        org.junit.Assert.assertNull(slimTableFactory6);
        org.junit.Assert.assertNull(strMap7);
        org.junit.Assert.assertNull(table8);
        org.junit.Assert.assertNull(slimTableFactory9);
    }

    @Test
    public void test11065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11065");
        fitnesse.testsystems.slim.tables.SlimTableFactoryTest slimTableFactoryTest0 = new fitnesse.testsystems.slim.tables.SlimTableFactoryTest();
        fitnesse.testsystems.slim.Table table1 = null;
        slimTableFactoryTest0.table = table1;
        fitnesse.testsystems.slim.Table table3 = null;
        slimTableFactoryTest0.settable(table3);
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory5 = slimTableFactoryTest0.slimTableFactory;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory6 = slimTableFactoryTest0.getslimTableFactory();
        java.util.Map<java.lang.String, java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable>> strMap7 = slimTableFactoryTest0.getmap();
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory8 = slimTableFactoryTest0.slimTableFactory;
        fitnesse.testsystems.slim.Table table9 = null;
        slimTableFactoryTest0.settable(table9);
        fitnesse.testsystems.slim.Table table11 = slimTableFactoryTest0.gettable();
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory12 = null;
        slimTableFactoryTest0.slimTableFactory = slimTableFactory12;
        java.util.Map<java.lang.String, java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable>> strMap14 = slimTableFactoryTest0.map;
        java.util.Map<java.lang.String, java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable>> strMap15 = slimTableFactoryTest0.getmap();
        org.junit.Assert.assertNull(slimTableFactory5);
        org.junit.Assert.assertNull(slimTableFactory6);
        org.junit.Assert.assertNull(strMap7);
        org.junit.Assert.assertNull(slimTableFactory8);
        org.junit.Assert.assertNull(table11);
        org.junit.Assert.assertNull(strMap14);
        org.junit.Assert.assertNull(strMap15);
    }

    @Test
    public void test11066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11066");
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
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory18 = null;
        slimTableFactoryTest0.setslimTableFactory(slimTableFactory18);
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory20 = null;
        slimTableFactoryTest0.setslimTableFactory(slimTableFactory20);
        java.util.Map<java.lang.String, java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable>> strMap22 = slimTableFactoryTest0.getmap();
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
        org.junit.Assert.assertNull(strMap22);
    }

    @Test
    public void test11067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11067");
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
        fitnesse.testsystems.slim.Table table12 = null;
        slimTableFactoryTest0.table = table12;
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
    public void test11068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11068");
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
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory17 = slimTableFactoryTest0.slimTableFactory;
        fitnesse.testsystems.slim.Table table18 = null;
        slimTableFactoryTest0.settable(table18);
        fitnesse.testsystems.slim.Table table20 = slimTableFactoryTest0.gettable();
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory21 = null;
        slimTableFactoryTest0.setslimTableFactory(slimTableFactory21);
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory23 = slimTableFactoryTest0.slimTableFactory;
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
        org.junit.Assert.assertNull(strMap16);
        org.junit.Assert.assertNull(slimTableFactory17);
        org.junit.Assert.assertNull(table20);
        org.junit.Assert.assertNull(slimTableFactory23);
    }

    @Test
    public void test11069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11069");
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
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory13 = null;
        slimTableFactoryTest0.slimTableFactory = slimTableFactory13;
        fitnesse.testsystems.slim.Table table15 = null;
        slimTableFactoryTest0.settable(table15);
        fitnesse.testsystems.slim.Table table17 = null;
        slimTableFactoryTest0.table = table17;
        fitnesse.testsystems.slim.Table table19 = null;
        slimTableFactoryTest0.settable(table19);
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory21 = slimTableFactoryTest0.getslimTableFactory();
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
        org.junit.Assert.assertNull(table12);
        org.junit.Assert.assertNull(slimTableFactory21);
    }

    @Test
    public void test11070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11070");
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
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory14 = slimTableFactoryTest0.getslimTableFactory();
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory15 = slimTableFactoryTest0.getslimTableFactory();
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
        org.junit.Assert.assertNull(slimTableFactory14);
        org.junit.Assert.assertNull(slimTableFactory15);
    }

    @Test
    public void test11071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11071");
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
        java.util.Map<java.lang.String, java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable>> strMap12 = slimTableFactoryTest0.map;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory13 = null;
        slimTableFactoryTest0.setslimTableFactory(slimTableFactory13);
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory15 = slimTableFactoryTest0.getslimTableFactory();
        fitnesse.testsystems.slim.Table table16 = slimTableFactoryTest0.gettable();
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory17 = null;
        slimTableFactoryTest0.slimTableFactory = slimTableFactory17;
        fitnesse.testsystems.slim.Table table19 = slimTableFactoryTest0.gettable();
        fitnesse.testsystems.slim.Table table20 = null;
        slimTableFactoryTest0.table = table20;
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
        org.junit.Assert.assertNull(strMap12);
        org.junit.Assert.assertNull(slimTableFactory15);
        org.junit.Assert.assertNull(table16);
        org.junit.Assert.assertNull(table19);
    }

    @Test
    public void test11072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11072");
        fitnesse.testsystems.slim.tables.SlimTableFactoryTest slimTableFactoryTest0 = new fitnesse.testsystems.slim.tables.SlimTableFactoryTest();
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory1 = slimTableFactoryTest0.slimTableFactory;
        fitnesse.testsystems.slim.Table table2 = slimTableFactoryTest0.table;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory3 = null;
        slimTableFactoryTest0.setslimTableFactory(slimTableFactory3);
        fitnesse.testsystems.slim.Table table5 = slimTableFactoryTest0.table;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory6 = slimTableFactoryTest0.slimTableFactory;
        // The following exception was thrown during execution in test generation
        try {
            slimTableFactoryTest0.tableTypeStartingWithcommentColonShouldReturnNull();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(slimTableFactory1);
        org.junit.Assert.assertNull(table2);
        org.junit.Assert.assertNull(table5);
        org.junit.Assert.assertNull(slimTableFactory6);
    }

    @Test
    public void test11073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11073");
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
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory10 = null;
        slimTableFactoryTest0.slimTableFactory = slimTableFactory10;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory12 = null;
        slimTableFactoryTest0.setslimTableFactory(slimTableFactory12);
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory14 = slimTableFactoryTest0.slimTableFactory;
        java.util.Map<java.lang.String, java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable>> strMap15 = slimTableFactoryTest0.map;
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
        org.junit.Assert.assertNull(slimTableFactory9);
        org.junit.Assert.assertNull(slimTableFactory14);
        org.junit.Assert.assertNull(strMap15);
    }

    @Test
    public void test11074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11074");
        fitnesse.testsystems.slim.tables.SlimTableFactoryTest slimTableFactoryTest0 = new fitnesse.testsystems.slim.tables.SlimTableFactoryTest();
        fitnesse.testsystems.slim.Table table1 = slimTableFactoryTest0.table;
        java.util.Map<java.lang.String, java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable>> strMap2 = slimTableFactoryTest0.getmap();
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory3 = slimTableFactoryTest0.slimTableFactory;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory4 = slimTableFactoryTest0.getslimTableFactory();
        fitnesse.testsystems.slim.Table table5 = slimTableFactoryTest0.table;
        fitnesse.testsystems.slim.Table table6 = null;
        slimTableFactoryTest0.table = table6;
        fitnesse.testsystems.slim.Table table8 = null;
        slimTableFactoryTest0.table = table8;
        fitnesse.testsystems.slim.Table table10 = null;
        slimTableFactoryTest0.settable(table10);
        fitnesse.testsystems.slim.Table table12 = null;
        slimTableFactoryTest0.table = table12;
        org.junit.Assert.assertNull(table1);
        org.junit.Assert.assertNull(strMap2);
        org.junit.Assert.assertNull(slimTableFactory3);
        org.junit.Assert.assertNull(slimTableFactory4);
        org.junit.Assert.assertNull(table5);
    }

    @Test
    public void test11075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11075");
        fitnesse.testsystems.slim.tables.SlimTableFactoryTest slimTableFactoryTest0 = new fitnesse.testsystems.slim.tables.SlimTableFactoryTest();
        fitnesse.testsystems.slim.Table table1 = slimTableFactoryTest0.table;
        java.util.Map<java.lang.String, java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable>> strMap2 = slimTableFactoryTest0.getmap();
        java.util.Map<java.lang.String, java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable>> strMap3 = slimTableFactoryTest0.getmap();
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory4 = slimTableFactoryTest0.slimTableFactory;
        fitnesse.testsystems.slim.Table table5 = null;
        slimTableFactoryTest0.table = table5;
        fitnesse.testsystems.slim.Table table7 = null;
        slimTableFactoryTest0.table = table7;
        fitnesse.testsystems.slim.Table table9 = slimTableFactoryTest0.gettable();
        java.util.Map<java.lang.String, java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable>> strMap10 = slimTableFactoryTest0.getmap();
        java.util.Map<java.lang.String, java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable>> strMap11 = slimTableFactoryTest0.getmap();
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
        org.junit.Assert.assertNull(table9);
        org.junit.Assert.assertNull(strMap10);
        org.junit.Assert.assertNull(strMap11);
    }

    @Test
    public void test11076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11076");
        fitnesse.testsystems.slim.tables.SlimTableFactoryTest slimTableFactoryTest0 = new fitnesse.testsystems.slim.tables.SlimTableFactoryTest();
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory1 = slimTableFactoryTest0.slimTableFactory;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory2 = slimTableFactoryTest0.slimTableFactory;
        java.util.Map<java.lang.String, java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable>> strMap3 = slimTableFactoryTest0.map;
        java.util.Map<java.lang.String, java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable>> strMap4 = slimTableFactoryTest0.map;
        fitnesse.testsystems.slim.Table table5 = slimTableFactoryTest0.table;
        fitnesse.testsystems.slim.Table table6 = null;
        slimTableFactoryTest0.settable(table6);
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory8 = slimTableFactoryTest0.slimTableFactory;
        fitnesse.testsystems.slim.Table table9 = slimTableFactoryTest0.gettable();
        // The following exception was thrown during execution in test generation
        try {
            slimTableFactoryTest0.checkTableTypeDefinesIgnoredIfDifferentSpecified();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(slimTableFactory1);
        org.junit.Assert.assertNull(slimTableFactory2);
        org.junit.Assert.assertNull(strMap3);
        org.junit.Assert.assertNull(strMap4);
        org.junit.Assert.assertNull(table5);
        org.junit.Assert.assertNull(slimTableFactory8);
        org.junit.Assert.assertNull(table9);
    }

    @Test
    public void test11077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11077");
        fitnesse.testsystems.slim.tables.SlimTableFactoryTest slimTableFactoryTest0 = new fitnesse.testsystems.slim.tables.SlimTableFactoryTest();
        fitnesse.testsystems.slim.Table table1 = null;
        slimTableFactoryTest0.table = table1;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory3 = slimTableFactoryTest0.slimTableFactory;
        java.util.Map<java.lang.String, java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable>> strMap4 = slimTableFactoryTest0.getmap();
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory5 = slimTableFactoryTest0.slimTableFactory;
        java.util.Map<java.lang.String, java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable>> strMap6 = slimTableFactoryTest0.getmap();
        fitnesse.testsystems.slim.Table table7 = null;
        slimTableFactoryTest0.settable(table7);
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
    public void test11078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11078");
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
        java.util.Map<java.lang.String, java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable>> strMap16 = slimTableFactoryTest0.getmap();
        java.util.Map<java.lang.String, java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable>> strMap17 = slimTableFactoryTest0.map;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory18 = null;
        slimTableFactoryTest0.setslimTableFactory(slimTableFactory18);
        org.junit.Assert.assertNull(slimTableFactory3);
        org.junit.Assert.assertNull(strMap4);
        org.junit.Assert.assertNull(table9);
        org.junit.Assert.assertNull(table10);
        org.junit.Assert.assertNull(strMap11);
        org.junit.Assert.assertNull(strMap16);
        org.junit.Assert.assertNull(strMap17);
    }

    @Test
    public void test11079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11079");
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
        fitnesse.testsystems.slim.Table table11 = null;
        slimTableFactoryTest0.settable(table11);
        fitnesse.testsystems.slim.Table table13 = null;
        slimTableFactoryTest0.settable(table13);
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory15 = null;
        slimTableFactoryTest0.setslimTableFactory(slimTableFactory15);
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory17 = null;
        slimTableFactoryTest0.setslimTableFactory(slimTableFactory17);
        java.util.Map<java.lang.String, java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable>> strMap19 = slimTableFactoryTest0.getmap();
        fitnesse.testsystems.slim.Table table20 = slimTableFactoryTest0.table;
        org.junit.Assert.assertNull(table7);
        org.junit.Assert.assertNull(slimTableFactory8);
        org.junit.Assert.assertNull(table9);
        org.junit.Assert.assertNull(strMap10);
        org.junit.Assert.assertNull(strMap19);
        org.junit.Assert.assertNull(table20);
    }

    @Test
    public void test11080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11080");
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
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory13 = slimTableFactoryTest0.slimTableFactory;
        java.util.Map<java.lang.String, java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable>> strMap14 = slimTableFactoryTest0.getmap();
        // The following exception was thrown during execution in test generation
        try {
            slimTableFactoryTest0.shouldCreateCorrectSlimTableForTablesType();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(strMap5);
        org.junit.Assert.assertNull(slimTableFactory10);
        org.junit.Assert.assertNull(slimTableFactory11);
        org.junit.Assert.assertNull(table12);
        org.junit.Assert.assertNull(slimTableFactory13);
        org.junit.Assert.assertNull(strMap14);
    }

    @Test
    public void test11081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11081");
        fitnesse.testsystems.slim.tables.SlimTableFactoryTest slimTableFactoryTest0 = new fitnesse.testsystems.slim.tables.SlimTableFactoryTest();
        fitnesse.testsystems.slim.Table table1 = slimTableFactoryTest0.table;
        java.util.Map<java.lang.String, java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable>> strMap2 = slimTableFactoryTest0.getmap();
        java.util.Map<java.lang.String, java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable>> strMap3 = slimTableFactoryTest0.getmap();
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory4 = slimTableFactoryTest0.slimTableFactory;
        fitnesse.testsystems.slim.Table table5 = null;
        slimTableFactoryTest0.table = table5;
        fitnesse.testsystems.slim.Table table7 = null;
        slimTableFactoryTest0.table = table7;
        fitnesse.testsystems.slim.Table table9 = null;
        slimTableFactoryTest0.table = table9;
        fitnesse.testsystems.slim.Table table11 = slimTableFactoryTest0.gettable();
        fitnesse.testsystems.slim.Table table12 = null;
        slimTableFactoryTest0.settable(table12);
        java.util.Map<java.lang.String, java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable>> strMap14 = slimTableFactoryTest0.getmap();
        fitnesse.testsystems.slim.Table table15 = slimTableFactoryTest0.table;
        org.junit.Assert.assertNull(table1);
        org.junit.Assert.assertNull(strMap2);
        org.junit.Assert.assertNull(strMap3);
        org.junit.Assert.assertNull(slimTableFactory4);
        org.junit.Assert.assertNull(table11);
        org.junit.Assert.assertNull(strMap14);
        org.junit.Assert.assertNull(table15);
    }

    @Test
    public void test11082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11082");
        fitnesse.testsystems.slim.tables.SlimTableFactoryTest slimTableFactoryTest0 = new fitnesse.testsystems.slim.tables.SlimTableFactoryTest();
        fitnesse.testsystems.slim.Table table1 = null;
        slimTableFactoryTest0.table = table1;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory3 = null;
        slimTableFactoryTest0.slimTableFactory = slimTableFactory3;
        fitnesse.testsystems.slim.Table table5 = null;
        slimTableFactoryTest0.settable(table5);
        java.util.Map<java.lang.String, java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable>> strMap7 = slimTableFactoryTest0.map;
        java.util.Map<java.lang.String, java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable>> strMap8 = slimTableFactoryTest0.map;
        java.util.Map<java.lang.String, java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable>> strMap9 = slimTableFactoryTest0.map;
        java.lang.Class<?> wildcardClass10 = slimTableFactoryTest0.getClass();
        org.junit.Assert.assertNull(strMap7);
        org.junit.Assert.assertNull(strMap8);
        org.junit.Assert.assertNull(strMap9);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test11083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11083");
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
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory12 = slimTableFactoryTest0.getslimTableFactory();
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory13 = null;
        slimTableFactoryTest0.slimTableFactory = slimTableFactory13;
        fitnesse.testsystems.slim.Table table15 = slimTableFactoryTest0.table;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory16 = slimTableFactoryTest0.getslimTableFactory();
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory17 = null;
        slimTableFactoryTest0.setslimTableFactory(slimTableFactory17);
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory19 = null;
        slimTableFactoryTest0.setslimTableFactory(slimTableFactory19);
        java.util.Map<java.lang.String, java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable>> strMap21 = slimTableFactoryTest0.getmap();
        // The following exception was thrown during execution in test generation
        try {
            slimTableFactoryTest0.tableTypeStartingWithcommentColonShouldReturnNull();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(slimTableFactory5);
        org.junit.Assert.assertNull(slimTableFactory12);
        org.junit.Assert.assertNull(table15);
        org.junit.Assert.assertNull(slimTableFactory16);
        org.junit.Assert.assertNull(strMap21);
    }

    @Test
    public void test11084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11084");
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
        java.util.Map<java.lang.String, java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable>> strMap11 = slimTableFactoryTest0.map;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory12 = null;
        slimTableFactoryTest0.slimTableFactory = slimTableFactory12;
        fitnesse.testsystems.slim.Table table14 = null;
        slimTableFactoryTest0.settable(table14);
        fitnesse.testsystems.slim.Table table16 = slimTableFactoryTest0.gettable();
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory17 = null;
        slimTableFactoryTest0.slimTableFactory = slimTableFactory17;
        // The following exception was thrown during execution in test generation
        try {
            slimTableFactoryTest0.checkTableTypeDefinesIgnoredIfDifferentSpecified();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(slimTableFactory5);
        org.junit.Assert.assertNull(strMap10);
        org.junit.Assert.assertNull(strMap11);
        org.junit.Assert.assertNull(table16);
    }

    @Test
    public void test11085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11085");
        fitnesse.testsystems.slim.tables.SlimTableFactoryTest slimTableFactoryTest0 = new fitnesse.testsystems.slim.tables.SlimTableFactoryTest();
        fitnesse.testsystems.slim.Table table1 = null;
        slimTableFactoryTest0.table = table1;
        fitnesse.testsystems.slim.Table table3 = null;
        slimTableFactoryTest0.settable(table3);
        fitnesse.testsystems.slim.Table table5 = null;
        slimTableFactoryTest0.table = table5;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory7 = slimTableFactoryTest0.slimTableFactory;
        fitnesse.testsystems.slim.Table table8 = null;
        slimTableFactoryTest0.table = table8;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory10 = slimTableFactoryTest0.slimTableFactory;
        fitnesse.testsystems.slim.Table table11 = null;
        slimTableFactoryTest0.settable(table11);
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory13 = slimTableFactoryTest0.slimTableFactory;
        // The following exception was thrown during execution in test generation
        try {
            slimTableFactoryTest0.checkTableTypeDefineUsedForTable();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(slimTableFactory7);
        org.junit.Assert.assertNull(slimTableFactory10);
        org.junit.Assert.assertNull(slimTableFactory13);
    }

    @Test
    public void test11086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11086");
        fitnesse.testsystems.slim.tables.SlimTableFactoryTest slimTableFactoryTest0 = new fitnesse.testsystems.slim.tables.SlimTableFactoryTest();
        fitnesse.testsystems.slim.Table table1 = slimTableFactoryTest0.table;
        java.util.Map<java.lang.String, java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable>> strMap2 = slimTableFactoryTest0.getmap();
        java.util.Map<java.lang.String, java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable>> strMap3 = slimTableFactoryTest0.getmap();
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory4 = slimTableFactoryTest0.slimTableFactory;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory5 = slimTableFactoryTest0.getslimTableFactory();
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory6 = null;
        slimTableFactoryTest0.setslimTableFactory(slimTableFactory6);
        fitnesse.testsystems.slim.Table table8 = slimTableFactoryTest0.gettable();
        fitnesse.testsystems.slim.Table table9 = null;
        slimTableFactoryTest0.table = table9;
        java.util.Map<java.lang.String, java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable>> strMap11 = slimTableFactoryTest0.map;
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
        org.junit.Assert.assertNull(table8);
        org.junit.Assert.assertNull(strMap11);
    }

    @Test
    public void test11087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11087");
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
        slimTableFactoryTest0.table = table14;
        fitnesse.testsystems.slim.Table table16 = null;
        slimTableFactoryTest0.settable(table16);
        java.util.Map<java.lang.String, java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable>> strMap18 = slimTableFactoryTest0.getmap();
        fitnesse.testsystems.slim.Table table19 = slimTableFactoryTest0.gettable();
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory20 = slimTableFactoryTest0.slimTableFactory;
        org.junit.Assert.assertNull(slimTableFactory1);
        org.junit.Assert.assertNull(table2);
        org.junit.Assert.assertNull(table9);
        org.junit.Assert.assertNull(strMap18);
        org.junit.Assert.assertNull(table19);
        org.junit.Assert.assertNull(slimTableFactory20);
    }

    @Test
    public void test11088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11088");
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
        fitnesse.testsystems.slim.Table table14 = slimTableFactoryTest0.gettable();
        fitnesse.testsystems.slim.Table table15 = null;
        slimTableFactoryTest0.table = table15;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory17 = null;
        slimTableFactoryTest0.setslimTableFactory(slimTableFactory17);
        fitnesse.testsystems.slim.Table table19 = null;
        slimTableFactoryTest0.table = table19;
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
        org.junit.Assert.assertNull(strMap9);
        org.junit.Assert.assertNull(table10);
        org.junit.Assert.assertNull(table13);
        org.junit.Assert.assertNull(table14);
    }

    @Test
    public void test11089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11089");
        fitnesse.testsystems.slim.tables.SlimTableFactoryTest slimTableFactoryTest0 = new fitnesse.testsystems.slim.tables.SlimTableFactoryTest();
        fitnesse.testsystems.slim.Table table1 = slimTableFactoryTest0.table;
        java.util.Map<java.lang.String, java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable>> strMap2 = slimTableFactoryTest0.getmap();
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory3 = slimTableFactoryTest0.slimTableFactory;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory4 = slimTableFactoryTest0.getslimTableFactory();
        java.util.Map<java.lang.String, java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable>> strMap5 = slimTableFactoryTest0.getmap();
        fitnesse.testsystems.slim.Table table6 = null;
        slimTableFactoryTest0.settable(table6);
        fitnesse.testsystems.slim.Table table8 = null;
        slimTableFactoryTest0.table = table8;
        fitnesse.testsystems.slim.Table table10 = null;
        slimTableFactoryTest0.settable(table10);
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory12 = slimTableFactoryTest0.getslimTableFactory();
        java.util.Map<java.lang.String, java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable>> strMap13 = slimTableFactoryTest0.map;
        // The following exception was thrown during execution in test generation
        try {
            slimTableFactoryTest0.checkTableTypeDefinesIgnoredIfDifferentSpecified();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(table1);
        org.junit.Assert.assertNull(strMap2);
        org.junit.Assert.assertNull(slimTableFactory3);
        org.junit.Assert.assertNull(slimTableFactory4);
        org.junit.Assert.assertNull(strMap5);
        org.junit.Assert.assertNull(slimTableFactory12);
        org.junit.Assert.assertNull(strMap13);
    }

    @Test
    public void test11090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11090");
        fitnesse.testsystems.slim.tables.SlimTableFactoryTest slimTableFactoryTest0 = new fitnesse.testsystems.slim.tables.SlimTableFactoryTest();
        fitnesse.testsystems.slim.Table table1 = null;
        slimTableFactoryTest0.table = table1;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory3 = null;
        slimTableFactoryTest0.slimTableFactory = slimTableFactory3;
        fitnesse.testsystems.slim.Table table5 = null;
        slimTableFactoryTest0.settable(table5);
        java.util.Map<java.lang.String, java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable>> strMap7 = slimTableFactoryTest0.map;
        java.util.Map<java.lang.String, java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable>> strMap8 = slimTableFactoryTest0.map;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory9 = slimTableFactoryTest0.slimTableFactory;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory10 = slimTableFactoryTest0.slimTableFactory;
        java.util.Map<java.lang.String, java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable>> strMap11 = slimTableFactoryTest0.map;
        org.junit.Assert.assertNull(strMap7);
        org.junit.Assert.assertNull(strMap8);
        org.junit.Assert.assertNull(slimTableFactory9);
        org.junit.Assert.assertNull(slimTableFactory10);
        org.junit.Assert.assertNull(strMap11);
    }

    @Test
    public void test11091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11091");
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
            slimTableFactoryTest0.tableTypeStartingWithcommentColonShouldReturnNull();
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
    public void test11092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11092");
        fitnesse.testsystems.slim.tables.SlimTableFactoryTest slimTableFactoryTest0 = new fitnesse.testsystems.slim.tables.SlimTableFactoryTest();
        java.util.Map<java.lang.String, java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable>> strMap1 = slimTableFactoryTest0.getmap();
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory2 = slimTableFactoryTest0.slimTableFactory;
        fitnesse.testsystems.slim.Table table3 = slimTableFactoryTest0.table;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory4 = slimTableFactoryTest0.getslimTableFactory();
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory5 = null;
        slimTableFactoryTest0.slimTableFactory = slimTableFactory5;
        fitnesse.testsystems.slim.Table table7 = null;
        slimTableFactoryTest0.settable(table7);
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory9 = null;
        slimTableFactoryTest0.setslimTableFactory(slimTableFactory9);
        org.junit.Assert.assertNull(strMap1);
        org.junit.Assert.assertNull(slimTableFactory2);
        org.junit.Assert.assertNull(table3);
        org.junit.Assert.assertNull(slimTableFactory4);
    }

    @Test
    public void test11093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11093");
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
        fitnesse.testsystems.slim.Table table19 = null;
        slimTableFactoryTest0.settable(table19);
        fitnesse.testsystems.slim.Table table21 = slimTableFactoryTest0.table;
        fitnesse.testsystems.slim.Table table22 = null;
        slimTableFactoryTest0.table = table22;
        fitnesse.testsystems.slim.Table table24 = slimTableFactoryTest0.table;
        org.junit.Assert.assertNull(table7);
        org.junit.Assert.assertNull(strMap10);
        org.junit.Assert.assertNull(table13);
        org.junit.Assert.assertNull(strMap18);
        org.junit.Assert.assertNull(table21);
        org.junit.Assert.assertNull(table24);
    }

    @Test
    public void test11094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11094");
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
        fitnesse.testsystems.slim.Table table12 = null;
        slimTableFactoryTest0.settable(table12);
        fitnesse.testsystems.slim.Table table14 = null;
        slimTableFactoryTest0.table = table14;
        org.junit.Assert.assertNull(strMap5);
        org.junit.Assert.assertNull(slimTableFactory6);
        org.junit.Assert.assertNull(slimTableFactory7);
        org.junit.Assert.assertNull(strMap8);
        org.junit.Assert.assertNull(strMap9);
        org.junit.Assert.assertNull(table10);
        org.junit.Assert.assertNull(strMap11);
    }

    @Test
    public void test11095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11095");
        fitnesse.testsystems.slim.tables.SlimTableFactoryTest slimTableFactoryTest0 = new fitnesse.testsystems.slim.tables.SlimTableFactoryTest();
        fitnesse.testsystems.slim.Table table1 = null;
        slimTableFactoryTest0.table = table1;
        fitnesse.testsystems.slim.Table table3 = null;
        slimTableFactoryTest0.settable(table3);
        java.util.Map<java.lang.String, java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable>> strMap5 = slimTableFactoryTest0.map;
        java.util.Map<java.lang.String, java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable>> strMap6 = slimTableFactoryTest0.getmap();
        fitnesse.testsystems.slim.Table table7 = slimTableFactoryTest0.table;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory8 = slimTableFactoryTest0.getslimTableFactory();
        fitnesse.testsystems.slim.Table table9 = slimTableFactoryTest0.table;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory10 = null;
        slimTableFactoryTest0.slimTableFactory = slimTableFactory10;
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
        org.junit.Assert.assertNull(slimTableFactory8);
        org.junit.Assert.assertNull(table9);
    }

    @Test
    public void test11096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11096");
        fitnesse.testsystems.slim.tables.SlimTableFactoryTest slimTableFactoryTest0 = new fitnesse.testsystems.slim.tables.SlimTableFactoryTest();
        fitnesse.testsystems.slim.Table table1 = null;
        slimTableFactoryTest0.table = table1;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory3 = null;
        slimTableFactoryTest0.slimTableFactory = slimTableFactory3;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory5 = slimTableFactoryTest0.getslimTableFactory();
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory6 = slimTableFactoryTest0.slimTableFactory;
        fitnesse.testsystems.slim.Table table7 = slimTableFactoryTest0.table;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory8 = slimTableFactoryTest0.slimTableFactory;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory9 = null;
        slimTableFactoryTest0.slimTableFactory = slimTableFactory9;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory11 = null;
        slimTableFactoryTest0.setslimTableFactory(slimTableFactory11);
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory13 = slimTableFactoryTest0.getslimTableFactory();
        // The following exception was thrown during execution in test generation
        try {
            slimTableFactoryTest0.checkTableTypeDefineUsedForTable();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(slimTableFactory5);
        org.junit.Assert.assertNull(slimTableFactory6);
        org.junit.Assert.assertNull(table7);
        org.junit.Assert.assertNull(slimTableFactory8);
        org.junit.Assert.assertNull(slimTableFactory13);
    }

    @Test
    public void test11097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11097");
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
        fitnesse.testsystems.slim.Table table11 = slimTableFactoryTest0.table;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory12 = slimTableFactoryTest0.slimTableFactory;
        fitnesse.testsystems.slim.Table table13 = slimTableFactoryTest0.table;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory14 = slimTableFactoryTest0.getslimTableFactory();
        org.junit.Assert.assertNull(strMap5);
        org.junit.Assert.assertNull(table10);
        org.junit.Assert.assertNull(table11);
        org.junit.Assert.assertNull(slimTableFactory12);
        org.junit.Assert.assertNull(table13);
        org.junit.Assert.assertNull(slimTableFactory14);
    }

    @Test
    public void test11098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11098");
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
        fitnesse.testsystems.slim.Table table10 = null;
        slimTableFactoryTest0.table = table10;
        fitnesse.testsystems.slim.Table table12 = null;
        slimTableFactoryTest0.table = table12;
        fitnesse.testsystems.slim.Table table14 = slimTableFactoryTest0.gettable();
        fitnesse.testsystems.slim.Table table15 = null;
        slimTableFactoryTest0.settable(table15);
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory17 = slimTableFactoryTest0.getslimTableFactory();
        org.junit.Assert.assertNull(strMap5);
        org.junit.Assert.assertNull(slimTableFactory6);
        org.junit.Assert.assertNull(slimTableFactory7);
        org.junit.Assert.assertNull(strMap8);
        org.junit.Assert.assertNull(table9);
        org.junit.Assert.assertNull(table14);
        org.junit.Assert.assertNull(slimTableFactory17);
    }

    @Test
    public void test11099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11099");
        fitnesse.testsystems.slim.tables.SlimTableFactoryTest slimTableFactoryTest0 = new fitnesse.testsystems.slim.tables.SlimTableFactoryTest();
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory1 = slimTableFactoryTest0.slimTableFactory;
        fitnesse.testsystems.slim.Table table2 = slimTableFactoryTest0.table;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory3 = null;
        slimTableFactoryTest0.setslimTableFactory(slimTableFactory3);
        fitnesse.testsystems.slim.Table table5 = slimTableFactoryTest0.table;
        fitnesse.testsystems.slim.Table table6 = null;
        slimTableFactoryTest0.settable(table6);
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory8 = null;
        slimTableFactoryTest0.slimTableFactory = slimTableFactory8;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory10 = null;
        slimTableFactoryTest0.setslimTableFactory(slimTableFactory10);
        java.util.Map<java.lang.String, java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable>> strMap12 = slimTableFactoryTest0.map;
        // The following exception was thrown during execution in test generation
        try {
            slimTableFactoryTest0.tableTypeStartingWithcommentColonShouldReturnNull();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(slimTableFactory1);
        org.junit.Assert.assertNull(table2);
        org.junit.Assert.assertNull(table5);
        org.junit.Assert.assertNull(strMap12);
    }

    @Test
    public void test11100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11100");
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
        slimTableFactoryTest0.setslimTableFactory(slimTableFactory13);
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory15 = null;
        slimTableFactoryTest0.setslimTableFactory(slimTableFactory15);
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory17 = null;
        slimTableFactoryTest0.slimTableFactory = slimTableFactory17;
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
    public void test11101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11101");
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
        fitnesse.testsystems.slim.Table table11 = slimTableFactoryTest0.gettable();
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
        org.junit.Assert.assertNull(slimTableFactory3);
        org.junit.Assert.assertNull(table4);
        org.junit.Assert.assertNull(strMap5);
        org.junit.Assert.assertNull(table6);
        org.junit.Assert.assertNull(slimTableFactory7);
        org.junit.Assert.assertNull(slimTableFactory8);
        org.junit.Assert.assertNull(table11);
    }

    @Test
    public void test11102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11102");
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
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory11 = slimTableFactoryTest0.slimTableFactory;
        fitnesse.testsystems.slim.Table table12 = null;
        slimTableFactoryTest0.table = table12;
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
        org.junit.Assert.assertNull(table9);
        org.junit.Assert.assertNull(strMap10);
        org.junit.Assert.assertNull(slimTableFactory11);
    }

    @Test
    public void test11103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11103");
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
            slimTableFactoryTest0.commentTableShouldReturnNull();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(slimTableFactory9);
        org.junit.Assert.assertNull(slimTableFactory12);
    }

    @Test
    public void test11104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11104");
        fitnesse.testsystems.slim.tables.SlimTableFactoryTest slimTableFactoryTest0 = new fitnesse.testsystems.slim.tables.SlimTableFactoryTest();
        fitnesse.testsystems.slim.Table table1 = null;
        slimTableFactoryTest0.table = table1;
        fitnesse.testsystems.slim.Table table3 = null;
        slimTableFactoryTest0.settable(table3);
        java.util.Map<java.lang.String, java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable>> strMap5 = slimTableFactoryTest0.getmap();
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory6 = slimTableFactoryTest0.getslimTableFactory();
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory7 = null;
        slimTableFactoryTest0.setslimTableFactory(slimTableFactory7);
        fitnesse.testsystems.slim.Table table9 = slimTableFactoryTest0.table;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory10 = null;
        slimTableFactoryTest0.slimTableFactory = slimTableFactory10;
        fitnesse.testsystems.slim.Table table12 = slimTableFactoryTest0.gettable();
        fitnesse.testsystems.slim.Table table13 = slimTableFactoryTest0.gettable();
        // The following exception was thrown during execution in test generation
        try {
            slimTableFactoryTest0.shouldCreateCorrectSlimTableForTablesType();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(strMap5);
        org.junit.Assert.assertNull(slimTableFactory6);
        org.junit.Assert.assertNull(table9);
        org.junit.Assert.assertNull(table12);
        org.junit.Assert.assertNull(table13);
    }

    @Test
    public void test11105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11105");
        fitnesse.testsystems.slim.tables.SlimTableFactoryTest slimTableFactoryTest0 = new fitnesse.testsystems.slim.tables.SlimTableFactoryTest();
        fitnesse.testsystems.slim.Table table1 = null;
        slimTableFactoryTest0.table = table1;
        fitnesse.testsystems.slim.Table table3 = null;
        slimTableFactoryTest0.settable(table3);
        java.util.Map<java.lang.String, java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable>> strMap5 = slimTableFactoryTest0.map;
        java.util.Map<java.lang.String, java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable>> strMap6 = slimTableFactoryTest0.getmap();
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory7 = slimTableFactoryTest0.slimTableFactory;
        java.util.Map<java.lang.String, java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable>> strMap8 = slimTableFactoryTest0.map;
        java.util.Map<java.lang.String, java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable>> strMap9 = slimTableFactoryTest0.map;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory10 = slimTableFactoryTest0.getslimTableFactory();
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
        org.junit.Assert.assertNull(strMap9);
        org.junit.Assert.assertNull(slimTableFactory10);
    }

    @Test
    public void test11106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11106");
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
        java.util.Map<java.lang.String, java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable>> strMap12 = slimTableFactoryTest0.getmap();
        java.util.Map<java.lang.String, java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable>> strMap13 = slimTableFactoryTest0.map;
        org.junit.Assert.assertNull(slimTableFactory5);
        org.junit.Assert.assertNull(slimTableFactory8);
        org.junit.Assert.assertNull(table9);
        org.junit.Assert.assertNull(strMap12);
        org.junit.Assert.assertNull(strMap13);
    }

    @Test
    public void test11107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11107");
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
        fitnesse.testsystems.slim.Table table10 = slimTableFactoryTest0.table;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory11 = null;
        slimTableFactoryTest0.setslimTableFactory(slimTableFactory11);
        fitnesse.testsystems.slim.Table table13 = slimTableFactoryTest0.gettable();
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
        org.junit.Assert.assertNull(slimTableFactory7);
        org.junit.Assert.assertNull(table10);
        org.junit.Assert.assertNull(table13);
    }

    @Test
    public void test11108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11108");
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
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory10 = slimTableFactoryTest0.getslimTableFactory();
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory11 = slimTableFactoryTest0.getslimTableFactory();
        fitnesse.testsystems.slim.Table table12 = null;
        slimTableFactoryTest0.table = table12;
        fitnesse.testsystems.slim.Table table14 = null;
        slimTableFactoryTest0.settable(table14);
        // The following exception was thrown during execution in test generation
        try {
            slimTableFactoryTest0.tableTypeStartingWithcommentColonShouldReturnNull();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(slimTableFactory3);
        org.junit.Assert.assertNull(strMap4);
        org.junit.Assert.assertNull(table7);
        org.junit.Assert.assertNull(slimTableFactory10);
        org.junit.Assert.assertNull(slimTableFactory11);
    }

    @Test
    public void test11109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11109");
        fitnesse.testsystems.slim.tables.SlimTableFactoryTest slimTableFactoryTest0 = new fitnesse.testsystems.slim.tables.SlimTableFactoryTest();
        fitnesse.testsystems.slim.Table table1 = null;
        slimTableFactoryTest0.table = table1;
        fitnesse.testsystems.slim.Table table3 = null;
        slimTableFactoryTest0.settable(table3);
        fitnesse.testsystems.slim.Table table5 = null;
        slimTableFactoryTest0.settable(table5);
        fitnesse.testsystems.slim.Table table7 = slimTableFactoryTest0.table;
        java.util.Map<java.lang.String, java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable>> strMap8 = slimTableFactoryTest0.getmap();
        java.util.Map<java.lang.String, java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable>> strMap9 = slimTableFactoryTest0.map;
        fitnesse.testsystems.slim.Table table10 = slimTableFactoryTest0.gettable();
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory11 = slimTableFactoryTest0.getslimTableFactory();
        java.util.Map<java.lang.String, java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable>> strMap12 = slimTableFactoryTest0.getmap();
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory13 = slimTableFactoryTest0.slimTableFactory;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory14 = null;
        slimTableFactoryTest0.slimTableFactory = slimTableFactory14;
        org.junit.Assert.assertNull(table7);
        org.junit.Assert.assertNull(strMap8);
        org.junit.Assert.assertNull(strMap9);
        org.junit.Assert.assertNull(table10);
        org.junit.Assert.assertNull(slimTableFactory11);
        org.junit.Assert.assertNull(strMap12);
        org.junit.Assert.assertNull(slimTableFactory13);
    }

    @Test
    public void test11110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11110");
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
        java.util.Map<java.lang.String, java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable>> strMap10 = slimTableFactoryTest0.getmap();
        java.util.Map<java.lang.String, java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable>> strMap11 = slimTableFactoryTest0.getmap();
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory12 = slimTableFactoryTest0.slimTableFactory;
        fitnesse.testsystems.slim.Table table13 = null;
        slimTableFactoryTest0.table = table13;
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
        org.junit.Assert.assertNull(strMap10);
        org.junit.Assert.assertNull(strMap11);
        org.junit.Assert.assertNull(slimTableFactory12);
    }

    @Test
    public void test11111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11111");
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
        fitnesse.testsystems.slim.Table table12 = null;
        slimTableFactoryTest0.table = table12;
        fitnesse.testsystems.slim.Table table14 = null;
        slimTableFactoryTest0.table = table14;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory16 = null;
        slimTableFactoryTest0.slimTableFactory = slimTableFactory16;
        org.junit.Assert.assertNull(slimTableFactory1);
        org.junit.Assert.assertNull(table2);
        org.junit.Assert.assertNull(table9);
        org.junit.Assert.assertNull(slimTableFactory10);
        org.junit.Assert.assertNull(slimTableFactory11);
    }

    @Test
    public void test11112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11112");
        fitnesse.testsystems.slim.tables.SlimTableFactoryTest slimTableFactoryTest0 = new fitnesse.testsystems.slim.tables.SlimTableFactoryTest();
        fitnesse.testsystems.slim.Table table1 = null;
        slimTableFactoryTest0.table = table1;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory3 = slimTableFactoryTest0.slimTableFactory;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory4 = null;
        slimTableFactoryTest0.slimTableFactory = slimTableFactory4;
        fitnesse.testsystems.slim.Table table6 = slimTableFactoryTest0.gettable();
        fitnesse.testsystems.slim.Table table7 = null;
        slimTableFactoryTest0.table = table7;
        fitnesse.testsystems.slim.Table table9 = null;
        slimTableFactoryTest0.settable(table9);
        fitnesse.testsystems.slim.Table table11 = slimTableFactoryTest0.gettable();
        java.util.Map<java.lang.String, java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable>> strMap12 = slimTableFactoryTest0.map;
        // The following exception was thrown during execution in test generation
        try {
            slimTableFactoryTest0.commentTableShouldReturnNull();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(slimTableFactory3);
        org.junit.Assert.assertNull(table6);
        org.junit.Assert.assertNull(table11);
        org.junit.Assert.assertNull(strMap12);
    }

    @Test
    public void test11113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11113");
        fitnesse.testsystems.slim.tables.SlimTableFactoryTest slimTableFactoryTest0 = new fitnesse.testsystems.slim.tables.SlimTableFactoryTest();
        fitnesse.testsystems.slim.Table table1 = null;
        slimTableFactoryTest0.table = table1;
        fitnesse.testsystems.slim.Table table3 = slimTableFactoryTest0.table;
        fitnesse.testsystems.slim.Table table4 = slimTableFactoryTest0.gettable();
        java.util.Map<java.lang.String, java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable>> strMap5 = slimTableFactoryTest0.getmap();
        java.util.Map<java.lang.String, java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable>> strMap6 = slimTableFactoryTest0.map;
        fitnesse.testsystems.slim.Table table7 = slimTableFactoryTest0.table;
        java.util.Map<java.lang.String, java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable>> strMap8 = slimTableFactoryTest0.getmap();
        fitnesse.testsystems.slim.Table table9 = slimTableFactoryTest0.table;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass10 = table9.getClass();
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
        org.junit.Assert.assertNull(table9);
    }

    @Test
    public void test11114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11114");
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
        org.junit.Assert.assertNull(slimTableFactory11);
    }

    @Test
    public void test11115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11115");
        fitnesse.testsystems.slim.tables.SlimTableFactoryTest slimTableFactoryTest0 = new fitnesse.testsystems.slim.tables.SlimTableFactoryTest();
        fitnesse.testsystems.slim.Table table1 = null;
        slimTableFactoryTest0.table = table1;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory3 = slimTableFactoryTest0.slimTableFactory;
        java.util.Map<java.lang.String, java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable>> strMap4 = slimTableFactoryTest0.getmap();
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory5 = slimTableFactoryTest0.slimTableFactory;
        java.util.Map<java.lang.String, java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable>> strMap6 = slimTableFactoryTest0.map;
        java.util.Map<java.lang.String, java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable>> strMap7 = slimTableFactoryTest0.getmap();
        fitnesse.testsystems.slim.Table table8 = null;
        slimTableFactoryTest0.table = table8;
        fitnesse.testsystems.slim.Table table10 = null;
        slimTableFactoryTest0.settable(table10);
        org.junit.Assert.assertNull(slimTableFactory3);
        org.junit.Assert.assertNull(strMap4);
        org.junit.Assert.assertNull(slimTableFactory5);
        org.junit.Assert.assertNull(strMap6);
        org.junit.Assert.assertNull(strMap7);
    }

    @Test
    public void test11116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11116");
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
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory11 = null;
        slimTableFactoryTest0.slimTableFactory = slimTableFactory11;
        fitnesse.testsystems.slim.Table table13 = null;
        slimTableFactoryTest0.settable(table13);
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
        org.junit.Assert.assertNull(slimTableFactory10);
    }

    @Test
    public void test11117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11117");
        fitnesse.testsystems.slim.tables.SlimTableFactoryTest slimTableFactoryTest0 = new fitnesse.testsystems.slim.tables.SlimTableFactoryTest();
        fitnesse.testsystems.slim.Table table1 = null;
        slimTableFactoryTest0.table = table1;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory3 = slimTableFactoryTest0.slimTableFactory;
        java.util.Map<java.lang.String, java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable>> strMap4 = slimTableFactoryTest0.getmap();
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory5 = slimTableFactoryTest0.slimTableFactory;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory6 = null;
        slimTableFactoryTest0.setslimTableFactory(slimTableFactory6);
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory8 = slimTableFactoryTest0.getslimTableFactory();
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory9 = null;
        slimTableFactoryTest0.setslimTableFactory(slimTableFactory9);
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory11 = slimTableFactoryTest0.getslimTableFactory();
        fitnesse.testsystems.slim.Table table12 = null;
        slimTableFactoryTest0.settable(table12);
        fitnesse.testsystems.slim.Table table14 = null;
        slimTableFactoryTest0.settable(table14);
        java.util.Map<java.lang.String, java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable>> strMap16 = slimTableFactoryTest0.map;
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
        org.junit.Assert.assertNull(slimTableFactory8);
        org.junit.Assert.assertNull(slimTableFactory11);
        org.junit.Assert.assertNull(strMap16);
    }

    @Test
    public void test11118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11118");
        fitnesse.testsystems.slim.tables.SlimTableFactoryTest slimTableFactoryTest0 = new fitnesse.testsystems.slim.tables.SlimTableFactoryTest();
        fitnesse.testsystems.slim.Table table1 = null;
        slimTableFactoryTest0.table = table1;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory3 = slimTableFactoryTest0.slimTableFactory;
        java.util.Map<java.lang.String, java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable>> strMap4 = slimTableFactoryTest0.getmap();
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory5 = slimTableFactoryTest0.slimTableFactory;
        java.util.Map<java.lang.String, java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable>> strMap6 = slimTableFactoryTest0.getmap();
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory7 = slimTableFactoryTest0.slimTableFactory;
        java.util.Map<java.lang.String, java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable>> strMap8 = slimTableFactoryTest0.map;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory9 = null;
        slimTableFactoryTest0.setslimTableFactory(slimTableFactory9);
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
        org.junit.Assert.assertNull(strMap6);
        org.junit.Assert.assertNull(slimTableFactory7);
        org.junit.Assert.assertNull(strMap8);
    }

    @Test
    public void test11119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11119");
        fitnesse.testsystems.slim.tables.SlimTableFactoryTest slimTableFactoryTest0 = new fitnesse.testsystems.slim.tables.SlimTableFactoryTest();
        fitnesse.testsystems.slim.Table table1 = null;
        slimTableFactoryTest0.table = table1;
        fitnesse.testsystems.slim.Table table3 = slimTableFactoryTest0.table;
        fitnesse.testsystems.slim.Table table4 = slimTableFactoryTest0.gettable();
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory5 = slimTableFactoryTest0.getslimTableFactory();
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory6 = null;
        slimTableFactoryTest0.slimTableFactory = slimTableFactory6;
        java.util.Map<java.lang.String, java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable>> strMap8 = slimTableFactoryTest0.getmap();
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory9 = slimTableFactoryTest0.slimTableFactory;
        java.util.Map<java.lang.String, java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable>> strMap10 = slimTableFactoryTest0.getmap();
        org.junit.Assert.assertNull(table3);
        org.junit.Assert.assertNull(table4);
        org.junit.Assert.assertNull(slimTableFactory5);
        org.junit.Assert.assertNull(strMap8);
        org.junit.Assert.assertNull(slimTableFactory9);
        org.junit.Assert.assertNull(strMap10);
    }

    @Test
    public void test11120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11120");
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
        slimTableFactoryTest0.setslimTableFactory(slimTableFactory14);
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
    public void test11121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11121");
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
            slimTableFactoryTest0.addTableTypeImport("", "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(slimTableFactory3);
        org.junit.Assert.assertNull(slimTableFactory4);
        org.junit.Assert.assertNull(slimTableFactory7);
    }

    @Test
    public void test11122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11122");
        fitnesse.testsystems.slim.tables.SlimTableFactoryTest slimTableFactoryTest0 = new fitnesse.testsystems.slim.tables.SlimTableFactoryTest();
        fitnesse.testsystems.slim.Table table1 = null;
        slimTableFactoryTest0.table = table1;
        fitnesse.testsystems.slim.Table table3 = null;
        slimTableFactoryTest0.settable(table3);
        java.util.Map<java.lang.String, java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable>> strMap5 = slimTableFactoryTest0.map;
        java.util.Map<java.lang.String, java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable>> strMap6 = slimTableFactoryTest0.getmap();
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory7 = slimTableFactoryTest0.slimTableFactory;
        fitnesse.testsystems.slim.Table table8 = slimTableFactoryTest0.gettable();
        java.util.Map<java.lang.String, java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable>> strMap9 = slimTableFactoryTest0.map;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory10 = slimTableFactoryTest0.slimTableFactory;
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
        org.junit.Assert.assertNull(table8);
        org.junit.Assert.assertNull(strMap9);
        org.junit.Assert.assertNull(slimTableFactory10);
    }

    @Test
    public void test11123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11123");
        fitnesse.testsystems.slim.tables.SlimTableFactoryTest slimTableFactoryTest0 = new fitnesse.testsystems.slim.tables.SlimTableFactoryTest();
        fitnesse.testsystems.slim.Table table1 = null;
        slimTableFactoryTest0.table = table1;
        fitnesse.testsystems.slim.Table table3 = null;
        slimTableFactoryTest0.settable(table3);
        fitnesse.testsystems.slim.Table table5 = null;
        slimTableFactoryTest0.settable(table5);
        fitnesse.testsystems.slim.Table table7 = slimTableFactoryTest0.table;
        java.util.Map<java.lang.String, java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable>> strMap8 = slimTableFactoryTest0.getmap();
        java.util.Map<java.lang.String, java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable>> strMap9 = slimTableFactoryTest0.map;
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
        org.junit.Assert.assertNull(table7);
        org.junit.Assert.assertNull(strMap8);
        org.junit.Assert.assertNull(strMap9);
        org.junit.Assert.assertNull(table10);
    }

    @Test
    public void test11124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11124");
        fitnesse.testsystems.slim.tables.SlimTableFactoryTest slimTableFactoryTest0 = new fitnesse.testsystems.slim.tables.SlimTableFactoryTest();
        fitnesse.testsystems.slim.Table table1 = null;
        slimTableFactoryTest0.table = table1;
        fitnesse.testsystems.slim.Table table3 = slimTableFactoryTest0.gettable();
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory4 = slimTableFactoryTest0.getslimTableFactory();
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory5 = null;
        slimTableFactoryTest0.slimTableFactory = slimTableFactory5;
        fitnesse.testsystems.slim.Table table7 = slimTableFactoryTest0.table;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory8 = null;
        slimTableFactoryTest0.setslimTableFactory(slimTableFactory8);
        fitnesse.testsystems.slim.Table table10 = slimTableFactoryTest0.table;
        fitnesse.testsystems.slim.Table table11 = slimTableFactoryTest0.gettable();
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory12 = slimTableFactoryTest0.slimTableFactory;
        java.util.Map<java.lang.String, java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable>> strMap13 = slimTableFactoryTest0.map;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory14 = slimTableFactoryTest0.getslimTableFactory();
        // The following exception was thrown during execution in test generation
        try {
            slimTableFactoryTest0.tableTypeStartingWithcommentColonShouldReturnNull();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(table3);
        org.junit.Assert.assertNull(slimTableFactory4);
        org.junit.Assert.assertNull(table7);
        org.junit.Assert.assertNull(table10);
        org.junit.Assert.assertNull(table11);
        org.junit.Assert.assertNull(slimTableFactory12);
        org.junit.Assert.assertNull(strMap13);
        org.junit.Assert.assertNull(slimTableFactory14);
    }

    @Test
    public void test11125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11125");
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
        java.util.Map<java.lang.String, java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable>> strMap16 = slimTableFactoryTest0.getmap();
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory17 = slimTableFactoryTest0.slimTableFactory;
        java.util.Map<java.lang.String, java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable>> strMap18 = slimTableFactoryTest0.getmap();
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
        org.junit.Assert.assertNull(strMap16);
        org.junit.Assert.assertNull(slimTableFactory17);
        org.junit.Assert.assertNull(strMap18);
    }

    @Test
    public void test11126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11126");
        fitnesse.testsystems.slim.tables.SlimTableFactoryTest slimTableFactoryTest0 = new fitnesse.testsystems.slim.tables.SlimTableFactoryTest();
        fitnesse.testsystems.slim.Table table1 = null;
        slimTableFactoryTest0.table = table1;
        fitnesse.testsystems.slim.Table table3 = null;
        slimTableFactoryTest0.settable(table3);
        java.util.Map<java.lang.String, java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable>> strMap5 = slimTableFactoryTest0.map;
        java.util.Map<java.lang.String, java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable>> strMap6 = slimTableFactoryTest0.getmap();
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory7 = slimTableFactoryTest0.slimTableFactory;
        fitnesse.testsystems.slim.Table table8 = slimTableFactoryTest0.gettable();
        java.util.Map<java.lang.String, java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable>> strMap9 = slimTableFactoryTest0.getmap();
        fitnesse.testsystems.slim.Table table10 = null;
        slimTableFactoryTest0.table = table10;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory12 = slimTableFactoryTest0.slimTableFactory;
        java.util.Map<java.lang.String, java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable>> strMap13 = slimTableFactoryTest0.map;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory14 = null;
        slimTableFactoryTest0.setslimTableFactory(slimTableFactory14);
        org.junit.Assert.assertNull(strMap5);
        org.junit.Assert.assertNull(strMap6);
        org.junit.Assert.assertNull(slimTableFactory7);
        org.junit.Assert.assertNull(table8);
        org.junit.Assert.assertNull(strMap9);
        org.junit.Assert.assertNull(slimTableFactory12);
        org.junit.Assert.assertNull(strMap13);
    }

    @Test
    public void test11127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11127");
        fitnesse.testsystems.slim.tables.SlimTableFactoryTest slimTableFactoryTest0 = new fitnesse.testsystems.slim.tables.SlimTableFactoryTest();
        fitnesse.testsystems.slim.Table table1 = null;
        slimTableFactoryTest0.table = table1;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory3 = null;
        slimTableFactoryTest0.setslimTableFactory(slimTableFactory3);
        fitnesse.testsystems.slim.Table table5 = slimTableFactoryTest0.table;
        fitnesse.testsystems.slim.Table table6 = slimTableFactoryTest0.table;
        fitnesse.testsystems.slim.Table table7 = null;
        slimTableFactoryTest0.settable(table7);
        org.junit.Assert.assertNull(table5);
        org.junit.Assert.assertNull(table6);
    }

    @Test
    public void test11128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11128");
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
        fitnesse.testsystems.slim.Table table11 = null;
        slimTableFactoryTest0.table = table11;
        fitnesse.testsystems.slim.Table table13 = null;
        slimTableFactoryTest0.table = table13;
        org.junit.Assert.assertNull(strMap5);
        org.junit.Assert.assertNull(strMap6);
        org.junit.Assert.assertNull(slimTableFactory7);
        org.junit.Assert.assertNull(table8);
    }

    @Test
    public void test11129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11129");
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
        slimTableFactoryTest0.slimTableFactory = slimTableFactory11;
        java.util.Map<java.lang.String, java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable>> strMap13 = slimTableFactoryTest0.map;
        // The following exception was thrown during execution in test generation
        try {
            slimTableFactoryTest0.addTableTypeImport("", "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(strMap13);
    }

    @Test
    public void test11130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11130");
        fitnesse.testsystems.slim.tables.SlimTableFactoryTest slimTableFactoryTest0 = new fitnesse.testsystems.slim.tables.SlimTableFactoryTest();
        fitnesse.testsystems.slim.Table table1 = slimTableFactoryTest0.table;
        java.util.Map<java.lang.String, java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable>> strMap2 = slimTableFactoryTest0.getmap();
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory3 = slimTableFactoryTest0.slimTableFactory;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory4 = slimTableFactoryTest0.getslimTableFactory();
        java.util.Map<java.lang.String, java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable>> strMap5 = slimTableFactoryTest0.getmap();
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory6 = null;
        slimTableFactoryTest0.setslimTableFactory(slimTableFactory6);
        java.util.Map<java.lang.String, java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable>> strMap8 = slimTableFactoryTest0.map;
        fitnesse.testsystems.slim.Table table9 = slimTableFactoryTest0.gettable();
        fitnesse.testsystems.slim.Table table10 = null;
        slimTableFactoryTest0.table = table10;
        org.junit.Assert.assertNull(table1);
        org.junit.Assert.assertNull(strMap2);
        org.junit.Assert.assertNull(slimTableFactory3);
        org.junit.Assert.assertNull(slimTableFactory4);
        org.junit.Assert.assertNull(strMap5);
        org.junit.Assert.assertNull(strMap8);
        org.junit.Assert.assertNull(table9);
    }

    @Test
    public void test11131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11131");
        fitnesse.testsystems.slim.tables.SlimTableFactoryTest slimTableFactoryTest0 = new fitnesse.testsystems.slim.tables.SlimTableFactoryTest();
        fitnesse.testsystems.slim.Table table1 = null;
        slimTableFactoryTest0.table = table1;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory3 = slimTableFactoryTest0.slimTableFactory;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory4 = null;
        slimTableFactoryTest0.slimTableFactory = slimTableFactory4;
        java.util.Map<java.lang.String, java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable>> strMap6 = slimTableFactoryTest0.map;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory7 = slimTableFactoryTest0.getslimTableFactory();
        fitnesse.testsystems.slim.Table table8 = slimTableFactoryTest0.gettable();
        fitnesse.testsystems.slim.Table table9 = slimTableFactoryTest0.table;
        java.lang.Class<?> wildcardClass10 = slimTableFactoryTest0.getClass();
        org.junit.Assert.assertNull(slimTableFactory3);
        org.junit.Assert.assertNull(strMap6);
        org.junit.Assert.assertNull(slimTableFactory7);
        org.junit.Assert.assertNull(table8);
        org.junit.Assert.assertNull(table9);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test11132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11132");
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
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory15 = null;
        slimTableFactoryTest0.slimTableFactory = slimTableFactory15;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory17 = slimTableFactoryTest0.getslimTableFactory();
        org.junit.Assert.assertNull(slimTableFactory3);
        org.junit.Assert.assertNull(strMap4);
        org.junit.Assert.assertNull(slimTableFactory17);
    }

    @Test
    public void test11133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11133");
        fitnesse.testsystems.slim.tables.SlimTableFactoryTest slimTableFactoryTest0 = new fitnesse.testsystems.slim.tables.SlimTableFactoryTest();
        fitnesse.testsystems.slim.Table table1 = null;
        slimTableFactoryTest0.table = table1;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory3 = slimTableFactoryTest0.getslimTableFactory();
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory4 = slimTableFactoryTest0.getslimTableFactory();
        fitnesse.testsystems.slim.Table table5 = null;
        slimTableFactoryTest0.table = table5;
        fitnesse.testsystems.slim.Table table7 = null;
        slimTableFactoryTest0.table = table7;
        fitnesse.testsystems.slim.Table table9 = slimTableFactoryTest0.table;
        org.junit.Assert.assertNull(slimTableFactory3);
        org.junit.Assert.assertNull(slimTableFactory4);
        org.junit.Assert.assertNull(table9);
    }

    @Test
    public void test11134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11134");
        fitnesse.testsystems.slim.tables.SlimTableFactoryTest slimTableFactoryTest0 = new fitnesse.testsystems.slim.tables.SlimTableFactoryTest();
        fitnesse.testsystems.slim.Table table1 = slimTableFactoryTest0.table;
        fitnesse.testsystems.slim.Table table2 = null;
        slimTableFactoryTest0.table = table2;
        fitnesse.testsystems.slim.Table table4 = slimTableFactoryTest0.gettable();
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory5 = null;
        slimTableFactoryTest0.setslimTableFactory(slimTableFactory5);
        fitnesse.testsystems.slim.Table table7 = slimTableFactoryTest0.gettable();
        fitnesse.testsystems.slim.Table table8 = null;
        slimTableFactoryTest0.settable(table8);
        // The following exception was thrown during execution in test generation
        try {
            slimTableFactoryTest0.tableTypeStartingWithcommentColonShouldReturnNull();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(table1);
        org.junit.Assert.assertNull(table4);
        org.junit.Assert.assertNull(table7);
    }

    @Test
    public void test11135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11135");
        fitnesse.testsystems.slim.tables.SlimTableFactoryTest slimTableFactoryTest0 = new fitnesse.testsystems.slim.tables.SlimTableFactoryTest();
        fitnesse.testsystems.slim.Table table1 = null;
        slimTableFactoryTest0.table = table1;
        fitnesse.testsystems.slim.Table table3 = null;
        slimTableFactoryTest0.settable(table3);
        java.util.Map<java.lang.String, java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable>> strMap5 = slimTableFactoryTest0.map;
        java.util.Map<java.lang.String, java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable>> strMap6 = slimTableFactoryTest0.getmap();
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory7 = slimTableFactoryTest0.slimTableFactory;
        java.util.Map<java.lang.String, java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable>> strMap8 = slimTableFactoryTest0.map;
        java.util.Map<java.lang.String, java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable>> strMap9 = slimTableFactoryTest0.map;
        java.util.Map<java.lang.String, java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable>> strMap10 = slimTableFactoryTest0.getmap();
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory11 = slimTableFactoryTest0.slimTableFactory;
        fitnesse.testsystems.slim.Table table12 = slimTableFactoryTest0.table;
        fitnesse.testsystems.slim.Table table13 = slimTableFactoryTest0.table;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory14 = slimTableFactoryTest0.slimTableFactory;
        org.junit.Assert.assertNull(strMap5);
        org.junit.Assert.assertNull(strMap6);
        org.junit.Assert.assertNull(slimTableFactory7);
        org.junit.Assert.assertNull(strMap8);
        org.junit.Assert.assertNull(strMap9);
        org.junit.Assert.assertNull(strMap10);
        org.junit.Assert.assertNull(slimTableFactory11);
        org.junit.Assert.assertNull(table12);
        org.junit.Assert.assertNull(table13);
        org.junit.Assert.assertNull(slimTableFactory14);
    }

    @Test
    public void test11136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11136");
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
        fitnesse.testsystems.slim.Table table12 = slimTableFactoryTest0.table;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory13 = slimTableFactoryTest0.getslimTableFactory();
        java.util.Map<java.lang.String, java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable>> strMap14 = slimTableFactoryTest0.map;
        org.junit.Assert.assertNull(slimTableFactory7);
        org.junit.Assert.assertNull(slimTableFactory8);
        org.junit.Assert.assertNull(table9);
        org.junit.Assert.assertNull(table12);
        org.junit.Assert.assertNull(slimTableFactory13);
        org.junit.Assert.assertNull(strMap14);
    }

    @Test
    public void test11137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11137");
        fitnesse.testsystems.slim.tables.SlimTableFactoryTest slimTableFactoryTest0 = new fitnesse.testsystems.slim.tables.SlimTableFactoryTest();
        fitnesse.testsystems.slim.Table table1 = null;
        slimTableFactoryTest0.table = table1;
        fitnesse.testsystems.slim.Table table3 = null;
        slimTableFactoryTest0.settable(table3);
        java.util.Map<java.lang.String, java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable>> strMap5 = slimTableFactoryTest0.getmap();
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory6 = slimTableFactoryTest0.getslimTableFactory();
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory7 = null;
        slimTableFactoryTest0.slimTableFactory = slimTableFactory7;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory9 = slimTableFactoryTest0.slimTableFactory;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory10 = null;
        slimTableFactoryTest0.setslimTableFactory(slimTableFactory10);
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory12 = null;
        slimTableFactoryTest0.slimTableFactory = slimTableFactory12;
        fitnesse.testsystems.slim.Table table14 = slimTableFactoryTest0.table;
        fitnesse.testsystems.slim.Table table15 = null;
        slimTableFactoryTest0.table = table15;
        org.junit.Assert.assertNull(strMap5);
        org.junit.Assert.assertNull(slimTableFactory6);
        org.junit.Assert.assertNull(slimTableFactory9);
        org.junit.Assert.assertNull(table14);
    }

    @Test
    public void test11138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11138");
        fitnesse.testsystems.slim.tables.SlimTableFactoryTest slimTableFactoryTest0 = new fitnesse.testsystems.slim.tables.SlimTableFactoryTest();
        fitnesse.testsystems.slim.Table table1 = null;
        slimTableFactoryTest0.table = table1;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory3 = slimTableFactoryTest0.getslimTableFactory();
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory4 = slimTableFactoryTest0.slimTableFactory;
        fitnesse.testsystems.slim.Table table5 = slimTableFactoryTest0.table;
        java.util.Map<java.lang.String, java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable>> strMap6 = slimTableFactoryTest0.getmap();
        fitnesse.testsystems.slim.Table table7 = null;
        slimTableFactoryTest0.settable(table7);
        fitnesse.testsystems.slim.Table table9 = null;
        slimTableFactoryTest0.table = table9;
        org.junit.Assert.assertNull(slimTableFactory3);
        org.junit.Assert.assertNull(slimTableFactory4);
        org.junit.Assert.assertNull(table5);
        org.junit.Assert.assertNull(strMap6);
    }

    @Test
    public void test11139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11139");
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
        slimTableFactoryTest0.settable(table14);
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
    }

    @Test
    public void test11140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11140");
        fitnesse.testsystems.slim.tables.SlimTableFactoryTest slimTableFactoryTest0 = new fitnesse.testsystems.slim.tables.SlimTableFactoryTest();
        fitnesse.testsystems.slim.Table table1 = null;
        slimTableFactoryTest0.table = table1;
        fitnesse.testsystems.slim.Table table3 = null;
        slimTableFactoryTest0.settable(table3);
        fitnesse.testsystems.slim.Table table5 = null;
        slimTableFactoryTest0.settable(table5);
        fitnesse.testsystems.slim.Table table7 = slimTableFactoryTest0.table;
        java.util.Map<java.lang.String, java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable>> strMap8 = slimTableFactoryTest0.getmap();
        java.util.Map<java.lang.String, java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable>> strMap9 = slimTableFactoryTest0.map;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory10 = null;
        slimTableFactoryTest0.slimTableFactory = slimTableFactory10;
        // The following exception was thrown during execution in test generation
        try {
            slimTableFactoryTest0.tableTypeStartingWithcommentColonShouldReturnNull();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(table7);
        org.junit.Assert.assertNull(strMap8);
        org.junit.Assert.assertNull(strMap9);
    }

    @Test
    public void test11141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11141");
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
        slimTableFactoryTest0.slimTableFactory = slimTableFactory11;
        java.util.Map<java.lang.String, java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable>> strMap13 = slimTableFactoryTest0.getmap();
        fitnesse.testsystems.slim.Table table14 = null;
        slimTableFactoryTest0.table = table14;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory16 = null;
        slimTableFactoryTest0.slimTableFactory = slimTableFactory16;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory18 = null;
        slimTableFactoryTest0.setslimTableFactory(slimTableFactory18);
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory20 = null;
        slimTableFactoryTest0.setslimTableFactory(slimTableFactory20);
        fitnesse.testsystems.slim.Table table22 = slimTableFactoryTest0.gettable();
        org.junit.Assert.assertNull(strMap13);
        org.junit.Assert.assertNull(table22);
    }

    @Test
    public void test11142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11142");
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
        fitnesse.testsystems.slim.Table table11 = slimTableFactoryTest0.table;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory12 = null;
        slimTableFactoryTest0.slimTableFactory = slimTableFactory12;
        fitnesse.testsystems.slim.Table table14 = null;
        slimTableFactoryTest0.table = table14;
        java.lang.Class<?> wildcardClass16 = slimTableFactoryTest0.getClass();
        org.junit.Assert.assertNull(slimTableFactory3);
        org.junit.Assert.assertNull(strMap4);
        org.junit.Assert.assertNull(slimTableFactory5);
        org.junit.Assert.assertNull(slimTableFactory6);
        org.junit.Assert.assertNull(slimTableFactory9);
        org.junit.Assert.assertNull(table10);
        org.junit.Assert.assertNull(table11);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test11143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11143");
        fitnesse.testsystems.slim.tables.SlimTableFactoryTest slimTableFactoryTest0 = new fitnesse.testsystems.slim.tables.SlimTableFactoryTest();
        fitnesse.testsystems.slim.Table table1 = null;
        slimTableFactoryTest0.table = table1;
        fitnesse.testsystems.slim.Table table3 = null;
        slimTableFactoryTest0.settable(table3);
        java.util.Map<java.lang.String, java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable>> strMap5 = slimTableFactoryTest0.getmap();
        java.util.Map<java.lang.String, java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable>> strMap6 = slimTableFactoryTest0.map;
        fitnesse.testsystems.slim.Table table7 = null;
        slimTableFactoryTest0.table = table7;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory9 = slimTableFactoryTest0.getslimTableFactory();
        java.util.Map<java.lang.String, java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable>> strMap10 = slimTableFactoryTest0.map;
        java.util.Map<java.lang.String, java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable>> strMap11 = slimTableFactoryTest0.getmap();
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory12 = slimTableFactoryTest0.getslimTableFactory();
        fitnesse.testsystems.slim.Table table13 = slimTableFactoryTest0.gettable();
        // The following exception was thrown during execution in test generation
        try {
            slimTableFactoryTest0.tableTypeStartingWithcommentColonShouldReturnNull();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(strMap5);
        org.junit.Assert.assertNull(strMap6);
        org.junit.Assert.assertNull(slimTableFactory9);
        org.junit.Assert.assertNull(strMap10);
        org.junit.Assert.assertNull(strMap11);
        org.junit.Assert.assertNull(slimTableFactory12);
        org.junit.Assert.assertNull(table13);
    }

    @Test
    public void test11144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11144");
        fitnesse.testsystems.slim.tables.SlimTableFactoryTest slimTableFactoryTest0 = new fitnesse.testsystems.slim.tables.SlimTableFactoryTest();
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory1 = slimTableFactoryTest0.slimTableFactory;
        fitnesse.testsystems.slim.Table table2 = slimTableFactoryTest0.gettable();
        java.util.Map<java.lang.String, java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable>> strMap3 = slimTableFactoryTest0.map;
        fitnesse.testsystems.slim.Table table4 = null;
        slimTableFactoryTest0.settable(table4);
        java.util.Map<java.lang.String, java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable>> strMap6 = slimTableFactoryTest0.map;
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
        org.junit.Assert.assertNull(strMap6);
    }

    @Test
    public void test11145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11145");
        fitnesse.testsystems.slim.tables.SlimTableFactoryTest slimTableFactoryTest0 = new fitnesse.testsystems.slim.tables.SlimTableFactoryTest();
        fitnesse.testsystems.slim.Table table1 = null;
        slimTableFactoryTest0.table = table1;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory3 = slimTableFactoryTest0.slimTableFactory;
        java.util.Map<java.lang.String, java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable>> strMap4 = slimTableFactoryTest0.getmap();
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory5 = slimTableFactoryTest0.slimTableFactory;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory6 = slimTableFactoryTest0.getslimTableFactory();
        fitnesse.testsystems.slim.Table table7 = slimTableFactoryTest0.gettable();
        fitnesse.testsystems.slim.Table table8 = null;
        slimTableFactoryTest0.table = table8;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory10 = slimTableFactoryTest0.slimTableFactory;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory11 = slimTableFactoryTest0.slimTableFactory;
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
        org.junit.Assert.assertNull(table7);
        org.junit.Assert.assertNull(slimTableFactory10);
        org.junit.Assert.assertNull(slimTableFactory11);
    }

    @Test
    public void test11146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11146");
        fitnesse.testsystems.slim.tables.SlimTableFactoryTest slimTableFactoryTest0 = new fitnesse.testsystems.slim.tables.SlimTableFactoryTest();
        fitnesse.testsystems.slim.Table table1 = slimTableFactoryTest0.table;
        java.util.Map<java.lang.String, java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable>> strMap2 = slimTableFactoryTest0.getmap();
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory3 = slimTableFactoryTest0.slimTableFactory;
        fitnesse.testsystems.slim.Table table4 = slimTableFactoryTest0.gettable();
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory5 = slimTableFactoryTest0.getslimTableFactory();
        java.util.Map<java.lang.String, java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable>> strMap6 = slimTableFactoryTest0.getmap();
        java.util.Map<java.lang.String, java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable>> strMap7 = slimTableFactoryTest0.getmap();
        fitnesse.testsystems.slim.Table table8 = null;
        slimTableFactoryTest0.settable(table8);
        org.junit.Assert.assertNull(table1);
        org.junit.Assert.assertNull(strMap2);
        org.junit.Assert.assertNull(slimTableFactory3);
        org.junit.Assert.assertNull(table4);
        org.junit.Assert.assertNull(slimTableFactory5);
        org.junit.Assert.assertNull(strMap6);
        org.junit.Assert.assertNull(strMap7);
    }

    @Test
    public void test11147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11147");
        fitnesse.testsystems.slim.tables.SlimTableFactoryTest slimTableFactoryTest0 = new fitnesse.testsystems.slim.tables.SlimTableFactoryTest();
        fitnesse.testsystems.slim.Table table1 = null;
        slimTableFactoryTest0.table = table1;
        fitnesse.testsystems.slim.Table table3 = slimTableFactoryTest0.table;
        fitnesse.testsystems.slim.Table table4 = slimTableFactoryTest0.gettable();
        java.util.Map<java.lang.String, java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable>> strMap5 = slimTableFactoryTest0.getmap();
        fitnesse.testsystems.slim.Table table6 = slimTableFactoryTest0.gettable();
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
        org.junit.Assert.assertNull(table6);
    }

    @Test
    public void test11148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11148");
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
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory11 = slimTableFactoryTest0.slimTableFactory;
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
    public void test11149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11149");
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
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory11 = null;
        slimTableFactoryTest0.slimTableFactory = slimTableFactory11;
        fitnesse.testsystems.slim.Table table13 = slimTableFactoryTest0.gettable();
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory14 = slimTableFactoryTest0.slimTableFactory;
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
        org.junit.Assert.assertNull(slimTableFactory5);
        org.junit.Assert.assertNull(slimTableFactory6);
        org.junit.Assert.assertNull(table13);
        org.junit.Assert.assertNull(slimTableFactory14);
    }

    @Test
    public void test11150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11150");
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
        fitnesse.testsystems.slim.Table table14 = null;
        slimTableFactoryTest0.settable(table14);
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
        org.junit.Assert.assertNull(table12);
        org.junit.Assert.assertNull(strMap13);
    }

    @Test
    public void test11151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11151");
        fitnesse.testsystems.slim.tables.SlimTableFactoryTest slimTableFactoryTest0 = new fitnesse.testsystems.slim.tables.SlimTableFactoryTest();
        fitnesse.testsystems.slim.Table table1 = slimTableFactoryTest0.table;
        java.util.Map<java.lang.String, java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable>> strMap2 = slimTableFactoryTest0.getmap();
        java.util.Map<java.lang.String, java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable>> strMap3 = slimTableFactoryTest0.getmap();
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory4 = slimTableFactoryTest0.slimTableFactory;
        fitnesse.testsystems.slim.Table table5 = null;
        slimTableFactoryTest0.table = table5;
        java.util.Map<java.lang.String, java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable>> strMap7 = slimTableFactoryTest0.map;
        fitnesse.testsystems.slim.Table table8 = slimTableFactoryTest0.gettable();
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
        org.junit.Assert.assertNull(table1);
        org.junit.Assert.assertNull(strMap2);
        org.junit.Assert.assertNull(strMap3);
        org.junit.Assert.assertNull(slimTableFactory4);
        org.junit.Assert.assertNull(strMap7);
        org.junit.Assert.assertNull(table8);
        org.junit.Assert.assertNull(slimTableFactory9);
    }

    @Test
    public void test11152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11152");
        fitnesse.testsystems.slim.tables.SlimTableFactoryTest slimTableFactoryTest0 = new fitnesse.testsystems.slim.tables.SlimTableFactoryTest();
        fitnesse.testsystems.slim.Table table1 = null;
        slimTableFactoryTest0.table = table1;
        fitnesse.testsystems.slim.Table table3 = null;
        slimTableFactoryTest0.settable(table3);
        java.util.Map<java.lang.String, java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable>> strMap5 = slimTableFactoryTest0.getmap();
        java.util.Map<java.lang.String, java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable>> strMap6 = slimTableFactoryTest0.map;
        fitnesse.testsystems.slim.Table table7 = null;
        slimTableFactoryTest0.table = table7;
        fitnesse.testsystems.slim.Table table9 = slimTableFactoryTest0.gettable();
        org.junit.Assert.assertNull(strMap5);
        org.junit.Assert.assertNull(strMap6);
        org.junit.Assert.assertNull(table9);
    }

    @Test
    public void test11153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11153");
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
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory11 = null;
        slimTableFactoryTest0.slimTableFactory = slimTableFactory11;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory13 = slimTableFactoryTest0.slimTableFactory;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory14 = slimTableFactoryTest0.slimTableFactory;
        fitnesse.testsystems.slim.Table table15 = slimTableFactoryTest0.gettable();
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory16 = slimTableFactoryTest0.slimTableFactory;
        fitnesse.testsystems.slim.Table table17 = slimTableFactoryTest0.gettable();
        java.util.Map<java.lang.String, java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable>> strMap18 = slimTableFactoryTest0.map;
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
        org.junit.Assert.assertNull(table8);
        org.junit.Assert.assertNull(slimTableFactory9);
        org.junit.Assert.assertNull(slimTableFactory10);
        org.junit.Assert.assertNull(slimTableFactory13);
        org.junit.Assert.assertNull(slimTableFactory14);
        org.junit.Assert.assertNull(table15);
        org.junit.Assert.assertNull(slimTableFactory16);
        org.junit.Assert.assertNull(table17);
        org.junit.Assert.assertNull(strMap18);
    }

    @Test
    public void test11154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11154");
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
        java.util.Map<java.lang.String, java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable>> strMap10 = slimTableFactoryTest0.getmap();
        fitnesse.testsystems.slim.Table table11 = null;
        slimTableFactoryTest0.settable(table11);
        fitnesse.testsystems.slim.Table table13 = null;
        slimTableFactoryTest0.settable(table13);
        java.util.Map<java.lang.String, java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable>> strMap15 = slimTableFactoryTest0.getmap();
        fitnesse.testsystems.slim.Table table16 = slimTableFactoryTest0.table;
        fitnesse.testsystems.slim.Table table17 = slimTableFactoryTest0.gettable();
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
        org.junit.Assert.assertNull(strMap10);
        org.junit.Assert.assertNull(strMap15);
        org.junit.Assert.assertNull(table16);
        org.junit.Assert.assertNull(table17);
    }

    @Test
    public void test11155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11155");
        fitnesse.testsystems.slim.tables.SlimTableFactoryTest slimTableFactoryTest0 = new fitnesse.testsystems.slim.tables.SlimTableFactoryTest();
        fitnesse.testsystems.slim.Table table1 = null;
        slimTableFactoryTest0.table = table1;
        fitnesse.testsystems.slim.Table table3 = null;
        slimTableFactoryTest0.settable(table3);
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory5 = slimTableFactoryTest0.slimTableFactory;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory6 = slimTableFactoryTest0.getslimTableFactory();
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory7 = null;
        slimTableFactoryTest0.setslimTableFactory(slimTableFactory7);
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory9 = null;
        slimTableFactoryTest0.setslimTableFactory(slimTableFactory9);
        fitnesse.testsystems.slim.Table table11 = slimTableFactoryTest0.table;
        fitnesse.testsystems.slim.Table table12 = slimTableFactoryTest0.table;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory13 = null;
        slimTableFactoryTest0.slimTableFactory = slimTableFactory13;
        fitnesse.testsystems.slim.Table table15 = slimTableFactoryTest0.table;
        org.junit.Assert.assertNull(slimTableFactory5);
        org.junit.Assert.assertNull(slimTableFactory6);
        org.junit.Assert.assertNull(table11);
        org.junit.Assert.assertNull(table12);
        org.junit.Assert.assertNull(table15);
    }

    @Test
    public void test11156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11156");
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
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory11 = slimTableFactoryTest0.slimTableFactory;
        fitnesse.testsystems.slim.Table table12 = slimTableFactoryTest0.table;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass13 = table12.getClass();
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
        org.junit.Assert.assertNull(slimTableFactory11);
        org.junit.Assert.assertNull(table12);
    }

    @Test
    public void test11157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11157");
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
        fitnesse.testsystems.slim.Table table11 = null;
        slimTableFactoryTest0.settable(table11);
        fitnesse.testsystems.slim.Table table13 = slimTableFactoryTest0.table;
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
        org.junit.Assert.assertNull(slimTableFactory7);
        org.junit.Assert.assertNull(strMap10);
        org.junit.Assert.assertNull(table13);
    }

    @Test
    public void test11158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11158");
        fitnesse.testsystems.slim.tables.SlimTableFactoryTest slimTableFactoryTest0 = new fitnesse.testsystems.slim.tables.SlimTableFactoryTest();
        fitnesse.testsystems.slim.Table table1 = null;
        slimTableFactoryTest0.table = table1;
        fitnesse.testsystems.slim.Table table3 = null;
        slimTableFactoryTest0.settable(table3);
        fitnesse.testsystems.slim.Table table5 = null;
        slimTableFactoryTest0.settable(table5);
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory7 = slimTableFactoryTest0.slimTableFactory;
        fitnesse.testsystems.slim.Table table8 = slimTableFactoryTest0.gettable();
        fitnesse.testsystems.slim.Table table9 = slimTableFactoryTest0.gettable();
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory10 = slimTableFactoryTest0.slimTableFactory;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory11 = null;
        slimTableFactoryTest0.slimTableFactory = slimTableFactory11;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory13 = slimTableFactoryTest0.slimTableFactory;
        java.util.Map<java.lang.String, java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable>> strMap14 = slimTableFactoryTest0.getmap();
        // The following exception was thrown during execution in test generation
        try {
            slimTableFactoryTest0.checkTableTypeDefinesIgnoredIfDifferentSpecified();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(slimTableFactory7);
        org.junit.Assert.assertNull(table8);
        org.junit.Assert.assertNull(table9);
        org.junit.Assert.assertNull(slimTableFactory10);
        org.junit.Assert.assertNull(slimTableFactory13);
        org.junit.Assert.assertNull(strMap14);
    }

    @Test
    public void test11159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11159");
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
        java.util.Map<java.lang.String, java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable>> strMap15 = slimTableFactoryTest0.getmap();
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory16 = slimTableFactoryTest0.slimTableFactory;
        java.util.Map<java.lang.String, java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable>> strMap17 = slimTableFactoryTest0.map;
        // The following exception was thrown during execution in test generation
        try {
            slimTableFactoryTest0.checkTableTypeDefineUsedForTable();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(slimTableFactory1);
        org.junit.Assert.assertNull(table2);
        org.junit.Assert.assertNull(strMap15);
        org.junit.Assert.assertNull(slimTableFactory16);
        org.junit.Assert.assertNull(strMap17);
    }

    @Test
    public void test11160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11160");
        fitnesse.testsystems.slim.tables.SlimTableFactoryTest slimTableFactoryTest0 = new fitnesse.testsystems.slim.tables.SlimTableFactoryTest();
        fitnesse.testsystems.slim.Table table1 = slimTableFactoryTest0.table;
        java.util.Map<java.lang.String, java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable>> strMap2 = slimTableFactoryTest0.getmap();
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory3 = null;
        slimTableFactoryTest0.slimTableFactory = slimTableFactory3;
        fitnesse.testsystems.slim.Table table5 = slimTableFactoryTest0.gettable();
        java.util.Map<java.lang.String, java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable>> strMap6 = slimTableFactoryTest0.map;
        // The following exception was thrown during execution in test generation
        try {
            slimTableFactoryTest0.addTableTypeImport("", "hi!");
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
    public void test11161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11161");
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
        java.util.Map<java.lang.String, java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable>> strMap11 = slimTableFactoryTest0.map;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory12 = null;
        slimTableFactoryTest0.slimTableFactory = slimTableFactory12;
        java.util.Map<java.lang.String, java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable>> strMap14 = slimTableFactoryTest0.getmap();
        fitnesse.testsystems.slim.Table table15 = null;
        slimTableFactoryTest0.table = table15;
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
        org.junit.Assert.assertNull(strMap11);
        org.junit.Assert.assertNull(strMap14);
    }

    @Test
    public void test11162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11162");
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
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory11 = slimTableFactoryTest0.slimTableFactory;
        java.util.Map<java.lang.String, java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable>> strMap12 = slimTableFactoryTest0.getmap();
        fitnesse.testsystems.slim.Table table13 = slimTableFactoryTest0.gettable();
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
        org.junit.Assert.assertNull(table10);
        org.junit.Assert.assertNull(slimTableFactory11);
        org.junit.Assert.assertNull(strMap12);
        org.junit.Assert.assertNull(table13);
    }

    @Test
    public void test11163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11163");
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
        java.util.Map<java.lang.String, java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable>> strMap13 = slimTableFactoryTest0.getmap();
        java.util.Map<java.lang.String, java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable>> strMap14 = slimTableFactoryTest0.map;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory15 = slimTableFactoryTest0.slimTableFactory;
        java.util.Map<java.lang.String, java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable>> strMap16 = slimTableFactoryTest0.map;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory17 = slimTableFactoryTest0.slimTableFactory;
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
        org.junit.Assert.assertNull(table11);
        org.junit.Assert.assertNull(slimTableFactory12);
        org.junit.Assert.assertNull(strMap13);
        org.junit.Assert.assertNull(strMap14);
        org.junit.Assert.assertNull(slimTableFactory15);
        org.junit.Assert.assertNull(strMap16);
        org.junit.Assert.assertNull(slimTableFactory17);
    }

    @Test
    public void test11164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11164");
        fitnesse.testsystems.slim.tables.SlimTableFactoryTest slimTableFactoryTest0 = new fitnesse.testsystems.slim.tables.SlimTableFactoryTest();
        fitnesse.testsystems.slim.Table table1 = null;
        slimTableFactoryTest0.table = table1;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory3 = slimTableFactoryTest0.slimTableFactory;
        java.util.Map<java.lang.String, java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable>> strMap4 = slimTableFactoryTest0.getmap();
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory5 = slimTableFactoryTest0.slimTableFactory;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory6 = null;
        slimTableFactoryTest0.setslimTableFactory(slimTableFactory6);
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory8 = null;
        slimTableFactoryTest0.slimTableFactory = slimTableFactory8;
        java.util.Map<java.lang.String, java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable>> strMap10 = slimTableFactoryTest0.map;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory11 = null;
        slimTableFactoryTest0.setslimTableFactory(slimTableFactory11);
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
        org.junit.Assert.assertNull(strMap10);
    }

    @Test
    public void test11165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11165");
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
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory16 = slimTableFactoryTest0.slimTableFactory;
        // The following exception was thrown during execution in test generation
        try {
            slimTableFactoryTest0.addTableTypeImport("hi!", "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(slimTableFactory3);
        org.junit.Assert.assertNull(strMap4);
        org.junit.Assert.assertNull(table9);
        org.junit.Assert.assertNull(table10);
        org.junit.Assert.assertNull(strMap13);
        org.junit.Assert.assertNull(slimTableFactory16);
    }

    @Test
    public void test11166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11166");
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
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory17 = slimTableFactoryTest0.slimTableFactory;
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
        org.junit.Assert.assertNull(slimTableFactory17);
    }

    @Test
    public void test11167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11167");
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
        fitnesse.testsystems.slim.Table table11 = slimTableFactoryTest0.table;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory12 = slimTableFactoryTest0.getslimTableFactory();
        fitnesse.testsystems.slim.Table table13 = null;
        slimTableFactoryTest0.settable(table13);
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
        org.junit.Assert.assertNull(strMap8);
        org.junit.Assert.assertNull(strMap9);
        org.junit.Assert.assertNull(table10);
        org.junit.Assert.assertNull(table11);
        org.junit.Assert.assertNull(slimTableFactory12);
    }

    @Test
    public void test11168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11168");
        fitnesse.testsystems.slim.tables.SlimTableFactoryTest slimTableFactoryTest0 = new fitnesse.testsystems.slim.tables.SlimTableFactoryTest();
        fitnesse.testsystems.slim.Table table1 = null;
        slimTableFactoryTest0.table = table1;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory3 = slimTableFactoryTest0.getslimTableFactory();
        fitnesse.testsystems.slim.Table table4 = slimTableFactoryTest0.gettable();
        fitnesse.testsystems.slim.Table table5 = slimTableFactoryTest0.table;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory6 = null;
        slimTableFactoryTest0.setslimTableFactory(slimTableFactory6);
        java.util.Map<java.lang.String, java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable>> strMap8 = slimTableFactoryTest0.map;
        java.util.Map<java.lang.String, java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable>> strMap9 = slimTableFactoryTest0.getmap();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass10 = strMap9.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(slimTableFactory3);
        org.junit.Assert.assertNull(table4);
        org.junit.Assert.assertNull(table5);
        org.junit.Assert.assertNull(strMap8);
        org.junit.Assert.assertNull(strMap9);
    }

    @Test
    public void test11169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11169");
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
        java.util.Map<java.lang.String, java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable>> strMap16 = slimTableFactoryTest0.map;
        fitnesse.testsystems.slim.Table table17 = slimTableFactoryTest0.gettable();
        // The following exception was thrown during execution in test generation
        try {
            slimTableFactoryTest0.addTableTypeImport("", "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(slimTableFactory7);
        org.junit.Assert.assertNull(table12);
        org.junit.Assert.assertNull(strMap15);
        org.junit.Assert.assertNull(strMap16);
        org.junit.Assert.assertNull(table17);
    }

    @Test
    public void test11170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11170");
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
        java.util.Map<java.lang.String, java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable>> strMap17 = slimTableFactoryTest0.map;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory18 = slimTableFactoryTest0.getslimTableFactory();
        // The following exception was thrown during execution in test generation
        try {
            slimTableFactoryTest0.checkTableTypeDefineUsedForTable();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(slimTableFactory3);
        org.junit.Assert.assertNull(strMap4);
        org.junit.Assert.assertNull(strMap17);
        org.junit.Assert.assertNull(slimTableFactory18);
    }

    @Test
    public void test11171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11171");
        fitnesse.testsystems.slim.tables.SlimTableFactoryTest slimTableFactoryTest0 = new fitnesse.testsystems.slim.tables.SlimTableFactoryTest();
        fitnesse.testsystems.slim.Table table1 = null;
        slimTableFactoryTest0.table = table1;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory3 = slimTableFactoryTest0.slimTableFactory;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory4 = slimTableFactoryTest0.slimTableFactory;
        java.util.Map<java.lang.String, java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable>> strMap5 = slimTableFactoryTest0.map;
        fitnesse.testsystems.slim.Table table6 = slimTableFactoryTest0.table;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory7 = null;
        slimTableFactoryTest0.slimTableFactory = slimTableFactory7;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory9 = null;
        slimTableFactoryTest0.setslimTableFactory(slimTableFactory9);
        java.util.Map<java.lang.String, java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable>> strMap11 = slimTableFactoryTest0.map;
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
        org.junit.Assert.assertNull(strMap11);
    }

    @Test
    public void test11172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11172");
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
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory10 = slimTableFactoryTest0.slimTableFactory;
        fitnesse.testsystems.slim.Table table11 = slimTableFactoryTest0.gettable();
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory12 = null;
        slimTableFactoryTest0.slimTableFactory = slimTableFactory12;
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
        org.junit.Assert.assertNull(strMap8);
        org.junit.Assert.assertNull(slimTableFactory9);
        org.junit.Assert.assertNull(slimTableFactory10);
        org.junit.Assert.assertNull(table11);
    }

    @Test
    public void test11173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11173");
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
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory19 = slimTableFactoryTest0.getslimTableFactory();
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory20 = slimTableFactoryTest0.getslimTableFactory();
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory21 = null;
        slimTableFactoryTest0.slimTableFactory = slimTableFactory21;
        // The following exception was thrown during execution in test generation
        try {
            slimTableFactoryTest0.shouldCreateCorrectSlimTableForTablesType();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(table7);
        org.junit.Assert.assertNull(strMap10);
        org.junit.Assert.assertNull(table13);
        org.junit.Assert.assertNull(table18);
        org.junit.Assert.assertNull(slimTableFactory19);
        org.junit.Assert.assertNull(slimTableFactory20);
    }

    @Test
    public void test11174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11174");
        fitnesse.testsystems.slim.tables.SlimTableFactoryTest slimTableFactoryTest0 = new fitnesse.testsystems.slim.tables.SlimTableFactoryTest();
        fitnesse.testsystems.slim.Table table1 = slimTableFactoryTest0.table;
        java.util.Map<java.lang.String, java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable>> strMap2 = slimTableFactoryTest0.getmap();
        java.util.Map<java.lang.String, java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable>> strMap3 = slimTableFactoryTest0.getmap();
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory4 = slimTableFactoryTest0.slimTableFactory;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory5 = slimTableFactoryTest0.getslimTableFactory();
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory6 = null;
        slimTableFactoryTest0.setslimTableFactory(slimTableFactory6);
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory8 = null;
        slimTableFactoryTest0.setslimTableFactory(slimTableFactory8);
        org.junit.Assert.assertNull(table1);
        org.junit.Assert.assertNull(strMap2);
        org.junit.Assert.assertNull(strMap3);
        org.junit.Assert.assertNull(slimTableFactory4);
        org.junit.Assert.assertNull(slimTableFactory5);
    }

    @Test
    public void test11175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11175");
        fitnesse.testsystems.slim.tables.SlimTableFactoryTest slimTableFactoryTest0 = new fitnesse.testsystems.slim.tables.SlimTableFactoryTest();
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory1 = slimTableFactoryTest0.slimTableFactory;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory2 = slimTableFactoryTest0.slimTableFactory;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory3 = slimTableFactoryTest0.slimTableFactory;
        java.util.Map<java.lang.String, java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable>> strMap4 = slimTableFactoryTest0.map;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory5 = slimTableFactoryTest0.getslimTableFactory();
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
        org.junit.Assert.assertNull(slimTableFactory1);
        org.junit.Assert.assertNull(slimTableFactory2);
        org.junit.Assert.assertNull(slimTableFactory3);
        org.junit.Assert.assertNull(strMap4);
        org.junit.Assert.assertNull(slimTableFactory5);
        org.junit.Assert.assertNull(strMap8);
    }

    @Test
    public void test11176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11176");
        fitnesse.testsystems.slim.tables.SlimTableFactoryTest slimTableFactoryTest0 = new fitnesse.testsystems.slim.tables.SlimTableFactoryTest();
        fitnesse.testsystems.slim.Table table1 = null;
        slimTableFactoryTest0.table = table1;
        fitnesse.testsystems.slim.Table table3 = null;
        slimTableFactoryTest0.settable(table3);
        fitnesse.testsystems.slim.Table table5 = null;
        slimTableFactoryTest0.settable(table5);
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory7 = slimTableFactoryTest0.slimTableFactory;
        java.util.Map<java.lang.String, java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable>> strMap8 = slimTableFactoryTest0.map;
        fitnesse.testsystems.slim.Table table9 = slimTableFactoryTest0.gettable();
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory10 = null;
        slimTableFactoryTest0.setslimTableFactory(slimTableFactory10);
        java.util.Map<java.lang.String, java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable>> strMap12 = slimTableFactoryTest0.getmap();
        org.junit.Assert.assertNull(slimTableFactory7);
        org.junit.Assert.assertNull(strMap8);
        org.junit.Assert.assertNull(table9);
        org.junit.Assert.assertNull(strMap12);
    }

    @Test
    public void test11177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11177");
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
        fitnesse.testsystems.slim.Table table10 = slimTableFactoryTest0.table;
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
        org.junit.Assert.assertNull(table10);
    }

    @Test
    public void test11178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11178");
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
        java.util.Map<java.lang.String, java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable>> strMap13 = slimTableFactoryTest0.getmap();
        java.util.Map<java.lang.String, java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable>> strMap14 = slimTableFactoryTest0.getmap();
        fitnesse.testsystems.slim.Table table15 = null;
        slimTableFactoryTest0.settable(table15);
        // The following exception was thrown during execution in test generation
        try {
            slimTableFactoryTest0.commentTableShouldReturnNull();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(slimTableFactory1);
        org.junit.Assert.assertNull(table2);
        org.junit.Assert.assertNull(strMap13);
        org.junit.Assert.assertNull(strMap14);
    }

    @Test
    public void test11179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11179");
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
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory14 = slimTableFactoryTest0.slimTableFactory;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory15 = null;
        slimTableFactoryTest0.setslimTableFactory(slimTableFactory15);
        fitnesse.testsystems.slim.Table table17 = slimTableFactoryTest0.table;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory18 = slimTableFactoryTest0.getslimTableFactory();
        fitnesse.testsystems.slim.Table table19 = slimTableFactoryTest0.gettable();
        java.util.Map<java.lang.String, java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable>> strMap20 = slimTableFactoryTest0.getmap();
        // The following exception was thrown during execution in test generation
        try {
            slimTableFactoryTest0.commentTableShouldReturnNull();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(slimTableFactory9);
        org.junit.Assert.assertNull(slimTableFactory12);
        org.junit.Assert.assertNull(table13);
        org.junit.Assert.assertNull(slimTableFactory14);
        org.junit.Assert.assertNull(table17);
        org.junit.Assert.assertNull(slimTableFactory18);
        org.junit.Assert.assertNull(table19);
        org.junit.Assert.assertNull(strMap20);
    }

    @Test
    public void test11180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11180");
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
        fitnesse.testsystems.slim.Table table15 = null;
        slimTableFactoryTest0.table = table15;
        fitnesse.testsystems.slim.Table table17 = null;
        slimTableFactoryTest0.table = table17;
        java.util.Map<java.lang.String, java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable>> strMap19 = slimTableFactoryTest0.map;
        org.junit.Assert.assertNull(strMap5);
        org.junit.Assert.assertNull(strMap6);
        org.junit.Assert.assertNull(slimTableFactory7);
        org.junit.Assert.assertNull(strMap8);
        org.junit.Assert.assertNull(slimTableFactory9);
        org.junit.Assert.assertNull(table12);
        org.junit.Assert.assertNull(slimTableFactory13);
        org.junit.Assert.assertNull(table14);
        org.junit.Assert.assertNull(strMap19);
    }

    @Test
    public void test11181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11181");
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
        fitnesse.testsystems.slim.Table table10 = slimTableFactoryTest0.table;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory11 = slimTableFactoryTest0.getslimTableFactory();
        fitnesse.testsystems.slim.Table table12 = null;
        slimTableFactoryTest0.settable(table12);
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
        org.junit.Assert.assertNull(strMap8);
        org.junit.Assert.assertNull(slimTableFactory9);
        org.junit.Assert.assertNull(table10);
        org.junit.Assert.assertNull(slimTableFactory11);
    }

    @Test
    public void test11182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11182");
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
        java.util.Map<java.lang.String, java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable>> strMap10 = slimTableFactoryTest0.map;
        java.util.Map<java.lang.String, java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable>> strMap11 = slimTableFactoryTest0.getmap();
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory12 = slimTableFactoryTest0.slimTableFactory;
        java.lang.Class<?> wildcardClass13 = slimTableFactoryTest0.getClass();
        org.junit.Assert.assertNull(slimTableFactory7);
        org.junit.Assert.assertNull(strMap8);
        org.junit.Assert.assertNull(slimTableFactory9);
        org.junit.Assert.assertNull(strMap10);
        org.junit.Assert.assertNull(strMap11);
        org.junit.Assert.assertNull(slimTableFactory12);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test11183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11183");
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
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory14 = null;
        slimTableFactoryTest0.slimTableFactory = slimTableFactory14;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory16 = slimTableFactoryTest0.getslimTableFactory();
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory17 = slimTableFactoryTest0.getslimTableFactory();
        org.junit.Assert.assertNull(slimTableFactory7);
        org.junit.Assert.assertNull(strMap8);
        org.junit.Assert.assertNull(table9);
        org.junit.Assert.assertNull(strMap10);
        org.junit.Assert.assertNull(strMap11);
        org.junit.Assert.assertNull(table12);
        org.junit.Assert.assertNull(strMap13);
        org.junit.Assert.assertNull(slimTableFactory16);
        org.junit.Assert.assertNull(slimTableFactory17);
    }

    @Test
    public void test11184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11184");
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
            slimTableFactoryTest0.addTableTypeImport("hi!", "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(slimTableFactory3);
        org.junit.Assert.assertNull(strMap6);
        org.junit.Assert.assertNull(strMap7);
    }

    @Test
    public void test11185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11185");
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
        fitnesse.testsystems.slim.Table table10 = slimTableFactoryTest0.gettable();
        java.util.Map<java.lang.String, java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable>> strMap11 = slimTableFactoryTest0.getmap();
        fitnesse.testsystems.slim.Table table12 = null;
        slimTableFactoryTest0.table = table12;
        java.util.Map<java.lang.String, java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable>> strMap14 = slimTableFactoryTest0.getmap();
        // The following exception was thrown during execution in test generation
        try {
            slimTableFactoryTest0.commentTableShouldReturnNull();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(strMap7);
        org.junit.Assert.assertNull(table10);
        org.junit.Assert.assertNull(strMap11);
        org.junit.Assert.assertNull(strMap14);
    }

    @Test
    public void test11186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11186");
        fitnesse.testsystems.slim.tables.SlimTableFactoryTest slimTableFactoryTest0 = new fitnesse.testsystems.slim.tables.SlimTableFactoryTest();
        fitnesse.testsystems.slim.Table table1 = null;
        slimTableFactoryTest0.table = table1;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory3 = slimTableFactoryTest0.slimTableFactory;
        java.util.Map<java.lang.String, java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable>> strMap4 = slimTableFactoryTest0.map;
        fitnesse.testsystems.slim.Table table5 = slimTableFactoryTest0.table;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory6 = null;
        slimTableFactoryTest0.setslimTableFactory(slimTableFactory6);
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory8 = slimTableFactoryTest0.getslimTableFactory();
        fitnesse.testsystems.slim.Table table9 = slimTableFactoryTest0.gettable();
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
        org.junit.Assert.assertNull(table5);
        org.junit.Assert.assertNull(slimTableFactory8);
        org.junit.Assert.assertNull(table9);
    }

    @Test
    public void test11187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11187");
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
        fitnesse.testsystems.slim.Table table10 = slimTableFactoryTest0.table;
        fitnesse.testsystems.slim.Table table11 = slimTableFactoryTest0.gettable();
        fitnesse.testsystems.slim.Table table12 = slimTableFactoryTest0.table;
        // The following exception was thrown during execution in test generation
        try {
            slimTableFactoryTest0.tableTypeStartingWithcommentColonShouldReturnNull();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(slimTableFactory5);
        org.junit.Assert.assertNull(table10);
        org.junit.Assert.assertNull(table11);
        org.junit.Assert.assertNull(table12);
    }

    @Test
    public void test11188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11188");
        fitnesse.testsystems.slim.tables.SlimTableFactoryTest slimTableFactoryTest0 = new fitnesse.testsystems.slim.tables.SlimTableFactoryTest();
        fitnesse.testsystems.slim.Table table1 = null;
        slimTableFactoryTest0.table = table1;
        fitnesse.testsystems.slim.Table table3 = slimTableFactoryTest0.table;
        fitnesse.testsystems.slim.Table table4 = slimTableFactoryTest0.gettable();
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory5 = slimTableFactoryTest0.slimTableFactory;
        fitnesse.testsystems.slim.Table table6 = null;
        slimTableFactoryTest0.settable(table6);
        fitnesse.testsystems.slim.Table table8 = slimTableFactoryTest0.gettable();
        fitnesse.testsystems.slim.Table table9 = slimTableFactoryTest0.table;
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
        org.junit.Assert.assertNull(table8);
        org.junit.Assert.assertNull(table9);
    }

    @Test
    public void test11189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11189");
        fitnesse.testsystems.slim.tables.SlimTableFactoryTest slimTableFactoryTest0 = new fitnesse.testsystems.slim.tables.SlimTableFactoryTest();
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory1 = slimTableFactoryTest0.slimTableFactory;
        fitnesse.testsystems.slim.Table table2 = slimTableFactoryTest0.gettable();
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory3 = null;
        slimTableFactoryTest0.slimTableFactory = slimTableFactory3;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory5 = null;
        slimTableFactoryTest0.slimTableFactory = slimTableFactory5;
        fitnesse.testsystems.slim.Table table7 = null;
        slimTableFactoryTest0.settable(table7);
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
    public void test11190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11190");
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
        fitnesse.testsystems.slim.Table table12 = null;
        slimTableFactoryTest0.settable(table12);
        fitnesse.testsystems.slim.Table table14 = null;
        slimTableFactoryTest0.table = table14;
        fitnesse.testsystems.slim.Table table16 = slimTableFactoryTest0.table;
        fitnesse.testsystems.slim.Table table17 = slimTableFactoryTest0.gettable();
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory18 = null;
        slimTableFactoryTest0.slimTableFactory = slimTableFactory18;
        java.util.Map<java.lang.String, java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable>> strMap20 = slimTableFactoryTest0.getmap();
        // The following exception was thrown during execution in test generation
        try {
            slimTableFactoryTest0.checkTableTypeDefineUsedForTable();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(slimTableFactory5);
        org.junit.Assert.assertNull(slimTableFactory6);
        org.junit.Assert.assertNull(slimTableFactory11);
        org.junit.Assert.assertNull(table16);
        org.junit.Assert.assertNull(table17);
        org.junit.Assert.assertNull(strMap20);
    }

    @Test
    public void test11191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11191");
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
        java.util.Map<java.lang.String, java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable>> strMap15 = slimTableFactoryTest0.getmap();
        fitnesse.testsystems.slim.Table table16 = slimTableFactoryTest0.gettable();
        java.lang.Class<?> wildcardClass17 = slimTableFactoryTest0.getClass();
        org.junit.Assert.assertNull(slimTableFactory1);
        org.junit.Assert.assertNull(table2);
        org.junit.Assert.assertNull(strMap15);
        org.junit.Assert.assertNull(table16);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test11192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11192");
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
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory17 = null;
        slimTableFactoryTest0.setslimTableFactory(slimTableFactory17);
        // The following exception was thrown during execution in test generation
        try {
            slimTableFactoryTest0.shouldCreateCorrectSlimTableForTablesType();
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
    public void test11193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11193");
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
        java.util.Map<java.lang.String, java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable>> strMap15 = slimTableFactoryTest0.map;
        java.util.Map<java.lang.String, java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable>> strMap16 = slimTableFactoryTest0.map;
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
        org.junit.Assert.assertNull(table13);
        org.junit.Assert.assertNull(slimTableFactory14);
        org.junit.Assert.assertNull(strMap15);
        org.junit.Assert.assertNull(strMap16);
    }

    @Test
    public void test11194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11194");
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
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory11 = slimTableFactoryTest0.slimTableFactory;
        fitnesse.testsystems.slim.Table table12 = null;
        slimTableFactoryTest0.settable(table12);
        java.util.Map<java.lang.String, java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable>> strMap14 = slimTableFactoryTest0.map;
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
        org.junit.Assert.assertNull(strMap14);
    }

    @Test
    public void test11195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11195");
        fitnesse.testsystems.slim.tables.SlimTableFactoryTest slimTableFactoryTest0 = new fitnesse.testsystems.slim.tables.SlimTableFactoryTest();
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory1 = slimTableFactoryTest0.slimTableFactory;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory2 = slimTableFactoryTest0.slimTableFactory;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory3 = slimTableFactoryTest0.slimTableFactory;
        java.util.Map<java.lang.String, java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable>> strMap4 = slimTableFactoryTest0.map;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory5 = slimTableFactoryTest0.slimTableFactory;
        fitnesse.testsystems.slim.Table table6 = null;
        slimTableFactoryTest0.settable(table6);
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory8 = null;
        slimTableFactoryTest0.setslimTableFactory(slimTableFactory8);
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
    }

    @Test
    public void test11196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11196");
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
        slimTableFactoryTest0.setslimTableFactory(slimTableFactory16);
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
        org.junit.Assert.assertNull(strMap15);
    }

    @Test
    public void test11197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11197");
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
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory10 = slimTableFactoryTest0.getslimTableFactory();
        fitnesse.testsystems.slim.Table table11 = slimTableFactoryTest0.gettable();
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
        org.junit.Assert.assertNull(slimTableFactory10);
        org.junit.Assert.assertNull(table11);
    }

    @Test
    public void test11198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11198");
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
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory18 = slimTableFactoryTest0.slimTableFactory;
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
        org.junit.Assert.assertNull(strMap8);
        org.junit.Assert.assertNull(slimTableFactory9);
        org.junit.Assert.assertNull(slimTableFactory12);
        org.junit.Assert.assertNull(slimTableFactory17);
        org.junit.Assert.assertNull(slimTableFactory18);
    }

    @Test
    public void test11199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11199");
        fitnesse.testsystems.slim.tables.SlimTableFactoryTest slimTableFactoryTest0 = new fitnesse.testsystems.slim.tables.SlimTableFactoryTest();
        fitnesse.testsystems.slim.Table table1 = slimTableFactoryTest0.table;
        java.util.Map<java.lang.String, java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable>> strMap2 = slimTableFactoryTest0.getmap();
        java.util.Map<java.lang.String, java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable>> strMap3 = slimTableFactoryTest0.getmap();
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory4 = slimTableFactoryTest0.slimTableFactory;
        fitnesse.testsystems.slim.Table table5 = null;
        slimTableFactoryTest0.table = table5;
        java.util.Map<java.lang.String, java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable>> strMap7 = slimTableFactoryTest0.map;
        fitnesse.testsystems.slim.Table table8 = slimTableFactoryTest0.gettable();
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory9 = slimTableFactoryTest0.slimTableFactory;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory10 = slimTableFactoryTest0.slimTableFactory;
        java.util.Map<java.lang.String, java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable>> strMap11 = slimTableFactoryTest0.map;
        // The following exception was thrown during execution in test generation
        try {
            slimTableFactoryTest0.checkTableTypeDefineUsedForTable();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(table1);
        org.junit.Assert.assertNull(strMap2);
        org.junit.Assert.assertNull(strMap3);
        org.junit.Assert.assertNull(slimTableFactory4);
        org.junit.Assert.assertNull(strMap7);
        org.junit.Assert.assertNull(table8);
        org.junit.Assert.assertNull(slimTableFactory9);
        org.junit.Assert.assertNull(slimTableFactory10);
        org.junit.Assert.assertNull(strMap11);
    }

    @Test
    public void test11200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11200");
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
        org.junit.Assert.assertNull(table9);
        org.junit.Assert.assertNull(table10);
        org.junit.Assert.assertNull(slimTableFactory11);
        org.junit.Assert.assertNull(strMap12);
    }

    @Test
    public void test11201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11201");
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
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory13 = slimTableFactoryTest0.slimTableFactory;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory14 = null;
        slimTableFactoryTest0.slimTableFactory = slimTableFactory14;
        fitnesse.testsystems.slim.Table table16 = slimTableFactoryTest0.table;
        java.util.Map<java.lang.String, java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable>> strMap17 = slimTableFactoryTest0.getmap();
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
        org.junit.Assert.assertNull(slimTableFactory10);
        org.junit.Assert.assertNull(slimTableFactory11);
        org.junit.Assert.assertNull(slimTableFactory12);
        org.junit.Assert.assertNull(slimTableFactory13);
        org.junit.Assert.assertNull(table16);
        org.junit.Assert.assertNull(strMap17);
    }

    @Test
    public void test11202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11202");
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
        fitnesse.testsystems.slim.Table table11 = slimTableFactoryTest0.gettable();
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory12 = null;
        slimTableFactoryTest0.setslimTableFactory(slimTableFactory12);
        fitnesse.testsystems.slim.Table table14 = null;
        slimTableFactoryTest0.table = table14;
        org.junit.Assert.assertNull(slimTableFactory3);
        org.junit.Assert.assertNull(table4);
        org.junit.Assert.assertNull(strMap5);
        org.junit.Assert.assertNull(table6);
        org.junit.Assert.assertNull(slimTableFactory7);
        org.junit.Assert.assertNull(slimTableFactory8);
        org.junit.Assert.assertNull(table11);
    }

    @Test
    public void test11203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11203");
        fitnesse.testsystems.slim.tables.SlimTableFactoryTest slimTableFactoryTest0 = new fitnesse.testsystems.slim.tables.SlimTableFactoryTest();
        fitnesse.testsystems.slim.Table table1 = null;
        slimTableFactoryTest0.table = table1;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory3 = slimTableFactoryTest0.getslimTableFactory();
        fitnesse.testsystems.slim.Table table4 = null;
        slimTableFactoryTest0.table = table4;
        // The following exception was thrown during execution in test generation
        try {
            slimTableFactoryTest0.commentTableShouldReturnNull();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(slimTableFactory3);
    }

    @Test
    public void test11204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11204");
        fitnesse.testsystems.slim.tables.SlimTableFactoryTest slimTableFactoryTest0 = new fitnesse.testsystems.slim.tables.SlimTableFactoryTest();
        fitnesse.testsystems.slim.Table table1 = null;
        slimTableFactoryTest0.table = table1;
        fitnesse.testsystems.slim.Table table3 = null;
        slimTableFactoryTest0.settable(table3);
        fitnesse.testsystems.slim.Table table5 = null;
        slimTableFactoryTest0.settable(table5);
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory7 = slimTableFactoryTest0.slimTableFactory;
        fitnesse.testsystems.slim.Table table8 = slimTableFactoryTest0.gettable();
        fitnesse.testsystems.slim.Table table9 = slimTableFactoryTest0.gettable();
        java.util.Map<java.lang.String, java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable>> strMap10 = slimTableFactoryTest0.getmap();
        org.junit.Assert.assertNull(slimTableFactory7);
        org.junit.Assert.assertNull(table8);
        org.junit.Assert.assertNull(table9);
        org.junit.Assert.assertNull(strMap10);
    }

    @Test
    public void test11205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11205");
        fitnesse.testsystems.slim.tables.SlimTableFactoryTest slimTableFactoryTest0 = new fitnesse.testsystems.slim.tables.SlimTableFactoryTest();
        fitnesse.testsystems.slim.Table table1 = null;
        slimTableFactoryTest0.table = table1;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory3 = slimTableFactoryTest0.slimTableFactory;
        java.util.Map<java.lang.String, java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable>> strMap4 = slimTableFactoryTest0.getmap();
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory5 = null;
        slimTableFactoryTest0.setslimTableFactory(slimTableFactory5);
        fitnesse.testsystems.slim.Table table7 = slimTableFactoryTest0.table;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory8 = slimTableFactoryTest0.getslimTableFactory();
        java.lang.Class<?> wildcardClass9 = slimTableFactoryTest0.getClass();
        org.junit.Assert.assertNull(slimTableFactory3);
        org.junit.Assert.assertNull(strMap4);
        org.junit.Assert.assertNull(table7);
        org.junit.Assert.assertNull(slimTableFactory8);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test11206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11206");
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
        java.util.Map<java.lang.String, java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable>> strMap11 = slimTableFactoryTest0.getmap();
        java.util.Map<java.lang.String, java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable>> strMap12 = slimTableFactoryTest0.map;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory13 = null;
        slimTableFactoryTest0.slimTableFactory = slimTableFactory13;
        org.junit.Assert.assertNull(strMap5);
        org.junit.Assert.assertNull(strMap6);
        org.junit.Assert.assertNull(slimTableFactory7);
        org.junit.Assert.assertNull(table8);
        org.junit.Assert.assertNull(strMap11);
        org.junit.Assert.assertNull(strMap12);
    }

    @Test
    public void test11207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11207");
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
        java.util.Map<java.lang.String, java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable>> strMap10 = slimTableFactoryTest0.map;
        java.util.Map<java.lang.String, java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable>> strMap11 = slimTableFactoryTest0.getmap();
        fitnesse.testsystems.slim.Table table12 = null;
        slimTableFactoryTest0.table = table12;
        // The following exception was thrown during execution in test generation
        try {
            slimTableFactoryTest0.addTableTypeImport("", "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(slimTableFactory1);
        org.junit.Assert.assertNull(table2);
        org.junit.Assert.assertNull(strMap3);
        org.junit.Assert.assertNull(table8);
        org.junit.Assert.assertNull(table9);
        org.junit.Assert.assertNull(strMap10);
        org.junit.Assert.assertNull(strMap11);
    }

    @Test
    public void test11208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11208");
        fitnesse.testsystems.slim.tables.SlimTableFactoryTest slimTableFactoryTest0 = new fitnesse.testsystems.slim.tables.SlimTableFactoryTest();
        fitnesse.testsystems.slim.Table table1 = slimTableFactoryTest0.table;
        java.util.Map<java.lang.String, java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable>> strMap2 = slimTableFactoryTest0.getmap();
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory3 = slimTableFactoryTest0.slimTableFactory;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory4 = slimTableFactoryTest0.slimTableFactory;
        fitnesse.testsystems.slim.Table table5 = slimTableFactoryTest0.gettable();
        java.util.Map<java.lang.String, java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable>> strMap6 = slimTableFactoryTest0.map;
        org.junit.Assert.assertNull(table1);
        org.junit.Assert.assertNull(strMap2);
        org.junit.Assert.assertNull(slimTableFactory3);
        org.junit.Assert.assertNull(slimTableFactory4);
        org.junit.Assert.assertNull(table5);
        org.junit.Assert.assertNull(strMap6);
    }

    @Test
    public void test11209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11209");
        fitnesse.testsystems.slim.tables.SlimTableFactoryTest slimTableFactoryTest0 = new fitnesse.testsystems.slim.tables.SlimTableFactoryTest();
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory1 = slimTableFactoryTest0.slimTableFactory;
        fitnesse.testsystems.slim.Table table2 = slimTableFactoryTest0.gettable();
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory3 = null;
        slimTableFactoryTest0.slimTableFactory = slimTableFactory3;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory5 = null;
        slimTableFactoryTest0.setslimTableFactory(slimTableFactory5);
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory7 = null;
        slimTableFactoryTest0.slimTableFactory = slimTableFactory7;
        java.util.Map<java.lang.String, java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable>> strMap9 = slimTableFactoryTest0.getmap();
        // The following exception was thrown during execution in test generation
        try {
            slimTableFactoryTest0.addTableTypeImport("hi!", "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(slimTableFactory1);
        org.junit.Assert.assertNull(table2);
        org.junit.Assert.assertNull(strMap9);
    }

    @Test
    public void test11210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11210");
        fitnesse.testsystems.slim.tables.SlimTableFactoryTest slimTableFactoryTest0 = new fitnesse.testsystems.slim.tables.SlimTableFactoryTest();
        fitnesse.testsystems.slim.Table table1 = null;
        slimTableFactoryTest0.table = table1;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory3 = null;
        slimTableFactoryTest0.slimTableFactory = slimTableFactory3;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory5 = slimTableFactoryTest0.getslimTableFactory();
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory6 = slimTableFactoryTest0.slimTableFactory;
        java.util.Map<java.lang.String, java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable>> strMap7 = slimTableFactoryTest0.getmap();
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory8 = slimTableFactoryTest0.getslimTableFactory();
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory9 = slimTableFactoryTest0.slimTableFactory;
        fitnesse.testsystems.slim.Table table10 = slimTableFactoryTest0.gettable();
        java.util.Map<java.lang.String, java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable>> strMap11 = slimTableFactoryTest0.getmap();
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
        org.junit.Assert.assertNull(slimTableFactory8);
        org.junit.Assert.assertNull(slimTableFactory9);
        org.junit.Assert.assertNull(table10);
        org.junit.Assert.assertNull(strMap11);
    }

    @Test
    public void test11211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11211");
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
        fitnesse.testsystems.slim.Table table10 = null;
        slimTableFactoryTest0.settable(table10);
        fitnesse.testsystems.slim.Table table12 = slimTableFactoryTest0.table;
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
        org.junit.Assert.assertNull(table9);
        org.junit.Assert.assertNull(table12);
    }

    @Test
    public void test11212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11212");
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
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory17 = slimTableFactoryTest0.slimTableFactory;
        fitnesse.testsystems.slim.Table table18 = null;
        slimTableFactoryTest0.settable(table18);
        fitnesse.testsystems.slim.Table table20 = slimTableFactoryTest0.gettable();
        // The following exception was thrown during execution in test generation
        try {
            slimTableFactoryTest0.checkTableTypeDefinesIgnoredIfDifferentSpecified();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(table7);
        org.junit.Assert.assertNull(strMap10);
        org.junit.Assert.assertNull(table13);
        org.junit.Assert.assertNull(strMap16);
        org.junit.Assert.assertNull(slimTableFactory17);
        org.junit.Assert.assertNull(table20);
    }

    @Test
    public void test11213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11213");
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
        fitnesse.testsystems.slim.Table table13 = slimTableFactoryTest0.gettable();
        fitnesse.testsystems.slim.Table table14 = null;
        slimTableFactoryTest0.table = table14;
        fitnesse.testsystems.slim.Table table16 = slimTableFactoryTest0.table;
        fitnesse.testsystems.slim.Table table17 = null;
        slimTableFactoryTest0.settable(table17);
        org.junit.Assert.assertNull(table7);
        org.junit.Assert.assertNull(table12);
        org.junit.Assert.assertNull(table13);
        org.junit.Assert.assertNull(table16);
    }

    @Test
    public void test11214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11214");
        fitnesse.testsystems.slim.tables.SlimTableFactoryTest slimTableFactoryTest0 = new fitnesse.testsystems.slim.tables.SlimTableFactoryTest();
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory1 = slimTableFactoryTest0.slimTableFactory;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory2 = slimTableFactoryTest0.slimTableFactory;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory3 = slimTableFactoryTest0.slimTableFactory;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory4 = null;
        slimTableFactoryTest0.slimTableFactory = slimTableFactory4;
        fitnesse.testsystems.slim.Table table6 = null;
        slimTableFactoryTest0.table = table6;
        java.util.Map<java.lang.String, java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable>> strMap8 = slimTableFactoryTest0.getmap();
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory9 = slimTableFactoryTest0.slimTableFactory;
        fitnesse.testsystems.slim.Table table10 = null;
        slimTableFactoryTest0.table = table10;
        fitnesse.testsystems.slim.Table table12 = null;
        slimTableFactoryTest0.table = table12;
        fitnesse.testsystems.slim.Table table14 = slimTableFactoryTest0.table;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass15 = table14.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(slimTableFactory1);
        org.junit.Assert.assertNull(slimTableFactory2);
        org.junit.Assert.assertNull(slimTableFactory3);
        org.junit.Assert.assertNull(strMap8);
        org.junit.Assert.assertNull(slimTableFactory9);
        org.junit.Assert.assertNull(table14);
    }

    @Test
    public void test11215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11215");
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
        fitnesse.testsystems.slim.Table table11 = null;
        slimTableFactoryTest0.table = table11;
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
        org.junit.Assert.assertNull(slimTableFactory8);
        org.junit.Assert.assertNull(slimTableFactory9);
        org.junit.Assert.assertNull(strMap10);
    }

    @Test
    public void test11216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11216");
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
            slimTableFactoryTest0.shouldCreateCorrectSlimTableForTablesType();
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
    public void test11217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11217");
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
        java.util.Map<java.lang.String, java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable>> strMap11 = slimTableFactoryTest0.map;
        fitnesse.testsystems.slim.Table table12 = null;
        slimTableFactoryTest0.settable(table12);
        fitnesse.testsystems.slim.Table table14 = slimTableFactoryTest0.gettable();
        // The following exception was thrown during execution in test generation
        try {
            slimTableFactoryTest0.commentTableShouldReturnNull();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(slimTableFactory1);
        org.junit.Assert.assertNull(table2);
        org.junit.Assert.assertNull(strMap11);
        org.junit.Assert.assertNull(table14);
    }

    @Test
    public void test11218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11218");
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
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory17 = null;
        slimTableFactoryTest0.slimTableFactory = slimTableFactory17;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory19 = slimTableFactoryTest0.getslimTableFactory();
        fitnesse.testsystems.slim.Table table20 = null;
        slimTableFactoryTest0.table = table20;
        java.util.Map<java.lang.String, java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable>> strMap22 = slimTableFactoryTest0.getmap();
        java.lang.Class<?> wildcardClass23 = slimTableFactoryTest0.getClass();
        org.junit.Assert.assertNull(slimTableFactory3);
        org.junit.Assert.assertNull(strMap4);
        org.junit.Assert.assertNull(slimTableFactory19);
        org.junit.Assert.assertNull(strMap22);
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test11219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11219");
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
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory19 = slimTableFactoryTest0.getslimTableFactory();
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
        org.junit.Assert.assertNull(slimTableFactory19);
    }

    @Test
    public void test11220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11220");
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
        fitnesse.testsystems.slim.Table table17 = slimTableFactoryTest0.table;
        java.util.Map<java.lang.String, java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable>> strMap18 = slimTableFactoryTest0.map;
        // The following exception was thrown during execution in test generation
        try {
            slimTableFactoryTest0.addTableTypeImport("hi!", "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(slimTableFactory3);
        org.junit.Assert.assertNull(strMap4);
        org.junit.Assert.assertNull(slimTableFactory11);
        org.junit.Assert.assertNull(strMap12);
        org.junit.Assert.assertNull(table17);
        org.junit.Assert.assertNull(strMap18);
    }

    @Test
    public void test11221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11221");
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
    }

    @Test
    public void test11222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11222");
        fitnesse.testsystems.slim.tables.SlimTableFactoryTest slimTableFactoryTest0 = new fitnesse.testsystems.slim.tables.SlimTableFactoryTest();
        fitnesse.testsystems.slim.Table table1 = null;
        slimTableFactoryTest0.table = table1;
        fitnesse.testsystems.slim.Table table3 = null;
        slimTableFactoryTest0.settable(table3);
        java.util.Map<java.lang.String, java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable>> strMap5 = slimTableFactoryTest0.map;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory6 = slimTableFactoryTest0.getslimTableFactory();
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory7 = slimTableFactoryTest0.getslimTableFactory();
        fitnesse.testsystems.slim.Table table8 = slimTableFactoryTest0.gettable();
        fitnesse.testsystems.slim.Table table9 = slimTableFactoryTest0.table;
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
        org.junit.Assert.assertNull(table9);
    }

    @Test
    public void test11223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11223");
        fitnesse.testsystems.slim.tables.SlimTableFactoryTest slimTableFactoryTest0 = new fitnesse.testsystems.slim.tables.SlimTableFactoryTest();
        fitnesse.testsystems.slim.Table table1 = slimTableFactoryTest0.table;
        java.util.Map<java.lang.String, java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable>> strMap2 = slimTableFactoryTest0.getmap();
        java.util.Map<java.lang.String, java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable>> strMap3 = slimTableFactoryTest0.getmap();
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory4 = slimTableFactoryTest0.slimTableFactory;
        fitnesse.testsystems.slim.Table table5 = null;
        slimTableFactoryTest0.settable(table5);
        fitnesse.testsystems.slim.Table table7 = slimTableFactoryTest0.table;
        java.util.Map<java.lang.String, java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable>> strMap8 = slimTableFactoryTest0.map;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory9 = null;
        slimTableFactoryTest0.slimTableFactory = slimTableFactory9;
        java.util.Map<java.lang.String, java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable>> strMap11 = slimTableFactoryTest0.map;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory12 = slimTableFactoryTest0.slimTableFactory;
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
        org.junit.Assert.assertNull(strMap11);
        org.junit.Assert.assertNull(slimTableFactory12);
    }

    @Test
    public void test11224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11224");
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
        fitnesse.testsystems.slim.Table table10 = null;
        slimTableFactoryTest0.settable(table10);
        java.util.Map<java.lang.String, java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable>> strMap12 = slimTableFactoryTest0.map;
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
        org.junit.Assert.assertNull(slimTableFactory5);
        org.junit.Assert.assertNull(strMap6);
        org.junit.Assert.assertNull(table9);
        org.junit.Assert.assertNull(strMap12);
        org.junit.Assert.assertNull(strMap13);
    }

    @Test
    public void test11225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11225");
        fitnesse.testsystems.slim.tables.SlimTableFactoryTest slimTableFactoryTest0 = new fitnesse.testsystems.slim.tables.SlimTableFactoryTest();
        fitnesse.testsystems.slim.Table table1 = null;
        slimTableFactoryTest0.table = table1;
        fitnesse.testsystems.slim.Table table3 = slimTableFactoryTest0.table;
        fitnesse.testsystems.slim.Table table4 = slimTableFactoryTest0.gettable();
        java.util.Map<java.lang.String, java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable>> strMap5 = slimTableFactoryTest0.getmap();
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory6 = slimTableFactoryTest0.getslimTableFactory();
        java.util.Map<java.lang.String, java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable>> strMap7 = slimTableFactoryTest0.getmap();
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
        org.junit.Assert.assertNull(strMap7);
    }

    @Test
    public void test11226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11226");
        fitnesse.testsystems.slim.tables.SlimTableFactoryTest slimTableFactoryTest0 = new fitnesse.testsystems.slim.tables.SlimTableFactoryTest();
        fitnesse.testsystems.slim.Table table1 = null;
        slimTableFactoryTest0.table = table1;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory3 = null;
        slimTableFactoryTest0.setslimTableFactory(slimTableFactory3);
        java.util.Map<java.lang.String, java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable>> strMap5 = slimTableFactoryTest0.map;
        fitnesse.testsystems.slim.Table table6 = null;
        slimTableFactoryTest0.table = table6;
        fitnesse.testsystems.slim.Table table8 = slimTableFactoryTest0.table;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory9 = slimTableFactoryTest0.getslimTableFactory();
        fitnesse.testsystems.slim.Table table10 = null;
        slimTableFactoryTest0.table = table10;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory12 = null;
        slimTableFactoryTest0.setslimTableFactory(slimTableFactory12);
        fitnesse.testsystems.slim.Table table14 = null;
        slimTableFactoryTest0.settable(table14);
        java.lang.Class<?> wildcardClass16 = slimTableFactoryTest0.getClass();
        org.junit.Assert.assertNull(strMap5);
        org.junit.Assert.assertNull(table8);
        org.junit.Assert.assertNull(slimTableFactory9);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test11227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11227");
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
        slimTableFactoryTest0.slimTableFactory = slimTableFactory11;
        java.util.Map<java.lang.String, java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable>> strMap13 = slimTableFactoryTest0.getmap();
        fitnesse.testsystems.slim.Table table14 = null;
        slimTableFactoryTest0.table = table14;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory16 = null;
        slimTableFactoryTest0.slimTableFactory = slimTableFactory16;
        fitnesse.testsystems.slim.Table table18 = null;
        slimTableFactoryTest0.table = table18;
        fitnesse.testsystems.slim.Table table20 = null;
        slimTableFactoryTest0.settable(table20);
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory22 = null;
        slimTableFactoryTest0.slimTableFactory = slimTableFactory22;
        // The following exception was thrown during execution in test generation
        try {
            slimTableFactoryTest0.addTableTypeImport("hi!", "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(strMap13);
    }

    @Test
    public void test11228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11228");
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
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory13 = slimTableFactoryTest0.slimTableFactory;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory14 = null;
        slimTableFactoryTest0.slimTableFactory = slimTableFactory14;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory16 = null;
        slimTableFactoryTest0.setslimTableFactory(slimTableFactory16);
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
        org.junit.Assert.assertNull(slimTableFactory11);
        org.junit.Assert.assertNull(slimTableFactory12);
        org.junit.Assert.assertNull(slimTableFactory13);
    }

    @Test
    public void test11229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11229");
        fitnesse.testsystems.slim.tables.SlimTableFactoryTest slimTableFactoryTest0 = new fitnesse.testsystems.slim.tables.SlimTableFactoryTest();
        fitnesse.testsystems.slim.Table table1 = null;
        slimTableFactoryTest0.table = table1;
        fitnesse.testsystems.slim.Table table3 = null;
        slimTableFactoryTest0.settable(table3);
        fitnesse.testsystems.slim.Table table5 = null;
        slimTableFactoryTest0.table = table5;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory7 = slimTableFactoryTest0.slimTableFactory;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory8 = slimTableFactoryTest0.getslimTableFactory();
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory9 = null;
        slimTableFactoryTest0.slimTableFactory = slimTableFactory9;
        fitnesse.testsystems.slim.Table table11 = slimTableFactoryTest0.gettable();
        java.util.Map<java.lang.String, java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable>> strMap12 = slimTableFactoryTest0.map;
        // The following exception was thrown during execution in test generation
        try {
            slimTableFactoryTest0.checkTableTypeDefineUsedForTable();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(slimTableFactory7);
        org.junit.Assert.assertNull(slimTableFactory8);
        org.junit.Assert.assertNull(table11);
        org.junit.Assert.assertNull(strMap12);
    }

    @Test
    public void test11230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11230");
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
        slimTableFactoryTest0.table = table14;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory16 = slimTableFactoryTest0.slimTableFactory;
        fitnesse.testsystems.slim.Table table17 = slimTableFactoryTest0.table;
        fitnesse.testsystems.slim.Table table18 = null;
        slimTableFactoryTest0.settable(table18);
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory20 = null;
        slimTableFactoryTest0.setslimTableFactory(slimTableFactory20);
        fitnesse.testsystems.slim.Table table22 = null;
        slimTableFactoryTest0.settable(table22);
        org.junit.Assert.assertNull(slimTableFactory3);
        org.junit.Assert.assertNull(strMap4);
        org.junit.Assert.assertNull(table13);
        org.junit.Assert.assertNull(slimTableFactory16);
        org.junit.Assert.assertNull(table17);
    }

    @Test
    public void test11231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11231");
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
        fitnesse.testsystems.slim.Table table11 = slimTableFactoryTest0.table;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory12 = slimTableFactoryTest0.getslimTableFactory();
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
        org.junit.Assert.assertNull(table11);
        org.junit.Assert.assertNull(slimTableFactory12);
    }

    @Test
    public void test11232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11232");
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
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory11 = slimTableFactoryTest0.slimTableFactory;
        // The following exception was thrown during execution in test generation
        try {
            slimTableFactoryTest0.checkTableTypeDefineUsedForTable();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(table7);
        org.junit.Assert.assertNull(strMap8);
        org.junit.Assert.assertNull(slimTableFactory11);
    }

    @Test
    public void test11233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11233");
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
        fitnesse.testsystems.slim.Table table12 = null;
        slimTableFactoryTest0.settable(table12);
        java.util.Map<java.lang.String, java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable>> strMap14 = slimTableFactoryTest0.map;
        fitnesse.testsystems.slim.Table table15 = slimTableFactoryTest0.table;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory16 = null;
        slimTableFactoryTest0.slimTableFactory = slimTableFactory16;
        // The following exception was thrown during execution in test generation
        try {
            slimTableFactoryTest0.checkTableTypeDefinesIgnoredIfDifferentSpecified();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(slimTableFactory5);
        org.junit.Assert.assertNull(strMap10);
        org.junit.Assert.assertNull(strMap11);
        org.junit.Assert.assertNull(strMap14);
        org.junit.Assert.assertNull(table15);
    }

    @Test
    public void test11234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11234");
        fitnesse.testsystems.slim.tables.SlimTableFactoryTest slimTableFactoryTest0 = new fitnesse.testsystems.slim.tables.SlimTableFactoryTest();
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory1 = slimTableFactoryTest0.slimTableFactory;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory2 = slimTableFactoryTest0.slimTableFactory;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory3 = slimTableFactoryTest0.slimTableFactory;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory4 = null;
        slimTableFactoryTest0.slimTableFactory = slimTableFactory4;
        java.util.Map<java.lang.String, java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable>> strMap6 = slimTableFactoryTest0.getmap();
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory7 = slimTableFactoryTest0.getslimTableFactory();
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory8 = null;
        slimTableFactoryTest0.setslimTableFactory(slimTableFactory8);
        java.lang.Class<?> wildcardClass10 = slimTableFactoryTest0.getClass();
        org.junit.Assert.assertNull(slimTableFactory1);
        org.junit.Assert.assertNull(slimTableFactory2);
        org.junit.Assert.assertNull(slimTableFactory3);
        org.junit.Assert.assertNull(strMap6);
        org.junit.Assert.assertNull(slimTableFactory7);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test11235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11235");
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
        java.util.Map<java.lang.String, java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable>> strMap12 = slimTableFactoryTest0.getmap();
        java.util.Map<java.lang.String, java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable>> strMap13 = slimTableFactoryTest0.map;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory14 = null;
        slimTableFactoryTest0.setslimTableFactory(slimTableFactory14);
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
        org.junit.Assert.assertNull(table11);
        org.junit.Assert.assertNull(strMap12);
        org.junit.Assert.assertNull(strMap13);
    }

    @Test
    public void test11236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11236");
        fitnesse.testsystems.slim.tables.SlimTableFactoryTest slimTableFactoryTest0 = new fitnesse.testsystems.slim.tables.SlimTableFactoryTest();
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory1 = slimTableFactoryTest0.slimTableFactory;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory2 = slimTableFactoryTest0.slimTableFactory;
        fitnesse.testsystems.slim.Table table3 = null;
        slimTableFactoryTest0.settable(table3);
        fitnesse.testsystems.slim.Table table5 = slimTableFactoryTest0.table;
        fitnesse.testsystems.slim.Table table6 = null;
        slimTableFactoryTest0.table = table6;
        fitnesse.testsystems.slim.Table table8 = null;
        slimTableFactoryTest0.settable(table8);
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory10 = slimTableFactoryTest0.slimTableFactory;
        fitnesse.testsystems.slim.Table table11 = null;
        slimTableFactoryTest0.table = table11;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory13 = null;
        slimTableFactoryTest0.slimTableFactory = slimTableFactory13;
        java.lang.Class<?> wildcardClass15 = slimTableFactoryTest0.getClass();
        org.junit.Assert.assertNull(slimTableFactory1);
        org.junit.Assert.assertNull(slimTableFactory2);
        org.junit.Assert.assertNull(table5);
        org.junit.Assert.assertNull(slimTableFactory10);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test11237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11237");
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
        fitnesse.testsystems.slim.Table table19 = slimTableFactoryTest0.table;
        fitnesse.testsystems.slim.Table table20 = slimTableFactoryTest0.table;
        java.lang.Class<?> wildcardClass21 = slimTableFactoryTest0.getClass();
        org.junit.Assert.assertNull(table1);
        org.junit.Assert.assertNull(strMap2);
        org.junit.Assert.assertNull(strMap3);
        org.junit.Assert.assertNull(slimTableFactory4);
        org.junit.Assert.assertNull(table7);
        org.junit.Assert.assertNull(strMap8);
        org.junit.Assert.assertNull(table19);
        org.junit.Assert.assertNull(table20);
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test11238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11238");
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
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory18 = slimTableFactoryTest0.slimTableFactory;
        fitnesse.testsystems.slim.Table table19 = slimTableFactoryTest0.gettable();
        org.junit.Assert.assertNull(strMap5);
        org.junit.Assert.assertNull(strMap6);
        org.junit.Assert.assertNull(slimTableFactory7);
        org.junit.Assert.assertNull(strMap8);
        org.junit.Assert.assertNull(slimTableFactory9);
        org.junit.Assert.assertNull(slimTableFactory12);
        org.junit.Assert.assertNull(slimTableFactory17);
        org.junit.Assert.assertNull(slimTableFactory18);
        org.junit.Assert.assertNull(table19);
    }

    @Test
    public void test11239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11239");
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
        fitnesse.testsystems.slim.Table table13 = slimTableFactoryTest0.table;
        java.util.Map<java.lang.String, java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable>> strMap14 = slimTableFactoryTest0.getmap();
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory15 = slimTableFactoryTest0.getslimTableFactory();
        fitnesse.testsystems.slim.Table table16 = slimTableFactoryTest0.table;
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
        org.junit.Assert.assertNull(strMap14);
        org.junit.Assert.assertNull(slimTableFactory15);
        org.junit.Assert.assertNull(table16);
    }

    @Test
    public void test11240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11240");
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
        slimTableFactoryTest0.table = table14;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory16 = slimTableFactoryTest0.slimTableFactory;
        fitnesse.testsystems.slim.Table table17 = slimTableFactoryTest0.table;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory18 = slimTableFactoryTest0.getslimTableFactory();
        // The following exception was thrown during execution in test generation
        try {
            slimTableFactoryTest0.checkTableTypeDefinesIgnoredIfDifferentSpecified();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(slimTableFactory3);
        org.junit.Assert.assertNull(strMap4);
        org.junit.Assert.assertNull(table13);
        org.junit.Assert.assertNull(slimTableFactory16);
        org.junit.Assert.assertNull(table17);
        org.junit.Assert.assertNull(slimTableFactory18);
    }

    @Test
    public void test11241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11241");
        fitnesse.testsystems.slim.tables.SlimTableFactoryTest slimTableFactoryTest0 = new fitnesse.testsystems.slim.tables.SlimTableFactoryTest();
        fitnesse.testsystems.slim.Table table1 = slimTableFactoryTest0.table;
        java.util.Map<java.lang.String, java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable>> strMap2 = slimTableFactoryTest0.getmap();
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory3 = null;
        slimTableFactoryTest0.slimTableFactory = slimTableFactory3;
        fitnesse.testsystems.slim.Table table5 = slimTableFactoryTest0.table;
        java.util.Map<java.lang.String, java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable>> strMap6 = slimTableFactoryTest0.map;
        java.util.Map<java.lang.String, java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable>> strMap7 = slimTableFactoryTest0.getmap();
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory8 = null;
        slimTableFactoryTest0.slimTableFactory = slimTableFactory8;
        org.junit.Assert.assertNull(table1);
        org.junit.Assert.assertNull(strMap2);
        org.junit.Assert.assertNull(table5);
        org.junit.Assert.assertNull(strMap6);
        org.junit.Assert.assertNull(strMap7);
    }

    @Test
    public void test11242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11242");
        fitnesse.testsystems.slim.tables.SlimTableFactoryTest slimTableFactoryTest0 = new fitnesse.testsystems.slim.tables.SlimTableFactoryTest();
        fitnesse.testsystems.slim.Table table1 = null;
        slimTableFactoryTest0.table = table1;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory3 = slimTableFactoryTest0.slimTableFactory;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory4 = slimTableFactoryTest0.slimTableFactory;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory5 = slimTableFactoryTest0.slimTableFactory;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory6 = slimTableFactoryTest0.getslimTableFactory();
        fitnesse.testsystems.slim.Table table7 = slimTableFactoryTest0.table;
        org.junit.Assert.assertNull(slimTableFactory3);
        org.junit.Assert.assertNull(slimTableFactory4);
        org.junit.Assert.assertNull(slimTableFactory5);
        org.junit.Assert.assertNull(slimTableFactory6);
        org.junit.Assert.assertNull(table7);
    }

    @Test
    public void test11243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11243");
        fitnesse.testsystems.slim.tables.SlimTableFactoryTest slimTableFactoryTest0 = new fitnesse.testsystems.slim.tables.SlimTableFactoryTest();
        fitnesse.testsystems.slim.Table table1 = slimTableFactoryTest0.table;
        java.util.Map<java.lang.String, java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable>> strMap2 = slimTableFactoryTest0.getmap();
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory3 = slimTableFactoryTest0.slimTableFactory;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory4 = slimTableFactoryTest0.slimTableFactory;
        fitnesse.testsystems.slim.Table table5 = slimTableFactoryTest0.gettable();
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory6 = slimTableFactoryTest0.slimTableFactory;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory7 = slimTableFactoryTest0.slimTableFactory;
        java.lang.Class<?> wildcardClass8 = slimTableFactoryTest0.getClass();
        org.junit.Assert.assertNull(table1);
        org.junit.Assert.assertNull(strMap2);
        org.junit.Assert.assertNull(slimTableFactory3);
        org.junit.Assert.assertNull(slimTableFactory4);
        org.junit.Assert.assertNull(table5);
        org.junit.Assert.assertNull(slimTableFactory6);
        org.junit.Assert.assertNull(slimTableFactory7);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test11244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11244");
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
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory10 = null;
        slimTableFactoryTest0.setslimTableFactory(slimTableFactory10);
        fitnesse.testsystems.slim.Table table12 = null;
        slimTableFactoryTest0.settable(table12);
        fitnesse.testsystems.slim.Table table14 = slimTableFactoryTest0.table;
        org.junit.Assert.assertNull(slimTableFactory7);
        org.junit.Assert.assertNull(strMap8);
        org.junit.Assert.assertNull(slimTableFactory9);
        org.junit.Assert.assertNull(table14);
    }

    @Test
    public void test11245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11245");
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
        java.util.Map<java.lang.String, java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable>> strMap21 = slimTableFactoryTest0.getmap();
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
        org.junit.Assert.assertNull(strMap21);
    }

    @Test
    public void test11246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11246");
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
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory11 = slimTableFactoryTest0.getslimTableFactory();
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory12 = slimTableFactoryTest0.getslimTableFactory();
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory13 = null;
        slimTableFactoryTest0.slimTableFactory = slimTableFactory13;
        fitnesse.testsystems.slim.Table table15 = null;
        slimTableFactoryTest0.settable(table15);
        org.junit.Assert.assertNull(strMap5);
        org.junit.Assert.assertNull(strMap6);
        org.junit.Assert.assertNull(slimTableFactory7);
        org.junit.Assert.assertNull(strMap8);
        org.junit.Assert.assertNull(slimTableFactory11);
        org.junit.Assert.assertNull(slimTableFactory12);
    }

    @Test
    public void test11247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11247");
        fitnesse.testsystems.slim.tables.SlimTableFactoryTest slimTableFactoryTest0 = new fitnesse.testsystems.slim.tables.SlimTableFactoryTest();
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory1 = slimTableFactoryTest0.slimTableFactory;
        fitnesse.testsystems.slim.Table table2 = slimTableFactoryTest0.gettable();
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory3 = null;
        slimTableFactoryTest0.slimTableFactory = slimTableFactory3;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory5 = null;
        slimTableFactoryTest0.slimTableFactory = slimTableFactory5;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory7 = slimTableFactoryTest0.slimTableFactory;
        java.util.Map<java.lang.String, java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable>> strMap8 = slimTableFactoryTest0.map;
        fitnesse.testsystems.slim.Table table9 = slimTableFactoryTest0.gettable();
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
        org.junit.Assert.assertNull(strMap8);
        org.junit.Assert.assertNull(table9);
    }

    @Test
    public void test11248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11248");
        fitnesse.testsystems.slim.tables.SlimTableFactoryTest slimTableFactoryTest0 = new fitnesse.testsystems.slim.tables.SlimTableFactoryTest();
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory1 = slimTableFactoryTest0.slimTableFactory;
        fitnesse.testsystems.slim.Table table2 = slimTableFactoryTest0.table;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory3 = null;
        slimTableFactoryTest0.setslimTableFactory(slimTableFactory3);
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory5 = null;
        slimTableFactoryTest0.slimTableFactory = slimTableFactory5;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory7 = slimTableFactoryTest0.getslimTableFactory();
        fitnesse.testsystems.slim.Table table8 = slimTableFactoryTest0.table;
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
        org.junit.Assert.assertNull(table8);
    }

    @Test
    public void test11249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11249");
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
            slimTableFactoryTest0.addTableTypeImport("", "hi!");
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
    public void test11250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11250");
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
        fitnesse.testsystems.slim.Table table11 = slimTableFactoryTest0.gettable();
        fitnesse.testsystems.slim.Table table12 = null;
        slimTableFactoryTest0.table = table12;
        java.util.Map<java.lang.String, java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable>> strMap14 = slimTableFactoryTest0.map;
        java.util.Map<java.lang.String, java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable>> strMap15 = slimTableFactoryTest0.map;
        // The following exception was thrown during execution in test generation
        try {
            slimTableFactoryTest0.addTableTypeImport("hi!", "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(slimTableFactory3);
        org.junit.Assert.assertNull(table8);
        org.junit.Assert.assertNull(table11);
        org.junit.Assert.assertNull(strMap14);
        org.junit.Assert.assertNull(strMap15);
    }

    @Test
    public void test11251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11251");
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
    public void test11252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11252");
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
        org.junit.Assert.assertNull(slimTableFactory11);
        org.junit.Assert.assertNull(slimTableFactory12);
    }

    @Test
    public void test11253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11253");
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
        fitnesse.testsystems.slim.Table table13 = null;
        slimTableFactoryTest0.settable(table13);
        java.util.Map<java.lang.String, java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable>> strMap15 = slimTableFactoryTest0.map;
        // The following exception was thrown during execution in test generation
        try {
            slimTableFactoryTest0.checkTableTypeDefinesIgnoredIfDifferentSpecified();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(table7);
        org.junit.Assert.assertNull(strMap10);
        org.junit.Assert.assertNull(strMap15);
    }

    @Test
    public void test11254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11254");
        fitnesse.testsystems.slim.tables.SlimTableFactoryTest slimTableFactoryTest0 = new fitnesse.testsystems.slim.tables.SlimTableFactoryTest();
        fitnesse.testsystems.slim.Table table1 = null;
        slimTableFactoryTest0.table = table1;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory3 = slimTableFactoryTest0.getslimTableFactory();
        fitnesse.testsystems.slim.Table table4 = slimTableFactoryTest0.gettable();
        java.util.Map<java.lang.String, java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable>> strMap5 = slimTableFactoryTest0.getmap();
        java.util.Map<java.lang.String, java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable>> strMap6 = slimTableFactoryTest0.map;
        org.junit.Assert.assertNull(slimTableFactory3);
        org.junit.Assert.assertNull(table4);
        org.junit.Assert.assertNull(strMap5);
        org.junit.Assert.assertNull(strMap6);
    }

    @Test
    public void test11255() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11255");
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
        fitnesse.testsystems.slim.Table table16 = null;
        slimTableFactoryTest0.settable(table16);
        fitnesse.testsystems.slim.Table table18 = null;
        slimTableFactoryTest0.table = table18;
        fitnesse.testsystems.slim.Table table20 = null;
        slimTableFactoryTest0.settable(table20);
        fitnesse.testsystems.slim.Table table22 = slimTableFactoryTest0.gettable();
        org.junit.Assert.assertNull(strMap5);
        org.junit.Assert.assertNull(strMap6);
        org.junit.Assert.assertNull(slimTableFactory7);
        org.junit.Assert.assertNull(strMap8);
        org.junit.Assert.assertNull(strMap15);
        org.junit.Assert.assertNull(table22);
    }

    @Test
    public void test11256() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11256");
        fitnesse.testsystems.slim.tables.SlimTableFactoryTest slimTableFactoryTest0 = new fitnesse.testsystems.slim.tables.SlimTableFactoryTest();
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory1 = null;
        slimTableFactoryTest0.slimTableFactory = slimTableFactory1;
        java.util.Map<java.lang.String, java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable>> strMap3 = slimTableFactoryTest0.getmap();
        fitnesse.testsystems.slim.Table table4 = slimTableFactoryTest0.gettable();
        // The following exception was thrown during execution in test generation
        try {
            slimTableFactoryTest0.addTableTypeImport("", "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(strMap3);
        org.junit.Assert.assertNull(table4);
    }

    @Test
    public void test11257() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11257");
        fitnesse.testsystems.slim.tables.SlimTableFactoryTest slimTableFactoryTest0 = new fitnesse.testsystems.slim.tables.SlimTableFactoryTest();
        fitnesse.testsystems.slim.Table table1 = slimTableFactoryTest0.table;
        java.util.Map<java.lang.String, java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable>> strMap2 = slimTableFactoryTest0.getmap();
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory3 = null;
        slimTableFactoryTest0.slimTableFactory = slimTableFactory3;
        fitnesse.testsystems.slim.Table table5 = slimTableFactoryTest0.table;
        fitnesse.testsystems.slim.Table table6 = slimTableFactoryTest0.gettable();
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory7 = slimTableFactoryTest0.slimTableFactory;
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
        org.junit.Assert.assertNull(table6);
        org.junit.Assert.assertNull(slimTableFactory7);
    }

    @Test
    public void test11258() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11258");
        fitnesse.testsystems.slim.tables.SlimTableFactoryTest slimTableFactoryTest0 = new fitnesse.testsystems.slim.tables.SlimTableFactoryTest();
        fitnesse.testsystems.slim.Table table1 = null;
        slimTableFactoryTest0.table = table1;
        fitnesse.testsystems.slim.Table table3 = slimTableFactoryTest0.table;
        fitnesse.testsystems.slim.Table table4 = slimTableFactoryTest0.gettable();
        java.util.Map<java.lang.String, java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable>> strMap5 = slimTableFactoryTest0.getmap();
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory6 = slimTableFactoryTest0.slimTableFactory;
        java.util.Map<java.lang.String, java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable>> strMap7 = slimTableFactoryTest0.getmap();
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory8 = slimTableFactoryTest0.slimTableFactory;
        fitnesse.testsystems.slim.Table table9 = null;
        slimTableFactoryTest0.settable(table9);
        fitnesse.testsystems.slim.Table table11 = null;
        slimTableFactoryTest0.table = table11;
        fitnesse.testsystems.slim.Table table13 = slimTableFactoryTest0.table;
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
        org.junit.Assert.assertNull(strMap7);
        org.junit.Assert.assertNull(slimTableFactory8);
        org.junit.Assert.assertNull(table13);
    }

    @Test
    public void test11259() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11259");
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
        fitnesse.testsystems.slim.Table table11 = slimTableFactoryTest0.gettable();
        // The following exception was thrown during execution in test generation
        try {
            slimTableFactoryTest0.shouldCreateCorrectSlimTableForTablesType();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(table7);
        org.junit.Assert.assertNull(slimTableFactory10);
        org.junit.Assert.assertNull(table11);
    }

    @Test
    public void test11260() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11260");
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
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory14 = null;
        slimTableFactoryTest0.slimTableFactory = slimTableFactory14;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory16 = null;
        slimTableFactoryTest0.slimTableFactory = slimTableFactory16;
        fitnesse.testsystems.slim.Table table18 = slimTableFactoryTest0.gettable();
        org.junit.Assert.assertNull(slimTableFactory1);
        org.junit.Assert.assertNull(table2);
        org.junit.Assert.assertNull(slimTableFactory7);
        org.junit.Assert.assertNull(slimTableFactory8);
        org.junit.Assert.assertNull(table9);
        org.junit.Assert.assertNull(table10);
        org.junit.Assert.assertNull(strMap13);
        org.junit.Assert.assertNull(table18);
    }

    @Test
    public void test11261() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11261");
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
        fitnesse.testsystems.slim.Table table15 = null;
        slimTableFactoryTest0.table = table15;
        java.util.Map<java.lang.String, java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable>> strMap17 = slimTableFactoryTest0.map;
        fitnesse.testsystems.slim.Table table18 = null;
        slimTableFactoryTest0.settable(table18);
        org.junit.Assert.assertNull(strMap5);
        org.junit.Assert.assertNull(strMap6);
        org.junit.Assert.assertNull(slimTableFactory7);
        org.junit.Assert.assertNull(strMap8);
        org.junit.Assert.assertNull(slimTableFactory13);
        org.junit.Assert.assertNull(strMap14);
        org.junit.Assert.assertNull(strMap17);
    }

    @Test
    public void test11262() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11262");
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
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory15 = null;
        slimTableFactoryTest0.setslimTableFactory(slimTableFactory15);
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory17 = null;
        slimTableFactoryTest0.slimTableFactory = slimTableFactory17;
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
        org.junit.Assert.assertNull(slimTableFactory9);
        org.junit.Assert.assertNull(slimTableFactory12);
    }

    @Test
    public void test11263() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11263");
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
        fitnesse.testsystems.slim.Table table13 = slimTableFactoryTest0.table;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory14 = null;
        slimTableFactoryTest0.slimTableFactory = slimTableFactory14;
        java.util.Map<java.lang.String, java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable>> strMap16 = slimTableFactoryTest0.getmap();
        fitnesse.testsystems.slim.Table table17 = slimTableFactoryTest0.table;
        fitnesse.testsystems.slim.Table table18 = null;
        slimTableFactoryTest0.settable(table18);
        fitnesse.testsystems.slim.Table table20 = null;
        slimTableFactoryTest0.settable(table20);
        java.util.Map<java.lang.String, java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable>> strMap22 = slimTableFactoryTest0.map;
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
        org.junit.Assert.assertNull(strMap16);
        org.junit.Assert.assertNull(table17);
        org.junit.Assert.assertNull(strMap22);
    }

    @Test
    public void test11264() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11264");
        fitnesse.testsystems.slim.tables.SlimTableFactoryTest slimTableFactoryTest0 = new fitnesse.testsystems.slim.tables.SlimTableFactoryTest();
        fitnesse.testsystems.slim.Table table1 = slimTableFactoryTest0.table;
        fitnesse.testsystems.slim.Table table2 = null;
        slimTableFactoryTest0.table = table2;
        fitnesse.testsystems.slim.Table table4 = slimTableFactoryTest0.gettable();
        fitnesse.testsystems.slim.Table table5 = null;
        slimTableFactoryTest0.settable(table5);
        fitnesse.testsystems.slim.Table table7 = slimTableFactoryTest0.table;
        // The following exception was thrown during execution in test generation
        try {
            slimTableFactoryTest0.tableTypeStartingWithcommentColonShouldReturnNull();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(table1);
        org.junit.Assert.assertNull(table4);
        org.junit.Assert.assertNull(table7);
    }

    @Test
    public void test11265() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11265");
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
        fitnesse.testsystems.slim.Table table11 = slimTableFactoryTest0.table;
        // The following exception was thrown during execution in test generation
        try {
            slimTableFactoryTest0.commentTableShouldReturnNull();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(slimTableFactory3);
        org.junit.Assert.assertNull(strMap4);
        org.junit.Assert.assertNull(table11);
    }

    @Test
    public void test11266() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11266");
        fitnesse.testsystems.slim.tables.SlimTableFactoryTest slimTableFactoryTest0 = new fitnesse.testsystems.slim.tables.SlimTableFactoryTest();
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory1 = slimTableFactoryTest0.slimTableFactory;
        fitnesse.testsystems.slim.Table table2 = slimTableFactoryTest0.gettable();
        fitnesse.testsystems.slim.Table table3 = null;
        slimTableFactoryTest0.table = table3;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory5 = slimTableFactoryTest0.getslimTableFactory();
        fitnesse.testsystems.slim.Table table6 = null;
        slimTableFactoryTest0.settable(table6);
        java.util.Map<java.lang.String, java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable>> strMap8 = slimTableFactoryTest0.getmap();
        java.util.Map<java.lang.String, java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable>> strMap9 = slimTableFactoryTest0.getmap();
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory10 = null;
        slimTableFactoryTest0.setslimTableFactory(slimTableFactory10);
        java.util.Map<java.lang.String, java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable>> strMap12 = slimTableFactoryTest0.getmap();
        org.junit.Assert.assertNull(slimTableFactory1);
        org.junit.Assert.assertNull(table2);
        org.junit.Assert.assertNull(slimTableFactory5);
        org.junit.Assert.assertNull(strMap8);
        org.junit.Assert.assertNull(strMap9);
        org.junit.Assert.assertNull(strMap12);
    }

    @Test
    public void test11267() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11267");
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
        java.util.Map<java.lang.String, java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable>> strMap13 = slimTableFactoryTest0.getmap();
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
        org.junit.Assert.assertNull(table8);
        org.junit.Assert.assertNull(table9);
        org.junit.Assert.assertNull(strMap10);
        org.junit.Assert.assertNull(strMap13);
    }

    @Test
    public void test11268() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11268");
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
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory13 = null;
        slimTableFactoryTest0.setslimTableFactory(slimTableFactory13);
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory15 = null;
        slimTableFactoryTest0.setslimTableFactory(slimTableFactory15);
        // The following exception was thrown during execution in test generation
        try {
            slimTableFactoryTest0.shouldCreateCorrectSlimTableForTablesType();
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
    public void test11269() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11269");
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
        fitnesse.testsystems.slim.Table table14 = slimTableFactoryTest0.gettable();
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
        org.junit.Assert.assertNull(table14);
    }

    @Test
    public void test11270() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11270");
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
        java.util.Map<java.lang.String, java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable>> strMap10 = slimTableFactoryTest0.map;
        fitnesse.testsystems.slim.Table table11 = slimTableFactoryTest0.gettable();
        java.util.Map<java.lang.String, java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable>> strMap12 = slimTableFactoryTest0.map;
        java.util.Map<java.lang.String, java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable>> strMap13 = slimTableFactoryTest0.map;
        java.lang.Class<?> wildcardClass14 = slimTableFactoryTest0.getClass();
        org.junit.Assert.assertNull(slimTableFactory3);
        org.junit.Assert.assertNull(strMap4);
        org.junit.Assert.assertNull(table9);
        org.junit.Assert.assertNull(strMap10);
        org.junit.Assert.assertNull(table11);
        org.junit.Assert.assertNull(strMap12);
        org.junit.Assert.assertNull(strMap13);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test11271() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11271");
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
        fitnesse.testsystems.slim.Table table13 = null;
        slimTableFactoryTest0.settable(table13);
        fitnesse.testsystems.slim.Table table15 = null;
        slimTableFactoryTest0.table = table15;
        // The following exception was thrown during execution in test generation
        try {
            slimTableFactoryTest0.checkTableTypeDefinesIgnoredIfDifferentSpecified();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(slimTableFactory3);
        org.junit.Assert.assertNull(strMap4);
        org.junit.Assert.assertNull(slimTableFactory9);
        org.junit.Assert.assertNull(table10);
        org.junit.Assert.assertNull(table11);
        org.junit.Assert.assertNull(slimTableFactory12);
    }

    @Test
    public void test11272() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11272");
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
        java.util.Map<java.lang.String, java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable>> strMap13 = slimTableFactoryTest0.getmap();
        fitnesse.testsystems.slim.Table table14 = slimTableFactoryTest0.gettable();
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
        org.junit.Assert.assertNull(table14);
    }

    @Test
    public void test11273() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11273");
        fitnesse.testsystems.slim.tables.SlimTableFactoryTest slimTableFactoryTest0 = new fitnesse.testsystems.slim.tables.SlimTableFactoryTest();
        fitnesse.testsystems.slim.Table table1 = null;
        slimTableFactoryTest0.table = table1;
        fitnesse.testsystems.slim.Table table3 = null;
        slimTableFactoryTest0.settable(table3);
        java.util.Map<java.lang.String, java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable>> strMap5 = slimTableFactoryTest0.map;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory6 = slimTableFactoryTest0.getslimTableFactory();
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory7 = null;
        slimTableFactoryTest0.slimTableFactory = slimTableFactory7;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory9 = null;
        slimTableFactoryTest0.slimTableFactory = slimTableFactory9;
        java.lang.Class<?> wildcardClass11 = slimTableFactoryTest0.getClass();
        org.junit.Assert.assertNull(strMap5);
        org.junit.Assert.assertNull(slimTableFactory6);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test11274() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11274");
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
        java.util.Map<java.lang.String, java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable>> strMap12 = slimTableFactoryTest0.map;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory13 = null;
        slimTableFactoryTest0.setslimTableFactory(slimTableFactory13);
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory15 = slimTableFactoryTest0.getslimTableFactory();
        fitnesse.testsystems.slim.Table table16 = slimTableFactoryTest0.table;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory17 = slimTableFactoryTest0.slimTableFactory;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory18 = slimTableFactoryTest0.getslimTableFactory();
        fitnesse.testsystems.slim.Table table19 = null;
        slimTableFactoryTest0.table = table19;
        org.junit.Assert.assertNull(slimTableFactory1);
        org.junit.Assert.assertNull(table2);
        org.junit.Assert.assertNull(table9);
        org.junit.Assert.assertNull(strMap12);
        org.junit.Assert.assertNull(slimTableFactory15);
        org.junit.Assert.assertNull(table16);
        org.junit.Assert.assertNull(slimTableFactory17);
        org.junit.Assert.assertNull(slimTableFactory18);
    }

    @Test
    public void test11275() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11275");
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
        fitnesse.testsystems.slim.Table table14 = slimTableFactoryTest0.table;
        fitnesse.testsystems.slim.Table table15 = null;
        slimTableFactoryTest0.settable(table15);
        fitnesse.testsystems.slim.Table table17 = null;
        slimTableFactoryTest0.table = table17;
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
        org.junit.Assert.assertNull(table14);
    }

    @Test
    public void test11276() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11276");
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
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory12 = slimTableFactoryTest0.slimTableFactory;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory13 = null;
        slimTableFactoryTest0.slimTableFactory = slimTableFactory13;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory15 = null;
        slimTableFactoryTest0.slimTableFactory = slimTableFactory15;
        java.lang.Class<?> wildcardClass17 = slimTableFactoryTest0.getClass();
        org.junit.Assert.assertNull(table7);
        org.junit.Assert.assertNull(slimTableFactory12);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test11277() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11277");
        fitnesse.testsystems.slim.tables.SlimTableFactoryTest slimTableFactoryTest0 = new fitnesse.testsystems.slim.tables.SlimTableFactoryTest();
        fitnesse.testsystems.slim.Table table1 = null;
        slimTableFactoryTest0.table = table1;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory3 = slimTableFactoryTest0.slimTableFactory;
        java.util.Map<java.lang.String, java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable>> strMap4 = slimTableFactoryTest0.getmap();
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
        org.junit.Assert.assertNull(slimTableFactory3);
        org.junit.Assert.assertNull(strMap4);
        org.junit.Assert.assertNull(slimTableFactory7);
    }

    @Test
    public void test11278() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11278");
        fitnesse.testsystems.slim.tables.SlimTableFactoryTest slimTableFactoryTest0 = new fitnesse.testsystems.slim.tables.SlimTableFactoryTest();
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory1 = slimTableFactoryTest0.slimTableFactory;
        fitnesse.testsystems.slim.Table table2 = slimTableFactoryTest0.gettable();
        fitnesse.testsystems.slim.Table table3 = null;
        slimTableFactoryTest0.table = table3;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory5 = null;
        slimTableFactoryTest0.setslimTableFactory(slimTableFactory5);
        fitnesse.testsystems.slim.Table table7 = slimTableFactoryTest0.table;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory8 = slimTableFactoryTest0.getslimTableFactory();
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory9 = null;
        slimTableFactoryTest0.slimTableFactory = slimTableFactory9;
        fitnesse.testsystems.slim.Table table11 = slimTableFactoryTest0.gettable();
        fitnesse.testsystems.slim.Table table12 = slimTableFactoryTest0.gettable();
        java.util.Map<java.lang.String, java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable>> strMap13 = slimTableFactoryTest0.map;
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
        org.junit.Assert.assertNull(table11);
        org.junit.Assert.assertNull(table12);
        org.junit.Assert.assertNull(strMap13);
    }

    @Test
    public void test11279() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11279");
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
        java.util.Map<java.lang.String, java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable>> strMap12 = slimTableFactoryTest0.map;
        fitnesse.testsystems.slim.Table table13 = slimTableFactoryTest0.table;
        fitnesse.testsystems.slim.Table table14 = null;
        slimTableFactoryTest0.table = table14;
        fitnesse.testsystems.slim.Table table16 = null;
        slimTableFactoryTest0.settable(table16);
        fitnesse.testsystems.slim.Table table18 = null;
        slimTableFactoryTest0.settable(table18);
        org.junit.Assert.assertNull(slimTableFactory3);
        org.junit.Assert.assertNull(strMap4);
        org.junit.Assert.assertNull(strMap9);
        org.junit.Assert.assertNull(strMap12);
        org.junit.Assert.assertNull(table13);
    }

    @Test
    public void test11280() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11280");
        fitnesse.testsystems.slim.tables.SlimTableFactoryTest slimTableFactoryTest0 = new fitnesse.testsystems.slim.tables.SlimTableFactoryTest();
        fitnesse.testsystems.slim.Table table1 = slimTableFactoryTest0.table;
        java.util.Map<java.lang.String, java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable>> strMap2 = slimTableFactoryTest0.getmap();
        java.util.Map<java.lang.String, java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable>> strMap3 = slimTableFactoryTest0.getmap();
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory4 = slimTableFactoryTest0.slimTableFactory;
        fitnesse.testsystems.slim.Table table5 = null;
        slimTableFactoryTest0.table = table5;
        java.util.Map<java.lang.String, java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable>> strMap7 = slimTableFactoryTest0.map;
        fitnesse.testsystems.slim.Table table8 = slimTableFactoryTest0.gettable();
        java.util.Map<java.lang.String, java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable>> strMap9 = slimTableFactoryTest0.map;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory10 = null;
        slimTableFactoryTest0.slimTableFactory = slimTableFactory10;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory12 = null;
        slimTableFactoryTest0.setslimTableFactory(slimTableFactory12);
        fitnesse.testsystems.slim.Table table14 = null;
        slimTableFactoryTest0.settable(table14);
        java.util.Map<java.lang.String, java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable>> strMap16 = slimTableFactoryTest0.map;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory17 = slimTableFactoryTest0.slimTableFactory;
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
        org.junit.Assert.assertNull(strMap7);
        org.junit.Assert.assertNull(table8);
        org.junit.Assert.assertNull(strMap9);
        org.junit.Assert.assertNull(strMap16);
        org.junit.Assert.assertNull(slimTableFactory17);
    }

    @Test
    public void test11281() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11281");
        fitnesse.testsystems.slim.tables.SlimTableFactoryTest slimTableFactoryTest0 = new fitnesse.testsystems.slim.tables.SlimTableFactoryTest();
        fitnesse.testsystems.slim.Table table1 = null;
        slimTableFactoryTest0.table = table1;
        fitnesse.testsystems.slim.Table table3 = null;
        slimTableFactoryTest0.settable(table3);
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory5 = null;
        slimTableFactoryTest0.slimTableFactory = slimTableFactory5;
        fitnesse.testsystems.slim.Table table7 = slimTableFactoryTest0.table;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory8 = null;
        slimTableFactoryTest0.setslimTableFactory(slimTableFactory8);
        org.junit.Assert.assertNull(table7);
    }

    @Test
    public void test11282() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11282");
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
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory11 = slimTableFactoryTest0.slimTableFactory;
        fitnesse.testsystems.slim.Table table12 = slimTableFactoryTest0.table;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory13 = null;
        slimTableFactoryTest0.setslimTableFactory(slimTableFactory13);
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory15 = slimTableFactoryTest0.slimTableFactory;
        org.junit.Assert.assertNull(table1);
        org.junit.Assert.assertNull(strMap2);
        org.junit.Assert.assertNull(table5);
        org.junit.Assert.assertNull(strMap6);
        org.junit.Assert.assertNull(slimTableFactory7);
        org.junit.Assert.assertNull(table8);
        org.junit.Assert.assertNull(strMap9);
        org.junit.Assert.assertNull(table10);
        org.junit.Assert.assertNull(slimTableFactory11);
        org.junit.Assert.assertNull(table12);
        org.junit.Assert.assertNull(slimTableFactory15);
    }

    @Test
    public void test11283() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11283");
        fitnesse.testsystems.slim.tables.SlimTableFactoryTest slimTableFactoryTest0 = new fitnesse.testsystems.slim.tables.SlimTableFactoryTest();
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory1 = slimTableFactoryTest0.slimTableFactory;
        fitnesse.testsystems.slim.Table table2 = slimTableFactoryTest0.gettable();
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory3 = null;
        slimTableFactoryTest0.slimTableFactory = slimTableFactory3;
        fitnesse.testsystems.slim.Table table5 = null;
        slimTableFactoryTest0.settable(table5);
        fitnesse.testsystems.slim.Table table7 = slimTableFactoryTest0.table;
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
    }

    @Test
    public void test11284() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11284");
        fitnesse.testsystems.slim.tables.SlimTableFactoryTest slimTableFactoryTest0 = new fitnesse.testsystems.slim.tables.SlimTableFactoryTest();
        fitnesse.testsystems.slim.Table table1 = null;
        slimTableFactoryTest0.table = table1;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory3 = null;
        slimTableFactoryTest0.setslimTableFactory(slimTableFactory3);
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory5 = slimTableFactoryTest0.slimTableFactory;
        fitnesse.testsystems.slim.Table table6 = slimTableFactoryTest0.table;
        java.util.Map<java.lang.String, java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable>> strMap7 = slimTableFactoryTest0.map;
        fitnesse.testsystems.slim.Table table8 = null;
        slimTableFactoryTest0.settable(table8);
        fitnesse.testsystems.slim.Table table10 = null;
        slimTableFactoryTest0.settable(table10);
        fitnesse.testsystems.slim.Table table12 = slimTableFactoryTest0.table;
        fitnesse.testsystems.slim.Table table13 = slimTableFactoryTest0.gettable();
        // The following exception was thrown during execution in test generation
        try {
            slimTableFactoryTest0.commentTableShouldReturnNull();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(slimTableFactory5);
        org.junit.Assert.assertNull(table6);
        org.junit.Assert.assertNull(strMap7);
        org.junit.Assert.assertNull(table12);
        org.junit.Assert.assertNull(table13);
    }

    @Test
    public void test11285() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11285");
        fitnesse.testsystems.slim.tables.SlimTableFactoryTest slimTableFactoryTest0 = new fitnesse.testsystems.slim.tables.SlimTableFactoryTest();
        fitnesse.testsystems.slim.Table table1 = slimTableFactoryTest0.table;
        fitnesse.testsystems.slim.Table table2 = null;
        slimTableFactoryTest0.table = table2;
        fitnesse.testsystems.slim.Table table4 = null;
        slimTableFactoryTest0.settable(table4);
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory6 = null;
        slimTableFactoryTest0.slimTableFactory = slimTableFactory6;
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
    public void test11286() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11286");
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
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory12 = slimTableFactoryTest0.slimTableFactory;
        fitnesse.testsystems.slim.Table table13 = slimTableFactoryTest0.table;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory14 = null;
        slimTableFactoryTest0.setslimTableFactory(slimTableFactory14);
        // The following exception was thrown during execution in test generation
        try {
            slimTableFactoryTest0.addTableTypeImport("", "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(slimTableFactory5);
        org.junit.Assert.assertNull(slimTableFactory12);
        org.junit.Assert.assertNull(table13);
    }

    @Test
    public void test11287() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11287");
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
        java.util.Map<java.lang.String, java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable>> strMap10 = slimTableFactoryTest0.map;
        fitnesse.testsystems.slim.Table table11 = slimTableFactoryTest0.gettable();
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory12 = slimTableFactoryTest0.getslimTableFactory();
        org.junit.Assert.assertNull(slimTableFactory1);
        org.junit.Assert.assertNull(table2);
        org.junit.Assert.assertNull(strMap3);
        org.junit.Assert.assertNull(table8);
        org.junit.Assert.assertNull(slimTableFactory9);
        org.junit.Assert.assertNull(strMap10);
        org.junit.Assert.assertNull(table11);
        org.junit.Assert.assertNull(slimTableFactory12);
    }

    @Test
    public void test11288() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11288");
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
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory17 = null;
        slimTableFactoryTest0.slimTableFactory = slimTableFactory17;
        java.util.Map<java.lang.String, java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable>> strMap19 = slimTableFactoryTest0.map;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory20 = slimTableFactoryTest0.getslimTableFactory();
        // The following exception was thrown during execution in test generation
        try {
            slimTableFactoryTest0.addTableTypeImport("", "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(table7);
        org.junit.Assert.assertNull(slimTableFactory14);
        org.junit.Assert.assertNull(strMap19);
        org.junit.Assert.assertNull(slimTableFactory20);
    }

    @Test
    public void test11289() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11289");
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
        fitnesse.testsystems.slim.Table table13 = slimTableFactoryTest0.table;
        fitnesse.testsystems.slim.Table table14 = slimTableFactoryTest0.gettable();
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory15 = null;
        slimTableFactoryTest0.setslimTableFactory(slimTableFactory15);
        fitnesse.testsystems.slim.Table table17 = slimTableFactoryTest0.gettable();
        fitnesse.testsystems.slim.Table table18 = null;
        slimTableFactoryTest0.settable(table18);
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
        org.junit.Assert.assertNull(table14);
        org.junit.Assert.assertNull(table17);
    }

    @Test
    public void test11290() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11290");
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
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory12 = null;
        slimTableFactoryTest0.setslimTableFactory(slimTableFactory12);
        java.util.Map<java.lang.String, java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable>> strMap14 = slimTableFactoryTest0.map;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory15 = null;
        slimTableFactoryTest0.setslimTableFactory(slimTableFactory15);
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory17 = slimTableFactoryTest0.slimTableFactory;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory18 = null;
        slimTableFactoryTest0.slimTableFactory = slimTableFactory18;
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
        org.junit.Assert.assertNull(strMap14);
        org.junit.Assert.assertNull(slimTableFactory17);
    }

    @Test
    public void test11291() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11291");
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
        fitnesse.testsystems.slim.Table table13 = slimTableFactoryTest0.table;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory14 = null;
        slimTableFactoryTest0.slimTableFactory = slimTableFactory14;
        java.util.Map<java.lang.String, java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable>> strMap16 = slimTableFactoryTest0.getmap();
        fitnesse.testsystems.slim.Table table17 = null;
        slimTableFactoryTest0.settable(table17);
        org.junit.Assert.assertNull(slimTableFactory3);
        org.junit.Assert.assertNull(strMap4);
        org.junit.Assert.assertNull(table13);
        org.junit.Assert.assertNull(strMap16);
    }

    @Test
    public void test11292() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11292");
        fitnesse.testsystems.slim.tables.SlimTableFactoryTest slimTableFactoryTest0 = new fitnesse.testsystems.slim.tables.SlimTableFactoryTest();
        fitnesse.testsystems.slim.Table table1 = null;
        slimTableFactoryTest0.table = table1;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory3 = slimTableFactoryTest0.getslimTableFactory();
        fitnesse.testsystems.slim.Table table4 = slimTableFactoryTest0.gettable();
        java.util.Map<java.lang.String, java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable>> strMap5 = slimTableFactoryTest0.getmap();
        fitnesse.testsystems.slim.Table table6 = slimTableFactoryTest0.table;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory7 = slimTableFactoryTest0.slimTableFactory;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory8 = null;
        slimTableFactoryTest0.slimTableFactory = slimTableFactory8;
        fitnesse.testsystems.slim.Table table10 = slimTableFactoryTest0.gettable();
        fitnesse.testsystems.slim.Table table11 = null;
        slimTableFactoryTest0.settable(table11);
        fitnesse.testsystems.slim.Table table13 = slimTableFactoryTest0.table;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory14 = null;
        slimTableFactoryTest0.setslimTableFactory(slimTableFactory14);
        org.junit.Assert.assertNull(slimTableFactory3);
        org.junit.Assert.assertNull(table4);
        org.junit.Assert.assertNull(strMap5);
        org.junit.Assert.assertNull(table6);
        org.junit.Assert.assertNull(slimTableFactory7);
        org.junit.Assert.assertNull(table10);
        org.junit.Assert.assertNull(table13);
    }

    @Test
    public void test11293() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11293");
        fitnesse.testsystems.slim.tables.SlimTableFactoryTest slimTableFactoryTest0 = new fitnesse.testsystems.slim.tables.SlimTableFactoryTest();
        fitnesse.testsystems.slim.Table table1 = null;
        slimTableFactoryTest0.table = table1;
        fitnesse.testsystems.slim.Table table3 = null;
        slimTableFactoryTest0.settable(table3);
        java.util.Map<java.lang.String, java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable>> strMap5 = slimTableFactoryTest0.map;
        java.util.Map<java.lang.String, java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable>> strMap6 = slimTableFactoryTest0.getmap();
        java.util.Map<java.lang.String, java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable>> strMap7 = slimTableFactoryTest0.getmap();
        fitnesse.testsystems.slim.Table table8 = slimTableFactoryTest0.table;
        java.util.Map<java.lang.String, java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable>> strMap9 = slimTableFactoryTest0.getmap();
        fitnesse.testsystems.slim.Table table10 = slimTableFactoryTest0.table;
        org.junit.Assert.assertNull(strMap5);
        org.junit.Assert.assertNull(strMap6);
        org.junit.Assert.assertNull(strMap7);
        org.junit.Assert.assertNull(table8);
        org.junit.Assert.assertNull(strMap9);
        org.junit.Assert.assertNull(table10);
    }

    @Test
    public void test11294() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11294");
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
        java.util.Map<java.lang.String, java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable>> strMap10 = slimTableFactoryTest0.getmap();
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory11 = null;
        slimTableFactoryTest0.slimTableFactory = slimTableFactory11;
        java.util.Map<java.lang.String, java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable>> strMap13 = slimTableFactoryTest0.map;
        org.junit.Assert.assertNull(strMap5);
        org.junit.Assert.assertNull(strMap10);
        org.junit.Assert.assertNull(strMap13);
    }

    @Test
    public void test11295() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11295");
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
        java.util.Map<java.lang.String, java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable>> strMap10 = slimTableFactoryTest0.map;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory11 = slimTableFactoryTest0.getslimTableFactory();
        fitnesse.testsystems.slim.Table table12 = null;
        slimTableFactoryTest0.settable(table12);
        java.util.Map<java.lang.String, java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable>> strMap14 = slimTableFactoryTest0.getmap();
        java.util.Map<java.lang.String, java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable>> strMap15 = slimTableFactoryTest0.getmap();
        java.lang.Class<?> wildcardClass16 = slimTableFactoryTest0.getClass();
        org.junit.Assert.assertNull(slimTableFactory1);
        org.junit.Assert.assertNull(table2);
        org.junit.Assert.assertNull(strMap3);
        org.junit.Assert.assertNull(table8);
        org.junit.Assert.assertNull(table9);
        org.junit.Assert.assertNull(strMap10);
        org.junit.Assert.assertNull(slimTableFactory11);
        org.junit.Assert.assertNull(strMap14);
        org.junit.Assert.assertNull(strMap15);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test11296() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11296");
        fitnesse.testsystems.slim.tables.SlimTableFactoryTest slimTableFactoryTest0 = new fitnesse.testsystems.slim.tables.SlimTableFactoryTest();
        fitnesse.testsystems.slim.Table table1 = null;
        slimTableFactoryTest0.table = table1;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory3 = slimTableFactoryTest0.slimTableFactory;
        java.util.Map<java.lang.String, java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable>> strMap4 = slimTableFactoryTest0.map;
        fitnesse.testsystems.slim.Table table5 = slimTableFactoryTest0.table;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory6 = null;
        slimTableFactoryTest0.setslimTableFactory(slimTableFactory6);
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory8 = slimTableFactoryTest0.getslimTableFactory();
        fitnesse.testsystems.slim.Table table9 = slimTableFactoryTest0.gettable();
        fitnesse.testsystems.slim.Table table10 = null;
        slimTableFactoryTest0.settable(table10);
        java.util.Map<java.lang.String, java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable>> strMap12 = slimTableFactoryTest0.getmap();
        fitnesse.testsystems.slim.Table table13 = slimTableFactoryTest0.table;
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
        org.junit.Assert.assertNull(slimTableFactory8);
        org.junit.Assert.assertNull(table9);
        org.junit.Assert.assertNull(strMap12);
        org.junit.Assert.assertNull(table13);
    }

    @Test
    public void test11297() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11297");
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
        java.util.Map<java.lang.String, java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable>> strMap11 = slimTableFactoryTest0.map;
        // The following exception was thrown during execution in test generation
        try {
            slimTableFactoryTest0.addTableTypeImport("", "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(slimTableFactory3);
        org.junit.Assert.assertNull(table8);
        org.junit.Assert.assertNull(strMap11);
    }

    @Test
    public void test11298() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11298");
        fitnesse.testsystems.slim.tables.SlimTableFactoryTest slimTableFactoryTest0 = new fitnesse.testsystems.slim.tables.SlimTableFactoryTest();
        fitnesse.testsystems.slim.Table table1 = null;
        slimTableFactoryTest0.table = table1;
        fitnesse.testsystems.slim.Table table3 = null;
        slimTableFactoryTest0.settable(table3);
        fitnesse.testsystems.slim.Table table5 = null;
        slimTableFactoryTest0.table = table5;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory7 = null;
        slimTableFactoryTest0.setslimTableFactory(slimTableFactory7);
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory9 = slimTableFactoryTest0.getslimTableFactory();
        fitnesse.testsystems.slim.Table table10 = null;
        slimTableFactoryTest0.table = table10;
        // The following exception was thrown during execution in test generation
        try {
            slimTableFactoryTest0.addTableTypeImport("", "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(slimTableFactory9);
    }

    @Test
    public void test11299() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11299");
        fitnesse.testsystems.slim.tables.SlimTableFactoryTest slimTableFactoryTest0 = new fitnesse.testsystems.slim.tables.SlimTableFactoryTest();
        fitnesse.testsystems.slim.Table table1 = null;
        slimTableFactoryTest0.table = table1;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory3 = null;
        slimTableFactoryTest0.setslimTableFactory(slimTableFactory3);
        java.util.Map<java.lang.String, java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable>> strMap5 = slimTableFactoryTest0.map;
        fitnesse.testsystems.slim.Table table6 = null;
        slimTableFactoryTest0.table = table6;
        fitnesse.testsystems.slim.Table table8 = slimTableFactoryTest0.table;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory9 = slimTableFactoryTest0.getslimTableFactory();
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory10 = null;
        slimTableFactoryTest0.slimTableFactory = slimTableFactory10;
        fitnesse.testsystems.slim.Table table12 = slimTableFactoryTest0.gettable();
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory13 = null;
        slimTableFactoryTest0.setslimTableFactory(slimTableFactory13);
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory15 = null;
        slimTableFactoryTest0.slimTableFactory = slimTableFactory15;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory17 = slimTableFactoryTest0.getslimTableFactory();
        fitnesse.testsystems.slim.Table table18 = null;
        slimTableFactoryTest0.table = table18;
        org.junit.Assert.assertNull(strMap5);
        org.junit.Assert.assertNull(table8);
        org.junit.Assert.assertNull(slimTableFactory9);
        org.junit.Assert.assertNull(table12);
        org.junit.Assert.assertNull(slimTableFactory17);
    }

    @Test
    public void test11300() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11300");
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
        java.util.Map<java.lang.String, java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable>> strMap18 = slimTableFactoryTest0.map;
        fitnesse.testsystems.slim.Table table19 = null;
        slimTableFactoryTest0.table = table19;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory21 = slimTableFactoryTest0.slimTableFactory;
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
        org.junit.Assert.assertNull(strMap15);
        org.junit.Assert.assertNull(strMap18);
        org.junit.Assert.assertNull(slimTableFactory21);
    }

    @Test
    public void test11301() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11301");
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
        java.util.Map<java.lang.String, java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable>> strMap10 = slimTableFactoryTest0.getmap();
        fitnesse.testsystems.slim.Table table11 = slimTableFactoryTest0.gettable();
        fitnesse.testsystems.slim.Table table12 = slimTableFactoryTest0.table;
        java.util.Map<java.lang.String, java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable>> strMap13 = slimTableFactoryTest0.getmap();
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory14 = null;
        slimTableFactoryTest0.slimTableFactory = slimTableFactory14;
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
        org.junit.Assert.assertNull(strMap10);
        org.junit.Assert.assertNull(table11);
        org.junit.Assert.assertNull(table12);
        org.junit.Assert.assertNull(strMap13);
    }

    @Test
    public void test11302() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11302");
        fitnesse.testsystems.slim.tables.SlimTableFactoryTest slimTableFactoryTest0 = new fitnesse.testsystems.slim.tables.SlimTableFactoryTest();
        fitnesse.testsystems.slim.Table table1 = null;
        slimTableFactoryTest0.table = table1;
        fitnesse.testsystems.slim.Table table3 = slimTableFactoryTest0.gettable();
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory4 = slimTableFactoryTest0.getslimTableFactory();
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory5 = null;
        slimTableFactoryTest0.setslimTableFactory(slimTableFactory5);
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory7 = slimTableFactoryTest0.slimTableFactory;
        java.util.Map<java.lang.String, java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable>> strMap8 = slimTableFactoryTest0.getmap();
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory9 = slimTableFactoryTest0.slimTableFactory;
        // The following exception was thrown during execution in test generation
        try {
            slimTableFactoryTest0.shouldCreateCorrectSlimTableForTablesType();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(table3);
        org.junit.Assert.assertNull(slimTableFactory4);
        org.junit.Assert.assertNull(slimTableFactory7);
        org.junit.Assert.assertNull(strMap8);
        org.junit.Assert.assertNull(slimTableFactory9);
    }

    @Test
    public void test11303() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11303");
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
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory10 = slimTableFactoryTest0.getslimTableFactory();
        java.util.Map<java.lang.String, java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable>> strMap11 = slimTableFactoryTest0.map;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory12 = slimTableFactoryTest0.slimTableFactory;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory13 = slimTableFactoryTest0.getslimTableFactory();
        fitnesse.testsystems.slim.Table table14 = slimTableFactoryTest0.table;
        java.util.Map<java.lang.String, java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable>> strMap15 = slimTableFactoryTest0.getmap();
        org.junit.Assert.assertNull(slimTableFactory3);
        org.junit.Assert.assertNull(strMap4);
        org.junit.Assert.assertNull(table7);
        org.junit.Assert.assertNull(slimTableFactory10);
        org.junit.Assert.assertNull(strMap11);
        org.junit.Assert.assertNull(slimTableFactory12);
        org.junit.Assert.assertNull(slimTableFactory13);
        org.junit.Assert.assertNull(table14);
        org.junit.Assert.assertNull(strMap15);
    }

    @Test
    public void test11304() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11304");
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
        java.util.Map<java.lang.String, java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable>> strMap16 = slimTableFactoryTest0.getmap();
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory17 = slimTableFactoryTest0.getslimTableFactory();
        fitnesse.testsystems.slim.Table table18 = slimTableFactoryTest0.table;
        java.util.Map<java.lang.String, java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable>> strMap19 = slimTableFactoryTest0.map;
        java.lang.Class<?> wildcardClass20 = slimTableFactoryTest0.getClass();
        org.junit.Assert.assertNull(slimTableFactory3);
        org.junit.Assert.assertNull(strMap4);
        org.junit.Assert.assertNull(table9);
        org.junit.Assert.assertNull(table10);
        org.junit.Assert.assertNull(strMap11);
        org.junit.Assert.assertNull(strMap16);
        org.junit.Assert.assertNull(slimTableFactory17);
        org.junit.Assert.assertNull(table18);
        org.junit.Assert.assertNull(strMap19);
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test11305() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11305");
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
        java.util.Map<java.lang.String, java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable>> strMap16 = slimTableFactoryTest0.map;
        fitnesse.testsystems.slim.Table table17 = slimTableFactoryTest0.gettable();
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory18 = slimTableFactoryTest0.slimTableFactory;
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
        org.junit.Assert.assertNull(table15);
        org.junit.Assert.assertNull(strMap16);
        org.junit.Assert.assertNull(table17);
        org.junit.Assert.assertNull(slimTableFactory18);
    }

    @Test
    public void test11306() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11306");
        fitnesse.testsystems.slim.tables.SlimTableFactoryTest slimTableFactoryTest0 = new fitnesse.testsystems.slim.tables.SlimTableFactoryTest();
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory1 = slimTableFactoryTest0.slimTableFactory;
        fitnesse.testsystems.slim.Table table2 = slimTableFactoryTest0.table;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory3 = null;
        slimTableFactoryTest0.setslimTableFactory(slimTableFactory3);
        fitnesse.testsystems.slim.Table table5 = null;
        slimTableFactoryTest0.settable(table5);
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory7 = null;
        slimTableFactoryTest0.slimTableFactory = slimTableFactory7;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory9 = null;
        slimTableFactoryTest0.slimTableFactory = slimTableFactory9;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory11 = null;
        slimTableFactoryTest0.slimTableFactory = slimTableFactory11;
        fitnesse.testsystems.slim.Table table13 = null;
        slimTableFactoryTest0.settable(table13);
        java.util.Map<java.lang.String, java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable>> strMap15 = slimTableFactoryTest0.getmap();
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory16 = null;
        slimTableFactoryTest0.slimTableFactory = slimTableFactory16;
        java.util.Map<java.lang.String, java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable>> strMap18 = slimTableFactoryTest0.getmap();
        fitnesse.testsystems.slim.Table table19 = slimTableFactoryTest0.table;
        org.junit.Assert.assertNull(slimTableFactory1);
        org.junit.Assert.assertNull(table2);
        org.junit.Assert.assertNull(strMap15);
        org.junit.Assert.assertNull(strMap18);
        org.junit.Assert.assertNull(table19);
    }

    @Test
    public void test11307() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11307");
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
        fitnesse.testsystems.slim.Table table10 = null;
        slimTableFactoryTest0.table = table10;
        java.util.Map<java.lang.String, java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable>> strMap12 = slimTableFactoryTest0.getmap();
        java.util.Map<java.lang.String, java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable>> strMap13 = slimTableFactoryTest0.getmap();
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory14 = slimTableFactoryTest0.getslimTableFactory();
        // The following exception was thrown during execution in test generation
        try {
            slimTableFactoryTest0.checkTableTypeDefinesIgnoredIfDifferentSpecified();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(strMap7);
        org.junit.Assert.assertNull(strMap8);
        org.junit.Assert.assertNull(table9);
        org.junit.Assert.assertNull(strMap12);
        org.junit.Assert.assertNull(strMap13);
        org.junit.Assert.assertNull(slimTableFactory14);
    }

    @Test
    public void test11308() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11308");
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
        fitnesse.testsystems.slim.Table table12 = null;
        slimTableFactoryTest0.table = table12;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory14 = null;
        slimTableFactoryTest0.setslimTableFactory(slimTableFactory14);
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory16 = slimTableFactoryTest0.getslimTableFactory();
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
        org.junit.Assert.assertNull(slimTableFactory16);
    }

    @Test
    public void test11309() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11309");
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
        fitnesse.testsystems.slim.Table table19 = null;
        slimTableFactoryTest0.settable(table19);
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory21 = slimTableFactoryTest0.slimTableFactory;
        fitnesse.testsystems.slim.Table table22 = slimTableFactoryTest0.table;
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
        org.junit.Assert.assertNull(strMap18);
        org.junit.Assert.assertNull(slimTableFactory21);
        org.junit.Assert.assertNull(table22);
    }

    @Test
    public void test11310() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11310");
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
        java.util.Map<java.lang.String, java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable>> strMap13 = slimTableFactoryTest0.map;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory14 = slimTableFactoryTest0.getslimTableFactory();
        fitnesse.testsystems.slim.Table table15 = null;
        slimTableFactoryTest0.settable(table15);
        org.junit.Assert.assertNull(slimTableFactory1);
        org.junit.Assert.assertNull(table2);
        org.junit.Assert.assertNull(slimTableFactory7);
        org.junit.Assert.assertNull(slimTableFactory8);
        org.junit.Assert.assertNull(table9);
        org.junit.Assert.assertNull(strMap12);
        org.junit.Assert.assertNull(strMap13);
        org.junit.Assert.assertNull(slimTableFactory14);
    }

    @Test
    public void test11311() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11311");
        fitnesse.testsystems.slim.tables.SlimTableFactoryTest slimTableFactoryTest0 = new fitnesse.testsystems.slim.tables.SlimTableFactoryTest();
        fitnesse.testsystems.slim.Table table1 = null;
        slimTableFactoryTest0.table = table1;
        fitnesse.testsystems.slim.Table table3 = null;
        slimTableFactoryTest0.settable(table3);
        java.util.Map<java.lang.String, java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable>> strMap5 = slimTableFactoryTest0.map;
        java.util.Map<java.lang.String, java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable>> strMap6 = slimTableFactoryTest0.getmap();
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory7 = slimTableFactoryTest0.slimTableFactory;
        fitnesse.testsystems.slim.Table table8 = slimTableFactoryTest0.table;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory9 = null;
        slimTableFactoryTest0.setslimTableFactory(slimTableFactory9);
        java.util.Map<java.lang.String, java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable>> strMap11 = slimTableFactoryTest0.getmap();
        java.util.Map<java.lang.String, java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable>> strMap12 = slimTableFactoryTest0.getmap();
        fitnesse.testsystems.slim.Table table13 = slimTableFactoryTest0.table;
        java.util.Map<java.lang.String, java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable>> strMap14 = slimTableFactoryTest0.getmap();
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory15 = null;
        slimTableFactoryTest0.setslimTableFactory(slimTableFactory15);
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory17 = null;
        slimTableFactoryTest0.slimTableFactory = slimTableFactory17;
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
        org.junit.Assert.assertNull(strMap11);
        org.junit.Assert.assertNull(strMap12);
        org.junit.Assert.assertNull(table13);
        org.junit.Assert.assertNull(strMap14);
    }

    @Test
    public void test11312() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11312");
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
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory11 = slimTableFactoryTest0.getslimTableFactory();
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory12 = null;
        slimTableFactoryTest0.slimTableFactory = slimTableFactory12;
        java.lang.Class<?> wildcardClass14 = slimTableFactoryTest0.getClass();
        org.junit.Assert.assertNull(strMap5);
        org.junit.Assert.assertNull(slimTableFactory6);
        org.junit.Assert.assertNull(slimTableFactory7);
        org.junit.Assert.assertNull(strMap8);
        org.junit.Assert.assertNull(strMap9);
        org.junit.Assert.assertNull(table10);
        org.junit.Assert.assertNull(slimTableFactory11);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test11313() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11313");
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
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory15 = slimTableFactoryTest0.getslimTableFactory();
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory16 = slimTableFactoryTest0.getslimTableFactory();
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory17 = slimTableFactoryTest0.getslimTableFactory();
        java.util.Map<java.lang.String, java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable>> strMap18 = slimTableFactoryTest0.getmap();
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory19 = null;
        slimTableFactoryTest0.slimTableFactory = slimTableFactory19;
        org.junit.Assert.assertNull(strMap5);
        org.junit.Assert.assertNull(strMap6);
        org.junit.Assert.assertNull(slimTableFactory7);
        org.junit.Assert.assertNull(strMap8);
        org.junit.Assert.assertNull(slimTableFactory13);
        org.junit.Assert.assertNull(strMap14);
        org.junit.Assert.assertNull(slimTableFactory15);
        org.junit.Assert.assertNull(slimTableFactory16);
        org.junit.Assert.assertNull(slimTableFactory17);
        org.junit.Assert.assertNull(strMap18);
    }

    @Test
    public void test11314() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11314");
        fitnesse.testsystems.slim.tables.SlimTableFactoryTest slimTableFactoryTest0 = new fitnesse.testsystems.slim.tables.SlimTableFactoryTest();
        fitnesse.testsystems.slim.Table table1 = null;
        slimTableFactoryTest0.table = table1;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory3 = slimTableFactoryTest0.getslimTableFactory();
        fitnesse.testsystems.slim.Table table4 = slimTableFactoryTest0.gettable();
        java.util.Map<java.lang.String, java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable>> strMap5 = slimTableFactoryTest0.getmap();
        fitnesse.testsystems.slim.Table table6 = slimTableFactoryTest0.table;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory7 = slimTableFactoryTest0.slimTableFactory;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory8 = slimTableFactoryTest0.slimTableFactory;
        fitnesse.testsystems.slim.Table table9 = null;
        slimTableFactoryTest0.table = table9;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory11 = slimTableFactoryTest0.getslimTableFactory();
        // The following exception was thrown during execution in test generation
        try {
            slimTableFactoryTest0.checkTableTypeDefineUsedForTable();
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
        org.junit.Assert.assertNull(slimTableFactory11);
    }

    @Test
    public void test11315() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11315");
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
        fitnesse.testsystems.slim.Table table10 = slimTableFactoryTest0.gettable();
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory11 = null;
        slimTableFactoryTest0.setslimTableFactory(slimTableFactory11);
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
        org.junit.Assert.assertNull(table10);
    }

    @Test
    public void test11316() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11316");
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
        fitnesse.testsystems.slim.Table table18 = null;
        slimTableFactoryTest0.settable(table18);
        // The following exception was thrown during execution in test generation
        try {
            slimTableFactoryTest0.shouldCreateCorrectSlimTableForTablesType();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(slimTableFactory3);
        org.junit.Assert.assertNull(strMap4);
        org.junit.Assert.assertNull(strMap17);
    }

    @Test
    public void test11317() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11317");
        fitnesse.testsystems.slim.tables.SlimTableFactoryTest slimTableFactoryTest0 = new fitnesse.testsystems.slim.tables.SlimTableFactoryTest();
        fitnesse.testsystems.slim.Table table1 = null;
        slimTableFactoryTest0.table = table1;
        fitnesse.testsystems.slim.Table table3 = null;
        slimTableFactoryTest0.settable(table3);
        java.util.Map<java.lang.String, java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable>> strMap5 = slimTableFactoryTest0.map;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory6 = slimTableFactoryTest0.getslimTableFactory();
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory7 = slimTableFactoryTest0.getslimTableFactory();
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory8 = slimTableFactoryTest0.slimTableFactory;
        fitnesse.testsystems.slim.Table table9 = null;
        slimTableFactoryTest0.table = table9;
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
        org.junit.Assert.assertNull(slimTableFactory8);
    }

    @Test
    public void test11318() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11318");
        fitnesse.testsystems.slim.tables.SlimTableFactoryTest slimTableFactoryTest0 = new fitnesse.testsystems.slim.tables.SlimTableFactoryTest();
        fitnesse.testsystems.slim.Table table1 = slimTableFactoryTest0.table;
        java.util.Map<java.lang.String, java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable>> strMap2 = slimTableFactoryTest0.getmap();
        fitnesse.testsystems.slim.Table table3 = null;
        slimTableFactoryTest0.table = table3;
        fitnesse.testsystems.slim.Table table5 = slimTableFactoryTest0.gettable();
        fitnesse.testsystems.slim.Table table6 = null;
        slimTableFactoryTest0.table = table6;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory8 = slimTableFactoryTest0.slimTableFactory;
        fitnesse.testsystems.slim.Table table9 = slimTableFactoryTest0.gettable();
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
        org.junit.Assert.assertNull(table9);
    }

    @Test
    public void test11319() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11319");
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
        slimTableFactoryTest0.table = table14;
        fitnesse.testsystems.slim.Table table16 = null;
        slimTableFactoryTest0.table = table16;
        java.util.Map<java.lang.String, java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable>> strMap18 = slimTableFactoryTest0.getmap();
        fitnesse.testsystems.slim.Table table19 = slimTableFactoryTest0.table;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory20 = slimTableFactoryTest0.slimTableFactory;
        org.junit.Assert.assertNull(strMap7);
        org.junit.Assert.assertNull(slimTableFactory12);
        org.junit.Assert.assertNull(table13);
        org.junit.Assert.assertNull(strMap18);
        org.junit.Assert.assertNull(table19);
        org.junit.Assert.assertNull(slimTableFactory20);
    }

    @Test
    public void test11320() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11320");
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
        java.util.Map<java.lang.String, java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable>> strMap12 = slimTableFactoryTest0.getmap();
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory13 = null;
        slimTableFactoryTest0.slimTableFactory = slimTableFactory13;
        java.util.Map<java.lang.String, java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable>> strMap15 = slimTableFactoryTest0.map;
        org.junit.Assert.assertNull(slimTableFactory1);
        org.junit.Assert.assertNull(table2);
        org.junit.Assert.assertNull(slimTableFactory7);
        org.junit.Assert.assertNull(slimTableFactory8);
        org.junit.Assert.assertNull(table11);
        org.junit.Assert.assertNull(strMap12);
        org.junit.Assert.assertNull(strMap15);
    }

    @Test
    public void test11321() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11321");
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
        // The following exception was thrown during execution in test generation
        try {
            slimTableFactoryTest0.checkTableTypeDefinesIgnoredIfDifferentSpecified();
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
    public void test11322() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11322");
        fitnesse.testsystems.slim.tables.SlimTableFactoryTest slimTableFactoryTest0 = new fitnesse.testsystems.slim.tables.SlimTableFactoryTest();
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory1 = slimTableFactoryTest0.slimTableFactory;
        fitnesse.testsystems.slim.Table table2 = slimTableFactoryTest0.gettable();
        fitnesse.testsystems.slim.Table table3 = null;
        slimTableFactoryTest0.table = table3;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory5 = null;
        slimTableFactoryTest0.setslimTableFactory(slimTableFactory5);
        java.util.Map<java.lang.String, java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable>> strMap7 = slimTableFactoryTest0.map;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory8 = slimTableFactoryTest0.slimTableFactory;
        java.util.Map<java.lang.String, java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable>> strMap9 = slimTableFactoryTest0.map;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory10 = slimTableFactoryTest0.getslimTableFactory();
        fitnesse.testsystems.slim.Table table11 = slimTableFactoryTest0.gettable();
        org.junit.Assert.assertNull(slimTableFactory1);
        org.junit.Assert.assertNull(table2);
        org.junit.Assert.assertNull(strMap7);
        org.junit.Assert.assertNull(slimTableFactory8);
        org.junit.Assert.assertNull(strMap9);
        org.junit.Assert.assertNull(slimTableFactory10);
        org.junit.Assert.assertNull(table11);
    }

    @Test
    public void test11323() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11323");
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
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory12 = slimTableFactoryTest0.getslimTableFactory();
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory13 = null;
        slimTableFactoryTest0.slimTableFactory = slimTableFactory13;
        fitnesse.testsystems.slim.Table table15 = slimTableFactoryTest0.table;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory16 = slimTableFactoryTest0.getslimTableFactory();
        fitnesse.testsystems.slim.Table table17 = slimTableFactoryTest0.table;
        // The following exception was thrown during execution in test generation
        try {
            slimTableFactoryTest0.addTableTypeImport("", "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(slimTableFactory5);
        org.junit.Assert.assertNull(slimTableFactory12);
        org.junit.Assert.assertNull(table15);
        org.junit.Assert.assertNull(slimTableFactory16);
        org.junit.Assert.assertNull(table17);
    }

    @Test
    public void test11324() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11324");
        fitnesse.testsystems.slim.tables.SlimTableFactoryTest slimTableFactoryTest0 = new fitnesse.testsystems.slim.tables.SlimTableFactoryTest();
        fitnesse.testsystems.slim.Table table1 = null;
        slimTableFactoryTest0.table = table1;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory3 = null;
        slimTableFactoryTest0.setslimTableFactory(slimTableFactory3);
        java.util.Map<java.lang.String, java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable>> strMap5 = slimTableFactoryTest0.map;
        fitnesse.testsystems.slim.Table table6 = null;
        slimTableFactoryTest0.table = table6;
        fitnesse.testsystems.slim.Table table8 = slimTableFactoryTest0.table;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory9 = slimTableFactoryTest0.getslimTableFactory();
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory10 = null;
        slimTableFactoryTest0.slimTableFactory = slimTableFactory10;
        fitnesse.testsystems.slim.Table table12 = slimTableFactoryTest0.gettable();
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory13 = null;
        slimTableFactoryTest0.setslimTableFactory(slimTableFactory13);
        fitnesse.testsystems.slim.Table table15 = slimTableFactoryTest0.table;
        java.util.Map<java.lang.String, java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable>> strMap16 = slimTableFactoryTest0.map;
        // The following exception was thrown during execution in test generation
        try {
            slimTableFactoryTest0.commentTableShouldReturnNull();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(strMap5);
        org.junit.Assert.assertNull(table8);
        org.junit.Assert.assertNull(slimTableFactory9);
        org.junit.Assert.assertNull(table12);
        org.junit.Assert.assertNull(table15);
        org.junit.Assert.assertNull(strMap16);
    }

    @Test
    public void test11325() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11325");
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
        fitnesse.testsystems.slim.Table table10 = slimTableFactoryTest0.table;
        fitnesse.testsystems.slim.Table table11 = null;
        slimTableFactoryTest0.settable(table11);
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
        org.junit.Assert.assertNull(table10);
    }

    @Test
    public void test11326() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11326");
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
        java.util.Map<java.lang.String, java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable>> strMap10 = slimTableFactoryTest0.map;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory11 = slimTableFactoryTest0.slimTableFactory;
        fitnesse.testsystems.slim.Table table12 = null;
        slimTableFactoryTest0.table = table12;
        org.junit.Assert.assertNull(slimTableFactory3);
        org.junit.Assert.assertNull(slimTableFactory4);
        org.junit.Assert.assertNull(slimTableFactory5);
        org.junit.Assert.assertNull(strMap10);
        org.junit.Assert.assertNull(slimTableFactory11);
    }

    @Test
    public void test11327() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11327");
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
        java.util.Map<java.lang.String, java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable>> strMap12 = slimTableFactoryTest0.getmap();
        fitnesse.testsystems.slim.Table table13 = slimTableFactoryTest0.gettable();
        org.junit.Assert.assertNull(slimTableFactory5);
        org.junit.Assert.assertNull(slimTableFactory8);
        org.junit.Assert.assertNull(table9);
        org.junit.Assert.assertNull(strMap12);
        org.junit.Assert.assertNull(table13);
    }

    @Test
    public void test11328() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11328");
        fitnesse.testsystems.slim.tables.SlimTableFactoryTest slimTableFactoryTest0 = new fitnesse.testsystems.slim.tables.SlimTableFactoryTest();
        fitnesse.testsystems.slim.Table table1 = slimTableFactoryTest0.table;
        java.util.Map<java.lang.String, java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable>> strMap2 = slimTableFactoryTest0.getmap();
        fitnesse.testsystems.slim.Table table3 = null;
        slimTableFactoryTest0.table = table3;
        fitnesse.testsystems.slim.Table table5 = slimTableFactoryTest0.table;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory6 = null;
        slimTableFactoryTest0.setslimTableFactory(slimTableFactory6);
        java.util.Map<java.lang.String, java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable>> strMap8 = slimTableFactoryTest0.map;
        fitnesse.testsystems.slim.Table table9 = slimTableFactoryTest0.gettable();
        java.util.Map<java.lang.String, java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable>> strMap10 = slimTableFactoryTest0.getmap();
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
        org.junit.Assert.assertNull(strMap8);
        org.junit.Assert.assertNull(table9);
        org.junit.Assert.assertNull(strMap10);
    }

    @Test
    public void test11329() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11329");
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
        slimTableFactoryTest0.setslimTableFactory(slimTableFactory13);
        // The following exception was thrown during execution in test generation
        try {
            slimTableFactoryTest0.addTableTypeImport("", "hi!");
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
    public void test11330() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11330");
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
        slimTableFactoryTest0.setslimTableFactory(slimTableFactory16);
        fitnesse.testsystems.slim.Table table18 = slimTableFactoryTest0.table;
        java.util.Map<java.lang.String, java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable>> strMap19 = slimTableFactoryTest0.map;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory20 = slimTableFactoryTest0.slimTableFactory;
        fitnesse.testsystems.slim.Table table21 = null;
        slimTableFactoryTest0.table = table21;
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
        org.junit.Assert.assertNull(strMap15);
        org.junit.Assert.assertNull(table18);
        org.junit.Assert.assertNull(strMap19);
        org.junit.Assert.assertNull(slimTableFactory20);
    }

    @Test
    public void test11331() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11331");
        fitnesse.testsystems.slim.tables.SlimTableFactoryTest slimTableFactoryTest0 = new fitnesse.testsystems.slim.tables.SlimTableFactoryTest();
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory1 = slimTableFactoryTest0.slimTableFactory;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory2 = slimTableFactoryTest0.slimTableFactory;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory3 = slimTableFactoryTest0.slimTableFactory;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory4 = null;
        slimTableFactoryTest0.slimTableFactory = slimTableFactory4;
        java.util.Map<java.lang.String, java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable>> strMap6 = slimTableFactoryTest0.map;
        fitnesse.testsystems.slim.Table table7 = slimTableFactoryTest0.table;
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
        org.junit.Assert.assertNull(strMap6);
        org.junit.Assert.assertNull(table7);
    }

    @Test
    public void test11332() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11332");
        fitnesse.testsystems.slim.tables.SlimTableFactoryTest slimTableFactoryTest0 = new fitnesse.testsystems.slim.tables.SlimTableFactoryTest();
        fitnesse.testsystems.slim.Table table1 = null;
        slimTableFactoryTest0.table = table1;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory3 = null;
        slimTableFactoryTest0.setslimTableFactory(slimTableFactory3);
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory5 = null;
        slimTableFactoryTest0.slimTableFactory = slimTableFactory5;
        java.util.Map<java.lang.String, java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable>> strMap7 = slimTableFactoryTest0.getmap();
        java.util.Map<java.lang.String, java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable>> strMap8 = slimTableFactoryTest0.getmap();
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory9 = null;
        slimTableFactoryTest0.setslimTableFactory(slimTableFactory9);
        org.junit.Assert.assertNull(strMap7);
        org.junit.Assert.assertNull(strMap8);
    }

    @Test
    public void test11333() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11333");
        fitnesse.testsystems.slim.tables.SlimTableFactoryTest slimTableFactoryTest0 = new fitnesse.testsystems.slim.tables.SlimTableFactoryTest();
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory1 = slimTableFactoryTest0.slimTableFactory;
        fitnesse.testsystems.slim.Table table2 = slimTableFactoryTest0.table;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory3 = null;
        slimTableFactoryTest0.setslimTableFactory(slimTableFactory3);
        fitnesse.testsystems.slim.Table table5 = null;
        slimTableFactoryTest0.settable(table5);
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory7 = null;
        slimTableFactoryTest0.slimTableFactory = slimTableFactory7;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory9 = null;
        slimTableFactoryTest0.slimTableFactory = slimTableFactory9;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory11 = null;
        slimTableFactoryTest0.slimTableFactory = slimTableFactory11;
        fitnesse.testsystems.slim.Table table13 = null;
        slimTableFactoryTest0.settable(table13);
        java.util.Map<java.lang.String, java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable>> strMap15 = slimTableFactoryTest0.getmap();
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory16 = null;
        slimTableFactoryTest0.slimTableFactory = slimTableFactory16;
        java.util.Map<java.lang.String, java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable>> strMap18 = slimTableFactoryTest0.map;
        // The following exception was thrown during execution in test generation
        try {
            slimTableFactoryTest0.shouldCreateCorrectSlimTableForTablesType();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(slimTableFactory1);
        org.junit.Assert.assertNull(table2);
        org.junit.Assert.assertNull(strMap15);
        org.junit.Assert.assertNull(strMap18);
    }

    @Test
    public void test11334() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11334");
        fitnesse.testsystems.slim.tables.SlimTableFactoryTest slimTableFactoryTest0 = new fitnesse.testsystems.slim.tables.SlimTableFactoryTest();
        fitnesse.testsystems.slim.Table table1 = null;
        slimTableFactoryTest0.table = table1;
        fitnesse.testsystems.slim.Table table3 = null;
        slimTableFactoryTest0.settable(table3);
        fitnesse.testsystems.slim.Table table5 = null;
        slimTableFactoryTest0.settable(table5);
        fitnesse.testsystems.slim.Table table7 = null;
        slimTableFactoryTest0.table = table7;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory9 = slimTableFactoryTest0.getslimTableFactory();
        java.util.Map<java.lang.String, java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable>> strMap10 = slimTableFactoryTest0.getmap();
        java.util.Map<java.lang.String, java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable>> strMap11 = slimTableFactoryTest0.map;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass12 = strMap11.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(slimTableFactory9);
        org.junit.Assert.assertNull(strMap10);
        org.junit.Assert.assertNull(strMap11);
    }

    @Test
    public void test11335() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11335");
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
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory16 = slimTableFactoryTest0.getslimTableFactory();
        java.util.Map<java.lang.String, java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable>> strMap17 = slimTableFactoryTest0.map;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory18 = slimTableFactoryTest0.slimTableFactory;
        // The following exception was thrown during execution in test generation
        try {
            slimTableFactoryTest0.commentTableShouldReturnNull();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(slimTableFactory5);
        org.junit.Assert.assertNull(strMap10);
        org.junit.Assert.assertNull(strMap13);
        org.junit.Assert.assertNull(slimTableFactory14);
        org.junit.Assert.assertNull(slimTableFactory15);
        org.junit.Assert.assertNull(slimTableFactory16);
        org.junit.Assert.assertNull(strMap17);
        org.junit.Assert.assertNull(slimTableFactory18);
    }

    @Test
    public void test11336() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11336");
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
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory10 = null;
        slimTableFactoryTest0.setslimTableFactory(slimTableFactory10);
        java.util.Map<java.lang.String, java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable>> strMap12 = slimTableFactoryTest0.map;
        java.util.Map<java.lang.String, java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable>> strMap13 = slimTableFactoryTest0.map;
        fitnesse.testsystems.slim.Table table14 = slimTableFactoryTest0.table;
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
        org.junit.Assert.assertNull(slimTableFactory9);
        org.junit.Assert.assertNull(strMap12);
        org.junit.Assert.assertNull(strMap13);
        org.junit.Assert.assertNull(table14);
    }

    @Test
    public void test11337() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11337");
        fitnesse.testsystems.slim.tables.SlimTableFactoryTest slimTableFactoryTest0 = new fitnesse.testsystems.slim.tables.SlimTableFactoryTest();
        fitnesse.testsystems.slim.Table table1 = null;
        slimTableFactoryTest0.table = table1;
        fitnesse.testsystems.slim.Table table3 = null;
        slimTableFactoryTest0.settable(table3);
        java.util.Map<java.lang.String, java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable>> strMap5 = slimTableFactoryTest0.map;
        java.util.Map<java.lang.String, java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable>> strMap6 = slimTableFactoryTest0.getmap();
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory7 = slimTableFactoryTest0.slimTableFactory;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory8 = slimTableFactoryTest0.slimTableFactory;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory9 = slimTableFactoryTest0.slimTableFactory;
        java.util.Map<java.lang.String, java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable>> strMap10 = slimTableFactoryTest0.map;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory11 = slimTableFactoryTest0.getslimTableFactory();
        fitnesse.testsystems.slim.Table table12 = null;
        slimTableFactoryTest0.table = table12;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory14 = null;
        slimTableFactoryTest0.setslimTableFactory(slimTableFactory14);
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
        org.junit.Assert.assertNull(slimTableFactory8);
        org.junit.Assert.assertNull(slimTableFactory9);
        org.junit.Assert.assertNull(strMap10);
        org.junit.Assert.assertNull(slimTableFactory11);
    }

    @Test
    public void test11338() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11338");
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
        fitnesse.testsystems.slim.Table table16 = slimTableFactoryTest0.gettable();
        fitnesse.testsystems.slim.Table table17 = slimTableFactoryTest0.gettable();
        fitnesse.testsystems.slim.Table table18 = null;
        slimTableFactoryTest0.table = table18;
        fitnesse.testsystems.slim.Table table20 = slimTableFactoryTest0.gettable();
        // The following exception was thrown during execution in test generation
        try {
            slimTableFactoryTest0.addTableTypeImport("", "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(slimTableFactory7);
        org.junit.Assert.assertNull(strMap8);
        org.junit.Assert.assertNull(table9);
        org.junit.Assert.assertNull(strMap10);
        org.junit.Assert.assertNull(strMap11);
        org.junit.Assert.assertNull(table16);
        org.junit.Assert.assertNull(table17);
        org.junit.Assert.assertNull(table20);
    }

    @Test
    public void test11339() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11339");
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
        fitnesse.testsystems.slim.Table table15 = slimTableFactoryTest0.table;
        fitnesse.testsystems.slim.Table table16 = null;
        slimTableFactoryTest0.settable(table16);
        fitnesse.testsystems.slim.Table table18 = null;
        slimTableFactoryTest0.table = table18;
        fitnesse.testsystems.slim.Table table20 = null;
        slimTableFactoryTest0.settable(table20);
        fitnesse.testsystems.slim.Table table22 = null;
        slimTableFactoryTest0.settable(table22);
        fitnesse.testsystems.slim.Table table24 = slimTableFactoryTest0.gettable();
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory25 = null;
        slimTableFactoryTest0.slimTableFactory = slimTableFactory25;
        fitnesse.testsystems.slim.Table table27 = null;
        slimTableFactoryTest0.settable(table27);
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
        org.junit.Assert.assertNull(slimTableFactory13);
        org.junit.Assert.assertNull(strMap14);
        org.junit.Assert.assertNull(table15);
        org.junit.Assert.assertNull(table24);
    }

    @Test
    public void test11340() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11340");
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
        java.util.Map<java.lang.String, java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable>> strMap21 = slimTableFactoryTest0.getmap();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass22 = strMap21.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(table7);
        org.junit.Assert.assertNull(strMap10);
        org.junit.Assert.assertNull(table13);
        org.junit.Assert.assertNull(table18);
        org.junit.Assert.assertNull(strMap21);
    }

    @Test
    public void test11341() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11341");
        fitnesse.testsystems.slim.tables.SlimTableFactoryTest slimTableFactoryTest0 = new fitnesse.testsystems.slim.tables.SlimTableFactoryTest();
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory1 = slimTableFactoryTest0.slimTableFactory;
        fitnesse.testsystems.slim.Table table2 = slimTableFactoryTest0.gettable();
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory3 = null;
        slimTableFactoryTest0.slimTableFactory = slimTableFactory3;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory5 = null;
        slimTableFactoryTest0.slimTableFactory = slimTableFactory5;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory7 = null;
        slimTableFactoryTest0.setslimTableFactory(slimTableFactory7);
        java.util.Map<java.lang.String, java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable>> strMap9 = slimTableFactoryTest0.getmap();
        fitnesse.testsystems.slim.Table table10 = null;
        slimTableFactoryTest0.settable(table10);
        fitnesse.testsystems.slim.Table table12 = null;
        slimTableFactoryTest0.settable(table12);
        java.util.Map<java.lang.String, java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable>> strMap14 = slimTableFactoryTest0.getmap();
        // The following exception was thrown during execution in test generation
        try {
            slimTableFactoryTest0.addTableTypeImport("hi!", "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(slimTableFactory1);
        org.junit.Assert.assertNull(table2);
        org.junit.Assert.assertNull(strMap9);
        org.junit.Assert.assertNull(strMap14);
    }

    @Test
    public void test11342() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11342");
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
        fitnesse.testsystems.slim.Table table11 = null;
        slimTableFactoryTest0.settable(table11);
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory13 = null;
        slimTableFactoryTest0.setslimTableFactory(slimTableFactory13);
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory15 = null;
        slimTableFactoryTest0.setslimTableFactory(slimTableFactory15);
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory17 = slimTableFactoryTest0.slimTableFactory;
        org.junit.Assert.assertNull(slimTableFactory1);
        org.junit.Assert.assertNull(table2);
        org.junit.Assert.assertNull(slimTableFactory7);
        org.junit.Assert.assertNull(slimTableFactory8);
        org.junit.Assert.assertNull(slimTableFactory17);
    }

    @Test
    public void test11343() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11343");
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
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory12 = slimTableFactoryTest0.slimTableFactory;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory13 = slimTableFactoryTest0.slimTableFactory;
        fitnesse.testsystems.slim.Table table14 = null;
        slimTableFactoryTest0.settable(table14);
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory16 = null;
        slimTableFactoryTest0.slimTableFactory = slimTableFactory16;
        org.junit.Assert.assertNull(slimTableFactory5);
        org.junit.Assert.assertNull(slimTableFactory12);
        org.junit.Assert.assertNull(slimTableFactory13);
    }

    @Test
    public void test11344() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11344");
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
        fitnesse.testsystems.slim.Table table10 = null;
        slimTableFactoryTest0.table = table10;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory12 = null;
        slimTableFactoryTest0.setslimTableFactory(slimTableFactory12);
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory14 = null;
        slimTableFactoryTest0.slimTableFactory = slimTableFactory14;
        org.junit.Assert.assertNull(slimTableFactory1);
        org.junit.Assert.assertNull(table2);
        org.junit.Assert.assertNull(strMap3);
        org.junit.Assert.assertNull(strMap8);
        org.junit.Assert.assertNull(strMap9);
    }

    @Test
    public void test11345() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11345");
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
        fitnesse.testsystems.slim.Table table10 = null;
        slimTableFactoryTest0.table = table10;
        java.util.Map<java.lang.String, java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable>> strMap12 = slimTableFactoryTest0.map;
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
        org.junit.Assert.assertNull(slimTableFactory9);
        org.junit.Assert.assertNull(strMap12);
    }

    @Test
    public void test11346() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11346");
        fitnesse.testsystems.slim.tables.SlimTableFactoryTest slimTableFactoryTest0 = new fitnesse.testsystems.slim.tables.SlimTableFactoryTest();
        fitnesse.testsystems.slim.Table table1 = null;
        slimTableFactoryTest0.table = table1;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory3 = slimTableFactoryTest0.slimTableFactory;
        java.util.Map<java.lang.String, java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable>> strMap4 = slimTableFactoryTest0.getmap();
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory5 = slimTableFactoryTest0.slimTableFactory;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory6 = null;
        slimTableFactoryTest0.setslimTableFactory(slimTableFactory6);
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory8 = slimTableFactoryTest0.getslimTableFactory();
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory9 = null;
        slimTableFactoryTest0.setslimTableFactory(slimTableFactory9);
        fitnesse.testsystems.slim.Table table11 = slimTableFactoryTest0.gettable();
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory12 = slimTableFactoryTest0.slimTableFactory;
        fitnesse.testsystems.slim.Table table13 = slimTableFactoryTest0.table;
        org.junit.Assert.assertNull(slimTableFactory3);
        org.junit.Assert.assertNull(strMap4);
        org.junit.Assert.assertNull(slimTableFactory5);
        org.junit.Assert.assertNull(slimTableFactory8);
        org.junit.Assert.assertNull(table11);
        org.junit.Assert.assertNull(slimTableFactory12);
        org.junit.Assert.assertNull(table13);
    }

    @Test
    public void test11347() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11347");
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
        java.util.Map<java.lang.String, java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable>> strMap11 = slimTableFactoryTest0.map;
        java.util.Map<java.lang.String, java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable>> strMap12 = slimTableFactoryTest0.getmap();
        fitnesse.testsystems.slim.Table table13 = slimTableFactoryTest0.table;
        java.util.Map<java.lang.String, java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable>> strMap14 = slimTableFactoryTest0.map;
        org.junit.Assert.assertNull(slimTableFactory3);
        org.junit.Assert.assertNull(strMap4);
        org.junit.Assert.assertNull(slimTableFactory5);
        org.junit.Assert.assertNull(slimTableFactory6);
        org.junit.Assert.assertNull(slimTableFactory9);
        org.junit.Assert.assertNull(table10);
        org.junit.Assert.assertNull(strMap11);
        org.junit.Assert.assertNull(strMap12);
        org.junit.Assert.assertNull(table13);
        org.junit.Assert.assertNull(strMap14);
    }

    @Test
    public void test11348() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11348");
        fitnesse.testsystems.slim.tables.SlimTableFactoryTest slimTableFactoryTest0 = new fitnesse.testsystems.slim.tables.SlimTableFactoryTest();
        fitnesse.testsystems.slim.Table table1 = null;
        slimTableFactoryTest0.table = table1;
        fitnesse.testsystems.slim.Table table3 = null;
        slimTableFactoryTest0.settable(table3);
        java.util.Map<java.lang.String, java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable>> strMap5 = slimTableFactoryTest0.map;
        java.util.Map<java.lang.String, java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable>> strMap6 = slimTableFactoryTest0.getmap();
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory7 = slimTableFactoryTest0.slimTableFactory;
        java.util.Map<java.lang.String, java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable>> strMap8 = slimTableFactoryTest0.map;
        java.util.Map<java.lang.String, java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable>> strMap9 = slimTableFactoryTest0.map;
        fitnesse.testsystems.slim.Table table10 = slimTableFactoryTest0.gettable();
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory11 = null;
        slimTableFactoryTest0.setslimTableFactory(slimTableFactory11);
        java.util.Map<java.lang.String, java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable>> strMap13 = slimTableFactoryTest0.getmap();
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
        org.junit.Assert.assertNull(strMap9);
        org.junit.Assert.assertNull(table10);
        org.junit.Assert.assertNull(strMap13);
    }

    @Test
    public void test11349() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11349");
        fitnesse.testsystems.slim.tables.SlimTableFactoryTest slimTableFactoryTest0 = new fitnesse.testsystems.slim.tables.SlimTableFactoryTest();
        fitnesse.testsystems.slim.Table table1 = null;
        slimTableFactoryTest0.table = table1;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory3 = slimTableFactoryTest0.slimTableFactory;
        java.util.Map<java.lang.String, java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable>> strMap4 = slimTableFactoryTest0.getmap();
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory5 = slimTableFactoryTest0.slimTableFactory;
        java.util.Map<java.lang.String, java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable>> strMap6 = slimTableFactoryTest0.map;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory7 = slimTableFactoryTest0.getslimTableFactory();
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory8 = null;
        slimTableFactoryTest0.setslimTableFactory(slimTableFactory8);
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory10 = null;
        slimTableFactoryTest0.setslimTableFactory(slimTableFactory10);
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
        org.junit.Assert.assertNull(slimTableFactory5);
        org.junit.Assert.assertNull(strMap6);
        org.junit.Assert.assertNull(slimTableFactory7);
        org.junit.Assert.assertNull(strMap12);
    }

    @Test
    public void test11350() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11350");
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
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory16 = slimTableFactoryTest0.slimTableFactory;
        fitnesse.testsystems.slim.Table table17 = slimTableFactoryTest0.table;
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
        org.junit.Assert.assertNull(table13);
        org.junit.Assert.assertNull(slimTableFactory16);
        org.junit.Assert.assertNull(table17);
    }

    @Test
    public void test11351() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11351");
        fitnesse.testsystems.slim.tables.SlimTableFactoryTest slimTableFactoryTest0 = new fitnesse.testsystems.slim.tables.SlimTableFactoryTest();
        fitnesse.testsystems.slim.Table table1 = null;
        slimTableFactoryTest0.table = table1;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory3 = null;
        slimTableFactoryTest0.slimTableFactory = slimTableFactory3;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory5 = slimTableFactoryTest0.getslimTableFactory();
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory6 = slimTableFactoryTest0.slimTableFactory;
        java.util.Map<java.lang.String, java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable>> strMap7 = slimTableFactoryTest0.getmap();
        java.util.Map<java.lang.String, java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable>> strMap8 = slimTableFactoryTest0.map;
        java.util.Map<java.lang.String, java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable>> strMap9 = slimTableFactoryTest0.map;
        org.junit.Assert.assertNull(slimTableFactory5);
        org.junit.Assert.assertNull(slimTableFactory6);
        org.junit.Assert.assertNull(strMap7);
        org.junit.Assert.assertNull(strMap8);
        org.junit.Assert.assertNull(strMap9);
    }

    @Test
    public void test11352() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11352");
        fitnesse.testsystems.slim.tables.SlimTableFactoryTest slimTableFactoryTest0 = new fitnesse.testsystems.slim.tables.SlimTableFactoryTest();
        fitnesse.testsystems.slim.Table table1 = slimTableFactoryTest0.table;
        java.util.Map<java.lang.String, java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable>> strMap2 = slimTableFactoryTest0.getmap();
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory3 = slimTableFactoryTest0.getslimTableFactory();
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory4 = null;
        slimTableFactoryTest0.slimTableFactory = slimTableFactory4;
        fitnesse.testsystems.slim.Table table6 = slimTableFactoryTest0.table;
        java.util.Map<java.lang.String, java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable>> strMap7 = slimTableFactoryTest0.map;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory8 = slimTableFactoryTest0.slimTableFactory;
        fitnesse.testsystems.slim.Table table9 = null;
        slimTableFactoryTest0.table = table9;
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
        org.junit.Assert.assertNull(table6);
        org.junit.Assert.assertNull(strMap7);
        org.junit.Assert.assertNull(slimTableFactory8);
    }

    @Test
    public void test11353() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11353");
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
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory16 = slimTableFactoryTest0.slimTableFactory;
        fitnesse.testsystems.slim.Table table17 = slimTableFactoryTest0.gettable();
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory18 = slimTableFactoryTest0.slimTableFactory;
        java.util.Map<java.lang.String, java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable>> strMap19 = slimTableFactoryTest0.map;
        org.junit.Assert.assertNull(strMap5);
        org.junit.Assert.assertNull(strMap6);
        org.junit.Assert.assertNull(slimTableFactory7);
        org.junit.Assert.assertNull(strMap8);
        org.junit.Assert.assertNull(slimTableFactory9);
        org.junit.Assert.assertNull(table12);
        org.junit.Assert.assertNull(strMap15);
        org.junit.Assert.assertNull(slimTableFactory16);
        org.junit.Assert.assertNull(table17);
        org.junit.Assert.assertNull(slimTableFactory18);
        org.junit.Assert.assertNull(strMap19);
    }

    @Test
    public void test11354() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11354");
        fitnesse.testsystems.slim.tables.SlimTableFactoryTest slimTableFactoryTest0 = new fitnesse.testsystems.slim.tables.SlimTableFactoryTest();
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory1 = slimTableFactoryTest0.slimTableFactory;
        fitnesse.testsystems.slim.Table table2 = slimTableFactoryTest0.gettable();
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory3 = null;
        slimTableFactoryTest0.slimTableFactory = slimTableFactory3;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory5 = null;
        slimTableFactoryTest0.slimTableFactory = slimTableFactory5;
        fitnesse.testsystems.slim.Table table7 = slimTableFactoryTest0.table;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory8 = null;
        slimTableFactoryTest0.slimTableFactory = slimTableFactory8;
        fitnesse.testsystems.slim.Table table10 = null;
        slimTableFactoryTest0.table = table10;
        // The following exception was thrown during execution in test generation
        try {
            slimTableFactoryTest0.checkTableTypeDefineUsedForTable();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(slimTableFactory1);
        org.junit.Assert.assertNull(table2);
        org.junit.Assert.assertNull(table7);
    }

    @Test
    public void test11355() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11355");
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
        fitnesse.testsystems.slim.Table table14 = slimTableFactoryTest0.gettable();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass15 = table14.getClass();
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
    public void test11356() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11356");
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
        fitnesse.testsystems.slim.Table table11 = null;
        slimTableFactoryTest0.settable(table11);
        java.util.Map<java.lang.String, java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable>> strMap13 = slimTableFactoryTest0.getmap();
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory14 = null;
        slimTableFactoryTest0.setslimTableFactory(slimTableFactory14);
        fitnesse.testsystems.slim.Table table16 = null;
        slimTableFactoryTest0.table = table16;
        java.util.Map<java.lang.String, java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable>> strMap18 = slimTableFactoryTest0.getmap();
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory19 = slimTableFactoryTest0.getslimTableFactory();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass20 = slimTableFactory19.getClass();
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
        org.junit.Assert.assertNull(strMap13);
        org.junit.Assert.assertNull(strMap18);
        org.junit.Assert.assertNull(slimTableFactory19);
    }

    @Test
    public void test11357() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11357");
        fitnesse.testsystems.slim.tables.SlimTableFactoryTest slimTableFactoryTest0 = new fitnesse.testsystems.slim.tables.SlimTableFactoryTest();
        fitnesse.testsystems.slim.Table table1 = null;
        slimTableFactoryTest0.table = table1;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory3 = slimTableFactoryTest0.slimTableFactory;
        java.util.Map<java.lang.String, java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable>> strMap4 = slimTableFactoryTest0.map;
        fitnesse.testsystems.slim.Table table5 = slimTableFactoryTest0.table;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory6 = null;
        slimTableFactoryTest0.setslimTableFactory(slimTableFactory6);
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory8 = slimTableFactoryTest0.slimTableFactory;
        fitnesse.testsystems.slim.Table table9 = slimTableFactoryTest0.table;
        java.util.Map<java.lang.String, java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable>> strMap10 = slimTableFactoryTest0.getmap();
        fitnesse.testsystems.slim.Table table11 = slimTableFactoryTest0.table;
        fitnesse.testsystems.slim.Table table12 = null;
        slimTableFactoryTest0.table = table12;
        java.lang.Class<?> wildcardClass14 = slimTableFactoryTest0.getClass();
        org.junit.Assert.assertNull(slimTableFactory3);
        org.junit.Assert.assertNull(strMap4);
        org.junit.Assert.assertNull(table5);
        org.junit.Assert.assertNull(slimTableFactory8);
        org.junit.Assert.assertNull(table9);
        org.junit.Assert.assertNull(strMap10);
        org.junit.Assert.assertNull(table11);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test11358() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11358");
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
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory12 = slimTableFactoryTest0.slimTableFactory;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory13 = slimTableFactoryTest0.slimTableFactory;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory14 = null;
        slimTableFactoryTest0.setslimTableFactory(slimTableFactory14);
        java.util.Map<java.lang.String, java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable>> strMap16 = slimTableFactoryTest0.map;
        fitnesse.testsystems.slim.Table table17 = slimTableFactoryTest0.table;
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
        org.junit.Assert.assertNull(slimTableFactory12);
        org.junit.Assert.assertNull(slimTableFactory13);
        org.junit.Assert.assertNull(strMap16);
        org.junit.Assert.assertNull(table17);
    }

    @Test
    public void test11359() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11359");
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
        fitnesse.testsystems.slim.Table table10 = slimTableFactoryTest0.table;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory11 = null;
        slimTableFactoryTest0.setslimTableFactory(slimTableFactory11);
        fitnesse.testsystems.slim.Table table13 = slimTableFactoryTest0.table;
        java.util.Map<java.lang.String, java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable>> strMap14 = slimTableFactoryTest0.getmap();
        java.util.Map<java.lang.String, java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable>> strMap15 = slimTableFactoryTest0.getmap();
        fitnesse.testsystems.slim.Table table16 = null;
        slimTableFactoryTest0.table = table16;
        fitnesse.testsystems.slim.Table table18 = slimTableFactoryTest0.table;
        org.junit.Assert.assertNull(slimTableFactory3);
        org.junit.Assert.assertNull(slimTableFactory4);
        org.junit.Assert.assertNull(slimTableFactory5);
        org.junit.Assert.assertNull(table10);
        org.junit.Assert.assertNull(table13);
        org.junit.Assert.assertNull(strMap14);
        org.junit.Assert.assertNull(strMap15);
        org.junit.Assert.assertNull(table18);
    }

    @Test
    public void test11360() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11360");
        fitnesse.testsystems.slim.tables.SlimTableFactoryTest slimTableFactoryTest0 = new fitnesse.testsystems.slim.tables.SlimTableFactoryTest();
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory1 = slimTableFactoryTest0.slimTableFactory;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory2 = slimTableFactoryTest0.slimTableFactory;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory3 = slimTableFactoryTest0.slimTableFactory;
        java.util.Map<java.lang.String, java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable>> strMap4 = slimTableFactoryTest0.map;
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
        org.junit.Assert.assertNull(slimTableFactory2);
        org.junit.Assert.assertNull(slimTableFactory3);
        org.junit.Assert.assertNull(strMap4);
    }

    @Test
    public void test11361() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11361");
        fitnesse.testsystems.slim.tables.SlimTableFactoryTest slimTableFactoryTest0 = new fitnesse.testsystems.slim.tables.SlimTableFactoryTest();
        fitnesse.testsystems.slim.Table table1 = slimTableFactoryTest0.table;
        java.util.Map<java.lang.String, java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable>> strMap2 = slimTableFactoryTest0.getmap();
        fitnesse.testsystems.slim.Table table3 = null;
        slimTableFactoryTest0.table = table3;
        fitnesse.testsystems.slim.Table table5 = slimTableFactoryTest0.table;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory6 = null;
        slimTableFactoryTest0.setslimTableFactory(slimTableFactory6);
        java.util.Map<java.lang.String, java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable>> strMap8 = slimTableFactoryTest0.map;
        fitnesse.testsystems.slim.Table table9 = slimTableFactoryTest0.gettable();
        fitnesse.testsystems.slim.Table table10 = null;
        slimTableFactoryTest0.table = table10;
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
        org.junit.Assert.assertNull(strMap8);
        org.junit.Assert.assertNull(table9);
    }

    @Test
    public void test11362() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11362");
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
        java.util.Map<java.lang.String, java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable>> strMap10 = slimTableFactoryTest0.getmap();
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory11 = null;
        slimTableFactoryTest0.setslimTableFactory(slimTableFactory11);
        fitnesse.testsystems.slim.Table table13 = null;
        slimTableFactoryTest0.settable(table13);
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory15 = slimTableFactoryTest0.slimTableFactory;
        org.junit.Assert.assertNull(slimTableFactory1);
        org.junit.Assert.assertNull(table2);
        org.junit.Assert.assertNull(strMap7);
        org.junit.Assert.assertNull(slimTableFactory8);
        org.junit.Assert.assertNull(table9);
        org.junit.Assert.assertNull(strMap10);
        org.junit.Assert.assertNull(slimTableFactory15);
    }

    @Test
    public void test11363() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11363");
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
        fitnesse.testsystems.slim.Table table14 = slimTableFactoryTest0.gettable();
        java.lang.Class<?> wildcardClass15 = slimTableFactoryTest0.getClass();
        org.junit.Assert.assertNull(slimTableFactory1);
        org.junit.Assert.assertNull(table2);
        org.junit.Assert.assertNull(slimTableFactory7);
        org.junit.Assert.assertNull(slimTableFactory8);
        org.junit.Assert.assertNull(table9);
        org.junit.Assert.assertNull(table14);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test11364() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11364");
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
        java.util.Map<java.lang.String, java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable>> strMap13 = slimTableFactoryTest0.getmap();
        fitnesse.testsystems.slim.Table table14 = null;
        slimTableFactoryTest0.settable(table14);
        // The following exception was thrown during execution in test generation
        try {
            slimTableFactoryTest0.tableTypeStartingWithcommentColonShouldReturnNull();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(strMap5);
        org.junit.Assert.assertNull(strMap6);
        org.junit.Assert.assertNull(slimTableFactory9);
        org.junit.Assert.assertNull(table10);
        org.junit.Assert.assertNull(strMap13);
    }

    @Test
    public void test11365() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11365");
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
        fitnesse.testsystems.slim.Table table11 = slimTableFactoryTest0.table;
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
        org.junit.Assert.assertNull(table11);
    }

    @Test
    public void test11366() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11366");
        fitnesse.testsystems.slim.tables.SlimTableFactoryTest slimTableFactoryTest0 = new fitnesse.testsystems.slim.tables.SlimTableFactoryTest();
        fitnesse.testsystems.slim.Table table1 = null;
        slimTableFactoryTest0.table = table1;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory3 = slimTableFactoryTest0.getslimTableFactory();
        fitnesse.testsystems.slim.Table table4 = slimTableFactoryTest0.gettable();
        fitnesse.testsystems.slim.Table table5 = slimTableFactoryTest0.table;
        fitnesse.testsystems.slim.Table table6 = null;
        slimTableFactoryTest0.table = table6;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory8 = null;
        slimTableFactoryTest0.setslimTableFactory(slimTableFactory8);
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
        org.junit.Assert.assertNull(slimTableFactory3);
        org.junit.Assert.assertNull(table4);
        org.junit.Assert.assertNull(table5);
        org.junit.Assert.assertNull(strMap10);
    }

    @Test
    public void test11367() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11367");
        fitnesse.testsystems.slim.tables.SlimTableFactoryTest slimTableFactoryTest0 = new fitnesse.testsystems.slim.tables.SlimTableFactoryTest();
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory1 = slimTableFactoryTest0.slimTableFactory;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory2 = slimTableFactoryTest0.slimTableFactory;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory3 = null;
        slimTableFactoryTest0.slimTableFactory = slimTableFactory3;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory5 = null;
        slimTableFactoryTest0.slimTableFactory = slimTableFactory5;
        fitnesse.testsystems.slim.Table table7 = null;
        slimTableFactoryTest0.table = table7;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory9 = slimTableFactoryTest0.slimTableFactory;
        fitnesse.testsystems.slim.Table table10 = slimTableFactoryTest0.gettable();
        org.junit.Assert.assertNull(slimTableFactory1);
        org.junit.Assert.assertNull(slimTableFactory2);
        org.junit.Assert.assertNull(slimTableFactory9);
        org.junit.Assert.assertNull(table10);
    }

    @Test
    public void test11368() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11368");
        fitnesse.testsystems.slim.tables.SlimTableFactoryTest slimTableFactoryTest0 = new fitnesse.testsystems.slim.tables.SlimTableFactoryTest();
        fitnesse.testsystems.slim.Table table1 = null;
        slimTableFactoryTest0.table = table1;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory3 = null;
        slimTableFactoryTest0.setslimTableFactory(slimTableFactory3);
        fitnesse.testsystems.slim.Table table5 = null;
        slimTableFactoryTest0.settable(table5);
        java.util.Map<java.lang.String, java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable>> strMap7 = slimTableFactoryTest0.getmap();
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory8 = null;
        slimTableFactoryTest0.slimTableFactory = slimTableFactory8;
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
    public void test11369() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11369");
        fitnesse.testsystems.slim.tables.SlimTableFactoryTest slimTableFactoryTest0 = new fitnesse.testsystems.slim.tables.SlimTableFactoryTest();
        fitnesse.testsystems.slim.Table table1 = null;
        slimTableFactoryTest0.table = table1;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory3 = slimTableFactoryTest0.slimTableFactory;
        java.util.Map<java.lang.String, java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable>> strMap4 = slimTableFactoryTest0.map;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory5 = null;
        slimTableFactoryTest0.setslimTableFactory(slimTableFactory5);
        java.util.Map<java.lang.String, java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable>> strMap7 = slimTableFactoryTest0.getmap();
        java.util.Map<java.lang.String, java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable>> strMap8 = slimTableFactoryTest0.map;
        org.junit.Assert.assertNull(slimTableFactory3);
        org.junit.Assert.assertNull(strMap4);
        org.junit.Assert.assertNull(strMap7);
        org.junit.Assert.assertNull(strMap8);
    }

    @Test
    public void test11370() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11370");
        fitnesse.testsystems.slim.tables.SlimTableFactoryTest slimTableFactoryTest0 = new fitnesse.testsystems.slim.tables.SlimTableFactoryTest();
        fitnesse.testsystems.slim.Table table1 = null;
        slimTableFactoryTest0.table = table1;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory3 = slimTableFactoryTest0.slimTableFactory;
        java.util.Map<java.lang.String, java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable>> strMap4 = slimTableFactoryTest0.getmap();
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory5 = slimTableFactoryTest0.slimTableFactory;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory6 = slimTableFactoryTest0.getslimTableFactory();
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory7 = null;
        slimTableFactoryTest0.setslimTableFactory(slimTableFactory7);
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory9 = slimTableFactoryTest0.getslimTableFactory();
        fitnesse.testsystems.slim.Table table10 = null;
        slimTableFactoryTest0.table = table10;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory12 = slimTableFactoryTest0.slimTableFactory;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory13 = slimTableFactoryTest0.slimTableFactory;
        fitnesse.testsystems.slim.Table table14 = null;
        slimTableFactoryTest0.settable(table14);
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory16 = null;
        slimTableFactoryTest0.slimTableFactory = slimTableFactory16;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory18 = slimTableFactoryTest0.getslimTableFactory();
        org.junit.Assert.assertNull(slimTableFactory3);
        org.junit.Assert.assertNull(strMap4);
        org.junit.Assert.assertNull(slimTableFactory5);
        org.junit.Assert.assertNull(slimTableFactory6);
        org.junit.Assert.assertNull(slimTableFactory9);
        org.junit.Assert.assertNull(slimTableFactory12);
        org.junit.Assert.assertNull(slimTableFactory13);
        org.junit.Assert.assertNull(slimTableFactory18);
    }

    @Test
    public void test11371() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11371");
        fitnesse.testsystems.slim.tables.SlimTableFactoryTest slimTableFactoryTest0 = new fitnesse.testsystems.slim.tables.SlimTableFactoryTest();
        fitnesse.testsystems.slim.Table table1 = slimTableFactoryTest0.table;
        java.util.Map<java.lang.String, java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable>> strMap2 = slimTableFactoryTest0.getmap();
        java.util.Map<java.lang.String, java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable>> strMap3 = slimTableFactoryTest0.getmap();
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory4 = slimTableFactoryTest0.slimTableFactory;
        fitnesse.testsystems.slim.Table table5 = null;
        slimTableFactoryTest0.settable(table5);
        fitnesse.testsystems.slim.Table table7 = slimTableFactoryTest0.table;
        java.util.Map<java.lang.String, java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable>> strMap8 = slimTableFactoryTest0.map;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory9 = null;
        slimTableFactoryTest0.setslimTableFactory(slimTableFactory9);
        fitnesse.testsystems.slim.Table table11 = slimTableFactoryTest0.gettable();
        java.util.Map<java.lang.String, java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable>> strMap12 = slimTableFactoryTest0.map;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory13 = slimTableFactoryTest0.slimTableFactory;
        fitnesse.testsystems.slim.Table table14 = slimTableFactoryTest0.gettable();
        org.junit.Assert.assertNull(table1);
        org.junit.Assert.assertNull(strMap2);
        org.junit.Assert.assertNull(strMap3);
        org.junit.Assert.assertNull(slimTableFactory4);
        org.junit.Assert.assertNull(table7);
        org.junit.Assert.assertNull(strMap8);
        org.junit.Assert.assertNull(table11);
        org.junit.Assert.assertNull(strMap12);
        org.junit.Assert.assertNull(slimTableFactory13);
        org.junit.Assert.assertNull(table14);
    }

    @Test
    public void test11372() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11372");
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
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory14 = slimTableFactoryTest0.getslimTableFactory();
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory15 = slimTableFactoryTest0.getslimTableFactory();
        fitnesse.testsystems.slim.Table table16 = slimTableFactoryTest0.gettable();
        fitnesse.testsystems.slim.Table table17 = slimTableFactoryTest0.table;
        fitnesse.testsystems.slim.Table table18 = slimTableFactoryTest0.table;
        org.junit.Assert.assertNull(slimTableFactory1);
        org.junit.Assert.assertNull(table2);
        org.junit.Assert.assertNull(slimTableFactory7);
        org.junit.Assert.assertNull(table10);
        org.junit.Assert.assertNull(table11);
        org.junit.Assert.assertNull(slimTableFactory14);
        org.junit.Assert.assertNull(slimTableFactory15);
        org.junit.Assert.assertNull(table16);
        org.junit.Assert.assertNull(table17);
        org.junit.Assert.assertNull(table18);
    }

    @Test
    public void test11373() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11373");
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
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory10 = slimTableFactoryTest0.getslimTableFactory();
        java.util.Map<java.lang.String, java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable>> strMap11 = slimTableFactoryTest0.map;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory12 = slimTableFactoryTest0.slimTableFactory;
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
        org.junit.Assert.assertNull(table5);
        org.junit.Assert.assertNull(slimTableFactory6);
        org.junit.Assert.assertNull(slimTableFactory7);
        org.junit.Assert.assertNull(slimTableFactory10);
        org.junit.Assert.assertNull(strMap11);
        org.junit.Assert.assertNull(slimTableFactory12);
    }

    @Test
    public void test11374() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11374");
        fitnesse.testsystems.slim.tables.SlimTableFactoryTest slimTableFactoryTest0 = new fitnesse.testsystems.slim.tables.SlimTableFactoryTest();
        fitnesse.testsystems.slim.Table table1 = null;
        slimTableFactoryTest0.table = table1;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory3 = slimTableFactoryTest0.slimTableFactory;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory4 = null;
        slimTableFactoryTest0.setslimTableFactory(slimTableFactory4);
        java.util.Map<java.lang.String, java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable>> strMap6 = slimTableFactoryTest0.getmap();
        fitnesse.testsystems.slim.Table table7 = null;
        slimTableFactoryTest0.table = table7;
        java.util.Map<java.lang.String, java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable>> strMap9 = slimTableFactoryTest0.getmap();
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory10 = slimTableFactoryTest0.slimTableFactory;
        fitnesse.testsystems.slim.Table table11 = slimTableFactoryTest0.gettable();
        java.util.Map<java.lang.String, java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable>> strMap12 = slimTableFactoryTest0.map;
        fitnesse.testsystems.slim.Table table13 = null;
        slimTableFactoryTest0.settable(table13);
        fitnesse.testsystems.slim.Table table15 = slimTableFactoryTest0.gettable();
        org.junit.Assert.assertNull(slimTableFactory3);
        org.junit.Assert.assertNull(strMap6);
        org.junit.Assert.assertNull(strMap9);
        org.junit.Assert.assertNull(slimTableFactory10);
        org.junit.Assert.assertNull(table11);
        org.junit.Assert.assertNull(strMap12);
        org.junit.Assert.assertNull(table15);
    }

    @Test
    public void test11375() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11375");
        fitnesse.testsystems.slim.tables.SlimTableFactoryTest slimTableFactoryTest0 = new fitnesse.testsystems.slim.tables.SlimTableFactoryTest();
        fitnesse.testsystems.slim.Table table1 = null;
        slimTableFactoryTest0.table = table1;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory3 = null;
        slimTableFactoryTest0.slimTableFactory = slimTableFactory3;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory5 = slimTableFactoryTest0.getslimTableFactory();
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory6 = slimTableFactoryTest0.slimTableFactory;
        fitnesse.testsystems.slim.Table table7 = slimTableFactoryTest0.gettable();
        fitnesse.testsystems.slim.Table table8 = slimTableFactoryTest0.gettable();
        fitnesse.testsystems.slim.Table table9 = null;
        slimTableFactoryTest0.table = table9;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory11 = slimTableFactoryTest0.slimTableFactory;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory12 = null;
        slimTableFactoryTest0.setslimTableFactory(slimTableFactory12);
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory14 = slimTableFactoryTest0.getslimTableFactory();
        // The following exception was thrown during execution in test generation
        try {
            slimTableFactoryTest0.checkTableTypeDefinesIgnoredIfDifferentSpecified();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(slimTableFactory5);
        org.junit.Assert.assertNull(slimTableFactory6);
        org.junit.Assert.assertNull(table7);
        org.junit.Assert.assertNull(table8);
        org.junit.Assert.assertNull(slimTableFactory11);
        org.junit.Assert.assertNull(slimTableFactory14);
    }

    @Test
    public void test11376() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11376");
        fitnesse.testsystems.slim.tables.SlimTableFactoryTest slimTableFactoryTest0 = new fitnesse.testsystems.slim.tables.SlimTableFactoryTest();
        fitnesse.testsystems.slim.Table table1 = null;
        slimTableFactoryTest0.table = table1;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory3 = null;
        slimTableFactoryTest0.slimTableFactory = slimTableFactory3;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory5 = slimTableFactoryTest0.getslimTableFactory();
        fitnesse.testsystems.slim.Table table6 = null;
        slimTableFactoryTest0.settable(table6);
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory8 = null;
        slimTableFactoryTest0.setslimTableFactory(slimTableFactory8);
        java.util.Map<java.lang.String, java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable>> strMap10 = slimTableFactoryTest0.map;
        fitnesse.testsystems.slim.Table table11 = null;
        slimTableFactoryTest0.settable(table11);
        fitnesse.testsystems.slim.Table table13 = null;
        slimTableFactoryTest0.settable(table13);
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory15 = slimTableFactoryTest0.getslimTableFactory();
        // The following exception was thrown during execution in test generation
        try {
            slimTableFactoryTest0.commentTableShouldReturnNull();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(slimTableFactory5);
        org.junit.Assert.assertNull(strMap10);
        org.junit.Assert.assertNull(slimTableFactory15);
    }

    @Test
    public void test11377() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11377");
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
        java.util.Map<java.lang.String, java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable>> strMap11 = slimTableFactoryTest0.map;
        fitnesse.testsystems.slim.Table table12 = null;
        slimTableFactoryTest0.settable(table12);
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory14 = null;
        slimTableFactoryTest0.slimTableFactory = slimTableFactory14;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory16 = slimTableFactoryTest0.getslimTableFactory();
        org.junit.Assert.assertNull(slimTableFactory1);
        org.junit.Assert.assertNull(table2);
        org.junit.Assert.assertNull(strMap11);
        org.junit.Assert.assertNull(slimTableFactory16);
    }

    @Test
    public void test11378() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11378");
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
        fitnesse.testsystems.slim.Table table13 = slimTableFactoryTest0.gettable();
        fitnesse.testsystems.slim.Table table14 = slimTableFactoryTest0.gettable();
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory15 = slimTableFactoryTest0.getslimTableFactory();
        java.util.Map<java.lang.String, java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable>> strMap16 = slimTableFactoryTest0.getmap();
        fitnesse.testsystems.slim.Table table17 = null;
        slimTableFactoryTest0.table = table17;
        org.junit.Assert.assertNull(table13);
        org.junit.Assert.assertNull(table14);
        org.junit.Assert.assertNull(slimTableFactory15);
        org.junit.Assert.assertNull(strMap16);
    }

    @Test
    public void test11379() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11379");
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
        java.util.Map<java.lang.String, java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable>> strMap11 = slimTableFactoryTest0.map;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass12 = strMap11.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(slimTableFactory5);
        org.junit.Assert.assertNull(strMap10);
        org.junit.Assert.assertNull(strMap11);
    }

    @Test
    public void test11380() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11380");
        fitnesse.testsystems.slim.tables.SlimTableFactoryTest slimTableFactoryTest0 = new fitnesse.testsystems.slim.tables.SlimTableFactoryTest();
        fitnesse.testsystems.slim.Table table1 = null;
        slimTableFactoryTest0.table = table1;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory3 = slimTableFactoryTest0.slimTableFactory;
        java.util.Map<java.lang.String, java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable>> strMap4 = slimTableFactoryTest0.getmap();
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory5 = slimTableFactoryTest0.slimTableFactory;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory6 = slimTableFactoryTest0.getslimTableFactory();
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory7 = null;
        slimTableFactoryTest0.setslimTableFactory(slimTableFactory7);
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory9 = slimTableFactoryTest0.getslimTableFactory();
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory10 = slimTableFactoryTest0.slimTableFactory;
        fitnesse.testsystems.slim.Table table11 = slimTableFactoryTest0.table;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory12 = null;
        slimTableFactoryTest0.setslimTableFactory(slimTableFactory12);
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
        org.junit.Assert.assertNull(slimTableFactory9);
        org.junit.Assert.assertNull(slimTableFactory10);
        org.junit.Assert.assertNull(table11);
    }

    @Test
    public void test11381() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11381");
        fitnesse.testsystems.slim.tables.SlimTableFactoryTest slimTableFactoryTest0 = new fitnesse.testsystems.slim.tables.SlimTableFactoryTest();
        fitnesse.testsystems.slim.Table table1 = null;
        slimTableFactoryTest0.table = table1;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory3 = slimTableFactoryTest0.slimTableFactory;
        java.util.Map<java.lang.String, java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable>> strMap4 = slimTableFactoryTest0.getmap();
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory5 = null;
        slimTableFactoryTest0.slimTableFactory = slimTableFactory5;
        java.util.Map<java.lang.String, java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable>> strMap7 = slimTableFactoryTest0.getmap();
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory8 = null;
        slimTableFactoryTest0.slimTableFactory = slimTableFactory8;
        fitnesse.testsystems.slim.Table table10 = slimTableFactoryTest0.gettable();
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory11 = slimTableFactoryTest0.getslimTableFactory();
        fitnesse.testsystems.slim.Table table12 = null;
        slimTableFactoryTest0.settable(table12);
        org.junit.Assert.assertNull(slimTableFactory3);
        org.junit.Assert.assertNull(strMap4);
        org.junit.Assert.assertNull(strMap7);
        org.junit.Assert.assertNull(table10);
        org.junit.Assert.assertNull(slimTableFactory11);
    }

    @Test
    public void test11382() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11382");
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
        fitnesse.testsystems.slim.Table table13 = slimTableFactoryTest0.table;
        fitnesse.testsystems.slim.Table table14 = slimTableFactoryTest0.table;
        java.util.Map<java.lang.String, java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable>> strMap15 = slimTableFactoryTest0.getmap();
        // The following exception was thrown during execution in test generation
        try {
            slimTableFactoryTest0.tableTypeStartingWithcommentColonShouldReturnNull();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(table7);
        org.junit.Assert.assertNull(table12);
        org.junit.Assert.assertNull(table13);
        org.junit.Assert.assertNull(table14);
        org.junit.Assert.assertNull(strMap15);
    }

    @Test
    public void test11383() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11383");
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
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory15 = null;
        slimTableFactoryTest0.setslimTableFactory(slimTableFactory15);
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory17 = null;
        slimTableFactoryTest0.slimTableFactory = slimTableFactory17;
        java.util.Map<java.lang.String, java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable>> strMap19 = slimTableFactoryTest0.getmap();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass20 = strMap19.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(slimTableFactory3);
        org.junit.Assert.assertNull(strMap4);
        org.junit.Assert.assertNull(table13);
        org.junit.Assert.assertNull(slimTableFactory14);
        org.junit.Assert.assertNull(strMap19);
    }

    @Test
    public void test11384() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11384");
        fitnesse.testsystems.slim.tables.SlimTableFactoryTest slimTableFactoryTest0 = new fitnesse.testsystems.slim.tables.SlimTableFactoryTest();
        fitnesse.testsystems.slim.Table table1 = null;
        slimTableFactoryTest0.table = table1;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory3 = null;
        slimTableFactoryTest0.slimTableFactory = slimTableFactory3;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory5 = slimTableFactoryTest0.getslimTableFactory();
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory6 = slimTableFactoryTest0.slimTableFactory;
        java.util.Map<java.lang.String, java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable>> strMap7 = slimTableFactoryTest0.getmap();
        java.util.Map<java.lang.String, java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable>> strMap8 = slimTableFactoryTest0.getmap();
        fitnesse.testsystems.slim.Table table9 = slimTableFactoryTest0.gettable();
        // The following exception was thrown during execution in test generation
        try {
            slimTableFactoryTest0.commentTableShouldReturnNull();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(slimTableFactory5);
        org.junit.Assert.assertNull(slimTableFactory6);
        org.junit.Assert.assertNull(strMap7);
        org.junit.Assert.assertNull(strMap8);
        org.junit.Assert.assertNull(table9);
    }

    @Test
    public void test11385() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11385");
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
        fitnesse.testsystems.slim.Table table15 = null;
        slimTableFactoryTest0.table = table15;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory17 = slimTableFactoryTest0.slimTableFactory;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory18 = slimTableFactoryTest0.slimTableFactory;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory19 = slimTableFactoryTest0.slimTableFactory;
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
        org.junit.Assert.assertNull(table9);
        org.junit.Assert.assertNull(slimTableFactory12);
        org.junit.Assert.assertNull(slimTableFactory17);
        org.junit.Assert.assertNull(slimTableFactory18);
        org.junit.Assert.assertNull(slimTableFactory19);
    }

    @Test
    public void test11386() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11386");
        fitnesse.testsystems.slim.tables.SlimTableFactoryTest slimTableFactoryTest0 = new fitnesse.testsystems.slim.tables.SlimTableFactoryTest();
        fitnesse.testsystems.slim.Table table1 = slimTableFactoryTest0.table;
        java.util.Map<java.lang.String, java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable>> strMap2 = slimTableFactoryTest0.getmap();
        fitnesse.testsystems.slim.Table table3 = null;
        slimTableFactoryTest0.table = table3;
        fitnesse.testsystems.slim.Table table5 = slimTableFactoryTest0.table;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory6 = null;
        slimTableFactoryTest0.setslimTableFactory(slimTableFactory6);
        java.util.Map<java.lang.String, java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable>> strMap8 = slimTableFactoryTest0.map;
        java.lang.Class<?> wildcardClass9 = slimTableFactoryTest0.getClass();
        org.junit.Assert.assertNull(table1);
        org.junit.Assert.assertNull(strMap2);
        org.junit.Assert.assertNull(table5);
        org.junit.Assert.assertNull(strMap8);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test11387() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11387");
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
        fitnesse.testsystems.slim.Table table10 = null;
        slimTableFactoryTest0.table = table10;
        java.util.Map<java.lang.String, java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable>> strMap12 = slimTableFactoryTest0.getmap();
        fitnesse.testsystems.slim.Table table13 = slimTableFactoryTest0.gettable();
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory14 = null;
        slimTableFactoryTest0.setslimTableFactory(slimTableFactory14);
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
        org.junit.Assert.assertNull(strMap12);
        org.junit.Assert.assertNull(table13);
    }

    @Test
    public void test11388() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11388");
        fitnesse.testsystems.slim.tables.SlimTableFactoryTest slimTableFactoryTest0 = new fitnesse.testsystems.slim.tables.SlimTableFactoryTest();
        fitnesse.testsystems.slim.Table table1 = slimTableFactoryTest0.table;
        java.util.Map<java.lang.String, java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable>> strMap2 = slimTableFactoryTest0.getmap();
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory3 = null;
        slimTableFactoryTest0.slimTableFactory = slimTableFactory3;
        fitnesse.testsystems.slim.Table table5 = slimTableFactoryTest0.table;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory6 = slimTableFactoryTest0.slimTableFactory;
        fitnesse.testsystems.slim.Table table7 = null;
        slimTableFactoryTest0.settable(table7);
        fitnesse.testsystems.slim.Table table9 = slimTableFactoryTest0.table;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory10 = null;
        slimTableFactoryTest0.slimTableFactory = slimTableFactory10;
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
        org.junit.Assert.assertNull(slimTableFactory6);
        org.junit.Assert.assertNull(table9);
    }

    @Test
    public void test11389() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11389");
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
        fitnesse.testsystems.slim.Table table10 = null;
        slimTableFactoryTest0.table = table10;
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
        org.junit.Assert.assertNull(table8);
        org.junit.Assert.assertNull(strMap9);
    }

    @Test
    public void test11390() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11390");
        fitnesse.testsystems.slim.tables.SlimTableFactoryTest slimTableFactoryTest0 = new fitnesse.testsystems.slim.tables.SlimTableFactoryTest();
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory1 = null;
        slimTableFactoryTest0.slimTableFactory = slimTableFactory1;
        fitnesse.testsystems.slim.Table table3 = null;
        slimTableFactoryTest0.settable(table3);
        fitnesse.testsystems.slim.Table table5 = slimTableFactoryTest0.gettable();
        fitnesse.testsystems.slim.Table table6 = null;
        slimTableFactoryTest0.table = table6;
        fitnesse.testsystems.slim.Table table8 = null;
        slimTableFactoryTest0.settable(table8);
        // The following exception was thrown during execution in test generation
        try {
            slimTableFactoryTest0.checkTableTypeDefineUsedForTable();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(table5);
    }

    @Test
    public void test11391() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11391");
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
        slimTableFactoryTest0.setslimTableFactory(slimTableFactory12);
        java.util.Map<java.lang.String, java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable>> strMap14 = slimTableFactoryTest0.getmap();
        fitnesse.testsystems.slim.Table table15 = null;
        slimTableFactoryTest0.settable(table15);
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory17 = null;
        slimTableFactoryTest0.slimTableFactory = slimTableFactory17;
        java.util.Map<java.lang.String, java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable>> strMap19 = slimTableFactoryTest0.map;
        org.junit.Assert.assertNull(slimTableFactory1);
        org.junit.Assert.assertNull(table2);
        org.junit.Assert.assertNull(table9);
        org.junit.Assert.assertNull(strMap14);
        org.junit.Assert.assertNull(strMap19);
    }

    @Test
    public void test11392() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11392");
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
        fitnesse.testsystems.slim.Table table17 = slimTableFactoryTest0.table;
        java.util.Map<java.lang.String, java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable>> strMap18 = slimTableFactoryTest0.getmap();
        // The following exception was thrown during execution in test generation
        try {
            slimTableFactoryTest0.shouldCreateCorrectSlimTableForTablesType();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(slimTableFactory1);
        org.junit.Assert.assertNull(table2);
        org.junit.Assert.assertNull(table9);
        org.junit.Assert.assertNull(slimTableFactory16);
        org.junit.Assert.assertNull(table17);
        org.junit.Assert.assertNull(strMap18);
    }

    @Test
    public void test11393() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11393");
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
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory10 = null;
        slimTableFactoryTest0.slimTableFactory = slimTableFactory10;
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
    }

    @Test
    public void test11394() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11394");
        fitnesse.testsystems.slim.tables.SlimTableFactoryTest slimTableFactoryTest0 = new fitnesse.testsystems.slim.tables.SlimTableFactoryTest();
        fitnesse.testsystems.slim.Table table1 = null;
        slimTableFactoryTest0.table = table1;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory3 = null;
        slimTableFactoryTest0.setslimTableFactory(slimTableFactory3);
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory5 = slimTableFactoryTest0.slimTableFactory;
        fitnesse.testsystems.slim.Table table6 = slimTableFactoryTest0.table;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory7 = null;
        slimTableFactoryTest0.slimTableFactory = slimTableFactory7;
        // The following exception was thrown during execution in test generation
        try {
            slimTableFactoryTest0.commentTableShouldReturnNull();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(slimTableFactory5);
        org.junit.Assert.assertNull(table6);
    }

    @Test
    public void test11395() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11395");
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
        fitnesse.testsystems.slim.Table table12 = null;
        slimTableFactoryTest0.table = table12;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory14 = slimTableFactoryTest0.slimTableFactory;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory15 = slimTableFactoryTest0.slimTableFactory;
        org.junit.Assert.assertNull(slimTableFactory5);
        org.junit.Assert.assertNull(strMap10);
        org.junit.Assert.assertNull(slimTableFactory11);
        org.junit.Assert.assertNull(slimTableFactory14);
        org.junit.Assert.assertNull(slimTableFactory15);
    }

    @Test
    public void test11396() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11396");
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
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory12 = slimTableFactoryTest0.slimTableFactory;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory13 = slimTableFactoryTest0.slimTableFactory;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory14 = null;
        slimTableFactoryTest0.setslimTableFactory(slimTableFactory14);
        fitnesse.testsystems.slim.Table table16 = slimTableFactoryTest0.gettable();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass17 = table16.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(slimTableFactory7);
        org.junit.Assert.assertNull(slimTableFactory8);
        org.junit.Assert.assertNull(strMap9);
        org.junit.Assert.assertNull(slimTableFactory12);
        org.junit.Assert.assertNull(slimTableFactory13);
        org.junit.Assert.assertNull(table16);
    }

    @Test
    public void test11397() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11397");
        fitnesse.testsystems.slim.tables.SlimTableFactoryTest slimTableFactoryTest0 = new fitnesse.testsystems.slim.tables.SlimTableFactoryTest();
        fitnesse.testsystems.slim.Table table1 = null;
        slimTableFactoryTest0.table = table1;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory3 = null;
        slimTableFactoryTest0.setslimTableFactory(slimTableFactory3);
        java.util.Map<java.lang.String, java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable>> strMap5 = slimTableFactoryTest0.map;
        fitnesse.testsystems.slim.Table table6 = null;
        slimTableFactoryTest0.table = table6;
        java.util.Map<java.lang.String, java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable>> strMap8 = slimTableFactoryTest0.map;
        java.util.Map<java.lang.String, java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable>> strMap9 = slimTableFactoryTest0.map;
        fitnesse.testsystems.slim.Table table10 = null;
        slimTableFactoryTest0.table = table10;
        fitnesse.testsystems.slim.Table table12 = slimTableFactoryTest0.table;
        fitnesse.testsystems.slim.Table table13 = slimTableFactoryTest0.gettable();
        java.lang.Class<?> wildcardClass14 = slimTableFactoryTest0.getClass();
        org.junit.Assert.assertNull(strMap5);
        org.junit.Assert.assertNull(strMap8);
        org.junit.Assert.assertNull(strMap9);
        org.junit.Assert.assertNull(table12);
        org.junit.Assert.assertNull(table13);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test11398() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11398");
        fitnesse.testsystems.slim.tables.SlimTableFactoryTest slimTableFactoryTest0 = new fitnesse.testsystems.slim.tables.SlimTableFactoryTest();
        fitnesse.testsystems.slim.Table table1 = slimTableFactoryTest0.table;
        java.util.Map<java.lang.String, java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable>> strMap2 = slimTableFactoryTest0.getmap();
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory3 = slimTableFactoryTest0.slimTableFactory;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory4 = slimTableFactoryTest0.getslimTableFactory();
        java.util.Map<java.lang.String, java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable>> strMap5 = slimTableFactoryTest0.getmap();
        fitnesse.testsystems.slim.Table table6 = null;
        slimTableFactoryTest0.settable(table6);
        java.util.Map<java.lang.String, java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable>> strMap8 = slimTableFactoryTest0.map;
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
        org.junit.Assert.assertNull(strMap5);
        org.junit.Assert.assertNull(strMap8);
    }

    @Test
    public void test11399() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11399");
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
        java.util.Map<java.lang.String, java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable>> strMap16 = slimTableFactoryTest0.getmap();
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory17 = slimTableFactoryTest0.getslimTableFactory();
        fitnesse.testsystems.slim.Table table18 = slimTableFactoryTest0.gettable();
        fitnesse.testsystems.slim.Table table19 = null;
        slimTableFactoryTest0.settable(table19);
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory21 = null;
        slimTableFactoryTest0.setslimTableFactory(slimTableFactory21);
        fitnesse.testsystems.slim.Table table23 = slimTableFactoryTest0.gettable();
        org.junit.Assert.assertNull(slimTableFactory3);
        org.junit.Assert.assertNull(strMap4);
        org.junit.Assert.assertNull(table9);
        org.junit.Assert.assertNull(table10);
        org.junit.Assert.assertNull(strMap11);
        org.junit.Assert.assertNull(strMap16);
        org.junit.Assert.assertNull(slimTableFactory17);
        org.junit.Assert.assertNull(table18);
        org.junit.Assert.assertNull(table23);
    }

    @Test
    public void test11400() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11400");
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
        java.util.Map<java.lang.String, java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable>> strMap10 = slimTableFactoryTest0.getmap();
        fitnesse.testsystems.slim.Table table11 = slimTableFactoryTest0.table;
        // The following exception was thrown during execution in test generation
        try {
            slimTableFactoryTest0.commentTableShouldReturnNull();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(slimTableFactory7);
        org.junit.Assert.assertNull(slimTableFactory8);
        org.junit.Assert.assertNull(strMap9);
        org.junit.Assert.assertNull(strMap10);
        org.junit.Assert.assertNull(table11);
    }

    @Test
    public void test11401() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11401");
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
        fitnesse.testsystems.slim.Table table10 = null;
        slimTableFactoryTest0.table = table10;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory12 = slimTableFactoryTest0.getslimTableFactory();
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory13 = null;
        slimTableFactoryTest0.slimTableFactory = slimTableFactory13;
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
        org.junit.Assert.assertNull(slimTableFactory12);
    }

    @Test
    public void test11402() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11402");
        fitnesse.testsystems.slim.tables.SlimTableFactoryTest slimTableFactoryTest0 = new fitnesse.testsystems.slim.tables.SlimTableFactoryTest();
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory1 = slimTableFactoryTest0.slimTableFactory;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory2 = slimTableFactoryTest0.slimTableFactory;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory3 = null;
        slimTableFactoryTest0.slimTableFactory = slimTableFactory3;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory5 = slimTableFactoryTest0.slimTableFactory;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory6 = null;
        slimTableFactoryTest0.setslimTableFactory(slimTableFactory6);
        fitnesse.testsystems.slim.Table table8 = null;
        slimTableFactoryTest0.settable(table8);
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory10 = null;
        slimTableFactoryTest0.setslimTableFactory(slimTableFactory10);
        fitnesse.testsystems.slim.Table table12 = slimTableFactoryTest0.gettable();
        fitnesse.testsystems.slim.Table table13 = null;
        slimTableFactoryTest0.table = table13;
        org.junit.Assert.assertNull(slimTableFactory1);
        org.junit.Assert.assertNull(slimTableFactory2);
        org.junit.Assert.assertNull(slimTableFactory5);
        org.junit.Assert.assertNull(table12);
    }

    @Test
    public void test11403() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11403");
        fitnesse.testsystems.slim.tables.SlimTableFactoryTest slimTableFactoryTest0 = new fitnesse.testsystems.slim.tables.SlimTableFactoryTest();
        fitnesse.testsystems.slim.Table table1 = null;
        slimTableFactoryTest0.table = table1;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory3 = slimTableFactoryTest0.slimTableFactory;
        java.util.Map<java.lang.String, java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable>> strMap4 = slimTableFactoryTest0.getmap();
        fitnesse.testsystems.slim.Table table5 = null;
        slimTableFactoryTest0.settable(table5);
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory7 = null;
        slimTableFactoryTest0.setslimTableFactory(slimTableFactory7);
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory9 = slimTableFactoryTest0.getslimTableFactory();
        fitnesse.testsystems.slim.Table table10 = null;
        slimTableFactoryTest0.settable(table10);
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
    }

    @Test
    public void test11404() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11404");
        fitnesse.testsystems.slim.tables.SlimTableFactoryTest slimTableFactoryTest0 = new fitnesse.testsystems.slim.tables.SlimTableFactoryTest();
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory1 = slimTableFactoryTest0.slimTableFactory;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory2 = null;
        slimTableFactoryTest0.slimTableFactory = slimTableFactory2;
        fitnesse.testsystems.slim.Table table4 = null;
        slimTableFactoryTest0.table = table4;
        // The following exception was thrown during execution in test generation
        try {
            slimTableFactoryTest0.checkTableTypeDefinesIgnoredIfDifferentSpecified();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(slimTableFactory1);
    }

    @Test
    public void test11405() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11405");
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
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory11 = slimTableFactoryTest0.slimTableFactory;
        fitnesse.testsystems.slim.Table table12 = slimTableFactoryTest0.table;
        org.junit.Assert.assertNull(slimTableFactory1);
        org.junit.Assert.assertNull(table2);
        org.junit.Assert.assertNull(slimTableFactory7);
        org.junit.Assert.assertNull(slimTableFactory8);
        org.junit.Assert.assertNull(table9);
        org.junit.Assert.assertNull(slimTableFactory10);
        org.junit.Assert.assertNull(slimTableFactory11);
        org.junit.Assert.assertNull(table12);
    }

    @Test
    public void test11406() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11406");
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
        fitnesse.testsystems.slim.Table table10 = null;
        slimTableFactoryTest0.table = table10;
        java.util.Map<java.lang.String, java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable>> strMap12 = slimTableFactoryTest0.getmap();
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory13 = slimTableFactoryTest0.getslimTableFactory();
        fitnesse.testsystems.slim.Table table14 = slimTableFactoryTest0.gettable();
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
        org.junit.Assert.assertNull(strMap9);
        org.junit.Assert.assertNull(strMap12);
        org.junit.Assert.assertNull(slimTableFactory13);
        org.junit.Assert.assertNull(table14);
    }

    @Test
    public void test11407() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11407");
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
        java.util.Map<java.lang.String, java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable>> strMap17 = slimTableFactoryTest0.map;
        fitnesse.testsystems.slim.Table table18 = slimTableFactoryTest0.gettable();
        fitnesse.testsystems.slim.Table table19 = slimTableFactoryTest0.table;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory20 = slimTableFactoryTest0.getslimTableFactory();
        org.junit.Assert.assertNull(slimTableFactory3);
        org.junit.Assert.assertNull(strMap4);
        org.junit.Assert.assertNull(strMap17);
        org.junit.Assert.assertNull(table18);
        org.junit.Assert.assertNull(table19);
        org.junit.Assert.assertNull(slimTableFactory20);
    }

    @Test
    public void test11408() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11408");
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
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory13 = null;
        slimTableFactoryTest0.setslimTableFactory(slimTableFactory13);
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory15 = null;
        slimTableFactoryTest0.setslimTableFactory(slimTableFactory15);
        fitnesse.testsystems.slim.Table table17 = null;
        slimTableFactoryTest0.settable(table17);
        // The following exception was thrown during execution in test generation
        try {
            slimTableFactoryTest0.commentTableShouldReturnNull();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(slimTableFactory3);
        org.junit.Assert.assertNull(slimTableFactory4);
        org.junit.Assert.assertNull(table9);
        org.junit.Assert.assertNull(strMap12);
    }

    @Test
    public void test11409() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11409");
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
        fitnesse.testsystems.slim.Table table12 = null;
        slimTableFactoryTest0.settable(table12);
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory14 = null;
        slimTableFactoryTest0.slimTableFactory = slimTableFactory14;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory16 = null;
        slimTableFactoryTest0.setslimTableFactory(slimTableFactory16);
        java.util.Map<java.lang.String, java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable>> strMap18 = slimTableFactoryTest0.map;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory19 = null;
        slimTableFactoryTest0.slimTableFactory = slimTableFactory19;
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
        org.junit.Assert.assertNull(slimTableFactory10);
        org.junit.Assert.assertNull(slimTableFactory11);
        org.junit.Assert.assertNull(strMap18);
    }

    @Test
    public void test11410() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11410");
        fitnesse.testsystems.slim.tables.SlimTableFactoryTest slimTableFactoryTest0 = new fitnesse.testsystems.slim.tables.SlimTableFactoryTest();
        fitnesse.testsystems.slim.Table table1 = null;
        slimTableFactoryTest0.table = table1;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory3 = slimTableFactoryTest0.slimTableFactory;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory4 = null;
        slimTableFactoryTest0.setslimTableFactory(slimTableFactory4);
        java.util.Map<java.lang.String, java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable>> strMap6 = slimTableFactoryTest0.getmap();
        fitnesse.testsystems.slim.Table table7 = null;
        slimTableFactoryTest0.table = table7;
        fitnesse.testsystems.slim.Table table9 = null;
        slimTableFactoryTest0.table = table9;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory11 = null;
        slimTableFactoryTest0.slimTableFactory = slimTableFactory11;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory13 = null;
        slimTableFactoryTest0.setslimTableFactory(slimTableFactory13);
        fitnesse.testsystems.slim.Table table15 = null;
        slimTableFactoryTest0.table = table15;
        java.util.Map<java.lang.String, java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable>> strMap17 = slimTableFactoryTest0.map;
        // The following exception was thrown during execution in test generation
        try {
            slimTableFactoryTest0.addTableTypeImport("hi!", "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(slimTableFactory3);
        org.junit.Assert.assertNull(strMap6);
        org.junit.Assert.assertNull(strMap17);
    }

    @Test
    public void test11411() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11411");
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
        fitnesse.testsystems.slim.Table table16 = null;
        slimTableFactoryTest0.settable(table16);
        fitnesse.testsystems.slim.Table table18 = null;
        slimTableFactoryTest0.table = table18;
        fitnesse.testsystems.slim.Table table20 = null;
        slimTableFactoryTest0.settable(table20);
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
        org.junit.Assert.assertNull(strMap15);
    }

    @Test
    public void test11412() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11412");
        fitnesse.testsystems.slim.tables.SlimTableFactoryTest slimTableFactoryTest0 = new fitnesse.testsystems.slim.tables.SlimTableFactoryTest();
        fitnesse.testsystems.slim.Table table1 = null;
        slimTableFactoryTest0.table = table1;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory3 = slimTableFactoryTest0.slimTableFactory;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory4 = null;
        slimTableFactoryTest0.slimTableFactory = slimTableFactory4;
        fitnesse.testsystems.slim.Table table6 = slimTableFactoryTest0.gettable();
        java.util.Map<java.lang.String, java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable>> strMap7 = slimTableFactoryTest0.map;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory8 = null;
        slimTableFactoryTest0.setslimTableFactory(slimTableFactory8);
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory10 = slimTableFactoryTest0.getslimTableFactory();
        fitnesse.testsystems.slim.Table table11 = slimTableFactoryTest0.table;
        fitnesse.testsystems.slim.Table table12 = slimTableFactoryTest0.gettable();
        org.junit.Assert.assertNull(slimTableFactory3);
        org.junit.Assert.assertNull(table6);
        org.junit.Assert.assertNull(strMap7);
        org.junit.Assert.assertNull(slimTableFactory10);
        org.junit.Assert.assertNull(table11);
        org.junit.Assert.assertNull(table12);
    }

    @Test
    public void test11413() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11413");
        fitnesse.testsystems.slim.tables.SlimTableFactoryTest slimTableFactoryTest0 = new fitnesse.testsystems.slim.tables.SlimTableFactoryTest();
        fitnesse.testsystems.slim.Table table1 = null;
        slimTableFactoryTest0.table = table1;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory3 = slimTableFactoryTest0.slimTableFactory;
        fitnesse.testsystems.slim.Table table4 = null;
        slimTableFactoryTest0.settable(table4);
        java.util.Map<java.lang.String, java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable>> strMap6 = slimTableFactoryTest0.getmap();
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
    public void test11414() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11414");
        fitnesse.testsystems.slim.tables.SlimTableFactoryTest slimTableFactoryTest0 = new fitnesse.testsystems.slim.tables.SlimTableFactoryTest();
        fitnesse.testsystems.slim.Table table1 = null;
        slimTableFactoryTest0.table = table1;
        fitnesse.testsystems.slim.Table table3 = slimTableFactoryTest0.table;
        fitnesse.testsystems.slim.Table table4 = slimTableFactoryTest0.gettable();
        java.util.Map<java.lang.String, java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable>> strMap5 = slimTableFactoryTest0.getmap();
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory6 = slimTableFactoryTest0.getslimTableFactory();
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory7 = null;
        slimTableFactoryTest0.slimTableFactory = slimTableFactory7;
        fitnesse.testsystems.slim.Table table9 = slimTableFactoryTest0.gettable();
        fitnesse.testsystems.slim.Table table10 = slimTableFactoryTest0.table;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory11 = slimTableFactoryTest0.slimTableFactory;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory12 = slimTableFactoryTest0.getslimTableFactory();
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
        org.junit.Assert.assertNull(table9);
        org.junit.Assert.assertNull(table10);
        org.junit.Assert.assertNull(slimTableFactory11);
        org.junit.Assert.assertNull(slimTableFactory12);
    }

    @Test
    public void test11415() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11415");
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
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory13 = null;
        slimTableFactoryTest0.slimTableFactory = slimTableFactory13;
        fitnesse.testsystems.slim.Table table15 = slimTableFactoryTest0.gettable();
        java.util.Map<java.lang.String, java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable>> strMap16 = slimTableFactoryTest0.map;
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
        org.junit.Assert.assertNull(table12);
        org.junit.Assert.assertNull(table15);
        org.junit.Assert.assertNull(strMap16);
    }

    @Test
    public void test11416() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11416");
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
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory12 = null;
        slimTableFactoryTest0.slimTableFactory = slimTableFactory12;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory14 = null;
        slimTableFactoryTest0.setslimTableFactory(slimTableFactory14);
        java.util.Map<java.lang.String, java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable>> strMap16 = slimTableFactoryTest0.map;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory17 = slimTableFactoryTest0.getslimTableFactory();
        fitnesse.testsystems.slim.Table table18 = slimTableFactoryTest0.table;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass19 = table18.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(table3);
        org.junit.Assert.assertNull(table4);
        org.junit.Assert.assertNull(slimTableFactory5);
        org.junit.Assert.assertNull(strMap16);
        org.junit.Assert.assertNull(slimTableFactory17);
        org.junit.Assert.assertNull(table18);
    }

    @Test
    public void test11417() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11417");
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
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory10 = slimTableFactoryTest0.getslimTableFactory();
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
        org.junit.Assert.assertNull(slimTableFactory10);
    }

    @Test
    public void test11418() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11418");
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
        java.util.Map<java.lang.String, java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable>> strMap14 = slimTableFactoryTest0.map;
        java.lang.Class<?> wildcardClass15 = slimTableFactoryTest0.getClass();
        org.junit.Assert.assertNull(slimTableFactory3);
        org.junit.Assert.assertNull(strMap4);
        org.junit.Assert.assertNull(strMap9);
        org.junit.Assert.assertNull(slimTableFactory10);
        org.junit.Assert.assertNull(slimTableFactory13);
        org.junit.Assert.assertNull(strMap14);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test11419() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11419");
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
        java.util.Map<java.lang.String, java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable>> strMap10 = slimTableFactoryTest0.getmap();
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory11 = slimTableFactoryTest0.slimTableFactory;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory12 = slimTableFactoryTest0.getslimTableFactory();
        // The following exception was thrown during execution in test generation
        try {
            slimTableFactoryTest0.commentTableShouldReturnNull();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(slimTableFactory5);
        org.junit.Assert.assertNull(table8);
        org.junit.Assert.assertNull(strMap9);
        org.junit.Assert.assertNull(strMap10);
        org.junit.Assert.assertNull(slimTableFactory11);
        org.junit.Assert.assertNull(slimTableFactory12);
    }

    @Test
    public void test11420() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11420");
        fitnesse.testsystems.slim.tables.SlimTableFactoryTest slimTableFactoryTest0 = new fitnesse.testsystems.slim.tables.SlimTableFactoryTest();
        fitnesse.testsystems.slim.Table table1 = null;
        slimTableFactoryTest0.table = table1;
        fitnesse.testsystems.slim.Table table3 = null;
        slimTableFactoryTest0.settable(table3);
        java.util.Map<java.lang.String, java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable>> strMap5 = slimTableFactoryTest0.getmap();
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory6 = slimTableFactoryTest0.getslimTableFactory();
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory7 = null;
        slimTableFactoryTest0.setslimTableFactory(slimTableFactory7);
        fitnesse.testsystems.slim.Table table9 = slimTableFactoryTest0.table;
        fitnesse.testsystems.slim.Table table10 = slimTableFactoryTest0.table;
        // The following exception was thrown during execution in test generation
        try {
            slimTableFactoryTest0.commentTableShouldReturnNull();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(strMap5);
        org.junit.Assert.assertNull(slimTableFactory6);
        org.junit.Assert.assertNull(table9);
        org.junit.Assert.assertNull(table10);
    }

    @Test
    public void test11421() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11421");
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
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory10 = slimTableFactoryTest0.getslimTableFactory();
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
        org.junit.Assert.assertNull(slimTableFactory10);
    }

    @Test
    public void test11422() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11422");
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
        fitnesse.testsystems.slim.Table table15 = slimTableFactoryTest0.table;
        fitnesse.testsystems.slim.Table table16 = null;
        slimTableFactoryTest0.settable(table16);
        fitnesse.testsystems.slim.Table table18 = null;
        slimTableFactoryTest0.table = table18;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory20 = null;
        slimTableFactoryTest0.slimTableFactory = slimTableFactory20;
        java.util.Map<java.lang.String, java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable>> strMap22 = slimTableFactoryTest0.map;
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
        org.junit.Assert.assertNull(slimTableFactory13);
        org.junit.Assert.assertNull(strMap14);
        org.junit.Assert.assertNull(table15);
        org.junit.Assert.assertNull(strMap22);
    }

    @Test
    public void test11423() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11423");
        fitnesse.testsystems.slim.tables.SlimTableFactoryTest slimTableFactoryTest0 = new fitnesse.testsystems.slim.tables.SlimTableFactoryTest();
        fitnesse.testsystems.slim.Table table1 = null;
        slimTableFactoryTest0.table = table1;
        fitnesse.testsystems.slim.Table table3 = slimTableFactoryTest0.table;
        fitnesse.testsystems.slim.Table table4 = slimTableFactoryTest0.gettable();
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory5 = slimTableFactoryTest0.slimTableFactory;
        java.util.Map<java.lang.String, java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable>> strMap6 = slimTableFactoryTest0.map;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory7 = null;
        slimTableFactoryTest0.setslimTableFactory(slimTableFactory7);
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory9 = null;
        slimTableFactoryTest0.setslimTableFactory(slimTableFactory9);
        fitnesse.testsystems.slim.Table table11 = null;
        slimTableFactoryTest0.table = table11;
        org.junit.Assert.assertNull(table3);
        org.junit.Assert.assertNull(table4);
        org.junit.Assert.assertNull(slimTableFactory5);
        org.junit.Assert.assertNull(strMap6);
    }

    @Test
    public void test11424() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11424");
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
        fitnesse.testsystems.slim.Table table11 = null;
        slimTableFactoryTest0.settable(table11);
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
        org.junit.Assert.assertNull(slimTableFactory10);
    }

    @Test
    public void test11425() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11425");
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
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory11 = slimTableFactoryTest0.getslimTableFactory();
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory12 = slimTableFactoryTest0.getslimTableFactory();
        java.util.Map<java.lang.String, java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable>> strMap13 = slimTableFactoryTest0.map;
        fitnesse.testsystems.slim.Table table14 = null;
        slimTableFactoryTest0.table = table14;
        org.junit.Assert.assertNull(strMap5);
        org.junit.Assert.assertNull(table10);
        org.junit.Assert.assertNull(slimTableFactory11);
        org.junit.Assert.assertNull(slimTableFactory12);
        org.junit.Assert.assertNull(strMap13);
    }

    @Test
    public void test11426() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11426");
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
        java.util.Map<java.lang.String, java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable>> strMap10 = slimTableFactoryTest0.map;
        // The following exception was thrown during execution in test generation
        try {
            slimTableFactoryTest0.tableTypeStartingWithcommentColonShouldReturnNull();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(strMap5);
        org.junit.Assert.assertNull(strMap6);
        org.junit.Assert.assertNull(strMap9);
        org.junit.Assert.assertNull(strMap10);
    }

    @Test
    public void test11427() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11427");
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
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory13 = slimTableFactoryTest0.getslimTableFactory();
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory14 = null;
        slimTableFactoryTest0.slimTableFactory = slimTableFactory14;
        fitnesse.testsystems.slim.Table table16 = null;
        slimTableFactoryTest0.settable(table16);
        fitnesse.testsystems.slim.Table table18 = slimTableFactoryTest0.gettable();
        fitnesse.testsystems.slim.Table table19 = slimTableFactoryTest0.table;
        org.junit.Assert.assertNull(slimTableFactory1);
        org.junit.Assert.assertNull(table2);
        org.junit.Assert.assertNull(slimTableFactory13);
        org.junit.Assert.assertNull(table18);
        org.junit.Assert.assertNull(table19);
    }

    @Test
    public void test11428() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11428");
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
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory11 = slimTableFactoryTest0.getslimTableFactory();
        java.util.Map<java.lang.String, java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable>> strMap12 = slimTableFactoryTest0.getmap();
        org.junit.Assert.assertNull(slimTableFactory1);
        org.junit.Assert.assertNull(table2);
        org.junit.Assert.assertNull(table9);
        org.junit.Assert.assertNull(strMap10);
        org.junit.Assert.assertNull(slimTableFactory11);
        org.junit.Assert.assertNull(strMap12);
    }

    @Test
    public void test11429() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11429");
        fitnesse.testsystems.slim.tables.SlimTableFactoryTest slimTableFactoryTest0 = new fitnesse.testsystems.slim.tables.SlimTableFactoryTest();
        fitnesse.testsystems.slim.Table table1 = null;
        slimTableFactoryTest0.table = table1;
        fitnesse.testsystems.slim.Table table3 = null;
        slimTableFactoryTest0.settable(table3);
        java.util.Map<java.lang.String, java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable>> strMap5 = slimTableFactoryTest0.map;
        java.util.Map<java.lang.String, java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable>> strMap6 = slimTableFactoryTest0.getmap();
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory7 = slimTableFactoryTest0.slimTableFactory;
        java.util.Map<java.lang.String, java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable>> strMap8 = slimTableFactoryTest0.map;
        java.util.Map<java.lang.String, java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable>> strMap9 = slimTableFactoryTest0.map;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory10 = slimTableFactoryTest0.getslimTableFactory();
        fitnesse.testsystems.slim.Table table11 = slimTableFactoryTest0.table;
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
        org.junit.Assert.assertNull(strMap9);
        org.junit.Assert.assertNull(slimTableFactory10);
        org.junit.Assert.assertNull(table11);
    }

    @Test
    public void test11430() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11430");
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
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory16 = slimTableFactoryTest0.slimTableFactory;
        java.util.Map<java.lang.String, java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable>> strMap17 = slimTableFactoryTest0.getmap();
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory18 = null;
        slimTableFactoryTest0.slimTableFactory = slimTableFactory18;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory20 = null;
        slimTableFactoryTest0.slimTableFactory = slimTableFactory20;
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
        org.junit.Assert.assertNull(table13);
        org.junit.Assert.assertNull(slimTableFactory16);
        org.junit.Assert.assertNull(strMap17);
    }

    @Test
    public void test11431() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11431");
        fitnesse.testsystems.slim.tables.SlimTableFactoryTest slimTableFactoryTest0 = new fitnesse.testsystems.slim.tables.SlimTableFactoryTest();
        fitnesse.testsystems.slim.Table table1 = null;
        slimTableFactoryTest0.table = table1;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory3 = null;
        slimTableFactoryTest0.setslimTableFactory(slimTableFactory3);
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory5 = slimTableFactoryTest0.slimTableFactory;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory6 = slimTableFactoryTest0.getslimTableFactory();
        fitnesse.testsystems.slim.Table table7 = null;
        slimTableFactoryTest0.table = table7;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory9 = null;
        slimTableFactoryTest0.slimTableFactory = slimTableFactory9;
        org.junit.Assert.assertNull(slimTableFactory5);
        org.junit.Assert.assertNull(slimTableFactory6);
    }

    @Test
    public void test11432() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11432");
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
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory10 = null;
        slimTableFactoryTest0.setslimTableFactory(slimTableFactory10);
        java.util.Map<java.lang.String, java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable>> strMap12 = slimTableFactoryTest0.map;
        fitnesse.testsystems.slim.Table table13 = slimTableFactoryTest0.table;
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
        org.junit.Assert.assertNull(strMap8);
        org.junit.Assert.assertNull(slimTableFactory9);
        org.junit.Assert.assertNull(strMap12);
        org.junit.Assert.assertNull(table13);
    }

    @Test
    public void test11433() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11433");
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
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory13 = null;
        slimTableFactoryTest0.slimTableFactory = slimTableFactory13;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory15 = slimTableFactoryTest0.slimTableFactory;
        org.junit.Assert.assertNull(strMap5);
        org.junit.Assert.assertNull(strMap6);
        org.junit.Assert.assertNull(slimTableFactory7);
        org.junit.Assert.assertNull(strMap8);
        org.junit.Assert.assertNull(slimTableFactory15);
    }

    @Test
    public void test11434() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11434");
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
        fitnesse.testsystems.slim.Table table10 = slimTableFactoryTest0.gettable();
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory11 = null;
        slimTableFactoryTest0.setslimTableFactory(slimTableFactory11);
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory13 = null;
        slimTableFactoryTest0.setslimTableFactory(slimTableFactory13);
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory15 = slimTableFactoryTest0.getslimTableFactory();
        fitnesse.testsystems.slim.Table table16 = null;
        slimTableFactoryTest0.table = table16;
        // The following exception was thrown during execution in test generation
        try {
            slimTableFactoryTest0.checkTableTypeDefineUsedForTable();
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
        org.junit.Assert.assertNull(table10);
        org.junit.Assert.assertNull(slimTableFactory15);
    }

    @Test
    public void test11435() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11435");
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
        fitnesse.testsystems.slim.Table table14 = null;
        slimTableFactoryTest0.settable(table14);
        fitnesse.testsystems.slim.Table table16 = slimTableFactoryTest0.table;
        fitnesse.testsystems.slim.Table table17 = null;
        slimTableFactoryTest0.table = table17;
        fitnesse.testsystems.slim.Table table19 = null;
        slimTableFactoryTest0.table = table19;
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
        org.junit.Assert.assertNull(table12);
        org.junit.Assert.assertNull(table13);
        org.junit.Assert.assertNull(table16);
    }

    @Test
    public void test11436() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11436");
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
        fitnesse.testsystems.slim.Table table10 = slimTableFactoryTest0.table;
        // The following exception was thrown during execution in test generation
        try {
            slimTableFactoryTest0.commentTableShouldReturnNull();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(slimTableFactory1);
        org.junit.Assert.assertNull(table2);
        org.junit.Assert.assertNull(table7);
        org.junit.Assert.assertNull(strMap8);
        org.junit.Assert.assertNull(slimTableFactory9);
        org.junit.Assert.assertNull(table10);
    }

    @Test
    public void test11437() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11437");
        fitnesse.testsystems.slim.tables.SlimTableFactoryTest slimTableFactoryTest0 = new fitnesse.testsystems.slim.tables.SlimTableFactoryTest();
        fitnesse.testsystems.slim.Table table1 = null;
        slimTableFactoryTest0.table = table1;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory3 = slimTableFactoryTest0.slimTableFactory;
        java.util.Map<java.lang.String, java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable>> strMap4 = slimTableFactoryTest0.getmap();
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory5 = null;
        slimTableFactoryTest0.setslimTableFactory(slimTableFactory5);
        fitnesse.testsystems.slim.Table table7 = slimTableFactoryTest0.gettable();
        fitnesse.testsystems.slim.Table table8 = slimTableFactoryTest0.table;
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
        org.junit.Assert.assertNull(table7);
        org.junit.Assert.assertNull(table8);
        org.junit.Assert.assertNull(strMap9);
    }

    @Test
    public void test11438() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11438");
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
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory14 = slimTableFactoryTest0.slimTableFactory;
        fitnesse.testsystems.slim.Table table15 = null;
        slimTableFactoryTest0.settable(table15);
        fitnesse.testsystems.slim.Table table17 = null;
        slimTableFactoryTest0.settable(table17);
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
        org.junit.Assert.assertNull(slimTableFactory14);
    }

    @Test
    public void test11439() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11439");
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
        slimTableFactoryTest0.table = table14;
        fitnesse.testsystems.slim.Table table16 = null;
        slimTableFactoryTest0.settable(table16);
        java.util.Map<java.lang.String, java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable>> strMap18 = slimTableFactoryTest0.getmap();
        fitnesse.testsystems.slim.Table table19 = slimTableFactoryTest0.gettable();
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
        org.junit.Assert.assertNull(strMap18);
        org.junit.Assert.assertNull(table19);
    }

    @Test
    public void test11440() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11440");
        fitnesse.testsystems.slim.tables.SlimTableFactoryTest slimTableFactoryTest0 = new fitnesse.testsystems.slim.tables.SlimTableFactoryTest();
        fitnesse.testsystems.slim.Table table1 = null;
        slimTableFactoryTest0.table = table1;
        fitnesse.testsystems.slim.Table table3 = null;
        slimTableFactoryTest0.settable(table3);
        java.util.Map<java.lang.String, java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable>> strMap5 = slimTableFactoryTest0.map;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory6 = slimTableFactoryTest0.getslimTableFactory();
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory7 = slimTableFactoryTest0.getslimTableFactory();
        java.util.Map<java.lang.String, java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable>> strMap8 = slimTableFactoryTest0.getmap();
        // The following exception was thrown during execution in test generation
        try {
            slimTableFactoryTest0.addTableTypeImport("hi!", "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(strMap5);
        org.junit.Assert.assertNull(slimTableFactory6);
        org.junit.Assert.assertNull(slimTableFactory7);
        org.junit.Assert.assertNull(strMap8);
    }

    @Test
    public void test11441() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11441");
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
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory11 = null;
        slimTableFactoryTest0.slimTableFactory = slimTableFactory11;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory13 = null;
        slimTableFactoryTest0.slimTableFactory = slimTableFactory13;
        // The following exception was thrown during execution in test generation
        try {
            slimTableFactoryTest0.addTableTypeImport("hi!", "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(strMap5);
        org.junit.Assert.assertNull(slimTableFactory8);
    }

    @Test
    public void test11442() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11442");
        fitnesse.testsystems.slim.tables.SlimTableFactoryTest slimTableFactoryTest0 = new fitnesse.testsystems.slim.tables.SlimTableFactoryTest();
        fitnesse.testsystems.slim.Table table1 = null;
        slimTableFactoryTest0.table = table1;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory3 = slimTableFactoryTest0.slimTableFactory;
        java.util.Map<java.lang.String, java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable>> strMap4 = slimTableFactoryTest0.getmap();
        fitnesse.testsystems.slim.Table table5 = slimTableFactoryTest0.gettable();
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory6 = null;
        slimTableFactoryTest0.slimTableFactory = slimTableFactory6;
        fitnesse.testsystems.slim.Table table8 = slimTableFactoryTest0.gettable();
        // The following exception was thrown during execution in test generation
        try {
            slimTableFactoryTest0.tableTypeStartingWithcommentColonShouldReturnNull();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(slimTableFactory3);
        org.junit.Assert.assertNull(strMap4);
        org.junit.Assert.assertNull(table5);
        org.junit.Assert.assertNull(table8);
    }

    @Test
    public void test11443() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11443");
        fitnesse.testsystems.slim.tables.SlimTableFactoryTest slimTableFactoryTest0 = new fitnesse.testsystems.slim.tables.SlimTableFactoryTest();
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory1 = slimTableFactoryTest0.slimTableFactory;
        fitnesse.testsystems.slim.Table table2 = slimTableFactoryTest0.gettable();
        fitnesse.testsystems.slim.Table table3 = null;
        slimTableFactoryTest0.table = table3;
        fitnesse.testsystems.slim.Table table5 = null;
        slimTableFactoryTest0.table = table5;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory7 = slimTableFactoryTest0.slimTableFactory;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory8 = null;
        slimTableFactoryTest0.slimTableFactory = slimTableFactory8;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory10 = null;
        slimTableFactoryTest0.setslimTableFactory(slimTableFactory10);
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory12 = slimTableFactoryTest0.getslimTableFactory();
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory13 = slimTableFactoryTest0.slimTableFactory;
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
        org.junit.Assert.assertNull(slimTableFactory12);
        org.junit.Assert.assertNull(slimTableFactory13);
    }

    @Test
    public void test11444() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11444");
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
        slimTableFactoryTest0.slimTableFactory = slimTableFactory11;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory13 = slimTableFactoryTest0.getslimTableFactory();
        java.lang.Class<?> wildcardClass14 = slimTableFactoryTest0.getClass();
        org.junit.Assert.assertNull(slimTableFactory13);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test11445() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11445");
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
        fitnesse.testsystems.slim.Table table12 = null;
        slimTableFactoryTest0.settable(table12);
        java.util.Map<java.lang.String, java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable>> strMap14 = slimTableFactoryTest0.map;
        fitnesse.testsystems.slim.Table table15 = slimTableFactoryTest0.table;
        fitnesse.testsystems.slim.Table table16 = slimTableFactoryTest0.gettable();
        // The following exception was thrown during execution in test generation
        try {
            slimTableFactoryTest0.checkTableTypeDefinesIgnoredIfDifferentSpecified();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(slimTableFactory5);
        org.junit.Assert.assertNull(strMap10);
        org.junit.Assert.assertNull(strMap11);
        org.junit.Assert.assertNull(strMap14);
        org.junit.Assert.assertNull(table15);
        org.junit.Assert.assertNull(table16);
    }

    @Test
    public void test11446() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11446");
        fitnesse.testsystems.slim.tables.SlimTableFactoryTest slimTableFactoryTest0 = new fitnesse.testsystems.slim.tables.SlimTableFactoryTest();
        fitnesse.testsystems.slim.Table table1 = slimTableFactoryTest0.table;
        java.util.Map<java.lang.String, java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable>> strMap2 = slimTableFactoryTest0.getmap();
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory3 = slimTableFactoryTest0.slimTableFactory;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory4 = slimTableFactoryTest0.getslimTableFactory();
        fitnesse.testsystems.slim.Table table5 = null;
        slimTableFactoryTest0.table = table5;
        fitnesse.testsystems.slim.Table table7 = null;
        slimTableFactoryTest0.table = table7;
        java.util.Map<java.lang.String, java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable>> strMap9 = slimTableFactoryTest0.getmap();
        java.util.Map<java.lang.String, java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable>> strMap10 = slimTableFactoryTest0.getmap();
        fitnesse.testsystems.slim.Table table11 = null;
        slimTableFactoryTest0.settable(table11);
        org.junit.Assert.assertNull(table1);
        org.junit.Assert.assertNull(strMap2);
        org.junit.Assert.assertNull(slimTableFactory3);
        org.junit.Assert.assertNull(slimTableFactory4);
        org.junit.Assert.assertNull(strMap9);
        org.junit.Assert.assertNull(strMap10);
    }

    @Test
    public void test11447() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11447");
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
            slimTableFactoryTest0.shouldCreateCorrectSlimTableForTablesType();
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
    public void test11448() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11448");
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
        org.junit.Assert.assertNull(strMap8);
        org.junit.Assert.assertNull(table9);
        org.junit.Assert.assertNull(slimTableFactory10);
        org.junit.Assert.assertNull(table11);
    }

    @Test
    public void test11449() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11449");
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
        java.util.Map<java.lang.String, java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable>> strMap16 = slimTableFactoryTest0.getmap();
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory17 = slimTableFactoryTest0.getslimTableFactory();
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
        org.junit.Assert.assertNull(strMap16);
        org.junit.Assert.assertNull(slimTableFactory17);
    }

    @Test
    public void test11450() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11450");
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
        slimTableFactoryTest0.slimTableFactory = slimTableFactory11;
        java.util.Map<java.lang.String, java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable>> strMap13 = slimTableFactoryTest0.getmap();
        fitnesse.testsystems.slim.Table table14 = null;
        slimTableFactoryTest0.table = table14;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory16 = null;
        slimTableFactoryTest0.slimTableFactory = slimTableFactory16;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory18 = null;
        slimTableFactoryTest0.setslimTableFactory(slimTableFactory18);
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory20 = null;
        slimTableFactoryTest0.setslimTableFactory(slimTableFactory20);
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory22 = slimTableFactoryTest0.slimTableFactory;
        // The following exception was thrown during execution in test generation
        try {
            slimTableFactoryTest0.checkTableTypeDefinesIgnoredIfDifferentSpecified();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(strMap13);
        org.junit.Assert.assertNull(slimTableFactory22);
    }

    @Test
    public void test11451() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11451");
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
        fitnesse.testsystems.slim.Table table12 = null;
        slimTableFactoryTest0.settable(table12);
        java.util.Map<java.lang.String, java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable>> strMap14 = slimTableFactoryTest0.map;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory15 = slimTableFactoryTest0.slimTableFactory;
        fitnesse.testsystems.slim.Table table16 = slimTableFactoryTest0.table;
        java.util.Map<java.lang.String, java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable>> strMap17 = slimTableFactoryTest0.map;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory18 = null;
        slimTableFactoryTest0.slimTableFactory = slimTableFactory18;
        // The following exception was thrown during execution in test generation
        try {
            slimTableFactoryTest0.shouldCreateCorrectSlimTableForTablesType();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(table7);
        org.junit.Assert.assertNull(strMap14);
        org.junit.Assert.assertNull(slimTableFactory15);
        org.junit.Assert.assertNull(table16);
        org.junit.Assert.assertNull(strMap17);
    }

    @Test
    public void test11452() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11452");
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
        slimTableFactoryTest0.table = table9;
        fitnesse.testsystems.slim.Table table11 = slimTableFactoryTest0.gettable();
        fitnesse.testsystems.slim.Table table12 = null;
        slimTableFactoryTest0.settable(table12);
        fitnesse.testsystems.slim.Table table14 = slimTableFactoryTest0.gettable();
        fitnesse.testsystems.slim.Table table15 = null;
        slimTableFactoryTest0.settable(table15);
        org.junit.Assert.assertNull(slimTableFactory3);
        org.junit.Assert.assertNull(strMap4);
        org.junit.Assert.assertNull(slimTableFactory5);
        org.junit.Assert.assertNull(slimTableFactory6);
        org.junit.Assert.assertNull(table11);
        org.junit.Assert.assertNull(table14);
    }

    @Test
    public void test11453() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11453");
        fitnesse.testsystems.slim.tables.SlimTableFactoryTest slimTableFactoryTest0 = new fitnesse.testsystems.slim.tables.SlimTableFactoryTest();
        fitnesse.testsystems.slim.Table table1 = null;
        slimTableFactoryTest0.table = table1;
        fitnesse.testsystems.slim.Table table3 = slimTableFactoryTest0.table;
        fitnesse.testsystems.slim.Table table4 = slimTableFactoryTest0.gettable();
        java.util.Map<java.lang.String, java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable>> strMap5 = slimTableFactoryTest0.getmap();
        java.util.Map<java.lang.String, java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable>> strMap6 = slimTableFactoryTest0.map;
        fitnesse.testsystems.slim.Table table7 = slimTableFactoryTest0.table;
        java.util.Map<java.lang.String, java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable>> strMap8 = slimTableFactoryTest0.map;
        java.util.Map<java.lang.String, java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable>> strMap9 = slimTableFactoryTest0.getmap();
        java.util.Map<java.lang.String, java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable>> strMap10 = slimTableFactoryTest0.map;
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
        org.junit.Assert.assertNull(strMap9);
        org.junit.Assert.assertNull(strMap10);
    }

    @Test
    public void test11454() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11454");
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
        fitnesse.testsystems.slim.Table table10 = slimTableFactoryTest0.gettable();
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory11 = slimTableFactoryTest0.getslimTableFactory();
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory12 = slimTableFactoryTest0.slimTableFactory;
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
        org.junit.Assert.assertNull(table10);
        org.junit.Assert.assertNull(slimTableFactory11);
        org.junit.Assert.assertNull(slimTableFactory12);
    }

    @Test
    public void test11455() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11455");
        fitnesse.testsystems.slim.tables.SlimTableFactoryTest slimTableFactoryTest0 = new fitnesse.testsystems.slim.tables.SlimTableFactoryTest();
        fitnesse.testsystems.slim.Table table1 = null;
        slimTableFactoryTest0.table = table1;
        fitnesse.testsystems.slim.Table table3 = slimTableFactoryTest0.table;
        fitnesse.testsystems.slim.Table table4 = slimTableFactoryTest0.gettable();
        fitnesse.testsystems.slim.Table table5 = slimTableFactoryTest0.gettable();
        java.util.Map<java.lang.String, java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable>> strMap6 = slimTableFactoryTest0.getmap();
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory7 = slimTableFactoryTest0.getslimTableFactory();
        java.util.Map<java.lang.String, java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable>> strMap8 = slimTableFactoryTest0.map;
        // The following exception was thrown during execution in test generation
        try {
            slimTableFactoryTest0.checkTableTypeDefineUsedForTable();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(table3);
        org.junit.Assert.assertNull(table4);
        org.junit.Assert.assertNull(table5);
        org.junit.Assert.assertNull(strMap6);
        org.junit.Assert.assertNull(slimTableFactory7);
        org.junit.Assert.assertNull(strMap8);
    }

    @Test
    public void test11456() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11456");
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
        fitnesse.testsystems.slim.Table table10 = slimTableFactoryTest0.table;
        fitnesse.testsystems.slim.Table table11 = null;
        slimTableFactoryTest0.settable(table11);
        // The following exception was thrown during execution in test generation
        try {
            slimTableFactoryTest0.tableTypeStartingWithcommentColonShouldReturnNull();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(slimTableFactory7);
        org.junit.Assert.assertNull(table10);
    }

    @Test
    public void test11457() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11457");
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
        java.util.Map<java.lang.String, java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable>> strMap12 = slimTableFactoryTest0.map;
        fitnesse.testsystems.slim.Table table13 = slimTableFactoryTest0.gettable();
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory14 = null;
        slimTableFactoryTest0.setslimTableFactory(slimTableFactory14);
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory16 = slimTableFactoryTest0.slimTableFactory;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory17 = null;
        slimTableFactoryTest0.setslimTableFactory(slimTableFactory17);
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory19 = null;
        slimTableFactoryTest0.setslimTableFactory(slimTableFactory19);
        org.junit.Assert.assertNull(slimTableFactory1);
        org.junit.Assert.assertNull(table2);
        org.junit.Assert.assertNull(table9);
        org.junit.Assert.assertNull(strMap12);
        org.junit.Assert.assertNull(table13);
        org.junit.Assert.assertNull(slimTableFactory16);
    }

    @Test
    public void test11458() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11458");
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
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory17 = slimTableFactoryTest0.getslimTableFactory();
        fitnesse.testsystems.slim.Table table18 = null;
        slimTableFactoryTest0.table = table18;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory20 = null;
        slimTableFactoryTest0.slimTableFactory = slimTableFactory20;
        java.util.Map<java.lang.String, java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable>> strMap22 = slimTableFactoryTest0.getmap();
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
        org.junit.Assert.assertNull(slimTableFactory9);
        org.junit.Assert.assertNull(slimTableFactory12);
        org.junit.Assert.assertNull(slimTableFactory17);
        org.junit.Assert.assertNull(strMap22);
    }

    @Test
    public void test11459() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11459");
        fitnesse.testsystems.slim.tables.SlimTableFactoryTest slimTableFactoryTest0 = new fitnesse.testsystems.slim.tables.SlimTableFactoryTest();
        fitnesse.testsystems.slim.Table table1 = null;
        slimTableFactoryTest0.table = table1;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory3 = null;
        slimTableFactoryTest0.slimTableFactory = slimTableFactory3;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory5 = slimTableFactoryTest0.getslimTableFactory();
        fitnesse.testsystems.slim.Table table6 = slimTableFactoryTest0.table;
        fitnesse.testsystems.slim.Table table7 = null;
        slimTableFactoryTest0.table = table7;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory9 = slimTableFactoryTest0.getslimTableFactory();
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory10 = slimTableFactoryTest0.slimTableFactory;
        fitnesse.testsystems.slim.Table table11 = null;
        slimTableFactoryTest0.settable(table11);
        fitnesse.testsystems.slim.Table table13 = null;
        slimTableFactoryTest0.table = table13;
        java.lang.Class<?> wildcardClass15 = slimTableFactoryTest0.getClass();
        org.junit.Assert.assertNull(slimTableFactory5);
        org.junit.Assert.assertNull(table6);
        org.junit.Assert.assertNull(slimTableFactory9);
        org.junit.Assert.assertNull(slimTableFactory10);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test11460() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11460");
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
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory12 = null;
        slimTableFactoryTest0.setslimTableFactory(slimTableFactory12);
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory14 = slimTableFactoryTest0.slimTableFactory;
        fitnesse.testsystems.slim.Table table15 = slimTableFactoryTest0.gettable();
        fitnesse.testsystems.slim.Table table16 = null;
        slimTableFactoryTest0.settable(table16);
        java.lang.Class<?> wildcardClass18 = slimTableFactoryTest0.getClass();
        org.junit.Assert.assertNull(slimTableFactory7);
        org.junit.Assert.assertNull(slimTableFactory8);
        org.junit.Assert.assertNull(table9);
        org.junit.Assert.assertNull(slimTableFactory14);
        org.junit.Assert.assertNull(table15);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test11461() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11461");
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
        fitnesse.testsystems.slim.Table table10 = null;
        slimTableFactoryTest0.table = table10;
        fitnesse.testsystems.slim.Table table12 = null;
        slimTableFactoryTest0.table = table12;
        fitnesse.testsystems.slim.Table table14 = slimTableFactoryTest0.gettable();
        fitnesse.testsystems.slim.Table table15 = null;
        slimTableFactoryTest0.settable(table15);
        java.lang.Class<?> wildcardClass17 = slimTableFactoryTest0.getClass();
        org.junit.Assert.assertNull(strMap5);
        org.junit.Assert.assertNull(slimTableFactory6);
        org.junit.Assert.assertNull(slimTableFactory7);
        org.junit.Assert.assertNull(strMap8);
        org.junit.Assert.assertNull(table9);
        org.junit.Assert.assertNull(table14);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test11462() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11462");
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
        slimTableFactoryTest0.setslimTableFactory(slimTableFactory9);
        java.util.Map<java.lang.String, java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable>> strMap11 = slimTableFactoryTest0.getmap();
        fitnesse.testsystems.slim.Table table12 = slimTableFactoryTest0.gettable();
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory13 = slimTableFactoryTest0.getslimTableFactory();
        org.junit.Assert.assertNull(slimTableFactory1);
        org.junit.Assert.assertNull(table2);
        org.junit.Assert.assertNull(strMap11);
        org.junit.Assert.assertNull(table12);
        org.junit.Assert.assertNull(slimTableFactory13);
    }

    @Test
    public void test11463() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11463");
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
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory15 = slimTableFactoryTest0.slimTableFactory;
        java.util.Map<java.lang.String, java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable>> strMap16 = slimTableFactoryTest0.getmap();
        org.junit.Assert.assertNull(slimTableFactory7);
        org.junit.Assert.assertNull(strMap10);
        org.junit.Assert.assertNull(table11);
        org.junit.Assert.assertNull(slimTableFactory14);
        org.junit.Assert.assertNull(slimTableFactory15);
        org.junit.Assert.assertNull(strMap16);
    }

    @Test
    public void test11464() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11464");
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
        java.util.Map<java.lang.String, java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable>> strMap11 = slimTableFactoryTest0.getmap();
        java.util.Map<java.lang.String, java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable>> strMap12 = slimTableFactoryTest0.map;
        fitnesse.testsystems.slim.Table table13 = slimTableFactoryTest0.gettable();
        // The following exception was thrown during execution in test generation
        try {
            slimTableFactoryTest0.checkTableTypeDefinesIgnoredIfDifferentSpecified();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(slimTableFactory7);
        org.junit.Assert.assertNull(slimTableFactory8);
        org.junit.Assert.assertNull(table9);
        org.junit.Assert.assertNull(strMap10);
        org.junit.Assert.assertNull(strMap11);
        org.junit.Assert.assertNull(strMap12);
        org.junit.Assert.assertNull(table13);
    }

    @Test
    public void test11465() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11465");
        fitnesse.testsystems.slim.tables.SlimTableFactoryTest slimTableFactoryTest0 = new fitnesse.testsystems.slim.tables.SlimTableFactoryTest();
        fitnesse.testsystems.slim.Table table1 = null;
        slimTableFactoryTest0.table = table1;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory3 = slimTableFactoryTest0.slimTableFactory;
        fitnesse.testsystems.slim.Table table4 = null;
        slimTableFactoryTest0.settable(table4);
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory6 = null;
        slimTableFactoryTest0.slimTableFactory = slimTableFactory6;
        java.util.Map<java.lang.String, java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable>> strMap8 = slimTableFactoryTest0.getmap();
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory9 = null;
        slimTableFactoryTest0.slimTableFactory = slimTableFactory9;
        fitnesse.testsystems.slim.Table table11 = slimTableFactoryTest0.gettable();
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory12 = slimTableFactoryTest0.slimTableFactory;
        org.junit.Assert.assertNull(slimTableFactory3);
        org.junit.Assert.assertNull(strMap8);
        org.junit.Assert.assertNull(table11);
        org.junit.Assert.assertNull(slimTableFactory12);
    }

    @Test
    public void test11466() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11466");
        fitnesse.testsystems.slim.tables.SlimTableFactoryTest slimTableFactoryTest0 = new fitnesse.testsystems.slim.tables.SlimTableFactoryTest();
        fitnesse.testsystems.slim.Table table1 = null;
        slimTableFactoryTest0.table = table1;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory3 = slimTableFactoryTest0.slimTableFactory;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory4 = null;
        slimTableFactoryTest0.slimTableFactory = slimTableFactory4;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory6 = null;
        slimTableFactoryTest0.setslimTableFactory(slimTableFactory6);
        fitnesse.testsystems.slim.Table table8 = null;
        slimTableFactoryTest0.table = table8;
        fitnesse.testsystems.slim.Table table10 = slimTableFactoryTest0.table;
        java.util.Map<java.lang.String, java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable>> strMap11 = slimTableFactoryTest0.getmap();
        fitnesse.testsystems.slim.Table table12 = null;
        slimTableFactoryTest0.settable(table12);
        fitnesse.testsystems.slim.Table table14 = null;
        slimTableFactoryTest0.table = table14;
        fitnesse.testsystems.slim.Table table16 = slimTableFactoryTest0.table;
        org.junit.Assert.assertNull(slimTableFactory3);
        org.junit.Assert.assertNull(table10);
        org.junit.Assert.assertNull(strMap11);
        org.junit.Assert.assertNull(table16);
    }

    @Test
    public void test11467() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11467");
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
        fitnesse.testsystems.slim.Table table10 = slimTableFactoryTest0.table;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory11 = slimTableFactoryTest0.slimTableFactory;
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
        org.junit.Assert.assertNull(table7);
        org.junit.Assert.assertNull(strMap8);
        org.junit.Assert.assertNull(slimTableFactory9);
        org.junit.Assert.assertNull(table10);
        org.junit.Assert.assertNull(slimTableFactory11);
    }

    @Test
    public void test11468() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11468");
        fitnesse.testsystems.slim.tables.SlimTableFactoryTest slimTableFactoryTest0 = new fitnesse.testsystems.slim.tables.SlimTableFactoryTest();
        fitnesse.testsystems.slim.Table table1 = null;
        slimTableFactoryTest0.table = table1;
        fitnesse.testsystems.slim.Table table3 = slimTableFactoryTest0.gettable();
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory4 = slimTableFactoryTest0.getslimTableFactory();
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory5 = null;
        slimTableFactoryTest0.slimTableFactory = slimTableFactory5;
        fitnesse.testsystems.slim.Table table7 = slimTableFactoryTest0.table;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory8 = null;
        slimTableFactoryTest0.setslimTableFactory(slimTableFactory8);
        java.util.Map<java.lang.String, java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable>> strMap10 = slimTableFactoryTest0.map;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory11 = slimTableFactoryTest0.getslimTableFactory();
        // The following exception was thrown during execution in test generation
        try {
            slimTableFactoryTest0.checkTableTypeDefinesIgnoredIfDifferentSpecified();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(table3);
        org.junit.Assert.assertNull(slimTableFactory4);
        org.junit.Assert.assertNull(table7);
        org.junit.Assert.assertNull(strMap10);
        org.junit.Assert.assertNull(slimTableFactory11);
    }

    @Test
    public void test11469() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11469");
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
        fitnesse.testsystems.slim.Table table10 = slimTableFactoryTest0.gettable();
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory11 = null;
        slimTableFactoryTest0.setslimTableFactory(slimTableFactory11);
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory13 = null;
        slimTableFactoryTest0.setslimTableFactory(slimTableFactory13);
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory15 = slimTableFactoryTest0.getslimTableFactory();
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory16 = slimTableFactoryTest0.slimTableFactory;
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
        org.junit.Assert.assertNull(table7);
        org.junit.Assert.assertNull(strMap8);
        org.junit.Assert.assertNull(strMap9);
        org.junit.Assert.assertNull(table10);
        org.junit.Assert.assertNull(slimTableFactory15);
        org.junit.Assert.assertNull(slimTableFactory16);
    }

    @Test
    public void test11470() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11470");
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
        java.util.Map<java.lang.String, java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable>> strMap13 = slimTableFactoryTest0.getmap();
        fitnesse.testsystems.slim.Table table14 = slimTableFactoryTest0.table;
        // The following exception was thrown during execution in test generation
        try {
            slimTableFactoryTest0.shouldCreateCorrectSlimTableForTablesType();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(strMap5);
        org.junit.Assert.assertNull(slimTableFactory10);
        org.junit.Assert.assertNull(slimTableFactory11);
        org.junit.Assert.assertNull(table12);
        org.junit.Assert.assertNull(strMap13);
        org.junit.Assert.assertNull(table14);
    }

    @Test
    public void test11471() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11471");
        fitnesse.testsystems.slim.tables.SlimTableFactoryTest slimTableFactoryTest0 = new fitnesse.testsystems.slim.tables.SlimTableFactoryTest();
        fitnesse.testsystems.slim.Table table1 = null;
        slimTableFactoryTest0.table = table1;
        fitnesse.testsystems.slim.Table table3 = slimTableFactoryTest0.table;
        fitnesse.testsystems.slim.Table table4 = slimTableFactoryTest0.gettable();
        java.util.Map<java.lang.String, java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable>> strMap5 = slimTableFactoryTest0.getmap();
        java.util.Map<java.lang.String, java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable>> strMap6 = slimTableFactoryTest0.map;
        fitnesse.testsystems.slim.Table table7 = slimTableFactoryTest0.table;
        java.util.Map<java.lang.String, java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable>> strMap8 = slimTableFactoryTest0.getmap();
        java.util.Map<java.lang.String, java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable>> strMap9 = slimTableFactoryTest0.getmap();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass10 = strMap9.getClass();
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
        org.junit.Assert.assertNull(strMap9);
    }

    @Test
    public void test11472() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11472");
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
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory20 = slimTableFactoryTest0.slimTableFactory;
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
        org.junit.Assert.assertNull(slimTableFactory20);
    }

    @Test
    public void test11473() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11473");
        fitnesse.testsystems.slim.tables.SlimTableFactoryTest slimTableFactoryTest0 = new fitnesse.testsystems.slim.tables.SlimTableFactoryTest();
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory1 = slimTableFactoryTest0.slimTableFactory;
        fitnesse.testsystems.slim.Table table2 = slimTableFactoryTest0.table;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory3 = null;
        slimTableFactoryTest0.setslimTableFactory(slimTableFactory3);
        fitnesse.testsystems.slim.Table table5 = slimTableFactoryTest0.table;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory6 = slimTableFactoryTest0.slimTableFactory;
        fitnesse.testsystems.slim.Table table7 = null;
        slimTableFactoryTest0.settable(table7);
        java.util.Map<java.lang.String, java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable>> strMap9 = slimTableFactoryTest0.map;
        org.junit.Assert.assertNull(slimTableFactory1);
        org.junit.Assert.assertNull(table2);
        org.junit.Assert.assertNull(table5);
        org.junit.Assert.assertNull(slimTableFactory6);
        org.junit.Assert.assertNull(strMap9);
    }

    @Test
    public void test11474() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11474");
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
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory10 = slimTableFactoryTest0.getslimTableFactory();
        fitnesse.testsystems.slim.Table table11 = slimTableFactoryTest0.gettable();
        java.util.Map<java.lang.String, java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable>> strMap12 = slimTableFactoryTest0.map;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory13 = slimTableFactoryTest0.slimTableFactory;
        org.junit.Assert.assertNull(table1);
        org.junit.Assert.assertNull(strMap2);
        org.junit.Assert.assertNull(slimTableFactory3);
        org.junit.Assert.assertNull(slimTableFactory4);
        org.junit.Assert.assertNull(table5);
        org.junit.Assert.assertNull(slimTableFactory6);
        org.junit.Assert.assertNull(slimTableFactory7);
        org.junit.Assert.assertNull(slimTableFactory10);
        org.junit.Assert.assertNull(table11);
        org.junit.Assert.assertNull(strMap12);
        org.junit.Assert.assertNull(slimTableFactory13);
    }

    @Test
    public void test11475() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11475");
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
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory14 = slimTableFactoryTest0.slimTableFactory;
        java.util.Map<java.lang.String, java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable>> strMap15 = slimTableFactoryTest0.getmap();
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
        org.junit.Assert.assertNull(strMap12);
        org.junit.Assert.assertNull(table13);
        org.junit.Assert.assertNull(slimTableFactory14);
        org.junit.Assert.assertNull(strMap15);
    }

    @Test
    public void test11476() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11476");
        fitnesse.testsystems.slim.tables.SlimTableFactoryTest slimTableFactoryTest0 = new fitnesse.testsystems.slim.tables.SlimTableFactoryTest();
        fitnesse.testsystems.slim.Table table1 = null;
        slimTableFactoryTest0.table = table1;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory3 = slimTableFactoryTest0.slimTableFactory;
        fitnesse.testsystems.slim.Table table4 = null;
        slimTableFactoryTest0.settable(table4);
        java.util.Map<java.lang.String, java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable>> strMap6 = slimTableFactoryTest0.getmap();
        fitnesse.testsystems.slim.Table table7 = slimTableFactoryTest0.gettable();
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory8 = null;
        slimTableFactoryTest0.slimTableFactory = slimTableFactory8;
        fitnesse.testsystems.slim.Table table10 = slimTableFactoryTest0.gettable();
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory11 = null;
        slimTableFactoryTest0.setslimTableFactory(slimTableFactory11);
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory13 = slimTableFactoryTest0.slimTableFactory;
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
        org.junit.Assert.assertNull(table10);
        org.junit.Assert.assertNull(slimTableFactory13);
    }

    @Test
    public void test11477() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11477");
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
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory16 = null;
        slimTableFactoryTest0.setslimTableFactory(slimTableFactory16);
        java.util.Map<java.lang.String, java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable>> strMap18 = slimTableFactoryTest0.getmap();
        org.junit.Assert.assertNull(slimTableFactory1);
        org.junit.Assert.assertNull(table2);
        org.junit.Assert.assertNull(table9);
        org.junit.Assert.assertNull(strMap18);
    }

    @Test
    public void test11478() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11478");
        fitnesse.testsystems.slim.tables.SlimTableFactoryTest slimTableFactoryTest0 = new fitnesse.testsystems.slim.tables.SlimTableFactoryTest();
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory1 = slimTableFactoryTest0.slimTableFactory;
        fitnesse.testsystems.slim.Table table2 = slimTableFactoryTest0.table;
        java.util.Map<java.lang.String, java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable>> strMap3 = slimTableFactoryTest0.map;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory4 = null;
        slimTableFactoryTest0.slimTableFactory = slimTableFactory4;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory6 = null;
        slimTableFactoryTest0.slimTableFactory = slimTableFactory6;
        fitnesse.testsystems.slim.Table table8 = slimTableFactoryTest0.table;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory9 = slimTableFactoryTest0.getslimTableFactory();
        // The following exception was thrown during execution in test generation
        try {
            slimTableFactoryTest0.addTableTypeImport("", "");
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
    public void test11479() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11479");
        fitnesse.testsystems.slim.tables.SlimTableFactoryTest slimTableFactoryTest0 = new fitnesse.testsystems.slim.tables.SlimTableFactoryTest();
        fitnesse.testsystems.slim.Table table1 = null;
        slimTableFactoryTest0.table = table1;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory3 = slimTableFactoryTest0.slimTableFactory;
        java.util.Map<java.lang.String, java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable>> strMap4 = slimTableFactoryTest0.getmap();
        fitnesse.testsystems.slim.Table table5 = null;
        slimTableFactoryTest0.settable(table5);
        fitnesse.testsystems.slim.Table table7 = null;
        slimTableFactoryTest0.settable(table7);
        fitnesse.testsystems.slim.Table table9 = slimTableFactoryTest0.table;
        java.util.Map<java.lang.String, java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable>> strMap10 = slimTableFactoryTest0.map;
        fitnesse.testsystems.slim.Table table11 = null;
        slimTableFactoryTest0.table = table11;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory13 = null;
        slimTableFactoryTest0.slimTableFactory = slimTableFactory13;
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
        org.junit.Assert.assertNull(strMap10);
    }

    @Test
    public void test11480() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11480");
        fitnesse.testsystems.slim.tables.SlimTableFactoryTest slimTableFactoryTest0 = new fitnesse.testsystems.slim.tables.SlimTableFactoryTest();
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory1 = slimTableFactoryTest0.slimTableFactory;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory2 = slimTableFactoryTest0.slimTableFactory;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory3 = null;
        slimTableFactoryTest0.slimTableFactory = slimTableFactory3;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory5 = slimTableFactoryTest0.slimTableFactory;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory6 = null;
        slimTableFactoryTest0.setslimTableFactory(slimTableFactory6);
        fitnesse.testsystems.slim.Table table8 = null;
        slimTableFactoryTest0.settable(table8);
        // The following exception was thrown during execution in test generation
        try {
            slimTableFactoryTest0.checkTableTypeDefinesIgnoredIfDifferentSpecified();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(slimTableFactory1);
        org.junit.Assert.assertNull(slimTableFactory2);
        org.junit.Assert.assertNull(slimTableFactory5);
    }

    @Test
    public void test11481() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11481");
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
        slimTableFactoryTest0.slimTableFactory = slimTableFactory11;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory13 = null;
        slimTableFactoryTest0.setslimTableFactory(slimTableFactory13);
        fitnesse.testsystems.slim.Table table15 = null;
        slimTableFactoryTest0.table = table15;
        // The following exception was thrown during execution in test generation
        try {
            slimTableFactoryTest0.checkTableTypeDefineUsedForTable();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test11482() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11482");
        fitnesse.testsystems.slim.tables.SlimTableFactoryTest slimTableFactoryTest0 = new fitnesse.testsystems.slim.tables.SlimTableFactoryTest();
        fitnesse.testsystems.slim.Table table1 = null;
        slimTableFactoryTest0.table = table1;
        fitnesse.testsystems.slim.Table table3 = null;
        slimTableFactoryTest0.settable(table3);
        fitnesse.testsystems.slim.Table table5 = null;
        slimTableFactoryTest0.settable(table5);
        fitnesse.testsystems.slim.Table table7 = slimTableFactoryTest0.table;
        fitnesse.testsystems.slim.Table table8 = slimTableFactoryTest0.gettable();
        fitnesse.testsystems.slim.Table table9 = null;
        slimTableFactoryTest0.table = table9;
        fitnesse.testsystems.slim.Table table11 = slimTableFactoryTest0.table;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory12 = null;
        slimTableFactoryTest0.slimTableFactory = slimTableFactory12;
        fitnesse.testsystems.slim.Table table14 = slimTableFactoryTest0.gettable();
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory15 = null;
        slimTableFactoryTest0.slimTableFactory = slimTableFactory15;
        fitnesse.testsystems.slim.Table table17 = slimTableFactoryTest0.gettable();
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory18 = slimTableFactoryTest0.slimTableFactory;
        org.junit.Assert.assertNull(table7);
        org.junit.Assert.assertNull(table8);
        org.junit.Assert.assertNull(table11);
        org.junit.Assert.assertNull(table14);
        org.junit.Assert.assertNull(table17);
        org.junit.Assert.assertNull(slimTableFactory18);
    }

    @Test
    public void test11483() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11483");
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
        fitnesse.testsystems.slim.Table table13 = null;
        slimTableFactoryTest0.settable(table13);
        java.util.Map<java.lang.String, java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable>> strMap15 = slimTableFactoryTest0.map;
        fitnesse.testsystems.slim.Table table16 = slimTableFactoryTest0.gettable();
        fitnesse.testsystems.slim.Table table17 = slimTableFactoryTest0.table;
        java.lang.Class<?> wildcardClass18 = slimTableFactoryTest0.getClass();
        org.junit.Assert.assertNull(slimTableFactory1);
        org.junit.Assert.assertNull(table2);
        org.junit.Assert.assertNull(strMap3);
        org.junit.Assert.assertNull(strMap8);
        org.junit.Assert.assertNull(table9);
        org.junit.Assert.assertNull(slimTableFactory12);
        org.junit.Assert.assertNull(strMap15);
        org.junit.Assert.assertNull(table16);
        org.junit.Assert.assertNull(table17);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test11484() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11484");
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
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory10 = slimTableFactoryTest0.getslimTableFactory();
        java.util.Map<java.lang.String, java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable>> strMap11 = slimTableFactoryTest0.map;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory12 = slimTableFactoryTest0.slimTableFactory;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory13 = slimTableFactoryTest0.getslimTableFactory();
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
        org.junit.Assert.assertNull(table7);
        org.junit.Assert.assertNull(slimTableFactory10);
        org.junit.Assert.assertNull(strMap11);
        org.junit.Assert.assertNull(slimTableFactory12);
        org.junit.Assert.assertNull(slimTableFactory13);
    }

    @Test
    public void test11485() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11485");
        fitnesse.testsystems.slim.tables.SlimTableFactoryTest slimTableFactoryTest0 = new fitnesse.testsystems.slim.tables.SlimTableFactoryTest();
        fitnesse.testsystems.slim.Table table1 = slimTableFactoryTest0.table;
        java.util.Map<java.lang.String, java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable>> strMap2 = slimTableFactoryTest0.getmap();
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory3 = null;
        slimTableFactoryTest0.slimTableFactory = slimTableFactory3;
        java.util.Map<java.lang.String, java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable>> strMap5 = slimTableFactoryTest0.map;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory6 = slimTableFactoryTest0.slimTableFactory;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory7 = slimTableFactoryTest0.slimTableFactory;
        fitnesse.testsystems.slim.Table table8 = slimTableFactoryTest0.table;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory9 = null;
        slimTableFactoryTest0.setslimTableFactory(slimTableFactory9);
        org.junit.Assert.assertNull(table1);
        org.junit.Assert.assertNull(strMap2);
        org.junit.Assert.assertNull(strMap5);
        org.junit.Assert.assertNull(slimTableFactory6);
        org.junit.Assert.assertNull(slimTableFactory7);
        org.junit.Assert.assertNull(table8);
    }

    @Test
    public void test11486() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11486");
        fitnesse.testsystems.slim.tables.SlimTableFactoryTest slimTableFactoryTest0 = new fitnesse.testsystems.slim.tables.SlimTableFactoryTest();
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory1 = null;
        slimTableFactoryTest0.slimTableFactory = slimTableFactory1;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory3 = slimTableFactoryTest0.getslimTableFactory();
        java.util.Map<java.lang.String, java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable>> strMap4 = slimTableFactoryTest0.getmap();
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory5 = null;
        slimTableFactoryTest0.setslimTableFactory(slimTableFactory5);
        java.util.Map<java.lang.String, java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable>> strMap7 = slimTableFactoryTest0.map;
        fitnesse.testsystems.slim.Table table8 = slimTableFactoryTest0.gettable();
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory9 = null;
        slimTableFactoryTest0.setslimTableFactory(slimTableFactory9);
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory11 = null;
        slimTableFactoryTest0.slimTableFactory = slimTableFactory11;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory13 = slimTableFactoryTest0.slimTableFactory;
        org.junit.Assert.assertNull(slimTableFactory3);
        org.junit.Assert.assertNull(strMap4);
        org.junit.Assert.assertNull(strMap7);
        org.junit.Assert.assertNull(table8);
        org.junit.Assert.assertNull(slimTableFactory13);
    }

    @Test
    public void test11487() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11487");
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
        fitnesse.testsystems.slim.Table table10 = slimTableFactoryTest0.gettable();
        java.util.Map<java.lang.String, java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable>> strMap11 = slimTableFactoryTest0.getmap();
        fitnesse.testsystems.slim.Table table12 = null;
        slimTableFactoryTest0.table = table12;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory14 = null;
        slimTableFactoryTest0.slimTableFactory = slimTableFactory14;
        fitnesse.testsystems.slim.Table table16 = slimTableFactoryTest0.gettable();
        fitnesse.testsystems.slim.Table table17 = slimTableFactoryTest0.gettable();
        // The following exception was thrown during execution in test generation
        try {
            slimTableFactoryTest0.shouldCreateCorrectSlimTableForTablesType();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(strMap7);
        org.junit.Assert.assertNull(table10);
        org.junit.Assert.assertNull(strMap11);
        org.junit.Assert.assertNull(table16);
        org.junit.Assert.assertNull(table17);
    }

    @Test
    public void test11488() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11488");
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
        java.util.Map<java.lang.String, java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable>> strMap15 = slimTableFactoryTest0.map;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory16 = slimTableFactoryTest0.slimTableFactory;
        org.junit.Assert.assertNull(strMap5);
        org.junit.Assert.assertNull(slimTableFactory6);
        org.junit.Assert.assertNull(slimTableFactory7);
        org.junit.Assert.assertNull(strMap8);
        org.junit.Assert.assertNull(strMap9);
        org.junit.Assert.assertNull(table10);
        org.junit.Assert.assertNull(table13);
        org.junit.Assert.assertNull(slimTableFactory14);
        org.junit.Assert.assertNull(strMap15);
        org.junit.Assert.assertNull(slimTableFactory16);
    }

    @Test
    public void test11489() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11489");
        fitnesse.testsystems.slim.tables.SlimTableFactoryTest slimTableFactoryTest0 = new fitnesse.testsystems.slim.tables.SlimTableFactoryTest();
        fitnesse.testsystems.slim.Table table1 = null;
        slimTableFactoryTest0.table = table1;
        fitnesse.testsystems.slim.Table table3 = slimTableFactoryTest0.table;
        fitnesse.testsystems.slim.Table table4 = slimTableFactoryTest0.gettable();
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory5 = slimTableFactoryTest0.slimTableFactory;
        java.util.Map<java.lang.String, java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable>> strMap6 = slimTableFactoryTest0.map;
        java.util.Map<java.lang.String, java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable>> strMap7 = slimTableFactoryTest0.getmap();
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory8 = slimTableFactoryTest0.getslimTableFactory();
        fitnesse.testsystems.slim.Table table9 = slimTableFactoryTest0.table;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory10 = null;
        slimTableFactoryTest0.setslimTableFactory(slimTableFactory10);
        fitnesse.testsystems.slim.Table table12 = null;
        slimTableFactoryTest0.settable(table12);
        org.junit.Assert.assertNull(table3);
        org.junit.Assert.assertNull(table4);
        org.junit.Assert.assertNull(slimTableFactory5);
        org.junit.Assert.assertNull(strMap6);
        org.junit.Assert.assertNull(strMap7);
        org.junit.Assert.assertNull(slimTableFactory8);
        org.junit.Assert.assertNull(table9);
    }

    @Test
    public void test11490() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11490");
        fitnesse.testsystems.slim.tables.SlimTableFactoryTest slimTableFactoryTest0 = new fitnesse.testsystems.slim.tables.SlimTableFactoryTest();
        fitnesse.testsystems.slim.Table table1 = slimTableFactoryTest0.table;
        java.util.Map<java.lang.String, java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable>> strMap2 = slimTableFactoryTest0.getmap();
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory3 = slimTableFactoryTest0.slimTableFactory;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory4 = slimTableFactoryTest0.getslimTableFactory();
        java.util.Map<java.lang.String, java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable>> strMap5 = slimTableFactoryTest0.getmap();
        fitnesse.testsystems.slim.Table table6 = null;
        slimTableFactoryTest0.settable(table6);
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory8 = null;
        slimTableFactoryTest0.slimTableFactory = slimTableFactory8;
        java.lang.Class<?> wildcardClass10 = slimTableFactoryTest0.getClass();
        org.junit.Assert.assertNull(table1);
        org.junit.Assert.assertNull(strMap2);
        org.junit.Assert.assertNull(slimTableFactory3);
        org.junit.Assert.assertNull(slimTableFactory4);
        org.junit.Assert.assertNull(strMap5);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test11491() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11491");
        fitnesse.testsystems.slim.tables.SlimTableFactoryTest slimTableFactoryTest0 = new fitnesse.testsystems.slim.tables.SlimTableFactoryTest();
        fitnesse.testsystems.slim.Table table1 = null;
        slimTableFactoryTest0.table = table1;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory3 = slimTableFactoryTest0.getslimTableFactory();
        fitnesse.testsystems.slim.Table table4 = slimTableFactoryTest0.gettable();
        fitnesse.testsystems.slim.Table table5 = slimTableFactoryTest0.gettable();
        fitnesse.testsystems.slim.Table table6 = null;
        slimTableFactoryTest0.table = table6;
        // The following exception was thrown during execution in test generation
        try {
            slimTableFactoryTest0.commentTableShouldReturnNull();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(slimTableFactory3);
        org.junit.Assert.assertNull(table4);
        org.junit.Assert.assertNull(table5);
    }

    @Test
    public void test11492() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11492");
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
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory15 = slimTableFactoryTest0.getslimTableFactory();
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory16 = slimTableFactoryTest0.getslimTableFactory();
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
        org.junit.Assert.assertNull(table14);
        org.junit.Assert.assertNull(slimTableFactory15);
        org.junit.Assert.assertNull(slimTableFactory16);
    }

    @Test
    public void test11493() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11493");
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
        java.util.Map<java.lang.String, java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable>> strMap16 = slimTableFactoryTest0.getmap();
        org.junit.Assert.assertNull(slimTableFactory3);
        org.junit.Assert.assertNull(strMap4);
        org.junit.Assert.assertNull(strMap9);
        org.junit.Assert.assertNull(strMap10);
        org.junit.Assert.assertNull(table11);
        org.junit.Assert.assertNull(slimTableFactory12);
        org.junit.Assert.assertNull(strMap13);
        org.junit.Assert.assertNull(strMap16);
    }

    @Test
    public void test11494() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11494");
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
        java.util.Map<java.lang.String, java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable>> strMap16 = slimTableFactoryTest0.getmap();
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory17 = slimTableFactoryTest0.getslimTableFactory();
        fitnesse.testsystems.slim.Table table18 = slimTableFactoryTest0.gettable();
        fitnesse.testsystems.slim.Table table19 = null;
        slimTableFactoryTest0.settable(table19);
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory21 = null;
        slimTableFactoryTest0.setslimTableFactory(slimTableFactory21);
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
        org.junit.Assert.assertNull(strMap11);
        org.junit.Assert.assertNull(strMap16);
        org.junit.Assert.assertNull(slimTableFactory17);
        org.junit.Assert.assertNull(table18);
    }

    @Test
    public void test11495() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11495");
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
        fitnesse.testsystems.slim.Table table17 = slimTableFactoryTest0.gettable();
        fitnesse.testsystems.slim.Table table18 = null;
        slimTableFactoryTest0.settable(table18);
        fitnesse.testsystems.slim.Table table20 = null;
        slimTableFactoryTest0.table = table20;
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
        org.junit.Assert.assertNull(table16);
        org.junit.Assert.assertNull(table17);
    }

    @Test
    public void test11496() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11496");
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
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory17 = slimTableFactoryTest0.slimTableFactory;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory18 = null;
        slimTableFactoryTest0.slimTableFactory = slimTableFactory18;
        // The following exception was thrown during execution in test generation
        try {
            slimTableFactoryTest0.addTableTypeImport("", "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(slimTableFactory3);
        org.junit.Assert.assertNull(strMap4);
        org.junit.Assert.assertNull(table13);
        org.junit.Assert.assertNull(slimTableFactory14);
        org.junit.Assert.assertNull(slimTableFactory17);
    }

    @Test
    public void test11497() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11497");
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
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory10 = slimTableFactoryTest0.getslimTableFactory();
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory11 = null;
        slimTableFactoryTest0.slimTableFactory = slimTableFactory11;
        java.util.Map<java.lang.String, java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable>> strMap13 = slimTableFactoryTest0.getmap();
        // The following exception was thrown during execution in test generation
        try {
            slimTableFactoryTest0.checkTableTypeDefinesIgnoredIfDifferentSpecified();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(strMap5);
        org.junit.Assert.assertNull(strMap6);
        org.junit.Assert.assertNull(slimTableFactory9);
        org.junit.Assert.assertNull(slimTableFactory10);
        org.junit.Assert.assertNull(strMap13);
    }

    @Test
    public void test11498() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11498");
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
        java.util.Map<java.lang.String, java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable>> strMap12 = slimTableFactoryTest0.getmap();
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory13 = null;
        slimTableFactoryTest0.setslimTableFactory(slimTableFactory13);
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
        org.junit.Assert.assertNull(slimTableFactory10);
        org.junit.Assert.assertNull(slimTableFactory11);
        org.junit.Assert.assertNull(strMap12);
    }

    @Test
    public void test11499() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11499");
        fitnesse.testsystems.slim.tables.SlimTableFactoryTest slimTableFactoryTest0 = new fitnesse.testsystems.slim.tables.SlimTableFactoryTest();
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory1 = slimTableFactoryTest0.slimTableFactory;
        fitnesse.testsystems.slim.Table table2 = slimTableFactoryTest0.gettable();
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory3 = null;
        slimTableFactoryTest0.slimTableFactory = slimTableFactory3;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory5 = null;
        slimTableFactoryTest0.slimTableFactory = slimTableFactory5;
        fitnesse.testsystems.slim.Table table7 = slimTableFactoryTest0.gettable();
        java.util.Map<java.lang.String, java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable>> strMap8 = slimTableFactoryTest0.getmap();
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
        org.junit.Assert.assertNull(table7);
        org.junit.Assert.assertNull(strMap8);
        org.junit.Assert.assertNull(table9);
    }

    @Test
    public void test11500() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11500");
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
        fitnesse.testsystems.slim.Table table11 = null;
        slimTableFactoryTest0.settable(table11);
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory13 = null;
        slimTableFactoryTest0.setslimTableFactory(slimTableFactory13);
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory15 = slimTableFactoryTest0.getslimTableFactory();
        fitnesse.testsystems.slim.Table table16 = null;
        slimTableFactoryTest0.settable(table16);
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory18 = null;
        slimTableFactoryTest0.slimTableFactory = slimTableFactory18;
        java.util.Map<java.lang.String, java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable>> strMap20 = slimTableFactoryTest0.getmap();
        org.junit.Assert.assertNull(strMap5);
        org.junit.Assert.assertNull(table10);
        org.junit.Assert.assertNull(slimTableFactory15);
        org.junit.Assert.assertNull(strMap20);
    }
}

