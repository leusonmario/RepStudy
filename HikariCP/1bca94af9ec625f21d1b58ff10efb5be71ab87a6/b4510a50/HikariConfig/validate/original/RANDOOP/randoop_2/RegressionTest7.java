import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest7 {

    public static boolean debug = false;

    @Test
    public void test03501() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03501");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        boolean boolean2 = hikariConfig1.isInitializationFailFast();
        boolean boolean3 = hikariConfig1.isJdbc4ConnectionTest();
        hikariConfig1.setDataSourceClassName("hi!");
        java.util.Properties properties7 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig8 = new com.zaxxer.hikari.HikariConfig(properties7);
        boolean boolean9 = hikariConfig8.isInitializationFailFast();
        hikariConfig8.setInitializationFailFast(true);
        javax.sql.DataSource dataSource12 = null;
        hikariConfig8.setDataSource(dataSource12);
        hikariConfig8.setAcquireRetryDelay((long) 'a');
        java.lang.String str16 = hikariConfig8.getConnectionCustomizerClassName();
        java.util.Properties properties17 = hikariConfig8.getDataSourceProperties();
        hikariConfig8.setAutoCommit(false);
        hikariConfig8.setInitializationFailFast(false);
        int int22 = hikariConfig8.getMaximumPoolSize();
        boolean boolean23 = hikariConfig8.isRegisterMbeans();
        hikariConfig1.addDataSourceProperty("HikariPool-587", (java.lang.Object) boolean23);
        java.lang.String str25 = hikariConfig1.getConnectionTestQuery();
        java.lang.String str26 = hikariConfig1.getConnectionCustomizerClassName();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertNotNull(properties17);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 60 + "'", int22 == 60);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNull(str25);
        org.junit.Assert.assertNull(str26);
    }

    @Test
    public void test03502() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03502");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        boolean boolean2 = hikariConfig1.isInitializationFailFast();
        hikariConfig1.setInitializationFailFast(true);
        boolean boolean5 = hikariConfig1.isJdbc4ConnectionTest();
        long long6 = hikariConfig1.getConnectionTimeout();
        hikariConfig1.setAcquireIncrement(100);
        hikariConfig1.setTransactionIsolation("hi!");
        hikariConfig1.setPoolName("HikariPool-143");
        hikariConfig1.setPoolName("HikariPool-700");
        int int15 = hikariConfig1.getAcquireRetries();
        javax.sql.DataSource dataSource16 = hikariConfig1.getDataSource();
        java.lang.String str17 = hikariConfig1.getConnectionTestQuery();
        java.util.Properties properties19 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig20 = new com.zaxxer.hikari.HikariConfig(properties19);
        boolean boolean21 = hikariConfig20.isInitializationFailFast();
        hikariConfig20.setInitializationFailFast(true);
        boolean boolean24 = hikariConfig20.isJdbc4ConnectionTest();
        long long25 = hikariConfig20.getConnectionTimeout();
        hikariConfig20.setPoolName("hi!");
        hikariConfig20.setAcquireIncrement((int) (byte) 100);
        java.util.Properties properties30 = hikariConfig20.getDataSourceProperties();
        com.zaxxer.hikari.HikariConfig hikariConfig31 = new com.zaxxer.hikari.HikariConfig(properties30);
        long long32 = hikariConfig31.getAcquireRetryDelay();
        hikariConfig1.addDataSourceProperty("HikariPool-888", (java.lang.Object) hikariConfig31);
        int int34 = hikariConfig1.getTransactionIsolation();
        hikariConfig1.setInitializationFailFast(true);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 5000L + "'", long6 == 5000L);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 3 + "'", int15 == 3);
        org.junit.Assert.assertNull(dataSource16);
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertTrue("'" + long25 + "' != '" + 5000L + "'", long25 == 5000L);
        org.junit.Assert.assertNotNull(properties30);
        org.junit.Assert.assertTrue("'" + long32 + "' != '" + 0L + "'", long32 == 0L);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + (-1) + "'", int34 == (-1));
    }

    @Test
    public void test03503() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03503");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        boolean boolean2 = hikariConfig1.isInitializationFailFast();
        hikariConfig1.setInitializationFailFast(true);
        javax.sql.DataSource dataSource5 = null;
        hikariConfig1.setDataSource(dataSource5);
        hikariConfig1.setAcquireRetryDelay((long) 'a');
        java.lang.String str9 = hikariConfig1.getConnectionCustomizerClassName();
        java.lang.String str10 = hikariConfig1.getConnectionInitSql();
        long long11 = hikariConfig1.getLeakDetectionThreshold();
        hikariConfig1.setConnectionTestQuery("HikariPool-393");
        hikariConfig1.setJdbc4ConnectionTest(false);
        hikariConfig1.setAcquireRetries(1);
        long long18 = hikariConfig1.getMaxLifetime();
        hikariConfig1.setTransactionIsolation("HikariPool-6065");
        java.lang.String str21 = hikariConfig1.getConnectionTestQuery();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 0L + "'", long11 == 0L);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 1800000L + "'", long18 == 1800000L);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "HikariPool-393" + "'", str21, "HikariPool-393");
    }

    @Test
    public void test03504() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03504");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        boolean boolean2 = hikariConfig1.isInitializationFailFast();
        hikariConfig1.setInitializationFailFast(true);
        javax.sql.DataSource dataSource5 = null;
        hikariConfig1.setDataSource(dataSource5);
        hikariConfig1.setAcquireRetryDelay((long) 'a');
        java.lang.String str9 = hikariConfig1.getConnectionCustomizerClassName();
        java.util.Properties properties10 = hikariConfig1.getDataSourceProperties();
        hikariConfig1.setAutoCommit(false);
        hikariConfig1.setJdbc4ConnectionTest(false);
        java.lang.String str15 = hikariConfig1.getConnectionInitSql();
        hikariConfig1.setPoolName("HikariPool-627");
        boolean boolean18 = hikariConfig1.isAutoCommit();
        hikariConfig1.setUseInstrumentation(true);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNotNull(properties10);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test03505() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03505");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        boolean boolean2 = hikariConfig1.isInitializationFailFast();
        hikariConfig1.setInitializationFailFast(true);
        hikariConfig1.setAcquireRetryDelay(1L);
        hikariConfig1.setConnectionTimeout(600000L);
        hikariConfig1.setConnectionCustomizerClassName("HikariPool-143");
        long long11 = hikariConfig1.getMaxLifetime();
        java.util.Properties properties12 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig13 = new com.zaxxer.hikari.HikariConfig(properties12);
        boolean boolean14 = hikariConfig13.isInitializationFailFast();
        hikariConfig13.setInitializationFailFast(true);
        hikariConfig13.setAcquireRetryDelay(1L);
        boolean boolean19 = hikariConfig13.isAutoCommit();
        java.util.Properties properties20 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig21 = new com.zaxxer.hikari.HikariConfig(properties20);
        java.util.Properties properties22 = hikariConfig21.getDataSourceProperties();
        hikariConfig13.setDataSourceProperties(properties22);
        hikariConfig1.setDataSourceProperties(properties22);
        hikariConfig1.setIdleTimeout((long) (byte) 100);
        java.lang.String str27 = hikariConfig1.getCatalog();
        long long28 = hikariConfig1.getLeakDetectionThreshold();
        hikariConfig1.setMaximumPoolSize(0);
        hikariConfig1.setIdleTimeout((long) ' ');
        boolean boolean33 = hikariConfig1.isJdbc4ConnectionTest();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 1800000L + "'", long11 == 1800000L);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertNotNull(properties22);
        org.junit.Assert.assertNull(str27);
        org.junit.Assert.assertTrue("'" + long28 + "' != '" + 0L + "'", long28 == 0L);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + true + "'", boolean33 == true);
    }

    @Test
    public void test03506() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03506");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        boolean boolean2 = hikariConfig1.isInitializationFailFast();
        hikariConfig1.setInitializationFailFast(true);
        int int5 = hikariConfig1.getAcquireRetries();
        long long6 = hikariConfig1.getMaxLifetime();
        java.util.Properties properties7 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig8 = new com.zaxxer.hikari.HikariConfig(properties7);
        boolean boolean9 = hikariConfig8.isInitializationFailFast();
        javax.sql.DataSource dataSource10 = null;
        hikariConfig8.setDataSource(dataSource10);
        java.util.Properties properties12 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig13 = new com.zaxxer.hikari.HikariConfig(properties12);
        boolean boolean14 = hikariConfig13.isInitializationFailFast();
        hikariConfig13.setInitializationFailFast(true);
        boolean boolean17 = hikariConfig13.isJdbc4ConnectionTest();
        long long18 = hikariConfig13.getConnectionTimeout();
        hikariConfig13.setPoolName("hi!");
        hikariConfig13.setAcquireIncrement((int) (byte) 100);
        java.util.Properties properties23 = hikariConfig13.getDataSourceProperties();
        hikariConfig8.setDataSourceProperties(properties23);
        hikariConfig1.setDataSourceProperties(properties23);
        com.zaxxer.hikari.HikariConfig hikariConfig26 = new com.zaxxer.hikari.HikariConfig(properties23);
        java.lang.String str27 = hikariConfig26.getConnectionInitSql();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 3 + "'", int5 == 3);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 1800000L + "'", long6 == 1800000L);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 5000L + "'", long18 == 5000L);
        org.junit.Assert.assertNotNull(properties23);
        org.junit.Assert.assertNull(str27);
    }

    @Test
    public void test03507() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03507");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        boolean boolean2 = hikariConfig1.isInitializationFailFast();
        hikariConfig1.setInitializationFailFast(true);
        boolean boolean5 = hikariConfig1.isJdbc4ConnectionTest();
        java.lang.String str6 = hikariConfig1.getDataSourceClassName();
        boolean boolean7 = hikariConfig1.isJdbc4ConnectionTest();
        java.lang.String str8 = hikariConfig1.getConnectionInitSql();
        hikariConfig1.setAcquireRetries((int) (short) 100);
        long long11 = hikariConfig1.getAcquireRetryDelay();
        int int12 = hikariConfig1.getAcquireIncrement();
        java.util.Properties properties13 = hikariConfig1.getDataSourceProperties();
        java.lang.String str14 = hikariConfig1.getPoolName();
        // The following exception was thrown during execution in test generation
        try {
            hikariConfig1.setAcquireRetries((int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: acquireRetries cannot be negative");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 0L + "'", long11 == 0L);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNotNull(properties13);
// flaky:         org.junit.Assert.assertEquals("'" + str14 + "' != '" + "HikariPool-30305" + "'", str14, "HikariPool-30305");
    }

    @Test
    public void test03508() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03508");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        boolean boolean2 = hikariConfig1.isInitializationFailFast();
        hikariConfig1.setInitializationFailFast(true);
        int int5 = hikariConfig1.getAcquireRetries();
        boolean boolean6 = hikariConfig1.isRegisterMbeans();
        java.util.Properties properties7 = hikariConfig1.getDataSourceProperties();
        java.lang.String str8 = hikariConfig1.getConnectionCustomizerClassName();
        hikariConfig1.setIdleTimeout(0L);
        boolean boolean11 = hikariConfig1.isAutoCommit();
        int int12 = hikariConfig1.getTransactionIsolation();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 3 + "'", int5 == 3);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(properties7);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
    }

    @Test
    public void test03509() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03509");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        boolean boolean2 = hikariConfig1.isInitializationFailFast();
        hikariConfig1.setInitializationFailFast(true);
        javax.sql.DataSource dataSource5 = null;
        hikariConfig1.setDataSource(dataSource5);
        hikariConfig1.setCatalog("");
        hikariConfig1.setAcquireIncrement((int) (byte) 10);
        hikariConfig1.setTransactionIsolation("HikariPool-1465");
        int int13 = hikariConfig1.getAcquireIncrement();
        java.util.Properties properties14 = hikariConfig1.getDataSourceProperties();
        java.lang.Class<?> wildcardClass15 = properties14.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNotNull(properties14);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test03510() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03510");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        boolean boolean2 = hikariConfig1.isInitializationFailFast();
        hikariConfig1.setInitializationFailFast(true);
        boolean boolean5 = hikariConfig1.isJdbc4ConnectionTest();
        long long6 = hikariConfig1.getConnectionTimeout();
        hikariConfig1.setAcquireIncrement(100);
        hikariConfig1.setTransactionIsolation("hi!");
        hikariConfig1.setPoolName("HikariPool-143");
        hikariConfig1.setPoolName("HikariPool-700");
        int int15 = hikariConfig1.getAcquireRetries();
        hikariConfig1.setMaximumPoolSize(100);
        hikariConfig1.setLeakDetectionThreshold(52L);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 5000L + "'", long6 == 5000L);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 3 + "'", int15 == 3);
    }

    @Test
    public void test03511() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03511");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        boolean boolean2 = hikariConfig1.isInitializationFailFast();
        hikariConfig1.setTransactionIsolation("hi!");
        java.util.Properties properties5 = hikariConfig1.getDataSourceProperties();
        long long6 = hikariConfig1.getConnectionTimeout();
        java.util.Properties properties8 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig9 = new com.zaxxer.hikari.HikariConfig(properties8);
        boolean boolean10 = hikariConfig9.isInitializationFailFast();
        hikariConfig9.setInitializationFailFast(true);
        javax.sql.DataSource dataSource13 = null;
        hikariConfig9.setDataSource(dataSource13);
        hikariConfig9.setAcquireRetryDelay((long) 'a');
        java.lang.String str17 = hikariConfig9.getConnectionCustomizerClassName();
        java.util.Properties properties18 = hikariConfig9.getDataSourceProperties();
        hikariConfig9.setAutoCommit(false);
        hikariConfig9.setInitializationFailFast(false);
        int int23 = hikariConfig9.getMaximumPoolSize();
        boolean boolean24 = hikariConfig9.isRegisterMbeans();
        hikariConfig9.setJdbc4ConnectionTest(true);
        hikariConfig1.addDataSourceProperty("HikariPool-663", (java.lang.Object) hikariConfig9);
        hikariConfig9.setMaximumPoolSize(100);
        long long30 = hikariConfig9.getIdleTimeout();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(properties5);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 5000L + "'", long6 == 5000L);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertNotNull(properties18);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 60 + "'", int23 == 60);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + long30 + "' != '" + 600000L + "'", long30 == 600000L);
    }

    @Test
    public void test03512() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03512");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        boolean boolean2 = hikariConfig1.isInitializationFailFast();
        hikariConfig1.setInitializationFailFast(true);
        javax.sql.DataSource dataSource5 = null;
        hikariConfig1.setDataSource(dataSource5);
        hikariConfig1.setAcquireRetryDelay((long) 'a');
        java.lang.String str9 = hikariConfig1.getConnectionCustomizerClassName();
        java.util.Properties properties10 = hikariConfig1.getDataSourceProperties();
        java.util.Properties properties11 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig12 = new com.zaxxer.hikari.HikariConfig(properties11);
        java.util.Properties properties13 = hikariConfig12.getDataSourceProperties();
        hikariConfig1.setDataSourceProperties(properties13);
        java.lang.String str15 = hikariConfig1.getCatalog();
        long long16 = hikariConfig1.getConnectionTimeout();
        java.util.Properties properties17 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig18 = new com.zaxxer.hikari.HikariConfig(properties17);
        boolean boolean19 = hikariConfig18.isInitializationFailFast();
        hikariConfig18.setInitializationFailFast(true);
        int int22 = hikariConfig18.getAcquireRetries();
        long long23 = hikariConfig18.getMaxLifetime();
        java.util.Properties properties24 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig25 = new com.zaxxer.hikari.HikariConfig(properties24);
        boolean boolean26 = hikariConfig25.isInitializationFailFast();
        javax.sql.DataSource dataSource27 = null;
        hikariConfig25.setDataSource(dataSource27);
        java.util.Properties properties29 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig30 = new com.zaxxer.hikari.HikariConfig(properties29);
        boolean boolean31 = hikariConfig30.isInitializationFailFast();
        hikariConfig30.setInitializationFailFast(true);
        boolean boolean34 = hikariConfig30.isJdbc4ConnectionTest();
        long long35 = hikariConfig30.getConnectionTimeout();
        hikariConfig30.setPoolName("hi!");
        hikariConfig30.setAcquireIncrement((int) (byte) 100);
        java.util.Properties properties40 = hikariConfig30.getDataSourceProperties();
        hikariConfig25.setDataSourceProperties(properties40);
        hikariConfig18.setDataSourceProperties(properties40);
        com.zaxxer.hikari.HikariConfig hikariConfig43 = new com.zaxxer.hikari.HikariConfig(properties40);
        hikariConfig1.setDataSourceProperties(properties40);
        hikariConfig1.setTransactionIsolation("");
        hikariConfig1.setConnectionTestQuery("HikariPool-1566");
        hikariConfig1.setCatalog("HikariPool-8737");
        hikariConfig1.setUseInstrumentation(true);
        hikariConfig1.setDataSourceClassName("HikariPool-19896");
        javax.sql.DataSource dataSource55 = null;
        hikariConfig1.setDataSource(dataSource55);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNotNull(properties10);
        org.junit.Assert.assertNotNull(properties13);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 5000L + "'", long16 == 5000L);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 3 + "'", int22 == 3);
        org.junit.Assert.assertTrue("'" + long23 + "' != '" + 1800000L + "'", long23 == 1800000L);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + true + "'", boolean34 == true);
        org.junit.Assert.assertTrue("'" + long35 + "' != '" + 5000L + "'", long35 == 5000L);
        org.junit.Assert.assertNotNull(properties40);
    }

    @Test
    public void test03513() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03513");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        boolean boolean2 = hikariConfig1.isInitializationFailFast();
        hikariConfig1.setInitializationFailFast(true);
        javax.sql.DataSource dataSource5 = null;
        hikariConfig1.setDataSource(dataSource5);
        hikariConfig1.setAcquireRetryDelay((long) 'a');
        java.lang.String str9 = hikariConfig1.getConnectionCustomizerClassName();
        java.util.Properties properties10 = hikariConfig1.getDataSourceProperties();
        java.util.Properties properties11 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig12 = new com.zaxxer.hikari.HikariConfig(properties11);
        java.util.Properties properties13 = hikariConfig12.getDataSourceProperties();
        hikariConfig1.setDataSourceProperties(properties13);
        int int15 = hikariConfig1.getMinimumPoolSize();
        java.lang.String str16 = hikariConfig1.getDataSourceClassName();
        hikariConfig1.setAcquireIncrement((int) (short) 100);
        hikariConfig1.setTransactionIsolation("HikariPool-1150");
        long long21 = hikariConfig1.getMaxLifetime();
        hikariConfig1.setConnectionCustomizerClassName("HikariPool-1639");
        long long24 = hikariConfig1.getIdleTimeout();
        int int25 = hikariConfig1.getTransactionIsolation();
        hikariConfig1.setInitializationFailFast(true);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNotNull(properties10);
        org.junit.Assert.assertNotNull(properties13);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 10 + "'", int15 == 10);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + 1800000L + "'", long21 == 1800000L);
        org.junit.Assert.assertTrue("'" + long24 + "' != '" + 600000L + "'", long24 == 600000L);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + (-1) + "'", int25 == (-1));
    }

    @Test
    public void test03514() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03514");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        boolean boolean2 = hikariConfig1.isInitializationFailFast();
        hikariConfig1.setInitializationFailFast(true);
        boolean boolean5 = hikariConfig1.isJdbc4ConnectionTest();
        long long6 = hikariConfig1.getConnectionTimeout();
        hikariConfig1.setPoolName("hi!");
        hikariConfig1.setAutoCommit(false);
        java.lang.String str11 = hikariConfig1.getConnectionInitSql();
        hikariConfig1.setCatalog("HikariPool-28877");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 5000L + "'", long6 == 5000L);
        org.junit.Assert.assertNull(str11);
    }

    @Test
    public void test03515() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03515");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        boolean boolean2 = hikariConfig1.isInitializationFailFast();
        hikariConfig1.setInitializationFailFast(true);
        javax.sql.DataSource dataSource5 = null;
        hikariConfig1.setDataSource(dataSource5);
        hikariConfig1.setAcquireRetryDelay((long) 'a');
        java.lang.String str9 = hikariConfig1.getConnectionCustomizerClassName();
        java.lang.String str10 = hikariConfig1.getConnectionInitSql();
        hikariConfig1.setDataSourceClassName("");
        java.util.Properties properties13 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig14 = new com.zaxxer.hikari.HikariConfig(properties13);
        boolean boolean15 = hikariConfig14.isInitializationFailFast();
        hikariConfig14.setInitializationFailFast(true);
        javax.sql.DataSource dataSource18 = null;
        hikariConfig14.setDataSource(dataSource18);
        hikariConfig14.setAcquireRetryDelay((long) 'a');
        java.lang.String str22 = hikariConfig14.getConnectionCustomizerClassName();
        java.util.Properties properties23 = hikariConfig14.getDataSourceProperties();
        java.util.Properties properties24 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig25 = new com.zaxxer.hikari.HikariConfig(properties24);
        java.util.Properties properties26 = hikariConfig25.getDataSourceProperties();
        hikariConfig14.setDataSourceProperties(properties26);
        hikariConfig1.setDataSourceProperties(properties26);
        long long29 = hikariConfig1.getLeakDetectionThreshold();
        java.util.Properties properties30 = hikariConfig1.getDataSourceProperties();
        java.lang.String str31 = hikariConfig1.getConnectionCustomizerClassName();
        hikariConfig1.setConnectionCustomizerClassName("HikariPool-4494");
        hikariConfig1.setIdleTimeout((long) (short) -1);
        java.lang.String str36 = hikariConfig1.getCatalog();
        hikariConfig1.setPoolName("HikariPool-19098");
        java.lang.String str39 = hikariConfig1.getCatalog();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNull(str22);
        org.junit.Assert.assertNotNull(properties23);
        org.junit.Assert.assertNotNull(properties26);
        org.junit.Assert.assertTrue("'" + long29 + "' != '" + 0L + "'", long29 == 0L);
        org.junit.Assert.assertNotNull(properties30);
        org.junit.Assert.assertNull(str31);
        org.junit.Assert.assertNull(str36);
        org.junit.Assert.assertNull(str39);
    }

    @Test
    public void test03516() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03516");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        boolean boolean2 = hikariConfig1.isInitializationFailFast();
        hikariConfig1.setInitializationFailFast(true);
        java.lang.String str5 = hikariConfig1.getConnectionTestQuery();
        hikariConfig1.setConnectionCustomizerClassName("");
        java.lang.String str8 = hikariConfig1.getConnectionInitSql();
        java.util.Properties properties10 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig11 = new com.zaxxer.hikari.HikariConfig(properties10);
        boolean boolean12 = hikariConfig11.isInitializationFailFast();
        hikariConfig11.setLeakDetectionThreshold((long) '4');
        int int15 = hikariConfig11.getTransactionIsolation();
        hikariConfig11.setMaximumPoolSize((int) (short) 100);
        java.lang.Class<?> wildcardClass18 = hikariConfig11.getClass();
        hikariConfig1.addDataSourceProperty("HikariPool-674", (java.lang.Object) hikariConfig11);
        hikariConfig1.setPoolName("HikariPool-2528");
        long long22 = hikariConfig1.getAcquireRetryDelay();
        hikariConfig1.setConnectionCustomizerClassName("HikariPool-9269");
        hikariConfig1.setUseInstrumentation(false);
        hikariConfig1.setConnectionTimeout((long) 0);
        hikariConfig1.setConnectionTestQuery("HikariPool-1465");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass18);
        org.junit.Assert.assertTrue("'" + long22 + "' != '" + 0L + "'", long22 == 0L);
    }

    @Test
    public void test03517() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03517");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        boolean boolean2 = hikariConfig1.isInitializationFailFast();
        hikariConfig1.setLeakDetectionThreshold((long) '4');
        java.lang.String str5 = hikariConfig1.getConnectionTestQuery();
        java.lang.String str6 = hikariConfig1.getPoolName();
        java.lang.String str7 = hikariConfig1.getCatalog();
        hikariConfig1.setIdleTimeout(600000L);
        hikariConfig1.setConnectionTimeout((long) (byte) 100);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(str5);
// flaky:         org.junit.Assert.assertEquals("'" + str6 + "' != '" + "HikariPool-30347" + "'", str6, "HikariPool-30347");
        org.junit.Assert.assertNull(str7);
    }

    @Test
    public void test03518() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03518");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        boolean boolean2 = hikariConfig1.isInitializationFailFast();
        hikariConfig1.setLeakDetectionThreshold((long) '4');
        java.lang.String str5 = hikariConfig1.getConnectionCustomizerClassName();
        hikariConfig1.setAcquireRetryDelay((long) (byte) 10);
        hikariConfig1.setLeakDetectionThreshold((long) (short) 10);
        java.util.Properties properties10 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig11 = new com.zaxxer.hikari.HikariConfig(properties10);
        boolean boolean12 = hikariConfig11.isInitializationFailFast();
        hikariConfig11.setInitializationFailFast(true);
        javax.sql.DataSource dataSource15 = null;
        hikariConfig11.setDataSource(dataSource15);
        hikariConfig11.setAcquireRetryDelay((long) 'a');
        java.lang.String str19 = hikariConfig11.getConnectionCustomizerClassName();
        java.util.Properties properties20 = hikariConfig11.getDataSourceProperties();
        java.util.Properties properties21 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig22 = new com.zaxxer.hikari.HikariConfig(properties21);
        boolean boolean23 = hikariConfig22.isInitializationFailFast();
        hikariConfig22.setInitializationFailFast(true);
        javax.sql.DataSource dataSource26 = null;
        hikariConfig22.setDataSource(dataSource26);
        hikariConfig22.setAcquireRetryDelay((long) 'a');
        java.lang.String str30 = hikariConfig22.getConnectionCustomizerClassName();
        java.util.Properties properties31 = hikariConfig22.getDataSourceProperties();
        hikariConfig11.setDataSourceProperties(properties31);
        hikariConfig1.setDataSourceProperties(properties31);
        com.zaxxer.hikari.HikariConfig hikariConfig34 = new com.zaxxer.hikari.HikariConfig(properties31);
        java.util.Properties properties35 = hikariConfig34.getDataSourceProperties();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNull(str19);
        org.junit.Assert.assertNotNull(properties20);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNull(str30);
        org.junit.Assert.assertNotNull(properties31);
        org.junit.Assert.assertNotNull(properties35);
    }

    @Test
    public void test03519() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03519");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        boolean boolean2 = hikariConfig1.isInitializationFailFast();
        hikariConfig1.setInitializationFailFast(true);
        javax.sql.DataSource dataSource5 = null;
        hikariConfig1.setDataSource(dataSource5);
        hikariConfig1.setAcquireRetryDelay((long) 'a');
        java.lang.String str9 = hikariConfig1.getConnectionCustomizerClassName();
        java.util.Properties properties10 = hikariConfig1.getDataSourceProperties();
        hikariConfig1.setAutoCommit(false);
        hikariConfig1.setInitializationFailFast(false);
        java.lang.String str15 = hikariConfig1.getConnectionInitSql();
        boolean boolean16 = hikariConfig1.isAutoCommit();
        java.lang.String str17 = hikariConfig1.getConnectionCustomizerClassName();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNotNull(properties10);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNull(str17);
    }

    @Test
    public void test03520() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03520");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        boolean boolean2 = hikariConfig1.isInitializationFailFast();
        hikariConfig1.setInitializationFailFast(true);
        boolean boolean5 = hikariConfig1.isJdbc4ConnectionTest();
        long long6 = hikariConfig1.getConnectionTimeout();
        hikariConfig1.setPoolName("hi!");
        hikariConfig1.setAcquireIncrement((int) (byte) 100);
        hikariConfig1.setIdleTimeout((long) ' ');
        hikariConfig1.setConnectionCustomizerClassName("HikariPool-1843");
        int int15 = hikariConfig1.getAcquireRetries();
        java.util.Properties properties16 = hikariConfig1.getDataSourceProperties();
        java.util.Properties properties17 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig18 = new com.zaxxer.hikari.HikariConfig(properties17);
        boolean boolean19 = hikariConfig18.isInitializationFailFast();
        hikariConfig18.setInitializationFailFast(true);
        javax.sql.DataSource dataSource22 = null;
        hikariConfig18.setDataSource(dataSource22);
        hikariConfig18.setAcquireRetryDelay((long) 'a');
        java.lang.String str26 = hikariConfig18.getConnectionCustomizerClassName();
        java.util.Properties properties27 = hikariConfig18.getDataSourceProperties();
        java.util.Properties properties28 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig29 = new com.zaxxer.hikari.HikariConfig(properties28);
        java.util.Properties properties30 = hikariConfig29.getDataSourceProperties();
        hikariConfig18.setDataSourceProperties(properties30);
        int int32 = hikariConfig18.getMinimumPoolSize();
        int int33 = hikariConfig18.getMinimumPoolSize();
        hikariConfig18.setIdleTimeout(0L);
        java.util.Properties properties36 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig37 = new com.zaxxer.hikari.HikariConfig(properties36);
        boolean boolean38 = hikariConfig37.isInitializationFailFast();
        hikariConfig37.setInitializationFailFast(true);
        javax.sql.DataSource dataSource41 = null;
        hikariConfig37.setDataSource(dataSource41);
        hikariConfig37.setAcquireRetryDelay((long) 'a');
        java.lang.String str45 = hikariConfig37.getConnectionCustomizerClassName();
        java.lang.String str46 = hikariConfig37.getConnectionInitSql();
        boolean boolean47 = hikariConfig37.isRegisterMbeans();
        java.lang.String str48 = hikariConfig37.getCatalog();
        java.util.Properties properties49 = hikariConfig37.getDataSourceProperties();
        com.zaxxer.hikari.HikariConfig hikariConfig50 = new com.zaxxer.hikari.HikariConfig(properties49);
        hikariConfig18.setDataSourceProperties(properties49);
        com.zaxxer.hikari.HikariConfig hikariConfig52 = new com.zaxxer.hikari.HikariConfig(properties49);
        hikariConfig1.setDataSourceProperties(properties49);
        boolean boolean54 = hikariConfig1.isAutoCommit();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 5000L + "'", long6 == 5000L);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 3 + "'", int15 == 3);
        org.junit.Assert.assertNotNull(properties16);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNull(str26);
        org.junit.Assert.assertNotNull(properties27);
        org.junit.Assert.assertNotNull(properties30);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 10 + "'", int32 == 10);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 10 + "'", int33 == 10);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertNull(str45);
        org.junit.Assert.assertNull(str46);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertNull(str48);
        org.junit.Assert.assertNotNull(properties49);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + true + "'", boolean54 == true);
    }

    @Test
    public void test03521() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03521");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        boolean boolean2 = hikariConfig1.isInitializationFailFast();
        hikariConfig1.setInitializationFailFast(true);
        hikariConfig1.setAcquireRetryDelay(1L);
        hikariConfig1.setAcquireIncrement((int) (byte) 100);
        hikariConfig1.setConnectionTestQuery("HikariPool-143");
        hikariConfig1.setMaximumPoolSize(0);
        int int13 = hikariConfig1.getMaximumPoolSize();
        java.util.Properties properties15 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig16 = new com.zaxxer.hikari.HikariConfig(properties15);
        boolean boolean17 = hikariConfig16.isInitializationFailFast();
        hikariConfig16.setInitializationFailFast(true);
        javax.sql.DataSource dataSource20 = null;
        hikariConfig16.setDataSource(dataSource20);
        hikariConfig16.setAcquireRetryDelay((long) 'a');
        java.lang.String str24 = hikariConfig16.getConnectionCustomizerClassName();
        java.util.Properties properties25 = hikariConfig16.getDataSourceProperties();
        java.util.Properties properties26 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig27 = new com.zaxxer.hikari.HikariConfig(properties26);
        java.util.Properties properties28 = hikariConfig27.getDataSourceProperties();
        hikariConfig16.setDataSourceProperties(properties28);
        int int30 = hikariConfig16.getMinimumPoolSize();
        java.util.Properties properties31 = hikariConfig16.getDataSourceProperties();
        hikariConfig1.addDataSourceProperty("HikariPool-3100", (java.lang.Object) hikariConfig16);
        hikariConfig16.setMinimumPoolSize((int) 'a');
        java.util.Properties properties36 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig37 = new com.zaxxer.hikari.HikariConfig(properties36);
        boolean boolean38 = hikariConfig37.isInitializationFailFast();
        boolean boolean39 = hikariConfig37.isJdbc4ConnectionTest();
        long long40 = hikariConfig37.getIdleTimeout();
        java.util.Properties properties42 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig43 = new com.zaxxer.hikari.HikariConfig(properties42);
        boolean boolean44 = hikariConfig43.isInitializationFailFast();
        hikariConfig43.setInitializationFailFast(true);
        javax.sql.DataSource dataSource47 = null;
        hikariConfig43.setDataSource(dataSource47);
        hikariConfig43.setAcquireRetryDelay((long) 'a');
        java.lang.String str51 = hikariConfig43.getConnectionCustomizerClassName();
        java.util.Properties properties52 = hikariConfig43.getDataSourceProperties();
        java.util.Properties properties53 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig54 = new com.zaxxer.hikari.HikariConfig(properties53);
        java.util.Properties properties55 = hikariConfig54.getDataSourceProperties();
        hikariConfig43.setDataSourceProperties(properties55);
        int int57 = hikariConfig43.getMinimumPoolSize();
        int int58 = hikariConfig43.getMinimumPoolSize();
        hikariConfig37.addDataSourceProperty("HikariPool-477", (java.lang.Object) hikariConfig43);
        int int60 = hikariConfig37.getAcquireRetries();
        long long61 = hikariConfig37.getMaxLifetime();
        int int62 = hikariConfig37.getAcquireRetries();
        long long63 = hikariConfig37.getMaxLifetime();
        hikariConfig16.addDataSourceProperty("HikariPool-2246", (java.lang.Object) long63);
        hikariConfig16.setAcquireIncrement(1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNull(str24);
        org.junit.Assert.assertNotNull(properties25);
        org.junit.Assert.assertNotNull(properties28);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 10 + "'", int30 == 10);
        org.junit.Assert.assertNotNull(properties31);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + true + "'", boolean39 == true);
        org.junit.Assert.assertTrue("'" + long40 + "' != '" + 600000L + "'", long40 == 600000L);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertNull(str51);
        org.junit.Assert.assertNotNull(properties52);
        org.junit.Assert.assertNotNull(properties55);
        org.junit.Assert.assertTrue("'" + int57 + "' != '" + 10 + "'", int57 == 10);
        org.junit.Assert.assertTrue("'" + int58 + "' != '" + 10 + "'", int58 == 10);
        org.junit.Assert.assertTrue("'" + int60 + "' != '" + 3 + "'", int60 == 3);
        org.junit.Assert.assertTrue("'" + long61 + "' != '" + 1800000L + "'", long61 == 1800000L);
        org.junit.Assert.assertTrue("'" + int62 + "' != '" + 3 + "'", int62 == 3);
        org.junit.Assert.assertTrue("'" + long63 + "' != '" + 1800000L + "'", long63 == 1800000L);
    }

    @Test
    public void test03522() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03522");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        boolean boolean2 = hikariConfig1.isInitializationFailFast();
        hikariConfig1.setInitializationFailFast(true);
        javax.sql.DataSource dataSource5 = null;
        hikariConfig1.setDataSource(dataSource5);
        hikariConfig1.setAcquireRetryDelay((long) 'a');
        java.lang.String str9 = hikariConfig1.getConnectionCustomizerClassName();
        int int10 = hikariConfig1.getAcquireRetries();
        boolean boolean11 = hikariConfig1.isJdbc4ConnectionTest();
        hikariConfig1.setMinimumPoolSize((int) 'a');
        hikariConfig1.setPoolName("");
        hikariConfig1.setTransactionIsolation("HikariPool-2609");
        long long18 = hikariConfig1.getAcquireRetryDelay();
        boolean boolean19 = hikariConfig1.isAutoCommit();
        long long20 = hikariConfig1.getConnectionTimeout();
        java.lang.String str21 = hikariConfig1.getConnectionTestQuery();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 3 + "'", int10 == 3);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 0L + "'", long18 == 0L);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 5000L + "'", long20 == 5000L);
        org.junit.Assert.assertNull(str21);
    }

    @Test
    public void test03523() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03523");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        boolean boolean2 = hikariConfig1.isInitializationFailFast();
        hikariConfig1.setLeakDetectionThreshold((long) '4');
        java.lang.String str5 = hikariConfig1.getConnectionCustomizerClassName();
        java.util.Properties properties6 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig7 = new com.zaxxer.hikari.HikariConfig(properties6);
        boolean boolean8 = hikariConfig7.isInitializationFailFast();
        hikariConfig7.setInitializationFailFast(true);
        javax.sql.DataSource dataSource11 = null;
        hikariConfig7.setDataSource(dataSource11);
        hikariConfig7.setAcquireRetryDelay((long) 'a');
        java.lang.String str15 = hikariConfig7.getConnectionCustomizerClassName();
        java.util.Properties properties16 = hikariConfig7.getDataSourceProperties();
        java.util.Properties properties17 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig18 = new com.zaxxer.hikari.HikariConfig(properties17);
        java.util.Properties properties19 = hikariConfig18.getDataSourceProperties();
        hikariConfig7.setDataSourceProperties(properties19);
        hikariConfig1.setDataSourceProperties(properties19);
        java.lang.String str22 = hikariConfig1.getDataSourceClassName();
        hikariConfig1.setConnectionCustomizerClassName("");
        hikariConfig1.setMinimumPoolSize((int) ' ');
        java.lang.String str27 = hikariConfig1.getCatalog();
        java.lang.String str28 = hikariConfig1.getConnectionInitSql();
        long long29 = hikariConfig1.getIdleTimeout();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertNotNull(properties16);
        org.junit.Assert.assertNotNull(properties19);
        org.junit.Assert.assertNull(str22);
        org.junit.Assert.assertNull(str27);
        org.junit.Assert.assertNull(str28);
        org.junit.Assert.assertTrue("'" + long29 + "' != '" + 600000L + "'", long29 == 600000L);
    }

    @Test
    public void test03524() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03524");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        boolean boolean1 = hikariConfig0.isRegisterMbeans();
        int int2 = hikariConfig0.getTransactionIsolation();
        hikariConfig0.setDataSourceClassName("HikariPool-1465");
        int int5 = hikariConfig0.getAcquireIncrement();
        hikariConfig0.setDataSourceClassName("HikariPool-5315");
        int int8 = hikariConfig0.getMinimumPoolSize();
        boolean boolean9 = hikariConfig0.isAutoCommit();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 10 + "'", int8 == 10);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void test03525() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03525");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        boolean boolean2 = hikariConfig1.isInitializationFailFast();
        hikariConfig1.setInitializationFailFast(true);
        javax.sql.DataSource dataSource5 = null;
        hikariConfig1.setDataSource(dataSource5);
        java.lang.String str7 = hikariConfig1.getCatalog();
        int int8 = hikariConfig1.getMinimumPoolSize();
        java.lang.String str9 = hikariConfig1.getCatalog();
        long long10 = hikariConfig1.getLeakDetectionThreshold();
        hikariConfig1.setJdbc4ConnectionTest(false);
        int int13 = hikariConfig1.getMinimumPoolSize();
        long long14 = hikariConfig1.getLeakDetectionThreshold();
        hikariConfig1.setConnectionCustomizerClassName("HikariPool-393");
        int int17 = hikariConfig1.getAcquireIncrement();
        int int18 = hikariConfig1.getAcquireRetries();
        hikariConfig1.setAcquireRetries(100);
        hikariConfig1.setIdleTimeout(100L);
        hikariConfig1.setPoolName("HikariPool-16500");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 10 + "'", int8 == 10);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 10 + "'", int13 == 10);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 0L + "'", long14 == 0L);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 3 + "'", int18 == 3);
    }

    @Test
    public void test03526() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03526");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        boolean boolean2 = hikariConfig1.isInitializationFailFast();
        hikariConfig1.setInitializationFailFast(true);
        javax.sql.DataSource dataSource5 = null;
        hikariConfig1.setDataSource(dataSource5);
        hikariConfig1.setAcquireRetryDelay((long) 'a');
        java.lang.String str9 = hikariConfig1.getConnectionCustomizerClassName();
        java.util.Properties properties10 = hikariConfig1.getDataSourceProperties();
        hikariConfig1.setAutoCommit(false);
        hikariConfig1.setJdbc4ConnectionTest(false);
        java.lang.String str15 = hikariConfig1.getConnectionInitSql();
        int int16 = hikariConfig1.getMaximumPoolSize();
        javax.sql.DataSource dataSource17 = null;
        hikariConfig1.setDataSource(dataSource17);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNotNull(properties10);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 60 + "'", int16 == 60);
    }

    @Test
    public void test03527() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03527");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        boolean boolean2 = hikariConfig1.isInitializationFailFast();
        boolean boolean3 = hikariConfig1.isJdbc4ConnectionTest();
        hikariConfig1.addDataSourceProperty("", (java.lang.Object) false);
        java.lang.String str7 = hikariConfig1.getConnectionTestQuery();
        hikariConfig1.setLeakDetectionThreshold((long) (byte) 100);
        java.lang.String str10 = hikariConfig1.getConnectionCustomizerClassName();
        hikariConfig1.setTransactionIsolation("HikariPool-7943");
        hikariConfig1.setConnectionInitSql("HikariPool-9612");
        hikariConfig1.setUseInstrumentation(false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str10);
    }

    @Test
    public void test03528() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03528");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        boolean boolean2 = hikariConfig1.isInitializationFailFast();
        hikariConfig1.setInitializationFailFast(true);
        java.lang.String str5 = hikariConfig1.getConnectionTestQuery();
        hikariConfig1.setDataSourceClassName("");
        java.util.Properties properties9 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig10 = new com.zaxxer.hikari.HikariConfig(properties9);
        boolean boolean11 = hikariConfig10.isInitializationFailFast();
        hikariConfig10.setInitializationFailFast(true);
        int int14 = hikariConfig10.getAcquireRetries();
        long long15 = hikariConfig10.getMaxLifetime();
        hikariConfig10.setMaxLifetime((long) (short) 0);
        long long18 = hikariConfig10.getIdleTimeout();
        boolean boolean19 = hikariConfig10.isRegisterMbeans();
        long long20 = hikariConfig10.getAcquireRetryDelay();
        hikariConfig1.addDataSourceProperty("HikariPool-184", (java.lang.Object) long20);
        javax.sql.DataSource dataSource22 = null;
        hikariConfig1.setDataSource(dataSource22);
        hikariConfig1.setConnectionTestQuery("HikariPool-393");
        long long26 = hikariConfig1.getLeakDetectionThreshold();
        hikariConfig1.setRegisterMbeans(false);
        java.lang.String str29 = hikariConfig1.getConnectionCustomizerClassName();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 3 + "'", int14 == 3);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 1800000L + "'", long15 == 1800000L);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 600000L + "'", long18 == 600000L);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 0L + "'", long20 == 0L);
        org.junit.Assert.assertTrue("'" + long26 + "' != '" + 0L + "'", long26 == 0L);
        org.junit.Assert.assertNull(str29);
    }

    @Test
    public void test03529() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03529");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        boolean boolean2 = hikariConfig1.isInitializationFailFast();
        hikariConfig1.setInitializationFailFast(true);
        javax.sql.DataSource dataSource5 = null;
        hikariConfig1.setDataSource(dataSource5);
        hikariConfig1.setAcquireRetryDelay((long) 'a');
        java.lang.String str9 = hikariConfig1.getConnectionCustomizerClassName();
        java.util.Properties properties10 = hikariConfig1.getDataSourceProperties();
        java.util.Properties properties11 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig12 = new com.zaxxer.hikari.HikariConfig(properties11);
        java.util.Properties properties13 = hikariConfig12.getDataSourceProperties();
        hikariConfig1.setDataSourceProperties(properties13);
        int int15 = hikariConfig1.getMinimumPoolSize();
        int int16 = hikariConfig1.getMinimumPoolSize();
        hikariConfig1.setIdleTimeout(0L);
        hikariConfig1.setRegisterMbeans(false);
        hikariConfig1.setAcquireRetryDelay((long) (short) -1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNotNull(properties10);
        org.junit.Assert.assertNotNull(properties13);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 10 + "'", int15 == 10);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 10 + "'", int16 == 10);
    }

    @Test
    public void test03530() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03530");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        hikariConfig1.setTransactionIsolation("");
        int int4 = hikariConfig1.getAcquireIncrement();
        long long5 = hikariConfig1.getLeakDetectionThreshold();
        java.lang.String str6 = hikariConfig1.getDataSourceClassName();
        java.util.Properties properties7 = hikariConfig1.getDataSourceProperties();
        int int8 = hikariConfig1.getMaximumPoolSize();
        java.lang.String str9 = hikariConfig1.getConnectionTestQuery();
        long long10 = hikariConfig1.getLeakDetectionThreshold();
        hikariConfig1.setAcquireRetries(10);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNotNull(properties7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 60 + "'", int8 == 60);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
    }

    @Test
    public void test03531() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03531");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        boolean boolean2 = hikariConfig1.isInitializationFailFast();
        hikariConfig1.setLeakDetectionThreshold((long) '4');
        hikariConfig1.setRegisterMbeans(true);
        hikariConfig1.setAutoCommit(true);
        hikariConfig1.setAcquireRetryDelay((long) (short) 1);
        hikariConfig1.setMaximumPoolSize(10);
        java.lang.String str13 = hikariConfig1.getConnectionCustomizerClassName();
        hikariConfig1.setRegisterMbeans(true);
        hikariConfig1.setPoolName("HikariPool-10642");
        boolean boolean18 = hikariConfig1.isInitializationFailFast();
        java.lang.String str19 = hikariConfig1.getConnectionTestQuery();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNull(str19);
    }

    @Test
    public void test03532() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03532");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        boolean boolean2 = hikariConfig1.isInitializationFailFast();
        hikariConfig1.setInitializationFailFast(true);
        boolean boolean5 = hikariConfig1.isJdbc4ConnectionTest();
        long long6 = hikariConfig1.getConnectionTimeout();
        hikariConfig1.setAcquireIncrement(100);
        hikariConfig1.setTransactionIsolation("hi!");
        hikariConfig1.setPoolName("HikariPool-143");
        hikariConfig1.setPoolName("HikariPool-700");
        int int15 = hikariConfig1.getAcquireRetries();
        hikariConfig1.setMaximumPoolSize(100);
        javax.sql.DataSource dataSource18 = null;
        hikariConfig1.setDataSource(dataSource18);
        hikariConfig1.setConnectionTestQuery("HikariPool-18402");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 5000L + "'", long6 == 5000L);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 3 + "'", int15 == 3);
    }

    @Test
    public void test03533() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03533");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        boolean boolean2 = hikariConfig1.isInitializationFailFast();
        hikariConfig1.setInitializationFailFast(true);
        javax.sql.DataSource dataSource5 = null;
        hikariConfig1.setDataSource(dataSource5);
        hikariConfig1.setAcquireRetryDelay((long) 'a');
        java.lang.String str9 = hikariConfig1.getConnectionCustomizerClassName();
        java.lang.String str10 = hikariConfig1.getConnectionInitSql();
        long long11 = hikariConfig1.getLeakDetectionThreshold();
        hikariConfig1.setRegisterMbeans(false);
        hikariConfig1.setMaxLifetime((long) (short) 0);
        javax.sql.DataSource dataSource16 = hikariConfig1.getDataSource();
        hikariConfig1.setAcquireIncrement((int) ' ');
        javax.sql.DataSource dataSource19 = hikariConfig1.getDataSource();
        hikariConfig1.setConnectionTestQuery("HikariPool-7258");
        long long22 = hikariConfig1.getIdleTimeout();
        boolean boolean23 = hikariConfig1.isJdbc4ConnectionTest();
        java.lang.String str24 = hikariConfig1.getConnectionCustomizerClassName();
        long long25 = hikariConfig1.getIdleTimeout();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 0L + "'", long11 == 0L);
        org.junit.Assert.assertNull(dataSource16);
        org.junit.Assert.assertNull(dataSource19);
        org.junit.Assert.assertTrue("'" + long22 + "' != '" + 600000L + "'", long22 == 600000L);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertNull(str24);
        org.junit.Assert.assertTrue("'" + long25 + "' != '" + 600000L + "'", long25 == 600000L);
    }

    @Test
    public void test03534() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03534");
        // The following exception was thrown during execution in test generation
        try {
            com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig("HikariPool-20644");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Property file HikariPool-20644 was not found.");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test03535() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03535");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        boolean boolean1 = hikariConfig0.isRegisterMbeans();
        java.util.Properties properties2 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig3 = new com.zaxxer.hikari.HikariConfig(properties2);
        boolean boolean4 = hikariConfig3.isInitializationFailFast();
        hikariConfig3.setInitializationFailFast(true);
        hikariConfig3.setAcquireRetryDelay(1L);
        boolean boolean9 = hikariConfig3.isAutoCommit();
        java.util.Properties properties10 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig11 = new com.zaxxer.hikari.HikariConfig(properties10);
        java.util.Properties properties12 = hikariConfig11.getDataSourceProperties();
        hikariConfig3.setDataSourceProperties(properties12);
        hikariConfig0.setDataSourceProperties(properties12);
        boolean boolean15 = hikariConfig0.isRegisterMbeans();
        int int16 = hikariConfig0.getTransactionIsolation();
        java.util.Properties properties17 = hikariConfig0.getDataSourceProperties();
        java.util.Properties properties18 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig19 = new com.zaxxer.hikari.HikariConfig(properties18);
        boolean boolean20 = hikariConfig19.isInitializationFailFast();
        boolean boolean21 = hikariConfig19.isJdbc4ConnectionTest();
        javax.sql.DataSource dataSource22 = null;
        hikariConfig19.setDataSource(dataSource22);
        long long24 = hikariConfig19.getIdleTimeout();
        hikariConfig19.setConnectionCustomizerClassName("HikariPool-184");
        long long27 = hikariConfig19.getIdleTimeout();
        javax.sql.DataSource dataSource28 = null;
        hikariConfig19.setDataSource(dataSource28);
        java.util.Properties properties30 = hikariConfig19.getDataSourceProperties();
        int int31 = hikariConfig19.getTransactionIsolation();
        hikariConfig19.setMaximumPoolSize((int) (short) 1);
        java.util.Properties properties34 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig35 = new com.zaxxer.hikari.HikariConfig(properties34);
        boolean boolean36 = hikariConfig35.isInitializationFailFast();
        hikariConfig35.setInitializationFailFast(true);
        javax.sql.DataSource dataSource39 = null;
        hikariConfig35.setDataSource(dataSource39);
        hikariConfig35.setAcquireRetryDelay((long) 'a');
        java.lang.String str43 = hikariConfig35.getConnectionCustomizerClassName();
        java.lang.String str44 = hikariConfig35.getConnectionInitSql();
        hikariConfig35.setDataSourceClassName("");
        hikariConfig35.setPoolName("HikariPool-627");
        java.util.Properties properties49 = hikariConfig35.getDataSourceProperties();
        hikariConfig19.setDataSourceProperties(properties49);
        hikariConfig0.setDataSourceProperties(properties49);
        com.zaxxer.hikari.HikariConfig hikariConfig52 = new com.zaxxer.hikari.HikariConfig(properties49);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(properties12);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertNotNull(properties17);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertTrue("'" + long24 + "' != '" + 600000L + "'", long24 == 600000L);
        org.junit.Assert.assertTrue("'" + long27 + "' != '" + 600000L + "'", long27 == 600000L);
        org.junit.Assert.assertNotNull(properties30);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + (-1) + "'", int31 == (-1));
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertNull(str43);
        org.junit.Assert.assertNull(str44);
        org.junit.Assert.assertNotNull(properties49);
    }

    @Test
    public void test03536() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03536");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        java.util.Properties properties2 = hikariConfig1.getDataSourceProperties();
        int int3 = hikariConfig1.getTransactionIsolation();
        long long4 = hikariConfig1.getIdleTimeout();
        hikariConfig1.setMaximumPoolSize((int) (byte) 100);
        java.util.Properties properties7 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig8 = new com.zaxxer.hikari.HikariConfig(properties7);
        boolean boolean9 = hikariConfig8.isInitializationFailFast();
        hikariConfig8.setLeakDetectionThreshold((long) '4');
        java.lang.String str12 = hikariConfig8.getConnectionCustomizerClassName();
        java.util.Properties properties13 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig14 = new com.zaxxer.hikari.HikariConfig(properties13);
        boolean boolean15 = hikariConfig14.isInitializationFailFast();
        hikariConfig14.setInitializationFailFast(true);
        javax.sql.DataSource dataSource18 = null;
        hikariConfig14.setDataSource(dataSource18);
        hikariConfig14.setAcquireRetryDelay((long) 'a');
        java.lang.String str22 = hikariConfig14.getConnectionCustomizerClassName();
        java.util.Properties properties23 = hikariConfig14.getDataSourceProperties();
        java.util.Properties properties24 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig25 = new com.zaxxer.hikari.HikariConfig(properties24);
        java.util.Properties properties26 = hikariConfig25.getDataSourceProperties();
        hikariConfig14.setDataSourceProperties(properties26);
        hikariConfig8.setDataSourceProperties(properties26);
        hikariConfig1.setDataSourceProperties(properties26);
        com.zaxxer.hikari.HikariConfig hikariConfig30 = new com.zaxxer.hikari.HikariConfig(properties26);
        int int31 = hikariConfig30.getMinimumPoolSize();
        org.junit.Assert.assertNotNull(properties2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 600000L + "'", long4 == 600000L);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNull(str22);
        org.junit.Assert.assertNotNull(properties23);
        org.junit.Assert.assertNotNull(properties26);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 10 + "'", int31 == 10);
    }

    @Test
    public void test03537() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03537");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        boolean boolean2 = hikariConfig1.isInitializationFailFast();
        hikariConfig1.setInitializationFailFast(true);
        javax.sql.DataSource dataSource5 = null;
        hikariConfig1.setDataSource(dataSource5);
        hikariConfig1.setAcquireRetryDelay((long) 'a');
        java.lang.String str9 = hikariConfig1.getConnectionCustomizerClassName();
        java.util.Properties properties10 = hikariConfig1.getDataSourceProperties();
        java.util.Properties properties11 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig12 = new com.zaxxer.hikari.HikariConfig(properties11);
        java.util.Properties properties13 = hikariConfig12.getDataSourceProperties();
        hikariConfig1.setDataSourceProperties(properties13);
        int int15 = hikariConfig1.getMinimumPoolSize();
        java.lang.String str16 = hikariConfig1.getDataSourceClassName();
        javax.sql.DataSource dataSource17 = hikariConfig1.getDataSource();
        int int18 = hikariConfig1.getMinimumPoolSize();
        hikariConfig1.setPoolName("HikariPool-1867");
        java.lang.String str21 = hikariConfig1.getConnectionInitSql();
        int int22 = hikariConfig1.getAcquireIncrement();
        // The following exception was thrown during execution in test generation
        try {
            hikariConfig1.setMinimumPoolSize((int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: minPoolSize cannot be negative");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNotNull(properties10);
        org.junit.Assert.assertNotNull(properties13);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 10 + "'", int15 == 10);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertNull(dataSource17);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 10 + "'", int18 == 10);
        org.junit.Assert.assertNull(str21);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
    }

    @Test
    public void test03538() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03538");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        boolean boolean2 = hikariConfig1.isInitializationFailFast();
        hikariConfig1.setInitializationFailFast(true);
        javax.sql.DataSource dataSource5 = null;
        hikariConfig1.setDataSource(dataSource5);
        hikariConfig1.setAcquireRetryDelay((long) 'a');
        java.lang.String str9 = hikariConfig1.getConnectionCustomizerClassName();
        java.util.Properties properties10 = hikariConfig1.getDataSourceProperties();
        hikariConfig1.setAutoCommit(false);
        hikariConfig1.setInitializationFailFast(false);
        int int15 = hikariConfig1.getMaximumPoolSize();
        hikariConfig1.setMaximumPoolSize((int) '#');
        long long18 = hikariConfig1.getLeakDetectionThreshold();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNotNull(properties10);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 60 + "'", int15 == 60);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 0L + "'", long18 == 0L);
    }

    @Test
    public void test03539() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03539");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        boolean boolean2 = hikariConfig1.isInitializationFailFast();
        hikariConfig1.setInitializationFailFast(true);
        boolean boolean5 = hikariConfig1.isJdbc4ConnectionTest();
        long long6 = hikariConfig1.getConnectionTimeout();
        hikariConfig1.setPoolName("hi!");
        hikariConfig1.setAcquireIncrement((int) (byte) 100);
        hikariConfig1.setAcquireRetryDelay((long) (byte) 100);
        hikariConfig1.setMaximumPoolSize((int) '4');
        java.util.Properties properties16 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig17 = new com.zaxxer.hikari.HikariConfig(properties16);
        boolean boolean18 = hikariConfig17.isInitializationFailFast();
        hikariConfig17.setInitializationFailFast(true);
        java.lang.String str21 = hikariConfig17.getConnectionTestQuery();
        hikariConfig17.setDataSourceClassName("");
        java.util.Properties properties25 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig26 = new com.zaxxer.hikari.HikariConfig(properties25);
        boolean boolean27 = hikariConfig26.isInitializationFailFast();
        hikariConfig26.setInitializationFailFast(true);
        int int30 = hikariConfig26.getAcquireRetries();
        long long31 = hikariConfig26.getMaxLifetime();
        hikariConfig26.setMaxLifetime((long) (short) 0);
        long long34 = hikariConfig26.getIdleTimeout();
        boolean boolean35 = hikariConfig26.isRegisterMbeans();
        long long36 = hikariConfig26.getAcquireRetryDelay();
        hikariConfig17.addDataSourceProperty("HikariPool-184", (java.lang.Object) long36);
        javax.sql.DataSource dataSource38 = null;
        hikariConfig17.setDataSource(dataSource38);
        hikariConfig17.setCatalog("HikariPool-674");
        long long42 = hikariConfig17.getIdleTimeout();
        int int43 = hikariConfig17.getAcquireIncrement();
        hikariConfig17.setRegisterMbeans(false);
        hikariConfig1.addDataSourceProperty("HikariPool-12850", (java.lang.Object) hikariConfig17);
        hikariConfig17.setConnectionCustomizerClassName("HikariPool-20670");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 5000L + "'", long6 == 5000L);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNull(str21);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 3 + "'", int30 == 3);
        org.junit.Assert.assertTrue("'" + long31 + "' != '" + 1800000L + "'", long31 == 1800000L);
        org.junit.Assert.assertTrue("'" + long34 + "' != '" + 600000L + "'", long34 == 600000L);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertTrue("'" + long36 + "' != '" + 0L + "'", long36 == 0L);
        org.junit.Assert.assertTrue("'" + long42 + "' != '" + 600000L + "'", long42 == 600000L);
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + 0 + "'", int43 == 0);
    }

    @Test
    public void test03540() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03540");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        boolean boolean2 = hikariConfig1.isInitializationFailFast();
        int int3 = hikariConfig1.getAcquireIncrement();
        hikariConfig1.setCatalog("HikariPool-143");
        hikariConfig1.setMaximumPoolSize((int) '#');
        javax.sql.DataSource dataSource8 = null;
        hikariConfig1.setDataSource(dataSource8);
        long long10 = hikariConfig1.getConnectionTimeout();
        java.util.Properties properties12 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig13 = new com.zaxxer.hikari.HikariConfig(properties12);
        boolean boolean14 = hikariConfig13.isInitializationFailFast();
        hikariConfig13.setInitializationFailFast(true);
        boolean boolean17 = hikariConfig13.isJdbc4ConnectionTest();
        java.lang.String str18 = hikariConfig13.getConnectionCustomizerClassName();
        hikariConfig13.setDataSourceClassName("HikariPool-414");
        hikariConfig1.addDataSourceProperty("HikariPool-5769", (java.lang.Object) hikariConfig13);
        hikariConfig1.setDataSourceClassName("HikariPool-4367");
        hikariConfig1.setConnectionCustomizerClassName("HikariPool-8628");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 5000L + "'", long10 == 5000L);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertNull(str18);
    }

    @Test
    public void test03541() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03541");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        boolean boolean2 = hikariConfig1.isInitializationFailFast();
        hikariConfig1.setInitializationFailFast(true);
        javax.sql.DataSource dataSource5 = null;
        hikariConfig1.setDataSource(dataSource5);
        hikariConfig1.setAcquireRetryDelay((long) 'a');
        java.lang.String str9 = hikariConfig1.getConnectionCustomizerClassName();
        java.lang.String str10 = hikariConfig1.getConnectionInitSql();
        hikariConfig1.setDataSourceClassName("");
        java.util.Properties properties13 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig14 = new com.zaxxer.hikari.HikariConfig(properties13);
        boolean boolean15 = hikariConfig14.isInitializationFailFast();
        hikariConfig14.setInitializationFailFast(true);
        javax.sql.DataSource dataSource18 = null;
        hikariConfig14.setDataSource(dataSource18);
        hikariConfig14.setAcquireRetryDelay((long) 'a');
        java.lang.String str22 = hikariConfig14.getConnectionCustomizerClassName();
        java.util.Properties properties23 = hikariConfig14.getDataSourceProperties();
        java.util.Properties properties24 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig25 = new com.zaxxer.hikari.HikariConfig(properties24);
        java.util.Properties properties26 = hikariConfig25.getDataSourceProperties();
        hikariConfig14.setDataSourceProperties(properties26);
        hikariConfig1.setDataSourceProperties(properties26);
        hikariConfig1.setUseInstrumentation(true);
        hikariConfig1.setLeakDetectionThreshold((long) (byte) 1);
        java.lang.String str33 = hikariConfig1.getPoolName();
        javax.sql.DataSource dataSource34 = null;
        hikariConfig1.setDataSource(dataSource34);
        long long36 = hikariConfig1.getConnectionTimeout();
        hikariConfig1.setTransactionIsolation("HikariPool-7145");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNull(str22);
        org.junit.Assert.assertNotNull(properties23);
        org.junit.Assert.assertNotNull(properties26);
// flaky:         org.junit.Assert.assertEquals("'" + str33 + "' != '" + "HikariPool-30472" + "'", str33, "HikariPool-30472");
        org.junit.Assert.assertTrue("'" + long36 + "' != '" + 5000L + "'", long36 == 5000L);
    }

    @Test
    public void test03542() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03542");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        boolean boolean2 = hikariConfig1.isInitializationFailFast();
        hikariConfig1.setInitializationFailFast(true);
        javax.sql.DataSource dataSource5 = null;
        hikariConfig1.setDataSource(dataSource5);
        hikariConfig1.setCatalog("");
        hikariConfig1.setAcquireIncrement((int) (byte) 10);
        hikariConfig1.setTransactionIsolation("HikariPool-1465");
        int int13 = hikariConfig1.getAcquireIncrement();
        java.util.Properties properties14 = hikariConfig1.getDataSourceProperties();
        // The following exception was thrown during execution in test generation
        try {
            hikariConfig1.setConnectionTimeout((long) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: connectionTimeout cannot be less than 100ms");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNotNull(properties14);
    }

    @Test
    public void test03543() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03543");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        boolean boolean1 = hikariConfig0.isRegisterMbeans();
        hikariConfig0.setRegisterMbeans(false);
        hikariConfig0.setConnectionCustomizerClassName("HikariPool-1644");
        java.util.Properties properties6 = hikariConfig0.getDataSourceProperties();
        com.zaxxer.hikari.HikariConfig hikariConfig7 = new com.zaxxer.hikari.HikariConfig(properties6);
        java.lang.String str8 = hikariConfig7.getPoolName();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNotNull(properties6);
// flaky:         org.junit.Assert.assertEquals("'" + str8 + "' != '" + "HikariPool-30488" + "'", str8, "HikariPool-30488");
    }

    @Test
    public void test03544() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03544");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        boolean boolean2 = hikariConfig1.isInitializationFailFast();
        boolean boolean3 = hikariConfig1.isJdbc4ConnectionTest();
        hikariConfig1.addDataSourceProperty("", (java.lang.Object) false);
        hikariConfig1.setRegisterMbeans(true);
        hikariConfig1.setIdleTimeout((long) '4');
        hikariConfig1.setMinimumPoolSize((int) (short) 0);
        java.lang.String str13 = hikariConfig1.getCatalog();
        hikariConfig1.setAcquireRetries((int) '#');
        boolean boolean16 = hikariConfig1.isRegisterMbeans();
        hikariConfig1.setMaximumPoolSize((int) (byte) 10);
        java.util.Properties properties19 = hikariConfig1.getDataSourceProperties();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertNotNull(properties19);
    }

    @Test
    public void test03545() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03545");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        boolean boolean2 = hikariConfig1.isInitializationFailFast();
        hikariConfig1.setInitializationFailFast(true);
        boolean boolean5 = hikariConfig1.isJdbc4ConnectionTest();
        long long6 = hikariConfig1.getConnectionTimeout();
        hikariConfig1.setAcquireIncrement(100);
        hikariConfig1.setLeakDetectionThreshold((long) (byte) 1);
        boolean boolean11 = hikariConfig1.isJdbc4ConnectionTest();
        hikariConfig1.setPoolName("HikariPool-2407");
        hikariConfig1.setUseInstrumentation(true);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 5000L + "'", long6 == 5000L);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
    }

    @Test
    public void test03546() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03546");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        boolean boolean2 = hikariConfig1.isInitializationFailFast();
        hikariConfig1.setInitializationFailFast(true);
        java.lang.String str5 = hikariConfig1.getConnectionTestQuery();
        hikariConfig1.setConnectionCustomizerClassName("");
        java.lang.String str8 = hikariConfig1.getConnectionInitSql();
        java.util.Properties properties10 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig11 = new com.zaxxer.hikari.HikariConfig(properties10);
        boolean boolean12 = hikariConfig11.isInitializationFailFast();
        hikariConfig11.setLeakDetectionThreshold((long) '4');
        int int15 = hikariConfig11.getTransactionIsolation();
        hikariConfig11.setMaximumPoolSize((int) (short) 100);
        java.lang.Class<?> wildcardClass18 = hikariConfig11.getClass();
        hikariConfig1.addDataSourceProperty("HikariPool-674", (java.lang.Object) hikariConfig11);
        java.lang.String str20 = hikariConfig1.getConnectionInitSql();
        java.lang.String str21 = hikariConfig1.getDataSourceClassName();
        // The following exception was thrown during execution in test generation
        try {
            hikariConfig1.setConnectionTimeout((long) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: connectionTimeout cannot be less than 100ms");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass18);
        org.junit.Assert.assertNull(str20);
        org.junit.Assert.assertNull(str21);
    }

    @Test
    public void test03547() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03547");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        boolean boolean2 = hikariConfig1.isInitializationFailFast();
        hikariConfig1.setInitializationFailFast(true);
        javax.sql.DataSource dataSource5 = null;
        hikariConfig1.setDataSource(dataSource5);
        hikariConfig1.setAcquireRetryDelay((long) 'a');
        java.lang.String str9 = hikariConfig1.getConnectionCustomizerClassName();
        java.util.Properties properties10 = hikariConfig1.getDataSourceProperties();
        java.util.Properties properties11 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig12 = new com.zaxxer.hikari.HikariConfig(properties11);
        java.util.Properties properties13 = hikariConfig12.getDataSourceProperties();
        hikariConfig1.setDataSourceProperties(properties13);
        java.lang.String str15 = hikariConfig1.getCatalog();
        long long16 = hikariConfig1.getConnectionTimeout();
        int int17 = hikariConfig1.getTransactionIsolation();
        hikariConfig1.setCatalog("HikariPool-442");
        hikariConfig1.setMinimumPoolSize(100);
        boolean boolean22 = hikariConfig1.isInitializationFailFast();
        hikariConfig1.setAutoCommit(false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNotNull(properties10);
        org.junit.Assert.assertNotNull(properties13);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 5000L + "'", long16 == 5000L);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
    }

    @Test
    public void test03548() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03548");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        boolean boolean2 = hikariConfig1.isInitializationFailFast();
        hikariConfig1.setInitializationFailFast(true);
        hikariConfig1.setCatalog("HikariPool-143");
        java.lang.String str7 = hikariConfig1.getDataSourceClassName();
        java.lang.String str8 = hikariConfig1.getConnectionInitSql();
        int int9 = hikariConfig1.getMinimumPoolSize();
        java.lang.Class<?> wildcardClass10 = hikariConfig1.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 10 + "'", int9 == 10);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test03549() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03549");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        boolean boolean2 = hikariConfig1.isInitializationFailFast();
        hikariConfig1.setInitializationFailFast(true);
        boolean boolean5 = hikariConfig1.isJdbc4ConnectionTest();
        long long6 = hikariConfig1.getConnectionTimeout();
        hikariConfig1.setAcquireIncrement(100);
        hikariConfig1.setDataSourceClassName("HikariPool-143");
        hikariConfig1.setRegisterMbeans(false);
        int int13 = hikariConfig1.getAcquireIncrement();
        hikariConfig1.setConnectionInitSql("HikariPool-2722");
        hikariConfig1.setMaxLifetime((long) 'a');
        boolean boolean18 = hikariConfig1.isAutoCommit();
        int int19 = hikariConfig1.getMinimumPoolSize();
        hikariConfig1.setUseInstrumentation(false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 5000L + "'", long6 == 5000L);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 10 + "'", int19 == 10);
    }

    @Test
    public void test03550() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03550");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        boolean boolean2 = hikariConfig1.isInitializationFailFast();
        hikariConfig1.setInitializationFailFast(true);
        javax.sql.DataSource dataSource5 = null;
        hikariConfig1.setDataSource(dataSource5);
        hikariConfig1.setAcquireRetryDelay((long) 'a');
        long long9 = hikariConfig1.getLeakDetectionThreshold();
        java.util.Properties properties11 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig12 = new com.zaxxer.hikari.HikariConfig(properties11);
        boolean boolean13 = hikariConfig12.isInitializationFailFast();
        hikariConfig12.setInitializationFailFast(true);
        javax.sql.DataSource dataSource16 = null;
        hikariConfig12.setDataSource(dataSource16);
        hikariConfig12.setAcquireRetryDelay((long) 'a');
        java.lang.String str20 = hikariConfig12.getConnectionCustomizerClassName();
        java.util.Properties properties21 = hikariConfig12.getDataSourceProperties();
        java.util.Properties properties22 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig23 = new com.zaxxer.hikari.HikariConfig(properties22);
        boolean boolean24 = hikariConfig23.isInitializationFailFast();
        hikariConfig23.setInitializationFailFast(true);
        javax.sql.DataSource dataSource27 = null;
        hikariConfig23.setDataSource(dataSource27);
        hikariConfig23.setAcquireRetryDelay((long) 'a');
        java.lang.String str31 = hikariConfig23.getConnectionCustomizerClassName();
        java.util.Properties properties32 = hikariConfig23.getDataSourceProperties();
        hikariConfig12.setDataSourceProperties(properties32);
        com.zaxxer.hikari.HikariConfig hikariConfig34 = new com.zaxxer.hikari.HikariConfig(properties32);
        hikariConfig34.setConnectionTimeout((long) (short) 0);
        hikariConfig34.setAcquireRetries((int) ' ');
        boolean boolean39 = hikariConfig34.isAutoCommit();
        hikariConfig1.addDataSourceProperty("HikariPool-3086", (java.lang.Object) hikariConfig34);
        hikariConfig1.setTransactionIsolation("HikariPool-3576");
        hikariConfig1.setMaxLifetime((long) (short) 10);
        java.util.Properties properties45 = hikariConfig1.getDataSourceProperties();
        hikariConfig1.setInitializationFailFast(true);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNull(str20);
        org.junit.Assert.assertNotNull(properties21);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNull(str31);
        org.junit.Assert.assertNotNull(properties32);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + true + "'", boolean39 == true);
        org.junit.Assert.assertNotNull(properties45);
    }

    @Test
    public void test03551() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03551");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        boolean boolean1 = hikariConfig0.isRegisterMbeans();
        java.util.Properties properties2 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig3 = new com.zaxxer.hikari.HikariConfig(properties2);
        boolean boolean4 = hikariConfig3.isInitializationFailFast();
        hikariConfig3.setInitializationFailFast(true);
        hikariConfig3.setAcquireRetryDelay(1L);
        boolean boolean9 = hikariConfig3.isAutoCommit();
        java.util.Properties properties10 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig11 = new com.zaxxer.hikari.HikariConfig(properties10);
        java.util.Properties properties12 = hikariConfig11.getDataSourceProperties();
        hikariConfig3.setDataSourceProperties(properties12);
        hikariConfig0.setDataSourceProperties(properties12);
        boolean boolean15 = hikariConfig0.isRegisterMbeans();
        int int16 = hikariConfig0.getTransactionIsolation();
        java.util.Properties properties17 = hikariConfig0.getDataSourceProperties();
        javax.sql.DataSource dataSource18 = hikariConfig0.getDataSource();
        java.lang.Class<?> wildcardClass19 = hikariConfig0.getClass();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(properties12);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertNotNull(properties17);
        org.junit.Assert.assertNull(dataSource18);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test03552() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03552");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        boolean boolean2 = hikariConfig1.isInitializationFailFast();
        hikariConfig1.setLeakDetectionThreshold((long) '4');
        java.lang.String str5 = hikariConfig1.getConnectionCustomizerClassName();
        java.util.Properties properties6 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig7 = new com.zaxxer.hikari.HikariConfig(properties6);
        boolean boolean8 = hikariConfig7.isInitializationFailFast();
        hikariConfig7.setInitializationFailFast(true);
        javax.sql.DataSource dataSource11 = null;
        hikariConfig7.setDataSource(dataSource11);
        hikariConfig7.setAcquireRetryDelay((long) 'a');
        java.lang.String str15 = hikariConfig7.getConnectionCustomizerClassName();
        java.util.Properties properties16 = hikariConfig7.getDataSourceProperties();
        java.util.Properties properties17 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig18 = new com.zaxxer.hikari.HikariConfig(properties17);
        java.util.Properties properties19 = hikariConfig18.getDataSourceProperties();
        hikariConfig7.setDataSourceProperties(properties19);
        hikariConfig1.setDataSourceProperties(properties19);
        java.lang.String str22 = hikariConfig1.getDataSourceClassName();
        hikariConfig1.setInitializationFailFast(true);
        hikariConfig1.setDataSourceClassName("HikariPool-481");
        hikariConfig1.setInitializationFailFast(true);
        long long29 = hikariConfig1.getLeakDetectionThreshold();
        boolean boolean30 = hikariConfig1.isRegisterMbeans();
        java.util.Properties properties31 = hikariConfig1.getDataSourceProperties();
        int int32 = hikariConfig1.getMinimumPoolSize();
        int int33 = hikariConfig1.getAcquireIncrement();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertNotNull(properties16);
        org.junit.Assert.assertNotNull(properties19);
        org.junit.Assert.assertNull(str22);
        org.junit.Assert.assertTrue("'" + long29 + "' != '" + 52L + "'", long29 == 52L);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertNotNull(properties31);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 10 + "'", int32 == 10);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
    }

    @Test
    public void test03553() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03553");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        boolean boolean2 = hikariConfig1.isInitializationFailFast();
        hikariConfig1.setLeakDetectionThreshold((long) '4');
        java.lang.String str5 = hikariConfig1.getPoolName();
        hikariConfig1.setAcquireRetries((int) 'a');
        java.lang.String str8 = hikariConfig1.getDataSourceClassName();
        long long9 = hikariConfig1.getAcquireRetryDelay();
        java.lang.String str10 = hikariConfig1.getPoolName();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "HikariPool-30529" + "'", str5, "HikariPool-30529");
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
// flaky:         org.junit.Assert.assertEquals("'" + str10 + "' != '" + "HikariPool-30529" + "'", str10, "HikariPool-30529");
    }

    @Test
    public void test03554() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03554");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        boolean boolean2 = hikariConfig1.isInitializationFailFast();
        hikariConfig1.setLeakDetectionThreshold((long) '4');
        hikariConfig1.setRegisterMbeans(true);
        hikariConfig1.setAutoCommit(true);
        hikariConfig1.setAcquireRetryDelay((long) (short) 1);
        java.lang.String str11 = hikariConfig1.getConnectionInitSql();
        hikariConfig1.setLeakDetectionThreshold((long) 52);
        java.lang.Class<?> wildcardClass14 = hikariConfig1.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test03555() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03555");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        boolean boolean2 = hikariConfig1.isInitializationFailFast();
        boolean boolean3 = hikariConfig1.isJdbc4ConnectionTest();
        javax.sql.DataSource dataSource4 = null;
        hikariConfig1.setDataSource(dataSource4);
        int int6 = hikariConfig1.getAcquireIncrement();
        hikariConfig1.setTransactionIsolation("HikariPool-143");
        long long9 = hikariConfig1.getConnectionTimeout();
        hikariConfig1.setRegisterMbeans(false);
        hikariConfig1.setLeakDetectionThreshold((long) 10);
        hikariConfig1.setRegisterMbeans(false);
        hikariConfig1.setConnectionInitSql("HikariPool-4437");
        hikariConfig1.setJdbc4ConnectionTest(false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 5000L + "'", long9 == 5000L);
    }

    @Test
    public void test03556() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03556");
        // The following exception was thrown during execution in test generation
        try {
            com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig("HikariPool-24281");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Property file HikariPool-24281 was not found.");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test03557() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03557");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        boolean boolean2 = hikariConfig1.isInitializationFailFast();
        hikariConfig1.setInitializationFailFast(true);
        javax.sql.DataSource dataSource5 = null;
        hikariConfig1.setDataSource(dataSource5);
        java.lang.String str7 = hikariConfig1.getCatalog();
        int int8 = hikariConfig1.getMinimumPoolSize();
        hikariConfig1.setTransactionIsolation("");
        hikariConfig1.setConnectionInitSql("HikariPool-609");
        hikariConfig1.setUseInstrumentation(true);
        hikariConfig1.setUseInstrumentation(false);
        long long17 = hikariConfig1.getIdleTimeout();
        boolean boolean18 = hikariConfig1.isJdbc4ConnectionTest();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 10 + "'", int8 == 10);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 600000L + "'", long17 == 600000L);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
    }

    @Test
    public void test03558() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03558");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        boolean boolean2 = hikariConfig1.isInitializationFailFast();
        hikariConfig1.setInitializationFailFast(true);
        javax.sql.DataSource dataSource5 = null;
        hikariConfig1.setDataSource(dataSource5);
        java.lang.String str7 = hikariConfig1.getCatalog();
        int int8 = hikariConfig1.getMinimumPoolSize();
        java.lang.String str9 = hikariConfig1.getCatalog();
        long long10 = hikariConfig1.getLeakDetectionThreshold();
        hikariConfig1.setConnectionTestQuery("HikariPool-143");
        hikariConfig1.setIdleTimeout((long) (byte) 10);
        java.lang.String str15 = hikariConfig1.getPoolName();
        hikariConfig1.setCatalog("HikariPool-1644");
        int int18 = hikariConfig1.getMinimumPoolSize();
        long long19 = hikariConfig1.getIdleTimeout();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 10 + "'", int8 == 10);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "HikariPool-30545" + "'", str15, "HikariPool-30545");
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 10 + "'", int18 == 10);
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 10L + "'", long19 == 10L);
    }

    @Test
    public void test03559() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03559");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        boolean boolean2 = hikariConfig1.isInitializationFailFast();
        javax.sql.DataSource dataSource3 = null;
        hikariConfig1.setDataSource(dataSource3);
        java.util.Properties properties5 = hikariConfig1.getDataSourceProperties();
        com.zaxxer.hikari.HikariConfig hikariConfig6 = new com.zaxxer.hikari.HikariConfig(properties5);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(properties5);
    }

    @Test
    public void test03560() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03560");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        boolean boolean2 = hikariConfig1.isInitializationFailFast();
        hikariConfig1.setInitializationFailFast(true);
        javax.sql.DataSource dataSource5 = null;
        hikariConfig1.setDataSource(dataSource5);
        hikariConfig1.setAcquireRetryDelay((long) 'a');
        java.lang.String str9 = hikariConfig1.getConnectionCustomizerClassName();
        int int10 = hikariConfig1.getAcquireRetries();
        java.lang.String str11 = hikariConfig1.getDataSourceClassName();
        hikariConfig1.setIdleTimeout((long) 60);
        int int14 = hikariConfig1.getAcquireIncrement();
        int int15 = hikariConfig1.getAcquireIncrement();
        int int16 = hikariConfig1.getMinimumPoolSize();
        java.util.Properties properties17 = hikariConfig1.getDataSourceProperties();
        long long18 = hikariConfig1.getConnectionTimeout();
        hikariConfig1.setCatalog("HikariPool-9679");
        boolean boolean21 = hikariConfig1.isAutoCommit();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 3 + "'", int10 == 3);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 10 + "'", int16 == 10);
        org.junit.Assert.assertNotNull(properties17);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 5000L + "'", long18 == 5000L);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
    }

    @Test
    public void test03561() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03561");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        boolean boolean2 = hikariConfig1.isInitializationFailFast();
        hikariConfig1.setInitializationFailFast(true);
        javax.sql.DataSource dataSource5 = null;
        hikariConfig1.setDataSource(dataSource5);
        hikariConfig1.setAcquireRetryDelay((long) 'a');
        long long9 = hikariConfig1.getLeakDetectionThreshold();
        java.lang.String str10 = hikariConfig1.getConnectionCustomizerClassName();
        hikariConfig1.setJdbc4ConnectionTest(false);
        hikariConfig1.setAcquireIncrement((int) (short) 1);
        hikariConfig1.setAutoCommit(true);
        hikariConfig1.setMaxLifetime(5000L);
        long long19 = hikariConfig1.getConnectionTimeout();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 5000L + "'", long19 == 5000L);
    }

    @Test
    public void test03562() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03562");
        // The following exception was thrown during execution in test generation
        try {
            com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig("HikariPool-21661");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Property file HikariPool-21661 was not found.");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test03563() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03563");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        boolean boolean2 = hikariConfig1.isInitializationFailFast();
        hikariConfig1.setInitializationFailFast(true);
        hikariConfig1.setAcquireRetryDelay(1L);
        hikariConfig1.setMaximumPoolSize((int) '#');
        hikariConfig1.setAcquireRetryDelay((long) 10);
        hikariConfig1.setAutoCommit(true);
        java.util.Properties properties13 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig14 = new com.zaxxer.hikari.HikariConfig(properties13);
        boolean boolean15 = hikariConfig14.isInitializationFailFast();
        hikariConfig14.setInitializationFailFast(true);
        java.lang.String str18 = hikariConfig14.getConnectionTestQuery();
        boolean boolean19 = hikariConfig14.isRegisterMbeans();
        hikariConfig14.setDataSourceClassName("hi!");
        hikariConfig14.setConnectionInitSql("");
        int int24 = hikariConfig14.getTransactionIsolation();
        boolean boolean25 = hikariConfig14.isAutoCommit();
        java.util.Properties properties26 = hikariConfig14.getDataSourceProperties();
        com.zaxxer.hikari.HikariConfig hikariConfig27 = new com.zaxxer.hikari.HikariConfig(properties26);
        com.zaxxer.hikari.HikariConfig hikariConfig28 = new com.zaxxer.hikari.HikariConfig(properties26);
        hikariConfig1.setDataSourceProperties(properties26);
        hikariConfig1.setJdbc4ConnectionTest(true);
        // The following exception was thrown during execution in test generation
        try {
            hikariConfig1.setConnectionTimeout((long) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: connectionTimeout cannot be less than 100ms");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-1) + "'", int24 == (-1));
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertNotNull(properties26);
    }

    @Test
    public void test03564() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03564");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        boolean boolean2 = hikariConfig1.isInitializationFailFast();
        hikariConfig1.setInitializationFailFast(true);
        int int5 = hikariConfig1.getAcquireRetries();
        long long6 = hikariConfig1.getMaxLifetime();
        hikariConfig1.setMaxLifetime((long) (short) 0);
        hikariConfig1.setRegisterMbeans(false);
        hikariConfig1.setInitializationFailFast(true);
        hikariConfig1.setConnectionInitSql("HikariPool-4404");
        boolean boolean15 = hikariConfig1.isRegisterMbeans();
        boolean boolean16 = hikariConfig1.isJdbc4ConnectionTest();
        java.lang.Class<?> wildcardClass17 = hikariConfig1.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 3 + "'", int5 == 3);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 1800000L + "'", long6 == 1800000L);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test03565() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03565");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        boolean boolean2 = hikariConfig1.isInitializationFailFast();
        hikariConfig1.setInitializationFailFast(true);
        javax.sql.DataSource dataSource5 = null;
        hikariConfig1.setDataSource(dataSource5);
        hikariConfig1.setAcquireRetryDelay((long) 'a');
        java.lang.String str9 = hikariConfig1.getConnectionCustomizerClassName();
        java.util.Properties properties10 = hikariConfig1.getDataSourceProperties();
        hikariConfig1.setAutoCommit(false);
        hikariConfig1.setInitializationFailFast(false);
        int int15 = hikariConfig1.getMaximumPoolSize();
        hikariConfig1.setJdbc4ConnectionTest(false);
        javax.sql.DataSource dataSource18 = hikariConfig1.getDataSource();
        boolean boolean19 = hikariConfig1.isRegisterMbeans();
        long long20 = hikariConfig1.getMaxLifetime();
        long long21 = hikariConfig1.getMaxLifetime();
        long long22 = hikariConfig1.getLeakDetectionThreshold();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNotNull(properties10);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 60 + "'", int15 == 60);
        org.junit.Assert.assertNull(dataSource18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 1800000L + "'", long20 == 1800000L);
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + 1800000L + "'", long21 == 1800000L);
        org.junit.Assert.assertTrue("'" + long22 + "' != '" + 0L + "'", long22 == 0L);
    }

    @Test
    public void test03566() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03566");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        boolean boolean2 = hikariConfig1.isInitializationFailFast();
        hikariConfig1.setInitializationFailFast(true);
        javax.sql.DataSource dataSource5 = null;
        hikariConfig1.setDataSource(dataSource5);
        hikariConfig1.setAcquireRetryDelay((long) 'a');
        java.lang.String str9 = hikariConfig1.getConnectionCustomizerClassName();
        java.util.Properties properties10 = hikariConfig1.getDataSourceProperties();
        java.util.Properties properties11 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig12 = new com.zaxxer.hikari.HikariConfig(properties11);
        java.util.Properties properties13 = hikariConfig12.getDataSourceProperties();
        hikariConfig1.setDataSourceProperties(properties13);
        java.lang.String str15 = hikariConfig1.getCatalog();
        long long16 = hikariConfig1.getConnectionTimeout();
        int int17 = hikariConfig1.getTransactionIsolation();
        boolean boolean18 = hikariConfig1.isInitializationFailFast();
        int int19 = hikariConfig1.getAcquireRetries();
        java.lang.String str20 = hikariConfig1.getConnectionTestQuery();
        boolean boolean21 = hikariConfig1.isJdbc4ConnectionTest();
        java.lang.String str22 = hikariConfig1.getPoolName();
        hikariConfig1.setIdleTimeout(97L);
        long long25 = hikariConfig1.getLeakDetectionThreshold();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNotNull(properties10);
        org.junit.Assert.assertNotNull(properties13);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 5000L + "'", long16 == 5000L);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 3 + "'", int19 == 3);
        org.junit.Assert.assertNull(str20);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
// flaky:         org.junit.Assert.assertEquals("'" + str22 + "' != '" + "HikariPool-30594" + "'", str22, "HikariPool-30594");
        org.junit.Assert.assertTrue("'" + long25 + "' != '" + 0L + "'", long25 == 0L);
    }

    @Test
    public void test03567() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03567");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        boolean boolean2 = hikariConfig1.isInitializationFailFast();
        int int3 = hikariConfig1.getAcquireIncrement();
        java.lang.String str4 = hikariConfig1.getConnectionCustomizerClassName();
        hikariConfig1.setMaximumPoolSize((int) ' ');
        hikariConfig1.setConnectionInitSql("HikariPool-1150");
        java.util.Properties properties10 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig11 = new com.zaxxer.hikari.HikariConfig(properties10);
        java.util.Properties properties12 = hikariConfig11.getDataSourceProperties();
        java.util.Properties properties14 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig15 = new com.zaxxer.hikari.HikariConfig(properties14);
        boolean boolean16 = hikariConfig15.isInitializationFailFast();
        hikariConfig15.setInitializationFailFast(true);
        javax.sql.DataSource dataSource19 = null;
        hikariConfig15.setDataSource(dataSource19);
        hikariConfig15.setAcquireRetryDelay((long) 'a');
        java.lang.String str23 = hikariConfig15.getConnectionCustomizerClassName();
        hikariConfig15.setConnectionCustomizerClassName("hi!");
        java.lang.String str26 = hikariConfig15.getConnectionInitSql();
        hikariConfig11.addDataSourceProperty("hi!", (java.lang.Object) hikariConfig15);
        long long28 = hikariConfig11.getAcquireRetryDelay();
        int int29 = hikariConfig11.getAcquireRetries();
        hikariConfig11.setMinimumPoolSize((int) (byte) 100);
        hikariConfig1.addDataSourceProperty("", (java.lang.Object) hikariConfig11);
        hikariConfig1.setAcquireRetryDelay(1800000L);
        java.lang.String str35 = hikariConfig1.getDataSourceClassName();
        hikariConfig1.setPoolName("HikariPool-4238");
        hikariConfig1.setJdbc4ConnectionTest(true);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNotNull(properties12);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNull(str23);
        org.junit.Assert.assertNull(str26);
        org.junit.Assert.assertTrue("'" + long28 + "' != '" + 0L + "'", long28 == 0L);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 3 + "'", int29 == 3);
        org.junit.Assert.assertNull(str35);
    }

    @Test
    public void test03568() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03568");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        boolean boolean2 = hikariConfig1.isInitializationFailFast();
        hikariConfig1.setInitializationFailFast(true);
        javax.sql.DataSource dataSource5 = null;
        hikariConfig1.setDataSource(dataSource5);
        hikariConfig1.setAcquireRetryDelay((long) 'a');
        java.lang.String str9 = hikariConfig1.getConnectionCustomizerClassName();
        int int10 = hikariConfig1.getAcquireRetries();
        java.lang.String str11 = hikariConfig1.getDataSourceClassName();
        java.lang.String str12 = hikariConfig1.getConnectionTestQuery();
        hikariConfig1.setConnectionCustomizerClassName("hi!");
        int int15 = hikariConfig1.getAcquireIncrement();
        long long16 = hikariConfig1.getLeakDetectionThreshold();
        hikariConfig1.setMaxLifetime((long) (short) 0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 3 + "'", int10 == 3);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 0L + "'", long16 == 0L);
    }

    @Test
    public void test03569() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03569");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        boolean boolean2 = hikariConfig1.isInitializationFailFast();
        hikariConfig1.setInitializationFailFast(true);
        boolean boolean5 = hikariConfig1.isJdbc4ConnectionTest();
        long long6 = hikariConfig1.getConnectionTimeout();
        hikariConfig1.setAcquireIncrement(100);
        hikariConfig1.setPoolName("");
        long long11 = hikariConfig1.getLeakDetectionThreshold();
        hikariConfig1.setRegisterMbeans(false);
        hikariConfig1.setAcquireRetries((int) (short) 0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 5000L + "'", long6 == 5000L);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 0L + "'", long11 == 0L);
    }

    @Test
    public void test03570() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03570");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        boolean boolean2 = hikariConfig1.isInitializationFailFast();
        boolean boolean3 = hikariConfig1.isJdbc4ConnectionTest();
        hikariConfig1.addDataSourceProperty("", (java.lang.Object) false);
        hikariConfig1.setTransactionIsolation("HikariPool-143");
        hikariConfig1.setConnectionInitSql("HikariPool-184");
        hikariConfig1.setDataSourceClassName("HikariPool-1009");
        hikariConfig1.setMaxLifetime((long) (-1));
        java.lang.String str15 = hikariConfig1.getConnectionCustomizerClassName();
        boolean boolean16 = hikariConfig1.isInitializationFailFast();
        java.lang.Class<?> wildcardClass17 = hikariConfig1.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test03571() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03571");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        boolean boolean2 = hikariConfig1.isInitializationFailFast();
        hikariConfig1.setInitializationFailFast(true);
        javax.sql.DataSource dataSource5 = null;
        hikariConfig1.setDataSource(dataSource5);
        hikariConfig1.setAcquireRetryDelay((long) 'a');
        java.lang.String str9 = hikariConfig1.getConnectionCustomizerClassName();
        java.util.Properties properties10 = hikariConfig1.getDataSourceProperties();
        java.util.Properties properties11 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig12 = new com.zaxxer.hikari.HikariConfig(properties11);
        java.util.Properties properties13 = hikariConfig12.getDataSourceProperties();
        hikariConfig1.setDataSourceProperties(properties13);
        hikariConfig1.setCatalog("hi!");
        boolean boolean17 = hikariConfig1.isJdbc4ConnectionTest();
        hikariConfig1.setAutoCommit(true);
        hikariConfig1.setConnectionCustomizerClassName("HikariPool-477");
        long long22 = hikariConfig1.getIdleTimeout();
        hikariConfig1.setAutoCommit(true);
        hikariConfig1.setConnectionTestQuery("HikariPool-22771");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNotNull(properties10);
        org.junit.Assert.assertNotNull(properties13);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + long22 + "' != '" + 600000L + "'", long22 == 600000L);
    }

    @Test
    public void test03572() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03572");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        java.util.Properties properties2 = hikariConfig1.getDataSourceProperties();
        java.util.Properties properties4 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig5 = new com.zaxxer.hikari.HikariConfig(properties4);
        boolean boolean6 = hikariConfig5.isInitializationFailFast();
        hikariConfig5.setInitializationFailFast(true);
        javax.sql.DataSource dataSource9 = null;
        hikariConfig5.setDataSource(dataSource9);
        hikariConfig5.setAcquireRetryDelay((long) 'a');
        java.lang.String str13 = hikariConfig5.getConnectionCustomizerClassName();
        hikariConfig5.setConnectionCustomizerClassName("hi!");
        java.lang.String str16 = hikariConfig5.getConnectionInitSql();
        hikariConfig1.addDataSourceProperty("hi!", (java.lang.Object) hikariConfig5);
        java.lang.String str18 = hikariConfig1.getConnectionCustomizerClassName();
        hikariConfig1.setMaximumPoolSize((int) '#');
        javax.sql.DataSource dataSource21 = hikariConfig1.getDataSource();
        org.junit.Assert.assertNotNull(properties2);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertNull(dataSource21);
    }

    @Test
    public void test03573() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03573");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        boolean boolean2 = hikariConfig1.isInitializationFailFast();
        hikariConfig1.setInitializationFailFast(true);
        javax.sql.DataSource dataSource5 = null;
        hikariConfig1.setDataSource(dataSource5);
        hikariConfig1.setAcquireRetryDelay((long) 'a');
        java.lang.String str9 = hikariConfig1.getConnectionCustomizerClassName();
        int int10 = hikariConfig1.getAcquireRetries();
        java.lang.String str11 = hikariConfig1.getDataSourceClassName();
        javax.sql.DataSource dataSource12 = null;
        hikariConfig1.setDataSource(dataSource12);
        long long14 = hikariConfig1.getIdleTimeout();
        boolean boolean15 = hikariConfig1.isRegisterMbeans();
        java.lang.String str16 = hikariConfig1.getCatalog();
        hikariConfig1.setLeakDetectionThreshold(2147483647L);
        java.util.Properties properties19 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig20 = new com.zaxxer.hikari.HikariConfig(properties19);
        boolean boolean21 = hikariConfig20.isInitializationFailFast();
        hikariConfig20.setInitializationFailFast(true);
        int int24 = hikariConfig20.getAcquireRetries();
        hikariConfig20.setCatalog("HikariPool-143");
        int int27 = hikariConfig20.getMinimumPoolSize();
        java.util.Properties properties28 = hikariConfig20.getDataSourceProperties();
        com.zaxxer.hikari.HikariConfig hikariConfig29 = new com.zaxxer.hikari.HikariConfig(properties28);
        com.zaxxer.hikari.HikariConfig hikariConfig30 = new com.zaxxer.hikari.HikariConfig(properties28);
        hikariConfig1.setDataSourceProperties(properties28);
        // The following exception was thrown during execution in test generation
        try {
            hikariConfig1.validate();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: one of either dataSource or dataSourceClassName must be specified");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 3 + "'", int10 == 3);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 600000L + "'", long14 == 600000L);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 3 + "'", int24 == 3);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 10 + "'", int27 == 10);
        org.junit.Assert.assertNotNull(properties28);
    }

    @Test
    public void test03574() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03574");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        boolean boolean2 = hikariConfig1.isInitializationFailFast();
        hikariConfig1.setInitializationFailFast(true);
        int int5 = hikariConfig1.getAcquireRetries();
        boolean boolean6 = hikariConfig1.isRegisterMbeans();
        java.util.Properties properties7 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig8 = new com.zaxxer.hikari.HikariConfig(properties7);
        boolean boolean9 = hikariConfig8.isInitializationFailFast();
        hikariConfig8.setInitializationFailFast(true);
        javax.sql.DataSource dataSource12 = null;
        hikariConfig8.setDataSource(dataSource12);
        hikariConfig8.setAcquireRetryDelay((long) 'a');
        java.lang.String str16 = hikariConfig8.getConnectionCustomizerClassName();
        java.lang.String str17 = hikariConfig8.getConnectionInitSql();
        boolean boolean18 = hikariConfig8.isRegisterMbeans();
        java.lang.String str19 = hikariConfig8.getCatalog();
        java.util.Properties properties20 = hikariConfig8.getDataSourceProperties();
        hikariConfig1.setDataSourceProperties(properties20);
        com.zaxxer.hikari.HikariConfig hikariConfig22 = new com.zaxxer.hikari.HikariConfig(properties20);
        hikariConfig22.setConnectionInitSql("HikariPool-3548");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 3 + "'", int5 == 3);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNull(str19);
        org.junit.Assert.assertNotNull(properties20);
    }

    @Test
    public void test03575() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03575");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        boolean boolean2 = hikariConfig1.isInitializationFailFast();
        hikariConfig1.setInitializationFailFast(true);
        int int5 = hikariConfig1.getAcquireRetries();
        java.lang.String str6 = hikariConfig1.getPoolName();
        java.util.Properties properties8 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig9 = new com.zaxxer.hikari.HikariConfig(properties8);
        boolean boolean10 = hikariConfig9.isInitializationFailFast();
        hikariConfig9.setInitializationFailFast(true);
        hikariConfig9.setAcquireRetryDelay(1L);
        hikariConfig9.setMaximumPoolSize((int) '#');
        java.lang.String str17 = hikariConfig9.getConnectionInitSql();
        hikariConfig9.setConnectionInitSql("HikariPool-442");
        hikariConfig1.addDataSourceProperty("HikariPool-2934", (java.lang.Object) "HikariPool-442");
        java.lang.String str21 = hikariConfig1.getPoolName();
        hikariConfig1.setMaximumPoolSize(1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 3 + "'", int5 == 3);
// flaky:         org.junit.Assert.assertEquals("'" + str6 + "' != '" + "HikariPool-30620" + "'", str6, "HikariPool-30620");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNull(str17);
// flaky:         org.junit.Assert.assertEquals("'" + str21 + "' != '" + "HikariPool-30620" + "'", str21, "HikariPool-30620");
    }

    @Test
    public void test03576() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03576");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        boolean boolean2 = hikariConfig1.isInitializationFailFast();
        hikariConfig1.setTransactionIsolation("hi!");
        java.util.Properties properties5 = hikariConfig1.getDataSourceProperties();
        long long6 = hikariConfig1.getConnectionTimeout();
        hikariConfig1.setInitializationFailFast(true);
        boolean boolean9 = hikariConfig1.isAutoCommit();
        javax.sql.DataSource dataSource10 = hikariConfig1.getDataSource();
        java.util.Properties properties11 = hikariConfig1.getDataSourceProperties();
        hikariConfig1.setConnectionInitSql("HikariPool-414");
        javax.sql.DataSource dataSource14 = hikariConfig1.getDataSource();
        hikariConfig1.setInitializationFailFast(false);
        // The following exception was thrown during execution in test generation
        try {
            hikariConfig1.setAcquireRetries((int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: acquireRetries cannot be negative");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(properties5);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 5000L + "'", long6 == 5000L);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNull(dataSource10);
        org.junit.Assert.assertNotNull(properties11);
        org.junit.Assert.assertNull(dataSource14);
    }

    @Test
    public void test03577() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03577");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        boolean boolean2 = hikariConfig1.isInitializationFailFast();
        hikariConfig1.setInitializationFailFast(true);
        javax.sql.DataSource dataSource5 = null;
        hikariConfig1.setDataSource(dataSource5);
        java.lang.String str7 = hikariConfig1.getCatalog();
        int int8 = hikariConfig1.getMinimumPoolSize();
        boolean boolean9 = hikariConfig1.isInitializationFailFast();
        long long10 = hikariConfig1.getIdleTimeout();
        hikariConfig1.setCatalog("HikariPool-1974");
        boolean boolean13 = hikariConfig1.isInitializationFailFast();
        java.lang.String str14 = hikariConfig1.getPoolName();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 10 + "'", int8 == 10);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 600000L + "'", long10 == 600000L);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
// flaky:         org.junit.Assert.assertEquals("'" + str14 + "' != '" + "HikariPool-30624" + "'", str14, "HikariPool-30624");
    }

    @Test
    public void test03578() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03578");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        boolean boolean2 = hikariConfig1.isInitializationFailFast();
        hikariConfig1.setInitializationFailFast(true);
        javax.sql.DataSource dataSource5 = null;
        hikariConfig1.setDataSource(dataSource5);
        java.lang.String str7 = hikariConfig1.getCatalog();
        javax.sql.DataSource dataSource8 = null;
        hikariConfig1.setDataSource(dataSource8);
        long long10 = hikariConfig1.getIdleTimeout();
        java.lang.String str11 = hikariConfig1.getDataSourceClassName();
        hikariConfig1.setTransactionIsolation("HikariPool-26296");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 600000L + "'", long10 == 600000L);
        org.junit.Assert.assertNull(str11);
    }

    @Test
    public void test03579() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03579");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        boolean boolean2 = hikariConfig1.isInitializationFailFast();
        boolean boolean3 = hikariConfig1.isJdbc4ConnectionTest();
        javax.sql.DataSource dataSource4 = null;
        hikariConfig1.setDataSource(dataSource4);
        long long6 = hikariConfig1.getIdleTimeout();
        hikariConfig1.setConnectionCustomizerClassName("HikariPool-184");
        long long9 = hikariConfig1.getIdleTimeout();
        javax.sql.DataSource dataSource10 = null;
        hikariConfig1.setDataSource(dataSource10);
        hikariConfig1.setAcquireRetries((int) (short) 100);
        java.lang.String str14 = hikariConfig1.getPoolName();
        hikariConfig1.setConnectionCustomizerClassName("HikariPool-29019");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 600000L + "'", long6 == 600000L);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 600000L + "'", long9 == 600000L);
// flaky:         org.junit.Assert.assertEquals("'" + str14 + "' != '" + "HikariPool-30626" + "'", str14, "HikariPool-30626");
    }

    @Test
    public void test03580() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03580");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        boolean boolean2 = hikariConfig1.isInitializationFailFast();
        hikariConfig1.setInitializationFailFast(true);
        javax.sql.DataSource dataSource5 = null;
        hikariConfig1.setDataSource(dataSource5);
        java.lang.String str7 = hikariConfig1.getCatalog();
        int int8 = hikariConfig1.getTransactionIsolation();
        int int9 = hikariConfig1.getMaximumPoolSize();
        hikariConfig1.setJdbc4ConnectionTest(true);
        hikariConfig1.setUseInstrumentation(false);
        hikariConfig1.setTransactionIsolation("HikariPool-594");
        java.lang.String str16 = hikariConfig1.getConnectionInitSql();
        java.lang.Class<?> wildcardClass17 = hikariConfig1.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 60 + "'", int9 == 60);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test03581() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03581");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        boolean boolean2 = hikariConfig1.isInitializationFailFast();
        hikariConfig1.setInitializationFailFast(true);
        javax.sql.DataSource dataSource5 = null;
        hikariConfig1.setDataSource(dataSource5);
        java.lang.String str7 = hikariConfig1.getCatalog();
        int int8 = hikariConfig1.getTransactionIsolation();
        long long9 = hikariConfig1.getMaxLifetime();
        int int10 = hikariConfig1.getAcquireIncrement();
        int int11 = hikariConfig1.getAcquireRetries();
        int int12 = hikariConfig1.getMaximumPoolSize();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 1800000L + "'", long9 == 1800000L);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 3 + "'", int11 == 3);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 60 + "'", int12 == 60);
    }

    @Test
    public void test03582() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03582");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        boolean boolean2 = hikariConfig1.isInitializationFailFast();
        hikariConfig1.setLeakDetectionThreshold((long) '4');
        java.lang.String str5 = hikariConfig1.getConnectionTestQuery();
        hikariConfig1.setTransactionIsolation("HikariPool-393");
        boolean boolean8 = hikariConfig1.isAutoCommit();
        int int9 = hikariConfig1.getMinimumPoolSize();
        int int10 = hikariConfig1.getMinimumPoolSize();
        java.util.Properties properties12 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig13 = new com.zaxxer.hikari.HikariConfig(properties12);
        boolean boolean14 = hikariConfig13.isInitializationFailFast();
        hikariConfig13.setInitializationFailFast(true);
        hikariConfig13.setCatalog("HikariPool-143");
        hikariConfig13.setConnectionTestQuery("HikariPool-414");
        hikariConfig1.addDataSourceProperty("HikariPool-2872", (java.lang.Object) "HikariPool-414");
        // The following exception was thrown during execution in test generation
        try {
            hikariConfig1.setConnectionTimeout((long) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: connectionTimeout cannot be less than 100ms");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 10 + "'", int9 == 10);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 10 + "'", int10 == 10);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test03583() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03583");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        java.util.Properties properties2 = hikariConfig1.getDataSourceProperties();
        java.util.Properties properties4 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig5 = new com.zaxxer.hikari.HikariConfig(properties4);
        boolean boolean6 = hikariConfig5.isInitializationFailFast();
        hikariConfig5.setInitializationFailFast(true);
        javax.sql.DataSource dataSource9 = null;
        hikariConfig5.setDataSource(dataSource9);
        hikariConfig5.setAcquireRetryDelay((long) 'a');
        java.lang.String str13 = hikariConfig5.getConnectionCustomizerClassName();
        hikariConfig5.setConnectionCustomizerClassName("hi!");
        java.lang.String str16 = hikariConfig5.getConnectionInitSql();
        hikariConfig1.addDataSourceProperty("hi!", (java.lang.Object) hikariConfig5);
        hikariConfig1.setDataSourceClassName("hi!");
        long long20 = hikariConfig1.getMaxLifetime();
        boolean boolean21 = hikariConfig1.isJdbc4ConnectionTest();
        boolean boolean22 = hikariConfig1.isJdbc4ConnectionTest();
        hikariConfig1.setAutoCommit(false);
        java.lang.String str25 = hikariConfig1.getConnectionCustomizerClassName();
        org.junit.Assert.assertNotNull(properties2);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 1800000L + "'", long20 == 1800000L);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertNull(str25);
    }

    @Test
    public void test03584() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03584");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        java.util.Properties properties2 = hikariConfig1.getDataSourceProperties();
        long long3 = hikariConfig1.getAcquireRetryDelay();
        java.lang.String str4 = hikariConfig1.getCatalog();
        int int5 = hikariConfig1.getTransactionIsolation();
        hikariConfig1.setPoolName("HikariPool-8073");
        java.lang.String str8 = hikariConfig1.getCatalog();
        java.util.Properties properties10 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig11 = new com.zaxxer.hikari.HikariConfig(properties10);
        boolean boolean12 = hikariConfig11.isInitializationFailFast();
        hikariConfig11.setInitializationFailFast(true);
        boolean boolean15 = hikariConfig11.isJdbc4ConnectionTest();
        hikariConfig11.setConnectionTestQuery("HikariPool-143");
        hikariConfig11.setMaxLifetime((long) (byte) 1);
        hikariConfig11.setMaxLifetime(60L);
        hikariConfig11.setMinimumPoolSize((int) (short) 100);
        hikariConfig1.addDataSourceProperty("HikariPool-4367", (java.lang.Object) (short) 100);
        int int25 = hikariConfig1.getMaximumPoolSize();
        javax.sql.DataSource dataSource26 = null;
        hikariConfig1.setDataSource(dataSource26);
        org.junit.Assert.assertNotNull(properties2);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 60 + "'", int25 == 60);
    }

    @Test
    public void test03585() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03585");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        boolean boolean2 = hikariConfig1.isInitializationFailFast();
        hikariConfig1.setInitializationFailFast(true);
        java.lang.String str5 = hikariConfig1.getConnectionTestQuery();
        hikariConfig1.setDataSourceClassName("");
        java.util.Properties properties9 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig10 = new com.zaxxer.hikari.HikariConfig(properties9);
        boolean boolean11 = hikariConfig10.isInitializationFailFast();
        hikariConfig10.setInitializationFailFast(true);
        int int14 = hikariConfig10.getAcquireRetries();
        long long15 = hikariConfig10.getMaxLifetime();
        hikariConfig10.setMaxLifetime((long) (short) 0);
        long long18 = hikariConfig10.getIdleTimeout();
        boolean boolean19 = hikariConfig10.isRegisterMbeans();
        long long20 = hikariConfig10.getAcquireRetryDelay();
        hikariConfig1.addDataSourceProperty("HikariPool-184", (java.lang.Object) long20);
        java.lang.String str22 = hikariConfig1.getCatalog();
        hikariConfig1.setUseInstrumentation(true);
        java.lang.String str25 = hikariConfig1.getDataSourceClassName();
        long long26 = hikariConfig1.getLeakDetectionThreshold();
        hikariConfig1.setConnectionCustomizerClassName("HikariPool-17484");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 3 + "'", int14 == 3);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 1800000L + "'", long15 == 1800000L);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 600000L + "'", long18 == 600000L);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 0L + "'", long20 == 0L);
        org.junit.Assert.assertNull(str22);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "" + "'", str25, "");
        org.junit.Assert.assertTrue("'" + long26 + "' != '" + 0L + "'", long26 == 0L);
    }

    @Test
    public void test03586() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03586");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        boolean boolean2 = hikariConfig1.isInitializationFailFast();
        boolean boolean3 = hikariConfig1.isJdbc4ConnectionTest();
        long long4 = hikariConfig1.getConnectionTimeout();
        int int5 = hikariConfig1.getTransactionIsolation();
        hikariConfig1.setLeakDetectionThreshold(600000L);
        boolean boolean8 = hikariConfig1.isRegisterMbeans();
        int int9 = hikariConfig1.getMinimumPoolSize();
        java.lang.Class<?> wildcardClass10 = hikariConfig1.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 5000L + "'", long4 == 5000L);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 10 + "'", int9 == 10);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test03587() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03587");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        boolean boolean2 = hikariConfig1.isInitializationFailFast();
        hikariConfig1.setTransactionIsolation("hi!");
        java.util.Properties properties5 = hikariConfig1.getDataSourceProperties();
        long long6 = hikariConfig1.getConnectionTimeout();
        hikariConfig1.setInitializationFailFast(true);
        long long9 = hikariConfig1.getIdleTimeout();
        hikariConfig1.setRegisterMbeans(false);
        hikariConfig1.setTransactionIsolation("HikariPool-11190");
        long long14 = hikariConfig1.getAcquireRetryDelay();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(properties5);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 5000L + "'", long6 == 5000L);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 600000L + "'", long9 == 600000L);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 0L + "'", long14 == 0L);
    }

    @Test
    public void test03588() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03588");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        boolean boolean2 = hikariConfig1.isInitializationFailFast();
        boolean boolean3 = hikariConfig1.isJdbc4ConnectionTest();
        javax.sql.DataSource dataSource4 = null;
        hikariConfig1.setDataSource(dataSource4);
        hikariConfig1.setCatalog("");
        hikariConfig1.setJdbc4ConnectionTest(true);
        boolean boolean10 = hikariConfig1.isInitializationFailFast();
        int int11 = hikariConfig1.getAcquireRetries();
        java.lang.String str12 = hikariConfig1.getPoolName();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 3 + "'", int11 == 3);
// flaky:         org.junit.Assert.assertEquals("'" + str12 + "' != '" + "HikariPool-30670" + "'", str12, "HikariPool-30670");
    }

    @Test
    public void test03589() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03589");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        boolean boolean2 = hikariConfig1.isInitializationFailFast();
        hikariConfig1.setInitializationFailFast(true);
        javax.sql.DataSource dataSource5 = null;
        hikariConfig1.setDataSource(dataSource5);
        hikariConfig1.setAcquireRetryDelay((long) 'a');
        java.lang.String str9 = hikariConfig1.getConnectionCustomizerClassName();
        java.util.Properties properties10 = hikariConfig1.getDataSourceProperties();
        java.util.Properties properties11 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig12 = new com.zaxxer.hikari.HikariConfig(properties11);
        java.util.Properties properties13 = hikariConfig12.getDataSourceProperties();
        hikariConfig1.setDataSourceProperties(properties13);
        boolean boolean15 = hikariConfig1.isAutoCommit();
        boolean boolean16 = hikariConfig1.isRegisterMbeans();
        long long17 = hikariConfig1.getConnectionTimeout();
        hikariConfig1.setIdleTimeout((long) 52);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNotNull(properties10);
        org.junit.Assert.assertNotNull(properties13);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 5000L + "'", long17 == 5000L);
    }

    @Test
    public void test03590() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03590");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        boolean boolean2 = hikariConfig1.isInitializationFailFast();
        hikariConfig1.setInitializationFailFast(true);
        javax.sql.DataSource dataSource5 = null;
        hikariConfig1.setDataSource(dataSource5);
        hikariConfig1.setAcquireRetryDelay((long) 'a');
        java.lang.String str9 = hikariConfig1.getConnectionCustomizerClassName();
        java.util.Properties properties10 = hikariConfig1.getDataSourceProperties();
        hikariConfig1.setAutoCommit(false);
        int int13 = hikariConfig1.getMaximumPoolSize();
        hikariConfig1.setIdleTimeout(0L);
        boolean boolean16 = hikariConfig1.isAutoCommit();
        boolean boolean17 = hikariConfig1.isAutoCommit();
        int int18 = hikariConfig1.getMaximumPoolSize();
        hikariConfig1.setPoolName("HikariPool-9767");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNotNull(properties10);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 60 + "'", int13 == 60);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 60 + "'", int18 == 60);
    }

    @Test
    public void test03591() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03591");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        boolean boolean2 = hikariConfig1.isInitializationFailFast();
        hikariConfig1.setInitializationFailFast(true);
        int int5 = hikariConfig1.getAcquireRetries();
        hikariConfig1.setCatalog("HikariPool-143");
        java.util.Properties properties9 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig10 = new com.zaxxer.hikari.HikariConfig(properties9);
        boolean boolean11 = hikariConfig10.isInitializationFailFast();
        hikariConfig10.setInitializationFailFast(true);
        boolean boolean14 = hikariConfig10.isJdbc4ConnectionTest();
        long long15 = hikariConfig10.getConnectionTimeout();
        hikariConfig10.setPoolName("hi!");
        hikariConfig10.setAcquireIncrement((int) (byte) 100);
        long long20 = hikariConfig10.getLeakDetectionThreshold();
        hikariConfig1.addDataSourceProperty("HikariPool-663", (java.lang.Object) hikariConfig10);
        long long22 = hikariConfig10.getConnectionTimeout();
        boolean boolean23 = hikariConfig10.isJdbc4ConnectionTest();
        hikariConfig10.setJdbc4ConnectionTest(false);
        long long26 = hikariConfig10.getIdleTimeout();
        long long27 = hikariConfig10.getConnectionTimeout();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 3 + "'", int5 == 3);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 5000L + "'", long15 == 5000L);
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 0L + "'", long20 == 0L);
        org.junit.Assert.assertTrue("'" + long22 + "' != '" + 5000L + "'", long22 == 5000L);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + long26 + "' != '" + 600000L + "'", long26 == 600000L);
        org.junit.Assert.assertTrue("'" + long27 + "' != '" + 5000L + "'", long27 == 5000L);
    }

    @Test
    public void test03592() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03592");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        boolean boolean2 = hikariConfig1.isInitializationFailFast();
        hikariConfig1.setInitializationFailFast(true);
        javax.sql.DataSource dataSource5 = null;
        hikariConfig1.setDataSource(dataSource5);
        hikariConfig1.setAcquireRetryDelay((long) 'a');
        java.lang.String str9 = hikariConfig1.getConnectionCustomizerClassName();
        java.util.Properties properties10 = hikariConfig1.getDataSourceProperties();
        hikariConfig1.setAutoCommit(false);
        hikariConfig1.setInitializationFailFast(false);
        int int15 = hikariConfig1.getMaximumPoolSize();
        boolean boolean16 = hikariConfig1.isRegisterMbeans();
        hikariConfig1.setJdbc4ConnectionTest(true);
        java.lang.String str19 = hikariConfig1.getConnectionTestQuery();
        hikariConfig1.setAutoCommit(true);
        java.util.Properties properties23 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig24 = new com.zaxxer.hikari.HikariConfig(properties23);
        boolean boolean25 = hikariConfig24.isInitializationFailFast();
        hikariConfig24.setInitializationFailFast(true);
        javax.sql.DataSource dataSource28 = null;
        hikariConfig24.setDataSource(dataSource28);
        hikariConfig24.setAcquireRetryDelay((long) 'a');
        java.lang.String str32 = hikariConfig24.getConnectionCustomizerClassName();
        java.lang.String str33 = hikariConfig24.getConnectionInitSql();
        hikariConfig24.setDataSourceClassName("");
        hikariConfig24.setCatalog("HikariPool-1535");
        javax.sql.DataSource dataSource38 = hikariConfig24.getDataSource();
        // The following exception was thrown during execution in test generation
        try {
            hikariConfig1.addDataSourceProperty("HikariPool-20503", (java.lang.Object) dataSource38);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNotNull(properties10);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 60 + "'", int15 == 60);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNull(str19);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNull(str32);
        org.junit.Assert.assertNull(str33);
        org.junit.Assert.assertNull(dataSource38);
    }

    @Test
    public void test03593() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03593");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        boolean boolean2 = hikariConfig1.isInitializationFailFast();
        boolean boolean3 = hikariConfig1.isJdbc4ConnectionTest();
        javax.sql.DataSource dataSource4 = null;
        hikariConfig1.setDataSource(dataSource4);
        long long6 = hikariConfig1.getIdleTimeout();
        hikariConfig1.setConnectionCustomizerClassName("HikariPool-184");
        hikariConfig1.setConnectionTestQuery("HikariPool-2833");
        long long11 = hikariConfig1.getConnectionTimeout();
        hikariConfig1.setMaxLifetime(100L);
        int int14 = hikariConfig1.getTransactionIsolation();
        hikariConfig1.setLeakDetectionThreshold(100L);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 600000L + "'", long6 == 600000L);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 5000L + "'", long11 == 5000L);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
    }

    @Test
    public void test03594() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03594");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        boolean boolean1 = hikariConfig0.isRegisterMbeans();
        java.util.Properties properties2 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig3 = new com.zaxxer.hikari.HikariConfig(properties2);
        boolean boolean4 = hikariConfig3.isInitializationFailFast();
        hikariConfig3.setInitializationFailFast(true);
        hikariConfig3.setAcquireRetryDelay(1L);
        boolean boolean9 = hikariConfig3.isAutoCommit();
        java.util.Properties properties10 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig11 = new com.zaxxer.hikari.HikariConfig(properties10);
        java.util.Properties properties12 = hikariConfig11.getDataSourceProperties();
        hikariConfig3.setDataSourceProperties(properties12);
        hikariConfig0.setDataSourceProperties(properties12);
        boolean boolean15 = hikariConfig0.isRegisterMbeans();
        java.lang.String str16 = hikariConfig0.getConnectionInitSql();
        hikariConfig0.setTransactionIsolation("HikariPool-7984");
        hikariConfig0.setCatalog("HikariPool-28718");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(properties12);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNull(str16);
    }

    @Test
    public void test03595() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03595");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        boolean boolean2 = hikariConfig1.isInitializationFailFast();
        hikariConfig1.setInitializationFailFast(true);
        javax.sql.DataSource dataSource5 = null;
        hikariConfig1.setDataSource(dataSource5);
        hikariConfig1.setAcquireRetryDelay((long) 'a');
        java.lang.String str9 = hikariConfig1.getConnectionCustomizerClassName();
        java.lang.String str10 = hikariConfig1.getConnectionInitSql();
        hikariConfig1.setDataSourceClassName("");
        java.util.Properties properties13 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig14 = new com.zaxxer.hikari.HikariConfig(properties13);
        boolean boolean15 = hikariConfig14.isInitializationFailFast();
        hikariConfig14.setInitializationFailFast(true);
        javax.sql.DataSource dataSource18 = null;
        hikariConfig14.setDataSource(dataSource18);
        hikariConfig14.setAcquireRetryDelay((long) 'a');
        java.lang.String str22 = hikariConfig14.getConnectionCustomizerClassName();
        java.util.Properties properties23 = hikariConfig14.getDataSourceProperties();
        java.util.Properties properties24 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig25 = new com.zaxxer.hikari.HikariConfig(properties24);
        java.util.Properties properties26 = hikariConfig25.getDataSourceProperties();
        hikariConfig14.setDataSourceProperties(properties26);
        hikariConfig1.setDataSourceProperties(properties26);
        long long29 = hikariConfig1.getConnectionTimeout();
        hikariConfig1.setInitializationFailFast(true);
        java.util.Properties properties33 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig34 = new com.zaxxer.hikari.HikariConfig(properties33);
        boolean boolean35 = hikariConfig34.isInitializationFailFast();
        hikariConfig34.setInitializationFailFast(true);
        javax.sql.DataSource dataSource38 = null;
        hikariConfig34.setDataSource(dataSource38);
        java.lang.String str40 = hikariConfig34.getCatalog();
        int int41 = hikariConfig34.getMinimumPoolSize();
        java.lang.String str42 = hikariConfig34.getCatalog();
        long long43 = hikariConfig34.getLeakDetectionThreshold();
        java.lang.String str44 = hikariConfig34.getConnectionInitSql();
        hikariConfig34.setAcquireIncrement(100);
        int int47 = hikariConfig34.getMinimumPoolSize();
        hikariConfig1.addDataSourceProperty("HikariPool-1195", (java.lang.Object) hikariConfig34);
        long long49 = hikariConfig1.getLeakDetectionThreshold();
        hikariConfig1.setTransactionIsolation("HikariPool-3548");
        java.util.Properties properties53 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig54 = new com.zaxxer.hikari.HikariConfig(properties53);
        boolean boolean55 = hikariConfig54.isInitializationFailFast();
        hikariConfig54.setTransactionIsolation("hi!");
        java.util.Properties properties58 = hikariConfig54.getDataSourceProperties();
        long long59 = hikariConfig54.getConnectionTimeout();
        hikariConfig1.addDataSourceProperty("HikariPool-2035", (java.lang.Object) hikariConfig54);
        hikariConfig54.setMinimumPoolSize(35);
        hikariConfig54.setAcquireRetryDelay((long) '4');
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNull(str22);
        org.junit.Assert.assertNotNull(properties23);
        org.junit.Assert.assertNotNull(properties26);
        org.junit.Assert.assertTrue("'" + long29 + "' != '" + 5000L + "'", long29 == 5000L);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertNull(str40);
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 10 + "'", int41 == 10);
        org.junit.Assert.assertNull(str42);
        org.junit.Assert.assertTrue("'" + long43 + "' != '" + 0L + "'", long43 == 0L);
        org.junit.Assert.assertNull(str44);
        org.junit.Assert.assertTrue("'" + int47 + "' != '" + 10 + "'", int47 == 10);
        org.junit.Assert.assertTrue("'" + long49 + "' != '" + 0L + "'", long49 == 0L);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + false + "'", boolean55 == false);
        org.junit.Assert.assertNotNull(properties58);
        org.junit.Assert.assertTrue("'" + long59 + "' != '" + 5000L + "'", long59 == 5000L);
    }

    @Test
    public void test03596() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03596");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        boolean boolean2 = hikariConfig1.isInitializationFailFast();
        hikariConfig1.setInitializationFailFast(true);
        javax.sql.DataSource dataSource5 = null;
        hikariConfig1.setDataSource(dataSource5);
        hikariConfig1.setAcquireRetryDelay((long) 'a');
        java.lang.String str9 = hikariConfig1.getConnectionCustomizerClassName();
        java.lang.String str10 = hikariConfig1.getConnectionInitSql();
        long long11 = hikariConfig1.getLeakDetectionThreshold();
        hikariConfig1.setConnectionTestQuery("HikariPool-393");
        hikariConfig1.setDataSourceClassName("HikariPool-481");
        hikariConfig1.setPoolName("hi!");
        java.util.Properties properties18 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig19 = new com.zaxxer.hikari.HikariConfig(properties18);
        hikariConfig19.setTransactionIsolation("");
        hikariConfig19.setConnectionTestQuery("HikariPool-143");
        java.util.Properties properties24 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig25 = new com.zaxxer.hikari.HikariConfig(properties24);
        boolean boolean26 = hikariConfig25.isInitializationFailFast();
        hikariConfig25.setInitializationFailFast(true);
        hikariConfig25.setAcquireRetryDelay(1L);
        boolean boolean31 = hikariConfig25.isAutoCommit();
        java.util.Properties properties32 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig33 = new com.zaxxer.hikari.HikariConfig(properties32);
        java.util.Properties properties34 = hikariConfig33.getDataSourceProperties();
        hikariConfig25.setDataSourceProperties(properties34);
        hikariConfig19.setDataSourceProperties(properties34);
        hikariConfig1.setDataSourceProperties(properties34);
        com.zaxxer.hikari.HikariConfig hikariConfig38 = new com.zaxxer.hikari.HikariConfig(properties34);
        hikariConfig38.setUseInstrumentation(true);
        hikariConfig38.setLeakDetectionThreshold((long) (-1));
        hikariConfig38.setMaxLifetime((long) 10);
        hikariConfig38.setMaximumPoolSize(35);
        // The following exception was thrown during execution in test generation
        try {
            hikariConfig38.setConnectionTimeout((long) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: connectionTimeout cannot be less than 100ms");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 0L + "'", long11 == 0L);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + true + "'", boolean31 == true);
        org.junit.Assert.assertNotNull(properties34);
    }

    @Test
    public void test03597() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03597");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        boolean boolean2 = hikariConfig1.isInitializationFailFast();
        hikariConfig1.setInitializationFailFast(true);
        javax.sql.DataSource dataSource5 = null;
        hikariConfig1.setDataSource(dataSource5);
        hikariConfig1.setAcquireRetryDelay((long) 'a');
        java.lang.String str9 = hikariConfig1.getConnectionCustomizerClassName();
        java.lang.String str10 = hikariConfig1.getConnectionInitSql();
        boolean boolean11 = hikariConfig1.isRegisterMbeans();
        java.lang.String str12 = hikariConfig1.getCatalog();
        hikariConfig1.setDataSourceClassName("HikariPool-859");
        java.util.Properties properties15 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig16 = new com.zaxxer.hikari.HikariConfig(properties15);
        boolean boolean17 = hikariConfig16.isInitializationFailFast();
        hikariConfig16.setInitializationFailFast(true);
        boolean boolean20 = hikariConfig16.isJdbc4ConnectionTest();
        long long21 = hikariConfig16.getConnectionTimeout();
        hikariConfig16.setPoolName("hi!");
        hikariConfig16.setAcquireIncrement((int) (byte) 100);
        java.util.Properties properties26 = hikariConfig16.getDataSourceProperties();
        hikariConfig1.setDataSourceProperties(properties26);
        long long28 = hikariConfig1.getAcquireRetryDelay();
        hikariConfig1.setAcquireIncrement(35);
        javax.sql.DataSource dataSource31 = hikariConfig1.getDataSource();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + 5000L + "'", long21 == 5000L);
        org.junit.Assert.assertNotNull(properties26);
        org.junit.Assert.assertTrue("'" + long28 + "' != '" + 0L + "'", long28 == 0L);
        org.junit.Assert.assertNull(dataSource31);
    }

    @Test
    public void test03598() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03598");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        boolean boolean2 = hikariConfig1.isInitializationFailFast();
        int int3 = hikariConfig1.getAcquireIncrement();
        java.lang.String str4 = hikariConfig1.getConnectionCustomizerClassName();
        hikariConfig1.setAutoCommit(false);
        hikariConfig1.setRegisterMbeans(false);
        long long9 = hikariConfig1.getIdleTimeout();
        hikariConfig1.setConnectionTimeout((long) (short) 100);
        long long12 = hikariConfig1.getIdleTimeout();
        java.lang.Object obj14 = null;
        // The following exception was thrown during execution in test generation
        try {
            hikariConfig1.addDataSourceProperty("HikariPool-1644", obj14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 600000L + "'", long9 == 600000L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 600000L + "'", long12 == 600000L);
    }

    @Test
    public void test03599() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03599");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        boolean boolean2 = hikariConfig1.isInitializationFailFast();
        hikariConfig1.setInitializationFailFast(true);
        javax.sql.DataSource dataSource5 = null;
        hikariConfig1.setDataSource(dataSource5);
        java.lang.String str7 = hikariConfig1.getCatalog();
        int int8 = hikariConfig1.getMinimumPoolSize();
        java.lang.String str9 = hikariConfig1.getCatalog();
        hikariConfig1.setIdleTimeout((long) (short) 10);
        hikariConfig1.setInitializationFailFast(false);
        java.lang.String str14 = hikariConfig1.getPoolName();
        javax.sql.DataSource dataSource15 = hikariConfig1.getDataSource();
        java.util.Properties properties16 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig17 = new com.zaxxer.hikari.HikariConfig(properties16);
        boolean boolean18 = hikariConfig17.isInitializationFailFast();
        hikariConfig17.setInitializationFailFast(true);
        boolean boolean21 = hikariConfig17.isJdbc4ConnectionTest();
        long long22 = hikariConfig17.getConnectionTimeout();
        hikariConfig17.setPoolName("hi!");
        hikariConfig17.setAcquireIncrement((int) (byte) 100);
        java.util.Properties properties27 = hikariConfig17.getDataSourceProperties();
        hikariConfig17.setMinimumPoolSize((int) (byte) 1);
        java.util.Properties properties30 = hikariConfig17.getDataSourceProperties();
        hikariConfig1.setDataSourceProperties(properties30);
        java.util.Properties properties32 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig33 = new com.zaxxer.hikari.HikariConfig(properties32);
        boolean boolean34 = hikariConfig33.isInitializationFailFast();
        hikariConfig33.setInitializationFailFast(true);
        hikariConfig33.setAcquireRetryDelay(1L);
        hikariConfig33.setConnectionTimeout(600000L);
        hikariConfig33.setConnectionCustomizerClassName("HikariPool-143");
        java.lang.String str43 = hikariConfig33.getConnectionTestQuery();
        java.util.Properties properties44 = hikariConfig33.getDataSourceProperties();
        com.zaxxer.hikari.HikariConfig hikariConfig45 = new com.zaxxer.hikari.HikariConfig(properties44);
        hikariConfig1.setDataSourceProperties(properties44);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 10 + "'", int8 == 10);
        org.junit.Assert.assertNull(str9);
// flaky:         org.junit.Assert.assertEquals("'" + str14 + "' != '" + "HikariPool-30723" + "'", str14, "HikariPool-30723");
        org.junit.Assert.assertNull(dataSource15);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertTrue("'" + long22 + "' != '" + 5000L + "'", long22 == 5000L);
        org.junit.Assert.assertNotNull(properties27);
        org.junit.Assert.assertNotNull(properties30);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertNull(str43);
        org.junit.Assert.assertNotNull(properties44);
    }

    @Test
    public void test03600() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03600");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        boolean boolean2 = hikariConfig1.isInitializationFailFast();
        int int3 = hikariConfig1.getAcquireIncrement();
        hikariConfig1.setConnectionCustomizerClassName("HikariPool-391");
        boolean boolean6 = hikariConfig1.isJdbc4ConnectionTest();
        java.lang.String str7 = hikariConfig1.getPoolName();
        int int8 = hikariConfig1.getAcquireIncrement();
        int int9 = hikariConfig1.getMinimumPoolSize();
        hikariConfig1.setMaxLifetime((long) (byte) 100);
        long long12 = hikariConfig1.getMaxLifetime();
        hikariConfig1.setIdleTimeout((long) '4');
        hikariConfig1.setAcquireRetryDelay(2147483647L);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "HikariPool-30727" + "'", str7, "HikariPool-30727");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 10 + "'", int9 == 10);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 100L + "'", long12 == 100L);
    }

    @Test
    public void test03601() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03601");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        boolean boolean2 = hikariConfig1.isInitializationFailFast();
        hikariConfig1.setLeakDetectionThreshold((long) '4');
        java.lang.String str5 = hikariConfig1.getConnectionCustomizerClassName();
        java.util.Properties properties6 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig7 = new com.zaxxer.hikari.HikariConfig(properties6);
        boolean boolean8 = hikariConfig7.isInitializationFailFast();
        hikariConfig7.setInitializationFailFast(true);
        javax.sql.DataSource dataSource11 = null;
        hikariConfig7.setDataSource(dataSource11);
        hikariConfig7.setAcquireRetryDelay((long) 'a');
        java.lang.String str15 = hikariConfig7.getConnectionCustomizerClassName();
        java.util.Properties properties16 = hikariConfig7.getDataSourceProperties();
        java.util.Properties properties17 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig18 = new com.zaxxer.hikari.HikariConfig(properties17);
        java.util.Properties properties19 = hikariConfig18.getDataSourceProperties();
        hikariConfig7.setDataSourceProperties(properties19);
        hikariConfig1.setDataSourceProperties(properties19);
        com.zaxxer.hikari.HikariConfig hikariConfig22 = new com.zaxxer.hikari.HikariConfig(properties19);
        com.zaxxer.hikari.HikariConfig hikariConfig23 = new com.zaxxer.hikari.HikariConfig(properties19);
        com.zaxxer.hikari.HikariConfig hikariConfig24 = new com.zaxxer.hikari.HikariConfig(properties19);
        java.util.Properties properties25 = hikariConfig24.getDataSourceProperties();
        com.zaxxer.hikari.HikariConfig hikariConfig26 = new com.zaxxer.hikari.HikariConfig(properties25);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertNotNull(properties16);
        org.junit.Assert.assertNotNull(properties19);
        org.junit.Assert.assertNotNull(properties25);
    }

    @Test
    public void test03602() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03602");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        boolean boolean2 = hikariConfig1.isInitializationFailFast();
        hikariConfig1.setInitializationFailFast(true);
        javax.sql.DataSource dataSource5 = null;
        hikariConfig1.setDataSource(dataSource5);
        java.lang.String str7 = hikariConfig1.getCatalog();
        int int8 = hikariConfig1.getMinimumPoolSize();
        hikariConfig1.setUseInstrumentation(false);
        boolean boolean11 = hikariConfig1.isAutoCommit();
        hikariConfig1.setAcquireRetries((int) (byte) 0);
        boolean boolean14 = hikariConfig1.isJdbc4ConnectionTest();
        hikariConfig1.setDataSourceClassName("HikariPool-587");
        hikariConfig1.setDataSourceClassName("HikariPool-29749");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 10 + "'", int8 == 10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
    }

    @Test
    public void test03603() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03603");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        boolean boolean2 = hikariConfig1.isInitializationFailFast();
        hikariConfig1.setInitializationFailFast(true);
        boolean boolean5 = hikariConfig1.isJdbc4ConnectionTest();
        long long6 = hikariConfig1.getConnectionTimeout();
        hikariConfig1.setConnectionCustomizerClassName("HikariPool-3351");
        int int9 = hikariConfig1.getMinimumPoolSize();
        long long10 = hikariConfig1.getLeakDetectionThreshold();
        hikariConfig1.setUseInstrumentation(true);
        hikariConfig1.setCatalog("HikariPool-13970");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 5000L + "'", long6 == 5000L);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 10 + "'", int9 == 10);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
    }

    @Test
    public void test03604() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03604");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        boolean boolean2 = hikariConfig1.isInitializationFailFast();
        hikariConfig1.setInitializationFailFast(true);
        hikariConfig1.setAcquireRetryDelay(1L);
        boolean boolean7 = hikariConfig1.isAutoCommit();
        java.util.Properties properties8 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig9 = new com.zaxxer.hikari.HikariConfig(properties8);
        java.util.Properties properties10 = hikariConfig9.getDataSourceProperties();
        hikariConfig1.setDataSourceProperties(properties10);
        java.lang.String str12 = hikariConfig1.getDataSourceClassName();
        hikariConfig1.setIdleTimeout((long) '4');
        hikariConfig1.setPoolName("HikariPool-6418");
        hikariConfig1.setAcquireRetries(100);
        boolean boolean19 = hikariConfig1.isJdbc4ConnectionTest();
        java.lang.String str20 = hikariConfig1.getCatalog();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(properties10);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertNull(str20);
    }

    @Test
    public void test03605() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03605");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        boolean boolean2 = hikariConfig1.isInitializationFailFast();
        hikariConfig1.setInitializationFailFast(true);
        javax.sql.DataSource dataSource5 = null;
        hikariConfig1.setDataSource(dataSource5);
        hikariConfig1.setAcquireRetryDelay((long) 'a');
        java.lang.String str9 = hikariConfig1.getConnectionCustomizerClassName();
        int int10 = hikariConfig1.getAcquireRetries();
        java.lang.String str11 = hikariConfig1.getDataSourceClassName();
        hikariConfig1.setIdleTimeout((long) 60);
        int int14 = hikariConfig1.getAcquireIncrement();
        int int15 = hikariConfig1.getAcquireIncrement();
        hikariConfig1.setConnectionCustomizerClassName("HikariPool-20184");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 3 + "'", int10 == 3);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
    }

    @Test
    public void test03606() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03606");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        boolean boolean2 = hikariConfig1.isInitializationFailFast();
        hikariConfig1.setTransactionIsolation("hi!");
        java.util.Properties properties5 = hikariConfig1.getDataSourceProperties();
        com.zaxxer.hikari.HikariConfig hikariConfig6 = new com.zaxxer.hikari.HikariConfig(properties5);
        hikariConfig6.setUseInstrumentation(false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(properties5);
    }

    @Test
    public void test03607() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03607");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        boolean boolean2 = hikariConfig1.isInitializationFailFast();
        hikariConfig1.setInitializationFailFast(true);
        javax.sql.DataSource dataSource5 = null;
        hikariConfig1.setDataSource(dataSource5);
        hikariConfig1.setAcquireRetryDelay((long) 'a');
        java.lang.String str9 = hikariConfig1.getConnectionCustomizerClassName();
        java.util.Properties properties10 = hikariConfig1.getDataSourceProperties();
        com.zaxxer.hikari.HikariConfig hikariConfig11 = new com.zaxxer.hikari.HikariConfig(properties10);
        hikariConfig11.setIdleTimeout(32L);
        hikariConfig11.setConnectionInitSql("HikariPool-18951");
        int int16 = hikariConfig11.getTransactionIsolation();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNotNull(properties10);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
    }

    @Test
    public void test03608() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03608");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        boolean boolean2 = hikariConfig1.isInitializationFailFast();
        boolean boolean3 = hikariConfig1.isJdbc4ConnectionTest();
        javax.sql.DataSource dataSource4 = null;
        hikariConfig1.setDataSource(dataSource4);
        long long6 = hikariConfig1.getIdleTimeout();
        java.util.Properties properties7 = hikariConfig1.getDataSourceProperties();
        com.zaxxer.hikari.HikariConfig hikariConfig8 = new com.zaxxer.hikari.HikariConfig(properties7);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 600000L + "'", long6 == 600000L);
        org.junit.Assert.assertNotNull(properties7);
    }

    @Test
    public void test03609() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03609");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        boolean boolean2 = hikariConfig1.isInitializationFailFast();
        hikariConfig1.setInitializationFailFast(true);
        java.lang.String str5 = hikariConfig1.getConnectionTestQuery();
        boolean boolean6 = hikariConfig1.isRegisterMbeans();
        hikariConfig1.setDataSourceClassName("hi!");
        hikariConfig1.setConnectionInitSql("");
        java.lang.String str11 = hikariConfig1.getCatalog();
        boolean boolean12 = hikariConfig1.isInitializationFailFast();
        hikariConfig1.setMaxLifetime((long) (byte) 0);
        hikariConfig1.setInitializationFailFast(true);
        javax.sql.DataSource dataSource17 = hikariConfig1.getDataSource();
        java.util.Properties properties18 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig19 = new com.zaxxer.hikari.HikariConfig(properties18);
        boolean boolean20 = hikariConfig19.isInitializationFailFast();
        hikariConfig19.setInitializationFailFast(true);
        javax.sql.DataSource dataSource23 = null;
        hikariConfig19.setDataSource(dataSource23);
        hikariConfig19.setAcquireRetryDelay((long) 'a');
        java.lang.String str27 = hikariConfig19.getConnectionCustomizerClassName();
        java.lang.String str28 = hikariConfig19.getConnectionInitSql();
        long long29 = hikariConfig19.getLeakDetectionThreshold();
        hikariConfig19.setConnectionTestQuery("HikariPool-393");
        hikariConfig19.setDataSourceClassName("HikariPool-481");
        hikariConfig19.setPoolName("hi!");
        java.util.Properties properties36 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig37 = new com.zaxxer.hikari.HikariConfig(properties36);
        boolean boolean38 = hikariConfig37.isInitializationFailFast();
        hikariConfig37.setInitializationFailFast(true);
        hikariConfig37.setAcquireRetryDelay(1L);
        boolean boolean43 = hikariConfig37.isAutoCommit();
        java.util.Properties properties44 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig45 = new com.zaxxer.hikari.HikariConfig(properties44);
        java.util.Properties properties46 = hikariConfig45.getDataSourceProperties();
        hikariConfig37.setDataSourceProperties(properties46);
        hikariConfig37.setCatalog("HikariPool-2120");
        java.lang.String str50 = hikariConfig37.getCatalog();
        java.util.Properties properties51 = hikariConfig37.getDataSourceProperties();
        com.zaxxer.hikari.HikariConfig hikariConfig52 = new com.zaxxer.hikari.HikariConfig(properties51);
        hikariConfig19.setDataSourceProperties(properties51);
        hikariConfig1.setDataSourceProperties(properties51);
        hikariConfig1.setPoolName("HikariPool-14209");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNull(dataSource17);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNull(str27);
        org.junit.Assert.assertNull(str28);
        org.junit.Assert.assertTrue("'" + long29 + "' != '" + 0L + "'", long29 == 0L);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + true + "'", boolean43 == true);
        org.junit.Assert.assertNotNull(properties46);
        org.junit.Assert.assertEquals("'" + str50 + "' != '" + "HikariPool-2120" + "'", str50, "HikariPool-2120");
        org.junit.Assert.assertNotNull(properties51);
    }

    @Test
    public void test03610() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03610");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        boolean boolean2 = hikariConfig1.isInitializationFailFast();
        hikariConfig1.setInitializationFailFast(true);
        hikariConfig1.setAcquireRetryDelay(1L);
        boolean boolean7 = hikariConfig1.isAutoCommit();
        java.lang.String str8 = hikariConfig1.getDataSourceClassName();
        java.lang.String str9 = hikariConfig1.getPoolName();
        javax.sql.DataSource dataSource10 = hikariConfig1.getDataSource();
        hikariConfig1.setJdbc4ConnectionTest(true);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNull(str8);
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "HikariPool-30781" + "'", str9, "HikariPool-30781");
        org.junit.Assert.assertNull(dataSource10);
    }

    @Test
    public void test03611() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03611");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        boolean boolean2 = hikariConfig1.isInitializationFailFast();
        boolean boolean3 = hikariConfig1.isJdbc4ConnectionTest();
        long long4 = hikariConfig1.getConnectionTimeout();
        int int5 = hikariConfig1.getTransactionIsolation();
        hikariConfig1.setMaximumPoolSize((int) (short) 0);
        hikariConfig1.setMaxLifetime((long) (short) 0);
        hikariConfig1.setJdbc4ConnectionTest(false);
        java.lang.String str12 = hikariConfig1.getPoolName();
        hikariConfig1.setMaxLifetime((long) '#');
        hikariConfig1.setUseInstrumentation(true);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 5000L + "'", long4 == 5000L);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
// flaky:         org.junit.Assert.assertEquals("'" + str12 + "' != '" + "HikariPool-30783" + "'", str12, "HikariPool-30783");
    }

    @Test
    public void test03612() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03612");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        boolean boolean2 = hikariConfig1.isInitializationFailFast();
        hikariConfig1.setInitializationFailFast(true);
        javax.sql.DataSource dataSource5 = null;
        hikariConfig1.setDataSource(dataSource5);
        hikariConfig1.setAcquireRetryDelay((long) 'a');
        java.lang.String str9 = hikariConfig1.getConnectionCustomizerClassName();
        java.util.Properties properties10 = hikariConfig1.getDataSourceProperties();
        hikariConfig1.setAutoCommit(false);
        hikariConfig1.setInitializationFailFast(false);
        int int15 = hikariConfig1.getMaximumPoolSize();
        boolean boolean16 = hikariConfig1.isRegisterMbeans();
        int int17 = hikariConfig1.getMinimumPoolSize();
        hikariConfig1.setConnectionCustomizerClassName("HikariPool-587");
        java.lang.String str20 = hikariConfig1.getCatalog();
        long long21 = hikariConfig1.getConnectionTimeout();
        boolean boolean22 = hikariConfig1.isAutoCommit();
        hikariConfig1.setMaximumPoolSize((int) (byte) 1);
        hikariConfig1.setCatalog("HikariPool-19471");
        hikariConfig1.setJdbc4ConnectionTest(false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNotNull(properties10);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 60 + "'", int15 == 60);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 10 + "'", int17 == 10);
        org.junit.Assert.assertNull(str20);
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + 5000L + "'", long21 == 5000L);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
    }

    @Test
    public void test03613() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03613");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        boolean boolean2 = hikariConfig1.isInitializationFailFast();
        hikariConfig1.setInitializationFailFast(true);
        boolean boolean5 = hikariConfig1.isJdbc4ConnectionTest();
        long long6 = hikariConfig1.getConnectionTimeout();
        hikariConfig1.setPoolName("hi!");
        hikariConfig1.setAutoCommit(false);
        int int11 = hikariConfig1.getAcquireRetries();
        hikariConfig1.setConnectionInitSql("");
        hikariConfig1.setJdbc4ConnectionTest(true);
        hikariConfig1.setRegisterMbeans(true);
        hikariConfig1.setMaxLifetime(5000L);
        java.lang.String str20 = hikariConfig1.getPoolName();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 5000L + "'", long6 == 5000L);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 3 + "'", int11 == 3);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "hi!" + "'", str20, "hi!");
    }

    @Test
    public void test03614() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03614");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        boolean boolean2 = hikariConfig1.isInitializationFailFast();
        int int3 = hikariConfig1.getAcquireIncrement();
        java.lang.String str4 = hikariConfig1.getConnectionCustomizerClassName();
        hikariConfig1.setIdleTimeout((long) (byte) 0);
        hikariConfig1.setTransactionIsolation("HikariPool-184");
        boolean boolean9 = hikariConfig1.isJdbc4ConnectionTest();
        boolean boolean10 = hikariConfig1.isJdbc4ConnectionTest();
        hikariConfig1.setPoolName("HikariPool-1195");
        long long13 = hikariConfig1.getIdleTimeout();
        long long14 = hikariConfig1.getIdleTimeout();
        boolean boolean15 = hikariConfig1.isJdbc4ConnectionTest();
        boolean boolean16 = hikariConfig1.isInitializationFailFast();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 0L + "'", long13 == 0L);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 0L + "'", long14 == 0L);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test03615() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03615");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        boolean boolean2 = hikariConfig1.isInitializationFailFast();
        hikariConfig1.setInitializationFailFast(true);
        hikariConfig1.setAcquireRetryDelay(1L);
        java.util.Properties properties7 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig8 = new com.zaxxer.hikari.HikariConfig(properties7);
        boolean boolean9 = hikariConfig8.isInitializationFailFast();
        hikariConfig8.setTransactionIsolation("hi!");
        java.util.Properties properties12 = hikariConfig8.getDataSourceProperties();
        com.zaxxer.hikari.HikariConfig hikariConfig13 = new com.zaxxer.hikari.HikariConfig(properties12);
        hikariConfig1.setDataSourceProperties(properties12);
        hikariConfig1.setAutoCommit(false);
        hikariConfig1.setAutoCommit(false);
        java.lang.String str19 = hikariConfig1.getConnectionTestQuery();
        hikariConfig1.setJdbc4ConnectionTest(true);
        hikariConfig1.setDataSourceClassName("HikariPool-13543");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(properties12);
        org.junit.Assert.assertNull(str19);
    }

    @Test
    public void test03616() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03616");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        boolean boolean2 = hikariConfig1.isInitializationFailFast();
        hikariConfig1.setLeakDetectionThreshold((long) '4');
        java.lang.String str5 = hikariConfig1.getConnectionTestQuery();
        long long6 = hikariConfig1.getMaxLifetime();
        java.util.Properties properties8 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig9 = new com.zaxxer.hikari.HikariConfig(properties8);
        boolean boolean10 = hikariConfig9.isInitializationFailFast();
        hikariConfig9.setInitializationFailFast(true);
        javax.sql.DataSource dataSource13 = null;
        hikariConfig9.setDataSource(dataSource13);
        hikariConfig9.setAcquireRetryDelay((long) 'a');
        java.lang.String str17 = hikariConfig9.getConnectionCustomizerClassName();
        java.lang.String str18 = hikariConfig9.getConnectionInitSql();
        hikariConfig9.setDataSourceClassName("");
        java.util.Properties properties21 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig22 = new com.zaxxer.hikari.HikariConfig(properties21);
        boolean boolean23 = hikariConfig22.isInitializationFailFast();
        hikariConfig22.setInitializationFailFast(true);
        javax.sql.DataSource dataSource26 = null;
        hikariConfig22.setDataSource(dataSource26);
        hikariConfig22.setAcquireRetryDelay((long) 'a');
        java.lang.String str30 = hikariConfig22.getConnectionCustomizerClassName();
        java.util.Properties properties31 = hikariConfig22.getDataSourceProperties();
        java.util.Properties properties32 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig33 = new com.zaxxer.hikari.HikariConfig(properties32);
        java.util.Properties properties34 = hikariConfig33.getDataSourceProperties();
        hikariConfig22.setDataSourceProperties(properties34);
        hikariConfig9.setDataSourceProperties(properties34);
        long long37 = hikariConfig9.getLeakDetectionThreshold();
        java.util.Properties properties38 = hikariConfig9.getDataSourceProperties();
        java.lang.String str39 = hikariConfig9.getConnectionCustomizerClassName();
        java.util.Properties properties40 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig41 = new com.zaxxer.hikari.HikariConfig(properties40);
        boolean boolean42 = hikariConfig41.isInitializationFailFast();
        hikariConfig41.setInitializationFailFast(true);
        boolean boolean45 = hikariConfig41.isJdbc4ConnectionTest();
        long long46 = hikariConfig41.getConnectionTimeout();
        hikariConfig41.setPoolName("hi!");
        hikariConfig41.setAcquireIncrement((int) (byte) 100);
        java.util.Properties properties51 = hikariConfig41.getDataSourceProperties();
        com.zaxxer.hikari.HikariConfig hikariConfig52 = new com.zaxxer.hikari.HikariConfig(properties51);
        hikariConfig9.setDataSourceProperties(properties51);
        hikariConfig1.addDataSourceProperty("HikariPool-8073", (java.lang.Object) hikariConfig9);
        hikariConfig1.setAcquireRetryDelay(100L);
        hikariConfig1.setPoolName("HikariPool-5062");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 1800000L + "'", long6 == 1800000L);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNull(str30);
        org.junit.Assert.assertNotNull(properties31);
        org.junit.Assert.assertNotNull(properties34);
        org.junit.Assert.assertTrue("'" + long37 + "' != '" + 0L + "'", long37 == 0L);
        org.junit.Assert.assertNotNull(properties38);
        org.junit.Assert.assertNull(str39);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + true + "'", boolean45 == true);
        org.junit.Assert.assertTrue("'" + long46 + "' != '" + 5000L + "'", long46 == 5000L);
        org.junit.Assert.assertNotNull(properties51);
    }

    @Test
    public void test03617() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03617");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        boolean boolean2 = hikariConfig1.isInitializationFailFast();
        hikariConfig1.setLeakDetectionThreshold((long) '4');
        java.lang.String str5 = hikariConfig1.getConnectionTestQuery();
        int int6 = hikariConfig1.getTransactionIsolation();
        int int7 = hikariConfig1.getMinimumPoolSize();
        hikariConfig1.setLeakDetectionThreshold(100L);
        long long10 = hikariConfig1.getIdleTimeout();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 10 + "'", int7 == 10);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 600000L + "'", long10 == 600000L);
    }

    @Test
    public void test03618() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03618");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        boolean boolean2 = hikariConfig1.isInitializationFailFast();
        hikariConfig1.setInitializationFailFast(true);
        javax.sql.DataSource dataSource5 = null;
        hikariConfig1.setDataSource(dataSource5);
        hikariConfig1.setAcquireRetryDelay((long) 'a');
        java.lang.String str9 = hikariConfig1.getConnectionCustomizerClassName();
        java.util.Properties properties10 = hikariConfig1.getDataSourceProperties();
        hikariConfig1.setAutoCommit(false);
        hikariConfig1.setInitializationFailFast(false);
        java.lang.String str15 = hikariConfig1.getConnectionInitSql();
        long long16 = hikariConfig1.getMaxLifetime();
        java.lang.String str17 = hikariConfig1.getConnectionCustomizerClassName();
        long long18 = hikariConfig1.getConnectionTimeout();
        int int19 = hikariConfig1.getTransactionIsolation();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNotNull(properties10);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 1800000L + "'", long16 == 1800000L);
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 5000L + "'", long18 == 5000L);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + (-1) + "'", int19 == (-1));
    }

    @Test
    public void test03619() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03619");
        // The following exception was thrown during execution in test generation
        try {
            com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig("HikariPool-18718");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Property file HikariPool-18718 was not found.");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test03620() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03620");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        boolean boolean2 = hikariConfig1.isInitializationFailFast();
        hikariConfig1.setInitializationFailFast(true);
        hikariConfig1.setAcquireRetryDelay(1L);
        hikariConfig1.setConnectionCustomizerClassName("");
        hikariConfig1.setAcquireIncrement((int) (byte) 0);
        hikariConfig1.setPoolName("HikariPool-907");
        boolean boolean13 = hikariConfig1.isAutoCommit();
        hikariConfig1.setConnectionCustomizerClassName("HikariPool-6778");
        java.lang.String str16 = hikariConfig1.getConnectionCustomizerClassName();
        long long17 = hikariConfig1.getLeakDetectionThreshold();
        java.lang.String str18 = hikariConfig1.getCatalog();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "HikariPool-6778" + "'", str16, "HikariPool-6778");
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 0L + "'", long17 == 0L);
        org.junit.Assert.assertNull(str18);
    }

    @Test
    public void test03621() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03621");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        boolean boolean2 = hikariConfig1.isInitializationFailFast();
        hikariConfig1.setLeakDetectionThreshold((long) '4');
        java.lang.String str5 = hikariConfig1.getPoolName();
        hikariConfig1.setAcquireRetries((int) 'a');
        hikariConfig1.setMinimumPoolSize((int) (short) 100);
        long long10 = hikariConfig1.getMaxLifetime();
        long long11 = hikariConfig1.getConnectionTimeout();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "HikariPool-30818" + "'", str5, "HikariPool-30818");
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 1800000L + "'", long10 == 1800000L);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 5000L + "'", long11 == 5000L);
    }

    @Test
    public void test03622() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03622");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        boolean boolean2 = hikariConfig1.isInitializationFailFast();
        hikariConfig1.setInitializationFailFast(true);
        java.lang.String str5 = hikariConfig1.getConnectionTestQuery();
        boolean boolean6 = hikariConfig1.isRegisterMbeans();
        hikariConfig1.setDataSourceClassName("hi!");
        hikariConfig1.setAcquireRetries(1);
        javax.sql.DataSource dataSource11 = hikariConfig1.getDataSource();
        hikariConfig1.setAutoCommit(false);
        hikariConfig1.setConnectionTimeout(0L);
        hikariConfig1.addDataSourceProperty("HikariPool-3156", (java.lang.Object) (-1));
        java.lang.String str19 = hikariConfig1.getDataSourceClassName();
        hikariConfig1.setTransactionIsolation("HikariPool-8111");
        hikariConfig1.setLeakDetectionThreshold(1800000L);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(dataSource11);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "hi!" + "'", str19, "hi!");
    }

    @Test
    public void test03623() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03623");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        boolean boolean2 = hikariConfig1.isInitializationFailFast();
        hikariConfig1.setInitializationFailFast(true);
        hikariConfig1.setAcquireRetryDelay(1L);
        boolean boolean7 = hikariConfig1.isAutoCommit();
        java.util.Properties properties8 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig9 = new com.zaxxer.hikari.HikariConfig(properties8);
        java.util.Properties properties10 = hikariConfig9.getDataSourceProperties();
        hikariConfig1.setDataSourceProperties(properties10);
        java.lang.String str12 = hikariConfig1.getDataSourceClassName();
        boolean boolean13 = hikariConfig1.isAutoCommit();
        long long14 = hikariConfig1.getAcquireRetryDelay();
        hikariConfig1.setLeakDetectionThreshold(600000L);
        boolean boolean17 = hikariConfig1.isInitializationFailFast();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(properties10);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 0L + "'", long14 == 0L);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
    }

    @Test
    public void test03624() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03624");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        boolean boolean2 = hikariConfig1.isInitializationFailFast();
        int int3 = hikariConfig1.getAcquireIncrement();
        java.lang.String str4 = hikariConfig1.getConnectionCustomizerClassName();
        hikariConfig1.setMaximumPoolSize((int) ' ');
        hikariConfig1.setConnectionInitSql("HikariPool-1150");
        java.lang.String str9 = hikariConfig1.getConnectionTestQuery();
        javax.sql.DataSource dataSource10 = hikariConfig1.getDataSource();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(dataSource10);
    }

    @Test
    public void test03625() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03625");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        boolean boolean2 = hikariConfig1.isInitializationFailFast();
        hikariConfig1.setInitializationFailFast(true);
        boolean boolean5 = hikariConfig1.isJdbc4ConnectionTest();
        long long6 = hikariConfig1.getConnectionTimeout();
        hikariConfig1.setAcquireIncrement(100);
        hikariConfig1.setTransactionIsolation("hi!");
        int int11 = hikariConfig1.getTransactionIsolation();
        hikariConfig1.setAcquireRetries((int) (byte) 1);
        int int14 = hikariConfig1.getMinimumPoolSize();
        int int15 = hikariConfig1.getAcquireRetries();
        hikariConfig1.setConnectionTimeout((long) 0);
        hikariConfig1.setUseInstrumentation(true);
        // The following exception was thrown during execution in test generation
        try {
            hikariConfig1.validate();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: one of either dataSource or dataSourceClassName must be specified");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 5000L + "'", long6 == 5000L);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 10 + "'", int14 == 10);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
    }

    @Test
    public void test03626() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03626");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        boolean boolean2 = hikariConfig1.isInitializationFailFast();
        hikariConfig1.setInitializationFailFast(true);
        java.lang.String str5 = hikariConfig1.getConnectionTestQuery();
        boolean boolean6 = hikariConfig1.isRegisterMbeans();
        hikariConfig1.setDataSourceClassName("hi!");
        hikariConfig1.setConnectionInitSql("");
        java.lang.String str11 = hikariConfig1.getCatalog();
        java.util.Properties properties12 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig13 = new com.zaxxer.hikari.HikariConfig(properties12);
        boolean boolean14 = hikariConfig13.isInitializationFailFast();
        hikariConfig13.setInitializationFailFast(true);
        javax.sql.DataSource dataSource17 = null;
        hikariConfig13.setDataSource(dataSource17);
        hikariConfig13.setAcquireRetryDelay((long) 'a');
        java.lang.String str21 = hikariConfig13.getConnectionCustomizerClassName();
        java.util.Properties properties22 = hikariConfig13.getDataSourceProperties();
        java.util.Properties properties23 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig24 = new com.zaxxer.hikari.HikariConfig(properties23);
        boolean boolean25 = hikariConfig24.isInitializationFailFast();
        hikariConfig24.setInitializationFailFast(true);
        javax.sql.DataSource dataSource28 = null;
        hikariConfig24.setDataSource(dataSource28);
        hikariConfig24.setAcquireRetryDelay((long) 'a');
        java.lang.String str32 = hikariConfig24.getConnectionCustomizerClassName();
        java.util.Properties properties33 = hikariConfig24.getDataSourceProperties();
        hikariConfig13.setDataSourceProperties(properties33);
        hikariConfig1.setDataSourceProperties(properties33);
        java.lang.String str36 = hikariConfig1.getConnectionTestQuery();
        hikariConfig1.setConnectionCustomizerClassName("HikariPool-888");
        long long39 = hikariConfig1.getIdleTimeout();
        java.lang.String str40 = hikariConfig1.getConnectionInitSql();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNull(str21);
        org.junit.Assert.assertNotNull(properties22);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNull(str32);
        org.junit.Assert.assertNotNull(properties33);
        org.junit.Assert.assertNull(str36);
        org.junit.Assert.assertTrue("'" + long39 + "' != '" + 600000L + "'", long39 == 600000L);
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "" + "'", str40, "");
    }

    @Test
    public void test03627() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03627");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        boolean boolean2 = hikariConfig1.isInitializationFailFast();
        hikariConfig1.setInitializationFailFast(true);
        javax.sql.DataSource dataSource5 = null;
        hikariConfig1.setDataSource(dataSource5);
        java.lang.String str7 = hikariConfig1.getCatalog();
        hikariConfig1.setConnectionCustomizerClassName("");
        int int10 = hikariConfig1.getAcquireRetries();
        hikariConfig1.setRegisterMbeans(false);
        long long13 = hikariConfig1.getAcquireRetryDelay();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 3 + "'", int10 == 3);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 0L + "'", long13 == 0L);
    }

    @Test
    public void test03628() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03628");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        boolean boolean2 = hikariConfig1.isInitializationFailFast();
        hikariConfig1.setLeakDetectionThreshold((long) '4');
        java.lang.String str5 = hikariConfig1.getConnectionCustomizerClassName();
        java.util.Properties properties6 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig7 = new com.zaxxer.hikari.HikariConfig(properties6);
        boolean boolean8 = hikariConfig7.isInitializationFailFast();
        hikariConfig7.setInitializationFailFast(true);
        javax.sql.DataSource dataSource11 = null;
        hikariConfig7.setDataSource(dataSource11);
        hikariConfig7.setAcquireRetryDelay((long) 'a');
        java.lang.String str15 = hikariConfig7.getConnectionCustomizerClassName();
        java.util.Properties properties16 = hikariConfig7.getDataSourceProperties();
        java.util.Properties properties17 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig18 = new com.zaxxer.hikari.HikariConfig(properties17);
        java.util.Properties properties19 = hikariConfig18.getDataSourceProperties();
        hikariConfig7.setDataSourceProperties(properties19);
        hikariConfig1.setDataSourceProperties(properties19);
        java.lang.String str22 = hikariConfig1.getDataSourceClassName();
        hikariConfig1.setInitializationFailFast(true);
        hikariConfig1.setDataSourceClassName("HikariPool-481");
        int int27 = hikariConfig1.getTransactionIsolation();
        hikariConfig1.setDataSourceClassName("HikariPool-25730");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertNotNull(properties16);
        org.junit.Assert.assertNotNull(properties19);
        org.junit.Assert.assertNull(str22);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + (-1) + "'", int27 == (-1));
    }

    @Test
    public void test03629() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03629");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        boolean boolean2 = hikariConfig1.isInitializationFailFast();
        hikariConfig1.setInitializationFailFast(true);
        java.lang.String str5 = hikariConfig1.getConnectionTestQuery();
        hikariConfig1.setRegisterMbeans(false);
        // The following exception was thrown during execution in test generation
        try {
            hikariConfig1.validate();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: one of either dataSource or dataSourceClassName must be specified");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(str5);
    }

    @Test
    public void test03630() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03630");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        boolean boolean2 = hikariConfig1.isInitializationFailFast();
        hikariConfig1.setInitializationFailFast(true);
        javax.sql.DataSource dataSource5 = null;
        hikariConfig1.setDataSource(dataSource5);
        hikariConfig1.setAcquireRetryDelay((long) 'a');
        java.lang.String str9 = hikariConfig1.getConnectionCustomizerClassName();
        java.lang.String str10 = hikariConfig1.getConnectionInitSql();
        boolean boolean11 = hikariConfig1.isRegisterMbeans();
        hikariConfig1.setAutoCommit(true);
        // The following exception was thrown during execution in test generation
        try {
            hikariConfig1.setConnectionTimeout((long) 35);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: connectionTimeout cannot be less than 100ms");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test03631() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03631");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        boolean boolean2 = hikariConfig1.isInitializationFailFast();
        hikariConfig1.setLeakDetectionThreshold((long) '4');
        java.lang.String str5 = hikariConfig1.getConnectionTestQuery();
        int int6 = hikariConfig1.getMaximumPoolSize();
        boolean boolean7 = hikariConfig1.isJdbc4ConnectionTest();
        hikariConfig1.setAutoCommit(false);
        long long10 = hikariConfig1.getLeakDetectionThreshold();
        java.lang.String str11 = hikariConfig1.getDataSourceClassName();
        hikariConfig1.setLeakDetectionThreshold(35L);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 60 + "'", int6 == 60);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 52L + "'", long10 == 52L);
        org.junit.Assert.assertNull(str11);
    }

    @Test
    public void test03632() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03632");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        boolean boolean2 = hikariConfig1.isInitializationFailFast();
        boolean boolean3 = hikariConfig1.isJdbc4ConnectionTest();
        long long4 = hikariConfig1.getConnectionTimeout();
        int int5 = hikariConfig1.getTransactionIsolation();
        hikariConfig1.setLeakDetectionThreshold(600000L);
        boolean boolean8 = hikariConfig1.isJdbc4ConnectionTest();
        hikariConfig1.setIdleTimeout((long) 1);
        java.lang.String str11 = hikariConfig1.getDataSourceClassName();
        hikariConfig1.setConnectionCustomizerClassName("HikariPool-21140");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 5000L + "'", long4 == 5000L);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNull(str11);
    }

    @Test
    public void test03633() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03633");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        boolean boolean2 = hikariConfig1.isInitializationFailFast();
        hikariConfig1.setInitializationFailFast(true);
        javax.sql.DataSource dataSource5 = null;
        hikariConfig1.setDataSource(dataSource5);
        hikariConfig1.setAcquireRetryDelay((long) 'a');
        java.lang.String str9 = hikariConfig1.getConnectionCustomizerClassName();
        java.lang.String str10 = hikariConfig1.getConnectionInitSql();
        boolean boolean11 = hikariConfig1.isRegisterMbeans();
        java.lang.String str12 = hikariConfig1.getCatalog();
        java.lang.String str13 = hikariConfig1.getCatalog();
        hikariConfig1.setRegisterMbeans(false);
        java.util.Properties properties17 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig18 = new com.zaxxer.hikari.HikariConfig(properties17);
        boolean boolean19 = hikariConfig18.isInitializationFailFast();
        hikariConfig18.setInitializationFailFast(true);
        int int22 = hikariConfig18.getAcquireRetries();
        boolean boolean23 = hikariConfig18.isRegisterMbeans();
        hikariConfig18.setIdleTimeout((long) '#');
        hikariConfig1.addDataSourceProperty("HikariPool-6820", (java.lang.Object) hikariConfig18);
        hikariConfig18.setConnectionTestQuery("HikariPool-19774");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 3 + "'", int22 == 3);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
    }

    @Test
    public void test03634() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03634");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        java.util.Properties properties2 = hikariConfig1.getDataSourceProperties();
        hikariConfig1.setMaxLifetime(10L);
        int int5 = hikariConfig1.getAcquireRetries();
        hikariConfig1.setPoolName("HikariPool-18392");
        org.junit.Assert.assertNotNull(properties2);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 3 + "'", int5 == 3);
    }

    @Test
    public void test03635() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03635");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        boolean boolean2 = hikariConfig1.isInitializationFailFast();
        hikariConfig1.setInitializationFailFast(true);
        javax.sql.DataSource dataSource5 = null;
        hikariConfig1.setDataSource(dataSource5);
        hikariConfig1.setAcquireRetryDelay((long) 'a');
        java.lang.String str9 = hikariConfig1.getConnectionCustomizerClassName();
        java.lang.String str10 = hikariConfig1.getConnectionInitSql();
        hikariConfig1.setDataSourceClassName("");
        java.util.Properties properties13 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig14 = new com.zaxxer.hikari.HikariConfig(properties13);
        boolean boolean15 = hikariConfig14.isInitializationFailFast();
        hikariConfig14.setInitializationFailFast(true);
        javax.sql.DataSource dataSource18 = null;
        hikariConfig14.setDataSource(dataSource18);
        hikariConfig14.setAcquireRetryDelay((long) 'a');
        java.lang.String str22 = hikariConfig14.getConnectionCustomizerClassName();
        java.util.Properties properties23 = hikariConfig14.getDataSourceProperties();
        java.util.Properties properties24 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig25 = new com.zaxxer.hikari.HikariConfig(properties24);
        java.util.Properties properties26 = hikariConfig25.getDataSourceProperties();
        hikariConfig14.setDataSourceProperties(properties26);
        hikariConfig1.setDataSourceProperties(properties26);
        hikariConfig1.setUseInstrumentation(true);
        int int31 = hikariConfig1.getTransactionIsolation();
        hikariConfig1.setLeakDetectionThreshold((long) (byte) 0);
        int int34 = hikariConfig1.getTransactionIsolation();
        hikariConfig1.setMaximumPoolSize(32);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNull(str22);
        org.junit.Assert.assertNotNull(properties23);
        org.junit.Assert.assertNotNull(properties26);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + (-1) + "'", int31 == (-1));
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + (-1) + "'", int34 == (-1));
    }

    @Test
    public void test03636() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03636");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        boolean boolean2 = hikariConfig1.isInitializationFailFast();
        hikariConfig1.setInitializationFailFast(true);
        boolean boolean5 = hikariConfig1.isJdbc4ConnectionTest();
        long long6 = hikariConfig1.getConnectionTimeout();
        hikariConfig1.setPoolName("hi!");
        hikariConfig1.setAcquireIncrement((int) (byte) 100);
        java.util.Properties properties11 = hikariConfig1.getDataSourceProperties();
        hikariConfig1.setMinimumPoolSize((int) (byte) 1);
        hikariConfig1.setMaximumPoolSize(10);
        hikariConfig1.setRegisterMbeans(false);
        hikariConfig1.setUseInstrumentation(false);
        java.lang.String str20 = hikariConfig1.getConnectionInitSql();
        int int21 = hikariConfig1.getAcquireRetries();
        int int22 = hikariConfig1.getMaximumPoolSize();
        hikariConfig1.setMinimumPoolSize(32);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 5000L + "'", long6 == 5000L);
        org.junit.Assert.assertNotNull(properties11);
        org.junit.Assert.assertNull(str20);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 3 + "'", int21 == 3);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 10 + "'", int22 == 10);
    }

    @Test
    public void test03637() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03637");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        boolean boolean2 = hikariConfig1.isInitializationFailFast();
        hikariConfig1.setInitializationFailFast(true);
        javax.sql.DataSource dataSource5 = null;
        hikariConfig1.setDataSource(dataSource5);
        hikariConfig1.setAcquireRetryDelay((long) 'a');
        java.lang.String str9 = hikariConfig1.getConnectionCustomizerClassName();
        java.util.Properties properties10 = hikariConfig1.getDataSourceProperties();
        java.util.Properties properties11 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig12 = new com.zaxxer.hikari.HikariConfig(properties11);
        java.util.Properties properties13 = hikariConfig12.getDataSourceProperties();
        hikariConfig1.setDataSourceProperties(properties13);
        int int15 = hikariConfig1.getMinimumPoolSize();
        java.lang.String str16 = hikariConfig1.getDataSourceClassName();
        javax.sql.DataSource dataSource17 = hikariConfig1.getDataSource();
        boolean boolean18 = hikariConfig1.isJdbc4ConnectionTest();
        java.lang.String str19 = hikariConfig1.getConnectionTestQuery();
        hikariConfig1.setRegisterMbeans(true);
        java.lang.String str22 = hikariConfig1.getConnectionInitSql();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNotNull(properties10);
        org.junit.Assert.assertNotNull(properties13);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 10 + "'", int15 == 10);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertNull(dataSource17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertNull(str19);
        org.junit.Assert.assertNull(str22);
    }

    @Test
    public void test03638() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03638");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        boolean boolean2 = hikariConfig1.isInitializationFailFast();
        hikariConfig1.setInitializationFailFast(true);
        javax.sql.DataSource dataSource5 = null;
        hikariConfig1.setDataSource(dataSource5);
        hikariConfig1.setCatalog("");
        java.lang.String str9 = hikariConfig1.getPoolName();
        long long10 = hikariConfig1.getConnectionTimeout();
        int int11 = hikariConfig1.getTransactionIsolation();
        java.util.Properties properties12 = hikariConfig1.getDataSourceProperties();
        hikariConfig1.setPoolName("HikariPool-2523");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "HikariPool-30886" + "'", str9, "HikariPool-30886");
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 5000L + "'", long10 == 5000L);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertNotNull(properties12);
    }

    @Test
    public void test03639() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03639");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        boolean boolean2 = hikariConfig1.isInitializationFailFast();
        hikariConfig1.setInitializationFailFast(true);
        boolean boolean5 = hikariConfig1.isJdbc4ConnectionTest();
        long long6 = hikariConfig1.getConnectionTimeout();
        hikariConfig1.setPoolName("hi!");
        hikariConfig1.setAcquireIncrement((int) (byte) 100);
        java.util.Properties properties11 = hikariConfig1.getDataSourceProperties();
        hikariConfig1.setMinimumPoolSize((int) (byte) 1);
        hikariConfig1.setMaximumPoolSize(10);
        hikariConfig1.setRegisterMbeans(false);
        java.lang.String str18 = hikariConfig1.getPoolName();
        int int19 = hikariConfig1.getMaximumPoolSize();
        long long20 = hikariConfig1.getAcquireRetryDelay();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 5000L + "'", long6 == 5000L);
        org.junit.Assert.assertNotNull(properties11);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!" + "'", str18, "hi!");
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 10 + "'", int19 == 10);
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 0L + "'", long20 == 0L);
    }

    @Test
    public void test03640() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03640");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        boolean boolean2 = hikariConfig1.isInitializationFailFast();
        int int3 = hikariConfig1.getAcquireIncrement();
        hikariConfig1.setCatalog("HikariPool-143");
        hikariConfig1.setMaximumPoolSize((int) '#');
        int int8 = hikariConfig1.getMaximumPoolSize();
        hikariConfig1.setLeakDetectionThreshold(0L);
        java.lang.String str11 = hikariConfig1.getConnectionInitSql();
        java.lang.String str12 = hikariConfig1.getDataSourceClassName();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 35 + "'", int8 == 35);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNull(str12);
    }

    @Test
    public void test03641() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03641");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        boolean boolean2 = hikariConfig1.isInitializationFailFast();
        hikariConfig1.setInitializationFailFast(true);
        javax.sql.DataSource dataSource5 = null;
        hikariConfig1.setDataSource(dataSource5);
        hikariConfig1.setAcquireRetryDelay((long) 'a');
        java.lang.String str9 = hikariConfig1.getConnectionCustomizerClassName();
        java.util.Properties properties10 = hikariConfig1.getDataSourceProperties();
        java.util.Properties properties11 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig12 = new com.zaxxer.hikari.HikariConfig(properties11);
        java.util.Properties properties13 = hikariConfig12.getDataSourceProperties();
        hikariConfig1.setDataSourceProperties(properties13);
        java.lang.String str15 = hikariConfig1.getCatalog();
        long long16 = hikariConfig1.getConnectionTimeout();
        java.util.Properties properties17 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig18 = new com.zaxxer.hikari.HikariConfig(properties17);
        boolean boolean19 = hikariConfig18.isInitializationFailFast();
        hikariConfig18.setInitializationFailFast(true);
        int int22 = hikariConfig18.getAcquireRetries();
        long long23 = hikariConfig18.getMaxLifetime();
        java.util.Properties properties24 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig25 = new com.zaxxer.hikari.HikariConfig(properties24);
        boolean boolean26 = hikariConfig25.isInitializationFailFast();
        javax.sql.DataSource dataSource27 = null;
        hikariConfig25.setDataSource(dataSource27);
        java.util.Properties properties29 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig30 = new com.zaxxer.hikari.HikariConfig(properties29);
        boolean boolean31 = hikariConfig30.isInitializationFailFast();
        hikariConfig30.setInitializationFailFast(true);
        boolean boolean34 = hikariConfig30.isJdbc4ConnectionTest();
        long long35 = hikariConfig30.getConnectionTimeout();
        hikariConfig30.setPoolName("hi!");
        hikariConfig30.setAcquireIncrement((int) (byte) 100);
        java.util.Properties properties40 = hikariConfig30.getDataSourceProperties();
        hikariConfig25.setDataSourceProperties(properties40);
        hikariConfig18.setDataSourceProperties(properties40);
        com.zaxxer.hikari.HikariConfig hikariConfig43 = new com.zaxxer.hikari.HikariConfig(properties40);
        hikariConfig1.setDataSourceProperties(properties40);
        hikariConfig1.setMaxLifetime(0L);
        hikariConfig1.setConnectionInitSql("HikariPool-477");
        hikariConfig1.setPoolName("HikariPool-888");
        hikariConfig1.setTransactionIsolation("HikariPool-1009");
        java.util.Properties properties54 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig55 = new com.zaxxer.hikari.HikariConfig(properties54);
        hikariConfig55.setTransactionIsolation("");
        int int58 = hikariConfig55.getAcquireIncrement();
        javax.sql.DataSource dataSource59 = hikariConfig55.getDataSource();
        int int60 = hikariConfig55.getTransactionIsolation();
        hikariConfig1.addDataSourceProperty("HikariPool-907", (java.lang.Object) hikariConfig55);
        hikariConfig55.setIdleTimeout(0L);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNotNull(properties10);
        org.junit.Assert.assertNotNull(properties13);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 5000L + "'", long16 == 5000L);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 3 + "'", int22 == 3);
        org.junit.Assert.assertTrue("'" + long23 + "' != '" + 1800000L + "'", long23 == 1800000L);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + true + "'", boolean34 == true);
        org.junit.Assert.assertTrue("'" + long35 + "' != '" + 5000L + "'", long35 == 5000L);
        org.junit.Assert.assertNotNull(properties40);
        org.junit.Assert.assertTrue("'" + int58 + "' != '" + 0 + "'", int58 == 0);
        org.junit.Assert.assertNull(dataSource59);
        org.junit.Assert.assertTrue("'" + int60 + "' != '" + (-1) + "'", int60 == (-1));
    }

    @Test
    public void test03642() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03642");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        boolean boolean2 = hikariConfig1.isInitializationFailFast();
        hikariConfig1.setInitializationFailFast(true);
        java.lang.String str5 = hikariConfig1.getConnectionTestQuery();
        boolean boolean6 = hikariConfig1.isRegisterMbeans();
        hikariConfig1.setDataSourceClassName("hi!");
        hikariConfig1.setConnectionInitSql("");
        java.lang.String str11 = hikariConfig1.getCatalog();
        boolean boolean12 = hikariConfig1.isInitializationFailFast();
        hikariConfig1.setConnectionTestQuery("HikariPool-27895");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
    }

    @Test
    public void test03643() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03643");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        boolean boolean2 = hikariConfig1.isInitializationFailFast();
        hikariConfig1.setInitializationFailFast(true);
        javax.sql.DataSource dataSource5 = null;
        hikariConfig1.setDataSource(dataSource5);
        hikariConfig1.setAcquireRetryDelay((long) 'a');
        java.lang.String str9 = hikariConfig1.getConnectionCustomizerClassName();
        java.util.Properties properties10 = hikariConfig1.getDataSourceProperties();
        java.util.Properties properties11 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig12 = new com.zaxxer.hikari.HikariConfig(properties11);
        boolean boolean13 = hikariConfig12.isInitializationFailFast();
        hikariConfig12.setInitializationFailFast(true);
        javax.sql.DataSource dataSource16 = null;
        hikariConfig12.setDataSource(dataSource16);
        hikariConfig12.setAcquireRetryDelay((long) 'a');
        java.lang.String str20 = hikariConfig12.getConnectionCustomizerClassName();
        java.util.Properties properties21 = hikariConfig12.getDataSourceProperties();
        hikariConfig1.setDataSourceProperties(properties21);
        com.zaxxer.hikari.HikariConfig hikariConfig23 = new com.zaxxer.hikari.HikariConfig(properties21);
        hikariConfig23.setConnectionTestQuery("HikariPool-594");
        hikariConfig23.setConnectionCustomizerClassName("HikariPool-2932");
        java.lang.String str28 = hikariConfig23.getConnectionInitSql();
        java.lang.String str29 = hikariConfig23.getDataSourceClassName();
        hikariConfig23.setMaximumPoolSize(32);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNotNull(properties10);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNull(str20);
        org.junit.Assert.assertNotNull(properties21);
        org.junit.Assert.assertNull(str28);
        org.junit.Assert.assertNull(str29);
    }

    @Test
    public void test03644() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03644");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        boolean boolean2 = hikariConfig1.isInitializationFailFast();
        hikariConfig1.setInitializationFailFast(true);
        hikariConfig1.setAcquireRetryDelay(1L);
        hikariConfig1.setAcquireIncrement((int) (byte) 100);
        hikariConfig1.setConnectionTestQuery("HikariPool-143");
        hikariConfig1.setMaximumPoolSize(0);
        hikariConfig1.setConnectionCustomizerClassName("HikariPool-5382");
        hikariConfig1.setTransactionIsolation("HikariPool-14897");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test03645() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03645");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        boolean boolean2 = hikariConfig1.isInitializationFailFast();
        hikariConfig1.setInitializationFailFast(true);
        hikariConfig1.setAcquireRetryDelay(1L);
        hikariConfig1.setAcquireIncrement((int) (byte) 100);
        int int9 = hikariConfig1.getTransactionIsolation();
        int int10 = hikariConfig1.getTransactionIsolation();
        hikariConfig1.setIdleTimeout((long) (byte) 100);
        hikariConfig1.setPoolName("HikariPool-1465");
        hikariConfig1.setIdleTimeout(10L);
        hikariConfig1.setInitializationFailFast(true);
        hikariConfig1.setUseInstrumentation(false);
        long long21 = hikariConfig1.getConnectionTimeout();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + 5000L + "'", long21 == 5000L);
    }

    @Test
    public void test03646() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03646");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        boolean boolean2 = hikariConfig1.isInitializationFailFast();
        hikariConfig1.setInitializationFailFast(true);
        java.lang.String str5 = hikariConfig1.getConnectionTestQuery();
        boolean boolean6 = hikariConfig1.isRegisterMbeans();
        hikariConfig1.setDataSourceClassName("hi!");
        hikariConfig1.setAcquireRetries(1);
        int int11 = hikariConfig1.getAcquireRetries();
        hikariConfig1.setInitializationFailFast(false);
        java.lang.String str14 = hikariConfig1.getDataSourceClassName();
        java.util.Properties properties16 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig17 = new com.zaxxer.hikari.HikariConfig(properties16);
        boolean boolean18 = hikariConfig17.isInitializationFailFast();
        boolean boolean19 = hikariConfig17.isJdbc4ConnectionTest();
        hikariConfig17.addDataSourceProperty("", (java.lang.Object) false);
        hikariConfig17.setRegisterMbeans(true);
        hikariConfig17.setIdleTimeout((long) '4');
        java.lang.String str27 = hikariConfig17.getCatalog();
        javax.sql.DataSource dataSource28 = hikariConfig17.getDataSource();
        hikariConfig17.setPoolName("HikariPool-2833");
        java.lang.String str31 = hikariConfig17.getCatalog();
        hikariConfig1.addDataSourceProperty("hi!", (java.lang.Object) hikariConfig17);
        hikariConfig1.setTransactionIsolation("HikariPool-8992");
        hikariConfig1.setIdleTimeout((long) 'a');
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertNull(str27);
        org.junit.Assert.assertNull(dataSource28);
        org.junit.Assert.assertNull(str31);
    }

    @Test
    public void test03647() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03647");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        java.util.Properties properties2 = hikariConfig1.getDataSourceProperties();
        java.util.Properties properties4 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig5 = new com.zaxxer.hikari.HikariConfig(properties4);
        boolean boolean6 = hikariConfig5.isInitializationFailFast();
        hikariConfig5.setInitializationFailFast(true);
        javax.sql.DataSource dataSource9 = null;
        hikariConfig5.setDataSource(dataSource9);
        hikariConfig5.setAcquireRetryDelay((long) 'a');
        java.lang.String str13 = hikariConfig5.getConnectionCustomizerClassName();
        hikariConfig5.setConnectionCustomizerClassName("hi!");
        java.lang.String str16 = hikariConfig5.getConnectionInitSql();
        hikariConfig1.addDataSourceProperty("hi!", (java.lang.Object) hikariConfig5);
        hikariConfig1.setDataSourceClassName("hi!");
        long long20 = hikariConfig1.getMaxLifetime();
        boolean boolean21 = hikariConfig1.isJdbc4ConnectionTest();
        hikariConfig1.setConnectionTestQuery("HikariPool-4601");
        javax.sql.DataSource dataSource24 = hikariConfig1.getDataSource();
        java.lang.Class<?> wildcardClass25 = hikariConfig1.getClass();
        org.junit.Assert.assertNotNull(properties2);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 1800000L + "'", long20 == 1800000L);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertNull(dataSource24);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test03648() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03648");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        hikariConfig1.setConnectionInitSql("");
        long long4 = hikariConfig1.getIdleTimeout();
        hikariConfig1.setLeakDetectionThreshold((long) 60);
        hikariConfig1.setPoolName("HikariPool-477");
        hikariConfig1.setMinimumPoolSize(1);
        int int11 = hikariConfig1.getMinimumPoolSize();
        int int12 = hikariConfig1.getAcquireIncrement();
        java.lang.Class<?> wildcardClass13 = hikariConfig1.getClass();
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 600000L + "'", long4 == 600000L);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test03649() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03649");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        boolean boolean2 = hikariConfig1.isInitializationFailFast();
        hikariConfig1.setInitializationFailFast(true);
        java.lang.String str5 = hikariConfig1.getConnectionTestQuery();
        hikariConfig1.setDataSourceClassName("");
        java.util.Properties properties9 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig10 = new com.zaxxer.hikari.HikariConfig(properties9);
        boolean boolean11 = hikariConfig10.isInitializationFailFast();
        hikariConfig10.setInitializationFailFast(true);
        int int14 = hikariConfig10.getAcquireRetries();
        long long15 = hikariConfig10.getMaxLifetime();
        hikariConfig10.setMaxLifetime((long) (short) 0);
        long long18 = hikariConfig10.getIdleTimeout();
        boolean boolean19 = hikariConfig10.isRegisterMbeans();
        long long20 = hikariConfig10.getAcquireRetryDelay();
        hikariConfig1.addDataSourceProperty("HikariPool-184", (java.lang.Object) long20);
        long long22 = hikariConfig1.getLeakDetectionThreshold();
        long long23 = hikariConfig1.getLeakDetectionThreshold();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 3 + "'", int14 == 3);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 1800000L + "'", long15 == 1800000L);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 600000L + "'", long18 == 600000L);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 0L + "'", long20 == 0L);
        org.junit.Assert.assertTrue("'" + long22 + "' != '" + 0L + "'", long22 == 0L);
        org.junit.Assert.assertTrue("'" + long23 + "' != '" + 0L + "'", long23 == 0L);
    }

    @Test
    public void test03650() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03650");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        boolean boolean2 = hikariConfig1.isInitializationFailFast();
        hikariConfig1.setInitializationFailFast(true);
        hikariConfig1.setAcquireRetryDelay(1L);
        boolean boolean7 = hikariConfig1.isAutoCommit();
        java.lang.String str8 = hikariConfig1.getDataSourceClassName();
        java.util.Properties properties9 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig10 = new com.zaxxer.hikari.HikariConfig(properties9);
        boolean boolean11 = hikariConfig10.isInitializationFailFast();
        boolean boolean12 = hikariConfig10.isJdbc4ConnectionTest();
        javax.sql.DataSource dataSource13 = null;
        hikariConfig10.setDataSource(dataSource13);
        long long15 = hikariConfig10.getIdleTimeout();
        java.util.Properties properties16 = hikariConfig10.getDataSourceProperties();
        hikariConfig1.setDataSourceProperties(properties16);
        long long18 = hikariConfig1.getConnectionTimeout();
        hikariConfig1.setJdbc4ConnectionTest(true);
        hikariConfig1.setConnectionTestQuery("HikariPool-12973");
        java.lang.Class<?> wildcardClass23 = hikariConfig1.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 600000L + "'", long15 == 600000L);
        org.junit.Assert.assertNotNull(properties16);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 5000L + "'", long18 == 5000L);
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test03651() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03651");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        boolean boolean2 = hikariConfig1.isInitializationFailFast();
        hikariConfig1.setInitializationFailFast(true);
        hikariConfig1.setAcquireRetryDelay(1L);
        hikariConfig1.setConnectionTimeout(600000L);
        hikariConfig1.setAcquireRetries(10);
        hikariConfig1.setAcquireRetries((int) 'a');
        hikariConfig1.setJdbc4ConnectionTest(true);
        javax.sql.DataSource dataSource15 = hikariConfig1.getDataSource();
        int int16 = hikariConfig1.getMinimumPoolSize();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(dataSource15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 10 + "'", int16 == 10);
    }

    @Test
    public void test03652() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03652");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        boolean boolean2 = hikariConfig1.isInitializationFailFast();
        hikariConfig1.setInitializationFailFast(true);
        javax.sql.DataSource dataSource5 = null;
        hikariConfig1.setDataSource(dataSource5);
        java.lang.String str7 = hikariConfig1.getCatalog();
        hikariConfig1.setConnectionCustomizerClassName("");
        hikariConfig1.setAcquireRetries((int) (byte) 100);
        java.util.Properties properties12 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig13 = new com.zaxxer.hikari.HikariConfig(properties12);
        boolean boolean14 = hikariConfig13.isInitializationFailFast();
        boolean boolean15 = hikariConfig13.isJdbc4ConnectionTest();
        javax.sql.DataSource dataSource16 = null;
        hikariConfig13.setDataSource(dataSource16);
        long long18 = hikariConfig13.getIdleTimeout();
        java.util.Properties properties19 = hikariConfig13.getDataSourceProperties();
        hikariConfig1.setDataSourceProperties(properties19);
        com.zaxxer.hikari.HikariConfig hikariConfig21 = new com.zaxxer.hikari.HikariConfig(properties19);
        hikariConfig21.setLeakDetectionThreshold(0L);
        hikariConfig21.setConnectionTestQuery("HikariPool-18703");
        javax.sql.DataSource dataSource26 = null;
        hikariConfig21.setDataSource(dataSource26);
        javax.sql.DataSource dataSource28 = null;
        hikariConfig21.setDataSource(dataSource28);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 600000L + "'", long18 == 600000L);
        org.junit.Assert.assertNotNull(properties19);
    }

    @Test
    public void test03653() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03653");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        boolean boolean2 = hikariConfig1.isInitializationFailFast();
        hikariConfig1.setLeakDetectionThreshold((long) '4');
        hikariConfig1.setRegisterMbeans(true);
        java.lang.String str7 = hikariConfig1.getConnectionTestQuery();
        hikariConfig1.setAcquireRetryDelay((long) (short) 1);
        hikariConfig1.setTransactionIsolation("HikariPool-15139");
        hikariConfig1.setConnectionTimeout(5000L);
        java.lang.String str14 = hikariConfig1.getConnectionCustomizerClassName();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str14);
    }

    @Test
    public void test03654() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03654");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        boolean boolean2 = hikariConfig1.isInitializationFailFast();
        hikariConfig1.setInitializationFailFast(true);
        javax.sql.DataSource dataSource5 = null;
        hikariConfig1.setDataSource(dataSource5);
        hikariConfig1.setAcquireRetryDelay((long) 'a');
        java.lang.String str9 = hikariConfig1.getConnectionCustomizerClassName();
        java.util.Properties properties10 = hikariConfig1.getDataSourceProperties();
        java.util.Properties properties11 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig12 = new com.zaxxer.hikari.HikariConfig(properties11);
        java.util.Properties properties13 = hikariConfig12.getDataSourceProperties();
        hikariConfig1.setDataSourceProperties(properties13);
        java.lang.String str15 = hikariConfig1.getCatalog();
        long long16 = hikariConfig1.getConnectionTimeout();
        int int17 = hikariConfig1.getTransactionIsolation();
        hikariConfig1.setIdleTimeout((long) 10);
        hikariConfig1.setPoolName("HikariPool-25869");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNotNull(properties10);
        org.junit.Assert.assertNotNull(properties13);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 5000L + "'", long16 == 5000L);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
    }

    @Test
    public void test03655() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03655");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        boolean boolean2 = hikariConfig1.isInitializationFailFast();
        hikariConfig1.setInitializationFailFast(true);
        java.lang.String str5 = hikariConfig1.getConnectionTestQuery();
        boolean boolean6 = hikariConfig1.isRegisterMbeans();
        hikariConfig1.setDataSourceClassName("hi!");
        hikariConfig1.setConnectionInitSql("");
        java.lang.String str11 = hikariConfig1.getCatalog();
        boolean boolean12 = hikariConfig1.isInitializationFailFast();
        java.lang.String str13 = hikariConfig1.getDataSourceClassName();
        java.util.Properties properties14 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig15 = new com.zaxxer.hikari.HikariConfig(properties14);
        boolean boolean16 = hikariConfig15.isInitializationFailFast();
        hikariConfig15.setInitializationFailFast(true);
        javax.sql.DataSource dataSource19 = null;
        hikariConfig15.setDataSource(dataSource19);
        hikariConfig15.setAcquireRetryDelay((long) 'a');
        java.lang.String str23 = hikariConfig15.getConnectionCustomizerClassName();
        java.util.Properties properties24 = hikariConfig15.getDataSourceProperties();
        com.zaxxer.hikari.HikariConfig hikariConfig25 = new com.zaxxer.hikari.HikariConfig(properties24);
        hikariConfig1.setDataSourceProperties(properties24);
        hikariConfig1.setRegisterMbeans(true);
        java.lang.String str29 = hikariConfig1.getConnectionCustomizerClassName();
        hikariConfig1.setTransactionIsolation("HikariPool-8791");
        long long32 = hikariConfig1.getIdleTimeout();
        // The following exception was thrown during execution in test generation
        try {
            hikariConfig1.setAcquireRetries((-1));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: acquireRetries cannot be negative");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNull(str23);
        org.junit.Assert.assertNotNull(properties24);
        org.junit.Assert.assertNull(str29);
        org.junit.Assert.assertTrue("'" + long32 + "' != '" + 600000L + "'", long32 == 600000L);
    }

    @Test
    public void test03656() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03656");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        boolean boolean2 = hikariConfig1.isInitializationFailFast();
        hikariConfig1.setInitializationFailFast(true);
        java.lang.String str5 = hikariConfig1.getConnectionTestQuery();
        hikariConfig1.setConnectionCustomizerClassName("");
        java.lang.String str8 = hikariConfig1.getConnectionInitSql();
        java.util.Properties properties10 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig11 = new com.zaxxer.hikari.HikariConfig(properties10);
        boolean boolean12 = hikariConfig11.isInitializationFailFast();
        hikariConfig11.setLeakDetectionThreshold((long) '4');
        int int15 = hikariConfig11.getTransactionIsolation();
        hikariConfig11.setMaximumPoolSize((int) (short) 100);
        java.lang.Class<?> wildcardClass18 = hikariConfig11.getClass();
        hikariConfig1.addDataSourceProperty("HikariPool-674", (java.lang.Object) hikariConfig11);
        hikariConfig1.setPoolName("HikariPool-2528");
        javax.sql.DataSource dataSource22 = hikariConfig1.getDataSource();
        // The following exception was thrown during execution in test generation
        try {
            hikariConfig1.setConnectionTimeout((long) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: connectionTimeout cannot be less than 100ms");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass18);
        org.junit.Assert.assertNull(dataSource22);
    }

    @Test
    public void test03657() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03657");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        boolean boolean2 = hikariConfig1.isInitializationFailFast();
        hikariConfig1.setInitializationFailFast(true);
        javax.sql.DataSource dataSource5 = null;
        hikariConfig1.setDataSource(dataSource5);
        hikariConfig1.setAcquireRetryDelay((long) 'a');
        long long9 = hikariConfig1.getAcquireRetryDelay();
        long long10 = hikariConfig1.getIdleTimeout();
        // The following exception was thrown during execution in test generation
        try {
            hikariConfig1.validate();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: one of either dataSource or dataSourceClassName must be specified");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 600000L + "'", long10 == 600000L);
    }

    @Test
    public void test03658() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03658");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        boolean boolean2 = hikariConfig1.isInitializationFailFast();
        hikariConfig1.setInitializationFailFast(true);
        javax.sql.DataSource dataSource5 = null;
        hikariConfig1.setDataSource(dataSource5);
        java.lang.String str7 = hikariConfig1.getCatalog();
        hikariConfig1.setConnectionCustomizerClassName("hi!");
        hikariConfig1.setLeakDetectionThreshold(1L);
        java.util.Properties properties12 = hikariConfig1.getDataSourceProperties();
        com.zaxxer.hikari.HikariConfig hikariConfig13 = new com.zaxxer.hikari.HikariConfig(properties12);
        java.lang.String str14 = hikariConfig13.getConnectionInitSql();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNotNull(properties12);
        org.junit.Assert.assertNull(str14);
    }

    @Test
    public void test03659() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03659");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        boolean boolean2 = hikariConfig1.isInitializationFailFast();
        hikariConfig1.setInitializationFailFast(true);
        javax.sql.DataSource dataSource5 = null;
        hikariConfig1.setDataSource(dataSource5);
        java.lang.String str7 = hikariConfig1.getCatalog();
        int int8 = hikariConfig1.getMinimumPoolSize();
        java.lang.String str9 = hikariConfig1.getCatalog();
        hikariConfig1.setIdleTimeout((long) (short) 10);
        hikariConfig1.setInitializationFailFast(false);
        int int14 = hikariConfig1.getMaximumPoolSize();
        javax.sql.DataSource dataSource15 = null;
        hikariConfig1.setDataSource(dataSource15);
        hikariConfig1.setAutoCommit(false);
        // The following exception was thrown during execution in test generation
        try {
            hikariConfig1.setMaximumPoolSize((-1));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: maxPoolSize cannot be negative");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 10 + "'", int8 == 10);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 60 + "'", int14 == 60);
    }

    @Test
    public void test03660() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03660");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        boolean boolean2 = hikariConfig1.isInitializationFailFast();
        hikariConfig1.setInitializationFailFast(true);
        javax.sql.DataSource dataSource5 = null;
        hikariConfig1.setDataSource(dataSource5);
        hikariConfig1.setAcquireRetryDelay((long) 'a');
        java.lang.String str9 = hikariConfig1.getConnectionCustomizerClassName();
        java.lang.String str10 = hikariConfig1.getConnectionInitSql();
        long long11 = hikariConfig1.getLeakDetectionThreshold();
        hikariConfig1.setRegisterMbeans(false);
        hikariConfig1.setMaxLifetime((long) (short) 0);
        long long16 = hikariConfig1.getMaxLifetime();
        java.lang.String str17 = hikariConfig1.getConnectionInitSql();
        javax.sql.DataSource dataSource18 = null;
        hikariConfig1.setDataSource(dataSource18);
        // The following exception was thrown during execution in test generation
        try {
            hikariConfig1.validate();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: one of either dataSource or dataSourceClassName must be specified");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 0L + "'", long11 == 0L);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 0L + "'", long16 == 0L);
        org.junit.Assert.assertNull(str17);
    }

    @Test
    public void test03661() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03661");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        boolean boolean2 = hikariConfig1.isInitializationFailFast();
        hikariConfig1.setInitializationFailFast(true);
        javax.sql.DataSource dataSource5 = null;
        hikariConfig1.setDataSource(dataSource5);
        hikariConfig1.setAcquireRetryDelay((long) 'a');
        java.lang.String str9 = hikariConfig1.getConnectionCustomizerClassName();
        java.util.Properties properties10 = hikariConfig1.getDataSourceProperties();
        hikariConfig1.setAcquireRetries((int) (short) 0);
        hikariConfig1.setInitializationFailFast(true);
        hikariConfig1.setConnectionTestQuery("HikariPool-10702");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNotNull(properties10);
    }

    @Test
    public void test03662() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03662");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        boolean boolean2 = hikariConfig1.isInitializationFailFast();
        hikariConfig1.setInitializationFailFast(true);
        hikariConfig1.setCatalog("HikariPool-143");
        java.util.Properties properties7 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig8 = new com.zaxxer.hikari.HikariConfig(properties7);
        boolean boolean9 = hikariConfig8.isInitializationFailFast();
        hikariConfig8.setTransactionIsolation("hi!");
        java.util.Properties properties12 = hikariConfig8.getDataSourceProperties();
        com.zaxxer.hikari.HikariConfig hikariConfig13 = new com.zaxxer.hikari.HikariConfig(properties12);
        com.zaxxer.hikari.HikariConfig hikariConfig14 = new com.zaxxer.hikari.HikariConfig(properties12);
        hikariConfig1.setDataSourceProperties(properties12);
        int int16 = hikariConfig1.getTransactionIsolation();
        // The following exception was thrown during execution in test generation
        try {
            hikariConfig1.setMinimumPoolSize((int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: minPoolSize cannot be negative");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(properties12);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
    }

    @Test
    public void test03663() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03663");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        boolean boolean2 = hikariConfig1.isInitializationFailFast();
        hikariConfig1.setInitializationFailFast(true);
        javax.sql.DataSource dataSource5 = null;
        hikariConfig1.setDataSource(dataSource5);
        hikariConfig1.setAcquireRetryDelay((long) 'a');
        java.lang.String str9 = hikariConfig1.getConnectionCustomizerClassName();
        int int10 = hikariConfig1.getAcquireRetries();
        boolean boolean11 = hikariConfig1.isJdbc4ConnectionTest();
        hikariConfig1.setLeakDetectionThreshold((long) (-1));
        hikariConfig1.setRegisterMbeans(false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 3 + "'", int10 == 3);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
    }

    @Test
    public void test03664() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03664");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        boolean boolean2 = hikariConfig1.isInitializationFailFast();
        hikariConfig1.setInitializationFailFast(true);
        boolean boolean5 = hikariConfig1.isJdbc4ConnectionTest();
        long long6 = hikariConfig1.getConnectionTimeout();
        hikariConfig1.setPoolName("hi!");
        boolean boolean9 = hikariConfig1.isAutoCommit();
        java.util.Properties properties11 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig12 = new com.zaxxer.hikari.HikariConfig(properties11);
        boolean boolean13 = hikariConfig12.isInitializationFailFast();
        hikariConfig12.setInitializationFailFast(true);
        javax.sql.DataSource dataSource16 = null;
        hikariConfig12.setDataSource(dataSource16);
        hikariConfig12.setAcquireRetryDelay((long) 'a');
        java.lang.String str20 = hikariConfig12.getConnectionCustomizerClassName();
        java.lang.String str21 = hikariConfig12.getConnectionInitSql();
        boolean boolean22 = hikariConfig12.isInitializationFailFast();
        hikariConfig12.setMaxLifetime((long) (short) 1);
        javax.sql.DataSource dataSource25 = hikariConfig12.getDataSource();
        boolean boolean26 = hikariConfig12.isInitializationFailFast();
        long long27 = hikariConfig12.getAcquireRetryDelay();
        hikariConfig12.setPoolName("HikariPool-5778");
        java.util.Properties properties30 = hikariConfig12.getDataSourceProperties();
        hikariConfig1.addDataSourceProperty("HikariPool-13656", (java.lang.Object) properties30);
        int int32 = hikariConfig1.getAcquireRetries();
        hikariConfig1.setIdleTimeout((long) (byte) 100);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 5000L + "'", long6 == 5000L);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNull(str20);
        org.junit.Assert.assertNull(str21);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertNull(dataSource25);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertTrue("'" + long27 + "' != '" + 0L + "'", long27 == 0L);
        org.junit.Assert.assertNotNull(properties30);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 3 + "'", int32 == 3);
    }

    @Test
    public void test03665() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03665");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        boolean boolean2 = hikariConfig1.isInitializationFailFast();
        boolean boolean3 = hikariConfig1.isJdbc4ConnectionTest();
        hikariConfig1.addDataSourceProperty("", (java.lang.Object) false);
        hikariConfig1.setRegisterMbeans(true);
        long long9 = hikariConfig1.getAcquireRetryDelay();
        javax.sql.DataSource dataSource10 = null;
        hikariConfig1.setDataSource(dataSource10);
        hikariConfig1.setAcquireIncrement((int) 'a');
        int int14 = hikariConfig1.getMinimumPoolSize();
        hikariConfig1.setRegisterMbeans(false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 10 + "'", int14 == 10);
    }

    @Test
    public void test03666() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03666");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        boolean boolean2 = hikariConfig1.isInitializationFailFast();
        hikariConfig1.setInitializationFailFast(true);
        boolean boolean5 = hikariConfig1.isJdbc4ConnectionTest();
        long long6 = hikariConfig1.getConnectionTimeout();
        hikariConfig1.setPoolName("hi!");
        hikariConfig1.setAutoCommit(false);
        hikariConfig1.setIdleTimeout(10L);
        hikariConfig1.setAcquireRetries((int) (byte) 100);
        hikariConfig1.setAutoCommit(true);
        hikariConfig1.setPoolName("HikariPool-7910");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 5000L + "'", long6 == 5000L);
    }

    @Test
    public void test03667() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03667");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        boolean boolean2 = hikariConfig1.isInitializationFailFast();
        hikariConfig1.setInitializationFailFast(true);
        hikariConfig1.setAcquireRetryDelay(1L);
        hikariConfig1.setAcquireIncrement((int) (byte) 100);
        hikariConfig1.setConnectionTestQuery("HikariPool-143");
        long long11 = hikariConfig1.getLeakDetectionThreshold();
        // The following exception was thrown during execution in test generation
        try {
            hikariConfig1.setConnectionTimeout((long) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: connectionTimeout cannot be less than 100ms");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 0L + "'", long11 == 0L);
    }

    @Test
    public void test03668() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03668");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        boolean boolean2 = hikariConfig1.isInitializationFailFast();
        hikariConfig1.setInitializationFailFast(true);
        javax.sql.DataSource dataSource5 = null;
        hikariConfig1.setDataSource(dataSource5);
        java.lang.String str7 = hikariConfig1.getCatalog();
        int int8 = hikariConfig1.getMinimumPoolSize();
        java.lang.String str9 = hikariConfig1.getCatalog();
        long long10 = hikariConfig1.getLeakDetectionThreshold();
        hikariConfig1.setConnectionTestQuery("HikariPool-143");
        java.lang.String str13 = hikariConfig1.getConnectionCustomizerClassName();
        hikariConfig1.setRegisterMbeans(true);
        java.util.Properties properties17 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig18 = new com.zaxxer.hikari.HikariConfig(properties17);
        java.util.Properties properties19 = hikariConfig18.getDataSourceProperties();
        java.util.Properties properties21 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig22 = new com.zaxxer.hikari.HikariConfig(properties21);
        boolean boolean23 = hikariConfig22.isInitializationFailFast();
        hikariConfig22.setInitializationFailFast(true);
        javax.sql.DataSource dataSource26 = null;
        hikariConfig22.setDataSource(dataSource26);
        hikariConfig22.setAcquireRetryDelay((long) 'a');
        java.lang.String str30 = hikariConfig22.getConnectionCustomizerClassName();
        hikariConfig22.setConnectionCustomizerClassName("hi!");
        java.lang.String str33 = hikariConfig22.getConnectionInitSql();
        hikariConfig18.addDataSourceProperty("hi!", (java.lang.Object) hikariConfig22);
        java.lang.String str35 = hikariConfig22.getCatalog();
        hikariConfig22.setRegisterMbeans(true);
        hikariConfig22.setAutoCommit(false);
        java.lang.String str40 = hikariConfig22.getConnectionTestQuery();
        int int41 = hikariConfig22.getTransactionIsolation();
        hikariConfig22.setConnectionInitSql("HikariPool-14244");
        hikariConfig1.addDataSourceProperty("HikariPool-15648", (java.lang.Object) hikariConfig22);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 10 + "'", int8 == 10);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNotNull(properties19);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNull(str30);
        org.junit.Assert.assertNull(str33);
        org.junit.Assert.assertNull(str35);
        org.junit.Assert.assertNull(str40);
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + (-1) + "'", int41 == (-1));
    }

    @Test
    public void test03669() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03669");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        boolean boolean2 = hikariConfig1.isInitializationFailFast();
        hikariConfig1.setInitializationFailFast(true);
        javax.sql.DataSource dataSource5 = null;
        hikariConfig1.setDataSource(dataSource5);
        long long7 = hikariConfig1.getLeakDetectionThreshold();
        hikariConfig1.setAcquireRetryDelay((long) ' ');
        java.lang.String str10 = hikariConfig1.getCatalog();
        javax.sql.DataSource dataSource11 = null;
        hikariConfig1.setDataSource(dataSource11);
        hikariConfig1.setAcquireIncrement((int) (byte) 0);
        java.lang.Class<?> wildcardClass15 = hikariConfig1.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test03670() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03670");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        boolean boolean1 = hikariConfig0.isRegisterMbeans();
        int int2 = hikariConfig0.getTransactionIsolation();
        boolean boolean3 = hikariConfig0.isJdbc4ConnectionTest();
        hikariConfig0.setPoolName("HikariPool-3861");
        long long6 = hikariConfig0.getConnectionTimeout();
        java.lang.String str7 = hikariConfig0.getConnectionCustomizerClassName();
        boolean boolean8 = hikariConfig0.isAutoCommit();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 5000L + "'", long6 == 5000L);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test03671() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03671");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        boolean boolean2 = hikariConfig1.isInitializationFailFast();
        hikariConfig1.setInitializationFailFast(true);
        javax.sql.DataSource dataSource5 = null;
        hikariConfig1.setDataSource(dataSource5);
        java.lang.String str7 = hikariConfig1.getCatalog();
        int int8 = hikariConfig1.getTransactionIsolation();
        int int9 = hikariConfig1.getMaximumPoolSize();
        hikariConfig1.setInitializationFailFast(true);
        hikariConfig1.setInitializationFailFast(false);
        java.util.Properties properties14 = hikariConfig1.getDataSourceProperties();
        hikariConfig1.setCatalog("HikariPool-19471");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 60 + "'", int9 == 60);
        org.junit.Assert.assertNotNull(properties14);
    }

    @Test
    public void test03672() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03672");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        boolean boolean2 = hikariConfig1.isInitializationFailFast();
        hikariConfig1.setInitializationFailFast(true);
        javax.sql.DataSource dataSource5 = null;
        hikariConfig1.setDataSource(dataSource5);
        hikariConfig1.setAcquireRetryDelay((long) 'a');
        java.lang.String str9 = hikariConfig1.getConnectionCustomizerClassName();
        java.util.Properties properties10 = hikariConfig1.getDataSourceProperties();
        java.util.Properties properties11 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig12 = new com.zaxxer.hikari.HikariConfig(properties11);
        java.util.Properties properties13 = hikariConfig12.getDataSourceProperties();
        hikariConfig1.setDataSourceProperties(properties13);
        int int15 = hikariConfig1.getMinimumPoolSize();
        int int16 = hikariConfig1.getMinimumPoolSize();
        hikariConfig1.setIdleTimeout(0L);
        boolean boolean19 = hikariConfig1.isInitializationFailFast();
        java.lang.String str20 = hikariConfig1.getConnectionCustomizerClassName();
        long long21 = hikariConfig1.getAcquireRetryDelay();
        java.util.Properties properties22 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig23 = new com.zaxxer.hikari.HikariConfig(properties22);
        boolean boolean24 = hikariConfig23.isInitializationFailFast();
        hikariConfig23.setInitializationFailFast(true);
        javax.sql.DataSource dataSource27 = null;
        hikariConfig23.setDataSource(dataSource27);
        hikariConfig23.setAcquireRetryDelay((long) 'a');
        java.lang.String str31 = hikariConfig23.getConnectionCustomizerClassName();
        java.util.Properties properties32 = hikariConfig23.getDataSourceProperties();
        java.util.Properties properties33 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig34 = new com.zaxxer.hikari.HikariConfig(properties33);
        java.util.Properties properties35 = hikariConfig34.getDataSourceProperties();
        hikariConfig23.setDataSourceProperties(properties35);
        hikariConfig23.setCatalog("hi!");
        boolean boolean39 = hikariConfig23.isJdbc4ConnectionTest();
        hikariConfig23.setAutoCommit(true);
        hikariConfig23.setConnectionCustomizerClassName("HikariPool-477");
        long long44 = hikariConfig23.getIdleTimeout();
        java.lang.String str45 = hikariConfig23.getDataSourceClassName();
        java.util.Properties properties46 = hikariConfig23.getDataSourceProperties();
        hikariConfig1.setDataSourceProperties(properties46);
        javax.sql.DataSource dataSource48 = null;
        hikariConfig1.setDataSource(dataSource48);
        java.util.Properties properties50 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig51 = new com.zaxxer.hikari.HikariConfig(properties50);
        boolean boolean52 = hikariConfig51.isInitializationFailFast();
        hikariConfig51.setInitializationFailFast(true);
        hikariConfig51.setAcquireRetryDelay(1L);
        boolean boolean57 = hikariConfig51.isAutoCommit();
        java.util.Properties properties58 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig59 = new com.zaxxer.hikari.HikariConfig(properties58);
        java.util.Properties properties60 = hikariConfig59.getDataSourceProperties();
        hikariConfig51.setDataSourceProperties(properties60);
        java.lang.String str62 = hikariConfig51.getDataSourceClassName();
        hikariConfig51.setIdleTimeout((long) '4');
        hikariConfig51.setPoolName("HikariPool-6418");
        java.util.Properties properties67 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig68 = new com.zaxxer.hikari.HikariConfig(properties67);
        boolean boolean69 = hikariConfig68.isInitializationFailFast();
        hikariConfig68.setInitializationFailFast(true);
        javax.sql.DataSource dataSource72 = null;
        hikariConfig68.setDataSource(dataSource72);
        hikariConfig68.setAcquireRetryDelay((long) 'a');
        java.lang.String str76 = hikariConfig68.getConnectionCustomizerClassName();
        hikariConfig68.setConnectionCustomizerClassName("hi!");
        long long79 = hikariConfig68.getConnectionTimeout();
        long long80 = hikariConfig68.getAcquireRetryDelay();
        long long81 = hikariConfig68.getConnectionTimeout();
        hikariConfig68.setDataSourceClassName("HikariPool-594");
        java.util.Properties properties84 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig85 = new com.zaxxer.hikari.HikariConfig(properties84);
        boolean boolean86 = hikariConfig85.isInitializationFailFast();
        hikariConfig85.setInitializationFailFast(true);
        int int89 = hikariConfig85.getAcquireRetries();
        hikariConfig85.setCatalog("HikariPool-143");
        int int92 = hikariConfig85.getMinimumPoolSize();
        java.util.Properties properties93 = hikariConfig85.getDataSourceProperties();
        com.zaxxer.hikari.HikariConfig hikariConfig94 = new com.zaxxer.hikari.HikariConfig(properties93);
        com.zaxxer.hikari.HikariConfig hikariConfig95 = new com.zaxxer.hikari.HikariConfig(properties93);
        hikariConfig68.setDataSourceProperties(properties93);
        hikariConfig51.setDataSourceProperties(properties93);
        hikariConfig1.setDataSourceProperties(properties93);
        boolean boolean99 = hikariConfig1.isRegisterMbeans();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNotNull(properties10);
        org.junit.Assert.assertNotNull(properties13);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 10 + "'", int15 == 10);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 10 + "'", int16 == 10);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertNull(str20);
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + 0L + "'", long21 == 0L);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNull(str31);
        org.junit.Assert.assertNotNull(properties32);
        org.junit.Assert.assertNotNull(properties35);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + true + "'", boolean39 == true);
        org.junit.Assert.assertTrue("'" + long44 + "' != '" + 600000L + "'", long44 == 600000L);
        org.junit.Assert.assertNull(str45);
        org.junit.Assert.assertNotNull(properties46);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + true + "'", boolean57 == true);
        org.junit.Assert.assertNotNull(properties60);
        org.junit.Assert.assertNull(str62);
        org.junit.Assert.assertTrue("'" + boolean69 + "' != '" + false + "'", boolean69 == false);
        org.junit.Assert.assertNull(str76);
        org.junit.Assert.assertTrue("'" + long79 + "' != '" + 5000L + "'", long79 == 5000L);
        org.junit.Assert.assertTrue("'" + long80 + "' != '" + 0L + "'", long80 == 0L);
        org.junit.Assert.assertTrue("'" + long81 + "' != '" + 5000L + "'", long81 == 5000L);
        org.junit.Assert.assertTrue("'" + boolean86 + "' != '" + false + "'", boolean86 == false);
        org.junit.Assert.assertTrue("'" + int89 + "' != '" + 3 + "'", int89 == 3);
        org.junit.Assert.assertTrue("'" + int92 + "' != '" + 10 + "'", int92 == 10);
        org.junit.Assert.assertNotNull(properties93);
        org.junit.Assert.assertTrue("'" + boolean99 + "' != '" + false + "'", boolean99 == false);
    }

    @Test
    public void test03673() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03673");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        boolean boolean2 = hikariConfig1.isInitializationFailFast();
        int int3 = hikariConfig1.getAcquireIncrement();
        java.lang.String str4 = hikariConfig1.getConnectionCustomizerClassName();
        hikariConfig1.setAutoCommit(false);
        long long7 = hikariConfig1.getIdleTimeout();
        java.lang.String str8 = hikariConfig1.getDataSourceClassName();
        hikariConfig1.setRegisterMbeans(true);
        hikariConfig1.setConnectionTestQuery("HikariPool-3086");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 600000L + "'", long7 == 600000L);
        org.junit.Assert.assertNull(str8);
    }

    @Test
    public void test03674() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03674");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        boolean boolean2 = hikariConfig1.isInitializationFailFast();
        hikariConfig1.setInitializationFailFast(true);
        javax.sql.DataSource dataSource5 = null;
        hikariConfig1.setDataSource(dataSource5);
        java.lang.String str7 = hikariConfig1.getCatalog();
        javax.sql.DataSource dataSource8 = null;
        hikariConfig1.setDataSource(dataSource8);
        java.lang.String str10 = hikariConfig1.getCatalog();
        hikariConfig1.setMaxLifetime((-1L));
        hikariConfig1.setMinimumPoolSize((int) '#');
        hikariConfig1.setPoolName("HikariPool-7561");
        boolean boolean17 = hikariConfig1.isJdbc4ConnectionTest();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
    }

    @Test
    public void test03675() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03675");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        hikariConfig1.setTransactionIsolation("");
        int int4 = hikariConfig1.getAcquireIncrement();
        long long5 = hikariConfig1.getLeakDetectionThreshold();
        java.util.Properties properties6 = hikariConfig1.getDataSourceProperties();
        com.zaxxer.hikari.HikariConfig hikariConfig7 = new com.zaxxer.hikari.HikariConfig(properties6);
        boolean boolean8 = hikariConfig7.isInitializationFailFast();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertNotNull(properties6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test03676() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03676");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        boolean boolean2 = hikariConfig1.isInitializationFailFast();
        hikariConfig1.setInitializationFailFast(true);
        javax.sql.DataSource dataSource5 = null;
        hikariConfig1.setDataSource(dataSource5);
        hikariConfig1.setAcquireRetryDelay((long) 'a');
        java.lang.String str9 = hikariConfig1.getConnectionCustomizerClassName();
        int int10 = hikariConfig1.getAcquireRetries();
        boolean boolean11 = hikariConfig1.isJdbc4ConnectionTest();
        hikariConfig1.setMinimumPoolSize((int) 'a');
        hikariConfig1.setPoolName("");
        java.lang.String str16 = hikariConfig1.getConnectionTestQuery();
        hikariConfig1.setConnectionCustomizerClassName("HikariPool-17116");
        long long19 = hikariConfig1.getLeakDetectionThreshold();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 3 + "'", int10 == 3);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 0L + "'", long19 == 0L);
    }

    @Test
    public void test03677() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03677");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        boolean boolean2 = hikariConfig1.isInitializationFailFast();
        hikariConfig1.setInitializationFailFast(true);
        javax.sql.DataSource dataSource5 = null;
        hikariConfig1.setDataSource(dataSource5);
        hikariConfig1.setAcquireRetryDelay((long) 'a');
        java.lang.String str9 = hikariConfig1.getConnectionCustomizerClassName();
        int int10 = hikariConfig1.getAcquireRetries();
        java.lang.String str11 = hikariConfig1.getDataSourceClassName();
        java.lang.String str12 = hikariConfig1.getConnectionTestQuery();
        hikariConfig1.setConnectionCustomizerClassName("hi!");
        java.util.Properties properties15 = hikariConfig1.getDataSourceProperties();
        java.lang.Class<?> wildcardClass16 = hikariConfig1.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 3 + "'", int10 == 3);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNotNull(properties15);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test03678() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03678");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        boolean boolean2 = hikariConfig1.isInitializationFailFast();
        hikariConfig1.setInitializationFailFast(true);
        boolean boolean5 = hikariConfig1.isJdbc4ConnectionTest();
        long long6 = hikariConfig1.getConnectionTimeout();
        hikariConfig1.setPoolName("hi!");
        boolean boolean9 = hikariConfig1.isAutoCommit();
        java.lang.String str10 = hikariConfig1.getPoolName();
        hikariConfig1.setRegisterMbeans(false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 5000L + "'", long6 == 5000L);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
    }

    @Test
    public void test03679() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03679");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        boolean boolean2 = hikariConfig1.isInitializationFailFast();
        hikariConfig1.setLeakDetectionThreshold((long) '4');
        java.lang.String str5 = hikariConfig1.getConnectionTestQuery();
        int int6 = hikariConfig1.getTransactionIsolation();
        hikariConfig1.setConnectionTestQuery("HikariPool-2114");
        hikariConfig1.setMaxLifetime((long) (short) 10);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
    }

    @Test
    public void test03680() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03680");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        boolean boolean2 = hikariConfig1.isInitializationFailFast();
        hikariConfig1.setInitializationFailFast(true);
        hikariConfig1.setAcquireRetryDelay(1L);
        hikariConfig1.setMaximumPoolSize((int) '#');
        hikariConfig1.setAcquireRetryDelay((long) 10);
        java.lang.String str11 = hikariConfig1.getPoolName();
        hikariConfig1.setIdleTimeout(1800000L);
        hikariConfig1.setAutoCommit(true);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "HikariPool-31090" + "'", str11, "HikariPool-31090");
    }

    @Test
    public void test03681() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03681");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        boolean boolean2 = hikariConfig1.isInitializationFailFast();
        hikariConfig1.setInitializationFailFast(true);
        int int5 = hikariConfig1.getAcquireRetries();
        long long6 = hikariConfig1.getMaxLifetime();
        java.util.Properties properties7 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig8 = new com.zaxxer.hikari.HikariConfig(properties7);
        boolean boolean9 = hikariConfig8.isInitializationFailFast();
        javax.sql.DataSource dataSource10 = null;
        hikariConfig8.setDataSource(dataSource10);
        java.util.Properties properties12 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig13 = new com.zaxxer.hikari.HikariConfig(properties12);
        boolean boolean14 = hikariConfig13.isInitializationFailFast();
        hikariConfig13.setInitializationFailFast(true);
        boolean boolean17 = hikariConfig13.isJdbc4ConnectionTest();
        long long18 = hikariConfig13.getConnectionTimeout();
        hikariConfig13.setPoolName("hi!");
        hikariConfig13.setAcquireIncrement((int) (byte) 100);
        java.util.Properties properties23 = hikariConfig13.getDataSourceProperties();
        hikariConfig8.setDataSourceProperties(properties23);
        hikariConfig1.setDataSourceProperties(properties23);
        com.zaxxer.hikari.HikariConfig hikariConfig26 = new com.zaxxer.hikari.HikariConfig(properties23);
        int int27 = hikariConfig26.getAcquireRetries();
        hikariConfig26.setInitializationFailFast(true);
        hikariConfig26.setConnectionTestQuery("HikariPool-888");
        long long32 = hikariConfig26.getAcquireRetryDelay();
        java.util.Properties properties33 = hikariConfig26.getDataSourceProperties();
        long long34 = hikariConfig26.getLeakDetectionThreshold();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 3 + "'", int5 == 3);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 1800000L + "'", long6 == 1800000L);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 5000L + "'", long18 == 5000L);
        org.junit.Assert.assertNotNull(properties23);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 3 + "'", int27 == 3);
        org.junit.Assert.assertTrue("'" + long32 + "' != '" + 0L + "'", long32 == 0L);
        org.junit.Assert.assertNotNull(properties33);
        org.junit.Assert.assertTrue("'" + long34 + "' != '" + 0L + "'", long34 == 0L);
    }

    @Test
    public void test03682() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03682");
        // The following exception was thrown during execution in test generation
        try {
            com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig("HikariPool-18928");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Property file HikariPool-18928 was not found.");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test03683() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03683");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        boolean boolean2 = hikariConfig1.isInitializationFailFast();
        hikariConfig1.setInitializationFailFast(true);
        int int5 = hikariConfig1.getAcquireRetries();
        hikariConfig1.setCatalog("HikariPool-143");
        int int8 = hikariConfig1.getMinimumPoolSize();
        java.util.Properties properties9 = hikariConfig1.getDataSourceProperties();
        hikariConfig1.setLeakDetectionThreshold(0L);
        hikariConfig1.setCatalog("HikariPool-18107");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 3 + "'", int5 == 3);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 10 + "'", int8 == 10);
        org.junit.Assert.assertNotNull(properties9);
    }

    @Test
    public void test03684() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03684");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        boolean boolean2 = hikariConfig1.isInitializationFailFast();
        boolean boolean3 = hikariConfig1.isJdbc4ConnectionTest();
        hikariConfig1.addDataSourceProperty("", (java.lang.Object) false);
        java.lang.String str7 = hikariConfig1.getConnectionTestQuery();
        hikariConfig1.setLeakDetectionThreshold((long) (byte) 100);
        javax.sql.DataSource dataSource10 = null;
        hikariConfig1.setDataSource(dataSource10);
        hikariConfig1.setMaximumPoolSize(10);
        hikariConfig1.setCatalog("HikariPool-1902");
        boolean boolean16 = hikariConfig1.isAutoCommit();
        long long17 = hikariConfig1.getMaxLifetime();
        java.lang.Object obj19 = null;
        // The following exception was thrown during execution in test generation
        try {
            hikariConfig1.addDataSourceProperty("", obj19);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 1800000L + "'", long17 == 1800000L);
    }

    @Test
    public void test03685() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03685");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        boolean boolean2 = hikariConfig1.isInitializationFailFast();
        hikariConfig1.setInitializationFailFast(true);
        javax.sql.DataSource dataSource5 = null;
        hikariConfig1.setDataSource(dataSource5);
        hikariConfig1.setAcquireRetryDelay((long) 'a');
        java.lang.String str9 = hikariConfig1.getConnectionCustomizerClassName();
        java.util.Properties properties10 = hikariConfig1.getDataSourceProperties();
        hikariConfig1.setAutoCommit(false);
        hikariConfig1.setInitializationFailFast(false);
        int int15 = hikariConfig1.getMaximumPoolSize();
        boolean boolean16 = hikariConfig1.isRegisterMbeans();
        hikariConfig1.setJdbc4ConnectionTest(true);
        java.lang.String str19 = hikariConfig1.getConnectionTestQuery();
        java.lang.String str20 = hikariConfig1.getPoolName();
        java.lang.String str21 = hikariConfig1.getCatalog();
        long long22 = hikariConfig1.getIdleTimeout();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNotNull(properties10);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 60 + "'", int15 == 60);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNull(str19);
// flaky:         org.junit.Assert.assertEquals("'" + str20 + "' != '" + "HikariPool-31132" + "'", str20, "HikariPool-31132");
        org.junit.Assert.assertNull(str21);
        org.junit.Assert.assertTrue("'" + long22 + "' != '" + 600000L + "'", long22 == 600000L);
    }

    @Test
    public void test03686() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03686");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        boolean boolean2 = hikariConfig1.isInitializationFailFast();
        boolean boolean3 = hikariConfig1.isJdbc4ConnectionTest();
        hikariConfig1.addDataSourceProperty("", (java.lang.Object) false);
        hikariConfig1.setRegisterMbeans(true);
        hikariConfig1.setIdleTimeout((long) '4');
        hikariConfig1.setMaximumPoolSize((int) (byte) 10);
        hikariConfig1.setLeakDetectionThreshold((long) 60);
        hikariConfig1.setLeakDetectionThreshold((long) (-1));
        hikariConfig1.setLeakDetectionThreshold((long) (byte) 0);
        boolean boolean19 = hikariConfig1.isAutoCommit();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
    }

    @Test
    public void test03687() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03687");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        boolean boolean2 = hikariConfig1.isInitializationFailFast();
        hikariConfig1.setInitializationFailFast(true);
        javax.sql.DataSource dataSource5 = null;
        hikariConfig1.setDataSource(dataSource5);
        long long7 = hikariConfig1.getLeakDetectionThreshold();
        int int8 = hikariConfig1.getTransactionIsolation();
        hikariConfig1.setCatalog("HikariPool-2784");
        javax.sql.DataSource dataSource11 = null;
        hikariConfig1.setDataSource(dataSource11);
        hikariConfig1.setAcquireRetryDelay((long) 35);
        hikariConfig1.setConnectionCustomizerClassName("HikariPool-15012");
        hikariConfig1.setJdbc4ConnectionTest(true);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
    }

    @Test
    public void test03688() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03688");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        boolean boolean2 = hikariConfig1.isInitializationFailFast();
        hikariConfig1.setInitializationFailFast(true);
        javax.sql.DataSource dataSource5 = null;
        hikariConfig1.setDataSource(dataSource5);
        java.lang.String str7 = hikariConfig1.getCatalog();
        javax.sql.DataSource dataSource8 = null;
        hikariConfig1.setDataSource(dataSource8);
        int int10 = hikariConfig1.getMaximumPoolSize();
        boolean boolean11 = hikariConfig1.isAutoCommit();
        long long12 = hikariConfig1.getLeakDetectionThreshold();
        hikariConfig1.setConnectionInitSql("HikariPool-1150");
        java.util.Properties properties16 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig17 = new com.zaxxer.hikari.HikariConfig(properties16);
        boolean boolean18 = hikariConfig17.isInitializationFailFast();
        hikariConfig17.setInitializationFailFast(true);
        hikariConfig17.setAcquireRetryDelay(1L);
        boolean boolean23 = hikariConfig17.isAutoCommit();
        java.util.Properties properties24 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig25 = new com.zaxxer.hikari.HikariConfig(properties24);
        java.util.Properties properties26 = hikariConfig25.getDataSourceProperties();
        hikariConfig17.setDataSourceProperties(properties26);
        hikariConfig17.setAcquireRetries((int) '4');
        hikariConfig17.setAcquireIncrement((int) '#');
        hikariConfig17.setDataSourceClassName("HikariPool-700");
        int int34 = hikariConfig17.getMaximumPoolSize();
        long long35 = hikariConfig17.getMaxLifetime();
        javax.sql.DataSource dataSource36 = null;
        hikariConfig17.setDataSource(dataSource36);
        java.lang.String str38 = hikariConfig17.getPoolName();
        java.util.Properties properties39 = hikariConfig17.getDataSourceProperties();
        hikariConfig1.addDataSourceProperty("HikariPool-1625", (java.lang.Object) properties39);
        com.zaxxer.hikari.HikariConfig hikariConfig41 = new com.zaxxer.hikari.HikariConfig(properties39);
        hikariConfig41.setInitializationFailFast(false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 60 + "'", int10 == 60);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertNotNull(properties26);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 60 + "'", int34 == 60);
        org.junit.Assert.assertTrue("'" + long35 + "' != '" + 1800000L + "'", long35 == 1800000L);
// flaky:         org.junit.Assert.assertEquals("'" + str38 + "' != '" + "HikariPool-31151" + "'", str38, "HikariPool-31151");
        org.junit.Assert.assertNotNull(properties39);
    }

    @Test
    public void test03689() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03689");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        boolean boolean2 = hikariConfig1.isInitializationFailFast();
        hikariConfig1.setLeakDetectionThreshold((long) '4');
        java.lang.String str5 = hikariConfig1.getConnectionTestQuery();
        hikariConfig1.setTransactionIsolation("HikariPool-393");
        java.lang.String str8 = hikariConfig1.getPoolName();
        long long9 = hikariConfig1.getIdleTimeout();
        hikariConfig1.setMaximumPoolSize(10);
        hikariConfig1.setMaximumPoolSize((int) 'a');
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(str5);
// flaky:         org.junit.Assert.assertEquals("'" + str8 + "' != '" + "HikariPool-31154" + "'", str8, "HikariPool-31154");
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 600000L + "'", long9 == 600000L);
    }

    @Test
    public void test03690() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03690");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        boolean boolean2 = hikariConfig1.isInitializationFailFast();
        boolean boolean3 = hikariConfig1.isJdbc4ConnectionTest();
        javax.sql.DataSource dataSource4 = null;
        hikariConfig1.setDataSource(dataSource4);
        int int6 = hikariConfig1.getAcquireIncrement();
        hikariConfig1.setTransactionIsolation("HikariPool-143");
        boolean boolean9 = hikariConfig1.isAutoCommit();
        java.lang.String str10 = hikariConfig1.getCatalog();
        hikariConfig1.setAutoCommit(true);
        int int13 = hikariConfig1.getTransactionIsolation();
        int int14 = hikariConfig1.getMinimumPoolSize();
        hikariConfig1.setLeakDetectionThreshold((long) (short) 1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 10 + "'", int14 == 10);
    }

    @Test
    public void test03691() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03691");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        boolean boolean2 = hikariConfig1.isInitializationFailFast();
        hikariConfig1.setInitializationFailFast(true);
        javax.sql.DataSource dataSource5 = null;
        hikariConfig1.setDataSource(dataSource5);
        java.lang.String str7 = hikariConfig1.getCatalog();
        javax.sql.DataSource dataSource8 = null;
        hikariConfig1.setDataSource(dataSource8);
        int int10 = hikariConfig1.getMaximumPoolSize();
        hikariConfig1.setJdbc4ConnectionTest(true);
        java.util.Properties properties14 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig15 = new com.zaxxer.hikari.HikariConfig(properties14);
        boolean boolean16 = hikariConfig15.isInitializationFailFast();
        hikariConfig15.setInitializationFailFast(true);
        java.lang.String str19 = hikariConfig15.getConnectionTestQuery();
        boolean boolean20 = hikariConfig15.isRegisterMbeans();
        hikariConfig15.setDataSourceClassName("hi!");
        hikariConfig15.setInitializationFailFast(true);
        hikariConfig15.setMaxLifetime((long) (short) 1);
        javax.sql.DataSource dataSource27 = hikariConfig15.getDataSource();
        hikariConfig15.setAcquireRetryDelay((long) (byte) 0);
        hikariConfig15.setAcquireIncrement(35);
        hikariConfig15.validate();
        java.lang.String str33 = hikariConfig15.getPoolName();
        hikariConfig1.addDataSourceProperty("HikariPool-3811", (java.lang.Object) hikariConfig15);
        hikariConfig15.setAcquireRetryDelay((long) (byte) 100);
        hikariConfig15.setLeakDetectionThreshold((long) 35);
        hikariConfig15.setPoolName("HikariPool-10895");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 60 + "'", int10 == 60);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNull(str19);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNull(dataSource27);
// flaky:         org.junit.Assert.assertEquals("'" + str33 + "' != '" + "HikariPool-31158" + "'", str33, "HikariPool-31158");
    }

    @Test
    public void test03692() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03692");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        boolean boolean2 = hikariConfig1.isInitializationFailFast();
        boolean boolean3 = hikariConfig1.isJdbc4ConnectionTest();
        hikariConfig1.setDataSourceClassName("hi!");
        java.util.Properties properties7 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig8 = new com.zaxxer.hikari.HikariConfig(properties7);
        boolean boolean9 = hikariConfig8.isInitializationFailFast();
        hikariConfig8.setInitializationFailFast(true);
        javax.sql.DataSource dataSource12 = null;
        hikariConfig8.setDataSource(dataSource12);
        hikariConfig8.setAcquireRetryDelay((long) 'a');
        java.lang.String str16 = hikariConfig8.getConnectionCustomizerClassName();
        java.util.Properties properties17 = hikariConfig8.getDataSourceProperties();
        hikariConfig8.setAutoCommit(false);
        hikariConfig8.setInitializationFailFast(false);
        int int22 = hikariConfig8.getMaximumPoolSize();
        boolean boolean23 = hikariConfig8.isRegisterMbeans();
        hikariConfig1.addDataSourceProperty("HikariPool-587", (java.lang.Object) boolean23);
        hikariConfig1.setPoolName("HikariPool-2107");
        java.lang.String str27 = hikariConfig1.getConnectionInitSql();
        boolean boolean28 = hikariConfig1.isJdbc4ConnectionTest();
        java.util.Properties properties30 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig31 = new com.zaxxer.hikari.HikariConfig(properties30);
        boolean boolean32 = hikariConfig31.isInitializationFailFast();
        hikariConfig31.setInitializationFailFast(true);
        javax.sql.DataSource dataSource35 = null;
        hikariConfig31.setDataSource(dataSource35);
        java.lang.String str37 = hikariConfig31.getCatalog();
        int int38 = hikariConfig31.getTransactionIsolation();
        int int39 = hikariConfig31.getMaximumPoolSize();
        java.util.Properties properties40 = hikariConfig31.getDataSourceProperties();
        hikariConfig1.addDataSourceProperty("HikariPool-6525", (java.lang.Object) properties40);
        hikariConfig1.setIdleTimeout((-1L));
        long long44 = hikariConfig1.getLeakDetectionThreshold();
        long long45 = hikariConfig1.getConnectionTimeout();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertNotNull(properties17);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 60 + "'", int22 == 60);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNull(str27);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertNull(str37);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + (-1) + "'", int38 == (-1));
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 60 + "'", int39 == 60);
        org.junit.Assert.assertNotNull(properties40);
        org.junit.Assert.assertTrue("'" + long44 + "' != '" + 0L + "'", long44 == 0L);
        org.junit.Assert.assertTrue("'" + long45 + "' != '" + 5000L + "'", long45 == 5000L);
    }

    @Test
    public void test03693() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03693");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        boolean boolean2 = hikariConfig1.isInitializationFailFast();
        int int3 = hikariConfig1.getAcquireIncrement();
        long long4 = hikariConfig1.getConnectionTimeout();
        hikariConfig1.setPoolName("HikariPool-442");
        hikariConfig1.setRegisterMbeans(false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 5000L + "'", long4 == 5000L);
    }

    @Test
    public void test03694() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03694");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        boolean boolean2 = hikariConfig1.isInitializationFailFast();
        boolean boolean3 = hikariConfig1.isJdbc4ConnectionTest();
        long long4 = hikariConfig1.getConnectionTimeout();
        int int5 = hikariConfig1.getTransactionIsolation();
        hikariConfig1.setLeakDetectionThreshold(600000L);
        boolean boolean8 = hikariConfig1.isJdbc4ConnectionTest();
        hikariConfig1.setIdleTimeout((long) 1);
        hikariConfig1.setAcquireRetries(60);
        hikariConfig1.setUseInstrumentation(false);
        java.lang.String str15 = hikariConfig1.getDataSourceClassName();
        hikariConfig1.setConnectionCustomizerClassName("HikariPool-1566");
        hikariConfig1.setIdleTimeout(0L);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 5000L + "'", long4 == 5000L);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNull(str15);
    }

    @Test
    public void test03695() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03695");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        boolean boolean2 = hikariConfig1.isInitializationFailFast();
        hikariConfig1.setLeakDetectionThreshold((long) '4');
        int int5 = hikariConfig1.getTransactionIsolation();
        hikariConfig1.setAcquireRetries(0);
        hikariConfig1.setInitializationFailFast(false);
        java.lang.String str10 = hikariConfig1.getConnectionTestQuery();
        hikariConfig1.setAcquireRetries(1);
        int int13 = hikariConfig1.getMinimumPoolSize();
        hikariConfig1.setAutoCommit(true);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 10 + "'", int13 == 10);
    }

    @Test
    public void test03696() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03696");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        hikariConfig1.setConnectionInitSql("");
        long long4 = hikariConfig1.getIdleTimeout();
        java.util.Properties properties5 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig6 = new com.zaxxer.hikari.HikariConfig(properties5);
        java.util.Properties properties7 = hikariConfig6.getDataSourceProperties();
        hikariConfig1.setDataSourceProperties(properties7);
        com.zaxxer.hikari.HikariConfig hikariConfig9 = new com.zaxxer.hikari.HikariConfig(properties7);
        long long10 = hikariConfig9.getAcquireRetryDelay();
        hikariConfig9.setInitializationFailFast(true);
        java.lang.String str13 = hikariConfig9.getDataSourceClassName();
        java.util.Properties properties15 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig16 = new com.zaxxer.hikari.HikariConfig(properties15);
        boolean boolean17 = hikariConfig16.isInitializationFailFast();
        hikariConfig16.setInitializationFailFast(true);
        javax.sql.DataSource dataSource20 = null;
        hikariConfig16.setDataSource(dataSource20);
        hikariConfig16.setAcquireRetryDelay((long) 'a');
        java.lang.String str24 = hikariConfig16.getConnectionCustomizerClassName();
        java.util.Properties properties25 = hikariConfig16.getDataSourceProperties();
        hikariConfig16.setAutoCommit(false);
        hikariConfig16.setInitializationFailFast(false);
        int int30 = hikariConfig16.getMaximumPoolSize();
        boolean boolean31 = hikariConfig16.isRegisterMbeans();
        hikariConfig16.setJdbc4ConnectionTest(true);
        java.lang.String str34 = hikariConfig16.getConnectionTestQuery();
        java.lang.String str35 = hikariConfig16.getPoolName();
        hikariConfig9.addDataSourceProperty("HikariPool-1244", (java.lang.Object) str35);
        hikariConfig9.setTransactionIsolation("HikariPool-3059");
        int int39 = hikariConfig9.getMaximumPoolSize();
        hikariConfig9.setAcquireIncrement(60);
        hikariConfig9.setJdbc4ConnectionTest(true);
        hikariConfig9.setMaxLifetime(3L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 600000L + "'", long4 == 600000L);
        org.junit.Assert.assertNotNull(properties7);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNull(str24);
        org.junit.Assert.assertNotNull(properties25);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 60 + "'", int30 == 60);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertNull(str34);
// flaky:         org.junit.Assert.assertEquals("'" + str35 + "' != '" + "HikariPool-31187" + "'", str35, "HikariPool-31187");
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 60 + "'", int39 == 60);
    }

    @Test
    public void test03697() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03697");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        boolean boolean2 = hikariConfig1.isInitializationFailFast();
        hikariConfig1.setLeakDetectionThreshold((long) '4');
        int int5 = hikariConfig1.getTransactionIsolation();
        hikariConfig1.setJdbc4ConnectionTest(false);
        hikariConfig1.setDataSourceClassName("HikariPool-393");
        hikariConfig1.setCatalog("HikariPool-627");
        hikariConfig1.setMaximumPoolSize((int) (short) 10);
        int int14 = hikariConfig1.getAcquireRetries();
        hikariConfig1.setConnectionTestQuery("HikariPool-7786");
        hikariConfig1.setJdbc4ConnectionTest(false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 3 + "'", int14 == 3);
    }

    @Test
    public void test03698() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03698");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        boolean boolean2 = hikariConfig1.isInitializationFailFast();
        hikariConfig1.setInitializationFailFast(true);
        boolean boolean5 = hikariConfig1.isJdbc4ConnectionTest();
        hikariConfig1.setUseInstrumentation(false);
        java.lang.String str8 = hikariConfig1.getConnectionTestQuery();
        long long9 = hikariConfig1.getMaxLifetime();
        hikariConfig1.setAutoCommit(true);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 1800000L + "'", long9 == 1800000L);
    }

    @Test
    public void test03699() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03699");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        boolean boolean2 = hikariConfig1.isInitializationFailFast();
        hikariConfig1.setInitializationFailFast(true);
        java.lang.String str5 = hikariConfig1.getConnectionTestQuery();
        boolean boolean6 = hikariConfig1.isRegisterMbeans();
        hikariConfig1.setDataSourceClassName("hi!");
        hikariConfig1.setConnectionInitSql("");
        int int11 = hikariConfig1.getTransactionIsolation();
        boolean boolean12 = hikariConfig1.isAutoCommit();
        java.util.Properties properties13 = hikariConfig1.getDataSourceProperties();
        com.zaxxer.hikari.HikariConfig hikariConfig14 = new com.zaxxer.hikari.HikariConfig(properties13);
        hikariConfig14.setMaxLifetime((long) (short) -1);
        java.util.Properties properties17 = hikariConfig14.getDataSourceProperties();
        com.zaxxer.hikari.HikariConfig hikariConfig18 = new com.zaxxer.hikari.HikariConfig(properties17);
        hikariConfig18.setMaximumPoolSize((int) (byte) 1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(properties13);
        org.junit.Assert.assertNotNull(properties17);
    }

    @Test
    public void test03700() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03700");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        boolean boolean2 = hikariConfig1.isInitializationFailFast();
        hikariConfig1.setInitializationFailFast(true);
        hikariConfig1.setAcquireRetryDelay(1L);
        hikariConfig1.setConnectionTimeout(600000L);
        hikariConfig1.setConnectionCustomizerClassName("HikariPool-143");
        long long11 = hikariConfig1.getMaxLifetime();
        hikariConfig1.setMinimumPoolSize(0);
        hikariConfig1.setAcquireRetryDelay(2147483647L);
        java.util.Properties properties16 = hikariConfig1.getDataSourceProperties();
        boolean boolean17 = hikariConfig1.isJdbc4ConnectionTest();
        hikariConfig1.setCatalog("HikariPool-20152");
        java.util.Properties properties20 = hikariConfig1.getDataSourceProperties();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 1800000L + "'", long11 == 1800000L);
        org.junit.Assert.assertNotNull(properties16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertNotNull(properties20);
    }

    @Test
    public void test03701() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03701");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        boolean boolean2 = hikariConfig1.isInitializationFailFast();
        hikariConfig1.setInitializationFailFast(true);
        javax.sql.DataSource dataSource5 = null;
        hikariConfig1.setDataSource(dataSource5);
        java.lang.String str7 = hikariConfig1.getCatalog();
        int int8 = hikariConfig1.getTransactionIsolation();
        boolean boolean9 = hikariConfig1.isInitializationFailFast();
        long long10 = hikariConfig1.getLeakDetectionThreshold();
        boolean boolean11 = hikariConfig1.isAutoCommit();
        int int12 = hikariConfig1.getTransactionIsolation();
        java.lang.String str13 = hikariConfig1.getPoolName();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "HikariPool-31202" + "'", str13, "HikariPool-31202");
    }

    @Test
    public void test03702() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03702");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        java.util.Properties properties2 = hikariConfig1.getDataSourceProperties();
        java.util.Properties properties4 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig5 = new com.zaxxer.hikari.HikariConfig(properties4);
        boolean boolean6 = hikariConfig5.isInitializationFailFast();
        hikariConfig5.setInitializationFailFast(true);
        javax.sql.DataSource dataSource9 = null;
        hikariConfig5.setDataSource(dataSource9);
        hikariConfig5.setAcquireRetryDelay((long) 'a');
        java.lang.String str13 = hikariConfig5.getConnectionCustomizerClassName();
        hikariConfig5.setConnectionCustomizerClassName("hi!");
        java.lang.String str16 = hikariConfig5.getConnectionInitSql();
        hikariConfig1.addDataSourceProperty("hi!", (java.lang.Object) hikariConfig5);
        java.lang.String str18 = hikariConfig5.getCatalog();
        hikariConfig5.setRegisterMbeans(true);
        int int21 = hikariConfig5.getMinimumPoolSize();
        long long22 = hikariConfig5.getMaxLifetime();
        long long23 = hikariConfig5.getMaxLifetime();
        java.util.Properties properties24 = hikariConfig5.getDataSourceProperties();
        java.util.Properties properties25 = hikariConfig5.getDataSourceProperties();
        org.junit.Assert.assertNotNull(properties2);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 10 + "'", int21 == 10);
        org.junit.Assert.assertTrue("'" + long22 + "' != '" + 1800000L + "'", long22 == 1800000L);
        org.junit.Assert.assertTrue("'" + long23 + "' != '" + 1800000L + "'", long23 == 1800000L);
        org.junit.Assert.assertNotNull(properties24);
        org.junit.Assert.assertNotNull(properties25);
    }

    @Test
    public void test03703() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03703");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        java.util.Properties properties2 = hikariConfig1.getDataSourceProperties();
        java.util.Properties properties4 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig5 = new com.zaxxer.hikari.HikariConfig(properties4);
        boolean boolean6 = hikariConfig5.isInitializationFailFast();
        hikariConfig5.setInitializationFailFast(true);
        javax.sql.DataSource dataSource9 = null;
        hikariConfig5.setDataSource(dataSource9);
        hikariConfig5.setAcquireRetryDelay((long) 'a');
        java.lang.String str13 = hikariConfig5.getConnectionCustomizerClassName();
        hikariConfig5.setConnectionCustomizerClassName("hi!");
        java.lang.String str16 = hikariConfig5.getConnectionInitSql();
        hikariConfig1.addDataSourceProperty("hi!", (java.lang.Object) hikariConfig5);
        long long18 = hikariConfig1.getAcquireRetryDelay();
        hikariConfig1.setPoolName("HikariPool-184");
        int int21 = hikariConfig1.getAcquireRetries();
        hikariConfig1.setUseInstrumentation(true);
        long long24 = hikariConfig1.getConnectionTimeout();
        boolean boolean25 = hikariConfig1.isJdbc4ConnectionTest();
        org.junit.Assert.assertNotNull(properties2);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 0L + "'", long18 == 0L);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 3 + "'", int21 == 3);
        org.junit.Assert.assertTrue("'" + long24 + "' != '" + 5000L + "'", long24 == 5000L);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
    }

    @Test
    public void test03704() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03704");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        boolean boolean2 = hikariConfig1.isInitializationFailFast();
        int int3 = hikariConfig1.getAcquireIncrement();
        hikariConfig1.setCatalog("HikariPool-143");
        hikariConfig1.setMaximumPoolSize((int) '#');
        int int8 = hikariConfig1.getMaximumPoolSize();
        hikariConfig1.setCatalog("HikariPool-3812");
        hikariConfig1.setAcquireRetryDelay(10L);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 35 + "'", int8 == 35);
    }

    @Test
    public void test03705() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03705");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        boolean boolean2 = hikariConfig1.isInitializationFailFast();
        hikariConfig1.setInitializationFailFast(true);
        javax.sql.DataSource dataSource5 = null;
        hikariConfig1.setDataSource(dataSource5);
        hikariConfig1.setAcquireRetryDelay((long) 'a');
        java.lang.String str9 = hikariConfig1.getConnectionCustomizerClassName();
        java.util.Properties properties10 = hikariConfig1.getDataSourceProperties();
        java.util.Properties properties11 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig12 = new com.zaxxer.hikari.HikariConfig(properties11);
        boolean boolean13 = hikariConfig12.isInitializationFailFast();
        hikariConfig12.setInitializationFailFast(true);
        javax.sql.DataSource dataSource16 = null;
        hikariConfig12.setDataSource(dataSource16);
        hikariConfig12.setAcquireRetryDelay((long) 'a');
        java.lang.String str20 = hikariConfig12.getConnectionCustomizerClassName();
        java.util.Properties properties21 = hikariConfig12.getDataSourceProperties();
        hikariConfig1.setDataSourceProperties(properties21);
        com.zaxxer.hikari.HikariConfig hikariConfig23 = new com.zaxxer.hikari.HikariConfig(properties21);
        hikariConfig23.setConnectionTimeout((long) (short) 0);
        long long26 = hikariConfig23.getIdleTimeout();
        long long27 = hikariConfig23.getIdleTimeout();
        long long28 = hikariConfig23.getConnectionTimeout();
        int int29 = hikariConfig23.getMinimumPoolSize();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNotNull(properties10);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNull(str20);
        org.junit.Assert.assertNotNull(properties21);
        org.junit.Assert.assertTrue("'" + long26 + "' != '" + 600000L + "'", long26 == 600000L);
        org.junit.Assert.assertTrue("'" + long27 + "' != '" + 600000L + "'", long27 == 600000L);
        org.junit.Assert.assertTrue("'" + long28 + "' != '" + 2147483647L + "'", long28 == 2147483647L);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 10 + "'", int29 == 10);
    }

    @Test
    public void test03706() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03706");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        boolean boolean2 = hikariConfig1.isInitializationFailFast();
        hikariConfig1.setInitializationFailFast(true);
        javax.sql.DataSource dataSource5 = null;
        hikariConfig1.setDataSource(dataSource5);
        hikariConfig1.setAcquireRetryDelay((long) 'a');
        java.lang.String str9 = hikariConfig1.getConnectionCustomizerClassName();
        java.util.Properties properties10 = hikariConfig1.getDataSourceProperties();
        hikariConfig1.setMaxLifetime((long) (short) 10);
        boolean boolean13 = hikariConfig1.isInitializationFailFast();
        hikariConfig1.setMaximumPoolSize((int) 'a');
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNotNull(properties10);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
    }

    @Test
    public void test03707() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03707");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        boolean boolean2 = hikariConfig1.isInitializationFailFast();
        hikariConfig1.setInitializationFailFast(true);
        javax.sql.DataSource dataSource5 = null;
        hikariConfig1.setDataSource(dataSource5);
        hikariConfig1.setAcquireRetryDelay((long) 'a');
        java.lang.String str9 = hikariConfig1.getConnectionCustomizerClassName();
        java.util.Properties properties10 = hikariConfig1.getDataSourceProperties();
        hikariConfig1.setAutoCommit(false);
        int int13 = hikariConfig1.getMaximumPoolSize();
        java.util.Properties properties14 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig15 = new com.zaxxer.hikari.HikariConfig(properties14);
        boolean boolean16 = hikariConfig15.isInitializationFailFast();
        hikariConfig15.setInitializationFailFast(true);
        int int19 = hikariConfig15.getAcquireRetries();
        long long20 = hikariConfig15.getMaxLifetime();
        hikariConfig15.setMaxLifetime((long) (short) 0);
        long long23 = hikariConfig15.getIdleTimeout();
        boolean boolean24 = hikariConfig15.isRegisterMbeans();
        java.util.Properties properties25 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig26 = new com.zaxxer.hikari.HikariConfig(properties25);
        boolean boolean27 = hikariConfig26.isInitializationFailFast();
        hikariConfig26.setLeakDetectionThreshold((long) '4');
        java.lang.String str30 = hikariConfig26.getConnectionCustomizerClassName();
        java.util.Properties properties31 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig32 = new com.zaxxer.hikari.HikariConfig(properties31);
        boolean boolean33 = hikariConfig32.isInitializationFailFast();
        hikariConfig32.setInitializationFailFast(true);
        javax.sql.DataSource dataSource36 = null;
        hikariConfig32.setDataSource(dataSource36);
        hikariConfig32.setAcquireRetryDelay((long) 'a');
        java.lang.String str40 = hikariConfig32.getConnectionCustomizerClassName();
        java.util.Properties properties41 = hikariConfig32.getDataSourceProperties();
        java.util.Properties properties42 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig43 = new com.zaxxer.hikari.HikariConfig(properties42);
        java.util.Properties properties44 = hikariConfig43.getDataSourceProperties();
        hikariConfig32.setDataSourceProperties(properties44);
        hikariConfig26.setDataSourceProperties(properties44);
        hikariConfig15.setDataSourceProperties(properties44);
        hikariConfig1.setDataSourceProperties(properties44);
        hikariConfig1.setAcquireRetries(10);
        hikariConfig1.setConnectionInitSql("HikariPool-934");
        java.lang.String str53 = hikariConfig1.getConnectionCustomizerClassName();
        int int54 = hikariConfig1.getTransactionIsolation();
        javax.sql.DataSource dataSource55 = hikariConfig1.getDataSource();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNotNull(properties10);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 60 + "'", int13 == 60);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 3 + "'", int19 == 3);
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 1800000L + "'", long20 == 1800000L);
        org.junit.Assert.assertTrue("'" + long23 + "' != '" + 600000L + "'", long23 == 600000L);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNull(str30);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertNull(str40);
        org.junit.Assert.assertNotNull(properties41);
        org.junit.Assert.assertNotNull(properties44);
        org.junit.Assert.assertNull(str53);
        org.junit.Assert.assertTrue("'" + int54 + "' != '" + (-1) + "'", int54 == (-1));
        org.junit.Assert.assertNull(dataSource55);
    }

    @Test
    public void test03708() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03708");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        boolean boolean2 = hikariConfig1.isInitializationFailFast();
        hikariConfig1.setLeakDetectionThreshold((long) '4');
        java.lang.String str5 = hikariConfig1.getConnectionTestQuery();
        hikariConfig1.setAcquireIncrement((int) '4');
        hikariConfig1.setIdleTimeout((long) (short) 10);
        java.util.Properties properties11 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig12 = new com.zaxxer.hikari.HikariConfig(properties11);
        boolean boolean13 = hikariConfig12.isInitializationFailFast();
        hikariConfig12.setInitializationFailFast(true);
        hikariConfig12.setAcquireRetryDelay(1L);
        hikariConfig12.setConnectionTimeout(600000L);
        hikariConfig12.setAcquireRetries(10);
        hikariConfig12.setIdleTimeout((long) 3);
        hikariConfig12.setLeakDetectionThreshold((long) 60);
        hikariConfig12.setMaxLifetime(600000L);
        java.lang.String str28 = hikariConfig12.getConnectionCustomizerClassName();
        javax.sql.DataSource dataSource29 = hikariConfig12.getDataSource();
        long long30 = hikariConfig12.getMaxLifetime();
        hikariConfig12.setConnectionTestQuery("HikariPool-3533");
        long long33 = hikariConfig12.getIdleTimeout();
        hikariConfig12.setMaximumPoolSize((int) ' ');
        hikariConfig12.setConnectionCustomizerClassName("HikariPool-11744");
        hikariConfig1.addDataSourceProperty("HikariPool-8111", (java.lang.Object) "HikariPool-11744");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNull(str28);
        org.junit.Assert.assertNull(dataSource29);
        org.junit.Assert.assertTrue("'" + long30 + "' != '" + 600000L + "'", long30 == 600000L);
        org.junit.Assert.assertTrue("'" + long33 + "' != '" + 3L + "'", long33 == 3L);
    }

    @Test
    public void test03709() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03709");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        boolean boolean2 = hikariConfig1.isInitializationFailFast();
        hikariConfig1.setTransactionIsolation("hi!");
        java.util.Properties properties5 = hikariConfig1.getDataSourceProperties();
        com.zaxxer.hikari.HikariConfig hikariConfig6 = new com.zaxxer.hikari.HikariConfig(properties5);
        com.zaxxer.hikari.HikariConfig hikariConfig7 = new com.zaxxer.hikari.HikariConfig(properties5);
        hikariConfig7.setCatalog("HikariPool-481");
        hikariConfig7.setUseInstrumentation(false);
        java.lang.String str12 = hikariConfig7.getPoolName();
        hikariConfig7.setPoolName("HikariPool-2643");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(properties5);
// flaky:         org.junit.Assert.assertEquals("'" + str12 + "' != '" + "HikariPool-31237" + "'", str12, "HikariPool-31237");
    }

    @Test
    public void test03710() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03710");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        boolean boolean2 = hikariConfig1.isInitializationFailFast();
        hikariConfig1.setInitializationFailFast(true);
        java.lang.String str5 = hikariConfig1.getConnectionTestQuery();
        boolean boolean6 = hikariConfig1.isRegisterMbeans();
        hikariConfig1.setDataSourceClassName("hi!");
        hikariConfig1.setConnectionInitSql("");
        java.lang.String str11 = hikariConfig1.getCatalog();
        java.util.Properties properties12 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig13 = new com.zaxxer.hikari.HikariConfig(properties12);
        boolean boolean14 = hikariConfig13.isInitializationFailFast();
        hikariConfig13.setInitializationFailFast(true);
        javax.sql.DataSource dataSource17 = null;
        hikariConfig13.setDataSource(dataSource17);
        hikariConfig13.setAcquireRetryDelay((long) 'a');
        java.lang.String str21 = hikariConfig13.getConnectionCustomizerClassName();
        java.util.Properties properties22 = hikariConfig13.getDataSourceProperties();
        java.util.Properties properties23 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig24 = new com.zaxxer.hikari.HikariConfig(properties23);
        boolean boolean25 = hikariConfig24.isInitializationFailFast();
        hikariConfig24.setInitializationFailFast(true);
        javax.sql.DataSource dataSource28 = null;
        hikariConfig24.setDataSource(dataSource28);
        hikariConfig24.setAcquireRetryDelay((long) 'a');
        java.lang.String str32 = hikariConfig24.getConnectionCustomizerClassName();
        java.util.Properties properties33 = hikariConfig24.getDataSourceProperties();
        hikariConfig13.setDataSourceProperties(properties33);
        hikariConfig1.setDataSourceProperties(properties33);
        com.zaxxer.hikari.HikariConfig hikariConfig36 = new com.zaxxer.hikari.HikariConfig(properties33);
        boolean boolean37 = hikariConfig36.isJdbc4ConnectionTest();
        java.lang.String str38 = hikariConfig36.getConnectionTestQuery();
        int int39 = hikariConfig36.getTransactionIsolation();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNull(str21);
        org.junit.Assert.assertNotNull(properties22);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNull(str32);
        org.junit.Assert.assertNotNull(properties33);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + true + "'", boolean37 == true);
        org.junit.Assert.assertNull(str38);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + (-1) + "'", int39 == (-1));
    }

    @Test
    public void test03711() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03711");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        boolean boolean2 = hikariConfig1.isInitializationFailFast();
        boolean boolean3 = hikariConfig1.isJdbc4ConnectionTest();
        long long4 = hikariConfig1.getConnectionTimeout();
        int int5 = hikariConfig1.getTransactionIsolation();
        hikariConfig1.setLeakDetectionThreshold(600000L);
        boolean boolean8 = hikariConfig1.isRegisterMbeans();
        javax.sql.DataSource dataSource9 = null;
        hikariConfig1.setDataSource(dataSource9);
        hikariConfig1.setAcquireRetryDelay((long) (byte) -1);
        int int13 = hikariConfig1.getTransactionIsolation();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 5000L + "'", long4 == 5000L);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
    }

    @Test
    public void test03712() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03712");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        boolean boolean2 = hikariConfig1.isInitializationFailFast();
        hikariConfig1.setInitializationFailFast(true);
        java.lang.String str5 = hikariConfig1.getConnectionTestQuery();
        hikariConfig1.setConnectionCustomizerClassName("");
        java.lang.String str8 = hikariConfig1.getConnectionInitSql();
        java.util.Properties properties10 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig11 = new com.zaxxer.hikari.HikariConfig(properties10);
        boolean boolean12 = hikariConfig11.isInitializationFailFast();
        hikariConfig11.setLeakDetectionThreshold((long) '4');
        int int15 = hikariConfig11.getTransactionIsolation();
        hikariConfig11.setMaximumPoolSize((int) (short) 100);
        java.lang.Class<?> wildcardClass18 = hikariConfig11.getClass();
        hikariConfig1.addDataSourceProperty("HikariPool-674", (java.lang.Object) hikariConfig11);
        hikariConfig1.setPoolName("HikariPool-2528");
        long long22 = hikariConfig1.getAcquireRetryDelay();
        hikariConfig1.setConnectionCustomizerClassName("HikariPool-9269");
        hikariConfig1.setUseInstrumentation(false);
        hikariConfig1.setConnectionTimeout((long) 0);
        hikariConfig1.setConnectionInitSql("HikariPool-16626");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass18);
        org.junit.Assert.assertTrue("'" + long22 + "' != '" + 0L + "'", long22 == 0L);
    }

    @Test
    public void test03713() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03713");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        boolean boolean2 = hikariConfig1.isInitializationFailFast();
        hikariConfig1.setInitializationFailFast(true);
        javax.sql.DataSource dataSource5 = null;
        hikariConfig1.setDataSource(dataSource5);
        hikariConfig1.setAcquireRetryDelay((long) 'a');
        java.lang.String str9 = hikariConfig1.getConnectionCustomizerClassName();
        java.lang.String str10 = hikariConfig1.getConnectionInitSql();
        long long11 = hikariConfig1.getConnectionTimeout();
        hikariConfig1.setAcquireIncrement(35);
        boolean boolean14 = hikariConfig1.isRegisterMbeans();
        int int15 = hikariConfig1.getAcquireIncrement();
        hikariConfig1.setConnectionTestQuery("HikariPool-9479");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 5000L + "'", long11 == 5000L);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
    }

    @Test
    public void test03714() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03714");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        boolean boolean2 = hikariConfig1.isInitializationFailFast();
        hikariConfig1.setInitializationFailFast(true);
        javax.sql.DataSource dataSource5 = null;
        hikariConfig1.setDataSource(dataSource5);
        hikariConfig1.setAcquireRetryDelay((long) 'a');
        java.lang.String str9 = hikariConfig1.getConnectionCustomizerClassName();
        java.lang.String str10 = hikariConfig1.getConnectionInitSql();
        hikariConfig1.setDataSourceClassName("");
        java.util.Properties properties13 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig14 = new com.zaxxer.hikari.HikariConfig(properties13);
        boolean boolean15 = hikariConfig14.isInitializationFailFast();
        hikariConfig14.setInitializationFailFast(true);
        javax.sql.DataSource dataSource18 = null;
        hikariConfig14.setDataSource(dataSource18);
        hikariConfig14.setAcquireRetryDelay((long) 'a');
        java.lang.String str22 = hikariConfig14.getConnectionCustomizerClassName();
        java.util.Properties properties23 = hikariConfig14.getDataSourceProperties();
        java.util.Properties properties24 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig25 = new com.zaxxer.hikari.HikariConfig(properties24);
        java.util.Properties properties26 = hikariConfig25.getDataSourceProperties();
        hikariConfig14.setDataSourceProperties(properties26);
        hikariConfig1.setDataSourceProperties(properties26);
        long long29 = hikariConfig1.getConnectionTimeout();
        hikariConfig1.setInitializationFailFast(true);
        java.util.Properties properties33 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig34 = new com.zaxxer.hikari.HikariConfig(properties33);
        boolean boolean35 = hikariConfig34.isInitializationFailFast();
        hikariConfig34.setInitializationFailFast(true);
        javax.sql.DataSource dataSource38 = null;
        hikariConfig34.setDataSource(dataSource38);
        java.lang.String str40 = hikariConfig34.getCatalog();
        int int41 = hikariConfig34.getMinimumPoolSize();
        java.lang.String str42 = hikariConfig34.getCatalog();
        long long43 = hikariConfig34.getLeakDetectionThreshold();
        java.lang.String str44 = hikariConfig34.getConnectionInitSql();
        hikariConfig34.setAcquireIncrement(100);
        int int47 = hikariConfig34.getMinimumPoolSize();
        hikariConfig1.addDataSourceProperty("HikariPool-1195", (java.lang.Object) hikariConfig34);
        long long49 = hikariConfig1.getLeakDetectionThreshold();
        hikariConfig1.setTransactionIsolation("HikariPool-907");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNull(str22);
        org.junit.Assert.assertNotNull(properties23);
        org.junit.Assert.assertNotNull(properties26);
        org.junit.Assert.assertTrue("'" + long29 + "' != '" + 5000L + "'", long29 == 5000L);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertNull(str40);
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 10 + "'", int41 == 10);
        org.junit.Assert.assertNull(str42);
        org.junit.Assert.assertTrue("'" + long43 + "' != '" + 0L + "'", long43 == 0L);
        org.junit.Assert.assertNull(str44);
        org.junit.Assert.assertTrue("'" + int47 + "' != '" + 10 + "'", int47 == 10);
        org.junit.Assert.assertTrue("'" + long49 + "' != '" + 0L + "'", long49 == 0L);
    }

    @Test
    public void test03715() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03715");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        boolean boolean2 = hikariConfig1.isInitializationFailFast();
        boolean boolean3 = hikariConfig1.isJdbc4ConnectionTest();
        long long4 = hikariConfig1.getConnectionTimeout();
        int int5 = hikariConfig1.getTransactionIsolation();
        hikariConfig1.setLeakDetectionThreshold(600000L);
        hikariConfig1.setLeakDetectionThreshold(1L);
        java.util.Properties properties11 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig12 = new com.zaxxer.hikari.HikariConfig(properties11);
        boolean boolean13 = hikariConfig12.isInitializationFailFast();
        hikariConfig12.setInitializationFailFast(true);
        int int16 = hikariConfig12.getAcquireRetries();
        boolean boolean17 = hikariConfig12.isRegisterMbeans();
        boolean boolean18 = hikariConfig12.isJdbc4ConnectionTest();
        hikariConfig1.addDataSourceProperty("HikariPool-1455", (java.lang.Object) hikariConfig12);
        hikariConfig1.setUseInstrumentation(false);
        hikariConfig1.setTransactionIsolation("HikariPool-4523");
        java.util.Properties properties25 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig26 = new com.zaxxer.hikari.HikariConfig(properties25);
        hikariConfig26.setTransactionIsolation("");
        int int29 = hikariConfig26.getAcquireIncrement();
        javax.sql.DataSource dataSource30 = hikariConfig26.getDataSource();
        hikariConfig26.setAcquireRetries((int) (byte) 0);
        hikariConfig26.setJdbc4ConnectionTest(false);
        long long35 = hikariConfig26.getAcquireRetryDelay();
        hikariConfig26.setMinimumPoolSize(10);
        boolean boolean38 = hikariConfig26.isJdbc4ConnectionTest();
        hikariConfig1.addDataSourceProperty("HikariPool-19739", (java.lang.Object) hikariConfig26);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 5000L + "'", long4 == 5000L);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 3 + "'", int16 == 3);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
        org.junit.Assert.assertNull(dataSource30);
        org.junit.Assert.assertTrue("'" + long35 + "' != '" + 0L + "'", long35 == 0L);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
    }

    @Test
    public void test03716() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03716");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        boolean boolean2 = hikariConfig1.isInitializationFailFast();
        hikariConfig1.setInitializationFailFast(true);
        javax.sql.DataSource dataSource5 = null;
        hikariConfig1.setDataSource(dataSource5);
        java.lang.String str7 = hikariConfig1.getCatalog();
        int int8 = hikariConfig1.getMinimumPoolSize();
        java.lang.String str9 = hikariConfig1.getCatalog();
        long long10 = hikariConfig1.getLeakDetectionThreshold();
        java.util.Properties properties11 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig12 = new com.zaxxer.hikari.HikariConfig(properties11);
        boolean boolean13 = hikariConfig12.isInitializationFailFast();
        hikariConfig12.setInitializationFailFast(true);
        javax.sql.DataSource dataSource16 = null;
        hikariConfig12.setDataSource(dataSource16);
        hikariConfig12.setAcquireRetryDelay((long) 'a');
        java.lang.String str20 = hikariConfig12.getConnectionCustomizerClassName();
        java.lang.String str21 = hikariConfig12.getConnectionInitSql();
        hikariConfig12.setDataSourceClassName("");
        java.util.Properties properties24 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig25 = new com.zaxxer.hikari.HikariConfig(properties24);
        boolean boolean26 = hikariConfig25.isInitializationFailFast();
        hikariConfig25.setInitializationFailFast(true);
        javax.sql.DataSource dataSource29 = null;
        hikariConfig25.setDataSource(dataSource29);
        hikariConfig25.setAcquireRetryDelay((long) 'a');
        java.lang.String str33 = hikariConfig25.getConnectionCustomizerClassName();
        java.util.Properties properties34 = hikariConfig25.getDataSourceProperties();
        java.util.Properties properties35 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig36 = new com.zaxxer.hikari.HikariConfig(properties35);
        java.util.Properties properties37 = hikariConfig36.getDataSourceProperties();
        hikariConfig25.setDataSourceProperties(properties37);
        hikariConfig12.setDataSourceProperties(properties37);
        hikariConfig1.setDataSourceProperties(properties37);
        hikariConfig1.setMaximumPoolSize((int) (short) 100);
        long long43 = hikariConfig1.getMaxLifetime();
        long long44 = hikariConfig1.getConnectionTimeout();
        hikariConfig1.setRegisterMbeans(false);
        java.lang.String str47 = hikariConfig1.getConnectionInitSql();
        hikariConfig1.setUseInstrumentation(false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 10 + "'", int8 == 10);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNull(str20);
        org.junit.Assert.assertNull(str21);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNull(str33);
        org.junit.Assert.assertNotNull(properties34);
        org.junit.Assert.assertNotNull(properties37);
        org.junit.Assert.assertTrue("'" + long43 + "' != '" + 1800000L + "'", long43 == 1800000L);
        org.junit.Assert.assertTrue("'" + long44 + "' != '" + 5000L + "'", long44 == 5000L);
        org.junit.Assert.assertNull(str47);
    }

    @Test
    public void test03717() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03717");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        boolean boolean2 = hikariConfig1.isInitializationFailFast();
        hikariConfig1.setInitializationFailFast(true);
        javax.sql.DataSource dataSource5 = null;
        hikariConfig1.setDataSource(dataSource5);
        hikariConfig1.setAcquireRetryDelay((long) 'a');
        java.lang.String str9 = hikariConfig1.getConnectionCustomizerClassName();
        java.lang.String str10 = hikariConfig1.getConnectionInitSql();
        hikariConfig1.setDataSourceClassName("");
        java.util.Properties properties13 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig14 = new com.zaxxer.hikari.HikariConfig(properties13);
        boolean boolean15 = hikariConfig14.isInitializationFailFast();
        hikariConfig14.setInitializationFailFast(true);
        javax.sql.DataSource dataSource18 = null;
        hikariConfig14.setDataSource(dataSource18);
        hikariConfig14.setAcquireRetryDelay((long) 'a');
        java.lang.String str22 = hikariConfig14.getConnectionCustomizerClassName();
        java.util.Properties properties23 = hikariConfig14.getDataSourceProperties();
        java.util.Properties properties24 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig25 = new com.zaxxer.hikari.HikariConfig(properties24);
        java.util.Properties properties26 = hikariConfig25.getDataSourceProperties();
        hikariConfig14.setDataSourceProperties(properties26);
        hikariConfig1.setDataSourceProperties(properties26);
        long long29 = hikariConfig1.getConnectionTimeout();
        hikariConfig1.setInitializationFailFast(true);
        java.util.Properties properties33 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig34 = new com.zaxxer.hikari.HikariConfig(properties33);
        boolean boolean35 = hikariConfig34.isInitializationFailFast();
        hikariConfig34.setInitializationFailFast(true);
        javax.sql.DataSource dataSource38 = null;
        hikariConfig34.setDataSource(dataSource38);
        java.lang.String str40 = hikariConfig34.getCatalog();
        int int41 = hikariConfig34.getMinimumPoolSize();
        java.lang.String str42 = hikariConfig34.getCatalog();
        long long43 = hikariConfig34.getLeakDetectionThreshold();
        java.lang.String str44 = hikariConfig34.getConnectionInitSql();
        hikariConfig34.setAcquireIncrement(100);
        int int47 = hikariConfig34.getMinimumPoolSize();
        hikariConfig1.addDataSourceProperty("HikariPool-1195", (java.lang.Object) hikariConfig34);
        long long49 = hikariConfig1.getLeakDetectionThreshold();
        long long50 = hikariConfig1.getMaxLifetime();
        hikariConfig1.validate();
        javax.sql.DataSource dataSource52 = null;
        hikariConfig1.setDataSource(dataSource52);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNull(str22);
        org.junit.Assert.assertNotNull(properties23);
        org.junit.Assert.assertNotNull(properties26);
        org.junit.Assert.assertTrue("'" + long29 + "' != '" + 5000L + "'", long29 == 5000L);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertNull(str40);
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 10 + "'", int41 == 10);
        org.junit.Assert.assertNull(str42);
        org.junit.Assert.assertTrue("'" + long43 + "' != '" + 0L + "'", long43 == 0L);
        org.junit.Assert.assertNull(str44);
        org.junit.Assert.assertTrue("'" + int47 + "' != '" + 10 + "'", int47 == 10);
        org.junit.Assert.assertTrue("'" + long49 + "' != '" + 0L + "'", long49 == 0L);
        org.junit.Assert.assertTrue("'" + long50 + "' != '" + 1800000L + "'", long50 == 1800000L);
    }

    @Test
    public void test03718() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03718");
        // The following exception was thrown during execution in test generation
        try {
            com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig("HikariPool-13970");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Property file HikariPool-13970 was not found.");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test03719() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03719");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        boolean boolean2 = hikariConfig1.isInitializationFailFast();
        hikariConfig1.setInitializationFailFast(true);
        boolean boolean5 = hikariConfig1.isJdbc4ConnectionTest();
        hikariConfig1.setMaximumPoolSize(100);
        hikariConfig1.setRegisterMbeans(true);
        hikariConfig1.setInitializationFailFast(true);
        int int12 = hikariConfig1.getAcquireRetries();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 3 + "'", int12 == 3);
    }

    @Test
    public void test03720() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03720");
        // The following exception was thrown during execution in test generation
        try {
            com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig("HikariPool-30139");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Property file HikariPool-30139 was not found.");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test03721() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03721");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        boolean boolean2 = hikariConfig1.isInitializationFailFast();
        hikariConfig1.setInitializationFailFast(true);
        javax.sql.DataSource dataSource5 = null;
        hikariConfig1.setDataSource(dataSource5);
        hikariConfig1.setAcquireRetryDelay((long) 'a');
        java.lang.String str9 = hikariConfig1.getConnectionCustomizerClassName();
        java.lang.String str10 = hikariConfig1.getConnectionInitSql();
        hikariConfig1.setDataSourceClassName("");
        java.util.Properties properties13 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig14 = new com.zaxxer.hikari.HikariConfig(properties13);
        boolean boolean15 = hikariConfig14.isInitializationFailFast();
        hikariConfig14.setInitializationFailFast(true);
        javax.sql.DataSource dataSource18 = null;
        hikariConfig14.setDataSource(dataSource18);
        hikariConfig14.setAcquireRetryDelay((long) 'a');
        java.lang.String str22 = hikariConfig14.getConnectionCustomizerClassName();
        java.util.Properties properties23 = hikariConfig14.getDataSourceProperties();
        java.util.Properties properties24 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig25 = new com.zaxxer.hikari.HikariConfig(properties24);
        java.util.Properties properties26 = hikariConfig25.getDataSourceProperties();
        hikariConfig14.setDataSourceProperties(properties26);
        hikariConfig1.setDataSourceProperties(properties26);
        hikariConfig1.setUseInstrumentation(true);
        hikariConfig1.setAutoCommit(false);
        int int33 = hikariConfig1.getMaximumPoolSize();
        hikariConfig1.setAutoCommit(true);
        boolean boolean36 = hikariConfig1.isInitializationFailFast();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNull(str22);
        org.junit.Assert.assertNotNull(properties23);
        org.junit.Assert.assertNotNull(properties26);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 60 + "'", int33 == 60);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + true + "'", boolean36 == true);
    }

    @Test
    public void test03722() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03722");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        boolean boolean2 = hikariConfig1.isInitializationFailFast();
        hikariConfig1.setLeakDetectionThreshold((long) '4');
        java.lang.String str5 = hikariConfig1.getConnectionCustomizerClassName();
        java.util.Properties properties6 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig7 = new com.zaxxer.hikari.HikariConfig(properties6);
        boolean boolean8 = hikariConfig7.isInitializationFailFast();
        hikariConfig7.setInitializationFailFast(true);
        javax.sql.DataSource dataSource11 = null;
        hikariConfig7.setDataSource(dataSource11);
        hikariConfig7.setAcquireRetryDelay((long) 'a');
        java.lang.String str15 = hikariConfig7.getConnectionCustomizerClassName();
        java.util.Properties properties16 = hikariConfig7.getDataSourceProperties();
        java.util.Properties properties17 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig18 = new com.zaxxer.hikari.HikariConfig(properties17);
        java.util.Properties properties19 = hikariConfig18.getDataSourceProperties();
        hikariConfig7.setDataSourceProperties(properties19);
        hikariConfig1.setDataSourceProperties(properties19);
        java.lang.String str22 = hikariConfig1.getDataSourceClassName();
        hikariConfig1.setConnectionCustomizerClassName("");
        hikariConfig1.setMinimumPoolSize((int) ' ');
        java.lang.String str27 = hikariConfig1.getCatalog();
        int int28 = hikariConfig1.getAcquireRetries();
        hikariConfig1.setCatalog("HikariPool-5174");
        java.lang.String str31 = hikariConfig1.getPoolName();
        boolean boolean32 = hikariConfig1.isJdbc4ConnectionTest();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertNotNull(properties16);
        org.junit.Assert.assertNotNull(properties19);
        org.junit.Assert.assertNull(str22);
        org.junit.Assert.assertNull(str27);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 3 + "'", int28 == 3);
// flaky:         org.junit.Assert.assertEquals("'" + str31 + "' != '" + "HikariPool-31307" + "'", str31, "HikariPool-31307");
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + true + "'", boolean32 == true);
    }

    @Test
    public void test03723() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03723");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        boolean boolean2 = hikariConfig1.isInitializationFailFast();
        hikariConfig1.setInitializationFailFast(true);
        javax.sql.DataSource dataSource5 = null;
        hikariConfig1.setDataSource(dataSource5);
        java.lang.String str7 = hikariConfig1.getCatalog();
        int int8 = hikariConfig1.getMinimumPoolSize();
        boolean boolean9 = hikariConfig1.isJdbc4ConnectionTest();
        java.util.Properties properties11 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig12 = new com.zaxxer.hikari.HikariConfig(properties11);
        boolean boolean13 = hikariConfig12.isInitializationFailFast();
        hikariConfig12.setInitializationFailFast(true);
        javax.sql.DataSource dataSource16 = null;
        hikariConfig12.setDataSource(dataSource16);
        java.lang.String str18 = hikariConfig12.getCatalog();
        int int19 = hikariConfig12.getMinimumPoolSize();
        hikariConfig12.setTransactionIsolation("");
        hikariConfig1.addDataSourceProperty("HikariPool-1566", (java.lang.Object) hikariConfig12);
        hikariConfig12.setLeakDetectionThreshold((long) ' ');
        hikariConfig12.setCatalog("HikariPool-8010");
        int int27 = hikariConfig12.getMinimumPoolSize();
        javax.sql.DataSource dataSource28 = null;
        hikariConfig12.setDataSource(dataSource28);
        hikariConfig12.setInitializationFailFast(false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 10 + "'", int8 == 10);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 10 + "'", int19 == 10);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 10 + "'", int27 == 10);
    }

    @Test
    public void test03724() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03724");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        boolean boolean2 = hikariConfig1.isInitializationFailFast();
        hikariConfig1.setInitializationFailFast(true);
        java.lang.String str5 = hikariConfig1.getConnectionTestQuery();
        hikariConfig1.setConnectionCustomizerClassName("");
        java.lang.String str8 = hikariConfig1.getConnectionInitSql();
        int int9 = hikariConfig1.getMaximumPoolSize();
        hikariConfig1.setAcquireRetryDelay(600000L);
        java.util.Properties properties13 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig14 = new com.zaxxer.hikari.HikariConfig(properties13);
        boolean boolean15 = hikariConfig14.isInitializationFailFast();
        hikariConfig14.setInitializationFailFast(true);
        javax.sql.DataSource dataSource18 = null;
        hikariConfig14.setDataSource(dataSource18);
        hikariConfig14.setAcquireRetryDelay((long) 'a');
        java.lang.String str22 = hikariConfig14.getConnectionCustomizerClassName();
        java.lang.String str23 = hikariConfig14.getConnectionInitSql();
        hikariConfig14.setDataSourceClassName("");
        java.util.Properties properties26 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig27 = new com.zaxxer.hikari.HikariConfig(properties26);
        boolean boolean28 = hikariConfig27.isInitializationFailFast();
        hikariConfig27.setInitializationFailFast(true);
        javax.sql.DataSource dataSource31 = null;
        hikariConfig27.setDataSource(dataSource31);
        hikariConfig27.setAcquireRetryDelay((long) 'a');
        java.lang.String str35 = hikariConfig27.getConnectionCustomizerClassName();
        java.util.Properties properties36 = hikariConfig27.getDataSourceProperties();
        java.util.Properties properties37 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig38 = new com.zaxxer.hikari.HikariConfig(properties37);
        java.util.Properties properties39 = hikariConfig38.getDataSourceProperties();
        hikariConfig27.setDataSourceProperties(properties39);
        hikariConfig14.setDataSourceProperties(properties39);
        hikariConfig14.setUseInstrumentation(true);
        hikariConfig14.setLeakDetectionThreshold((long) (byte) 1);
        java.lang.String str46 = hikariConfig14.getPoolName();
        javax.sql.DataSource dataSource47 = null;
        hikariConfig14.setDataSource(dataSource47);
        long long49 = hikariConfig14.getConnectionTimeout();
        javax.sql.DataSource dataSource50 = null;
        hikariConfig14.setDataSource(dataSource50);
        hikariConfig1.addDataSourceProperty("HikariPool-11298", (java.lang.Object) hikariConfig14);
        boolean boolean53 = hikariConfig1.isJdbc4ConnectionTest();
        hikariConfig1.setMaximumPoolSize(3);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 60 + "'", int9 == 60);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNull(str22);
        org.junit.Assert.assertNull(str23);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertNull(str35);
        org.junit.Assert.assertNotNull(properties36);
        org.junit.Assert.assertNotNull(properties39);
// flaky:         org.junit.Assert.assertEquals("'" + str46 + "' != '" + "HikariPool-31334" + "'", str46, "HikariPool-31334");
        org.junit.Assert.assertTrue("'" + long49 + "' != '" + 5000L + "'", long49 == 5000L);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + true + "'", boolean53 == true);
    }

    @Test
    public void test03725() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03725");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        boolean boolean2 = hikariConfig1.isInitializationFailFast();
        boolean boolean3 = hikariConfig1.isJdbc4ConnectionTest();
        javax.sql.DataSource dataSource4 = null;
        hikariConfig1.setDataSource(dataSource4);
        int int6 = hikariConfig1.getAcquireIncrement();
        hikariConfig1.setMaxLifetime((long) 100);
        hikariConfig1.addDataSourceProperty("HikariPool-10339", (java.lang.Object) "HikariPool-5594");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
    }

    @Test
    public void test03726() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03726");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        boolean boolean2 = hikariConfig1.isInitializationFailFast();
        hikariConfig1.setInitializationFailFast(true);
        javax.sql.DataSource dataSource5 = null;
        hikariConfig1.setDataSource(dataSource5);
        hikariConfig1.setAcquireRetryDelay((long) 'a');
        java.lang.String str9 = hikariConfig1.getConnectionCustomizerClassName();
        java.lang.String str10 = hikariConfig1.getConnectionInitSql();
        boolean boolean11 = hikariConfig1.isInitializationFailFast();
        hikariConfig1.setMaxLifetime((long) (short) 1);
        javax.sql.DataSource dataSource14 = hikariConfig1.getDataSource();
        boolean boolean15 = hikariConfig1.isInitializationFailFast();
        long long16 = hikariConfig1.getAcquireRetryDelay();
        hikariConfig1.setPoolName("HikariPool-5778");
        boolean boolean19 = hikariConfig1.isAutoCommit();
        long long20 = hikariConfig1.getIdleTimeout();
        javax.sql.DataSource dataSource21 = hikariConfig1.getDataSource();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNull(dataSource14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 0L + "'", long16 == 0L);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 600000L + "'", long20 == 600000L);
        org.junit.Assert.assertNull(dataSource21);
    }

    @Test
    public void test03727() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03727");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        boolean boolean2 = hikariConfig1.isInitializationFailFast();
        hikariConfig1.setInitializationFailFast(true);
        javax.sql.DataSource dataSource5 = null;
        hikariConfig1.setDataSource(dataSource5);
        java.lang.String str7 = hikariConfig1.getCatalog();
        int int8 = hikariConfig1.getTransactionIsolation();
        int int9 = hikariConfig1.getMaximumPoolSize();
        hikariConfig1.setConnectionTestQuery("HikariPool-2681");
        hikariConfig1.setConnectionCustomizerClassName("HikariPool-3868");
        java.util.Properties properties15 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig16 = new com.zaxxer.hikari.HikariConfig(properties15);
        boolean boolean17 = hikariConfig16.isInitializationFailFast();
        hikariConfig16.setInitializationFailFast(true);
        javax.sql.DataSource dataSource20 = null;
        hikariConfig16.setDataSource(dataSource20);
        hikariConfig16.setAcquireRetryDelay((long) 'a');
        java.lang.String str24 = hikariConfig16.getConnectionCustomizerClassName();
        int int25 = hikariConfig16.getAcquireRetries();
        java.lang.String str26 = hikariConfig16.getDataSourceClassName();
        java.lang.String str27 = hikariConfig16.getConnectionTestQuery();
        hikariConfig16.setConnectionCustomizerClassName("hi!");
        int int30 = hikariConfig16.getAcquireIncrement();
        hikariConfig1.addDataSourceProperty("HikariPool-7720", (java.lang.Object) hikariConfig16);
        boolean boolean32 = hikariConfig16.isAutoCommit();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 60 + "'", int9 == 60);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNull(str24);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 3 + "'", int25 == 3);
        org.junit.Assert.assertNull(str26);
        org.junit.Assert.assertNull(str27);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + true + "'", boolean32 == true);
    }

    @Test
    public void test03728() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03728");
        // The following exception was thrown during execution in test generation
        try {
            com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig("HikariPool-13848");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Property file HikariPool-13848 was not found.");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test03729() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03729");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        hikariConfig1.setConnectionInitSql("");
        long long4 = hikariConfig1.getIdleTimeout();
        hikariConfig1.setLeakDetectionThreshold((long) 60);
        boolean boolean7 = hikariConfig1.isAutoCommit();
        hikariConfig1.setAcquireIncrement(10);
        java.lang.String str10 = hikariConfig1.getDataSourceClassName();
        java.lang.String str11 = hikariConfig1.getCatalog();
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 600000L + "'", long4 == 600000L);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(str11);
    }

    @Test
    public void test03730() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03730");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        boolean boolean2 = hikariConfig1.isInitializationFailFast();
        hikariConfig1.setInitializationFailFast(true);
        javax.sql.DataSource dataSource5 = null;
        hikariConfig1.setDataSource(dataSource5);
        hikariConfig1.setAcquireRetryDelay((long) 'a');
        java.lang.String str9 = hikariConfig1.getConnectionCustomizerClassName();
        int int10 = hikariConfig1.getAcquireRetries();
        hikariConfig1.setConnectionCustomizerClassName("");
        hikariConfig1.setAcquireRetries((int) (short) 100);
        java.util.Properties properties16 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig17 = new com.zaxxer.hikari.HikariConfig(properties16);
        boolean boolean18 = hikariConfig17.isInitializationFailFast();
        hikariConfig17.setInitializationFailFast(true);
        javax.sql.DataSource dataSource21 = null;
        hikariConfig17.setDataSource(dataSource21);
        hikariConfig17.setAcquireRetryDelay((long) 'a');
        java.lang.String str25 = hikariConfig17.getConnectionCustomizerClassName();
        java.lang.String str26 = hikariConfig17.getConnectionInitSql();
        boolean boolean27 = hikariConfig17.isInitializationFailFast();
        hikariConfig17.setMaxLifetime((long) (short) 1);
        hikariConfig1.addDataSourceProperty("HikariPool-393", (java.lang.Object) (short) 1);
        hikariConfig1.setMaximumPoolSize(10);
        java.lang.String str33 = hikariConfig1.getPoolName();
        java.lang.String str34 = hikariConfig1.getConnectionTestQuery();
        hikariConfig1.setConnectionTestQuery("HikariPool-5052");
        boolean boolean37 = hikariConfig1.isAutoCommit();
        java.lang.String str38 = hikariConfig1.getCatalog();
        java.lang.String str39 = hikariConfig1.getCatalog();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 3 + "'", int10 == 3);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNull(str25);
        org.junit.Assert.assertNull(str26);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
// flaky:         org.junit.Assert.assertEquals("'" + str33 + "' != '" + "HikariPool-31372" + "'", str33, "HikariPool-31372");
        org.junit.Assert.assertNull(str34);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + true + "'", boolean37 == true);
        org.junit.Assert.assertNull(str38);
        org.junit.Assert.assertNull(str39);
    }

    @Test
    public void test03731() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03731");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        boolean boolean2 = hikariConfig1.isInitializationFailFast();
        hikariConfig1.setInitializationFailFast(true);
        java.lang.String str5 = hikariConfig1.getConnectionTestQuery();
        boolean boolean6 = hikariConfig1.isRegisterMbeans();
        hikariConfig1.setDataSourceClassName("hi!");
        hikariConfig1.setAcquireRetries(1);
        javax.sql.DataSource dataSource11 = hikariConfig1.getDataSource();
        hikariConfig1.setAutoCommit(false);
        hikariConfig1.setConnectionTimeout(0L);
        hikariConfig1.addDataSourceProperty("HikariPool-3156", (java.lang.Object) (-1));
        hikariConfig1.setTransactionIsolation("HikariPool-6499");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(dataSource11);
    }

    @Test
    public void test03732() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03732");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        boolean boolean2 = hikariConfig1.isInitializationFailFast();
        hikariConfig1.setInitializationFailFast(true);
        javax.sql.DataSource dataSource5 = null;
        hikariConfig1.setDataSource(dataSource5);
        hikariConfig1.setAcquireRetryDelay((long) 'a');
        java.lang.String str9 = hikariConfig1.getConnectionCustomizerClassName();
        int int10 = hikariConfig1.getAcquireRetries();
        java.lang.String str11 = hikariConfig1.getDataSourceClassName();
        java.lang.String str12 = hikariConfig1.getConnectionTestQuery();
        hikariConfig1.setConnectionCustomizerClassName("hi!");
        boolean boolean15 = hikariConfig1.isAutoCommit();
        boolean boolean16 = hikariConfig1.isInitializationFailFast();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 3 + "'", int10 == 3);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
    }

    @Test
    public void test03733() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03733");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        boolean boolean2 = hikariConfig1.isInitializationFailFast();
        hikariConfig1.setLeakDetectionThreshold((long) '4');
        int int5 = hikariConfig1.getTransactionIsolation();
        hikariConfig1.setAcquireRetries(0);
        hikariConfig1.setMaxLifetime(0L);
        hikariConfig1.setInitializationFailFast(true);
        hikariConfig1.setMaximumPoolSize((int) 'a');
        hikariConfig1.setMaxLifetime((long) 10);
        long long16 = hikariConfig1.getMaxLifetime();
        hikariConfig1.setIdleTimeout((long) 1);
        long long19 = hikariConfig1.getAcquireRetryDelay();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 10L + "'", long16 == 10L);
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 0L + "'", long19 == 0L);
    }

    @Test
    public void test03734() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03734");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        boolean boolean2 = hikariConfig1.isInitializationFailFast();
        hikariConfig1.setLeakDetectionThreshold((long) '4');
        java.lang.String str5 = hikariConfig1.getConnectionCustomizerClassName();
        java.util.Properties properties6 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig7 = new com.zaxxer.hikari.HikariConfig(properties6);
        boolean boolean8 = hikariConfig7.isInitializationFailFast();
        hikariConfig7.setInitializationFailFast(true);
        javax.sql.DataSource dataSource11 = null;
        hikariConfig7.setDataSource(dataSource11);
        hikariConfig7.setAcquireRetryDelay((long) 'a');
        java.lang.String str15 = hikariConfig7.getConnectionCustomizerClassName();
        java.util.Properties properties16 = hikariConfig7.getDataSourceProperties();
        java.util.Properties properties17 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig18 = new com.zaxxer.hikari.HikariConfig(properties17);
        java.util.Properties properties19 = hikariConfig18.getDataSourceProperties();
        hikariConfig7.setDataSourceProperties(properties19);
        hikariConfig1.setDataSourceProperties(properties19);
        java.lang.String str22 = hikariConfig1.getDataSourceClassName();
        hikariConfig1.setConnectionCustomizerClassName("");
        boolean boolean25 = hikariConfig1.isRegisterMbeans();
        java.lang.Class<?> wildcardClass26 = hikariConfig1.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertNotNull(properties16);
        org.junit.Assert.assertNotNull(properties19);
        org.junit.Assert.assertNull(str22);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNotNull(wildcardClass26);
    }

    @Test
    public void test03735() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03735");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        boolean boolean2 = hikariConfig1.isInitializationFailFast();
        hikariConfig1.setLeakDetectionThreshold((long) '4');
        java.lang.String str5 = hikariConfig1.getConnectionCustomizerClassName();
        java.util.Properties properties6 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig7 = new com.zaxxer.hikari.HikariConfig(properties6);
        boolean boolean8 = hikariConfig7.isInitializationFailFast();
        hikariConfig7.setInitializationFailFast(true);
        javax.sql.DataSource dataSource11 = null;
        hikariConfig7.setDataSource(dataSource11);
        hikariConfig7.setAcquireRetryDelay((long) 'a');
        java.lang.String str15 = hikariConfig7.getConnectionCustomizerClassName();
        java.util.Properties properties16 = hikariConfig7.getDataSourceProperties();
        java.util.Properties properties17 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig18 = new com.zaxxer.hikari.HikariConfig(properties17);
        java.util.Properties properties19 = hikariConfig18.getDataSourceProperties();
        hikariConfig7.setDataSourceProperties(properties19);
        hikariConfig1.setDataSourceProperties(properties19);
        javax.sql.DataSource dataSource22 = hikariConfig1.getDataSource();
        hikariConfig1.setAcquireIncrement((int) (short) -1);
        int int25 = hikariConfig1.getMinimumPoolSize();
        hikariConfig1.setConnectionInitSql("HikariPool-4550");
        hikariConfig1.setInitializationFailFast(false);
        java.lang.String str30 = hikariConfig1.getConnectionInitSql();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertNotNull(properties16);
        org.junit.Assert.assertNotNull(properties19);
        org.junit.Assert.assertNull(dataSource22);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 10 + "'", int25 == 10);
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "HikariPool-4550" + "'", str30, "HikariPool-4550");
    }

    @Test
    public void test03736() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03736");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        boolean boolean2 = hikariConfig1.isInitializationFailFast();
        boolean boolean3 = hikariConfig1.isJdbc4ConnectionTest();
        hikariConfig1.addDataSourceProperty("", (java.lang.Object) false);
        hikariConfig1.setTransactionIsolation("HikariPool-143");
        hikariConfig1.setConnectionInitSql("HikariPool-184");
        hikariConfig1.setDataSourceClassName("HikariPool-1009");
        hikariConfig1.setMaxLifetime((long) (-1));
        java.lang.String str15 = hikariConfig1.getConnectionCustomizerClassName();
        hikariConfig1.setConnectionTimeout(0L);
        hikariConfig1.setMinimumPoolSize((int) (short) 0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNull(str15);
    }

    @Test
    public void test03737() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03737");
        // The following exception was thrown during execution in test generation
        try {
            com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig("HikariPool-27277");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Property file HikariPool-27277 was not found.");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test03738() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03738");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        boolean boolean2 = hikariConfig1.isInitializationFailFast();
        hikariConfig1.setInitializationFailFast(true);
        hikariConfig1.setAcquireRetryDelay(1L);
        hikariConfig1.setConnectionTimeout(600000L);
        hikariConfig1.setConnectionCustomizerClassName("HikariPool-143");
        long long11 = hikariConfig1.getMaxLifetime();
        java.util.Properties properties12 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig13 = new com.zaxxer.hikari.HikariConfig(properties12);
        boolean boolean14 = hikariConfig13.isInitializationFailFast();
        hikariConfig13.setInitializationFailFast(true);
        hikariConfig13.setAcquireRetryDelay(1L);
        boolean boolean19 = hikariConfig13.isAutoCommit();
        java.util.Properties properties20 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig21 = new com.zaxxer.hikari.HikariConfig(properties20);
        java.util.Properties properties22 = hikariConfig21.getDataSourceProperties();
        hikariConfig13.setDataSourceProperties(properties22);
        hikariConfig1.setDataSourceProperties(properties22);
        hikariConfig1.setIdleTimeout((long) (byte) 100);
        java.lang.String str27 = hikariConfig1.getConnectionTestQuery();
        boolean boolean28 = hikariConfig1.isInitializationFailFast();
        java.lang.Class<?> wildcardClass29 = hikariConfig1.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 1800000L + "'", long11 == 1800000L);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertNotNull(properties22);
        org.junit.Assert.assertNull(str27);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertNotNull(wildcardClass29);
    }

    @Test
    public void test03739() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03739");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        boolean boolean2 = hikariConfig1.isInitializationFailFast();
        hikariConfig1.setInitializationFailFast(true);
        javax.sql.DataSource dataSource5 = null;
        hikariConfig1.setDataSource(dataSource5);
        hikariConfig1.setAcquireRetryDelay((long) 'a');
        java.lang.String str9 = hikariConfig1.getConnectionCustomizerClassName();
        java.lang.String str10 = hikariConfig1.getConnectionInitSql();
        hikariConfig1.setDataSourceClassName("");
        hikariConfig1.setCatalog("HikariPool-1535");
        hikariConfig1.setMaximumPoolSize((int) (byte) 100);
        hikariConfig1.setInitializationFailFast(false);
        java.lang.String str19 = hikariConfig1.getConnectionInitSql();
        javax.sql.DataSource dataSource20 = null;
        hikariConfig1.setDataSource(dataSource20);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(str19);
    }

    @Test
    public void test03740() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03740");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        boolean boolean2 = hikariConfig1.isInitializationFailFast();
        boolean boolean3 = hikariConfig1.isJdbc4ConnectionTest();
        hikariConfig1.addDataSourceProperty("", (java.lang.Object) false);
        hikariConfig1.setRegisterMbeans(true);
        hikariConfig1.setDataSourceClassName("hi!");
        java.lang.String str11 = hikariConfig1.getPoolName();
        hikariConfig1.setConnectionTestQuery("HikariPool-594");
        hikariConfig1.validate();
        long long15 = hikariConfig1.getLeakDetectionThreshold();
        long long16 = hikariConfig1.getConnectionTimeout();
        hikariConfig1.setConnectionTimeout((long) 100);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "HikariPool-31415" + "'", str11, "HikariPool-31415");
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 0L + "'", long15 == 0L);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 5000L + "'", long16 == 5000L);
    }

    @Test
    public void test03741() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03741");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        boolean boolean2 = hikariConfig1.isInitializationFailFast();
        boolean boolean3 = hikariConfig1.isJdbc4ConnectionTest();
        hikariConfig1.addDataSourceProperty("", (java.lang.Object) false);
        java.lang.String str7 = hikariConfig1.getConnectionTestQuery();
        hikariConfig1.setLeakDetectionThreshold((long) (byte) 100);
        hikariConfig1.setMaximumPoolSize(1);
        hikariConfig1.setAcquireRetries(97);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNull(str7);
    }

    @Test
    public void test03742() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03742");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        boolean boolean2 = hikariConfig1.isInitializationFailFast();
        hikariConfig1.setInitializationFailFast(true);
        boolean boolean5 = hikariConfig1.isJdbc4ConnectionTest();
        long long6 = hikariConfig1.getConnectionTimeout();
        hikariConfig1.setAcquireIncrement(100);
        hikariConfig1.setPoolName("");
        long long11 = hikariConfig1.getLeakDetectionThreshold();
        hikariConfig1.setRegisterMbeans(false);
        int int14 = hikariConfig1.getTransactionIsolation();
        hikariConfig1.setPoolName("HikariPool-12112");
        javax.sql.DataSource dataSource17 = hikariConfig1.getDataSource();
        hikariConfig1.setMaxLifetime((long) (short) -1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 5000L + "'", long6 == 5000L);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 0L + "'", long11 == 0L);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertNull(dataSource17);
    }

    @Test
    public void test03743() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03743");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        boolean boolean2 = hikariConfig1.isInitializationFailFast();
        boolean boolean3 = hikariConfig1.isJdbc4ConnectionTest();
        hikariConfig1.setDataSourceClassName("hi!");
        java.util.Properties properties7 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig8 = new com.zaxxer.hikari.HikariConfig(properties7);
        boolean boolean9 = hikariConfig8.isInitializationFailFast();
        hikariConfig8.setInitializationFailFast(true);
        javax.sql.DataSource dataSource12 = null;
        hikariConfig8.setDataSource(dataSource12);
        hikariConfig8.setAcquireRetryDelay((long) 'a');
        java.lang.String str16 = hikariConfig8.getConnectionCustomizerClassName();
        java.util.Properties properties17 = hikariConfig8.getDataSourceProperties();
        hikariConfig8.setAutoCommit(false);
        hikariConfig8.setInitializationFailFast(false);
        int int22 = hikariConfig8.getMaximumPoolSize();
        boolean boolean23 = hikariConfig8.isRegisterMbeans();
        hikariConfig1.addDataSourceProperty("HikariPool-587", (java.lang.Object) boolean23);
        boolean boolean25 = hikariConfig1.isRegisterMbeans();
        long long26 = hikariConfig1.getMaxLifetime();
        boolean boolean27 = hikariConfig1.isRegisterMbeans();
        hikariConfig1.setUseInstrumentation(false);
        hikariConfig1.setAutoCommit(true);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertNotNull(properties17);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 60 + "'", int22 == 60);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + long26 + "' != '" + 1800000L + "'", long26 == 1800000L);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
    }

    @Test
    public void test03744() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03744");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        boolean boolean2 = hikariConfig1.isInitializationFailFast();
        hikariConfig1.setInitializationFailFast(true);
        javax.sql.DataSource dataSource5 = null;
        hikariConfig1.setDataSource(dataSource5);
        hikariConfig1.setAcquireRetryDelay((long) 'a');
        java.lang.String str9 = hikariConfig1.getConnectionCustomizerClassName();
        java.util.Properties properties10 = hikariConfig1.getDataSourceProperties();
        hikariConfig1.setAutoCommit(false);
        hikariConfig1.setInitializationFailFast(false);
        int int15 = hikariConfig1.getMaximumPoolSize();
        boolean boolean16 = hikariConfig1.isRegisterMbeans();
        java.lang.String str17 = hikariConfig1.getDataSourceClassName();
        java.util.Properties properties19 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig20 = new com.zaxxer.hikari.HikariConfig(properties19);
        boolean boolean21 = hikariConfig20.isInitializationFailFast();
        hikariConfig20.setInitializationFailFast(true);
        java.lang.String str24 = hikariConfig20.getConnectionTestQuery();
        boolean boolean25 = hikariConfig20.isRegisterMbeans();
        hikariConfig20.setDataSourceClassName("hi!");
        hikariConfig20.setConnectionInitSql("");
        java.lang.String str30 = hikariConfig20.getCatalog();
        boolean boolean31 = hikariConfig20.isInitializationFailFast();
        java.util.Properties properties33 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig34 = new com.zaxxer.hikari.HikariConfig(properties33);
        boolean boolean35 = hikariConfig34.isInitializationFailFast();
        hikariConfig34.setInitializationFailFast(true);
        java.lang.String str38 = hikariConfig34.getConnectionTestQuery();
        boolean boolean39 = hikariConfig34.isRegisterMbeans();
        hikariConfig34.setDataSourceClassName("hi!");
        hikariConfig34.setConnectionInitSql("");
        java.lang.String str44 = hikariConfig34.getCatalog();
        boolean boolean45 = hikariConfig34.isInitializationFailFast();
        hikariConfig20.addDataSourceProperty("HikariPool-184", (java.lang.Object) boolean45);
        long long47 = hikariConfig20.getAcquireRetryDelay();
        hikariConfig20.setCatalog("HikariPool-143");
        hikariConfig1.addDataSourceProperty("HikariPool-609", (java.lang.Object) "HikariPool-143");
        hikariConfig1.setConnectionTestQuery("HikariPool-442");
        long long53 = hikariConfig1.getMaxLifetime();
        hikariConfig1.setIdleTimeout(5000L);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNotNull(properties10);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 60 + "'", int15 == 60);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNull(str24);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNull(str30);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + true + "'", boolean31 == true);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertNull(str38);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertNull(str44);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + true + "'", boolean45 == true);
        org.junit.Assert.assertTrue("'" + long47 + "' != '" + 0L + "'", long47 == 0L);
        org.junit.Assert.assertTrue("'" + long53 + "' != '" + 1800000L + "'", long53 == 1800000L);
    }

    @Test
    public void test03745() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03745");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        boolean boolean2 = hikariConfig1.isInitializationFailFast();
        hikariConfig1.setInitializationFailFast(true);
        javax.sql.DataSource dataSource5 = null;
        hikariConfig1.setDataSource(dataSource5);
        hikariConfig1.setAcquireRetryDelay((long) 'a');
        java.lang.String str9 = hikariConfig1.getConnectionCustomizerClassName();
        hikariConfig1.setConnectionCustomizerClassName("hi!");
        java.lang.String str12 = hikariConfig1.getPoolName();
        hikariConfig1.setTransactionIsolation("HikariPool-414");
        java.util.Properties properties15 = hikariConfig1.getDataSourceProperties();
        hikariConfig1.setConnectionInitSql("HikariPool-19197");
        int int18 = hikariConfig1.getMinimumPoolSize();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(str9);
// flaky:         org.junit.Assert.assertEquals("'" + str12 + "' != '" + "HikariPool-31431" + "'", str12, "HikariPool-31431");
        org.junit.Assert.assertNotNull(properties15);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 10 + "'", int18 == 10);
    }

    @Test
    public void test03746() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03746");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        boolean boolean2 = hikariConfig1.isInitializationFailFast();
        hikariConfig1.setInitializationFailFast(true);
        int int5 = hikariConfig1.getAcquireRetries();
        long long6 = hikariConfig1.getMaxLifetime();
        hikariConfig1.setMaxLifetime((long) (short) 0);
        long long9 = hikariConfig1.getIdleTimeout();
        boolean boolean10 = hikariConfig1.isRegisterMbeans();
        long long11 = hikariConfig1.getAcquireRetryDelay();
        hikariConfig1.setLeakDetectionThreshold((long) 60);
        hikariConfig1.setUseInstrumentation(false);
        java.lang.String str16 = hikariConfig1.getConnectionTestQuery();
        java.lang.String str17 = hikariConfig1.getPoolName();
        hikariConfig1.setJdbc4ConnectionTest(false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 3 + "'", int5 == 3);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 1800000L + "'", long6 == 1800000L);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 600000L + "'", long9 == 600000L);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 0L + "'", long11 == 0L);
        org.junit.Assert.assertNull(str16);
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "HikariPool-31438" + "'", str17, "HikariPool-31438");
    }

    @Test
    public void test03747() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03747");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        boolean boolean2 = hikariConfig1.isInitializationFailFast();
        hikariConfig1.setInitializationFailFast(true);
        javax.sql.DataSource dataSource5 = null;
        hikariConfig1.setDataSource(dataSource5);
        java.lang.String str7 = hikariConfig1.getCatalog();
        hikariConfig1.setConnectionCustomizerClassName("hi!");
        hikariConfig1.setLeakDetectionThreshold(1L);
        hikariConfig1.setIdleTimeout((long) 100);
        java.util.Properties properties14 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig15 = new com.zaxxer.hikari.HikariConfig(properties14);
        boolean boolean16 = hikariConfig15.isInitializationFailFast();
        hikariConfig15.setInitializationFailFast(true);
        hikariConfig15.setAcquireRetryDelay(1L);
        hikariConfig15.setConnectionTimeout(600000L);
        hikariConfig15.setAcquireRetries(10);
        hikariConfig15.setAcquireRetries((int) 'a');
        hikariConfig15.setJdbc4ConnectionTest(true);
        hikariConfig15.setConnectionTestQuery("HikariPool-594");
        java.util.Properties properties31 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig32 = new com.zaxxer.hikari.HikariConfig(properties31);
        boolean boolean33 = hikariConfig32.isInitializationFailFast();
        hikariConfig32.setInitializationFailFast(true);
        javax.sql.DataSource dataSource36 = null;
        hikariConfig32.setDataSource(dataSource36);
        java.lang.String str38 = hikariConfig32.getCatalog();
        int int39 = hikariConfig32.getMinimumPoolSize();
        hikariConfig32.setTransactionIsolation("");
        java.util.Properties properties42 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig43 = new com.zaxxer.hikari.HikariConfig(properties42);
        boolean boolean44 = hikariConfig43.isInitializationFailFast();
        hikariConfig43.setInitializationFailFast(true);
        javax.sql.DataSource dataSource47 = null;
        hikariConfig43.setDataSource(dataSource47);
        hikariConfig43.setAcquireRetryDelay((long) 'a');
        java.lang.String str51 = hikariConfig43.getConnectionCustomizerClassName();
        java.util.Properties properties52 = hikariConfig43.getDataSourceProperties();
        hikariConfig43.setAutoCommit(false);
        int int55 = hikariConfig43.getMaximumPoolSize();
        java.util.Properties properties56 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig57 = new com.zaxxer.hikari.HikariConfig(properties56);
        boolean boolean58 = hikariConfig57.isInitializationFailFast();
        hikariConfig57.setInitializationFailFast(true);
        int int61 = hikariConfig57.getAcquireRetries();
        long long62 = hikariConfig57.getMaxLifetime();
        hikariConfig57.setMaxLifetime((long) (short) 0);
        long long65 = hikariConfig57.getIdleTimeout();
        boolean boolean66 = hikariConfig57.isRegisterMbeans();
        java.util.Properties properties67 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig68 = new com.zaxxer.hikari.HikariConfig(properties67);
        boolean boolean69 = hikariConfig68.isInitializationFailFast();
        hikariConfig68.setLeakDetectionThreshold((long) '4');
        java.lang.String str72 = hikariConfig68.getConnectionCustomizerClassName();
        java.util.Properties properties73 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig74 = new com.zaxxer.hikari.HikariConfig(properties73);
        boolean boolean75 = hikariConfig74.isInitializationFailFast();
        hikariConfig74.setInitializationFailFast(true);
        javax.sql.DataSource dataSource78 = null;
        hikariConfig74.setDataSource(dataSource78);
        hikariConfig74.setAcquireRetryDelay((long) 'a');
        java.lang.String str82 = hikariConfig74.getConnectionCustomizerClassName();
        java.util.Properties properties83 = hikariConfig74.getDataSourceProperties();
        java.util.Properties properties84 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig85 = new com.zaxxer.hikari.HikariConfig(properties84);
        java.util.Properties properties86 = hikariConfig85.getDataSourceProperties();
        hikariConfig74.setDataSourceProperties(properties86);
        hikariConfig68.setDataSourceProperties(properties86);
        hikariConfig57.setDataSourceProperties(properties86);
        hikariConfig43.setDataSourceProperties(properties86);
        hikariConfig32.setDataSourceProperties(properties86);
        hikariConfig15.setDataSourceProperties(properties86);
        hikariConfig1.setDataSourceProperties(properties86);
        java.lang.String str94 = hikariConfig1.getConnectionTestQuery();
        int int95 = hikariConfig1.getTransactionIsolation();
        hikariConfig1.setRegisterMbeans(false);
        boolean boolean98 = hikariConfig1.isRegisterMbeans();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertNull(str38);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 10 + "'", int39 == 10);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertNull(str51);
        org.junit.Assert.assertNotNull(properties52);
        org.junit.Assert.assertTrue("'" + int55 + "' != '" + 60 + "'", int55 == 60);
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + false + "'", boolean58 == false);
        org.junit.Assert.assertTrue("'" + int61 + "' != '" + 3 + "'", int61 == 3);
        org.junit.Assert.assertTrue("'" + long62 + "' != '" + 1800000L + "'", long62 == 1800000L);
        org.junit.Assert.assertTrue("'" + long65 + "' != '" + 600000L + "'", long65 == 600000L);
        org.junit.Assert.assertTrue("'" + boolean66 + "' != '" + false + "'", boolean66 == false);
        org.junit.Assert.assertTrue("'" + boolean69 + "' != '" + false + "'", boolean69 == false);
        org.junit.Assert.assertNull(str72);
        org.junit.Assert.assertTrue("'" + boolean75 + "' != '" + false + "'", boolean75 == false);
        org.junit.Assert.assertNull(str82);
        org.junit.Assert.assertNotNull(properties83);
        org.junit.Assert.assertNotNull(properties86);
        org.junit.Assert.assertNull(str94);
        org.junit.Assert.assertTrue("'" + int95 + "' != '" + (-1) + "'", int95 == (-1));
        org.junit.Assert.assertTrue("'" + boolean98 + "' != '" + false + "'", boolean98 == false);
    }

    @Test
    public void test03748() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03748");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        boolean boolean2 = hikariConfig1.isInitializationFailFast();
        boolean boolean3 = hikariConfig1.isJdbc4ConnectionTest();
        hikariConfig1.setRegisterMbeans(true);
        java.util.Properties properties6 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig7 = new com.zaxxer.hikari.HikariConfig(properties6);
        boolean boolean8 = hikariConfig7.isInitializationFailFast();
        hikariConfig7.setInitializationFailFast(true);
        java.lang.String str11 = hikariConfig7.getConnectionTestQuery();
        boolean boolean12 = hikariConfig7.isRegisterMbeans();
        hikariConfig7.setDataSourceClassName("hi!");
        hikariConfig7.setConnectionInitSql("");
        java.lang.String str17 = hikariConfig7.getCatalog();
        boolean boolean18 = hikariConfig7.isInitializationFailFast();
        java.lang.String str19 = hikariConfig7.getDataSourceClassName();
        java.util.Properties properties20 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig21 = new com.zaxxer.hikari.HikariConfig(properties20);
        boolean boolean22 = hikariConfig21.isInitializationFailFast();
        hikariConfig21.setInitializationFailFast(true);
        javax.sql.DataSource dataSource25 = null;
        hikariConfig21.setDataSource(dataSource25);
        hikariConfig21.setAcquireRetryDelay((long) 'a');
        java.lang.String str29 = hikariConfig21.getConnectionCustomizerClassName();
        java.util.Properties properties30 = hikariConfig21.getDataSourceProperties();
        com.zaxxer.hikari.HikariConfig hikariConfig31 = new com.zaxxer.hikari.HikariConfig(properties30);
        hikariConfig7.setDataSourceProperties(properties30);
        hikariConfig1.setDataSourceProperties(properties30);
        java.util.Properties properties34 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig35 = new com.zaxxer.hikari.HikariConfig(properties34);
        boolean boolean36 = hikariConfig35.isInitializationFailFast();
        hikariConfig35.setInitializationFailFast(true);
        int int39 = hikariConfig35.getAcquireRetries();
        boolean boolean40 = hikariConfig35.isRegisterMbeans();
        java.util.Properties properties41 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig42 = new com.zaxxer.hikari.HikariConfig(properties41);
        boolean boolean43 = hikariConfig42.isInitializationFailFast();
        hikariConfig42.setInitializationFailFast(true);
        javax.sql.DataSource dataSource46 = null;
        hikariConfig42.setDataSource(dataSource46);
        hikariConfig42.setAcquireRetryDelay((long) 'a');
        java.lang.String str50 = hikariConfig42.getConnectionCustomizerClassName();
        java.lang.String str51 = hikariConfig42.getConnectionInitSql();
        boolean boolean52 = hikariConfig42.isRegisterMbeans();
        java.lang.String str53 = hikariConfig42.getCatalog();
        java.util.Properties properties54 = hikariConfig42.getDataSourceProperties();
        hikariConfig35.setDataSourceProperties(properties54);
        com.zaxxer.hikari.HikariConfig hikariConfig56 = new com.zaxxer.hikari.HikariConfig(properties54);
        hikariConfig1.setDataSourceProperties(properties54);
        hikariConfig1.setConnectionInitSql("HikariPool-31120");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "hi!" + "'", str19, "hi!");
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNull(str29);
        org.junit.Assert.assertNotNull(properties30);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 3 + "'", int39 == 3);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertNull(str50);
        org.junit.Assert.assertNull(str51);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
        org.junit.Assert.assertNull(str53);
        org.junit.Assert.assertNotNull(properties54);
    }

    @Test
    public void test03749() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03749");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        boolean boolean2 = hikariConfig1.isInitializationFailFast();
        hikariConfig1.setAcquireRetryDelay((long) (byte) 10);
        long long5 = hikariConfig1.getConnectionTimeout();
        hikariConfig1.setMaximumPoolSize(10);
        hikariConfig1.setMaximumPoolSize((int) (byte) 1);
        long long10 = hikariConfig1.getAcquireRetryDelay();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 5000L + "'", long5 == 5000L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
    }

    @Test
    public void test03750() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03750");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        boolean boolean2 = hikariConfig1.isInitializationFailFast();
        hikariConfig1.setInitializationFailFast(true);
        javax.sql.DataSource dataSource5 = null;
        hikariConfig1.setDataSource(dataSource5);
        hikariConfig1.setAcquireRetryDelay((long) 'a');
        java.lang.String str9 = hikariConfig1.getConnectionCustomizerClassName();
        java.lang.String str10 = hikariConfig1.getConnectionInitSql();
        long long11 = hikariConfig1.getLeakDetectionThreshold();
        hikariConfig1.setConnectionTestQuery("HikariPool-393");
        hikariConfig1.setJdbc4ConnectionTest(false);
        hikariConfig1.setAcquireRetryDelay((long) (-1));
        hikariConfig1.setTransactionIsolation("HikariPool-2722");
        hikariConfig1.setUseInstrumentation(false);
        int int22 = hikariConfig1.getAcquireRetries();
        java.lang.String str23 = hikariConfig1.getConnectionInitSql();
        // The following exception was thrown during execution in test generation
        try {
            hikariConfig1.validate();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: one of either dataSource or dataSourceClassName must be specified");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 0L + "'", long11 == 0L);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 3 + "'", int22 == 3);
        org.junit.Assert.assertNull(str23);
    }

    @Test
    public void test03751() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03751");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        boolean boolean2 = hikariConfig1.isInitializationFailFast();
        hikariConfig1.setInitializationFailFast(true);
        javax.sql.DataSource dataSource5 = null;
        hikariConfig1.setDataSource(dataSource5);
        hikariConfig1.setAcquireRetryDelay((long) 'a');
        java.lang.String str9 = hikariConfig1.getCatalog();
        hikariConfig1.setConnectionTestQuery("HikariPool-1900");
        int int12 = hikariConfig1.getTransactionIsolation();
        boolean boolean13 = hikariConfig1.isInitializationFailFast();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
    }

    @Test
    public void test03752() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03752");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        java.util.Properties properties2 = hikariConfig1.getDataSourceProperties();
        int int3 = hikariConfig1.getTransactionIsolation();
        boolean boolean4 = hikariConfig1.isJdbc4ConnectionTest();
        hikariConfig1.setAutoCommit(false);
        hikariConfig1.setAcquireIncrement((int) (byte) 0);
        boolean boolean9 = hikariConfig1.isJdbc4ConnectionTest();
        org.junit.Assert.assertNotNull(properties2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void test03753() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03753");
        // The following exception was thrown during execution in test generation
        try {
            com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig("HikariPool-13335");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Property file HikariPool-13335 was not found.");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test03754() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03754");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        boolean boolean2 = hikariConfig1.isInitializationFailFast();
        hikariConfig1.setInitializationFailFast(true);
        hikariConfig1.setAcquireRetryDelay(1L);
        boolean boolean7 = hikariConfig1.isAutoCommit();
        java.util.Properties properties8 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig9 = new com.zaxxer.hikari.HikariConfig(properties8);
        java.util.Properties properties10 = hikariConfig9.getDataSourceProperties();
        hikariConfig1.setDataSourceProperties(properties10);
        javax.sql.DataSource dataSource12 = hikariConfig1.getDataSource();
        long long13 = hikariConfig1.getAcquireRetryDelay();
        boolean boolean14 = hikariConfig1.isInitializationFailFast();
        java.lang.String str15 = hikariConfig1.getConnectionTestQuery();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(properties10);
        org.junit.Assert.assertNull(dataSource12);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 0L + "'", long13 == 0L);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNull(str15);
    }

    @Test
    public void test03755() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03755");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        long long2 = hikariConfig1.getLeakDetectionThreshold();
        long long3 = hikariConfig1.getMaxLifetime();
        java.util.Properties properties4 = hikariConfig1.getDataSourceProperties();
        hikariConfig1.setMaxLifetime((long) 'a');
        hikariConfig1.setMinimumPoolSize(100);
        boolean boolean9 = hikariConfig1.isInitializationFailFast();
        hikariConfig1.setAcquireRetryDelay(600000L);
        java.lang.String str12 = hikariConfig1.getPoolName();
        int int13 = hikariConfig1.getMinimumPoolSize();
        hikariConfig1.setAcquireRetries(100);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 1800000L + "'", long3 == 1800000L);
        org.junit.Assert.assertNotNull(properties4);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
// flaky:         org.junit.Assert.assertEquals("'" + str12 + "' != '" + "HikariPool-31517" + "'", str12, "HikariPool-31517");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 100 + "'", int13 == 100);
    }

    @Test
    public void test03756() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03756");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        boolean boolean2 = hikariConfig1.isInitializationFailFast();
        hikariConfig1.setInitializationFailFast(true);
        java.lang.String str5 = hikariConfig1.getConnectionTestQuery();
        boolean boolean6 = hikariConfig1.isRegisterMbeans();
        hikariConfig1.setDataSourceClassName("hi!");
        hikariConfig1.setAcquireRetries(1);
        javax.sql.DataSource dataSource11 = hikariConfig1.getDataSource();
        boolean boolean12 = hikariConfig1.isJdbc4ConnectionTest();
        java.lang.String str13 = hikariConfig1.getDataSourceClassName();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(dataSource11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
    }

    @Test
    public void test03757() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03757");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        boolean boolean2 = hikariConfig1.isInitializationFailFast();
        hikariConfig1.setInitializationFailFast(true);
        int int5 = hikariConfig1.getAcquireRetries();
        long long6 = hikariConfig1.getMaxLifetime();
        hikariConfig1.setMaxLifetime((long) (short) 0);
        long long9 = hikariConfig1.getIdleTimeout();
        boolean boolean10 = hikariConfig1.isRegisterMbeans();
        java.util.Properties properties11 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig12 = new com.zaxxer.hikari.HikariConfig(properties11);
        boolean boolean13 = hikariConfig12.isInitializationFailFast();
        hikariConfig12.setLeakDetectionThreshold((long) '4');
        java.lang.String str16 = hikariConfig12.getConnectionCustomizerClassName();
        java.util.Properties properties17 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig18 = new com.zaxxer.hikari.HikariConfig(properties17);
        boolean boolean19 = hikariConfig18.isInitializationFailFast();
        hikariConfig18.setInitializationFailFast(true);
        javax.sql.DataSource dataSource22 = null;
        hikariConfig18.setDataSource(dataSource22);
        hikariConfig18.setAcquireRetryDelay((long) 'a');
        java.lang.String str26 = hikariConfig18.getConnectionCustomizerClassName();
        java.util.Properties properties27 = hikariConfig18.getDataSourceProperties();
        java.util.Properties properties28 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig29 = new com.zaxxer.hikari.HikariConfig(properties28);
        java.util.Properties properties30 = hikariConfig29.getDataSourceProperties();
        hikariConfig18.setDataSourceProperties(properties30);
        hikariConfig12.setDataSourceProperties(properties30);
        hikariConfig1.setDataSourceProperties(properties30);
        boolean boolean34 = hikariConfig1.isJdbc4ConnectionTest();
        boolean boolean35 = hikariConfig1.isRegisterMbeans();
        javax.sql.DataSource dataSource36 = null;
        hikariConfig1.setDataSource(dataSource36);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 3 + "'", int5 == 3);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 1800000L + "'", long6 == 1800000L);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 600000L + "'", long9 == 600000L);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNull(str26);
        org.junit.Assert.assertNotNull(properties27);
        org.junit.Assert.assertNotNull(properties30);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + true + "'", boolean34 == true);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
    }

    @Test
    public void test03758() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03758");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        boolean boolean2 = hikariConfig1.isInitializationFailFast();
        hikariConfig1.setInitializationFailFast(true);
        boolean boolean5 = hikariConfig1.isJdbc4ConnectionTest();
        int int6 = hikariConfig1.getMinimumPoolSize();
        hikariConfig1.setIdleTimeout((long) (byte) 0);
        boolean boolean9 = hikariConfig1.isRegisterMbeans();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test03759() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03759");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        boolean boolean2 = hikariConfig1.isInitializationFailFast();
        hikariConfig1.setInitializationFailFast(true);
        javax.sql.DataSource dataSource5 = null;
        hikariConfig1.setDataSource(dataSource5);
        java.lang.String str7 = hikariConfig1.getCatalog();
        int int8 = hikariConfig1.getTransactionIsolation();
        boolean boolean9 = hikariConfig1.isInitializationFailFast();
        long long10 = hikariConfig1.getLeakDetectionThreshold();
        boolean boolean11 = hikariConfig1.isAutoCommit();
        hikariConfig1.setConnectionInitSql("HikariPool-21941");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
    }

    @Test
    public void test03760() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03760");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        boolean boolean2 = hikariConfig1.isInitializationFailFast();
        hikariConfig1.setInitializationFailFast(true);
        javax.sql.DataSource dataSource5 = null;
        hikariConfig1.setDataSource(dataSource5);
        java.lang.String str7 = hikariConfig1.getCatalog();
        javax.sql.DataSource dataSource8 = null;
        hikariConfig1.setDataSource(dataSource8);
        int int10 = hikariConfig1.getMaximumPoolSize();
        hikariConfig1.setJdbc4ConnectionTest(true);
        java.util.Properties properties14 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig15 = new com.zaxxer.hikari.HikariConfig(properties14);
        boolean boolean16 = hikariConfig15.isInitializationFailFast();
        hikariConfig15.setInitializationFailFast(true);
        java.lang.String str19 = hikariConfig15.getConnectionTestQuery();
        boolean boolean20 = hikariConfig15.isRegisterMbeans();
        hikariConfig15.setDataSourceClassName("hi!");
        hikariConfig15.setInitializationFailFast(true);
        hikariConfig15.setMaxLifetime((long) (short) 1);
        javax.sql.DataSource dataSource27 = hikariConfig15.getDataSource();
        hikariConfig15.setAcquireRetryDelay((long) (byte) 0);
        hikariConfig15.setAcquireIncrement(35);
        hikariConfig15.validate();
        java.lang.String str33 = hikariConfig15.getPoolName();
        hikariConfig1.addDataSourceProperty("HikariPool-3811", (java.lang.Object) hikariConfig15);
        hikariConfig15.setAcquireIncrement((int) ' ');
        int int37 = hikariConfig15.getTransactionIsolation();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 60 + "'", int10 == 60);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNull(str19);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNull(dataSource27);
// flaky:         org.junit.Assert.assertEquals("'" + str33 + "' != '" + "HikariPool-31532" + "'", str33, "HikariPool-31532");
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + (-1) + "'", int37 == (-1));
    }

    @Test
    public void test03761() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03761");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        boolean boolean2 = hikariConfig1.isInitializationFailFast();
        hikariConfig1.setInitializationFailFast(true);
        int int5 = hikariConfig1.getAcquireRetries();
        long long6 = hikariConfig1.getMaxLifetime();
        int int7 = hikariConfig1.getAcquireIncrement();
        java.util.Properties properties8 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig9 = new com.zaxxer.hikari.HikariConfig(properties8);
        boolean boolean10 = hikariConfig9.isInitializationFailFast();
        hikariConfig9.setInitializationFailFast(true);
        javax.sql.DataSource dataSource13 = null;
        hikariConfig9.setDataSource(dataSource13);
        hikariConfig9.setAcquireRetryDelay((long) 'a');
        java.lang.String str17 = hikariConfig9.getConnectionCustomizerClassName();
        java.util.Properties properties18 = hikariConfig9.getDataSourceProperties();
        java.util.Properties properties19 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig20 = new com.zaxxer.hikari.HikariConfig(properties19);
        boolean boolean21 = hikariConfig20.isInitializationFailFast();
        hikariConfig20.setInitializationFailFast(true);
        javax.sql.DataSource dataSource24 = null;
        hikariConfig20.setDataSource(dataSource24);
        hikariConfig20.setAcquireRetryDelay((long) 'a');
        java.lang.String str28 = hikariConfig20.getConnectionCustomizerClassName();
        java.util.Properties properties29 = hikariConfig20.getDataSourceProperties();
        hikariConfig9.setDataSourceProperties(properties29);
        com.zaxxer.hikari.HikariConfig hikariConfig31 = new com.zaxxer.hikari.HikariConfig(properties29);
        hikariConfig31.setConnectionTimeout((long) (short) 0);
        long long34 = hikariConfig31.getIdleTimeout();
        java.util.Properties properties35 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig36 = new com.zaxxer.hikari.HikariConfig(properties35);
        boolean boolean37 = hikariConfig36.isInitializationFailFast();
        hikariConfig36.setInitializationFailFast(true);
        hikariConfig36.setAcquireRetryDelay(1L);
        java.util.Properties properties42 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig43 = new com.zaxxer.hikari.HikariConfig(properties42);
        boolean boolean44 = hikariConfig43.isInitializationFailFast();
        hikariConfig43.setTransactionIsolation("hi!");
        java.util.Properties properties47 = hikariConfig43.getDataSourceProperties();
        com.zaxxer.hikari.HikariConfig hikariConfig48 = new com.zaxxer.hikari.HikariConfig(properties47);
        hikariConfig36.setDataSourceProperties(properties47);
        hikariConfig31.setDataSourceProperties(properties47);
        hikariConfig1.setDataSourceProperties(properties47);
        com.zaxxer.hikari.HikariConfig hikariConfig52 = new com.zaxxer.hikari.HikariConfig(properties47);
        com.zaxxer.hikari.HikariConfig hikariConfig53 = new com.zaxxer.hikari.HikariConfig(properties47);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 3 + "'", int5 == 3);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 1800000L + "'", long6 == 1800000L);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertNotNull(properties18);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNull(str28);
        org.junit.Assert.assertNotNull(properties29);
        org.junit.Assert.assertTrue("'" + long34 + "' != '" + 600000L + "'", long34 == 600000L);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertNotNull(properties47);
    }

    @Test
    public void test03762() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03762");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        boolean boolean2 = hikariConfig1.isInitializationFailFast();
        hikariConfig1.setInitializationFailFast(true);
        boolean boolean5 = hikariConfig1.isJdbc4ConnectionTest();
        long long6 = hikariConfig1.getConnectionTimeout();
        hikariConfig1.setPoolName("hi!");
        hikariConfig1.setAcquireIncrement((int) (byte) 100);
        long long11 = hikariConfig1.getMaxLifetime();
        hikariConfig1.setPoolName("HikariPool-1009");
        long long14 = hikariConfig1.getConnectionTimeout();
        long long15 = hikariConfig1.getLeakDetectionThreshold();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 5000L + "'", long6 == 5000L);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 1800000L + "'", long11 == 1800000L);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 5000L + "'", long14 == 5000L);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 0L + "'", long15 == 0L);
    }

    @Test
    public void test03763() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03763");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        boolean boolean2 = hikariConfig1.isInitializationFailFast();
        hikariConfig1.setInitializationFailFast(true);
        javax.sql.DataSource dataSource5 = null;
        hikariConfig1.setDataSource(dataSource5);
        java.lang.String str7 = hikariConfig1.getCatalog();
        int int8 = hikariConfig1.getTransactionIsolation();
        int int9 = hikariConfig1.getMaximumPoolSize();
        hikariConfig1.setJdbc4ConnectionTest(true);
        int int12 = hikariConfig1.getAcquireIncrement();
        hikariConfig1.setAcquireRetries(35);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 60 + "'", int9 == 60);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
    }

    @Test
    public void test03764() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03764");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        boolean boolean2 = hikariConfig1.isInitializationFailFast();
        hikariConfig1.setInitializationFailFast(true);
        javax.sql.DataSource dataSource5 = null;
        hikariConfig1.setDataSource(dataSource5);
        hikariConfig1.setAcquireRetryDelay((long) 'a');
        java.lang.String str9 = hikariConfig1.getConnectionCustomizerClassName();
        java.util.Properties properties10 = hikariConfig1.getDataSourceProperties();
        hikariConfig1.setAutoCommit(false);
        hikariConfig1.setInitializationFailFast(false);
        int int15 = hikariConfig1.getMaximumPoolSize();
        boolean boolean16 = hikariConfig1.isInitializationFailFast();
        int int17 = hikariConfig1.getMinimumPoolSize();
        java.lang.String str18 = hikariConfig1.getConnectionTestQuery();
        int int19 = hikariConfig1.getMaximumPoolSize();
        java.lang.Class<?> wildcardClass20 = hikariConfig1.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNotNull(properties10);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 60 + "'", int15 == 60);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 10 + "'", int17 == 10);
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 60 + "'", int19 == 60);
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test03765() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03765");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        boolean boolean2 = hikariConfig1.isInitializationFailFast();
        hikariConfig1.setInitializationFailFast(true);
        javax.sql.DataSource dataSource5 = null;
        hikariConfig1.setDataSource(dataSource5);
        hikariConfig1.setAcquireRetryDelay((long) 'a');
        java.lang.String str9 = hikariConfig1.getConnectionCustomizerClassName();
        java.util.Properties properties10 = hikariConfig1.getDataSourceProperties();
        hikariConfig1.setAutoCommit(false);
        long long13 = hikariConfig1.getIdleTimeout();
        hikariConfig1.setJdbc4ConnectionTest(true);
        java.lang.String str16 = hikariConfig1.getConnectionCustomizerClassName();
        int int17 = hikariConfig1.getMinimumPoolSize();
        int int18 = hikariConfig1.getTransactionIsolation();
        hikariConfig1.setMaximumPoolSize(32);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNotNull(properties10);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 600000L + "'", long13 == 600000L);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 10 + "'", int17 == 10);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
    }

    @Test
    public void test03766() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03766");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        boolean boolean2 = hikariConfig1.isInitializationFailFast();
        int int3 = hikariConfig1.getAcquireIncrement();
        long long4 = hikariConfig1.getConnectionTimeout();
        hikariConfig1.setDataSourceClassName("HikariPool-477");
        long long7 = hikariConfig1.getAcquireRetryDelay();
        javax.sql.DataSource dataSource8 = hikariConfig1.getDataSource();
        hikariConfig1.setAutoCommit(true);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 5000L + "'", long4 == 5000L);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertNull(dataSource8);
    }

    @Test
    public void test03767() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03767");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        boolean boolean2 = hikariConfig1.isInitializationFailFast();
        hikariConfig1.setInitializationFailFast(true);
        javax.sql.DataSource dataSource5 = null;
        hikariConfig1.setDataSource(dataSource5);
        java.lang.String str7 = hikariConfig1.getCatalog();
        int int8 = hikariConfig1.getMinimumPoolSize();
        java.lang.String str9 = hikariConfig1.getCatalog();
        long long10 = hikariConfig1.getLeakDetectionThreshold();
        hikariConfig1.setConnectionTestQuery("HikariPool-143");
        hikariConfig1.setIdleTimeout((long) (byte) 10);
        java.lang.String str15 = hikariConfig1.getPoolName();
        hikariConfig1.setLeakDetectionThreshold((long) (short) 10);
        hikariConfig1.setMinimumPoolSize(100);
        hikariConfig1.setMinimumPoolSize(0);
        // The following exception was thrown during execution in test generation
        try {
            hikariConfig1.validate();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: one of either dataSource or dataSourceClassName must be specified");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 10 + "'", int8 == 10);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "HikariPool-31558" + "'", str15, "HikariPool-31558");
    }

    @Test
    public void test03768() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03768");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        boolean boolean2 = hikariConfig1.isInitializationFailFast();
        hikariConfig1.setInitializationFailFast(true);
        int int5 = hikariConfig1.getAcquireRetries();
        long long6 = hikariConfig1.getMaxLifetime();
        hikariConfig1.setMaxLifetime((long) (short) 0);
        long long9 = hikariConfig1.getIdleTimeout();
        java.lang.String str10 = hikariConfig1.getPoolName();
        java.lang.String str11 = hikariConfig1.getConnectionCustomizerClassName();
        hikariConfig1.setJdbc4ConnectionTest(true);
        int int14 = hikariConfig1.getAcquireRetries();
        hikariConfig1.setJdbc4ConnectionTest(true);
        hikariConfig1.setPoolName("HikariPool-25699");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 3 + "'", int5 == 3);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 1800000L + "'", long6 == 1800000L);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 600000L + "'", long9 == 600000L);
// flaky:         org.junit.Assert.assertEquals("'" + str10 + "' != '" + "HikariPool-31559" + "'", str10, "HikariPool-31559");
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 3 + "'", int14 == 3);
    }

    @Test
    public void test03769() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03769");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        boolean boolean2 = hikariConfig1.isInitializationFailFast();
        hikariConfig1.setInitializationFailFast(true);
        javax.sql.DataSource dataSource5 = null;
        hikariConfig1.setDataSource(dataSource5);
        hikariConfig1.setAcquireRetryDelay((long) 'a');
        java.lang.String str9 = hikariConfig1.getConnectionCustomizerClassName();
        java.util.Properties properties10 = hikariConfig1.getDataSourceProperties();
        hikariConfig1.setAutoCommit(false);
        hikariConfig1.setInitializationFailFast(false);
        int int15 = hikariConfig1.getMaximumPoolSize();
        boolean boolean16 = hikariConfig1.isInitializationFailFast();
        int int17 = hikariConfig1.getMinimumPoolSize();
        java.lang.String str18 = hikariConfig1.getConnectionTestQuery();
        hikariConfig1.setAutoCommit(false);
        java.lang.String str21 = hikariConfig1.getPoolName();
        java.lang.String str22 = hikariConfig1.getDataSourceClassName();
        hikariConfig1.setAcquireIncrement(0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNotNull(properties10);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 60 + "'", int15 == 60);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 10 + "'", int17 == 10);
        org.junit.Assert.assertNull(str18);
// flaky:         org.junit.Assert.assertEquals("'" + str21 + "' != '" + "HikariPool-31564" + "'", str21, "HikariPool-31564");
        org.junit.Assert.assertNull(str22);
    }

    @Test
    public void test03770() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03770");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        boolean boolean2 = hikariConfig1.isInitializationFailFast();
        hikariConfig1.setInitializationFailFast(true);
        javax.sql.DataSource dataSource5 = null;
        hikariConfig1.setDataSource(dataSource5);
        hikariConfig1.setAcquireRetryDelay((long) 'a');
        java.lang.String str9 = hikariConfig1.getConnectionCustomizerClassName();
        java.util.Properties properties10 = hikariConfig1.getDataSourceProperties();
        java.util.Properties properties11 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig12 = new com.zaxxer.hikari.HikariConfig(properties11);
        java.util.Properties properties13 = hikariConfig12.getDataSourceProperties();
        hikariConfig1.setDataSourceProperties(properties13);
        java.lang.String str15 = hikariConfig1.getCatalog();
        long long16 = hikariConfig1.getConnectionTimeout();
        java.util.Properties properties17 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig18 = new com.zaxxer.hikari.HikariConfig(properties17);
        boolean boolean19 = hikariConfig18.isInitializationFailFast();
        hikariConfig18.setInitializationFailFast(true);
        int int22 = hikariConfig18.getAcquireRetries();
        long long23 = hikariConfig18.getMaxLifetime();
        java.util.Properties properties24 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig25 = new com.zaxxer.hikari.HikariConfig(properties24);
        boolean boolean26 = hikariConfig25.isInitializationFailFast();
        javax.sql.DataSource dataSource27 = null;
        hikariConfig25.setDataSource(dataSource27);
        java.util.Properties properties29 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig30 = new com.zaxxer.hikari.HikariConfig(properties29);
        boolean boolean31 = hikariConfig30.isInitializationFailFast();
        hikariConfig30.setInitializationFailFast(true);
        boolean boolean34 = hikariConfig30.isJdbc4ConnectionTest();
        long long35 = hikariConfig30.getConnectionTimeout();
        hikariConfig30.setPoolName("hi!");
        hikariConfig30.setAcquireIncrement((int) (byte) 100);
        java.util.Properties properties40 = hikariConfig30.getDataSourceProperties();
        hikariConfig25.setDataSourceProperties(properties40);
        hikariConfig18.setDataSourceProperties(properties40);
        com.zaxxer.hikari.HikariConfig hikariConfig43 = new com.zaxxer.hikari.HikariConfig(properties40);
        hikariConfig1.setDataSourceProperties(properties40);
        hikariConfig1.setTransactionIsolation("");
        boolean boolean47 = hikariConfig1.isRegisterMbeans();
        hikariConfig1.setMaximumPoolSize(3);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNotNull(properties10);
        org.junit.Assert.assertNotNull(properties13);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 5000L + "'", long16 == 5000L);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 3 + "'", int22 == 3);
        org.junit.Assert.assertTrue("'" + long23 + "' != '" + 1800000L + "'", long23 == 1800000L);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + true + "'", boolean34 == true);
        org.junit.Assert.assertTrue("'" + long35 + "' != '" + 5000L + "'", long35 == 5000L);
        org.junit.Assert.assertNotNull(properties40);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
    }

    @Test
    public void test03771() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03771");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        boolean boolean2 = hikariConfig1.isInitializationFailFast();
        hikariConfig1.setInitializationFailFast(true);
        javax.sql.DataSource dataSource5 = null;
        hikariConfig1.setDataSource(dataSource5);
        hikariConfig1.setAcquireRetryDelay((long) 'a');
        java.lang.String str9 = hikariConfig1.getConnectionCustomizerClassName();
        java.util.Properties properties10 = hikariConfig1.getDataSourceProperties();
        hikariConfig1.setAutoCommit(false);
        int int13 = hikariConfig1.getMaximumPoolSize();
        java.util.Properties properties14 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig15 = new com.zaxxer.hikari.HikariConfig(properties14);
        boolean boolean16 = hikariConfig15.isInitializationFailFast();
        hikariConfig15.setInitializationFailFast(true);
        int int19 = hikariConfig15.getAcquireRetries();
        long long20 = hikariConfig15.getMaxLifetime();
        hikariConfig15.setMaxLifetime((long) (short) 0);
        long long23 = hikariConfig15.getIdleTimeout();
        boolean boolean24 = hikariConfig15.isRegisterMbeans();
        java.util.Properties properties25 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig26 = new com.zaxxer.hikari.HikariConfig(properties25);
        boolean boolean27 = hikariConfig26.isInitializationFailFast();
        hikariConfig26.setLeakDetectionThreshold((long) '4');
        java.lang.String str30 = hikariConfig26.getConnectionCustomizerClassName();
        java.util.Properties properties31 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig32 = new com.zaxxer.hikari.HikariConfig(properties31);
        boolean boolean33 = hikariConfig32.isInitializationFailFast();
        hikariConfig32.setInitializationFailFast(true);
        javax.sql.DataSource dataSource36 = null;
        hikariConfig32.setDataSource(dataSource36);
        hikariConfig32.setAcquireRetryDelay((long) 'a');
        java.lang.String str40 = hikariConfig32.getConnectionCustomizerClassName();
        java.util.Properties properties41 = hikariConfig32.getDataSourceProperties();
        java.util.Properties properties42 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig43 = new com.zaxxer.hikari.HikariConfig(properties42);
        java.util.Properties properties44 = hikariConfig43.getDataSourceProperties();
        hikariConfig32.setDataSourceProperties(properties44);
        hikariConfig26.setDataSourceProperties(properties44);
        hikariConfig15.setDataSourceProperties(properties44);
        hikariConfig1.setDataSourceProperties(properties44);
        hikariConfig1.setAcquireRetries(10);
        hikariConfig1.setConnectionInitSql("HikariPool-934");
        hikariConfig1.setMaxLifetime(0L);
        // The following exception was thrown during execution in test generation
        try {
            hikariConfig1.validate();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: one of either dataSource or dataSourceClassName must be specified");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNotNull(properties10);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 60 + "'", int13 == 60);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 3 + "'", int19 == 3);
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 1800000L + "'", long20 == 1800000L);
        org.junit.Assert.assertTrue("'" + long23 + "' != '" + 600000L + "'", long23 == 600000L);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNull(str30);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertNull(str40);
        org.junit.Assert.assertNotNull(properties41);
        org.junit.Assert.assertNotNull(properties44);
    }

    @Test
    public void test03772() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03772");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        boolean boolean2 = hikariConfig1.isInitializationFailFast();
        hikariConfig1.setInitializationFailFast(true);
        hikariConfig1.setAcquireRetryDelay(1L);
        hikariConfig1.setAcquireIncrement((int) 'a');
        long long9 = hikariConfig1.getMaxLifetime();
        int int10 = hikariConfig1.getMaximumPoolSize();
        java.util.Properties properties12 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig13 = new com.zaxxer.hikari.HikariConfig(properties12);
        boolean boolean14 = hikariConfig13.isInitializationFailFast();
        hikariConfig13.setInitializationFailFast(true);
        hikariConfig13.setAcquireRetryDelay(1L);
        hikariConfig13.setMaximumPoolSize((int) '#');
        hikariConfig13.setAcquireRetryDelay((long) 10);
        hikariConfig1.addDataSourceProperty("HikariPool-481", (java.lang.Object) 10);
        hikariConfig1.setConnectionInitSql("HikariPool-859");
        java.util.Properties properties27 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig28 = new com.zaxxer.hikari.HikariConfig(properties27);
        boolean boolean29 = hikariConfig28.isInitializationFailFast();
        hikariConfig28.setTransactionIsolation("hi!");
        java.util.Properties properties32 = hikariConfig28.getDataSourceProperties();
        long long33 = hikariConfig28.getConnectionTimeout();
        java.lang.String str34 = hikariConfig28.getConnectionCustomizerClassName();
        // The following exception was thrown during execution in test generation
        try {
            hikariConfig1.addDataSourceProperty("HikariPool-31564", (java.lang.Object) str34);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 1800000L + "'", long9 == 1800000L);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 60 + "'", int10 == 60);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertNotNull(properties32);
        org.junit.Assert.assertTrue("'" + long33 + "' != '" + 5000L + "'", long33 == 5000L);
        org.junit.Assert.assertNull(str34);
    }

    @Test
    public void test03773() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03773");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        boolean boolean2 = hikariConfig1.isInitializationFailFast();
        hikariConfig1.setInitializationFailFast(true);
        java.lang.String str5 = hikariConfig1.getConnectionTestQuery();
        hikariConfig1.setDataSourceClassName("");
        long long8 = hikariConfig1.getMaxLifetime();
        hikariConfig1.validate();
        hikariConfig1.setAcquireRetries((int) '4');
        hikariConfig1.setInitializationFailFast(false);
        hikariConfig1.setAcquireIncrement(35);
        hikariConfig1.validate();
        java.lang.String str17 = hikariConfig1.getPoolName();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 1800000L + "'", long8 == 1800000L);
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "HikariPool-31594" + "'", str17, "HikariPool-31594");
    }

    @Test
    public void test03774() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03774");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        boolean boolean2 = hikariConfig1.isInitializationFailFast();
        hikariConfig1.setInitializationFailFast(true);
        javax.sql.DataSource dataSource5 = null;
        hikariConfig1.setDataSource(dataSource5);
        java.lang.String str7 = hikariConfig1.getCatalog();
        int int8 = hikariConfig1.getMinimumPoolSize();
        java.lang.String str9 = hikariConfig1.getCatalog();
        long long10 = hikariConfig1.getLeakDetectionThreshold();
        hikariConfig1.setConnectionTestQuery("HikariPool-143");
        hikariConfig1.setIdleTimeout((long) (byte) 10);
        java.lang.String str15 = hikariConfig1.getPoolName();
        hikariConfig1.setMaxLifetime((long) (short) -1);
        hikariConfig1.setLeakDetectionThreshold((long) 60);
        int int20 = hikariConfig1.getTransactionIsolation();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 10 + "'", int8 == 10);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "HikariPool-31595" + "'", str15, "HikariPool-31595");
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
    }

    @Test
    public void test03775() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03775");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        boolean boolean2 = hikariConfig1.isInitializationFailFast();
        hikariConfig1.setLeakDetectionThreshold((long) '4');
        java.lang.String str5 = hikariConfig1.getConnectionCustomizerClassName();
        java.util.Properties properties6 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig7 = new com.zaxxer.hikari.HikariConfig(properties6);
        boolean boolean8 = hikariConfig7.isInitializationFailFast();
        hikariConfig7.setInitializationFailFast(true);
        javax.sql.DataSource dataSource11 = null;
        hikariConfig7.setDataSource(dataSource11);
        hikariConfig7.setAcquireRetryDelay((long) 'a');
        java.lang.String str15 = hikariConfig7.getConnectionCustomizerClassName();
        java.util.Properties properties16 = hikariConfig7.getDataSourceProperties();
        java.util.Properties properties17 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig18 = new com.zaxxer.hikari.HikariConfig(properties17);
        java.util.Properties properties19 = hikariConfig18.getDataSourceProperties();
        hikariConfig7.setDataSourceProperties(properties19);
        hikariConfig1.setDataSourceProperties(properties19);
        java.lang.String str22 = hikariConfig1.getDataSourceClassName();
        hikariConfig1.setInitializationFailFast(true);
        hikariConfig1.setDataSourceClassName("HikariPool-481");
        hikariConfig1.setInitializationFailFast(true);
        long long29 = hikariConfig1.getConnectionTimeout();
        hikariConfig1.setAcquireIncrement(3);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertNotNull(properties16);
        org.junit.Assert.assertNotNull(properties19);
        org.junit.Assert.assertNull(str22);
        org.junit.Assert.assertTrue("'" + long29 + "' != '" + 5000L + "'", long29 == 5000L);
    }

    @Test
    public void test03776() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03776");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        boolean boolean2 = hikariConfig1.isInitializationFailFast();
        hikariConfig1.setInitializationFailFast(true);
        javax.sql.DataSource dataSource5 = null;
        hikariConfig1.setDataSource(dataSource5);
        hikariConfig1.setAcquireRetryDelay((long) 'a');
        java.lang.String str9 = hikariConfig1.getConnectionCustomizerClassName();
        java.util.Properties properties10 = hikariConfig1.getDataSourceProperties();
        java.util.Properties properties11 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig12 = new com.zaxxer.hikari.HikariConfig(properties11);
        java.util.Properties properties13 = hikariConfig12.getDataSourceProperties();
        hikariConfig1.setDataSourceProperties(properties13);
        boolean boolean15 = hikariConfig1.isAutoCommit();
        boolean boolean16 = hikariConfig1.isRegisterMbeans();
        long long17 = hikariConfig1.getConnectionTimeout();
        java.lang.String str18 = hikariConfig1.getConnectionInitSql();
        boolean boolean19 = hikariConfig1.isAutoCommit();
        int int20 = hikariConfig1.getMinimumPoolSize();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNotNull(properties10);
        org.junit.Assert.assertNotNull(properties13);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 5000L + "'", long17 == 5000L);
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 10 + "'", int20 == 10);
    }

    @Test
    public void test03777() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03777");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        boolean boolean2 = hikariConfig1.isInitializationFailFast();
        hikariConfig1.setInitializationFailFast(true);
        javax.sql.DataSource dataSource5 = null;
        hikariConfig1.setDataSource(dataSource5);
        java.lang.String str7 = hikariConfig1.getCatalog();
        int int8 = hikariConfig1.getMinimumPoolSize();
        boolean boolean9 = hikariConfig1.isJdbc4ConnectionTest();
        java.lang.String str10 = hikariConfig1.getPoolName();
        int int11 = hikariConfig1.getAcquireRetries();
        long long12 = hikariConfig1.getLeakDetectionThreshold();
        hikariConfig1.setMinimumPoolSize((int) (short) 100);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 10 + "'", int8 == 10);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
// flaky:         org.junit.Assert.assertEquals("'" + str10 + "' != '" + "HikariPool-31602" + "'", str10, "HikariPool-31602");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 3 + "'", int11 == 3);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
    }

    @Test
    public void test03778() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03778");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        boolean boolean2 = hikariConfig1.isInitializationFailFast();
        hikariConfig1.setInitializationFailFast(true);
        javax.sql.DataSource dataSource5 = null;
        hikariConfig1.setDataSource(dataSource5);
        hikariConfig1.setAcquireRetryDelay((long) 'a');
        java.lang.String str9 = hikariConfig1.getConnectionCustomizerClassName();
        java.util.Properties properties10 = hikariConfig1.getDataSourceProperties();
        java.util.Properties properties11 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig12 = new com.zaxxer.hikari.HikariConfig(properties11);
        java.util.Properties properties13 = hikariConfig12.getDataSourceProperties();
        hikariConfig1.setDataSourceProperties(properties13);
        int int15 = hikariConfig1.getMinimumPoolSize();
        java.lang.String str16 = hikariConfig1.getDataSourceClassName();
        hikariConfig1.setConnectionCustomizerClassName("");
        javax.sql.DataSource dataSource19 = hikariConfig1.getDataSource();
        hikariConfig1.setInitializationFailFast(false);
        hikariConfig1.setConnectionInitSql("HikariPool-2872");
        hikariConfig1.setIdleTimeout((long) 100);
        java.lang.String str26 = hikariConfig1.getDataSourceClassName();
        hikariConfig1.setAcquireRetries(0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNotNull(properties10);
        org.junit.Assert.assertNotNull(properties13);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 10 + "'", int15 == 10);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertNull(dataSource19);
        org.junit.Assert.assertNull(str26);
    }

    @Test
    public void test03779() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03779");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        hikariConfig1.setConnectionInitSql("");
        long long4 = hikariConfig1.getIdleTimeout();
        java.util.Properties properties5 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig6 = new com.zaxxer.hikari.HikariConfig(properties5);
        java.util.Properties properties7 = hikariConfig6.getDataSourceProperties();
        hikariConfig1.setDataSourceProperties(properties7);
        com.zaxxer.hikari.HikariConfig hikariConfig9 = new com.zaxxer.hikari.HikariConfig(properties7);
        long long10 = hikariConfig9.getAcquireRetryDelay();
        hikariConfig9.setInitializationFailFast(true);
        java.lang.String str13 = hikariConfig9.getDataSourceClassName();
        java.util.Properties properties15 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig16 = new com.zaxxer.hikari.HikariConfig(properties15);
        boolean boolean17 = hikariConfig16.isInitializationFailFast();
        hikariConfig16.setInitializationFailFast(true);
        javax.sql.DataSource dataSource20 = null;
        hikariConfig16.setDataSource(dataSource20);
        hikariConfig16.setAcquireRetryDelay((long) 'a');
        java.lang.String str24 = hikariConfig16.getConnectionCustomizerClassName();
        java.util.Properties properties25 = hikariConfig16.getDataSourceProperties();
        hikariConfig16.setAutoCommit(false);
        hikariConfig16.setInitializationFailFast(false);
        int int30 = hikariConfig16.getMaximumPoolSize();
        boolean boolean31 = hikariConfig16.isRegisterMbeans();
        hikariConfig16.setJdbc4ConnectionTest(true);
        java.lang.String str34 = hikariConfig16.getConnectionTestQuery();
        java.lang.String str35 = hikariConfig16.getPoolName();
        hikariConfig9.addDataSourceProperty("HikariPool-1244", (java.lang.Object) str35);
        int int37 = hikariConfig9.getAcquireRetries();
        hikariConfig9.setTransactionIsolation("HikariPool-3424");
        hikariConfig9.setCatalog("HikariPool-1244");
        hikariConfig9.setAcquireRetries(0);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 600000L + "'", long4 == 600000L);
        org.junit.Assert.assertNotNull(properties7);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNull(str24);
        org.junit.Assert.assertNotNull(properties25);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 60 + "'", int30 == 60);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertNull(str34);
// flaky:         org.junit.Assert.assertEquals("'" + str35 + "' != '" + "HikariPool-31608" + "'", str35, "HikariPool-31608");
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 3 + "'", int37 == 3);
    }

    @Test
    public void test03780() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03780");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        boolean boolean2 = hikariConfig1.isInitializationFailFast();
        hikariConfig1.setInitializationFailFast(true);
        java.lang.String str5 = hikariConfig1.getConnectionTestQuery();
        boolean boolean6 = hikariConfig1.isRegisterMbeans();
        hikariConfig1.setDataSourceClassName("hi!");
        hikariConfig1.setAcquireRetries(1);
        javax.sql.DataSource dataSource11 = hikariConfig1.getDataSource();
        hikariConfig1.setAutoCommit(false);
        hikariConfig1.setMinimumPoolSize(0);
        java.lang.String str16 = hikariConfig1.getConnectionCustomizerClassName();
        javax.sql.DataSource dataSource17 = hikariConfig1.getDataSource();
        long long18 = hikariConfig1.getMaxLifetime();
        hikariConfig1.setPoolName("HikariPool-16814");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(dataSource11);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertNull(dataSource17);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 1800000L + "'", long18 == 1800000L);
    }

    @Test
    public void test03781() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03781");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        boolean boolean2 = hikariConfig1.isInitializationFailFast();
        hikariConfig1.setInitializationFailFast(true);
        hikariConfig1.setAcquireRetryDelay(1L);
        hikariConfig1.setAcquireIncrement((int) (byte) 100);
        hikariConfig1.setConnectionTestQuery("HikariPool-143");
        hikariConfig1.setLeakDetectionThreshold((long) 1);
        hikariConfig1.setRegisterMbeans(false);
        hikariConfig1.setMaximumPoolSize(52);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test03782() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03782");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        boolean boolean2 = hikariConfig1.isInitializationFailFast();
        hikariConfig1.setInitializationFailFast(true);
        javax.sql.DataSource dataSource5 = null;
        hikariConfig1.setDataSource(dataSource5);
        hikariConfig1.setAcquireRetryDelay((long) 'a');
        java.lang.String str9 = hikariConfig1.getConnectionCustomizerClassName();
        java.util.Properties properties10 = hikariConfig1.getDataSourceProperties();
        java.util.Properties properties11 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig12 = new com.zaxxer.hikari.HikariConfig(properties11);
        java.util.Properties properties13 = hikariConfig12.getDataSourceProperties();
        hikariConfig1.setDataSourceProperties(properties13);
        hikariConfig1.setCatalog("hi!");
        boolean boolean17 = hikariConfig1.isJdbc4ConnectionTest();
        long long18 = hikariConfig1.getConnectionTimeout();
        java.lang.String str19 = hikariConfig1.getCatalog();
        hikariConfig1.setConnectionTestQuery("HikariPool-21450");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNotNull(properties10);
        org.junit.Assert.assertNotNull(properties13);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 5000L + "'", long18 == 5000L);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "hi!" + "'", str19, "hi!");
    }

    @Test
    public void test03783() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03783");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        boolean boolean2 = hikariConfig1.isInitializationFailFast();
        hikariConfig1.setInitializationFailFast(true);
        boolean boolean5 = hikariConfig1.isJdbc4ConnectionTest();
        long long6 = hikariConfig1.getConnectionTimeout();
        hikariConfig1.setPoolName("hi!");
        hikariConfig1.setAcquireIncrement((int) (byte) 100);
        long long11 = hikariConfig1.getMaxLifetime();
        java.lang.Class<?> wildcardClass12 = hikariConfig1.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 5000L + "'", long6 == 5000L);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 1800000L + "'", long11 == 1800000L);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test03784() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03784");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        boolean boolean2 = hikariConfig1.isInitializationFailFast();
        hikariConfig1.setInitializationFailFast(true);
        hikariConfig1.setAcquireRetryDelay(1L);
        hikariConfig1.setConnectionTimeout(600000L);
        hikariConfig1.setAcquireRetries(10);
        boolean boolean11 = hikariConfig1.isRegisterMbeans();
        boolean boolean12 = hikariConfig1.isJdbc4ConnectionTest();
        hikariConfig1.setMaximumPoolSize(60);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
    }

    @Test
    public void test03785() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03785");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        boolean boolean2 = hikariConfig1.isInitializationFailFast();
        hikariConfig1.setInitializationFailFast(true);
        hikariConfig1.setAcquireRetryDelay(1L);
        hikariConfig1.setAcquireIncrement((int) (byte) 100);
        int int9 = hikariConfig1.getTransactionIsolation();
        int int10 = hikariConfig1.getTransactionIsolation();
        hikariConfig1.setIdleTimeout((long) (byte) 100);
        hikariConfig1.setConnectionInitSql("HikariPool-1199");
        long long15 = hikariConfig1.getIdleTimeout();
        hikariConfig1.setConnectionTestQuery("HikariPool-6499");
        long long18 = hikariConfig1.getMaxLifetime();
        boolean boolean19 = hikariConfig1.isAutoCommit();
        hikariConfig1.setConnectionCustomizerClassName("HikariPool-8166");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 100L + "'", long15 == 100L);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 1800000L + "'", long18 == 1800000L);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
    }

    @Test
    public void test03786() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03786");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        boolean boolean2 = hikariConfig1.isInitializationFailFast();
        boolean boolean3 = hikariConfig1.isJdbc4ConnectionTest();
        hikariConfig1.setDataSourceClassName("hi!");
        java.util.Properties properties7 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig8 = new com.zaxxer.hikari.HikariConfig(properties7);
        boolean boolean9 = hikariConfig8.isInitializationFailFast();
        hikariConfig8.setInitializationFailFast(true);
        javax.sql.DataSource dataSource12 = null;
        hikariConfig8.setDataSource(dataSource12);
        hikariConfig8.setAcquireRetryDelay((long) 'a');
        java.lang.String str16 = hikariConfig8.getConnectionCustomizerClassName();
        java.util.Properties properties17 = hikariConfig8.getDataSourceProperties();
        hikariConfig8.setAutoCommit(false);
        hikariConfig8.setInitializationFailFast(false);
        int int22 = hikariConfig8.getMaximumPoolSize();
        boolean boolean23 = hikariConfig8.isRegisterMbeans();
        hikariConfig1.addDataSourceProperty("HikariPool-587", (java.lang.Object) boolean23);
        boolean boolean25 = hikariConfig1.isRegisterMbeans();
        long long26 = hikariConfig1.getMaxLifetime();
        boolean boolean27 = hikariConfig1.isRegisterMbeans();
        hikariConfig1.setLeakDetectionThreshold((long) 10);
        hikariConfig1.setConnectionInitSql("HikariPool-18328");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertNotNull(properties17);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 60 + "'", int22 == 60);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + long26 + "' != '" + 1800000L + "'", long26 == 1800000L);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
    }

    @Test
    public void test03787() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03787");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        boolean boolean2 = hikariConfig1.isInitializationFailFast();
        hikariConfig1.setInitializationFailFast(true);
        java.lang.String str5 = hikariConfig1.getConnectionTestQuery();
        hikariConfig1.setDataSourceClassName("");
        long long8 = hikariConfig1.getMaxLifetime();
        javax.sql.DataSource dataSource9 = hikariConfig1.getDataSource();
        hikariConfig1.validate();
        hikariConfig1.setAcquireRetryDelay(0L);
        hikariConfig1.setMaximumPoolSize(100);
        hikariConfig1.setRegisterMbeans(true);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 1800000L + "'", long8 == 1800000L);
        org.junit.Assert.assertNull(dataSource9);
    }

    @Test
    public void test03788() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03788");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        boolean boolean2 = hikariConfig1.isInitializationFailFast();
        hikariConfig1.setInitializationFailFast(true);
        boolean boolean5 = hikariConfig1.isJdbc4ConnectionTest();
        java.lang.String str6 = hikariConfig1.getDataSourceClassName();
        boolean boolean7 = hikariConfig1.isJdbc4ConnectionTest();
        long long8 = hikariConfig1.getAcquireRetryDelay();
        long long9 = hikariConfig1.getLeakDetectionThreshold();
        hikariConfig1.setMaximumPoolSize((int) (byte) 0);
        hikariConfig1.setConnectionInitSql("HikariPool-10404");
        long long14 = hikariConfig1.getConnectionTimeout();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 5000L + "'", long14 == 5000L);
    }

    @Test
    public void test03789() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03789");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        boolean boolean1 = hikariConfig0.isRegisterMbeans();
        java.util.Properties properties2 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig3 = new com.zaxxer.hikari.HikariConfig(properties2);
        boolean boolean4 = hikariConfig3.isInitializationFailFast();
        hikariConfig3.setInitializationFailFast(true);
        hikariConfig3.setAcquireRetryDelay(1L);
        boolean boolean9 = hikariConfig3.isAutoCommit();
        java.util.Properties properties10 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig11 = new com.zaxxer.hikari.HikariConfig(properties10);
        java.util.Properties properties12 = hikariConfig11.getDataSourceProperties();
        hikariConfig3.setDataSourceProperties(properties12);
        hikariConfig0.setDataSourceProperties(properties12);
        boolean boolean15 = hikariConfig0.isRegisterMbeans();
        java.lang.String str16 = hikariConfig0.getConnectionTestQuery();
        hikariConfig0.setInitializationFailFast(false);
        boolean boolean19 = hikariConfig0.isAutoCommit();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(properties12);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
    }

    @Test
    public void test03790() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03790");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        boolean boolean2 = hikariConfig1.isInitializationFailFast();
        hikariConfig1.setInitializationFailFast(true);
        javax.sql.DataSource dataSource5 = null;
        hikariConfig1.setDataSource(dataSource5);
        java.lang.String str7 = hikariConfig1.getCatalog();
        int int8 = hikariConfig1.getMinimumPoolSize();
        boolean boolean9 = hikariConfig1.isJdbc4ConnectionTest();
        java.lang.String str10 = hikariConfig1.getPoolName();
        java.lang.String str11 = hikariConfig1.getPoolName();
        java.lang.String str12 = hikariConfig1.getConnectionTestQuery();
        java.lang.String str13 = hikariConfig1.getCatalog();
        java.lang.String str14 = hikariConfig1.getPoolName();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 10 + "'", int8 == 10);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
// flaky:         org.junit.Assert.assertEquals("'" + str10 + "' != '" + "HikariPool-31634" + "'", str10, "HikariPool-31634");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "HikariPool-31634" + "'", str11, "HikariPool-31634");
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNull(str13);
// flaky:         org.junit.Assert.assertEquals("'" + str14 + "' != '" + "HikariPool-31634" + "'", str14, "HikariPool-31634");
    }

    @Test
    public void test03791() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03791");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        boolean boolean2 = hikariConfig1.isInitializationFailFast();
        hikariConfig1.setInitializationFailFast(true);
        javax.sql.DataSource dataSource5 = null;
        hikariConfig1.setDataSource(dataSource5);
        hikariConfig1.setAcquireRetryDelay((long) 'a');
        java.lang.String str9 = hikariConfig1.getConnectionCustomizerClassName();
        java.lang.String str10 = hikariConfig1.getConnectionInitSql();
        long long11 = hikariConfig1.getLeakDetectionThreshold();
        hikariConfig1.setRegisterMbeans(false);
        hikariConfig1.setMaxLifetime((long) (short) 0);
        javax.sql.DataSource dataSource16 = hikariConfig1.getDataSource();
        java.lang.String str17 = hikariConfig1.getCatalog();
        hikariConfig1.setCatalog("HikariPool-6729");
        hikariConfig1.setInitializationFailFast(true);
        hikariConfig1.setMinimumPoolSize(0);
        java.lang.String str24 = hikariConfig1.getDataSourceClassName();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 0L + "'", long11 == 0L);
        org.junit.Assert.assertNull(dataSource16);
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertNull(str24);
    }

    @Test
    public void test03792() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03792");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        boolean boolean2 = hikariConfig1.isInitializationFailFast();
        hikariConfig1.setInitializationFailFast(true);
        javax.sql.DataSource dataSource5 = null;
        hikariConfig1.setDataSource(dataSource5);
        java.lang.String str7 = hikariConfig1.getCatalog();
        int int8 = hikariConfig1.getMinimumPoolSize();
        java.lang.String str9 = hikariConfig1.getCatalog();
        long long10 = hikariConfig1.getLeakDetectionThreshold();
        long long11 = hikariConfig1.getConnectionTimeout();
        javax.sql.DataSource dataSource12 = hikariConfig1.getDataSource();
        hikariConfig1.setConnectionInitSql("HikariPool-2734");
        java.lang.String str15 = hikariConfig1.getConnectionTestQuery();
        hikariConfig1.setAutoCommit(false);
        // The following exception was thrown during execution in test generation
        try {
            hikariConfig1.validate();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: one of either dataSource or dataSourceClassName must be specified");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 10 + "'", int8 == 10);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 5000L + "'", long11 == 5000L);
        org.junit.Assert.assertNull(dataSource12);
        org.junit.Assert.assertNull(str15);
    }

    @Test
    public void test03793() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03793");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        boolean boolean2 = hikariConfig1.isInitializationFailFast();
        hikariConfig1.setInitializationFailFast(true);
        javax.sql.DataSource dataSource5 = null;
        hikariConfig1.setDataSource(dataSource5);
        hikariConfig1.setAcquireRetryDelay((long) 'a');
        java.lang.String str9 = hikariConfig1.getConnectionCustomizerClassName();
        java.lang.String str10 = hikariConfig1.getConnectionInitSql();
        hikariConfig1.setDataSourceClassName("");
        java.util.Properties properties13 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig14 = new com.zaxxer.hikari.HikariConfig(properties13);
        boolean boolean15 = hikariConfig14.isInitializationFailFast();
        hikariConfig14.setInitializationFailFast(true);
        javax.sql.DataSource dataSource18 = null;
        hikariConfig14.setDataSource(dataSource18);
        hikariConfig14.setAcquireRetryDelay((long) 'a');
        java.lang.String str22 = hikariConfig14.getConnectionCustomizerClassName();
        java.util.Properties properties23 = hikariConfig14.getDataSourceProperties();
        java.util.Properties properties24 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig25 = new com.zaxxer.hikari.HikariConfig(properties24);
        java.util.Properties properties26 = hikariConfig25.getDataSourceProperties();
        hikariConfig14.setDataSourceProperties(properties26);
        hikariConfig1.setDataSourceProperties(properties26);
        long long29 = hikariConfig1.getLeakDetectionThreshold();
        java.util.Properties properties30 = hikariConfig1.getDataSourceProperties();
        java.lang.String str31 = hikariConfig1.getConnectionCustomizerClassName();
        long long32 = hikariConfig1.getIdleTimeout();
        hikariConfig1.setConnectionCustomizerClassName("");
        javax.sql.DataSource dataSource35 = null;
        hikariConfig1.setDataSource(dataSource35);
        hikariConfig1.setConnectionTestQuery("HikariPool-2473");
        hikariConfig1.setPoolName("HikariPool-13587");
        java.util.Properties properties41 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig42 = new com.zaxxer.hikari.HikariConfig(properties41);
        boolean boolean43 = hikariConfig42.isInitializationFailFast();
        boolean boolean44 = hikariConfig42.isJdbc4ConnectionTest();
        long long45 = hikariConfig42.getConnectionTimeout();
        int int46 = hikariConfig42.getTransactionIsolation();
        hikariConfig42.setLeakDetectionThreshold(600000L);
        hikariConfig42.setLeakDetectionThreshold(1L);
        hikariConfig42.setIdleTimeout((long) 100);
        java.util.Properties properties53 = hikariConfig42.getDataSourceProperties();
        hikariConfig1.setDataSourceProperties(properties53);
        hikariConfig1.setCatalog("HikariPool-11555");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNull(str22);
        org.junit.Assert.assertNotNull(properties23);
        org.junit.Assert.assertNotNull(properties26);
        org.junit.Assert.assertTrue("'" + long29 + "' != '" + 0L + "'", long29 == 0L);
        org.junit.Assert.assertNotNull(properties30);
        org.junit.Assert.assertNull(str31);
        org.junit.Assert.assertTrue("'" + long32 + "' != '" + 600000L + "'", long32 == 600000L);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + true + "'", boolean44 == true);
        org.junit.Assert.assertTrue("'" + long45 + "' != '" + 5000L + "'", long45 == 5000L);
        org.junit.Assert.assertTrue("'" + int46 + "' != '" + (-1) + "'", int46 == (-1));
        org.junit.Assert.assertNotNull(properties53);
    }

    @Test
    public void test03794() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03794");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        java.util.Properties properties2 = hikariConfig1.getDataSourceProperties();
        int int3 = hikariConfig1.getTransactionIsolation();
        long long4 = hikariConfig1.getIdleTimeout();
        hikariConfig1.setMaximumPoolSize((int) (byte) 100);
        java.util.Properties properties7 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig8 = new com.zaxxer.hikari.HikariConfig(properties7);
        boolean boolean9 = hikariConfig8.isInitializationFailFast();
        hikariConfig8.setLeakDetectionThreshold((long) '4');
        java.lang.String str12 = hikariConfig8.getConnectionCustomizerClassName();
        java.util.Properties properties13 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig14 = new com.zaxxer.hikari.HikariConfig(properties13);
        boolean boolean15 = hikariConfig14.isInitializationFailFast();
        hikariConfig14.setInitializationFailFast(true);
        javax.sql.DataSource dataSource18 = null;
        hikariConfig14.setDataSource(dataSource18);
        hikariConfig14.setAcquireRetryDelay((long) 'a');
        java.lang.String str22 = hikariConfig14.getConnectionCustomizerClassName();
        java.util.Properties properties23 = hikariConfig14.getDataSourceProperties();
        java.util.Properties properties24 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig25 = new com.zaxxer.hikari.HikariConfig(properties24);
        java.util.Properties properties26 = hikariConfig25.getDataSourceProperties();
        hikariConfig14.setDataSourceProperties(properties26);
        hikariConfig8.setDataSourceProperties(properties26);
        hikariConfig1.setDataSourceProperties(properties26);
        com.zaxxer.hikari.HikariConfig hikariConfig30 = new com.zaxxer.hikari.HikariConfig(properties26);
        com.zaxxer.hikari.HikariConfig hikariConfig31 = new com.zaxxer.hikari.HikariConfig(properties26);
        com.zaxxer.hikari.HikariConfig hikariConfig32 = new com.zaxxer.hikari.HikariConfig(properties26);
        java.lang.String str33 = hikariConfig32.getConnectionInitSql();
        org.junit.Assert.assertNotNull(properties2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 600000L + "'", long4 == 600000L);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNull(str22);
        org.junit.Assert.assertNotNull(properties23);
        org.junit.Assert.assertNotNull(properties26);
        org.junit.Assert.assertNull(str33);
    }

    @Test
    public void test03795() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03795");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        boolean boolean2 = hikariConfig1.isInitializationFailFast();
        hikariConfig1.setInitializationFailFast(true);
        javax.sql.DataSource dataSource5 = null;
        hikariConfig1.setDataSource(dataSource5);
        hikariConfig1.setAcquireRetryDelay((long) 'a');
        java.lang.String str9 = hikariConfig1.getConnectionCustomizerClassName();
        java.lang.String str10 = hikariConfig1.getConnectionInitSql();
        long long11 = hikariConfig1.getConnectionTimeout();
        long long12 = hikariConfig1.getMaxLifetime();
        hikariConfig1.setMaximumPoolSize((int) (byte) 0);
        java.lang.String str15 = hikariConfig1.getCatalog();
        javax.sql.DataSource dataSource16 = hikariConfig1.getDataSource();
        long long17 = hikariConfig1.getIdleTimeout();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 5000L + "'", long11 == 5000L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 1800000L + "'", long12 == 1800000L);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertNull(dataSource16);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 600000L + "'", long17 == 600000L);
    }

    @Test
    public void test03796() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03796");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        boolean boolean2 = hikariConfig1.isInitializationFailFast();
        hikariConfig1.setInitializationFailFast(true);
        javax.sql.DataSource dataSource5 = null;
        hikariConfig1.setDataSource(dataSource5);
        java.lang.String str7 = hikariConfig1.getCatalog();
        int int8 = hikariConfig1.getMinimumPoolSize();
        java.lang.String str9 = hikariConfig1.getCatalog();
        long long10 = hikariConfig1.getLeakDetectionThreshold();
        hikariConfig1.setJdbc4ConnectionTest(false);
        int int13 = hikariConfig1.getMinimumPoolSize();
        long long14 = hikariConfig1.getLeakDetectionThreshold();
        hikariConfig1.setConnectionCustomizerClassName("HikariPool-393");
        int int17 = hikariConfig1.getAcquireIncrement();
        hikariConfig1.setIdleTimeout((long) '#');
        hikariConfig1.setMaximumPoolSize(100);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 10 + "'", int8 == 10);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 10 + "'", int13 == 10);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 0L + "'", long14 == 0L);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
    }

    @Test
    public void test03797() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03797");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        boolean boolean1 = hikariConfig0.isRegisterMbeans();
        int int2 = hikariConfig0.getTransactionIsolation();
        hikariConfig0.setDataSourceClassName("HikariPool-1465");
        hikariConfig0.setConnectionTestQuery("HikariPool-8479");
        javax.sql.DataSource dataSource7 = hikariConfig0.getDataSource();
        hikariConfig0.setIdleTimeout(5000L);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNull(dataSource7);
    }

    @Test
    public void test03798() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03798");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        boolean boolean2 = hikariConfig1.isInitializationFailFast();
        boolean boolean3 = hikariConfig1.isJdbc4ConnectionTest();
        javax.sql.DataSource dataSource4 = null;
        hikariConfig1.setDataSource(dataSource4);
        long long6 = hikariConfig1.getIdleTimeout();
        hikariConfig1.setConnectionCustomizerClassName("HikariPool-184");
        hikariConfig1.setConnectionTestQuery("HikariPool-2833");
        boolean boolean11 = hikariConfig1.isAutoCommit();
        java.lang.String str12 = hikariConfig1.getCatalog();
        int int13 = hikariConfig1.getTransactionIsolation();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 600000L + "'", long6 == 600000L);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
    }

    @Test
    public void test03799() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03799");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        boolean boolean2 = hikariConfig1.isInitializationFailFast();
        hikariConfig1.setInitializationFailFast(true);
        javax.sql.DataSource dataSource5 = null;
        hikariConfig1.setDataSource(dataSource5);
        java.lang.String str7 = hikariConfig1.getCatalog();
        int int8 = hikariConfig1.getMinimumPoolSize();
        java.lang.String str9 = hikariConfig1.getCatalog();
        long long10 = hikariConfig1.getLeakDetectionThreshold();
        hikariConfig1.setConnectionTestQuery("HikariPool-143");
        hikariConfig1.setIdleTimeout((long) (byte) 10);
        java.lang.String str15 = hikariConfig1.getConnectionCustomizerClassName();
        hikariConfig1.setRegisterMbeans(false);
        javax.sql.DataSource dataSource18 = null;
        hikariConfig1.setDataSource(dataSource18);
        javax.sql.DataSource dataSource20 = null;
        hikariConfig1.setDataSource(dataSource20);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 10 + "'", int8 == 10);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertNull(str15);
    }

    @Test
    public void test03800() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03800");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        boolean boolean2 = hikariConfig1.isInitializationFailFast();
        hikariConfig1.setInitializationFailFast(true);
        java.lang.String str5 = hikariConfig1.getConnectionTestQuery();
        hikariConfig1.setDataSourceClassName("");
        java.util.Properties properties9 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig10 = new com.zaxxer.hikari.HikariConfig(properties9);
        boolean boolean11 = hikariConfig10.isInitializationFailFast();
        hikariConfig10.setInitializationFailFast(true);
        int int14 = hikariConfig10.getAcquireRetries();
        long long15 = hikariConfig10.getMaxLifetime();
        hikariConfig10.setMaxLifetime((long) (short) 0);
        long long18 = hikariConfig10.getIdleTimeout();
        boolean boolean19 = hikariConfig10.isRegisterMbeans();
        long long20 = hikariConfig10.getAcquireRetryDelay();
        hikariConfig1.addDataSourceProperty("HikariPool-184", (java.lang.Object) long20);
        java.lang.String str22 = hikariConfig1.getCatalog();
        hikariConfig1.setTransactionIsolation("HikariPool-2895");
        hikariConfig1.setDataSourceClassName("HikariPool-7289");
        // The following exception was thrown during execution in test generation
        try {
            hikariConfig1.validate();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid transaction isolation value: HikariPool-2895");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 3 + "'", int14 == 3);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 1800000L + "'", long15 == 1800000L);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 600000L + "'", long18 == 600000L);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 0L + "'", long20 == 0L);
        org.junit.Assert.assertNull(str22);
    }

    @Test
    public void test03801() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03801");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        boolean boolean2 = hikariConfig1.isInitializationFailFast();
        hikariConfig1.setInitializationFailFast(true);
        javax.sql.DataSource dataSource5 = null;
        hikariConfig1.setDataSource(dataSource5);
        hikariConfig1.setAcquireRetryDelay((long) 'a');
        java.lang.String str9 = hikariConfig1.getConnectionCustomizerClassName();
        java.util.Properties properties10 = hikariConfig1.getDataSourceProperties();
        hikariConfig1.setAutoCommit(false);
        hikariConfig1.setInitializationFailFast(false);
        int int15 = hikariConfig1.getMinimumPoolSize();
        java.util.Properties properties16 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig17 = new com.zaxxer.hikari.HikariConfig(properties16);
        java.util.Properties properties18 = hikariConfig17.getDataSourceProperties();
        hikariConfig1.setDataSourceProperties(properties18);
        com.zaxxer.hikari.HikariConfig hikariConfig20 = new com.zaxxer.hikari.HikariConfig(properties18);
        long long21 = hikariConfig20.getLeakDetectionThreshold();
        hikariConfig20.setDataSourceClassName("HikariPool-1900");
        hikariConfig20.setMaxLifetime((long) (short) 0);
        int int26 = hikariConfig20.getAcquireRetries();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNotNull(properties10);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 10 + "'", int15 == 10);
        org.junit.Assert.assertNotNull(properties18);
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + 0L + "'", long21 == 0L);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 3 + "'", int26 == 3);
    }

    @Test
    public void test03802() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03802");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        boolean boolean2 = hikariConfig1.isInitializationFailFast();
        int int3 = hikariConfig1.getAcquireIncrement();
        hikariConfig1.setConnectionCustomizerClassName("hi!");
        java.lang.String str6 = hikariConfig1.getConnectionTestQuery();
        javax.sql.DataSource dataSource7 = null;
        hikariConfig1.setDataSource(dataSource7);
        hikariConfig1.setConnectionCustomizerClassName("HikariPool-4119");
        // The following exception was thrown during execution in test generation
        try {
            hikariConfig1.validate();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: one of either dataSource or dataSourceClassName must be specified");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNull(str6);
    }

    @Test
    public void test03803() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03803");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        boolean boolean2 = hikariConfig1.isInitializationFailFast();
        hikariConfig1.setInitializationFailFast(true);
        java.lang.String str5 = hikariConfig1.getConnectionTestQuery();
        hikariConfig1.setDataSourceClassName("");
        long long8 = hikariConfig1.getMaxLifetime();
        hikariConfig1.setInitializationFailFast(false);
        java.lang.String str11 = hikariConfig1.getCatalog();
        java.lang.String str12 = hikariConfig1.getConnectionCustomizerClassName();
        hikariConfig1.validate();
        int int14 = hikariConfig1.getAcquireIncrement();
        hikariConfig1.setAcquireRetries((int) (byte) 1);
        long long17 = hikariConfig1.getConnectionTimeout();
        boolean boolean18 = hikariConfig1.isJdbc4ConnectionTest();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 1800000L + "'", long8 == 1800000L);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 5000L + "'", long17 == 5000L);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
    }

    @Test
    public void test03804() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03804");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        boolean boolean2 = hikariConfig1.isInitializationFailFast();
        hikariConfig1.setInitializationFailFast(true);
        hikariConfig1.setAcquireRetryDelay(1L);
        hikariConfig1.setAcquireIncrement((int) (byte) 100);
        java.lang.String str9 = hikariConfig1.getPoolName();
        hikariConfig1.setLeakDetectionThreshold((long) 3);
        java.util.Properties properties12 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig13 = new com.zaxxer.hikari.HikariConfig(properties12);
        boolean boolean14 = hikariConfig13.isInitializationFailFast();
        hikariConfig13.setInitializationFailFast(true);
        javax.sql.DataSource dataSource17 = null;
        hikariConfig13.setDataSource(dataSource17);
        java.lang.String str19 = hikariConfig13.getCatalog();
        int int20 = hikariConfig13.getMinimumPoolSize();
        java.lang.String str21 = hikariConfig13.getCatalog();
        long long22 = hikariConfig13.getLeakDetectionThreshold();
        java.util.Properties properties23 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig24 = new com.zaxxer.hikari.HikariConfig(properties23);
        boolean boolean25 = hikariConfig24.isInitializationFailFast();
        hikariConfig24.setInitializationFailFast(true);
        javax.sql.DataSource dataSource28 = null;
        hikariConfig24.setDataSource(dataSource28);
        hikariConfig24.setAcquireRetryDelay((long) 'a');
        java.lang.String str32 = hikariConfig24.getConnectionCustomizerClassName();
        java.lang.String str33 = hikariConfig24.getConnectionInitSql();
        hikariConfig24.setDataSourceClassName("");
        java.util.Properties properties36 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig37 = new com.zaxxer.hikari.HikariConfig(properties36);
        boolean boolean38 = hikariConfig37.isInitializationFailFast();
        hikariConfig37.setInitializationFailFast(true);
        javax.sql.DataSource dataSource41 = null;
        hikariConfig37.setDataSource(dataSource41);
        hikariConfig37.setAcquireRetryDelay((long) 'a');
        java.lang.String str45 = hikariConfig37.getConnectionCustomizerClassName();
        java.util.Properties properties46 = hikariConfig37.getDataSourceProperties();
        java.util.Properties properties47 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig48 = new com.zaxxer.hikari.HikariConfig(properties47);
        java.util.Properties properties49 = hikariConfig48.getDataSourceProperties();
        hikariConfig37.setDataSourceProperties(properties49);
        hikariConfig24.setDataSourceProperties(properties49);
        hikariConfig13.setDataSourceProperties(properties49);
        hikariConfig1.setDataSourceProperties(properties49);
        hikariConfig1.setUseInstrumentation(false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "HikariPool-31704" + "'", str9, "HikariPool-31704");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNull(str19);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 10 + "'", int20 == 10);
        org.junit.Assert.assertNull(str21);
        org.junit.Assert.assertTrue("'" + long22 + "' != '" + 0L + "'", long22 == 0L);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNull(str32);
        org.junit.Assert.assertNull(str33);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertNull(str45);
        org.junit.Assert.assertNotNull(properties46);
        org.junit.Assert.assertNotNull(properties49);
    }

    @Test
    public void test03805() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03805");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        java.util.Properties properties2 = hikariConfig1.getDataSourceProperties();
        java.util.Properties properties4 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig5 = new com.zaxxer.hikari.HikariConfig(properties4);
        boolean boolean6 = hikariConfig5.isInitializationFailFast();
        hikariConfig5.setInitializationFailFast(true);
        javax.sql.DataSource dataSource9 = null;
        hikariConfig5.setDataSource(dataSource9);
        hikariConfig5.setAcquireRetryDelay((long) 'a');
        java.lang.String str13 = hikariConfig5.getConnectionCustomizerClassName();
        hikariConfig5.setConnectionCustomizerClassName("hi!");
        java.lang.String str16 = hikariConfig5.getConnectionInitSql();
        hikariConfig1.addDataSourceProperty("hi!", (java.lang.Object) hikariConfig5);
        hikariConfig1.setDataSourceClassName("hi!");
        long long20 = hikariConfig1.getMaxLifetime();
        long long21 = hikariConfig1.getIdleTimeout();
        hikariConfig1.setDataSourceClassName("HikariPool-8123");
        boolean boolean24 = hikariConfig1.isRegisterMbeans();
        org.junit.Assert.assertNotNull(properties2);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 1800000L + "'", long20 == 1800000L);
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + 600000L + "'", long21 == 600000L);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
    }

    @Test
    public void test03806() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03806");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        java.util.Properties properties2 = hikariConfig1.getDataSourceProperties();
        java.util.Properties properties4 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig5 = new com.zaxxer.hikari.HikariConfig(properties4);
        boolean boolean6 = hikariConfig5.isInitializationFailFast();
        hikariConfig5.setInitializationFailFast(true);
        javax.sql.DataSource dataSource9 = null;
        hikariConfig5.setDataSource(dataSource9);
        hikariConfig5.setAcquireRetryDelay((long) 'a');
        java.lang.String str13 = hikariConfig5.getConnectionCustomizerClassName();
        hikariConfig5.setConnectionCustomizerClassName("hi!");
        java.lang.String str16 = hikariConfig5.getConnectionInitSql();
        hikariConfig1.addDataSourceProperty("hi!", (java.lang.Object) hikariConfig5);
        hikariConfig1.setDataSourceClassName("hi!");
        hikariConfig1.setPoolName("");
        hikariConfig1.setDataSourceClassName("HikariPool-907");
        hikariConfig1.setMaximumPoolSize(100);
        boolean boolean26 = hikariConfig1.isJdbc4ConnectionTest();
        hikariConfig1.setMinimumPoolSize(3);
        org.junit.Assert.assertNotNull(properties2);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
    }

    @Test
    public void test03807() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03807");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        boolean boolean2 = hikariConfig1.isInitializationFailFast();
        hikariConfig1.setLeakDetectionThreshold((long) '4');
        java.lang.String str5 = hikariConfig1.getConnectionCustomizerClassName();
        java.util.Properties properties6 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig7 = new com.zaxxer.hikari.HikariConfig(properties6);
        boolean boolean8 = hikariConfig7.isInitializationFailFast();
        hikariConfig7.setInitializationFailFast(true);
        javax.sql.DataSource dataSource11 = null;
        hikariConfig7.setDataSource(dataSource11);
        hikariConfig7.setAcquireRetryDelay((long) 'a');
        java.lang.String str15 = hikariConfig7.getConnectionCustomizerClassName();
        java.util.Properties properties16 = hikariConfig7.getDataSourceProperties();
        java.util.Properties properties17 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig18 = new com.zaxxer.hikari.HikariConfig(properties17);
        java.util.Properties properties19 = hikariConfig18.getDataSourceProperties();
        hikariConfig7.setDataSourceProperties(properties19);
        hikariConfig1.setDataSourceProperties(properties19);
        java.lang.String str22 = hikariConfig1.getDataSourceClassName();
        hikariConfig1.setConnectionCustomizerClassName("");
        java.lang.String str25 = hikariConfig1.getDataSourceClassName();
        javax.sql.DataSource dataSource26 = null;
        hikariConfig1.setDataSource(dataSource26);
        int int28 = hikariConfig1.getMinimumPoolSize();
        hikariConfig1.setAcquireIncrement((int) ' ');
        java.lang.String str31 = hikariConfig1.getDataSourceClassName();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertNotNull(properties16);
        org.junit.Assert.assertNotNull(properties19);
        org.junit.Assert.assertNull(str22);
        org.junit.Assert.assertNull(str25);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 10 + "'", int28 == 10);
        org.junit.Assert.assertNull(str31);
    }

    @Test
    public void test03808() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03808");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        boolean boolean2 = hikariConfig1.isInitializationFailFast();
        hikariConfig1.setInitializationFailFast(true);
        javax.sql.DataSource dataSource5 = null;
        hikariConfig1.setDataSource(dataSource5);
        hikariConfig1.setAcquireRetryDelay((long) 'a');
        java.lang.String str9 = hikariConfig1.getConnectionCustomizerClassName();
        java.lang.String str10 = hikariConfig1.getConnectionInitSql();
        hikariConfig1.setDataSourceClassName("");
        java.util.Properties properties13 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig14 = new com.zaxxer.hikari.HikariConfig(properties13);
        boolean boolean15 = hikariConfig14.isInitializationFailFast();
        hikariConfig14.setInitializationFailFast(true);
        javax.sql.DataSource dataSource18 = null;
        hikariConfig14.setDataSource(dataSource18);
        hikariConfig14.setAcquireRetryDelay((long) 'a');
        java.lang.String str22 = hikariConfig14.getConnectionCustomizerClassName();
        java.util.Properties properties23 = hikariConfig14.getDataSourceProperties();
        java.util.Properties properties24 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig25 = new com.zaxxer.hikari.HikariConfig(properties24);
        java.util.Properties properties26 = hikariConfig25.getDataSourceProperties();
        hikariConfig14.setDataSourceProperties(properties26);
        hikariConfig1.setDataSourceProperties(properties26);
        hikariConfig1.setUseInstrumentation(true);
        hikariConfig1.setLeakDetectionThreshold((long) (byte) 1);
        java.lang.String str33 = hikariConfig1.getPoolName();
        javax.sql.DataSource dataSource34 = null;
        hikariConfig1.setDataSource(dataSource34);
        hikariConfig1.setRegisterMbeans(true);
        int int38 = hikariConfig1.getAcquireIncrement();
        hikariConfig1.setIdleTimeout(0L);
        hikariConfig1.setCatalog("HikariPool-7023");
        hikariConfig1.setDataSourceClassName("HikariPool-14299");
        hikariConfig1.setAutoCommit(false);
        hikariConfig1.setInitializationFailFast(false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNull(str22);
        org.junit.Assert.assertNotNull(properties23);
        org.junit.Assert.assertNotNull(properties26);
// flaky:         org.junit.Assert.assertEquals("'" + str33 + "' != '" + "HikariPool-31725" + "'", str33, "HikariPool-31725");
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 0 + "'", int38 == 0);
    }

    @Test
    public void test03809() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03809");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        boolean boolean2 = hikariConfig1.isInitializationFailFast();
        boolean boolean3 = hikariConfig1.isJdbc4ConnectionTest();
        hikariConfig1.setRegisterMbeans(true);
        boolean boolean6 = hikariConfig1.isJdbc4ConnectionTest();
        hikariConfig1.setLeakDetectionThreshold(600000L);
        java.util.Properties properties10 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig11 = new com.zaxxer.hikari.HikariConfig(properties10);
        boolean boolean12 = hikariConfig11.isInitializationFailFast();
        int int13 = hikariConfig11.getAcquireIncrement();
        hikariConfig11.setIdleTimeout(0L);
        java.util.Properties properties16 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig17 = new com.zaxxer.hikari.HikariConfig(properties16);
        boolean boolean18 = hikariConfig17.isInitializationFailFast();
        hikariConfig17.setInitializationFailFast(true);
        javax.sql.DataSource dataSource21 = null;
        hikariConfig17.setDataSource(dataSource21);
        hikariConfig17.setAcquireRetryDelay((long) 'a');
        java.lang.String str25 = hikariConfig17.getConnectionCustomizerClassName();
        java.lang.String str26 = hikariConfig17.getConnectionInitSql();
        hikariConfig17.setDataSourceClassName("");
        java.util.Properties properties29 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig30 = new com.zaxxer.hikari.HikariConfig(properties29);
        boolean boolean31 = hikariConfig30.isInitializationFailFast();
        hikariConfig30.setInitializationFailFast(true);
        javax.sql.DataSource dataSource34 = null;
        hikariConfig30.setDataSource(dataSource34);
        hikariConfig30.setAcquireRetryDelay((long) 'a');
        java.lang.String str38 = hikariConfig30.getConnectionCustomizerClassName();
        java.util.Properties properties39 = hikariConfig30.getDataSourceProperties();
        java.util.Properties properties40 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig41 = new com.zaxxer.hikari.HikariConfig(properties40);
        java.util.Properties properties42 = hikariConfig41.getDataSourceProperties();
        hikariConfig30.setDataSourceProperties(properties42);
        hikariConfig17.setDataSourceProperties(properties42);
        long long45 = hikariConfig17.getLeakDetectionThreshold();
        java.util.Properties properties46 = hikariConfig17.getDataSourceProperties();
        com.zaxxer.hikari.HikariConfig hikariConfig47 = new com.zaxxer.hikari.HikariConfig(properties46);
        hikariConfig11.setDataSourceProperties(properties46);
        hikariConfig1.addDataSourceProperty("HikariPool-3745", (java.lang.Object) hikariConfig11);
        // The following exception was thrown during execution in test generation
        try {
            hikariConfig11.setConnectionTimeout((long) 97);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: connectionTimeout cannot be less than 100ms");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNull(str25);
        org.junit.Assert.assertNull(str26);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertNull(str38);
        org.junit.Assert.assertNotNull(properties39);
        org.junit.Assert.assertNotNull(properties42);
        org.junit.Assert.assertTrue("'" + long45 + "' != '" + 0L + "'", long45 == 0L);
        org.junit.Assert.assertNotNull(properties46);
    }

    @Test
    public void test03810() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03810");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        boolean boolean2 = hikariConfig1.isInitializationFailFast();
        hikariConfig1.setInitializationFailFast(true);
        javax.sql.DataSource dataSource5 = null;
        hikariConfig1.setDataSource(dataSource5);
        long long7 = hikariConfig1.getLeakDetectionThreshold();
        hikariConfig1.setTransactionIsolation("HikariPool-1465");
        int int10 = hikariConfig1.getTransactionIsolation();
        hikariConfig1.setRegisterMbeans(false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
    }

    @Test
    public void test03811() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03811");
        // The following exception was thrown during execution in test generation
        try {
            com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig("HikariPool-17827");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Property file HikariPool-17827 was not found.");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test03812() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03812");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        boolean boolean2 = hikariConfig1.isInitializationFailFast();
        hikariConfig1.setInitializationFailFast(true);
        javax.sql.DataSource dataSource5 = null;
        hikariConfig1.setDataSource(dataSource5);
        hikariConfig1.setAcquireRetryDelay((long) 'a');
        java.lang.String str9 = hikariConfig1.getConnectionCustomizerClassName();
        java.lang.String str10 = hikariConfig1.getConnectionInitSql();
        long long11 = hikariConfig1.getLeakDetectionThreshold();
        hikariConfig1.setRegisterMbeans(false);
        boolean boolean14 = hikariConfig1.isInitializationFailFast();
        java.lang.String str15 = hikariConfig1.getConnectionCustomizerClassName();
        hikariConfig1.setRegisterMbeans(false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 0L + "'", long11 == 0L);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNull(str15);
    }

    @Test
    public void test03813() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03813");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        boolean boolean2 = hikariConfig1.isInitializationFailFast();
        int int3 = hikariConfig1.getAcquireIncrement();
        java.lang.String str4 = hikariConfig1.getConnectionCustomizerClassName();
        hikariConfig1.setIdleTimeout((long) (byte) 0);
        javax.sql.DataSource dataSource7 = null;
        hikariConfig1.setDataSource(dataSource7);
        hikariConfig1.setMaxLifetime(0L);
        java.lang.String str11 = hikariConfig1.getPoolName();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNull(str4);
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "HikariPool-31751" + "'", str11, "HikariPool-31751");
    }

    @Test
    public void test03814() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03814");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        boolean boolean2 = hikariConfig1.isInitializationFailFast();
        hikariConfig1.setInitializationFailFast(true);
        javax.sql.DataSource dataSource5 = null;
        hikariConfig1.setDataSource(dataSource5);
        hikariConfig1.setAcquireRetryDelay((long) 'a');
        java.lang.String str9 = hikariConfig1.getConnectionCustomizerClassName();
        java.util.Properties properties10 = hikariConfig1.getDataSourceProperties();
        java.util.Properties properties11 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig12 = new com.zaxxer.hikari.HikariConfig(properties11);
        boolean boolean13 = hikariConfig12.isInitializationFailFast();
        hikariConfig12.setInitializationFailFast(true);
        javax.sql.DataSource dataSource16 = null;
        hikariConfig12.setDataSource(dataSource16);
        hikariConfig12.setAcquireRetryDelay((long) 'a');
        java.lang.String str20 = hikariConfig12.getConnectionCustomizerClassName();
        java.util.Properties properties21 = hikariConfig12.getDataSourceProperties();
        hikariConfig1.setDataSourceProperties(properties21);
        com.zaxxer.hikari.HikariConfig hikariConfig23 = new com.zaxxer.hikari.HikariConfig(properties21);
        hikariConfig23.setConnectionTestQuery("HikariPool-594");
        java.util.Properties properties26 = hikariConfig23.getDataSourceProperties();
        int int27 = hikariConfig23.getMinimumPoolSize();
        java.lang.String str28 = hikariConfig23.getConnectionTestQuery();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNotNull(properties10);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNull(str20);
        org.junit.Assert.assertNotNull(properties21);
        org.junit.Assert.assertNotNull(properties26);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 10 + "'", int27 == 10);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "HikariPool-594" + "'", str28, "HikariPool-594");
    }

    @Test
    public void test03815() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03815");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        boolean boolean2 = hikariConfig1.isInitializationFailFast();
        hikariConfig1.setLeakDetectionThreshold((long) '4');
        java.lang.String str5 = hikariConfig1.getConnectionCustomizerClassName();
        hikariConfig1.setAcquireRetryDelay((long) (byte) 10);
        hikariConfig1.setLeakDetectionThreshold((long) (short) 10);
        java.util.Properties properties10 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig11 = new com.zaxxer.hikari.HikariConfig(properties10);
        boolean boolean12 = hikariConfig11.isInitializationFailFast();
        hikariConfig11.setInitializationFailFast(true);
        javax.sql.DataSource dataSource15 = null;
        hikariConfig11.setDataSource(dataSource15);
        hikariConfig11.setAcquireRetryDelay((long) 'a');
        java.lang.String str19 = hikariConfig11.getConnectionCustomizerClassName();
        java.util.Properties properties20 = hikariConfig11.getDataSourceProperties();
        java.util.Properties properties21 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig22 = new com.zaxxer.hikari.HikariConfig(properties21);
        boolean boolean23 = hikariConfig22.isInitializationFailFast();
        hikariConfig22.setInitializationFailFast(true);
        javax.sql.DataSource dataSource26 = null;
        hikariConfig22.setDataSource(dataSource26);
        hikariConfig22.setAcquireRetryDelay((long) 'a');
        java.lang.String str30 = hikariConfig22.getConnectionCustomizerClassName();
        java.util.Properties properties31 = hikariConfig22.getDataSourceProperties();
        hikariConfig11.setDataSourceProperties(properties31);
        hikariConfig1.setDataSourceProperties(properties31);
        int int34 = hikariConfig1.getAcquireIncrement();
        javax.sql.DataSource dataSource35 = null;
        hikariConfig1.setDataSource(dataSource35);
        java.lang.String str37 = hikariConfig1.getConnectionInitSql();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNull(str19);
        org.junit.Assert.assertNotNull(properties20);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNull(str30);
        org.junit.Assert.assertNotNull(properties31);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 0 + "'", int34 == 0);
        org.junit.Assert.assertNull(str37);
    }

    @Test
    public void test03816() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03816");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        boolean boolean2 = hikariConfig1.isInitializationFailFast();
        hikariConfig1.setInitializationFailFast(true);
        int int5 = hikariConfig1.getAcquireRetries();
        long long6 = hikariConfig1.getMaxLifetime();
        hikariConfig1.setMaxLifetime((long) (short) 0);
        long long9 = hikariConfig1.getIdleTimeout();
        java.lang.String str10 = hikariConfig1.getPoolName();
        java.util.Properties properties12 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig13 = new com.zaxxer.hikari.HikariConfig(properties12);
        boolean boolean14 = hikariConfig13.isInitializationFailFast();
        hikariConfig13.setInitializationFailFast(true);
        boolean boolean17 = hikariConfig13.isJdbc4ConnectionTest();
        long long18 = hikariConfig13.getConnectionTimeout();
        hikariConfig13.setPoolName("hi!");
        hikariConfig13.setAcquireIncrement((int) (byte) 100);
        java.util.Properties properties23 = hikariConfig13.getDataSourceProperties();
        hikariConfig13.setMinimumPoolSize((int) (byte) 1);
        int int26 = hikariConfig13.getTransactionIsolation();
        hikariConfig1.addDataSourceProperty("HikariPool-184", (java.lang.Object) hikariConfig13);
        hikariConfig1.setUseInstrumentation(true);
        int int30 = hikariConfig1.getAcquireIncrement();
        hikariConfig1.setUseInstrumentation(false);
        hikariConfig1.setInitializationFailFast(true);
        java.lang.String str35 = hikariConfig1.getDataSourceClassName();
        boolean boolean36 = hikariConfig1.isJdbc4ConnectionTest();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 3 + "'", int5 == 3);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 1800000L + "'", long6 == 1800000L);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 600000L + "'", long9 == 600000L);
// flaky:         org.junit.Assert.assertEquals("'" + str10 + "' != '" + "HikariPool-31765" + "'", str10, "HikariPool-31765");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 5000L + "'", long18 == 5000L);
        org.junit.Assert.assertNotNull(properties23);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + (-1) + "'", int26 == (-1));
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertNull(str35);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + true + "'", boolean36 == true);
    }

    @Test
    public void test03817() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03817");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        boolean boolean2 = hikariConfig1.isInitializationFailFast();
        hikariConfig1.setInitializationFailFast(true);
        javax.sql.DataSource dataSource5 = null;
        hikariConfig1.setDataSource(dataSource5);
        java.lang.String str7 = hikariConfig1.getCatalog();
        int int8 = hikariConfig1.getMinimumPoolSize();
        hikariConfig1.setTransactionIsolation("");
        hikariConfig1.setConnectionInitSql("HikariPool-609");
        hikariConfig1.setLeakDetectionThreshold(10L);
        hikariConfig1.setAcquireIncrement((int) 'a');
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 10 + "'", int8 == 10);
    }

    @Test
    public void test03818() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03818");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        boolean boolean2 = hikariConfig1.isInitializationFailFast();
        hikariConfig1.setLeakDetectionThreshold((long) '4');
        java.lang.String str5 = hikariConfig1.getConnectionCustomizerClassName();
        java.util.Properties properties6 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig7 = new com.zaxxer.hikari.HikariConfig(properties6);
        boolean boolean8 = hikariConfig7.isInitializationFailFast();
        hikariConfig7.setInitializationFailFast(true);
        javax.sql.DataSource dataSource11 = null;
        hikariConfig7.setDataSource(dataSource11);
        hikariConfig7.setAcquireRetryDelay((long) 'a');
        java.lang.String str15 = hikariConfig7.getConnectionCustomizerClassName();
        java.util.Properties properties16 = hikariConfig7.getDataSourceProperties();
        java.util.Properties properties17 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig18 = new com.zaxxer.hikari.HikariConfig(properties17);
        java.util.Properties properties19 = hikariConfig18.getDataSourceProperties();
        hikariConfig7.setDataSourceProperties(properties19);
        hikariConfig1.setDataSourceProperties(properties19);
        hikariConfig1.setConnectionInitSql("hi!");
        hikariConfig1.setIdleTimeout(600000L);
        hikariConfig1.setAcquireRetryDelay(5000L);
        hikariConfig1.setInitializationFailFast(true);
        java.lang.String str30 = hikariConfig1.getPoolName();
        long long31 = hikariConfig1.getConnectionTimeout();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertNotNull(properties16);
        org.junit.Assert.assertNotNull(properties19);
// flaky:         org.junit.Assert.assertEquals("'" + str30 + "' != '" + "HikariPool-31773" + "'", str30, "HikariPool-31773");
        org.junit.Assert.assertTrue("'" + long31 + "' != '" + 5000L + "'", long31 == 5000L);
    }

    @Test
    public void test03819() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03819");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        boolean boolean2 = hikariConfig1.isInitializationFailFast();
        hikariConfig1.setInitializationFailFast(true);
        hikariConfig1.setAcquireRetryDelay(1L);
        boolean boolean7 = hikariConfig1.isAutoCommit();
        java.lang.String str8 = hikariConfig1.getDataSourceClassName();
        java.lang.String str9 = hikariConfig1.getPoolName();
        javax.sql.DataSource dataSource10 = hikariConfig1.getDataSource();
        hikariConfig1.setAcquireRetryDelay((long) (byte) 1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNull(str8);
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "HikariPool-31776" + "'", str9, "HikariPool-31776");
        org.junit.Assert.assertNull(dataSource10);
    }

    @Test
    public void test03820() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03820");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        java.util.Properties properties2 = hikariConfig1.getDataSourceProperties();
        java.util.Properties properties4 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig5 = new com.zaxxer.hikari.HikariConfig(properties4);
        boolean boolean6 = hikariConfig5.isInitializationFailFast();
        hikariConfig5.setInitializationFailFast(true);
        javax.sql.DataSource dataSource9 = null;
        hikariConfig5.setDataSource(dataSource9);
        hikariConfig5.setAcquireRetryDelay((long) 'a');
        java.lang.String str13 = hikariConfig5.getConnectionCustomizerClassName();
        hikariConfig5.setConnectionCustomizerClassName("hi!");
        java.lang.String str16 = hikariConfig5.getConnectionInitSql();
        hikariConfig1.addDataSourceProperty("hi!", (java.lang.Object) hikariConfig5);
        java.lang.String str18 = hikariConfig1.getConnectionCustomizerClassName();
        hikariConfig1.setMinimumPoolSize((int) 'a');
        java.lang.String str21 = hikariConfig1.getDataSourceClassName();
        hikariConfig1.setConnectionInitSql("HikariPool-14900");
        long long24 = hikariConfig1.getConnectionTimeout();
        boolean boolean25 = hikariConfig1.isRegisterMbeans();
        org.junit.Assert.assertNotNull(properties2);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertNull(str21);
        org.junit.Assert.assertTrue("'" + long24 + "' != '" + 5000L + "'", long24 == 5000L);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
    }

    @Test
    public void test03821() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03821");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        boolean boolean2 = hikariConfig1.isInitializationFailFast();
        hikariConfig1.setInitializationFailFast(true);
        javax.sql.DataSource dataSource5 = null;
        hikariConfig1.setDataSource(dataSource5);
        hikariConfig1.setAcquireRetryDelay((long) 'a');
        java.lang.String str9 = hikariConfig1.getConnectionCustomizerClassName();
        java.util.Properties properties10 = hikariConfig1.getDataSourceProperties();
        java.util.Properties properties11 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig12 = new com.zaxxer.hikari.HikariConfig(properties11);
        boolean boolean13 = hikariConfig12.isInitializationFailFast();
        hikariConfig12.setInitializationFailFast(true);
        javax.sql.DataSource dataSource16 = null;
        hikariConfig12.setDataSource(dataSource16);
        hikariConfig12.setAcquireRetryDelay((long) 'a');
        java.lang.String str20 = hikariConfig12.getConnectionCustomizerClassName();
        java.util.Properties properties21 = hikariConfig12.getDataSourceProperties();
        hikariConfig1.setDataSourceProperties(properties21);
        com.zaxxer.hikari.HikariConfig hikariConfig23 = new com.zaxxer.hikari.HikariConfig(properties21);
        hikariConfig23.setConnectionTestQuery("HikariPool-594");
        hikariConfig23.setAcquireIncrement((int) '#');
        long long28 = hikariConfig23.getConnectionTimeout();
        hikariConfig23.setAcquireIncrement((int) (short) 10);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNotNull(properties10);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNull(str20);
        org.junit.Assert.assertNotNull(properties21);
        org.junit.Assert.assertTrue("'" + long28 + "' != '" + 5000L + "'", long28 == 5000L);
    }

    @Test
    public void test03822() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03822");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        boolean boolean2 = hikariConfig1.isInitializationFailFast();
        hikariConfig1.setLeakDetectionThreshold((long) '4');
        int int5 = hikariConfig1.getTransactionIsolation();
        hikariConfig1.setAcquireRetries(0);
        int int8 = hikariConfig1.getAcquireRetries();
        hikariConfig1.setConnectionTestQuery("HikariPool-1538");
        boolean boolean11 = hikariConfig1.isAutoCommit();
        java.util.Properties properties12 = hikariConfig1.getDataSourceProperties();
        hikariConfig1.setAcquireIncrement(97);
        int int15 = hikariConfig1.getAcquireIncrement();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(properties12);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
    }

    @Test
    public void test03823() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03823");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        boolean boolean2 = hikariConfig1.isInitializationFailFast();
        hikariConfig1.setInitializationFailFast(true);
        javax.sql.DataSource dataSource5 = null;
        hikariConfig1.setDataSource(dataSource5);
        hikariConfig1.setAcquireRetryDelay((long) 'a');
        java.lang.String str9 = hikariConfig1.getConnectionCustomizerClassName();
        java.util.Properties properties10 = hikariConfig1.getDataSourceProperties();
        java.util.Properties properties11 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig12 = new com.zaxxer.hikari.HikariConfig(properties11);
        java.util.Properties properties13 = hikariConfig12.getDataSourceProperties();
        hikariConfig1.setDataSourceProperties(properties13);
        int int15 = hikariConfig1.getMinimumPoolSize();
        int int16 = hikariConfig1.getTransactionIsolation();
        // The following exception was thrown during execution in test generation
        try {
            hikariConfig1.validate();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: one of either dataSource or dataSourceClassName must be specified");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNotNull(properties10);
        org.junit.Assert.assertNotNull(properties13);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 10 + "'", int15 == 10);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
    }

    @Test
    public void test03824() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03824");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        boolean boolean2 = hikariConfig1.isInitializationFailFast();
        hikariConfig1.setLeakDetectionThreshold((long) '4');
        long long5 = hikariConfig1.getIdleTimeout();
        java.lang.String str6 = hikariConfig1.getPoolName();
        hikariConfig1.setCatalog("HikariPool-20422");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 600000L + "'", long5 == 600000L);
// flaky:         org.junit.Assert.assertEquals("'" + str6 + "' != '" + "HikariPool-31804" + "'", str6, "HikariPool-31804");
    }

    @Test
    public void test03825() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03825");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        boolean boolean2 = hikariConfig1.isInitializationFailFast();
        hikariConfig1.setInitializationFailFast(true);
        javax.sql.DataSource dataSource5 = null;
        hikariConfig1.setDataSource(dataSource5);
        hikariConfig1.setAcquireRetryDelay((long) 'a');
        java.lang.String str9 = hikariConfig1.getConnectionCustomizerClassName();
        java.util.Properties properties10 = hikariConfig1.getDataSourceProperties();
        hikariConfig1.setAutoCommit(false);
        hikariConfig1.setInitializationFailFast(false);
        int int15 = hikariConfig1.getMaximumPoolSize();
        boolean boolean16 = hikariConfig1.isInitializationFailFast();
        int int17 = hikariConfig1.getMinimumPoolSize();
        javax.sql.DataSource dataSource18 = null;
        hikariConfig1.setDataSource(dataSource18);
        int int20 = hikariConfig1.getMinimumPoolSize();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNotNull(properties10);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 60 + "'", int15 == 60);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 10 + "'", int17 == 10);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 10 + "'", int20 == 10);
    }

    @Test
    public void test03826() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03826");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        boolean boolean2 = hikariConfig1.isInitializationFailFast();
        hikariConfig1.setInitializationFailFast(true);
        javax.sql.DataSource dataSource5 = null;
        hikariConfig1.setDataSource(dataSource5);
        java.lang.String str7 = hikariConfig1.getCatalog();
        int int8 = hikariConfig1.getMinimumPoolSize();
        java.lang.String str9 = hikariConfig1.getCatalog();
        long long10 = hikariConfig1.getLeakDetectionThreshold();
        long long11 = hikariConfig1.getConnectionTimeout();
        hikariConfig1.setJdbc4ConnectionTest(true);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 10 + "'", int8 == 10);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 5000L + "'", long11 == 5000L);
    }

    @Test
    public void test03827() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03827");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        boolean boolean2 = hikariConfig1.isInitializationFailFast();
        hikariConfig1.setInitializationFailFast(true);
        javax.sql.DataSource dataSource5 = null;
        hikariConfig1.setDataSource(dataSource5);
        hikariConfig1.setAcquireRetryDelay((long) 'a');
        java.lang.String str9 = hikariConfig1.getConnectionCustomizerClassName();
        int int10 = hikariConfig1.getAcquireRetries();
        boolean boolean11 = hikariConfig1.isInitializationFailFast();
        hikariConfig1.setMinimumPoolSize(3);
        hikariConfig1.setAcquireIncrement(100);
        java.util.Properties properties16 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig17 = new com.zaxxer.hikari.HikariConfig(properties16);
        boolean boolean18 = hikariConfig17.isInitializationFailFast();
        hikariConfig17.setInitializationFailFast(true);
        javax.sql.DataSource dataSource21 = null;
        hikariConfig17.setDataSource(dataSource21);
        hikariConfig17.setAcquireRetryDelay((long) 'a');
        java.lang.String str25 = hikariConfig17.getConnectionCustomizerClassName();
        java.lang.String str26 = hikariConfig17.getConnectionInitSql();
        hikariConfig17.setDataSourceClassName("");
        java.util.Properties properties29 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig30 = new com.zaxxer.hikari.HikariConfig(properties29);
        boolean boolean31 = hikariConfig30.isInitializationFailFast();
        hikariConfig30.setInitializationFailFast(true);
        javax.sql.DataSource dataSource34 = null;
        hikariConfig30.setDataSource(dataSource34);
        hikariConfig30.setAcquireRetryDelay((long) 'a');
        java.lang.String str38 = hikariConfig30.getConnectionCustomizerClassName();
        java.util.Properties properties39 = hikariConfig30.getDataSourceProperties();
        java.util.Properties properties40 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig41 = new com.zaxxer.hikari.HikariConfig(properties40);
        java.util.Properties properties42 = hikariConfig41.getDataSourceProperties();
        hikariConfig30.setDataSourceProperties(properties42);
        hikariConfig17.setDataSourceProperties(properties42);
        com.zaxxer.hikari.HikariConfig hikariConfig45 = new com.zaxxer.hikari.HikariConfig(properties42);
        hikariConfig1.setDataSourceProperties(properties42);
        com.zaxxer.hikari.HikariConfig hikariConfig47 = new com.zaxxer.hikari.HikariConfig(properties42);
        long long48 = hikariConfig47.getIdleTimeout();
        long long49 = hikariConfig47.getMaxLifetime();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 3 + "'", int10 == 3);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNull(str25);
        org.junit.Assert.assertNull(str26);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertNull(str38);
        org.junit.Assert.assertNotNull(properties39);
        org.junit.Assert.assertNotNull(properties42);
        org.junit.Assert.assertTrue("'" + long48 + "' != '" + 600000L + "'", long48 == 600000L);
        org.junit.Assert.assertTrue("'" + long49 + "' != '" + 1800000L + "'", long49 == 1800000L);
    }

    @Test
    public void test03828() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03828");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        boolean boolean2 = hikariConfig1.isInitializationFailFast();
        hikariConfig1.setInitializationFailFast(true);
        javax.sql.DataSource dataSource5 = null;
        hikariConfig1.setDataSource(dataSource5);
        java.lang.String str7 = hikariConfig1.getCatalog();
        int int8 = hikariConfig1.getTransactionIsolation();
        int int9 = hikariConfig1.getMaximumPoolSize();
        hikariConfig1.setJdbc4ConnectionTest(true);
        hikariConfig1.setUseInstrumentation(false);
        boolean boolean14 = hikariConfig1.isAutoCommit();
        javax.sql.DataSource dataSource15 = hikariConfig1.getDataSource();
        hikariConfig1.setMaxLifetime(0L);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 60 + "'", int9 == 60);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNull(dataSource15);
    }

    @Test
    public void test03829() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03829");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        boolean boolean2 = hikariConfig1.isInitializationFailFast();
        hikariConfig1.setLeakDetectionThreshold((long) '4');
        int int5 = hikariConfig1.getTransactionIsolation();
        hikariConfig1.setJdbc4ConnectionTest(false);
        javax.sql.DataSource dataSource8 = hikariConfig1.getDataSource();
        java.util.Properties properties10 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig11 = new com.zaxxer.hikari.HikariConfig(properties10);
        boolean boolean12 = hikariConfig11.isInitializationFailFast();
        hikariConfig11.setInitializationFailFast(true);
        javax.sql.DataSource dataSource15 = null;
        hikariConfig11.setDataSource(dataSource15);
        java.lang.String str17 = hikariConfig11.getCatalog();
        int int18 = hikariConfig11.getTransactionIsolation();
        long long19 = hikariConfig11.getMaxLifetime();
        java.lang.String str20 = hikariConfig11.getPoolName();
        int int21 = hikariConfig11.getAcquireRetries();
        hikariConfig11.setRegisterMbeans(true);
        hikariConfig1.addDataSourceProperty("HikariPool-2636", (java.lang.Object) hikariConfig11);
        long long25 = hikariConfig1.getIdleTimeout();
        int int26 = hikariConfig1.getMaximumPoolSize();
        java.lang.String str27 = hikariConfig1.getPoolName();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertNull(dataSource8);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 1800000L + "'", long19 == 1800000L);
// flaky:         org.junit.Assert.assertEquals("'" + str20 + "' != '" + "HikariPool-31824" + "'", str20, "HikariPool-31824");
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 3 + "'", int21 == 3);
        org.junit.Assert.assertTrue("'" + long25 + "' != '" + 600000L + "'", long25 == 600000L);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 60 + "'", int26 == 60);
// flaky:         org.junit.Assert.assertEquals("'" + str27 + "' != '" + "HikariPool-31823" + "'", str27, "HikariPool-31823");
    }

    @Test
    public void test03830() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03830");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        boolean boolean2 = hikariConfig1.isInitializationFailFast();
        hikariConfig1.setInitializationFailFast(true);
        javax.sql.DataSource dataSource5 = null;
        hikariConfig1.setDataSource(dataSource5);
        hikariConfig1.setAcquireRetryDelay((long) 'a');
        java.lang.String str9 = hikariConfig1.getConnectionCustomizerClassName();
        java.lang.String str10 = hikariConfig1.getConnectionInitSql();
        hikariConfig1.setDataSourceClassName("");
        hikariConfig1.setPoolName("HikariPool-627");
        int int15 = hikariConfig1.getMaximumPoolSize();
        java.lang.String str16 = hikariConfig1.getConnectionInitSql();
        int int17 = hikariConfig1.getAcquireRetries();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 60 + "'", int15 == 60);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 3 + "'", int17 == 3);
    }

    @Test
    public void test03831() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03831");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        boolean boolean2 = hikariConfig1.isInitializationFailFast();
        hikariConfig1.setInitializationFailFast(true);
        javax.sql.DataSource dataSource5 = null;
        hikariConfig1.setDataSource(dataSource5);
        hikariConfig1.setAcquireRetryDelay((long) 'a');
        java.lang.String str9 = hikariConfig1.getConnectionCustomizerClassName();
        java.lang.String str10 = hikariConfig1.getConnectionInitSql();
        hikariConfig1.setDataSourceClassName("");
        java.util.Properties properties13 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig14 = new com.zaxxer.hikari.HikariConfig(properties13);
        boolean boolean15 = hikariConfig14.isInitializationFailFast();
        hikariConfig14.setInitializationFailFast(true);
        javax.sql.DataSource dataSource18 = null;
        hikariConfig14.setDataSource(dataSource18);
        hikariConfig14.setAcquireRetryDelay((long) 'a');
        java.lang.String str22 = hikariConfig14.getConnectionCustomizerClassName();
        java.util.Properties properties23 = hikariConfig14.getDataSourceProperties();
        java.util.Properties properties24 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig25 = new com.zaxxer.hikari.HikariConfig(properties24);
        java.util.Properties properties26 = hikariConfig25.getDataSourceProperties();
        hikariConfig14.setDataSourceProperties(properties26);
        hikariConfig1.setDataSourceProperties(properties26);
        hikariConfig1.setUseInstrumentation(true);
        int int31 = hikariConfig1.getTransactionIsolation();
        hikariConfig1.setLeakDetectionThreshold((long) (byte) 0);
        hikariConfig1.setDataSourceClassName("");
        hikariConfig1.setMaxLifetime((long) 1);
        hikariConfig1.setInitializationFailFast(false);
        hikariConfig1.setDataSourceClassName("HikariPool-13543");
        long long42 = hikariConfig1.getLeakDetectionThreshold();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNull(str22);
        org.junit.Assert.assertNotNull(properties23);
        org.junit.Assert.assertNotNull(properties26);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + (-1) + "'", int31 == (-1));
        org.junit.Assert.assertTrue("'" + long42 + "' != '" + 0L + "'", long42 == 0L);
    }

    @Test
    public void test03832() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03832");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        boolean boolean2 = hikariConfig1.isInitializationFailFast();
        hikariConfig1.setInitializationFailFast(true);
        boolean boolean5 = hikariConfig1.isJdbc4ConnectionTest();
        long long6 = hikariConfig1.getConnectionTimeout();
        hikariConfig1.setAcquireIncrement(100);
        hikariConfig1.setTransactionIsolation("hi!");
        int int11 = hikariConfig1.getTransactionIsolation();
        hikariConfig1.setAcquireRetries((int) (byte) 1);
        java.util.Properties properties14 = hikariConfig1.getDataSourceProperties();
        com.zaxxer.hikari.HikariConfig hikariConfig15 = new com.zaxxer.hikari.HikariConfig(properties14);
        int int16 = hikariConfig15.getMinimumPoolSize();
        hikariConfig15.setMinimumPoolSize(0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 5000L + "'", long6 == 5000L);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertNotNull(properties14);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 10 + "'", int16 == 10);
    }

    @Test
    public void test03833() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03833");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        boolean boolean2 = hikariConfig1.isInitializationFailFast();
        boolean boolean3 = hikariConfig1.isJdbc4ConnectionTest();
        hikariConfig1.addDataSourceProperty("", (java.lang.Object) false);
        java.lang.String str7 = hikariConfig1.getConnectionTestQuery();
        hikariConfig1.setLeakDetectionThreshold((long) (byte) 100);
        javax.sql.DataSource dataSource10 = null;
        hikariConfig1.setDataSource(dataSource10);
        hikariConfig1.setMaximumPoolSize(10);
        java.util.Properties properties15 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig16 = new com.zaxxer.hikari.HikariConfig(properties15);
        hikariConfig16.setTransactionIsolation("");
        int int19 = hikariConfig16.getAcquireIncrement();
        long long20 = hikariConfig16.getLeakDetectionThreshold();
        java.util.Properties properties21 = hikariConfig16.getDataSourceProperties();
        hikariConfig1.addDataSourceProperty("HikariPool-5960", (java.lang.Object) hikariConfig16);
        hikariConfig16.setUseInstrumentation(false);
        // The following exception was thrown during execution in test generation
        try {
            hikariConfig16.validate();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: one of either dataSource or dataSourceClassName must be specified");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 0L + "'", long20 == 0L);
        org.junit.Assert.assertNotNull(properties21);
    }

    @Test
    public void test03834() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03834");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        boolean boolean2 = hikariConfig1.isInitializationFailFast();
        hikariConfig1.setInitializationFailFast(true);
        javax.sql.DataSource dataSource5 = null;
        hikariConfig1.setDataSource(dataSource5);
        hikariConfig1.setAcquireRetryDelay((long) 'a');
        java.lang.String str9 = hikariConfig1.getConnectionCustomizerClassName();
        java.util.Properties properties10 = hikariConfig1.getDataSourceProperties();
        java.util.Properties properties11 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig12 = new com.zaxxer.hikari.HikariConfig(properties11);
        boolean boolean13 = hikariConfig12.isInitializationFailFast();
        hikariConfig12.setInitializationFailFast(true);
        javax.sql.DataSource dataSource16 = null;
        hikariConfig12.setDataSource(dataSource16);
        hikariConfig12.setAcquireRetryDelay((long) 'a');
        java.lang.String str20 = hikariConfig12.getConnectionCustomizerClassName();
        java.util.Properties properties21 = hikariConfig12.getDataSourceProperties();
        hikariConfig1.setDataSourceProperties(properties21);
        com.zaxxer.hikari.HikariConfig hikariConfig23 = new com.zaxxer.hikari.HikariConfig(properties21);
        hikariConfig23.setConnectionTimeout((long) (short) 0);
        hikariConfig23.setAcquireRetries((int) ' ');
        boolean boolean28 = hikariConfig23.isAutoCommit();
        java.lang.String str29 = hikariConfig23.getDataSourceClassName();
        long long30 = hikariConfig23.getAcquireRetryDelay();
        java.util.Properties properties31 = hikariConfig23.getDataSourceProperties();
        // The following exception was thrown during execution in test generation
        try {
            hikariConfig23.validate();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: one of either dataSource or dataSourceClassName must be specified");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNotNull(properties10);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNull(str20);
        org.junit.Assert.assertNotNull(properties21);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertNull(str29);
        org.junit.Assert.assertTrue("'" + long30 + "' != '" + 0L + "'", long30 == 0L);
        org.junit.Assert.assertNotNull(properties31);
    }

    @Test
    public void test03835() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03835");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        boolean boolean2 = hikariConfig1.isInitializationFailFast();
        hikariConfig1.setInitializationFailFast(true);
        java.lang.String str5 = hikariConfig1.getConnectionTestQuery();
        boolean boolean6 = hikariConfig1.isRegisterMbeans();
        hikariConfig1.setDataSourceClassName("hi!");
        hikariConfig1.setConnectionInitSql("");
        java.lang.String str11 = hikariConfig1.getCatalog();
        java.util.Properties properties12 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig13 = new com.zaxxer.hikari.HikariConfig(properties12);
        boolean boolean14 = hikariConfig13.isInitializationFailFast();
        hikariConfig13.setInitializationFailFast(true);
        javax.sql.DataSource dataSource17 = null;
        hikariConfig13.setDataSource(dataSource17);
        hikariConfig13.setAcquireRetryDelay((long) 'a');
        java.lang.String str21 = hikariConfig13.getConnectionCustomizerClassName();
        java.util.Properties properties22 = hikariConfig13.getDataSourceProperties();
        java.util.Properties properties23 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig24 = new com.zaxxer.hikari.HikariConfig(properties23);
        boolean boolean25 = hikariConfig24.isInitializationFailFast();
        hikariConfig24.setInitializationFailFast(true);
        javax.sql.DataSource dataSource28 = null;
        hikariConfig24.setDataSource(dataSource28);
        hikariConfig24.setAcquireRetryDelay((long) 'a');
        java.lang.String str32 = hikariConfig24.getConnectionCustomizerClassName();
        java.util.Properties properties33 = hikariConfig24.getDataSourceProperties();
        hikariConfig13.setDataSourceProperties(properties33);
        hikariConfig1.setDataSourceProperties(properties33);
        java.lang.String str36 = hikariConfig1.getConnectionTestQuery();
        int int37 = hikariConfig1.getMinimumPoolSize();
        hikariConfig1.setConnectionInitSql("HikariPool-14195");
        java.util.Properties properties41 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig42 = new com.zaxxer.hikari.HikariConfig(properties41);
        boolean boolean43 = hikariConfig42.isInitializationFailFast();
        hikariConfig42.setInitializationFailFast(true);
        javax.sql.DataSource dataSource46 = null;
        hikariConfig42.setDataSource(dataSource46);
        hikariConfig42.setAcquireRetryDelay((long) 'a');
        java.lang.String str50 = hikariConfig42.getConnectionCustomizerClassName();
        java.util.Properties properties51 = hikariConfig42.getDataSourceProperties();
        hikariConfig42.setAutoCommit(false);
        hikariConfig42.setInitializationFailFast(false);
        int int56 = hikariConfig42.getMaximumPoolSize();
        hikariConfig42.setJdbc4ConnectionTest(false);
        int int59 = hikariConfig42.getMinimumPoolSize();
        boolean boolean60 = hikariConfig42.isRegisterMbeans();
        hikariConfig42.setAcquireRetries((int) (byte) 100);
        hikariConfig1.addDataSourceProperty("HikariPool-9877", (java.lang.Object) (byte) 100);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNull(str21);
        org.junit.Assert.assertNotNull(properties22);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNull(str32);
        org.junit.Assert.assertNotNull(properties33);
        org.junit.Assert.assertNull(str36);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 10 + "'", int37 == 10);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertNull(str50);
        org.junit.Assert.assertNotNull(properties51);
        org.junit.Assert.assertTrue("'" + int56 + "' != '" + 60 + "'", int56 == 60);
        org.junit.Assert.assertTrue("'" + int59 + "' != '" + 10 + "'", int59 == 10);
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + false + "'", boolean60 == false);
    }

    @Test
    public void test03836() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03836");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        boolean boolean2 = hikariConfig1.isInitializationFailFast();
        hikariConfig1.setInitializationFailFast(true);
        hikariConfig1.setAcquireRetryDelay(1L);
        hikariConfig1.setAcquireIncrement((int) 'a');
        long long9 = hikariConfig1.getMaxLifetime();
        int int10 = hikariConfig1.getMaximumPoolSize();
        java.lang.String str11 = hikariConfig1.getConnectionInitSql();
        hikariConfig1.setUseInstrumentation(true);
        hikariConfig1.setConnectionInitSql("HikariPool-9849");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 1800000L + "'", long9 == 1800000L);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 60 + "'", int10 == 60);
        org.junit.Assert.assertNull(str11);
    }

    @Test
    public void test03837() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03837");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        boolean boolean2 = hikariConfig1.isInitializationFailFast();
        hikariConfig1.setInitializationFailFast(true);
        javax.sql.DataSource dataSource5 = null;
        hikariConfig1.setDataSource(dataSource5);
        java.lang.String str7 = hikariConfig1.getCatalog();
        hikariConfig1.setConnectionCustomizerClassName("hi!");
        hikariConfig1.setLeakDetectionThreshold(1L);
        hikariConfig1.setIdleTimeout((long) 100);
        java.util.Properties properties15 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig16 = new com.zaxxer.hikari.HikariConfig(properties15);
        boolean boolean17 = hikariConfig16.isInitializationFailFast();
        hikariConfig16.setInitializationFailFast(true);
        javax.sql.DataSource dataSource20 = null;
        hikariConfig16.setDataSource(dataSource20);
        java.lang.String str22 = hikariConfig16.getCatalog();
        int int23 = hikariConfig16.getMinimumPoolSize();
        java.lang.String str24 = hikariConfig16.getCatalog();
        long long25 = hikariConfig16.getLeakDetectionThreshold();
        hikariConfig16.setJdbc4ConnectionTest(false);
        boolean boolean28 = hikariConfig16.isInitializationFailFast();
        java.util.Properties properties29 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig30 = new com.zaxxer.hikari.HikariConfig(properties29);
        boolean boolean31 = hikariConfig30.isInitializationFailFast();
        hikariConfig30.setInitializationFailFast(true);
        int int34 = hikariConfig30.getAcquireRetries();
        long long35 = hikariConfig30.getMaxLifetime();
        java.util.Properties properties36 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig37 = new com.zaxxer.hikari.HikariConfig(properties36);
        boolean boolean38 = hikariConfig37.isInitializationFailFast();
        javax.sql.DataSource dataSource39 = null;
        hikariConfig37.setDataSource(dataSource39);
        java.util.Properties properties41 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig42 = new com.zaxxer.hikari.HikariConfig(properties41);
        boolean boolean43 = hikariConfig42.isInitializationFailFast();
        hikariConfig42.setInitializationFailFast(true);
        boolean boolean46 = hikariConfig42.isJdbc4ConnectionTest();
        long long47 = hikariConfig42.getConnectionTimeout();
        hikariConfig42.setPoolName("hi!");
        hikariConfig42.setAcquireIncrement((int) (byte) 100);
        java.util.Properties properties52 = hikariConfig42.getDataSourceProperties();
        hikariConfig37.setDataSourceProperties(properties52);
        hikariConfig30.setDataSourceProperties(properties52);
        com.zaxxer.hikari.HikariConfig hikariConfig55 = new com.zaxxer.hikari.HikariConfig(properties52);
        com.zaxxer.hikari.HikariConfig hikariConfig56 = new com.zaxxer.hikari.HikariConfig(properties52);
        hikariConfig16.setDataSourceProperties(properties52);
        int int58 = hikariConfig16.getMaximumPoolSize();
        hikariConfig1.addDataSourceProperty("HikariPool-414", (java.lang.Object) int58);
        java.lang.String str60 = hikariConfig1.getConnectionInitSql();
        boolean boolean61 = hikariConfig1.isInitializationFailFast();
        // The following exception was thrown during execution in test generation
        try {
            hikariConfig1.validate();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: one of either dataSource or dataSourceClassName must be specified");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNull(str22);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 10 + "'", int23 == 10);
        org.junit.Assert.assertNull(str24);
        org.junit.Assert.assertTrue("'" + long25 + "' != '" + 0L + "'", long25 == 0L);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 3 + "'", int34 == 3);
        org.junit.Assert.assertTrue("'" + long35 + "' != '" + 1800000L + "'", long35 == 1800000L);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + true + "'", boolean46 == true);
        org.junit.Assert.assertTrue("'" + long47 + "' != '" + 5000L + "'", long47 == 5000L);
        org.junit.Assert.assertNotNull(properties52);
        org.junit.Assert.assertTrue("'" + int58 + "' != '" + 60 + "'", int58 == 60);
        org.junit.Assert.assertNull(str60);
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + true + "'", boolean61 == true);
    }

    @Test
    public void test03838() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03838");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        boolean boolean2 = hikariConfig1.isInitializationFailFast();
        boolean boolean3 = hikariConfig1.isJdbc4ConnectionTest();
        long long4 = hikariConfig1.getConnectionTimeout();
        int int5 = hikariConfig1.getTransactionIsolation();
        hikariConfig1.setLeakDetectionThreshold(600000L);
        hikariConfig1.setLeakDetectionThreshold(1L);
        boolean boolean10 = hikariConfig1.isAutoCommit();
        hikariConfig1.setInitializationFailFast(false);
        long long13 = hikariConfig1.getAcquireRetryDelay();
        hikariConfig1.setJdbc4ConnectionTest(false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 5000L + "'", long4 == 5000L);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 0L + "'", long13 == 0L);
    }

    @Test
    public void test03839() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03839");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        boolean boolean2 = hikariConfig1.isInitializationFailFast();
        hikariConfig1.setInitializationFailFast(true);
        int int5 = hikariConfig1.getAcquireRetries();
        long long6 = hikariConfig1.getMaxLifetime();
        hikariConfig1.setMaxLifetime((long) (short) 0);
        hikariConfig1.setRegisterMbeans(false);
        hikariConfig1.setConnectionTimeout(5000L);
        long long13 = hikariConfig1.getMaxLifetime();
        hikariConfig1.setIdleTimeout((long) 10);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 3 + "'", int5 == 3);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 1800000L + "'", long6 == 1800000L);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 0L + "'", long13 == 0L);
    }

    @Test
    public void test03840() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03840");
        // The following exception was thrown during execution in test generation
        try {
            com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig("HikariPool-2426");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Property file HikariPool-2426 was not found.");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test03841() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03841");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        hikariConfig1.setConnectionInitSql("");
        java.lang.String str4 = hikariConfig1.getPoolName();
        long long5 = hikariConfig1.getMaxLifetime();
        java.lang.String str6 = hikariConfig1.getPoolName();
// flaky:         org.junit.Assert.assertEquals("'" + str4 + "' != '" + "HikariPool-31883" + "'", str4, "HikariPool-31883");
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 1800000L + "'", long5 == 1800000L);
// flaky:         org.junit.Assert.assertEquals("'" + str6 + "' != '" + "HikariPool-31883" + "'", str6, "HikariPool-31883");
    }

    @Test
    public void test03842() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03842");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        boolean boolean2 = hikariConfig1.isInitializationFailFast();
        hikariConfig1.setInitializationFailFast(true);
        javax.sql.DataSource dataSource5 = null;
        hikariConfig1.setDataSource(dataSource5);
        java.lang.String str7 = hikariConfig1.getCatalog();
        javax.sql.DataSource dataSource8 = null;
        hikariConfig1.setDataSource(dataSource8);
        int int10 = hikariConfig1.getMaximumPoolSize();
        boolean boolean11 = hikariConfig1.isAutoCommit();
        hikariConfig1.setConnectionTimeout(1800000L);
        java.lang.String str14 = hikariConfig1.getConnectionCustomizerClassName();
        int int15 = hikariConfig1.getAcquireIncrement();
        hikariConfig1.setPoolName("HikariPool-1450");
        java.lang.String str18 = hikariConfig1.getConnectionInitSql();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 60 + "'", int10 == 60);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertNull(str18);
    }

    @Test
    public void test03843() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03843");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        boolean boolean2 = hikariConfig1.isInitializationFailFast();
        hikariConfig1.setInitializationFailFast(true);
        java.lang.String str5 = hikariConfig1.getConnectionTestQuery();
        boolean boolean6 = hikariConfig1.isRegisterMbeans();
        hikariConfig1.setDataSourceClassName("hi!");
        hikariConfig1.setConnectionInitSql("");
        java.lang.String str11 = hikariConfig1.getCatalog();
        java.util.Properties properties12 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig13 = new com.zaxxer.hikari.HikariConfig(properties12);
        boolean boolean14 = hikariConfig13.isInitializationFailFast();
        hikariConfig13.setInitializationFailFast(true);
        javax.sql.DataSource dataSource17 = null;
        hikariConfig13.setDataSource(dataSource17);
        hikariConfig13.setAcquireRetryDelay((long) 'a');
        java.lang.String str21 = hikariConfig13.getConnectionCustomizerClassName();
        java.util.Properties properties22 = hikariConfig13.getDataSourceProperties();
        java.util.Properties properties23 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig24 = new com.zaxxer.hikari.HikariConfig(properties23);
        boolean boolean25 = hikariConfig24.isInitializationFailFast();
        hikariConfig24.setInitializationFailFast(true);
        javax.sql.DataSource dataSource28 = null;
        hikariConfig24.setDataSource(dataSource28);
        hikariConfig24.setAcquireRetryDelay((long) 'a');
        java.lang.String str32 = hikariConfig24.getConnectionCustomizerClassName();
        java.util.Properties properties33 = hikariConfig24.getDataSourceProperties();
        hikariConfig13.setDataSourceProperties(properties33);
        hikariConfig1.setDataSourceProperties(properties33);
        com.zaxxer.hikari.HikariConfig hikariConfig36 = new com.zaxxer.hikari.HikariConfig(properties33);
        boolean boolean37 = hikariConfig36.isJdbc4ConnectionTest();
        hikariConfig36.setTransactionIsolation("HikariPool-700");
        java.lang.String str40 = hikariConfig36.getConnectionInitSql();
        long long41 = hikariConfig36.getIdleTimeout();
        long long42 = hikariConfig36.getLeakDetectionThreshold();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNull(str21);
        org.junit.Assert.assertNotNull(properties22);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNull(str32);
        org.junit.Assert.assertNotNull(properties33);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + true + "'", boolean37 == true);
        org.junit.Assert.assertNull(str40);
        org.junit.Assert.assertTrue("'" + long41 + "' != '" + 600000L + "'", long41 == 600000L);
        org.junit.Assert.assertTrue("'" + long42 + "' != '" + 0L + "'", long42 == 0L);
    }

    @Test
    public void test03844() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03844");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        boolean boolean2 = hikariConfig1.isInitializationFailFast();
        hikariConfig1.setInitializationFailFast(true);
        hikariConfig1.setAcquireRetryDelay(1L);
        hikariConfig1.setAcquireIncrement((int) (byte) 100);
        int int9 = hikariConfig1.getTransactionIsolation();
        javax.sql.DataSource dataSource10 = null;
        hikariConfig1.setDataSource(dataSource10);
        hikariConfig1.setJdbc4ConnectionTest(false);
        hikariConfig1.setMaxLifetime((long) (short) 1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
    }

    @Test
    public void test03845() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03845");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        boolean boolean2 = hikariConfig1.isInitializationFailFast();
        hikariConfig1.setInitializationFailFast(true);
        javax.sql.DataSource dataSource5 = null;
        hikariConfig1.setDataSource(dataSource5);
        hikariConfig1.setAcquireRetryDelay((long) 'a');
        java.lang.String str9 = hikariConfig1.getConnectionCustomizerClassName();
        java.util.Properties properties10 = hikariConfig1.getDataSourceProperties();
        hikariConfig1.setAutoCommit(false);
        int int13 = hikariConfig1.getTransactionIsolation();
        boolean boolean14 = hikariConfig1.isRegisterMbeans();
        hikariConfig1.setJdbc4ConnectionTest(true);
        javax.sql.DataSource dataSource17 = hikariConfig1.getDataSource();
        hikariConfig1.setMaximumPoolSize(1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNotNull(properties10);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNull(dataSource17);
    }

    @Test
    public void test03846() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03846");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        boolean boolean2 = hikariConfig1.isInitializationFailFast();
        hikariConfig1.setInitializationFailFast(true);
        boolean boolean5 = hikariConfig1.isJdbc4ConnectionTest();
        java.lang.String str6 = hikariConfig1.getDataSourceClassName();
        long long7 = hikariConfig1.getConnectionTimeout();
        hikariConfig1.setConnectionTestQuery("HikariPool-700");
        long long10 = hikariConfig1.getConnectionTimeout();
        // The following exception was thrown during execution in test generation
        try {
            hikariConfig1.setConnectionTimeout(32L);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: connectionTimeout cannot be less than 100ms");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 5000L + "'", long7 == 5000L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 5000L + "'", long10 == 5000L);
    }

    @Test
    public void test03847() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03847");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        boolean boolean2 = hikariConfig1.isInitializationFailFast();
        hikariConfig1.setInitializationFailFast(true);
        javax.sql.DataSource dataSource5 = null;
        hikariConfig1.setDataSource(dataSource5);
        hikariConfig1.setAcquireRetryDelay((long) 'a');
        java.lang.String str9 = hikariConfig1.getConnectionCustomizerClassName();
        java.util.Properties properties10 = hikariConfig1.getDataSourceProperties();
        java.util.Properties properties11 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig12 = new com.zaxxer.hikari.HikariConfig(properties11);
        boolean boolean13 = hikariConfig12.isInitializationFailFast();
        hikariConfig12.setInitializationFailFast(true);
        javax.sql.DataSource dataSource16 = null;
        hikariConfig12.setDataSource(dataSource16);
        hikariConfig12.setAcquireRetryDelay((long) 'a');
        java.lang.String str20 = hikariConfig12.getConnectionCustomizerClassName();
        java.util.Properties properties21 = hikariConfig12.getDataSourceProperties();
        hikariConfig1.setDataSourceProperties(properties21);
        com.zaxxer.hikari.HikariConfig hikariConfig23 = new com.zaxxer.hikari.HikariConfig(properties21);
        int int24 = hikariConfig23.getTransactionIsolation();
        boolean boolean25 = hikariConfig23.isAutoCommit();
        int int26 = hikariConfig23.getMinimumPoolSize();
        boolean boolean27 = hikariConfig23.isRegisterMbeans();
        boolean boolean28 = hikariConfig23.isInitializationFailFast();
        long long29 = hikariConfig23.getLeakDetectionThreshold();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNotNull(properties10);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNull(str20);
        org.junit.Assert.assertNotNull(properties21);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-1) + "'", int24 == (-1));
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 10 + "'", int26 == 10);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + long29 + "' != '" + 0L + "'", long29 == 0L);
    }

    @Test
    public void test03848() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03848");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        boolean boolean2 = hikariConfig1.isInitializationFailFast();
        boolean boolean3 = hikariConfig1.isJdbc4ConnectionTest();
        javax.sql.DataSource dataSource4 = null;
        hikariConfig1.setDataSource(dataSource4);
        long long6 = hikariConfig1.getIdleTimeout();
        hikariConfig1.setConnectionCustomizerClassName("HikariPool-184");
        long long9 = hikariConfig1.getIdleTimeout();
        javax.sql.DataSource dataSource10 = null;
        hikariConfig1.setDataSource(dataSource10);
        java.util.Properties properties12 = hikariConfig1.getDataSourceProperties();
        hikariConfig1.setInitializationFailFast(false);
        java.lang.String str15 = hikariConfig1.getDataSourceClassName();
        hikariConfig1.setRegisterMbeans(true);
        java.lang.String str18 = hikariConfig1.getPoolName();
        java.lang.String str19 = hikariConfig1.getCatalog();
        java.lang.String str20 = hikariConfig1.getConnectionInitSql();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 600000L + "'", long6 == 600000L);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 600000L + "'", long9 == 600000L);
        org.junit.Assert.assertNotNull(properties12);
        org.junit.Assert.assertNull(str15);
// flaky:         org.junit.Assert.assertEquals("'" + str18 + "' != '" + "HikariPool-31913" + "'", str18, "HikariPool-31913");
        org.junit.Assert.assertNull(str19);
        org.junit.Assert.assertNull(str20);
    }

    @Test
    public void test03849() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03849");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        boolean boolean2 = hikariConfig1.isInitializationFailFast();
        hikariConfig1.setInitializationFailFast(true);
        javax.sql.DataSource dataSource5 = null;
        hikariConfig1.setDataSource(dataSource5);
        java.lang.String str7 = hikariConfig1.getCatalog();
        javax.sql.DataSource dataSource8 = null;
        hikariConfig1.setDataSource(dataSource8);
        int int10 = hikariConfig1.getMaximumPoolSize();
        boolean boolean11 = hikariConfig1.isAutoCommit();
        hikariConfig1.setConnectionTimeout(1800000L);
        java.lang.String str14 = hikariConfig1.getConnectionCustomizerClassName();
        hikariConfig1.setAcquireRetryDelay(5000L);
        hikariConfig1.setMinimumPoolSize(100);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 60 + "'", int10 == 60);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNull(str14);
    }

    @Test
    public void test03850() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03850");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        boolean boolean2 = hikariConfig1.isInitializationFailFast();
        hikariConfig1.setLeakDetectionThreshold((long) '4');
        java.lang.String str5 = hikariConfig1.getConnectionCustomizerClassName();
        java.util.Properties properties6 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig7 = new com.zaxxer.hikari.HikariConfig(properties6);
        boolean boolean8 = hikariConfig7.isInitializationFailFast();
        hikariConfig7.setInitializationFailFast(true);
        javax.sql.DataSource dataSource11 = null;
        hikariConfig7.setDataSource(dataSource11);
        hikariConfig7.setAcquireRetryDelay((long) 'a');
        java.lang.String str15 = hikariConfig7.getConnectionCustomizerClassName();
        java.util.Properties properties16 = hikariConfig7.getDataSourceProperties();
        java.util.Properties properties17 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig18 = new com.zaxxer.hikari.HikariConfig(properties17);
        java.util.Properties properties19 = hikariConfig18.getDataSourceProperties();
        hikariConfig7.setDataSourceProperties(properties19);
        hikariConfig1.setDataSourceProperties(properties19);
        java.lang.String str22 = hikariConfig1.getDataSourceClassName();
        hikariConfig1.setInitializationFailFast(true);
        hikariConfig1.setDataSourceClassName("HikariPool-481");
        hikariConfig1.setInitializationFailFast(true);
        boolean boolean29 = hikariConfig1.isAutoCommit();
        java.lang.String str30 = hikariConfig1.getConnectionCustomizerClassName();
        hikariConfig1.setAutoCommit(true);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertNotNull(properties16);
        org.junit.Assert.assertNotNull(properties19);
        org.junit.Assert.assertNull(str22);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertNull(str30);
    }

    @Test
    public void test03851() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03851");
        // The following exception was thrown during execution in test generation
        try {
            com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig("HikariPool-20005");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Property file HikariPool-20005 was not found.");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test03852() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03852");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        boolean boolean2 = hikariConfig1.isInitializationFailFast();
        hikariConfig1.setLeakDetectionThreshold((long) '4');
        java.lang.String str5 = hikariConfig1.getConnectionTestQuery();
        hikariConfig1.setTransactionIsolation("HikariPool-393");
        boolean boolean8 = hikariConfig1.isAutoCommit();
        int int9 = hikariConfig1.getMinimumPoolSize();
        int int10 = hikariConfig1.getMinimumPoolSize();
        hikariConfig1.setDataSourceClassName("HikariPool-2681");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 10 + "'", int9 == 10);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 10 + "'", int10 == 10);
    }

    @Test
    public void test03853() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03853");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        java.util.Properties properties2 = hikariConfig1.getDataSourceProperties();
        long long3 = hikariConfig1.getAcquireRetryDelay();
        java.lang.String str4 = hikariConfig1.getCatalog();
        int int5 = hikariConfig1.getTransactionIsolation();
        hikariConfig1.setPoolName("HikariPool-8073");
        java.lang.String str8 = hikariConfig1.getCatalog();
        java.util.Properties properties10 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig11 = new com.zaxxer.hikari.HikariConfig(properties10);
        boolean boolean12 = hikariConfig11.isInitializationFailFast();
        hikariConfig11.setInitializationFailFast(true);
        boolean boolean15 = hikariConfig11.isJdbc4ConnectionTest();
        hikariConfig11.setConnectionTestQuery("HikariPool-143");
        hikariConfig11.setMaxLifetime((long) (byte) 1);
        hikariConfig11.setMaxLifetime(60L);
        hikariConfig11.setMinimumPoolSize((int) (short) 100);
        hikariConfig1.addDataSourceProperty("HikariPool-4367", (java.lang.Object) (short) 100);
        int int25 = hikariConfig1.getMaximumPoolSize();
        java.lang.String str26 = hikariConfig1.getDataSourceClassName();
        org.junit.Assert.assertNotNull(properties2);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 60 + "'", int25 == 60);
        org.junit.Assert.assertNull(str26);
    }

    @Test
    public void test03854() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03854");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        boolean boolean2 = hikariConfig1.isInitializationFailFast();
        hikariConfig1.setInitializationFailFast(true);
        java.lang.String str5 = hikariConfig1.getConnectionTestQuery();
        hikariConfig1.setConnectionCustomizerClassName("");
        java.lang.String str8 = hikariConfig1.getConnectionInitSql();
        java.util.Properties properties10 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig11 = new com.zaxxer.hikari.HikariConfig(properties10);
        boolean boolean12 = hikariConfig11.isInitializationFailFast();
        hikariConfig11.setLeakDetectionThreshold((long) '4');
        int int15 = hikariConfig11.getTransactionIsolation();
        hikariConfig11.setMaximumPoolSize((int) (short) 100);
        java.lang.Class<?> wildcardClass18 = hikariConfig11.getClass();
        hikariConfig1.addDataSourceProperty("HikariPool-674", (java.lang.Object) hikariConfig11);
        javax.sql.DataSource dataSource20 = null;
        hikariConfig1.setDataSource(dataSource20);
        hikariConfig1.setConnectionCustomizerClassName("");
        javax.sql.DataSource dataSource24 = hikariConfig1.getDataSource();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass18);
        org.junit.Assert.assertNull(dataSource24);
    }

    @Test
    public void test03855() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03855");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        boolean boolean2 = hikariConfig1.isInitializationFailFast();
        hikariConfig1.setInitializationFailFast(true);
        java.lang.String str5 = hikariConfig1.getConnectionTestQuery();
        hikariConfig1.setConnectionCustomizerClassName("");
        java.util.Properties properties8 = hikariConfig1.getDataSourceProperties();
        int int9 = hikariConfig1.getAcquireRetries();
        boolean boolean10 = hikariConfig1.isRegisterMbeans();
        long long11 = hikariConfig1.getConnectionTimeout();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(properties8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 3 + "'", int9 == 3);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 5000L + "'", long11 == 5000L);
    }

    @Test
    public void test03856() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03856");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        boolean boolean2 = hikariConfig1.isInitializationFailFast();
        boolean boolean3 = hikariConfig1.isJdbc4ConnectionTest();
        hikariConfig1.setDataSourceClassName("hi!");
        java.util.Properties properties7 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig8 = new com.zaxxer.hikari.HikariConfig(properties7);
        boolean boolean9 = hikariConfig8.isInitializationFailFast();
        hikariConfig8.setInitializationFailFast(true);
        javax.sql.DataSource dataSource12 = null;
        hikariConfig8.setDataSource(dataSource12);
        hikariConfig8.setAcquireRetryDelay((long) 'a');
        java.lang.String str16 = hikariConfig8.getConnectionCustomizerClassName();
        java.util.Properties properties17 = hikariConfig8.getDataSourceProperties();
        hikariConfig8.setAutoCommit(false);
        hikariConfig8.setInitializationFailFast(false);
        int int22 = hikariConfig8.getMaximumPoolSize();
        boolean boolean23 = hikariConfig8.isRegisterMbeans();
        hikariConfig1.addDataSourceProperty("HikariPool-587", (java.lang.Object) boolean23);
        boolean boolean25 = hikariConfig1.isRegisterMbeans();
        long long26 = hikariConfig1.getIdleTimeout();
        hikariConfig1.setUseInstrumentation(false);
        long long29 = hikariConfig1.getAcquireRetryDelay();
        int int30 = hikariConfig1.getAcquireRetries();
        hikariConfig1.setUseInstrumentation(false);
        java.lang.String str33 = hikariConfig1.getDataSourceClassName();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertNotNull(properties17);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 60 + "'", int22 == 60);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + long26 + "' != '" + 600000L + "'", long26 == 600000L);
        org.junit.Assert.assertTrue("'" + long29 + "' != '" + 0L + "'", long29 == 0L);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 3 + "'", int30 == 3);
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "hi!" + "'", str33, "hi!");
    }

    @Test
    public void test03857() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03857");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        boolean boolean2 = hikariConfig1.isInitializationFailFast();
        hikariConfig1.setInitializationFailFast(true);
        int int5 = hikariConfig1.getAcquireRetries();
        long long6 = hikariConfig1.getMaxLifetime();
        hikariConfig1.setMaxLifetime((long) (short) 0);
        hikariConfig1.setJdbc4ConnectionTest(false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 3 + "'", int5 == 3);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 1800000L + "'", long6 == 1800000L);
    }

    @Test
    public void test03858() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03858");
        // The following exception was thrown during execution in test generation
        try {
            com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig("HikariPool-28719");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Property file HikariPool-28719 was not found.");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test03859() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03859");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        hikariConfig1.setConnectionInitSql("");
        long long4 = hikariConfig1.getIdleTimeout();
        hikariConfig1.setLeakDetectionThreshold((long) 60);
        boolean boolean7 = hikariConfig1.isAutoCommit();
        boolean boolean8 = hikariConfig1.isJdbc4ConnectionTest();
        hikariConfig1.setConnectionCustomizerClassName("");
        hikariConfig1.setAcquireRetries(60);
        java.lang.String str13 = hikariConfig1.getConnectionTestQuery();
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 600000L + "'", long4 == 600000L);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNull(str13);
    }

    @Test
    public void test03860() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03860");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        boolean boolean2 = hikariConfig1.isInitializationFailFast();
        hikariConfig1.setInitializationFailFast(true);
        javax.sql.DataSource dataSource5 = null;
        hikariConfig1.setDataSource(dataSource5);
        hikariConfig1.setAcquireRetryDelay((long) 'a');
        java.lang.String str9 = hikariConfig1.getConnectionCustomizerClassName();
        java.lang.String str10 = hikariConfig1.getConnectionInitSql();
        hikariConfig1.setDataSourceClassName("");
        java.util.Properties properties13 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig14 = new com.zaxxer.hikari.HikariConfig(properties13);
        boolean boolean15 = hikariConfig14.isInitializationFailFast();
        hikariConfig14.setInitializationFailFast(true);
        javax.sql.DataSource dataSource18 = null;
        hikariConfig14.setDataSource(dataSource18);
        hikariConfig14.setAcquireRetryDelay((long) 'a');
        java.lang.String str22 = hikariConfig14.getConnectionCustomizerClassName();
        java.util.Properties properties23 = hikariConfig14.getDataSourceProperties();
        java.util.Properties properties24 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig25 = new com.zaxxer.hikari.HikariConfig(properties24);
        java.util.Properties properties26 = hikariConfig25.getDataSourceProperties();
        hikariConfig14.setDataSourceProperties(properties26);
        hikariConfig1.setDataSourceProperties(properties26);
        long long29 = hikariConfig1.getConnectionTimeout();
        hikariConfig1.setInitializationFailFast(true);
        boolean boolean32 = hikariConfig1.isRegisterMbeans();
        java.lang.String str33 = hikariConfig1.getConnectionTestQuery();
        int int34 = hikariConfig1.getMinimumPoolSize();
        java.lang.String str35 = hikariConfig1.getConnectionInitSql();
        long long36 = hikariConfig1.getLeakDetectionThreshold();
        hikariConfig1.setCatalog("HikariPool-4554");
        long long39 = hikariConfig1.getLeakDetectionThreshold();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNull(str22);
        org.junit.Assert.assertNotNull(properties23);
        org.junit.Assert.assertNotNull(properties26);
        org.junit.Assert.assertTrue("'" + long29 + "' != '" + 5000L + "'", long29 == 5000L);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertNull(str33);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 10 + "'", int34 == 10);
        org.junit.Assert.assertNull(str35);
        org.junit.Assert.assertTrue("'" + long36 + "' != '" + 0L + "'", long36 == 0L);
        org.junit.Assert.assertTrue("'" + long39 + "' != '" + 0L + "'", long39 == 0L);
    }

    @Test
    public void test03861() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03861");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        boolean boolean2 = hikariConfig1.isInitializationFailFast();
        hikariConfig1.setInitializationFailFast(true);
        javax.sql.DataSource dataSource5 = null;
        hikariConfig1.setDataSource(dataSource5);
        java.lang.String str7 = hikariConfig1.getCatalog();
        int int8 = hikariConfig1.getMinimumPoolSize();
        java.lang.String str9 = hikariConfig1.getCatalog();
        long long10 = hikariConfig1.getLeakDetectionThreshold();
        hikariConfig1.setJdbc4ConnectionTest(false);
        boolean boolean13 = hikariConfig1.isInitializationFailFast();
        hikariConfig1.setInitializationFailFast(true);
        boolean boolean16 = hikariConfig1.isAutoCommit();
        boolean boolean17 = hikariConfig1.isInitializationFailFast();
        hikariConfig1.setAcquireRetries(100);
        hikariConfig1.addDataSourceProperty("HikariPool-1009", (java.lang.Object) "HikariPool-963");
        hikariConfig1.setInitializationFailFast(true);
        hikariConfig1.setUseInstrumentation(false);
        // The following exception was thrown during execution in test generation
        try {
            hikariConfig1.setMinimumPoolSize((-1));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: minPoolSize cannot be negative");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 10 + "'", int8 == 10);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
    }

    @Test
    public void test03862() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03862");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        boolean boolean2 = hikariConfig1.isInitializationFailFast();
        hikariConfig1.setInitializationFailFast(true);
        javax.sql.DataSource dataSource5 = null;
        hikariConfig1.setDataSource(dataSource5);
        hikariConfig1.setAcquireRetryDelay((long) 'a');
        java.lang.String str9 = hikariConfig1.getConnectionCustomizerClassName();
        int int10 = hikariConfig1.getAcquireRetries();
        boolean boolean11 = hikariConfig1.isInitializationFailFast();
        hikariConfig1.setMinimumPoolSize(3);
        hikariConfig1.setAcquireIncrement(100);
        java.util.Properties properties16 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig17 = new com.zaxxer.hikari.HikariConfig(properties16);
        boolean boolean18 = hikariConfig17.isInitializationFailFast();
        hikariConfig17.setInitializationFailFast(true);
        javax.sql.DataSource dataSource21 = null;
        hikariConfig17.setDataSource(dataSource21);
        hikariConfig17.setAcquireRetryDelay((long) 'a');
        java.lang.String str25 = hikariConfig17.getConnectionCustomizerClassName();
        java.lang.String str26 = hikariConfig17.getConnectionInitSql();
        hikariConfig17.setDataSourceClassName("");
        java.util.Properties properties29 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig30 = new com.zaxxer.hikari.HikariConfig(properties29);
        boolean boolean31 = hikariConfig30.isInitializationFailFast();
        hikariConfig30.setInitializationFailFast(true);
        javax.sql.DataSource dataSource34 = null;
        hikariConfig30.setDataSource(dataSource34);
        hikariConfig30.setAcquireRetryDelay((long) 'a');
        java.lang.String str38 = hikariConfig30.getConnectionCustomizerClassName();
        java.util.Properties properties39 = hikariConfig30.getDataSourceProperties();
        java.util.Properties properties40 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig41 = new com.zaxxer.hikari.HikariConfig(properties40);
        java.util.Properties properties42 = hikariConfig41.getDataSourceProperties();
        hikariConfig30.setDataSourceProperties(properties42);
        hikariConfig17.setDataSourceProperties(properties42);
        com.zaxxer.hikari.HikariConfig hikariConfig45 = new com.zaxxer.hikari.HikariConfig(properties42);
        hikariConfig1.setDataSourceProperties(properties42);
        hikariConfig1.setJdbc4ConnectionTest(false);
        hikariConfig1.setConnectionInitSql("HikariPool-6283");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 3 + "'", int10 == 3);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNull(str25);
        org.junit.Assert.assertNull(str26);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertNull(str38);
        org.junit.Assert.assertNotNull(properties39);
        org.junit.Assert.assertNotNull(properties42);
    }

    @Test
    public void test03863() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03863");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        boolean boolean2 = hikariConfig1.isInitializationFailFast();
        hikariConfig1.setInitializationFailFast(true);
        javax.sql.DataSource dataSource5 = null;
        hikariConfig1.setDataSource(dataSource5);
        hikariConfig1.setAcquireRetryDelay((long) 'a');
        java.lang.String str9 = hikariConfig1.getConnectionCustomizerClassName();
        java.util.Properties properties10 = hikariConfig1.getDataSourceProperties();
        com.zaxxer.hikari.HikariConfig hikariConfig11 = new com.zaxxer.hikari.HikariConfig(properties10);
        hikariConfig11.setIdleTimeout((long) '4');
        hikariConfig11.setJdbc4ConnectionTest(true);
        hikariConfig11.setAcquireIncrement((int) (short) -1);
        boolean boolean18 = hikariConfig11.isRegisterMbeans();
        int int19 = hikariConfig11.getAcquireIncrement();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNotNull(properties10);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
    }

    @Test
    public void test03864() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03864");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        boolean boolean2 = hikariConfig1.isInitializationFailFast();
        boolean boolean3 = hikariConfig1.isJdbc4ConnectionTest();
        hikariConfig1.addDataSourceProperty("", (java.lang.Object) false);
        java.lang.String str7 = hikariConfig1.getConnectionTestQuery();
        hikariConfig1.setLeakDetectionThreshold((long) (byte) 100);
        java.lang.String str10 = hikariConfig1.getConnectionCustomizerClassName();
        hikariConfig1.setRegisterMbeans(true);
        boolean boolean13 = hikariConfig1.isAutoCommit();
        java.lang.Class<?> wildcardClass14 = hikariConfig1.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test03865() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03865");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        boolean boolean2 = hikariConfig1.isInitializationFailFast();
        hikariConfig1.setInitializationFailFast(true);
        javax.sql.DataSource dataSource5 = null;
        hikariConfig1.setDataSource(dataSource5);
        hikariConfig1.setAcquireRetryDelay((long) 'a');
        java.lang.String str9 = hikariConfig1.getConnectionCustomizerClassName();
        java.util.Properties properties10 = hikariConfig1.getDataSourceProperties();
        java.util.Properties properties11 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig12 = new com.zaxxer.hikari.HikariConfig(properties11);
        java.util.Properties properties13 = hikariConfig12.getDataSourceProperties();
        hikariConfig1.setDataSourceProperties(properties13);
        int int15 = hikariConfig1.getMinimumPoolSize();
        java.lang.String str16 = hikariConfig1.getDataSourceClassName();
        hikariConfig1.setConnectionCustomizerClassName("");
        int int19 = hikariConfig1.getMinimumPoolSize();
        java.lang.String str20 = hikariConfig1.getConnectionTestQuery();
        hikariConfig1.setPoolName("HikariPool-1195");
        hikariConfig1.setConnectionInitSql("HikariPool-477");
        hikariConfig1.setConnectionInitSql("HikariPool-13739");
        java.util.Properties properties28 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig29 = new com.zaxxer.hikari.HikariConfig(properties28);
        boolean boolean30 = hikariConfig29.isInitializationFailFast();
        hikariConfig29.setInitializationFailFast(true);
        boolean boolean33 = hikariConfig29.isJdbc4ConnectionTest();
        long long34 = hikariConfig29.getConnectionTimeout();
        hikariConfig29.setAcquireIncrement(100);
        hikariConfig29.setTransactionIsolation("hi!");
        int int39 = hikariConfig29.getTransactionIsolation();
        hikariConfig29.setAcquireRetries((int) (byte) 1);
        int int42 = hikariConfig29.getMinimumPoolSize();
        long long43 = hikariConfig29.getLeakDetectionThreshold();
        java.util.Properties properties44 = hikariConfig29.getDataSourceProperties();
        hikariConfig29.setCatalog("HikariPool-12112");
        hikariConfig1.addDataSourceProperty("HikariPool-25793", (java.lang.Object) "HikariPool-12112");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNotNull(properties10);
        org.junit.Assert.assertNotNull(properties13);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 10 + "'", int15 == 10);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 10 + "'", int19 == 10);
        org.junit.Assert.assertNull(str20);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + true + "'", boolean33 == true);
        org.junit.Assert.assertTrue("'" + long34 + "' != '" + 5000L + "'", long34 == 5000L);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + (-1) + "'", int39 == (-1));
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 10 + "'", int42 == 10);
        org.junit.Assert.assertTrue("'" + long43 + "' != '" + 0L + "'", long43 == 0L);
        org.junit.Assert.assertNotNull(properties44);
    }

    @Test
    public void test03866() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03866");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        boolean boolean2 = hikariConfig1.isInitializationFailFast();
        hikariConfig1.setInitializationFailFast(true);
        javax.sql.DataSource dataSource5 = null;
        hikariConfig1.setDataSource(dataSource5);
        hikariConfig1.setCatalog("");
        hikariConfig1.setConnectionTestQuery("");
        hikariConfig1.setAcquireRetries((int) (byte) 0);
        hikariConfig1.setInitializationFailFast(false);
        hikariConfig1.setMaxLifetime(5000L);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test03867() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03867");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        boolean boolean2 = hikariConfig1.isInitializationFailFast();
        hikariConfig1.setInitializationFailFast(true);
        javax.sql.DataSource dataSource5 = null;
        hikariConfig1.setDataSource(dataSource5);
        java.lang.String str7 = hikariConfig1.getCatalog();
        int int8 = hikariConfig1.getMinimumPoolSize();
        hikariConfig1.setUseInstrumentation(false);
        boolean boolean11 = hikariConfig1.isAutoCommit();
        hikariConfig1.setAcquireRetries((int) (byte) 0);
        boolean boolean14 = hikariConfig1.isJdbc4ConnectionTest();
        hikariConfig1.setLeakDetectionThreshold((long) (short) 0);
        javax.sql.DataSource dataSource17 = hikariConfig1.getDataSource();
        hikariConfig1.setTransactionIsolation("HikariPool-20356");
        hikariConfig1.setIdleTimeout(5000L);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 10 + "'", int8 == 10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNull(dataSource17);
    }

    @Test
    public void test03868() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03868");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        boolean boolean2 = hikariConfig1.isInitializationFailFast();
        hikariConfig1.setInitializationFailFast(true);
        javax.sql.DataSource dataSource5 = null;
        hikariConfig1.setDataSource(dataSource5);
        java.lang.String str7 = hikariConfig1.getCatalog();
        int int8 = hikariConfig1.getTransactionIsolation();
        int int9 = hikariConfig1.getMaximumPoolSize();
        hikariConfig1.setInitializationFailFast(true);
        boolean boolean12 = hikariConfig1.isInitializationFailFast();
        int int13 = hikariConfig1.getMinimumPoolSize();
        hikariConfig1.setConnectionInitSql("HikariPool-8181");
        boolean boolean16 = hikariConfig1.isAutoCommit();
        java.lang.String str17 = hikariConfig1.getCatalog();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 60 + "'", int9 == 60);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 10 + "'", int13 == 10);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertNull(str17);
    }

    @Test
    public void test03869() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03869");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        boolean boolean2 = hikariConfig1.isInitializationFailFast();
        hikariConfig1.setInitializationFailFast(true);
        javax.sql.DataSource dataSource5 = null;
        hikariConfig1.setDataSource(dataSource5);
        java.lang.String str7 = hikariConfig1.getCatalog();
        int int8 = hikariConfig1.getMinimumPoolSize();
        boolean boolean9 = hikariConfig1.isInitializationFailFast();
        hikariConfig1.setConnectionCustomizerClassName("HikariPool-1195");
        javax.sql.DataSource dataSource12 = null;
        hikariConfig1.setDataSource(dataSource12);
        int int14 = hikariConfig1.getAcquireIncrement();
        long long15 = hikariConfig1.getConnectionTimeout();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 10 + "'", int8 == 10);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 5000L + "'", long15 == 5000L);
    }

    @Test
    public void test03870() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03870");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        boolean boolean2 = hikariConfig1.isInitializationFailFast();
        hikariConfig1.setInitializationFailFast(true);
        hikariConfig1.setAcquireRetryDelay(1L);
        hikariConfig1.setAcquireIncrement((int) (byte) 100);
        int int9 = hikariConfig1.getTransactionIsolation();
        int int10 = hikariConfig1.getTransactionIsolation();
        hikariConfig1.setMaximumPoolSize((int) (byte) 1);
        long long13 = hikariConfig1.getMaxLifetime();
        hikariConfig1.setCatalog("HikariPool-30574");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 1800000L + "'", long13 == 1800000L);
    }

    @Test
    public void test03871() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03871");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        boolean boolean2 = hikariConfig1.isInitializationFailFast();
        hikariConfig1.setInitializationFailFast(true);
        javax.sql.DataSource dataSource5 = null;
        hikariConfig1.setDataSource(dataSource5);
        hikariConfig1.setAcquireRetryDelay((long) 'a');
        java.lang.String str9 = hikariConfig1.getConnectionCustomizerClassName();
        java.util.Properties properties10 = hikariConfig1.getDataSourceProperties();
        hikariConfig1.setAutoCommit(false);
        hikariConfig1.setJdbc4ConnectionTest(false);
        hikariConfig1.setAcquireRetryDelay((long) (short) 100);
        java.util.Properties properties17 = hikariConfig1.getDataSourceProperties();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNotNull(properties10);
        org.junit.Assert.assertNotNull(properties17);
    }

    @Test
    public void test03872() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03872");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        boolean boolean2 = hikariConfig1.isInitializationFailFast();
        hikariConfig1.setInitializationFailFast(true);
        hikariConfig1.setAcquireRetryDelay(1L);
        hikariConfig1.setConnectionTimeout(600000L);
        hikariConfig1.setAcquireRetries(10);
        hikariConfig1.setIdleTimeout((long) 3);
        hikariConfig1.setLeakDetectionThreshold((long) 60);
        hikariConfig1.setMaxLifetime(600000L);
        java.lang.String str17 = hikariConfig1.getConnectionCustomizerClassName();
        javax.sql.DataSource dataSource18 = hikariConfig1.getDataSource();
        long long19 = hikariConfig1.getMaxLifetime();
        hikariConfig1.setConnectionTestQuery("HikariPool-3533");
        long long22 = hikariConfig1.getIdleTimeout();
        hikariConfig1.setMaximumPoolSize((int) ' ');
        hikariConfig1.setAcquireRetryDelay((long) (short) 1);
        java.lang.String str27 = hikariConfig1.getDataSourceClassName();
        hikariConfig1.setDataSourceClassName("HikariPool-25456");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertNull(dataSource18);
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 600000L + "'", long19 == 600000L);
        org.junit.Assert.assertTrue("'" + long22 + "' != '" + 3L + "'", long22 == 3L);
        org.junit.Assert.assertNull(str27);
    }

    @Test
    public void test03873() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03873");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        boolean boolean2 = hikariConfig1.isInitializationFailFast();
        hikariConfig1.setInitializationFailFast(true);
        javax.sql.DataSource dataSource5 = null;
        hikariConfig1.setDataSource(dataSource5);
        hikariConfig1.setAcquireRetryDelay((long) 'a');
        java.lang.String str9 = hikariConfig1.getConnectionCustomizerClassName();
        java.util.Properties properties10 = hikariConfig1.getDataSourceProperties();
        java.util.Properties properties11 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig12 = new com.zaxxer.hikari.HikariConfig(properties11);
        java.util.Properties properties13 = hikariConfig12.getDataSourceProperties();
        hikariConfig1.setDataSourceProperties(properties13);
        java.lang.String str15 = hikariConfig1.getCatalog();
        long long16 = hikariConfig1.getConnectionTimeout();
        int int17 = hikariConfig1.getTransactionIsolation();
        boolean boolean18 = hikariConfig1.isInitializationFailFast();
        long long19 = hikariConfig1.getLeakDetectionThreshold();
        java.lang.String str20 = hikariConfig1.getConnectionTestQuery();
        int int21 = hikariConfig1.getTransactionIsolation();
        hikariConfig1.setPoolName("HikariPool-2681");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNotNull(properties10);
        org.junit.Assert.assertNotNull(properties13);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 5000L + "'", long16 == 5000L);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 0L + "'", long19 == 0L);
        org.junit.Assert.assertNull(str20);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1) + "'", int21 == (-1));
    }

    @Test
    public void test03874() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03874");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        hikariConfig1.setJdbc4ConnectionTest(false);
        java.lang.String str4 = hikariConfig1.getCatalog();
        java.lang.String str5 = hikariConfig1.getConnectionCustomizerClassName();
        hikariConfig1.setTransactionIsolation("HikariPool-6103");
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
    }

    @Test
    public void test03875() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03875");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        boolean boolean2 = hikariConfig1.isInitializationFailFast();
        hikariConfig1.setInitializationFailFast(true);
        int int5 = hikariConfig1.getAcquireRetries();
        hikariConfig1.setCatalog("HikariPool-143");
        java.util.Properties properties9 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig10 = new com.zaxxer.hikari.HikariConfig(properties9);
        boolean boolean11 = hikariConfig10.isInitializationFailFast();
        hikariConfig10.setInitializationFailFast(true);
        boolean boolean14 = hikariConfig10.isJdbc4ConnectionTest();
        long long15 = hikariConfig10.getConnectionTimeout();
        hikariConfig10.setPoolName("hi!");
        hikariConfig10.setAcquireIncrement((int) (byte) 100);
        long long20 = hikariConfig10.getLeakDetectionThreshold();
        hikariConfig1.addDataSourceProperty("HikariPool-663", (java.lang.Object) hikariConfig10);
        long long22 = hikariConfig10.getConnectionTimeout();
        hikariConfig10.setAcquireIncrement((int) ' ');
        java.lang.String str25 = hikariConfig10.getPoolName();
        hikariConfig10.setAcquireIncrement((int) (byte) 100);
        hikariConfig10.setConnectionCustomizerClassName("HikariPool-7535");
        hikariConfig10.setJdbc4ConnectionTest(false);
        java.util.Properties properties32 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig33 = new com.zaxxer.hikari.HikariConfig(properties32);
        boolean boolean34 = hikariConfig33.isInitializationFailFast();
        int int35 = hikariConfig33.getAcquireIncrement();
        long long36 = hikariConfig33.getConnectionTimeout();
        int int37 = hikariConfig33.getTransactionIsolation();
        hikariConfig33.setConnectionInitSql("HikariPool-7984");
        long long40 = hikariConfig33.getLeakDetectionThreshold();
        javax.sql.DataSource dataSource41 = hikariConfig33.getDataSource();
        java.util.Properties properties42 = hikariConfig33.getDataSourceProperties();
        hikariConfig10.setDataSourceProperties(properties42);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 3 + "'", int5 == 3);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 5000L + "'", long15 == 5000L);
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 0L + "'", long20 == 0L);
        org.junit.Assert.assertTrue("'" + long22 + "' != '" + 5000L + "'", long22 == 5000L);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "hi!" + "'", str25, "hi!");
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 0 + "'", int35 == 0);
        org.junit.Assert.assertTrue("'" + long36 + "' != '" + 5000L + "'", long36 == 5000L);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + (-1) + "'", int37 == (-1));
        org.junit.Assert.assertTrue("'" + long40 + "' != '" + 0L + "'", long40 == 0L);
        org.junit.Assert.assertNull(dataSource41);
        org.junit.Assert.assertNotNull(properties42);
    }

    @Test
    public void test03876() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03876");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        boolean boolean2 = hikariConfig1.isInitializationFailFast();
        hikariConfig1.setInitializationFailFast(true);
        boolean boolean5 = hikariConfig1.isJdbc4ConnectionTest();
        long long6 = hikariConfig1.getConnectionTimeout();
        hikariConfig1.setAcquireIncrement(100);
        hikariConfig1.setLeakDetectionThreshold((long) (byte) 1);
        boolean boolean11 = hikariConfig1.isJdbc4ConnectionTest();
        long long12 = hikariConfig1.getIdleTimeout();
        java.lang.Class<?> wildcardClass13 = hikariConfig1.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 5000L + "'", long6 == 5000L);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 600000L + "'", long12 == 600000L);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test03877() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03877");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        boolean boolean2 = hikariConfig1.isInitializationFailFast();
        hikariConfig1.setInitializationFailFast(true);
        javax.sql.DataSource dataSource5 = null;
        hikariConfig1.setDataSource(dataSource5);
        hikariConfig1.setAcquireRetryDelay((long) 'a');
        java.lang.String str9 = hikariConfig1.getConnectionCustomizerClassName();
        java.lang.String str10 = hikariConfig1.getConnectionInitSql();
        hikariConfig1.setDataSourceClassName("");
        hikariConfig1.setPoolName("HikariPool-627");
        int int15 = hikariConfig1.getMaximumPoolSize();
        hikariConfig1.setAcquireRetries((int) (short) 0);
        hikariConfig1.setIdleTimeout(0L);
        long long20 = hikariConfig1.getConnectionTimeout();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 60 + "'", int15 == 60);
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 5000L + "'", long20 == 5000L);
    }

    @Test
    public void test03878() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03878");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        boolean boolean2 = hikariConfig1.isInitializationFailFast();
        hikariConfig1.setInitializationFailFast(true);
        boolean boolean5 = hikariConfig1.isJdbc4ConnectionTest();
        long long6 = hikariConfig1.getConnectionTimeout();
        hikariConfig1.setPoolName("hi!");
        hikariConfig1.setAcquireIncrement((int) (byte) 100);
        hikariConfig1.setRegisterMbeans(false);
        long long13 = hikariConfig1.getLeakDetectionThreshold();
        java.lang.String str14 = hikariConfig1.getDataSourceClassName();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 5000L + "'", long6 == 5000L);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 0L + "'", long13 == 0L);
        org.junit.Assert.assertNull(str14);
    }

    @Test
    public void test03879() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03879");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        boolean boolean2 = hikariConfig1.isInitializationFailFast();
        hikariConfig1.setInitializationFailFast(true);
        boolean boolean5 = hikariConfig1.isJdbc4ConnectionTest();
        long long6 = hikariConfig1.getConnectionTimeout();
        hikariConfig1.setPoolName("hi!");
        hikariConfig1.setRegisterMbeans(false);
        java.util.Properties properties11 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig12 = new com.zaxxer.hikari.HikariConfig(properties11);
        boolean boolean13 = hikariConfig12.isInitializationFailFast();
        hikariConfig12.setInitializationFailFast(true);
        hikariConfig12.setAcquireRetryDelay(1L);
        hikariConfig12.setConnectionTimeout(600000L);
        javax.sql.DataSource dataSource20 = hikariConfig12.getDataSource();
        java.util.Properties properties21 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig22 = new com.zaxxer.hikari.HikariConfig(properties21);
        boolean boolean23 = hikariConfig22.isInitializationFailFast();
        hikariConfig22.setInitializationFailFast(true);
        boolean boolean26 = hikariConfig22.isJdbc4ConnectionTest();
        java.lang.String str27 = hikariConfig22.getDataSourceClassName();
        boolean boolean28 = hikariConfig22.isJdbc4ConnectionTest();
        java.lang.String str29 = hikariConfig22.getConnectionTestQuery();
        java.util.Properties properties30 = hikariConfig22.getDataSourceProperties();
        hikariConfig12.setDataSourceProperties(properties30);
        hikariConfig1.setDataSourceProperties(properties30);
        com.zaxxer.hikari.HikariConfig hikariConfig33 = new com.zaxxer.hikari.HikariConfig(properties30);
        hikariConfig33.setAutoCommit(true);
        hikariConfig33.setMaxLifetime(0L);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 5000L + "'", long6 == 5000L);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNull(dataSource20);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertNull(str27);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertNull(str29);
        org.junit.Assert.assertNotNull(properties30);
    }

    @Test
    public void test03880() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03880");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        boolean boolean2 = hikariConfig1.isInitializationFailFast();
        hikariConfig1.setInitializationFailFast(true);
        hikariConfig1.setAcquireRetryDelay(1L);
        boolean boolean7 = hikariConfig1.isAutoCommit();
        java.util.Properties properties8 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig9 = new com.zaxxer.hikari.HikariConfig(properties8);
        java.util.Properties properties10 = hikariConfig9.getDataSourceProperties();
        hikariConfig1.setDataSourceProperties(properties10);
        hikariConfig1.setTransactionIsolation("HikariPool-3053");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(properties10);
    }

    @Test
    public void test03881() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03881");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        boolean boolean2 = hikariConfig1.isInitializationFailFast();
        hikariConfig1.setInitializationFailFast(true);
        boolean boolean5 = hikariConfig1.isJdbc4ConnectionTest();
        long long6 = hikariConfig1.getConnectionTimeout();
        hikariConfig1.setPoolName("hi!");
        hikariConfig1.setRegisterMbeans(false);
        java.lang.String str11 = hikariConfig1.getConnectionTestQuery();
        long long12 = hikariConfig1.getAcquireRetryDelay();
        hikariConfig1.setAcquireRetryDelay(3L);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 5000L + "'", long6 == 5000L);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
    }

    @Test
    public void test03882() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03882");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        boolean boolean2 = hikariConfig1.isInitializationFailFast();
        int int3 = hikariConfig1.getAcquireIncrement();
        java.lang.String str4 = hikariConfig1.getConnectionCustomizerClassName();
        hikariConfig1.setIdleTimeout((long) (byte) 0);
        hikariConfig1.setTransactionIsolation("HikariPool-184");
        hikariConfig1.setJdbc4ConnectionTest(false);
        long long11 = hikariConfig1.getIdleTimeout();
        hikariConfig1.setRegisterMbeans(true);
        int int14 = hikariConfig1.getAcquireRetries();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 0L + "'", long11 == 0L);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 3 + "'", int14 == 3);
    }

    @Test
    public void test03883() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03883");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        boolean boolean2 = hikariConfig1.isInitializationFailFast();
        boolean boolean3 = hikariConfig1.isJdbc4ConnectionTest();
        long long4 = hikariConfig1.getConnectionTimeout();
        hikariConfig1.setDataSourceClassName("HikariPool-481");
        hikariConfig1.setAcquireRetryDelay(1L);
        java.util.Properties properties9 = hikariConfig1.getDataSourceProperties();
        com.zaxxer.hikari.HikariConfig hikariConfig10 = new com.zaxxer.hikari.HikariConfig(properties9);
        int int11 = hikariConfig10.getAcquireRetries();
        boolean boolean12 = hikariConfig10.isRegisterMbeans();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 5000L + "'", long4 == 5000L);
        org.junit.Assert.assertNotNull(properties9);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 3 + "'", int11 == 3);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test03884() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03884");
        // The following exception was thrown during execution in test generation
        try {
            com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig("HikariPool-31764");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Property file HikariPool-31764 was not found.");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test03885() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03885");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        boolean boolean2 = hikariConfig1.isInitializationFailFast();
        hikariConfig1.setInitializationFailFast(true);
        boolean boolean5 = hikariConfig1.isJdbc4ConnectionTest();
        java.lang.String str6 = hikariConfig1.getDataSourceClassName();
        boolean boolean7 = hikariConfig1.isJdbc4ConnectionTest();
        java.lang.String str8 = hikariConfig1.getConnectionTestQuery();
        hikariConfig1.setJdbc4ConnectionTest(true);
        hikariConfig1.setRegisterMbeans(false);
        int int13 = hikariConfig1.getMinimumPoolSize();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 10 + "'", int13 == 10);
    }

    @Test
    public void test03886() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03886");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        boolean boolean2 = hikariConfig1.isInitializationFailFast();
        hikariConfig1.setInitializationFailFast(true);
        java.lang.String str5 = hikariConfig1.getConnectionTestQuery();
        boolean boolean6 = hikariConfig1.isRegisterMbeans();
        hikariConfig1.setDataSourceClassName("hi!");
        hikariConfig1.setConnectionInitSql("");
        java.lang.String str11 = hikariConfig1.getCatalog();
        java.util.Properties properties12 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig13 = new com.zaxxer.hikari.HikariConfig(properties12);
        boolean boolean14 = hikariConfig13.isInitializationFailFast();
        hikariConfig13.setInitializationFailFast(true);
        javax.sql.DataSource dataSource17 = null;
        hikariConfig13.setDataSource(dataSource17);
        hikariConfig13.setAcquireRetryDelay((long) 'a');
        java.lang.String str21 = hikariConfig13.getConnectionCustomizerClassName();
        java.util.Properties properties22 = hikariConfig13.getDataSourceProperties();
        java.util.Properties properties23 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig24 = new com.zaxxer.hikari.HikariConfig(properties23);
        boolean boolean25 = hikariConfig24.isInitializationFailFast();
        hikariConfig24.setInitializationFailFast(true);
        javax.sql.DataSource dataSource28 = null;
        hikariConfig24.setDataSource(dataSource28);
        hikariConfig24.setAcquireRetryDelay((long) 'a');
        java.lang.String str32 = hikariConfig24.getConnectionCustomizerClassName();
        java.util.Properties properties33 = hikariConfig24.getDataSourceProperties();
        hikariConfig13.setDataSourceProperties(properties33);
        hikariConfig1.setDataSourceProperties(properties33);
        java.lang.String str36 = hikariConfig1.getCatalog();
        boolean boolean37 = hikariConfig1.isInitializationFailFast();
        int int38 = hikariConfig1.getAcquireIncrement();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNull(str21);
        org.junit.Assert.assertNotNull(properties22);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNull(str32);
        org.junit.Assert.assertNotNull(properties33);
        org.junit.Assert.assertNull(str36);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + true + "'", boolean37 == true);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 0 + "'", int38 == 0);
    }

    @Test
    public void test03887() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03887");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        boolean boolean2 = hikariConfig1.isInitializationFailFast();
        hikariConfig1.setInitializationFailFast(true);
        int int5 = hikariConfig1.getAcquireRetries();
        long long6 = hikariConfig1.getMaxLifetime();
        hikariConfig1.setMaxLifetime((long) (short) 0);
        hikariConfig1.setRegisterMbeans(false);
        hikariConfig1.setAcquireIncrement((int) (short) 0);
        long long13 = hikariConfig1.getIdleTimeout();
        hikariConfig1.setAcquireIncrement((int) (byte) 100);
        hikariConfig1.setUseInstrumentation(false);
        hikariConfig1.setCatalog("HikariPool-13704");
        boolean boolean20 = hikariConfig1.isInitializationFailFast();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 3 + "'", int5 == 3);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 1800000L + "'", long6 == 1800000L);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 600000L + "'", long13 == 600000L);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
    }

    @Test
    public void test03888() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03888");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        boolean boolean2 = hikariConfig1.isInitializationFailFast();
        hikariConfig1.setInitializationFailFast(true);
        hikariConfig1.setAcquireRetryDelay(1L);
        boolean boolean7 = hikariConfig1.isAutoCommit();
        java.lang.String str8 = hikariConfig1.getDataSourceClassName();
        boolean boolean9 = hikariConfig1.isJdbc4ConnectionTest();
        long long10 = hikariConfig1.getIdleTimeout();
        boolean boolean11 = hikariConfig1.isJdbc4ConnectionTest();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 600000L + "'", long10 == 600000L);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
    }

    @Test
    public void test03889() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03889");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        boolean boolean2 = hikariConfig1.isInitializationFailFast();
        hikariConfig1.setInitializationFailFast(true);
        javax.sql.DataSource dataSource5 = null;
        hikariConfig1.setDataSource(dataSource5);
        java.lang.String str7 = hikariConfig1.getCatalog();
        int int8 = hikariConfig1.getTransactionIsolation();
        int int9 = hikariConfig1.getMaximumPoolSize();
        hikariConfig1.setJdbc4ConnectionTest(true);
        hikariConfig1.setUseInstrumentation(false);
        long long14 = hikariConfig1.getConnectionTimeout();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 60 + "'", int9 == 60);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 5000L + "'", long14 == 5000L);
    }

    @Test
    public void test03890() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03890");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        boolean boolean2 = hikariConfig1.isInitializationFailFast();
        int int3 = hikariConfig1.getAcquireIncrement();
        java.lang.String str4 = hikariConfig1.getConnectionCustomizerClassName();
        hikariConfig1.setIdleTimeout((long) (byte) 0);
        hikariConfig1.setTransactionIsolation("HikariPool-184");
        hikariConfig1.setJdbc4ConnectionTest(false);
        long long11 = hikariConfig1.getIdleTimeout();
        java.util.Properties properties12 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig13 = new com.zaxxer.hikari.HikariConfig(properties12);
        boolean boolean14 = hikariConfig13.isInitializationFailFast();
        hikariConfig13.setInitializationFailFast(true);
        javax.sql.DataSource dataSource17 = null;
        hikariConfig13.setDataSource(dataSource17);
        hikariConfig13.setAcquireRetryDelay((long) 'a');
        java.lang.String str21 = hikariConfig13.getConnectionCustomizerClassName();
        java.util.Properties properties22 = hikariConfig13.getDataSourceProperties();
        java.util.Properties properties23 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig24 = new com.zaxxer.hikari.HikariConfig(properties23);
        java.util.Properties properties25 = hikariConfig24.getDataSourceProperties();
        hikariConfig13.setDataSourceProperties(properties25);
        java.lang.String str27 = hikariConfig13.getCatalog();
        long long28 = hikariConfig13.getConnectionTimeout();
        java.util.Properties properties29 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig30 = new com.zaxxer.hikari.HikariConfig(properties29);
        boolean boolean31 = hikariConfig30.isInitializationFailFast();
        hikariConfig30.setInitializationFailFast(true);
        int int34 = hikariConfig30.getAcquireRetries();
        long long35 = hikariConfig30.getMaxLifetime();
        java.util.Properties properties36 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig37 = new com.zaxxer.hikari.HikariConfig(properties36);
        boolean boolean38 = hikariConfig37.isInitializationFailFast();
        javax.sql.DataSource dataSource39 = null;
        hikariConfig37.setDataSource(dataSource39);
        java.util.Properties properties41 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig42 = new com.zaxxer.hikari.HikariConfig(properties41);
        boolean boolean43 = hikariConfig42.isInitializationFailFast();
        hikariConfig42.setInitializationFailFast(true);
        boolean boolean46 = hikariConfig42.isJdbc4ConnectionTest();
        long long47 = hikariConfig42.getConnectionTimeout();
        hikariConfig42.setPoolName("hi!");
        hikariConfig42.setAcquireIncrement((int) (byte) 100);
        java.util.Properties properties52 = hikariConfig42.getDataSourceProperties();
        hikariConfig37.setDataSourceProperties(properties52);
        hikariConfig30.setDataSourceProperties(properties52);
        com.zaxxer.hikari.HikariConfig hikariConfig55 = new com.zaxxer.hikari.HikariConfig(properties52);
        hikariConfig13.setDataSourceProperties(properties52);
        hikariConfig1.setDataSourceProperties(properties52);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 0L + "'", long11 == 0L);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNull(str21);
        org.junit.Assert.assertNotNull(properties22);
        org.junit.Assert.assertNotNull(properties25);
        org.junit.Assert.assertNull(str27);
        org.junit.Assert.assertTrue("'" + long28 + "' != '" + 5000L + "'", long28 == 5000L);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 3 + "'", int34 == 3);
        org.junit.Assert.assertTrue("'" + long35 + "' != '" + 1800000L + "'", long35 == 1800000L);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + true + "'", boolean46 == true);
        org.junit.Assert.assertTrue("'" + long47 + "' != '" + 5000L + "'", long47 == 5000L);
        org.junit.Assert.assertNotNull(properties52);
    }

    @Test
    public void test03891() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03891");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        boolean boolean2 = hikariConfig1.isInitializationFailFast();
        hikariConfig1.setInitializationFailFast(true);
        javax.sql.DataSource dataSource5 = null;
        hikariConfig1.setDataSource(dataSource5);
        hikariConfig1.setAcquireRetryDelay((long) 'a');
        java.lang.String str9 = hikariConfig1.getConnectionCustomizerClassName();
        java.util.Properties properties10 = hikariConfig1.getDataSourceProperties();
        com.zaxxer.hikari.HikariConfig hikariConfig11 = new com.zaxxer.hikari.HikariConfig(properties10);
        hikariConfig11.setIdleTimeout((long) '4');
        // The following exception was thrown during execution in test generation
        try {
            hikariConfig11.validate();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: one of either dataSource or dataSourceClassName must be specified");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNotNull(properties10);
    }

    @Test
    public void test03892() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03892");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        boolean boolean2 = hikariConfig1.isInitializationFailFast();
        int int3 = hikariConfig1.getAcquireIncrement();
        long long4 = hikariConfig1.getConnectionTimeout();
        java.lang.String str5 = hikariConfig1.getConnectionTestQuery();
        hikariConfig1.setAcquireRetries((int) (short) 1);
        java.lang.String str8 = hikariConfig1.getConnectionCustomizerClassName();
        long long9 = hikariConfig1.getMaxLifetime();
        java.lang.String str10 = hikariConfig1.getConnectionTestQuery();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 5000L + "'", long4 == 5000L);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 1800000L + "'", long9 == 1800000L);
        org.junit.Assert.assertNull(str10);
    }

    @Test
    public void test03893() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03893");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        boolean boolean2 = hikariConfig1.isInitializationFailFast();
        hikariConfig1.setInitializationFailFast(true);
        javax.sql.DataSource dataSource5 = null;
        hikariConfig1.setDataSource(dataSource5);
        java.lang.String str7 = hikariConfig1.getCatalog();
        int int8 = hikariConfig1.getMinimumPoolSize();
        hikariConfig1.setAutoCommit(true);
        int int11 = hikariConfig1.getMaximumPoolSize();
        hikariConfig1.setUseInstrumentation(false);
        hikariConfig1.setMinimumPoolSize(3);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 10 + "'", int8 == 10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 60 + "'", int11 == 60);
    }

    @Test
    public void test03894() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03894");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        boolean boolean2 = hikariConfig1.isInitializationFailFast();
        hikariConfig1.setInitializationFailFast(true);
        javax.sql.DataSource dataSource5 = null;
        hikariConfig1.setDataSource(dataSource5);
        hikariConfig1.setCatalog("");
        hikariConfig1.setAcquireIncrement((int) (byte) 10);
        int int11 = hikariConfig1.getTransactionIsolation();
        java.lang.String str12 = hikariConfig1.getConnectionTestQuery();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertNull(str12);
    }

    @Test
    public void test03895() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03895");
        // The following exception was thrown during execution in test generation
        try {
            com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig("HikariPool-30727");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Property file HikariPool-30727 was not found.");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test03896() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03896");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        boolean boolean2 = hikariConfig1.isInitializationFailFast();
        boolean boolean3 = hikariConfig1.isJdbc4ConnectionTest();
        hikariConfig1.addDataSourceProperty("", (java.lang.Object) false);
        hikariConfig1.setRegisterMbeans(true);
        hikariConfig1.setDataSourceClassName("hi!");
        java.lang.String str11 = hikariConfig1.getPoolName();
        int int12 = hikariConfig1.getAcquireIncrement();
        long long13 = hikariConfig1.getAcquireRetryDelay();
        hikariConfig1.setTransactionIsolation("HikariPool-25028");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "HikariPool-32119" + "'", str11, "HikariPool-32119");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 0L + "'", long13 == 0L);
    }

    @Test
    public void test03897() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03897");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        boolean boolean2 = hikariConfig1.isInitializationFailFast();
        hikariConfig1.setInitializationFailFast(true);
        int int5 = hikariConfig1.getAcquireRetries();
        hikariConfig1.setCatalog("HikariPool-143");
        hikariConfig1.setPoolName("HikariPool-1450");
        hikariConfig1.setAcquireRetries((int) '#');
        long long12 = hikariConfig1.getLeakDetectionThreshold();
        java.lang.String str13 = hikariConfig1.getConnectionCustomizerClassName();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 3 + "'", int5 == 3);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
        org.junit.Assert.assertNull(str13);
    }

    @Test
    public void test03898() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03898");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        boolean boolean2 = hikariConfig1.isInitializationFailFast();
        hikariConfig1.setLeakDetectionThreshold((long) '4');
        java.lang.String str5 = hikariConfig1.getConnectionCustomizerClassName();
        java.lang.String str6 = hikariConfig1.getConnectionCustomizerClassName();
        long long7 = hikariConfig1.getMaxLifetime();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 1800000L + "'", long7 == 1800000L);
    }

    @Test
    public void test03899() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03899");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        boolean boolean2 = hikariConfig1.isInitializationFailFast();
        boolean boolean3 = hikariConfig1.isJdbc4ConnectionTest();
        hikariConfig1.setDataSourceClassName("hi!");
        java.util.Properties properties7 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig8 = new com.zaxxer.hikari.HikariConfig(properties7);
        boolean boolean9 = hikariConfig8.isInitializationFailFast();
        hikariConfig8.setInitializationFailFast(true);
        javax.sql.DataSource dataSource12 = null;
        hikariConfig8.setDataSource(dataSource12);
        hikariConfig8.setAcquireRetryDelay((long) 'a');
        java.lang.String str16 = hikariConfig8.getConnectionCustomizerClassName();
        java.util.Properties properties17 = hikariConfig8.getDataSourceProperties();
        hikariConfig8.setAutoCommit(false);
        hikariConfig8.setInitializationFailFast(false);
        int int22 = hikariConfig8.getMaximumPoolSize();
        boolean boolean23 = hikariConfig8.isRegisterMbeans();
        hikariConfig1.addDataSourceProperty("HikariPool-587", (java.lang.Object) boolean23);
        boolean boolean25 = hikariConfig1.isRegisterMbeans();
        long long26 = hikariConfig1.getIdleTimeout();
        hikariConfig1.setUseInstrumentation(false);
        long long29 = hikariConfig1.getAcquireRetryDelay();
        int int30 = hikariConfig1.getAcquireRetries();
        hikariConfig1.setTransactionIsolation("HikariPool-7258");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertNotNull(properties17);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 60 + "'", int22 == 60);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + long26 + "' != '" + 600000L + "'", long26 == 600000L);
        org.junit.Assert.assertTrue("'" + long29 + "' != '" + 0L + "'", long29 == 0L);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 3 + "'", int30 == 3);
    }

    @Test
    public void test03900() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03900");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        boolean boolean2 = hikariConfig1.isInitializationFailFast();
        boolean boolean3 = hikariConfig1.isJdbc4ConnectionTest();
        javax.sql.DataSource dataSource4 = null;
        hikariConfig1.setDataSource(dataSource4);
        long long6 = hikariConfig1.getIdleTimeout();
        boolean boolean7 = hikariConfig1.isRegisterMbeans();
        int int8 = hikariConfig1.getTransactionIsolation();
        java.lang.String str9 = hikariConfig1.getConnectionInitSql();
        hikariConfig1.setJdbc4ConnectionTest(false);
        hikariConfig1.setInitializationFailFast(true);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 600000L + "'", long6 == 600000L);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertNull(str9);
    }

    @Test
    public void test03901() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03901");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        java.util.Properties properties2 = hikariConfig1.getDataSourceProperties();
        int int3 = hikariConfig1.getTransactionIsolation();
        java.lang.String str4 = hikariConfig1.getConnectionCustomizerClassName();
        int int5 = hikariConfig1.getAcquireIncrement();
        int int6 = hikariConfig1.getMaximumPoolSize();
        hikariConfig1.setTransactionIsolation("HikariPool-1639");
        javax.sql.DataSource dataSource9 = hikariConfig1.getDataSource();
        javax.sql.DataSource dataSource10 = hikariConfig1.getDataSource();
        long long11 = hikariConfig1.getAcquireRetryDelay();
        hikariConfig1.setMaximumPoolSize((int) 'a');
        org.junit.Assert.assertNotNull(properties2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 60 + "'", int6 == 60);
        org.junit.Assert.assertNull(dataSource9);
        org.junit.Assert.assertNull(dataSource10);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 0L + "'", long11 == 0L);
    }

    @Test
    public void test03902() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03902");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        boolean boolean2 = hikariConfig1.isInitializationFailFast();
        int int3 = hikariConfig1.getAcquireIncrement();
        java.lang.String str4 = hikariConfig1.getConnectionCustomizerClassName();
        hikariConfig1.setMaximumPoolSize((int) ' ');
        java.lang.String str7 = hikariConfig1.getConnectionTestQuery();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str7);
    }

    @Test
    public void test03903() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03903");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        boolean boolean2 = hikariConfig1.isInitializationFailFast();
        hikariConfig1.setInitializationFailFast(true);
        java.lang.String str5 = hikariConfig1.getConnectionTestQuery();
        boolean boolean6 = hikariConfig1.isRegisterMbeans();
        hikariConfig1.setDataSourceClassName("hi!");
        hikariConfig1.setInitializationFailFast(true);
        hikariConfig1.setPoolName("HikariPool-442");
        int int13 = hikariConfig1.getAcquireIncrement();
        int int14 = hikariConfig1.getAcquireRetries();
        long long15 = hikariConfig1.getAcquireRetryDelay();
        hikariConfig1.setPoolName("HikariPool-13873");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 3 + "'", int14 == 3);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 0L + "'", long15 == 0L);
    }

    @Test
    public void test03904() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03904");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        boolean boolean2 = hikariConfig1.isInitializationFailFast();
        hikariConfig1.setLeakDetectionThreshold((long) '4');
        java.lang.String str5 = hikariConfig1.getConnectionCustomizerClassName();
        java.util.Properties properties6 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig7 = new com.zaxxer.hikari.HikariConfig(properties6);
        boolean boolean8 = hikariConfig7.isInitializationFailFast();
        hikariConfig7.setInitializationFailFast(true);
        javax.sql.DataSource dataSource11 = null;
        hikariConfig7.setDataSource(dataSource11);
        hikariConfig7.setAcquireRetryDelay((long) 'a');
        java.lang.String str15 = hikariConfig7.getConnectionCustomizerClassName();
        java.util.Properties properties16 = hikariConfig7.getDataSourceProperties();
        java.util.Properties properties17 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig18 = new com.zaxxer.hikari.HikariConfig(properties17);
        java.util.Properties properties19 = hikariConfig18.getDataSourceProperties();
        hikariConfig7.setDataSourceProperties(properties19);
        hikariConfig1.setDataSourceProperties(properties19);
        java.lang.String str22 = hikariConfig1.getDataSourceClassName();
        hikariConfig1.setConnectionCustomizerClassName("");
        java.lang.String str25 = hikariConfig1.getDataSourceClassName();
        javax.sql.DataSource dataSource26 = null;
        hikariConfig1.setDataSource(dataSource26);
        hikariConfig1.setInitializationFailFast(true);
        long long30 = hikariConfig1.getLeakDetectionThreshold();
        hikariConfig1.setJdbc4ConnectionTest(true);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertNotNull(properties16);
        org.junit.Assert.assertNotNull(properties19);
        org.junit.Assert.assertNull(str22);
        org.junit.Assert.assertNull(str25);
        org.junit.Assert.assertTrue("'" + long30 + "' != '" + 52L + "'", long30 == 52L);
    }

    @Test
    public void test03905() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03905");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        boolean boolean2 = hikariConfig1.isInitializationFailFast();
        hikariConfig1.setInitializationFailFast(true);
        javax.sql.DataSource dataSource5 = null;
        hikariConfig1.setDataSource(dataSource5);
        hikariConfig1.setAcquireRetryDelay((long) 'a');
        java.lang.String str9 = hikariConfig1.getConnectionCustomizerClassName();
        java.lang.String str10 = hikariConfig1.getConnectionInitSql();
        hikariConfig1.setDataSourceClassName("");
        java.util.Properties properties13 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig14 = new com.zaxxer.hikari.HikariConfig(properties13);
        boolean boolean15 = hikariConfig14.isInitializationFailFast();
        hikariConfig14.setInitializationFailFast(true);
        javax.sql.DataSource dataSource18 = null;
        hikariConfig14.setDataSource(dataSource18);
        hikariConfig14.setAcquireRetryDelay((long) 'a');
        java.lang.String str22 = hikariConfig14.getConnectionCustomizerClassName();
        java.util.Properties properties23 = hikariConfig14.getDataSourceProperties();
        java.util.Properties properties24 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig25 = new com.zaxxer.hikari.HikariConfig(properties24);
        java.util.Properties properties26 = hikariConfig25.getDataSourceProperties();
        hikariConfig14.setDataSourceProperties(properties26);
        hikariConfig1.setDataSourceProperties(properties26);
        long long29 = hikariConfig1.getConnectionTimeout();
        hikariConfig1.setInitializationFailFast(true);
        boolean boolean32 = hikariConfig1.isRegisterMbeans();
        java.lang.String str33 = hikariConfig1.getConnectionTestQuery();
        javax.sql.DataSource dataSource34 = hikariConfig1.getDataSource();
        java.lang.String str35 = hikariConfig1.getConnectionCustomizerClassName();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNull(str22);
        org.junit.Assert.assertNotNull(properties23);
        org.junit.Assert.assertNotNull(properties26);
        org.junit.Assert.assertTrue("'" + long29 + "' != '" + 5000L + "'", long29 == 5000L);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertNull(str33);
        org.junit.Assert.assertNull(dataSource34);
        org.junit.Assert.assertNull(str35);
    }

    @Test
    public void test03906() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03906");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        boolean boolean2 = hikariConfig1.isInitializationFailFast();
        hikariConfig1.setInitializationFailFast(true);
        javax.sql.DataSource dataSource5 = null;
        hikariConfig1.setDataSource(dataSource5);
        hikariConfig1.setAcquireRetryDelay((long) 'a');
        java.lang.String str9 = hikariConfig1.getConnectionCustomizerClassName();
        java.util.Properties properties10 = hikariConfig1.getDataSourceProperties();
        java.util.Properties properties11 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig12 = new com.zaxxer.hikari.HikariConfig(properties11);
        boolean boolean13 = hikariConfig12.isInitializationFailFast();
        hikariConfig12.setInitializationFailFast(true);
        javax.sql.DataSource dataSource16 = null;
        hikariConfig12.setDataSource(dataSource16);
        hikariConfig12.setAcquireRetryDelay((long) 'a');
        java.lang.String str20 = hikariConfig12.getConnectionCustomizerClassName();
        java.util.Properties properties21 = hikariConfig12.getDataSourceProperties();
        hikariConfig1.setDataSourceProperties(properties21);
        hikariConfig1.setAcquireIncrement(3);
        java.util.Properties properties26 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig27 = new com.zaxxer.hikari.HikariConfig(properties26);
        boolean boolean28 = hikariConfig27.isInitializationFailFast();
        javax.sql.DataSource dataSource29 = null;
        hikariConfig27.setDataSource(dataSource29);
        hikariConfig27.setMinimumPoolSize(100);
        hikariConfig27.setMaxLifetime(52L);
        hikariConfig1.addDataSourceProperty("HikariPool-2120", (java.lang.Object) 52L);
        hikariConfig1.setIdleTimeout(600000L);
        hikariConfig1.setMinimumPoolSize(10);
        boolean boolean40 = hikariConfig1.isRegisterMbeans();
        java.lang.String str41 = hikariConfig1.getConnectionCustomizerClassName();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNotNull(properties10);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNull(str20);
        org.junit.Assert.assertNotNull(properties21);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertNull(str41);
    }

    @Test
    public void test03907() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03907");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        boolean boolean2 = hikariConfig1.isInitializationFailFast();
        hikariConfig1.setInitializationFailFast(true);
        javax.sql.DataSource dataSource5 = null;
        hikariConfig1.setDataSource(dataSource5);
        hikariConfig1.setAcquireRetryDelay((long) 'a');
        java.lang.String str9 = hikariConfig1.getConnectionCustomizerClassName();
        java.lang.String str10 = hikariConfig1.getConnectionInitSql();
        long long11 = hikariConfig1.getLeakDetectionThreshold();
        hikariConfig1.setConnectionTestQuery("HikariPool-393");
        hikariConfig1.setInitializationFailFast(false);
        java.lang.Class<?> wildcardClass16 = hikariConfig1.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 0L + "'", long11 == 0L);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test03908() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03908");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        boolean boolean2 = hikariConfig1.isInitializationFailFast();
        hikariConfig1.setLeakDetectionThreshold((long) '4');
        java.lang.String str5 = hikariConfig1.getConnectionCustomizerClassName();
        hikariConfig1.setAcquireRetryDelay((long) (byte) 10);
        hikariConfig1.setLeakDetectionThreshold((long) (short) 10);
        boolean boolean10 = hikariConfig1.isRegisterMbeans();
        hikariConfig1.setMaxLifetime((long) 35);
        hikariConfig1.setInitializationFailFast(true);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test03909() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03909");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        boolean boolean2 = hikariConfig1.isInitializationFailFast();
        hikariConfig1.setLeakDetectionThreshold((long) '4');
        hikariConfig1.setRegisterMbeans(true);
        hikariConfig1.setConnectionInitSql("HikariPool-859");
        boolean boolean9 = hikariConfig1.isJdbc4ConnectionTest();
        int int10 = hikariConfig1.getTransactionIsolation();
        hikariConfig1.setConnectionCustomizerClassName("HikariPool-5174");
        hikariConfig1.setRegisterMbeans(false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
    }

    @Test
    public void test03910() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03910");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        boolean boolean2 = hikariConfig1.isInitializationFailFast();
        hikariConfig1.setLeakDetectionThreshold((long) '4');
        int int5 = hikariConfig1.getTransactionIsolation();
        hikariConfig1.setJdbc4ConnectionTest(false);
        hikariConfig1.setAutoCommit(false);
        hikariConfig1.setDataSourceClassName("HikariPool-10604");
        hikariConfig1.setConnectionInitSql("");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
    }

    @Test
    public void test03911() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03911");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        java.util.Properties properties2 = hikariConfig1.getDataSourceProperties();
        java.util.Properties properties4 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig5 = new com.zaxxer.hikari.HikariConfig(properties4);
        boolean boolean6 = hikariConfig5.isInitializationFailFast();
        hikariConfig5.setInitializationFailFast(true);
        javax.sql.DataSource dataSource9 = null;
        hikariConfig5.setDataSource(dataSource9);
        hikariConfig5.setAcquireRetryDelay((long) 'a');
        java.lang.String str13 = hikariConfig5.getConnectionCustomizerClassName();
        hikariConfig5.setConnectionCustomizerClassName("hi!");
        java.lang.String str16 = hikariConfig5.getConnectionInitSql();
        hikariConfig1.addDataSourceProperty("hi!", (java.lang.Object) hikariConfig5);
        long long18 = hikariConfig1.getAcquireRetryDelay();
        boolean boolean19 = hikariConfig1.isInitializationFailFast();
        hikariConfig1.setAcquireIncrement((int) (byte) 1);
        java.util.Properties properties23 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig24 = new com.zaxxer.hikari.HikariConfig(properties23);
        boolean boolean25 = hikariConfig24.isInitializationFailFast();
        hikariConfig24.setInitializationFailFast(true);
        javax.sql.DataSource dataSource28 = null;
        hikariConfig24.setDataSource(dataSource28);
        hikariConfig24.setAcquireRetryDelay((long) 'a');
        java.lang.String str32 = hikariConfig24.getConnectionCustomizerClassName();
        java.util.Properties properties33 = hikariConfig24.getDataSourceProperties();
        java.util.Properties properties34 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig35 = new com.zaxxer.hikari.HikariConfig(properties34);
        java.util.Properties properties36 = hikariConfig35.getDataSourceProperties();
        hikariConfig24.setDataSourceProperties(properties36);
        int int38 = hikariConfig24.getMinimumPoolSize();
        java.lang.String str39 = hikariConfig24.getDataSourceClassName();
        hikariConfig24.setConnectionCustomizerClassName("");
        javax.sql.DataSource dataSource42 = hikariConfig24.getDataSource();
        hikariConfig24.setInitializationFailFast(false);
        boolean boolean45 = hikariConfig24.isAutoCommit();
        hikariConfig24.setMinimumPoolSize(0);
        int int48 = hikariConfig24.getAcquireRetries();
        hikariConfig1.addDataSourceProperty("HikariPool-28259", (java.lang.Object) hikariConfig24);
        org.junit.Assert.assertNotNull(properties2);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 0L + "'", long18 == 0L);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNull(str32);
        org.junit.Assert.assertNotNull(properties33);
        org.junit.Assert.assertNotNull(properties36);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 10 + "'", int38 == 10);
        org.junit.Assert.assertNull(str39);
        org.junit.Assert.assertNull(dataSource42);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + true + "'", boolean45 == true);
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + 3 + "'", int48 == 3);
    }

    @Test
    public void test03912() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03912");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        java.util.Properties properties2 = hikariConfig1.getDataSourceProperties();
        long long3 = hikariConfig1.getAcquireRetryDelay();
        hikariConfig1.setUseInstrumentation(false);
        java.lang.String str6 = hikariConfig1.getPoolName();
        long long7 = hikariConfig1.getConnectionTimeout();
        org.junit.Assert.assertNotNull(properties2);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
// flaky:         org.junit.Assert.assertEquals("'" + str6 + "' != '" + "HikariPool-32184" + "'", str6, "HikariPool-32184");
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 5000L + "'", long7 == 5000L);
    }

    @Test
    public void test03913() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03913");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        boolean boolean2 = hikariConfig1.isInitializationFailFast();
        hikariConfig1.setInitializationFailFast(true);
        int int5 = hikariConfig1.getAcquireRetries();
        hikariConfig1.setCatalog("HikariPool-143");
        hikariConfig1.setPoolName("HikariPool-1450");
        hikariConfig1.setAcquireRetries((int) '#');
        long long12 = hikariConfig1.getLeakDetectionThreshold();
        hikariConfig1.setRegisterMbeans(true);
        hikariConfig1.setAcquireRetries(60);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 3 + "'", int5 == 3);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
    }

    @Test
    public void test03914() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03914");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        boolean boolean2 = hikariConfig1.isInitializationFailFast();
        hikariConfig1.setInitializationFailFast(true);
        javax.sql.DataSource dataSource5 = null;
        hikariConfig1.setDataSource(dataSource5);
        hikariConfig1.setAcquireRetryDelay((long) 'a');
        java.lang.String str9 = hikariConfig1.getConnectionCustomizerClassName();
        java.lang.String str10 = hikariConfig1.getConnectionInitSql();
        hikariConfig1.setDataSourceClassName("");
        java.util.Properties properties13 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig14 = new com.zaxxer.hikari.HikariConfig(properties13);
        boolean boolean15 = hikariConfig14.isInitializationFailFast();
        hikariConfig14.setInitializationFailFast(true);
        javax.sql.DataSource dataSource18 = null;
        hikariConfig14.setDataSource(dataSource18);
        hikariConfig14.setAcquireRetryDelay((long) 'a');
        java.lang.String str22 = hikariConfig14.getConnectionCustomizerClassName();
        java.util.Properties properties23 = hikariConfig14.getDataSourceProperties();
        java.util.Properties properties24 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig25 = new com.zaxxer.hikari.HikariConfig(properties24);
        java.util.Properties properties26 = hikariConfig25.getDataSourceProperties();
        hikariConfig14.setDataSourceProperties(properties26);
        hikariConfig1.setDataSourceProperties(properties26);
        long long29 = hikariConfig1.getLeakDetectionThreshold();
        java.util.Properties properties30 = hikariConfig1.getDataSourceProperties();
        java.lang.String str31 = hikariConfig1.getConnectionCustomizerClassName();
        long long32 = hikariConfig1.getIdleTimeout();
        hikariConfig1.setConnectionCustomizerClassName("");
        javax.sql.DataSource dataSource35 = null;
        hikariConfig1.setDataSource(dataSource35);
        hikariConfig1.setConnectionTestQuery("HikariPool-2473");
        java.util.Properties properties40 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig41 = new com.zaxxer.hikari.HikariConfig(properties40);
        boolean boolean42 = hikariConfig41.isInitializationFailFast();
        hikariConfig41.setLeakDetectionThreshold((long) '4');
        java.lang.String str45 = hikariConfig41.getConnectionCustomizerClassName();
        java.util.Properties properties46 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig47 = new com.zaxxer.hikari.HikariConfig(properties46);
        boolean boolean48 = hikariConfig47.isInitializationFailFast();
        hikariConfig47.setInitializationFailFast(true);
        javax.sql.DataSource dataSource51 = null;
        hikariConfig47.setDataSource(dataSource51);
        hikariConfig47.setAcquireRetryDelay((long) 'a');
        java.lang.String str55 = hikariConfig47.getConnectionCustomizerClassName();
        java.util.Properties properties56 = hikariConfig47.getDataSourceProperties();
        java.util.Properties properties57 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig58 = new com.zaxxer.hikari.HikariConfig(properties57);
        java.util.Properties properties59 = hikariConfig58.getDataSourceProperties();
        hikariConfig47.setDataSourceProperties(properties59);
        hikariConfig41.setDataSourceProperties(properties59);
        hikariConfig41.setInitializationFailFast(false);
        hikariConfig41.setConnectionInitSql("HikariPool-3749");
        hikariConfig1.addDataSourceProperty("HikariPool-9817", (java.lang.Object) hikariConfig41);
        hikariConfig1.setIdleTimeout((long) '4');
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNull(str22);
        org.junit.Assert.assertNotNull(properties23);
        org.junit.Assert.assertNotNull(properties26);
        org.junit.Assert.assertTrue("'" + long29 + "' != '" + 0L + "'", long29 == 0L);
        org.junit.Assert.assertNotNull(properties30);
        org.junit.Assert.assertNull(str31);
        org.junit.Assert.assertTrue("'" + long32 + "' != '" + 600000L + "'", long32 == 600000L);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertNull(str45);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertNull(str55);
        org.junit.Assert.assertNotNull(properties56);
        org.junit.Assert.assertNotNull(properties59);
    }

    @Test
    public void test03915() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03915");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        boolean boolean2 = hikariConfig1.isInitializationFailFast();
        hikariConfig1.setTransactionIsolation("hi!");
        java.util.Properties properties5 = hikariConfig1.getDataSourceProperties();
        long long6 = hikariConfig1.getConnectionTimeout();
        hikariConfig1.setInitializationFailFast(true);
        boolean boolean9 = hikariConfig1.isAutoCommit();
        javax.sql.DataSource dataSource10 = hikariConfig1.getDataSource();
        hikariConfig1.setMinimumPoolSize(100);
        int int13 = hikariConfig1.getAcquireRetries();
        boolean boolean14 = hikariConfig1.isJdbc4ConnectionTest();
        hikariConfig1.setConnectionCustomizerClassName("HikariPool-29659");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(properties5);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 5000L + "'", long6 == 5000L);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNull(dataSource10);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 3 + "'", int13 == 3);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
    }

    @Test
    public void test03916() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03916");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        boolean boolean2 = hikariConfig1.isInitializationFailFast();
        hikariConfig1.setInitializationFailFast(true);
        javax.sql.DataSource dataSource5 = null;
        hikariConfig1.setDataSource(dataSource5);
        java.lang.String str7 = hikariConfig1.getCatalog();
        hikariConfig1.setRegisterMbeans(true);
        java.lang.String str10 = hikariConfig1.getDataSourceClassName();
        java.util.Properties properties11 = hikariConfig1.getDataSourceProperties();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNotNull(properties11);
    }

    @Test
    public void test03917() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03917");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        boolean boolean2 = hikariConfig1.isInitializationFailFast();
        hikariConfig1.setInitializationFailFast(true);
        javax.sql.DataSource dataSource5 = null;
        hikariConfig1.setDataSource(dataSource5);
        hikariConfig1.setAcquireRetryDelay((long) 'a');
        java.lang.String str9 = hikariConfig1.getConnectionCustomizerClassName();
        java.util.Properties properties10 = hikariConfig1.getDataSourceProperties();
        hikariConfig1.setAutoCommit(false);
        long long13 = hikariConfig1.getIdleTimeout();
        hikariConfig1.setJdbc4ConnectionTest(true);
        javax.sql.DataSource dataSource16 = hikariConfig1.getDataSource();
        long long17 = hikariConfig1.getMaxLifetime();
        boolean boolean18 = hikariConfig1.isRegisterMbeans();
        hikariConfig1.setAcquireRetries((int) (byte) 100);
        java.lang.String str21 = hikariConfig1.getCatalog();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNotNull(properties10);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 600000L + "'", long13 == 600000L);
        org.junit.Assert.assertNull(dataSource16);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 1800000L + "'", long17 == 1800000L);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNull(str21);
    }

    @Test
    public void test03918() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03918");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        boolean boolean2 = hikariConfig1.isInitializationFailFast();
        hikariConfig1.setInitializationFailFast(true);
        javax.sql.DataSource dataSource5 = null;
        hikariConfig1.setDataSource(dataSource5);
        hikariConfig1.setAcquireRetryDelay((long) 'a');
        java.lang.String str9 = hikariConfig1.getConnectionCustomizerClassName();
        int int10 = hikariConfig1.getAcquireRetries();
        java.lang.String str11 = hikariConfig1.getDataSourceClassName();
        hikariConfig1.setIdleTimeout((long) 60);
        int int14 = hikariConfig1.getAcquireIncrement();
        int int15 = hikariConfig1.getAcquireIncrement();
        boolean boolean16 = hikariConfig1.isJdbc4ConnectionTest();
        long long17 = hikariConfig1.getMaxLifetime();
        long long18 = hikariConfig1.getMaxLifetime();
        boolean boolean19 = hikariConfig1.isInitializationFailFast();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 3 + "'", int10 == 3);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 1800000L + "'", long17 == 1800000L);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 1800000L + "'", long18 == 1800000L);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
    }

    @Test
    public void test03919() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03919");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        boolean boolean2 = hikariConfig1.isInitializationFailFast();
        hikariConfig1.setInitializationFailFast(true);
        javax.sql.DataSource dataSource5 = null;
        hikariConfig1.setDataSource(dataSource5);
        hikariConfig1.setAcquireRetryDelay((long) 'a');
        java.lang.String str9 = hikariConfig1.getConnectionCustomizerClassName();
        java.util.Properties properties10 = hikariConfig1.getDataSourceProperties();
        hikariConfig1.setAutoCommit(false);
        hikariConfig1.setJdbc4ConnectionTest(false);
        java.lang.String str15 = hikariConfig1.getConnectionInitSql();
        hikariConfig1.setInitializationFailFast(true);
        java.lang.String str18 = hikariConfig1.getCatalog();
        hikariConfig1.setJdbc4ConnectionTest(false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNotNull(properties10);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertNull(str18);
    }

    @Test
    public void test03920() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03920");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        java.util.Properties properties2 = hikariConfig1.getDataSourceProperties();
        int int3 = hikariConfig1.getTransactionIsolation();
        java.lang.String str4 = hikariConfig1.getConnectionCustomizerClassName();
        int int5 = hikariConfig1.getAcquireIncrement();
        int int6 = hikariConfig1.getMaximumPoolSize();
        hikariConfig1.setTransactionIsolation("HikariPool-1639");
        javax.sql.DataSource dataSource9 = hikariConfig1.getDataSource();
        hikariConfig1.setDataSourceClassName("HikariPool-4238");
        hikariConfig1.setRegisterMbeans(true);
        hikariConfig1.setMinimumPoolSize((int) '#');
        javax.sql.DataSource dataSource16 = hikariConfig1.getDataSource();
        javax.sql.DataSource dataSource17 = null;
        hikariConfig1.setDataSource(dataSource17);
        java.lang.String str19 = hikariConfig1.getPoolName();
        hikariConfig1.setAcquireIncrement((int) (byte) 10);
        org.junit.Assert.assertNotNull(properties2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 60 + "'", int6 == 60);
        org.junit.Assert.assertNull(dataSource9);
        org.junit.Assert.assertNull(dataSource16);
// flaky:         org.junit.Assert.assertEquals("'" + str19 + "' != '" + "HikariPool-32219" + "'", str19, "HikariPool-32219");
    }

    @Test
    public void test03921() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03921");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        boolean boolean2 = hikariConfig1.isInitializationFailFast();
        hikariConfig1.setInitializationFailFast(true);
        javax.sql.DataSource dataSource5 = null;
        hikariConfig1.setDataSource(dataSource5);
        hikariConfig1.setAcquireRetryDelay((long) 'a');
        java.lang.String str9 = hikariConfig1.getConnectionCustomizerClassName();
        java.util.Properties properties10 = hikariConfig1.getDataSourceProperties();
        hikariConfig1.setAutoCommit(false);
        hikariConfig1.setInitializationFailFast(false);
        java.lang.String str15 = hikariConfig1.getConnectionInitSql();
        long long16 = hikariConfig1.getMaxLifetime();
        java.lang.String str17 = hikariConfig1.getConnectionCustomizerClassName();
        long long18 = hikariConfig1.getConnectionTimeout();
        boolean boolean19 = hikariConfig1.isRegisterMbeans();
        hikariConfig1.setMinimumPoolSize((int) (byte) 10);
        // The following exception was thrown during execution in test generation
        try {
            hikariConfig1.validate();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: one of either dataSource or dataSourceClassName must be specified");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNotNull(properties10);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 1800000L + "'", long16 == 1800000L);
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 5000L + "'", long18 == 5000L);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }

    @Test
    public void test03922() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03922");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        boolean boolean2 = hikariConfig1.isInitializationFailFast();
        hikariConfig1.setInitializationFailFast(true);
        javax.sql.DataSource dataSource5 = null;
        hikariConfig1.setDataSource(dataSource5);
        java.lang.String str7 = hikariConfig1.getCatalog();
        int int8 = hikariConfig1.getMinimumPoolSize();
        hikariConfig1.setTransactionIsolation("");
        java.lang.String str11 = hikariConfig1.getCatalog();
        hikariConfig1.setInitializationFailFast(true);
        hikariConfig1.setAcquireRetryDelay((long) 1);
        hikariConfig1.setAcquireRetryDelay(5000L);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 10 + "'", int8 == 10);
        org.junit.Assert.assertNull(str11);
    }

    @Test
    public void test03923() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03923");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        java.util.Properties properties2 = hikariConfig1.getDataSourceProperties();
        java.util.Properties properties4 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig5 = new com.zaxxer.hikari.HikariConfig(properties4);
        boolean boolean6 = hikariConfig5.isInitializationFailFast();
        hikariConfig5.setInitializationFailFast(true);
        javax.sql.DataSource dataSource9 = null;
        hikariConfig5.setDataSource(dataSource9);
        hikariConfig5.setAcquireRetryDelay((long) 'a');
        java.lang.String str13 = hikariConfig5.getConnectionCustomizerClassName();
        hikariConfig5.setConnectionCustomizerClassName("hi!");
        java.lang.String str16 = hikariConfig5.getConnectionInitSql();
        hikariConfig1.addDataSourceProperty("hi!", (java.lang.Object) hikariConfig5);
        java.lang.String str18 = hikariConfig1.getConnectionCustomizerClassName();
        javax.sql.DataSource dataSource19 = hikariConfig1.getDataSource();
        hikariConfig1.setCatalog("HikariPool-3407");
        hikariConfig1.setAcquireIncrement((int) '#');
        java.lang.String str24 = hikariConfig1.getConnectionInitSql();
        long long25 = hikariConfig1.getLeakDetectionThreshold();
        java.util.Properties properties26 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig27 = new com.zaxxer.hikari.HikariConfig(properties26);
        boolean boolean28 = hikariConfig27.isInitializationFailFast();
        hikariConfig27.setInitializationFailFast(true);
        hikariConfig27.setAcquireRetryDelay(1L);
        java.util.Properties properties33 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig34 = new com.zaxxer.hikari.HikariConfig(properties33);
        boolean boolean35 = hikariConfig34.isInitializationFailFast();
        hikariConfig34.setTransactionIsolation("hi!");
        java.util.Properties properties38 = hikariConfig34.getDataSourceProperties();
        com.zaxxer.hikari.HikariConfig hikariConfig39 = new com.zaxxer.hikari.HikariConfig(properties38);
        hikariConfig27.setDataSourceProperties(properties38);
        hikariConfig27.setAutoCommit(false);
        hikariConfig27.setAutoCommit(false);
        java.lang.String str45 = hikariConfig27.getConnectionTestQuery();
        java.util.Properties properties46 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig47 = new com.zaxxer.hikari.HikariConfig(properties46);
        boolean boolean48 = hikariConfig47.isInitializationFailFast();
        hikariConfig47.setInitializationFailFast(true);
        javax.sql.DataSource dataSource51 = null;
        hikariConfig47.setDataSource(dataSource51);
        hikariConfig47.setAcquireRetryDelay((long) 'a');
        java.lang.String str55 = hikariConfig47.getConnectionCustomizerClassName();
        java.lang.String str56 = hikariConfig47.getConnectionInitSql();
        long long57 = hikariConfig47.getLeakDetectionThreshold();
        hikariConfig47.setConnectionTestQuery("HikariPool-393");
        hikariConfig47.setDataSourceClassName("HikariPool-481");
        hikariConfig47.setPoolName("hi!");
        java.util.Properties properties64 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig65 = new com.zaxxer.hikari.HikariConfig(properties64);
        hikariConfig65.setTransactionIsolation("");
        hikariConfig65.setConnectionTestQuery("HikariPool-143");
        java.util.Properties properties70 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig71 = new com.zaxxer.hikari.HikariConfig(properties70);
        boolean boolean72 = hikariConfig71.isInitializationFailFast();
        hikariConfig71.setInitializationFailFast(true);
        hikariConfig71.setAcquireRetryDelay(1L);
        boolean boolean77 = hikariConfig71.isAutoCommit();
        java.util.Properties properties78 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig79 = new com.zaxxer.hikari.HikariConfig(properties78);
        java.util.Properties properties80 = hikariConfig79.getDataSourceProperties();
        hikariConfig71.setDataSourceProperties(properties80);
        hikariConfig65.setDataSourceProperties(properties80);
        hikariConfig47.setDataSourceProperties(properties80);
        com.zaxxer.hikari.HikariConfig hikariConfig84 = new com.zaxxer.hikari.HikariConfig(properties80);
        hikariConfig27.setDataSourceProperties(properties80);
        hikariConfig1.setDataSourceProperties(properties80);
        javax.sql.DataSource dataSource87 = null;
        hikariConfig1.setDataSource(dataSource87);
        hikariConfig1.setDataSourceClassName("HikariPool-19094");
        org.junit.Assert.assertNotNull(properties2);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertNull(dataSource19);
        org.junit.Assert.assertNull(str24);
        org.junit.Assert.assertTrue("'" + long25 + "' != '" + 0L + "'", long25 == 0L);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertNotNull(properties38);
        org.junit.Assert.assertNull(str45);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertNull(str55);
        org.junit.Assert.assertNull(str56);
        org.junit.Assert.assertTrue("'" + long57 + "' != '" + 0L + "'", long57 == 0L);
        org.junit.Assert.assertTrue("'" + boolean72 + "' != '" + false + "'", boolean72 == false);
        org.junit.Assert.assertTrue("'" + boolean77 + "' != '" + true + "'", boolean77 == true);
        org.junit.Assert.assertNotNull(properties80);
    }

    @Test
    public void test03924() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03924");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        hikariConfig1.setTransactionIsolation("");
        int int4 = hikariConfig1.getAcquireIncrement();
        javax.sql.DataSource dataSource5 = hikariConfig1.getDataSource();
        hikariConfig1.setAcquireRetries((int) (byte) 0);
        hikariConfig1.setJdbc4ConnectionTest(false);
        java.util.Properties properties10 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig11 = new com.zaxxer.hikari.HikariConfig(properties10);
        boolean boolean12 = hikariConfig11.isInitializationFailFast();
        hikariConfig11.setInitializationFailFast(true);
        javax.sql.DataSource dataSource15 = null;
        hikariConfig11.setDataSource(dataSource15);
        hikariConfig11.setAcquireRetryDelay((long) 'a');
        java.lang.String str19 = hikariConfig11.getConnectionCustomizerClassName();
        java.util.Properties properties20 = hikariConfig11.getDataSourceProperties();
        hikariConfig11.setAutoCommit(false);
        int int23 = hikariConfig11.getMaximumPoolSize();
        java.util.Properties properties24 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig25 = new com.zaxxer.hikari.HikariConfig(properties24);
        boolean boolean26 = hikariConfig25.isInitializationFailFast();
        hikariConfig25.setInitializationFailFast(true);
        int int29 = hikariConfig25.getAcquireRetries();
        long long30 = hikariConfig25.getMaxLifetime();
        hikariConfig25.setMaxLifetime((long) (short) 0);
        long long33 = hikariConfig25.getIdleTimeout();
        boolean boolean34 = hikariConfig25.isRegisterMbeans();
        java.util.Properties properties35 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig36 = new com.zaxxer.hikari.HikariConfig(properties35);
        boolean boolean37 = hikariConfig36.isInitializationFailFast();
        hikariConfig36.setLeakDetectionThreshold((long) '4');
        java.lang.String str40 = hikariConfig36.getConnectionCustomizerClassName();
        java.util.Properties properties41 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig42 = new com.zaxxer.hikari.HikariConfig(properties41);
        boolean boolean43 = hikariConfig42.isInitializationFailFast();
        hikariConfig42.setInitializationFailFast(true);
        javax.sql.DataSource dataSource46 = null;
        hikariConfig42.setDataSource(dataSource46);
        hikariConfig42.setAcquireRetryDelay((long) 'a');
        java.lang.String str50 = hikariConfig42.getConnectionCustomizerClassName();
        java.util.Properties properties51 = hikariConfig42.getDataSourceProperties();
        java.util.Properties properties52 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig53 = new com.zaxxer.hikari.HikariConfig(properties52);
        java.util.Properties properties54 = hikariConfig53.getDataSourceProperties();
        hikariConfig42.setDataSourceProperties(properties54);
        hikariConfig36.setDataSourceProperties(properties54);
        hikariConfig25.setDataSourceProperties(properties54);
        hikariConfig11.setDataSourceProperties(properties54);
        hikariConfig1.setDataSourceProperties(properties54);
        com.zaxxer.hikari.HikariConfig hikariConfig60 = new com.zaxxer.hikari.HikariConfig(properties54);
        boolean boolean61 = hikariConfig60.isAutoCommit();
        hikariConfig60.setConnectionTestQuery("HikariPool-5475");
        hikariConfig60.setLeakDetectionThreshold((long) (byte) 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNull(dataSource5);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNull(str19);
        org.junit.Assert.assertNotNull(properties20);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 60 + "'", int23 == 60);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 3 + "'", int29 == 3);
        org.junit.Assert.assertTrue("'" + long30 + "' != '" + 1800000L + "'", long30 == 1800000L);
        org.junit.Assert.assertTrue("'" + long33 + "' != '" + 600000L + "'", long33 == 600000L);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertNull(str40);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertNull(str50);
        org.junit.Assert.assertNotNull(properties51);
        org.junit.Assert.assertNotNull(properties54);
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + true + "'", boolean61 == true);
    }

    @Test
    public void test03925() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03925");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        boolean boolean2 = hikariConfig1.isInitializationFailFast();
        hikariConfig1.setInitializationFailFast(true);
        hikariConfig1.setAcquireRetryDelay(1L);
        boolean boolean7 = hikariConfig1.isAutoCommit();
        java.util.Properties properties8 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig9 = new com.zaxxer.hikari.HikariConfig(properties8);
        java.util.Properties properties10 = hikariConfig9.getDataSourceProperties();
        hikariConfig1.setDataSourceProperties(properties10);
        hikariConfig1.setAcquireRetries((int) '4');
        hikariConfig1.setAcquireIncrement((int) '#');
        hikariConfig1.setDataSourceClassName("HikariPool-700");
        int int18 = hikariConfig1.getMaximumPoolSize();
        hikariConfig1.setUseInstrumentation(false);
        java.util.Properties properties21 = hikariConfig1.getDataSourceProperties();
        java.lang.String str22 = hikariConfig1.getConnectionCustomizerClassName();
        hikariConfig1.setRegisterMbeans(true);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(properties10);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 60 + "'", int18 == 60);
        org.junit.Assert.assertNotNull(properties21);
        org.junit.Assert.assertNull(str22);
    }

    @Test
    public void test03926() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03926");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        boolean boolean2 = hikariConfig1.isInitializationFailFast();
        hikariConfig1.setInitializationFailFast(true);
        javax.sql.DataSource dataSource5 = null;
        hikariConfig1.setDataSource(dataSource5);
        hikariConfig1.setAcquireRetryDelay((long) 'a');
        java.lang.String str9 = hikariConfig1.getConnectionCustomizerClassName();
        java.util.Properties properties10 = hikariConfig1.getDataSourceProperties();
        com.zaxxer.hikari.HikariConfig hikariConfig11 = new com.zaxxer.hikari.HikariConfig(properties10);
        hikariConfig11.setIdleTimeout((long) '4');
        hikariConfig11.setJdbc4ConnectionTest(true);
        hikariConfig11.setAcquireIncrement((int) (short) -1);
        hikariConfig11.setAutoCommit(false);
        boolean boolean20 = hikariConfig11.isRegisterMbeans();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNotNull(properties10);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
    }

    @Test
    public void test03927() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03927");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        boolean boolean2 = hikariConfig1.isInitializationFailFast();
        hikariConfig1.setInitializationFailFast(true);
        javax.sql.DataSource dataSource5 = null;
        hikariConfig1.setDataSource(dataSource5);
        hikariConfig1.setAcquireRetryDelay((long) 'a');
        java.lang.String str9 = hikariConfig1.getConnectionCustomizerClassName();
        hikariConfig1.setConnectionCustomizerClassName("hi!");
        long long12 = hikariConfig1.getConnectionTimeout();
        long long13 = hikariConfig1.getAcquireRetryDelay();
        boolean boolean14 = hikariConfig1.isJdbc4ConnectionTest();
        hikariConfig1.setUseInstrumentation(false);
        java.lang.Class<?> wildcardClass17 = hikariConfig1.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 5000L + "'", long12 == 5000L);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 0L + "'", long13 == 0L);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test03928() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03928");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        boolean boolean2 = hikariConfig1.isInitializationFailFast();
        int int3 = hikariConfig1.getAcquireIncrement();
        hikariConfig1.setConnectionCustomizerClassName("HikariPool-391");
        boolean boolean6 = hikariConfig1.isJdbc4ConnectionTest();
        java.lang.String str7 = hikariConfig1.getPoolName();
        int int8 = hikariConfig1.getAcquireIncrement();
        int int9 = hikariConfig1.getMinimumPoolSize();
        hikariConfig1.setConnectionCustomizerClassName("HikariPool-414");
        long long12 = hikariConfig1.getLeakDetectionThreshold();
        hikariConfig1.setConnectionInitSql("HikariPool-22687");
        long long15 = hikariConfig1.getConnectionTimeout();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "HikariPool-32274" + "'", str7, "HikariPool-32274");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 10 + "'", int9 == 10);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 5000L + "'", long15 == 5000L);
    }

    @Test
    public void test03929() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03929");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        boolean boolean2 = hikariConfig1.isInitializationFailFast();
        hikariConfig1.setInitializationFailFast(true);
        javax.sql.DataSource dataSource5 = null;
        hikariConfig1.setDataSource(dataSource5);
        hikariConfig1.setAcquireRetryDelay((long) 'a');
        java.lang.String str9 = hikariConfig1.getConnectionCustomizerClassName();
        java.util.Properties properties10 = hikariConfig1.getDataSourceProperties();
        java.util.Properties properties11 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig12 = new com.zaxxer.hikari.HikariConfig(properties11);
        java.util.Properties properties13 = hikariConfig12.getDataSourceProperties();
        hikariConfig1.setDataSourceProperties(properties13);
        java.lang.String str15 = hikariConfig1.getCatalog();
        long long16 = hikariConfig1.getConnectionTimeout();
        int int17 = hikariConfig1.getTransactionIsolation();
        hikariConfig1.setCatalog("HikariPool-442");
        hikariConfig1.setCatalog("HikariPool-627");
        long long22 = hikariConfig1.getMaxLifetime();
        hikariConfig1.setConnectionInitSql("HikariPool-31295");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNotNull(properties10);
        org.junit.Assert.assertNotNull(properties13);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 5000L + "'", long16 == 5000L);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
        org.junit.Assert.assertTrue("'" + long22 + "' != '" + 1800000L + "'", long22 == 1800000L);
    }

    @Test
    public void test03930() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03930");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        java.util.Properties properties2 = hikariConfig1.getDataSourceProperties();
        java.util.Properties properties4 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig5 = new com.zaxxer.hikari.HikariConfig(properties4);
        boolean boolean6 = hikariConfig5.isInitializationFailFast();
        hikariConfig5.setInitializationFailFast(true);
        javax.sql.DataSource dataSource9 = null;
        hikariConfig5.setDataSource(dataSource9);
        hikariConfig5.setAcquireRetryDelay((long) 'a');
        java.lang.String str13 = hikariConfig5.getConnectionCustomizerClassName();
        hikariConfig5.setConnectionCustomizerClassName("hi!");
        java.lang.String str16 = hikariConfig5.getConnectionInitSql();
        hikariConfig1.addDataSourceProperty("hi!", (java.lang.Object) hikariConfig5);
        java.lang.String str18 = hikariConfig5.getCatalog();
        hikariConfig5.setRegisterMbeans(true);
        int int21 = hikariConfig5.getMinimumPoolSize();
        hikariConfig5.setDataSourceClassName("HikariPool-6412");
        hikariConfig5.setAcquireRetryDelay(60L);
        hikariConfig5.setIdleTimeout((long) 60);
        boolean boolean28 = hikariConfig5.isInitializationFailFast();
        org.junit.Assert.assertNotNull(properties2);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 10 + "'", int21 == 10);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
    }

    @Test
    public void test03931() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03931");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        boolean boolean2 = hikariConfig1.isInitializationFailFast();
        hikariConfig1.setInitializationFailFast(true);
        javax.sql.DataSource dataSource5 = null;
        hikariConfig1.setDataSource(dataSource5);
        hikariConfig1.setAcquireRetryDelay((long) 'a');
        java.lang.String str9 = hikariConfig1.getConnectionCustomizerClassName();
        int int10 = hikariConfig1.getAcquireRetries();
        java.lang.String str11 = hikariConfig1.getDataSourceClassName();
        javax.sql.DataSource dataSource12 = null;
        hikariConfig1.setDataSource(dataSource12);
        long long14 = hikariConfig1.getIdleTimeout();
        hikariConfig1.setMaximumPoolSize((int) (byte) 100);
        java.util.Properties properties17 = hikariConfig1.getDataSourceProperties();
        int int18 = hikariConfig1.getAcquireIncrement();
        hikariConfig1.setConnectionTestQuery("HikariPool-15648");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 3 + "'", int10 == 3);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 600000L + "'", long14 == 600000L);
        org.junit.Assert.assertNotNull(properties17);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
    }

    @Test
    public void test03932() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03932");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        boolean boolean2 = hikariConfig1.isInitializationFailFast();
        boolean boolean3 = hikariConfig1.isJdbc4ConnectionTest();
        long long4 = hikariConfig1.getIdleTimeout();
        java.util.Properties properties6 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig7 = new com.zaxxer.hikari.HikariConfig(properties6);
        boolean boolean8 = hikariConfig7.isInitializationFailFast();
        hikariConfig7.setInitializationFailFast(true);
        javax.sql.DataSource dataSource11 = null;
        hikariConfig7.setDataSource(dataSource11);
        hikariConfig7.setAcquireRetryDelay((long) 'a');
        java.lang.String str15 = hikariConfig7.getConnectionCustomizerClassName();
        java.util.Properties properties16 = hikariConfig7.getDataSourceProperties();
        java.util.Properties properties17 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig18 = new com.zaxxer.hikari.HikariConfig(properties17);
        java.util.Properties properties19 = hikariConfig18.getDataSourceProperties();
        hikariConfig7.setDataSourceProperties(properties19);
        int int21 = hikariConfig7.getMinimumPoolSize();
        int int22 = hikariConfig7.getMinimumPoolSize();
        hikariConfig1.addDataSourceProperty("HikariPool-477", (java.lang.Object) hikariConfig7);
        java.lang.String str24 = hikariConfig7.getConnectionInitSql();
        java.util.Properties properties25 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig26 = new com.zaxxer.hikari.HikariConfig(properties25);
        boolean boolean27 = hikariConfig26.isInitializationFailFast();
        hikariConfig26.setInitializationFailFast(true);
        javax.sql.DataSource dataSource30 = null;
        hikariConfig26.setDataSource(dataSource30);
        hikariConfig26.setAcquireRetryDelay((long) 'a');
        java.lang.String str34 = hikariConfig26.getConnectionCustomizerClassName();
        java.lang.String str35 = hikariConfig26.getConnectionInitSql();
        hikariConfig26.setDataSourceClassName("");
        java.util.Properties properties38 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig39 = new com.zaxxer.hikari.HikariConfig(properties38);
        boolean boolean40 = hikariConfig39.isInitializationFailFast();
        hikariConfig39.setInitializationFailFast(true);
        javax.sql.DataSource dataSource43 = null;
        hikariConfig39.setDataSource(dataSource43);
        hikariConfig39.setAcquireRetryDelay((long) 'a');
        java.lang.String str47 = hikariConfig39.getConnectionCustomizerClassName();
        java.util.Properties properties48 = hikariConfig39.getDataSourceProperties();
        java.util.Properties properties49 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig50 = new com.zaxxer.hikari.HikariConfig(properties49);
        java.util.Properties properties51 = hikariConfig50.getDataSourceProperties();
        hikariConfig39.setDataSourceProperties(properties51);
        hikariConfig26.setDataSourceProperties(properties51);
        com.zaxxer.hikari.HikariConfig hikariConfig54 = new com.zaxxer.hikari.HikariConfig(properties51);
        hikariConfig7.setDataSourceProperties(properties51);
        int int56 = hikariConfig7.getTransactionIsolation();
        hikariConfig7.setConnectionCustomizerClassName("");
        int int59 = hikariConfig7.getAcquireIncrement();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 600000L + "'", long4 == 600000L);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertNotNull(properties16);
        org.junit.Assert.assertNotNull(properties19);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 10 + "'", int21 == 10);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 10 + "'", int22 == 10);
        org.junit.Assert.assertNull(str24);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNull(str34);
        org.junit.Assert.assertNull(str35);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertNull(str47);
        org.junit.Assert.assertNotNull(properties48);
        org.junit.Assert.assertNotNull(properties51);
        org.junit.Assert.assertTrue("'" + int56 + "' != '" + (-1) + "'", int56 == (-1));
        org.junit.Assert.assertTrue("'" + int59 + "' != '" + 0 + "'", int59 == 0);
    }

    @Test
    public void test03933() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03933");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        boolean boolean2 = hikariConfig1.isInitializationFailFast();
        hikariConfig1.setLeakDetectionThreshold((long) '4');
        java.lang.String str5 = hikariConfig1.getConnectionCustomizerClassName();
        java.util.Properties properties6 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig7 = new com.zaxxer.hikari.HikariConfig(properties6);
        boolean boolean8 = hikariConfig7.isInitializationFailFast();
        hikariConfig7.setInitializationFailFast(true);
        javax.sql.DataSource dataSource11 = null;
        hikariConfig7.setDataSource(dataSource11);
        hikariConfig7.setAcquireRetryDelay((long) 'a');
        java.lang.String str15 = hikariConfig7.getConnectionCustomizerClassName();
        java.util.Properties properties16 = hikariConfig7.getDataSourceProperties();
        java.util.Properties properties17 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig18 = new com.zaxxer.hikari.HikariConfig(properties17);
        java.util.Properties properties19 = hikariConfig18.getDataSourceProperties();
        hikariConfig7.setDataSourceProperties(properties19);
        hikariConfig1.setDataSourceProperties(properties19);
        java.lang.String str22 = hikariConfig1.getDataSourceClassName();
        hikariConfig1.setConnectionCustomizerClassName("");
        boolean boolean25 = hikariConfig1.isRegisterMbeans();
        int int26 = hikariConfig1.getAcquireIncrement();
        hikariConfig1.setIdleTimeout((long) (byte) 10);
        int int29 = hikariConfig1.getMaximumPoolSize();
        hikariConfig1.setJdbc4ConnectionTest(false);
        long long32 = hikariConfig1.getLeakDetectionThreshold();
        hikariConfig1.setMaximumPoolSize(3);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertNotNull(properties16);
        org.junit.Assert.assertNotNull(properties19);
        org.junit.Assert.assertNull(str22);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 60 + "'", int29 == 60);
        org.junit.Assert.assertTrue("'" + long32 + "' != '" + 52L + "'", long32 == 52L);
    }

    @Test
    public void test03934() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03934");
        // The following exception was thrown during execution in test generation
        try {
            com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig("HikariPool-3780");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Property file HikariPool-3780 was not found.");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test03935() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03935");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        boolean boolean2 = hikariConfig1.isInitializationFailFast();
        hikariConfig1.setInitializationFailFast(true);
        javax.sql.DataSource dataSource5 = null;
        hikariConfig1.setDataSource(dataSource5);
        hikariConfig1.setAcquireRetryDelay((long) 'a');
        java.lang.String str9 = hikariConfig1.getConnectionCustomizerClassName();
        hikariConfig1.setConnectionCustomizerClassName("hi!");
        java.lang.String str12 = hikariConfig1.getConnectionInitSql();
        long long13 = hikariConfig1.getLeakDetectionThreshold();
        long long14 = hikariConfig1.getAcquireRetryDelay();
        int int15 = hikariConfig1.getAcquireRetries();
        hikariConfig1.setCatalog("HikariPool-13241");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 0L + "'", long13 == 0L);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 0L + "'", long14 == 0L);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 3 + "'", int15 == 3);
    }

    @Test
    public void test03936() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03936");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        boolean boolean2 = hikariConfig1.isInitializationFailFast();
        hikariConfig1.setLeakDetectionThreshold((long) '4');
        java.lang.String str5 = hikariConfig1.getConnectionCustomizerClassName();
        java.util.Properties properties6 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig7 = new com.zaxxer.hikari.HikariConfig(properties6);
        boolean boolean8 = hikariConfig7.isInitializationFailFast();
        hikariConfig7.setInitializationFailFast(true);
        javax.sql.DataSource dataSource11 = null;
        hikariConfig7.setDataSource(dataSource11);
        hikariConfig7.setAcquireRetryDelay((long) 'a');
        java.lang.String str15 = hikariConfig7.getConnectionCustomizerClassName();
        java.util.Properties properties16 = hikariConfig7.getDataSourceProperties();
        java.util.Properties properties17 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig18 = new com.zaxxer.hikari.HikariConfig(properties17);
        java.util.Properties properties19 = hikariConfig18.getDataSourceProperties();
        hikariConfig7.setDataSourceProperties(properties19);
        hikariConfig1.setDataSourceProperties(properties19);
        java.lang.String str22 = hikariConfig1.getDataSourceClassName();
        hikariConfig1.setPoolName("hi!");
        hikariConfig1.setConnectionInitSql("HikariPool-184");
        java.lang.String str27 = hikariConfig1.getConnectionInitSql();
        hikariConfig1.setLeakDetectionThreshold(0L);
        int int30 = hikariConfig1.getAcquireIncrement();
        long long31 = hikariConfig1.getMaxLifetime();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertNotNull(properties16);
        org.junit.Assert.assertNotNull(properties19);
        org.junit.Assert.assertNull(str22);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "HikariPool-184" + "'", str27, "HikariPool-184");
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertTrue("'" + long31 + "' != '" + 1800000L + "'", long31 == 1800000L);
    }

    @Test
    public void test03937() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03937");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        boolean boolean2 = hikariConfig1.isInitializationFailFast();
        hikariConfig1.setInitializationFailFast(true);
        javax.sql.DataSource dataSource5 = null;
        hikariConfig1.setDataSource(dataSource5);
        hikariConfig1.setAcquireRetryDelay((long) 'a');
        java.lang.String str9 = hikariConfig1.getConnectionCustomizerClassName();
        int int10 = hikariConfig1.getAcquireRetries();
        java.lang.String str11 = hikariConfig1.getDataSourceClassName();
        hikariConfig1.setIdleTimeout((long) 60);
        hikariConfig1.setAutoCommit(false);
        int int16 = hikariConfig1.getMaximumPoolSize();
        hikariConfig1.setDataSourceClassName("HikariPool-6384");
        long long19 = hikariConfig1.getAcquireRetryDelay();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 3 + "'", int10 == 3);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 60 + "'", int16 == 60);
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 0L + "'", long19 == 0L);
    }

    @Test
    public void test03938() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03938");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        boolean boolean2 = hikariConfig1.isInitializationFailFast();
        hikariConfig1.setInitializationFailFast(true);
        javax.sql.DataSource dataSource5 = null;
        hikariConfig1.setDataSource(dataSource5);
        java.lang.String str7 = hikariConfig1.getCatalog();
        javax.sql.DataSource dataSource8 = null;
        hikariConfig1.setDataSource(dataSource8);
        java.lang.String str10 = hikariConfig1.getCatalog();
        javax.sql.DataSource dataSource11 = hikariConfig1.getDataSource();
        int int12 = hikariConfig1.getMaximumPoolSize();
        long long13 = hikariConfig1.getLeakDetectionThreshold();
        long long14 = hikariConfig1.getIdleTimeout();
        boolean boolean15 = hikariConfig1.isAutoCommit();
        boolean boolean16 = hikariConfig1.isAutoCommit();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(dataSource11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 60 + "'", int12 == 60);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 0L + "'", long13 == 0L);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 600000L + "'", long14 == 600000L);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
    }

    @Test
    public void test03939() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03939");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        boolean boolean2 = hikariConfig1.isInitializationFailFast();
        hikariConfig1.setLeakDetectionThreshold((long) '4');
        int int5 = hikariConfig1.getTransactionIsolation();
        hikariConfig1.setAcquireRetries(0);
        hikariConfig1.setCatalog("HikariPool-700");
        java.lang.String str10 = hikariConfig1.getCatalog();
        java.lang.String str11 = hikariConfig1.getConnectionInitSql();
        boolean boolean12 = hikariConfig1.isAutoCommit();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "HikariPool-700" + "'", str10, "HikariPool-700");
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
    }

    @Test
    public void test03940() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03940");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        boolean boolean2 = hikariConfig1.isInitializationFailFast();
        hikariConfig1.setInitializationFailFast(true);
        boolean boolean5 = hikariConfig1.isJdbc4ConnectionTest();
        java.lang.String str6 = hikariConfig1.getDataSourceClassName();
        boolean boolean7 = hikariConfig1.isJdbc4ConnectionTest();
        java.lang.String str8 = hikariConfig1.getConnectionInitSql();
        hikariConfig1.setAcquireRetries((int) (short) 100);
        long long11 = hikariConfig1.getAcquireRetryDelay();
        int int12 = hikariConfig1.getAcquireIncrement();
        hikariConfig1.setCatalog("HikariPool-17107");
        // The following exception was thrown during execution in test generation
        try {
            hikariConfig1.setConnectionTimeout((long) 32);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: connectionTimeout cannot be less than 100ms");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 0L + "'", long11 == 0L);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
    }

    @Test
    public void test03941() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03941");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        boolean boolean2 = hikariConfig1.isInitializationFailFast();
        hikariConfig1.setInitializationFailFast(true);
        boolean boolean5 = hikariConfig1.isJdbc4ConnectionTest();
        hikariConfig1.setUseInstrumentation(false);
        hikariConfig1.setRegisterMbeans(false);
        java.lang.String str10 = hikariConfig1.getPoolName();
        javax.sql.DataSource dataSource11 = hikariConfig1.getDataSource();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
// flaky:         org.junit.Assert.assertEquals("'" + str10 + "' != '" + "HikariPool-32347" + "'", str10, "HikariPool-32347");
        org.junit.Assert.assertNull(dataSource11);
    }

    @Test
    public void test03942() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03942");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        boolean boolean2 = hikariConfig1.isInitializationFailFast();
        hikariConfig1.setLeakDetectionThreshold((long) '4');
        java.lang.String str5 = hikariConfig1.getConnectionCustomizerClassName();
        java.util.Properties properties6 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig7 = new com.zaxxer.hikari.HikariConfig(properties6);
        boolean boolean8 = hikariConfig7.isInitializationFailFast();
        hikariConfig7.setInitializationFailFast(true);
        javax.sql.DataSource dataSource11 = null;
        hikariConfig7.setDataSource(dataSource11);
        hikariConfig7.setAcquireRetryDelay((long) 'a');
        java.lang.String str15 = hikariConfig7.getConnectionCustomizerClassName();
        java.util.Properties properties16 = hikariConfig7.getDataSourceProperties();
        java.util.Properties properties17 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig18 = new com.zaxxer.hikari.HikariConfig(properties17);
        java.util.Properties properties19 = hikariConfig18.getDataSourceProperties();
        hikariConfig7.setDataSourceProperties(properties19);
        hikariConfig1.setDataSourceProperties(properties19);
        javax.sql.DataSource dataSource22 = hikariConfig1.getDataSource();
        hikariConfig1.setAcquireIncrement((int) (short) -1);
        int int25 = hikariConfig1.getMinimumPoolSize();
        com.zaxxer.hikari.HikariConfig hikariConfig27 = new com.zaxxer.hikari.HikariConfig();
        boolean boolean28 = hikariConfig27.isRegisterMbeans();
        hikariConfig27.setRegisterMbeans(false);
        int int31 = hikariConfig27.getAcquireIncrement();
        hikariConfig1.addDataSourceProperty("HikariPool-5826", (java.lang.Object) int31);
        hikariConfig1.setJdbc4ConnectionTest(false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertNotNull(properties16);
        org.junit.Assert.assertNotNull(properties19);
        org.junit.Assert.assertNull(dataSource22);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 10 + "'", int25 == 10);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 0 + "'", int31 == 0);
    }

    @Test
    public void test03943() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03943");
        // The following exception was thrown during execution in test generation
        try {
            com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig("HikariPool-19509");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Property file HikariPool-19509 was not found.");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test03944() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03944");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        boolean boolean2 = hikariConfig1.isInitializationFailFast();
        boolean boolean3 = hikariConfig1.isJdbc4ConnectionTest();
        hikariConfig1.setDataSourceClassName("hi!");
        boolean boolean6 = hikariConfig1.isInitializationFailFast();
        long long7 = hikariConfig1.getIdleTimeout();
        hikariConfig1.setAutoCommit(false);
        java.util.Properties properties10 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig11 = new com.zaxxer.hikari.HikariConfig(properties10);
        boolean boolean12 = hikariConfig11.isInitializationFailFast();
        hikariConfig11.setInitializationFailFast(true);
        javax.sql.DataSource dataSource15 = null;
        hikariConfig11.setDataSource(dataSource15);
        hikariConfig11.setAcquireRetryDelay((long) 'a');
        java.lang.String str19 = hikariConfig11.getConnectionCustomizerClassName();
        java.lang.String str20 = hikariConfig11.getConnectionInitSql();
        hikariConfig11.setDataSourceClassName("");
        java.util.Properties properties23 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig24 = new com.zaxxer.hikari.HikariConfig(properties23);
        boolean boolean25 = hikariConfig24.isInitializationFailFast();
        hikariConfig24.setInitializationFailFast(true);
        javax.sql.DataSource dataSource28 = null;
        hikariConfig24.setDataSource(dataSource28);
        hikariConfig24.setAcquireRetryDelay((long) 'a');
        java.lang.String str32 = hikariConfig24.getConnectionCustomizerClassName();
        java.util.Properties properties33 = hikariConfig24.getDataSourceProperties();
        java.util.Properties properties34 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig35 = new com.zaxxer.hikari.HikariConfig(properties34);
        java.util.Properties properties36 = hikariConfig35.getDataSourceProperties();
        hikariConfig24.setDataSourceProperties(properties36);
        hikariConfig11.setDataSourceProperties(properties36);
        com.zaxxer.hikari.HikariConfig hikariConfig39 = new com.zaxxer.hikari.HikariConfig(properties36);
        boolean boolean40 = hikariConfig39.isJdbc4ConnectionTest();
        java.util.Properties properties41 = hikariConfig39.getDataSourceProperties();
        hikariConfig1.setDataSourceProperties(properties41);
        boolean boolean43 = hikariConfig1.isInitializationFailFast();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 600000L + "'", long7 == 600000L);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNull(str19);
        org.junit.Assert.assertNull(str20);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNull(str32);
        org.junit.Assert.assertNotNull(properties33);
        org.junit.Assert.assertNotNull(properties36);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + true + "'", boolean40 == true);
        org.junit.Assert.assertNotNull(properties41);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
    }

    @Test
    public void test03945() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03945");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        boolean boolean2 = hikariConfig1.isInitializationFailFast();
        hikariConfig1.setInitializationFailFast(true);
        javax.sql.DataSource dataSource5 = null;
        hikariConfig1.setDataSource(dataSource5);
        java.lang.String str7 = hikariConfig1.getCatalog();
        int int8 = hikariConfig1.getTransactionIsolation();
        long long9 = hikariConfig1.getMaxLifetime();
        java.lang.String str10 = hikariConfig1.getPoolName();
        int int11 = hikariConfig1.getAcquireRetries();
        hikariConfig1.setRegisterMbeans(true);
        hikariConfig1.setJdbc4ConnectionTest(true);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 1800000L + "'", long9 == 1800000L);
// flaky:         org.junit.Assert.assertEquals("'" + str10 + "' != '" + "HikariPool-32366" + "'", str10, "HikariPool-32366");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 3 + "'", int11 == 3);
    }

    @Test
    public void test03946() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03946");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        boolean boolean2 = hikariConfig1.isInitializationFailFast();
        hikariConfig1.setInitializationFailFast(true);
        javax.sql.DataSource dataSource5 = null;
        hikariConfig1.setDataSource(dataSource5);
        hikariConfig1.setAcquireRetryDelay((long) 'a');
        java.lang.String str9 = hikariConfig1.getConnectionCustomizerClassName();
        hikariConfig1.setConnectionCustomizerClassName("hi!");
        java.lang.String str12 = hikariConfig1.getPoolName();
        hikariConfig1.setTransactionIsolation("HikariPool-414");
        hikariConfig1.setLeakDetectionThreshold(10L);
        long long17 = hikariConfig1.getAcquireRetryDelay();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(str9);
// flaky:         org.junit.Assert.assertEquals("'" + str12 + "' != '" + "HikariPool-32369" + "'", str12, "HikariPool-32369");
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 0L + "'", long17 == 0L);
    }

    @Test
    public void test03947() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03947");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        boolean boolean2 = hikariConfig1.isInitializationFailFast();
        hikariConfig1.setInitializationFailFast(true);
        javax.sql.DataSource dataSource5 = null;
        hikariConfig1.setDataSource(dataSource5);
        hikariConfig1.setAcquireRetryDelay((long) 'a');
        java.lang.String str9 = hikariConfig1.getConnectionCustomizerClassName();
        java.util.Properties properties10 = hikariConfig1.getDataSourceProperties();
        java.util.Properties properties11 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig12 = new com.zaxxer.hikari.HikariConfig(properties11);
        java.util.Properties properties13 = hikariConfig12.getDataSourceProperties();
        hikariConfig1.setDataSourceProperties(properties13);
        int int15 = hikariConfig1.getMinimumPoolSize();
        java.lang.String str16 = hikariConfig1.getDataSourceClassName();
        hikariConfig1.setConnectionCustomizerClassName("");
        java.lang.String str19 = hikariConfig1.getConnectionCustomizerClassName();
        long long20 = hikariConfig1.getIdleTimeout();
        hikariConfig1.setAcquireRetryDelay((long) 1);
        java.lang.String str23 = hikariConfig1.getCatalog();
        hikariConfig1.setAutoCommit(true);
        hikariConfig1.setPoolName("HikariPool-12955");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNotNull(properties10);
        org.junit.Assert.assertNotNull(properties13);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 10 + "'", int15 == 10);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 600000L + "'", long20 == 600000L);
        org.junit.Assert.assertNull(str23);
    }

    @Test
    public void test03948() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03948");
        // The following exception was thrown during execution in test generation
        try {
            com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig("HikariPool-28564");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Property file HikariPool-28564 was not found.");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test03949() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03949");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        boolean boolean2 = hikariConfig1.isInitializationFailFast();
        hikariConfig1.setLeakDetectionThreshold((long) '4');
        java.lang.String str5 = hikariConfig1.getConnectionCustomizerClassName();
        java.util.Properties properties6 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig7 = new com.zaxxer.hikari.HikariConfig(properties6);
        boolean boolean8 = hikariConfig7.isInitializationFailFast();
        hikariConfig7.setInitializationFailFast(true);
        javax.sql.DataSource dataSource11 = null;
        hikariConfig7.setDataSource(dataSource11);
        hikariConfig7.setAcquireRetryDelay((long) 'a');
        java.lang.String str15 = hikariConfig7.getConnectionCustomizerClassName();
        java.util.Properties properties16 = hikariConfig7.getDataSourceProperties();
        java.util.Properties properties17 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig18 = new com.zaxxer.hikari.HikariConfig(properties17);
        java.util.Properties properties19 = hikariConfig18.getDataSourceProperties();
        hikariConfig7.setDataSourceProperties(properties19);
        hikariConfig1.setDataSourceProperties(properties19);
        hikariConfig1.setConnectionInitSql("hi!");
        hikariConfig1.setIdleTimeout(600000L);
        long long26 = hikariConfig1.getConnectionTimeout();
        hikariConfig1.setLeakDetectionThreshold(5000L);
        long long29 = hikariConfig1.getConnectionTimeout();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertNotNull(properties16);
        org.junit.Assert.assertNotNull(properties19);
        org.junit.Assert.assertTrue("'" + long26 + "' != '" + 5000L + "'", long26 == 5000L);
        org.junit.Assert.assertTrue("'" + long29 + "' != '" + 5000L + "'", long29 == 5000L);
    }

    @Test
    public void test03950() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03950");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        boolean boolean2 = hikariConfig1.isInitializationFailFast();
        boolean boolean3 = hikariConfig1.isJdbc4ConnectionTest();
        hikariConfig1.addDataSourceProperty("", (java.lang.Object) false);
        java.lang.String str7 = hikariConfig1.getConnectionTestQuery();
        hikariConfig1.setAcquireRetryDelay((long) 100);
        hikariConfig1.addDataSourceProperty("HikariPool-393", (java.lang.Object) (-1.0d));
        int int13 = hikariConfig1.getAcquireIncrement();
        java.util.Properties properties15 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig16 = new com.zaxxer.hikari.HikariConfig(properties15);
        boolean boolean17 = hikariConfig16.isInitializationFailFast();
        hikariConfig16.setInitializationFailFast(true);
        javax.sql.DataSource dataSource20 = null;
        hikariConfig16.setDataSource(dataSource20);
        hikariConfig16.setCatalog("");
        hikariConfig16.setConnectionTestQuery("");
        hikariConfig1.addDataSourceProperty("HikariPool-184", (java.lang.Object) hikariConfig16);
        hikariConfig1.setAcquireRetryDelay(0L);
        hikariConfig1.setAcquireRetries((int) 'a');
        java.util.Properties properties31 = hikariConfig1.getDataSourceProperties();
        // The following exception was thrown during execution in test generation
        try {
            com.zaxxer.hikari.HikariConfig hikariConfig32 = new com.zaxxer.hikari.HikariConfig(properties31);
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException; message: java.beans.IntrospectionException: Method not found: setHikariPool-393");
        } catch (java.lang.RuntimeException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(properties31);
    }

    @Test
    public void test03951() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03951");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        boolean boolean2 = hikariConfig1.isInitializationFailFast();
        hikariConfig1.setInitializationFailFast(true);
        javax.sql.DataSource dataSource5 = null;
        hikariConfig1.setDataSource(dataSource5);
        hikariConfig1.setAcquireRetryDelay((long) 'a');
        java.lang.String str9 = hikariConfig1.getConnectionCustomizerClassName();
        java.util.Properties properties10 = hikariConfig1.getDataSourceProperties();
        java.util.Properties properties11 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig12 = new com.zaxxer.hikari.HikariConfig(properties11);
        java.util.Properties properties13 = hikariConfig12.getDataSourceProperties();
        hikariConfig1.setDataSourceProperties(properties13);
        java.lang.String str15 = hikariConfig1.getCatalog();
        long long16 = hikariConfig1.getConnectionTimeout();
        int int17 = hikariConfig1.getTransactionIsolation();
        hikariConfig1.setCatalog("HikariPool-442");
        long long20 = hikariConfig1.getMaxLifetime();
        long long21 = hikariConfig1.getAcquireRetryDelay();
        hikariConfig1.setAcquireRetryDelay((long) (short) 0);
        boolean boolean24 = hikariConfig1.isRegisterMbeans();
        hikariConfig1.setConnectionCustomizerClassName("HikariPool-11784");
        hikariConfig1.setCatalog("HikariPool-23606");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNotNull(properties10);
        org.junit.Assert.assertNotNull(properties13);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 5000L + "'", long16 == 5000L);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 1800000L + "'", long20 == 1800000L);
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + 0L + "'", long21 == 0L);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
    }

    @Test
    public void test03952() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03952");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        java.util.Properties properties2 = hikariConfig1.getDataSourceProperties();
        java.util.Properties properties4 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig5 = new com.zaxxer.hikari.HikariConfig(properties4);
        boolean boolean6 = hikariConfig5.isInitializationFailFast();
        hikariConfig5.setInitializationFailFast(true);
        javax.sql.DataSource dataSource9 = null;
        hikariConfig5.setDataSource(dataSource9);
        hikariConfig5.setAcquireRetryDelay((long) 'a');
        java.lang.String str13 = hikariConfig5.getConnectionCustomizerClassName();
        hikariConfig5.setConnectionCustomizerClassName("hi!");
        java.lang.String str16 = hikariConfig5.getConnectionInitSql();
        hikariConfig1.addDataSourceProperty("hi!", (java.lang.Object) hikariConfig5);
        long long18 = hikariConfig1.getAcquireRetryDelay();
        int int19 = hikariConfig1.getAcquireRetries();
        hikariConfig1.setMinimumPoolSize((int) (byte) 100);
        java.util.Properties properties22 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig23 = new com.zaxxer.hikari.HikariConfig(properties22);
        boolean boolean24 = hikariConfig23.isInitializationFailFast();
        hikariConfig23.setInitializationFailFast(true);
        javax.sql.DataSource dataSource27 = null;
        hikariConfig23.setDataSource(dataSource27);
        java.lang.String str29 = hikariConfig23.getCatalog();
        hikariConfig23.setConnectionCustomizerClassName("");
        hikariConfig23.setAcquireRetries((int) (byte) 100);
        java.util.Properties properties34 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig35 = new com.zaxxer.hikari.HikariConfig(properties34);
        boolean boolean36 = hikariConfig35.isInitializationFailFast();
        boolean boolean37 = hikariConfig35.isJdbc4ConnectionTest();
        javax.sql.DataSource dataSource38 = null;
        hikariConfig35.setDataSource(dataSource38);
        long long40 = hikariConfig35.getIdleTimeout();
        java.util.Properties properties41 = hikariConfig35.getDataSourceProperties();
        hikariConfig23.setDataSourceProperties(properties41);
        hikariConfig1.setDataSourceProperties(properties41);
        java.lang.String str44 = hikariConfig1.getPoolName();
        hikariConfig1.setTransactionIsolation("HikariPool-888");
        int int47 = hikariConfig1.getMaximumPoolSize();
        hikariConfig1.setCatalog("HikariPool-12192");
        hikariConfig1.setUseInstrumentation(true);
        java.lang.String str52 = hikariConfig1.getPoolName();
        int int53 = hikariConfig1.getAcquireRetries();
        org.junit.Assert.assertNotNull(properties2);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 0L + "'", long18 == 0L);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 3 + "'", int19 == 3);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNull(str29);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + true + "'", boolean37 == true);
        org.junit.Assert.assertTrue("'" + long40 + "' != '" + 600000L + "'", long40 == 600000L);
        org.junit.Assert.assertNotNull(properties41);
// flaky:         org.junit.Assert.assertEquals("'" + str44 + "' != '" + "HikariPool-32388" + "'", str44, "HikariPool-32388");
        org.junit.Assert.assertTrue("'" + int47 + "' != '" + 60 + "'", int47 == 60);
// flaky:         org.junit.Assert.assertEquals("'" + str52 + "' != '" + "HikariPool-32388" + "'", str52, "HikariPool-32388");
        org.junit.Assert.assertTrue("'" + int53 + "' != '" + 3 + "'", int53 == 3);
    }

    @Test
    public void test03953() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03953");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        boolean boolean2 = hikariConfig1.isInitializationFailFast();
        hikariConfig1.setInitializationFailFast(true);
        javax.sql.DataSource dataSource5 = null;
        hikariConfig1.setDataSource(dataSource5);
        hikariConfig1.setAcquireRetryDelay((long) 'a');
        java.lang.String str9 = hikariConfig1.getConnectionCustomizerClassName();
        hikariConfig1.setConnectionCustomizerClassName("hi!");
        long long12 = hikariConfig1.getConnectionTimeout();
        hikariConfig1.setInitializationFailFast(true);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 5000L + "'", long12 == 5000L);
    }

    @Test
    public void test03954() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03954");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        boolean boolean2 = hikariConfig1.isInitializationFailFast();
        hikariConfig1.setInitializationFailFast(true);
        boolean boolean5 = hikariConfig1.isJdbc4ConnectionTest();
        hikariConfig1.setConnectionTestQuery("HikariPool-143");
        hikariConfig1.setMaxLifetime((long) (byte) 1);
        hikariConfig1.setRegisterMbeans(true);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
    }

    @Test
    public void test03955() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03955");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        boolean boolean2 = hikariConfig1.isInitializationFailFast();
        hikariConfig1.setInitializationFailFast(true);
        javax.sql.DataSource dataSource5 = null;
        hikariConfig1.setDataSource(dataSource5);
        hikariConfig1.setAcquireRetryDelay((long) 'a');
        java.lang.String str9 = hikariConfig1.getConnectionCustomizerClassName();
        java.util.Properties properties10 = hikariConfig1.getDataSourceProperties();
        java.util.Properties properties11 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig12 = new com.zaxxer.hikari.HikariConfig(properties11);
        java.util.Properties properties13 = hikariConfig12.getDataSourceProperties();
        hikariConfig1.setDataSourceProperties(properties13);
        java.lang.String str15 = hikariConfig1.getCatalog();
        long long16 = hikariConfig1.getConnectionTimeout();
        java.util.Properties properties17 = hikariConfig1.getDataSourceProperties();
        java.util.Properties properties18 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig19 = new com.zaxxer.hikari.HikariConfig(properties18);
        boolean boolean20 = hikariConfig19.isInitializationFailFast();
        hikariConfig19.setInitializationFailFast(true);
        javax.sql.DataSource dataSource23 = null;
        hikariConfig19.setDataSource(dataSource23);
        hikariConfig19.setAcquireRetryDelay((long) 'a');
        java.lang.String str27 = hikariConfig19.getConnectionCustomizerClassName();
        java.util.Properties properties28 = hikariConfig19.getDataSourceProperties();
        hikariConfig19.setAutoCommit(false);
        hikariConfig19.setInitializationFailFast(false);
        int int33 = hikariConfig19.getMinimumPoolSize();
        java.util.Properties properties34 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig35 = new com.zaxxer.hikari.HikariConfig(properties34);
        java.util.Properties properties36 = hikariConfig35.getDataSourceProperties();
        hikariConfig19.setDataSourceProperties(properties36);
        com.zaxxer.hikari.HikariConfig hikariConfig38 = new com.zaxxer.hikari.HikariConfig(properties36);
        hikariConfig1.setDataSourceProperties(properties36);
        java.util.Properties properties40 = hikariConfig1.getDataSourceProperties();
        hikariConfig1.setConnectionTestQuery("HikariPool-8073");
        hikariConfig1.setAcquireRetries((int) (byte) 10);
        int int45 = hikariConfig1.getAcquireRetries();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNotNull(properties10);
        org.junit.Assert.assertNotNull(properties13);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 5000L + "'", long16 == 5000L);
        org.junit.Assert.assertNotNull(properties17);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNull(str27);
        org.junit.Assert.assertNotNull(properties28);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 10 + "'", int33 == 10);
        org.junit.Assert.assertNotNull(properties36);
        org.junit.Assert.assertNotNull(properties40);
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + 10 + "'", int45 == 10);
    }

    @Test
    public void test03956() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03956");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        boolean boolean2 = hikariConfig1.isInitializationFailFast();
        hikariConfig1.setInitializationFailFast(true);
        javax.sql.DataSource dataSource5 = null;
        hikariConfig1.setDataSource(dataSource5);
        java.lang.String str7 = hikariConfig1.getCatalog();
        int int8 = hikariConfig1.getMinimumPoolSize();
        hikariConfig1.setTransactionIsolation("");
        java.util.Properties properties11 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig12 = new com.zaxxer.hikari.HikariConfig(properties11);
        boolean boolean13 = hikariConfig12.isInitializationFailFast();
        hikariConfig12.setInitializationFailFast(true);
        javax.sql.DataSource dataSource16 = null;
        hikariConfig12.setDataSource(dataSource16);
        hikariConfig12.setAcquireRetryDelay((long) 'a');
        java.lang.String str20 = hikariConfig12.getConnectionCustomizerClassName();
        java.util.Properties properties21 = hikariConfig12.getDataSourceProperties();
        hikariConfig12.setAutoCommit(false);
        int int24 = hikariConfig12.getMaximumPoolSize();
        java.util.Properties properties25 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig26 = new com.zaxxer.hikari.HikariConfig(properties25);
        boolean boolean27 = hikariConfig26.isInitializationFailFast();
        hikariConfig26.setInitializationFailFast(true);
        int int30 = hikariConfig26.getAcquireRetries();
        long long31 = hikariConfig26.getMaxLifetime();
        hikariConfig26.setMaxLifetime((long) (short) 0);
        long long34 = hikariConfig26.getIdleTimeout();
        boolean boolean35 = hikariConfig26.isRegisterMbeans();
        java.util.Properties properties36 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig37 = new com.zaxxer.hikari.HikariConfig(properties36);
        boolean boolean38 = hikariConfig37.isInitializationFailFast();
        hikariConfig37.setLeakDetectionThreshold((long) '4');
        java.lang.String str41 = hikariConfig37.getConnectionCustomizerClassName();
        java.util.Properties properties42 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig43 = new com.zaxxer.hikari.HikariConfig(properties42);
        boolean boolean44 = hikariConfig43.isInitializationFailFast();
        hikariConfig43.setInitializationFailFast(true);
        javax.sql.DataSource dataSource47 = null;
        hikariConfig43.setDataSource(dataSource47);
        hikariConfig43.setAcquireRetryDelay((long) 'a');
        java.lang.String str51 = hikariConfig43.getConnectionCustomizerClassName();
        java.util.Properties properties52 = hikariConfig43.getDataSourceProperties();
        java.util.Properties properties53 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig54 = new com.zaxxer.hikari.HikariConfig(properties53);
        java.util.Properties properties55 = hikariConfig54.getDataSourceProperties();
        hikariConfig43.setDataSourceProperties(properties55);
        hikariConfig37.setDataSourceProperties(properties55);
        hikariConfig26.setDataSourceProperties(properties55);
        hikariConfig12.setDataSourceProperties(properties55);
        hikariConfig1.setDataSourceProperties(properties55);
        com.zaxxer.hikari.HikariConfig hikariConfig61 = new com.zaxxer.hikari.HikariConfig(properties55);
        hikariConfig61.setAutoCommit(true);
        // The following exception was thrown during execution in test generation
        try {
            hikariConfig61.validate();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: one of either dataSource or dataSourceClassName must be specified");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 10 + "'", int8 == 10);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNull(str20);
        org.junit.Assert.assertNotNull(properties21);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 60 + "'", int24 == 60);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 3 + "'", int30 == 3);
        org.junit.Assert.assertTrue("'" + long31 + "' != '" + 1800000L + "'", long31 == 1800000L);
        org.junit.Assert.assertTrue("'" + long34 + "' != '" + 600000L + "'", long34 == 600000L);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertNull(str41);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertNull(str51);
        org.junit.Assert.assertNotNull(properties52);
        org.junit.Assert.assertNotNull(properties55);
    }

    @Test
    public void test03957() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03957");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        boolean boolean2 = hikariConfig1.isInitializationFailFast();
        hikariConfig1.setInitializationFailFast(true);
        javax.sql.DataSource dataSource5 = null;
        hikariConfig1.setDataSource(dataSource5);
        hikariConfig1.setAcquireRetryDelay((long) 'a');
        java.lang.String str9 = hikariConfig1.getConnectionCustomizerClassName();
        hikariConfig1.setConnectionCustomizerClassName("hi!");
        java.lang.String str12 = hikariConfig1.getConnectionInitSql();
        hikariConfig1.setMinimumPoolSize(35);
        java.util.Properties properties16 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig17 = new com.zaxxer.hikari.HikariConfig(properties16);
        boolean boolean18 = hikariConfig17.isInitializationFailFast();
        hikariConfig17.setInitializationFailFast(true);
        boolean boolean21 = hikariConfig17.isJdbc4ConnectionTest();
        long long22 = hikariConfig17.getConnectionTimeout();
        hikariConfig17.setAcquireIncrement(100);
        hikariConfig17.setPoolName("");
        hikariConfig17.setMaximumPoolSize((int) (byte) 100);
        hikariConfig1.addDataSourceProperty("HikariPool-3119", (java.lang.Object) hikariConfig17);
        java.lang.String str30 = hikariConfig17.getPoolName();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertTrue("'" + long22 + "' != '" + 5000L + "'", long22 == 5000L);
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "" + "'", str30, "");
    }

    @Test
    public void test03958() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03958");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        boolean boolean2 = hikariConfig1.isInitializationFailFast();
        hikariConfig1.setInitializationFailFast(true);
        javax.sql.DataSource dataSource5 = null;
        hikariConfig1.setDataSource(dataSource5);
        hikariConfig1.setAcquireRetryDelay((long) 'a');
        java.lang.String str9 = hikariConfig1.getConnectionCustomizerClassName();
        java.lang.String str10 = hikariConfig1.getConnectionInitSql();
        long long11 = hikariConfig1.getLeakDetectionThreshold();
        hikariConfig1.setRegisterMbeans(false);
        hikariConfig1.setMaxLifetime((long) (short) 0);
        long long16 = hikariConfig1.getMaxLifetime();
        java.util.Properties properties18 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig19 = new com.zaxxer.hikari.HikariConfig(properties18);
        boolean boolean20 = hikariConfig19.isInitializationFailFast();
        int int21 = hikariConfig19.getAcquireIncrement();
        java.lang.String str22 = hikariConfig19.getConnectionCustomizerClassName();
        hikariConfig19.setIdleTimeout((long) (byte) 0);
        javax.sql.DataSource dataSource25 = null;
        hikariConfig19.setDataSource(dataSource25);
        hikariConfig19.setMaximumPoolSize(0);
        hikariConfig1.addDataSourceProperty("HikariPool-2136", (java.lang.Object) hikariConfig19);
        long long30 = hikariConfig1.getMaxLifetime();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 0L + "'", long11 == 0L);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 0L + "'", long16 == 0L);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertNull(str22);
        org.junit.Assert.assertTrue("'" + long30 + "' != '" + 0L + "'", long30 == 0L);
    }

    @Test
    public void test03959() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03959");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        boolean boolean2 = hikariConfig1.isInitializationFailFast();
        hikariConfig1.setInitializationFailFast(true);
        javax.sql.DataSource dataSource5 = null;
        hikariConfig1.setDataSource(dataSource5);
        java.lang.String str7 = hikariConfig1.getCatalog();
        int int8 = hikariConfig1.getMinimumPoolSize();
        java.lang.String str9 = hikariConfig1.getCatalog();
        hikariConfig1.setMaximumPoolSize(1);
        hikariConfig1.setIdleTimeout((long) 35);
        boolean boolean14 = hikariConfig1.isAutoCommit();
        long long15 = hikariConfig1.getIdleTimeout();
        java.lang.String str16 = hikariConfig1.getCatalog();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 10 + "'", int8 == 10);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 35L + "'", long15 == 35L);
        org.junit.Assert.assertNull(str16);
    }

    @Test
    public void test03960() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03960");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        boolean boolean2 = hikariConfig1.isInitializationFailFast();
        hikariConfig1.setInitializationFailFast(true);
        javax.sql.DataSource dataSource5 = null;
        hikariConfig1.setDataSource(dataSource5);
        hikariConfig1.setAcquireRetryDelay((long) 'a');
        java.lang.String str9 = hikariConfig1.getConnectionCustomizerClassName();
        java.lang.String str10 = hikariConfig1.getConnectionInitSql();
        hikariConfig1.setDataSourceClassName("");
        java.util.Properties properties13 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig14 = new com.zaxxer.hikari.HikariConfig(properties13);
        boolean boolean15 = hikariConfig14.isInitializationFailFast();
        hikariConfig14.setInitializationFailFast(true);
        javax.sql.DataSource dataSource18 = null;
        hikariConfig14.setDataSource(dataSource18);
        hikariConfig14.setAcquireRetryDelay((long) 'a');
        java.lang.String str22 = hikariConfig14.getConnectionCustomizerClassName();
        java.util.Properties properties23 = hikariConfig14.getDataSourceProperties();
        java.util.Properties properties24 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig25 = new com.zaxxer.hikari.HikariConfig(properties24);
        java.util.Properties properties26 = hikariConfig25.getDataSourceProperties();
        hikariConfig14.setDataSourceProperties(properties26);
        hikariConfig1.setDataSourceProperties(properties26);
        long long29 = hikariConfig1.getLeakDetectionThreshold();
        java.util.Properties properties30 = hikariConfig1.getDataSourceProperties();
        java.lang.String str31 = hikariConfig1.getConnectionCustomizerClassName();
        boolean boolean32 = hikariConfig1.isAutoCommit();
        long long33 = hikariConfig1.getAcquireRetryDelay();
        java.util.Properties properties34 = hikariConfig1.getDataSourceProperties();
        com.zaxxer.hikari.HikariConfig hikariConfig35 = new com.zaxxer.hikari.HikariConfig(properties34);
        hikariConfig35.setPoolName("HikariPool-19643");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNull(str22);
        org.junit.Assert.assertNotNull(properties23);
        org.junit.Assert.assertNotNull(properties26);
        org.junit.Assert.assertTrue("'" + long29 + "' != '" + 0L + "'", long29 == 0L);
        org.junit.Assert.assertNotNull(properties30);
        org.junit.Assert.assertNull(str31);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + true + "'", boolean32 == true);
        org.junit.Assert.assertTrue("'" + long33 + "' != '" + 0L + "'", long33 == 0L);
        org.junit.Assert.assertNotNull(properties34);
    }

    @Test
    public void test03961() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03961");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        boolean boolean2 = hikariConfig1.isInitializationFailFast();
        hikariConfig1.setInitializationFailFast(true);
        boolean boolean5 = hikariConfig1.isJdbc4ConnectionTest();
        long long6 = hikariConfig1.getConnectionTimeout();
        hikariConfig1.setPoolName("hi!");
        hikariConfig1.setAcquireIncrement((int) (byte) 100);
        java.lang.String str11 = hikariConfig1.getDataSourceClassName();
        hikariConfig1.setMaximumPoolSize((int) (byte) 100);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 5000L + "'", long6 == 5000L);
        org.junit.Assert.assertNull(str11);
    }

    @Test
    public void test03962() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03962");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        boolean boolean2 = hikariConfig1.isInitializationFailFast();
        hikariConfig1.setInitializationFailFast(true);
        javax.sql.DataSource dataSource5 = null;
        hikariConfig1.setDataSource(dataSource5);
        hikariConfig1.setAcquireRetryDelay((long) 'a');
        java.lang.String str9 = hikariConfig1.getConnectionCustomizerClassName();
        java.util.Properties properties10 = hikariConfig1.getDataSourceProperties();
        java.util.Properties properties11 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig12 = new com.zaxxer.hikari.HikariConfig(properties11);
        java.util.Properties properties13 = hikariConfig12.getDataSourceProperties();
        hikariConfig1.setDataSourceProperties(properties13);
        int int15 = hikariConfig1.getMinimumPoolSize();
        int int16 = hikariConfig1.getMinimumPoolSize();
        hikariConfig1.setIdleTimeout(0L);
        boolean boolean19 = hikariConfig1.isInitializationFailFast();
        java.lang.String str20 = hikariConfig1.getConnectionCustomizerClassName();
        long long21 = hikariConfig1.getMaxLifetime();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNotNull(properties10);
        org.junit.Assert.assertNotNull(properties13);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 10 + "'", int15 == 10);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 10 + "'", int16 == 10);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertNull(str20);
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + 1800000L + "'", long21 == 1800000L);
    }

    @Test
    public void test03963() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03963");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        boolean boolean2 = hikariConfig1.isInitializationFailFast();
        hikariConfig1.setInitializationFailFast(true);
        javax.sql.DataSource dataSource5 = null;
        hikariConfig1.setDataSource(dataSource5);
        hikariConfig1.setAcquireRetryDelay((long) 'a');
        java.lang.String str9 = hikariConfig1.getConnectionCustomizerClassName();
        java.lang.String str10 = hikariConfig1.getConnectionInitSql();
        boolean boolean11 = hikariConfig1.isRegisterMbeans();
        java.lang.String str12 = hikariConfig1.getCatalog();
        java.util.Properties properties13 = hikariConfig1.getDataSourceProperties();
        com.zaxxer.hikari.HikariConfig hikariConfig14 = new com.zaxxer.hikari.HikariConfig(properties13);
        int int15 = hikariConfig14.getTransactionIsolation();
        java.lang.String str16 = hikariConfig14.getCatalog();
        boolean boolean17 = hikariConfig14.isAutoCommit();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNotNull(properties13);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
    }

    @Test
    public void test03964() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03964");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        boolean boolean2 = hikariConfig1.isInitializationFailFast();
        hikariConfig1.setInitializationFailFast(true);
        java.lang.String str5 = hikariConfig1.getConnectionTestQuery();
        hikariConfig1.setConnectionCustomizerClassName("");
        java.lang.String str8 = hikariConfig1.getConnectionInitSql();
        java.util.Properties properties10 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig11 = new com.zaxxer.hikari.HikariConfig(properties10);
        boolean boolean12 = hikariConfig11.isInitializationFailFast();
        hikariConfig11.setLeakDetectionThreshold((long) '4');
        int int15 = hikariConfig11.getTransactionIsolation();
        hikariConfig11.setMaximumPoolSize((int) (short) 100);
        java.lang.Class<?> wildcardClass18 = hikariConfig11.getClass();
        hikariConfig1.addDataSourceProperty("HikariPool-674", (java.lang.Object) hikariConfig11);
        hikariConfig1.setPoolName("HikariPool-2528");
        long long22 = hikariConfig1.getAcquireRetryDelay();
        java.lang.String str23 = hikariConfig1.getPoolName();
        java.lang.Class<?> wildcardClass24 = hikariConfig1.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass18);
        org.junit.Assert.assertTrue("'" + long22 + "' != '" + 0L + "'", long22 == 0L);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "HikariPool-2528" + "'", str23, "HikariPool-2528");
        org.junit.Assert.assertNotNull(wildcardClass24);
    }

    @Test
    public void test03965() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03965");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        boolean boolean2 = hikariConfig1.isInitializationFailFast();
        hikariConfig1.setLeakDetectionThreshold((long) '4');
        java.lang.String str5 = hikariConfig1.getConnectionCustomizerClassName();
        java.util.Properties properties6 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig7 = new com.zaxxer.hikari.HikariConfig(properties6);
        boolean boolean8 = hikariConfig7.isInitializationFailFast();
        hikariConfig7.setInitializationFailFast(true);
        javax.sql.DataSource dataSource11 = null;
        hikariConfig7.setDataSource(dataSource11);
        hikariConfig7.setAcquireRetryDelay((long) 'a');
        java.lang.String str15 = hikariConfig7.getConnectionCustomizerClassName();
        java.util.Properties properties16 = hikariConfig7.getDataSourceProperties();
        java.util.Properties properties17 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig18 = new com.zaxxer.hikari.HikariConfig(properties17);
        java.util.Properties properties19 = hikariConfig18.getDataSourceProperties();
        hikariConfig7.setDataSourceProperties(properties19);
        hikariConfig1.setDataSourceProperties(properties19);
        hikariConfig1.setConnectionInitSql("hi!");
        hikariConfig1.setIdleTimeout(600000L);
        long long26 = hikariConfig1.getConnectionTimeout();
        boolean boolean27 = hikariConfig1.isJdbc4ConnectionTest();
        long long28 = hikariConfig1.getConnectionTimeout();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertNotNull(properties16);
        org.junit.Assert.assertNotNull(properties19);
        org.junit.Assert.assertTrue("'" + long26 + "' != '" + 5000L + "'", long26 == 5000L);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertTrue("'" + long28 + "' != '" + 5000L + "'", long28 == 5000L);
    }

    @Test
    public void test03966() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03966");
        // The following exception was thrown during execution in test generation
        try {
            com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig("HikariPool-23677");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Property file HikariPool-23677 was not found.");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test03967() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03967");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        boolean boolean2 = hikariConfig1.isInitializationFailFast();
        hikariConfig1.setInitializationFailFast(true);
        java.lang.String str5 = hikariConfig1.getConnectionTestQuery();
        hikariConfig1.setDataSourceClassName("");
        java.util.Properties properties9 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig10 = new com.zaxxer.hikari.HikariConfig(properties9);
        boolean boolean11 = hikariConfig10.isInitializationFailFast();
        hikariConfig10.setInitializationFailFast(true);
        int int14 = hikariConfig10.getAcquireRetries();
        long long15 = hikariConfig10.getMaxLifetime();
        hikariConfig10.setMaxLifetime((long) (short) 0);
        long long18 = hikariConfig10.getIdleTimeout();
        boolean boolean19 = hikariConfig10.isRegisterMbeans();
        long long20 = hikariConfig10.getAcquireRetryDelay();
        hikariConfig1.addDataSourceProperty("HikariPool-184", (java.lang.Object) long20);
        javax.sql.DataSource dataSource22 = null;
        hikariConfig1.setDataSource(dataSource22);
        hikariConfig1.setCatalog("HikariPool-674");
        long long26 = hikariConfig1.getIdleTimeout();
        long long27 = hikariConfig1.getIdleTimeout();
        hikariConfig1.setRegisterMbeans(true);
        // The following exception was thrown during execution in test generation
        try {
            hikariConfig1.setAcquireRetries((int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: acquireRetries cannot be negative");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 3 + "'", int14 == 3);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 1800000L + "'", long15 == 1800000L);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 600000L + "'", long18 == 600000L);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 0L + "'", long20 == 0L);
        org.junit.Assert.assertTrue("'" + long26 + "' != '" + 600000L + "'", long26 == 600000L);
        org.junit.Assert.assertTrue("'" + long27 + "' != '" + 600000L + "'", long27 == 600000L);
    }

    @Test
    public void test03968() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03968");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        boolean boolean2 = hikariConfig1.isInitializationFailFast();
        boolean boolean3 = hikariConfig1.isJdbc4ConnectionTest();
        hikariConfig1.addDataSourceProperty("", (java.lang.Object) false);
        java.lang.String str7 = hikariConfig1.getConnectionTestQuery();
        hikariConfig1.setAcquireRetryDelay((long) 100);
        java.lang.String str10 = hikariConfig1.getDataSourceClassName();
        hikariConfig1.setCatalog("HikariPool-594");
        hikariConfig1.setDataSourceClassName("");
        hikariConfig1.setMaximumPoolSize(60);
        boolean boolean17 = hikariConfig1.isRegisterMbeans();
        hikariConfig1.setConnectionInitSql("");
        long long20 = hikariConfig1.getLeakDetectionThreshold();
        // The following exception was thrown during execution in test generation
        try {
            hikariConfig1.setAcquireRetries((-1));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: acquireRetries cannot be negative");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 0L + "'", long20 == 0L);
    }

    @Test
    public void test03969() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03969");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        boolean boolean1 = hikariConfig0.isRegisterMbeans();
        hikariConfig0.setRegisterMbeans(false);
        hikariConfig0.setConnectionCustomizerClassName("HikariPool-1644");
        java.util.Properties properties6 = hikariConfig0.getDataSourceProperties();
        com.zaxxer.hikari.HikariConfig hikariConfig7 = new com.zaxxer.hikari.HikariConfig(properties6);
        hikariConfig7.setJdbc4ConnectionTest(false);
        hikariConfig7.setDataSourceClassName("HikariPool-27083");
        boolean boolean12 = hikariConfig7.isAutoCommit();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNotNull(properties6);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
    }

    @Test
    public void test03970() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03970");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        boolean boolean2 = hikariConfig1.isInitializationFailFast();
        hikariConfig1.setInitializationFailFast(true);
        javax.sql.DataSource dataSource5 = null;
        hikariConfig1.setDataSource(dataSource5);
        hikariConfig1.setAcquireRetryDelay((long) 'a');
        java.lang.String str9 = hikariConfig1.getConnectionCustomizerClassName();
        int int10 = hikariConfig1.getAcquireRetries();
        boolean boolean11 = hikariConfig1.isJdbc4ConnectionTest();
        hikariConfig1.setMinimumPoolSize((int) 'a');
        hikariConfig1.setAcquireIncrement((int) '4');
        hikariConfig1.setPoolName("HikariPool-2388");
        long long18 = hikariConfig1.getIdleTimeout();
        // The following exception was thrown during execution in test generation
        try {
            hikariConfig1.setConnectionTimeout((long) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: connectionTimeout cannot be less than 100ms");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 3 + "'", int10 == 3);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 600000L + "'", long18 == 600000L);
    }

    @Test
    public void test03971() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03971");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        boolean boolean2 = hikariConfig1.isInitializationFailFast();
        hikariConfig1.setInitializationFailFast(true);
        hikariConfig1.setAcquireRetryDelay(1L);
        hikariConfig1.setAcquireIncrement((int) 'a');
        long long9 = hikariConfig1.getMaxLifetime();
        int int10 = hikariConfig1.getMaximumPoolSize();
        hikariConfig1.setAutoCommit(false);
        int int13 = hikariConfig1.getMaximumPoolSize();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 1800000L + "'", long9 == 1800000L);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 60 + "'", int10 == 60);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 60 + "'", int13 == 60);
    }

    @Test
    public void test03972() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03972");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        boolean boolean2 = hikariConfig1.isInitializationFailFast();
        hikariConfig1.setLeakDetectionThreshold((long) '4');
        int int5 = hikariConfig1.getTransactionIsolation();
        hikariConfig1.setAcquireRetries(0);
        hikariConfig1.setInitializationFailFast(false);
        hikariConfig1.setMaxLifetime((long) 60);
        hikariConfig1.setMaxLifetime((long) 52);
        java.lang.String str14 = hikariConfig1.getConnectionInitSql();
        javax.sql.DataSource dataSource15 = hikariConfig1.getDataSource();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNull(dataSource15);
    }

    @Test
    public void test03973() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03973");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        boolean boolean2 = hikariConfig1.isInitializationFailFast();
        hikariConfig1.setInitializationFailFast(true);
        java.lang.String str5 = hikariConfig1.getConnectionTestQuery();
        boolean boolean6 = hikariConfig1.isRegisterMbeans();
        hikariConfig1.setDataSourceClassName("hi!");
        hikariConfig1.setConnectionInitSql("");
        java.lang.String str11 = hikariConfig1.getCatalog();
        boolean boolean12 = hikariConfig1.isInitializationFailFast();
        java.util.Properties properties14 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig15 = new com.zaxxer.hikari.HikariConfig(properties14);
        boolean boolean16 = hikariConfig15.isInitializationFailFast();
        hikariConfig15.setInitializationFailFast(true);
        java.lang.String str19 = hikariConfig15.getConnectionTestQuery();
        boolean boolean20 = hikariConfig15.isRegisterMbeans();
        hikariConfig15.setDataSourceClassName("hi!");
        hikariConfig15.setConnectionInitSql("");
        java.lang.String str25 = hikariConfig15.getCatalog();
        boolean boolean26 = hikariConfig15.isInitializationFailFast();
        hikariConfig1.addDataSourceProperty("HikariPool-184", (java.lang.Object) boolean26);
        long long28 = hikariConfig1.getAcquireRetryDelay();
        hikariConfig1.setCatalog("HikariPool-143");
        hikariConfig1.setMinimumPoolSize((int) (byte) 10);
        hikariConfig1.setRegisterMbeans(true);
        java.lang.String str35 = hikariConfig1.getCatalog();
        hikariConfig1.setMinimumPoolSize((int) (short) 0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNull(str19);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNull(str25);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertTrue("'" + long28 + "' != '" + 0L + "'", long28 == 0L);
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "HikariPool-143" + "'", str35, "HikariPool-143");
    }

    @Test
    public void test03974() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03974");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        boolean boolean2 = hikariConfig1.isInitializationFailFast();
        hikariConfig1.setInitializationFailFast(true);
        java.lang.String str5 = hikariConfig1.getConnectionTestQuery();
        boolean boolean6 = hikariConfig1.isRegisterMbeans();
        hikariConfig1.setDataSourceClassName("hi!");
        hikariConfig1.setConnectionInitSql("");
        java.lang.String str11 = hikariConfig1.getCatalog();
        boolean boolean12 = hikariConfig1.isInitializationFailFast();
        java.lang.String str13 = hikariConfig1.getDataSourceClassName();
        java.util.Properties properties14 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig15 = new com.zaxxer.hikari.HikariConfig(properties14);
        boolean boolean16 = hikariConfig15.isInitializationFailFast();
        hikariConfig15.setInitializationFailFast(true);
        javax.sql.DataSource dataSource19 = null;
        hikariConfig15.setDataSource(dataSource19);
        hikariConfig15.setAcquireRetryDelay((long) 'a');
        java.lang.String str23 = hikariConfig15.getConnectionCustomizerClassName();
        java.util.Properties properties24 = hikariConfig15.getDataSourceProperties();
        com.zaxxer.hikari.HikariConfig hikariConfig25 = new com.zaxxer.hikari.HikariConfig(properties24);
        hikariConfig1.setDataSourceProperties(properties24);
        hikariConfig1.setRegisterMbeans(true);
        java.lang.String str29 = hikariConfig1.getConnectionCustomizerClassName();
        hikariConfig1.setTransactionIsolation("HikariPool-8791");
        int int32 = hikariConfig1.getMaximumPoolSize();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNull(str23);
        org.junit.Assert.assertNotNull(properties24);
        org.junit.Assert.assertNull(str29);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 60 + "'", int32 == 60);
    }

    @Test
    public void test03975() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03975");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        boolean boolean2 = hikariConfig1.isInitializationFailFast();
        hikariConfig1.setInitializationFailFast(true);
        java.lang.String str5 = hikariConfig1.getConnectionTestQuery();
        hikariConfig1.setDataSourceClassName("");
        java.util.Properties properties9 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig10 = new com.zaxxer.hikari.HikariConfig(properties9);
        boolean boolean11 = hikariConfig10.isInitializationFailFast();
        hikariConfig10.setInitializationFailFast(true);
        int int14 = hikariConfig10.getAcquireRetries();
        long long15 = hikariConfig10.getMaxLifetime();
        hikariConfig10.setMaxLifetime((long) (short) 0);
        long long18 = hikariConfig10.getIdleTimeout();
        boolean boolean19 = hikariConfig10.isRegisterMbeans();
        long long20 = hikariConfig10.getAcquireRetryDelay();
        hikariConfig1.addDataSourceProperty("HikariPool-184", (java.lang.Object) long20);
        hikariConfig1.setConnectionCustomizerClassName("HikariPool-184");
        long long24 = hikariConfig1.getConnectionTimeout();
        java.lang.String str25 = hikariConfig1.getDataSourceClassName();
        hikariConfig1.validate();
        long long27 = hikariConfig1.getAcquireRetryDelay();
        hikariConfig1.setConnectionInitSql("HikariPool-14622");
        hikariConfig1.setRegisterMbeans(false);
        int int32 = hikariConfig1.getMaximumPoolSize();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 3 + "'", int14 == 3);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 1800000L + "'", long15 == 1800000L);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 600000L + "'", long18 == 600000L);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 0L + "'", long20 == 0L);
        org.junit.Assert.assertTrue("'" + long24 + "' != '" + 5000L + "'", long24 == 5000L);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "" + "'", str25, "");
        org.junit.Assert.assertTrue("'" + long27 + "' != '" + 0L + "'", long27 == 0L);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 60 + "'", int32 == 60);
    }

    @Test
    public void test03976() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03976");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        boolean boolean2 = hikariConfig1.isInitializationFailFast();
        hikariConfig1.setInitializationFailFast(true);
        javax.sql.DataSource dataSource5 = null;
        hikariConfig1.setDataSource(dataSource5);
        hikariConfig1.setAcquireRetryDelay((long) 'a');
        java.lang.String str9 = hikariConfig1.getConnectionCustomizerClassName();
        java.util.Properties properties10 = hikariConfig1.getDataSourceProperties();
        hikariConfig1.setAutoCommit(false);
        hikariConfig1.setJdbc4ConnectionTest(false);
        hikariConfig1.setAcquireRetryDelay((long) (short) 100);
        // The following exception was thrown during execution in test generation
        try {
            hikariConfig1.setMinimumPoolSize((int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: minPoolSize cannot be negative");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNotNull(properties10);
    }

    @Test
    public void test03977() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03977");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        boolean boolean2 = hikariConfig1.isInitializationFailFast();
        hikariConfig1.setInitializationFailFast(true);
        javax.sql.DataSource dataSource5 = null;
        hikariConfig1.setDataSource(dataSource5);
        hikariConfig1.setAcquireRetryDelay((long) 'a');
        java.lang.String str9 = hikariConfig1.getConnectionCustomizerClassName();
        java.util.Properties properties10 = hikariConfig1.getDataSourceProperties();
        java.util.Properties properties11 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig12 = new com.zaxxer.hikari.HikariConfig(properties11);
        boolean boolean13 = hikariConfig12.isInitializationFailFast();
        hikariConfig12.setInitializationFailFast(true);
        javax.sql.DataSource dataSource16 = null;
        hikariConfig12.setDataSource(dataSource16);
        hikariConfig12.setAcquireRetryDelay((long) 'a');
        java.lang.String str20 = hikariConfig12.getConnectionCustomizerClassName();
        java.util.Properties properties21 = hikariConfig12.getDataSourceProperties();
        hikariConfig1.setDataSourceProperties(properties21);
        com.zaxxer.hikari.HikariConfig hikariConfig23 = new com.zaxxer.hikari.HikariConfig(properties21);
        hikariConfig23.setConnectionTestQuery("HikariPool-594");
        hikariConfig23.setConnectionCustomizerClassName("HikariPool-2932");
        java.lang.String str28 = hikariConfig23.getConnectionInitSql();
        java.lang.String str29 = hikariConfig23.getDataSourceClassName();
        hikariConfig23.setConnectionTestQuery("HikariPool-16808");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNotNull(properties10);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNull(str20);
        org.junit.Assert.assertNotNull(properties21);
        org.junit.Assert.assertNull(str28);
        org.junit.Assert.assertNull(str29);
    }

    @Test
    public void test03978() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03978");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        boolean boolean2 = hikariConfig1.isInitializationFailFast();
        hikariConfig1.setInitializationFailFast(true);
        javax.sql.DataSource dataSource5 = null;
        hikariConfig1.setDataSource(dataSource5);
        java.lang.String str7 = hikariConfig1.getCatalog();
        int int8 = hikariConfig1.getMinimumPoolSize();
        java.lang.String str9 = hikariConfig1.getCatalog();
        long long10 = hikariConfig1.getLeakDetectionThreshold();
        java.util.Properties properties11 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig12 = new com.zaxxer.hikari.HikariConfig(properties11);
        boolean boolean13 = hikariConfig12.isInitializationFailFast();
        hikariConfig12.setInitializationFailFast(true);
        javax.sql.DataSource dataSource16 = null;
        hikariConfig12.setDataSource(dataSource16);
        hikariConfig12.setAcquireRetryDelay((long) 'a');
        java.lang.String str20 = hikariConfig12.getConnectionCustomizerClassName();
        java.lang.String str21 = hikariConfig12.getConnectionInitSql();
        hikariConfig12.setDataSourceClassName("");
        java.util.Properties properties24 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig25 = new com.zaxxer.hikari.HikariConfig(properties24);
        boolean boolean26 = hikariConfig25.isInitializationFailFast();
        hikariConfig25.setInitializationFailFast(true);
        javax.sql.DataSource dataSource29 = null;
        hikariConfig25.setDataSource(dataSource29);
        hikariConfig25.setAcquireRetryDelay((long) 'a');
        java.lang.String str33 = hikariConfig25.getConnectionCustomizerClassName();
        java.util.Properties properties34 = hikariConfig25.getDataSourceProperties();
        java.util.Properties properties35 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig36 = new com.zaxxer.hikari.HikariConfig(properties35);
        java.util.Properties properties37 = hikariConfig36.getDataSourceProperties();
        hikariConfig25.setDataSourceProperties(properties37);
        hikariConfig12.setDataSourceProperties(properties37);
        hikariConfig1.setDataSourceProperties(properties37);
        com.zaxxer.hikari.HikariConfig hikariConfig41 = new com.zaxxer.hikari.HikariConfig(properties37);
        java.lang.String str42 = hikariConfig41.getPoolName();
        long long43 = hikariConfig41.getAcquireRetryDelay();
        hikariConfig41.setMaxLifetime(0L);
        hikariConfig41.setAutoCommit(false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 10 + "'", int8 == 10);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNull(str20);
        org.junit.Assert.assertNull(str21);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNull(str33);
        org.junit.Assert.assertNotNull(properties34);
        org.junit.Assert.assertNotNull(properties37);
// flaky:         org.junit.Assert.assertEquals("'" + str42 + "' != '" + "HikariPool-32508" + "'", str42, "HikariPool-32508");
        org.junit.Assert.assertTrue("'" + long43 + "' != '" + 0L + "'", long43 == 0L);
    }

    @Test
    public void test03979() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03979");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        boolean boolean2 = hikariConfig1.isInitializationFailFast();
        hikariConfig1.setLeakDetectionThreshold((long) '4');
        java.lang.String str5 = hikariConfig1.getConnectionCustomizerClassName();
        java.util.Properties properties6 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig7 = new com.zaxxer.hikari.HikariConfig(properties6);
        boolean boolean8 = hikariConfig7.isInitializationFailFast();
        hikariConfig7.setInitializationFailFast(true);
        javax.sql.DataSource dataSource11 = null;
        hikariConfig7.setDataSource(dataSource11);
        hikariConfig7.setAcquireRetryDelay((long) 'a');
        java.lang.String str15 = hikariConfig7.getConnectionCustomizerClassName();
        java.util.Properties properties16 = hikariConfig7.getDataSourceProperties();
        java.util.Properties properties17 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig18 = new com.zaxxer.hikari.HikariConfig(properties17);
        java.util.Properties properties19 = hikariConfig18.getDataSourceProperties();
        hikariConfig7.setDataSourceProperties(properties19);
        hikariConfig1.setDataSourceProperties(properties19);
        java.lang.String str22 = hikariConfig1.getDataSourceClassName();
        java.util.Properties properties24 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig25 = new com.zaxxer.hikari.HikariConfig(properties24);
        boolean boolean26 = hikariConfig25.isInitializationFailFast();
        hikariConfig25.setInitializationFailFast(true);
        javax.sql.DataSource dataSource29 = null;
        hikariConfig25.setDataSource(dataSource29);
        java.lang.String str31 = hikariConfig25.getCatalog();
        hikariConfig25.setConnectionCustomizerClassName("hi!");
        hikariConfig25.setLeakDetectionThreshold(1L);
        hikariConfig25.setIdleTimeout((long) 100);
        java.util.Properties properties39 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig40 = new com.zaxxer.hikari.HikariConfig(properties39);
        boolean boolean41 = hikariConfig40.isInitializationFailFast();
        hikariConfig40.setInitializationFailFast(true);
        javax.sql.DataSource dataSource44 = null;
        hikariConfig40.setDataSource(dataSource44);
        java.lang.String str46 = hikariConfig40.getCatalog();
        int int47 = hikariConfig40.getMinimumPoolSize();
        java.lang.String str48 = hikariConfig40.getCatalog();
        long long49 = hikariConfig40.getLeakDetectionThreshold();
        hikariConfig40.setJdbc4ConnectionTest(false);
        boolean boolean52 = hikariConfig40.isInitializationFailFast();
        java.util.Properties properties53 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig54 = new com.zaxxer.hikari.HikariConfig(properties53);
        boolean boolean55 = hikariConfig54.isInitializationFailFast();
        hikariConfig54.setInitializationFailFast(true);
        int int58 = hikariConfig54.getAcquireRetries();
        long long59 = hikariConfig54.getMaxLifetime();
        java.util.Properties properties60 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig61 = new com.zaxxer.hikari.HikariConfig(properties60);
        boolean boolean62 = hikariConfig61.isInitializationFailFast();
        javax.sql.DataSource dataSource63 = null;
        hikariConfig61.setDataSource(dataSource63);
        java.util.Properties properties65 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig66 = new com.zaxxer.hikari.HikariConfig(properties65);
        boolean boolean67 = hikariConfig66.isInitializationFailFast();
        hikariConfig66.setInitializationFailFast(true);
        boolean boolean70 = hikariConfig66.isJdbc4ConnectionTest();
        long long71 = hikariConfig66.getConnectionTimeout();
        hikariConfig66.setPoolName("hi!");
        hikariConfig66.setAcquireIncrement((int) (byte) 100);
        java.util.Properties properties76 = hikariConfig66.getDataSourceProperties();
        hikariConfig61.setDataSourceProperties(properties76);
        hikariConfig54.setDataSourceProperties(properties76);
        com.zaxxer.hikari.HikariConfig hikariConfig79 = new com.zaxxer.hikari.HikariConfig(properties76);
        com.zaxxer.hikari.HikariConfig hikariConfig80 = new com.zaxxer.hikari.HikariConfig(properties76);
        hikariConfig40.setDataSourceProperties(properties76);
        int int82 = hikariConfig40.getMaximumPoolSize();
        hikariConfig25.addDataSourceProperty("HikariPool-414", (java.lang.Object) int82);
        long long84 = hikariConfig25.getLeakDetectionThreshold();
        hikariConfig1.addDataSourceProperty("HikariPool-594", (java.lang.Object) hikariConfig25);
        java.util.Properties properties86 = hikariConfig1.getDataSourceProperties();
        long long87 = hikariConfig1.getMaxLifetime();
        hikariConfig1.setInitializationFailFast(true);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertNotNull(properties16);
        org.junit.Assert.assertNotNull(properties19);
        org.junit.Assert.assertNull(str22);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNull(str31);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertNull(str46);
        org.junit.Assert.assertTrue("'" + int47 + "' != '" + 10 + "'", int47 == 10);
        org.junit.Assert.assertNull(str48);
        org.junit.Assert.assertTrue("'" + long49 + "' != '" + 0L + "'", long49 == 0L);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + true + "'", boolean52 == true);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + false + "'", boolean55 == false);
        org.junit.Assert.assertTrue("'" + int58 + "' != '" + 3 + "'", int58 == 3);
        org.junit.Assert.assertTrue("'" + long59 + "' != '" + 1800000L + "'", long59 == 1800000L);
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + false + "'", boolean62 == false);
        org.junit.Assert.assertTrue("'" + boolean67 + "' != '" + false + "'", boolean67 == false);
        org.junit.Assert.assertTrue("'" + boolean70 + "' != '" + true + "'", boolean70 == true);
        org.junit.Assert.assertTrue("'" + long71 + "' != '" + 5000L + "'", long71 == 5000L);
        org.junit.Assert.assertNotNull(properties76);
        org.junit.Assert.assertTrue("'" + int82 + "' != '" + 60 + "'", int82 == 60);
        org.junit.Assert.assertTrue("'" + long84 + "' != '" + 1L + "'", long84 == 1L);
        org.junit.Assert.assertNotNull(properties86);
        org.junit.Assert.assertTrue("'" + long87 + "' != '" + 1800000L + "'", long87 == 1800000L);
    }

    @Test
    public void test03980() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03980");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        boolean boolean2 = hikariConfig1.isInitializationFailFast();
        hikariConfig1.setInitializationFailFast(true);
        boolean boolean5 = hikariConfig1.isJdbc4ConnectionTest();
        long long6 = hikariConfig1.getConnectionTimeout();
        hikariConfig1.setAcquireIncrement(100);
        hikariConfig1.setConnectionTestQuery("HikariPool-5412");
        hikariConfig1.setAutoCommit(true);
        hikariConfig1.setRegisterMbeans(false);
        // The following exception was thrown during execution in test generation
        try {
            hikariConfig1.setConnectionTimeout((long) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: connectionTimeout cannot be less than 100ms");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 5000L + "'", long6 == 5000L);
    }

    @Test
    public void test03981() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03981");
        // The following exception was thrown during execution in test generation
        try {
            com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig("HikariPool-14687");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Property file HikariPool-14687 was not found.");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test03982() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03982");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        boolean boolean2 = hikariConfig1.isInitializationFailFast();
        hikariConfig1.setInitializationFailFast(true);
        javax.sql.DataSource dataSource5 = null;
        hikariConfig1.setDataSource(dataSource5);
        hikariConfig1.setAcquireRetryDelay((long) 'a');
        java.lang.String str9 = hikariConfig1.getConnectionCustomizerClassName();
        java.util.Properties properties10 = hikariConfig1.getDataSourceProperties();
        hikariConfig1.setAutoCommit(false);
        int int13 = hikariConfig1.getMaximumPoolSize();
        java.util.Properties properties14 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig15 = new com.zaxxer.hikari.HikariConfig(properties14);
        boolean boolean16 = hikariConfig15.isInitializationFailFast();
        hikariConfig15.setInitializationFailFast(true);
        int int19 = hikariConfig15.getAcquireRetries();
        long long20 = hikariConfig15.getMaxLifetime();
        hikariConfig15.setMaxLifetime((long) (short) 0);
        long long23 = hikariConfig15.getIdleTimeout();
        boolean boolean24 = hikariConfig15.isRegisterMbeans();
        java.util.Properties properties25 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig26 = new com.zaxxer.hikari.HikariConfig(properties25);
        boolean boolean27 = hikariConfig26.isInitializationFailFast();
        hikariConfig26.setLeakDetectionThreshold((long) '4');
        java.lang.String str30 = hikariConfig26.getConnectionCustomizerClassName();
        java.util.Properties properties31 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig32 = new com.zaxxer.hikari.HikariConfig(properties31);
        boolean boolean33 = hikariConfig32.isInitializationFailFast();
        hikariConfig32.setInitializationFailFast(true);
        javax.sql.DataSource dataSource36 = null;
        hikariConfig32.setDataSource(dataSource36);
        hikariConfig32.setAcquireRetryDelay((long) 'a');
        java.lang.String str40 = hikariConfig32.getConnectionCustomizerClassName();
        java.util.Properties properties41 = hikariConfig32.getDataSourceProperties();
        java.util.Properties properties42 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig43 = new com.zaxxer.hikari.HikariConfig(properties42);
        java.util.Properties properties44 = hikariConfig43.getDataSourceProperties();
        hikariConfig32.setDataSourceProperties(properties44);
        hikariConfig26.setDataSourceProperties(properties44);
        hikariConfig15.setDataSourceProperties(properties44);
        hikariConfig1.setDataSourceProperties(properties44);
        hikariConfig1.setAcquireRetries(10);
        hikariConfig1.setConnectionInitSql("HikariPool-934");
        java.lang.String str53 = hikariConfig1.getConnectionCustomizerClassName();
        hikariConfig1.setConnectionTestQuery("HikariPool-9494");
        hikariConfig1.setIdleTimeout((long) (byte) 1);
        hikariConfig1.setLeakDetectionThreshold((long) 1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNotNull(properties10);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 60 + "'", int13 == 60);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 3 + "'", int19 == 3);
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 1800000L + "'", long20 == 1800000L);
        org.junit.Assert.assertTrue("'" + long23 + "' != '" + 600000L + "'", long23 == 600000L);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNull(str30);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertNull(str40);
        org.junit.Assert.assertNotNull(properties41);
        org.junit.Assert.assertNotNull(properties44);
        org.junit.Assert.assertNull(str53);
    }

    @Test
    public void test03983() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03983");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        boolean boolean2 = hikariConfig1.isInitializationFailFast();
        hikariConfig1.setInitializationFailFast(true);
        java.lang.String str5 = hikariConfig1.getConnectionTestQuery();
        boolean boolean6 = hikariConfig1.isRegisterMbeans();
        hikariConfig1.setDataSourceClassName("hi!");
        hikariConfig1.setConnectionInitSql("");
        java.lang.String str11 = hikariConfig1.getCatalog();
        boolean boolean12 = hikariConfig1.isInitializationFailFast();
        java.lang.String str13 = hikariConfig1.getDataSourceClassName();
        java.util.Properties properties14 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig15 = new com.zaxxer.hikari.HikariConfig(properties14);
        boolean boolean16 = hikariConfig15.isInitializationFailFast();
        hikariConfig15.setInitializationFailFast(true);
        javax.sql.DataSource dataSource19 = null;
        hikariConfig15.setDataSource(dataSource19);
        hikariConfig15.setAcquireRetryDelay((long) 'a');
        java.lang.String str23 = hikariConfig15.getConnectionCustomizerClassName();
        java.util.Properties properties24 = hikariConfig15.getDataSourceProperties();
        com.zaxxer.hikari.HikariConfig hikariConfig25 = new com.zaxxer.hikari.HikariConfig(properties24);
        hikariConfig1.setDataSourceProperties(properties24);
        hikariConfig1.setDataSourceClassName("HikariPool-5127");
        hikariConfig1.setMinimumPoolSize((int) ' ');
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNull(str23);
        org.junit.Assert.assertNotNull(properties24);
    }

    @Test
    public void test03984() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03984");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        boolean boolean2 = hikariConfig1.isInitializationFailFast();
        hikariConfig1.setInitializationFailFast(true);
        javax.sql.DataSource dataSource5 = null;
        hikariConfig1.setDataSource(dataSource5);
        hikariConfig1.setAcquireRetryDelay((long) 'a');
        java.lang.String str9 = hikariConfig1.getConnectionCustomizerClassName();
        java.util.Properties properties10 = hikariConfig1.getDataSourceProperties();
        java.util.Properties properties11 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig12 = new com.zaxxer.hikari.HikariConfig(properties11);
        boolean boolean13 = hikariConfig12.isInitializationFailFast();
        hikariConfig12.setInitializationFailFast(true);
        javax.sql.DataSource dataSource16 = null;
        hikariConfig12.setDataSource(dataSource16);
        hikariConfig12.setAcquireRetryDelay((long) 'a');
        java.lang.String str20 = hikariConfig12.getConnectionCustomizerClassName();
        java.util.Properties properties21 = hikariConfig12.getDataSourceProperties();
        hikariConfig1.setDataSourceProperties(properties21);
        com.zaxxer.hikari.HikariConfig hikariConfig23 = new com.zaxxer.hikari.HikariConfig(properties21);
        long long24 = hikariConfig23.getLeakDetectionThreshold();
        java.lang.String str25 = hikariConfig23.getCatalog();
        long long26 = hikariConfig23.getMaxLifetime();
        java.util.Properties properties28 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig29 = new com.zaxxer.hikari.HikariConfig(properties28);
        boolean boolean30 = hikariConfig29.isInitializationFailFast();
        hikariConfig29.setInitializationFailFast(true);
        int int33 = hikariConfig29.getAcquireRetries();
        java.util.Properties properties35 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig36 = new com.zaxxer.hikari.HikariConfig(properties35);
        boolean boolean37 = hikariConfig36.isInitializationFailFast();
        hikariConfig36.setInitializationFailFast(true);
        boolean boolean40 = hikariConfig36.isJdbc4ConnectionTest();
        long long41 = hikariConfig36.getConnectionTimeout();
        hikariConfig36.setPoolName("hi!");
        hikariConfig36.setAcquireIncrement((int) (byte) 100);
        java.util.Properties properties46 = hikariConfig36.getDataSourceProperties();
        hikariConfig29.addDataSourceProperty("HikariPool-1465", (java.lang.Object) properties46);
        hikariConfig23.addDataSourceProperty("HikariPool-6469", (java.lang.Object) properties46);
        long long49 = hikariConfig23.getLeakDetectionThreshold();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNotNull(properties10);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNull(str20);
        org.junit.Assert.assertNotNull(properties21);
        org.junit.Assert.assertTrue("'" + long24 + "' != '" + 0L + "'", long24 == 0L);
        org.junit.Assert.assertNull(str25);
        org.junit.Assert.assertTrue("'" + long26 + "' != '" + 1800000L + "'", long26 == 1800000L);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 3 + "'", int33 == 3);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + true + "'", boolean40 == true);
        org.junit.Assert.assertTrue("'" + long41 + "' != '" + 5000L + "'", long41 == 5000L);
        org.junit.Assert.assertNotNull(properties46);
        org.junit.Assert.assertTrue("'" + long49 + "' != '" + 0L + "'", long49 == 0L);
    }

    @Test
    public void test03985() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03985");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        boolean boolean2 = hikariConfig1.isInitializationFailFast();
        hikariConfig1.setInitializationFailFast(true);
        hikariConfig1.setAcquireRetryDelay(1L);
        hikariConfig1.setConnectionTimeout(600000L);
        hikariConfig1.setConnectionCustomizerClassName("HikariPool-143");
        java.lang.String str11 = hikariConfig1.getConnectionTestQuery();
        java.util.Properties properties12 = hikariConfig1.getDataSourceProperties();
        java.lang.String str13 = hikariConfig1.getCatalog();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNotNull(properties12);
        org.junit.Assert.assertNull(str13);
    }

    @Test
    public void test03986() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03986");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        boolean boolean2 = hikariConfig1.isInitializationFailFast();
        hikariConfig1.setInitializationFailFast(true);
        javax.sql.DataSource dataSource5 = null;
        hikariConfig1.setDataSource(dataSource5);
        hikariConfig1.setAcquireRetryDelay((long) 'a');
        java.lang.String str9 = hikariConfig1.getConnectionCustomizerClassName();
        java.lang.String str10 = hikariConfig1.getConnectionInitSql();
        long long11 = hikariConfig1.getLeakDetectionThreshold();
        hikariConfig1.setConnectionTestQuery("HikariPool-393");
        hikariConfig1.setJdbc4ConnectionTest(false);
        hikariConfig1.setAcquireRetryDelay((long) (-1));
        java.lang.String str18 = hikariConfig1.getConnectionInitSql();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 0L + "'", long11 == 0L);
        org.junit.Assert.assertNull(str18);
    }

    @Test
    public void test03987() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03987");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        boolean boolean2 = hikariConfig1.isInitializationFailFast();
        hikariConfig1.setInitializationFailFast(true);
        int int5 = hikariConfig1.getAcquireRetries();
        long long6 = hikariConfig1.getMaxLifetime();
        javax.sql.DataSource dataSource7 = hikariConfig1.getDataSource();
        hikariConfig1.setConnectionTestQuery("");
        hikariConfig1.setAutoCommit(false);
        // The following exception was thrown during execution in test generation
        try {
            hikariConfig1.setConnectionTimeout((long) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: connectionTimeout cannot be less than 100ms");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 3 + "'", int5 == 3);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 1800000L + "'", long6 == 1800000L);
        org.junit.Assert.assertNull(dataSource7);
    }

    @Test
    public void test03988() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03988");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        boolean boolean2 = hikariConfig1.isInitializationFailFast();
        hikariConfig1.setLeakDetectionThreshold((long) '4');
        int int5 = hikariConfig1.getTransactionIsolation();
        hikariConfig1.setJdbc4ConnectionTest(false);
        hikariConfig1.setDataSourceClassName("HikariPool-393");
        java.lang.String str10 = hikariConfig1.getDataSourceClassName();
        long long11 = hikariConfig1.getConnectionTimeout();
        long long12 = hikariConfig1.getLeakDetectionThreshold();
        hikariConfig1.setMaxLifetime((long) 60);
        int int15 = hikariConfig1.getMinimumPoolSize();
        long long16 = hikariConfig1.getMaxLifetime();
        java.lang.Class<?> wildcardClass17 = hikariConfig1.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "HikariPool-393" + "'", str10, "HikariPool-393");
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 5000L + "'", long11 == 5000L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 52L + "'", long12 == 52L);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 10 + "'", int15 == 10);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 60L + "'", long16 == 60L);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test03989() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03989");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        boolean boolean2 = hikariConfig1.isInitializationFailFast();
        int int3 = hikariConfig1.getAcquireIncrement();
        hikariConfig1.setCatalog("HikariPool-143");
        hikariConfig1.setMaximumPoolSize((int) '#');
        hikariConfig1.setAutoCommit(true);
        java.util.Properties properties10 = hikariConfig1.getDataSourceProperties();
        com.zaxxer.hikari.HikariConfig hikariConfig11 = new com.zaxxer.hikari.HikariConfig(properties10);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(properties10);
    }

    @Test
    public void test03990() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03990");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        java.util.Properties properties2 = hikariConfig1.getDataSourceProperties();
        java.util.Properties properties4 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig5 = new com.zaxxer.hikari.HikariConfig(properties4);
        boolean boolean6 = hikariConfig5.isInitializationFailFast();
        hikariConfig5.setInitializationFailFast(true);
        javax.sql.DataSource dataSource9 = null;
        hikariConfig5.setDataSource(dataSource9);
        hikariConfig5.setAcquireRetryDelay((long) 'a');
        java.lang.String str13 = hikariConfig5.getConnectionCustomizerClassName();
        hikariConfig5.setConnectionCustomizerClassName("hi!");
        java.lang.String str16 = hikariConfig5.getConnectionInitSql();
        hikariConfig1.addDataSourceProperty("hi!", (java.lang.Object) hikariConfig5);
        java.lang.String str18 = hikariConfig1.getConnectionCustomizerClassName();
        javax.sql.DataSource dataSource19 = hikariConfig1.getDataSource();
        hikariConfig1.setMaximumPoolSize((int) (short) 100);
        org.junit.Assert.assertNotNull(properties2);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertNull(dataSource19);
    }

    @Test
    public void test03991() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03991");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        hikariConfig1.setTransactionIsolation("");
        int int4 = hikariConfig1.getAcquireIncrement();
        javax.sql.DataSource dataSource5 = hikariConfig1.getDataSource();
        hikariConfig1.setAcquireRetries((int) (byte) 0);
        hikariConfig1.setMaxLifetime((long) 'a');
        int int10 = hikariConfig1.getMaximumPoolSize();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNull(dataSource5);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 60 + "'", int10 == 60);
    }

    @Test
    public void test03992() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03992");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        boolean boolean2 = hikariConfig1.isInitializationFailFast();
        hikariConfig1.setInitializationFailFast(true);
        javax.sql.DataSource dataSource5 = null;
        hikariConfig1.setDataSource(dataSource5);
        hikariConfig1.setAcquireRetryDelay((long) 'a');
        java.lang.String str9 = hikariConfig1.getConnectionCustomizerClassName();
        int int10 = hikariConfig1.getAcquireRetries();
        hikariConfig1.setConnectionCustomizerClassName("");
        hikariConfig1.setAcquireRetries((int) (short) 100);
        java.util.Properties properties16 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig17 = new com.zaxxer.hikari.HikariConfig(properties16);
        boolean boolean18 = hikariConfig17.isInitializationFailFast();
        hikariConfig17.setInitializationFailFast(true);
        javax.sql.DataSource dataSource21 = null;
        hikariConfig17.setDataSource(dataSource21);
        hikariConfig17.setAcquireRetryDelay((long) 'a');
        java.lang.String str25 = hikariConfig17.getConnectionCustomizerClassName();
        java.lang.String str26 = hikariConfig17.getConnectionInitSql();
        boolean boolean27 = hikariConfig17.isInitializationFailFast();
        hikariConfig17.setMaxLifetime((long) (short) 1);
        hikariConfig1.addDataSourceProperty("HikariPool-393", (java.lang.Object) (short) 1);
        hikariConfig1.setMaximumPoolSize(10);
        int int33 = hikariConfig1.getMinimumPoolSize();
        java.lang.String str34 = hikariConfig1.getConnectionCustomizerClassName();
        boolean boolean35 = hikariConfig1.isJdbc4ConnectionTest();
        int int36 = hikariConfig1.getAcquireIncrement();
        int int37 = hikariConfig1.getMinimumPoolSize();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 3 + "'", int10 == 3);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNull(str25);
        org.junit.Assert.assertNull(str26);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 10 + "'", int33 == 10);
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "" + "'", str34, "");
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + true + "'", boolean35 == true);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 0 + "'", int36 == 0);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 10 + "'", int37 == 10);
    }

    @Test
    public void test03993() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03993");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        boolean boolean2 = hikariConfig1.isInitializationFailFast();
        int int3 = hikariConfig1.getAcquireIncrement();
        hikariConfig1.setConnectionCustomizerClassName("HikariPool-391");
        boolean boolean6 = hikariConfig1.isJdbc4ConnectionTest();
        java.lang.String str7 = hikariConfig1.getPoolName();
        int int8 = hikariConfig1.getAcquireIncrement();
        int int9 = hikariConfig1.getMinimumPoolSize();
        hikariConfig1.setMaxLifetime((long) (byte) 100);
        boolean boolean12 = hikariConfig1.isRegisterMbeans();
        java.lang.String str13 = hikariConfig1.getPoolName();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "HikariPool-32575" + "'", str7, "HikariPool-32575");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 10 + "'", int9 == 10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "HikariPool-32575" + "'", str13, "HikariPool-32575");
    }

    @Test
    public void test03994() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03994");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        boolean boolean2 = hikariConfig1.isInitializationFailFast();
        hikariConfig1.setInitializationFailFast(true);
        javax.sql.DataSource dataSource5 = null;
        hikariConfig1.setDataSource(dataSource5);
        hikariConfig1.setAcquireRetryDelay((long) 'a');
        java.lang.String str9 = hikariConfig1.getConnectionCustomizerClassName();
        int int10 = hikariConfig1.getAcquireRetries();
        java.lang.String str11 = hikariConfig1.getDataSourceClassName();
        hikariConfig1.setIdleTimeout((long) 60);
        hikariConfig1.setAutoCommit(false);
        int int16 = hikariConfig1.getMaximumPoolSize();
        hikariConfig1.setAcquireRetryDelay((long) (short) -1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 3 + "'", int10 == 3);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 60 + "'", int16 == 60);
    }

    @Test
    public void test03995() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03995");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        boolean boolean2 = hikariConfig1.isInitializationFailFast();
        hikariConfig1.setInitializationFailFast(true);
        javax.sql.DataSource dataSource5 = null;
        hikariConfig1.setDataSource(dataSource5);
        java.lang.String str7 = hikariConfig1.getCatalog();
        int int8 = hikariConfig1.getTransactionIsolation();
        int int9 = hikariConfig1.getMaximumPoolSize();
        hikariConfig1.setInitializationFailFast(true);
        boolean boolean12 = hikariConfig1.isInitializationFailFast();
        int int13 = hikariConfig1.getMinimumPoolSize();
        boolean boolean14 = hikariConfig1.isJdbc4ConnectionTest();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 60 + "'", int9 == 60);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 10 + "'", int13 == 10);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
    }

    @Test
    public void test03996() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03996");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        boolean boolean2 = hikariConfig1.isInitializationFailFast();
        int int3 = hikariConfig1.getAcquireIncrement();
        java.lang.String str4 = hikariConfig1.getConnectionCustomizerClassName();
        hikariConfig1.setIdleTimeout((long) (byte) 0);
        hikariConfig1.setTransactionIsolation("HikariPool-184");
        boolean boolean9 = hikariConfig1.isJdbc4ConnectionTest();
        boolean boolean10 = hikariConfig1.isJdbc4ConnectionTest();
        hikariConfig1.setPoolName("HikariPool-1195");
        hikariConfig1.setCatalog("HikariPool-5236");
        int int15 = hikariConfig1.getAcquireIncrement();
        long long16 = hikariConfig1.getConnectionTimeout();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 5000L + "'", long16 == 5000L);
    }

    @Test
    public void test03997() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03997");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        boolean boolean2 = hikariConfig1.isInitializationFailFast();
        boolean boolean3 = hikariConfig1.isJdbc4ConnectionTest();
        hikariConfig1.addDataSourceProperty("", (java.lang.Object) false);
        hikariConfig1.setRegisterMbeans(true);
        hikariConfig1.setIdleTimeout((long) '4');
        hikariConfig1.setMaximumPoolSize((int) (byte) 10);
        hikariConfig1.setAcquireRetryDelay(1L);
        int int15 = hikariConfig1.getTransactionIsolation();
        hikariConfig1.setIdleTimeout((long) ' ');
        hikariConfig1.setAcquireRetries((int) (short) 1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
    }

    @Test
    public void test03998() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03998");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        boolean boolean2 = hikariConfig1.isInitializationFailFast();
        hikariConfig1.setInitializationFailFast(true);
        java.lang.String str5 = hikariConfig1.getConnectionTestQuery();
        boolean boolean6 = hikariConfig1.isRegisterMbeans();
        hikariConfig1.setDataSourceClassName("hi!");
        hikariConfig1.setInitializationFailFast(true);
        hikariConfig1.setMaxLifetime((long) (short) 1);
        javax.sql.DataSource dataSource13 = hikariConfig1.getDataSource();
        boolean boolean14 = hikariConfig1.isAutoCommit();
        java.lang.String str15 = hikariConfig1.getConnectionTestQuery();
        java.util.Properties properties16 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig17 = new com.zaxxer.hikari.HikariConfig(properties16);
        boolean boolean18 = hikariConfig17.isInitializationFailFast();
        hikariConfig17.setInitializationFailFast(true);
        javax.sql.DataSource dataSource21 = null;
        hikariConfig17.setDataSource(dataSource21);
        hikariConfig17.setAcquireRetryDelay((long) 'a');
        java.lang.String str25 = hikariConfig17.getConnectionCustomizerClassName();
        java.lang.String str26 = hikariConfig17.getConnectionInitSql();
        boolean boolean27 = hikariConfig17.isInitializationFailFast();
        hikariConfig17.setMaxLifetime((long) (short) 1);
        javax.sql.DataSource dataSource30 = hikariConfig17.getDataSource();
        boolean boolean31 = hikariConfig17.isInitializationFailFast();
        long long32 = hikariConfig17.getAcquireRetryDelay();
        hikariConfig17.setPoolName("HikariPool-5778");
        java.util.Properties properties35 = hikariConfig17.getDataSourceProperties();
        hikariConfig1.setDataSourceProperties(properties35);
        int int37 = hikariConfig1.getAcquireIncrement();
        javax.sql.DataSource dataSource38 = null;
        hikariConfig1.setDataSource(dataSource38);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(dataSource13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNull(str25);
        org.junit.Assert.assertNull(str26);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertNull(dataSource30);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + true + "'", boolean31 == true);
        org.junit.Assert.assertTrue("'" + long32 + "' != '" + 0L + "'", long32 == 0L);
        org.junit.Assert.assertNotNull(properties35);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 0 + "'", int37 == 0);
    }

    @Test
    public void test03999() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03999");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        boolean boolean2 = hikariConfig1.isInitializationFailFast();
        hikariConfig1.setLeakDetectionThreshold((long) '4');
        java.lang.String str5 = hikariConfig1.getConnectionCustomizerClassName();
        java.util.Properties properties6 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig7 = new com.zaxxer.hikari.HikariConfig(properties6);
        boolean boolean8 = hikariConfig7.isInitializationFailFast();
        hikariConfig7.setInitializationFailFast(true);
        javax.sql.DataSource dataSource11 = null;
        hikariConfig7.setDataSource(dataSource11);
        hikariConfig7.setAcquireRetryDelay((long) 'a');
        java.lang.String str15 = hikariConfig7.getConnectionCustomizerClassName();
        java.util.Properties properties16 = hikariConfig7.getDataSourceProperties();
        java.util.Properties properties17 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig18 = new com.zaxxer.hikari.HikariConfig(properties17);
        java.util.Properties properties19 = hikariConfig18.getDataSourceProperties();
        hikariConfig7.setDataSourceProperties(properties19);
        hikariConfig1.setDataSourceProperties(properties19);
        java.lang.String str22 = hikariConfig1.getDataSourceClassName();
        hikariConfig1.setConnectionCustomizerClassName("");
        hikariConfig1.setMinimumPoolSize((int) ' ');
        java.lang.String str27 = hikariConfig1.getCatalog();
        int int28 = hikariConfig1.getAcquireRetries();
        hikariConfig1.setIdleTimeout((long) ' ');
        hikariConfig1.setConnectionTestQuery("HikariPool-19098");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertNotNull(properties16);
        org.junit.Assert.assertNotNull(properties19);
        org.junit.Assert.assertNull(str22);
        org.junit.Assert.assertNull(str27);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 3 + "'", int28 == 3);
    }

    @Test
    public void test04000() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test04000");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        boolean boolean2 = hikariConfig1.isInitializationFailFast();
        hikariConfig1.setInitializationFailFast(true);
        java.lang.String str5 = hikariConfig1.getConnectionTestQuery();
        hikariConfig1.setDataSourceClassName("");
        java.util.Properties properties9 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig10 = new com.zaxxer.hikari.HikariConfig(properties9);
        boolean boolean11 = hikariConfig10.isInitializationFailFast();
        hikariConfig10.setInitializationFailFast(true);
        int int14 = hikariConfig10.getAcquireRetries();
        long long15 = hikariConfig10.getMaxLifetime();
        hikariConfig10.setMaxLifetime((long) (short) 0);
        long long18 = hikariConfig10.getIdleTimeout();
        boolean boolean19 = hikariConfig10.isRegisterMbeans();
        long long20 = hikariConfig10.getAcquireRetryDelay();
        hikariConfig1.addDataSourceProperty("HikariPool-184", (java.lang.Object) long20);
        javax.sql.DataSource dataSource22 = null;
        hikariConfig1.setDataSource(dataSource22);
        hikariConfig1.setMaximumPoolSize((int) (byte) 10);
        java.lang.String str26 = hikariConfig1.getDataSourceClassName();
        hikariConfig1.setRegisterMbeans(false);
        hikariConfig1.setMinimumPoolSize((int) (byte) 10);
        hikariConfig1.setDataSourceClassName("HikariPool-22323");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 3 + "'", int14 == 3);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 1800000L + "'", long15 == 1800000L);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 600000L + "'", long18 == 600000L);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 0L + "'", long20 == 0L);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "" + "'", str26, "");
    }
}
