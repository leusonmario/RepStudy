import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest17 {

    public static boolean debug = false;

    @Test
    public void test08501() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08501");
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
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory10 = slimTableFactoryTest0.getslimTableFactory();
        java.util.Map<java.lang.String, java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable>> strMap11 = slimTableFactoryTest0.getmap();
        org.junit.Assert.assertNull(slimTableFactory9);
        org.junit.Assert.assertNull(slimTableFactory10);
        org.junit.Assert.assertNull(strMap11);
    }

    @Test
    public void test08502() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08502");
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
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory11 = null;
        slimTableFactoryTest0.setslimTableFactory(slimTableFactory11);
        fitnesse.testsystems.slim.Table table13 = slimTableFactoryTest0.table;
        fitnesse.testsystems.slim.Table table14 = slimTableFactoryTest0.table;
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
        org.junit.Assert.assertNull(slimTableFactory10);
        org.junit.Assert.assertNull(table13);
        org.junit.Assert.assertNull(table14);
    }

    @Test
    public void test08503() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08503");
        fitnesse.testsystems.slim.tables.SlimTableFactoryTest slimTableFactoryTest0 = new fitnesse.testsystems.slim.tables.SlimTableFactoryTest();
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory1 = slimTableFactoryTest0.slimTableFactory;
        fitnesse.testsystems.slim.Table table2 = slimTableFactoryTest0.gettable();
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory3 = null;
        slimTableFactoryTest0.setslimTableFactory(slimTableFactory3);
        fitnesse.testsystems.slim.Table table5 = slimTableFactoryTest0.table;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory6 = slimTableFactoryTest0.getslimTableFactory();
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
    public void test08504() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08504");
        fitnesse.testsystems.slim.tables.SlimTableFactoryTest slimTableFactoryTest0 = new fitnesse.testsystems.slim.tables.SlimTableFactoryTest();
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory1 = slimTableFactoryTest0.slimTableFactory;
        fitnesse.testsystems.slim.Table table2 = slimTableFactoryTest0.gettable();
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory3 = null;
        slimTableFactoryTest0.slimTableFactory = slimTableFactory3;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory5 = null;
        slimTableFactoryTest0.slimTableFactory = slimTableFactory5;
        fitnesse.testsystems.slim.Table table7 = slimTableFactoryTest0.gettable();
        java.util.Map<java.lang.String, java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable>> strMap8 = slimTableFactoryTest0.getmap();
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
        org.junit.Assert.assertNull(strMap8);
    }

    @Test
    public void test08505() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08505");
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
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory14 = null;
        slimTableFactoryTest0.setslimTableFactory(slimTableFactory14);
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory16 = slimTableFactoryTest0.slimTableFactory;
        org.junit.Assert.assertNull(slimTableFactory1);
        org.junit.Assert.assertNull(table2);
        org.junit.Assert.assertNull(slimTableFactory7);
        org.junit.Assert.assertNull(slimTableFactory8);
        org.junit.Assert.assertNull(table9);
        org.junit.Assert.assertNull(strMap12);
        org.junit.Assert.assertNull(table13);
        org.junit.Assert.assertNull(slimTableFactory16);
    }

    @Test
    public void test08506() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08506");
        fitnesse.testsystems.slim.tables.SlimTableFactoryTest slimTableFactoryTest0 = new fitnesse.testsystems.slim.tables.SlimTableFactoryTest();
        fitnesse.testsystems.slim.Table table1 = slimTableFactoryTest0.table;
        java.util.Map<java.lang.String, java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable>> strMap2 = slimTableFactoryTest0.getmap();
        java.util.Map<java.lang.String, java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable>> strMap3 = slimTableFactoryTest0.getmap();
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory4 = slimTableFactoryTest0.slimTableFactory;
        fitnesse.testsystems.slim.Table table5 = null;
        slimTableFactoryTest0.table = table5;
        java.util.Map<java.lang.String, java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable>> strMap7 = slimTableFactoryTest0.map;
        fitnesse.testsystems.slim.Table table8 = slimTableFactoryTest0.gettable();
        fitnesse.testsystems.slim.Table table9 = slimTableFactoryTest0.gettable();
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
        org.junit.Assert.assertNull(table8);
        org.junit.Assert.assertNull(table9);
    }

    @Test
    public void test08507() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08507");
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
        java.util.Map<java.lang.String, java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable>> strMap17 = slimTableFactoryTest0.getmap();
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory18 = slimTableFactoryTest0.slimTableFactory;
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
        org.junit.Assert.assertNull(slimTableFactory18);
    }

    @Test
    public void test08508() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08508");
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
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory19 = null;
        slimTableFactoryTest0.setslimTableFactory(slimTableFactory19);
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory21 = slimTableFactoryTest0.slimTableFactory;
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
        org.junit.Assert.assertNull(slimTableFactory21);
    }

    @Test
    public void test08509() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08509");
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
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass19 = table18.getClass();
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
    public void test08510() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08510");
        fitnesse.testsystems.slim.tables.SlimTableFactoryTest slimTableFactoryTest0 = new fitnesse.testsystems.slim.tables.SlimTableFactoryTest();
        fitnesse.testsystems.slim.Table table1 = null;
        slimTableFactoryTest0.table = table1;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory3 = slimTableFactoryTest0.getslimTableFactory();
        fitnesse.testsystems.slim.Table table4 = slimTableFactoryTest0.gettable();
        fitnesse.testsystems.slim.Table table5 = slimTableFactoryTest0.table;
        fitnesse.testsystems.slim.Table table6 = slimTableFactoryTest0.gettable();
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory7 = slimTableFactoryTest0.slimTableFactory;
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
        org.junit.Assert.assertNull(table6);
        org.junit.Assert.assertNull(slimTableFactory7);
    }

    @Test
    public void test08511() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08511");
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
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory10 = slimTableFactoryTest0.slimTableFactory;
        java.util.Map<java.lang.String, java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable>> strMap11 = slimTableFactoryTest0.getmap();
        fitnesse.testsystems.slim.Table table12 = null;
        slimTableFactoryTest0.settable(table12);
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory14 = null;
        slimTableFactoryTest0.slimTableFactory = slimTableFactory14;
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
        org.junit.Assert.assertNull(slimTableFactory10);
        org.junit.Assert.assertNull(strMap11);
    }

    @Test
    public void test08512() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08512");
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
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory12 = slimTableFactoryTest0.getslimTableFactory();
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory13 = null;
        slimTableFactoryTest0.setslimTableFactory(slimTableFactory13);
        fitnesse.testsystems.slim.Table table15 = slimTableFactoryTest0.gettable();
        org.junit.Assert.assertNull(slimTableFactory1);
        org.junit.Assert.assertNull(table2);
        org.junit.Assert.assertNull(slimTableFactory7);
        org.junit.Assert.assertNull(slimTableFactory8);
        org.junit.Assert.assertNull(table11);
        org.junit.Assert.assertNull(slimTableFactory12);
        org.junit.Assert.assertNull(table15);
    }

    @Test
    public void test08513() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08513");
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
        org.junit.Assert.assertNull(strMap10);
        org.junit.Assert.assertNull(strMap11);
    }

    @Test
    public void test08514() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08514");
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
        fitnesse.testsystems.slim.Table table10 = slimTableFactoryTest0.gettable();
        fitnesse.testsystems.slim.Table table11 = slimTableFactoryTest0.table;
        org.junit.Assert.assertNull(slimTableFactory5);
        org.junit.Assert.assertNull(strMap6);
        org.junit.Assert.assertNull(strMap9);
        org.junit.Assert.assertNull(table10);
        org.junit.Assert.assertNull(table11);
    }

    @Test
    public void test08515() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08515");
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
        fitnesse.testsystems.slim.Table table13 = null;
        slimTableFactoryTest0.settable(table13);
        fitnesse.testsystems.slim.Table table15 = slimTableFactoryTest0.table;
        org.junit.Assert.assertNull(table7);
        org.junit.Assert.assertNull(table12);
        org.junit.Assert.assertNull(table15);
    }

    @Test
    public void test08516() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08516");
        fitnesse.testsystems.slim.tables.SlimTableFactoryTest slimTableFactoryTest0 = new fitnesse.testsystems.slim.tables.SlimTableFactoryTest();
        fitnesse.testsystems.slim.Table table1 = slimTableFactoryTest0.table;
        java.util.Map<java.lang.String, java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable>> strMap2 = slimTableFactoryTest0.getmap();
        fitnesse.testsystems.slim.Table table3 = null;
        slimTableFactoryTest0.table = table3;
        java.util.Map<java.lang.String, java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable>> strMap5 = slimTableFactoryTest0.getmap();
        java.util.Map<java.lang.String, java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable>> strMap6 = slimTableFactoryTest0.getmap();
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory7 = null;
        slimTableFactoryTest0.slimTableFactory = slimTableFactory7;
        java.util.Map<java.lang.String, java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable>> strMap9 = slimTableFactoryTest0.getmap();
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
        org.junit.Assert.assertNull(strMap9);
    }

    @Test
    public void test08517() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08517");
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
        java.util.Map<java.lang.String, java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable>> strMap16 = slimTableFactoryTest0.getmap();
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory17 = slimTableFactoryTest0.slimTableFactory;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass18 = slimTableFactory17.getClass();
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
        org.junit.Assert.assertNull(strMap16);
        org.junit.Assert.assertNull(slimTableFactory17);
    }

    @Test
    public void test08518() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08518");
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
        java.util.Map<java.lang.String, java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable>> strMap12 = slimTableFactoryTest0.getmap();
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
        org.junit.Assert.assertNull(slimTableFactory10);
        org.junit.Assert.assertNull(strMap11);
        org.junit.Assert.assertNull(strMap12);
    }

    @Test
    public void test08519() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08519");
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
        java.util.Map<java.lang.String, java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable>> strMap12 = slimTableFactoryTest0.getmap();
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
        org.junit.Assert.assertNull(table8);
        org.junit.Assert.assertNull(strMap9);
        org.junit.Assert.assertNull(strMap12);
    }

    @Test
    public void test08520() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08520");
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
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory17 = slimTableFactoryTest0.getslimTableFactory();
        fitnesse.testsystems.slim.Table table18 = null;
        slimTableFactoryTest0.table = table18;
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
        org.junit.Assert.assertNull(slimTableFactory17);
    }

    @Test
    public void test08521() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08521");
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
            slimTableFactoryTest0.addTableTypeImport("", "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(slimTableFactory1);
        org.junit.Assert.assertNull(table2);
    }

    @Test
    public void test08522() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08522");
        fitnesse.testsystems.slim.tables.SlimTableFactoryTest slimTableFactoryTest0 = new fitnesse.testsystems.slim.tables.SlimTableFactoryTest();
        fitnesse.testsystems.slim.Table table1 = null;
        slimTableFactoryTest0.table = table1;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory3 = null;
        slimTableFactoryTest0.slimTableFactory = slimTableFactory3;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory5 = slimTableFactoryTest0.getslimTableFactory();
        java.util.Map<java.lang.String, java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable>> strMap6 = slimTableFactoryTest0.map;
        fitnesse.testsystems.slim.Table table7 = null;
        slimTableFactoryTest0.table = table7;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory9 = slimTableFactoryTest0.getslimTableFactory();
        fitnesse.testsystems.slim.Table table10 = slimTableFactoryTest0.table;
        fitnesse.testsystems.slim.Table table11 = slimTableFactoryTest0.table;
        java.util.Map<java.lang.String, java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable>> strMap12 = slimTableFactoryTest0.getmap();
        org.junit.Assert.assertNull(slimTableFactory5);
        org.junit.Assert.assertNull(strMap6);
        org.junit.Assert.assertNull(slimTableFactory9);
        org.junit.Assert.assertNull(table10);
        org.junit.Assert.assertNull(table11);
        org.junit.Assert.assertNull(strMap12);
    }

    @Test
    public void test08523() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08523");
        fitnesse.testsystems.slim.tables.SlimTableFactoryTest slimTableFactoryTest0 = new fitnesse.testsystems.slim.tables.SlimTableFactoryTest();
        fitnesse.testsystems.slim.Table table1 = null;
        slimTableFactoryTest0.table = table1;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory3 = null;
        slimTableFactoryTest0.slimTableFactory = slimTableFactory3;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory5 = slimTableFactoryTest0.getslimTableFactory();
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory6 = null;
        slimTableFactoryTest0.setslimTableFactory(slimTableFactory6);
        fitnesse.testsystems.slim.Table table8 = slimTableFactoryTest0.table;
        // The following exception was thrown during execution in test generation
        try {
            slimTableFactoryTest0.addTableTypeImport("hi!", "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(slimTableFactory5);
        org.junit.Assert.assertNull(table8);
    }

    @Test
    public void test08524() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08524");
        fitnesse.testsystems.slim.tables.SlimTableFactoryTest slimTableFactoryTest0 = new fitnesse.testsystems.slim.tables.SlimTableFactoryTest();
        fitnesse.testsystems.slim.Table table1 = null;
        slimTableFactoryTest0.table = table1;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory3 = slimTableFactoryTest0.slimTableFactory;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory4 = null;
        slimTableFactoryTest0.setslimTableFactory(slimTableFactory4);
        fitnesse.testsystems.slim.Table table6 = null;
        slimTableFactoryTest0.settable(table6);
        fitnesse.testsystems.slim.Table table8 = null;
        slimTableFactoryTest0.table = table8;
        fitnesse.testsystems.slim.Table table10 = slimTableFactoryTest0.gettable();
        // The following exception was thrown during execution in test generation
        try {
            slimTableFactoryTest0.tableTypeStartingWithcommentColonShouldReturnNull();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(slimTableFactory3);
        org.junit.Assert.assertNull(table10);
    }

    @Test
    public void test08525() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08525");
        fitnesse.testsystems.slim.tables.SlimTableFactoryTest slimTableFactoryTest0 = new fitnesse.testsystems.slim.tables.SlimTableFactoryTest();
        fitnesse.testsystems.slim.Table table1 = null;
        slimTableFactoryTest0.table = table1;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory3 = null;
        slimTableFactoryTest0.slimTableFactory = slimTableFactory3;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory5 = slimTableFactoryTest0.getslimTableFactory();
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory6 = slimTableFactoryTest0.getslimTableFactory();
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory7 = null;
        slimTableFactoryTest0.slimTableFactory = slimTableFactory7;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory9 = null;
        slimTableFactoryTest0.slimTableFactory = slimTableFactory9;
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
    public void test08526() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08526");
        fitnesse.testsystems.slim.tables.SlimTableFactoryTest slimTableFactoryTest0 = new fitnesse.testsystems.slim.tables.SlimTableFactoryTest();
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory1 = slimTableFactoryTest0.slimTableFactory;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory2 = slimTableFactoryTest0.slimTableFactory;
        fitnesse.testsystems.slim.Table table3 = slimTableFactoryTest0.gettable();
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory4 = slimTableFactoryTest0.getslimTableFactory();
        fitnesse.testsystems.slim.Table table5 = null;
        slimTableFactoryTest0.table = table5;
        java.util.Map<java.lang.String, java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable>> strMap7 = slimTableFactoryTest0.getmap();
        fitnesse.testsystems.slim.Table table8 = slimTableFactoryTest0.table;
        fitnesse.testsystems.slim.Table table9 = slimTableFactoryTest0.gettable();
        fitnesse.testsystems.slim.Table table10 = slimTableFactoryTest0.table;
        java.util.Map<java.lang.String, java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable>> strMap11 = slimTableFactoryTest0.getmap();
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory12 = slimTableFactoryTest0.getslimTableFactory();
        org.junit.Assert.assertNull(slimTableFactory1);
        org.junit.Assert.assertNull(slimTableFactory2);
        org.junit.Assert.assertNull(table3);
        org.junit.Assert.assertNull(slimTableFactory4);
        org.junit.Assert.assertNull(strMap7);
        org.junit.Assert.assertNull(table8);
        org.junit.Assert.assertNull(table9);
        org.junit.Assert.assertNull(table10);
        org.junit.Assert.assertNull(strMap11);
        org.junit.Assert.assertNull(slimTableFactory12);
    }

    @Test
    public void test08527() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08527");
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
        fitnesse.testsystems.slim.Table table13 = slimTableFactoryTest0.table;
        java.util.Map<java.lang.String, java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable>> strMap14 = slimTableFactoryTest0.getmap();
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory15 = slimTableFactoryTest0.getslimTableFactory();
        // The following exception was thrown during execution in test generation
        try {
            slimTableFactoryTest0.commentTableShouldReturnNull();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(strMap5);
        org.junit.Assert.assertNull(table10);
        org.junit.Assert.assertNull(table13);
        org.junit.Assert.assertNull(strMap14);
        org.junit.Assert.assertNull(slimTableFactory15);
    }

    @Test
    public void test08528() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08528");
        fitnesse.testsystems.slim.tables.SlimTableFactoryTest slimTableFactoryTest0 = new fitnesse.testsystems.slim.tables.SlimTableFactoryTest();
        fitnesse.testsystems.slim.Table table1 = null;
        slimTableFactoryTest0.table = table1;
        fitnesse.testsystems.slim.Table table3 = null;
        slimTableFactoryTest0.settable(table3);
        java.util.Map<java.lang.String, java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable>> strMap5 = slimTableFactoryTest0.map;
        java.util.Map<java.lang.String, java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable>> strMap6 = slimTableFactoryTest0.getmap();
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory7 = null;
        slimTableFactoryTest0.slimTableFactory = slimTableFactory7;
        java.util.Map<java.lang.String, java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable>> strMap9 = slimTableFactoryTest0.getmap();
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory10 = null;
        slimTableFactoryTest0.slimTableFactory = slimTableFactory10;
        fitnesse.testsystems.slim.Table table12 = slimTableFactoryTest0.gettable();
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory13 = slimTableFactoryTest0.slimTableFactory;
        org.junit.Assert.assertNull(strMap5);
        org.junit.Assert.assertNull(strMap6);
        org.junit.Assert.assertNull(strMap9);
        org.junit.Assert.assertNull(table12);
        org.junit.Assert.assertNull(slimTableFactory13);
    }

    @Test
    public void test08529() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08529");
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
        java.util.Map<java.lang.String, java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable>> strMap17 = slimTableFactoryTest0.getmap();
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory18 = slimTableFactoryTest0.getslimTableFactory();
        java.util.Map<java.lang.String, java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable>> strMap19 = slimTableFactoryTest0.map;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory20 = null;
        slimTableFactoryTest0.slimTableFactory = slimTableFactory20;
        org.junit.Assert.assertNull(slimTableFactory1);
        org.junit.Assert.assertNull(table2);
        org.junit.Assert.assertNull(slimTableFactory7);
        org.junit.Assert.assertNull(slimTableFactory8);
        org.junit.Assert.assertNull(table9);
        org.junit.Assert.assertNull(table10);
        org.junit.Assert.assertNull(strMap11);
        org.junit.Assert.assertNull(slimTableFactory12);
        org.junit.Assert.assertNull(strMap17);
        org.junit.Assert.assertNull(slimTableFactory18);
        org.junit.Assert.assertNull(strMap19);
    }

    @Test
    public void test08530() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08530");
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
        org.junit.Assert.assertNull(strMap15);
    }

    @Test
    public void test08531() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08531");
        fitnesse.testsystems.slim.tables.SlimTableFactoryTest slimTableFactoryTest0 = new fitnesse.testsystems.slim.tables.SlimTableFactoryTest();
        fitnesse.testsystems.slim.Table table1 = slimTableFactoryTest0.table;
        java.util.Map<java.lang.String, java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable>> strMap2 = slimTableFactoryTest0.getmap();
        java.util.Map<java.lang.String, java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable>> strMap3 = slimTableFactoryTest0.getmap();
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory4 = slimTableFactoryTest0.slimTableFactory;
        fitnesse.testsystems.slim.Table table5 = null;
        slimTableFactoryTest0.settable(table5);
        java.util.Map<java.lang.String, java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable>> strMap7 = slimTableFactoryTest0.map;
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
    }

    @Test
    public void test08532() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08532");
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
        fitnesse.testsystems.slim.Table table11 = slimTableFactoryTest0.gettable();
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
        org.junit.Assert.assertNull(slimTableFactory5);
        org.junit.Assert.assertNull(slimTableFactory6);
        org.junit.Assert.assertNull(slimTableFactory7);
        org.junit.Assert.assertNull(table10);
        org.junit.Assert.assertNull(table11);
        org.junit.Assert.assertNull(slimTableFactory12);
    }

    @Test
    public void test08533() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08533");
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
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory11 = slimTableFactoryTest0.getslimTableFactory();
        fitnesse.testsystems.slim.Table table12 = null;
        slimTableFactoryTest0.table = table12;
        org.junit.Assert.assertNull(slimTableFactory7);
        org.junit.Assert.assertNull(strMap8);
        org.junit.Assert.assertNull(slimTableFactory11);
    }

    @Test
    public void test08534() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08534");
        fitnesse.testsystems.slim.tables.SlimTableFactoryTest slimTableFactoryTest0 = new fitnesse.testsystems.slim.tables.SlimTableFactoryTest();
        fitnesse.testsystems.slim.Table table1 = null;
        slimTableFactoryTest0.table = table1;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory3 = slimTableFactoryTest0.slimTableFactory;
        java.util.Map<java.lang.String, java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable>> strMap4 = slimTableFactoryTest0.getmap();
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory5 = slimTableFactoryTest0.slimTableFactory;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory6 = slimTableFactoryTest0.getslimTableFactory();
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory7 = null;
        slimTableFactoryTest0.setslimTableFactory(slimTableFactory7);
        fitnesse.testsystems.slim.Table table9 = slimTableFactoryTest0.table;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory10 = null;
        slimTableFactoryTest0.setslimTableFactory(slimTableFactory10);
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory12 = slimTableFactoryTest0.slimTableFactory;
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
        org.junit.Assert.assertNull(table9);
        org.junit.Assert.assertNull(slimTableFactory12);
    }

    @Test
    public void test08535() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08535");
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
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory17 = slimTableFactoryTest0.getslimTableFactory();
        java.util.Map<java.lang.String, java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable>> strMap18 = slimTableFactoryTest0.getmap();
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory19 = slimTableFactoryTest0.getslimTableFactory();
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory20 = slimTableFactoryTest0.slimTableFactory;
        org.junit.Assert.assertNull(strMap5);
        org.junit.Assert.assertNull(strMap6);
        org.junit.Assert.assertNull(slimTableFactory7);
        org.junit.Assert.assertNull(strMap8);
        org.junit.Assert.assertNull(slimTableFactory9);
        org.junit.Assert.assertNull(table12);
        org.junit.Assert.assertNull(strMap15);
        org.junit.Assert.assertNull(slimTableFactory16);
        org.junit.Assert.assertNull(slimTableFactory17);
        org.junit.Assert.assertNull(strMap18);
        org.junit.Assert.assertNull(slimTableFactory19);
        org.junit.Assert.assertNull(slimTableFactory20);
    }

    @Test
    public void test08536() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08536");
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
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory15 = slimTableFactoryTest0.getslimTableFactory();
        java.util.Map<java.lang.String, java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable>> strMap16 = slimTableFactoryTest0.map;
        org.junit.Assert.assertNull(slimTableFactory3);
        org.junit.Assert.assertNull(strMap4);
        org.junit.Assert.assertNull(slimTableFactory15);
        org.junit.Assert.assertNull(strMap16);
    }

    @Test
    public void test08537() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08537");
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
        fitnesse.testsystems.slim.Table table10 = slimTableFactoryTest0.gettable();
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory11 = null;
        slimTableFactoryTest0.setslimTableFactory(slimTableFactory11);
        fitnesse.testsystems.slim.Table table13 = null;
        slimTableFactoryTest0.settable(table13);
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
        org.junit.Assert.assertNull(table9);
        org.junit.Assert.assertNull(table10);
    }

    @Test
    public void test08538() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08538");
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
        fitnesse.testsystems.slim.Table table16 = slimTableFactoryTest0.table;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory17 = slimTableFactoryTest0.getslimTableFactory();
        org.junit.Assert.assertNull(table1);
        org.junit.Assert.assertNull(strMap2);
        org.junit.Assert.assertNull(table5);
        org.junit.Assert.assertNull(slimTableFactory8);
        org.junit.Assert.assertNull(strMap13);
        org.junit.Assert.assertNull(table16);
        org.junit.Assert.assertNull(slimTableFactory17);
    }

    @Test
    public void test08539() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08539");
        fitnesse.testsystems.slim.tables.SlimTableFactoryTest slimTableFactoryTest0 = new fitnesse.testsystems.slim.tables.SlimTableFactoryTest();
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory1 = slimTableFactoryTest0.slimTableFactory;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory2 = slimTableFactoryTest0.slimTableFactory;
        fitnesse.testsystems.slim.Table table3 = slimTableFactoryTest0.gettable();
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory4 = slimTableFactoryTest0.getslimTableFactory();
        fitnesse.testsystems.slim.Table table5 = null;
        slimTableFactoryTest0.table = table5;
        java.util.Map<java.lang.String, java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable>> strMap7 = slimTableFactoryTest0.getmap();
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory8 = null;
        slimTableFactoryTest0.slimTableFactory = slimTableFactory8;
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
        org.junit.Assert.assertNull(slimTableFactory2);
        org.junit.Assert.assertNull(table3);
        org.junit.Assert.assertNull(slimTableFactory4);
        org.junit.Assert.assertNull(strMap7);
        org.junit.Assert.assertNull(table10);
        org.junit.Assert.assertNull(strMap11);
    }

    @Test
    public void test08540() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08540");
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
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory14 = slimTableFactoryTest0.getslimTableFactory();
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory15 = null;
        slimTableFactoryTest0.setslimTableFactory(slimTableFactory15);
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory17 = null;
        slimTableFactoryTest0.setslimTableFactory(slimTableFactory17);
        fitnesse.testsystems.slim.Table table19 = null;
        slimTableFactoryTest0.settable(table19);
        fitnesse.testsystems.slim.Table table21 = null;
        slimTableFactoryTest0.settable(table21);
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
        org.junit.Assert.assertNull(slimTableFactory11);
        org.junit.Assert.assertNull(slimTableFactory14);
    }

    @Test
    public void test08541() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08541");
        fitnesse.testsystems.slim.tables.SlimTableFactoryTest slimTableFactoryTest0 = new fitnesse.testsystems.slim.tables.SlimTableFactoryTest();
        fitnesse.testsystems.slim.Table table1 = null;
        slimTableFactoryTest0.table = table1;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory3 = null;
        slimTableFactoryTest0.slimTableFactory = slimTableFactory3;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory5 = slimTableFactoryTest0.getslimTableFactory();
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory6 = slimTableFactoryTest0.slimTableFactory;
        java.util.Map<java.lang.String, java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable>> strMap7 = slimTableFactoryTest0.getmap();
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory8 = null;
        slimTableFactoryTest0.slimTableFactory = slimTableFactory8;
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
    }

    @Test
    public void test08542() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08542");
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
        fitnesse.testsystems.slim.Table table12 = null;
        slimTableFactoryTest0.settable(table12);
        java.util.Map<java.lang.String, java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable>> strMap14 = slimTableFactoryTest0.map;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory15 = slimTableFactoryTest0.getslimTableFactory();
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory16 = null;
        slimTableFactoryTest0.slimTableFactory = slimTableFactory16;
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
        org.junit.Assert.assertNull(strMap14);
        org.junit.Assert.assertNull(slimTableFactory15);
    }

    @Test
    public void test08543() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08543");
        fitnesse.testsystems.slim.tables.SlimTableFactoryTest slimTableFactoryTest0 = new fitnesse.testsystems.slim.tables.SlimTableFactoryTest();
        fitnesse.testsystems.slim.Table table1 = null;
        slimTableFactoryTest0.table = table1;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory3 = null;
        slimTableFactoryTest0.slimTableFactory = slimTableFactory3;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory5 = slimTableFactoryTest0.getslimTableFactory();
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory6 = null;
        slimTableFactoryTest0.setslimTableFactory(slimTableFactory6);
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory8 = slimTableFactoryTest0.getslimTableFactory();
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory9 = slimTableFactoryTest0.getslimTableFactory();
        java.util.Map<java.lang.String, java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable>> strMap10 = slimTableFactoryTest0.map;
        // The following exception was thrown during execution in test generation
        try {
            slimTableFactoryTest0.commentTableShouldReturnNull();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(slimTableFactory5);
        org.junit.Assert.assertNull(slimTableFactory8);
        org.junit.Assert.assertNull(slimTableFactory9);
        org.junit.Assert.assertNull(strMap10);
    }

    @Test
    public void test08544() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08544");
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
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory13 = slimTableFactoryTest0.getslimTableFactory();
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
        org.junit.Assert.assertNull(slimTableFactory13);
    }

    @Test
    public void test08545() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08545");
        fitnesse.testsystems.slim.tables.SlimTableFactoryTest slimTableFactoryTest0 = new fitnesse.testsystems.slim.tables.SlimTableFactoryTest();
        fitnesse.testsystems.slim.Table table1 = null;
        slimTableFactoryTest0.table = table1;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory3 = slimTableFactoryTest0.slimTableFactory;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory4 = slimTableFactoryTest0.slimTableFactory;
        fitnesse.testsystems.slim.Table table5 = null;
        slimTableFactoryTest0.settable(table5);
        java.util.Map<java.lang.String, java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable>> strMap7 = slimTableFactoryTest0.getmap();
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory8 = null;
        slimTableFactoryTest0.slimTableFactory = slimTableFactory8;
        org.junit.Assert.assertNull(slimTableFactory3);
        org.junit.Assert.assertNull(slimTableFactory4);
        org.junit.Assert.assertNull(strMap7);
    }

    @Test
    public void test08546() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08546");
        fitnesse.testsystems.slim.tables.SlimTableFactoryTest slimTableFactoryTest0 = new fitnesse.testsystems.slim.tables.SlimTableFactoryTest();
        fitnesse.testsystems.slim.Table table1 = slimTableFactoryTest0.table;
        java.util.Map<java.lang.String, java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable>> strMap2 = slimTableFactoryTest0.getmap();
        java.util.Map<java.lang.String, java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable>> strMap3 = slimTableFactoryTest0.getmap();
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory4 = slimTableFactoryTest0.slimTableFactory;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory5 = slimTableFactoryTest0.getslimTableFactory();
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory6 = null;
        slimTableFactoryTest0.setslimTableFactory(slimTableFactory6);
        fitnesse.testsystems.slim.Table table8 = null;
        slimTableFactoryTest0.settable(table8);
        java.lang.Class<?> wildcardClass10 = slimTableFactoryTest0.getClass();
        org.junit.Assert.assertNull(table1);
        org.junit.Assert.assertNull(strMap2);
        org.junit.Assert.assertNull(strMap3);
        org.junit.Assert.assertNull(slimTableFactory4);
        org.junit.Assert.assertNull(slimTableFactory5);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test08547() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08547");
        fitnesse.testsystems.slim.tables.SlimTableFactoryTest slimTableFactoryTest0 = new fitnesse.testsystems.slim.tables.SlimTableFactoryTest();
        fitnesse.testsystems.slim.Table table1 = null;
        slimTableFactoryTest0.table = table1;
        fitnesse.testsystems.slim.Table table3 = null;
        slimTableFactoryTest0.settable(table3);
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
        org.junit.Assert.assertNull(strMap5);
        org.junit.Assert.assertNull(slimTableFactory6);
    }

    @Test
    public void test08548() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08548");
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
        // The following exception was thrown during execution in test generation
        try {
            slimTableFactoryTest0.commentTableShouldReturnNull();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(strMap5);
        org.junit.Assert.assertNull(strMap8);
        org.junit.Assert.assertNull(strMap9);
    }

    @Test
    public void test08549() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08549");
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
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory12 = slimTableFactoryTest0.slimTableFactory;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory13 = slimTableFactoryTest0.slimTableFactory;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory14 = slimTableFactoryTest0.getslimTableFactory();
        fitnesse.testsystems.slim.Table table15 = null;
        slimTableFactoryTest0.settable(table15);
        org.junit.Assert.assertNull(slimTableFactory1);
        org.junit.Assert.assertNull(slimTableFactory2);
        org.junit.Assert.assertNull(table3);
        org.junit.Assert.assertNull(table4);
        org.junit.Assert.assertNull(table5);
        org.junit.Assert.assertNull(slimTableFactory6);
        org.junit.Assert.assertNull(strMap11);
        org.junit.Assert.assertNull(slimTableFactory12);
        org.junit.Assert.assertNull(slimTableFactory13);
        org.junit.Assert.assertNull(slimTableFactory14);
    }

    @Test
    public void test08550() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08550");
        fitnesse.testsystems.slim.tables.SlimTableFactoryTest slimTableFactoryTest0 = new fitnesse.testsystems.slim.tables.SlimTableFactoryTest();
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory1 = slimTableFactoryTest0.slimTableFactory;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory2 = slimTableFactoryTest0.slimTableFactory;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory3 = slimTableFactoryTest0.slimTableFactory;
        fitnesse.testsystems.slim.Table table4 = null;
        slimTableFactoryTest0.table = table4;
        fitnesse.testsystems.slim.Table table6 = null;
        slimTableFactoryTest0.settable(table6);
        fitnesse.testsystems.slim.Table table8 = slimTableFactoryTest0.gettable();
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory9 = null;
        slimTableFactoryTest0.slimTableFactory = slimTableFactory9;
        fitnesse.testsystems.slim.Table table11 = slimTableFactoryTest0.table;
        java.lang.Class<?> wildcardClass12 = slimTableFactoryTest0.getClass();
        org.junit.Assert.assertNull(slimTableFactory1);
        org.junit.Assert.assertNull(slimTableFactory2);
        org.junit.Assert.assertNull(slimTableFactory3);
        org.junit.Assert.assertNull(table8);
        org.junit.Assert.assertNull(table11);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test08551() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08551");
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
        org.junit.Assert.assertNull(strMap3);
        org.junit.Assert.assertNull(slimTableFactory8);
        org.junit.Assert.assertNull(table9);
        org.junit.Assert.assertNull(strMap10);
    }

    @Test
    public void test08552() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08552");
        fitnesse.testsystems.slim.tables.SlimTableFactoryTest slimTableFactoryTest0 = new fitnesse.testsystems.slim.tables.SlimTableFactoryTest();
        fitnesse.testsystems.slim.Table table1 = slimTableFactoryTest0.table;
        java.util.Map<java.lang.String, java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable>> strMap2 = slimTableFactoryTest0.getmap();
        java.util.Map<java.lang.String, java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable>> strMap3 = slimTableFactoryTest0.getmap();
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory4 = slimTableFactoryTest0.slimTableFactory;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory5 = slimTableFactoryTest0.getslimTableFactory();
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory6 = null;
        slimTableFactoryTest0.setslimTableFactory(slimTableFactory6);
        fitnesse.testsystems.slim.Table table8 = slimTableFactoryTest0.gettable();
        fitnesse.testsystems.slim.Table table9 = slimTableFactoryTest0.table;
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
        org.junit.Assert.assertNull(strMap2);
        org.junit.Assert.assertNull(strMap3);
        org.junit.Assert.assertNull(slimTableFactory4);
        org.junit.Assert.assertNull(slimTableFactory5);
        org.junit.Assert.assertNull(table8);
        org.junit.Assert.assertNull(table9);
    }

    @Test
    public void test08553() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08553");
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
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory10 = null;
        slimTableFactoryTest0.setslimTableFactory(slimTableFactory10);
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory12 = slimTableFactoryTest0.slimTableFactory;
        org.junit.Assert.assertNull(slimTableFactory1);
        org.junit.Assert.assertNull(slimTableFactory2);
        org.junit.Assert.assertNull(slimTableFactory3);
        org.junit.Assert.assertNull(slimTableFactory12);
    }

    @Test
    public void test08554() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08554");
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
        fitnesse.testsystems.slim.Table table18 = slimTableFactoryTest0.table;
        fitnesse.testsystems.slim.Table table19 = null;
        slimTableFactoryTest0.table = table19;
        fitnesse.testsystems.slim.Table table21 = slimTableFactoryTest0.gettable();
        java.util.Map<java.lang.String, java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable>> strMap22 = slimTableFactoryTest0.getmap();
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
        org.junit.Assert.assertNull(slimTableFactory8);
        org.junit.Assert.assertNull(strMap13);
        org.junit.Assert.assertNull(table18);
        org.junit.Assert.assertNull(table21);
        org.junit.Assert.assertNull(strMap22);
    }

    @Test
    public void test08555() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08555");
        fitnesse.testsystems.slim.tables.SlimTableFactoryTest slimTableFactoryTest0 = new fitnesse.testsystems.slim.tables.SlimTableFactoryTest();
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory1 = slimTableFactoryTest0.slimTableFactory;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory2 = slimTableFactoryTest0.slimTableFactory;
        fitnesse.testsystems.slim.Table table3 = slimTableFactoryTest0.gettable();
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory4 = slimTableFactoryTest0.getslimTableFactory();
        fitnesse.testsystems.slim.Table table5 = null;
        slimTableFactoryTest0.table = table5;
        java.util.Map<java.lang.String, java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable>> strMap7 = slimTableFactoryTest0.getmap();
        fitnesse.testsystems.slim.Table table8 = slimTableFactoryTest0.table;
        fitnesse.testsystems.slim.Table table9 = null;
        slimTableFactoryTest0.settable(table9);
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory11 = slimTableFactoryTest0.getslimTableFactory();
        java.util.Map<java.lang.String, java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable>> strMap12 = slimTableFactoryTest0.map;
        java.util.Map<java.lang.String, java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable>> strMap13 = slimTableFactoryTest0.map;
        org.junit.Assert.assertNull(slimTableFactory1);
        org.junit.Assert.assertNull(slimTableFactory2);
        org.junit.Assert.assertNull(table3);
        org.junit.Assert.assertNull(slimTableFactory4);
        org.junit.Assert.assertNull(strMap7);
        org.junit.Assert.assertNull(table8);
        org.junit.Assert.assertNull(slimTableFactory11);
        org.junit.Assert.assertNull(strMap12);
        org.junit.Assert.assertNull(strMap13);
    }

    @Test
    public void test08556() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08556");
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
        java.util.Map<java.lang.String, java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable>> strMap14 = slimTableFactoryTest0.getmap();
        fitnesse.testsystems.slim.Table table15 = slimTableFactoryTest0.gettable();
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory16 = null;
        slimTableFactoryTest0.slimTableFactory = slimTableFactory16;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory18 = slimTableFactoryTest0.slimTableFactory;
        // The following exception was thrown during execution in test generation
        try {
            slimTableFactoryTest0.shouldCreateCorrectSlimTableForTablesType();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(slimTableFactory9);
        org.junit.Assert.assertNull(strMap14);
        org.junit.Assert.assertNull(table15);
        org.junit.Assert.assertNull(slimTableFactory18);
    }

    @Test
    public void test08557() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08557");
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
        java.util.Map<java.lang.String, java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable>> strMap14 = slimTableFactoryTest0.map;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory15 = null;
        slimTableFactoryTest0.slimTableFactory = slimTableFactory15;
        org.junit.Assert.assertNull(slimTableFactory3);
        org.junit.Assert.assertNull(strMap4);
        org.junit.Assert.assertNull(slimTableFactory5);
        org.junit.Assert.assertNull(strMap14);
    }

    @Test
    public void test08558() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08558");
        fitnesse.testsystems.slim.tables.SlimTableFactoryTest slimTableFactoryTest0 = new fitnesse.testsystems.slim.tables.SlimTableFactoryTest();
        fitnesse.testsystems.slim.Table table1 = null;
        slimTableFactoryTest0.table = table1;
        fitnesse.testsystems.slim.Table table3 = null;
        slimTableFactoryTest0.settable(table3);
        fitnesse.testsystems.slim.Table table5 = slimTableFactoryTest0.table;
        java.util.Map<java.lang.String, java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable>> strMap6 = slimTableFactoryTest0.map;
        fitnesse.testsystems.slim.Table table7 = null;
        slimTableFactoryTest0.table = table7;
        fitnesse.testsystems.slim.Table table9 = slimTableFactoryTest0.gettable();
        org.junit.Assert.assertNull(table5);
        org.junit.Assert.assertNull(strMap6);
        org.junit.Assert.assertNull(table9);
    }

    @Test
    public void test08559() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08559");
        fitnesse.testsystems.slim.tables.SlimTableFactoryTest slimTableFactoryTest0 = new fitnesse.testsystems.slim.tables.SlimTableFactoryTest();
        fitnesse.testsystems.slim.Table table1 = null;
        slimTableFactoryTest0.table = table1;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory3 = slimTableFactoryTest0.slimTableFactory;
        fitnesse.testsystems.slim.Table table4 = slimTableFactoryTest0.table;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory5 = null;
        slimTableFactoryTest0.slimTableFactory = slimTableFactory5;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory7 = slimTableFactoryTest0.getslimTableFactory();
        org.junit.Assert.assertNull(slimTableFactory3);
        org.junit.Assert.assertNull(table4);
        org.junit.Assert.assertNull(slimTableFactory7);
    }

    @Test
    public void test08560() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08560");
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
        slimTableFactoryTest0.setslimTableFactory(slimTableFactory15);
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory17 = slimTableFactoryTest0.getslimTableFactory();
        org.junit.Assert.assertNull(slimTableFactory3);
        org.junit.Assert.assertNull(strMap4);
        org.junit.Assert.assertNull(strMap9);
        org.junit.Assert.assertNull(slimTableFactory14);
        org.junit.Assert.assertNull(slimTableFactory17);
    }

    @Test
    public void test08561() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08561");
        fitnesse.testsystems.slim.tables.SlimTableFactoryTest slimTableFactoryTest0 = new fitnesse.testsystems.slim.tables.SlimTableFactoryTest();
        fitnesse.testsystems.slim.Table table1 = null;
        slimTableFactoryTest0.table = table1;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory3 = slimTableFactoryTest0.slimTableFactory;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory4 = null;
        slimTableFactoryTest0.slimTableFactory = slimTableFactory4;
        fitnesse.testsystems.slim.Table table6 = null;
        slimTableFactoryTest0.settable(table6);
        fitnesse.testsystems.slim.Table table8 = null;
        slimTableFactoryTest0.table = table8;
        fitnesse.testsystems.slim.Table table10 = slimTableFactoryTest0.table;
        java.util.Map<java.lang.String, java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable>> strMap11 = slimTableFactoryTest0.map;
        // The following exception was thrown during execution in test generation
        try {
            slimTableFactoryTest0.addTableTypeImport("", "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(slimTableFactory3);
        org.junit.Assert.assertNull(table10);
        org.junit.Assert.assertNull(strMap11);
    }

    @Test
    public void test08562() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08562");
        fitnesse.testsystems.slim.tables.SlimTableFactoryTest slimTableFactoryTest0 = new fitnesse.testsystems.slim.tables.SlimTableFactoryTest();
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory1 = slimTableFactoryTest0.slimTableFactory;
        fitnesse.testsystems.slim.Table table2 = slimTableFactoryTest0.gettable();
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory3 = null;
        slimTableFactoryTest0.slimTableFactory = slimTableFactory3;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory5 = null;
        slimTableFactoryTest0.slimTableFactory = slimTableFactory5;
        fitnesse.testsystems.slim.Table table7 = slimTableFactoryTest0.gettable();
        fitnesse.testsystems.slim.Table table8 = slimTableFactoryTest0.table;
        fitnesse.testsystems.slim.Table table9 = null;
        slimTableFactoryTest0.table = table9;
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
        org.junit.Assert.assertNull(table8);
    }

    @Test
    public void test08563() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08563");
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
        fitnesse.testsystems.slim.Table table18 = null;
        slimTableFactoryTest0.table = table18;
        java.util.Map<java.lang.String, java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable>> strMap20 = slimTableFactoryTest0.getmap();
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory21 = null;
        slimTableFactoryTest0.setslimTableFactory(slimTableFactory21);
        org.junit.Assert.assertNull(slimTableFactory3);
        org.junit.Assert.assertNull(strMap4);
        org.junit.Assert.assertNull(table13);
        org.junit.Assert.assertNull(slimTableFactory14);
        org.junit.Assert.assertNull(slimTableFactory17);
        org.junit.Assert.assertNull(strMap20);
    }

    @Test
    public void test08564() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08564");
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
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory11 = null;
        slimTableFactoryTest0.slimTableFactory = slimTableFactory11;
        fitnesse.testsystems.slim.Table table13 = slimTableFactoryTest0.gettable();
        fitnesse.testsystems.slim.Table table14 = null;
        slimTableFactoryTest0.settable(table14);
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
        org.junit.Assert.assertNull(slimTableFactory10);
        org.junit.Assert.assertNull(table13);
    }

    @Test
    public void test08565() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08565");
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
            slimTableFactoryTest0.checkTableTypeDefineUsedForTable();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(slimTableFactory1);
        org.junit.Assert.assertNull(table2);
    }

    @Test
    public void test08566() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08566");
        fitnesse.testsystems.slim.tables.SlimTableFactoryTest slimTableFactoryTest0 = new fitnesse.testsystems.slim.tables.SlimTableFactoryTest();
        fitnesse.testsystems.slim.Table table1 = slimTableFactoryTest0.table;
        java.util.Map<java.lang.String, java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable>> strMap2 = slimTableFactoryTest0.getmap();
        fitnesse.testsystems.slim.Table table3 = null;
        slimTableFactoryTest0.table = table3;
        java.util.Map<java.lang.String, java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable>> strMap5 = slimTableFactoryTest0.getmap();
        java.util.Map<java.lang.String, java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable>> strMap6 = slimTableFactoryTest0.getmap();
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory7 = null;
        slimTableFactoryTest0.slimTableFactory = slimTableFactory7;
        fitnesse.testsystems.slim.Table table9 = slimTableFactoryTest0.table;
        fitnesse.testsystems.slim.Table table10 = null;
        slimTableFactoryTest0.settable(table10);
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
        org.junit.Assert.assertNull(strMap6);
        org.junit.Assert.assertNull(table9);
    }

    @Test
    public void test08567() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08567");
        fitnesse.testsystems.slim.tables.SlimTableFactoryTest slimTableFactoryTest0 = new fitnesse.testsystems.slim.tables.SlimTableFactoryTest();
        fitnesse.testsystems.slim.Table table1 = slimTableFactoryTest0.table;
        java.util.Map<java.lang.String, java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable>> strMap2 = slimTableFactoryTest0.getmap();
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory3 = slimTableFactoryTest0.slimTableFactory;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory4 = slimTableFactoryTest0.getslimTableFactory();
        java.util.Map<java.lang.String, java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable>> strMap5 = slimTableFactoryTest0.getmap();
        fitnesse.testsystems.slim.Table table6 = null;
        slimTableFactoryTest0.table = table6;
        fitnesse.testsystems.slim.Table table8 = slimTableFactoryTest0.gettable();
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory9 = slimTableFactoryTest0.getslimTableFactory();
        fitnesse.testsystems.slim.Table table10 = slimTableFactoryTest0.gettable();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass11 = table10.getClass();
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
        org.junit.Assert.assertNull(slimTableFactory9);
        org.junit.Assert.assertNull(table10);
    }

    @Test
    public void test08568() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08568");
        fitnesse.testsystems.slim.tables.SlimTableFactoryTest slimTableFactoryTest0 = new fitnesse.testsystems.slim.tables.SlimTableFactoryTest();
        fitnesse.testsystems.slim.Table table1 = null;
        slimTableFactoryTest0.table = table1;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory3 = slimTableFactoryTest0.slimTableFactory;
        java.util.Map<java.lang.String, java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable>> strMap4 = slimTableFactoryTest0.map;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory5 = null;
        slimTableFactoryTest0.setslimTableFactory(slimTableFactory5);
        java.util.Map<java.lang.String, java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable>> strMap7 = slimTableFactoryTest0.map;
        fitnesse.testsystems.slim.Table table8 = slimTableFactoryTest0.table;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory9 = null;
        slimTableFactoryTest0.slimTableFactory = slimTableFactory9;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory11 = null;
        slimTableFactoryTest0.setslimTableFactory(slimTableFactory11);
        fitnesse.testsystems.slim.Table table13 = null;
        slimTableFactoryTest0.table = table13;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory15 = slimTableFactoryTest0.getslimTableFactory();
        // The following exception was thrown during execution in test generation
        try {
            slimTableFactoryTest0.checkTableTypeDefineUsedForTable();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(slimTableFactory3);
        org.junit.Assert.assertNull(strMap4);
        org.junit.Assert.assertNull(strMap7);
        org.junit.Assert.assertNull(table8);
        org.junit.Assert.assertNull(slimTableFactory15);
    }

    @Test
    public void test08569() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08569");
        fitnesse.testsystems.slim.tables.SlimTableFactoryTest slimTableFactoryTest0 = new fitnesse.testsystems.slim.tables.SlimTableFactoryTest();
        fitnesse.testsystems.slim.Table table1 = slimTableFactoryTest0.table;
        java.util.Map<java.lang.String, java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable>> strMap2 = slimTableFactoryTest0.getmap();
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory3 = slimTableFactoryTest0.slimTableFactory;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory4 = null;
        slimTableFactoryTest0.setslimTableFactory(slimTableFactory4);
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
    }

    @Test
    public void test08570() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08570");
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
        java.util.Map<java.lang.String, java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable>> strMap13 = slimTableFactoryTest0.map;
        fitnesse.testsystems.slim.Table table14 = slimTableFactoryTest0.gettable();
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory15 = null;
        slimTableFactoryTest0.slimTableFactory = slimTableFactory15;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory17 = slimTableFactoryTest0.slimTableFactory;
        org.junit.Assert.assertNull(table7);
        org.junit.Assert.assertNull(strMap10);
        org.junit.Assert.assertNull(slimTableFactory11);
        org.junit.Assert.assertNull(table12);
        org.junit.Assert.assertNull(strMap13);
        org.junit.Assert.assertNull(table14);
        org.junit.Assert.assertNull(slimTableFactory17);
    }

    @Test
    public void test08571() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08571");
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
        fitnesse.testsystems.slim.Table table11 = null;
        slimTableFactoryTest0.table = table11;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory13 = slimTableFactoryTest0.slimTableFactory;
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
        org.junit.Assert.assertNull(slimTableFactory6);
        org.junit.Assert.assertNull(slimTableFactory7);
        org.junit.Assert.assertNull(table10);
        org.junit.Assert.assertNull(slimTableFactory13);
    }

    @Test
    public void test08572() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08572");
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
        java.lang.Class<?> wildcardClass14 = slimTableFactoryTest0.getClass();
        org.junit.Assert.assertNull(slimTableFactory3);
        org.junit.Assert.assertNull(strMap4);
        org.junit.Assert.assertNull(slimTableFactory5);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test08573() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08573");
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
        fitnesse.testsystems.slim.Table table17 = null;
        slimTableFactoryTest0.settable(table17);
        fitnesse.testsystems.slim.Table table19 = null;
        slimTableFactoryTest0.table = table19;
        java.lang.Class<?> wildcardClass21 = slimTableFactoryTest0.getClass();
        org.junit.Assert.assertNull(slimTableFactory1);
        org.junit.Assert.assertNull(table2);
        org.junit.Assert.assertNull(slimTableFactory7);
        org.junit.Assert.assertNull(slimTableFactory8);
        org.junit.Assert.assertNull(table9);
        org.junit.Assert.assertNull(strMap10);
        org.junit.Assert.assertNull(strMap15);
        org.junit.Assert.assertNull(table16);
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test08574() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08574");
        fitnesse.testsystems.slim.tables.SlimTableFactoryTest slimTableFactoryTest0 = new fitnesse.testsystems.slim.tables.SlimTableFactoryTest();
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory1 = slimTableFactoryTest0.slimTableFactory;
        fitnesse.testsystems.slim.Table table2 = slimTableFactoryTest0.table;
        java.util.Map<java.lang.String, java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable>> strMap3 = slimTableFactoryTest0.map;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory4 = null;
        slimTableFactoryTest0.slimTableFactory = slimTableFactory4;
        fitnesse.testsystems.slim.Table table6 = null;
        slimTableFactoryTest0.table = table6;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory8 = slimTableFactoryTest0.getslimTableFactory();
        java.lang.Class<?> wildcardClass9 = slimTableFactoryTest0.getClass();
        org.junit.Assert.assertNull(slimTableFactory1);
        org.junit.Assert.assertNull(table2);
        org.junit.Assert.assertNull(strMap3);
        org.junit.Assert.assertNull(slimTableFactory8);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test08575() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08575");
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
        // The following exception was thrown during execution in test generation
        try {
            slimTableFactoryTest0.addTableTypeImport("hi!", "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(slimTableFactory3);
        org.junit.Assert.assertNull(strMap4);
        org.junit.Assert.assertNull(strMap17);
    }

    @Test
    public void test08576() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08576");
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
        java.util.Map<java.lang.String, java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable>> strMap20 = slimTableFactoryTest0.map;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory21 = slimTableFactoryTest0.getslimTableFactory();
        org.junit.Assert.assertNull(slimTableFactory3);
        org.junit.Assert.assertNull(strMap4);
        org.junit.Assert.assertNull(table17);
        org.junit.Assert.assertNull(strMap20);
        org.junit.Assert.assertNull(slimTableFactory21);
    }

    @Test
    public void test08577() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08577");
        fitnesse.testsystems.slim.tables.SlimTableFactoryTest slimTableFactoryTest0 = new fitnesse.testsystems.slim.tables.SlimTableFactoryTest();
        fitnesse.testsystems.slim.Table table1 = null;
        slimTableFactoryTest0.table = table1;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory3 = slimTableFactoryTest0.slimTableFactory;
        fitnesse.testsystems.slim.Table table4 = null;
        slimTableFactoryTest0.table = table4;
        java.util.Map<java.lang.String, java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable>> strMap6 = slimTableFactoryTest0.map;
        fitnesse.testsystems.slim.Table table7 = slimTableFactoryTest0.table;
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
    public void test08578() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08578");
        fitnesse.testsystems.slim.tables.SlimTableFactoryTest slimTableFactoryTest0 = new fitnesse.testsystems.slim.tables.SlimTableFactoryTest();
        fitnesse.testsystems.slim.Table table1 = null;
        slimTableFactoryTest0.table = table1;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory3 = slimTableFactoryTest0.getslimTableFactory();
        fitnesse.testsystems.slim.Table table4 = slimTableFactoryTest0.gettable();
        java.util.Map<java.lang.String, java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable>> strMap5 = slimTableFactoryTest0.getmap();
        fitnesse.testsystems.slim.Table table6 = slimTableFactoryTest0.table;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory7 = slimTableFactoryTest0.slimTableFactory;
        fitnesse.testsystems.slim.Table table8 = slimTableFactoryTest0.table;
        java.util.Map<java.lang.String, java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable>> strMap9 = slimTableFactoryTest0.map;
        // The following exception was thrown during execution in test generation
        try {
            slimTableFactoryTest0.addTableTypeImport("", "hi!");
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
        org.junit.Assert.assertNull(strMap9);
    }

    @Test
    public void test08579() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08579");
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
        java.util.Map<java.lang.String, java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable>> strMap12 = slimTableFactoryTest0.map;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory13 = null;
        slimTableFactoryTest0.slimTableFactory = slimTableFactory13;
        org.junit.Assert.assertNull(slimTableFactory5);
        org.junit.Assert.assertNull(slimTableFactory6);
        org.junit.Assert.assertNull(table11);
        org.junit.Assert.assertNull(strMap12);
    }

    @Test
    public void test08580() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08580");
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
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory10 = slimTableFactoryTest0.slimTableFactory;
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
        org.junit.Assert.assertNull(slimTableFactory10);
    }

    @Test
    public void test08581() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08581");
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
        fitnesse.testsystems.slim.Table table14 = null;
        slimTableFactoryTest0.settable(table14);
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory16 = null;
        slimTableFactoryTest0.slimTableFactory = slimTableFactory16;
        // The following exception was thrown during execution in test generation
        try {
            slimTableFactoryTest0.addTableTypeImport("", "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(slimTableFactory5);
        org.junit.Assert.assertNull(table10);
        org.junit.Assert.assertNull(table11);
    }

    @Test
    public void test08582() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08582");
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
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory11 = slimTableFactoryTest0.slimTableFactory;
        fitnesse.testsystems.slim.Table table12 = slimTableFactoryTest0.table;
        java.util.Map<java.lang.String, java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable>> strMap13 = slimTableFactoryTest0.getmap();
        fitnesse.testsystems.slim.Table table14 = slimTableFactoryTest0.table;
        fitnesse.testsystems.slim.Table table15 = null;
        slimTableFactoryTest0.settable(table15);
        org.junit.Assert.assertNull(strMap5);
        org.junit.Assert.assertNull(strMap6);
        org.junit.Assert.assertNull(slimTableFactory7);
        org.junit.Assert.assertNull(strMap8);
        org.junit.Assert.assertNull(slimTableFactory11);
        org.junit.Assert.assertNull(table12);
        org.junit.Assert.assertNull(strMap13);
        org.junit.Assert.assertNull(table14);
    }

    @Test
    public void test08583() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08583");
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
        java.util.Map<java.lang.String, java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable>> strMap10 = slimTableFactoryTest0.getmap();
        java.lang.Class<?> wildcardClass11 = slimTableFactoryTest0.getClass();
        org.junit.Assert.assertNull(table1);
        org.junit.Assert.assertNull(strMap2);
        org.junit.Assert.assertNull(strMap3);
        org.junit.Assert.assertNull(slimTableFactory4);
        org.junit.Assert.assertNull(table7);
        org.junit.Assert.assertNull(strMap8);
        org.junit.Assert.assertNull(strMap9);
        org.junit.Assert.assertNull(strMap10);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test08584() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08584");
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
        java.util.Map<java.lang.String, java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable>> strMap16 = slimTableFactoryTest0.map;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory17 = slimTableFactoryTest0.slimTableFactory;
        fitnesse.testsystems.slim.Table table18 = slimTableFactoryTest0.table;
        fitnesse.testsystems.slim.Table table19 = null;
        slimTableFactoryTest0.settable(table19);
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
        org.junit.Assert.assertNull(strMap16);
        org.junit.Assert.assertNull(slimTableFactory17);
        org.junit.Assert.assertNull(table18);
    }

    @Test
    public void test08585() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08585");
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
        // The following exception was thrown during execution in test generation
        try {
            slimTableFactoryTest0.addTableTypeImport("", "hi!");
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
    public void test08586() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08586");
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
        java.util.Map<java.lang.String, java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable>> strMap14 = slimTableFactoryTest0.map;
        java.util.Map<java.lang.String, java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable>> strMap15 = slimTableFactoryTest0.getmap();
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
        org.junit.Assert.assertNull(strMap14);
        org.junit.Assert.assertNull(strMap15);
    }

    @Test
    public void test08587() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08587");
        fitnesse.testsystems.slim.tables.SlimTableFactoryTest slimTableFactoryTest0 = new fitnesse.testsystems.slim.tables.SlimTableFactoryTest();
        fitnesse.testsystems.slim.Table table1 = null;
        slimTableFactoryTest0.table = table1;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory3 = slimTableFactoryTest0.slimTableFactory;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory4 = null;
        slimTableFactoryTest0.setslimTableFactory(slimTableFactory4);
        fitnesse.testsystems.slim.Table table6 = null;
        slimTableFactoryTest0.table = table6;
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
    public void test08588() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08588");
        fitnesse.testsystems.slim.tables.SlimTableFactoryTest slimTableFactoryTest0 = new fitnesse.testsystems.slim.tables.SlimTableFactoryTest();
        fitnesse.testsystems.slim.Table table1 = null;
        slimTableFactoryTest0.table = table1;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory3 = slimTableFactoryTest0.slimTableFactory;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory4 = null;
        slimTableFactoryTest0.slimTableFactory = slimTableFactory4;
        fitnesse.testsystems.slim.Table table6 = null;
        slimTableFactoryTest0.settable(table6);
        fitnesse.testsystems.slim.Table table8 = null;
        slimTableFactoryTest0.table = table8;
        fitnesse.testsystems.slim.Table table10 = null;
        slimTableFactoryTest0.table = table10;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory12 = null;
        slimTableFactoryTest0.setslimTableFactory(slimTableFactory12);
        java.lang.Class<?> wildcardClass14 = slimTableFactoryTest0.getClass();
        org.junit.Assert.assertNull(slimTableFactory3);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test08589() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08589");
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
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory12 = slimTableFactoryTest0.getslimTableFactory();
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
        org.junit.Assert.assertNull(slimTableFactory8);
        org.junit.Assert.assertNull(table11);
        org.junit.Assert.assertNull(slimTableFactory12);
    }

    @Test
    public void test08590() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08590");
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
        fitnesse.testsystems.slim.Table table10 = slimTableFactoryTest0.table;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory11 = null;
        slimTableFactoryTest0.setslimTableFactory(slimTableFactory11);
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
        org.junit.Assert.assertNull(table10);
    }

    @Test
    public void test08591() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08591");
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
            slimTableFactoryTest0.shouldCreateCorrectSlimTableForTablesType();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(slimTableFactory3);
        org.junit.Assert.assertNull(strMap4);
        org.junit.Assert.assertNull(table11);
    }

    @Test
    public void test08592() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08592");
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
            slimTableFactoryTest0.addTableTypeImport("hi!", "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(slimTableFactory3);
        org.junit.Assert.assertNull(slimTableFactory4);
    }

    @Test
    public void test08593() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08593");
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
    public void test08594() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08594");
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
        org.junit.Assert.assertNull(slimTableFactory5);
        org.junit.Assert.assertNull(strMap6);
        org.junit.Assert.assertNull(strMap9);
        org.junit.Assert.assertNull(strMap10);
    }

    @Test
    public void test08595() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08595");
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
        fitnesse.testsystems.slim.Table table17 = slimTableFactoryTest0.table;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory18 = slimTableFactoryTest0.getslimTableFactory();
        fitnesse.testsystems.slim.Table table19 = null;
        slimTableFactoryTest0.settable(table19);
        org.junit.Assert.assertNull(slimTableFactory1);
        org.junit.Assert.assertNull(table2);
        org.junit.Assert.assertNull(strMap3);
        org.junit.Assert.assertNull(strMap8);
        org.junit.Assert.assertNull(table9);
        org.junit.Assert.assertNull(slimTableFactory12);
        org.junit.Assert.assertNull(table17);
        org.junit.Assert.assertNull(slimTableFactory18);
    }

    @Test
    public void test08596() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08596");
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
        fitnesse.testsystems.slim.Table table16 = slimTableFactoryTest0.table;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory17 = slimTableFactoryTest0.slimTableFactory;
        fitnesse.testsystems.slim.Table table18 = null;
        slimTableFactoryTest0.settable(table18);
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
        org.junit.Assert.assertNull(slimTableFactory15);
        org.junit.Assert.assertNull(table16);
        org.junit.Assert.assertNull(slimTableFactory17);
    }

    @Test
    public void test08597() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08597");
        fitnesse.testsystems.slim.tables.SlimTableFactoryTest slimTableFactoryTest0 = new fitnesse.testsystems.slim.tables.SlimTableFactoryTest();
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory1 = slimTableFactoryTest0.slimTableFactory;
        fitnesse.testsystems.slim.Table table2 = slimTableFactoryTest0.gettable();
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory3 = null;
        slimTableFactoryTest0.slimTableFactory = slimTableFactory3;
        fitnesse.testsystems.slim.Table table5 = null;
        slimTableFactoryTest0.settable(table5);
        java.util.Map<java.lang.String, java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable>> strMap7 = slimTableFactoryTest0.getmap();
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory8 = slimTableFactoryTest0.slimTableFactory;
        fitnesse.testsystems.slim.Table table9 = null;
        slimTableFactoryTest0.table = table9;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory11 = slimTableFactoryTest0.slimTableFactory;
        java.util.Map<java.lang.String, java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable>> strMap12 = slimTableFactoryTest0.getmap();
        java.util.Map<java.lang.String, java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable>> strMap13 = slimTableFactoryTest0.getmap();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass14 = strMap13.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(slimTableFactory1);
        org.junit.Assert.assertNull(table2);
        org.junit.Assert.assertNull(strMap7);
        org.junit.Assert.assertNull(slimTableFactory8);
        org.junit.Assert.assertNull(slimTableFactory11);
        org.junit.Assert.assertNull(strMap12);
        org.junit.Assert.assertNull(strMap13);
    }

    @Test
    public void test08598() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08598");
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
        fitnesse.testsystems.slim.Table table19 = slimTableFactoryTest0.gettable();
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory20 = slimTableFactoryTest0.getslimTableFactory();
        org.junit.Assert.assertNull(strMap5);
        org.junit.Assert.assertNull(slimTableFactory12);
        org.junit.Assert.assertNull(table17);
        org.junit.Assert.assertNull(table18);
        org.junit.Assert.assertNull(table19);
        org.junit.Assert.assertNull(slimTableFactory20);
    }

    @Test
    public void test08599() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08599");
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
        fitnesse.testsystems.slim.Table table15 = null;
        slimTableFactoryTest0.settable(table15);
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory17 = slimTableFactoryTest0.slimTableFactory;
        // The following exception was thrown during execution in test generation
        try {
            slimTableFactoryTest0.tableTypeStartingWithcommentColonShouldReturnNull();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(slimTableFactory5);
        org.junit.Assert.assertNull(strMap10);
        org.junit.Assert.assertNull(slimTableFactory11);
        org.junit.Assert.assertNull(table12);
        org.junit.Assert.assertNull(slimTableFactory17);
    }

    @Test
    public void test08600() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08600");
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
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory17 = null;
        slimTableFactoryTest0.setslimTableFactory(slimTableFactory17);
        fitnesse.testsystems.slim.Table table19 = slimTableFactoryTest0.table;
        // The following exception was thrown during execution in test generation
        try {
            slimTableFactoryTest0.addTableTypeImport("hi!", "hi!");
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
        org.junit.Assert.assertNull(table19);
    }

    @Test
    public void test08601() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08601");
        fitnesse.testsystems.slim.tables.SlimTableFactoryTest slimTableFactoryTest0 = new fitnesse.testsystems.slim.tables.SlimTableFactoryTest();
        fitnesse.testsystems.slim.Table table1 = null;
        slimTableFactoryTest0.table = table1;
        fitnesse.testsystems.slim.Table table3 = null;
        slimTableFactoryTest0.settable(table3);
        java.util.Map<java.lang.String, java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable>> strMap5 = slimTableFactoryTest0.map;
        fitnesse.testsystems.slim.Table table6 = null;
        slimTableFactoryTest0.settable(table6);
        java.util.Map<java.lang.String, java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable>> strMap8 = slimTableFactoryTest0.getmap();
        java.util.Map<java.lang.String, java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable>> strMap9 = slimTableFactoryTest0.getmap();
        fitnesse.testsystems.slim.Table table10 = slimTableFactoryTest0.gettable();
        // The following exception was thrown during execution in test generation
        try {
            slimTableFactoryTest0.addTableTypeImport("hi!", "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(strMap5);
        org.junit.Assert.assertNull(strMap8);
        org.junit.Assert.assertNull(strMap9);
        org.junit.Assert.assertNull(table10);
    }

    @Test
    public void test08602() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08602");
        fitnesse.testsystems.slim.tables.SlimTableFactoryTest slimTableFactoryTest0 = new fitnesse.testsystems.slim.tables.SlimTableFactoryTest();
        fitnesse.testsystems.slim.Table table1 = slimTableFactoryTest0.table;
        java.util.Map<java.lang.String, java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable>> strMap2 = slimTableFactoryTest0.getmap();
        java.util.Map<java.lang.String, java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable>> strMap3 = slimTableFactoryTest0.getmap();
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory4 = slimTableFactoryTest0.slimTableFactory;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory5 = slimTableFactoryTest0.getslimTableFactory();
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory6 = slimTableFactoryTest0.slimTableFactory;
        fitnesse.testsystems.slim.Table table7 = slimTableFactoryTest0.gettable();
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
        org.junit.Assert.assertNull(slimTableFactory5);
        org.junit.Assert.assertNull(slimTableFactory6);
        org.junit.Assert.assertNull(table7);
    }

    @Test
    public void test08603() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08603");
        fitnesse.testsystems.slim.tables.SlimTableFactoryTest slimTableFactoryTest0 = new fitnesse.testsystems.slim.tables.SlimTableFactoryTest();
        fitnesse.testsystems.slim.Table table1 = null;
        slimTableFactoryTest0.table = table1;
        fitnesse.testsystems.slim.Table table3 = null;
        slimTableFactoryTest0.settable(table3);
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory5 = slimTableFactoryTest0.slimTableFactory;
        fitnesse.testsystems.slim.Table table6 = null;
        slimTableFactoryTest0.settable(table6);
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory8 = null;
        slimTableFactoryTest0.setslimTableFactory(slimTableFactory8);
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
    public void test08604() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08604");
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
        // The following exception was thrown during execution in test generation
        try {
            slimTableFactoryTest0.addTableTypeImport("hi!", "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(slimTableFactory1);
        org.junit.Assert.assertNull(table2);
        org.junit.Assert.assertNull(table9);
    }

    @Test
    public void test08605() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08605");
        fitnesse.testsystems.slim.tables.SlimTableFactoryTest slimTableFactoryTest0 = new fitnesse.testsystems.slim.tables.SlimTableFactoryTest();
        fitnesse.testsystems.slim.Table table1 = null;
        slimTableFactoryTest0.table = table1;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory3 = slimTableFactoryTest0.slimTableFactory;
        java.util.Map<java.lang.String, java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable>> strMap4 = slimTableFactoryTest0.getmap();
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory5 = slimTableFactoryTest0.slimTableFactory;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory6 = slimTableFactoryTest0.getslimTableFactory();
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory7 = null;
        slimTableFactoryTest0.setslimTableFactory(slimTableFactory7);
        fitnesse.testsystems.slim.Table table9 = slimTableFactoryTest0.table;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory10 = null;
        slimTableFactoryTest0.setslimTableFactory(slimTableFactory10);
        java.util.Map<java.lang.String, java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable>> strMap12 = slimTableFactoryTest0.getmap();
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory13 = null;
        slimTableFactoryTest0.slimTableFactory = slimTableFactory13;
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
        org.junit.Assert.assertNull(table9);
        org.junit.Assert.assertNull(strMap12);
    }

    @Test
    public void test08606() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08606");
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
        java.lang.Class<?> wildcardClass17 = slimTableFactoryTest0.getClass();
        org.junit.Assert.assertNull(slimTableFactory5);
        org.junit.Assert.assertNull(slimTableFactory6);
        org.junit.Assert.assertNull(slimTableFactory11);
        org.junit.Assert.assertNull(table16);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test08607() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08607");
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
        fitnesse.testsystems.slim.Table table13 = null;
        slimTableFactoryTest0.settable(table13);
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory15 = null;
        slimTableFactoryTest0.slimTableFactory = slimTableFactory15;
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
        org.junit.Assert.assertNull(strMap9);
        org.junit.Assert.assertNull(table10);
    }

    @Test
    public void test08608() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08608");
        fitnesse.testsystems.slim.tables.SlimTableFactoryTest slimTableFactoryTest0 = new fitnesse.testsystems.slim.tables.SlimTableFactoryTest();
        fitnesse.testsystems.slim.Table table1 = null;
        slimTableFactoryTest0.table = table1;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory3 = slimTableFactoryTest0.getslimTableFactory();
        fitnesse.testsystems.slim.Table table4 = slimTableFactoryTest0.gettable();
        fitnesse.testsystems.slim.Table table5 = slimTableFactoryTest0.table;
        fitnesse.testsystems.slim.Table table6 = slimTableFactoryTest0.table;
        // The following exception was thrown during execution in test generation
        try {
            slimTableFactoryTest0.tableTypeStartingWithcommentColonShouldReturnNull();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(slimTableFactory3);
        org.junit.Assert.assertNull(table4);
        org.junit.Assert.assertNull(table5);
        org.junit.Assert.assertNull(table6);
    }

    @Test
    public void test08609() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08609");
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
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory15 = slimTableFactoryTest0.getslimTableFactory();
        fitnesse.testsystems.slim.Table table16 = null;
        slimTableFactoryTest0.settable(table16);
        java.lang.Class<?> wildcardClass18 = slimTableFactoryTest0.getClass();
        org.junit.Assert.assertNull(slimTableFactory1);
        org.junit.Assert.assertNull(table2);
        org.junit.Assert.assertNull(slimTableFactory7);
        org.junit.Assert.assertNull(slimTableFactory8);
        org.junit.Assert.assertNull(table9);
        org.junit.Assert.assertNull(table12);
        org.junit.Assert.assertNull(slimTableFactory15);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test08610() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08610");
        fitnesse.testsystems.slim.tables.SlimTableFactoryTest slimTableFactoryTest0 = new fitnesse.testsystems.slim.tables.SlimTableFactoryTest();
        fitnesse.testsystems.slim.Table table1 = null;
        slimTableFactoryTest0.table = table1;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory3 = slimTableFactoryTest0.slimTableFactory;
        java.util.Map<java.lang.String, java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable>> strMap4 = slimTableFactoryTest0.getmap();
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory5 = slimTableFactoryTest0.slimTableFactory;
        java.util.Map<java.lang.String, java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable>> strMap6 = slimTableFactoryTest0.map;
        fitnesse.testsystems.slim.Table table7 = null;
        slimTableFactoryTest0.settable(table7);
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory9 = slimTableFactoryTest0.getslimTableFactory();
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory10 = slimTableFactoryTest0.getslimTableFactory();
        fitnesse.testsystems.slim.Table table11 = null;
        slimTableFactoryTest0.table = table11;
        fitnesse.testsystems.slim.Table table13 = null;
        slimTableFactoryTest0.settable(table13);
        org.junit.Assert.assertNull(slimTableFactory3);
        org.junit.Assert.assertNull(strMap4);
        org.junit.Assert.assertNull(slimTableFactory5);
        org.junit.Assert.assertNull(strMap6);
        org.junit.Assert.assertNull(slimTableFactory9);
        org.junit.Assert.assertNull(slimTableFactory10);
    }

    @Test
    public void test08611() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08611");
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
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory14 = null;
        slimTableFactoryTest0.setslimTableFactory(slimTableFactory14);
        fitnesse.testsystems.slim.Table table16 = slimTableFactoryTest0.gettable();
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory17 = null;
        slimTableFactoryTest0.slimTableFactory = slimTableFactory17;
        org.junit.Assert.assertNull(table7);
        org.junit.Assert.assertNull(table16);
    }

    @Test
    public void test08612() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08612");
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
        slimTableFactoryTest0.settable(table12);
        // The following exception was thrown during execution in test generation
        try {
            slimTableFactoryTest0.checkTableTypeDefinesIgnoredIfDifferentSpecified();
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
    public void test08613() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08613");
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
        org.junit.Assert.assertNull(strMap10);
        org.junit.Assert.assertNull(table11);
        org.junit.Assert.assertNull(table12);
    }

    @Test
    public void test08614() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08614");
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
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory13 = slimTableFactoryTest0.slimTableFactory;
        fitnesse.testsystems.slim.Table table14 = slimTableFactoryTest0.table;
        fitnesse.testsystems.slim.Table table15 = slimTableFactoryTest0.gettable();
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory16 = slimTableFactoryTest0.getslimTableFactory();
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory17 = null;
        slimTableFactoryTest0.slimTableFactory = slimTableFactory17;
        fitnesse.testsystems.slim.Table table19 = slimTableFactoryTest0.table;
        fitnesse.testsystems.slim.Table table20 = slimTableFactoryTest0.table;
        org.junit.Assert.assertNull(slimTableFactory3);
        org.junit.Assert.assertNull(strMap4);
        org.junit.Assert.assertNull(slimTableFactory13);
        org.junit.Assert.assertNull(table14);
        org.junit.Assert.assertNull(table15);
        org.junit.Assert.assertNull(slimTableFactory16);
        org.junit.Assert.assertNull(table19);
        org.junit.Assert.assertNull(table20);
    }

    @Test
    public void test08615() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08615");
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
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory10 = null;
        slimTableFactoryTest0.slimTableFactory = slimTableFactory10;
        fitnesse.testsystems.slim.Table table12 = null;
        slimTableFactoryTest0.settable(table12);
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory14 = slimTableFactoryTest0.getslimTableFactory();
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
        org.junit.Assert.assertNull(strMap8);
        org.junit.Assert.assertNull(slimTableFactory9);
        org.junit.Assert.assertNull(slimTableFactory14);
    }

    @Test
    public void test08616() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08616");
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
        java.util.Map<java.lang.String, java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable>> strMap16 = slimTableFactoryTest0.map;
        fitnesse.testsystems.slim.Table table17 = null;
        slimTableFactoryTest0.table = table17;
        java.util.Map<java.lang.String, java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable>> strMap19 = slimTableFactoryTest0.getmap();
        java.util.Map<java.lang.String, java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable>> strMap20 = slimTableFactoryTest0.getmap();
        org.junit.Assert.assertNull(table7);
        org.junit.Assert.assertNull(strMap10);
        org.junit.Assert.assertNull(table13);
        org.junit.Assert.assertNull(strMap16);
        org.junit.Assert.assertNull(strMap19);
        org.junit.Assert.assertNull(strMap20);
    }

    @Test
    public void test08617() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08617");
        fitnesse.testsystems.slim.tables.SlimTableFactoryTest slimTableFactoryTest0 = new fitnesse.testsystems.slim.tables.SlimTableFactoryTest();
        fitnesse.testsystems.slim.Table table1 = slimTableFactoryTest0.table;
        java.util.Map<java.lang.String, java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable>> strMap2 = slimTableFactoryTest0.getmap();
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory3 = null;
        slimTableFactoryTest0.slimTableFactory = slimTableFactory3;
        fitnesse.testsystems.slim.Table table5 = slimTableFactoryTest0.table;
        java.util.Map<java.lang.String, java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable>> strMap6 = slimTableFactoryTest0.map;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory7 = slimTableFactoryTest0.getslimTableFactory();
        fitnesse.testsystems.slim.Table table8 = null;
        slimTableFactoryTest0.table = table8;
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
        org.junit.Assert.assertNull(strMap6);
        org.junit.Assert.assertNull(slimTableFactory7);
    }

    @Test
    public void test08618() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08618");
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
        fitnesse.testsystems.slim.Table table11 = slimTableFactoryTest0.table;
        // The following exception was thrown during execution in test generation
        try {
            slimTableFactoryTest0.checkTableTypeDefineUsedForTable();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(slimTableFactory5);
        org.junit.Assert.assertNull(table6);
        org.junit.Assert.assertNull(slimTableFactory9);
        org.junit.Assert.assertNull(slimTableFactory10);
        org.junit.Assert.assertNull(table11);
    }

    @Test
    public void test08619() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08619");
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
        fitnesse.testsystems.slim.Table table13 = slimTableFactoryTest0.gettable();
        fitnesse.testsystems.slim.Table table14 = null;
        slimTableFactoryTest0.table = table14;
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
        org.junit.Assert.assertNull(table13);
    }

    @Test
    public void test08620() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08620");
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
        slimTableFactoryTest0.setslimTableFactory(slimTableFactory11);
        fitnesse.testsystems.slim.Table table13 = null;
        slimTableFactoryTest0.settable(table13);
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
    public void test08621() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08621");
        fitnesse.testsystems.slim.tables.SlimTableFactoryTest slimTableFactoryTest0 = new fitnesse.testsystems.slim.tables.SlimTableFactoryTest();
        fitnesse.testsystems.slim.Table table1 = null;
        slimTableFactoryTest0.table = table1;
        fitnesse.testsystems.slim.Table table3 = null;
        slimTableFactoryTest0.settable(table3);
        java.util.Map<java.lang.String, java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable>> strMap5 = slimTableFactoryTest0.map;
        java.util.Map<java.lang.String, java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable>> strMap6 = slimTableFactoryTest0.getmap();
        fitnesse.testsystems.slim.Table table7 = null;
        slimTableFactoryTest0.table = table7;
        fitnesse.testsystems.slim.Table table9 = slimTableFactoryTest0.gettable();
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory10 = slimTableFactoryTest0.getslimTableFactory();
        java.util.Map<java.lang.String, java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable>> strMap11 = slimTableFactoryTest0.getmap();
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory12 = null;
        slimTableFactoryTest0.setslimTableFactory(slimTableFactory12);
        // The following exception was thrown during execution in test generation
        try {
            slimTableFactoryTest0.tableTypeStartingWithcommentColonShouldReturnNull();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(strMap5);
        org.junit.Assert.assertNull(strMap6);
        org.junit.Assert.assertNull(table9);
        org.junit.Assert.assertNull(slimTableFactory10);
        org.junit.Assert.assertNull(strMap11);
    }

    @Test
    public void test08622() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08622");
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
        java.util.Map<java.lang.String, java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable>> strMap10 = slimTableFactoryTest0.map;
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
        org.junit.Assert.assertNull(slimTableFactory8);
        org.junit.Assert.assertNull(slimTableFactory9);
        org.junit.Assert.assertNull(strMap10);
    }

    @Test
    public void test08623() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08623");
        fitnesse.testsystems.slim.tables.SlimTableFactoryTest slimTableFactoryTest0 = new fitnesse.testsystems.slim.tables.SlimTableFactoryTest();
        fitnesse.testsystems.slim.Table table1 = null;
        slimTableFactoryTest0.table = table1;
        fitnesse.testsystems.slim.Table table3 = slimTableFactoryTest0.table;
        fitnesse.testsystems.slim.Table table4 = slimTableFactoryTest0.gettable();
        java.util.Map<java.lang.String, java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable>> strMap5 = slimTableFactoryTest0.getmap();
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory6 = slimTableFactoryTest0.getslimTableFactory();
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory7 = null;
        slimTableFactoryTest0.setslimTableFactory(slimTableFactory7);
        fitnesse.testsystems.slim.Table table9 = slimTableFactoryTest0.table;
        fitnesse.testsystems.slim.Table table10 = slimTableFactoryTest0.table;
        // The following exception was thrown during execution in test generation
        try {
            slimTableFactoryTest0.tableTypeStartingWithcommentColonShouldReturnNull();
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
    }

    @Test
    public void test08624() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08624");
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
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory17 = null;
        slimTableFactoryTest0.slimTableFactory = slimTableFactory17;
        java.util.Map<java.lang.String, java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable>> strMap19 = slimTableFactoryTest0.getmap();
        fitnesse.testsystems.slim.Table table20 = slimTableFactoryTest0.table;
        org.junit.Assert.assertNull(slimTableFactory3);
        org.junit.Assert.assertNull(strMap4);
        org.junit.Assert.assertNull(slimTableFactory9);
        org.junit.Assert.assertNull(table10);
        org.junit.Assert.assertNull(table11);
        org.junit.Assert.assertNull(slimTableFactory12);
        org.junit.Assert.assertNull(strMap19);
        org.junit.Assert.assertNull(table20);
    }

    @Test
    public void test08625() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08625");
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
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory11 = null;
        slimTableFactoryTest0.slimTableFactory = slimTableFactory11;
        java.util.Map<java.lang.String, java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable>> strMap13 = slimTableFactoryTest0.getmap();
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory14 = slimTableFactoryTest0.getslimTableFactory();
        // The following exception was thrown during execution in test generation
        try {
            slimTableFactoryTest0.checkTableTypeDefinesIgnoredIfDifferentSpecified();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(slimTableFactory3);
        org.junit.Assert.assertNull(strMap4);
        org.junit.Assert.assertNull(strMap7);
        org.junit.Assert.assertNull(table8);
        org.junit.Assert.assertNull(strMap13);
        org.junit.Assert.assertNull(slimTableFactory14);
    }

    @Test
    public void test08626() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08626");
        fitnesse.testsystems.slim.tables.SlimTableFactoryTest slimTableFactoryTest0 = new fitnesse.testsystems.slim.tables.SlimTableFactoryTest();
        fitnesse.testsystems.slim.Table table1 = null;
        slimTableFactoryTest0.table = table1;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory3 = null;
        slimTableFactoryTest0.slimTableFactory = slimTableFactory3;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory5 = slimTableFactoryTest0.getslimTableFactory();
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory6 = slimTableFactoryTest0.slimTableFactory;
        fitnesse.testsystems.slim.Table table7 = slimTableFactoryTest0.gettable();
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory8 = null;
        slimTableFactoryTest0.setslimTableFactory(slimTableFactory8);
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
    }

    @Test
    public void test08627() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08627");
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
        java.util.Map<java.lang.String, java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable>> strMap12 = slimTableFactoryTest0.getmap();
        fitnesse.testsystems.slim.Table table13 = null;
        slimTableFactoryTest0.settable(table13);
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
        org.junit.Assert.assertNull(table3);
        org.junit.Assert.assertNull(table4);
        org.junit.Assert.assertNull(strMap5);
        org.junit.Assert.assertNull(strMap6);
        org.junit.Assert.assertNull(table7);
        org.junit.Assert.assertNull(table8);
        org.junit.Assert.assertNull(slimTableFactory9);
        org.junit.Assert.assertNull(slimTableFactory10);
        org.junit.Assert.assertNull(table11);
        org.junit.Assert.assertNull(strMap12);
    }

    @Test
    public void test08628() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08628");
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
        java.util.Map<java.lang.String, java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable>> strMap14 = slimTableFactoryTest0.map;
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
        org.junit.Assert.assertNull(strMap14);
    }

    @Test
    public void test08629() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08629");
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
        fitnesse.testsystems.slim.Table table11 = null;
        slimTableFactoryTest0.table = table11;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory13 = slimTableFactoryTest0.getslimTableFactory();
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
        org.junit.Assert.assertNull(slimTableFactory13);
    }

    @Test
    public void test08630() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08630");
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
        java.util.Map<java.lang.String, java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable>> strMap12 = slimTableFactoryTest0.map;
        // The following exception was thrown during execution in test generation
        try {
            slimTableFactoryTest0.tableTypeStartingWithcommentColonShouldReturnNull();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(table7);
        org.junit.Assert.assertNull(strMap8);
        org.junit.Assert.assertNull(slimTableFactory11);
        org.junit.Assert.assertNull(strMap12);
    }

    @Test
    public void test08631() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08631");
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
        fitnesse.testsystems.slim.Table table15 = null;
        slimTableFactoryTest0.settable(table15);
        // The following exception was thrown during execution in test generation
        try {
            slimTableFactoryTest0.addTableTypeImport("hi!", "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(slimTableFactory9);
        org.junit.Assert.assertNull(slimTableFactory12);
    }

    @Test
    public void test08632() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08632");
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
        java.util.Map<java.lang.String, java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable>> strMap13 = slimTableFactoryTest0.getmap();
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory14 = null;
        slimTableFactoryTest0.setslimTableFactory(slimTableFactory14);
        fitnesse.testsystems.slim.Table table16 = slimTableFactoryTest0.table;
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
        org.junit.Assert.assertNull(slimTableFactory8);
        org.junit.Assert.assertNull(strMap13);
        org.junit.Assert.assertNull(table16);
    }

    @Test
    public void test08633() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08633");
        fitnesse.testsystems.slim.tables.SlimTableFactoryTest slimTableFactoryTest0 = new fitnesse.testsystems.slim.tables.SlimTableFactoryTest();
        fitnesse.testsystems.slim.Table table1 = null;
        slimTableFactoryTest0.table = table1;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory3 = null;
        slimTableFactoryTest0.slimTableFactory = slimTableFactory3;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory5 = slimTableFactoryTest0.getslimTableFactory();
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory6 = slimTableFactoryTest0.slimTableFactory;
        fitnesse.testsystems.slim.Table table7 = slimTableFactoryTest0.table;
        fitnesse.testsystems.slim.Table table8 = slimTableFactoryTest0.table;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass9 = table8.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(slimTableFactory5);
        org.junit.Assert.assertNull(slimTableFactory6);
        org.junit.Assert.assertNull(table7);
        org.junit.Assert.assertNull(table8);
    }

    @Test
    public void test08634() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08634");
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
        fitnesse.testsystems.slim.Table table18 = slimTableFactoryTest0.gettable();
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory19 = slimTableFactoryTest0.slimTableFactory;
        // The following exception was thrown during execution in test generation
        try {
            slimTableFactoryTest0.commentTableShouldReturnNull();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(slimTableFactory3);
        org.junit.Assert.assertNull(slimTableFactory4);
        org.junit.Assert.assertNull(slimTableFactory5);
        org.junit.Assert.assertNull(table10);
        org.junit.Assert.assertNull(table13);
        org.junit.Assert.assertNull(strMap14);
        org.junit.Assert.assertNull(strMap15);
        org.junit.Assert.assertNull(table18);
        org.junit.Assert.assertNull(slimTableFactory19);
    }

    @Test
    public void test08635() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08635");
        fitnesse.testsystems.slim.tables.SlimTableFactoryTest slimTableFactoryTest0 = new fitnesse.testsystems.slim.tables.SlimTableFactoryTest();
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory1 = slimTableFactoryTest0.slimTableFactory;
        fitnesse.testsystems.slim.Table table2 = slimTableFactoryTest0.gettable();
        fitnesse.testsystems.slim.Table table3 = null;
        slimTableFactoryTest0.table = table3;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory5 = null;
        slimTableFactoryTest0.setslimTableFactory(slimTableFactory5);
        fitnesse.testsystems.slim.Table table7 = slimTableFactoryTest0.table;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory8 = slimTableFactoryTest0.getslimTableFactory();
        fitnesse.testsystems.slim.Table table9 = null;
        slimTableFactoryTest0.settable(table9);
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory11 = null;
        slimTableFactoryTest0.setslimTableFactory(slimTableFactory11);
        org.junit.Assert.assertNull(slimTableFactory1);
        org.junit.Assert.assertNull(table2);
        org.junit.Assert.assertNull(table7);
        org.junit.Assert.assertNull(slimTableFactory8);
    }

    @Test
    public void test08636() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08636");
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
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory12 = null;
        slimTableFactoryTest0.setslimTableFactory(slimTableFactory12);
        fitnesse.testsystems.slim.Table table14 = null;
        slimTableFactoryTest0.settable(table14);
        java.lang.Class<?> wildcardClass16 = slimTableFactoryTest0.getClass();
        org.junit.Assert.assertNull(slimTableFactory7);
        org.junit.Assert.assertNull(strMap8);
        org.junit.Assert.assertNull(table9);
        org.junit.Assert.assertNull(strMap10);
        org.junit.Assert.assertNull(table11);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test08637() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08637");
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
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory15 = slimTableFactoryTest0.slimTableFactory;
        fitnesse.testsystems.slim.Table table16 = null;
        slimTableFactoryTest0.settable(table16);
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory18 = slimTableFactoryTest0.slimTableFactory;
        // The following exception was thrown during execution in test generation
        try {
            slimTableFactoryTest0.checkTableTypeDefinesIgnoredIfDifferentSpecified();
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
        org.junit.Assert.assertNull(slimTableFactory15);
        org.junit.Assert.assertNull(slimTableFactory18);
    }

    @Test
    public void test08638() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08638");
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
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory16 = slimTableFactoryTest0.slimTableFactory;
        // The following exception was thrown during execution in test generation
        try {
            slimTableFactoryTest0.checkTableTypeDefinesIgnoredIfDifferentSpecified();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(slimTableFactory7);
        org.junit.Assert.assertNull(slimTableFactory8);
        org.junit.Assert.assertNull(strMap9);
        org.junit.Assert.assertNull(slimTableFactory12);
        org.junit.Assert.assertNull(slimTableFactory13);
        org.junit.Assert.assertNull(slimTableFactory16);
    }

    @Test
    public void test08639() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08639");
        fitnesse.testsystems.slim.tables.SlimTableFactoryTest slimTableFactoryTest0 = new fitnesse.testsystems.slim.tables.SlimTableFactoryTest();
        fitnesse.testsystems.slim.Table table1 = null;
        slimTableFactoryTest0.table = table1;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory3 = slimTableFactoryTest0.slimTableFactory;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory4 = null;
        slimTableFactoryTest0.slimTableFactory = slimTableFactory4;
        java.util.Map<java.lang.String, java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable>> strMap6 = slimTableFactoryTest0.map;
        fitnesse.testsystems.slim.Table table7 = null;
        slimTableFactoryTest0.settable(table7);
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory9 = null;
        slimTableFactoryTest0.slimTableFactory = slimTableFactory9;
        org.junit.Assert.assertNull(slimTableFactory3);
        org.junit.Assert.assertNull(strMap6);
    }

    @Test
    public void test08640() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08640");
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
        fitnesse.testsystems.slim.Table table12 = null;
        slimTableFactoryTest0.settable(table12);
        fitnesse.testsystems.slim.Table table14 = null;
        slimTableFactoryTest0.settable(table14);
        java.util.Map<java.lang.String, java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable>> strMap16 = slimTableFactoryTest0.getmap();
        fitnesse.testsystems.slim.Table table17 = null;
        slimTableFactoryTest0.table = table17;
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
        org.junit.Assert.assertNull(strMap16);
    }

    @Test
    public void test08641() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08641");
        fitnesse.testsystems.slim.tables.SlimTableFactoryTest slimTableFactoryTest0 = new fitnesse.testsystems.slim.tables.SlimTableFactoryTest();
        java.util.Map<java.lang.String, java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable>> strMap1 = slimTableFactoryTest0.getmap();
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory2 = slimTableFactoryTest0.slimTableFactory;
        fitnesse.testsystems.slim.Table table3 = slimTableFactoryTest0.table;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory4 = slimTableFactoryTest0.getslimTableFactory();
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory5 = null;
        slimTableFactoryTest0.slimTableFactory = slimTableFactory5;
        java.util.Map<java.lang.String, java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable>> strMap7 = slimTableFactoryTest0.map;
        fitnesse.testsystems.slim.Table table8 = null;
        slimTableFactoryTest0.table = table8;
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
        org.junit.Assert.assertNull(strMap7);
    }

    @Test
    public void test08642() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08642");
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
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory11 = slimTableFactoryTest0.getslimTableFactory();
        fitnesse.testsystems.slim.Table table12 = null;
        slimTableFactoryTest0.table = table12;
        java.util.Map<java.lang.String, java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable>> strMap14 = slimTableFactoryTest0.map;
        fitnesse.testsystems.slim.Table table15 = slimTableFactoryTest0.gettable();
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory16 = null;
        slimTableFactoryTest0.setslimTableFactory(slimTableFactory16);
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory18 = null;
        slimTableFactoryTest0.slimTableFactory = slimTableFactory18;
        java.util.Map<java.lang.String, java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable>> strMap20 = slimTableFactoryTest0.getmap();
        fitnesse.testsystems.slim.Table table21 = null;
        slimTableFactoryTest0.settable(table21);
        // The following exception was thrown during execution in test generation
        try {
            slimTableFactoryTest0.addTableTypeImport("hi!", "hi!");
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
        org.junit.Assert.assertNull(slimTableFactory11);
        org.junit.Assert.assertNull(strMap14);
        org.junit.Assert.assertNull(table15);
        org.junit.Assert.assertNull(strMap20);
    }

    @Test
    public void test08643() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08643");
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
        org.junit.Assert.assertNull(slimTableFactory3);
        org.junit.Assert.assertNull(strMap4);
        org.junit.Assert.assertNull(table13);
        org.junit.Assert.assertNull(slimTableFactory16);
        org.junit.Assert.assertNull(table17);
    }

    @Test
    public void test08644() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08644");
        fitnesse.testsystems.slim.tables.SlimTableFactoryTest slimTableFactoryTest0 = new fitnesse.testsystems.slim.tables.SlimTableFactoryTest();
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory1 = slimTableFactoryTest0.slimTableFactory;
        fitnesse.testsystems.slim.Table table2 = slimTableFactoryTest0.gettable();
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory3 = null;
        slimTableFactoryTest0.slimTableFactory = slimTableFactory3;
        fitnesse.testsystems.slim.Table table5 = null;
        slimTableFactoryTest0.settable(table5);
        java.util.Map<java.lang.String, java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable>> strMap7 = slimTableFactoryTest0.getmap();
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
        org.junit.Assert.assertNull(strMap7);
        org.junit.Assert.assertNull(slimTableFactory8);
    }

    @Test
    public void test08645() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08645");
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
        fitnesse.testsystems.slim.Table table21 = null;
        slimTableFactoryTest0.table = table21;
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
        org.junit.Assert.assertNull(table14);
        org.junit.Assert.assertNull(slimTableFactory17);
        org.junit.Assert.assertNull(strMap18);
        org.junit.Assert.assertNull(strMap19);
        org.junit.Assert.assertNull(table20);
    }

    @Test
    public void test08646() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08646");
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
        java.util.Map<java.lang.String, java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable>> strMap15 = slimTableFactoryTest0.map;
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
        org.junit.Assert.assertNull(table9);
        org.junit.Assert.assertNull(slimTableFactory12);
        org.junit.Assert.assertNull(strMap15);
    }

    @Test
    public void test08647() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08647");
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
        org.junit.Assert.assertNull(strMap11);
        org.junit.Assert.assertNull(slimTableFactory12);
        org.junit.Assert.assertNull(slimTableFactory13);
        org.junit.Assert.assertNull(table14);
    }

    @Test
    public void test08648() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08648");
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
        java.lang.Class<?> wildcardClass10 = slimTableFactoryTest0.getClass();
        org.junit.Assert.assertNull(slimTableFactory3);
        org.junit.Assert.assertNull(strMap4);
        org.junit.Assert.assertNull(strMap9);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test08649() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08649");
        fitnesse.testsystems.slim.tables.SlimTableFactoryTest slimTableFactoryTest0 = new fitnesse.testsystems.slim.tables.SlimTableFactoryTest();
        fitnesse.testsystems.slim.Table table1 = null;
        slimTableFactoryTest0.table = table1;
        fitnesse.testsystems.slim.Table table3 = slimTableFactoryTest0.table;
        fitnesse.testsystems.slim.Table table4 = slimTableFactoryTest0.gettable();
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory5 = slimTableFactoryTest0.slimTableFactory;
        fitnesse.testsystems.slim.Table table6 = null;
        slimTableFactoryTest0.settable(table6);
        fitnesse.testsystems.slim.Table table8 = slimTableFactoryTest0.gettable();
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
    public void test08650() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08650");
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
        fitnesse.testsystems.slim.Table table17 = null;
        slimTableFactoryTest0.table = table17;
        fitnesse.testsystems.slim.Table table19 = null;
        slimTableFactoryTest0.settable(table19);
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
    }

    @Test
    public void test08651() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08651");
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
        fitnesse.testsystems.slim.Table table10 = slimTableFactoryTest0.gettable();
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
        org.junit.Assert.assertNull(table9);
        org.junit.Assert.assertNull(table10);
        org.junit.Assert.assertNull(strMap11);
    }

    @Test
    public void test08652() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08652");
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
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory17 = slimTableFactoryTest0.slimTableFactory;
        // The following exception was thrown during execution in test generation
        try {
            slimTableFactoryTest0.addTableTypeImport("hi!", "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(slimTableFactory7);
        org.junit.Assert.assertNull(table12);
        org.junit.Assert.assertNull(strMap15);
        org.junit.Assert.assertNull(slimTableFactory16);
        org.junit.Assert.assertNull(slimTableFactory17);
    }

    @Test
    public void test08653() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08653");
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
        java.util.Map<java.lang.String, java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable>> strMap11 = slimTableFactoryTest0.map;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory12 = slimTableFactoryTest0.getslimTableFactory();
        org.junit.Assert.assertNull(slimTableFactory3);
        org.junit.Assert.assertNull(strMap4);
        org.junit.Assert.assertNull(strMap9);
        org.junit.Assert.assertNull(slimTableFactory10);
        org.junit.Assert.assertNull(strMap11);
        org.junit.Assert.assertNull(slimTableFactory12);
    }

    @Test
    public void test08654() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08654");
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
        fitnesse.testsystems.slim.Table table10 = slimTableFactoryTest0.table;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory11 = slimTableFactoryTest0.slimTableFactory;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory12 = null;
        slimTableFactoryTest0.slimTableFactory = slimTableFactory12;
        org.junit.Assert.assertNull(slimTableFactory3);
        org.junit.Assert.assertNull(strMap4);
        org.junit.Assert.assertNull(slimTableFactory5);
        org.junit.Assert.assertNull(slimTableFactory6);
        org.junit.Assert.assertNull(slimTableFactory9);
        org.junit.Assert.assertNull(table10);
        org.junit.Assert.assertNull(slimTableFactory11);
    }

    @Test
    public void test08655() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08655");
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
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory16 = null;
        slimTableFactoryTest0.setslimTableFactory(slimTableFactory16);
        fitnesse.testsystems.slim.Table table18 = slimTableFactoryTest0.gettable();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass19 = table18.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(slimTableFactory1);
        org.junit.Assert.assertNull(table2);
        org.junit.Assert.assertNull(table9);
        org.junit.Assert.assertNull(strMap12);
        org.junit.Assert.assertNull(slimTableFactory15);
        org.junit.Assert.assertNull(table18);
    }

    @Test
    public void test08656() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08656");
        fitnesse.testsystems.slim.tables.SlimTableFactoryTest slimTableFactoryTest0 = new fitnesse.testsystems.slim.tables.SlimTableFactoryTest();
        fitnesse.testsystems.slim.Table table1 = slimTableFactoryTest0.table;
        java.util.Map<java.lang.String, java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable>> strMap2 = slimTableFactoryTest0.getmap();
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory3 = null;
        slimTableFactoryTest0.slimTableFactory = slimTableFactory3;
        fitnesse.testsystems.slim.Table table5 = slimTableFactoryTest0.table;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory6 = null;
        slimTableFactoryTest0.slimTableFactory = slimTableFactory6;
        fitnesse.testsystems.slim.Table table8 = slimTableFactoryTest0.gettable();
        fitnesse.testsystems.slim.Table table9 = null;
        slimTableFactoryTest0.table = table9;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory11 = slimTableFactoryTest0.slimTableFactory;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory12 = null;
        slimTableFactoryTest0.slimTableFactory = slimTableFactory12;
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
        org.junit.Assert.assertNull(slimTableFactory11);
    }

    @Test
    public void test08657() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08657");
        fitnesse.testsystems.slim.tables.SlimTableFactoryTest slimTableFactoryTest0 = new fitnesse.testsystems.slim.tables.SlimTableFactoryTest();
        fitnesse.testsystems.slim.Table table1 = slimTableFactoryTest0.table;
        java.util.Map<java.lang.String, java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable>> strMap2 = slimTableFactoryTest0.getmap();
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory3 = slimTableFactoryTest0.slimTableFactory;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory4 = slimTableFactoryTest0.getslimTableFactory();
        java.util.Map<java.lang.String, java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable>> strMap5 = slimTableFactoryTest0.getmap();
        java.util.Map<java.lang.String, java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable>> strMap6 = slimTableFactoryTest0.getmap();
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory7 = null;
        slimTableFactoryTest0.slimTableFactory = slimTableFactory7;
        fitnesse.testsystems.slim.Table table9 = slimTableFactoryTest0.gettable();
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory10 = slimTableFactoryTest0.slimTableFactory;
        fitnesse.testsystems.slim.Table table11 = null;
        slimTableFactoryTest0.settable(table11);
        org.junit.Assert.assertNull(table1);
        org.junit.Assert.assertNull(strMap2);
        org.junit.Assert.assertNull(slimTableFactory3);
        org.junit.Assert.assertNull(slimTableFactory4);
        org.junit.Assert.assertNull(strMap5);
        org.junit.Assert.assertNull(strMap6);
        org.junit.Assert.assertNull(table9);
        org.junit.Assert.assertNull(slimTableFactory10);
    }

    @Test
    public void test08658() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08658");
        fitnesse.testsystems.slim.tables.SlimTableFactoryTest slimTableFactoryTest0 = new fitnesse.testsystems.slim.tables.SlimTableFactoryTest();
        fitnesse.testsystems.slim.Table table1 = null;
        slimTableFactoryTest0.table = table1;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory3 = slimTableFactoryTest0.slimTableFactory;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory4 = slimTableFactoryTest0.slimTableFactory;
        java.util.Map<java.lang.String, java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable>> strMap5 = slimTableFactoryTest0.map;
        fitnesse.testsystems.slim.Table table6 = slimTableFactoryTest0.table;
        java.util.Map<java.lang.String, java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable>> strMap7 = slimTableFactoryTest0.getmap();
        java.util.Map<java.lang.String, java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable>> strMap8 = slimTableFactoryTest0.getmap();
        // The following exception was thrown during execution in test generation
        try {
            slimTableFactoryTest0.checkTableTypeDefineUsedForTable();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(slimTableFactory3);
        org.junit.Assert.assertNull(slimTableFactory4);
        org.junit.Assert.assertNull(strMap5);
        org.junit.Assert.assertNull(table6);
        org.junit.Assert.assertNull(strMap7);
        org.junit.Assert.assertNull(strMap8);
    }

    @Test
    public void test08659() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08659");
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
        fitnesse.testsystems.slim.Table table11 = null;
        slimTableFactoryTest0.settable(table11);
        fitnesse.testsystems.slim.Table table13 = null;
        slimTableFactoryTest0.settable(table13);
        fitnesse.testsystems.slim.Table table15 = null;
        slimTableFactoryTest0.table = table15;
        java.util.Map<java.lang.String, java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable>> strMap17 = slimTableFactoryTest0.getmap();
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory18 = null;
        slimTableFactoryTest0.setslimTableFactory(slimTableFactory18);
        // The following exception was thrown during execution in test generation
        try {
            slimTableFactoryTest0.addTableTypeImport("", "hi!");
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
        org.junit.Assert.assertNull(strMap17);
    }

    @Test
    public void test08660() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08660");
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
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory10 = slimTableFactoryTest0.slimTableFactory;
        fitnesse.testsystems.slim.Table table11 = null;
        slimTableFactoryTest0.table = table11;
        fitnesse.testsystems.slim.Table table13 = slimTableFactoryTest0.gettable();
        fitnesse.testsystems.slim.Table table14 = slimTableFactoryTest0.table;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass15 = table14.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(strMap5);
        org.junit.Assert.assertNull(strMap6);
        org.junit.Assert.assertNull(slimTableFactory7);
        org.junit.Assert.assertNull(table8);
        org.junit.Assert.assertNull(slimTableFactory9);
        org.junit.Assert.assertNull(slimTableFactory10);
        org.junit.Assert.assertNull(table13);
        org.junit.Assert.assertNull(table14);
    }

    @Test
    public void test08661() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08661");
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
        java.util.Map<java.lang.String, java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable>> strMap13 = slimTableFactoryTest0.map;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory14 = null;
        slimTableFactoryTest0.slimTableFactory = slimTableFactory14;
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
    }

    @Test
    public void test08662() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08662");
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
        java.util.Map<java.lang.String, java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable>> strMap14 = slimTableFactoryTest0.getmap();
        fitnesse.testsystems.slim.Table table15 = slimTableFactoryTest0.gettable();
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory16 = null;
        slimTableFactoryTest0.slimTableFactory = slimTableFactory16;
        java.util.Map<java.lang.String, java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable>> strMap18 = slimTableFactoryTest0.getmap();
        java.util.Map<java.lang.String, java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable>> strMap19 = slimTableFactoryTest0.getmap();
        // The following exception was thrown during execution in test generation
        try {
            slimTableFactoryTest0.shouldCreateCorrectSlimTableForTablesType();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(slimTableFactory9);
        org.junit.Assert.assertNull(strMap14);
        org.junit.Assert.assertNull(table15);
        org.junit.Assert.assertNull(strMap18);
        org.junit.Assert.assertNull(strMap19);
    }

    @Test
    public void test08663() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08663");
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
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory18 = slimTableFactoryTest0.slimTableFactory;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory19 = null;
        slimTableFactoryTest0.setslimTableFactory(slimTableFactory19);
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory21 = slimTableFactoryTest0.slimTableFactory;
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
        org.junit.Assert.assertNull(table17);
        org.junit.Assert.assertNull(slimTableFactory18);
        org.junit.Assert.assertNull(slimTableFactory21);
        org.junit.Assert.assertNull(strMap22);
    }

    @Test
    public void test08664() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08664");
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
        // The following exception was thrown during execution in test generation
        try {
            slimTableFactoryTest0.checkTableTypeDefinesIgnoredIfDifferentSpecified();
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
    public void test08665() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08665");
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
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory12 = slimTableFactoryTest0.getslimTableFactory();
        java.util.Map<java.lang.String, java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable>> strMap13 = slimTableFactoryTest0.map;
        java.util.Map<java.lang.String, java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable>> strMap14 = slimTableFactoryTest0.getmap();
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory15 = slimTableFactoryTest0.getslimTableFactory();
        org.junit.Assert.assertNull(slimTableFactory1);
        org.junit.Assert.assertNull(table2);
        org.junit.Assert.assertNull(slimTableFactory7);
        org.junit.Assert.assertNull(slimTableFactory8);
        org.junit.Assert.assertNull(table9);
        org.junit.Assert.assertNull(slimTableFactory12);
        org.junit.Assert.assertNull(strMap13);
        org.junit.Assert.assertNull(strMap14);
        org.junit.Assert.assertNull(slimTableFactory15);
    }

    @Test
    public void test08666() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08666");
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
        fitnesse.testsystems.slim.Table table11 = slimTableFactoryTest0.gettable();
        fitnesse.testsystems.slim.Table table12 = null;
        slimTableFactoryTest0.table = table12;
        java.util.Map<java.lang.String, java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable>> strMap14 = slimTableFactoryTest0.map;
        // The following exception was thrown during execution in test generation
        try {
            slimTableFactoryTest0.tableTypeStartingWithcommentColonShouldReturnNull();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(strMap5);
        org.junit.Assert.assertNull(strMap6);
        org.junit.Assert.assertNull(table7);
        org.junit.Assert.assertNull(slimTableFactory10);
        org.junit.Assert.assertNull(table11);
        org.junit.Assert.assertNull(strMap14);
    }

    @Test
    public void test08667() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08667");
        fitnesse.testsystems.slim.tables.SlimTableFactoryTest slimTableFactoryTest0 = new fitnesse.testsystems.slim.tables.SlimTableFactoryTest();
        fitnesse.testsystems.slim.Table table1 = slimTableFactoryTest0.table;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory2 = slimTableFactoryTest0.slimTableFactory;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory3 = null;
        slimTableFactoryTest0.setslimTableFactory(slimTableFactory3);
        java.util.Map<java.lang.String, java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable>> strMap5 = slimTableFactoryTest0.map;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory6 = slimTableFactoryTest0.getslimTableFactory();
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory7 = slimTableFactoryTest0.getslimTableFactory();
        fitnesse.testsystems.slim.Table table8 = slimTableFactoryTest0.gettable();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass9 = table8.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(table1);
        org.junit.Assert.assertNull(slimTableFactory2);
        org.junit.Assert.assertNull(strMap5);
        org.junit.Assert.assertNull(slimTableFactory6);
        org.junit.Assert.assertNull(slimTableFactory7);
        org.junit.Assert.assertNull(table8);
    }

    @Test
    public void test08668() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08668");
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
        org.junit.Assert.assertNull(slimTableFactory5);
        org.junit.Assert.assertNull(strMap10);
        org.junit.Assert.assertNull(strMap13);
        org.junit.Assert.assertNull(table16);
    }

    @Test
    public void test08669() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08669");
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
        slimTableFactoryTest0.setslimTableFactory(slimTableFactory13);
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory15 = null;
        slimTableFactoryTest0.setslimTableFactory(slimTableFactory15);
        java.lang.Class<?> wildcardClass17 = slimTableFactoryTest0.getClass();
        org.junit.Assert.assertNull(slimTableFactory1);
        org.junit.Assert.assertNull(table2);
        org.junit.Assert.assertNull(slimTableFactory7);
        org.junit.Assert.assertNull(slimTableFactory8);
        org.junit.Assert.assertNull(table11);
        org.junit.Assert.assertNull(strMap12);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test08670() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08670");
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
        java.lang.Class<?> wildcardClass11 = slimTableFactoryTest0.getClass();
        org.junit.Assert.assertNull(slimTableFactory1);
        org.junit.Assert.assertNull(table2);
        org.junit.Assert.assertNull(table9);
        org.junit.Assert.assertNull(slimTableFactory10);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test08671() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08671");
        fitnesse.testsystems.slim.tables.SlimTableFactoryTest slimTableFactoryTest0 = new fitnesse.testsystems.slim.tables.SlimTableFactoryTest();
        fitnesse.testsystems.slim.Table table1 = null;
        slimTableFactoryTest0.table = table1;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory3 = slimTableFactoryTest0.getslimTableFactory();
        fitnesse.testsystems.slim.Table table4 = slimTableFactoryTest0.gettable();
        java.util.Map<java.lang.String, java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable>> strMap5 = slimTableFactoryTest0.getmap();
        fitnesse.testsystems.slim.Table table6 = slimTableFactoryTest0.table;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory7 = slimTableFactoryTest0.slimTableFactory;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory8 = slimTableFactoryTest0.slimTableFactory;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory9 = slimTableFactoryTest0.getslimTableFactory();
        java.util.Map<java.lang.String, java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable>> strMap10 = slimTableFactoryTest0.getmap();
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
        org.junit.Assert.assertNull(table6);
        org.junit.Assert.assertNull(slimTableFactory7);
        org.junit.Assert.assertNull(slimTableFactory8);
        org.junit.Assert.assertNull(slimTableFactory9);
        org.junit.Assert.assertNull(strMap10);
    }

    @Test
    public void test08672() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08672");
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
    }

    @Test
    public void test08673() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08673");
        fitnesse.testsystems.slim.tables.SlimTableFactoryTest slimTableFactoryTest0 = new fitnesse.testsystems.slim.tables.SlimTableFactoryTest();
        fitnesse.testsystems.slim.Table table1 = null;
        slimTableFactoryTest0.table = table1;
        fitnesse.testsystems.slim.Table table3 = slimTableFactoryTest0.table;
        fitnesse.testsystems.slim.Table table4 = slimTableFactoryTest0.gettable();
        java.util.Map<java.lang.String, java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable>> strMap5 = slimTableFactoryTest0.getmap();
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory6 = slimTableFactoryTest0.slimTableFactory;
        fitnesse.testsystems.slim.Table table7 = slimTableFactoryTest0.table;
        fitnesse.testsystems.slim.Table table8 = null;
        slimTableFactoryTest0.settable(table8);
        fitnesse.testsystems.slim.Table table10 = null;
        slimTableFactoryTest0.settable(table10);
        java.util.Map<java.lang.String, java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable>> strMap12 = slimTableFactoryTest0.map;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory13 = slimTableFactoryTest0.slimTableFactory;
        org.junit.Assert.assertNull(table3);
        org.junit.Assert.assertNull(table4);
        org.junit.Assert.assertNull(strMap5);
        org.junit.Assert.assertNull(slimTableFactory6);
        org.junit.Assert.assertNull(table7);
        org.junit.Assert.assertNull(strMap12);
        org.junit.Assert.assertNull(slimTableFactory13);
    }

    @Test
    public void test08674() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08674");
        fitnesse.testsystems.slim.tables.SlimTableFactoryTest slimTableFactoryTest0 = new fitnesse.testsystems.slim.tables.SlimTableFactoryTest();
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory1 = slimTableFactoryTest0.slimTableFactory;
        fitnesse.testsystems.slim.Table table2 = null;
        slimTableFactoryTest0.settable(table2);
        fitnesse.testsystems.slim.Table table4 = slimTableFactoryTest0.gettable();
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
        org.junit.Assert.assertNull(table4);
    }

    @Test
    public void test08675() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08675");
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
        fitnesse.testsystems.slim.Table table12 = slimTableFactoryTest0.gettable();
        org.junit.Assert.assertNull(slimTableFactory1);
        org.junit.Assert.assertNull(table2);
        org.junit.Assert.assertNull(slimTableFactory7);
        org.junit.Assert.assertNull(slimTableFactory8);
        org.junit.Assert.assertNull(table11);
        org.junit.Assert.assertNull(table12);
    }

    @Test
    public void test08676() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08676");
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
        fitnesse.testsystems.slim.Table table12 = slimTableFactoryTest0.gettable();
        fitnesse.testsystems.slim.Table table13 = slimTableFactoryTest0.table;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory14 = slimTableFactoryTest0.getslimTableFactory();
        fitnesse.testsystems.slim.Table table15 = null;
        slimTableFactoryTest0.table = table15;
        // The following exception was thrown during execution in test generation
        try {
            slimTableFactoryTest0.addTableTypeImport("", "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(slimTableFactory3);
        org.junit.Assert.assertNull(strMap4);
        org.junit.Assert.assertNull(strMap7);
        org.junit.Assert.assertNull(table8);
        org.junit.Assert.assertNull(slimTableFactory11);
        org.junit.Assert.assertNull(table12);
        org.junit.Assert.assertNull(table13);
        org.junit.Assert.assertNull(slimTableFactory14);
    }

    @Test
    public void test08677() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08677");
        fitnesse.testsystems.slim.tables.SlimTableFactoryTest slimTableFactoryTest0 = new fitnesse.testsystems.slim.tables.SlimTableFactoryTest();
        fitnesse.testsystems.slim.Table table1 = null;
        slimTableFactoryTest0.table = table1;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory3 = slimTableFactoryTest0.slimTableFactory;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory4 = null;
        slimTableFactoryTest0.slimTableFactory = slimTableFactory4;
        fitnesse.testsystems.slim.Table table6 = null;
        slimTableFactoryTest0.settable(table6);
        fitnesse.testsystems.slim.Table table8 = null;
        slimTableFactoryTest0.table = table8;
        fitnesse.testsystems.slim.Table table10 = slimTableFactoryTest0.table;
        // The following exception was thrown during execution in test generation
        try {
            slimTableFactoryTest0.shouldCreateCorrectSlimTableForTablesType();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(slimTableFactory3);
        org.junit.Assert.assertNull(table10);
    }

    @Test
    public void test08678() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08678");
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
        fitnesse.testsystems.slim.Table table11 = slimTableFactoryTest0.table;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory12 = null;
        slimTableFactoryTest0.slimTableFactory = slimTableFactory12;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory14 = null;
        slimTableFactoryTest0.slimTableFactory = slimTableFactory14;
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
        org.junit.Assert.assertNull(table11);
    }

    @Test
    public void test08679() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08679");
        fitnesse.testsystems.slim.tables.SlimTableFactoryTest slimTableFactoryTest0 = new fitnesse.testsystems.slim.tables.SlimTableFactoryTest();
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory1 = slimTableFactoryTest0.slimTableFactory;
        fitnesse.testsystems.slim.Table table2 = slimTableFactoryTest0.gettable();
        fitnesse.testsystems.slim.Table table3 = null;
        slimTableFactoryTest0.table = table3;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory5 = null;
        slimTableFactoryTest0.setslimTableFactory(slimTableFactory5);
        fitnesse.testsystems.slim.Table table7 = slimTableFactoryTest0.table;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory8 = slimTableFactoryTest0.getslimTableFactory();
        fitnesse.testsystems.slim.Table table9 = null;
        slimTableFactoryTest0.table = table9;
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
        org.junit.Assert.assertNull(slimTableFactory8);
    }

    @Test
    public void test08680() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08680");
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
        java.util.Map<java.lang.String, java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable>> strMap11 = slimTableFactoryTest0.map;
        fitnesse.testsystems.slim.Table table12 = slimTableFactoryTest0.gettable();
        fitnesse.testsystems.slim.Table table13 = null;
        slimTableFactoryTest0.settable(table13);
        // The following exception was thrown during execution in test generation
        try {
            slimTableFactoryTest0.tableTypeStartingWithcommentColonShouldReturnNull();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(strMap5);
        org.junit.Assert.assertNull(slimTableFactory8);
        org.junit.Assert.assertNull(strMap11);
        org.junit.Assert.assertNull(table12);
    }

    @Test
    public void test08681() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08681");
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
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory11 = null;
        slimTableFactoryTest0.setslimTableFactory(slimTableFactory11);
        fitnesse.testsystems.slim.Table table13 = null;
        slimTableFactoryTest0.settable(table13);
        fitnesse.testsystems.slim.Table table15 = null;
        slimTableFactoryTest0.table = table15;
        org.junit.Assert.assertNull(slimTableFactory1);
        org.junit.Assert.assertNull(table2);
        org.junit.Assert.assertNull(table9);
        org.junit.Assert.assertNull(strMap10);
    }

    @Test
    public void test08682() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08682");
        fitnesse.testsystems.slim.tables.SlimTableFactoryTest slimTableFactoryTest0 = new fitnesse.testsystems.slim.tables.SlimTableFactoryTest();
        fitnesse.testsystems.slim.Table table1 = slimTableFactoryTest0.table;
        java.util.Map<java.lang.String, java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable>> strMap2 = slimTableFactoryTest0.getmap();
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory3 = null;
        slimTableFactoryTest0.slimTableFactory = slimTableFactory3;
        fitnesse.testsystems.slim.Table table5 = slimTableFactoryTest0.gettable();
        java.util.Map<java.lang.String, java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable>> strMap6 = slimTableFactoryTest0.map;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory7 = null;
        slimTableFactoryTest0.slimTableFactory = slimTableFactory7;
        java.lang.Class<?> wildcardClass9 = slimTableFactoryTest0.getClass();
        org.junit.Assert.assertNull(table1);
        org.junit.Assert.assertNull(strMap2);
        org.junit.Assert.assertNull(table5);
        org.junit.Assert.assertNull(strMap6);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test08683() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08683");
        fitnesse.testsystems.slim.tables.SlimTableFactoryTest slimTableFactoryTest0 = new fitnesse.testsystems.slim.tables.SlimTableFactoryTest();
        fitnesse.testsystems.slim.Table table1 = null;
        slimTableFactoryTest0.table = table1;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory3 = slimTableFactoryTest0.slimTableFactory;
        fitnesse.testsystems.slim.Table table4 = null;
        slimTableFactoryTest0.settable(table4);
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory6 = null;
        slimTableFactoryTest0.slimTableFactory = slimTableFactory6;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory8 = slimTableFactoryTest0.slimTableFactory;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory9 = null;
        slimTableFactoryTest0.setslimTableFactory(slimTableFactory9);
        java.util.Map<java.lang.String, java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable>> strMap11 = slimTableFactoryTest0.map;
        // The following exception was thrown during execution in test generation
        try {
            slimTableFactoryTest0.addTableTypeImport("", "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(slimTableFactory3);
        org.junit.Assert.assertNull(slimTableFactory8);
        org.junit.Assert.assertNull(strMap11);
    }

    @Test
    public void test08684() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08684");
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
        fitnesse.testsystems.slim.Table table11 = slimTableFactoryTest0.table;
        fitnesse.testsystems.slim.Table table12 = slimTableFactoryTest0.gettable();
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory13 = slimTableFactoryTest0.slimTableFactory;
        fitnesse.testsystems.slim.Table table14 = null;
        slimTableFactoryTest0.settable(table14);
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory16 = slimTableFactoryTest0.getslimTableFactory();
        fitnesse.testsystems.slim.Table table17 = null;
        slimTableFactoryTest0.settable(table17);
        org.junit.Assert.assertNull(slimTableFactory5);
        org.junit.Assert.assertNull(slimTableFactory6);
        org.junit.Assert.assertNull(table11);
        org.junit.Assert.assertNull(table12);
        org.junit.Assert.assertNull(slimTableFactory13);
        org.junit.Assert.assertNull(slimTableFactory16);
    }

    @Test
    public void test08685() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08685");
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
        fitnesse.testsystems.slim.Table table11 = slimTableFactoryTest0.table;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory12 = null;
        slimTableFactoryTest0.setslimTableFactory(slimTableFactory12);
        java.util.Map<java.lang.String, java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable>> strMap14 = slimTableFactoryTest0.map;
        org.junit.Assert.assertNull(table11);
        org.junit.Assert.assertNull(strMap14);
    }

    @Test
    public void test08686() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08686");
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
        slimTableFactoryTest0.setslimTableFactory(slimTableFactory10);
        fitnesse.testsystems.slim.Table table12 = null;
        slimTableFactoryTest0.settable(table12);
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
        org.junit.Assert.assertNull(table9);
    }

    @Test
    public void test08687() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08687");
        fitnesse.testsystems.slim.tables.SlimTableFactoryTest slimTableFactoryTest0 = new fitnesse.testsystems.slim.tables.SlimTableFactoryTest();
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory1 = slimTableFactoryTest0.slimTableFactory;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory2 = slimTableFactoryTest0.slimTableFactory;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory3 = slimTableFactoryTest0.slimTableFactory;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory4 = null;
        slimTableFactoryTest0.slimTableFactory = slimTableFactory4;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory6 = slimTableFactoryTest0.slimTableFactory;
        java.util.Map<java.lang.String, java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable>> strMap7 = slimTableFactoryTest0.getmap();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass8 = strMap7.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(slimTableFactory1);
        org.junit.Assert.assertNull(slimTableFactory2);
        org.junit.Assert.assertNull(slimTableFactory3);
        org.junit.Assert.assertNull(slimTableFactory6);
        org.junit.Assert.assertNull(strMap7);
    }

    @Test
    public void test08688() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08688");
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
            slimTableFactoryTest0.checkTableTypeDefineUsedForTable();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(slimTableFactory5);
        org.junit.Assert.assertNull(slimTableFactory6);
    }

    @Test
    public void test08689() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08689");
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
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory19 = null;
        slimTableFactoryTest0.setslimTableFactory(slimTableFactory19);
        fitnesse.testsystems.slim.Table table21 = null;
        slimTableFactoryTest0.settable(table21);
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory23 = null;
        slimTableFactoryTest0.setslimTableFactory(slimTableFactory23);
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
    public void test08690() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08690");
        fitnesse.testsystems.slim.tables.SlimTableFactoryTest slimTableFactoryTest0 = new fitnesse.testsystems.slim.tables.SlimTableFactoryTest();
        fitnesse.testsystems.slim.Table table1 = slimTableFactoryTest0.table;
        fitnesse.testsystems.slim.Table table2 = null;
        slimTableFactoryTest0.table = table2;
        fitnesse.testsystems.slim.Table table4 = slimTableFactoryTest0.gettable();
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory5 = null;
        slimTableFactoryTest0.setslimTableFactory(slimTableFactory5);
        fitnesse.testsystems.slim.Table table7 = slimTableFactoryTest0.gettable();
        fitnesse.testsystems.slim.Table table8 = slimTableFactoryTest0.table;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory9 = null;
        slimTableFactoryTest0.slimTableFactory = slimTableFactory9;
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
        org.junit.Assert.assertNull(table8);
    }

    @Test
    public void test08691() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08691");
        fitnesse.testsystems.slim.tables.SlimTableFactoryTest slimTableFactoryTest0 = new fitnesse.testsystems.slim.tables.SlimTableFactoryTest();
        fitnesse.testsystems.slim.Table table1 = null;
        slimTableFactoryTest0.table = table1;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory3 = slimTableFactoryTest0.getslimTableFactory();
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory4 = slimTableFactoryTest0.getslimTableFactory();
        fitnesse.testsystems.slim.Table table5 = null;
        slimTableFactoryTest0.table = table5;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory7 = slimTableFactoryTest0.slimTableFactory;
        java.util.Map<java.lang.String, java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable>> strMap8 = slimTableFactoryTest0.map;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory9 = slimTableFactoryTest0.getslimTableFactory();
        fitnesse.testsystems.slim.Table table10 = null;
        slimTableFactoryTest0.settable(table10);
        fitnesse.testsystems.slim.Table table12 = slimTableFactoryTest0.gettable();
        // The following exception was thrown during execution in test generation
        try {
            slimTableFactoryTest0.addTableTypeImport("hi!", "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(slimTableFactory3);
        org.junit.Assert.assertNull(slimTableFactory4);
        org.junit.Assert.assertNull(slimTableFactory7);
        org.junit.Assert.assertNull(strMap8);
        org.junit.Assert.assertNull(slimTableFactory9);
        org.junit.Assert.assertNull(table12);
    }

    @Test
    public void test08692() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08692");
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
        org.junit.Assert.assertNull(strMap8);
        org.junit.Assert.assertNull(strMap9);
        org.junit.Assert.assertNull(table10);
        org.junit.Assert.assertNull(table13);
        org.junit.Assert.assertNull(table14);
    }

    @Test
    public void test08693() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08693");
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
        java.util.Map<java.lang.String, java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable>> strMap12 = slimTableFactoryTest0.map;
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
        org.junit.Assert.assertNull(strMap9);
        org.junit.Assert.assertNull(strMap12);
    }

    @Test
    public void test08694() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08694");
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
        fitnesse.testsystems.slim.Table table12 = null;
        slimTableFactoryTest0.settable(table12);
        fitnesse.testsystems.slim.Table table14 = slimTableFactoryTest0.gettable();
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
        org.junit.Assert.assertNull(table9);
        org.junit.Assert.assertNull(table10);
        org.junit.Assert.assertNull(strMap11);
        org.junit.Assert.assertNull(table14);
    }

    @Test
    public void test08695() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08695");
        fitnesse.testsystems.slim.tables.SlimTableFactoryTest slimTableFactoryTest0 = new fitnesse.testsystems.slim.tables.SlimTableFactoryTest();
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory1 = slimTableFactoryTest0.slimTableFactory;
        fitnesse.testsystems.slim.Table table2 = slimTableFactoryTest0.gettable();
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory3 = null;
        slimTableFactoryTest0.slimTableFactory = slimTableFactory3;
        fitnesse.testsystems.slim.Table table5 = null;
        slimTableFactoryTest0.settable(table5);
        java.util.Map<java.lang.String, java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable>> strMap7 = slimTableFactoryTest0.getmap();
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory8 = slimTableFactoryTest0.slimTableFactory;
        java.util.Map<java.lang.String, java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable>> strMap9 = slimTableFactoryTest0.map;
        fitnesse.testsystems.slim.Table table10 = null;
        slimTableFactoryTest0.table = table10;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory12 = null;
        slimTableFactoryTest0.slimTableFactory = slimTableFactory12;
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
        org.junit.Assert.assertNull(slimTableFactory1);
        org.junit.Assert.assertNull(table2);
        org.junit.Assert.assertNull(strMap7);
        org.junit.Assert.assertNull(slimTableFactory8);
        org.junit.Assert.assertNull(strMap9);
        org.junit.Assert.assertNull(table16);
    }

    @Test
    public void test08696() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08696");
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
        slimTableFactoryTest0.settable(table15);
        // The following exception was thrown during execution in test generation
        try {
            slimTableFactoryTest0.checkTableTypeDefineUsedForTable();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(strMap5);
        org.junit.Assert.assertNull(slimTableFactory12);
    }

    @Test
    public void test08697() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08697");
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
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory13 = null;
        slimTableFactoryTest0.slimTableFactory = slimTableFactory13;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory15 = null;
        slimTableFactoryTest0.slimTableFactory = slimTableFactory15;
        fitnesse.testsystems.slim.Table table17 = slimTableFactoryTest0.gettable();
        java.util.Map<java.lang.String, java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable>> strMap18 = slimTableFactoryTest0.getmap();
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory19 = slimTableFactoryTest0.slimTableFactory;
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
        org.junit.Assert.assertNull(table17);
        org.junit.Assert.assertNull(strMap18);
        org.junit.Assert.assertNull(slimTableFactory19);
    }

    @Test
    public void test08698() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08698");
        fitnesse.testsystems.slim.tables.SlimTableFactoryTest slimTableFactoryTest0 = new fitnesse.testsystems.slim.tables.SlimTableFactoryTest();
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory1 = slimTableFactoryTest0.slimTableFactory;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory2 = slimTableFactoryTest0.slimTableFactory;
        fitnesse.testsystems.slim.Table table3 = slimTableFactoryTest0.gettable();
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory4 = null;
        slimTableFactoryTest0.slimTableFactory = slimTableFactory4;
        fitnesse.testsystems.slim.Table table6 = null;
        slimTableFactoryTest0.settable(table6);
        java.util.Map<java.lang.String, java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable>> strMap8 = slimTableFactoryTest0.map;
        org.junit.Assert.assertNull(slimTableFactory1);
        org.junit.Assert.assertNull(slimTableFactory2);
        org.junit.Assert.assertNull(table3);
        org.junit.Assert.assertNull(strMap8);
    }

    @Test
    public void test08699() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08699");
        fitnesse.testsystems.slim.tables.SlimTableFactoryTest slimTableFactoryTest0 = new fitnesse.testsystems.slim.tables.SlimTableFactoryTest();
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory1 = slimTableFactoryTest0.slimTableFactory;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory2 = slimTableFactoryTest0.slimTableFactory;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory3 = slimTableFactoryTest0.slimTableFactory;
        java.util.Map<java.lang.String, java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable>> strMap4 = slimTableFactoryTest0.map;
        fitnesse.testsystems.slim.Table table5 = null;
        slimTableFactoryTest0.settable(table5);
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory7 = slimTableFactoryTest0.slimTableFactory;
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
        org.junit.Assert.assertNull(slimTableFactory1);
        org.junit.Assert.assertNull(slimTableFactory2);
        org.junit.Assert.assertNull(slimTableFactory3);
        org.junit.Assert.assertNull(strMap4);
        org.junit.Assert.assertNull(slimTableFactory7);
        org.junit.Assert.assertNull(table8);
    }

    @Test
    public void test08700() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08700");
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
        fitnesse.testsystems.slim.Table table14 = null;
        slimTableFactoryTest0.settable(table14);
        fitnesse.testsystems.slim.Table table16 = null;
        slimTableFactoryTest0.settable(table16);
        fitnesse.testsystems.slim.Table table18 = null;
        slimTableFactoryTest0.settable(table18);
        org.junit.Assert.assertNull(slimTableFactory3);
        org.junit.Assert.assertNull(strMap4);
        org.junit.Assert.assertNull(slimTableFactory11);
    }

    @Test
    public void test08701() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08701");
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
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory11 = null;
        slimTableFactoryTest0.slimTableFactory = slimTableFactory11;
        java.util.Map<java.lang.String, java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable>> strMap13 = slimTableFactoryTest0.map;
        java.util.Map<java.lang.String, java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable>> strMap14 = slimTableFactoryTest0.map;
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
        org.junit.Assert.assertNull(slimTableFactory8);
        org.junit.Assert.assertNull(strMap13);
        org.junit.Assert.assertNull(strMap14);
    }

    @Test
    public void test08702() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08702");
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
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory12 = slimTableFactoryTest0.getslimTableFactory();
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
        org.junit.Assert.assertNull(slimTableFactory12);
    }

    @Test
    public void test08703() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08703");
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
        fitnesse.testsystems.slim.Table table12 = null;
        slimTableFactoryTest0.table = table12;
        fitnesse.testsystems.slim.Table table14 = slimTableFactoryTest0.gettable();
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory15 = null;
        slimTableFactoryTest0.slimTableFactory = slimTableFactory15;
        fitnesse.testsystems.slim.Table table17 = slimTableFactoryTest0.gettable();
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
        org.junit.Assert.assertNull(slimTableFactory10);
        org.junit.Assert.assertNull(slimTableFactory11);
        org.junit.Assert.assertNull(table14);
        org.junit.Assert.assertNull(table17);
    }

    @Test
    public void test08704() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08704");
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
        org.junit.Assert.assertNull(strMap9);
        org.junit.Assert.assertNull(strMap10);
        org.junit.Assert.assertNull(table11);
        org.junit.Assert.assertNull(slimTableFactory12);
        org.junit.Assert.assertNull(strMap13);
        org.junit.Assert.assertNull(slimTableFactory14);
    }

    @Test
    public void test08705() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08705");
        fitnesse.testsystems.slim.tables.SlimTableFactoryTest slimTableFactoryTest0 = new fitnesse.testsystems.slim.tables.SlimTableFactoryTest();
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory1 = slimTableFactoryTest0.slimTableFactory;
        fitnesse.testsystems.slim.Table table2 = slimTableFactoryTest0.table;
        java.util.Map<java.lang.String, java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable>> strMap3 = slimTableFactoryTest0.map;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory4 = null;
        slimTableFactoryTest0.slimTableFactory = slimTableFactory4;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory6 = slimTableFactoryTest0.getslimTableFactory();
        java.util.Map<java.lang.String, java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable>> strMap7 = slimTableFactoryTest0.getmap();
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory8 = null;
        slimTableFactoryTest0.slimTableFactory = slimTableFactory8;
        java.util.Map<java.lang.String, java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable>> strMap10 = slimTableFactoryTest0.map;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory11 = slimTableFactoryTest0.slimTableFactory;
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
        org.junit.Assert.assertNull(slimTableFactory6);
        org.junit.Assert.assertNull(strMap7);
        org.junit.Assert.assertNull(strMap10);
        org.junit.Assert.assertNull(slimTableFactory11);
    }

    @Test
    public void test08706() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08706");
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
        java.util.Map<java.lang.String, java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable>> strMap15 = slimTableFactoryTest0.map;
        fitnesse.testsystems.slim.Table table16 = slimTableFactoryTest0.gettable();
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
        org.junit.Assert.assertNull(strMap15);
        org.junit.Assert.assertNull(table16);
    }

    @Test
    public void test08707() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08707");
        fitnesse.testsystems.slim.tables.SlimTableFactoryTest slimTableFactoryTest0 = new fitnesse.testsystems.slim.tables.SlimTableFactoryTest();
        fitnesse.testsystems.slim.Table table1 = null;
        slimTableFactoryTest0.table = table1;
        fitnesse.testsystems.slim.Table table3 = slimTableFactoryTest0.table;
        fitnesse.testsystems.slim.Table table4 = slimTableFactoryTest0.gettable();
        java.util.Map<java.lang.String, java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable>> strMap5 = slimTableFactoryTest0.getmap();
        java.util.Map<java.lang.String, java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable>> strMap6 = slimTableFactoryTest0.map;
        fitnesse.testsystems.slim.Table table7 = null;
        slimTableFactoryTest0.settable(table7);
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
    }

    @Test
    public void test08708() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08708");
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
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory12 = null;
        slimTableFactoryTest0.setslimTableFactory(slimTableFactory12);
        java.util.Map<java.lang.String, java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable>> strMap14 = slimTableFactoryTest0.map;
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
        org.junit.Assert.assertNull(strMap14);
    }

    @Test
    public void test08709() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08709");
        fitnesse.testsystems.slim.tables.SlimTableFactoryTest slimTableFactoryTest0 = new fitnesse.testsystems.slim.tables.SlimTableFactoryTest();
        fitnesse.testsystems.slim.Table table1 = null;
        slimTableFactoryTest0.table = table1;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory3 = null;
        slimTableFactoryTest0.setslimTableFactory(slimTableFactory3);
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory5 = slimTableFactoryTest0.slimTableFactory;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory6 = null;
        slimTableFactoryTest0.setslimTableFactory(slimTableFactory6);
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory8 = null;
        slimTableFactoryTest0.setslimTableFactory(slimTableFactory8);
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
    public void test08710() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08710");
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
        java.util.Map<java.lang.String, java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable>> strMap13 = slimTableFactoryTest0.map;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory14 = null;
        slimTableFactoryTest0.setslimTableFactory(slimTableFactory14);
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
        org.junit.Assert.assertNull(strMap13);
    }

    @Test
    public void test08711() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08711");
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
        fitnesse.testsystems.slim.Table table12 = slimTableFactoryTest0.table;
        org.junit.Assert.assertNull(slimTableFactory1);
        org.junit.Assert.assertNull(table2);
        org.junit.Assert.assertNull(strMap7);
        org.junit.Assert.assertNull(slimTableFactory8);
        org.junit.Assert.assertNull(strMap11);
        org.junit.Assert.assertNull(table12);
    }

    @Test
    public void test08712() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08712");
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
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory13 = null;
        slimTableFactoryTest0.slimTableFactory = slimTableFactory13;
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
        org.junit.Assert.assertNull(slimTableFactory10);
        org.junit.Assert.assertNull(slimTableFactory11);
        org.junit.Assert.assertNull(strMap12);
    }

    @Test
    public void test08713() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08713");
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
        fitnesse.testsystems.slim.Table table15 = slimTableFactoryTest0.gettable();
        fitnesse.testsystems.slim.Table table16 = null;
        slimTableFactoryTest0.table = table16;
        // The following exception was thrown during execution in test generation
        try {
            slimTableFactoryTest0.checkTableTypeDefinesIgnoredIfDifferentSpecified();
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
        org.junit.Assert.assertNull(table15);
    }

    @Test
    public void test08714() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08714");
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
    public void test08715() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08715");
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
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory10 = slimTableFactoryTest0.slimTableFactory;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory11 = null;
        slimTableFactoryTest0.setslimTableFactory(slimTableFactory11);
        java.util.Map<java.lang.String, java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable>> strMap13 = slimTableFactoryTest0.map;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory14 = null;
        slimTableFactoryTest0.slimTableFactory = slimTableFactory14;
        org.junit.Assert.assertNull(slimTableFactory3);
        org.junit.Assert.assertNull(strMap4);
        org.junit.Assert.assertNull(table7);
        org.junit.Assert.assertNull(slimTableFactory10);
        org.junit.Assert.assertNull(strMap13);
    }

    @Test
    public void test08716() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08716");
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
        java.util.Map<java.lang.String, java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable>> strMap13 = slimTableFactoryTest0.map;
        // The following exception was thrown during execution in test generation
        try {
            slimTableFactoryTest0.shouldCreateCorrectSlimTableForTablesType();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(slimTableFactory7);
        org.junit.Assert.assertNull(slimTableFactory10);
        org.junit.Assert.assertNull(strMap13);
    }

    @Test
    public void test08717() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08717");
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
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory10 = slimTableFactoryTest0.getslimTableFactory();
        // The following exception was thrown during execution in test generation
        try {
            slimTableFactoryTest0.checkTableTypeDefinesIgnoredIfDifferentSpecified();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(slimTableFactory9);
        org.junit.Assert.assertNull(slimTableFactory10);
    }

    @Test
    public void test08718() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08718");
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
        slimTableFactoryTest0.table = table11;
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
        org.junit.Assert.assertNull(strMap10);
        org.junit.Assert.assertNull(table13);
    }

    @Test
    public void test08719() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08719");
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
        org.junit.Assert.assertNull(slimTableFactory7);
        org.junit.Assert.assertNull(slimTableFactory8);
        org.junit.Assert.assertNull(table11);
    }

    @Test
    public void test08720() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08720");
        fitnesse.testsystems.slim.tables.SlimTableFactoryTest slimTableFactoryTest0 = new fitnesse.testsystems.slim.tables.SlimTableFactoryTest();
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory1 = slimTableFactoryTest0.slimTableFactory;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory2 = slimTableFactoryTest0.slimTableFactory;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory3 = null;
        slimTableFactoryTest0.slimTableFactory = slimTableFactory3;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory5 = slimTableFactoryTest0.slimTableFactory;
        java.util.Map<java.lang.String, java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable>> strMap6 = slimTableFactoryTest0.map;
        org.junit.Assert.assertNull(slimTableFactory1);
        org.junit.Assert.assertNull(slimTableFactory2);
        org.junit.Assert.assertNull(slimTableFactory5);
        org.junit.Assert.assertNull(strMap6);
    }

    @Test
    public void test08721() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08721");
        fitnesse.testsystems.slim.tables.SlimTableFactoryTest slimTableFactoryTest0 = new fitnesse.testsystems.slim.tables.SlimTableFactoryTest();
        fitnesse.testsystems.slim.Table table1 = null;
        slimTableFactoryTest0.table = table1;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory3 = null;
        slimTableFactoryTest0.setslimTableFactory(slimTableFactory3);
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory5 = slimTableFactoryTest0.slimTableFactory;
        fitnesse.testsystems.slim.Table table6 = slimTableFactoryTest0.table;
        java.util.Map<java.lang.String, java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable>> strMap7 = slimTableFactoryTest0.map;
        fitnesse.testsystems.slim.Table table8 = slimTableFactoryTest0.gettable();
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory9 = slimTableFactoryTest0.getslimTableFactory();
        org.junit.Assert.assertNull(slimTableFactory5);
        org.junit.Assert.assertNull(table6);
        org.junit.Assert.assertNull(strMap7);
        org.junit.Assert.assertNull(table8);
        org.junit.Assert.assertNull(slimTableFactory9);
    }

    @Test
    public void test08722() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08722");
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
        org.junit.Assert.assertNull(slimTableFactory11);
    }

    @Test
    public void test08723() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08723");
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
        fitnesse.testsystems.slim.Table table11 = null;
        slimTableFactoryTest0.settable(table11);
        fitnesse.testsystems.slim.Table table13 = null;
        slimTableFactoryTest0.table = table13;
        fitnesse.testsystems.slim.Table table15 = null;
        slimTableFactoryTest0.settable(table15);
        fitnesse.testsystems.slim.Table table17 = slimTableFactoryTest0.table;
        java.util.Map<java.lang.String, java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable>> strMap18 = slimTableFactoryTest0.map;
        java.lang.Class<?> wildcardClass19 = slimTableFactoryTest0.getClass();
        org.junit.Assert.assertNull(table1);
        org.junit.Assert.assertNull(strMap2);
        org.junit.Assert.assertNull(table5);
        org.junit.Assert.assertNull(slimTableFactory8);
        org.junit.Assert.assertNull(table17);
        org.junit.Assert.assertNull(strMap18);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test08724() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08724");
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
            slimTableFactoryTest0.checkTableTypeDefineUsedForTable();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(slimTableFactory7);
        org.junit.Assert.assertNull(slimTableFactory8);
    }

    @Test
    public void test08725() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08725");
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
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory13 = null;
        slimTableFactoryTest0.setslimTableFactory(slimTableFactory13);
        fitnesse.testsystems.slim.Table table15 = null;
        slimTableFactoryTest0.table = table15;
        java.util.Map<java.lang.String, java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable>> strMap17 = slimTableFactoryTest0.map;
        java.util.Map<java.lang.String, java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable>> strMap18 = slimTableFactoryTest0.map;
        org.junit.Assert.assertNull(strMap5);
        org.junit.Assert.assertNull(strMap6);
        org.junit.Assert.assertNull(slimTableFactory7);
        org.junit.Assert.assertNull(strMap8);
        org.junit.Assert.assertNull(slimTableFactory9);
        org.junit.Assert.assertNull(table12);
        org.junit.Assert.assertNull(strMap17);
        org.junit.Assert.assertNull(strMap18);
    }

    @Test
    public void test08726() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08726");
        fitnesse.testsystems.slim.tables.SlimTableFactoryTest slimTableFactoryTest0 = new fitnesse.testsystems.slim.tables.SlimTableFactoryTest();
        fitnesse.testsystems.slim.Table table1 = slimTableFactoryTest0.table;
        java.util.Map<java.lang.String, java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable>> strMap2 = slimTableFactoryTest0.getmap();
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory3 = slimTableFactoryTest0.slimTableFactory;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory4 = slimTableFactoryTest0.getslimTableFactory();
        java.util.Map<java.lang.String, java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable>> strMap5 = slimTableFactoryTest0.getmap();
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory6 = null;
        slimTableFactoryTest0.slimTableFactory = slimTableFactory6;
        java.util.Map<java.lang.String, java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable>> strMap8 = slimTableFactoryTest0.map;
        fitnesse.testsystems.slim.Table table9 = null;
        slimTableFactoryTest0.settable(table9);
        fitnesse.testsystems.slim.Table table11 = slimTableFactoryTest0.table;
        java.util.Map<java.lang.String, java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable>> strMap12 = slimTableFactoryTest0.map;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory13 = slimTableFactoryTest0.getslimTableFactory();
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
        org.junit.Assert.assertNull(strMap8);
        org.junit.Assert.assertNull(table11);
        org.junit.Assert.assertNull(strMap12);
        org.junit.Assert.assertNull(slimTableFactory13);
    }

    @Test
    public void test08727() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08727");
        fitnesse.testsystems.slim.tables.SlimTableFactoryTest slimTableFactoryTest0 = new fitnesse.testsystems.slim.tables.SlimTableFactoryTest();
        fitnesse.testsystems.slim.Table table1 = null;
        slimTableFactoryTest0.table = table1;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory3 = null;
        slimTableFactoryTest0.slimTableFactory = slimTableFactory3;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory5 = slimTableFactoryTest0.getslimTableFactory();
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory6 = slimTableFactoryTest0.getslimTableFactory();
        fitnesse.testsystems.slim.Table table7 = null;
        slimTableFactoryTest0.settable(table7);
        java.util.Map<java.lang.String, java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable>> strMap9 = slimTableFactoryTest0.getmap();
        fitnesse.testsystems.slim.Table table10 = slimTableFactoryTest0.gettable();
        // The following exception was thrown during execution in test generation
        try {
            slimTableFactoryTest0.shouldCreateCorrectSlimTableForTablesType();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(slimTableFactory5);
        org.junit.Assert.assertNull(slimTableFactory6);
        org.junit.Assert.assertNull(strMap9);
        org.junit.Assert.assertNull(table10);
    }

    @Test
    public void test08728() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08728");
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
        slimTableFactoryTest0.settable(table11);
        fitnesse.testsystems.slim.Table table13 = slimTableFactoryTest0.table;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory14 = null;
        slimTableFactoryTest0.setslimTableFactory(slimTableFactory14);
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory16 = slimTableFactoryTest0.getslimTableFactory();
        org.junit.Assert.assertNull(slimTableFactory1);
        org.junit.Assert.assertNull(table2);
        org.junit.Assert.assertNull(table13);
        org.junit.Assert.assertNull(slimTableFactory16);
    }

    @Test
    public void test08729() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08729");
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
        java.util.Map<java.lang.String, java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable>> strMap12 = slimTableFactoryTest0.map;
        // The following exception was thrown during execution in test generation
        try {
            slimTableFactoryTest0.checkTableTypeDefineUsedForTable();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(table7);
        org.junit.Assert.assertNull(strMap10);
        org.junit.Assert.assertNull(table11);
        org.junit.Assert.assertNull(strMap12);
    }

    @Test
    public void test08730() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08730");
        fitnesse.testsystems.slim.tables.SlimTableFactoryTest slimTableFactoryTest0 = new fitnesse.testsystems.slim.tables.SlimTableFactoryTest();
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory1 = slimTableFactoryTest0.slimTableFactory;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory2 = slimTableFactoryTest0.slimTableFactory;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory3 = slimTableFactoryTest0.slimTableFactory;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory4 = null;
        slimTableFactoryTest0.slimTableFactory = slimTableFactory4;
        fitnesse.testsystems.slim.Table table6 = null;
        slimTableFactoryTest0.table = table6;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory8 = null;
        slimTableFactoryTest0.slimTableFactory = slimTableFactory8;
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
        org.junit.Assert.assertNull(slimTableFactory2);
        org.junit.Assert.assertNull(slimTableFactory3);
        org.junit.Assert.assertNull(table10);
    }

    @Test
    public void test08731() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08731");
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
        fitnesse.testsystems.slim.Table table10 = null;
        slimTableFactoryTest0.table = table10;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory12 = slimTableFactoryTest0.slimTableFactory;
        // The following exception was thrown during execution in test generation
        try {
            slimTableFactoryTest0.addTableTypeImport("hi!", "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(slimTableFactory7);
        org.junit.Assert.assertNull(strMap8);
        org.junit.Assert.assertNull(slimTableFactory9);
        org.junit.Assert.assertNull(slimTableFactory12);
    }

    @Test
    public void test08732() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08732");
        fitnesse.testsystems.slim.tables.SlimTableFactoryTest slimTableFactoryTest0 = new fitnesse.testsystems.slim.tables.SlimTableFactoryTest();
        fitnesse.testsystems.slim.Table table1 = null;
        slimTableFactoryTest0.table = table1;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory3 = null;
        slimTableFactoryTest0.slimTableFactory = slimTableFactory3;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory5 = slimTableFactoryTest0.getslimTableFactory();
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory6 = slimTableFactoryTest0.getslimTableFactory();
        fitnesse.testsystems.slim.Table table7 = null;
        slimTableFactoryTest0.settable(table7);
        java.util.Map<java.lang.String, java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable>> strMap9 = slimTableFactoryTest0.map;
        // The following exception was thrown during execution in test generation
        try {
            slimTableFactoryTest0.shouldCreateCorrectSlimTableForTablesType();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(slimTableFactory5);
        org.junit.Assert.assertNull(slimTableFactory6);
        org.junit.Assert.assertNull(strMap9);
    }

    @Test
    public void test08733() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08733");
        fitnesse.testsystems.slim.tables.SlimTableFactoryTest slimTableFactoryTest0 = new fitnesse.testsystems.slim.tables.SlimTableFactoryTest();
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory1 = slimTableFactoryTest0.slimTableFactory;
        fitnesse.testsystems.slim.Table table2 = slimTableFactoryTest0.gettable();
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory3 = null;
        slimTableFactoryTest0.slimTableFactory = slimTableFactory3;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory5 = null;
        slimTableFactoryTest0.slimTableFactory = slimTableFactory5;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory7 = slimTableFactoryTest0.slimTableFactory;
        java.util.Map<java.lang.String, java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable>> strMap8 = slimTableFactoryTest0.map;
        fitnesse.testsystems.slim.Table table9 = null;
        slimTableFactoryTest0.settable(table9);
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory11 = slimTableFactoryTest0.getslimTableFactory();
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
        org.junit.Assert.assertNull(slimTableFactory11);
    }

    @Test
    public void test08734() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08734");
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
        fitnesse.testsystems.slim.Table table16 = null;
        slimTableFactoryTest0.settable(table16);
        fitnesse.testsystems.slim.Table table18 = slimTableFactoryTest0.gettable();
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory19 = null;
        slimTableFactoryTest0.slimTableFactory = slimTableFactory19;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory21 = null;
        slimTableFactoryTest0.setslimTableFactory(slimTableFactory21);
        // The following exception was thrown during execution in test generation
        try {
            slimTableFactoryTest0.addTableTypeImport("hi!", "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(table7);
        org.junit.Assert.assertNull(table18);
    }

    @Test
    public void test08735() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08735");
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
        java.util.Map<java.lang.String, java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable>> strMap15 = slimTableFactoryTest0.getmap();
        org.junit.Assert.assertNull(table7);
        org.junit.Assert.assertNull(strMap14);
        org.junit.Assert.assertNull(strMap15);
    }

    @Test
    public void test08736() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08736");
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
        org.junit.Assert.assertNull(strMap3);
        org.junit.Assert.assertNull(table8);
        org.junit.Assert.assertNull(slimTableFactory9);
        org.junit.Assert.assertNull(table10);
    }

    @Test
    public void test08737() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08737");
        fitnesse.testsystems.slim.tables.SlimTableFactoryTest slimTableFactoryTest0 = new fitnesse.testsystems.slim.tables.SlimTableFactoryTest();
        fitnesse.testsystems.slim.Table table1 = slimTableFactoryTest0.table;
        java.util.Map<java.lang.String, java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable>> strMap2 = slimTableFactoryTest0.getmap();
        fitnesse.testsystems.slim.Table table3 = null;
        slimTableFactoryTest0.table = table3;
        fitnesse.testsystems.slim.Table table5 = null;
        slimTableFactoryTest0.settable(table5);
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory7 = null;
        slimTableFactoryTest0.setslimTableFactory(slimTableFactory7);
        fitnesse.testsystems.slim.Table table9 = slimTableFactoryTest0.table;
        org.junit.Assert.assertNull(table1);
        org.junit.Assert.assertNull(strMap2);
        org.junit.Assert.assertNull(table9);
    }

    @Test
    public void test08738() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08738");
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
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory10 = slimTableFactoryTest0.slimTableFactory;
        org.junit.Assert.assertNull(strMap7);
        org.junit.Assert.assertNull(slimTableFactory10);
    }

    @Test
    public void test08739() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08739");
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
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory14 = null;
        slimTableFactoryTest0.setslimTableFactory(slimTableFactory14);
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory16 = slimTableFactoryTest0.getslimTableFactory();
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
        org.junit.Assert.assertNull(slimTableFactory16);
    }

    @Test
    public void test08740() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08740");
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
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory15 = slimTableFactoryTest0.getslimTableFactory();
        java.lang.Class<?> wildcardClass16 = slimTableFactoryTest0.getClass();
        org.junit.Assert.assertNull(slimTableFactory5);
        org.junit.Assert.assertNull(strMap10);
        org.junit.Assert.assertNull(strMap11);
        org.junit.Assert.assertNull(strMap14);
        org.junit.Assert.assertNull(slimTableFactory15);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test08741() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08741");
        fitnesse.testsystems.slim.tables.SlimTableFactoryTest slimTableFactoryTest0 = new fitnesse.testsystems.slim.tables.SlimTableFactoryTest();
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory1 = slimTableFactoryTest0.slimTableFactory;
        fitnesse.testsystems.slim.Table table2 = slimTableFactoryTest0.table;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory3 = null;
        slimTableFactoryTest0.setslimTableFactory(slimTableFactory3);
        fitnesse.testsystems.slim.Table table5 = null;
        slimTableFactoryTest0.table = table5;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory7 = slimTableFactoryTest0.getslimTableFactory();
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
    public void test08742() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08742");
        fitnesse.testsystems.slim.tables.SlimTableFactoryTest slimTableFactoryTest0 = new fitnesse.testsystems.slim.tables.SlimTableFactoryTest();
        fitnesse.testsystems.slim.Table table1 = null;
        slimTableFactoryTest0.table = table1;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory3 = null;
        slimTableFactoryTest0.setslimTableFactory(slimTableFactory3);
        fitnesse.testsystems.slim.Table table5 = null;
        slimTableFactoryTest0.table = table5;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory7 = slimTableFactoryTest0.getslimTableFactory();
        fitnesse.testsystems.slim.Table table8 = slimTableFactoryTest0.gettable();
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory9 = null;
        slimTableFactoryTest0.slimTableFactory = slimTableFactory9;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory11 = null;
        slimTableFactoryTest0.slimTableFactory = slimTableFactory11;
        org.junit.Assert.assertNull(slimTableFactory7);
        org.junit.Assert.assertNull(table8);
    }

    @Test
    public void test08743() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08743");
        fitnesse.testsystems.slim.tables.SlimTableFactoryTest slimTableFactoryTest0 = new fitnesse.testsystems.slim.tables.SlimTableFactoryTest();
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory1 = slimTableFactoryTest0.slimTableFactory;
        fitnesse.testsystems.slim.Table table2 = slimTableFactoryTest0.table;
        java.util.Map<java.lang.String, java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable>> strMap3 = slimTableFactoryTest0.map;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory4 = null;
        slimTableFactoryTest0.slimTableFactory = slimTableFactory4;
        fitnesse.testsystems.slim.Table table6 = null;
        slimTableFactoryTest0.settable(table6);
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory8 = slimTableFactoryTest0.getslimTableFactory();
        fitnesse.testsystems.slim.Table table9 = slimTableFactoryTest0.table;
        java.util.Map<java.lang.String, java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable>> strMap10 = slimTableFactoryTest0.getmap();
        java.util.Map<java.lang.String, java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable>> strMap11 = slimTableFactoryTest0.getmap();
        fitnesse.testsystems.slim.Table table12 = null;
        slimTableFactoryTest0.table = table12;
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
        org.junit.Assert.assertNull(strMap3);
        org.junit.Assert.assertNull(slimTableFactory8);
        org.junit.Assert.assertNull(table9);
        org.junit.Assert.assertNull(strMap10);
        org.junit.Assert.assertNull(strMap11);
        org.junit.Assert.assertNull(table14);
    }

    @Test
    public void test08744() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08744");
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
        slimTableFactoryTest0.setslimTableFactory(slimTableFactory12);
        fitnesse.testsystems.slim.Table table14 = slimTableFactoryTest0.table;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory15 = slimTableFactoryTest0.slimTableFactory;
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
        org.junit.Assert.assertNull(strMap8);
        org.junit.Assert.assertNull(slimTableFactory9);
        org.junit.Assert.assertNull(slimTableFactory10);
        org.junit.Assert.assertNull(table11);
        org.junit.Assert.assertNull(table14);
        org.junit.Assert.assertNull(slimTableFactory15);
    }

    @Test
    public void test08745() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08745");
        fitnesse.testsystems.slim.tables.SlimTableFactoryTest slimTableFactoryTest0 = new fitnesse.testsystems.slim.tables.SlimTableFactoryTest();
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory1 = slimTableFactoryTest0.slimTableFactory;
        fitnesse.testsystems.slim.Table table2 = slimTableFactoryTest0.gettable();
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory3 = null;
        slimTableFactoryTest0.slimTableFactory = slimTableFactory3;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory5 = null;
        slimTableFactoryTest0.slimTableFactory = slimTableFactory5;
        java.util.Map<java.lang.String, java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable>> strMap7 = slimTableFactoryTest0.map;
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
    public void test08746() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08746");
        fitnesse.testsystems.slim.tables.SlimTableFactoryTest slimTableFactoryTest0 = new fitnesse.testsystems.slim.tables.SlimTableFactoryTest();
        fitnesse.testsystems.slim.Table table1 = null;
        slimTableFactoryTest0.table = table1;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory3 = slimTableFactoryTest0.slimTableFactory;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory4 = slimTableFactoryTest0.slimTableFactory;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory5 = slimTableFactoryTest0.slimTableFactory;
        fitnesse.testsystems.slim.Table table6 = slimTableFactoryTest0.table;
        fitnesse.testsystems.slim.Table table7 = slimTableFactoryTest0.table;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory8 = null;
        slimTableFactoryTest0.setslimTableFactory(slimTableFactory8);
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory10 = slimTableFactoryTest0.slimTableFactory;
        org.junit.Assert.assertNull(slimTableFactory3);
        org.junit.Assert.assertNull(slimTableFactory4);
        org.junit.Assert.assertNull(slimTableFactory5);
        org.junit.Assert.assertNull(table6);
        org.junit.Assert.assertNull(table7);
        org.junit.Assert.assertNull(slimTableFactory10);
    }

    @Test
    public void test08747() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08747");
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
        java.util.Map<java.lang.String, java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable>> strMap11 = slimTableFactoryTest0.map;
        // The following exception was thrown during execution in test generation
        try {
            slimTableFactoryTest0.addTableTypeImport("hi!", "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(table7);
        org.junit.Assert.assertNull(strMap8);
        org.junit.Assert.assertNull(strMap11);
    }

    @Test
    public void test08748() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08748");
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
            slimTableFactoryTest0.checkTableTypeDefineUsedForTable();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(slimTableFactory7);
    }

    @Test
    public void test08749() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08749");
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
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory11 = null;
        slimTableFactoryTest0.slimTableFactory = slimTableFactory11;
        fitnesse.testsystems.slim.Table table13 = slimTableFactoryTest0.table;
        java.util.Map<java.lang.String, java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable>> strMap14 = slimTableFactoryTest0.getmap();
        fitnesse.testsystems.slim.Table table15 = slimTableFactoryTest0.table;
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
        org.junit.Assert.assertNull(strMap8);
        org.junit.Assert.assertNull(table9);
        org.junit.Assert.assertNull(strMap10);
        org.junit.Assert.assertNull(table13);
        org.junit.Assert.assertNull(strMap14);
        org.junit.Assert.assertNull(table15);
    }

    @Test
    public void test08750() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08750");
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
        java.lang.Class<?> wildcardClass12 = slimTableFactoryTest0.getClass();
        org.junit.Assert.assertNull(slimTableFactory3);
        org.junit.Assert.assertNull(slimTableFactory4);
        org.junit.Assert.assertNull(slimTableFactory7);
        org.junit.Assert.assertNull(strMap8);
        org.junit.Assert.assertNull(strMap11);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test08751() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08751");
        fitnesse.testsystems.slim.tables.SlimTableFactoryTest slimTableFactoryTest0 = new fitnesse.testsystems.slim.tables.SlimTableFactoryTest();
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory1 = slimTableFactoryTest0.slimTableFactory;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory2 = slimTableFactoryTest0.slimTableFactory;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory3 = slimTableFactoryTest0.slimTableFactory;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory4 = null;
        slimTableFactoryTest0.slimTableFactory = slimTableFactory4;
        fitnesse.testsystems.slim.Table table6 = null;
        slimTableFactoryTest0.table = table6;
        java.util.Map<java.lang.String, java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable>> strMap8 = slimTableFactoryTest0.getmap();
        java.util.Map<java.lang.String, java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable>> strMap9 = slimTableFactoryTest0.map;
        fitnesse.testsystems.slim.Table table10 = null;
        slimTableFactoryTest0.settable(table10);
        fitnesse.testsystems.slim.Table table12 = slimTableFactoryTest0.table;
        fitnesse.testsystems.slim.Table table13 = null;
        slimTableFactoryTest0.settable(table13);
        fitnesse.testsystems.slim.Table table15 = null;
        slimTableFactoryTest0.settable(table15);
        fitnesse.testsystems.slim.Table table17 = null;
        slimTableFactoryTest0.table = table17;
        java.util.Map<java.lang.String, java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable>> strMap19 = slimTableFactoryTest0.map;
        // The following exception was thrown during execution in test generation
        try {
            slimTableFactoryTest0.addTableTypeImport("", "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(slimTableFactory1);
        org.junit.Assert.assertNull(slimTableFactory2);
        org.junit.Assert.assertNull(slimTableFactory3);
        org.junit.Assert.assertNull(strMap8);
        org.junit.Assert.assertNull(strMap9);
        org.junit.Assert.assertNull(table12);
        org.junit.Assert.assertNull(strMap19);
    }

    @Test
    public void test08752() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08752");
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
        java.util.Map<java.lang.String, java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable>> strMap11 = slimTableFactoryTest0.getmap();
        fitnesse.testsystems.slim.Table table12 = null;
        slimTableFactoryTest0.settable(table12);
        java.util.Map<java.lang.String, java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable>> strMap14 = slimTableFactoryTest0.getmap();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass15 = strMap14.getClass();
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
        org.junit.Assert.assertNull(strMap11);
        org.junit.Assert.assertNull(strMap14);
    }

    @Test
    public void test08753() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08753");
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
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory14 = null;
        slimTableFactoryTest0.setslimTableFactory(slimTableFactory14);
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory16 = null;
        slimTableFactoryTest0.setslimTableFactory(slimTableFactory16);
        // The following exception was thrown during execution in test generation
        try {
            slimTableFactoryTest0.shouldCreateCorrectSlimTableForTablesType();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(slimTableFactory5);
        org.junit.Assert.assertNull(strMap10);
        org.junit.Assert.assertNull(table13);
    }

    @Test
    public void test08754() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08754");
        fitnesse.testsystems.slim.tables.SlimTableFactoryTest slimTableFactoryTest0 = new fitnesse.testsystems.slim.tables.SlimTableFactoryTest();
        fitnesse.testsystems.slim.Table table1 = null;
        slimTableFactoryTest0.table = table1;
        fitnesse.testsystems.slim.Table table3 = null;
        slimTableFactoryTest0.settable(table3);
        java.util.Map<java.lang.String, java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable>> strMap5 = slimTableFactoryTest0.getmap();
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory6 = slimTableFactoryTest0.getslimTableFactory();
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory7 = null;
        slimTableFactoryTest0.setslimTableFactory(slimTableFactory7);
        java.util.Map<java.lang.String, java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable>> strMap9 = slimTableFactoryTest0.getmap();
        java.util.Map<java.lang.String, java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable>> strMap10 = slimTableFactoryTest0.map;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory11 = null;
        slimTableFactoryTest0.setslimTableFactory(slimTableFactory11);
        org.junit.Assert.assertNull(strMap5);
        org.junit.Assert.assertNull(slimTableFactory6);
        org.junit.Assert.assertNull(strMap9);
        org.junit.Assert.assertNull(strMap10);
    }

    @Test
    public void test08755() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08755");
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
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory12 = slimTableFactoryTest0.getslimTableFactory();
        fitnesse.testsystems.slim.Table table13 = slimTableFactoryTest0.gettable();
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
        org.junit.Assert.assertNull(slimTableFactory7);
        org.junit.Assert.assertNull(slimTableFactory10);
        org.junit.Assert.assertNull(strMap11);
        org.junit.Assert.assertNull(slimTableFactory12);
        org.junit.Assert.assertNull(table13);
    }

    @Test
    public void test08756() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08756");
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
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory11 = slimTableFactoryTest0.slimTableFactory;
        java.util.Map<java.lang.String, java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable>> strMap12 = slimTableFactoryTest0.map;
        fitnesse.testsystems.slim.Table table13 = null;
        slimTableFactoryTest0.table = table13;
        java.util.Map<java.lang.String, java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable>> strMap15 = slimTableFactoryTest0.map;
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
        org.junit.Assert.assertNull(table10);
        org.junit.Assert.assertNull(slimTableFactory11);
        org.junit.Assert.assertNull(strMap12);
        org.junit.Assert.assertNull(strMap15);
    }

    @Test
    public void test08757() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08757");
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
            slimTableFactoryTest0.tableTypeStartingWithcommentColonShouldReturnNull();
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
    public void test08758() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08758");
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
        // The following exception was thrown during execution in test generation
        try {
            slimTableFactoryTest0.commentTableShouldReturnNull();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(table7);
        org.junit.Assert.assertNull(strMap14);
        org.junit.Assert.assertNull(slimTableFactory15);
    }

    @Test
    public void test08759() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08759");
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
        fitnesse.testsystems.slim.Table table13 = null;
        slimTableFactoryTest0.table = table13;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory15 = null;
        slimTableFactoryTest0.slimTableFactory = slimTableFactory15;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory17 = slimTableFactoryTest0.getslimTableFactory();
        fitnesse.testsystems.slim.Table table18 = slimTableFactoryTest0.table;
        org.junit.Assert.assertNull(slimTableFactory1);
        org.junit.Assert.assertNull(table2);
        org.junit.Assert.assertNull(slimTableFactory7);
        org.junit.Assert.assertNull(table10);
        org.junit.Assert.assertNull(table11);
        org.junit.Assert.assertNull(table12);
        org.junit.Assert.assertNull(slimTableFactory17);
        org.junit.Assert.assertNull(table18);
    }

    @Test
    public void test08760() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08760");
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
        java.util.Map<java.lang.String, java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable>> strMap12 = slimTableFactoryTest0.map;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory13 = null;
        slimTableFactoryTest0.slimTableFactory = slimTableFactory13;
        fitnesse.testsystems.slim.Table table15 = null;
        slimTableFactoryTest0.table = table15;
        fitnesse.testsystems.slim.Table table17 = slimTableFactoryTest0.table;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory18 = slimTableFactoryTest0.slimTableFactory;
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
        org.junit.Assert.assertNull(strMap10);
        org.junit.Assert.assertNull(table11);
        org.junit.Assert.assertNull(strMap12);
        org.junit.Assert.assertNull(table17);
        org.junit.Assert.assertNull(slimTableFactory18);
    }

    @Test
    public void test08761() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08761");
        fitnesse.testsystems.slim.tables.SlimTableFactoryTest slimTableFactoryTest0 = new fitnesse.testsystems.slim.tables.SlimTableFactoryTest();
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory1 = slimTableFactoryTest0.slimTableFactory;
        fitnesse.testsystems.slim.Table table2 = slimTableFactoryTest0.gettable();
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory3 = null;
        slimTableFactoryTest0.setslimTableFactory(slimTableFactory3);
        fitnesse.testsystems.slim.Table table5 = null;
        slimTableFactoryTest0.settable(table5);
        org.junit.Assert.assertNull(slimTableFactory1);
        org.junit.Assert.assertNull(table2);
    }

    @Test
    public void test08762() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08762");
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
        java.util.Map<java.lang.String, java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable>> strMap14 = slimTableFactoryTest0.map;
        fitnesse.testsystems.slim.Table table15 = null;
        slimTableFactoryTest0.settable(table15);
        fitnesse.testsystems.slim.Table table17 = slimTableFactoryTest0.table;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory18 = null;
        slimTableFactoryTest0.setslimTableFactory(slimTableFactory18);
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
        org.junit.Assert.assertNull(strMap13);
        org.junit.Assert.assertNull(strMap14);
        org.junit.Assert.assertNull(table17);
    }

    @Test
    public void test08763() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08763");
        fitnesse.testsystems.slim.tables.SlimTableFactoryTest slimTableFactoryTest0 = new fitnesse.testsystems.slim.tables.SlimTableFactoryTest();
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory1 = slimTableFactoryTest0.slimTableFactory;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory2 = slimTableFactoryTest0.slimTableFactory;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory3 = slimTableFactoryTest0.slimTableFactory;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory4 = null;
        slimTableFactoryTest0.slimTableFactory = slimTableFactory4;
        fitnesse.testsystems.slim.Table table6 = null;
        slimTableFactoryTest0.table = table6;
        java.util.Map<java.lang.String, java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable>> strMap8 = slimTableFactoryTest0.map;
        fitnesse.testsystems.slim.Table table9 = slimTableFactoryTest0.table;
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
        org.junit.Assert.assertNull(strMap8);
        org.junit.Assert.assertNull(table9);
    }

    @Test
    public void test08764() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08764");
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
        fitnesse.testsystems.slim.Table table14 = slimTableFactoryTest0.gettable();
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory15 = slimTableFactoryTest0.slimTableFactory;
        java.util.Map<java.lang.String, java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable>> strMap16 = slimTableFactoryTest0.map;
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
        org.junit.Assert.assertNull(table14);
        org.junit.Assert.assertNull(slimTableFactory15);
        org.junit.Assert.assertNull(strMap16);
    }

    @Test
    public void test08765() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08765");
        fitnesse.testsystems.slim.tables.SlimTableFactoryTest slimTableFactoryTest0 = new fitnesse.testsystems.slim.tables.SlimTableFactoryTest();
        fitnesse.testsystems.slim.Table table1 = null;
        slimTableFactoryTest0.table = table1;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory3 = slimTableFactoryTest0.slimTableFactory;
        fitnesse.testsystems.slim.Table table4 = slimTableFactoryTest0.table;
        java.util.Map<java.lang.String, java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable>> strMap5 = slimTableFactoryTest0.getmap();
        fitnesse.testsystems.slim.Table table6 = null;
        slimTableFactoryTest0.table = table6;
        fitnesse.testsystems.slim.Table table8 = slimTableFactoryTest0.table;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory9 = null;
        slimTableFactoryTest0.setslimTableFactory(slimTableFactory9);
        fitnesse.testsystems.slim.Table table11 = slimTableFactoryTest0.table;
        org.junit.Assert.assertNull(slimTableFactory3);
        org.junit.Assert.assertNull(table4);
        org.junit.Assert.assertNull(strMap5);
        org.junit.Assert.assertNull(table8);
        org.junit.Assert.assertNull(table11);
    }

    @Test
    public void test08766() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08766");
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
        fitnesse.testsystems.slim.Table table14 = null;
        slimTableFactoryTest0.settable(table14);
        fitnesse.testsystems.slim.Table table16 = slimTableFactoryTest0.gettable();
        java.util.Map<java.lang.String, java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable>> strMap17 = slimTableFactoryTest0.map;
        org.junit.Assert.assertNull(strMap5);
        org.junit.Assert.assertNull(slimTableFactory10);
        org.junit.Assert.assertNull(slimTableFactory11);
        org.junit.Assert.assertNull(table12);
        org.junit.Assert.assertNull(strMap13);
        org.junit.Assert.assertNull(table16);
        org.junit.Assert.assertNull(strMap17);
    }

    @Test
    public void test08767() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08767");
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
        java.util.Map<java.lang.String, java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable>> strMap19 = slimTableFactoryTest0.map;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory20 = slimTableFactoryTest0.getslimTableFactory();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass21 = slimTableFactory20.getClass();
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
    public void test08768() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08768");
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
        fitnesse.testsystems.slim.Table table16 = null;
        slimTableFactoryTest0.settable(table16);
        fitnesse.testsystems.slim.Table table18 = slimTableFactoryTest0.gettable();
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory19 = null;
        slimTableFactoryTest0.slimTableFactory = slimTableFactory19;
        fitnesse.testsystems.slim.Table table21 = null;
        slimTableFactoryTest0.table = table21;
        // The following exception was thrown during execution in test generation
        try {
            slimTableFactoryTest0.commentTableShouldReturnNull();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(table7);
        org.junit.Assert.assertNull(table18);
    }

    @Test
    public void test08769() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08769");
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
        fitnesse.testsystems.slim.Table table10 = slimTableFactoryTest0.gettable();
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory11 = null;
        slimTableFactoryTest0.setslimTableFactory(slimTableFactory11);
        fitnesse.testsystems.slim.Table table13 = slimTableFactoryTest0.table;
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
        org.junit.Assert.assertNull(strMap7);
        org.junit.Assert.assertNull(table8);
        org.junit.Assert.assertNull(strMap9);
        org.junit.Assert.assertNull(table10);
        org.junit.Assert.assertNull(table13);
    }

    @Test
    public void test08770() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08770");
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
        org.junit.Assert.assertNull(strMap13);
    }

    @Test
    public void test08771() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08771");
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
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory13 = slimTableFactoryTest0.getslimTableFactory();
        fitnesse.testsystems.slim.Table table14 = slimTableFactoryTest0.gettable();
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory15 = slimTableFactoryTest0.getslimTableFactory();
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory16 = slimTableFactoryTest0.getslimTableFactory();
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory17 = slimTableFactoryTest0.slimTableFactory;
        // The following exception was thrown during execution in test generation
        try {
            slimTableFactoryTest0.addTableTypeImport("hi!", "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(slimTableFactory13);
        org.junit.Assert.assertNull(table14);
        org.junit.Assert.assertNull(slimTableFactory15);
        org.junit.Assert.assertNull(slimTableFactory16);
        org.junit.Assert.assertNull(slimTableFactory17);
    }

    @Test
    public void test08772() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08772");
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
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory11 = slimTableFactoryTest0.slimTableFactory;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory12 = slimTableFactoryTest0.getslimTableFactory();
        // The following exception was thrown during execution in test generation
        try {
            slimTableFactoryTest0.tableTypeStartingWithcommentColonShouldReturnNull();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(table7);
        org.junit.Assert.assertNull(table8);
        org.junit.Assert.assertNull(slimTableFactory11);
        org.junit.Assert.assertNull(slimTableFactory12);
    }

    @Test
    public void test08773() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08773");
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
        fitnesse.testsystems.slim.Table table12 = null;
        slimTableFactoryTest0.settable(table12);
        fitnesse.testsystems.slim.Table table14 = slimTableFactoryTest0.gettable();
        fitnesse.testsystems.slim.Table table15 = null;
        slimTableFactoryTest0.settable(table15);
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
        org.junit.Assert.assertNull(strMap11);
        org.junit.Assert.assertNull(table14);
    }

    @Test
    public void test08774() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08774");
        fitnesse.testsystems.slim.tables.SlimTableFactoryTest slimTableFactoryTest0 = new fitnesse.testsystems.slim.tables.SlimTableFactoryTest();
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory1 = slimTableFactoryTest0.slimTableFactory;
        fitnesse.testsystems.slim.Table table2 = slimTableFactoryTest0.gettable();
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory3 = null;
        slimTableFactoryTest0.setslimTableFactory(slimTableFactory3);
        fitnesse.testsystems.slim.Table table5 = null;
        slimTableFactoryTest0.table = table5;
        fitnesse.testsystems.slim.Table table7 = slimTableFactoryTest0.table;
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
        org.junit.Assert.assertNull(table7);
    }

    @Test
    public void test08775() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08775");
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
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory14 = slimTableFactoryTest0.getslimTableFactory();
        fitnesse.testsystems.slim.Table table15 = slimTableFactoryTest0.gettable();
        org.junit.Assert.assertNull(slimTableFactory1);
        org.junit.Assert.assertNull(table2);
        org.junit.Assert.assertNull(table9);
        org.junit.Assert.assertNull(slimTableFactory14);
        org.junit.Assert.assertNull(table15);
    }

    @Test
    public void test08776() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08776");
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
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory13 = null;
        slimTableFactoryTest0.setslimTableFactory(slimTableFactory13);
        fitnesse.testsystems.slim.Table table15 = slimTableFactoryTest0.gettable();
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory16 = null;
        slimTableFactoryTest0.setslimTableFactory(slimTableFactory16);
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
        org.junit.Assert.assertNull(strMap12);
        org.junit.Assert.assertNull(table15);
    }

    @Test
    public void test08777() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08777");
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
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory12 = slimTableFactoryTest0.slimTableFactory;
        fitnesse.testsystems.slim.Table table13 = slimTableFactoryTest0.gettable();
        java.util.Map<java.lang.String, java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable>> strMap14 = slimTableFactoryTest0.getmap();
        // The following exception was thrown during execution in test generation
        try {
            slimTableFactoryTest0.tableTypeStartingWithcommentColonShouldReturnNull();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(table7);
        org.junit.Assert.assertNull(table8);
        org.junit.Assert.assertNull(table11);
        org.junit.Assert.assertNull(slimTableFactory12);
        org.junit.Assert.assertNull(table13);
        org.junit.Assert.assertNull(strMap14);
    }

    @Test
    public void test08778() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08778");
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
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory10 = slimTableFactoryTest0.slimTableFactory;
        fitnesse.testsystems.slim.Table table11 = slimTableFactoryTest0.gettable();
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory12 = slimTableFactoryTest0.getslimTableFactory();
        org.junit.Assert.assertNull(table1);
        org.junit.Assert.assertNull(strMap2);
        org.junit.Assert.assertNull(strMap5);
        org.junit.Assert.assertNull(strMap6);
        org.junit.Assert.assertNull(table7);
        org.junit.Assert.assertNull(slimTableFactory10);
        org.junit.Assert.assertNull(table11);
        org.junit.Assert.assertNull(slimTableFactory12);
    }

    @Test
    public void test08779() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08779");
        fitnesse.testsystems.slim.tables.SlimTableFactoryTest slimTableFactoryTest0 = new fitnesse.testsystems.slim.tables.SlimTableFactoryTest();
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory1 = slimTableFactoryTest0.slimTableFactory;
        fitnesse.testsystems.slim.Table table2 = slimTableFactoryTest0.table;
        java.util.Map<java.lang.String, java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable>> strMap3 = slimTableFactoryTest0.map;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory4 = null;
        slimTableFactoryTest0.slimTableFactory = slimTableFactory4;
        fitnesse.testsystems.slim.Table table6 = null;
        slimTableFactoryTest0.settable(table6);
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory8 = slimTableFactoryTest0.getslimTableFactory();
        fitnesse.testsystems.slim.Table table9 = slimTableFactoryTest0.table;
        java.util.Map<java.lang.String, java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable>> strMap10 = slimTableFactoryTest0.getmap();
        java.util.Map<java.lang.String, java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable>> strMap11 = slimTableFactoryTest0.getmap();
        fitnesse.testsystems.slim.Table table12 = null;
        slimTableFactoryTest0.table = table12;
        fitnesse.testsystems.slim.Table table14 = null;
        slimTableFactoryTest0.table = table14;
        java.util.Map<java.lang.String, java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable>> strMap16 = slimTableFactoryTest0.getmap();
        fitnesse.testsystems.slim.Table table17 = slimTableFactoryTest0.table;
        org.junit.Assert.assertNull(slimTableFactory1);
        org.junit.Assert.assertNull(table2);
        org.junit.Assert.assertNull(strMap3);
        org.junit.Assert.assertNull(slimTableFactory8);
        org.junit.Assert.assertNull(table9);
        org.junit.Assert.assertNull(strMap10);
        org.junit.Assert.assertNull(strMap11);
        org.junit.Assert.assertNull(strMap16);
        org.junit.Assert.assertNull(table17);
    }

    @Test
    public void test08780() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08780");
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
        java.util.Map<java.lang.String, java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable>> strMap12 = slimTableFactoryTest0.getmap();
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
        org.junit.Assert.assertNull(table11);
        org.junit.Assert.assertNull(strMap12);
    }

    @Test
    public void test08781() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08781");
        fitnesse.testsystems.slim.tables.SlimTableFactoryTest slimTableFactoryTest0 = new fitnesse.testsystems.slim.tables.SlimTableFactoryTest();
        fitnesse.testsystems.slim.Table table1 = null;
        slimTableFactoryTest0.table = table1;
        fitnesse.testsystems.slim.Table table3 = slimTableFactoryTest0.gettable();
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory4 = slimTableFactoryTest0.getslimTableFactory();
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory5 = null;
        slimTableFactoryTest0.slimTableFactory = slimTableFactory5;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory7 = null;
        slimTableFactoryTest0.slimTableFactory = slimTableFactory7;
        fitnesse.testsystems.slim.Table table9 = null;
        slimTableFactoryTest0.settable(table9);
        // The following exception was thrown during execution in test generation
        try {
            slimTableFactoryTest0.addTableTypeImport("", "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(table3);
        org.junit.Assert.assertNull(slimTableFactory4);
    }

    @Test
    public void test08782() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08782");
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
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory11 = slimTableFactoryTest0.getslimTableFactory();
        fitnesse.testsystems.slim.Table table12 = slimTableFactoryTest0.gettable();
        // The following exception was thrown during execution in test generation
        try {
            slimTableFactoryTest0.commentTableShouldReturnNull();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(slimTableFactory5);
        org.junit.Assert.assertNull(table6);
        org.junit.Assert.assertNull(slimTableFactory9);
        org.junit.Assert.assertNull(slimTableFactory10);
        org.junit.Assert.assertNull(slimTableFactory11);
        org.junit.Assert.assertNull(table12);
    }

    @Test
    public void test08783() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08783");
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
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory14 = null;
        slimTableFactoryTest0.setslimTableFactory(slimTableFactory14);
        java.util.Map<java.lang.String, java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable>> strMap16 = slimTableFactoryTest0.map;
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
        org.junit.Assert.assertNull(slimTableFactory6);
        org.junit.Assert.assertNull(slimTableFactory11);
        org.junit.Assert.assertNull(strMap16);
    }

    @Test
    public void test08784() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08784");
        fitnesse.testsystems.slim.tables.SlimTableFactoryTest slimTableFactoryTest0 = new fitnesse.testsystems.slim.tables.SlimTableFactoryTest();
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory1 = slimTableFactoryTest0.slimTableFactory;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory2 = slimTableFactoryTest0.slimTableFactory;
        fitnesse.testsystems.slim.Table table3 = slimTableFactoryTest0.gettable();
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory4 = slimTableFactoryTest0.getslimTableFactory();
        fitnesse.testsystems.slim.Table table5 = null;
        slimTableFactoryTest0.table = table5;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory7 = slimTableFactoryTest0.getslimTableFactory();
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory8 = slimTableFactoryTest0.slimTableFactory;
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
        org.junit.Assert.assertNull(slimTableFactory7);
        org.junit.Assert.assertNull(slimTableFactory8);
    }

    @Test
    public void test08785() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08785");
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
        fitnesse.testsystems.slim.Table table16 = null;
        slimTableFactoryTest0.table = table16;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory18 = null;
        slimTableFactoryTest0.setslimTableFactory(slimTableFactory18);
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory20 = null;
        slimTableFactoryTest0.slimTableFactory = slimTableFactory20;
        fitnesse.testsystems.slim.Table table22 = null;
        slimTableFactoryTest0.table = table22;
        java.util.Map<java.lang.String, java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable>> strMap24 = slimTableFactoryTest0.getmap();
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
        org.junit.Assert.assertNull(slimTableFactory13);
        org.junit.Assert.assertNull(strMap24);
    }

    @Test
    public void test08786() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08786");
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
        fitnesse.testsystems.slim.Table table14 = slimTableFactoryTest0.table;
        org.junit.Assert.assertNull(slimTableFactory1);
        org.junit.Assert.assertNull(table2);
        org.junit.Assert.assertNull(slimTableFactory7);
        org.junit.Assert.assertNull(slimTableFactory8);
        org.junit.Assert.assertNull(slimTableFactory11);
        org.junit.Assert.assertNull(slimTableFactory12);
        org.junit.Assert.assertNull(strMap13);
        org.junit.Assert.assertNull(table14);
    }

    @Test
    public void test08787() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08787");
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
        java.util.Map<java.lang.String, java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable>> strMap17 = slimTableFactoryTest0.map;
        fitnesse.testsystems.slim.Table table18 = null;
        slimTableFactoryTest0.table = table18;
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
        org.junit.Assert.assertNull(slimTableFactory15);
        org.junit.Assert.assertNull(slimTableFactory16);
        org.junit.Assert.assertNull(strMap17);
    }

    @Test
    public void test08788() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08788");
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
        org.junit.Assert.assertNull(slimTableFactory10);
        org.junit.Assert.assertNull(slimTableFactory11);
    }

    @Test
    public void test08789() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08789");
        fitnesse.testsystems.slim.tables.SlimTableFactoryTest slimTableFactoryTest0 = new fitnesse.testsystems.slim.tables.SlimTableFactoryTest();
        fitnesse.testsystems.slim.Table table1 = slimTableFactoryTest0.table;
        java.util.Map<java.lang.String, java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable>> strMap2 = slimTableFactoryTest0.getmap();
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory3 = slimTableFactoryTest0.getslimTableFactory();
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory4 = null;
        slimTableFactoryTest0.slimTableFactory = slimTableFactory4;
        fitnesse.testsystems.slim.Table table6 = slimTableFactoryTest0.table;
        java.util.Map<java.lang.String, java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable>> strMap7 = slimTableFactoryTest0.map;
        fitnesse.testsystems.slim.Table table8 = slimTableFactoryTest0.gettable();
        java.util.Map<java.lang.String, java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable>> strMap9 = slimTableFactoryTest0.getmap();
        java.util.Map<java.lang.String, java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable>> strMap10 = slimTableFactoryTest0.getmap();
        fitnesse.testsystems.slim.Table table11 = null;
        slimTableFactoryTest0.settable(table11);
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
        org.junit.Assert.assertNull(table6);
        org.junit.Assert.assertNull(strMap7);
        org.junit.Assert.assertNull(table8);
        org.junit.Assert.assertNull(strMap9);
        org.junit.Assert.assertNull(strMap10);
    }

    @Test
    public void test08790() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08790");
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
        fitnesse.testsystems.slim.Table table10 = slimTableFactoryTest0.gettable();
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
        org.junit.Assert.assertNull(table9);
        org.junit.Assert.assertNull(table10);
    }

    @Test
    public void test08791() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08791");
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
    public void test08792() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08792");
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
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory11 = slimTableFactoryTest0.slimTableFactory;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory12 = slimTableFactoryTest0.getslimTableFactory();
        // The following exception was thrown during execution in test generation
        try {
            slimTableFactoryTest0.checkTableTypeDefineUsedForTable();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(table7);
        org.junit.Assert.assertNull(table8);
        org.junit.Assert.assertNull(slimTableFactory11);
        org.junit.Assert.assertNull(slimTableFactory12);
    }

    @Test
    public void test08793() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08793");
        fitnesse.testsystems.slim.tables.SlimTableFactoryTest slimTableFactoryTest0 = new fitnesse.testsystems.slim.tables.SlimTableFactoryTest();
        fitnesse.testsystems.slim.Table table1 = slimTableFactoryTest0.gettable();
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory2 = slimTableFactoryTest0.slimTableFactory;
        fitnesse.testsystems.slim.Table table3 = slimTableFactoryTest0.table;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory4 = null;
        slimTableFactoryTest0.slimTableFactory = slimTableFactory4;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory6 = null;
        slimTableFactoryTest0.slimTableFactory = slimTableFactory6;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory8 = null;
        slimTableFactoryTest0.setslimTableFactory(slimTableFactory8);
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory10 = null;
        slimTableFactoryTest0.slimTableFactory = slimTableFactory10;
        // The following exception was thrown during execution in test generation
        try {
            slimTableFactoryTest0.tableTypeStartingWithcommentColonShouldReturnNull();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(table1);
        org.junit.Assert.assertNull(slimTableFactory2);
        org.junit.Assert.assertNull(table3);
    }

    @Test
    public void test08794() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08794");
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
        org.junit.Assert.assertNull(strMap6);
        org.junit.Assert.assertNull(slimTableFactory7);
        org.junit.Assert.assertNull(table8);
        org.junit.Assert.assertNull(slimTableFactory11);
        org.junit.Assert.assertNull(strMap12);
    }

    @Test
    public void test08795() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08795");
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
        fitnesse.testsystems.slim.Table table10 = null;
        slimTableFactoryTest0.table = table10;
        fitnesse.testsystems.slim.Table table12 = null;
        slimTableFactoryTest0.table = table12;
        fitnesse.testsystems.slim.Table table14 = null;
        slimTableFactoryTest0.settable(table14);
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
        org.junit.Assert.assertNull(strMap7);
        org.junit.Assert.assertNull(table8);
        org.junit.Assert.assertNull(strMap9);
    }

    @Test
    public void test08796() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08796");
        fitnesse.testsystems.slim.tables.SlimTableFactoryTest slimTableFactoryTest0 = new fitnesse.testsystems.slim.tables.SlimTableFactoryTest();
        fitnesse.testsystems.slim.Table table1 = null;
        slimTableFactoryTest0.table = table1;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory3 = slimTableFactoryTest0.slimTableFactory;
        java.util.Map<java.lang.String, java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable>> strMap4 = slimTableFactoryTest0.getmap();
        fitnesse.testsystems.slim.Table table5 = null;
        slimTableFactoryTest0.settable(table5);
        fitnesse.testsystems.slim.Table table7 = null;
        slimTableFactoryTest0.table = table7;
        fitnesse.testsystems.slim.Table table9 = slimTableFactoryTest0.gettable();
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory10 = null;
        slimTableFactoryTest0.setslimTableFactory(slimTableFactory10);
        fitnesse.testsystems.slim.Table table12 = null;
        slimTableFactoryTest0.table = table12;
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
    public void test08797() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08797");
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
            slimTableFactoryTest0.tableTypeStartingWithcommentColonShouldReturnNull();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(slimTableFactory7);
        org.junit.Assert.assertNull(table12);
    }

    @Test
    public void test08798() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08798");
        fitnesse.testsystems.slim.tables.SlimTableFactoryTest slimTableFactoryTest0 = new fitnesse.testsystems.slim.tables.SlimTableFactoryTest();
        fitnesse.testsystems.slim.Table table1 = null;
        slimTableFactoryTest0.table = table1;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory3 = slimTableFactoryTest0.slimTableFactory;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory4 = slimTableFactoryTest0.slimTableFactory;
        java.util.Map<java.lang.String, java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable>> strMap5 = slimTableFactoryTest0.map;
        fitnesse.testsystems.slim.Table table6 = slimTableFactoryTest0.table;
        fitnesse.testsystems.slim.Table table7 = null;
        slimTableFactoryTest0.settable(table7);
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory9 = slimTableFactoryTest0.getslimTableFactory();
        org.junit.Assert.assertNull(slimTableFactory3);
        org.junit.Assert.assertNull(slimTableFactory4);
        org.junit.Assert.assertNull(strMap5);
        org.junit.Assert.assertNull(table6);
        org.junit.Assert.assertNull(slimTableFactory9);
    }

    @Test
    public void test08799() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08799");
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
        fitnesse.testsystems.slim.Table table20 = null;
        slimTableFactoryTest0.settable(table20);
        fitnesse.testsystems.slim.Table table22 = null;
        slimTableFactoryTest0.settable(table22);
        fitnesse.testsystems.slim.Table table24 = null;
        slimTableFactoryTest0.table = table24;
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
        org.junit.Assert.assertNull(table18);
        org.junit.Assert.assertNull(strMap19);
    }

    @Test
    public void test08800() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08800");
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
        java.util.Map<java.lang.String, java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable>> strMap15 = slimTableFactoryTest0.getmap();
        java.lang.Class<?> wildcardClass16 = slimTableFactoryTest0.getClass();
        org.junit.Assert.assertNull(slimTableFactory1);
        org.junit.Assert.assertNull(table2);
        org.junit.Assert.assertNull(slimTableFactory7);
        org.junit.Assert.assertNull(slimTableFactory8);
        org.junit.Assert.assertNull(table9);
        org.junit.Assert.assertNull(table12);
        org.junit.Assert.assertNull(strMap15);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test08801() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08801");
        fitnesse.testsystems.slim.tables.SlimTableFactoryTest slimTableFactoryTest0 = new fitnesse.testsystems.slim.tables.SlimTableFactoryTest();
        fitnesse.testsystems.slim.Table table1 = null;
        slimTableFactoryTest0.table = table1;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory3 = null;
        slimTableFactoryTest0.setslimTableFactory(slimTableFactory3);
        java.util.Map<java.lang.String, java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable>> strMap5 = slimTableFactoryTest0.map;
        fitnesse.testsystems.slim.Table table6 = null;
        slimTableFactoryTest0.table = table6;
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
    public void test08802() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08802");
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
        fitnesse.testsystems.slim.Table table20 = slimTableFactoryTest0.table;
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
    }

    @Test
    public void test08803() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08803");
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
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory11 = slimTableFactoryTest0.slimTableFactory;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory12 = null;
        slimTableFactoryTest0.setslimTableFactory(slimTableFactory12);
        fitnesse.testsystems.slim.Table table14 = null;
        slimTableFactoryTest0.table = table14;
        fitnesse.testsystems.slim.Table table16 = slimTableFactoryTest0.table;
        fitnesse.testsystems.slim.Table table17 = null;
        slimTableFactoryTest0.settable(table17);
        java.lang.Class<?> wildcardClass19 = slimTableFactoryTest0.getClass();
        org.junit.Assert.assertNull(table7);
        org.junit.Assert.assertNull(slimTableFactory10);
        org.junit.Assert.assertNull(slimTableFactory11);
        org.junit.Assert.assertNull(table16);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test08804() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08804");
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
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory11 = slimTableFactoryTest0.getslimTableFactory();
        org.junit.Assert.assertNull(table1);
        org.junit.Assert.assertNull(strMap2);
        org.junit.Assert.assertNull(slimTableFactory3);
        org.junit.Assert.assertNull(slimTableFactory4);
        org.junit.Assert.assertNull(strMap5);
        org.junit.Assert.assertNull(table8);
        org.junit.Assert.assertNull(slimTableFactory11);
    }

    @Test
    public void test08805() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08805");
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
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory13 = slimTableFactoryTest0.getslimTableFactory();
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
        org.junit.Assert.assertNull(slimTableFactory13);
    }

    @Test
    public void test08806() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08806");
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
        fitnesse.testsystems.slim.Table table10 = null;
        slimTableFactoryTest0.settable(table10);
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory12 = null;
        slimTableFactoryTest0.setslimTableFactory(slimTableFactory12);
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory14 = slimTableFactoryTest0.slimTableFactory;
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
        org.junit.Assert.assertNull(table9);
        org.junit.Assert.assertNull(slimTableFactory14);
    }

    @Test
    public void test08807() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08807");
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
        fitnesse.testsystems.slim.Table table11 = slimTableFactoryTest0.table;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory12 = null;
        slimTableFactoryTest0.slimTableFactory = slimTableFactory12;
        // The following exception was thrown during execution in test generation
        try {
            slimTableFactoryTest0.checkTableTypeDefineUsedForTable();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(slimTableFactory7);
        org.junit.Assert.assertNull(slimTableFactory10);
        org.junit.Assert.assertNull(table11);
    }

    @Test
    public void test08808() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08808");
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
        java.util.Map<java.lang.String, java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable>> strMap11 = slimTableFactoryTest0.getmap();
        java.lang.Class<?> wildcardClass12 = slimTableFactoryTest0.getClass();
        org.junit.Assert.assertNull(slimTableFactory5);
        org.junit.Assert.assertNull(strMap10);
        org.junit.Assert.assertNull(strMap11);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test08809() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08809");
        fitnesse.testsystems.slim.tables.SlimTableFactoryTest slimTableFactoryTest0 = new fitnesse.testsystems.slim.tables.SlimTableFactoryTest();
        fitnesse.testsystems.slim.Table table1 = slimTableFactoryTest0.table;
        java.util.Map<java.lang.String, java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable>> strMap2 = slimTableFactoryTest0.getmap();
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory3 = slimTableFactoryTest0.slimTableFactory;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory4 = slimTableFactoryTest0.getslimTableFactory();
        java.util.Map<java.lang.String, java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable>> strMap5 = slimTableFactoryTest0.getmap();
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory6 = null;
        slimTableFactoryTest0.slimTableFactory = slimTableFactory6;
        java.util.Map<java.lang.String, java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable>> strMap8 = slimTableFactoryTest0.map;
        fitnesse.testsystems.slim.Table table9 = null;
        slimTableFactoryTest0.settable(table9);
        fitnesse.testsystems.slim.Table table11 = slimTableFactoryTest0.table;
        java.util.Map<java.lang.String, java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable>> strMap12 = slimTableFactoryTest0.map;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory13 = slimTableFactoryTest0.getslimTableFactory();
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
        org.junit.Assert.assertNull(table11);
        org.junit.Assert.assertNull(strMap12);
        org.junit.Assert.assertNull(slimTableFactory13);
    }

    @Test
    public void test08810() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08810");
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
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory11 = null;
        slimTableFactoryTest0.slimTableFactory = slimTableFactory11;
        fitnesse.testsystems.slim.Table table13 = null;
        slimTableFactoryTest0.settable(table13);
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
    }

    @Test
    public void test08811() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08811");
        fitnesse.testsystems.slim.tables.SlimTableFactoryTest slimTableFactoryTest0 = new fitnesse.testsystems.slim.tables.SlimTableFactoryTest();
        fitnesse.testsystems.slim.Table table1 = null;
        slimTableFactoryTest0.table = table1;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory3 = slimTableFactoryTest0.slimTableFactory;
        java.util.Map<java.lang.String, java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable>> strMap4 = slimTableFactoryTest0.getmap();
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory5 = slimTableFactoryTest0.slimTableFactory;
        java.util.Map<java.lang.String, java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable>> strMap6 = slimTableFactoryTest0.getmap();
        fitnesse.testsystems.slim.Table table7 = null;
        slimTableFactoryTest0.table = table7;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory9 = slimTableFactoryTest0.slimTableFactory;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory10 = null;
        slimTableFactoryTest0.slimTableFactory = slimTableFactory10;
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
        org.junit.Assert.assertNull(slimTableFactory5);
        org.junit.Assert.assertNull(strMap6);
        org.junit.Assert.assertNull(slimTableFactory9);
    }

    @Test
    public void test08812() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08812");
        fitnesse.testsystems.slim.tables.SlimTableFactoryTest slimTableFactoryTest0 = new fitnesse.testsystems.slim.tables.SlimTableFactoryTest();
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory1 = slimTableFactoryTest0.slimTableFactory;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory2 = slimTableFactoryTest0.slimTableFactory;
        fitnesse.testsystems.slim.Table table3 = slimTableFactoryTest0.gettable();
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory4 = slimTableFactoryTest0.getslimTableFactory();
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory5 = slimTableFactoryTest0.slimTableFactory;
        java.util.Map<java.lang.String, java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable>> strMap6 = slimTableFactoryTest0.map;
        fitnesse.testsystems.slim.Table table7 = null;
        slimTableFactoryTest0.settable(table7);
        java.util.Map<java.lang.String, java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable>> strMap9 = slimTableFactoryTest0.map;
        org.junit.Assert.assertNull(slimTableFactory1);
        org.junit.Assert.assertNull(slimTableFactory2);
        org.junit.Assert.assertNull(table3);
        org.junit.Assert.assertNull(slimTableFactory4);
        org.junit.Assert.assertNull(slimTableFactory5);
        org.junit.Assert.assertNull(strMap6);
        org.junit.Assert.assertNull(strMap9);
    }

    @Test
    public void test08813() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08813");
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
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory17 = slimTableFactoryTest0.getslimTableFactory();
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory18 = null;
        slimTableFactoryTest0.setslimTableFactory(slimTableFactory18);
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
        org.junit.Assert.assertNull(table12);
        org.junit.Assert.assertNull(slimTableFactory17);
    }

    @Test
    public void test08814() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08814");
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
        fitnesse.testsystems.slim.Table table20 = null;
        slimTableFactoryTest0.settable(table20);
        fitnesse.testsystems.slim.Table table22 = null;
        slimTableFactoryTest0.settable(table22);
        fitnesse.testsystems.slim.Table table24 = null;
        slimTableFactoryTest0.table = table24;
        java.util.Map<java.lang.String, java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable>> strMap26 = slimTableFactoryTest0.getmap();
        java.util.Map<java.lang.String, java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable>> strMap27 = slimTableFactoryTest0.map;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory28 = slimTableFactoryTest0.slimTableFactory;
        fitnesse.testsystems.slim.Table table29 = null;
        slimTableFactoryTest0.settable(table29);
        fitnesse.testsystems.slim.Table table31 = slimTableFactoryTest0.gettable();
        org.junit.Assert.assertNull(table7);
        org.junit.Assert.assertNull(strMap10);
        org.junit.Assert.assertNull(table13);
        org.junit.Assert.assertNull(table18);
        org.junit.Assert.assertNull(strMap19);
        org.junit.Assert.assertNull(strMap26);
        org.junit.Assert.assertNull(strMap27);
        org.junit.Assert.assertNull(slimTableFactory28);
        org.junit.Assert.assertNull(table31);
    }

    @Test
    public void test08815() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08815");
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
        org.junit.Assert.assertNull(strMap18);
    }

    @Test
    public void test08816() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08816");
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
        fitnesse.testsystems.slim.Table table10 = slimTableFactoryTest0.table;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory11 = null;
        slimTableFactoryTest0.setslimTableFactory(slimTableFactory11);
        fitnesse.testsystems.slim.Table table13 = slimTableFactoryTest0.table;
        fitnesse.testsystems.slim.Table table14 = null;
        slimTableFactoryTest0.table = table14;
        org.junit.Assert.assertNull(table7);
        org.junit.Assert.assertNull(strMap8);
        org.junit.Assert.assertNull(strMap9);
        org.junit.Assert.assertNull(table10);
        org.junit.Assert.assertNull(table13);
    }

    @Test
    public void test08817() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08817");
        fitnesse.testsystems.slim.tables.SlimTableFactoryTest slimTableFactoryTest0 = new fitnesse.testsystems.slim.tables.SlimTableFactoryTest();
        fitnesse.testsystems.slim.Table table1 = null;
        slimTableFactoryTest0.table = table1;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory3 = null;
        slimTableFactoryTest0.setslimTableFactory(slimTableFactory3);
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory5 = slimTableFactoryTest0.slimTableFactory;
        fitnesse.testsystems.slim.Table table6 = slimTableFactoryTest0.table;
        java.util.Map<java.lang.String, java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable>> strMap7 = slimTableFactoryTest0.map;
        fitnesse.testsystems.slim.Table table8 = slimTableFactoryTest0.gettable();
        fitnesse.testsystems.slim.Table table9 = null;
        slimTableFactoryTest0.table = table9;
        // The following exception was thrown during execution in test generation
        try {
            slimTableFactoryTest0.addTableTypeImport("hi!", "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(slimTableFactory5);
        org.junit.Assert.assertNull(table6);
        org.junit.Assert.assertNull(strMap7);
        org.junit.Assert.assertNull(table8);
    }

    @Test
    public void test08818() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08818");
        fitnesse.testsystems.slim.tables.SlimTableFactoryTest slimTableFactoryTest0 = new fitnesse.testsystems.slim.tables.SlimTableFactoryTest();
        fitnesse.testsystems.slim.Table table1 = null;
        slimTableFactoryTest0.table = table1;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory3 = slimTableFactoryTest0.slimTableFactory;
        java.util.Map<java.lang.String, java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable>> strMap4 = slimTableFactoryTest0.getmap();
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory5 = null;
        slimTableFactoryTest0.slimTableFactory = slimTableFactory5;
        fitnesse.testsystems.slim.Table table7 = null;
        slimTableFactoryTest0.settable(table7);
        java.util.Map<java.lang.String, java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable>> strMap9 = slimTableFactoryTest0.getmap();
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory10 = slimTableFactoryTest0.slimTableFactory;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory11 = slimTableFactoryTest0.slimTableFactory;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory12 = slimTableFactoryTest0.getslimTableFactory();
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
        org.junit.Assert.assertNull(strMap9);
        org.junit.Assert.assertNull(slimTableFactory10);
        org.junit.Assert.assertNull(slimTableFactory11);
        org.junit.Assert.assertNull(slimTableFactory12);
        org.junit.Assert.assertNull(table13);
    }

    @Test
    public void test08819() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08819");
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
        java.util.Map<java.lang.String, java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable>> strMap14 = slimTableFactoryTest0.getmap();
        fitnesse.testsystems.slim.Table table15 = slimTableFactoryTest0.table;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory16 = slimTableFactoryTest0.getslimTableFactory();
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory17 = null;
        slimTableFactoryTest0.slimTableFactory = slimTableFactory17;
        org.junit.Assert.assertNull(slimTableFactory3);
        org.junit.Assert.assertNull(strMap4);
        org.junit.Assert.assertNull(table9);
        org.junit.Assert.assertNull(table10);
        org.junit.Assert.assertNull(strMap11);
        org.junit.Assert.assertNull(strMap14);
        org.junit.Assert.assertNull(table15);
        org.junit.Assert.assertNull(slimTableFactory16);
    }

    @Test
    public void test08820() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08820");
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
        fitnesse.testsystems.slim.Table table13 = null;
        slimTableFactoryTest0.settable(table13);
        java.util.Map<java.lang.String, java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable>> strMap15 = slimTableFactoryTest0.getmap();
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
        org.junit.Assert.assertNull(table12);
        org.junit.Assert.assertNull(strMap15);
    }

    @Test
    public void test08821() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08821");
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
        java.util.Map<java.lang.String, java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable>> strMap16 = slimTableFactoryTest0.map;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory17 = slimTableFactoryTest0.getslimTableFactory();
        // The following exception was thrown during execution in test generation
        try {
            slimTableFactoryTest0.tableTypeStartingWithcommentColonShouldReturnNull();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(slimTableFactory1);
        org.junit.Assert.assertNull(table2);
        org.junit.Assert.assertNull(strMap11);
        org.junit.Assert.assertNull(strMap16);
        org.junit.Assert.assertNull(slimTableFactory17);
    }

    @Test
    public void test08822() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08822");
        fitnesse.testsystems.slim.tables.SlimTableFactoryTest slimTableFactoryTest0 = new fitnesse.testsystems.slim.tables.SlimTableFactoryTest();
        fitnesse.testsystems.slim.Table table1 = null;
        slimTableFactoryTest0.table = table1;
        fitnesse.testsystems.slim.Table table3 = null;
        slimTableFactoryTest0.settable(table3);
        java.util.Map<java.lang.String, java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable>> strMap5 = slimTableFactoryTest0.map;
        java.util.Map<java.lang.String, java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable>> strMap6 = slimTableFactoryTest0.getmap();
        java.util.Map<java.lang.String, java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable>> strMap7 = slimTableFactoryTest0.getmap();
        fitnesse.testsystems.slim.Table table8 = slimTableFactoryTest0.table;
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
        org.junit.Assert.assertNull(strMap7);
        org.junit.Assert.assertNull(table8);
        org.junit.Assert.assertNull(strMap9);
    }

    @Test
    public void test08823() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08823");
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
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory13 = slimTableFactoryTest0.getslimTableFactory();
        java.lang.Class<?> wildcardClass14 = slimTableFactoryTest0.getClass();
        org.junit.Assert.assertNull(slimTableFactory3);
        org.junit.Assert.assertNull(strMap4);
        org.junit.Assert.assertNull(slimTableFactory5);
        org.junit.Assert.assertNull(strMap6);
        org.junit.Assert.assertNull(table9);
        org.junit.Assert.assertNull(strMap12);
        org.junit.Assert.assertNull(slimTableFactory13);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test08824() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08824");
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
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory11 = slimTableFactoryTest0.slimTableFactory;
        java.util.Map<java.lang.String, java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable>> strMap12 = slimTableFactoryTest0.getmap();
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory13 = null;
        slimTableFactoryTest0.slimTableFactory = slimTableFactory13;
        // The following exception was thrown during execution in test generation
        try {
            slimTableFactoryTest0.checkTableTypeDefinesIgnoredIfDifferentSpecified();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(slimTableFactory5);
        org.junit.Assert.assertNull(slimTableFactory6);
        org.junit.Assert.assertNull(slimTableFactory11);
        org.junit.Assert.assertNull(strMap12);
    }

    @Test
    public void test08825() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08825");
        fitnesse.testsystems.slim.tables.SlimTableFactoryTest slimTableFactoryTest0 = new fitnesse.testsystems.slim.tables.SlimTableFactoryTest();
        fitnesse.testsystems.slim.Table table1 = null;
        slimTableFactoryTest0.table = table1;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory3 = slimTableFactoryTest0.getslimTableFactory();
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory4 = slimTableFactoryTest0.getslimTableFactory();
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory5 = null;
        slimTableFactoryTest0.slimTableFactory = slimTableFactory5;
        fitnesse.testsystems.slim.Table table7 = slimTableFactoryTest0.gettable();
        // The following exception was thrown during execution in test generation
        try {
            slimTableFactoryTest0.commentTableShouldReturnNull();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(slimTableFactory3);
        org.junit.Assert.assertNull(slimTableFactory4);
        org.junit.Assert.assertNull(table7);
    }

    @Test
    public void test08826() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08826");
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
        org.junit.Assert.assertNull(slimTableFactory3);
        org.junit.Assert.assertNull(strMap4);
        org.junit.Assert.assertNull(table13);
        org.junit.Assert.assertNull(slimTableFactory14);
        org.junit.Assert.assertNull(slimTableFactory15);
        org.junit.Assert.assertNull(table18);
    }

    @Test
    public void test08827() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08827");
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
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory10 = null;
        slimTableFactoryTest0.setslimTableFactory(slimTableFactory10);
        fitnesse.testsystems.slim.Table table12 = null;
        slimTableFactoryTest0.table = table12;
        // The following exception was thrown during execution in test generation
        try {
            slimTableFactoryTest0.addTableTypeImport("", "hi!");
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
    public void test08828() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08828");
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
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory10 = slimTableFactoryTest0.getslimTableFactory();
        java.util.Map<java.lang.String, java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable>> strMap11 = slimTableFactoryTest0.getmap();
        org.junit.Assert.assertNull(strMap5);
        org.junit.Assert.assertNull(strMap6);
        org.junit.Assert.assertNull(strMap7);
        org.junit.Assert.assertNull(table8);
        org.junit.Assert.assertNull(strMap9);
        org.junit.Assert.assertNull(slimTableFactory10);
        org.junit.Assert.assertNull(strMap11);
    }

    @Test
    public void test08829() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08829");
        fitnesse.testsystems.slim.tables.SlimTableFactoryTest slimTableFactoryTest0 = new fitnesse.testsystems.slim.tables.SlimTableFactoryTest();
        fitnesse.testsystems.slim.Table table1 = slimTableFactoryTest0.table;
        java.util.Map<java.lang.String, java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable>> strMap2 = slimTableFactoryTest0.getmap();
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory3 = slimTableFactoryTest0.slimTableFactory;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory4 = slimTableFactoryTest0.getslimTableFactory();
        fitnesse.testsystems.slim.Table table5 = slimTableFactoryTest0.table;
        fitnesse.testsystems.slim.Table table6 = null;
        slimTableFactoryTest0.table = table6;
        java.util.Map<java.lang.String, java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable>> strMap8 = slimTableFactoryTest0.map;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory9 = slimTableFactoryTest0.slimTableFactory;
        fitnesse.testsystems.slim.Table table10 = null;
        slimTableFactoryTest0.table = table10;
        fitnesse.testsystems.slim.Table table12 = slimTableFactoryTest0.table;
        fitnesse.testsystems.slim.Table table13 = slimTableFactoryTest0.gettable();
        org.junit.Assert.assertNull(table1);
        org.junit.Assert.assertNull(strMap2);
        org.junit.Assert.assertNull(slimTableFactory3);
        org.junit.Assert.assertNull(slimTableFactory4);
        org.junit.Assert.assertNull(table5);
        org.junit.Assert.assertNull(strMap8);
        org.junit.Assert.assertNull(slimTableFactory9);
        org.junit.Assert.assertNull(table12);
        org.junit.Assert.assertNull(table13);
    }

    @Test
    public void test08830() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08830");
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
        fitnesse.testsystems.slim.Table table11 = null;
        slimTableFactoryTest0.settable(table11);
        fitnesse.testsystems.slim.Table table13 = null;
        slimTableFactoryTest0.settable(table13);
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory15 = null;
        slimTableFactoryTest0.setslimTableFactory(slimTableFactory15);
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory17 = slimTableFactoryTest0.getslimTableFactory();
        org.junit.Assert.assertNull(slimTableFactory1);
        org.junit.Assert.assertNull(table2);
        org.junit.Assert.assertNull(slimTableFactory7);
        org.junit.Assert.assertNull(slimTableFactory10);
        org.junit.Assert.assertNull(slimTableFactory17);
    }

    @Test
    public void test08831() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08831");
        fitnesse.testsystems.slim.tables.SlimTableFactoryTest slimTableFactoryTest0 = new fitnesse.testsystems.slim.tables.SlimTableFactoryTest();
        fitnesse.testsystems.slim.Table table1 = null;
        slimTableFactoryTest0.table = table1;
        fitnesse.testsystems.slim.Table table3 = null;
        slimTableFactoryTest0.settable(table3);
        java.util.Map<java.lang.String, java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable>> strMap5 = slimTableFactoryTest0.map;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory6 = slimTableFactoryTest0.getslimTableFactory();
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory7 = slimTableFactoryTest0.getslimTableFactory();
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory8 = slimTableFactoryTest0.slimTableFactory;
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
    public void test08832() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08832");
        fitnesse.testsystems.slim.tables.SlimTableFactoryTest slimTableFactoryTest0 = new fitnesse.testsystems.slim.tables.SlimTableFactoryTest();
        fitnesse.testsystems.slim.Table table1 = slimTableFactoryTest0.table;
        fitnesse.testsystems.slim.Table table2 = null;
        slimTableFactoryTest0.table = table2;
        fitnesse.testsystems.slim.Table table4 = slimTableFactoryTest0.gettable();
        fitnesse.testsystems.slim.Table table5 = null;
        slimTableFactoryTest0.settable(table5);
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory7 = slimTableFactoryTest0.getslimTableFactory();
        java.util.Map<java.lang.String, java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable>> strMap8 = slimTableFactoryTest0.map;
        // The following exception was thrown during execution in test generation
        try {
            slimTableFactoryTest0.addTableTypeImport("", "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(table1);
        org.junit.Assert.assertNull(table4);
        org.junit.Assert.assertNull(slimTableFactory7);
        org.junit.Assert.assertNull(strMap8);
    }

    @Test
    public void test08833() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08833");
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
        fitnesse.testsystems.slim.Table table10 = null;
        slimTableFactoryTest0.table = table10;
        // The following exception was thrown during execution in test generation
        try {
            slimTableFactoryTest0.tableTypeStartingWithcommentColonShouldReturnNull();
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
    public void test08834() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08834");
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
        org.junit.Assert.assertNull(strMap7);
        org.junit.Assert.assertNull(slimTableFactory8);
    }

    @Test
    public void test08835() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08835");
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
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory12 = null;
        slimTableFactoryTest0.slimTableFactory = slimTableFactory12;
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
        org.junit.Assert.assertNull(strMap8);
        org.junit.Assert.assertNull(table9);
        org.junit.Assert.assertNull(slimTableFactory10);
        org.junit.Assert.assertNull(slimTableFactory11);
    }

    @Test
    public void test08836() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08836");
        fitnesse.testsystems.slim.tables.SlimTableFactoryTest slimTableFactoryTest0 = new fitnesse.testsystems.slim.tables.SlimTableFactoryTest();
        fitnesse.testsystems.slim.Table table1 = null;
        slimTableFactoryTest0.table = table1;
        fitnesse.testsystems.slim.Table table3 = slimTableFactoryTest0.table;
        fitnesse.testsystems.slim.Table table4 = slimTableFactoryTest0.gettable();
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory5 = slimTableFactoryTest0.slimTableFactory;
        java.util.Map<java.lang.String, java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable>> strMap6 = slimTableFactoryTest0.map;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory7 = slimTableFactoryTest0.slimTableFactory;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory8 = slimTableFactoryTest0.slimTableFactory;
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
        org.junit.Assert.assertNull(strMap6);
        org.junit.Assert.assertNull(slimTableFactory7);
        org.junit.Assert.assertNull(slimTableFactory8);
    }

    @Test
    public void test08837() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08837");
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
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory11 = slimTableFactoryTest0.slimTableFactory;
        fitnesse.testsystems.slim.Table table12 = slimTableFactoryTest0.table;
        java.util.Map<java.lang.String, java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable>> strMap13 = slimTableFactoryTest0.getmap();
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
        org.junit.Assert.assertNull(slimTableFactory11);
        org.junit.Assert.assertNull(table12);
        org.junit.Assert.assertNull(strMap13);
    }

    @Test
    public void test08838() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08838");
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
        fitnesse.testsystems.slim.Table table12 = slimTableFactoryTest0.gettable();
        java.util.Map<java.lang.String, java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable>> strMap13 = slimTableFactoryTest0.getmap();
        java.util.Map<java.lang.String, java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable>> strMap14 = slimTableFactoryTest0.getmap();
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory15 = null;
        slimTableFactoryTest0.setslimTableFactory(slimTableFactory15);
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory17 = slimTableFactoryTest0.slimTableFactory;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory18 = null;
        slimTableFactoryTest0.slimTableFactory = slimTableFactory18;
        org.junit.Assert.assertNull(table3);
        org.junit.Assert.assertNull(table4);
        org.junit.Assert.assertNull(strMap5);
        org.junit.Assert.assertNull(slimTableFactory6);
        org.junit.Assert.assertNull(table9);
        org.junit.Assert.assertNull(table10);
        org.junit.Assert.assertNull(slimTableFactory11);
        org.junit.Assert.assertNull(table12);
        org.junit.Assert.assertNull(strMap13);
        org.junit.Assert.assertNull(strMap14);
        org.junit.Assert.assertNull(slimTableFactory17);
    }

    @Test
    public void test08839() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08839");
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
        java.lang.Class<?> wildcardClass11 = slimTableFactoryTest0.getClass();
        org.junit.Assert.assertNull(slimTableFactory3);
        org.junit.Assert.assertNull(strMap4);
        org.junit.Assert.assertNull(slimTableFactory5);
        org.junit.Assert.assertNull(slimTableFactory10);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test08840() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08840");
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
        java.util.Map<java.lang.String, java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable>> strMap13 = slimTableFactoryTest0.map;
        fitnesse.testsystems.slim.Table table14 = slimTableFactoryTest0.gettable();
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
        org.junit.Assert.assertNull(slimTableFactory12);
        org.junit.Assert.assertNull(strMap13);
        org.junit.Assert.assertNull(table14);
    }

    @Test
    public void test08841() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08841");
        fitnesse.testsystems.slim.tables.SlimTableFactoryTest slimTableFactoryTest0 = new fitnesse.testsystems.slim.tables.SlimTableFactoryTest();
        fitnesse.testsystems.slim.Table table1 = slimTableFactoryTest0.table;
        java.util.Map<java.lang.String, java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable>> strMap2 = slimTableFactoryTest0.getmap();
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory3 = slimTableFactoryTest0.slimTableFactory;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory4 = slimTableFactoryTest0.slimTableFactory;
        fitnesse.testsystems.slim.Table table5 = slimTableFactoryTest0.gettable();
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory6 = slimTableFactoryTest0.slimTableFactory;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory7 = slimTableFactoryTest0.slimTableFactory;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory8 = slimTableFactoryTest0.slimTableFactory;
        fitnesse.testsystems.slim.Table table9 = null;
        slimTableFactoryTest0.table = table9;
        org.junit.Assert.assertNull(table1);
        org.junit.Assert.assertNull(strMap2);
        org.junit.Assert.assertNull(slimTableFactory3);
        org.junit.Assert.assertNull(slimTableFactory4);
        org.junit.Assert.assertNull(table5);
        org.junit.Assert.assertNull(slimTableFactory6);
        org.junit.Assert.assertNull(slimTableFactory7);
        org.junit.Assert.assertNull(slimTableFactory8);
    }

    @Test
    public void test08842() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08842");
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
        slimTableFactoryTest0.table = table13;
        fitnesse.testsystems.slim.Table table15 = null;
        slimTableFactoryTest0.settable(table15);
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
    public void test08843() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08843");
        fitnesse.testsystems.slim.tables.SlimTableFactoryTest slimTableFactoryTest0 = new fitnesse.testsystems.slim.tables.SlimTableFactoryTest();
        fitnesse.testsystems.slim.Table table1 = null;
        slimTableFactoryTest0.table = table1;
        fitnesse.testsystems.slim.Table table3 = null;
        slimTableFactoryTest0.settable(table3);
        java.util.Map<java.lang.String, java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable>> strMap5 = slimTableFactoryTest0.map;
        java.util.Map<java.lang.String, java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable>> strMap6 = slimTableFactoryTest0.getmap();
        fitnesse.testsystems.slim.Table table7 = null;
        slimTableFactoryTest0.table = table7;
        fitnesse.testsystems.slim.Table table9 = slimTableFactoryTest0.gettable();
        java.lang.Class<?> wildcardClass10 = slimTableFactoryTest0.getClass();
        org.junit.Assert.assertNull(strMap5);
        org.junit.Assert.assertNull(strMap6);
        org.junit.Assert.assertNull(table9);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test08844() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08844");
        fitnesse.testsystems.slim.tables.SlimTableFactoryTest slimTableFactoryTest0 = new fitnesse.testsystems.slim.tables.SlimTableFactoryTest();
        fitnesse.testsystems.slim.Table table1 = slimTableFactoryTest0.table;
        java.util.Map<java.lang.String, java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable>> strMap2 = slimTableFactoryTest0.getmap();
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory3 = null;
        slimTableFactoryTest0.slimTableFactory = slimTableFactory3;
        fitnesse.testsystems.slim.Table table5 = slimTableFactoryTest0.table;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory6 = null;
        slimTableFactoryTest0.slimTableFactory = slimTableFactory6;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory8 = null;
        slimTableFactoryTest0.slimTableFactory = slimTableFactory8;
        java.util.Map<java.lang.String, java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable>> strMap10 = slimTableFactoryTest0.getmap();
        fitnesse.testsystems.slim.Table table11 = slimTableFactoryTest0.gettable();
        fitnesse.testsystems.slim.Table table12 = slimTableFactoryTest0.gettable();
        java.lang.Class<?> wildcardClass13 = slimTableFactoryTest0.getClass();
        org.junit.Assert.assertNull(table1);
        org.junit.Assert.assertNull(strMap2);
        org.junit.Assert.assertNull(table5);
        org.junit.Assert.assertNull(strMap10);
        org.junit.Assert.assertNull(table11);
        org.junit.Assert.assertNull(table12);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test08845() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08845");
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
        fitnesse.testsystems.slim.Table table17 = slimTableFactoryTest0.gettable();
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory18 = slimTableFactoryTest0.slimTableFactory;
        // The following exception was thrown during execution in test generation
        try {
            slimTableFactoryTest0.tableTypeStartingWithcommentColonShouldReturnNull();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(slimTableFactory3);
        org.junit.Assert.assertNull(strMap4);
        org.junit.Assert.assertNull(table17);
        org.junit.Assert.assertNull(slimTableFactory18);
    }

    @Test
    public void test08846() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08846");
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
        fitnesse.testsystems.slim.Table table11 = null;
        slimTableFactoryTest0.table = table11;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory13 = slimTableFactoryTest0.slimTableFactory;
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
        org.junit.Assert.assertNull(table10);
        org.junit.Assert.assertNull(slimTableFactory13);
    }

    @Test
    public void test08847() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08847");
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
        slimTableFactoryTest0.table = table11;
        // The following exception was thrown during execution in test generation
        try {
            slimTableFactoryTest0.checkTableTypeDefinesIgnoredIfDifferentSpecified();
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
    public void test08848() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08848");
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
        fitnesse.testsystems.slim.Table table18 = slimTableFactoryTest0.table;
        fitnesse.testsystems.slim.Table table19 = null;
        slimTableFactoryTest0.settable(table19);
        // The following exception was thrown during execution in test generation
        try {
            slimTableFactoryTest0.addTableTypeImport("hi!", "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(slimTableFactory3);
        org.junit.Assert.assertNull(strMap4);
        org.junit.Assert.assertNull(strMap9);
        org.junit.Assert.assertNull(strMap16);
        org.junit.Assert.assertNull(strMap17);
        org.junit.Assert.assertNull(table18);
    }

    @Test
    public void test08849() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08849");
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
        org.junit.Assert.assertNull(table11);
        org.junit.Assert.assertNull(strMap12);
    }

    @Test
    public void test08850() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08850");
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
        fitnesse.testsystems.slim.Table table11 = slimTableFactoryTest0.gettable();
        java.util.Map<java.lang.String, java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable>> strMap12 = slimTableFactoryTest0.map;
        fitnesse.testsystems.slim.Table table13 = null;
        slimTableFactoryTest0.settable(table13);
        org.junit.Assert.assertNull(strMap5);
        org.junit.Assert.assertNull(table10);
        org.junit.Assert.assertNull(table11);
        org.junit.Assert.assertNull(strMap12);
    }

    @Test
    public void test08851() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08851");
        fitnesse.testsystems.slim.tables.SlimTableFactoryTest slimTableFactoryTest0 = new fitnesse.testsystems.slim.tables.SlimTableFactoryTest();
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory1 = slimTableFactoryTest0.slimTableFactory;
        fitnesse.testsystems.slim.Table table2 = slimTableFactoryTest0.gettable();
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory3 = null;
        slimTableFactoryTest0.slimTableFactory = slimTableFactory3;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory5 = null;
        slimTableFactoryTest0.slimTableFactory = slimTableFactory5;
        fitnesse.testsystems.slim.Table table7 = slimTableFactoryTest0.gettable();
        fitnesse.testsystems.slim.Table table8 = slimTableFactoryTest0.table;
        fitnesse.testsystems.slim.Table table9 = null;
        slimTableFactoryTest0.table = table9;
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
        org.junit.Assert.assertNull(table2);
        org.junit.Assert.assertNull(table7);
        org.junit.Assert.assertNull(table8);
    }

    @Test
    public void test08852() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08852");
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
        fitnesse.testsystems.slim.Table table11 = null;
        slimTableFactoryTest0.settable(table11);
        fitnesse.testsystems.slim.Table table13 = null;
        slimTableFactoryTest0.table = table13;
        fitnesse.testsystems.slim.Table table15 = null;
        slimTableFactoryTest0.settable(table15);
        fitnesse.testsystems.slim.Table table17 = slimTableFactoryTest0.gettable();
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory18 = slimTableFactoryTest0.getslimTableFactory();
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
        org.junit.Assert.assertNull(slimTableFactory8);
        org.junit.Assert.assertNull(table17);
        org.junit.Assert.assertNull(slimTableFactory18);
    }

    @Test
    public void test08853() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08853");
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
        slimTableFactoryTest0.table = table14;
        fitnesse.testsystems.slim.Table table16 = slimTableFactoryTest0.table;
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
        org.junit.Assert.assertNull(table12);
        org.junit.Assert.assertNull(strMap13);
        org.junit.Assert.assertNull(table16);
    }

    @Test
    public void test08854() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08854");
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
        java.util.Map<java.lang.String, java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable>> strMap19 = slimTableFactoryTest0.map;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass20 = strMap19.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(table7);
        org.junit.Assert.assertNull(strMap10);
        org.junit.Assert.assertNull(strMap13);
        org.junit.Assert.assertNull(strMap16);
        org.junit.Assert.assertNull(strMap19);
    }

    @Test
    public void test08855() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08855");
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
        fitnesse.testsystems.slim.Table table10 = slimTableFactoryTest0.gettable();
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
        org.junit.Assert.assertNull(table10);
    }

    @Test
    public void test08856() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08856");
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
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory15 = null;
        slimTableFactoryTest0.slimTableFactory = slimTableFactory15;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory17 = null;
        slimTableFactoryTest0.slimTableFactory = slimTableFactory17;
        fitnesse.testsystems.slim.Table table19 = slimTableFactoryTest0.table;
        org.junit.Assert.assertNull(slimTableFactory3);
        org.junit.Assert.assertNull(strMap4);
        org.junit.Assert.assertNull(strMap9);
        org.junit.Assert.assertNull(slimTableFactory10);
        org.junit.Assert.assertNull(slimTableFactory13);
        org.junit.Assert.assertNull(table14);
        org.junit.Assert.assertNull(table19);
    }

    @Test
    public void test08857() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08857");
        fitnesse.testsystems.slim.tables.SlimTableFactoryTest slimTableFactoryTest0 = new fitnesse.testsystems.slim.tables.SlimTableFactoryTest();
        fitnesse.testsystems.slim.Table table1 = null;
        slimTableFactoryTest0.table = table1;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory3 = null;
        slimTableFactoryTest0.slimTableFactory = slimTableFactory3;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory5 = slimTableFactoryTest0.getslimTableFactory();
        java.util.Map<java.lang.String, java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable>> strMap6 = slimTableFactoryTest0.map;
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
        org.junit.Assert.assertNull(strMap6);
    }

    @Test
    public void test08858() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08858");
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
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory12 = slimTableFactoryTest0.getslimTableFactory();
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory13 = null;
        slimTableFactoryTest0.slimTableFactory = slimTableFactory13;
        fitnesse.testsystems.slim.Table table15 = null;
        slimTableFactoryTest0.settable(table15);
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
        org.junit.Assert.assertNull(slimTableFactory12);
    }

    @Test
    public void test08859() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08859");
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
        slimTableFactoryTest0.settable(table16);
        java.util.Map<java.lang.String, java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable>> strMap18 = slimTableFactoryTest0.map;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory19 = slimTableFactoryTest0.getslimTableFactory();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass20 = slimTableFactory19.getClass();
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
        org.junit.Assert.assertNull(slimTableFactory19);
    }

    @Test
    public void test08860() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08860");
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
            java.lang.Class<?> wildcardClass13 = slimTableFactory12.getClass();
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
    public void test08861() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08861");
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
        fitnesse.testsystems.slim.Table table12 = null;
        slimTableFactoryTest0.settable(table12);
        fitnesse.testsystems.slim.Table table14 = slimTableFactoryTest0.table;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory15 = null;
        slimTableFactoryTest0.setslimTableFactory(slimTableFactory15);
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
        org.junit.Assert.assertNull(table14);
    }

    @Test
    public void test08862() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08862");
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
        java.util.Map<java.lang.String, java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable>> strMap17 = slimTableFactoryTest0.map;
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
        org.junit.Assert.assertNull(strMap17);
    }

    @Test
    public void test08863() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08863");
        fitnesse.testsystems.slim.tables.SlimTableFactoryTest slimTableFactoryTest0 = new fitnesse.testsystems.slim.tables.SlimTableFactoryTest();
        fitnesse.testsystems.slim.Table table1 = slimTableFactoryTest0.table;
        java.util.Map<java.lang.String, java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable>> strMap2 = slimTableFactoryTest0.getmap();
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory3 = null;
        slimTableFactoryTest0.slimTableFactory = slimTableFactory3;
        fitnesse.testsystems.slim.Table table5 = slimTableFactoryTest0.table;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory6 = null;
        slimTableFactoryTest0.slimTableFactory = slimTableFactory6;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory8 = null;
        slimTableFactoryTest0.slimTableFactory = slimTableFactory8;
        fitnesse.testsystems.slim.Table table10 = slimTableFactoryTest0.table;
        fitnesse.testsystems.slim.Table table11 = null;
        slimTableFactoryTest0.table = table11;
        java.util.Map<java.lang.String, java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable>> strMap13 = slimTableFactoryTest0.map;
        org.junit.Assert.assertNull(table1);
        org.junit.Assert.assertNull(strMap2);
        org.junit.Assert.assertNull(table5);
        org.junit.Assert.assertNull(table10);
        org.junit.Assert.assertNull(strMap13);
    }

    @Test
    public void test08864() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08864");
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
        java.util.Map<java.lang.String, java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable>> strMap16 = slimTableFactoryTest0.map;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass17 = strMap16.getClass();
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
    public void test08865() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08865");
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
        org.junit.Assert.assertNull(strMap7);
    }

    @Test
    public void test08866() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08866");
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
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory13 = null;
        slimTableFactoryTest0.slimTableFactory = slimTableFactory13;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory15 = null;
        slimTableFactoryTest0.slimTableFactory = slimTableFactory15;
        fitnesse.testsystems.slim.Table table17 = slimTableFactoryTest0.gettable();
        java.util.Map<java.lang.String, java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable>> strMap18 = slimTableFactoryTest0.getmap();
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
        org.junit.Assert.assertNull(table11);
        org.junit.Assert.assertNull(slimTableFactory12);
        org.junit.Assert.assertNull(table17);
        org.junit.Assert.assertNull(strMap18);
    }

    @Test
    public void test08867() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08867");
        fitnesse.testsystems.slim.tables.SlimTableFactoryTest slimTableFactoryTest0 = new fitnesse.testsystems.slim.tables.SlimTableFactoryTest();
        fitnesse.testsystems.slim.Table table1 = slimTableFactoryTest0.table;
        java.util.Map<java.lang.String, java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable>> strMap2 = slimTableFactoryTest0.getmap();
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory3 = slimTableFactoryTest0.slimTableFactory;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory4 = slimTableFactoryTest0.getslimTableFactory();
        fitnesse.testsystems.slim.Table table5 = slimTableFactoryTest0.table;
        fitnesse.testsystems.slim.Table table6 = null;
        slimTableFactoryTest0.table = table6;
        java.util.Map<java.lang.String, java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable>> strMap8 = slimTableFactoryTest0.map;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory9 = slimTableFactoryTest0.slimTableFactory;
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
        org.junit.Assert.assertNull(table5);
        org.junit.Assert.assertNull(strMap8);
        org.junit.Assert.assertNull(slimTableFactory9);
    }

    @Test
    public void test08868() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08868");
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
        java.util.Map<java.lang.String, java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable>> strMap14 = slimTableFactoryTest0.map;
        java.util.Map<java.lang.String, java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable>> strMap15 = slimTableFactoryTest0.map;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass16 = strMap15.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(table7);
        org.junit.Assert.assertNull(strMap10);
        org.junit.Assert.assertNull(strMap13);
        org.junit.Assert.assertNull(strMap14);
        org.junit.Assert.assertNull(strMap15);
    }

    @Test
    public void test08869() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08869");
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
        fitnesse.testsystems.slim.Table table16 = null;
        slimTableFactoryTest0.table = table16;
        // The following exception was thrown during execution in test generation
        try {
            slimTableFactoryTest0.addTableTypeImport("hi!", "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(slimTableFactory3);
        org.junit.Assert.assertNull(strMap4);
        org.junit.Assert.assertNull(strMap11);
    }

    @Test
    public void test08870() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08870");
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
        java.util.Map<java.lang.String, java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable>> strMap10 = slimTableFactoryTest0.getmap();
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory11 = slimTableFactoryTest0.getslimTableFactory();
        // The following exception was thrown during execution in test generation
        try {
            slimTableFactoryTest0.addTableTypeImport("", "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(slimTableFactory3);
        org.junit.Assert.assertNull(strMap4);
        org.junit.Assert.assertNull(slimTableFactory9);
        org.junit.Assert.assertNull(strMap10);
        org.junit.Assert.assertNull(slimTableFactory11);
    }

    @Test
    public void test08871() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08871");
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
        // The following exception was thrown during execution in test generation
        try {
            slimTableFactoryTest0.tableTypeStartingWithcommentColonShouldReturnNull();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(slimTableFactory5);
        org.junit.Assert.assertNull(strMap10);
    }

    @Test
    public void test08872() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08872");
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
        java.util.Map<java.lang.String, java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable>> strMap17 = slimTableFactoryTest0.map;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory18 = null;
        slimTableFactoryTest0.setslimTableFactory(slimTableFactory18);
        // The following exception was thrown during execution in test generation
        try {
            slimTableFactoryTest0.commentTableShouldReturnNull();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(slimTableFactory5);
        org.junit.Assert.assertNull(slimTableFactory12);
        org.junit.Assert.assertNull(table15);
        org.junit.Assert.assertNull(slimTableFactory16);
        org.junit.Assert.assertNull(strMap17);
    }

    @Test
    public void test08873() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08873");
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
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory11 = null;
        slimTableFactoryTest0.slimTableFactory = slimTableFactory11;
        fitnesse.testsystems.slim.Table table13 = slimTableFactoryTest0.gettable();
        java.lang.Class<?> wildcardClass14 = slimTableFactoryTest0.getClass();
        org.junit.Assert.assertNull(slimTableFactory1);
        org.junit.Assert.assertNull(table2);
        org.junit.Assert.assertNull(table9);
        org.junit.Assert.assertNull(slimTableFactory10);
        org.junit.Assert.assertNull(table13);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test08874() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08874");
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
        fitnesse.testsystems.slim.Table table18 = slimTableFactoryTest0.gettable();
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory19 = slimTableFactoryTest0.getslimTableFactory();
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
        org.junit.Assert.assertNull(table18);
        org.junit.Assert.assertNull(slimTableFactory19);
    }

    @Test
    public void test08875() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08875");
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
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory10 = slimTableFactoryTest0.getslimTableFactory();
        java.util.Map<java.lang.String, java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable>> strMap11 = slimTableFactoryTest0.getmap();
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory12 = slimTableFactoryTest0.getslimTableFactory();
        fitnesse.testsystems.slim.Table table13 = null;
        slimTableFactoryTest0.settable(table13);
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
        org.junit.Assert.assertNull(slimTableFactory10);
        org.junit.Assert.assertNull(strMap11);
        org.junit.Assert.assertNull(slimTableFactory12);
    }

    @Test
    public void test08876() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08876");
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
        fitnesse.testsystems.slim.Table table10 = null;
        slimTableFactoryTest0.settable(table10);
        java.util.Map<java.lang.String, java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable>> strMap12 = slimTableFactoryTest0.map;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory13 = slimTableFactoryTest0.getslimTableFactory();
        // The following exception was thrown during execution in test generation
        try {
            slimTableFactoryTest0.addTableTypeImport("hi!", "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(strMap7);
        org.junit.Assert.assertNull(strMap8);
        org.junit.Assert.assertNull(strMap9);
        org.junit.Assert.assertNull(strMap12);
        org.junit.Assert.assertNull(slimTableFactory13);
    }

    @Test
    public void test08877() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08877");
        fitnesse.testsystems.slim.tables.SlimTableFactoryTest slimTableFactoryTest0 = new fitnesse.testsystems.slim.tables.SlimTableFactoryTest();
        fitnesse.testsystems.slim.Table table1 = null;
        slimTableFactoryTest0.table = table1;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory3 = slimTableFactoryTest0.getslimTableFactory();
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory4 = slimTableFactoryTest0.getslimTableFactory();
        fitnesse.testsystems.slim.Table table5 = null;
        slimTableFactoryTest0.table = table5;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory7 = slimTableFactoryTest0.slimTableFactory;
        java.util.Map<java.lang.String, java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable>> strMap8 = slimTableFactoryTest0.map;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory9 = slimTableFactoryTest0.getslimTableFactory();
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
        org.junit.Assert.assertNull(slimTableFactory4);
        org.junit.Assert.assertNull(slimTableFactory7);
        org.junit.Assert.assertNull(strMap8);
        org.junit.Assert.assertNull(slimTableFactory9);
    }

    @Test
    public void test08878() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08878");
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
        slimTableFactoryTest0.setslimTableFactory(slimTableFactory14);
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory16 = null;
        slimTableFactoryTest0.slimTableFactory = slimTableFactory16;
        org.junit.Assert.assertNull(slimTableFactory1);
        org.junit.Assert.assertNull(table2);
        org.junit.Assert.assertNull(table9);
    }

    @Test
    public void test08879() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08879");
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
        java.util.Map<java.lang.String, java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable>> strMap16 = slimTableFactoryTest0.getmap();
        fitnesse.testsystems.slim.Table table17 = null;
        slimTableFactoryTest0.settable(table17);
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
    public void test08880() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08880");
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
        fitnesse.testsystems.slim.Table table16 = slimTableFactoryTest0.table;
        java.util.Map<java.lang.String, java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable>> strMap17 = slimTableFactoryTest0.getmap();
        org.junit.Assert.assertNull(slimTableFactory3);
        org.junit.Assert.assertNull(strMap4);
        org.junit.Assert.assertNull(strMap9);
        org.junit.Assert.assertNull(slimTableFactory10);
        org.junit.Assert.assertNull(slimTableFactory11);
        org.junit.Assert.assertNull(table16);
        org.junit.Assert.assertNull(strMap17);
    }

    @Test
    public void test08881() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08881");
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
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory13 = slimTableFactoryTest0.slimTableFactory;
        java.lang.Class<?> wildcardClass14 = slimTableFactoryTest0.getClass();
        org.junit.Assert.assertNull(slimTableFactory3);
        org.junit.Assert.assertNull(strMap4);
        org.junit.Assert.assertNull(slimTableFactory13);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test08882() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08882");
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
        java.util.Map<java.lang.String, java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable>> strMap13 = slimTableFactoryTest0.map;
        java.util.Map<java.lang.String, java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable>> strMap14 = slimTableFactoryTest0.map;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory15 = null;
        slimTableFactoryTest0.setslimTableFactory(slimTableFactory15);
        org.junit.Assert.assertNull(table7);
        org.junit.Assert.assertNull(table12);
        org.junit.Assert.assertNull(strMap13);
        org.junit.Assert.assertNull(strMap14);
    }

    @Test
    public void test08883() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08883");
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
        slimTableFactoryTest0.table = table14;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory16 = slimTableFactoryTest0.slimTableFactory;
        fitnesse.testsystems.slim.Table table17 = slimTableFactoryTest0.table;
        org.junit.Assert.assertNull(strMap5);
        org.junit.Assert.assertNull(strMap6);
        org.junit.Assert.assertNull(slimTableFactory7);
        org.junit.Assert.assertNull(strMap8);
        org.junit.Assert.assertNull(slimTableFactory9);
        org.junit.Assert.assertNull(table12);
        org.junit.Assert.assertNull(strMap13);
        org.junit.Assert.assertNull(slimTableFactory16);
        org.junit.Assert.assertNull(table17);
    }

    @Test
    public void test08884() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08884");
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
        fitnesse.testsystems.slim.Table table16 = null;
        slimTableFactoryTest0.settable(table16);
        fitnesse.testsystems.slim.Table table18 = null;
        slimTableFactoryTest0.settable(table18);
        org.junit.Assert.assertNull(strMap5);
        org.junit.Assert.assertNull(table8);
        org.junit.Assert.assertNull(slimTableFactory9);
        org.junit.Assert.assertNull(table12);
        org.junit.Assert.assertNull(table15);
    }

    @Test
    public void test08885() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08885");
        fitnesse.testsystems.slim.tables.SlimTableFactoryTest slimTableFactoryTest0 = new fitnesse.testsystems.slim.tables.SlimTableFactoryTest();
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory1 = slimTableFactoryTest0.slimTableFactory;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory2 = slimTableFactoryTest0.slimTableFactory;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory3 = null;
        slimTableFactoryTest0.slimTableFactory = slimTableFactory3;
        fitnesse.testsystems.slim.Table table5 = null;
        slimTableFactoryTest0.table = table5;
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
    public void test08886() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08886");
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
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory12 = null;
        slimTableFactoryTest0.slimTableFactory = slimTableFactory12;
        java.util.Map<java.lang.String, java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable>> strMap14 = slimTableFactoryTest0.getmap();
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
        org.junit.Assert.assertNull(slimTableFactory5);
        org.junit.Assert.assertNull(slimTableFactory8);
        org.junit.Assert.assertNull(slimTableFactory11);
        org.junit.Assert.assertNull(strMap14);
        org.junit.Assert.assertNull(table17);
    }

    @Test
    public void test08887() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08887");
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
        fitnesse.testsystems.slim.Table table12 = null;
        slimTableFactoryTest0.settable(table12);
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory14 = slimTableFactoryTest0.getslimTableFactory();
        org.junit.Assert.assertNull(slimTableFactory7);
        org.junit.Assert.assertNull(slimTableFactory8);
        org.junit.Assert.assertNull(table9);
        org.junit.Assert.assertNull(strMap10);
        org.junit.Assert.assertNull(strMap11);
        org.junit.Assert.assertNull(slimTableFactory14);
    }

    @Test
    public void test08888() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08888");
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
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory13 = slimTableFactoryTest0.slimTableFactory;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory14 = slimTableFactoryTest0.slimTableFactory;
        fitnesse.testsystems.slim.Table table15 = slimTableFactoryTest0.gettable();
        fitnesse.testsystems.slim.Table table16 = slimTableFactoryTest0.gettable();
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
        org.junit.Assert.assertNull(slimTableFactory13);
        org.junit.Assert.assertNull(slimTableFactory14);
        org.junit.Assert.assertNull(table15);
        org.junit.Assert.assertNull(table16);
    }

    @Test
    public void test08889() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08889");
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
            slimTableFactoryTest0.addTableTypeImport("", "hi!");
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
    public void test08890() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08890");
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
        org.junit.Assert.assertNull(strMap13);
    }

    @Test
    public void test08891() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08891");
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
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory17 = null;
        slimTableFactoryTest0.slimTableFactory = slimTableFactory17;
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
    }

    @Test
    public void test08892() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08892");
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
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory17 = slimTableFactoryTest0.getslimTableFactory();
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
        org.junit.Assert.assertNull(strMap14);
        org.junit.Assert.assertNull(slimTableFactory17);
    }

    @Test
    public void test08893() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08893");
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
        // The following exception was thrown during execution in test generation
        try {
            slimTableFactoryTest0.tableTypeStartingWithcommentColonShouldReturnNull();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(slimTableFactory3);
        org.junit.Assert.assertNull(strMap4);
        org.junit.Assert.assertNull(table15);
    }

    @Test
    public void test08894() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08894");
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
    }

    @Test
    public void test08895() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08895");
        fitnesse.testsystems.slim.tables.SlimTableFactoryTest slimTableFactoryTest0 = new fitnesse.testsystems.slim.tables.SlimTableFactoryTest();
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory1 = slimTableFactoryTest0.slimTableFactory;
        fitnesse.testsystems.slim.Table table2 = slimTableFactoryTest0.gettable();
        fitnesse.testsystems.slim.Table table3 = null;
        slimTableFactoryTest0.table = table3;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory5 = slimTableFactoryTest0.getslimTableFactory();
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory6 = null;
        slimTableFactoryTest0.setslimTableFactory(slimTableFactory6);
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory8 = slimTableFactoryTest0.slimTableFactory;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory9 = slimTableFactoryTest0.getslimTableFactory();
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory10 = null;
        slimTableFactoryTest0.setslimTableFactory(slimTableFactory10);
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
        org.junit.Assert.assertNull(slimTableFactory5);
        org.junit.Assert.assertNull(slimTableFactory8);
        org.junit.Assert.assertNull(slimTableFactory9);
    }

    @Test
    public void test08896() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08896");
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
        slimTableFactoryTest0.table = table13;
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
    public void test08897() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08897");
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
        slimTableFactoryTest0.setslimTableFactory(slimTableFactory11);
        fitnesse.testsystems.slim.Table table13 = slimTableFactoryTest0.table;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory14 = null;
        slimTableFactoryTest0.slimTableFactory = slimTableFactory14;
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
    }

    @Test
    public void test08898() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08898");
        fitnesse.testsystems.slim.tables.SlimTableFactoryTest slimTableFactoryTest0 = new fitnesse.testsystems.slim.tables.SlimTableFactoryTest();
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory1 = slimTableFactoryTest0.slimTableFactory;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory2 = slimTableFactoryTest0.slimTableFactory;
        fitnesse.testsystems.slim.Table table3 = slimTableFactoryTest0.gettable();
        fitnesse.testsystems.slim.Table table4 = slimTableFactoryTest0.gettable();
        fitnesse.testsystems.slim.Table table5 = slimTableFactoryTest0.gettable();
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory6 = slimTableFactoryTest0.slimTableFactory;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory7 = null;
        slimTableFactoryTest0.slimTableFactory = slimTableFactory7;
        // The following exception was thrown during execution in test generation
        try {
            slimTableFactoryTest0.addTableTypeImport("", "hi!");
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
    public void test08899() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08899");
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
        fitnesse.testsystems.slim.Table table19 = null;
        slimTableFactoryTest0.table = table19;
        java.util.Map<java.lang.String, java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable>> strMap21 = slimTableFactoryTest0.map;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory22 = slimTableFactoryTest0.slimTableFactory;
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
        org.junit.Assert.assertNull(table14);
        org.junit.Assert.assertNull(slimTableFactory17);
        org.junit.Assert.assertNull(strMap18);
        org.junit.Assert.assertNull(strMap21);
        org.junit.Assert.assertNull(slimTableFactory22);
    }

    @Test
    public void test08900() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08900");
        fitnesse.testsystems.slim.tables.SlimTableFactoryTest slimTableFactoryTest0 = new fitnesse.testsystems.slim.tables.SlimTableFactoryTest();
        fitnesse.testsystems.slim.Table table1 = slimTableFactoryTest0.table;
        java.util.Map<java.lang.String, java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable>> strMap2 = slimTableFactoryTest0.getmap();
        java.util.Map<java.lang.String, java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable>> strMap3 = slimTableFactoryTest0.getmap();
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory4 = slimTableFactoryTest0.slimTableFactory;
        fitnesse.testsystems.slim.Table table5 = null;
        slimTableFactoryTest0.settable(table5);
        fitnesse.testsystems.slim.Table table7 = slimTableFactoryTest0.table;
        java.util.Map<java.lang.String, java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable>> strMap8 = slimTableFactoryTest0.map;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory9 = slimTableFactoryTest0.getslimTableFactory();
        org.junit.Assert.assertNull(table1);
        org.junit.Assert.assertNull(strMap2);
        org.junit.Assert.assertNull(strMap3);
        org.junit.Assert.assertNull(slimTableFactory4);
        org.junit.Assert.assertNull(table7);
        org.junit.Assert.assertNull(strMap8);
        org.junit.Assert.assertNull(slimTableFactory9);
    }

    @Test
    public void test08901() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08901");
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
        // The following exception was thrown during execution in test generation
        try {
            slimTableFactoryTest0.tableTypeStartingWithcommentColonShouldReturnNull();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(slimTableFactory1);
        org.junit.Assert.assertNull(table2);
        org.junit.Assert.assertNull(strMap15);
    }

    @Test
    public void test08902() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08902");
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
        java.util.Map<java.lang.String, java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable>> strMap22 = slimTableFactoryTest0.map;
        org.junit.Assert.assertNull(strMap13);
        org.junit.Assert.assertNull(strMap22);
    }

    @Test
    public void test08903() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08903");
        fitnesse.testsystems.slim.tables.SlimTableFactoryTest slimTableFactoryTest0 = new fitnesse.testsystems.slim.tables.SlimTableFactoryTest();
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory1 = slimTableFactoryTest0.slimTableFactory;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory2 = slimTableFactoryTest0.slimTableFactory;
        fitnesse.testsystems.slim.Table table3 = slimTableFactoryTest0.gettable();
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory4 = null;
        slimTableFactoryTest0.slimTableFactory = slimTableFactory4;
        fitnesse.testsystems.slim.Table table6 = null;
        slimTableFactoryTest0.table = table6;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory8 = slimTableFactoryTest0.getslimTableFactory();
        fitnesse.testsystems.slim.Table table9 = null;
        slimTableFactoryTest0.table = table9;
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
        org.junit.Assert.assertNull(slimTableFactory8);
    }

    @Test
    public void test08904() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08904");
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
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory12 = null;
        slimTableFactoryTest0.setslimTableFactory(slimTableFactory12);
        fitnesse.testsystems.slim.Table table14 = null;
        slimTableFactoryTest0.table = table14;
        java.lang.Class<?> wildcardClass16 = slimTableFactoryTest0.getClass();
        org.junit.Assert.assertNull(slimTableFactory5);
        org.junit.Assert.assertNull(slimTableFactory8);
        org.junit.Assert.assertNull(table9);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test08905() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08905");
        fitnesse.testsystems.slim.tables.SlimTableFactoryTest slimTableFactoryTest0 = new fitnesse.testsystems.slim.tables.SlimTableFactoryTest();
        fitnesse.testsystems.slim.Table table1 = null;
        slimTableFactoryTest0.table = table1;
        fitnesse.testsystems.slim.Table table3 = slimTableFactoryTest0.table;
        fitnesse.testsystems.slim.Table table4 = slimTableFactoryTest0.gettable();
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory5 = slimTableFactoryTest0.slimTableFactory;
        fitnesse.testsystems.slim.Table table6 = null;
        slimTableFactoryTest0.settable(table6);
        fitnesse.testsystems.slim.Table table8 = slimTableFactoryTest0.gettable();
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory9 = null;
        slimTableFactoryTest0.setslimTableFactory(slimTableFactory9);
        java.util.Map<java.lang.String, java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable>> strMap11 = slimTableFactoryTest0.getmap();
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory12 = null;
        slimTableFactoryTest0.setslimTableFactory(slimTableFactory12);
        java.util.Map<java.lang.String, java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable>> strMap14 = slimTableFactoryTest0.map;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory15 = slimTableFactoryTest0.slimTableFactory;
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
        org.junit.Assert.assertNull(strMap11);
        org.junit.Assert.assertNull(strMap14);
        org.junit.Assert.assertNull(slimTableFactory15);
    }

    @Test
    public void test08906() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08906");
        fitnesse.testsystems.slim.tables.SlimTableFactoryTest slimTableFactoryTest0 = new fitnesse.testsystems.slim.tables.SlimTableFactoryTest();
        fitnesse.testsystems.slim.Table table1 = slimTableFactoryTest0.table;
        java.util.Map<java.lang.String, java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable>> strMap2 = slimTableFactoryTest0.getmap();
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory3 = slimTableFactoryTest0.slimTableFactory;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory4 = slimTableFactoryTest0.getslimTableFactory();
        fitnesse.testsystems.slim.Table table5 = null;
        slimTableFactoryTest0.table = table5;
        fitnesse.testsystems.slim.Table table7 = null;
        slimTableFactoryTest0.table = table7;
        fitnesse.testsystems.slim.Table table9 = slimTableFactoryTest0.table;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory10 = null;
        slimTableFactoryTest0.slimTableFactory = slimTableFactory10;
        fitnesse.testsystems.slim.Table table12 = null;
        slimTableFactoryTest0.table = table12;
        org.junit.Assert.assertNull(table1);
        org.junit.Assert.assertNull(strMap2);
        org.junit.Assert.assertNull(slimTableFactory3);
        org.junit.Assert.assertNull(slimTableFactory4);
        org.junit.Assert.assertNull(table9);
    }

    @Test
    public void test08907() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08907");
        fitnesse.testsystems.slim.tables.SlimTableFactoryTest slimTableFactoryTest0 = new fitnesse.testsystems.slim.tables.SlimTableFactoryTest();
        fitnesse.testsystems.slim.Table table1 = null;
        slimTableFactoryTest0.table = table1;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory3 = slimTableFactoryTest0.slimTableFactory;
        fitnesse.testsystems.slim.Table table4 = slimTableFactoryTest0.table;
        java.util.Map<java.lang.String, java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable>> strMap5 = slimTableFactoryTest0.getmap();
        fitnesse.testsystems.slim.Table table6 = null;
        slimTableFactoryTest0.table = table6;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory8 = slimTableFactoryTest0.slimTableFactory;
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
        org.junit.Assert.assertNull(slimTableFactory8);
    }

    @Test
    public void test08908() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08908");
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
            slimTableFactoryTest0.tableTypeStartingWithcommentColonShouldReturnNull();
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
    public void test08909() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08909");
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
        fitnesse.testsystems.slim.Table table15 = slimTableFactoryTest0.gettable();
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
        org.junit.Assert.assertNull(slimTableFactory14);
        org.junit.Assert.assertNull(table15);
    }

    @Test
    public void test08910() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08910");
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
        fitnesse.testsystems.slim.Table table17 = null;
        slimTableFactoryTest0.settable(table17);
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory19 = null;
        slimTableFactoryTest0.setslimTableFactory(slimTableFactory19);
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
    public void test08911() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08911");
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
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass18 = slimTableFactory17.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(table3);
        org.junit.Assert.assertNull(table4);
        org.junit.Assert.assertNull(slimTableFactory5);
        org.junit.Assert.assertNull(strMap16);
        org.junit.Assert.assertNull(slimTableFactory17);
    }

    @Test
    public void test08912() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08912");
        fitnesse.testsystems.slim.tables.SlimTableFactoryTest slimTableFactoryTest0 = new fitnesse.testsystems.slim.tables.SlimTableFactoryTest();
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory1 = slimTableFactoryTest0.slimTableFactory;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory2 = slimTableFactoryTest0.slimTableFactory;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory3 = slimTableFactoryTest0.slimTableFactory;
        java.util.Map<java.lang.String, java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable>> strMap4 = slimTableFactoryTest0.map;
        fitnesse.testsystems.slim.Table table5 = null;
        slimTableFactoryTest0.settable(table5);
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory7 = slimTableFactoryTest0.getslimTableFactory();
        java.util.Map<java.lang.String, java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable>> strMap8 = slimTableFactoryTest0.map;
        fitnesse.testsystems.slim.Table table9 = slimTableFactoryTest0.gettable();
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory10 = slimTableFactoryTest0.slimTableFactory;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass11 = slimTableFactory10.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(slimTableFactory1);
        org.junit.Assert.assertNull(slimTableFactory2);
        org.junit.Assert.assertNull(slimTableFactory3);
        org.junit.Assert.assertNull(strMap4);
        org.junit.Assert.assertNull(slimTableFactory7);
        org.junit.Assert.assertNull(strMap8);
        org.junit.Assert.assertNull(table9);
        org.junit.Assert.assertNull(slimTableFactory10);
    }

    @Test
    public void test08913() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08913");
        fitnesse.testsystems.slim.tables.SlimTableFactoryTest slimTableFactoryTest0 = new fitnesse.testsystems.slim.tables.SlimTableFactoryTest();
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory1 = slimTableFactoryTest0.slimTableFactory;
        fitnesse.testsystems.slim.Table table2 = slimTableFactoryTest0.gettable();
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory3 = null;
        slimTableFactoryTest0.slimTableFactory = slimTableFactory3;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory5 = null;
        slimTableFactoryTest0.slimTableFactory = slimTableFactory5;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory7 = null;
        slimTableFactoryTest0.setslimTableFactory(slimTableFactory7);
        java.util.Map<java.lang.String, java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable>> strMap9 = slimTableFactoryTest0.map;
        fitnesse.testsystems.slim.Table table10 = slimTableFactoryTest0.gettable();
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory11 = null;
        slimTableFactoryTest0.slimTableFactory = slimTableFactory11;
        java.lang.Class<?> wildcardClass13 = slimTableFactoryTest0.getClass();
        org.junit.Assert.assertNull(slimTableFactory1);
        org.junit.Assert.assertNull(table2);
        org.junit.Assert.assertNull(strMap9);
        org.junit.Assert.assertNull(table10);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test08914() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08914");
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
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory11 = slimTableFactoryTest0.slimTableFactory;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory12 = null;
        slimTableFactoryTest0.setslimTableFactory(slimTableFactory12);
        fitnesse.testsystems.slim.Table table14 = slimTableFactoryTest0.gettable();
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory15 = null;
        slimTableFactoryTest0.setslimTableFactory(slimTableFactory15);
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
        org.junit.Assert.assertNull(slimTableFactory11);
        org.junit.Assert.assertNull(table14);
    }

    @Test
    public void test08915() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08915");
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
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory10 = null;
        slimTableFactoryTest0.setslimTableFactory(slimTableFactory10);
        java.util.Map<java.lang.String, java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable>> strMap12 = slimTableFactoryTest0.getmap();
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
        org.junit.Assert.assertNull(strMap12);
    }

    @Test
    public void test08916() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08916");
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
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory13 = slimTableFactoryTest0.slimTableFactory;
        fitnesse.testsystems.slim.Table table14 = slimTableFactoryTest0.gettable();
        fitnesse.testsystems.slim.Table table15 = null;
        slimTableFactoryTest0.settable(table15);
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory17 = null;
        slimTableFactoryTest0.slimTableFactory = slimTableFactory17;
        java.util.Map<java.lang.String, java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable>> strMap19 = slimTableFactoryTest0.getmap();
        org.junit.Assert.assertNull(strMap5);
        org.junit.Assert.assertNull(slimTableFactory6);
        org.junit.Assert.assertNull(slimTableFactory7);
        org.junit.Assert.assertNull(table8);
        org.junit.Assert.assertNull(slimTableFactory13);
        org.junit.Assert.assertNull(table14);
        org.junit.Assert.assertNull(strMap19);
    }

    @Test
    public void test08917() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08917");
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
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory18 = null;
        slimTableFactoryTest0.setslimTableFactory(slimTableFactory18);
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory20 = slimTableFactoryTest0.getslimTableFactory();
        // The following exception was thrown during execution in test generation
        try {
            slimTableFactoryTest0.checkTableTypeDefinesIgnoredIfDifferentSpecified();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(strMap7);
        org.junit.Assert.assertNull(slimTableFactory12);
        org.junit.Assert.assertNull(table13);
        org.junit.Assert.assertNull(slimTableFactory20);
    }

    @Test
    public void test08918() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08918");
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
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory12 = null;
        slimTableFactoryTest0.setslimTableFactory(slimTableFactory12);
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory14 = slimTableFactoryTest0.getslimTableFactory();
        fitnesse.testsystems.slim.Table table15 = null;
        slimTableFactoryTest0.settable(table15);
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory17 = null;
        slimTableFactoryTest0.slimTableFactory = slimTableFactory17;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory19 = null;
        slimTableFactoryTest0.setslimTableFactory(slimTableFactory19);
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory21 = slimTableFactoryTest0.getslimTableFactory();
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
        org.junit.Assert.assertNull(slimTableFactory14);
        org.junit.Assert.assertNull(slimTableFactory21);
    }

    @Test
    public void test08919() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08919");
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
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory15 = slimTableFactoryTest0.getslimTableFactory();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass16 = slimTableFactory15.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(slimTableFactory1);
        org.junit.Assert.assertNull(table2);
        org.junit.Assert.assertNull(slimTableFactory7);
        org.junit.Assert.assertNull(slimTableFactory8);
        org.junit.Assert.assertNull(slimTableFactory15);
    }

    @Test
    public void test08920() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08920");
        fitnesse.testsystems.slim.tables.SlimTableFactoryTest slimTableFactoryTest0 = new fitnesse.testsystems.slim.tables.SlimTableFactoryTest();
        fitnesse.testsystems.slim.Table table1 = null;
        slimTableFactoryTest0.table = table1;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory3 = slimTableFactoryTest0.slimTableFactory;
        java.util.Map<java.lang.String, java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable>> strMap4 = slimTableFactoryTest0.map;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory5 = null;
        slimTableFactoryTest0.setslimTableFactory(slimTableFactory5);
        java.util.Map<java.lang.String, java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable>> strMap7 = slimTableFactoryTest0.map;
        java.util.Map<java.lang.String, java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable>> strMap8 = slimTableFactoryTest0.map;
        java.util.Map<java.lang.String, java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable>> strMap9 = slimTableFactoryTest0.map;
        java.util.Map<java.lang.String, java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable>> strMap10 = slimTableFactoryTest0.map;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory11 = slimTableFactoryTest0.slimTableFactory;
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
        org.junit.Assert.assertNull(strMap7);
        org.junit.Assert.assertNull(strMap8);
        org.junit.Assert.assertNull(strMap9);
        org.junit.Assert.assertNull(strMap10);
        org.junit.Assert.assertNull(slimTableFactory11);
        org.junit.Assert.assertNull(strMap12);
        org.junit.Assert.assertNull(table13);
    }

    @Test
    public void test08921() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08921");
        fitnesse.testsystems.slim.tables.SlimTableFactoryTest slimTableFactoryTest0 = new fitnesse.testsystems.slim.tables.SlimTableFactoryTest();
        fitnesse.testsystems.slim.Table table1 = null;
        slimTableFactoryTest0.table = table1;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory3 = null;
        slimTableFactoryTest0.slimTableFactory = slimTableFactory3;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory5 = slimTableFactoryTest0.getslimTableFactory();
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory6 = null;
        slimTableFactoryTest0.setslimTableFactory(slimTableFactory6);
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory8 = slimTableFactoryTest0.getslimTableFactory();
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory9 = slimTableFactoryTest0.slimTableFactory;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory10 = null;
        slimTableFactoryTest0.setslimTableFactory(slimTableFactory10);
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory12 = slimTableFactoryTest0.slimTableFactory;
        // The following exception was thrown during execution in test generation
        try {
            slimTableFactoryTest0.commentTableShouldReturnNull();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(slimTableFactory5);
        org.junit.Assert.assertNull(slimTableFactory8);
        org.junit.Assert.assertNull(slimTableFactory9);
        org.junit.Assert.assertNull(slimTableFactory12);
    }

    @Test
    public void test08922() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08922");
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
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory18 = slimTableFactoryTest0.getslimTableFactory();
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory19 = null;
        slimTableFactoryTest0.slimTableFactory = slimTableFactory19;
        java.util.Map<java.lang.String, java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable>> strMap21 = slimTableFactoryTest0.getmap();
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory22 = slimTableFactoryTest0.getslimTableFactory();
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory23 = slimTableFactoryTest0.slimTableFactory;
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
        org.junit.Assert.assertNull(slimTableFactory8);
        org.junit.Assert.assertNull(strMap13);
        org.junit.Assert.assertNull(strMap16);
        org.junit.Assert.assertNull(table17);
        org.junit.Assert.assertNull(slimTableFactory18);
        org.junit.Assert.assertNull(strMap21);
        org.junit.Assert.assertNull(slimTableFactory22);
        org.junit.Assert.assertNull(slimTableFactory23);
    }

    @Test
    public void test08923() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08923");
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
        java.util.Map<java.lang.String, java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable>> strMap11 = slimTableFactoryTest0.map;
        fitnesse.testsystems.slim.Table table12 = slimTableFactoryTest0.gettable();
        fitnesse.testsystems.slim.Table table13 = slimTableFactoryTest0.gettable();
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory14 = slimTableFactoryTest0.getslimTableFactory();
        java.util.Map<java.lang.String, java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable>> strMap15 = slimTableFactoryTest0.map;
        fitnesse.testsystems.slim.Table table16 = slimTableFactoryTest0.table;
        java.util.Map<java.lang.String, java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable>> strMap17 = slimTableFactoryTest0.getmap();
        org.junit.Assert.assertNull(strMap5);
        org.junit.Assert.assertNull(slimTableFactory6);
        org.junit.Assert.assertNull(slimTableFactory7);
        org.junit.Assert.assertNull(table8);
        org.junit.Assert.assertNull(strMap11);
        org.junit.Assert.assertNull(table12);
        org.junit.Assert.assertNull(table13);
        org.junit.Assert.assertNull(slimTableFactory14);
        org.junit.Assert.assertNull(strMap15);
        org.junit.Assert.assertNull(table16);
        org.junit.Assert.assertNull(strMap17);
    }

    @Test
    public void test08924() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08924");
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
            slimTableFactoryTest0.checkTableTypeDefineUsedForTable();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(strMap7);
    }

    @Test
    public void test08925() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08925");
        fitnesse.testsystems.slim.tables.SlimTableFactoryTest slimTableFactoryTest0 = new fitnesse.testsystems.slim.tables.SlimTableFactoryTest();
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory1 = slimTableFactoryTest0.slimTableFactory;
        fitnesse.testsystems.slim.Table table2 = slimTableFactoryTest0.gettable();
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory3 = null;
        slimTableFactoryTest0.slimTableFactory = slimTableFactory3;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory5 = null;
        slimTableFactoryTest0.slimTableFactory = slimTableFactory5;
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
        org.junit.Assert.assertNull(slimTableFactory1);
        org.junit.Assert.assertNull(table2);
        org.junit.Assert.assertNull(slimTableFactory9);
    }

    @Test
    public void test08926() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08926");
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
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory11 = slimTableFactoryTest0.slimTableFactory;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory12 = slimTableFactoryTest0.getslimTableFactory();
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory13 = null;
        slimTableFactoryTest0.slimTableFactory = slimTableFactory13;
        fitnesse.testsystems.slim.Table table15 = null;
        slimTableFactoryTest0.settable(table15);
        // The following exception was thrown during execution in test generation
        try {
            slimTableFactoryTest0.checkTableTypeDefinesIgnoredIfDifferentSpecified();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(table7);
        org.junit.Assert.assertNull(table8);
        org.junit.Assert.assertNull(slimTableFactory11);
        org.junit.Assert.assertNull(slimTableFactory12);
    }

    @Test
    public void test08927() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08927");
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
        fitnesse.testsystems.slim.Table table12 = null;
        slimTableFactoryTest0.table = table12;
        // The following exception was thrown during execution in test generation
        try {
            slimTableFactoryTest0.checkTableTypeDefineUsedForTable();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(slimTableFactory5);
        org.junit.Assert.assertNull(slimTableFactory6);
        org.junit.Assert.assertNull(strMap11);
    }

    @Test
    public void test08928() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08928");
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
        fitnesse.testsystems.slim.Table table11 = slimTableFactoryTest0.table;
        fitnesse.testsystems.slim.Table table12 = null;
        slimTableFactoryTest0.settable(table12);
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory14 = slimTableFactoryTest0.getslimTableFactory();
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
        org.junit.Assert.assertNull(table11);
        org.junit.Assert.assertNull(slimTableFactory14);
    }

    @Test
    public void test08929() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08929");
        fitnesse.testsystems.slim.tables.SlimTableFactoryTest slimTableFactoryTest0 = new fitnesse.testsystems.slim.tables.SlimTableFactoryTest();
        fitnesse.testsystems.slim.Table table1 = slimTableFactoryTest0.table;
        java.util.Map<java.lang.String, java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable>> strMap2 = slimTableFactoryTest0.getmap();
        java.util.Map<java.lang.String, java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable>> strMap3 = slimTableFactoryTest0.getmap();
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory4 = slimTableFactoryTest0.slimTableFactory;
        fitnesse.testsystems.slim.Table table5 = null;
        slimTableFactoryTest0.table = table5;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory7 = slimTableFactoryTest0.slimTableFactory;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory8 = null;
        slimTableFactoryTest0.setslimTableFactory(slimTableFactory8);
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory10 = slimTableFactoryTest0.getslimTableFactory();
        org.junit.Assert.assertNull(table1);
        org.junit.Assert.assertNull(strMap2);
        org.junit.Assert.assertNull(strMap3);
        org.junit.Assert.assertNull(slimTableFactory4);
        org.junit.Assert.assertNull(slimTableFactory7);
        org.junit.Assert.assertNull(slimTableFactory10);
    }

    @Test
    public void test08930() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08930");
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
        fitnesse.testsystems.slim.Table table17 = slimTableFactoryTest0.table;
        fitnesse.testsystems.slim.Table table18 = null;
        slimTableFactoryTest0.settable(table18);
        java.util.Map<java.lang.String, java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable>> strMap20 = slimTableFactoryTest0.getmap();
        java.util.Map<java.lang.String, java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable>> strMap21 = slimTableFactoryTest0.map;
        fitnesse.testsystems.slim.Table table22 = slimTableFactoryTest0.table;
        fitnesse.testsystems.slim.Table table23 = null;
        slimTableFactoryTest0.table = table23;
        org.junit.Assert.assertNull(slimTableFactory7);
        org.junit.Assert.assertNull(table12);
        org.junit.Assert.assertNull(strMap15);
        org.junit.Assert.assertNull(slimTableFactory16);
        org.junit.Assert.assertNull(table17);
        org.junit.Assert.assertNull(strMap20);
        org.junit.Assert.assertNull(strMap21);
        org.junit.Assert.assertNull(table22);
    }

    @Test
    public void test08931() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08931");
        fitnesse.testsystems.slim.tables.SlimTableFactoryTest slimTableFactoryTest0 = new fitnesse.testsystems.slim.tables.SlimTableFactoryTest();
        fitnesse.testsystems.slim.Table table1 = slimTableFactoryTest0.table;
        java.util.Map<java.lang.String, java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable>> strMap2 = slimTableFactoryTest0.getmap();
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory3 = slimTableFactoryTest0.slimTableFactory;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory4 = slimTableFactoryTest0.getslimTableFactory();
        fitnesse.testsystems.slim.Table table5 = null;
        slimTableFactoryTest0.settable(table5);
        java.util.Map<java.lang.String, java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable>> strMap7 = slimTableFactoryTest0.map;
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
    public void test08932() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08932");
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
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass11 = table10.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(table3);
        org.junit.Assert.assertNull(slimTableFactory4);
        org.junit.Assert.assertNull(table7);
        org.junit.Assert.assertNull(table10);
    }

    @Test
    public void test08933() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08933");
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
        fitnesse.testsystems.slim.Table table10 = slimTableFactoryTest0.gettable();
        fitnesse.testsystems.slim.Table table11 = null;
        slimTableFactoryTest0.table = table11;
        java.lang.Class<?> wildcardClass13 = slimTableFactoryTest0.getClass();
        org.junit.Assert.assertNull(slimTableFactory1);
        org.junit.Assert.assertNull(slimTableFactory2);
        org.junit.Assert.assertNull(slimTableFactory5);
        org.junit.Assert.assertNull(slimTableFactory8);
        org.junit.Assert.assertNull(slimTableFactory9);
        org.junit.Assert.assertNull(table10);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test08934() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08934");
        fitnesse.testsystems.slim.tables.SlimTableFactoryTest slimTableFactoryTest0 = new fitnesse.testsystems.slim.tables.SlimTableFactoryTest();
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory1 = slimTableFactoryTest0.slimTableFactory;
        fitnesse.testsystems.slim.Table table2 = slimTableFactoryTest0.table;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory3 = null;
        slimTableFactoryTest0.setslimTableFactory(slimTableFactory3);
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory5 = null;
        slimTableFactoryTest0.slimTableFactory = slimTableFactory5;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory7 = slimTableFactoryTest0.getslimTableFactory();
        java.util.Map<java.lang.String, java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable>> strMap8 = slimTableFactoryTest0.getmap();
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory9 = null;
        slimTableFactoryTest0.slimTableFactory = slimTableFactory9;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory11 = null;
        slimTableFactoryTest0.setslimTableFactory(slimTableFactory11);
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory13 = null;
        slimTableFactoryTest0.slimTableFactory = slimTableFactory13;
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
    }

    @Test
    public void test08935() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08935");
        fitnesse.testsystems.slim.tables.SlimTableFactoryTest slimTableFactoryTest0 = new fitnesse.testsystems.slim.tables.SlimTableFactoryTest();
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory1 = slimTableFactoryTest0.slimTableFactory;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory2 = slimTableFactoryTest0.slimTableFactory;
        fitnesse.testsystems.slim.Table table3 = slimTableFactoryTest0.gettable();
        fitnesse.testsystems.slim.Table table4 = null;
        slimTableFactoryTest0.settable(table4);
        fitnesse.testsystems.slim.Table table6 = slimTableFactoryTest0.table;
        fitnesse.testsystems.slim.Table table7 = slimTableFactoryTest0.gettable();
        org.junit.Assert.assertNull(slimTableFactory1);
        org.junit.Assert.assertNull(slimTableFactory2);
        org.junit.Assert.assertNull(table3);
        org.junit.Assert.assertNull(table6);
        org.junit.Assert.assertNull(table7);
    }

    @Test
    public void test08936() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08936");
        fitnesse.testsystems.slim.tables.SlimTableFactoryTest slimTableFactoryTest0 = new fitnesse.testsystems.slim.tables.SlimTableFactoryTest();
        fitnesse.testsystems.slim.Table table1 = null;
        slimTableFactoryTest0.table = table1;
        fitnesse.testsystems.slim.Table table3 = null;
        slimTableFactoryTest0.settable(table3);
        java.util.Map<java.lang.String, java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable>> strMap5 = slimTableFactoryTest0.getmap();
        java.util.Map<java.lang.String, java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable>> strMap6 = slimTableFactoryTest0.map;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass7 = strMap6.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(strMap5);
        org.junit.Assert.assertNull(strMap6);
    }

    @Test
    public void test08937() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08937");
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
        java.util.Map<java.lang.String, java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable>> strMap10 = slimTableFactoryTest0.map;
        fitnesse.testsystems.slim.Table table11 = slimTableFactoryTest0.table;
        java.util.Map<java.lang.String, java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable>> strMap12 = slimTableFactoryTest0.getmap();
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
        org.junit.Assert.assertNull(slimTableFactory8);
        org.junit.Assert.assertNull(slimTableFactory9);
        org.junit.Assert.assertNull(strMap10);
        org.junit.Assert.assertNull(table11);
        org.junit.Assert.assertNull(strMap12);
    }

    @Test
    public void test08938() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08938");
        fitnesse.testsystems.slim.tables.SlimTableFactoryTest slimTableFactoryTest0 = new fitnesse.testsystems.slim.tables.SlimTableFactoryTest();
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory1 = slimTableFactoryTest0.slimTableFactory;
        fitnesse.testsystems.slim.Table table2 = slimTableFactoryTest0.gettable();
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory3 = null;
        slimTableFactoryTest0.slimTableFactory = slimTableFactory3;
        fitnesse.testsystems.slim.Table table5 = null;
        slimTableFactoryTest0.settable(table5);
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory7 = slimTableFactoryTest0.getslimTableFactory();
        fitnesse.testsystems.slim.Table table8 = slimTableFactoryTest0.gettable();
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
        org.junit.Assert.assertNull(table8);
    }

    @Test
    public void test08939() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08939");
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
        fitnesse.testsystems.slim.Table table15 = slimTableFactoryTest0.table;
        java.util.Map<java.lang.String, java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable>> strMap16 = slimTableFactoryTest0.getmap();
        org.junit.Assert.assertNull(strMap5);
        org.junit.Assert.assertNull(slimTableFactory10);
        org.junit.Assert.assertNull(slimTableFactory11);
        org.junit.Assert.assertNull(slimTableFactory12);
        org.junit.Assert.assertNull(table15);
        org.junit.Assert.assertNull(strMap16);
    }

    @Test
    public void test08940() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08940");
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
            slimTableFactoryTest0.shouldCreateCorrectSlimTableForTablesType();
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
    public void test08941() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08941");
        fitnesse.testsystems.slim.tables.SlimTableFactoryTest slimTableFactoryTest0 = new fitnesse.testsystems.slim.tables.SlimTableFactoryTest();
        fitnesse.testsystems.slim.Table table1 = null;
        slimTableFactoryTest0.table = table1;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory3 = null;
        slimTableFactoryTest0.setslimTableFactory(slimTableFactory3);
        fitnesse.testsystems.slim.Table table5 = null;
        slimTableFactoryTest0.settable(table5);
        java.util.Map<java.lang.String, java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable>> strMap7 = slimTableFactoryTest0.getmap();
        fitnesse.testsystems.slim.Table table8 = slimTableFactoryTest0.table;
        // The following exception was thrown during execution in test generation
        try {
            slimTableFactoryTest0.checkTableTypeDefineUsedForTable();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(strMap7);
        org.junit.Assert.assertNull(table8);
    }

    @Test
    public void test08942() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08942");
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
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory17 = slimTableFactoryTest0.slimTableFactory;
        java.util.Map<java.lang.String, java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable>> strMap18 = slimTableFactoryTest0.getmap();
        // The following exception was thrown during execution in test generation
        try {
            slimTableFactoryTest0.commentTableShouldReturnNull();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(slimTableFactory3);
        org.junit.Assert.assertNull(strMap4);
        org.junit.Assert.assertNull(slimTableFactory17);
        org.junit.Assert.assertNull(strMap18);
    }

    @Test
    public void test08943() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08943");
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
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory16 = null;
        slimTableFactoryTest0.setslimTableFactory(slimTableFactory16);
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
        org.junit.Assert.assertNull(table10);
        org.junit.Assert.assertNull(strMap11);
    }

    @Test
    public void test08944() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08944");
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
            slimTableFactoryTest0.addTableTypeImport("", "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(slimTableFactory1);
        org.junit.Assert.assertNull(slimTableFactory2);
        org.junit.Assert.assertNull(slimTableFactory3);
    }

    @Test
    public void test08945() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08945");
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
        java.util.Map<java.lang.String, java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable>> strMap16 = slimTableFactoryTest0.map;
        fitnesse.testsystems.slim.Table table17 = null;
        slimTableFactoryTest0.table = table17;
        fitnesse.testsystems.slim.Table table19 = null;
        slimTableFactoryTest0.table = table19;
        org.junit.Assert.assertNull(table7);
        org.junit.Assert.assertNull(strMap10);
        org.junit.Assert.assertNull(table13);
        org.junit.Assert.assertNull(strMap16);
    }

    @Test
    public void test08946() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08946");
        fitnesse.testsystems.slim.tables.SlimTableFactoryTest slimTableFactoryTest0 = new fitnesse.testsystems.slim.tables.SlimTableFactoryTest();
        fitnesse.testsystems.slim.Table table1 = null;
        slimTableFactoryTest0.table = table1;
        fitnesse.testsystems.slim.Table table3 = null;
        slimTableFactoryTest0.settable(table3);
        fitnesse.testsystems.slim.Table table5 = null;
        slimTableFactoryTest0.settable(table5);
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory7 = slimTableFactoryTest0.slimTableFactory;
        java.util.Map<java.lang.String, java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable>> strMap8 = slimTableFactoryTest0.map;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory9 = slimTableFactoryTest0.getslimTableFactory();
        java.util.Map<java.lang.String, java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable>> strMap10 = slimTableFactoryTest0.getmap();
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory11 = slimTableFactoryTest0.slimTableFactory;
        fitnesse.testsystems.slim.Table table12 = slimTableFactoryTest0.table;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory13 = slimTableFactoryTest0.getslimTableFactory();
        fitnesse.testsystems.slim.Table table14 = slimTableFactoryTest0.table;
        // The following exception was thrown during execution in test generation
        try {
            slimTableFactoryTest0.shouldCreateCorrectSlimTableForTablesType();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(slimTableFactory7);
        org.junit.Assert.assertNull(strMap8);
        org.junit.Assert.assertNull(slimTableFactory9);
        org.junit.Assert.assertNull(strMap10);
        org.junit.Assert.assertNull(slimTableFactory11);
        org.junit.Assert.assertNull(table12);
        org.junit.Assert.assertNull(slimTableFactory13);
        org.junit.Assert.assertNull(table14);
    }

    @Test
    public void test08947() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08947");
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
        org.junit.Assert.assertNull(table9);
        org.junit.Assert.assertNull(slimTableFactory12);
        org.junit.Assert.assertNull(strMap15);
        org.junit.Assert.assertNull(table16);
    }

    @Test
    public void test08948() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08948");
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
        fitnesse.testsystems.slim.Table table14 = slimTableFactoryTest0.table;
        java.lang.Class<?> wildcardClass15 = slimTableFactoryTest0.getClass();
        org.junit.Assert.assertNull(slimTableFactory7);
        org.junit.Assert.assertNull(slimTableFactory8);
        org.junit.Assert.assertNull(strMap9);
        org.junit.Assert.assertNull(slimTableFactory12);
        org.junit.Assert.assertNull(slimTableFactory13);
        org.junit.Assert.assertNull(table14);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test08949() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08949");
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
        slimTableFactoryTest0.table = table13;
        java.util.Map<java.lang.String, java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable>> strMap15 = slimTableFactoryTest0.map;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory16 = null;
        slimTableFactoryTest0.slimTableFactory = slimTableFactory16;
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
        org.junit.Assert.assertNull(strMap15);
    }

    @Test
    public void test08950() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08950");
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
        fitnesse.testsystems.slim.Table table16 = null;
        slimTableFactoryTest0.table = table16;
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
    }

    @Test
    public void test08951() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08951");
        fitnesse.testsystems.slim.tables.SlimTableFactoryTest slimTableFactoryTest0 = new fitnesse.testsystems.slim.tables.SlimTableFactoryTest();
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory1 = slimTableFactoryTest0.slimTableFactory;
        fitnesse.testsystems.slim.Table table2 = slimTableFactoryTest0.table;
        java.util.Map<java.lang.String, java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable>> strMap3 = slimTableFactoryTest0.map;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory4 = null;
        slimTableFactoryTest0.slimTableFactory = slimTableFactory4;
        fitnesse.testsystems.slim.Table table6 = null;
        slimTableFactoryTest0.settable(table6);
        fitnesse.testsystems.slim.Table table8 = null;
        slimTableFactoryTest0.settable(table8);
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory10 = slimTableFactoryTest0.slimTableFactory;
        org.junit.Assert.assertNull(slimTableFactory1);
        org.junit.Assert.assertNull(table2);
        org.junit.Assert.assertNull(strMap3);
        org.junit.Assert.assertNull(slimTableFactory10);
    }

    @Test
    public void test08952() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08952");
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
    public void test08953() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08953");
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
        fitnesse.testsystems.slim.Table table10 = slimTableFactoryTest0.table;
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
        org.junit.Assert.assertNull(table10);
    }

    @Test
    public void test08954() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08954");
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
        java.util.Map<java.lang.String, java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable>> strMap11 = slimTableFactoryTest0.map;
        java.util.Map<java.lang.String, java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable>> strMap12 = slimTableFactoryTest0.map;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory13 = slimTableFactoryTest0.slimTableFactory;
        java.lang.Class<?> wildcardClass14 = slimTableFactoryTest0.getClass();
        org.junit.Assert.assertNull(table7);
        org.junit.Assert.assertNull(strMap8);
        org.junit.Assert.assertNull(strMap9);
        org.junit.Assert.assertNull(table10);
        org.junit.Assert.assertNull(strMap11);
        org.junit.Assert.assertNull(strMap12);
        org.junit.Assert.assertNull(slimTableFactory13);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test08955() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08955");
        fitnesse.testsystems.slim.tables.SlimTableFactoryTest slimTableFactoryTest0 = new fitnesse.testsystems.slim.tables.SlimTableFactoryTest();
        fitnesse.testsystems.slim.Table table1 = null;
        slimTableFactoryTest0.table = table1;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory3 = slimTableFactoryTest0.slimTableFactory;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory4 = null;
        slimTableFactoryTest0.slimTableFactory = slimTableFactory4;
        fitnesse.testsystems.slim.Table table6 = null;
        slimTableFactoryTest0.settable(table6);
        fitnesse.testsystems.slim.Table table8 = null;
        slimTableFactoryTest0.table = table8;
        fitnesse.testsystems.slim.Table table10 = null;
        slimTableFactoryTest0.table = table10;
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
    public void test08956() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08956");
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
        slimTableFactoryTest0.slimTableFactory = slimTableFactory15;
        // The following exception was thrown during execution in test generation
        try {
            slimTableFactoryTest0.addTableTypeImport("hi!", "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(slimTableFactory9);
        org.junit.Assert.assertNull(slimTableFactory12);
        org.junit.Assert.assertNull(table13);
        org.junit.Assert.assertNull(slimTableFactory14);
    }

    @Test
    public void test08957() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08957");
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
        fitnesse.testsystems.slim.Table table17 = slimTableFactoryTest0.table;
        fitnesse.testsystems.slim.Table table18 = slimTableFactoryTest0.table;
        // The following exception was thrown during execution in test generation
        try {
            slimTableFactoryTest0.checkTableTypeDefinesIgnoredIfDifferentSpecified();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(table7);
        org.junit.Assert.assertNull(strMap12);
        org.junit.Assert.assertNull(slimTableFactory13);
        org.junit.Assert.assertNull(table16);
        org.junit.Assert.assertNull(table17);
        org.junit.Assert.assertNull(table18);
    }

    @Test
    public void test08958() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08958");
        fitnesse.testsystems.slim.tables.SlimTableFactoryTest slimTableFactoryTest0 = new fitnesse.testsystems.slim.tables.SlimTableFactoryTest();
        fitnesse.testsystems.slim.Table table1 = null;
        slimTableFactoryTest0.table = table1;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory3 = slimTableFactoryTest0.slimTableFactory;
        java.util.Map<java.lang.String, java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable>> strMap4 = slimTableFactoryTest0.getmap();
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory5 = null;
        slimTableFactoryTest0.setslimTableFactory(slimTableFactory5);
        fitnesse.testsystems.slim.Table table7 = null;
        slimTableFactoryTest0.table = table7;
        java.util.Map<java.lang.String, java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable>> strMap9 = slimTableFactoryTest0.getmap();
        fitnesse.testsystems.slim.Table table10 = null;
        slimTableFactoryTest0.settable(table10);
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
    public void test08959() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08959");
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
        fitnesse.testsystems.slim.Table table12 = slimTableFactoryTest0.gettable();
        fitnesse.testsystems.slim.Table table13 = slimTableFactoryTest0.gettable();
        org.junit.Assert.assertNull(slimTableFactory7);
        org.junit.Assert.assertNull(slimTableFactory8);
        org.junit.Assert.assertNull(table9);
        org.junit.Assert.assertNull(strMap10);
        org.junit.Assert.assertNull(strMap11);
        org.junit.Assert.assertNull(table12);
        org.junit.Assert.assertNull(table13);
    }

    @Test
    public void test08960() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08960");
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
        fitnesse.testsystems.slim.Table table17 = null;
        slimTableFactoryTest0.table = table17;
        org.junit.Assert.assertNull(slimTableFactory5);
        org.junit.Assert.assertNull(slimTableFactory8);
        org.junit.Assert.assertNull(table9);
        org.junit.Assert.assertNull(strMap12);
        org.junit.Assert.assertNull(strMap15);
        org.junit.Assert.assertNull(table16);
    }

    @Test
    public void test08961() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08961");
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
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory14 = slimTableFactoryTest0.getslimTableFactory();
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
        org.junit.Assert.assertNull(table10);
        org.junit.Assert.assertNull(table11);
        org.junit.Assert.assertNull(slimTableFactory14);
    }

    @Test
    public void test08962() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08962");
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
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory16 = slimTableFactoryTest0.slimTableFactory;
        org.junit.Assert.assertNull(slimTableFactory3);
        org.junit.Assert.assertNull(strMap4);
        org.junit.Assert.assertNull(table13);
        org.junit.Assert.assertNull(slimTableFactory14);
        org.junit.Assert.assertNull(slimTableFactory15);
        org.junit.Assert.assertNull(slimTableFactory16);
    }

    @Test
    public void test08963() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08963");
        fitnesse.testsystems.slim.tables.SlimTableFactoryTest slimTableFactoryTest0 = new fitnesse.testsystems.slim.tables.SlimTableFactoryTest();
        java.util.Map<java.lang.String, java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable>> strMap1 = slimTableFactoryTest0.getmap();
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory2 = null;
        slimTableFactoryTest0.setslimTableFactory(slimTableFactory2);
        fitnesse.testsystems.slim.Table table4 = slimTableFactoryTest0.gettable();
        fitnesse.testsystems.slim.Table table5 = null;
        slimTableFactoryTest0.settable(table5);
        java.lang.Class<?> wildcardClass7 = slimTableFactoryTest0.getClass();
        org.junit.Assert.assertNull(strMap1);
        org.junit.Assert.assertNull(table4);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test08964() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08964");
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
        fitnesse.testsystems.slim.Table table14 = slimTableFactoryTest0.table;
        java.util.Map<java.lang.String, java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable>> strMap15 = slimTableFactoryTest0.map;
        java.util.Map<java.lang.String, java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable>> strMap16 = slimTableFactoryTest0.map;
        fitnesse.testsystems.slim.Table table17 = null;
        slimTableFactoryTest0.settable(table17);
        fitnesse.testsystems.slim.Table table19 = null;
        slimTableFactoryTest0.settable(table19);
        org.junit.Assert.assertNull(strMap5);
        org.junit.Assert.assertNull(slimTableFactory6);
        org.junit.Assert.assertNull(slimTableFactory7);
        org.junit.Assert.assertNull(strMap8);
        org.junit.Assert.assertNull(strMap9);
        org.junit.Assert.assertNull(table10);
        org.junit.Assert.assertNull(table13);
        org.junit.Assert.assertNull(table14);
        org.junit.Assert.assertNull(strMap15);
        org.junit.Assert.assertNull(strMap16);
    }

    @Test
    public void test08965() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08965");
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
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory16 = slimTableFactoryTest0.getslimTableFactory();
        java.util.Map<java.lang.String, java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable>> strMap17 = slimTableFactoryTest0.getmap();
        org.junit.Assert.assertNull(slimTableFactory5);
        org.junit.Assert.assertNull(slimTableFactory8);
        org.junit.Assert.assertNull(table9);
        org.junit.Assert.assertNull(slimTableFactory12);
        org.junit.Assert.assertNull(table15);
        org.junit.Assert.assertNull(slimTableFactory16);
        org.junit.Assert.assertNull(strMap17);
    }

    @Test
    public void test08966() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08966");
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
        java.util.Map<java.lang.String, java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable>> strMap11 = slimTableFactoryTest0.getmap();
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory12 = slimTableFactoryTest0.getslimTableFactory();
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory13 = null;
        slimTableFactoryTest0.setslimTableFactory(slimTableFactory13);
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
        org.junit.Assert.assertNull(strMap11);
        org.junit.Assert.assertNull(slimTableFactory12);
    }

    @Test
    public void test08967() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08967");
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
        fitnesse.testsystems.slim.Table table21 = null;
        slimTableFactoryTest0.table = table21;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory23 = slimTableFactoryTest0.getslimTableFactory();
        org.junit.Assert.assertNull(strMap5);
        org.junit.Assert.assertNull(slimTableFactory12);
        org.junit.Assert.assertNull(table17);
        org.junit.Assert.assertNull(table18);
        org.junit.Assert.assertNull(slimTableFactory23);
    }

    @Test
    public void test08968() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08968");
        fitnesse.testsystems.slim.tables.SlimTableFactoryTest slimTableFactoryTest0 = new fitnesse.testsystems.slim.tables.SlimTableFactoryTest();
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory1 = slimTableFactoryTest0.slimTableFactory;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory2 = slimTableFactoryTest0.slimTableFactory;
        fitnesse.testsystems.slim.Table table3 = slimTableFactoryTest0.gettable();
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory4 = slimTableFactoryTest0.getslimTableFactory();
        fitnesse.testsystems.slim.Table table5 = null;
        slimTableFactoryTest0.table = table5;
        java.util.Map<java.lang.String, java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable>> strMap7 = slimTableFactoryTest0.getmap();
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory8 = null;
        slimTableFactoryTest0.slimTableFactory = slimTableFactory8;
        fitnesse.testsystems.slim.Table table10 = slimTableFactoryTest0.gettable();
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
        org.junit.Assert.assertNull(slimTableFactory2);
        org.junit.Assert.assertNull(table3);
        org.junit.Assert.assertNull(slimTableFactory4);
        org.junit.Assert.assertNull(strMap7);
        org.junit.Assert.assertNull(table10);
    }

    @Test
    public void test08969() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08969");
        fitnesse.testsystems.slim.tables.SlimTableFactoryTest slimTableFactoryTest0 = new fitnesse.testsystems.slim.tables.SlimTableFactoryTest();
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory1 = slimTableFactoryTest0.slimTableFactory;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory2 = slimTableFactoryTest0.slimTableFactory;
        fitnesse.testsystems.slim.Table table3 = slimTableFactoryTest0.gettable();
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory4 = slimTableFactoryTest0.getslimTableFactory();
        fitnesse.testsystems.slim.Table table5 = null;
        slimTableFactoryTest0.table = table5;
        java.util.Map<java.lang.String, java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable>> strMap7 = slimTableFactoryTest0.getmap();
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory8 = null;
        slimTableFactoryTest0.slimTableFactory = slimTableFactory8;
        java.util.Map<java.lang.String, java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable>> strMap10 = slimTableFactoryTest0.map;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory11 = slimTableFactoryTest0.getslimTableFactory();
        java.util.Map<java.lang.String, java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable>> strMap12 = slimTableFactoryTest0.getmap();
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
        org.junit.Assert.assertNull(strMap7);
        org.junit.Assert.assertNull(strMap10);
        org.junit.Assert.assertNull(slimTableFactory11);
        org.junit.Assert.assertNull(strMap12);
    }

    @Test
    public void test08970() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08970");
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
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory14 = slimTableFactoryTest0.getslimTableFactory();
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory15 = null;
        slimTableFactoryTest0.setslimTableFactory(slimTableFactory15);
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory17 = null;
        slimTableFactoryTest0.setslimTableFactory(slimTableFactory17);
        fitnesse.testsystems.slim.Table table19 = slimTableFactoryTest0.table;
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
        org.junit.Assert.assertNull(slimTableFactory14);
        org.junit.Assert.assertNull(table19);
    }

    @Test
    public void test08971() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08971");
        fitnesse.testsystems.slim.tables.SlimTableFactoryTest slimTableFactoryTest0 = new fitnesse.testsystems.slim.tables.SlimTableFactoryTest();
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory1 = slimTableFactoryTest0.slimTableFactory;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory2 = slimTableFactoryTest0.slimTableFactory;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory3 = slimTableFactoryTest0.slimTableFactory;
        java.util.Map<java.lang.String, java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable>> strMap4 = slimTableFactoryTest0.map;
        fitnesse.testsystems.slim.Table table5 = null;
        slimTableFactoryTest0.settable(table5);
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory7 = slimTableFactoryTest0.getslimTableFactory();
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory8 = slimTableFactoryTest0.getslimTableFactory();
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory9 = null;
        slimTableFactoryTest0.setslimTableFactory(slimTableFactory9);
        fitnesse.testsystems.slim.Table table11 = slimTableFactoryTest0.table;
        fitnesse.testsystems.slim.Table table12 = slimTableFactoryTest0.gettable();
        fitnesse.testsystems.slim.Table table13 = null;
        slimTableFactoryTest0.table = table13;
        fitnesse.testsystems.slim.Table table15 = slimTableFactoryTest0.gettable();
        fitnesse.testsystems.slim.Table table16 = null;
        slimTableFactoryTest0.table = table16;
        fitnesse.testsystems.slim.Table table18 = slimTableFactoryTest0.gettable();
        org.junit.Assert.assertNull(slimTableFactory1);
        org.junit.Assert.assertNull(slimTableFactory2);
        org.junit.Assert.assertNull(slimTableFactory3);
        org.junit.Assert.assertNull(strMap4);
        org.junit.Assert.assertNull(slimTableFactory7);
        org.junit.Assert.assertNull(slimTableFactory8);
        org.junit.Assert.assertNull(table11);
        org.junit.Assert.assertNull(table12);
        org.junit.Assert.assertNull(table15);
        org.junit.Assert.assertNull(table18);
    }

    @Test
    public void test08972() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08972");
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
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory15 = null;
        slimTableFactoryTest0.slimTableFactory = slimTableFactory15;
        fitnesse.testsystems.slim.Table table17 = slimTableFactoryTest0.gettable();
        org.junit.Assert.assertNull(slimTableFactory1);
        org.junit.Assert.assertNull(table2);
        org.junit.Assert.assertNull(slimTableFactory7);
        org.junit.Assert.assertNull(table10);
        org.junit.Assert.assertNull(table11);
        org.junit.Assert.assertNull(slimTableFactory14);
        org.junit.Assert.assertNull(table17);
    }

    @Test
    public void test08973() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08973");
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
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory14 = null;
        slimTableFactoryTest0.setslimTableFactory(slimTableFactory14);
        java.util.Map<java.lang.String, java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable>> strMap16 = slimTableFactoryTest0.getmap();
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory17 = null;
        slimTableFactoryTest0.setslimTableFactory(slimTableFactory17);
        fitnesse.testsystems.slim.Table table19 = slimTableFactoryTest0.table;
        org.junit.Assert.assertNull(strMap5);
        org.junit.Assert.assertNull(slimTableFactory6);
        org.junit.Assert.assertNull(slimTableFactory7);
        org.junit.Assert.assertNull(table8);
        org.junit.Assert.assertNull(table11);
        org.junit.Assert.assertNull(strMap16);
        org.junit.Assert.assertNull(table19);
    }

    @Test
    public void test08974() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08974");
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
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory11 = slimTableFactoryTest0.slimTableFactory;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory12 = null;
        slimTableFactoryTest0.setslimTableFactory(slimTableFactory12);
        java.util.Map<java.lang.String, java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable>> strMap14 = slimTableFactoryTest0.map;
        fitnesse.testsystems.slim.Table table15 = slimTableFactoryTest0.gettable();
        fitnesse.testsystems.slim.Table table16 = slimTableFactoryTest0.table;
        fitnesse.testsystems.slim.Table table17 = slimTableFactoryTest0.gettable();
        org.junit.Assert.assertNull(slimTableFactory3);
        org.junit.Assert.assertNull(table8);
        org.junit.Assert.assertNull(slimTableFactory11);
        org.junit.Assert.assertNull(strMap14);
        org.junit.Assert.assertNull(table15);
        org.junit.Assert.assertNull(table16);
        org.junit.Assert.assertNull(table17);
    }

    @Test
    public void test08975() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08975");
        fitnesse.testsystems.slim.tables.SlimTableFactoryTest slimTableFactoryTest0 = new fitnesse.testsystems.slim.tables.SlimTableFactoryTest();
        fitnesse.testsystems.slim.Table table1 = null;
        slimTableFactoryTest0.table = table1;
        fitnesse.testsystems.slim.Table table3 = null;
        slimTableFactoryTest0.settable(table3);
        fitnesse.testsystems.slim.Table table5 = null;
        slimTableFactoryTest0.table = table5;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory7 = slimTableFactoryTest0.slimTableFactory;
        java.util.Map<java.lang.String, java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable>> strMap8 = slimTableFactoryTest0.map;
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
    public void test08976() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08976");
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
        slimTableFactoryTest0.table = table10;
        java.util.Map<java.lang.String, java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable>> strMap12 = slimTableFactoryTest0.getmap();
        fitnesse.testsystems.slim.Table table13 = null;
        slimTableFactoryTest0.table = table13;
        // The following exception was thrown during execution in test generation
        try {
            slimTableFactoryTest0.tableTypeStartingWithcommentColonShouldReturnNull();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(slimTableFactory5);
        org.junit.Assert.assertNull(slimTableFactory8);
        org.junit.Assert.assertNull(table9);
        org.junit.Assert.assertNull(strMap12);
    }

    @Test
    public void test08977() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08977");
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
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory15 = slimTableFactoryTest0.slimTableFactory;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory16 = slimTableFactoryTest0.slimTableFactory;
        org.junit.Assert.assertNull(slimTableFactory3);
        org.junit.Assert.assertNull(strMap4);
        org.junit.Assert.assertNull(slimTableFactory11);
        org.junit.Assert.assertNull(slimTableFactory12);
        org.junit.Assert.assertNull(slimTableFactory15);
        org.junit.Assert.assertNull(slimTableFactory16);
    }

    @Test
    public void test08978() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08978");
        fitnesse.testsystems.slim.tables.SlimTableFactoryTest slimTableFactoryTest0 = new fitnesse.testsystems.slim.tables.SlimTableFactoryTest();
        fitnesse.testsystems.slim.Table table1 = slimTableFactoryTest0.table;
        java.util.Map<java.lang.String, java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable>> strMap2 = slimTableFactoryTest0.getmap();
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory3 = slimTableFactoryTest0.slimTableFactory;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory4 = slimTableFactoryTest0.getslimTableFactory();
        java.util.Map<java.lang.String, java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable>> strMap5 = slimTableFactoryTest0.getmap();
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory6 = null;
        slimTableFactoryTest0.slimTableFactory = slimTableFactory6;
        java.util.Map<java.lang.String, java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable>> strMap8 = slimTableFactoryTest0.map;
        fitnesse.testsystems.slim.Table table9 = null;
        slimTableFactoryTest0.settable(table9);
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory11 = null;
        slimTableFactoryTest0.slimTableFactory = slimTableFactory11;
        fitnesse.testsystems.slim.Table table13 = null;
        slimTableFactoryTest0.settable(table13);
        fitnesse.testsystems.slim.Table table15 = slimTableFactoryTest0.table;
        fitnesse.testsystems.slim.Table table16 = null;
        slimTableFactoryTest0.table = table16;
        java.util.Map<java.lang.String, java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable>> strMap18 = slimTableFactoryTest0.getmap();
        org.junit.Assert.assertNull(table1);
        org.junit.Assert.assertNull(strMap2);
        org.junit.Assert.assertNull(slimTableFactory3);
        org.junit.Assert.assertNull(slimTableFactory4);
        org.junit.Assert.assertNull(strMap5);
        org.junit.Assert.assertNull(strMap8);
        org.junit.Assert.assertNull(table15);
        org.junit.Assert.assertNull(strMap18);
    }

    @Test
    public void test08979() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08979");
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
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory10 = slimTableFactoryTest0.slimTableFactory;
        java.util.Map<java.lang.String, java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable>> strMap11 = slimTableFactoryTest0.map;
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
        org.junit.Assert.assertNull(slimTableFactory10);
        org.junit.Assert.assertNull(strMap11);
    }

    @Test
    public void test08980() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08980");
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
        fitnesse.testsystems.slim.Table table19 = null;
        slimTableFactoryTest0.table = table19;
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
        org.junit.Assert.assertNull(slimTableFactory14);
    }

    @Test
    public void test08981() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08981");
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
        fitnesse.testsystems.slim.Table table15 = slimTableFactoryTest0.gettable();
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
        org.junit.Assert.assertNull(table15);
    }

    @Test
    public void test08982() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08982");
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
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory11 = slimTableFactoryTest0.getslimTableFactory();
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory12 = null;
        slimTableFactoryTest0.setslimTableFactory(slimTableFactory12);
        org.junit.Assert.assertNull(slimTableFactory5);
        org.junit.Assert.assertNull(slimTableFactory6);
        org.junit.Assert.assertNull(slimTableFactory11);
    }

    @Test
    public void test08983() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08983");
        fitnesse.testsystems.slim.tables.SlimTableFactoryTest slimTableFactoryTest0 = new fitnesse.testsystems.slim.tables.SlimTableFactoryTest();
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory1 = slimTableFactoryTest0.slimTableFactory;
        fitnesse.testsystems.slim.Table table2 = slimTableFactoryTest0.table;
        java.util.Map<java.lang.String, java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable>> strMap3 = slimTableFactoryTest0.map;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory4 = null;
        slimTableFactoryTest0.slimTableFactory = slimTableFactory4;
        fitnesse.testsystems.slim.Table table6 = null;
        slimTableFactoryTest0.settable(table6);
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory8 = null;
        slimTableFactoryTest0.slimTableFactory = slimTableFactory8;
        fitnesse.testsystems.slim.Table table10 = null;
        slimTableFactoryTest0.settable(table10);
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory12 = null;
        slimTableFactoryTest0.setslimTableFactory(slimTableFactory12);
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
    public void test08984() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08984");
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
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory11 = slimTableFactoryTest0.slimTableFactory;
        fitnesse.testsystems.slim.Table table12 = slimTableFactoryTest0.gettable();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass13 = table12.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(slimTableFactory1);
        org.junit.Assert.assertNull(table2);
        org.junit.Assert.assertNull(slimTableFactory7);
        org.junit.Assert.assertNull(slimTableFactory10);
        org.junit.Assert.assertNull(slimTableFactory11);
        org.junit.Assert.assertNull(table12);
    }

    @Test
    public void test08985() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08985");
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
            slimTableFactoryTest0.addTableTypeImport("", "");
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
    public void test08986() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08986");
        fitnesse.testsystems.slim.tables.SlimTableFactoryTest slimTableFactoryTest0 = new fitnesse.testsystems.slim.tables.SlimTableFactoryTest();
        fitnesse.testsystems.slim.Table table1 = null;
        slimTableFactoryTest0.table = table1;
        fitnesse.testsystems.slim.Table table3 = null;
        slimTableFactoryTest0.settable(table3);
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory5 = null;
        slimTableFactoryTest0.slimTableFactory = slimTableFactory5;
        java.util.Map<java.lang.String, java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable>> strMap7 = slimTableFactoryTest0.map;
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
    public void test08987() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08987");
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
        fitnesse.testsystems.slim.Table table17 = null;
        slimTableFactoryTest0.settable(table17);
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
        org.junit.Assert.assertNull(table8);
        org.junit.Assert.assertNull(table13);
        org.junit.Assert.assertNull(slimTableFactory14);
        org.junit.Assert.assertNull(strMap15);
        org.junit.Assert.assertNull(slimTableFactory16);
    }

    @Test
    public void test08988() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08988");
        fitnesse.testsystems.slim.tables.SlimTableFactoryTest slimTableFactoryTest0 = new fitnesse.testsystems.slim.tables.SlimTableFactoryTest();
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory1 = slimTableFactoryTest0.getslimTableFactory();
        java.util.Map<java.lang.String, java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable>> strMap2 = slimTableFactoryTest0.getmap();
        fitnesse.testsystems.slim.Table table3 = slimTableFactoryTest0.table;
        org.junit.Assert.assertNull(slimTableFactory1);
        org.junit.Assert.assertNull(strMap2);
        org.junit.Assert.assertNull(table3);
    }

    @Test
    public void test08989() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08989");
        fitnesse.testsystems.slim.tables.SlimTableFactoryTest slimTableFactoryTest0 = new fitnesse.testsystems.slim.tables.SlimTableFactoryTest();
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory1 = slimTableFactoryTest0.slimTableFactory;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory2 = slimTableFactoryTest0.slimTableFactory;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory3 = null;
        slimTableFactoryTest0.slimTableFactory = slimTableFactory3;
        java.util.Map<java.lang.String, java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable>> strMap5 = slimTableFactoryTest0.getmap();
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory6 = null;
        slimTableFactoryTest0.slimTableFactory = slimTableFactory6;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory8 = slimTableFactoryTest0.getslimTableFactory();
        java.util.Map<java.lang.String, java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable>> strMap9 = slimTableFactoryTest0.map;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory10 = slimTableFactoryTest0.getslimTableFactory();
        org.junit.Assert.assertNull(slimTableFactory1);
        org.junit.Assert.assertNull(slimTableFactory2);
        org.junit.Assert.assertNull(strMap5);
        org.junit.Assert.assertNull(slimTableFactory8);
        org.junit.Assert.assertNull(strMap9);
        org.junit.Assert.assertNull(slimTableFactory10);
    }

    @Test
    public void test08990() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08990");
        fitnesse.testsystems.slim.tables.SlimTableFactoryTest slimTableFactoryTest0 = new fitnesse.testsystems.slim.tables.SlimTableFactoryTest();
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory1 = slimTableFactoryTest0.slimTableFactory;
        fitnesse.testsystems.slim.Table table2 = slimTableFactoryTest0.gettable();
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory3 = null;
        slimTableFactoryTest0.slimTableFactory = slimTableFactory3;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory5 = null;
        slimTableFactoryTest0.slimTableFactory = slimTableFactory5;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory7 = slimTableFactoryTest0.slimTableFactory;
        java.util.Map<java.lang.String, java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable>> strMap8 = slimTableFactoryTest0.map;
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
        org.junit.Assert.assertNull(slimTableFactory1);
        org.junit.Assert.assertNull(table2);
        org.junit.Assert.assertNull(slimTableFactory7);
        org.junit.Assert.assertNull(strMap8);
        org.junit.Assert.assertNull(slimTableFactory11);
    }

    @Test
    public void test08991() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08991");
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
        fitnesse.testsystems.slim.Table table13 = null;
        slimTableFactoryTest0.settable(table13);
        // The following exception was thrown during execution in test generation
        try {
            slimTableFactoryTest0.addTableTypeImport("", "");
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
    public void test08992() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08992");
        fitnesse.testsystems.slim.tables.SlimTableFactoryTest slimTableFactoryTest0 = new fitnesse.testsystems.slim.tables.SlimTableFactoryTest();
        fitnesse.testsystems.slim.Table table1 = null;
        slimTableFactoryTest0.table = table1;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory3 = slimTableFactoryTest0.slimTableFactory;
        java.util.Map<java.lang.String, java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable>> strMap4 = slimTableFactoryTest0.map;
        fitnesse.testsystems.slim.Table table5 = slimTableFactoryTest0.table;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory6 = null;
        slimTableFactoryTest0.setslimTableFactory(slimTableFactory6);
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory8 = slimTableFactoryTest0.slimTableFactory;
        fitnesse.testsystems.slim.Table table9 = null;
        slimTableFactoryTest0.table = table9;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory11 = slimTableFactoryTest0.slimTableFactory;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory12 = slimTableFactoryTest0.slimTableFactory;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory13 = slimTableFactoryTest0.getslimTableFactory();
        org.junit.Assert.assertNull(slimTableFactory3);
        org.junit.Assert.assertNull(strMap4);
        org.junit.Assert.assertNull(table5);
        org.junit.Assert.assertNull(slimTableFactory8);
        org.junit.Assert.assertNull(slimTableFactory11);
        org.junit.Assert.assertNull(slimTableFactory12);
        org.junit.Assert.assertNull(slimTableFactory13);
    }

    @Test
    public void test08993() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08993");
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
        fitnesse.testsystems.slim.Table table11 = null;
        slimTableFactoryTest0.settable(table11);
        fitnesse.testsystems.slim.Table table13 = slimTableFactoryTest0.gettable();
        fitnesse.testsystems.slim.Table table14 = slimTableFactoryTest0.table;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory15 = null;
        slimTableFactoryTest0.slimTableFactory = slimTableFactory15;
        java.util.Map<java.lang.String, java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable>> strMap17 = slimTableFactoryTest0.getmap();
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory18 = null;
        slimTableFactoryTest0.setslimTableFactory(slimTableFactory18);
        org.junit.Assert.assertNull(slimTableFactory3);
        org.junit.Assert.assertNull(strMap4);
        org.junit.Assert.assertNull(slimTableFactory5);
        org.junit.Assert.assertNull(slimTableFactory6);
        org.junit.Assert.assertNull(table13);
        org.junit.Assert.assertNull(table14);
        org.junit.Assert.assertNull(strMap17);
    }

    @Test
    public void test08994() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08994");
        fitnesse.testsystems.slim.tables.SlimTableFactoryTest slimTableFactoryTest0 = new fitnesse.testsystems.slim.tables.SlimTableFactoryTest();
        fitnesse.testsystems.slim.Table table1 = null;
        slimTableFactoryTest0.table = table1;
        fitnesse.testsystems.slim.Table table3 = slimTableFactoryTest0.table;
        fitnesse.testsystems.slim.Table table4 = slimTableFactoryTest0.gettable();
        java.util.Map<java.lang.String, java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable>> strMap5 = slimTableFactoryTest0.getmap();
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory6 = slimTableFactoryTest0.getslimTableFactory();
        java.util.Map<java.lang.String, java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable>> strMap7 = slimTableFactoryTest0.map;
        fitnesse.testsystems.slim.Table table8 = slimTableFactoryTest0.gettable();
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory9 = null;
        slimTableFactoryTest0.setslimTableFactory(slimTableFactory9);
        java.lang.Class<?> wildcardClass11 = slimTableFactoryTest0.getClass();
        org.junit.Assert.assertNull(table3);
        org.junit.Assert.assertNull(table4);
        org.junit.Assert.assertNull(strMap5);
        org.junit.Assert.assertNull(slimTableFactory6);
        org.junit.Assert.assertNull(strMap7);
        org.junit.Assert.assertNull(table8);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test08995() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08995");
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
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory15 = null;
        slimTableFactoryTest0.setslimTableFactory(slimTableFactory15);
        fitnesse.testsystems.slim.Table table17 = slimTableFactoryTest0.table;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory18 = slimTableFactoryTest0.slimTableFactory;
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
        org.junit.Assert.assertNull(table14);
        org.junit.Assert.assertNull(table17);
        org.junit.Assert.assertNull(slimTableFactory18);
    }

    @Test
    public void test08996() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08996");
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
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory11 = slimTableFactoryTest0.getslimTableFactory();
        fitnesse.testsystems.slim.Table table12 = null;
        slimTableFactoryTest0.table = table12;
        java.util.Map<java.lang.String, java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable>> strMap14 = slimTableFactoryTest0.map;
        fitnesse.testsystems.slim.Table table15 = slimTableFactoryTest0.gettable();
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory16 = null;
        slimTableFactoryTest0.setslimTableFactory(slimTableFactory16);
        fitnesse.testsystems.slim.Table table18 = slimTableFactoryTest0.table;
        java.util.Map<java.lang.String, java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable>> strMap19 = slimTableFactoryTest0.getmap();
        java.util.Map<java.lang.String, java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable>> strMap20 = slimTableFactoryTest0.getmap();
        org.junit.Assert.assertNull(slimTableFactory3);
        org.junit.Assert.assertNull(strMap4);
        org.junit.Assert.assertNull(slimTableFactory5);
        org.junit.Assert.assertNull(slimTableFactory6);
        org.junit.Assert.assertNull(slimTableFactory9);
        org.junit.Assert.assertNull(table10);
        org.junit.Assert.assertNull(slimTableFactory11);
        org.junit.Assert.assertNull(strMap14);
        org.junit.Assert.assertNull(table15);
        org.junit.Assert.assertNull(table18);
        org.junit.Assert.assertNull(strMap19);
        org.junit.Assert.assertNull(strMap20);
    }

    @Test
    public void test08997() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08997");
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
        slimTableFactoryTest0.setslimTableFactory(slimTableFactory11);
        fitnesse.testsystems.slim.Table table13 = null;
        slimTableFactoryTest0.settable(table13);
        fitnesse.testsystems.slim.Table table15 = null;
        slimTableFactoryTest0.settable(table15);
        java.util.Map<java.lang.String, java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable>> strMap17 = slimTableFactoryTest0.map;
        java.util.Map<java.lang.String, java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable>> strMap18 = slimTableFactoryTest0.getmap();
        org.junit.Assert.assertNull(strMap5);
        org.junit.Assert.assertNull(slimTableFactory6);
        org.junit.Assert.assertNull(slimTableFactory7);
        org.junit.Assert.assertNull(table8);
        org.junit.Assert.assertNull(strMap17);
        org.junit.Assert.assertNull(strMap18);
    }

    @Test
    public void test08998() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08998");
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
        fitnesse.testsystems.slim.Table table13 = slimTableFactoryTest0.table;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass14 = table13.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(slimTableFactory1);
        org.junit.Assert.assertNull(table2);
        org.junit.Assert.assertNull(table9);
        org.junit.Assert.assertNull(slimTableFactory10);
        org.junit.Assert.assertNull(table13);
    }

    @Test
    public void test08999() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08999");
        fitnesse.testsystems.slim.tables.SlimTableFactoryTest slimTableFactoryTest0 = new fitnesse.testsystems.slim.tables.SlimTableFactoryTest();
        java.util.Map<java.lang.String, java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable>> strMap1 = slimTableFactoryTest0.getmap();
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory2 = null;
        slimTableFactoryTest0.setslimTableFactory(slimTableFactory2);
        fitnesse.testsystems.slim.Table table4 = slimTableFactoryTest0.gettable();
        java.util.Map<java.lang.String, java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable>> strMap5 = slimTableFactoryTest0.map;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory6 = null;
        slimTableFactoryTest0.slimTableFactory = slimTableFactory6;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory8 = null;
        slimTableFactoryTest0.setslimTableFactory(slimTableFactory8);
        java.util.Map<java.lang.String, java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable>> strMap10 = slimTableFactoryTest0.map;
        fitnesse.testsystems.slim.tables.SlimTableFactory slimTableFactory11 = slimTableFactoryTest0.slimTableFactory;
        org.junit.Assert.assertNull(strMap1);
        org.junit.Assert.assertNull(table4);
        org.junit.Assert.assertNull(strMap5);
        org.junit.Assert.assertNull(strMap10);
        org.junit.Assert.assertNull(slimTableFactory11);
    }

    @Test
    public void test09000() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test09000");
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
        java.lang.Class<?> wildcardClass14 = slimTableFactoryTest0.getClass();
        org.junit.Assert.assertNull(table3);
        org.junit.Assert.assertNull(table4);
        org.junit.Assert.assertNull(slimTableFactory5);
        org.junit.Assert.assertNull(slimTableFactory6);
        org.junit.Assert.assertNull(slimTableFactory7);
        org.junit.Assert.assertNull(table10);
        org.junit.Assert.assertNull(table13);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }
}

