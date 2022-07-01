import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest34 {

    public static boolean debug = false;

    @Test
    public void test17001() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17001");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        hikariConfig0.setMaxLifetime((long) (short) 10);
        com.zaxxer.hikari.IConnectionCustomizer iConnectionCustomizer3 = hikariConfig0.connectionCustomizer;
        hikariConfig0.setDataSourceClassName("HikariPool-47");
        hikariConfig0.setDataSourceClassName("HikariPool-18");
        boolean boolean8 = hikariConfig0.isRegisterMbeans();
        java.lang.String str9 = hikariConfig0.getDataSourceClassName();
        boolean boolean10 = hikariConfig0.isIsolateInternalQueries;
        hikariConfig0.isInitializationFailFast = false;
        hikariConfig0.acquireIncrement = 'a';
        long long15 = hikariConfig0.getAcquireRetryDelay();
        int int16 = hikariConfig0.getMaximumPoolSize();
        long long17 = hikariConfig0.connectionTimeout;
        hikariConfig0.jdbcUrl = "HikariPool-118";
        // The following exception was thrown during execution in test generation
        try {
            hikariConfig0.setDriverClassName("HikariPool-23867");
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException; message: driverClassName specified class 'HikariPool-23867' could not be loaded");
        } catch (java.lang.RuntimeException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(iConnectionCustomizer3);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "HikariPool-18" + "'", str9, "HikariPool-18");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
// flaky:         org.junit.Assert.assertTrue("'" + long15 + "' != '" + 100L + "'", long15 == 100L);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 60 + "'", int16 == 60);
// flaky:         org.junit.Assert.assertTrue("'" + long17 + "' != '" + 32L + "'", long17 == 32L);
    }

    @Test
    public void test17002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17002");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        java.lang.String str1 = hikariConfig0.getConnectionInitSql();
        long long2 = hikariConfig0.getLeakDetectionThreshold();
        hikariConfig0.leakDetectionThreshold = (-1);
        long long5 = hikariConfig0.acquireRetryDelay;
        boolean boolean6 = hikariConfig0.isRegisterMbeans;
        hikariConfig0.setConnectionInitSql("");
        hikariConfig0.connectionTimeout = 0L;
        hikariConfig0.leakDetectionThreshold = 750L;
        hikariConfig0.transactionIsolation = 'a';
        long long15 = hikariConfig0.getMaxLifetime();
        hikariConfig0.jdbcUrl = "HikariPool-350";
        hikariConfig0.isJdbc4connectionTest = true;
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
// flaky:         org.junit.Assert.assertTrue("'" + long5 + "' != '" + 100L + "'", long5 == 100L);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
// flaky:         org.junit.Assert.assertTrue("'" + long15 + "' != '" + 32L + "'", long15 == 32L);
    }

    @Test
    public void test17003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17003");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        javax.sql.DataSource dataSource1 = hikariConfig0.getDataSource();
        hikariConfig0.setConnectionTestQuery("");
        hikariConfig0.connectionCustomizerClassName = "";
        hikariConfig0.setConnectionCustomizerClassName("hi!");
        java.lang.String str8 = hikariConfig0.getCatalog();
        hikariConfig0.setConnectionCustomizerClassName("HikariPool-73");
        hikariConfig0.jdbcUrl = "HikariPool-132";
        hikariConfig0.isInitializationFailFast = true;
        boolean boolean15 = hikariConfig0.isJdbc4connectionTest;
        int int16 = hikariConfig0.getAcquireRetries();
        hikariConfig0.setAcquireRetries((int) '4');
        java.lang.String str19 = hikariConfig0.getConnectionInitSql();
        org.junit.Assert.assertNull(dataSource1);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 3 + "'", int16 == 3);
        org.junit.Assert.assertNull(str19);
    }

    @Test
    public void test17004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17004");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        javax.sql.DataSource dataSource1 = hikariConfig0.getDataSource();
        hikariConfig0.setConnectionTestQuery("");
        hikariConfig0.setInitializationFailFast(false);
        hikariConfig0.catalog = "";
        javax.sql.DataSource dataSource8 = null;
        hikariConfig0.dataSource = dataSource8;
        boolean boolean10 = hikariConfig0.isRegisterMbeans();
        boolean boolean11 = hikariConfig0.isJdbc4ConnectionTest();
        hikariConfig0.maxLifetime = 35;
        hikariConfig0.setConnectionCustomizerClassName("HikariPool-84");
        boolean boolean16 = hikariConfig0.isAutoCommit;
        java.lang.String str17 = hikariConfig0.getConnectionCustomizerClassName();
        hikariConfig0.connectionTestQuery = "HikariPool-238";
        hikariConfig0.setReadOnly(false);
        org.junit.Assert.assertNull(dataSource1);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "HikariPool-84" + "'", str17, "HikariPool-84");
    }

    @Test
    public void test17005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17005");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        java.lang.String str1 = hikariConfig0.getConnectionInitSql();
        long long2 = hikariConfig0.getLeakDetectionThreshold();
        hikariConfig0.leakDetectionThreshold = (-1);
        hikariConfig0.setAcquireRetryDelay(750L);
        hikariConfig0.setAcquireRetryDelay(750L);
        boolean boolean9 = hikariConfig0.isInitializationFailFast();
        java.lang.String str10 = hikariConfig0.poolName;
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
// flaky:         org.junit.Assert.assertEquals("'" + str10 + "' != '" + "HikariPool-41973" + "'", str10, "HikariPool-41973");
    }

    @Test
    public void test17006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17006");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        hikariConfig0.setTransactionIsolation("HikariPool-47");
        hikariConfig0.leakDetectionThreshold = 5000L;
        long long5 = hikariConfig0.idleTimeout;
        hikariConfig0.idleTimeout = 1;
        com.zaxxer.hikari.HikariConfig hikariConfig8 = new com.zaxxer.hikari.HikariConfig();
        javax.sql.DataSource dataSource9 = hikariConfig8.getDataSource();
        hikariConfig8.setConnectionTestQuery("");
        hikariConfig8.setInitializationFailFast(false);
        java.lang.String str14 = hikariConfig8.getConnectionInitSql();
        hikariConfig8.setReadOnly(true);
        javax.sql.DataSource dataSource17 = null;
        hikariConfig8.setDataSource(dataSource17);
        boolean boolean19 = hikariConfig8.isReadOnly;
        hikariConfig8.connectionTimeout = 0L;
        com.zaxxer.hikari.HikariConfig hikariConfig22 = new com.zaxxer.hikari.HikariConfig();
        hikariConfig22.setMaxLifetime((long) (short) 10);
        com.zaxxer.hikari.HikariConfig hikariConfig25 = new com.zaxxer.hikari.HikariConfig();
        javax.sql.DataSource dataSource26 = hikariConfig25.getDataSource();
        hikariConfig25.setConnectionTestQuery("");
        hikariConfig25.setInitializationFailFast(false);
        long long31 = hikariConfig25.getConnectionTimeout();
        java.util.Properties properties32 = hikariConfig25.dataSourceProperties;
        hikariConfig22.dataSourceProperties = properties32;
        hikariConfig8.setDataSourceProperties(properties32);
        hikariConfig0.setDataSourceProperties(properties32);
        hikariConfig0.setJdbcUrl("HikariPool-3298");
        hikariConfig0.setReadOnly(true);
        java.util.Properties properties40 = hikariConfig0.getDataSourceProperties();
        hikariConfig0.setInitializationFailFast(false);
// flaky:         org.junit.Assert.assertTrue("'" + long5 + "' != '" + (-1L) + "'", long5 == (-1L));
        org.junit.Assert.assertNull(dataSource9);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertNull(dataSource26);
// flaky:         org.junit.Assert.assertTrue("'" + long31 + "' != '" + 32L + "'", long31 == 32L);
        org.junit.Assert.assertNotNull(properties32);
        org.junit.Assert.assertNotNull(properties40);
    }

    @Test
    public void test17007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17007");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        java.lang.String str1 = hikariConfig0.getConnectionInitSql();
        long long2 = hikariConfig0.getLeakDetectionThreshold();
        hikariConfig0.leakDetectionThreshold = (-1);
        int int5 = hikariConfig0.acquireIncrement;
        hikariConfig0.setInitializationFailFast(true);
        boolean boolean8 = hikariConfig0.isAutoCommit();
        hikariConfig0.setTransactionIsolation("");
        long long11 = hikariConfig0.idleTimeout;
        com.zaxxer.hikari.HikariConfig hikariConfig12 = new com.zaxxer.hikari.HikariConfig();
        javax.sql.DataSource dataSource13 = hikariConfig12.getDataSource();
        hikariConfig12.setConnectionTestQuery("");
        hikariConfig12.connectionCustomizerClassName = "";
        hikariConfig12.setConnectionCustomizerClassName("hi!");
        java.lang.String str20 = hikariConfig12.getCatalog();
        com.zaxxer.hikari.IConnectionCustomizer iConnectionCustomizer21 = null;
        hikariConfig12.connectionCustomizer = iConnectionCustomizer21;
        hikariConfig12.setJdbcUrl("HikariPool-38");
        com.zaxxer.hikari.HikariConfig hikariConfig25 = new com.zaxxer.hikari.HikariConfig();
        hikariConfig25.setMaxLifetime((long) (short) 10);
        com.zaxxer.hikari.HikariConfig hikariConfig28 = new com.zaxxer.hikari.HikariConfig();
        javax.sql.DataSource dataSource29 = hikariConfig28.getDataSource();
        hikariConfig28.setConnectionTestQuery("");
        hikariConfig28.setInitializationFailFast(false);
        long long34 = hikariConfig28.getConnectionTimeout();
        java.util.Properties properties35 = hikariConfig28.dataSourceProperties;
        hikariConfig25.dataSourceProperties = properties35;
        hikariConfig12.setDataSourceProperties(properties35);
        hikariConfig0.dataSourceProperties = properties35;
        long long39 = hikariConfig0.getMaxLifetime();
        hikariConfig0.catalog = "HikariPool-97";
        hikariConfig0.setMinimumPoolSize((int) (byte) 100);
        int int44 = hikariConfig0.getAcquireRetries();
        hikariConfig0.maxPoolSize = 'a';
        hikariConfig0.setTransactionIsolation("HikariPool-377");
        hikariConfig0.isJdbc4connectionTest = true;
        hikariConfig0.setMaxLifetime((long) (-1));
        hikariConfig0.acquireRetryDelay = (short) 100;
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
// flaky:         org.junit.Assert.assertTrue("'" + long11 + "' != '" + (-1L) + "'", long11 == (-1L));
        org.junit.Assert.assertNull(dataSource13);
        org.junit.Assert.assertNull(str20);
        org.junit.Assert.assertNull(dataSource29);
// flaky:         org.junit.Assert.assertTrue("'" + long34 + "' != '" + 32L + "'", long34 == 32L);
        org.junit.Assert.assertNotNull(properties35);
// flaky:         org.junit.Assert.assertTrue("'" + long39 + "' != '" + 32L + "'", long39 == 32L);
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + 3 + "'", int44 == 3);
    }

    @Test
    public void test17008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17008");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        javax.sql.DataSource dataSource1 = hikariConfig0.getDataSource();
        hikariConfig0.idleTimeout = 3;
        hikariConfig0.setMaxLifetime((long) '4');
        java.lang.String str6 = hikariConfig0.getConnectionTestQuery();
        hikariConfig0.setIsolateInternalQueries(true);
        java.lang.String str9 = hikariConfig0.catalog;
        boolean boolean10 = hikariConfig0.isInitializationFailFast();
        hikariConfig0.maxPoolSize = 0;
        org.junit.Assert.assertNull(dataSource1);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test17009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17009");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        javax.sql.DataSource dataSource1 = hikariConfig0.getDataSource();
        hikariConfig0.setConnectionTestQuery("");
        hikariConfig0.setInitializationFailFast(false);
        hikariConfig0.catalog = "";
        javax.sql.DataSource dataSource8 = null;
        hikariConfig0.dataSource = dataSource8;
        javax.sql.DataSource dataSource10 = null;
        hikariConfig0.dataSource = dataSource10;
        int int12 = hikariConfig0.maxPoolSize;
        long long13 = hikariConfig0.getIdleTimeout();
        javax.sql.DataSource dataSource14 = hikariConfig0.dataSource;
        hikariConfig0.setDataSourceClassName("HikariPool-122");
        boolean boolean17 = hikariConfig0.isAutoCommit();
        hikariConfig0.setJdbc4ConnectionTest(false);
        // The following exception was thrown during execution in test generation
        try {
            hikariConfig0.setDriverClassName("HikariPool-789");
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException; message: driverClassName specified class 'HikariPool-789' could not be loaded");
        } catch (java.lang.RuntimeException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(dataSource1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 60 + "'", int12 == 60);
// flaky:         org.junit.Assert.assertTrue("'" + long13 + "' != '" + (-1L) + "'", long13 == (-1L));
        org.junit.Assert.assertNull(dataSource14);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
    }

    @Test
    public void test17010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17010");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        javax.sql.DataSource dataSource1 = hikariConfig0.getDataSource();
        hikariConfig0.setConnectionTestQuery("");
        hikariConfig0.connectionCustomizerClassName = "";
        hikariConfig0.setConnectionCustomizerClassName("hi!");
        java.lang.String str8 = hikariConfig0.getCatalog();
        java.util.Properties properties9 = hikariConfig0.dataSourceProperties;
        com.zaxxer.hikari.HikariConfig hikariConfig11 = new com.zaxxer.hikari.HikariConfig();
        java.lang.String str12 = hikariConfig11.getConnectionInitSql();
        long long13 = hikariConfig11.getLeakDetectionThreshold();
        hikariConfig11.leakDetectionThreshold = (-1);
        long long16 = hikariConfig11.acquireRetryDelay;
        boolean boolean17 = hikariConfig11.isRegisterMbeans;
        hikariConfig0.addDataSourceProperty("HikariPool-47", (java.lang.Object) boolean17);
        hikariConfig0.setAcquireRetries((int) '#');
        javax.sql.DataSource dataSource21 = hikariConfig0.getDataSource();
        hikariConfig0.catalog = "HikariPool-111";
        long long24 = hikariConfig0.connectionTimeout;
        java.lang.String str25 = hikariConfig0.dataSourceClassName;
        hikariConfig0.isInitializationFailFast = true;
        hikariConfig0.acquireIncrement = 'a';
        java.lang.String str30 = hikariConfig0.dataSourceClassName;
        java.lang.String str31 = hikariConfig0.connectionInitSql;
        hikariConfig0.dataSourceClassName = "";
        org.junit.Assert.assertNull(dataSource1);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNotNull(properties9);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 0L + "'", long13 == 0L);
// flaky:         org.junit.Assert.assertTrue("'" + long16 + "' != '" + 100L + "'", long16 == 100L);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNull(dataSource21);
// flaky:         org.junit.Assert.assertTrue("'" + long24 + "' != '" + 32L + "'", long24 == 32L);
        org.junit.Assert.assertNull(str25);
        org.junit.Assert.assertNull(str30);
        org.junit.Assert.assertNull(str31);
    }

    @Test
    public void test17011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17011");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        javax.sql.DataSource dataSource1 = hikariConfig0.getDataSource();
        hikariConfig0.setConnectionTestQuery("");
        hikariConfig0.connectionCustomizerClassName = "";
        hikariConfig0.setConnectionCustomizerClassName("hi!");
        java.lang.String str8 = hikariConfig0.getCatalog();
        com.zaxxer.hikari.IConnectionCustomizer iConnectionCustomizer9 = null;
        hikariConfig0.connectionCustomizer = iConnectionCustomizer9;
        hikariConfig0.connectionTimeout = 100L;
        hikariConfig0.transactionIsolationName = "";
        hikariConfig0.jdbcUrl = "";
        int int17 = hikariConfig0.minPoolSize;
        java.lang.String str18 = hikariConfig0.catalog;
        long long19 = hikariConfig0.getLeakDetectionThreshold();
        java.lang.String str20 = hikariConfig0.getConnectionTestQuery();
        org.junit.Assert.assertNull(dataSource1);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 10 + "'", int17 == 10);
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 0L + "'", long19 == 0L);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
    }

    @Test
    public void test17012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17012");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        java.lang.String str1 = hikariConfig0.getConnectionInitSql();
        long long2 = hikariConfig0.getLeakDetectionThreshold();
        hikariConfig0.leakDetectionThreshold = (-1);
        long long5 = hikariConfig0.acquireRetryDelay;
        hikariConfig0.setLeakDetectionThreshold((long) (byte) -1);
        java.util.Properties properties8 = hikariConfig0.getDataSourceProperties();
        boolean boolean9 = hikariConfig0.isReadOnly();
        hikariConfig0.jdbcUrl = "HikariPool-29";
        java.lang.String str12 = hikariConfig0.getConnectionTestQuery();
        long long13 = hikariConfig0.getAcquireRetryDelay();
        long long14 = hikariConfig0.getConnectionTimeout();
        com.zaxxer.hikari.IConnectionCustomizer iConnectionCustomizer15 = null;
        hikariConfig0.connectionCustomizer = iConnectionCustomizer15;
        hikariConfig0.setUseInstrumentation(true);
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
// flaky:         org.junit.Assert.assertTrue("'" + long5 + "' != '" + 100L + "'", long5 == 100L);
        org.junit.Assert.assertNotNull(properties8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(str12);
// flaky:         org.junit.Assert.assertTrue("'" + long13 + "' != '" + 100L + "'", long13 == 100L);
// flaky:         org.junit.Assert.assertTrue("'" + long14 + "' != '" + 32L + "'", long14 == 32L);
    }

    @Test
    public void test17013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17013");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        javax.sql.DataSource dataSource1 = hikariConfig0.getDataSource();
        hikariConfig0.setConnectionTestQuery("");
        hikariConfig0.connectionCustomizerClassName = "";
        hikariConfig0.setConnectionCustomizerClassName("hi!");
        java.lang.String str8 = hikariConfig0.getCatalog();
        java.util.Properties properties9 = hikariConfig0.dataSourceProperties;
        com.zaxxer.hikari.HikariConfig hikariConfig11 = new com.zaxxer.hikari.HikariConfig();
        java.lang.String str12 = hikariConfig11.getConnectionInitSql();
        long long13 = hikariConfig11.getLeakDetectionThreshold();
        hikariConfig11.leakDetectionThreshold = (-1);
        long long16 = hikariConfig11.acquireRetryDelay;
        boolean boolean17 = hikariConfig11.isRegisterMbeans;
        hikariConfig0.addDataSourceProperty("HikariPool-47", (java.lang.Object) boolean17);
        java.util.Properties properties19 = hikariConfig0.getDataSourceProperties();
        hikariConfig0.transactionIsolationName = "HikariPool-18";
        java.util.Properties properties22 = hikariConfig0.getDataSourceProperties();
        javax.sql.DataSource dataSource23 = hikariConfig0.getDataSource();
        hikariConfig0.acquireRetries = (short) 10;
        hikariConfig0.poolName = "HikariPool-1389";
        java.lang.String str28 = hikariConfig0.getConnectionTestQuery();
        boolean boolean29 = hikariConfig0.isIsolateInternalQueries();
        org.junit.Assert.assertNull(dataSource1);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNotNull(properties9);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 0L + "'", long13 == 0L);
// flaky:         org.junit.Assert.assertTrue("'" + long16 + "' != '" + 100L + "'", long16 == 100L);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(properties19);
        org.junit.Assert.assertNotNull(properties22);
        org.junit.Assert.assertNull(dataSource23);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "" + "'", str28, "");
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
    }

    @Test
    public void test17014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17014");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        java.lang.String str1 = hikariConfig0.getConnectionInitSql();
        long long2 = hikariConfig0.getLeakDetectionThreshold();
        int int3 = hikariConfig0.getMaximumPoolSize();
        long long4 = hikariConfig0.getIdleTimeout();
        int int5 = hikariConfig0.maxPoolSize;
        java.lang.String str6 = hikariConfig0.getConnectionCustomizerClassName();
        hikariConfig0.setConnectionCustomizerClassName("HikariPool-127");
        int int9 = hikariConfig0.getAcquireIncrement();
        hikariConfig0.setLeakDetectionThreshold((long) (byte) 0);
        hikariConfig0.leakDetectionThreshold = 750L;
        boolean boolean14 = hikariConfig0.isAutoCommit;
        hikariConfig0.acquireRetryDelay = (byte) 0;
        hikariConfig0.jdbcUrl = "HikariPool-436";
        hikariConfig0.isInitializationFailFast = false;
        int int21 = hikariConfig0.getTransactionIsolation();
        hikariConfig0.setConnectionCustomizerClassName("HikariPool-9964");
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 60 + "'", int3 == 60);
// flaky:         org.junit.Assert.assertTrue("'" + long4 + "' != '" + (-1L) + "'", long4 == (-1L));
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 60 + "'", int5 == 60);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1) + "'", int21 == (-1));
    }

    @Test
    public void test17015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17015");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        java.lang.String str1 = hikariConfig0.getConnectionInitSql();
        hikariConfig0.setMaxLifetime(35L);
        int int4 = hikariConfig0.acquireRetries;
        int int5 = hikariConfig0.minPoolSize;
        java.lang.String str6 = hikariConfig0.getPoolName();
        java.lang.String str7 = hikariConfig0.getCatalog();
        hikariConfig0.setMaxLifetime((long) (byte) 0);
        hikariConfig0.setTransactionIsolation("HikariPool-833");
        java.lang.String str12 = hikariConfig0.getPoolName();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 3 + "'", int4 == 3);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 10 + "'", int5 == 10);
// flaky:         org.junit.Assert.assertEquals("'" + str6 + "' != '" + "HikariPool-41995" + "'", str6, "HikariPool-41995");
        org.junit.Assert.assertNull(str7);
// flaky:         org.junit.Assert.assertEquals("'" + str12 + "' != '" + "HikariPool-41995" + "'", str12, "HikariPool-41995");
    }

    @Test
    public void test17016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17016");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        hikariConfig0.setMaxLifetime((long) (short) 10);
        java.lang.String str3 = hikariConfig0.getPoolName();
        hikariConfig0.jdbcUrl = "";
        hikariConfig0.setMaxLifetime(0L);
        hikariConfig0.setTransactionIsolation("HikariPool-48");
        com.zaxxer.hikari.HikariConfig hikariConfig10 = new com.zaxxer.hikari.HikariConfig();
        hikariConfig10.setMaxLifetime((long) (short) 10);
        com.zaxxer.hikari.HikariConfig hikariConfig13 = new com.zaxxer.hikari.HikariConfig();
        javax.sql.DataSource dataSource14 = hikariConfig13.getDataSource();
        hikariConfig13.setConnectionTestQuery("");
        hikariConfig13.setInitializationFailFast(false);
        long long19 = hikariConfig13.getConnectionTimeout();
        java.util.Properties properties20 = hikariConfig13.dataSourceProperties;
        hikariConfig10.dataSourceProperties = properties20;
        hikariConfig0.setDataSourceProperties(properties20);
        java.lang.String str23 = hikariConfig0.getJdbcUrl();
        javax.sql.DataSource dataSource24 = hikariConfig0.dataSource;
        java.util.Properties properties25 = hikariConfig0.dataSourceProperties;
        hikariConfig0.setJdbcUrl("HikariPool-183");
        hikariConfig0.connectionTestQuery = "HikariPool-93";
        hikariConfig0.transactionIsolationName = "HikariPool-880";
        java.util.Properties properties32 = hikariConfig0.getDataSourceProperties();
        long long33 = hikariConfig0.connectionTimeout;
        hikariConfig0.isAutoCommit = true;
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "HikariPool-41996" + "'", str3, "HikariPool-41996");
        org.junit.Assert.assertNull(dataSource14);
// flaky:         org.junit.Assert.assertTrue("'" + long19 + "' != '" + 32L + "'", long19 == 32L);
        org.junit.Assert.assertNotNull(properties20);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
        org.junit.Assert.assertNull(dataSource24);
        org.junit.Assert.assertNotNull(properties25);
        org.junit.Assert.assertNotNull(properties32);
// flaky:         org.junit.Assert.assertTrue("'" + long33 + "' != '" + 32L + "'", long33 == 32L);
    }

    @Test
    public void test17017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17017");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        java.lang.String str1 = hikariConfig0.getConnectionInitSql();
        long long2 = hikariConfig0.getLeakDetectionThreshold();
        int int3 = hikariConfig0.getMaximumPoolSize();
        long long4 = hikariConfig0.getIdleTimeout();
        hikariConfig0.isAutoCommit = false;
        hikariConfig0.setDataSourceClassName("HikariPool-686");
        int int9 = hikariConfig0.getMinimumPoolSize();
        hikariConfig0.setMaximumPoolSize((int) (short) 10);
        hikariConfig0.acquireRetryDelay = (-1L);
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 60 + "'", int3 == 60);
// flaky:         org.junit.Assert.assertTrue("'" + long4 + "' != '" + (-1L) + "'", long4 == (-1L));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 10 + "'", int9 == 10);
    }

    @Test
    public void test17018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17018");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        javax.sql.DataSource dataSource1 = hikariConfig0.getDataSource();
        hikariConfig0.setConnectionTestQuery("");
        hikariConfig0.setInitializationFailFast(false);
        hikariConfig0.catalog = "";
        int int8 = hikariConfig0.getMaximumPoolSize();
        hikariConfig0.leakDetectionThreshold = (short) 10;
        hikariConfig0.jdbcUrl = "HikariPool-48";
        boolean boolean13 = hikariConfig0.isRegisterMbeans();
        hikariConfig0.setMaxLifetime(0L);
        int int16 = hikariConfig0.acquireIncrement;
        org.junit.Assert.assertNull(dataSource1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 60 + "'", int8 == 60);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
    }

    @Test
    public void test17019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17019");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        javax.sql.DataSource dataSource1 = hikariConfig0.getDataSource();
        hikariConfig0.setConnectionTestQuery("");
        hikariConfig0.setInitializationFailFast(false);
        long long6 = hikariConfig0.getConnectionTimeout();
        java.util.Properties properties7 = hikariConfig0.dataSourceProperties;
        boolean boolean8 = hikariConfig0.isInitializationFailFast();
        hikariConfig0.setLeakDetectionThreshold(0L);
        java.lang.String str11 = hikariConfig0.connectionCustomizerClassName;
        hikariConfig0.setAutoCommit(true);
        long long14 = hikariConfig0.acquireRetryDelay;
        long long15 = hikariConfig0.getMaxLifetime();
        long long16 = hikariConfig0.getMaxLifetime();
        hikariConfig0.setAcquireRetries(32);
        hikariConfig0.connectionCustomizerClassName = "HikariPool-37217";
        org.junit.Assert.assertNull(dataSource1);
// flaky:         org.junit.Assert.assertTrue("'" + long6 + "' != '" + 32L + "'", long6 == 32L);
        org.junit.Assert.assertNotNull(properties7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(str11);
// flaky:         org.junit.Assert.assertTrue("'" + long14 + "' != '" + 100L + "'", long14 == 100L);
// flaky:         org.junit.Assert.assertTrue("'" + long15 + "' != '" + 32L + "'", long15 == 32L);
// flaky:         org.junit.Assert.assertTrue("'" + long16 + "' != '" + 32L + "'", long16 == 32L);
    }

    @Test
    public void test17020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17020");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        hikariConfig0.setMaxLifetime((long) (short) 10);
        com.zaxxer.hikari.IConnectionCustomizer iConnectionCustomizer3 = hikariConfig0.connectionCustomizer;
        hikariConfig0.setDataSourceClassName("HikariPool-47");
        hikariConfig0.setDataSourceClassName("HikariPool-18");
        long long8 = hikariConfig0.getAcquireRetryDelay();
        javax.sql.DataSource dataSource9 = null;
        hikariConfig0.dataSource = dataSource9;
        hikariConfig0.isJdbc4connectionTest = true;
        hikariConfig0.transactionIsolationName = "HikariPool-4091";
        int int15 = hikariConfig0.getAcquireRetries();
        int int16 = hikariConfig0.maxPoolSize;
        boolean boolean17 = hikariConfig0.isAutoCommit;
        hikariConfig0.connectionInitSql = "HikariPool-14011";
        hikariConfig0.setUseInstrumentation(true);
        org.junit.Assert.assertNull(iConnectionCustomizer3);
// flaky:         org.junit.Assert.assertTrue("'" + long8 + "' != '" + 100L + "'", long8 == 100L);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 3 + "'", int15 == 3);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 60 + "'", int16 == 60);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
    }

    @Test
    public void test17021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17021");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        java.lang.String str1 = hikariConfig0.getJdbcUrl();
        hikariConfig0.setRegisterMbeans(true);
        hikariConfig0.acquireRetryDelay = 0L;
        com.zaxxer.hikari.HikariConfig hikariConfig6 = new com.zaxxer.hikari.HikariConfig();
        hikariConfig6.setMaxLifetime((long) (short) 10);
        com.zaxxer.hikari.HikariConfig hikariConfig9 = new com.zaxxer.hikari.HikariConfig();
        javax.sql.DataSource dataSource10 = hikariConfig9.getDataSource();
        hikariConfig9.setConnectionTestQuery("");
        hikariConfig9.setInitializationFailFast(false);
        long long15 = hikariConfig9.getConnectionTimeout();
        java.util.Properties properties16 = hikariConfig9.dataSourceProperties;
        hikariConfig6.dataSourceProperties = properties16;
        boolean boolean18 = hikariConfig6.isReadOnly();
        java.lang.String str19 = hikariConfig6.getPoolName();
        boolean boolean20 = hikariConfig6.isInitializationFailFast();
        hikariConfig6.setIsolateInternalQueries(true);
        java.lang.String str23 = hikariConfig6.getDataSourceClassName();
        hikariConfig6.connectionTimeout = 35L;
        java.util.Properties properties26 = hikariConfig6.dataSourceProperties;
        hikariConfig0.dataSourceProperties = properties26;
        long long28 = hikariConfig0.getIdleTimeout();
        com.zaxxer.hikari.IConnectionCustomizer iConnectionCustomizer29 = null;
        hikariConfig0.connectionCustomizer = iConnectionCustomizer29;
        long long31 = hikariConfig0.acquireRetryDelay;
        hikariConfig0.setTransactionIsolation("HikariPool-10908");
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(dataSource10);
// flaky:         org.junit.Assert.assertTrue("'" + long15 + "' != '" + 32L + "'", long15 == 32L);
        org.junit.Assert.assertNotNull(properties16);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
// flaky:         org.junit.Assert.assertEquals("'" + str19 + "' != '" + "HikariPool-42007" + "'", str19, "HikariPool-42007");
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNull(str23);
        org.junit.Assert.assertNotNull(properties26);
// flaky:         org.junit.Assert.assertTrue("'" + long28 + "' != '" + (-1L) + "'", long28 == (-1L));
        org.junit.Assert.assertTrue("'" + long31 + "' != '" + 0L + "'", long31 == 0L);
    }

    @Test
    public void test17022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17022");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        java.lang.String str1 = hikariConfig0.getConnectionInitSql();
        hikariConfig0.setMaxLifetime(35L);
        hikariConfig0.setAutoCommit(false);
        int int6 = hikariConfig0.getTransactionIsolation();
        long long7 = hikariConfig0.connectionTimeout;
        boolean boolean8 = hikariConfig0.isRegisterMbeans;
        java.util.Properties properties9 = hikariConfig0.getDataSourceProperties();
        long long10 = hikariConfig0.getLeakDetectionThreshold();
        hikariConfig0.isAutoCommit = false;
        boolean boolean13 = hikariConfig0.isJdbc4ConnectionTest();
        int int14 = hikariConfig0.minPoolSize;
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
// flaky:         org.junit.Assert.assertTrue("'" + long7 + "' != '" + 32L + "'", long7 == 32L);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(properties9);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 10 + "'", int14 == 10);
    }

    @Test
    public void test17023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17023");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        java.lang.String str1 = hikariConfig0.getConnectionInitSql();
        long long2 = hikariConfig0.getLeakDetectionThreshold();
        hikariConfig0.leakDetectionThreshold = (-1);
        long long5 = hikariConfig0.acquireRetryDelay;
        long long6 = hikariConfig0.getIdleTimeout();
        long long7 = hikariConfig0.leakDetectionThreshold;
        java.lang.String str8 = hikariConfig0.getCatalog();
        java.lang.String str9 = hikariConfig0.getConnectionTestQuery();
        java.lang.String str10 = hikariConfig0.getCatalog();
        boolean boolean11 = hikariConfig0.isRegisterMbeans;
        long long12 = hikariConfig0.leakDetectionThreshold;
        boolean boolean13 = hikariConfig0.isJdbc4ConnectionTest();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
// flaky:         org.junit.Assert.assertTrue("'" + long5 + "' != '" + 100L + "'", long5 == 100L);
// flaky:         org.junit.Assert.assertTrue("'" + long6 + "' != '" + (-1L) + "'", long6 == (-1L));
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + (-1L) + "'", long7 == (-1L));
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + (-1L) + "'", long12 == (-1L));
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
    }

    @Test
    public void test17024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17024");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        javax.sql.DataSource dataSource1 = hikariConfig0.getDataSource();
        hikariConfig0.setConnectionTestQuery("");
        hikariConfig0.setInitializationFailFast(false);
        long long6 = hikariConfig0.getConnectionTimeout();
        java.util.Properties properties7 = hikariConfig0.dataSourceProperties;
        boolean boolean8 = hikariConfig0.isAutoCommit();
        hikariConfig0.isAutoCommit = true;
        hikariConfig0.isIsolateInternalQueries = false;
        long long13 = hikariConfig0.connectionTimeout;
        java.lang.String str14 = hikariConfig0.getConnectionCustomizerClassName();
        hikariConfig0.maxLifetime = 97L;
        java.lang.String str17 = hikariConfig0.dataSourceClassName;
        org.junit.Assert.assertNull(dataSource1);
// flaky:         org.junit.Assert.assertTrue("'" + long6 + "' != '" + 32L + "'", long6 == 32L);
        org.junit.Assert.assertNotNull(properties7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
// flaky:         org.junit.Assert.assertTrue("'" + long13 + "' != '" + 32L + "'", long13 == 32L);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNull(str17);
    }

    @Test
    public void test17025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17025");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        java.lang.String str1 = hikariConfig0.getJdbcUrl();
        com.zaxxer.hikari.IConnectionCustomizer iConnectionCustomizer2 = hikariConfig0.connectionCustomizer;
        hikariConfig0.setConnectionTestQuery("HikariPool-141");
        hikariConfig0.jdbcUrl = "HikariPool-208";
        java.lang.String str7 = hikariConfig0.getConnectionTestQuery();
        hikariConfig0.dataSourceClassName = "HikariPool-55";
        com.zaxxer.hikari.HikariConfig hikariConfig10 = new com.zaxxer.hikari.HikariConfig();
        javax.sql.DataSource dataSource11 = hikariConfig10.getDataSource();
        hikariConfig10.setConnectionTestQuery("");
        hikariConfig10.setInitializationFailFast(false);
        hikariConfig10.catalog = "";
        int int18 = hikariConfig10.getMaximumPoolSize();
        hikariConfig10.leakDetectionThreshold = (short) 10;
        hikariConfig10.isJdbc4connectionTest = true;
        boolean boolean23 = hikariConfig10.isReadOnly();
        hikariConfig10.transactionIsolation = '#';
        com.zaxxer.hikari.HikariConfig hikariConfig27 = new com.zaxxer.hikari.HikariConfig();
        javax.sql.DataSource dataSource28 = hikariConfig27.getDataSource();
        hikariConfig27.setConnectionTestQuery("");
        hikariConfig27.setInitializationFailFast(false);
        hikariConfig27.catalog = "";
        javax.sql.DataSource dataSource35 = null;
        hikariConfig27.dataSource = dataSource35;
        javax.sql.DataSource dataSource37 = null;
        hikariConfig27.dataSource = dataSource37;
        hikariConfig10.addDataSourceProperty("HikariPool-361", (java.lang.Object) hikariConfig27);
        java.util.Properties properties40 = hikariConfig27.getDataSourceProperties();
        hikariConfig0.setDataSourceProperties(properties40);
        com.zaxxer.hikari.HikariConfig hikariConfig42 = new com.zaxxer.hikari.HikariConfig(properties40);
        com.zaxxer.hikari.IConnectionCustomizer iConnectionCustomizer43 = hikariConfig42.connectionCustomizer;
        hikariConfig42.setConnectionTestQuery("HikariPool-8973");
        hikariConfig42.setAcquireIncrement(97);
        hikariConfig42.maxLifetime = ' ';
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(iConnectionCustomizer2);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "HikariPool-141" + "'", str7, "HikariPool-141");
        org.junit.Assert.assertNull(dataSource11);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 60 + "'", int18 == 60);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNull(dataSource28);
        org.junit.Assert.assertNotNull(properties40);
        org.junit.Assert.assertNull(iConnectionCustomizer43);
    }

    @Test
    public void test17026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17026");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        java.lang.String str1 = hikariConfig0.getConnectionInitSql();
        long long2 = hikariConfig0.getLeakDetectionThreshold();
        int int3 = hikariConfig0.getMaximumPoolSize();
        hikariConfig0.setLeakDetectionThreshold(10L);
        java.lang.String str6 = hikariConfig0.connectionTestQuery;
        hikariConfig0.transactionIsolationName = "";
        boolean boolean9 = hikariConfig0.isAutoCommit();
        hikariConfig0.setIdleTimeout(1L);
        hikariConfig0.setConnectionTestQuery("HikariPool-210");
        boolean boolean14 = hikariConfig0.isIsolateInternalQueries;
        long long15 = hikariConfig0.connectionTimeout;
        java.lang.String str16 = hikariConfig0.getDataSourceClassName();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 60 + "'", int3 == 60);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
// flaky:         org.junit.Assert.assertTrue("'" + long15 + "' != '" + 32L + "'", long15 == 32L);
        org.junit.Assert.assertNull(str16);
    }

    @Test
    public void test17027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17027");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        javax.sql.DataSource dataSource1 = hikariConfig0.getDataSource();
        hikariConfig0.setConnectionTestQuery("");
        hikariConfig0.setInitializationFailFast(false);
        hikariConfig0.poolName = "";
        boolean boolean8 = hikariConfig0.isInitializationFailFast;
        java.lang.String str9 = hikariConfig0.getDataSourceClassName();
        long long10 = hikariConfig0.acquireRetryDelay;
        hikariConfig0.setIdleTimeout((long) 'a');
        org.junit.Assert.assertNull(dataSource1);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(str9);
// flaky:         org.junit.Assert.assertTrue("'" + long10 + "' != '" + 100L + "'", long10 == 100L);
    }

    @Test
    public void test17028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17028");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        java.lang.String str1 = hikariConfig0.getConnectionInitSql();
        long long2 = hikariConfig0.getLeakDetectionThreshold();
        hikariConfig0.leakDetectionThreshold = (-1);
        long long5 = hikariConfig0.acquireRetryDelay;
        com.zaxxer.hikari.HikariConfig hikariConfig7 = new com.zaxxer.hikari.HikariConfig();
        javax.sql.DataSource dataSource8 = hikariConfig7.getDataSource();
        hikariConfig7.setConnectionTestQuery("");
        hikariConfig7.connectionCustomizerClassName = "";
        hikariConfig7.setConnectionCustomizerClassName("hi!");
        java.lang.String str15 = hikariConfig7.getCatalog();
        boolean boolean16 = hikariConfig7.isRegisterMbeans;
        long long17 = hikariConfig7.connectionTimeout;
        hikariConfig7.setConnectionInitSql("HikariPool-48");
        hikariConfig0.addDataSourceProperty("hi!", (java.lang.Object) hikariConfig7);
        hikariConfig0.setConnectionCustomizerClassName("hi!");
        boolean boolean23 = hikariConfig0.isJdbc4connectionTest;
        hikariConfig0.setTransactionIsolation("HikariPool-137");
        boolean boolean26 = hikariConfig0.isAutoCommit;
        hikariConfig0.maxPoolSize = 0;
        hikariConfig0.isAutoCommit = true;
        javax.sql.DataSource dataSource31 = hikariConfig0.getDataSource();
        java.lang.String str32 = hikariConfig0.getDataSourceClassName();
        boolean boolean33 = hikariConfig0.isAutoCommit();
        hikariConfig0.transactionIsolation = '#';
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
// flaky:         org.junit.Assert.assertTrue("'" + long5 + "' != '" + 100L + "'", long5 == 100L);
        org.junit.Assert.assertNull(dataSource8);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
// flaky:         org.junit.Assert.assertTrue("'" + long17 + "' != '" + 32L + "'", long17 == 32L);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertNull(dataSource31);
        org.junit.Assert.assertNull(str32);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + true + "'", boolean33 == true);
    }

    @Test
    public void test17029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17029");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        java.lang.String str1 = hikariConfig0.getConnectionInitSql();
        long long2 = hikariConfig0.getLeakDetectionThreshold();
        int int3 = hikariConfig0.getMaximumPoolSize();
        long long4 = hikariConfig0.leakDetectionThreshold;
        java.lang.String str5 = hikariConfig0.catalog;
        boolean boolean6 = hikariConfig0.isIsolateInternalQueries();
        hikariConfig0.setPoolName("HikariPool-954");
        hikariConfig0.setJdbcUrl("HikariPool-688");
        int int11 = hikariConfig0.minPoolSize;
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 60 + "'", int3 == 60);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 10 + "'", int11 == 10);
    }

    @Test
    public void test17030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17030");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        java.lang.String str1 = hikariConfig0.getConnectionInitSql();
        long long2 = hikariConfig0.getLeakDetectionThreshold();
        hikariConfig0.leakDetectionThreshold = (-1);
        int int5 = hikariConfig0.acquireIncrement;
        hikariConfig0.setPoolName("HikariPool-62");
        hikariConfig0.acquireRetryDelay = 0L;
        java.lang.String str10 = hikariConfig0.getCatalog();
        javax.sql.DataSource dataSource11 = hikariConfig0.getDataSource();
        int int12 = hikariConfig0.getMinimumPoolSize();
        hikariConfig0.setMinimumPoolSize(60);
        boolean boolean15 = hikariConfig0.isIsolateInternalQueries();
        hikariConfig0.isJdbc4connectionTest = false;
        javax.sql.DataSource dataSource18 = hikariConfig0.getDataSource();
        int int19 = hikariConfig0.acquireRetries;
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(dataSource11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 10 + "'", int12 == 10);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNull(dataSource18);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 3 + "'", int19 == 3);
    }

    @Test
    public void test17031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17031");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        hikariConfig0.setMaxLifetime((long) (short) 10);
        java.lang.String str3 = hikariConfig0.getPoolName();
        hikariConfig0.jdbcUrl = "";
        hikariConfig0.setMaxLifetime(0L);
        hikariConfig0.setTransactionIsolation("HikariPool-48");
        com.zaxxer.hikari.HikariConfig hikariConfig10 = new com.zaxxer.hikari.HikariConfig();
        hikariConfig10.setMaxLifetime((long) (short) 10);
        com.zaxxer.hikari.HikariConfig hikariConfig13 = new com.zaxxer.hikari.HikariConfig();
        javax.sql.DataSource dataSource14 = hikariConfig13.getDataSource();
        hikariConfig13.setConnectionTestQuery("");
        hikariConfig13.setInitializationFailFast(false);
        long long19 = hikariConfig13.getConnectionTimeout();
        java.util.Properties properties20 = hikariConfig13.dataSourceProperties;
        hikariConfig10.dataSourceProperties = properties20;
        hikariConfig0.setDataSourceProperties(properties20);
        java.lang.String str23 = hikariConfig0.getJdbcUrl();
        javax.sql.DataSource dataSource24 = hikariConfig0.dataSource;
        java.util.Properties properties25 = hikariConfig0.dataSourceProperties;
        java.util.Properties properties26 = hikariConfig0.dataSourceProperties;
        int int27 = hikariConfig0.acquireIncrement;
        hikariConfig0.setLeakDetectionThreshold((long) (byte) 100);
        hikariConfig0.setIdleTimeout((long) ' ');
        long long32 = hikariConfig0.idleTimeout;
        hikariConfig0.isIsolateInternalQueries = false;
        hikariConfig0.setLeakDetectionThreshold((long) 100);
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "HikariPool-42024" + "'", str3, "HikariPool-42024");
        org.junit.Assert.assertNull(dataSource14);
// flaky:         org.junit.Assert.assertTrue("'" + long19 + "' != '" + 32L + "'", long19 == 32L);
        org.junit.Assert.assertNotNull(properties20);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
        org.junit.Assert.assertNull(dataSource24);
        org.junit.Assert.assertNotNull(properties25);
        org.junit.Assert.assertNotNull(properties26);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 1 + "'", int27 == 1);
        org.junit.Assert.assertTrue("'" + long32 + "' != '" + 32L + "'", long32 == 32L);
    }

    @Test
    public void test17032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17032");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        java.lang.String str1 = hikariConfig0.getConnectionInitSql();
        long long2 = hikariConfig0.getLeakDetectionThreshold();
        int int3 = hikariConfig0.getMaximumPoolSize();
        long long4 = hikariConfig0.leakDetectionThreshold;
        hikariConfig0.setInitializationFailFast(true);
        com.zaxxer.hikari.HikariConfig hikariConfig8 = new com.zaxxer.hikari.HikariConfig();
        javax.sql.DataSource dataSource9 = hikariConfig8.getDataSource();
        hikariConfig8.setConnectionTestQuery("");
        hikariConfig8.connectionCustomizerClassName = "";
        long long14 = hikariConfig8.getAcquireRetryDelay();
        hikariConfig8.setDataSourceClassName("HikariPool-66");
        hikariConfig8.setInitializationFailFast(false);
        hikariConfig0.addDataSourceProperty("HikariPool-62", (java.lang.Object) hikariConfig8);
        int int20 = hikariConfig8.getAcquireIncrement();
        hikariConfig8.setCatalog("HikariPool-13849");
        hikariConfig8.acquireRetries = 97;
        hikariConfig8.transactionIsolation = (byte) 0;
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 60 + "'", int3 == 60);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertNull(dataSource9);
// flaky:         org.junit.Assert.assertTrue("'" + long14 + "' != '" + 100L + "'", long14 == 100L);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 1 + "'", int20 == 1);
    }

    @Test
    public void test17033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17033");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        javax.sql.DataSource dataSource1 = hikariConfig0.getDataSource();
        hikariConfig0.setConnectionTestQuery("");
        hikariConfig0.connectionCustomizerClassName = "";
        hikariConfig0.setConnectionCustomizerClassName("hi!");
        java.lang.String str8 = hikariConfig0.getCatalog();
        com.zaxxer.hikari.IConnectionCustomizer iConnectionCustomizer9 = null;
        hikariConfig0.connectionCustomizer = iConnectionCustomizer9;
        hikariConfig0.setJdbcUrl("HikariPool-38");
        hikariConfig0.setConnectionTimeout(2147483647L);
        int int15 = hikariConfig0.getMinimumPoolSize();
        hikariConfig0.acquireRetries = 97;
        java.lang.String str18 = hikariConfig0.getConnectionCustomizerClassName();
        org.junit.Assert.assertNull(dataSource1);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 10 + "'", int15 == 10);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!" + "'", str18, "hi!");
    }

    @Test
    public void test17034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17034");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        javax.sql.DataSource dataSource1 = hikariConfig0.getDataSource();
        hikariConfig0.setConnectionTestQuery("");
        hikariConfig0.setInitializationFailFast(false);
        hikariConfig0.catalog = "";
        javax.sql.DataSource dataSource8 = null;
        hikariConfig0.dataSource = dataSource8;
        javax.sql.DataSource dataSource10 = null;
        hikariConfig0.dataSource = dataSource10;
        int int12 = hikariConfig0.maxPoolSize;
        long long13 = hikariConfig0.getIdleTimeout();
        javax.sql.DataSource dataSource14 = hikariConfig0.dataSource;
        hikariConfig0.setDataSourceClassName("HikariPool-122");
        long long17 = hikariConfig0.getLeakDetectionThreshold();
        int int18 = hikariConfig0.getMinimumPoolSize();
        com.zaxxer.hikari.IConnectionCustomizer iConnectionCustomizer19 = null;
        hikariConfig0.connectionCustomizer = iConnectionCustomizer19;
        javax.sql.DataSource dataSource21 = hikariConfig0.getDataSource();
        org.junit.Assert.assertNull(dataSource1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 60 + "'", int12 == 60);
// flaky:         org.junit.Assert.assertTrue("'" + long13 + "' != '" + (-1L) + "'", long13 == (-1L));
        org.junit.Assert.assertNull(dataSource14);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 0L + "'", long17 == 0L);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 10 + "'", int18 == 10);
        org.junit.Assert.assertNull(dataSource21);
    }

    @Test
    public void test17035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17035");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        hikariConfig0.setMaxLifetime((long) (short) 10);
        com.zaxxer.hikari.IConnectionCustomizer iConnectionCustomizer3 = hikariConfig0.connectionCustomizer;
        hikariConfig0.setDataSourceClassName("HikariPool-47");
        hikariConfig0.setDataSourceClassName("HikariPool-18");
        boolean boolean8 = hikariConfig0.isRegisterMbeans();
        hikariConfig0.setInitializationFailFast(true);
        java.lang.String str11 = hikariConfig0.poolName;
        hikariConfig0.setAcquireRetries(100);
        org.junit.Assert.assertNull(iConnectionCustomizer3);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "HikariPool-42032" + "'", str11, "HikariPool-42032");
    }

    @Test
    public void test17036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17036");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        javax.sql.DataSource dataSource1 = hikariConfig0.getDataSource();
        hikariConfig0.setConnectionTestQuery("");
        hikariConfig0.connectionCustomizerClassName = "";
        hikariConfig0.setConnectionCustomizerClassName("hi!");
        java.lang.String str8 = hikariConfig0.getCatalog();
        boolean boolean9 = hikariConfig0.isRegisterMbeans;
        com.zaxxer.hikari.HikariConfig hikariConfig11 = new com.zaxxer.hikari.HikariConfig();
        javax.sql.DataSource dataSource12 = hikariConfig11.getDataSource();
        hikariConfig11.setConnectionTestQuery("");
        hikariConfig11.connectionCustomizerClassName = "";
        hikariConfig11.setConnectionCustomizerClassName("hi!");
        java.lang.String str19 = hikariConfig11.getCatalog();
        boolean boolean20 = hikariConfig11.isRegisterMbeans;
        hikariConfig11.setAcquireRetries(0);
        hikariConfig11.setMaximumPoolSize((int) '#');
        hikariConfig0.addDataSourceProperty("HikariPool-47", (java.lang.Object) '#');
        hikariConfig0.setConnectionTestQuery("HikariPool-47");
        hikariConfig0.setConnectionCustomizerClassName("HikariPool-18");
        long long30 = hikariConfig0.leakDetectionThreshold;
        hikariConfig0.setAcquireRetries((int) 'a');
        hikariConfig0.isIsolateInternalQueries = false;
        long long35 = hikariConfig0.leakDetectionThreshold;
        org.junit.Assert.assertNull(dataSource1);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(dataSource12);
        org.junit.Assert.assertNull(str19);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + long30 + "' != '" + 0L + "'", long30 == 0L);
        org.junit.Assert.assertTrue("'" + long35 + "' != '" + 0L + "'", long35 == 0L);
    }

    @Test
    public void test17037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17037");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        javax.sql.DataSource dataSource1 = hikariConfig0.getDataSource();
        hikariConfig0.setConnectionTestQuery("");
        hikariConfig0.connectionCustomizerClassName = "";
        hikariConfig0.setConnectionCustomizerClassName("hi!");
        java.lang.String str8 = hikariConfig0.getCatalog();
        boolean boolean9 = hikariConfig0.isRegisterMbeans;
        hikariConfig0.setAcquireRetries(0);
        hikariConfig0.setMaximumPoolSize((int) '#');
        hikariConfig0.setTransactionIsolation("hi!");
        boolean boolean16 = hikariConfig0.isInitializationFailFast();
        java.lang.String str17 = hikariConfig0.connectionInitSql;
        long long18 = hikariConfig0.connectionTimeout;
        java.lang.String str19 = hikariConfig0.getConnectionInitSql();
        hikariConfig0.jdbcUrl = "HikariPool-5808";
        org.junit.Assert.assertNull(dataSource1);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNull(str17);
// flaky:         org.junit.Assert.assertTrue("'" + long18 + "' != '" + 32L + "'", long18 == 32L);
        org.junit.Assert.assertNull(str19);
    }

    @Test
    public void test17038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17038");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        javax.sql.DataSource dataSource1 = hikariConfig0.getDataSource();
        hikariConfig0.idleTimeout = 3;
        hikariConfig0.setLeakDetectionThreshold(52L);
        int int6 = hikariConfig0.minPoolSize;
        long long7 = hikariConfig0.idleTimeout;
        java.lang.String str8 = hikariConfig0.transactionIsolationName;
        java.lang.String str9 = hikariConfig0.connectionCustomizerClassName;
        org.junit.Assert.assertNull(dataSource1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 3L + "'", long7 == 3L);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str9);
    }

    @Test
    public void test17039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17039");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        javax.sql.DataSource dataSource1 = hikariConfig0.getDataSource();
        hikariConfig0.setConnectionTestQuery("");
        java.lang.String str4 = hikariConfig0.catalog;
        java.lang.String str5 = hikariConfig0.poolName;
        long long6 = hikariConfig0.getMaxLifetime();
        hikariConfig0.setMaximumPoolSize(0);
        // The following exception was thrown during execution in test generation
        try {
            hikariConfig0.setAcquireIncrement((int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: acquireRetries cannot be less than 1");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(dataSource1);
        org.junit.Assert.assertNull(str4);
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "HikariPool-42038" + "'", str5, "HikariPool-42038");
// flaky:         org.junit.Assert.assertTrue("'" + long6 + "' != '" + 32L + "'", long6 == 32L);
    }

    @Test
    public void test17040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17040");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        javax.sql.DataSource dataSource1 = hikariConfig0.getDataSource();
        hikariConfig0.setConnectionTestQuery("");
        hikariConfig0.connectionCustomizerClassName = "";
        hikariConfig0.setConnectionCustomizerClassName("hi!");
        int int8 = hikariConfig0.acquireIncrement;
        int int9 = hikariConfig0.minPoolSize;
        java.lang.String str10 = hikariConfig0.poolName;
        boolean boolean11 = hikariConfig0.isReadOnly;
        long long12 = hikariConfig0.acquireRetryDelay;
        org.junit.Assert.assertNull(dataSource1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 10 + "'", int9 == 10);
// flaky:         org.junit.Assert.assertEquals("'" + str10 + "' != '" + "HikariPool-42039" + "'", str10, "HikariPool-42039");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
// flaky:         org.junit.Assert.assertTrue("'" + long12 + "' != '" + 100L + "'", long12 == 100L);
    }

    @Test
    public void test17041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17041");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        java.lang.String str1 = hikariConfig0.getJdbcUrl();
        com.zaxxer.hikari.IConnectionCustomizer iConnectionCustomizer2 = hikariConfig0.connectionCustomizer;
        hikariConfig0.setConnectionTestQuery("HikariPool-141");
        hikariConfig0.jdbcUrl = "HikariPool-208";
        java.lang.String str7 = hikariConfig0.getConnectionTestQuery();
        hikariConfig0.dataSourceClassName = "HikariPool-55";
        hikariConfig0.transactionIsolationName = "HikariPool-919";
        hikariConfig0.setAcquireRetries(100);
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(iConnectionCustomizer2);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "HikariPool-141" + "'", str7, "HikariPool-141");
    }

    @Test
    public void test17042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17042");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        hikariConfig0.setMaxLifetime((long) (short) 10);
        com.zaxxer.hikari.HikariConfig hikariConfig3 = new com.zaxxer.hikari.HikariConfig();
        javax.sql.DataSource dataSource4 = hikariConfig3.getDataSource();
        hikariConfig3.setConnectionTestQuery("");
        hikariConfig3.setInitializationFailFast(false);
        long long9 = hikariConfig3.getConnectionTimeout();
        java.util.Properties properties10 = hikariConfig3.dataSourceProperties;
        hikariConfig0.dataSourceProperties = properties10;
        hikariConfig0.maxLifetime = 750L;
        hikariConfig0.minPoolSize = (short) 100;
        long long16 = hikariConfig0.getIdleTimeout();
        java.lang.String str17 = hikariConfig0.getJdbcUrl();
        com.zaxxer.hikari.HikariConfig hikariConfig19 = new com.zaxxer.hikari.HikariConfig();
        java.lang.String str20 = hikariConfig19.getConnectionInitSql();
        long long21 = hikariConfig19.getLeakDetectionThreshold();
        int int22 = hikariConfig19.getMaximumPoolSize();
        long long23 = hikariConfig19.leakDetectionThreshold;
        hikariConfig19.catalog = "HikariPool-62";
        boolean boolean26 = hikariConfig19.isJdbc4connectionTest;
        int int27 = hikariConfig19.acquireRetries;
        hikariConfig19.poolName = "HikariPool-428";
        com.zaxxer.hikari.HikariConfig hikariConfig31 = new com.zaxxer.hikari.HikariConfig();
        javax.sql.DataSource dataSource32 = hikariConfig31.getDataSource();
        hikariConfig31.setConnectionTestQuery("");
        hikariConfig31.setInitializationFailFast(false);
        hikariConfig31.catalog = "";
        javax.sql.DataSource dataSource39 = hikariConfig31.getDataSource();
        hikariConfig31.poolName = "HikariPool-73";
        hikariConfig19.addDataSourceProperty("HikariPool-215", (java.lang.Object) "HikariPool-73");
        boolean boolean43 = hikariConfig19.isAutoCommit;
        boolean boolean44 = hikariConfig19.isAutoCommit;
        boolean boolean45 = hikariConfig19.isAutoCommit();
        hikariConfig0.addDataSourceProperty("HikariPool-10440", (java.lang.Object) hikariConfig19);
        org.junit.Assert.assertNull(dataSource4);
// flaky:         org.junit.Assert.assertTrue("'" + long9 + "' != '" + 32L + "'", long9 == 32L);
        org.junit.Assert.assertNotNull(properties10);
// flaky:         org.junit.Assert.assertTrue("'" + long16 + "' != '" + (-1L) + "'", long16 == (-1L));
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertNull(str20);
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + 0L + "'", long21 == 0L);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 60 + "'", int22 == 60);
        org.junit.Assert.assertTrue("'" + long23 + "' != '" + 0L + "'", long23 == 0L);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 3 + "'", int27 == 3);
        org.junit.Assert.assertNull(dataSource32);
        org.junit.Assert.assertNull(dataSource39);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + true + "'", boolean43 == true);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + true + "'", boolean44 == true);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + true + "'", boolean45 == true);
    }

    @Test
    public void test17043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17043");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        hikariConfig0.setMaxLifetime((long) (short) 10);
        com.zaxxer.hikari.HikariConfig hikariConfig3 = new com.zaxxer.hikari.HikariConfig();
        javax.sql.DataSource dataSource4 = hikariConfig3.getDataSource();
        hikariConfig3.setConnectionTestQuery("");
        hikariConfig3.setInitializationFailFast(false);
        long long9 = hikariConfig3.getConnectionTimeout();
        java.util.Properties properties10 = hikariConfig3.dataSourceProperties;
        hikariConfig0.dataSourceProperties = properties10;
        hikariConfig0.maxLifetime = 750L;
        hikariConfig0.minPoolSize = (short) 100;
        hikariConfig0.poolName = "HikariPool-47";
        hikariConfig0.leakDetectionThreshold = (byte) 100;
        hikariConfig0.minPoolSize = 32;
        org.junit.Assert.assertNull(dataSource4);
// flaky:         org.junit.Assert.assertTrue("'" + long9 + "' != '" + 32L + "'", long9 == 32L);
        org.junit.Assert.assertNotNull(properties10);
    }

    @Test
    public void test17044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17044");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        javax.sql.DataSource dataSource1 = hikariConfig0.getDataSource();
        hikariConfig0.setConnectionTestQuery("");
        hikariConfig0.setInitializationFailFast(false);
        hikariConfig0.catalog = "";
        javax.sql.DataSource dataSource8 = hikariConfig0.getDataSource();
        hikariConfig0.acquireRetries = (short) 10;
        boolean boolean11 = hikariConfig0.isIsolateInternalQueries;
        int int12 = hikariConfig0.acquireIncrement;
        hikariConfig0.maxLifetime = 10L;
        long long15 = hikariConfig0.getMaxLifetime();
        long long16 = hikariConfig0.maxLifetime;
        hikariConfig0.addDataSourceProperty("", (java.lang.Object) "HikariPool-15720");
        org.junit.Assert.assertNull(dataSource1);
        org.junit.Assert.assertNull(dataSource8);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 10L + "'", long15 == 10L);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 10L + "'", long16 == 10L);
    }

    @Test
    public void test17045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17045");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        javax.sql.DataSource dataSource1 = hikariConfig0.getDataSource();
        hikariConfig0.setConnectionTestQuery("");
        hikariConfig0.setInitializationFailFast(false);
        hikariConfig0.poolName = "";
        int int8 = hikariConfig0.getTransactionIsolation();
        hikariConfig0.setCatalog("HikariPool-93");
        boolean boolean11 = hikariConfig0.isJdbc4connectionTest;
        java.lang.String str12 = hikariConfig0.jdbcUrl;
        int int13 = hikariConfig0.getMinimumPoolSize();
        org.junit.Assert.assertNull(dataSource1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 10 + "'", int13 == 10);
    }

    @Test
    public void test17046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17046");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        javax.sql.DataSource dataSource1 = hikariConfig0.getDataSource();
        hikariConfig0.setConnectionTestQuery("");
        hikariConfig0.setInitializationFailFast(false);
        long long6 = hikariConfig0.getConnectionTimeout();
        java.util.Properties properties7 = hikariConfig0.dataSourceProperties;
        boolean boolean8 = hikariConfig0.isInitializationFailFast();
        hikariConfig0.setLeakDetectionThreshold(0L);
        java.lang.String str11 = hikariConfig0.connectionCustomizerClassName;
        int int12 = hikariConfig0.getAcquireRetries();
        hikariConfig0.setConnectionCustomizerClassName("HikariPool-18");
        long long15 = hikariConfig0.getMaxLifetime();
        hikariConfig0.setMinimumPoolSize((int) 'a');
        hikariConfig0.setJdbc4ConnectionTest(false);
        hikariConfig0.setCatalog("HikariPool-7668");
        java.util.Properties properties22 = hikariConfig0.dataSourceProperties;
        int int23 = hikariConfig0.acquireIncrement;
        org.junit.Assert.assertNull(dataSource1);
// flaky:         org.junit.Assert.assertTrue("'" + long6 + "' != '" + 32L + "'", long6 == 32L);
        org.junit.Assert.assertNotNull(properties7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 3 + "'", int12 == 3);
// flaky:         org.junit.Assert.assertTrue("'" + long15 + "' != '" + 32L + "'", long15 == 32L);
        org.junit.Assert.assertNotNull(properties22);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 1 + "'", int23 == 1);
    }

    @Test
    public void test17047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17047");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        javax.sql.DataSource dataSource1 = hikariConfig0.getDataSource();
        hikariConfig0.setConnectionTestQuery("");
        hikariConfig0.setInitializationFailFast(false);
        hikariConfig0.catalog = "";
        int int8 = hikariConfig0.getMaximumPoolSize();
        com.zaxxer.hikari.IConnectionCustomizer iConnectionCustomizer9 = null;
        hikariConfig0.connectionCustomizer = iConnectionCustomizer9;
        hikariConfig0.connectionTestQuery = "HikariPool-169";
        hikariConfig0.setAcquireRetryDelay(2147483647L);
        java.lang.String str15 = hikariConfig0.connectionTestQuery;
        java.lang.String str16 = hikariConfig0.getConnectionTestQuery();
        long long17 = hikariConfig0.maxLifetime;
        org.junit.Assert.assertNull(dataSource1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 60 + "'", int8 == 60);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "HikariPool-169" + "'", str15, "HikariPool-169");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "HikariPool-169" + "'", str16, "HikariPool-169");
// flaky:         org.junit.Assert.assertTrue("'" + long17 + "' != '" + 32L + "'", long17 == 32L);
    }

    @Test
    public void test17048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17048");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        javax.sql.DataSource dataSource1 = hikariConfig0.getDataSource();
        hikariConfig0.setConnectionTestQuery("");
        com.zaxxer.hikari.HikariConfig hikariConfig4 = new com.zaxxer.hikari.HikariConfig();
        javax.sql.DataSource dataSource5 = hikariConfig4.getDataSource();
        hikariConfig4.setConnectionTestQuery("");
        hikariConfig4.setInitializationFailFast(false);
        long long10 = hikariConfig4.getConnectionTimeout();
        java.util.Properties properties11 = hikariConfig4.dataSourceProperties;
        hikariConfig0.setDataSourceProperties(properties11);
        int int13 = hikariConfig0.getTransactionIsolation();
        javax.sql.DataSource dataSource14 = hikariConfig0.getDataSource();
        boolean boolean15 = hikariConfig0.isAutoCommit;
        int int16 = hikariConfig0.getAcquireIncrement();
        hikariConfig0.catalog = "HikariPool-4511";
        hikariConfig0.jdbcUrl = "HikariPool-24558";
        org.junit.Assert.assertNull(dataSource1);
        org.junit.Assert.assertNull(dataSource5);
// flaky:         org.junit.Assert.assertTrue("'" + long10 + "' != '" + 32L + "'", long10 == 32L);
        org.junit.Assert.assertNotNull(properties11);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertNull(dataSource14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
    }

    @Test
    public void test17049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17049");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        javax.sql.DataSource dataSource1 = hikariConfig0.getDataSource();
        hikariConfig0.setConnectionTestQuery("");
        hikariConfig0.connectionCustomizerClassName = "";
        hikariConfig0.setConnectionCustomizerClassName("hi!");
        java.lang.String str8 = hikariConfig0.getCatalog();
        boolean boolean9 = hikariConfig0.isRegisterMbeans;
        hikariConfig0.setAcquireRetries(0);
        hikariConfig0.isAutoCommit = true;
        boolean boolean14 = hikariConfig0.isAutoCommit();
        hikariConfig0.isIsolateInternalQueries = false;
        int int17 = hikariConfig0.getTransactionIsolation();
        hikariConfig0.isInitializationFailFast = false;
        hikariConfig0.setMinimumPoolSize(32);
        boolean boolean22 = hikariConfig0.isIsolateInternalQueries();
        org.junit.Assert.assertNull(dataSource1);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
    }

    @Test
    public void test17050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17050");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        hikariConfig0.setMaxLifetime((long) (short) 10);
        java.lang.String str3 = hikariConfig0.getPoolName();
        hikariConfig0.jdbcUrl = "";
        hikariConfig0.setMaxLifetime(0L);
        hikariConfig0.setTransactionIsolation("HikariPool-48");
        com.zaxxer.hikari.HikariConfig hikariConfig10 = new com.zaxxer.hikari.HikariConfig();
        hikariConfig10.setMaxLifetime((long) (short) 10);
        com.zaxxer.hikari.HikariConfig hikariConfig13 = new com.zaxxer.hikari.HikariConfig();
        javax.sql.DataSource dataSource14 = hikariConfig13.getDataSource();
        hikariConfig13.setConnectionTestQuery("");
        hikariConfig13.setInitializationFailFast(false);
        long long19 = hikariConfig13.getConnectionTimeout();
        java.util.Properties properties20 = hikariConfig13.dataSourceProperties;
        hikariConfig10.dataSourceProperties = properties20;
        hikariConfig0.setDataSourceProperties(properties20);
        com.zaxxer.hikari.HikariConfig hikariConfig23 = new com.zaxxer.hikari.HikariConfig(properties20);
        long long24 = hikariConfig23.acquireRetryDelay;
        java.util.Properties properties25 = hikariConfig23.getDataSourceProperties();
        hikariConfig23.setConnectionCustomizerClassName("HikariPool-3056");
        long long28 = hikariConfig23.getIdleTimeout();
        hikariConfig23.acquireRetryDelay = (short) 1;
        hikariConfig23.setJdbcUrl("HikariPool-8473");
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "HikariPool-42057" + "'", str3, "HikariPool-42057");
        org.junit.Assert.assertNull(dataSource14);
// flaky:         org.junit.Assert.assertTrue("'" + long19 + "' != '" + 32L + "'", long19 == 32L);
        org.junit.Assert.assertNotNull(properties20);
// flaky:         org.junit.Assert.assertTrue("'" + long24 + "' != '" + 100L + "'", long24 == 100L);
        org.junit.Assert.assertNotNull(properties25);
// flaky:         org.junit.Assert.assertTrue("'" + long28 + "' != '" + (-1L) + "'", long28 == (-1L));
    }

    @Test
    public void test17051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17051");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        java.lang.String str1 = hikariConfig0.getConnectionInitSql();
        long long2 = hikariConfig0.getLeakDetectionThreshold();
        com.zaxxer.hikari.IConnectionCustomizer iConnectionCustomizer3 = null;
        hikariConfig0.connectionCustomizer = iConnectionCustomizer3;
        hikariConfig0.acquireRetries = 0;
        int int7 = hikariConfig0.acquireIncrement;
        hikariConfig0.dataSourceClassName = "HikariPool-5103";
        java.lang.String str10 = hikariConfig0.connectionTestQuery;
        hikariConfig0.connectionTestQuery = "HikariPool-21147";
        hikariConfig0.setAutoCommit(true);
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertNull(str10);
    }

    @Test
    public void test17052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17052");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        java.lang.String str1 = hikariConfig0.getConnectionInitSql();
        long long2 = hikariConfig0.getLeakDetectionThreshold();
        com.zaxxer.hikari.IConnectionCustomizer iConnectionCustomizer3 = null;
        hikariConfig0.connectionCustomizer = iConnectionCustomizer3;
        boolean boolean5 = hikariConfig0.isIsolateInternalQueries();
        hikariConfig0.poolName = "HikariPool-47";
        java.lang.String str8 = hikariConfig0.getCatalog();
        long long9 = hikariConfig0.acquireRetryDelay;
        com.zaxxer.hikari.HikariConfig hikariConfig10 = new com.zaxxer.hikari.HikariConfig();
        java.lang.String str11 = hikariConfig10.getConnectionInitSql();
        long long12 = hikariConfig10.getLeakDetectionThreshold();
        int int13 = hikariConfig10.getMaximumPoolSize();
        java.util.Properties properties14 = hikariConfig10.getDataSourceProperties();
        hikariConfig0.setDataSourceProperties(properties14);
        boolean boolean16 = hikariConfig0.isAutoCommit();
        boolean boolean17 = hikariConfig0.isInitializationFailFast();
        int int18 = hikariConfig0.acquireRetries;
        hikariConfig0.minPoolSize = (byte) 10;
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(str8);
// flaky:         org.junit.Assert.assertTrue("'" + long9 + "' != '" + 100L + "'", long9 == 100L);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 60 + "'", int13 == 60);
        org.junit.Assert.assertNotNull(properties14);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 3 + "'", int18 == 3);
    }

    @Test
    public void test17053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17053");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        java.lang.String str1 = hikariConfig0.getConnectionInitSql();
        long long2 = hikariConfig0.getLeakDetectionThreshold();
        com.zaxxer.hikari.IConnectionCustomizer iConnectionCustomizer3 = null;
        hikariConfig0.connectionCustomizer = iConnectionCustomizer3;
        hikariConfig0.acquireRetries = 0;
        int int7 = hikariConfig0.acquireIncrement;
        long long8 = hikariConfig0.getMaxLifetime();
        hikariConfig0.setJdbc4ConnectionTest(true);
        hikariConfig0.connectionInitSql = "HikariPool-32957";
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
// flaky:         org.junit.Assert.assertTrue("'" + long8 + "' != '" + 32L + "'", long8 == 32L);
    }

    @Test
    public void test17054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17054");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        java.lang.String str1 = hikariConfig0.getConnectionInitSql();
        long long2 = hikariConfig0.getLeakDetectionThreshold();
        hikariConfig0.leakDetectionThreshold = (-1);
        long long5 = hikariConfig0.acquireRetryDelay;
        long long6 = hikariConfig0.getIdleTimeout();
        int int7 = hikariConfig0.maxPoolSize;
        javax.sql.DataSource dataSource8 = null;
        hikariConfig0.dataSource = dataSource8;
        long long10 = hikariConfig0.maxLifetime;
        hikariConfig0.isJdbc4connectionTest = false;
        java.util.Properties properties13 = hikariConfig0.dataSourceProperties;
        hikariConfig0.connectionTimeout = 3L;
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
// flaky:         org.junit.Assert.assertTrue("'" + long5 + "' != '" + 100L + "'", long5 == 100L);
// flaky:         org.junit.Assert.assertTrue("'" + long6 + "' != '" + (-1L) + "'", long6 == (-1L));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 60 + "'", int7 == 60);
// flaky:         org.junit.Assert.assertTrue("'" + long10 + "' != '" + 32L + "'", long10 == 32L);
        org.junit.Assert.assertNotNull(properties13);
    }

    @Test
    public void test17055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17055");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        javax.sql.DataSource dataSource1 = hikariConfig0.getDataSource();
        hikariConfig0.setConnectionTestQuery("");
        hikariConfig0.connectionCustomizerClassName = "";
        hikariConfig0.setConnectionCustomizerClassName("hi!");
        java.lang.String str8 = hikariConfig0.getCatalog();
        boolean boolean9 = hikariConfig0.isRegisterMbeans;
        com.zaxxer.hikari.HikariConfig hikariConfig11 = new com.zaxxer.hikari.HikariConfig();
        javax.sql.DataSource dataSource12 = hikariConfig11.getDataSource();
        hikariConfig11.setConnectionTestQuery("");
        hikariConfig11.connectionCustomizerClassName = "";
        hikariConfig11.setConnectionCustomizerClassName("hi!");
        java.lang.String str19 = hikariConfig11.getCatalog();
        boolean boolean20 = hikariConfig11.isRegisterMbeans;
        hikariConfig11.setAcquireRetries(0);
        hikariConfig11.setMaximumPoolSize((int) '#');
        hikariConfig0.addDataSourceProperty("HikariPool-47", (java.lang.Object) '#');
        hikariConfig0.setConnectionTestQuery("HikariPool-47");
        java.lang.String str28 = hikariConfig0.connectionInitSql;
        hikariConfig0.transactionIsolation = (short) 100;
        hikariConfig0.setAcquireRetries(100);
        hikariConfig0.transactionIsolationName = "HikariPool-101";
        boolean boolean35 = hikariConfig0.isIsolateInternalQueries;
        hikariConfig0.setJdbcUrl("HikariPool-234");
        boolean boolean38 = hikariConfig0.isInitializationFailFast();
        long long39 = hikariConfig0.getIdleTimeout();
        org.junit.Assert.assertNull(dataSource1);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(dataSource12);
        org.junit.Assert.assertNull(str19);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNull(str28);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
// flaky:         org.junit.Assert.assertTrue("'" + long39 + "' != '" + (-1L) + "'", long39 == (-1L));
    }

    @Test
    public void test17056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17056");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        javax.sql.DataSource dataSource1 = hikariConfig0.getDataSource();
        hikariConfig0.setConnectionTestQuery("");
        hikariConfig0.setInitializationFailFast(false);
        hikariConfig0.catalog = "";
        javax.sql.DataSource dataSource8 = null;
        hikariConfig0.dataSource = dataSource8;
        javax.sql.DataSource dataSource10 = null;
        hikariConfig0.dataSource = dataSource10;
        int int12 = hikariConfig0.maxPoolSize;
        long long13 = hikariConfig0.getIdleTimeout();
        hikariConfig0.maxLifetime = 97L;
        java.lang.String str16 = hikariConfig0.getPoolName();
        hikariConfig0.setAcquireIncrement((int) '#');
        org.junit.Assert.assertNull(dataSource1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 60 + "'", int12 == 60);
// flaky:         org.junit.Assert.assertTrue("'" + long13 + "' != '" + (-1L) + "'", long13 == (-1L));
// flaky:         org.junit.Assert.assertEquals("'" + str16 + "' != '" + "HikariPool-42068" + "'", str16, "HikariPool-42068");
    }

    @Test
    public void test17057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17057");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        java.lang.String str1 = hikariConfig0.getConnectionInitSql();
        long long2 = hikariConfig0.getLeakDetectionThreshold();
        hikariConfig0.leakDetectionThreshold = (-1);
        long long5 = hikariConfig0.acquireRetryDelay;
        long long6 = hikariConfig0.getIdleTimeout();
        hikariConfig0.acquireIncrement = '4';
        long long9 = hikariConfig0.connectionTimeout;
        long long10 = hikariConfig0.getIdleTimeout();
        long long11 = hikariConfig0.getMaxLifetime();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
// flaky:         org.junit.Assert.assertTrue("'" + long5 + "' != '" + 100L + "'", long5 == 100L);
// flaky:         org.junit.Assert.assertTrue("'" + long6 + "' != '" + (-1L) + "'", long6 == (-1L));
// flaky:         org.junit.Assert.assertTrue("'" + long9 + "' != '" + 32L + "'", long9 == 32L);
// flaky:         org.junit.Assert.assertTrue("'" + long10 + "' != '" + (-1L) + "'", long10 == (-1L));
// flaky:         org.junit.Assert.assertTrue("'" + long11 + "' != '" + 32L + "'", long11 == 32L);
    }

    @Test
    public void test17058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17058");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        javax.sql.DataSource dataSource1 = hikariConfig0.getDataSource();
        hikariConfig0.idleTimeout = 3;
        hikariConfig0.setLeakDetectionThreshold(52L);
        int int6 = hikariConfig0.maxPoolSize;
        boolean boolean7 = hikariConfig0.isIsolateInternalQueries();
        hikariConfig0.maxPoolSize = 60;
        boolean boolean10 = hikariConfig0.isAutoCommit;
        org.junit.Assert.assertNull(dataSource1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 60 + "'", int6 == 60);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test17059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17059");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        javax.sql.DataSource dataSource1 = hikariConfig0.getDataSource();
        hikariConfig0.setConnectionTestQuery("");
        hikariConfig0.connectionCustomizerClassName = "";
        hikariConfig0.setConnectionCustomizerClassName("hi!");
        java.lang.String str8 = hikariConfig0.getCatalog();
        boolean boolean9 = hikariConfig0.isRegisterMbeans;
        javax.sql.DataSource dataSource10 = hikariConfig0.dataSource;
        long long11 = hikariConfig0.idleTimeout;
        com.zaxxer.hikari.HikariConfig hikariConfig13 = new com.zaxxer.hikari.HikariConfig();
        java.lang.String str14 = hikariConfig13.getConnectionInitSql();
        long long15 = hikariConfig13.getLeakDetectionThreshold();
        hikariConfig13.leakDetectionThreshold = (-1);
        int int18 = hikariConfig13.acquireIncrement;
        hikariConfig13.setInitializationFailFast(true);
        int int21 = hikariConfig13.maxPoolSize;
        com.zaxxer.hikari.HikariConfig hikariConfig22 = new com.zaxxer.hikari.HikariConfig();
        java.lang.String str23 = hikariConfig22.getConnectionInitSql();
        long long24 = hikariConfig22.getLeakDetectionThreshold();
        hikariConfig22.leakDetectionThreshold = (-1);
        long long27 = hikariConfig22.acquireRetryDelay;
        long long28 = hikariConfig22.getIdleTimeout();
        hikariConfig22.acquireIncrement = '4';
        javax.sql.DataSource dataSource31 = hikariConfig22.getDataSource();
        hikariConfig22.acquireRetries = 35;
        java.util.Properties properties34 = hikariConfig22.dataSourceProperties;
        com.zaxxer.hikari.HikariConfig hikariConfig35 = new com.zaxxer.hikari.HikariConfig(properties34);
        hikariConfig13.setDataSourceProperties(properties34);
        boolean boolean37 = hikariConfig13.isJdbc4ConnectionTest();
        boolean boolean38 = hikariConfig13.isJdbc4connectionTest;
        hikariConfig0.addDataSourceProperty("HikariPool-1021", (java.lang.Object) boolean38);
        hikariConfig0.setMaxLifetime((long) 3);
        int int42 = hikariConfig0.maxPoolSize;
        org.junit.Assert.assertNull(dataSource1);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(dataSource10);
// flaky:         org.junit.Assert.assertTrue("'" + long11 + "' != '" + (-1L) + "'", long11 == (-1L));
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 0L + "'", long15 == 0L);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 60 + "'", int21 == 60);
        org.junit.Assert.assertNull(str23);
        org.junit.Assert.assertTrue("'" + long24 + "' != '" + 0L + "'", long24 == 0L);
// flaky:         org.junit.Assert.assertTrue("'" + long27 + "' != '" + 100L + "'", long27 == 100L);
// flaky:         org.junit.Assert.assertTrue("'" + long28 + "' != '" + (-1L) + "'", long28 == (-1L));
        org.junit.Assert.assertNull(dataSource31);
        org.junit.Assert.assertNotNull(properties34);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + true + "'", boolean37 == true);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + true + "'", boolean38 == true);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 60 + "'", int42 == 60);
    }

    @Test
    public void test17060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17060");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        javax.sql.DataSource dataSource1 = hikariConfig0.getDataSource();
        hikariConfig0.setConnectionTestQuery("");
        hikariConfig0.connectionCustomizerClassName = "";
        com.zaxxer.hikari.IConnectionCustomizer iConnectionCustomizer6 = hikariConfig0.connectionCustomizer;
        java.lang.String str7 = hikariConfig0.jdbcUrl;
        boolean boolean8 = hikariConfig0.isReadOnly;
        java.lang.String str9 = hikariConfig0.jdbcUrl;
        long long10 = hikariConfig0.getMaxLifetime();
        java.lang.String str11 = hikariConfig0.connectionCustomizerClassName;
        int int12 = hikariConfig0.minPoolSize;
        java.lang.String str13 = hikariConfig0.catalog;
        // The following exception was thrown during execution in test generation
        try {
            hikariConfig0.setConnectionTimeout(60L);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: connectionTimeout cannot be less than 100ms");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(dataSource1);
        org.junit.Assert.assertNull(iConnectionCustomizer6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(str9);
// flaky:         org.junit.Assert.assertTrue("'" + long10 + "' != '" + 32L + "'", long10 == 32L);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 10 + "'", int12 == 10);
        org.junit.Assert.assertNull(str13);
    }

    @Test
    public void test17061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17061");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        java.lang.String str1 = hikariConfig0.getConnectionInitSql();
        long long2 = hikariConfig0.getLeakDetectionThreshold();
        hikariConfig0.leakDetectionThreshold = (-1);
        long long5 = hikariConfig0.acquireRetryDelay;
        long long6 = hikariConfig0.getIdleTimeout();
        long long7 = hikariConfig0.leakDetectionThreshold;
        java.lang.String str8 = hikariConfig0.getCatalog();
        hikariConfig0.isIsolateInternalQueries = false;
        com.zaxxer.hikari.IConnectionCustomizer iConnectionCustomizer11 = null;
        hikariConfig0.connectionCustomizer = iConnectionCustomizer11;
        long long13 = hikariConfig0.getMaxLifetime();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
// flaky:         org.junit.Assert.assertTrue("'" + long5 + "' != '" + 100L + "'", long5 == 100L);
// flaky:         org.junit.Assert.assertTrue("'" + long6 + "' != '" + (-1L) + "'", long6 == (-1L));
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + (-1L) + "'", long7 == (-1L));
        org.junit.Assert.assertNull(str8);
// flaky:         org.junit.Assert.assertTrue("'" + long13 + "' != '" + 32L + "'", long13 == 32L);
    }

    @Test
    public void test17062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17062");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        java.lang.String str1 = hikariConfig0.getConnectionInitSql();
        long long2 = hikariConfig0.getLeakDetectionThreshold();
        int int3 = hikariConfig0.getMaximumPoolSize();
        long long4 = hikariConfig0.leakDetectionThreshold;
        hikariConfig0.setInitializationFailFast(true);
        hikariConfig0.setUseInstrumentation(false);
        int int9 = hikariConfig0.getMaximumPoolSize();
        boolean boolean10 = hikariConfig0.isJdbc4connectionTest;
        hikariConfig0.isAutoCommit = true;
        javax.sql.DataSource dataSource13 = null;
        hikariConfig0.setDataSource(dataSource13);
        hikariConfig0.jdbcUrl = "HikariPool-3301";
        javax.sql.DataSource dataSource17 = null;
        hikariConfig0.dataSource = dataSource17;
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 60 + "'", int3 == 60);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 60 + "'", int9 == 60);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test17063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17063");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        hikariConfig0.setMaxLifetime((long) (short) 10);
        java.lang.String str3 = hikariConfig0.getPoolName();
        hikariConfig0.jdbcUrl = "";
        hikariConfig0.setMaxLifetime(0L);
        hikariConfig0.setTransactionIsolation("HikariPool-48");
        long long10 = hikariConfig0.leakDetectionThreshold;
        java.lang.String str11 = hikariConfig0.connectionInitSql;
        hikariConfig0.setJdbcUrl("HikariPool-86");
        hikariConfig0.idleTimeout = 750L;
        java.lang.String str16 = hikariConfig0.getConnectionCustomizerClassName();
        int int17 = hikariConfig0.maxPoolSize;
        hikariConfig0.isJdbc4connectionTest = true;
        hikariConfig0.idleTimeout = 10;
        long long22 = hikariConfig0.getLeakDetectionThreshold();
        boolean boolean23 = hikariConfig0.isInitializationFailFast();
        hikariConfig0.leakDetectionThreshold = 0L;
        hikariConfig0.connectionTestQuery = "HikariPool-41973";
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "HikariPool-42080" + "'", str3, "HikariPool-42080");
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 60 + "'", int17 == 60);
        org.junit.Assert.assertTrue("'" + long22 + "' != '" + 0L + "'", long22 == 0L);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
    }

    @Test
    public void test17064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17064");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        javax.sql.DataSource dataSource1 = hikariConfig0.getDataSource();
        hikariConfig0.idleTimeout = 3;
        int int4 = hikariConfig0.getAcquireRetries();
        hikariConfig0.setDataSourceClassName("HikariPool-174");
        int int7 = hikariConfig0.maxPoolSize;
        hikariConfig0.transactionIsolation = ' ';
        hikariConfig0.setIdleTimeout((long) (-1));
        org.junit.Assert.assertNull(dataSource1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 3 + "'", int4 == 3);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 60 + "'", int7 == 60);
    }

    @Test
    public void test17065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17065");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        javax.sql.DataSource dataSource1 = hikariConfig0.getDataSource();
        hikariConfig0.setConnectionTestQuery("");
        hikariConfig0.setInitializationFailFast(false);
        long long6 = hikariConfig0.getConnectionTimeout();
        java.util.Properties properties7 = hikariConfig0.dataSourceProperties;
        boolean boolean8 = hikariConfig0.isInitializationFailFast();
        hikariConfig0.setJdbc4ConnectionTest(false);
        hikariConfig0.setCatalog("");
        hikariConfig0.idleTimeout = 100;
        boolean boolean15 = hikariConfig0.isInitializationFailFast;
        java.lang.String str16 = hikariConfig0.getDataSourceClassName();
        hikariConfig0.isReadOnly = false;
        hikariConfig0.maxPoolSize = 52;
        java.util.Properties properties21 = hikariConfig0.dataSourceProperties;
        hikariConfig0.isReadOnly = true;
        org.junit.Assert.assertNull(dataSource1);
// flaky:         org.junit.Assert.assertTrue("'" + long6 + "' != '" + 32L + "'", long6 == 32L);
        org.junit.Assert.assertNotNull(properties7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertNotNull(properties21);
    }

    @Test
    public void test17066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17066");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        javax.sql.DataSource dataSource1 = hikariConfig0.getDataSource();
        hikariConfig0.setConnectionTestQuery("");
        hikariConfig0.setReadOnly(false);
        boolean boolean6 = hikariConfig0.isRegisterMbeans;
        long long7 = hikariConfig0.maxLifetime;
        hikariConfig0.setJdbcUrl("HikariPool-12137");
        org.junit.Assert.assertNull(dataSource1);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
// flaky:         org.junit.Assert.assertTrue("'" + long7 + "' != '" + 32L + "'", long7 == 32L);
    }

    @Test
    public void test17067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17067");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        javax.sql.DataSource dataSource1 = hikariConfig0.getDataSource();
        hikariConfig0.setConnectionTestQuery("");
        java.lang.String str4 = hikariConfig0.catalog;
        boolean boolean5 = hikariConfig0.isRegisterMbeans;
        hikariConfig0.setConnectionCustomizerClassName("HikariPool-435");
        java.util.Properties properties8 = hikariConfig0.getDataSourceProperties();
        hikariConfig0.catalog = "HikariPool-533";
        hikariConfig0.setTransactionIsolation("HikariPool-1337");
        java.lang.String str13 = hikariConfig0.getCatalog();
        hikariConfig0.setPoolName("HikariPool-966");
        hikariConfig0.leakDetectionThreshold = (byte) -1;
        java.util.Properties properties18 = hikariConfig0.getDataSourceProperties();
        java.lang.String str19 = hikariConfig0.getPoolName();
        org.junit.Assert.assertNull(dataSource1);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(properties8);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "HikariPool-533" + "'", str13, "HikariPool-533");
        org.junit.Assert.assertNotNull(properties18);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "HikariPool-966" + "'", str19, "HikariPool-966");
    }

    @Test
    public void test17068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17068");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        java.lang.String str1 = hikariConfig0.getConnectionInitSql();
        long long2 = hikariConfig0.getLeakDetectionThreshold();
        int int3 = hikariConfig0.getMaximumPoolSize();
        long long4 = hikariConfig0.getIdleTimeout();
        int int5 = hikariConfig0.maxPoolSize;
        java.lang.String str6 = hikariConfig0.getConnectionCustomizerClassName();
        hikariConfig0.setConnectionCustomizerClassName("HikariPool-127");
        int int9 = hikariConfig0.getAcquireIncrement();
        int int10 = hikariConfig0.maxPoolSize;
        long long11 = hikariConfig0.idleTimeout;
        hikariConfig0.isRegisterMbeans = true;
        hikariConfig0.dataSourceClassName = "HikariPool-339";
        hikariConfig0.setDataSourceClassName("HikariPool-1898");
        javax.sql.DataSource dataSource18 = null;
        hikariConfig0.setDataSource(dataSource18);
        com.zaxxer.hikari.HikariConfig hikariConfig21 = new com.zaxxer.hikari.HikariConfig();
        java.lang.String str22 = hikariConfig21.getConnectionInitSql();
        long long23 = hikariConfig21.getLeakDetectionThreshold();
        hikariConfig21.leakDetectionThreshold = (-1);
        long long26 = hikariConfig21.acquireRetryDelay;
        long long27 = hikariConfig21.getIdleTimeout();
        int int28 = hikariConfig21.maxPoolSize;
        long long29 = hikariConfig21.getIdleTimeout();
        hikariConfig0.addDataSourceProperty("HikariPool-2627", (java.lang.Object) hikariConfig21);
        java.lang.String str31 = hikariConfig0.connectionInitSql;
        hikariConfig0.setMinimumPoolSize(97);
        hikariConfig0.setIsolateInternalQueries(true);
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 60 + "'", int3 == 60);
// flaky:         org.junit.Assert.assertTrue("'" + long4 + "' != '" + (-1L) + "'", long4 == (-1L));
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 60 + "'", int5 == 60);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 60 + "'", int10 == 60);
// flaky:         org.junit.Assert.assertTrue("'" + long11 + "' != '" + (-1L) + "'", long11 == (-1L));
        org.junit.Assert.assertNull(str22);
        org.junit.Assert.assertTrue("'" + long23 + "' != '" + 0L + "'", long23 == 0L);
// flaky:         org.junit.Assert.assertTrue("'" + long26 + "' != '" + 100L + "'", long26 == 100L);
// flaky:         org.junit.Assert.assertTrue("'" + long27 + "' != '" + (-1L) + "'", long27 == (-1L));
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 60 + "'", int28 == 60);
// flaky:         org.junit.Assert.assertTrue("'" + long29 + "' != '" + (-1L) + "'", long29 == (-1L));
        org.junit.Assert.assertNull(str31);
    }

    @Test
    public void test17069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17069");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        java.lang.String str1 = hikariConfig0.getConnectionInitSql();
        long long2 = hikariConfig0.getLeakDetectionThreshold();
        hikariConfig0.leakDetectionThreshold = (-1);
        int int5 = hikariConfig0.acquireIncrement;
        hikariConfig0.setPoolName("HikariPool-62");
        hikariConfig0.acquireRetryDelay = 0L;
        java.lang.String str10 = hikariConfig0.getCatalog();
        javax.sql.DataSource dataSource11 = hikariConfig0.getDataSource();
        long long12 = hikariConfig0.acquireRetryDelay;
        com.zaxxer.hikari.IConnectionCustomizer iConnectionCustomizer13 = null;
        hikariConfig0.connectionCustomizer = iConnectionCustomizer13;
        hikariConfig0.setConnectionTestQuery("HikariPool-1011");
        hikariConfig0.isIsolateInternalQueries = false;
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(dataSource11);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
    }

    @Test
    public void test17070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17070");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        hikariConfig0.setMaxLifetime((long) (short) 10);
        com.zaxxer.hikari.HikariConfig hikariConfig3 = new com.zaxxer.hikari.HikariConfig();
        javax.sql.DataSource dataSource4 = hikariConfig3.getDataSource();
        hikariConfig3.setConnectionTestQuery("");
        hikariConfig3.setInitializationFailFast(false);
        long long9 = hikariConfig3.getConnectionTimeout();
        java.util.Properties properties10 = hikariConfig3.dataSourceProperties;
        hikariConfig0.dataSourceProperties = properties10;
        hikariConfig0.maxLifetime = 750L;
        hikariConfig0.minPoolSize = (short) 100;
        hikariConfig0.poolName = "HikariPool-47";
        hikariConfig0.leakDetectionThreshold = (byte) 100;
        java.lang.String str20 = hikariConfig0.jdbcUrl;
        org.junit.Assert.assertNull(dataSource4);
// flaky:         org.junit.Assert.assertTrue("'" + long9 + "' != '" + 32L + "'", long9 == 32L);
        org.junit.Assert.assertNotNull(properties10);
        org.junit.Assert.assertNull(str20);
    }

    @Test
    public void test17071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17071");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        javax.sql.DataSource dataSource1 = hikariConfig0.getDataSource();
        hikariConfig0.setConnectionTestQuery("");
        hikariConfig0.connectionCustomizerClassName = "";
        long long6 = hikariConfig0.getAcquireRetryDelay();
        hikariConfig0.setDataSourceClassName("HikariPool-66");
        boolean boolean9 = hikariConfig0.isIsolateInternalQueries();
        boolean boolean10 = hikariConfig0.isAutoCommit;
        long long11 = hikariConfig0.getIdleTimeout();
        javax.sql.DataSource dataSource12 = hikariConfig0.dataSource;
        boolean boolean13 = hikariConfig0.isAutoCommit;
        hikariConfig0.connectionTestQuery = "HikariPool-189";
        long long16 = hikariConfig0.connectionTimeout;
        hikariConfig0.setLeakDetectionThreshold((long) '4');
        hikariConfig0.setAcquireRetries(35);
        org.junit.Assert.assertNull(dataSource1);
// flaky:         org.junit.Assert.assertTrue("'" + long6 + "' != '" + 100L + "'", long6 == 100L);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
// flaky:         org.junit.Assert.assertTrue("'" + long11 + "' != '" + (-1L) + "'", long11 == (-1L));
        org.junit.Assert.assertNull(dataSource12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
// flaky:         org.junit.Assert.assertTrue("'" + long16 + "' != '" + 32L + "'", long16 == 32L);
    }

    @Test
    public void test17072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17072");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        java.lang.String str1 = hikariConfig0.getConnectionInitSql();
        hikariConfig0.acquireIncrement = 0;
        hikariConfig0.maxLifetime = 100;
        java.lang.String str6 = hikariConfig0.connectionInitSql;
        hikariConfig0.setTransactionIsolation("HikariPool-47");
        hikariConfig0.isRegisterMbeans = true;
        hikariConfig0.isIsolateInternalQueries = true;
        int int13 = hikariConfig0.getTransactionIsolation();
        hikariConfig0.setTransactionIsolation("HikariPool-460");
        javax.sql.DataSource dataSource16 = null;
        hikariConfig0.dataSource = dataSource16;
        hikariConfig0.setConnectionCustomizerClassName("HikariPool-40493");
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
    }

    @Test
    public void test17073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17073");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        hikariConfig0.setMaxLifetime((long) (short) 10);
        com.zaxxer.hikari.HikariConfig hikariConfig3 = new com.zaxxer.hikari.HikariConfig();
        javax.sql.DataSource dataSource4 = hikariConfig3.getDataSource();
        hikariConfig3.setConnectionTestQuery("");
        hikariConfig3.setInitializationFailFast(false);
        long long9 = hikariConfig3.getConnectionTimeout();
        java.util.Properties properties10 = hikariConfig3.dataSourceProperties;
        hikariConfig0.dataSourceProperties = properties10;
        java.lang.String str12 = hikariConfig0.getConnectionTestQuery();
        hikariConfig0.setMaxLifetime((long) (short) 10);
        com.zaxxer.hikari.HikariConfig hikariConfig15 = new com.zaxxer.hikari.HikariConfig();
        hikariConfig15.setMaxLifetime((long) (short) 10);
        hikariConfig15.isReadOnly = true;
        java.util.Properties properties20 = hikariConfig15.dataSourceProperties;
        hikariConfig0.dataSourceProperties = properties20;
        hikariConfig0.maxLifetime = 35;
        long long24 = hikariConfig0.getAcquireRetryDelay();
        hikariConfig0.acquireIncrement = 0;
        org.junit.Assert.assertNull(dataSource4);
// flaky:         org.junit.Assert.assertTrue("'" + long9 + "' != '" + 32L + "'", long9 == 32L);
        org.junit.Assert.assertNotNull(properties10);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNotNull(properties20);
// flaky:         org.junit.Assert.assertTrue("'" + long24 + "' != '" + 100L + "'", long24 == 100L);
    }

    @Test
    public void test17074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17074");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        javax.sql.DataSource dataSource1 = hikariConfig0.getDataSource();
        hikariConfig0.setConnectionTestQuery("");
        hikariConfig0.connectionCustomizerClassName = "";
        hikariConfig0.setConnectionCustomizerClassName("hi!");
        java.lang.String str8 = hikariConfig0.getCatalog();
        com.zaxxer.hikari.IConnectionCustomizer iConnectionCustomizer9 = null;
        hikariConfig0.connectionCustomizer = iConnectionCustomizer9;
        hikariConfig0.connectionTimeout = 100L;
        hikariConfig0.transactionIsolationName = "";
        hikariConfig0.setDataSourceClassName("HikariPool-236");
        hikariConfig0.connectionInitSql = "HikariPool-10523";
        java.util.Properties properties19 = hikariConfig0.getDataSourceProperties();
        org.junit.Assert.assertNull(dataSource1);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNotNull(properties19);
    }

    @Test
    public void test17075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17075");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        javax.sql.DataSource dataSource1 = hikariConfig0.getDataSource();
        hikariConfig0.setConnectionTestQuery("");
        hikariConfig0.setInitializationFailFast(false);
        hikariConfig0.catalog = "";
        int int8 = hikariConfig0.getMaximumPoolSize();
        hikariConfig0.isRegisterMbeans = false;
        long long11 = hikariConfig0.getConnectionTimeout();
        hikariConfig0.jdbcUrl = "HikariPool-516";
        boolean boolean14 = hikariConfig0.isRegisterMbeans;
        java.lang.String str15 = hikariConfig0.connectionInitSql;
        hikariConfig0.setJdbc4ConnectionTest(false);
        hikariConfig0.connectionCustomizerClassName = "HikariPool-18695";
        org.junit.Assert.assertNull(dataSource1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 60 + "'", int8 == 60);
// flaky:         org.junit.Assert.assertTrue("'" + long11 + "' != '" + 32L + "'", long11 == 32L);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNull(str15);
    }

    @Test
    public void test17076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17076");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        javax.sql.DataSource dataSource1 = hikariConfig0.getDataSource();
        hikariConfig0.setConnectionTestQuery("");
        hikariConfig0.setInitializationFailFast(false);
        hikariConfig0.catalog = "";
        int int8 = hikariConfig0.getMaximumPoolSize();
        hikariConfig0.leakDetectionThreshold = (short) 10;
        hikariConfig0.isJdbc4connectionTest = true;
        boolean boolean13 = hikariConfig0.isReadOnly();
        java.lang.String str14 = hikariConfig0.getConnectionInitSql();
        long long15 = hikariConfig0.acquireRetryDelay;
        boolean boolean16 = hikariConfig0.isReadOnly();
        hikariConfig0.transactionIsolation = (byte) 100;
        hikariConfig0.transactionIsolation = (byte) 10;
        long long21 = hikariConfig0.acquireRetryDelay;
        hikariConfig0.setInitializationFailFast(true);
        javax.sql.DataSource dataSource24 = hikariConfig0.dataSource;
        org.junit.Assert.assertNull(dataSource1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 60 + "'", int8 == 60);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNull(str14);
// flaky:         org.junit.Assert.assertTrue("'" + long15 + "' != '" + 100L + "'", long15 == 100L);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
// flaky:         org.junit.Assert.assertTrue("'" + long21 + "' != '" + 100L + "'", long21 == 100L);
        org.junit.Assert.assertNull(dataSource24);
    }

    @Test
    public void test17077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17077");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        int int1 = hikariConfig0.minPoolSize;
        java.lang.String str2 = hikariConfig0.catalog;
        javax.sql.DataSource dataSource3 = hikariConfig0.getDataSource();
        hikariConfig0.minPoolSize = 0;
        boolean boolean6 = hikariConfig0.isReadOnly;
        hikariConfig0.setInitializationFailFast(false);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 10 + "'", int1 == 10);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(dataSource3);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test17078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17078");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        java.lang.String str1 = hikariConfig0.getConnectionInitSql();
        long long2 = hikariConfig0.getLeakDetectionThreshold();
        hikariConfig0.leakDetectionThreshold = (-1);
        long long5 = hikariConfig0.acquireRetryDelay;
        boolean boolean6 = hikariConfig0.isRegisterMbeans;
        hikariConfig0.setConnectionInitSql("");
        long long9 = hikariConfig0.getAcquireRetryDelay();
        boolean boolean10 = hikariConfig0.isJdbc4connectionTest;
        hikariConfig0.setAutoCommit(false);
        javax.sql.DataSource dataSource13 = hikariConfig0.getDataSource();
        hikariConfig0.connectionCustomizerClassName = "HikariPool-577";
        hikariConfig0.setAutoCommit(true);
        java.lang.String str18 = hikariConfig0.connectionCustomizerClassName;
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
// flaky:         org.junit.Assert.assertTrue("'" + long5 + "' != '" + 100L + "'", long5 == 100L);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
// flaky:         org.junit.Assert.assertTrue("'" + long9 + "' != '" + 100L + "'", long9 == 100L);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNull(dataSource13);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "HikariPool-577" + "'", str18, "HikariPool-577");
    }

    @Test
    public void test17079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17079");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        int int1 = hikariConfig0.minPoolSize;
        hikariConfig0.leakDetectionThreshold = 1L;
        hikariConfig0.setJdbcUrl("HikariPool-2443");
        hikariConfig0.maxLifetime = (-1);
        boolean boolean8 = hikariConfig0.isInitializationFailFast;
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 10 + "'", int1 == 10);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test17080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17080");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        java.lang.String str1 = hikariConfig0.getConnectionInitSql();
        long long2 = hikariConfig0.getLeakDetectionThreshold();
        hikariConfig0.leakDetectionThreshold = (-1);
        int int5 = hikariConfig0.acquireIncrement;
        hikariConfig0.setPoolName("HikariPool-62");
        hikariConfig0.acquireRetryDelay = 0L;
        java.lang.String str10 = hikariConfig0.getCatalog();
        javax.sql.DataSource dataSource11 = hikariConfig0.getDataSource();
        int int12 = hikariConfig0.getMinimumPoolSize();
        hikariConfig0.setMinimumPoolSize(60);
        boolean boolean15 = hikariConfig0.isIsolateInternalQueries();
        hikariConfig0.isJdbc4connectionTest = false;
        long long18 = hikariConfig0.getAcquireRetryDelay();
        java.lang.String str19 = hikariConfig0.connectionInitSql;
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(dataSource11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 10 + "'", int12 == 10);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 0L + "'", long18 == 0L);
        org.junit.Assert.assertNull(str19);
    }

    @Test
    public void test17081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17081");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        java.lang.String str1 = hikariConfig0.getConnectionInitSql();
        long long2 = hikariConfig0.getLeakDetectionThreshold();
        int int3 = hikariConfig0.getMaximumPoolSize();
        long long4 = hikariConfig0.getIdleTimeout();
        int int5 = hikariConfig0.maxPoolSize;
        java.lang.String str6 = hikariConfig0.getConnectionCustomizerClassName();
        hikariConfig0.setConnectionCustomizerClassName("HikariPool-127");
        hikariConfig0.isIsolateInternalQueries = true;
        hikariConfig0.setMaximumPoolSize((int) '4');
        hikariConfig0.setInitializationFailFast(false);
        hikariConfig0.setIdleTimeout(1L);
        hikariConfig0.connectionTestQuery = "HikariPool-7424";
        javax.sql.DataSource dataSource19 = null;
        hikariConfig0.setDataSource(dataSource19);
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 60 + "'", int3 == 60);
// flaky:         org.junit.Assert.assertTrue("'" + long4 + "' != '" + (-1L) + "'", long4 == (-1L));
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 60 + "'", int5 == 60);
        org.junit.Assert.assertNull(str6);
    }

    @Test
    public void test17082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17082");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        javax.sql.DataSource dataSource1 = hikariConfig0.getDataSource();
        hikariConfig0.setConnectionTestQuery("");
        hikariConfig0.connectionCustomizerClassName = "";
        hikariConfig0.setConnectionCustomizerClassName("hi!");
        java.lang.String str8 = hikariConfig0.getCatalog();
        boolean boolean9 = hikariConfig0.isRegisterMbeans;
        hikariConfig0.setAcquireRetries(0);
        long long12 = hikariConfig0.getMaxLifetime();
        hikariConfig0.setReadOnly(false);
        com.zaxxer.hikari.HikariConfig hikariConfig15 = new com.zaxxer.hikari.HikariConfig();
        javax.sql.DataSource dataSource16 = hikariConfig15.getDataSource();
        hikariConfig15.setConnectionTestQuery("");
        hikariConfig15.setInitializationFailFast(false);
        hikariConfig15.catalog = "";
        com.zaxxer.hikari.HikariConfig hikariConfig23 = new com.zaxxer.hikari.HikariConfig();
        javax.sql.DataSource dataSource24 = hikariConfig23.getDataSource();
        hikariConfig23.setConnectionTestQuery("");
        hikariConfig23.connectionCustomizerClassName = "";
        hikariConfig23.setConnectionCustomizerClassName("hi!");
        java.lang.String str31 = hikariConfig23.getCatalog();
        java.util.Properties properties32 = hikariConfig23.dataSourceProperties;
        hikariConfig15.dataSourceProperties = properties32;
        hikariConfig0.setDataSourceProperties(properties32);
        com.zaxxer.hikari.IConnectionCustomizer iConnectionCustomizer35 = null;
        hikariConfig0.connectionCustomizer = iConnectionCustomizer35;
        long long37 = hikariConfig0.getIdleTimeout();
        hikariConfig0.minPoolSize = 0;
        hikariConfig0.isReadOnly = true;
        java.lang.String str42 = hikariConfig0.connectionCustomizerClassName;
        hikariConfig0.setPoolName("HikariPool-1004");
        java.lang.String str45 = hikariConfig0.dataSourceClassName;
        org.junit.Assert.assertNull(dataSource1);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
// flaky:         org.junit.Assert.assertTrue("'" + long12 + "' != '" + 32L + "'", long12 == 32L);
        org.junit.Assert.assertNull(dataSource16);
        org.junit.Assert.assertNull(dataSource24);
        org.junit.Assert.assertNull(str31);
        org.junit.Assert.assertNotNull(properties32);
// flaky:         org.junit.Assert.assertTrue("'" + long37 + "' != '" + (-1L) + "'", long37 == (-1L));
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "hi!" + "'", str42, "hi!");
        org.junit.Assert.assertNull(str45);
    }

    @Test
    public void test17083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17083");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        javax.sql.DataSource dataSource1 = hikariConfig0.getDataSource();
        hikariConfig0.setConnectionTestQuery("");
        hikariConfig0.connectionCustomizerClassName = "";
        hikariConfig0.setConnectionCustomizerClassName("hi!");
        java.lang.String str8 = hikariConfig0.getCatalog();
        boolean boolean9 = hikariConfig0.isRegisterMbeans;
        hikariConfig0.setAcquireRetries(0);
        long long12 = hikariConfig0.getMaxLifetime();
        hikariConfig0.setReadOnly(false);
        com.zaxxer.hikari.HikariConfig hikariConfig15 = new com.zaxxer.hikari.HikariConfig();
        javax.sql.DataSource dataSource16 = hikariConfig15.getDataSource();
        hikariConfig15.setConnectionTestQuery("");
        hikariConfig15.setInitializationFailFast(false);
        hikariConfig15.catalog = "";
        com.zaxxer.hikari.HikariConfig hikariConfig23 = new com.zaxxer.hikari.HikariConfig();
        javax.sql.DataSource dataSource24 = hikariConfig23.getDataSource();
        hikariConfig23.setConnectionTestQuery("");
        hikariConfig23.connectionCustomizerClassName = "";
        hikariConfig23.setConnectionCustomizerClassName("hi!");
        java.lang.String str31 = hikariConfig23.getCatalog();
        java.util.Properties properties32 = hikariConfig23.dataSourceProperties;
        hikariConfig15.dataSourceProperties = properties32;
        hikariConfig0.setDataSourceProperties(properties32);
        com.zaxxer.hikari.IConnectionCustomizer iConnectionCustomizer35 = null;
        hikariConfig0.connectionCustomizer = iConnectionCustomizer35;
        long long37 = hikariConfig0.getIdleTimeout();
        hikariConfig0.setIdleTimeout(32L);
        hikariConfig0.maxLifetime = 'a';
        hikariConfig0.jdbcUrl = "HikariPool-179";
        int int44 = hikariConfig0.getMinimumPoolSize();
        hikariConfig0.setCatalog("HikariPool-1837");
        int int47 = hikariConfig0.getMinimumPoolSize();
        int int48 = hikariConfig0.getMaximumPoolSize();
        hikariConfig0.setDataSourceClassName("HikariPool-37659");
        org.junit.Assert.assertNull(dataSource1);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
// flaky:         org.junit.Assert.assertTrue("'" + long12 + "' != '" + 32L + "'", long12 == 32L);
        org.junit.Assert.assertNull(dataSource16);
        org.junit.Assert.assertNull(dataSource24);
        org.junit.Assert.assertNull(str31);
        org.junit.Assert.assertNotNull(properties32);
// flaky:         org.junit.Assert.assertTrue("'" + long37 + "' != '" + (-1L) + "'", long37 == (-1L));
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + 10 + "'", int44 == 10);
        org.junit.Assert.assertTrue("'" + int47 + "' != '" + 10 + "'", int47 == 10);
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + 60 + "'", int48 == 60);
    }

    @Test
    public void test17084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17084");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        java.lang.String str1 = hikariConfig0.getConnectionInitSql();
        long long2 = hikariConfig0.getLeakDetectionThreshold();
        hikariConfig0.leakDetectionThreshold = (-1);
        long long5 = hikariConfig0.acquireRetryDelay;
        long long6 = hikariConfig0.getIdleTimeout();
        int int7 = hikariConfig0.maxPoolSize;
        long long8 = hikariConfig0.getIdleTimeout();
        java.util.Properties properties9 = hikariConfig0.dataSourceProperties;
        hikariConfig0.isReadOnly = true;
        hikariConfig0.acquireIncrement = (-1);
        boolean boolean14 = hikariConfig0.isAutoCommit();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
// flaky:         org.junit.Assert.assertTrue("'" + long5 + "' != '" + 100L + "'", long5 == 100L);
// flaky:         org.junit.Assert.assertTrue("'" + long6 + "' != '" + (-1L) + "'", long6 == (-1L));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 60 + "'", int7 == 60);
// flaky:         org.junit.Assert.assertTrue("'" + long8 + "' != '" + (-1L) + "'", long8 == (-1L));
        org.junit.Assert.assertNotNull(properties9);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
    }

    @Test
    public void test17085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17085");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        javax.sql.DataSource dataSource1 = hikariConfig0.getDataSource();
        hikariConfig0.idleTimeout = 3;
        int int4 = hikariConfig0.getAcquireRetries();
        hikariConfig0.setDataSourceClassName("HikariPool-174");
        long long7 = hikariConfig0.getLeakDetectionThreshold();
        org.junit.Assert.assertNull(dataSource1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 3 + "'", int4 == 3);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
    }

    @Test
    public void test17086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17086");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        java.lang.String str1 = hikariConfig0.getConnectionInitSql();
        long long2 = hikariConfig0.getLeakDetectionThreshold();
        hikariConfig0.leakDetectionThreshold = (-1);
        long long5 = hikariConfig0.acquireRetryDelay;
        boolean boolean6 = hikariConfig0.isRegisterMbeans;
        hikariConfig0.setConnectionInitSql("");
        hikariConfig0.connectionTimeout = 0L;
        java.lang.String str11 = hikariConfig0.connectionInitSql;
        int int12 = hikariConfig0.getTransactionIsolation();
        hikariConfig0.setPoolName("HikariPool-29");
        java.lang.String str15 = hikariConfig0.transactionIsolationName;
        java.lang.String str16 = hikariConfig0.connectionCustomizerClassName;
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
// flaky:         org.junit.Assert.assertTrue("'" + long5 + "' != '" + 100L + "'", long5 == 100L);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertNull(str16);
    }

    @Test
    public void test17087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17087");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        javax.sql.DataSource dataSource1 = hikariConfig0.getDataSource();
        hikariConfig0.setConnectionTestQuery("");
        hikariConfig0.setInitializationFailFast(false);
        long long6 = hikariConfig0.getConnectionTimeout();
        hikariConfig0.setJdbcUrl("HikariPool-47");
        hikariConfig0.isIsolateInternalQueries = false;
        hikariConfig0.setIsolateInternalQueries(true);
        hikariConfig0.setPoolName("HikariPool-127");
        hikariConfig0.setPoolName("HikariPool-135");
        hikariConfig0.acquireIncrement = 0;
        boolean boolean19 = hikariConfig0.isIsolateInternalQueries();
        com.zaxxer.hikari.IConnectionCustomizer iConnectionCustomizer20 = hikariConfig0.connectionCustomizer;
        java.lang.String str21 = hikariConfig0.catalog;
        com.zaxxer.hikari.IConnectionCustomizer iConnectionCustomizer22 = hikariConfig0.connectionCustomizer;
        hikariConfig0.setMaxLifetime(0L);
        org.junit.Assert.assertNull(dataSource1);
// flaky:         org.junit.Assert.assertTrue("'" + long6 + "' != '" + 32L + "'", long6 == 32L);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertNull(iConnectionCustomizer20);
        org.junit.Assert.assertNull(str21);
        org.junit.Assert.assertNull(iConnectionCustomizer22);
    }

    @Test
    public void test17088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17088");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        java.lang.String str1 = hikariConfig0.getConnectionInitSql();
        hikariConfig0.setMaxLifetime(35L);
        hikariConfig0.setAutoCommit(false);
        hikariConfig0.transactionIsolationName = "hi!";
        hikariConfig0.setInitializationFailFast(false);
        hikariConfig0.leakDetectionThreshold = 97L;
        long long12 = hikariConfig0.leakDetectionThreshold;
        int int13 = hikariConfig0.minPoolSize;
        javax.sql.DataSource dataSource14 = null;
        hikariConfig0.dataSource = dataSource14;
        boolean boolean16 = hikariConfig0.isJdbc4ConnectionTest();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 97L + "'", long12 == 97L);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 10 + "'", int13 == 10);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
    }

    @Test
    public void test17089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17089");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        javax.sql.DataSource dataSource1 = hikariConfig0.getDataSource();
        hikariConfig0.setConnectionTestQuery("");
        hikariConfig0.setInitializationFailFast(false);
        hikariConfig0.poolName = "";
        int int8 = hikariConfig0.getTransactionIsolation();
        hikariConfig0.setCatalog("HikariPool-93");
        boolean boolean11 = hikariConfig0.isAutoCommit;
        hikariConfig0.setAcquireRetries((int) '#');
        hikariConfig0.setJdbc4ConnectionTest(true);
        hikariConfig0.setInitializationFailFast(false);
        hikariConfig0.setIdleTimeout(10L);
        int int20 = hikariConfig0.transactionIsolation;
        int int21 = hikariConfig0.transactionIsolation;
        org.junit.Assert.assertNull(dataSource1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1) + "'", int21 == (-1));
    }

    @Test
    public void test17090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17090");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        javax.sql.DataSource dataSource1 = hikariConfig0.getDataSource();
        hikariConfig0.setConnectionTestQuery("");
        hikariConfig0.connectionCustomizerClassName = "";
        hikariConfig0.setConnectionCustomizerClassName("hi!");
        java.lang.String str8 = hikariConfig0.getCatalog();
        java.util.Properties properties9 = hikariConfig0.dataSourceProperties;
        com.zaxxer.hikari.HikariConfig hikariConfig11 = new com.zaxxer.hikari.HikariConfig();
        java.lang.String str12 = hikariConfig11.getConnectionInitSql();
        long long13 = hikariConfig11.getLeakDetectionThreshold();
        hikariConfig11.leakDetectionThreshold = (-1);
        long long16 = hikariConfig11.acquireRetryDelay;
        boolean boolean17 = hikariConfig11.isRegisterMbeans;
        hikariConfig0.addDataSourceProperty("HikariPool-47", (java.lang.Object) boolean17);
        int int19 = hikariConfig0.acquireRetries;
        hikariConfig0.setIdleTimeout((long) 60);
        hikariConfig0.setReadOnly(false);
        hikariConfig0.setRegisterMbeans(false);
        hikariConfig0.setJdbcUrl("HikariPool-9552");
        org.junit.Assert.assertNull(dataSource1);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNotNull(properties9);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 0L + "'", long13 == 0L);
// flaky:         org.junit.Assert.assertTrue("'" + long16 + "' != '" + 100L + "'", long16 == 100L);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 3 + "'", int19 == 3);
    }

    @Test
    public void test17091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17091");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        java.lang.String str1 = hikariConfig0.getConnectionInitSql();
        long long2 = hikariConfig0.getLeakDetectionThreshold();
        hikariConfig0.leakDetectionThreshold = (-1);
        long long5 = hikariConfig0.acquireRetryDelay;
        com.zaxxer.hikari.HikariConfig hikariConfig7 = new com.zaxxer.hikari.HikariConfig();
        javax.sql.DataSource dataSource8 = hikariConfig7.getDataSource();
        hikariConfig7.setConnectionTestQuery("");
        hikariConfig7.connectionCustomizerClassName = "";
        hikariConfig7.setConnectionCustomizerClassName("hi!");
        java.lang.String str15 = hikariConfig7.getCatalog();
        boolean boolean16 = hikariConfig7.isRegisterMbeans;
        long long17 = hikariConfig7.connectionTimeout;
        hikariConfig7.setConnectionInitSql("HikariPool-48");
        hikariConfig0.addDataSourceProperty("hi!", (java.lang.Object) hikariConfig7);
        hikariConfig0.setConnectionCustomizerClassName("hi!");
        boolean boolean23 = hikariConfig0.isJdbc4connectionTest;
        long long24 = hikariConfig0.getConnectionTimeout();
        hikariConfig0.poolName = "HikariPool-182";
        javax.sql.DataSource dataSource27 = hikariConfig0.getDataSource();
        int int28 = hikariConfig0.acquireRetries;
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
// flaky:         org.junit.Assert.assertTrue("'" + long5 + "' != '" + 100L + "'", long5 == 100L);
        org.junit.Assert.assertNull(dataSource8);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
// flaky:         org.junit.Assert.assertTrue("'" + long17 + "' != '" + 32L + "'", long17 == 32L);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
// flaky:         org.junit.Assert.assertTrue("'" + long24 + "' != '" + 32L + "'", long24 == 32L);
        org.junit.Assert.assertNull(dataSource27);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 3 + "'", int28 == 3);
    }

    @Test
    public void test17092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17092");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        java.lang.String str1 = hikariConfig0.getConnectionInitSql();
        long long2 = hikariConfig0.getLeakDetectionThreshold();
        hikariConfig0.leakDetectionThreshold = (-1);
        int int5 = hikariConfig0.acquireIncrement;
        hikariConfig0.setPoolName("HikariPool-62");
        hikariConfig0.acquireRetryDelay = 0L;
        java.lang.String str10 = hikariConfig0.getCatalog();
        javax.sql.DataSource dataSource11 = hikariConfig0.getDataSource();
        int int12 = hikariConfig0.getMinimumPoolSize();
        hikariConfig0.setMinimumPoolSize(60);
        boolean boolean15 = hikariConfig0.isIsolateInternalQueries();
        long long16 = hikariConfig0.idleTimeout;
        int int17 = hikariConfig0.acquireRetries;
        hikariConfig0.acquireIncrement = 1;
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(dataSource11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 10 + "'", int12 == 10);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
// flaky:         org.junit.Assert.assertTrue("'" + long16 + "' != '" + (-1L) + "'", long16 == (-1L));
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 3 + "'", int17 == 3);
    }

    @Test
    public void test17093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17093");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        javax.sql.DataSource dataSource1 = hikariConfig0.getDataSource();
        hikariConfig0.setConnectionTestQuery("");
        hikariConfig0.connectionCustomizerClassName = "";
        hikariConfig0.setConnectionCustomizerClassName("hi!");
        java.lang.String str8 = hikariConfig0.getCatalog();
        boolean boolean9 = hikariConfig0.isRegisterMbeans;
        com.zaxxer.hikari.HikariConfig hikariConfig11 = new com.zaxxer.hikari.HikariConfig();
        javax.sql.DataSource dataSource12 = hikariConfig11.getDataSource();
        hikariConfig11.setConnectionTestQuery("");
        hikariConfig11.connectionCustomizerClassName = "";
        hikariConfig11.setConnectionCustomizerClassName("hi!");
        java.lang.String str19 = hikariConfig11.getCatalog();
        boolean boolean20 = hikariConfig11.isRegisterMbeans;
        hikariConfig11.setAcquireRetries(0);
        hikariConfig11.setMaximumPoolSize((int) '#');
        hikariConfig0.addDataSourceProperty("HikariPool-47", (java.lang.Object) '#');
        hikariConfig0.setConnectionTestQuery("HikariPool-47");
        java.lang.String str28 = hikariConfig0.connectionInitSql;
        hikariConfig0.transactionIsolation = (short) 100;
        hikariConfig0.maxPoolSize = (-1);
        com.zaxxer.hikari.HikariConfig hikariConfig33 = new com.zaxxer.hikari.HikariConfig();
        javax.sql.DataSource dataSource34 = hikariConfig33.getDataSource();
        hikariConfig33.setConnectionTestQuery("");
        com.zaxxer.hikari.HikariConfig hikariConfig37 = new com.zaxxer.hikari.HikariConfig();
        javax.sql.DataSource dataSource38 = hikariConfig37.getDataSource();
        hikariConfig37.setConnectionTestQuery("");
        hikariConfig37.setInitializationFailFast(false);
        long long43 = hikariConfig37.getConnectionTimeout();
        java.util.Properties properties44 = hikariConfig37.dataSourceProperties;
        hikariConfig33.setDataSourceProperties(properties44);
        hikariConfig0.dataSourceProperties = properties44;
        long long47 = hikariConfig0.getIdleTimeout();
        int int48 = hikariConfig0.minPoolSize;
        org.junit.Assert.assertNull(dataSource1);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(dataSource12);
        org.junit.Assert.assertNull(str19);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNull(str28);
        org.junit.Assert.assertNull(dataSource34);
        org.junit.Assert.assertNull(dataSource38);
// flaky:         org.junit.Assert.assertTrue("'" + long43 + "' != '" + 32L + "'", long43 == 32L);
        org.junit.Assert.assertNotNull(properties44);
// flaky:         org.junit.Assert.assertTrue("'" + long47 + "' != '" + (-1L) + "'", long47 == (-1L));
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + 10 + "'", int48 == 10);
    }

    @Test
    public void test17094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17094");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        java.lang.String str1 = hikariConfig0.getConnectionInitSql();
        long long2 = hikariConfig0.getLeakDetectionThreshold();
        hikariConfig0.leakDetectionThreshold = (-1);
        long long5 = hikariConfig0.acquireRetryDelay;
        com.zaxxer.hikari.HikariConfig hikariConfig7 = new com.zaxxer.hikari.HikariConfig();
        javax.sql.DataSource dataSource8 = hikariConfig7.getDataSource();
        hikariConfig7.setConnectionTestQuery("");
        hikariConfig7.connectionCustomizerClassName = "";
        hikariConfig7.setConnectionCustomizerClassName("hi!");
        java.lang.String str15 = hikariConfig7.getCatalog();
        boolean boolean16 = hikariConfig7.isRegisterMbeans;
        long long17 = hikariConfig7.connectionTimeout;
        hikariConfig7.setConnectionInitSql("HikariPool-48");
        hikariConfig0.addDataSourceProperty("hi!", (java.lang.Object) hikariConfig7);
        hikariConfig0.setUseInstrumentation(false);
        int int23 = hikariConfig0.maxPoolSize;
        int int24 = hikariConfig0.getTransactionIsolation();
        java.lang.String str25 = hikariConfig0.getCatalog();
        hikariConfig0.idleTimeout = (-1);
        hikariConfig0.setJdbc4ConnectionTest(false);
        hikariConfig0.minPoolSize = (short) 0;
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
// flaky:         org.junit.Assert.assertTrue("'" + long5 + "' != '" + 100L + "'", long5 == 100L);
        org.junit.Assert.assertNull(dataSource8);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
// flaky:         org.junit.Assert.assertTrue("'" + long17 + "' != '" + 32L + "'", long17 == 32L);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 60 + "'", int23 == 60);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-1) + "'", int24 == (-1));
        org.junit.Assert.assertNull(str25);
    }

    @Test
    public void test17095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17095");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        javax.sql.DataSource dataSource1 = hikariConfig0.getDataSource();
        hikariConfig0.setConnectionTestQuery("");
        hikariConfig0.connectionCustomizerClassName = "";
        hikariConfig0.setConnectionCustomizerClassName("hi!");
        java.lang.String str8 = hikariConfig0.getCatalog();
        java.util.Properties properties9 = hikariConfig0.dataSourceProperties;
        com.zaxxer.hikari.HikariConfig hikariConfig11 = new com.zaxxer.hikari.HikariConfig();
        java.lang.String str12 = hikariConfig11.getConnectionInitSql();
        long long13 = hikariConfig11.getLeakDetectionThreshold();
        hikariConfig11.leakDetectionThreshold = (-1);
        long long16 = hikariConfig11.acquireRetryDelay;
        boolean boolean17 = hikariConfig11.isRegisterMbeans;
        hikariConfig0.addDataSourceProperty("HikariPool-47", (java.lang.Object) boolean17);
        java.util.Properties properties19 = hikariConfig0.getDataSourceProperties();
        hikariConfig0.transactionIsolationName = "HikariPool-18";
        java.util.Properties properties22 = hikariConfig0.getDataSourceProperties();
        javax.sql.DataSource dataSource23 = hikariConfig0.getDataSource();
        long long24 = hikariConfig0.acquireRetryDelay;
        com.zaxxer.hikari.HikariConfig hikariConfig25 = new com.zaxxer.hikari.HikariConfig();
        int int26 = hikariConfig25.getTransactionIsolation();
        long long27 = hikariConfig25.leakDetectionThreshold;
        hikariConfig25.maxLifetime = 35L;
        java.util.Properties properties30 = hikariConfig25.dataSourceProperties;
        hikariConfig0.setDataSourceProperties(properties30);
        org.junit.Assert.assertNull(dataSource1);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNotNull(properties9);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 0L + "'", long13 == 0L);
// flaky:         org.junit.Assert.assertTrue("'" + long16 + "' != '" + 100L + "'", long16 == 100L);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(properties19);
        org.junit.Assert.assertNotNull(properties22);
        org.junit.Assert.assertNull(dataSource23);
// flaky:         org.junit.Assert.assertTrue("'" + long24 + "' != '" + 100L + "'", long24 == 100L);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + (-1) + "'", int26 == (-1));
        org.junit.Assert.assertTrue("'" + long27 + "' != '" + 0L + "'", long27 == 0L);
        org.junit.Assert.assertNotNull(properties30);
    }

    @Test
    public void test17096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17096");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        hikariConfig0.setMaxLifetime((long) (short) 10);
        com.zaxxer.hikari.HikariConfig hikariConfig3 = new com.zaxxer.hikari.HikariConfig();
        javax.sql.DataSource dataSource4 = hikariConfig3.getDataSource();
        hikariConfig3.setConnectionTestQuery("");
        hikariConfig3.setInitializationFailFast(false);
        long long9 = hikariConfig3.getConnectionTimeout();
        java.util.Properties properties10 = hikariConfig3.dataSourceProperties;
        hikariConfig0.dataSourceProperties = properties10;
        int int12 = hikariConfig0.getAcquireIncrement();
        long long13 = hikariConfig0.getLeakDetectionThreshold();
        hikariConfig0.maxLifetime = 35;
        int int16 = hikariConfig0.acquireRetries;
        java.lang.String str17 = hikariConfig0.getPoolName();
        hikariConfig0.acquireRetries = '#';
        org.junit.Assert.assertNull(dataSource4);
// flaky:         org.junit.Assert.assertTrue("'" + long9 + "' != '" + 32L + "'", long9 == 32L);
        org.junit.Assert.assertNotNull(properties10);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 0L + "'", long13 == 0L);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 3 + "'", int16 == 3);
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "HikariPool-42137" + "'", str17, "HikariPool-42137");
    }

    @Test
    public void test17097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17097");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        java.lang.String str1 = hikariConfig0.getConnectionInitSql();
        long long2 = hikariConfig0.getLeakDetectionThreshold();
        int int3 = hikariConfig0.getMaximumPoolSize();
        java.lang.String str4 = hikariConfig0.connectionCustomizerClassName;
        hikariConfig0.minPoolSize = (byte) 100;
        boolean boolean7 = hikariConfig0.isAutoCommit;
        hikariConfig0.setIsolateInternalQueries(false);
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 60 + "'", int3 == 60);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }

    @Test
    public void test17098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17098");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        javax.sql.DataSource dataSource1 = hikariConfig0.getDataSource();
        hikariConfig0.setConnectionTestQuery("");
        hikariConfig0.connectionCustomizerClassName = "";
        hikariConfig0.setConnectionCustomizerClassName("hi!");
        java.lang.String str8 = hikariConfig0.getCatalog();
        boolean boolean9 = hikariConfig0.isRegisterMbeans;
        com.zaxxer.hikari.HikariConfig hikariConfig11 = new com.zaxxer.hikari.HikariConfig();
        javax.sql.DataSource dataSource12 = hikariConfig11.getDataSource();
        hikariConfig11.setConnectionTestQuery("");
        hikariConfig11.connectionCustomizerClassName = "";
        hikariConfig11.setConnectionCustomizerClassName("hi!");
        java.lang.String str19 = hikariConfig11.getCatalog();
        boolean boolean20 = hikariConfig11.isRegisterMbeans;
        hikariConfig11.setAcquireRetries(0);
        hikariConfig11.setMaximumPoolSize((int) '#');
        hikariConfig0.addDataSourceProperty("HikariPool-47", (java.lang.Object) '#');
        hikariConfig0.setConnectionTestQuery("HikariPool-47");
        java.lang.String str28 = hikariConfig0.connectionInitSql;
        hikariConfig0.transactionIsolation = (short) 100;
        hikariConfig0.connectionCustomizerClassName = "HikariPool-182";
        boolean boolean33 = hikariConfig0.isAutoCommit();
        hikariConfig0.setAcquireIncrement((int) (short) 10);
        hikariConfig0.isRegisterMbeans = true;
        org.junit.Assert.assertNull(dataSource1);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(dataSource12);
        org.junit.Assert.assertNull(str19);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNull(str28);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + true + "'", boolean33 == true);
    }

    @Test
    public void test17099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17099");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        java.lang.String str1 = hikariConfig0.getConnectionInitSql();
        long long2 = hikariConfig0.getLeakDetectionThreshold();
        hikariConfig0.leakDetectionThreshold = (-1);
        long long5 = hikariConfig0.acquireRetryDelay;
        long long6 = hikariConfig0.getIdleTimeout();
        int int7 = hikariConfig0.maxPoolSize;
        java.lang.String str8 = hikariConfig0.poolName;
        hikariConfig0.leakDetectionThreshold = ' ';
        hikariConfig0.setConnectionTimeout(0L);
        hikariConfig0.isIsolateInternalQueries = false;
        hikariConfig0.setRegisterMbeans(false);
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
// flaky:         org.junit.Assert.assertTrue("'" + long5 + "' != '" + 100L + "'", long5 == 100L);
// flaky:         org.junit.Assert.assertTrue("'" + long6 + "' != '" + (-1L) + "'", long6 == (-1L));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 60 + "'", int7 == 60);
// flaky:         org.junit.Assert.assertEquals("'" + str8 + "' != '" + "HikariPool-42143" + "'", str8, "HikariPool-42143");
    }

    @Test
    public void test17100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17100");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        javax.sql.DataSource dataSource1 = hikariConfig0.getDataSource();
        hikariConfig0.setConnectionTestQuery("");
        hikariConfig0.setInitializationFailFast(false);
        long long6 = hikariConfig0.getConnectionTimeout();
        hikariConfig0.setJdbcUrl("HikariPool-47");
        hikariConfig0.isIsolateInternalQueries = false;
        hikariConfig0.setIsolateInternalQueries(true);
        hikariConfig0.setPoolName("HikariPool-127");
        hikariConfig0.setPoolName("HikariPool-135");
        java.lang.Class<?> wildcardClass17 = hikariConfig0.getClass();
        org.junit.Assert.assertNull(dataSource1);
// flaky:         org.junit.Assert.assertTrue("'" + long6 + "' != '" + 32L + "'", long6 == 32L);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test17101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17101");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        javax.sql.DataSource dataSource1 = hikariConfig0.getDataSource();
        hikariConfig0.setConnectionTestQuery("");
        hikariConfig0.setInitializationFailFast(false);
        hikariConfig0.catalog = "";
        int int8 = hikariConfig0.getMaximumPoolSize();
        hikariConfig0.leakDetectionThreshold = (short) 10;
        hikariConfig0.isJdbc4connectionTest = true;
        boolean boolean13 = hikariConfig0.isReadOnly();
        java.lang.String str14 = hikariConfig0.getConnectionInitSql();
        java.lang.String str15 = hikariConfig0.poolName;
        java.lang.String str16 = hikariConfig0.getPoolName();
        hikariConfig0.isIsolateInternalQueries = false;
        org.junit.Assert.assertNull(dataSource1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 60 + "'", int8 == 60);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNull(str14);
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "HikariPool-42145" + "'", str15, "HikariPool-42145");
// flaky:         org.junit.Assert.assertEquals("'" + str16 + "' != '" + "HikariPool-42145" + "'", str16, "HikariPool-42145");
    }

    @Test
    public void test17102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17102");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        javax.sql.DataSource dataSource1 = hikariConfig0.getDataSource();
        hikariConfig0.setConnectionTestQuery("");
        hikariConfig0.connectionCustomizerClassName = "";
        hikariConfig0.setConnectionCustomizerClassName("hi!");
        java.lang.String str8 = hikariConfig0.getCatalog();
        boolean boolean9 = hikariConfig0.isRegisterMbeans;
        hikariConfig0.setAcquireRetries(0);
        long long12 = hikariConfig0.getMaxLifetime();
        hikariConfig0.setReadOnly(false);
        com.zaxxer.hikari.HikariConfig hikariConfig15 = new com.zaxxer.hikari.HikariConfig();
        javax.sql.DataSource dataSource16 = hikariConfig15.getDataSource();
        hikariConfig15.setConnectionTestQuery("");
        hikariConfig15.setInitializationFailFast(false);
        hikariConfig15.catalog = "";
        com.zaxxer.hikari.HikariConfig hikariConfig23 = new com.zaxxer.hikari.HikariConfig();
        javax.sql.DataSource dataSource24 = hikariConfig23.getDataSource();
        hikariConfig23.setConnectionTestQuery("");
        hikariConfig23.connectionCustomizerClassName = "";
        hikariConfig23.setConnectionCustomizerClassName("hi!");
        java.lang.String str31 = hikariConfig23.getCatalog();
        java.util.Properties properties32 = hikariConfig23.dataSourceProperties;
        hikariConfig15.dataSourceProperties = properties32;
        hikariConfig0.setDataSourceProperties(properties32);
        com.zaxxer.hikari.IConnectionCustomizer iConnectionCustomizer35 = null;
        hikariConfig0.connectionCustomizer = iConnectionCustomizer35;
        long long37 = hikariConfig0.getIdleTimeout();
        hikariConfig0.setIdleTimeout(32L);
        hikariConfig0.jdbcUrl = "HikariPool-102";
        hikariConfig0.dataSourceClassName = "HikariPool-1030";
        long long44 = hikariConfig0.connectionTimeout;
        java.util.Properties properties45 = hikariConfig0.getDataSourceProperties();
        hikariConfig0.catalog = "HikariPool-18910";
        org.junit.Assert.assertNull(dataSource1);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
// flaky:         org.junit.Assert.assertTrue("'" + long12 + "' != '" + 32L + "'", long12 == 32L);
        org.junit.Assert.assertNull(dataSource16);
        org.junit.Assert.assertNull(dataSource24);
        org.junit.Assert.assertNull(str31);
        org.junit.Assert.assertNotNull(properties32);
// flaky:         org.junit.Assert.assertTrue("'" + long37 + "' != '" + (-1L) + "'", long37 == (-1L));
// flaky:         org.junit.Assert.assertTrue("'" + long44 + "' != '" + 32L + "'", long44 == 32L);
        org.junit.Assert.assertNotNull(properties45);
    }

    @Test
    public void test17103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17103");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        javax.sql.DataSource dataSource1 = hikariConfig0.getDataSource();
        hikariConfig0.setConnectionTestQuery("");
        hikariConfig0.connectionCustomizerClassName = "";
        hikariConfig0.setConnectionCustomizerClassName("hi!");
        java.lang.String str8 = hikariConfig0.getCatalog();
        com.zaxxer.hikari.IConnectionCustomizer iConnectionCustomizer9 = null;
        hikariConfig0.connectionCustomizer = iConnectionCustomizer9;
        hikariConfig0.connectionTimeout = 100L;
        java.lang.String str13 = hikariConfig0.connectionInitSql;
        hikariConfig0.setAcquireRetryDelay((long) 3);
        int int16 = hikariConfig0.getAcquireRetries();
        java.lang.String str17 = hikariConfig0.connectionCustomizerClassName;
        java.lang.String str18 = hikariConfig0.connectionTestQuery;
        javax.sql.DataSource dataSource19 = hikariConfig0.dataSource;
        hikariConfig0.connectionTestQuery = "HikariPool-22836";
        int int22 = hikariConfig0.maxPoolSize;
        org.junit.Assert.assertNull(dataSource1);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 3 + "'", int16 == 3);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertNull(dataSource19);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 60 + "'", int22 == 60);
    }

    @Test
    public void test17104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17104");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        javax.sql.DataSource dataSource1 = hikariConfig0.getDataSource();
        hikariConfig0.setConnectionTestQuery("");
        hikariConfig0.setInitializationFailFast(false);
        hikariConfig0.jdbcUrl = "HikariPool-16";
        hikariConfig0.setAutoCommit(true);
        org.junit.Assert.assertNull(dataSource1);
    }

    @Test
    public void test17105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17105");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        javax.sql.DataSource dataSource1 = hikariConfig0.getDataSource();
        hikariConfig0.setConnectionTestQuery("");
        hikariConfig0.setInitializationFailFast(false);
        java.lang.String str6 = hikariConfig0.getConnectionInitSql();
        hikariConfig0.setReadOnly(true);
        javax.sql.DataSource dataSource9 = null;
        hikariConfig0.setDataSource(dataSource9);
        hikariConfig0.acquireRetryDelay = 'a';
        java.lang.String str13 = hikariConfig0.getJdbcUrl();
        hikariConfig0.setInitializationFailFast(false);
        hikariConfig0.isJdbc4connectionTest = true;
        boolean boolean18 = hikariConfig0.isReadOnly;
        org.junit.Assert.assertNull(dataSource1);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
    }

    @Test
    public void test17106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17106");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        hikariConfig0.setMaxLifetime((long) (short) 10);
        com.zaxxer.hikari.HikariConfig hikariConfig3 = new com.zaxxer.hikari.HikariConfig();
        javax.sql.DataSource dataSource4 = hikariConfig3.getDataSource();
        hikariConfig3.setConnectionTestQuery("");
        hikariConfig3.setInitializationFailFast(false);
        long long9 = hikariConfig3.getConnectionTimeout();
        java.util.Properties properties10 = hikariConfig3.dataSourceProperties;
        hikariConfig0.dataSourceProperties = properties10;
        hikariConfig0.maxLifetime = 750L;
        hikariConfig0.setConnectionTestQuery("HikariPool-3359");
        hikariConfig0.setAcquireRetries(1);
        int int18 = hikariConfig0.maxPoolSize;
        org.junit.Assert.assertNull(dataSource4);
// flaky:         org.junit.Assert.assertTrue("'" + long9 + "' != '" + 32L + "'", long9 == 32L);
        org.junit.Assert.assertNotNull(properties10);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 60 + "'", int18 == 60);
    }

    @Test
    public void test17107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17107");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        javax.sql.DataSource dataSource1 = hikariConfig0.getDataSource();
        hikariConfig0.setConnectionTestQuery("");
        hikariConfig0.setInitializationFailFast(false);
        hikariConfig0.catalog = "";
        int int8 = hikariConfig0.getMaximumPoolSize();
        hikariConfig0.connectionTimeout = 10L;
        hikariConfig0.setJdbcUrl("HikariPool-47");
        hikariConfig0.setTransactionIsolation("HikariPool-73");
        hikariConfig0.setPoolName("HikariPool-417");
        hikariConfig0.acquireIncrement = 100;
        int int19 = hikariConfig0.minPoolSize;
        hikariConfig0.idleTimeout = ' ';
        hikariConfig0.connectionInitSql = "HikariPool-84";
        hikariConfig0.connectionTimeout = (byte) -1;
        hikariConfig0.jdbcUrl = "HikariPool-2830";
        int int28 = hikariConfig0.acquireIncrement;
        hikariConfig0.poolName = "HikariPool-4932";
        long long31 = hikariConfig0.getAcquireRetryDelay();
        org.junit.Assert.assertNull(dataSource1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 60 + "'", int8 == 60);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 10 + "'", int19 == 10);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 100 + "'", int28 == 100);
// flaky:         org.junit.Assert.assertTrue("'" + long31 + "' != '" + 100L + "'", long31 == 100L);
    }

    @Test
    public void test17108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17108");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        javax.sql.DataSource dataSource1 = hikariConfig0.getDataSource();
        hikariConfig0.setConnectionTestQuery("");
        hikariConfig0.setInitializationFailFast(false);
        hikariConfig0.catalog = "";
        int int8 = hikariConfig0.getMaximumPoolSize();
        hikariConfig0.leakDetectionThreshold = (short) 10;
        hikariConfig0.isJdbc4connectionTest = true;
        boolean boolean13 = hikariConfig0.isReadOnly();
        java.lang.String str14 = hikariConfig0.getConnectionInitSql();
        long long15 = hikariConfig0.acquireRetryDelay;
        hikariConfig0.setUseInstrumentation(true);
        com.zaxxer.hikari.IConnectionCustomizer iConnectionCustomizer18 = hikariConfig0.connectionCustomizer;
        com.zaxxer.hikari.HikariConfig hikariConfig19 = new com.zaxxer.hikari.HikariConfig();
        java.lang.String str20 = hikariConfig19.getConnectionInitSql();
        hikariConfig19.setMaxLifetime(35L);
        long long23 = hikariConfig19.leakDetectionThreshold;
        com.zaxxer.hikari.HikariConfig hikariConfig25 = new com.zaxxer.hikari.HikariConfig();
        javax.sql.DataSource dataSource26 = hikariConfig25.getDataSource();
        hikariConfig25.idleTimeout = 3;
        hikariConfig25.setLeakDetectionThreshold(52L);
        int int31 = hikariConfig25.minPoolSize;
        hikariConfig25.setIdleTimeout((long) 10);
        hikariConfig25.setConnectionTimeout((long) (short) 0);
        com.zaxxer.hikari.HikariConfig hikariConfig36 = new com.zaxxer.hikari.HikariConfig();
        java.lang.String str37 = hikariConfig36.getConnectionInitSql();
        long long38 = hikariConfig36.getLeakDetectionThreshold();
        hikariConfig36.leakDetectionThreshold = (byte) 0;
        hikariConfig36.acquireRetryDelay = 3L;
        hikariConfig36.poolName = "HikariPool-66";
        com.zaxxer.hikari.HikariConfig hikariConfig45 = new com.zaxxer.hikari.HikariConfig();
        javax.sql.DataSource dataSource46 = hikariConfig45.getDataSource();
        hikariConfig45.setConnectionTestQuery("");
        hikariConfig45.connectionCustomizerClassName = "";
        hikariConfig45.setConnectionCustomizerClassName("hi!");
        java.lang.String str53 = hikariConfig45.getCatalog();
        boolean boolean54 = hikariConfig45.isRegisterMbeans;
        hikariConfig45.setAcquireRetries(0);
        hikariConfig45.setMaximumPoolSize((int) '#');
        hikariConfig45.setTransactionIsolation("hi!");
        boolean boolean61 = hikariConfig45.isInitializationFailFast();
        java.lang.String str62 = hikariConfig45.connectionInitSql;
        hikariConfig45.maxPoolSize = 0;
        java.util.Properties properties65 = hikariConfig45.getDataSourceProperties();
        hikariConfig36.setDataSourceProperties(properties65);
        com.zaxxer.hikari.HikariConfig hikariConfig67 = new com.zaxxer.hikari.HikariConfig(properties65);
        hikariConfig25.dataSourceProperties = properties65;
        hikariConfig19.addDataSourceProperty("HikariPool-110", (java.lang.Object) properties65);
        hikariConfig0.dataSourceProperties = properties65;
        hikariConfig0.isAutoCommit = false;
        java.util.Properties properties73 = hikariConfig0.dataSourceProperties;
        com.zaxxer.hikari.HikariConfig hikariConfig74 = new com.zaxxer.hikari.HikariConfig(properties73);
        boolean boolean75 = hikariConfig74.isIsolateInternalQueries();
        org.junit.Assert.assertNull(dataSource1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 60 + "'", int8 == 60);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNull(str14);
// flaky:         org.junit.Assert.assertTrue("'" + long15 + "' != '" + 100L + "'", long15 == 100L);
        org.junit.Assert.assertNull(iConnectionCustomizer18);
        org.junit.Assert.assertNull(str20);
        org.junit.Assert.assertTrue("'" + long23 + "' != '" + 0L + "'", long23 == 0L);
        org.junit.Assert.assertNull(dataSource26);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 10 + "'", int31 == 10);
        org.junit.Assert.assertNull(str37);
        org.junit.Assert.assertTrue("'" + long38 + "' != '" + 0L + "'", long38 == 0L);
        org.junit.Assert.assertNull(dataSource46);
        org.junit.Assert.assertNull(str53);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + false + "'", boolean54 == false);
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + false + "'", boolean61 == false);
        org.junit.Assert.assertNull(str62);
        org.junit.Assert.assertNotNull(properties65);
        org.junit.Assert.assertNotNull(properties73);
        org.junit.Assert.assertTrue("'" + boolean75 + "' != '" + false + "'", boolean75 == false);
    }

    @Test
    public void test17109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17109");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        javax.sql.DataSource dataSource1 = hikariConfig0.getDataSource();
        hikariConfig0.setConnectionTestQuery("");
        hikariConfig0.connectionCustomizerClassName = "";
        hikariConfig0.setConnectionCustomizerClassName("hi!");
        java.lang.String str8 = hikariConfig0.getCatalog();
        java.util.Properties properties9 = hikariConfig0.dataSourceProperties;
        com.zaxxer.hikari.HikariConfig hikariConfig11 = new com.zaxxer.hikari.HikariConfig();
        java.lang.String str12 = hikariConfig11.getConnectionInitSql();
        long long13 = hikariConfig11.getLeakDetectionThreshold();
        hikariConfig11.leakDetectionThreshold = (-1);
        long long16 = hikariConfig11.acquireRetryDelay;
        boolean boolean17 = hikariConfig11.isRegisterMbeans;
        hikariConfig0.addDataSourceProperty("HikariPool-47", (java.lang.Object) boolean17);
        java.util.Properties properties19 = hikariConfig0.getDataSourceProperties();
        int int20 = hikariConfig0.minPoolSize;
        java.lang.String str21 = hikariConfig0.catalog;
        hikariConfig0.isInitializationFailFast = false;
        long long24 = hikariConfig0.getIdleTimeout();
        org.junit.Assert.assertNull(dataSource1);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNotNull(properties9);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 0L + "'", long13 == 0L);
// flaky:         org.junit.Assert.assertTrue("'" + long16 + "' != '" + 100L + "'", long16 == 100L);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(properties19);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 10 + "'", int20 == 10);
        org.junit.Assert.assertNull(str21);
// flaky:         org.junit.Assert.assertTrue("'" + long24 + "' != '" + (-1L) + "'", long24 == (-1L));
    }

    @Test
    public void test17110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17110");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        javax.sql.DataSource dataSource1 = hikariConfig0.getDataSource();
        hikariConfig0.setConnectionTestQuery("");
        hikariConfig0.connectionCustomizerClassName = "";
        hikariConfig0.setConnectionCustomizerClassName("hi!");
        java.lang.String str8 = hikariConfig0.getCatalog();
        java.util.Properties properties9 = hikariConfig0.dataSourceProperties;
        int int10 = hikariConfig0.minPoolSize;
        hikariConfig0.setIdleTimeout((long) 60);
        java.lang.String str13 = hikariConfig0.catalog;
        int int14 = hikariConfig0.acquireIncrement;
        hikariConfig0.maxLifetime = (-1);
        java.lang.String str17 = hikariConfig0.jdbcUrl;
        hikariConfig0.connectionCustomizerClassName = "HikariPool-18914";
        org.junit.Assert.assertNull(dataSource1);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNotNull(properties9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 10 + "'", int10 == 10);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertNull(str17);
    }

    @Test
    public void test17111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17111");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        hikariConfig0.setMaxLifetime((long) (short) 10);
        com.zaxxer.hikari.HikariConfig hikariConfig3 = new com.zaxxer.hikari.HikariConfig();
        javax.sql.DataSource dataSource4 = hikariConfig3.getDataSource();
        hikariConfig3.setConnectionTestQuery("");
        hikariConfig3.setInitializationFailFast(false);
        long long9 = hikariConfig3.getConnectionTimeout();
        java.util.Properties properties10 = hikariConfig3.dataSourceProperties;
        hikariConfig0.dataSourceProperties = properties10;
        int int12 = hikariConfig0.getAcquireIncrement();
        hikariConfig0.maxPoolSize = (short) 10;
        java.util.Properties properties15 = hikariConfig0.getDataSourceProperties();
        hikariConfig0.setPoolName("HikariPool-637");
        hikariConfig0.setIsolateInternalQueries(true);
        org.junit.Assert.assertNull(dataSource4);
// flaky:         org.junit.Assert.assertTrue("'" + long9 + "' != '" + 32L + "'", long9 == 32L);
        org.junit.Assert.assertNotNull(properties10);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertNotNull(properties15);
    }

    @Test
    public void test17112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17112");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        javax.sql.DataSource dataSource1 = hikariConfig0.getDataSource();
        hikariConfig0.setConnectionTestQuery("");
        hikariConfig0.setInitializationFailFast(false);
        hikariConfig0.catalog = "";
        javax.sql.DataSource dataSource8 = null;
        hikariConfig0.dataSource = dataSource8;
        javax.sql.DataSource dataSource10 = null;
        hikariConfig0.dataSource = dataSource10;
        int int12 = hikariConfig0.maxPoolSize;
        javax.sql.DataSource dataSource13 = null;
        hikariConfig0.dataSource = dataSource13;
        java.lang.String str15 = hikariConfig0.connectionTestQuery;
        hikariConfig0.setTransactionIsolation("HikariPool-127");
        long long18 = hikariConfig0.connectionTimeout;
        com.zaxxer.hikari.IConnectionCustomizer iConnectionCustomizer19 = null;
        hikariConfig0.connectionCustomizer = iConnectionCustomizer19;
        boolean boolean21 = hikariConfig0.isJdbc4connectionTest;
        hikariConfig0.setMaxLifetime((long) 10);
        org.junit.Assert.assertNull(dataSource1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 60 + "'", int12 == 60);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
// flaky:         org.junit.Assert.assertTrue("'" + long18 + "' != '" + 32L + "'", long18 == 32L);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
    }

    @Test
    public void test17113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17113");
        // The following exception was thrown during execution in test generation
        try {
            com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig("HikariPool-26636");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Property file HikariPool-26636 was not found.");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test17114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17114");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        javax.sql.DataSource dataSource1 = hikariConfig0.getDataSource();
        hikariConfig0.setConnectionTestQuery("");
        hikariConfig0.setInitializationFailFast(false);
        hikariConfig0.catalog = "";
        com.zaxxer.hikari.HikariConfig hikariConfig8 = new com.zaxxer.hikari.HikariConfig();
        javax.sql.DataSource dataSource9 = hikariConfig8.getDataSource();
        hikariConfig8.setConnectionTestQuery("");
        hikariConfig8.connectionCustomizerClassName = "";
        hikariConfig8.setConnectionCustomizerClassName("hi!");
        java.lang.String str16 = hikariConfig8.getCatalog();
        java.util.Properties properties17 = hikariConfig8.dataSourceProperties;
        hikariConfig0.dataSourceProperties = properties17;
        hikariConfig0.connectionCustomizerClassName = "hi!";
        hikariConfig0.setConnectionTestQuery("hi!");
        java.lang.String str23 = hikariConfig0.getJdbcUrl();
        java.lang.String str24 = hikariConfig0.getConnectionCustomizerClassName();
        java.lang.String str25 = hikariConfig0.poolName;
        javax.sql.DataSource dataSource26 = null;
        hikariConfig0.setDataSource(dataSource26);
        org.junit.Assert.assertNull(dataSource1);
        org.junit.Assert.assertNull(dataSource9);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertNotNull(properties17);
        org.junit.Assert.assertNull(str23);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "hi!" + "'", str24, "hi!");
// flaky:         org.junit.Assert.assertEquals("'" + str25 + "' != '" + "HikariPool-42174" + "'", str25, "HikariPool-42174");
    }

    @Test
    public void test17115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17115");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        javax.sql.DataSource dataSource1 = hikariConfig0.getDataSource();
        hikariConfig0.setConnectionTestQuery("");
        hikariConfig0.setInitializationFailFast(false);
        hikariConfig0.catalog = "";
        int int8 = hikariConfig0.getMaximumPoolSize();
        java.lang.String str9 = hikariConfig0.poolName;
        boolean boolean10 = hikariConfig0.isInitializationFailFast;
        boolean boolean11 = hikariConfig0.isInitializationFailFast();
        boolean boolean12 = hikariConfig0.isAutoCommit;
        hikariConfig0.setPoolName("HikariPool-1327");
        hikariConfig0.connectionTestQuery = "HikariPool-5798";
        org.junit.Assert.assertNull(dataSource1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 60 + "'", int8 == 60);
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "HikariPool-42176" + "'", str9, "HikariPool-42176");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
    }

    @Test
    public void test17116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17116");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        javax.sql.DataSource dataSource1 = hikariConfig0.getDataSource();
        hikariConfig0.setConnectionTestQuery("");
        hikariConfig0.setInitializationFailFast(false);
        hikariConfig0.catalog = "";
        javax.sql.DataSource dataSource8 = hikariConfig0.getDataSource();
        boolean boolean9 = hikariConfig0.isJdbc4connectionTest;
        hikariConfig0.acquireRetryDelay = (-1);
        hikariConfig0.setDataSourceClassName("HikariPool-31902");
        int int14 = hikariConfig0.getTransactionIsolation();
        org.junit.Assert.assertNull(dataSource1);
        org.junit.Assert.assertNull(dataSource8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
    }

    @Test
    public void test17117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17117");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        java.lang.String str1 = hikariConfig0.getConnectionInitSql();
        long long2 = hikariConfig0.getLeakDetectionThreshold();
        int int3 = hikariConfig0.getMaximumPoolSize();
        long long4 = hikariConfig0.getConnectionTimeout();
        long long5 = hikariConfig0.getMaxLifetime();
        javax.sql.DataSource dataSource6 = null;
        hikariConfig0.setDataSource(dataSource6);
        int int8 = hikariConfig0.getMinimumPoolSize();
        hikariConfig0.connectionTimeout = (byte) 100;
        hikariConfig0.setConnectionInitSql("HikariPool-533");
        hikariConfig0.maxPoolSize = (byte) 10;
        hikariConfig0.isJdbc4connectionTest = false;
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 60 + "'", int3 == 60);
// flaky:         org.junit.Assert.assertTrue("'" + long4 + "' != '" + 32L + "'", long4 == 32L);
// flaky:         org.junit.Assert.assertTrue("'" + long5 + "' != '" + 32L + "'", long5 == 32L);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 10 + "'", int8 == 10);
    }

    @Test
    public void test17118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17118");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        javax.sql.DataSource dataSource1 = hikariConfig0.getDataSource();
        hikariConfig0.setConnectionTestQuery("");
        hikariConfig0.setInitializationFailFast(false);
        hikariConfig0.catalog = "";
        javax.sql.DataSource dataSource8 = hikariConfig0.getDataSource();
        hikariConfig0.acquireRetries = (short) 10;
        int int11 = hikariConfig0.getAcquireIncrement();
        javax.sql.DataSource dataSource12 = null;
        hikariConfig0.dataSource = dataSource12;
        java.lang.String str14 = hikariConfig0.transactionIsolationName;
        long long15 = hikariConfig0.getIdleTimeout();
        int int16 = hikariConfig0.acquireRetries;
        hikariConfig0.isAutoCommit = true;
        hikariConfig0.setConnectionInitSql("HikariPool-4484");
        org.junit.Assert.assertNull(dataSource1);
        org.junit.Assert.assertNull(dataSource8);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertNull(str14);
// flaky:         org.junit.Assert.assertTrue("'" + long15 + "' != '" + (-1L) + "'", long15 == (-1L));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 10 + "'", int16 == 10);
    }

    @Test
    public void test17119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17119");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        java.lang.String str1 = hikariConfig0.getConnectionInitSql();
        long long2 = hikariConfig0.getLeakDetectionThreshold();
        boolean boolean3 = hikariConfig0.isIsolateInternalQueries;
        int int4 = hikariConfig0.getAcquireRetries();
        hikariConfig0.setInitializationFailFast(false);
        hikariConfig0.setConnectionCustomizerClassName("HikariPool-38");
        java.util.Properties properties9 = hikariConfig0.getDataSourceProperties();
        hikariConfig0.leakDetectionThreshold = (short) 100;
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 3 + "'", int4 == 3);
        org.junit.Assert.assertNotNull(properties9);
    }

    @Test
    public void test17120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17120");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        javax.sql.DataSource dataSource1 = hikariConfig0.getDataSource();
        hikariConfig0.setConnectionTestQuery("");
        hikariConfig0.setInitializationFailFast(false);
        long long6 = hikariConfig0.getConnectionTimeout();
        java.util.Properties properties7 = hikariConfig0.dataSourceProperties;
        hikariConfig0.setDataSourceClassName("HikariPool-47");
        hikariConfig0.maxPoolSize = 'a';
        com.zaxxer.hikari.HikariConfig hikariConfig13 = new com.zaxxer.hikari.HikariConfig();
        java.lang.String str14 = hikariConfig13.getConnectionInitSql();
        long long15 = hikariConfig13.getLeakDetectionThreshold();
        int int16 = hikariConfig13.getMaximumPoolSize();
        long long17 = hikariConfig13.leakDetectionThreshold;
        hikariConfig13.catalog = "HikariPool-62";
        boolean boolean20 = hikariConfig13.isJdbc4connectionTest;
        int int21 = hikariConfig13.acquireRetries;
        com.zaxxer.hikari.HikariConfig hikariConfig22 = new com.zaxxer.hikari.HikariConfig();
        javax.sql.DataSource dataSource23 = hikariConfig22.getDataSource();
        hikariConfig22.setConnectionTestQuery("");
        com.zaxxer.hikari.HikariConfig hikariConfig26 = new com.zaxxer.hikari.HikariConfig();
        javax.sql.DataSource dataSource27 = hikariConfig26.getDataSource();
        hikariConfig26.setConnectionTestQuery("");
        hikariConfig26.setInitializationFailFast(false);
        long long32 = hikariConfig26.getConnectionTimeout();
        java.util.Properties properties33 = hikariConfig26.dataSourceProperties;
        hikariConfig22.setDataSourceProperties(properties33);
        hikariConfig13.setDataSourceProperties(properties33);
        hikariConfig0.addDataSourceProperty("HikariPool-428", (java.lang.Object) hikariConfig13);
        long long37 = hikariConfig0.getMaxLifetime();
        java.lang.String str38 = hikariConfig0.getConnectionInitSql();
        hikariConfig0.acquireIncrement = ' ';
        boolean boolean41 = hikariConfig0.isAutoCommit;
        java.lang.String str42 = hikariConfig0.getDataSourceClassName();
        long long43 = hikariConfig0.getLeakDetectionThreshold();
        com.zaxxer.hikari.IConnectionCustomizer iConnectionCustomizer44 = hikariConfig0.connectionCustomizer;
        org.junit.Assert.assertNull(dataSource1);
// flaky:         org.junit.Assert.assertTrue("'" + long6 + "' != '" + 32L + "'", long6 == 32L);
        org.junit.Assert.assertNotNull(properties7);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 0L + "'", long15 == 0L);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 60 + "'", int16 == 60);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 0L + "'", long17 == 0L);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 3 + "'", int21 == 3);
        org.junit.Assert.assertNull(dataSource23);
        org.junit.Assert.assertNull(dataSource27);
// flaky:         org.junit.Assert.assertTrue("'" + long32 + "' != '" + 32L + "'", long32 == 32L);
        org.junit.Assert.assertNotNull(properties33);
// flaky:         org.junit.Assert.assertTrue("'" + long37 + "' != '" + 32L + "'", long37 == 32L);
        org.junit.Assert.assertNull(str38);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + true + "'", boolean41 == true);
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "HikariPool-47" + "'", str42, "HikariPool-47");
        org.junit.Assert.assertTrue("'" + long43 + "' != '" + 0L + "'", long43 == 0L);
        org.junit.Assert.assertNull(iConnectionCustomizer44);
    }

    @Test
    public void test17121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17121");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        hikariConfig0.setMaxLifetime((long) (short) 10);
        java.lang.String str3 = hikariConfig0.getPoolName();
        hikariConfig0.jdbcUrl = "";
        hikariConfig0.setMaxLifetime(0L);
        hikariConfig0.setTransactionIsolation("HikariPool-48");
        com.zaxxer.hikari.HikariConfig hikariConfig10 = new com.zaxxer.hikari.HikariConfig();
        hikariConfig10.setMaxLifetime((long) (short) 10);
        com.zaxxer.hikari.HikariConfig hikariConfig13 = new com.zaxxer.hikari.HikariConfig();
        javax.sql.DataSource dataSource14 = hikariConfig13.getDataSource();
        hikariConfig13.setConnectionTestQuery("");
        hikariConfig13.setInitializationFailFast(false);
        long long19 = hikariConfig13.getConnectionTimeout();
        java.util.Properties properties20 = hikariConfig13.dataSourceProperties;
        hikariConfig10.dataSourceProperties = properties20;
        hikariConfig0.setDataSourceProperties(properties20);
        java.lang.String str23 = hikariConfig0.getJdbcUrl();
        javax.sql.DataSource dataSource24 = hikariConfig0.dataSource;
        hikariConfig0.isJdbc4connectionTest = true;
        java.lang.String str27 = hikariConfig0.transactionIsolationName;
        hikariConfig0.transactionIsolation = 97;
        int int30 = hikariConfig0.getAcquireIncrement();
        java.lang.String str31 = hikariConfig0.getPoolName();
        java.lang.String str32 = hikariConfig0.getConnectionInitSql();
        int int33 = hikariConfig0.acquireIncrement;
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "HikariPool-42185" + "'", str3, "HikariPool-42185");
        org.junit.Assert.assertNull(dataSource14);
// flaky:         org.junit.Assert.assertTrue("'" + long19 + "' != '" + 32L + "'", long19 == 32L);
        org.junit.Assert.assertNotNull(properties20);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
        org.junit.Assert.assertNull(dataSource24);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "HikariPool-48" + "'", str27, "HikariPool-48");
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 1 + "'", int30 == 1);
// flaky:         org.junit.Assert.assertEquals("'" + str31 + "' != '" + "HikariPool-42185" + "'", str31, "HikariPool-42185");
        org.junit.Assert.assertNull(str32);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 1 + "'", int33 == 1);
    }

    @Test
    public void test17122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17122");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        javax.sql.DataSource dataSource1 = hikariConfig0.getDataSource();
        hikariConfig0.setConnectionTestQuery("");
        hikariConfig0.connectionCustomizerClassName = "";
        hikariConfig0.setConnectionCustomizerClassName("hi!");
        java.lang.String str8 = hikariConfig0.getCatalog();
        java.util.Properties properties9 = hikariConfig0.dataSourceProperties;
        int int10 = hikariConfig0.minPoolSize;
        long long11 = hikariConfig0.getMaxLifetime();
        hikariConfig0.addDataSourceProperty("HikariPool-110", (java.lang.Object) 100.0d);
        hikariConfig0.setIdleTimeout(10L);
        hikariConfig0.isReadOnly = true;
        long long19 = hikariConfig0.getIdleTimeout();
        java.lang.String str20 = hikariConfig0.connectionCustomizerClassName;
        hikariConfig0.setRegisterMbeans(true);
        org.junit.Assert.assertNull(dataSource1);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNotNull(properties9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 10 + "'", int10 == 10);
// flaky:         org.junit.Assert.assertTrue("'" + long11 + "' != '" + 32L + "'", long11 == 32L);
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 10L + "'", long19 == 10L);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "hi!" + "'", str20, "hi!");
    }

    @Test
    public void test17123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17123");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        javax.sql.DataSource dataSource1 = hikariConfig0.getDataSource();
        hikariConfig0.setConnectionTestQuery("");
        hikariConfig0.connectionCustomizerClassName = "";
        com.zaxxer.hikari.IConnectionCustomizer iConnectionCustomizer6 = hikariConfig0.connectionCustomizer;
        java.lang.String str7 = hikariConfig0.jdbcUrl;
        boolean boolean8 = hikariConfig0.isReadOnly;
        java.lang.String str9 = hikariConfig0.jdbcUrl;
        long long10 = hikariConfig0.getMaxLifetime();
        hikariConfig0.dataSourceClassName = "HikariPool-1887";
        com.zaxxer.hikari.HikariConfig hikariConfig13 = new com.zaxxer.hikari.HikariConfig();
        javax.sql.DataSource dataSource14 = hikariConfig13.getDataSource();
        hikariConfig13.setConnectionTestQuery("");
        hikariConfig13.setInitializationFailFast(false);
        hikariConfig13.catalog = "";
        javax.sql.DataSource dataSource21 = null;
        hikariConfig13.dataSource = dataSource21;
        boolean boolean23 = hikariConfig13.isJdbc4ConnectionTest();
        hikariConfig13.maxLifetime = (short) 0;
        com.zaxxer.hikari.HikariConfig hikariConfig26 = new com.zaxxer.hikari.HikariConfig();
        javax.sql.DataSource dataSource27 = hikariConfig26.getDataSource();
        hikariConfig26.setConnectionTestQuery("");
        hikariConfig26.setInitializationFailFast(false);
        hikariConfig26.catalog = "";
        javax.sql.DataSource dataSource34 = null;
        hikariConfig26.dataSource = dataSource34;
        javax.sql.DataSource dataSource36 = null;
        hikariConfig26.dataSource = dataSource36;
        int int38 = hikariConfig26.maxPoolSize;
        hikariConfig26.transactionIsolation = (short) 0;
        java.lang.String str41 = hikariConfig26.getConnectionInitSql();
        int int42 = hikariConfig26.getAcquireRetries();
        hikariConfig26.leakDetectionThreshold = 1L;
        hikariConfig26.acquireRetryDelay = 52L;
        com.zaxxer.hikari.HikariConfig hikariConfig47 = new com.zaxxer.hikari.HikariConfig();
        hikariConfig47.setMaxLifetime((long) (short) 10);
        com.zaxxer.hikari.HikariConfig hikariConfig50 = new com.zaxxer.hikari.HikariConfig();
        javax.sql.DataSource dataSource51 = hikariConfig50.getDataSource();
        hikariConfig50.setConnectionTestQuery("");
        hikariConfig50.setInitializationFailFast(false);
        long long56 = hikariConfig50.getConnectionTimeout();
        java.util.Properties properties57 = hikariConfig50.dataSourceProperties;
        hikariConfig47.dataSourceProperties = properties57;
        java.lang.String str59 = hikariConfig47.catalog;
        hikariConfig47.catalog = "HikariPool-65";
        hikariConfig47.acquireIncrement = (short) 0;
        java.util.Properties properties64 = hikariConfig47.getDataSourceProperties();
        hikariConfig26.dataSourceProperties = properties64;
        hikariConfig13.dataSourceProperties = properties64;
        com.zaxxer.hikari.HikariConfig hikariConfig67 = new com.zaxxer.hikari.HikariConfig(properties64);
        hikariConfig0.setDataSourceProperties(properties64);
        hikariConfig0.setUseInstrumentation(false);
        org.junit.Assert.assertNull(dataSource1);
        org.junit.Assert.assertNull(iConnectionCustomizer6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(str9);
// flaky:         org.junit.Assert.assertTrue("'" + long10 + "' != '" + 32L + "'", long10 == 32L);
        org.junit.Assert.assertNull(dataSource14);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertNull(dataSource27);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 60 + "'", int38 == 60);
        org.junit.Assert.assertNull(str41);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 3 + "'", int42 == 3);
        org.junit.Assert.assertNull(dataSource51);
// flaky:         org.junit.Assert.assertTrue("'" + long56 + "' != '" + 32L + "'", long56 == 32L);
        org.junit.Assert.assertNotNull(properties57);
        org.junit.Assert.assertNull(str59);
        org.junit.Assert.assertNotNull(properties64);
    }

    @Test
    public void test17124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17124");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        java.lang.String str1 = hikariConfig0.getConnectionInitSql();
        long long2 = hikariConfig0.getLeakDetectionThreshold();
        int int3 = hikariConfig0.getMaximumPoolSize();
        long long4 = hikariConfig0.getIdleTimeout();
        int int5 = hikariConfig0.maxPoolSize;
        java.lang.String str6 = hikariConfig0.getConnectionCustomizerClassName();
        hikariConfig0.setConnectionCustomizerClassName("HikariPool-127");
        int int9 = hikariConfig0.getAcquireIncrement();
        hikariConfig0.setLeakDetectionThreshold((long) (byte) 0);
        int int12 = hikariConfig0.transactionIsolation;
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 60 + "'", int3 == 60);
// flaky:         org.junit.Assert.assertTrue("'" + long4 + "' != '" + (-1L) + "'", long4 == (-1L));
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 60 + "'", int5 == 60);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
    }

    @Test
    public void test17125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17125");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        java.lang.String str1 = hikariConfig0.getConnectionInitSql();
        long long2 = hikariConfig0.getLeakDetectionThreshold();
        hikariConfig0.leakDetectionThreshold = (-1);
        hikariConfig0.setAcquireRetryDelay(750L);
        hikariConfig0.setAutoCommit(false);
        hikariConfig0.catalog = "HikariPool-4761";
        java.util.Properties properties11 = hikariConfig0.dataSourceProperties;
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertNotNull(properties11);
    }

    @Test
    public void test17126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17126");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        java.lang.String str1 = hikariConfig0.getConnectionInitSql();
        long long2 = hikariConfig0.getLeakDetectionThreshold();
        hikariConfig0.leakDetectionThreshold = (-1);
        long long5 = hikariConfig0.acquireRetryDelay;
        long long6 = hikariConfig0.getIdleTimeout();
        hikariConfig0.isInitializationFailFast = true;
        java.lang.String str9 = hikariConfig0.transactionIsolationName;
        java.lang.String str10 = hikariConfig0.getConnectionInitSql();
        int int11 = hikariConfig0.acquireRetries;
        java.lang.String str12 = hikariConfig0.getJdbcUrl();
        hikariConfig0.isIsolateInternalQueries = true;
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
// flaky:         org.junit.Assert.assertTrue("'" + long5 + "' != '" + 100L + "'", long5 == 100L);
// flaky:         org.junit.Assert.assertTrue("'" + long6 + "' != '" + (-1L) + "'", long6 == (-1L));
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 3 + "'", int11 == 3);
        org.junit.Assert.assertNull(str12);
    }

    @Test
    public void test17127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17127");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        hikariConfig0.setMaxLifetime((long) (short) 10);
        com.zaxxer.hikari.HikariConfig hikariConfig3 = new com.zaxxer.hikari.HikariConfig();
        javax.sql.DataSource dataSource4 = hikariConfig3.getDataSource();
        hikariConfig3.setConnectionTestQuery("");
        hikariConfig3.setInitializationFailFast(false);
        long long9 = hikariConfig3.getConnectionTimeout();
        java.util.Properties properties10 = hikariConfig3.dataSourceProperties;
        hikariConfig0.dataSourceProperties = properties10;
        java.lang.String str12 = hikariConfig0.catalog;
        hikariConfig0.setConnectionInitSql("HikariPool-66");
        hikariConfig0.acquireRetries = 0;
        int int17 = hikariConfig0.getMinimumPoolSize();
        boolean boolean18 = hikariConfig0.isAutoCommit;
        boolean boolean19 = hikariConfig0.isReadOnly();
        com.zaxxer.hikari.HikariConfig hikariConfig20 = new com.zaxxer.hikari.HikariConfig();
        javax.sql.DataSource dataSource21 = hikariConfig20.getDataSource();
        hikariConfig20.setConnectionTestQuery("");
        hikariConfig20.setInitializationFailFast(false);
        long long26 = hikariConfig20.getConnectionTimeout();
        java.util.Properties properties27 = hikariConfig20.dataSourceProperties;
        boolean boolean28 = hikariConfig20.isAutoCommit();
        hikariConfig20.setConnectionCustomizerClassName("HikariPool-295");
        boolean boolean31 = hikariConfig20.isAutoCommit;
        com.zaxxer.hikari.HikariConfig hikariConfig32 = new com.zaxxer.hikari.HikariConfig();
        javax.sql.DataSource dataSource33 = hikariConfig32.getDataSource();
        hikariConfig32.setConnectionTestQuery("");
        hikariConfig32.setInitializationFailFast(false);
        long long38 = hikariConfig32.getConnectionTimeout();
        hikariConfig32.setJdbcUrl("HikariPool-47");
        hikariConfig32.setCatalog("HikariPool-135");
        com.zaxxer.hikari.HikariConfig hikariConfig43 = new com.zaxxer.hikari.HikariConfig();
        javax.sql.DataSource dataSource44 = hikariConfig43.getDataSource();
        hikariConfig43.setConnectionTestQuery("");
        hikariConfig43.connectionCustomizerClassName = "";
        hikariConfig43.setConnectionCustomizerClassName("hi!");
        java.lang.String str51 = hikariConfig43.getCatalog();
        boolean boolean52 = hikariConfig43.isRegisterMbeans;
        hikariConfig43.setAcquireRetries(0);
        hikariConfig43.setMaximumPoolSize((int) '#');
        hikariConfig43.setTransactionIsolation("hi!");
        boolean boolean59 = hikariConfig43.isInitializationFailFast();
        java.lang.String str60 = hikariConfig43.connectionInitSql;
        hikariConfig43.maxPoolSize = 0;
        java.util.Properties properties63 = hikariConfig43.getDataSourceProperties();
        hikariConfig32.dataSourceProperties = properties63;
        hikariConfig20.dataSourceProperties = properties63;
        hikariConfig0.dataSourceProperties = properties63;
        hikariConfig0.connectionTimeout = 0L;
        hikariConfig0.maxLifetime = (short) 0;
        org.junit.Assert.assertNull(dataSource4);
// flaky:         org.junit.Assert.assertTrue("'" + long9 + "' != '" + 32L + "'", long9 == 32L);
        org.junit.Assert.assertNotNull(properties10);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 10 + "'", int17 == 10);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNull(dataSource21);
// flaky:         org.junit.Assert.assertTrue("'" + long26 + "' != '" + 32L + "'", long26 == 32L);
        org.junit.Assert.assertNotNull(properties27);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + true + "'", boolean31 == true);
        org.junit.Assert.assertNull(dataSource33);
// flaky:         org.junit.Assert.assertTrue("'" + long38 + "' != '" + 32L + "'", long38 == 32L);
        org.junit.Assert.assertNull(dataSource44);
        org.junit.Assert.assertNull(str51);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + false + "'", boolean59 == false);
        org.junit.Assert.assertNull(str60);
        org.junit.Assert.assertNotNull(properties63);
    }

    @Test
    public void test17128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17128");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        javax.sql.DataSource dataSource1 = hikariConfig0.getDataSource();
        hikariConfig0.setConnectionTestQuery("");
        hikariConfig0.setInitializationFailFast(false);
        hikariConfig0.catalog = "";
        com.zaxxer.hikari.HikariConfig hikariConfig8 = new com.zaxxer.hikari.HikariConfig();
        javax.sql.DataSource dataSource9 = hikariConfig8.getDataSource();
        hikariConfig8.setConnectionTestQuery("");
        hikariConfig8.connectionCustomizerClassName = "";
        hikariConfig8.setConnectionCustomizerClassName("hi!");
        java.lang.String str16 = hikariConfig8.getCatalog();
        java.util.Properties properties17 = hikariConfig8.dataSourceProperties;
        hikariConfig0.dataSourceProperties = properties17;
        hikariConfig0.connectionCustomizerClassName = "hi!";
        hikariConfig0.setConnectionTestQuery("hi!");
        java.lang.String str23 = hikariConfig0.getJdbcUrl();
        java.lang.String str24 = hikariConfig0.dataSourceClassName;
        hikariConfig0.setJdbc4ConnectionTest(true);
        hikariConfig0.connectionTestQuery = "HikariPool-40898";
        org.junit.Assert.assertNull(dataSource1);
        org.junit.Assert.assertNull(dataSource9);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertNotNull(properties17);
        org.junit.Assert.assertNull(str23);
        org.junit.Assert.assertNull(str24);
    }

    @Test
    public void test17129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17129");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        hikariConfig0.setMaxLifetime((long) (short) 10);
        java.lang.String str3 = hikariConfig0.getPoolName();
        hikariConfig0.jdbcUrl = "";
        hikariConfig0.setMaxLifetime(0L);
        hikariConfig0.setTransactionIsolation("HikariPool-48");
        com.zaxxer.hikari.HikariConfig hikariConfig10 = new com.zaxxer.hikari.HikariConfig();
        hikariConfig10.setMaxLifetime((long) (short) 10);
        com.zaxxer.hikari.HikariConfig hikariConfig13 = new com.zaxxer.hikari.HikariConfig();
        javax.sql.DataSource dataSource14 = hikariConfig13.getDataSource();
        hikariConfig13.setConnectionTestQuery("");
        hikariConfig13.setInitializationFailFast(false);
        long long19 = hikariConfig13.getConnectionTimeout();
        java.util.Properties properties20 = hikariConfig13.dataSourceProperties;
        hikariConfig10.dataSourceProperties = properties20;
        hikariConfig0.setDataSourceProperties(properties20);
        java.lang.String str23 = hikariConfig0.getJdbcUrl();
        javax.sql.DataSource dataSource24 = hikariConfig0.dataSource;
        java.util.Properties properties25 = hikariConfig0.dataSourceProperties;
        java.lang.String str26 = hikariConfig0.transactionIsolationName;
        hikariConfig0.idleTimeout = (short) 0;
        java.lang.String str29 = hikariConfig0.connectionInitSql;
        com.zaxxer.hikari.HikariConfig hikariConfig30 = new com.zaxxer.hikari.HikariConfig();
        javax.sql.DataSource dataSource31 = hikariConfig30.getDataSource();
        hikariConfig30.setConnectionTestQuery("");
        hikariConfig30.setInitializationFailFast(false);
        hikariConfig30.catalog = "";
        int int38 = hikariConfig30.getMaximumPoolSize();
        hikariConfig30.connectionTimeout = 10L;
        hikariConfig30.isReadOnly = false;
        java.util.Properties properties43 = hikariConfig30.getDataSourceProperties();
        hikariConfig0.setDataSourceProperties(properties43);
        boolean boolean45 = hikariConfig0.isJdbc4connectionTest;
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "HikariPool-42206" + "'", str3, "HikariPool-42206");
        org.junit.Assert.assertNull(dataSource14);
// flaky:         org.junit.Assert.assertTrue("'" + long19 + "' != '" + 32L + "'", long19 == 32L);
        org.junit.Assert.assertNotNull(properties20);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
        org.junit.Assert.assertNull(dataSource24);
        org.junit.Assert.assertNotNull(properties25);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "HikariPool-48" + "'", str26, "HikariPool-48");
        org.junit.Assert.assertNull(str29);
        org.junit.Assert.assertNull(dataSource31);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 60 + "'", int38 == 60);
        org.junit.Assert.assertNotNull(properties43);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + true + "'", boolean45 == true);
    }

    @Test
    public void test17130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17130");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        javax.sql.DataSource dataSource1 = hikariConfig0.getDataSource();
        hikariConfig0.idleTimeout = 3;
        int int4 = hikariConfig0.getAcquireRetries();
        hikariConfig0.acquireIncrement = (-1);
        hikariConfig0.acquireRetries = 100;
        hikariConfig0.connectionCustomizerClassName = "HikariPool-97";
        hikariConfig0.setUseInstrumentation(true);
        java.lang.String str13 = hikariConfig0.getConnectionCustomizerClassName();
        // The following exception was thrown during execution in test generation
        try {
            hikariConfig0.validate();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: one of either dataSource or dataSourceClassName must be specified");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(dataSource1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 3 + "'", int4 == 3);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "HikariPool-97" + "'", str13, "HikariPool-97");
    }

    @Test
    public void test17131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17131");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        javax.sql.DataSource dataSource1 = hikariConfig0.getDataSource();
        hikariConfig0.setConnectionTestQuery("");
        hikariConfig0.setInitializationFailFast(false);
        hikariConfig0.catalog = "";
        javax.sql.DataSource dataSource8 = hikariConfig0.getDataSource();
        boolean boolean9 = hikariConfig0.isReadOnly;
        hikariConfig0.maxPoolSize = 3;
        int int12 = hikariConfig0.getAcquireIncrement();
        hikariConfig0.connectionInitSql = "HikariPool-2636";
        boolean boolean15 = hikariConfig0.isJdbc4ConnectionTest();
        hikariConfig0.setLeakDetectionThreshold(32L);
        boolean boolean18 = hikariConfig0.isRegisterMbeans;
        org.junit.Assert.assertNull(dataSource1);
        org.junit.Assert.assertNull(dataSource8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test17132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17132");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        javax.sql.DataSource dataSource1 = hikariConfig0.getDataSource();
        hikariConfig0.setConnectionTestQuery("");
        hikariConfig0.connectionCustomizerClassName = "";
        hikariConfig0.setConnectionCustomizerClassName("hi!");
        java.lang.String str8 = hikariConfig0.getCatalog();
        java.util.Properties properties9 = hikariConfig0.dataSourceProperties;
        com.zaxxer.hikari.HikariConfig hikariConfig11 = new com.zaxxer.hikari.HikariConfig();
        java.lang.String str12 = hikariConfig11.getConnectionInitSql();
        long long13 = hikariConfig11.getLeakDetectionThreshold();
        hikariConfig11.leakDetectionThreshold = (-1);
        long long16 = hikariConfig11.acquireRetryDelay;
        boolean boolean17 = hikariConfig11.isRegisterMbeans;
        hikariConfig0.addDataSourceProperty("HikariPool-47", (java.lang.Object) boolean17);
        java.util.Properties properties19 = hikariConfig0.getDataSourceProperties();
        hikariConfig0.transactionIsolationName = "HikariPool-18";
        java.util.Properties properties22 = hikariConfig0.getDataSourceProperties();
        javax.sql.DataSource dataSource23 = hikariConfig0.getDataSource();
        java.lang.String str24 = hikariConfig0.getDataSourceClassName();
        boolean boolean25 = hikariConfig0.isReadOnly;
        hikariConfig0.setMaxLifetime((long) 60);
        hikariConfig0.dataSourceClassName = "HikariPool-952";
        long long30 = hikariConfig0.leakDetectionThreshold;
        boolean boolean31 = hikariConfig0.isRegisterMbeans();
        org.junit.Assert.assertNull(dataSource1);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNotNull(properties9);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 0L + "'", long13 == 0L);
// flaky:         org.junit.Assert.assertTrue("'" + long16 + "' != '" + 100L + "'", long16 == 100L);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(properties19);
        org.junit.Assert.assertNotNull(properties22);
        org.junit.Assert.assertNull(dataSource23);
        org.junit.Assert.assertNull(str24);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + long30 + "' != '" + 0L + "'", long30 == 0L);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
    }

    @Test
    public void test17133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17133");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        javax.sql.DataSource dataSource1 = hikariConfig0.getDataSource();
        hikariConfig0.setConnectionTestQuery("");
        hikariConfig0.setInitializationFailFast(false);
        long long6 = hikariConfig0.getConnectionTimeout();
        hikariConfig0.setJdbcUrl("HikariPool-47");
        hikariConfig0.isIsolateInternalQueries = false;
        hikariConfig0.connectionTestQuery = "HikariPool-62";
        hikariConfig0.isInitializationFailFast = false;
        boolean boolean15 = hikariConfig0.isReadOnly;
        java.lang.String str16 = hikariConfig0.catalog;
        int int17 = hikariConfig0.getMaximumPoolSize();
        boolean boolean18 = hikariConfig0.isRegisterMbeans;
        hikariConfig0.setConnectionInitSql("HikariPool-34313");
        org.junit.Assert.assertNull(dataSource1);
// flaky:         org.junit.Assert.assertTrue("'" + long6 + "' != '" + 32L + "'", long6 == 32L);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 60 + "'", int17 == 60);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test17134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17134");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        javax.sql.DataSource dataSource1 = hikariConfig0.getDataSource();
        hikariConfig0.setConnectionTestQuery("");
        hikariConfig0.connectionCustomizerClassName = "";
        hikariConfig0.setConnectionCustomizerClassName("hi!");
        java.lang.String str8 = hikariConfig0.getCatalog();
        boolean boolean9 = hikariConfig0.isRegisterMbeans;
        com.zaxxer.hikari.HikariConfig hikariConfig11 = new com.zaxxer.hikari.HikariConfig();
        javax.sql.DataSource dataSource12 = hikariConfig11.getDataSource();
        hikariConfig11.setConnectionTestQuery("");
        hikariConfig11.connectionCustomizerClassName = "";
        hikariConfig11.setConnectionCustomizerClassName("hi!");
        java.lang.String str19 = hikariConfig11.getCatalog();
        boolean boolean20 = hikariConfig11.isRegisterMbeans;
        hikariConfig11.setAcquireRetries(0);
        hikariConfig11.setMaximumPoolSize((int) '#');
        hikariConfig0.addDataSourceProperty("HikariPool-47", (java.lang.Object) '#');
        hikariConfig0.setConnectionTestQuery("HikariPool-47");
        java.lang.String str28 = hikariConfig0.connectionInitSql;
        hikariConfig0.transactionIsolation = (short) 100;
        hikariConfig0.setAcquireRetries(100);
        hikariConfig0.transactionIsolationName = "HikariPool-101";
        int int35 = hikariConfig0.getAcquireRetries();
        com.zaxxer.hikari.HikariConfig hikariConfig37 = new com.zaxxer.hikari.HikariConfig();
        javax.sql.DataSource dataSource38 = hikariConfig37.getDataSource();
        hikariConfig37.setConnectionTestQuery("");
        hikariConfig37.connectionCustomizerClassName = "";
        com.zaxxer.hikari.IConnectionCustomizer iConnectionCustomizer43 = hikariConfig37.connectionCustomizer;
        java.lang.String str44 = hikariConfig37.jdbcUrl;
        boolean boolean45 = hikariConfig37.isReadOnly;
        java.lang.String str46 = hikariConfig37.jdbcUrl;
        long long47 = hikariConfig37.idleTimeout;
        int int48 = hikariConfig37.getTransactionIsolation();
        hikariConfig37.setConnectionInitSql("HikariPool-321");
        hikariConfig0.addDataSourceProperty("HikariPool-213", (java.lang.Object) "HikariPool-321");
        hikariConfig0.transactionIsolation = (short) 100;
        com.zaxxer.hikari.HikariConfig hikariConfig54 = new com.zaxxer.hikari.HikariConfig();
        java.lang.String str55 = hikariConfig54.getConnectionInitSql();
        hikariConfig54.acquireIncrement = 0;
        hikariConfig54.maxLifetime = 100;
        java.lang.String str60 = hikariConfig54.connectionInitSql;
        hikariConfig54.setTransactionIsolation("HikariPool-47");
        boolean boolean63 = hikariConfig54.isJdbc4connectionTest;
        hikariConfig54.acquireRetryDelay = (short) 10;
        java.util.Properties properties66 = hikariConfig54.dataSourceProperties;
        hikariConfig0.dataSourceProperties = properties66;
        hikariConfig0.setDataSourceClassName("HikariPool-18807");
        org.junit.Assert.assertNull(dataSource1);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(dataSource12);
        org.junit.Assert.assertNull(str19);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNull(str28);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 100 + "'", int35 == 100);
        org.junit.Assert.assertNull(dataSource38);
        org.junit.Assert.assertNull(iConnectionCustomizer43);
        org.junit.Assert.assertNull(str44);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertNull(str46);
// flaky:         org.junit.Assert.assertTrue("'" + long47 + "' != '" + (-1L) + "'", long47 == (-1L));
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + (-1) + "'", int48 == (-1));
        org.junit.Assert.assertNull(str55);
        org.junit.Assert.assertNull(str60);
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + true + "'", boolean63 == true);
        org.junit.Assert.assertNotNull(properties66);
    }

    @Test
    public void test17135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17135");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        java.lang.String str1 = hikariConfig0.getConnectionInitSql();
        long long2 = hikariConfig0.getLeakDetectionThreshold();
        hikariConfig0.maxPoolSize = 35;
        java.lang.String str5 = hikariConfig0.getConnectionTestQuery();
        int int6 = hikariConfig0.minPoolSize;
        javax.sql.DataSource dataSource7 = hikariConfig0.getDataSource();
        int int8 = hikariConfig0.getAcquireRetries();
        boolean boolean9 = hikariConfig0.isAutoCommit();
        java.lang.String str10 = hikariConfig0.connectionTestQuery;
        hikariConfig0.connectionInitSql = "HikariPool-217";
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertNull(dataSource7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 3 + "'", int8 == 3);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNull(str10);
    }

    @Test
    public void test17136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17136");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        java.lang.String str1 = hikariConfig0.getConnectionInitSql();
        long long2 = hikariConfig0.getLeakDetectionThreshold();
        hikariConfig0.leakDetectionThreshold = (-1);
        long long5 = hikariConfig0.acquireRetryDelay;
        long long6 = hikariConfig0.getIdleTimeout();
        int int7 = hikariConfig0.maxPoolSize;
        long long8 = hikariConfig0.getIdleTimeout();
        hikariConfig0.idleTimeout = (short) 10;
        int int11 = hikariConfig0.getTransactionIsolation();
        java.lang.String str12 = hikariConfig0.getJdbcUrl();
        hikariConfig0.setMaximumPoolSize((int) (short) 100);
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
// flaky:         org.junit.Assert.assertTrue("'" + long5 + "' != '" + 100L + "'", long5 == 100L);
// flaky:         org.junit.Assert.assertTrue("'" + long6 + "' != '" + (-1L) + "'", long6 == (-1L));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 60 + "'", int7 == 60);
// flaky:         org.junit.Assert.assertTrue("'" + long8 + "' != '" + (-1L) + "'", long8 == (-1L));
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertNull(str12);
    }

    @Test
    public void test17137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17137");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        java.lang.String str1 = hikariConfig0.getConnectionInitSql();
        long long2 = hikariConfig0.getLeakDetectionThreshold();
        int int3 = hikariConfig0.getMaximumPoolSize();
        long long4 = hikariConfig0.leakDetectionThreshold;
        hikariConfig0.setInitializationFailFast(true);
        hikariConfig0.setUseInstrumentation(false);
        hikariConfig0.setConnectionCustomizerClassName("HikariPool-25");
        hikariConfig0.setMaxLifetime(5000L);
        boolean boolean13 = hikariConfig0.isReadOnly();
        hikariConfig0.acquireRetries = (byte) -1;
        hikariConfig0.leakDetectionThreshold = ' ';
        java.util.Properties properties18 = hikariConfig0.getDataSourceProperties();
        hikariConfig0.jdbcUrl = "HikariPool-642";
        java.lang.String str21 = hikariConfig0.connectionInitSql;
        hikariConfig0.connectionTestQuery = "HikariPool-33338";
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 60 + "'", int3 == 60);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(properties18);
        org.junit.Assert.assertNull(str21);
    }

    @Test
    public void test17138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17138");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        hikariConfig0.setMaxLifetime((long) (short) 10);
        com.zaxxer.hikari.HikariConfig hikariConfig3 = new com.zaxxer.hikari.HikariConfig();
        javax.sql.DataSource dataSource4 = hikariConfig3.getDataSource();
        hikariConfig3.setConnectionTestQuery("");
        hikariConfig3.setInitializationFailFast(false);
        long long9 = hikariConfig3.getConnectionTimeout();
        java.util.Properties properties10 = hikariConfig3.dataSourceProperties;
        hikariConfig0.dataSourceProperties = properties10;
        java.lang.String str12 = hikariConfig0.catalog;
        hikariConfig0.setConnectionInitSql("HikariPool-66");
        hikariConfig0.acquireRetries = 0;
        int int17 = hikariConfig0.getMinimumPoolSize();
        boolean boolean18 = hikariConfig0.isAutoCommit;
        boolean boolean19 = hikariConfig0.isReadOnly();
        boolean boolean20 = hikariConfig0.isAutoCommit;
        hikariConfig0.setInitializationFailFast(true);
        int int23 = hikariConfig0.getMaximumPoolSize();
        org.junit.Assert.assertNull(dataSource4);
// flaky:         org.junit.Assert.assertTrue("'" + long9 + "' != '" + 32L + "'", long9 == 32L);
        org.junit.Assert.assertNotNull(properties10);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 10 + "'", int17 == 10);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 60 + "'", int23 == 60);
    }

    @Test
    public void test17139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17139");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        javax.sql.DataSource dataSource1 = hikariConfig0.getDataSource();
        hikariConfig0.setConnectionTestQuery("");
        hikariConfig0.connectionCustomizerClassName = "";
        hikariConfig0.setConnectionCustomizerClassName("hi!");
        java.lang.String str8 = hikariConfig0.getCatalog();
        java.util.Properties properties9 = hikariConfig0.dataSourceProperties;
        com.zaxxer.hikari.HikariConfig hikariConfig11 = new com.zaxxer.hikari.HikariConfig();
        java.lang.String str12 = hikariConfig11.getConnectionInitSql();
        long long13 = hikariConfig11.getLeakDetectionThreshold();
        hikariConfig11.leakDetectionThreshold = (-1);
        long long16 = hikariConfig11.acquireRetryDelay;
        boolean boolean17 = hikariConfig11.isRegisterMbeans;
        hikariConfig0.addDataSourceProperty("HikariPool-47", (java.lang.Object) boolean17);
        java.util.Properties properties19 = hikariConfig0.getDataSourceProperties();
        hikariConfig0.transactionIsolationName = "HikariPool-18";
        hikariConfig0.setInitializationFailFast(true);
        boolean boolean24 = hikariConfig0.isReadOnly;
        hikariConfig0.dataSourceClassName = "HikariPool-633";
        boolean boolean27 = hikariConfig0.isAutoCommit;
        boolean boolean28 = hikariConfig0.isReadOnly();
        hikariConfig0.setIsolateInternalQueries(true);
        boolean boolean31 = hikariConfig0.isAutoCommit;
        hikariConfig0.setMinimumPoolSize((int) (short) 0);
        org.junit.Assert.assertNull(dataSource1);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNotNull(properties9);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 0L + "'", long13 == 0L);
// flaky:         org.junit.Assert.assertTrue("'" + long16 + "' != '" + 100L + "'", long16 == 100L);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(properties19);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + true + "'", boolean31 == true);
    }

    @Test
    public void test17140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17140");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        javax.sql.DataSource dataSource1 = hikariConfig0.getDataSource();
        hikariConfig0.setConnectionTestQuery("");
        hikariConfig0.setInitializationFailFast(false);
        java.lang.String str6 = hikariConfig0.getConnectionInitSql();
        hikariConfig0.setReadOnly(true);
        javax.sql.DataSource dataSource9 = null;
        hikariConfig0.setDataSource(dataSource9);
        java.util.Properties properties11 = hikariConfig0.getDataSourceProperties();
        java.lang.String str12 = hikariConfig0.connectionInitSql;
        int int13 = hikariConfig0.getMaximumPoolSize();
        hikariConfig0.setJdbcUrl("HikariPool-2046");
        hikariConfig0.setMinimumPoolSize((int) (byte) 100);
        org.junit.Assert.assertNull(dataSource1);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNotNull(properties11);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 60 + "'", int13 == 60);
    }

    @Test
    public void test17141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17141");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        java.lang.String str1 = hikariConfig0.getConnectionInitSql();
        long long2 = hikariConfig0.getLeakDetectionThreshold();
        hikariConfig0.leakDetectionThreshold = (-1);
        long long5 = hikariConfig0.acquireRetryDelay;
        int int6 = hikariConfig0.transactionIsolation;
        java.lang.String str7 = hikariConfig0.getCatalog();
        int int8 = hikariConfig0.getAcquireIncrement();
        hikariConfig0.isReadOnly = false;
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
// flaky:         org.junit.Assert.assertTrue("'" + long5 + "' != '" + 100L + "'", long5 == 100L);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
    }

    @Test
    public void test17142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17142");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        javax.sql.DataSource dataSource1 = hikariConfig0.getDataSource();
        hikariConfig0.setConnectionTestQuery("");
        hikariConfig0.connectionCustomizerClassName = "";
        hikariConfig0.setConnectionCustomizerClassName("hi!");
        java.lang.String str8 = hikariConfig0.getCatalog();
        boolean boolean9 = hikariConfig0.isRegisterMbeans;
        hikariConfig0.setAcquireRetries(0);
        long long12 = hikariConfig0.maxLifetime;
        java.lang.String str13 = hikariConfig0.getConnectionInitSql();
        hikariConfig0.setUseInstrumentation(false);
        java.lang.String str16 = hikariConfig0.getConnectionInitSql();
        com.zaxxer.hikari.IConnectionCustomizer iConnectionCustomizer17 = null;
        hikariConfig0.connectionCustomizer = iConnectionCustomizer17;
        boolean boolean19 = hikariConfig0.isIsolateInternalQueries;
        hikariConfig0.setTransactionIsolation("HikariPool-4650");
        javax.sql.DataSource dataSource22 = hikariConfig0.getDataSource();
        boolean boolean23 = hikariConfig0.isReadOnly;
        org.junit.Assert.assertNull(dataSource1);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
// flaky:         org.junit.Assert.assertTrue("'" + long12 + "' != '" + 32L + "'", long12 == 32L);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNull(dataSource22);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
    }

    @Test
    public void test17143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17143");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        javax.sql.DataSource dataSource1 = hikariConfig0.getDataSource();
        hikariConfig0.setConnectionTestQuery("");
        hikariConfig0.connectionCustomizerClassName = "";
        hikariConfig0.setConnectionCustomizerClassName("hi!");
        java.lang.String str8 = hikariConfig0.getCatalog();
        java.util.Properties properties9 = hikariConfig0.dataSourceProperties;
        com.zaxxer.hikari.HikariConfig hikariConfig11 = new com.zaxxer.hikari.HikariConfig();
        java.lang.String str12 = hikariConfig11.getConnectionInitSql();
        long long13 = hikariConfig11.getLeakDetectionThreshold();
        hikariConfig11.leakDetectionThreshold = (-1);
        long long16 = hikariConfig11.acquireRetryDelay;
        boolean boolean17 = hikariConfig11.isRegisterMbeans;
        hikariConfig0.addDataSourceProperty("HikariPool-47", (java.lang.Object) boolean17);
        hikariConfig0.setAcquireRetries((int) '#');
        javax.sql.DataSource dataSource21 = hikariConfig0.getDataSource();
        hikariConfig0.catalog = "HikariPool-111";
        long long24 = hikariConfig0.connectionTimeout;
        hikariConfig0.setAcquireRetries((int) 'a');
        java.lang.String str27 = hikariConfig0.connectionInitSql;
        boolean boolean28 = hikariConfig0.isAutoCommit();
        hikariConfig0.acquireRetries = (byte) 0;
        long long31 = hikariConfig0.getAcquireRetryDelay();
        boolean boolean32 = hikariConfig0.isJdbc4connectionTest;
        org.junit.Assert.assertNull(dataSource1);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNotNull(properties9);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 0L + "'", long13 == 0L);
// flaky:         org.junit.Assert.assertTrue("'" + long16 + "' != '" + 100L + "'", long16 == 100L);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNull(dataSource21);
// flaky:         org.junit.Assert.assertTrue("'" + long24 + "' != '" + 32L + "'", long24 == 32L);
        org.junit.Assert.assertNull(str27);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
// flaky:         org.junit.Assert.assertTrue("'" + long31 + "' != '" + 100L + "'", long31 == 100L);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + true + "'", boolean32 == true);
    }

    @Test
    public void test17144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17144");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        java.lang.String str1 = hikariConfig0.getConnectionInitSql();
        long long2 = hikariConfig0.getLeakDetectionThreshold();
        int int3 = hikariConfig0.getMaximumPoolSize();
        long long4 = hikariConfig0.leakDetectionThreshold;
        hikariConfig0.setInitializationFailFast(true);
        com.zaxxer.hikari.HikariConfig hikariConfig8 = new com.zaxxer.hikari.HikariConfig();
        javax.sql.DataSource dataSource9 = hikariConfig8.getDataSource();
        hikariConfig8.setConnectionTestQuery("");
        hikariConfig8.connectionCustomizerClassName = "";
        long long14 = hikariConfig8.getAcquireRetryDelay();
        hikariConfig8.setDataSourceClassName("HikariPool-66");
        hikariConfig8.setInitializationFailFast(false);
        hikariConfig0.addDataSourceProperty("HikariPool-62", (java.lang.Object) hikariConfig8);
        hikariConfig0.setJdbc4ConnectionTest(false);
        hikariConfig0.setMinimumPoolSize((int) 'a');
        java.lang.String str24 = hikariConfig0.connectionInitSql;
        java.lang.String str25 = hikariConfig0.poolName;
        hikariConfig0.setIsolateInternalQueries(false);
        hikariConfig0.maxPoolSize = (byte) 10;
        hikariConfig0.setConnectionCustomizerClassName("HikariPool-31916");
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 60 + "'", int3 == 60);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertNull(dataSource9);
// flaky:         org.junit.Assert.assertTrue("'" + long14 + "' != '" + 100L + "'", long14 == 100L);
        org.junit.Assert.assertNull(str24);
// flaky:         org.junit.Assert.assertEquals("'" + str25 + "' != '" + "HikariPool-42235" + "'", str25, "HikariPool-42235");
    }

    @Test
    public void test17145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17145");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        javax.sql.DataSource dataSource1 = hikariConfig0.getDataSource();
        hikariConfig0.setConnectionTestQuery("");
        hikariConfig0.connectionCustomizerClassName = "";
        hikariConfig0.setConnectionCustomizerClassName("hi!");
        java.lang.String str8 = hikariConfig0.getCatalog();
        java.util.Properties properties9 = hikariConfig0.dataSourceProperties;
        int int10 = hikariConfig0.minPoolSize;
        long long11 = hikariConfig0.getMaxLifetime();
        hikariConfig0.maxLifetime = 10L;
        hikariConfig0.setLeakDetectionThreshold((long) (byte) 1);
        hikariConfig0.isAutoCommit = false;
        java.util.Properties properties18 = hikariConfig0.dataSourceProperties;
        hikariConfig0.transactionIsolationName = "HikariPool-509";
        long long21 = hikariConfig0.getLeakDetectionThreshold();
        org.junit.Assert.assertNull(dataSource1);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNotNull(properties9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 10 + "'", int10 == 10);
// flaky:         org.junit.Assert.assertTrue("'" + long11 + "' != '" + 32L + "'", long11 == 32L);
        org.junit.Assert.assertNotNull(properties18);
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + 1L + "'", long21 == 1L);
    }

    @Test
    public void test17146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17146");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        javax.sql.DataSource dataSource1 = hikariConfig0.getDataSource();
        hikariConfig0.setConnectionTestQuery("");
        hikariConfig0.setInitializationFailFast(false);
        java.lang.String str6 = hikariConfig0.getConnectionInitSql();
        hikariConfig0.setReadOnly(true);
        javax.sql.DataSource dataSource9 = null;
        hikariConfig0.setDataSource(dataSource9);
        java.util.Properties properties11 = hikariConfig0.getDataSourceProperties();
        com.zaxxer.hikari.HikariConfig hikariConfig12 = new com.zaxxer.hikari.HikariConfig(properties11);
        hikariConfig12.isAutoCommit = true;
        org.junit.Assert.assertNull(dataSource1);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNotNull(properties11);
    }

    @Test
    public void test17147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17147");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        javax.sql.DataSource dataSource1 = hikariConfig0.getDataSource();
        hikariConfig0.setConnectionTestQuery("");
        hikariConfig0.connectionCustomizerClassName = "";
        hikariConfig0.setConnectionCustomizerClassName("hi!");
        java.lang.String str8 = hikariConfig0.getCatalog();
        java.util.Properties properties9 = hikariConfig0.dataSourceProperties;
        hikariConfig0.isInitializationFailFast = true;
        java.lang.String str12 = hikariConfig0.jdbcUrl;
        boolean boolean13 = hikariConfig0.isAutoCommit;
        long long14 = hikariConfig0.idleTimeout;
        hikariConfig0.setAcquireIncrement(1);
        java.lang.String str17 = hikariConfig0.catalog;
        int int18 = hikariConfig0.acquireRetries;
        java.lang.String str19 = hikariConfig0.getCatalog();
        java.lang.String str20 = hikariConfig0.dataSourceClassName;
        org.junit.Assert.assertNull(dataSource1);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNotNull(properties9);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
// flaky:         org.junit.Assert.assertTrue("'" + long14 + "' != '" + (-1L) + "'", long14 == (-1L));
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 3 + "'", int18 == 3);
        org.junit.Assert.assertNull(str19);
        org.junit.Assert.assertNull(str20);
    }

    @Test
    public void test17148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17148");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        java.lang.String str1 = hikariConfig0.getConnectionInitSql();
        long long2 = hikariConfig0.getLeakDetectionThreshold();
        hikariConfig0.leakDetectionThreshold = (-1);
        long long5 = hikariConfig0.acquireRetryDelay;
        boolean boolean6 = hikariConfig0.isRegisterMbeans;
        hikariConfig0.setConnectionInitSql("");
        long long9 = hikariConfig0.getAcquireRetryDelay();
        hikariConfig0.transactionIsolation = 3;
        java.lang.String str12 = hikariConfig0.connectionCustomizerClassName;
        long long13 = hikariConfig0.idleTimeout;
        long long14 = hikariConfig0.getConnectionTimeout();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
// flaky:         org.junit.Assert.assertTrue("'" + long5 + "' != '" + 100L + "'", long5 == 100L);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
// flaky:         org.junit.Assert.assertTrue("'" + long9 + "' != '" + 100L + "'", long9 == 100L);
        org.junit.Assert.assertNull(str12);
// flaky:         org.junit.Assert.assertTrue("'" + long13 + "' != '" + (-1L) + "'", long13 == (-1L));
// flaky:         org.junit.Assert.assertTrue("'" + long14 + "' != '" + 32L + "'", long14 == 32L);
    }

    @Test
    public void test17149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17149");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        javax.sql.DataSource dataSource1 = hikariConfig0.getDataSource();
        hikariConfig0.setConnectionTestQuery("");
        hikariConfig0.connectionCustomizerClassName = "";
        hikariConfig0.setConnectionCustomizerClassName("hi!");
        java.lang.String str8 = hikariConfig0.getCatalog();
        boolean boolean9 = hikariConfig0.isRegisterMbeans;
        hikariConfig0.setAcquireRetries(0);
        long long12 = hikariConfig0.getMaxLifetime();
        hikariConfig0.setReadOnly(false);
        com.zaxxer.hikari.HikariConfig hikariConfig15 = new com.zaxxer.hikari.HikariConfig();
        javax.sql.DataSource dataSource16 = hikariConfig15.getDataSource();
        hikariConfig15.setConnectionTestQuery("");
        hikariConfig15.setInitializationFailFast(false);
        hikariConfig15.catalog = "";
        com.zaxxer.hikari.HikariConfig hikariConfig23 = new com.zaxxer.hikari.HikariConfig();
        javax.sql.DataSource dataSource24 = hikariConfig23.getDataSource();
        hikariConfig23.setConnectionTestQuery("");
        hikariConfig23.connectionCustomizerClassName = "";
        hikariConfig23.setConnectionCustomizerClassName("hi!");
        java.lang.String str31 = hikariConfig23.getCatalog();
        java.util.Properties properties32 = hikariConfig23.dataSourceProperties;
        hikariConfig15.dataSourceProperties = properties32;
        hikariConfig0.setDataSourceProperties(properties32);
        com.zaxxer.hikari.IConnectionCustomizer iConnectionCustomizer35 = null;
        hikariConfig0.connectionCustomizer = iConnectionCustomizer35;
        java.lang.String str37 = hikariConfig0.getJdbcUrl();
        hikariConfig0.isReadOnly = true;
        java.lang.String str40 = hikariConfig0.getJdbcUrl();
        hikariConfig0.maxLifetime = (short) 100;
        org.junit.Assert.assertNull(dataSource1);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
// flaky:         org.junit.Assert.assertTrue("'" + long12 + "' != '" + 32L + "'", long12 == 32L);
        org.junit.Assert.assertNull(dataSource16);
        org.junit.Assert.assertNull(dataSource24);
        org.junit.Assert.assertNull(str31);
        org.junit.Assert.assertNotNull(properties32);
        org.junit.Assert.assertNull(str37);
        org.junit.Assert.assertNull(str40);
    }

    @Test
    public void test17150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17150");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        javax.sql.DataSource dataSource1 = hikariConfig0.getDataSource();
        hikariConfig0.setConnectionTestQuery("");
        hikariConfig0.connectionCustomizerClassName = "";
        hikariConfig0.setConnectionCustomizerClassName("hi!");
        java.lang.String str8 = hikariConfig0.getCatalog();
        java.util.Properties properties9 = hikariConfig0.dataSourceProperties;
        com.zaxxer.hikari.HikariConfig hikariConfig11 = new com.zaxxer.hikari.HikariConfig();
        java.lang.String str12 = hikariConfig11.getConnectionInitSql();
        long long13 = hikariConfig11.getLeakDetectionThreshold();
        hikariConfig11.leakDetectionThreshold = (-1);
        long long16 = hikariConfig11.acquireRetryDelay;
        boolean boolean17 = hikariConfig11.isRegisterMbeans;
        hikariConfig0.addDataSourceProperty("HikariPool-47", (java.lang.Object) boolean17);
        java.util.Properties properties19 = hikariConfig0.getDataSourceProperties();
        hikariConfig0.setMaxLifetime((long) 3);
        hikariConfig0.setReadOnly(true);
        hikariConfig0.poolName = "HikariPool-415";
        hikariConfig0.isIsolateInternalQueries = false;
        int int28 = hikariConfig0.getAcquireRetries();
        hikariConfig0.acquireRetries = (byte) -1;
        hikariConfig0.idleTimeout = 52L;
        org.junit.Assert.assertNull(dataSource1);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNotNull(properties9);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 0L + "'", long13 == 0L);
// flaky:         org.junit.Assert.assertTrue("'" + long16 + "' != '" + 100L + "'", long16 == 100L);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(properties19);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 3 + "'", int28 == 3);
    }

    @Test
    public void test17151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17151");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        javax.sql.DataSource dataSource1 = hikariConfig0.getDataSource();
        hikariConfig0.idleTimeout = 3;
        int int4 = hikariConfig0.getAcquireRetries();
        hikariConfig0.setDataSourceClassName("HikariPool-174");
        int int7 = hikariConfig0.maxPoolSize;
        hikariConfig0.maxPoolSize = 60;
        java.util.Properties properties10 = hikariConfig0.dataSourceProperties;
        javax.sql.DataSource dataSource11 = hikariConfig0.getDataSource();
        hikariConfig0.isJdbc4connectionTest = false;
        org.junit.Assert.assertNull(dataSource1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 3 + "'", int4 == 3);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 60 + "'", int7 == 60);
        org.junit.Assert.assertNotNull(properties10);
        org.junit.Assert.assertNull(dataSource11);
    }

    @Test
    public void test17152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17152");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        hikariConfig0.setMaxLifetime((long) (short) 10);
        int int3 = hikariConfig0.getAcquireRetries();
        boolean boolean4 = hikariConfig0.isJdbc4connectionTest;
        int int5 = hikariConfig0.acquireIncrement;
        hikariConfig0.dataSourceClassName = "HikariPool-435";
        java.lang.String str8 = hikariConfig0.getConnectionCustomizerClassName();
        hikariConfig0.setConnectionCustomizerClassName("HikariPool-20107");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 3 + "'", int3 == 3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertNull(str8);
    }

    @Test
    public void test17153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17153");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        java.lang.String str1 = hikariConfig0.getConnectionInitSql();
        long long2 = hikariConfig0.getLeakDetectionThreshold();
        int int3 = hikariConfig0.getMaximumPoolSize();
        long long4 = hikariConfig0.leakDetectionThreshold;
        hikariConfig0.setInitializationFailFast(true);
        hikariConfig0.setMaximumPoolSize(3);
        hikariConfig0.connectionCustomizerClassName = "HikariPool-35";
        int int11 = hikariConfig0.getMinimumPoolSize();
        int int12 = hikariConfig0.getAcquireIncrement();
        com.zaxxer.hikari.HikariConfig hikariConfig14 = new com.zaxxer.hikari.HikariConfig();
        javax.sql.DataSource dataSource15 = hikariConfig14.getDataSource();
        hikariConfig14.setConnectionTestQuery("");
        hikariConfig14.setInitializationFailFast(false);
        hikariConfig14.catalog = "";
        javax.sql.DataSource dataSource22 = null;
        hikariConfig14.dataSource = dataSource22;
        javax.sql.DataSource dataSource24 = null;
        hikariConfig14.dataSource = dataSource24;
        int int26 = hikariConfig14.maxPoolSize;
        long long27 = hikariConfig14.getIdleTimeout();
        hikariConfig14.connectionTestQuery = "HikariPool-47";
        java.util.Properties properties30 = null;
        hikariConfig14.dataSourceProperties = properties30;
        hikariConfig14.catalog = "HikariPool-931";
        boolean boolean34 = hikariConfig14.isIsolateInternalQueries;
        hikariConfig0.addDataSourceProperty("", (java.lang.Object) hikariConfig14);
        java.lang.String str36 = hikariConfig0.getConnectionInitSql();
        hikariConfig0.setMaxLifetime(5000L);
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 60 + "'", int3 == 60);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 10 + "'", int11 == 10);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertNull(dataSource15);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 60 + "'", int26 == 60);
// flaky:         org.junit.Assert.assertTrue("'" + long27 + "' != '" + (-1L) + "'", long27 == (-1L));
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertNull(str36);
    }

    @Test
    public void test17154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17154");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        java.lang.String str1 = hikariConfig0.getConnectionInitSql();
        long long2 = hikariConfig0.getLeakDetectionThreshold();
        hikariConfig0.leakDetectionThreshold = (-1);
        long long5 = hikariConfig0.acquireRetryDelay;
        hikariConfig0.idleTimeout = 32L;
        int int8 = hikariConfig0.acquireRetries;
        boolean boolean9 = hikariConfig0.isIsolateInternalQueries();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
// flaky:         org.junit.Assert.assertTrue("'" + long5 + "' != '" + 100L + "'", long5 == 100L);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 3 + "'", int8 == 3);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test17155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17155");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        javax.sql.DataSource dataSource1 = hikariConfig0.getDataSource();
        hikariConfig0.setConnectionTestQuery("");
        hikariConfig0.setInitializationFailFast(false);
        hikariConfig0.catalog = "";
        javax.sql.DataSource dataSource8 = null;
        hikariConfig0.dataSource = dataSource8;
        javax.sql.DataSource dataSource10 = null;
        hikariConfig0.dataSource = dataSource10;
        int int12 = hikariConfig0.maxPoolSize;
        javax.sql.DataSource dataSource13 = null;
        hikariConfig0.dataSource = dataSource13;
        java.lang.String str15 = hikariConfig0.connectionTestQuery;
        hikariConfig0.setAcquireRetries(0);
        long long18 = hikariConfig0.maxLifetime;
        hikariConfig0.catalog = "HikariPool-1175";
        hikariConfig0.connectionInitSql = "HikariPool-22715";
        org.junit.Assert.assertNull(dataSource1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 60 + "'", int12 == 60);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
// flaky:         org.junit.Assert.assertTrue("'" + long18 + "' != '" + 32L + "'", long18 == 32L);
    }

    @Test
    public void test17156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17156");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        javax.sql.DataSource dataSource1 = hikariConfig0.getDataSource();
        hikariConfig0.setConnectionTestQuery("");
        hikariConfig0.setInitializationFailFast(false);
        hikariConfig0.catalog = "";
        javax.sql.DataSource dataSource8 = hikariConfig0.getDataSource();
        boolean boolean9 = hikariConfig0.isReadOnly;
        hikariConfig0.maxPoolSize = 3;
        int int12 = hikariConfig0.getAcquireIncrement();
        java.util.Properties properties13 = hikariConfig0.getDataSourceProperties();
        boolean boolean14 = hikariConfig0.isAutoCommit;
        javax.sql.DataSource dataSource15 = null;
        hikariConfig0.setDataSource(dataSource15);
        org.junit.Assert.assertNull(dataSource1);
        org.junit.Assert.assertNull(dataSource8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertNotNull(properties13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
    }

    @Test
    public void test17157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17157");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        javax.sql.DataSource dataSource1 = hikariConfig0.getDataSource();
        hikariConfig0.setConnectionTestQuery("");
        hikariConfig0.setInitializationFailFast(false);
        hikariConfig0.catalog = "";
        int int8 = hikariConfig0.getMaximumPoolSize();
        hikariConfig0.leakDetectionThreshold = (short) 10;
        boolean boolean11 = hikariConfig0.isReadOnly;
        java.util.Properties properties12 = hikariConfig0.getDataSourceProperties();
        java.lang.String str13 = hikariConfig0.transactionIsolationName;
        hikariConfig0.jdbcUrl = "HikariPool-1542";
        java.lang.String str16 = hikariConfig0.jdbcUrl;
        org.junit.Assert.assertNull(dataSource1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 60 + "'", int8 == 60);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(properties12);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "HikariPool-1542" + "'", str16, "HikariPool-1542");
    }

    @Test
    public void test17158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17158");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        javax.sql.DataSource dataSource1 = hikariConfig0.getDataSource();
        hikariConfig0.setConnectionTestQuery("");
        hikariConfig0.connectionCustomizerClassName = "";
        hikariConfig0.setConnectionCustomizerClassName("hi!");
        java.lang.String str8 = hikariConfig0.getCatalog();
        boolean boolean9 = hikariConfig0.isRegisterMbeans;
        hikariConfig0.setAcquireRetries(0);
        hikariConfig0.setMaximumPoolSize((int) '#');
        hikariConfig0.setTransactionIsolation("hi!");
        boolean boolean16 = hikariConfig0.isInitializationFailFast();
        long long17 = hikariConfig0.getMaxLifetime();
        hikariConfig0.setTransactionIsolation("");
        hikariConfig0.connectionTestQuery = "HikariPool-833";
        int int22 = hikariConfig0.getMaximumPoolSize();
        int int23 = hikariConfig0.getAcquireRetries();
        com.zaxxer.hikari.HikariConfig hikariConfig24 = new com.zaxxer.hikari.HikariConfig();
        java.lang.String str25 = hikariConfig24.getConnectionInitSql();
        long long26 = hikariConfig24.getLeakDetectionThreshold();
        int int27 = hikariConfig24.getMaximumPoolSize();
        java.util.Properties properties28 = hikariConfig24.getDataSourceProperties();
        com.zaxxer.hikari.HikariConfig hikariConfig29 = new com.zaxxer.hikari.HikariConfig(properties28);
        hikariConfig0.dataSourceProperties = properties28;
        hikariConfig0.connectionTimeout = 32L;
        boolean boolean33 = hikariConfig0.isAutoCommit();
        org.junit.Assert.assertNull(dataSource1);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
// flaky:         org.junit.Assert.assertTrue("'" + long17 + "' != '" + 32L + "'", long17 == 32L);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 35 + "'", int22 == 35);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertNull(str25);
        org.junit.Assert.assertTrue("'" + long26 + "' != '" + 0L + "'", long26 == 0L);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 60 + "'", int27 == 60);
        org.junit.Assert.assertNotNull(properties28);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + true + "'", boolean33 == true);
    }

    @Test
    public void test17159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17159");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        javax.sql.DataSource dataSource1 = hikariConfig0.getDataSource();
        hikariConfig0.setConnectionTestQuery("");
        hikariConfig0.setInitializationFailFast(false);
        java.lang.String str6 = hikariConfig0.getConnectionInitSql();
        boolean boolean7 = hikariConfig0.isJdbc4connectionTest;
        int int8 = hikariConfig0.getMaximumPoolSize();
        javax.sql.DataSource dataSource9 = null;
        hikariConfig0.setDataSource(dataSource9);
        hikariConfig0.setCatalog("HikariPool-3534");
        hikariConfig0.maxPoolSize = (byte) 100;
        boolean boolean15 = hikariConfig0.isIsolateInternalQueries;
        java.lang.String str16 = hikariConfig0.getConnectionTestQuery();
        org.junit.Assert.assertNull(dataSource1);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 60 + "'", int8 == 60);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
    }

    @Test
    public void test17160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17160");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        java.lang.String str1 = hikariConfig0.getConnectionInitSql();
        long long2 = hikariConfig0.getLeakDetectionThreshold();
        com.zaxxer.hikari.IConnectionCustomizer iConnectionCustomizer3 = null;
        hikariConfig0.connectionCustomizer = iConnectionCustomizer3;
        boolean boolean5 = hikariConfig0.isIsolateInternalQueries();
        hikariConfig0.poolName = "HikariPool-47";
        java.lang.String str8 = hikariConfig0.transactionIsolationName;
        hikariConfig0.setMaximumPoolSize((int) (short) 10);
        java.util.Properties properties11 = hikariConfig0.getDataSourceProperties();
        hikariConfig0.dataSourceClassName = "HikariPool-215";
        boolean boolean14 = hikariConfig0.isInitializationFailFast;
        java.lang.String str15 = hikariConfig0.getPoolName();
        hikariConfig0.isAutoCommit = false;
        long long18 = hikariConfig0.getMaxLifetime();
        hikariConfig0.poolName = "HikariPool-3056";
        long long21 = hikariConfig0.idleTimeout;
        int int22 = hikariConfig0.acquireIncrement;
        java.lang.String str23 = hikariConfig0.getPoolName();
        long long24 = hikariConfig0.connectionTimeout;
        hikariConfig0.setAutoCommit(false);
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNotNull(properties11);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "HikariPool-47" + "'", str15, "HikariPool-47");
// flaky:         org.junit.Assert.assertTrue("'" + long18 + "' != '" + 32L + "'", long18 == 32L);
// flaky:         org.junit.Assert.assertTrue("'" + long21 + "' != '" + (-1L) + "'", long21 == (-1L));
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 1 + "'", int22 == 1);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "HikariPool-3056" + "'", str23, "HikariPool-3056");
// flaky:         org.junit.Assert.assertTrue("'" + long24 + "' != '" + 32L + "'", long24 == 32L);
    }

    @Test
    public void test17161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17161");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        java.lang.String str1 = hikariConfig0.getConnectionInitSql();
        long long2 = hikariConfig0.getLeakDetectionThreshold();
        com.zaxxer.hikari.IConnectionCustomizer iConnectionCustomizer3 = null;
        hikariConfig0.connectionCustomizer = iConnectionCustomizer3;
        long long5 = hikariConfig0.leakDetectionThreshold;
        com.zaxxer.hikari.IConnectionCustomizer iConnectionCustomizer6 = null;
        hikariConfig0.connectionCustomizer = iConnectionCustomizer6;
        java.lang.String str8 = hikariConfig0.getCatalog();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertNull(str8);
    }

    @Test
    public void test17162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17162");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        hikariConfig0.setMaxLifetime((long) (short) 10);
        java.lang.String str3 = hikariConfig0.getPoolName();
        hikariConfig0.jdbcUrl = "";
        hikariConfig0.setMaxLifetime(0L);
        hikariConfig0.setTransactionIsolation("HikariPool-48");
        com.zaxxer.hikari.HikariConfig hikariConfig10 = new com.zaxxer.hikari.HikariConfig();
        hikariConfig10.setMaxLifetime((long) (short) 10);
        com.zaxxer.hikari.HikariConfig hikariConfig13 = new com.zaxxer.hikari.HikariConfig();
        javax.sql.DataSource dataSource14 = hikariConfig13.getDataSource();
        hikariConfig13.setConnectionTestQuery("");
        hikariConfig13.setInitializationFailFast(false);
        long long19 = hikariConfig13.getConnectionTimeout();
        java.util.Properties properties20 = hikariConfig13.dataSourceProperties;
        hikariConfig10.dataSourceProperties = properties20;
        hikariConfig0.setDataSourceProperties(properties20);
        java.lang.String str23 = hikariConfig0.getJdbcUrl();
        javax.sql.DataSource dataSource24 = hikariConfig0.dataSource;
        java.util.Properties properties25 = hikariConfig0.dataSourceProperties;
        java.lang.String str26 = hikariConfig0.transactionIsolationName;
        hikariConfig0.idleTimeout = (short) 0;
        java.lang.String str29 = hikariConfig0.connectionInitSql;
        hikariConfig0.acquireIncrement = (byte) -1;
        javax.sql.DataSource dataSource32 = hikariConfig0.dataSource;
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "HikariPool-42264" + "'", str3, "HikariPool-42264");
        org.junit.Assert.assertNull(dataSource14);
// flaky:         org.junit.Assert.assertTrue("'" + long19 + "' != '" + 32L + "'", long19 == 32L);
        org.junit.Assert.assertNotNull(properties20);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
        org.junit.Assert.assertNull(dataSource24);
        org.junit.Assert.assertNotNull(properties25);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "HikariPool-48" + "'", str26, "HikariPool-48");
        org.junit.Assert.assertNull(str29);
        org.junit.Assert.assertNull(dataSource32);
    }

    @Test
    public void test17163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17163");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        java.lang.String str1 = hikariConfig0.getConnectionInitSql();
        long long2 = hikariConfig0.getLeakDetectionThreshold();
        hikariConfig0.leakDetectionThreshold = (-1);
        long long5 = hikariConfig0.acquireRetryDelay;
        long long6 = hikariConfig0.getIdleTimeout();
        hikariConfig0.isInitializationFailFast = true;
        java.lang.String str9 = hikariConfig0.transactionIsolationName;
        java.lang.String str10 = hikariConfig0.dataSourceClassName;
        hikariConfig0.connectionInitSql = "HikariPool-4339";
        javax.sql.DataSource dataSource13 = null;
        hikariConfig0.setDataSource(dataSource13);
        com.zaxxer.hikari.HikariConfig hikariConfig15 = new com.zaxxer.hikari.HikariConfig();
        javax.sql.DataSource dataSource16 = hikariConfig15.getDataSource();
        hikariConfig15.setConnectionTestQuery("");
        hikariConfig15.connectionCustomizerClassName = "";
        hikariConfig15.setConnectionCustomizerClassName("hi!");
        java.lang.String str23 = hikariConfig15.getCatalog();
        boolean boolean24 = hikariConfig15.isRegisterMbeans;
        hikariConfig15.setAcquireRetries(0);
        long long27 = hikariConfig15.maxLifetime;
        java.lang.String str28 = hikariConfig15.getConnectionInitSql();
        hikariConfig15.setUseInstrumentation(false);
        java.lang.String str31 = hikariConfig15.connectionTestQuery;
        java.lang.String str32 = hikariConfig15.dataSourceClassName;
        hikariConfig15.transactionIsolationName = "HikariPool-1144";
        java.lang.String str35 = hikariConfig15.getConnectionInitSql();
        java.util.Properties properties36 = hikariConfig15.getDataSourceProperties();
        com.zaxxer.hikari.HikariConfig hikariConfig37 = new com.zaxxer.hikari.HikariConfig(properties36);
        hikariConfig0.dataSourceProperties = properties36;
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
// flaky:         org.junit.Assert.assertTrue("'" + long5 + "' != '" + 100L + "'", long5 == 100L);
// flaky:         org.junit.Assert.assertTrue("'" + long6 + "' != '" + (-1L) + "'", long6 == (-1L));
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(dataSource16);
        org.junit.Assert.assertNull(str23);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
// flaky:         org.junit.Assert.assertTrue("'" + long27 + "' != '" + 32L + "'", long27 == 32L);
        org.junit.Assert.assertNull(str28);
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "" + "'", str31, "");
        org.junit.Assert.assertNull(str32);
        org.junit.Assert.assertNull(str35);
        org.junit.Assert.assertNotNull(properties36);
    }

    @Test
    public void test17164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17164");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        javax.sql.DataSource dataSource1 = hikariConfig0.getDataSource();
        hikariConfig0.setConnectionTestQuery("");
        hikariConfig0.setInitializationFailFast(false);
        hikariConfig0.catalog = "";
        com.zaxxer.hikari.HikariConfig hikariConfig8 = new com.zaxxer.hikari.HikariConfig();
        javax.sql.DataSource dataSource9 = hikariConfig8.getDataSource();
        hikariConfig8.setConnectionTestQuery("");
        hikariConfig8.connectionCustomizerClassName = "";
        hikariConfig8.setConnectionCustomizerClassName("hi!");
        java.lang.String str16 = hikariConfig8.getCatalog();
        java.util.Properties properties17 = hikariConfig8.dataSourceProperties;
        hikariConfig0.dataSourceProperties = properties17;
        hikariConfig0.connectionCustomizerClassName = "hi!";
        hikariConfig0.setTransactionIsolation("HikariPool-101");
        hikariConfig0.acquireRetries = 0;
        int int25 = hikariConfig0.getAcquireRetries();
        java.lang.String str26 = hikariConfig0.getConnectionInitSql();
        com.zaxxer.hikari.HikariConfig hikariConfig27 = new com.zaxxer.hikari.HikariConfig();
        javax.sql.DataSource dataSource28 = hikariConfig27.getDataSource();
        hikariConfig27.setConnectionTestQuery("");
        hikariConfig27.connectionCustomizerClassName = "";
        hikariConfig27.setConnectionCustomizerClassName("hi!");
        java.lang.String str35 = hikariConfig27.getCatalog();
        com.zaxxer.hikari.IConnectionCustomizer iConnectionCustomizer36 = null;
        hikariConfig27.connectionCustomizer = iConnectionCustomizer36;
        hikariConfig27.jdbcUrl = "HikariPool-16";
        hikariConfig27.connectionInitSql = "HikariPool-38";
        java.lang.String str42 = hikariConfig27.getJdbcUrl();
        com.zaxxer.hikari.HikariConfig hikariConfig43 = new com.zaxxer.hikari.HikariConfig();
        java.lang.String str44 = hikariConfig43.getConnectionInitSql();
        long long45 = hikariConfig43.getLeakDetectionThreshold();
        int int46 = hikariConfig43.getMaximumPoolSize();
        long long47 = hikariConfig43.getIdleTimeout();
        int int48 = hikariConfig43.maxPoolSize;
        java.lang.String str49 = hikariConfig43.getConnectionCustomizerClassName();
        hikariConfig43.setConnectionCustomizerClassName("HikariPool-127");
        int int52 = hikariConfig43.getAcquireIncrement();
        int int53 = hikariConfig43.maxPoolSize;
        long long54 = hikariConfig43.connectionTimeout;
        int int55 = hikariConfig43.getMaximumPoolSize();
        com.zaxxer.hikari.HikariConfig hikariConfig56 = new com.zaxxer.hikari.HikariConfig();
        java.lang.String str57 = hikariConfig56.getConnectionInitSql();
        long long58 = hikariConfig56.getLeakDetectionThreshold();
        int int59 = hikariConfig56.getMaximumPoolSize();
        long long60 = hikariConfig56.leakDetectionThreshold;
        hikariConfig56.setInitializationFailFast(true);
        com.zaxxer.hikari.HikariConfig hikariConfig64 = new com.zaxxer.hikari.HikariConfig();
        javax.sql.DataSource dataSource65 = hikariConfig64.getDataSource();
        hikariConfig64.setConnectionTestQuery("");
        hikariConfig64.connectionCustomizerClassName = "";
        long long70 = hikariConfig64.getAcquireRetryDelay();
        hikariConfig64.setDataSourceClassName("HikariPool-66");
        hikariConfig64.setInitializationFailFast(false);
        hikariConfig56.addDataSourceProperty("HikariPool-62", (java.lang.Object) hikariConfig64);
        java.util.Properties properties76 = hikariConfig64.dataSourceProperties;
        java.util.Properties properties77 = hikariConfig64.getDataSourceProperties();
        hikariConfig43.setDataSourceProperties(properties77);
        hikariConfig27.setDataSourceProperties(properties77);
        hikariConfig0.setDataSourceProperties(properties77);
        long long81 = hikariConfig0.getAcquireRetryDelay();
        hikariConfig0.setRegisterMbeans(false);
        hikariConfig0.setJdbcUrl("HikariPool-4226");
        org.junit.Assert.assertNull(dataSource1);
        org.junit.Assert.assertNull(dataSource9);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertNotNull(properties17);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertNull(str26);
        org.junit.Assert.assertNull(dataSource28);
        org.junit.Assert.assertNull(str35);
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "HikariPool-16" + "'", str42, "HikariPool-16");
        org.junit.Assert.assertNull(str44);
        org.junit.Assert.assertTrue("'" + long45 + "' != '" + 0L + "'", long45 == 0L);
        org.junit.Assert.assertTrue("'" + int46 + "' != '" + 60 + "'", int46 == 60);
// flaky:         org.junit.Assert.assertTrue("'" + long47 + "' != '" + (-1L) + "'", long47 == (-1L));
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + 60 + "'", int48 == 60);
        org.junit.Assert.assertNull(str49);
        org.junit.Assert.assertTrue("'" + int52 + "' != '" + 1 + "'", int52 == 1);
        org.junit.Assert.assertTrue("'" + int53 + "' != '" + 60 + "'", int53 == 60);
// flaky:         org.junit.Assert.assertTrue("'" + long54 + "' != '" + 32L + "'", long54 == 32L);
        org.junit.Assert.assertTrue("'" + int55 + "' != '" + 60 + "'", int55 == 60);
        org.junit.Assert.assertNull(str57);
        org.junit.Assert.assertTrue("'" + long58 + "' != '" + 0L + "'", long58 == 0L);
        org.junit.Assert.assertTrue("'" + int59 + "' != '" + 60 + "'", int59 == 60);
        org.junit.Assert.assertTrue("'" + long60 + "' != '" + 0L + "'", long60 == 0L);
        org.junit.Assert.assertNull(dataSource65);
// flaky:         org.junit.Assert.assertTrue("'" + long70 + "' != '" + 100L + "'", long70 == 100L);
        org.junit.Assert.assertNotNull(properties76);
        org.junit.Assert.assertNotNull(properties77);
// flaky:         org.junit.Assert.assertTrue("'" + long81 + "' != '" + 100L + "'", long81 == 100L);
    }

    @Test
    public void test17165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17165");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        java.lang.String str1 = hikariConfig0.getConnectionInitSql();
        long long2 = hikariConfig0.getLeakDetectionThreshold();
        hikariConfig0.leakDetectionThreshold = (-1);
        long long5 = hikariConfig0.acquireRetryDelay;
        com.zaxxer.hikari.HikariConfig hikariConfig7 = new com.zaxxer.hikari.HikariConfig();
        javax.sql.DataSource dataSource8 = hikariConfig7.getDataSource();
        hikariConfig7.setConnectionTestQuery("");
        hikariConfig7.connectionCustomizerClassName = "";
        hikariConfig7.setConnectionCustomizerClassName("hi!");
        java.lang.String str15 = hikariConfig7.getCatalog();
        boolean boolean16 = hikariConfig7.isRegisterMbeans;
        long long17 = hikariConfig7.connectionTimeout;
        hikariConfig7.setConnectionInitSql("HikariPool-48");
        hikariConfig0.addDataSourceProperty("hi!", (java.lang.Object) hikariConfig7);
        hikariConfig0.setConnectionCustomizerClassName("hi!");
        boolean boolean23 = hikariConfig0.isJdbc4connectionTest;
        hikariConfig0.setTransactionIsolation("HikariPool-137");
        boolean boolean26 = hikariConfig0.isAutoCommit;
        boolean boolean27 = hikariConfig0.isAutoCommit;
        boolean boolean28 = hikariConfig0.isRegisterMbeans;
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
// flaky:         org.junit.Assert.assertTrue("'" + long5 + "' != '" + 100L + "'", long5 == 100L);
        org.junit.Assert.assertNull(dataSource8);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
// flaky:         org.junit.Assert.assertTrue("'" + long17 + "' != '" + 32L + "'", long17 == 32L);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
    }

    @Test
    public void test17166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17166");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        javax.sql.DataSource dataSource1 = hikariConfig0.getDataSource();
        hikariConfig0.setConnectionTestQuery("");
        hikariConfig0.setInitializationFailFast(false);
        hikariConfig0.catalog = "";
        javax.sql.DataSource dataSource8 = null;
        hikariConfig0.dataSource = dataSource8;
        boolean boolean10 = hikariConfig0.isRegisterMbeans();
        boolean boolean11 = hikariConfig0.isJdbc4ConnectionTest();
        hikariConfig0.maxLifetime = 35;
        int int14 = hikariConfig0.getMinimumPoolSize();
        hikariConfig0.isInitializationFailFast = false;
        java.lang.String str17 = hikariConfig0.poolName;
        java.lang.String str18 = hikariConfig0.getConnectionCustomizerClassName();
        org.junit.Assert.assertNull(dataSource1);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 10 + "'", int14 == 10);
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "HikariPool-42278" + "'", str17, "HikariPool-42278");
        org.junit.Assert.assertNull(str18);
    }

    @Test
    public void test17167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17167");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        java.lang.String str1 = hikariConfig0.getConnectionInitSql();
        long long2 = hikariConfig0.getLeakDetectionThreshold();
        com.zaxxer.hikari.IConnectionCustomizer iConnectionCustomizer3 = null;
        hikariConfig0.connectionCustomizer = iConnectionCustomizer3;
        boolean boolean5 = hikariConfig0.isIsolateInternalQueries();
        hikariConfig0.poolName = "HikariPool-47";
        java.lang.String str8 = hikariConfig0.transactionIsolationName;
        hikariConfig0.setJdbcUrl("HikariPool-937");
        boolean boolean11 = hikariConfig0.isReadOnly;
        javax.sql.DataSource dataSource12 = null;
        hikariConfig0.dataSource = dataSource12;
        hikariConfig0.setConnectionInitSql("HikariPool-1707");
        boolean boolean16 = hikariConfig0.isJdbc4ConnectionTest();
        hikariConfig0.acquireIncrement = (byte) 0;
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
    }

    @Test
    public void test17168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17168");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        java.lang.String str1 = hikariConfig0.getConnectionInitSql();
        long long2 = hikariConfig0.getLeakDetectionThreshold();
        hikariConfig0.leakDetectionThreshold = (-1);
        long long5 = hikariConfig0.acquireRetryDelay;
        hikariConfig0.connectionTimeout = (-1L);
        int int8 = hikariConfig0.getMaximumPoolSize();
        java.util.Properties properties9 = hikariConfig0.getDataSourceProperties();
        hikariConfig0.setMaximumPoolSize((int) (byte) 100);
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
// flaky:         org.junit.Assert.assertTrue("'" + long5 + "' != '" + 100L + "'", long5 == 100L);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 60 + "'", int8 == 60);
        org.junit.Assert.assertNotNull(properties9);
    }

    @Test
    public void test17169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17169");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        javax.sql.DataSource dataSource1 = hikariConfig0.getDataSource();
        hikariConfig0.setConnectionTestQuery("");
        hikariConfig0.connectionCustomizerClassName = "";
        hikariConfig0.setConnectionCustomizerClassName("hi!");
        java.lang.String str8 = hikariConfig0.getCatalog();
        boolean boolean9 = hikariConfig0.isRegisterMbeans;
        com.zaxxer.hikari.HikariConfig hikariConfig11 = new com.zaxxer.hikari.HikariConfig();
        javax.sql.DataSource dataSource12 = hikariConfig11.getDataSource();
        hikariConfig11.setConnectionTestQuery("");
        hikariConfig11.connectionCustomizerClassName = "";
        hikariConfig11.setConnectionCustomizerClassName("hi!");
        java.lang.String str19 = hikariConfig11.getCatalog();
        boolean boolean20 = hikariConfig11.isRegisterMbeans;
        hikariConfig11.setAcquireRetries(0);
        hikariConfig11.setMaximumPoolSize((int) '#');
        hikariConfig0.addDataSourceProperty("HikariPool-47", (java.lang.Object) '#');
        hikariConfig0.setConnectionTestQuery("HikariPool-47");
        java.lang.String str28 = hikariConfig0.connectionInitSql;
        hikariConfig0.transactionIsolation = (short) 100;
        hikariConfig0.setAcquireRetries(100);
        hikariConfig0.transactionIsolationName = "HikariPool-101";
        hikariConfig0.transactionIsolation = 100;
        long long37 = hikariConfig0.maxLifetime;
        java.lang.String str38 = hikariConfig0.connectionInitSql;
        long long39 = hikariConfig0.getConnectionTimeout();
        com.zaxxer.hikari.HikariConfig hikariConfig40 = new com.zaxxer.hikari.HikariConfig();
        java.lang.String str41 = hikariConfig40.getConnectionInitSql();
        long long42 = hikariConfig40.getLeakDetectionThreshold();
        hikariConfig40.leakDetectionThreshold = (-1);
        long long45 = hikariConfig40.acquireRetryDelay;
        com.zaxxer.hikari.HikariConfig hikariConfig47 = new com.zaxxer.hikari.HikariConfig();
        javax.sql.DataSource dataSource48 = hikariConfig47.getDataSource();
        hikariConfig47.setConnectionTestQuery("");
        hikariConfig47.connectionCustomizerClassName = "";
        hikariConfig47.setConnectionCustomizerClassName("hi!");
        java.lang.String str55 = hikariConfig47.getCatalog();
        boolean boolean56 = hikariConfig47.isRegisterMbeans;
        long long57 = hikariConfig47.connectionTimeout;
        hikariConfig47.setConnectionInitSql("HikariPool-48");
        hikariConfig40.addDataSourceProperty("hi!", (java.lang.Object) hikariConfig47);
        hikariConfig40.setUseInstrumentation(false);
        java.lang.String str63 = hikariConfig40.getConnectionTestQuery();
        java.util.Properties properties64 = hikariConfig40.getDataSourceProperties();
        hikariConfig0.setDataSourceProperties(properties64);
        hikariConfig0.isIsolateInternalQueries = true;
        hikariConfig0.connectionCustomizerClassName = "HikariPool-34808";
        boolean boolean70 = hikariConfig0.isAutoCommit();
        org.junit.Assert.assertNull(dataSource1);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(dataSource12);
        org.junit.Assert.assertNull(str19);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNull(str28);
// flaky:         org.junit.Assert.assertTrue("'" + long37 + "' != '" + 32L + "'", long37 == 32L);
        org.junit.Assert.assertNull(str38);
// flaky:         org.junit.Assert.assertTrue("'" + long39 + "' != '" + 32L + "'", long39 == 32L);
        org.junit.Assert.assertNull(str41);
        org.junit.Assert.assertTrue("'" + long42 + "' != '" + 0L + "'", long42 == 0L);
// flaky:         org.junit.Assert.assertTrue("'" + long45 + "' != '" + 100L + "'", long45 == 100L);
        org.junit.Assert.assertNull(dataSource48);
        org.junit.Assert.assertNull(str55);
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + false + "'", boolean56 == false);
// flaky:         org.junit.Assert.assertTrue("'" + long57 + "' != '" + 32L + "'", long57 == 32L);
        org.junit.Assert.assertNull(str63);
        org.junit.Assert.assertNotNull(properties64);
        org.junit.Assert.assertTrue("'" + boolean70 + "' != '" + true + "'", boolean70 == true);
    }

    @Test
    public void test17170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17170");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        javax.sql.DataSource dataSource1 = hikariConfig0.getDataSource();
        hikariConfig0.setConnectionTestQuery("");
        hikariConfig0.connectionCustomizerClassName = "";
        long long6 = hikariConfig0.getAcquireRetryDelay();
        hikariConfig0.setDataSourceClassName("HikariPool-66");
        hikariConfig0.setReadOnly(true);
        java.util.Properties properties11 = hikariConfig0.dataSourceProperties;
        boolean boolean12 = hikariConfig0.isIsolateInternalQueries();
        java.lang.String str13 = hikariConfig0.connectionTestQuery;
        org.junit.Assert.assertNull(dataSource1);
// flaky:         org.junit.Assert.assertTrue("'" + long6 + "' != '" + 100L + "'", long6 == 100L);
        org.junit.Assert.assertNotNull(properties11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
    }

    @Test
    public void test17171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17171");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        javax.sql.DataSource dataSource1 = hikariConfig0.getDataSource();
        hikariConfig0.idleTimeout = 3;
        int int4 = hikariConfig0.getAcquireRetries();
        hikariConfig0.setDataSourceClassName("HikariPool-174");
        int int7 = hikariConfig0.maxPoolSize;
        hikariConfig0.transactionIsolation = ' ';
        long long10 = hikariConfig0.maxLifetime;
        com.zaxxer.hikari.IConnectionCustomizer iConnectionCustomizer11 = hikariConfig0.connectionCustomizer;
        org.junit.Assert.assertNull(dataSource1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 3 + "'", int4 == 3);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 60 + "'", int7 == 60);
// flaky:         org.junit.Assert.assertTrue("'" + long10 + "' != '" + 32L + "'", long10 == 32L);
        org.junit.Assert.assertNull(iConnectionCustomizer11);
    }

    @Test
    public void test17172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17172");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        javax.sql.DataSource dataSource1 = hikariConfig0.getDataSource();
        hikariConfig0.setConnectionTestQuery("");
        hikariConfig0.connectionCustomizerClassName = "";
        hikariConfig0.setConnectionCustomizerClassName("hi!");
        java.lang.String str8 = hikariConfig0.getCatalog();
        boolean boolean9 = hikariConfig0.isRegisterMbeans;
        hikariConfig0.setAcquireRetries(0);
        hikariConfig0.setMaximumPoolSize((int) '#');
        hikariConfig0.setTransactionIsolation("hi!");
        boolean boolean16 = hikariConfig0.isReadOnly();
        hikariConfig0.setPoolName("HikariPool-538");
        java.lang.String str19 = hikariConfig0.getDataSourceClassName();
        int int20 = hikariConfig0.minPoolSize;
        com.zaxxer.hikari.IConnectionCustomizer iConnectionCustomizer21 = null;
        hikariConfig0.connectionCustomizer = iConnectionCustomizer21;
        java.lang.String str23 = hikariConfig0.catalog;
        org.junit.Assert.assertNull(dataSource1);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNull(str19);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 10 + "'", int20 == 10);
        org.junit.Assert.assertNull(str23);
    }

    @Test
    public void test17173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17173");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        javax.sql.DataSource dataSource1 = hikariConfig0.getDataSource();
        hikariConfig0.setConnectionTestQuery("");
        hikariConfig0.setInitializationFailFast(false);
        hikariConfig0.jdbcUrl = "HikariPool-16";
        long long8 = hikariConfig0.leakDetectionThreshold;
        hikariConfig0.setPoolName("HikariPool-474");
        long long11 = hikariConfig0.idleTimeout;
        hikariConfig0.setRegisterMbeans(true);
        org.junit.Assert.assertNull(dataSource1);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
// flaky:         org.junit.Assert.assertTrue("'" + long11 + "' != '" + (-1L) + "'", long11 == (-1L));
    }

    @Test
    public void test17174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17174");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        javax.sql.DataSource dataSource1 = hikariConfig0.getDataSource();
        hikariConfig0.setConnectionTestQuery("");
        hikariConfig0.connectionCustomizerClassName = "";
        hikariConfig0.setConnectionCustomizerClassName("hi!");
        java.lang.String str8 = hikariConfig0.getCatalog();
        hikariConfig0.jdbcUrl = "HikariPool-7393";
        hikariConfig0.maxLifetime = (-1);
        org.junit.Assert.assertNull(dataSource1);
        org.junit.Assert.assertNull(str8);
    }

    @Test
    public void test17175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17175");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        javax.sql.DataSource dataSource1 = hikariConfig0.getDataSource();
        hikariConfig0.setConnectionTestQuery("");
        hikariConfig0.setInitializationFailFast(false);
        long long6 = hikariConfig0.getConnectionTimeout();
        hikariConfig0.setJdbcUrl("HikariPool-47");
        hikariConfig0.isIsolateInternalQueries = false;
        hikariConfig0.setIsolateInternalQueries(true);
        java.lang.String str13 = hikariConfig0.getJdbcUrl();
        hikariConfig0.isIsolateInternalQueries = false;
        hikariConfig0.connectionTimeout = 1;
        hikariConfig0.setMinimumPoolSize((int) (byte) 100);
        hikariConfig0.isIsolateInternalQueries = true;
        java.lang.String str22 = hikariConfig0.connectionInitSql;
        java.lang.String str23 = hikariConfig0.getJdbcUrl();
        hikariConfig0.setReadOnly(false);
        // The following exception was thrown during execution in test generation
        try {
            hikariConfig0.setDriverClassName("HikariPool-11299");
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException; message: driverClassName specified class 'HikariPool-11299' could not be loaded");
        } catch (java.lang.RuntimeException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(dataSource1);
// flaky:         org.junit.Assert.assertTrue("'" + long6 + "' != '" + 32L + "'", long6 == 32L);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "HikariPool-47" + "'", str13, "HikariPool-47");
        org.junit.Assert.assertNull(str22);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "HikariPool-47" + "'", str23, "HikariPool-47");
    }

    @Test
    public void test17176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17176");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        java.lang.String str1 = hikariConfig0.getConnectionInitSql();
        long long2 = hikariConfig0.getLeakDetectionThreshold();
        int int3 = hikariConfig0.getMaximumPoolSize();
        long long4 = hikariConfig0.acquireRetryDelay;
        int int5 = hikariConfig0.acquireIncrement;
        boolean boolean6 = hikariConfig0.isRegisterMbeans;
        hikariConfig0.leakDetectionThreshold = 52;
        hikariConfig0.catalog = "HikariPool-3091";
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 60 + "'", int3 == 60);
// flaky:         org.junit.Assert.assertTrue("'" + long4 + "' != '" + 100L + "'", long4 == 100L);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test17177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17177");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        java.lang.String str1 = hikariConfig0.getConnectionInitSql();
        long long2 = hikariConfig0.getLeakDetectionThreshold();
        com.zaxxer.hikari.IConnectionCustomizer iConnectionCustomizer3 = null;
        hikariConfig0.connectionCustomizer = iConnectionCustomizer3;
        boolean boolean5 = hikariConfig0.isIsolateInternalQueries();
        hikariConfig0.poolName = "HikariPool-47";
        hikariConfig0.isReadOnly = false;
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test17178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17178");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        javax.sql.DataSource dataSource1 = hikariConfig0.getDataSource();
        hikariConfig0.setConnectionTestQuery("");
        hikariConfig0.connectionCustomizerClassName = "";
        hikariConfig0.setConnectionCustomizerClassName("hi!");
        java.lang.String str8 = hikariConfig0.getCatalog();
        com.zaxxer.hikari.IConnectionCustomizer iConnectionCustomizer9 = null;
        hikariConfig0.connectionCustomizer = iConnectionCustomizer9;
        hikariConfig0.setJdbcUrl("");
        hikariConfig0.setAutoCommit(false);
        hikariConfig0.setJdbc4ConnectionTest(true);
        java.lang.String str17 = hikariConfig0.getCatalog();
        hikariConfig0.isAutoCommit = false;
        org.junit.Assert.assertNull(dataSource1);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str17);
    }

    @Test
    public void test17179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17179");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        javax.sql.DataSource dataSource1 = hikariConfig0.getDataSource();
        hikariConfig0.setConnectionTestQuery("");
        hikariConfig0.setInitializationFailFast(false);
        hikariConfig0.catalog = "";
        int int8 = hikariConfig0.getMaximumPoolSize();
        hikariConfig0.leakDetectionThreshold = (short) 10;
        hikariConfig0.isJdbc4connectionTest = true;
        boolean boolean13 = hikariConfig0.isReadOnly();
        java.lang.String str14 = hikariConfig0.getConnectionInitSql();
        long long15 = hikariConfig0.acquireRetryDelay;
        boolean boolean16 = hikariConfig0.isReadOnly();
        long long17 = hikariConfig0.getIdleTimeout();
        java.lang.String str18 = hikariConfig0.getConnectionInitSql();
        boolean boolean19 = hikariConfig0.isIsolateInternalQueries();
        java.lang.String str20 = hikariConfig0.transactionIsolationName;
        java.util.Properties properties21 = hikariConfig0.getDataSourceProperties();
        org.junit.Assert.assertNull(dataSource1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 60 + "'", int8 == 60);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNull(str14);
// flaky:         org.junit.Assert.assertTrue("'" + long15 + "' != '" + 100L + "'", long15 == 100L);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
// flaky:         org.junit.Assert.assertTrue("'" + long17 + "' != '" + (-1L) + "'", long17 == (-1L));
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNull(str20);
        org.junit.Assert.assertNotNull(properties21);
    }

    @Test
    public void test17180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17180");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        java.lang.String str1 = hikariConfig0.getConnectionInitSql();
        long long2 = hikariConfig0.getLeakDetectionThreshold();
        int int3 = hikariConfig0.getMaximumPoolSize();
        long long4 = hikariConfig0.getIdleTimeout();
        int int5 = hikariConfig0.maxPoolSize;
        java.lang.String str6 = hikariConfig0.getConnectionCustomizerClassName();
        hikariConfig0.setConnectionCustomizerClassName("HikariPool-127");
        hikariConfig0.isIsolateInternalQueries = true;
        hikariConfig0.setMaximumPoolSize((int) '4');
        com.zaxxer.hikari.HikariConfig hikariConfig13 = new com.zaxxer.hikari.HikariConfig();
        hikariConfig13.setMaxLifetime((long) (short) 10);
        com.zaxxer.hikari.HikariConfig hikariConfig16 = new com.zaxxer.hikari.HikariConfig();
        javax.sql.DataSource dataSource17 = hikariConfig16.getDataSource();
        hikariConfig16.setConnectionTestQuery("");
        hikariConfig16.setInitializationFailFast(false);
        long long22 = hikariConfig16.getConnectionTimeout();
        java.util.Properties properties23 = hikariConfig16.dataSourceProperties;
        hikariConfig13.dataSourceProperties = properties23;
        hikariConfig0.setDataSourceProperties(properties23);
        com.zaxxer.hikari.HikariConfig hikariConfig26 = new com.zaxxer.hikari.HikariConfig(properties23);
        boolean boolean27 = hikariConfig26.isReadOnly();
        hikariConfig26.setDataSourceClassName("HikariPool-978");
        hikariConfig26.connectionCustomizerClassName = "HikariPool-149";
        javax.sql.DataSource dataSource32 = hikariConfig26.getDataSource();
        java.lang.String str33 = hikariConfig26.getConnectionCustomizerClassName();
        boolean boolean34 = hikariConfig26.isRegisterMbeans;
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 60 + "'", int3 == 60);
// flaky:         org.junit.Assert.assertTrue("'" + long4 + "' != '" + (-1L) + "'", long4 == (-1L));
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 60 + "'", int5 == 60);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(dataSource17);
// flaky:         org.junit.Assert.assertTrue("'" + long22 + "' != '" + 32L + "'", long22 == 32L);
        org.junit.Assert.assertNotNull(properties23);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNull(dataSource32);
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "HikariPool-149" + "'", str33, "HikariPool-149");
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
    }

    @Test
    public void test17181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17181");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        javax.sql.DataSource dataSource1 = hikariConfig0.getDataSource();
        hikariConfig0.setConnectionTestQuery("");
        hikariConfig0.connectionCustomizerClassName = "";
        hikariConfig0.setConnectionCustomizerClassName("hi!");
        java.lang.String str8 = hikariConfig0.getCatalog();
        java.util.Properties properties9 = hikariConfig0.dataSourceProperties;
        int int10 = hikariConfig0.minPoolSize;
        long long11 = hikariConfig0.getMaxLifetime();
        long long12 = hikariConfig0.acquireRetryDelay;
        long long13 = hikariConfig0.idleTimeout;
        java.lang.String str14 = hikariConfig0.transactionIsolationName;
        com.zaxxer.hikari.HikariConfig hikariConfig16 = new com.zaxxer.hikari.HikariConfig();
        javax.sql.DataSource dataSource17 = hikariConfig16.getDataSource();
        hikariConfig16.setConnectionTestQuery("");
        hikariConfig16.connectionCustomizerClassName = "";
        hikariConfig16.setConnectionCustomizerClassName("hi!");
        java.lang.String str24 = hikariConfig16.getCatalog();
        boolean boolean25 = hikariConfig16.isRegisterMbeans;
        com.zaxxer.hikari.HikariConfig hikariConfig27 = new com.zaxxer.hikari.HikariConfig();
        javax.sql.DataSource dataSource28 = hikariConfig27.getDataSource();
        hikariConfig27.setConnectionTestQuery("");
        hikariConfig27.connectionCustomizerClassName = "";
        hikariConfig27.setConnectionCustomizerClassName("hi!");
        java.lang.String str35 = hikariConfig27.getCatalog();
        boolean boolean36 = hikariConfig27.isRegisterMbeans;
        hikariConfig27.setAcquireRetries(0);
        hikariConfig27.setMaximumPoolSize((int) '#');
        hikariConfig16.addDataSourceProperty("HikariPool-47", (java.lang.Object) '#');
        hikariConfig16.setConnectionTestQuery("HikariPool-47");
        java.lang.String str44 = hikariConfig16.connectionInitSql;
        hikariConfig16.transactionIsolation = (short) 100;
        hikariConfig16.setAcquireRetries(100);
        hikariConfig16.transactionIsolationName = "HikariPool-101";
        java.util.Properties properties51 = hikariConfig16.getDataSourceProperties();
        hikariConfig0.addDataSourceProperty("HikariPool-910", (java.lang.Object) hikariConfig16);
        java.lang.String str53 = hikariConfig0.connectionCustomizerClassName;
        org.junit.Assert.assertNull(dataSource1);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNotNull(properties9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 10 + "'", int10 == 10);
// flaky:         org.junit.Assert.assertTrue("'" + long11 + "' != '" + 32L + "'", long11 == 32L);
// flaky:         org.junit.Assert.assertTrue("'" + long12 + "' != '" + 100L + "'", long12 == 100L);
// flaky:         org.junit.Assert.assertTrue("'" + long13 + "' != '" + (-1L) + "'", long13 == (-1L));
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNull(dataSource17);
        org.junit.Assert.assertNull(str24);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNull(dataSource28);
        org.junit.Assert.assertNull(str35);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertNull(str44);
        org.junit.Assert.assertNotNull(properties51);
        org.junit.Assert.assertEquals("'" + str53 + "' != '" + "hi!" + "'", str53, "hi!");
    }

    @Test
    public void test17182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17182");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        java.lang.String str1 = hikariConfig0.getConnectionInitSql();
        long long2 = hikariConfig0.getLeakDetectionThreshold();
        int int3 = hikariConfig0.getMaximumPoolSize();
        long long4 = hikariConfig0.leakDetectionThreshold;
        long long5 = hikariConfig0.getConnectionTimeout();
        hikariConfig0.setAcquireIncrement((int) ' ');
        hikariConfig0.setDataSourceClassName("HikariPool-686");
        hikariConfig0.setConnectionInitSql("HikariPool-3685");
        hikariConfig0.setIsolateInternalQueries(false);
        hikariConfig0.connectionInitSql = "HikariPool-7450";
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 60 + "'", int3 == 60);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
// flaky:         org.junit.Assert.assertTrue("'" + long5 + "' != '" + 32L + "'", long5 == 32L);
    }

    @Test
    public void test17183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17183");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        java.lang.String str1 = hikariConfig0.getConnectionInitSql();
        long long2 = hikariConfig0.getLeakDetectionThreshold();
        hikariConfig0.setTransactionIsolation("");
        boolean boolean5 = hikariConfig0.isInitializationFailFast();
        java.lang.String str6 = hikariConfig0.transactionIsolationName;
        com.zaxxer.hikari.IConnectionCustomizer iConnectionCustomizer7 = hikariConfig0.connectionCustomizer;
        hikariConfig0.setDataSourceClassName("HikariPool-3675");
        com.zaxxer.hikari.IConnectionCustomizer iConnectionCustomizer10 = hikariConfig0.connectionCustomizer;
        long long11 = hikariConfig0.connectionTimeout;
        long long12 = hikariConfig0.getIdleTimeout();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNull(iConnectionCustomizer7);
        org.junit.Assert.assertNull(iConnectionCustomizer10);
// flaky:         org.junit.Assert.assertTrue("'" + long11 + "' != '" + 32L + "'", long11 == 32L);
// flaky:         org.junit.Assert.assertTrue("'" + long12 + "' != '" + (-1L) + "'", long12 == (-1L));
    }

    @Test
    public void test17184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17184");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        javax.sql.DataSource dataSource1 = hikariConfig0.getDataSource();
        hikariConfig0.setConnectionTestQuery("");
        long long4 = hikariConfig0.leakDetectionThreshold;
        java.lang.String str5 = hikariConfig0.getConnectionInitSql();
        long long6 = hikariConfig0.getMaxLifetime();
        java.lang.Class<?> wildcardClass7 = hikariConfig0.getClass();
        org.junit.Assert.assertNull(dataSource1);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertNull(str5);
// flaky:         org.junit.Assert.assertTrue("'" + long6 + "' != '" + 32L + "'", long6 == 32L);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test17185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17185");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        javax.sql.DataSource dataSource1 = hikariConfig0.getDataSource();
        hikariConfig0.setConnectionTestQuery("");
        hikariConfig0.setInitializationFailFast(false);
        long long6 = hikariConfig0.getConnectionTimeout();
        java.util.Properties properties7 = hikariConfig0.dataSourceProperties;
        int int8 = hikariConfig0.maxPoolSize;
        boolean boolean9 = hikariConfig0.isInitializationFailFast();
        java.util.Properties properties10 = hikariConfig0.dataSourceProperties;
        java.lang.String str11 = hikariConfig0.catalog;
        hikariConfig0.setJdbc4ConnectionTest(false);
        hikariConfig0.setPoolName("HikariPool-2646");
        hikariConfig0.acquireIncrement = 100;
        boolean boolean18 = hikariConfig0.isIsolateInternalQueries();
        org.junit.Assert.assertNull(dataSource1);
// flaky:         org.junit.Assert.assertTrue("'" + long6 + "' != '" + 32L + "'", long6 == 32L);
        org.junit.Assert.assertNotNull(properties7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 60 + "'", int8 == 60);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(properties10);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test17186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17186");
        // The following exception was thrown during execution in test generation
        try {
            com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig("HikariPool-16995");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Property file HikariPool-16995 was not found.");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test17187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17187");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        java.lang.String str1 = hikariConfig0.getConnectionInitSql();
        com.zaxxer.hikari.IConnectionCustomizer iConnectionCustomizer2 = null;
        hikariConfig0.connectionCustomizer = iConnectionCustomizer2;
        javax.sql.DataSource dataSource4 = hikariConfig0.getDataSource();
        java.lang.String str5 = hikariConfig0.dataSourceClassName;
        hikariConfig0.setUseInstrumentation(false);
        java.lang.String str8 = hikariConfig0.transactionIsolationName;
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(dataSource4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str8);
    }

    @Test
    public void test17188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17188");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        javax.sql.DataSource dataSource1 = hikariConfig0.getDataSource();
        hikariConfig0.setConnectionTestQuery("");
        hikariConfig0.setInitializationFailFast(false);
        hikariConfig0.catalog = "";
        javax.sql.DataSource dataSource8 = null;
        hikariConfig0.dataSource = dataSource8;
        javax.sql.DataSource dataSource10 = null;
        hikariConfig0.dataSource = dataSource10;
        int int12 = hikariConfig0.maxPoolSize;
        long long13 = hikariConfig0.getIdleTimeout();
        javax.sql.DataSource dataSource14 = hikariConfig0.dataSource;
        int int15 = hikariConfig0.transactionIsolation;
        hikariConfig0.connectionCustomizerClassName = "HikariPool-25760";
        org.junit.Assert.assertNull(dataSource1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 60 + "'", int12 == 60);
// flaky:         org.junit.Assert.assertTrue("'" + long13 + "' != '" + (-1L) + "'", long13 == (-1L));
        org.junit.Assert.assertNull(dataSource14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
    }

    @Test
    public void test17189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17189");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        javax.sql.DataSource dataSource1 = hikariConfig0.getDataSource();
        hikariConfig0.setConnectionTestQuery("");
        hikariConfig0.setInitializationFailFast(false);
        hikariConfig0.catalog = "";
        com.zaxxer.hikari.HikariConfig hikariConfig8 = new com.zaxxer.hikari.HikariConfig();
        javax.sql.DataSource dataSource9 = hikariConfig8.getDataSource();
        hikariConfig8.setConnectionTestQuery("");
        hikariConfig8.connectionCustomizerClassName = "";
        hikariConfig8.setConnectionCustomizerClassName("hi!");
        java.lang.String str16 = hikariConfig8.getCatalog();
        java.util.Properties properties17 = hikariConfig8.dataSourceProperties;
        hikariConfig0.dataSourceProperties = properties17;
        hikariConfig0.connectionCustomizerClassName = "hi!";
        int int21 = hikariConfig0.maxPoolSize;
        java.lang.String str22 = hikariConfig0.connectionInitSql;
        hikariConfig0.transactionIsolation = (short) 10;
        java.lang.String str25 = hikariConfig0.getDataSourceClassName();
        hikariConfig0.minPoolSize = 0;
        int int28 = hikariConfig0.transactionIsolation;
        javax.sql.DataSource dataSource29 = null;
        hikariConfig0.dataSource = dataSource29;
        org.junit.Assert.assertNull(dataSource1);
        org.junit.Assert.assertNull(dataSource9);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertNotNull(properties17);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 60 + "'", int21 == 60);
        org.junit.Assert.assertNull(str22);
        org.junit.Assert.assertNull(str25);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 10 + "'", int28 == 10);
    }

    @Test
    public void test17190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17190");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        java.lang.String str1 = hikariConfig0.getConnectionInitSql();
        long long2 = hikariConfig0.getLeakDetectionThreshold();
        hikariConfig0.leakDetectionThreshold = (-1);
        long long5 = hikariConfig0.acquireRetryDelay;
        long long6 = hikariConfig0.getIdleTimeout();
        long long7 = hikariConfig0.idleTimeout;
        java.lang.String str8 = hikariConfig0.connectionInitSql;
        java.lang.String str9 = hikariConfig0.getConnectionTestQuery();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
// flaky:         org.junit.Assert.assertTrue("'" + long5 + "' != '" + 100L + "'", long5 == 100L);
// flaky:         org.junit.Assert.assertTrue("'" + long6 + "' != '" + (-1L) + "'", long6 == (-1L));
// flaky:         org.junit.Assert.assertTrue("'" + long7 + "' != '" + (-1L) + "'", long7 == (-1L));
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str9);
    }

    @Test
    public void test17191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17191");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        javax.sql.DataSource dataSource1 = hikariConfig0.getDataSource();
        hikariConfig0.setConnectionTestQuery("");
        hikariConfig0.setInitializationFailFast(false);
        hikariConfig0.catalog = "";
        int int8 = hikariConfig0.getMaximumPoolSize();
        hikariConfig0.isRegisterMbeans = false;
        hikariConfig0.setTransactionIsolation("HikariPool-62");
        java.lang.String str13 = hikariConfig0.getConnectionTestQuery();
        hikariConfig0.setAcquireIncrement(35);
        hikariConfig0.acquireRetries = (byte) -1;
        org.junit.Assert.assertNull(dataSource1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 60 + "'", int8 == 60);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
    }

    @Test
    public void test17192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17192");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        hikariConfig0.setMaxLifetime((long) (short) 10);
        com.zaxxer.hikari.IConnectionCustomizer iConnectionCustomizer3 = hikariConfig0.connectionCustomizer;
        hikariConfig0.setDataSourceClassName("HikariPool-47");
        hikariConfig0.setDataSourceClassName("HikariPool-18");
        hikariConfig0.transactionIsolation = 1;
        hikariConfig0.setConnectionTestQuery("HikariPool-86");
        com.zaxxer.hikari.HikariConfig hikariConfig12 = new com.zaxxer.hikari.HikariConfig();
        java.lang.String str13 = hikariConfig12.getConnectionInitSql();
        hikariConfig12.setMaxLifetime(35L);
        hikariConfig12.setMaxLifetime(0L);
        hikariConfig12.transactionIsolation = 0;
        com.zaxxer.hikari.HikariConfig hikariConfig20 = new com.zaxxer.hikari.HikariConfig();
        hikariConfig20.setMaxLifetime((long) (short) 10);
        hikariConfig20.setConnectionTimeout(0L);
        com.zaxxer.hikari.HikariConfig hikariConfig25 = new com.zaxxer.hikari.HikariConfig();
        javax.sql.DataSource dataSource26 = hikariConfig25.getDataSource();
        hikariConfig25.setConnectionTestQuery("");
        com.zaxxer.hikari.HikariConfig hikariConfig29 = new com.zaxxer.hikari.HikariConfig();
        javax.sql.DataSource dataSource30 = hikariConfig29.getDataSource();
        hikariConfig29.setConnectionTestQuery("");
        hikariConfig29.setInitializationFailFast(false);
        long long35 = hikariConfig29.getConnectionTimeout();
        java.util.Properties properties36 = hikariConfig29.dataSourceProperties;
        hikariConfig25.setDataSourceProperties(properties36);
        hikariConfig20.setDataSourceProperties(properties36);
        hikariConfig12.dataSourceProperties = properties36;
        hikariConfig0.setDataSourceProperties(properties36);
        hikariConfig0.acquireRetries = '4';
        hikariConfig0.minPoolSize = (short) 1;
        hikariConfig0.setUseInstrumentation(true);
        hikariConfig0.setReadOnly(false);
        hikariConfig0.isIsolateInternalQueries = false;
        org.junit.Assert.assertNull(iConnectionCustomizer3);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNull(dataSource26);
        org.junit.Assert.assertNull(dataSource30);
// flaky:         org.junit.Assert.assertTrue("'" + long35 + "' != '" + 32L + "'", long35 == 32L);
        org.junit.Assert.assertNotNull(properties36);
    }

    @Test
    public void test17193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17193");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        javax.sql.DataSource dataSource1 = hikariConfig0.getDataSource();
        hikariConfig0.setConnectionTestQuery("");
        hikariConfig0.connectionCustomizerClassName = "";
        hikariConfig0.setConnectionCustomizerClassName("hi!");
        java.lang.String str8 = hikariConfig0.getCatalog();
        boolean boolean9 = hikariConfig0.isRegisterMbeans;
        hikariConfig0.setAcquireRetries(0);
        long long12 = hikariConfig0.maxLifetime;
        java.lang.String str13 = hikariConfig0.getConnectionInitSql();
        com.zaxxer.hikari.IConnectionCustomizer iConnectionCustomizer14 = hikariConfig0.connectionCustomizer;
        java.lang.String str15 = hikariConfig0.getConnectionCustomizerClassName();
        boolean boolean16 = hikariConfig0.isJdbc4connectionTest;
        long long17 = hikariConfig0.getMaxLifetime();
        hikariConfig0.setMaximumPoolSize(0);
        java.lang.String str20 = hikariConfig0.catalog;
        java.lang.String str21 = hikariConfig0.jdbcUrl;
        org.junit.Assert.assertNull(dataSource1);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
// flaky:         org.junit.Assert.assertTrue("'" + long12 + "' != '" + 32L + "'", long12 == 32L);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNull(iConnectionCustomizer14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
// flaky:         org.junit.Assert.assertTrue("'" + long17 + "' != '" + 32L + "'", long17 == 32L);
        org.junit.Assert.assertNull(str20);
        org.junit.Assert.assertNull(str21);
    }

    @Test
    public void test17194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17194");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        javax.sql.DataSource dataSource1 = hikariConfig0.getDataSource();
        hikariConfig0.setConnectionTestQuery("");
        hikariConfig0.connectionCustomizerClassName = "";
        hikariConfig0.setConnectionCustomizerClassName("hi!");
        java.lang.String str8 = hikariConfig0.getCatalog();
        boolean boolean9 = hikariConfig0.isRegisterMbeans;
        hikariConfig0.setAcquireRetries(0);
        long long12 = hikariConfig0.getMaxLifetime();
        hikariConfig0.setReadOnly(false);
        hikariConfig0.isInitializationFailFast = false;
        hikariConfig0.setConnectionCustomizerClassName("HikariPool-111");
        java.lang.String str19 = hikariConfig0.getDataSourceClassName();
        int int20 = hikariConfig0.minPoolSize;
        hikariConfig0.setJdbc4ConnectionTest(false);
        hikariConfig0.setIsolateInternalQueries(true);
        org.junit.Assert.assertNull(dataSource1);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
// flaky:         org.junit.Assert.assertTrue("'" + long12 + "' != '" + 32L + "'", long12 == 32L);
        org.junit.Assert.assertNull(str19);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 10 + "'", int20 == 10);
    }

    @Test
    public void test17195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17195");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        hikariConfig0.setMaxLifetime((long) (short) 10);
        com.zaxxer.hikari.HikariConfig hikariConfig3 = new com.zaxxer.hikari.HikariConfig();
        javax.sql.DataSource dataSource4 = hikariConfig3.getDataSource();
        hikariConfig3.setConnectionTestQuery("");
        hikariConfig3.setInitializationFailFast(false);
        long long9 = hikariConfig3.getConnectionTimeout();
        java.util.Properties properties10 = hikariConfig3.dataSourceProperties;
        hikariConfig0.dataSourceProperties = properties10;
        hikariConfig0.maxLifetime = 750L;
        hikariConfig0.minPoolSize = (short) 100;
        java.lang.String str16 = hikariConfig0.getConnectionCustomizerClassName();
        hikariConfig0.maxPoolSize = (short) 0;
        long long19 = hikariConfig0.acquireRetryDelay;
        hikariConfig0.minPoolSize = 1;
        boolean boolean22 = hikariConfig0.isReadOnly();
        org.junit.Assert.assertNull(dataSource4);
// flaky:         org.junit.Assert.assertTrue("'" + long9 + "' != '" + 32L + "'", long9 == 32L);
        org.junit.Assert.assertNotNull(properties10);
        org.junit.Assert.assertNull(str16);
// flaky:         org.junit.Assert.assertTrue("'" + long19 + "' != '" + 100L + "'", long19 == 100L);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
    }

    @Test
    public void test17196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17196");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        java.lang.String str1 = hikariConfig0.getConnectionInitSql();
        long long2 = hikariConfig0.getLeakDetectionThreshold();
        int int3 = hikariConfig0.getMaximumPoolSize();
        long long4 = hikariConfig0.leakDetectionThreshold;
        hikariConfig0.catalog = "HikariPool-62";
        boolean boolean7 = hikariConfig0.isJdbc4connectionTest;
        int int8 = hikariConfig0.acquireRetries;
        hikariConfig0.transactionIsolationName = "HikariPool-66";
        hikariConfig0.setIsolateInternalQueries(true);
        hikariConfig0.setConnectionTestQuery("HikariPool-8536");
        int int15 = hikariConfig0.acquireIncrement;
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 60 + "'", int3 == 60);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 3 + "'", int8 == 3);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
    }

    @Test
    public void test17197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17197");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        javax.sql.DataSource dataSource1 = hikariConfig0.getDataSource();
        hikariConfig0.setConnectionTestQuery("");
        hikariConfig0.setInitializationFailFast(false);
        hikariConfig0.isAutoCommit = false;
        java.lang.String str8 = hikariConfig0.dataSourceClassName;
        hikariConfig0.isReadOnly = false;
        hikariConfig0.maxPoolSize = 97;
        hikariConfig0.dataSourceClassName = "HikariPool-3396";
        hikariConfig0.maxPoolSize = 10;
        org.junit.Assert.assertNull(dataSource1);
        org.junit.Assert.assertNull(str8);
    }

    @Test
    public void test17198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17198");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        java.lang.String str1 = hikariConfig0.getConnectionInitSql();
        long long2 = hikariConfig0.getLeakDetectionThreshold();
        int int3 = hikariConfig0.getMaximumPoolSize();
        long long4 = hikariConfig0.getConnectionTimeout();
        hikariConfig0.setUseInstrumentation(true);
        java.lang.String str7 = hikariConfig0.getJdbcUrl();
        int int8 = hikariConfig0.getMaximumPoolSize();
        hikariConfig0.setMaxLifetime((long) (byte) 10);
        long long11 = hikariConfig0.getAcquireRetryDelay();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 60 + "'", int3 == 60);
// flaky:         org.junit.Assert.assertTrue("'" + long4 + "' != '" + 32L + "'", long4 == 32L);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 60 + "'", int8 == 60);
// flaky:         org.junit.Assert.assertTrue("'" + long11 + "' != '" + 100L + "'", long11 == 100L);
    }

    @Test
    public void test17199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17199");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        hikariConfig0.setMaxLifetime((long) (short) 10);
        com.zaxxer.hikari.HikariConfig hikariConfig3 = new com.zaxxer.hikari.HikariConfig();
        javax.sql.DataSource dataSource4 = hikariConfig3.getDataSource();
        hikariConfig3.setConnectionTestQuery("");
        hikariConfig3.setInitializationFailFast(false);
        long long9 = hikariConfig3.getConnectionTimeout();
        java.util.Properties properties10 = hikariConfig3.dataSourceProperties;
        hikariConfig0.dataSourceProperties = properties10;
        java.lang.String str12 = hikariConfig0.catalog;
        hikariConfig0.setConnectionInitSql("HikariPool-66");
        hikariConfig0.acquireRetries = 0;
        int int17 = hikariConfig0.getMinimumPoolSize();
        boolean boolean18 = hikariConfig0.isAutoCommit;
        boolean boolean19 = hikariConfig0.isReadOnly();
        com.zaxxer.hikari.HikariConfig hikariConfig20 = new com.zaxxer.hikari.HikariConfig();
        javax.sql.DataSource dataSource21 = hikariConfig20.getDataSource();
        hikariConfig20.setConnectionTestQuery("");
        hikariConfig20.setInitializationFailFast(false);
        long long26 = hikariConfig20.getConnectionTimeout();
        java.util.Properties properties27 = hikariConfig20.dataSourceProperties;
        boolean boolean28 = hikariConfig20.isAutoCommit();
        hikariConfig20.setConnectionCustomizerClassName("HikariPool-295");
        boolean boolean31 = hikariConfig20.isAutoCommit;
        com.zaxxer.hikari.HikariConfig hikariConfig32 = new com.zaxxer.hikari.HikariConfig();
        javax.sql.DataSource dataSource33 = hikariConfig32.getDataSource();
        hikariConfig32.setConnectionTestQuery("");
        hikariConfig32.setInitializationFailFast(false);
        long long38 = hikariConfig32.getConnectionTimeout();
        hikariConfig32.setJdbcUrl("HikariPool-47");
        hikariConfig32.setCatalog("HikariPool-135");
        com.zaxxer.hikari.HikariConfig hikariConfig43 = new com.zaxxer.hikari.HikariConfig();
        javax.sql.DataSource dataSource44 = hikariConfig43.getDataSource();
        hikariConfig43.setConnectionTestQuery("");
        hikariConfig43.connectionCustomizerClassName = "";
        hikariConfig43.setConnectionCustomizerClassName("hi!");
        java.lang.String str51 = hikariConfig43.getCatalog();
        boolean boolean52 = hikariConfig43.isRegisterMbeans;
        hikariConfig43.setAcquireRetries(0);
        hikariConfig43.setMaximumPoolSize((int) '#');
        hikariConfig43.setTransactionIsolation("hi!");
        boolean boolean59 = hikariConfig43.isInitializationFailFast();
        java.lang.String str60 = hikariConfig43.connectionInitSql;
        hikariConfig43.maxPoolSize = 0;
        java.util.Properties properties63 = hikariConfig43.getDataSourceProperties();
        hikariConfig32.dataSourceProperties = properties63;
        hikariConfig20.dataSourceProperties = properties63;
        hikariConfig0.dataSourceProperties = properties63;
        hikariConfig0.isJdbc4connectionTest = false;
        hikariConfig0.setJdbcUrl("HikariPool-2673");
        com.zaxxer.hikari.HikariConfig hikariConfig71 = new com.zaxxer.hikari.HikariConfig();
        hikariConfig71.setMaxLifetime((long) (short) 10);
        com.zaxxer.hikari.HikariConfig hikariConfig74 = new com.zaxxer.hikari.HikariConfig();
        javax.sql.DataSource dataSource75 = hikariConfig74.getDataSource();
        hikariConfig74.setConnectionTestQuery("");
        hikariConfig74.setInitializationFailFast(false);
        long long80 = hikariConfig74.getConnectionTimeout();
        java.util.Properties properties81 = hikariConfig74.dataSourceProperties;
        hikariConfig71.dataSourceProperties = properties81;
        hikariConfig71.maxLifetime = 750L;
        java.lang.String str85 = hikariConfig71.getPoolName();
        hikariConfig71.isInitializationFailFast = false;
        int int88 = hikariConfig71.transactionIsolation;
        hikariConfig71.isJdbc4connectionTest = false;
        hikariConfig71.setMinimumPoolSize((int) (byte) 1);
        hikariConfig71.setJdbcUrl("HikariPool-7348");
        java.util.Properties properties95 = hikariConfig71.dataSourceProperties;
        hikariConfig0.dataSourceProperties = properties95;
        org.junit.Assert.assertNull(dataSource4);
// flaky:         org.junit.Assert.assertTrue("'" + long9 + "' != '" + 32L + "'", long9 == 32L);
        org.junit.Assert.assertNotNull(properties10);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 10 + "'", int17 == 10);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNull(dataSource21);
// flaky:         org.junit.Assert.assertTrue("'" + long26 + "' != '" + 32L + "'", long26 == 32L);
        org.junit.Assert.assertNotNull(properties27);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + true + "'", boolean31 == true);
        org.junit.Assert.assertNull(dataSource33);
// flaky:         org.junit.Assert.assertTrue("'" + long38 + "' != '" + 32L + "'", long38 == 32L);
        org.junit.Assert.assertNull(dataSource44);
        org.junit.Assert.assertNull(str51);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + false + "'", boolean59 == false);
        org.junit.Assert.assertNull(str60);
        org.junit.Assert.assertNotNull(properties63);
        org.junit.Assert.assertNull(dataSource75);
// flaky:         org.junit.Assert.assertTrue("'" + long80 + "' != '" + 32L + "'", long80 == 32L);
        org.junit.Assert.assertNotNull(properties81);
// flaky:         org.junit.Assert.assertEquals("'" + str85 + "' != '" + "HikariPool-42341" + "'", str85, "HikariPool-42341");
        org.junit.Assert.assertTrue("'" + int88 + "' != '" + (-1) + "'", int88 == (-1));
        org.junit.Assert.assertNotNull(properties95);
    }

    @Test
    public void test17200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17200");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        java.lang.String str1 = hikariConfig0.getConnectionInitSql();
        hikariConfig0.acquireIncrement = 0;
        hikariConfig0.connectionTimeout = 10;
        boolean boolean6 = hikariConfig0.isIsolateInternalQueries();
        hikariConfig0.setReadOnly(false);
        hikariConfig0.setMaximumPoolSize((int) (short) 100);
        long long11 = hikariConfig0.idleTimeout;
        hikariConfig0.setAcquireRetryDelay(5000L);
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
// flaky:         org.junit.Assert.assertTrue("'" + long11 + "' != '" + (-1L) + "'", long11 == (-1L));
    }

    @Test
    public void test17201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17201");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        javax.sql.DataSource dataSource1 = hikariConfig0.getDataSource();
        hikariConfig0.setConnectionTestQuery("");
        hikariConfig0.connectionCustomizerClassName = "";
        hikariConfig0.setConnectionCustomizerClassName("hi!");
        java.lang.String str8 = hikariConfig0.getCatalog();
        java.util.Properties properties9 = hikariConfig0.dataSourceProperties;
        int int10 = hikariConfig0.minPoolSize;
        long long11 = hikariConfig0.getMaxLifetime();
        hikariConfig0.maxLifetime = 10L;
        hikariConfig0.connectionInitSql = "";
        hikariConfig0.idleTimeout = 1L;
        long long18 = hikariConfig0.getConnectionTimeout();
        hikariConfig0.transactionIsolationName = "HikariPool-203";
        hikariConfig0.connectionTimeout = 10L;
        hikariConfig0.catalog = "HikariPool-2609";
        long long25 = hikariConfig0.acquireRetryDelay;
        hikariConfig0.idleTimeout = 0;
        org.junit.Assert.assertNull(dataSource1);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNotNull(properties9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 10 + "'", int10 == 10);
// flaky:         org.junit.Assert.assertTrue("'" + long11 + "' != '" + 32L + "'", long11 == 32L);
// flaky:         org.junit.Assert.assertTrue("'" + long18 + "' != '" + 32L + "'", long18 == 32L);
// flaky:         org.junit.Assert.assertTrue("'" + long25 + "' != '" + 100L + "'", long25 == 100L);
    }

    @Test
    public void test17202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17202");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        int int1 = hikariConfig0.minPoolSize;
        java.lang.String str2 = hikariConfig0.catalog;
        hikariConfig0.setPoolName("HikariPool-95");
        javax.sql.DataSource dataSource5 = hikariConfig0.dataSource;
        java.util.Properties properties6 = hikariConfig0.dataSourceProperties;
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 10 + "'", int1 == 10);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(dataSource5);
        org.junit.Assert.assertNotNull(properties6);
    }

    @Test
    public void test17203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17203");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        hikariConfig0.setMaxLifetime((long) (short) 10);
        java.lang.String str3 = hikariConfig0.getPoolName();
        hikariConfig0.jdbcUrl = "";
        hikariConfig0.setMaxLifetime(0L);
        hikariConfig0.setTransactionIsolation("HikariPool-48");
        com.zaxxer.hikari.HikariConfig hikariConfig10 = new com.zaxxer.hikari.HikariConfig();
        hikariConfig10.setMaxLifetime((long) (short) 10);
        com.zaxxer.hikari.HikariConfig hikariConfig13 = new com.zaxxer.hikari.HikariConfig();
        javax.sql.DataSource dataSource14 = hikariConfig13.getDataSource();
        hikariConfig13.setConnectionTestQuery("");
        hikariConfig13.setInitializationFailFast(false);
        long long19 = hikariConfig13.getConnectionTimeout();
        java.util.Properties properties20 = hikariConfig13.dataSourceProperties;
        hikariConfig10.dataSourceProperties = properties20;
        hikariConfig0.setDataSourceProperties(properties20);
        java.lang.String str23 = hikariConfig0.getJdbcUrl();
        javax.sql.DataSource dataSource24 = hikariConfig0.dataSource;
        java.util.Properties properties25 = hikariConfig0.dataSourceProperties;
        java.util.Properties properties26 = hikariConfig0.dataSourceProperties;
        int int27 = hikariConfig0.acquireIncrement;
        hikariConfig0.isIsolateInternalQueries = false;
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "HikariPool-42349" + "'", str3, "HikariPool-42349");
        org.junit.Assert.assertNull(dataSource14);
// flaky:         org.junit.Assert.assertTrue("'" + long19 + "' != '" + 32L + "'", long19 == 32L);
        org.junit.Assert.assertNotNull(properties20);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
        org.junit.Assert.assertNull(dataSource24);
        org.junit.Assert.assertNotNull(properties25);
        org.junit.Assert.assertNotNull(properties26);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 1 + "'", int27 == 1);
    }

    @Test
    public void test17204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17204");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        javax.sql.DataSource dataSource1 = hikariConfig0.getDataSource();
        hikariConfig0.setConnectionTestQuery("");
        hikariConfig0.connectionCustomizerClassName = "";
        hikariConfig0.setConnectionCustomizerClassName("hi!");
        java.lang.String str8 = hikariConfig0.getCatalog();
        java.util.Properties properties9 = hikariConfig0.dataSourceProperties;
        com.zaxxer.hikari.HikariConfig hikariConfig11 = new com.zaxxer.hikari.HikariConfig();
        java.lang.String str12 = hikariConfig11.getConnectionInitSql();
        long long13 = hikariConfig11.getLeakDetectionThreshold();
        hikariConfig11.leakDetectionThreshold = (-1);
        long long16 = hikariConfig11.acquireRetryDelay;
        boolean boolean17 = hikariConfig11.isRegisterMbeans;
        hikariConfig0.addDataSourceProperty("HikariPool-47", (java.lang.Object) boolean17);
        int int19 = hikariConfig0.acquireRetries;
        hikariConfig0.setUseInstrumentation(true);
        hikariConfig0.acquireIncrement = '4';
        long long24 = hikariConfig0.maxLifetime;
        hikariConfig0.setConnectionTestQuery("HikariPool-2013");
        int int27 = hikariConfig0.getTransactionIsolation();
        java.lang.String str28 = hikariConfig0.getConnectionTestQuery();
        boolean boolean29 = hikariConfig0.isIsolateInternalQueries();
        hikariConfig0.minPoolSize = (byte) 1;
        org.junit.Assert.assertNull(dataSource1);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNotNull(properties9);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 0L + "'", long13 == 0L);
// flaky:         org.junit.Assert.assertTrue("'" + long16 + "' != '" + 100L + "'", long16 == 100L);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 3 + "'", int19 == 3);
// flaky:         org.junit.Assert.assertTrue("'" + long24 + "' != '" + 32L + "'", long24 == 32L);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + (-1) + "'", int27 == (-1));
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "HikariPool-2013" + "'", str28, "HikariPool-2013");
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
    }

    @Test
    public void test17205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17205");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        java.lang.String str1 = hikariConfig0.getConnectionInitSql();
        long long2 = hikariConfig0.getLeakDetectionThreshold();
        hikariConfig0.setTransactionIsolation("");
        boolean boolean5 = hikariConfig0.isJdbc4connectionTest;
        boolean boolean6 = hikariConfig0.isAutoCommit;
        javax.sql.DataSource dataSource7 = hikariConfig0.dataSource;
        hikariConfig0.setPoolName("HikariPool-184");
        long long10 = hikariConfig0.idleTimeout;
        boolean boolean11 = hikariConfig0.isRegisterMbeans;
        hikariConfig0.setConnectionCustomizerClassName("HikariPool-4081");
        java.util.Properties properties14 = hikariConfig0.dataSourceProperties;
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNull(dataSource7);
// flaky:         org.junit.Assert.assertTrue("'" + long10 + "' != '" + (-1L) + "'", long10 == (-1L));
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(properties14);
    }

    @Test
    public void test17206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17206");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        javax.sql.DataSource dataSource1 = hikariConfig0.getDataSource();
        hikariConfig0.setConnectionTestQuery("");
        hikariConfig0.connectionCustomizerClassName = "";
        hikariConfig0.setConnectionCustomizerClassName("hi!");
        java.lang.String str8 = hikariConfig0.getCatalog();
        boolean boolean9 = hikariConfig0.isRegisterMbeans;
        hikariConfig0.setAcquireRetries(0);
        hikariConfig0.setMaximumPoolSize((int) '#');
        hikariConfig0.setTransactionIsolation("hi!");
        boolean boolean16 = hikariConfig0.isInitializationFailFast();
        long long17 = hikariConfig0.getMaxLifetime();
        hikariConfig0.setTransactionIsolation("");
        hikariConfig0.connectionTestQuery = "HikariPool-833";
        hikariConfig0.isInitializationFailFast = false;
        hikariConfig0.connectionCustomizerClassName = "HikariPool-1440";
        hikariConfig0.setLeakDetectionThreshold((long) (short) 10);
        hikariConfig0.connectionTestQuery = "HikariPool-23358";
        org.junit.Assert.assertNull(dataSource1);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
// flaky:         org.junit.Assert.assertTrue("'" + long17 + "' != '" + 32L + "'", long17 == 32L);
    }

    @Test
    public void test17207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17207");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        java.lang.String str1 = hikariConfig0.getConnectionInitSql();
        hikariConfig0.acquireIncrement = 0;
        hikariConfig0.maxLifetime = 100;
        long long6 = hikariConfig0.acquireRetryDelay;
        hikariConfig0.setCatalog("");
        hikariConfig0.setIsolateInternalQueries(false);
        hikariConfig0.setMinimumPoolSize((int) '4');
        org.junit.Assert.assertNull(str1);
// flaky:         org.junit.Assert.assertTrue("'" + long6 + "' != '" + 100L + "'", long6 == 100L);
    }

    @Test
    public void test17208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17208");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        javax.sql.DataSource dataSource1 = hikariConfig0.getDataSource();
        hikariConfig0.setConnectionTestQuery("");
        hikariConfig0.connectionCustomizerClassName = "";
        hikariConfig0.setConnectionCustomizerClassName("hi!");
        java.lang.String str8 = hikariConfig0.getCatalog();
        java.util.Properties properties9 = hikariConfig0.dataSourceProperties;
        int int10 = hikariConfig0.minPoolSize;
        long long11 = hikariConfig0.getMaxLifetime();
        hikariConfig0.addDataSourceProperty("HikariPool-110", (java.lang.Object) 100.0d);
        hikariConfig0.setIdleTimeout(10L);
        int int17 = hikariConfig0.getAcquireRetries();
        boolean boolean18 = hikariConfig0.isReadOnly();
        boolean boolean19 = hikariConfig0.isInitializationFailFast;
        java.lang.String str20 = hikariConfig0.getDataSourceClassName();
        hikariConfig0.setJdbc4ConnectionTest(false);
        org.junit.Assert.assertNull(dataSource1);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNotNull(properties9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 10 + "'", int10 == 10);
// flaky:         org.junit.Assert.assertTrue("'" + long11 + "' != '" + 32L + "'", long11 == 32L);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 3 + "'", int17 == 3);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNull(str20);
    }

    @Test
    public void test17209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17209");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        java.lang.String str1 = hikariConfig0.getConnectionInitSql();
        long long2 = hikariConfig0.getLeakDetectionThreshold();
        int int3 = hikariConfig0.getMaximumPoolSize();
        long long4 = hikariConfig0.leakDetectionThreshold;
        hikariConfig0.catalog = "HikariPool-62";
        boolean boolean7 = hikariConfig0.isJdbc4connectionTest;
        int int8 = hikariConfig0.acquireRetries;
        hikariConfig0.transactionIsolationName = "HikariPool-66";
        hikariConfig0.acquireIncrement = (byte) 10;
        hikariConfig0.maxPoolSize = (byte) 100;
        hikariConfig0.isRegisterMbeans = true;
        java.lang.String str17 = hikariConfig0.getConnectionCustomizerClassName();
        hikariConfig0.minPoolSize = 100;
        hikariConfig0.setJdbc4ConnectionTest(false);
        java.util.Properties properties22 = hikariConfig0.dataSourceProperties;
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 60 + "'", int3 == 60);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 3 + "'", int8 == 3);
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertNotNull(properties22);
    }

    @Test
    public void test17210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17210");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        java.lang.String str1 = hikariConfig0.getConnectionInitSql();
        hikariConfig0.setMaxLifetime(35L);
        long long4 = hikariConfig0.maxLifetime;
        long long5 = hikariConfig0.leakDetectionThreshold;
        long long6 = hikariConfig0.getAcquireRetryDelay();
        hikariConfig0.setMaxLifetime((long) 'a');
        boolean boolean9 = hikariConfig0.isJdbc4connectionTest;
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 35L + "'", long4 == 35L);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
// flaky:         org.junit.Assert.assertTrue("'" + long6 + "' != '" + 100L + "'", long6 == 100L);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void test17211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17211");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        javax.sql.DataSource dataSource1 = hikariConfig0.getDataSource();
        hikariConfig0.setConnectionTestQuery("");
        hikariConfig0.setInitializationFailFast(false);
        hikariConfig0.catalog = "";
        com.zaxxer.hikari.IConnectionCustomizer iConnectionCustomizer8 = hikariConfig0.connectionCustomizer;
        int int9 = hikariConfig0.acquireRetries;
        com.zaxxer.hikari.IConnectionCustomizer iConnectionCustomizer10 = hikariConfig0.connectionCustomizer;
        org.junit.Assert.assertNull(dataSource1);
        org.junit.Assert.assertNull(iConnectionCustomizer8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 3 + "'", int9 == 3);
        org.junit.Assert.assertNull(iConnectionCustomizer10);
    }

    @Test
    public void test17212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17212");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        javax.sql.DataSource dataSource1 = hikariConfig0.getDataSource();
        hikariConfig0.setConnectionTestQuery("");
        hikariConfig0.setInitializationFailFast(false);
        hikariConfig0.catalog = "";
        int int8 = hikariConfig0.getMaximumPoolSize();
        hikariConfig0.leakDetectionThreshold = (short) 10;
        hikariConfig0.isJdbc4connectionTest = true;
        java.lang.String str13 = hikariConfig0.getJdbcUrl();
        hikariConfig0.leakDetectionThreshold = (byte) -1;
        hikariConfig0.catalog = "HikariPool-3542";
        java.lang.String str18 = hikariConfig0.getDataSourceClassName();
        hikariConfig0.connectionInitSql = "HikariPool-27305";
        org.junit.Assert.assertNull(dataSource1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 60 + "'", int8 == 60);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNull(str18);
    }

    @Test
    public void test17213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17213");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        hikariConfig0.setMaxLifetime((long) (short) 10);
        com.zaxxer.hikari.HikariConfig hikariConfig3 = new com.zaxxer.hikari.HikariConfig();
        javax.sql.DataSource dataSource4 = hikariConfig3.getDataSource();
        hikariConfig3.setConnectionTestQuery("");
        hikariConfig3.setInitializationFailFast(false);
        long long9 = hikariConfig3.getConnectionTimeout();
        java.util.Properties properties10 = hikariConfig3.dataSourceProperties;
        hikariConfig0.dataSourceProperties = properties10;
        hikariConfig0.maxLifetime = 750L;
        java.lang.String str14 = hikariConfig0.getPoolName();
        hikariConfig0.isInitializationFailFast = false;
        int int17 = hikariConfig0.transactionIsolation;
        hikariConfig0.isJdbc4connectionTest = false;
        int int20 = hikariConfig0.minPoolSize;
        org.junit.Assert.assertNull(dataSource4);
// flaky:         org.junit.Assert.assertTrue("'" + long9 + "' != '" + 32L + "'", long9 == 32L);
        org.junit.Assert.assertNotNull(properties10);
// flaky:         org.junit.Assert.assertEquals("'" + str14 + "' != '" + "HikariPool-42363" + "'", str14, "HikariPool-42363");
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 10 + "'", int20 == 10);
    }

    @Test
    public void test17214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17214");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        javax.sql.DataSource dataSource1 = hikariConfig0.getDataSource();
        hikariConfig0.setConnectionTestQuery("");
        hikariConfig0.connectionCustomizerClassName = "";
        hikariConfig0.setConnectionCustomizerClassName("hi!");
        java.lang.String str8 = hikariConfig0.getCatalog();
        boolean boolean9 = hikariConfig0.isRegisterMbeans;
        hikariConfig0.setAcquireRetries(0);
        hikariConfig0.setMaximumPoolSize((int) '#');
        hikariConfig0.setTransactionIsolation("hi!");
        boolean boolean16 = hikariConfig0.isInitializationFailFast();
        java.lang.String str17 = hikariConfig0.connectionInitSql;
        hikariConfig0.maxPoolSize = 0;
        java.lang.String str20 = hikariConfig0.connectionTestQuery;
        long long21 = hikariConfig0.idleTimeout;
        int int22 = hikariConfig0.maxPoolSize;
        // The following exception was thrown during execution in test generation
        try {
            hikariConfig0.setConnectionTimeout((long) 60);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: connectionTimeout cannot be less than 100ms");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(dataSource1);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
// flaky:         org.junit.Assert.assertTrue("'" + long21 + "' != '" + (-1L) + "'", long21 == (-1L));
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
    }

    @Test
    public void test17215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17215");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        javax.sql.DataSource dataSource1 = hikariConfig0.getDataSource();
        hikariConfig0.idleTimeout = 3;
        hikariConfig0.setLeakDetectionThreshold(52L);
        int int6 = hikariConfig0.maxPoolSize;
        java.lang.String str7 = hikariConfig0.poolName;
        hikariConfig0.setInitializationFailFast(false);
        com.zaxxer.hikari.IConnectionCustomizer iConnectionCustomizer10 = hikariConfig0.connectionCustomizer;
        hikariConfig0.dataSourceClassName = "HikariPool-149";
        hikariConfig0.setConnectionInitSql("HikariPool-206");
        org.junit.Assert.assertNull(dataSource1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 60 + "'", int6 == 60);
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "HikariPool-42366" + "'", str7, "HikariPool-42366");
        org.junit.Assert.assertNull(iConnectionCustomizer10);
    }

    @Test
    public void test17216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17216");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        javax.sql.DataSource dataSource1 = hikariConfig0.getDataSource();
        hikariConfig0.setConnectionTestQuery("");
        hikariConfig0.connectionCustomizerClassName = "";
        hikariConfig0.setConnectionCustomizerClassName("hi!");
        java.lang.String str8 = hikariConfig0.getCatalog();
        boolean boolean9 = hikariConfig0.isRegisterMbeans;
        hikariConfig0.setAcquireRetries(0);
        hikariConfig0.setMaximumPoolSize((int) '#');
        hikariConfig0.setTransactionIsolation("hi!");
        hikariConfig0.setConnectionInitSql("hi!");
        javax.sql.DataSource dataSource18 = hikariConfig0.getDataSource();
        boolean boolean19 = hikariConfig0.isAutoCommit();
        boolean boolean20 = hikariConfig0.isAutoCommit();
        java.lang.String str21 = hikariConfig0.jdbcUrl;
        org.junit.Assert.assertNull(dataSource1);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(dataSource18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertNull(str21);
    }

    @Test
    public void test17217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17217");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        javax.sql.DataSource dataSource1 = hikariConfig0.getDataSource();
        hikariConfig0.idleTimeout = 3;
        hikariConfig0.setLeakDetectionThreshold(52L);
        int int6 = hikariConfig0.minPoolSize;
        hikariConfig0.transactionIsolationName = "";
        hikariConfig0.setReadOnly(false);
        // The following exception was thrown during execution in test generation
        try {
            hikariConfig0.setAcquireRetries((int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: acquireRetries cannot be negative");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(dataSource1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
    }

    @Test
    public void test17218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17218");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        javax.sql.DataSource dataSource1 = hikariConfig0.getDataSource();
        hikariConfig0.setConnectionTestQuery("");
        hikariConfig0.connectionCustomizerClassName = "";
        hikariConfig0.setConnectionCustomizerClassName("hi!");
        java.lang.String str8 = hikariConfig0.getCatalog();
        com.zaxxer.hikari.IConnectionCustomizer iConnectionCustomizer9 = null;
        hikariConfig0.connectionCustomizer = iConnectionCustomizer9;
        java.lang.String str11 = hikariConfig0.getPoolName();
        int int12 = hikariConfig0.getAcquireIncrement();
        boolean boolean13 = hikariConfig0.isAutoCommit;
        hikariConfig0.jdbcUrl = "HikariPool-511";
        com.zaxxer.hikari.HikariConfig hikariConfig16 = new com.zaxxer.hikari.HikariConfig();
        java.lang.String str17 = hikariConfig16.getConnectionInitSql();
        long long18 = hikariConfig16.getLeakDetectionThreshold();
        int int19 = hikariConfig16.getMaximumPoolSize();
        long long20 = hikariConfig16.getIdleTimeout();
        int int21 = hikariConfig16.maxPoolSize;
        java.lang.String str22 = hikariConfig16.getConnectionCustomizerClassName();
        hikariConfig16.setConnectionCustomizerClassName("HikariPool-127");
        int int25 = hikariConfig16.getAcquireIncrement();
        hikariConfig16.setLeakDetectionThreshold((long) (byte) 0);
        hikariConfig16.leakDetectionThreshold = 750L;
        boolean boolean30 = hikariConfig16.isAutoCommit;
        hikariConfig16.acquireRetryDelay = (byte) 0;
        com.zaxxer.hikari.HikariConfig hikariConfig33 = new com.zaxxer.hikari.HikariConfig();
        javax.sql.DataSource dataSource34 = hikariConfig33.getDataSource();
        hikariConfig33.setConnectionTestQuery("");
        hikariConfig33.connectionCustomizerClassName = "";
        hikariConfig33.setConnectionCustomizerClassName("hi!");
        int int41 = hikariConfig33.acquireIncrement;
        int int42 = hikariConfig33.minPoolSize;
        hikariConfig33.poolName = "HikariPool-132";
        com.zaxxer.hikari.HikariConfig hikariConfig45 = new com.zaxxer.hikari.HikariConfig();
        java.lang.String str46 = hikariConfig45.getConnectionInitSql();
        long long47 = hikariConfig45.getLeakDetectionThreshold();
        int int48 = hikariConfig45.getMaximumPoolSize();
        long long49 = hikariConfig45.getIdleTimeout();
        int int50 = hikariConfig45.maxPoolSize;
        java.lang.String str51 = hikariConfig45.getConnectionCustomizerClassName();
        java.util.Properties properties52 = hikariConfig45.dataSourceProperties;
        hikariConfig33.setDataSourceProperties(properties52);
        hikariConfig16.dataSourceProperties = properties52;
        hikariConfig0.setDataSourceProperties(properties52);
        boolean boolean56 = hikariConfig0.isRegisterMbeans;
        org.junit.Assert.assertNull(dataSource1);
        org.junit.Assert.assertNull(str8);
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "HikariPool-42369" + "'", str11, "HikariPool-42369");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 0L + "'", long18 == 0L);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 60 + "'", int19 == 60);
// flaky:         org.junit.Assert.assertTrue("'" + long20 + "' != '" + (-1L) + "'", long20 == (-1L));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 60 + "'", int21 == 60);
        org.junit.Assert.assertNull(str22);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 1 + "'", int25 == 1);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertNull(dataSource34);
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 1 + "'", int41 == 1);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 10 + "'", int42 == 10);
        org.junit.Assert.assertNull(str46);
        org.junit.Assert.assertTrue("'" + long47 + "' != '" + 0L + "'", long47 == 0L);
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + 60 + "'", int48 == 60);
// flaky:         org.junit.Assert.assertTrue("'" + long49 + "' != '" + (-1L) + "'", long49 == (-1L));
        org.junit.Assert.assertTrue("'" + int50 + "' != '" + 60 + "'", int50 == 60);
        org.junit.Assert.assertNull(str51);
        org.junit.Assert.assertNotNull(properties52);
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + false + "'", boolean56 == false);
    }

    @Test
    public void test17219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17219");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        javax.sql.DataSource dataSource1 = hikariConfig0.getDataSource();
        hikariConfig0.setConnectionTestQuery("");
        hikariConfig0.connectionCustomizerClassName = "";
        hikariConfig0.setConnectionCustomizerClassName("hi!");
        java.lang.String str8 = hikariConfig0.getCatalog();
        com.zaxxer.hikari.IConnectionCustomizer iConnectionCustomizer9 = null;
        hikariConfig0.connectionCustomizer = iConnectionCustomizer9;
        boolean boolean11 = hikariConfig0.isReadOnly;
        long long12 = hikariConfig0.connectionTimeout;
        hikariConfig0.poolName = "HikariPool-524";
        java.lang.String str15 = hikariConfig0.connectionInitSql;
        java.lang.String str16 = hikariConfig0.poolName;
        org.junit.Assert.assertNull(dataSource1);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
// flaky:         org.junit.Assert.assertTrue("'" + long12 + "' != '" + 32L + "'", long12 == 32L);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "HikariPool-524" + "'", str16, "HikariPool-524");
    }

    @Test
    public void test17220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17220");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        java.lang.String str1 = hikariConfig0.getConnectionInitSql();
        long long2 = hikariConfig0.getLeakDetectionThreshold();
        hikariConfig0.leakDetectionThreshold = (-1);
        long long5 = hikariConfig0.acquireRetryDelay;
        com.zaxxer.hikari.HikariConfig hikariConfig7 = new com.zaxxer.hikari.HikariConfig();
        javax.sql.DataSource dataSource8 = hikariConfig7.getDataSource();
        hikariConfig7.setConnectionTestQuery("");
        hikariConfig7.connectionCustomizerClassName = "";
        hikariConfig7.setConnectionCustomizerClassName("hi!");
        java.lang.String str15 = hikariConfig7.getCatalog();
        boolean boolean16 = hikariConfig7.isRegisterMbeans;
        long long17 = hikariConfig7.connectionTimeout;
        hikariConfig7.setConnectionInitSql("HikariPool-48");
        hikariConfig0.addDataSourceProperty("hi!", (java.lang.Object) hikariConfig7);
        hikariConfig0.setUseInstrumentation(false);
        java.lang.String str23 = hikariConfig0.getJdbcUrl();
        hikariConfig0.setConnectionTestQuery("HikariPool-975");
        com.zaxxer.hikari.IConnectionCustomizer iConnectionCustomizer26 = null;
        hikariConfig0.connectionCustomizer = iConnectionCustomizer26;
        java.lang.String str28 = hikariConfig0.getDataSourceClassName();
        long long29 = hikariConfig0.connectionTimeout;
        hikariConfig0.isReadOnly = true;
        hikariConfig0.connectionInitSql = "HikariPool-7846";
        hikariConfig0.idleTimeout = 35L;
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
// flaky:         org.junit.Assert.assertTrue("'" + long5 + "' != '" + 100L + "'", long5 == 100L);
        org.junit.Assert.assertNull(dataSource8);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
// flaky:         org.junit.Assert.assertTrue("'" + long17 + "' != '" + 32L + "'", long17 == 32L);
        org.junit.Assert.assertNull(str23);
        org.junit.Assert.assertNull(str28);
// flaky:         org.junit.Assert.assertTrue("'" + long29 + "' != '" + 32L + "'", long29 == 32L);
    }

    @Test
    public void test17221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17221");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        javax.sql.DataSource dataSource1 = hikariConfig0.getDataSource();
        hikariConfig0.setConnectionTestQuery("");
        hikariConfig0.connectionCustomizerClassName = "";
        hikariConfig0.setConnectionCustomizerClassName("hi!");
        java.lang.String str8 = hikariConfig0.getCatalog();
        boolean boolean9 = hikariConfig0.isRegisterMbeans;
        hikariConfig0.setAcquireRetries(0);
        hikariConfig0.setMaximumPoolSize((int) '#');
        hikariConfig0.setTransactionIsolation("hi!");
        boolean boolean16 = hikariConfig0.isInitializationFailFast();
        java.lang.String str17 = hikariConfig0.getConnectionCustomizerClassName();
        hikariConfig0.setAutoCommit(false);
        hikariConfig0.maxLifetime = 100L;
        java.lang.String str22 = hikariConfig0.getCatalog();
        boolean boolean23 = hikariConfig0.isAutoCommit();
        org.junit.Assert.assertNull(dataSource1);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
        org.junit.Assert.assertNull(str22);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
    }

    @Test
    public void test17222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17222");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        javax.sql.DataSource dataSource1 = hikariConfig0.getDataSource();
        hikariConfig0.setConnectionTestQuery("");
        hikariConfig0.setInitializationFailFast(false);
        java.lang.String str6 = hikariConfig0.getConnectionInitSql();
        hikariConfig0.setReadOnly(true);
        javax.sql.DataSource dataSource9 = null;
        hikariConfig0.setDataSource(dataSource9);
        hikariConfig0.acquireRetryDelay = 'a';
        long long13 = hikariConfig0.acquireRetryDelay;
        hikariConfig0.connectionInitSql = "HikariPool-3559";
        hikariConfig0.setCatalog("");
        org.junit.Assert.assertNull(dataSource1);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 97L + "'", long13 == 97L);
    }

    @Test
    public void test17223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17223");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        int int1 = hikariConfig0.getTransactionIsolation();
        long long2 = hikariConfig0.leakDetectionThreshold;
        hikariConfig0.setIdleTimeout(0L);
        boolean boolean5 = hikariConfig0.isAutoCommit;
        hikariConfig0.isAutoCommit = true;
        hikariConfig0.setCatalog("HikariPool-11099");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
    }

    @Test
    public void test17224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17224");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        java.lang.String str1 = hikariConfig0.getConnectionInitSql();
        hikariConfig0.acquireIncrement = 0;
        hikariConfig0.connectionTimeout = 10;
        boolean boolean6 = hikariConfig0.isInitializationFailFast();
        int int7 = hikariConfig0.acquireIncrement;
        int int8 = hikariConfig0.minPoolSize;
        hikariConfig0.maxPoolSize = (short) -1;
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 10 + "'", int8 == 10);
    }

    @Test
    public void test17225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17225");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        java.lang.String str1 = hikariConfig0.getConnectionInitSql();
        long long2 = hikariConfig0.getLeakDetectionThreshold();
        hikariConfig0.leakDetectionThreshold = (-1);
        long long5 = hikariConfig0.acquireRetryDelay;
        boolean boolean6 = hikariConfig0.isRegisterMbeans;
        hikariConfig0.setConnectionInitSql("");
        hikariConfig0.connectionTimeout = 0L;
        java.lang.String str11 = hikariConfig0.dataSourceClassName;
        int int12 = hikariConfig0.transactionIsolation;
        java.lang.String str13 = hikariConfig0.poolName;
        boolean boolean14 = hikariConfig0.isIsolateInternalQueries;
        hikariConfig0.isAutoCommit = false;
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
// flaky:         org.junit.Assert.assertTrue("'" + long5 + "' != '" + 100L + "'", long5 == 100L);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "HikariPool-42381" + "'", str13, "HikariPool-42381");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test17226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17226");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        javax.sql.DataSource dataSource1 = hikariConfig0.getDataSource();
        hikariConfig0.idleTimeout = 3;
        hikariConfig0.setLeakDetectionThreshold(52L);
        int int6 = hikariConfig0.minPoolSize;
        hikariConfig0.transactionIsolationName = "";
        java.lang.String str9 = hikariConfig0.getCatalog();
        java.lang.String str10 = hikariConfig0.getDataSourceClassName();
        hikariConfig0.leakDetectionThreshold = (byte) -1;
        hikariConfig0.setJdbcUrl("HikariPool-3425");
        java.lang.String str15 = hikariConfig0.getConnectionInitSql();
        org.junit.Assert.assertNull(dataSource1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(str15);
    }

    @Test
    public void test17227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17227");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        java.lang.String str1 = hikariConfig0.getConnectionInitSql();
        long long2 = hikariConfig0.getLeakDetectionThreshold();
        com.zaxxer.hikari.IConnectionCustomizer iConnectionCustomizer3 = null;
        hikariConfig0.connectionCustomizer = iConnectionCustomizer3;
        java.lang.String str5 = hikariConfig0.getConnectionCustomizerClassName();
        hikariConfig0.acquireRetryDelay = (short) 0;
        hikariConfig0.jdbcUrl = "HikariPool-142";
        hikariConfig0.setAcquireRetries((int) (short) 10);
        int int12 = hikariConfig0.acquireRetries;
        hikariConfig0.maxPoolSize = (byte) 0;
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 10 + "'", int12 == 10);
    }

    @Test
    public void test17228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17228");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        java.lang.String str1 = hikariConfig0.getConnectionInitSql();
        long long2 = hikariConfig0.getLeakDetectionThreshold();
        int int3 = hikariConfig0.getMaximumPoolSize();
        long long4 = hikariConfig0.getConnectionTimeout();
        long long5 = hikariConfig0.getMaxLifetime();
        int int6 = hikariConfig0.transactionIsolation;
        hikariConfig0.isRegisterMbeans = false;
        boolean boolean9 = hikariConfig0.isJdbc4ConnectionTest();
        hikariConfig0.setLeakDetectionThreshold((long) '4');
        hikariConfig0.setMinimumPoolSize(97);
        javax.sql.DataSource dataSource14 = null;
        hikariConfig0.dataSource = dataSource14;
        javax.sql.DataSource dataSource16 = null;
        hikariConfig0.setDataSource(dataSource16);
        hikariConfig0.isReadOnly = true;
        hikariConfig0.transactionIsolationName = "HikariPool-3245";
        java.lang.String str22 = hikariConfig0.getJdbcUrl();
        int int23 = hikariConfig0.minPoolSize;
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 60 + "'", int3 == 60);
// flaky:         org.junit.Assert.assertTrue("'" + long4 + "' != '" + 32L + "'", long4 == 32L);
// flaky:         org.junit.Assert.assertTrue("'" + long5 + "' != '" + 32L + "'", long5 == 32L);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNull(str22);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 97 + "'", int23 == 97);
    }

    @Test
    public void test17229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17229");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        java.lang.String str1 = hikariConfig0.getConnectionInitSql();
        long long2 = hikariConfig0.getLeakDetectionThreshold();
        hikariConfig0.leakDetectionThreshold = (-1);
        long long5 = hikariConfig0.acquireRetryDelay;
        com.zaxxer.hikari.HikariConfig hikariConfig7 = new com.zaxxer.hikari.HikariConfig();
        javax.sql.DataSource dataSource8 = hikariConfig7.getDataSource();
        hikariConfig7.setConnectionTestQuery("");
        hikariConfig7.connectionCustomizerClassName = "";
        hikariConfig7.setConnectionCustomizerClassName("hi!");
        java.lang.String str15 = hikariConfig7.getCatalog();
        boolean boolean16 = hikariConfig7.isRegisterMbeans;
        long long17 = hikariConfig7.connectionTimeout;
        hikariConfig7.setConnectionInitSql("HikariPool-48");
        hikariConfig0.addDataSourceProperty("hi!", (java.lang.Object) hikariConfig7);
        java.lang.String str21 = hikariConfig7.getConnectionCustomizerClassName();
        hikariConfig7.connectionTimeout = 10L;
        long long24 = hikariConfig7.idleTimeout;
        javax.sql.DataSource dataSource25 = hikariConfig7.getDataSource();
        hikariConfig7.catalog = "HikariPool-3231";
        boolean boolean28 = hikariConfig7.isJdbc4connectionTest;
        int int29 = hikariConfig7.maxPoolSize;
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
// flaky:         org.junit.Assert.assertTrue("'" + long5 + "' != '" + 100L + "'", long5 == 100L);
        org.junit.Assert.assertNull(dataSource8);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
// flaky:         org.junit.Assert.assertTrue("'" + long17 + "' != '" + 32L + "'", long17 == 32L);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "hi!" + "'", str21, "hi!");
// flaky:         org.junit.Assert.assertTrue("'" + long24 + "' != '" + (-1L) + "'", long24 == (-1L));
        org.junit.Assert.assertNull(dataSource25);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 60 + "'", int29 == 60);
    }

    @Test
    public void test17230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17230");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        javax.sql.DataSource dataSource1 = hikariConfig0.getDataSource();
        hikariConfig0.setConnectionTestQuery("");
        hikariConfig0.connectionCustomizerClassName = "";
        hikariConfig0.setConnectionCustomizerClassName("hi!");
        java.lang.String str8 = hikariConfig0.getCatalog();
        java.util.Properties properties9 = hikariConfig0.dataSourceProperties;
        com.zaxxer.hikari.HikariConfig hikariConfig11 = new com.zaxxer.hikari.HikariConfig();
        java.lang.String str12 = hikariConfig11.getConnectionInitSql();
        long long13 = hikariConfig11.getLeakDetectionThreshold();
        hikariConfig11.leakDetectionThreshold = (-1);
        long long16 = hikariConfig11.acquireRetryDelay;
        boolean boolean17 = hikariConfig11.isRegisterMbeans;
        hikariConfig0.addDataSourceProperty("HikariPool-47", (java.lang.Object) boolean17);
        java.util.Properties properties19 = hikariConfig0.getDataSourceProperties();
        hikariConfig0.transactionIsolationName = "HikariPool-18";
        java.util.Properties properties22 = hikariConfig0.getDataSourceProperties();
        java.util.Properties properties23 = hikariConfig0.dataSourceProperties;
        javax.sql.DataSource dataSource24 = hikariConfig0.dataSource;
        hikariConfig0.acquireRetryDelay = 2147483647L;
        boolean boolean27 = hikariConfig0.isIsolateInternalQueries();
        com.zaxxer.hikari.HikariConfig hikariConfig29 = new com.zaxxer.hikari.HikariConfig();
        java.lang.String str30 = hikariConfig29.getConnectionInitSql();
        long long31 = hikariConfig29.getLeakDetectionThreshold();
        hikariConfig29.leakDetectionThreshold = (-1);
        long long34 = hikariConfig29.acquireRetryDelay;
        long long35 = hikariConfig29.getIdleTimeout();
        long long36 = hikariConfig29.leakDetectionThreshold;
        java.lang.String str37 = hikariConfig29.getConnectionTestQuery();
        hikariConfig0.addDataSourceProperty("HikariPool-1466", (java.lang.Object) hikariConfig29);
        hikariConfig0.setConnectionInitSql("HikariPool-40954");
        org.junit.Assert.assertNull(dataSource1);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNotNull(properties9);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 0L + "'", long13 == 0L);
// flaky:         org.junit.Assert.assertTrue("'" + long16 + "' != '" + 100L + "'", long16 == 100L);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(properties19);
        org.junit.Assert.assertNotNull(properties22);
        org.junit.Assert.assertNotNull(properties23);
        org.junit.Assert.assertNull(dataSource24);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNull(str30);
        org.junit.Assert.assertTrue("'" + long31 + "' != '" + 0L + "'", long31 == 0L);
// flaky:         org.junit.Assert.assertTrue("'" + long34 + "' != '" + 100L + "'", long34 == 100L);
// flaky:         org.junit.Assert.assertTrue("'" + long35 + "' != '" + (-1L) + "'", long35 == (-1L));
        org.junit.Assert.assertTrue("'" + long36 + "' != '" + (-1L) + "'", long36 == (-1L));
        org.junit.Assert.assertNull(str37);
    }

    @Test
    public void test17231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17231");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        hikariConfig0.setMaxLifetime((long) (short) 10);
        com.zaxxer.hikari.IConnectionCustomizer iConnectionCustomizer3 = hikariConfig0.connectionCustomizer;
        hikariConfig0.setDataSourceClassName("HikariPool-47");
        hikariConfig0.setDataSourceClassName("HikariPool-18");
        boolean boolean8 = hikariConfig0.isRegisterMbeans();
        hikariConfig0.setMinimumPoolSize(0);
        hikariConfig0.setAcquireRetries((int) (byte) 10);
        java.lang.String str13 = hikariConfig0.getPoolName();
        javax.sql.DataSource dataSource14 = hikariConfig0.getDataSource();
        long long15 = hikariConfig0.idleTimeout;
        org.junit.Assert.assertNull(iConnectionCustomizer3);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "HikariPool-42390" + "'", str13, "HikariPool-42390");
        org.junit.Assert.assertNull(dataSource14);
// flaky:         org.junit.Assert.assertTrue("'" + long15 + "' != '" + (-1L) + "'", long15 == (-1L));
    }

    @Test
    public void test17232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17232");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        javax.sql.DataSource dataSource1 = hikariConfig0.getDataSource();
        hikariConfig0.setConnectionTestQuery("");
        hikariConfig0.setInitializationFailFast(false);
        java.lang.String str6 = hikariConfig0.getConnectionInitSql();
        hikariConfig0.setReadOnly(true);
        javax.sql.DataSource dataSource9 = null;
        hikariConfig0.setDataSource(dataSource9);
        hikariConfig0.acquireRetryDelay = 'a';
        long long13 = hikariConfig0.acquireRetryDelay;
        hikariConfig0.setTransactionIsolation("HikariPool-24109");
        boolean boolean16 = hikariConfig0.isAutoCommit;
        org.junit.Assert.assertNull(dataSource1);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 97L + "'", long13 == 97L);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
    }

    @Test
    public void test17233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17233");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        javax.sql.DataSource dataSource1 = hikariConfig0.getDataSource();
        hikariConfig0.setConnectionTestQuery("");
        java.lang.String str4 = hikariConfig0.catalog;
        java.util.Properties properties5 = hikariConfig0.dataSourceProperties;
        long long6 = hikariConfig0.connectionTimeout;
        hikariConfig0.setMinimumPoolSize(100);
        int int9 = hikariConfig0.getTransactionIsolation();
        int int10 = hikariConfig0.getAcquireIncrement();
        org.junit.Assert.assertNull(dataSource1);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNotNull(properties5);
// flaky:         org.junit.Assert.assertTrue("'" + long6 + "' != '" + 32L + "'", long6 == 32L);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
    }

    @Test
    public void test17234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17234");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        javax.sql.DataSource dataSource1 = hikariConfig0.getDataSource();
        hikariConfig0.setConnectionTestQuery("");
        hikariConfig0.setInitializationFailFast(false);
        hikariConfig0.catalog = "";
        javax.sql.DataSource dataSource8 = null;
        hikariConfig0.dataSource = dataSource8;
        javax.sql.DataSource dataSource10 = null;
        hikariConfig0.dataSource = dataSource10;
        int int12 = hikariConfig0.maxPoolSize;
        javax.sql.DataSource dataSource13 = null;
        hikariConfig0.dataSource = dataSource13;
        int int15 = hikariConfig0.getAcquireRetries();
        boolean boolean16 = hikariConfig0.isInitializationFailFast;
        java.lang.Class<?> wildcardClass17 = hikariConfig0.getClass();
        org.junit.Assert.assertNull(dataSource1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 60 + "'", int12 == 60);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 3 + "'", int15 == 3);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test17235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17235");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        javax.sql.DataSource dataSource1 = hikariConfig0.getDataSource();
        hikariConfig0.setConnectionTestQuery("");
        hikariConfig0.setReadOnly(false);
        boolean boolean6 = hikariConfig0.isRegisterMbeans;
        hikariConfig0.setConnectionTestQuery("");
        int int9 = hikariConfig0.getMaximumPoolSize();
        hikariConfig0.connectionTimeout = 3L;
        boolean boolean12 = hikariConfig0.isJdbc4connectionTest;
        org.junit.Assert.assertNull(dataSource1);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 60 + "'", int9 == 60);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
    }

    @Test
    public void test17236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17236");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        javax.sql.DataSource dataSource1 = hikariConfig0.getDataSource();
        hikariConfig0.setConnectionTestQuery("");
        hikariConfig0.connectionCustomizerClassName = "";
        hikariConfig0.setConnectionCustomizerClassName("hi!");
        java.lang.String str8 = hikariConfig0.getCatalog();
        java.util.Properties properties9 = hikariConfig0.dataSourceProperties;
        int int10 = hikariConfig0.minPoolSize;
        long long11 = hikariConfig0.getMaxLifetime();
        hikariConfig0.maxLifetime = 10L;
        hikariConfig0.setLeakDetectionThreshold((long) (byte) 1);
        hikariConfig0.isAutoCommit = false;
        java.util.Properties properties18 = hikariConfig0.dataSourceProperties;
        long long19 = hikariConfig0.leakDetectionThreshold;
        hikariConfig0.setLeakDetectionThreshold((long) 10);
        org.junit.Assert.assertNull(dataSource1);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNotNull(properties9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 10 + "'", int10 == 10);
// flaky:         org.junit.Assert.assertTrue("'" + long11 + "' != '" + 32L + "'", long11 == 32L);
        org.junit.Assert.assertNotNull(properties18);
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 1L + "'", long19 == 1L);
    }

    @Test
    public void test17237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17237");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        javax.sql.DataSource dataSource1 = hikariConfig0.getDataSource();
        hikariConfig0.setConnectionTestQuery("");
        hikariConfig0.setInitializationFailFast(false);
        java.lang.String str6 = hikariConfig0.getConnectionInitSql();
        boolean boolean7 = hikariConfig0.isJdbc4connectionTest;
        boolean boolean8 = hikariConfig0.isRegisterMbeans();
        hikariConfig0.isInitializationFailFast = true;
        hikariConfig0.setIsolateInternalQueries(true);
        long long13 = hikariConfig0.maxLifetime;
        boolean boolean14 = hikariConfig0.isIsolateInternalQueries();
        javax.sql.DataSource dataSource15 = hikariConfig0.getDataSource();
        hikariConfig0.setMaximumPoolSize(97);
        java.lang.String str18 = hikariConfig0.getConnectionInitSql();
        org.junit.Assert.assertNull(dataSource1);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
// flaky:         org.junit.Assert.assertTrue("'" + long13 + "' != '" + 32L + "'", long13 == 32L);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNull(dataSource15);
        org.junit.Assert.assertNull(str18);
    }

    @Test
    public void test17238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17238");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        javax.sql.DataSource dataSource1 = hikariConfig0.getDataSource();
        hikariConfig0.setConnectionTestQuery("");
        hikariConfig0.connectionCustomizerClassName = "";
        com.zaxxer.hikari.IConnectionCustomizer iConnectionCustomizer6 = hikariConfig0.connectionCustomizer;
        java.lang.String str7 = hikariConfig0.jdbcUrl;
        boolean boolean8 = hikariConfig0.isReadOnly;
        java.lang.String str9 = hikariConfig0.jdbcUrl;
        long long10 = hikariConfig0.idleTimeout;
        hikariConfig0.minPoolSize = (byte) 100;
        hikariConfig0.setAcquireRetryDelay((long) 35);
        com.zaxxer.hikari.HikariConfig hikariConfig15 = new com.zaxxer.hikari.HikariConfig();
        javax.sql.DataSource dataSource16 = hikariConfig15.getDataSource();
        hikariConfig15.setConnectionTestQuery("");
        hikariConfig15.connectionCustomizerClassName = "";
        hikariConfig15.setConnectionCustomizerClassName("hi!");
        java.lang.String str23 = hikariConfig15.getCatalog();
        boolean boolean24 = hikariConfig15.isRegisterMbeans;
        hikariConfig15.setAcquireRetries(0);
        hikariConfig15.isAutoCommit = true;
        java.lang.String str29 = hikariConfig15.getDataSourceClassName();
        java.lang.String str30 = hikariConfig15.poolName;
        hikariConfig15.dataSourceClassName = "";
        java.util.Properties properties33 = hikariConfig15.dataSourceProperties;
        com.zaxxer.hikari.HikariConfig hikariConfig34 = new com.zaxxer.hikari.HikariConfig(properties33);
        com.zaxxer.hikari.HikariConfig hikariConfig35 = new com.zaxxer.hikari.HikariConfig(properties33);
        hikariConfig0.dataSourceProperties = properties33;
        com.zaxxer.hikari.HikariConfig hikariConfig37 = new com.zaxxer.hikari.HikariConfig(properties33);
        org.junit.Assert.assertNull(dataSource1);
        org.junit.Assert.assertNull(iConnectionCustomizer6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(str9);
// flaky:         org.junit.Assert.assertTrue("'" + long10 + "' != '" + (-1L) + "'", long10 == (-1L));
        org.junit.Assert.assertNull(dataSource16);
        org.junit.Assert.assertNull(str23);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNull(str29);
// flaky:         org.junit.Assert.assertEquals("'" + str30 + "' != '" + "HikariPool-42399" + "'", str30, "HikariPool-42399");
        org.junit.Assert.assertNotNull(properties33);
    }

    @Test
    public void test17239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17239");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        javax.sql.DataSource dataSource1 = hikariConfig0.getDataSource();
        hikariConfig0.setConnectionTestQuery("");
        hikariConfig0.setInitializationFailFast(false);
        hikariConfig0.catalog = "";
        javax.sql.DataSource dataSource8 = null;
        hikariConfig0.dataSource = dataSource8;
        javax.sql.DataSource dataSource10 = null;
        hikariConfig0.dataSource = dataSource10;
        int int12 = hikariConfig0.maxPoolSize;
        long long13 = hikariConfig0.getIdleTimeout();
        hikariConfig0.connectionTestQuery = "HikariPool-47";
        java.util.Properties properties16 = null;
        hikariConfig0.dataSourceProperties = properties16;
        hikariConfig0.catalog = "HikariPool-931";
        long long20 = hikariConfig0.leakDetectionThreshold;
        boolean boolean21 = hikariConfig0.isReadOnly;
        hikariConfig0.setConnectionInitSql("HikariPool-3361");
        hikariConfig0.dataSourceClassName = "HikariPool-3542";
        hikariConfig0.jdbcUrl = "HikariPool-963";
        java.lang.String str28 = hikariConfig0.getDataSourceClassName();
        hikariConfig0.poolName = "HikariPool-563";
        org.junit.Assert.assertNull(dataSource1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 60 + "'", int12 == 60);
// flaky:         org.junit.Assert.assertTrue("'" + long13 + "' != '" + (-1L) + "'", long13 == (-1L));
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 0L + "'", long20 == 0L);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "HikariPool-3542" + "'", str28, "HikariPool-3542");
    }

    @Test
    public void test17240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17240");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        javax.sql.DataSource dataSource1 = hikariConfig0.getDataSource();
        hikariConfig0.setConnectionTestQuery("");
        hikariConfig0.connectionCustomizerClassName = "";
        hikariConfig0.setConnectionCustomizerClassName("hi!");
        java.lang.String str8 = hikariConfig0.getCatalog();
        java.util.Properties properties9 = hikariConfig0.dataSourceProperties;
        int int10 = hikariConfig0.minPoolSize;
        long long11 = hikariConfig0.getMaxLifetime();
        hikariConfig0.maxLifetime = 10L;
        hikariConfig0.connectionInitSql = "";
        hikariConfig0.idleTimeout = 1L;
        long long18 = hikariConfig0.getConnectionTimeout();
        com.zaxxer.hikari.HikariConfig hikariConfig20 = new com.zaxxer.hikari.HikariConfig();
        java.lang.String str21 = hikariConfig20.getConnectionInitSql();
        long long22 = hikariConfig20.getLeakDetectionThreshold();
        hikariConfig20.leakDetectionThreshold = (-1);
        long long25 = hikariConfig20.acquireRetryDelay;
        long long26 = hikariConfig20.getIdleTimeout();
        hikariConfig20.setAcquireIncrement((int) (short) 10);
        hikariConfig0.addDataSourceProperty("HikariPool-2359", (java.lang.Object) hikariConfig20);
        javax.sql.DataSource dataSource30 = null;
        hikariConfig20.setDataSource(dataSource30);
        com.zaxxer.hikari.IConnectionCustomizer iConnectionCustomizer32 = hikariConfig20.connectionCustomizer;
        int int33 = hikariConfig20.minPoolSize;
        org.junit.Assert.assertNull(dataSource1);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNotNull(properties9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 10 + "'", int10 == 10);
// flaky:         org.junit.Assert.assertTrue("'" + long11 + "' != '" + 32L + "'", long11 == 32L);
// flaky:         org.junit.Assert.assertTrue("'" + long18 + "' != '" + 32L + "'", long18 == 32L);
        org.junit.Assert.assertNull(str21);
        org.junit.Assert.assertTrue("'" + long22 + "' != '" + 0L + "'", long22 == 0L);
// flaky:         org.junit.Assert.assertTrue("'" + long25 + "' != '" + 100L + "'", long25 == 100L);
// flaky:         org.junit.Assert.assertTrue("'" + long26 + "' != '" + (-1L) + "'", long26 == (-1L));
        org.junit.Assert.assertNull(iConnectionCustomizer32);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 10 + "'", int33 == 10);
    }

    @Test
    public void test17241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17241");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        javax.sql.DataSource dataSource1 = hikariConfig0.getDataSource();
        hikariConfig0.setConnectionTestQuery("");
        hikariConfig0.connectionCustomizerClassName = "";
        hikariConfig0.setConnectionCustomizerClassName("hi!");
        java.lang.String str8 = hikariConfig0.getCatalog();
        com.zaxxer.hikari.IConnectionCustomizer iConnectionCustomizer9 = null;
        hikariConfig0.connectionCustomizer = iConnectionCustomizer9;
        java.lang.String str11 = hikariConfig0.getPoolName();
        int int12 = hikariConfig0.getMinimumPoolSize();
        hikariConfig0.maxPoolSize = (-1);
        hikariConfig0.transactionIsolationName = "HikariPool-435";
        boolean boolean17 = hikariConfig0.isJdbc4connectionTest;
        org.junit.Assert.assertNull(dataSource1);
        org.junit.Assert.assertNull(str8);
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "HikariPool-42407" + "'", str11, "HikariPool-42407");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 10 + "'", int12 == 10);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
    }

    @Test
    public void test17242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17242");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        javax.sql.DataSource dataSource1 = hikariConfig0.getDataSource();
        hikariConfig0.setConnectionTestQuery("");
        hikariConfig0.connectionCustomizerClassName = "";
        hikariConfig0.setConnectionCustomizerClassName("hi!");
        java.lang.String str8 = hikariConfig0.getCatalog();
        java.util.Properties properties9 = hikariConfig0.dataSourceProperties;
        com.zaxxer.hikari.HikariConfig hikariConfig11 = new com.zaxxer.hikari.HikariConfig();
        java.lang.String str12 = hikariConfig11.getConnectionInitSql();
        long long13 = hikariConfig11.getLeakDetectionThreshold();
        hikariConfig11.leakDetectionThreshold = (-1);
        long long16 = hikariConfig11.acquireRetryDelay;
        boolean boolean17 = hikariConfig11.isRegisterMbeans;
        hikariConfig0.addDataSourceProperty("HikariPool-47", (java.lang.Object) boolean17);
        java.util.Properties properties19 = hikariConfig0.getDataSourceProperties();
        hikariConfig0.setMaxLifetime((long) 3);
        boolean boolean22 = hikariConfig0.isRegisterMbeans();
        com.zaxxer.hikari.HikariConfig hikariConfig24 = new com.zaxxer.hikari.HikariConfig();
        hikariConfig24.setMaxLifetime((long) (short) 10);
        com.zaxxer.hikari.IConnectionCustomizer iConnectionCustomizer27 = hikariConfig24.connectionCustomizer;
        hikariConfig24.setDataSourceClassName("HikariPool-47");
        hikariConfig24.setDataSourceClassName("HikariPool-18");
        boolean boolean32 = hikariConfig24.isRegisterMbeans();
        java.lang.String str33 = hikariConfig24.getDataSourceClassName();
        boolean boolean34 = hikariConfig24.isIsolateInternalQueries;
        hikariConfig24.isInitializationFailFast = false;
        hikariConfig24.setInitializationFailFast(false);
        hikariConfig0.addDataSourceProperty("HikariPool-625", (java.lang.Object) false);
        javax.sql.DataSource dataSource40 = hikariConfig0.dataSource;
        hikariConfig0.connectionTimeout = 5000L;
        hikariConfig0.setAcquireIncrement((int) (short) 10);
        com.zaxxer.hikari.HikariConfig hikariConfig46 = new com.zaxxer.hikari.HikariConfig();
        java.lang.String str47 = hikariConfig46.getConnectionInitSql();
        long long48 = hikariConfig46.getLeakDetectionThreshold();
        hikariConfig46.leakDetectionThreshold = (-1);
        long long51 = hikariConfig46.acquireRetryDelay;
        long long52 = hikariConfig46.getIdleTimeout();
        hikariConfig46.setAcquireIncrement((int) (short) 10);
        boolean boolean55 = hikariConfig46.isReadOnly;
        hikariConfig0.addDataSourceProperty("HikariPool-28046", (java.lang.Object) boolean55);
        org.junit.Assert.assertNull(dataSource1);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNotNull(properties9);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 0L + "'", long13 == 0L);
// flaky:         org.junit.Assert.assertTrue("'" + long16 + "' != '" + 100L + "'", long16 == 100L);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(properties19);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNull(iConnectionCustomizer27);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "HikariPool-18" + "'", str33, "HikariPool-18");
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertNull(dataSource40);
        org.junit.Assert.assertNull(str47);
        org.junit.Assert.assertTrue("'" + long48 + "' != '" + 0L + "'", long48 == 0L);
// flaky:         org.junit.Assert.assertTrue("'" + long51 + "' != '" + 100L + "'", long51 == 100L);
// flaky:         org.junit.Assert.assertTrue("'" + long52 + "' != '" + (-1L) + "'", long52 == (-1L));
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + false + "'", boolean55 == false);
    }

    @Test
    public void test17243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17243");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        javax.sql.DataSource dataSource1 = hikariConfig0.getDataSource();
        hikariConfig0.setConnectionTestQuery("");
        hikariConfig0.setInitializationFailFast(false);
        long long6 = hikariConfig0.getConnectionTimeout();
        hikariConfig0.setJdbcUrl("HikariPool-47");
        hikariConfig0.setCatalog("HikariPool-135");
        com.zaxxer.hikari.IConnectionCustomizer iConnectionCustomizer11 = null;
        hikariConfig0.connectionCustomizer = iConnectionCustomizer11;
        int int13 = hikariConfig0.getMaximumPoolSize();
        org.junit.Assert.assertNull(dataSource1);
// flaky:         org.junit.Assert.assertTrue("'" + long6 + "' != '" + 32L + "'", long6 == 32L);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 60 + "'", int13 == 60);
    }

    @Test
    public void test17244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17244");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        javax.sql.DataSource dataSource1 = hikariConfig0.getDataSource();
        hikariConfig0.setConnectionTestQuery("");
        hikariConfig0.setInitializationFailFast(false);
        hikariConfig0.catalog = "";
        javax.sql.DataSource dataSource8 = null;
        hikariConfig0.dataSource = dataSource8;
        javax.sql.DataSource dataSource10 = null;
        hikariConfig0.dataSource = dataSource10;
        int int12 = hikariConfig0.maxPoolSize;
        long long13 = hikariConfig0.getIdleTimeout();
        hikariConfig0.connectionTestQuery = "HikariPool-47";
        hikariConfig0.setConnectionTestQuery("HikariPool-427");
        hikariConfig0.connectionTimeout = 100L;
        hikariConfig0.setConnectionTestQuery("");
        org.junit.Assert.assertNull(dataSource1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 60 + "'", int12 == 60);
// flaky:         org.junit.Assert.assertTrue("'" + long13 + "' != '" + (-1L) + "'", long13 == (-1L));
    }

    @Test
    public void test17245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17245");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        javax.sql.DataSource dataSource1 = hikariConfig0.getDataSource();
        hikariConfig0.setConnectionTestQuery("");
        hikariConfig0.setInitializationFailFast(false);
        long long6 = hikariConfig0.getConnectionTimeout();
        hikariConfig0.setJdbcUrl("HikariPool-47");
        hikariConfig0.isIsolateInternalQueries = false;
        hikariConfig0.connectionTestQuery = "HikariPool-62";
        java.lang.String str13 = hikariConfig0.poolName;
        hikariConfig0.setPoolName("HikariPool-516");
        hikariConfig0.poolName = "HikariPool-3005";
        long long18 = hikariConfig0.getIdleTimeout();
        java.lang.String str19 = hikariConfig0.transactionIsolationName;
        org.junit.Assert.assertNull(dataSource1);
// flaky:         org.junit.Assert.assertTrue("'" + long6 + "' != '" + 32L + "'", long6 == 32L);
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "HikariPool-42414" + "'", str13, "HikariPool-42414");
// flaky:         org.junit.Assert.assertTrue("'" + long18 + "' != '" + (-1L) + "'", long18 == (-1L));
        org.junit.Assert.assertNull(str19);
    }

    @Test
    public void test17246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17246");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        javax.sql.DataSource dataSource1 = hikariConfig0.getDataSource();
        hikariConfig0.setConnectionTestQuery("");
        hikariConfig0.connectionCustomizerClassName = "";
        hikariConfig0.setConnectionCustomizerClassName("hi!");
        java.lang.String str8 = hikariConfig0.getCatalog();
        boolean boolean9 = hikariConfig0.isRegisterMbeans;
        int int10 = hikariConfig0.getMaximumPoolSize();
        boolean boolean11 = hikariConfig0.isRegisterMbeans;
        hikariConfig0.setJdbcUrl("HikariPool-2273");
        hikariConfig0.setPoolName("HikariPool-196");
        hikariConfig0.isReadOnly = false;
        long long18 = hikariConfig0.idleTimeout;
        org.junit.Assert.assertNull(dataSource1);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 60 + "'", int10 == 60);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
// flaky:         org.junit.Assert.assertTrue("'" + long18 + "' != '" + (-1L) + "'", long18 == (-1L));
    }

    @Test
    public void test17247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17247");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        java.lang.String str1 = hikariConfig0.getConnectionInitSql();
        long long2 = hikariConfig0.getLeakDetectionThreshold();
        int int3 = hikariConfig0.getMaximumPoolSize();
        java.lang.String str4 = hikariConfig0.connectionCustomizerClassName;
        hikariConfig0.maxLifetime = (short) 0;
        hikariConfig0.isAutoCommit = true;
        com.zaxxer.hikari.HikariConfig hikariConfig9 = new com.zaxxer.hikari.HikariConfig();
        java.lang.String str10 = hikariConfig9.getConnectionInitSql();
        long long11 = hikariConfig9.getLeakDetectionThreshold();
        hikariConfig9.leakDetectionThreshold = (byte) 0;
        hikariConfig9.acquireRetryDelay = 3L;
        hikariConfig9.poolName = "HikariPool-66";
        com.zaxxer.hikari.HikariConfig hikariConfig18 = new com.zaxxer.hikari.HikariConfig();
        javax.sql.DataSource dataSource19 = hikariConfig18.getDataSource();
        hikariConfig18.setConnectionTestQuery("");
        hikariConfig18.connectionCustomizerClassName = "";
        hikariConfig18.setConnectionCustomizerClassName("hi!");
        java.lang.String str26 = hikariConfig18.getCatalog();
        boolean boolean27 = hikariConfig18.isRegisterMbeans;
        hikariConfig18.setAcquireRetries(0);
        hikariConfig18.setMaximumPoolSize((int) '#');
        hikariConfig18.setTransactionIsolation("hi!");
        boolean boolean34 = hikariConfig18.isInitializationFailFast();
        java.lang.String str35 = hikariConfig18.connectionInitSql;
        hikariConfig18.maxPoolSize = 0;
        java.util.Properties properties38 = hikariConfig18.getDataSourceProperties();
        hikariConfig9.setDataSourceProperties(properties38);
        com.zaxxer.hikari.HikariConfig hikariConfig40 = new com.zaxxer.hikari.HikariConfig(properties38);
        hikariConfig0.dataSourceProperties = properties38;
        java.lang.String str42 = hikariConfig0.connectionCustomizerClassName;
        java.lang.String str43 = hikariConfig0.connectionTestQuery;
        java.lang.String str44 = hikariConfig0.jdbcUrl;
        java.lang.String str45 = hikariConfig0.getConnectionInitSql();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 60 + "'", int3 == 60);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 0L + "'", long11 == 0L);
        org.junit.Assert.assertNull(dataSource19);
        org.junit.Assert.assertNull(str26);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertNull(str35);
        org.junit.Assert.assertNotNull(properties38);
        org.junit.Assert.assertNull(str42);
        org.junit.Assert.assertNull(str43);
        org.junit.Assert.assertNull(str44);
        org.junit.Assert.assertNull(str45);
    }

    @Test
    public void test17248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17248");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        javax.sql.DataSource dataSource1 = hikariConfig0.getDataSource();
        hikariConfig0.setConnectionTestQuery("");
        hikariConfig0.setInitializationFailFast(false);
        hikariConfig0.poolName = "";
        int int8 = hikariConfig0.getTransactionIsolation();
        hikariConfig0.setCatalog("HikariPool-93");
        boolean boolean11 = hikariConfig0.isAutoCommit;
        int int12 = hikariConfig0.getAcquireIncrement();
        hikariConfig0.isReadOnly = false;
        java.util.Properties properties15 = hikariConfig0.dataSourceProperties;
        org.junit.Assert.assertNull(dataSource1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertNotNull(properties15);
    }

    @Test
    public void test17249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17249");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        java.lang.String str1 = hikariConfig0.getConnectionInitSql();
        long long2 = hikariConfig0.getLeakDetectionThreshold();
        hikariConfig0.leakDetectionThreshold = (-1);
        long long5 = hikariConfig0.acquireRetryDelay;
        boolean boolean6 = hikariConfig0.isRegisterMbeans;
        hikariConfig0.connectionTimeout = (short) 10;
        hikariConfig0.setPoolName("HikariPool-16");
        int int11 = hikariConfig0.acquireRetries;
        hikariConfig0.connectionCustomizerClassName = "HikariPool-538";
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
// flaky:         org.junit.Assert.assertTrue("'" + long5 + "' != '" + 100L + "'", long5 == 100L);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 3 + "'", int11 == 3);
    }

    @Test
    public void test17250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17250");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        java.lang.String str1 = hikariConfig0.getConnectionInitSql();
        long long2 = hikariConfig0.getLeakDetectionThreshold();
        hikariConfig0.leakDetectionThreshold = (byte) 0;
        hikariConfig0.acquireRetryDelay = 3L;
        hikariConfig0.poolName = "HikariPool-66";
        com.zaxxer.hikari.HikariConfig hikariConfig9 = new com.zaxxer.hikari.HikariConfig();
        javax.sql.DataSource dataSource10 = hikariConfig9.getDataSource();
        hikariConfig9.setConnectionTestQuery("");
        hikariConfig9.connectionCustomizerClassName = "";
        hikariConfig9.setConnectionCustomizerClassName("hi!");
        java.lang.String str17 = hikariConfig9.getCatalog();
        boolean boolean18 = hikariConfig9.isRegisterMbeans;
        hikariConfig9.setAcquireRetries(0);
        hikariConfig9.setMaximumPoolSize((int) '#');
        hikariConfig9.setTransactionIsolation("hi!");
        boolean boolean25 = hikariConfig9.isInitializationFailFast();
        java.lang.String str26 = hikariConfig9.connectionInitSql;
        hikariConfig9.maxPoolSize = 0;
        java.util.Properties properties29 = hikariConfig9.getDataSourceProperties();
        hikariConfig0.setDataSourceProperties(properties29);
        boolean boolean31 = hikariConfig0.isJdbc4connectionTest;
        java.util.Properties properties32 = hikariConfig0.getDataSourceProperties();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertNull(dataSource10);
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNull(str26);
        org.junit.Assert.assertNotNull(properties29);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + true + "'", boolean31 == true);
        org.junit.Assert.assertNotNull(properties32);
    }

    @Test
    public void test17251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17251");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        java.lang.String str1 = hikariConfig0.getConnectionInitSql();
        long long2 = hikariConfig0.getLeakDetectionThreshold();
        int int3 = hikariConfig0.getMaximumPoolSize();
        long long4 = hikariConfig0.getIdleTimeout();
        int int5 = hikariConfig0.maxPoolSize;
        java.lang.String str6 = hikariConfig0.getConnectionCustomizerClassName();
        hikariConfig0.setAcquireRetries(0);
        java.lang.String str9 = hikariConfig0.getConnectionTestQuery();
        hikariConfig0.setIsolateInternalQueries(false);
        int int12 = hikariConfig0.getMaximumPoolSize();
        boolean boolean13 = hikariConfig0.isRegisterMbeans;
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 60 + "'", int3 == 60);
// flaky:         org.junit.Assert.assertTrue("'" + long4 + "' != '" + (-1L) + "'", long4 == (-1L));
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 60 + "'", int5 == 60);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 60 + "'", int12 == 60);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test17252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17252");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        javax.sql.DataSource dataSource1 = hikariConfig0.getDataSource();
        hikariConfig0.setConnectionTestQuery("");
        hikariConfig0.connectionCustomizerClassName = "";
        hikariConfig0.setConnectionCustomizerClassName("hi!");
        java.lang.String str8 = hikariConfig0.getCatalog();
        boolean boolean9 = hikariConfig0.isRegisterMbeans;
        hikariConfig0.setAcquireRetries(0);
        hikariConfig0.setMaximumPoolSize((int) '#');
        hikariConfig0.setTransactionIsolation("hi!");
        boolean boolean16 = hikariConfig0.isInitializationFailFast();
        java.lang.String str17 = hikariConfig0.connectionInitSql;
        long long18 = hikariConfig0.connectionTimeout;
        java.lang.String str19 = hikariConfig0.connectionTestQuery;
        hikariConfig0.catalog = "HikariPool-1078";
        hikariConfig0.setLeakDetectionThreshold((long) (byte) 0);
        javax.sql.DataSource dataSource24 = hikariConfig0.dataSource;
        hikariConfig0.setIdleTimeout((long) 52);
        boolean boolean27 = hikariConfig0.isAutoCommit();
        org.junit.Assert.assertNull(dataSource1);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNull(str17);
// flaky:         org.junit.Assert.assertTrue("'" + long18 + "' != '" + 32L + "'", long18 == 32L);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertNull(dataSource24);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
    }

    @Test
    public void test17253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17253");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        javax.sql.DataSource dataSource1 = hikariConfig0.getDataSource();
        hikariConfig0.setConnectionTestQuery("");
        javax.sql.DataSource dataSource4 = null;
        hikariConfig0.setDataSource(dataSource4);
        long long6 = hikariConfig0.connectionTimeout;
        hikariConfig0.setPoolName("HikariPool-20928");
        com.zaxxer.hikari.HikariConfig hikariConfig9 = new com.zaxxer.hikari.HikariConfig();
        javax.sql.DataSource dataSource10 = hikariConfig9.getDataSource();
        hikariConfig9.setConnectionTestQuery("");
        hikariConfig9.connectionCustomizerClassName = "";
        hikariConfig9.setConnectionCustomizerClassName("hi!");
        java.lang.String str17 = hikariConfig9.getCatalog();
        java.util.Properties properties18 = hikariConfig9.dataSourceProperties;
        com.zaxxer.hikari.HikariConfig hikariConfig20 = new com.zaxxer.hikari.HikariConfig();
        java.lang.String str21 = hikariConfig20.getConnectionInitSql();
        long long22 = hikariConfig20.getLeakDetectionThreshold();
        hikariConfig20.leakDetectionThreshold = (-1);
        long long25 = hikariConfig20.acquireRetryDelay;
        boolean boolean26 = hikariConfig20.isRegisterMbeans;
        hikariConfig9.addDataSourceProperty("HikariPool-47", (java.lang.Object) boolean26);
        java.util.Properties properties28 = hikariConfig9.getDataSourceProperties();
        hikariConfig9.setMaxLifetime((long) 3);
        hikariConfig9.setReadOnly(true);
        hikariConfig9.poolName = "HikariPool-415";
        java.util.Properties properties35 = hikariConfig9.getDataSourceProperties();
        hikariConfig0.dataSourceProperties = properties35;
        org.junit.Assert.assertNull(dataSource1);
// flaky:         org.junit.Assert.assertTrue("'" + long6 + "' != '" + 32L + "'", long6 == 32L);
        org.junit.Assert.assertNull(dataSource10);
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertNotNull(properties18);
        org.junit.Assert.assertNull(str21);
        org.junit.Assert.assertTrue("'" + long22 + "' != '" + 0L + "'", long22 == 0L);
// flaky:         org.junit.Assert.assertTrue("'" + long25 + "' != '" + 100L + "'", long25 == 100L);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNotNull(properties28);
        org.junit.Assert.assertNotNull(properties35);
    }

    @Test
    public void test17254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17254");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        javax.sql.DataSource dataSource1 = hikariConfig0.getDataSource();
        hikariConfig0.setConnectionTestQuery("");
        hikariConfig0.setInitializationFailFast(false);
        long long6 = hikariConfig0.getConnectionTimeout();
        java.util.Properties properties7 = hikariConfig0.dataSourceProperties;
        boolean boolean8 = hikariConfig0.isReadOnly;
        hikariConfig0.setLeakDetectionThreshold((long) ' ');
        long long11 = hikariConfig0.maxLifetime;
        hikariConfig0.setLeakDetectionThreshold((long) 52);
        java.lang.String str14 = hikariConfig0.getConnectionCustomizerClassName();
        int int15 = hikariConfig0.transactionIsolation;
        org.junit.Assert.assertNull(dataSource1);
// flaky:         org.junit.Assert.assertTrue("'" + long6 + "' != '" + 32L + "'", long6 == 32L);
        org.junit.Assert.assertNotNull(properties7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
// flaky:         org.junit.Assert.assertTrue("'" + long11 + "' != '" + 32L + "'", long11 == 32L);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
    }

    @Test
    public void test17255() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17255");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        java.lang.String str1 = hikariConfig0.getConnectionInitSql();
        long long2 = hikariConfig0.getLeakDetectionThreshold();
        int int3 = hikariConfig0.getMaximumPoolSize();
        long long4 = hikariConfig0.getIdleTimeout();
        int int5 = hikariConfig0.maxPoolSize;
        java.lang.String str6 = hikariConfig0.getConnectionCustomizerClassName();
        hikariConfig0.setAcquireRetries(0);
        java.lang.String str9 = hikariConfig0.getConnectionTestQuery();
        hikariConfig0.setIsolateInternalQueries(false);
        boolean boolean12 = hikariConfig0.isReadOnly();
        boolean boolean13 = hikariConfig0.isJdbc4ConnectionTest();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 60 + "'", int3 == 60);
// flaky:         org.junit.Assert.assertTrue("'" + long4 + "' != '" + (-1L) + "'", long4 == (-1L));
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 60 + "'", int5 == 60);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
    }

    @Test
    public void test17256() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17256");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        java.lang.String str1 = hikariConfig0.getConnectionInitSql();
        long long2 = hikariConfig0.getLeakDetectionThreshold();
        int int3 = hikariConfig0.getMaximumPoolSize();
        com.zaxxer.hikari.IConnectionCustomizer iConnectionCustomizer4 = hikariConfig0.connectionCustomizer;
        hikariConfig0.catalog = "HikariPool-491";
        hikariConfig0.setMaxLifetime(60L);
        long long9 = hikariConfig0.getAcquireRetryDelay();
        hikariConfig0.connectionInitSql = "HikariPool-3452";
        hikariConfig0.idleTimeout = 60L;
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 60 + "'", int3 == 60);
        org.junit.Assert.assertNull(iConnectionCustomizer4);
// flaky:         org.junit.Assert.assertTrue("'" + long9 + "' != '" + 100L + "'", long9 == 100L);
    }

    @Test
    public void test17257() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17257");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        java.lang.String str1 = hikariConfig0.getConnectionInitSql();
        long long2 = hikariConfig0.getLeakDetectionThreshold();
        com.zaxxer.hikari.IConnectionCustomizer iConnectionCustomizer3 = null;
        hikariConfig0.connectionCustomizer = iConnectionCustomizer3;
        hikariConfig0.acquireRetries = 0;
        long long7 = hikariConfig0.getMaxLifetime();
        com.zaxxer.hikari.HikariConfig hikariConfig8 = new com.zaxxer.hikari.HikariConfig();
        javax.sql.DataSource dataSource9 = hikariConfig8.getDataSource();
        hikariConfig8.setConnectionTestQuery("");
        hikariConfig8.connectionCustomizerClassName = "";
        hikariConfig8.setConnectionCustomizerClassName("hi!");
        java.lang.String str16 = hikariConfig8.getCatalog();
        boolean boolean17 = hikariConfig8.isRegisterMbeans;
        long long18 = hikariConfig8.connectionTimeout;
        com.zaxxer.hikari.HikariConfig hikariConfig19 = new com.zaxxer.hikari.HikariConfig();
        javax.sql.DataSource dataSource20 = hikariConfig19.getDataSource();
        hikariConfig19.setConnectionTestQuery("");
        hikariConfig19.connectionCustomizerClassName = "";
        hikariConfig19.setConnectionCustomizerClassName("hi!");
        java.lang.String str27 = hikariConfig19.getCatalog();
        java.util.Properties properties28 = hikariConfig19.dataSourceProperties;
        com.zaxxer.hikari.HikariConfig hikariConfig30 = new com.zaxxer.hikari.HikariConfig();
        java.lang.String str31 = hikariConfig30.getConnectionInitSql();
        long long32 = hikariConfig30.getLeakDetectionThreshold();
        hikariConfig30.leakDetectionThreshold = (-1);
        long long35 = hikariConfig30.acquireRetryDelay;
        boolean boolean36 = hikariConfig30.isRegisterMbeans;
        hikariConfig19.addDataSourceProperty("HikariPool-47", (java.lang.Object) boolean36);
        java.util.Properties properties38 = hikariConfig19.getDataSourceProperties();
        hikariConfig19.transactionIsolationName = "HikariPool-18";
        java.util.Properties properties41 = hikariConfig19.getDataSourceProperties();
        hikariConfig8.setDataSourceProperties(properties41);
        hikariConfig0.setDataSourceProperties(properties41);
        com.zaxxer.hikari.HikariConfig hikariConfig44 = new com.zaxxer.hikari.HikariConfig();
        java.lang.String str45 = hikariConfig44.getConnectionInitSql();
        hikariConfig44.acquireIncrement = 0;
        hikariConfig44.maxLifetime = 100;
        java.lang.String str50 = hikariConfig44.connectionInitSql;
        hikariConfig44.setTransactionIsolation("HikariPool-47");
        hikariConfig44.minPoolSize = 100;
        java.lang.String str55 = hikariConfig44.getDataSourceClassName();
        hikariConfig44.transactionIsolation = (-1);
        java.util.Properties properties58 = hikariConfig44.getDataSourceProperties();
        hikariConfig0.setDataSourceProperties(properties58);
        hikariConfig0.setCatalog("HikariPool-3733");
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
// flaky:         org.junit.Assert.assertTrue("'" + long7 + "' != '" + 32L + "'", long7 == 32L);
        org.junit.Assert.assertNull(dataSource9);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
// flaky:         org.junit.Assert.assertTrue("'" + long18 + "' != '" + 32L + "'", long18 == 32L);
        org.junit.Assert.assertNull(dataSource20);
        org.junit.Assert.assertNull(str27);
        org.junit.Assert.assertNotNull(properties28);
        org.junit.Assert.assertNull(str31);
        org.junit.Assert.assertTrue("'" + long32 + "' != '" + 0L + "'", long32 == 0L);
// flaky:         org.junit.Assert.assertTrue("'" + long35 + "' != '" + 100L + "'", long35 == 100L);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertNotNull(properties38);
        org.junit.Assert.assertNotNull(properties41);
        org.junit.Assert.assertNull(str45);
        org.junit.Assert.assertNull(str50);
        org.junit.Assert.assertNull(str55);
        org.junit.Assert.assertNotNull(properties58);
    }

    @Test
    public void test17258() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17258");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        javax.sql.DataSource dataSource1 = hikariConfig0.getDataSource();
        hikariConfig0.setConnectionTestQuery("");
        hikariConfig0.setInitializationFailFast(false);
        hikariConfig0.poolName = "";
        int int8 = hikariConfig0.getTransactionIsolation();
        int int9 = hikariConfig0.getMinimumPoolSize();
        java.lang.String str10 = hikariConfig0.getPoolName();
        hikariConfig0.connectionTestQuery = "HikariPool-383";
        long long13 = hikariConfig0.getLeakDetectionThreshold();
        long long14 = hikariConfig0.acquireRetryDelay;
        hikariConfig0.setUseInstrumentation(true);
        hikariConfig0.connectionCustomizerClassName = "HikariPool-535";
        java.lang.String str19 = hikariConfig0.connectionCustomizerClassName;
        int int20 = hikariConfig0.minPoolSize;
        org.junit.Assert.assertNull(dataSource1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 10 + "'", int9 == 10);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 0L + "'", long13 == 0L);
// flaky:         org.junit.Assert.assertTrue("'" + long14 + "' != '" + 100L + "'", long14 == 100L);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "HikariPool-535" + "'", str19, "HikariPool-535");
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 10 + "'", int20 == 10);
    }

    @Test
    public void test17259() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17259");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        java.lang.String str1 = hikariConfig0.getConnectionInitSql();
        hikariConfig0.setMaxLifetime(35L);
        hikariConfig0.setAutoCommit(false);
        java.lang.String str6 = hikariConfig0.getCatalog();
        java.lang.String str7 = hikariConfig0.jdbcUrl;
        javax.sql.DataSource dataSource8 = hikariConfig0.dataSource;
        int int9 = hikariConfig0.getAcquireIncrement();
        hikariConfig0.setPoolName("HikariPool-574");
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(dataSource8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
    }

    @Test
    public void test17260() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17260");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        javax.sql.DataSource dataSource1 = hikariConfig0.getDataSource();
        hikariConfig0.setConnectionTestQuery("");
        int int4 = hikariConfig0.getTransactionIsolation();
        boolean boolean5 = hikariConfig0.isRegisterMbeans();
        hikariConfig0.acquireRetryDelay = 1;
        hikariConfig0.setAcquireRetries(0);
        hikariConfig0.setConnectionCustomizerClassName("HikariPool-922");
        hikariConfig0.setConnectionInitSql("HikariPool-134");
        hikariConfig0.maxPoolSize = '#';
        boolean boolean16 = hikariConfig0.isAutoCommit();
        java.lang.String str17 = hikariConfig0.poolName;
        java.lang.String str18 = hikariConfig0.connectionTestQuery;
        org.junit.Assert.assertNull(dataSource1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "HikariPool-42443" + "'", str17, "HikariPool-42443");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
    }

    @Test
    public void test17261() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17261");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        javax.sql.DataSource dataSource1 = hikariConfig0.getDataSource();
        hikariConfig0.setConnectionTestQuery("");
        hikariConfig0.setInitializationFailFast(false);
        hikariConfig0.catalog = "";
        javax.sql.DataSource dataSource8 = hikariConfig0.getDataSource();
        boolean boolean9 = hikariConfig0.isReadOnly;
        hikariConfig0.maxPoolSize = 3;
        int int12 = hikariConfig0.getAcquireIncrement();
        java.util.Properties properties13 = hikariConfig0.getDataSourceProperties();
        boolean boolean14 = hikariConfig0.isAutoCommit;
        hikariConfig0.setJdbc4ConnectionTest(true);
        hikariConfig0.transactionIsolation = 3;
        hikariConfig0.setReadOnly(false);
        javax.sql.DataSource dataSource21 = null;
        hikariConfig0.setDataSource(dataSource21);
        org.junit.Assert.assertNull(dataSource1);
        org.junit.Assert.assertNull(dataSource8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertNotNull(properties13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
    }

    @Test
    public void test17262() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17262");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        javax.sql.DataSource dataSource1 = hikariConfig0.getDataSource();
        hikariConfig0.setConnectionTestQuery("");
        hikariConfig0.connectionCustomizerClassName = "";
        hikariConfig0.setConnectionCustomizerClassName("hi!");
        java.lang.String str8 = hikariConfig0.getCatalog();
        boolean boolean9 = hikariConfig0.isRegisterMbeans;
        hikariConfig0.setAcquireRetries(0);
        long long12 = hikariConfig0.getMaxLifetime();
        hikariConfig0.setReadOnly(false);
        com.zaxxer.hikari.HikariConfig hikariConfig15 = new com.zaxxer.hikari.HikariConfig();
        javax.sql.DataSource dataSource16 = hikariConfig15.getDataSource();
        hikariConfig15.setConnectionTestQuery("");
        hikariConfig15.setInitializationFailFast(false);
        hikariConfig15.catalog = "";
        com.zaxxer.hikari.HikariConfig hikariConfig23 = new com.zaxxer.hikari.HikariConfig();
        javax.sql.DataSource dataSource24 = hikariConfig23.getDataSource();
        hikariConfig23.setConnectionTestQuery("");
        hikariConfig23.connectionCustomizerClassName = "";
        hikariConfig23.setConnectionCustomizerClassName("hi!");
        java.lang.String str31 = hikariConfig23.getCatalog();
        java.util.Properties properties32 = hikariConfig23.dataSourceProperties;
        hikariConfig15.dataSourceProperties = properties32;
        hikariConfig0.setDataSourceProperties(properties32);
        com.zaxxer.hikari.IConnectionCustomizer iConnectionCustomizer35 = null;
        hikariConfig0.connectionCustomizer = iConnectionCustomizer35;
        long long37 = hikariConfig0.getIdleTimeout();
        hikariConfig0.setIdleTimeout(32L);
        hikariConfig0.connectionCustomizerClassName = "HikariPool-103";
        hikariConfig0.setTransactionIsolation("HikariPool-102");
        hikariConfig0.maxLifetime = 97;
        boolean boolean46 = hikariConfig0.isRegisterMbeans;
        hikariConfig0.setRegisterMbeans(true);
        hikariConfig0.setCatalog("HikariPool-2385");
        boolean boolean51 = hikariConfig0.isIsolateInternalQueries;
        org.junit.Assert.assertNull(dataSource1);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
// flaky:         org.junit.Assert.assertTrue("'" + long12 + "' != '" + 32L + "'", long12 == 32L);
        org.junit.Assert.assertNull(dataSource16);
        org.junit.Assert.assertNull(dataSource24);
        org.junit.Assert.assertNull(str31);
        org.junit.Assert.assertNotNull(properties32);
// flaky:         org.junit.Assert.assertTrue("'" + long37 + "' != '" + (-1L) + "'", long37 == (-1L));
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
    }

    @Test
    public void test17263() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17263");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        javax.sql.DataSource dataSource1 = hikariConfig0.getDataSource();
        hikariConfig0.setConnectionTestQuery("");
        hikariConfig0.setInitializationFailFast(false);
        hikariConfig0.catalog = "";
        int int8 = hikariConfig0.getMaximumPoolSize();
        hikariConfig0.leakDetectionThreshold = (short) 10;
        hikariConfig0.isJdbc4connectionTest = true;
        hikariConfig0.isIsolateInternalQueries = false;
        java.lang.String str15 = hikariConfig0.transactionIsolationName;
        hikariConfig0.idleTimeout = 52L;
        com.zaxxer.hikari.HikariConfig hikariConfig18 = new com.zaxxer.hikari.HikariConfig();
        javax.sql.DataSource dataSource19 = hikariConfig18.getDataSource();
        hikariConfig18.setConnectionTestQuery("");
        hikariConfig18.setInitializationFailFast(false);
        hikariConfig18.catalog = "";
        int int26 = hikariConfig18.getMaximumPoolSize();
        com.zaxxer.hikari.IConnectionCustomizer iConnectionCustomizer27 = null;
        hikariConfig18.connectionCustomizer = iConnectionCustomizer27;
        hikariConfig18.setInitializationFailFast(true);
        hikariConfig18.poolName = "HikariPool-1748";
        com.zaxxer.hikari.HikariConfig hikariConfig33 = new com.zaxxer.hikari.HikariConfig();
        javax.sql.DataSource dataSource34 = hikariConfig33.getDataSource();
        hikariConfig33.setConnectionTestQuery("");
        hikariConfig33.connectionCustomizerClassName = "";
        hikariConfig33.setConnectionCustomizerClassName("hi!");
        java.lang.String str41 = hikariConfig33.getCatalog();
        java.util.Properties properties42 = hikariConfig33.dataSourceProperties;
        com.zaxxer.hikari.HikariConfig hikariConfig44 = new com.zaxxer.hikari.HikariConfig();
        java.lang.String str45 = hikariConfig44.getConnectionInitSql();
        long long46 = hikariConfig44.getLeakDetectionThreshold();
        hikariConfig44.leakDetectionThreshold = (-1);
        long long49 = hikariConfig44.acquireRetryDelay;
        boolean boolean50 = hikariConfig44.isRegisterMbeans;
        hikariConfig33.addDataSourceProperty("HikariPool-47", (java.lang.Object) boolean50);
        java.util.Properties properties52 = hikariConfig33.getDataSourceProperties();
        hikariConfig33.setMaxLifetime((long) 3);
        hikariConfig33.setReadOnly(true);
        hikariConfig33.poolName = "HikariPool-415";
        hikariConfig33.setConnectionInitSql("");
        hikariConfig33.setAcquireRetries(52);
        int int63 = hikariConfig33.getMinimumPoolSize();
        java.util.Properties properties64 = hikariConfig33.dataSourceProperties;
        hikariConfig18.dataSourceProperties = properties64;
        hikariConfig0.setDataSourceProperties(properties64);
        // The following exception was thrown during execution in test generation
        try {
            com.zaxxer.hikari.HikariConfig hikariConfig67 = new com.zaxxer.hikari.HikariConfig(properties64);
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException; message: java.beans.IntrospectionException: Method not found: setHikariPool-47");
        } catch (java.lang.RuntimeException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(dataSource1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 60 + "'", int8 == 60);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertNull(dataSource19);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 60 + "'", int26 == 60);
        org.junit.Assert.assertNull(dataSource34);
        org.junit.Assert.assertNull(str41);
        org.junit.Assert.assertNotNull(properties42);
        org.junit.Assert.assertNull(str45);
        org.junit.Assert.assertTrue("'" + long46 + "' != '" + 0L + "'", long46 == 0L);
// flaky:         org.junit.Assert.assertTrue("'" + long49 + "' != '" + 100L + "'", long49 == 100L);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
        org.junit.Assert.assertNotNull(properties52);
        org.junit.Assert.assertTrue("'" + int63 + "' != '" + 10 + "'", int63 == 10);
        org.junit.Assert.assertNotNull(properties64);
    }

    @Test
    public void test17264() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17264");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        javax.sql.DataSource dataSource1 = hikariConfig0.getDataSource();
        hikariConfig0.setConnectionTestQuery("");
        hikariConfig0.connectionCustomizerClassName = "";
        hikariConfig0.setConnectionCustomizerClassName("hi!");
        java.lang.String str8 = hikariConfig0.getCatalog();
        boolean boolean9 = hikariConfig0.isRegisterMbeans;
        com.zaxxer.hikari.HikariConfig hikariConfig11 = new com.zaxxer.hikari.HikariConfig();
        javax.sql.DataSource dataSource12 = hikariConfig11.getDataSource();
        hikariConfig11.setConnectionTestQuery("");
        hikariConfig11.connectionCustomizerClassName = "";
        hikariConfig11.setConnectionCustomizerClassName("hi!");
        java.lang.String str19 = hikariConfig11.getCatalog();
        boolean boolean20 = hikariConfig11.isRegisterMbeans;
        hikariConfig11.setAcquireRetries(0);
        hikariConfig11.setMaximumPoolSize((int) '#');
        hikariConfig0.addDataSourceProperty("HikariPool-47", (java.lang.Object) '#');
        hikariConfig0.setConnectionTestQuery("HikariPool-47");
        java.lang.String str28 = hikariConfig0.connectionInitSql;
        hikariConfig0.connectionTimeout = (short) 1;
        long long31 = hikariConfig0.acquireRetryDelay;
        org.junit.Assert.assertNull(dataSource1);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(dataSource12);
        org.junit.Assert.assertNull(str19);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNull(str28);
// flaky:         org.junit.Assert.assertTrue("'" + long31 + "' != '" + 100L + "'", long31 == 100L);
    }

    @Test
    public void test17265() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17265");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        java.lang.String str1 = hikariConfig0.getConnectionInitSql();
        long long2 = hikariConfig0.getLeakDetectionThreshold();
        int int3 = hikariConfig0.getMaximumPoolSize();
        java.lang.String str4 = hikariConfig0.connectionCustomizerClassName;
        hikariConfig0.maxLifetime = (short) 0;
        java.lang.String str7 = hikariConfig0.poolName;
        hikariConfig0.connectionTimeout = 1L;
        boolean boolean10 = hikariConfig0.isJdbc4connectionTest;
        java.lang.String str11 = hikariConfig0.poolName;
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 60 + "'", int3 == 60);
        org.junit.Assert.assertNull(str4);
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "HikariPool-42457" + "'", str7, "HikariPool-42457");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "HikariPool-42457" + "'", str11, "HikariPool-42457");
    }

    @Test
    public void test17266() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17266");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        javax.sql.DataSource dataSource1 = hikariConfig0.getDataSource();
        hikariConfig0.setConnectionTestQuery("");
        hikariConfig0.connectionCustomizerClassName = "";
        hikariConfig0.setConnectionCustomizerClassName("hi!");
        java.lang.String str8 = hikariConfig0.getCatalog();
        com.zaxxer.hikari.IConnectionCustomizer iConnectionCustomizer9 = null;
        hikariConfig0.connectionCustomizer = iConnectionCustomizer9;
        boolean boolean11 = hikariConfig0.isReadOnly;
        boolean boolean12 = hikariConfig0.isAutoCommit;
        boolean boolean13 = hikariConfig0.isRegisterMbeans();
        java.lang.String str14 = hikariConfig0.connectionCustomizerClassName;
        hikariConfig0.setJdbc4ConnectionTest(true);
        hikariConfig0.setAcquireRetries((int) (short) 0);
        hikariConfig0.setCatalog("HikariPool-29031");
        int int21 = hikariConfig0.transactionIsolation;
        org.junit.Assert.assertNull(dataSource1);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1) + "'", int21 == (-1));
    }

    @Test
    public void test17267() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17267");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        hikariConfig0.setMaxLifetime((long) (short) 10);
        java.lang.String str3 = hikariConfig0.getPoolName();
        hikariConfig0.jdbcUrl = "";
        hikariConfig0.setMaxLifetime(0L);
        hikariConfig0.setTransactionIsolation("HikariPool-48");
        com.zaxxer.hikari.HikariConfig hikariConfig10 = new com.zaxxer.hikari.HikariConfig();
        hikariConfig10.setMaxLifetime((long) (short) 10);
        com.zaxxer.hikari.HikariConfig hikariConfig13 = new com.zaxxer.hikari.HikariConfig();
        javax.sql.DataSource dataSource14 = hikariConfig13.getDataSource();
        hikariConfig13.setConnectionTestQuery("");
        hikariConfig13.setInitializationFailFast(false);
        long long19 = hikariConfig13.getConnectionTimeout();
        java.util.Properties properties20 = hikariConfig13.dataSourceProperties;
        hikariConfig10.dataSourceProperties = properties20;
        hikariConfig0.setDataSourceProperties(properties20);
        java.lang.String str23 = hikariConfig0.getJdbcUrl();
        hikariConfig0.setUseInstrumentation(false);
        hikariConfig0.transactionIsolation = 35;
        hikariConfig0.setDataSourceClassName("HikariPool-35219");
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "HikariPool-42459" + "'", str3, "HikariPool-42459");
        org.junit.Assert.assertNull(dataSource14);
// flaky:         org.junit.Assert.assertTrue("'" + long19 + "' != '" + 32L + "'", long19 == 32L);
        org.junit.Assert.assertNotNull(properties20);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
    }

    @Test
    public void test17268() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17268");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        javax.sql.DataSource dataSource1 = hikariConfig0.getDataSource();
        hikariConfig0.setConnectionTestQuery("");
        hikariConfig0.setInitializationFailFast(false);
        hikariConfig0.catalog = "";
        javax.sql.DataSource dataSource8 = null;
        hikariConfig0.dataSource = dataSource8;
        javax.sql.DataSource dataSource10 = null;
        hikariConfig0.dataSource = dataSource10;
        int int12 = hikariConfig0.maxPoolSize;
        long long13 = hikariConfig0.getIdleTimeout();
        javax.sql.DataSource dataSource14 = hikariConfig0.dataSource;
        hikariConfig0.idleTimeout = (short) 1;
        hikariConfig0.connectionTimeout = 0L;
        com.zaxxer.hikari.IConnectionCustomizer iConnectionCustomizer19 = null;
        hikariConfig0.connectionCustomizer = iConnectionCustomizer19;
        hikariConfig0.idleTimeout = (-1);
        long long23 = hikariConfig0.idleTimeout;
        hikariConfig0.setAutoCommit(false);
        long long26 = hikariConfig0.getIdleTimeout();
        org.junit.Assert.assertNull(dataSource1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 60 + "'", int12 == 60);
// flaky:         org.junit.Assert.assertTrue("'" + long13 + "' != '" + (-1L) + "'", long13 == (-1L));
        org.junit.Assert.assertNull(dataSource14);
        org.junit.Assert.assertTrue("'" + long23 + "' != '" + (-1L) + "'", long23 == (-1L));
        org.junit.Assert.assertTrue("'" + long26 + "' != '" + (-1L) + "'", long26 == (-1L));
    }

    @Test
    public void test17269() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17269");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        java.lang.String str1 = hikariConfig0.getConnectionInitSql();
        hikariConfig0.acquireIncrement = 0;
        hikariConfig0.maxLifetime = 100;
        hikariConfig0.maxPoolSize = (short) 100;
        java.lang.String str8 = hikariConfig0.catalog;
        int int9 = hikariConfig0.getMinimumPoolSize();
        hikariConfig0.connectionCustomizerClassName = "HikariPool-16563";
        java.lang.String str12 = hikariConfig0.connectionInitSql;
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 10 + "'", int9 == 10);
        org.junit.Assert.assertNull(str12);
    }

    @Test
    public void test17270() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17270");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        javax.sql.DataSource dataSource1 = hikariConfig0.getDataSource();
        hikariConfig0.setConnectionTestQuery("");
        hikariConfig0.connectionCustomizerClassName = "";
        hikariConfig0.setConnectionCustomizerClassName("hi!");
        java.lang.String str8 = hikariConfig0.getCatalog();
        boolean boolean9 = hikariConfig0.isRegisterMbeans;
        hikariConfig0.setAcquireRetries(0);
        long long12 = hikariConfig0.getMaxLifetime();
        hikariConfig0.setReadOnly(false);
        com.zaxxer.hikari.HikariConfig hikariConfig15 = new com.zaxxer.hikari.HikariConfig();
        javax.sql.DataSource dataSource16 = hikariConfig15.getDataSource();
        hikariConfig15.setConnectionTestQuery("");
        hikariConfig15.setInitializationFailFast(false);
        hikariConfig15.catalog = "";
        com.zaxxer.hikari.HikariConfig hikariConfig23 = new com.zaxxer.hikari.HikariConfig();
        javax.sql.DataSource dataSource24 = hikariConfig23.getDataSource();
        hikariConfig23.setConnectionTestQuery("");
        hikariConfig23.connectionCustomizerClassName = "";
        hikariConfig23.setConnectionCustomizerClassName("hi!");
        java.lang.String str31 = hikariConfig23.getCatalog();
        java.util.Properties properties32 = hikariConfig23.dataSourceProperties;
        hikariConfig15.dataSourceProperties = properties32;
        hikariConfig0.setDataSourceProperties(properties32);
        com.zaxxer.hikari.IConnectionCustomizer iConnectionCustomizer35 = null;
        hikariConfig0.connectionCustomizer = iConnectionCustomizer35;
        long long37 = hikariConfig0.getIdleTimeout();
        hikariConfig0.setIdleTimeout(32L);
        hikariConfig0.acquireIncrement = ' ';
        hikariConfig0.setDataSourceClassName("HikariPool-3510");
        hikariConfig0.connectionCustomizerClassName = "HikariPool-6321";
        long long46 = hikariConfig0.getAcquireRetryDelay();
        hikariConfig0.connectionTimeout = 0L;
        org.junit.Assert.assertNull(dataSource1);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
// flaky:         org.junit.Assert.assertTrue("'" + long12 + "' != '" + 32L + "'", long12 == 32L);
        org.junit.Assert.assertNull(dataSource16);
        org.junit.Assert.assertNull(dataSource24);
        org.junit.Assert.assertNull(str31);
        org.junit.Assert.assertNotNull(properties32);
// flaky:         org.junit.Assert.assertTrue("'" + long37 + "' != '" + (-1L) + "'", long37 == (-1L));
// flaky:         org.junit.Assert.assertTrue("'" + long46 + "' != '" + 100L + "'", long46 == 100L);
    }

    @Test
    public void test17271() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17271");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        java.lang.String str1 = hikariConfig0.getConnectionInitSql();
        long long2 = hikariConfig0.getLeakDetectionThreshold();
        hikariConfig0.leakDetectionThreshold = (-1);
        int int5 = hikariConfig0.acquireIncrement;
        hikariConfig0.setInitializationFailFast(true);
        boolean boolean8 = hikariConfig0.isAutoCommit();
        hikariConfig0.setTransactionIsolation("");
        long long11 = hikariConfig0.idleTimeout;
        com.zaxxer.hikari.HikariConfig hikariConfig12 = new com.zaxxer.hikari.HikariConfig();
        javax.sql.DataSource dataSource13 = hikariConfig12.getDataSource();
        hikariConfig12.setConnectionTestQuery("");
        hikariConfig12.connectionCustomizerClassName = "";
        hikariConfig12.setConnectionCustomizerClassName("hi!");
        java.lang.String str20 = hikariConfig12.getCatalog();
        com.zaxxer.hikari.IConnectionCustomizer iConnectionCustomizer21 = null;
        hikariConfig12.connectionCustomizer = iConnectionCustomizer21;
        hikariConfig12.setJdbcUrl("HikariPool-38");
        com.zaxxer.hikari.HikariConfig hikariConfig25 = new com.zaxxer.hikari.HikariConfig();
        hikariConfig25.setMaxLifetime((long) (short) 10);
        com.zaxxer.hikari.HikariConfig hikariConfig28 = new com.zaxxer.hikari.HikariConfig();
        javax.sql.DataSource dataSource29 = hikariConfig28.getDataSource();
        hikariConfig28.setConnectionTestQuery("");
        hikariConfig28.setInitializationFailFast(false);
        long long34 = hikariConfig28.getConnectionTimeout();
        java.util.Properties properties35 = hikariConfig28.dataSourceProperties;
        hikariConfig25.dataSourceProperties = properties35;
        hikariConfig12.setDataSourceProperties(properties35);
        hikariConfig0.dataSourceProperties = properties35;
        long long39 = hikariConfig0.getMaxLifetime();
        hikariConfig0.catalog = "HikariPool-97";
        hikariConfig0.setUseInstrumentation(true);
        hikariConfig0.setTransactionIsolation("HikariPool-122");
        java.lang.String str46 = hikariConfig0.connectionCustomizerClassName;
        long long47 = hikariConfig0.connectionTimeout;
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
// flaky:         org.junit.Assert.assertTrue("'" + long11 + "' != '" + (-1L) + "'", long11 == (-1L));
        org.junit.Assert.assertNull(dataSource13);
        org.junit.Assert.assertNull(str20);
        org.junit.Assert.assertNull(dataSource29);
// flaky:         org.junit.Assert.assertTrue("'" + long34 + "' != '" + 32L + "'", long34 == 32L);
        org.junit.Assert.assertNotNull(properties35);
// flaky:         org.junit.Assert.assertTrue("'" + long39 + "' != '" + 32L + "'", long39 == 32L);
        org.junit.Assert.assertNull(str46);
// flaky:         org.junit.Assert.assertTrue("'" + long47 + "' != '" + 32L + "'", long47 == 32L);
    }

    @Test
    public void test17272() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17272");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        hikariConfig0.setMaxLifetime((long) (short) 10);
        int int3 = hikariConfig0.getAcquireRetries();
        hikariConfig0.setInitializationFailFast(true);
        hikariConfig0.setIsolateInternalQueries(true);
        hikariConfig0.setPoolName("HikariPool-4162");
        hikariConfig0.transactionIsolation = 1;
        java.lang.String str12 = hikariConfig0.connectionCustomizerClassName;
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 3 + "'", int3 == 3);
        org.junit.Assert.assertNull(str12);
    }

    @Test
    public void test17273() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17273");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        javax.sql.DataSource dataSource1 = hikariConfig0.getDataSource();
        hikariConfig0.setConnectionTestQuery("");
        hikariConfig0.setInitializationFailFast(false);
        long long6 = hikariConfig0.getConnectionTimeout();
        hikariConfig0.setJdbcUrl("HikariPool-47");
        hikariConfig0.isIsolateInternalQueries = false;
        hikariConfig0.setIsolateInternalQueries(true);
        hikariConfig0.setPoolName("HikariPool-127");
        hikariConfig0.maxPoolSize = 10;
        hikariConfig0.setConnectionInitSql("HikariPool-1050");
        hikariConfig0.setCatalog("HikariPool-937");
        hikariConfig0.setTransactionIsolation("HikariPool-18871");
        org.junit.Assert.assertNull(dataSource1);
// flaky:         org.junit.Assert.assertTrue("'" + long6 + "' != '" + 32L + "'", long6 == 32L);
    }

    @Test
    public void test17274() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17274");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        java.lang.String str1 = hikariConfig0.getConnectionInitSql();
        long long2 = hikariConfig0.getLeakDetectionThreshold();
        hikariConfig0.leakDetectionThreshold = (-1);
        long long5 = hikariConfig0.acquireRetryDelay;
        com.zaxxer.hikari.HikariConfig hikariConfig7 = new com.zaxxer.hikari.HikariConfig();
        javax.sql.DataSource dataSource8 = hikariConfig7.getDataSource();
        hikariConfig7.setConnectionTestQuery("");
        hikariConfig7.connectionCustomizerClassName = "";
        hikariConfig7.setConnectionCustomizerClassName("hi!");
        java.lang.String str15 = hikariConfig7.getCatalog();
        boolean boolean16 = hikariConfig7.isRegisterMbeans;
        long long17 = hikariConfig7.connectionTimeout;
        hikariConfig7.setConnectionInitSql("HikariPool-48");
        hikariConfig0.addDataSourceProperty("hi!", (java.lang.Object) hikariConfig7);
        hikariConfig0.setUseInstrumentation(false);
        hikariConfig0.setPoolName("HikariPool-73");
        hikariConfig0.setAcquireIncrement(10);
        java.lang.String str27 = hikariConfig0.connectionInitSql;
        hikariConfig0.setUseInstrumentation(false);
        hikariConfig0.setJdbcUrl("HikariPool-209");
        hikariConfig0.leakDetectionThreshold = (short) 0;
        hikariConfig0.setMinimumPoolSize(60);
        int int36 = hikariConfig0.getAcquireIncrement();
        java.lang.String str37 = hikariConfig0.connectionInitSql;
        hikariConfig0.isInitializationFailFast = false;
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
// flaky:         org.junit.Assert.assertTrue("'" + long5 + "' != '" + 100L + "'", long5 == 100L);
        org.junit.Assert.assertNull(dataSource8);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
// flaky:         org.junit.Assert.assertTrue("'" + long17 + "' != '" + 32L + "'", long17 == 32L);
        org.junit.Assert.assertNull(str27);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 10 + "'", int36 == 10);
        org.junit.Assert.assertNull(str37);
    }

    @Test
    public void test17275() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17275");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        java.lang.String str1 = hikariConfig0.getConnectionInitSql();
        long long2 = hikariConfig0.getLeakDetectionThreshold();
        hikariConfig0.leakDetectionThreshold = (-1);
        int int5 = hikariConfig0.acquireIncrement;
        hikariConfig0.setPoolName("HikariPool-62");
        hikariConfig0.acquireRetryDelay = 0L;
        int int10 = hikariConfig0.getTransactionIsolation();
        java.lang.String str11 = hikariConfig0.transactionIsolationName;
        long long12 = hikariConfig0.getLeakDetectionThreshold();
        long long13 = hikariConfig0.connectionTimeout;
        hikariConfig0.isAutoCommit = false;
        hikariConfig0.setIsolateInternalQueries(false);
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + (-1L) + "'", long12 == (-1L));
// flaky:         org.junit.Assert.assertTrue("'" + long13 + "' != '" + 32L + "'", long13 == 32L);
    }

    @Test
    public void test17276() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17276");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        javax.sql.DataSource dataSource1 = hikariConfig0.getDataSource();
        hikariConfig0.setConnectionTestQuery("");
        hikariConfig0.setInitializationFailFast(false);
        java.lang.String str6 = hikariConfig0.getConnectionInitSql();
        hikariConfig0.setMaximumPoolSize(10);
        hikariConfig0.setPoolName("HikariPool-184");
        hikariConfig0.setCatalog("HikariPool-332");
        hikariConfig0.isAutoCommit = false;
        java.lang.String str15 = hikariConfig0.getCatalog();
        int int16 = hikariConfig0.transactionIsolation;
        org.junit.Assert.assertNull(dataSource1);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "HikariPool-332" + "'", str15, "HikariPool-332");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
    }

    @Test
    public void test17277() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17277");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        java.lang.String str1 = hikariConfig0.getConnectionInitSql();
        long long2 = hikariConfig0.getLeakDetectionThreshold();
        hikariConfig0.leakDetectionThreshold = (-1);
        long long5 = hikariConfig0.acquireRetryDelay;
        long long6 = hikariConfig0.getIdleTimeout();
        hikariConfig0.isInitializationFailFast = true;
        com.zaxxer.hikari.HikariConfig hikariConfig9 = new com.zaxxer.hikari.HikariConfig();
        javax.sql.DataSource dataSource10 = hikariConfig9.getDataSource();
        hikariConfig9.setConnectionTestQuery("");
        hikariConfig9.connectionCustomizerClassName = "";
        hikariConfig9.setConnectionCustomizerClassName("hi!");
        java.lang.String str17 = hikariConfig9.getCatalog();
        boolean boolean18 = hikariConfig9.isRegisterMbeans;
        hikariConfig9.setAcquireRetries(0);
        long long21 = hikariConfig9.getMaxLifetime();
        hikariConfig9.setReadOnly(false);
        com.zaxxer.hikari.HikariConfig hikariConfig24 = new com.zaxxer.hikari.HikariConfig();
        javax.sql.DataSource dataSource25 = hikariConfig24.getDataSource();
        hikariConfig24.setConnectionTestQuery("");
        hikariConfig24.setInitializationFailFast(false);
        hikariConfig24.catalog = "";
        com.zaxxer.hikari.HikariConfig hikariConfig32 = new com.zaxxer.hikari.HikariConfig();
        javax.sql.DataSource dataSource33 = hikariConfig32.getDataSource();
        hikariConfig32.setConnectionTestQuery("");
        hikariConfig32.connectionCustomizerClassName = "";
        hikariConfig32.setConnectionCustomizerClassName("hi!");
        java.lang.String str40 = hikariConfig32.getCatalog();
        java.util.Properties properties41 = hikariConfig32.dataSourceProperties;
        hikariConfig24.dataSourceProperties = properties41;
        hikariConfig9.setDataSourceProperties(properties41);
        hikariConfig0.dataSourceProperties = properties41;
        com.zaxxer.hikari.HikariConfig hikariConfig45 = new com.zaxxer.hikari.HikariConfig(properties41);
        hikariConfig45.setLeakDetectionThreshold((long) (short) 10);
        int int48 = hikariConfig45.acquireRetries;
        long long49 = hikariConfig45.getMaxLifetime();
        java.util.Properties properties50 = hikariConfig45.dataSourceProperties;
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
// flaky:         org.junit.Assert.assertTrue("'" + long5 + "' != '" + 100L + "'", long5 == 100L);
// flaky:         org.junit.Assert.assertTrue("'" + long6 + "' != '" + (-1L) + "'", long6 == (-1L));
        org.junit.Assert.assertNull(dataSource10);
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
// flaky:         org.junit.Assert.assertTrue("'" + long21 + "' != '" + 32L + "'", long21 == 32L);
        org.junit.Assert.assertNull(dataSource25);
        org.junit.Assert.assertNull(dataSource33);
        org.junit.Assert.assertNull(str40);
        org.junit.Assert.assertNotNull(properties41);
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + 3 + "'", int48 == 3);
// flaky:         org.junit.Assert.assertTrue("'" + long49 + "' != '" + 32L + "'", long49 == 32L);
        org.junit.Assert.assertNotNull(properties50);
    }

    @Test
    public void test17278() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17278");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        java.lang.String str1 = hikariConfig0.getConnectionInitSql();
        long long2 = hikariConfig0.getLeakDetectionThreshold();
        int int3 = hikariConfig0.getMaximumPoolSize();
        java.lang.String str4 = hikariConfig0.connectionCustomizerClassName;
        hikariConfig0.minPoolSize = (byte) 100;
        boolean boolean7 = hikariConfig0.isInitializationFailFast;
        hikariConfig0.connectionCustomizerClassName = "HikariPool-536";
        java.lang.String str10 = hikariConfig0.getConnectionInitSql();
        long long11 = hikariConfig0.getAcquireRetryDelay();
        java.lang.String str12 = hikariConfig0.getJdbcUrl();
        int int13 = hikariConfig0.maxPoolSize;
        hikariConfig0.acquireIncrement = (short) 100;
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 60 + "'", int3 == 60);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(str10);
// flaky:         org.junit.Assert.assertTrue("'" + long11 + "' != '" + 100L + "'", long11 == 100L);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 60 + "'", int13 == 60);
    }

    @Test
    public void test17279() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17279");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        javax.sql.DataSource dataSource1 = hikariConfig0.getDataSource();
        hikariConfig0.setConnectionTestQuery("");
        hikariConfig0.connectionCustomizerClassName = "";
        hikariConfig0.setConnectionCustomizerClassName("hi!");
        java.lang.String str8 = hikariConfig0.getCatalog();
        boolean boolean9 = hikariConfig0.isRegisterMbeans;
        hikariConfig0.setAcquireRetries(0);
        long long12 = hikariConfig0.getMaxLifetime();
        hikariConfig0.setReadOnly(false);
        com.zaxxer.hikari.HikariConfig hikariConfig15 = new com.zaxxer.hikari.HikariConfig();
        javax.sql.DataSource dataSource16 = hikariConfig15.getDataSource();
        hikariConfig15.setConnectionTestQuery("");
        hikariConfig15.setInitializationFailFast(false);
        hikariConfig15.catalog = "";
        com.zaxxer.hikari.HikariConfig hikariConfig23 = new com.zaxxer.hikari.HikariConfig();
        javax.sql.DataSource dataSource24 = hikariConfig23.getDataSource();
        hikariConfig23.setConnectionTestQuery("");
        hikariConfig23.connectionCustomizerClassName = "";
        hikariConfig23.setConnectionCustomizerClassName("hi!");
        java.lang.String str31 = hikariConfig23.getCatalog();
        java.util.Properties properties32 = hikariConfig23.dataSourceProperties;
        hikariConfig15.dataSourceProperties = properties32;
        hikariConfig0.setDataSourceProperties(properties32);
        com.zaxxer.hikari.IConnectionCustomizer iConnectionCustomizer35 = null;
        hikariConfig0.connectionCustomizer = iConnectionCustomizer35;
        java.lang.String str37 = hikariConfig0.getJdbcUrl();
        hikariConfig0.setCatalog("HikariPool-491");
        int int40 = hikariConfig0.acquireRetries;
        hikariConfig0.setAutoCommit(false);
        long long43 = hikariConfig0.acquireRetryDelay;
        boolean boolean44 = hikariConfig0.isJdbc4ConnectionTest();
        hikariConfig0.maxLifetime = (byte) 100;
        org.junit.Assert.assertNull(dataSource1);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
// flaky:         org.junit.Assert.assertTrue("'" + long12 + "' != '" + 32L + "'", long12 == 32L);
        org.junit.Assert.assertNull(dataSource16);
        org.junit.Assert.assertNull(dataSource24);
        org.junit.Assert.assertNull(str31);
        org.junit.Assert.assertNotNull(properties32);
        org.junit.Assert.assertNull(str37);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 0 + "'", int40 == 0);
// flaky:         org.junit.Assert.assertTrue("'" + long43 + "' != '" + 100L + "'", long43 == 100L);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + true + "'", boolean44 == true);
    }

    @Test
    public void test17280() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17280");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        java.lang.String str1 = hikariConfig0.getConnectionInitSql();
        long long2 = hikariConfig0.getLeakDetectionThreshold();
        boolean boolean3 = hikariConfig0.isIsolateInternalQueries;
        boolean boolean4 = hikariConfig0.isJdbc4ConnectionTest();
        boolean boolean5 = hikariConfig0.isAutoCommit();
        boolean boolean6 = hikariConfig0.isRegisterMbeans;
        hikariConfig0.idleTimeout = (short) 0;
        hikariConfig0.setLeakDetectionThreshold(5000L);
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test17281() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17281");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        java.lang.String str1 = hikariConfig0.getConnectionInitSql();
        hikariConfig0.setMaxLifetime(35L);
        hikariConfig0.setAutoCommit(false);
        int int6 = hikariConfig0.getTransactionIsolation();
        long long7 = hikariConfig0.connectionTimeout;
        java.util.Properties properties8 = hikariConfig0.dataSourceProperties;
        hikariConfig0.setInitializationFailFast(false);
        hikariConfig0.setConnectionCustomizerClassName("HikariPool-913");
        java.lang.String str13 = hikariConfig0.getConnectionCustomizerClassName();
        boolean boolean14 = hikariConfig0.isRegisterMbeans;
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
// flaky:         org.junit.Assert.assertTrue("'" + long7 + "' != '" + 32L + "'", long7 == 32L);
        org.junit.Assert.assertNotNull(properties8);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "HikariPool-913" + "'", str13, "HikariPool-913");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test17282() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17282");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        java.lang.String str1 = hikariConfig0.getConnectionInitSql();
        long long2 = hikariConfig0.getLeakDetectionThreshold();
        hikariConfig0.leakDetectionThreshold = (-1);
        long long5 = hikariConfig0.acquireRetryDelay;
        com.zaxxer.hikari.HikariConfig hikariConfig7 = new com.zaxxer.hikari.HikariConfig();
        javax.sql.DataSource dataSource8 = hikariConfig7.getDataSource();
        hikariConfig7.setConnectionTestQuery("");
        hikariConfig7.connectionCustomizerClassName = "";
        hikariConfig7.setConnectionCustomizerClassName("hi!");
        java.lang.String str15 = hikariConfig7.getCatalog();
        boolean boolean16 = hikariConfig7.isRegisterMbeans;
        long long17 = hikariConfig7.connectionTimeout;
        hikariConfig7.setConnectionInitSql("HikariPool-48");
        hikariConfig0.addDataSourceProperty("hi!", (java.lang.Object) hikariConfig7);
        java.lang.String str21 = hikariConfig7.getConnectionCustomizerClassName();
        boolean boolean22 = hikariConfig7.isInitializationFailFast;
        java.lang.String str23 = hikariConfig7.transactionIsolationName;
        int int24 = hikariConfig7.getMaximumPoolSize();
        hikariConfig7.setJdbcUrl("HikariPool-3200");
        hikariConfig7.setAutoCommit(false);
        hikariConfig7.catalog = "HikariPool-14384";
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
// flaky:         org.junit.Assert.assertTrue("'" + long5 + "' != '" + 100L + "'", long5 == 100L);
        org.junit.Assert.assertNull(dataSource8);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
// flaky:         org.junit.Assert.assertTrue("'" + long17 + "' != '" + 32L + "'", long17 == 32L);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "hi!" + "'", str21, "hi!");
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNull(str23);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 60 + "'", int24 == 60);
    }

    @Test
    public void test17283() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17283");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        javax.sql.DataSource dataSource1 = hikariConfig0.getDataSource();
        hikariConfig0.setConnectionTestQuery("");
        hikariConfig0.connectionCustomizerClassName = "";
        hikariConfig0.setConnectionCustomizerClassName("hi!");
        java.lang.String str8 = hikariConfig0.getCatalog();
        java.util.Properties properties9 = hikariConfig0.dataSourceProperties;
        com.zaxxer.hikari.HikariConfig hikariConfig11 = new com.zaxxer.hikari.HikariConfig();
        java.lang.String str12 = hikariConfig11.getConnectionInitSql();
        long long13 = hikariConfig11.getLeakDetectionThreshold();
        hikariConfig11.leakDetectionThreshold = (-1);
        long long16 = hikariConfig11.acquireRetryDelay;
        boolean boolean17 = hikariConfig11.isRegisterMbeans;
        hikariConfig0.addDataSourceProperty("HikariPool-47", (java.lang.Object) boolean17);
        java.util.Properties properties19 = hikariConfig0.getDataSourceProperties();
        int int20 = hikariConfig0.minPoolSize;
        java.lang.String str21 = hikariConfig0.catalog;
        java.lang.String str22 = hikariConfig0.poolName;
        org.junit.Assert.assertNull(dataSource1);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNotNull(properties9);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 0L + "'", long13 == 0L);
// flaky:         org.junit.Assert.assertTrue("'" + long16 + "' != '" + 100L + "'", long16 == 100L);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(properties19);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 10 + "'", int20 == 10);
        org.junit.Assert.assertNull(str21);
// flaky:         org.junit.Assert.assertEquals("'" + str22 + "' != '" + "HikariPool-42496" + "'", str22, "HikariPool-42496");
    }

    @Test
    public void test17284() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17284");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        javax.sql.DataSource dataSource1 = hikariConfig0.getDataSource();
        hikariConfig0.setConnectionTestQuery("");
        hikariConfig0.connectionCustomizerClassName = "";
        hikariConfig0.setConnectionCustomizerClassName("hi!");
        java.lang.String str8 = hikariConfig0.getCatalog();
        java.util.Properties properties9 = hikariConfig0.dataSourceProperties;
        com.zaxxer.hikari.HikariConfig hikariConfig11 = new com.zaxxer.hikari.HikariConfig();
        java.lang.String str12 = hikariConfig11.getConnectionInitSql();
        long long13 = hikariConfig11.getLeakDetectionThreshold();
        hikariConfig11.leakDetectionThreshold = (-1);
        long long16 = hikariConfig11.acquireRetryDelay;
        boolean boolean17 = hikariConfig11.isRegisterMbeans;
        hikariConfig0.addDataSourceProperty("HikariPool-47", (java.lang.Object) boolean17);
        int int19 = hikariConfig0.acquireRetries;
        hikariConfig0.idleTimeout = 97L;
        hikariConfig0.setLeakDetectionThreshold((long) ' ');
        long long24 = hikariConfig0.idleTimeout;
        boolean boolean25 = hikariConfig0.isJdbc4ConnectionTest();
        boolean boolean26 = hikariConfig0.isJdbc4ConnectionTest();
        hikariConfig0.setAutoCommit(true);
        int int29 = hikariConfig0.maxPoolSize;
        hikariConfig0.acquireRetryDelay = 32L;
        org.junit.Assert.assertNull(dataSource1);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNotNull(properties9);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 0L + "'", long13 == 0L);
// flaky:         org.junit.Assert.assertTrue("'" + long16 + "' != '" + 100L + "'", long16 == 100L);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 3 + "'", int19 == 3);
        org.junit.Assert.assertTrue("'" + long24 + "' != '" + 97L + "'", long24 == 97L);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 60 + "'", int29 == 60);
    }

    @Test
    public void test17285() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17285");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        javax.sql.DataSource dataSource1 = hikariConfig0.getDataSource();
        hikariConfig0.setConnectionTestQuery("");
        hikariConfig0.connectionCustomizerClassName = "";
        hikariConfig0.setConnectionCustomizerClassName("hi!");
        java.lang.String str8 = hikariConfig0.getCatalog();
        java.util.Properties properties9 = hikariConfig0.dataSourceProperties;
        int int10 = hikariConfig0.minPoolSize;
        hikariConfig0.setIdleTimeout((long) 60);
        java.lang.String str13 = hikariConfig0.catalog;
        int int14 = hikariConfig0.acquireIncrement;
        hikariConfig0.maxLifetime = (-1);
        java.lang.String str17 = hikariConfig0.jdbcUrl;
        hikariConfig0.catalog = "HikariPool-12093";
        org.junit.Assert.assertNull(dataSource1);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNotNull(properties9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 10 + "'", int10 == 10);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertNull(str17);
    }

    @Test
    public void test17286() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17286");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        java.lang.String str1 = hikariConfig0.getConnectionInitSql();
        long long2 = hikariConfig0.getLeakDetectionThreshold();
        com.zaxxer.hikari.IConnectionCustomizer iConnectionCustomizer3 = null;
        hikariConfig0.connectionCustomizer = iConnectionCustomizer3;
        boolean boolean5 = hikariConfig0.isIsolateInternalQueries();
        hikariConfig0.poolName = "HikariPool-47";
        java.lang.String str8 = hikariConfig0.transactionIsolationName;
        hikariConfig0.setMaximumPoolSize((int) (short) 10);
        java.util.Properties properties11 = hikariConfig0.getDataSourceProperties();
        hikariConfig0.setReadOnly(false);
        hikariConfig0.connectionTimeout = ' ';
        hikariConfig0.acquireIncrement = '#';
        int int18 = hikariConfig0.minPoolSize;
        // The following exception was thrown during execution in test generation
        try {
            hikariConfig0.setAcquireRetryDelay((long) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: acquireRetryDelay cannot be negative");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNotNull(properties11);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 10 + "'", int18 == 10);
    }

    @Test
    public void test17287() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17287");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        javax.sql.DataSource dataSource1 = hikariConfig0.getDataSource();
        hikariConfig0.setConnectionTestQuery("");
        hikariConfig0.setInitializationFailFast(false);
        java.lang.String str6 = hikariConfig0.getConnectionInitSql();
        hikariConfig0.setMaximumPoolSize(10);
        hikariConfig0.jdbcUrl = "HikariPool-16";
        hikariConfig0.maxPoolSize = 100;
        hikariConfig0.setInitializationFailFast(true);
        hikariConfig0.setAcquireRetryDelay((long) 97);
        org.junit.Assert.assertNull(dataSource1);
        org.junit.Assert.assertNull(str6);
    }

    @Test
    public void test17288() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17288");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        javax.sql.DataSource dataSource1 = hikariConfig0.getDataSource();
        hikariConfig0.setConnectionTestQuery("");
        hikariConfig0.connectionCustomizerClassName = "";
        com.zaxxer.hikari.IConnectionCustomizer iConnectionCustomizer6 = hikariConfig0.connectionCustomizer;
        java.lang.String str7 = hikariConfig0.jdbcUrl;
        boolean boolean8 = hikariConfig0.isReadOnly;
        java.lang.String str9 = hikariConfig0.jdbcUrl;
        long long10 = hikariConfig0.getMaxLifetime();
        hikariConfig0.setCatalog("HikariPool-29");
        hikariConfig0.connectionCustomizerClassName = "HikariPool-255";
        hikariConfig0.setJdbc4ConnectionTest(false);
        javax.sql.DataSource dataSource17 = hikariConfig0.getDataSource();
        org.junit.Assert.assertNull(dataSource1);
        org.junit.Assert.assertNull(iConnectionCustomizer6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(str9);
// flaky:         org.junit.Assert.assertTrue("'" + long10 + "' != '" + 32L + "'", long10 == 32L);
        org.junit.Assert.assertNull(dataSource17);
    }

    @Test
    public void test17289() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17289");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        java.lang.String str1 = hikariConfig0.getConnectionInitSql();
        long long2 = hikariConfig0.getLeakDetectionThreshold();
        hikariConfig0.leakDetectionThreshold = (-1);
        long long5 = hikariConfig0.acquireRetryDelay;
        long long6 = hikariConfig0.getIdleTimeout();
        hikariConfig0.acquireIncrement = '4';
        int int9 = hikariConfig0.transactionIsolation;
        long long10 = hikariConfig0.acquireRetryDelay;
        long long11 = hikariConfig0.leakDetectionThreshold;
        hikariConfig0.setDataSourceClassName("HikariPool-32606");
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
// flaky:         org.junit.Assert.assertTrue("'" + long5 + "' != '" + 100L + "'", long5 == 100L);
// flaky:         org.junit.Assert.assertTrue("'" + long6 + "' != '" + (-1L) + "'", long6 == (-1L));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
// flaky:         org.junit.Assert.assertTrue("'" + long10 + "' != '" + 100L + "'", long10 == 100L);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + (-1L) + "'", long11 == (-1L));
    }

    @Test
    public void test17290() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17290");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        java.lang.String str1 = hikariConfig0.getConnectionInitSql();
        long long2 = hikariConfig0.getLeakDetectionThreshold();
        hikariConfig0.leakDetectionThreshold = (-1);
        boolean boolean5 = hikariConfig0.isAutoCommit;
        java.lang.String str6 = hikariConfig0.transactionIsolationName;
        hikariConfig0.setConnectionTimeout(0L);
        boolean boolean9 = hikariConfig0.isInitializationFailFast;
        long long10 = hikariConfig0.connectionTimeout;
        hikariConfig0.maxPoolSize = (short) 0;
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 2147483647L + "'", long10 == 2147483647L);
    }

    @Test
    public void test17291() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17291");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        javax.sql.DataSource dataSource1 = hikariConfig0.getDataSource();
        hikariConfig0.setConnectionTestQuery("");
        hikariConfig0.connectionCustomizerClassName = "";
        hikariConfig0.setConnectionCustomizerClassName("hi!");
        java.lang.String str8 = hikariConfig0.getCatalog();
        java.util.Properties properties9 = hikariConfig0.dataSourceProperties;
        com.zaxxer.hikari.HikariConfig hikariConfig11 = new com.zaxxer.hikari.HikariConfig();
        java.lang.String str12 = hikariConfig11.getConnectionInitSql();
        long long13 = hikariConfig11.getLeakDetectionThreshold();
        hikariConfig11.leakDetectionThreshold = (-1);
        long long16 = hikariConfig11.acquireRetryDelay;
        boolean boolean17 = hikariConfig11.isRegisterMbeans;
        hikariConfig0.addDataSourceProperty("HikariPool-47", (java.lang.Object) boolean17);
        java.util.Properties properties19 = hikariConfig0.getDataSourceProperties();
        hikariConfig0.setMaxLifetime((long) 3);
        boolean boolean22 = hikariConfig0.isRegisterMbeans();
        com.zaxxer.hikari.HikariConfig hikariConfig24 = new com.zaxxer.hikari.HikariConfig();
        hikariConfig24.setMaxLifetime((long) (short) 10);
        com.zaxxer.hikari.IConnectionCustomizer iConnectionCustomizer27 = hikariConfig24.connectionCustomizer;
        hikariConfig24.setDataSourceClassName("HikariPool-47");
        hikariConfig24.setDataSourceClassName("HikariPool-18");
        boolean boolean32 = hikariConfig24.isRegisterMbeans();
        java.lang.String str33 = hikariConfig24.getDataSourceClassName();
        boolean boolean34 = hikariConfig24.isIsolateInternalQueries;
        hikariConfig24.isInitializationFailFast = false;
        hikariConfig24.setInitializationFailFast(false);
        hikariConfig0.addDataSourceProperty("HikariPool-625", (java.lang.Object) false);
        long long40 = hikariConfig0.maxLifetime;
        hikariConfig0.setCatalog("");
        boolean boolean43 = hikariConfig0.isInitializationFailFast;
        org.junit.Assert.assertNull(dataSource1);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNotNull(properties9);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 0L + "'", long13 == 0L);
// flaky:         org.junit.Assert.assertTrue("'" + long16 + "' != '" + 100L + "'", long16 == 100L);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(properties19);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNull(iConnectionCustomizer27);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "HikariPool-18" + "'", str33, "HikariPool-18");
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertTrue("'" + long40 + "' != '" + 3L + "'", long40 == 3L);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
    }

    @Test
    public void test17292() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17292");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        javax.sql.DataSource dataSource1 = hikariConfig0.getDataSource();
        hikariConfig0.setConnectionTestQuery("");
        hikariConfig0.connectionCustomizerClassName = "";
        hikariConfig0.setConnectionCustomizerClassName("hi!");
        java.lang.String str8 = hikariConfig0.getCatalog();
        java.util.Properties properties9 = hikariConfig0.dataSourceProperties;
        int int10 = hikariConfig0.minPoolSize;
        long long11 = hikariConfig0.getMaxLifetime();
        long long12 = hikariConfig0.acquireRetryDelay;
        hikariConfig0.setMinimumPoolSize((int) (byte) 10);
        hikariConfig0.setConnectionInitSql("HikariPool-95");
        boolean boolean17 = hikariConfig0.isIsolateInternalQueries();
        boolean boolean18 = hikariConfig0.isRegisterMbeans();
        java.lang.Class<?> wildcardClass19 = hikariConfig0.getClass();
        org.junit.Assert.assertNull(dataSource1);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNotNull(properties9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 10 + "'", int10 == 10);
// flaky:         org.junit.Assert.assertTrue("'" + long11 + "' != '" + 32L + "'", long11 == 32L);
// flaky:         org.junit.Assert.assertTrue("'" + long12 + "' != '" + 100L + "'", long12 == 100L);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test17293() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17293");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        java.lang.String str1 = hikariConfig0.getConnectionInitSql();
        hikariConfig0.acquireIncrement = 0;
        hikariConfig0.maxLifetime = 100;
        hikariConfig0.maxPoolSize = (short) 100;
        boolean boolean8 = hikariConfig0.isInitializationFailFast();
        java.lang.String str9 = hikariConfig0.jdbcUrl;
        long long10 = hikariConfig0.connectionTimeout;
        hikariConfig0.acquireRetries = ' ';
        hikariConfig0.isIsolateInternalQueries = true;
        javax.sql.DataSource dataSource15 = hikariConfig0.dataSource;
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(str9);
// flaky:         org.junit.Assert.assertTrue("'" + long10 + "' != '" + 32L + "'", long10 == 32L);
        org.junit.Assert.assertNull(dataSource15);
    }

    @Test
    public void test17294() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17294");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        int int1 = hikariConfig0.getTransactionIsolation();
        long long2 = hikariConfig0.leakDetectionThreshold;
        java.lang.String str3 = hikariConfig0.getConnectionCustomizerClassName();
        hikariConfig0.isIsolateInternalQueries = true;
        hikariConfig0.connectionTimeout = 0L;
        boolean boolean8 = hikariConfig0.isAutoCommit();
        hikariConfig0.connectionInitSql = "HikariPool-3128";
        hikariConfig0.setRegisterMbeans(false);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test17295() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17295");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        java.lang.String str1 = hikariConfig0.getConnectionInitSql();
        long long2 = hikariConfig0.getLeakDetectionThreshold();
        hikariConfig0.leakDetectionThreshold = (-1);
        int int5 = hikariConfig0.acquireIncrement;
        hikariConfig0.setInitializationFailFast(true);
        boolean boolean8 = hikariConfig0.isAutoCommit();
        hikariConfig0.setTransactionIsolation("");
        long long11 = hikariConfig0.idleTimeout;
        com.zaxxer.hikari.HikariConfig hikariConfig12 = new com.zaxxer.hikari.HikariConfig();
        javax.sql.DataSource dataSource13 = hikariConfig12.getDataSource();
        hikariConfig12.setConnectionTestQuery("");
        hikariConfig12.connectionCustomizerClassName = "";
        hikariConfig12.setConnectionCustomizerClassName("hi!");
        java.lang.String str20 = hikariConfig12.getCatalog();
        com.zaxxer.hikari.IConnectionCustomizer iConnectionCustomizer21 = null;
        hikariConfig12.connectionCustomizer = iConnectionCustomizer21;
        hikariConfig12.setJdbcUrl("HikariPool-38");
        com.zaxxer.hikari.HikariConfig hikariConfig25 = new com.zaxxer.hikari.HikariConfig();
        hikariConfig25.setMaxLifetime((long) (short) 10);
        com.zaxxer.hikari.HikariConfig hikariConfig28 = new com.zaxxer.hikari.HikariConfig();
        javax.sql.DataSource dataSource29 = hikariConfig28.getDataSource();
        hikariConfig28.setConnectionTestQuery("");
        hikariConfig28.setInitializationFailFast(false);
        long long34 = hikariConfig28.getConnectionTimeout();
        java.util.Properties properties35 = hikariConfig28.dataSourceProperties;
        hikariConfig25.dataSourceProperties = properties35;
        hikariConfig12.setDataSourceProperties(properties35);
        hikariConfig0.dataSourceProperties = properties35;
        long long39 = hikariConfig0.getMaxLifetime();
        hikariConfig0.acquireRetryDelay = 0;
        hikariConfig0.isJdbc4connectionTest = false;
        hikariConfig0.leakDetectionThreshold = 60;
        boolean boolean46 = hikariConfig0.isRegisterMbeans();
        hikariConfig0.acquireRetries = (byte) 0;
        hikariConfig0.isAutoCommit = true;
        hikariConfig0.dataSourceClassName = "HikariPool-295";
        hikariConfig0.setTransactionIsolation("HikariPool-11293");
        long long55 = hikariConfig0.connectionTimeout;
        hikariConfig0.dataSourceClassName = "HikariPool-376";
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
// flaky:         org.junit.Assert.assertTrue("'" + long11 + "' != '" + (-1L) + "'", long11 == (-1L));
        org.junit.Assert.assertNull(dataSource13);
        org.junit.Assert.assertNull(str20);
        org.junit.Assert.assertNull(dataSource29);
// flaky:         org.junit.Assert.assertTrue("'" + long34 + "' != '" + 32L + "'", long34 == 32L);
        org.junit.Assert.assertNotNull(properties35);
// flaky:         org.junit.Assert.assertTrue("'" + long39 + "' != '" + 32L + "'", long39 == 32L);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
// flaky:         org.junit.Assert.assertTrue("'" + long55 + "' != '" + 32L + "'", long55 == 32L);
    }

    @Test
    public void test17296() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17296");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        java.lang.String str1 = hikariConfig0.getConnectionInitSql();
        long long2 = hikariConfig0.getLeakDetectionThreshold();
        int int3 = hikariConfig0.getMaximumPoolSize();
        long long4 = hikariConfig0.getIdleTimeout();
        int int5 = hikariConfig0.maxPoolSize;
        java.lang.String str6 = hikariConfig0.getConnectionCustomizerClassName();
        boolean boolean7 = hikariConfig0.isJdbc4connectionTest;
        long long8 = hikariConfig0.getMaxLifetime();
        hikariConfig0.setUseInstrumentation(false);
        hikariConfig0.setDataSourceClassName("HikariPool-14907");
        int int13 = hikariConfig0.getMaximumPoolSize();
        boolean boolean14 = hikariConfig0.isAutoCommit;
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 60 + "'", int3 == 60);
// flaky:         org.junit.Assert.assertTrue("'" + long4 + "' != '" + (-1L) + "'", long4 == (-1L));
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 60 + "'", int5 == 60);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
// flaky:         org.junit.Assert.assertTrue("'" + long8 + "' != '" + 32L + "'", long8 == 32L);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 60 + "'", int13 == 60);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
    }

    @Test
    public void test17297() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17297");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        javax.sql.DataSource dataSource1 = hikariConfig0.getDataSource();
        hikariConfig0.setConnectionTestQuery("");
        hikariConfig0.setInitializationFailFast(false);
        hikariConfig0.catalog = "";
        javax.sql.DataSource dataSource8 = null;
        hikariConfig0.dataSource = dataSource8;
        javax.sql.DataSource dataSource10 = null;
        hikariConfig0.dataSource = dataSource10;
        int int12 = hikariConfig0.maxPoolSize;
        long long13 = hikariConfig0.getIdleTimeout();
        javax.sql.DataSource dataSource14 = hikariConfig0.dataSource;
        hikariConfig0.setDataSourceClassName("HikariPool-122");
        long long17 = hikariConfig0.getLeakDetectionThreshold();
        long long18 = hikariConfig0.getIdleTimeout();
        java.lang.String str19 = hikariConfig0.getJdbcUrl();
        hikariConfig0.connectionInitSql = "HikariPool-49";
        org.junit.Assert.assertNull(dataSource1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 60 + "'", int12 == 60);
// flaky:         org.junit.Assert.assertTrue("'" + long13 + "' != '" + (-1L) + "'", long13 == (-1L));
        org.junit.Assert.assertNull(dataSource14);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 0L + "'", long17 == 0L);
// flaky:         org.junit.Assert.assertTrue("'" + long18 + "' != '" + (-1L) + "'", long18 == (-1L));
        org.junit.Assert.assertNull(str19);
    }

    @Test
    public void test17298() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17298");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        java.lang.String str1 = hikariConfig0.getConnectionInitSql();
        hikariConfig0.setMaxLifetime(35L);
        hikariConfig0.setAutoCommit(false);
        int int6 = hikariConfig0.getTransactionIsolation();
        long long7 = hikariConfig0.connectionTimeout;
        boolean boolean8 = hikariConfig0.isRegisterMbeans;
        hikariConfig0.setUseInstrumentation(false);
        hikariConfig0.setAutoCommit(false);
        long long13 = hikariConfig0.getConnectionTimeout();
        long long14 = hikariConfig0.getIdleTimeout();
        java.lang.String str15 = hikariConfig0.jdbcUrl;
        hikariConfig0.minPoolSize = (byte) -1;
        java.lang.Class<?> wildcardClass18 = hikariConfig0.getClass();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
// flaky:         org.junit.Assert.assertTrue("'" + long7 + "' != '" + 32L + "'", long7 == 32L);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
// flaky:         org.junit.Assert.assertTrue("'" + long13 + "' != '" + 32L + "'", long13 == 32L);
// flaky:         org.junit.Assert.assertTrue("'" + long14 + "' != '" + (-1L) + "'", long14 == (-1L));
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test17299() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17299");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        java.lang.String str1 = hikariConfig0.getConnectionInitSql();
        long long2 = hikariConfig0.getLeakDetectionThreshold();
        hikariConfig0.leakDetectionThreshold = (-1);
        long long5 = hikariConfig0.acquireRetryDelay;
        hikariConfig0.setLeakDetectionThreshold((long) (byte) -1);
        hikariConfig0.transactionIsolation = 'a';
        hikariConfig0.setIdleTimeout(750L);
        hikariConfig0.setJdbcUrl("HikariPool-234");
        int int14 = hikariConfig0.maxPoolSize;
        boolean boolean15 = hikariConfig0.isReadOnly();
        int int16 = hikariConfig0.getAcquireRetries();
        com.zaxxer.hikari.IConnectionCustomizer iConnectionCustomizer17 = hikariConfig0.connectionCustomizer;
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
// flaky:         org.junit.Assert.assertTrue("'" + long5 + "' != '" + 100L + "'", long5 == 100L);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 60 + "'", int14 == 60);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 3 + "'", int16 == 3);
        org.junit.Assert.assertNull(iConnectionCustomizer17);
    }

    @Test
    public void test17300() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17300");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        javax.sql.DataSource dataSource1 = hikariConfig0.getDataSource();
        hikariConfig0.setConnectionTestQuery("");
        hikariConfig0.setInitializationFailFast(false);
        long long6 = hikariConfig0.getConnectionTimeout();
        hikariConfig0.setJdbcUrl("HikariPool-47");
        hikariConfig0.isIsolateInternalQueries = false;
        hikariConfig0.setIsolateInternalQueries(true);
        hikariConfig0.setPoolName("HikariPool-127");
        hikariConfig0.setPoolName("HikariPool-135");
        boolean boolean17 = hikariConfig0.isInitializationFailFast();
        java.lang.String str18 = hikariConfig0.getConnectionTestQuery();
        hikariConfig0.setConnectionTestQuery("HikariPool-75");
        java.lang.String str21 = hikariConfig0.getConnectionInitSql();
        long long22 = hikariConfig0.idleTimeout;
        hikariConfig0.isAutoCommit = true;
        hikariConfig0.setMaximumPoolSize(3);
        org.junit.Assert.assertNull(dataSource1);
// flaky:         org.junit.Assert.assertTrue("'" + long6 + "' != '" + 32L + "'", long6 == 32L);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertNull(str21);
// flaky:         org.junit.Assert.assertTrue("'" + long22 + "' != '" + (-1L) + "'", long22 == (-1L));
    }

    @Test
    public void test17301() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17301");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        java.lang.String str1 = hikariConfig0.getConnectionInitSql();
        hikariConfig0.acquireIncrement = 0;
        hikariConfig0.maxLifetime = 100;
        long long6 = hikariConfig0.acquireRetryDelay;
        hikariConfig0.setCatalog("");
        hikariConfig0.setJdbc4ConnectionTest(true);
        hikariConfig0.setAcquireIncrement(60);
        java.lang.String str13 = hikariConfig0.connectionTestQuery;
        org.junit.Assert.assertNull(str1);
// flaky:         org.junit.Assert.assertTrue("'" + long6 + "' != '" + 100L + "'", long6 == 100L);
        org.junit.Assert.assertNull(str13);
    }

    @Test
    public void test17302() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17302");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        javax.sql.DataSource dataSource1 = hikariConfig0.getDataSource();
        hikariConfig0.setConnectionTestQuery("");
        hikariConfig0.connectionCustomizerClassName = "";
        hikariConfig0.setConnectionCustomizerClassName("hi!");
        java.lang.String str8 = hikariConfig0.getCatalog();
        boolean boolean9 = hikariConfig0.isRegisterMbeans;
        hikariConfig0.setAcquireRetries(0);
        hikariConfig0.setMaximumPoolSize((int) '#');
        hikariConfig0.setTransactionIsolation("hi!");
        hikariConfig0.setConnectionInitSql("hi!");
        javax.sql.DataSource dataSource18 = hikariConfig0.getDataSource();
        javax.sql.DataSource dataSource19 = null;
        hikariConfig0.setDataSource(dataSource19);
        boolean boolean21 = hikariConfig0.isJdbc4ConnectionTest();
        javax.sql.DataSource dataSource22 = null;
        hikariConfig0.setDataSource(dataSource22);
        long long24 = hikariConfig0.leakDetectionThreshold;
        hikariConfig0.connectionCustomizerClassName = "HikariPool-1803";
        int int27 = hikariConfig0.getAcquireIncrement();
        hikariConfig0.setConnectionCustomizerClassName("HikariPool-23225");
        org.junit.Assert.assertNull(dataSource1);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(dataSource18);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertTrue("'" + long24 + "' != '" + 0L + "'", long24 == 0L);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 1 + "'", int27 == 1);
    }

    @Test
    public void test17303() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17303");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        javax.sql.DataSource dataSource1 = hikariConfig0.getDataSource();
        hikariConfig0.setConnectionTestQuery("");
        hikariConfig0.connectionCustomizerClassName = "";
        hikariConfig0.setConnectionCustomizerClassName("hi!");
        java.lang.String str8 = hikariConfig0.getCatalog();
        java.util.Properties properties9 = hikariConfig0.dataSourceProperties;
        com.zaxxer.hikari.HikariConfig hikariConfig11 = new com.zaxxer.hikari.HikariConfig();
        java.lang.String str12 = hikariConfig11.getConnectionInitSql();
        long long13 = hikariConfig11.getLeakDetectionThreshold();
        hikariConfig11.leakDetectionThreshold = (-1);
        long long16 = hikariConfig11.acquireRetryDelay;
        boolean boolean17 = hikariConfig11.isRegisterMbeans;
        hikariConfig0.addDataSourceProperty("HikariPool-47", (java.lang.Object) boolean17);
        int int19 = hikariConfig0.acquireRetries;
        hikariConfig0.idleTimeout = 97L;
        hikariConfig0.setLeakDetectionThreshold((long) ' ');
        hikariConfig0.connectionCustomizerClassName = "HikariPool-318";
        hikariConfig0.setConnectionTimeout(2147483647L);
        javax.sql.DataSource dataSource28 = null;
        hikariConfig0.dataSource = dataSource28;
        long long30 = hikariConfig0.getConnectionTimeout();
        java.util.Properties properties31 = hikariConfig0.dataSourceProperties;
        hikariConfig0.connectionTestQuery = "HikariPool-987";
        hikariConfig0.setPoolName("HikariPool-7692");
        hikariConfig0.maxLifetime = 100;
        org.junit.Assert.assertNull(dataSource1);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNotNull(properties9);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 0L + "'", long13 == 0L);
// flaky:         org.junit.Assert.assertTrue("'" + long16 + "' != '" + 100L + "'", long16 == 100L);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 3 + "'", int19 == 3);
        org.junit.Assert.assertTrue("'" + long30 + "' != '" + 2147483647L + "'", long30 == 2147483647L);
        org.junit.Assert.assertNotNull(properties31);
    }

    @Test
    public void test17304() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17304");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        javax.sql.DataSource dataSource1 = hikariConfig0.getDataSource();
        hikariConfig0.setConnectionTestQuery("");
        hikariConfig0.setInitializationFailFast(false);
        hikariConfig0.catalog = "";
        javax.sql.DataSource dataSource8 = null;
        hikariConfig0.dataSource = dataSource8;
        boolean boolean10 = hikariConfig0.isRegisterMbeans();
        long long11 = hikariConfig0.acquireRetryDelay;
        int int12 = hikariConfig0.maxPoolSize;
        int int13 = hikariConfig0.acquireIncrement;
        boolean boolean14 = hikariConfig0.isRegisterMbeans;
        int int15 = hikariConfig0.getMinimumPoolSize();
        javax.sql.DataSource dataSource16 = hikariConfig0.dataSource;
        org.junit.Assert.assertNull(dataSource1);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
// flaky:         org.junit.Assert.assertTrue("'" + long11 + "' != '" + 100L + "'", long11 == 100L);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 60 + "'", int12 == 60);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 10 + "'", int15 == 10);
        org.junit.Assert.assertNull(dataSource16);
    }

    @Test
    public void test17305() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17305");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        hikariConfig0.setMaxLifetime((long) (short) 10);
        com.zaxxer.hikari.IConnectionCustomizer iConnectionCustomizer3 = hikariConfig0.connectionCustomizer;
        hikariConfig0.setDataSourceClassName("HikariPool-47");
        hikariConfig0.setReadOnly(false);
        hikariConfig0.setAcquireRetryDelay((long) (byte) 10);
        org.junit.Assert.assertNull(iConnectionCustomizer3);
    }

    @Test
    public void test17306() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17306");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        javax.sql.DataSource dataSource1 = hikariConfig0.getDataSource();
        hikariConfig0.setConnectionTestQuery("");
        hikariConfig0.setInitializationFailFast(false);
        long long6 = hikariConfig0.getConnectionTimeout();
        java.util.Properties properties7 = hikariConfig0.dataSourceProperties;
        hikariConfig0.setDataSourceClassName("HikariPool-47");
        java.lang.String str10 = hikariConfig0.transactionIsolationName;
        long long11 = hikariConfig0.acquireRetryDelay;
        hikariConfig0.acquireIncrement = 35;
        hikariConfig0.setAcquireIncrement((int) (short) 1);
        boolean boolean16 = hikariConfig0.isJdbc4connectionTest;
        int int17 = hikariConfig0.getMaximumPoolSize();
        int int18 = hikariConfig0.acquireRetries;
        org.junit.Assert.assertNull(dataSource1);
// flaky:         org.junit.Assert.assertTrue("'" + long6 + "' != '" + 32L + "'", long6 == 32L);
        org.junit.Assert.assertNotNull(properties7);
        org.junit.Assert.assertNull(str10);
// flaky:         org.junit.Assert.assertTrue("'" + long11 + "' != '" + 100L + "'", long11 == 100L);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 60 + "'", int17 == 60);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 3 + "'", int18 == 3);
    }

    @Test
    public void test17307() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17307");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        java.lang.String str1 = hikariConfig0.getConnectionInitSql();
        long long2 = hikariConfig0.getLeakDetectionThreshold();
        boolean boolean3 = hikariConfig0.isIsolateInternalQueries;
        int int4 = hikariConfig0.getAcquireRetries();
        hikariConfig0.setConnectionInitSql("HikariPool-978");
        hikariConfig0.setAcquireIncrement((int) (byte) 100);
        hikariConfig0.setAutoCommit(false);
        long long11 = hikariConfig0.maxLifetime;
        hikariConfig0.setAcquireRetryDelay(3L);
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 3 + "'", int4 == 3);
// flaky:         org.junit.Assert.assertTrue("'" + long11 + "' != '" + 32L + "'", long11 == 32L);
    }

    @Test
    public void test17308() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17308");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        javax.sql.DataSource dataSource1 = hikariConfig0.getDataSource();
        hikariConfig0.setConnectionTestQuery("");
        hikariConfig0.connectionCustomizerClassName = "";
        hikariConfig0.setConnectionCustomizerClassName("hi!");
        java.lang.String str8 = hikariConfig0.getCatalog();
        java.util.Properties properties9 = hikariConfig0.dataSourceProperties;
        com.zaxxer.hikari.HikariConfig hikariConfig11 = new com.zaxxer.hikari.HikariConfig();
        java.lang.String str12 = hikariConfig11.getConnectionInitSql();
        long long13 = hikariConfig11.getLeakDetectionThreshold();
        hikariConfig11.leakDetectionThreshold = (-1);
        long long16 = hikariConfig11.acquireRetryDelay;
        boolean boolean17 = hikariConfig11.isRegisterMbeans;
        hikariConfig0.addDataSourceProperty("HikariPool-47", (java.lang.Object) boolean17);
        java.util.Properties properties19 = hikariConfig0.getDataSourceProperties();
        hikariConfig0.transactionIsolationName = "HikariPool-18";
        java.util.Properties properties22 = hikariConfig0.getDataSourceProperties();
        java.util.Properties properties23 = hikariConfig0.dataSourceProperties;
        javax.sql.DataSource dataSource24 = null;
        hikariConfig0.dataSource = dataSource24;
        hikariConfig0.addDataSourceProperty("HikariPool-475", (java.lang.Object) "HikariPool-327");
        boolean boolean29 = hikariConfig0.isIsolateInternalQueries();
        javax.sql.DataSource dataSource30 = hikariConfig0.getDataSource();
        org.junit.Assert.assertNull(dataSource1);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNotNull(properties9);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 0L + "'", long13 == 0L);
// flaky:         org.junit.Assert.assertTrue("'" + long16 + "' != '" + 100L + "'", long16 == 100L);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(properties19);
        org.junit.Assert.assertNotNull(properties22);
        org.junit.Assert.assertNotNull(properties23);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertNull(dataSource30);
    }

    @Test
    public void test17309() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17309");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        javax.sql.DataSource dataSource1 = hikariConfig0.getDataSource();
        hikariConfig0.setConnectionTestQuery("");
        hikariConfig0.connectionCustomizerClassName = "";
        hikariConfig0.setConnectionCustomizerClassName("hi!");
        java.lang.String str8 = hikariConfig0.getCatalog();
        boolean boolean9 = hikariConfig0.isRegisterMbeans;
        hikariConfig0.setAcquireRetries(0);
        hikariConfig0.setMaximumPoolSize((int) '#');
        hikariConfig0.setTransactionIsolation("hi!");
        hikariConfig0.setConnectionInitSql("hi!");
        javax.sql.DataSource dataSource18 = hikariConfig0.getDataSource();
        javax.sql.DataSource dataSource19 = null;
        hikariConfig0.setDataSource(dataSource19);
        boolean boolean21 = hikariConfig0.isJdbc4ConnectionTest();
        javax.sql.DataSource dataSource22 = null;
        hikariConfig0.setDataSource(dataSource22);
        long long24 = hikariConfig0.leakDetectionThreshold;
        hikariConfig0.connectionCustomizerClassName = "HikariPool-36740";
        org.junit.Assert.assertNull(dataSource1);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(dataSource18);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertTrue("'" + long24 + "' != '" + 0L + "'", long24 == 0L);
    }

    @Test
    public void test17310() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17310");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        javax.sql.DataSource dataSource1 = hikariConfig0.getDataSource();
        hikariConfig0.setConnectionTestQuery("");
        hikariConfig0.connectionCustomizerClassName = "";
        hikariConfig0.setConnectionCustomizerClassName("hi!");
        java.lang.String str8 = hikariConfig0.getCatalog();
        java.util.Properties properties9 = hikariConfig0.dataSourceProperties;
        com.zaxxer.hikari.HikariConfig hikariConfig11 = new com.zaxxer.hikari.HikariConfig();
        java.lang.String str12 = hikariConfig11.getConnectionInitSql();
        long long13 = hikariConfig11.getLeakDetectionThreshold();
        hikariConfig11.leakDetectionThreshold = (-1);
        long long16 = hikariConfig11.acquireRetryDelay;
        boolean boolean17 = hikariConfig11.isRegisterMbeans;
        hikariConfig0.addDataSourceProperty("HikariPool-47", (java.lang.Object) boolean17);
        int int19 = hikariConfig0.acquireRetries;
        hikariConfig0.idleTimeout = 97L;
        hikariConfig0.setLeakDetectionThreshold((long) ' ');
        long long24 = hikariConfig0.idleTimeout;
        boolean boolean25 = hikariConfig0.isJdbc4ConnectionTest();
        boolean boolean26 = hikariConfig0.isJdbc4ConnectionTest();
        hikariConfig0.poolName = "HikariPool-303";
        boolean boolean29 = hikariConfig0.isJdbc4connectionTest;
        hikariConfig0.setTransactionIsolation("HikariPool-1483");
        long long32 = hikariConfig0.idleTimeout;
        com.zaxxer.hikari.HikariConfig hikariConfig33 = new com.zaxxer.hikari.HikariConfig();
        java.lang.String str34 = hikariConfig33.getConnectionInitSql();
        long long35 = hikariConfig33.getLeakDetectionThreshold();
        hikariConfig33.leakDetectionThreshold = (-1);
        long long38 = hikariConfig33.acquireRetryDelay;
        boolean boolean39 = hikariConfig33.isRegisterMbeans;
        hikariConfig33.setConnectionInitSql("");
        hikariConfig33.connectionTimeout = 0L;
        java.lang.String str44 = hikariConfig33.dataSourceClassName;
        int int45 = hikariConfig33.transactionIsolation;
        java.util.Properties properties46 = hikariConfig33.getDataSourceProperties();
        com.zaxxer.hikari.HikariConfig hikariConfig47 = new com.zaxxer.hikari.HikariConfig(properties46);
        hikariConfig0.dataSourceProperties = properties46;
        org.junit.Assert.assertNull(dataSource1);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNotNull(properties9);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 0L + "'", long13 == 0L);
// flaky:         org.junit.Assert.assertTrue("'" + long16 + "' != '" + 100L + "'", long16 == 100L);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 3 + "'", int19 == 3);
        org.junit.Assert.assertTrue("'" + long24 + "' != '" + 97L + "'", long24 == 97L);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertTrue("'" + long32 + "' != '" + 97L + "'", long32 == 97L);
        org.junit.Assert.assertNull(str34);
        org.junit.Assert.assertTrue("'" + long35 + "' != '" + 0L + "'", long35 == 0L);
// flaky:         org.junit.Assert.assertTrue("'" + long38 + "' != '" + 100L + "'", long38 == 100L);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertNull(str44);
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + (-1) + "'", int45 == (-1));
        org.junit.Assert.assertNotNull(properties46);
    }

    @Test
    public void test17311() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17311");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        java.lang.String str1 = hikariConfig0.getConnectionInitSql();
        long long2 = hikariConfig0.getLeakDetectionThreshold();
        int int3 = hikariConfig0.getMaximumPoolSize();
        long long4 = hikariConfig0.getConnectionTimeout();
        long long5 = hikariConfig0.getMaxLifetime();
        int int6 = hikariConfig0.transactionIsolation;
        hikariConfig0.isRegisterMbeans = false;
        boolean boolean9 = hikariConfig0.isJdbc4ConnectionTest();
        hikariConfig0.setLeakDetectionThreshold((long) '4');
        hikariConfig0.isInitializationFailFast = false;
        hikariConfig0.setDataSourceClassName("HikariPool-516");
        hikariConfig0.catalog = "HikariPool-25020";
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 60 + "'", int3 == 60);
// flaky:         org.junit.Assert.assertTrue("'" + long4 + "' != '" + 32L + "'", long4 == 32L);
// flaky:         org.junit.Assert.assertTrue("'" + long5 + "' != '" + 32L + "'", long5 == 32L);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void test17312() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17312");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        javax.sql.DataSource dataSource1 = hikariConfig0.getDataSource();
        hikariConfig0.setConnectionTestQuery("");
        hikariConfig0.connectionCustomizerClassName = "";
        hikariConfig0.setConnectionCustomizerClassName("hi!");
        java.lang.String str8 = hikariConfig0.getCatalog();
        boolean boolean9 = hikariConfig0.isRegisterMbeans;
        int int10 = hikariConfig0.getMaximumPoolSize();
        hikariConfig0.setConnectionTestQuery("HikariPool-627");
        hikariConfig0.setIsolateInternalQueries(false);
        java.lang.String str15 = hikariConfig0.getConnectionInitSql();
        java.lang.String str16 = hikariConfig0.getCatalog();
        org.junit.Assert.assertNull(dataSource1);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 60 + "'", int10 == 60);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertNull(str16);
    }

    @Test
    public void test17313() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17313");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        javax.sql.DataSource dataSource1 = hikariConfig0.getDataSource();
        hikariConfig0.idleTimeout = 3;
        hikariConfig0.setLeakDetectionThreshold(52L);
        int int6 = hikariConfig0.minPoolSize;
        boolean boolean7 = hikariConfig0.isReadOnly();
        hikariConfig0.setConnectionTestQuery("");
        java.lang.String str10 = hikariConfig0.connectionTestQuery;
        com.zaxxer.hikari.HikariConfig hikariConfig12 = new com.zaxxer.hikari.HikariConfig();
        javax.sql.DataSource dataSource13 = hikariConfig12.getDataSource();
        hikariConfig12.setConnectionTestQuery("");
        hikariConfig12.setInitializationFailFast(false);
        hikariConfig12.catalog = "";
        javax.sql.DataSource dataSource20 = null;
        hikariConfig12.dataSource = dataSource20;
        javax.sql.DataSource dataSource22 = null;
        hikariConfig12.dataSource = dataSource22;
        int int24 = hikariConfig12.maxPoolSize;
        javax.sql.DataSource dataSource25 = null;
        hikariConfig12.dataSource = dataSource25;
        java.lang.String str27 = hikariConfig12.connectionTestQuery;
        hikariConfig12.setAcquireRetries(0);
        long long30 = hikariConfig12.maxLifetime;
        hikariConfig0.addDataSourceProperty("HikariPool-7532", (java.lang.Object) hikariConfig12);
        hikariConfig12.maxLifetime = (byte) -1;
        boolean boolean34 = hikariConfig12.isIsolateInternalQueries;
        org.junit.Assert.assertNull(dataSource1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNull(dataSource13);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 60 + "'", int24 == 60);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "" + "'", str27, "");
// flaky:         org.junit.Assert.assertTrue("'" + long30 + "' != '" + 32L + "'", long30 == 32L);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
    }

    @Test
    public void test17314() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17314");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        javax.sql.DataSource dataSource1 = hikariConfig0.getDataSource();
        hikariConfig0.setConnectionTestQuery("");
        hikariConfig0.connectionCustomizerClassName = "";
        hikariConfig0.setConnectionCustomizerClassName("hi!");
        java.lang.String str8 = hikariConfig0.getCatalog();
        boolean boolean9 = hikariConfig0.isRegisterMbeans;
        hikariConfig0.setAcquireRetries(0);
        hikariConfig0.setMaximumPoolSize((int) '#');
        hikariConfig0.setTransactionIsolation("hi!");
        boolean boolean16 = hikariConfig0.isInitializationFailFast();
        long long17 = hikariConfig0.getMaxLifetime();
        hikariConfig0.setTransactionIsolation("");
        hikariConfig0.connectionTestQuery = "HikariPool-833";
        hikariConfig0.isInitializationFailFast = false;
        int int24 = hikariConfig0.minPoolSize;
        boolean boolean25 = hikariConfig0.isAutoCommit();
        org.junit.Assert.assertNull(dataSource1);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
// flaky:         org.junit.Assert.assertTrue("'" + long17 + "' != '" + 32L + "'", long17 == 32L);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 10 + "'", int24 == 10);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
    }

    @Test
    public void test17315() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17315");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        hikariConfig0.setMaxLifetime((long) (short) 10);
        java.lang.String str3 = hikariConfig0.getPoolName();
        hikariConfig0.jdbcUrl = "";
        hikariConfig0.setMaxLifetime(0L);
        hikariConfig0.setTransactionIsolation("HikariPool-48");
        com.zaxxer.hikari.HikariConfig hikariConfig10 = new com.zaxxer.hikari.HikariConfig();
        hikariConfig10.setMaxLifetime((long) (short) 10);
        com.zaxxer.hikari.HikariConfig hikariConfig13 = new com.zaxxer.hikari.HikariConfig();
        javax.sql.DataSource dataSource14 = hikariConfig13.getDataSource();
        hikariConfig13.setConnectionTestQuery("");
        hikariConfig13.setInitializationFailFast(false);
        long long19 = hikariConfig13.getConnectionTimeout();
        java.util.Properties properties20 = hikariConfig13.dataSourceProperties;
        hikariConfig10.dataSourceProperties = properties20;
        hikariConfig0.setDataSourceProperties(properties20);
        java.lang.String str23 = hikariConfig0.getJdbcUrl();
        hikariConfig0.setUseInstrumentation(false);
        hikariConfig0.setUseInstrumentation(false);
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "HikariPool-42546" + "'", str3, "HikariPool-42546");
        org.junit.Assert.assertNull(dataSource14);
// flaky:         org.junit.Assert.assertTrue("'" + long19 + "' != '" + 32L + "'", long19 == 32L);
        org.junit.Assert.assertNotNull(properties20);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
    }

    @Test
    public void test17316() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17316");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        javax.sql.DataSource dataSource1 = hikariConfig0.getDataSource();
        hikariConfig0.setConnectionTestQuery("");
        hikariConfig0.setInitializationFailFast(false);
        hikariConfig0.catalog = "";
        javax.sql.DataSource dataSource8 = null;
        hikariConfig0.dataSource = dataSource8;
        javax.sql.DataSource dataSource10 = null;
        hikariConfig0.dataSource = dataSource10;
        int int12 = hikariConfig0.maxPoolSize;
        long long13 = hikariConfig0.getIdleTimeout();
        javax.sql.DataSource dataSource14 = hikariConfig0.dataSource;
        hikariConfig0.setDataSourceClassName("HikariPool-122");
        hikariConfig0.acquireIncrement = 0;
        com.zaxxer.hikari.IConnectionCustomizer iConnectionCustomizer19 = null;
        hikariConfig0.connectionCustomizer = iConnectionCustomizer19;
        hikariConfig0.leakDetectionThreshold = (byte) -1;
        hikariConfig0.maxLifetime = (-1L);
        hikariConfig0.acquireRetryDelay = (short) 0;
        // The following exception was thrown during execution in test generation
        try {
            hikariConfig0.setConnectionTimeout((long) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: connectionTimeout cannot be less than 100ms");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(dataSource1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 60 + "'", int12 == 60);
// flaky:         org.junit.Assert.assertTrue("'" + long13 + "' != '" + (-1L) + "'", long13 == (-1L));
        org.junit.Assert.assertNull(dataSource14);
    }

    @Test
    public void test17317() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17317");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        java.lang.String str1 = hikariConfig0.getConnectionInitSql();
        long long2 = hikariConfig0.getLeakDetectionThreshold();
        hikariConfig0.setTransactionIsolation("");
        boolean boolean5 = hikariConfig0.isInitializationFailFast();
        java.lang.String str6 = hikariConfig0.transactionIsolationName;
        com.zaxxer.hikari.IConnectionCustomizer iConnectionCustomizer7 = hikariConfig0.connectionCustomizer;
        hikariConfig0.setDataSourceClassName("HikariPool-3675");
        com.zaxxer.hikari.IConnectionCustomizer iConnectionCustomizer10 = hikariConfig0.connectionCustomizer;
        hikariConfig0.leakDetectionThreshold = (short) 10;
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNull(iConnectionCustomizer7);
        org.junit.Assert.assertNull(iConnectionCustomizer10);
    }

    @Test
    public void test17318() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17318");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        int int1 = hikariConfig0.getTransactionIsolation();
        long long2 = hikariConfig0.leakDetectionThreshold;
        java.lang.String str3 = hikariConfig0.getConnectionCustomizerClassName();
        int int4 = hikariConfig0.getTransactionIsolation();
        boolean boolean5 = hikariConfig0.isReadOnly();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test17319() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17319");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        javax.sql.DataSource dataSource1 = hikariConfig0.getDataSource();
        hikariConfig0.setConnectionTestQuery("");
        hikariConfig0.setInitializationFailFast(false);
        hikariConfig0.catalog = "";
        javax.sql.DataSource dataSource8 = null;
        hikariConfig0.dataSource = dataSource8;
        javax.sql.DataSource dataSource10 = null;
        hikariConfig0.dataSource = dataSource10;
        int int12 = hikariConfig0.maxPoolSize;
        long long13 = hikariConfig0.getIdleTimeout();
        javax.sql.DataSource dataSource14 = hikariConfig0.dataSource;
        hikariConfig0.idleTimeout = (short) 1;
        hikariConfig0.connectionTimeout = 0L;
        com.zaxxer.hikari.IConnectionCustomizer iConnectionCustomizer19 = null;
        hikariConfig0.connectionCustomizer = iConnectionCustomizer19;
        hikariConfig0.setLeakDetectionThreshold(60L);
        int int23 = hikariConfig0.getMinimumPoolSize();
        org.junit.Assert.assertNull(dataSource1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 60 + "'", int12 == 60);
// flaky:         org.junit.Assert.assertTrue("'" + long13 + "' != '" + (-1L) + "'", long13 == (-1L));
        org.junit.Assert.assertNull(dataSource14);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 10 + "'", int23 == 10);
    }

    @Test
    public void test17320() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17320");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        java.lang.String str1 = hikariConfig0.getConnectionInitSql();
        hikariConfig0.setMaxLifetime(35L);
        hikariConfig0.setAutoCommit(false);
        int int6 = hikariConfig0.getTransactionIsolation();
        long long7 = hikariConfig0.connectionTimeout;
        java.util.Properties properties8 = hikariConfig0.dataSourceProperties;
        boolean boolean9 = hikariConfig0.isIsolateInternalQueries;
        int int10 = hikariConfig0.maxPoolSize;
        hikariConfig0.setTransactionIsolation("");
        hikariConfig0.connectionInitSql = "HikariPool-1974";
        hikariConfig0.jdbcUrl = "";
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
// flaky:         org.junit.Assert.assertTrue("'" + long7 + "' != '" + 32L + "'", long7 == 32L);
        org.junit.Assert.assertNotNull(properties8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 60 + "'", int10 == 60);
    }

    @Test
    public void test17321() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17321");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        javax.sql.DataSource dataSource1 = hikariConfig0.getDataSource();
        hikariConfig0.setConnectionTestQuery("");
        hikariConfig0.connectionCustomizerClassName = "";
        hikariConfig0.setConnectionCustomizerClassName("hi!");
        java.lang.String str8 = hikariConfig0.getCatalog();
        java.util.Properties properties9 = hikariConfig0.dataSourceProperties;
        com.zaxxer.hikari.HikariConfig hikariConfig11 = new com.zaxxer.hikari.HikariConfig();
        java.lang.String str12 = hikariConfig11.getConnectionInitSql();
        long long13 = hikariConfig11.getLeakDetectionThreshold();
        hikariConfig11.leakDetectionThreshold = (-1);
        long long16 = hikariConfig11.acquireRetryDelay;
        boolean boolean17 = hikariConfig11.isRegisterMbeans;
        hikariConfig0.addDataSourceProperty("HikariPool-47", (java.lang.Object) boolean17);
        int int19 = hikariConfig0.acquireRetries;
        hikariConfig0.setUseInstrumentation(true);
        hikariConfig0.acquireIncrement = '4';
        long long24 = hikariConfig0.maxLifetime;
        hikariConfig0.poolName = "HikariPool-698";
        hikariConfig0.setIdleTimeout((long) '4');
        org.junit.Assert.assertNull(dataSource1);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNotNull(properties9);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 0L + "'", long13 == 0L);
// flaky:         org.junit.Assert.assertTrue("'" + long16 + "' != '" + 100L + "'", long16 == 100L);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 3 + "'", int19 == 3);
// flaky:         org.junit.Assert.assertTrue("'" + long24 + "' != '" + 32L + "'", long24 == 32L);
    }

    @Test
    public void test17322() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17322");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        hikariConfig0.setMaxLifetime((long) (short) 10);
        int int3 = hikariConfig0.getAcquireRetries();
        boolean boolean4 = hikariConfig0.isJdbc4connectionTest;
        long long5 = hikariConfig0.leakDetectionThreshold;
        long long6 = hikariConfig0.maxLifetime;
        hikariConfig0.connectionCustomizerClassName = "HikariPool-3383";
        java.lang.String str9 = hikariConfig0.jdbcUrl;
        hikariConfig0.connectionTimeout = (short) 100;
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 3 + "'", int3 == 3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 10L + "'", long6 == 10L);
        org.junit.Assert.assertNull(str9);
    }

    @Test
    public void test17323() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17323");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        java.lang.String str1 = hikariConfig0.getConnectionInitSql();
        long long2 = hikariConfig0.getLeakDetectionThreshold();
        int int3 = hikariConfig0.getMaximumPoolSize();
        long long4 = hikariConfig0.leakDetectionThreshold;
        long long5 = hikariConfig0.getConnectionTimeout();
        hikariConfig0.setAcquireIncrement((int) ' ');
        hikariConfig0.leakDetectionThreshold = 2147483647L;
        hikariConfig0.setMaxLifetime(750L);
        int int12 = hikariConfig0.acquireRetries;
        hikariConfig0.setReadOnly(false);
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 60 + "'", int3 == 60);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
// flaky:         org.junit.Assert.assertTrue("'" + long5 + "' != '" + 32L + "'", long5 == 32L);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 3 + "'", int12 == 3);
    }

    @Test
    public void test17324() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17324");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        java.lang.String str1 = hikariConfig0.getConnectionInitSql();
        hikariConfig0.acquireIncrement = 0;
        hikariConfig0.maxLifetime = 100;
        java.lang.String str6 = hikariConfig0.connectionInitSql;
        hikariConfig0.setTransactionIsolation("HikariPool-47");
        hikariConfig0.isRegisterMbeans = true;
        java.lang.String str11 = hikariConfig0.poolName;
        hikariConfig0.minPoolSize = 35;
        int int14 = hikariConfig0.getTransactionIsolation();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str6);
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "HikariPool-42558" + "'", str11, "HikariPool-42558");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
    }

    @Test
    public void test17325() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17325");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        javax.sql.DataSource dataSource1 = hikariConfig0.getDataSource();
        hikariConfig0.setConnectionTestQuery("");
        hikariConfig0.connectionCustomizerClassName = "";
        hikariConfig0.setConnectionCustomizerClassName("hi!");
        java.lang.String str8 = hikariConfig0.getCatalog();
        boolean boolean9 = hikariConfig0.isRegisterMbeans;
        hikariConfig0.setAcquireRetries(0);
        hikariConfig0.setMaximumPoolSize((int) '#');
        hikariConfig0.setTransactionIsolation("hi!");
        boolean boolean16 = hikariConfig0.isInitializationFailFast();
        long long17 = hikariConfig0.getMaxLifetime();
        hikariConfig0.setTransactionIsolation("");
        hikariConfig0.connectionTestQuery = "HikariPool-833";
        hikariConfig0.isInitializationFailFast = false;
        long long24 = hikariConfig0.maxLifetime;
        java.lang.String str25 = hikariConfig0.getConnectionCustomizerClassName();
        org.junit.Assert.assertNull(dataSource1);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
// flaky:         org.junit.Assert.assertTrue("'" + long17 + "' != '" + 32L + "'", long17 == 32L);
// flaky:         org.junit.Assert.assertTrue("'" + long24 + "' != '" + 32L + "'", long24 == 32L);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "hi!" + "'", str25, "hi!");
    }

    @Test
    public void test17326() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17326");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        hikariConfig0.setMaxLifetime((long) (short) 10);
        java.lang.String str3 = hikariConfig0.getPoolName();
        boolean boolean4 = hikariConfig0.isJdbc4ConnectionTest();
        hikariConfig0.setRegisterMbeans(false);
        boolean boolean7 = hikariConfig0.isReadOnly;
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "HikariPool-42560" + "'", str3, "HikariPool-42560");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test17327() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17327");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        javax.sql.DataSource dataSource1 = hikariConfig0.getDataSource();
        hikariConfig0.setConnectionTestQuery("");
        hikariConfig0.connectionCustomizerClassName = "";
        com.zaxxer.hikari.IConnectionCustomizer iConnectionCustomizer6 = hikariConfig0.connectionCustomizer;
        java.lang.String str7 = hikariConfig0.dataSourceClassName;
        boolean boolean8 = hikariConfig0.isInitializationFailFast;
        hikariConfig0.acquireRetries = (byte) 100;
        hikariConfig0.transactionIsolationName = "HikariPool-322";
        hikariConfig0.acquireRetries = (short) 0;
        hikariConfig0.setMaxLifetime((long) (short) -1);
        int int17 = hikariConfig0.getMinimumPoolSize();
        int int18 = hikariConfig0.acquireRetries;
        boolean boolean19 = hikariConfig0.isInitializationFailFast();
        org.junit.Assert.assertNull(dataSource1);
        org.junit.Assert.assertNull(iConnectionCustomizer6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 10 + "'", int17 == 10);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }

    @Test
    public void test17328() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17328");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        javax.sql.DataSource dataSource1 = hikariConfig0.getDataSource();
        hikariConfig0.setConnectionTestQuery("");
        hikariConfig0.connectionCustomizerClassName = "";
        hikariConfig0.setConnectionCustomizerClassName("hi!");
        java.lang.String str8 = hikariConfig0.getCatalog();
        java.util.Properties properties9 = hikariConfig0.dataSourceProperties;
        int int10 = hikariConfig0.minPoolSize;
        long long11 = hikariConfig0.connectionTimeout;
        hikariConfig0.setAcquireRetryDelay((long) (short) 0);
        hikariConfig0.connectionInitSql = "HikariPool-75";
        long long16 = hikariConfig0.getIdleTimeout();
        hikariConfig0.connectionTimeout = 0L;
        java.lang.String str19 = hikariConfig0.getConnectionInitSql();
        hikariConfig0.setLeakDetectionThreshold(5000L);
        hikariConfig0.setCatalog("HikariPool-42496");
        org.junit.Assert.assertNull(dataSource1);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNotNull(properties9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 10 + "'", int10 == 10);
// flaky:         org.junit.Assert.assertTrue("'" + long11 + "' != '" + 32L + "'", long11 == 32L);
// flaky:         org.junit.Assert.assertTrue("'" + long16 + "' != '" + (-1L) + "'", long16 == (-1L));
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "HikariPool-75" + "'", str19, "HikariPool-75");
    }

    @Test
    public void test17329() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17329");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        javax.sql.DataSource dataSource1 = hikariConfig0.getDataSource();
        hikariConfig0.setConnectionTestQuery("");
        hikariConfig0.connectionCustomizerClassName = "";
        long long6 = hikariConfig0.getAcquireRetryDelay();
        hikariConfig0.setDataSourceClassName("HikariPool-66");
        boolean boolean9 = hikariConfig0.isIsolateInternalQueries();
        boolean boolean10 = hikariConfig0.isAutoCommit;
        long long11 = hikariConfig0.getIdleTimeout();
        javax.sql.DataSource dataSource12 = hikariConfig0.dataSource;
        boolean boolean13 = hikariConfig0.isAutoCommit;
        hikariConfig0.jdbcUrl = "HikariPool-955";
        com.zaxxer.hikari.IConnectionCustomizer iConnectionCustomizer16 = hikariConfig0.connectionCustomizer;
        hikariConfig0.setConnectionCustomizerClassName("HikariPool-2830");
        hikariConfig0.setTransactionIsolation("HikariPool-952");
        hikariConfig0.setTransactionIsolation("HikariPool-27410");
        org.junit.Assert.assertNull(dataSource1);
// flaky:         org.junit.Assert.assertTrue("'" + long6 + "' != '" + 100L + "'", long6 == 100L);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
// flaky:         org.junit.Assert.assertTrue("'" + long11 + "' != '" + (-1L) + "'", long11 == (-1L));
        org.junit.Assert.assertNull(dataSource12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNull(iConnectionCustomizer16);
    }

    @Test
    public void test17330() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17330");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        java.lang.String str1 = hikariConfig0.getConnectionInitSql();
        long long2 = hikariConfig0.getLeakDetectionThreshold();
        int int3 = hikariConfig0.getMaximumPoolSize();
        long long4 = hikariConfig0.getIdleTimeout();
        int int5 = hikariConfig0.maxPoolSize;
        java.lang.String str6 = hikariConfig0.getConnectionCustomizerClassName();
        javax.sql.DataSource dataSource7 = hikariConfig0.getDataSource();
        com.zaxxer.hikari.IConnectionCustomizer iConnectionCustomizer8 = hikariConfig0.connectionCustomizer;
        javax.sql.DataSource dataSource9 = null;
        hikariConfig0.setDataSource(dataSource9);
        hikariConfig0.setInitializationFailFast(true);
        com.zaxxer.hikari.IConnectionCustomizer iConnectionCustomizer13 = hikariConfig0.connectionCustomizer;
        com.zaxxer.hikari.HikariConfig hikariConfig15 = new com.zaxxer.hikari.HikariConfig();
        java.lang.String str16 = hikariConfig15.getConnectionInitSql();
        long long17 = hikariConfig15.getLeakDetectionThreshold();
        com.zaxxer.hikari.IConnectionCustomizer iConnectionCustomizer18 = null;
        hikariConfig15.connectionCustomizer = iConnectionCustomizer18;
        boolean boolean20 = hikariConfig15.isIsolateInternalQueries();
        hikariConfig15.poolName = "HikariPool-47";
        java.lang.String str23 = hikariConfig15.transactionIsolationName;
        hikariConfig15.setMaximumPoolSize((int) (short) 10);
        java.util.Properties properties26 = hikariConfig15.getDataSourceProperties();
        hikariConfig15.setReadOnly(false);
        java.lang.String str29 = hikariConfig15.poolName;
        hikariConfig15.setMaxLifetime(3L);
        hikariConfig15.setDataSourceClassName("HikariPool-1316");
        hikariConfig0.addDataSourceProperty("HikariPool-396", (java.lang.Object) hikariConfig15);
        com.zaxxer.hikari.HikariConfig hikariConfig35 = new com.zaxxer.hikari.HikariConfig();
        javax.sql.DataSource dataSource36 = hikariConfig35.getDataSource();
        hikariConfig35.setConnectionTestQuery("");
        hikariConfig35.connectionCustomizerClassName = "";
        hikariConfig35.setConnectionCustomizerClassName("hi!");
        java.lang.String str43 = hikariConfig35.getCatalog();
        java.util.Properties properties44 = hikariConfig35.dataSourceProperties;
        com.zaxxer.hikari.HikariConfig hikariConfig46 = new com.zaxxer.hikari.HikariConfig();
        java.lang.String str47 = hikariConfig46.getConnectionInitSql();
        long long48 = hikariConfig46.getLeakDetectionThreshold();
        hikariConfig46.leakDetectionThreshold = (-1);
        long long51 = hikariConfig46.acquireRetryDelay;
        boolean boolean52 = hikariConfig46.isRegisterMbeans;
        hikariConfig35.addDataSourceProperty("HikariPool-47", (java.lang.Object) boolean52);
        java.util.Properties properties54 = hikariConfig35.getDataSourceProperties();
        hikariConfig35.transactionIsolationName = "HikariPool-18";
        java.util.Properties properties57 = hikariConfig35.getDataSourceProperties();
        javax.sql.DataSource dataSource58 = hikariConfig35.getDataSource();
        java.lang.String str59 = hikariConfig35.getDataSourceClassName();
        com.zaxxer.hikari.HikariConfig hikariConfig60 = new com.zaxxer.hikari.HikariConfig();
        javax.sql.DataSource dataSource61 = hikariConfig60.getDataSource();
        hikariConfig60.setConnectionTestQuery("");
        java.lang.String str64 = hikariConfig60.catalog;
        java.util.Properties properties65 = hikariConfig60.dataSourceProperties;
        hikariConfig35.dataSourceProperties = properties65;
        com.zaxxer.hikari.HikariConfig hikariConfig67 = new com.zaxxer.hikari.HikariConfig(properties65);
        com.zaxxer.hikari.HikariConfig hikariConfig68 = new com.zaxxer.hikari.HikariConfig(properties65);
        hikariConfig0.setDataSourceProperties(properties65);
        long long70 = hikariConfig0.acquireRetryDelay;
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 60 + "'", int3 == 60);
// flaky:         org.junit.Assert.assertTrue("'" + long4 + "' != '" + (-1L) + "'", long4 == (-1L));
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 60 + "'", int5 == 60);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(dataSource7);
        org.junit.Assert.assertNull(iConnectionCustomizer8);
        org.junit.Assert.assertNull(iConnectionCustomizer13);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 0L + "'", long17 == 0L);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNull(str23);
        org.junit.Assert.assertNotNull(properties26);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "HikariPool-47" + "'", str29, "HikariPool-47");
        org.junit.Assert.assertNull(dataSource36);
        org.junit.Assert.assertNull(str43);
        org.junit.Assert.assertNotNull(properties44);
        org.junit.Assert.assertNull(str47);
        org.junit.Assert.assertTrue("'" + long48 + "' != '" + 0L + "'", long48 == 0L);
// flaky:         org.junit.Assert.assertTrue("'" + long51 + "' != '" + 100L + "'", long51 == 100L);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
        org.junit.Assert.assertNotNull(properties54);
        org.junit.Assert.assertNotNull(properties57);
        org.junit.Assert.assertNull(dataSource58);
        org.junit.Assert.assertNull(str59);
        org.junit.Assert.assertNull(dataSource61);
        org.junit.Assert.assertNull(str64);
        org.junit.Assert.assertNotNull(properties65);
// flaky:         org.junit.Assert.assertTrue("'" + long70 + "' != '" + 100L + "'", long70 == 100L);
    }

    @Test
    public void test17331() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17331");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        java.lang.String str1 = hikariConfig0.getConnectionInitSql();
        long long2 = hikariConfig0.getLeakDetectionThreshold();
        hikariConfig0.leakDetectionThreshold = (-1);
        long long5 = hikariConfig0.acquireRetryDelay;
        boolean boolean6 = hikariConfig0.isRegisterMbeans;
        hikariConfig0.setConnectionInitSql("");
        hikariConfig0.connectionTimeout = 0L;
        hikariConfig0.setJdbcUrl("HikariPool-978");
        hikariConfig0.setPoolName("HikariPool-29376");
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
// flaky:         org.junit.Assert.assertTrue("'" + long5 + "' != '" + 100L + "'", long5 == 100L);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test17332() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17332");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        java.lang.String str1 = hikariConfig0.getConnectionInitSql();
        long long2 = hikariConfig0.getLeakDetectionThreshold();
        boolean boolean3 = hikariConfig0.isIsolateInternalQueries;
        boolean boolean4 = hikariConfig0.isJdbc4ConnectionTest();
        boolean boolean5 = hikariConfig0.isAutoCommit();
        boolean boolean6 = hikariConfig0.isRegisterMbeans;
        hikariConfig0.idleTimeout = (short) 0;
        com.zaxxer.hikari.HikariConfig hikariConfig10 = new com.zaxxer.hikari.HikariConfig();
        javax.sql.DataSource dataSource11 = hikariConfig10.getDataSource();
        hikariConfig10.setConnectionTestQuery("");
        hikariConfig10.connectionCustomizerClassName = "";
        hikariConfig10.setConnectionCustomizerClassName("hi!");
        java.lang.String str18 = hikariConfig10.getCatalog();
        boolean boolean19 = hikariConfig10.isRegisterMbeans;
        hikariConfig10.setAcquireRetries(0);
        hikariConfig10.setMaximumPoolSize((int) '#');
        hikariConfig10.setTransactionIsolation("hi!");
        hikariConfig10.setConnectionInitSql("hi!");
        javax.sql.DataSource dataSource28 = hikariConfig10.getDataSource();
        javax.sql.DataSource dataSource29 = null;
        hikariConfig10.setDataSource(dataSource29);
        boolean boolean31 = hikariConfig10.isJdbc4ConnectionTest();
        hikariConfig10.setAcquireRetries(1);
        hikariConfig0.addDataSourceProperty("HikariPool-25480", (java.lang.Object) hikariConfig10);
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(dataSource11);
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNull(dataSource28);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + true + "'", boolean31 == true);
    }

    @Test
    public void test17333() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17333");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        int int1 = hikariConfig0.getTransactionIsolation();
        long long2 = hikariConfig0.leakDetectionThreshold;
        hikariConfig0.setMinimumPoolSize((int) (byte) 100);
        int int5 = hikariConfig0.acquireRetries;
        java.lang.String str6 = hikariConfig0.catalog;
        hikariConfig0.setDataSourceClassName("HikariPool-73");
        javax.sql.DataSource dataSource9 = hikariConfig0.getDataSource();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 3 + "'", int5 == 3);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(dataSource9);
    }

    @Test
    public void test17334() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17334");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        javax.sql.DataSource dataSource1 = hikariConfig0.getDataSource();
        hikariConfig0.setConnectionTestQuery("");
        hikariConfig0.setInitializationFailFast(false);
        long long6 = hikariConfig0.getConnectionTimeout();
        hikariConfig0.setJdbcUrl("HikariPool-47");
        hikariConfig0.setCatalog("HikariPool-135");
        com.zaxxer.hikari.IConnectionCustomizer iConnectionCustomizer11 = null;
        hikariConfig0.connectionCustomizer = iConnectionCustomizer11;
        int int13 = hikariConfig0.acquireIncrement;
        hikariConfig0.setJdbc4ConnectionTest(false);
        hikariConfig0.poolName = "HikariPool-5054";
        org.junit.Assert.assertNull(dataSource1);
// flaky:         org.junit.Assert.assertTrue("'" + long6 + "' != '" + 32L + "'", long6 == 32L);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
    }

    @Test
    public void test17335() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17335");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        javax.sql.DataSource dataSource1 = hikariConfig0.getDataSource();
        hikariConfig0.setConnectionTestQuery("");
        hikariConfig0.connectionCustomizerClassName = "";
        hikariConfig0.setConnectionCustomizerClassName("hi!");
        java.lang.String str8 = hikariConfig0.getCatalog();
        boolean boolean9 = hikariConfig0.isRegisterMbeans;
        hikariConfig0.setAcquireRetries(0);
        long long12 = hikariConfig0.maxLifetime;
        java.lang.String str13 = hikariConfig0.getConnectionInitSql();
        com.zaxxer.hikari.IConnectionCustomizer iConnectionCustomizer14 = hikariConfig0.connectionCustomizer;
        java.lang.String str15 = hikariConfig0.getConnectionCustomizerClassName();
        hikariConfig0.acquireRetries = (short) 1;
        hikariConfig0.setMaximumPoolSize(0);
        java.lang.String str20 = hikariConfig0.connectionCustomizerClassName;
        hikariConfig0.catalog = "HikariPool-3854";
        hikariConfig0.setRegisterMbeans(false);
        boolean boolean25 = hikariConfig0.isIsolateInternalQueries();
        java.lang.String str26 = hikariConfig0.catalog;
        org.junit.Assert.assertNull(dataSource1);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
// flaky:         org.junit.Assert.assertTrue("'" + long12 + "' != '" + 32L + "'", long12 == 32L);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNull(iConnectionCustomizer14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "hi!" + "'", str20, "hi!");
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "HikariPool-3854" + "'", str26, "HikariPool-3854");
    }

    @Test
    public void test17336() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17336");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        javax.sql.DataSource dataSource1 = hikariConfig0.getDataSource();
        hikariConfig0.setConnectionTestQuery("");
        hikariConfig0.setInitializationFailFast(false);
        hikariConfig0.catalog = "";
        javax.sql.DataSource dataSource8 = hikariConfig0.getDataSource();
        hikariConfig0.acquireRetries = (short) 10;
        int int11 = hikariConfig0.getAcquireIncrement();
        int int12 = hikariConfig0.minPoolSize;
        hikariConfig0.connectionCustomizerClassName = "HikariPool-3";
        long long15 = hikariConfig0.getLeakDetectionThreshold();
        hikariConfig0.acquireIncrement = '4';
        hikariConfig0.setAcquireRetryDelay((long) 32);
        org.junit.Assert.assertNull(dataSource1);
        org.junit.Assert.assertNull(dataSource8);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 10 + "'", int12 == 10);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 0L + "'", long15 == 0L);
    }

    @Test
    public void test17337() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17337");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        java.lang.String str1 = hikariConfig0.getConnectionInitSql();
        long long2 = hikariConfig0.getLeakDetectionThreshold();
        com.zaxxer.hikari.IConnectionCustomizer iConnectionCustomizer3 = null;
        hikariConfig0.connectionCustomizer = iConnectionCustomizer3;
        boolean boolean5 = hikariConfig0.isIsolateInternalQueries();
        hikariConfig0.poolName = "HikariPool-47";
        java.lang.String str8 = hikariConfig0.getCatalog();
        long long9 = hikariConfig0.acquireRetryDelay;
        com.zaxxer.hikari.HikariConfig hikariConfig10 = new com.zaxxer.hikari.HikariConfig();
        java.lang.String str11 = hikariConfig10.getConnectionInitSql();
        long long12 = hikariConfig10.getLeakDetectionThreshold();
        int int13 = hikariConfig10.getMaximumPoolSize();
        java.util.Properties properties14 = hikariConfig10.getDataSourceProperties();
        hikariConfig0.setDataSourceProperties(properties14);
        boolean boolean16 = hikariConfig0.isAutoCommit();
        hikariConfig0.setRegisterMbeans(false);
        java.lang.String str19 = hikariConfig0.getConnectionCustomizerClassName();
        hikariConfig0.connectionInitSql = "HikariPool-11666";
        hikariConfig0.setAcquireIncrement((int) (short) 1);
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(str8);
// flaky:         org.junit.Assert.assertTrue("'" + long9 + "' != '" + 100L + "'", long9 == 100L);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 60 + "'", int13 == 60);
        org.junit.Assert.assertNotNull(properties14);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertNull(str19);
    }

    @Test
    public void test17338() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17338");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        javax.sql.DataSource dataSource1 = hikariConfig0.getDataSource();
        hikariConfig0.setConnectionTestQuery("");
        hikariConfig0.connectionCustomizerClassName = "";
        hikariConfig0.setConnectionCustomizerClassName("hi!");
        java.lang.String str8 = hikariConfig0.getCatalog();
        boolean boolean9 = hikariConfig0.isRegisterMbeans;
        hikariConfig0.setAcquireRetries(0);
        hikariConfig0.setMaximumPoolSize((int) '#');
        hikariConfig0.setTransactionIsolation("hi!");
        boolean boolean16 = hikariConfig0.isInitializationFailFast();
        long long17 = hikariConfig0.getMaxLifetime();
        javax.sql.DataSource dataSource18 = hikariConfig0.dataSource;
        hikariConfig0.setConnectionInitSql("hi!");
        hikariConfig0.isInitializationFailFast = false;
        org.junit.Assert.assertNull(dataSource1);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
// flaky:         org.junit.Assert.assertTrue("'" + long17 + "' != '" + 32L + "'", long17 == 32L);
        org.junit.Assert.assertNull(dataSource18);
    }

    @Test
    public void test17339() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17339");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        javax.sql.DataSource dataSource1 = hikariConfig0.getDataSource();
        hikariConfig0.setConnectionTestQuery("");
        hikariConfig0.setInitializationFailFast(false);
        hikariConfig0.catalog = "";
        int int8 = hikariConfig0.getMaximumPoolSize();
        hikariConfig0.leakDetectionThreshold = (short) 10;
        hikariConfig0.isJdbc4connectionTest = true;
        boolean boolean13 = hikariConfig0.isReadOnly();
        java.lang.String str14 = hikariConfig0.getConnectionInitSql();
        boolean boolean15 = hikariConfig0.isJdbc4connectionTest;
        hikariConfig0.setIdleTimeout(1L);
        hikariConfig0.maxLifetime = 100L;
        hikariConfig0.setDataSourceClassName("HikariPool-880");
        hikariConfig0.setCatalog("HikariPool-145");
        boolean boolean24 = hikariConfig0.isReadOnly();
        hikariConfig0.isJdbc4connectionTest = false;
        org.junit.Assert.assertNull(dataSource1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 60 + "'", int8 == 60);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
    }

    @Test
    public void test17340() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17340");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        javax.sql.DataSource dataSource1 = hikariConfig0.getDataSource();
        hikariConfig0.setConnectionTestQuery("");
        hikariConfig0.connectionCustomizerClassName = "";
        hikariConfig0.setConnectionCustomizerClassName("hi!");
        java.lang.String str8 = hikariConfig0.getCatalog();
        java.util.Properties properties9 = hikariConfig0.dataSourceProperties;
        com.zaxxer.hikari.HikariConfig hikariConfig11 = new com.zaxxer.hikari.HikariConfig();
        java.lang.String str12 = hikariConfig11.getConnectionInitSql();
        long long13 = hikariConfig11.getLeakDetectionThreshold();
        hikariConfig11.leakDetectionThreshold = (-1);
        long long16 = hikariConfig11.acquireRetryDelay;
        boolean boolean17 = hikariConfig11.isRegisterMbeans;
        hikariConfig0.addDataSourceProperty("HikariPool-47", (java.lang.Object) boolean17);
        java.util.Properties properties19 = hikariConfig0.getDataSourceProperties();
        hikariConfig0.transactionIsolationName = "HikariPool-18";
        java.util.Properties properties22 = hikariConfig0.getDataSourceProperties();
        javax.sql.DataSource dataSource23 = hikariConfig0.getDataSource();
        hikariConfig0.acquireRetries = (short) 10;
        hikariConfig0.setMaxLifetime((long) 35);
        hikariConfig0.setConnectionTestQuery("HikariPool-352");
        long long30 = hikariConfig0.getIdleTimeout();
        org.junit.Assert.assertNull(dataSource1);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNotNull(properties9);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 0L + "'", long13 == 0L);
// flaky:         org.junit.Assert.assertTrue("'" + long16 + "' != '" + 100L + "'", long16 == 100L);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(properties19);
        org.junit.Assert.assertNotNull(properties22);
        org.junit.Assert.assertNull(dataSource23);
// flaky:         org.junit.Assert.assertTrue("'" + long30 + "' != '" + (-1L) + "'", long30 == (-1L));
    }

    @Test
    public void test17341() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17341");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        java.lang.String str1 = hikariConfig0.getConnectionInitSql();
        long long2 = hikariConfig0.getLeakDetectionThreshold();
        hikariConfig0.leakDetectionThreshold = (-1);
        long long5 = hikariConfig0.acquireRetryDelay;
        hikariConfig0.setLeakDetectionThreshold((long) (byte) -1);
        java.util.Properties properties8 = hikariConfig0.getDataSourceProperties();
        boolean boolean9 = hikariConfig0.isReadOnly();
        hikariConfig0.jdbcUrl = "HikariPool-29";
        java.lang.String str12 = hikariConfig0.getConnectionTestQuery();
        boolean boolean13 = hikariConfig0.isJdbc4ConnectionTest();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
// flaky:         org.junit.Assert.assertTrue("'" + long5 + "' != '" + 100L + "'", long5 == 100L);
        org.junit.Assert.assertNotNull(properties8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
    }

    @Test
    public void test17342() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17342");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        java.lang.String str1 = hikariConfig0.getConnectionInitSql();
        hikariConfig0.setMaxLifetime(35L);
        hikariConfig0.setAutoCommit(false);
        com.zaxxer.hikari.HikariConfig hikariConfig6 = new com.zaxxer.hikari.HikariConfig();
        javax.sql.DataSource dataSource7 = hikariConfig6.getDataSource();
        hikariConfig6.setConnectionTestQuery("");
        hikariConfig6.connectionCustomizerClassName = "";
        hikariConfig6.setConnectionCustomizerClassName("hi!");
        java.lang.String str14 = hikariConfig6.getCatalog();
        com.zaxxer.hikari.IConnectionCustomizer iConnectionCustomizer15 = null;
        hikariConfig6.connectionCustomizer = iConnectionCustomizer15;
        hikariConfig6.setJdbcUrl("HikariPool-38");
        com.zaxxer.hikari.HikariConfig hikariConfig19 = new com.zaxxer.hikari.HikariConfig();
        hikariConfig19.setMaxLifetime((long) (short) 10);
        com.zaxxer.hikari.HikariConfig hikariConfig22 = new com.zaxxer.hikari.HikariConfig();
        javax.sql.DataSource dataSource23 = hikariConfig22.getDataSource();
        hikariConfig22.setConnectionTestQuery("");
        hikariConfig22.setInitializationFailFast(false);
        long long28 = hikariConfig22.getConnectionTimeout();
        java.util.Properties properties29 = hikariConfig22.dataSourceProperties;
        hikariConfig19.dataSourceProperties = properties29;
        hikariConfig6.setDataSourceProperties(properties29);
        hikariConfig0.setDataSourceProperties(properties29);
        java.util.Properties properties33 = hikariConfig0.getDataSourceProperties();
        com.zaxxer.hikari.HikariConfig hikariConfig34 = new com.zaxxer.hikari.HikariConfig(properties33);
        com.zaxxer.hikari.HikariConfig hikariConfig35 = new com.zaxxer.hikari.HikariConfig();
        javax.sql.DataSource dataSource36 = hikariConfig35.getDataSource();
        hikariConfig35.idleTimeout = 3;
        hikariConfig35.setMaxLifetime((long) '4');
        java.lang.String str41 = hikariConfig35.getConnectionTestQuery();
        hikariConfig35.leakDetectionThreshold = 0;
        boolean boolean44 = hikariConfig35.isAutoCommit();
        java.util.Properties properties45 = hikariConfig35.dataSourceProperties;
        hikariConfig34.dataSourceProperties = properties45;
        javax.sql.DataSource dataSource47 = null;
        hikariConfig34.dataSource = dataSource47;
        hikariConfig34.transactionIsolation = 35;
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(dataSource7);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNull(dataSource23);
// flaky:         org.junit.Assert.assertTrue("'" + long28 + "' != '" + 32L + "'", long28 == 32L);
        org.junit.Assert.assertNotNull(properties29);
        org.junit.Assert.assertNotNull(properties33);
        org.junit.Assert.assertNull(dataSource36);
        org.junit.Assert.assertNull(str41);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + true + "'", boolean44 == true);
        org.junit.Assert.assertNotNull(properties45);
    }

    @Test
    public void test17343() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17343");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        java.lang.String str1 = hikariConfig0.getConnectionInitSql();
        long long2 = hikariConfig0.getLeakDetectionThreshold();
        com.zaxxer.hikari.IConnectionCustomizer iConnectionCustomizer3 = null;
        hikariConfig0.connectionCustomizer = iConnectionCustomizer3;
        boolean boolean5 = hikariConfig0.isIsolateInternalQueries();
        hikariConfig0.poolName = "HikariPool-47";
        java.lang.String str8 = hikariConfig0.getCatalog();
        hikariConfig0.dataSourceClassName = "HikariPool-616";
        long long11 = hikariConfig0.getAcquireRetryDelay();
        hikariConfig0.minPoolSize = (byte) 100;
        java.lang.String str14 = hikariConfig0.transactionIsolationName;
        hikariConfig0.maxLifetime = 52;
        hikariConfig0.maxLifetime = (short) 0;
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(str8);
// flaky:         org.junit.Assert.assertTrue("'" + long11 + "' != '" + 100L + "'", long11 == 100L);
        org.junit.Assert.assertNull(str14);
    }

    @Test
    public void test17344() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17344");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        javax.sql.DataSource dataSource1 = hikariConfig0.getDataSource();
        hikariConfig0.setConnectionTestQuery("");
        hikariConfig0.setInitializationFailFast(false);
        hikariConfig0.catalog = "";
        javax.sql.DataSource dataSource8 = null;
        hikariConfig0.dataSource = dataSource8;
        javax.sql.DataSource dataSource10 = null;
        hikariConfig0.dataSource = dataSource10;
        int int12 = hikariConfig0.maxPoolSize;
        long long13 = hikariConfig0.getIdleTimeout();
        javax.sql.DataSource dataSource14 = hikariConfig0.dataSource;
        hikariConfig0.idleTimeout = (short) 1;
        hikariConfig0.connectionTimeout = 0L;
        com.zaxxer.hikari.IConnectionCustomizer iConnectionCustomizer19 = null;
        hikariConfig0.connectionCustomizer = iConnectionCustomizer19;
        hikariConfig0.idleTimeout = (-1);
        long long23 = hikariConfig0.idleTimeout;
        java.lang.String str24 = hikariConfig0.getJdbcUrl();
        hikariConfig0.setConnectionTestQuery("HikariPool-1207");
        java.lang.String str27 = hikariConfig0.connectionTestQuery;
        boolean boolean28 = hikariConfig0.isInitializationFailFast;
        org.junit.Assert.assertNull(dataSource1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 60 + "'", int12 == 60);
// flaky:         org.junit.Assert.assertTrue("'" + long13 + "' != '" + (-1L) + "'", long13 == (-1L));
        org.junit.Assert.assertNull(dataSource14);
        org.junit.Assert.assertTrue("'" + long23 + "' != '" + (-1L) + "'", long23 == (-1L));
        org.junit.Assert.assertNull(str24);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "HikariPool-1207" + "'", str27, "HikariPool-1207");
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
    }

    @Test
    public void test17345() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17345");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        javax.sql.DataSource dataSource1 = hikariConfig0.getDataSource();
        hikariConfig0.setConnectionTestQuery("");
        hikariConfig0.setInitializationFailFast(false);
        hikariConfig0.catalog = "";
        javax.sql.DataSource dataSource8 = null;
        hikariConfig0.dataSource = dataSource8;
        boolean boolean10 = hikariConfig0.isRegisterMbeans();
        boolean boolean11 = hikariConfig0.isJdbc4ConnectionTest();
        hikariConfig0.maxLifetime = 35;
        hikariConfig0.setConnectionTestQuery("HikariPool-932");
        hikariConfig0.setConnectionInitSql("HikariPool-20729");
        org.junit.Assert.assertNull(dataSource1);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
    }

    @Test
    public void test17346() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17346");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        java.lang.String str1 = hikariConfig0.getConnectionInitSql();
        long long2 = hikariConfig0.getLeakDetectionThreshold();
        int int3 = hikariConfig0.getMaximumPoolSize();
        long long4 = hikariConfig0.leakDetectionThreshold;
        hikariConfig0.catalog = "HikariPool-62";
        boolean boolean7 = hikariConfig0.isJdbc4connectionTest;
        int int8 = hikariConfig0.acquireRetries;
        hikariConfig0.setJdbcUrl("HikariPool-211");
        boolean boolean11 = hikariConfig0.isIsolateInternalQueries();
        hikariConfig0.maxPoolSize = (byte) 0;
        int int14 = hikariConfig0.getMinimumPoolSize();
        javax.sql.DataSource dataSource15 = hikariConfig0.dataSource;
        boolean boolean16 = hikariConfig0.isAutoCommit;
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 60 + "'", int3 == 60);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 3 + "'", int8 == 3);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 10 + "'", int14 == 10);
        org.junit.Assert.assertNull(dataSource15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
    }

    @Test
    public void test17347() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17347");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        java.lang.String str1 = hikariConfig0.getConnectionInitSql();
        long long2 = hikariConfig0.getLeakDetectionThreshold();
        hikariConfig0.leakDetectionThreshold = (-1);
        int int5 = hikariConfig0.acquireIncrement;
        hikariConfig0.setPoolName("HikariPool-62");
        hikariConfig0.acquireRetryDelay = 0L;
        java.lang.String str10 = hikariConfig0.getCatalog();
        javax.sql.DataSource dataSource11 = hikariConfig0.getDataSource();
        int int12 = hikariConfig0.getMinimumPoolSize();
        hikariConfig0.setMinimumPoolSize(60);
        boolean boolean15 = hikariConfig0.isIsolateInternalQueries();
        long long16 = hikariConfig0.maxLifetime;
        int int17 = hikariConfig0.maxPoolSize;
        hikariConfig0.poolName = "HikariPool-477";
        int int20 = hikariConfig0.acquireRetries;
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(dataSource11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 10 + "'", int12 == 10);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
// flaky:         org.junit.Assert.assertTrue("'" + long16 + "' != '" + 32L + "'", long16 == 32L);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 60 + "'", int17 == 60);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 3 + "'", int20 == 3);
    }

    @Test
    public void test17348() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17348");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        hikariConfig0.setMaxLifetime((long) (short) 10);
        hikariConfig0.setConnectionTimeout(0L);
        com.zaxxer.hikari.HikariConfig hikariConfig5 = new com.zaxxer.hikari.HikariConfig();
        javax.sql.DataSource dataSource6 = hikariConfig5.getDataSource();
        hikariConfig5.setConnectionTestQuery("");
        com.zaxxer.hikari.HikariConfig hikariConfig9 = new com.zaxxer.hikari.HikariConfig();
        javax.sql.DataSource dataSource10 = hikariConfig9.getDataSource();
        hikariConfig9.setConnectionTestQuery("");
        hikariConfig9.setInitializationFailFast(false);
        long long15 = hikariConfig9.getConnectionTimeout();
        java.util.Properties properties16 = hikariConfig9.dataSourceProperties;
        hikariConfig5.setDataSourceProperties(properties16);
        hikariConfig0.setDataSourceProperties(properties16);
        hikariConfig0.setIdleTimeout((long) '4');
        hikariConfig0.connectionInitSql = "HikariPool-283";
        hikariConfig0.setAutoCommit(true);
        javax.sql.DataSource dataSource25 = null;
        hikariConfig0.dataSource = dataSource25;
        long long27 = hikariConfig0.acquireRetryDelay;
        hikariConfig0.maxPoolSize = (byte) 100;
        org.junit.Assert.assertNull(dataSource6);
        org.junit.Assert.assertNull(dataSource10);
// flaky:         org.junit.Assert.assertTrue("'" + long15 + "' != '" + 32L + "'", long15 == 32L);
        org.junit.Assert.assertNotNull(properties16);
// flaky:         org.junit.Assert.assertTrue("'" + long27 + "' != '" + 100L + "'", long27 == 100L);
    }

    @Test
    public void test17349() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17349");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        javax.sql.DataSource dataSource1 = hikariConfig0.getDataSource();
        hikariConfig0.setConnectionTestQuery("");
        java.lang.String str4 = hikariConfig0.catalog;
        boolean boolean5 = hikariConfig0.isRegisterMbeans;
        hikariConfig0.setConnectionCustomizerClassName("HikariPool-435");
        java.util.Properties properties8 = hikariConfig0.getDataSourceProperties();
        hikariConfig0.catalog = "HikariPool-533";
        hikariConfig0.setTransactionIsolation("HikariPool-1337");
        java.lang.String str13 = hikariConfig0.getCatalog();
        hikariConfig0.setPoolName("HikariPool-966");
        hikariConfig0.leakDetectionThreshold = (byte) -1;
        java.util.Properties properties18 = hikariConfig0.getDataSourceProperties();
        java.lang.String str19 = hikariConfig0.connectionTestQuery;
        hikariConfig0.isReadOnly = false;
        org.junit.Assert.assertNull(dataSource1);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(properties8);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "HikariPool-533" + "'", str13, "HikariPool-533");
        org.junit.Assert.assertNotNull(properties18);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
    }

    @Test
    public void test17350() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17350");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        java.lang.String str1 = hikariConfig0.getConnectionInitSql();
        hikariConfig0.setMaxLifetime(35L);
        int int4 = hikariConfig0.acquireRetries;
        int int5 = hikariConfig0.minPoolSize;
        java.lang.String str6 = hikariConfig0.getPoolName();
        java.lang.String str7 = hikariConfig0.getDataSourceClassName();
        hikariConfig0.setAcquireIncrement((int) (byte) 10);
        hikariConfig0.minPoolSize = (byte) 100;
        hikariConfig0.setInitializationFailFast(true);
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 3 + "'", int4 == 3);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 10 + "'", int5 == 10);
// flaky:         org.junit.Assert.assertEquals("'" + str6 + "' != '" + "HikariPool-42614" + "'", str6, "HikariPool-42614");
        org.junit.Assert.assertNull(str7);
    }

    @Test
    public void test17351() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17351");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        java.lang.String str1 = hikariConfig0.getConnectionInitSql();
        long long2 = hikariConfig0.getLeakDetectionThreshold();
        int int3 = hikariConfig0.getMaximumPoolSize();
        java.lang.String str4 = hikariConfig0.connectionCustomizerClassName;
        hikariConfig0.maxLifetime = (short) 0;
        hikariConfig0.isAutoCommit = true;
        com.zaxxer.hikari.HikariConfig hikariConfig9 = new com.zaxxer.hikari.HikariConfig();
        java.lang.String str10 = hikariConfig9.getConnectionInitSql();
        long long11 = hikariConfig9.getLeakDetectionThreshold();
        hikariConfig9.leakDetectionThreshold = (byte) 0;
        hikariConfig9.acquireRetryDelay = 3L;
        hikariConfig9.poolName = "HikariPool-66";
        com.zaxxer.hikari.HikariConfig hikariConfig18 = new com.zaxxer.hikari.HikariConfig();
        javax.sql.DataSource dataSource19 = hikariConfig18.getDataSource();
        hikariConfig18.setConnectionTestQuery("");
        hikariConfig18.connectionCustomizerClassName = "";
        hikariConfig18.setConnectionCustomizerClassName("hi!");
        java.lang.String str26 = hikariConfig18.getCatalog();
        boolean boolean27 = hikariConfig18.isRegisterMbeans;
        hikariConfig18.setAcquireRetries(0);
        hikariConfig18.setMaximumPoolSize((int) '#');
        hikariConfig18.setTransactionIsolation("hi!");
        boolean boolean34 = hikariConfig18.isInitializationFailFast();
        java.lang.String str35 = hikariConfig18.connectionInitSql;
        hikariConfig18.maxPoolSize = 0;
        java.util.Properties properties38 = hikariConfig18.getDataSourceProperties();
        hikariConfig9.setDataSourceProperties(properties38);
        com.zaxxer.hikari.HikariConfig hikariConfig40 = new com.zaxxer.hikari.HikariConfig(properties38);
        hikariConfig0.dataSourceProperties = properties38;
        int int42 = hikariConfig0.maxPoolSize;
        hikariConfig0.isInitializationFailFast = true;
        long long45 = hikariConfig0.idleTimeout;
        hikariConfig0.setUseInstrumentation(true);
        hikariConfig0.connectionTestQuery = "HikariPool-5098";
        hikariConfig0.setIdleTimeout(3L);
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 60 + "'", int3 == 60);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 0L + "'", long11 == 0L);
        org.junit.Assert.assertNull(dataSource19);
        org.junit.Assert.assertNull(str26);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertNull(str35);
        org.junit.Assert.assertNotNull(properties38);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 60 + "'", int42 == 60);
// flaky:         org.junit.Assert.assertTrue("'" + long45 + "' != '" + (-1L) + "'", long45 == (-1L));
    }

    @Test
    public void test17352() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17352");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        hikariConfig0.setMaxLifetime((long) (short) 10);
        com.zaxxer.hikari.HikariConfig hikariConfig3 = new com.zaxxer.hikari.HikariConfig();
        javax.sql.DataSource dataSource4 = hikariConfig3.getDataSource();
        hikariConfig3.setConnectionTestQuery("");
        hikariConfig3.setInitializationFailFast(false);
        long long9 = hikariConfig3.getConnectionTimeout();
        java.util.Properties properties10 = hikariConfig3.dataSourceProperties;
        hikariConfig0.dataSourceProperties = properties10;
        java.lang.String str12 = hikariConfig0.getConnectionTestQuery();
        hikariConfig0.acquireRetryDelay = 0;
        hikariConfig0.addDataSourceProperty("HikariPool-22138", (java.lang.Object) "HikariPool-2495");
        org.junit.Assert.assertNull(dataSource4);
// flaky:         org.junit.Assert.assertTrue("'" + long9 + "' != '" + 32L + "'", long9 == 32L);
        org.junit.Assert.assertNotNull(properties10);
        org.junit.Assert.assertNull(str12);
    }

    @Test
    public void test17353() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17353");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        hikariConfig0.setMaxLifetime((long) (short) 10);
        java.lang.String str3 = hikariConfig0.getPoolName();
        hikariConfig0.jdbcUrl = "";
        hikariConfig0.setMaxLifetime(0L);
        hikariConfig0.setTransactionIsolation("HikariPool-48");
        com.zaxxer.hikari.HikariConfig hikariConfig10 = new com.zaxxer.hikari.HikariConfig();
        hikariConfig10.setMaxLifetime((long) (short) 10);
        com.zaxxer.hikari.HikariConfig hikariConfig13 = new com.zaxxer.hikari.HikariConfig();
        javax.sql.DataSource dataSource14 = hikariConfig13.getDataSource();
        hikariConfig13.setConnectionTestQuery("");
        hikariConfig13.setInitializationFailFast(false);
        long long19 = hikariConfig13.getConnectionTimeout();
        java.util.Properties properties20 = hikariConfig13.dataSourceProperties;
        hikariConfig10.dataSourceProperties = properties20;
        hikariConfig0.setDataSourceProperties(properties20);
        java.lang.String str23 = hikariConfig0.getJdbcUrl();
        javax.sql.DataSource dataSource24 = hikariConfig0.dataSource;
        hikariConfig0.isJdbc4connectionTest = true;
        java.lang.String str27 = hikariConfig0.transactionIsolationName;
        hikariConfig0.setTransactionIsolation("");
        hikariConfig0.setAcquireIncrement((int) (short) 1);
        hikariConfig0.setMaximumPoolSize((int) (byte) 10);
        javax.sql.DataSource dataSource34 = hikariConfig0.getDataSource();
        hikariConfig0.jdbcUrl = "HikariPool-3447";
        hikariConfig0.setIsolateInternalQueries(true);
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "HikariPool-42623" + "'", str3, "HikariPool-42623");
        org.junit.Assert.assertNull(dataSource14);
// flaky:         org.junit.Assert.assertTrue("'" + long19 + "' != '" + 32L + "'", long19 == 32L);
        org.junit.Assert.assertNotNull(properties20);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
        org.junit.Assert.assertNull(dataSource24);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "HikariPool-48" + "'", str27, "HikariPool-48");
        org.junit.Assert.assertNull(dataSource34);
    }

    @Test
    public void test17354() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17354");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        java.lang.String str1 = hikariConfig0.getConnectionInitSql();
        long long2 = hikariConfig0.getLeakDetectionThreshold();
        int int3 = hikariConfig0.getMaximumPoolSize();
        long long4 = hikariConfig0.leakDetectionThreshold;
        long long5 = hikariConfig0.getConnectionTimeout();
        hikariConfig0.setAcquireIncrement((int) ' ');
        hikariConfig0.setDataSourceClassName("HikariPool-686");
        com.zaxxer.hikari.HikariConfig hikariConfig10 = new com.zaxxer.hikari.HikariConfig();
        java.lang.String str11 = hikariConfig10.getConnectionInitSql();
        hikariConfig10.setMaxLifetime(35L);
        hikariConfig10.setAutoCommit(false);
        com.zaxxer.hikari.HikariConfig hikariConfig16 = new com.zaxxer.hikari.HikariConfig();
        javax.sql.DataSource dataSource17 = hikariConfig16.getDataSource();
        hikariConfig16.setConnectionTestQuery("");
        hikariConfig16.connectionCustomizerClassName = "";
        hikariConfig16.setConnectionCustomizerClassName("hi!");
        java.lang.String str24 = hikariConfig16.getCatalog();
        com.zaxxer.hikari.IConnectionCustomizer iConnectionCustomizer25 = null;
        hikariConfig16.connectionCustomizer = iConnectionCustomizer25;
        hikariConfig16.setJdbcUrl("HikariPool-38");
        com.zaxxer.hikari.HikariConfig hikariConfig29 = new com.zaxxer.hikari.HikariConfig();
        hikariConfig29.setMaxLifetime((long) (short) 10);
        com.zaxxer.hikari.HikariConfig hikariConfig32 = new com.zaxxer.hikari.HikariConfig();
        javax.sql.DataSource dataSource33 = hikariConfig32.getDataSource();
        hikariConfig32.setConnectionTestQuery("");
        hikariConfig32.setInitializationFailFast(false);
        long long38 = hikariConfig32.getConnectionTimeout();
        java.util.Properties properties39 = hikariConfig32.dataSourceProperties;
        hikariConfig29.dataSourceProperties = properties39;
        hikariConfig16.setDataSourceProperties(properties39);
        hikariConfig10.setDataSourceProperties(properties39);
        hikariConfig0.setDataSourceProperties(properties39);
        int int44 = hikariConfig0.maxPoolSize;
        hikariConfig0.setConnectionCustomizerClassName("HikariPool-3236");
        java.lang.String str47 = hikariConfig0.dataSourceClassName;
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 60 + "'", int3 == 60);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
// flaky:         org.junit.Assert.assertTrue("'" + long5 + "' != '" + 32L + "'", long5 == 32L);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNull(dataSource17);
        org.junit.Assert.assertNull(str24);
        org.junit.Assert.assertNull(dataSource33);
// flaky:         org.junit.Assert.assertTrue("'" + long38 + "' != '" + 32L + "'", long38 == 32L);
        org.junit.Assert.assertNotNull(properties39);
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + 60 + "'", int44 == 60);
        org.junit.Assert.assertEquals("'" + str47 + "' != '" + "HikariPool-686" + "'", str47, "HikariPool-686");
    }

    @Test
    public void test17355() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17355");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        javax.sql.DataSource dataSource1 = hikariConfig0.getDataSource();
        hikariConfig0.setConnectionTestQuery("");
        hikariConfig0.setInitializationFailFast(false);
        hikariConfig0.catalog = "";
        com.zaxxer.hikari.HikariConfig hikariConfig8 = new com.zaxxer.hikari.HikariConfig();
        javax.sql.DataSource dataSource9 = hikariConfig8.getDataSource();
        hikariConfig8.setConnectionTestQuery("");
        hikariConfig8.connectionCustomizerClassName = "";
        hikariConfig8.setConnectionCustomizerClassName("hi!");
        java.lang.String str16 = hikariConfig8.getCatalog();
        java.util.Properties properties17 = hikariConfig8.dataSourceProperties;
        hikariConfig0.dataSourceProperties = properties17;
        hikariConfig0.connectionCustomizerClassName = "hi!";
        hikariConfig0.setTransactionIsolation("HikariPool-101");
        hikariConfig0.acquireRetries = 0;
        com.zaxxer.hikari.IConnectionCustomizer iConnectionCustomizer25 = hikariConfig0.connectionCustomizer;
        hikariConfig0.setIdleTimeout((long) (short) 100);
        hikariConfig0.setAcquireRetryDelay((long) 52);
        org.junit.Assert.assertNull(dataSource1);
        org.junit.Assert.assertNull(dataSource9);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertNotNull(properties17);
        org.junit.Assert.assertNull(iConnectionCustomizer25);
    }

    @Test
    public void test17356() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17356");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        java.lang.String str1 = hikariConfig0.getConnectionInitSql();
        long long2 = hikariConfig0.getLeakDetectionThreshold();
        com.zaxxer.hikari.IConnectionCustomizer iConnectionCustomizer3 = null;
        hikariConfig0.connectionCustomizer = iConnectionCustomizer3;
        boolean boolean5 = hikariConfig0.isIsolateInternalQueries();
        hikariConfig0.poolName = "HikariPool-47";
        java.lang.String str8 = hikariConfig0.getCatalog();
        long long9 = hikariConfig0.acquireRetryDelay;
        com.zaxxer.hikari.HikariConfig hikariConfig10 = new com.zaxxer.hikari.HikariConfig();
        java.lang.String str11 = hikariConfig10.getConnectionInitSql();
        long long12 = hikariConfig10.getLeakDetectionThreshold();
        int int13 = hikariConfig10.getMaximumPoolSize();
        java.util.Properties properties14 = hikariConfig10.getDataSourceProperties();
        hikariConfig0.setDataSourceProperties(properties14);
        boolean boolean16 = hikariConfig0.isAutoCommit();
        hikariConfig0.setRegisterMbeans(false);
        java.lang.String str19 = hikariConfig0.getConnectionCustomizerClassName();
        boolean boolean20 = hikariConfig0.isInitializationFailFast();
        java.lang.String str21 = hikariConfig0.getConnectionTestQuery();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(str8);
// flaky:         org.junit.Assert.assertTrue("'" + long9 + "' != '" + 100L + "'", long9 == 100L);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 60 + "'", int13 == 60);
        org.junit.Assert.assertNotNull(properties14);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertNull(str19);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNull(str21);
    }

    @Test
    public void test17357() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17357");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        java.lang.String str1 = hikariConfig0.getConnectionInitSql();
        long long2 = hikariConfig0.getLeakDetectionThreshold();
        int int3 = hikariConfig0.getMaximumPoolSize();
        long long4 = hikariConfig0.getIdleTimeout();
        int int5 = hikariConfig0.maxPoolSize;
        long long6 = hikariConfig0.maxLifetime;
        java.lang.String str7 = hikariConfig0.getConnectionTestQuery();
        int int8 = hikariConfig0.getTransactionIsolation();
        hikariConfig0.setIdleTimeout(0L);
        hikariConfig0.acquireRetries = (-1);
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 60 + "'", int3 == 60);
// flaky:         org.junit.Assert.assertTrue("'" + long4 + "' != '" + (-1L) + "'", long4 == (-1L));
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 60 + "'", int5 == 60);
// flaky:         org.junit.Assert.assertTrue("'" + long6 + "' != '" + 32L + "'", long6 == 32L);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
    }

    @Test
    public void test17358() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17358");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        java.lang.String str1 = hikariConfig0.getConnectionInitSql();
        long long2 = hikariConfig0.getLeakDetectionThreshold();
        hikariConfig0.leakDetectionThreshold = (-1);
        long long5 = hikariConfig0.acquireRetryDelay;
        boolean boolean6 = hikariConfig0.isRegisterMbeans;
        hikariConfig0.connectionTimeout = (short) 10;
        hikariConfig0.setPoolName("HikariPool-16");
        java.lang.String str11 = hikariConfig0.connectionCustomizerClassName;
        java.lang.String str12 = hikariConfig0.connectionCustomizerClassName;
        hikariConfig0.setUseInstrumentation(true);
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
// flaky:         org.junit.Assert.assertTrue("'" + long5 + "' != '" + 100L + "'", long5 == 100L);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNull(str12);
    }

    @Test
    public void test17359() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17359");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        hikariConfig0.setMaxLifetime((long) (short) 10);
        int int3 = hikariConfig0.getAcquireRetries();
        hikariConfig0.setInitializationFailFast(true);
        long long6 = hikariConfig0.getLeakDetectionThreshold();
        java.lang.String str7 = hikariConfig0.transactionIsolationName;
        int int8 = hikariConfig0.getAcquireRetries();
        hikariConfig0.setConnectionInitSql("HikariPool-541");
        hikariConfig0.setLeakDetectionThreshold(100L);
        com.zaxxer.hikari.HikariConfig hikariConfig13 = new com.zaxxer.hikari.HikariConfig();
        java.lang.String str14 = hikariConfig13.getConnectionInitSql();
        long long15 = hikariConfig13.getLeakDetectionThreshold();
        hikariConfig13.leakDetectionThreshold = (-1);
        int int18 = hikariConfig13.acquireIncrement;
        hikariConfig13.setPoolName("HikariPool-62");
        hikariConfig13.acquireRetryDelay = 0L;
        java.lang.String str23 = hikariConfig13.getCatalog();
        javax.sql.DataSource dataSource24 = hikariConfig13.getDataSource();
        int int25 = hikariConfig13.getMinimumPoolSize();
        hikariConfig13.setMinimumPoolSize(60);
        boolean boolean28 = hikariConfig13.isIsolateInternalQueries();
        java.util.Properties properties29 = hikariConfig13.dataSourceProperties;
        hikariConfig0.dataSourceProperties = properties29;
        javax.sql.DataSource dataSource31 = hikariConfig0.dataSource;
        boolean boolean32 = hikariConfig0.isReadOnly;
        long long33 = hikariConfig0.leakDetectionThreshold;
        hikariConfig0.setAcquireIncrement(100);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 3 + "'", int3 == 3);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 3 + "'", int8 == 3);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 0L + "'", long15 == 0L);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertNull(str23);
        org.junit.Assert.assertNull(dataSource24);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 10 + "'", int25 == 10);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertNotNull(properties29);
        org.junit.Assert.assertNull(dataSource31);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertTrue("'" + long33 + "' != '" + 100L + "'", long33 == 100L);
    }

    @Test
    public void test17360() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17360");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        javax.sql.DataSource dataSource1 = hikariConfig0.getDataSource();
        hikariConfig0.setConnectionTestQuery("");
        hikariConfig0.setInitializationFailFast(false);
        long long6 = hikariConfig0.getConnectionTimeout();
        java.util.Properties properties7 = hikariConfig0.dataSourceProperties;
        boolean boolean8 = hikariConfig0.isInitializationFailFast();
        hikariConfig0.setLeakDetectionThreshold(0L);
        hikariConfig0.setUseInstrumentation(false);
        java.util.Properties properties13 = hikariConfig0.dataSourceProperties;
        java.util.Properties properties14 = hikariConfig0.getDataSourceProperties();
        long long15 = hikariConfig0.getIdleTimeout();
        org.junit.Assert.assertNull(dataSource1);
// flaky:         org.junit.Assert.assertTrue("'" + long6 + "' != '" + 32L + "'", long6 == 32L);
        org.junit.Assert.assertNotNull(properties7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(properties13);
        org.junit.Assert.assertNotNull(properties14);
// flaky:         org.junit.Assert.assertTrue("'" + long15 + "' != '" + (-1L) + "'", long15 == (-1L));
    }

    @Test
    public void test17361() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17361");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        java.lang.String str1 = hikariConfig0.getConnectionInitSql();
        long long2 = hikariConfig0.getLeakDetectionThreshold();
        hikariConfig0.leakDetectionThreshold = (-1);
        int int5 = hikariConfig0.acquireIncrement;
        hikariConfig0.setInitializationFailFast(true);
        boolean boolean8 = hikariConfig0.isAutoCommit();
        hikariConfig0.setTransactionIsolation("");
        java.lang.String str11 = hikariConfig0.connectionInitSql;
        long long12 = hikariConfig0.getConnectionTimeout();
        long long13 = hikariConfig0.maxLifetime;
        java.lang.String str14 = hikariConfig0.connectionCustomizerClassName;
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNull(str11);
// flaky:         org.junit.Assert.assertTrue("'" + long12 + "' != '" + 32L + "'", long12 == 32L);
// flaky:         org.junit.Assert.assertTrue("'" + long13 + "' != '" + 32L + "'", long13 == 32L);
        org.junit.Assert.assertNull(str14);
    }

    @Test
    public void test17362() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17362");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        javax.sql.DataSource dataSource1 = hikariConfig0.getDataSource();
        hikariConfig0.setConnectionTestQuery("");
        hikariConfig0.setInitializationFailFast(false);
        hikariConfig0.catalog = "";
        javax.sql.DataSource dataSource8 = null;
        hikariConfig0.dataSource = dataSource8;
        javax.sql.DataSource dataSource10 = null;
        hikariConfig0.dataSource = dataSource10;
        int int12 = hikariConfig0.maxPoolSize;
        long long13 = hikariConfig0.getIdleTimeout();
        javax.sql.DataSource dataSource14 = hikariConfig0.dataSource;
        hikariConfig0.setDataSourceClassName("HikariPool-122");
        hikariConfig0.acquireIncrement = 0;
        com.zaxxer.hikari.IConnectionCustomizer iConnectionCustomizer19 = null;
        hikariConfig0.connectionCustomizer = iConnectionCustomizer19;
        long long21 = hikariConfig0.getConnectionTimeout();
        hikariConfig0.setMinimumPoolSize((int) (short) 10);
        int int24 = hikariConfig0.maxPoolSize;
        com.zaxxer.hikari.IConnectionCustomizer iConnectionCustomizer25 = hikariConfig0.connectionCustomizer;
        int int26 = hikariConfig0.minPoolSize;
        boolean boolean27 = hikariConfig0.isInitializationFailFast;
        org.junit.Assert.assertNull(dataSource1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 60 + "'", int12 == 60);
// flaky:         org.junit.Assert.assertTrue("'" + long13 + "' != '" + (-1L) + "'", long13 == (-1L));
        org.junit.Assert.assertNull(dataSource14);
// flaky:         org.junit.Assert.assertTrue("'" + long21 + "' != '" + 32L + "'", long21 == 32L);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 60 + "'", int24 == 60);
        org.junit.Assert.assertNull(iConnectionCustomizer25);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 10 + "'", int26 == 10);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
    }

    @Test
    public void test17363() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17363");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        javax.sql.DataSource dataSource1 = hikariConfig0.getDataSource();
        hikariConfig0.setConnectionTestQuery("");
        hikariConfig0.connectionCustomizerClassName = "";
        hikariConfig0.setConnectionCustomizerClassName("hi!");
        java.lang.String str8 = hikariConfig0.getCatalog();
        boolean boolean9 = hikariConfig0.isRegisterMbeans;
        hikariConfig0.setJdbcUrl("HikariPool-511");
        hikariConfig0.isReadOnly = false;
        hikariConfig0.catalog = "HikariPool-2025";
        hikariConfig0.dataSourceClassName = "HikariPool-3415";
        org.junit.Assert.assertNull(dataSource1);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test17364() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17364");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        javax.sql.DataSource dataSource1 = hikariConfig0.getDataSource();
        hikariConfig0.setConnectionTestQuery("");
        hikariConfig0.connectionCustomizerClassName = "";
        com.zaxxer.hikari.IConnectionCustomizer iConnectionCustomizer6 = hikariConfig0.connectionCustomizer;
        java.lang.String str7 = hikariConfig0.dataSourceClassName;
        java.util.Properties properties8 = hikariConfig0.getDataSourceProperties();
        hikariConfig0.setMinimumPoolSize(35);
        int int11 = hikariConfig0.getAcquireIncrement();
        hikariConfig0.setConnectionCustomizerClassName("HikariPool-1316");
        com.zaxxer.hikari.IConnectionCustomizer iConnectionCustomizer14 = hikariConfig0.connectionCustomizer;
        hikariConfig0.setIdleTimeout((long) 'a');
        org.junit.Assert.assertNull(dataSource1);
        org.junit.Assert.assertNull(iConnectionCustomizer6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNotNull(properties8);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertNull(iConnectionCustomizer14);
    }

    @Test
    public void test17365() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17365");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        javax.sql.DataSource dataSource1 = hikariConfig0.getDataSource();
        hikariConfig0.setConnectionTestQuery("");
        hikariConfig0.connectionCustomizerClassName = "";
        hikariConfig0.setConnectionCustomizerClassName("hi!");
        java.lang.String str8 = hikariConfig0.getCatalog();
        java.util.Properties properties9 = hikariConfig0.dataSourceProperties;
        int int10 = hikariConfig0.minPoolSize;
        long long11 = hikariConfig0.getMaxLifetime();
        hikariConfig0.maxLifetime = 10L;
        hikariConfig0.connectionInitSql = "";
        hikariConfig0.idleTimeout = 1L;
        long long18 = hikariConfig0.getConnectionTimeout();
        com.zaxxer.hikari.HikariConfig hikariConfig20 = new com.zaxxer.hikari.HikariConfig();
        java.lang.String str21 = hikariConfig20.getConnectionInitSql();
        long long22 = hikariConfig20.getLeakDetectionThreshold();
        hikariConfig20.leakDetectionThreshold = (-1);
        long long25 = hikariConfig20.acquireRetryDelay;
        long long26 = hikariConfig20.getIdleTimeout();
        hikariConfig20.setAcquireIncrement((int) (short) 10);
        hikariConfig0.addDataSourceProperty("HikariPool-2359", (java.lang.Object) hikariConfig20);
        hikariConfig20.connectionTestQuery = "HikariPool-3383";
        hikariConfig20.isInitializationFailFast = true;
        org.junit.Assert.assertNull(dataSource1);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNotNull(properties9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 10 + "'", int10 == 10);
// flaky:         org.junit.Assert.assertTrue("'" + long11 + "' != '" + 32L + "'", long11 == 32L);
// flaky:         org.junit.Assert.assertTrue("'" + long18 + "' != '" + 32L + "'", long18 == 32L);
        org.junit.Assert.assertNull(str21);
        org.junit.Assert.assertTrue("'" + long22 + "' != '" + 0L + "'", long22 == 0L);
// flaky:         org.junit.Assert.assertTrue("'" + long25 + "' != '" + 100L + "'", long25 == 100L);
// flaky:         org.junit.Assert.assertTrue("'" + long26 + "' != '" + (-1L) + "'", long26 == (-1L));
    }

    @Test
    public void test17366() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17366");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        java.lang.String str1 = hikariConfig0.getConnectionInitSql();
        long long2 = hikariConfig0.getLeakDetectionThreshold();
        int int3 = hikariConfig0.getMaximumPoolSize();
        long long4 = hikariConfig0.getConnectionTimeout();
        long long5 = hikariConfig0.getMaxLifetime();
        int int6 = hikariConfig0.transactionIsolation;
        hikariConfig0.setPoolName("HikariPool-25");
        hikariConfig0.setPoolName("HikariPool-645");
        java.lang.String str11 = hikariConfig0.connectionInitSql;
        hikariConfig0.setAcquireRetryDelay((long) '4');
        java.lang.String str14 = hikariConfig0.getCatalog();
        hikariConfig0.setAcquireRetryDelay((long) 35);
        long long17 = hikariConfig0.getAcquireRetryDelay();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 60 + "'", int3 == 60);
// flaky:         org.junit.Assert.assertTrue("'" + long4 + "' != '" + 32L + "'", long4 == 32L);
// flaky:         org.junit.Assert.assertTrue("'" + long5 + "' != '" + 32L + "'", long5 == 32L);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 35L + "'", long17 == 35L);
    }

    @Test
    public void test17367() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17367");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        javax.sql.DataSource dataSource1 = hikariConfig0.getDataSource();
        hikariConfig0.setConnectionTestQuery("");
        hikariConfig0.connectionCustomizerClassName = "";
        hikariConfig0.setConnectionCustomizerClassName("hi!");
        java.lang.String str8 = hikariConfig0.getCatalog();
        boolean boolean9 = hikariConfig0.isRegisterMbeans;
        hikariConfig0.setAcquireRetries(0);
        long long12 = hikariConfig0.getMaxLifetime();
        hikariConfig0.setReadOnly(false);
        java.lang.String str15 = hikariConfig0.getConnectionCustomizerClassName();
        java.lang.String str16 = hikariConfig0.connectionInitSql;
        java.lang.String str17 = hikariConfig0.getDataSourceClassName();
        hikariConfig0.jdbcUrl = "HikariPool-491";
        hikariConfig0.setDataSourceClassName("HikariPool-47");
        hikariConfig0.setUseInstrumentation(true);
        hikariConfig0.isRegisterMbeans = true;
        hikariConfig0.setRegisterMbeans(false);
        hikariConfig0.acquireRetries = (byte) 10;
        hikariConfig0.isRegisterMbeans = false;
        org.junit.Assert.assertNull(dataSource1);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
// flaky:         org.junit.Assert.assertTrue("'" + long12 + "' != '" + 32L + "'", long12 == 32L);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertNull(str17);
    }

    @Test
    public void test17368() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17368");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        java.lang.String str1 = hikariConfig0.getConnectionInitSql();
        long long2 = hikariConfig0.getLeakDetectionThreshold();
        hikariConfig0.leakDetectionThreshold = (byte) 0;
        hikariConfig0.connectionCustomizerClassName = "HikariPool-25";
        java.lang.String str7 = hikariConfig0.dataSourceClassName;
        hikariConfig0.setIsolateInternalQueries(false);
        hikariConfig0.maxPoolSize = 32;
        boolean boolean12 = hikariConfig0.isReadOnly();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test17369() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17369");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        javax.sql.DataSource dataSource1 = hikariConfig0.getDataSource();
        hikariConfig0.idleTimeout = 3;
        hikariConfig0.setLeakDetectionThreshold(52L);
        int int6 = hikariConfig0.maxPoolSize;
        java.lang.String str7 = hikariConfig0.poolName;
        hikariConfig0.setInitializationFailFast(false);
        com.zaxxer.hikari.IConnectionCustomizer iConnectionCustomizer10 = hikariConfig0.connectionCustomizer;
        hikariConfig0.setUseInstrumentation(false);
        int int13 = hikariConfig0.transactionIsolation;
        org.junit.Assert.assertNull(dataSource1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 60 + "'", int6 == 60);
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "HikariPool-42653" + "'", str7, "HikariPool-42653");
        org.junit.Assert.assertNull(iConnectionCustomizer10);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
    }

    @Test
    public void test17370() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17370");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        javax.sql.DataSource dataSource1 = hikariConfig0.getDataSource();
        hikariConfig0.setConnectionTestQuery("");
        hikariConfig0.setInitializationFailFast(false);
        hikariConfig0.catalog = "";
        int int8 = hikariConfig0.getMaximumPoolSize();
        hikariConfig0.leakDetectionThreshold = (short) 10;
        hikariConfig0.isJdbc4connectionTest = true;
        hikariConfig0.isIsolateInternalQueries = false;
        boolean boolean15 = hikariConfig0.isJdbc4connectionTest;
        java.lang.String str16 = hikariConfig0.poolName;
        com.zaxxer.hikari.HikariConfig hikariConfig17 = new com.zaxxer.hikari.HikariConfig();
        javax.sql.DataSource dataSource18 = hikariConfig17.getDataSource();
        hikariConfig17.setConnectionTestQuery("");
        hikariConfig17.connectionCustomizerClassName = "";
        hikariConfig17.setConnectionCustomizerClassName("hi!");
        java.lang.String str25 = hikariConfig17.getCatalog();
        boolean boolean26 = hikariConfig17.isRegisterMbeans;
        hikariConfig17.setAcquireRetries(0);
        long long29 = hikariConfig17.getMaxLifetime();
        hikariConfig17.setReadOnly(false);
        com.zaxxer.hikari.HikariConfig hikariConfig32 = new com.zaxxer.hikari.HikariConfig();
        javax.sql.DataSource dataSource33 = hikariConfig32.getDataSource();
        hikariConfig32.setConnectionTestQuery("");
        hikariConfig32.setInitializationFailFast(false);
        hikariConfig32.catalog = "";
        com.zaxxer.hikari.HikariConfig hikariConfig40 = new com.zaxxer.hikari.HikariConfig();
        javax.sql.DataSource dataSource41 = hikariConfig40.getDataSource();
        hikariConfig40.setConnectionTestQuery("");
        hikariConfig40.connectionCustomizerClassName = "";
        hikariConfig40.setConnectionCustomizerClassName("hi!");
        java.lang.String str48 = hikariConfig40.getCatalog();
        java.util.Properties properties49 = hikariConfig40.dataSourceProperties;
        hikariConfig32.dataSourceProperties = properties49;
        hikariConfig17.setDataSourceProperties(properties49);
        com.zaxxer.hikari.IConnectionCustomizer iConnectionCustomizer52 = null;
        hikariConfig17.connectionCustomizer = iConnectionCustomizer52;
        long long54 = hikariConfig17.getIdleTimeout();
        hikariConfig17.setIdleTimeout(32L);
        hikariConfig17.connectionCustomizerClassName = "HikariPool-103";
        hikariConfig17.setTransactionIsolation("HikariPool-102");
        hikariConfig17.setAutoCommit(false);
        boolean boolean63 = hikariConfig17.isInitializationFailFast();
        java.util.Properties properties64 = hikariConfig17.getDataSourceProperties();
        com.zaxxer.hikari.HikariConfig hikariConfig65 = new com.zaxxer.hikari.HikariConfig(properties64);
        hikariConfig0.dataSourceProperties = properties64;
        int int67 = hikariConfig0.getAcquireIncrement();
        java.lang.String str68 = hikariConfig0.getDataSourceClassName();
        org.junit.Assert.assertNull(dataSource1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 60 + "'", int8 == 60);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
// flaky:         org.junit.Assert.assertEquals("'" + str16 + "' != '" + "HikariPool-42654" + "'", str16, "HikariPool-42654");
        org.junit.Assert.assertNull(dataSource18);
        org.junit.Assert.assertNull(str25);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
// flaky:         org.junit.Assert.assertTrue("'" + long29 + "' != '" + 32L + "'", long29 == 32L);
        org.junit.Assert.assertNull(dataSource33);
        org.junit.Assert.assertNull(dataSource41);
        org.junit.Assert.assertNull(str48);
        org.junit.Assert.assertNotNull(properties49);
// flaky:         org.junit.Assert.assertTrue("'" + long54 + "' != '" + (-1L) + "'", long54 == (-1L));
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + false + "'", boolean63 == false);
        org.junit.Assert.assertNotNull(properties64);
        org.junit.Assert.assertTrue("'" + int67 + "' != '" + 1 + "'", int67 == 1);
        org.junit.Assert.assertNull(str68);
    }

    @Test
    public void test17371() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17371");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        int int1 = hikariConfig0.minPoolSize;
        java.lang.String str2 = hikariConfig0.transactionIsolationName;
        java.lang.String str3 = hikariConfig0.connectionInitSql;
        hikariConfig0.dataSourceClassName = "HikariPool-541";
        int int6 = hikariConfig0.getMinimumPoolSize();
        hikariConfig0.setJdbc4ConnectionTest(true);
        hikariConfig0.setUseInstrumentation(false);
        boolean boolean11 = hikariConfig0.isIsolateInternalQueries();
        hikariConfig0.setTransactionIsolation("HikariPool-41581");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 10 + "'", int1 == 10);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test17372() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17372");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        hikariConfig0.setMaxLifetime((long) (short) 10);
        java.lang.String str3 = hikariConfig0.getPoolName();
        hikariConfig0.jdbcUrl = "";
        hikariConfig0.setMaxLifetime(0L);
        hikariConfig0.setTransactionIsolation("HikariPool-48");
        com.zaxxer.hikari.HikariConfig hikariConfig10 = new com.zaxxer.hikari.HikariConfig();
        hikariConfig10.setMaxLifetime((long) (short) 10);
        com.zaxxer.hikari.HikariConfig hikariConfig13 = new com.zaxxer.hikari.HikariConfig();
        javax.sql.DataSource dataSource14 = hikariConfig13.getDataSource();
        hikariConfig13.setConnectionTestQuery("");
        hikariConfig13.setInitializationFailFast(false);
        long long19 = hikariConfig13.getConnectionTimeout();
        java.util.Properties properties20 = hikariConfig13.dataSourceProperties;
        hikariConfig10.dataSourceProperties = properties20;
        hikariConfig0.setDataSourceProperties(properties20);
        java.lang.String str23 = hikariConfig0.getJdbcUrl();
        javax.sql.DataSource dataSource24 = null;
        hikariConfig0.dataSource = dataSource24;
        int int26 = hikariConfig0.minPoolSize;
        hikariConfig0.poolName = "HikariPool-781";
        java.lang.String str29 = hikariConfig0.getConnectionInitSql();
        hikariConfig0.maxLifetime = 60;
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "HikariPool-42660" + "'", str3, "HikariPool-42660");
        org.junit.Assert.assertNull(dataSource14);
// flaky:         org.junit.Assert.assertTrue("'" + long19 + "' != '" + 32L + "'", long19 == 32L);
        org.junit.Assert.assertNotNull(properties20);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 10 + "'", int26 == 10);
        org.junit.Assert.assertNull(str29);
    }

    @Test
    public void test17373() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17373");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        javax.sql.DataSource dataSource1 = hikariConfig0.getDataSource();
        hikariConfig0.setConnectionTestQuery("");
        hikariConfig0.connectionCustomizerClassName = "";
        hikariConfig0.setConnectionCustomizerClassName("hi!");
        java.lang.String str8 = hikariConfig0.getCatalog();
        java.util.Properties properties9 = hikariConfig0.dataSourceProperties;
        int int10 = hikariConfig0.minPoolSize;
        long long11 = hikariConfig0.connectionTimeout;
        hikariConfig0.setUseInstrumentation(false);
        hikariConfig0.setMaximumPoolSize((int) ' ');
        java.lang.String str16 = hikariConfig0.connectionInitSql;
        hikariConfig0.setDataSourceClassName("HikariPool-2654");
        boolean boolean19 = hikariConfig0.isReadOnly();
        com.zaxxer.hikari.HikariConfig hikariConfig20 = new com.zaxxer.hikari.HikariConfig();
        hikariConfig20.setMaxLifetime((long) (short) 10);
        com.zaxxer.hikari.IConnectionCustomizer iConnectionCustomizer23 = hikariConfig20.connectionCustomizer;
        hikariConfig20.setDataSourceClassName("HikariPool-47");
        hikariConfig20.setDataSourceClassName("HikariPool-18");
        boolean boolean28 = hikariConfig20.isRegisterMbeans();
        java.lang.String str29 = hikariConfig20.getDataSourceClassName();
        hikariConfig20.setIdleTimeout((long) (-1));
        hikariConfig20.setUseInstrumentation(false);
        javax.sql.DataSource dataSource34 = null;
        hikariConfig20.dataSource = dataSource34;
        com.zaxxer.hikari.HikariConfig hikariConfig36 = new com.zaxxer.hikari.HikariConfig();
        javax.sql.DataSource dataSource37 = hikariConfig36.getDataSource();
        hikariConfig36.setConnectionTestQuery("");
        java.lang.String str40 = hikariConfig36.catalog;
        java.util.Properties properties41 = hikariConfig36.dataSourceProperties;
        hikariConfig20.dataSourceProperties = properties41;
        hikariConfig0.setDataSourceProperties(properties41);
        hikariConfig0.poolName = "HikariPool-4175";
        org.junit.Assert.assertNull(dataSource1);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNotNull(properties9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 10 + "'", int10 == 10);
// flaky:         org.junit.Assert.assertTrue("'" + long11 + "' != '" + 32L + "'", long11 == 32L);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNull(iConnectionCustomizer23);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "HikariPool-18" + "'", str29, "HikariPool-18");
        org.junit.Assert.assertNull(dataSource37);
        org.junit.Assert.assertNull(str40);
        org.junit.Assert.assertNotNull(properties41);
    }

    @Test
    public void test17374() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17374");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        javax.sql.DataSource dataSource1 = hikariConfig0.getDataSource();
        hikariConfig0.setConnectionTestQuery("");
        hikariConfig0.connectionCustomizerClassName = "";
        hikariConfig0.setConnectionCustomizerClassName("hi!");
        java.lang.String str8 = hikariConfig0.getCatalog();
        boolean boolean9 = hikariConfig0.isRegisterMbeans;
        com.zaxxer.hikari.HikariConfig hikariConfig11 = new com.zaxxer.hikari.HikariConfig();
        javax.sql.DataSource dataSource12 = hikariConfig11.getDataSource();
        hikariConfig11.setConnectionTestQuery("");
        hikariConfig11.connectionCustomizerClassName = "";
        hikariConfig11.setConnectionCustomizerClassName("hi!");
        java.lang.String str19 = hikariConfig11.getCatalog();
        boolean boolean20 = hikariConfig11.isRegisterMbeans;
        hikariConfig11.setAcquireRetries(0);
        hikariConfig11.setMaximumPoolSize((int) '#');
        hikariConfig0.addDataSourceProperty("HikariPool-47", (java.lang.Object) '#');
        hikariConfig0.setConnectionTestQuery("HikariPool-47");
        java.lang.String str28 = hikariConfig0.connectionInitSql;
        int int29 = hikariConfig0.getAcquireRetries();
        org.junit.Assert.assertNull(dataSource1);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(dataSource12);
        org.junit.Assert.assertNull(str19);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNull(str28);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 3 + "'", int29 == 3);
    }

    @Test
    public void test17375() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17375");
        // The following exception was thrown during execution in test generation
        try {
            com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig("HikariPool-33309");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Property file HikariPool-33309 was not found.");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test17376() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17376");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        java.lang.String str1 = hikariConfig0.getConnectionInitSql();
        long long2 = hikariConfig0.getLeakDetectionThreshold();
        hikariConfig0.leakDetectionThreshold = (-1);
        long long5 = hikariConfig0.acquireRetryDelay;
        long long6 = hikariConfig0.getIdleTimeout();
        int int7 = hikariConfig0.maxPoolSize;
        hikariConfig0.setConnectionTestQuery("HikariPool-101");
        hikariConfig0.setPoolName("HikariPool-538");
        hikariConfig0.setIdleTimeout((long) 35);
        hikariConfig0.isJdbc4connectionTest = true;
        int int16 = hikariConfig0.transactionIsolation;
        java.lang.String str17 = hikariConfig0.getDataSourceClassName();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
// flaky:         org.junit.Assert.assertTrue("'" + long5 + "' != '" + 100L + "'", long5 == 100L);
// flaky:         org.junit.Assert.assertTrue("'" + long6 + "' != '" + (-1L) + "'", long6 == (-1L));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 60 + "'", int7 == 60);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertNull(str17);
    }

    @Test
    public void test17377() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17377");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        javax.sql.DataSource dataSource1 = hikariConfig0.getDataSource();
        hikariConfig0.setConnectionTestQuery("");
        hikariConfig0.setInitializationFailFast(false);
        hikariConfig0.catalog = "";
        javax.sql.DataSource dataSource8 = null;
        hikariConfig0.dataSource = dataSource8;
        boolean boolean10 = hikariConfig0.isRegisterMbeans();
        long long11 = hikariConfig0.acquireRetryDelay;
        hikariConfig0.setAcquireRetryDelay((long) (byte) 1);
        hikariConfig0.setLeakDetectionThreshold((long) ' ');
        com.zaxxer.hikari.IConnectionCustomizer iConnectionCustomizer16 = hikariConfig0.connectionCustomizer;
        hikariConfig0.acquireRetryDelay = 97;
        org.junit.Assert.assertNull(dataSource1);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
// flaky:         org.junit.Assert.assertTrue("'" + long11 + "' != '" + 100L + "'", long11 == 100L);
        org.junit.Assert.assertNull(iConnectionCustomizer16);
    }

    @Test
    public void test17378() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17378");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        javax.sql.DataSource dataSource1 = hikariConfig0.getDataSource();
        hikariConfig0.setConnectionTestQuery("");
        hikariConfig0.setInitializationFailFast(false);
        hikariConfig0.catalog = "";
        javax.sql.DataSource dataSource8 = null;
        hikariConfig0.dataSource = dataSource8;
        javax.sql.DataSource dataSource10 = null;
        hikariConfig0.dataSource = dataSource10;
        int int12 = hikariConfig0.maxPoolSize;
        long long13 = hikariConfig0.getIdleTimeout();
        javax.sql.DataSource dataSource14 = hikariConfig0.dataSource;
        hikariConfig0.setDataSourceClassName("HikariPool-122");
        java.lang.String str17 = hikariConfig0.getPoolName();
        java.lang.String str18 = hikariConfig0.getDataSourceClassName();
        long long19 = hikariConfig0.leakDetectionThreshold;
        hikariConfig0.setCatalog("");
        hikariConfig0.setUseInstrumentation(true);
        org.junit.Assert.assertNull(dataSource1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 60 + "'", int12 == 60);
// flaky:         org.junit.Assert.assertTrue("'" + long13 + "' != '" + (-1L) + "'", long13 == (-1L));
        org.junit.Assert.assertNull(dataSource14);
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "HikariPool-42672" + "'", str17, "HikariPool-42672");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "HikariPool-122" + "'", str18, "HikariPool-122");
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 0L + "'", long19 == 0L);
    }

    @Test
    public void test17379() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17379");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        java.lang.String str1 = hikariConfig0.getConnectionInitSql();
        long long2 = hikariConfig0.getLeakDetectionThreshold();
        int int3 = hikariConfig0.getMaximumPoolSize();
        long long4 = hikariConfig0.getIdleTimeout();
        int int5 = hikariConfig0.maxPoolSize;
        java.lang.String str6 = hikariConfig0.getConnectionCustomizerClassName();
        hikariConfig0.setConnectionCustomizerClassName("HikariPool-127");
        hikariConfig0.isIsolateInternalQueries = true;
        hikariConfig0.setMaximumPoolSize((int) '4');
        hikariConfig0.setInitializationFailFast(false);
        hikariConfig0.setConnectionTimeout(2147483647L);
        boolean boolean17 = hikariConfig0.isAutoCommit();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 60 + "'", int3 == 60);
// flaky:         org.junit.Assert.assertTrue("'" + long4 + "' != '" + (-1L) + "'", long4 == (-1L));
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 60 + "'", int5 == 60);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
    }

    @Test
    public void test17380() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17380");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        hikariConfig0.setMaxLifetime((long) (short) 10);
        com.zaxxer.hikari.HikariConfig hikariConfig3 = new com.zaxxer.hikari.HikariConfig();
        javax.sql.DataSource dataSource4 = hikariConfig3.getDataSource();
        hikariConfig3.setConnectionTestQuery("");
        hikariConfig3.setInitializationFailFast(false);
        long long9 = hikariConfig3.getConnectionTimeout();
        java.util.Properties properties10 = hikariConfig3.dataSourceProperties;
        hikariConfig0.dataSourceProperties = properties10;
        java.lang.String str12 = hikariConfig0.catalog;
        hikariConfig0.setConnectionInitSql("HikariPool-66");
        hikariConfig0.acquireRetries = 0;
        int int17 = hikariConfig0.getAcquireRetries();
        boolean boolean18 = hikariConfig0.isIsolateInternalQueries;
        java.lang.String str19 = hikariConfig0.getConnectionInitSql();
        hikariConfig0.isIsolateInternalQueries = false;
        long long22 = hikariConfig0.leakDetectionThreshold;
        hikariConfig0.minPoolSize = 0;
        hikariConfig0.connectionCustomizerClassName = "";
        java.lang.String str27 = hikariConfig0.getDataSourceClassName();
        org.junit.Assert.assertNull(dataSource4);
// flaky:         org.junit.Assert.assertTrue("'" + long9 + "' != '" + 32L + "'", long9 == 32L);
        org.junit.Assert.assertNotNull(properties10);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "HikariPool-66" + "'", str19, "HikariPool-66");
        org.junit.Assert.assertTrue("'" + long22 + "' != '" + 0L + "'", long22 == 0L);
        org.junit.Assert.assertNull(str27);
    }

    @Test
    public void test17381() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17381");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        javax.sql.DataSource dataSource1 = hikariConfig0.getDataSource();
        hikariConfig0.setConnectionTestQuery("");
        hikariConfig0.connectionCustomizerClassName = "";
        hikariConfig0.setConnectionCustomizerClassName("hi!");
        java.lang.String str8 = hikariConfig0.getCatalog();
        boolean boolean9 = hikariConfig0.isRegisterMbeans;
        hikariConfig0.setAcquireRetries(0);
        hikariConfig0.setMaximumPoolSize((int) '#');
        hikariConfig0.setTransactionIsolation("hi!");
        boolean boolean16 = hikariConfig0.isInitializationFailFast();
        long long17 = hikariConfig0.getMaxLifetime();
        javax.sql.DataSource dataSource18 = hikariConfig0.dataSource;
        hikariConfig0.setConnectionInitSql("hi!");
        boolean boolean21 = hikariConfig0.isInitializationFailFast;
        long long22 = hikariConfig0.getAcquireRetryDelay();
        hikariConfig0.setLeakDetectionThreshold((long) (short) 0);
        boolean boolean25 = hikariConfig0.isReadOnly();
        // The following exception was thrown during execution in test generation
        try {
            hikariConfig0.setDriverClassName("HikariPool-10493");
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException; message: driverClassName specified class 'HikariPool-10493' could not be loaded");
        } catch (java.lang.RuntimeException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(dataSource1);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
// flaky:         org.junit.Assert.assertTrue("'" + long17 + "' != '" + 32L + "'", long17 == 32L);
        org.junit.Assert.assertNull(dataSource18);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
// flaky:         org.junit.Assert.assertTrue("'" + long22 + "' != '" + 100L + "'", long22 == 100L);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
    }

    @Test
    public void test17382() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17382");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        javax.sql.DataSource dataSource1 = hikariConfig0.getDataSource();
        hikariConfig0.setConnectionTestQuery("");
        java.lang.String str4 = hikariConfig0.catalog;
        boolean boolean5 = hikariConfig0.isRegisterMbeans;
        hikariConfig0.setConnectionCustomizerClassName("HikariPool-435");
        java.util.Properties properties8 = hikariConfig0.getDataSourceProperties();
        hikariConfig0.catalog = "HikariPool-533";
        hikariConfig0.setMaximumPoolSize(3);
        hikariConfig0.setMinimumPoolSize(0);
        boolean boolean15 = hikariConfig0.isJdbc4ConnectionTest();
        org.junit.Assert.assertNull(dataSource1);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(properties8);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
    }

    @Test
    public void test17383() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17383");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        javax.sql.DataSource dataSource1 = hikariConfig0.getDataSource();
        hikariConfig0.setConnectionTestQuery("");
        hikariConfig0.connectionCustomizerClassName = "";
        hikariConfig0.setConnectionCustomizerClassName("hi!");
        java.lang.String str8 = hikariConfig0.getCatalog();
        boolean boolean9 = hikariConfig0.isRegisterMbeans;
        hikariConfig0.setAcquireRetries(0);
        long long12 = hikariConfig0.getMaxLifetime();
        hikariConfig0.setReadOnly(false);
        com.zaxxer.hikari.HikariConfig hikariConfig15 = new com.zaxxer.hikari.HikariConfig();
        javax.sql.DataSource dataSource16 = hikariConfig15.getDataSource();
        hikariConfig15.setConnectionTestQuery("");
        hikariConfig15.setInitializationFailFast(false);
        hikariConfig15.catalog = "";
        com.zaxxer.hikari.HikariConfig hikariConfig23 = new com.zaxxer.hikari.HikariConfig();
        javax.sql.DataSource dataSource24 = hikariConfig23.getDataSource();
        hikariConfig23.setConnectionTestQuery("");
        hikariConfig23.connectionCustomizerClassName = "";
        hikariConfig23.setConnectionCustomizerClassName("hi!");
        java.lang.String str31 = hikariConfig23.getCatalog();
        java.util.Properties properties32 = hikariConfig23.dataSourceProperties;
        hikariConfig15.dataSourceProperties = properties32;
        hikariConfig0.setDataSourceProperties(properties32);
        com.zaxxer.hikari.IConnectionCustomizer iConnectionCustomizer35 = null;
        hikariConfig0.connectionCustomizer = iConnectionCustomizer35;
        long long37 = hikariConfig0.getIdleTimeout();
        boolean boolean38 = hikariConfig0.isReadOnly;
        hikariConfig0.minPoolSize = (-1);
        int int41 = hikariConfig0.acquireIncrement;
        hikariConfig0.leakDetectionThreshold = '#';
        java.lang.String str44 = hikariConfig0.connectionInitSql;
        javax.sql.DataSource dataSource45 = null;
        hikariConfig0.dataSource = dataSource45;
        com.zaxxer.hikari.IConnectionCustomizer iConnectionCustomizer47 = hikariConfig0.connectionCustomizer;
        java.lang.String str48 = hikariConfig0.getConnectionTestQuery();
        java.lang.String str49 = hikariConfig0.poolName;
        org.junit.Assert.assertNull(dataSource1);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
// flaky:         org.junit.Assert.assertTrue("'" + long12 + "' != '" + 32L + "'", long12 == 32L);
        org.junit.Assert.assertNull(dataSource16);
        org.junit.Assert.assertNull(dataSource24);
        org.junit.Assert.assertNull(str31);
        org.junit.Assert.assertNotNull(properties32);
// flaky:         org.junit.Assert.assertTrue("'" + long37 + "' != '" + (-1L) + "'", long37 == (-1L));
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 1 + "'", int41 == 1);
        org.junit.Assert.assertNull(str44);
        org.junit.Assert.assertNull(iConnectionCustomizer47);
        org.junit.Assert.assertEquals("'" + str48 + "' != '" + "" + "'", str48, "");
// flaky:         org.junit.Assert.assertEquals("'" + str49 + "' != '" + "HikariPool-42678" + "'", str49, "HikariPool-42678");
    }

    @Test
    public void test17384() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17384");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        java.lang.String str1 = hikariConfig0.getConnectionInitSql();
        long long2 = hikariConfig0.getLeakDetectionThreshold();
        int int3 = hikariConfig0.getMaximumPoolSize();
        long long4 = hikariConfig0.leakDetectionThreshold;
        hikariConfig0.setInitializationFailFast(true);
        com.zaxxer.hikari.HikariConfig hikariConfig8 = new com.zaxxer.hikari.HikariConfig();
        javax.sql.DataSource dataSource9 = hikariConfig8.getDataSource();
        hikariConfig8.setConnectionTestQuery("");
        hikariConfig8.connectionCustomizerClassName = "";
        long long14 = hikariConfig8.getAcquireRetryDelay();
        hikariConfig8.setDataSourceClassName("HikariPool-66");
        hikariConfig8.setInitializationFailFast(false);
        hikariConfig0.addDataSourceProperty("HikariPool-62", (java.lang.Object) hikariConfig8);
        hikariConfig8.minPoolSize = (byte) 100;
        hikariConfig8.setTransactionIsolation("HikariPool-2686");
        hikariConfig8.setConnectionTestQuery("HikariPool-4615");
        java.lang.String str26 = hikariConfig8.getDataSourceClassName();
        hikariConfig8.dataSourceClassName = "HikariPool-18886";
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 60 + "'", int3 == 60);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertNull(dataSource9);
// flaky:         org.junit.Assert.assertTrue("'" + long14 + "' != '" + 100L + "'", long14 == 100L);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "HikariPool-66" + "'", str26, "HikariPool-66");
    }

    @Test
    public void test17385() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17385");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        java.lang.String str1 = hikariConfig0.getConnectionInitSql();
        long long2 = hikariConfig0.getLeakDetectionThreshold();
        hikariConfig0.leakDetectionThreshold = (-1);
        int int5 = hikariConfig0.acquireIncrement;
        hikariConfig0.setPoolName("HikariPool-62");
        hikariConfig0.acquireRetryDelay = 0L;
        long long10 = hikariConfig0.acquireRetryDelay;
        java.lang.String str11 = hikariConfig0.catalog;
        hikariConfig0.setRegisterMbeans(true);
        boolean boolean14 = hikariConfig0.isInitializationFailFast;
        java.lang.String str15 = hikariConfig0.poolName;
        java.lang.String str16 = hikariConfig0.jdbcUrl;
        int int17 = hikariConfig0.getTransactionIsolation();
        hikariConfig0.isIsolateInternalQueries = false;
        hikariConfig0.setDataSourceClassName("HikariPool-15599");
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "HikariPool-62" + "'", str15, "HikariPool-62");
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
    }

    @Test
    public void test17386() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17386");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        javax.sql.DataSource dataSource1 = hikariConfig0.getDataSource();
        hikariConfig0.setConnectionTestQuery("");
        hikariConfig0.connectionCustomizerClassName = "";
        long long6 = hikariConfig0.getAcquireRetryDelay();
        hikariConfig0.setDataSourceClassName("HikariPool-66");
        boolean boolean9 = hikariConfig0.isIsolateInternalQueries();
        boolean boolean10 = hikariConfig0.isAutoCommit;
        com.zaxxer.hikari.IConnectionCustomizer iConnectionCustomizer11 = hikariConfig0.connectionCustomizer;
        int int12 = hikariConfig0.getTransactionIsolation();
        hikariConfig0.setCatalog("HikariPool-62");
        javax.sql.DataSource dataSource15 = null;
        hikariConfig0.dataSource = dataSource15;
        hikariConfig0.setConnectionTestQuery("HikariPool-25476");
        long long19 = hikariConfig0.getLeakDetectionThreshold();
        org.junit.Assert.assertNull(dataSource1);
// flaky:         org.junit.Assert.assertTrue("'" + long6 + "' != '" + 100L + "'", long6 == 100L);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNull(iConnectionCustomizer11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 0L + "'", long19 == 0L);
    }

    @Test
    public void test17387() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17387");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        java.lang.String str1 = hikariConfig0.getConnectionInitSql();
        long long2 = hikariConfig0.getLeakDetectionThreshold();
        hikariConfig0.leakDetectionThreshold = (-1);
        long long5 = hikariConfig0.acquireRetryDelay;
        hikariConfig0.setLeakDetectionThreshold((long) (byte) -1);
        hikariConfig0.setIdleTimeout(100L);
        hikariConfig0.setJdbc4ConnectionTest(true);
        hikariConfig0.acquireRetries = (-1);
        javax.sql.DataSource dataSource14 = hikariConfig0.dataSource;
        int int15 = hikariConfig0.transactionIsolation;
        // The following exception was thrown during execution in test generation
        try {
            hikariConfig0.validate();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: one of either dataSource or dataSourceClassName must be specified");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
// flaky:         org.junit.Assert.assertTrue("'" + long5 + "' != '" + 100L + "'", long5 == 100L);
        org.junit.Assert.assertNull(dataSource14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
    }

    @Test
    public void test17388() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17388");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        java.lang.String str1 = hikariConfig0.getConnectionInitSql();
        long long2 = hikariConfig0.getLeakDetectionThreshold();
        hikariConfig0.leakDetectionThreshold = (-1);
        long long5 = hikariConfig0.acquireRetryDelay;
        hikariConfig0.setLeakDetectionThreshold((long) (byte) -1);
        java.util.Properties properties8 = hikariConfig0.getDataSourceProperties();
        boolean boolean9 = hikariConfig0.isReadOnly();
        hikariConfig0.jdbcUrl = "HikariPool-29";
        java.lang.String str12 = hikariConfig0.getConnectionTestQuery();
        java.lang.String str13 = hikariConfig0.getConnectionInitSql();
        int int14 = hikariConfig0.getTransactionIsolation();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
// flaky:         org.junit.Assert.assertTrue("'" + long5 + "' != '" + 100L + "'", long5 == 100L);
        org.junit.Assert.assertNotNull(properties8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
    }

    @Test
    public void test17389() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17389");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        javax.sql.DataSource dataSource1 = hikariConfig0.getDataSource();
        hikariConfig0.setConnectionTestQuery("");
        hikariConfig0.connectionCustomizerClassName = "";
        com.zaxxer.hikari.IConnectionCustomizer iConnectionCustomizer6 = hikariConfig0.connectionCustomizer;
        java.lang.String str7 = hikariConfig0.jdbcUrl;
        boolean boolean8 = hikariConfig0.isReadOnly;
        java.lang.String str9 = hikariConfig0.dataSourceClassName;
        hikariConfig0.setJdbcUrl("HikariPool-435");
        hikariConfig0.maxPoolSize = (-1);
        java.lang.String str14 = hikariConfig0.getCatalog();
        hikariConfig0.jdbcUrl = "HikariPool-2112";
        hikariConfig0.connectionCustomizerClassName = "HikariPool-32349";
        org.junit.Assert.assertNull(dataSource1);
        org.junit.Assert.assertNull(iConnectionCustomizer6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str14);
    }

    @Test
    public void test17390() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17390");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        javax.sql.DataSource dataSource1 = hikariConfig0.getDataSource();
        hikariConfig0.setConnectionTestQuery("");
        java.lang.String str4 = hikariConfig0.catalog;
        java.util.Properties properties5 = hikariConfig0.dataSourceProperties;
        long long6 = hikariConfig0.connectionTimeout;
        hikariConfig0.setUseInstrumentation(false);
        int int9 = hikariConfig0.maxPoolSize;
        hikariConfig0.dataSourceClassName = "HikariPool-173";
        hikariConfig0.setInitializationFailFast(true);
        java.lang.String str14 = hikariConfig0.jdbcUrl;
        org.junit.Assert.assertNull(dataSource1);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNotNull(properties5);
// flaky:         org.junit.Assert.assertTrue("'" + long6 + "' != '" + 32L + "'", long6 == 32L);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 60 + "'", int9 == 60);
        org.junit.Assert.assertNull(str14);
    }

    @Test
    public void test17391() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17391");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        javax.sql.DataSource dataSource1 = hikariConfig0.getDataSource();
        hikariConfig0.setConnectionTestQuery("");
        hikariConfig0.connectionCustomizerClassName = "";
        hikariConfig0.setConnectionCustomizerClassName("hi!");
        java.lang.String str8 = hikariConfig0.getCatalog();
        boolean boolean9 = hikariConfig0.isRegisterMbeans;
        hikariConfig0.setAcquireRetries(0);
        hikariConfig0.setMaximumPoolSize((int) '#');
        hikariConfig0.setTransactionIsolation("hi!");
        hikariConfig0.setConnectionInitSql("hi!");
        java.lang.String str18 = hikariConfig0.getDataSourceClassName();
        javax.sql.DataSource dataSource19 = hikariConfig0.getDataSource();
        hikariConfig0.setUseInstrumentation(true);
        org.junit.Assert.assertNull(dataSource1);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertNull(dataSource19);
    }

    @Test
    public void test17392() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17392");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        javax.sql.DataSource dataSource1 = hikariConfig0.getDataSource();
        hikariConfig0.setConnectionTestQuery("");
        hikariConfig0.connectionCustomizerClassName = "";
        hikariConfig0.setConnectionCustomizerClassName("hi!");
        java.lang.String str8 = hikariConfig0.getCatalog();
        java.util.Properties properties9 = hikariConfig0.dataSourceProperties;
        int int10 = hikariConfig0.minPoolSize;
        long long11 = hikariConfig0.connectionTimeout;
        hikariConfig0.setMaximumPoolSize((int) (short) 100);
        hikariConfig0.setInitializationFailFast(true);
        hikariConfig0.maxPoolSize = 1;
        com.zaxxer.hikari.HikariConfig hikariConfig18 = new com.zaxxer.hikari.HikariConfig();
        int int19 = hikariConfig18.minPoolSize;
        java.lang.String str20 = hikariConfig18.transactionIsolationName;
        java.lang.String str21 = hikariConfig18.connectionInitSql;
        hikariConfig18.dataSourceClassName = "HikariPool-541";
        int int24 = hikariConfig18.getMinimumPoolSize();
        int int25 = hikariConfig18.getMaximumPoolSize();
        java.util.Properties properties26 = hikariConfig18.dataSourceProperties;
        hikariConfig0.setDataSourceProperties(properties26);
        org.junit.Assert.assertNull(dataSource1);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNotNull(properties9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 10 + "'", int10 == 10);
// flaky:         org.junit.Assert.assertTrue("'" + long11 + "' != '" + 32L + "'", long11 == 32L);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 10 + "'", int19 == 10);
        org.junit.Assert.assertNull(str20);
        org.junit.Assert.assertNull(str21);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 10 + "'", int24 == 10);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 60 + "'", int25 == 60);
        org.junit.Assert.assertNotNull(properties26);
    }

    @Test
    public void test17393() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17393");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        javax.sql.DataSource dataSource1 = hikariConfig0.getDataSource();
        hikariConfig0.setConnectionTestQuery("");
        hikariConfig0.setInitializationFailFast(false);
        hikariConfig0.catalog = "";
        javax.sql.DataSource dataSource8 = hikariConfig0.getDataSource();
        hikariConfig0.acquireRetries = (short) 10;
        int int11 = hikariConfig0.getAcquireIncrement();
        int int12 = hikariConfig0.minPoolSize;
        hikariConfig0.connectionCustomizerClassName = "HikariPool-3";
        com.zaxxer.hikari.HikariConfig hikariConfig15 = new com.zaxxer.hikari.HikariConfig();
        javax.sql.DataSource dataSource16 = hikariConfig15.getDataSource();
        hikariConfig15.idleTimeout = 3;
        int int19 = hikariConfig15.getAcquireRetries();
        hikariConfig15.setDataSourceClassName("HikariPool-174");
        int int22 = hikariConfig15.maxPoolSize;
        hikariConfig15.maxPoolSize = 60;
        java.util.Properties properties25 = hikariConfig15.dataSourceProperties;
        javax.sql.DataSource dataSource26 = hikariConfig15.getDataSource();
        java.util.Properties properties27 = hikariConfig15.getDataSourceProperties();
        hikariConfig0.setDataSourceProperties(properties27);
        java.lang.String str29 = hikariConfig0.poolName;
        java.util.Properties properties30 = hikariConfig0.dataSourceProperties;
        org.junit.Assert.assertNull(dataSource1);
        org.junit.Assert.assertNull(dataSource8);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 10 + "'", int12 == 10);
        org.junit.Assert.assertNull(dataSource16);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 3 + "'", int19 == 3);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 60 + "'", int22 == 60);
        org.junit.Assert.assertNotNull(properties25);
        org.junit.Assert.assertNull(dataSource26);
        org.junit.Assert.assertNotNull(properties27);
// flaky:         org.junit.Assert.assertEquals("'" + str29 + "' != '" + "HikariPool-42692" + "'", str29, "HikariPool-42692");
        org.junit.Assert.assertNotNull(properties30);
    }

    @Test
    public void test17394() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17394");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        javax.sql.DataSource dataSource1 = hikariConfig0.getDataSource();
        hikariConfig0.setConnectionTestQuery("");
        hikariConfig0.setInitializationFailFast(false);
        hikariConfig0.catalog = "";
        com.zaxxer.hikari.HikariConfig hikariConfig8 = new com.zaxxer.hikari.HikariConfig();
        javax.sql.DataSource dataSource9 = hikariConfig8.getDataSource();
        hikariConfig8.setConnectionTestQuery("");
        hikariConfig8.connectionCustomizerClassName = "";
        hikariConfig8.setConnectionCustomizerClassName("hi!");
        java.lang.String str16 = hikariConfig8.getCatalog();
        java.util.Properties properties17 = hikariConfig8.dataSourceProperties;
        hikariConfig0.dataSourceProperties = properties17;
        hikariConfig0.connectionCustomizerClassName = "hi!";
        hikariConfig0.setTransactionIsolation("HikariPool-101");
        hikariConfig0.acquireRetries = 0;
        int int25 = hikariConfig0.getAcquireRetries();
        java.lang.String str26 = hikariConfig0.getConnectionInitSql();
        com.zaxxer.hikari.HikariConfig hikariConfig27 = new com.zaxxer.hikari.HikariConfig();
        javax.sql.DataSource dataSource28 = hikariConfig27.getDataSource();
        hikariConfig27.setConnectionTestQuery("");
        hikariConfig27.connectionCustomizerClassName = "";
        hikariConfig27.setConnectionCustomizerClassName("hi!");
        java.lang.String str35 = hikariConfig27.getCatalog();
        com.zaxxer.hikari.IConnectionCustomizer iConnectionCustomizer36 = null;
        hikariConfig27.connectionCustomizer = iConnectionCustomizer36;
        hikariConfig27.jdbcUrl = "HikariPool-16";
        hikariConfig27.connectionInitSql = "HikariPool-38";
        java.lang.String str42 = hikariConfig27.getJdbcUrl();
        com.zaxxer.hikari.HikariConfig hikariConfig43 = new com.zaxxer.hikari.HikariConfig();
        java.lang.String str44 = hikariConfig43.getConnectionInitSql();
        long long45 = hikariConfig43.getLeakDetectionThreshold();
        int int46 = hikariConfig43.getMaximumPoolSize();
        long long47 = hikariConfig43.getIdleTimeout();
        int int48 = hikariConfig43.maxPoolSize;
        java.lang.String str49 = hikariConfig43.getConnectionCustomizerClassName();
        hikariConfig43.setConnectionCustomizerClassName("HikariPool-127");
        int int52 = hikariConfig43.getAcquireIncrement();
        int int53 = hikariConfig43.maxPoolSize;
        long long54 = hikariConfig43.connectionTimeout;
        int int55 = hikariConfig43.getMaximumPoolSize();
        com.zaxxer.hikari.HikariConfig hikariConfig56 = new com.zaxxer.hikari.HikariConfig();
        java.lang.String str57 = hikariConfig56.getConnectionInitSql();
        long long58 = hikariConfig56.getLeakDetectionThreshold();
        int int59 = hikariConfig56.getMaximumPoolSize();
        long long60 = hikariConfig56.leakDetectionThreshold;
        hikariConfig56.setInitializationFailFast(true);
        com.zaxxer.hikari.HikariConfig hikariConfig64 = new com.zaxxer.hikari.HikariConfig();
        javax.sql.DataSource dataSource65 = hikariConfig64.getDataSource();
        hikariConfig64.setConnectionTestQuery("");
        hikariConfig64.connectionCustomizerClassName = "";
        long long70 = hikariConfig64.getAcquireRetryDelay();
        hikariConfig64.setDataSourceClassName("HikariPool-66");
        hikariConfig64.setInitializationFailFast(false);
        hikariConfig56.addDataSourceProperty("HikariPool-62", (java.lang.Object) hikariConfig64);
        java.util.Properties properties76 = hikariConfig64.dataSourceProperties;
        java.util.Properties properties77 = hikariConfig64.getDataSourceProperties();
        hikariConfig43.setDataSourceProperties(properties77);
        hikariConfig27.setDataSourceProperties(properties77);
        hikariConfig0.setDataSourceProperties(properties77);
        com.zaxxer.hikari.HikariConfig hikariConfig81 = new com.zaxxer.hikari.HikariConfig(properties77);
        org.junit.Assert.assertNull(dataSource1);
        org.junit.Assert.assertNull(dataSource9);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertNotNull(properties17);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertNull(str26);
        org.junit.Assert.assertNull(dataSource28);
        org.junit.Assert.assertNull(str35);
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "HikariPool-16" + "'", str42, "HikariPool-16");
        org.junit.Assert.assertNull(str44);
        org.junit.Assert.assertTrue("'" + long45 + "' != '" + 0L + "'", long45 == 0L);
        org.junit.Assert.assertTrue("'" + int46 + "' != '" + 60 + "'", int46 == 60);
// flaky:         org.junit.Assert.assertTrue("'" + long47 + "' != '" + (-1L) + "'", long47 == (-1L));
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + 60 + "'", int48 == 60);
        org.junit.Assert.assertNull(str49);
        org.junit.Assert.assertTrue("'" + int52 + "' != '" + 1 + "'", int52 == 1);
        org.junit.Assert.assertTrue("'" + int53 + "' != '" + 60 + "'", int53 == 60);
// flaky:         org.junit.Assert.assertTrue("'" + long54 + "' != '" + 32L + "'", long54 == 32L);
        org.junit.Assert.assertTrue("'" + int55 + "' != '" + 60 + "'", int55 == 60);
        org.junit.Assert.assertNull(str57);
        org.junit.Assert.assertTrue("'" + long58 + "' != '" + 0L + "'", long58 == 0L);
        org.junit.Assert.assertTrue("'" + int59 + "' != '" + 60 + "'", int59 == 60);
        org.junit.Assert.assertTrue("'" + long60 + "' != '" + 0L + "'", long60 == 0L);
        org.junit.Assert.assertNull(dataSource65);
// flaky:         org.junit.Assert.assertTrue("'" + long70 + "' != '" + 100L + "'", long70 == 100L);
        org.junit.Assert.assertNotNull(properties76);
        org.junit.Assert.assertNotNull(properties77);
    }

    @Test
    public void test17395() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17395");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        java.lang.String str1 = hikariConfig0.getConnectionInitSql();
        long long2 = hikariConfig0.getLeakDetectionThreshold();
        hikariConfig0.leakDetectionThreshold = (-1);
        long long5 = hikariConfig0.acquireRetryDelay;
        hikariConfig0.setLeakDetectionThreshold((long) (byte) -1);
        hikariConfig0.setIdleTimeout(100L);
        long long10 = hikariConfig0.idleTimeout;
        hikariConfig0.idleTimeout = 0L;
        hikariConfig0.isIsolateInternalQueries = true;
        hikariConfig0.setMinimumPoolSize((int) (byte) 100);
        com.zaxxer.hikari.IConnectionCustomizer iConnectionCustomizer17 = hikariConfig0.connectionCustomizer;
        hikariConfig0.connectionTestQuery = "HikariPool-283";
        boolean boolean20 = hikariConfig0.isAutoCommit;
        java.lang.String str21 = hikariConfig0.getJdbcUrl();
        com.zaxxer.hikari.HikariConfig hikariConfig22 = new com.zaxxer.hikari.HikariConfig();
        javax.sql.DataSource dataSource23 = hikariConfig22.getDataSource();
        hikariConfig22.setConnectionTestQuery("");
        hikariConfig22.connectionCustomizerClassName = "";
        com.zaxxer.hikari.IConnectionCustomizer iConnectionCustomizer28 = hikariConfig22.connectionCustomizer;
        java.lang.String str29 = hikariConfig22.dataSourceClassName;
        java.util.Properties properties30 = hikariConfig22.getDataSourceProperties();
        com.zaxxer.hikari.HikariConfig hikariConfig31 = new com.zaxxer.hikari.HikariConfig(properties30);
        hikariConfig0.setDataSourceProperties(properties30);
        hikariConfig0.acquireIncrement = (short) -1;
        hikariConfig0.setConnectionTestQuery("HikariPool-1141");
        hikariConfig0.setLeakDetectionThreshold((long) '#');
        hikariConfig0.leakDetectionThreshold = 3L;
        hikariConfig0.acquireRetryDelay = (byte) 100;
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
// flaky:         org.junit.Assert.assertTrue("'" + long5 + "' != '" + 100L + "'", long5 == 100L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 100L + "'", long10 == 100L);
        org.junit.Assert.assertNull(iConnectionCustomizer17);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertNull(str21);
        org.junit.Assert.assertNull(dataSource23);
        org.junit.Assert.assertNull(iConnectionCustomizer28);
        org.junit.Assert.assertNull(str29);
        org.junit.Assert.assertNotNull(properties30);
    }

    @Test
    public void test17396() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17396");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        java.lang.String str1 = hikariConfig0.getConnectionInitSql();
        long long2 = hikariConfig0.getLeakDetectionThreshold();
        int int3 = hikariConfig0.getMaximumPoolSize();
        long long4 = hikariConfig0.leakDetectionThreshold;
        java.lang.String str5 = hikariConfig0.catalog;
        boolean boolean6 = hikariConfig0.isIsolateInternalQueries();
        hikariConfig0.setPoolName("HikariPool-954");
        hikariConfig0.setJdbcUrl("HikariPool-688");
        java.lang.String str11 = hikariConfig0.getConnectionInitSql();
        hikariConfig0.setPoolName("HikariPool-328");
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 60 + "'", int3 == 60);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(str11);
    }

    @Test
    public void test17397() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17397");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        javax.sql.DataSource dataSource1 = hikariConfig0.getDataSource();
        hikariConfig0.setConnectionTestQuery("");
        hikariConfig0.setInitializationFailFast(false);
        hikariConfig0.catalog = "";
        int int8 = hikariConfig0.getMaximumPoolSize();
        hikariConfig0.poolName = "HikariPool-73";
        javax.sql.DataSource dataSource11 = null;
        hikariConfig0.dataSource = dataSource11;
        hikariConfig0.setAutoCommit(true);
        hikariConfig0.isReadOnly = true;
        hikariConfig0.acquireRetries = '#';
        java.lang.String str19 = hikariConfig0.dataSourceClassName;
        hikariConfig0.minPoolSize = (short) 10;
        org.junit.Assert.assertNull(dataSource1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 60 + "'", int8 == 60);
        org.junit.Assert.assertNull(str19);
    }

    @Test
    public void test17398() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17398");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        javax.sql.DataSource dataSource1 = hikariConfig0.getDataSource();
        hikariConfig0.setConnectionTestQuery("");
        hikariConfig0.connectionCustomizerClassName = "";
        hikariConfig0.setConnectionCustomizerClassName("hi!");
        java.lang.String str8 = hikariConfig0.getCatalog();
        boolean boolean9 = hikariConfig0.isRegisterMbeans;
        hikariConfig0.setAcquireRetries(0);
        long long12 = hikariConfig0.maxLifetime;
        java.lang.String str13 = hikariConfig0.transactionIsolationName;
        hikariConfig0.setIdleTimeout(0L);
        hikariConfig0.connectionTimeout = '4';
        boolean boolean18 = hikariConfig0.isAutoCommit();
        boolean boolean19 = hikariConfig0.isJdbc4ConnectionTest();
        hikariConfig0.setTransactionIsolation("HikariPool-2395");
        hikariConfig0.maxLifetime = 2147483647L;
        java.lang.String str24 = hikariConfig0.jdbcUrl;
        org.junit.Assert.assertNull(dataSource1);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
// flaky:         org.junit.Assert.assertTrue("'" + long12 + "' != '" + 32L + "'", long12 == 32L);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertNull(str24);
    }

    @Test
    public void test17399() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17399");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        java.lang.String str1 = hikariConfig0.getConnectionInitSql();
        long long2 = hikariConfig0.getLeakDetectionThreshold();
        int int3 = hikariConfig0.getMaximumPoolSize();
        hikariConfig0.setLeakDetectionThreshold(10L);
        java.lang.String str6 = hikariConfig0.connectionTestQuery;
        hikariConfig0.transactionIsolationName = "";
        boolean boolean9 = hikariConfig0.isAutoCommit();
        java.lang.String str10 = hikariConfig0.dataSourceClassName;
        hikariConfig0.setAutoCommit(true);
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 60 + "'", int3 == 60);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNull(str10);
    }

    @Test
    public void test17400() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17400");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        javax.sql.DataSource dataSource1 = hikariConfig0.getDataSource();
        hikariConfig0.setConnectionTestQuery("");
        hikariConfig0.connectionCustomizerClassName = "";
        hikariConfig0.setConnectionCustomizerClassName("hi!");
        java.lang.String str8 = hikariConfig0.getCatalog();
        com.zaxxer.hikari.IConnectionCustomizer iConnectionCustomizer9 = null;
        hikariConfig0.connectionCustomizer = iConnectionCustomizer9;
        hikariConfig0.setJdbcUrl("HikariPool-38");
        hikariConfig0.setConnectionCustomizerClassName("HikariPool-216");
        hikariConfig0.setIsolateInternalQueries(false);
        javax.sql.DataSource dataSource17 = null;
        hikariConfig0.setDataSource(dataSource17);
        int int19 = hikariConfig0.acquireIncrement;
        hikariConfig0.jdbcUrl = "HikariPool-2740";
        hikariConfig0.connectionCustomizerClassName = "HikariPool-41831";
        org.junit.Assert.assertNull(dataSource1);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 1 + "'", int19 == 1);
    }

    @Test
    public void test17401() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17401");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        java.lang.String str1 = hikariConfig0.getConnectionInitSql();
        long long2 = hikariConfig0.getLeakDetectionThreshold();
        hikariConfig0.leakDetectionThreshold = (-1);
        long long5 = hikariConfig0.acquireRetryDelay;
        long long6 = hikariConfig0.getIdleTimeout();
        long long7 = hikariConfig0.leakDetectionThreshold;
        java.lang.String str8 = hikariConfig0.getCatalog();
        int int9 = hikariConfig0.getAcquireRetries();
        long long10 = hikariConfig0.getLeakDetectionThreshold();
        hikariConfig0.isIsolateInternalQueries = true;
        boolean boolean13 = hikariConfig0.isJdbc4ConnectionTest();
        hikariConfig0.setReadOnly(false);
        hikariConfig0.dataSourceClassName = "HikariPool-4081";
        hikariConfig0.isJdbc4connectionTest = false;
        int int20 = hikariConfig0.getTransactionIsolation();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
// flaky:         org.junit.Assert.assertTrue("'" + long5 + "' != '" + 100L + "'", long5 == 100L);
// flaky:         org.junit.Assert.assertTrue("'" + long6 + "' != '" + (-1L) + "'", long6 == (-1L));
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + (-1L) + "'", long7 == (-1L));
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 3 + "'", int9 == 3);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + (-1L) + "'", long10 == (-1L));
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
    }

    @Test
    public void test17402() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17402");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        javax.sql.DataSource dataSource1 = hikariConfig0.getDataSource();
        hikariConfig0.setConnectionTestQuery("");
        hikariConfig0.setInitializationFailFast(false);
        hikariConfig0.catalog = "";
        int int8 = hikariConfig0.getMaximumPoolSize();
        hikariConfig0.isRegisterMbeans = false;
        java.lang.String str11 = hikariConfig0.jdbcUrl;
        hikariConfig0.acquireRetryDelay = 'a';
        hikariConfig0.setUseInstrumentation(false);
        hikariConfig0.setIdleTimeout(1L);
        com.zaxxer.hikari.IConnectionCustomizer iConnectionCustomizer18 = hikariConfig0.connectionCustomizer;
        org.junit.Assert.assertNull(dataSource1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 60 + "'", int8 == 60);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNull(iConnectionCustomizer18);
    }

    @Test
    public void test17403() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17403");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        javax.sql.DataSource dataSource1 = hikariConfig0.getDataSource();
        hikariConfig0.setConnectionTestQuery("");
        hikariConfig0.connectionCustomizerClassName = "";
        hikariConfig0.setConnectionCustomizerClassName("hi!");
        java.lang.String str8 = hikariConfig0.getCatalog();
        boolean boolean9 = hikariConfig0.isRegisterMbeans;
        hikariConfig0.setAcquireRetries(0);
        long long12 = hikariConfig0.getMaxLifetime();
        int int13 = hikariConfig0.acquireRetries;
        hikariConfig0.dataSourceClassName = "HikariPool-428";
        hikariConfig0.idleTimeout = (short) 1;
        java.lang.String str18 = hikariConfig0.catalog;
        java.lang.String str19 = hikariConfig0.catalog;
        long long20 = hikariConfig0.getConnectionTimeout();
        long long21 = hikariConfig0.idleTimeout;
        long long22 = hikariConfig0.acquireRetryDelay;
        org.junit.Assert.assertNull(dataSource1);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
// flaky:         org.junit.Assert.assertTrue("'" + long12 + "' != '" + 32L + "'", long12 == 32L);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertNull(str19);
// flaky:         org.junit.Assert.assertTrue("'" + long20 + "' != '" + 32L + "'", long20 == 32L);
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + 1L + "'", long21 == 1L);
// flaky:         org.junit.Assert.assertTrue("'" + long22 + "' != '" + 100L + "'", long22 == 100L);
    }

    @Test
    public void test17404() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17404");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        javax.sql.DataSource dataSource1 = hikariConfig0.getDataSource();
        hikariConfig0.setConnectionTestQuery("");
        hikariConfig0.setInitializationFailFast(false);
        hikariConfig0.catalog = "";
        int int8 = hikariConfig0.getMaximumPoolSize();
        hikariConfig0.leakDetectionThreshold = (short) 10;
        hikariConfig0.isJdbc4connectionTest = true;
        boolean boolean13 = hikariConfig0.isReadOnly();
        hikariConfig0.transactionIsolation = '#';
        com.zaxxer.hikari.HikariConfig hikariConfig17 = new com.zaxxer.hikari.HikariConfig();
        javax.sql.DataSource dataSource18 = hikariConfig17.getDataSource();
        hikariConfig17.setConnectionTestQuery("");
        hikariConfig17.setInitializationFailFast(false);
        hikariConfig17.catalog = "";
        javax.sql.DataSource dataSource25 = null;
        hikariConfig17.dataSource = dataSource25;
        javax.sql.DataSource dataSource27 = null;
        hikariConfig17.dataSource = dataSource27;
        hikariConfig0.addDataSourceProperty("HikariPool-361", (java.lang.Object) hikariConfig17);
        hikariConfig0.setConnectionInitSql("HikariPool-1001");
        hikariConfig0.dataSourceClassName = "HikariPool-718";
        hikariConfig0.connectionTestQuery = "HikariPool-12001";
        org.junit.Assert.assertNull(dataSource1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 60 + "'", int8 == 60);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNull(dataSource18);
    }

    @Test
    public void test17405() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17405");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        hikariConfig0.setMaxLifetime((long) (short) 10);
        int int3 = hikariConfig0.getAcquireRetries();
        hikariConfig0.setInitializationFailFast(true);
        long long6 = hikariConfig0.getLeakDetectionThreshold();
        java.lang.String str7 = hikariConfig0.transactionIsolationName;
        hikariConfig0.setAutoCommit(false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 3 + "'", int3 == 3);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertNull(str7);
    }

    @Test
    public void test17406() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17406");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        javax.sql.DataSource dataSource1 = hikariConfig0.getDataSource();
        hikariConfig0.setConnectionTestQuery("");
        hikariConfig0.setInitializationFailFast(false);
        long long6 = hikariConfig0.getConnectionTimeout();
        java.util.Properties properties7 = hikariConfig0.dataSourceProperties;
        boolean boolean8 = hikariConfig0.isInitializationFailFast();
        hikariConfig0.setJdbc4ConnectionTest(false);
        hikariConfig0.setCatalog("");
        hikariConfig0.idleTimeout = 100;
        boolean boolean15 = hikariConfig0.isReadOnly;
        hikariConfig0.isAutoCommit = true;
        hikariConfig0.isAutoCommit = false;
        hikariConfig0.setAcquireRetryDelay(60L);
        hikariConfig0.dataSourceClassName = "HikariPool-12093";
        hikariConfig0.setConnectionInitSql("HikariPool-72");
        org.junit.Assert.assertNull(dataSource1);
// flaky:         org.junit.Assert.assertTrue("'" + long6 + "' != '" + 32L + "'", long6 == 32L);
        org.junit.Assert.assertNotNull(properties7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test17407() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17407");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        java.lang.String str1 = hikariConfig0.getConnectionInitSql();
        hikariConfig0.setMaxLifetime(35L);
        hikariConfig0.setAutoCommit(false);
        int int6 = hikariConfig0.getTransactionIsolation();
        long long7 = hikariConfig0.connectionTimeout;
        boolean boolean8 = hikariConfig0.isRegisterMbeans;
        hikariConfig0.setUseInstrumentation(false);
        hikariConfig0.setAutoCommit(false);
        java.lang.String str13 = hikariConfig0.getConnectionTestQuery();
        hikariConfig0.setIsolateInternalQueries(false);
        boolean boolean16 = hikariConfig0.isReadOnly;
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
// flaky:         org.junit.Assert.assertTrue("'" + long7 + "' != '" + 32L + "'", long7 == 32L);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test17408() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17408");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        java.lang.String str1 = hikariConfig0.getConnectionInitSql();
        long long2 = hikariConfig0.getLeakDetectionThreshold();
        hikariConfig0.leakDetectionThreshold = (-1);
        int int5 = hikariConfig0.acquireIncrement;
        hikariConfig0.setPoolName("HikariPool-62");
        hikariConfig0.acquireRetryDelay = 0L;
        java.lang.String str10 = hikariConfig0.getCatalog();
        javax.sql.DataSource dataSource11 = hikariConfig0.getDataSource();
        int int12 = hikariConfig0.getMinimumPoolSize();
        hikariConfig0.setAcquireRetryDelay(35L);
        int int15 = hikariConfig0.maxPoolSize;
        hikariConfig0.leakDetectionThreshold = 97L;
        hikariConfig0.jdbcUrl = "HikariPool-307";
        hikariConfig0.setDataSourceClassName("HikariPool-360");
        java.lang.String str22 = hikariConfig0.getCatalog();
        java.lang.String str23 = hikariConfig0.getJdbcUrl();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(dataSource11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 10 + "'", int12 == 10);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 60 + "'", int15 == 60);
        org.junit.Assert.assertNull(str22);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "HikariPool-307" + "'", str23, "HikariPool-307");
    }

    @Test
    public void test17409() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17409");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        hikariConfig0.setMaxLifetime((long) (short) 10);
        com.zaxxer.hikari.IConnectionCustomizer iConnectionCustomizer3 = hikariConfig0.connectionCustomizer;
        hikariConfig0.setDataSourceClassName("HikariPool-47");
        hikariConfig0.setDataSourceClassName("HikariPool-18");
        boolean boolean8 = hikariConfig0.isRegisterMbeans();
        java.lang.String str9 = hikariConfig0.getDataSourceClassName();
        hikariConfig0.catalog = "HikariPool-86";
        com.zaxxer.hikari.IConnectionCustomizer iConnectionCustomizer12 = hikariConfig0.connectionCustomizer;
        org.junit.Assert.assertNull(iConnectionCustomizer3);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "HikariPool-18" + "'", str9, "HikariPool-18");
        org.junit.Assert.assertNull(iConnectionCustomizer12);
    }

    @Test
    public void test17410() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17410");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        java.lang.String str1 = hikariConfig0.getConnectionInitSql();
        long long2 = hikariConfig0.getLeakDetectionThreshold();
        hikariConfig0.leakDetectionThreshold = (-1);
        long long5 = hikariConfig0.acquireRetryDelay;
        boolean boolean6 = hikariConfig0.isRegisterMbeans;
        hikariConfig0.connectionTimeout = (short) 10;
        hikariConfig0.setPoolName("HikariPool-16");
        java.lang.String str11 = hikariConfig0.connectionTestQuery;
        java.lang.String str12 = hikariConfig0.jdbcUrl;
        hikariConfig0.acquireRetryDelay = (byte) 1;
        hikariConfig0.minPoolSize = '#';
        int int17 = hikariConfig0.getMaximumPoolSize();
        hikariConfig0.setJdbc4ConnectionTest(true);
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
// flaky:         org.junit.Assert.assertTrue("'" + long5 + "' != '" + 100L + "'", long5 == 100L);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 60 + "'", int17 == 60);
    }

    @Test
    public void test17411() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17411");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        java.lang.String str1 = hikariConfig0.getConnectionInitSql();
        long long2 = hikariConfig0.getLeakDetectionThreshold();
        hikariConfig0.leakDetectionThreshold = (-1);
        int int5 = hikariConfig0.acquireIncrement;
        hikariConfig0.setInitializationFailFast(true);
        hikariConfig0.setMaximumPoolSize((int) '#');
        java.lang.String str10 = hikariConfig0.connectionCustomizerClassName;
        hikariConfig0.setDataSourceClassName("HikariPool-122");
        java.util.Properties properties13 = hikariConfig0.dataSourceProperties;
        hikariConfig0.connectionTimeout = 35;
        hikariConfig0.setConnectionTestQuery("HikariPool-22121");
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNotNull(properties13);
    }

    @Test
    public void test17412() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17412");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        java.lang.String str1 = hikariConfig0.getConnectionInitSql();
        long long2 = hikariConfig0.getLeakDetectionThreshold();
        int int3 = hikariConfig0.getMaximumPoolSize();
        long long4 = hikariConfig0.getIdleTimeout();
        int int5 = hikariConfig0.maxPoolSize;
        long long6 = hikariConfig0.maxLifetime;
        java.lang.String str7 = hikariConfig0.getPoolName();
        hikariConfig0.setUseInstrumentation(true);
        java.lang.String str10 = hikariConfig0.getConnectionTestQuery();
        hikariConfig0.transactionIsolationName = "HikariPool-3458";
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 60 + "'", int3 == 60);
// flaky:         org.junit.Assert.assertTrue("'" + long4 + "' != '" + (-1L) + "'", long4 == (-1L));
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 60 + "'", int5 == 60);
// flaky:         org.junit.Assert.assertTrue("'" + long6 + "' != '" + 32L + "'", long6 == 32L);
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "HikariPool-42731" + "'", str7, "HikariPool-42731");
        org.junit.Assert.assertNull(str10);
    }

    @Test
    public void test17413() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17413");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        javax.sql.DataSource dataSource1 = hikariConfig0.getDataSource();
        hikariConfig0.setConnectionTestQuery("");
        hikariConfig0.connectionCustomizerClassName = "";
        hikariConfig0.setConnectionCustomizerClassName("hi!");
        java.lang.String str8 = hikariConfig0.getCatalog();
        boolean boolean9 = hikariConfig0.isRegisterMbeans;
        hikariConfig0.setAcquireRetries(0);
        hikariConfig0.setMaximumPoolSize((int) '#');
        javax.sql.DataSource dataSource14 = hikariConfig0.dataSource;
        hikariConfig0.setConnectionCustomizerClassName("HikariPool-66");
        hikariConfig0.setJdbcUrl("HikariPool-35");
        hikariConfig0.connectionCustomizerClassName = "HikariPool-14692";
        org.junit.Assert.assertNull(dataSource1);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(dataSource14);
    }

    @Test
    public void test17414() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17414");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        javax.sql.DataSource dataSource1 = hikariConfig0.getDataSource();
        hikariConfig0.setConnectionTestQuery("");
        hikariConfig0.setInitializationFailFast(false);
        hikariConfig0.poolName = "";
        int int8 = hikariConfig0.getTransactionIsolation();
        int int9 = hikariConfig0.getMinimumPoolSize();
        java.lang.String str10 = hikariConfig0.getPoolName();
        hikariConfig0.connectionTestQuery = "HikariPool-383";
        hikariConfig0.isInitializationFailFast = false;
        hikariConfig0.setJdbcUrl("HikariPool-931");
        boolean boolean17 = hikariConfig0.isJdbc4connectionTest;
        org.junit.Assert.assertNull(dataSource1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 10 + "'", int9 == 10);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
    }

    @Test
    public void test17415() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17415");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        javax.sql.DataSource dataSource1 = hikariConfig0.getDataSource();
        hikariConfig0.setConnectionTestQuery("");
        hikariConfig0.setInitializationFailFast(false);
        hikariConfig0.catalog = "";
        int int8 = hikariConfig0.getMaximumPoolSize();
        com.zaxxer.hikari.IConnectionCustomizer iConnectionCustomizer9 = null;
        hikariConfig0.connectionCustomizer = iConnectionCustomizer9;
        hikariConfig0.connectionTestQuery = "HikariPool-169";
        hikariConfig0.setAcquireRetryDelay(2147483647L);
        java.lang.String str15 = hikariConfig0.connectionTestQuery;
        java.lang.String str16 = hikariConfig0.getConnectionTestQuery();
        java.lang.String str17 = hikariConfig0.transactionIsolationName;
        boolean boolean18 = hikariConfig0.isInitializationFailFast;
        javax.sql.DataSource dataSource19 = null;
        hikariConfig0.setDataSource(dataSource19);
        org.junit.Assert.assertNull(dataSource1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 60 + "'", int8 == 60);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "HikariPool-169" + "'", str15, "HikariPool-169");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "HikariPool-169" + "'", str16, "HikariPool-169");
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test17416() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17416");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        javax.sql.DataSource dataSource1 = hikariConfig0.getDataSource();
        hikariConfig0.setConnectionTestQuery("");
        long long4 = hikariConfig0.maxLifetime;
        hikariConfig0.setAcquireRetryDelay((long) 0);
        int int7 = hikariConfig0.getAcquireRetries();
        hikariConfig0.leakDetectionThreshold = (short) 1;
        hikariConfig0.setAutoCommit(true);
        hikariConfig0.connectionTimeout = 750L;
        hikariConfig0.setJdbcUrl("HikariPool-2124");
        hikariConfig0.setMaximumPoolSize((int) (byte) 10);
        int int18 = hikariConfig0.getTransactionIsolation();
        org.junit.Assert.assertNull(dataSource1);
// flaky:         org.junit.Assert.assertTrue("'" + long4 + "' != '" + 32L + "'", long4 == 32L);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 3 + "'", int7 == 3);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
    }

    @Test
    public void test17417() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17417");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        java.lang.String str1 = hikariConfig0.getConnectionInitSql();
        long long2 = hikariConfig0.getLeakDetectionThreshold();
        int int3 = hikariConfig0.getMaximumPoolSize();
        long long4 = hikariConfig0.getIdleTimeout();
        int int5 = hikariConfig0.maxPoolSize;
        java.lang.String str6 = hikariConfig0.getConnectionCustomizerClassName();
        hikariConfig0.setConnectionCustomizerClassName("HikariPool-127");
        hikariConfig0.isIsolateInternalQueries = true;
        hikariConfig0.setMaximumPoolSize((int) '4');
        com.zaxxer.hikari.HikariConfig hikariConfig13 = new com.zaxxer.hikari.HikariConfig();
        hikariConfig13.setMaxLifetime((long) (short) 10);
        com.zaxxer.hikari.HikariConfig hikariConfig16 = new com.zaxxer.hikari.HikariConfig();
        javax.sql.DataSource dataSource17 = hikariConfig16.getDataSource();
        hikariConfig16.setConnectionTestQuery("");
        hikariConfig16.setInitializationFailFast(false);
        long long22 = hikariConfig16.getConnectionTimeout();
        java.util.Properties properties23 = hikariConfig16.dataSourceProperties;
        hikariConfig13.dataSourceProperties = properties23;
        hikariConfig0.setDataSourceProperties(properties23);
        int int26 = hikariConfig0.minPoolSize;
        hikariConfig0.setConnectionTestQuery("HikariPool-1656");
        boolean boolean29 = hikariConfig0.isJdbc4ConnectionTest();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 60 + "'", int3 == 60);
// flaky:         org.junit.Assert.assertTrue("'" + long4 + "' != '" + (-1L) + "'", long4 == (-1L));
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 60 + "'", int5 == 60);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(dataSource17);
// flaky:         org.junit.Assert.assertTrue("'" + long22 + "' != '" + 32L + "'", long22 == 32L);
        org.junit.Assert.assertNotNull(properties23);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 10 + "'", int26 == 10);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
    }

    @Test
    public void test17418() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17418");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        java.lang.String str1 = hikariConfig0.getConnectionInitSql();
        long long2 = hikariConfig0.getLeakDetectionThreshold();
        int int3 = hikariConfig0.getMaximumPoolSize();
        com.zaxxer.hikari.IConnectionCustomizer iConnectionCustomizer4 = hikariConfig0.connectionCustomizer;
        hikariConfig0.setDataSourceClassName("HikariPool-16");
        boolean boolean7 = hikariConfig0.isReadOnly();
        int int8 = hikariConfig0.minPoolSize;
        int int9 = hikariConfig0.getMinimumPoolSize();
        hikariConfig0.setUseInstrumentation(false);
        hikariConfig0.setTransactionIsolation("HikariPool-3402");
        hikariConfig0.setLeakDetectionThreshold((long) (short) 100);
        com.zaxxer.hikari.HikariConfig hikariConfig16 = new com.zaxxer.hikari.HikariConfig();
        javax.sql.DataSource dataSource17 = hikariConfig16.getDataSource();
        hikariConfig16.setConnectionTestQuery("");
        hikariConfig16.connectionCustomizerClassName = "";
        hikariConfig16.setConnectionCustomizerClassName("hi!");
        java.lang.String str24 = hikariConfig16.getCatalog();
        int int25 = hikariConfig16.acquireRetries;
        hikariConfig16.setRegisterMbeans(true);
        java.lang.String str28 = hikariConfig16.dataSourceClassName;
        boolean boolean29 = hikariConfig16.isAutoCommit();
        java.util.Properties properties30 = hikariConfig16.dataSourceProperties;
        hikariConfig0.dataSourceProperties = properties30;
        int int32 = hikariConfig0.maxPoolSize;
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 60 + "'", int3 == 60);
        org.junit.Assert.assertNull(iConnectionCustomizer4);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 10 + "'", int8 == 10);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 10 + "'", int9 == 10);
        org.junit.Assert.assertNull(dataSource17);
        org.junit.Assert.assertNull(str24);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 3 + "'", int25 == 3);
        org.junit.Assert.assertNull(str28);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertNotNull(properties30);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 60 + "'", int32 == 60);
    }

    @Test
    public void test17419() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17419");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        hikariConfig0.setMaxLifetime((long) (short) 10);
        com.zaxxer.hikari.IConnectionCustomizer iConnectionCustomizer3 = hikariConfig0.connectionCustomizer;
        hikariConfig0.setDataSourceClassName("HikariPool-47");
        hikariConfig0.setDataSourceClassName("HikariPool-18");
        boolean boolean8 = hikariConfig0.isRegisterMbeans();
        java.lang.String str9 = hikariConfig0.getDataSourceClassName();
        boolean boolean10 = hikariConfig0.isIsolateInternalQueries;
        hikariConfig0.isInitializationFailFast = false;
        hikariConfig0.acquireIncrement = 'a';
        long long15 = hikariConfig0.getAcquireRetryDelay();
        int int16 = hikariConfig0.getMaximumPoolSize();
        long long17 = hikariConfig0.connectionTimeout;
        boolean boolean18 = hikariConfig0.isJdbc4connectionTest;
        java.lang.String str19 = hikariConfig0.getJdbcUrl();
        hikariConfig0.setRegisterMbeans(true);
        org.junit.Assert.assertNull(iConnectionCustomizer3);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "HikariPool-18" + "'", str9, "HikariPool-18");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
// flaky:         org.junit.Assert.assertTrue("'" + long15 + "' != '" + 100L + "'", long15 == 100L);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 60 + "'", int16 == 60);
// flaky:         org.junit.Assert.assertTrue("'" + long17 + "' != '" + 32L + "'", long17 == 32L);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertNull(str19);
    }

    @Test
    public void test17420() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17420");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        java.lang.String str1 = hikariConfig0.getJdbcUrl();
        boolean boolean2 = hikariConfig0.isAutoCommit;
        com.zaxxer.hikari.IConnectionCustomizer iConnectionCustomizer3 = hikariConfig0.connectionCustomizer;
        java.lang.String str4 = hikariConfig0.connectionTestQuery;
        hikariConfig0.setReadOnly(true);
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNull(iConnectionCustomizer3);
        org.junit.Assert.assertNull(str4);
    }

    @Test
    public void test17421() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17421");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        javax.sql.DataSource dataSource1 = hikariConfig0.getDataSource();
        hikariConfig0.setConnectionTestQuery("");
        hikariConfig0.setInitializationFailFast(false);
        hikariConfig0.catalog = "";
        javax.sql.DataSource dataSource8 = null;
        hikariConfig0.dataSource = dataSource8;
        boolean boolean10 = hikariConfig0.isRegisterMbeans();
        boolean boolean11 = hikariConfig0.isJdbc4ConnectionTest();
        hikariConfig0.maxLifetime = 35;
        hikariConfig0.setConnectionTestQuery("HikariPool-932");
        hikariConfig0.setIdleTimeout(5000L);
        javax.sql.DataSource dataSource18 = null;
        hikariConfig0.setDataSource(dataSource18);
        long long20 = hikariConfig0.connectionTimeout;
        hikariConfig0.setTransactionIsolation("HikariPool-453");
        hikariConfig0.idleTimeout = '4';
        long long25 = hikariConfig0.getConnectionTimeout();
        org.junit.Assert.assertNull(dataSource1);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
// flaky:         org.junit.Assert.assertTrue("'" + long20 + "' != '" + 32L + "'", long20 == 32L);
// flaky:         org.junit.Assert.assertTrue("'" + long25 + "' != '" + 32L + "'", long25 == 32L);
    }

    @Test
    public void test17422() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17422");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        javax.sql.DataSource dataSource1 = hikariConfig0.getDataSource();
        hikariConfig0.setConnectionTestQuery("");
        hikariConfig0.connectionCustomizerClassName = "";
        com.zaxxer.hikari.IConnectionCustomizer iConnectionCustomizer6 = hikariConfig0.connectionCustomizer;
        java.lang.String str7 = hikariConfig0.jdbcUrl;
        boolean boolean8 = hikariConfig0.isReadOnly;
        hikariConfig0.setConnectionInitSql("HikariPool-26255");
        org.junit.Assert.assertNull(dataSource1);
        org.junit.Assert.assertNull(iConnectionCustomizer6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test17423() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17423");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        java.lang.String str1 = hikariConfig0.getConnectionInitSql();
        long long2 = hikariConfig0.getLeakDetectionThreshold();
        hikariConfig0.leakDetectionThreshold = (-1);
        int int5 = hikariConfig0.acquireIncrement;
        hikariConfig0.setInitializationFailFast(true);
        boolean boolean8 = hikariConfig0.isAutoCommit();
        hikariConfig0.setTransactionIsolation("");
        long long11 = hikariConfig0.idleTimeout;
        com.zaxxer.hikari.HikariConfig hikariConfig12 = new com.zaxxer.hikari.HikariConfig();
        javax.sql.DataSource dataSource13 = hikariConfig12.getDataSource();
        hikariConfig12.setConnectionTestQuery("");
        hikariConfig12.connectionCustomizerClassName = "";
        hikariConfig12.setConnectionCustomizerClassName("hi!");
        java.lang.String str20 = hikariConfig12.getCatalog();
        com.zaxxer.hikari.IConnectionCustomizer iConnectionCustomizer21 = null;
        hikariConfig12.connectionCustomizer = iConnectionCustomizer21;
        hikariConfig12.setJdbcUrl("HikariPool-38");
        com.zaxxer.hikari.HikariConfig hikariConfig25 = new com.zaxxer.hikari.HikariConfig();
        hikariConfig25.setMaxLifetime((long) (short) 10);
        com.zaxxer.hikari.HikariConfig hikariConfig28 = new com.zaxxer.hikari.HikariConfig();
        javax.sql.DataSource dataSource29 = hikariConfig28.getDataSource();
        hikariConfig28.setConnectionTestQuery("");
        hikariConfig28.setInitializationFailFast(false);
        long long34 = hikariConfig28.getConnectionTimeout();
        java.util.Properties properties35 = hikariConfig28.dataSourceProperties;
        hikariConfig25.dataSourceProperties = properties35;
        hikariConfig12.setDataSourceProperties(properties35);
        hikariConfig0.dataSourceProperties = properties35;
        javax.sql.DataSource dataSource39 = hikariConfig0.dataSource;
        int int40 = hikariConfig0.getAcquireIncrement();
        boolean boolean41 = hikariConfig0.isReadOnly();
        boolean boolean42 = hikariConfig0.isJdbc4connectionTest;
        int int43 = hikariConfig0.getMaximumPoolSize();
        hikariConfig0.acquireRetries = 0;
        com.zaxxer.hikari.HikariConfig hikariConfig46 = new com.zaxxer.hikari.HikariConfig();
        javax.sql.DataSource dataSource47 = hikariConfig46.getDataSource();
        hikariConfig46.setConnectionTestQuery("");
        hikariConfig46.connectionCustomizerClassName = "";
        hikariConfig46.setConnectionCustomizerClassName("hi!");
        java.lang.String str54 = hikariConfig46.getCatalog();
        boolean boolean55 = hikariConfig46.isRegisterMbeans;
        hikariConfig46.setAcquireRetries(0);
        hikariConfig46.setMaximumPoolSize((int) '#');
        hikariConfig46.setMinimumPoolSize((int) (byte) 10);
        java.lang.String str62 = hikariConfig46.transactionIsolationName;
        hikariConfig46.isReadOnly = false;
        java.util.Properties properties65 = hikariConfig46.getDataSourceProperties();
        hikariConfig0.dataSourceProperties = properties65;
        com.zaxxer.hikari.HikariConfig hikariConfig67 = new com.zaxxer.hikari.HikariConfig(properties65);
        hikariConfig67.setJdbc4ConnectionTest(true);
        com.zaxxer.hikari.HikariConfig hikariConfig70 = new com.zaxxer.hikari.HikariConfig();
        java.lang.String str71 = hikariConfig70.getConnectionInitSql();
        hikariConfig70.acquireRetries = 10;
        hikariConfig70.setPoolName("HikariPool-111");
        javax.sql.DataSource dataSource76 = null;
        hikariConfig70.dataSource = dataSource76;
        long long78 = hikariConfig70.leakDetectionThreshold;
        hikariConfig70.setIdleTimeout(0L);
        java.util.Properties properties81 = hikariConfig70.getDataSourceProperties();
        hikariConfig67.dataSourceProperties = properties81;
        hikariConfig67.connectionInitSql = "HikariPool-29576";
        boolean boolean85 = hikariConfig67.isJdbc4connectionTest;
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
// flaky:         org.junit.Assert.assertTrue("'" + long11 + "' != '" + (-1L) + "'", long11 == (-1L));
        org.junit.Assert.assertNull(dataSource13);
        org.junit.Assert.assertNull(str20);
        org.junit.Assert.assertNull(dataSource29);
// flaky:         org.junit.Assert.assertTrue("'" + long34 + "' != '" + 32L + "'", long34 == 32L);
        org.junit.Assert.assertNotNull(properties35);
        org.junit.Assert.assertNull(dataSource39);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 1 + "'", int40 == 1);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + true + "'", boolean42 == true);
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + 60 + "'", int43 == 60);
        org.junit.Assert.assertNull(dataSource47);
        org.junit.Assert.assertNull(str54);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + false + "'", boolean55 == false);
        org.junit.Assert.assertNull(str62);
        org.junit.Assert.assertNotNull(properties65);
        org.junit.Assert.assertNull(str71);
        org.junit.Assert.assertTrue("'" + long78 + "' != '" + 0L + "'", long78 == 0L);
        org.junit.Assert.assertNotNull(properties81);
        org.junit.Assert.assertTrue("'" + boolean85 + "' != '" + true + "'", boolean85 == true);
    }

    @Test
    public void test17424() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17424");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        java.lang.String str1 = hikariConfig0.getConnectionInitSql();
        long long2 = hikariConfig0.getLeakDetectionThreshold();
        com.zaxxer.hikari.IConnectionCustomizer iConnectionCustomizer3 = null;
        hikariConfig0.connectionCustomizer = iConnectionCustomizer3;
        boolean boolean5 = hikariConfig0.isIsolateInternalQueries();
        hikariConfig0.poolName = "HikariPool-47";
        java.lang.String str8 = hikariConfig0.getCatalog();
        long long9 = hikariConfig0.acquireRetryDelay;
        com.zaxxer.hikari.HikariConfig hikariConfig10 = new com.zaxxer.hikari.HikariConfig();
        java.lang.String str11 = hikariConfig10.getConnectionInitSql();
        long long12 = hikariConfig10.getLeakDetectionThreshold();
        int int13 = hikariConfig10.getMaximumPoolSize();
        java.util.Properties properties14 = hikariConfig10.getDataSourceProperties();
        hikariConfig0.setDataSourceProperties(properties14);
        boolean boolean16 = hikariConfig0.isAutoCommit();
        java.lang.String str17 = hikariConfig0.getPoolName();
        int int18 = hikariConfig0.getMinimumPoolSize();
        hikariConfig0.setReadOnly(true);
        boolean boolean21 = hikariConfig0.isAutoCommit();
        hikariConfig0.setMaxLifetime(35L);
        int int24 = hikariConfig0.minPoolSize;
        long long25 = hikariConfig0.connectionTimeout;
        int int26 = hikariConfig0.minPoolSize;
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(str8);
// flaky:         org.junit.Assert.assertTrue("'" + long9 + "' != '" + 100L + "'", long9 == 100L);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 60 + "'", int13 == 60);
        org.junit.Assert.assertNotNull(properties14);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "HikariPool-47" + "'", str17, "HikariPool-47");
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 10 + "'", int18 == 10);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 10 + "'", int24 == 10);
// flaky:         org.junit.Assert.assertTrue("'" + long25 + "' != '" + 32L + "'", long25 == 32L);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 10 + "'", int26 == 10);
    }

    @Test
    public void test17425() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17425");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        javax.sql.DataSource dataSource1 = hikariConfig0.getDataSource();
        hikariConfig0.setConnectionTestQuery("");
        hikariConfig0.connectionCustomizerClassName = "";
        hikariConfig0.setConnectionCustomizerClassName("hi!");
        java.lang.String str8 = hikariConfig0.getCatalog();
        boolean boolean9 = hikariConfig0.isRegisterMbeans;
        com.zaxxer.hikari.HikariConfig hikariConfig11 = new com.zaxxer.hikari.HikariConfig();
        javax.sql.DataSource dataSource12 = hikariConfig11.getDataSource();
        hikariConfig11.setConnectionTestQuery("");
        hikariConfig11.connectionCustomizerClassName = "";
        hikariConfig11.setConnectionCustomizerClassName("hi!");
        java.lang.String str19 = hikariConfig11.getCatalog();
        boolean boolean20 = hikariConfig11.isRegisterMbeans;
        hikariConfig11.setAcquireRetries(0);
        hikariConfig11.setMaximumPoolSize((int) '#');
        hikariConfig0.addDataSourceProperty("HikariPool-47", (java.lang.Object) '#');
        hikariConfig0.setConnectionTestQuery("HikariPool-47");
        java.lang.String str28 = hikariConfig0.connectionInitSql;
        hikariConfig0.transactionIsolation = (short) 100;
        hikariConfig0.setAcquireRetries(100);
        hikariConfig0.transactionIsolationName = "HikariPool-101";
        hikariConfig0.transactionIsolation = 100;
        hikariConfig0.setConnectionTimeout(750L);
        hikariConfig0.setReadOnly(false);
        hikariConfig0.maxLifetime = (byte) 100;
        boolean boolean43 = hikariConfig0.isRegisterMbeans();
        org.junit.Assert.assertNull(dataSource1);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(dataSource12);
        org.junit.Assert.assertNull(str19);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNull(str28);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
    }

    @Test
    public void test17426() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17426");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        java.lang.String str1 = hikariConfig0.getConnectionInitSql();
        long long2 = hikariConfig0.getLeakDetectionThreshold();
        int int3 = hikariConfig0.getMaximumPoolSize();
        long long4 = hikariConfig0.getIdleTimeout();
        int int5 = hikariConfig0.maxPoolSize;
        java.lang.String str6 = hikariConfig0.getConnectionCustomizerClassName();
        hikariConfig0.setConnectionCustomizerClassName("HikariPool-127");
        hikariConfig0.isIsolateInternalQueries = true;
        hikariConfig0.setMaximumPoolSize((int) '4');
        com.zaxxer.hikari.HikariConfig hikariConfig13 = new com.zaxxer.hikari.HikariConfig();
        hikariConfig13.setMaxLifetime((long) (short) 10);
        com.zaxxer.hikari.HikariConfig hikariConfig16 = new com.zaxxer.hikari.HikariConfig();
        javax.sql.DataSource dataSource17 = hikariConfig16.getDataSource();
        hikariConfig16.setConnectionTestQuery("");
        hikariConfig16.setInitializationFailFast(false);
        long long22 = hikariConfig16.getConnectionTimeout();
        java.util.Properties properties23 = hikariConfig16.dataSourceProperties;
        hikariConfig13.dataSourceProperties = properties23;
        hikariConfig0.setDataSourceProperties(properties23);
        com.zaxxer.hikari.HikariConfig hikariConfig26 = new com.zaxxer.hikari.HikariConfig(properties23);
        boolean boolean27 = hikariConfig26.isReadOnly();
        hikariConfig26.setIsolateInternalQueries(false);
        boolean boolean30 = hikariConfig26.isInitializationFailFast();
        javax.sql.DataSource dataSource31 = null;
        hikariConfig26.dataSource = dataSource31;
        hikariConfig26.setMinimumPoolSize((int) (short) 100);
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 60 + "'", int3 == 60);
// flaky:         org.junit.Assert.assertTrue("'" + long4 + "' != '" + (-1L) + "'", long4 == (-1L));
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 60 + "'", int5 == 60);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(dataSource17);
// flaky:         org.junit.Assert.assertTrue("'" + long22 + "' != '" + 32L + "'", long22 == 32L);
        org.junit.Assert.assertNotNull(properties23);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
    }

    @Test
    public void test17427() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17427");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        hikariConfig0.setMaxLifetime((long) (short) 10);
        com.zaxxer.hikari.IConnectionCustomizer iConnectionCustomizer3 = hikariConfig0.connectionCustomizer;
        hikariConfig0.setDataSourceClassName("HikariPool-47");
        hikariConfig0.setDataSourceClassName("HikariPool-18");
        boolean boolean8 = hikariConfig0.isRegisterMbeans();
        java.lang.String str9 = hikariConfig0.getDataSourceClassName();
        hikariConfig0.setIdleTimeout((long) (-1));
        hikariConfig0.setUseInstrumentation(false);
        javax.sql.DataSource dataSource14 = null;
        hikariConfig0.dataSource = dataSource14;
        boolean boolean16 = hikariConfig0.isAutoCommit();
        int int17 = hikariConfig0.transactionIsolation;
        org.junit.Assert.assertNull(iConnectionCustomizer3);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "HikariPool-18" + "'", str9, "HikariPool-18");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
    }

    @Test
    public void test17428() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17428");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        java.lang.String str1 = hikariConfig0.getConnectionInitSql();
        long long2 = hikariConfig0.getLeakDetectionThreshold();
        hikariConfig0.leakDetectionThreshold = (-1);
        long long5 = hikariConfig0.acquireRetryDelay;
        hikariConfig0.setLeakDetectionThreshold((long) (byte) -1);
        java.util.Properties properties8 = hikariConfig0.getDataSourceProperties();
        boolean boolean9 = hikariConfig0.isReadOnly();
        hikariConfig0.jdbcUrl = "HikariPool-29";
        java.lang.String str12 = hikariConfig0.getConnectionTestQuery();
        hikariConfig0.setIdleTimeout(0L);
        java.util.Properties properties15 = hikariConfig0.getDataSourceProperties();
        java.lang.String str16 = hikariConfig0.getJdbcUrl();
        hikariConfig0.setDataSourceClassName("HikariPool-12528");
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
// flaky:         org.junit.Assert.assertTrue("'" + long5 + "' != '" + 100L + "'", long5 == 100L);
        org.junit.Assert.assertNotNull(properties8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNotNull(properties15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "HikariPool-29" + "'", str16, "HikariPool-29");
    }

    @Test
    public void test17429() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17429");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        hikariConfig0.setMaxLifetime((long) (short) 10);
        com.zaxxer.hikari.IConnectionCustomizer iConnectionCustomizer3 = hikariConfig0.connectionCustomizer;
        hikariConfig0.setDataSourceClassName("HikariPool-47");
        hikariConfig0.setDataSourceClassName("HikariPool-18");
        com.zaxxer.hikari.IConnectionCustomizer iConnectionCustomizer8 = null;
        hikariConfig0.connectionCustomizer = iConnectionCustomizer8;
        long long10 = hikariConfig0.getAcquireRetryDelay();
        long long11 = hikariConfig0.getIdleTimeout();
        // The following exception was thrown during execution in test generation
        try {
            hikariConfig0.validate();
// flaky:             org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: idleTimeout cannot be negative.");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(iConnectionCustomizer3);
// flaky:         org.junit.Assert.assertTrue("'" + long10 + "' != '" + 100L + "'", long10 == 100L);
// flaky:         org.junit.Assert.assertTrue("'" + long11 + "' != '" + (-1L) + "'", long11 == (-1L));
    }

    @Test
    public void test17430() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17430");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        hikariConfig0.setMaxLifetime((long) (short) 10);
        java.lang.String str3 = hikariConfig0.getPoolName();
        hikariConfig0.jdbcUrl = "";
        hikariConfig0.setMaxLifetime(0L);
        hikariConfig0.setTransactionIsolation("HikariPool-48");
        com.zaxxer.hikari.HikariConfig hikariConfig10 = new com.zaxxer.hikari.HikariConfig();
        hikariConfig10.setMaxLifetime((long) (short) 10);
        com.zaxxer.hikari.HikariConfig hikariConfig13 = new com.zaxxer.hikari.HikariConfig();
        javax.sql.DataSource dataSource14 = hikariConfig13.getDataSource();
        hikariConfig13.setConnectionTestQuery("");
        hikariConfig13.setInitializationFailFast(false);
        long long19 = hikariConfig13.getConnectionTimeout();
        java.util.Properties properties20 = hikariConfig13.dataSourceProperties;
        hikariConfig10.dataSourceProperties = properties20;
        hikariConfig0.setDataSourceProperties(properties20);
        java.lang.String str23 = hikariConfig0.getJdbcUrl();
        javax.sql.DataSource dataSource24 = hikariConfig0.dataSource;
        java.util.Properties properties25 = hikariConfig0.dataSourceProperties;
        java.lang.String str26 = hikariConfig0.transactionIsolationName;
        hikariConfig0.setMinimumPoolSize((int) (short) 10);
        hikariConfig0.acquireRetries = (short) 100;
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "HikariPool-42769" + "'", str3, "HikariPool-42769");
        org.junit.Assert.assertNull(dataSource14);
// flaky:         org.junit.Assert.assertTrue("'" + long19 + "' != '" + 32L + "'", long19 == 32L);
        org.junit.Assert.assertNotNull(properties20);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
        org.junit.Assert.assertNull(dataSource24);
        org.junit.Assert.assertNotNull(properties25);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "HikariPool-48" + "'", str26, "HikariPool-48");
    }

    @Test
    public void test17431() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17431");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        java.lang.String str1 = hikariConfig0.getConnectionInitSql();
        long long2 = hikariConfig0.getLeakDetectionThreshold();
        com.zaxxer.hikari.IConnectionCustomizer iConnectionCustomizer3 = null;
        hikariConfig0.connectionCustomizer = iConnectionCustomizer3;
        hikariConfig0.acquireRetries = 0;
        long long7 = hikariConfig0.getMaxLifetime();
        hikariConfig0.setIsolateInternalQueries(true);
        long long10 = hikariConfig0.acquireRetryDelay;
        hikariConfig0.setCatalog("HikariPool-1646");
        boolean boolean13 = hikariConfig0.isIsolateInternalQueries;
        java.util.Properties properties14 = hikariConfig0.dataSourceProperties;
        hikariConfig0.acquireIncrement = ' ';
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
// flaky:         org.junit.Assert.assertTrue("'" + long7 + "' != '" + 32L + "'", long7 == 32L);
// flaky:         org.junit.Assert.assertTrue("'" + long10 + "' != '" + 100L + "'", long10 == 100L);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNotNull(properties14);
    }

    @Test
    public void test17432() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17432");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        hikariConfig0.setMaxLifetime((long) (short) 10);
        java.lang.String str3 = hikariConfig0.getPoolName();
        hikariConfig0.jdbcUrl = "";
        hikariConfig0.setMaxLifetime(0L);
        hikariConfig0.setTransactionIsolation("HikariPool-48");
        com.zaxxer.hikari.HikariConfig hikariConfig10 = new com.zaxxer.hikari.HikariConfig();
        hikariConfig10.setMaxLifetime((long) (short) 10);
        com.zaxxer.hikari.HikariConfig hikariConfig13 = new com.zaxxer.hikari.HikariConfig();
        javax.sql.DataSource dataSource14 = hikariConfig13.getDataSource();
        hikariConfig13.setConnectionTestQuery("");
        hikariConfig13.setInitializationFailFast(false);
        long long19 = hikariConfig13.getConnectionTimeout();
        java.util.Properties properties20 = hikariConfig13.dataSourceProperties;
        hikariConfig10.dataSourceProperties = properties20;
        hikariConfig0.setDataSourceProperties(properties20);
        com.zaxxer.hikari.HikariConfig hikariConfig23 = new com.zaxxer.hikari.HikariConfig(properties20);
        long long24 = hikariConfig23.acquireRetryDelay;
        java.util.Properties properties25 = hikariConfig23.getDataSourceProperties();
        java.lang.String str26 = hikariConfig23.getPoolName();
        hikariConfig23.setUseInstrumentation(true);
        int int29 = hikariConfig23.getMaximumPoolSize();
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "HikariPool-42773" + "'", str3, "HikariPool-42773");
        org.junit.Assert.assertNull(dataSource14);
// flaky:         org.junit.Assert.assertTrue("'" + long19 + "' != '" + 32L + "'", long19 == 32L);
        org.junit.Assert.assertNotNull(properties20);
// flaky:         org.junit.Assert.assertTrue("'" + long24 + "' != '" + 100L + "'", long24 == 100L);
        org.junit.Assert.assertNotNull(properties25);
// flaky:         org.junit.Assert.assertEquals("'" + str26 + "' != '" + "HikariPool-42776" + "'", str26, "HikariPool-42776");
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 60 + "'", int29 == 60);
    }

    @Test
    public void test17433() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17433");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        java.lang.String str1 = hikariConfig0.getConnectionInitSql();
        long long2 = hikariConfig0.getLeakDetectionThreshold();
        com.zaxxer.hikari.IConnectionCustomizer iConnectionCustomizer3 = null;
        hikariConfig0.connectionCustomizer = iConnectionCustomizer3;
        hikariConfig0.setReadOnly(true);
        hikariConfig0.maxPoolSize = (short) 100;
        hikariConfig0.setAcquireRetries((int) '4');
        java.lang.String str11 = hikariConfig0.transactionIsolationName;
        hikariConfig0.setMaximumPoolSize(52);
        hikariConfig0.acquireRetries = 0;
        hikariConfig0.leakDetectionThreshold = 10;
        hikariConfig0.transactionIsolation = '#';
        hikariConfig0.isJdbc4connectionTest = true;
        hikariConfig0.jdbcUrl = "HikariPool-33815";
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertNull(str11);
    }

    @Test
    public void test17434() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17434");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        hikariConfig0.setMaxLifetime((long) (short) 10);
        java.lang.String str3 = hikariConfig0.getPoolName();
        hikariConfig0.jdbcUrl = "";
        hikariConfig0.setMaxLifetime(0L);
        hikariConfig0.setTransactionIsolation("HikariPool-48");
        com.zaxxer.hikari.HikariConfig hikariConfig10 = new com.zaxxer.hikari.HikariConfig();
        hikariConfig10.setMaxLifetime((long) (short) 10);
        com.zaxxer.hikari.HikariConfig hikariConfig13 = new com.zaxxer.hikari.HikariConfig();
        javax.sql.DataSource dataSource14 = hikariConfig13.getDataSource();
        hikariConfig13.setConnectionTestQuery("");
        hikariConfig13.setInitializationFailFast(false);
        long long19 = hikariConfig13.getConnectionTimeout();
        java.util.Properties properties20 = hikariConfig13.dataSourceProperties;
        hikariConfig10.dataSourceProperties = properties20;
        hikariConfig0.setDataSourceProperties(properties20);
        java.lang.String str23 = hikariConfig0.getJdbcUrl();
        javax.sql.DataSource dataSource24 = hikariConfig0.dataSource;
        java.util.Properties properties25 = hikariConfig0.dataSourceProperties;
        boolean boolean26 = hikariConfig0.isJdbc4connectionTest;
        hikariConfig0.setCatalog("HikariPool-97");
        hikariConfig0.setAcquireRetries((int) (short) 0);
        boolean boolean31 = hikariConfig0.isRegisterMbeans();
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "HikariPool-42778" + "'", str3, "HikariPool-42778");
        org.junit.Assert.assertNull(dataSource14);
// flaky:         org.junit.Assert.assertTrue("'" + long19 + "' != '" + 32L + "'", long19 == 32L);
        org.junit.Assert.assertNotNull(properties20);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
        org.junit.Assert.assertNull(dataSource24);
        org.junit.Assert.assertNotNull(properties25);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
    }

    @Test
    public void test17435() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17435");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        java.lang.String str1 = hikariConfig0.getConnectionInitSql();
        long long2 = hikariConfig0.getLeakDetectionThreshold();
        int int3 = hikariConfig0.getMaximumPoolSize();
        hikariConfig0.setLeakDetectionThreshold(10L);
        java.lang.String str6 = hikariConfig0.connectionTestQuery;
        hikariConfig0.transactionIsolationName = "";
        hikariConfig0.jdbcUrl = "HikariPool-332";
        hikariConfig0.isJdbc4connectionTest = true;
        java.lang.String str13 = hikariConfig0.connectionInitSql;
        hikariConfig0.setAcquireRetries(1);
        com.zaxxer.hikari.IConnectionCustomizer iConnectionCustomizer16 = hikariConfig0.connectionCustomizer;
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 60 + "'", int3 == 60);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNull(iConnectionCustomizer16);
    }

    @Test
    public void test17436() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17436");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        javax.sql.DataSource dataSource1 = hikariConfig0.getDataSource();
        hikariConfig0.setConnectionTestQuery("");
        hikariConfig0.connectionCustomizerClassName = "";
        hikariConfig0.setConnectionCustomizerClassName("hi!");
        java.lang.String str8 = hikariConfig0.getCatalog();
        boolean boolean9 = hikariConfig0.isRegisterMbeans;
        hikariConfig0.setAcquireRetries(0);
        long long12 = hikariConfig0.getMaxLifetime();
        hikariConfig0.setReadOnly(false);
        com.zaxxer.hikari.HikariConfig hikariConfig15 = new com.zaxxer.hikari.HikariConfig();
        javax.sql.DataSource dataSource16 = hikariConfig15.getDataSource();
        hikariConfig15.setConnectionTestQuery("");
        hikariConfig15.setInitializationFailFast(false);
        hikariConfig15.catalog = "";
        com.zaxxer.hikari.HikariConfig hikariConfig23 = new com.zaxxer.hikari.HikariConfig();
        javax.sql.DataSource dataSource24 = hikariConfig23.getDataSource();
        hikariConfig23.setConnectionTestQuery("");
        hikariConfig23.connectionCustomizerClassName = "";
        hikariConfig23.setConnectionCustomizerClassName("hi!");
        java.lang.String str31 = hikariConfig23.getCatalog();
        java.util.Properties properties32 = hikariConfig23.dataSourceProperties;
        hikariConfig15.dataSourceProperties = properties32;
        hikariConfig0.setDataSourceProperties(properties32);
        com.zaxxer.hikari.IConnectionCustomizer iConnectionCustomizer35 = null;
        hikariConfig0.connectionCustomizer = iConnectionCustomizer35;
        long long37 = hikariConfig0.getIdleTimeout();
        hikariConfig0.setIdleTimeout(32L);
        hikariConfig0.connectionCustomizerClassName = "HikariPool-103";
        hikariConfig0.setTransactionIsolation("HikariPool-102");
        hikariConfig0.setReadOnly(false);
        hikariConfig0.setJdbcUrl("");
        org.junit.Assert.assertNull(dataSource1);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
// flaky:         org.junit.Assert.assertTrue("'" + long12 + "' != '" + 32L + "'", long12 == 32L);
        org.junit.Assert.assertNull(dataSource16);
        org.junit.Assert.assertNull(dataSource24);
        org.junit.Assert.assertNull(str31);
        org.junit.Assert.assertNotNull(properties32);
// flaky:         org.junit.Assert.assertTrue("'" + long37 + "' != '" + (-1L) + "'", long37 == (-1L));
    }

    @Test
    public void test17437() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17437");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        hikariConfig0.setMaxLifetime((long) (short) 10);
        hikariConfig0.setConnectionTimeout(0L);
        com.zaxxer.hikari.HikariConfig hikariConfig5 = new com.zaxxer.hikari.HikariConfig();
        javax.sql.DataSource dataSource6 = hikariConfig5.getDataSource();
        hikariConfig5.setConnectionTestQuery("");
        com.zaxxer.hikari.HikariConfig hikariConfig9 = new com.zaxxer.hikari.HikariConfig();
        javax.sql.DataSource dataSource10 = hikariConfig9.getDataSource();
        hikariConfig9.setConnectionTestQuery("");
        hikariConfig9.setInitializationFailFast(false);
        long long15 = hikariConfig9.getConnectionTimeout();
        java.util.Properties properties16 = hikariConfig9.dataSourceProperties;
        hikariConfig5.setDataSourceProperties(properties16);
        hikariConfig0.setDataSourceProperties(properties16);
        hikariConfig0.setIdleTimeout((long) '4');
        hikariConfig0.setMaxLifetime((long) (-1));
        long long23 = hikariConfig0.maxLifetime;
        java.lang.String str24 = hikariConfig0.catalog;
        org.junit.Assert.assertNull(dataSource6);
        org.junit.Assert.assertNull(dataSource10);
// flaky:         org.junit.Assert.assertTrue("'" + long15 + "' != '" + 32L + "'", long15 == 32L);
        org.junit.Assert.assertNotNull(properties16);
        org.junit.Assert.assertTrue("'" + long23 + "' != '" + (-1L) + "'", long23 == (-1L));
        org.junit.Assert.assertNull(str24);
    }

    @Test
    public void test17438() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17438");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        javax.sql.DataSource dataSource1 = hikariConfig0.getDataSource();
        hikariConfig0.setConnectionTestQuery("");
        hikariConfig0.connectionCustomizerClassName = "";
        hikariConfig0.setConnectionCustomizerClassName("hi!");
        java.lang.String str8 = hikariConfig0.getCatalog();
        boolean boolean9 = hikariConfig0.isRegisterMbeans;
        hikariConfig0.setAcquireRetries(0);
        hikariConfig0.setMaximumPoolSize((int) '#');
        javax.sql.DataSource dataSource14 = hikariConfig0.dataSource;
        hikariConfig0.setJdbcUrl("HikariPool-10115");
        org.junit.Assert.assertNull(dataSource1);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(dataSource14);
    }

    @Test
    public void test17439() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17439");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        javax.sql.DataSource dataSource1 = hikariConfig0.getDataSource();
        hikariConfig0.setConnectionTestQuery("");
        int int4 = hikariConfig0.getTransactionIsolation();
        boolean boolean5 = hikariConfig0.isRegisterMbeans();
        hikariConfig0.setIsolateInternalQueries(true);
        javax.sql.DataSource dataSource8 = null;
        hikariConfig0.setDataSource(dataSource8);
        com.zaxxer.hikari.HikariConfig hikariConfig10 = new com.zaxxer.hikari.HikariConfig();
        java.lang.String str11 = hikariConfig10.getConnectionInitSql();
        long long12 = hikariConfig10.getLeakDetectionThreshold();
        int int13 = hikariConfig10.getMaximumPoolSize();
        long long14 = hikariConfig10.leakDetectionThreshold;
        hikariConfig10.setInitializationFailFast(true);
        com.zaxxer.hikari.HikariConfig hikariConfig18 = new com.zaxxer.hikari.HikariConfig();
        javax.sql.DataSource dataSource19 = hikariConfig18.getDataSource();
        hikariConfig18.setConnectionTestQuery("");
        hikariConfig18.connectionCustomizerClassName = "";
        long long24 = hikariConfig18.getAcquireRetryDelay();
        hikariConfig18.setDataSourceClassName("HikariPool-66");
        hikariConfig18.setInitializationFailFast(false);
        hikariConfig10.addDataSourceProperty("HikariPool-62", (java.lang.Object) hikariConfig18);
        java.util.Properties properties30 = hikariConfig18.dataSourceProperties;
        java.util.Properties properties31 = hikariConfig18.getDataSourceProperties();
        hikariConfig0.setDataSourceProperties(properties31);
        java.lang.String str33 = hikariConfig0.getPoolName();
        boolean boolean34 = hikariConfig0.isRegisterMbeans();
        hikariConfig0.acquireRetryDelay = (short) 100;
        long long37 = hikariConfig0.getLeakDetectionThreshold();
        int int38 = hikariConfig0.getAcquireRetries();
        org.junit.Assert.assertNull(dataSource1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 60 + "'", int13 == 60);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 0L + "'", long14 == 0L);
        org.junit.Assert.assertNull(dataSource19);
// flaky:         org.junit.Assert.assertTrue("'" + long24 + "' != '" + 100L + "'", long24 == 100L);
        org.junit.Assert.assertNotNull(properties30);
        org.junit.Assert.assertNotNull(properties31);
// flaky:         org.junit.Assert.assertEquals("'" + str33 + "' != '" + "HikariPool-42789" + "'", str33, "HikariPool-42789");
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertTrue("'" + long37 + "' != '" + 0L + "'", long37 == 0L);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 3 + "'", int38 == 3);
    }

    @Test
    public void test17440() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17440");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        java.lang.String str1 = hikariConfig0.getConnectionInitSql();
        long long2 = hikariConfig0.getLeakDetectionThreshold();
        hikariConfig0.leakDetectionThreshold = (-1);
        hikariConfig0.setRegisterMbeans(false);
        hikariConfig0.setInitializationFailFast(false);
        hikariConfig0.setAcquireRetryDelay(5000L);
        hikariConfig0.isAutoCommit = false;
        com.zaxxer.hikari.HikariConfig hikariConfig13 = new com.zaxxer.hikari.HikariConfig();
        java.lang.String str14 = hikariConfig13.getConnectionInitSql();
        long long15 = hikariConfig13.getLeakDetectionThreshold();
        int int16 = hikariConfig13.getMaximumPoolSize();
        long long17 = hikariConfig13.leakDetectionThreshold;
        hikariConfig13.catalog = "HikariPool-62";
        boolean boolean20 = hikariConfig13.isJdbc4connectionTest;
        int int21 = hikariConfig13.acquireRetries;
        hikariConfig13.transactionIsolationName = "HikariPool-66";
        hikariConfig13.acquireIncrement = (byte) 10;
        hikariConfig13.maxPoolSize = (byte) 100;
        hikariConfig13.isRegisterMbeans = true;
        java.lang.String str30 = hikariConfig13.getConnectionCustomizerClassName();
        java.util.Properties properties31 = hikariConfig13.getDataSourceProperties();
        hikariConfig0.dataSourceProperties = properties31;
        java.util.Properties properties33 = hikariConfig0.getDataSourceProperties();
        com.zaxxer.hikari.HikariConfig hikariConfig34 = new com.zaxxer.hikari.HikariConfig(properties33);
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 0L + "'", long15 == 0L);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 60 + "'", int16 == 60);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 0L + "'", long17 == 0L);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 3 + "'", int21 == 3);
        org.junit.Assert.assertNull(str30);
        org.junit.Assert.assertNotNull(properties31);
        org.junit.Assert.assertNotNull(properties33);
    }

    @Test
    public void test17441() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17441");
        // The following exception was thrown during execution in test generation
        try {
            com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig("HikariPool-12425");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Property file HikariPool-12425 was not found.");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test17442() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17442");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        javax.sql.DataSource dataSource1 = hikariConfig0.getDataSource();
        hikariConfig0.setConnectionTestQuery("");
        hikariConfig0.connectionCustomizerClassName = "";
        hikariConfig0.setConnectionCustomizerClassName("hi!");
        java.lang.String str8 = hikariConfig0.getCatalog();
        java.util.Properties properties9 = hikariConfig0.dataSourceProperties;
        int int10 = hikariConfig0.minPoolSize;
        java.lang.String str11 = hikariConfig0.getConnectionTestQuery();
        java.util.Properties properties12 = hikariConfig0.dataSourceProperties;
        java.lang.String str13 = hikariConfig0.poolName;
        java.lang.String str14 = hikariConfig0.connectionTestQuery;
        java.lang.String str15 = hikariConfig0.getDataSourceClassName();
        org.junit.Assert.assertNull(dataSource1);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNotNull(properties9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 10 + "'", int10 == 10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNotNull(properties12);
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "HikariPool-42796" + "'", str13, "HikariPool-42796");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertNull(str15);
    }

    @Test
    public void test17443() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17443");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        javax.sql.DataSource dataSource1 = hikariConfig0.getDataSource();
        hikariConfig0.setConnectionTestQuery("");
        hikariConfig0.setInitializationFailFast(false);
        hikariConfig0.catalog = "";
        javax.sql.DataSource dataSource8 = null;
        hikariConfig0.dataSource = dataSource8;
        javax.sql.DataSource dataSource10 = null;
        hikariConfig0.dataSource = dataSource10;
        int int12 = hikariConfig0.maxPoolSize;
        java.lang.String str13 = hikariConfig0.getJdbcUrl();
        org.junit.Assert.assertNull(dataSource1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 60 + "'", int12 == 60);
        org.junit.Assert.assertNull(str13);
    }

    @Test
    public void test17444() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17444");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        hikariConfig0.setTransactionIsolation("HikariPool-47");
        hikariConfig0.leakDetectionThreshold = 5000L;
        long long5 = hikariConfig0.idleTimeout;
        hikariConfig0.idleTimeout = 1;
        com.zaxxer.hikari.HikariConfig hikariConfig8 = new com.zaxxer.hikari.HikariConfig();
        javax.sql.DataSource dataSource9 = hikariConfig8.getDataSource();
        hikariConfig8.setConnectionTestQuery("");
        hikariConfig8.setInitializationFailFast(false);
        java.lang.String str14 = hikariConfig8.getConnectionInitSql();
        hikariConfig8.setReadOnly(true);
        javax.sql.DataSource dataSource17 = null;
        hikariConfig8.setDataSource(dataSource17);
        boolean boolean19 = hikariConfig8.isReadOnly;
        hikariConfig8.connectionTimeout = 0L;
        com.zaxxer.hikari.HikariConfig hikariConfig22 = new com.zaxxer.hikari.HikariConfig();
        hikariConfig22.setMaxLifetime((long) (short) 10);
        com.zaxxer.hikari.HikariConfig hikariConfig25 = new com.zaxxer.hikari.HikariConfig();
        javax.sql.DataSource dataSource26 = hikariConfig25.getDataSource();
        hikariConfig25.setConnectionTestQuery("");
        hikariConfig25.setInitializationFailFast(false);
        long long31 = hikariConfig25.getConnectionTimeout();
        java.util.Properties properties32 = hikariConfig25.dataSourceProperties;
        hikariConfig22.dataSourceProperties = properties32;
        hikariConfig8.setDataSourceProperties(properties32);
        hikariConfig0.setDataSourceProperties(properties32);
        hikariConfig0.setJdbcUrl("HikariPool-3298");
        java.lang.String str38 = hikariConfig0.getCatalog();
        java.lang.String str39 = hikariConfig0.getCatalog();
        boolean boolean40 = hikariConfig0.isInitializationFailFast();
// flaky:         org.junit.Assert.assertTrue("'" + long5 + "' != '" + (-1L) + "'", long5 == (-1L));
        org.junit.Assert.assertNull(dataSource9);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertNull(dataSource26);
// flaky:         org.junit.Assert.assertTrue("'" + long31 + "' != '" + 32L + "'", long31 == 32L);
        org.junit.Assert.assertNotNull(properties32);
        org.junit.Assert.assertNull(str38);
        org.junit.Assert.assertNull(str39);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
    }

    @Test
    public void test17445() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17445");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        javax.sql.DataSource dataSource1 = hikariConfig0.getDataSource();
        hikariConfig0.setConnectionTestQuery("");
        hikariConfig0.connectionCustomizerClassName = "";
        hikariConfig0.setConnectionCustomizerClassName("hi!");
        java.lang.String str8 = hikariConfig0.getCatalog();
        boolean boolean9 = hikariConfig0.isRegisterMbeans;
        hikariConfig0.setAcquireRetries(0);
        long long12 = hikariConfig0.maxLifetime;
        java.lang.String str13 = hikariConfig0.getConnectionInitSql();
        com.zaxxer.hikari.IConnectionCustomizer iConnectionCustomizer14 = hikariConfig0.connectionCustomizer;
        java.lang.String str15 = hikariConfig0.getConnectionCustomizerClassName();
        hikariConfig0.acquireRetries = (short) 1;
        hikariConfig0.setMaximumPoolSize((int) (byte) 1);
        hikariConfig0.connectionCustomizerClassName = "HikariPool-367";
        int int22 = hikariConfig0.acquireRetries;
        javax.sql.DataSource dataSource23 = hikariConfig0.dataSource;
        org.junit.Assert.assertNull(dataSource1);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
// flaky:         org.junit.Assert.assertTrue("'" + long12 + "' != '" + 32L + "'", long12 == 32L);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNull(iConnectionCustomizer14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 1 + "'", int22 == 1);
        org.junit.Assert.assertNull(dataSource23);
    }

    @Test
    public void test17446() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17446");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        javax.sql.DataSource dataSource1 = hikariConfig0.getDataSource();
        hikariConfig0.setConnectionTestQuery("");
        hikariConfig0.connectionCustomizerClassName = "";
        hikariConfig0.setConnectionCustomizerClassName("hi!");
        java.lang.String str8 = hikariConfig0.getCatalog();
        hikariConfig0.idleTimeout = 3;
        hikariConfig0.catalog = "";
        // The following exception was thrown during execution in test generation
        try {
            hikariConfig0.setMinimumPoolSize((-1));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: minPoolSize cannot be negative");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(dataSource1);
        org.junit.Assert.assertNull(str8);
    }

    @Test
    public void test17447() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17447");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        javax.sql.DataSource dataSource1 = hikariConfig0.getDataSource();
        hikariConfig0.setConnectionTestQuery("");
        hikariConfig0.setInitializationFailFast(false);
        hikariConfig0.catalog = "";
        int int8 = hikariConfig0.getMaximumPoolSize();
        hikariConfig0.connectionTimeout = 10L;
        boolean boolean11 = hikariConfig0.isIsolateInternalQueries;
        boolean boolean12 = hikariConfig0.isJdbc4connectionTest;
        hikariConfig0.acquireIncrement = '#';
        long long15 = hikariConfig0.maxLifetime;
        hikariConfig0.acquireRetryDelay = 100;
        int int18 = hikariConfig0.getMinimumPoolSize();
        org.junit.Assert.assertNull(dataSource1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 60 + "'", int8 == 60);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
// flaky:         org.junit.Assert.assertTrue("'" + long15 + "' != '" + 32L + "'", long15 == 32L);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 10 + "'", int18 == 10);
    }

    @Test
    public void test17448() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17448");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        java.lang.String str1 = hikariConfig0.getConnectionInitSql();
        long long2 = hikariConfig0.getLeakDetectionThreshold();
        hikariConfig0.leakDetectionThreshold = (-1);
        long long5 = hikariConfig0.acquireRetryDelay;
        com.zaxxer.hikari.HikariConfig hikariConfig7 = new com.zaxxer.hikari.HikariConfig();
        javax.sql.DataSource dataSource8 = hikariConfig7.getDataSource();
        hikariConfig7.setConnectionTestQuery("");
        hikariConfig7.connectionCustomizerClassName = "";
        hikariConfig7.setConnectionCustomizerClassName("hi!");
        java.lang.String str15 = hikariConfig7.getCatalog();
        boolean boolean16 = hikariConfig7.isRegisterMbeans;
        long long17 = hikariConfig7.connectionTimeout;
        hikariConfig7.setConnectionInitSql("HikariPool-48");
        hikariConfig0.addDataSourceProperty("hi!", (java.lang.Object) hikariConfig7);
        java.lang.String str21 = hikariConfig7.getConnectionCustomizerClassName();
        hikariConfig7.connectionTimeout = 10L;
        long long24 = hikariConfig7.idleTimeout;
        com.zaxxer.hikari.HikariConfig hikariConfig25 = new com.zaxxer.hikari.HikariConfig();
        java.lang.String str26 = hikariConfig25.getConnectionInitSql();
        hikariConfig25.setMaxLifetime(35L);
        hikariConfig25.setAutoCommit(false);
        com.zaxxer.hikari.HikariConfig hikariConfig31 = new com.zaxxer.hikari.HikariConfig();
        javax.sql.DataSource dataSource32 = hikariConfig31.getDataSource();
        hikariConfig31.setConnectionTestQuery("");
        hikariConfig31.connectionCustomizerClassName = "";
        hikariConfig31.setConnectionCustomizerClassName("hi!");
        java.lang.String str39 = hikariConfig31.getCatalog();
        com.zaxxer.hikari.IConnectionCustomizer iConnectionCustomizer40 = null;
        hikariConfig31.connectionCustomizer = iConnectionCustomizer40;
        hikariConfig31.setJdbcUrl("HikariPool-38");
        com.zaxxer.hikari.HikariConfig hikariConfig44 = new com.zaxxer.hikari.HikariConfig();
        hikariConfig44.setMaxLifetime((long) (short) 10);
        com.zaxxer.hikari.HikariConfig hikariConfig47 = new com.zaxxer.hikari.HikariConfig();
        javax.sql.DataSource dataSource48 = hikariConfig47.getDataSource();
        hikariConfig47.setConnectionTestQuery("");
        hikariConfig47.setInitializationFailFast(false);
        long long53 = hikariConfig47.getConnectionTimeout();
        java.util.Properties properties54 = hikariConfig47.dataSourceProperties;
        hikariConfig44.dataSourceProperties = properties54;
        hikariConfig31.setDataSourceProperties(properties54);
        hikariConfig25.setDataSourceProperties(properties54);
        java.util.Properties properties58 = hikariConfig25.getDataSourceProperties();
        com.zaxxer.hikari.HikariConfig hikariConfig59 = new com.zaxxer.hikari.HikariConfig(properties58);
        hikariConfig7.dataSourceProperties = properties58;
        int int61 = hikariConfig7.getMaximumPoolSize();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
// flaky:         org.junit.Assert.assertTrue("'" + long5 + "' != '" + 100L + "'", long5 == 100L);
        org.junit.Assert.assertNull(dataSource8);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
// flaky:         org.junit.Assert.assertTrue("'" + long17 + "' != '" + 32L + "'", long17 == 32L);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "hi!" + "'", str21, "hi!");
// flaky:         org.junit.Assert.assertTrue("'" + long24 + "' != '" + (-1L) + "'", long24 == (-1L));
        org.junit.Assert.assertNull(str26);
        org.junit.Assert.assertNull(dataSource32);
        org.junit.Assert.assertNull(str39);
        org.junit.Assert.assertNull(dataSource48);
// flaky:         org.junit.Assert.assertTrue("'" + long53 + "' != '" + 32L + "'", long53 == 32L);
        org.junit.Assert.assertNotNull(properties54);
        org.junit.Assert.assertNotNull(properties58);
        org.junit.Assert.assertTrue("'" + int61 + "' != '" + 60 + "'", int61 == 60);
    }

    @Test
    public void test17449() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17449");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        java.lang.String str1 = hikariConfig0.getConnectionInitSql();
        long long2 = hikariConfig0.getLeakDetectionThreshold();
        hikariConfig0.leakDetectionThreshold = (-1);
        long long5 = hikariConfig0.acquireRetryDelay;
        hikariConfig0.setLeakDetectionThreshold((long) (byte) -1);
        hikariConfig0.setIdleTimeout(100L);
        long long10 = hikariConfig0.idleTimeout;
        hikariConfig0.maxPoolSize = (short) 100;
        boolean boolean13 = hikariConfig0.isRegisterMbeans;
        long long14 = hikariConfig0.connectionTimeout;
        hikariConfig0.isRegisterMbeans = false;
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
// flaky:         org.junit.Assert.assertTrue("'" + long5 + "' != '" + 100L + "'", long5 == 100L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 100L + "'", long10 == 100L);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
// flaky:         org.junit.Assert.assertTrue("'" + long14 + "' != '" + 32L + "'", long14 == 32L);
    }

    @Test
    public void test17450() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17450");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        javax.sql.DataSource dataSource1 = hikariConfig0.getDataSource();
        hikariConfig0.setConnectionTestQuery("");
        hikariConfig0.setInitializationFailFast(false);
        java.lang.String str6 = hikariConfig0.getConnectionInitSql();
        hikariConfig0.setMaximumPoolSize(10);
        hikariConfig0.jdbcUrl = "HikariPool-16";
        hikariConfig0.transactionIsolation = (short) 100;
        int int13 = hikariConfig0.transactionIsolation;
        hikariConfig0.setIdleTimeout(10L);
        java.lang.String str16 = hikariConfig0.getJdbcUrl();
        org.junit.Assert.assertNull(dataSource1);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 100 + "'", int13 == 100);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "HikariPool-16" + "'", str16, "HikariPool-16");
    }

    @Test
    public void test17451() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17451");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        int int1 = hikariConfig0.getTransactionIsolation();
        long long2 = hikariConfig0.leakDetectionThreshold;
        hikariConfig0.setMinimumPoolSize((int) (byte) 100);
        int int5 = hikariConfig0.acquireRetries;
        long long6 = hikariConfig0.getConnectionTimeout();
        hikariConfig0.setLeakDetectionThreshold(32L);
        hikariConfig0.setCatalog("HikariPool-1898");
        int int11 = hikariConfig0.maxPoolSize;
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 3 + "'", int5 == 3);
// flaky:         org.junit.Assert.assertTrue("'" + long6 + "' != '" + 32L + "'", long6 == 32L);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 60 + "'", int11 == 60);
    }

    @Test
    public void test17452() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17452");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        java.lang.String str1 = hikariConfig0.getConnectionInitSql();
        long long2 = hikariConfig0.getLeakDetectionThreshold();
        hikariConfig0.leakDetectionThreshold = (-1);
        int int5 = hikariConfig0.acquireIncrement;
        hikariConfig0.setPoolName("HikariPool-62");
        hikariConfig0.acquireRetryDelay = 0L;
        java.lang.String str10 = hikariConfig0.getCatalog();
        javax.sql.DataSource dataSource11 = hikariConfig0.getDataSource();
        hikariConfig0.setLeakDetectionThreshold((long) (short) 0);
        com.zaxxer.hikari.HikariConfig hikariConfig15 = new com.zaxxer.hikari.HikariConfig();
        java.lang.String str16 = hikariConfig15.getConnectionInitSql();
        long long17 = hikariConfig15.getLeakDetectionThreshold();
        hikariConfig15.leakDetectionThreshold = (-1);
        boolean boolean20 = hikariConfig15.isAutoCommit;
        java.lang.String str21 = hikariConfig15.jdbcUrl;
        long long22 = hikariConfig15.getConnectionTimeout();
        hikariConfig0.addDataSourceProperty("HikariPool-491", (java.lang.Object) long22);
        hikariConfig0.setJdbcUrl("HikariPool-1021");
        hikariConfig0.setLeakDetectionThreshold((long) 100);
        hikariConfig0.setLeakDetectionThreshold(10L);
        hikariConfig0.connectionTimeout = 60;
        hikariConfig0.acquireRetryDelay = 3L;
        java.lang.String str34 = hikariConfig0.catalog;
        hikariConfig0.setLeakDetectionThreshold((long) (short) 0);
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(dataSource11);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 0L + "'", long17 == 0L);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertNull(str21);
// flaky:         org.junit.Assert.assertTrue("'" + long22 + "' != '" + 32L + "'", long22 == 32L);
        org.junit.Assert.assertNull(str34);
    }

    @Test
    public void test17453() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17453");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        java.lang.String str1 = hikariConfig0.getConnectionInitSql();
        hikariConfig0.acquireIncrement = 0;
        long long4 = hikariConfig0.getLeakDetectionThreshold();
        long long5 = hikariConfig0.idleTimeout;
        boolean boolean6 = hikariConfig0.isInitializationFailFast;
        hikariConfig0.setCatalog("HikariPool-661");
        boolean boolean9 = hikariConfig0.isReadOnly();
        boolean boolean10 = hikariConfig0.isIsolateInternalQueries;
        hikariConfig0.isReadOnly = true;
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
// flaky:         org.junit.Assert.assertTrue("'" + long5 + "' != '" + (-1L) + "'", long5 == (-1L));
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test17454() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17454");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        javax.sql.DataSource dataSource1 = hikariConfig0.getDataSource();
        hikariConfig0.setConnectionTestQuery("");
        hikariConfig0.setInitializationFailFast(false);
        hikariConfig0.catalog = "";
        int int8 = hikariConfig0.getMaximumPoolSize();
        hikariConfig0.connectionTimeout = 10L;
        hikariConfig0.setJdbcUrl("HikariPool-47");
        hikariConfig0.setTransactionIsolation("HikariPool-73");
        hikariConfig0.setPoolName("HikariPool-417");
        hikariConfig0.setConnectionInitSql("HikariPool-318");
        hikariConfig0.catalog = "HikariPool-163";
        hikariConfig0.setJdbc4ConnectionTest(false);
        java.lang.String str23 = hikariConfig0.connectionInitSql;
        boolean boolean24 = hikariConfig0.isReadOnly;
        java.lang.String str25 = hikariConfig0.poolName;
        org.junit.Assert.assertNull(dataSource1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 60 + "'", int8 == 60);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "HikariPool-318" + "'", str23, "HikariPool-318");
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "HikariPool-417" + "'", str25, "HikariPool-417");
    }

    @Test
    public void test17455() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17455");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        java.lang.String str1 = hikariConfig0.getConnectionInitSql();
        long long2 = hikariConfig0.getLeakDetectionThreshold();
        com.zaxxer.hikari.IConnectionCustomizer iConnectionCustomizer3 = null;
        hikariConfig0.connectionCustomizer = iConnectionCustomizer3;
        boolean boolean5 = hikariConfig0.isIsolateInternalQueries();
        hikariConfig0.poolName = "HikariPool-47";
        java.lang.String str8 = hikariConfig0.transactionIsolationName;
        hikariConfig0.setInitializationFailFast(false);
        long long11 = hikariConfig0.leakDetectionThreshold;
        boolean boolean12 = hikariConfig0.isIsolateInternalQueries();
        hikariConfig0.isIsolateInternalQueries = false;
        hikariConfig0.acquireRetryDelay = 32;
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 0L + "'", long11 == 0L);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test17456() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17456");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        javax.sql.DataSource dataSource1 = hikariConfig0.getDataSource();
        hikariConfig0.setConnectionTestQuery("");
        hikariConfig0.connectionCustomizerClassName = "";
        hikariConfig0.setConnectionCustomizerClassName("hi!");
        java.lang.String str8 = hikariConfig0.getCatalog();
        boolean boolean9 = hikariConfig0.isRegisterMbeans;
        hikariConfig0.setAcquireRetries(0);
        hikariConfig0.setMaximumPoolSize((int) '#');
        hikariConfig0.setTransactionIsolation("hi!");
        hikariConfig0.setConnectionInitSql("hi!");
        hikariConfig0.setTransactionIsolation("HikariPool-101");
        int int20 = hikariConfig0.transactionIsolation;
        hikariConfig0.setInitializationFailFast(true);
        hikariConfig0.leakDetectionThreshold = (short) -1;
        long long25 = hikariConfig0.acquireRetryDelay;
        long long26 = hikariConfig0.getIdleTimeout();
        hikariConfig0.connectionInitSql = "HikariPool-25105";
        hikariConfig0.isAutoCommit = false;
        org.junit.Assert.assertNull(dataSource1);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
// flaky:         org.junit.Assert.assertTrue("'" + long25 + "' != '" + 100L + "'", long25 == 100L);
// flaky:         org.junit.Assert.assertTrue("'" + long26 + "' != '" + (-1L) + "'", long26 == (-1L));
    }

    @Test
    public void test17457() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17457");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        java.lang.String str1 = hikariConfig0.getConnectionInitSql();
        long long2 = hikariConfig0.getLeakDetectionThreshold();
        hikariConfig0.leakDetectionThreshold = (-1);
        long long5 = hikariConfig0.acquireRetryDelay;
        hikariConfig0.setLeakDetectionThreshold((long) (byte) -1);
        java.util.Properties properties8 = hikariConfig0.getDataSourceProperties();
        boolean boolean9 = hikariConfig0.isReadOnly();
        hikariConfig0.jdbcUrl = "HikariPool-29";
        java.lang.String str12 = hikariConfig0.getConnectionTestQuery();
        long long13 = hikariConfig0.getAcquireRetryDelay();
        long long14 = hikariConfig0.getConnectionTimeout();
        hikariConfig0.setDataSourceClassName("HikariPool-203");
        hikariConfig0.setMaximumPoolSize((int) (byte) 100);
        hikariConfig0.setMaxLifetime(60L);
        hikariConfig0.setInitializationFailFast(true);
        long long23 = hikariConfig0.idleTimeout;
        hikariConfig0.setReadOnly(false);
        hikariConfig0.setAutoCommit(false);
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
// flaky:         org.junit.Assert.assertTrue("'" + long5 + "' != '" + 100L + "'", long5 == 100L);
        org.junit.Assert.assertNotNull(properties8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(str12);
// flaky:         org.junit.Assert.assertTrue("'" + long13 + "' != '" + 100L + "'", long13 == 100L);
// flaky:         org.junit.Assert.assertTrue("'" + long14 + "' != '" + 32L + "'", long14 == 32L);
// flaky:         org.junit.Assert.assertTrue("'" + long23 + "' != '" + (-1L) + "'", long23 == (-1L));
    }

    @Test
    public void test17458() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17458");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        javax.sql.DataSource dataSource1 = hikariConfig0.getDataSource();
        hikariConfig0.setConnectionTestQuery("");
        hikariConfig0.setInitializationFailFast(false);
        long long6 = hikariConfig0.getConnectionTimeout();
        hikariConfig0.setJdbcUrl("HikariPool-47");
        hikariConfig0.setCatalog("HikariPool-135");
        com.zaxxer.hikari.HikariConfig hikariConfig11 = new com.zaxxer.hikari.HikariConfig();
        javax.sql.DataSource dataSource12 = hikariConfig11.getDataSource();
        hikariConfig11.setConnectionTestQuery("");
        hikariConfig11.connectionCustomizerClassName = "";
        hikariConfig11.setConnectionCustomizerClassName("hi!");
        java.lang.String str19 = hikariConfig11.getCatalog();
        boolean boolean20 = hikariConfig11.isRegisterMbeans;
        hikariConfig11.setAcquireRetries(0);
        hikariConfig11.setMaximumPoolSize((int) '#');
        hikariConfig11.setTransactionIsolation("hi!");
        boolean boolean27 = hikariConfig11.isInitializationFailFast();
        java.lang.String str28 = hikariConfig11.connectionInitSql;
        hikariConfig11.maxPoolSize = 0;
        java.util.Properties properties31 = hikariConfig11.getDataSourceProperties();
        hikariConfig0.dataSourceProperties = properties31;
        java.lang.String str33 = hikariConfig0.getPoolName();
        hikariConfig0.connectionInitSql = "HikariPool-1175";
        int int36 = hikariConfig0.acquireIncrement;
        java.lang.String str37 = hikariConfig0.getJdbcUrl();
        int int38 = hikariConfig0.acquireIncrement;
        long long39 = hikariConfig0.acquireRetryDelay;
        org.junit.Assert.assertNull(dataSource1);
// flaky:         org.junit.Assert.assertTrue("'" + long6 + "' != '" + 32L + "'", long6 == 32L);
        org.junit.Assert.assertNull(dataSource12);
        org.junit.Assert.assertNull(str19);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNull(str28);
        org.junit.Assert.assertNotNull(properties31);
// flaky:         org.junit.Assert.assertEquals("'" + str33 + "' != '" + "HikariPool-42826" + "'", str33, "HikariPool-42826");
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 1 + "'", int36 == 1);
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "HikariPool-47" + "'", str37, "HikariPool-47");
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 1 + "'", int38 == 1);
// flaky:         org.junit.Assert.assertTrue("'" + long39 + "' != '" + 100L + "'", long39 == 100L);
    }

    @Test
    public void test17459() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17459");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        java.lang.String str1 = hikariConfig0.getConnectionInitSql();
        hikariConfig0.acquireRetries = 10;
        hikariConfig0.setPoolName("HikariPool-111");
        javax.sql.DataSource dataSource6 = null;
        hikariConfig0.dataSource = dataSource6;
        hikariConfig0.isRegisterMbeans = false;
        java.lang.String str10 = hikariConfig0.getCatalog();
        java.lang.String str11 = hikariConfig0.getDataSourceClassName();
        hikariConfig0.isReadOnly = false;
        boolean boolean14 = hikariConfig0.isIsolateInternalQueries;
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test17460() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17460");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        javax.sql.DataSource dataSource1 = hikariConfig0.getDataSource();
        hikariConfig0.setConnectionTestQuery("");
        hikariConfig0.setInitializationFailFast(false);
        hikariConfig0.catalog = "";
        int int8 = hikariConfig0.getMaximumPoolSize();
        hikariConfig0.leakDetectionThreshold = (short) 10;
        hikariConfig0.isJdbc4connectionTest = true;
        boolean boolean13 = hikariConfig0.isReadOnly();
        java.lang.String str14 = hikariConfig0.getConnectionInitSql();
        boolean boolean15 = hikariConfig0.isJdbc4connectionTest;
        hikariConfig0.setIdleTimeout(1L);
        hikariConfig0.maxLifetime = 100L;
        hikariConfig0.setDataSourceClassName("HikariPool-880");
        hikariConfig0.setCatalog("HikariPool-145");
        boolean boolean24 = hikariConfig0.isReadOnly();
        hikariConfig0.setReadOnly(false);
        hikariConfig0.setConnectionTestQuery("HikariPool-959");
        org.junit.Assert.assertNull(dataSource1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 60 + "'", int8 == 60);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
    }

    @Test
    public void test17461() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17461");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        java.lang.String str1 = hikariConfig0.getConnectionInitSql();
        long long2 = hikariConfig0.getLeakDetectionThreshold();
        int int3 = hikariConfig0.getMaximumPoolSize();
        long long4 = hikariConfig0.getIdleTimeout();
        int int5 = hikariConfig0.maxPoolSize;
        java.lang.String str6 = hikariConfig0.getConnectionCustomizerClassName();
        hikariConfig0.setConnectionCustomizerClassName("HikariPool-127");
        int int9 = hikariConfig0.getAcquireIncrement();
        int int10 = hikariConfig0.maxPoolSize;
        hikariConfig0.setConnectionTimeout((long) (byte) 100);
        java.lang.String str13 = hikariConfig0.dataSourceClassName;
        hikariConfig0.setRegisterMbeans(true);
        boolean boolean16 = hikariConfig0.isJdbc4ConnectionTest();
        hikariConfig0.setIsolateInternalQueries(false);
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 60 + "'", int3 == 60);
// flaky:         org.junit.Assert.assertTrue("'" + long4 + "' != '" + (-1L) + "'", long4 == (-1L));
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 60 + "'", int5 == 60);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 60 + "'", int10 == 60);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
    }

    @Test
    public void test17462() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17462");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        javax.sql.DataSource dataSource1 = hikariConfig0.getDataSource();
        hikariConfig0.setConnectionTestQuery("");
        hikariConfig0.connectionCustomizerClassName = "";
        com.zaxxer.hikari.IConnectionCustomizer iConnectionCustomizer6 = hikariConfig0.connectionCustomizer;
        java.lang.String str7 = hikariConfig0.dataSourceClassName;
        hikariConfig0.setConnectionTestQuery("HikariPool-283");
        hikariConfig0.jdbcUrl = "HikariPool-485";
        hikariConfig0.setConnectionTestQuery("HikariPool-618");
        hikariConfig0.isJdbc4connectionTest = true;
        hikariConfig0.setLeakDetectionThreshold((long) (short) -1);
        java.lang.String str18 = hikariConfig0.poolName;
        org.junit.Assert.assertNull(dataSource1);
        org.junit.Assert.assertNull(iConnectionCustomizer6);
        org.junit.Assert.assertNull(str7);
// flaky:         org.junit.Assert.assertEquals("'" + str18 + "' != '" + "HikariPool-42832" + "'", str18, "HikariPool-42832");
    }

    @Test
    public void test17463() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17463");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        java.lang.String str1 = hikariConfig0.getConnectionInitSql();
        long long2 = hikariConfig0.getLeakDetectionThreshold();
        hikariConfig0.leakDetectionThreshold = (-1);
        long long5 = hikariConfig0.acquireRetryDelay;
        com.zaxxer.hikari.HikariConfig hikariConfig7 = new com.zaxxer.hikari.HikariConfig();
        javax.sql.DataSource dataSource8 = hikariConfig7.getDataSource();
        hikariConfig7.setConnectionTestQuery("");
        hikariConfig7.connectionCustomizerClassName = "";
        hikariConfig7.setConnectionCustomizerClassName("hi!");
        java.lang.String str15 = hikariConfig7.getCatalog();
        boolean boolean16 = hikariConfig7.isRegisterMbeans;
        long long17 = hikariConfig7.connectionTimeout;
        hikariConfig7.setConnectionInitSql("HikariPool-48");
        hikariConfig0.addDataSourceProperty("hi!", (java.lang.Object) hikariConfig7);
        hikariConfig0.setUseInstrumentation(false);
        java.lang.String str23 = hikariConfig0.getJdbcUrl();
        hikariConfig0.maxPoolSize = (short) 1;
        int int26 = hikariConfig0.getMinimumPoolSize();
        hikariConfig0.poolName = "HikariPool-2823";
        boolean boolean29 = hikariConfig0.isReadOnly();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
// flaky:         org.junit.Assert.assertTrue("'" + long5 + "' != '" + 100L + "'", long5 == 100L);
        org.junit.Assert.assertNull(dataSource8);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
// flaky:         org.junit.Assert.assertTrue("'" + long17 + "' != '" + 32L + "'", long17 == 32L);
        org.junit.Assert.assertNull(str23);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 10 + "'", int26 == 10);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
    }

    @Test
    public void test17464() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17464");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        javax.sql.DataSource dataSource1 = hikariConfig0.getDataSource();
        hikariConfig0.setConnectionTestQuery("");
        hikariConfig0.setInitializationFailFast(false);
        long long6 = hikariConfig0.getConnectionTimeout();
        java.util.Properties properties7 = hikariConfig0.dataSourceProperties;
        boolean boolean8 = hikariConfig0.isReadOnly;
        boolean boolean9 = hikariConfig0.isJdbc4ConnectionTest();
        hikariConfig0.setConnectionInitSql("HikariPool-2924");
        hikariConfig0.setConnectionTestQuery("HikariPool-3675");
        hikariConfig0.connectionCustomizerClassName = "HikariPool-110";
        javax.sql.DataSource dataSource16 = null;
        hikariConfig0.dataSource = dataSource16;
        java.util.Properties properties18 = hikariConfig0.dataSourceProperties;
        hikariConfig0.dataSourceClassName = "HikariPool-3043";
        org.junit.Assert.assertNull(dataSource1);
// flaky:         org.junit.Assert.assertTrue("'" + long6 + "' != '" + 32L + "'", long6 == 32L);
        org.junit.Assert.assertNotNull(properties7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(properties18);
    }

    @Test
    public void test17465() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17465");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        java.lang.String str1 = hikariConfig0.getConnectionInitSql();
        long long2 = hikariConfig0.getLeakDetectionThreshold();
        hikariConfig0.maxPoolSize = 35;
        java.lang.String str5 = hikariConfig0.getConnectionTestQuery();
        int int6 = hikariConfig0.minPoolSize;
        javax.sql.DataSource dataSource7 = hikariConfig0.getDataSource();
        java.lang.String str8 = hikariConfig0.connectionInitSql;
        java.lang.String str9 = hikariConfig0.connectionCustomizerClassName;
        java.lang.String str10 = hikariConfig0.connectionInitSql;
        java.util.Properties properties11 = hikariConfig0.getDataSourceProperties();
        java.lang.String str12 = hikariConfig0.connectionTestQuery;
        long long13 = hikariConfig0.acquireRetryDelay;
        hikariConfig0.setJdbc4ConnectionTest(true);
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertNull(dataSource7);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNotNull(properties11);
        org.junit.Assert.assertNull(str12);
// flaky:         org.junit.Assert.assertTrue("'" + long13 + "' != '" + 100L + "'", long13 == 100L);
    }

    @Test
    public void test17466() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17466");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        java.lang.String str1 = hikariConfig0.getConnectionInitSql();
        long long2 = hikariConfig0.getLeakDetectionThreshold();
        hikariConfig0.leakDetectionThreshold = (-1);
        boolean boolean5 = hikariConfig0.isAutoCommit;
        hikariConfig0.setJdbcUrl("HikariPool-29");
        boolean boolean8 = hikariConfig0.isIsolateInternalQueries();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test17467() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17467");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        javax.sql.DataSource dataSource1 = hikariConfig0.getDataSource();
        hikariConfig0.setConnectionTestQuery("");
        hikariConfig0.setInitializationFailFast(false);
        hikariConfig0.catalog = "";
        javax.sql.DataSource dataSource8 = null;
        hikariConfig0.dataSource = dataSource8;
        javax.sql.DataSource dataSource10 = null;
        hikariConfig0.dataSource = dataSource10;
        int int12 = hikariConfig0.maxPoolSize;
        long long13 = hikariConfig0.getIdleTimeout();
        javax.sql.DataSource dataSource14 = hikariConfig0.dataSource;
        hikariConfig0.catalog = "HikariPool-73";
        int int17 = hikariConfig0.getTransactionIsolation();
        long long18 = hikariConfig0.getAcquireRetryDelay();
        hikariConfig0.setCatalog("HikariPool-182");
        int int21 = hikariConfig0.getTransactionIsolation();
        org.junit.Assert.assertNull(dataSource1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 60 + "'", int12 == 60);
// flaky:         org.junit.Assert.assertTrue("'" + long13 + "' != '" + (-1L) + "'", long13 == (-1L));
        org.junit.Assert.assertNull(dataSource14);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
// flaky:         org.junit.Assert.assertTrue("'" + long18 + "' != '" + 100L + "'", long18 == 100L);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1) + "'", int21 == (-1));
    }

    @Test
    public void test17468() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17468");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        java.lang.String str1 = hikariConfig0.getConnectionInitSql();
        long long2 = hikariConfig0.getLeakDetectionThreshold();
        hikariConfig0.leakDetectionThreshold = (-1);
        long long5 = hikariConfig0.acquireRetryDelay;
        long long6 = hikariConfig0.getIdleTimeout();
        long long7 = hikariConfig0.leakDetectionThreshold;
        java.lang.String str8 = hikariConfig0.getCatalog();
        int int9 = hikariConfig0.getAcquireRetries();
        long long10 = hikariConfig0.getLeakDetectionThreshold();
        java.lang.String str11 = hikariConfig0.getJdbcUrl();
        hikariConfig0.isReadOnly = false;
        long long14 = hikariConfig0.connectionTimeout;
        boolean boolean15 = hikariConfig0.isReadOnly();
        hikariConfig0.transactionIsolationName = "HikariPool-22491";
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
// flaky:         org.junit.Assert.assertTrue("'" + long5 + "' != '" + 100L + "'", long5 == 100L);
// flaky:         org.junit.Assert.assertTrue("'" + long6 + "' != '" + (-1L) + "'", long6 == (-1L));
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + (-1L) + "'", long7 == (-1L));
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 3 + "'", int9 == 3);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + (-1L) + "'", long10 == (-1L));
        org.junit.Assert.assertNull(str11);
// flaky:         org.junit.Assert.assertTrue("'" + long14 + "' != '" + 32L + "'", long14 == 32L);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test17469() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17469");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        javax.sql.DataSource dataSource1 = hikariConfig0.getDataSource();
        hikariConfig0.setConnectionTestQuery("");
        hikariConfig0.connectionCustomizerClassName = "";
        hikariConfig0.setConnectionCustomizerClassName("hi!");
        java.lang.String str8 = hikariConfig0.getCatalog();
        java.util.Properties properties9 = hikariConfig0.dataSourceProperties;
        com.zaxxer.hikari.HikariConfig hikariConfig11 = new com.zaxxer.hikari.HikariConfig();
        java.lang.String str12 = hikariConfig11.getConnectionInitSql();
        long long13 = hikariConfig11.getLeakDetectionThreshold();
        hikariConfig11.leakDetectionThreshold = (-1);
        long long16 = hikariConfig11.acquireRetryDelay;
        boolean boolean17 = hikariConfig11.isRegisterMbeans;
        hikariConfig0.addDataSourceProperty("HikariPool-47", (java.lang.Object) boolean17);
        int int19 = hikariConfig0.acquireRetries;
        hikariConfig0.idleTimeout = 97L;
        hikariConfig0.setLeakDetectionThreshold((long) ' ');
        hikariConfig0.connectionCustomizerClassName = "HikariPool-318";
        java.lang.String str26 = hikariConfig0.dataSourceClassName;
        hikariConfig0.setRegisterMbeans(false);
        hikariConfig0.setIdleTimeout((long) (byte) 10);
        java.lang.String str31 = hikariConfig0.connectionInitSql;
        java.lang.Class<?> wildcardClass32 = hikariConfig0.getClass();
        org.junit.Assert.assertNull(dataSource1);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNotNull(properties9);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 0L + "'", long13 == 0L);
// flaky:         org.junit.Assert.assertTrue("'" + long16 + "' != '" + 100L + "'", long16 == 100L);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 3 + "'", int19 == 3);
        org.junit.Assert.assertNull(str26);
        org.junit.Assert.assertNull(str31);
        org.junit.Assert.assertNotNull(wildcardClass32);
    }

    @Test
    public void test17470() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17470");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        javax.sql.DataSource dataSource1 = hikariConfig0.getDataSource();
        hikariConfig0.setConnectionTestQuery("");
        hikariConfig0.connectionCustomizerClassName = "";
        hikariConfig0.setConnectionCustomizerClassName("hi!");
        java.lang.String str8 = hikariConfig0.getCatalog();
        boolean boolean9 = hikariConfig0.isRegisterMbeans;
        hikariConfig0.setAcquireRetries(0);
        hikariConfig0.setMaximumPoolSize((int) '#');
        hikariConfig0.setTransactionIsolation("hi!");
        boolean boolean16 = hikariConfig0.isInitializationFailFast();
        long long17 = hikariConfig0.getMaxLifetime();
        boolean boolean18 = hikariConfig0.isAutoCommit();
        // The following exception was thrown during execution in test generation
        try {
            hikariConfig0.setDriverClassName("HikariPool-19319");
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException; message: driverClassName specified class 'HikariPool-19319' could not be loaded");
        } catch (java.lang.RuntimeException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(dataSource1);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
// flaky:         org.junit.Assert.assertTrue("'" + long17 + "' != '" + 32L + "'", long17 == 32L);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
    }

    @Test
    public void test17471() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17471");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        java.lang.String str1 = hikariConfig0.getConnectionInitSql();
        long long2 = hikariConfig0.getLeakDetectionThreshold();
        com.zaxxer.hikari.IConnectionCustomizer iConnectionCustomizer3 = null;
        hikariConfig0.connectionCustomizer = iConnectionCustomizer3;
        boolean boolean5 = hikariConfig0.isIsolateInternalQueries();
        boolean boolean6 = hikariConfig0.isJdbc4connectionTest;
        java.lang.String str7 = hikariConfig0.poolName;
        com.zaxxer.hikari.HikariConfig hikariConfig8 = new com.zaxxer.hikari.HikariConfig();
        javax.sql.DataSource dataSource9 = hikariConfig8.getDataSource();
        hikariConfig8.setConnectionTestQuery("");
        hikariConfig8.connectionCustomizerClassName = "";
        hikariConfig8.setConnectionCustomizerClassName("hi!");
        java.lang.String str16 = hikariConfig8.getCatalog();
        java.util.Properties properties17 = hikariConfig8.dataSourceProperties;
        com.zaxxer.hikari.HikariConfig hikariConfig19 = new com.zaxxer.hikari.HikariConfig();
        java.lang.String str20 = hikariConfig19.getConnectionInitSql();
        long long21 = hikariConfig19.getLeakDetectionThreshold();
        hikariConfig19.leakDetectionThreshold = (-1);
        long long24 = hikariConfig19.acquireRetryDelay;
        boolean boolean25 = hikariConfig19.isRegisterMbeans;
        hikariConfig8.addDataSourceProperty("HikariPool-47", (java.lang.Object) boolean25);
        java.util.Properties properties27 = hikariConfig8.getDataSourceProperties();
        hikariConfig8.transactionIsolationName = "HikariPool-18";
        java.util.Properties properties30 = hikariConfig8.getDataSourceProperties();
        javax.sql.DataSource dataSource31 = hikariConfig8.getDataSource();
        java.lang.String str32 = hikariConfig8.getDataSourceClassName();
        com.zaxxer.hikari.HikariConfig hikariConfig33 = new com.zaxxer.hikari.HikariConfig();
        javax.sql.DataSource dataSource34 = hikariConfig33.getDataSource();
        hikariConfig33.setConnectionTestQuery("");
        java.lang.String str37 = hikariConfig33.catalog;
        java.util.Properties properties38 = hikariConfig33.dataSourceProperties;
        hikariConfig8.dataSourceProperties = properties38;
        com.zaxxer.hikari.HikariConfig hikariConfig40 = new com.zaxxer.hikari.HikariConfig(properties38);
        hikariConfig0.setDataSourceProperties(properties38);
        boolean boolean42 = hikariConfig0.isReadOnly;
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "HikariPool-42844" + "'", str7, "HikariPool-42844");
        org.junit.Assert.assertNull(dataSource9);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertNotNull(properties17);
        org.junit.Assert.assertNull(str20);
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + 0L + "'", long21 == 0L);
// flaky:         org.junit.Assert.assertTrue("'" + long24 + "' != '" + 100L + "'", long24 == 100L);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNotNull(properties27);
        org.junit.Assert.assertNotNull(properties30);
        org.junit.Assert.assertNull(dataSource31);
        org.junit.Assert.assertNull(str32);
        org.junit.Assert.assertNull(dataSource34);
        org.junit.Assert.assertNull(str37);
        org.junit.Assert.assertNotNull(properties38);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
    }

    @Test
    public void test17472() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17472");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        javax.sql.DataSource dataSource1 = hikariConfig0.getDataSource();
        hikariConfig0.setConnectionTestQuery("");
        hikariConfig0.connectionCustomizerClassName = "";
        hikariConfig0.setConnectionCustomizerClassName("hi!");
        java.lang.String str8 = hikariConfig0.getCatalog();
        boolean boolean9 = hikariConfig0.isRegisterMbeans;
        hikariConfig0.setAcquireRetries(0);
        hikariConfig0.setMaximumPoolSize((int) '#');
        hikariConfig0.setTransactionIsolation("hi!");
        hikariConfig0.setConnectionInitSql("hi!");
        hikariConfig0.setCatalog("HikariPool-38");
        hikariConfig0.isIsolateInternalQueries = false;
        hikariConfig0.setPoolName("hi!");
        java.lang.String str24 = hikariConfig0.getConnectionInitSql();
        hikariConfig0.isIsolateInternalQueries = true;
        org.junit.Assert.assertNull(dataSource1);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "hi!" + "'", str24, "hi!");
    }

    @Test
    public void test17473() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17473");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        javax.sql.DataSource dataSource1 = hikariConfig0.getDataSource();
        hikariConfig0.setConnectionTestQuery("");
        hikariConfig0.connectionCustomizerClassName = "";
        hikariConfig0.setConnectionCustomizerClassName("hi!");
        java.lang.String str8 = hikariConfig0.getCatalog();
        java.util.Properties properties9 = hikariConfig0.dataSourceProperties;
        com.zaxxer.hikari.HikariConfig hikariConfig11 = new com.zaxxer.hikari.HikariConfig();
        java.lang.String str12 = hikariConfig11.getConnectionInitSql();
        long long13 = hikariConfig11.getLeakDetectionThreshold();
        hikariConfig11.leakDetectionThreshold = (-1);
        long long16 = hikariConfig11.acquireRetryDelay;
        boolean boolean17 = hikariConfig11.isRegisterMbeans;
        hikariConfig0.addDataSourceProperty("HikariPool-47", (java.lang.Object) boolean17);
        int int19 = hikariConfig0.acquireRetries;
        hikariConfig0.idleTimeout = 97L;
        hikariConfig0.setLeakDetectionThreshold((long) ' ');
        hikariConfig0.connectionCustomizerClassName = "HikariPool-318";
        hikariConfig0.setJdbcUrl("HikariPool-1173");
        hikariConfig0.jdbcUrl = "HikariPool-383";
        hikariConfig0.setIdleTimeout((long) (byte) 10);
        org.junit.Assert.assertNull(dataSource1);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNotNull(properties9);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 0L + "'", long13 == 0L);
// flaky:         org.junit.Assert.assertTrue("'" + long16 + "' != '" + 100L + "'", long16 == 100L);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 3 + "'", int19 == 3);
    }

    @Test
    public void test17474() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17474");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        java.lang.String str1 = hikariConfig0.getConnectionInitSql();
        long long2 = hikariConfig0.getLeakDetectionThreshold();
        int int3 = hikariConfig0.getMaximumPoolSize();
        java.lang.String str4 = hikariConfig0.connectionCustomizerClassName;
        hikariConfig0.minPoolSize = (byte) 100;
        boolean boolean7 = hikariConfig0.isInitializationFailFast;
        hikariConfig0.connectionCustomizerClassName = "HikariPool-536";
        java.lang.String str10 = hikariConfig0.getConnectionInitSql();
        long long11 = hikariConfig0.getAcquireRetryDelay();
        hikariConfig0.setTransactionIsolation("HikariPool-3102");
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 60 + "'", int3 == 60);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(str10);
// flaky:         org.junit.Assert.assertTrue("'" + long11 + "' != '" + 100L + "'", long11 == 100L);
    }

    @Test
    public void test17475() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17475");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        java.lang.String str1 = hikariConfig0.getConnectionInitSql();
        long long2 = hikariConfig0.getLeakDetectionThreshold();
        hikariConfig0.leakDetectionThreshold = (-1);
        long long5 = hikariConfig0.acquireRetryDelay;
        hikariConfig0.setLeakDetectionThreshold((long) (byte) -1);
        java.util.Properties properties8 = hikariConfig0.getDataSourceProperties();
        java.lang.String str9 = hikariConfig0.connectionInitSql;
        boolean boolean10 = hikariConfig0.isIsolateInternalQueries;
        hikariConfig0.setConnectionInitSql("HikariPool-2811");
        long long13 = hikariConfig0.acquireRetryDelay;
        hikariConfig0.minPoolSize = (byte) 0;
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
// flaky:         org.junit.Assert.assertTrue("'" + long5 + "' != '" + 100L + "'", long5 == 100L);
        org.junit.Assert.assertNotNull(properties8);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
// flaky:         org.junit.Assert.assertTrue("'" + long13 + "' != '" + 100L + "'", long13 == 100L);
    }

    @Test
    public void test17476() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17476");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        java.lang.String str1 = hikariConfig0.getConnectionInitSql();
        long long2 = hikariConfig0.getLeakDetectionThreshold();
        hikariConfig0.maxPoolSize = 35;
        java.lang.String str5 = hikariConfig0.getConnectionTestQuery();
        int int6 = hikariConfig0.minPoolSize;
        javax.sql.DataSource dataSource7 = hikariConfig0.getDataSource();
        int int8 = hikariConfig0.getAcquireRetries();
        java.lang.String str9 = hikariConfig0.getCatalog();
        int int10 = hikariConfig0.getAcquireIncrement();
        boolean boolean11 = hikariConfig0.isInitializationFailFast;
        java.lang.String str12 = hikariConfig0.getCatalog();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertNull(dataSource7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 3 + "'", int8 == 3);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNull(str12);
    }

    @Test
    public void test17477() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17477");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        javax.sql.DataSource dataSource1 = hikariConfig0.getDataSource();
        hikariConfig0.setConnectionTestQuery("");
        hikariConfig0.connectionCustomizerClassName = "";
        hikariConfig0.setConnectionCustomizerClassName("hi!");
        java.lang.String str8 = hikariConfig0.getCatalog();
        java.util.Properties properties9 = hikariConfig0.dataSourceProperties;
        int int10 = hikariConfig0.minPoolSize;
        long long11 = hikariConfig0.getMaxLifetime();
        long long12 = hikariConfig0.acquireRetryDelay;
        hikariConfig0.setMinimumPoolSize((int) (byte) 10);
        hikariConfig0.setUseInstrumentation(true);
        org.junit.Assert.assertNull(dataSource1);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNotNull(properties9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 10 + "'", int10 == 10);
// flaky:         org.junit.Assert.assertTrue("'" + long11 + "' != '" + 32L + "'", long11 == 32L);
// flaky:         org.junit.Assert.assertTrue("'" + long12 + "' != '" + 100L + "'", long12 == 100L);
    }

    @Test
    public void test17478() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17478");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        java.lang.String str1 = hikariConfig0.getConnectionInitSql();
        long long2 = hikariConfig0.getLeakDetectionThreshold();
        com.zaxxer.hikari.IConnectionCustomizer iConnectionCustomizer3 = null;
        hikariConfig0.connectionCustomizer = iConnectionCustomizer3;
        hikariConfig0.acquireRetries = 0;
        int int7 = hikariConfig0.acquireIncrement;
        boolean boolean8 = hikariConfig0.isRegisterMbeans;
        hikariConfig0.setJdbc4ConnectionTest(false);
        hikariConfig0.setConnectionTestQuery("");
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test17479() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17479");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        java.lang.String str1 = hikariConfig0.getConnectionInitSql();
        hikariConfig0.acquireRetries = 10;
        hikariConfig0.setPoolName("HikariPool-111");
        javax.sql.DataSource dataSource6 = null;
        hikariConfig0.dataSource = dataSource6;
        long long8 = hikariConfig0.leakDetectionThreshold;
        hikariConfig0.connectionInitSql = "HikariPool-4162";
        hikariConfig0.jdbcUrl = "HikariPool-20410";
        hikariConfig0.setMaxLifetime((long) 'a');
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
    }

    @Test
    public void test17480() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17480");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        java.lang.String str1 = hikariConfig0.getConnectionInitSql();
        long long2 = hikariConfig0.getLeakDetectionThreshold();
        int int3 = hikariConfig0.getMaximumPoolSize();
        long long4 = hikariConfig0.getConnectionTimeout();
        long long5 = hikariConfig0.getMaxLifetime();
        int int6 = hikariConfig0.transactionIsolation;
        hikariConfig0.isRegisterMbeans = false;
        java.lang.String str9 = hikariConfig0.getDataSourceClassName();
        hikariConfig0.isAutoCommit = false;
        hikariConfig0.transactionIsolation = 35;
        hikariConfig0.jdbcUrl = "HikariPool-5251";
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 60 + "'", int3 == 60);
// flaky:         org.junit.Assert.assertTrue("'" + long4 + "' != '" + 32L + "'", long4 == 32L);
// flaky:         org.junit.Assert.assertTrue("'" + long5 + "' != '" + 32L + "'", long5 == 32L);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertNull(str9);
    }

    @Test
    public void test17481() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17481");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        javax.sql.DataSource dataSource1 = hikariConfig0.getDataSource();
        hikariConfig0.setConnectionTestQuery("");
        hikariConfig0.setInitializationFailFast(false);
        hikariConfig0.catalog = "";
        int int8 = hikariConfig0.getMaximumPoolSize();
        hikariConfig0.leakDetectionThreshold = (short) 10;
        hikariConfig0.isJdbc4connectionTest = true;
        boolean boolean13 = hikariConfig0.isReadOnly();
        java.lang.String str14 = hikariConfig0.getConnectionInitSql();
        long long15 = hikariConfig0.acquireRetryDelay;
        boolean boolean16 = hikariConfig0.isReadOnly();
        long long17 = hikariConfig0.getMaxLifetime();
        hikariConfig0.poolName = "HikariPool-21303";
        org.junit.Assert.assertNull(dataSource1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 60 + "'", int8 == 60);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNull(str14);
// flaky:         org.junit.Assert.assertTrue("'" + long15 + "' != '" + 100L + "'", long15 == 100L);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
// flaky:         org.junit.Assert.assertTrue("'" + long17 + "' != '" + 32L + "'", long17 == 32L);
    }

    @Test
    public void test17482() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17482");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        java.lang.String str1 = hikariConfig0.getConnectionInitSql();
        long long2 = hikariConfig0.getLeakDetectionThreshold();
        int int3 = hikariConfig0.getMaximumPoolSize();
        long long4 = hikariConfig0.getIdleTimeout();
        hikariConfig0.isAutoCommit = false;
        java.lang.String str7 = hikariConfig0.getJdbcUrl();
        hikariConfig0.setConnectionInitSql("HikariPool-2378");
        hikariConfig0.setInitializationFailFast(true);
        java.lang.String str12 = hikariConfig0.getCatalog();
        hikariConfig0.minPoolSize = (byte) 100;
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 60 + "'", int3 == 60);
// flaky:         org.junit.Assert.assertTrue("'" + long4 + "' != '" + (-1L) + "'", long4 == (-1L));
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str12);
    }

    @Test
    public void test17483() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17483");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        java.lang.String str1 = hikariConfig0.getConnectionInitSql();
        hikariConfig0.acquireIncrement = 0;
        hikariConfig0.connectionTimeout = 10;
        boolean boolean6 = hikariConfig0.isIsolateInternalQueries();
        hikariConfig0.setReadOnly(false);
        int int9 = hikariConfig0.transactionIsolation;
        javax.sql.DataSource dataSource10 = null;
        hikariConfig0.setDataSource(dataSource10);
        hikariConfig0.connectionTestQuery = "HikariPool-213";
        hikariConfig0.setInitializationFailFast(false);
        hikariConfig0.isInitializationFailFast = false;
        hikariConfig0.isReadOnly = true;
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
    }

    @Test
    public void test17484() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17484");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        javax.sql.DataSource dataSource1 = hikariConfig0.getDataSource();
        hikariConfig0.setConnectionTestQuery("");
        hikariConfig0.connectionCustomizerClassName = "";
        com.zaxxer.hikari.IConnectionCustomizer iConnectionCustomizer6 = hikariConfig0.connectionCustomizer;
        hikariConfig0.acquireRetries = (byte) 100;
        hikariConfig0.setRegisterMbeans(true);
        int int11 = hikariConfig0.getMinimumPoolSize();
        hikariConfig0.setRegisterMbeans(true);
        com.zaxxer.hikari.HikariConfig hikariConfig15 = new com.zaxxer.hikari.HikariConfig();
        java.lang.String str16 = hikariConfig15.getConnectionInitSql();
        long long17 = hikariConfig15.getLeakDetectionThreshold();
        hikariConfig15.leakDetectionThreshold = (-1);
        int int20 = hikariConfig15.acquireIncrement;
        hikariConfig15.setInitializationFailFast(true);
        java.lang.String str23 = hikariConfig15.getPoolName();
        boolean boolean24 = hikariConfig15.isJdbc4ConnectionTest();
        int int25 = hikariConfig15.getMaximumPoolSize();
        hikariConfig0.addDataSourceProperty("HikariPool-4128", (java.lang.Object) hikariConfig15);
        hikariConfig15.setJdbcUrl("HikariPool-3736");
        org.junit.Assert.assertNull(dataSource1);
        org.junit.Assert.assertNull(iConnectionCustomizer6);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 10 + "'", int11 == 10);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 0L + "'", long17 == 0L);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 1 + "'", int20 == 1);
// flaky:         org.junit.Assert.assertEquals("'" + str23 + "' != '" + "HikariPool-42871" + "'", str23, "HikariPool-42871");
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 60 + "'", int25 == 60);
    }

    @Test
    public void test17485() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17485");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        javax.sql.DataSource dataSource1 = hikariConfig0.getDataSource();
        hikariConfig0.setConnectionTestQuery("");
        hikariConfig0.connectionCustomizerClassName = "";
        hikariConfig0.setConnectionCustomizerClassName("hi!");
        java.lang.String str8 = hikariConfig0.getCatalog();
        java.util.Properties properties9 = hikariConfig0.dataSourceProperties;
        hikariConfig0.acquireRetryDelay = 35;
        com.zaxxer.hikari.HikariConfig hikariConfig12 = new com.zaxxer.hikari.HikariConfig();
        javax.sql.DataSource dataSource13 = hikariConfig12.getDataSource();
        hikariConfig12.setConnectionTestQuery("");
        hikariConfig12.connectionCustomizerClassName = "";
        hikariConfig12.setConnectionCustomizerClassName("hi!");
        java.lang.String str20 = hikariConfig12.getCatalog();
        boolean boolean21 = hikariConfig12.isRegisterMbeans;
        hikariConfig12.setAcquireRetries(0);
        long long24 = hikariConfig12.getMaxLifetime();
        hikariConfig12.setReadOnly(false);
        com.zaxxer.hikari.HikariConfig hikariConfig27 = new com.zaxxer.hikari.HikariConfig();
        javax.sql.DataSource dataSource28 = hikariConfig27.getDataSource();
        hikariConfig27.setConnectionTestQuery("");
        hikariConfig27.setInitializationFailFast(false);
        hikariConfig27.catalog = "";
        com.zaxxer.hikari.HikariConfig hikariConfig35 = new com.zaxxer.hikari.HikariConfig();
        javax.sql.DataSource dataSource36 = hikariConfig35.getDataSource();
        hikariConfig35.setConnectionTestQuery("");
        hikariConfig35.connectionCustomizerClassName = "";
        hikariConfig35.setConnectionCustomizerClassName("hi!");
        java.lang.String str43 = hikariConfig35.getCatalog();
        java.util.Properties properties44 = hikariConfig35.dataSourceProperties;
        hikariConfig27.dataSourceProperties = properties44;
        hikariConfig12.setDataSourceProperties(properties44);
        hikariConfig0.setDataSourceProperties(properties44);
        hikariConfig0.transactionIsolationName = "HikariPool-97";
        java.lang.String str50 = hikariConfig0.poolName;
        hikariConfig0.setConnectionCustomizerClassName("HikariPool-361");
        javax.sql.DataSource dataSource53 = hikariConfig0.dataSource;
        hikariConfig0.isRegisterMbeans = true;
        hikariConfig0.setAcquireRetries((int) (short) 100);
        java.lang.String str58 = hikariConfig0.getCatalog();
        java.lang.String str59 = hikariConfig0.getConnectionTestQuery();
        org.junit.Assert.assertNull(dataSource1);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNotNull(properties9);
        org.junit.Assert.assertNull(dataSource13);
        org.junit.Assert.assertNull(str20);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
// flaky:         org.junit.Assert.assertTrue("'" + long24 + "' != '" + 32L + "'", long24 == 32L);
        org.junit.Assert.assertNull(dataSource28);
        org.junit.Assert.assertNull(dataSource36);
        org.junit.Assert.assertNull(str43);
        org.junit.Assert.assertNotNull(properties44);
// flaky:         org.junit.Assert.assertEquals("'" + str50 + "' != '" + "HikariPool-42872" + "'", str50, "HikariPool-42872");
        org.junit.Assert.assertNull(dataSource53);
        org.junit.Assert.assertNull(str58);
        org.junit.Assert.assertEquals("'" + str59 + "' != '" + "" + "'", str59, "");
    }

    @Test
    public void test17486() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17486");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        hikariConfig0.setMaxLifetime((long) (short) 10);
        com.zaxxer.hikari.IConnectionCustomizer iConnectionCustomizer3 = hikariConfig0.connectionCustomizer;
        hikariConfig0.setDataSourceClassName("HikariPool-47");
        hikariConfig0.setDataSourceClassName("HikariPool-18");
        boolean boolean8 = hikariConfig0.isRegisterMbeans();
        long long9 = hikariConfig0.getAcquireRetryDelay();
        hikariConfig0.setLeakDetectionThreshold((long) (short) -1);
        int int12 = hikariConfig0.acquireIncrement;
        hikariConfig0.setTransactionIsolation("HikariPool-11541");
        org.junit.Assert.assertNull(iConnectionCustomizer3);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
// flaky:         org.junit.Assert.assertTrue("'" + long9 + "' != '" + 100L + "'", long9 == 100L);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
    }

    @Test
    public void test17487() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17487");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        javax.sql.DataSource dataSource1 = hikariConfig0.getDataSource();
        hikariConfig0.setConnectionTestQuery("");
        hikariConfig0.setInitializationFailFast(false);
        long long6 = hikariConfig0.getConnectionTimeout();
        hikariConfig0.setJdbcUrl("HikariPool-47");
        hikariConfig0.isIsolateInternalQueries = false;
        boolean boolean11 = hikariConfig0.isRegisterMbeans();
        long long12 = hikariConfig0.leakDetectionThreshold;
        java.lang.String str13 = hikariConfig0.connectionTestQuery;
        hikariConfig0.acquireRetryDelay = (byte) 10;
        org.junit.Assert.assertNull(dataSource1);
// flaky:         org.junit.Assert.assertTrue("'" + long6 + "' != '" + 32L + "'", long6 == 32L);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
    }

    @Test
    public void test17488() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17488");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        java.lang.String str1 = hikariConfig0.getConnectionInitSql();
        hikariConfig0.acquireIncrement = 0;
        hikariConfig0.maxLifetime = 100;
        long long6 = hikariConfig0.acquireRetryDelay;
        hikariConfig0.dataSourceClassName = "HikariPool-25";
        hikariConfig0.maxPoolSize = 3;
        int int11 = hikariConfig0.getMinimumPoolSize();
        hikariConfig0.acquireIncrement = (short) 100;
        hikariConfig0.setUseInstrumentation(true);
        hikariConfig0.transactionIsolation = (byte) 0;
        java.lang.String str18 = hikariConfig0.jdbcUrl;
        boolean boolean19 = hikariConfig0.isInitializationFailFast;
        boolean boolean20 = hikariConfig0.isIsolateInternalQueries();
        java.lang.String str21 = hikariConfig0.connectionTestQuery;
        org.junit.Assert.assertNull(str1);
// flaky:         org.junit.Assert.assertTrue("'" + long6 + "' != '" + 100L + "'", long6 == 100L);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 10 + "'", int11 == 10);
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNull(str21);
    }

    @Test
    public void test17489() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17489");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        java.lang.String str1 = hikariConfig0.getConnectionInitSql();
        long long2 = hikariConfig0.getLeakDetectionThreshold();
        int int3 = hikariConfig0.getMaximumPoolSize();
        long long4 = hikariConfig0.leakDetectionThreshold;
        hikariConfig0.setInitializationFailFast(true);
        hikariConfig0.setUseInstrumentation(false);
        hikariConfig0.setConnectionCustomizerClassName("HikariPool-25");
        hikariConfig0.setMaxLifetime(5000L);
        long long13 = hikariConfig0.acquireRetryDelay;
        hikariConfig0.isRegisterMbeans = true;
        hikariConfig0.acquireRetryDelay = (-1);
        hikariConfig0.isInitializationFailFast = false;
        java.lang.String str20 = hikariConfig0.getDataSourceClassName();
        int int21 = hikariConfig0.getTransactionIsolation();
        javax.sql.DataSource dataSource22 = null;
        hikariConfig0.setDataSource(dataSource22);
        java.lang.String str24 = hikariConfig0.dataSourceClassName;
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 60 + "'", int3 == 60);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
// flaky:         org.junit.Assert.assertTrue("'" + long13 + "' != '" + 100L + "'", long13 == 100L);
        org.junit.Assert.assertNull(str20);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1) + "'", int21 == (-1));
        org.junit.Assert.assertNull(str24);
    }

    @Test
    public void test17490() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17490");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        javax.sql.DataSource dataSource1 = hikariConfig0.getDataSource();
        hikariConfig0.setConnectionTestQuery("");
        hikariConfig0.setInitializationFailFast(false);
        hikariConfig0.catalog = "";
        int int8 = hikariConfig0.getMaximumPoolSize();
        hikariConfig0.poolName = "HikariPool-73";
        long long11 = hikariConfig0.connectionTimeout;
        hikariConfig0.setConnectionCustomizerClassName("HikariPool-137");
        java.lang.String str14 = hikariConfig0.connectionInitSql;
        hikariConfig0.connectionTimeout = 60;
        hikariConfig0.setTransactionIsolation("HikariPool-888");
        hikariConfig0.transactionIsolation = (short) 100;
        boolean boolean21 = hikariConfig0.isIsolateInternalQueries();
        boolean boolean22 = hikariConfig0.isIsolateInternalQueries;
        org.junit.Assert.assertNull(dataSource1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 60 + "'", int8 == 60);
// flaky:         org.junit.Assert.assertTrue("'" + long11 + "' != '" + 32L + "'", long11 == 32L);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
    }

    @Test
    public void test17491() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17491");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        javax.sql.DataSource dataSource1 = hikariConfig0.getDataSource();
        hikariConfig0.idleTimeout = 3;
        hikariConfig0.setLeakDetectionThreshold(52L);
        int int6 = hikariConfig0.minPoolSize;
        hikariConfig0.transactionIsolationName = "";
        hikariConfig0.jdbcUrl = "HikariPool-3298";
        hikariConfig0.setJdbcUrl("HikariPool-1820");
        hikariConfig0.setConnectionCustomizerClassName("HikariPool-1959");
        org.junit.Assert.assertNull(dataSource1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
    }

    @Test
    public void test17492() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17492");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        javax.sql.DataSource dataSource1 = hikariConfig0.getDataSource();
        hikariConfig0.setConnectionTestQuery("");
        hikariConfig0.connectionCustomizerClassName = "";
        hikariConfig0.setConnectionCustomizerClassName("hi!");
        java.lang.String str8 = hikariConfig0.getCatalog();
        com.zaxxer.hikari.IConnectionCustomizer iConnectionCustomizer9 = null;
        hikariConfig0.connectionCustomizer = iConnectionCustomizer9;
        hikariConfig0.connectionTimeout = 100L;
        java.lang.String str13 = hikariConfig0.connectionInitSql;
        hikariConfig0.poolName = "HikariPool-931";
        boolean boolean16 = hikariConfig0.isReadOnly();
        hikariConfig0.setRegisterMbeans(false);
        hikariConfig0.setAcquireRetryDelay(10L);
        int int21 = hikariConfig0.getAcquireRetries();
        org.junit.Assert.assertNull(dataSource1);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 3 + "'", int21 == 3);
    }

    @Test
    public void test17493() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17493");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        javax.sql.DataSource dataSource1 = hikariConfig0.getDataSource();
        hikariConfig0.setConnectionTestQuery("");
        hikariConfig0.connectionCustomizerClassName = "";
        hikariConfig0.setConnectionCustomizerClassName("hi!");
        java.lang.String str8 = hikariConfig0.getCatalog();
        boolean boolean9 = hikariConfig0.isRegisterMbeans;
        hikariConfig0.setAcquireRetries(0);
        long long12 = hikariConfig0.getMaxLifetime();
        hikariConfig0.setReadOnly(false);
        com.zaxxer.hikari.HikariConfig hikariConfig15 = new com.zaxxer.hikari.HikariConfig();
        javax.sql.DataSource dataSource16 = hikariConfig15.getDataSource();
        hikariConfig15.setConnectionTestQuery("");
        hikariConfig15.setInitializationFailFast(false);
        hikariConfig15.catalog = "";
        com.zaxxer.hikari.HikariConfig hikariConfig23 = new com.zaxxer.hikari.HikariConfig();
        javax.sql.DataSource dataSource24 = hikariConfig23.getDataSource();
        hikariConfig23.setConnectionTestQuery("");
        hikariConfig23.connectionCustomizerClassName = "";
        hikariConfig23.setConnectionCustomizerClassName("hi!");
        java.lang.String str31 = hikariConfig23.getCatalog();
        java.util.Properties properties32 = hikariConfig23.dataSourceProperties;
        hikariConfig15.dataSourceProperties = properties32;
        hikariConfig0.setDataSourceProperties(properties32);
        com.zaxxer.hikari.IConnectionCustomizer iConnectionCustomizer35 = null;
        hikariConfig0.connectionCustomizer = iConnectionCustomizer35;
        long long37 = hikariConfig0.getIdleTimeout();
        hikariConfig0.setIdleTimeout(32L);
        hikariConfig0.maxLifetime = 'a';
        hikariConfig0.jdbcUrl = "HikariPool-179";
        hikariConfig0.setConnectionInitSql("HikariPool-6163");
        org.junit.Assert.assertNull(dataSource1);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
// flaky:         org.junit.Assert.assertTrue("'" + long12 + "' != '" + 32L + "'", long12 == 32L);
        org.junit.Assert.assertNull(dataSource16);
        org.junit.Assert.assertNull(dataSource24);
        org.junit.Assert.assertNull(str31);
        org.junit.Assert.assertNotNull(properties32);
// flaky:         org.junit.Assert.assertTrue("'" + long37 + "' != '" + (-1L) + "'", long37 == (-1L));
    }

    @Test
    public void test17494() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17494");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        hikariConfig0.setMaxLifetime((long) (short) 10);
        com.zaxxer.hikari.HikariConfig hikariConfig3 = new com.zaxxer.hikari.HikariConfig();
        javax.sql.DataSource dataSource4 = hikariConfig3.getDataSource();
        hikariConfig3.setConnectionTestQuery("");
        hikariConfig3.setInitializationFailFast(false);
        long long9 = hikariConfig3.getConnectionTimeout();
        java.util.Properties properties10 = hikariConfig3.dataSourceProperties;
        hikariConfig0.dataSourceProperties = properties10;
        int int12 = hikariConfig0.getAcquireIncrement();
        java.lang.String str13 = hikariConfig0.getCatalog();
        javax.sql.DataSource dataSource14 = null;
        hikariConfig0.setDataSource(dataSource14);
        java.lang.String str16 = hikariConfig0.getConnectionCustomizerClassName();
        hikariConfig0.setJdbc4ConnectionTest(false);
        org.junit.Assert.assertNull(dataSource4);
// flaky:         org.junit.Assert.assertTrue("'" + long9 + "' != '" + 32L + "'", long9 == 32L);
        org.junit.Assert.assertNotNull(properties10);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNull(str16);
    }

    @Test
    public void test17495() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17495");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        java.lang.String str1 = hikariConfig0.getConnectionInitSql();
        long long2 = hikariConfig0.getLeakDetectionThreshold();
        hikariConfig0.leakDetectionThreshold = (-1);
        int int5 = hikariConfig0.acquireIncrement;
        long long6 = hikariConfig0.getIdleTimeout();
        java.lang.String str7 = hikariConfig0.getConnectionTestQuery();
        long long8 = hikariConfig0.idleTimeout;
        hikariConfig0.setAcquireRetries(0);
        hikariConfig0.setInitializationFailFast(false);
        boolean boolean13 = hikariConfig0.isAutoCommit();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
// flaky:         org.junit.Assert.assertTrue("'" + long6 + "' != '" + (-1L) + "'", long6 == (-1L));
        org.junit.Assert.assertNull(str7);
// flaky:         org.junit.Assert.assertTrue("'" + long8 + "' != '" + (-1L) + "'", long8 == (-1L));
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
    }

    @Test
    public void test17496() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17496");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        javax.sql.DataSource dataSource1 = hikariConfig0.getDataSource();
        hikariConfig0.setConnectionTestQuery("");
        hikariConfig0.setInitializationFailFast(false);
        long long6 = hikariConfig0.getConnectionTimeout();
        hikariConfig0.setJdbcUrl("HikariPool-47");
        hikariConfig0.isIsolateInternalQueries = false;
        hikariConfig0.setIsolateInternalQueries(true);
        java.lang.String str13 = hikariConfig0.getJdbcUrl();
        hikariConfig0.isIsolateInternalQueries = false;
        java.lang.String str16 = hikariConfig0.getPoolName();
        hikariConfig0.connectionInitSql = "HikariPool-814";
        hikariConfig0.setInitializationFailFast(false);
        org.junit.Assert.assertNull(dataSource1);
// flaky:         org.junit.Assert.assertTrue("'" + long6 + "' != '" + 32L + "'", long6 == 32L);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "HikariPool-47" + "'", str13, "HikariPool-47");
// flaky:         org.junit.Assert.assertEquals("'" + str16 + "' != '" + "HikariPool-42892" + "'", str16, "HikariPool-42892");
    }

    @Test
    public void test17497() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17497");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        javax.sql.DataSource dataSource1 = hikariConfig0.getDataSource();
        hikariConfig0.setConnectionTestQuery("");
        hikariConfig0.setInitializationFailFast(false);
        hikariConfig0.catalog = "";
        long long8 = hikariConfig0.getConnectionTimeout();
        boolean boolean9 = hikariConfig0.isJdbc4ConnectionTest();
        long long10 = hikariConfig0.connectionTimeout;
        org.junit.Assert.assertNull(dataSource1);
// flaky:         org.junit.Assert.assertTrue("'" + long8 + "' != '" + 32L + "'", long8 == 32L);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
// flaky:         org.junit.Assert.assertTrue("'" + long10 + "' != '" + 32L + "'", long10 == 32L);
    }

    @Test
    public void test17498() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17498");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        java.lang.String str1 = hikariConfig0.getConnectionInitSql();
        long long2 = hikariConfig0.getLeakDetectionThreshold();
        com.zaxxer.hikari.IConnectionCustomizer iConnectionCustomizer3 = null;
        hikariConfig0.connectionCustomizer = iConnectionCustomizer3;
        boolean boolean5 = hikariConfig0.isIsolateInternalQueries();
        hikariConfig0.poolName = "HikariPool-47";
        java.lang.String str8 = hikariConfig0.getCatalog();
        boolean boolean9 = hikariConfig0.isJdbc4connectionTest;
        hikariConfig0.isAutoCommit = true;
        hikariConfig0.isReadOnly = true;
        hikariConfig0.isJdbc4connectionTest = false;
        boolean boolean16 = hikariConfig0.isIsolateInternalQueries();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test17499() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17499");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        javax.sql.DataSource dataSource1 = hikariConfig0.getDataSource();
        hikariConfig0.setConnectionTestQuery("");
        hikariConfig0.connectionCustomizerClassName = "";
        hikariConfig0.setConnectionCustomizerClassName("hi!");
        java.lang.String str8 = hikariConfig0.getCatalog();
        boolean boolean9 = hikariConfig0.isRegisterMbeans;
        javax.sql.DataSource dataSource10 = hikariConfig0.dataSource;
        int int11 = hikariConfig0.maxPoolSize;
        int int12 = hikariConfig0.getTransactionIsolation();
        hikariConfig0.setDataSourceClassName("HikariPool-216");
        org.junit.Assert.assertNull(dataSource1);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(dataSource10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 60 + "'", int11 == 60);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
    }

    @Test
    public void test17500() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17500");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        javax.sql.DataSource dataSource1 = hikariConfig0.getDataSource();
        hikariConfig0.setConnectionTestQuery("");
        hikariConfig0.connectionCustomizerClassName = "";
        hikariConfig0.setConnectionCustomizerClassName("hi!");
        java.lang.String str8 = hikariConfig0.getCatalog();
        boolean boolean9 = hikariConfig0.isRegisterMbeans;
        int int10 = hikariConfig0.getMaximumPoolSize();
        java.lang.String str11 = hikariConfig0.poolName;
        long long12 = hikariConfig0.acquireRetryDelay;
        int int13 = hikariConfig0.transactionIsolation;
        hikariConfig0.maxLifetime = 5000L;
        java.lang.String str16 = hikariConfig0.getJdbcUrl();
        hikariConfig0.setAcquireRetries((int) (short) 0);
        java.lang.String str19 = hikariConfig0.getConnectionTestQuery();
        org.junit.Assert.assertNull(dataSource1);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 60 + "'", int10 == 60);
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "HikariPool-42896" + "'", str11, "HikariPool-42896");
// flaky:         org.junit.Assert.assertTrue("'" + long12 + "' != '" + 100L + "'", long12 == 100L);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
    }
}
